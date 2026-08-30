package c1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class l extends nc.l implements mc.p {
    public static final l L = new l(2, 0);
    public static final l R = new l(2, 1);
    public final /* synthetic */ int B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(int i2, int i10) {
        super(i2);
        this.B = i10;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        boolean z10;
        switch (this.B) {
            case 0:
                long j2 = ((x4.l) obj).f14346a;
                long j10 = ((x4.l) obj2).f14346a;
                long j11 = 1;
                return d1.d.q(1, new x4.l((j11 & 4294967295L) | (j11 << 32)));
            default:
                m0 m0Var = (m0) obj2;
                if (((m0) obj) == m0Var && m0Var == m0.PostExit) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
        }
    }
}
