package me.magnum.melonds.ui.settings.fragments;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class VideoPreferencesFragment extends me.magnum.melonds.ui.settings.fragments.Hilt_VideoPreferencesFragment implements defpackage.q15 {
    public android.widget.TextView A0;
    public android.widget.TextView B0;
    public final defpackage.d9 C0;
    public boolean D0;
    public final defpackage.ex6 Z;
    public defpackage.wh7 d0;
    public defpackage.yj1 e0;
    public defpackage.kd6 f0;
    public defpackage.cp5 g0;
    public defpackage.ae6 h0;
    public final java.util.ArrayList i0;
    public final java.util.ArrayList j0;
    public final java.util.ArrayList k0;
    public final java.util.ArrayList l0;
    public final java.util.ArrayList m0;
    public androidx.preference.Preference n0;
    public androidx.preference.Preference o0;
    public androidx.preference.Preference p0;
    public androidx.preference.Preference q0;
    public me.magnum.melonds.ui.settings.preferences.StoragePickerPreference r0;
    public androidx.preference.ListPreference s0;
    public androidx.preference.Preference t0;
    public final java.util.LinkedHashMap u0;
    public defpackage.u63 v0;
    public defpackage.ap6 w0;
    public defpackage.ap6 x0;
    public defpackage.ac y0;
    public android.widget.ProgressBar z0;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public static final class Companion {
    }

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public final class ShaderBrowserAdapter extends defpackage.wf5 {
        public final defpackage.t46 d;
        public final me.magnum.melonds.ui.settings.fragments.d e;
        public final java.util.ArrayList f;
        public final /* synthetic */ me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment g;

        /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
        /* loaded from: classes.dex */
        public final class ViewHolder extends defpackage.wg5 {
            public static final /* synthetic */ int A = 0;
            public final android.widget.ImageView u;
            public final android.widget.TextView v;
            public final android.widget.TextView w;
            public final android.widget.TextView x;
            public final android.widget.ImageView y;
            public final /* synthetic */ me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment.ShaderBrowserAdapter z;

            public ViewHolder(me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment.ShaderBrowserAdapter r1, android.view.View r2) {
                    r0 = this;
                    r0.z = r1
                    r0.<init>(r2)
                    r1 = 2131427626(0x7f0b012a, float:1.8476874E38)
                    android.view.View r1 = r2.findViewById(r1)
                    r1.getClass()
                    android.widget.ImageView r1 = (android.widget.ImageView) r1
                    r0.u = r1
                    r1 = 2131427980(0x7f0b028c, float:1.8477592E38)
                    android.view.View r1 = r2.findViewById(r1)
                    r1.getClass()
                    android.widget.TextView r1 = (android.widget.TextView) r1
                    r0.v = r1
                    r1 = 2131427979(0x7f0b028b, float:1.847759E38)
                    android.view.View r1 = r2.findViewById(r1)
                    r1.getClass()
                    android.widget.TextView r1 = (android.widget.TextView) r1
                    r0.w = r1
                    r1 = 2131427978(0x7f0b028a, float:1.8477587E38)
                    android.view.View r1 = r2.findViewById(r1)
                    r1.getClass()
                    android.widget.TextView r1 = (android.widget.TextView) r1
                    r0.x = r1
                    r1 = 2131427625(0x7f0b0129, float:1.8476872E38)
                    android.view.View r1 = r2.findViewById(r1)
                    r1.getClass()
                    android.widget.ImageView r1 = (android.widget.ImageView) r1
                    r0.y = r1
                    return
            }
        }

        public ShaderBrowserAdapter(me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment r1, defpackage.t46 r2, me.magnum.melonds.ui.settings.fragments.d r3) {
                r0 = this;
                r0.g = r1
                r0.<init>()
                r0.d = r2
                r0.e = r3
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r0.f = r1
                return
        }

        @Override // defpackage.wf5
        public final int a() {
                r0 = this;
                java.util.ArrayList r0 = r0.f
                int r0 = r0.size()
                return r0
        }

        @Override // defpackage.wf5
        public final void e(defpackage.wg5 r12, int r13) {
                r11 = this;
                me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$ShaderBrowserAdapter$ViewHolder r12 = (me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment.ShaderBrowserAdapter.ViewHolder) r12
                java.util.ArrayList r11 = r11.f
                java.lang.Object r11 = r11.get(r13)
                me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$ShaderBrowserItem r11 = (me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment.ShaderBrowserItem) r11
                me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$ShaderBrowserAdapter r13 = r12.z
                android.view.View r0 = r12.a
                r11.getClass()
                boolean r1 = r11.c
                android.widget.TextView r2 = r12.v
                boolean r3 = r11.d
                if (r3 == 0) goto L25
                android.content.Context r4 = r0.getContext()
                r5 = 2131952827(0x7f1304bb, float:1.9542108E38)
                java.lang.String r4 = r4.getString(r5)
                goto L27
            L25:
                java.lang.String r4 = r11.a
            L27:
                r2.setText(r4)
                android.widget.ImageView r2 = r12.u
                if (r3 == 0) goto L32
                r4 = 2131230929(0x7f0800d1, float:1.8077925E38)
                goto L3b
            L32:
                if (r1 == 0) goto L38
                r4 = 2131230952(0x7f0800e8, float:1.8077971E38)
                goto L3b
            L38:
                r4 = 2131230950(0x7f0800e6, float:1.8077967E38)
            L3b:
                r2.setImageResource(r4)
                android.widget.ImageView r2 = r12.y
                r4 = 8
                r5 = 0
                if (r1 == 0) goto L49
                if (r3 != 0) goto L49
                r3 = r5
                goto L4a
            L49:
                r3 = r4
            L4a:
                r2.setVisibility(r3)
                r2 = 1
                if (r1 != 0) goto L61
                java.lang.String r3 = r11.b
                t46 r6 = r13.d
                java.lang.Object r6 = r6.B
                androidx.preference.ListPreference r6 = (androidx.preference.ListPreference) r6
                java.lang.String r6 = r6.e0
                boolean r3 = defpackage.nb3.k(r3, r6)
                if (r3 == 0) goto L61
                r5 = r2
            L61:
                r0.setSelected(r5)
                me.magnum.melonds.ui.settings.fragments.h r3 = new me.magnum.melonds.ui.settings.fragments.h
                r3.<init>(r2, r13, r11)
                r0.setOnClickListener(r3)
                android.widget.TextView r0 = r12.w
                r0.setVisibility(r4)
                android.widget.TextView r0 = r12.x
                r0.setVisibility(r4)
                if (r1 == 0) goto L79
                goto Lb7
            L79:
                java.lang.String r7 = r11.b
                me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment r6 = r13.g
                me.magnum.melonds.ui.settings.fragments.l r8 = new me.magnum.melonds.ui.settings.fragments.l
                r8.<init>(r7, r13, r12)
                cp5 r11 = r6.p()
                java.io.File r11 = r11.d()
                if (r11 == 0) goto Lb7
                me.magnum.melonds.domain.model.RetroArchShaderSource r12 = r6.t()
                me.magnum.melonds.domain.model.RetroArchShaderSource r13 = me.magnum.melonds.domain.model.RetroArchShaderSource.INTERNAL
                r0 = 0
                if (r12 != r13) goto L97
                r9 = r11
                goto L98
            L97:
                r9 = r0
            L98:
                if (r9 != 0) goto L9b
                goto Lb7
            L9b:
                java.util.LinkedHashMap r11 = r6.u0
                java.lang.Object r11 = r11.get(r7)
                ep5 r11 = (defpackage.ep5) r11
                if (r11 == 0) goto La9
                r8.g(r11)
                return
            La9:
                au3 r11 = defpackage.bl2.C(r6)
                me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$weighPresetAsync$2 r5 = new me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$weighPresetAsync$2
                r10 = 0
                r5.<init>(r6, r7, r8, r9, r10)
                r12 = 3
                defpackage.hv.L(r11, r0, r0, r5, r12)
            Lb7:
                return
        }

        @Override // defpackage.wf5
        public final defpackage.wg5 f(android.view.ViewGroup r4, int r5) {
                r3 = this;
                me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$ShaderBrowserAdapter$ViewHolder r5 = new me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$ShaderBrowserAdapter$ViewHolder
                me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment r0 = r3.g
                android.view.LayoutInflater r0 = r0.getLayoutInflater()
                r1 = 2131624010(0x7f0e004a, float:1.8875188E38)
                r2 = 0
                android.view.View r4 = r0.inflate(r1, r4, r2)
                r4.getClass()
                r5.<init>(r3, r4)
                return r5
        }

        public final void h(java.util.List r2) {
                r1 = this;
                r2.getClass()
                java.util.ArrayList r0 = r1.f
                r0.clear()
                defpackage.gt0.A0(r0, r2)
                xf5 r1 = r1.a
                r1.b()
                return
        }
    }

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public static final class ShaderBrowserEntry {
        public final java.lang.String a;
        public final boolean b;

        public ShaderBrowserEntry(java.lang.String r1, boolean r2) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                return
        }

        public final boolean equals(java.lang.Object r3) {
                r2 = this;
                if (r2 != r3) goto L3
                goto L1d
            L3:
                boolean r0 = r3 instanceof me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment.ShaderBrowserEntry
                if (r0 != 0) goto L8
                goto L1b
            L8:
                me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$ShaderBrowserEntry r3 = (me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment.ShaderBrowserEntry) r3
                java.lang.String r0 = r2.a
                java.lang.String r1 = r3.a
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L15
                goto L1b
            L15:
                boolean r2 = r2.b
                boolean r3 = r3.b
                if (r2 == r3) goto L1d
            L1b:
                r2 = 0
                return r2
            L1d:
                r2 = 1
                return r2
        }

        public final int hashCode() {
                r1 = this;
                java.lang.String r0 = r1.a
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                boolean r1 = r1.b
                int r1 = java.lang.Boolean.hashCode(r1)
                int r1 = r1 + r0
                return r1
        }

        public final java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "ShaderBrowserEntry(name="
                r0.<init>(r1)
                java.lang.String r1 = r2.a
                r0.append(r1)
                java.lang.String r1 = ", isDirectory="
                r0.append(r1)
                boolean r2 = r2.b
                r0.append(r2)
                java.lang.String r2 = ")"
                r0.append(r2)
                java.lang.String r2 = r0.toString()
                return r2
        }
    }

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public static final class ShaderBrowserItem {
        public final java.lang.String a;
        public final java.lang.String b;
        public final boolean c;
        public final boolean d;

        public ShaderBrowserItem(java.lang.String r1, java.lang.String r2, boolean r3, boolean r4) {
                r0 = this;
                r1.getClass()
                r2.getClass()
                r0.<init>()
                r0.a = r1
                r0.b = r2
                r0.c = r3
                r0.d = r4
                return
        }

        public final boolean equals(java.lang.Object r3) {
                r2 = this;
                if (r2 != r3) goto L3
                goto L2f
            L3:
                boolean r0 = r3 instanceof me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment.ShaderBrowserItem
                if (r0 != 0) goto L8
                goto L2d
            L8:
                me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$ShaderBrowserItem r3 = (me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment.ShaderBrowserItem) r3
                java.lang.String r0 = r2.a
                java.lang.String r1 = r3.a
                boolean r0 = defpackage.nb3.k(r0, r1)
                if (r0 != 0) goto L15
                goto L2d
            L15:
                java.lang.String r0 = r2.b
                java.lang.String r1 = r3.b
                boolean r0 = defpackage.nb3.k(r0, r1)
                if (r0 != 0) goto L20
                goto L2d
            L20:
                boolean r0 = r2.c
                boolean r1 = r3.c
                if (r0 == r1) goto L27
                goto L2d
            L27:
                boolean r2 = r2.d
                boolean r3 = r3.d
                if (r2 == r3) goto L2f
            L2d:
                r2 = 0
                return r2
            L2f:
                r2 = 1
                return r2
        }

        public final int hashCode() {
                r3 = this;
                java.lang.String r0 = r3.a
                int r0 = r0.hashCode()
                r1 = 31
                int r0 = r0 * r1
                java.lang.String r2 = r3.b
                int r0 = defpackage.xg6.d(r0, r1, r2)
                boolean r2 = r3.c
                int r0 = defpackage.xg6.e(r0, r2, r1)
                boolean r3 = r3.d
                int r3 = java.lang.Boolean.hashCode(r3)
                int r3 = r3 + r0
                return r3
        }

        public final java.lang.String toString() {
                r5 = this;
                java.lang.String r0 = ", path="
                java.lang.String r1 = ", isDirectory="
                java.lang.String r2 = "ShaderBrowserItem(label="
                java.lang.String r3 = r5.a
                java.lang.String r4 = r5.b
                java.lang.StringBuilder r0 = defpackage.i61.u(r2, r3, r0, r4, r1)
                boolean r1 = r5.c
                r0.append(r1)
                java.lang.String r1 = ", isParent="
                r0.append(r1)
                boolean r5 = r5.d
                r0.append(r5)
                java.lang.String r5 = ")"
                r0.append(r5)
                java.lang.String r5 = r0.toString()
                return r5
        }
    }

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public interface ShaderDirectoryLister {
        java.util.List a(java.lang.String r1);
    }

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] a = null;
        public static final /* synthetic */ int[] b = null;
        public static final /* synthetic */ int[] c = null;
        public static final /* synthetic */ int[] d = null;
        public static final /* synthetic */ int[] e = null;

        static {
                me.magnum.melonds.domain.model.RetroArchShaderSource[] r0 = me.magnum.melonds.domain.model.RetroArchShaderSource.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                me.magnum.melonds.domain.model.RetroArchShaderSource r2 = me.magnum.melonds.domain.model.RetroArchShaderSource.INTERNAL     // Catch: java.lang.NoSuchFieldError -> L10
                int r2 = r2.ordinal()     // Catch: java.lang.NoSuchFieldError -> L10
                r0[r2] = r1     // Catch: java.lang.NoSuchFieldError -> L10
            L10:
                r2 = 2
                me.magnum.melonds.domain.model.RetroArchShaderSource r3 = me.magnum.melonds.domain.model.RetroArchShaderSource.FOLDER     // Catch: java.lang.NoSuchFieldError -> L19
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L19
                r0[r3] = r2     // Catch: java.lang.NoSuchFieldError -> L19
            L19:
                me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment.WhenMappings.a = r0
                me.magnum.melonds.domain.model.VideoRenderer[] r0 = me.magnum.melonds.domain.model.VideoRenderer.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                me.magnum.melonds.domain.model.VideoRenderer r3 = me.magnum.melonds.domain.model.VideoRenderer.SOFTWARE     // Catch: java.lang.NoSuchFieldError -> L2a
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2a
                r0[r3] = r1     // Catch: java.lang.NoSuchFieldError -> L2a
            L2a:
                me.magnum.melonds.domain.model.VideoRenderer r3 = me.magnum.melonds.domain.model.VideoRenderer.OPENGL     // Catch: java.lang.NoSuchFieldError -> L32
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L32
                r0[r3] = r2     // Catch: java.lang.NoSuchFieldError -> L32
            L32:
                r3 = 3
                me.magnum.melonds.domain.model.VideoRenderer r4 = me.magnum.melonds.domain.model.VideoRenderer.COMPUTE     // Catch: java.lang.NoSuchFieldError -> L3b
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3b
                r0[r4] = r3     // Catch: java.lang.NoSuchFieldError -> L3b
            L3b:
                me.magnum.melonds.domain.model.VideoRenderer r4 = me.magnum.melonds.domain.model.VideoRenderer.VULKAN     // Catch: java.lang.NoSuchFieldError -> L44
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L44
                r5 = 4
                r0[r4] = r5     // Catch: java.lang.NoSuchFieldError -> L44
            L44:
                me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment.WhenMappings.b = r0
                xo5[] r0 = defpackage.xo5.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                xo5 r4 = defpackage.xo5.NotEnoughSpace     // Catch: java.lang.NoSuchFieldError -> L55
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L55
                r0[r4] = r1     // Catch: java.lang.NoSuchFieldError -> L55
            L55:
                xo5 r4 = defpackage.xo5.Truncated     // Catch: java.lang.NoSuchFieldError -> L5d
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L5d
                r0[r4] = r2     // Catch: java.lang.NoSuchFieldError -> L5d
            L5d:
                xo5 r4 = defpackage.xo5.CorruptArchive     // Catch: java.lang.NoSuchFieldError -> L65
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L65
                r0[r4] = r3     // Catch: java.lang.NoSuchFieldError -> L65
            L65:
                me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment.WhenMappings.c = r0
                jq1[] r0 = defpackage.jq1.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                jq1 r4 = defpackage.jq1.OFF     // Catch: java.lang.NoSuchFieldError -> L76
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L76
                r0[r4] = r1     // Catch: java.lang.NoSuchFieldError -> L76
            L76:
                jq1 r4 = defpackage.jq1.INTERNAL_TOP_EXTERNAL_BOTTOM     // Catch: java.lang.NoSuchFieldError -> L7e
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L7e
                r0[r4] = r2     // Catch: java.lang.NoSuchFieldError -> L7e
            L7e:
                jq1 r4 = defpackage.jq1.INTERNAL_BOTTOM_EXTERNAL_TOP     // Catch: java.lang.NoSuchFieldError -> L86
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L86
                r0[r4] = r3     // Catch: java.lang.NoSuchFieldError -> L86
            L86:
                me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment.WhenMappings.d = r0
                p66[] r0 = defpackage.p66.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                p66 r4 = defpackage.p66.TOP     // Catch: java.lang.NoSuchFieldError -> L97
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L97
                r0[r4] = r1     // Catch: java.lang.NoSuchFieldError -> L97
            L97:
                p66 r1 = defpackage.p66.CENTER     // Catch: java.lang.NoSuchFieldError -> L9f
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L9f
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L9f
            L9f:
                p66 r1 = defpackage.p66.BOTTOM     // Catch: java.lang.NoSuchFieldError -> La7
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> La7
                r0[r1] = r3     // Catch: java.lang.NoSuchFieldError -> La7
            La7:
                me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment.WhenMappings.e = r0
                return
        }
    }

    public VideoPreferencesFragment() {
            r3 = this;
            r3.<init>()
            t46 r0 = new t46
            r1 = 21
            r0.<init>(r3, r1)
            ex6 r1 = new ex6
            r1.<init>(r0)
            r3.Z = r1
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.i0 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.j0 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.k0 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.l0 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.m0 = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r3.u0 = r0
            c9 r0 = new c9
            r1 = 1
            r0.<init>(r1)
            me.magnum.melonds.ui.settings.fragments.b r1 = new me.magnum.melonds.ui.settings.fragments.b
            r2 = 2
            r1.<init>(r3, r2)
            d9 r0 = r3.registerForActivityResult(r0, r1)
            r0.getClass()
            r3.C0 = r0
            return
    }

    public static final void C(java.util.Collection r1, boolean r2) {
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L6:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L16
            java.lang.Object r0 = r1.next()
            android.widget.RadioButton r0 = (android.widget.RadioButton) r0
            r0.setEnabled(r2)
            goto L6
        L16:
            return
    }

    public static void G(me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment r2, androidx.preference.ListPreference r3, android.net.Uri r4, boolean r5, int r6) {
            r0 = r6 & 2
            r1 = 0
            if (r0 == 0) goto L6
            r4 = r1
        L6:
            r6 = r6 & 4
            r0 = 0
            if (r6 == 0) goto L11
            if (r4 == 0) goto L10
            r4 = 1
            r5 = r4
            goto L11
        L10:
            r5 = r0
        L11:
            ap6 r4 = r2.w0
            if (r4 == 0) goto L18
            r4.h(r1)
        L18:
            if (r5 == 0) goto L1d
            r3.h(r1)
        L1d:
            java.lang.String r4 = r3.e0
            if (r4 == 0) goto L28
            java.lang.String[] r5 = new java.lang.String[]{r4}
            java.lang.CharSequence[] r5 = (java.lang.CharSequence[]) r5
            goto L2a
        L28:
            java.lang.CharSequence[] r5 = new java.lang.CharSequence[r0]
        L2a:
            r3.g(r5)
            if (r4 == 0) goto L36
            java.lang.String[] r5 = new java.lang.String[]{r4}
            java.lang.CharSequence[] r5 = (java.lang.CharSequence[]) r5
            goto L38
        L36:
            java.lang.CharSequence[] r5 = new java.lang.CharSequence[r0]
        L38:
            r3.d0 = r5
            if (r4 == 0) goto L3d
            goto L47
        L3d:
            r4 = 2131952845(0x7f1304cd, float:1.9542144E38)
            java.lang.String r4 = r2.getString(r4)
            r4.getClass()
        L47:
            r3.setSummary(r4)
            return
    }

    public static me.magnum.melonds.domain.model.VideoFiltering L(java.lang.String r2) {
            if (r2 != 0) goto L4
            java.lang.String r2 = ""
        L4:
            me.magnum.melonds.domain.model.VideoFiltering[] r0 = me.magnum.melonds.domain.model.VideoFiltering.values()     // Catch: java.lang.Throwable -> Lf
            java.lang.Enum r2 = defpackage.jw2.o(r2, r0)     // Catch: java.lang.Throwable -> Lf
            me.magnum.melonds.domain.model.VideoFiltering r2 = (me.magnum.melonds.domain.model.VideoFiltering) r2     // Catch: java.lang.Throwable -> Lf
            goto L16
        Lf:
            r2 = move-exception
            em5 r0 = new em5
            r0.<init>(r2)
            r2 = r0
        L16:
            me.magnum.melonds.domain.model.VideoFiltering r0 = me.magnum.melonds.domain.model.VideoFiltering.NONE
            boolean r1 = r2 instanceof defpackage.em5
            if (r1 == 0) goto L1d
            r2 = r0
        L1d:
            me.magnum.melonds.domain.model.VideoFiltering r2 = (me.magnum.melonds.domain.model.VideoFiltering) r2
            return r2
    }

    public static final void k(me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment r1) {
            r0 = 0
            r1.D0 = r0
            ac r0 = r1.y0
            if (r0 == 0) goto La
            r0.dismiss()
        La:
            r0 = 0
            r1.y0 = r0
            r1.z0 = r0
            r1.A0 = r0
            r1.B0 = r0
            return
    }

    public static final void l(me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment r1, defpackage.xo5 r2, long r3) {
            int[] r0 = me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment.WhenMappings.c
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            if (r2 == r0) goto L21
            r3 = 2
            if (r2 == r3) goto L19
            r3 = 3
            if (r2 == r3) goto L19
            r2 = 2131952834(0x7f1304c2, float:1.9542122E38)
            java.lang.String r2 = r1.getString(r2)
            goto L34
        L19:
            r2 = 2131952833(0x7f1304c1, float:1.954212E38)
            java.lang.String r2 = r1.getString(r2)
            goto L34
        L21:
            android.content.Context r2 = r1.requireContext()
            java.lang.String r2 = android.text.format.Formatter.formatShortFileSize(r2, r3)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            r3 = 2131952835(0x7f1304c3, float:1.9542124E38)
            java.lang.String r2 = r1.getString(r3, r2)
        L34:
            r2.getClass()
            zb r3 = new zb
            android.content.Context r4 = r1.requireContext()
            r3.<init>(r4)
            java.lang.Object r4 = r3.L
            wb r4 = (defpackage.wb) r4
            r4.f = r2
            rm7 r2 = new rm7
            r4 = 0
            r2.<init>(r1, r4)
            r1 = 2131952849(0x7f1304d1, float:1.9542152E38)
            r3.y(r1, r2)
            r1 = 17039360(0x1040000, float:2.424457E-38)
            r2 = 0
            r3.x(r1, r2)
            r3.B()
            return
    }

    public static final void u(defpackage.dh5 r3, android.widget.TextView r4, androidx.appcompat.widget.SwitchCompat r5, androidx.appcompat.widget.SwitchCompat r6, defpackage.zg5 r7, defpackage.zg5 r8, android.widget.Button r9, android.widget.Button r10) {
            java.lang.Object r3 = r3.A
            jq1 r0 = defpackage.jq1.OFF
            r1 = 1
            r2 = 0
            if (r3 == r0) goto La
            r3 = r1
            goto Lb
        La:
            r3 = r2
        Lb:
            r4.getClass()
            if (r3 != 0) goto L12
            r0 = r2
            goto L14
        L12:
            r0 = 8
        L14:
            r4.setVisibility(r0)
            r5.setEnabled(r3)
            r6.setEnabled(r3)
            if (r3 == 0) goto L28
            boolean r3 = r7.A
            if (r3 != 0) goto L29
            boolean r3 = r8.A
            if (r3 == 0) goto L28
            goto L29
        L28:
            r1 = r2
        L29:
            r9.setEnabled(r1)
            r10.setEnabled(r1)
            return
    }

    public static final void v(defpackage.dh5 r2, defpackage.dh5 r3, defpackage.dh5 r4, android.widget.TextView r5, me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment r6) {
            java.lang.Object r2 = r2.A
            jq1 r2 = (defpackage.jq1) r2
            java.lang.Object r3 = r3.A
            p66 r3 = (defpackage.p66) r3
            java.lang.Object r4 = r4.A
            p66 r4 = (defpackage.p66) r4
            p66 r0 = defpackage.lb4.r(r2)
            p66 r2 = defpackage.lb4.q(r2)
            r1 = 2131951921(0x7f130131, float:1.954027E38)
            if (r3 != 0) goto L29
            java.lang.String r3 = r6.m(r0)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r3 = r6.getString(r1, r3)
            r3.getClass()
            goto L2d
        L29:
            java.lang.String r3 = r6.m(r3)
        L2d:
            if (r4 != 0) goto L3f
            java.lang.String r2 = r6.m(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r2 = r6.getString(r1, r2)
            r2.getClass()
            goto L43
        L3f:
            java.lang.String r2 = r6.m(r4)
        L43:
            r4 = 2131951922(0x7f130132, float:1.9540272E38)
            java.lang.Object[] r2 = new java.lang.Object[]{r3, r2}
            java.lang.String r2 = r6.getString(r4, r2)
            r2.getClass()
            r5.setText(r2)
            r2 = 0
            r5.setVisibility(r2)
            return
    }

    public static final void w(boolean r2, androidx.appcompat.widget.SwitchCompat r3, androidx.appcompat.widget.SwitchCompat r4, boolean r5, boolean r6) {
            r0 = 1
            r1 = 0
            if (r2 == 0) goto L8
            if (r5 == 0) goto L8
            r2 = r0
            goto L9
        L8:
            r2 = r1
        L9:
            r3.setEnabled(r2)
            r4.setEnabled(r2)
            if (r6 != 0) goto L12
            goto L2a
        L12:
            if (r5 != 0) goto L1b
            r3.setChecked(r1)
            r4.setChecked(r1)
            return
        L1b:
            boolean r2 = r3.isChecked()
            if (r2 != 0) goto L2a
            boolean r2 = r4.isChecked()
            if (r2 != 0) goto L2a
            r3.setChecked(r0)
        L2a:
            return
    }

    public static final void x(boolean r2, androidx.appcompat.widget.SwitchCompat r3, androidx.appcompat.widget.SwitchCompat r4, boolean r5, boolean r6) {
            r0 = 1
            r1 = 0
            if (r2 == 0) goto L8
            if (r5 == 0) goto L8
            r2 = r0
            goto L9
        L8:
            r2 = r1
        L9:
            r3.setEnabled(r2)
            r4.setEnabled(r2)
            if (r6 != 0) goto L12
            goto L2a
        L12:
            if (r5 != 0) goto L1b
            r3.setChecked(r1)
            r4.setChecked(r1)
            return
        L1b:
            boolean r2 = r3.isChecked()
            if (r2 != 0) goto L2a
            boolean r2 = r4.isChecked()
            if (r2 != 0) goto L2a
            r3.setChecked(r0)
        L2a:
            return
    }

    public static final void z(defpackage.dh5 r7, me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment r8, me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment.ShaderDirectoryLister r9, java.util.LinkedHashMap r10, android.widget.TextView r11, android.widget.TextView r12, defpackage.dh5 r13, java.lang.String r14) {
            r7.A = r14
            r11.getClass()
            r12.getClass()
            java.lang.Object r7 = r13.A
            r13 = 0
            if (r7 == 0) goto L6a
            r3 = r7
            me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$ShaderBrowserAdapter r3 = (me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment.ShaderBrowserAdapter) r3
            ap6 r7 = r8.w0
            if (r7 == 0) goto L17
            r7.h(r13)
        L17:
            boolean r7 = defpackage.qs6.v0(r14)
            java.lang.String r0 = "/"
            if (r7 == 0) goto L20
            goto L24
        L20:
            java.lang.String r0 = r0.concat(r14)
        L24:
            r11.setText(r0)
            java.lang.Object r7 = r10.get(r14)
            java.util.List r7 = (java.util.List) r7
            r11 = 0
            if (r7 == 0) goto L46
            r3.h(r7)
            r8 = 2131952824(0x7f1304b8, float:1.9542102E38)
            r12.setText(r8)
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L40
            goto L42
        L40:
            r11 = 8
        L42:
            r12.setVisibility(r11)
            return
        L46:
            yt1 r7 = defpackage.yt1.A
            r3.h(r7)
            r7 = 2131952024(0x7f130198, float:1.954048E38)
            r12.setText(r7)
            r12.setVisibility(r11)
            au3 r7 = defpackage.bl2.C(r8)
            me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$loadShaderBrowserDirectory$2 r0 = new me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$loadShaderBrowserDirectory$2
            r6 = 0
            r5 = r9
            r1 = r10
            r4 = r12
            r2 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r9 = 3
            ap6 r7 = defpackage.hv.L(r7, r13, r13, r0, r9)
            r8.w0 = r7
            return
        L6a:
            java.lang.String r7 = "adapter"
            defpackage.nb3.a0(r7)
            throw r13
    }

    public final void A() {
            r9 = this;
            boolean r0 = r9.D0
            if (r0 != 0) goto L93
            ac r0 = r9.y0
            r1 = 1
            if (r0 == 0) goto L11
            boolean r0 = r0.isShowing()
            if (r0 != r1) goto L11
            goto L93
        L11:
            android.content.Context r0 = r9.requireContext()
            r0.getClass()
            android.content.res.Resources r2 = r9.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            android.widget.TextView r3 = new android.widget.TextView
            r3.<init>(r0)
            android.widget.ProgressBar r4 = new android.widget.ProgressBar
            r5 = 0
            r6 = 16842872(0x1010078, float:2.3693894E-38)
            r4.<init>(r0, r5, r6)
            r5 = 100
            r4.setMax(r5)
            r4.setIndeterminate(r1)
            android.widget.TextView r5 = new android.widget.TextView
            r5.<init>(r0)
            android.widget.LinearLayout r6 = new android.widget.LinearLayout
            r6.<init>(r0)
            r6.setOrientation(r1)
            r7 = 1103101952(0x41c00000, float:24.0)
            float r7 = r7 * r2
            int r7 = (int) r7
            r8 = 1098907648(0x41800000, float:16.0)
            float r8 = r8 * r2
            int r2 = (int) r8
            r8 = 0
            r6.setPadding(r7, r2, r7, r8)
            r6.addView(r3)
            r6.addView(r4)
            r6.addView(r5)
            r9.A0 = r3
            r9.z0 = r4
            r9.B0 = r5
            zb r2 = new zb
            r2.<init>(r0)
            r3 = 2131952838(0x7f1304c6, float:1.954213E38)
            r2.z(r3)
            r2.A(r6)
            java.lang.Object r3 = r2.L
            wb r3 = (defpackage.wb) r3
            r3.m = r8
            rm7 r3 = new rm7
            r3.<init>(r9, r1)
            r1 = 2131952216(0x7f130258, float:1.9540868E38)
            r2.y(r1, r3)
            ax r1 = new ax
            r3 = 3
            r1.<init>(r0, r3)
            r0 = 17039360(0x1040000, float:2.424457E-38)
            r2.x(r0, r1)
            ac r0 = r2.l()
            r0.show()
            r9.y0 = r0
        L93:
            return
    }

    public final void B() {
            r5 = this;
            android.content.Context r0 = r5.requireContext()
            r0.getClass()
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r0)
            r2 = 2131623996(0x7f0e003c, float:1.887516E38)
            r3 = 0
            android.view.View r1 = r1.inflate(r2, r3)
            zb r2 = new zb
            r2.<init>(r0)
            r0 = 2131952864(0x7f1304e0, float:1.9542183E38)
            r2.z(r0)
            r2.A(r1)
            r0 = 17039360(0x1040000, float:2.424457E-38)
            r2.x(r0, r3)
            ac r0 = r2.l()
            r2 = 2131427459(0x7f0b0083, float:1.8476535E38)
            android.view.View r2 = r1.findViewById(r2)
            r3 = 0
            if (r2 == 0) goto L3c
            me.magnum.melonds.ui.settings.fragments.h r4 = new me.magnum.melonds.ui.settings.fragments.h
            r4.<init>(r3, r0, r5)
            r2.setOnClickListener(r4)
        L3c:
            r2 = 2131427458(0x7f0b0082, float:1.8476533E38)
            android.view.View r2 = r1.findViewById(r2)
            if (r2 == 0) goto L4d
            tm7 r4 = new tm7
            r4.<init>(r0, r5, r3)
            r2.setOnClickListener(r4)
        L4d:
            r2 = 2131427457(0x7f0b0081, float:1.847653E38)
            android.view.View r1 = r1.findViewById(r2)
            if (r1 == 0) goto L5f
            tm7 r2 = new tm7
            r3 = 1
            r2.<init>(r0, r5, r3)
            r1.setOnClickListener(r2)
        L5f:
            r0.show()
            return
    }

    public final void D() {
            r14 = this;
            r0 = 0
            r14.D0 = r0
            bk1 r0 = new bk1
            java.lang.Class<me.magnum.melonds.common.workers.RetroArchShaderInstallWorker> r1 = me.magnum.melonds.common.workers.RetroArchShaderInstallWorker.class
            r0.<init>(r1)
            af4 r1 = new af4
            kf4 r1 = defpackage.kf4.NOT_REQUIRED
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            kf4 r4 = defpackage.kf4.CONNECTED
            r4.getClass()
            af4 r3 = new af4
            r2 = 0
            r3.<init>(r2)
            java.util.Set r13 = defpackage.gt0.p1(r1)
            p21 r2 = new p21
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = -1
            r11 = r9
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r11, r13)
            java.lang.Object r1 = r0.B
            yw7 r1 = (defpackage.yw7) r1
            r1.j = r2
            gm4 r0 = r0.c()
            android.content.Context r1 = r14.requireContext()
            r1.getClass()
            lw7 r1 = defpackage.lw7.b(r1)
            r1.getClass()
            java.lang.String r2 = "retroarch-shader-install"
            y72 r3 = defpackage.y72.KEEP
            r1.a(r2, r3, r0)
            r14.A()
            return
    }

    public final void E() {
            r18 = this;
            r0 = r18
            androidx.preference.Preference r1 = r0.n0
            if (r1 != 0) goto L7
            return
        L7:
            kd6 r1 = r0.o()
            ng6 r1 = (defpackage.ng6) r1
            jq1 r1 = r1.i()
            kd6 r2 = r0.o()
            ng6 r2 = (defpackage.ng6) r2
            android.content.SharedPreferences r2 = r2.b
            java.lang.String r3 = "external_display_keep_ratio"
            r4 = 1
            boolean r2 = r2.getBoolean(r3, r4)
            kd6 r3 = r0.o()
            ng6 r3 = (defpackage.ng6) r3
            android.content.SharedPreferences r3 = r3.b
            java.lang.String r5 = "dual_screen_integer_scale"
            r6 = 0
            boolean r3 = r3.getBoolean(r5, r6)
            if (r3 == 0) goto L37
            jq1 r3 = defpackage.jq1.OFF
            if (r1 == r3) goto L37
            r3 = r4
            goto L38
        L37:
            r3 = r6
        L38:
            jq1 r5 = defpackage.jq1.OFF
            if (r1 == r5) goto L42
            if (r3 != 0) goto L40
            if (r2 == 0) goto L42
        L40:
            r7 = r4
            goto L43
        L42:
            r7 = r6
        L43:
            kd6 r8 = r0.o()
            ng6 r8 = (defpackage.ng6) r8
            android.content.SharedPreferences r8 = r8.b
            java.lang.String r9 = "dual_screen_internal_fill_height"
            boolean r8 = r8.getBoolean(r9, r6)
            if (r8 == 0) goto L57
            if (r7 == 0) goto L57
            r8 = r4
            goto L58
        L57:
            r8 = r6
        L58:
            kd6 r9 = r0.o()
            ng6 r9 = (defpackage.ng6) r9
            android.content.SharedPreferences r9 = r9.b
            java.lang.String r10 = "dual_screen_internal_fill_width"
            boolean r9 = r9.getBoolean(r10, r6)
            if (r9 == 0) goto L6c
            if (r7 == 0) goto L6c
            r9 = r4
            goto L6d
        L6c:
            r9 = r6
        L6d:
            kd6 r10 = r0.o()
            ng6 r10 = (defpackage.ng6) r10
            android.content.SharedPreferences r10 = r10.b
            java.lang.String r11 = "dual_screen_external_fill_height"
            boolean r10 = r10.getBoolean(r11, r6)
            if (r10 == 0) goto L81
            if (r7 == 0) goto L81
            r10 = r4
            goto L82
        L81:
            r10 = r6
        L82:
            kd6 r11 = r0.o()
            ng6 r11 = (defpackage.ng6) r11
            android.content.SharedPreferences r11 = r11.b
            java.lang.String r12 = "dual_screen_external_fill_width"
            boolean r11 = r11.getBoolean(r12, r6)
            if (r11 == 0) goto L95
            if (r7 == 0) goto L95
            r6 = r4
        L95:
            int[] r7 = me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment.WhenMappings.d
            int r11 = r1.ordinal()
            r7 = r7[r11]
            if (r7 == r4) goto Lb1
            r4 = 2
            if (r7 == r4) goto Lad
            r4 = 3
            if (r7 != r4) goto La9
            r4 = 2131951906(0x7f130122, float:1.954024E38)
            goto Lb4
        La9:
            defpackage.i.d()
            return
        Lad:
            r4 = 2131951907(0x7f130123, float:1.9540242E38)
            goto Lb4
        Lb1:
            r4 = 2131951908(0x7f130124, float:1.9540244E38)
        Lb4:
            androidx.preference.Preference r7 = r0.n0
            if (r7 == 0) goto L124
            java.lang.String r11 = r0.getString(r4)
            r4 = 2131952304(0x7f1302b0, float:1.9541047E38)
            r12 = 2131952358(0x7f1302e6, float:1.9541156E38)
            if (r1 == r5) goto Lcb
            if (r2 == 0) goto Lcb
            java.lang.String r2 = r0.getString(r12)
            goto Lcf
        Lcb:
            java.lang.String r2 = r0.getString(r4)
        Lcf:
            if (r1 == r5) goto Ld9
            if (r3 == 0) goto Ld9
            java.lang.String r1 = r0.getString(r12)
        Ld7:
            r13 = r1
            goto Lde
        Ld9:
            java.lang.String r1 = r0.getString(r4)
            goto Ld7
        Lde:
            if (r8 == 0) goto Le6
            java.lang.String r1 = r0.getString(r12)
        Le4:
            r14 = r1
            goto Leb
        Le6:
            java.lang.String r1 = r0.getString(r4)
            goto Le4
        Leb:
            if (r9 == 0) goto Lf3
            java.lang.String r1 = r0.getString(r12)
        Lf1:
            r15 = r1
            goto Lf8
        Lf3:
            java.lang.String r1 = r0.getString(r4)
            goto Lf1
        Lf8:
            if (r10 == 0) goto L101
            java.lang.String r1 = r0.getString(r12)
        Lfe:
            r16 = r1
            goto L106
        L101:
            java.lang.String r1 = r0.getString(r4)
            goto Lfe
        L106:
            if (r6 == 0) goto L110
            java.lang.String r1 = r0.getString(r12)
        L10c:
            r17 = r1
            r12 = r2
            goto L115
        L110:
            java.lang.String r1 = r0.getString(r4)
            goto L10c
        L115:
            java.lang.Object[] r1 = new java.lang.Object[]{r11, r12, r13, r14, r15, r16, r17}
            r2 = 2131951912(0x7f130128, float:1.9540252E38)
            java.lang.String r0 = r0.getString(r2, r1)
            r7.setSummary(r0)
            return
        L124:
            java.lang.String r0 = "dualScreenPresetsPreference"
            defpackage.nb3.a0(r0)
            r0 = 0
            throw r0
    }

    public final void F(me.magnum.melonds.domain.model.VideoRenderer r8, androidx.preference.ListPreference r9, me.magnum.melonds.ui.settings.preferences.StoragePickerPreference r10, androidx.preference.ListPreference r11, androidx.preference.EditTextPreference r12, androidx.preference.SwitchPreference r13, java.lang.String[] r14, java.lang.String[] r15) {
            r7 = this;
            me.magnum.melonds.domain.model.VideoRenderer r0 = me.magnum.melonds.domain.model.VideoRenderer.SOFTWARE
            r1 = 1
            r2 = 0
            if (r8 != r0) goto L8
            r0 = r1
            goto L9
        L8:
            r0 = r2
        L9:
            java.util.ArrayList r14 = defpackage.fv.X0(r14, r15)
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            int r3 = r14.size()
            r4 = r2
        L17:
            if (r4 >= r3) goto L34
            java.lang.Object r5 = r14.get(r4)
            int r4 = r4 + 1
            r6 = r5
            vr4 r6 = (defpackage.vr4) r6
            java.lang.Object r6 = r6.A
            java.lang.String r6 = (java.lang.String) r6
            me.magnum.melonds.domain.model.VideoFiltering r6 = L(r6)
            boolean r6 = r6.isSupportedByRenderer(r8)
            if (r6 == 0) goto L17
            r15.add(r5)
            goto L17
        L34:
            java.util.ArrayList r14 = new java.util.ArrayList
            r3 = 10
            int r4 = defpackage.ht0.v0(r15, r3)
            r14.<init>(r4)
            int r4 = r15.size()
            r5 = r2
        L44:
            if (r5 >= r4) goto L56
            java.lang.Object r6 = r15.get(r5)
            int r5 = r5 + 1
            vr4 r6 = (defpackage.vr4) r6
            java.lang.Object r6 = r6.A
            java.lang.String r6 = (java.lang.String) r6
            r14.add(r6)
            goto L44
        L56:
            java.lang.String[] r4 = new java.lang.String[r2]
            java.lang.Object[] r14 = r14.toArray(r4)
            java.lang.CharSequence[] r14 = (java.lang.CharSequence[]) r14
            r9.d0 = r14
            java.util.ArrayList r14 = new java.util.ArrayList
            int r3 = defpackage.ht0.v0(r15, r3)
            r14.<init>(r3)
            int r3 = r15.size()
            r4 = r2
        L6e:
            if (r4 >= r3) goto L80
            java.lang.Object r5 = r15.get(r4)
            int r4 = r4 + 1
            vr4 r5 = (defpackage.vr4) r5
            java.lang.Object r5 = r5.B
            java.lang.String r5 = (java.lang.String) r5
            r14.add(r5)
            goto L6e
        L80:
            java.lang.String[] r15 = new java.lang.String[r2]
            java.lang.Object[] r14 = r14.toArray(r15)
            java.lang.CharSequence[] r14 = (java.lang.CharSequence[]) r14
            r9.g(r14)
            java.lang.String r14 = "NONE"
            java.lang.String r15 = "%s"
            if (r0 == 0) goto La6
            r9.setEnabled(r2)
            java.lang.String r8 = "Шейдерная фильтрация и AI-Upscale недоступны при программном (Software) рендеринге. Переключите рендерер на OpenGL или Vulkan."
            r9.setSummary(r8)
            java.util.Locale r8 = java.util.Locale.ROOT
            java.lang.String r8 = r14.toLowerCase(r8)
            r8.getClass()
            r9.h(r8)
            goto Lc4
        La6:
            r9.setEnabled(r1)
            java.lang.String r3 = r9.e0
            me.magnum.melonds.domain.model.VideoFiltering r3 = L(r3)
            boolean r8 = r3.isSupportedByRenderer(r8)
            if (r8 != 0) goto Lc1
            java.util.Locale r8 = java.util.Locale.ROOT
            java.lang.String r8 = r14.toLowerCase(r8)
            r8.getClass()
            r9.h(r8)
        Lc1:
            r9.setSummary(r15)
        Lc4:
            java.lang.String r8 = "video_hd_textures_enabled"
            androidx.preference.Preference r8 = r7.findPreference(r8)
            androidx.preference.TwoStatePreference r8 = (androidx.preference.TwoStatePreference) r8
            if (r8 == 0) goto Le9
            if (r0 == 0) goto Ldc
            r8.e(r2)
            r8.setEnabled(r2)
            java.lang.String r14 = "Загрузка HD-текстур доступна только при аппаратном рендеринге (OpenGL / Vulkan)."
            r8.setSummary(r14)
            goto Le9
        Ldc:
            r8.setEnabled(r1)
            r14 = 2131952810(0x7f1304aa, float:1.9542073E38)
            java.lang.String r14 = r7.getString(r14)
            r8.setSummary(r14)
        Le9:
            java.lang.String r8 = "video_internal_resolution"
            androidx.preference.Preference r8 = r7.findPreference(r8)
            androidx.preference.ListPreference r8 = (androidx.preference.ListPreference) r8
            if (r8 == 0) goto L104
            if (r0 == 0) goto Lfe
            r8.setEnabled(r2)
            java.lang.String r14 = "Масштабирование разрешения 3D доступно только в OpenGL / Vulkan."
            r8.setSummary(r14)
            goto L104
        Lfe:
            r8.setEnabled(r1)
            r8.setSummary(r15)
        L104:
            java.lang.String r8 = "video_ai_upscale_enabled"
            androidx.preference.Preference r8 = r7.findPreference(r8)
            androidx.preference.TwoStatePreference r8 = (androidx.preference.TwoStatePreference) r8
            if (r8 == 0) goto L129
            if (r0 == 0) goto L11c
            r8.e(r2)
            r8.setEnabled(r2)
            java.lang.String r14 = "AI-Upscale 2D-спрайтов (Anime4K) недоступен при программном (Software) рендеринге. Переключите рендерер на OpenGL или Vulkan."
            r8.setSummary(r14)
            goto L129
        L11c:
            r8.setEnabled(r1)
            r14 = 2131952800(0x7f1304a0, float:1.9542053E38)
            java.lang.String r14 = r7.getString(r14)
            r8.setSummary(r14)
        L129:
            java.lang.String r8 = "video_ai_upscale_scale"
            androidx.preference.Preference r8 = r7.findPreference(r8)
            if (r8 == 0) goto L141
            r14 = r0 ^ 1
            r8.setEnabled(r14)
            if (r0 == 0) goto L13e
            java.lang.String r14 = "AI-Upscale 2D недоступен в Software режиме."
            r8.setSummary(r14)
            goto L141
        L13e:
            r8.setSummary(r15)
        L141:
            java.lang.String r1 = r9.e0
            r1.getClass()
            r0 = r7
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r0.I(r1, r2, r3, r4, r5)
            return
    }

    public final void H() {
            r7 = this;
            androidx.preference.Preference r0 = r7.p0
            if (r0 != 0) goto L5
            return
        L5:
            cp5 r0 = r7.p()
            zo5 r0 = r0.h()
            r1 = 0
            java.lang.String r2 = "shaderManagePreference"
            if (r0 == 0) goto L64
            cp5 r3 = r7.p()
            java.io.File r3 = r3.d()
            if (r3 == 0) goto L64
            android.content.Context r3 = r7.requireContext()
            java.text.DateFormat r3 = android.text.format.DateFormat.getDateFormat(r3)
            java.util.Date r4 = new java.util.Date
            long r5 = r0.d
            r4.<init>(r5)
            java.lang.String r0 = r3.format(r4)
            android.content.Context r3 = r7.requireContext()
            cp5 r4 = r7.p()
            long r4 = r4.f()
            java.lang.String r3 = android.text.format.Formatter.formatShortFileSize(r3, r4)
            androidx.preference.Preference r4 = r7.p0
            if (r4 == 0) goto L60
            r5 = 2131952842(0x7f1304ca, float:1.9542138E38)
            r4.setTitle(r5)
            androidx.preference.Preference r4 = r7.p0
            if (r4 == 0) goto L5c
            r1 = 2131952841(0x7f1304c9, float:1.9542136E38)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r3}
            java.lang.String r7 = r7.getString(r1, r0)
            r4.setSummary(r7)
            return
        L5c:
            defpackage.nb3.a0(r2)
            throw r1
        L60:
            defpackage.nb3.a0(r2)
            throw r1
        L64:
            androidx.preference.Preference r0 = r7.p0
            if (r0 == 0) goto L7d
            r3 = 2131952840(0x7f1304c8, float:1.9542134E38)
            r0.setTitle(r3)
            androidx.preference.Preference r7 = r7.p0
            if (r7 == 0) goto L79
            r0 = 2131952839(0x7f1304c7, float:1.9542132E38)
            r7.setSummary(r0)
            return
        L79:
            defpackage.nb3.a0(r2)
            throw r1
        L7d:
            defpackage.nb3.a0(r2)
            throw r1
    }

    public final void I(java.lang.String r10, me.magnum.melonds.ui.settings.preferences.StoragePickerPreference r11, androidx.preference.ListPreference r12, androidx.preference.EditTextPreference r13, androidx.preference.SwitchPreference r14) {
            r9 = this;
            me.magnum.melonds.domain.model.VideoFiltering r10 = L(r10)
            me.magnum.melonds.domain.model.VideoFiltering r0 = me.magnum.melonds.domain.model.VideoFiltering.RETROARCH
            r1 = 0
            r2 = 1
            if (r10 != r0) goto Lc
            r10 = r2
            goto Ld
        Lc:
            r10 = r1
        Ld:
            me.magnum.melonds.domain.model.RetroArchShaderSource r0 = r9.t()
            me.magnum.melonds.domain.model.RetroArchShaderSource r3 = me.magnum.melonds.domain.model.RetroArchShaderSource.FOLDER
            if (r0 != r3) goto L17
            r3 = r2
            goto L18
        L17:
            r3 = r1
        L18:
            me.magnum.melonds.domain.model.RetroArchShaderSource r4 = me.magnum.melonds.domain.model.RetroArchShaderSource.INTERNAL
            if (r0 != r4) goto L1e
            r4 = r2
            goto L1f
        L1e:
            r4 = r1
        L1f:
            if (r3 != 0) goto L30
            if (r4 == 0) goto L2e
            cp5 r5 = r9.p()
            java.io.File r5 = r5.d()
            if (r5 == 0) goto L2e
            goto L30
        L2e:
            r5 = r1
            goto L31
        L30:
            r5 = r2
        L31:
            androidx.preference.Preference r6 = r9.o0
            if (r6 == 0) goto L76
            r6.setVisible(r10)
            androidx.preference.Preference r6 = r9.o0
            if (r6 == 0) goto L6f
            r7 = -1
            if (r0 != 0) goto L41
            r0 = r7
            goto L49
        L41:
            int[] r8 = me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment.WhenMappings.a
            int r0 = r0.ordinal()
            r0 = r8[r0]
        L49:
            if (r0 == r7) goto L64
            if (r0 == r2) goto L5c
            r7 = 2
            if (r0 != r7) goto L58
            r0 = 2131952858(0x7f1304da, float:1.954217E38)
            java.lang.String r0 = r9.getString(r0)
            goto L6b
        L58:
            defpackage.i.d()
            return
        L5c:
            r0 = 2131952860(0x7f1304dc, float:1.9542175E38)
            java.lang.String r0 = r9.getString(r0)
            goto L6b
        L64:
            r0 = 2131952302(0x7f1302ae, float:1.9541043E38)
            java.lang.String r0 = r9.getString(r0)
        L6b:
            r6.setSummary(r0)
            goto L76
        L6f:
            java.lang.String r9 = "shaderSourcePreference"
            defpackage.nb3.a0(r9)
            r9 = 0
            throw r9
        L76:
            androidx.preference.Preference r0 = r9.p0
            if (r0 == 0) goto L87
            if (r10 == 0) goto L80
            if (r4 == 0) goto L80
            r4 = r2
            goto L81
        L80:
            r4 = r1
        L81:
            r0.setVisible(r4)
            r9.H()
        L87:
            androidx.preference.Preference r0 = r9.q0
            if (r0 == 0) goto L8e
            r0.setVisible(r10)
        L8e:
            if (r10 == 0) goto L94
            if (r3 == 0) goto L94
            r0 = r2
            goto L95
        L94:
            r0 = r1
        L95:
            r11.setVisible(r0)
            if (r10 == 0) goto L9e
            if (r5 == 0) goto L9e
            r11 = r2
            goto L9f
        L9e:
            r11 = r1
        L9f:
            r12.setVisible(r11)
            if (r13 == 0) goto Lae
            if (r10 == 0) goto Laa
            if (r5 == 0) goto Laa
            r11 = r2
            goto Lab
        Laa:
            r11 = r1
        Lab:
            r13.setVisible(r11)
        Lae:
            if (r14 == 0) goto Lb8
            if (r10 == 0) goto Lb5
            if (r5 == 0) goto Lb5
            r1 = r2
        Lb5:
            r14.setVisible(r1)
        Lb8:
            androidx.preference.Preference r9 = r9.t0
            if (r9 == 0) goto Lbf
            r9.setVisible(r10)
        Lbf:
            return
    }

    public final void J(me.magnum.melonds.domain.model.VideoRenderer r5, androidx.preference.PreferenceCategory r6, androidx.preference.Preference r7, androidx.preference.ListPreference r8, androidx.preference.Preference r9, boolean r10) {
            r4 = this;
            me.magnum.melonds.domain.model.VideoRenderer r0 = me.magnum.melonds.domain.model.VideoRenderer.VULKAN
            r1 = 0
            r2 = 0
            r3 = 1
            if (r5 != r0) goto L1f
            u63 r5 = r4.v0
            if (r5 == 0) goto L19
            java.lang.Object r5 = r5.B
            android.content.Context r5 = (android.content.Context) r5
            boolean r5 = defpackage.q60.N(r5)
            if (r5 == 0) goto L1f
            if (r10 != 0) goto L1f
            r5 = r3
            goto L20
        L19:
            java.lang.String r4 = "adrenoVulkanDriverManager"
            defpackage.nb3.a0(r4)
            throw r2
        L1f:
            r5 = r1
        L20:
            r6.setVisible(r5)
            if (r5 != 0) goto L26
            return
        L26:
            r6.setSummary(r2)
            na r5 = defpackage.q60.H()
            jm4 r6 = new jm4
            r6.<init>()
            hm4 r5 = r6.b(r5)
            kd6 r6 = r4.o()
            ng6 r6 = (defpackage.ng6) r6
            zq7 r6 = r6.w()
            if (r6 == 0) goto L44
            java.lang.String r2 = r6.b
        L44:
            kd6 r6 = r4.o()
            ng6 r6 = (defpackage.ng6) r6
            sr7 r6 = r6.A()
            sr7 r10 = defpackage.sr7.CUSTOM
            if (r6 != r10) goto L5f
            if (r2 == 0) goto L5f
            if (r5 == 0) goto L5f
            java.lang.String r6 = r5.c
            boolean r6 = defpackage.qs6.j0(r2, r6, r3)
            if (r6 == 0) goto L5f
            r1 = r3
        L5f:
            if (r5 == 0) goto L71
            if (r1 != 0) goto L71
            if (r7 == 0) goto L7d
            java.lang.String r5 = r5.b
            java.lang.String r6 = "⭐ Доступен рекомендуемый: "
            java.lang.String r5 = r6.concat(r5)
            r7.setSummary(r5)
            goto L7d
        L71:
            if (r7 == 0) goto L7d
            r5 = 2131952881(0x7f1304f1, float:1.9542217E38)
            java.lang.String r5 = r4.getString(r5)
            r7.setSummary(r5)
        L7d:
            r4.K(r8, r9)
            return
    }

    public final void K(androidx.preference.ListPreference r12, androidx.preference.Preference r13) {
            r11 = this;
            kd6 r0 = r11.o()
            ng6 r0 = (defpackage.ng6) r0
            java.util.List r0 = r0.n()
            kd6 r1 = r11.o()
            ng6 r1 = (defpackage.ng6) r1
            java.lang.String r1 = r1.x()
            kd6 r2 = r11.o()
            ng6 r2 = (defpackage.ng6) r2
            sr7 r2 = r2.A()
            sr7 r3 = defpackage.sr7.CUSTOM
            r4 = 1
            r5 = 0
            if (r2 != r3) goto L47
            if (r1 == 0) goto L47
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L2d
            goto L47
        L2d:
            java.util.Iterator r2 = r0.iterator()
        L31:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L47
            java.lang.Object r3 = r2.next()
            zq7 r3 = (defpackage.zq7) r3
            java.lang.String r3 = r3.a
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L31
            r2 = r4
            goto L48
        L47:
            r2 = r5
        L48:
            java.lang.String r3 = "system"
            java.lang.String[] r6 = new java.lang.String[]{r3}
            java.util.ArrayList r7 = new java.util.ArrayList
            r8 = 10
            int r9 = defpackage.ht0.v0(r0, r8)
            r7.<init>(r9)
            java.util.Iterator r9 = r0.iterator()
        L5d:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L6f
            java.lang.Object r10 = r9.next()
            zq7 r10 = (defpackage.zq7) r10
            java.lang.String r10 = r10.a
            r7.add(r10)
            goto L5d
        L6f:
            java.lang.String[] r9 = new java.lang.String[r5]
            java.lang.Object[] r7 = r7.toArray(r9)
            java.lang.Object[] r6 = defpackage.fv.N0(r6, r7)
            java.lang.CharSequence[] r6 = (java.lang.CharSequence[]) r6
            r12.d0 = r6
            r6 = 2131952885(0x7f1304f5, float:1.9542225E38)
            java.lang.String r6 = r11.getString(r6)
            java.lang.String[] r6 = new java.lang.String[]{r6}
            java.util.ArrayList r7 = new java.util.ArrayList
            int r8 = defpackage.ht0.v0(r0, r8)
            r7.<init>(r8)
            java.util.Iterator r8 = r0.iterator()
        L95:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto La7
            java.lang.Object r9 = r8.next()
            zq7 r9 = (defpackage.zq7) r9
            java.lang.String r9 = r9.b
            r7.add(r9)
            goto L95
        La7:
            java.lang.String[] r5 = new java.lang.String[r5]
            java.lang.Object[] r5 = r7.toArray(r5)
            java.lang.Object[] r5 = defpackage.fv.N0(r6, r5)
            java.lang.CharSequence[] r5 = (java.lang.CharSequence[]) r5
            r12.g(r5)
            if (r2 == 0) goto Lb9
            r3 = r1
        Lb9:
            r12.h(r3)
            if (r2 == 0) goto Lea
            java.util.Iterator r2 = r0.iterator()
        Lc2:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto Le4
            java.lang.Object r3 = r2.next()
            zq7 r3 = (defpackage.zq7) r3
            java.lang.String r5 = r3.a
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto Lc2
            java.lang.String r1 = r3.b
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            r2 = 2131952871(0x7f1304e7, float:1.9542197E38)
            java.lang.String r11 = r11.getString(r2, r1)
            goto Lf1
        Le4:
            java.lang.String r11 = "Collection contains no element matching the predicate."
            defpackage.fa6.e(r11)
            return
        Lea:
            r1 = 2131952872(0x7f1304e8, float:1.95422E38)
            java.lang.String r11 = r11.getString(r1)
        Lf1:
            r12.setSummary(r11)
            boolean r11 = r0.isEmpty()
            r11 = r11 ^ r4
            r13.setVisible(r11)
            return
    }

    @Override // defpackage.q15
    public final java.lang.String getTitle() {
            r2 = this;
            android.os.Bundle r0 = r2.getArguments()
            if (r0 == 0) goto Ld
            java.lang.String r1 = "androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT"
            java.lang.String r0 = r0.getString(r1)
            goto Le
        Ld:
            r0 = 0
        Le:
            java.lang.String r1 = "video_retroarch_shader_settings"
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 == 0) goto L21
            r0 = 2131952857(0x7f1304d9, float:1.9542169E38)
            java.lang.String r2 = r2.getString(r0)
            r2.getClass()
            return r2
        L21:
            r0 = 2131951766(0x7f130096, float:1.9539956E38)
            java.lang.String r2 = r2.getString(r0)
            r2.getClass()
            return r2
    }

    public final java.lang.String m(defpackage.p66 r2) {
            r1 = this;
            int[] r0 = me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment.WhenMappings.e
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            if (r2 == r0) goto L2c
            r0 = 2
            if (r2 == r0) goto L21
            r0 = 3
            if (r2 != r0) goto L1c
            r2 = 2131951918(0x7f13012e, float:1.9540264E38)
            java.lang.String r1 = r1.getString(r2)
            r1.getClass()
            return r1
        L1c:
            defpackage.i.d()
            r1 = 0
            return r1
        L21:
            r2 = 2131951919(0x7f13012f, float:1.9540266E38)
            java.lang.String r1 = r1.getString(r2)
            r1.getClass()
            return r1
        L2c:
            r2 = 2131951920(0x7f130130, float:1.9540268E38)
            java.lang.String r1 = r1.getString(r2)
            r1.getClass()
            return r1
    }

    public final defpackage.p15 n() {
            r0 = this;
            ex6 r0 = r0.Z
            java.lang.Object r0 = r0.getValue()
            p15 r0 = (defpackage.p15) r0
            return r0
    }

    public final defpackage.kd6 o() {
            r0 = this;
            kd6 r0 = r0.f0
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.String r0 = "settingsRepository"
            defpackage.nb3.a0(r0)
            r0 = 0
            throw r0
    }

    @Override // defpackage.k15
    public final void onCreatePreferences(android.os.Bundle r34, java.lang.String r35) {
            r33 = this;
            r0 = r33
            r1 = r35
            r2 = 2132148248(0x7f160018, float:1.9938469E38)
            r0.setPreferencesFromResource(r2, r1)
            java.lang.String r2 = "video_retroarch_shader_settings"
            boolean r1 = defpackage.nb3.k(r1, r2)
            r3 = 2
            r4 = 3
            r5 = 0
            java.lang.String r6 = "video_retroarch_shader_root"
            r7 = 1
            r8 = 0
            if (r1 == 0) goto L8d
            java.lang.String r1 = "video_retroarch_shader_manage"
            androidx.preference.Preference r1 = r0.findPreference(r1)
            if (r1 == 0) goto L2b
            r0.p0 = r1
            om7 r2 = new om7
            r2.<init>(r0, r7)
            r1.setOnPreferenceClickListener(r2)
        L2b:
            java.lang.String r1 = "video_retroarch_shader_report"
            androidx.preference.Preference r1 = r0.findPreference(r1)
            if (r1 == 0) goto L3d
            r0.q0 = r1
            om7 r2 = new om7
            r2.<init>(r0, r3)
            r1.setOnPreferenceClickListener(r2)
        L3d:
            androidx.preference.Preference r1 = r0.findPreference(r6)
            me.magnum.melonds.ui.settings.preferences.StoragePickerPreference r1 = (me.magnum.melonds.ui.settings.preferences.StoragePickerPreference) r1
            if (r1 == 0) goto L56
            r0.r0 = r1
            p15 r2 = r0.n()
            r2.c(r1, r5)
            wm7 r2 = new wm7
            r2.<init>(r0, r7)
            defpackage.yh2.g(r1, r2)
        L56:
            me.magnum.melonds.domain.model.RetroArchShaderSource r2 = r0.t()
            androidx.preference.Preference r3 = r0.p0
            if (r3 == 0) goto L68
            me.magnum.melonds.domain.model.RetroArchShaderSource r6 = me.magnum.melonds.domain.model.RetroArchShaderSource.INTERNAL
            if (r2 != r6) goto L64
            r6 = r7
            goto L65
        L64:
            r6 = r8
        L65:
            r3.setVisible(r6)
        L68:
            if (r1 == 0) goto L73
            me.magnum.melonds.domain.model.RetroArchShaderSource r3 = me.magnum.melonds.domain.model.RetroArchShaderSource.FOLDER
            if (r2 != r3) goto L6f
            goto L70
        L6f:
            r7 = r8
        L70:
            r1.setVisible(r7)
        L73:
            r0.H()
            ap6 r1 = r0.x0
            if (r1 == 0) goto L7d
            r1.h(r5)
        L7d:
            au3 r1 = defpackage.bl2.C(r0)
            me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$observeShaderInstallWork$1 r2 = new me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$observeShaderInstallWork$1
            r2.<init>(r0, r5)
            ap6 r1 = defpackage.hv.L(r1, r5, r5, r2, r4)
            r0.x0 = r1
            return
        L8d:
            u63 r1 = new u63
            android.content.Context r9 = r0.requireContext()
            r9.getClass()
            kd6 r10 = r0.o()
            r1.<init>(r9, r10)
            r0.v0 = r1
            androidx.fragment.app.p r1 = r0.requireActivity()
            android.content.Intent r1 = r1.getIntent()
            java.lang.String r9 = "in_game"
            boolean r14 = r1.getBooleanExtra(r9, r8)
            java.lang.String r1 = "video_renderer"
            androidx.preference.Preference r1 = r0.findPreference(r1)
            r1.getClass()
            me.magnum.melonds.ui.settings.preferences.InGameLockedListPreference r1 = (me.magnum.melonds.ui.settings.preferences.InGameLockedListPreference) r1
            java.lang.String r9 = "video_internal_resolution"
            androidx.preference.Preference r9 = r0.findPreference(r9)
            r9.getClass()
            me.magnum.melonds.ui.settings.preferences.InGameLockedListPreference r9 = (me.magnum.melonds.ui.settings.preferences.InGameLockedListPreference) r9
            me.magnum.melonds.ui.settings.preferences.InGameLockedListPreference[] r10 = new me.magnum.melonds.ui.settings.preferences.InGameLockedListPreference[]{r1, r9}
            java.util.List r10 = defpackage.hf.c0(r10)
            java.util.Iterator r10 = r10.iterator()
        Lcf:
            boolean r11 = r10.hasNext()
            r12 = 2131952870(0x7f1304e6, float:1.9542195E38)
            if (r11 == 0) goto Le3
            java.lang.Object r11 = r10.next()
            me.magnum.melonds.ui.settings.preferences.InGameLockedListPreference r11 = (me.magnum.melonds.ui.settings.preferences.InGameLockedListPreference) r11
            r11.h0 = r14
            r11.i0 = r12
            goto Lcf
        Le3:
            java.lang.String r10 = "video_vulkan_fastpath_enabled"
            androidx.preference.Preference r10 = r0.findPreference(r10)
            r10.getClass()
            r15 = r10
            me.magnum.melonds.ui.settings.preferences.InGameLockedSwitchPreference r15 = (me.magnum.melonds.ui.settings.preferences.InGameLockedSwitchPreference) r15
            r15.e0 = r14
            r15.f0 = r12
            wm7 r10 = new wm7
            r10.<init>(r0, r8)
            r15.setOnPreferenceChangeListener(r10)
            java.lang.String r10 = "enable_threaded_rendering"
            androidx.preference.Preference r10 = r0.findPreference(r10)
            r10.getClass()
            java.util.ArrayList r11 = r0.i0
            r11.add(r10)
            java.util.ArrayList r10 = r0.j0
            r10.add(r9)
            java.lang.String r9 = "video_hacks_category"
            androidx.preference.Preference r11 = r0.findPreference(r9)
            r11.getClass()
            r10.add(r11)
            java.lang.String r11 = "video_debug_3d_clear_magenta"
            androidx.preference.Preference r11 = r0.findPreference(r11)
            r11.getClass()
            r10.add(r11)
            androidx.preference.Preference r9 = r0.findPreference(r9)
            r9.getClass()
            java.util.ArrayList r10 = r0.l0
            r10.add(r9)
            java.lang.String r9 = "video_renderer_debug_tools_enabled"
            androidx.preference.Preference r11 = r0.findPreference(r9)
            r11.getClass()
            r10.add(r11)
            java.lang.String r11 = "video_renderer_debug_bgobj_enabled"
            androidx.preference.Preference r11 = r0.findPreference(r11)
            r11.getClass()
            r10.add(r11)
            java.lang.String r11 = "video_renderer_debug_latch_trace_enabled"
            androidx.preference.Preference r11 = r0.findPreference(r11)
            r11.getClass()
            r10.add(r11)
            java.util.ArrayList r10 = r0.k0
            r10.add(r15)
            java.lang.String r10 = "video_conservative_coverage_enabled"
            androidx.preference.Preference r11 = r0.findPreference(r10)
            r11.getClass()
            java.util.ArrayList r12 = r0.m0
            r12.add(r11)
            java.lang.String r11 = "video_conservative_coverage_px"
            androidx.preference.Preference r11 = r0.findPreference(r11)
            r11.getClass()
            r12.add(r11)
            java.lang.String r11 = "video_conservative_coverage_apply_repeat"
            androidx.preference.Preference r11 = r0.findPreference(r11)
            r11.getClass()
            r12.add(r11)
            java.lang.String r11 = "video_conservative_coverage_apply_clamp"
            androidx.preference.Preference r11 = r0.findPreference(r11)
            r11.getClass()
            r12.add(r11)
            java.lang.String r11 = "video_conservative_coverage_depth_bias"
            androidx.preference.Preference r11 = r0.findPreference(r11)
            r11.getClass()
            r12.add(r11)
            androidx.preference.Preference r9 = r0.findPreference(r9)
            androidx.preference.SwitchPreference r9 = (androidx.preference.SwitchPreference) r9
            if (r9 == 0) goto L1a9
            wm7 r11 = new wm7
            r11.<init>(r0, r3)
            r9.setOnPreferenceChangeListener(r11)
        L1a9:
            androidx.preference.Preference r3 = r0.findPreference(r10)
            androidx.preference.SwitchPreference r3 = (androidx.preference.SwitchPreference) r3
            if (r3 == 0) goto L1b9
            wm7 r9 = new wm7
            r9.<init>(r0, r4)
            r3.setOnPreferenceChangeListener(r9)
        L1b9:
            java.lang.String r3 = "video_filtering"
            androidx.preference.Preference r3 = r0.findPreference(r3)
            r3.getClass()
            me.magnum.melonds.ui.settings.preferences.InGameLockedListPreference r3 = (me.magnum.melonds.ui.settings.preferences.InGameLockedListPreference) r3
            if (r14 == 0) goto L1d8
            androidx.fragment.app.p r9 = r0.requireActivity()
            android.content.Intent r9 = r9.getIntent()
            java.lang.String r10 = "lock_video_filtering"
            boolean r9 = r9.getBooleanExtra(r10, r8)
            if (r9 == 0) goto L1d8
            r9 = r7
            goto L1d9
        L1d8:
            r9 = r8
        L1d9:
            r3.h0 = r9
            r9 = 2131951751(0x7f130087, float:1.9539925E38)
            r3.i0 = r9
            java.lang.String r9 = "dsi_camera_source"
            androidx.preference.Preference r9 = r0.findPreference(r9)
            r9.getClass()
            androidx.preference.ListPreference r9 = (androidx.preference.ListPreference) r9
            java.lang.String r10 = "dsi_camera_static_image"
            androidx.preference.Preference r10 = r0.findPreference(r10)
            r10.getClass()
            me.magnum.melonds.ui.settings.preferences.StoragePickerPreference r10 = (me.magnum.melonds.ui.settings.preferences.StoragePickerPreference) r10
            androidx.preference.Preference r6 = r0.findPreference(r6)
            r6.getClass()
            me.magnum.melonds.ui.settings.preferences.StoragePickerPreference r6 = (me.magnum.melonds.ui.settings.preferences.StoragePickerPreference) r6
            java.lang.String r11 = "video_retroarch_shader_preset"
            androidx.preference.Preference r11 = r0.findPreference(r11)
            r11.getClass()
            androidx.preference.ListPreference r11 = (androidx.preference.ListPreference) r11
            java.lang.String r12 = "video_retroarch_shader_parameters"
            androidx.preference.Preference r12 = r0.findPreference(r12)
            androidx.preference.EditTextPreference r12 = (androidx.preference.EditTextPreference) r12
            java.lang.String r13 = "video_retroarch_shader_clear_history"
            androidx.preference.Preference r13 = r0.findPreference(r13)
            androidx.preference.SwitchPreference r13 = (androidx.preference.SwitchPreference) r13
            java.lang.String r4 = "video_vulkan_driver_category"
            androidx.preference.Preference r4 = r0.findPreference(r4)
            r4.getClass()
            androidx.preference.PreferenceCategory r4 = (androidx.preference.PreferenceCategory) r4
            java.lang.String r5 = "video_vulkan_driver_manager"
            androidx.preference.Preference r5 = r0.findPreference(r5)
            java.lang.String r8 = "video_vulkan_driver_mode"
            androidx.preference.Preference r8 = r0.findPreference(r8)
            r8.getClass()
            androidx.preference.ListPreference r8 = (androidx.preference.ListPreference) r8
            java.lang.String r7 = "video_vulkan_driver_import"
            androidx.preference.Preference r7 = r0.findPreference(r7)
            r7.getClass()
            r16 = r2
            java.lang.String r2 = "video_vulkan_driver_remove"
            androidx.preference.Preference r2 = r0.findPreference(r2)
            r2.getClass()
            r17 = r2
            java.lang.String r2 = "dual_screen_presets"
            androidx.preference.Preference r2 = r0.findPreference(r2)
            r2.getClass()
            r0.n0 = r2
            android.content.res.Resources r2 = r0.getResources()
            r0 = 2130903116(0x7f03004c, float:1.741304E38)
            java.lang.String[] r0 = r2.getStringArray(r0)
            r0.getClass()
            android.content.res.Resources r2 = r33.getResources()
            r18 = r0
            r0 = 2130903115(0x7f03004b, float:1.7413039E38)
            java.lang.String[] r0 = r2.getStringArray(r0)
            r0.getClass()
            android.content.Context r2 = r33.requireContext()
            r2.getClass()
            r19 = r0
            java.lang.Class<android.app.ActivityManager> r0 = android.app.ActivityManager.class
            java.lang.Object r0 = r2.getSystemService(r0)
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0
            if (r0 == 0) goto L291
            android.content.pm.ConfigurationInfo r0 = r0.getDeviceConfigurationInfo()
            if (r0 == 0) goto L291
            int r0 = r0.reqGlEsVersion
            goto L292
        L291:
            r0 = 0
        L292:
            r2 = 196610(0x30002, float:2.75509E-40)
            if (r0 < r2) goto L299
            r0 = 1
            goto L29a
        L299:
            r0 = 0
        L29a:
            if (r0 == 0) goto L2ad
            java.lang.String r2 = android.os.Build.HARDWARE
            r20 = r0
            java.lang.String r0 = "qcom"
            r21 = r3
            r3 = 1
            boolean r0 = defpackage.xs6.Z(r2, r0, r3)
            if (r0 == 0) goto L2b1
            r3 = 1
            goto L2b2
        L2ad:
            r20 = r0
            r21 = r3
        L2b1:
            r3 = 0
        L2b2:
            if (r20 == 0) goto L2c1
            if (r3 != 0) goto L2b7
            goto L2c1
        L2b7:
            r23 = r4
            r24 = r5
            r25 = r6
            r2 = 0
            r4 = 1
            goto L3b2
        L2c1:
            android.content.Context r0 = r1.getContext()
            android.content.res.Resources r0 = r0.getResources()
            r2 = 2130903120(0x7f030050, float:1.741305E38)
            java.lang.String[] r0 = r0.getStringArray(r2)
            r0.getClass()
            android.content.Context r2 = r1.getContext()
            android.content.res.Resources r2 = r2.getResources()
            r22 = r3
            r3 = 2130903119(0x7f03004f, float:1.7413047E38)
            java.lang.String[] r2 = r2.getStringArray(r3)
            r2.getClass()
            java.util.ArrayList r0 = defpackage.fv.X0(r0, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            int r3 = r0.size()
            r23 = r4
            r24 = r5
            r4 = 0
        L2f9:
            java.lang.String r5 = "compute"
            r25 = r6
            java.lang.String r6 = "opengl"
            if (r4 >= r3) goto L32d
            r26 = r3
            java.lang.Object r3 = r0.get(r4)
            int r4 = r4 + 1
            r27 = r0
            r0 = r3
            vr4 r0 = (defpackage.vr4) r0
            java.lang.Object r0 = r0.A
            java.lang.String r0 = (java.lang.String) r0
            if (r20 != 0) goto L31a
            boolean r6 = defpackage.nb3.k(r0, r6)
            if (r6 != 0) goto L322
        L31a:
            if (r22 != 0) goto L329
            boolean r0 = defpackage.nb3.k(r0, r5)
            if (r0 == 0) goto L329
        L322:
            r6 = r25
            r3 = r26
            r0 = r27
            goto L2f9
        L329:
            r2.add(r3)
            goto L322
        L32d:
            java.util.ArrayList r0 = new java.util.ArrayList
            r3 = 10
            int r4 = defpackage.ht0.v0(r2, r3)
            r0.<init>(r4)
            int r4 = r2.size()
            r3 = 0
        L33d:
            if (r3 >= r4) goto L355
            java.lang.Object r27 = r2.get(r3)
            int r3 = r3 + 1
            r28 = r3
            r3 = r27
            vr4 r3 = (defpackage.vr4) r3
            java.lang.Object r3 = r3.A
            java.lang.String r3 = (java.lang.String) r3
            r0.add(r3)
            r3 = r28
            goto L33d
        L355:
            r3 = 0
            java.lang.String[] r4 = new java.lang.String[r3]
            java.lang.Object[] r0 = r0.toArray(r4)
            java.lang.CharSequence[] r0 = (java.lang.CharSequence[]) r0
            r1.d0 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r3 = 10
            int r3 = defpackage.ht0.v0(r2, r3)
            r0.<init>(r3)
            int r3 = r2.size()
            r4 = 0
        L370:
            if (r4 >= r3) goto L388
            java.lang.Object r26 = r2.get(r4)
            int r4 = r4 + 1
            r27 = r2
            r2 = r26
            vr4 r2 = (defpackage.vr4) r2
            java.lang.Object r2 = r2.B
            java.lang.String r2 = (java.lang.String) r2
            r0.add(r2)
            r2 = r27
            goto L370
        L388:
            r2 = 0
            java.lang.String[] r3 = new java.lang.String[r2]
            java.lang.Object[] r0 = r0.toArray(r3)
            java.lang.CharSequence[] r0 = (java.lang.CharSequence[]) r0
            r1.Z = r0
            java.lang.String r0 = "software"
            if (r20 != 0) goto L3a4
            java.lang.String r3 = r1.e0
            r4 = 1
            boolean r3 = defpackage.xs6.Z(r3, r6, r4)
            if (r3 == 0) goto L3a5
            r1.h(r0)
            goto L3a5
        L3a4:
            r4 = 1
        L3a5:
            if (r22 != 0) goto L3b2
            java.lang.String r3 = r1.e0
            boolean r3 = defpackage.xs6.Z(r3, r5, r4)
            if (r3 == 0) goto L3b2
            r1.h(r0)
        L3b2:
            gn7 r0 = new gn7
            r29 = r1
            r30 = r9
            r31 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r32 = r16
            r13 = r17
            r2 = r21
            r9 = r23
            r10 = r24
            r3 = r25
            r1 = r33
            r12 = r7
            r11 = r8
            r7 = r18
            r8 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r18 = r6
            r6 = r0
            r0 = r1
            r1 = r12
            r12 = r5
            r5 = r13
            r13 = r18
            r18 = r11
            r11 = r4
            r4 = r18
            r18 = r7
            r2 = r9
            r9 = r29
            r7 = r3
            r3 = r10
            r9.setOnPreferenceChangeListener(r6)
            zw r6 = new zw
            r10 = r31
            r6.<init>(r0, r10)
            r15 = r30
            r15.setOnPreferenceChangeListener(r6)
            androidx.preference.Preference r6 = r0.n0
            if (r6 == 0) goto L540
            r23 = r2
            om7 r2 = new om7
            r19 = r8
            r8 = 5
            r2.<init>(r0, r8)
            r6.setOnPreferenceClickListener(r2)
            p15 r2 = r0.n()
            r8 = 0
            r2.c(r10, r8)
            p15 r2 = r0.n()
            r2.c(r7, r8)
            p15 r2 = r0.n()
            r2.getClass()
            defpackage.p15.a(r11)
            if (r12 == 0) goto L42e
            p15 r2 = r0.n()
            r2.getClass()
            defpackage.p15.a(r12)
        L42e:
            java.lang.String r2 = r9.e0
            r2.getClass()
            me.magnum.melonds.domain.model.VideoRenderer[] r6 = me.magnum.melonds.domain.model.VideoRenderer.values()
            java.lang.Enum r2 = defpackage.jw2.o(r2, r6)
            me.magnum.melonds.domain.model.VideoRenderer r2 = (me.magnum.melonds.domain.model.VideoRenderer) r2
            if (r3 == 0) goto L44a
            om7 r6 = new om7
            r8 = 3
            r6.<init>(r0, r8)
            r3.setOnPreferenceClickListener(r6)
        L448:
            r6 = 0
            goto L44c
        L44a:
            r8 = 3
            goto L448
        L44c:
            r4.setPersistent(r6)
            an7 r8 = new an7
            r8.<init>(r0, r4, r5, r6)
            r4.setOnPreferenceClickListener(r8)
            om7 r8 = new om7
            r6 = 4
            r8.<init>(r0, r6)
            r1.setOnPreferenceClickListener(r8)
            an7 r1 = new an7
            r8 = 1
            r1.<init>(r0, r4, r5, r8)
            r5.setOnPreferenceClickListener(r1)
            r1 = r2
            r6 = r14
            r2 = r23
            r14 = 0
            r0.J(r1, r2, r3, r4, r5, r6)
            qm7 r1 = new qm7
            r1.<init>(r0, r11)
            defpackage.yh2.g(r7, r1)
            r1 = 6
            r2 = 0
            G(r0, r11, r2, r14, r1)
            r0.r0 = r7
            r0.s0 = r11
            java.lang.String r1 = "video_retroarch_shader_source"
            androidx.preference.Preference r1 = r0.findPreference(r1)
            r1.getClass()
            r0.o0 = r1
            om7 r2 = new om7
            r2.<init>(r0, r14)
            r1.setOnPreferenceClickListener(r2)
            r1 = r32
            androidx.preference.Preference r1 = r0.findPreference(r1)
            r0.t0 = r1
            ap6 r1 = r0.x0
            r2 = 0
            if (r1 == 0) goto L4a5
            r1.h(r2)
        L4a5:
            au3 r1 = defpackage.bl2.C(r0)
            me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$observeShaderInstallWork$1 r3 = new me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$observeShaderInstallWork$1
            r3.<init>(r0, r2)
            r4 = 3
            ap6 r1 = defpackage.hv.L(r1, r2, r2, r3, r4)
            r0.x0 = r1
            java.lang.String r1 = r9.e0
            r1.getClass()
            me.magnum.melonds.domain.model.VideoRenderer[] r2 = me.magnum.melonds.domain.model.VideoRenderer.values()
            java.lang.Enum r1 = defpackage.jw2.o(r1, r2)
            me.magnum.melonds.domain.model.VideoRenderer r1 = (me.magnum.melonds.domain.model.VideoRenderer) r1
            r3 = r7
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r18
            r2 = r21
            r11 = r8
            r8 = r19
            r0.F(r1, r2, r3, r4, r5, r6, r7, r8)
            r7 = r2
            pm7 r0 = new pm7
            r1 = r33
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.setOnPreferenceChangeListener(r0)
            java.lang.String r1 = r2.e0
            r1.getClass()
            r0 = r33
            r2 = r7
            r7 = r18
            r0.q(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.String r1 = r15.e0
            r1.getClass()
            h91[] r2 = defpackage.h91.values()
            java.lang.Enum r1 = defpackage.jw2.o(r1, r2)
            h91 r1 = (defpackage.h91) r1
            h91 r2 = defpackage.h91.STATIC_IMAGE
            if (r1 != r2) goto L500
            r7 = r11
            goto L501
        L500:
            r7 = r14
        L501:
            r10.setVisible(r7)
            r0.E()
            java.lang.String r1 = "fps_counter_position"
            androidx.preference.Preference r1 = r0.findPreference(r1)
            androidx.preference.ListPreference r1 = (androidx.preference.ListPreference) r1
            java.lang.String r2 = "resolution_hud_position"
            androidx.preference.Preference r2 = r0.findPreference(r2)
            androidx.preference.ListPreference r2 = (androidx.preference.ListPreference) r2
            if (r1 == 0) goto L53f
            if (r2 == 0) goto L53f
            p15 r3 = r0.n()
            r3.getClass()
            defpackage.p15.a(r1)
            p15 r3 = r0.n()
            r3.getClass()
            defpackage.p15.a(r2)
            qm7 r3 = new qm7
            r3.<init>(r2, r0, r14)
            defpackage.yh2.g(r1, r3)
            qm7 r3 = new qm7
            r3.<init>(r1, r0, r11)
            defpackage.yh2.g(r2, r3)
        L53f:
            return
        L540:
            java.lang.String r0 = "dualScreenPresetsPreference"
            defpackage.nb3.a0(r0)
            r2 = 0
            throw r2
    }

    @Override // defpackage.k15
    public final void onDisplayPreferenceDialog(androidx.preference.Preference r3) {
            r2 = this;
            r3.getClass()
            java.lang.String r0 = r3.getKey()
            java.lang.String r1 = "video_retroarch_shader_preset"
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 == 0) goto L15
            androidx.preference.ListPreference r3 = (androidx.preference.ListPreference) r3
            r2.y(r3)
            return
        L15:
            super.onDisplayPreferenceDialog(r3)
            return
    }

    @Override // me.magnum.melonds.ui.settings.fragments.BasePreferenceFragment, androidx.fragment.app.o
    public final void onResume() {
            r6 = this;
            super.onResume()
            r6.E()
            androidx.preference.ListPreference r0 = r6.s0
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L13
            r3 = 2
            G(r6, r0, r2, r1, r3)
            r6.s()
        L13:
            java.lang.String r0 = "video_vulkan_driver_mode"
            androidx.preference.Preference r0 = r6.findPreference(r0)
            androidx.preference.ListPreference r0 = (androidx.preference.ListPreference) r0
            java.lang.String r3 = "video_vulkan_driver_remove"
            androidx.preference.Preference r3 = r6.findPreference(r3)
            java.lang.String r4 = "video_vulkan_driver_manager"
            androidx.preference.Preference r4 = r6.findPreference(r4)
            if (r0 == 0) goto L83
            if (r3 == 0) goto L83
            r6.K(r0, r3)
            na r0 = defpackage.q60.H()
            jm4 r3 = new jm4
            r3.<init>()
            hm4 r0 = r3.b(r0)
            kd6 r3 = r6.o()
            ng6 r3 = (defpackage.ng6) r3
            zq7 r3 = r3.w()
            if (r3 == 0) goto L49
            java.lang.String r2 = r3.b
        L49:
            kd6 r3 = r6.o()
            ng6 r3 = (defpackage.ng6) r3
            sr7 r3 = r3.A()
            sr7 r5 = defpackage.sr7.CUSTOM
            if (r3 != r5) goto L65
            if (r2 == 0) goto L65
            if (r0 == 0) goto L65
            java.lang.String r3 = r0.c
            r5 = 1
            boolean r2 = defpackage.qs6.j0(r2, r3, r5)
            if (r2 == 0) goto L65
            r1 = r5
        L65:
            if (r0 == 0) goto L77
            if (r1 != 0) goto L77
            if (r4 == 0) goto L83
            java.lang.String r6 = r0.b
            java.lang.String r0 = "⭐ Доступен рекомендуемый: "
            java.lang.String r6 = r0.concat(r6)
            r4.setSummary(r6)
            return
        L77:
            if (r4 == 0) goto L83
            r0 = 2131952881(0x7f1304f1, float:1.9542217E38)
            java.lang.String r6 = r6.getString(r0)
            r4.setSummary(r6)
        L83:
            return
    }

    public final defpackage.cp5 p() {
            r0 = this;
            cp5 r0 = r0.g0
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.String r0 = "shaderLibraryManager"
            defpackage.nb3.a0(r0)
            r0 = 0
            throw r0
    }

    public final void q(java.lang.String r11, androidx.preference.ListPreference r12, me.magnum.melonds.ui.settings.preferences.StoragePickerPreference r13, androidx.preference.ListPreference r14, androidx.preference.EditTextPreference r15, androidx.preference.SwitchPreference r16, java.lang.String[] r17, java.lang.String[] r18) {
            r10 = this;
            me.magnum.melonds.domain.model.VideoRenderer[] r0 = me.magnum.melonds.domain.model.VideoRenderer.values()
            java.lang.Enum r11 = defpackage.jw2.o(r11, r0)
            r1 = r11
            me.magnum.melonds.domain.model.VideoRenderer r1 = (me.magnum.melonds.domain.model.VideoRenderer) r1
            int[] r11 = me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment.WhenMappings.b
            int r0 = r1.ordinal()
            r11 = r11[r0]
            java.util.ArrayList r0 = r10.k0
            java.util.ArrayList r2 = r10.l0
            java.util.ArrayList r3 = r10.m0
            java.util.ArrayList r4 = r10.j0
            java.util.ArrayList r5 = r10.i0
            r6 = 0
            r7 = 1
            if (r11 == r7) goto L14b
            r8 = 2
            if (r11 == r8) goto Lec
            r8 = 3
            if (r11 == r8) goto L8d
            r8 = 4
            if (r11 != r8) goto L89
            int r11 = r5.size()
            r8 = r6
        L2f:
            if (r8 >= r11) goto L3d
            java.lang.Object r9 = r5.get(r8)
            int r8 = r8 + 1
            androidx.preference.Preference r9 = (androidx.preference.Preference) r9
            r9.setVisible(r6)
            goto L2f
        L3d:
            int r11 = r4.size()
            r5 = r6
        L42:
            if (r5 >= r11) goto L50
            java.lang.Object r8 = r4.get(r5)
            int r5 = r5 + 1
            androidx.preference.Preference r8 = (androidx.preference.Preference) r8
            r8.setVisible(r7)
            goto L42
        L50:
            int r11 = r3.size()
            r4 = r6
        L55:
            if (r4 >= r11) goto L63
            java.lang.Object r5 = r3.get(r4)
            int r4 = r4 + 1
            androidx.preference.Preference r5 = (androidx.preference.Preference) r5
            r5.setVisible(r6)
            goto L55
        L63:
            int r11 = r2.size()
            r3 = r6
        L68:
            if (r3 >= r11) goto L76
            java.lang.Object r4 = r2.get(r3)
            int r3 = r3 + 1
            androidx.preference.Preference r4 = (androidx.preference.Preference) r4
            r4.setVisible(r7)
            goto L68
        L76:
            int r11 = r0.size()
            r2 = r6
        L7b:
            if (r2 >= r11) goto L1aa
            java.lang.Object r3 = r0.get(r2)
            int r2 = r2 + 1
            androidx.preference.Preference r3 = (androidx.preference.Preference) r3
            r3.setVisible(r7)
            goto L7b
        L89:
            defpackage.i.d()
            return
        L8d:
            int r11 = r5.size()
            r8 = r6
        L92:
            if (r8 >= r11) goto La0
            java.lang.Object r9 = r5.get(r8)
            int r8 = r8 + 1
            androidx.preference.Preference r9 = (androidx.preference.Preference) r9
            r9.setVisible(r6)
            goto L92
        La0:
            int r11 = r4.size()
            r5 = r6
        La5:
            if (r5 >= r11) goto Lb3
            java.lang.Object r8 = r4.get(r5)
            int r5 = r5 + 1
            androidx.preference.Preference r8 = (androidx.preference.Preference) r8
            r8.setVisible(r7)
            goto La5
        Lb3:
            int r11 = r3.size()
            r4 = r6
        Lb8:
            if (r4 >= r11) goto Lc6
            java.lang.Object r5 = r3.get(r4)
            int r4 = r4 + 1
            androidx.preference.Preference r5 = (androidx.preference.Preference) r5
            r5.setVisible(r6)
            goto Lb8
        Lc6:
            int r11 = r2.size()
            r3 = r6
        Lcb:
            if (r3 >= r11) goto Ld9
            java.lang.Object r4 = r2.get(r3)
            int r3 = r3 + 1
            androidx.preference.Preference r4 = (androidx.preference.Preference) r4
            r4.setVisible(r6)
            goto Lcb
        Ld9:
            int r11 = r0.size()
            r2 = r6
        Lde:
            if (r2 >= r11) goto L1aa
            java.lang.Object r3 = r0.get(r2)
            int r2 = r2 + 1
            androidx.preference.Preference r3 = (androidx.preference.Preference) r3
            r3.setVisible(r6)
            goto Lde
        Lec:
            int r11 = r5.size()
            r8 = r6
        Lf1:
            if (r8 >= r11) goto Lff
            java.lang.Object r9 = r5.get(r8)
            int r8 = r8 + 1
            androidx.preference.Preference r9 = (androidx.preference.Preference) r9
            r9.setVisible(r6)
            goto Lf1
        Lff:
            int r11 = r4.size()
            r5 = r6
        L104:
            if (r5 >= r11) goto L112
            java.lang.Object r8 = r4.get(r5)
            int r5 = r5 + 1
            androidx.preference.Preference r8 = (androidx.preference.Preference) r8
            r8.setVisible(r7)
            goto L104
        L112:
            int r11 = r3.size()
            r4 = r6
        L117:
            if (r4 >= r11) goto L125
            java.lang.Object r5 = r3.get(r4)
            int r4 = r4 + 1
            androidx.preference.Preference r5 = (androidx.preference.Preference) r5
            r5.setVisible(r7)
            goto L117
        L125:
            int r11 = r2.size()
            r3 = r6
        L12a:
            if (r3 >= r11) goto L138
            java.lang.Object r4 = r2.get(r3)
            int r3 = r3 + 1
            androidx.preference.Preference r4 = (androidx.preference.Preference) r4
            r4.setVisible(r7)
            goto L12a
        L138:
            int r11 = r0.size()
            r2 = r6
        L13d:
            if (r2 >= r11) goto L1aa
            java.lang.Object r3 = r0.get(r2)
            int r2 = r2 + 1
            androidx.preference.Preference r3 = (androidx.preference.Preference) r3
            r3.setVisible(r6)
            goto L13d
        L14b:
            int r11 = r5.size()
            r8 = r6
        L150:
            if (r8 >= r11) goto L15e
            java.lang.Object r9 = r5.get(r8)
            int r8 = r8 + 1
            androidx.preference.Preference r9 = (androidx.preference.Preference) r9
            r9.setVisible(r7)
            goto L150
        L15e:
            int r11 = r4.size()
            r5 = r6
        L163:
            if (r5 >= r11) goto L171
            java.lang.Object r8 = r4.get(r5)
            int r5 = r5 + 1
            androidx.preference.Preference r8 = (androidx.preference.Preference) r8
            r8.setVisible(r6)
            goto L163
        L171:
            int r11 = r3.size()
            r4 = r6
        L176:
            if (r4 >= r11) goto L184
            java.lang.Object r5 = r3.get(r4)
            int r4 = r4 + 1
            androidx.preference.Preference r5 = (androidx.preference.Preference) r5
            r5.setVisible(r6)
            goto L176
        L184:
            int r11 = r2.size()
            r3 = r6
        L189:
            if (r3 >= r11) goto L197
            java.lang.Object r4 = r2.get(r3)
            int r3 = r3 + 1
            androidx.preference.Preference r4 = (androidx.preference.Preference) r4
            r4.setVisible(r7)
            goto L189
        L197:
            int r11 = r0.size()
            r2 = r6
        L19c:
            if (r2 >= r11) goto L1aa
            java.lang.Object r3 = r0.get(r2)
            int r2 = r2 + 1
            androidx.preference.Preference r3 = (androidx.preference.Preference) r3
            r3.setVisible(r6)
            goto L19c
        L1aa:
            java.lang.String r11 = "video_renderer_debug_tools_enabled"
            androidx.preference.Preference r11 = r10.findPreference(r11)
            androidx.preference.SwitchPreference r11 = (androidx.preference.SwitchPreference) r11
            if (r11 == 0) goto L1c0
            boolean r0 = r11.isVisible()
            if (r0 != r7) goto L1c0
            boolean r11 = r11.A
            if (r11 == 0) goto L1c0
            r11 = r7
            goto L1c1
        L1c0:
            r11 = r6
        L1c1:
            java.lang.String r0 = "video_renderer_debug_bgobj_enabled"
            java.lang.String r2 = "video_renderer_debug_latch_trace_enabled"
            java.lang.String[] r0 = new java.lang.String[]{r0, r2}
            java.util.List r0 = defpackage.hf.c0(r0)
            java.util.Iterator r0 = r0.iterator()
        L1d1:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L1e7
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            androidx.preference.Preference r2 = r10.findPreference(r2)
            if (r2 == 0) goto L1d1
            r2.setVisible(r11)
            goto L1d1
        L1e7:
            java.lang.String r11 = "video_conservative_coverage_enabled"
            androidx.preference.Preference r11 = r10.findPreference(r11)
            androidx.preference.SwitchPreference r11 = (androidx.preference.SwitchPreference) r11
            if (r11 == 0) goto L1fd
            boolean r0 = r11.isVisible()
            if (r0 != r7) goto L1fd
            boolean r11 = r11.A
            if (r11 == 0) goto L1fd
            r11 = r7
            goto L1fe
        L1fd:
            r11 = r6
        L1fe:
            java.lang.String r0 = "video_conservative_coverage_apply_clamp"
            java.lang.String r2 = "video_conservative_coverage_depth_bias"
            java.lang.String r3 = "video_conservative_coverage_px"
            java.lang.String r4 = "video_conservative_coverage_apply_repeat"
            java.lang.String[] r0 = new java.lang.String[]{r3, r4, r0, r2}
            java.util.List r0 = defpackage.hf.c0(r0)
            java.util.Iterator r9 = r0.iterator()
        L212:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L228
            java.lang.Object r0 = r9.next()
            java.lang.String r0 = (java.lang.String) r0
            androidx.preference.Preference r0 = r10.findPreference(r0)
            if (r0 == 0) goto L212
            r0.setVisible(r11)
            goto L212
        L228:
            r0 = r10
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            r0.F(r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public final void r(me.magnum.melonds.domain.model.RetroArchShaderSource r2) {
            r1 = this;
            v15 r1 = r1.getPreferenceManager()
            android.content.SharedPreferences r1 = r1.d()
            if (r1 == 0) goto L1f
            android.content.SharedPreferences$Editor r1 = r1.edit()
            if (r1 == 0) goto L1f
            java.lang.String r0 = "video_retroarch_shader_source"
            java.lang.String r2 = r2.getPreferenceValue()
            android.content.SharedPreferences$Editor r1 = r1.putString(r0, r2)
            if (r1 == 0) goto L1f
            r1.apply()
        L1f:
            return
    }

    public final void s() {
            r8 = this;
            androidx.preference.ListPreference r0 = r8.s0
            if (r0 != 0) goto L28
            me.magnum.melonds.domain.model.RetroArchShaderSource r0 = r8.t()
            androidx.preference.Preference r1 = r8.p0
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L1b
            me.magnum.melonds.domain.model.RetroArchShaderSource r4 = me.magnum.melonds.domain.model.RetroArchShaderSource.INTERNAL
            if (r0 != r4) goto L14
            r4 = r3
            goto L15
        L14:
            r4 = r2
        L15:
            r1.setVisible(r4)
            r8.H()
        L1b:
            me.magnum.melonds.ui.settings.preferences.StoragePickerPreference r8 = r8.r0
            if (r8 == 0) goto L27
            me.magnum.melonds.domain.model.RetroArchShaderSource r1 = me.magnum.melonds.domain.model.RetroArchShaderSource.FOLDER
            if (r0 != r1) goto L24
            r2 = r3
        L24:
            r8.setVisible(r2)
        L27:
            return
        L28:
            v15 r0 = r8.getPreferenceManager()
            android.content.SharedPreferences r0 = r0.d()
            java.lang.String r1 = "software"
            if (r0 == 0) goto L3e
            java.lang.String r2 = "video_renderer"
            java.lang.String r2 = r0.getString(r2, r1)
            if (r2 != 0) goto L3d
            goto L3e
        L3d:
            r1 = r2
        L3e:
            me.magnum.melonds.domain.model.VideoRenderer[] r2 = me.magnum.melonds.domain.model.VideoRenderer.values()
            java.lang.Enum r1 = defpackage.jw2.o(r1, r2)
            me.magnum.melonds.domain.model.VideoRenderer r1 = (me.magnum.melonds.domain.model.VideoRenderer) r1
            java.lang.String r1 = "none"
            if (r0 == 0) goto L57
            java.lang.String r2 = "video_filtering"
            java.lang.String r0 = r0.getString(r2, r1)
            if (r0 != 0) goto L55
            goto L57
        L55:
            r3 = r0
            goto L58
        L57:
            r3 = r1
        L58:
            me.magnum.melonds.ui.settings.preferences.StoragePickerPreference r4 = r8.r0
            r0 = 0
            if (r4 == 0) goto L7e
            androidx.preference.ListPreference r5 = r8.s0
            if (r5 == 0) goto L78
            java.lang.String r0 = "video_retroarch_shader_parameters"
            androidx.preference.Preference r0 = r8.findPreference(r0)
            r6 = r0
            androidx.preference.EditTextPreference r6 = (androidx.preference.EditTextPreference) r6
            java.lang.String r0 = "video_retroarch_shader_clear_history"
            androidx.preference.Preference r0 = r8.findPreference(r0)
            r7 = r0
            androidx.preference.SwitchPreference r7 = (androidx.preference.SwitchPreference) r7
            r2 = r8
            r2.I(r3, r4, r5, r6, r7)
            return
        L78:
            java.lang.String r8 = "shaderPresetPreference"
            defpackage.nb3.a0(r8)
            throw r0
        L7e:
            java.lang.String r8 = "shaderRootPreference"
            defpackage.nb3.a0(r8)
            throw r0
    }

    public final me.magnum.melonds.domain.model.RetroArchShaderSource t() {
            r7 = this;
            v15 r0 = r7.getPreferenceManager()
            android.content.SharedPreferences r0 = r0.d()
            r1 = 0
            if (r0 == 0) goto L12
            java.lang.String r2 = "video_retroarch_shader_source"
            java.lang.String r2 = r0.getString(r2, r1)
            goto L13
        L12:
            r2 = r1
        L13:
            if (r0 == 0) goto L1c
            java.lang.String r3 = "video_retroarch_shader_root"
            java.util.Set r0 = r0.getStringSet(r3, r1)
            goto L1d
        L1c:
            r0 = r1
        L1d:
            java.util.Collection r0 = (java.util.Collection) r0
            r3 = 0
            r4 = 1
            if (r0 == 0) goto L2c
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L2a
            goto L2c
        L2a:
            r0 = r3
            goto L2d
        L2c:
            r0 = r4
        L2d:
            cp5 r7 = r7.p()
            java.io.File r7 = r7.d()
            if (r7 == 0) goto L38
            r3 = r4
        L38:
            gp5 r7 = me.magnum.melonds.domain.model.RetroArchShaderSource.Companion
            r7.getClass()
            t52 r7 = me.magnum.melonds.domain.model.RetroArchShaderSource.getEntries()
            java.util.Iterator r7 = r7.iterator()
        L45:
            boolean r5 = r7.hasNext()
            if (r5 == 0) goto L5d
            java.lang.Object r5 = r7.next()
            r6 = r5
            me.magnum.melonds.domain.model.RetroArchShaderSource r6 = (me.magnum.melonds.domain.model.RetroArchShaderSource) r6
            java.lang.String r6 = r6.getPreferenceValue()
            boolean r6 = defpackage.xs6.Z(r6, r2, r4)
            if (r6 == 0) goto L45
            goto L5e
        L5d:
            r5 = r1
        L5e:
            me.magnum.melonds.domain.model.RetroArchShaderSource r5 = (me.magnum.melonds.domain.model.RetroArchShaderSource) r5
            if (r5 == 0) goto L63
            return r5
        L63:
            if (r0 != 0) goto L68
            me.magnum.melonds.domain.model.RetroArchShaderSource r7 = me.magnum.melonds.domain.model.RetroArchShaderSource.FOLDER
            return r7
        L68:
            if (r3 == 0) goto L6d
            me.magnum.melonds.domain.model.RetroArchShaderSource r7 = me.magnum.melonds.domain.model.RetroArchShaderSource.INTERNAL
            return r7
        L6d:
            return r1
    }

    public final void y(androidx.preference.ListPreference r15) {
            r14 = this;
            me.magnum.melonds.domain.model.RetroArchShaderSource r0 = r14.t()
            r3 = -1
            if (r0 != 0) goto L9
            r0 = r3
            goto L11
        L9:
            int[] r4 = me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment.WhenMappings.a
            int r0 = r0.ordinal()
            r0 = r4[r0]
        L11:
            r4 = 1
            r10 = 0
            if (r0 == r3) goto L4a
            if (r0 == r4) goto L50
            r3 = 2
            if (r0 != r3) goto L4c
            v15 r0 = r14.getPreferenceManager()
            android.content.SharedPreferences r0 = r0.d()
            if (r0 == 0) goto L4a
            java.lang.String r5 = "video_retroarch_shader_root"
            java.util.Set r0 = r0.getStringSet(r5, r10)
            if (r0 == 0) goto L4a
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.lang.Object r0 = defpackage.gt0.I0(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L4a
            android.net.Uri r0 = android.net.Uri.parse(r0)
            if (r0 == 0) goto L4a
            android.content.Context r5 = r14.requireContext()
            r5.getClass()
            me.magnum.melonds.ui.settings.fragments.a r6 = new me.magnum.melonds.ui.settings.fragments.a
            r6.<init>(r5, r0, r3)
        L48:
            r5 = r6
            goto L60
        L4a:
            r5 = r10
            goto L60
        L4c:
            defpackage.i.d()
            return
        L50:
            cp5 r0 = r14.p()
            java.io.File r0 = r0.d()
            if (r0 == 0) goto L4a
            me.magnum.melonds.ui.settings.fragments.i r6 = new me.magnum.melonds.ui.settings.fragments.i
            r6.<init>(r0)
            goto L48
        L60:
            if (r5 != 0) goto L7b
            r0 = 2131952845(0x7f1304cd, float:1.9542144E38)
            java.lang.String r0 = r14.getString(r0)
            r15.setSummary(r0)
            android.content.Context r0 = r14.requireContext()
            r1 = 2131952496(0x7f130370, float:1.9541436E38)
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r1, r4)
            r0.show()
            return
        L7b:
            android.content.Context r0 = r14.requireContext()
            r0.getClass()
            android.view.LayoutInflater r3 = r14.getLayoutInflater()
            r4 = 2131623995(0x7f0e003b, float:1.8875157E38)
            android.view.View r3 = r3.inflate(r4, r10)
            r4 = 2131427977(0x7f0b0289, float:1.8477585E38)
            android.view.View r4 = r3.findViewById(r4)
            r7 = r4
            android.widget.TextView r7 = (android.widget.TextView) r7
            r4 = 2131427976(0x7f0b0288, float:1.8477583E38)
            android.view.View r4 = r3.findViewById(r4)
            r8 = r4
            android.widget.TextView r8 = (android.widget.TextView) r8
            r4 = 2131427683(0x7f0b0163, float:1.847699E38)
            android.view.View r4 = r3.findViewById(r4)
            r11 = r4
            androidx.recyclerview.widget.RecyclerView r11 = (androidx.recyclerview.widget.RecyclerView) r11
            r4 = 2131427513(0x7f0b00b9, float:1.8476644E38)
            android.view.View r4 = r3.findViewById(r4)
            android.view.ViewGroup$LayoutParams r6 = r4.getLayoutParams()
            int r9 = r6.height
            android.content.res.Resources r12 = r14.getResources()
            android.util.DisplayMetrics r12 = r12.getDisplayMetrics()
            int r12 = r12.heightPixels
            float r12 = (float) r12
            r13 = 1055286886(0x3ee66666, float:0.45)
            float r12 = r12 * r13
            int r12 = (int) r12
            int r9 = java.lang.Math.min(r9, r12)
            r6.height = r9
            r4.setLayoutParams(r6)
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r6.<init>()
            dh5 r4 = new dh5
            r4.<init>()
            java.lang.String r9 = ""
            r4.A = r9
            zb r9 = new zb
            r9.<init>(r0)
            java.lang.CharSequence r0 = r15.getTitle()
            java.lang.Object r12 = r9.L
            wb r12 = (defpackage.wb) r12
            r12.d = r0
            r9.A(r3)
            r0 = 17039360(0x1040000, float:2.424457E-38)
            r9.x(r0, r10)
            ac r3 = r9.l()
            dh5 r9 = new dh5
            r9.<init>()
            me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$ShaderBrowserAdapter r12 = new me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$ShaderBrowserAdapter
            t46 r13 = new t46
            r0 = 22
            r13.<init>(r15, r0)
            me.magnum.melonds.ui.settings.fragments.d r0 = new me.magnum.melonds.ui.settings.fragments.d
            r1 = r14
            r2 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r2 = r4
            r12.<init>(r14, r13, r0)
            r9.A = r12
            androidx.recyclerview.widget.LinearLayoutManager r0 = new androidx.recyclerview.widget.LinearLayoutManager
            r0.<init>()
            r11.setLayoutManager(r0)
            java.lang.Object r0 = r9.A
            if (r0 == 0) goto L172
            me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$ShaderBrowserAdapter r0 = (me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment.ShaderBrowserAdapter) r0
            r11.setAdapter(r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r4 = 33
            if (r0 < r4) goto L140
            me.magnum.melonds.ui.settings.fragments.e r0 = new me.magnum.melonds.ui.settings.fragments.e
            r1 = r3
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r3 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9 = r1
            r10 = r0
            r1 = r8
            r8 = r7
            r7 = r6
            r6 = r5
            r5 = r4
            goto L156
        L140:
            r1 = r9
            r9 = r3
            me.magnum.melonds.ui.settings.fragments.f r0 = new me.magnum.melonds.ui.settings.fragments.f
            r3 = r5
            r4 = r6
            r5 = r7
            r6 = r8
            r7 = r1
            r1 = r2
            r2 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r2 = r1
            r1 = r7
            r6 = r4
            r7 = r5
            r5 = r3
            r9.setOnKeyListener(r0)
        L156:
            me.magnum.melonds.ui.settings.fragments.g r0 = new me.magnum.melonds.ui.settings.fragments.g
            r4 = r14
            r3 = r2
            r2 = r9
            r9 = r1
            r1 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r3 = r2
            r2 = r0
            r0 = r1
            r3.setOnShowListener(r2)
            sm7 r2 = new sm7
            r2.<init>(r0, r3, r14)
            r3.setOnDismissListener(r2)
            r3.show()
            return
        L172:
            java.lang.String r0 = "adapter"
            defpackage.nb3.a0(r0)
            throw r10
    }
}
