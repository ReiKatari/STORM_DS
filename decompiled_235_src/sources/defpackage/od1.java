package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: od1  reason: default package */
/* loaded from: classes.dex */
public final class od1 extends z64 implements mo1 {
    public final r94 k0;
    public boolean l0;
    public boolean m0;
    public boolean n0;

    public od1(r94 r94Var) {
        this.k0 = r94Var;
    }

    @Override // defpackage.z64
    public final void J0() {
        hv.L(F0(), null, null, new a6(this, null, 15), 3);
    }

    @Override // defpackage.mo1
    public final void m0(um3 um3Var) {
        um3Var.b();
        zj0 zj0Var = um3Var.A;
        if (this.l0) {
            no1.F(um3Var, kt0.c(0.3f, kt0.b), 0L, zj0Var.e(), RecyclerView.B1, null, 122);
        } else if (!this.m0 && !this.n0) {
        } else {
            no1.F(um3Var, kt0.c(0.1f, kt0.b), 0L, zj0Var.e(), RecyclerView.B1, null, 122);
        }
    }
}
