package f2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class l implements a5.q0 {
    public final b3.d A;
    public final m B;
    public long L = 0;

    public l(b3.d dVar, m mVar) {
        this.A = dVar;
        this.B = mVar;
    }

    @Override // a5.q0
    public final long d(x4.k kVar, long j2, x4.m mVar, long j10) {
        long a10 = this.B.a();
        if ((9223372034707292159L & a10) == 9205357640488583168L) {
            a10 = this.L;
        }
        this.L = a10;
        return x4.j.c(x4.j.c(kVar.b(), p7.n.u(a10)), this.A.a(j10, 0L, mVar));
    }
}
