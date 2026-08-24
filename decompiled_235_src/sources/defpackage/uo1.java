package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uo1  reason: default package */
/* loaded from: classes.dex */
public final class uo1 extends sr4 implements bj5 {
    public final Drawable X;
    public final vs4 Y;
    public final vs4 Z;
    public final ex6 d0;

    public uo1(Drawable drawable) {
        long j;
        drawable.getClass();
        this.X = drawable;
        this.Y = np2.Y(0);
        go3 go3Var = vo1.a;
        if (drawable.getIntrinsicWidth() >= 0 && drawable.getIntrinsicHeight() >= 0) {
            j = ii2.n(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        } else {
            j = 9205357640488583168L;
        }
        this.Z = np2.Y(new xi6(j));
        this.d0 = new ex6(new pj(this, 7));
        if (drawable.getIntrinsicWidth() >= 0 && drawable.getIntrinsicHeight() >= 0) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
    }

    @Override // defpackage.bj5
    public final void a() {
        b();
    }

    @Override // defpackage.bj5
    public final void b() {
        Drawable drawable = this.X;
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        drawable.setVisible(false, false);
        drawable.setCallback(null);
    }

    @Override // defpackage.bj5
    public final void c() {
        Drawable drawable = this.X;
        drawable.setCallback((Drawable.Callback) this.d0.getValue());
        drawable.setVisible(true, true);
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
    }

    @Override // defpackage.sr4
    public final void d(float f) {
        this.X.setAlpha(gi2.q(u24.E(f * 255.0f), 0, 255));
    }

    @Override // defpackage.sr4
    public final void e(z40 z40Var) {
        ColorFilter colorFilter;
        if (z40Var != null) {
            colorFilter = z40Var.a;
        } else {
            colorFilter = null;
        }
        this.X.setColorFilter(colorFilter);
    }

    @Override // defpackage.sr4
    public final void f(kk3 kk3Var) {
        kk3Var.getClass();
        int i = to1.a[kk3Var.ordinal()];
        int i2 = 1;
        if (i != 1) {
            if (i != 2) {
                i.d();
                return;
            }
        } else {
            i2 = 0;
        }
        this.X.setLayoutDirection(i2);
    }

    @Override // defpackage.sr4
    public final long h() {
        return ((xi6) this.Z.getValue()).a;
    }

    @Override // defpackage.sr4
    public final void i(um3 um3Var) {
        zj0 zj0Var = um3Var.A;
        xj0 G = zj0Var.B.G();
        ((Number) this.Y.getValue()).intValue();
        int E = u24.E(xi6.e(zj0Var.e()));
        int E2 = u24.E(xi6.c(zj0Var.e()));
        Drawable drawable = this.X;
        drawable.setBounds(0, 0, E, E2);
        try {
            G.h();
            Canvas canvas = xd.a;
            drawable.draw(((wd) G).a);
        } finally {
            G.p();
        }
    }
}
