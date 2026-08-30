package ve;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final h f13809a;

    /* renamed from: b  reason: collision with root package name */
    public final h f13810b;

    public i(h hVar, h hVar2) {
        hVar.getClass();
        this.f13809a = hVar;
        this.f13810b = hVar2;
    }

    public static i a(i iVar, h hVar) {
        h hVar2 = iVar.f13809a;
        iVar.getClass();
        hVar2.getClass();
        return new i(hVar2, hVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (nc.k.a(this.f13809a, iVar.f13809a) && nc.k.a(this.f13810b, iVar.f13810b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f13809a.hashCode() * 31;
        h hVar = this.f13810b;
        if (hVar == null) {
            hashCode = 0;
        } else {
            hashCode = hVar.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "LayoutDisplayPair(mainScreenDisplay=" + this.f13809a + ", secondaryScreenDisplay=" + this.f13810b + ")";
    }
}
