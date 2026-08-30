package o2;

import n2.e2;
import n2.h2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class t extends ek.a {

    /* renamed from: d  reason: collision with root package name */
    public static final t f10662d = new ek.a(0, 3, 1);

    @Override // ek.a
    public final void c(f2.s sVar, n2.c cVar, h2 h2Var, v2.i iVar, j0 j0Var) {
        jb.c cVar2;
        e2 e2Var = (e2) sVar.f(1);
        n2.a aVar = (n2.a) sVar.f(0);
        c cVar3 = (c) sVar.f(2);
        h2 d4 = e2Var.d();
        if (j0Var != null) {
            try {
                cVar2 = new jb.c(26, j0Var, h2Var);
            } catch (Throwable th2) {
                d4.e(false);
                throw th2;
            }
        } else {
            cVar2 = null;
        }
        if (!cVar3.f10628e.T()) {
            n2.t.a("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
        }
        cVar3.f10627d.S(cVar, d4, iVar, cVar2);
        d4.e(true);
        h2Var.d();
        aVar.getClass();
        h2Var.A(e2Var, e2Var.a(aVar));
        h2Var.k();
    }
}
