package me.magnum.melonds.ui.settings.fragments;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@defpackage.mc1(c = "me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$weighPresetAsync$2", f = "VideoPreferencesFragment.kt", l = {852}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class VideoPreferencesFragment$weighPresetAsync$2 extends defpackage.hw6 implements defpackage.eo2 {
    public int X;
    public final /* synthetic */ me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment Y;
    public final /* synthetic */ java.lang.String Z;
    public final /* synthetic */ me.magnum.melonds.ui.settings.fragments.l d0;
    public final /* synthetic */ java.io.File e0;

    public VideoPreferencesFragment$weighPresetAsync$2(me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment r1, java.lang.String r2, me.magnum.melonds.ui.settings.fragments.l r3, java.io.File r4, defpackage.r41 r5) {
            r0 = this;
            r0.Y = r1
            r0.Z = r2
            r0.d0 = r3
            r0.e0 = r4
            r1 = 2
            r0.<init>(r1, r5)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            w61 r1 = (defpackage.w61) r1
            r41 r2 = (defpackage.r41) r2
            r41 r0 = r0.q(r2, r1)
            me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$weighPresetAsync$2 r0 = (me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$weighPresetAsync$2) r0
            jg7 r1 = defpackage.jg7.a
            java.lang.Object r0 = r0.s(r1)
            return r0
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r7, java.lang.Object r8) {
            r6 = this;
            me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$weighPresetAsync$2 r0 = new me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$weighPresetAsync$2
            me.magnum.melonds.ui.settings.fragments.l r3 = r6.d0
            java.io.File r4 = r6.e0
            me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment r1 = r6.Y
            java.lang.String r2 = r6.Z
            r5 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r7) {
            r6 = this;
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r6.X
            r2 = 0
            java.lang.String r3 = r6.Z
            r4 = 1
            if (r1 == 0) goto L16
            if (r1 != r4) goto L10
            defpackage.oi2.Y(r7)
            goto L2d
        L10:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r6)
            return r2
        L16:
            defpackage.oi2.Y(r7)
            xe1 r7 = defpackage.xk1.a
            de1 r7 = defpackage.de1.L
            me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$weighPresetAsync$2$weight$1 r1 = new me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$weighPresetAsync$2$weight$1
            java.io.File r5 = r6.e0
            r1.<init>(r3, r5, r2)
            r6.X = r4
            java.lang.Object r7 = defpackage.hv.d0(r7, r1, r6)
            if (r7 != r0) goto L2d
            return r0
        L2d:
            ep5 r7 = (defpackage.ep5) r7
            jg7 r0 = defpackage.jg7.a
            if (r7 != 0) goto L34
            return r0
        L34:
            me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment r1 = r6.Y
            java.util.LinkedHashMap r1 = r1.u0
            r1.put(r3, r7)
            me.magnum.melonds.ui.settings.fragments.l r6 = r6.d0
            r6.g(r7)
            return r0
    }
}
