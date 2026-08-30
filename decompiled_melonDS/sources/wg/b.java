package wg;

import nc.k;
import te.g;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b extends c {

    /* renamed from: a  reason: collision with root package name */
    public final g f14216a;

    public b(g gVar) {
        gVar.getClass();
        this.f14216a = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof b) && k.a(this.f14216a, ((b) obj).f14216a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f14216a.hashCode();
    }

    public final String toString() {
        return "Rom(result=" + this.f14216a + ")";
    }
}
