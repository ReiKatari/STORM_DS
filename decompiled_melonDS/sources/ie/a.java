package ie;

import nc.k;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f7042a;

    public a(String str) {
        str.getClass();
        this.f7042a = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof a) || !k.a(this.f7042a, ((a) obj).f7042a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.f7042a.hashCode();
    }

    public final String toString() {
        return kc.a.g("CheatDatabaseEntity(id=null, name=", this.f7042a, ")");
    }
}
