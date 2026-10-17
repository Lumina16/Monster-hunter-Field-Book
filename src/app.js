'use strict';
(()=>{
const D=JSON.parse(document.getElementById('guide-data').textContent), $=id=>document.getElementById(id);
const E=s=>String(s??'').replace(/[&<>"']/g,c=>({'&':'&amp;','<':'&lt;','>':'&gt;','"':'&quot;',"'":'&#39;'}[c]));
const icons={settings:'<path d="m10 3-.6 2.2-2 .9L5.3 5.5 3 9.5l1.6 1.5v2L3 14.5l2.3 4 2.1-.6 2 .9.6 2.2h4l.6-2.2 2-.9 2.1.6 2.3-4-1.6-1.5v-2L21 9.5l-2.3-4-2.1.6-2-.9L14 3Z"/><circle cx="12" cy="12" r="3"/>',up:'<path d="m6 14 6-6 6 6"/>',down:'<path d="m6 10 6 6 6-6"/>',trash:'<path d="M4 6h16M9 6V3h6v3M6 6l1 15h10l1-15M10 10v7M14 10v7"/>',search:'<circle cx="10.5" cy="10.5" r="6.5"/><path d="m16 16 5 5"/>',bookmark:'<path d="M6 3h12v18l-6-4-6 4Z"/>',close:'<path d="m6 6 12 12M18 6 6 18"/>',arrow:'<path d="M4 12h15m-6-6 6 6-6 6"/>',music:'<path d="M9 18V5l11-2v13M9 8l11-2"/><ellipse cx="6" cy="18" rx="3" ry="2"/><ellipse cx="17" cy="16" rx="3" ry="2"/>',play:'<path d="m9 5 11 7-11 7Z"/>',pause:'<path d="M8 5v14M16 5v14"/>',volume:'<path d="M11 5 6 9H3v6h3l5 4Zm4 3c3 2 3 6 0 8m3-11c5 4 5 10 0 14"/>',repeat:'<path d="M4 8h13l-3-3m3 3-3 3M20 16H7l3-3m-3 3 3 3M20 8v4M4 16v-4"/>',shield:'<path d="m12 3 8 3v6c0 5-8 9-8 9s-8-4-8-9V6Z"/>',check:'<path d="m5 12 4 4L20 5"/>',book:'<path d="M12 6c-3-3-7-3-10-2v15c4-1 7-1 10 2 3-3 6-3 10-2V4c-3-1-7-1-10 2Zm0 0v15"/>',compass:'<circle cx="12" cy="12" r="9"/><path d="m16 8-3 5-5 3 3-5Z"/>',sword:'<path d="m6 18 11-14 4-1-1 4L8 20M4 15l7 6M3 21l4-4"/>',snow:'<path d="M12 2v20M3.3 7l17.4 10M3.3 17 20.7 7M9 4l3 3 3-3M9 20l3-3 3 3M3 10l4-1-1-4M21 14l-4 1 1 4M3 14l4 1-1 4M21 10l-4-1 1-4"/>'};
const icon=(n)=>`<svg viewBox="0 0 24 24" aria-hidden="true">${icons[n]||icons.book}</svg>`;
function paintIcons(root=document){root.querySelectorAll('[data-icon]').forEach(el=>el.innerHTML=icon(el.dataset.icon));refreshMotion(root);}
const navs=[['overview','Overview'],['bestiary','Bestiary'],['weapons','Weapons'],['equipment','Equipment'],['notes','Field notes'],['preparation','Item libraries'],['locales','Locales'],['progression','Speedrun']];
const KEY='hunter-field-guide-v1';let storage=true,prefs={};try{prefs=JSON.parse(localStorage.getItem(KEY)||'{}')||{};}catch{storage=false;}
const speedrunPrefs=Object.fromEntries(['world','iceborne'].map(game=>[game,{tasks:{...(prefs.speedrun?.[game]?.tasks||{})},expanded:{...(prefs.speedrun?.[game]?.expanded||{})}}]));
const musicPrefs={paused:prefs.music?.paused===true,volume:typeof prefs.music?.volume==='number'?Math.max(0,Math.min(1,prefs.music.volume)):.25,loop:prefs.music?.mode==='one',mode:['one','library','shuffle'].includes(prefs.music?.mode)?prefs.music.mode:'library',shuffleQueue:Array.isArray(prefs.music?.shuffleQueue)?prefs.music.shuffleQueue:[],shufflePlayed:Array.isArray(prefs.music?.shufflePlayed)?prefs.music.shufflePlayed:[],trackId:typeof prefs.music?.trackId==='string'?prefs.music.trackId:'world',positions:{},order:Array.isArray(prefs.music?.order)?prefs.music.order.filter(x=>typeof x==='string'):[],hiddenBuiltIns:Array.isArray(prefs.music?.hiddenBuiltIns)?prefs.music.hiddenBuiltIns.filter(x=>typeof x==='string'):[]};
const appearancePrefs={theme:typeof prefs.appearance?.theme==='string'?prefs.appearance.theme:'game',lineHeight:Math.max(1.2,Math.min(2,Number(prefs.appearance?.lineHeight)||1.6)),letterSpacing:Math.max(0,Math.min(.1,Number(prefs.appearance?.letterSpacing)||0)),wordSpacing:Math.max(0,Math.min(.25,Number(prefs.appearance?.wordSpacing)||0)),fontPt:Number.isFinite(prefs.appearance?.fontPt)?Math.max(5,Math.min(15,prefs.appearance.fontPt)):11,custom:{bg:'#0d1512',accent:'#d9b77a',text:'#eee9dc'}};
for(const k of ['bg','accent','text'])if(/^#[a-fA-F0-9]{6}$/.test(prefs.appearance?.custom?.[k]||''))appearancePrefs.custom[k]=prefs.appearance.custom[k];
for(const [k,v] of Object.entries(prefs.music?.positions||{}))if(/^[a-zA-Z0-9-]{1,100}$/.test(k)&&typeof v==='number'&&Number.isFinite(v)&&v>=0)musicPrefs.positions[k]=v;
const validMode=v=>['world','iceborne'].includes(v),validView=v=>navs.some(n=>n[0]===v);
const initial=location.hash.replace(/^#/,'').split('/');
const S={edition:validMode(initial[0])?initial[0]:validMode(prefs.edition)?prefs.edition:D.defaultEdition||'world',view:validView(initial[1])?initial[1]:validView(prefs.view)?prefs.view:'overview',saved:Array.isArray(prefs.saved)?prefs.saved.filter(x=>typeof x==='string'):[],checks:prefs.checks&&typeof prefs.checks==='object'?prefs.checks:{},monsterQ:'',monsterType:'all',monsterKind:'all',monsterScope:'new',monsterLimit:18,weaponKind:'all',noteCat:'all',noteQ:'',itemQ:'',skillQ:'',buildKind:'all',searchIndex:0};
// One clock for decorative motion. Music, Undo and gesture timing remain independent.
const bounded=(value,min,max,fallback)=>Number.isFinite(Number(value))?Math.max(min,Math.min(max,Number(value))):fallback;
const motionPrefs={speed:bounded(prefs.motion?.speed,0,100,50),lastSpeed:bounded(prefs.motion?.lastSpeed,1,100,50)};
const gradientPrefs={enabled:prefs.gradients?.enabled!==false,preset:['game','world','iceborne','custom'].includes(prefs.gradients?.preset)?prefs.gradients.preset:'game',strength:bounded(prefs.gradients?.strength,0,40,15),direction:bounded(prefs.gradients?.direction,0,360,135),a:/^#[a-f\d]{6}$/i.test(prefs.gradients?.a||'')?prefs.gradients.a:'#21412c',b:/^#[a-f\d]{6}$/i.test(prefs.gradients?.b||'')?prefs.gradients.b:'#d9b77a'};
const filterMemory=prefs.filters&&typeof prefs.filters==='object'&&!Array.isArray(prefs.filters)?prefs.filters:{};
const uiAnimations=new Set(),uiMotionTimers=new Map();
function motionScale(){const speed=motionPrefs.speed;return speed<=50?1+(50-speed)*.025:1-(speed-50)*.013;}
function motionDuration(ms){return reducedMotion()?0:Math.round(ms*motionScale());}
function animateUI(node,frames,options={}){
 if(!node||typeof node.animate!=='function')return null;
 const timing=typeof options==='number'?{duration:options}:{...options};
 for(const key of ['duration','delay','endDelay'])if(typeof timing[key]==='number')timing[key]=motionDuration(timing[key]);
 const animation=node.animate(frames,timing);uiAnimations.add(animation);
 animation.finished.then(()=>uiAnimations.delete(animation),()=>uiAnimations.delete(animation));return animation;
}
function motionLater(callback,ms){let id;id=setTimeout(()=>{uiMotionTimers.delete(id);callback();},motionDuration(ms));uiMotionTimers.set(id,callback);return id;}
function cancelMotionTimer(id){clearTimeout(id);uiMotionTimers.delete(id);}
function applyMotionPreferences(){
 const root=document.documentElement;root.dataset.animations=reducedMotion()?'off':'on';root.style.setProperty('--motion-scale',String(motionScale()));
 if(reducedMotion()){
  for(const animation of [...uiAnimations])try{animation.finish();}catch{animation.cancel();}
  for(const [id,callback] of [...uiMotionTimers]){cancelMotionTimer(id);callback();}
  document.querySelectorAll('.touch-ripple,.home-pulse-ring').forEach(node=>node.remove());releasePress();
 }
}
function setMotionSpeed(value){
 motionPrefs.speed=bounded(value,0,100,50);if(motionPrefs.speed>0)motionPrefs.lastSpeed=motionPrefs.speed;
 applyMotionPreferences();persist();
 const field=$('animationSpeed'),output=$('animationSpeedValue'),toggle=$('animationsEnabled');
 if(field)field.value=String(motionPrefs.speed);if(output)output.textContent=motionPrefs.speed===0?'Off':Math.round(motionPrefs.speed)+' / 100';if(toggle)toggle.checked=motionPrefs.speed>0;
}
const filterKeys=['rank','rarity','category','slot','compatible','element','obtain','game','sort','rewardMethod','type','scope','kind','family'];
function rememberFilters(key,model){
 const values={};for(const name of filterKeys)if(model[name]!==undefined&&(model[name]===null||['string','number','boolean'].includes(typeof model[name])))values[name]=model[name];
 filterMemory[key]=values;persist();
}
function recalledFilters(key){const values={},stored=filterMemory[key];if(stored&&typeof stored==='object')for(const name of filterKeys)if(stored[name]!==undefined&&(stored[name]===null||['string','number','boolean'].includes(typeof stored[name])))values[name]=stored[name];return values;}

// Versioned, bounded settings. Backups never contain external executable content or music files.
const preferenceClone=value=>JSON.parse(JSON.stringify(value));
const enumValue=(value,choices,fallback)=>choices.includes(value)?value:fallback;
const validHex=value=>typeof value==='string'&&/^#[a-f\d]{6}$/i.test(value);
function normaliseGuideSettings(input={}){
 const value=input&&typeof input==='object'&&!Array.isArray(input)?input:{};
 const settings={density:enumValue(value.density,['compact','comfortable'],'compact'),iconSize:bounded(value.iconSize,75,140,100),performance:enumValue(value.performance,['full','light'],'full'),transition:enumValue(value.transition,['liquid','fade','slide','zoom','none'],'liquid'),effects:{touch:enumValue(value.effects?.touch,['ripple','halo','glow','sparks','none'],'ripple'),glow:value.effects?.glow!==false,particles:value.effects?.particles!==false,blur:value.effects?.blur!==false,imageMotion:value.effects?.imageMotion!==false},grid:{columns:value.grid?.columns==='auto'||value.grid?.columns==null?'auto':Math.round(bounded(value.grid.columns,1,6,1)),rows:Math.round(bounded(value.grid?.rows,1,8,6))},startup:{mode:enumValue(value.startup?.mode,['last','overview','section'],'last'),view:validView(value.startup?.view)?value.startup.view:'bestiary',edition:enumValue(value.startup?.edition,['last','world','iceborne'],'last')},folds:{single:value.folds?.single===true,remember:value.folds?.remember!==false},rememberPosition:value.rememberPosition!==false,sorts:{resources:enumValue(value.sorts?.resources,['name','rarity','rarity-desc'],'name'),weapons:enumValue(value.sorts?.weapons,['source','name','rarity','attack'],'source'),equipment:enumValue(value.sorts?.equipment,['source','name','rarity','defence'],'source'),monsters:enumValue(value.sorts?.monsters,['source','name','class'],'source')},positions:{},foldStates:{}};
 for(const [key,position] of Object.entries(value.positions||{}))if(/^(world|iceborne)\/(overview|bestiary|weapons|equipment|notes|preparation|locales|progression)$/.test(key))settings.positions[key]=bounded(position,0,1000000,0);
 for(const [key,open] of Object.entries(value.foldStates||{}).slice(-1000))if(key.length<=500&&!['__proto__','constructor','prototype'].includes(key)&&typeof open==='boolean')settings.foldStates[key]=open;
 return settings;
}
const guidePrefs=normaliseGuideSettings(prefs.settings),visualProfiles=Array.isArray(prefs.visualProfiles)?prefs.visualProfiles.filter(profile=>profile&&typeof profile.name==='string'&&/^[a-z0-9-]{1,80}$/i.test(profile.id||'')).slice(0,12).map(profile=>preferenceClone(profile)):[];
let filterPreferenceGeneration=0;
function contentPreferenceStamp(){return JSON.stringify({grid:guidePrefs.grid,sorts:guidePrefs.sorts,filters:filterPreferenceGeneration});}
function transitionsDisabled(){return reducedMotion()||guidePrefs.transition==='none';}
function transitionFrames(opening=true,kind='content',start={}){
 const mode=guidePrefs.transition,opacity=start.opacity??1,filter=start.filter||'blur(0)';
 if(mode==='slide')return opening?[{opacity:0,transform:'translateY(12px)'},{opacity:1,transform:'none'}]:[{opacity,transform:'none'},{opacity:0,transform:'translateY(10px)'}];
 if(mode==='zoom')return opening?[{opacity:0,transform:'scale(.97)'},{opacity:1,transform:'scale(1)'}]:[{opacity,transform:'scale(1)'},{opacity:0,transform:'scale(.97)'}];
 if(mode==='fade'||mode==='none')return opening?[{opacity:0},{opacity:1}]:[{opacity},{opacity:0}];
 if(kind==='panel')return opening?[{opacity:.2,clipPath:'inset(0 0 100% 0 round 5px)'},{opacity:1,clipPath:'inset(0 round 5px)'}]:[{opacity,clipPath:'inset(0 round 5px)'},{opacity:0,clipPath:'inset(0 0 100% 0 round 5px)'}];
 return opening?[{opacity:.25,filter:'blur(5px)'},{opacity:1,filter:'blur(0)'}]:[{opacity,filter},{opacity:.25,filter:'blur(5px)'}];
}
function bestiaryWidth(){return $('monsterGrid')?.clientWidth||$('view-bestiary')?.clientWidth||(window.innerWidth||390)*.92;}
function bestiaryColumns(){
 if(guidePrefs.grid.columns!=='auto')return guidePrefs.grid.columns;
 return Math.min(3,Math.max(1,Math.floor((bestiaryWidth()+14)/274)));
}
function bestiaryBatchSize(){return bestiaryColumns()*guidePrefs.grid.rows;}
function applyGuidePreferences(){
 const root=document.documentElement,light=guidePrefs.performance==='light';
 root.dataset.density=guidePrefs.density;root.dataset.transition=guidePrefs.transition;root.dataset.performance=guidePrefs.performance;root.dataset.touchEffect=guidePrefs.effects.touch;
 for(const [key,value] of Object.entries(guidePrefs.effects))if(key!=='touch')root.dataset['effect'+key[0].toUpperCase()+key.slice(1)]=String(value&&!light);
 const columns=bestiaryColumns(),gap=columns>3?6:columns===3?9:14,cardWidth=(bestiaryWidth()-(columns-1)*gap)/columns;
 root.dataset.bestiaryLayout=cardWidth<110?'mini':cardWidth<170?'compact':'full';
 root.style.setProperty('--icon-scale',String(guidePrefs.iconSize/100));root.style.setProperty('--bestiary-columns',String(columns));root.style.setProperty('--bestiary-gap',gap+'px');
}

let previousFocus=null,searchHits=[],toastTimer=0,audioMode=null;const audioPositions={...musicPrefs.positions};
const edition=()=>D.editions[S.edition];
const inMode=g=>g.game==='both'||g.game===S.edition;
const removedMR=new Set(['ancient-leshen','behemoth','leshen','nergigante','vaal-hazak','xenojiiva','xeno-jiiva','zorah-magdaros']);
const monAll=()=>D.monsters.filter(m=>S.edition==='world'?m.game==='world':!removedMR.has(m.id)&&!['Xeno\'jiiva','Zorah Magdaros','Nergigante','Vaal Hazak','Leshen','Ancient Leshen','Behemoth'].includes(m.name));
function monScope(){let a=monAll();if(S.edition==='iceborne'&&S.monsterScope!=='all')a=a.filter(m=>S.monsterScope==='new'?m.game==='iceborne':m.game==='world');return a;}
const img=(key)=>D.assets[key]||'';
function persist(){try{localStorage.setItem(KEY,JSON.stringify({edition:S.edition,view:S.view,saved:S.saved,checks:S.checks,music:musicPrefs,appearance:appearancePrefs,speedrun:speedrunPrefs,motion:motionPrefs,gradients:gradientPrefs,filters:filterMemory,settings:guidePrefs,visualProfiles}));storage=true;}catch{storage=false;}}
function toast(t){clearTimeout(toastTimer);$('toast').textContent=t;$('toast').classList.add('show');toastTimer=setTimeout(()=>$('toast').classList.remove('show'),2600);}
const pill=(t,c='')=>`<span class="pill ${c}">${E(t)}</span>`;
const list=a=>`<ul>${a.map(t=>`<li>${E(t)}</li>`).join('')}</ul>`;
const saved=k=>S.saved.includes(k);
function saveButton(k,extra=''){return `<button type="button" class="icon-btn bookmark ${saved(k)?'active':''} ${extra}" data-save="${E(k)}" aria-label="${saved(k)?'Remove saved entry':'Save entry'}" aria-pressed="${saved(k)}">${icon('bookmark')}</button>`;}
function syncSaved(){document.querySelectorAll('[data-save]').forEach(b=>{const on=saved(b.dataset.save);b.classList.toggle('active',on);b.setAttribute('aria-pressed',String(on));b.setAttribute('aria-label',on?'Remove saved entry':'Save entry');});$('savedCount').textContent=S.saved.length;}
function toggleSave(k){if(saved(k))S.saved=S.saved.filter(x=>x!==k);else S.saved.push(k);persist();syncSaved();if($('savedDialog').open)renderSaved($('savedPickerSearch')?.value||'');toast(saved(k)?storage?'Added to your field journal':'Saved for this session':'Removed from your field journal');}
function sourceLink(u,text='Open reference ↗'){return `<a href="${E(u)}" target="_blank" rel="noopener noreferrer">${text}</a>`;}
function intro(eyebrow,title,text){return `<div class="page-intro"><p class="eyebrow">${E(eyebrow)}</p><h1>${E(title)}</h1></div>`;}
function heading(eyebrow,title,link,view){return `<div class="chapter-heading"><div><p class="eyebrow">${E(eyebrow)}</p><h2>${E(title)}</h2></div>${link?`<button class="text-btn" data-nav="${view}">${E(link)} ${icon('arrow')}</button>`:''}</div>`;}
function monsterCard(m,index=0){return `<article class="monster-card">${saveButton('monster:'+m.id)}<button class="monster-open" data-open-monster="${m.id}" aria-label="Open ${E(m.name)} profile"><div class="monster-visual"><img src="${E(m.image)}" alt="${E(m.name)} — official game artwork" loading="lazy" width="320" height="185"></div><div class="card-info"><span class="classification">${E(m.class)}</span><h3>${E(m.name)}</h3><div class="pill-row">${pill(m.capture?'Capturable':'Slay objective',m.elder?'accent':'')}${S.edition==='iceborne'?pill(m.game==='iceborne'?'Iceborne addition':'Returning monster'):pill(m.habitats[0]||'Special arena')}</div></div></button></article>`;}
function checkKey(key){return !!S.checks[S.edition]?.[key];}
function check(key,text){return `<label class="check-item"><input type="checkbox" data-check="${E(key)}" ${checkKey(key)?'checked':''}><span>${E(text)}</span></label>`;}
function campChecklist(){const done=D.checklist.filter((_,i)=>checkKey('camp:'+i)).length;return `<div class="check-panel"><p class="eyebrow">BEFORE YOU DEPART</p><h3>Ready for the hunt?</h3><p>A small routine. A better hunt.</p>${D.checklist.map((t,i)=>check('camp:'+i,t)).join('')}<div class="check-footer"><span data-camp-count>${done} / ${D.checklist.length} prepared</span><button class="text-btn" data-reset-camp>Reset</button></div></div>`;}
function renderOverview(){
 const e=edition(),featured=D.monsters.find(m=>m.id===e.featured[0]);
 $('view-overview').innerHTML=`<div class="home-stage"><div class="hero"><div class="particle-field" aria-hidden="true">${Array.from({length:14},(_,i)=>`<i style="--x:${(i*47+11)%100}%;--d:calc(${13+i%7}s * var(--motion-scale,1));--delay:calc(-${i*1.8}s * var(--motion-scale,1))"></i>`).join('')}</div><div class="hero-inner"><div class="hero-copy"><img class="hero-logo" src="${img(e.logo)}" alt="${E(e.fullName)} official logo" width="350" height="150"><h1>${e.headline}</h1><button class="home-search home-search-button" id="homeSearchButton" type="button" aria-haspopup="dialog" aria-controls="searchDialog" aria-label="Search"><span class="home-search-icon">${icon('search')}</span><span class="search-ripple" aria-hidden="true"></span></button></div><button class="home-monster" data-open-monster="${featured.id}" aria-label="Open ${E(featured.name)} profile"><img src="${E(featured.image)}" alt="${E(featured.name)} official render" width="400" height="280"><span class="eyebrow">FEATURED ENCOUNTER</span><strong>${E(featured.name)}</strong><small>Open field record ${icon('arrow')}</small></button></div></div></div>`;
}
function renderNavigation(){
 const sigils={overview:'compass',bestiary:'compass',weapons:'sword',progression:'arrow',equipment:'shield',notes:'book',preparation:'check',locales:'compass'};
 $('navItems').innerHTML=navs.map(([id,label])=>`<button type="button" data-nav="${id}" class="guide-menu-item ${id===S.view?'active':''}" ${id===S.view?'aria-current="page"':''}>${icon(sigils[id])}<span>${label}</span><span class="menu-item-arrow">${icon('arrow')}</span></button>`).join('');
 $('menuCurrent').textContent=(S.edition==='world'?'World':'Iceborne')+' · '+navs.find(n=>n[0]===S.view)[1];
 $('menuOpen').setAttribute('aria-label','Open navigation · '+navs.find(n=>n[0]===S.view)[1]);
}
let menuIsOpen=false,menuCloseTimer=0;
function closeGuideMenu(focus=false){toggleGuideMenu(false);if(focus)$('menuOpen').focus();}
function toggleGuideMenu(on,focus=false){
 const show=on===undefined?!menuIsOpen:!!on,p=$('guideMenu'),back=$('menuBackdrop');
 if(show===menuIsOpen)return;
 menuIsOpen=show;cancelMotionTimer(menuCloseTimer);
 if(show){p.hidden=false;back.hidden=false;p.inert=false;void p.offsetHeight;toggleMusicDock(false);}
 p.dataset.open=String(show);back.dataset.open=String(show);p.setAttribute('aria-hidden',String(!show));p.inert=!show;
 $('menuOpen').setAttribute('aria-expanded',String(show));
 if(!show){const finish=()=>{if(!menuIsOpen){p.hidden=true;back.hidden=true;}};menuCloseTimer=motionLater(finish,390);if(reducedMotion())finish();}
 else if(focus)($('navItems').querySelector('[aria-current="page"]')||$('navItems').querySelector('button'))?.focus();
}

let searchOrigin=null,searchAnimation=null,searchClosing=false,searchMotionVersion=0;
function searchButtonRect(trigger){const el=trigger||(!document.body.classList.contains('is-home')?$('searchOpen'):$('homeSearchButton'));if(!el)return null;const r=el.getBoundingClientRect();return{left:r.left,top:r.top,width:r.width,height:r.height};}
function animateSearchOpen(trigger){
 const dialog=$('searchDialog'),version=++searchMotionVersion;searchClosing=false;dialog.inert=false;searchAnimation?.cancel();searchAnimation=null;
 searchOrigin=searchButtonRect(trigger)||searchOrigin;
 if(reducedMotion()||typeof dialog.animate!=='function'||!searchOrigin?.width)return;
 const r=dialog.getBoundingClientRect(),a=searchOrigin;if(!r.width||!r.height)return;
 searchAnimation=animateUI(dialog,[{transform:`translate(${a.left-r.left}px,${a.top-r.top}px) scale(${a.width/r.width},${a.height/r.height})`,borderRadius:'3px',opacity:.85},{transform:'translate(0,0) scale(1,1)',borderRadius:'5px',opacity:1}],{duration:420,easing:'cubic-bezier(.2,.75,.2,1)',fill:'both'});
 searchAnimation.finished.then(()=>{if(version===searchMotionVersion)dialog.inert=false;}).catch(()=>{});
}
function exitSearch(action){
 if(searchClosing)return;
 const dialog=$('searchDialog');if(!dialog.open||reducedMotion()||typeof dialog.animate!=='function'||!searchOrigin?.width){action();return;}
 searchClosing=true;dialog.inert=true;$('globalSearch').blur?.();const version=++searchMotionVersion;
 if(searchAnimation){try{searchAnimation.reverse();}catch{searchAnimation=null;}}
 if(!searchAnimation){const r=dialog.getBoundingClientRect(),a=searchOrigin;searchAnimation=animateUI(dialog,[{transform:'translate(0,0) scale(1,1)',opacity:1},{transform:`translate(${a.left-r.left}px,${a.top-r.top}px) scale(${a.width/r.width},${a.height/r.height})`,opacity:.1}],{duration:320,easing:'cubic-bezier(.3,0,.7,.3)',fill:'both'});}
 searchAnimation.finished.then(()=>{if(version!==searchMotionVersion)return;searchClosing=false;dialog.inert=false;searchAnimation?.cancel();searchAnimation=null;action();}).catch(()=>{if(version===searchMotionVersion){searchClosing=false;dialog.inert=false;action();}});
}
function openSearch(query='',trigger=null){closeGuideMenu();toggleMusicDock(false);openDialog('searchDialog');$('globalSearch').value=query;renderSearch();animateSearchOpen(trigger);nextFrame(()=>$('globalSearch').focus());}

function filterMonsterList(){return monScope().filter(m=>(!S.monsterQ||[m.name,m.class,...m.hazards,...m.habitats,m.elementHint].join(' ').toLowerCase().includes(S.monsterQ.toLowerCase()))&&(S.monsterType==='all'||m.class===S.monsterType)&&(S.monsterKind==='all'||S.monsterKind==='elder'&&m.elder||S.monsterKind==='capture'&&m.capture));}
function renderBestiary(){const types=[...new Set(monAll().map(m=>m.class))].sort();$('view-bestiary').innerHTML=`<div class="page-wrap">${intro(S.edition==='world'?'WORLD / ECOLOGICAL RESEARCH':'ICEBORNE / ECOLOGICAL RESEARCH','Know your quarry.','Real monster artwork, practical target priorities, elemental considerations, and the details that change a hunt.')}<div class="toolbar"><div class="filter-search"><input id="monsterSearch" value="${E(S.monsterQ)}" placeholder="Search name, habitat, element, or ailment…" aria-label="Search monsters"></div><select id="monsterType" aria-label="Monster classification"><option value="all">All classifications</option>${types.map(t=>`<option ${S.monsterType===t?'selected':''}>${E(t)}</option>`).join('')}</select>${S.edition==='iceborne'?`<select id="monsterScope" aria-label="Iceborne monster roster"><option value="new" ${S.monsterScope==='new'?'selected':''}>Iceborne additions (35)</option><option value="all" ${S.monsterScope==='all'?'selected':''}>All Master Rank targets (${monAll().length})</option><option value="returning" ${S.monsterScope==='returning'?'selected':''}>Returning World monsters</option></select>`:''}</div><div class="filter-chips">${[['all','All targets'],['elder','Elder Dragons'],['capture','Capturable']].map(([id,n])=>`<button class="filter-chip ${S.monsterKind===id?'active':''}" data-monster-kind="${id}">${n}</button>`).join('')}<button class="text-btn" data-reset-monsters>Reset filters</button></div><div class="results-meta"><span id="monsterCount"></span><span>Element and target priorities vary with weapon, part, and phase. Open a record for context.</span></div><div id="monsterGrid" class="monster-grid"></div><div id="monsterMore" class="load-more"></div></div>`;renderMonsterGrid();}
function renderMonsterGrid(){const a=filterMonsterList();$('monsterCount').textContent=`${a.length} records · ${S.edition==='world'?'World':S.monsterScope==='new'?'Iceborne additions':'Master Rank'}`;$('monsterGrid').innerHTML=a.length?a.slice(0,S.monsterLimit).map(monsterCard).join(''):'<div class="empty-state"><h3>No tracks found</h3><p>Try another name or reset the filters.</p></div>';$('monsterMore').innerHTML=a.length>S.monsterLimit?`<button class="secondary-btn" data-more-monsters>Show more records (${a.length-S.monsterLimit} remaining) ${icon('arrow')}</button>`:'';refreshMotion($('monsterGrid'));}
function weaponSigil(w){return `<span class="weapon-sigil"><img src="${img('weapon-'+w.id)}" alt="" width="38" height="38"></span>`;}
function renderWeapons(){$('view-weapons').innerHTML=`<div class="page-wrap">${intro(S.edition.toUpperCase()+' / WEAPON HANDBOOK','Find your hunting rhythm.','All fourteen weapon types. Learn a reliable loop, understand the tradeoffs, and choose skills that support how you actually hunt.')}<div class="filter-chips">${[['all','All 14 weapons'],['melee','Melee'],['ranged','Ranged']].map(([k,n])=>`<button class="filter-chip ${S.weaponKind===k?'active':''}" data-weapon-kind="${k}">${n}</button>`).join('')}</div>${S.edition==='iceborne'?'<div class="notice-strip"><strong>Iceborne additions included.</strong> Each guide separates the World foundation from the expansion’s new moves and example sequences.</div>':'<div class="notice-strip"><strong>The World foundation.</strong> These guides focus on base-game moves. Switch to Iceborne for Clutch Claw integrations and expansion moves.</div>'}<div class="weapon-grid">${D.weapons.filter(w=>S.weaponKind==='all'||(S.weaponKind==='ranged')===['bow','light-bowgun','heavy-bowgun'].includes(w.id)).map(w=>`<article class="weapon-card">${saveButton('weapon:'+w.id)}<div class="weapon-top">${weaponSigil(w)}<div><span class="weapon-category">${['bow','light-bowgun','heavy-bowgun'].includes(w.id)?'Ranged':'Melee'} discipline</span><h3>${E(w.name)}</h3></div></div><p>${E(w.short)}</p><div class="pill-row">${pill(w.complexity+' learning curve')}${pill(w.role.split('•')[0].trim())}</div><button class="weapon-expand" data-open-weapon="${w.id}">EXPAND</button></article>`).join('')}</div><p class="disclaimer">Learning curve describes resource and execution demands, not a damage ranking. Move names are platform-neutral; use the in-game control list for your device.</p></div>`;}
function renderProgression(){const arr=D.progress[S.edition],total=arr.reduce((n,x)=>n+x.tasks.length,0),done=arr.reduce((n,x)=>n+x.tasks.filter((t,i)=>checkKey('progress:'+x.id+':'+i)).length,0);$('view-progression').innerHTML=`<div class="page-wrap">${intro(S.edition.toUpperCase()+' / THE JOURNEY',S.edition==='world'?'A path through the New World.':'Your Master Rank expedition.','A practical sequence of goals. Check off the milestones you have completed and keep your next equipment decision in view.')}<div class="progress-top"><span data-progress-count>${done} / ${total} objectives</span><div class="progress-track" role="progressbar" aria-label="Progression objectives completed" aria-valuemin="0" aria-valuemax="${total}" aria-valuenow="${done}"><div class="progress-fill" style="width:${done/total*100}%"></div></div></div><div class="timeline">${arr.map((x,i)=>`<article class="milestone" data-progress-entry="${x.id}"><span class="milestone-num">${i+1}</span><div class="milestone-card"><p class="eyebrow">${E(x.rank)}</p><h3>${E(x.title)}</h3><p>${E(x.text)}</p><div class="milestone-tasks">${x.tasks.map((t,j)=>check('progress:'+x.id+':'+j,t)).join('')}</div></div></article>`).join('')}</div><div class="callout"><p class="eyebrow">CHOOSE YOUR NEXT GOAL</p><h3>${S.edition==='world'?'The expedition can go further.':'A clear unlock is better than a random grind.'}</h3><p>${S.edition==='world'?'Iceborne begins after the World campaign at HR 16, with the expansion installed. You can also stay in High Rank and pursue its special encounters.':'Read the smithy’s material recipe first, then choose the regional level and monster that supply it. Special assignments unlock different endgame paths.'}</p><div class="inline-actions">${S.edition==='world'?'<button class="primary-btn" data-switch-to="iceborne" data-switch-view="progression">Begin the Iceborne guide '+icon('arrow')+'</button><button class="secondary-btn" data-open-guide="world-endgame">High Rank endgame</button>':'<button class="primary-btn" data-open-guide="guiding-lands">Understand the Guiding Lands '+icon('arrow')+'</button><button class="secondary-btn" data-open-guide="augmenting">Plan augmentations</button>'}</div></div></div>`;}
function renderEquipment(){const b=D.builds.filter(inMode).filter(x=>S.buildKind==='all'||x.style===S.buildKind);$('view-equipment').innerHTML=`<div class="page-wrap">${intro(S.edition.toUpperCase()+' / THE WORKSHOP','Build with purpose.','Practical build directions and a searchable skill reference. These templates explain priorities; exact pieces depend on your weapon, unlocks, and decorations.')}<div class="filter-chips">${[['all','All templates'],['General','General & comfort'],['Raw','Raw / uptime'],['Element','Elemental']].map(([k,n])=>`<button class="filter-chip ${S.buildKind===k?'active':''}" data-build-kind="${k}">${n}</button>`).join('')}</div><div class="build-grid">${b.map(x=>`<article class="build-card"><p class="eyebrow">${E(x.label)}</p><h3>${E(x.name)}</h3><p>${E(x.text)}</p>${list(x.pieces)}<div class="pill-row">${x.skills.map(x=>pill(x,'accent')).join('')}</div><p class="build-note">${E(x.note)}</p></article>`).join('')}</div>${heading('SKILLS & SET BONUSES','Know what the skill does.')}<div class="filter-search"><input id="skillSearch" value="${E(S.skillQ)}" placeholder="Search a skill or effect…" aria-label="Search skills"></div><div id="skillTable" class="table-wrap" style="margin-top:16px"></div><p class="disclaimer">Descriptions are practical summaries. Read the equipped skill’s current level and conditions in-game; use the source database for complete level tables.</p></div>`;renderSkills();}
function renderSkills(){const a=D.skills.filter(x=>(S.edition==='iceborne'||x.type!=='Iceborne')&&(!S.skillQ||[x.name,x.type,x.text].join(' ').toLowerCase().includes(S.skillQ.toLowerCase())));$('skillTable').innerHTML=`<table><thead><tr><th>Skill / bonus</th><th>Purpose</th><th>Practical effect</th></tr></thead><tbody>${a.map(s=>`<tr><td>${E(s.name)}</td><td>${E(s.type)}</td><td>${E(s.text)}</td></tr>`).join('')||'<tr><td colspan="3">No matching skills.</td></tr>'}</tbody></table>`;}
function renderNotes(){const all=D.guides.filter(inMode),cats=[...new Set(all.map(g=>g.category))];if(S.noteCat!=='all'&&!cats.includes(S.noteCat))S.noteCat='all';$('view-notes').innerHTML=`<div class="page-wrap">${intro(S.edition.toUpperCase()+' / FIELD NOTES','A little knowledge. A better hunt.','From capture and crafting routines to encounter-specific preparation. Browse the field manuals or search for the problem you want to solve.')}<div class="filter-search"><input id="noteSearch" value="${E(S.noteQ)}" placeholder="Search hunting guides…" aria-label="Search field notes"></div><div class="filter-chips" style="margin-top:15px">${['all',...cats].map(c=>`<button class="filter-chip ${S.noteCat===c?'active':''}" data-note-cat="${E(c)}">${c==='all'?'All field notes':E(c)}</button>`).join('')}</div><div id="noteGrid" class="notes-grid"></div></div>`;renderNoteGrid();}
function renderNoteGrid(){const a=D.guides.filter(inMode).filter(g=>(S.noteCat==='all'||g.category===S.noteCat)&&(!S.noteQ||[g.title,g.summary,...g.sections.flatMap(s=>[s.title,s.text,...s.bullets])].join(' ').toLowerCase().includes(S.noteQ.toLowerCase())));$('noteGrid').innerHTML=a.length?a.map(g=>`<button class="note-card" data-open-guide="${g.id}"><span class="eyebrow">${E(g.category)}</span><h3>${E(g.title)}</h3><p>${E(g.summary)}</p><span class="card-arrow">Read field note ${icon('arrow')}</span></button>`).join(''):'<div class="empty-state">No matching field notes.</div>';}
function renderPreparation(){$('view-preparation').innerHTML=`<div class="page-wrap">${intro(S.edition.toUpperCase()+' / PREPARATION','Leave camp ready.','A repeatable checklist, useful crafting recipes, and preparation habits that keep a long hunt under control.')}<div class="prep-top">${campChecklist()}<div class="callout"><p class="eyebrow">YOUR POUCH IS PART OF THE BUILD</p><h3>Restock. Save. Repeat.</h3><p>Use a saved item loadout, then adapt it to the target. Bring a poison cure for venom, Nulberries for blights, and capture supplies only when the target and objective allow them.</p><ul><li>Bring ingredients to craft extra healing or key ammo.</li><li>Grow the ingredients you consume every session.</li><li>After fainting, restore health and stamina capacity before returning.</li></ul><div class="inline-actions"><button class="secondary-btn" data-open-guide="loadouts">Item loadouts</button><button class="secondary-btn" data-open-guide="ailments">Ailments & cures</button></div></div></div>${heading('CRAFTING QUICK REFERENCE','The essentials, at a glance.')}<div class="filter-search"><input id="itemSearch" value="${E(S.itemQ)}" placeholder="Search an item, ingredient, or use…" aria-label="Search crafting recipes"></div><div id="itemTable" class="table-wrap" style="margin-top:16px"></div><div class="notice-strip section-spacer"><strong>Keep these ready too.</strong> Nulberries for blights and effluvial health reduction; Adamant Seeds for Defense Down; Astera Jerky for bleeding; Rations or Well-done Steak for stamina. These are not all made through the recipes above.</div><p class="disclaimer">Selected useful recipes, not every crafting combination. Check the in-game crafting list for quantities, unlocks, and additional ammo/coating recipes.</p></div>`;renderItems();}
function renderItems(){const a=D.items.filter(inMode).filter(x=>!S.itemQ||[x.name,x.recipe,x.use].join(' ').toLowerCase().includes(S.itemQ.toLowerCase()));$('itemTable').innerHTML=`<table><thead><tr><th>Crafted item</th><th>Ingredients</th><th>Use in the field</th></tr></thead><tbody>${a.map(x=>`<tr><td>${E(x.name)}</td><td>${E(x.recipe)}</td><td>${E(x.use)}</td></tr>`).join('')||'<tr><td colspan="3">No matching recipes.</td></tr>'}</tbody></table>`;}
let localeState=null;
const localeTabs=[['map','Map & routes'],['resources','Resources'],['secrets','Discoveries'],['quests','Quests & lore']];
const localeReference=x=>'';
function renderLocales(){
 const a=D.locales.filter(x=>S.edition==='iceborne'||x.game==='world');
 $('view-locales').innerHTML=`<div class="page-wrap">${intro(S.edition.toUpperCase()+' / THE NEW WORLD','Learn the land you hunt.','Open a locale for original game maps, gathering locations, camp unlocks, rare discoveries, and quests worth finding.')}<div class="locale-grid">${a.map(x=>`<article class="locale-card"><button class="locale-img locale-cover-button" data-open-locale="${x.id}" aria-label="Explore ${E(x.name)} map guide" style="--locale-image:url('${img('locale-'+x.id)||img(edition().background)}')"><span class="eyebrow">${E(x.tag)}</span></button><div class="locale-content"><h3><button class="locale-title-button" data-open-locale="${x.id}">${E(x.name)}</button></h3><p>${E(x.text)}</p><div class="locale-counts">${pill((x.maps?.length||0)+' map layers')}${pill((x.gathering?.length||0)+' resources')}${pill((x.secrets?.length||0)+' discoveries')}</div><div class="locale-tip"><p>${E(x.tip)}</p></div><div class="filter-chips">${x.monsters.map(n=>{const m=D.monsters.find(m=>m.name===n);return m?`<button class="filter-chip" data-open-monster="${m.id}">${E(n)}</button>`:''}).join('')}</div></div></article>`).join('')}</div><p class="disclaimer">Area numbers refer to the original game maps. Gathering points and encounters can vary with rank, quest conditions, and regional level.</p></div>`;
}
function openLocale(id,options={}){
 const l=D.locales.find(x=>x.id===id);if(!l)return;
 if(l.game==='iceborne'&&S.edition!=='iceborne')navigate('iceborne','locales');
 localeState={id,tab:localeTabs.some(t=>t[0]===options.tab)?options.tab:'map',map:0,zoom:1,x:0,y:0,resourceQ:options.query||''};
 $('detailDialog').classList.add('locale-dialog');
 $('detailBody').innerHTML=`<article class="locale-detail"><header class="locale-detail-hero"><img src="${img('locale-'+id)}" alt="${E(l.name)} — game screenshot" width="1100" height="250"><div><p class="eyebrow">${l.game.toUpperCase()} / LOCALE FIELD GUIDE</p><h2>${E(l.name)}</h2><p>${E(l.overview||l.text)}</p><div class="pill-row">${pill((l.camps?.length||0)+' camps','accent')}${pill((l.gathering?.length||0)+' resource entries')}${pill((l.secrets?.length||0)+' discoveries')}</div></div></header><div class="locale-tabs" role="tablist" aria-label="Locale guide sections">${localeTabs.map(([tab,label])=>`<button role="tab" id="locale-tab-${tab}" aria-controls="localePanel" aria-selected="${localeState.tab===tab}" tabindex="${localeState.tab===tab?'0':'-1'}" data-locale-tab="${tab}">${label}</button>`).join('')}</div><div id="localePanel" class="locale-panel" role="tabpanel"></div></article>`;
 renderLocalePanel();openDialog('detailDialog');
 if(options.focus)nextFrame(()=>{const target=document.querySelector(`[data-locale-fact="${options.focus}"]`);target?.classList.add('search-highlight');target?.scrollIntoView?.({block:'center',behavior:reducedMotion()?'instant':'smooth'});});
 $('detailBody').querySelector('.locale-tabs').onkeydown=e=>{
  const current=localeTabs.findIndex(t=>t[0]===localeState.tab);let i=current;
  if(e.key==='ArrowRight')i=(i+1)%localeTabs.length;else if(e.key==='ArrowLeft')i=(i+localeTabs.length-1)%localeTabs.length;else if(e.key==='Home')i=0;else if(e.key==='End')i=localeTabs.length-1;else return;
  e.preventDefault();setLocaleTab(localeTabs[i][0]);$('locale-tab-'+localeTabs[i][0]).focus();
 };
}
function setLocaleTab(tab){
 if(!localeState||!localeTabs.some(x=>x[0]===tab)||localeState.tab===tab)return;
 localeState.tab=tab;document.querySelectorAll('[data-locale-tab]').forEach(b=>{const on=b.dataset.localeTab===tab;b.setAttribute('aria-selected',String(on));b.tabIndex=on?0:-1;});
 blurPanel($('localePanel'),()=>renderLocalePanel());
}
const panelAnimations=new WeakMap();
function blurPanel(panel,replace){
 if(!panel)return;const old=panelAnimations.get(panel);old?.animation?.cancel();
 const state={};panelAnimations.set(panel,state);
 if(reducedMotion()||typeof panel.animate!=='function'){replace();return;}
 const out=animateUI(panel,[{opacity:1,filter:'blur(0)'},{opacity:.12,filter:'blur(7px)'}],{duration:140,fill:'forwards',easing:'ease-in'});state.animation=out;
 out.finished.then(()=>{if(panelAnimations.get(panel)!==state||!panel.isConnected)return;replace();out.cancel();const incoming=animateUI(panel,[{opacity:.12,filter:'blur(7px)'},{opacity:1,filter:'blur(0)'}],{duration:230,easing:'ease-out'});state.animation=incoming;incoming.finished.catch(()=>{});}).catch(()=>{});
}

function renderLocalePanel(){
 if(!localeState)return;const l=D.locales.find(x=>x.id===localeState.id),s=localeState,p=$('localePanel');
 p.setAttribute('aria-labelledby','locale-tab-'+s.tab);p.dataset.tab=s.tab;
 if(s.tab==='map'){
  const maps=l.maps||[],m=maps[s.map]||maps[0];
  p.innerHTML=`<section class="locale-map-section"><div class="locale-section-heading"><div><p class="eyebrow">ORIGINAL GAME CARTOGRAPHY</p><h3>Find your bearings.</h3></div></div>${m?`<div class="map-toolbar"><label for="localeMapLayer">Map layer<select id="localeMapLayer">${maps.map((x,i)=>`<option value="${i}" ${s.map===i?'selected':''}>${E(x.title)}</option>`).join('')}</select></label></div><div id="localeMapViewport" class="map-viewport" role="group" tabindex="0" aria-label="${E(l.name)} map. Pinch to zoom and drag to pan. Arrow keys pan; zero resets."><img id="localeMapImage" src="${E(m.image)}" alt="${E(l.name+' — '+m.title)}" width="${m.width||1600}" height="${m.height||1600}" draggable="false"><div class="map-zoom-controls"><output id="mapZoomValue" aria-live="polite">100%</output><button class="text-btn" data-map-zoom="reset">Reset</button></div></div>`:'<p class="quiet">Map imagery is unavailable for this locale.</p>'}</section><div class="locale-subgrid"><section><div class="locale-section-heading"><div><p class="eyebrow">ESTABLISH YOUR BASE</p><h3>Camps & unlocks</h3></div></div><div class="locale-fact-stack">${(l.camps||[]).map((c,i)=>`<article class="locale-fact camp-fact" data-locale-fact="camp-${i}"><div class="locale-fact-title"><h4>${E(c.name)}</h4>${pill('Area '+c.area,'accent')}</div><p>${E(c.unlock)}</p>${localeReference(c)}</article>`).join('')}</div></section><section><div class="locale-section-heading"><div><p class="eyebrow">PLAN A SMALL EXPEDITION</p><h3>Suggested routes</h3></div></div><div class="locale-fact-stack">${(l.routes||[]).map((r,i)=>`<article class="locale-fact" data-locale-fact="route-${i}"><h4>${E(r.title)}</h4><ol>${(r.steps||[]).map(t=>`<li>${E(t)}</li>`).join('')}</ol>${localeReference(r)}</article>`).join('')}</div><div class="advice-box locale-field-note"><p class="eyebrow">FIELD NOTE</p><p>${E(l.tip)}</p></div>${l.id==='guiding-lands-map'?'<button class="text-btn" data-open-guide="guiding-lands">Read regional progression guide ↗</button>':''}</section></div>`;
  if(m)bindLocaleMap();
 }else if(s.tab==='resources'){
  p.innerHTML=`<div class="locale-section-heading"><div><p class="eyebrow">GATHER WITH A PURPOSE</p><h3>Resources & item locations</h3></div></div><label class="filter-search locale-resource-search"><input id="localeResourceSearch" placeholder="Find an item, node, or area…" value="${E(s.resourceQ)}" aria-label="Search this locale’s resources"></label><p class="locale-section-note">Area references are starting points for a gathering route. Read each entry’s rank and condition notes before setting out.</p><div id="localeResources" class="locale-fact-grid"></div>`;renderLocaleResources();
 }else if(s.tab==='secrets'){
  p.innerHTML=`<div class="locale-section-heading"><div><p class="eyebrow">LOOK BEYOND THE HUNT</p><h3>Discoveries & hidden gems</h3></div></div><p class="locale-section-note">Rare endemic life is not guaranteed. Conditions below describe where and when to look; return on another expedition if it does not appear.</p><div class="locale-fact-grid">${(l.secrets||[]).map((x,i)=>`<article class="locale-fact discovery-fact" data-locale-fact="secret-${i}"><span class="discovery-index">DISCOVERY ${String(i+1).padStart(2,'0')}</span><h4>${E(x.title)}</h4><dl><dt>Where</dt><dd>${E(x.where)}</dd><dt>How to find it</dt><dd>${E(x.how)}</dd>${x.reward?`<dt>What you get</dt><dd>${E(x.reward)}</dd>`:''}${x.conditions?`<dt>Conditions</dt><dd>${E(x.conditions)}</dd>`:''}</dl>${localeReference(x)}</article>`).join('')}</div>`;
 }else{
  p.innerHTML=`<div class="locale-section-heading"><div><p class="eyebrow">THE LAND HAS MORE TO GIVE</p><h3>Quests & useful unlocks</h3></div></div><div class="locale-fact-grid">${(l.quests||[]).map((x,i)=>`<article class="locale-fact" data-locale-fact="quest-${i}"><div class="pill-row">${pill(x.rank,'accent')}</div><h4>${E(x.name)}</h4><dl><dt>Access & objective</dt><dd>${E(x.unlock)}</dd><dt>Reward / unlock</dt><dd>${E(x.reward)}</dd></dl>${localeReference(x)}</article>`).join('')}</div><div class="locale-section-heading locale-lore-heading"><div><p class="eyebrow">ECOLOGY & SMALL DETAILS</p><h3>Know the place.</h3></div></div><div class="locale-fact-grid">${(l.trivia||[]).map((x,i)=>`<article class="locale-fact lore-fact" data-locale-fact="lore-${i}"><h4>${E(x.title)}</h4><p>${E(x.text)}</p>${localeReference(x)}</article>`).join('')}</div>`;
 }
 paintIcons(p);
}
function renderLocaleResources(){
 if(!localeState||!$('localeResources'))return;const l=D.locales.find(x=>x.id===localeState.id),terms=localeState.resourceQ.toLowerCase().trim().split(/\s+/).filter(Boolean),rows=(l.gathering||[]).map((x,i)=>({x,i})).filter(({x})=>terms.every(q=>factText(x).toLowerCase().includes(q)));
 $('localeResources').innerHTML=rows.length?rows.map(({x,i})=>`<article class="locale-fact resource-fact" data-locale-fact="gathering-${i}"><span class="eyebrow">${E(x.type)}</span><h4>${E(x.name)}</h4><div class="locale-area-list">${(x.areas||[]).map(a=>pill(/^\d+$/.test(String(a))?'Area '+a:a,'accent')).join('')}</div><p>${E(x.notes)}</p>${localeReference(x)}</article>`).join(''):'<div class="empty-state"><h3>No gathering tracks found.</h3><p>Try another item or area number.</p></div>';
}
function bindLocaleMap(){
 const s=localeState,l=D.locales.find(x=>x.id===s.id),view=$('localeMapViewport'),layer=$('localeMapLayer');
 layer.onchange=()=>{const i=+layer.value;if(!l.maps[i])return;s.map=i;s.zoom=1;s.x=s.y=0;const m=l.maps[i],image=$('localeMapImage');image.src=m.image;image.alt=l.name+' — '+m.title;image.width=m.width;image.height=m.height;updateLocaleMap();};
 $('localePanel').querySelector('[data-map-zoom="reset"]').onclick=()=>zoomLocaleMap(1);
 bindPanZoom(view,()=>({zoom:s.zoom,x:s.x,y:s.y}),(value)=>{Object.assign(s,value);updateLocaleMap();});
 updateLocaleMap();
}
function bindPanZoom(view,get,set){
 const points=new Map();let gesture=null;
 const mid=()=>{const p=[...points.values()];return p.length>1?{x:(p[0].x+p[1].x)/2,y:(p[0].y+p[1].y)/2,d:Math.hypot(p[0].x-p[1].x,p[0].y-p[1].y)}:{...p[0],d:0};};
 view.onpointermove=e=>{if(!points.has(e.pointerId)||!gesture)return;points.set(e.pointerId,{x:e.clientX,y:e.clientY});const m=mid(),g=gesture,r=view.getBoundingClientRect();let zoom=g.zoom,x=g.x+m.x-g.x0,y=g.y+m.y-g.y0;
  if(points.size>1&&g.d>0){zoom=Math.max(1,Math.min(5,g.zoom*m.d/g.d));const ratio=zoom/g.zoom;x=m.x-(r.left+r.width/2)-(g.x0-(r.left+r.width/2)-g.x)*ratio;y=m.y-(r.top+r.height/2)-(g.y0-(r.top+r.height/2)-g.y)*ratio;}
  set({zoom,x:zoom===1?0:x,y:zoom===1?0:y});e.preventDefault();};
 const begin=()=>{if(!points.size){gesture=null;view.classList.remove('dragging');return;}const m=mid();gesture={...get(),x0:m.x,y0:m.y,d:m.d};view.classList.add('dragging');};
 view.onpointerdown=e=>{if(e.button>0||e.target.closest('button,select,output'))return;points.set(e.pointerId,{x:e.clientX,y:e.clientY});view.setPointerCapture?.(e.pointerId);begin();e.preventDefault();};
 const release=e=>{points.delete(e.pointerId);begin();};view.onpointerup=release;view.onpointercancel=release;view.onlostpointercapture=release;
 view.ondblclick=e=>{if(e.target.closest('button'))return;e.preventDefault();const a=get();set({zoom:a.zoom===1?2:1,x:0,y:0});};
 view.onwheel=e=>{if(e.ctrlKey||e.metaKey){e.preventDefault();const a=get();set({...a,zoom:Math.max(1,Math.min(5,a.zoom*Math.exp(-e.deltaY*.003)))});}};
 view.onkeydown=e=>{const a=get();let yes=true;if(e.key==='+'||e.key==='=')a.zoom=Math.min(5,a.zoom+.25);else if(e.key==='-')a.zoom=Math.max(1,a.zoom-.25);else if(e.key==='0'){a.zoom=1;a.x=a.y=0;}else if(e.key==='ArrowLeft')a.x+=50;else if(e.key==='ArrowRight')a.x-=50;else if(e.key==='ArrowUp')a.y+=50;else if(e.key==='ArrowDown')a.y-=50;else yes=false;if(yes){e.preventDefault();set(a);}};
}
function zoomLocaleMap(value){if(!localeState)return;localeState.zoom=Math.max(1,Math.min(5,value));if(localeState.zoom===1)localeState.x=localeState.y=0;updateLocaleMap();}
function updateLocaleMap(){
 const s=localeState,view=$('localeMapViewport'),image=$('localeMapImage');if(!s||!view||!image)return;
 const bounds=view.getBoundingClientRect(),mx=Math.max(0,bounds.width*(s.zoom-1)/2),my=Math.max(0,bounds.height*(s.zoom-1)/2);s.x=Math.max(-mx,Math.min(mx,s.x));s.y=Math.max(-my,Math.min(my,s.y));
 image.style.transform=`translate(${s.x}px,${s.y}px) scale(${s.zoom})`;view.dataset.zoomed=String(s.zoom>1);$('mapZoomValue').textContent=Math.round(s.zoom*100)+'%';
}

function renderAll(){renderOverview();renderBestiary();renderWeapons();renderProgression();renderEquipment();renderNotes();renderPreparation();renderLocales();paintIcons();syncSaved();}
function applyNavigation(mode=S.edition,view=S.view,scroll=true){if(!validMode(mode)||!validView(view))return;closeGuideMenu();const changed=mode!==S.edition;S.edition=mode;S.view=view;document.documentElement.dataset.edition=mode;document.documentElement.style.setProperty('--hero-image',`url("${img(edition().background)}")`);document.documentElement.style.setProperty('--texture',`url("${img('iceborne-background')}")`);$('worldTab').setAttribute('aria-selected',String(mode==='world'));$('iceborneTab').setAttribute('aria-selected',String(mode==='iceborne'));document.querySelector('meta[name="theme-color"]').content=mode==='world'?'#0d1512':'#0b1420';$('brandHome').href='#'+mode+'/overview';if(changed){S.monsterQ='';S.monsterType='all';S.monsterKind='all';S.monsterScope='new';S.monsterLimit=bestiaryBatchSize();S.noteCat='all';S.noteQ='';S.skillQ='';S.itemQ='';S.buildKind='all';renderAll();syncAudio();}document.querySelectorAll('.view').forEach(v=>v.hidden=v.id!=='view-'+view);renderNavigation();document.title=`${navs.find(n=>n[0]===view)[1]} · ${edition().fullName} · Hunter’s Field Guide`;try{history.replaceState(history.state||null,'','#'+mode+'/'+view);}catch{}document.body.classList.toggle('is-home',view==='overview');applyAppearance();persist();refreshMotion();if(scroll){try{window.scrollTo({top:0,behavior:'instant'});}catch{}}}
function openDialog(id){const origin=document.activeElement;previousFocus=$('guideMenu').contains(origin)?$('menuOpen'):origin;closeGuideMenu();toggleMusicDock(false);document.querySelectorAll('dialog[open]').forEach(d=>{if(d.id!==id)closeDialog(d.id)});const d=$(id);if(!d.open){if(d.showModal)d.showModal();else d.setAttribute('open','');}d.scrollTop=0;document.body.style.overflow='hidden';paintIcons(d);}
function closeDialog(id){const d=$(id);if(!d)return;if(d.close)d.close();else d.removeAttribute('open');if(!document.querySelector('dialog[open]'))document.body.style.overflow='';if(id==='itemDialog'){itemReturnFocus?.isConnected&&itemReturnFocus.focus?.();}else if(previousFocus?.focus)previousFocus.focus();}
function monsterVideo(m){const v=m.video;if(!v)return'';return `<div class="monster-video-link"><div><p class="eyebrow">HUNTING VIDEO</p><p>${E(v.title)}</p><small>${E(v.channel)}${v.note?' · '+E(v.note):''}</small></div><a class="secondary-btn" href="${E(v.url)}" target="_blank" rel="noopener noreferrer" aria-label="Guide Video for ${E(m.name)}">${icon('play')} Guide Video</a></div>`;}
function openMonster(id,originButton=null){$('detailDialog').classList.remove('locale-dialog');const origin=originButton?.querySelector('img')?.getBoundingClientRect();const m=D.monsters.find(m=>m.id===id);if(!m)return;const needMode=m.game==='iceborne'?'iceborne':removedMR.has(m.id)||['Nergigante','Vaal Hazak',"Xeno'jiiva",'Zorah Magdaros','Leshen','Ancient Leshen','Behemoth'].includes(m.name)?'world':S.edition;if(needMode!==S.edition)navigate(needMode,'bestiary');$('detailBody').innerHTML=`<div class="profile-hero"><div class="profile-title"><p class="eyebrow">ECOLOGICAL RESEARCH / ${m.game==='iceborne'?'ICEBORNE ADDITION':'WORLD SPECIES'}</p><h2>${E(m.name)}</h2><div class="pill-row">${pill(m.class,'accent')}${pill(m.capture?'Can be captured':'Cannot be captured')}</div>${saveButton('monster:'+id)}</div><img src="${E(m.image)}" alt="${E(m.name)} official render" width="350" height="230"></div><div class="profile-content">${monsterVideo(m)}<div class="advice-box"><p class="eyebrow">THE HUNTING PLAN</p><p>${E(m.tip)}</p></div><div class="profile-grid"><div><h4>Elemental considerations</h4><p>${E(m.elementHint)}</p></div><div><h4>Priority targets</h4>${list(m.weakParts)}<p class="tiny" style="margin-top:12px">Weapon and phase dependent; not a numeric hitzone chart.</p></div><div><h4>Watch for</h4>${list(m.hazards)}</div><div><h4>Parts & break goals</h4>${list(m.breaks)}</div><div><h4>Typical locales</h4>${list(m.habitats)}</div><div><h4>Capture eligibility</h4><p>${m.capture?'Eligible when sufficiently weakened, tranquilized, and in a valid trap. The quest objective still takes priority.':'Plan to slay or complete the encounter’s special objective. Traps and tranquilizers will not capture this target.'}</p><button class="text-btn" data-open-guide="capture">Read capture fundamentals ↗</button></div></div><div class="profile-source"><p>Qualitative field summary. For exact hitzones, ailments, material rewards, and quest-specific data, use the detailed reference.</p>${sourceLink(m.source,'Open monster database ↗')}</div></div>`;openDialog('detailDialog');animateMonsterArrival(origin);}
function openWeapon(id){$('detailDialog').classList.remove('locale-dialog');const w=D.weapons.find(w=>w.id===id);if(!w)return;$('detailBody').innerHTML=`<div class="weapon-detail-head">${weaponSigil(w)}<div><p class="eyebrow">${S.edition.toUpperCase()} / WEAPON HANDBOOK</p><h2>${E(w.name)}</h2><p>${E(w.short)}</p></div></div><div class="profile-content"><div class="pill-row">${pill(w.role,'accent')}${pill(w.complexity+' learning curve')}${saveButton('weapon:'+id)}</div><div class="profile-grid"><div><h4>What works well</h4>${list(w.strengths)}</div><div><h4>The tradeoffs</h4>${list(w.tradeoffs)}</div><div><h4>Movement & reach</h4><p>${E(w.mobility)}</p><p>${E(w.reach)}</p></div><div><h4>Defensive options</h4><p>${E(w.defense)}</p></div></div><h3>World foundation loop</h3><p class="quiet small">One useful example sequence, not a rotation to force into every opening.</p><ol class="loop-list">${w.loop.map(t=>`<li>${E(t)}</li>`).join('')}</ol>${S.edition==='iceborne'?`<div class="advice-box"><p class="eyebrow">WHAT ICEBORNE ADDS</p><p>${E(w.iceborne)}</p></div>${w.iceborneLoop?.length?`<h3>An Iceborne sequence</h3><ol class="loop-list">${w.iceborneLoop.map(t=>`<li>${E(t)}</li>`).join('')}</ol>`:''}`:''}<div class="profile-grid"><div><h4>Useful skill directions</h4>${list(w.skills)}</div><div><h4>Common mistakes</h4>${list(w.mistakes)}</div></div><div class="advice-box"><p class="eyebrow">EQUIPMENT DIRECTION</p><p>${E(S.edition==='iceborne'?w.iceborneProgression||w.progression:w.worldProgression||w.progression)}</p></div><p class="serif">“${E(w.tip)}”</p><div class="profile-source"><p>Move names avoid platform-specific button mappings. Guide advice is qualitative; consult current data tables for precise values.</p>${sourceLink(w.source,'Open weapon reference ↗')}</div></div>`;openDialog('detailDialog');}
function openGuide(id){$('detailDialog').classList.remove('locale-dialog');const g=D.guides.find(g=>g.id===id);if(!g)return;if(g.game!=='both'&&g.game!==S.edition)navigate(g.game,'notes');$('detailBody').innerHTML=`<article><div class="article-header"><p class="eyebrow">${S.edition.toUpperCase()} / ${E(g.category)}</p><h2>${E(g.title)}</h2><p>${E(g.summary)}</p>${saveButton('guide:'+id)}</div><div class="article-content">${g.sections.map(s=>`<section class="article-section"><h3>${E(s.title)}</h3><p>${E(s.text)}</p>${list(s.bullets)}</section>`).join('')}<div class="profile-source"><p>Practical summary for World and Iceborne. Specific quests, current availability, and exact recipes should be checked in-game.</p>${sourceLink(g.source)}</div></div></article>`;openDialog('detailDialog');}
function getEntry(k){const [kind,id]=k.split(':');let x=kind==='monster'?D.monsters.find(x=>x.id===id):kind==='weapon'?D.weapons.find(x=>x.id===id):D.guides.find(x=>x.id===id);return x?{kind,id,title:x.name||x.title,x}:null;}
function renderSaved(){const entries=S.saved.map(getEntry).filter(Boolean);$('savedList').innerHTML=entries.length?entries.map(x=>`<div class="saved-row"><button data-entry="${E(x.kind+':'+x.id)}"><strong>${E(x.title)}</strong><small>${E(x.kind.toUpperCase())} ${x.x.game&&x.x.game!=='both'?'· '+x.x.game.toUpperCase():''}</small></button>${saveButton(x.kind+':'+x.id)}</div>`).join(''):'<div class="empty-state"><h3>Your journal is waiting.</h3><p>Use the bookmark beside a monster, weapon, or field note.</p></div>';$('savedDialog').querySelector('p.quiet').textContent=storage?'':'Bookmarks will last for this session.';}
let fullSearchCache=null;
function factText(value){if(value==null)return'';if(typeof value==='string')return value.startsWith('data:')||/^https?:\/\//.test(value)?'':value;if(Array.isArray(value))return value.map(factText).join(' ');if(typeof value==='object')return Object.entries(value).filter(([k])=>!['source','sources','image','artUrl','artSource','url','path','data','maps'].includes(k)).map(([,v])=>factText(v)).join(' ');return'';}
function searchIndex(){
 if(fullSearchCache)return fullSearchCache;
 const a=[...databaseSearchEntries(),
  ...D.monsters.map(m=>({kind:'monster',id:m.id,title:m.name,sub:m.class+' · '+m.habitats.join(', '),text:factText(m)+(m.capture?' capturable':' cannot capture'),image:m.image,game:m.game})),
  ...D.weapons.map(w=>{const base={name:w.name,short:w.short,role:w.role,reach:w.reach,defense:w.defense,mobility:w.mobility,strengths:w.strengths,tradeoffs:w.tradeoffs,loop:w.loop,skills:w.skills,mistakes:w.mistakes,worldProgression:w.worldProgression};return{kind:'weapon',id:w.id,title:w.name,sub:w.role,text:factText(w),worldText:factText(base),game:'both'};}),
  ...D.guides.map(g=>({kind:'guide',id:g.id,title:g.title,sub:g.category,text:factText(g),game:g.game})),
  ...D.skills.map(s=>({kind:'skill',id:s.name,title:s.name,sub:s.type,text:factText(s),game:s.type==='Iceborne'?'iceborne':'both'})),
  ...D.builds.map(b=>({kind:'build',id:b.id,title:b.name,sub:b.label,text:factText(b),game:b.game})),
  ...Object.entries(D.progress).flatMap(([game,steps])=>steps.map(p=>({kind:'progress',id:game+'|'+p.id,title:p.title,sub:p.rank,text:factText(p),game}))),
  ...D.locales.map(l=>({kind:'locale',id:l.id,title:l.name,sub:l.tag,text:factText(l),game:l.game}))
 ];
 const sections=[['gathering','gathering'],['secret','secrets'],['quest','quests'],['camp','camps'],['route','routes'],['lore','trivia']];
 for(const l of D.locales)for(const[kind,key]of sections)(l[key]||[]).forEach((x,i)=>a.push({kind,id:l.id+'|'+i,title:x.name||x.title||l.name,sub:l.name+(x.areas?.length?' · '+x.areas.join(', '):x.area?' · '+x.area:''),text:factText(x),game:l.game}));
 fullSearchCache=a;return a;
}
function renderSearch(){
 const q=$('globalSearch').value.trim().toLowerCase(),idx=searchIndex();let total=0;
 if(q){const terms=q.split(/\s+/),matches=idx.filter(x=>terms.every(t=>[x.title,x.sub,x.text].join(' ').toLowerCase().includes(t)));total=matches.length;
  searchHits=matches.sort((a,b)=>{const score=x=>x.title.toLowerCase()===q?0:x.title.toLowerCase().startsWith(q)?1:x.title.toLowerCase().includes(q)?2:3;return score(a)-score(b)||a.title.localeCompare(b.title)||a.sub.localeCompare(b.sub);}).slice(0,36).map(x=>x.kind==='weapon'&&!terms.every(t=>(x.worldText||'').toLowerCase().includes(t))?{...x,preferredEdition:'iceborne'}:x);
 }else{const suggested=['first-hunt','master-rank','guiding-lands'];searchHits=[...idx.filter(x=>x.kind==='guide'&&suggested.includes(x.id)),...idx.filter(x=>x.kind==='monster'&&['rathalos','velkhana','fatalis'].includes(x.id)),...idx.filter(x=>x.kind==='locale'&&['ancient-forest','hoarfrost-reach'].includes(x.id))];}
 S.searchIndex=0;paintSearchHits();$('searchEdition').textContent='WORLD + ICEBORNE · '+(q?total+' MATCHES'+(total>36?' · TOP 36':''):'ENTIRE DATABASE');
}
function paintSearchHits(){
 const labels={weaponRecord:'Weapon',databaseItem:'Item',recipeRecord:'Recipe',questRecord:'Quest',monster:'Monster',weapon:'Weapon',guide:'Guide',skill:'Skill',item:'Recipe',locale:'Locale',gathering:'Resource',secret:'Discovery',quest:'Quest',camp:'Camp',route:'Route',lore:'Trivia',build:'Build',progress:'Progress'};
 $('searchResults').innerHTML=searchHits.length?searchHits.map((x,i)=>`<button class="search-result ${S.searchIndex===i?'selected':''}" role="option" aria-selected="${S.searchIndex===i}" data-search-hit="${i}">${x.image?`<img src="${E(x.image)}" alt="" width="48" height="40">`:icon(x.kind==='weapon'?'sword':['locale','gathering','secret','camp','route'].includes(x.kind)?'compass':'book')}<span class="result-text"><strong>${E(x.title)}</strong><small>${E(x.sub)}</small><span class="search-game">${x.game==='world'?'WORLD':x.game==='iceborne'||x.preferredEdition==='iceborne'?'ICEBORNE':'WORLD + ICEBORNE'}</span></span><span class="result-kind">${E((labels[x.kind]||x.kind).toUpperCase())}</span></button>`).join(''):'<div class="empty-state"><h3>No matching records</h3><p>Search a name, item, camp, quest, skill, or discovery from either game.</p></div>';
}
function openBuild(id){const b=D.builds.find(x=>x.id===id);if(!b)return;if(b.game!==S.edition)navigate(b.game,'equipment');$('detailDialog').classList.remove('locale-dialog');$('detailBody').innerHTML=`<div class="article-header"><p class="eyebrow">${E(b.game.toUpperCase())} / ${E(b.label)}</p><h2>${E(b.name)}</h2><p>${E(b.text)}</p></div><div class="article-content"><section class="article-section"><h3>Equipment direction</h3>${list(b.pieces)}</section><section class="article-section"><h3>Skill priorities</h3>${list(b.skills)}</section><div class="advice-box"><p>${E(b.note)}</p></div></div>`;openDialog('detailDialog');}
function openEntry(kind,id,options={}){
 if(kind==='questRecord'){openQuest(id);return;}if(kind==='weaponRecord'){jumpWeapon(id);return;}if(kind==='databaseItem'){closeDialog('searchDialog');openItem(id);return;}if(kind==='recipeRecord'){jumpRecipe(id);return;}
 if(kind==='monster')openMonster(id);
 else if(kind==='weapon'){if(options.preferredEdition&&options.preferredEdition!==S.edition)navigate(options.preferredEdition,'weapons');openWeapon(id);}
 else if(kind==='guide')openGuide(id);
 else if(kind==='skill'){const s=D.skills.find(x=>x.name===id);closeDialog('searchDialog');navigate(s?.type==='Iceborne'?'iceborne':S.edition,'equipment');S.skillQ=id;renderEquipment();paintIcons();setTimeout(()=>$('skillSearch')?.focus(),30);}
 else if(kind==='item'){const item=D.items.find(x=>x.name===id);closeDialog('searchDialog');navigate(item?.game==='iceborne'?'iceborne':S.edition,'preparation');S.itemQ=id;renderPreparation();paintIcons();setTimeout(()=>$('itemSearch')?.focus(),30);}
 else if(kind==='locale')openLocale(id);
 else if(kind==='build')openBuild(id);
 else if(kind==='progress'){const[game,key]=id.split('|');closeDialog('searchDialog');navigate(game,'progression');const card=document.querySelector(`[data-progress-entry="${key}"]`);card?.scrollIntoView?.({behavior:reducedMotion()?'instant':'smooth',block:'center'});card?.classList.add('search-highlight');}
 else if(['gathering','secret','quest','camp','route','lore'].includes(kind)){const[localeId,index]=id.split('|'),tab={gathering:'resources',secret:'secrets',quest:'quests',camp:'map',route:'map',lore:'quests'}[kind];openLocale(localeId,{tab,focus:kind+'-'+index,query:kind==='gathering'?searchIndex().find(x=>x.kind===kind&&x.id===id)?.title||'':''});}
}

function updateChecks(){document.querySelectorAll('[data-check]').forEach(x=>x.checked=checkKey(x.dataset.check));const count=D.checklist.filter((_,i)=>checkKey('camp:'+i)).length;document.querySelectorAll('[data-camp-count]').forEach(x=>x.textContent=`${count} / ${D.checklist.length} prepared`);const arr=D.progress[S.edition],total=arr.reduce((n,x)=>n+x.tasks.length,0),done=arr.reduce((n,x)=>n+x.tasks.filter((t,i)=>checkKey('progress:'+x.id+':'+i)).length,0);document.querySelectorAll('[data-progress-count]').forEach(x=>x.textContent=`${done} / ${total} objectives`);document.querySelectorAll('.progress-fill').forEach(x=>x.style.width=done/total*100+'%');document.querySelectorAll('[role=progressbar]').forEach(x=>x.setAttribute('aria-valuenow',String(done)));}
function openCredits(){$('detailDialog').classList.remove('locale-dialog');$('detailBody').innerHTML=`<div class="article-header"><p class="eyebrow">THE FIELD GUIDE’S REFERENCES</p><h2>Sources & credits</h2><p>Independent fan guide · prepared October 2026. Game facts and public artwork are referenced below. This guide does not claim to be an official Capcom publication.</p></div><div class="article-content"><section class="article-section"><h3>Game data & original guidance</h3><ul class="credit-list"><li>${sourceLink('https://mhworld.kiranico.com/en/monsters','Kiranico: World / Iceborne monster database')} — roster, monster-specific data links, and exact tables.</li><li>${sourceLink('https://mhworld.kiranico.com/en/weapons','Kiranico: weapon database')} and its individual weapon guides — weapon foundations and current data references.</li><li>${sourceLink('https://mhworld.kiranico.com/en/skilltrees','Kiranico: skills')} — complete skill tables.</li><li>${sourceLink('https://monsterhunterwiki.org/wiki/MHWI/Crafting','Monster Hunter Wiki: Iceborne crafting')} — crafting reference.</li><li>${sourceLink('https://www.capcom-support.com/hc/en-us/articles/5730013966876-Monster-Hunter-World-Iceborne-How-do-I-access-the-Iceborne-Campaign','Capcom: Iceborne campaign access')} — official entry requirements.</li><li>${sourceLink('https://blog.playstation.com/2020/07/03/alatreon-brings-a-storm-of-elements-to-monster-hunter-world-iceborne-july-9/','Capcom on PlayStation Blog: Alatreon')} — elemental encounter mechanics.</li><li>${sourceLink('https://steamcommunity.com/sharedfiles/filedetails/?id=1973452046','Guiding Lands community reference')} — regional progression.</li></ul></section><section class="article-section"><h3>Embedded database sources</h3><ul class="credit-list">${(DB.sources||[]).map(x=>`<li>${sourceLink(x.url,x.name)}${x.note?' — '+E(x.note):''}</li>`).join('')}</ul>${DB.license?`<details><summary>Data license</summary><pre class="data-license">${E(DB.license)}</pre></details>`:''}${DB.coverage?`<p class="small quiet">${E(DB.coverage)}</p>`:''}</section><section class="article-section"><h3>Authentic artwork</h3><p>Official game logos, key art, promotional backgrounds, monster renders, and weapon icons are CAPCOM artwork. Banners are sourced from the games’ official Steam store assets; monster and locale art are sourced through Monster Hunter Wiki. Each monster’s original art page is listed below.</p><ul class="credit-list"><li>${sourceLink('https://store.steampowered.com/app/582010/Monster_Hunter_World/','Monster Hunter: World — official Steam page')}</li><li>${sourceLink('https://store.steampowered.com/app/1118010/Monster_Hunter_World_Iceborne/','Iceborne — official Steam page')}</li><li>${sourceLink('https://monsterhunterwiki.org/wiki/MHWI/Weapons','Monster Hunter Wiki: weapon icons')}</li></ul><details><summary>Monster artwork provenance · 71 records</summary><ul class="credit-list">${D.monsters.map(m=>`<li>${sourceLink(m.artSource||m.source,m.name)}</li>`).join('')}</ul></details>${D.localeCredits?.length?`<details style="margin-top:14px"><summary>Locale artwork provenance</summary><ul class="credit-list">${D.localeCredits.map(x=>`<li>${sourceLink(x.source,x.name)}</li>`).join('')}</ul></details>`:''}${D.mapCredits?.length?`<details style="margin-top:14px"><summary>Original locale maps · ${D.mapCredits.length} layers</summary><p class="quiet small">Numbered maps are captured from the game; some use Japanese UI and publisher annotations. Clean floor layers combine the original map textures at their native alignment. Map provenance is recorded here.</p><ul class="credit-list">${D.mapCredits.map(x=>`<li>${sourceLink(x.source,x.name)}${x.description?`<small class="credit-description">${E(x.description)}</small>`:''}</li>`).join('')}</ul></details>`:''}</section><section class="article-section"><h3>Locale research</h3><ul class="credit-list">${[...new Set(D.locales.flatMap(l=>['camps','gathering','routes','secrets','quests','trivia'].flatMap(k=>(l[k]||[]).map(x=>x.source))).filter(Boolean))].map(u=>`<li>${sourceLink(u)}</li>`).join('')}</ul></section><section class="article-section"><h3>Music & saved audio</h3><p>The two supplied soundtracks are included in this HTML. One global player continues across World, Iceborne, and every guide section. The soundtrack selector includes both supplied tracks and your imported audio.</p><p>Imported recordings are saved in this browser’s device storage. The player remembers your selected track, volume, looping, and paused state. Clearing browser data removes imported tracks; the supplied recordings remain in the HTML. Storage availability depends on the browser and how this file is opened.</p><p>Playback starts automatically when the browser permits sound and your saved choice allows playback. Browser sound restrictions can defer playback until an interaction with the page.</p></section><section class="article-section"><h3>Typography</h3><p>Cinzel by Natanael Gama, distributed under the SIL Open Font License. The font is embedded for offline reading.</p><details><summary>Open Font License</summary><pre style="font-size:10px;white-space:pre-wrap;overflow-wrap:anywhere;color:var(--muted)">${E(D.fontLicense||'')}</pre></details></section><section class="article-section"><h3>How to read this guide</h3><p>“World” covers base-game progression and its 36 large monsters. “Iceborne” covers its 35 additions and returning Master Rank targets. Tempered and Arch-tempered are encounter modifiers rather than extra species records. Elemental recommendations are qualitative, and locales and part goals are representative. Crafting, melding, weapons, monster tables, and item sources are stored inside this HTML.</p></section></div>`;openDialog('detailDialog');}
const audio=$('bgAudio'),importedTracks=new Map(),builtInTracks=new Map(Object.entries(D.music).filter(([,t])=>t?.data).map(([id,t])=>[id,{...t,builtIn:true}]));
let mediaDBPromise=null,audioReady=false,autoplayPending=false,audioSourceVersion=0,audioPlayVersion=0,lastPositionSave=0;
audio.volume=musicPrefs.volume;audio.muted=musicPrefs.volume===0;audio.loop=musicPrefs.mode==='one';
$('audioVolume').value=String(Math.round(musicPrefs.volume*100));$('volumeValue').textContent=Math.round(musicPrefs.volume*100)+'%';
updatePlaybackMode();
function openMediaDatabase(){
 if(mediaDBPromise)return mediaDBPromise;
 mediaDBPromise=new Promise((resolve,reject)=>{
  if(!window.indexedDB){reject(new Error('Persistent audio storage is unavailable in this browser.'));return;}
  let request;try{request=window.indexedDB.open('hunter-field-guide-media',1);}catch(e){reject(e);return;}
  request.onupgradeneeded=()=>{const db=request.result;if(!db.objectStoreNames.contains('tracks'))db.createObjectStore('tracks',{keyPath:'id'});};
  request.onsuccess=()=>{const db=request.result;db.onversionchange=()=>{db.close();mediaDBPromise=null;};resolve(db);};
  request.onerror=()=>reject(request.error||new Error('Audio storage could not be opened.'));
  request.onblocked=()=>reject(new Error('Audio storage is busy in another open copy.'));
 });
 return mediaDBPromise;
}
async function loadSavedTracks(){
 const db=await openMediaDatabase();
 return new Promise((resolve,reject)=>{const tx=db.transaction('tracks','readonly'),req=tx.objectStore('tracks').getAll();req.onsuccess=()=>resolve(req.result||[]);req.onerror=()=>reject(req.error);tx.onabort=()=>reject(tx.error||new Error('Audio restore was interrupted.'));});
}
async function storeImportedTrack(record){
 const db=await openMediaDatabase();
 return new Promise((resolve,reject)=>{const tx=db.transaction('tracks','readwrite');tx.oncomplete=()=>resolve();tx.onabort=()=>reject(tx.error||new Error('The audio could not be saved.'));tx.onerror=()=>reject(tx.error||new Error('The audio could not be saved.'));tx.objectStore('tracks').put(record);});
}
function libraryEntries(){const available=new Map([...builtInTracks,...importedTracks].filter(([id,t])=>!t.builtIn||!musicPrefs.hiddenBuiltIns.includes(id))),ids=[...new Set([...musicPrefs.order,...available.keys()])];return ids.filter(id=>available.has(id)).map(id=>[id,available.get(id)]);}
function selectedTrackId(){const entries=libraryEntries();return entries.some(([id])=>id===musicPrefs.trackId)?musicPrefs.trackId:entries[0]?.[0];}
function currentTrack(){const id=selectedTrackId();return importedTracks.get(id)||builtInTracks.get(id);}
function renderMusicLibrary(){
 const id=selectedTrackId();$('musicTrack').innerHTML=libraryEntries().map(([key,t])=>`<option value="${E(key)}" ${key===id?'selected':''}>${E(t.name)}${t.builtIn?'':' · imported'}</option>`).join('');
}
function selectAudioTrack(id){if(!libraryEntries().some(([key])=>key===id))return;rememberAudioPosition();musicPrefs.trackId=id;if(musicPrefs.mode==='shuffle'){musicPrefs.shufflePlayed=[...new Set([...musicPrefs.shufflePlayed,id])];musicPrefs.shuffleQueue=musicPrefs.shuffleQueue.filter(x=>x!==id);}persist();syncAudio({resume:true});refreshLibrarySettings();}
function rememberAudioPosition(){if(audioMode&&Number.isFinite(audio.currentTime)){audioPositions[audioMode]=audio.currentTime;musicPrefs.positions={...audioPositions};}}
function refreshMusicStatus(){
 const t=currentTrack(),message=!t?'Add audio in Settings.':t.saving?'Saving audio…':t.persisted===false?'This track could not be saved; it is available for this session.':'';
 $('musicStatus').textContent=message;$('musicStatus').hidden=!message;
}

async function attemptAudioPlay(){
 if(musicPrefs.paused||!audio.getAttribute('src'))return false;
 const token=++audioPlayVersion;
 try{
  await audio.play();
  if(token!==audioPlayVersion){if(musicPrefs.paused)audio.pause();return false;}
  autoplayPending=false;updateAudio();refreshMusicStatus();return true;
 }catch(e){
  if(token!==audioPlayVersion)return false;
  autoplayPending=e?.name==='NotAllowedError';updateAudio();
  if(autoplayPending)refreshMusicStatus();else if(e?.name!=='AbortError'){$('musicStatus').textContent='The selected audio could not be played. Try another supported audio file.';$('musicStatus').hidden=false;}
  return false;
 }
}
function syncAudio({resume=false}={}){
 const mode=selectedTrackId(),t=currentTrack(),next=t?.data||'',changed=(audio.getAttribute('src')||'')!==next;
 if(changed){
  rememberAudioPosition();++audioPlayVersion;const version=++audioSourceVersion;autoplayPending=false;audio.pause();audio.removeAttribute('src');audioMode=mode;
  if(next){
   audio.src=next;const resumeAt=audioPositions[mode]||0;
   if(resumeAt>0)audio.addEventListener('loadedmetadata',()=>{if(version===audioSourceVersion&&Number.isFinite(audio.duration))audio.currentTime=Math.min(resumeAt,Math.max(0,audio.duration-.1));},{once:true});
  }
 }
 audioMode=mode;audio.autoplay=audioReady&&!musicPrefs.paused;
 $('musicEdition').textContent='GLOBAL MUSIC LIBRARY';$('trackName').textContent=t?.name||'No soundtrack selected';$('musicEmpty').hidden=!!next;$('audioPlay').disabled=!next;renderMusicLibrary();updateAudio();refreshMusicStatus();
 if(audioReady&&!musicPrefs.paused&&(changed||resume)&&audio.paused)return attemptAudioPlay();
}
async function initializeAudio(){
 try{
  for(const record of (await loadSavedTracks()).sort((a,b)=>(a.updatedAt||0)-(b.updatedAt||0)))if(typeof record.id==='string'&&record.id.startsWith('import-')&&record.blob instanceof Blob&&!importedTracks.has(record.id))importedTracks.set(record.id,{name:record.name,data:URL.createObjectURL(record.blob),persisted:true});
 }catch{}
 audioReady=true;musicPrefs.trackId=selectedTrackId();persist();await syncAudio({resume:true});
}
function fmt(s){if(!Number.isFinite(s))return'0:00';return Math.floor(s/60)+':'+String(Math.floor(s%60)).padStart(2,'0');}
function updateAudio(){const playing=!audio.paused;$('audioPlay').innerHTML=icon(playing?'pause':'play');$('audioPlay').setAttribute('aria-label',playing?'Pause music':'Play music');$('audioTime').textContent=fmt(audio.currentTime);$('audioDuration').textContent=fmt(audio.duration);$('audioSeek').value=Number.isFinite(audio.duration)&&audio.duration>0?Math.round(audio.currentTime/audio.duration*1000):0;$('musicOpen').classList.toggle('active',playing);}
function toggleMusicDock(on){const visible=on===undefined?$('musicDock').hidden:on;if(visible)closeGuideMenu();$('musicDock').hidden=!visible;if(!visible){setControlVisibility($('playbackOptions'),false);$('audioLoop').setAttribute('aria-expanded','false');}$('musicOpen').setAttribute('aria-expanded',String(visible));}
async function readMusic(file){
 if(!file)return;const ext=file.name.split('.').pop().toLowerCase(),known=['mp3','wav','ogg','m4a','aac','flac','opus','webm'];
 if(!String(file.type||'').startsWith('audio/')&&!known.includes(ext)){toast('Choose an audio file such as MP3, WAV, or OGG.');return;}
 const mode='import-'+Date.now().toString(36)+'-'+Math.random().toString(36).slice(2,9);let track;
 try{
  const blob=file.slice(0,file.size,file.type||({mp3:'audio/mpeg',wav:'audio/wav',m4a:'audio/mp4',ogg:'audio/ogg'}[ext]||'audio/'+ext));
  track={name:file.name,data:URL.createObjectURL(blob),persisted:false,saving:true};rememberAudioPosition();
  importedTracks.set(mode,track);musicPrefs.order=[...libraryEntries().map(([id])=>id)];audioPositions[mode]=0;musicPrefs.positions={...audioPositions};musicPrefs.trackId=mode;
  syncAudio({resume:true});
  persist();
  try{await storeImportedTrack({id:mode,name:file.name,blob,updatedAt:Date.now()});track.persisted=true;}catch{track.persisted=false;}
  track.saving=false;refreshLibrarySettings();
  if(currentTrack()===track){refreshMusicStatus();toast(track.persisted?'Audio imported and saved on this device.':'Audio imported for this session; browser storage is unavailable.');}
 }catch(e){if(track)track.saving=false;$('musicStatus').textContent='The audio file could not be imported. Choose another audio file.';$('musicStatus').hidden=false;}
 finally{$('musicFile').value='';}
}
async function toggleAudioPlayback(){
 if(!audio.getAttribute('src'))return;
 if(!audio.paused){musicPrefs.paused=true;audio.autoplay=false;autoplayPending=false;++audioPlayVersion;audio.pause();rememberAudioPosition();persist();refreshMusicStatus();updateAudio();}
 else{musicPrefs.paused=false;audio.autoplay=true;persist();await attemptAudioPlay();}
}
function setPlaybackMode(mode){
 if(!['one','library','shuffle'].includes(mode))return;
 musicPrefs.mode=mode;musicPrefs.loop=mode==='one';audio.loop=musicPrefs.loop;musicPrefs.shuffleQueue=[];musicPrefs.shufflePlayed=[selectedTrackId()];
 updatePlaybackMode();setControlVisibility($('playbackOptions'),false);$('audioLoop').setAttribute('aria-expanded','false');persist();
}
function updatePlaybackMode(){
 const labels={one:'Repeat one',library:'Repeat library',shuffle:'Shuffle'},mode=musicPrefs.mode;
 $('audioLoop').title=labels[mode];$('audioLoop').setAttribute('aria-label','Playback mode: '+labels[mode]);$('audioLoop').dataset.mode=mode;
 $('audioLoop').innerHTML=icon(mode==='shuffle'?'shuffle':'repeat')+(mode==='one'?'<span class="repeat-one">1</span>':'');
 document.querySelectorAll('[data-playback-mode]').forEach(b=>b.setAttribute('aria-checked',String(b.dataset.playbackMode===mode)));
}
function advanceAudio(){
 const ids=libraryEntries().map(([id])=>id),current=selectedTrackId();if(!ids.length||musicPrefs.paused)return;
 let next=current;
 if(musicPrefs.mode==='shuffle'){
  let played=new Set(musicPrefs.shufflePlayed.filter(id=>ids.includes(id)));played.add(current);
  let queue=musicPrefs.shuffleQueue.filter(id=>ids.includes(id)&&!played.has(id));
  const missing=ids.filter(id=>!played.has(id)&&!queue.includes(id));
  for(let i=missing.length-1;i>0;i--){const j=Math.floor(Math.random()*(i+1));[missing[i],missing[j]]=[missing[j],missing[i]];}queue.push(...missing);
  if(!queue.length){played=new Set();queue=[...ids];for(let i=queue.length-1;i>0;i--){const j=Math.floor(Math.random()*(i+1));[queue[i],queue[j]]=[queue[j],queue[i]];}if(queue.length>1&&queue[0]===current)[queue[0],queue[1]]=[queue[1],queue[0]];}
  next=queue.shift();played.add(next);musicPrefs.shuffleQueue=queue;musicPrefs.shufflePlayed=[...played];
 }else if(musicPrefs.mode==='library')next=ids[(ids.indexOf(current)+1)%ids.length];
 rememberAudioPosition();audioPositions[current]=0;audioPositions[next]=0;musicPrefs.trackId=next;musicPrefs.positions={...audioPositions};
 if(next===current){audio.currentTime=0;persist();void attemptAudioPlay();}else{syncAudio({resume:true});audioPositions[current]=0;musicPrefs.positions={...audioPositions};persist();}refreshLibrarySettings();
}
function flushAudioPreferences(){rememberAudioPosition();persist();}
function retryAllowedAutoplay(event){if(event?.isTrusted&&autoplayPending&&!musicPrefs.paused)void attemptAudioPlay();}

const themePresets=[
 {id:'game',name:'World / Iceborne',note:'Follow the selected game',bg:'#0d1512',accent:'#d9b77a',text:'#eee9dc'},
 {id:'ember',name:'Ember & Slate',note:'Warm copper, cool slate',bg:'#101921',accent:'#eda76d',text:'#f4e7d8'},
 {id:'forest',name:'Forest & Brass',note:'Deep green, soft brass',bg:'#0e1c17',accent:'#c4c280',text:'#e9efdf'},
 {id:'amethyst',name:'Amethyst & Mist',note:'Violet, lavender, mist',bg:'#181324',accent:'#c7b2f1',text:'#ede9fa'},
 {id:'ocean',name:'Ocean & Copper',note:'Ocean blue, pale copper',bg:'#0a1b23',accent:'#dfad86',text:'#e0eff1'},
 {id:'monochrome',name:'Monochrome',note:'Charcoal, silver, white',bg:'#151515',accent:'#d0d0d0',text:'#f0f0f0'}
];
let settingsTab='appearance';
const hexRGB=hex=>[1,3,5].map(i=>parseInt(hex.slice(i,i+2),16));
const rgbHex=rgb=>'#'+rgb.map(x=>Math.max(0,Math.min(255,Math.round(x))).toString(16).padStart(2,'0')).join('');
const mixColour=(a,b,t)=>rgbHex(hexRGB(a).map((x,i)=>x*(1-t)+hexRGB(b)[i]*t));
function luminance(hex){const c=hexRGB(hex).map(x=>{x/=255;return x<=.04045?x/12.92:((x+.055)/1.055)**2.4;});return c[0]*.2126+c[1]*.7152+c[2]*.0722;}
const contrast=(a,b)=>(Math.max(luminance(a),luminance(b))+.05)/(Math.min(luminance(a),luminance(b))+.05);
function applyAppearance(){
 applyFontPreferences();
 const root=document.documentElement,keys=['--bg','--panel','--panel2','--ink','--muted','--accent','--accent-rgb','--line','--soft','--header','--custom-hero-overlay','--hero-ink'];
 const selected=appearancePrefs.theme==='custom'?appearancePrefs.custom:themePresets.find(t=>t.id===appearancePrefs.theme);
 root.dataset.colourTheme=selected?appearancePrefs.theme:'game';
 if(!selected||appearancePrefs.theme==='game'){keys.forEach(k=>root.style.removeProperty(k));$('themeMeta')?.setAttribute('content',S.edition==='world'?'#0d1512':'#0b1420');return;}
 const bg=selected.bg,ink=contrast(selected.text,bg)>=4.5?selected.text:luminance(bg)>.25?'#121212':'#f3f1ec';
 const accent=contrast(selected.accent,bg)>=3?selected.accent:mixColour(selected.accent,ink,.55),rgb=hexRGB(bg),vars={'--bg':bg,'--panel':mixColour(bg,ink,.045),'--panel2':mixColour(bg,ink,.08),'--ink':ink,'--muted':mixColour(bg,ink,.7),'--accent':accent,'--accent-rgb':hexRGB(accent).join(','),'--line':mixColour(bg,ink,.2),'--soft':mixColour(bg,ink,.13),'--header':`rgba(${rgb.join(',')},.97)`,'--hero-ink':ink,'--custom-hero-overlay':`linear-gradient(90deg,rgba(${rgb.join(',')},.97),rgba(${rgb.join(',')},.78) 45%,rgba(${rgb.join(',')},.18)),linear-gradient(0deg,${bg},transparent 65%)`};
 Object.entries(vars).forEach(([k,v])=>root.style.setProperty(k,v));$('themeMeta')?.setAttribute('content',bg);
}
function openSettings(tab='appearance'){settingsTab=['appearance','music'].includes(tab)?tab:'appearance';renderSettings();openDialog('settingsDialog');}
function renderSettings(){
 $('settingsBody').innerHTML=`<div class="settings-heading"><div><p class="eyebrow">MAKE IT YOUR FIELD GUIDE</p><h2>Settings</h2></div><button class="icon-btn" data-close="settingsDialog" aria-label="Close settings">${icon('close')}</button></div><div class="settings-tabs" role="tablist" aria-label="Settings categories">${[['appearance','Appearance'],['music','Music library']].map(([id,name])=>`<button role="tab" id="settings-tab-${id}" data-settings-tab="${id}" aria-controls="settingsPanel" aria-selected="${settingsTab===id}" tabindex="${settingsTab===id?'0':'-1'}">${name}</button>`).join('')}</div><div id="settingsPanel" class="settings-panel" role="tabpanel" aria-labelledby="settings-tab-${settingsTab}"></div>`;
 if(settingsTab==='appearance')renderAppearanceSettings();else renderLibrarySettings();paintIcons($('settingsDialog'));
 $('settingsBody').querySelector('.settings-tabs').onkeydown=e=>{if(!['ArrowLeft','ArrowRight','Home','End'].includes(e.key))return;e.preventDefault();settingsTab=e.key==='Home'?'appearance':e.key==='End'?'music':settingsTab==='appearance'?'music':'appearance';renderSettings();$('settings-tab-'+settingsTab).focus();};
}
function renderAppearanceSettings(){
 $('settingsPanel').innerHTML=`<p class="settings-description">Choose a palette for the whole guide. Your theme is kept when you switch games.</p><div class="theme-grid">${themePresets.map(t=>`<button class="theme-choice" data-theme="${t.id}" aria-pressed="${appearancePrefs.theme===t.id}"><span class="theme-swatch" style="--swatch-bg:${t.bg};--swatch-accent:${t.accent};--swatch-text:${t.text}"><i></i><i></i><i></i></span><strong>${t.name}</strong><small>${t.note}</small></button>`).join('')}</div><section class="custom-theme-box"><div class="custom-theme-heading"><div><h3>Custom combination</h3><p>Pick your own colours. Text contrast adjusts to keep the guide readable.</p></div><button class="secondary-btn" data-theme="custom" aria-pressed="${appearancePrefs.theme==='custom'}">Use custom</button></div><div class="colour-inputs">${[['bg','Background'],['accent','Accent'],['text','Text']].map(([key,label])=>`<label>${label}<input type="color" value="${appearancePrefs.custom[key]}" data-custom-colour="${key}" aria-label="Custom ${label.toLowerCase()} colour"></label>`).join('')}</div></section><p class="settings-footnote">Theme colours change the interface. Original monster artwork and maps keep their colours.</p>`;
}
function chooseTheme(id){if(id!=='custom'&&!themePresets.some(t=>t.id===id))return;appearancePrefs.theme=id;applyAppearance();persist();paintThemeChoices();}
function paintThemeChoices(){document.querySelectorAll('[data-theme]').forEach(b=>b.setAttribute('aria-pressed',String(b.dataset.theme===appearancePrefs.theme)));}
function renderLibrarySettings(){
 if(!$('settingsDialog').open||settingsTab!=='music'){if(!$('settingsPanel')||settingsTab!=='music')return;}
 const entries=libraryEntries();
 $('settingsPanel').innerHTML=`<div class="library-intro"><div><h3>Your global library</h3><p>The same tracks play across both games. Use the arrows to change their order.</p></div><label class="secondary-btn file-label" for="libraryMusicFile">${icon('music')} Add audio</label><input type="file" id="libraryMusicFile" accept="audio/*,.mp3,.wav,.ogg,.m4a" multiple hidden></div><div class="library-list">${entries.map(([id,t],i)=>`<article class="library-row ${id===selectedTrackId()?'selected':''}" data-library-track="${E(id)}"><span class="library-order">${String(i+1).padStart(2,'0')}</span><button class="library-track-name" data-library-select="${E(id)}"><strong>${E(t.name)}</strong><small>${t.builtIn?'Supplied soundtrack':t.saving?'Saving…':t.persisted?'Imported · saved on this device':'Imported · this session'}${id===selectedTrackId()?' · selected':''}</small></button><div class="library-row-actions"><button class="icon-btn" data-library-move="up" data-track-id="${E(id)}" aria-label="Move ${E(t.name)} up" ${i===0?'disabled':''}>${icon('up')}</button><button class="icon-btn" data-library-move="down" data-track-id="${E(id)}" aria-label="Move ${E(t.name)} down" ${i===entries.length-1?'disabled':''}>${icon('down')}</button><button class="icon-btn delete-track" data-library-delete="${E(id)}" aria-label="Delete ${E(t.name)} from the library">${icon('trash')}</button></div></article>`).join('')||'<div class="empty-state"><h3>Your library is empty.</h3><p>Add audio from your device or restore the supplied soundtracks.</p></div>'}</div><div class="library-footer"><p>Imported audio is stored in this browser on this device. Clearing browser data removes imports.</p><button class="text-btn" data-restore-tracks ${musicPrefs.hiddenBuiltIns.length?'':'hidden'}>Restore supplied tracks</button></div>`;
}
function refreshLibrarySettings(){if($('settingsDialog').open&&settingsTab==='music')renderLibrarySettings();}
function moveAudioTrack(id,direction){const entries=libraryEntries(),from=entries.findIndex(([key])=>key===id),to=from+(direction==='up'?-1:1);if(from<0||to<0||to>=entries.length)return;const ids=entries.map(([key])=>key);[ids[from],ids[to]]=[ids[to],ids[from]];musicPrefs.order=ids;persist();renderMusicLibrary();refreshLibrarySettings();}
async function deleteAudioTrack(id){
 const t=importedTracks.get(id)||builtInTracks.get(id);if(!t)return;
 if(!t.builtIn){try{const db=await openMediaDatabase();await new Promise((resolve,reject)=>{const tx=db.transaction('tracks','readwrite');tx.oncomplete=resolve;tx.onabort=()=>reject(tx.error);tx.onerror=()=>reject(tx.error);tx.objectStore('tracks').delete(id);});}catch{if(t.persisted){toast('The saved track could not be deleted. Please try again.');return;}}}
 rememberAudioPosition();if(audioMode===id)audioMode=null;if(t.builtIn)musicPrefs.hiddenBuiltIns=[...new Set([...musicPrefs.hiddenBuiltIns,id])];else importedTracks.delete(id);
 musicPrefs.order=libraryEntries().map(([key])=>key).filter(key=>key!==id);delete audioPositions[id];musicPrefs.positions={...audioPositions};if(musicPrefs.trackId===id)musicPrefs.trackId=libraryEntries()[0]?.[0]||'';
 persist();syncAudio({resume:true});if(!t.builtIn&&t.data?.startsWith('blob:'))URL.revokeObjectURL(t.data);refreshLibrarySettings();toast('Track removed from your library.');
}
function restoreSuppliedTracks(){musicPrefs.hiddenBuiltIns=[];if(!currentTrack())musicPrefs.trackId=builtInTracks.keys().next().value;persist();syncAudio({resume:true});refreshLibrarySettings();}

// Motion uses local CSS and browser APIs; it makes no network requests.
let navTransition=null,navEpoch=0,pressTarget=null,motionObserver=null,motionStarted=false;
const motionTargets=new Set();
const reducedMotion=()=>motionPrefs.speed===0||!!window.matchMedia?.('(prefers-reduced-motion: reduce)')?.matches;
const nextFrame=fn=>window.requestAnimationFrame?window.requestAnimationFrame(fn):fn();
function refreshMotion(root=document){
 if(!motionStarted)return;
 for(const node of motionTargets){if(!node.isConnected){motionObserver?.unobserve(node);motionTargets.delete(node);}}
 root.querySelectorAll('.monster-visual img,.profile-hero>img,.home-monster img,.hero-encounter img').forEach(node=>{
  if(motionTargets.has(node))return;
  const seed=[...(node.alt||'monster')].reduce((n,c)=>n+c.charCodeAt(0),0);
  node.style.setProperty('--idle-time',(5.2+(seed%22)/10)+'s');
  node.style.setProperty('--idle-delay',(-((seed%42)/10))+'s');
  node.classList.add('monster-art');motionTargets.add(node);
  if(motionObserver)motionObserver.observe(node);else node.classList.add('motion-visible');
 });
}
function editionFallback(){
 if(reducedMotion())return;const main=$('main');main.classList.remove('edition-shift');void main.offsetWidth;main.classList.add('edition-shift');main.addEventListener('animationend',()=>main.classList.remove('edition-shift'),{once:true});motionLater(()=>main.classList.remove('edition-shift'),600);
}

function navigate(mode=S.edition,view=S.view,scroll=true,animateFrame=false){
 if(!validMode(mode)||!validView(view))return;
 const token=++navEpoch,changed=mode!==S.edition;
 if(navTransition){navTransition.skipTransition?.();navTransition=null;}
 const run=()=>{if(token===navEpoch)applyNavigation(mode,view,scroll);};
 if((changed||view!==S.view)&&animateFrame&&!reducedMotion()){
  document.documentElement.style.setProperty('--edition-direction',mode==='iceborne'?'1':'-1');
  if(typeof document.startViewTransition==='function'){
   try{
    const transition=document.startViewTransition(run);navTransition=transition;
    transition.ready?.catch(()=>{});transition.updateCallbackDone?.catch(()=>{});
    Promise.resolve(transition.finished).catch(()=>{}).finally(()=>{if(navTransition===transition)navTransition=null;});
    return;
   }catch{}
  }
  if(typeof $('main').animate==='function'){blurPanel($('main'),run);return;}run();editionFallback();return;
 }
 run();
}
function releasePress(){
 if(pressTarget){pressTarget.classList.remove('is-pressed');pressTarget=null;}
}
function pressFeedback(button,event){
 if(!button||button.disabled||reducedMotion())return;
 releasePress();pressTarget=button;button.classList.add('is-pressed');
 const rect=button.getBoundingClientRect(),clip=document.createElement('span'),wave=document.createElement('i');
 clip.className='touch-ripple';clip.setAttribute('aria-hidden','true');
 const x=Number.isFinite(event?.clientX)&&event.clientX!==0?event.clientX-rect.left:rect.width/2;
 const y=Number.isFinite(event?.clientY)&&event.clientY!==0?event.clientY-rect.top:rect.height/2;
 const size=Math.max(rect.width,rect.height,36)*2;
 wave.style.cssText=`left:${x}px;top:${y}px;width:${size}px;height:${size}px`;
 clip.append(wave);button.append(clip);
 const remove=()=>clip.remove();wave.addEventListener('animationend',remove,{once:true});motionLater(remove,750);
}
function animateMonsterArrival(origin){const node=$('detailBody').querySelector('.profile-hero>img');if(!origin||!node||typeof node.animate!=='function'||reducedMotion())return;nextFrame(()=>{if(node.isConnected)animateUI(node,[{filter:'blur(5px)',opacity:.3},{filter:'blur(0px)',opacity:1}],{duration:360,easing:'ease-out'});});}
function initializeMotion(){
 motionStarted=true;
 if(typeof window.IntersectionObserver==='function'){
  document.documentElement.classList.add('motion-ready');
  motionObserver=new window.IntersectionObserver(entries=>entries.forEach(entry=>entry.target.classList.toggle('motion-visible',entry.isIntersecting)),{rootMargin:'50px',threshold:.01});
 }else document.documentElement.classList.remove('motion-ready');
 document.addEventListener('pointerdown',event=>{const button=event.target.closest?.('button,.file-label');if(button)pressFeedback(button,event);},{passive:true});
 document.addEventListener('pointerup',releasePress,{passive:true});document.addEventListener('pointercancel',releasePress,{passive:true});window.addEventListener('blur',releasePress);
 document.addEventListener('click',event=>{if(event.detail===0){const button=event.target.closest?.('button,.file-label');if(button){pressFeedback(button);nextFrame(releasePress);}}},{capture:true});
 let pointerFrame=0;
 document.addEventListener('pointermove',event=>{
  if(event.pointerType!=='mouse'||reducedMotion()||pointerFrame)return;
  const card=event.target.closest?.('.monster-card,.profile-hero,.home-monster');if(!card)return;
  const node=card.querySelector('.monster-visual img,.profile-hero>img,img');if(!node)return;
  const apply=()=>{pointerFrame=0;if(!card.isConnected)return;const r=card.getBoundingClientRect();if(!r.width||!r.height)return;node.style.setProperty('--art-x',((event.clientX-r.left)/r.width-.5)*9+'px');node.style.setProperty('--art-y',((event.clientY-r.top)/r.height-.5)*6+'px');};
  if(window.requestAnimationFrame)pointerFrame=window.requestAnimationFrame(apply);else apply();
 },{passive:true});
 document.addEventListener('pointerout',event=>{const card=event.target.closest?.('.monster-card,.profile-hero,.home-monster');if(card&&!card.contains(event.relatedTarget)){const node=card.querySelector('.monster-visual img,.profile-hero>img,img');if(node){node.style.setProperty('--art-x','0px');node.style.setProperty('--art-y','0px');}}},{passive:true});
 document.addEventListener('visibilitychange',()=>document.documentElement.classList.toggle('motion-paused',document.hidden));
 document.addEventListener('keydown',event=>{if(['worldTab','iceborneTab'].includes(document.activeElement?.id)&&['ArrowLeft','ArrowRight','Home','End'].includes(event.key)){event.preventDefault();const mode=event.key==='ArrowLeft'||event.key==='Home'?'world':'iceborne';navigate(mode,S.view,true,true);$(mode+'Tab').focus();}});
}

const DB=D.database||{items:[],recipes:[],weapons:[],monsters:{},quests:[]};
const itemKey=name=>String(name||'').normalize('NFKC').replace(/[’‘]/g,"'").replace(/[–—]/g,'-').trim().toLowerCase();
const poolLookup=new Map(),poolIds=new WeakMap();let poolSerial=0;
const itemIndex=new Map(),weaponIndex=new Map((DB.weapons||[]).map(w=>[w.id,w]));
const recipeState={method:'craft',q:'',category:'all',game:'all',rank:'all'};
let weaponState=null,monsterState=null,itemReturnFocus=null;
let savedPanelMode='saved',editingBookmarks=false;
function getEntry(k){const pos=k.indexOf(':'),kind=k.slice(0,pos),id=k.slice(pos+1);const hit=searchIndex().find(x=>x.kind===kind&&x.id===id);return hit?{kind,id,title:hit.title,x:hit}:null;}
function renderSaved(query=''){
 const tabs=`<div class="database-tabs bookmark-tabs" role="tablist" aria-label="Bookmarks"><button role="tab" data-bookmark-tab="saved" aria-selected="${savedPanelMode==='saved'}">Saved</button><button role="tab" data-bookmark-tab="add" aria-selected="${savedPanelMode==='add'}">Add bookmarks</button>${savedPanelMode==='saved'?`<button class="bookmark-edit" data-bookmark-edit>${editingBookmarks?'Done':'Edit'}</button>`:''}</div>`;
 const field=`<label class="filter-search bookmark-search"><input id="savedPickerSearch" type="search" placeholder="${savedPanelMode==='add'?'Find a monster, weapon, item, map…':'Search saved entries…'}" aria-label="Search bookmarks" value="${E(query)}"></label>`;
 $('savedList').innerHTML=tabs+field+'<div id="bookmarkRows"></div>';
 const note=$('savedDialog').querySelector('p.quiet');if(note)note.hidden=true;renderBookmarkRows(query);
}
function renderBookmarkRows(query=''){
 const terms=query.toLowerCase().trim().split(/\s+/).filter(Boolean),allowed=new Set(['monster','weapon','weaponRecord','guide','locale','databaseItem','recipeRecord','questRecord','skill','build','progress','catalogue','atlas']);
 let entries=savedPanelMode==='saved'?S.saved.map(getEntry).filter(Boolean).map(e=>({...e.x,key:e.kind+':'+e.id})):searchIndex().filter(x=>allowed.has(x.kind)).map(x=>({...x,key:x.kind+':'+x.id}));
 entries=entries.filter(x=>terms.every(t=>(x.title+' '+x.sub).toLowerCase().includes(t)));
 const total=entries.length;if(savedPanelMode==='add')entries=entries.slice(0,60);
 $('bookmarkRows').innerHTML=(savedPanelMode==='add'?`<p class="bookmark-count">${total} matches${total>60?' · top 60':''}</p>`:'')+(entries.length?entries.map(x=>`<div class="saved-row"><button data-bookmark-open="${E(x.key)}"><strong>${E(x.title)}</strong><small>${E(x.sub||x.kind)}</small></button>${savedPanelMode==='saved'&&editingBookmarks?`<button class="bookmark-remove" data-save="${E(x.key)}" aria-label="Remove ${E(x.title)} bookmark">${icon('trash')} Remove</button>`:savedPanelMode==='add'?`<button class="bookmark-add ${saved(x.key)?'active':''}" data-save="${E(x.key)}" aria-pressed="${saved(x.key)}" aria-label="${saved(x.key)?'Remove':'Add'} ${E(x.title)} bookmark">${icon(saved(x.key)?'check':'bookmark')}${saved(x.key)?'Added':'Add'}</button>`:saveButton(x.key)}</div>`).join(''):'<div class="empty-state"><h3>No saved entries</h3></div>');
}
function ensureItem(name){const key=itemKey(name);if(!key)return null;if(!itemIndex.has(key))itemIndex.set(key,{name,sources:[],madeBy:[],usedBy:[]});return itemIndex.get(key);}
for(const item of DB.items||[]){const key=itemKey(item.name),old=itemIndex.get(key);itemIndex.set(key,{...old,...item,sources:[...(old?.sources||[]),...(item.sources||[])],madeBy:[],usedBy:[]});}
for(const r of DB.recipes||[]){const out=ensureItem(r.result?.name);if(out)out.madeBy.push(r);for(const a of [...(r.ingredients||[]),...(r.inputPool||[])].filter(a=>a.kind!=='weapon')){const it=ensureItem(a.name);if(it)it.usedBy.push({kind:'recipe',id:r.id,name:r.name});}for(const a of r.pool||[])if(a.name&&a.kind!=='weapon')ensureItem(a.name)?.madeBy.push(r);}
for(const w of DB.weapons||[])for(const path of ['forge','upgrade'])for(const a of w[path]?.materials||[]){const it=ensureItem(a.name);if(it)it.usedBy.push({kind:'weapon',id:w.id,name:w.name,path});}
for(const [id,m] of Object.entries(DB.monsters||{}))for(const r of m.rewards||[]){const it=ensureItem(r.item||r.name);if(it)it.sources.push({kind:'monster',monsterId:id,monster:m.name,rank:r.rank,method:r.condition||r.method,quantity:r.quantity,chance:r.chance});}
function itemButton(name,quantity=null){return `<button class="item-link" data-item="${E(name)}">${E(name)}</button>${quantity!=null?' ×'+E(quantity):''}`;}
function ingredientsHTML(rows=[]){return rows.length?`<ul class="ingredient-list">${rows.map(a=>`<li>${itemButton(a.name,a.quantity)}${a.points!=null?` <small>${E(a.points)} pts each</small>`:''}</li>`).join('')}</ul>`:'—';}
function tableHTML(headers,rows,cls=''){return `<div class="db-table-scroll"><table class="db-table ${cls}"><thead><tr>${headers.map(h=>`<th scope="col">${E(h)}</th>`).join('')}</tr></thead><tbody>${rows.join('')||`<tr><td colspan="${headers.length}">No matching records.</td></tr>`}</tbody></table></div>`;}
const shown=v=>v==null||v===''?'—':E(v);
const num=v=>Number.isFinite(+v)&&v!==null&&v!==''?Number(v).toLocaleString('en-US'):shown(v);
function costHTML(c){if(c==null)return'—';if(typeof c==='number')return `${num(c)} z`;return Object.entries(c).filter(([,v])=>v!==null&&v!=='').map(([k,v])=>`${num(v)} ${E(({zenny:'z',researchPoints:'research pts',meldingPoints:'melding pts',awakeningPoints:'awakening pts'})[k]||k)}`).join('<br>')||'—';}
function optionHTML(value,label,current){return `<option value="${E(value)}" ${String(value)===String(current)?'selected':''}>${E(label)}</option>`;}
function poolRowHTML(a){return typeof a==='string'?`<li>${itemButton(a)}</li>`:`<li>${a.name?(a.kind==='weapon'?`<button class="text-btn" data-jump-weapon="${E(a.id)}">${E(a.name)}</button>`:itemButton(a.name,a.quantity)):E(a.label||a.type||'')}${a.chance!=null?` · ${E(a.chance)}%`:''}${a.points!=null?` · ${E(a.points)} pts`:''}${a.weight!=null?` · weight ${E(a.weight)}`:''}</li>`;}
function poolHTML(pool,label='Reward pool'){
 if(!pool?.length)return'';
 if(pool.length<=4)return `<ul class="ingredient-list">${pool.map(poolRowHTML).join('')}</ul>`;
 let id=poolIds.get(pool);if(!id){id=String(++poolSerial);poolIds.set(pool,id);poolLookup.set(id,pool);}
 return `<details class="pool-details" data-pool="${id}"><summary>${E(label)} · ${pool.length}</summary><ul></ul></details>`;
}
document.addEventListener('toggle',event=>{const el=event.target;if(el.matches?.('details[data-pool]')&&el.open&&!el.dataset.loaded){el.querySelector('ul').innerHTML=(poolLookup.get(el.dataset.pool)||[]).map(poolRowHTML).join('');el.dataset.loaded='true';}},true);

function renderPreparation(){
 const r=recipeState,all=DB.recipes||[],group=all.filter(x=>x.method===r.method),categories=[...new Set(group.map(x=>x.category).filter(Boolean))].sort();
 if(!categories.includes(r.category))r.category='all';
 $('view-preparation').innerHTML=`<div class="page-wrap recipe-page">${intro('WORLD + ICEBORNE / WORKSHOP','Recipe','')}<div class="database-tabs" role="tablist" aria-label="Recipe methods">${[['craft','Crafting List'],['meld','Elder Melder']].map(([id,label])=>`<button role="tab" data-recipe-method="${id}" aria-selected="${r.method===id}">${label}</button>`).join('')}</div><div class="db-shell"><div class="db-toolbar"><div class="filter-search"><input id="recipeSearch" type="search" value="${E(r.q)}" placeholder="Search item or ingredient…" aria-label="Search recipes"></div><select id="recipeCategory" aria-label="Recipe category">${optionHTML('all','All categories',r.category)}${categories.map(c=>optionHTML(c,c,r.category)).join('')}</select><select id="recipeGame" aria-label="Recipe game">${[['all','Both games'],['world','World'],['iceborne','Iceborne']].map(([id,label])=>optionHTML(id,label,r.game)).join('')}</select><select id="recipeRank" aria-label="Recipe rank">${[['all','All ranks'],['LR','Low Rank'],['HR','High Rank'],['MR','Master Rank']].map(([id,label])=>optionHTML(id,label,r.rank)).join('')}</select></div><div id="recipeMeta" class="db-meta"></div><div id="recipeRows"></div></div></div>`;
 renderRecipeRows();
}
function recipeMatches(r){const s=recipeState,terms=s.q.toLowerCase().trim().split(/\s+/).filter(Boolean);return r.method===s.method&&(s.category==='all'||r.category===s.category)&&(s.game==='all'||r.game===s.game||r.game==='both')&&(s.rank==='all'||r.rank===s.rank||r.rank==='all'||r.rank==='both'||!r.rank)&&terms.every(t=>factText(r).toLowerCase().includes(t));}
function renderRecipeRows(){
 if(!$('recipeRows'))return;const rows=(DB.recipes||[]).filter(recipeMatches);$('recipeMeta').textContent=`${rows.length} recipes`;
 $('recipeRows').innerHTML=tableHTML(['Result','Ingredients / input pool','Output','Cost / unlock'],rows.map(r=>`<tr data-recipe-id="${E(r.id)}"><td>${r.result?.name?itemButton(r.result.name):E(r.name)}${r.result&&r.name!==r.result?.name?`<small>${E(r.name)}</small>`:''}<small>${E(r.category||'')} · ${r.game==='iceborne'?'Iceborne':r.game==='world'?'World':'World + Iceborne'}</small>${poolHTML(r.pool,'Possible results')}</td><td>${ingredientsHTML(r.ingredients)}${poolHTML(r.inputPool,'Accepted materials')}${r.inputDescription?`<small>${E(r.inputDescription)}</small>`:''}</td><td>${r.result?.quantity!=null?E(r.result.quantity):r.outputQuantity!=null?E(r.outputQuantity):r.pool?.length?'Random':shown(r.output)}${r.notes?`<small>${E(r.notes)}</small>`:''}</td><td><span class="recipe-cost">${costHTML(r.cost)}</span>${r.unlock?`<small>${E(r.unlock)}</small>`:''}</td></tr>`),'recipe-table');
}
function jumpRecipe(id){const r=DB.recipes.find(x=>x.id===id);if(!r)return;closeDialog('searchDialog');if($('itemDialog').open)closeDialog('itemDialog');if($('detailDialog').open)closeDialog('detailDialog');Object.assign(recipeState,{method:r.method,q:r.name,category:'all',game:'all',rank:'all'});navigate(S.edition,'preparation');renderPreparation();}
function openItem(name){
 const it=itemIndex.get(itemKey(name))||ensureItem(name);if(!it)return;const d=$('itemDialog');if(!d.open)itemReturnFocus=document.activeElement;
 const facts=[['Rarity',it.rarity],['Carry',it.carry],['Sell',it.sell!=null?it.sell+' z':null]].filter(([,v])=>v!=null&&v!=='');
 $('itemBody').innerHTML=`<header class="item-header"><p class="eyebrow">${E(it.category||'ITEM')}</p><h2>${E(it.name)}</h2>${it.description?`<p>${E(it.description)}</p>`:''}<div class="pill-row">${facts.map(([k,v])=>pill(k+' '+v)).join('')}</div></header><div class="item-body">${it.madeBy?.length?`<h3>Recipes</h3>${tableHTML(['Method','Ingredients','Cost'],it.madeBy.map(r=>`<tr><td><button class="text-btn" data-jump-recipe="${E(r.id)}">${E(r.name)}</button><small>${r.method==='meld'?'Elder Melder':'Crafting List'}</small></td><td>${ingredientsHTML(r.ingredients)}${poolHTML(r.inputPool,'Accepted materials')}</td><td>${costHTML(r.cost)}</td></tr>`))}`:''}<h3>Where to find</h3>${renderItemSources(it)}${it.usedBy?.length?`<h3>Used in</h3>${tableHTML(['Recipe / weapon','Method'],it.usedBy.map(x=>`<tr><td><button class="text-btn" ${x.kind==='weapon'?`data-jump-weapon="${E(x.id)}"`:`data-jump-recipe="${E(x.id)}"`}>${E(x.name)}</button></td><td>${x.path?E(x.path):'Recipe'}</td></tr>`))}`:''}<button class="secondary-btn item-back" data-close="itemDialog">${icon('arrow')} Back</button></div>`;
 if(!d.open){if(d.showModal)d.showModal();else d.setAttribute('open','');}d.scrollTop=0;document.body.style.overflow='hidden';paintIcons(d);
}
function renderItemSources(it){
 const seen=new Set(),rows=(it.sources||[]).filter(s=>{const k=JSON.stringify(s);if(seen.has(k))return false;seen.add(k);return true;});
 const vendor='';
 if(!rows.length&&!vendor)return `<div class="data-empty">${it.madeBy?.length?'Crafting or melding recipes shown above.':'No acquisition record in the embedded source.'}</div>`;
 return tableHTML(['Source','Method / area','Rank','Yield / rate'],[...(vendor?[vendor]:[]),...rows.map(s=>{const title=s.monster||s.locale||s.quest||s.source||s.name||s.kind,where=s.monsterId?`<button class="text-btn" data-jump-monster="${E(s.monsterId)}">${E(title)}</button>`:s.questId?`<button class="text-btn" data-open-quest="${E(s.questId)}">${E(title)}</button>`:E(title),method=[s.method,s.area!=null?'Area '+s.area:null,s.node,s.condition,s.group].filter(Boolean).join(' · ');return `<tr><td>${where}</td><td>${E(method||s.kind)}</td><td>${shown(s.rank)}</td><td>${s.quantity!=null?'×'+E(s.quantity):''}${s.chance!=null?' · '+E(s.chance)+'%':''}${s.nodes!=null?`<small>${E(s.nodes)} nodes</small>`:''}</td></tr>`;})]);
}
function resetDetailClass(){for(const c of ['locale-dialog','weapon-record-dialog','monster-record-dialog','catalogue-dialog','atlas-dialog','compendium-dialog'])$('detailDialog').classList.remove(c);}
function recordTabs(tabs,current,attribute){return `<div class="record-tabs" role="tablist">${tabs.map(([id,label])=>`<button role="tab" id="${attribute}-${id}" data-${attribute}="${id}" aria-selected="${current===id}" aria-controls="recordPanel">${label}</button>`).join('')}</div>`;}
function openWeapon(id,options={}){
 const w=D.weapons.find(x=>x.id===id);if(!w)return;resetDetailClass();$('detailDialog').classList.add('weapon-record-dialog');
 weaponState={type:id,tab:options.tab||'guide',q:'',rank:'all',rarity:'all',element:'all',obtain:'all',selected:options.selected||null,path:'upgrade',tree:{zoom:1,x:0,y:0},family:'all'};
 $('detailBody').innerHTML=`<div class="weapon-detail-head">${weaponSigil(w)}<div><p class="eyebrow">${S.edition.toUpperCase()} / WEAPON HANDBOOK</p><h2>${E(w.name)}</h2></div></div><div class="profile-content">${recordTabs([['guide','Guide'],['database','Database'],['tree','Family Tree']],weaponState.tab,'weapon-tab')}<div id="recordPanel" class="record-panel" role="tabpanel"></div></div>`;
 renderWeaponPanel();openDialog('detailDialog');
}
function setWeaponTab(tab){if(!weaponState||!['guide','database','tree'].includes(tab))return;weaponState.tab=tab;document.querySelectorAll('[data-weapon-tab]').forEach(b=>b.setAttribute('aria-selected',String(b.dataset.weaponTab===tab)));blurPanel($('recordPanel'),renderWeaponPanel);}
function renderWeaponPanel(){
 const s=weaponState;if(!s||!$('recordPanel'))return;const w=D.weapons.find(x=>x.id===s.type),p=$('recordPanel');p.setAttribute('aria-labelledby','weapon-tab-'+s.tab);
 if(s.tab==='guide'){p.innerHTML=`<div class="pill-row">${pill(w.role,'accent')}${pill(w.complexity+' learning curve')}${saveButton('weapon:'+w.id)}</div><div class="profile-grid"><div><h4>Strengths</h4>${list(w.strengths)}</div><div><h4>Tradeoffs</h4>${list(w.tradeoffs)}</div><div><h4>Movement & reach</h4><p>${E(w.mobility)}</p><p>${E(w.reach)}</p></div><div><h4>Defensive options</h4><p>${E(w.defense)}</p></div></div><h3>World foundation loop</h3><ol class="loop-list">${w.loop.map(t=>`<li>${E(t)}</li>`).join('')}</ol>${S.edition==='iceborne'?`<div class="advice-box"><p class="eyebrow">ICEBORNE</p><p>${E(w.iceborne)}</p></div>${w.iceborneLoop?.length?`<ol class="loop-list">${w.iceborneLoop.map(t=>`<li>${E(t)}</li>`).join('')}</ol>`:''}`:''}<div class="profile-grid"><div><h4>Useful skills</h4>${list(w.skills)}</div><div><h4>Common mistakes</h4>${list(w.mistakes)}</div></div><div class="advice-box"><p class="eyebrow">EQUIPMENT DIRECTION</p><p>${E(S.edition==='iceborne'?w.iceborneProgression||w.progression:w.worldProgression||w.progression)}</p></div>`;
 }else if(s.tab==='database')renderWeaponDatabase();else renderWeaponTree();
 paintIcons(p);
}
function typeWeapons(){return (DB.weapons||[]).filter(w=>w.type===weaponState.type&&(S.edition==='iceborne'||w.game!=='iceborne'));}
function elementNames(w){return (w.elements||[]).map(e=>typeof e==='string'?e:e.type||e.name).filter(Boolean);}
function renderWeaponDatabase(){
 const s=weaponState,all=typeWeapons(),rarities=[...new Set(all.map(w=>w.rarity))].sort((a,b)=>a-b),elements=[...new Set(all.flatMap(elementNames))].sort();
 $('recordPanel').innerHTML=`<div class="db-shell"><div class="db-toolbar"><div class="filter-search"><input id="weaponDatabaseSearch" value="${E(s.q)}" type="search" placeholder="Search ${E(D.weapons.find(w=>w.id===s.type).name)} database…" aria-label="Search this weapon database"></div><select id="weaponRank" aria-label="Weapon rank">${[['all','All ranks'],['LR','Low Rank'],['HR','High Rank'],['MR','Master Rank']].map(([id,label])=>optionHTML(id,label,s.rank)).join('')}</select><select id="weaponRarity" aria-label="Weapon rarity">${optionHTML('all','All rarities',s.rarity)}${rarities.map(r=>optionHTML(r,'Rarity '+r,s.rarity)).join('')}</select><select id="weaponElement" aria-label="Weapon element or status">${optionHTML('all','All elements',s.element)}${optionHTML('none','No element',s.element)}${elements.map(e=>optionHTML(e,e,s.element)).join('')}</select><select id="weaponObtain" aria-label="Weapon obtain method">${[['all','All paths'],['forge','Forge'],['upgrade','Upgrade'],['reward','Rewards']].map(([id,label])=>optionHTML(id,label,s.obtain)).join('')}</select></div><div id="weaponDatabaseMeta" class="db-meta"></div><div class="weapon-db-layout"><div class="db-shell"><div id="weaponDatabaseRows" class="db-table-scroll"></div></div><aside id="weaponMaterials" class="weapon-materials" aria-live="polite"></aside></div></div>`;renderWeaponRows();
}
function filteredWeapons(){const s=weaponState,terms=s.q.toLowerCase().trim().split(/\s+/).filter(Boolean);return typeWeapons().filter(w=>(s.rank==='all'||w.rank===s.rank)&&(s.rarity==='all'||String(w.rarity)===s.rarity)&&(s.element==='all'||s.element==='none'&&!elementNames(w).length||elementNames(w).includes(s.element))&&(s.obtain==='all'||s.obtain==='reward'&&!w.forge&&!w.upgrade||s.obtain==='forge'&&w.forge||s.obtain==='upgrade'&&w.upgrade)&&terms.every(t=>[w.name,...elementNames(w),w.family||'',factText(w.attributes)].join(' ').toLowerCase().includes(t)));}
function renderWeaponRows(){
 const s=weaponState,rows=filteredWeapons();if(!rows.some(w=>w.id===s.selected))s.selected=rows[0]?.id||null;
 $('weaponDatabaseMeta').textContent=`${rows.length} weapons`;
 $('weaponDatabaseRows').innerHTML=`<table class="db-table"><thead><tr>${['Weapon','Rarity','Attack','Affinity','Element / status'].map(x=>`<th>${x}</th>`).join('')}</tr></thead><tbody>${rows.map(w=>`<tr data-weapon-row="${E(w.id)}" data-selected="${w.id===s.selected}"><td><button class="weapon-name-btn" data-select-weapon="${E(w.id)}">${E(w.name)}</button><small>${E(w.rank)}</small></td><td>${shown(w.rarity)}</td><td>${shown(w.attack)}</td><td>${w.affinity!=null?E(w.affinity)+'%':'—'}</td><td>${weaponElementsHTML(w)}</td></tr>`).join('')||'<tr><td colspan="5">No matching weapons.</td></tr>'}</tbody></table>`;renderWeaponMaterials();
}
function weaponElementsHTML(w){return (w.elements||[]).map(e=>typeof e==='string'?E(e):`${E(e.type||e.name)} ${shown(e.value||e.damage)}${e.hidden?' (hidden)':''}`).join('<br>')||'—';}
function pathButtons(w){return `<div class="segmented" aria-label="Crafting path">${['forge','upgrade'].map(p=>`<button data-weapon-path="${p}" aria-pressed="${weaponState.path===p}" ${!w[p]?'disabled':''}>${p==='forge'?'Forge':'Upgrade'}</button>`).join('')}</div>`;}
function normalizeWeaponPath(w){if(!w[weaponState.path])weaponState.path=w.upgrade?'upgrade':'forge';}
function obtainHTML(w){const o=w.obtain;return Array.isArray(o)?o.map(x=>typeof x==='string'?E(x):E(x.description||x.method||x.name||'')).join('<br>'):typeof o==='string'?E(o):E(o?.description||o?.method||'Quest or appraisal reward');}
function renderWeaponMaterials(){
 const w=weaponIndex.get(weaponState.selected),el=$('weaponMaterials');if(!el)return;if(!w){el.innerHTML='<div class="data-empty">Choose a weapon.</div>';return;}normalizeWeaponPath(w);const path=w[weaponState.path];
 const slots=Array.isArray(w.slots)?w.slots.map(x=>typeof x==='object'?x.rank||x.level:x).filter(Boolean).join(' · '):w.slots;
 el.innerHTML=`<div class="selected-weapon-heading"><h3>${E(w.name)}</h3>${saveButton('weaponRecord:'+w.id)}</div><dl class="weapon-stats"><div><dt>Attack</dt><dd>${shown(w.attack)}</dd></div><div><dt>Affinity</dt><dd>${shown(w.affinity)}%</dd></div><div><dt>Rarity</dt><dd>${shown(w.rarity)}</dd></div><div><dt>Defense</dt><dd>${shown(w.defense||0)}</dd></div><div class="stat-wide"><dt>Element / status</dt><dd>${weaponElementsHTML(w)}</dd></div><div class="stat-wide"><dt>Slots</dt><dd>${shown(slots||'None')}</dd></div>${sharpnessHTML(w)}${weaponAttributesHTML(w)}</dl>${w.forge||w.upgrade?`${pathButtons(w)}${weaponState.path==='upgrade'&&w.parent?`<p class="source-condition">From <button class="text-btn" data-select-weapon="${E(w.parent)}">${E(weaponIndex.get(w.parent)?.name||w.parent)}</button></p>`:''}${ingredientsHTML(path?.materials)}<p class="material-cost">${path?.zenny!=null?num(path.zenny)+' z':'Price not supplied'}</p>`:`<div class="advice-box">${obtainHTML(w)}</div>`}`;
}
function sharpnessHTML(w){if(!w.sharpness)return'';const colours=['#c54036','#d9712f','#d8bd52','#75a154','#5293ca','#ecebdc','#a883ce'];let values=Array.isArray(w.sharpness)?w.sharpness:Object.values(w.sharpness);if(values.some(x=>typeof x!=='number'))return'';const sum=values.reduce((a,b)=>a+b,0)||1;return `<div class="stat-wide"><dt>Sharpness</dt><dd><span class="sharpness">${values.map((v,i)=>`<i style="width:${v/sum*100}%;background:${colours[i]||colours[6]}"></i>`).join('')}</span></dd></div>`;}
function weaponAttributesHTML(w){return Object.entries(w.attributes||{}).filter(([,v])=>v!=null&&v!==''&&v!==false).map(([k,v])=>`<div class="stat-wide"><dt>${E(k.replace(/([A-Z])/g,' $1'))}</dt><dd>${E(typeof v==='object'?JSON.stringify(v):v)}</dd></div>`).join('');}
function selectWeapon(id){const w=weaponIndex.get(id);if(!w||w.type!==weaponState?.type)return;weaponState.selected=id;document.querySelectorAll('[data-weapon-row],[data-tree-node]').forEach(n=>n.dataset.selected=String((n.dataset.weaponRow||n.dataset.treeNode)===id));if(weaponState.tab==='tree')renderTreeMaterials();else renderWeaponMaterials();}
function jumpWeapon(id){const w=weaponIndex.get(id);if(!w)return;if($('itemDialog').open)closeDialog('itemDialog');if(w.game==='iceborne'&&S.edition!=='iceborne')navigate('iceborne','weapons');openWeapon(w.type,{tab:'database',selected:id});}
function treeRoot(w,byId){const seen=new Set();while(w.parent&&byId.has(w.parent)&&!seen.has(w.id)){seen.add(w.id);w=byId.get(w.parent);}return w;}
function renderWeaponTree(){
 const s=weaponState,all=typeWeapons(),byId=new Map(all.map(w=>[w.id,w])),roots=[...new Map(all.map(w=>{const r=treeRoot(w,byId);return[r.id,r];})).values()];
 if(s.family!=='all'&&!byId.has(s.family))s.family='all';
 $('recordPanel').innerHTML=`<div class="db-shell"><div class="tree-toolbar"><select id="weaponTreeFamily" class="db-filter tree-filter" aria-label="Weapon family">${optionHTML('all','All weapon families',s.family)}${roots.map(r=>optionHTML(r.id,r.name,s.family)).join('')}</select><div class="tree-controls"><output id="treeZoomValue">100%</output><button class="text-btn" data-tree-reset>Reset</button></div></div><div id="weaponTreeViewport" class="tree-viewport" tabindex="0" role="group" aria-label="Weapon family tree. Pinch to zoom and drag to pan."><div id="weaponTreeCanvas" class="tree-canvas"></div></div><div id="treeMaterials" class="tree-materials" aria-live="polite"></div></div>`;
 const children=new Map();for(const w of all){if(!children.has(w.parent))children.set(w.parent,[]);children.get(w.parent).push(w);}
 let row=0;const positions=new Map(),visited=new Set();
 function visit(w,depth){if(visited.has(w.id))return;visited.add(w.id);const kids=children.get(w.id)||[];const first=row;for(const c of kids)visit(c,depth+1);if(!kids.length)row++;positions.set(w.id,{x:depth*185,y:(kids.length?(first+row-1)/2:first)*79});}
 for(const r of roots)if(s.family==='all'||r.id===s.family){visit(r,0);row+=1;}
 const visible=all.filter(w=>positions.has(w.id)),width=Math.max(400,...[...positions.values()].map(p=>p.x+180)),height=Math.max(250,row*79);
 if(!positions.has(s.selected))s.selected=visible[0]?.id||null;
 $('weaponTreeCanvas').style.width=width+'px';$('weaponTreeCanvas').style.height=height+'px';
 $('weaponTreeCanvas').innerHTML=`<svg class="tree-edges" width="${width}" height="${height}" aria-hidden="true">${visible.filter(w=>positions.has(w.parent)).map(w=>{const a=positions.get(w.parent),b=positions.get(w.id);return `<path d="M${a.x+150} ${a.y+29}H${a.x+167}V${b.y+29}H${b.x}"/>`;}).join('')}</svg>${visible.map(w=>{const p=positions.get(w.id);return `<button class="tree-node" style="left:${p.x}px;top:${p.y}px" data-tree-node="${E(w.id)}" data-select-weapon="${E(w.id)}" data-selected="${s.selected===w.id}" data-obtain="${!w.forge&&!w.upgrade?'reward':'smithy'}">${E(w.name)}</button>`;}).join('')}`;
 bindPanZoom($('weaponTreeViewport'),()=>({...s.tree}),v=>{s.tree=v;updateWeaponTree();});updateWeaponTree();renderTreeMaterials();
}
function updateWeaponTree(){const s=weaponState?.tree,canvas=$('weaponTreeCanvas'),view=$('weaponTreeViewport');if(!s||!canvas||!view)return;const rect=view.getBoundingClientRect(),width=parseFloat(canvas.style.width)||400,height=parseFloat(canvas.style.height)||250;s.x=Math.min(rect.width*.4,Math.max(-width*s.zoom+rect.width*.2,s.x));s.y=Math.min(rect.height*.4,Math.max(-height*s.zoom+rect.height*.2,s.y));canvas.style.transform=`translate(${s.x}px,${s.y}px) scale(${s.zoom})`;$('treeZoomValue').textContent=Math.round(s.zoom*100)+'%';}
function renderTreeMaterials(){const w=weaponIndex.get(weaponState.selected),el=$('treeMaterials');if(!el)return;if(!w){el.innerHTML='';return;}normalizeWeaponPath(w);const path=w[weaponState.path];el.innerHTML=`<h3>${E(w.name)}</h3>${w.forge||w.upgrade?`${pathButtons(w)}${ingredientsHTML(path?.materials)}<p class="material-cost">${path?.zenny!=null?num(path.zenny)+' z':'Price not supplied'}</p>`:`<p class="source-condition">${obtainHTML(w)}</p>`}`;}
function openMonster(id,originButton=null){
 const m=D.monsters.find(x=>x.id===id);if(!m)return;resetDetailClass();$('detailDialog').classList.add('monster-record-dialog');const origin=originButton?.querySelector('img')?.getBoundingClientRect();
 const needMode=m.game==='iceborne'?'iceborne':removedMR.has(m.id)?'world':S.edition;if(needMode!==S.edition)navigate(needMode,'bestiary');
 const db=DB.monsters[id]||{},ranks=[...new Set((db.rewards||[]).map(x=>x.rank).filter(Boolean))];monsterState={id,tab:'overview',rank:ranks.includes(S.edition==='iceborne'?'MR':'HR')?(S.edition==='iceborne'?'MR':'HR'):'all',rewardQ:'',rewardMethod:'all',questQ:'',encounter:'quests'};
 $('detailBody').innerHTML=`<div class="profile-hero"><div class="profile-title"><p class="eyebrow">${m.game==='iceborne'?'ICEBORNE':'WORLD'} / ECOLOGICAL RESEARCH</p><h2>${E(m.name)}</h2><div class="pill-row">${pill(m.class,'accent')}${pill(m.capture?'Can be captured':'Cannot be captured')}</div>${saveButton('monster:'+id)}</div><img src="${E(m.image)}" alt="${E(m.name)} official render" width="350" height="230"></div><div class="profile-content">${monsterVideo(m)}${recordTabs([['overview','Overview'],['hitzones','Hitzones'],['ailments','Ailments'],['rewards','Materials & Rewards'],['quests','Quests']],monsterState.tab,'monster-tab')}<div id="recordPanel" class="record-panel" role="tabpanel"></div></div>`;
 renderMonsterPanel();openDialog('detailDialog');animateMonsterArrival(origin);
}
function setMonsterTab(tab){if(!monsterState||!['overview','hitzones','ailments','rewards','quests'].includes(tab))return;monsterState.tab=tab;document.querySelectorAll('[data-monster-tab]').forEach(b=>b.setAttribute('aria-selected',String(b.dataset.monsterTab===tab)));blurPanel($('recordPanel'),renderMonsterPanel);}
function monsterRankFilter(){return `<label>Rank <select id="monsterDataRank" aria-label="Monster data rank">${[['all','All ranks'],['LR','Low Rank'],['HR','High Rank'],['MR','Master Rank']].map(([id,label])=>optionHTML(id,label,monsterState.rank)).join('')}</select></label>`;}
function renderMonsterPanel(){
 const s=monsterState,m=D.monsters.find(x=>x.id===s.id),db=DB.monsters[s.id]||{},p=$('recordPanel');p.setAttribute('aria-labelledby','monster-tab-'+s.tab);
 if(s.tab==='overview'){p.innerHTML=`<div class="advice-box"><p class="eyebrow">THE HUNTING PLAN</p><p>${E(m.tip)}</p></div><div class="profile-grid"><div><h4>Elemental considerations</h4><p>${E(m.elementHint)}</p></div><div><h4>Priority targets</h4>${list(m.weakParts)}</div><div><h4>Watch for</h4>${list(m.hazards)}</div><div><h4>Parts & break goals</h4>${list(m.breaks)}</div><div><h4>Habitats</h4>${list(m.habitats)}</div><div><h4>Capture</h4><p>${m.capture?'Weaken the target, trap it, and use tranquilizers.':'Cannot be captured.'}</p></div></div>${renderMonsterBreaks(db)}`;
 }else if(s.tab==='hitzones'){p.innerHTML=tableHTML(['Part / state','Cut','Impact','Shot','Fire','Water','Thunder','Ice','Dragon','Stun'],(db.hitzones||[]).map(h=>`<tr><td>${E(h.part||h.name)}${h.state?`<small>${E(h.state)}</small>`:''}</td>${['cut','impact','shot','fire','water','thunder','ice','dragon','stun'].map(k=>`<td class="hitzone-value" data-hot="${h[k]>=(['cut','impact','shot'].includes(k)?45:20)}">${shown(h[k])}</td>`).join('')}</tr>`));
 }else if(s.tab==='ailments'){p.innerHTML=renderMonsterAilments(db);
 }else if(s.tab==='rewards'){const methods=[...new Set((db.rewards||[]).map(x=>x.condition||x.method).filter(Boolean))];p.innerHTML=`<div class="monster-data-filters">${monsterRankFilter()}<select id="monsterRewardMethod" aria-label="Reward method">${optionHTML('all','All reward methods',s.rewardMethod)}${methods.map(m=>optionHTML(m,m,s.rewardMethod)).join('')}</select><div class="filter-search"><input id="monsterRewardSearch" type="search" placeholder="Search material…" value="${E(s.rewardQ)}" aria-label="Search monster materials"></div></div><div id="monsterRewardRows"></div>`;renderMonsterRewardRows();
 }else{p.innerHTML=`<div class="segmented encounter-modes" aria-label="Encounter type">${[['quests','Quests'],...(db.guidingLands?.length?[['guiding','Guiding Lands']]:[]),...(db.expeditions?.length?[['expeditions','Expeditions']]:[])].map(([id,label])=>`<button data-encounter-mode="${id}" aria-pressed="${s.encounter===id}">${label}</button>`).join('')}</div><div class="monster-data-filters">${s.encounter!=='guiding'?monsterRankFilter():''}${s.encounter==='quests'?`<div class="filter-search"><input id="monsterQuestSearch" value="${E(s.questQ)}" placeholder="Search quest…" type="search" aria-label="Search monster quests"></div>`:''}</div><div id="monsterQuestRows"></div>`;renderMonsterQuestRows();}
 paintIcons(p);
}
function renderMonsterBreaks(db){return db.breaks?.length?`<h3>Base part thresholds</h3>${tableHTML(['Part','Flinch','Break','Sever / second break'],db.breaks.map(b=>`<tr><td>${E(b.part||b.name)}${b.notes?`<small>${E(b.notes)}</small>`:''}</td><td>${shown(b.flinch||b.flinchValue)}</td><td>${shown(b.break||b.breakValue)}</td><td>${shown(b.sever||b.secondBreak||b.severValue)}</td></tr>`))}`:'';}
function renderMonsterAilments(db){return `<div class="monster-data-filters">${monsterRankFilter()}</div>`+tableHTML(['Ailment (base)','Initial buildup','Increase','Maximum','Decay','Duration','Damage'],(db.ailments||[]).map(a=>{const damage=a.damageByRank&&['HR','MR'].includes(monsterState.rank)?a.damageByRank[monsterState.rank]:a.damage;return `<tr><td>${E(a.name||a.ailment||a.type)}${a.state?`<small>${E(a.state)}</small>`:''}</td><td>${shown(a.initial??a.base)}</td><td>${shown(a.increase??a.buildup)}</td><td>${shown(a.max??a.maximum)}</td><td>${shown(a.decay)}</td><td>${a.duration!=null?E(a.duration)+' s':shown(a.durationText)}</td><td>${shown(damage)}</td></tr>`;}));}

function renderMonsterRewardRows(){
 const s=monsterState,db=DB.monsters[s.id]||{},q=s.rewardQ.toLowerCase(),rows=(db.rewards||[]).filter(r=>(s.rank==='all'||r.rank===s.rank)&&(s.rewardMethod==='all'||(r.condition||r.method)===s.rewardMethod)&&(!q||(r.item||r.name||'').toLowerCase().includes(q)));
 $('monsterRewardRows').innerHTML=tableHTML(['Material','Rank','Method','Quantity','Chance'],rows.map(r=>`<tr><td>${itemButton(r.item||r.name)}</td><td>${E(r.rank)}</td><td>${E(r.condition||r.method)}</td><td>${shown(r.quantity)}</td><td>${r.chance!=null?E(r.chance)+'%':'—'}</td></tr>`));
}
function monsterQuests(){const s=monsterState,db=DB.monsters[s.id]||{};return (DB.quests||[]).filter(q=>(db.questIds||[]).includes(q.id)||(q.monsters||[]).some(m=>m.id===s.id||m.monsterId===s.id));}
function renderMonsterQuestRows(){
 const s=monsterState,db=DB.monsters[s.id]||{};
 if(s.encounter==='guiding'){$('monsterQuestRows').innerHTML=tableHTML(['Region level','Players','Health','Attack','Defense','Part','Ailment buildup','Ailment threshold','Stun','Exhaust','Mount'],(db.guidingLands||[]).map(r=>`<tr><td>${r.level}</td><td>${r.players}</td><td>${num(r.health)}</td>${r.modifiers.map(v=>`<td>${E(v)}</td>`).join('')}</tr>`));return;}
 if(s.encounter==='expeditions'){$('monsterQuestRows').innerHTML=tableHTML(['Rank','Locale','Health','Attack','Defense','Part','Ailment buildup','Ailment threshold','Stun','Exhaust','Mount'],(db.expeditions||[]).filter(r=>s.rank==='all'||r.rank===s.rank).map(r=>`<tr><td>${r.rank}</td><td>${E(r.locale)}</td><td>${num(r.health)}</td>${r.modifiers.map(v=>`<td>${E(v)}</td>`).join('')}</tr>`));return;}
 const rows=monsterQuests().filter(q=>(s.rank==='all'||q.rank===s.rank)&&(!s.questQ||q.name.toLowerCase().includes(s.questQ.toLowerCase())));
 $('monsterQuestRows').innerHTML=tableHTML(['Quest','Rank','Location','Health / scaling','Rewards'],rows.map(q=>{const m=(q.monsters||[]).find(x=>x.id===s.id||x.monsterId===s.id)||{};return `<tr><td>${E(q.name)}${q.type?`<small>${E(q.type)}</small>`:''}${q.stars?`<small>${E(q.stars)}★</small>`:''}</td><td>${E(q.rank)}</td><td>${E(q.locale||q.location||'')}</td><td>${renderQuestHealth(m,q)}</td><td>${q.zenny!=null?num(q.zenny)+' z':shown(q.reward)}</td></tr>`;}));
}
function renderQuestHealth(m,q){let value=m.health||m.hp||q.health;if(value&&typeof value==='object')return Object.entries(value).map(([k,v])=>`${E(k)}: ${num(v)}`).join('<br>');return `${value!=null?num(value)+' HP <small>'+(m.healthLabel||'Solo')+'</small>':'—'}${m.multiplayerHealth!=null?`<small>${num(m.multiplayerHealth)} HP · ${E(m.multiplayerLabel||'Multiplayer')}</small>`:''}${m.modifiers?`<details class="pool-details"><summary>Quest modifiers</summary>${Object.entries(m.modifiers).map(([k,v])=>`<div>${E(k)} ×${E(v)}</div>`).join('')}</details>`:''}`;}
function openQuest(id){
 const q=(DB.quests||[]).find(x=>x.id===id);if(!q)return;
 const rewards=(DB.items||[]).flatMap(it=>(it.sources||[]).filter(s=>s.questId===id).map(s=>({...s,name:it.name})));
 if((q.rank==='MR'?'iceborne':'world')!==S.edition)navigate(q.rank==='MR'?'iceborne':'world',S.view);
 resetDetailClass();
 $('detailBody').innerHTML=`<div class="article-header"><p class="eyebrow">${E(q.rank)} / ${E(q.type||'QUEST')}</p><h2>${E(q.name)}</h2><div class="pill-row">${q.stars?pill(q.stars+'★'):''}${q.locale?pill(q.locale):''}${q.zenny!=null?pill(num(q.zenny)+' z'):''}${saveButton('questRecord:'+q.id)}</div></div><div class="article-content">${q.monsters?.length?`<h3>Large monsters</h3>${tableHTML(['Monster','Objective','Health / scaling'],q.monsters.map(m=>`<tr><td><button class="text-btn" data-open-monster="${E(m.id)}">${E(DB.monsters[m.id]?.name||m.id)}</button></td><td>${m.objective===true?'Target':m.objective===false?'Present':'—'}</td><td>${renderQuestHealth(m,q)}</td></tr>`))}`:''}${rewards.length?`<h3>Quest rewards</h3>${tableHTML(['Item','Reward group','Quantity','Chance'],rewards.map(r=>`<tr><td>${itemButton(r.name)}</td><td>${shown(r.method)}</td><td>${shown(r.quantity)}</td><td>${r.chance!=null?E(r.chance)+'%':'—'}</td></tr>`))}`:''}</div>`;
 openDialog('detailDialog');
}
function databaseSearchEntries(){return [
 ...(DB.weapons||[]).map(w=>({kind:'weaponRecord',id:w.id,title:w.name,sub:(D.weapons.find(x=>x.id===w.type)?.name||w.type)+' · '+w.rank+' · Rarity '+w.rarity,text:factText(w),game:w.game})),
 ...[...itemIndex.values()].map(i=>({kind:'databaseItem',id:i.name,title:i.name,sub:i.category||'Item',text:[i.description,...(i.sources||[]).map(s=>s.monster||s.locale||s.quest||'')].join(' '),game:i.game||'both'})),
 ...(DB.recipes||[]).map(r=>({kind:'recipeRecord',id:r.id,title:r.name,sub:r.method==='meld'?'Elder Melder':'Crafting List',text:factText(r),game:r.game||'both'})),
 ...(DB.quests||[]).map(q=>({kind:'questRecord',id:q.id,title:q.name,sub:q.rank+' · '+q.stars+'★ · '+(q.locale||q.type||'Quest'),text:factText(q)+' '+(q.monsters||[]).map(m=>DB.monsters[m.id]?.name||'').join(' '),game:q.rank==='MR'?'iceborne':'world'}))
 ];}
function onDatabaseClick(t){
 if(t.dataset.bookmarkTab){savedPanelMode=t.dataset.bookmarkTab;renderSaved();return true;}
 if(t.hasAttribute('data-bookmark-edit')){editingBookmarks=!editingBookmarks;renderSaved($('savedPickerSearch')?.value||'');return true;}
 if(t.dataset.bookmarkOpen){const pos=t.dataset.bookmarkOpen.indexOf(':');openEntry(t.dataset.bookmarkOpen.slice(0,pos),t.dataset.bookmarkOpen.slice(pos+1));return true;}

 if(t.dataset.item){openItem(t.dataset.item);return true;}
 if(t.dataset.recipeMethod){recipeState.method=t.dataset.recipeMethod;recipeState.q='';recipeState.category='all';renderPreparation();return true;}
 if(t.dataset.jumpRecipe){jumpRecipe(t.dataset.jumpRecipe);return true;}
 if(t.dataset.jumpWeapon){jumpWeapon(t.dataset.jumpWeapon);return true;}
 if(t.dataset.jumpMonster){screenChange(()=>{if($('itemDialog').open)closeDialog('itemDialog');openMonster(t.dataset.jumpMonster);});return true;}
 if(t.dataset.openQuest){screenChange(()=>{if($('itemDialog').open)closeDialog('itemDialog');openQuest(t.dataset.openQuest);});return true;}
 if(t.dataset.weaponTab){setWeaponTab(t.dataset.weaponTab);return true;}
 if(t.dataset.encounterMode){monsterState.encounter=t.dataset.encounterMode;renderMonsterPanel();return true;}
 if(t.dataset.monsterTab){setMonsterTab(t.dataset.monsterTab);return true;}
 if(t.dataset.selectWeapon){selectWeapon(t.dataset.selectWeapon);return true;}
 if(t.dataset.weaponPath){weaponState.path=t.dataset.weaponPath;if(weaponState.tab==='tree')renderTreeMaterials();else renderWeaponMaterials();return true;}
 if(t.hasAttribute('data-tree-reset')){weaponState.tree={zoom:1,x:0,y:0};updateWeaponTree();return true;}
 return false;
}
function onDatabaseInput(t){
 if(t.id==='savedPickerSearch'){renderBookmarkRows(t.value);return true;}
 if(t.id==='recipeSearch'){recipeState.q=t.value;renderRecipeRows();return true;}
 if(t.id==='weaponDatabaseSearch'){weaponState.q=t.value;renderWeaponRows();return true;}
 if(t.id==='monsterRewardSearch'){monsterState.rewardQ=t.value;renderMonsterRewardRows();return true;}
 if(t.id==='monsterQuestSearch'){monsterState.questQ=t.value;renderMonsterQuestRows();return true;}
 return false;
}
function onDatabaseChange(t){
 const recipeFilters={recipeCategory:'category',recipeGame:'game',recipeRank:'rank'},weaponFilters={weaponRank:'rank',weaponRarity:'rarity',weaponElement:'element',weaponObtain:'obtain'};
 if(recipeFilters[t.id]){recipeState[recipeFilters[t.id]]=t.value;renderRecipeRows();return true;}
 if(weaponFilters[t.id]){weaponState[weaponFilters[t.id]]=t.value;renderWeaponRows();return true;}
 if(t.id==='weaponTreeFamily'){weaponState.family=t.value;weaponState.tree={zoom:1,x:0,y:0};renderWeaponTree();return true;}
 if(t.id==='monsterDataRank'){monsterState.rank=t.value;if(monsterState.tab==='ailments')renderMonsterPanel();else if(monsterState.tab==='rewards')renderMonsterRewardRows();else renderMonsterQuestRows();return true;}
 if(t.id==='monsterRewardMethod'){monsterState.rewardMethod=t.value;renderMonsterRewardRows();return true;}
 return false;
}

const TREE_BASE_SCALE=.5,DB_BATCH=40;
let viewportWidth=0,viewportHeight=0,searchDustAnimations=[],searchFocusTimer=0,searchEndTimer=0,searchTextCache=null,searchReturnPending=false;
function syncViewportFrame(){
 const width=window.innerWidth||390,height=window.innerHeight||800,typing=['INPUT','TEXTAREA'].includes(document.activeElement?.tagName);
 if(!viewportHeight||width!==viewportWidth||(!typing&&!$('searchDialog').open&&height>viewportHeight*.8)){viewportWidth=width;viewportHeight=height;document.documentElement.style.setProperty('--app-height',height+'px');document.documentElement.dataset.viewportSize=height<=450?'tiny':height<=650?'short':'full';}
 if(searchClosing)return;const visual=window.visualViewport;document.documentElement.style.setProperty('--search-height',Math.max(180,(visual?.height||height)-16)+'px');
 document.documentElement.style.setProperty('--search-top',Math.max(8,(visual?.offsetTop||0)+8)+'px');
}
function renderAll(){
 ({overview:renderOverview,bestiary:renderBestiary,weapons:renderWeapons,progression:renderProgression,equipment:renderEquipment,notes:renderNotes,preparation:renderPreparation,locales:renderLocales}[S.view]||renderOverview)();
 paintIcons($('view-'+S.view));syncSaved();
}
function applyNavigation(mode=S.edition,view=S.view,scroll=true){
 if(!validMode(mode)||!validView(view))return;closeGuideMenu();const changed=mode!==S.edition;
 S.edition=mode;S.view=view;
 if(changed){S.monsterQ='';S.monsterType='all';S.monsterKind='all';S.monsterScope='new';S.monsterLimit=bestiaryBatchSize();S.noteCat='all';S.noteQ='';S.skillQ='';S.itemQ='';S.buildKind='all';}
 document.documentElement.dataset.edition=mode;document.documentElement.dataset.view=view;document.documentElement.style.setProperty('--hero-image',`url("${img(edition().background)}")`);document.documentElement.style.setProperty('--texture',`url("${img('iceborne-background')}")`);
 $('worldTab').setAttribute('aria-selected',String(mode==='world'));$('iceborneTab').setAttribute('aria-selected',String(mode==='iceborne'));
 document.querySelector('meta[name="theme-color"]').content=mode==='world'?'#0d1512':'#0b1420';$('brandHome').href='#'+mode+'/overview';
 document.querySelectorAll('.view').forEach(v=>v.hidden=v.id!=='view-'+view);document.body.classList.toggle('is-home',view==='overview');if(!restoringLiveScreen)renderAll();else syncSaved();renderNavigation();
 document.title=`${navs.find(n=>n[0]===view)[1]} · ${edition().fullName} · Hunter’s Field Guide`;try{history.replaceState(history.state||null,'','#'+mode+'/'+view);}catch{}
 applyAppearance();persist();if(changed)syncAudio();syncViewportFrame();
 if(scroll){$('stageBoundary').scrollTop=0;try{window.scrollTo({top:0,behavior:'instant'});}catch{}}
}
function navigate(mode=S.edition,view=S.view,scroll=true,animateFrame=false){
 if(!validMode(mode)||!validView(view))return;const token=++navEpoch,changed=mode!==S.edition||view!==S.view;
 const run=()=>{if(token===navEpoch)applyNavigation(mode,view,scroll);};
 if(changed&&animateFrame&&!reducedMotion())blurPanel($('stageBoundary'),run);else{const pending=panelAnimations.get($('stageBoundary'));pending?.animation?.cancel();panelAnimations.delete($('stageBoundary'));run();}
}
function blurPanel(panel,replace){
 if(!panel)return;const previous=panelAnimations.get(panel),style=window.getComputedStyle?.(panel),startOpacity=previous?style?.opacity||1:1,startFilter=previous?style?.filter||'blur(0)':'blur(0)';previous?.animation?.cancel();
 const state={};panelAnimations.set(panel,state);
 if(transitionsDisabled()||typeof panel.animate!=='function'){replace();panelAnimations.delete(panel);return;}
 const out=animateUI(panel,transitionFrames(false,'content',{opacity:startOpacity,filter:startFilter}),{duration:110,fill:'forwards',easing:'ease-in'});state.animation=out;
 out.finished.then(()=>{if(panelAnimations.get(panel)!==state||!panel.isConnected)return;replace();out.cancel();const incoming=animateUI(panel,transitionFrames(true,'content'),{duration:190,easing:'ease-out'});state.animation=incoming;incoming.finished.then(()=>{if(panelAnimations.get(panel)===state)panelAnimations.delete(panel);}).catch(()=>{});}).catch(()=>{});
}
function bindPanZoom(view,get,set,options={}){
 const points=new Map();let gesture=null,suppressClick=false,lastDrag=0;
 const minimum=options.min??1,maximum=options.max??5,free=options.free===true;
 const mid=()=>{const p=[...points.values()];return p.length>1?{x:(p[0].x+p[1].x)/2,y:(p[0].y+p[1].y)/2,d:Math.hypot(p[0].x-p[1].x,p[0].y-p[1].y)}:{...p[0],d:0};};
 const begin=()=>{if(!points.size){gesture=null;view.classList.remove('dragging');return;}const m=mid();gesture={...get(),x0:m.x,y0:m.y,d:m.d};view.classList.add('dragging');};
 view.onpointerdown=e=>{if(e.button>0||e.target.closest('select,output,.tree-toolbar,.map-zoom-controls')||(!free&&e.target.closest('button')))return;points.set(e.pointerId,{x:e.clientX,y:e.clientY});(free&&e.target.closest('button')||view).setPointerCapture?.(e.pointerId);suppressClick=false;begin();if(!free||!e.target.closest('button'))e.preventDefault();};
 view.onpointermove=e=>{if(!points.has(e.pointerId)||!gesture)return;points.set(e.pointerId,{x:e.clientX,y:e.clientY});const m=mid(),g=gesture,r=view.getBoundingClientRect();let zoom=g.zoom,x=g.x+m.x-g.x0,y=g.y+m.y-g.y0;
  if(points.size>1&&g.d>0){zoom=Math.max(minimum,Math.min(maximum,g.zoom*m.d/g.d));const ratio=zoom/g.zoom,ox=free?r.left:r.left+r.width/2,oy=free?r.top:r.top+r.height/2;x=m.x-ox-(g.x0-ox-g.x)*ratio;y=m.y-oy-(g.y0-oy-g.y)*ratio;}
  if(Math.hypot(m.x-g.x0,m.y-g.y0)>5||points.size>1){suppressClick=true;lastDrag=Date.now();}
  set({zoom,x:!free&&zoom===1?0:x,y:!free&&zoom===1?0:y});e.preventDefault();};
 const release=e=>{points.delete(e.pointerId);begin();};view.onpointerup=release;view.onpointercancel=release;view.onlostpointercapture=release;
 view.addEventListener('click',e=>{if(e.target.closest('.map-zoom-controls,.tree-toolbar')){suppressClick=false;return;}if(suppressClick&&Date.now()-lastDrag<350){e.preventDefault();e.stopImmediatePropagation();suppressClick=false;}},true);
 view.ondblclick=e=>{if(e.target.closest('button'))return;e.preventDefault();const a=get();set({zoom:a.zoom===1?2:1,x:0,y:0});};
 view.onwheel=e=>{if(e.ctrlKey||e.metaKey){e.preventDefault();const a=get();set({...a,zoom:Math.max(minimum,Math.min(maximum,a.zoom*Math.exp(-e.deltaY*.003)))});}};
 view.onkeydown=e=>{const a=get();let yes=true;if(e.key==='+'||e.key==='=')a.zoom=Math.min(maximum,a.zoom+.25);else if(e.key==='-')a.zoom=Math.max(minimum,a.zoom-.25);else if(e.key==='0'){a.zoom=1;a.x=a.y=0;}else if(e.key==='ArrowLeft')a.x+=50;else if(e.key==='ArrowRight')a.x-=50;else if(e.key==='ArrowUp')a.y+=50;else if(e.key==='ArrowDown')a.y-=50;else yes=false;if(yes){e.preventDefault();set(a);}};
}
function runSearchDust(direction){
 const host=$('searchEffects'),button=$('homeSearchButton');if(!host||!button||!searchOrigin?.width||reducedMotion()||!guidePrefs.effects.particles||guidePrefs.performance==='light')return[];
 button.classList.add('search-dissolved');
 if(direction==='in'&&searchDustAnimations.length){for(const animation of searchDustAnimations)try{animation.reverse();}catch{}return searchDustAnimations.map(a=>a.finished.catch(()=>{}));}
 host.innerHTML='';searchDustAnimations=[];
 const a=searchOrigin,columns=8,rows=8;
 for(let i=0;i<columns*rows;i++){
  const column=i%columns,row=Math.floor(i/columns);if(Math.hypot((column+.5)/columns-.5,(row+.5)/rows-.5)>.5)continue;const piece=document.createElement('i'),dx=(column-4.5)*7,dy=90+(i*31)%95;
  piece.className='search-dust';piece.style.left=(a.left+column*a.width/columns)+'px';piece.style.top=(a.top+row*a.height/rows)+'px';piece.style.width=Math.max(2,a.width/columns-2)+'px';piece.style.height=Math.max(2,a.height/rows-2)+'px';host.append(piece);
  const frames=[{opacity:.65,transform:'translate(0,0) scale(1)'},{opacity:.5,offset:.25,transform:`translate(${dx*.2}px,${dy*.15}px) scale(.4)`},{opacity:0,transform:`translate(${dx}px,${dy}px) scale(.04) rotate(${i%2?70:-70}deg)`}];
  if(typeof piece.animate==='function'){const animation=animateUI(piece,frames,{duration:350,delay:i%5*8,easing:'cubic-bezier(.25,.5,.5,1)',fill:'both',direction:direction==='in'?'reverse':'normal'});animation.finished.catch(()=>{});searchDustAnimations.push(animation);}else{piece.style.setProperty('--dust-x',dx+'px');piece.style.setProperty('--dust-y',dy+'px');piece.style.animationDirection=direction==='in'?'reverse':'normal';}
 }
 return searchDustAnimations.map(a=>a.finished.catch(()=>{}));
}
function resetSearchEffects(){
 cancelMotionTimer(searchFocusTimer);cancelMotionTimer(searchEndTimer);searchMotionVersion++;searchClosing=false;searchReturnPending=false;searchAnimation?.cancel();searchAnimation=null;
 searchDustAnimations.forEach(a=>a.cancel());searchDustAnimations=[];$('searchEffects')?.replaceChildren();$('homeSearchButton')?.classList.remove('search-dissolved');$('searchWindow')?.removeAttribute('data-open');$('searchDialog').inert=false;$('searchDialog').classList.remove('search-exiting','search-transferring');const panel=$('searchWindow');for(const property of ['height','max-height','top','clip-path','opacity','transition'])panel?.style.removeProperty(property);panel?.classList.remove('search-css-motion');syncViewportFrame();
}
function animateSearchOpen(trigger){
 const panel=$('searchWindow'),dialog=$('searchDialog'),version=++searchMotionVersion;searchClosing=false;searchReturnPending=false;dialog.inert=false;dialog.classList.remove('search-exiting','search-transferring');searchAnimation?.cancel();searchAnimation=null;cancelMotionTimer(searchFocusTimer);cancelMotionTimer(searchEndTimer);
 for(const property of ['height','max-height','top','clip-path','opacity','transition'])panel.style.removeProperty(property);panel.classList.remove('search-css-motion');if(!reducedMotion()&&typeof panel.animate!=='function'){panel.classList.add('search-css-motion');panel.dataset.open='false';void panel.offsetHeight;}
 searchOrigin=document.body.classList.contains('is-home')?searchButtonRect($('homeSearchButton')):null;syncViewportFrame();panel.dataset.open='true';runSearchDust('out');
 const focus=()=>{if(version===searchMotionVersion&&dialog.open&&!searchClosing)$('globalSearch').focus?.({preventScroll:true});};
 if(!reducedMotion()&&typeof panel.animate==='function'){
  searchAnimation=animateUI(panel,[{clipPath:'inset(0 0 100% 0 round 5px)',opacity:.2},{clipPath:'inset(0 round 5px)',opacity:1}],{duration:270,easing:'cubic-bezier(.22,.75,.3,1)',fill:'both'});
  const animation=searchAnimation;animation.finished.then(()=>{if(version!==searchMotionVersion)return;animation.cancel();searchAnimation=null;focus();}).catch(()=>{});
 }else if(reducedMotion())focus();else searchFocusTimer=motionLater(focus,270);
}
function exitSearch(action,{preserveBackdrop=false}={}){
 if(searchClosing)return;const dialog=$('searchDialog'),panel=$('searchWindow');if(!dialog.open){action();return;}
 const rect=panel.getBoundingClientRect(),style=window.getComputedStyle?.(panel),startClip=style?.clipPath||'inset(0 round 5px)',startOpacity=style?.opacity||'1';
 searchClosing=true;dialog.inert=true;dialog.classList.add('search-exiting');dialog.classList.toggle('search-transferring',preserveBackdrop);cancelMotionTimer(searchFocusTimer);const version=++searchMotionVersion;
 // Freeze keyboard-dependent geometry. Closing is a single fade, with no reverse dust or glow.
 panel.style.height=rect.height+'px';panel.style.maxHeight=rect.height+'px';panel.style.top=rect.top+'px';
 searchAnimation?.cancel();searchAnimation=null;panel.style.clipPath=startClip;panel.style.opacity=startOpacity;panel.classList.remove('search-css-motion');
 searchDustAnimations.forEach(animation=>animation.cancel());searchDustAnimations=[];$('searchEffects').replaceChildren();$('globalSearch').blur?.();
 const done=()=>{if(version!==searchMotionVersion)return;searchClosing=false;searchReturnPending=true;dialog.inert=false;action();};
 if(reducedMotion()){done();return;}
 if(typeof panel.animate==='function')searchAnimation=animateUI(panel,[{opacity:startOpacity},{opacity:0}],{duration:150,easing:'ease-out',fill:'both'});
 if(searchAnimation)searchAnimation.finished.then(done,()=>{});else{panel.style.transition='opacity '+motionDuration(150)+'ms ease-out';panel.style.opacity='0';searchEndTimer=motionLater(done,150);}
}
function openSearch(query='',trigger=null){closeGuideMenu();toggleMusicDock(false);openDialog('searchDialog');$('globalSearch').value=query;renderSearch();animateSearchOpen(trigger);}
function renderSearch(){
 const q=$('globalSearch').value.trim().toLowerCase(),idx=searchIndex();if(!searchTextCache)searchTextCache=idx.map(x=>[x.title,x.sub,x.text].join(' ').toLowerCase());let total=0;
 if(q){const terms=q.split(/\s+/),matches=idx.filter((x,i)=>terms.every(t=>searchTextCache[i].includes(t)));total=matches.length;const score=x=>x.title.toLowerCase()===q?0:x.title.toLowerCase().startsWith(q)?1:x.title.toLowerCase().includes(q)?2:3;searchHits=matches.sort((a,b)=>score(a)-score(b)||a.title.localeCompare(b.title)||a.sub.localeCompare(b.sub)).slice(0,24).map(x=>x.kind==='weapon'&&!terms.every(t=>(x.worldText||'').toLowerCase().includes(t))?{...x,preferredEdition:'iceborne'}:x);}else searchHits=idx.filter(x=>x.kind==='guide'&&['first-hunt','master-rank','guiding-lands'].includes(x.id)||x.kind==='monster'&&['rathalos','velkhana','fatalis'].includes(x.id)||x.kind==='locale'&&['ancient-forest','hoarfrost-reach'].includes(x.id));
 S.searchIndex=0;paintSearchHits();$('searchEdition').textContent=q?`${total} matches${total>24?' · first 24':''}`:'World + Iceborne';
}
function paintSearchHits(){
 const labels={weaponRecord:'Weapon',databaseItem:'Item',recipeRecord:'Recipe',questRecord:'Quest',monster:'Monster',weapon:'Weapon',guide:'Guide',skill:'Skill',locale:'Locale',gathering:'Resource',secret:'Discovery',quest:'Quest',camp:'Camp',route:'Route',lore:'Trivia',build:'Build',progress:'Progress'};
 $('searchResults').innerHTML=searchHits.length?searchHits.map((x,i)=>`<button class="search-result ${S.searchIndex===i?'selected':''}" role="option" aria-selected="${S.searchIndex===i}" data-search-hit="${i}">${icon(['weapon','weaponRecord'].includes(x.kind)?'sword':x.kind==='locale'?'compass':'book')}<span class="result-text"><strong>${E(x.title)}</strong><small>${E(x.sub)}</small><span class="search-game">${x.game==='world'?'WORLD':x.game==='iceborne'||x.preferredEdition==='iceborne'?'ICEBORNE':'WORLD + ICEBORNE'}</span></span><span class="result-kind">${E((labels[x.kind]||x.kind).toUpperCase())}</span></button>`).join(''):'<div class="empty-state"><h3>No matching records</h3></div>';
}
window.addEventListener('resize',syncViewportFrame);window.visualViewport?.addEventListener('resize',syncViewportFrame);window.visualViewport?.addEventListener('scroll',syncViewportFrame);
$('searchDialog').addEventListener('close',resetSearchEffects);
$('searchDialog').addEventListener('click',event=>{if(event.target===$('searchDialog'))closeDialog('searchDialog');});

function filterButton(kind,count=0,open=false){return `<button class="filter-toggle" data-filter-toggle="${kind}" aria-controls="${kind}Filters" aria-expanded="${open}">${icon('settings')} Filters${count?`<span class="filter-count">${count}</span>`:''}</button>`;}
function filterLabel(label,content){return `<label>${E(label)}${content}</label>`;}
function tableHTML(headers,rows,cls=''){
 const labelled=rows.map(row=>{let column=0;return row.replace(/<td(\s[^>]*)?>/g,(_,attrs='')=>`<td${attrs} data-label="${E(headers[column++]||'')}">`);});
 return `<div class="db-table-scroll"><table class="db-table mobile-stack ${cls}"><thead><tr>${headers.map(h=>`<th scope="col">${effectVisual(h)}${E(h)}</th>`).join('')}</tr></thead><tbody>${labelled.join('')||`<tr class="empty-row"><td colspan="${headers.length}">No matching records.</td></tr>`}</tbody></table></div>`;
}
function renderPreparation(){
 const r=recipeState,group=DB.recipes.filter(x=>x.method===r.method),categories=[...new Set(group.map(x=>x.category).filter(Boolean))].sort();if(!categories.includes(r.category))r.category='all';r.limit=r.limit||DB_BATCH;
 const count=['category','game','rank'].filter(k=>r[k]!=='all').length;
 $('view-preparation').innerHTML=`<div class="page-wrap recipe-page">${intro('WORLD + ICEBORNE','Recipe','')}<div class="database-tabs" role="tablist" aria-label="Recipe methods">${[['craft','Crafting List'],['meld','Elder Melder']].map(([id,label])=>`<button role="tab" data-recipe-method="${id}" aria-selected="${r.method===id}">${label}</button>`).join('')}</div><div class="db-shell recipe-shell"><div class="db-toolbar"><div class="filter-search"><input id="recipeSearch" type="search" value="${E(r.q)}" placeholder="Find item or ingredient…" aria-label="Search recipes"></div>${filterButton('recipe',count,!!r.filtersOpen)}</div><div id="recipeFilters" class="db-filter-panel" ${r.filtersOpen?'':'hidden'}>${filterLabel('Category',`<select id="recipeCategory">${optionHTML('all','All categories',r.category)}${categories.map(c=>optionHTML(c,c,r.category)).join('')}</select>`)}${filterLabel('Game',`<select id="recipeGame">${[['all','Both games'],['world','World'],['iceborne','Iceborne']].map(([id,label])=>optionHTML(id,label,r.game)).join('')}</select>`)}${filterLabel('Rank',`<select id="recipeRank">${[['all','All ranks'],['LR','Low Rank'],['HR','High Rank'],['MR','Master Rank']].map(([id,label])=>optionHTML(id,label,r.rank)).join('')}</select>`)}<button class="text-btn" data-reset-db-filters="recipe">Clear filters</button></div><div id="recipeMeta" class="db-meta"></div><div id="recipeRows"></div></div></div>`;renderRecipeRows();
}
function renderRecipeRows(){
 if(!$('recipeRows'))return;const r=recipeState,rows=DB.recipes.filter(recipeMatches),limit=r.limit||DB_BATCH;$('recipeMeta').textContent=`${rows.length} recipes`;
 $('recipeRows').innerHTML=tableHTML(['Result','Ingredients','Details'],rows.slice(0,limit).map(x=>`<tr data-recipe-id="${E(x.id)}"><td><div class="recipe-result">${x.result?.name?itemButton(x.result.name):E(x.name)}<span>${x.result?.quantity!=null?'×'+E(x.result.quantity):x.outputQuantity!=null?'×'+E(x.outputQuantity):''}</span></div><small>${E(x.result?.name&&x.name!==x.result.name?x.name:x.category||'')}</small></td><td>${x.ingredients?.length?ingredientsHTML(x.ingredients):`<span class="quiet">${x.inputPool?.length?'Choose accepted materials':'—'}</span>`}</td><td><details class="recipe-details"><summary>Recipe details</summary><div>${x.output?`<p>${E(x.output)}</p>`:''}<p class="recipe-cost">${costHTML(x.cost)}</p>${poolHTML(x.inputPool,'Accepted materials')}${poolHTML(x.pool,'Possible results')}${x.inputDescription?`<p>${E(x.inputDescription)}</p>`:''}${x.unlock?`<p><strong>Unlock</strong><br>${E(x.unlock)}</p>`:''}${x.notes?`<p>${E(x.notes)}</p>`:''}</div></details></td></tr>`),'recipe-table')+(rows.length>limit?`<button class="db-load-more" data-more-recipes>Show more · ${Math.min(limit,rows.length)} of ${rows.length}</button>`:'');
}
function openWeapon(id,options={}){
 const w=D.weapons.find(x=>x.id===id);if(!w)return;resetDetailClass();$('detailDialog').classList.add('weapon-record-dialog');
 weaponState={type:id,tab:options.tab||'guide',q:'',rank:'all',rarity:'all',element:'all',obtain:'all',selected:options.selected||null,path:'upgrade',tree:{zoom:1,x:0,y:0},family:'default',treeInitialized:false,treeDetails:false,detail:!!options.selected,detailOrigin:null,limit:DB_BATCH,filtersOpen:false};Object.assign(weaponState,recalledFilters('weapon:'+id));
 $('detailBody').innerHTML=`<header class="weapon-detail-head"><h2>${E(w.name)}</h2></header><div class="profile-content">${recordTabs([['guide','Guide'],['database','Database'],['tree','Family Tree']],weaponState.tab,'weapon-tab')}<div id="recordPanel" class="record-panel" role="tabpanel"></div></div>`;renderWeaponPanel();openDialog('detailDialog');
}
function weaponFilterCount(){return ['rank','rarity','element','obtain'].filter(k=>weaponState[k]!=='all').length;}
function renderWeaponDatabase(){
 const s=weaponState,all=typeWeapons(),rarities=[...new Set(all.map(w=>w.rarity))].sort((a,b)=>a-b),elements=[...new Set(all.flatMap(elementNames))].sort();
 if(s.detail){$('recordPanel').innerHTML=`<div class="weapon-selection"><button class="record-back" data-weapon-list>${icon('arrow')} ${s.detailOrigin==='list'?'Back to weapons':s.detailOrigin==='record'?'Back':'All weapons'}</button><section id="weaponMaterials" class="weapon-materials" aria-live="polite"></section></div>`;renderWeaponMaterials();return;}
 $('recordPanel').innerHTML=`<div class="db-shell weapon-browser"><div class="db-toolbar"><div class="filter-search"><input id="weaponDatabaseSearch" value="${E(s.q)}" type="search" placeholder="Search weapons…" aria-label="Search this weapon database"></div>${filterButton('weapon',weaponFilterCount(),s.filtersOpen)}</div><div id="weaponFilters" class="db-filter-panel" ${s.filtersOpen?'':'hidden'}>${filterLabel('Rank',`<select id="weaponRank">${[['all','All ranks'],['LR','Low Rank'],['HR','High Rank'],['MR','Master Rank']].map(([id,label])=>optionHTML(id,label,s.rank)).join('')}</select>`)}${filterLabel('Rarity',`<select id="weaponRarity">${optionHTML('all','All rarities',s.rarity)}${rarities.map(r=>optionHTML(r,'Rarity '+r,s.rarity)).join('')}</select>`)}${filterLabel('Element / status',`<select id="weaponElement">${optionHTML('all','All elements',s.element)}${optionHTML('none','No element',s.element)}${elements.map(e=>optionHTML(e,e,s.element)).join('')}</select>`)}${filterLabel('Obtain',`<select id="weaponObtain">${[['all','All paths'],['forge','Forge'],['upgrade','Upgrade'],['reward','Rewards']].map(([id,label])=>optionHTML(id,label,s.obtain)).join('')}</select>`)}<button class="text-btn" data-reset-db-filters="weapon">Clear filters</button></div><div id="weaponDatabaseMeta" class="db-meta"></div><div id="weaponDatabaseRows" class="db-table-scroll weapon-list" role="group" aria-label="Weapons"></div></div>`;renderWeaponRows();
}
function renderWeaponRows(){
 const s=weaponState,rows=filteredWeapons(),limit=s.limit||DB_BATCH,el=$('weaponDatabaseRows');if(!el)return;
 $('weaponDatabaseMeta').textContent=`${rows.length} weapons`;const toggle=document.querySelector('[data-filter-toggle="weapon"]');if(toggle)toggle.innerHTML=icon('settings')+' Filters'+(weaponFilterCount()?`<span class="filter-count">${weaponFilterCount()}</span>`:'');
 el.innerHTML=rows.slice(0,limit).map(w=>`<button class="weapon-list-row" data-weapon-row="${E(w.id)}" data-select-weapon="${E(w.id)}" data-selected="${w.id===s.selected}"><span class="weapon-row-icon">${weaponVisual(w)}</span><span class="weapon-row-title">${E(w.name)}</span><span class="weapon-row-rarity">Rarity ${w.rarity}</span><span class="weapon-row-sub">${E(w.rank)} <span>·</span> Attack ${num(w.attack)} <span>·</span> Affinity ${shown(w.affinity)}%${w.elements?.length?' <span>·</span> '+weaponElementsHTML(w):''}</span><span class="weapon-row-arrow">${icon('arrow')}</span></button>`).join('')+(rows.length>limit?`<button class="db-load-more" data-more-weapons>Show more · ${Math.min(limit,rows.length)} of ${rows.length}</button>`:'')||'<div class="data-empty">No matching weapons.</div>';
}
function selectWeapon(id){
 const w=weaponIndex.get(id),s=weaponState;if(!w||w.type!==s?.type)return;
 if(s.tab==='tree'){s.selected=id;s.treeDetails=true;document.querySelectorAll('[data-tree-node]').forEach(n=>n.dataset.selected=String(n.dataset.treeNode===id));renderTreeMaterials();return;}
 screenChange(()=>{s.detailOrigin=s.detail?'record':'list';s.selected=id;s.detail=true;renderWeaponDatabase();});
}
function renderWeaponTree(){
 const s=weaponState,all=typeWeapons(),byId=new Map(all.map(w=>[w.id,w])),roots=[...new Map(all.map(w=>{const r=treeRoot(w,byId);return[r.id,r];})).values()];
 if(s.family==='default'||s.family!=='all'&&!byId.has(s.family)){const selected=byId.get(s.selected),root=selected?treeRoot(selected,byId):roots.find(r=>/ore tree|bone tree/i.test(r.family||''))||roots[0];s.family=root?.id||'all';s.treeInitialized=false;}
 $('recordPanel').innerHTML=`<div class="db-shell weapon-tree-shell"><div class="tree-toolbar"><select id="weaponTreeFamily" class="db-filter tree-filter" aria-label="Weapon family">${optionHTML('all','All weapon families',s.family)}${roots.map(r=>optionHTML(r.id,r.family?r.family+' · '+r.name:r.name,s.family)).join('')}</select><div class="tree-controls"><output id="treeZoomValue">100%</output><button class="text-btn" data-tree-reset>Reset</button></div></div><div id="weaponTreeViewport" class="tree-viewport" tabindex="0" role="group" aria-label="Weapon family tree. Pinch to zoom and drag to pan."><div id="weaponTreeCanvas" class="tree-canvas"></div></div><div id="treeMaterials" class="tree-materials" aria-live="polite" hidden></div></div>`;
 const children=new Map();for(const w of all){if(!children.has(w.parent))children.set(w.parent,[]);children.get(w.parent).push(w);}let row=0;const positions=new Map(),visited=new Set();
 function visit(w,depth){if(visited.has(w.id))return;visited.add(w.id);const kids=children.get(w.id)||[],first=row;for(const c of kids)visit(c,depth+1);if(!kids.length)row++;positions.set(w.id,{x:depth*270,y:(kids.length?(first+row-1)/2:first)*116});}
 for(const r of roots)if(s.family==='all'||r.id===s.family){visit(r,0);row++;}
 const visible=all.filter(w=>positions.has(w.id)),width=Math.max(400,...[...positions.values()].map(p=>p.x+252)),height=Math.max(250,row*116),canvas=$('weaponTreeCanvas');if(!positions.has(s.selected))s.selected=visible[0]?.id||null;
 canvas.style.width=width+'px';canvas.style.height=height+'px';canvas.dataset.rootY=String(positions.get(s.family)?.y||0);
 canvas.innerHTML=`<svg class="tree-edges" width="${width}" height="${height}" aria-hidden="true">${visible.filter(w=>positions.has(w.parent)).map(w=>{const a=positions.get(w.parent),b=positions.get(w.id);return `<path d="M${a.x+232} ${a.y+44}H${a.x+251}V${b.y+44}H${b.x}"/>`;}).join('')}</svg>${visible.map(w=>{const p=positions.get(w.id);return `<button class="tree-node" style="left:${p.x}px;top:${p.y}px" data-tree-node="${E(w.id)}" data-select-weapon="${E(w.id)}" data-selected="${s.selected===w.id}" data-obtain="${!w.forge&&!w.upgrade?'reward':'smithy'}" aria-label="${E(w.name)}, rarity ${w.rarity}${w.elements?.length?', '+E(w.elements.map(e=>typeof e==='string'?e:e.type||e.name).join(', ')):''}">${weaponNodeHTML(w)}</button>`;}).join('')}`;
 bindPanZoom($('weaponTreeViewport'),()=>({...s.tree}),v=>{s.tree=v;updateWeaponTree();},{min:.5,max:6,free:true});$('weaponTreeViewport').addEventListener('click',event=>{if(!event.target.closest('button')&&s.treeDetails){s.treeDetails=false;renderTreeMaterials();}});if(!s.treeInitialized){s.tree={zoom:1,x:16,y:16};s.treeInitialized=true;nextFrame(()=>resetWeaponTree());}updateWeaponTree();renderTreeMaterials();
}
function resetWeaponTree(){const view=$('weaponTreeViewport'),canvas=$('weaponTreeCanvas');if(!view||!canvas)return;const r=view.getBoundingClientRect();weaponState.tree={zoom:1,x:16,y:Math.min(16,r.height*.35-Number(canvas.dataset.rootY||0)*TREE_BASE_SCALE)};updateWeaponTree();}
function updateWeaponTree(){
 const s=weaponState?.tree,canvas=$('weaponTreeCanvas'),view=$('weaponTreeViewport');if(!s||!canvas||!view)return;const r=view.getBoundingClientRect(),scale=s.zoom*TREE_BASE_SCALE,width=(parseFloat(canvas.style.width)||400)*scale,height=(parseFloat(canvas.style.height)||250)*scale;
 s.x=Math.min(Math.max(16,r.width*.5),Math.max(Math.min(16,r.width-width-24)-r.width*.25,s.x));s.y=Math.min(Math.max(16,r.height*.5),Math.max(Math.min(16,r.height-height-24)-r.height*.25,s.y));canvas.style.transform=`translate(${s.x}px,${s.y}px) scale(${scale})`;$('treeZoomValue').textContent=Math.round(s.zoom*100)+'%';
}
function renderTreeMaterials(){
 const s=weaponState,w=weaponIndex.get(s.selected),el=$('treeMaterials');if(!el)return;el.hidden=!s.treeDetails;if(!w||!s.treeDetails){el.innerHTML='';return;}normalizeWeaponPath(w);const path=w[s.path];
 el.innerHTML=`<header><h3>${E(w.name)}</h3><button class="icon-btn" data-tree-details-close aria-label="Close weapon materials">${icon('close')}</button></header><div class="tree-material-content">${w.forge||w.upgrade?`${pathButtons(w)}${ingredientsHTML(path?.materials)}<p class="material-cost">${path?.zenny!=null?num(path.zenny)+' z':'Price not supplied'}</p>`:`<p>${obtainHTML(w)}</p>`}</div>`;
}
function foldInfoGroups(root){root.querySelectorAll('.profile-grid>div').forEach(group=>{const heading=group.querySelector('h4');if(!heading)return;const details=document.createElement('details'),summary=document.createElement('summary');details.className='guide-fold';summary.textContent=heading.textContent;heading.remove();details.append(summary);const content=document.createElement('div');content.innerHTML=group.innerHTML;details.append(content);group.replaceWith(details);});}
const baseWeaponPanel=renderWeaponPanel;
renderWeaponPanel=function(){baseWeaponPanel();$('detailDialog').dataset.recordWeaponTab=weaponState.tab;if(weaponState.tab==='guide')foldInfoGroups($('recordPanel'));};
const baseMonsterPanel=renderMonsterPanel;
renderMonsterPanel=function(){
 const s=monsterState,db=DB.monsters[s.id]||{};$('detailDialog').dataset.recordMonsterTab=s.tab;
 baseMonsterPanel();const video=$('detailBody').querySelector('.monster-video-link');if(video)video.hidden=s.tab!=='overview';
 if(s.tab==='hitzones'){
  const group=s.hitGroup||'physical',fields=group==='elements'?['fire','water','thunder','ice','dragon']:['cut','impact','shot','stun'];
  $('recordPanel').innerHTML=`<div class="segmented hitzone-groups"><button data-hit-group="physical" aria-pressed="${group==='physical'}">Physical</button><button data-hit-group="elements" aria-pressed="${group==='elements'}">Elements</button></div>`+tableHTML(['Part / state',...fields.map(x=>x[0].toUpperCase()+x.slice(1))],(db.hitzones||[]).map(h=>`<tr><td>${E(h.part||h.name)}${h.state?`<small>${E(h.state)}</small>`:''}</td>${fields.map(k=>`<td class="hitzone-value" data-hot="${h[k]>=(['cut','impact','shot'].includes(k)?45:20)}">${shown(h[k])}</td>`).join('')}</tr>`),'hitzone-table');
 }
 if(s.tab==='overview'){foldInfoGroups($('recordPanel'));const thresholds=[...$('recordPanel').querySelectorAll('h3')].find(h=>h.textContent==='Base part thresholds');if(thresholds){const table=thresholds.nextElementSibling,fold=document.createElement('details');fold.className='guide-fold';fold.innerHTML='<summary>Part thresholds</summary>';thresholds.replaceWith(fold);if(table)fold.append(table);}}
 if(s.tab==='rewards'){
  const controls=$('recordPanel').querySelector('.monster-data-filters'),search=controls.querySelector('.filter-search'),rank=controls.querySelector('label:not(.filter-search)'),method=controls.querySelector('#monsterRewardMethod'),toolbar=document.createElement('div'),filters=document.createElement('div');
  toolbar.className='db-toolbar monster-reward-toolbar';toolbar.append(search);toolbar.insertAdjacentHTML('beforeend',filterButton('monster',monsterFilterCount(),!!s.filtersOpen));filters.id='monsterFilters';filters.className='db-filter-panel';filters.hidden=!s.filtersOpen;filters.append(rank);const methodLabel=document.createElement('label');methodLabel.textContent='Reward method';methodLabel.append(method);filters.append(methodLabel);filters.insertAdjacentHTML('beforeend','<button class="text-btn" data-reset-db-filters="monster">Clear filters</button>');controls.replaceWith(toolbar,filters);
 }
};
function monsterFilterCount(){return Number(monsterState.rank!=='all')+Number(monsterState.rewardMethod!=='all');}
function renderMonsterRewardRows(){
 const s=monsterState,db=DB.monsters[s.id]||{},q=s.rewardQ.toLowerCase(),rows=(db.rewards||[]).filter(r=>(s.rank==='all'||r.rank===s.rank)&&(s.rewardMethod==='all'||(r.condition||r.method)===s.rewardMethod)&&(!q||(r.item||r.name||'').toLowerCase().includes(q))),limit=s.rewardLimit||DB_BATCH;
 $('monsterRewardRows').innerHTML=`<div class="db-meta">${rows.length} materials</div>`+tableHTML(['Material','Rank','Method','Quantity','Chance'],rows.slice(0,limit).map(r=>`<tr><td>${itemButton(r.item||r.name)}</td><td>${E(r.rank)}</td><td>${E(r.condition||r.method)}</td><td>${shown(r.quantity)}</td><td>${r.chance!=null?E(r.chance)+'%':'—'}</td></tr>`))+(rows.length>limit?`<button class="db-load-more" data-more-monster-rewards>Show more · ${Math.min(limit,rows.length)} of ${rows.length}</button>`:'');
 const toggle=document.querySelector('[data-filter-toggle="monster"]');if(toggle)toggle.innerHTML=icon('settings')+' Filters'+(monsterFilterCount()?`<span class="filter-count">${monsterFilterCount()}</span>`:'');
}
const baseDBClick=onDatabaseClick,baseDBInput=onDatabaseInput,baseDBChange=onDatabaseChange;
onDatabaseClick=function(t){
 if(t.dataset.filterToggle){const kind=t.dataset.filterToggle,model={weapon:weaponState,recipe:recipeState,monster:monsterState}[kind];model.filtersOpen=!model.filtersOpen;toggleFilterPanel($(kind+'Filters'),model.filtersOpen);t.setAttribute('aria-expanded',String(model.filtersOpen));return true;}
 if(t.dataset.resetDbFilters==='monster'){Object.assign(monsterState,{rank:'all',rewardMethod:'all',rewardLimit:DB_BATCH});renderMonsterPanel();return true;}
 if(t.dataset.resetDbFilters){if(t.dataset.resetDbFilters==='weapon'){Object.assign(weaponState,{rank:'all',rarity:'all',element:'all',obtain:'all',limit:DB_BATCH});renderWeaponDatabase();}else{Object.assign(recipeState,{category:'all',game:'all',rank:'all',limit:DB_BATCH});renderPreparation();}return true;}
 if(t.hasAttribute('data-more-weapons')){const top=$('weaponDatabaseRows').scrollTop;weaponState.limit=(weaponState.limit||DB_BATCH)+DB_BATCH;renderWeaponRows();$('weaponDatabaseRows').scrollTop=top;return true;}
 if(t.hasAttribute('data-more-recipes')){const scroller=$('recipeRows').querySelector('.db-table-scroll'),top=scroller?.scrollTop||0;recipeState.limit=(recipeState.limit||DB_BATCH)+DB_BATCH;renderRecipeRows();const restored=$('recipeRows').querySelector('.db-table-scroll');if(restored)restored.scrollTop=top;return true;}
 if(t.hasAttribute('data-weapon-list')){if(weaponState.detailOrigin)screenBack();else screenChange(()=>{weaponState.detail=false;renderWeaponDatabase();});return true;}
 if(t.hasAttribute('data-more-monster-rewards')){const top=$('monsterRewardRows').querySelector('.db-table-scroll')?.scrollTop||0;monsterState.rewardLimit=(monsterState.rewardLimit||DB_BATCH)+DB_BATCH;renderMonsterRewardRows();$('monsterRewardRows').querySelector('.db-table-scroll').scrollTop=top;return true;}
 if(t.hasAttribute('data-tree-details-close')){weaponState.treeDetails=false;renderTreeMaterials();return true;}
 if(t.hasAttribute('data-tree-reset')){resetWeaponTree();return true;}
 if(t.dataset.hitGroup){monsterState.hitGroup=t.dataset.hitGroup;renderMonsterPanel();return true;}
 if(t.dataset.recipeMethod){recipeState.limit=DB_BATCH;recipeState.filtersOpen=false;}
 return baseDBClick(t);
};
onDatabaseInput=function(t){if(t.id==='weaponDatabaseSearch'){weaponState.limit=DB_BATCH;const result=baseDBInput(t);$('weaponDatabaseRows').scrollTop=0;return result;}if(t.id==='recipeSearch')recipeState.limit=DB_BATCH;if(t.id==='monsterRewardSearch')monsterState.rewardLimit=DB_BATCH;return baseDBInput(t);};
onDatabaseChange=function(t){
 if(t.id==='weaponTreeFamily'){weaponState.family=t.value;weaponState.treeInitialized=false;weaponState.treeDetails=false;renderWeaponTree();return true;}
 if(['weaponRank','weaponRarity','weaponElement','weaponObtain'].includes(t.id))weaponState.limit=DB_BATCH;
 if(['recipeCategory','recipeGame','recipeRank'].includes(t.id))recipeState.limit=DB_BATCH;
 if(t.id==='monsterDataRank'||t.id==='monsterRewardMethod')monsterState.rewardLimit=DB_BATCH;
 const result=baseDBChange(t);if(t.id.startsWith('recipe')&&result){const button=document.querySelector('[data-filter-toggle="recipe"]'),count=['category','game','rank'].filter(k=>recipeState[k]!=='all').length;if(button)button.innerHTML=icon('settings')+' Filters'+(count?`<span class="filter-count">${count}</span>`:'');}return result;
};

const cleanOpenLocale=openLocale,cleanOpenGuide=openGuide,cleanOpenBuild=openBuild,cleanOpenCredits=openCredits;
openLocale=function(...args){resetDetailClass();return cleanOpenLocale(...args);};
openGuide=function(...args){resetDetailClass();return cleanOpenGuide(...args);};
openBuild=function(...args){resetDetailClass();return cleanOpenBuild(...args);};
openCredits=function(...args){resetDetailClass();return cleanOpenCredits(...args);};

const disclosureMotions=new WeakMap();
const visualData=D.visuals||{},visualAssets=visualData.assets||{};
const itemVisualIndex=new Map(Object.entries(visualData.itemNames||{}).map(([name,key])=>[itemKey(name),key]));
const effectAliases={blastblight:'blast',blastscourge:'blast',paralyze:'paralysis',paralysed:'paralysis',paralyzed:'paralysis',ko:'stun',exhaustion:'exhaust',fireblight:'fire',waterblight:'water',thunderblight:'thunder',iceblight:'ice',dragonblight:'dragon'};
const rarityColours=visualData.rarityColours||{1:'#c5c6c8',2:'#c5c6c8',3:'#d4b653',4:'#76b676',5:'#76b5dc',6:'#7777d8',7:'#bd6ccc',8:'#df9061',9:'#c4c6e7',10:'#73c7e5',11:'#e1bb65',12:'#dce7ed'};
function visualHTML(key,cls='',label=''){
 const asset=visualAssets[key];if(!asset?.image)return'';
 return `<span class="game-icon ${cls}"${label?` role="img" aria-label="${E(label)}" title="${E(label)}"`:' aria-hidden="true"'}><img src="${E(asset.image)}" alt="" width="28" height="28" loading="lazy" decoding="async"></span>`;
}
function itemVisual(name,cls=''){
 const item=itemIndex.get(itemKey(name)),key=itemVisualIndex.get(itemKey(name))||visualData.categories?.[item?.category]||visualData.defaultItem;
 return visualHTML(key,cls);
}
function effectVisual(name,cls='',label=false){
 const normalized=itemKey(name).replace(/[\s_-]/g,''),canonical=effectAliases[normalized]||normalized;
 const key=visualData.effects?.[canonical]||visualData.effects?.[itemKey(name)];
 return visualHTML(key,'effect-icon '+cls,label?name:'');
}
function weaponVisual(weapon,cls='',label=false){
 const rarity=Number(weapon.rarity)||1,variants=visualData.weapons?.[weapon.type],key=typeof variants==='object'?variants?.[rarity]:null;
 const ready=key?visualHTML(key,'weapon-game-icon '+cls,label?`Rarity ${rarity}`:''):'';if(ready)return ready;
 const mask=visualData.weaponMasks?.[weapon.type]||(typeof visualData.weapons?.[weapon.type]==='string'?visualData.weapons[weapon.type]:null),url=visualAssets[mask]?.image||img('weapon-'+weapon.type);if(!url)return'';
 return `<span class="rarity-weapon ${cls}" data-rarity="${rarity}" style="--rarity-colour:${E(rarityColours[rarity]||rarityColours[1])};--weapon-mask:url('${E(url)}')"${label?` role="img" aria-label="Rarity ${rarity}" title="Rarity ${rarity}"`:' aria-hidden="true"'}></span>`;
}
function weaponNodeHTML(w){
 const elements=(w.elements||[]).map(e=>typeof e==='string'?e:e.type||e.name).filter(Boolean);
 return `<span class="tree-node-name">${E(w.name)}</span><span class="tree-node-icons">${weaponVisual(w)}${elements.map(name=>effectVisual(name,'',true)).join('')}</span>`;
}
function itemButton(name,quantity=null){return `<button class="item-link" data-item="${E(name)}">${itemVisual(name)}<span>${E(name)}</span></button>${quantity!=null?' ×'+E(quantity):''}`;}
function weaponElementsHTML(w){
 return (w.elements||[]).map(e=>{const name=typeof e==='string'?e:e.type||e.name;return `<span class="element-label">${effectVisual(name)}<span>${E(name)}${typeof e==='object'?' '+shown(e.value??e.damage)+(e.hidden?' (hidden)':''):''}</span></span>`;}).join(' ')||'—';
}
function applyFontPreferences(){
 const value=Number(appearancePrefs.fontPt);appearancePrefs.fontPt=Number.isFinite(value)?Math.max(5,Math.min(15,value)):11;
 const root=document.documentElement;root.style.setProperty('--guide-font-size',appearancePrefs.fontPt+'pt');root.style.setProperty('--text-scale',String(appearancePrefs.fontPt/11));
 root.dataset.fontSize=String(appearancePrefs.fontPt);
}
function setGuideFontSize(value){
 appearancePrefs.fontPt=Number(value);applyFontPreferences();persist();
 const output=$('fontSizeValue');if(output)output.textContent=appearancePrefs.fontPt+' pt';
 const range=$('guideFontSize');if(range){range.value=String(appearancePrefs.fontPt);range.setAttribute('aria-valuetext',appearancePrefs.fontPt+' points');}
}
const plainAppearanceSettings=renderAppearanceSettings;
renderAppearanceSettings=function(){
 plainAppearanceSettings();
 const panel=$('settingsPanel'),box=document.createElement('section');box.className='font-setting';
 box.innerHTML=`<div class="font-setting-heading"><label for="guideFontSize">Font size</label><div><output id="fontSizeValue" for="guideFontSize">${appearancePrefs.fontPt} pt</output><button class="text-btn" data-font-reset>Reset</button></div></div><input id="guideFontSize" type="range" min="5" max="15" step="1" value="${appearancePrefs.fontPt}" aria-label="Guide font size" aria-valuetext="${appearancePrefs.fontPt} points"><div class="font-range-labels"><span>5 pt</span><span>15 pt</span></div><div class="font-preview"><strong>Potion</strong><p>Restores a small amount of health.</p></div>`;
 panel.prepend(box);
 panel.querySelector('.settings-footnote')?.remove();
 const legend=document.createElement('details');legend.className='icon-legend';
 legend.innerHTML='<summary>Icon legend</summary><div class="legend-content"><h4>Elements & status</h4><div class="legend-grid">'+['Fire','Water','Thunder','Ice','Dragon','Poison','Paralysis','Sleep','Blast','Stun'].map(name=>`<span class="element-label">${effectVisual(name)}<span>${name}</span></span>`).join('')+'</div><h4>Weapon rarity</h4><div class="legend-grid">'+Array.from({length:12},(_,i)=>`<span class="element-label">${weaponVisual({type:'great-sword',rarity:i+1})}<span>Rarity ${i+1}</span></span>`).join('')+'</div></div>';
 panel.append(legend);
};
document.addEventListener('input',event=>{if(event.target.id==='guideFontSize')setGuideFontSize(event.target.value);});
document.addEventListener('click',event=>{if(event.target.closest?.('[data-font-reset]'))setGuideFontSize(11);});

function animateReveal(content,show,finish=()=>{}){
 const previous=disclosureMotions.get(content),currentHeight=content.getBoundingClientRect().height,currentStyle=window.getComputedStyle?.(content);
 const currentTop=parseFloat(currentStyle?.paddingTop)||0,currentBottom=parseFloat(currentStyle?.paddingBottom)||0;
 if(previous){previous.animation?.cancel();cancelMotionTimer(previous.timer);}
 const state={};disclosureMotions.set(content,state);content.hidden=false;content.inert=!show;
 const naturalStyle=window.getComputedStyle?.(content),paddingTop=parseFloat(naturalStyle?.paddingTop)||0,paddingBottom=parseFloat(naturalStyle?.paddingBottom)||0;
 const start=show&&!previous?0:currentHeight,end=show?(content.scrollHeight||currentHeight):0;
 const done=()=>{if(disclosureMotions.get(content)!==state)return;disclosureMotions.delete(content);state.animation?.cancel();for(const property of ['height','overflow','opacity','filter','transition','padding-top','padding-bottom'])content.style.removeProperty(property);finish();};
 if(reducedMotion()){done();return;}
 content.style.overflow='hidden';
 const frames=[{height:start+'px',paddingTop:(show&&!previous?0:currentTop)+'px',paddingBottom:(show&&!previous?0:currentBottom)+'px',clipPath:show&&!previous?'inset(0 0 100% 0)':'inset(0)',opacity:show&&!previous?0.2:1,filter:show&&!previous?'blur(3px)':'blur(0)'},{height:end+'px',paddingTop:(show?paddingTop:0)+'px',paddingBottom:(show?paddingBottom:0)+'px',clipPath:show?'inset(0)':'inset(0 0 100% 0)',opacity:show?1:0,filter:show?'blur(0)':'blur(3px)'}];
 if(typeof content.animate==='function'){
  state.animation=animateUI(content,frames,{duration:260,easing:'cubic-bezier(.22,.75,.3,1)',fill:'both'});
  state.animation.finished.then(done).catch(()=>{});
 }else{
  content.style.height=start+'px';content.style.opacity=show?'0':'1';content.style.paddingTop=frames[0].paddingTop;content.style.paddingBottom=frames[0].paddingBottom;void content.offsetHeight;
  content.style.transition=['height','padding','opacity','filter'].map(property=>property+' '+motionDuration(260)+'ms cubic-bezier(.22,.75,.3,1)').join(',');
  content.style.height=end+'px';content.style.paddingTop=frames[1].paddingTop;content.style.paddingBottom=frames[1].paddingBottom;content.style.opacity=show?'1':'0';content.style.filter=show?'blur(0)':'blur(3px)';state.timer=motionLater(done,280);
 }
}
function prepareDisclosure(details){
 const summary=details.querySelector('summary');if(!summary||summary.parentElement!==details)return null;
 let content=[...details.children].find(el=>el.classList.contains('disclosure-content'));
 if(!content){content=document.createElement('div');content.className='disclosure-content';const inner=document.createElement('div');inner.className='disclosure-inner';for(const node of [...details.childNodes])if(node!==summary)inner.append(node);content.append(inner);details.append(content);}
 details.classList.add('motion-disclosure');return {summary,content};
}
function toggleDisclosure(details){
 const parts=prepareDisclosure(details);if(!parts)return;const {summary,content}=parts;
 const show=details.dataset.expanded!==undefined?details.dataset.expanded!=='true':!details.open;
 if(show&&details.dataset.pool&&!details.dataset.loaded){content.querySelector('ul').innerHTML=(poolLookup.get(details.dataset.pool)||[]).map(poolRowHTML).join('');details.dataset.loaded='true';}
 details.dataset.expanded=String(show);summary.setAttribute('aria-expanded',String(show));details.open=true;
 animateReveal(content,show,()=>{details.open=show;content.inert=!show;});
}
document.addEventListener('click',event=>{
 const summary=event.target.closest?.('summary');if(!summary||summary.parentElement?.tagName!=='DETAILS')return;
 event.preventDefault();toggleDisclosure(summary.parentElement);
},true);
document.addEventListener('toggle',event=>{
 const details=event.target;if(details.tagName!=='DETAILS')return;const content=[...details.children].find(el=>el.classList.contains('disclosure-content'));
 if(content&&disclosureMotions.has(content))return;
 details.dataset.expanded=String(details.open);details.querySelector('summary')?.setAttribute('aria-expanded',String(details.open));
},true);
function toggleFilterPanel(panel,show){
 if(!panel)return;panel.dataset.revealing=String(show);panel.hidden=false;
 animateReveal(panel,show,()=>{panel.hidden=!show;panel.removeAttribute('data-revealing');});
}

function resultVisual(entry){
 if(entry.kind==='monster'){const m=D.monsters.find(x=>x.id===entry.id);return m?`<span class="result-visual monster-result-art" aria-hidden="true"><img src="${E(m.thumbnail||m.image)}" alt="" loading="lazy" decoding="async" width="42" height="42"></span>`:'';}
 if(entry.kind==='weaponRecord'){const w=weaponIndex.get(entry.id);return w?weaponVisual(w,'result-visual'):'';}
 if(entry.kind==='weapon')return `<span class="result-visual" aria-hidden="true"><img src="${E(img('weapon-'+entry.id))}" alt="" width="32" height="32" loading="lazy"></span>`;
 if(['databaseItem','gathering'].includes(entry.kind))return itemVisual(entry.title,'result-visual');
 if(entry.kind==='recipeRecord'){const r=DB.recipes.find(r=>r.id===entry.id);return itemVisual(r?.result?.name||entry.title,'result-visual');}
 if(entry.kind==='locale'){const image=img('locale-thumb-'+entry.id)||img('locale-'+entry.id);return image?`<span class="result-visual locale-result-art" aria-hidden="true"><img src="${E(image)}" alt="" width="42" height="42" loading="lazy"></span>`:'';}
 return'';
}
const plainSearchHits=paintSearchHits;
paintSearchHits=function(){plainSearchHits();$('searchResults').querySelectorAll('[data-search-hit]').forEach(button=>{const visual=resultVisual(searchHits[Number(button.dataset.searchHit)]);if(visual){button.querySelector(':scope > svg')?.remove();button.insertAdjacentHTML('afterbegin',visual);}});};
const plainBookmarkRows=renderBookmarkRows;
renderBookmarkRows=function(query=''){plainBookmarkRows(query);$('bookmarkRows').querySelectorAll('[data-bookmark-open]').forEach(button=>{const entry=getEntry(button.dataset.bookmarkOpen);if(!entry)return;const visual=resultVisual(entry.x);if(visual){const text=document.createElement('span');text.className='bookmark-entry-text';while(button.firstChild)text.append(button.firstChild);button.append(text);button.insertAdjacentHTML('afterbegin',visual);button.classList.add('visual-bookmark');}});};
const plainOpenItem=openItem;
openItem=function(name){const result=plainOpenItem(name),title=$('itemBody').querySelector('.item-header h2');if(title){const visual=itemVisual(name,'item-portrait');if(visual)title.insertAdjacentHTML('beforebegin',visual);}return result;};
const plainWeaponMaterials=renderWeaponMaterials;
renderWeaponMaterials=function(){plainWeaponMaterials();const w=weaponIndex.get(weaponState?.selected),heading=$('weaponMaterials')?.querySelector('.selected-weapon-heading h3');if(w&&heading)heading.insertAdjacentHTML('afterbegin',weaponVisual(w,'selected-weapon-icon',true));};
const plainAilments=renderMonsterAilments;
renderMonsterAilments=function(db){return plainAilments(db).replace(/<td([^>]*)>([^<]+)(?=<)/g,(match,attrs,name)=>{const visual=effectVisual(name);return visual?`<td${attrs}><span class="element-label">${visual}<span>${name}</span></span>`:match;});};
const plainLocaleResources=renderLocaleResources;
renderLocaleResources=function(){plainLocaleResources();$('localeResources')?.querySelectorAll('.resource-fact h4').forEach(heading=>{const visual=itemVisual(heading.textContent);if(visual)heading.insertAdjacentHTML('afterbegin',visual);});};
const plainCredits=openCredits;
openCredits=function(){const result=plainCredits(),root=$('detailBody');if(visualData.sources?.length){const section=document.createElement('section');section.className='icon-credits';section.innerHTML='<h3>Game icons</h3><ul>'+visualData.sources.map(s=>`<li>${sourceLink(s.url,E(s.name||s.title||s.url))}${s.note?`<small>${E(s.note)}</small>`:''}</li>`).join('')+'</ul>';(root.querySelector('.article-content')||root).append(section);}return result;};

function polishControls(root=document){
 const searchSelector='input[type="search"],input[placeholder^="Search"],input[placeholder^="Find"]';
 const searchFields=[...(root.matches?.(searchSelector)?[root]:[]),...root.querySelectorAll(searchSelector)];
 for(const field of searchFields){
  field.type='search';field.placeholder='Search';
  const host=field.closest('.filter-search,.search-query');if(!host)continue;
  host.classList.add('search-control');if(!field.id)field.id='guide-search-'+(++searchControlSerial);
  let clear=host.querySelector('.search-clear');if(!clear){clear=document.createElement('button');clear.type='button';clear.className='search-clear';clear.dataset.clearSearch=field.id;clear.setAttribute('aria-label','Clear search');clear.innerHTML=icon('close');host.append(clear);}
  clear.hidden=!field.value;
 }
 for(const select of [...(root.matches?.('select')?[root]:[]),...root.querySelectorAll('select')]){
  for(const option of select.options||[])if(option.value==='all')option.textContent='All';
 }
}
let searchControlSerial=0;
const unpolishedPaintIcons=paintIcons;
paintIcons=function(root=document){unpolishedPaintIcons(root);polishControls(root);};
const controlsObserver=typeof MutationObserver==='function'?new MutationObserver(records=>{for(const record of records)for(const node of record.addedNodes)if(node.nodeType===1&&!node.closest?.('.search-clear'))polishControls(node);}):null;
controlsObserver?.observe(document.body,{childList:true,subtree:true});
document.addEventListener('input',event=>{const field=event.target;if(field.type==='search'){const clear=field.closest('.search-control')?.querySelector('.search-clear');if(clear)clear.hidden=!field.value;}});
document.addEventListener('click',event=>{const clear=event.target.closest?.('[data-clear-search]');if(!clear)return;event.preventDefault();const field=$(clear.dataset.clearSearch);if(field){field.value='';field.dispatchEvent(new window.Event('input',{bubbles:true}));field.focus?.({preventScroll:true});}clear.hidden=true;},true);
const plainOptionHTML=optionHTML;
optionHTML=function(value,label,current){return plainOptionHTML(value,value==='all'?'All':label,current);};
const polishAppearance=applyAppearance;
applyAppearance=function(...args){
 const result=polishAppearance(...args),colour=window.getComputedStyle?.(document.documentElement)?.getPropertyValue('--muted')?.trim()||'#a8b1ad';
 const svg=`<svg xmlns="http://www.w3.org/2000/svg" width="16" height="10" viewBox="0 0 16 10"><path d="m2 2 6 6 6-6" fill="none" stroke="${colour}" stroke-width="1.5" stroke-linecap="round" stroke-linejoin="round"/></svg>`;
 document.documentElement.style.setProperty('--select-arrow',`url("data:image/svg+xml,${encodeURIComponent(svg)}")`);return result;
};
function renderLocales(){
 const locales=D.locales.filter(locale=>S.edition==='iceborne'||locale.game==='world');
 $('view-locales').innerHTML=`<div class="page-wrap">${intro(S.edition.toUpperCase()+' / THE NEW WORLD','Learn the land you hunt','')}<div class="locale-grid">${locales.map(locale=>`<article class="locale-card"><button class="locale-img locale-cover-button" data-open-locale="${locale.id}" aria-label="Explore ${E(locale.name)} map guide" style="--locale-image:url('${img('locale-'+locale.id)||img(edition().background)}')"><span class="eyebrow">${E(locale.tag)}</span></button><div class="locale-content"><h3><button class="locale-title-button" data-open-locale="${locale.id}">${E(locale.name)}</button></h3><div class="locale-monsters">${locale.monsters.map(name=>D.monsters.find(m=>m.name===name)).filter(Boolean).map(monster=>`<button class="locale-monster" data-open-monster="${monster.id}" aria-label="Open ${E(monster.name)} profile"><img src="${E(monster.thumbnail||monster.image)}" alt="" loading="lazy" decoding="async" width="120" height="90"><span>${E(monster.name)}</span></button>`).join('')}</div></div></article>`).join('')}</div></div>`;
}
function namedReference(url){
 if(D.referenceNames?.[url])return D.referenceNames[url];
 const publishers={'gamewith.net':'GameWith','game8.co':'Game8','mhwg.org':'MHWG','monsterhunterwiki.org':'Monster Hunter Wiki','mhworld.kiranico.com':'Kiranico','steamcommunity.com':'Steam Community'};
 try{
  const match=url.match(/^https?:\/\/([^/]+)([^?#]*)/),host=match?.[1]?.replace(/^www\./,''),publisher=publishers[host]||host;
  let title=decodeURIComponent(match?.[2]?.split('/').filter(Boolean).pop()||publisher).replace(/\.(?:html?|php)$/i,'').replace(/[_+]/g,' ').replace(/-/g,' ').replace(/\b\w/g,letter=>letter.toUpperCase());
  if(/^\d+$/.test(title)){const context=D.locales.flatMap(locale=>['camps','gathering','routes','secrets','quests','trivia'].flatMap(key=>(locale[key]||[]).filter(entry=>entry.source===url).map(entry=>({locale,entry}))));title=context[0]?.entry.name||context[0]?.entry.title||context[0]?.locale.name||title;}
  return `${title} · ${publisher}`;
 }catch{return url;}
}
const unfoldedCredits=openCredits;
openCredits=function(...args){
 unfoldedCredits(...args);const body=$('detailBody');
 for(const anchor of body.querySelectorAll('a'))if(/^Open reference/i.test(anchor.textContent))anchor.textContent=namedReference(anchor.getAttribute('href'));
 const article=body.querySelector('.article-content');if(article){
  const sourceURLs=new Set(),additions=[...(D.speedrun?.sources||[]),...(D.catalogueSources||[])].filter(source=>{if(!source.url||sourceURLs.has(source.url))return false;sourceURLs.add(source.url);return true;});
  if(additions.length){const section=document.createElement('section');section.className='article-section';section.innerHTML=`<h3>Story route & expanded catalogues</h3><ul class="credit-list">${additions.map(source=>`<li>${sourceLink(source.url,E(source.name))}${source.note?`<small>${E(source.note)}</small>`:''}</li>`).join('')}</ul>`;article.append(section);}
 }
 for(const section of body.querySelectorAll('.article-section,.icon-credits')){
  const heading=[...section.children].find(node=>/^H[2-4]$/.test(node.tagName));if(!heading)continue;
  const fold=document.createElement('details'),summary=document.createElement('summary');fold.className='credit-fold';fold.dataset.foldKey='credit-'+heading.textContent;summary.textContent=heading.textContent;heading.remove();fold.append(summary);const content=document.createElement('div');while(section.firstChild)content.append(section.firstChild);fold.append(content);section.replaceWith(fold);
 }
 paintIcons(body);
};
let itemLazyContent=new Map();
function itemFold(key,label,html='',lazy=null){if(lazy)itemLazyContent.set(key,lazy);return `<details class="item-fold" data-fold-key="item-${E(key)}"${lazy?` data-item-lazy="${E(key)}"`:''}><summary>${E(label)}</summary><div class="item-fold-body">${html}</div></details>`;}
const revealDisclosure=toggleDisclosure;
function loadItemFold(details){
 if(details.dataset.itemLazy&&!details.dataset.itemLoaded){
  const render=itemLazyContent.get(details.dataset.itemLazy),host=details.querySelector('.item-fold-body');if(render&&host){host.innerHTML=render();details.dataset.itemLoaded='true';paintIcons(host);}
 }
}
toggleDisclosure=function(details){loadItemFold(details);revealDisclosure(details);};
function itemSourceGroups(it){
 const groups=new Map(),seen=new Set();
 for(const source of it.sources||[]){const serial=JSON.stringify(source);if(seen.has(serial))continue;seen.add(serial);
  const method=[source.method,source.condition].filter(Boolean).join(' '),group=source.kind==='gathering'?'Maps & gathering':source.questId||source.kind==='quest'?'Quest rewards':/carv/i.test(method)?'Carves':/drop|shiny|plunder/i.test(method)?'Drops':/captur/i.test(method)?'Capture rewards':/break|sever|wound/i.test(method)?'Part breaks':'Other monster rewards';
  if(!groups.has(group))groups.set(group,[]);groups.get(group).push(source);
 }
 return groups;
}
openItem=function(name){
 const it=itemIndex.get(itemKey(name))||ensureItem(name);if(!it)return;const dialog=$('itemDialog');if(!dialog.open)itemReturnFocus=document.activeElement;itemLazyContent=new Map();
 const facts=[['Rarity',it.rarity],['Carry',it.carry],['Sell',it.sell!=null?it.sell+' z':null]].filter(([,value])=>value!=null&&value!=='');
 const groups=itemSourceGroups(it),sources=[...groups].map(([label,rows],i)=>{
  if(label==='Maps & gathering'){
   const maps=new Map();for(const row of rows){const key=row.locale||'Gathering';if(!maps.has(key))maps.set(key,[]);maps.get(key).push(row);}
   return itemFold('maps',label,[...maps].map(([map,entries],j)=>itemFold('map-'+j,map,'',()=>renderItemSources({...it,sources:entries}))).join(''));
  }
  return itemFold('source-'+i,label,'',()=>renderItemSources({...it,sources:rows}));
 }).join('');
 $('itemBody').innerHTML=`<header class="item-header"><p class="eyebrow">${E(it.category||'ITEM')}</p><h2>${itemVisual(it.name,'item-portrait')}<span>${E(it.name)}</span></h2>${it.description?`<p>${E(it.description)}</p>`:''}<div class="pill-row">${facts.map(([key,value])=>pill(key+' '+value)).join('')}</div></header><div class="item-body">${itemFold('find','Where to find',sources||`<div class="data-empty">${it.madeBy?.length?'Available through the recipes below.':'No acquisition record in the embedded source.'}</div>`)}${it.madeBy?.length?itemFold('recipes','Recipes','',()=>tableHTML(['Method','Ingredients','Cost'],it.madeBy.map(recipe=>`<tr><td><button class="text-btn" data-jump-recipe="${E(recipe.id)}">${E(recipe.name)}</button><small>${recipe.method==='meld'?'Elder Melder':'Crafting List'}</small></td><td>${ingredientsHTML(recipe.ingredients)}${poolHTML(recipe.inputPool,'Accepted materials')}</td><td>${costHTML(recipe.cost)}</td></tr>`))):''}${it.usedBy?.length?itemFold('used','Used in','',()=>tableHTML(['Recipe / weapon','Method'],it.usedBy.map(entry=>`<tr><td><button class="text-btn" ${entry.kind==='weapon'?`data-jump-weapon="${E(entry.id)}"`:entry.kind==='catalogue'?`data-open-catalogue="${E(entry.id)}"`:`data-jump-recipe="${E(entry.id)}"`}>${E(entry.name)}</button></td><td>${entry.path?E(entry.path):'Recipe'}</td></tr>`))):''}<button class="secondary-btn item-back" data-close="itemDialog">${icon('arrow')} Back</button></div>`;
 if(!dialog.open){if(dialog.showModal)dialog.showModal();else dialog.setAttribute('open','');}dialog.scrollTop=0;document.body.style.overflow='hidden';paintIcons(dialog);
};
function pathButtons(weapon){return `<div class="segmented" aria-label="Crafting path">${['forge','upgrade'].filter(path=>weapon[path]).map(path=>`<button data-weapon-path="${path}" aria-pressed="${weaponState.path===path}">${path==='forge'?'Forge':'Upgrade'}</button>`).join('')}</div>`;}
const plainWeaponRows=renderWeaponRows;
renderWeaponRows=function(){plainWeaponRows();polishControls($('recordPanel'));};
const materialsWithoutInfo=renderTreeMaterials;
renderTreeMaterials=function(){materialsWithoutInfo();const content=$('treeMaterials')?.querySelector('.tree-material-content');if(content)content.insertAdjacentHTML('beforeend',`<div class="tree-info-action"><button class="secondary-btn" data-tree-weapon-info="${E(weaponState.selected)}">Info</button></div>`);};
const clickWithoutTreeInfo=onDatabaseClick;
onDatabaseClick=function(button){
 if(button.dataset.treeWeaponInfo){screenChange(()=>{weaponState.selected=button.dataset.treeWeaponInfo;weaponState.tab='database';weaponState.detail=true;weaponState.detailOrigin='tree';document.querySelectorAll('[data-weapon-tab]').forEach(tab=>tab.setAttribute('aria-selected',String(tab.dataset.weaponTab==='database')));renderWeaponPanel();});return true;}
 return clickWithoutTreeInfo(button);
};
document.addEventListener('click',event=>{if(event.target.closest?.('#homeSearchButton')){const button=$('homeSearchButton');button?.classList.remove('search-pulsing');void button?.offsetWidth;button?.classList.add('search-pulsing');if(button&&!reducedMotion()){const rect=button.getBoundingClientRect(),ring=document.createElement('span');ring.className='home-pulse-ring';Object.assign(ring.style,{left:rect.left+'px',top:rect.top+'px',width:rect.width+'px',height:rect.height+'px'});nextFrame(()=>{if($('searchDialog').open)$('searchEffects').append(ring);});motionLater(()=>ring.remove(),700);}}},true);
polishControls();

let speedrunMotion=null,speedrunEpoch=0,speedrunUndo=null;
function renderSpeedrunReset(){
 const host=document.querySelector('.speedrun-reset');if(!host)return;
 const undo=speedrunUndo?.game===S.edition;
 host.innerHTML=`<button class="secondary-btn" data-speedrun-reset>Reset route</button>${undo?'<span class="quiet" role="status">Route reset.</span><button class="text-btn" data-speedrun-undo>Undo</button>':''}`;
}
function discardSpeedrunUndo(){if(speedrunUndo)clearTimeout(speedrunUndo.timer);speedrunUndo=null;renderSpeedrunReset();}
function resetSpeedrun(){
 const game=S.edition;discardSpeedrunUndo();stopSpeedrunMotion();
 speedrunUndo={game,tasks:{...speedrunPrefs[game].tasks},expanded:{...speedrunPrefs[game].expanded}};
 speedrunPrefs[game]={tasks:{},expanded:{}};persist();renderProgression();
 speedrunUndo.timer=setTimeout(()=>{speedrunUndo=null;renderSpeedrunReset();},8000);
 document.querySelector('.speedrun-reset')?.scrollIntoView?.({block:'nearest',behavior:reducedMotion()?'instant':'smooth'});
}
function undoSpeedrunReset(){
 if(!speedrunUndo||speedrunUndo.game!==S.edition)return;
 const snapshot=speedrunUndo;discardSpeedrunUndo();stopSpeedrunMotion();
 speedrunPrefs[snapshot.game]={tasks:snapshot.tasks,expanded:snapshot.expanded};persist();renderProgression();
}
const speedrunStages=game=>D.speedrun?.[game]||[];
const speedrunComplete=(stage,game=S.edition)=>stage.tasks.every(task=>speedrunPrefs[game].tasks[task.id]===true);
function speedrunVisible(game=S.edition){const stages=speedrunStages(game),first=stages.findIndex(stage=>!speedrunComplete(stage,game));return first<0?stages.length:Math.min(stages.length,first+1);}
function stopSpeedrunMotion(){speedrunEpoch++;if(speedrunMotion)cancelMotionTimer(speedrunMotion.timer);speedrunMotion=null;}
function speedrunTaskHTML(task,game){
 const checked=speedrunPrefs[game].tasks[task.id]===true;
 return `<div class="speedrun-task"><input type="checkbox" data-speedrun-task="${E(task.id)}" aria-label="Complete ${E(task.name)}" ${checked?'checked':''}><div>${task.questId?`<button class="speedrun-quest" data-open-quest="${E(task.questId)}">${E(task.name)}</button>`:`<span>${E(task.name)}</span>`}${task.monsterId?`<button class="speedrun-monster" data-open-monster="${E(task.monsterId)}">${E(D.monsters.find(m=>m.id===task.monsterId)?.name||'Monster profile')} ${icon('arrow')}</button>`:''}</div></div>`;
}
function renderProgression(){
 const game=S.edition,stages=speedrunStages(game),state=speedrunPrefs[game],motion=speedrunMotion?.game===game?speedrunMotion:null;
 const visible=Math.min(speedrunVisible(game),motion?.next!=null?motion.next+1:stages.length),total=stages.reduce((n,stage)=>n+stage.tasks.length,0);
 const done=stages.slice(0,visible).reduce((n,stage)=>n+stage.tasks.filter(task=>state.tasks[task.id]===true).length,0),finished=stages.every(stage=>speedrunComplete(stage,game));
 $('view-progression').innerHTML=`<div class="page-wrap speedrun-page" data-speedrun-game="${game}">${intro(game==='world'?'WORLD / STORY ROUTE':'ICEBORNE / STORY ROUTE','Speedrun','')}<div class="progress-top"><span data-progress-count>${done} / ${total} requirements</span><div class="progress-track" role="progressbar" aria-label="Story requirements completed" aria-valuemin="0" aria-valuemax="${total}" aria-valuenow="${done}"><div class="progress-fill" style="width:${total?done/total*100:0}%"></div></div></div><div class="speedrun-timeline">${stages.slice(0,visible).map((stage,i)=>{
  const complete=speedrunComplete(stage,game),arriving=motion?.next===i,celebrating=motion?.from===i,open=celebrating?true:state.expanded[stage.id]??!complete;
  return `<article class="speedrun-stage ${complete?'is-complete':''} ${arriving?'stage-arriving':''} ${celebrating?'stage-celebrating':''}" data-progress-entry="${stage.id}" data-speedrun-stage="${stage.id}" ${arriving?'inert':''}><div class="speedrun-rail"><span class="speedrun-number" aria-label="Stage ${i+1}"><svg viewBox="0 0 48 48" aria-hidden="true"><circle cx="24" cy="24" r="21"></circle></svg><span>${i+1}</span></span>${i<visible-1?`<span class="speedrun-connector ${motion?.next===i+1?'connector-growing':''}" aria-hidden="true"></span>`:''}</div><details class="speedrun-card" data-speedrun-fold="${stage.id}" data-fold-key="speedrun-${stage.id}" ${open?'open':''}><summary><span><small>${E(stage.rank)} · STAGE ${i+1}</small><strong>${E(stage.title)}</strong></span>${complete?`<span class="stage-complete-icon" aria-label="Completed">${icon('check')}</span>`:''}</summary><div class="speedrun-card-body"><div class="speedrun-tasks">${stage.tasks.map(task=>speedrunTaskHTML(task,game)).join('')}</div>${stage.tips?.length?`<details class="route-tips" data-fold-key="tips-${stage.id}"><summary>Route tips</summary>${list(stage.tips)}</details>`:''}</div></details></article>`;
 }).join('')}</div>${finished?`<div class="speedrun-finish ${motion?'finish-arriving':''}"><p class="eyebrow">${game==='world'?'WORLD':'ICEBORNE'} STORY COMPLETE</p>${game==='world'?`<button class="speedrun-continue" data-speedrun-continue>Continue ${icon('arrow')}<span class="continue-ripple" aria-hidden="true"></span></button>`:`<h3>The hunt continues</h3>`}</div>`:''}</div>`;
 $('view-progression').querySelector('.speedrun-page').insertAdjacentHTML('beforeend','<div class="speedrun-reset" aria-label="Reset current campaign route"></div>');renderSpeedrunReset();
 paintIcons($('view-progression'));
 if(motion)nextFrame(()=>{const completed=document.querySelector('.stage-celebrating>.speedrun-card');if(completed?.hasAttribute('open')&&completed.dataset.expanded!=='false'){completed.dataset.expanded='true';toggleDisclosure(completed);}});
}
function setSpeedrunTask(id,checked){
 const game=S.edition,stages=speedrunStages(game),index=stages.findIndex(stage=>stage.tasks.some(task=>task.id===id));if(index<0||index>=speedrunVisible(game))return;
 const stage=stages[index],wasComplete=speedrunComplete(stage,game);discardSpeedrunUndo();stopSpeedrunMotion();speedrunPrefs[game].tasks[id]=!!checked;
 const complete=speedrunComplete(stage,game);if(complete&&!wasComplete)speedrunPrefs[game].expanded[stage.id]=false;
 if(!complete)speedrunPrefs[game].expanded[stage.id]=true;
 persist();
 if(complete&&!wasComplete&&!reducedMotion()){
  const token=++speedrunEpoch;speedrunMotion={game,from:index,next:index+1<stages.length?index+1:null,token};
  speedrunMotion.timer=motionLater(()=>{if(speedrunMotion?.token!==token)return;const next=speedrunMotion.next;speedrunMotion=null;if(S.view!=='progression'||S.edition!==game)return;renderProgression();if(next!=null)document.querySelector(`[data-speedrun-stage="${stages[next].id}"]`)?.scrollIntoView?.({behavior:'smooth',block:'nearest'});},2300);
 }
 renderProgression();
}
document.addEventListener('change',event=>{const field=event.target;if(field.dataset.speedrunTask)setSpeedrunTask(field.dataset.speedrunTask,field.checked);});
document.addEventListener('toggle',event=>{const fold=event.target;if(!fold.dataset?.speedrunFold||!fold.isConnected)return;speedrunPrefs[S.edition].expanded[fold.dataset.speedrunFold]=fold.open;persist();},true);
document.addEventListener('click',event=>{
 if(event.target.closest?.('[data-speedrun-reset]')){resetSpeedrun();return;}
 if(event.target.closest?.('[data-speedrun-undo]')){undoSpeedrunReset();return;}
 const button=event.target.closest?.('[data-speedrun-continue]');if(!button||S.edition!=='world'||!speedrunStages('world').every(stage=>speedrunComplete(stage,'world')))return;
 if(button.dataset.running)return;button.dataset.running='true';button.classList.add('continue-active');
 const go=()=>{stopSpeedrunMotion();navigate('iceborne','progression',true,true);};if(reducedMotion())go();else motionLater(go,650);
});
const speedrunNavigation=applyNavigation;
applyNavigation=function(mode=S.edition,view=S.view,scroll=true){
 if(mode!==S.edition||view!=='progression')stopSpeedrunMotion();
 speedrunNavigation(mode,view,scroll);
 if(view==='progression'&&scroll)nextFrame(()=>{const stage=speedrunStages(mode)[speedrunVisible(mode)-1];if(stage)document.querySelector(`[data-speedrun-stage="${stage.id}"]`)?.scrollIntoView?.({block:'nearest',behavior:'instant'});});
};

const resourceState={tab:'resources',q:'',category:'all',rank:'all',rarity:'all',sort:'name',filtersOpen:false,limit:40};
const collectionState={group:'armours',q:'',rank:'all',rarity:'all',category:'all',slot:'all',skill:'',filtersOpen:false,limit:40};
const bestiaryLibraryState={tab:'large',q:'',category:'all',rank:'all',filtersOpen:false,limit:40};
const mapLibraryState={tab:'locales',selected:null,zoom:{zoom:1,x:0,y:0}};
const catalogues=D.catalogues||{},catalogueRecords=new Map(),catalogueGroups=[['armours','Armour'],['armourSets','Armour sets'],['decorations','Decorations'],['skills','Skills'],['charms','Charms'],['kinsects','Kinsects'],['palicoEquipment','Palico equipment'],['palicoGadgets','Palico gadgets'],['tools','Mantles & boosters'],['canteen','Canteen ingredients'],['foodSkills','Food skills']];
for(const [group,rows] of Object.entries(catalogues))if(Array.isArray(rows))for(const record of rows)if(record?.id)catalogueRecords.set(record.id,{...record,collection:group});
for(const record of catalogueRecords.values())for(const path of ['forge','upgrade'])for(const ingredient of record[path]?.materials||[]){const item=ensureItem(ingredient.name);if(item&&!item.usedBy.some(entry=>entry.kind==='catalogue'&&entry.id===record.id&&entry.path===path))item.usedBy.push({kind:'catalogue',id:record.id,name:record.name,path});}
for(const record of catalogues.smallMonsters||[])for(const reward of record.rewards||[]){const item=ensureItem(reward.item||reward.name);if(item)item.sources.push({kind:'monster',monsterId:record.id,monster:record.name,rank:reward.rank,method:reward.condition||reward.method,quantity:reward.quantity,chance:reward.chance});}
const allResourceItems=[...itemIndex.values()].filter(item=>item.name&&!/^(dummy|unused|unavailable|\?+)$/i.test(item.name));
const prettyLabel=value=>String(value||'').replace(/([a-z])([A-Z])/g,'$1 $2').replace(/[_-]/g,' ').replace(/^./,letter=>letter.toUpperCase());
function gameLabel(game){return game==='iceborne'?'Iceborne':game==='world'?'World':'World + Iceborne';}
function gameCompatible(record){return S.edition==='iceborne'||record.game!=='iceborne';}
function iconGlyph(key,label='',colour=''){
 const url=D.catalogueIcons?.[key];if(!url)return icon('book');
 return `<span class="catalogue-glyph" style="--glyph:url('${E(url)}');${colour?'color:'+E(colour):''}"${label?` role="img" aria-label="${E(label)}"`:' aria-hidden="true"'}></span>`;
}
function catalogueVisual(record,large=false){
 if(record.image)return `<span class="catalogue-art ${large?'large':''}"><img src="${E(record.image)}" alt="" width="${large?90:44}" height="${large?90:44}" loading="lazy" decoding="async"></span>`;
 const keys={armourSets:'armour-set',decorations:'decoration-'+(record.slot||record.slotLevel||1),skills:'skill',charms:'charm',kinsects:'kinsect',palicoEquipment:'palico',palicoGadgets:'palico',tools:'mantle',canteen:'canteen',foodSkills:'canteen',smallMonsters:'small-monster',endemicLife:'endemic'};
 const key=record.collection==='armours'?'armour-'+({arms:'arm',legs:'leg'}[record.type||record.part]||record.type||record.part||'head'):record.collection==='tools'&&record.kind==='booster'?'booster':keys[record.collection]||'item';
 return iconGlyph(key,record.name,rarityColours[record.rarity]||'');
}
function catalogueOptions(values,current){return optionHTML('all','All',current)+[...new Set(values.filter(value=>value!=null&&value!==''))].sort((a,b)=>typeof a==='number'&&typeof b==='number'?a-b:String(a).localeCompare(String(b))).map(value=>optionHTML(value,prettyLabel(value),current)).join('');}
function collectionName(group){return catalogueGroups.find(([id])=>id===group)?.[1]||({smallMonsters:'Small monsters',endemicLife:'Endemic life'})[group]||prettyLabel(group);}
function syncSharedSectionTabs(){
 const shared=S.view==='preparation'||S.view==='notes';$('editionSwitch').hidden=shared;const tabs=$('sharedSectionTabs');tabs.hidden=S.view!=='preparation';
 if(S.view==='preparation')tabs.innerHTML=[['resources','Resources'],['recipe','Recipe']].map(([id,name])=>`<button role="tab" data-item-library-tab="${id}" aria-selected="${resourceState.tab===id}">${name}</button>`).join('');
 document.documentElement.dataset.sharedSection=shared?'true':'false';
}
const libraryNavigation=applyNavigation;
applyNavigation=function(...args){libraryNavigation(...args);syncSharedSectionTabs();};
const craftingPreparation=renderPreparation;
renderPreparation=function(){
 if(resourceState.tab==='recipe'){craftingPreparation();const title=$('view-preparation').querySelector('.page-intro h1');if(title)title.textContent='Item libraries';$('view-preparation').querySelector('.recipe-page')?.classList.add('item-library-page');syncSharedSectionTabs();return;}
 const state=resourceState,categories=allResourceItems.map(item=>item.category||'Other'),count=['category','rank','rarity'].filter(key=>state[key]!=='all').length;
 $('view-preparation').innerHTML=`<div class="page-wrap item-library-page resource-page">${intro('WORLD + ICEBORNE','Item libraries','')}<div class="db-shell resource-shell"><div class="db-toolbar"><div class="filter-search"><input id="resourceLibrarySearch" type="search" placeholder="Search" aria-label="Search all inventory items" value="${E(state.q)}"></div>${filterButton('resource',count,state.filtersOpen)}</div><div id="resourceFilters" class="db-filter-panel" ${state.filtersOpen?'':'hidden'}>${filterLabel('Category',`<select id="resourceCategory">${catalogueOptions(categories,state.category)}</select>`)}${filterLabel('Rank',`<select id="resourceRank">${catalogueOptions(['LR','HR','MR'],state.rank)}</select>`)}${filterLabel('Rarity',`<select id="resourceRarity">${catalogueOptions(allResourceItems.map(item=>item.rarity),state.rarity)}</select>`)}${filterLabel('Sort',`<select id="resourceSort">${[['name','A–Z'],['rarity','Rarity ↑'],['rarity-desc','Rarity ↓']].map(([value,label])=>optionHTML(value,label,state.sort)).join('')}</select>`)}<button class="text-btn" data-reset-resource>Clear filters</button></div><div id="resourceLibraryMeta" class="db-meta"></div><div id="resourceLibraryRows" class="catalogue-list db-table-scroll" role="group" aria-label="Inventory items"></div></div></div>`;
 renderResourceLibraryRows();syncSharedSectionTabs();paintIcons($('view-preparation'));
};
function renderResourceLibraryRows(){
 const state=resourceState,terms=state.q.toLowerCase().trim().split(/\s+/).filter(Boolean),rows=allResourceItems.filter(item=>(state.category==='all'||(item.category||'Other')===state.category)&&(state.rarity==='all'||String(item.rarity)===String(state.rarity))&&(state.rank==='all'||(item.ranks||[]).includes(state.rank)||(item.sources||[]).some(source=>source.rank===state.rank))&&terms.every(term=>[item.name,item.category,item.description].join(' ').toLowerCase().includes(term)));
 rows.sort((a,b)=>state.sort==='rarity'||state.sort==='rarity-desc'?(state.sort==='rarity-desc'?-1:1)*((Number(a.rarity)||0)-(Number(b.rarity)||0))||a.name.localeCompare(b.name):a.name.localeCompare(b.name));
 const host=$('resourceLibraryRows');if(!host)return;$('resourceLibraryMeta').textContent=rows.length+' items';
 host.innerHTML=rows.slice(0,state.limit).map(item=>`<button class="catalogue-row resource-row" data-item="${E(item.name)}">${itemVisual(item.name)}<span><strong>${E(item.name)}</strong><small>${E(item.category||'Item')}</small></span>${item.rarity!=null?`<small class="row-fact">Rarity ${E(item.rarity)}</small>`:''}</button>`).join('')+(rows.length>state.limit?`<button class="db-load-more" data-more-resources>Show more · ${state.limit} of ${rows.length}</button>`:'')||(rows.length?'':'<div class="data-empty">No matching items.</div>');
}
const libraryJumpRecipe=jumpRecipe;
jumpRecipe=function(...args){resourceState.tab='recipe';return libraryJumpRecipe(...args);};
function renderEquipment(){
 const state=collectionState,rows=(catalogues[state.group]||[]).filter(gameCompatible),categories=rows.map(record=>record.type||record.category||record.part||''),rarities=rows.map(record=>record.rarity),count=['rank','rarity','category','slot'].filter(key=>state[key]!=='all').length;
 $('view-equipment').innerHTML=`<div class="page-wrap equipment-library-page">${intro('EQUIPMENT DATABASE','Equipment','')}<label class="collection-picker">Collection<select id="equipmentCollection" aria-label="Equipment collection">${catalogueGroups.map(([id,name])=>optionHTML(id,name,state.group)).join('')}</select></label><div class="db-shell equipment-shell"><div class="db-toolbar"><div class="filter-search"><input id="equipmentSearch" type="search" placeholder="Search" aria-label="Search ${E(collectionName(state.group))}" value="${E(state.q)}"></div>${filterButton('equipment',count,state.filtersOpen)}</div><div id="equipmentFilters" class="db-filter-panel" ${state.filtersOpen?'':'hidden'}>${filterLabel('Rank',`<select id="equipmentRank">${catalogueOptions(rows.map(record=>record.rank),state.rank)}</select>`)}${filterLabel('Rarity',`<select id="equipmentRarity">${catalogueOptions(rarities,state.rarity)}</select>`)}${filterLabel('Category / part',`<select id="equipmentCategory">${catalogueOptions(categories,state.category)}</select>`)}${filterLabel(state.group==='decorations'?'Required slot':'Has slot level',`<select id="equipmentSlot">${catalogueOptions([1,2,3,4],state.slot)}</select>`)}<button class="text-btn" data-reset-equipment>Clear filters</button></div><div id="equipmentMeta" class="db-meta"></div><div id="equipmentRows" class="catalogue-list db-table-scroll" role="group" aria-label="${E(collectionName(state.group))}"></div></div></div>`;
 renderEquipmentRows();paintIcons($('view-equipment'));
}
function recordSlotLevels(record){return (Array.isArray(record.slots)?record.slots:[]).map(slot=>Number(typeof slot==='object'?slot.level||slot.rank:slot)).filter(level=>level>0);}
function renderEquipmentRows(){
 const state=collectionState,terms=state.q.toLowerCase().trim().split(/\s+/).filter(Boolean),rows=(catalogues[state.group]||[]).filter(record=>gameCompatible(record)&&(state.rank==='all'||record.rank===state.rank)&&(state.rarity==='all'||String(record.rarity)===String(state.rarity))&&(state.category==='all'||(record.type||record.category||record.part||'')===state.category)&&(state.slot==='all'||(state.group==='decorations'?Number(record.slot||record.slotLevel)===Number(state.slot):recordSlotLevels(record).includes(Number(state.slot))))&&(state.compatible==null||state.group!=='decorations'||Number(record.slot||record.slotLevel)<=state.compatible)&&terms.every(term=>[record.name,record.setName,record.category,record.description,JSON.stringify(record.skills||[])].join(' ').toLowerCase().includes(term)));
 rows.sort(compareEquipmentRecords);
 const host=$('equipmentRows');if(!host)return;$('equipmentMeta').textContent=rows.length+' '+collectionName(state.group).toLowerCase()+(state.compatible?' · Fits slot Lv '+state.compatible:'');
 host.innerHTML=rows.slice(0,state.limit).map(record=>{const decorated=catalogueRecords.get(record.id)||record;return `<button class="catalogue-row" data-open-catalogue="${E(record.id)}">${catalogueVisual(decorated)}<span><strong>${E(record.name)}</strong><small>${E([record.rank,record.type||record.category||record.setName].filter(Boolean).map(prettyLabel).join(' · '))}${state.group==='decorations'?'':(record.skills||[]).length?' · '+E(record.skills.map(skill=>skill.name+' '+skill.level).join(', ')):''}</small></span>${record.rarity!=null?`<small class="row-fact">Rarity ${E(record.rarity)}</small>`:''}</button>`;}).join('')+(rows.length>state.limit?`<button class="db-load-more" data-more-equipment>Show more · ${state.limit} of ${rows.length}</button>`:'')||(rows.length?'':'<div class="data-empty">No matching records.</div>');
}
function slotButtons(levels,required=false){
 if(!levels?.length)return '<span class="quiet">None</span>';
 return `<span class="slot-icons">${levels.map(level=>`<button class="slot-link" data-compatible-slot="${Number(level)}" aria-label="${required?'Required decoration slot':'Find decorations fitting slot level'} ${Number(level)}">${iconGlyph('slot-'+Number(level))}<span>Lv ${Number(level)}</span></button>`).join('')}</span>`;
}
function skillLinks(skills=[]){return skills.map(skill=>{const match=(catalogues.skills||[]).find(record=>record.name===skill.name);return `<span class="skill-chip">${match?`<button data-open-catalogue="${E(match.id)}">${iconGlyph('skill')}${E(skill.name)}</button>`:E(skill.name)}${skill.level!=null?' <strong>Lv '+E(skill.level)+'</strong>':''}</span>`;}).join('')||'<span class="quiet">None</span>';}
function scalarText(value){if(value==null||value==='')return'—';if(typeof value==='object')return Array.isArray(value)?value.map(scalarText).join(' · '):Object.entries(value).map(([key,child])=>prettyLabel(key)+': '+scalarText(child)).join(' · ');return String(value);}
function recordFacts(record){
 const facts={...(record.stats||{})};for(const key of ['rank','rarity','type','gender','defenseBase','defenseMax','defenseAugmentMax','defense','attack','affinity','element','dust','dustEffect','attackType','power','speed','heal','duration','durationSeconds','cooldown','cooldownSeconds','points','category','freshness','baseHp','captureMethod','maxLevel','normalMaxLevel','secretExtraLevels','group','ingredientsRequired','activation','effectType','lifeType'])if(record[key]!=null&&record[key]!=='')facts[key]=record[key];
 return Object.entries(facts).filter(([key,value])=>key!=='resistances'&&value!=null&&value!=='').map(([label,value])=>`<div><dt>${E(prettyLabel(label))}</dt><dd>${label==='element'&&value?.type?effectVisual(value.type)+' '+E(prettyLabel(value.type))+' '+E(value.value):E(scalarText(value))}${/^(duration|cooldown)(Seconds)?$/.test(label)?' s':label==='affinity'?'%':''}</dd></div>`).join('');
}
function catalogueFold(key,title,content,open=false){return content?`<details class="catalogue-fold" data-fold-key="catalogue-${E(key)}" ${open?'open':''}><summary>${E(title)}</summary><div class="catalogue-fold-body">${content}</div></details>`:'';}
function detailReferences(record){const sources=[...(record.sources||[]),record.source,record.priceSource,record.unlockSource].filter(Boolean),seen=new Set();return sources.length?`<ul class="credit-list">${sources.filter(source=>{const url=typeof source==='string'?source:source.url;if(!url||seen.has(url))return false;seen.add(url);return true;}).map(source=>typeof source==='string'?`<li>${sourceLink(source,E(namedReference(source)))}</li>`:`<li>${sourceLink(source.url,E(source.name||namedReference(source.url)))}</li>`).join('')}</ul>`:'';}
function catalogueRecordLink(id,label=''){const record=catalogueRecords.get(id);return record?`<button class="text-btn" data-open-catalogue="${E(id)}">${E(label||record.name)}</button>`:E(label);}
function linkedLocale(name){const normal=value=>itemKey(value).replace(/^the /,''),locale=D.locales.find(candidate=>normal(candidate.name)===normal(name));return locale?`<button class="filter-chip" data-open-locale="${locale.id}">${E(name)}</button>`:`<span class="pill">${E(name)}</span>`;}
function catalogueExtras(record){
 let html='';
 const links=[record.previous&&['Previous upgrade',record.previous],record.setId&&['Armour set',record.setId],record.baseId!==record.id&&record.baseId&&['Base tool',record.baseId],record.upgradeId!==record.id&&record.upgradeId&&['Upgraded tool',record.upgradeId],record.unlocks&&['Unlocks',record.unlocks]].filter(Boolean);
 if(links.length)html+=catalogueFold('related','Related equipment & skills',`<dl class="related-records">${links.map(([label,id])=>`<div><dt>${label}</dt><dd>${catalogueRecordLink(id)}</dd></div>`).join('')}</dl>`);
 if(record.abilities?.length||record.iceborneAbility)html+=catalogueFold('abilities','Gadget abilities',`${list(record.abilities||[])}${record.iceborneAbility?`<p><strong>Iceborne:</strong> ${E(record.iceborneAbility)}</p>`:''}${record.maxProficiency?`<p>Maximum proficiency: World ${E(record.maxProficiency.world)} · Iceborne ${E(record.maxProficiency.iceborne)}</p>`:''}`,true);
 if(record.upgradeEffect)html+=catalogueFold('upgrade-effect','Upgrade effect',`<p>${E(record.upgradeEffect)}</p>`);
 if(record.legacyEvent)html+='<p class="quiet">Legacy event reward. The related collaboration quests are no longer obtainable through normal event availability.</p>';
 if(record.foodSkills?.length)html+=catalogueFold('meal-skills','Food skills',`<ul class="ingredient-list">${record.foodSkills.map(skill=>`<li>${catalogueRecordLink(skill.id,skill.name)}<small>${E(skill.ingredientsRequired)} matching ${E(record.group)} ingredients</small></li>`).join('')}</ul>`,true);
 if(record.collection==='foodSkills'){
  const ingredients=(catalogues.canteen||[]).filter(ingredient=>ingredient.foodSkills?.some(skill=>skill.id===record.id));
  html+=catalogueFold('meal-ingredients','Matching ingredients',ingredients.length?`<p>Choose ${E(record.ingredientsRequired)} ingredients from the ${E(record.group)} group. Food-skill activation also depends on meal freshness or the ticket used.</p><ul class="ingredient-list">${ingredients.map(ingredient=>`<li>${catalogueRecordLink(ingredient.id)}</li>`).join('')}</ul>`:'');
 }
 if(record.variants?.length)html+=catalogueFold('variants','Variants',tableHTML(['Variant','Base HP'],record.variants.map(variant=>`<tr><td>${E(variant.name)}</td><td>${shown(variant.baseHp)}</td></tr>`)));
 if(record.ailments?.length)html+=catalogueFold('ailments','Ailments & thresholds',tableHTML(['Effect','Buildup','Decay','Damage','Duration','Notes'],record.ailments.map(effect=>`<tr><td>${effectVisual(effect.name)} ${E(effect.name)}</td>${['buildup','decay','damage','duration','other'].map(key=>`<td>${shown(effect[key])}</td>`).join('')}</tr>`)));
 if(record.extracts?.length)html+=catalogueFold('extracts','Kinsect extracts & part thresholds',tableHTML(['Part','Extract','Base flinch','Sever'],record.extracts.map(part=>`<tr><td>${E(part.part)}</td><td>${shown(part.colour)}</td><td>${shown(part.flinch)}</td><td>${shown(part.sever)}</td></tr>`)));
 if(record.locations?.length)html+=catalogueFold('locations','Detailed locations',list(record.locations.map(scalarText)));
 if(record.rewardNotes)html+=catalogueFold('reward-notes','Reward notes',`<p>${E(record.rewardNotes)}</p>`);
 if(record.unresolvedDropPools?.length)html+=catalogueFold('context-pools','Contextual drop pools',record.unresolvedDropPools.map(pool=>`<section><h4>Pool ${E(pool.pool)}</h4><p>${E(pool.context)}</p>${tableHTML(['Item','Rank','Quantity','Chance'],pool.rows.map(reward=>`<tr><td>${itemButton(reward.item)}</td><td>${shown(reward.rank)}</td><td>${shown(reward.quantity)}</td><td>${reward.chance!=null?E(reward.chance)+'%':'—'}</td></tr>`))}</section>`).join(''));
 return html;
}
function openCatalogueRecord(id){
 const record=catalogueRecords.get(id);if(!record)return;resetDetailClass();$('detailDialog').classList.add('catalogue-dialog');
 const levels=recordSlotLevels(record),required=record.collection==='decorations'?[Number(record.slot||record.slotLevel||1)]:null;
 const craft=['forge','upgrade'].filter(path=>record[path]).map(path=>`<section class="catalogue-crafting"><h4>${prettyLabel(path)}</h4>${ingredientsHTML(record[path].materials||[])}<p class="material-cost">${record[path].researchPoints!=null?num(record[path].researchPoints)+' research pts':record[path].zenny!=null?num(record[path].zenny)+' z':'Price unavailable in source'}</p></section>`).join('');
 const resistances=record.resistances||record.elementalResistances||record.stats?.resistances;
 const pieces=(record.pieces||record.armourIds||record.armorIds||[]).map(piece=>{const target=catalogueRecords.get(typeof piece==='object'?piece.id:piece)||[...catalogueRecords.values()].find(candidate=>candidate.name===(piece.name||piece));return target?`<li><button class="text-btn" data-open-catalogue="${E(target.id)}">${catalogueVisual(target)}${E(target.name)}</button></li>`:'';}).join('');
 const habitats=(record.habitats||record.locales||[]).map(habitat=>{const name=typeof habitat==='object'?habitat.name||habitat.locale:habitat;return linkedLocale(name);}).join('');
 const rewards=(record.rewards||[]).length?tableHTML(['Material','Rank','Method / pool','Quantity','Chance'],record.rewards.map(reward=>`<tr><td>${itemButton(reward.item||reward.name)}</td><td>${shown(reward.rank)}</td><td>${E([reward.condition||reward.method,reward.variant,reward.pool!=null?'Pool '+reward.pool:null].filter(Boolean).join(' · '))}</td><td>${shown(reward.quantity)}</td><td>${reward.chance!=null?E(reward.chance)+'%':'—'}</td></tr>`)):'';
 const hitzones=(record.hitzones||[]).length?tableHTML(['Part / state','Cut','Impact','Shot','Fire','Water','Thunder','Ice','Dragon','Stun','Stamina'],record.hitzones.map(hit=>`<tr><td>${E(hit.part||hit.name)}${(hit.state||hit.variant)?'<small>'+E(hit.state||hit.variant)+'</small>':''}</td>${['cut','impact','shot','fire','water','thunder','ice','dragon','stun','stamina'].map(key=>'<td>'+shown(hit[key])+'</td>').join('')}</tr>`)):'';
 const bonuses=record.setBonuses||record.bonuses||record.setBonus;
 const progression=record.levels||record.skillLevels;
 const rawConditions=record.conditions||record.captureConditions||record.notes,conditions=rawConditions&&typeof rawConditions==='object'&&!Array.isArray(rawConditions)?Object.fromEntries(Object.entries(rawConditions).filter(([,value])=>Array.isArray(value)?value.length:value!=null&&value!=='')):rawConditions;
 const bonusHTML=bonuses?.skills?`<p><strong>${E(bonuses.name)}</strong></p><ul class="ingredient-list">${bonuses.skills.map(skill=>`<li>${catalogueRecordLink(skill.id,skill.name)}<small>${E(skill.pieces)} pieces required</small></li>`).join('')}</ul>`:bonuses?`<p>${E(scalarText(bonuses))}</p>`:'';
 $('detailBody').innerHTML=`<header class="article-header catalogue-header"><p class="eyebrow">${E(collectionName(record.collection))} · ${E(gameLabel(record.game))}</p><div class="catalogue-heading">${catalogueVisual(record,true)}<h2>${E(record.name)}</h2>${saveButton('catalogue:'+id)}</div>${record.description?`<p>${E(record.description)}</p>`:''}</header><div class="article-content catalogue-content"><dl class="weapon-stats catalogue-facts">${recordFacts(record)}${required||levels.length?`<div class="stat-wide"><dt>${required?'Required slot':'Decoration slots'}</dt><dd>${slotButtons(required||levels,!!required)}</dd></div>`:''}${(record.skills||[]).length?`<div class="stat-wide"><dt>Skills</dt><dd class="skill-links">${skillLinks(record.skills)}</dd></div>`:''}</dl>${resistances?catalogueFold('resistances','Elemental resistances',`<dl class="weapon-stats">${Object.entries(resistances).map(([key,value])=>`<div><dt>${effectVisual(key)} ${E(prettyLabel(key))}</dt><dd>${shown(value)}</dd></div>`).join('')}</dl>`):''}${catalogueFold('pieces','Set pieces',pieces?'<ul class="ingredient-list">'+pieces+'</ul>':'')}${catalogueFold('bonuses','Set bonuses',bonusHTML)}${progression?catalogueFold('levels','Skill levels',Array.isArray(progression)?progression.map((level,index)=>`<p><strong>Lv ${E(level.level||index+1)}</strong> ${E(level.description||level.effect||level.text||scalarText(level))}</p>`).join(''):`<p>${E(scalarText(progression))}</p>`,true):''}${craft?catalogueFold('craft','Crafting requirements',craft,true):''}${record.unlock?catalogueFold('unlock','Unlock requirements',`<p>${E(scalarText(record.unlock))}</p>`,true):''}${conditions&&(typeof conditions!=='object'||Object.keys(conditions).length)?catalogueFold('conditions','Conditions & notes',`<p>${E(scalarText(conditions))}</p>`):''}${habitats?catalogueFold('habitats','Where to find',`<div class="filter-chips">${habitats}</div>`,true):''}${catalogueFold('rewards','Materials & rewards',rewards)}${catalogueFold('hitzones','Hitzones',hitzones)}${catalogueExtras(record)}${catalogueFold('references','Sources',detailReferences(record))}</div>`;
 openDialog('detailDialog');paintIcons($('detailBody'));
}
const weaponMaterialsWithoutSlots=renderWeaponMaterials;
renderWeaponMaterials=function(){weaponMaterialsWithoutSlots();const weapon=weaponIndex.get(weaponState?.selected);if(!weapon)return;const label=[...$('weaponMaterials').querySelectorAll('dt')].find(dt=>dt.textContent==='Slots');if(label)label.nextElementSibling.innerHTML=slotButtons(recordSlotLevels(weapon));};
const collectionDBClick=onDatabaseClick;
onDatabaseClick=function(button){
 if(button.dataset.openCatalogue){openCatalogueRecord(button.dataset.openCatalogue);return true;}
 if(button.dataset.jumpMonster&&catalogueRecords.has(button.dataset.jumpMonster)){openCatalogueRecord(button.dataset.jumpMonster);return true;}
 if(button.dataset.compatibleSlot){screenChange(()=>{Object.assign(collectionState,{group:'decorations',q:'',rank:'all',rarity:'all',category:'all',slot:'all',compatible:Number(button.dataset.compatibleSlot),filtersOpen:false,limit:40});navigate(S.edition,'equipment');renderEquipment();});return true;}
 if(button.dataset.itemLibraryTab){if(resourceState.tab!==button.dataset.itemLibraryTab)screenChange(()=>{resourceState.tab=button.dataset.itemLibraryTab;renderPreparation();});return true;}
 if(button.dataset.filterToggle==='resource'||button.dataset.filterToggle==='equipment'){const model=button.dataset.filterToggle==='resource'?resourceState:collectionState;model.filtersOpen=!model.filtersOpen;toggleFilterPanel($(button.dataset.filterToggle+'Filters'),model.filtersOpen);button.setAttribute('aria-expanded',String(model.filtersOpen));return true;}
 if(button.hasAttribute('data-reset-resource')){Object.assign(resourceState,{category:'all',rank:'all',rarity:'all',sort:'name',limit:40});renderPreparation();return true;}
 if(button.hasAttribute('data-reset-equipment')){Object.assign(collectionState,{rank:'all',rarity:'all',category:'all',slot:'all',compatible:null,limit:40});renderEquipment();return true;}
 if(button.hasAttribute('data-more-resources')){const top=$('resourceLibraryRows').scrollTop;resourceState.limit+=40;renderResourceLibraryRows();$('resourceLibraryRows').scrollTop=top;return true;}
 if(button.hasAttribute('data-more-equipment')){const top=$('equipmentRows').scrollTop;collectionState.limit+=40;renderEquipmentRows();$('equipmentRows').scrollTop=top;return true;}
 return collectionDBClick(button);
};
const collectionDBInput=onDatabaseInput;
onDatabaseInput=function(field){if(field.id==='resourceLibrarySearch'){resourceState.q=field.value;resourceState.limit=40;renderResourceLibraryRows();return true;}if(field.id==='equipmentSearch'){collectionState.q=field.value;collectionState.limit=40;renderEquipmentRows();return true;}return collectionDBInput(field);};
const collectionDBChange=onDatabaseChange;
onDatabaseChange=function(field){
 const resources={resourceCategory:'category',resourceRank:'rank',resourceRarity:'rarity',resourceSort:'sort'},equipment={equipmentRank:'rank',equipmentRarity:'rarity',equipmentCategory:'category',equipmentSlot:'slot'};
 if(resources[field.id]){resourceState[resources[field.id]]=field.value;resourceState.limit=40;renderResourceLibraryRows();return true;}
 if(equipment[field.id]){collectionState[equipment[field.id]]=field.value;collectionState.compatible=null;collectionState.limit=40;renderEquipmentRows();return true;}
 if(field.id==='equipmentCollection'){Object.assign(collectionState,{group:field.value,q:'',rank:'all',rarity:'all',category:'all',slot:'all',compatible:null,limit:40});renderEquipment();return true;}
 return collectionDBChange(field);
};

function renderNotes(){
 const categories=[...new Set(D.guides.map(guide=>guide.category))].sort();
 $('view-notes').innerHTML=`<div class="page-wrap compendium-page">${intro('SHARED FIELD KNOWLEDGE','Field notes','')}<div class="compendium-controls"><div class="filter-search"><input id="noteSearch" type="search" value="${E(S.noteQ)}" placeholder="Search" aria-label="Search the field compendium"></div><label class="collection-picker">Topics<select id="compendiumTopic">${optionHTML('all','All',S.noteCat)}${categories.map(category=>optionHTML(category,category,S.noteCat)).join('')}</select></label></div><div id="noteGrid" class="notes-grid"></div></div>`;renderNoteGrid();syncSharedSectionTabs();paintIcons($('view-notes'));
}
function renderNoteGrid(){
 const terms=S.noteQ.toLowerCase().trim().split(/\s+/).filter(Boolean),rows=D.guides.filter(guide=>(S.noteCat==='all'||guide.category===S.noteCat)&&terms.every(term=>factText(guide).toLowerCase().includes(term)));
 $('noteGrid').innerHTML=rows.map(guide=>`<button class="note-card" data-open-guide="${guide.id}"><span class="eyebrow">${E(guide.category)}</span><h3>${E(guide.title)}</h3><p>${E(guide.summary)}</p>${guide.game==='iceborne'?'<span class="pill">Iceborne</span>':''}</button>`).join('')||'<div class="data-empty">No matching field notes.</div>';
}
openGuide=function(id){
 const guide=D.guides.find(record=>record.id===id);if(!guide)return;resetDetailClass();$('detailDialog').classList.add('compendium-dialog');
 $('detailBody').innerHTML=`<article><header class="article-header"><p class="eyebrow">${E(guide.category)} · ${E(gameLabel(guide.game))}</p><h2>${E(guide.title)}</h2><p>${E(guide.summary)}</p>${saveButton('guide:'+id)}</header><div class="article-content">${guide.sections.map((section,index)=>catalogueFold('guide-'+index,section.title,`${section.text?'<p>'+E(section.text)+'</p>':''}${section.bullets?.length?list(section.bullets):''}`,index===0)).join('')}${catalogueFold('guide-sources','Sources',detailReferences(guide))}</div></article>`;openDialog('detailDialog');paintIcons($('detailBody'));
};
const cardsWithExpand=renderWeapons;
renderWeapons=function(){
 cardsWithExpand();for(const card of $('view-weapons').querySelectorAll('.weapon-card')){const expand=card.querySelector('.weapon-expand'),id=expand?.dataset.openWeapon;if(!id)continue;expand.remove();card.dataset.openWeapon=id;card.setAttribute('role','button');card.setAttribute('tabindex','0');card.setAttribute('aria-label','Open '+D.weapons.find(weapon=>weapon.id===id)?.name);}
};
document.addEventListener('click',event=>{const card=event.target.closest?.('.weapon-card[data-open-weapon]');if(card&&!event.target.closest('button')){event.preventDefault();event.stopImmediatePropagation();openWeapon(card.dataset.openWeapon);}},true);
document.addEventListener('keydown',event=>{const card=event.target.closest?.('.weapon-card[data-open-weapon]');if(card&&event.target===card&&['Enter',' '].includes(event.key)){event.preventDefault();openWeapon(card.dataset.openWeapon);}},true);

function faunaTabs(){return `<div class="database-tabs fauna-tabs" role="tablist" aria-label="Bestiary collections">${[['large','Large monsters'],['small','Small monsters'],['endemic','Endemic life']].map(([id,name])=>`<button role="tab" data-fauna-tab="${id}" aria-selected="${bestiaryLibraryState.tab===id}">${name}</button>`).join('')}</div>`;}
const largeMonsterBestiary=renderBestiary;
renderBestiary=function(){
 const state=bestiaryLibraryState;if(state.tab==='large'){largeMonsterBestiary();$('view-bestiary').querySelector('.toolbar').insertAdjacentHTML('beforebegin',faunaTabs());paintIcons($('view-bestiary'));return;}
 const group=state.tab==='small'?'smallMonsters':'endemicLife',rows=(catalogues[group]||[]).filter(gameCompatible),count=Number(state.category!=='all')+Number(state.rank!=='all');
 $('view-bestiary').innerHTML=`<div class="page-wrap fauna-page">${intro('LIFE OF THE NEW WORLD','Bestiary','')}${faunaTabs()}<div class="db-shell fauna-shell"><div class="db-toolbar"><div class="filter-search"><input id="faunaSearch" type="search" placeholder="Search" value="${E(state.q)}" aria-label="Search ${E(collectionName(group))}"></div>${filterButton('fauna',count,state.filtersOpen)}</div><div class="db-filter-panel" id="faunaFilters" ${state.filtersOpen?'':'hidden'}>${filterLabel('Category',`<select id="faunaCategory">${catalogueOptions(rows.map(record=>record.category||record.type),state.category)}</select>`)}${state.tab==='small'?filterLabel('Reward rank',`<select id="faunaRank">${catalogueOptions(['LR','HR','MR'],state.rank)}</select>`):''}<button class="text-btn" data-reset-fauna>Clear filters</button></div><div class="db-meta" id="faunaMeta"></div><div class="catalogue-list db-table-scroll" id="faunaRows"></div></div></div>`;renderFaunaRows();paintIcons($('view-bestiary'));
};
function renderFaunaRows(){
 const state=bestiaryLibraryState,group=state.tab==='small'?'smallMonsters':'endemicLife',terms=state.q.toLowerCase().trim().split(/\s+/).filter(Boolean),rows=(catalogues[group]||[]).filter(record=>gameCompatible(record)&&(state.category==='all'||(record.category||record.type)===state.category)&&(state.rank==='all'||(record.rewards||[]).some(reward=>reward.rank===state.rank))&&terms.every(term=>[record.name,record.category,JSON.stringify(record.habitats||record.locales||[])].join(' ').toLowerCase().includes(term)));
 $('faunaMeta').textContent=rows.length+' records';$('faunaRows').innerHTML=rows.slice(0,state.limit).map(record=>`<button class="catalogue-row" data-open-catalogue="${E(record.id)}">${catalogueVisual(catalogueRecords.get(record.id)||record)}<span><strong>${E(record.name)}</strong><small>${E(record.category||record.type||collectionName(group))}</small></span></button>`).join('')+(rows.length>state.limit?`<button class="db-load-more" data-more-fauna>Show more · ${state.limit} of ${rows.length}</button>`:'')||(rows.length?'':'<div class="data-empty">No matching records.</div>');
}
const localeCardsOnly=renderLocales;
const atlasRecords=()=>[...(D.atlasMaps||[]),...(D.baseDirectories||[])];
function mapTabs(){return `<div class="database-tabs atlas-tabs" role="tablist" aria-label="Map collections">${[['world','World map'],['locales','Hunting locales'],['bases','Bases']].map(([id,name])=>`<button role="tab" data-atlas-tab="${id}" aria-selected="${mapLibraryState.tab===id}">${name}</button>`).join('')}</div>`;}
renderLocales=function(){
 if(mapLibraryState.tab==='locales'){localeCardsOnly();$('view-locales').querySelector('.locale-grid').insertAdjacentHTML('beforebegin',mapTabs());paintIcons($('view-locales'));return;}
 const rows=atlasRecords().filter(map=>map.kind===(mapLibraryState.tab==='world'?'world':'base')&&gameCompatible(map));
 $('view-locales').innerHTML=`<div class="page-wrap">${intro('WORLD & BASE CARTOGRAPHY','Locales','')}${mapTabs()}<div class="atlas-card-grid">${rows.map(map=>`<button class="atlas-card" data-open-atlas="${E(map.id)}">${map.image?`<img src="${E(map.image)}" alt="${E(map.name)} in-game map" loading="lazy" decoding="async">`:'<span class="directory-marker">'+icon('compass')+'<span>Facility directory</span></span>'}<strong>${E(map.name)}</strong><small>${E(gameLabel(map.game))}</small></button>`).join('')}</div></div>`;paintIcons($('view-locales'));
};
function openAtlasMap(id){
 const map=atlasRecords().find(record=>record.id===id);if(!map)return;resetDetailClass();$('detailDialog').classList.add('atlas-dialog');if(mapLibraryState.selected!==id){mapLibraryState.selected=id;mapLibraryState.zoom={zoom:1,x:0,y:0};}
 $('detailBody').innerHTML=`<header class="article-header"><p class="eyebrow">${map.directory?'FACILITY DIRECTORY':map.kind==='world'?'WORLD MAP':'BASE MAP'}</p><h2>${E(map.name)}</h2>${saveButton('atlas:'+id)}</header><div class="atlas-body">${map.image?`<div id="atlasMapViewport" class="map-viewport" tabindex="0" role="group" aria-label="${E(map.name)} map. Pinch to zoom and drag to pan."><img id="atlasMapImage" src="${E(map.image)}" alt="${E(map.name)} in-game map" draggable="false" width="${map.width||1600}" height="${map.height||1000}"><div class="map-zoom-controls"><output id="atlasZoomValue">100%</output><button class="text-btn" data-atlas-reset>Reset</button></div></div>`:''}${map.description?`<p class="quiet">${E(map.description)}</p>`:''}${map.links?.length?`<div class="filter-chips">${map.links.map(link=>`<button class="filter-chip" data-open-locale="${E(link.localeId)}">${E(link.name)}</button>`).join('')}</div>`:''}${map.facilities?.length?catalogueFold('facilities','Facilities',map.facilities.map(facility=>`<article class="base-facility"><h4>${E(facility.name)}</h4><p>${E(facility.description||'')}</p></article>`).join(''),true):''}${catalogueFold('map-source','Source',detailReferences(map))}</div>`;
 openDialog('detailDialog');if(map.image){bindPanZoom($('atlasMapViewport'),()=>({...mapLibraryState.zoom}),value=>{mapLibraryState.zoom=value;updateAtlasMap();});updateAtlasMap();}paintIcons($('detailBody'));
}
function updateAtlasMap(){const state=mapLibraryState.zoom,image=$('atlasMapImage');if(!image)return;image.style.transform=`translate(${state.x}px,${state.y}px) scale(${state.zoom})`;$('atlasZoomValue').textContent=Math.round(state.zoom*100)+'%';}

const viewsDBClick=onDatabaseClick;
onDatabaseClick=function(button){
 if(button.dataset.faunaTab){bestiaryLibraryState.tab=button.dataset.faunaTab;Object.assign(bestiaryLibraryState,{q:'',category:'all',rank:'all',limit:40});renderBestiary();return true;}
 if(button.dataset.filterToggle==='fauna'){bestiaryLibraryState.filtersOpen=!bestiaryLibraryState.filtersOpen;toggleFilterPanel($('faunaFilters'),bestiaryLibraryState.filtersOpen);button.setAttribute('aria-expanded',String(bestiaryLibraryState.filtersOpen));return true;}
 if(button.hasAttribute('data-reset-fauna')){Object.assign(bestiaryLibraryState,{category:'all',rank:'all',limit:40});renderBestiary();return true;}
 if(button.hasAttribute('data-more-fauna')){const top=$('faunaRows').scrollTop;bestiaryLibraryState.limit+=40;renderFaunaRows();$('faunaRows').scrollTop=top;return true;}
 if(button.dataset.atlasTab){mapLibraryState.tab=button.dataset.atlasTab;renderLocales();return true;}
 if(button.dataset.openAtlas){openAtlasMap(button.dataset.openAtlas);return true;}
 if(button.hasAttribute('data-atlas-reset')){mapLibraryState.zoom={zoom:1,x:0,y:0};updateAtlasMap();return true;}
 return viewsDBClick(button);
};
const viewsDBInput=onDatabaseInput;
onDatabaseInput=function(field){if(field.id==='faunaSearch'){bestiaryLibraryState.q=field.value;bestiaryLibraryState.limit=40;renderFaunaRows();return true;}return viewsDBInput(field);};
const viewsDBChange=onDatabaseChange;
onDatabaseChange=function(field){
 if(field.id==='compendiumTopic'){S.noteCat=field.value;renderNoteGrid();return true;}
 if(field.id==='faunaCategory'||field.id==='faunaRank'){bestiaryLibraryState[field.id==='faunaCategory'?'category':'rank']=field.value;bestiaryLibraryState.limit=40;renderFaunaRows();return true;}
 return viewsDBChange(field);
};

const fontSizeOnly=applyFontPreferences;
applyFontPreferences=function(){fontSizeOnly();const root=document.documentElement;root.style.setProperty('--guide-line-height',appearancePrefs.lineHeight);root.style.setProperty('--guide-letter-spacing',appearancePrefs.letterSpacing+'em');root.style.setProperty('--guide-word-spacing',appearancePrefs.wordSpacing+'em');};
const appearanceWithoutSpacing=renderAppearanceSettings;
renderAppearanceSettings=function(){
 appearanceWithoutSpacing();const setting=$('settingsPanel').querySelector('.font-setting'),preview=setting.querySelector('.font-preview');
 const ranges=[['lineHeight','Line spacing',1.2,2,.05],['letterSpacing','Letter spacing',0,.1,.01],['wordSpacing','Word spacing',0,.25,.01]];
 const block=document.createElement('div');block.className='spacing-settings';block.innerHTML=ranges.map(([key,label,min,max,step])=>`<div class="spacing-setting"><label for="spacing-${key}">${label}<output id="spacing-value-${key}">${key==='lineHeight'?Number(appearancePrefs[key]).toFixed(2)+'×':Number(appearancePrefs[key]).toFixed(2)+' em'}</output></label><input id="spacing-${key}" data-text-spacing="${key}" type="range" min="${min}" max="${max}" step="${step}" value="${appearancePrefs[key]}" aria-label="${label}"></div>`).join('')+'<button class="secondary-btn" data-reset-typography>Reset text settings</button>';setting.insertBefore(block,preview);
};
document.addEventListener('input',event=>{const field=event.target,key=field.dataset.textSpacing;if(!['lineHeight','letterSpacing','wordSpacing'].includes(key))return;const limits={lineHeight:[1.2,2],letterSpacing:[0,.1],wordSpacing:[0,.25]};appearancePrefs[key]=Math.max(limits[key][0],Math.min(limits[key][1],Number(field.value)||limits[key][0]));applyFontPreferences();persist();$('spacing-value-'+key).textContent=key==='lineHeight'?appearancePrefs[key].toFixed(2)+'×':appearancePrefs[key].toFixed(2)+' em';});
document.addEventListener('click',event=>{if(event.target.closest?.('[data-reset-typography]')){Object.assign(appearancePrefs,{fontPt:11,lineHeight:1.6,letterSpacing:0,wordSpacing:0});applyFontPreferences();persist();renderAppearanceSettings();}});

const existingSearchIndex=searchIndex;let expandedSearchCache=null;
const fullSkillsByName=new Map((catalogues.skills||[]).map(skill=>[itemKey(skill.name),skill]));
S.saved=[...new Set(S.saved.map(key=>key.startsWith('skill:')&&fullSkillsByName.has(itemKey(key.slice(6)))?'catalogue:'+fullSkillsByName.get(itemKey(key.slice(6))).id:key))];
searchIndex=function(){if(expandedSearchCache)return expandedSearchCache;expandedSearchCache=[...existingSearchIndex().filter(entry=>entry.kind!=='skill'||!fullSkillsByName.has(itemKey(entry.id))),...[...catalogueRecords.values()].map(record=>({kind:'catalogue',id:record.id,title:record.name,sub:collectionName(record.collection),text:factText(record),game:record.game||'both'})),...atlasRecords().map(map=>({kind:'atlas',id:map.id,title:map.name,sub:map.directory?'Facility directory':'Map',text:map.description||'',game:map.game||'both'}))];return expandedSearchCache;};
const recordVisual=resultVisual;
resultVisual=function(entry){if(entry.kind==='catalogue'){const record=catalogueRecords.get(entry.id);return record?catalogueVisual(record):'';}if(entry.kind==='atlas')return icon('compass');return recordVisual(entry);};
const entryWithoutLibraries=openEntry;
openEntry=function(kind,id,...args){if(kind==='skill'){const record=fullSkillsByName.get(itemKey(id));if(record){openCatalogueRecord(record.id);return;}}if(kind==='catalogue'){openCatalogueRecord(id);return;}if(kind==='atlas'){openAtlasMap(id);return;}return entryWithoutLibraries(kind,id,...args);};
const creditsWithoutLibraryCoverage=openCredits;
openCredits=function(...args){
 creditsWithoutLibraryCoverage(...args);const article=$('detailBody').querySelector('.article-content');if(!article)return;
 const counts=catalogueGroups.map(([group,label])=>`<li>${E(label)}: ${num((catalogues[group]||[]).length)}</li>`).join('');
 article.insertAdjacentHTML('beforeend',`<details class="credit-fold" data-fold-key="credit-library-coverage"><summary>Catalogue coverage & known gaps</summary><div><ul class="credit-list">${counts}<li>Small monsters: ${num((catalogues.smallMonsters||[]).length)}</li><li>Endemic life: ${num((catalogues.endemicLife||[]).length)}</li></ul><p class="quiet">All records are stored in this file. Source values that could not be verified stay unavailable. Five armour and five charm prices are missing. Many Palico armour research-point prices are unspecified, and three post-update Palico weapons with placeholder source data are omitted. Creature spawn conditions and source-specific reward pools retain their available context.</p><p class="quiet">World, Astera and Seliana use genuine game map images. Research Base and the two Gathering Hubs use facility directories. Armour, mantle, charm, skill and empty-slot symbols use attributed community recreations where original exports were unavailable; the other embedded game sprites retain their artwork sources.</p></div></details>`);paintIcons(article);
};

// Shared visual preferences and collection memory. Overview keeps its spacious composition.
function applyGradientPreferences(){
 const root=document.documentElement;root.dataset.gradients=gradientPrefs.enabled?'on':'off';
 let a,b;
 if(gradientPrefs.preset==='custom'){a=gradientPrefs.a;b=gradientPrefs.b;}
 else if(gradientPrefs.preset==='world'){a='#24543c';b='#d9b77a';}
 else if(gradientPrefs.preset==='iceborne'){a='#18314f';b='#9fdaf0';}
 else if(appearancePrefs.theme!=='game'){
  const palette=appearancePrefs.theme==='custom'?appearancePrefs.custom:themePresets.find(theme=>theme.id===appearancePrefs.theme);
  a=palette?.bg||'#183c2d';b=palette?.accent||'#d9b77a';
 }else{a=S.edition==='world'?'#24543c':'#18314f';b=S.edition==='world'?'#d9b77a':'#9fdaf0';}
 const opacity=gradientPrefs.enabled?gradientPrefs.strength/100:0;
 root.style.setProperty('--gradient-a',hexRGB(a).join(','));root.style.setProperty('--gradient-b',hexRGB(b).join(','));root.style.setProperty('--gradient-strength',opacity);root.style.setProperty('--gradient-direction',gradientPrefs.direction+'deg');
 root.style.setProperty('--surface-gradient',`linear-gradient(${gradientPrefs.direction}deg,rgba(${hexRGB(a).join(',')},${opacity}),rgba(${hexRGB(b).join(',')},${opacity*.55}))`);
 const output=$('gradientStrengthValue');if(output)output.textContent=gradientPrefs.strength+'%';
 const direction=$('gradientDirectionValue');if(direction)direction.textContent=gradientPrefs.direction+'°';
 const controls=$('gradientCustom');if(controls)controls.hidden=gradientPrefs.preset!=='custom';
}
const visualAppearance=applyAppearance;
applyAppearance=function(...args){const result=visualAppearance(...args);applyGradientPreferences();return result;};

// Use the community vectors at every display size, keeping each equipment rarity distinguishable.
const spriteWeaponVisual=weaponVisual;
weaponVisual=function(weapon,cls='',label=false){
 const rarity=Math.max(1,Math.min(12,Number(weapon.rarity)||1)),key=visualData.hdWeapons?.[weapon.type]?.[rarity];
 if(!key)return spriteWeaponVisual(weapon,cls,label);
 return visualHTML(key,'rarity-weapon vector-equipment '+cls,label?`Rarity ${rarity}`:'').replace('<span ','<span data-rarity="'+rarity+'" ');
};
const spriteCatalogueVisual=catalogueVisual;
catalogueVisual=function(record,large=false){
 const key=record.collection==='armours'?'armour-'+({arms:'arm',legs:'leg'}[record.type||record.part]||record.type||record.part||'head'):record.collection==='armourSets'?'armour-set':record.collection==='charms'?'charm':null;
 const vector=key&&visualData.hdArmour?.[key]?.[Math.max(1,Math.min(12,Number(record.rarity)||1))];
 return vector?visualHTML(vector,'equipment-game-icon '+(large?'large':''),record.name):spriteCatalogueVisual(record,large);
};

function legendButton(key,label,meaning,symbol){return `<button class="legend-entry" data-legend-key="${E(key)}" data-legend-label="${E(label)}" data-legend-meaning="${E(meaning)}">${symbol}<span>${E(label)}</span></button>`;}
function renderInteractiveLegend(){
 const legend=$('settingsPanel')?.querySelector('.icon-legend');if(!legend)return;
 const effects=['Fire','Water','Thunder','Ice','Dragon','Poison','Paralysis','Sleep','Blast','Stun','Exhaust'];
 legend.innerHTML='<summary>Icon & rarity legend</summary><div class="legend-content"><h4>Elements & ailments</h4><div class="legend-grid">'+effects.map(name=>legendButton('effect-'+name,name,['Fire','Water','Thunder','Ice','Dragon'].includes(name)?name+' element':name+' status effect',effectVisual(name))).join('')+'</div><h4>Equipment rarity</h4><p class="quiet">Weapon and armour colours · Rarity 1–12</p><div class="legend-grid rarity-legend">'+Array.from({length:12},(_,i)=>legendButton('rarity-'+(i+1),'Rarity '+(i+1),'Equipment rarity '+(i+1)+'. The same rarity colour is used for weapon and armour icons.',`<span class="rarity-pair">${weaponVisual({type:'great-sword',rarity:i+1})}${catalogueVisual({collection:'armours',type:'head',name:'Armour rarity '+(i+1),rarity:i+1})}</span>`)).join('')+'</div><h4>Decoration slots</h4><div class="legend-grid">'+[1,2,3,4].map(level=>legendButton('slot-'+level,'Slot Lv '+level,'Fits a decoration requiring level '+level+' or lower.',iconGlyph('slot-'+level))).join('')+'</div><p class="quiet legend-source">Vectors: OthelloRhin, community recreations. Other symbols retain their original sprite credits.</p></div>';
}
const appearanceWithoutVisuals=renderAppearanceSettings;
renderAppearanceSettings=function(){
 appearanceWithoutVisuals();const panel=$('settingsPanel');renderInteractiveLegend();
 const motion=document.createElement('details');motion.className='settings-group';motion.dataset.foldKey='settings-animation';motion.open=true;
 motion.innerHTML=`<summary>Animations</summary><div class="settings-group-body"><label class="setting-toggle" for="animationsEnabled"><span>Animations</span><input id="animationsEnabled" type="checkbox" ${motionPrefs.speed>0?'checked':''}></label><label class="range-label" for="animationSpeed">Speed <output id="animationSpeedValue">${motionPrefs.speed===0?'Off':Math.round(motionPrefs.speed)+' / 100'}</output></label><input id="animationSpeed" type="range" min="0" max="100" step="1" value="${motionPrefs.speed}"><div class="range-captions"><span>0 · Off</span><span>50 · Normal</span><span>100 · Fast</span></div></div>`;
 const gradient=document.createElement('details');gradient.className='settings-group preference-group';gradient.dataset.foldKey='settings-gradients';gradient.open=false;
 gradient.innerHTML=`<summary>Gradients</summary><div class="settings-group-body"><label class="setting-toggle" for="gradientsEnabled"><span>Gradients</span><input id="gradientsEnabled" type="checkbox" ${gradientPrefs.enabled?'checked':''}></label><label class="range-label" for="gradientPreset">Palette</label><select id="gradientPreset">${[['game','Auto · Current theme'],['world','World'],['iceborne','Iceborne'],['custom','Custom']].map(([id,name])=>optionHTML(id,name,gradientPrefs.preset)).join('')}</select><div id="gradientCustom" class="colour-inputs" ${gradientPrefs.preset==='custom'?'':'hidden'}><label>First colour<input type="color" id="gradientColourA" value="${gradientPrefs.a}"></label><label>Second colour<input type="color" id="gradientColourB" value="${gradientPrefs.b}"></label></div><label class="range-label" for="gradientStrength">Strength <output id="gradientStrengthValue">${gradientPrefs.strength}%</output></label><input id="gradientStrength" type="range" min="0" max="40" step="1" value="${gradientPrefs.strength}"><label class="range-label" for="gradientDirection">Direction <output id="gradientDirectionValue">${gradientPrefs.direction}°</output></label><input id="gradientDirection" type="range" min="0" max="360" step="15" value="${gradientPrefs.direction}"><div class="gradient-preview"><strong>Live preview</strong><span>Subtle colour · Clear text</span></div></div>`;
 panel.insertBefore(motion,panel.querySelector('.icon-legend'));panel.insertBefore(gradient,panel.querySelector('.icon-legend'));
};
document.addEventListener('input',event=>{
 const field=event.target;if(field.id==='animationSpeed'){setMotionSpeed(field.value);return;}
 const fields={gradientStrength:['strength',0,40],gradientDirection:['direction',0,360]};
 if(fields[field.id]){const [key,min,max]=fields[field.id];gradientPrefs[key]=bounded(field.value,min,max,15);}
 else if(['gradientColourA','gradientColourB'].includes(field.id)){if(!/^#[a-f\d]{6}$/i.test(field.value))return;gradientPrefs[field.id.endsWith('A')?'a':'b']=field.value;}else return;
 applyGradientPreferences();persist();
});
document.addEventListener('change',event=>{
 const field=event.target;if(field.id==='animationsEnabled'){setMotionSpeed(field.checked?motionPrefs.lastSpeed:0);return;}
 if(field.id==='gradientsEnabled')gradientPrefs.enabled=field.checked;
 else if(field.id==='gradientPreset'&&['game','world','iceborne','custom'].includes(field.value))gradientPrefs.preset=field.value;else return;
 applyGradientPreferences();persist();
});
// Legend is a child of Settings, so dismissing it preserves the current settings and scroll.
function openLegend(button){
 const dialog=$('itemDialog');activeItem=null;itemReturnFocus=button;
 $('itemBody').innerHTML=`<div class="legend-detail"><div class="legend-enlarged">${button.firstElementChild.outerHTML}</div><h2>${E(button.dataset.legendLabel)}</h2><p>${E(button.dataset.legendMeaning)}</p><button class="secondary-btn" data-close="itemDialog">Back to settings</button></div>`;
 if(!dialog.open){if(dialog.showModal)dialog.showModal();else dialog.setAttribute('open','');}dialog.scrollTop=0;document.body.style.overflow='hidden';paintIcons(dialog);
}
document.addEventListener('click',event=>{const button=event.target.closest?.('[data-legend-key]');if(button)screenChange(()=>openLegend(button));});

// Compact, conditional details keep original records intact.
function meaningfulValue(value){if(value==null||value===''||value===false)return false;if(typeof value==='number')return Number.isFinite(value)&&value!==0;const text=String(value).trim();return !!text&&!/^(?:—|-|n\/?a|null|none|0(?:\.0+)?(?:\s*(?:s|seconds?|%))?)$/i.test(text);}
renderMonsterAilments=function(db){
 const fields=[['Initial buildup',a=>a.initial??a.base],['Increase',a=>a.increase??a.buildup],['Maximum',a=>a.max??a.maximum],['Decay',a=>a.decay],['Duration',a=>meaningfulValue(a.duration)?a.duration+' s':a.durationText],['Damage',a=>a.damageByRank&&['HR','MR'].includes(monsterState.rank)?a.damageByRank[monsterState.rank]:a.damage]];
 const entries=(db.ailments||[]).map(ailment=>{
  const available=fields.map(([name,get])=>[name,get(ailment)]).filter(([,value])=>meaningfulValue(value));
  const immune=ailment.immune===true||ailment.immunity===true||ailment.effect==='immune';if(!available.length&&!immune)return'';
  const name=ailment.name||ailment.ailment||ailment.type;
  return `<section class="ailment-entry" data-ailment="${E(name)}"><h4>${effectVisual(name)}<span>${E(name)}</span>${ailment.state?`<small>${E(ailment.state)}</small>`:''}${immune?'<span class="pill">Immune</span>':''}</h4>${available.length?`<dl class="ailment-facts">${available.map(([label,value])=>`<div><dt>${E(label)}</dt><dd>${E(value)}</dd></div>`).join('')}</dl>`:''}</section>`;
 }).filter(Boolean);
 return `<div class="monster-data-filters">${monsterRankFilter()}</div><div class="ailment-list">${entries.join('')||'<p class="quiet">No nonzero ailment values in this source.</p>'}</div>`;
};
const recipeRowsWithEmptyDetails=renderRecipeRows;
renderRecipeRows=function(){
 recipeRowsWithEmptyDetails();
 for(const row of $('recipeRows')?.querySelectorAll('[data-recipe-id]')||[]){
  const recipe=DB.recipes.find(record=>record.id===row.dataset.recipeId);if(!recipe)continue;
  const cost=recipe.cost&&Object.values(recipe.cost).some(meaningfulValue),details=cost||['output','inputDescription','unlock','notes'].some(key=>meaningfulValue(recipe[key]))||recipe.inputPool?.length||recipe.pool?.length;
  if(!details){row.querySelector('.recipe-details')?.closest('td')?.remove();row.classList.add('recipe-no-details');}
 }
 const table=$('recipeRows')?.querySelector('table');if(table&&!table.querySelector('.recipe-details'))table.querySelector('thead th:last-child')?.remove();else if(table)for(const row of table.querySelectorAll('.recipe-no-details'))row.querySelector('td:last-child')?.setAttribute('colspan','2');
};

// Saved filters are scoped to their own collection rather than leaking between collections.
const visualDBChange=onDatabaseChange;
onDatabaseChange=function(field){
 if(field.id==='equipmentCollection'){
  rememberFilters('equipment:'+collectionState.group,collectionState);
  Object.assign(collectionState,{group:field.value,q:'',rank:'all',rarity:'all',category:'all',slot:'all',compatible:null,limit:40},recalledFilters('equipment:'+field.value));renderEquipment();return true;
 }
 const result=visualDBChange(field);if(!result)return result;
 if(field.id.startsWith('resource'))rememberFilters('resources',resourceState);
 if(field.id.startsWith('equipment'))rememberFilters('equipment:'+collectionState.group,collectionState);
 if(field.id.startsWith('weapon')&&weaponState)rememberFilters('weapon:'+weaponState.type,weaponState);
 if(field.id.startsWith('recipe'))rememberFilters('recipe:'+recipeState.method,recipeState);
 if(field.id.startsWith('fauna'))rememberFilters('fauna:'+bestiaryLibraryState.tab,bestiaryLibraryState);
 if(['monsterDataRank','monsterRewardMethod'].includes(field.id)&&monsterState)rememberFilters('monster:'+monsterState.id,monsterState);
 if(field.id==='compendiumTopic'){filterMemory.notes={category:S.noteCat};persist();}return result;
};
const visualDBClick=onDatabaseClick;
onDatabaseClick=function(button){
 if(button.dataset.recipeMethod){rememberFilters('recipe:'+recipeState.method,recipeState);const result=visualDBClick(button);Object.assign(recipeState,{category:'all',game:'all',rank:'all'},recalledFilters('recipe:'+recipeState.method));renderPreparation();return result;}
 if(button.dataset.faunaTab){rememberFilters('fauna:'+bestiaryLibraryState.tab,bestiaryLibraryState);const result=visualDBClick(button);Object.assign(bestiaryLibraryState,recalledFilters('fauna:'+bestiaryLibraryState.tab));renderBestiary();return result;}
 const result=visualDBClick(button);
 if(button.hasAttribute('data-reset-resource'))rememberFilters('resources',resourceState);
 if(button.hasAttribute('data-reset-equipment'))rememberFilters('equipment:'+collectionState.group,collectionState);
 if(button.hasAttribute('data-reset-fauna'))rememberFilters('fauna:'+bestiaryLibraryState.tab,bestiaryLibraryState);
 if(button.dataset.resetDbFilters==='weapon')rememberFilters('weapon:'+weaponState.type,weaponState);
 if(button.dataset.resetDbFilters==='recipe')rememberFilters('recipe:'+recipeState.method,recipeState);
 if(button.dataset.resetDbFilters==='monster')rememberFilters('monster:'+monsterState.id,monsterState);
 return result;
};
Object.assign(resourceState,recalledFilters('resources'));Object.assign(collectionState,recalledFilters('equipment:'+collectionState.group));Object.assign(recipeState,recalledFilters('recipe:'+recipeState.method));Object.assign(bestiaryLibraryState,recalledFilters('fauna:'+bestiaryLibraryState.tab));S.noteCat=recalledFilters('notes').category||S.noteCat;
const rememberedMonster=openMonster;
openMonster=function(...args){const result=rememberedMonster(...args);if(monsterState){Object.assign(monsterState,recalledFilters('monster:'+monsterState.id));renderMonsterPanel();}return result;};

// World is the only Speedrun selector until its required story route is complete.
const worldRouteFinished=()=>speedrunStages('world').length>0&&speedrunStages('world').every(stage=>speedrunComplete(stage,'world'));
let speedrunUnlockPending=false,speedrunUnlockTimer=0;
function syncSpeedrunTabs(){
 const gated=S.view==='progression'&&!worldRouteFinished(),switcher=$('editionSwitch');switcher.classList.toggle('world-route-only',gated);$('iceborneTab').hidden=gated;switcher.setAttribute('aria-label',S.view==='progression'?'Speedrun campaign':'Game edition');
 if(S.view==='progression'&&speedrunUnlockPending&&!gated){
  speedrunUnlockPending=false;switcher.classList.add('speedrun-edition-unlock');cancelMotionTimer(speedrunUnlockTimer);speedrunUnlockTimer=motionLater(()=>switcher.classList.remove('speedrun-edition-unlock'),900);
 }else if(gated||S.view!=='progression')switcher.classList.remove('speedrun-edition-unlock');
}
const sharedTabsWithoutVisuals=syncSharedSectionTabs;
syncSharedSectionTabs=function(){sharedTabsWithoutVisuals();$('sharedSectionTabs').querySelectorAll('button').forEach(button=>button.textContent=button.textContent.toUpperCase());syncSpeedrunTabs();};
const visualRenderProgression=renderProgression;
renderProgression=function(){visualRenderProgression();syncSpeedrunTabs();};
const visualSpeedrunTask=setSpeedrunTask;
setSpeedrunTask=function(...args){const wasFinished=worldRouteFinished();visualSpeedrunTask(...args);if(!wasFinished&&worldRouteFinished()){speedrunUnlockPending=true;syncSpeedrunTabs();}else syncSpeedrunTabs();};
const visualNavigation=applyNavigation;
applyNavigation=function(mode=S.edition,view=S.view,scroll=true){if(view==='progression'&&mode==='iceborne'&&!worldRouteFinished())mode='world';visualNavigation(mode,view,scroll);syncSpeedrunTabs();};

// Friendly reference names retain each original destination URL.
const technicalReference=namedReference;
namedReference=function(url){
 let path='';try{path=decodeURIComponent(new URL(url).pathname).toLowerCase();}catch{path=String(url).toLowerCase();}
 const source=path.includes('mhworlddata')?'MHWorldData':path.includes('mhwmasterdatautils')?'TanukiSharp':path.includes('mhw-icons')||path.includes('mhw_icons')?'MHW Icons SVG':null;
 if(source){const topic=/armou?r|chest|head|waist|legs|arms/.test(path)?(source==='TanukiSharp'?'Armour crafting data':'Armour statistics'):/weapon/.test(path)?'Weapon statistics':/deco|jewel|skill/.test(path)?'Skills & decorations':/item|recipe/.test(path)?'Items & recipes':'Game reference data';return source+' — '+topic;}
 return technicalReference(url);
};
const creditsWithTechnicalNames=openCredits;
openCredits=function(...args){
 const result=creditsWithTechnicalNames(...args);
 for(const anchor of $('detailBody').querySelectorAll('a[href]'))if(/\.csv\b|\.json\b|Open reference/i.test(anchor.textContent))anchor.textContent=namedReference(anchor.getAttribute('href'));
 if(visualData.hdSource)$('detailBody').querySelector('.article-content')?.insertAdjacentHTML('beforeend',`<details class="credit-fold" data-fold-key="credit-vector-icons"><summary>Scalable icon credits & coverage</summary><div><p>${E(visualData.hdSource.attribution)}</p><p>353 scalable vectors cover weapon and armour rarities, decorations and selected tools. Unmatched items and ailments retain the embedded game sprites.</p>${sourceLink(visualData.hdSource.url,E(visualData.hdSource.name))}<details><summary>MIT licence</summary><pre class="licence-text">${E(visualData.hdSource.licenseText)}</pre></details></div></details>`);return result;
};

// Smaller fixed profile titles retain context while the long record scrolls.
function syncCompactProfileHeaders(){
 const dialog=$('detailDialog'),weapon=dialog.classList.contains('weapon-record-dialog')&&weaponState?.detail?weaponIndex.get(weaponState.selected):null,heading=dialog.querySelector('.weapon-detail-head');
 if(heading){const label=weapon?weapon.name:D.weapons.find(record=>record.id===weaponState?.type)?.name||'';const signature=label+'|'+(weapon?.rarity||'');if(heading.dataset.compactTitle!==signature){heading.dataset.compactTitle=signature;heading.innerHTML=`${weapon?'<button class="mini-back" data-weapon-list aria-label="Back to weapons">'+icon('arrow')+'</button>':''}<h2>${weapon?weaponVisual(weapon):''}<span>${E(label)}</span></h2>${weapon?'<small>Rarity '+weapon.rarity+'</small>':''}`;}}
 for(const id of ['detailDialog','itemDialog']){
  const root=$(id),body=$(id==='detailDialog'?'detailBody':'itemBody');let mini=root.querySelector(':scope>.profile-mini');
  if(!mini){mini=document.createElement('div');mini.className='profile-mini';mini.setAttribute('aria-hidden','true');root.insertBefore(mini,body);}
  const title=body.querySelector('.catalogue-heading h2,.profile-title h2,.item-header h2,.article-header h2'),name=title?.textContent?.trim()||'',visual=body.querySelector('.catalogue-heading>.equipment-game-icon,.catalogue-heading>.catalogue-glyph,.catalogue-heading>.catalogue-art,.item-portrait'),rarity=[...body.querySelectorAll('dt')].find(label=>label.textContent==='Rarity')?.nextElementSibling?.textContent||body.querySelector('.pill-row')?.textContent.match(/Rarity\s+(\d+)/)?.[1]||'',signature=name+'|'+rarity+'|'+(visual?.outerHTML||'');
  if(mini.dataset.signature!==signature){mini.dataset.signature=signature;mini.innerHTML=name?`<div class="profile-mini-inner">${visual?.outerHTML?.replace(/item-portrait/g,'mini-symbol')||''}<strong>${E(name)}${rarity?'<small>Rarity '+E(rarity)+'</small>':''}</strong><button class="icon-btn" data-close="${id}" aria-label="Back to previous screen">${icon('arrow')}</button><button class="icon-btn" data-close="${id}" aria-label="Close profile">${icon('close')}</button></div>`:'';}
  root.classList.toggle('profile-scrolled',!!name&&(root.scrollTop||body.scrollTop)>110);mini.setAttribute('aria-hidden',String(!root.classList.contains('profile-scrolled')));mini.inert=!root.classList.contains('profile-scrolled');
 }
}
const paintWithoutCompactHeaders=paintIcons;
paintIcons=function(root=document){paintWithoutCompactHeaders(root);syncCompactProfileHeaders();};
document.addEventListener('scroll',event=>{if(event.target.closest?.('dialog'))syncCompactProfileHeaders();},true);

// Brief feedback for small controls; large panels use a separate, softer exit.
const controlVisibility=new WeakMap(),controlExitFinish=new WeakMap(),pendingControlExits=new Set();
function finishControlExits(){for(const finish of [...pendingControlExits])finish();}
function setControlVisibility(node,show){
 if(!node)return;controlExitFinish.get(node)?.();const old=controlVisibility.get(node);old?.cancel();controlVisibility.delete(node);node.inert=false;delete node.dataset.closing;
 if(show){node.hidden=false;if(!reducedMotion()){const animation=animateUI(node,[{opacity:0,transform:'translateY(5px)'},{opacity:1,transform:'none'}],{duration:170,easing:'ease-out'});if(animation)controlVisibility.set(node,animation);}return;}
 if(node.hidden)return;if(reducedMotion()||typeof node.animate!=='function'){node.hidden=true;return;}
 node.inert=true;node.dataset.closing='true';const animation=animateUI(node,[{opacity:1},{opacity:0}],{duration:140,easing:'ease-out',fill:'both'});controlVisibility.set(node,animation);
 const finish=()=>{pendingControlExits.delete(finish);controlExitFinish.delete(node);if(controlVisibility.get(node)!==animation)return;node.hidden=true;node.inert=false;delete node.dataset.closing;controlVisibility.delete(node);animation.cancel();};controlExitFinish.set(node,finish);pendingControlExits.add(finish);animation.finished.then(finish,()=>{});
}
const abruptMusicDock=toggleMusicDock;
toggleMusicDock=function(on){
 const dock=$('musicDock'),visible=on===undefined?dock.hidden||dock.dataset.closing==='true':on;
 if(visible)closeGuideMenu();setControlVisibility(dock,visible);if(!visible){setControlVisibility($('playbackOptions'),false);$('audioLoop').setAttribute('aria-expanded','false');}$('musicOpen').setAttribute('aria-expanded',String(visible));
};
function animateContentArrival(node){if(!node||reducedMotion())return;animateUI(node,[{opacity:.55,filter:'blur(1.5px)'},{opacity:1,filter:'blur(0)'}],{duration:170,easing:'ease-out'});}
document.addEventListener('click',event=>{
 const target=event.target.closest?.('button');if(!target||reducedMotion())return;
 if(target.matches('[data-save],[data-clear-search],[data-speedrun-reset],[data-speedrun-undo],.slot-link'))animateUI(target,[{opacity:.65},{opacity:1}],{duration:150,easing:'ease-out'});
 const tab=target.matches('[role="tab"],[data-recipe-method],[data-fauna-tab],[data-atlas-tab],[data-item-library-tab]');
 if(tab&&!target.matches('[data-weapon-tab],[data-monster-tab],[data-locale-tab]')){const dialog=target.closest('dialog');nextFrame(()=>animateContentArrival(dialog?.querySelector('#recordPanel,#settingsPanel,#localePanel')||$('view-'+S.view)));}
});

const treeMaterialsWithoutMotion=renderTreeMaterials;
renderTreeMaterials=function(){
 const panel=$('treeMaterials');if(!panel)return;
 if(!weaponState?.treeDetails&&!panel.hidden){setControlVisibility(panel,false);return;}
 if(weaponState?.treeDetails){const opening=panel.hidden||panel.dataset.closing==='true';treeMaterialsWithoutMotion();if(opening)setControlVisibility(panel,true);}else treeMaterialsWithoutMotion();
};
window.matchMedia?.('(prefers-reduced-motion: reduce)')?.addEventListener?.('change',applyMotionPreferences);

function rememberBestiaryFilters(){rememberFilters('bestiary:'+S.edition,{type:S.monsterType,kind:S.monsterKind,scope:S.monsterScope});}
const bestiaryWithTransientFilters=renderBestiary;
renderBestiary=function(){const memory=recalledFilters('bestiary:'+S.edition);S.monsterType=memory.type||S.monsterType;S.monsterKind=memory.kind||S.monsterKind;S.monsterScope=memory.scope||S.monsterScope;return bestiaryWithTransientFilters();};

const notesWithTransientFilters=renderNotes;
renderNotes=function(){const category=recalledFilters('notes').category;if(category==='all'||D.guides.some(guide=>guide.category===category))S.noteCat=category;return notesWithTransientFilters();};
function refreshFilterBadge(kind,model,keys){
 const button=document.querySelector('[data-filter-toggle="'+kind+'"]');if(!button)return;
 const count=keys.filter(key=>model[key]!=null&&model[key]!=='all'&&model[key]!=='name').length;
 const badge=button.querySelector('.filter-count');if(!count){badge?.remove();return;}
 if(badge)badge.textContent=String(count);else button.insertAdjacentHTML('beforeend','<span class="filter-count">'+count+'</span>');
}
const resourcesWithStaticBadge=renderResourceLibraryRows;
renderResourceLibraryRows=function(){resourcesWithStaticBadge();refreshFilterBadge('resource',resourceState,['category','rank','rarity']);};
const equipmentWithStaticBadge=renderEquipmentRows;
renderEquipmentRows=function(){equipmentWithStaticBadge();refreshFilterBadge('equipment',collectionState,['category','rank','rarity','slot']);};
const faunaWithStaticBadge=renderFaunaRows;
renderFaunaRows=function(){faunaWithStaticBadge();refreshFilterBadge('fauna',bestiaryLibraryState,['category','rank']);};
const saveWithoutFeedback=toggleSave;
toggleSave=function(key){saveWithoutFeedback(key);if(!reducedMotion())for(const button of document.querySelectorAll('[data-save]'))if(button.dataset.save===key)animateUI(button,[{opacity:.55},{opacity:1}],{duration:130,easing:'ease-out'});};
const taskWithoutCheckFeedback=setSpeedrunTask;
setSpeedrunTask=function(id,checked){taskWithoutCheckFeedback(id,checked);if(!reducedMotion()){const field=[...document.querySelectorAll('[data-speedrun-task]')].find(input=>input.dataset.speedrunTask===id);if(field)animateUI(field,[{opacity:.45},{opacity:1}],{duration:130,easing:'ease-out'});}};
// Missing or zero cells stay blank in aligned desktop tables and disappear on mobile cards.
function pruneMonsterTableValues(root){
 if(!root)return;
 for(const table of root.querySelectorAll('.db-table')){
  for(const row of table.querySelectorAll('tbody tr:not(.empty-row)')){
   const cells=[...row.querySelectorAll(':scope>td')];
   for(const cell of cells.slice(1))if(!cell.querySelector('button,a,details')&&!meaningfulValue(cell.textContent)){cell.textContent='';cell.classList.add('empty-monster-value');}
   if(cells.length>1&&cells.slice(1).every(cell=>cell.classList.contains('empty-monster-value')))row.remove();
  }
  const head=[...table.querySelectorAll('thead th')];
  head.forEach((header,index)=>{if(!index)return;const cells=[...table.querySelectorAll('tbody tr:not(.empty-row)')].map(row=>row.querySelectorAll(':scope>td')[index]).filter(Boolean);if(cells.length&&cells.every(cell=>cell.classList.contains('empty-monster-value'))){header.hidden=true;cells.forEach(cell=>cell.hidden=true);}});
 }
}
const monsterPanelWithPlaceholders=renderMonsterPanel;
renderMonsterPanel=function(){monsterPanelWithPlaceholders();pruneMonsterTableValues($('recordPanel'));};
const faunaProfileWithPlaceholders=openCatalogueRecord;
openCatalogueRecord=function(id){const result=faunaProfileWithPlaceholders(id),record=catalogueRecords.get(id);if(record?.collection==='smallMonsters'){
 const body=$('detailBody');pruneMonsterTableValues(body);
 for(const fold of body.querySelectorAll('[data-fold-key="catalogue-ailments"]'))for(const row of fold.querySelectorAll('tbody tr')){const cells=[...row.querySelectorAll('td')];if(cells.length>1&&cells.slice(1).every(cell=>cell.classList.contains('empty-monster-value')))row.remove();}
 }return result;};

// Organised preferences use the same embedded components and never fetch fonts or UI assets.
themePresets.push(
 {id:'obsidian',name:'Obsidian & Gold',note:'Black stone, rich gold',bg:'#0b0e12',accent:'#e3bf75',text:'#f5eddd'},
 {id:'sapphire',name:'Sapphire',note:'Deep blue, clear azure',bg:'#101c2d',accent:'#80b7f3',text:'#e8f1fd'},
 {id:'jade',name:'Jade',note:'Cool green, pale mint',bg:'#102321',accent:'#76d8b1',text:'#e7f7ee'},
 {id:'crimson',name:'Crimson',note:'Dark wine, warm rose',bg:'#211217',accent:'#ed8791',text:'#f9e5e7'},
 {id:'sunset',name:'Sunset',note:'Plum shadows, peach light',bg:'#271922',accent:'#f4b290',text:'#fff0e7'},
 {id:'rose',name:'Rose Quartz',note:'Soft rose, smoky violet',bg:'#241c26',accent:'#ebb8d5',text:'#f6e8f2'},
 {id:'parchment',name:'Parchment',note:'Light paper, dark bronze',bg:'#eee6d5',accent:'#6e502a',text:'#282e25'},
 {id:'snow',name:'Snowfield',note:'Light ice, deep blue',bg:'#e9f0f5',accent:'#265777',text:'#132b3a'}
);
const settingsCategories=[['appearance','Appearance'],['motion','Motion & effects'],['browsing','Browsing'],['music','Music'],['data','Backup & reset']];
const settingsGroup=(key,title,body,open=false)=>`<details class="settings-group preference-group" data-fold-key="settings-${E(key)}"><summary>${E(title)}</summary><div class="settings-group-body">${body}</div></details>`;
function preferenceSelect(key,label,options,value,hint=''){return `<label class="preference-field">${E(label)}<select data-guide-setting="${E(key)}" aria-label="${E(label)}">${options.map(([id,name])=>optionHTML(id,name,String(value))).join('')}</select>${hint?'<small>'+E(hint)+'</small>':''}</label>`;}
function preferenceCheck(key,label,checked,hint=''){return `<label class="preference-toggle"><span>${E(label)}${hint?'<small>'+E(hint)+'</small>':''}</span><input type="checkbox" data-guide-setting="${E(key)}" ${checked?'checked':''}></label>`;}
openSettings=function(tab='appearance'){settingsTab=settingsCategories.some(([id])=>id===tab)?tab:'appearance';renderSettings();openDialog('settingsDialog');};
renderSettings=function(){
 if(!settingsCategories.some(([id])=>id===settingsTab))settingsTab='appearance';
 $('settingsBody').innerHTML=`<div class="settings-heading"><div><p class="eyebrow">YOUR FIELD GUIDE</p><h2>Settings</h2></div><button class="icon-btn" data-close="settingsDialog" aria-label="Close settings">${icon('close')}</button></div><div class="settings-tabs" role="tablist" aria-label="Settings categories">${settingsCategories.map(([id,name])=>`<button role="tab" id="settings-tab-${id}" data-settings-tab="${id}" aria-controls="settingsPanel" aria-selected="${settingsTab===id}" tabindex="${settingsTab===id?'0':'-1'}">${name}</button>`).join('')}</div><div id="settingsPanel" class="settings-panel" role="tabpanel" aria-labelledby="settings-tab-${settingsTab}"></div>`;
 ({appearance:renderAppearanceSettings,motion:renderMotionSettings,browsing:renderBrowsingSettings,music:renderLibrarySettings,data:renderDataSettings})[settingsTab]();paintIcons($('settingsDialog'));
 $('settingsBody').querySelector('.settings-tabs').onkeydown=event=>{
  if(!['ArrowLeft','ArrowRight','Home','End'].includes(event.key))return;event.preventDefault();const index=settingsCategories.findIndex(([id])=>id===settingsTab),next=event.key==='Home'?0:event.key==='End'?settingsCategories.length-1:(index+(event.key==='ArrowLeft'?-1:1)+settingsCategories.length)%settingsCategories.length;
  settingsTab=settingsCategories[next][0];renderSettings();$('settings-tab-'+settingsTab).focus();
 };
};
function groupExistingNodes(panel,key,title,nodes,open=false){
 const group=document.createElement('details');group.className='settings-group preference-group';group.dataset.foldKey='settings-'+key;group.open=false;group.innerHTML='<summary>'+E(title)+'</summary><div class="settings-group-body"></div>';const body=group.lastElementChild;for(const node of nodes.filter(Boolean))body.append(node);panel.append(group);return group;
}
const appearanceBeforeOrganisation=renderAppearanceSettings;
renderAppearanceSettings=function(){
 appearanceBeforeOrganisation();const panel=$('settingsPanel');panel.querySelector('[data-fold-key="settings-animation"]')?.remove();
 const font=panel.querySelector('.font-setting'),description=panel.querySelector('.settings-description'),themes=panel.querySelector('.theme-grid'),custom=panel.querySelector('.custom-theme-box'),gradients=panel.querySelector('[data-fold-key="settings-gradients"]'),legend=panel.querySelector('.icon-legend');
 for(const node of [font,description,themes,custom,gradients,legend])node?.remove();
 groupExistingNodes(panel,'typography','Text & spacing',[font],true);
 panel.insertAdjacentHTML('beforeend',settingsGroup('display','Cards & icons',preferenceSelect('density','Card spacing',[['compact','Compact'],['comfortable','Comfortable']],guidePrefs.density)+`<label class="range-label" for="guideIconSize">Icon size<output id="guideIconSizeValue">${guidePrefs.iconSize}%</output></label><input id="guideIconSize" data-guide-setting="iconSize" type="range" min="75" max="140" step="5" value="${guidePrefs.iconSize}" aria-label="Icon size"><p class="setting-help">Text size stays independent of icon size.</p>`));
 groupExistingNodes(panel,'themes','Theme presets & custom colours',[description,themes,custom]);
 if(gradients){gradients.open=false;panel.append(gradients);}panel.insertAdjacentHTML('beforeend',visualProfilesHTML());if(legend)panel.append(legend);installColourWheels(panel);
};
function visualProfilesHTML(){return settingsGroup('visual-profiles','Saved visual presets',`<p class="setting-help">Save colours, text, spacing, effects and motion as one look.</p><div class="save-profile-form"><input id="visualProfileName" type="text" maxlength="50" placeholder="Preset name" aria-label="Visual preset name"><button class="secondary-btn" data-save-visual-profile>Save current</button></div><div class="visual-profile-list">${visualProfiles.map(profile=>`<div class="visual-profile-row"><button data-apply-visual-profile="${E(profile.id)}"><span class="profile-swatch" style="--profile-bg:${validHex(profile.preview?.bg)?profile.preview.bg:'#151f19'};--profile-accent:${validHex(profile.preview?.accent)?profile.preview.accent:'#d9b77a'}"></span><span>${E(profile.name)}</span></button><button class="icon-btn" data-remove-visual-profile="${E(profile.id)}" aria-label="Delete ${E(profile.name)} preset">${icon('trash')}</button></div>`).join('')||'<p class="quiet setting-help">No saved visual presets yet.</p>'}</div><div id="profileDeleteConfirmation"></div>`);}
function renderMotionSettings(){
 const panel=$('settingsPanel');panel.innerHTML=settingsGroup('animation-controls','Animation controls',`<label class="preference-toggle"><span>Animations</span><input id="animationsEnabled" type="checkbox" ${motionPrefs.speed>0?'checked':''}></label><label class="range-label" for="animationSpeed">Speed <output id="animationSpeedValue">${motionPrefs.speed===0?'Off':motionPrefs.speed+' / 100'}</output></label><input id="animationSpeed" type="range" min="0" max="100" value="${motionPrefs.speed}"><div class="range-captions"><span>0 · Off</span><span>50 · Normal</span><span>100 · Fast</span></div>`,true)+settingsGroup('transitions','Panel transitions',preferenceSelect('transition','Transition style',[['liquid','Liquid reveal'],['fade','Fade'],['slide','Soft slide'],['zoom','Soft zoom'],['none','None']],guidePrefs.transition)+`<div class="transition-demo"><div id="transitionPreview" class="transition-preview"><strong>Field record</strong><span>Panel transition preview</span></div><button class="secondary-btn" data-preview-transition>Preview open & close</button><span id="transitionPreviewStatus" class="setting-help" role="status"></span></div>`,true)+settingsGroup('touch-effects','Touch effects',preferenceSelect('effects.touch','Touch effect',[['ripple','Original gold ripple'],['halo','Halo ring'],['glow','Soft glow'],['sparks','Spark burst'],['none','None']],guidePrefs.effects.touch)+`<button class="touch-effect-preview" data-preview-touch>Touch to preview</button><p class="setting-help">The original ripple keeps its existing size and gold wash.</p>`,true)+settingsGroup('ambient-effects','Ambient effects',`<p id="ambientEffectStatus" class="setting-help" ${guidePrefs.performance==='light'?'':'hidden'}>Light mode temporarily pauses these effects.</p>`+preferenceCheck('effects.glow','Ambient glow',guidePrefs.effects.glow)+preferenceCheck('effects.particles','Particles',guidePrefs.effects.particles)+preferenceCheck('effects.blur','Backdrop blur',guidePrefs.effects.blur)+preferenceCheck('effects.imageMotion','Idle artwork motion',guidePrefs.effects.imageMotion))+settingsGroup('performance','Performance',preferenceSelect('performance','Performance mode',[['full','Full effects'],['light','Light mode']],guidePrefs.performance,'Light mode pauses ambient effects and removes backdrop blur. Panel transitions and your touch effect stay available.'));
}
function renderBrowsingSettings(){
 const grid=guidePrefs.grid,actual=bestiaryColumns();
 $('settingsPanel').innerHTML=settingsGroup('bestiary-grid','Bestiary card grid',`<div class="preference-columns">${preferenceSelect('grid.columns','Cards across',[['auto','Auto'],...[1,2,3,4,5,6].map(value=>[String(value),String(value)])],grid.columns)}${preferenceSelect('grid.rows','Rows per batch',[1,2,3,4,5,6,7,8].map(value=>[String(value),String(value)]),grid.rows)}</div><p id="gridPreviewCaption" class="setting-help">${bestiaryGridCaption()}</p><div id="bestiaryGridPreview" class="bestiary-grid-preview" style="--preview-columns:${actual}">${Array.from({length:Math.min(48,actual*grid.rows)},()=>'<span></span>').join('')}</div><p class="setting-help">“Show more” adds another batch of rows.</p>`,true)+settingsGroup('startup','When the guide opens',preferenceSelect('startup.mode','Start screen',[['last','Last visited'],['overview','Overview'],['section','Choose a section']],guidePrefs.startup.mode)+`<div id="startupSectionControls" ${guidePrefs.startup.mode==='section'?'':'hidden'}>${preferenceSelect('startup.view','Section',navs.map(([id,name])=>[id,name]),guidePrefs.startup.view)}</div>`+preferenceSelect('startup.edition','Starting game',[['last','Last used'],['world','World'],['iceborne','Iceborne']],guidePrefs.startup.edition,'Iceborne Speedrun still unlocks only after World is complete.'))+settingsGroup('browsing-behaviour','Reading & navigation',preferenceCheck('folds.single','One expandable group at a time',guidePrefs.folds.single)+preferenceCheck('folds.remember','Remember expanded groups',guidePrefs.folds.remember)+preferenceCheck('rememberPosition','Remember section scroll position',guidePrefs.rememberPosition))+settingsGroup('default-sorting','Default sorting',preferenceSelect('sorts.resources','Resources',[['name','A–Z'],['rarity','Rarity: low to high'],['rarity-desc','Rarity: high to low']],guidePrefs.sorts.resources)+preferenceSelect('sorts.weapons','Weapons',[['source','Original order'],['name','A–Z'],['rarity','Rarity: high to low'],['attack','Attack: high to low']],guidePrefs.sorts.weapons)+preferenceSelect('sorts.equipment','Equipment',[['source','Original order'],['name','A–Z'],['rarity','Rarity: high to low'],['defence','Defence: high to low']],guidePrefs.sorts.equipment)+preferenceSelect('sorts.monsters','Large monsters',[['source','Original order'],['name','A–Z'],['class','Classification']],guidePrefs.sorts.monsters));
}
function setGuidePreference(key,value){
 const allowed=['density','iconSize','performance','transition','rememberPosition','effects.touch','effects.glow','effects.particles','effects.blur','effects.imageMotion','grid.columns','grid.rows','startup.mode','startup.view','startup.edition','folds.single','folds.remember','sorts.resources','sorts.weapons','sorts.equipment','sorts.monsters'];if(!allowed.includes(key))return;
 const next=preferenceClone(guidePrefs),parts=key.split('.');if(parts.length===2)next[parts[0]][parts[1]]=value;else next[key]=value;Object.assign(guidePrefs,normaliseGuideSettings(next));
 if(key==='sorts.resources'){resourceState.sort=guidePrefs.sorts.resources;rememberFilters('resources',resourceState);}
 applyGuidePreferences();persist();if($('ambientEffectStatus')){$('ambientEffectStatus').hidden=guidePrefs.performance!=='light';}if($('guideIconSizeValue'))$('guideIconSizeValue').textContent=guidePrefs.iconSize+'%';
 if(key==='folds.single'&&guidePrefs.folds.single){const current=document.querySelector('[data-guide-setting="folds.single"]')?.closest('details');for(const peer of current?.parentElement?.querySelectorAll(':scope>details')||[])if(peer!==current&&(peer.dataset.expanded!==undefined?peer.dataset.expanded==='true':peer.open)){disclosureBeforeSettings(peer);if(guidePrefs.folds.remember)guidePrefs.foldStates[foldPreferenceKey(peer)]=false;}persist();}
 if(key.startsWith('grid.')){S.monsterLimit=bestiaryBatchSize();if(S.view==='bestiary')renderBestiary();updateGridPreview();}
 if(key.startsWith('sorts.'))refreshPreferenceContent();
 if(key==='startup.mode'&&$('startupSectionControls'))$('startupSectionControls').hidden=guidePrefs.startup.mode!=='section';
}
function bestiaryGridCaption(){const columns=bestiaryColumns();return `${columns} across × ${guidePrefs.grid.rows} rows · up to ${columns*guidePrefs.grid.rows} cards per batch. ${guidePrefs.grid.columns==='auto'?'Auto adapts to the screen.':'Manual columns stay fixed. Dense grids use compact picture-and-name cards.'}`;}
function updateGridPreview(){const host=$('bestiaryGridPreview'),columns=bestiaryColumns();if(!host)return;host.style.setProperty('--preview-columns',String(columns));host.innerHTML=Array.from({length:Math.min(48,columns*guidePrefs.grid.rows)},()=>'<span></span>').join('');$('gridPreviewCaption').textContent=bestiaryGridCaption();}
document.addEventListener('change',event=>{const field=event.target;if(field.dataset.guideSetting)setGuidePreference(field.dataset.guideSetting,field.type==='checkbox'?field.checked:field.value);});
document.addEventListener('input',event=>{if(event.target.id==='guideIconSize')setGuidePreference('iconSize',event.target.value);});
const applicationAppearance=applyAppearance;
applyAppearance=function(...args){const result=applicationAppearance(...args);applyGuidePreferences();return result;};
function applyStartupPreferences(){
 if(guidePrefs.startup.edition!=='last')S.edition=guidePrefs.startup.edition;
 if(guidePrefs.startup.mode==='overview')S.view='overview';else if(guidePrefs.startup.mode==='section')S.view=guidePrefs.startup.view;
 if(S.view==='progression'&&S.edition==='iceborne'&&!worldRouteFinished())S.edition='world';S.monsterLimit=bestiaryBatchSize();
 if(!filterMemory.resources?.sort)resourceState.sort=guidePrefs.sorts.resources;
}
const monsterListBeforeSorting=filterMonsterList;
filterMonsterList=function(){const rows=monsterListBeforeSorting();if(guidePrefs.sorts.monsters==='name')rows.sort((a,b)=>a.name.localeCompare(b.name));else if(guidePrefs.sorts.monsters==='class')rows.sort((a,b)=>a.class.localeCompare(b.class)||a.name.localeCompare(b.name));return rows;};
const filteredWeaponsBeforeSorting=filteredWeapons;
filteredWeapons=function(){const rows=filteredWeaponsBeforeSorting(),sort=guidePrefs.sorts.weapons;if(sort!=='source')rows.sort((a,b)=>sort==='name'?a.name.localeCompare(b.name):Number(b[sort]||0)-Number(a[sort]||0)||a.name.localeCompare(b.name));return rows;};
function compareEquipmentRecords(a,b){const sort=guidePrefs.sorts.equipment;if(sort==='source')return 0;if(sort==='name')return a.name.localeCompare(b.name);const stat=record=>sort==='rarity'?Number(record.rarity)||0:Number(record.defenseBase??record.defence??record.defense??record.stats?.defence??record.stats?.defense)||0;return stat(b)-stat(a)||a.name.localeCompare(b.name);}
const gridBeforePreferences=renderMonsterGrid;
renderMonsterGrid=function(){gridBeforePreferences();applyGuidePreferences();};
function applyPersistentFilterModels(){
 Object.assign(resourceState,{category:'all',rank:'all',rarity:'all',sort:guidePrefs.sorts.resources},recalledFilters('resources'));
 Object.assign(collectionState,{rank:'all',rarity:'all',category:'all',slot:'all',compatible:null},recalledFilters('equipment:'+collectionState.group));
 Object.assign(recipeState,{category:'all',game:'all',rank:'all'},recalledFilters('recipe:'+recipeState.method));
 Object.assign(bestiaryLibraryState,{category:'all',rank:'all'},recalledFilters('fauna:'+bestiaryLibraryState.tab));
 const monsterFilters=recalledFilters('bestiary:'+S.edition);S.noteCat=recalledFilters('notes').category||'all';S.monsterType=monsterFilters.type||'all';S.monsterKind=monsterFilters.kind||'all';S.monsterScope=monsterFilters.scope||'new';
 if(weaponState)Object.assign(weaponState,{rank:'all',rarity:'all',element:'all',obtain:'all'},recalledFilters('weapon:'+weaponState.type));
 if(monsterState)Object.assign(monsterState,{rank:'all',rewardMethod:'all'},recalledFilters('monster:'+monsterState.id));
}
function refreshPreferenceContent(){
 applyPersistentFilterModels();if(S.view==='progression'&&S.edition==='iceborne'&&!worldRouteFinished())applyNavigation('world','progression',false);S.monsterLimit=bestiaryBatchSize();if(S.view!=='overview')renderAll();
 if($('detailDialog').open){if($('detailDialog').classList.contains('weapon-record-dialog')&&weaponState)renderWeaponPanel();else if($('detailDialog').classList.contains('monster-record-dialog')&&monsterState)renderMonsterPanel();}
 if($('savedDialog').open)renderSaved($('savedPickerSearch')?.value||'');applyGuidePreferences();
}
// Only logical section scrolling is remembered; animation timers never control this persistence.
let positionSaveTimer=0;
function rememberSectionPosition(){if(!guidePrefs.rememberPosition||restoringScreen)return;guidePrefs.positions[S.edition+'/'+S.view]=Math.max(0,$('stageBoundary').scrollTop||window.scrollY||0);clearTimeout(positionSaveTimer);positionSaveTimer=setTimeout(persist,250);}
document.addEventListener('scroll',event=>{if(event.target===$('stageBoundary')||event.target===document)rememberSectionPosition();},true);
const navigationBeforeSettings=applyNavigation;
applyNavigation=function(mode=S.edition,view=S.view,scroll=true){if(!restoringLiveScreen)rememberSectionPosition();const result=navigationBeforeSettings(mode,view,scroll);if(scroll&&guidePrefs.rememberPosition){const top=guidePrefs.positions[S.edition+'/'+S.view]||0;$('stageBoundary').scrollTop=top;}applyGuidePreferences();return result;};
function foldPreferenceKey(fold){const dialog=fold.closest('dialog'),title=dialog?.querySelector('#detailBody h2,#itemBody h2')?.textContent||'',parts=[];for(let node=fold;node?.tagName==='DETAILS';node=node.parentElement?.closest('details'))parts.unshift(node.dataset.foldKey||node.querySelector('summary')?.textContent||'');return ((dialog?.id||S.edition+'/'+S.view)+':'+title+':'+parts.join('|')).slice(0,500);}
const disclosureBeforeSettings=toggleDisclosure;
toggleDisclosure=function(fold){
 const opening=fold.dataset.expanded!==undefined?fold.dataset.expanded!=='true':!fold.open;
 if(opening&&guidePrefs.folds.single){const scope=fold.classList.contains('speedrun-card')?fold.closest('.speedrun-timeline'):fold.parentElement;for(const peer of scope?.querySelectorAll(fold.classList.contains('speedrun-card')?'.speedrun-card':':scope>details')||[])if(peer!==fold&&(peer.dataset.expanded!==undefined?peer.dataset.expanded==='true':peer.open)){disclosureBeforeSettings(peer);if(guidePrefs.folds.remember)guidePrefs.foldStates[foldPreferenceKey(peer)]=false;}}
 disclosureBeforeSettings(fold);if(guidePrefs.folds.remember&&!fold.closest('#settingsDialog')){guidePrefs.foldStates[foldPreferenceKey(fold)]=opening;const keys=Object.keys(guidePrefs.foldStates);if(keys.length>1000)delete guidePrefs.foldStates[keys[0]];persist();}
};
const paintBeforeSettings=paintIcons;
paintIcons=function(root=document){
 paintBeforeSettings(root);const fresh=[...root.querySelectorAll('details')].filter(fold=>!fold.dataset.preferenceApplied);
 for(const fold of fresh){fold.dataset.preferenceApplied='true';if(fold.closest('#settingsDialog')){fold.open=false;fold.dataset.expanded='false';fold.querySelector('summary')?.setAttribute('aria-expanded','false');continue;}if(guidePrefs.folds.remember){const open=guidePrefs.foldStates[foldPreferenceKey(fold)];if(typeof open==='boolean'){if(open)loadItemFold(fold);fold.open=open;fold.dataset.expanded=String(open);fold.querySelector('summary')?.setAttribute('aria-expanded',String(open));}}}
 if(guidePrefs.folds.single)for(const parent of new Set(fresh.map(fold=>fold.parentElement))){let first=true;for(const fold of [...parent.children].filter(node=>node.tagName==='DETAILS'))if(fold.dataset.expanded!==undefined?fold.dataset.expanded==='true':fold.open){if(first)first=false;else{fold.open=false;fold.dataset.expanded='false';fold.querySelector('summary')?.setAttribute('aria-expanded','false');}}}
};
// Preserve the original ripple; alternative touch effects use their own small overlay.
const originalGoldFeedback=pressFeedback;
pressFeedback=function(button,event){
 if(!button||button.disabled||reducedMotion())return;if(guidePrefs.effects.touch==='ripple')return originalGoldFeedback(button,event);if(guidePrefs.effects.touch==='none')return;
 releasePress();pressTarget=button;button.classList.add('is-pressed');const overlay=document.createElement('span');overlay.className='alternate-touch touch-'+guidePrefs.effects.touch;overlay.setAttribute('aria-hidden','true');
 if(guidePrefs.effects.touch==='sparks')overlay.innerHTML=Array.from({length:8},(_,i)=>`<i style="--spark-x:${Math.cos(i*Math.PI/4)*36}px;--spark-y:${Math.sin(i*Math.PI/4)*36}px"></i>`).join('');
 button.append(overlay);motionLater(()=>overlay.remove(),650);
};
let transitionPreviewAnimation=null,transitionPreviewVersion=0;
function previewTransition(){
 const panel=$('transitionPreview'),version=++transitionPreviewVersion;transitionPreviewAnimation?.cancel();if(!panel)return;
 if(transitionsDisabled()||typeof panel.animate!=='function'){$('transitionPreviewStatus').textContent=reducedMotion()?'Animations are off.':'No panel transition.';return;}
 $('transitionPreviewStatus').textContent='';const out=animateUI(panel,transitionFrames(false,'panel'),{duration:190,fill:'both',easing:'ease-out'});transitionPreviewAnimation=out;
 out.finished.then(()=>{if(version!==transitionPreviewVersion)return;out.cancel();transitionPreviewAnimation=animateUI(panel,transitionFrames(true,'panel'),{duration:240,easing:'ease-out'});},()=>{});
}
const arrivalBeforeTransitionPreference=animateContentArrival;
animateContentArrival=function(node){if(!node||transitionsDisabled())return;animateUI(node,transitionFrames(true,'content'),{duration:170,easing:'ease-out'});};
document.addEventListener('click',event=>{if(event.target.closest?.('[data-preview-transition]'))previewTransition();});
// Hue and saturation come from a wheel. Brightness and HEX use precise numeric/text controls.
let colourWheel=null,colourSaveTimer=0;
function hsvToHex(h,s,v){const c=v*s,x=c*(1-Math.abs((h/60)%2-1)),m=v-c,sector=Math.floor(((h%360)+360)%360/60),channels=[[c,x,0],[x,c,0],[0,c,x],[0,x,c],[x,0,c],[c,0,x]][sector];return rgbHex(channels.map(channel=>(channel+m)*255));}
function hexToHSV(hex){const [r,g,b]=hexRGB(hex).map(channel=>channel/255),max=Math.max(r,g,b),min=Math.min(r,g,b),delta=max-min;let h=0;if(delta){h=max===r?60*((g-b)/delta%6):max===g?60*((b-r)/delta+2):60*((r-g)/delta+4);}return {h:(h+360)%360,s:max?delta/max:0,v:max};}
function paintColourButton(button,hex){button.value=hex;button.style.setProperty('--picked-colour',hex);button.innerHTML='<i aria-hidden="true"></i><span>'+E(hex.toUpperCase())+'</span>';}
function installColourWheels(root){
 for(const field of root.querySelectorAll('input[type="color"]')){const button=document.createElement('button');button.type='button';button.className='colour-wheel-button';for(const attribute of [...field.attributes])if(!['type','value','class'].includes(attribute.name))button.setAttribute(attribute.name,attribute.value);button.dataset.openColourWheel='';button.setAttribute('aria-expanded','false');paintColourButton(button,field.value);field.replaceWith(button);}
}
function closeColourWheel(immediate=false){
 if(!colourWheel)return;const {editor,target}=colourWheel;colourWheel=null;clearTimeout(colourSaveTimer);persist();target?.setAttribute('aria-expanded','false');editor.querySelectorAll('[id]').forEach(node=>node.removeAttribute('id'));
 if(immediate||!editor.isConnected)editor.remove();else animateReveal(editor,false,()=>editor.remove());
}
function openColourWheel(target){
 if(colourWheel?.target===target){closeColourWheel();return;}closeColourWheel();
 const editor=document.createElement('div');editor.className='colour-wheel-editor';const hsv=hexToHSV(validHex(target.value)?target.value:'#ffffff');
 editor.innerHTML=`<div class="colour-wheel-top"><strong>${E(target.getAttribute('aria-label')||target.closest('label')?.firstChild?.textContent||'Choose colour')}</strong><button class="icon-btn" data-close-colour-wheel aria-label="Close colour wheel">${icon('close')}</button></div><div class="colour-wheel-layout"><div class="colour-wheel" tabindex="0" role="slider" aria-label="Colour hue and saturation" aria-valuemin="0" aria-valuemax="359" aria-valuenow="${Math.round(hsv.h)}"><i class="colour-wheel-marker" aria-hidden="true"></i></div><div class="colour-wheel-values"><div id="wheelSelectedColour" class="wheel-selected-colour" aria-hidden="true"></div><label>Brightness %<input id="wheelBrightness" type="number" min="0" max="100" step="1" value="${Math.round(hsv.v*100)}" inputmode="numeric"></label><label>HEX<input id="wheelHex" type="text" value="${E(target.value.toUpperCase())}" maxlength="7" spellcheck="false" autocapitalize="characters"></label><small id="wheelColourStatus" class="setting-help" role="status">Changes preview immediately.</small></div></div><p class="setting-help">Touch the wheel. Arrow keys adjust hue and saturation; Page Up/Down adjusts brightness.</p>`;
 target.closest('.colour-inputs').insertAdjacentElement('afterend',editor);colourWheel={target,editor,...hsv,dragging:false,pointer:null};target.setAttribute('aria-expanded','true');paintWheelSelection();animateReveal(editor,true);
}
function paintWheelSelection(){
 const state=colourWheel;if(!state)return;const wheel=state.editor.querySelector('.colour-wheel'),marker=wheel.querySelector('.colour-wheel-marker'),angle=state.h*Math.PI/180;
 marker.style.left=(50+Math.sin(angle)*state.s*50)+'%';marker.style.top=(50-Math.cos(angle)*state.s*50)+'%';
 const hex=hsvToHex(state.h,state.s,state.v);state.editor.querySelector('#wheelSelectedColour').style.background=hex;wheel.setAttribute('aria-valuenow',String(Math.round(state.h)));wheel.setAttribute('aria-valuetext',`${Math.round(state.h)} degrees hue, ${Math.round(state.s*100)} percent saturation`);
 const hexField=state.editor.querySelector('#wheelHex');if(document.activeElement!==hexField)hexField.value=hex.toUpperCase();state.editor.querySelector('#wheelBrightness').value=String(Math.round(state.v*100));
}
function commitWheelColour(immediate=false){
 const state=colourWheel;if(!state||!state.target.isConnected)return;const hex=hsvToHex(state.h,state.s,state.v);paintColourButton(state.target,hex);
 if(state.target.dataset.customColour){appearancePrefs.custom[state.target.dataset.customColour]=hex;appearancePrefs.theme='custom';applyAppearance();paintThemeChoices();}
 else if(state.target.id==='gradientColourA'||state.target.id==='gradientColourB'){gradientPrefs[state.target.id.endsWith('A')?'a':'b']=hex;applyGradientPreferences();}
 paintWheelSelection();clearTimeout(colourSaveTimer);if(immediate)persist();else colourSaveTimer=setTimeout(persist,180);
}
function wheelPointer(event){
 const state=colourWheel;if(!state||!Number.isFinite(event.clientX)||!Number.isFinite(event.clientY))return;const wheel=state.editor.querySelector('.colour-wheel'),rect=wheel.getBoundingClientRect(),size=rect.width||240,cx=rect.left+size/2,cy=rect.top+size/2,dx=event.clientX-cx,dy=event.clientY-cy;
 state.h=(Math.atan2(dy,dx)*180/Math.PI+90+360)%360;state.s=Math.min(1,Math.hypot(dx,dy)/(size/2));commitWheelColour();
}
document.addEventListener('pointerdown',event=>{const wheel=event.target.closest?.('.colour-wheel');if(!wheel||!colourWheel)return;event.preventDefault();colourWheel.dragging=true;colourWheel.pointer=event.pointerId;wheel.setPointerCapture?.(event.pointerId);wheelPointer(event);});
document.addEventListener('pointermove',event=>{if(colourWheel?.dragging&&colourWheel.pointer===event.pointerId){event.preventDefault();wheelPointer(event);}});
for(const type of ['pointerup','pointercancel'])document.addEventListener(type,event=>{if(colourWheel&&colourWheel.pointer===event.pointerId){colourWheel.dragging=false;commitWheelColour(true);}});
document.addEventListener('keydown',event=>{
 if(!colourWheel||!event.target.closest?.('.colour-wheel-editor'))return;if(event.key==='Escape'){event.preventDefault();event.stopPropagation();closeColourWheel();return;}
 if(!event.target.matches('.colour-wheel'))return;const amount=event.shiftKey?10:2;
 if(event.key==='ArrowLeft')colourWheel.h=(colourWheel.h-amount+360)%360;else if(event.key==='ArrowRight')colourWheel.h=(colourWheel.h+amount)%360;else if(event.key==='ArrowUp')colourWheel.s=Math.min(1,colourWheel.s+.02);else if(event.key==='ArrowDown')colourWheel.s=Math.max(0,colourWheel.s-.02);else if(event.key==='PageUp')colourWheel.v=Math.min(1,colourWheel.v+.05);else if(event.key==='PageDown')colourWheel.v=Math.max(0,colourWheel.v-.05);else return;event.preventDefault();commitWheelColour(true);
});
document.addEventListener('input',event=>{
 if(!colourWheel)return;if(event.target.id==='wheelBrightness'){colourWheel.v=bounded(event.target.value,0,100,100)/100;commitWheelColour();}
 if(event.target.id==='wheelHex'){const hex=event.target.value.startsWith('#')?event.target.value:'#'+event.target.value;if(validHex(hex)){Object.assign(colourWheel,hexToHSV(hex));commitWheelColour();colourWheel.editor.querySelector('#wheelColourStatus').textContent='Colour applied.';}else colourWheel.editor.querySelector('#wheelColourStatus').textContent='Enter six HEX digits.';}
});
document.addEventListener('click',event=>{const button=event.target.closest?.('button');if(!button)return;if(button.hasAttribute('data-open-colour-wheel'))openColourWheel(button);if(button.hasAttribute('data-close-colour-wheel'))closeColourWheel();});
const settingsWithoutWheelCleanup=renderSettings;
renderSettings=function(...args){closeColourWheel(true);return settingsWithoutWheelCleanup(...args);};

function normaliseAppearanceSettings(value={}){value=value&&typeof value==='object'&&!Array.isArray(value)?value:{};const base={theme:enumValue(value.theme,[...themePresets.map(theme=>theme.id),'custom'],'game'),fontPt:bounded(value.fontPt,5,15,11),lineHeight:bounded(value.lineHeight,1.2,2,1.6),letterSpacing:bounded(value.letterSpacing,0,.1,0),wordSpacing:bounded(value.wordSpacing,0,.25,0),custom:{bg:'#0d1512',accent:'#d9b77a',text:'#eee9dc'}};for(const key of ['bg','accent','text'])if(validHex(value.custom?.[key]))base.custom[key]=value.custom[key];return base;}
function normaliseMotionSettings(value={}){value=value&&typeof value==='object'&&!Array.isArray(value)?value:{};return {speed:bounded(value.speed,0,100,50),lastSpeed:bounded(value.lastSpeed,1,100,50)};}
function normaliseGradientSettings(value={}){value=value&&typeof value==='object'&&!Array.isArray(value)?value:{};return {enabled:value.enabled!==false,preset:enumValue(value.preset,['game','world','iceborne','custom'],'game'),strength:bounded(value.strength,0,40,15),direction:bounded(value.direction,0,360,135),a:validHex(value.a)?value.a:'#21412c',b:validHex(value.b)?value.b:'#d9b77a'};}
function captureVisualProfile(){return {appearance:preferenceClone(appearancePrefs),motion:preferenceClone(motionPrefs),gradients:preferenceClone(gradientPrefs),visual:{density:guidePrefs.density,iconSize:guidePrefs.iconSize,performance:guidePrefs.performance,transition:guidePrefs.transition,effects:preferenceClone(guidePrefs.effects)}};}
function saveVisualProfile(){
 const name=($('visualProfileName')?.value.trim()||'Look '+(visualProfiles.length+1)).slice(0,50);if(visualProfiles.length>=12){toast('You can save up to 12 visual presets.');return;}if(visualProfiles.some(profile=>profile.name.toLowerCase()===name.toLowerCase())){toast('Choose a different preset name.');return;}
 const profile={id:'look-'+Date.now().toString(36)+'-'+Math.random().toString(36).slice(2,7),name,...captureVisualProfile()},palette=profile.appearance.theme==='custom'?profile.appearance.custom:themePresets.find(theme=>theme.id===profile.appearance.theme);profile.preview={bg:palette?.bg||'#151f19',accent:palette?.accent||'#d9b77a'};visualProfiles.push(profile);persist();renderAppearanceSettings();paintIcons($('settingsDialog'));toast('Visual preset saved.');
}
function applyVisualProfile(id){const profile=visualProfiles.find(entry=>entry.id===id);if(!profile)return;Object.assign(appearancePrefs,normaliseAppearanceSettings(profile.appearance));Object.assign(motionPrefs,normaliseMotionSettings(profile.motion));Object.assign(gradientPrefs,normaliseGradientSettings(profile.gradients));Object.assign(guidePrefs,normaliseGuideSettings({...guidePrefs,...profile.visual}));applyAppearance();applyMotionPreferences();persist();renderAppearanceSettings();paintIcons($('settingsDialog'));toast('Visual preset applied.');}
function confirmProfileDelete(id){const profile=visualProfiles.find(entry=>entry.id===id),host=$('profileDeleteConfirmation');if(!profile||!host)return;host.innerHTML=`<div class="confirmation-card"><p>Delete “${E(profile.name)}”?</p><label class="confirmation-tick"><input type="checkbox" id="confirmProfileDelete">I want to delete this saved preset.</label><div class="inline-actions"><button class="secondary-btn danger-button" data-confirm-profile-delete="${E(id)}" disabled>Delete preset</button><button class="text-btn" data-cancel-profile-delete>Cancel</button></div></div>`;}
document.addEventListener('change',event=>{if(event.target.id==='confirmProfileDelete')document.querySelector('[data-confirm-profile-delete]').disabled=!event.target.checked;});
document.addEventListener('click',event=>{
 const button=event.target.closest?.('button');if(!button)return;
 if(button.hasAttribute('data-save-visual-profile'))saveVisualProfile();
 if(button.dataset.applyVisualProfile)applyVisualProfile(button.dataset.applyVisualProfile);
 if(button.dataset.removeVisualProfile)confirmProfileDelete(button.dataset.removeVisualProfile);
 if(button.hasAttribute('data-cancel-profile-delete'))$('profileDeleteConfirmation').replaceChildren();
 if(button.dataset.confirmProfileDelete&&$('confirmProfileDelete')?.checked){const index=visualProfiles.findIndex(profile=>profile.id===button.dataset.confirmProfileDelete);if(index>=0)visualProfiles.splice(index,1);persist();renderAppearanceSettings();paintIcons($('settingsDialog'));}
});
// Portable, validated JSON backups. Imported audio stays in the existing on-device library.
const resetScopeLabels={appearance:'Appearance & colours',motion:'Motion & effects',browsing:'Browsing, layouts & sorting',music:'Audio preferences',filters:'Saved filters',bookmarks:'Bookmarks',world:'World Speedrun progress',iceborne:'Iceborne Speedrun progress',checks:'Preparation checklist',profiles:'Saved visual presets'};
let pendingRestore=null,pendingReset=null,backupReadEpoch=0;
function backupDocument(){return {format:'hunters-field-guide-backup',version:1,created:new Date().toISOString(),data:{settings:{appearance:preferenceClone(appearancePrefs),motion:preferenceClone(motionPrefs),gradients:preferenceClone(gradientPrefs),guide:preferenceClone(guidePrefs),music:preferenceClone(musicPrefs)},filters:preferenceClone(filterMemory),bookmarks:[...S.saved],speedrun:preferenceClone(speedrunPrefs),checks:preferenceClone(S.checks),visualProfiles:preferenceClone(visualProfiles)}};}
function exportGuideBackup(){
 rememberAudioPosition();const blob=new Blob([JSON.stringify(backupDocument(),null,2)],{type:'application/json'}),url=URL.createObjectURL(blob),link=document.createElement('a');link.href=url;link.download='Hunters_Field_Guide_Backup_'+new Date().toISOString().slice(0,10)+'.json';document.body.append(link);link.click();link.remove();setTimeout(()=>URL.revokeObjectURL(url),1000);toast('Backup ready. Music files are kept separately.');
}
function normaliseProfiles(list){
 if(!Array.isArray(list))return[];const seen=new Set(),profiles=[];
 for(const raw of list.slice(0,12)){if(!raw||typeof raw.name!=='string'||!raw.name.trim()||!/^[a-z0-9-]{1,80}$/i.test(raw.id||'')||seen.has(raw.id))continue;seen.add(raw.id);const visual=normaliseGuideSettings(raw.visual),appearance=normaliseAppearanceSettings(raw.appearance),palette=appearance.theme==='custom'?appearance.custom:themePresets.find(theme=>theme.id===appearance.theme);profiles.push({id:raw.id,name:raw.name.trim().slice(0,50),appearance,motion:normaliseMotionSettings(raw.motion),gradients:normaliseGradientSettings(raw.gradients),visual:{density:visual.density,iconSize:visual.iconSize,performance:visual.performance,transition:visual.transition,effects:visual.effects},preview:{bg:palette?.bg||'#151f19',accent:palette?.accent||'#d9b77a'}});}
 return profiles;
}
function normaliseBackupFilters(value){
 const filters={};if(!value||typeof value!=='object'||Array.isArray(value))return filters;
 const validKey=key=>['resources','notes'].includes(key)||['world','iceborne'].some(game=>key==='bestiary:'+game)||D.weapons.some(weapon=>key==='weapon:'+weapon.id)||['craft','meld'].some(method=>key==='recipe:'+method)||['large','small','endemic'].some(tab=>key==='fauna:'+tab)||catalogueGroups.some(([group])=>key==='equipment:'+group)||D.monsters.some(monster=>key==='monster:'+monster.id);
 for(const [key,model] of Object.entries(value)){if(!validKey(key)||!model||typeof model!=='object'||Array.isArray(model))continue;const fields={};for(const name of filterKeys){const item=model[name];if(item===null||typeof item==='boolean'||typeof item==='number'&&Number.isFinite(item)||typeof item==='string'&&item.length<=100)fields[name]=item;}filters[key]=fields;}
 return filters;
}
function normaliseRouteProgress(value={}){return Object.fromEntries(['world','iceborne'].map(game=>{const tasks={},expanded={},knownTasks=new Set(speedrunStages(game).flatMap(stage=>stage.tasks.map(task=>task.id))),knownStages=new Set(speedrunStages(game).map(stage=>stage.id));for(const [key,checked] of Object.entries(value[game]?.tasks||{}))if(knownTasks.has(key)&&typeof checked==='boolean')tasks[key]=checked;for(const [key,open] of Object.entries(value[game]?.expanded||{}))if(knownStages.has(key)&&typeof open==='boolean')expanded[key]=open;return [game,{tasks,expanded}];}));}
function normaliseMusicSettings(value={}){value=value&&typeof value==='object'&&!Array.isArray(value)?value:{};
 const ids=new Set([...builtInTracks.keys(),...importedTracks.keys()]),positions={};for(const [id,position] of Object.entries(value.positions||{}))if(ids.has(id)&&Number.isFinite(position)&&position>=0)positions[id]=position;
 return {paused:value.paused===true,volume:bounded(value.volume,0,1,.25),loop:value.mode==='one',mode:enumValue(value.mode,['one','library','shuffle'],'library'),shuffleQueue:[],shufflePlayed:[],trackId:ids.has(value.trackId)?value.trackId:'world',positions,order:Array.isArray(value.order)?[...new Set(value.order.filter(id=>ids.has(id)))]:[],hiddenBuiltIns:Array.isArray(value.hiddenBuiltIns)?value.hiddenBuiltIns.filter(id=>builtInTracks.has(id)):[]};
}
function validateBackup(raw){
 if(!raw||raw.format!=='hunters-field-guide-backup'||raw.version!==1||!raw.data||typeof raw.data!=='object'||Array.isArray(raw.data))throw new Error('This file is not a supported Field Guide backup.');
 const source=raw.data,data={};
 if(source.settings&&typeof source.settings==='object')data.settings={appearance:normaliseAppearanceSettings(source.settings.appearance),motion:normaliseMotionSettings(source.settings.motion),gradients:normaliseGradientSettings(source.settings.gradients),guide:normaliseGuideSettings(source.settings.guide),music:normaliseMusicSettings(source.settings.music)};
 if(source.filters&&typeof source.filters==='object')data.filters=normaliseBackupFilters(source.filters);
 if(Array.isArray(source.bookmarks))data.bookmarks=[...new Set(source.bookmarks.filter(key=>typeof key==='string'&&key.length<=300&&getEntry(key)))];
 if(source.speedrun&&typeof source.speedrun==='object')data.speedrun=normaliseRouteProgress(source.speedrun);
 if(source.checks&&typeof source.checks==='object'){data.checks={};for(const game of ['world','iceborne']){data.checks[game]={};D.checklist.forEach((_,index)=>{const key='camp:'+index;if(typeof source.checks[game]?.[key]==='boolean')data.checks[game][key]=source.checks[game][key];});}}
 if(Array.isArray(source.visualProfiles))data.visualProfiles=normaliseProfiles(source.visualProfiles);
 if(!Object.keys(data).length)throw new Error('This backup has no restorable guide data.');return data;
}
const restoreLabels={settings:'Appearance, effects, browsing & audio settings',filters:'Saved filters',bookmarks:'Bookmarks',speedrun:'World & Iceborne Speedrun progress',checks:'Preparation checklist',visualProfiles:'Saved visual presets'};
function pendingRestoreHTML(){return pendingRestore?`<div class="confirmation-card"><h3>Restore ${E(pendingRestore.name)}</h3><p class="setting-help">Selected sections replace their current values. Music files are not included.</p><div class="reset-scope-list">${Object.keys(pendingRestore.data).map(key=>`<label class="confirmation-tick"><input type="checkbox" data-restore-scope="${key}" checked>${E(restoreLabels[key])}</label>`).join('')}</div><label class="confirmation-tick acknowledgement"><input type="checkbox" id="restoreAcknowledgement">I want to replace the selected data with this backup.</label><div class="inline-actions"><button class="secondary-btn" data-confirm-restore disabled>Restore selected</button><button class="text-btn" data-cancel-restore>Cancel</button></div></div>`:'';}
function renderDataSettings(){
 $('settingsPanel').innerHTML=settingsGroup('backup','Backup & restore',`<p class="setting-help">Back up settings, bookmarks, filters and story progress in one JSON file. Music files stay on this device.</p><div class="inline-actions"><button class="secondary-btn" data-export-backup>Export backup</button><label class="secondary-btn file-label" for="guideBackupFile">Import backup</label><input id="guideBackupFile" type="file" accept="application/json,.json" hidden></div><p id="backupStatus" class="setting-help" role="status"></p><div id="restorePreview">${pendingRestoreHTML()}</div>`,true)+settingsGroup('selective-reset','Reset selected data',`<p class="setting-help">Choose exactly what to reset. Nothing changes until you confirm.</p><div class="reset-scope-list">${Object.entries(resetScopeLabels).map(([key,label])=>`<label class="confirmation-tick"><input type="checkbox" data-reset-scope="${key}">${E(label)}</label>`).join('')}</div><button class="secondary-btn danger-button" data-review-reset>Review selected reset</button><div id="resetConfirmation"></div>`,true);
}
async function stageBackupImport(file){
 const status=$('backupStatus');if(!file)return;const epoch=++backupReadEpoch;pendingRestore=null;
 try{if(file.size>5*1024*1024)throw new Error('Choose a backup smaller than 5 MB.');const raw=JSON.parse(await file.text());if(epoch!==backupReadEpoch)return;pendingRestore={name:String(file.name||'Field Guide backup').slice(0,180),data:validateBackup(raw)};if(status)status.textContent='Backup checked. Select what to restore below.';if($('restorePreview'))$('restorePreview').innerHTML=pendingRestoreHTML();}
 catch(error){if(epoch!==backupReadEpoch)return;if(status)status.textContent=error instanceof SyntaxError?'This file is not valid JSON.':error.message||'This backup could not be read.';$('restorePreview')?.replaceChildren();}
}
function replaceObjectContents(target,source){for(const key of Object.keys(target))delete target[key];for(const [key,value] of Object.entries(source))if(!['__proto__','constructor','prototype'].includes(key))target[key]=value;}
function syncRestoredPreferences(){applyAppearance();applyMotionPreferences();applyGuidePreferences();audio.volume=musicPrefs.volume;updatePlaybackMode();void syncAudio();syncSaved();refreshPreferenceContent();syncSpeedrunTabs();persist();}
function restoreSelectedBackup(){
 if(!pendingRestore||!$('restoreAcknowledgement')?.checked)return;const selected=[...document.querySelectorAll('[data-restore-scope]')].filter(field=>field.checked).map(field=>field.dataset.restoreScope);if(!selected.length)return;const data=pendingRestore.data;
 stopSpeedrunMotion();discardSpeedrunUndo();
 if(selected.includes('settings')&&data.settings){Object.assign(appearancePrefs,data.settings.appearance);Object.assign(motionPrefs,data.settings.motion);Object.assign(gradientPrefs,data.settings.gradients);Object.assign(guidePrefs,data.settings.guide);Object.assign(musicPrefs,data.settings.music);replaceObjectContents(audioPositions,musicPrefs.positions);}
 if(selected.includes('filters')&&data.filters){replaceObjectContents(filterMemory,data.filters);filterPreferenceGeneration++;}
 if(selected.includes('bookmarks')&&data.bookmarks)S.saved=[...data.bookmarks];
 if(selected.includes('speedrun')&&data.speedrun)for(const game of ['world','iceborne'])speedrunPrefs[game]=preferenceClone(data.speedrun[game]);
 if(selected.includes('checks')&&data.checks)S.checks=preferenceClone(data.checks);
 if(selected.includes('visualProfiles')&&data.visualProfiles)visualProfiles.splice(0,visualProfiles.length,...preferenceClone(data.visualProfiles));
 pendingRestore=null;filterPreferenceGeneration++;syncRestoredPreferences();renderDataSettings();paintIcons($('settingsDialog'));toast('Selected backup data restored.');
}
function showResetConfirmation(scopes){
 const selected=[...new Set(scopes)].filter(scope=>Object.hasOwn(resetScopeLabels,scope));if(!selected.length){toast('Tick at least one section to reset.');return;}
 if(settingsTab!=='data'){settingsTab='data';renderSettings();}pendingReset=selected;
 $('resetConfirmation').innerHTML=`<div class="confirmation-card"><h3>Confirm reset</h3><ul>${selected.map(scope=>'<li>'+E(resetScopeLabels[scope])+'</li>').join('')}</ul><label class="confirmation-tick acknowledgement"><input type="checkbox" id="resetAcknowledgement">I want to reset only the sections listed above.</label><div class="inline-actions"><button class="secondary-btn danger-button" data-confirm-reset disabled>Confirm reset</button><button class="text-btn" data-cancel-reset>Cancel</button></div></div>`;
 const fold=$('resetConfirmation').closest('details');if(fold&&(fold.dataset.expanded==='false'||!fold.open)){fold.dataset.expanded='false';toggleDisclosure(fold);}$('resetConfirmation').scrollIntoView?.({block:'nearest',behavior:reducedMotion()?'instant':'smooth'});
}
function resetSelectedPreferences(){
 if(!pendingReset||!$('resetAcknowledgement')?.checked)return;const scopes=pendingReset,defaults=normaliseGuideSettings();
 if(scopes.includes('appearance')){Object.assign(appearancePrefs,normaliseAppearanceSettings());Object.assign(gradientPrefs,normaliseGradientSettings());guidePrefs.density=defaults.density;guidePrefs.iconSize=defaults.iconSize;}
 if(scopes.includes('motion')){Object.assign(motionPrefs,normaliseMotionSettings());guidePrefs.effects=defaults.effects;guidePrefs.transition=defaults.transition;guidePrefs.performance=defaults.performance;}
 if(scopes.includes('browsing'))for(const key of ['grid','startup','folds','rememberPosition','sorts','positions','foldStates'])guidePrefs[key]=preferenceClone(defaults[key]);
 if(scopes.includes('music'))Object.assign(musicPrefs,{volume:.25,mode:'library',loop:false,shuffleQueue:[],shufflePlayed:[],order:[],hiddenBuiltIns:[]});
 if(scopes.includes('filters')){replaceObjectContents(filterMemory,{});filterPreferenceGeneration++;}
 if(scopes.includes('bookmarks'))S.saved=[];
 if(scopes.some(scope=>scope==='world'||scope==='iceborne')){stopSpeedrunMotion();discardSpeedrunUndo();for(const game of ['world','iceborne'])if(scopes.includes(game))speedrunPrefs[game]={tasks:{},expanded:{}};}
 if(scopes.includes('checks'))S.checks={};if(scopes.includes('profiles'))visualProfiles.splice(0);
 pendingReset=null;filterPreferenceGeneration++;syncRestoredPreferences();renderDataSettings();paintIcons($('settingsDialog'));toast('Selected settings and data reset.');
}
function updateDataConfirmations(){const restore=document.querySelector('[data-confirm-restore]'),reset=document.querySelector('[data-confirm-reset]');if(restore)restore.disabled=!$('restoreAcknowledgement')?.checked||![...document.querySelectorAll('[data-restore-scope]')].some(field=>field.checked);if(reset)reset.disabled=!$('resetAcknowledgement')?.checked;}
document.addEventListener('change',event=>{if(event.target.id==='guideBackupFile'){const file=event.target.files?.[0];event.target.value='';void stageBackupImport(file);}if(event.target.id==='restoreAcknowledgement'||event.target.id==='resetAcknowledgement'||event.target.dataset.restoreScope)updateDataConfirmations();if(event.target.dataset.resetScope){pendingReset=null;$('resetConfirmation')?.replaceChildren();}});
document.addEventListener('click',event=>{
 const button=event.target.closest?.('button');if(!button)return;
 if(button.hasAttribute('data-export-backup'))exportGuideBackup();
 if(button.hasAttribute('data-confirm-restore'))restoreSelectedBackup();
 if(button.hasAttribute('data-cancel-restore')){pendingRestore=null;$('restorePreview').replaceChildren();}
 if(button.hasAttribute('data-review-reset'))showResetConfirmation([...document.querySelectorAll('[data-reset-scope]')].filter(field=>field.checked).map(field=>field.dataset.resetScope));
 if(button.hasAttribute('data-reset-all-settings'))showResetConfirmation(['appearance','motion','browsing','music','filters']);
 if(button.hasAttribute('data-confirm-reset'))resetSelectedPreferences();
 if(button.hasAttribute('data-cancel-reset')){pendingReset=null;$('resetConfirmation').replaceChildren();}
});
const settingsBeforeResetFooter=renderSettings;
renderSettings=function(...args){const result=settingsBeforeResetFooter(...args);$('settingsBody').insertAdjacentHTML('beforeend','<footer class="settings-footer"><span>Bookmarks, story progress, music files and saved looks are kept.</span><button class="text-btn danger-button" data-reset-all-settings>Reset All Settings</button></footer>');return result;};

visualProfiles.splice(0,visualProfiles.length,...normaliseProfiles(visualProfiles));

window.addEventListener('resize',()=>{const previous=Number(document.documentElement.style.getPropertyValue('--bestiary-columns'))||1,next=bestiaryColumns();applyGuidePreferences();updateGridPreview();if(previous!==next&&S.view==='bestiary'&&bestiaryLibraryState.tab==='large'){S.monsterLimit=Math.max(1,Math.ceil(S.monsterLimit/(previous*guidePrefs.grid.rows)))*next*guidePrefs.grid.rows;renderMonsterGrid();}});

let activeDetail=null,activeItem=null,screenDepth=0,restoringScreen=false,restoringLiveScreen=false,screenCursor=0,screenInteractionEpoch=0;
const screenTrail=[],cloneState=value=>value==null?value:JSON.parse(JSON.stringify(value));
const rawCloseDialog=closeDialog;
function disclosurePath(fold){const parts=[];for(let node=fold;node?.tagName==='DETAILS';node=node.parentElement?.closest('details'))parts.unshift(node.dataset.foldKey||node.querySelector('summary')?.textContent||'');return parts.join('|');}
function currentFolds(){return [...document.querySelectorAll('.view:not([hidden]) details,dialog[open] details')].map(fold=>({scope:fold.closest('dialog')?.id||'view-'+S.view,path:disclosurePath(fold),open:fold.dataset.expanded!==undefined?fold.dataset.expanded==='true':fold.open}));}
function restoreFolds(folds=[]){for(const saved of folds){const scope=$(saved.scope);if(!scope)continue;const fold=[...scope.querySelectorAll('details')].find(candidate=>disclosurePath(candidate)===saved.path);if(!fold)continue;if(saved.open)loadItemFold(fold);fold.open=saved.open;fold.dataset.expanded=String(saved.open);fold.querySelector('summary')?.setAttribute('aria-expanded',String(saved.open));}}
function captureLiveScreen(){
 const roots=[$('view-'+S.view),...document.querySelectorAll('dialog[open]:not(#searchDialog)')],hosts=[];
 for(const root of roots)for(const host of [root,...root.querySelectorAll('[id]')]){
  if(['INPUT','SELECT','OPTION'].includes(host.tagName))continue;
  hosts.push({host,children:[...host.childNodes],attributes:[...host.attributes].map(attribute=>[attribute.name,attribute.value])});
 }
 return {hosts,dialogs:[...document.querySelectorAll('dialog[open]')].map(dialog=>dialog.id),detail:cloneState(activeDetail),item:activeItem,weaponModel:weaponState,monsterModel:monsterState,localeModel:localeState,itemLazy:itemLazyContent};
}
function currentScreen(){
 let modal=null;
 if($('itemDialog').open)modal={kind:'item',id:activeItem};
 else if($('searchDialog').open)modal={kind:'search',query:$('globalSearch').value,selected:S.searchIndex};
 else if($('savedDialog').open)modal={kind:'saved',tab:savedPanelMode,query:$('savedPickerSearch')?.value||'',edit:editingBookmarks};
 else if($('settingsDialog').open)modal={kind:'settings',tab:settingsTab};
 else if($('detailDialog').open)modal={...activeDetail,weapon:cloneState(weaponState),monster:cloneState(monsterState),locale:cloneState(localeState)};
 const scrolls={};document.querySelectorAll('.view:not([hidden]) [id],dialog[open],dialog[open] [id],dialog[open] .db-table-scroll').forEach((element,index)=>{if(element.scrollTop||element.scrollLeft)scrolls[element.id||'scroll-'+index]={top:element.scrollTop,left:element.scrollLeft};});
 const {saved,checks,...navigation}=S;
 return {contentStamp:contentPreferenceStamp(),main:cloneState(navigation),recipe:cloneState(recipeState),collections:cloneState(collectionState),resource:cloneState(resourceState),bestiary:cloneState(bestiaryLibraryState),maps:cloneState(mapLibraryState),weapon:cloneState(weaponState),monster:cloneState(monsterState),locale:cloneState(localeState),routeSignature:JSON.stringify(speedrunPrefs[S.edition]),modal,scrolls,folds:currentFolds(),live:captureLiveScreen(),windowScroll:window.scrollY||0,stageScroll:$('stageBoundary').scrollTop||0};
}
function rememberScreen(snapshot=null){
 screenTrail[screenCursor]=snapshot||currentScreen();screenTrail.splice(screenCursor+1);screenCursor++;screenTrail[screenCursor]=null;
 for(let index=0;index<screenCursor-12;index++)if(screenTrail[index])delete screenTrail[index].live;
 if(typeof history.pushState==='function')try{history.pushState({...(history.state||{}),fieldGuideScreen:screenCursor},'',location.hash||'#'+S.edition+'/'+S.view);}catch{}
}
function screenChange(action){finishScreenReturn();finishControlExits();const outer=screenDepth===0&&!restoringScreen;if(outer)rememberScreen();screenDepth++;try{return action();}finally{screenDepth--;}}
function restoreScroll(snapshot){
 $('stageBoundary').scrollTop=snapshot.stageScroll||0;
 document.querySelectorAll('.view:not([hidden]) [id],dialog[open],dialog[open] [id],dialog[open] .db-table-scroll').forEach((element,index)=>{const position=snapshot.scrolls[element.id||'scroll-'+index];if(position){element.scrollTop=position.top;element.scrollLeft=position.left;}});
 try{window.scrollTo({top:snapshot.windowScroll||0,behavior:'instant'});}catch{}
}
function restoreLive(snapshot){
 const live=snapshot.live,expected=new Set(live.dialogs);document.querySelectorAll('dialog[open]').forEach(dialog=>{if(!expected.has(dialog.id))rawCloseDialog(dialog.id);});
 for(const {host,children,attributes} of live.hosts){
  const current=[...host.childNodes];if(current.length!==children.length||current.some((node,index)=>node!==children[index]))host.replaceChildren(...children);
  for(const attribute of [...host.attributes])if(attribute.name!=='open'&&!attributes.some(([name])=>name===attribute.name))host.removeAttribute(attribute.name);
  for(const [name,value] of attributes)if(name!=='open'&&host.getAttribute(name)!==value)host.setAttribute(name,value);
 }
 if(snapshot.modal?.kind==='settings')settingsTab=snapshot.modal.tab;activeDetail=cloneState(live.detail);activeItem=live.item;itemLazyContent=live.itemLazy;weaponState=live.weaponModel;monsterState=live.monsterModel;localeState=live.localeModel;
 if(weaponState&&snapshot.weapon)Object.assign(weaponState,cloneState(snapshot.weapon));if(monsterState&&snapshot.monster)Object.assign(monsterState,cloneState(snapshot.monster));if(localeState&&snapshot.locale)Object.assign(localeState,cloneState(snapshot.locale));
 restoringLiveScreen=true;try{applyNavigation(snapshot.main.edition,snapshot.main.view,false);}finally{restoringLiveScreen=false;}
 for(const id of live.dialogs){if(id==='searchDialog')continue;const dialog=$(id);if(!dialog.open){dialog.classList.add('restored-dialog');if(dialog.showModal)dialog.showModal();else dialog.setAttribute('open','');}}
 if(snapshot.modal?.kind==='search'){openSearch(snapshot.modal.query);S.searchIndex=snapshot.modal.selected;paintSearchHits();}
 document.body.style.overflow=document.querySelector('dialog[open]')?'hidden':'';syncSaved();
}
function restoreScreen(snapshot){
 if(!snapshot)return;restoringScreen=true;
 try{
  stopSpeedrunMotion();navEpoch++;navTransition?.skipTransition?.();navTransition=null;
  for(const panel of [$('stageBoundary'),$('recordPanel')]){panelAnimations.get(panel)?.animation?.cancel();panelAnimations.delete(panel);}
  Object.assign(S,snapshot.main);Object.assign(recipeState,snapshot.recipe);Object.assign(collectionState,snapshot.collections||{});Object.assign(resourceState,snapshot.resource||{});Object.assign(bestiaryLibraryState,snapshot.bestiary||{});Object.assign(mapLibraryState,snapshot.maps||{});
  if(snapshot.live)restoreLive(snapshot);
  else{
   document.querySelectorAll('dialog[open]').forEach(dialog=>rawCloseDialog(dialog.id));applyNavigation(S.edition,S.view,false);const modal=snapshot.modal;
   if(modal?.kind==='monster'){openMonster(modal.id);Object.assign(monsterState,modal.monster);document.querySelectorAll('[data-monster-tab]').forEach(tab=>tab.setAttribute('aria-selected',String(tab.dataset.monsterTab===monsterState.tab)));renderMonsterPanel();}
   else if(modal?.kind==='weapon'){openWeapon(modal.id);Object.assign(weaponState,modal.weapon);document.querySelectorAll('[data-weapon-tab]').forEach(tab=>tab.setAttribute('aria-selected',String(tab.dataset.weaponTab===weaponState.tab)));renderWeaponPanel();}
   else if(modal?.kind==='locale'){openLocale(modal.id,modal.locale);Object.assign(localeState,modal.locale);renderLocalePanel();}
   else if(modal?.kind==='guide')openGuide(modal.id);else if(modal?.kind==='build')openBuild(modal.id);else if(modal?.kind==='credits')openCredits();else if(modal?.kind==='quest')openQuest(modal.id);else if(modal?.kind==='catalogue')openCatalogueRecord(modal.id);else if(modal?.kind==='map')openAtlasMap(modal.id);else if(modal?.kind==='item')openItem(modal.id);
   else if(modal?.kind==='search'){openSearch(modal.query);S.searchIndex=modal.selected;paintSearchHits();}
   else if(modal?.kind==='saved'){savedPanelMode=modal.tab;editingBookmarks=modal.edit;renderSaved(modal.query);openDialog('savedDialog');}else if(modal?.kind==='settings')openSettings(modal.tab);
   restoreFolds(snapshot.folds);
  }
  if(S.view==='progression'){if(snapshot.routeSignature!==JSON.stringify(speedrunPrefs[S.edition]))renderProgression();else renderSpeedrunReset();}
  if(snapshot.contentStamp!==contentPreferenceStamp()){refreshPreferenceContent();if(snapshot.modal?.kind==='settings')renderSettings();}applyGuidePreferences();syncCompactProfileHeaders();syncSpeedrunTabs();restoreScroll(snapshot);nextFrame(()=>{restoreScroll(snapshot);syncCompactProfileHeaders();});
 }finally{restoringScreen=false;}
}
let pendingScreenReturn=null,screenReturnVersion=0;
function finishScreenReturn(){pendingScreenReturn?.commit();}
function transitionScreenReturn(snapshot){
 if(!snapshot)return;
 if(pendingScreenReturn){pendingScreenReturn.animation?.cancel();pendingScreenReturn.clean();pendingScreenReturn=null;}
 const dialog=[...document.querySelectorAll('dialog[open]')].pop(),root=dialog||$('stageBoundary');
 const sameDialog=dialog&&snapshot.live?.dialogs.includes(dialog.id),surface=sameDialog?$(dialog.id==='itemDialog'?'itemBody':dialog.id==='detailDialog'?'detailBody':dialog.id==='settingsDialog'?'settingsBody':'savedList'):root;
 if(!surface||transitionsDisabled()||typeof surface.animate!=='function'){restoreScreen(snapshot);return;}
 const version=++screenReturnVersion;let done=false;surface.inert=true;if(dialog&&!sameDialog)dialog.classList.add('panel-exiting');
 const state={clean(){surface.inert=false;dialog?.classList.remove('panel-exiting');},commit(){if(done||pendingScreenReturn!==state)return;done=true;pendingScreenReturn=null;state.animation?.cancel();state.clean();restoreScreen(snapshot);if(sameDialog)animateContentArrival(surface);}};
 pendingScreenReturn=state;state.animation=animateUI(surface,transitionFrames(false,dialog?'panel':'content'),{duration:190,easing:'cubic-bezier(.4,0,.5,1)',fill:'both'});
 state.animation.finished.then(()=>{if(version===screenReturnVersion)state.commit();},()=>{});
}
function screenBack(skipSearchAnimation=false){
 if(!skipSearchAnimation&&$('searchDialog').open){exitSearch(()=>screenBack(true));return;}
 if(screenCursor>0){const target=screenCursor-1;if(skipSearchAnimation)searchOrigin=null;if(typeof history.back==='function'&&history.state?.fieldGuideScreen===screenCursor){history.back();return;}screenTrail[screenCursor]=currentScreen();screenCursor=target;if(skipSearchAnimation)restoreScreen(screenTrail[target]);else transitionScreenReturn(screenTrail[target]);return;}
 const open=[...document.querySelectorAll('dialog[open]')].pop();if(open){if(skipSearchAnimation||transitionsDisabled()||typeof open.animate!=='function')rawCloseDialog(open.id);else{const animation=animateUI(open,transitionFrames(false,'panel'),{duration:190,fill:'both'});animation.finished.then(()=>{rawCloseDialog(open.id);animation.cancel();},()=>{});}}
}
function wrapScreen(fn,detailKind){return function(...args){return screenChange(()=>{const result=fn(...args);if(detailKind)activeDetail={kind:detailKind,id:args[0]};return result;});};}
openMonster=wrapScreen(openMonster,'monster');openWeapon=wrapScreen(openWeapon,'weapon');openLocale=wrapScreen(openLocale,'locale');openGuide=wrapScreen(openGuide,'guide');openBuild=wrapScreen(openBuild,'build');openCredits=wrapScreen(openCredits,'credits');openQuest=wrapScreen(openQuest,'quest');openCatalogueRecord=wrapScreen(openCatalogueRecord,'catalogue');openAtlasMap=wrapScreen(openAtlasMap,'map');
const rawOpenItem=openItem;openItem=function(name){return screenChange(()=>{activeItem=name;return rawOpenItem(name);});};
openSearch=wrapScreen(openSearch);openSettings=wrapScreen(openSettings);
const entryBeforeScreenHistory=openEntry;
openEntry=function(...args){
 if($('searchDialog').open&&!reducedMotion()&&typeof $('searchWindow').animate==='function'){
  if(searchClosing)return;const snapshot=currentScreen(),epoch=screenInteractionEpoch;
  exitSearch(()=>{
   if(epoch!==screenInteractionEpoch){restoreScreen(screenTrail[screenCursor]);return;}
   rememberScreen(snapshot);screenDepth++;try{rawCloseDialog('searchDialog');entryBeforeScreenHistory(...args);}finally{screenDepth--;}
  },{preserveBackdrop:true});return;
 }
 return screenChange(()=>entryBeforeScreenHistory(...args));
};
jumpWeapon=wrapScreen(jumpWeapon);jumpRecipe=wrapScreen(jumpRecipe);
const rawOpenDialog=openDialog;openDialog=function(id){$(id)?.classList.remove('restored-dialog');if(screenDepth||restoringScreen||$(id).open)return rawOpenDialog(id);return screenChange(()=>rawOpenDialog(id));};
const rawNavigate=navigate;navigate=function(mode=S.edition,view=S.view,scroll=true,animateFrame=false){if(!validMode(mode)||!validView(view))return;if(screenDepth||restoringScreen||mode===S.edition&&view===S.view)return rawNavigate(mode,view,scroll,animateFrame);return screenChange(()=>rawNavigate(mode,view,scroll,animateFrame));};
closeDialog=function(id){if(screenDepth||restoringScreen)return rawCloseDialog(id);if($(id)?.open)screenBack();};
window.addEventListener('popstate',event=>{
 screenInteractionEpoch++;const cursor=event.state?.fieldGuideScreen;if(!Number.isInteger(cursor)||cursor<0||cursor>=screenTrail.length)return;
 if(!pendingScreenReturn&&!searchClosing)screenTrail[screenCursor]=currentScreen();screenCursor=cursor;
 const restore=()=>transitionScreenReturn(screenTrail[cursor]);
 if($('searchDialog').open&&screenTrail[cursor]?.modal?.kind!=='search'&&!searchClosing&&!searchReturnPending)exitSearch(()=>restoreScreen(screenTrail[screenCursor]));
 else if(searchClosing){return;}
 else if(searchReturnPending)restoreScreen(screenTrail[cursor]);else restore();
});
try{if(typeof history.pushState==='function')history.replaceState({...history.state,fieldGuideScreen:0},'',location.hash||'#'+S.edition+'/'+S.view);}catch{}
document.querySelectorAll('dialog').forEach(dialog=>dialog.addEventListener('cancel',event=>{event.preventDefault();screenBack();}));


document.addEventListener('click',event=>{const t=event.target.closest('button,[data-entry]');if(!t)return;if(t.id==='homeSearchButton'){openSearch('',t);return;}if(onDatabaseClick(t))return;if(t.dataset.playbackMode){setPlaybackMode(t.dataset.playbackMode);return;}if(t.dataset.theme){chooseTheme(t.dataset.theme);return;}if(t.dataset.settingsTab){settingsTab=t.dataset.settingsTab;renderSettings();return;}if(t.dataset.librarySelect){selectAudioTrack(t.dataset.librarySelect);return;}if(t.dataset.libraryMove){moveAudioTrack(t.dataset.trackId,t.dataset.libraryMove);return;}if(t.dataset.libraryDelete){void deleteAudioTrack(t.dataset.libraryDelete);return;}if(t.hasAttribute('data-restore-tracks')){restoreSuppliedTracks();return;}if(t.hasAttribute('data-open-music')){toggleMusicDock(true);return;}if(t.hasAttribute('data-open-credits')){openCredits();return;}if(t.dataset.edition){navigate(t.dataset.edition,S.view,true,true);return;}if(t.dataset.nav){closeGuideMenu();navigate(S.edition,t.dataset.nav,true,true);return;}if(t.dataset.switchTo){navigate(t.dataset.switchTo,t.dataset.switchView||'overview',true,true);return;}if(t.dataset.save){toggleSave(t.dataset.save);return;}if(t.dataset.openLocale){openLocale(t.dataset.openLocale);return;}if(t.dataset.localeTab){setLocaleTab(t.dataset.localeTab);return;}if(t.dataset.openMonster){openMonster(t.dataset.openMonster,t);return;}if(t.dataset.openWeapon){openWeapon(t.dataset.openWeapon);return;}if(t.dataset.openGuide){openGuide(t.dataset.openGuide);return;}if(t.dataset.close){closeDialog(t.dataset.close);return;}if(t.dataset.entry){const pos=t.dataset.entry.indexOf(':');openEntry(t.dataset.entry.slice(0,pos),t.dataset.entry.slice(pos+1));return;}if(t.dataset.searchHit!==undefined){const h=searchHits[+t.dataset.searchHit];if(h)openEntry(h.kind,h.id,h);return;}if(t.hasAttribute('data-monster-kind')){S.monsterKind=t.dataset.monsterKind;S.monsterLimit=bestiaryBatchSize();rememberBestiaryFilters();renderBestiary();return;}if(t.hasAttribute('data-more-monsters')){S.monsterLimit+=bestiaryBatchSize();renderMonsterGrid();return;}if(t.hasAttribute('data-reset-monsters')){S.monsterQ='';S.monsterType='all';S.monsterKind='all';S.monsterScope='new';S.monsterLimit=bestiaryBatchSize();rememberBestiaryFilters();renderBestiary();return;}if(t.dataset.weaponKind){S.weaponKind=t.dataset.weaponKind;renderWeapons();return;}if(t.dataset.buildKind){S.buildKind=t.dataset.buildKind;renderEquipment();paintIcons();return;}if(t.dataset.noteCat){S.noteCat=t.dataset.noteCat;renderNotes();paintIcons();return;}if(t.hasAttribute('data-reset-camp')){D.checklist.forEach((_,i)=>{if(S.checks[S.edition])delete S.checks[S.edition]['camp:'+i]});persist();updateChecks();return;}});
document.addEventListener('input',e=>{const t=e.target;if(onDatabaseInput(t))return;if(t.dataset.customColour){if(/^#[a-fA-F0-9]{6}$/.test(t.value)){appearancePrefs.custom[t.dataset.customColour]=t.value;chooseTheme('custom');}}else if(t.id==='localeResourceSearch'){localeState.resourceQ=t.value;renderLocaleResources();}else if(t.id==='monsterSearch'){S.monsterQ=t.value;S.monsterLimit=bestiaryBatchSize();renderMonsterGrid();}else if(t.id==='skillSearch'){S.skillQ=t.value;renderSkills();}else if(t.id==='noteSearch'){S.noteQ=t.value;renderNoteGrid();}else if(t.id==='itemSearch'){S.itemQ=t.value;renderItems();}else if(t.id==='globalSearch')renderSearch();});
document.addEventListener('change',e=>{const t=e.target;if(onDatabaseChange(t))return;if(t.id==='libraryMusicFile'){const files=[...t.files];void (async()=>{for(const file of files)await readMusic(file);})();}else if(t.id==='musicTrack'){selectAudioTrack(t.value);}else if(t.id==='monsterType'){S.monsterType=t.value;S.monsterLimit=bestiaryBatchSize();rememberBestiaryFilters();renderMonsterGrid();}else if(t.id==='monsterScope'){S.monsterScope=t.value;S.monsterLimit=bestiaryBatchSize();rememberBestiaryFilters();renderMonsterGrid();}else if(t.hasAttribute('data-check')){if(!S.checks[S.edition])S.checks[S.edition]={};S.checks[S.edition][t.dataset.check]=t.checked;persist();updateChecks();}});
$('brandHome').addEventListener('click',e=>{e.preventDefault();if(S.view!=='overview')navigate(S.edition,'overview');});
$('searchOpen').addEventListener('click',event=>openSearch('',document.body.classList.contains('is-home')?$('homeSearchButton'):event.currentTarget));
$('savedOpen').addEventListener('click',()=>{renderSaved();openDialog('savedDialog');});
$('creditsOpen').addEventListener('click',openCredits);$('settingsOpen').addEventListener('click',()=>openSettings());
$('menuOpen').addEventListener('click',e=>toggleGuideMenu(undefined,e.detail===0));$('menuClose').addEventListener('click',()=>closeGuideMenu(true));$('menuBackdrop').addEventListener('click',()=>closeGuideMenu(true));

$('guideMenu').addEventListener('keydown',e=>{const options=[...$('guideMenu').querySelectorAll('button')];let i=options.indexOf(document.activeElement);if(e.key==='ArrowDown')i=(i+1)%options.length;else if(e.key==='ArrowUp')i=(i+options.length-1)%options.length;else if(e.key==='Home')i=0;else if(e.key==='End')i=options.length-1;else return;e.preventDefault();options[i]?.focus();});
document.addEventListener('pointerdown',e=>{if(!$('musicDock').hidden&&!$('musicDock').contains(e.target)&&!$('musicOpen').contains(e.target))toggleMusicDock(false);if(!$('guideMenu').hidden&&!$('guideMenu').contains(e.target)&&!$('menuOpen').contains(e.target)&&e.target!==$('menuBackdrop'))closeGuideMenu();},{passive:true});
$('musicOpen').addEventListener('click',()=>toggleMusicDock());$('musicClose').addEventListener('click',()=>toggleMusicDock(false));
$('audioPlay').addEventListener('click',toggleAudioPlayback);
$('audioVolume').addEventListener('input',()=>{musicPrefs.volume=Math.max(0,Math.min(1,+$('audioVolume').value/100));audio.volume=musicPrefs.volume;audio.muted=musicPrefs.volume===0;$('volumeValue').textContent=$('audioVolume').value+'%';persist();});
$('audioSeek').addEventListener('input',()=>{if(Number.isFinite(audio.duration)&&audio.duration>0){audio.currentTime=+$('audioSeek').value/1000*audio.duration;flushAudioPreferences();}});
$('audioLoop').addEventListener('click',()=>{const menu=$('playbackOptions');setControlVisibility(menu,menu.hidden||menu.dataset.closing==='true');$('audioLoop').setAttribute('aria-expanded',String(!menu.hidden));});
$('musicFile').addEventListener('change',()=>readMusic($('musicFile').files[0]));
['timeupdate','loadedmetadata','play','pause','ended','volumechange'].forEach(e=>audio.addEventListener(e,updateAudio));
audio.addEventListener('ended',advanceAudio);
audio.addEventListener('timeupdate',()=>{if(Date.now()-lastPositionSave>5000){lastPositionSave=Date.now();flushAudioPreferences();}});
window.addEventListener('pagehide',flushAudioPreferences);document.addEventListener('visibilitychange',()=>{if(document.hidden)flushAudioPreferences();});
document.addEventListener('click',e=>{if(!e.target.closest?.('#audioPlay'))retryAllowedAutoplay(e);});document.addEventListener('keydown',retryAllowedAutoplay);
audio.addEventListener('error',()=>{$('musicStatus').textContent='This audio could not be decoded. Try an MP3, WAV, or OGG file.';$('musicStatus').hidden=false;updateAudio();});
document.addEventListener('keydown',e=>{const typing=['INPUT','TEXTAREA','SELECT'].includes(document.activeElement?.tagName);if((e.key==='/'&&!typing)||((e.ctrlKey||e.metaKey)&&e.key.toLowerCase()==='k')){e.preventDefault();$('searchOpen').click();return;}if(e.key==='Escape'){if(!$('guideMenu').hidden){closeGuideMenu(true);e.preventDefault();}if(!document.querySelector('dialog[open]'))toggleMusicDock(false);return;}if($('searchDialog').open&&['ArrowDown','ArrowUp','Enter'].includes(e.key)){e.preventDefault();if(e.key==='Enter'){const h=searchHits[S.searchIndex];if(h)openEntry(h.kind,h.id,h);}else if(searchHits.length){S.searchIndex=(S.searchIndex+(e.key==='ArrowDown'?1:-1)+searchHits.length)%searchHits.length;paintSearchHits();$('searchResults').querySelector('.selected')?.scrollIntoView?.({block:'nearest'});}}});
document.querySelectorAll('dialog').forEach(d=>{d.addEventListener('close',()=>{if(!document.querySelector('dialog[open]'))document.body.style.overflow='';});d.addEventListener('click',e=>{if(e.target===d){const r=d.getBoundingClientRect();if(e.clientX<r.left||e.clientX>r.right||e.clientY<r.top||e.clientY>r.bottom)closeDialog(d.id);}});});
window.addEventListener('hashchange',()=>{const [m,v]=location.hash.replace(/^#/,'').split('/');if(validMode(m)&&validView(v))navigate(m,v);});
applyStartupPreferences();applyMotionPreferences();applyGuidePreferences();initializeMotion();renderAll();navigate(S.edition,S.view,false);syncAudio();paintIcons();
const audioInitialized=initializeAudio();
// A small read-only surface supports automated offline checks without network access.
window.FieldGuide={getState:()=>({edition:S.edition,view:S.view,saved:[...S.saved]}),counts:()=>({monsters:D.monsters.length,weapons:D.weapons.length,guides:D.guides.length,world:D.monsters.filter(m=>m.game==='world').length,iceborne:D.monsters.filter(m=>m.game==='iceborne').length,masterRank:monAll().length}),navigate,openMonster,openWeapon,openGuide,openLocale,openItem,jumpWeapon,jumpRecipe,setPlaybackMode,advanceAudio,databaseCounts:()=>({weapons:DB.weapons.length,recipes:DB.recipes.length,items:itemIndex.size,monsters:Object.keys(DB.monsters).length}),ready:audioInitialized,appearanceState:()=>({theme:appearancePrefs.theme,custom:{...appearancePrefs.custom}}),musicState:()=>({trackId:selectedTrackId(),name:currentTrack()?.name,paused:musicPrefs.paused,volume:musicPrefs.volume,loop:musicPrefs.loop,mode:musicPrefs.mode,shuffleQueue:[...musicPrefs.shuffleQueue],shufflePlayed:[...musicPrefs.shufflePlayed],imported:importedTracks.size,persisted:!!currentTrack()?.persisted,autoplayPending})};
})();
