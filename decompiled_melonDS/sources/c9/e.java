package c9;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e extends g {

    /* renamed from: a  reason: collision with root package name */
    public final n3.b f2729a;

    public e(n3.b bVar) {
        this.f2729a = bVar;
    }

    @Override // c9.g
    public final n3.b a() {
        return this.f2729a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof e) && nc.k.a(this.f2729a, ((e) obj).f2729a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        n3.b bVar = this.f2729a;
        if (bVar == null) {
            return 0;
        }
        return bVar.hashCode();
    }

    public final String toString() {
        return "Loading(painter=" + this.f2729a + ')';
    }
}
