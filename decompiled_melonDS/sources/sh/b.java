package sh;

import java.util.UUID;
import nc.k;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final UUID f12921a;

    /* renamed from: b  reason: collision with root package name */
    public final ve.a f12922b;

    public b(UUID uuid, ve.a aVar) {
        aVar.getClass();
        this.f12921a = uuid;
        this.f12922b = aVar;
    }

    public static b a(b bVar, UUID uuid, ve.a aVar, int i2) {
        if ((i2 & 1) != 0) {
            uuid = bVar.f12921a;
        }
        if ((i2 & 2) != 0) {
            aVar = bVar.f12922b;
        }
        aVar.getClass();
        return new b(uuid, aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (k.a(this.f12921a, bVar.f12921a) && this.f12922b == bVar.f12922b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        UUID uuid = this.f12921a;
        if (uuid == null) {
            hashCode = 0;
        } else {
            hashCode = uuid.hashCode();
        }
        return this.f12922b.hashCode() + (hashCode * 31);
    }

    public final String toString() {
        return "LayoutBackgroundProperties(backgroundId=" + this.f12921a + ", backgroundMode=" + this.f12922b + ")";
    }
}
