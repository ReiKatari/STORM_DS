package je;

import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final d f7848a;

    /* renamed from: b  reason: collision with root package name */
    public final List f7849b;

    public g(d dVar, List list) {
        this.f7848a = dVar;
        this.f7849b = list;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof g) {
                g gVar = (g) obj;
                if (!this.f7848a.equals(gVar.f7848a) || !this.f7849b.equals(gVar.f7849b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f7849b.hashCode() + (this.f7848a.hashCode() * 31);
    }

    public final String toString() {
        return "RAGameWithSetsEntity(game=" + this.f7848a + ", sets=" + this.f7849b + ")";
    }
}
