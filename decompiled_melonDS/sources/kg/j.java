package kg;

import nc.k;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final String f8301a;

    public j(String str) {
        this.f8301a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof j) && k.a(this.f8301a, ((j) obj).f8301a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f8301a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return kc.a.g("OpenScreenEvent(newTitle=", this.f8301a, ")");
    }
}
