package me.magnum.melonds.ui.settings.fragments;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@defpackage.mc1(c = "me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$loadShaderBrowserDirectory$2$items$1", f = "VideoPreferencesFragment.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class VideoPreferencesFragment$loadShaderBrowserDirectory$2$items$1 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment.ShaderDirectoryLister X;
    public final /* synthetic */ java.lang.String Y;

    public VideoPreferencesFragment$loadShaderBrowserDirectory$2$items$1(me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment.ShaderDirectoryLister r1, java.lang.String r2, defpackage.r41 r3) {
            r0 = this;
            r0.X = r1
            r0.Y = r2
            r1 = 2
            r0.<init>(r1, r3)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            w61 r1 = (defpackage.w61) r1
            r41 r2 = (defpackage.r41) r2
            r41 r0 = r0.q(r2, r1)
            me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$loadShaderBrowserDirectory$2$items$1 r0 = (me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$loadShaderBrowserDirectory$2$items$1) r0
            jg7 r1 = defpackage.jg7.a
            java.lang.Object r0 = r0.s(r1)
            return r0
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r2, java.lang.Object r3) {
            r1 = this;
            me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$loadShaderBrowserDirectory$2$items$1 r3 = new me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$loadShaderBrowserDirectory$2$items$1
            me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$ShaderDirectoryLister r0 = r1.X
            java.lang.String r1 = r1.Y
            r3.<init>(r0, r1, r2)
            return r3
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r8) {
            r7 = this;
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r8)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$ShaderDirectoryLister r1 = r7.X
            java.lang.String r7 = r7.Y
            java.util.List r1 = r1.a(r7)
            java.util.Iterator r1 = r1.iterator()
        L1b:
            boolean r2 = r1.hasNext()
            java.lang.String r3 = ".slangp"
            r4 = 1
            if (r2 == 0) goto L59
            java.lang.Object r2 = r1.next()
            me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$ShaderBrowserEntry r2 = (me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment.ShaderBrowserEntry) r2
            boolean r5 = defpackage.qs6.v0(r7)
            if (r5 == 0) goto L33
            java.lang.String r5 = r2.a
            goto L3b
        L33:
            java.lang.String r5 = r2.a
            java.lang.String r6 = "/"
            java.lang.String r5 = defpackage.lb1.m(r7, r6, r5)
        L3b:
            boolean r6 = r2.b
            java.lang.String r2 = r2.a
            if (r6 == 0) goto L4a
            vr4 r3 = new vr4
            r3.<init>(r2, r5)
            r8.add(r3)
            goto L1b
        L4a:
            boolean r3 = defpackage.xs6.Y(r2, r3, r4)
            if (r3 == 0) goto L1b
            vr4 r3 = new vr4
            r3.<init>(r2, r5)
            r0.add(r3)
            goto L1b
        L59:
            kw3 r1 = defpackage.hf.I()
            boolean r2 = defpackage.qs6.v0(r7)
            if (r2 != 0) goto L75
            me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$ShaderBrowserItem r2 = new me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$ShaderBrowserItem
            r5 = 47
            java.lang.String r6 = ""
            java.lang.String r7 = defpackage.qs6.R0(r5, r7, r6)
            java.lang.String r5 = ".."
            r2.<init>(r5, r7, r4, r4)
            r1.add(r2)
        L75:
            me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$loadShaderBrowserDirectory$2$items$1$invokeSuspend$lambda$1$$inlined$sortedBy$1 r7 = new me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$loadShaderBrowserDirectory$2$items$1$invokeSuspend$lambda$1$$inlined$sortedBy$1
            r7.<init>()
            java.util.List r7 = defpackage.gt0.d1(r8, r7)
            java.util.Iterator r7 = r7.iterator()
        L82:
            boolean r8 = r7.hasNext()
            r2 = 0
            if (r8 == 0) goto La0
            java.lang.Object r8 = r7.next()
            vr4 r8 = (defpackage.vr4) r8
            java.lang.Object r5 = r8.A
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r8 = r8.B
            java.lang.String r8 = (java.lang.String) r8
            me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$ShaderBrowserItem r6 = new me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$ShaderBrowserItem
            r6.<init>(r5, r8, r4, r2)
            r1.add(r6)
            goto L82
        La0:
            me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$loadShaderBrowserDirectory$2$items$1$invokeSuspend$lambda$1$$inlined$sortedBy$2 r7 = new me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$loadShaderBrowserDirectory$2$items$1$invokeSuspend$lambda$1$$inlined$sortedBy$2
            r7.<init>()
            java.util.List r7 = defpackage.gt0.d1(r0, r7)
            java.util.Iterator r7 = r7.iterator()
        Lad:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto Lce
            java.lang.Object r8 = r7.next()
            vr4 r8 = (defpackage.vr4) r8
            java.lang.Object r0 = r8.A
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r8 = r8.B
            java.lang.String r8 = (java.lang.String) r8
            me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$ShaderBrowserItem r4 = new me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$ShaderBrowserItem
            java.lang.String r0 = defpackage.qs6.E0(r0, r3)
            r4.<init>(r0, r8, r2, r2)
            r1.add(r4)
            goto Lad
        Lce:
            kw3 r7 = defpackage.hf.A(r1)
            return r7
    }
}
