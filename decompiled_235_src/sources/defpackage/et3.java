package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: et3  reason: default package */
/* loaded from: classes.dex */
public final class et3 extends z64 implements fy0, ks2 {
    public ki k0;
    public jt3 l0;
    public p27 m0;
    public final vs4 n0 = np2.Y(null);

    public et3(ki kiVar, jt3 jt3Var, p27 p27Var) {
        this.k0 = kiVar;
        this.l0 = jt3Var;
        this.m0 = p27Var;
    }

    @Override // defpackage.z64
    public final void J0() {
        ki kiVar = this.k0;
        if (kiVar.a != null) {
            s53.c("Expected textInputModifierNode to be null");
        }
        kiVar.a = this;
    }

    @Override // defpackage.z64
    public final void K0() {
        this.k0.k(this);
    }

    @Override // defpackage.ks2
    public final void d0(eg4 eg4Var) {
        this.n0.setValue(eg4Var);
    }
}
