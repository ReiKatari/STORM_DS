package te;

import nc.k;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f extends g {

    /* renamed from: a  reason: collision with root package name */
    public final ze.a f13183a;

    public f(ze.a aVar) {
        aVar.getClass();
        this.f13183a = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof f) && k.a(this.f13183a, ((f) obj).f13183a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f13183a.hashCode();
    }

    public final String toString() {
        return "Success(rom=" + this.f13183a + ")";
    }
}
