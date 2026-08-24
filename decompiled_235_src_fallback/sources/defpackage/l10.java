package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: l10  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class l10 implements defpackage.eo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ me.magnum.melonds.ui.backgrounds.BackgroundsActivity B;

    public /* synthetic */ l10(me.magnum.melonds.ui.backgrounds.BackgroundsActivity r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r7, java.lang.Object r8) {
            r6 = this;
            int r0 = r6.A
            jg7 r1 = defpackage.jg7.a
            r2 = 48
            r3 = 2
            r4 = 0
            me.magnum.melonds.ui.backgrounds.BackgroundsActivity r6 = r6.B
            r5 = 1
            px0 r7 = (defpackage.px0) r7
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            switch(r0) {
                case 0: goto L43;
                default: goto L16;
            }
        L16:
            int r0 = me.magnum.melonds.ui.backgrounds.BackgroundsActivity.B0
            r0 = r8 & 3
            if (r0 == r3) goto L1e
            r0 = r5
            goto L1f
        L1e:
            r0 = r4
        L1f:
            r8 = r8 & r5
            xq2 r7 = (defpackage.xq2) r7
            boolean r8 = r7.S(r8, r0)
            if (r8 == 0) goto L3f
            qd4[] r8 = new defpackage.qd4[r4]
            rc4 r8 = defpackage.yh2.I(r8, r7)
            l4 r0 = new l4
            r0.<init>(r5, r8, r6)
            r6 = -1635922308(0xffffffff9e7dce7c, float:-1.34364084E-20)
            zv0 r6 = defpackage.n16.I(r6, r0, r7)
            r8 = 0
            defpackage.vg6.a(r8, r6, r7, r2)
            goto L42
        L3f:
            r7.V()
        L42:
            return r1
        L43:
            int r0 = me.magnum.melonds.ui.backgrounds.BackgroundsActivity.B0
            r0 = r8 & 3
            if (r0 == r3) goto L4b
            r0 = r5
            goto L4c
        L4b:
            r0 = r4
        L4c:
            r8 = r8 & r5
            xq2 r7 = (defpackage.xq2) r7
            boolean r8 = r7.S(r8, r0)
            if (r8 == 0) goto L65
            l10 r8 = new l10
            r8.<init>(r6, r5)
            r6 = 440963006(0x1a488fbe, float:4.1475145E-23)
            zv0 r6 = defpackage.n16.I(r6, r8, r7)
            defpackage.bl2.e(r4, r6, r7, r2, r5)
            goto L68
        L65:
            r7.V()
        L68:
            return r1
    }
}
