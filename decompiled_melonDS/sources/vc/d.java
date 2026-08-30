package vc;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final String f13788a;

    /* renamed from: b  reason: collision with root package name */
    public final sc.d f13789b;

    public d(String str, sc.d dVar) {
        this.f13788a = str;
        this.f13789b = dVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (!this.f13788a.equals(dVar.f13788a) || !this.f13789b.equals(dVar.f13789b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f13789b.hashCode() + (this.f13788a.hashCode() * 31);
    }

    public final String toString() {
        return "MatchGroup(value=" + this.f13788a + ", range=" + this.f13789b + ')';
    }
}
