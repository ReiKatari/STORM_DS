package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: et3  reason: default package */
/* loaded from: classes.dex */
public final class et3 extends defpackage.z64 implements defpackage.fy0, defpackage.ks2 {
    public defpackage.ki k0;
    public defpackage.jt3 l0;
    public defpackage.p27 m0;
    public final defpackage.vs4 n0;

    public et3(defpackage.ki r1, defpackage.jt3 r2, defpackage.p27 r3) {
            r0 = this;
            r0.<init>()
            r0.k0 = r1
            r0.l0 = r2
            r0.m0 = r3
            r1 = 0
            vs4 r1 = defpackage.np2.Y(r1)
            r0.n0 = r1
            return
    }

    @Override // defpackage.z64
    public final void J0() {
            r2 = this;
            ki r0 = r2.k0
            et3 r1 = r0.a
            if (r1 != 0) goto L7
            goto Lc
        L7:
            java.lang.String r1 = "Expected textInputModifierNode to be null"
            defpackage.s53.c(r1)
        Lc:
            r0.a = r2
            return
    }

    @Override // defpackage.z64
    public final void K0() {
            r1 = this;
            ki r0 = r1.k0
            r0.k(r1)
            return
    }

    @Override // defpackage.ks2
    public final void d0(defpackage.eg4 r1) {
            r0 = this;
            vs4 r0 = r0.n0
            r0.setValue(r1)
            return
    }
}
