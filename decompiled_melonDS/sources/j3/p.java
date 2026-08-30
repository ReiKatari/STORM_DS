package j3;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class p extends nc.l implements mc.l {
    public final /* synthetic */ int B;
    public final /* synthetic */ q L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(q qVar, int i2) {
        super(1);
        this.B = i2;
        this.L = qVar;
    }

    @Override // mc.l
    public final Object k(Object obj) {
        switch (this.B) {
            case 0:
                double doubleValue = ((Number) obj).doubleValue();
                q qVar = this.L;
                return Double.valueOf(qVar.f7401n.a(p7.j.e(doubleValue, qVar.f7393e, qVar.f7394f)));
            default:
                double doubleValue2 = ((Number) obj).doubleValue();
                q qVar2 = this.L;
                return Double.valueOf(p7.j.e(qVar2.f7399k.a(doubleValue2), qVar2.f7393e, qVar2.f7394f));
        }
    }
}
