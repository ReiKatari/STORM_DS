package me.magnum.melonds.ui.settings.fragments;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@defpackage.mc1(c = "me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$handleVulkanDriverImport$1$result$1", f = "VideoPreferencesFragment.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class VideoPreferencesFragment$handleVulkanDriverImport$1$result$1 extends defpackage.hw6 implements defpackage.eo2 {
    public /* synthetic */ java.lang.Object X;
    public final /* synthetic */ me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment Y;
    public final /* synthetic */ android.net.Uri Z;

    public VideoPreferencesFragment$handleVulkanDriverImport$1$result$1(me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment r1, android.net.Uri r2, defpackage.r41 r3) {
            r0 = this;
            r0.Y = r1
            r0.Z = r2
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
            me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$handleVulkanDriverImport$1$result$1 r0 = (me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$handleVulkanDriverImport$1$result$1) r0
            jg7 r1 = defpackage.jg7.a
            java.lang.Object r0 = r0.s(r1)
            return r0
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r3, java.lang.Object r4) {
            r2 = this;
            me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$handleVulkanDriverImport$1$result$1 r0 = new me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$handleVulkanDriverImport$1$result$1
            me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment r1 = r2.Y
            android.net.Uri r2 = r2.Z
            r0.<init>(r1, r2, r3)
            r0.X = r4
            return r0
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r2) {
            r1 = this;
            java.lang.Object r0 = r1.X
            w61 r0 = (defpackage.w61) r0
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r2)
            me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment r2 = r1.Y
            android.net.Uri r1 = r1.Z
            u63 r2 = r2.v0     // Catch: java.lang.Throwable -> L1d
            if (r2 == 0) goto L16
            ja r1 = r2.p(r1)     // Catch: java.lang.Throwable -> L1d
            goto L24
        L16:
            java.lang.String r1 = "adrenoVulkanDriverManager"
            defpackage.nb3.a0(r1)     // Catch: java.lang.Throwable -> L1d
            r1 = 0
            throw r1     // Catch: java.lang.Throwable -> L1d
        L1d:
            r1 = move-exception
            em5 r2 = new em5
            r2.<init>(r1)
            r1 = r2
        L24:
            hm5 r2 = new hm5
            r2.<init>(r1)
            return r2
    }
}
