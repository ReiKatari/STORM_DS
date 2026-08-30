package g3;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class o extends nc.l implements mc.l {
    public final /* synthetic */ nc.t B;
    public final /* synthetic */ int L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(nc.t tVar, int i2) {
        super(1);
        this.B = tVar;
        this.L = i2;
    }

    @Override // mc.l
    public final Object k(Object obj) {
        Boolean valueOf = Boolean.valueOf(((g0) obj).V0(this.L));
        this.B.A = valueOf;
        return valueOf;
    }
}
