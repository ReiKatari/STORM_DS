package y3;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class t1 extends nc.l implements mc.p {
    public final /* synthetic */ int B;
    public final /* synthetic */ s[] L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t1(s[] sVarArr, int i2) {
        super(2);
        this.B = i2;
        this.L = sVarArr;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        switch (this.B) {
            case 0:
                return Float.valueOf(c0.e((h1) obj, true, this.L, ((Number) obj2).floatValue()));
            default:
                return Float.valueOf(c0.e((h1) obj, false, this.L, ((Number) obj2).floatValue()));
        }
    }
}
