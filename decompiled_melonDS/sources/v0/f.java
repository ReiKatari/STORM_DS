package v0;

import d0.v1;
import j0.a0;
import j0.b0;
import j0.d0;
import java.util.ArrayList;
import java.util.Collection;
import m9.o;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f implements d0 {
    public final j0.b A;
    public final i B;
    public final g L;

    public f(d0 d0Var, g gVar, o oVar) {
        this.L = gVar;
        this.A = new j0.b(d0Var.o());
        this.B = new i(d0Var.k());
    }

    @Override // j0.d0
    public final ta.a a() {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // d0.u1
    public final void d(v1 v1Var) {
        l0.f.e();
        this.L.d(v1Var);
    }

    @Override // j0.d0
    public final void e(Collection collection) {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // j0.d0
    public final void g(ArrayList arrayList) {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // j0.d0
    public final boolean i() {
        return false;
    }

    @Override // j0.d0
    public final b0 k() {
        return this.B;
    }

    @Override // d0.u1
    public final void l(v1 v1Var) {
        l0.f.e();
        this.L.l(v1Var);
    }

    @Override // d0.u1
    public final void n(v1 v1Var) {
        l0.f.e();
        this.L.n(v1Var);
    }

    @Override // j0.d0
    public final a0 o() {
        return this.A;
    }

    @Override // d0.u1
    public final void q(v1 v1Var) {
        l0.f.e();
        this.L.q(v1Var);
    }
}
