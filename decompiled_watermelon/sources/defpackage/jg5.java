package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.animation.AnimationUtils;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: jg5 */
/* loaded from: classes.dex */
public final class jg5 extends View {
    public static final int[] d0 = {16842919, 16842910};
    public static final int[] e0 = new int[0];
    public z27 A;
    public Boolean B;
    public Long L;
    public tm3 R;
    public b5 c0;

    private final void setRippleState(boolean z) {
        long j;
        int[] iArr;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.R;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l = this.L;
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        long j2 = currentAnimationTimeMillis - j;
        if (!z && j2 < 5) {
            tm3 tm3Var = new tm3(7, this);
            this.R = tm3Var;
            postDelayed(tm3Var, 50L);
        } else {
            if (z) {
                iArr = d0;
            } else {
                iArr = e0;
            }
            z27 z27Var = this.A;
            if (z27Var != null) {
                z27Var.setState(iArr);
            }
        }
        this.L = Long.valueOf(currentAnimationTimeMillis);
    }

    public static final void setRippleState$lambda$1(jg5 jg5Var) {
        z27 z27Var = jg5Var.A;
        if (z27Var != null) {
            z27Var.setState(e0);
        }
        jg5Var.R = null;
    }

    public final void b(jt4 jt4Var, boolean z, long j, int i, long j2, float f, b5 b5Var) {
        if (this.A == null || !Boolean.valueOf(z).equals(this.B)) {
            z27 z27Var = new z27(z);
            setBackground(z27Var);
            this.A = z27Var;
            this.B = Boolean.valueOf(z);
        }
        z27 z27Var2 = this.A;
        z27Var2.getClass();
        this.c0 = b5Var;
        e(j, i, j2, f);
        if (z) {
            z27Var2.setHotspot(Float.intBitsToFloat((int) (jt4Var.a >> 32)), Float.intBitsToFloat((int) (jt4Var.a & 4294967295L)));
        } else {
            z27Var2.setHotspot(z27Var2.getBounds().centerX(), z27Var2.getBounds().centerY());
        }
        setRippleState(true);
    }

    public final void c() {
        this.c0 = null;
        tm3 tm3Var = this.R;
        if (tm3Var != null) {
            removeCallbacks(tm3Var);
            tm3 tm3Var2 = this.R;
            tm3Var2.getClass();
            tm3Var2.run();
        } else {
            z27 z27Var = this.A;
            if (z27Var != null) {
                z27Var.setState(e0);
            }
        }
        z27 z27Var2 = this.A;
        if (z27Var2 == null) {
            return;
        }
        z27Var2.setVisible(false, false);
        unscheduleDrawable(z27Var2);
    }

    public final void d() {
        setRippleState(false);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (!isAttachedToWindow()) {
            c();
        } else {
            super.draw(canvas);
        }
    }

    public final void e(long j, int i, long j2, float f) {
        boolean c;
        z27 z27Var = this.A;
        if (z27Var == null) {
            return;
        }
        if (z27Var.getRadius() != i) {
            z27Var.setRadius(i);
        }
        if (Build.VERSION.SDK_INT < 28) {
            f *= 2.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        long b = xq0.b(f, j2);
        xq0 xq0Var = z27Var.B;
        if (xq0Var == null) {
            c = false;
        } else {
            c = xq0.c(xq0Var.a, b);
        }
        if (!c) {
            z27Var.B = new xq0(b);
            z27Var.setColor(ColorStateList.valueOf(mh7.h0(b)));
        }
        Rect rect = new Rect(0, 0, jv3.X(i76.e(j)), jv3.X(i76.c(j)));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        z27Var.setBounds(rect);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        b5 b5Var = this.c0;
        if (b5Var != null) {
            b5Var.c();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
