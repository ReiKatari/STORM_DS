package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mn3  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class mn3 implements defpackage.eo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ me.magnum.melonds.ui.layouts.LayoutSelectorActivity B;

    public /* synthetic */ mn3(me.magnum.melonds.ui.layouts.LayoutSelectorActivity r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r14, java.lang.Object r15) {
            r13 = this;
            int r0 = r13.A
            jg7 r1 = defpackage.jg7.a
            r2 = 2
            r3 = 0
            r4 = 1
            px0 r14 = (defpackage.px0) r14
            java.lang.Integer r15 = (java.lang.Integer) r15
            int r15 = r15.intValue()
            switch(r0) {
                case 0: goto L5c;
                default: goto L12;
            }
        L12:
            int r0 = me.magnum.melonds.ui.layouts.LayoutSelectorActivity.B0
            r0 = r15 & 3
            if (r0 == r2) goto L1a
            r0 = r4
            goto L1b
        L1a:
            r0 = r3
        L1b:
            r15 = r15 & r4
            xq2 r14 = (defpackage.xq2) r14
            boolean r15 = r14.S(r15, r0)
            if (r15 == 0) goto L58
            me.magnum.melonds.ui.layouts.LayoutSelectorActivity r6 = r13.B
            uo7 r13 = r6.A0
            java.lang.Object r13 = r13.getValue()
            qn3 r13 = (defpackage.qn3) r13
            boolean r15 = r14.h(r6)
            java.lang.Object r0 = r14.P()
            if (r15 != 0) goto L3c
            vs0 r15 = defpackage.ox0.a
            if (r0 != r15) goto L50
        L3c:
            i4 r4 = new i4
            r11 = 0
            r12 = 8
            r5 = 0
            java.lang.Class<me.magnum.melonds.ui.layouts.LayoutSelectorActivity> r7 = me.magnum.melonds.ui.layouts.LayoutSelectorActivity.class
            java.lang.String r8 = "finish"
            java.lang.String r9 = "finish()V"
            r10 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            r14.l0(r4)
            r0 = r4
        L50:
            po2 r0 = (defpackage.po2) r0
            on2 r0 = (defpackage.on2) r0
            defpackage.np2.d(r13, r0, r14, r3)
            goto L5b
        L58:
            r14.V()
        L5b:
            return r1
        L5c:
            int r0 = me.magnum.melonds.ui.layouts.LayoutSelectorActivity.B0
            r0 = r15 & 3
            if (r0 == r2) goto L64
            r0 = r4
            goto L65
        L64:
            r0 = r3
        L65:
            r15 = r15 & r4
            xq2 r14 = (defpackage.xq2) r14
            boolean r15 = r14.S(r15, r0)
            if (r15 == 0) goto L82
            mn3 r15 = new mn3
            me.magnum.melonds.ui.layouts.LayoutSelectorActivity r13 = r13.B
            r15.<init>(r13, r4)
            r13 = 244558342(0xe93aa06, float:3.6402024E-30)
            zv0 r13 = defpackage.n16.I(r13, r15, r14)
            r15 = 48
            defpackage.bl2.e(r3, r13, r14, r15, r4)
            goto L85
        L82:
            r14.V()
        L85:
            return r1
    }
}
