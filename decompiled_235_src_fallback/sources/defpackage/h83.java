package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: h83  reason: default package */
/* loaded from: classes.dex */
public abstract class h83 extends defpackage.z64 implements defpackage.ub7 {
    public defpackage.tt7 k0;
    public defpackage.tt7 l0;

    public h83() {
            r1 = this;
            r1.<init>()
            hd2 r0 = defpackage.hv.k
            r1.k0 = r0
            r1.l0 = r0
            return
    }

    @Override // defpackage.z64
    public void J0() {
            r2 = this;
            g83 r0 = new g83
            r1 = 1
            r0.<init>(r2, r1)
            java.lang.String r1 = "androidx.compose.foundation.layout.ConsumedInsetsProvider"
            defpackage.ii2.V(r2, r1, r0)
            r2.S0()
            return
    }

    @Override // defpackage.z64
    public void K0() {
            r2 = this;
            tt7 r0 = r2.k0
            r2.l0 = r0
            g83 r0 = new g83
            r1 = 0
            r0.<init>(r2, r1)
            java.lang.String r1 = "androidx.compose.foundation.layout.ConsumedInsetsProvider"
            defpackage.ii2.X(r2, r1, r0)
            return
    }

    @Override // defpackage.z64
    public final void L0() {
            r1 = this;
            hd2 r0 = defpackage.hv.k
            r1.k0 = r0
            return
    }

    public abstract defpackage.tt7 R0(defpackage.tt7 r1);

    public void S0() {
            r2 = this;
            tt7 r0 = r2.k0
            tt7 r0 = r2.R0(r0)
            r2.l0 = r0
            g83 r0 = new g83
            r1 = 0
            r0.<init>(r2, r1)
            java.lang.String r1 = "androidx.compose.foundation.layout.ConsumedInsetsProvider"
            defpackage.ii2.X(r2, r1, r0)
            return
    }

    @Override // defpackage.ub7
    public final java.lang.Object n() {
            r0 = this;
            java.lang.String r0 = "androidx.compose.foundation.layout.ConsumedInsetsProvider"
            return r0
    }
}
