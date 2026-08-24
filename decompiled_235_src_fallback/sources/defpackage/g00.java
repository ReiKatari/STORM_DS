package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: g00  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class g00 implements defpackage.qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ java.lang.Object L;

    public /* synthetic */ g00(java.lang.Object r1, boolean r2, int r3) {
            r0 = this;
            r0.A = r3
            r0.L = r1
            r0.B = r2
            r0.<init>()
            return
    }

    public /* synthetic */ g00(boolean r1, java.lang.Object r2, int r3) {
            r0 = this;
            r0.A = r3
            r0.B = r1
            r0.L = r2
            r0.<init>()
            return
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r7) {
            r6 = this;
            int r0 = r6.A
            jg7 r1 = defpackage.jg7.a
            r2 = 1
            boolean r3 = r6.B
            java.lang.Object r6 = r6.L
            switch(r0) {
                case 0: goto L8f;
                case 1: goto L77;
                case 2: goto L29;
                case 3: goto L19;
                default: goto Lc;
            }
        Lc:
            ax0 r6 = (defpackage.ax0) r6
            ou3 r7 = (defpackage.ou3) r7
            r6.s(r3)
            i00 r0 = new i00
            r0.<init>(r7, r6, r2)
            return r0
        L19:
            nh2 r6 = (defpackage.nh2) r6
            fh2 r7 = (defpackage.fh2) r7
            r7.getClass()
            if (r3 == 0) goto L23
            goto L25
        L23:
            nh2 r6 = defpackage.nh2.b
        L25:
            r7.d(r6)
            return r1
        L29:
            me.magnum.melonds.ui.emulator.EmulatorActivity r6 = (me.magnum.melonds.ui.emulator.EmulatorActivity) r6
            c46 r7 = (defpackage.c46) r7
            r0 = 3
            r2 = 0
            if (r3 == 0) goto L48
            int r3 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            sz1 r6 = r6.W()
            r6.getClass()
            r7.getClass()
            o41 r3 = r6.z
            z22 r4 = new z22
            r4.<init>(r6, r7, r2)
            defpackage.hv.L(r3, r2, r2, r4, r0)
            goto L76
        L48:
            int r3 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            sz1 r6 = r6.W()
            of6 r3 = r6.J0
            r7.getClass()
            sx1 r4 = r6.w
            boolean r4 = r4.b()
            if (r4 != 0) goto L61
            p67 r6 = defpackage.p67.a
            r3.k(r6)
            goto L76
        L61:
            boolean r4 = r7.b
            if (r4 != 0) goto L6b
            w77 r6 = defpackage.w77.a
            r3.k(r6)
            goto L76
        L6b:
            o41 r3 = r6.z
            m7 r4 = new m7
            r5 = 2
            r4.<init>(r6, r7, r2, r5)
            defpackage.hv.L(r3, r2, r2, r4, r0)
        L76:
            return r1
        L77:
            cv7 r6 = (defpackage.cv7) r6
            gl1 r7 = (defpackage.gl1) r7
            r7.getClass()
            bv7 r7 = r6.a
            boolean r7 = r7.b()
            r0 = r3 ^ 1
            r6.a(r0)
            tn0 r0 = new tn0
            r0.<init>(r6, r7)
            return r0
        L8f:
            pw0 r6 = (defpackage.pw0) r6
            ou3 r7 = (defpackage.ou3) r7
            java.lang.Object r0 = r6.a
            d00 r0 = (defpackage.d00) r0
            r0.f(r3)
            java.lang.Object r0 = r6.b
            c00 r0 = (defpackage.c00) r0
            r0.f(r3)
            i00 r0 = new i00
            r1 = 0
            r0.<init>(r7, r6, r1)
            return r0
    }
}
