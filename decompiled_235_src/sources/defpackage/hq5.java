package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.animation.AnimationUtils;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hq5 */
/* loaded from: classes.dex */
public final class hq5 extends View {
    public static final int[] e0 = {16842919, 16842910};
    public static final int[] f0 = new int[0];
    public ug7 A;
    public Boolean B;
    public Long L;
    public rk3 R;
    public a5 d0;

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
            rk3 rk3Var = new rk3(this, 9);
            this.R = rk3Var;
            postDelayed(rk3Var, 50L);
        } else {
            if (z) {
                iArr = e0;
            } else {
                iArr = f0;
            }
            ug7 ug7Var = this.A;
            if (ug7Var != null) {
                ug7Var.setState(iArr);
            }
        }
        this.L = Long.valueOf(currentAnimationTimeMillis);
    }

    public static final void setRippleState$lambda$1(hq5 hq5Var) {
        ug7 ug7Var = hq5Var.A;
        if (ug7Var != null) {
            ug7Var.setState(f0);
        }
        hq5Var.R = null;
    }

    public final void b(l25 l25Var, boolean z, long j, int i, long j2, float f, a5 a5Var) {
        if (this.A == null || !Boolean.valueOf(z).equals(this.B)) {
            ug7 ug7Var = new ug7(z);
            setBackground(ug7Var);
            this.A = ug7Var;
            this.B = Boolean.valueOf(z);
        }
        ug7 ug7Var2 = this.A;
        ug7Var2.getClass();
        this.d0 = a5Var;
        e(j, i, j2, f);
        if (z) {
            ug7Var2.setHotspot(Float.intBitsToFloat((int) (l25Var.a >> 32)), Float.intBitsToFloat((int) (l25Var.a & 4294967295L)));
        } else {
            ug7Var2.setHotspot(ug7Var2.getBounds().centerX(), ug7Var2.getBounds().centerY());
        }
        setRippleState(true);
    }

    public final void c() {
        this.d0 = null;
        rk3 rk3Var = this.R;
        if (rk3Var != null) {
            removeCallbacks(rk3Var);
            rk3 rk3Var2 = this.R;
            rk3Var2.getClass();
            rk3Var2.run();
        } else {
            ug7 ug7Var = this.A;
            if (ug7Var != null) {
                ug7Var.setState(f0);
            }
        }
        ug7 ug7Var2 = this.A;
        if (ug7Var2 == null) {
            return;
        }
        ug7Var2.setVisible(false, false);
        unscheduleDrawable(ug7Var2);
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
        boolean d;
        ug7 ug7Var = this.A;
        if (ug7Var == null) {
            return;
        }
        if (ug7Var.getRadius() != i) {
            ug7Var.setRadius(i);
        }
        if (Build.VERSION.SDK_INT < 28) {
            f *= 2.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        long c = kt0.c(f, j2);
        kt0 kt0Var = ug7Var.B;
        if (kt0Var == null) {
            d = false;
        } else {
            d = kt0.d(kt0Var.a, c);
        }
        if (!d) {
            ug7Var.B = new kt0(c);
            ug7Var.setColor(ColorStateList.valueOf(hv.b0(c)));
        }
        Rect rect = new Rect(0, 0, u24.E(xi6.e(j)), u24.E(xi6.c(j)));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        ug7Var.setBounds(rect);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        a5 a5Var = this.d0;
        if (a5Var != null) {
            a5Var.c();
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
