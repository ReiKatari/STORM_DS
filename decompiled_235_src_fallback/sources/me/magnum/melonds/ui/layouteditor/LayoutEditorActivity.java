package me.magnum.melonds.ui.layouteditor;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class LayoutEditorActivity extends defpackage.sx2 {
    public static final /* synthetic */ int N0 = 0;
    public defpackage.x86 B0;
    public defpackage.pi1 C0;
    public defpackage.sw4 D0;
    public final defpackage.uo7 E0;
    public me.magnum.melonds.ui.layouteditor.b F0;
    public android.os.Handler G0;
    public final defpackage.zk1 H0;
    public defpackage.z82 I0;
    public defpackage.u66 J0;
    public final defpackage.i9 K0;
    public final defpackage.i9 L0;
    public final defpackage.s63 M0;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public enum a extends java.lang.Enum {
        private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
        private static final /* synthetic */ me.magnum.melonds.ui.layouteditor.LayoutEditorActivity.a[] $VALUES = null;
        public static final me.magnum.melonds.ui.layouteditor.LayoutEditorActivity.a BACKGROUNDS = null;
        public static final me.magnum.melonds.ui.layouteditor.LayoutEditorActivity.a EXIT_WITHOUT_SAVING = null;
        public static final me.magnum.melonds.ui.layouteditor.LayoutEditorActivity.a PROPERTIES = null;
        public static final me.magnum.melonds.ui.layouteditor.LayoutEditorActivity.a RESET = null;
        public static final me.magnum.melonds.ui.layouteditor.LayoutEditorActivity.a REVERT = null;
        public static final me.magnum.melonds.ui.layouteditor.LayoutEditorActivity.a SAVE_AND_EXIT = null;
        public static final me.magnum.melonds.ui.layouteditor.LayoutEditorActivity.a SAVE_AS_NEW = null;
        private final int stringRes;

        private static final /* synthetic */ me.magnum.melonds.ui.layouteditor.LayoutEditorActivity.a[] $values() {
                me.magnum.melonds.ui.layouteditor.LayoutEditorActivity$a r0 = me.magnum.melonds.ui.layouteditor.LayoutEditorActivity.a.PROPERTIES
                me.magnum.melonds.ui.layouteditor.LayoutEditorActivity$a r1 = me.magnum.melonds.ui.layouteditor.LayoutEditorActivity.a.BACKGROUNDS
                me.magnum.melonds.ui.layouteditor.LayoutEditorActivity$a r2 = me.magnum.melonds.ui.layouteditor.LayoutEditorActivity.a.REVERT
                me.magnum.melonds.ui.layouteditor.LayoutEditorActivity$a r3 = me.magnum.melonds.ui.layouteditor.LayoutEditorActivity.a.RESET
                me.magnum.melonds.ui.layouteditor.LayoutEditorActivity$a r4 = me.magnum.melonds.ui.layouteditor.LayoutEditorActivity.a.SAVE_AS_NEW
                me.magnum.melonds.ui.layouteditor.LayoutEditorActivity$a r5 = me.magnum.melonds.ui.layouteditor.LayoutEditorActivity.a.SAVE_AND_EXIT
                me.magnum.melonds.ui.layouteditor.LayoutEditorActivity$a r6 = me.magnum.melonds.ui.layouteditor.LayoutEditorActivity.a.EXIT_WITHOUT_SAVING
                me.magnum.melonds.ui.layouteditor.LayoutEditorActivity$a[] r0 = new me.magnum.melonds.ui.layouteditor.LayoutEditorActivity.a[]{r0, r1, r2, r3, r4, r5, r6}
                return r0
        }

        static {
                me.magnum.melonds.ui.layouteditor.LayoutEditorActivity$a r0 = new me.magnum.melonds.ui.layouteditor.LayoutEditorActivity$a
                r1 = 0
                r2 = 2131952386(0x7f130302, float:1.9541213E38)
                java.lang.String r3 = "PROPERTIES"
                r0.<init>(r3, r1, r2)
                me.magnum.melonds.ui.layouteditor.LayoutEditorActivity.a.PROPERTIES = r0
                me.magnum.melonds.ui.layouteditor.LayoutEditorActivity$a r0 = new me.magnum.melonds.ui.layouteditor.LayoutEditorActivity$a
                r1 = 1
                r2 = 2131951722(0x7f13006a, float:1.9539867E38)
                java.lang.String r3 = "BACKGROUNDS"
                r0.<init>(r3, r1, r2)
                me.magnum.melonds.ui.layouteditor.LayoutEditorActivity.a.BACKGROUNDS = r0
                me.magnum.melonds.ui.layouteditor.LayoutEditorActivity$a r0 = new me.magnum.melonds.ui.layouteditor.LayoutEditorActivity$a
                r1 = 2
                r2 = 2131952498(0x7f130372, float:1.954144E38)
                java.lang.String r3 = "REVERT"
                r0.<init>(r3, r1, r2)
                me.magnum.melonds.ui.layouteditor.LayoutEditorActivity.a.REVERT = r0
                me.magnum.melonds.ui.layouteditor.LayoutEditorActivity$a r0 = new me.magnum.melonds.ui.layouteditor.LayoutEditorActivity$a
                r1 = 3
                r2 = 2131952446(0x7f13033e, float:1.9541335E38)
                java.lang.String r3 = "RESET"
                r0.<init>(r3, r1, r2)
                me.magnum.melonds.ui.layouteditor.LayoutEditorActivity.a.RESET = r0
                me.magnum.melonds.ui.layouteditor.LayoutEditorActivity$a r0 = new me.magnum.melonds.ui.layouteditor.LayoutEditorActivity$a
                r1 = 4
                r2 = 2131952591(0x7f1303cf, float:1.954163E38)
                java.lang.String r3 = "SAVE_AS_NEW"
                r0.<init>(r3, r1, r2)
                me.magnum.melonds.ui.layouteditor.LayoutEditorActivity.a.SAVE_AS_NEW = r0
                me.magnum.melonds.ui.layouteditor.LayoutEditorActivity$a r0 = new me.magnum.melonds.ui.layouteditor.LayoutEditorActivity$a
                r1 = 5
                r2 = 2131952590(0x7f1303ce, float:1.9541627E38)
                java.lang.String r3 = "SAVE_AND_EXIT"
                r0.<init>(r3, r1, r2)
                me.magnum.melonds.ui.layouteditor.LayoutEditorActivity.a.SAVE_AND_EXIT = r0
                me.magnum.melonds.ui.layouteditor.LayoutEditorActivity$a r0 = new me.magnum.melonds.ui.layouteditor.LayoutEditorActivity$a
                r1 = 6
                r2 = 2131951959(0x7f130157, float:1.9540347E38)
                java.lang.String r3 = "EXIT_WITHOUT_SAVING"
                r0.<init>(r3, r1, r2)
                me.magnum.melonds.ui.layouteditor.LayoutEditorActivity.a.EXIT_WITHOUT_SAVING = r0
                me.magnum.melonds.ui.layouteditor.LayoutEditorActivity$a[] r0 = $values()
                me.magnum.melonds.ui.layouteditor.LayoutEditorActivity.a.$VALUES = r0
                u52 r0 = defpackage.nc1.L(r0)
                me.magnum.melonds.ui.layouteditor.LayoutEditorActivity.a.$ENTRIES = r0
                return
        }

        a(java.lang.String r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.stringRes = r3
                return
        }

        public static defpackage.t52 getEntries() {
                t52 r0 = me.magnum.melonds.ui.layouteditor.LayoutEditorActivity.a.$ENTRIES
                return r0
        }

        public static me.magnum.melonds.ui.layouteditor.LayoutEditorActivity.a valueOf(java.lang.String r1) {
                java.lang.Class<me.magnum.melonds.ui.layouteditor.LayoutEditorActivity$a> r0 = me.magnum.melonds.ui.layouteditor.LayoutEditorActivity.a.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                me.magnum.melonds.ui.layouteditor.LayoutEditorActivity$a r1 = (me.magnum.melonds.ui.layouteditor.LayoutEditorActivity.a) r1
                return r1
        }

        public static me.magnum.melonds.ui.layouteditor.LayoutEditorActivity.a[] values() {
                me.magnum.melonds.ui.layouteditor.LayoutEditorActivity$a[] r0 = me.magnum.melonds.ui.layouteditor.LayoutEditorActivity.a.$VALUES
                java.lang.Object r0 = r0.clone()
                me.magnum.melonds.ui.layouteditor.LayoutEditorActivity$a[] r0 = (me.magnum.melonds.ui.layouteditor.LayoutEditorActivity.a[]) r0
                return r0
        }

        public final int getStringRes() {
                r0 = this;
                int r0 = r0.stringRes
                return r0
        }
    }

    public LayoutEditorActivity() {
            r8 = this;
            r0 = 2
            r8.<init>(r0)
            wk3 r1 = new wk3
            r2 = 0
            r1.<init>(r8, r2)
            uo7 r3 = new uo7
            java.lang.Class<yl3> r4 = defpackage.yl3.class
            ar0 r4 = defpackage.gh5.a(r4)
            wk3 r5 = new wk3
            r6 = 1
            r5.<init>(r8, r6)
            wk3 r7 = new wk3
            r7.<init>(r8, r0)
            r3.<init>(r4, r5, r1, r7)
            r8.E0 = r3
            zk1 r0 = new zk1
            r1 = 3
            r0.<init>(r8, r1)
            r8.H0 = r0
            c9 r0 = new c9
            r1 = 5
            r0.<init>(r1)
            qk3 r3 = new qk3
            r3.<init>(r8, r2)
            d9 r0 = r8.s(r0, r3)
            i9 r0 = (defpackage.i9) r0
            r8.K0 = r0
            c9 r0 = new c9
            r0.<init>(r1)
            qk3 r1 = new qk3
            r1.<init>(r8, r6)
            d9 r0 = r8.s(r0, r1)
            i9 r0 = (defpackage.i9) r0
            r8.L0 = r0
            s63 r0 = new s63
            r1 = 7
            r0.<init>(r8, r1)
            r8.M0 = r0
            return
    }

    public final void B() {
            r3 = this;
            me.magnum.melonds.ui.layouteditor.b r0 = r3.F0
            r1 = 0
            if (r0 == 0) goto Le
            me.magnum.melonds.ui.layouteditor.LayoutEditorView r0 = r0.getLayoutEditorView()
            java.util.ArrayList r0 = r0.h()
            goto Lf
        Le:
            r0 = r1
        Lf:
            z82 r2 = r3.I0
            if (r2 == 0) goto L1c
            me.magnum.melonds.ui.layouteditor.b r2 = r2.A
            if (r2 == 0) goto L1c
            me.magnum.melonds.ui.layouteditor.LayoutEditorView r2 = r2.getLayoutEditorView()
            goto L1d
        L1c:
            r2 = r1
        L1d:
            if (r2 == 0) goto L23
            java.util.ArrayList r1 = r2.h()
        L23:
            yl3 r3 = r3.C()
            r3.h(r0, r1)
            return
    }

    public final defpackage.yl3 C() {
            r0 = this;
            uo7 r0 = r0.E0
            java.lang.Object r0 = r0.getValue()
            yl3 r0 = (defpackage.yl3) r0
            return r0
    }

    public final void D() {
            r5 = this;
            me.magnum.melonds.ui.layouteditor.b r0 = r5.F0
            r1 = 0
            if (r0 == 0) goto L20
            me.magnum.melonds.ui.layouteditor.LayoutEditorView r0 = r0.getLayoutEditorView()
            boolean r0 = r0.j0
            if (r0 == 0) goto L20
            me.magnum.melonds.ui.layouteditor.b r0 = r5.F0
            if (r0 == 0) goto L1a
            me.magnum.melonds.ui.layouteditor.LayoutEditorView r0 = r0.getLayoutEditorView()
            java.util.ArrayList r0 = r0.h()
            goto L21
        L1a:
            java.lang.String r5 = "layoutEditorManager"
            defpackage.nb3.a0(r5)
            throw r1
        L20:
            r0 = r1
        L21:
            z82 r2 = r5.I0
            if (r2 == 0) goto L2e
            me.magnum.melonds.ui.layouteditor.b r2 = r2.A
            if (r2 == 0) goto L2e
            me.magnum.melonds.ui.layouteditor.LayoutEditorView r2 = r2.getLayoutEditorView()
            goto L2f
        L2e:
            r2 = r1
        L2f:
            if (r2 == 0) goto L3a
            boolean r3 = r2.j0
            r4 = 1
            if (r3 != r4) goto L3a
            java.util.ArrayList r1 = r2.h()
        L3a:
            if (r0 != 0) goto L40
            if (r1 == 0) goto L3f
            goto L40
        L3f:
            return
        L40:
            yl3 r5 = r5.C()
            r5.h(r0, r1)
            return
    }

    public final void E() {
            r9 = this;
            android.view.Display r0 = defpackage.ge7.D(r9)
            r0.getClass()
            x86 r1 = r9.B0
            r2 = 0
            if (r1 == 0) goto L83
            android.view.Display r6 = defpackage.x86.a(r9)
            pi1 r1 = r9.C0
            if (r1 == 0) goto L7d
            ok3 r0 = r1.b(r0, r6)
            yl3 r1 = r9.C()
            ci0 r1 = r1.d
            java.lang.Object r1 = r1.f
            tp6 r1 = (defpackage.tp6) r1
            r1.getClass()
            r1.m(r2, r0)
            z82 r0 = r9.I0
            if (r0 == 0) goto L3b
            android.view.Display r0 = r0.getDisplay()
            if (r0 == 0) goto L3b
            int r0 = r0.getDisplayId()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L3c
        L3b:
            r0 = r2
        L3c:
            if (r6 == 0) goto L47
            int r1 = r6.getDisplayId()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L48
        L47:
            r1 = r2
        L48:
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 == 0) goto L4f
            goto L7c
        L4f:
            z82 r0 = r9.I0
            if (r0 == 0) goto L56
            r0.dismiss()
        L56:
            r9.I0 = r2
            if (r6 == 0) goto L7c
            z82 r3 = new z82
            sw4 r4 = r9.D0
            if (r4 == 0) goto L76
            s63 r7 = r9.M0
            u66 r8 = r9.J0
            r5 = r9
            r3.<init>(r4, r5, r6, r7, r8)
            sk3 r9 = new sk3
            r9.<init>(r5, r3)
            r3.setOnShowListener(r9)
            r3.show()
            r5.I0 = r3
            return
        L76:
            java.lang.String r9 = "picasso"
            defpackage.nb3.a0(r9)
            throw r2
        L7c:
            return
        L7d:
            java.lang.String r9 = "deviceLayoutDisplayMapper"
            defpackage.nb3.a0(r9)
            throw r2
        L83:
            java.lang.String r9 = "secondaryDisplaySelector"
            defpackage.nb3.a0(r9)
            throw r2
    }

    @Override // defpackage.jq, defpackage.lv0, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(android.view.KeyEvent r2) {
            r1 = this;
            r2.getClass()
            int r0 = r2.getAction()
            if (r0 != 0) goto L15
            me.magnum.melonds.ui.layouteditor.b r0 = r1.F0
            if (r0 == 0) goto L15
            boolean r0 = r0.t(r2)
            if (r0 == 0) goto L15
            r1 = 1
            return r1
        L15:
            boolean r1 = super.dispatchKeyEvent(r2)
            return r1
    }

    @Override // defpackage.jq, defpackage.mv0, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(android.content.res.Configuration r3) {
            r2 = this;
            r3.getClass()
            super.onConfigurationChanged(r3)
            r2.D()
            int r3 = r3.orientation
            r0 = 1
            if (r3 != r0) goto L11
            ko4 r3 = defpackage.ko4.PORTRAIT
            goto L13
        L11:
            ko4 r3 = defpackage.ko4.LANDSCAPE
        L13:
            yl3 r0 = r2.C()
            r3.getClass()
            ci0 r0 = r0.d
            java.lang.Object r0 = r0.d
            tp6 r0 = (defpackage.tp6) r0
            r0.getClass()
            r1 = 0
            r0.m(r1, r3)
            android.os.Handler r3 = r2.G0
            if (r3 == 0) goto L35
            rk3 r0 = new rk3
            r1 = 0
            r0.<init>(r2, r1)
            r3.post(r0)
            return
        L35:
            java.lang.String r2 = "handler"
            defpackage.nb3.a0(r2)
            throw r1
    }

    @Override // defpackage.sx2, androidx.fragment.app.p, defpackage.mv0, defpackage.lv0, android.app.Activity
    public final void onCreate(android.os.Bundle r8) {
            r7 = this;
            g57 r0 = defpackage.ht.a()
            int r0 = r0.getThemeResId()
            r7.setTheme(r0)
            super.onCreate(r8)
            android.os.Handler r8 = new android.os.Handler
            android.os.Looper r0 = r7.getMainLooper()
            r8.<init>(r0)
            r7.G0 = r8
            android.util.TypedValue r8 = new android.util.TypedValue
            r8.<init>()
            android.content.res.Resources$Theme r0 = r7.getTheme()
            r1 = 16842801(0x1010031, float:2.3693695E-38)
            r2 = 1
            r0.resolveAttribute(r1, r8, r2)
            int r0 = r8.type
            r1 = 28
            if (r0 < r1) goto L36
            r1 = 31
            if (r0 > r1) goto L36
            int r8 = r8.data
            goto L3c
        L36:
            java.lang.String r8 = "#0B0814"
            int r8 = android.graphics.Color.parseColor(r8)
        L3c:
            android.widget.RelativeLayout r0 = new android.widget.RelativeLayout
            r0.<init>(r7)
            r0.setBackgroundColor(r8)
            me.magnum.melonds.ui.layouteditor.b r8 = new me.magnum.melonds.ui.layouteditor.b
            sn3 r1 = defpackage.sn3.MAIN_SCREEN
            sw4 r3 = r7.D0
            r4 = 0
            if (r3 == 0) goto L15e
            r8.<init>(r1, r3, r4, r7)
            s63 r1 = r7.M0
            r8.setListener(r1)
            r7.F0 = r8
            r1 = -1
            r0.addView(r8, r1, r1)
            r7.setContentView(r0)
            h61 r8 = new h61
            r1 = 10
            r8.<init>(r7, r1)
            java.util.WeakHashMap r1 = defpackage.ao7.a
            defpackage.sn7.c(r0, r8)
            il4 r8 = r7.b()
            d00 r0 = new d00
            r1 = 0
            r3 = 2
            r0.<init>(r7, r1, r3)
            r8.b(r0)
            me.magnum.melonds.ui.layouteditor.b r8 = r7.F0
            if (r8 == 0) goto L158
            al0 r0 = new al0
            r1 = 3
            r0.<init>(r7, r1)
            r8.addOnLayoutChangeListener(r0)
            android.content.res.Resources r8 = r7.getResources()
            android.util.DisplayMetrics r8 = r8.getDisplayMetrics()
            int r0 = r8.widthPixels
            int r8 = r8.heightPixels
            if (r0 <= 0) goto Laa
            if (r8 <= 0) goto Laa
            yl3 r5 = r7.C()
            ci0 r5 = r5.d
            java.lang.Object r5 = r5.b
            tp6 r5 = (defpackage.tp6) r5
            my4 r6 = new my4
            r6.<init>(r0, r8)
            r5.getClass()
            r5.m(r4, r6)
        Laa:
            yl3 r8 = r7.C()
            d83 r0 = defpackage.d83.e
            ci0 r8 = r8.d
            r8.o(r0)
            yl3 r8 = r7.C()
            yt1 r0 = defpackage.yt1.A
            ci0 r8 = r8.d
            r8.n(r0)
            r7.E()
            android.view.Window r8 = r7.getWindow()
            r8.getClass()
            android.view.View r0 = r8.getDecorView()
            s35 r5 = new s35
            r5.<init>(r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r6 = 35
            if (r0 < r6) goto Ldf
            av7 r0 = new av7
            r0.<init>(r8, r5)
            goto Lf8
        Ldf:
            r6 = 30
            if (r0 < r6) goto Le9
            zu7 r0 = new zu7
            r0.<init>(r8, r5)
            goto Lf8
        Le9:
            r6 = 26
            if (r0 < r6) goto Lf3
            xu7 r0 = new xu7
            r0.<init>(r8, r5)
            goto Lf8
        Lf3:
            wu7 r0 = new wu7
            r0.<init>(r8, r5)
        Lf8:
            r0.a(r3)
            r0.e()
            android.content.res.Resources r8 = r7.getResources()
            android.content.res.Configuration r8 = r8.getConfiguration()
            r8.getClass()
            int r8 = r8.orientation
            if (r8 != r2) goto L110
            ko4 r8 = defpackage.ko4.PORTRAIT
            goto L112
        L110:
            ko4 r8 = defpackage.ko4.LANDSCAPE
        L112:
            yl3 r0 = r7.C()
            r8.getClass()
            ci0 r0 = r0.d
            java.lang.Object r0 = r0.d
            tp6 r0 = (defpackage.tp6) r0
            r0.getClass()
            r0.m(r4, r8)
            au3 r8 = defpackage.bl2.C(r7)
            vk3 r0 = new vk3
            r0.<init>(r7, r4, r2)
            defpackage.hv.L(r8, r4, r4, r0, r1)
            au3 r8 = defpackage.bl2.C(r7)
            vk3 r0 = new vk3
            r0.<init>(r7, r4, r1)
            defpackage.hv.L(r8, r4, r4, r0, r1)
            au3 r8 = defpackage.bl2.C(r7)
            vk3 r0 = new vk3
            r2 = 5
            r0.<init>(r7, r4, r2)
            defpackage.hv.L(r8, r4, r4, r0, r1)
            au3 r8 = defpackage.bl2.C(r7)
            vk3 r0 = new vk3
            r2 = 7
            r0.<init>(r7, r4, r2)
            defpackage.hv.L(r8, r4, r4, r0, r1)
            return
        L158:
            java.lang.String r7 = "layoutEditorManager"
            defpackage.nb3.a0(r7)
            throw r4
        L15e:
            java.lang.String r7 = "picasso"
            defpackage.nb3.a0(r7)
            throw r4
    }

    @Override // defpackage.sx2, defpackage.jq, androidx.fragment.app.p, android.app.Activity
    public final void onDestroy() {
            r4 = this;
            super.onDestroy()
            sw4 r0 = r4.D0
            java.lang.String r1 = "picasso"
            r2 = 0
            if (r0 == 0) goto L3e
            me.magnum.melonds.ui.layouteditor.b r3 = r4.F0
            if (r3 == 0) goto L38
            android.widget.ImageView r3 = r3.getImageBackground()
            if (r3 == 0) goto L32
            r0.a(r3)
            z82 r0 = r4.I0
            if (r0 == 0) goto L31
            me.magnum.melonds.ui.layouteditor.b r0 = r0.A
            if (r0 == 0) goto L31
            android.widget.ImageView r0 = r0.getImageBackground()
            if (r0 == 0) goto L31
            sw4 r4 = r4.D0
            if (r4 == 0) goto L2d
            r4.a(r0)
            return
        L2d:
            defpackage.nb3.a0(r1)
            throw r2
        L31:
            return
        L32:
            java.lang.String r4 = "view cannot be null."
            defpackage.i.h(r4)
            return
        L38:
            java.lang.String r4 = "layoutEditorManager"
            defpackage.nb3.a0(r4)
            throw r2
        L3e:
            defpackage.nb3.a0(r1)
            throw r2
    }

    @Override // androidx.fragment.app.p, android.app.Activity
    public final void onPause() {
            r0 = this;
            super.onPause()
            r0.D()
            return
    }

    @Override // androidx.fragment.app.p, android.app.Activity
    public final void onResume() {
            r0 = this;
            super.onResume()
            r0.E()
            return
    }

    @Override // defpackage.jq, androidx.fragment.app.p, android.app.Activity
    public final void onStart() {
            r2 = this;
            super.onStart()
            java.lang.Class<android.hardware.display.DisplayManager> r0 = android.hardware.display.DisplayManager.class
            java.lang.Object r0 = r2.getSystemService(r0)
            android.hardware.display.DisplayManager r0 = (android.hardware.display.DisplayManager) r0
            if (r0 == 0) goto L13
            zk1 r2 = r2.H0
            r1 = 0
            r0.registerDisplayListener(r2, r1)
        L13:
            return
    }

    @Override // defpackage.jq, androidx.fragment.app.p, android.app.Activity
    public final void onStop() {
            r2 = this;
            super.onStop()
            java.lang.Class<android.hardware.display.DisplayManager> r0 = android.hardware.display.DisplayManager.class
            java.lang.Object r0 = r2.getSystemService(r0)
            android.hardware.display.DisplayManager r0 = (android.hardware.display.DisplayManager) r0
            if (r0 == 0) goto L12
            zk1 r1 = r2.H0
            r0.unregisterDisplayListener(r1)
        L12:
            r2.D()
            z82 r0 = r2.I0
            if (r0 == 0) goto L24
            me.magnum.melonds.ui.layouteditor.b r1 = r0.A
            u66 r1 = r1.A()
            r2.J0 = r1
            r0.dismiss()
        L24:
            r0 = 0
            r2.I0 = r0
            return
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean r3) {
            r2 = this;
            super.onWindowFocusChanged(r3)
            android.view.Window r2 = r2.getWindow()
            r2.getClass()
            android.view.View r3 = r2.getDecorView()
            s35 r0 = new s35
            r0.<init>(r3)
            int r3 = android.os.Build.VERSION.SDK_INT
            r1 = 35
            if (r3 < r1) goto L1f
            av7 r3 = new av7
            r3.<init>(r2, r0)
            goto L38
        L1f:
            r1 = 30
            if (r3 < r1) goto L29
            zu7 r3 = new zu7
            r3.<init>(r2, r0)
            goto L38
        L29:
            r1 = 26
            if (r3 < r1) goto L33
            xu7 r3 = new xu7
            r3.<init>(r2, r0)
            goto L38
        L33:
            wu7 r3 = new wu7
            r3.<init>(r2, r0)
        L38:
            r2 = 2
            r3.a(r2)
            r3.e()
            return
    }
}
