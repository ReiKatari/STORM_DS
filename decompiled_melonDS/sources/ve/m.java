package ve;

import java.util.List;
import java.util.UUID;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final UUID f13818a;

    /* renamed from: b  reason: collision with root package name */
    public final a f13819b;

    /* renamed from: c  reason: collision with root package name */
    public final List f13820c;

    public m(UUID uuid, a aVar, List list) {
        aVar.getClass();
        this.f13818a = uuid;
        this.f13819b = aVar;
        this.f13820c = list;
    }

    public static m a(m mVar, UUID uuid, a aVar, List list, int i2) {
        if ((i2 & 1) != 0) {
            uuid = mVar.f13818a;
        }
        if ((i2 & 2) != 0) {
            aVar = mVar.f13819b;
        }
        if ((i2 & 4) != 0) {
            list = mVar.f13820c;
        }
        mVar.getClass();
        aVar.getClass();
        return new m(uuid, aVar, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (nc.k.a(this.f13818a, mVar.f13818a) && this.f13819b == mVar.f13819b && nc.k.a(this.f13820c, mVar.f13820c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i2 = 0;
        UUID uuid = this.f13818a;
        if (uuid == null) {
            hashCode = 0;
        } else {
            hashCode = uuid.hashCode();
        }
        int hashCode2 = (this.f13819b.hashCode() + (hashCode * 31)) * 31;
        List list = this.f13820c;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "ScreenLayout(backgroundId=" + this.f13818a + ", backgroundMode=" + this.f13819b + ", components=" + this.f13820c + ")";
    }

    public m(List list) {
        this(null, a.FIT_CENTER, list);
    }
}
