package me.magnum.melonds.ui.settings.fragments;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@defpackage.mc1(c = "me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$confirmShaderUninstall$1$1", f = "VideoPreferencesFragment.kt", l = {1482}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class VideoPreferencesFragment$confirmShaderUninstall$1$1 extends defpackage.hw6 implements defpackage.eo2 {
    public int X;
    public final /* synthetic */ me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment Y;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    @defpackage.mc1(c = "me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$confirmShaderUninstall$1$1$1", f = "VideoPreferencesFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$confirmShaderUninstall$1$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass1 extends defpackage.hw6 implements defpackage.eo2 {
        public final /* synthetic */ me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment X;

        public AnonymousClass1(me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment r1, defpackage.r41 r2) {
                r0 = this;
                r0.X = r1
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
                me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$confirmShaderUninstall$1$1$1 r0 = (me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$confirmShaderUninstall$1$1.AnonymousClass1) r0
                jg7 r1 = defpackage.jg7.a
                r0.s(r1)
                return r1
        }

        @Override // defpackage.d20
        public final defpackage.r41 q(defpackage.r41 r1, java.lang.Object r2) {
                r0 = this;
                me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$confirmShaderUninstall$1$1$1 r2 = new me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$confirmShaderUninstall$1$1$1
                me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment r0 = r0.X
                r2.<init>(r0, r1)
                return r2
        }

        @Override // defpackage.d20
        public final java.lang.Object s(java.lang.Object r3) {
                r2 = this;
                x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
                defpackage.oi2.Y(r3)
                me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment r2 = r2.X
                cp5 r2 = r2.p()
                java.io.File r3 = r2.d
                defpackage.jc2.x0(r3)
                java.io.File r3 = r2.e
                r3.delete()
                java.io.File r3 = new java.io.File
                java.io.File r0 = r2.c
                java.lang.String r1 = "current"
                r3.<init>(r0, r1)
                defpackage.jc2.x0(r3)
                java.io.File r3 = r2.f
                r3.delete()
                android.content.SharedPreferences r2 = r2.b
                android.content.SharedPreferences$Editor r3 = r2.edit()
                java.lang.String r0 = "video_retroarch_shader_preset"
                android.content.SharedPreferences$Editor r3 = r3.remove(r0)
                r3.apply()
                android.content.SharedPreferences$Editor r2 = r2.edit()
                java.lang.String r3 = "video_retroarch_shader_library_version"
                long r0 = java.lang.System.currentTimeMillis()
                android.content.SharedPreferences$Editor r2 = r2.putLong(r3, r0)
                r2.apply()
                jg7 r2 = defpackage.jg7.a
                return r2
        }
    }

    public VideoPreferencesFragment$confirmShaderUninstall$1$1(me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment r1, defpackage.r41 r2) {
            r0 = this;
            r0.Y = r1
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
            me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$confirmShaderUninstall$1$1 r0 = (me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$confirmShaderUninstall$1$1) r0
            jg7 r1 = defpackage.jg7.a
            java.lang.Object r0 = r0.s(r1)
            return r0
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r1, java.lang.Object r2) {
            r0 = this;
            me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$confirmShaderUninstall$1$1 r2 = new me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$confirmShaderUninstall$1$1
            me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment r0 = r0.Y
            r2.<init>(r0, r1)
            return r2
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r6) {
            r5 = this;
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r5.X
            r2 = 0
            me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment r3 = r5.Y
            r4 = 1
            if (r1 == 0) goto L16
            if (r1 != r4) goto L10
            defpackage.oi2.Y(r6)
            goto L2b
        L10:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r5)
            return r2
        L16:
            defpackage.oi2.Y(r6)
            xe1 r6 = defpackage.xk1.a
            de1 r6 = defpackage.de1.L
            me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$confirmShaderUninstall$1$1$1 r1 = new me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$confirmShaderUninstall$1$1$1
            r1.<init>(r3, r2)
            r5.X = r4
            java.lang.Object r5 = defpackage.hv.d0(r6, r1, r5)
            if (r5 != r0) goto L2b
            return r0
        L2b:
            androidx.preference.ListPreference r5 = r3.s0
            if (r5 == 0) goto L33
            r6 = 2
            me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment.G(r3, r5, r2, r4, r6)
        L33:
            r3.s()
            jg7 r5 = defpackage.jg7.a
            return r5
    }
}
