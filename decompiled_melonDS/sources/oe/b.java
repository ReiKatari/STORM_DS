package oe;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final Long f10910a;

    /* renamed from: b  reason: collision with root package name */
    public final String f10911b;

    public b(Long l10, String str) {
        str.getClass();
        this.f10910a = l10;
        this.f10911b = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (!this.f10910a.equals(bVar.f10910a) || !nc.k.a(this.f10911b, bVar.f10911b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f10911b.hashCode() + (this.f10910a.hashCode() * 31);
    }

    public final String toString() {
        return "CheatDatabase(id=" + this.f10910a + ", name=" + this.f10911b + ")";
    }
}
