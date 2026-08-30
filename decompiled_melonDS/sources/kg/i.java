package kg;

import me.magnum.melonds.domain.model.Cheat;
import nc.k;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final Cheat f8299a;

    /* renamed from: b  reason: collision with root package name */
    public final oe.c f8300b;

    public i(Cheat cheat, oe.c cVar) {
        cheat.getClass();
        this.f8299a = cheat;
        this.f8300b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof i) {
                i iVar = (i) obj;
                if (!k.a(this.f8299a, iVar.f8299a) || !this.f8300b.equals(iVar.f8300b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f8300b.hashCode() + (this.f8299a.hashCode() * 31);
    }

    public final String toString() {
        return "DeletedCheat(cheat=" + this.f8299a + ", folder=" + this.f8300b + ")";
    }
}
