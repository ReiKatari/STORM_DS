package defpackage;

import android.graphics.Paint;
import android.graphics.Shader;
import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zj0  reason: default package */
/* loaded from: classes.dex */
public final class zj0 implements no1 {
    public final yj0 A;
    public final bt B;
    public aj L;
    public aj R;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, yj0] */
    public zj0() {
        th1 th1Var = hv.f;
        kk3 kk3Var = kk3.Ltr;
        ?? obj = new Object();
        obj.a = th1Var;
        obj.b = kk3Var;
        obj.c = ut1.a;
        obj.d = 0L;
        this.A = obj;
        this.B = new bt(this);
    }

    public static aj b(zj0 zj0Var, long j, oo1 oo1Var, float f, int i) {
        aj i2 = zj0Var.i(oo1Var);
        Paint paint = (Paint) i2.L;
        if (f != 1.0f) {
            j = kt0.c(kt0.e(j) * f, j);
        }
        if (!kt0.d(hv.b(paint.getColor()), j)) {
            i2.l(j);
        }
        if (((Shader) i2.R) != null) {
            i2.p(null);
        }
        if (!nb3.k((z40) i2.X, null)) {
            i2.m(null);
        }
        if (i2.B != i) {
            i2.k(i);
        }
        if (paint.isFilterBitmap()) {
            return i2;
        }
        i2.n(1);
        return i2;
    }

    public static aj d(zj0 zj0Var, long j, float f, int i) {
        aj ajVar = zj0Var.R;
        if (ajVar == null) {
            ajVar = nc1.t();
            ajVar.t(1);
            zj0Var.R = ajVar;
        }
        Paint paint = (Paint) ajVar.L;
        if (!kt0.d(hv.b(paint.getColor()), j)) {
            ajVar.l(j);
        }
        if (((Shader) ajVar.R) != null) {
            ajVar.p(null);
        }
        if (!nb3.k((z40) ajVar.X, null)) {
            ajVar.m(null);
        }
        if (ajVar.B != 3) {
            ajVar.k(3);
        }
        if (paint.getStrokeWidth() != f) {
            ajVar.s(f);
        }
        if (paint.getStrokeMiter() != 4.0f) {
            paint.setStrokeMiter(4.0f);
        }
        if (ajVar.g() != i) {
            ajVar.q(i);
        }
        if (ajVar.h() != 0) {
            ajVar.r(0);
        }
        if (!nb3.k(null, null)) {
            ajVar.o(null);
        }
        if (paint.isFilterBitmap()) {
            return ajVar;
        }
        ajVar.n(1);
        return ajVar;
    }

    @Override // defpackage.no1
    public final void C(long j, long j2, long j3, float f, int i) {
        this.A.c.i(j2, j3, d(this, j, f, i));
    }

    @Override // defpackage.no1
    public final void L(long j, float f, long j2, oo1 oo1Var) {
        this.A.c.d(f, j2, b(this, j, oo1Var, 1.0f, 3));
    }

    @Override // defpackage.no1
    public final void W(f80 f80Var, long j, long j2, float f, oo1 oo1Var, int i) {
        int i2 = (int) (j >> 32);
        int i3 = (int) (j & 4294967295L);
        this.A.c.k(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (4294967295L & j2)) + Float.intBitsToFloat(i3), c(f80Var, oo1Var, f, null, i, 1));
    }

    @Override // defpackage.qh1
    public final float Y() {
        return this.A.a.Y();
    }

    @Override // defpackage.qh1
    public final float a() {
        return this.A.a.a();
    }

    public final aj c(f80 f80Var, oo1 oo1Var, float f, z40 z40Var, int i, int i2) {
        aj i3 = i(oo1Var);
        Paint paint = (Paint) i3.L;
        if (f80Var != null) {
            f80Var.a(f, e(), i3);
        } else {
            if (((Shader) i3.R) != null) {
                i3.p(null);
            }
            long b = hv.b(paint.getColor());
            long j = kt0.b;
            if (!kt0.d(b, j)) {
                i3.l(j);
            }
            if (paint.getAlpha() / 255.0f != f) {
                i3.j(f);
            }
        }
        if (!nb3.k((z40) i3.X, z40Var)) {
            i3.m(z40Var);
        }
        if (i3.B != i) {
            i3.k(i);
        }
        if (paint.isFilterBitmap() == i2) {
            return i3;
        }
        i3.n(i2);
        return i3;
    }

    @Override // defpackage.no1
    public final void c0(f80 f80Var, long j, long j2, long j3, float f, oo1 oo1Var) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        this.A.c.g(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), c(f80Var, oo1Var, f, null, 3, 1));
    }

    public final void f(zh zhVar, z40 z40Var) {
        this.A.c.a(zhVar, c(null, kc2.a, 1.0f, z40Var, 3, 1));
    }

    @Override // defpackage.no1
    public final void g(hj hjVar, f80 f80Var, float f, oo1 oo1Var, int i) {
        this.A.c.f(hjVar, c(f80Var, oo1Var, f, null, i, 1));
    }

    @Override // defpackage.no1
    public final void g0(long j, float f, float f2, long j2, long j3, float f3, ys6 ys6Var) {
        int i = (int) (j2 >> 32);
        int i2 = (int) (j2 & 4294967295L);
        this.A.c.u(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i2), f, f2, b(this, j, ys6Var, f3, 3));
    }

    @Override // defpackage.no1
    public final kk3 getLayoutDirection() {
        return this.A.b;
    }

    @Override // defpackage.no1
    public final void h(hj hjVar, long j, float f, oo1 oo1Var) {
        this.A.c.f(hjVar, b(this, j, oo1Var, f, 3));
    }

    public final aj i(oo1 oo1Var) {
        if (nb3.k(oo1Var, kc2.a)) {
            aj ajVar = this.L;
            if (ajVar == null) {
                aj t = nc1.t();
                t.t(0);
                this.L = t;
                return t;
            }
            return ajVar;
        } else if (oo1Var instanceof ys6) {
            aj ajVar2 = this.R;
            if (ajVar2 == null) {
                ajVar2 = nc1.t();
                ajVar2.t(1);
                this.R = ajVar2;
            }
            Paint paint = (Paint) ajVar2.L;
            float strokeWidth = paint.getStrokeWidth();
            ys6 ys6Var = (ys6) oo1Var;
            float f = ys6Var.a;
            if (strokeWidth != f) {
                ajVar2.s(f);
            }
            int g = ajVar2.g();
            int i = ys6Var.c;
            if (g != i) {
                ajVar2.q(i);
            }
            float strokeMiter = paint.getStrokeMiter();
            float f2 = ys6Var.b;
            if (strokeMiter != f2) {
                paint.setStrokeMiter(f2);
            }
            int h = ajVar2.h();
            int i2 = ys6Var.d;
            if (h != i2) {
                ajVar2.r(i2);
            }
            if (!nb3.k(null, null)) {
                ajVar2.o(null);
            }
            return ajVar2;
        } else {
            i.d();
            return null;
        }
    }

    @Override // defpackage.no1
    public final bt i0() {
        return this.B;
    }

    @Override // defpackage.no1
    public final void n0(ArrayList arrayList, long j, float f) {
        this.A.c.r(arrayList, d(this, j, f, 1));
    }

    @Override // defpackage.no1
    public final void q0(zh zhVar, long j, long j2, long j3, float f, z40 z40Var, int i) {
        this.A.c.e(zhVar, j, j2, j3, c(null, kc2.a, f, z40Var, 3, i));
    }

    @Override // defpackage.no1
    public final void s(long j, long j2, long j3, float f, oo1 oo1Var, int i) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        this.A.c.k(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (4294967295L & j3)) + Float.intBitsToFloat(i3), b(this, j, oo1Var, f, i));
    }
}
