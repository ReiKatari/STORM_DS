package n2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class t0 implements mc.l {
    public final /* synthetic */ int A;
    public final /* synthetic */ mc.l B;

    public /* synthetic */ t0(mc.l lVar, int i2) {
        this.A = i2;
        this.B = lVar;
    }

    @Override // mc.l
    public final Object k(Object obj) {
        long j2;
        switch (this.A) {
            case 0:
                return this.B.k(Long.valueOf(((Number) obj).longValue() / 1000000));
            default:
                z2.j jVar = (z2.j) obj;
                synchronized (z2.l.f14919c) {
                    j2 = z2.l.f14921e;
                    z2.l.f14921e = 1 + j2;
                }
                return new z2.e(j2, jVar, this.B);
        }
    }
}
