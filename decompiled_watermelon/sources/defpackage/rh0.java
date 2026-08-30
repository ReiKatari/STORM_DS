package defpackage;

import android.graphics.Paint;
import android.graphics.Shader;
import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: rh0  reason: default package */
/* loaded from: classes.dex */
public final class rh0 implements hk1 {
    public final qh0 A;
    public final os B;
    public oi L;
    public oi R;

    /* JADX WARN: Type inference failed for: r0v0, types: [qh0, java.lang.Object] */
    public rh0() {
        rd1 rd1Var = tq5.k;
        sd3 sd3Var = sd3.Ltr;
        ?? obj = new Object();
        obj.a = rd1Var;
        obj.b = sd3Var;
        obj.c = lp1.a;
        obj.d = 0L;
        this.A = obj;
        this.B = new os(this);
    }

    public static oi a(rh0 rh0Var, long j, ik1 ik1Var, float f, int i) {
        oi h = rh0Var.h(ik1Var);
        Paint paint = (Paint) h.L;
        if (f != 1.0f) {
            j = xq0.b(xq0.d(j) * f, j);
        }
        if (!xq0.c(mh7.c(paint.getColor()), j)) {
            h.l(j);
        }
        if (((Shader) h.R) != null) {
            h.p(null);
        }
        if (!b53.x((b30) h.X, null)) {
            h.m(null);
        }
        if (h.B != i) {
            h.k(i);
        }
        if (paint.isFilterBitmap()) {
            return h;
        }
        h.n(1);
        return h;
    }

    public static oi e(rh0 rh0Var, long j, float f, int i) {
        oi oiVar = rh0Var.R;
        if (oiVar == null) {
            oiVar = dk7.e();
            oiVar.t(1);
            rh0Var.R = oiVar;
        }
        Paint paint = (Paint) oiVar.L;
        if (!xq0.c(mh7.c(paint.getColor()), j)) {
            oiVar.l(j);
        }
        if (((Shader) oiVar.R) != null) {
            oiVar.p(null);
        }
        if (!b53.x((b30) oiVar.X, null)) {
            oiVar.m(null);
        }
        if (oiVar.B != 3) {
            oiVar.k(3);
        }
        if (paint.getStrokeWidth() != f) {
            oiVar.s(f);
        }
        if (paint.getStrokeMiter() != 4.0f) {
            paint.setStrokeMiter(4.0f);
        }
        if (oiVar.g() != i) {
            oiVar.q(i);
        }
        if (oiVar.h() != 0) {
            oiVar.r(0);
        }
        if (!b53.x(null, null)) {
            oiVar.o(null);
        }
        if (paint.isFilterBitmap()) {
            return oiVar;
        }
        oiVar.n(1);
        return oiVar;
    }

