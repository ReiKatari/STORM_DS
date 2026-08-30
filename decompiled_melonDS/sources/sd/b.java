package sd;

import nc.k;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final Object f12866a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f12867b;

    public b(boolean z10, Object obj) {
        this.f12866a = obj;
        this.f12867b = z10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (!k.a(this.f12866a, bVar.f12866a) || this.f12867b != bVar.f12867b) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        Object obj = this.f12866a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return Boolean.hashCode(this.f12867b) + (hashCode * 31);
    }

    public final String toString() {
        return "Deletable(data=" + this.f12866a + ", isDeleted=" + this.f12867b + ")";
    }
}
