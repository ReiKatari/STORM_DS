package l1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a  reason: collision with root package name */
    public static final a1.m0 f8595a = c(true);

    /* renamed from: b  reason: collision with root package name */
    public static final a1.m0 f8596b = c(false);

    /* renamed from: c  reason: collision with root package name */
    public static final o f8597c = o.f8589b;

    public static final void a(b3.p pVar, n2.m mVar, int i2) {
        int i10;
        boolean z10;
        int i11;
        n2.r rVar = (n2.r) mVar;
        rVar.Z(-211209833);
        if ((i2 & 6) == 0) {
            if (rVar.f(pVar)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i10 = i11 | i2;
        } else {
            i10 = i2;
        }
        if ((i10 & 3) != 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i10 & 1, z10)) {
            int hashCode = Long.hashCode(rVar.T);
            b3.p c4 = b3.a.c(pVar, rVar);
            v2.g l10 = rVar.l();
            a4.h.f220a.getClass();
            a4.f0 f0Var = a4.g.f212b;
            rVar.b0();
            if (rVar.S) {
                rVar.k(f0Var);
            } else {
                rVar.k0();
            }
            n2.s.C(f8597c, a4.g.f215e, rVar);
            n2.s.C(l10, a4.g.f214d, rVar);
            n2.s.y(rVar, a4.g.f217g);
            n2.s.C(c4, a4.g.f213c, rVar);
            n2.s.u(rVar, Integer.valueOf(hashCode), a4.g.f216f);
            rVar.p(true);
        } else {
            rVar.R();
        }
        n2.p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new n(pVar, i2, 0, (byte) 0);
        }
    }

    public static final void b(y3.h1 h1Var, y3.i1 i1Var, y3.u0 u0Var, x4.m mVar, int i2, int i10, b3.h hVar) {
        m mVar2;
        b3.h hVar2;
        b3.h hVar3;
        Object n10 = u0Var.n();
        if (n10 instanceof m) {
            mVar2 = (m) n10;
        } else {
            mVar2 = null;
        }
        if (mVar2 != null && (hVar3 = mVar2.f8586i0) != null) {
            hVar2 = hVar3;
        } else {
            hVar2 = hVar;
        }
        y3.h1.l(h1Var, i1Var, hVar2.a((i1Var.A << 32) | (i1Var.B & 4294967295L), (i2 << 32) | (i10 & 4294967295L), mVar));
    }

    public static final a1.m0 c(boolean z10) {
        a1.m0 m0Var = new a1.m0(9);
        b3.h hVar = b3.c.A;
        m0Var.m(hVar, new r(hVar, z10));
        b3.h hVar2 = b3.c.B;
        m0Var.m(hVar2, new r(hVar2, z10));
        b3.h hVar3 = b3.c.L;
        m0Var.m(hVar3, new r(hVar3, z10));
        b3.h hVar4 = b3.c.R;
        m0Var.m(hVar4, new r(hVar4, z10));
        b3.h hVar5 = b3.c.X;
        m0Var.m(hVar5, new r(hVar5, z10));
        b3.h hVar6 = b3.c.Y;
        m0Var.m(hVar6, new r(hVar6, z10));
        b3.h hVar7 = b3.c.Z;
        m0Var.m(hVar7, new r(hVar7, z10));
        b3.h hVar8 = b3.c.f1753b0;
        m0Var.m(hVar8, new r(hVar8, z10));
        b3.h hVar9 = b3.c.f1754c0;
        m0Var.m(hVar9, new r(hVar9, z10));
        return m0Var;
    }

    public static final y3.v0 d(b3.h hVar, boolean z10) {
        a1.m0 m0Var;
        if (z10) {
            m0Var = f8595a;
        } else {
            m0Var = f8596b;
        }
        y3.v0 v0Var = (y3.v0) m0Var.g(hVar);
        if (v0Var == null) {
            return new r(hVar, z10);
        }
        return v0Var;
    }
}
