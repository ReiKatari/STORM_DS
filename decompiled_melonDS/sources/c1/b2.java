package c1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b2 extends nc.l implements mc.q {
    public final /* synthetic */ int B;
    public final /* synthetic */ Object L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b2(int i2, Object obj) {
        super(3);
        this.B = i2;
        this.L = obj;
    }

    @Override // mc.q
    public final Object i(Object obj, Object obj2, Object obj3) {
        switch (this.B) {
            case 0:
                y3.s0 s0Var = (y3.s0) obj;
                ((Number) obj3).intValue();
                n2.r rVar = (n2.r) ((n2.m) obj2);
                Object L = rVar.L();
                n2.e eVar = n2.l.f9953a;
                if (L == eVar) {
                    L = n2.s.o(rVar);
                    rVar.h0(L);
                }
                zc.u uVar = (zc.u) L;
                Object L2 = rVar.L();
                if (L2 == eVar) {
                    L2 = new y1(s0Var, uVar);
                    rVar.h0(L2);
                }
                y1 y1Var = (y1) L2;
                ((v2.c) this.L).r(y1Var, new d2(y1Var), rVar, 6);
                return yb.y.f14813a;
            default:
                y3.i1 e6 = ((y3.u0) obj2).e(((x4.a) obj3).f14337a);
                return ((y3.x0) obj).u0(e6.A, e6.B, zb.r.A, new a5.n(8, e6, (l0) this.L));
        }
    }
}
