package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ar7  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ar7 implements defpackage.eo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ me.magnum.melonds.ui.settings.vulkandriver.VulkanDriverManagerActivity B;

    public /* synthetic */ ar7(me.magnum.melonds.ui.settings.vulkandriver.VulkanDriverManagerActivity r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r6, java.lang.Object r7) {
            r5 = this;
            int r0 = r5.A
            jg7 r1 = defpackage.jg7.a
            r2 = 2
            r3 = 0
            me.magnum.melonds.ui.settings.vulkandriver.VulkanDriverManagerActivity r5 = r5.B
            r4 = 1
            px0 r6 = (defpackage.px0) r6
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            switch(r0) {
                case 0: goto L50;
                default: goto L14;
            }
        L14:
            int r0 = me.magnum.melonds.ui.settings.vulkandriver.VulkanDriverManagerActivity.B0
            r0 = r7 & 3
            if (r0 == r2) goto L1c
            r0 = r4
            goto L1d
        L1c:
            r0 = r3
        L1d:
            r7 = r7 & r4
            xq2 r6 = (defpackage.xq2) r6
            boolean r7 = r6.S(r7, r0)
            if (r7 == 0) goto L4c
            uo7 r7 = r5.A0
            java.lang.Object r7 = r7.getValue()
            qr7 r7 = (defpackage.qr7) r7
            boolean r0 = r6.h(r5)
            java.lang.Object r2 = r6.P()
            if (r0 != 0) goto L3c
            vs0 r0 = defpackage.ox0.a
            if (r2 != r0) goto L46
        L3c:
            t46 r2 = new t46
            r0 = 23
            r2.<init>(r5, r0)
            r6.l0(r2)
        L46:
            on2 r2 = (defpackage.on2) r2
            defpackage.vy7.F(r7, r2, r6, r3)
            goto L4f
        L4c:
            r6.V()
        L4f:
            return r1
        L50:
            int r0 = me.magnum.melonds.ui.settings.vulkandriver.VulkanDriverManagerActivity.B0
            r0 = r7 & 3
            if (r0 == r2) goto L58
            r0 = r4
            goto L59
        L58:
            r0 = r3
        L59:
            r7 = r7 & r4
            xq2 r6 = (defpackage.xq2) r6
            boolean r7 = r6.S(r7, r0)
            if (r7 == 0) goto L74
            ar7 r7 = new ar7
            r7.<init>(r5, r4)
            r5 = -1827491315(0xffffffff9312b20d, float:-1.8515577E-27)
            zv0 r5 = defpackage.n16.I(r5, r7, r6)
            r7 = 48
            defpackage.bl2.e(r3, r5, r6, r7, r4)
            goto L77
        L74:
            r6.V()
        L77:
            return r1
    }
}
