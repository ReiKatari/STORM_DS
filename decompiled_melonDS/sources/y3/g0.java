package y3;

import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g0 implements r1, x0 {
    public final /* synthetic */ j0 A;
    public final /* synthetic */ p0 B;

    public g0(p0 p0Var) {
        this.B = p0Var;
        this.A = p0Var.f14719b0;
    }

    @Override // y3.r1
    public final List D(Object obj, mc.p pVar) {
        h0 h0Var;
        p0 p0Var = this.B;
        a4.o0 o0Var = p0Var.A;
        a1.m0 m0Var = p0Var.Z;
        a4.o0 o0Var2 = (a4.o0) m0Var.g(obj);
        if (o0Var2 != null && ((p2.b) ((a1.f0) o0Var.o()).B).i(o0Var2) < p0Var.R) {
            return o0Var2.m();
        }
        a1.m0 m0Var2 = p0Var.f14723f0;
        a1.m0 m0Var3 = p0Var.f14721d0;
        p2.b bVar = p0Var.f14724g0;
        if (bVar.L < p0Var.X) {
            x3.a.a("Error: currentApproachIndex cannot be greater than the size of theapproachComposedSlotIds list.");
        }
        a4.o0 o0Var3 = (a4.o0) m0Var.g(obj);
        int i2 = bVar.L;
        int i10 = p0Var.X;
        if (i2 == i10) {
            bVar.b(obj);
        } else {
            Object[] objArr = bVar.A;
            Object obj2 = objArr[i10];
            objArr[i10] = obj;
        }
        p0Var.X++;
        boolean b10 = m0Var3.b(obj);
        if (!b10 && o0Var3 == null) {
            p0Var.k(obj, pVar, false);
            m0Var2.m(obj, p0Var.f(obj));
        } else {
            if (!b10 && o0Var3 != null) {
                p0Var.j(((p2.b) ((a1.f0) o0Var.o()).B).i(o0Var3), ((p2.b) ((a1.f0) o0Var.o()).B).L);
                p0Var.f14726i0++;
                m0Var.k(obj);
                m0Var3.m(obj, o0Var3);
                m0Var2.m(obj, p0Var.f(obj));
                if (o0Var.H()) {
                    p0Var.h();
                }
            }
            a4.o0 o0Var4 = (a4.o0) m0Var3.g(obj);
            n2.i1 i1Var = null;
            if (o0Var4 != null) {
                h0Var = (h0) p0Var.Y.g(o0Var4);
            } else {
                h0Var = null;
            }
            if (h0Var != null && h0Var.f14684d) {
                p0Var.m(o0Var4, obj, false, pVar);
            }
            if (h0Var != null) {
                i1Var = h0Var.f14686f;
            }
            if (i1Var != null) {
                p0Var.d(h0Var, true);
            }
        }
        a4.o0 o0Var5 = (a4.o0) m0Var3.g(obj);
        if (o0Var5 != null) {
            List v02 = o0Var5.B0.f348p.v0();
            a1.f0 f0Var = (a1.f0) v02;
            int i11 = ((p2.b) f0Var.B).L;
            for (int i12 = 0; i12 < i11; i12++) {
                ((a4.i1) f0Var.get(i12)).Y.f335b = true;
            }
            return v02;
        }
        return zb.q.A;
    }

    @Override // x4.c
    public final int G(long j2) {
        return this.A.G(j2);
    }

    @Override // x4.c
    public final float I(long j2) {
        return this.A.I(j2);
    }

    @Override // x4.c
    public final int O(float f8) {
        return this.A.O(f8);
    }

    @Override // x4.c
    public final long W(long j2) {
        return this.A.W(j2);
    }

    @Override // x4.c
    public final float b() {
        return this.A.B;
    }

    @Override // x4.c
    public final float c0(long j2) {
        return this.A.c0(j2);
    }

    @Override // y3.v
    public final x4.m getLayoutDirection() {
        return this.A.A;
    }

    @Override // x4.c
    public final float j() {
        return this.A.L;
    }

    @Override // y3.x0
    public final w0 k0(int i2, int i10, Map map, mc.l lVar, mc.l lVar2) {
        return this.A.k0(i2, i10, map, lVar, lVar2);
    }

    @Override // x4.c
    public final long m0(float f8) {
        return this.A.m0(f8);
    }

    @Override // y3.v
    public final boolean q() {
        return this.A.q();
    }

    @Override // x4.c
    public final long r(float f8) {
        return this.A.r(f8);
    }

    @Override // x4.c
    public final long t(long j2) {
        return this.A.t(j2);
    }

    @Override // x4.c
    public final float t0(int i2) {
        return this.A.t0(i2);
    }

    @Override // y3.x0
    public final w0 u0(int i2, int i10, Map map, mc.l lVar) {
        return this.A.k0(i2, i10, map, null, lVar);
    }

    @Override // x4.c
    public final float v(float f8) {
        return this.A.b() * f8;
    }

    @Override // x4.c
    public final float x0(float f8) {
        return f8 / this.A.b();
    }
}
