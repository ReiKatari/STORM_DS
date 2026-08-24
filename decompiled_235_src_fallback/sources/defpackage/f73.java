package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: f73  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class f73 implements defpackage.eo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ me.magnum.melonds.ui.inputsetup.InputSetupActivity B;

    public /* synthetic */ f73(me.magnum.melonds.ui.inputsetup.InputSetupActivity r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r12, java.lang.Object r13) {
            r11 = this;
            int r0 = r11.A
            jg7 r1 = defpackage.jg7.a
            r2 = 2
            r3 = 0
            r4 = 1
            px0 r12 = (defpackage.px0) r12
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            switch(r0) {
                case 0: goto L54;
                default: goto L12;
            }
        L12:
            int r0 = me.magnum.melonds.ui.inputsetup.InputSetupActivity.D0
            r0 = r13 & 3
            if (r0 == r2) goto L1a
            r0 = r4
            goto L1b
        L1a:
            r0 = r3
        L1b:
            r13 = r13 & r4
            xq2 r12 = (defpackage.xq2) r12
            boolean r13 = r12.S(r13, r0)
            if (r13 == 0) goto L50
            me.magnum.melonds.ui.inputsetup.InputSetupActivity r8 = r11.B
            me.magnum.melonds.ui.inputsetup.b r11 = r8.B()
            boolean r13 = r12.h(r8)
            java.lang.Object r0 = r12.P()
            if (r13 != 0) goto L38
            vs0 r13 = defpackage.ox0.a
            if (r0 != r13) goto L4a
        L38:
            g73 r4 = new g73
            java.lang.String r10 = "onNavigateUp()Z"
            r6 = 8
            r5 = 0
            java.lang.Class<me.magnum.melonds.ui.inputsetup.InputSetupActivity> r7 = me.magnum.melonds.ui.inputsetup.InputSetupActivity.class
            java.lang.String r9 = "onNavigateUp"
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r12.l0(r4)
            r0 = r4
        L4a:
            on2 r0 = (defpackage.on2) r0
            defpackage.x73.b(r11, r0, r12, r3)
            goto L53
        L50:
            r12.V()
        L53:
            return r1
        L54:
            int r0 = me.magnum.melonds.ui.inputsetup.InputSetupActivity.D0
            r0 = r13 & 3
            if (r0 == r2) goto L5c
            r0 = r4
            goto L5d
        L5c:
            r0 = r3
        L5d:
            r13 = r13 & r4
            xq2 r12 = (defpackage.xq2) r12
            boolean r13 = r12.S(r13, r0)
            if (r13 == 0) goto L7a
            f73 r13 = new f73
            me.magnum.melonds.ui.inputsetup.InputSetupActivity r11 = r11.B
            r13.<init>(r11, r4)
            r11 = 1190419940(0x46f45de4, float:31278.945)
            zv0 r11 = defpackage.n16.I(r11, r13, r12)
            r13 = 48
            defpackage.bl2.e(r3, r11, r12, r13, r4)
            goto L7d
        L7a:
            r12.V()
        L7d:
            return r1
    }
}
