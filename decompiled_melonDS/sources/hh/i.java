package hh;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i extends o {

    /* renamed from: a  reason: collision with root package name */
    public final String f6532a;

    public i(String str) {
        this.f6532a = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof i) || !this.f6532a.equals(((i) obj).f6532a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.f6532a.hashCode();
    }

    public final String toString() {
        return kc.a.g("RomNotFoundError(romPath=", this.f6532a, ")");
    }
}
