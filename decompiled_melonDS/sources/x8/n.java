package x8;

import p8.e0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public String f14401a;

    /* renamed from: b  reason: collision with root package name */
    public e0 f14402b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (nc.k.a(this.f14401a, nVar.f14401a) && this.f14402b == nVar.f14402b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f14402b.hashCode() + (this.f14401a.hashCode() * 31);
    }

    public final String toString() {
        return "IdAndState(id=" + this.f14401a + ", state=" + this.f14402b + ')';
    }
}
