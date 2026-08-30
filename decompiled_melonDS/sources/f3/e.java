package f3;

import a4.j1;
import b3.o;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e extends j1 {

    /* renamed from: a  reason: collision with root package name */
    public final mc.l f4822a;

    public e(mc.l lVar) {
        this.f4822a = lVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [f3.d, b3.o] */
    @Override // a4.j1
    public final o e() {
        ?? oVar = new o();
        oVar.f4821i0 = this.f4822a;
        return oVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        if (this.f4822a == ((e) obj).f4822a) {
            return true;
        }
        return false;
    }

    @Override // a4.j1
    public final void g(o oVar) {
        ((d) oVar).f4821i0 = this.f4822a;
    }

    public final int hashCode() {
        return this.f4822a.hashCode();
    }
}
