package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: d50  reason: default package */
/* loaded from: classes.dex */
public final class d50 extends defpackage.z64 implements defpackage.jm3, defpackage.va6 {
    public defpackage.qn2 k0;

    public d50(defpackage.qn2 r1) {
            r0 = this;
            r0.<init>()
            r0.k0 = r1
            return
    }

    @Override // defpackage.va6
    public final void A0(defpackage.gb6 r5) {
            r4 = this;
            r0 = 2
            eg4 r0 = defpackage.nc1.d0(r4, r0)
            boolean r1 = r0.D0
            if (r1 != 0) goto L4d
            op5 r1 = defpackage.hv.g
            if (r1 != 0) goto L15
            op5 r1 = new op5
            r1.<init>()
            defpackage.hv.g = r1
            goto L18
        L15:
            r1.b()
        L18:
            op5 r1 = defpackage.hv.g
            r1.getClass()
            sm3 r2 = r0.k0
            qh1 r2 = r2.u0
            r1.l0 = r2
            long r2 = r0.L
            long r2 = defpackage.qo2.S(r2)
            r1.k0 = r2
            vl6 r0 = defpackage.ln2.t()
            if (r0 == 0) goto L36
            qn2 r2 = r0.e()
            goto L37
        L36:
            r2 = 0
        L37:
            vl6 r3 = defpackage.ln2.N(r0)
            qn2 r4 = r4.k0     // Catch: java.lang.Throwable -> L48
            r4.g(r1)     // Catch: java.lang.Throwable -> L48
            defpackage.ln2.V(r0, r3, r2)
            ke6 r4 = r1.i0
            boolean r0 = r1.j0
            goto L51
        L48:
            r4 = move-exception
            defpackage.ln2.V(r0, r3, r2)
            throw r4
        L4d:
            ke6 r4 = r0.B0
            boolean r0 = r0.C0
        L51:
            if (r0 != 0) goto L54
            return
        L54:
            defpackage.eb6.e(r5, r4)
            return
    }

    @Override // defpackage.z64
    public final boolean G0() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.jm3
    public final defpackage.f34 c(defpackage.g34 r3, defpackage.x24 r4, long r5) {
            r2 = this;
            dx4 r4 = r4.y(r5)
            int r5 = r4.A
            int r6 = r4.B
            qj r0 = new qj
            r1 = 6
            r0.<init>(r1, r4, r2)
            zt1 r2 = defpackage.zt1.A
            f34 r2 = r3.K(r5, r6, r2, r0)
            return r2
    }

    @Override // defpackage.va6
    public final boolean j() {
            r0 = this;
            r0 = 0
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "BlockGraphicsLayerModifier(block="
            r0.<init>(r1)
            qn2 r2 = r2.k0
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
