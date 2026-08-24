package me.magnum.melonds.ui.settings.fragments;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@defpackage.mc1(c = "me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$loadShaderBrowserDirectory$2", f = "VideoPreferencesFragment.kt", l = {805}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class VideoPreferencesFragment$loadShaderBrowserDirectory$2 extends defpackage.hw6 implements defpackage.eo2 {
    public int X;
    public final /* synthetic */ java.util.LinkedHashMap Y;
    public final /* synthetic */ java.lang.String Z;
    public final /* synthetic */ me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment.ShaderBrowserAdapter d0;
    public final /* synthetic */ android.widget.TextView e0;
    public final /* synthetic */ me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment.ShaderDirectoryLister f0;

    public VideoPreferencesFragment$loadShaderBrowserDirectory$2(java.util.LinkedHashMap r1, java.lang.String r2, me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment.ShaderBrowserAdapter r3, android.widget.TextView r4, me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment.ShaderDirectoryLister r5, defpackage.r41 r6) {
            r0 = this;
            r0.Y = r1
            r0.Z = r2
            r0.d0 = r3
            r0.e0 = r4
            r0.f0 = r5
            r1 = 2
            r0.<init>(r1, r6)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            w61 r1 = (defpackage.w61) r1
            r41 r2 = (defpackage.r41) r2
            r41 r0 = r0.q(r2, r1)
            me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$loadShaderBrowserDirectory$2 r0 = (me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$loadShaderBrowserDirectory$2) r0
            jg7 r1 = defpackage.jg7.a
            java.lang.Object r0 = r0.s(r1)
            return r0
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r8, java.lang.Object r9) {
            r7 = this;
            me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$loadShaderBrowserDirectory$2 r0 = new me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$loadShaderBrowserDirectory$2
            android.widget.TextView r4 = r7.e0
            me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$ShaderDirectoryLister r5 = r7.f0
            java.util.LinkedHashMap r1 = r7.Y
            java.lang.String r2 = r7.Z
            me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$ShaderBrowserAdapter r3 = r7.d0
            r6 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
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
            me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$loadShaderBrowserDirectory$2$items$1 r1 = new me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$loadShaderBrowserDirectory$2$items$1
            me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$ShaderDirectoryLister r5 = r6.f0
            r1.<init>(r5, r3, r2)
            r6.X = r4
            java.lang.Object r7 = defpackage.hv.d0(r7, r1, r6)
            if (r7 != r0) goto L2d
            return r0
        L2d:
            java.util.List r7 = (java.util.List) r7
            java.util.LinkedHashMap r0 = r6.Y
            r0.put(r3, r7)
            me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$ShaderBrowserAdapter r0 = r6.d0
            r0.h(r7)
            r0 = 2131952824(0x7f1304b8, float:1.9542102E38)
            android.widget.TextView r6 = r6.e0
            r6.setText(r0)
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L49
            r7 = 0
            goto L4b
        L49:
            r7 = 8
        L4b:
            r6.setVisibility(r7)
            jg7 r6 = defpackage.jg7.a
            return r6
    }
}
