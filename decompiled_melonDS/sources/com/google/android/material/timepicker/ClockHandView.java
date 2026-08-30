package com.google.android.material.timepicker;

import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import me.magnum.melonds.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class ClockHandView extends View {

    /* renamed from: k0  reason: collision with root package name */
    public static final /* synthetic */ int f3161k0 = 0;
    public final ValueAnimator A;
    public boolean B;
    public final ArrayList L;
    public final int R;

    /* renamed from: b0  reason: collision with root package name */
    public final float f3162b0;

    /* renamed from: c0  reason: collision with root package name */
    public final Paint f3163c0;

    /* renamed from: d0  reason: collision with root package name */
    public final RectF f3164d0;

    /* renamed from: e0  reason: collision with root package name */
    public final int f3165e0;

    /* renamed from: f0  reason: collision with root package name */
    public float f3166f0;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f3167g0;

    /* renamed from: h0  reason: collision with root package name */
    public double f3168h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f3169i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f3170j0;

    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        ValueAnimator valueAnimator = new ValueAnimator();
        this.A = valueAnimator;
        this.L = new ArrayList();
        Paint paint = new Paint();
        this.f3163c0 = paint;
        this.f3164d0 = new RectF();
        this.f3170j0 = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t9.a.f13154e, R.attr.materialClockStyle, 2131952889);
        a.a.T(context, R.attr.motionDurationLong2, 200);
        a.a.U(context, R.attr.motionEasingEmphasizedInterpolator, u9.a.f13511b);
        this.f3169i0 = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.R = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        Resources resources = getResources();
        this.f3165e0 = resources.getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.f3162b0 = resources.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = obtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        a(0.0f);
        ViewConfiguration.get(context).getScaledTouchSlop();
        setImportantForAccessibility(2);
        obtainStyledAttributes.recycle();
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.timepicker.d
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                int i2 = ClockHandView.f3161k0;
                ClockHandView.this.b(((Float) valueAnimator2.getAnimatedValue()).floatValue());
            }
        });
        valueAnimator.addListener(new AnimatorListenerAdapter());
    }

    public final void a(float f8) {
        this.A.cancel();
        b(f8);
    }

    public final void b(float f8) {
        float f10 = f8 % 360.0f;
        this.f3166f0 = f10;
        this.f3168h0 = Math.toRadians(f10 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        int i2 = this.f3170j0;
        int i10 = this.f3169i0;
        if (i2 == 2) {
            i10 = Math.round(i10 * 0.66f);
        }
        float f11 = width;
        float f12 = i10;
        float cos = (((float) Math.cos(this.f3168h0)) * f12) + f11;
        float sin = (f12 * ((float) Math.sin(this.f3168h0))) + height;
        float f13 = this.R;
        this.f3164d0.set(cos - f13, sin - f13, cos + f13, sin + f13);
        ArrayList arrayList = this.L;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ClockFaceView clockFaceView = (ClockFaceView) ((f) obj);
            if (Math.abs(clockFaceView.D0 - f10) > 0.001f) {
                clockFaceView.D0 = f10;
                clockFaceView.p();
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i2;
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        int i10 = this.f3170j0;
        int i11 = this.f3169i0;
        if (i10 == 2) {
            i11 = Math.round(i11 * 0.66f);
        }
        float f8 = width;
        float f10 = i11;
        float f11 = height;
        Paint paint = this.f3163c0;
        paint.setStrokeWidth(0.0f);
        canvas.drawCircle((((float) Math.cos(this.f3168h0)) * f10) + f8, (f10 * ((float) Math.sin(this.f3168h0))) + f11, this.R, paint);
        double sin = Math.sin(this.f3168h0);
        paint.setStrokeWidth(this.f3165e0);
        canvas.drawLine(f8, f11, width + ((int) (Math.cos(this.f3168h0) * r3)), height + ((int) (r3 * sin)), paint);
        canvas.drawCircle(f8, f11, this.f3162b0, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i2, int i10, int i11, int i12) {
        super.onLayout(z10, i2, i10, i11, i12);
        if (!this.A.isRunning()) {
            a(this.f3166f0);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        boolean z12;
        int i2;
        int actionMasked = motionEvent.getActionMasked();
        float x9 = motionEvent.getX();
        float y10 = motionEvent.getY();
        boolean z13 = false;
        if (actionMasked != 0) {
            if (actionMasked != 1 && actionMasked != 2) {
                z11 = false;
                z10 = false;
            } else {
                z11 = this.f3167g0;
                if (this.B) {
                    if (((float) Math.hypot(x9 - (getWidth() / 2), y10 - (getHeight() / 2))) <= Math.round(this.f3169i0 * 0.66f) + TypedValue.applyDimension(1, 12, getContext().getResources().getDisplayMetrics())) {
                        i2 = 2;
                    } else {
                        i2 = 1;
                    }
                    this.f3170j0 = i2;
                }
                z10 = false;
            }
        } else {
            this.f3167g0 = false;
            z10 = true;
            z11 = false;
        }
        boolean z14 = this.f3167g0;
        int degrees = (int) Math.toDegrees(Math.atan2(y10 - (getHeight() / 2), x9 - (getWidth() / 2)));
        int i10 = degrees + 90;
        if (i10 < 0) {
            i10 = degrees + 450;
        }
        float f8 = i10;
        if (this.f3166f0 != f8) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (!z10 || !z12) {
            if (z12 || z11) {
                a(f8);
            }
            this.f3167g0 = z14 | z13;
            return true;
        }
        z13 = true;
        this.f3167g0 = z14 | z13;
        return true;
    }
}
