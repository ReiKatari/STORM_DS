package n1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements mc.l {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;

    public /* synthetic */ g(int i2, Object obj) {
        this.A = i2;
        this.B = obj;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, ld.e] */
    @Override // mc.l
    public final Object k(Object obj) {
        Integer num = (Integer) obj;
        switch (this.A) {
            case 0:
                num.intValue();
                return this.B;
            default:
                int intValue = num.intValue();
                StringBuilder sb2 = new StringBuilder();
                ?? r12 = this.B;
                sb2.append(r12.e(intValue));
                sb2.append(": ");
                sb2.append(r12.j(intValue).b());
                return sb2.toString();
        }
    }
}
