package n1;

import h1.n1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e implements p1.q {

    /* renamed from: a  reason: collision with root package name */
    public final x f9761a;

    public e(x xVar) {
        this.f9761a = xVar;
    }

    @Override // p1.q
    public final int a() {
        return this.f9761a.i().f9812n;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List, java.lang.Object] */
    @Override // p1.q
    public final int b() {
        return Math.min(a() - 1, ((q) zb.l.Z(this.f9761a.i().f9810k)).f9816a);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Collection, java.lang.Object] */
    @Override // p1.q
    public final boolean c() {
        return !this.f9761a.i().f9810k.isEmpty();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List, java.lang.Object] */
    @Override // p1.q
    public final int d() {
        long g10;
        int i2;
        x xVar = this.f9761a;
        if (xVar.i().f9810k.isEmpty()) {
            return 0;
        }
        p i10 = xVar.i();
        if (i10.f9813o == n1.Vertical) {
            g10 = i10.g() & 4294967295L;
        } else {
            g10 = i10.g() >> 32;
        }
        int i11 = (int) g10;
        int K = l0.f.K(xVar.i());
        if (K == 0 || (i2 = i11 / K) < 1) {
            return 1;
        }
        return i2;
    }

    @Override // p1.q
    public final int e() {
        return Math.max(0, this.f9761a.g());
    }
}
