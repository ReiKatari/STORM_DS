package oi;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final String f11050a;

    /* renamed from: b  reason: collision with root package name */
    public final String f11051b;

    public j(String str, String str2) {
        this.f11050a = str;
        this.f11051b = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof j) {
                j jVar = (j) obj;
                if (!this.f11050a.equals(jVar.f11050a) || !this.f11051b.equals(jVar.f11051b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f11051b.hashCode() + (this.f11050a.hashCode() * 31);
    }

    public final String toString() {
        return "RAUserAuth(username=" + this.f11050a + ", token=" + this.f11051b + ")";
    }
}
