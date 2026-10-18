package com.lumina.monsterhunterfieldbook;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.io.CloseableKt;
import kotlin.io.ConstantsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.sequences.SequencesKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: BackupController.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u0011J \u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018J\u0010\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0006\u0010\u001c\u001a\u00020\u0011J\u0006\u0010\u001d\u001a\u00020\u0011J\u0006\u0010\u001e\u001a\u00020\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/lumina/monsterhunterfieldbook/BackupController;", "", "a", "Lcom/lumina/monsterhunterfieldbook/MainActivity;", "<init>", "(Lcom/lumina/monsterhunterfieldbook/MainActivity;)V", "executor", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "pendingExport", "", "appearance", "", "motion", "browsing", "personal", "export", "", "importBackup", "onResult", "request", "", "result", "data", "Landroid/content/Intent;", "confirmImport", "values", "Lorg/json/JSONObject;", "resetAllSettings", "selectiveReset", "release", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BackupController {
    private final MainActivity a;
    private final Set<String> appearance;
    private final Set<String> browsing;
    private final ExecutorService executor;
    private final Set<String> motion;
    private String pendingExport;
    private final Set<String> personal;

    public BackupController(MainActivity a) {
        Intrinsics.checkNotNullParameter(a, "a");
        this.a = a;
        this.executor = Executors.newSingleThreadExecutor();
        this.pendingExport = "";
        this.appearance = SetsKt.setOf((Object[]) new String[]{"font", "lineSpacing", "letterSpacing", "wordSpacing", "density", "iconSize", "theme", "customBg", "customAccent", "customInk", "gradients", "gradientStrength", "gradientAngle"});
        this.motion = SetsKt.setOf((Object[]) new String[]{"animations", "speed", "transition", "touch", "glow", "particles", "blur", "imageMotion", "performance"});
        this.browsing = SetsKt.setOf((Object[]) new String[]{"startup", "lastSection", "settingsLayout", "confirmExit", "rememberScroll", "singleGroup", "rememberGroups", "searchHistory", "readingGroups", "columns", "rows"});
        this.personal = SetsKt.setOf((Object[]) new String[]{"bookmarks", "recent", "visualProfiles", "campChecks", "tracks", "musicPositions", "edition", "trackOrder", "hiddenTracks"});
    }

    public final void export() {
        Object m65constructorimpl;
        this.pendingExport = NativeBackup.INSTANCE.encode(this.a.getPrefs().snapshot());
        Intent putExtra = new Intent("android.intent.action.CREATE_DOCUMENT").addCategory("android.intent.category.OPENABLE").setType("application/json").putExtra("android.intent.extra.TITLE", "Monster_Hunter_Field_Book_Backup.json");
        Intrinsics.checkNotNullExpressionValue(putExtra, "putExtra(...)");
        try {
            Result.Companion companion = Result.INSTANCE;
            BackupController backupController = this;
            this.a.startActivityForResult(putExtra, 701);
            m65constructorimpl = Result.m65constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m65constructorimpl = Result.m65constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m68exceptionOrNullimpl(m65constructorimpl) != null) {
            this.a.toast("No file picker is available.");
        }
    }

    public final void importBackup() {
        Object m65constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            BackupController backupController = this;
            this.a.startActivityForResult(new Intent("android.intent.action.OPEN_DOCUMENT").addCategory("android.intent.category.OPENABLE").setType("*/*").putExtra("android.intent.extra.MIME_TYPES", new String[]{"application/json", "text/plain"}), 702);
            m65constructorimpl = Result.m65constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m65constructorimpl = Result.m65constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m68exceptionOrNullimpl(m65constructorimpl) != null) {
            this.a.toast("No file picker is available.");
        }
    }

    public final void onResult(final int request, int result, Intent data) {
        final Uri data2;
        if (result != -1 || data == null || (data2 = data.getData()) == null) {
            return;
        }
        if (request == 703) {
            this.a.importMusic(data2);
        } else if (CollectionsKt.listOf((Object[]) new Integer[]{701, 702}).contains(Integer.valueOf(request))) {
            this.executor.execute(new Runnable() { // from class: com.lumina.monsterhunterfieldbook.BackupController$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    BackupController.onResult$lambda$0(BackupController.this, request, data2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onResult$lambda$0(final BackupController backupController, int i, Uri uri) {
        final Object m65constructorimpl;
        InputStream inputStream;
        try {
            Result.Companion companion = Result.INSTANCE;
            JSONObject jSONObject = null;
            if (i == 701) {
                OutputStream openOutputStream = backupController.a.getContentResolver().openOutputStream(uri, "wt");
                Intrinsics.checkNotNull(openOutputStream);
                Writer outputStreamWriter = new OutputStreamWriter(openOutputStream, Charsets.UTF_8);
                inputStream = outputStreamWriter instanceof BufferedWriter ? (BufferedWriter) outputStreamWriter : new BufferedWriter(outputStreamWriter, ConstantsKt.DEFAULT_BUFFER_SIZE);
                try {
                    inputStream.write(backupController.pendingExport);
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(inputStream, null);
                } finally {
                }
            } else {
                InputStream openInputStream = backupController.a.getContentResolver().openInputStream(uri);
                Intrinsics.checkNotNull(openInputStream);
                inputStream = openInputStream;
                try {
                    InputStream inputStream2 = inputStream;
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    byte[] bArr = new byte[ConstantsKt.DEFAULT_BUFFER_SIZE];
                    int i2 = 0;
                    while (true) {
                        int read = inputStream2.read(bArr);
                        if (read < 0) {
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            CloseableKt.closeFinally(inputStream, null);
                            NativeBackup nativeBackup = NativeBackup.INSTANCE;
                            Intrinsics.checkNotNull(byteArray);
                            jSONObject = nativeBackup.decode(new String(byteArray, Charsets.UTF_8));
                            break;
                        }
                        i2 += read;
                        if (i2 > 2097152) {
                            throw new IllegalArgumentException("Backup is too large.".toString());
                        }
                        byteArrayOutputStream.write(bArr, 0, read);
                    }
                } finally {
                    try {
                        throw th;
                    } finally {
                    }
                }
            }
            m65constructorimpl = Result.m65constructorimpl(jSONObject);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m65constructorimpl = Result.m65constructorimpl(ResultKt.createFailure(th));
        }
        backupController.a.runOnUiThread(new Runnable() { // from class: com.lumina.monsterhunterfieldbook.BackupController$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                BackupController.onResult$lambda$0$1(BackupController.this, m65constructorimpl);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onResult$lambda$0$1(BackupController backupController, Object obj) {
        if (backupController.a.isFinishing() || backupController.a.isDestroyed()) {
            return;
        }
        Throwable m68exceptionOrNullimpl = Result.m68exceptionOrNullimpl(obj);
        if (m68exceptionOrNullimpl != null) {
            MainActivity mainActivity = backupController.a;
            String message = m68exceptionOrNullimpl.getMessage();
            if (message == null) {
                message = "Could not read or write that file.";
            }
            mainActivity.toast(message);
        }
        if (Result.m72isSuccessimpl(obj)) {
            JSONObject jSONObject = (JSONObject) obj;
            if (jSONObject == null) {
                backupController.a.toast("Backup exported.");
            } else {
                backupController.confirmImport(jSONObject);
            }
        }
    }

    private final void confirmImport(final JSONObject values) {
        Object m65constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            BackupController backupController = this;
            m65constructorimpl = Result.m65constructorimpl(Integer.valueOf(new JSONArray(values.optString("bookmarks", "[]")).length()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m65constructorimpl = Result.m65constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m71isFailureimpl(m65constructorimpl)) {
            m65constructorimpl = 0;
        }
        new AlertDialog.Builder(this.a).setTitle("Restore native backup?").setMessage("Restores settings, filters, " + ((Number) m65constructorimpl).intValue() + " bookmarks and saved progress from this file. Imported music files stay on this device.").setNegativeButton("Cancel", (DialogInterface.OnClickListener) null).setPositiveButton("Restore", new DialogInterface.OnClickListener() { // from class: com.lumina.monsterhunterfieldbook.BackupController$$ExternalSyntheticLambda1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                BackupController.confirmImport$lambda$1(BackupController.this, values, dialogInterface, i);
            }
        }).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void confirmImport$lambda$1(BackupController backupController, JSONObject jSONObject, DialogInterface dialogInterface, int i) {
        for (String str : CollectionsKt.listOf((Object[]) new String[]{"tracks", "trackOrder", "hiddenTracks"})) {
            if (backupController.a.getPrefs().getValues().has(str)) {
                jSONObject.put(str, backupController.a.getPrefs().getValues().get(str));
            }
        }
        backupController.a.getPrefs().applySnapshot(jSONObject);
        backupController.a.reloadStoredState();
        backupController.a.afterPreference("reset");
        backupController.a.rebuildSettings();
        backupController.a.toast("Backup restored.");
    }

    public final void resetAllSettings() {
        LinearLayout column = this.a.column();
        LinearLayout linearLayout = column;
        this.a.pad(linearLayout, 18);
        column.addView(MainActivity.text$default(this.a, "Bookmarks, campaign progress, checklists, music files, history and saved looks are kept.", 14.0f, false, 0, 12, null));
        MainActivity.gap$default(this.a, column, 0, 2, null);
        final CheckBox checkBox = new CheckBox(this.a);
        checkBox.setText("Reset appearance, effects, browsing and music settings");
        checkBox.setTextColor(this.a.getInk());
        checkBox.setMinHeight(this.a.dp((Number) 50));
        column.addView(checkBox);
        final AlertDialog create = new AlertDialog.Builder(this.a).setTitle("Reset All Settings").setView(linearLayout).setNegativeButton("Cancel", (DialogInterface.OnClickListener) null).setPositiveButton("Reset", new DialogInterface.OnClickListener() { // from class: com.lumina.monsterhunterfieldbook.BackupController$$ExternalSyntheticLambda6
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                BackupController.resetAllSettings$lambda$1(checkBox, this, dialogInterface, i);
            }
        }).create();
        create.show();
        create.getButton(-1).setEnabled(false);
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.lumina.monsterhunterfieldbook.BackupController$$ExternalSyntheticLambda7
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                BackupController.resetAllSettings$lambda$2(create, compoundButton, z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void resetAllSettings$lambda$1(CheckBox checkBox, BackupController backupController, DialogInterface dialogInterface, int i) {
        if (checkBox.isChecked()) {
            JSONObject jSONObject = new JSONObject();
            Iterator<String> keys = backupController.a.getPrefs().getValues().keys();
            Intrinsics.checkNotNullExpressionValue(keys, "keys(...)");
            while (keys.hasNext()) {
                String next = keys.next();
                if (!backupController.personal.contains(next)) {
                    Intrinsics.checkNotNull(next);
                    if (!StringsKt.startsWith$default(next, "progress:", false, 2, (Object) null) && !StringsKt.startsWith$default(next, "goals:", false, 2, (Object) null)) {
                    }
                }
                jSONObject.put(next, backupController.a.getPrefs().getValues().get(next));
            }
            backupController.a.getPrefs().applySnapshot(jSONObject);
            backupController.a.reloadStoredState();
            backupController.a.afterPreference("reset");
            backupController.a.rebuildSettings();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void resetAllSettings$lambda$2(AlertDialog alertDialog, CompoundButton compoundButton, boolean z) {
        Intrinsics.checkNotNullParameter(compoundButton, "<unused var>");
        alertDialog.getButton(-1).setEnabled(z);
    }

    public final void selectiveReset() {
        final String[] strArr = {"Appearance", "Motion & effects", "Browsing options", "Saved filters & positions", "Bookmarks", "Speedrun & checklists", "Search history", "Saved visual presets", "Music settings"};
        final boolean[] zArr = new boolean[9];
        new AlertDialog.Builder(this.a).setTitle("Choose what to reset").setMultiChoiceItems(strArr, zArr, new DialogInterface.OnMultiChoiceClickListener() { // from class: com.lumina.monsterhunterfieldbook.BackupController$$ExternalSyntheticLambda8
            @Override // android.content.DialogInterface.OnMultiChoiceClickListener
            public final void onClick(DialogInterface dialogInterface, int i, boolean z) {
                BackupController.selectiveReset$lambda$0(zArr, dialogInterface, i, z);
            }
        }).setNegativeButton("Cancel", (DialogInterface.OnClickListener) null).setPositiveButton("Review", new DialogInterface.OnClickListener() { // from class: com.lumina.monsterhunterfieldbook.BackupController$$ExternalSyntheticLambda9
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                BackupController.selectiveReset$lambda$1(zArr, this, strArr, dialogInterface, i);
            }
        }).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void selectiveReset$lambda$0(boolean[] zArr, DialogInterface dialogInterface, int i, boolean z) {
        zArr[i] = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void selectiveReset$lambda$1(boolean[] zArr, final BackupController backupController, final String[] strArr, DialogInterface dialogInterface, int i) {
        IntRange indices = ArraysKt.getIndices(zArr);
        ArrayList arrayList = new ArrayList();
        for (Integer num : indices) {
            if (zArr[num.intValue()]) {
                arrayList.add(num);
            }
        }
        final ArrayList arrayList2 = arrayList;
        if (arrayList2.isEmpty()) {
            backupController.a.toast("Nothing selected.");
        } else {
            new AlertDialog.Builder(backupController.a).setTitle("Confirm selected reset").setMessage(CollectionsKt.joinToString$default(arrayList2, "\n", null, null, 0, null, new Function1() { // from class: com.lumina.monsterhunterfieldbook.BackupController$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    CharSequence selectiveReset$lambda$1$1;
                    selectiveReset$lambda$1$1 = BackupController.selectiveReset$lambda$1$1(strArr, ((Integer) obj).intValue());
                    return selectiveReset$lambda$1$1;
                }
            }, 30, null)).setNegativeButton("Keep", (DialogInterface.OnClickListener) null).setPositiveButton("Reset", new DialogInterface.OnClickListener() { // from class: com.lumina.monsterhunterfieldbook.BackupController$$ExternalSyntheticLambda3
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface2, int i2) {
                    BackupController.selectiveReset$lambda$1$2(BackupController.this, arrayList2, dialogInterface2, i2);
                }
            }).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence selectiveReset$lambda$1$1(String[] strArr, int i) {
        return strArr[i];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void selectiveReset$lambda$1$2(final BackupController backupController, final List list, DialogInterface dialogInterface, int i) {
        Iterator<String> keys = backupController.a.getPrefs().getValues().keys();
        Intrinsics.checkNotNullExpressionValue(keys, "keys(...)");
        Iterator it = SequencesKt.toList(SequencesKt.filter(SequencesKt.asSequence(keys), new Function1() { // from class: com.lumina.monsterhunterfieldbook.BackupController$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean selectiveReset$lambda$1$2$0;
                selectiveReset$lambda$1$2$0 = BackupController.selectiveReset$lambda$1$2$0(list, backupController, (String) obj);
                return Boolean.valueOf(selectiveReset$lambda$1$2$0);
            }
        })).iterator();
        while (it.hasNext()) {
            backupController.a.getPrefs().getValues().remove((String) it.next());
        }
        backupController.a.getPrefs().save();
        backupController.a.reloadStoredState();
        backupController.a.afterPreference("reset");
        backupController.a.rebuildSettings();
        backupController.a.toast("Selected data reset.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008e, code lost:
    
        if (kotlin.collections.SetsKt.setOf((java.lang.Object[]) new java.lang.String[]{"campChecks", "speedUndo"}).contains(r11) == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00f2, code lost:
    
        if (kotlin.text.StringsKt.startsWith$default(r11, "sort:", false, 2, (java.lang.Object) null) != false) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean selectiveReset$lambda$1$2$0(List list, BackupController backupController, String str) {
        Set<String> set;
        boolean contains;
        String str2;
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            switch (((Number) it.next()).intValue()) {
                case 0:
                    set = backupController.appearance;
                    contains = set.contains(str);
                    break;
                case 1:
                    set = backupController.motion;
                    contains = set.contains(str);
                    break;
                case 2:
                    if (!backupController.browsing.contains(str)) {
                        Intrinsics.checkNotNull(str);
                        break;
                    }
                    contains = true;
                    break;
                case 3:
                    List<String> listOf = CollectionsKt.listOf((Object[]) new String[]{"filter:", "position:", "recordPosition:", "mapFloor:", "mapView:", "collection:"});
                    if (!(listOf instanceof Collection) || !listOf.isEmpty()) {
                        for (String str3 : listOf) {
                            Intrinsics.checkNotNull(str);
                            if (StringsKt.startsWith$default(str, str3, false, 2, (Object) null)) {
                                contains = true;
                                break;
                            }
                        }
                    }
                    contains = false;
                    break;
                case 4:
                    contains = Intrinsics.areEqual(str, "bookmarks");
                    break;
                case 5:
                    Intrinsics.checkNotNull(str);
                    if (!StringsKt.startsWith$default(str, "progress:", false, 2, (Object) null)) {
                        if (!StringsKt.startsWith$default(str, "goals:", false, 2, (Object) null)) {
                            break;
                        }
                    }
                    contains = true;
                    break;
                case 6:
                    str2 = "recent";
                    contains = Intrinsics.areEqual(str, str2);
                    break;
                case 7:
                    str2 = "visualProfiles";
                    contains = Intrinsics.areEqual(str, str2);
                    break;
                default:
                    contains = SetsKt.setOf((Object[]) new String[]{"musicEnabled", "musicPaused", "followTheme", "volume", "musicMode", "musicTrack", "musicPositions", "rememberMusicPosition"}).contains(str);
                    break;
            }
            if (contains) {
                return true;
            }
        }
        return false;
    }

    public final void release() {
        this.executor.shutdownNow();
    }
}
