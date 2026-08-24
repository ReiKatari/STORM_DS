package me.magnum.melonds.ui.settings.fragments;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@defpackage.mc1(c = "me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$saveShaderCompatibilityLog$1$savedName$1", f = "VideoPreferencesFragment.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class VideoPreferencesFragment$saveShaderCompatibilityLog$1$savedName$1 extends defpackage.hw6 implements defpackage.eo2 {
    public /* synthetic */ java.lang.Object X;
    public final /* synthetic */ me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment Y;
    public final /* synthetic */ android.net.Uri Z;
    public final /* synthetic */ java.util.List d0;

    public VideoPreferencesFragment$saveShaderCompatibilityLog$1$savedName$1(me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment r1, android.net.Uri r2, java.util.List r3, defpackage.r41 r4) {
            r0 = this;
            r0.Y = r1
            r0.Z = r2
            r0.d0 = r3
            r1 = 2
            r0.<init>(r1, r4)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            w61 r1 = (defpackage.w61) r1
            r41 r2 = (defpackage.r41) r2
            r41 r0 = r0.q(r2, r1)
            me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$saveShaderCompatibilityLog$1$savedName$1 r0 = (me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$saveShaderCompatibilityLog$1$savedName$1) r0
            jg7 r1 = defpackage.jg7.a
            java.lang.Object r0 = r0.s(r1)
            return r0
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r4, java.lang.Object r5) {
            r3 = this;
            me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$saveShaderCompatibilityLog$1$savedName$1 r0 = new me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$saveShaderCompatibilityLog$1$savedName$1
            android.net.Uri r1 = r3.Z
            java.util.List r2 = r3.d0
            me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment r3 = r3.Y
            r0.<init>(r3, r1, r2, r4)
            r0.X = r5
            return r0
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r9) {
            r8 = this;
            java.lang.String r0 = "librashader.log"
            java.lang.Object r1 = r8.X
            w61 r1 = (defpackage.w61) r1
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r9)
            me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment r9 = r8.Y
            android.net.Uri r1 = r8.Z
            java.util.List r2 = r8.d0
            r8 = 0
            android.content.Context r3 = r9.requireContext()     // Catch: java.lang.Throwable -> L24
            qi6 r1 = defpackage.zl1.h(r3, r1)     // Catch: java.lang.Throwable -> L24
            zl1 r3 = r1.f(r0)     // Catch: java.lang.Throwable -> L24
            if (r3 == 0) goto L27
            r3.d()     // Catch: java.lang.Throwable -> L24
            goto L27
        L24:
            r0 = move-exception
            r9 = r0
            goto L70
        L27:
            java.lang.String r3 = "application/octet-stream"
            zl1 r1 = r1.c(r3, r0)     // Catch: java.lang.Throwable -> L24
            if (r1 != 0) goto L31
        L2f:
            r0 = r8
            goto L75
        L31:
            android.content.Context r9 = r9.requireContext()     // Catch: java.lang.Throwable -> L24
            android.content.ContentResolver r9 = r9.getContentResolver()     // Catch: java.lang.Throwable -> L24
            r3 = r1
            qi6 r3 = (defpackage.qi6) r3     // Catch: java.lang.Throwable -> L24
            android.net.Uri r3 = r3.c     // Catch: java.lang.Throwable -> L24
            java.io.OutputStream r9 = r9.openOutputStream(r3)     // Catch: java.lang.Throwable -> L24
            if (r9 == 0) goto L2f
            java.lang.String r3 = "\n"
            java.lang.String r5 = "\n"
            r6 = 0
            r7 = 58
            r4 = 0
            java.lang.String r2 = defpackage.gt0.P0(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L68
            java.nio.charset.Charset r3 = defpackage.qm0.a     // Catch: java.lang.Throwable -> L68
            byte[] r2 = r2.getBytes(r3)     // Catch: java.lang.Throwable -> L68
            r2.getClass()     // Catch: java.lang.Throwable -> L68
            r9.write(r2)     // Catch: java.lang.Throwable -> L68
            r9.close()     // Catch: java.lang.Throwable -> L24
            java.lang.String r9 = r1.i()     // Catch: java.lang.Throwable -> L24
            if (r9 != 0) goto L66
            goto L75
        L66:
            r0 = r9
            goto L75
        L68:
            r0 = move-exception
            r1 = r0
            throw r1     // Catch: java.lang.Throwable -> L6b
        L6b:
            r0 = move-exception
            defpackage.ge7.t(r9, r1)     // Catch: java.lang.Throwable -> L24
            throw r0     // Catch: java.lang.Throwable -> L24
        L70:
            em5 r0 = new em5
            r0.<init>(r9)
        L75:
            boolean r9 = r0 instanceof defpackage.em5
            if (r9 == 0) goto L7a
            goto L7b
        L7a:
            r8 = r0
        L7b:
            return r8
    }
}
