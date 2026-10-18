package com.lumina.monsterhunterfieldbook;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.json.JSONObject;

/* compiled from: MapPanel.kt */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010+\u001a\u00020\u001aJ\u000e\u0010,\u001a\u00020\u001a2\u0006\u0010-\u001a\u00020 J\u000e\u0010.\u001a\n 0*\u0004\u0018\u00010/0/J\u000e\u00101\u001a\u00020\u001a2\u0006\u00102\u001a\u00020/J(\u00103\u001a\u00020\u001a2\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u0002052\u0006\u00107\u001a\u0002052\u0006\u00108\u001a\u000205H\u0014J\b\u00109\u001a\u00020\u001aH\u0002J\u0010\u0010:\u001a\u00020\u001a2\u0006\u0010;\u001a\u00020<H\u0014J\u0010\u0010=\u001a\u00020\u00102\u0006\u0010>\u001a\u00020?H\u0016J\b\u0010@\u001a\u00020\u0010H\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\"\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u000e\u0010\u001f\u001a\u00020 X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020 X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020 X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020 X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020 X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020(X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020*X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006A"}, d2 = {"Lcom/lumina/monsterhunterfieldbook/ZoomMapView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "base", "Landroid/graphics/Bitmap;", "getBase", "()Landroid/graphics/Bitmap;", "setBase", "(Landroid/graphics/Bitmap;)V", "overlay", "getOverlay", "setOverlay", "showBase", "", "getShowBase", "()Z", "setShowBase", "(Z)V", "showOverlay", "getShowOverlay", "setShowOverlay", "onChange", "Lkotlin/Function0;", "", "getOnChange", "()Lkotlin/jvm/functions/Function0;", "setOnChange", "(Lkotlin/jvm/functions/Function0;)V", "scale", "", "x", "y", "lastX", "lastY", "paint", "Landroid/graphics/Paint;", "pinch", "Landroid/view/ScaleGestureDetector;", "gestures", "Landroid/view/GestureDetector;", "reset", "zoom", "factor", "snapshot", "Lorg/json/JSONObject;", "kotlin.jvm.PlatformType", "restore", "saved", "onSizeChanged", "w", "", "h", "oldw", "oldh", "clamp", "onDraw", "c", "Landroid/graphics/Canvas;", "onTouchEvent", "e", "Landroid/view/MotionEvent;", "performClick", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ZoomMapView extends View {
    private Bitmap base;
    private final GestureDetector gestures;
    private float lastX;
    private float lastY;
    private Function0<Unit> onChange;
    private Bitmap overlay;
    private final Paint paint;
    private final ScaleGestureDetector pinch;
    private float scale;
    private boolean showBase;
    private boolean showOverlay;
    private float x;
    private float y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZoomMapView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.showBase = true;
        this.showOverlay = true;
        this.scale = 1.0f;
        this.paint = new Paint(3);
        this.pinch = new ScaleGestureDetector(context, new ScaleGestureDetector.SimpleOnScaleGestureListener() { // from class: com.lumina.monsterhunterfieldbook.ZoomMapView$pinch$1
            @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
            public boolean onScale(ScaleGestureDetector d) {
                float f;
                float f2;
                float f3;
                float f4;
                float f5;
                float f6;
                Intrinsics.checkNotNullParameter(d, "d");
                f = ZoomMapView.this.scale;
                ZoomMapView zoomMapView = ZoomMapView.this;
                f2 = zoomMapView.scale;
                zoomMapView.scale = RangesKt.coerceIn(f2 * d.getScaleFactor(), 1.0f, 8.0f);
                ZoomMapView zoomMapView2 = ZoomMapView.this;
                f3 = zoomMapView2.x;
                float focusX = f3 - (d.getFocusX() - (ZoomMapView.this.getWidth() / 2.0f));
                f4 = ZoomMapView.this.scale;
                zoomMapView2.x = (focusX * (f4 / f)) + (d.getFocusX() - (ZoomMapView.this.getWidth() / 2.0f));
                ZoomMapView zoomMapView3 = ZoomMapView.this;
                f5 = zoomMapView3.y;
                float focusY = f5 - (d.getFocusY() - (ZoomMapView.this.getHeight() / 2.0f));
                f6 = ZoomMapView.this.scale;
                zoomMapView3.y = (focusY * (f6 / f)) + (d.getFocusY() - (ZoomMapView.this.getHeight() / 2.0f));
                ZoomMapView.this.clamp();
                ZoomMapView.this.invalidate();
                return true;
            }
        });
        this.gestures = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener() { // from class: com.lumina.monsterhunterfieldbook.ZoomMapView$gestures$1
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onDown(MotionEvent e) {
                Intrinsics.checkNotNullParameter(e, "e");
                return true;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public boolean onDoubleTap(MotionEvent e) {
                float f;
                Intrinsics.checkNotNullParameter(e, "e");
                f = ZoomMapView.this.scale;
                if (f > 1.1f) {
                    ZoomMapView.this.reset();
                    return true;
                }
                ZoomMapView.this.zoom(2.0f);
                return true;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onSingleTapUp(MotionEvent e) {
                Intrinsics.checkNotNullParameter(e, "e");
                ZoomMapView.this.performClick();
                return true;
            }
        });
        setFocusable(true);
        setClickable(true);
        setBackgroundColor(Color.rgb(15, 20, 24));
    }

    public final Bitmap getBase() {
        return this.base;
    }

    public final void setBase(Bitmap bitmap) {
        this.base = bitmap;
    }

    @Override // android.view.View
    public final Bitmap getOverlay() {
        return this.overlay;
    }

    public final void setOverlay(Bitmap bitmap) {
        this.overlay = bitmap;
    }

    public final boolean getShowBase() {
        return this.showBase;
    }

    public final void setShowBase(boolean z) {
        this.showBase = z;
    }

    public final boolean getShowOverlay() {
        return this.showOverlay;
    }

    public final void setShowOverlay(boolean z) {
        this.showOverlay = z;
    }

    public final Function0<Unit> getOnChange() {
        return this.onChange;
    }

    public final void setOnChange(Function0<Unit> function0) {
        this.onChange = function0;
    }

    public final void reset() {
        this.scale = 1.0f;
        this.x = 0.0f;
        this.y = 0.0f;
        invalidate();
    }

    public final void zoom(float factor) {
        this.scale = RangesKt.coerceIn(this.scale * factor, 1.0f, 8.0f);
        clamp();
        invalidate();
        Function0<Unit> function0 = this.onChange;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final JSONObject snapshot() {
        return new JSONObject().put("scale", Float.valueOf(this.scale)).put("x", Float.valueOf(getWidth() > 0 ? this.x / getWidth() : 0.0f)).put("y", Float.valueOf(getHeight() > 0 ? this.y / getHeight() : 0.0f)).put("base", this.showBase).put("overlay", this.showOverlay);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void restore$lambda$0(ZoomMapView zoomMapView, JSONObject jSONObject) {
        zoomMapView.x = ((float) jSONObject.optDouble("x", 0.0d)) * zoomMapView.getWidth();
        zoomMapView.y = ((float) jSONObject.optDouble("y", 0.0d)) * zoomMapView.getHeight();
        zoomMapView.clamp();
        zoomMapView.invalidate();
    }

    public final void restore(final JSONObject saved) {
        Intrinsics.checkNotNullParameter(saved, "saved");
        this.scale = RangesKt.coerceIn((float) saved.optDouble("scale", 1.0d), 1.0f, 8.0f);
        this.showBase = saved.optBoolean("base", true);
        this.showOverlay = saved.optBoolean("overlay", true);
        post(new Runnable() { // from class: com.lumina.monsterhunterfieldbook.ZoomMapView$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                ZoomMapView.restore$lambda$0(ZoomMapView.this, saved);
            }
        });
    }

    @Override // android.view.View
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        if (oldw > 0) {
            this.x = (this.x / oldw) * w;
        }
        if (oldh > 0) {
            this.y = (this.y / oldh) * h;
        }
        clamp();
        super.onSizeChanged(w, h, oldw, oldh);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clamp() {
        float f = 1;
        this.x = RangesKt.coerceIn(this.x, ((-getWidth()) * (this.scale - f)) / 2.0f, (getWidth() * (this.scale - f)) / 2.0f);
        this.y = RangesKt.coerceIn(this.y, ((-getHeight()) * (this.scale - f)) / 2.0f, (getHeight() * (this.scale - f)) / 2.0f);
    }

    @Override // android.view.View
    protected void onDraw(Canvas c) {
        Intrinsics.checkNotNullParameter(c, "c");
        super.onDraw(c);
        c.save();
        c.translate((getWidth() / 2.0f) + this.x, (getHeight() / 2.0f) + this.y);
        float f = this.scale;
        c.scale(f, f);
        if (this.showBase) {
            onDraw$draw(this, c, this.base);
        }
        if (this.showOverlay) {
            onDraw$draw(this, c, this.overlay);
        }
        c.restore();
    }

    private static final void onDraw$draw(ZoomMapView zoomMapView, Canvas canvas, Bitmap bitmap) {
        if (bitmap == null) {
            return;
        }
        float min = Math.min(zoomMapView.getWidth() / bitmap.getWidth(), zoomMapView.getHeight() / bitmap.getHeight());
        float width = bitmap.getWidth() * min;
        float height = bitmap.getHeight() * min;
        float f = 2;
        canvas.drawBitmap(bitmap, (Rect) null, new RectF((-width) / f, (-height) / f, width / f, height / f), zoomMapView.paint);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent e) {
        Intrinsics.checkNotNullParameter(e, "e");
        this.pinch.onTouchEvent(e);
        this.gestures.onTouchEvent(e);
        int actionMasked = e.getActionMasked();
        if (actionMasked == 0) {
            this.lastX = e.getX();
            this.lastY = e.getY();
            getParent().requestDisallowInterceptTouchEvent(true);
        } else {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (!this.pinch.isInProgress() && e.getPointerCount() == 1) {
                        this.x += e.getX() - this.lastX;
                        this.y += e.getY() - this.lastY;
                        clamp();
                        invalidate();
                    }
                    this.lastX = e.getX();
                    this.lastY = e.getY();
                } else if (actionMasked != 3) {
                    if (actionMasked == 6) {
                        int i = e.getActionIndex() == 0 ? 1 : 0;
                        this.lastX = e.getX(i);
                        this.lastY = e.getY(i);
                    }
                }
            }
            getParent().requestDisallowInterceptTouchEvent(false);
            Function0<Unit> function0 = this.onChange;
            if (function0 != null) {
                function0.invoke();
            }
        }
        return true;
    }

    @Override // android.view.View
    public boolean performClick() {
        return super.performClick();
    }
}
