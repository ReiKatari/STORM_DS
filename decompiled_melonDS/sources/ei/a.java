package ei;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a extends c {

    /* renamed from: a  reason: collision with root package name */
    public final String f4501a;

    public a(String str) {
        this.f4501a = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof a) || !this.f4501a.equals(((a) obj).f4501a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.f4501a.hashCode();
    }

    public final String toString() {
        return kc.a.g("LoggedIn(accountName=", this.f4501a, ")");
    }
}
