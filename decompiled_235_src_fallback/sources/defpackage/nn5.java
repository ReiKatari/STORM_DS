package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nn5  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class nn5 implements defpackage.eo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ me.magnum.melonds.ui.settings.preferences.RetroAchievementsProfilePreference B;

    public /* synthetic */ nn5(me.magnum.melonds.ui.settings.preferences.RetroAchievementsProfilePreference r1, int r2) {
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
            me.magnum.melonds.ui.settings.preferences.RetroAchievementsProfilePreference r5 = r5.B
            r4 = 1
            px0 r6 = (defpackage.px0) r6
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            switch(r0) {
                case 0: goto L49;
                default: goto L14;
            }
        L14:
            r0 = r7 & 3
            if (r0 == r2) goto L1a
            r0 = r4
            goto L1b
        L1a:
            r0 = r3
        L1b:
            r7 = r7 & r4
            xq2 r6 = (defpackage.xq2) r6
            boolean r7 = r6.S(r7, r0)
            if (r7 == 0) goto L45
            vs4 r5 = r5.A
            java.lang.Object r5 = r5.getValue()
            lb5 r5 = (defpackage.lb5) r5
            if (r5 != 0) goto L38
            r5 = -392934622(0xffffffffe8944b22, float:-5.6023696E24)
            r6.b0(r5)
            r6.p(r3)
            goto L48
        L38:
            r7 = -392934621(0xffffffffe8944b23, float:-5.60237E24)
            r6.b0(r7)
            defpackage.nj2.d(r5, r6, r3)
            r6.p(r3)
            goto L48
        L45:
            r6.V()
        L48:
            return r1
        L49:
            r0 = r7 & 3
            if (r0 == r2) goto L4f
            r0 = r4
            goto L50
        L4f:
            r0 = r3
        L50:
            r7 = r7 & r4
            xq2 r6 = (defpackage.xq2) r6
            boolean r7 = r6.S(r7, r0)
            if (r7 == 0) goto L6b
            nn5 r7 = new nn5
            r7.<init>(r5, r4)
            r5 = -1902335821(0xffffffff8e9ca8b3, float:-3.861942E-30)
            zv0 r5 = defpackage.n16.I(r5, r7, r6)
            r7 = 48
            defpackage.bl2.e(r3, r5, r6, r7, r4)
            goto L6e
        L6b:
            r6.V()
        L6e:
            return r1
    }
}
