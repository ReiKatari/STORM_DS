package x8;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final String f14382a;

    /* renamed from: b  reason: collision with root package name */
    public final Long f14383b;

    public c(Long l10, String str) {
        this.f14382a = str;
        this.f14383b = l10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (!this.f14382a.equals(cVar.f14382a) || !this.f14383b.equals(cVar.f14383b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f14383b.hashCode() + (this.f14382a.hashCode() * 31);
    }

    public final String toString() {
        return "Preference(key=" + this.f14382a + ", value=" + this.f14383b + ')';
    }
}
