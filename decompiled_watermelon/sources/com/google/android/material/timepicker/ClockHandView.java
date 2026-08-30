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
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import me.magnum.melondualds.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public class ClockHandView extends View {
    public static final /* synthetic */ int l0 = 0;
    public final ValueAnimator A;
    public boolean B;
    public final ArrayList L;
    public final int R;
    public final float c0;
    public final Paint d0;
    public final RectF e0;
    public final int f0;
    public float g0;
    public boolean h0;
    public double i0;
    public int j0;
    public int k0;

    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        ValueAnimator valueAnimator = new ValueAnimator();
        this.A = valueAnimator;
        this.L = new ArrayList();
        Paint paint = new Paint();
        this.d0 = paint;
        this.e0 = new RectF();
        this.k0 = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ay4.e, R.attr.materialClockStyle, 2132018444);
        me2.M(context, R.attr.motionDurationLong2, 200);
        me2.N(context, R.attr.motionEasingEmphasizedInterpolator, jo.b);
        this.j0 = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.R = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        Resources resources = getResources();
        this.f0 = resources.getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.c0 = resources.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = obtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        a(RecyclerView.A1);
        ViewConfiguration.get(context).getScaledTouchSlop();
        setImportantForAccessibility(2);
        obtainStyledAttributes.recycle();
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.timepicker.d
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                int i = ClockHandView.l0;
                ClockHandView.this.b(((Float) valueAnimator2.getAnimatedValue()).floatValue());
            }
        });
        valueAnimator.addListener(new AnimatorListenerAdapter());
    }

    public final void a(float f) {
        this.A.cancel();
        b(f);
    }

    public final void b(float f) {
        float f2 = f % 360.0f;
        this.g0 = f2;
        this.i0 = Math.toRadians(f2 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        int i = this.k0;
        int i2 = this.j0;
        if (i == 2) {
            i2 = Math.round(i2 * 0.66f);
        }
        float f3 = width;
        float f4 = i2;
        float cos = (((float) Math.cos(this.i0)) * f4) + f3;
        float sin = (f4 * ((float) Math.sin(this.i0))) + height;
        float f5 = this.R;
        this.e0.set(cos - f5, sin - f5, cos + f5, sin + f5);
        ArrayList arrayList = this.L;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ClockFaceView clockFaceView = (ClockFaceView) ((lp0) obj);
            if (Math.abs(clockFaceView.E0 - f2) > 0.001f) {
                clockFaceView.E0 = f2;
                clockFaceView.p();
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        int i2 = this.k0;
        int i3 = this.j0;
        if (i2 == 2) {
            i3 = Math.round(i3 * 0.66f);
        }
        float f = width;
        float f2 = i3;
        float f3 = height;
        Paint paint = this.d0;
        paint.setStrokeWidth(RecyclerView.A1);
        canvas.drawCircle((((float) Math.cos(this.i0)) * f2) + f, (f2 * ((float) Math.sin(this.i0))) + f3, this.R, paint);
        double sin = Math.sin(this.i0);
        paint.setStrokeWidth(this.f0);
        canvas.drawLine(f, f3, width + ((int) (Math.cos(this.i0) * r3)), height + ((int) (r3 * sin)), paint);
        canvas.drawCircle(f, f3, this.c0, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!this.A.isRunning()) {
            a(this.g0);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        boolean z4 = false;
        if (actionMasked != 0) {
            if (actionMasked != 1 && actionMasked != 2) {
                z2 = false;
                z = false;
            } else {
                z2 = this.h0;
                if (this.B) {
                    if (((float) Math.hypot(x - (getWidth() / 2), y - (getHeight() / 2))) <= Math.round(this.j0 * 0.66f) + TypedValue.applyDimension(1, 12.0f, getContext().getResources().getDisplayMetrics())) {
                        i = 2;
                    } else {
                        i = 1;
                    }
                    this.k0 = i;
                }
                z = false;
            }
        } else {
            this.h0 = false;
            z = true;
            z2 = false;
        }
        boolean z5 = this.h0;
        int degrees = (int) Math.toDegrees(Math.atan2(y - (getHeight() / 2), x - (getWidth() / 2)));
        int i2 = degrees + 90;
        if (i2 < 0) {
            i2 = degrees + 450;
        }
        float f = i2;
        if (this.g0 != f) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z || !z3) {
            if (z3 || z2) {
                a(f);
            }
            this.h0 = z5 | z4;
            return true;
        }
        z4 = true;
        this.h0 = z5 | z4;
        return true;
    }
}
