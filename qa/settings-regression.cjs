// npm install --no-save jsdom, then node qa/settings-regression.cjs [HTML]
const fs = require('node:fs');
const path = require('node:path');
const assert = require('node:assert/strict');
const {JSDOM, VirtualConsole} = require('jsdom');
const file = process.argv[2] || path.join(__dirname, '..', 'Hunter_Field_Guide_World_Iceborne.html');
const errors = [];
const virtualConsole = new VirtualConsole();
virtualConsole.on('jsdomError', error => {
  if (!String(error.message).includes('Not implemented')) errors.push(error);
});
const dom = new JSDOM(fs.readFileSync(file, 'utf8'), {
  url: 'https://field-book.test/', runScripts: 'dangerously', pretendToBeVisual: true,
  virtualConsole,
  beforeParse(window) {
    window.matchMedia = query => ({matches: query.includes('prefers-reduced-motion'), media: query,
      addEventListener(){}, removeEventListener(){}, addListener(){}, removeListener(){}});
    window.CSS = {escape: value => String(value).replace(/[^a-zA-Z0-9_-]/g, char => '\\'+char), supports: () => false};
    window.HTMLElement.prototype.scrollIntoView = function(){};
    window.HTMLElement.prototype.scrollTo = function(){};
    window.HTMLDialogElement.prototype.showModal = function(){this.open = true;};
    window.HTMLDialogElement.prototype.close = function(){this.open = false; this.dispatchEvent(new window.Event('close'));};
  }
});
const tick = () => new Promise(resolve => setTimeout(resolve, 50));
(async () => {
  await tick();
  const {document} = dom.window;
  document.getElementById('settingsOpen').click(); await tick();
  const dialog = document.getElementById('settingsDialog');
  assert.equal(dialog.open, true, 'Settings opens');
  const assertClosed = () => {
    const groups = [...dialog.querySelectorAll('details')];
    assert.ok(groups.length > 0, 'Settings category contains expandable groups');
    for (const group of groups) {
      assert.equal(group.open, false, group.querySelector('summary').textContent+' starts collapsed');
      assert.notEqual(group.dataset.expanded, 'true');
    }
  };
  assertClosed();
  const gradient = dialog.querySelector('[data-fold-key="settings-gradients"]');
  const profiles = dialog.querySelector('[data-fold-key="settings-visual-profiles"]');
  assert.equal(gradient.nextElementSibling, profiles);
  assert.equal(dom.window.getComputedStyle(gradient).marginBottom,
    dom.window.getComputedStyle(dialog.querySelector('[data-fold-key="settings-themes"]')).marginBottom,
    'Gradient box has the same bottom gap as its peers');
  assert.notEqual(dom.window.getComputedStyle(gradient).marginBottom, '0px');
  gradient.querySelector('summary').click(); await tick();
  assert.equal(gradient.dataset.expanded, 'true', 'Group still opens on demand');
  dialog.querySelector('[data-close="settingsDialog"]').click(); await tick();
  document.getElementById('settingsOpen').click(); await tick();
  assertClosed();
  for (const category of ['motion', 'browsing', 'data', 'appearance']) {
    dialog.querySelector('[data-settings-tab="'+category+'"]').click(); await tick();
    assertClosed();
  }
  assert.equal(errors.length, 0, errors.map(error => error.stack).join('\n'));
  console.log('Settings regression passed: initial state, reopen, categories, spacing and manual expansion.');
  dom.window.close();
})().catch(error => { console.error(error); dom.window.close(); process.exitCode = 1; });
