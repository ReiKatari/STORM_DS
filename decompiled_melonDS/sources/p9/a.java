package p9;

import a0.j;
import c9.l;
import m9.k;
import m9.q;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a implements e {

    /* renamed from: b  reason: collision with root package name */
    public final int f11517b;

    public a(int i2) {
        this.f11517b = i2;
        if (i2 > 0) {
            return;
        }
        j.h("durationMillis must be > 0.");
        throw null;
    }

    @Override // p9.e
    public final f a(l lVar, k kVar) {
        if (!(kVar instanceof q)) {
            return new d(lVar, kVar);
        }
        if (((q) kVar).f9445c == d9.f.MEMORY_CACHE) {
            return new d(lVar, kVar);
        }
        return new b(lVar, kVar, this.f11517b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            if (this.f11517b == ((a) obj).f11517b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.f11517b * 31);
    }
}
