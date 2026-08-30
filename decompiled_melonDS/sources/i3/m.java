package i3;

import a4.j1;
import a4.r1;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class m extends j1 {

    /* renamed from: a  reason: collision with root package name */
    public final mc.l f6658a;

    public m(mc.l lVar) {
        this.f6658a = lVar;
    }

    @Override // a4.j1
    public final b3.o e() {
        return new n(this.f6658a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        if (this.f6658a == ((m) obj).f6658a) {
            return true;
        }
        return false;
    }

    @Override // a4.j1
    public final void g(b3.o oVar) {
        r1 r1Var;
        n nVar = (n) oVar;
        mc.l lVar = this.f6658a;
        nVar.f6663i0 = lVar;
        if (nVar.A.f1777h0 && (r1Var = a4.l.r(nVar, 2).f318l0) != null) {
            r1Var.v1(lVar, true);
        }
    }

    public final int hashCode() {
        return this.f6658a.hashCode();
    }
}
