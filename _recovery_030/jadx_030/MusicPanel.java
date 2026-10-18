package com.lumina.monsterhunterfieldbook;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: MusicPanel.kt */
@Metadata(d1 = {"\u0000I\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0012\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u0019H\u0002J\b\u0010\u001b\u001a\u00020\u0019H\u0014J\b\u0010\u001c\u001a\u00020\u0019H\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0013¨\u0006\u001d"}, d2 = {"Lcom/lumina/monsterhunterfieldbook/MusicPanel;", "Landroid/widget/LinearLayout;", "a", "Lcom/lumina/monsterhunterfieldbook/MainActivity;", "<init>", "(Lcom/lumina/monsterhunterfieldbook/MainActivity;)V", "name", "Landroid/widget/TextView;", "time", "seek", "Landroid/widget/SeekBar;", "play", "queue", "handler", "Landroid/os/Handler;", "dragging", "", "ticker", "com/lumina/monsterhunterfieldbook/MusicPanel$ticker$1", "Lcom/lumina/monsterhunterfieldbook/MusicPanel$ticker$1;", "stamp", "", "ms", "", "update", "", "rebuildQueue", "onAttachedToWindow", "onDetachedFromWindow", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MusicPanel extends LinearLayout {
    private final MainActivity a;
    private boolean dragging;
    private final Handler handler;
    private final TextView name;
    private final TextView play;
    private final LinearLayout queue;
    private final SeekBar seek;
    private final MusicPanel$ticker$1 ticker;
    private final TextView time;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r5v3, types: [com.lumina.monsterhunterfieldbook.MusicPanel$ticker$1] */
    public MusicPanel(MainActivity a) {
        super(a);
        Intrinsics.checkNotNullParameter(a, "a");
        this.a = a;
        TextView text$default = MainActivity.text$default(a, "", 16.0f, true, 0, 8, null);
        this.name = text$default;
        TextView text$default2 = MainActivity.text$default(a, "", 12.0f, false, a.getMuted(), 4, null);
        this.time = text$default2;
        SeekBar seekBar = new SeekBar(a);
        this.seek = seekBar;
        TextView button = a.button("Play / pause", new Function0() { // from class: com.lumina.monsterhunterfieldbook.MusicPanel$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit play$lambda$0;
                play$lambda$0 = MusicPanel.play$lambda$0(MusicPanel.this);
                return play$lambda$0;
            }
        });
        this.play = button;
        LinearLayout column = a.column();
        this.queue = column;
        this.handler = new Handler(Looper.getMainLooper());
        this.ticker = new Runnable() { // from class: com.lumina.monsterhunterfieldbook.MusicPanel$ticker$1
            @Override // java.lang.Runnable
            public void run() {
                Handler handler;
                if (MusicPanel.this.isShown()) {
                    MusicPanel.this.update();
                }
                if (MusicPanel.this.isAttachedToWindow()) {
                    handler = MusicPanel.this.handler;
                    handler.postDelayed(this, 700L);
                }
            }
        };
        setOrientation(1);
        addView(text$default);
        addView(text$default2);
        MusicPanel musicPanel = this;
        a.gap(musicPanel, 6);
        seekBar.setContentDescription("Music playback position");
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: com.lumina.monsterhunterfieldbook.MusicPanel.1
            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStartTrackingTouch(SeekBar bar) {
                Intrinsics.checkNotNullParameter(bar, "bar");
                MusicPanel.this.dragging = true;
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onProgressChanged(SeekBar bar, int value, boolean user) {
                Intrinsics.checkNotNullParameter(bar, "bar");
                if (user) {
                    TextView textView = MusicPanel.this.time;
                    String stamp = MusicPanel.this.stamp(value);
                    MusicPanel musicPanel2 = MusicPanel.this;
                    textView.setText(stamp + " / " + musicPanel2.stamp(musicPanel2.a.getMusic().getDuration()));
                }
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStopTrackingTouch(SeekBar bar) {
                Intrinsics.checkNotNullParameter(bar, "bar");
                MusicPanel.this.dragging = false;
                MusicPanel.this.a.getMusic().seek(bar.getProgress());
            }
        });
        addView(seekBar, new LinearLayout.LayoutParams(-1, a.dp((Number) 44)));
        LinearLayout row = a.row();
        row.addView(a.button("Previous", new Function0() { // from class: com.lumina.monsterhunterfieldbook.MusicPanel$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit _init_$lambda$0;
                _init_$lambda$0 = MusicPanel._init_$lambda$0(MusicPanel.this);
                return _init_$lambda$0;
            }
        }), new LinearLayout.LayoutParams(0, -2, 1.0f));
        row.addView(button, new LinearLayout.LayoutParams(0, -2, 1.0f));
        row.addView(a.button("Next", new Function0() { // from class: com.lumina.monsterhunterfieldbook.MusicPanel$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit _init_$lambda$1;
                _init_$lambda$1 = MusicPanel._init_$lambda$1(MusicPanel.this);
                return _init_$lambda$1;
            }
        }), new LinearLayout.LayoutParams(0, -2, 1.0f));
        addView(row);
        MainActivity.gap$default(a, musicPanel, 0, 2, null);
        addView(a.button("Import audio file", new Function0() { // from class: com.lumina.monsterhunterfieldbook.MusicPanel$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit _init_$lambda$2;
                _init_$lambda$2 = MusicPanel._init_$lambda$2(MusicPanel.this);
                return _init_$lambda$2;
            }
        }), new LinearLayout.LayoutParams(-1, -2));
        MainActivity.gap$default(a, musicPanel, 0, 2, null);
        addView(column);
        rebuildQueue();
        update();
        addView(a.button("Restore bundled tracks", new Function0() { // from class: com.lumina.monsterhunterfieldbook.MusicPanel$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit _init_$lambda$3;
                _init_$lambda$3 = MusicPanel._init_$lambda$3(MusicPanel.this);
                return _init_$lambda$3;
            }
        }), new LinearLayout.LayoutParams(-1, -2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit play$lambda$0(MusicPanel musicPanel) {
        musicPanel.a.getMusic().toggle();
        musicPanel.update();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$0(MusicPanel musicPanel) {
        musicPanel.a.getMusic().advance(-1);
        musicPanel.update();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$1(MusicPanel musicPanel) {
        musicPanel.a.getMusic().advance(1);
        musicPanel.update();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$2(MusicPanel musicPanel) {
        Object m79constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            musicPanel.a.startActivityForResult(new Intent("android.intent.action.OPEN_DOCUMENT").addCategory("android.intent.category.OPENABLE").setType("audio/*"), 703);
            m79constructorimpl = Result.m79constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m79constructorimpl = Result.m79constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m82exceptionOrNullimpl(m79constructorimpl) != null) {
            musicPanel.a.toast("No file picker is available.");
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$3(MusicPanel musicPanel) {
        musicPanel.a.getMusic().restoreBuiltins();
        musicPanel.rebuildQueue();
        musicPanel.update();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String stamp(int ms) {
        String format = String.format("%d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(ms / 60000), Integer.valueOf((ms / 1000) % 60)}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void update() {
        Object obj;
        String str;
        Iterator<T> it = this.a.getMusic().tracks().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (Intrinsics.areEqual(((MusicTrack) obj).getId(), this.a.getMusic().getSelected())) {
                    break;
                }
            }
        }
        MusicTrack musicTrack = (MusicTrack) obj;
        TextView textView = this.name;
        if (musicTrack == null || (str = musicTrack.getTitle()) == null) {
            str = "Choose a track";
        }
        textView.setText(str);
        this.play.setText(this.a.getMusic().getPlaying() ? "Pause" : "Play");
        if (this.dragging) {
            return;
        }
        this.seek.setMax(RangesKt.coerceAtLeast(this.a.getMusic().getDuration(), 1));
        this.seek.setProgress(this.a.getMusic().getPosition());
        this.time.setText(stamp(this.a.getMusic().getPosition()) + " / " + stamp(this.a.getMusic().getDuration()));
    }

    private final void rebuildQueue() {
        this.queue.removeAllViews();
        for (final MusicTrack musicTrack : this.a.getMusic().tracks()) {
            TextView button = this.a.button(musicTrack.getTitle(), new Function0() { // from class: com.lumina.monsterhunterfieldbook.MusicPanel$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit rebuildQueue$lambda$0$0;
                    rebuildQueue$lambda$0$0 = MusicPanel.rebuildQueue$lambda$0$0(MusicPanel.this, musicTrack);
                    return rebuildQueue$lambda$0$0;
                }
            });
            button.setGravity(8388627);
            this.queue.addView(button, new LinearLayout.LayoutParams(-1, -2));
            LinearLayout row = this.a.row();
            row.addView(this.a.button("Move up", new Function0() { // from class: com.lumina.monsterhunterfieldbook.MusicPanel$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit rebuildQueue$lambda$0$1;
                    rebuildQueue$lambda$0$1 = MusicPanel.rebuildQueue$lambda$0$1(MusicPanel.this, musicTrack);
                    return rebuildQueue$lambda$0$1;
                }
            }), new LinearLayout.LayoutParams(0, -2, 1.0f));
            row.addView(this.a.button("Move down", new Function0() { // from class: com.lumina.monsterhunterfieldbook.MusicPanel$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit rebuildQueue$lambda$0$2;
                    rebuildQueue$lambda$0$2 = MusicPanel.rebuildQueue$lambda$0$2(MusicPanel.this, musicTrack);
                    return rebuildQueue$lambda$0$2;
                }
            }), new LinearLayout.LayoutParams(0, -2, 1.0f));
            row.addView(this.a.button(musicTrack.getBuiltin() ? "Hide" : "Remove", new Function0() { // from class: com.lumina.monsterhunterfieldbook.MusicPanel$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit rebuildQueue$lambda$0$3;
                    rebuildQueue$lambda$0$3 = MusicPanel.rebuildQueue$lambda$0$3(MusicPanel.this, musicTrack);
                    return rebuildQueue$lambda$0$3;
                }
            }), new LinearLayout.LayoutParams(0, -2, 1.0f));
            this.queue.addView(row);
            this.a.gap(this.queue, 10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit rebuildQueue$lambda$0$0(MusicPanel musicPanel, MusicTrack musicTrack) {
        musicPanel.a.getMusic().select(musicTrack.getId());
        musicPanel.update();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit rebuildQueue$lambda$0$1(MusicPanel musicPanel, MusicTrack musicTrack) {
        musicPanel.a.getMusic().move(musicTrack.getId(), -1);
        musicPanel.rebuildQueue();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit rebuildQueue$lambda$0$2(MusicPanel musicPanel, MusicTrack musicTrack) {
        musicPanel.a.getMusic().move(musicTrack.getId(), 1);
        musicPanel.rebuildQueue();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit rebuildQueue$lambda$0$3(final MusicPanel musicPanel, final MusicTrack musicTrack) {
        new AlertDialog.Builder(musicPanel.a).setTitle(musicTrack.getBuiltin() ? "Hide bundled track?" : "Remove imported audio?").setMessage(musicTrack.getTitle()).setNegativeButton("Keep", (DialogInterface.OnClickListener) null).setPositiveButton("Remove", new DialogInterface.OnClickListener() { // from class: com.lumina.monsterhunterfieldbook.MusicPanel$$ExternalSyntheticLambda0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                MusicPanel.rebuildQueue$lambda$0$3$0(MusicPanel.this, musicTrack, dialogInterface, i);
            }
        }).show();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void rebuildQueue$lambda$0$3$0(MusicPanel musicPanel, MusicTrack musicTrack, DialogInterface dialogInterface, int i) {
        musicPanel.a.getMusic().remove(musicTrack.getId());
        musicPanel.rebuildQueue();
        musicPanel.update();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.handler.post(this.ticker);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.handler.removeCallbacksAndMessages(null);
        super.onDetachedFromWindow();
    }
}
