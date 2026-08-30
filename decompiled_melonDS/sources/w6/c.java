package w6;

import java.util.LinkedHashMap;
import nc.k;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashMap f14161a = new LinkedHashMap();

    public abstract Object a(b bVar);

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            if (k.a(this.f14161a, ((c) obj).f14161a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f14161a.hashCode();
    }

    public final String toString() {
        return "CreationExtras(extras=" + this.f14161a + ')';
    }
}
