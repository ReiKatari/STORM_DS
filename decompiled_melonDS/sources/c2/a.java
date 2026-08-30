package c2;

import a4.j1;
import b3.o;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
final class a extends j1 {

    /* renamed from: a  reason: collision with root package name */
    public final mc.a f2550a;

    public a(mc.a aVar) {
        this.f2550a = aVar;
    }

    @Override // a4.j1
    public final o e() {
        return new d(this.f2550a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        if (this.f2550a == ((a) obj).f2550a) {
            return true;
        }
        return false;
    }

    @Override // a4.j1
    public final void g(o oVar) {
        ((d) oVar).f2553k0 = this.f2550a;
    }

    public final int hashCode() {
        return this.f2550a.hashCode();
    }
}
