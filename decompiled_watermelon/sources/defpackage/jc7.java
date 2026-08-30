package defpackage;

import java.util.ArrayList;
import java.util.Collection;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: jc7  reason: default package */
/* loaded from: classes.dex */
public final class jc7 implements vd0 {
    public final u9 A;
    public final lc7 B;
    public final kc7 L;

    public jc7(vd0 vd0Var, kc7 kc7Var, vd6 vd6Var) {
        this.L = kc7Var;
        this.A = new u9(vd0Var.n());
        this.B = new lc7(vd0Var.l());
    }

    @Override // defpackage.vd0
    public final fq3 a() {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // defpackage.e47
    public final void d(f47 f47Var) {
        nk2.s();
        this.L.d(f47Var);
    }

    @Override // defpackage.vd0
    public final void f(Collection collection) {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // defpackage.vd0
    public final void h(ArrayList arrayList) {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // defpackage.vd0
    public final boolean j() {
        return false;
    }

    @Override // defpackage.vd0
    public final td0 l() {
        return this.B;
    }

    @Override // defpackage.e47
    public final void m(f47 f47Var) {
        nk2.s();
        this.L.m(f47Var);
    }

    @Override // defpackage.vd0
    public final mc0 n() {
        return this.A;
    }

    @Override // defpackage.e47
    public final void o(f47 f47Var) {
        nk2.s();
        this.L.o(f47Var);
    }

    @Override // defpackage.e47
    public final void q(f47 f47Var) {
        nk2.s();
        this.L.q(f47Var);
    }
}
