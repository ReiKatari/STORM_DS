package sh;

import nc.k;
import ve.n;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final n f12919a;

    /* renamed from: b  reason: collision with root package name */
    public final ve.d f12920b;

    public a(n nVar, ve.d dVar) {
        nVar.getClass();
        dVar.getClass();
        this.f12919a = nVar;
        this.f12920b = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (k.a(this.f12919a, aVar.f12919a) && this.f12920b == aVar.f12920b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f12920b.hashCode() + (this.f12919a.hashCode() * 31);
    }

    public final String toString() {
        return "CurrentLayoutState(layout=" + this.f12919a + ", orientation=" + this.f12920b + ")";
    }
}
