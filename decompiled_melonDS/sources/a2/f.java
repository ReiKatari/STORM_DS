package a2;

import a4.j1;
import f2.t0;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f extends j1 {

    /* renamed from: a  reason: collision with root package name */
    public final t0 f125a;

    public f(t0 t0Var) {
        this.f125a = t0Var;
    }

    @Override // a4.j1
    public final b3.o e() {
        return new k(this.f125a);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof f) {
                if (this.f125a != ((f) obj).f125a) {
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
        ((k) oVar).f132k0 = this.f125a;
    }

    public final int hashCode() {
        return this.f125a.hashCode();
    }
}
