package gk;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class z extends pi.g0 {
    public final pi.t L;
    public final long R;

    public z(pi.t tVar, long j2) {
        this.L = tVar;
        this.R = j2;
    }

    @Override // pi.g0
    public final long d() {
        return this.R;
    }

    @Override // pi.g0
    public final pi.t i() {
        return this.L;
    }

    @Override // pi.g0
    public final fj.g m() {
        throw new IllegalStateException("Cannot read raw response body of a converted body.");
    }
}
