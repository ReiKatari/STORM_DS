package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: s91  reason: default package */
/* loaded from: classes.dex */
public final class s91 extends yy3 implements gk1 {
    public final l14 j0;
    public boolean k0;
    public boolean l0;
    public boolean m0;

    public s91(l14 l14Var) {
        this.j0 = l14Var;
    }

    @Override // defpackage.yy3
    public final void J0() {
        tq5.w(F0(), null, null, new a6(this, null, 14), 3);
    }

    @Override // defpackage.gk1
    public final void T(xf3 xf3Var) {
        xf3Var.a();
        rh0 rh0Var = xf3Var.A;
        if (this.k0) {
            hk1.q(xf3Var, xq0.b(0.3f, xq0.b), rh0Var.d(), RecyclerView.A1, null, 122);
        } else if (!this.l0 && !this.m0) {
        } else {
            hk1.q(xf3Var, xq0.b(0.1f, xq0.b), rh0Var.d(), RecyclerView.A1, null, 122);
        }
    }
}
