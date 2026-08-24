package me.magnum.melonds.ui.settings.fragments;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@defpackage.mc1(c = "me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$saveShaderCompatibilityLog$1", f = "VideoPreferencesFragment.kt", l = {1316}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class VideoPreferencesFragment$saveShaderCompatibilityLog$1 extends defpackage.hw6 implements defpackage.eo2 {
    public int X;
    public final /* synthetic */ me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment Y;
    public final /* synthetic */ android.net.Uri Z;
    public final /* synthetic */ java.util.List d0;

    public VideoPreferencesFragment$saveShaderCompatibilityLog$1(me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment r1, android.net.Uri r2, java.util.List r3, defpackage.r41 r4) {
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
            me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$saveShaderCompatibilityLog$1 r0 = (me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$saveShaderCompatibilityLog$1) r0
            jg7 r1 = defpackage.jg7.a
            java.lang.Object r0 = r0.s(r1)
            return r0
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r3, java.lang.Object r4) {
            r2 = this;
            me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$saveShaderCompatibilityLog$1 r4 = new me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$saveShaderCompatibilityLog$1
            android.net.Uri r0 = r2.Z
            java.util.List r1 = r2.d0
            me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment r2 = r2.Y
            r4.<init>(r2, r0, r1, r3)
            return r4
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r8) {
            r7 = this;
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r7.X
            r2 = 0
            me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment r3 = r7.Y
            r4 = 1
            if (r1 == 0) goto L16
            if (r1 != r4) goto L10
            defpackage.oi2.Y(r8)
            goto L2f
        L10:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r7)
            return r2
        L16:
            defpackage.oi2.Y(r8)
            xe1 r8 = defpackage.xk1.a
            de1 r8 = defpackage.de1.L
            me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$saveShaderCompatibilityLog$1$savedName$1 r1 = new me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$saveShaderCompatibilityLog$1$savedName$1
            android.net.Uri r5 = r7.Z
            java.util.List r6 = r7.d0
            r1.<init>(r3, r5, r6, r2)
            r7.X = r4
            java.lang.Object r8 = defpackage.hv.d0(r8, r1, r7)
            if (r8 != r0) goto L2f
            return r0
        L2f:
            java.lang.String r8 = (java.lang.String) r8
            if (r8 != 0) goto L42
            android.content.Context r7 = r3.requireContext()
            r8 = 2131952636(0x7f1303fc, float:1.954172E38)
            android.widget.Toast r7 = android.widget.Toast.makeText(r7, r8, r4)
            r7.show()
            goto L58
        L42:
            android.content.Context r7 = r3.requireContext()
            r0 = 2131952637(0x7f1303fd, float:1.9541722E38)
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            java.lang.String r8 = r3.getString(r0, r8)
            android.widget.Toast r7 = android.widget.Toast.makeText(r7, r8, r4)
            r7.show()
        L58:
            jg7 r7 = defpackage.jg7.a
            return r7
    }
}
