package b7;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class o implements mc.p {
    public final /* synthetic */ a7.i A;
    public final /* synthetic */ r B;
    public final /* synthetic */ y2.d L;
    public final /* synthetic */ z2.p R;
    public final /* synthetic */ q X;

    public o(a7.i iVar, r rVar, y2.e eVar, z2.p pVar, q qVar) {
        this.A = iVar;
        this.B = rVar;
        this.L = eVar;
        this.R = pVar;
        this.X = qVar;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        n2.m mVar = (n2.m) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            n2.r rVar = (n2.r) mVar;
            if (rVar.A()) {
                rVar.R();
                return yb.y.f14813a;
            }
        }
        n2.r rVar2 = (n2.r) mVar;
        a7.i iVar = this.A;
        boolean h2 = rVar2.h(iVar);
        r rVar3 = this.B;
        boolean h10 = h2 | rVar2.h(rVar3);
        Object L = rVar2.L();
        if (h10 || L == n2.l.f9953a) {
            L = new ai.c0(this.R, iVar, rVar3, 1);
            rVar2.h0(L);
        }
        n2.s.d(iVar, (mc.l) L, rVar2);
        k7.w.c(iVar, this.L, v2.h.c(-497631156, new m(0, this.X, iVar), rVar2), rVar2, 384);
        return yb.y.f14813a;
    }
}
