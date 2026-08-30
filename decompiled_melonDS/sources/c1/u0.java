package c1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class u0 extends nc.l implements mc.l {
    public final /* synthetic */ boolean B;
    public final /* synthetic */ mc.a L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(mc.a aVar, boolean z10) {
        super(1);
        this.B = z10;
        this.L = aVar;
    }

    @Override // mc.l
    public final Object k(Object obj) {
        boolean z10;
        i3.k0 k0Var = (i3.k0) obj;
        if (!this.B && ((Boolean) this.L.b()).booleanValue()) {
            z10 = true;
        } else {
            z10 = false;
        }
        k0Var.g(z10);
        return yb.y.f14813a;
    }
}
