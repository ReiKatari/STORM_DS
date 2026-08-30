package r9;

import a4.m0;
import a4.r0;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import h3.e;
import i3.l;
import i3.q;
import m9.o;
import n2.f1;
import n2.s;
import n2.x1;
import p7.j;
import x4.m;
import yb.n;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b extends n3.b implements x1 {
    public final Drawable X;
    public final f1 Y;
    public final f1 Z;

    /* renamed from: b0  reason: collision with root package name */
    public final n f12636b0;

    public b(Drawable drawable) {
        long j2;
        drawable.getClass();
        this.X = drawable;
        this.Y = s.w(0);
        Object obj = d.f12637a;
        if (drawable.getIntrinsicWidth() >= 0 && drawable.getIntrinsicHeight() >= 0) {
            j2 = a.a.f(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        } else {
            j2 = 9205357640488583168L;
        }
        this.Z = s.w(new e(j2));
        this.f12636b0 = new n(new m0(14, this));
        if (drawable.getIntrinsicWidth() >= 0 && drawable.getIntrinsicHeight() >= 0) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
    }

    @Override // n2.x1
    public final void a() {
        Drawable drawable = this.X;
        drawable.setCallback((Drawable.Callback) this.f12636b0.getValue());
        drawable.setVisible(true, true);
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
    }

    @Override // n2.x1
    public final void b() {
        c();
    }

    @Override // n2.x1
    public final void c() {
        Drawable drawable = this.X;
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        drawable.setVisible(false, false);
        drawable.setCallback(null);
    }

    @Override // n3.b
    public final void d(float f8) {
        this.X.setAlpha(j.g(pc.a.M(f8 * 255), 0, 255));
    }

    @Override // n3.b
    public final void e(l lVar) {
        ColorFilter colorFilter;
        if (lVar != null) {
            colorFilter = lVar.f6653a;
        } else {
            colorFilter = null;
        }
        this.X.setColorFilter(colorFilter);
    }

    @Override // n3.b
    public final void f(m mVar) {
        mVar.getClass();
        int i2 = a.f12635a[mVar.ordinal()];
        int i10 = 1;
        if (i2 != 1) {
            if (i2 != 2) {
                o.o();
                return;
            }
        } else {
            i10 = 0;
        }
        this.X.setLayoutDirection(i10);
    }

    @Override // n3.b
    public final long h() {
        return ((e) this.Z.getValue()).f6064a;
    }

    @Override // n3.b
    public final void i(r0 r0Var) {
        k3.b bVar = r0Var.A;
        q p10 = bVar.B.p();
        ((Number) this.Y.getValue()).intValue();
        int M = pc.a.M(e.e(bVar.c()));
        int M2 = pc.a.M(e.c(bVar.c()));
        Drawable drawable = this.X;
        drawable.setBounds(0, 0, M, M2);
        try {
            p10.p();
            Canvas canvas = i3.c.f6619a;
            drawable.draw(((i3.b) p10).f6615a);
        } finally {
            p10.m();
        }
    }
}
