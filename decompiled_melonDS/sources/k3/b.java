package k3;

import a4.n;
import android.graphics.Paint;
import android.graphics.Shader;
import cd.h1;
import i3.l;
import i3.o;
import i3.s;
import i3.z;
import java.util.ArrayList;
import nc.k;
import x4.m;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b implements d {
    public final a A;
    public final n B;
    public h1 L;
    public h1 R;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k3.a] */
    public b() {
        m mVar = m.Ltr;
        ?? obj = new Object();
        obj.f7955a = c.f7959a;
        obj.f7956b = mVar;
        obj.f7957c = f.f7960a;
        obj.f7958d = 0L;
        this.A = obj;
        this.B = new n(this);
    }

    public static h1 a(b bVar, long j2, e eVar, float f8, int i2) {
        h1 h2 = bVar.h(eVar);
        Paint paint = (Paint) h2.B;
        if (f8 != 1.0f) {
            j2 = s.b(j2, s.d(j2) * f8);
        }
        if (!s.c(z.c(paint.getColor()), j2)) {
            h2.j(j2);
        }
        if (((Shader) h2.L) != null) {
            h2.m(null);
        }
        if (!k.a((l) h2.R, null)) {
            h2.k(null);
        }
        if (h2.A != i2) {
            h2.i(i2);
        }
        if (paint.isFilterBitmap()) {
            return h2;
        }
        h2.l(1);
        return h2;
    }

    public static h1 e(b bVar, long j2, float f8, int i2) {
        h1 h1Var = bVar.R;
        if (h1Var == null) {
            h1Var = z.f();
            h1Var.q(1);
            bVar.R = h1Var;
        }
        Paint paint = (Paint) h1Var.B;
        if (!s.c(z.c(paint.getColor()), j2)) {
            h1Var.j(j2);
        }
        if (((Shader) h1Var.L) != null) {
            h1Var.m(null);
        }
        if (!k.a((l) h1Var.R, null)) {
            h1Var.k(null);
        }
        if (h1Var.A != 3) {
            h1Var.i(3);
        }
        if (paint.getStrokeWidth() != f8) {
            h1Var.p(f8);
        }
        if (paint.getStrokeMiter() != 4.0f) {
            paint.setStrokeMiter(4.0f);
        }
        if (h1Var.f() != i2) {
            h1Var.n(i2);
        }
        if (h1Var.g() != 0) {
            h1Var.o(0);
        }
        if (paint.isFilterBitmap()) {
            return h1Var;
        }
        h1Var.l(1);
        return h1Var;
    }

    @Override // k3.d
    public final void A(long j2, float f8, float f10, long j10, long j11, e eVar) {
        int i2 = (int) (j10 >> 32);
        int i10 = (int) (j10 & 4294967295L);
        this.A.f7957c.r(Float.intBitsToFloat(i2), Float.intBitsToFloat(i10), Float.intBitsToFloat((int) (j11 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j11 & 4294967295L)) + Float.intBitsToFloat(i10), f8, f10, a(this, j2, eVar, 1.0f, 3));
    }

    @Override // k3.d
    public final n E() {
        return this.B;
    }

    @Override // k3.d
    public final void H(long j2, long j10, long j11, long j12, e eVar, float f8) {
        int i2 = (int) (j10 >> 32);
        int i10 = (int) (j10 & 4294967295L);
        this.A.f7957c.c(Float.intBitsToFloat(i2), Float.intBitsToFloat(i10), Float.intBitsToFloat((int) (j11 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j11 & 4294967295L)) + Float.intBitsToFloat(i10), Float.intBitsToFloat((int) (j12 >> 32)), Float.intBitsToFloat((int) (j12 & 4294967295L)), a(this, j2, eVar, f8, 3));
    }

    @Override // k3.d
    public final void L(ArrayList arrayList, long j2, float f8) {
        this.A.f7957c.u(arrayList, e(this, j2, f8, 1));
    }

    @Override // k3.d
    public final void N(o oVar, long j2, long j10, float f8, e eVar, int i2) {
        int i10 = (int) (j2 >> 32);
        int i11 = (int) (j2 & 4294967295L);
        this.A.f7957c.f(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11), Float.intBitsToFloat((int) (j10 >> 32)) + Float.intBitsToFloat(i10), Float.intBitsToFloat((int) (4294967295L & j10)) + Float.intBitsToFloat(i11), d(oVar, eVar, f8, null, i2, 1));
    }

    @Override // k3.d
    public final void R(long j2, long j10, long j11, float f8, int i2) {
        this.A.f7957c.b(j10, j11, e(this, j2, f8, i2));
    }

    @Override // k3.d
    public final void Y(i3.h hVar, long j2, e eVar) {
        this.A.f7957c.a(hVar, a(this, j2, eVar, 1.0f, 3));
    }

    @Override // x4.c
    public final float b() {
        return this.A.f7955a.b();
    }

    public final h1 d(o oVar, e eVar, float f8, l lVar, int i2, int i10) {
        h1 h2 = h(eVar);
        Paint paint = (Paint) h2.B;
        if (oVar != null) {
            oVar.a(f8, c(), h2);
        } else {
            if (((Shader) h2.L) != null) {
                h2.m(null);
            }
            long c4 = z.c(paint.getColor());
            long j2 = s.f6681b;
            if (!s.c(c4, j2)) {
                h2.j(j2);
            }
            if (paint.getAlpha() / 255.0f != f8) {
                h2.h(f8);
            }
        }
        if (!k.a((l) h2.R, lVar)) {
            h2.k(lVar);
        }
        if (h2.A != i2) {
            h2.i(i2);
        }
        if (paint.isFilterBitmap() == i10) {
            return h2;
        }
        h2.l(i10);
        return h2;
    }

    @Override // k3.d
    public final void f(long j2, long j10, long j11, float f8, e eVar, int i2) {
        int i10 = (int) (j10 >> 32);
        int i11 = (int) (j10 & 4294967295L);
        this.A.f7957c.f(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11), Float.intBitsToFloat((int) (j11 >> 32)) + Float.intBitsToFloat(i10), Float.intBitsToFloat((int) (4294967295L & j11)) + Float.intBitsToFloat(i11), a(this, j2, eVar, f8, i2));
    }

    public final void g(i3.f fVar, l lVar) {
        this.A.f7957c.g(fVar, d(null, g.f7961a, 1.0f, lVar, 3, 1));
    }

    @Override // k3.d
    public final m getLayoutDirection() {
        return this.A.f7956b;
    }

    public final h1 h(e eVar) {
        if (k.a(eVar, g.f7961a)) {
            h1 h1Var = this.L;
            if (h1Var == null) {
                h1 f8 = z.f();
                f8.q(0);
                this.L = f8;
                return f8;
            }
            return h1Var;
        } else if (eVar instanceof h) {
            h1 h1Var2 = this.R;
            if (h1Var2 == null) {
                h1Var2 = z.f();
                h1Var2.q(1);
                this.R = h1Var2;
            }
            Paint paint = (Paint) h1Var2.B;
            float strokeWidth = paint.getStrokeWidth();
            h hVar = (h) eVar;
            float f10 = hVar.f7962a;
            if (strokeWidth != f10) {
                h1Var2.p(f10);
            }
            int f11 = h1Var2.f();
            int i2 = hVar.f7964c;
            if (f11 != i2) {
                h1Var2.n(i2);
            }
            float strokeMiter = paint.getStrokeMiter();
            float f12 = hVar.f7963b;
            if (strokeMiter != f12) {
                paint.setStrokeMiter(f12);
            }
            int g10 = h1Var2.g();
            int i10 = hVar.f7965d;
            if (g10 == i10) {
                return h1Var2;
            }
            h1Var2.o(i10);
            return h1Var2;
        } else {
            m9.o.o();
            return null;
        }
    }

    @Override // k3.d
    public final void i(i3.f fVar, long j2, long j10, long j11, float f8, l lVar, int i2) {
        this.A.f7957c.n(fVar, j2, j10, j11, d(null, g.f7961a, f8, lVar, 3, i2));
    }

    @Override // x4.c
    public final float j() {
        return this.A.f7955a.j();
    }

    @Override // k3.d
    public final void m(long j2, float f8, long j10, e eVar) {
        this.A.f7957c.i(f8, j10, a(this, j2, eVar, 1.0f, 3));
    }

    @Override // k3.d
    public final void x(i3.h hVar, o oVar, float f8, e eVar, int i2) {
        this.A.f7957c.a(hVar, d(oVar, eVar, f8, null, i2, 1));
    }
}
