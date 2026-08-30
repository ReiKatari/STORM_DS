package n0;

import java.util.Map;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final Map f9741a;

    /* renamed from: b  reason: collision with root package name */
    public final int f9742b;

    public i(int i2, Map map) {
        map.getClass();
        this.f9741a = map;
        this.f9742b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (nc.k.a(this.f9741a, iVar.f9741a) && this.f9742b == iVar.f9742b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f9742b) + (this.f9741a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StreamSpecQueryResult(streamSpecs=");
        sb2.append(this.f9741a);
        sb2.append(", maxSupportedFrameRate=");
        return w.d.p(sb2, this.f9742b, ')');
    }
}
