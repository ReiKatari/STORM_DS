package me.magnum.melonds.ui.settings.fragments;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@defpackage.mc1(c = "me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$scanAndImportRetroArchShaders$1", f = "VideoPreferencesFragment.kt", l = {1391}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class VideoPreferencesFragment$scanAndImportRetroArchShaders$1 extends defpackage.hw6 implements defpackage.eo2 {
    public int X;
    public final /* synthetic */ android.content.Context Y;
    public final /* synthetic */ me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment Z;

    public VideoPreferencesFragment$scanAndImportRetroArchShaders$1(android.content.Context r1, me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment r2, defpackage.r41 r3) {
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
            me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$scanAndImportRetroArchShaders$1 r0 = (me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$scanAndImportRetroArchShaders$1) r0
            jg7 r1 = defpackage.jg7.a
            java.lang.Object r0 = r0.s(r1)
            return r0
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r2, java.lang.Object r3) {
            r1 = this;
            me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$scanAndImportRetroArchShaders$1 r3 = new me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$scanAndImportRetroArchShaders$1
            android.content.Context r0 = r1.Y
            me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment r1 = r1.Z
            r3.<init>(r0, r1, r2)
            return r3
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r12) {
            r11 = this;
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r11.X
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L14
            if (r1 != r3) goto Le
            defpackage.oi2.Y(r12)
            goto L3f
        Le:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r11)
            return r2
        L14:
            defpackage.oi2.Y(r12)
            java.lang.String r9 = "/storage/emulated/0/Download/shaders"
            java.lang.String r10 = "/storage/emulated/0/shaders"
            java.lang.String r4 = "/storage/emulated/0/RetroArch/shaders"
            java.lang.String r5 = "/storage/emulated/0/RetroArch/shaders_slang"
            java.lang.String r6 = "/storage/emulated/0/Android/data/com.retroarch/files/shaders"
            java.lang.String r7 = "/storage/emulated/0/Android/data/com.retroarch.aarch64/files/shaders"
            java.lang.String r8 = "/storage/emulated/0/Android/data/com.retroarch.ra32/files/shaders"
            java.lang.String[] r12 = new java.lang.String[]{r4, r5, r6, r7, r8, r9, r10}
            java.util.List r12 = defpackage.hf.c0(r12)
            xe1 r1 = defpackage.xk1.a
            de1 r1 = defpackage.de1.L
            me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$scanAndImportRetroArchShaders$1$foundDir$1 r4 = new me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$scanAndImportRetroArchShaders$1$foundDir$1
            r4.<init>(r12, r2)
            r11.X = r3
            java.lang.Object r12 = defpackage.hv.d0(r1, r4, r11)
            if (r12 != r0) goto L3f
            return r0
        L3f:
            java.io.File r12 = (java.io.File) r12
            jg7 r0 = defpackage.jg7.a
            android.content.Context r1 = r11.Y
            if (r12 != 0) goto L52
            r11 = 2131952855(0x7f1304d7, float:1.9542165E38)
            android.widget.Toast r11 = android.widget.Toast.makeText(r1, r11, r3)
            r11.show()
            return r0
        L52:
            zb r3 = new zb
            r3.<init>(r1)
            r4 = 2131952853(0x7f1304d5, float:1.954216E38)
            r3.z(r4)
            java.lang.String r4 = r12.getAbsolutePath()
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment r11 = r11.Z
            r5 = 2131952852(0x7f1304d4, float:1.9542158E38)
            java.lang.String r4 = r11.getString(r5, r4)
            java.lang.Object r5 = r3.L
            wb r5 = (defpackage.wb) r5
            r5.f = r4
            me.magnum.melonds.ui.settings.fragments.m r4 = new me.magnum.melonds.ui.settings.fragments.m
            r4.<init>(r11, r1, r12)
            r11 = 2131952357(0x7f1302e5, float:1.9541154E38)
            r3.y(r11, r4)
            r11 = 17039360(0x1040000, float:2.424457E-38)
            r3.x(r11, r2)
            r3.B()
            return r0
    }
}
