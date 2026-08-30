package hh;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c0 extends pc.a {

    /* renamed from: d  reason: collision with root package name */
    public final String f6512d;

    public c0(String str) {
        this.f6512d = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof c0) || !this.f6512d.equals(((c0) obj).f6512d)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.f6512d.hashCode();
    }

    public final String toString() {
        return kc.a.g("RomPath(path=", this.f6512d, ")");
    }
}
