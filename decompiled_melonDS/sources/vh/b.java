package vh;

import java.util.UUID;
import nc.k;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final UUID f13835a;

    /* renamed from: b  reason: collision with root package name */
    public final a f13836b;

    public b(UUID uuid, a aVar) {
        aVar.getClass();
        this.f13835a = uuid;
        this.f13836b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (k.a(this.f13835a, bVar.f13835a) && this.f13836b == bVar.f13836b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        UUID uuid = this.f13835a;
        if (uuid == null) {
            hashCode = 0;
        } else {
            hashCode = uuid.hashCode();
        }
        return this.f13836b.hashCode() + (hashCode * 31);
    }

    public final String toString() {
        return "SelectedLayout(layoutId=" + this.f13835a + ", reason=" + this.f13836b + ")";
    }
}
