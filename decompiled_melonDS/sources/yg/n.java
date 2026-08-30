package yg;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class n extends o {

    /* renamed from: a  reason: collision with root package name */
    public final String f14829a;

    public n(String str) {
        str.getClass();
        this.f14829a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof n) && nc.k.a(this.f14829a, ((n) obj).f14829a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f14829a.hashCode();
    }

    public final String toString() {
        return kc.a.g("ImportSuccess(fileName=", this.f14829a, ")");
    }
}
