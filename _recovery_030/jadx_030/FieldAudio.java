package com.lumina.monsterhunterfieldbook;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Handler;
import android.os.Looper;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.comparisons.ComparisonsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: FieldAudio.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\f\u0010&\u001a\b\u0012\u0004\u0012\u00020(0'J\u0006\u0010)\u001a\u00020*J\u0010\u0010+\u001a\n -*\u0004\u0018\u00010,0,H\u0002J\b\u0010.\u001a\u00020\u0013H\u0002J\u0006\u0010/\u001a\u00020*J\u000e\u00100\u001a\u00020*2\u0006\u00101\u001a\u00020\u0011J\u000e\u00102\u001a\u00020*2\u0006\u00103\u001a\u00020\u0011J\b\u00104\u001a\u00020*H\u0002J\u0018\u00105\u001a\u00020*2\u0006\u00103\u001a\u00020\u00112\u0006\u00106\u001a\u00020\u0013H\u0002J\b\u00107\u001a\u00020*H\u0002J\u0006\u00108\u001a\u00020*J\u000e\u00109\u001a\u00020*2\u0006\u0010:\u001a\u00020!J\u000e\u0010;\u001a\u00020*2\u0006\u0010<\u001a\u00020!J\u0016\u0010=\u001a\u00020*2\u0006\u00103\u001a\u00020\u00112\u0006\u0010<\u001a\u00020!J\u000e\u0010>\u001a\u00020*2\u0006\u00103\u001a\u00020\u0011J\u0006\u0010?\u001a\u00020*J\u0006\u0010@\u001a\u00020*J\b\u0010A\u001a\u00020*H\u0002J\u0006\u0010B\u001a\u00020*J\u0006\u0010C\u001a\u00020*J\u0010\u0010D\u001a\u00020*2\u0006\u0010E\u001a\u00020!H\u0016J\u0006\u0010F\u001a\u00020*R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u001a\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001d\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010 \u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0011\u0010$\u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b%\u0010#¨\u0006G"}, d2 = {"Lcom/lumina/monsterhunterfieldbook/FieldAudio;", "Landroid/media/AudioManager$OnAudioFocusChangeListener;", "context", "Landroid/content/Context;", "prefs", "Lcom/lumina/monsterhunterfieldbook/NativePrefs;", "<init>", "(Landroid/content/Context;Lcom/lumina/monsterhunterfieldbook/NativePrefs;)V", "manager", "Landroid/media/AudioManager;", "player", "Landroid/media/MediaPlayer;", "retiring", "intro", "fade", "Landroid/animation/ValueAnimator;", "edition", "", "foreground", "", "introductionDone", "focused", "prepared", "selected", "handler", "Landroid/os/Handler;", "trackId", "getTrackId", "()Ljava/lang/String;", "playing", "getPlaying", "()Z", "position", "", "getPosition", "()I", "duration", "getDuration", "tracks", "", "Lcom/lumina/monsterhunterfieldbook/MusicTrack;", "formation", "", "attributes", "Landroid/media/AudioAttributes;", "kotlin.jvm.PlatformType", "focus", "introductionFinished", "play", "next", "select", "id", "rememberPosition", "choose", "force", "crossfade", "toggle", "seek", "milliseconds", "advance", "delta", "move", "remove", "restoreBuiltins", "updateVolume", "pausePlayers", "resume", "pause", "onAudioFocusChange", "change", "release", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FieldAudio implements AudioManager.OnAudioFocusChangeListener {
    private final Context context;
    private String edition;
    private ValueAnimator fade;
    private boolean focused;
    private boolean foreground;
    private final Handler handler;
    private MediaPlayer intro;
    private boolean introductionDone;
    private final AudioManager manager;
    private MediaPlayer player;
    private final NativePrefs prefs;
    private boolean prepared;
    private MediaPlayer retiring;
    private String selected;

    public FieldAudio(Context context, NativePrefs prefs) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        this.context = context;
        this.prefs = prefs;
        Object systemService = context.getSystemService("audio");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        this.manager = (AudioManager) systemService;
        this.edition = "world";
        this.selected = "";
        this.handler = new Handler(Looper.getMainLooper());
    }

    /* renamed from: getTrackId, reason: from getter */
    public final String getSelected() {
        return this.selected;
    }

    public final boolean getPlaying() {
        Object m79constructorimpl;
        if (!this.prepared) {
            return false;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            FieldAudio fieldAudio = this;
            MediaPlayer mediaPlayer = this.player;
            m79constructorimpl = Result.m79constructorimpl(Boolean.valueOf(mediaPlayer != null && mediaPlayer.isPlaying()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m79constructorimpl = Result.m79constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m85isFailureimpl(m79constructorimpl)) {
            m79constructorimpl = false;
        }
        return ((Boolean) m79constructorimpl).booleanValue();
    }

    public final int getPosition() {
        Object m79constructorimpl;
        if (!this.prepared) {
            return 0;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            FieldAudio fieldAudio = this;
            MediaPlayer mediaPlayer = this.player;
            m79constructorimpl = Result.m79constructorimpl(Integer.valueOf(mediaPlayer != null ? mediaPlayer.getCurrentPosition() : 0));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m79constructorimpl = Result.m79constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m85isFailureimpl(m79constructorimpl)) {
            m79constructorimpl = 0;
        }
        return ((Number) m79constructorimpl).intValue();
    }

    public final int getDuration() {
        Object m79constructorimpl;
        if (!this.prepared) {
            return 0;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            FieldAudio fieldAudio = this;
            MediaPlayer mediaPlayer = this.player;
            m79constructorimpl = Result.m79constructorimpl(Integer.valueOf(mediaPlayer != null ? mediaPlayer.getDuration() : 0));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m79constructorimpl = Result.m79constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m85isFailureimpl(m79constructorimpl)) {
            m79constructorimpl = 0;
        }
        return ((Number) m79constructorimpl).intValue();
    }

    public final List<MusicTrack> tracks() {
        Object m79constructorimpl;
        Object m79constructorimpl2;
        Object m79constructorimpl3;
        List mutableListOf = CollectionsKt.mutableListOf(new MusicTrack("world", "Stars at Our Backs", "music/world.mp3", true), new MusicTrack("iceborne", "Nay! The Honor is All Ours", "music/iceborne.mp3", true));
        try {
            Result.Companion companion = Result.INSTANCE;
            FieldAudio fieldAudio = this;
            m79constructorimpl = Result.m79constructorimpl(new JSONArray(this.prefs.text("tracks", "[]")));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m79constructorimpl = Result.m79constructorimpl(ResultKt.createFailure(th));
        }
        JSONArray jSONArray = new JSONArray();
        if (Result.m85isFailureimpl(m79constructorimpl)) {
            m79constructorimpl = jSONArray;
        }
        JSONArray jSONArray2 = (JSONArray) m79constructorimpl;
        int length = jSONArray2.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject = jSONArray2.getJSONObject(i);
            String optString = jSONObject.optString("file");
            Intrinsics.checkNotNull(optString);
            if (new Regex("custom-[a-f0-9-]+\\.audio").matches(optString) && new File(this.context.getFilesDir(), "music/" + optString).exists()) {
                String string = jSONObject.getString("id");
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                String string2 = jSONObject.getString("title");
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                String path = new File(this.context.getFilesDir(), "music/" + optString).getPath();
                Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
                mutableListOf.add(new MusicTrack(string, string2, path, false));
            }
        }
        try {
            Result.Companion companion3 = Result.INSTANCE;
            FieldAudio fieldAudio2 = this;
            m79constructorimpl2 = Result.m79constructorimpl(new JSONArray(this.prefs.text("hiddenTracks", "[]")));
        } catch (Throwable th2) {
            Result.Companion companion4 = Result.INSTANCE;
            m79constructorimpl2 = Result.m79constructorimpl(ResultKt.createFailure(th2));
        }
        JSONArray jSONArray3 = new JSONArray();
        if (Result.m85isFailureimpl(m79constructorimpl2)) {
            m79constructorimpl2 = jSONArray3;
        }
        JSONArray jSONArray4 = (JSONArray) m79constructorimpl2;
        IntRange until = RangesKt.until(0, jSONArray4.length());
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(until, 10));
        Iterator<Integer> it = until.iterator();
        while (it.hasNext()) {
            arrayList.add(jSONArray4.getString(((IntIterator) it).nextInt()));
        }
        ArrayList arrayList2 = arrayList;
        try {
            Result.Companion companion5 = Result.INSTANCE;
            FieldAudio fieldAudio3 = this;
            m79constructorimpl3 = Result.m79constructorimpl(new JSONArray(this.prefs.text("trackOrder", "[]")));
        } catch (Throwable th3) {
            Result.Companion companion6 = Result.INSTANCE;
            m79constructorimpl3 = Result.m79constructorimpl(ResultKt.createFailure(th3));
        }
        JSONArray jSONArray5 = new JSONArray();
        if (Result.m85isFailureimpl(m79constructorimpl3)) {
            m79constructorimpl3 = jSONArray5;
        }
        JSONArray jSONArray6 = (JSONArray) m79constructorimpl3;
        IntRange until2 = RangesKt.until(0, jSONArray6.length());
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(until2, 10));
        Iterator<Integer> it2 = until2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(jSONArray6.getString(((IntIterator) it2).nextInt()));
        }
        final ArrayList arrayList4 = arrayList3;
        ArrayList arrayList5 = new ArrayList();
        for (Object obj : mutableListOf) {
            if (!arrayList2.contains(((MusicTrack) obj).getId())) {
                arrayList5.add(obj);
            }
        }
        return CollectionsKt.sortedWith(arrayList5, new Comparator() { // from class: com.lumina.monsterhunterfieldbook.FieldAudio$tracks$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int indexOf = arrayList4.indexOf(((MusicTrack) t).getId());
                if (indexOf < 0) {
                    indexOf = 10000;
                }
                Integer valueOf = Integer.valueOf(indexOf);
                int indexOf2 = arrayList4.indexOf(((MusicTrack) t2).getId());
                return ComparisonsKt.compareValues(valueOf, Integer.valueOf(indexOf2 >= 0 ? indexOf2 : 10000));
            }
        });
    }

    public final void formation() {
        Object m79constructorimpl;
        if (this.foreground && focus()) {
            try {
                Result.Companion companion = Result.INSTANCE;
                FieldAudio fieldAudio = this;
                MediaPlayer mediaPlayer = new MediaPlayer();
                mediaPlayer.setAudioAttributes(attributes());
                AssetFileDescriptor openFd = this.context.getAssets().openFd("music/formation.wav");
                try {
                    AssetFileDescriptor assetFileDescriptor = openFd;
                    mediaPlayer.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(openFd, null);
                    mediaPlayer.prepare();
                    mediaPlayer.setVolume(0.65f, 0.65f);
                    mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.lumina.monsterhunterfieldbook.FieldAudio$$ExternalSyntheticLambda0
                        @Override // android.media.MediaPlayer.OnCompletionListener
                        public final void onCompletion(MediaPlayer mediaPlayer2) {
                            FieldAudio.formation$lambda$0$0$1(FieldAudio.this, mediaPlayer2);
                        }
                    });
                    mediaPlayer.start();
                    m79constructorimpl = Result.m79constructorimpl(mediaPlayer);
                } finally {
                }
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m79constructorimpl = Result.m79constructorimpl(ResultKt.createFailure(th));
            }
            this.intro = (MediaPlayer) (Result.m85isFailureimpl(m79constructorimpl) ? null : m79constructorimpl);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void formation$lambda$0$0$1(FieldAudio fieldAudio, MediaPlayer mediaPlayer) {
        mediaPlayer.release();
        fieldAudio.intro = null;
    }

    private final AudioAttributes attributes() {
        return new AudioAttributes.Builder().setUsage(1).setContentType(2).build();
    }

    private final boolean focus() {
        if (this.focused) {
            return true;
        }
        boolean z = this.manager.requestAudioFocus(this, 3, 1) == 1;
        this.focused = z;
        return z;
    }

    public final void introductionFinished() {
        this.introductionDone = true;
        play(this.edition);
    }

    public final void play(String next) {
        Intrinsics.checkNotNullParameter(next, "next");
        this.edition = next;
        if (this.foreground && this.introductionDone) {
            Object obj = null;
            if (NativePrefs.flag$default(this.prefs, "musicEnabled", false, 2, null) && !this.prefs.flag("musicPaused", false)) {
                if (focus()) {
                    List<MusicTrack> tracks = tracks();
                    if (!NativePrefs.flag$default(this.prefs, "followTheme", false, 2, null)) {
                        NativePrefs nativePrefs = this.prefs;
                        String str = this.selected;
                        if (!StringsKt.isBlank(str)) {
                            next = str;
                        }
                        next = nativePrefs.text("musicTrack", next);
                    }
                    Iterator<T> it = tracks.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next2 = it.next();
                        if (Intrinsics.areEqual(((MusicTrack) next2).getId(), next)) {
                            obj = next2;
                            break;
                        }
                    }
                    MusicTrack musicTrack = (MusicTrack) obj;
                    if (musicTrack == null) {
                        musicTrack = (MusicTrack) CollectionsKt.firstOrNull((List) tracks);
                    }
                    if (musicTrack == null) {
                        pausePlayers();
                        return;
                    }
                    if (!Intrinsics.areEqual(this.selected, musicTrack.getId()) || this.player == null) {
                        choose(musicTrack.getId(), false);
                        return;
                    }
                    if (!this.prepared || getPlaying()) {
                        updateVolume();
                        return;
                    }
                    MediaPlayer mediaPlayer = this.player;
                    if (mediaPlayer != null) {
                        mediaPlayer.start();
                    }
                    crossfade();
                    return;
                }
                return;
            }
        }
        pausePlayers();
    }

    public final void select(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.prefs.set("followTheme", false);
        this.prefs.set("musicTrack", id);
        this.prefs.set("musicPaused", false);
        this.prefs.set("musicEnabled", true);
        choose(id, true);
    }

    private final void rememberPosition() {
        Object m79constructorimpl;
        if (!this.prepared || StringsKt.isBlank(this.selected)) {
            return;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            FieldAudio fieldAudio = this;
            m79constructorimpl = Result.m79constructorimpl(new JSONObject(this.prefs.text("musicPositions", "{}")));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m79constructorimpl = Result.m79constructorimpl(ResultKt.createFailure(th));
        }
        JSONObject jSONObject = new JSONObject();
        if (Result.m85isFailureimpl(m79constructorimpl)) {
            m79constructorimpl = jSONObject;
        }
        JSONObject jSONObject2 = (JSONObject) m79constructorimpl;
        jSONObject2.put(this.selected, getPosition());
        NativePrefs nativePrefs = this.prefs;
        String jSONObject3 = jSONObject2.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject3, "toString(...)");
        nativePrefs.set("musicPositions", jSONObject3);
    }

    private final void choose(final String id, boolean force) {
        Object obj;
        Object m79constructorimpl;
        Iterator<T> it = tracks().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (Intrinsics.areEqual(((MusicTrack) obj).getId(), id)) {
                    break;
                }
            }
        }
        MusicTrack musicTrack = (MusicTrack) obj;
        if (musicTrack == null) {
            return;
        }
        if (force || !Intrinsics.areEqual(id, this.selected) || this.player == null) {
            rememberPosition();
            ValueAnimator valueAnimator = this.fade;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            MediaPlayer mediaPlayer = this.retiring;
            if (mediaPlayer != null) {
                mediaPlayer.release();
            }
            this.retiring = this.player;
            this.player = null;
            this.prepared = false;
            this.selected = id;
            this.prefs.set("musicTrack", id);
            if (this.foreground && this.introductionDone && focus()) {
                MediaPlayer mediaPlayer2 = new MediaPlayer();
                this.player = mediaPlayer2;
                try {
                    Result.Companion companion = Result.INSTANCE;
                    FieldAudio fieldAudio = this;
                    mediaPlayer2.setAudioAttributes(attributes());
                    if (musicTrack.getBuiltin()) {
                        AssetFileDescriptor openFd = this.context.getAssets().openFd(musicTrack.getPath());
                        try {
                            AssetFileDescriptor assetFileDescriptor = openFd;
                            mediaPlayer2.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
                            Unit unit = Unit.INSTANCE;
                            CloseableKt.closeFinally(openFd, null);
                        } finally {
                        }
                    } else {
                        mediaPlayer2.setDataSource(musicTrack.getPath());
                    }
                    mediaPlayer2.setVolume(0.0f, 0.0f);
                    mediaPlayer2.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.lumina.monsterhunterfieldbook.FieldAudio$$ExternalSyntheticLambda1
                        @Override // android.media.MediaPlayer.OnPreparedListener
                        public final void onPrepared(MediaPlayer mediaPlayer3) {
                            FieldAudio.choose$lambda$1$1(FieldAudio.this, id, mediaPlayer3);
                        }
                    });
                    mediaPlayer2.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.lumina.monsterhunterfieldbook.FieldAudio$$ExternalSyntheticLambda2
                        @Override // android.media.MediaPlayer.OnCompletionListener
                        public final void onCompletion(MediaPlayer mediaPlayer3) {
                            FieldAudio.this.advance(1);
                        }
                    });
                    mediaPlayer2.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: com.lumina.monsterhunterfieldbook.FieldAudio$$ExternalSyntheticLambda3
                        @Override // android.media.MediaPlayer.OnErrorListener
                        public final boolean onError(MediaPlayer mediaPlayer3, int i, int i2) {
                            boolean choose$lambda$1$3;
                            choose$lambda$1$3 = FieldAudio.choose$lambda$1$3(FieldAudio.this, mediaPlayer3, i, i2);
                            return choose$lambda$1$3;
                        }
                    });
                    mediaPlayer2.prepareAsync();
                    m79constructorimpl = Result.m79constructorimpl(Unit.INSTANCE);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    m79constructorimpl = Result.m79constructorimpl(ResultKt.createFailure(th));
                }
                if (Result.m82exceptionOrNullimpl(m79constructorimpl) != null) {
                    if (this.player == mediaPlayer2) {
                        this.prepared = false;
                        this.player = null;
                    }
                    mediaPlayer2.release();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void choose$lambda$1$1(FieldAudio fieldAudio, String str, MediaPlayer mediaPlayer) {
        Object m79constructorimpl;
        if (fieldAudio.player != mediaPlayer) {
            return;
        }
        fieldAudio.prepared = true;
        mediaPlayer.setLooping(Intrinsics.areEqual(fieldAudio.prefs.text("musicMode", "library"), "one"));
        if (NativePrefs.flag$default(fieldAudio.prefs, "rememberMusicPosition", false, 2, null)) {
            try {
                Result.Companion companion = Result.INSTANCE;
                m79constructorimpl = Result.m79constructorimpl(new JSONObject(fieldAudio.prefs.text("musicPositions", "{}")));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m79constructorimpl = Result.m79constructorimpl(ResultKt.createFailure(th));
            }
            JSONObject jSONObject = new JSONObject();
            if (Result.m85isFailureimpl(m79constructorimpl)) {
                m79constructorimpl = jSONObject;
            }
            int optInt = ((JSONObject) m79constructorimpl).optInt(str, 0);
            if (1 <= optInt && optInt < mediaPlayer.getDuration()) {
                mediaPlayer.seekTo(optInt);
            }
        }
        if (fieldAudio.foreground && fieldAudio.introductionDone && NativePrefs.flag$default(fieldAudio.prefs, "musicEnabled", false, 2, null) && !fieldAudio.prefs.flag("musicPaused", false)) {
            mediaPlayer.start();
            fieldAudio.crossfade();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean choose$lambda$1$3(FieldAudio fieldAudio, MediaPlayer mediaPlayer, int i, int i2) {
        if (fieldAudio.player == mediaPlayer) {
            fieldAudio.prepared = false;
            fieldAudio.player = null;
        }
        mediaPlayer.release();
        return true;
    }

    private final void crossfade() {
        ValueAnimator valueAnimator = this.fade;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        final float coerceIn = RangesKt.coerceIn(this.prefs.number("volume", 25), 0, 100) / 100.0f;
        final ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(1200L);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.lumina.monsterhunterfieldbook.FieldAudio$$ExternalSyntheticLambda5
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                FieldAudio.crossfade$lambda$0$0(ofFloat, this, coerceIn, valueAnimator2);
            }
        });
        ofFloat.start();
        this.fade = ofFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void crossfade$lambda$0$0(ValueAnimator valueAnimator, FieldAudio fieldAudio, float f, ValueAnimator it) {
        Unit unit;
        Intrinsics.checkNotNullParameter(it, "it");
        Object animatedValue = it.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((Float) animatedValue).floatValue();
        try {
            Result.Companion companion = Result.INSTANCE;
            MediaPlayer mediaPlayer = fieldAudio.player;
            if (mediaPlayer != null) {
                float f2 = f * floatValue;
                mediaPlayer.setVolume(f2, f2);
            }
            MediaPlayer mediaPlayer2 = fieldAudio.retiring;
            if (mediaPlayer2 != null) {
                float f3 = f * (1 - floatValue);
                mediaPlayer2.setVolume(f3, f3);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            Result.m79constructorimpl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m79constructorimpl(ResultKt.createFailure(th));
        }
        if (floatValue >= 1.0f) {
            MediaPlayer mediaPlayer3 = fieldAudio.retiring;
            if (mediaPlayer3 != null) {
                mediaPlayer3.release();
            }
            fieldAudio.retiring = null;
        }
    }

    public final void toggle() {
        boolean flag = this.prefs.flag("musicPaused", false);
        this.prefs.set("musicPaused", Boolean.valueOf(!flag));
        if (!flag) {
            pausePlayers();
        } else {
            this.prefs.set("musicEnabled", true);
            play(this.edition);
        }
    }

    public final void seek(int milliseconds) {
        if (this.prepared) {
            try {
                Result.Companion companion = Result.INSTANCE;
                FieldAudio fieldAudio = this;
                MediaPlayer mediaPlayer = this.player;
                if (mediaPlayer != null) {
                    mediaPlayer.seekTo(RangesKt.coerceIn(milliseconds, 0, getDuration()));
                }
                rememberPosition();
                Result.m79constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m79constructorimpl(ResultKt.createFailure(th));
            }
        }
    }

    public final void advance(int delta) {
        int size;
        List<MusicTrack> tracks = tracks();
        if (tracks.isEmpty()) {
            return;
        }
        if (delta < 0 && getPosition() > 3000) {
            seek(0);
            return;
        }
        Iterator<MusicTrack> it = tracks.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (Intrinsics.areEqual(it.next().getId(), this.selected)) {
                break;
            } else {
                i++;
            }
        }
        int coerceAtLeast = RangesKt.coerceAtLeast(i, 0);
        if (!Intrinsics.areEqual(this.prefs.text("musicMode", "library"), "shuffle") || tracks.size() <= 1) {
            size = ((coerceAtLeast + delta) + tracks.size()) % tracks.size();
        } else {
            IntRange indices = CollectionsKt.getIndices(tracks);
            ArrayList arrayList = new ArrayList();
            for (Integer num : indices) {
                if (num.intValue() != coerceAtLeast) {
                    arrayList.add(num);
                }
            }
            size = ((Number) CollectionsKt.random(arrayList, Random.INSTANCE)).intValue();
        }
        this.prefs.set("followTheme", false);
        this.prefs.set("musicPaused", false);
        choose(tracks.get(size).getId(), true);
    }

    public final void move(String id, int delta) {
        Intrinsics.checkNotNullParameter(id, "id");
        List<MusicTrack> tracks = tracks();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(tracks, 10));
        Iterator<T> it = tracks.iterator();
        while (it.hasNext()) {
            arrayList.add(((MusicTrack) it.next()).getId());
        }
        List mutableList = CollectionsKt.toMutableList((Collection) arrayList);
        int indexOf = mutableList.indexOf(id);
        if (indexOf < 0) {
            return;
        }
        mutableList.add(RangesKt.coerceIn(delta + indexOf, 0, CollectionsKt.getLastIndex(mutableList)), mutableList.remove(indexOf));
        NativePrefs nativePrefs = this.prefs;
        String jSONArray = new JSONArray((Collection) mutableList).toString();
        Intrinsics.checkNotNullExpressionValue(jSONArray, "toString(...)");
        nativePrefs.set("trackOrder", jSONArray);
    }

    public final void remove(String id) {
        Object obj;
        Intrinsics.checkNotNullParameter(id, "id");
        Iterator<T> it = tracks().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (Intrinsics.areEqual(((MusicTrack) obj).getId(), id)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        MusicTrack musicTrack = (MusicTrack) obj;
        if (musicTrack == null) {
            return;
        }
        if (musicTrack.getBuiltin()) {
            JSONArray jSONArray = new JSONArray(this.prefs.text("hiddenTracks", "[]"));
            jSONArray.put(id);
            NativePrefs nativePrefs = this.prefs;
            String jSONArray2 = jSONArray.toString();
            Intrinsics.checkNotNullExpressionValue(jSONArray2, "toString(...)");
            nativePrefs.set("hiddenTracks", jSONArray2);
        } else {
            JSONArray jSONArray3 = new JSONArray(this.prefs.text("tracks", "[]"));
            JSONArray jSONArray4 = new JSONArray();
            int length = jSONArray3.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = jSONArray3.getJSONObject(i);
                if (!Intrinsics.areEqual(jSONObject.optString("id"), id)) {
                    jSONArray4.put(jSONObject);
                }
            }
            NativePrefs nativePrefs2 = this.prefs;
            String jSONArray5 = jSONArray4.toString();
            Intrinsics.checkNotNullExpressionValue(jSONArray5, "toString(...)");
            nativePrefs2.set("tracks", jSONArray5);
            new File(musicTrack.getPath()).delete();
        }
        if (Intrinsics.areEqual(this.selected, id)) {
            MediaPlayer mediaPlayer = this.player;
            if (mediaPlayer != null) {
                mediaPlayer.release();
            }
            this.player = null;
            this.prepared = false;
            this.selected = "";
            play(this.edition);
        }
    }

    public final void restoreBuiltins() {
        this.prefs.set("hiddenTracks", "[]");
        play(this.edition);
    }

    public final void updateVolume() {
        float coerceIn = RangesKt.coerceIn(this.prefs.number("volume", 25), 0, 100) / 100.0f;
        if (this.prepared) {
            try {
                Result.Companion companion = Result.INSTANCE;
                FieldAudio fieldAudio = this;
                MediaPlayer mediaPlayer = this.player;
                if (mediaPlayer != null) {
                    mediaPlayer.setVolume(coerceIn, coerceIn);
                }
                MediaPlayer mediaPlayer2 = this.player;
                if (mediaPlayer2 != null) {
                    mediaPlayer2.setLooping(Intrinsics.areEqual(this.prefs.text("musicMode", "library"), "one"));
                }
                Result.m79constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m79constructorimpl(ResultKt.createFailure(th));
            }
        }
    }

    private final void pausePlayers() {
        Unit unit;
        MediaPlayer mediaPlayer;
        rememberPosition();
        ValueAnimator valueAnimator = this.fade;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            FieldAudio fieldAudio = this;
            if (this.prepared && (mediaPlayer = this.player) != null) {
                mediaPlayer.pause();
            }
            Result.m79constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m79constructorimpl(ResultKt.createFailure(th));
        }
        Unit unit2 = null;
        try {
            Result.Companion companion3 = Result.INSTANCE;
            FieldAudio fieldAudio2 = this;
            MediaPlayer mediaPlayer2 = this.retiring;
            if (mediaPlayer2 != null) {
                mediaPlayer2.release();
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            Result.m79constructorimpl(unit);
        } catch (Throwable th2) {
            Result.Companion companion4 = Result.INSTANCE;
            Result.m79constructorimpl(ResultKt.createFailure(th2));
        }
        this.retiring = null;
        try {
            Result.Companion companion5 = Result.INSTANCE;
            FieldAudio fieldAudio3 = this;
            MediaPlayer mediaPlayer3 = this.intro;
            if (mediaPlayer3 != null) {
                mediaPlayer3.pause();
                unit2 = Unit.INSTANCE;
            }
            Result.m79constructorimpl(unit2);
        } catch (Throwable th3) {
            Result.Companion companion6 = Result.INSTANCE;
            Result.m79constructorimpl(ResultKt.createFailure(th3));
        }
    }

    public final void resume() {
        Unit unit;
        this.foreground = true;
        if (this.introductionDone) {
            play(this.edition);
            return;
        }
        if (this.intro == null || !focus()) {
            return;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            FieldAudio fieldAudio = this;
            MediaPlayer mediaPlayer = this.intro;
            if (mediaPlayer != null) {
                mediaPlayer.start();
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            Result.m79constructorimpl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m79constructorimpl(ResultKt.createFailure(th));
        }
    }

    public final void pause() {
        this.foreground = false;
        pausePlayers();
        this.manager.abandonAudioFocus(this);
        this.focused = false;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public void onAudioFocusChange(final int change) {
        this.handler.post(new Runnable() { // from class: com.lumina.monsterhunterfieldbook.FieldAudio$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                FieldAudio.onAudioFocusChange$lambda$0(change, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAudioFocusChange$lambda$0(int i, FieldAudio fieldAudio) {
        MediaPlayer mediaPlayer;
        Object m79constructorimpl;
        Unit unit;
        if (i == -3) {
            try {
                Result.Companion companion = Result.INSTANCE;
                if (fieldAudio.prepared && (mediaPlayer = fieldAudio.player) != null) {
                    mediaPlayer.setVolume(0.04f, 0.04f);
                }
                Result.m79constructorimpl(Unit.INSTANCE);
                return;
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m79constructorimpl(ResultKt.createFailure(th));
                return;
            }
        }
        if (i == -2 || i == -1) {
            fieldAudio.focused = false;
            fieldAudio.pausePlayers();
            return;
        }
        if (i != 1) {
            return;
        }
        fieldAudio.focused = true;
        if (fieldAudio.foreground) {
            if (fieldAudio.introductionDone) {
                fieldAudio.play(fieldAudio.edition);
                return;
            }
            try {
                Result.Companion companion3 = Result.INSTANCE;
                MediaPlayer mediaPlayer2 = fieldAudio.intro;
                if (mediaPlayer2 != null) {
                    mediaPlayer2.start();
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
                m79constructorimpl = Result.m79constructorimpl(unit);
            } catch (Throwable th2) {
                Result.Companion companion4 = Result.INSTANCE;
                m79constructorimpl = Result.m79constructorimpl(ResultKt.createFailure(th2));
            }
            Result.m78boximpl(m79constructorimpl);
        }
    }

    public final void release() {
        pause();
        MediaPlayer mediaPlayer = this.intro;
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
        MediaPlayer mediaPlayer2 = this.player;
        if (mediaPlayer2 != null) {
            mediaPlayer2.release();
        }
        this.intro = null;
        this.player = null;
        this.handler.removeCallbacksAndMessages(null);
    }
}
