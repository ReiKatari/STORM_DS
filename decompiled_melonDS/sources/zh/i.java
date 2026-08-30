package zh;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i extends p {

    /* renamed from: a  reason: collision with root package name */
    public final String f15128a;

    public i(String str) {
        this.f15128a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof i) && nc.k.a(this.f15128a, ((i) obj).f15128a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f15128a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return kc.a.g("CustomNameUpdate(customName=", this.f15128a, ")");
    }
}
