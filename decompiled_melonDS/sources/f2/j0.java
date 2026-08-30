package f2;

import n2.s2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class j0 implements mc.q {
    public final /* synthetic */ int A = 0;
    public final /* synthetic */ mc.l B;
    public final /* synthetic */ mc.a L;

    public /* synthetic */ j0(mc.a aVar, mc.l lVar) {
        this.L = aVar;
        this.B = lVar;
    }

    @Override // mc.q
    public final Object i(Object obj, Object obj2, Object obj3) {
        boolean z10;
        switch (this.A) {
            case 0:
                b3.p pVar = (b3.p) obj;
                ((Integer) obj3).getClass();
                n2.r rVar = (n2.r) ((n2.m) obj2);
                rVar.X(759876635);
                Object L = rVar.L();
                n2.e eVar = n2.l.f9953a;
                if (L == eVar) {
                    L = n2.s.q(this.L);
                    rVar.h0(L);
                }
                s2 s2Var = (s2) L;
                Object L2 = rVar.L();
                if (L2 == eVar) {
                    L2 = new d1.c(new h3.b(((h3.b) s2Var.getValue()).f6050a), k0.f4751b, new h3.b(k0.f4752c), 8);
                    rVar.h0(L2);
                }
                d1.c cVar = (d1.c) L2;
                boolean h2 = rVar.h(cVar);
                Object L3 = rVar.L();
                if (h2 || L3 == eVar) {
                    L3 = new a2.o(s2Var, cVar, (cc.c) null, 16);
                    rVar.h0(L3);
                }
                n2.s.g(yb.y.f14813a, (mc.p) L3, rVar);
                d1.k kVar = cVar.f3525c;
                boolean f8 = rVar.f(kVar);
                Object L4 = rVar.L();
                if (f8 || L4 == eVar) {
                    L4 = new b7.x(kVar, 1);
                    rVar.h0(L4);
                }
                b3.p pVar2 = (b3.p) this.B.k((mc.a) L4);
                rVar.p(false);
                return pVar2;
            default:
                n2.m mVar = (n2.m) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((l1.x) obj).getClass();
                if ((intValue & 17) != 16) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                n2.r rVar2 = (n2.r) mVar;
                if (rVar2.O(intValue & 1, z10)) {
                    mc.l lVar = this.B;
                    boolean f10 = rVar2.f(lVar);
                    Object L5 = rVar2.L();
                    Object obj4 = n2.l.f9953a;
                    if (f10 || L5 == obj4) {
                        L5 = new ai.b0(lVar, 7);
                        rVar2.h0(L5);
                    }
                    g2.s.b((mc.a) L5, null, false, null, zg.a.f15080a, rVar2, 196608, 30);
                    boolean f11 = rVar2.f(lVar);
                    Object L6 = rVar2.L();
                    if (f11 || L6 == obj4) {
                        L6 = new ai.b0(lVar, 8);
                        rVar2.h0(L6);
                    }
                    g2.s.b((mc.a) L6, null, false, null, zg.a.f15081b, rVar2, 196608, 30);
                    g2.s.b(this.L, null, false, null, zg.a.f15082c, rVar2, 196608, 30);
                } else {
                    rVar2.R();
                }
                return yb.y.f14813a;
        }
    }

    public /* synthetic */ j0(mc.l lVar, mc.a aVar) {
        this.B = lVar;
        this.L = aVar;
    }
}
