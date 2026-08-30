package c1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d0 extends nc.l implements mc.q {
    public final /* synthetic */ mc.l B;
    public final /* synthetic */ d1.q1 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(mc.l lVar, d1.q1 q1Var) {
        super(3);
        this.B = lVar;
        this.L = q1Var;
    }

    @Override // mc.q
    public final Object i(Object obj, Object obj2, Object obj3) {
        long j2;
        y3.x0 x0Var = (y3.x0) obj;
        y3.i1 e6 = ((y3.u0) obj2).e(((x4.a) obj3).f14337a);
        if (x0Var.q()) {
            if (!((Boolean) this.B.k(this.L.f3652d.getValue())).booleanValue()) {
                j2 = 0;
                return x0Var.u0((int) (j2 >> 32), (int) (4294967295L & j2), zb.r.A, new c0(e6, 0));
            }
        }
        j2 = (e6.A << 32) | (e6.B & 4294967295L);
        return x0Var.u0((int) (j2 >> 32), (int) (4294967295L & j2), zb.r.A, new c0(e6, 0));
    }
}
