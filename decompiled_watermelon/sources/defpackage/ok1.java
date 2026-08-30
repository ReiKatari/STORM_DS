package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ok1  reason: default package */
/* loaded from: classes.dex */
public final class ok1 extends qi4 implements l95 {
    public final Drawable X;
    public final tj4 Y;
    public final tj4 Z;
    public final il6 c0;

    public ok1(Drawable drawable) {
        long j;
        drawable.getClass();
        this.X = drawable;
        this.Y = me2.G(0);
        gh3 gh3Var = pk1.a;
        if (drawable.getIntrinsicWidth() >= 0 && drawable.getIntrinsicHeight() >= 0) {
            j = mj2.d(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        } else {
            j = 9205357640488583168L;
        }
        this.Z = me2.G(new i76(j));
        this.c0 = new il6(new dj(7, this));
        if (drawable.getIntrinsicWidth() >= 0 && drawable.getIntrinsicHeight() >= 0) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
    }

    @Override // defpackage.l95
    public final void a() {
        Drawable drawable = this.X;
        drawable.setCallback((Drawable.Callback) this.c0.getValue());
        drawable.setVisible(true, true);
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
    }

    @Override // defpackage.l95
    public final void b() {
        c();
    }

    @Override // defpackage.l95
    public final void c() {
        Drawable drawable = this.X;
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        drawable.setVisible(false, false);
        drawable.setCallback(null);
    }

    @Override // defpackage.qi4
    public final void d(float f) {
        this.X.setAlpha(io2.m(jv3.X(f * 255.0f), 0, 255));
    }

    @Override // defpackage.qi4
    public final void e(b30 b30Var) {
        ColorFilter colorFilter;
        if (b30Var != null) {
            colorFilter = b30Var.a;
        } else {
            colorFilter = null;
        }
        this.X.setColorFilter(colorFilter);
    }

    @Override // defpackage.qi4
    public final void f(sd3 sd3Var) {
        sd3Var.getClass();
        int i = nk1.a[sd3Var.ordinal()];
        int i2 = 1;
        if (i != 1) {
            if (i != 2) {
                i.c();
                return;
            }
        } else {
            i2 = 0;
        }
        this.X.setLayoutDirection(i2);
    }

    @Override // defpackage.qi4
    public final long h() {
        return ((i76) this.Z.getValue()).a;
    }

    @Override // defpackage.qi4
    public final void i(xf3 xf3Var) {
        rh0 rh0Var = xf3Var.A;
        oh0 s = rh0Var.B.s();
        ((Number) this.Y.getValue()).intValue();
        int X = jv3.X(i76.e(rh0Var.d()));
        int X2 = jv3.X(i76.c(rh0Var.d()));
        Drawable drawable = this.X;
        drawable.setBounds(0, 0, X, X2);
        try {
            s.m();
            Canvas canvas = jd.a;
            drawable.draw(((id) s).a);
        } finally {
            s.j();
        }
    }
}
