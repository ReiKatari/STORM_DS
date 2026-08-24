package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: h83  reason: default package */
/* loaded from: classes.dex */
public abstract class h83 extends z64 implements ub7 {
    public tt7 k0;
    public tt7 l0;

    public h83() {
        hd2 hd2Var = hv.k;
        this.k0 = hd2Var;
        this.l0 = hd2Var;
    }

    @Override // defpackage.z64
    public void J0() {
        ii2.V(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new g83(this, 1));
        S0();
    }

    @Override // defpackage.z64
    public void K0() {
        this.l0 = this.k0;
        ii2.X(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new g83(this, 0));
    }

    @Override // defpackage.z64
    public final void L0() {
        this.k0 = hv.k;
    }

    public abstract tt7 R0(tt7 tt7Var);

    public void S0() {
        this.l0 = R0(this.k0);
        ii2.X(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new g83(this, 0));
    }

    @Override // defpackage.ub7
    public final Object n() {
        return "androidx.compose.foundation.layout.ConsumedInsetsProvider";
    }
}
