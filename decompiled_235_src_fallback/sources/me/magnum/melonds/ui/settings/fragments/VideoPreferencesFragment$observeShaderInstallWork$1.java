package me.magnum.melonds.ui.settings.fragments;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@defpackage.mc1(c = "me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$observeShaderInstallWork$1", f = "VideoPreferencesFragment.kt", l = {1518}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class VideoPreferencesFragment$observeShaderInstallWork$1 extends defpackage.hw6 implements defpackage.eo2 {
    public int X;
    public /* synthetic */ java.lang.Object Y;
    public final /* synthetic */ me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment Z;


    public VideoPreferencesFragment$observeShaderInstallWork$1(me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment r1, defpackage.r41 r2) {
            r0 = this;
            r0.Z = r1
            r1 = 2
            r0.<init>(r1, r2)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            w61 r1 = (defpackage.w61) r1
            r41 r2 = (defpackage.r41) r2
            r41 r0 = r0.q(r2, r1)
            me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$observeShaderInstallWork$1 r0 = (me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$observeShaderInstallWork$1) r0
            jg7 r1 = defpackage.jg7.a
            java.lang.Object r0 = r0.s(r1)
            return r0
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r2, java.lang.Object r3) {
            r1 = this;
            me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$observeShaderInstallWork$1 r0 = new me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$observeShaderInstallWork$1
            me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment r1 = r1.Z
            r0.<init>(r1, r2)
            r0.Y = r3
            return r0
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r7) {
            r6 = this;
            java.lang.Object r0 = r6.Y
            w61 r0 = (defpackage.w61) r0
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r6.X
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L18
            if (r2 != r4) goto L12
            defpackage.oi2.Y(r7)
            goto L41
        L12:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r6)
            return r3
        L18:
            defpackage.oi2.Y(r7)
            me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment r7 = r6.Z
            android.content.Context r2 = r7.requireContext()
            r2.getClass()
            lw7 r2 = defpackage.lw7.b(r2)
            r2.getClass()
            java.lang.String r5 = "retroarch-shader-install"
            le2 r2 = r2.c(r5)
            me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$observeShaderInstallWork$1$1 r5 = new me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$observeShaderInstallWork$1$1
            r5.<init>(r7, r0)
            r6.Y = r3
            r6.X = r4
            java.lang.Object r6 = r2.b(r5, r6)
            if (r6 != r1) goto L41
            return r1
        L41:
            jg7 r6 = defpackage.jg7.a
            return r6
    }
}
