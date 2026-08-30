package s0;

import java.util.ArrayList;
import m9.o;
import r0.l;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final l f12784a;

    /* renamed from: b  reason: collision with root package name */
    public final l f12785b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f12786c;

    public b(l lVar, l lVar2, ArrayList arrayList) {
        if (lVar != null) {
            this.f12784a = lVar;
            if (lVar2 != null) {
                this.f12785b = lVar2;
                this.f12786c = arrayList;
                return;
            }
            o.i("Null secondarySurfaceEdge");
            throw null;
        }
        o.i("Null primarySurfaceEdge");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f12784a.equals(bVar.f12784a) && this.f12785b.equals(bVar.f12785b) && this.f12786c.equals(bVar.f12786c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.f12784a.hashCode() ^ 1000003) * 1000003) ^ this.f12785b.hashCode()) * 1000003) ^ this.f12786c.hashCode();
    }

    public final String toString() {
        return "In{primarySurfaceEdge=" + this.f12784a + ", secondarySurfaceEdge=" + this.f12785b + ", outConfigs=" + this.f12786c + "}";
    }
}
