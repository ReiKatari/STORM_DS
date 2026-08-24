package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ko0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ko0 implements defpackage.eo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ me.magnum.melonds.ui.cheats.CheatsActivity B;
    public final /* synthetic */ defpackage.vy7 L;

    public /* synthetic */ ko0(me.magnum.melonds.ui.cheats.CheatsActivity r1, defpackage.vy7 r2, int r3) {
            r0 = this;
            r0.A = r3
            r0.B = r1
            r0.L = r2
            r0.<init>()
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r7, java.lang.Object r8) {
            r6 = this;
            int r0 = r6.A
            jg7 r1 = defpackage.jg7.a
            r2 = 2
            r3 = 0
            vy7 r4 = r6.L
            me.magnum.melonds.ui.cheats.CheatsActivity r6 = r6.B
            r5 = 1
            px0 r7 = (defpackage.px0) r7
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            switch(r0) {
                case 0: goto L38;
                default: goto L16;
            }
        L16:
            int r0 = me.magnum.melonds.ui.cheats.CheatsActivity.B0
            r0 = r8 & 3
            if (r0 == r2) goto L1e
            r0 = r5
            goto L1f
        L1e:
            r0 = r3
        L1f:
            r8 = r8 & r5
            xq2 r7 = (defpackage.xq2) r7
            boolean r8 = r7.S(r8, r0)
            if (r8 == 0) goto L34
            uo7 r6 = r6.A0
            java.lang.Object r6 = r6.getValue()
            aq0 r6 = (defpackage.aq0) r6
            defpackage.jw2.d(r6, r4, r7, r3)
            goto L37
        L34:
            r7.V()
        L37:
            return r1
        L38:
            int r0 = me.magnum.melonds.ui.cheats.CheatsActivity.B0
            r0 = r8 & 3
            if (r0 == r2) goto L40
            r0 = r5
            goto L41
        L40:
            r0 = r3
        L41:
            r8 = r8 & r5
            xq2 r7 = (defpackage.xq2) r7
            boolean r8 = r7.S(r8, r0)
            if (r8 == 0) goto L5c
            ko0 r8 = new ko0
            r8.<init>(r6, r4, r5)
            r6 = -1275664099(0xffffffffb3f6e91d, float:-1.1497671E-7)
            zv0 r6 = defpackage.n16.I(r6, r8, r7)
            r8 = 48
            defpackage.bl2.e(r3, r6, r7, r8, r5)
            goto L5f
        L5c:
            r7.V()
        L5f:
            return r1
    }
}