    @Override // defpackage.hk1
    public final void A(long j, long j2, long j3, long j4, ik1 ik1Var, float f) {
        int i = (int) (j2 >> 32);
        int i2 = (int) (j2 & 4294967295L);
        this.A.c.k(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)), a(this, j, ik1Var, f, 3));
    }

    @Override // defpackage.hk1
    public final void F(long j, long j2, long j3, float f, ik1 ik1Var, int i) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        this.A.c.r(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (4294967295L & j3)) + Float.intBitsToFloat(i3), a(this, j, ik1Var, f, i));
    }

    @Override // defpackage.hk1
    public final void G(long j, float f, float f2, long j2, long j3, float f3, hh6 hh6Var) {
        int i = (int) (j2 >> 32);
        int i2 = (int) (j2 & 4294967295L);
        this.A.c.v(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i2), f, f2, a(this, j, hh6Var, f3, 3));
    }

    @Override // defpackage.hk1
    public final os I() {
        return this.B;
    }

    @Override // defpackage.hk1
    public final void S(long j, long j2, long j3, ik1 ik1Var) {
        int i = (int) (j2 >> 32);
        int i2 = (int) (j2 & 4294967295L);
        this.A.c.i(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (4294967295L & j3)) + Float.intBitsToFloat(i2), a(this, j, ik1Var, 1.0f, 3));
    }

    @Override // defpackage.hk1
    public final void U(ArrayList arrayList, long j, float f) {
        this.A.c.o(arrayList, e(this, j, f, 1));
    }

    @Override // defpackage.hk1
    public final void X(nh nhVar, long j, long j2, long j3, float f, b30 b30Var, int i) {
        this.A.c.e(nhVar, j, j2, j3, c(null, r72.a, f, b30Var, 3, i));
    }

    @Override // defpackage.od1
    public final float b() {
        return this.A.a.b();
    }

    public final oi c(b60 b60Var, ik1 ik1Var, float f, b30 b30Var, int i, int i2) {
        oi h = h(ik1Var);
        Paint paint = (Paint) h.L;
        if (b60Var != null) {
            b60Var.a(f, d(), h);
        } else {
            if (((Shader) h.R) != null) {
                h.p(null);
            }
            long c = mh7.c(paint.getColor());
            long j = xq0.b;
            if (!xq0.c(c, j)) {
                h.l(j);
            }
            if (paint.getAlpha() / 255.0f != f) {
                h.j(f);
            }
        }
        if (!b53.x((b30) h.X, b30Var)) {
            h.m(b30Var);
        }
        if (h.B != i) {
            h.k(i);
        }
        if (paint.isFilterBitmap() == i2) {
            return h;
        }
        h.n(i2);
        return h;
    }

    @Override // defpackage.hk1
    public final void d0(long j, long j2, long j3, float f, int i) {
        this.A.c.n(j2, j3, e(this, j, f, i));
    }

    public final void f(nh nhVar, b30 b30Var) {
        this.A.c.a(nhVar, c(null, r72.a, 1.0f, b30Var, 3, 1));
    }

    @Override // defpackage.hk1
    public final void g(b60 b60Var, long j, long j2, float f, ik1 ik1Var, int i) {
        int i2 = (int) (j >> 32);
        int i3 = (int) (j & 4294967295L);
        this.A.c.r(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (4294967295L & j2)) + Float.intBitsToFloat(i3), c(b60Var, ik1Var, f, null, i, 1));
    }

    @Override // defpackage.hk1
    public final sd3 getLayoutDirection() {
        return this.A.b;
    }

    public final oi h(ik1 ik1Var) {
        if (b53.x(ik1Var, r72.a)) {
            oi oiVar = this.L;
            if (oiVar == null) {
                oi e = dk7.e();
                e.t(0);
                this.L = e;
                return e;
            }
            return oiVar;
        } else if (ik1Var instanceof hh6) {
            oi oiVar2 = this.R;
            if (oiVar2 == null) {
                oiVar2 = dk7.e();
                oiVar2.t(1);
                this.R = oiVar2;
            }
            Paint paint = (Paint) oiVar2.L;
            float strokeWidth = paint.getStrokeWidth();
            hh6 hh6Var = (hh6) ik1Var;
            float f = hh6Var.a;
            if (strokeWidth != f) {
                oiVar2.s(f);
            }
            int g = oiVar2.g();
            int i = hh6Var.c;
            if (g != i) {
                oiVar2.q(i);
            }
            float strokeMiter = paint.getStrokeMiter();
            float f2 = hh6Var.b;
            if (strokeMiter != f2) {
                paint.setStrokeMiter(f2);
            }
            int h = oiVar2.h();
            int i2 = hh6Var.d;
            if (h != i2) {
                oiVar2.r(i2);
            }
            if (!b53.x(null, null)) {
                oiVar2.o(null);
            }
            return oiVar2;
        } else {
            i.c();
            return null;
        }
    }

    @Override // defpackage.hk1
    public final void i(vi viVar, b60 b60Var, float f, ik1 ik1Var, int i) {
        this.A.c.h(viVar, c(b60Var, ik1Var, f, null, i, 1));
    }

    @Override // defpackage.hk1
    public final void j(vi viVar, long j, float f, ik1 ik1Var) {
        this.A.c.h(viVar, a(this, j, ik1Var, f, 3));
    }

    @Override // defpackage.od1
    public final float o() {
        return this.A.a.o();
    }

    @Override // defpackage.hk1
    public final void u0(long j, float f, long j2, ik1 ik1Var) {
        this.A.c.d(f, j2, a(this, j, ik1Var, 1.0f, 3));
    }
}
