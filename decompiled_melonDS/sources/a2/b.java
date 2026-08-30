package a2;

import a4.j1;
import ai.r0;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b extends j1 {

    /* renamed from: a  reason: collision with root package name */
    public final r0 f122a;

    public b(r0 r0Var) {
        this.f122a = r0Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, a2.d, a4.k, b3.o] */
    /* JADX WARN: Type inference failed for: r1v1, types: [a4.j, a2.a, b3.o] */
    @Override // a4.j1
    public final b3.o e() {
        ?? kVar = new a4.k();
        kVar.f123k0 = this.f122a;
        c cVar = new c(0, kVar);
        ?? oVar = new b3.o();
        oVar.f121i0 = cVar;
        kVar.O0(oVar);
        return kVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof b) {
                if (this.f122a != ((b) obj).f122a) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // a4.j1
    public final void g(b3.o oVar) {
        ((d) oVar).f123k0 = this.f122a;
    }

    public final int hashCode() {
        return this.f122a.hashCode();
    }
}
