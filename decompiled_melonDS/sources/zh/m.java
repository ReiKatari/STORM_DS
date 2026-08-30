package zh;

import java.util.UUID;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class m extends p {

    /* renamed from: a  reason: collision with root package name */
    public final UUID f15132a;

    public m(UUID uuid) {
        this.f15132a = uuid;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof m) && nc.k.a(this.f15132a, ((m) obj).f15132a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        UUID uuid = this.f15132a;
        if (uuid == null) {
            return 0;
        }
        return uuid.hashCode();
    }

    public final String toString() {
        return "LayoutUpdate(newLayoutId=" + this.f15132a + ")";
    }
}
