package defpackage;

import java.util.ArrayList;
import java.util.Collection;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lq7  reason: default package */
/* loaded from: classes.dex */
public final class lq7 implements eg0 {
    public final v9 A;
    public final nq7 B;
    public final mq7 L;

    public lq7(eg0 eg0Var, mq7 mq7Var, fa6 fa6Var) {
        this.L = mq7Var;
        this.A = new v9(eg0Var.e());
        this.B = new nq7(eg0Var.q());
    }

    @Override // defpackage.ci7
    public final void b(di7 di7Var) {
        nj2.h();
        this.L.b(di7Var);
    }

    @Override // defpackage.ci7
    public final void d(di7 di7Var) {
        nj2.h();
        this.L.d(di7Var);
    }

    @Override // defpackage.eg0
    public final ve0 e() {
        return this.A;
    }

    @Override // defpackage.ci7
    public final void g(di7 di7Var) {
        nj2.h();
        this.L.g(di7Var);
    }

    @Override // defpackage.ci7
    public final void h(di7 di7Var) {
        nj2.h();
        this.L.h(di7Var);
    }

    @Override // defpackage.eg0
    public final void l(Collection collection) {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // defpackage.eg0
    public final void m(ArrayList arrayList) {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // defpackage.eg0
    public final boolean o() {
        return false;
    }

    @Override // defpackage.eg0
    public final cg0 q() {
        return this.B;
    }

    @Override // defpackage.eg0
    public final gx3 release() {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }
}
