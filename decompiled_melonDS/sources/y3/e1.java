package y3;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e1 extends b3.o implements a4.z {

    /* renamed from: i0  reason: collision with root package name */
    public mc.l f14677i0;

    /* renamed from: j0  reason: collision with root package name */
    public long f14678j0;

    @Override // b3.o
    public final boolean D0() {
        return true;
    }

    @Override // a4.z
    public final void o(long j2) {
        if (!x4.l.b(this.f14678j0, j2)) {
            this.f14677i0.k(new x4.l(j2));
            this.f14678j0 = j2;
        }
    }
}
