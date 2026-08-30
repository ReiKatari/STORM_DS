package y8;

import android.net.NetworkRequest;
import p8.v;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: b  reason: collision with root package name */
    public static final String f14795b = v.g("NetworkRequestCompat");

    /* renamed from: a  reason: collision with root package name */
    public final Object f14796a;

    public f(NetworkRequest networkRequest) {
        this.f14796a = networkRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof f) && nc.k.a(this.f14796a, ((f) obj).f14796a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f14796a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "NetworkRequestCompat(wrapped=" + this.f14796a + ')';
    }
}
