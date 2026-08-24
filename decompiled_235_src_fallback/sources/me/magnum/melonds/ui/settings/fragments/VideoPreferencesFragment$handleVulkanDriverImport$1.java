package me.magnum.melonds.ui.settings.fragments;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@defpackage.mc1(c = "me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$handleVulkanDriverImport$1", f = "VideoPreferencesFragment.kt", l = {529}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class VideoPreferencesFragment$handleVulkanDriverImport$1 extends defpackage.hw6 implements defpackage.eo2 {
    public int X;
    public final /* synthetic */ me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment Y;
    public final /* synthetic */ android.net.Uri Z;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] a = null;

        static {
                ha[] r0 = defpackage.ha.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                ha r1 = defpackage.ha.NotZip     // Catch: java.lang.NoSuchFieldError -> L10
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L10
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L10
            L10:
                ha r1 = defpackage.ha.NoDriver     // Catch: java.lang.NoSuchFieldError -> L19
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L19
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L19
            L19:
                ha r1 = defpackage.ha.AmbiguousDriver     // Catch: java.lang.NoSuchFieldError -> L22
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L22
            L22:
                ha r1 = defpackage.ha.UnsupportedBuild     // Catch: java.lang.NoSuchFieldError -> L2b
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2b
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2b
            L2b:
                me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$handleVulkanDriverImport$1.WhenMappings.a = r0
                return
        }
    }

    public VideoPreferencesFragment$handleVulkanDriverImport$1(me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment r1, android.net.Uri r2, defpackage.r41 r3) {
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
            me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$handleVulkanDriverImport$1 r0 = (me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$handleVulkanDriverImport$1) r0
            jg7 r1 = defpackage.jg7.a
            java.lang.Object r0 = r0.s(r1)
            return r0
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r2, java.lang.Object r3) {
            r1 = this;
            me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$handleVulkanDriverImport$1 r3 = new me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$handleVulkanDriverImport$1
            me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment r0 = r1.Y
            android.net.Uri r1 = r1.Z
            r3.<init>(r0, r1, r2)
            return r3
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r7) {
            r6 = this;
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r6.X
            r2 = 0
            me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment r3 = r6.Y
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
            me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$handleVulkanDriverImport$1$result$1 r1 = new me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$handleVulkanDriverImport$1$result$1
            android.net.Uri r5 = r6.Z
            r1.<init>(r3, r5, r2)
            r6.X = r4
            java.lang.Object r7 = defpackage.hv.d0(r7, r1, r6)
            if (r7 != r0) goto L2d
            return r0
        L2d:
            hm5 r7 = (defpackage.hm5) r7
            java.lang.Object r6 = r7.A
            boolean r7 = r6 instanceof defpackage.em5
            if (r7 != 0) goto L67
            r7 = r6
            ja r7 = (defpackage.ja) r7
            java.lang.String r0 = "video_vulkan_driver_mode"
            androidx.preference.Preference r0 = r3.findPreference(r0)
            androidx.preference.ListPreference r0 = (androidx.preference.ListPreference) r0
            if (r0 != 0) goto L43
            goto L67
        L43:
            java.lang.String r1 = "video_vulkan_driver_remove"
            androidx.preference.Preference r1 = r3.findPreference(r1)
            if (r1 != 0) goto L4c
            goto L67
        L4c:
            r3.K(r0, r1)
            android.content.Context r0 = r3.requireContext()
            java.lang.String r7 = r7.b
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            r1 = 2131952879(0x7f1304ef, float:1.9542213E38)
            java.lang.String r7 = r3.getString(r1, r7)
            android.widget.Toast r7 = android.widget.Toast.makeText(r0, r7, r4)
            r7.show()
        L67:
            java.lang.Throwable r6 = defpackage.hm5.a(r6)
            if (r6 == 0) goto Lae
            boolean r7 = r6 instanceof defpackage.ia
            if (r7 == 0) goto L74
            ia r6 = (defpackage.ia) r6
            goto L75
        L74:
            r6 = r2
        L75:
            if (r6 == 0) goto L79
            ha r2 = r6.A
        L79:
            if (r2 != 0) goto L7d
            r6 = -1
            goto L85
        L7d:
            int[] r6 = me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$handleVulkanDriverImport$1.WhenMappings.a
            int r7 = r2.ordinal()
            r6 = r6[r7]
        L85:
            if (r6 == r4) goto La0
            r7 = 2
            if (r6 == r7) goto L9c
            r7 = 3
            if (r6 == r7) goto L98
            r7 = 4
            if (r6 == r7) goto L94
            r6 = 2131952876(0x7f1304ec, float:1.9542207E38)
            goto La3
        L94:
            r6 = 2131952890(0x7f1304fa, float:1.9542236E38)
            goto La3
        L98:
            r6 = 2131952875(0x7f1304eb, float:1.9542205E38)
            goto La3
        L9c:
            r6 = 2131952877(0x7f1304ed, float:1.954221E38)
            goto La3
        La0:
            r6 = 2131952878(0x7f1304ee, float:1.9542211E38)
        La3:
            android.content.Context r7 = r3.requireContext()
            android.widget.Toast r6 = android.widget.Toast.makeText(r7, r6, r4)
            r6.show()
        Lae:
            jg7 r6 = defpackage.jg7.a
            return r6
    }
}
