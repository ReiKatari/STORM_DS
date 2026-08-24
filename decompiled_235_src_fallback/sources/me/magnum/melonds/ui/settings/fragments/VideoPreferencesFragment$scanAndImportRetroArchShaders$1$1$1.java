package me.magnum.melonds.ui.settings.fragments;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@defpackage.mc1(c = "me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$scanAndImportRetroArchShaders$1$1$1", f = "VideoPreferencesFragment.kt", l = {1408}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class VideoPreferencesFragment$scanAndImportRetroArchShaders$1$1$1 extends defpackage.hw6 implements defpackage.eo2 {
    public int X;
    public final /* synthetic */ me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment Y;
    public final /* synthetic */ android.content.Context Z;
    public final /* synthetic */ java.io.File d0;

    public VideoPreferencesFragment$scanAndImportRetroArchShaders$1$1$1(me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment r1, android.content.Context r2, java.io.File r3, defpackage.r41 r4) {
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
            me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$scanAndImportRetroArchShaders$1$1$1 r0 = (me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$scanAndImportRetroArchShaders$1$1$1) r0
            jg7 r1 = defpackage.jg7.a
            java.lang.Object r0 = r0.s(r1)
            return r0
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r3, java.lang.Object r4) {
            r2 = this;
            me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$scanAndImportRetroArchShaders$1$1$1 r4 = new me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$scanAndImportRetroArchShaders$1$1$1
            android.content.Context r0 = r2.Z
            java.io.File r1 = r2.d0
            me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment r2 = r2.Y
            r4.<init>(r2, r0, r1, r3)
            return r4
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r9) {
            r8 = this;
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r8.X
            android.content.Context r2 = r8.Z
            r3 = 0
            r4 = 1
            me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment r5 = r8.Y
            if (r1 == 0) goto L18
            if (r1 != r4) goto L12
            defpackage.oi2.Y(r9)
            goto L47
        L12:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r8)
            return r3
        L18:
            defpackage.oi2.Y(r9)
            cp5 r9 = r5.p()
            java.io.File r9 = r9.d()
            if (r9 != 0) goto L33
            java.io.File r9 = new java.io.File
            java.io.File r1 = r2.getFilesDir()
            java.lang.String r6 = "shaders/retroarch"
            r9.<init>(r1, r6)
            r9.mkdirs()
        L33:
            xe1 r1 = defpackage.xk1.a
            de1 r1 = defpackage.de1.L
            me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$scanAndImportRetroArchShaders$1$1$1$importedCount$1 r6 = new me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$scanAndImportRetroArchShaders$1$1$1$importedCount$1
            java.io.File r7 = r8.d0
            r6.<init>(r7, r9, r3)
            r8.X = r4
            java.lang.Object r9 = defpackage.hv.d0(r1, r6, r8)
            if (r9 != r0) goto L47
            return r0
        L47:
            java.lang.Number r9 = (java.lang.Number) r9
            int r8 = r9.intValue()
            me.magnum.melonds.domain.model.RetroArchShaderSource r9 = me.magnum.melonds.domain.model.RetroArchShaderSource.INTERNAL
            r5.r(r9)
            r5.s()
            java.lang.Integer r9 = new java.lang.Integer
            r9.<init>(r8)
            java.lang.Object[] r8 = new java.lang.Object[]{r9}
            r9 = 2131952854(0x7f1304d6, float:1.9542163E38)
            java.lang.String r8 = r5.getString(r9, r8)
            android.widget.Toast r8 = android.widget.Toast.makeText(r2, r8, r4)
            r8.show()
            androidx.preference.ListPreference r8 = r5.s0
            if (r8 == 0) goto L76
            r5.y(r8)
            jg7 r8 = defpackage.jg7.a
            return r8
        L76:
            java.lang.String r8 = "shaderPresetPreference"
            defpackage.nb3.a0(r8)
            throw r3
    }
}
