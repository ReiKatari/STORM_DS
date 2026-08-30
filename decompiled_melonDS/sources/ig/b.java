package ig;

import a4.f0;
import b4.d2;
import c1.y1;
import f1.n;
import g2.e7;
import h1.q0;
import i3.z;
import l1.h1;
import l1.m1;
import l1.o1;
import l1.r1;
import l1.t0;
import l1.u;
import l1.w;
import mc.p;
import n1.x;
import n2.r;
import n2.s;
import n2.w0;
import yb.y;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements p {
    public final /* synthetic */ int A = 1;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;

    /* renamed from: b0  reason: collision with root package name */
    public final /* synthetic */ Object f7061b0;

    /* renamed from: c0  reason: collision with root package name */
    public final /* synthetic */ Object f7062c0;

    /* renamed from: d0  reason: collision with root package name */
    public final /* synthetic */ yb.d f7063d0;

    public /* synthetic */ b(b3.p pVar, x xVar, h1 h1Var, l1.f fVar, b3.g gVar, q0 q0Var, boolean z10, f1.i iVar, mc.l lVar, int i2) {
        this.L = pVar;
        this.R = xVar;
        this.X = h1Var;
        this.Y = fVar;
        this.Z = gVar;
        this.f7061b0 = q0Var;
        this.B = z10;
        this.f7062c0 = iVar;
        this.f7063d0 = lVar;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        boolean z10;
        mc.a aVar;
        a4.f fVar;
        a4.f fVar2;
        String str;
        mc.a aVar2;
        f0 f0Var;
        r rVar;
        boolean z11;
        a4.f fVar3;
        w0 w0Var;
        a4.e eVar;
        b3.m mVar;
        String str2;
        switch (this.A) {
            case 0:
                y1 y1Var = (y1) this.L;
                c1.p pVar = (c1.p) this.R;
                n3.b bVar = (n3.b) this.X;
                String str3 = (String) this.Y;
                String str4 = (String) this.Z;
                w0 w0Var2 = (w0) this.f7061b0;
                mc.a aVar3 = (mc.a) this.f7062c0;
                mc.a aVar4 = (mc.a) this.f7063d0;
                n2.m mVar2 = (n2.m) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                r rVar2 = (r) mVar2;
                if (rVar2.O(intValue & 1, z10)) {
                    float f8 = 4;
                    b3.m mVar3 = b3.m.f1770a;
                    b3.p B = l1.c.B(l1.c.t(mVar3, f8), t0.Min);
                    w a10 = u.a(l1.i.f8573c, b3.c.f1758g0, rVar2, 0);
                    int hashCode = Long.hashCode(rVar2.T);
                    v2.g l10 = rVar2.l();
                    b3.p c4 = b3.a.c(B, rVar2);
                    a4.h.f220a.getClass();
                    f0 f0Var2 = a4.g.f212b;
                    rVar2.b0();
                    if (rVar2.S) {
                        rVar2.k(f0Var2);
                    } else {
                        rVar2.k0();
                    }
                    a4.f fVar4 = a4.g.f215e;
                    s.C(a10, fVar4, rVar2);
                    a4.f fVar5 = a4.g.f214d;
                    s.C(l10, fVar5, rVar2);
                    Integer valueOf = Integer.valueOf(hashCode);
                    a4.f fVar6 = a4.g.f216f;
                    s.u(rVar2, valueOf, fVar6);
                    a4.e eVar2 = a4.g.f217g;
                    s.y(rVar2, eVar2);
                    a4.f fVar7 = a4.g.f213c;
                    s.C(c4, fVar7, rVar2);
                    if (((Boolean) rVar2.j(d2.f1832a)).booleanValue()) {
                        rVar2.X(-1061882019);
                        l1.p.a(n.f(l1.c.x(l1.c.h(r1.b(mVar3, 1.0f)), f8, f8, f8, 0.0f, 8), i3.s.f6682c, z.f6703b), rVar2, 6);
                        rVar2.p(false);
                        aVar = aVar3;
                        fVar = fVar7;
                        fVar2 = fVar5;
                        str = str4;
                        aVar2 = aVar4;
                        mVar = mVar3;
                        f0Var = f0Var2;
                        rVar = rVar2;
                        z11 = false;
                        fVar3 = fVar6;
                        w0Var = w0Var2;
                        eVar = eVar2;
                    } else {
                        rVar2.X(-1061699212);
                        if (y1Var != null && pVar != null) {
                            rVar2.X(-1061627261);
                            b3.p x9 = l1.c.x(mVar3, f8, f8, f8, 0.0f, 8);
                            if (str3 == null) {
                                str2 = "";
                            } else {
                                str2 = str3;
                            }
                            b3.p h2 = l1.c.h(r1.b(y1.e(y1Var, x9, y1.c(str2, rVar2), pVar), 1.0f));
                            f0Var = f0Var2;
                            w0Var = w0Var2;
                            eVar = eVar2;
                            fVar2 = fVar5;
                            rVar = rVar2;
                            aVar = aVar3;
                            fVar = fVar7;
                            str = str4;
                            aVar2 = aVar4;
                            fVar3 = fVar6;
                            z11 = false;
                            n.b(bVar, h2, null, null, 0.0f, rVar, 56, 120);
                            rVar.p(false);
                            mVar = mVar3;
                        } else {
                            aVar = aVar3;
                            fVar = fVar7;
                            fVar2 = fVar5;
                            str = str4;
                            aVar2 = aVar4;
                            f0Var = f0Var2;
                            rVar = rVar2;
                            z11 = false;
                            fVar3 = fVar6;
                            w0Var = w0Var2;
                            eVar = eVar2;
                            rVar.X(-1060871822);
                            mVar = mVar3;
                            n.b(bVar, l1.c.h(r1.b(l1.c.x(mVar3, f8, f8, f8, 0.0f, 8), 1.0f)), null, null, 0.0f, rVar, 440, 120);
                            rVar.p(false);
                        }
                        rVar.p(z11);
                    }
                    b3.p x10 = l1.c.x(r1.b(mVar, 1.0f), 8, 0.0f, 0.0f, 0.0f, 14);
                    o1 a11 = m1.a(l1.i.f8571a, b3.c.f1756e0, rVar, 48);
                    int hashCode2 = Long.hashCode(rVar.T);
                    v2.g l11 = rVar.l();
                    b3.p c10 = b3.a.c(x10, rVar);
                    rVar.b0();
                    if (rVar.S) {
                        rVar.k(f0Var);
                    } else {
                        rVar.k0();
                    }
                    s.C(a11, fVar4, rVar);
                    s.C(l11, fVar2, rVar);
                    w.d.x(hashCode2, rVar, fVar3, rVar, eVar);
                    s.C(c10, fVar, rVar);
                    if (1.0f <= 0.0d) {
                        m1.a.a("invalid weight; must be greater than zero");
                    }
                    r rVar3 = rVar;
                    boolean z12 = z11;
                    w0 w0Var3 = w0Var;
                    mc.a aVar5 = aVar2;
                    mc.a aVar6 = aVar;
                    e7.b(str, new l1.w0(1.0f, true), 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, null, rVar3, 0, 3120, 120828);
                    if (this.B) {
                        rVar3.X(1139922924);
                        Object L = rVar3.L();
                        if (L == n2.l.f9953a) {
                            L = new ai.s(w0Var3, 6);
                            rVar3.h0(L);
                        }
                        g2.y1.a((mc.a) L, null, false, v2.h.c(120533037, new d(0, aVar6, aVar5, w0Var3), rVar3), rVar3, 24582, 14);
                        rVar3.p(z12);
                    } else {
                        rVar3.X(1141245260);
                        rVar3.p(z12);
                    }
                    rVar3.p(true);
                    rVar3.p(true);
                } else {
                    rVar2.R();
                }
                return y.f14813a;
            default:
                ((Integer) obj2).getClass();
                k0.d.e((b3.p) this.L, (x) this.R, (h1) this.X, (l1.f) this.Y, (b3.g) this.Z, (q0) this.f7061b0, this.B, (f1.i) this.f7062c0, (mc.l) this.f7063d0, (n2.m) obj, s.F(24961));
                return y.f14813a;
        }
    }

    public /* synthetic */ b(y1 y1Var, c1.p pVar, n3.b bVar, String str, String str2, boolean z10, w0 w0Var, mc.a aVar, mc.a aVar2) {
        this.L = y1Var;
        this.R = pVar;
        this.X = bVar;
        this.Y = str;
        this.Z = str2;
        this.B = z10;
        this.f7061b0 = w0Var;
        this.f7062c0 = aVar;
        this.f7063d0 = aVar2;
    }
}
