package a5;

import y3.q1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d extends nc.l implements mc.p {
    public final /* synthetic */ int B;
    public final /* synthetic */ int L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object X;
    public final /* synthetic */ mc.p Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj, Object obj2, mc.p pVar, int i2, int i10) {
        super(2);
        this.B = i10;
        this.R = obj;
        this.X = obj2;
        this.Y = pVar;
        this.L = i2;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        int i2 = this.B;
        n2.m mVar = (n2.m) obj;
        ((Number) obj2).intValue();
        switch (i2) {
            case 0:
                k0.d.a((mc.a) this.R, (f0) this.X, (v2.c) this.Y, mVar, n2.s.F(this.L | 1));
                return yb.y.f14813a;
            default:
                y3.c0.c((q1) this.R, (b3.p) this.X, this.Y, mVar, n2.s.F(this.L | 1));
                return yb.y.f14813a;
        }
    }
}
