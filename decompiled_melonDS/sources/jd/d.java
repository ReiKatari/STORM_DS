package jd;

import a2.n;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d extends nd.b {

    /* renamed from: a  reason: collision with root package name */
    public final nc.e f7807a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f7808b;

    public d(nc.e eVar) {
        eVar.getClass();
        this.f7807a = eVar;
        this.f7808b = p7.a.s(yb.h.PUBLICATION, new n(24, this));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [yb.f, java.lang.Object] */
    @Override // jd.a
    public final ld.e e() {
        return (ld.e) this.f7808b.getValue();
    }

    @Override // nd.b
    public final nc.e h() {
        return this.f7807a;
    }

    public final String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + this.f7807a + ')';
    }
}
