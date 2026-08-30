package r1;

import a4.l;
import a4.n0;
import a4.r1;
import a4.z;
import ai.p;
import b3.o;
import h1.j;
import yb.y;
import zc.x;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h extends o implements f4.a, z {

    /* renamed from: i0  reason: collision with root package name */
    public j f12612i0;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f12613j0;

    public static final h3.c O0(h hVar, r1 r1Var, n0 n0Var) {
        h3.c cVar;
        if (hVar.f1777h0 && hVar.f12613j0) {
            r1 s10 = l.s(hVar);
            if (!r1Var.X0().f1777h0) {
                r1Var = null;
            }
            if (r1Var != null && (cVar = (h3.c) n0Var.b()) != null) {
                return cVar.i(s10.k(r1Var, false).d());
            }
        }
        return null;
    }

    @Override // b3.o
    public final boolean D0() {
        return false;
    }

    @Override // f4.a
    public final Object l(r1 r1Var, n0 n0Var, ec.c cVar) {
        Object g10 = x.g(new g(this, r1Var, n0Var, new p(this, r1Var, n0Var, 9), null), cVar);
        if (g10 == dc.a.COROUTINE_SUSPENDED) {
            return g10;
        }
        return y.f14813a;
    }

    @Override // a4.z
    public final void s(y3.z zVar) {
        this.f12613j0 = true;
    }
}
