package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nt7  reason: default package */
/* loaded from: classes.dex */
public final class nt7 extends defpackage.ak7 implements defpackage.u7 {
    public static final android.view.animation.AccelerateInterpolator K = null;
    public static final android.view.animation.DecelerateInterpolator L = null;
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public defpackage.jp7 E;
    public boolean F;
    public boolean G;
    public final defpackage.lt7 H;
    public final defpackage.lt7 I;
    public final defpackage.j97 J;
    public android.content.Context l;
    public android.content.Context m;
    public androidx.appcompat.widget.ActionBarOverlayLayout n;
    public androidx.appcompat.widget.ActionBarContainer o;
    public defpackage.tc1 p;
    public androidx.appcompat.widget.ActionBarContextView q;
    public final android.view.View r;
    public boolean s;
    public defpackage.mt7 t;
    public defpackage.mt7 u;
    public defpackage.u63 v;
    public boolean w;
    public final java.util.ArrayList x;
    public int y;
    public boolean z;

    static {
            android.view.animation.AccelerateInterpolator r0 = new android.view.animation.AccelerateInterpolator
            r0.<init>()
            defpackage.nt7.K = r0
            android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
            r0.<init>()
            defpackage.nt7.L = r0
            return
    }

    public nt7(android.app.Activity r4, boolean r5) {
            r3 = this;
            r3.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.x = r0
            r0 = 0
            r3.y = r0
            r1 = 1
            r3.z = r1
            r3.D = r1
            lt7 r2 = new lt7
            r2.<init>(r3, r0)
            r3.H = r2
            lt7 r0 = new lt7
            r0.<init>(r3, r1)
            r3.I = r0
            j97 r0 = new j97
            r1 = 13
            r0.<init>(r3, r1)
            r3.J = r0
            android.view.Window r4 = r4.getWindow()
            android.view.View r4 = r4.getDecorView()
            r3.M0(r4)
            if (r5 != 0) goto L44
            r5 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r4 = r4.findViewById(r5)
            r3.r = r4
        L44:
            return
    }

    public nt7(android.app.Dialog r3) {
            r2 = this;
            r2.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.x = r0
            r0 = 0
            r2.y = r0
            r0 = 1
            r2.z = r0
            r2.D = r0
            lt7 r0 = new lt7
            r1 = 0
            r0.<init>(r2, r1)
            r2.H = r0
            lt7 r0 = new lt7
            r1 = 1
            r0.<init>(r2, r1)
            r2.I = r0
            j97 r0 = new j97
            r1 = 13
            r0.<init>(r2, r1)
            r2.J = r0
            android.view.Window r3 = r3.getWindow()
            android.view.View r3 = r3.getDecorView()
            r2.M0(r3)
            return
    }

    @Override // defpackage.ak7
    public final void A0(boolean r2) {
            r1 = this;
            boolean r0 = r1.s
            if (r0 != 0) goto L7
            r1.B0(r2)
        L7:
            return
    }

    @Override // defpackage.ak7
    public final void B0(boolean r5) {
            r4 = this;
            r0 = 4
            if (r5 == 0) goto L5
            r5 = r0
            goto L6
        L5:
            r5 = 0
        L6:
            tc1 r1 = r4.p
            l87 r1 = (defpackage.l87) r1
            int r2 = r1.b
            r3 = 1
            r4.s = r3
            r4 = r5 & 4
            r5 = r2 & (-5)
            r4 = r4 | r5
            r1.a(r4)
            return
    }

    @Override // defpackage.ak7
    public final void C0(boolean r1) {
            r0 = this;
            r0.F = r1
            if (r1 != 0) goto Lb
            jp7 r0 = r0.E
            if (r0 == 0) goto Lb
            r0.a()
        Lb:
            return
    }

    @Override // defpackage.ak7
    public final void D0(java.lang.String r3) {
            r2 = this;
            tc1 r2 = r2.p
            l87 r2 = (defpackage.l87) r2
            r0 = 1
            r2.g = r0
            androidx.appcompat.widget.Toolbar r0 = r2.a
            r2.h = r3
            int r1 = r2.b
            r1 = r1 & 8
            if (r1 == 0) goto L1f
            r0.setTitle(r3)
            boolean r2 = r2.g
            if (r2 == 0) goto L1f
            android.view.View r2 = r0.getRootView()
            defpackage.ao7.o(r2, r3)
        L1f:
            return
    }

    @Override // defpackage.ak7
    public final void E0(java.lang.CharSequence r3) {
            r2 = this;
            tc1 r2 = r2.p
            l87 r2 = (defpackage.l87) r2
            boolean r0 = r2.g
            if (r0 != 0) goto L20
            androidx.appcompat.widget.Toolbar r0 = r2.a
            r2.h = r3
            int r1 = r2.b
            r1 = r1 & 8
            if (r1 == 0) goto L20
            r0.setTitle(r3)
            boolean r2 = r2.g
            if (r2 == 0) goto L20
            android.view.View r2 = r0.getRootView()
            defpackage.ao7.o(r2, r3)
        L20:
            return
    }

    @Override // defpackage.ak7
    public final defpackage.k8 G0(defpackage.u63 r3) {
            r2 = this;
            mt7 r0 = r2.t
            if (r0 == 0) goto L7
            r0.a()
        L7:
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = r2.n
            r1 = 0
            r0.setHideOnContentScrollEnabled(r1)
            androidx.appcompat.widget.ActionBarContextView r0 = r2.q
            r0.e()
            mt7 r0 = new mt7
            androidx.appcompat.widget.ActionBarContextView r1 = r2.q
            android.content.Context r1 = r1.getContext()
            r0.<init>(r2, r1, r3)
            i44 r3 = r0.R
            r3.w()
            u63 r1 = r0.X     // Catch: java.lang.Throwable -> L42
            java.lang.Object r1 = r1.B     // Catch: java.lang.Throwable -> L42
            eb r1 = (defpackage.eb) r1     // Catch: java.lang.Throwable -> L42
            boolean r1 = r1.K(r0, r3)     // Catch: java.lang.Throwable -> L42
            r3.v()
            if (r1 == 0) goto L40
            r2.t = r0
            r0.g()
            androidx.appcompat.widget.ActionBarContextView r3 = r2.q
            r3.c(r0)
            r3 = 1
            r2.L0(r3)
            return r0
        L40:
            r2 = 0
            return r2
        L42:
            r2 = move-exception
            r3.v()
            throw r2
    }

    public final void L0(boolean r11) {
            r10 = this;
            boolean r0 = r10.C
            r1 = 0
            if (r11 == 0) goto L15
            if (r0 != 0) goto L23
            r0 = 1
            r10.C = r0
            androidx.appcompat.widget.ActionBarOverlayLayout r2 = r10.n
            if (r2 == 0) goto L11
            r2.setShowingForActionMode(r0)
        L11:
            r10.O0(r1)
            goto L23
        L15:
            if (r0 == 0) goto L23
            r10.C = r1
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = r10.n
            if (r0 == 0) goto L20
            r0.setShowingForActionMode(r1)
        L20:
            r10.O0(r1)
        L23:
            androidx.appcompat.widget.ActionBarContainer r0 = r10.o
            boolean r0 = r0.isLaidOut()
            tc1 r2 = r10.p
            r3 = 8
            r4 = 4
            if (r0 == 0) goto Lac
            r5 = 200(0xc8, double:9.9E-322)
            r7 = 100
            if (r11 == 0) goto L54
            l87 r2 = (defpackage.l87) r2
            androidx.appcompat.widget.Toolbar r11 = r2.a
            ip7 r11 = defpackage.ao7.b(r11)
            r0 = 0
            r11.a(r0)
            r11.c(r7)
            k87 r0 = new k87
            r0.<init>(r2, r4)
            r11.d(r0)
            androidx.appcompat.widget.ActionBarContextView r10 = r10.q
            ip7 r10 = r10.i(r1, r5)
            goto L75
        L54:
            l87 r2 = (defpackage.l87) r2
            androidx.appcompat.widget.Toolbar r11 = r2.a
            ip7 r11 = defpackage.ao7.b(r11)
            r0 = 1065353216(0x3f800000, float:1.0)
            r11.a(r0)
            r11.c(r5)
            k87 r0 = new k87
            r0.<init>(r2, r1)
            r11.d(r0)
            androidx.appcompat.widget.ActionBarContextView r10 = r10.q
            ip7 r10 = r10.i(r3, r7)
            r9 = r11
            r11 = r10
            r10 = r9
        L75:
            jp7 r0 = new jp7
            r0.<init>()
            java.util.ArrayList r1 = r0.a
            r1.add(r11)
            java.lang.ref.WeakReference r11 = r11.a
            java.lang.Object r11 = r11.get()
            android.view.View r11 = (android.view.View) r11
            if (r11 == 0) goto L92
            android.view.ViewPropertyAnimator r11 = r11.animate()
            long r2 = r11.getDuration()
            goto L94
        L92:
            r2 = 0
        L94:
            java.lang.ref.WeakReference r11 = r10.a
            java.lang.Object r11 = r11.get()
            android.view.View r11 = (android.view.View) r11
            if (r11 == 0) goto La5
            android.view.ViewPropertyAnimator r11 = r11.animate()
            r11.setStartDelay(r2)
        La5:
            r1.add(r10)
            r0.b()
            return
        Lac:
            if (r11 == 0) goto Lbb
            l87 r2 = (defpackage.l87) r2
            androidx.appcompat.widget.Toolbar r11 = r2.a
            r11.setVisibility(r4)
            androidx.appcompat.widget.ActionBarContextView r10 = r10.q
            r10.setVisibility(r1)
            return
        Lbb:
            l87 r2 = (defpackage.l87) r2
            androidx.appcompat.widget.Toolbar r11 = r2.a
            r11.setVisibility(r1)
            androidx.appcompat.widget.ActionBarContextView r10 = r10.q
            r10.setVisibility(r3)
            return
    }

    @Override // defpackage.ak7
    public final boolean M() {
            r1 = this;
            tc1 r1 = r1.p
            if (r1 == 0) goto L24
            r0 = r1
            l87 r0 = (defpackage.l87) r0
            androidx.appcompat.widget.Toolbar r0 = r0.a
            d87 r0 = r0.L0
            if (r0 == 0) goto L24
            o44 r0 = r0.B
            if (r0 == 0) goto L24
            l87 r1 = (defpackage.l87) r1
            androidx.appcompat.widget.Toolbar r1 = r1.a
            d87 r1 = r1.L0
            if (r1 != 0) goto L1b
            r1 = 0
            goto L1d
        L1b:
            o44 r1 = r1.B
        L1d:
            if (r1 == 0) goto L22
            r1.collapseActionView()
        L22:
            r1 = 1
            return r1
        L24:
            r1 = 0
            return r1
    }

    public final void M0(android.view.View r7) {
            r6 = this;
            r0 = 2131427530(0x7f0b00ca, float:1.8476679E38)
            android.view.View r0 = r7.findViewById(r0)
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = (androidx.appcompat.widget.ActionBarOverlayLayout) r0
            r6.n = r0
            if (r0 == 0) goto L10
            r0.setActionBarVisibilityCallback(r6)
        L10:
            r0 = 2131427380(0x7f0b0034, float:1.8476375E38)
            android.view.View r0 = r7.findViewById(r0)
            boolean r1 = r0 instanceof defpackage.tc1
            if (r1 == 0) goto L1e
            tc1 r0 = (defpackage.tc1) r0
            goto L28
        L1e:
            boolean r1 = r0 instanceof androidx.appcompat.widget.Toolbar
            if (r1 == 0) goto Lc9
            androidx.appcompat.widget.Toolbar r0 = (androidx.appcompat.widget.Toolbar) r0
            tc1 r0 = r0.getWrapper()
        L28:
            r6.p = r0
            r0 = 2131427391(0x7f0b003f, float:1.8476397E38)
            android.view.View r0 = r7.findViewById(r0)
            androidx.appcompat.widget.ActionBarContextView r0 = (androidx.appcompat.widget.ActionBarContextView) r0
            r6.q = r0
            r0 = 2131427382(0x7f0b0036, float:1.8476379E38)
            android.view.View r7 = r7.findViewById(r0)
            androidx.appcompat.widget.ActionBarContainer r7 = (androidx.appcompat.widget.ActionBarContainer) r7
            r6.o = r7
            tc1 r0 = r6.p
            if (r0 == 0) goto Lb9
            androidx.appcompat.widget.ActionBarContextView r1 = r6.q
            if (r1 == 0) goto Lb9
            if (r7 == 0) goto Lb9
            l87 r0 = (defpackage.l87) r0
            androidx.appcompat.widget.Toolbar r7 = r0.a
            android.content.Context r7 = r7.getContext()
            r6.l = r7
            tc1 r0 = r6.p
            l87 r0 = (defpackage.l87) r0
            int r0 = r0.b
            r0 = r0 & 4
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L62
            r0 = r1
            goto L63
        L62:
            r0 = r2
        L63:
            if (r0 == 0) goto L67
            r6.s = r1
        L67:
            android.content.pm.ApplicationInfo r3 = r7.getApplicationInfo()
            int r3 = r3.targetSdkVersion
            r4 = 14
            tc1 r0 = r6.p
            r0.getClass()
            android.content.res.Resources r7 = r7.getResources()
            r0 = 2131034112(0x7f050000, float:1.7678732E38)
            boolean r7 = r7.getBoolean(r0)
            r6.N0(r7)
            android.content.Context r7 = r6.l
            int[] r0 = defpackage.m75.a
            r3 = 2130968584(0x7f040008, float:1.7545826E38)
            r5 = 0
            android.content.res.TypedArray r7 = r7.obtainStyledAttributes(r5, r0, r3, r2)
            boolean r0 = r7.getBoolean(r4, r2)
            if (r0 == 0) goto La5
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = r6.n
            boolean r3 = r0.f0
            if (r3 == 0) goto L9f
            r6.G = r1
            r0.setHideOnContentScrollEnabled(r1)
            goto La5
        L9f:
            java.lang.String r6 = "Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll"
            defpackage.i.m(r6)
            return
        La5:
            r0 = 12
            int r0 = r7.getDimensionPixelSize(r0, r2)
            if (r0 == 0) goto Lb5
            float r0 = (float) r0
            androidx.appcompat.widget.ActionBarContainer r6 = r6.o
            java.util.WeakHashMap r1 = defpackage.ao7.a
            r6.setElevation(r0)
        Lb5:
            r7.recycle()
            return
        Lb9:
            java.lang.Class<nt7> r6 = defpackage.nt7.class
            java.lang.String r6 = r6.getSimpleName()
            java.lang.String r7 = " can only be used with a compatible window decor layout"
            java.lang.String r6 = r6.concat(r7)
            defpackage.i.m(r6)
            return
        Lc9:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            if (r0 == 0) goto Ld6
            java.lang.Class r7 = r0.getClass()
            java.lang.String r7 = r7.getSimpleName()
            goto Ld8
        Ld6:
            java.lang.String r7 = "null"
        Ld8:
            java.lang.String r0 = "Can't make a decor toolbar out of "
            java.lang.String r7 = r0.concat(r7)
            r6.<init>(r7)
            throw r6
    }

    public final void N0(boolean r2) {
            r1 = this;
            r0 = 0
            if (r2 != 0) goto L10
            tc1 r2 = r1.p
            l87 r2 = (defpackage.l87) r2
            r2.getClass()
            androidx.appcompat.widget.ActionBarContainer r2 = r1.o
            r2.setTabContainer(r0)
            goto L1c
        L10:
            androidx.appcompat.widget.ActionBarContainer r2 = r1.o
            r2.setTabContainer(r0)
            tc1 r2 = r1.p
            l87 r2 = (defpackage.l87) r2
            r2.getClass()
        L1c:
            tc1 r2 = r1.p
            r2.getClass()
            tc1 r2 = r1.p
            l87 r2 = (defpackage.l87) r2
            androidx.appcompat.widget.Toolbar r2 = r2.a
            r0 = 0
            r2.setCollapsible(r0)
            androidx.appcompat.widget.ActionBarOverlayLayout r1 = r1.n
            r1.setHasNonEmbeddedTabs(r0)
            return
    }

    public final void O0(boolean r12) {
            r11 = this;
            boolean r0 = r11.A
            boolean r1 = r11.B
            boolean r2 = r11.C
            r3 = 0
            r4 = 1
            if (r2 == 0) goto Lb
            goto L10
        Lb:
            if (r0 != 0) goto L12
            if (r1 == 0) goto L10
            goto L12
        L10:
            r0 = r4
            goto L13
        L12:
            r0 = r3
        L13:
            boolean r1 = r11.D
            r5 = 250(0xfa, double:1.235E-321)
            r2 = 0
            r7 = 1065353216(0x3f800000, float:1.0)
            j97 r8 = r11.J
            android.view.View r9 = r11.r
            if (r0 == 0) goto Lda
            if (r1 != 0) goto L16e
            r11.D = r4
            jp7 r0 = r11.E
            if (r0 == 0) goto L2b
            r0.a()
        L2b:
            androidx.appcompat.widget.ActionBarContainer r0 = r11.o
            r0.setVisibility(r3)
            int r0 = r11.y
            lt7 r1 = r11.I
            r10 = 0
            if (r0 != 0) goto Lba
            boolean r0 = r11.F
            if (r0 != 0) goto L3d
            if (r12 == 0) goto Lba
        L3d:
            androidx.appcompat.widget.ActionBarContainer r0 = r11.o
            r0.setTranslationY(r10)
            androidx.appcompat.widget.ActionBarContainer r0 = r11.o
            int r0 = r0.getHeight()
            int r0 = -r0
            float r0 = (float) r0
            if (r12 == 0) goto L59
            int[] r12 = new int[]{r3, r3}
            androidx.appcompat.widget.ActionBarContainer r3 = r11.o
            r3.getLocationInWindow(r12)
            r12 = r12[r4]
            float r12 = (float) r12
            float r0 = r0 - r12
        L59:
            androidx.appcompat.widget.ActionBarContainer r12 = r11.o
            r12.setTranslationY(r0)
            jp7 r12 = new jp7
            r12.<init>()
            androidx.appcompat.widget.ActionBarContainer r3 = r11.o
            ip7 r3 = defpackage.ao7.b(r3)
            r3.e(r10)
            java.lang.ref.WeakReference r4 = r3.a
            java.lang.Object r4 = r4.get()
            android.view.View r4 = (android.view.View) r4
            if (r4 == 0) goto L84
            if (r8 == 0) goto L7d
            rp1 r2 = new rp1
            r2.<init>(r8, r4)
        L7d:
            android.view.ViewPropertyAnimator r4 = r4.animate()
            r4.setUpdateListener(r2)
        L84:
            boolean r2 = r12.e
            java.util.ArrayList r4 = r12.a
            if (r2 != 0) goto L8d
            r4.add(r3)
        L8d:
            boolean r2 = r11.z
            if (r2 == 0) goto La4
            if (r9 == 0) goto La4
            r9.setTranslationY(r0)
            ip7 r0 = defpackage.ao7.b(r9)
            r0.e(r10)
            boolean r2 = r12.e
            if (r2 != 0) goto La4
            r4.add(r0)
        La4:
            boolean r0 = r12.e
            if (r0 != 0) goto Lac
            android.view.animation.DecelerateInterpolator r2 = defpackage.nt7.L
            r12.c = r2
        Lac:
            if (r0 != 0) goto Lb0
            r12.b = r5
        Lb0:
            if (r0 != 0) goto Lb4
            r12.d = r1
        Lb4:
            r11.E = r12
            r12.b()
            goto Ld0
        Lba:
            androidx.appcompat.widget.ActionBarContainer r12 = r11.o
            r12.setAlpha(r7)
            androidx.appcompat.widget.ActionBarContainer r12 = r11.o
            r12.setTranslationY(r10)
            boolean r12 = r11.z
            if (r12 == 0) goto Lcd
            if (r9 == 0) goto Lcd
            r9.setTranslationY(r10)
        Lcd:
            r1.c()
        Ld0:
            androidx.appcompat.widget.ActionBarOverlayLayout r11 = r11.n
            if (r11 == 0) goto L16e
            java.util.WeakHashMap r12 = defpackage.ao7.a
            r11.requestApplyInsets()
            return
        Lda:
            if (r1 == 0) goto L16e
            r11.D = r3
            jp7 r0 = r11.E
            if (r0 == 0) goto Le5
            r0.a()
        Le5:
            int r0 = r11.y
            lt7 r1 = r11.H
            if (r0 != 0) goto L16b
            boolean r0 = r11.F
            if (r0 != 0) goto Lf1
            if (r12 == 0) goto L16b
        Lf1:
            androidx.appcompat.widget.ActionBarContainer r0 = r11.o
            r0.setAlpha(r7)
            androidx.appcompat.widget.ActionBarContainer r0 = r11.o
            r0.setTransitioning(r4)
            jp7 r0 = new jp7
            r0.<init>()
            androidx.appcompat.widget.ActionBarContainer r7 = r11.o
            int r7 = r7.getHeight()
            int r7 = -r7
            float r7 = (float) r7
            if (r12 == 0) goto L117
            int[] r12 = new int[]{r3, r3}
            androidx.appcompat.widget.ActionBarContainer r3 = r11.o
            r3.getLocationInWindow(r12)
            r12 = r12[r4]
            float r12 = (float) r12
            float r7 = r7 - r12
        L117:
            androidx.appcompat.widget.ActionBarContainer r12 = r11.o
            ip7 r12 = defpackage.ao7.b(r12)
            r12.e(r7)
            java.lang.ref.WeakReference r3 = r12.a
            java.lang.Object r3 = r3.get()
            android.view.View r3 = (android.view.View) r3
            if (r3 == 0) goto L138
            if (r8 == 0) goto L131
            rp1 r2 = new rp1
            r2.<init>(r8, r3)
        L131:
            android.view.ViewPropertyAnimator r3 = r3.animate()
            r3.setUpdateListener(r2)
        L138:
            boolean r2 = r0.e
            java.util.ArrayList r3 = r0.a
            if (r2 != 0) goto L141
            r3.add(r12)
        L141:
            boolean r12 = r11.z
            if (r12 == 0) goto L155
            if (r9 == 0) goto L155
            ip7 r12 = defpackage.ao7.b(r9)
            r12.e(r7)
            boolean r2 = r0.e
            if (r2 != 0) goto L155
            r3.add(r12)
        L155:
            boolean r12 = r0.e
            if (r12 != 0) goto L15d
            android.view.animation.AccelerateInterpolator r2 = defpackage.nt7.K
            r0.c = r2
        L15d:
            if (r12 != 0) goto L161
            r0.b = r5
        L161:
            if (r12 != 0) goto L165
            r0.d = r1
        L165:
            r11.E = r0
            r0.b()
            return
        L16b:
            r1.c()
        L16e:
            return
    }

    @Override // defpackage.ak7
    public final void P(boolean r2) {
            r1 = this;
            boolean r0 = r1.w
            if (r2 != r0) goto L5
            goto Lf
        L5:
            r1.w = r2
            java.util.ArrayList r1 = r1.x
            int r2 = r1.size()
            if (r2 > 0) goto L10
        Lf:
            return
        L10:
            r2 = 0
            java.lang.Object r1 = r1.get(r2)
            r1.getClass()
            defpackage.u34.a()
            return
    }

    @Override // defpackage.ak7
    public final int V() {
            r0 = this;
            tc1 r0 = r0.p
            l87 r0 = (defpackage.l87) r0
            int r0 = r0.b
            return r0
    }

    @Override // defpackage.ak7
    public final android.content.Context f0() {
            r4 = this;
            android.content.Context r0 = r4.m
            if (r0 != 0) goto L28
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.Context r1 = r4.l
            android.content.res.Resources$Theme r1 = r1.getTheme()
            r2 = 2130968589(0x7f04000d, float:1.7545836E38)
            r3 = 1
            r1.resolveAttribute(r2, r0, r3)
            int r0 = r0.resourceId
            if (r0 == 0) goto L24
            android.view.ContextThemeWrapper r1 = new android.view.ContextThemeWrapper
            android.content.Context r2 = r4.l
            r1.<init>(r2, r0)
            r4.m = r1
            goto L28
        L24:
            android.content.Context r0 = r4.l
            r4.m = r0
        L28:
            android.content.Context r4 = r4.m
            return r4
    }

    @Override // defpackage.ak7
    public final java.lang.CharSequence h0() {
            r0 = this;
            tc1 r0 = r0.p
            l87 r0 = (defpackage.l87) r0
            androidx.appcompat.widget.Toolbar r0 = r0.a
            java.lang.CharSequence r0 = r0.getTitle()
            return r0
    }

    @Override // defpackage.ak7
    public final void j0() {
            r1 = this;
            boolean r0 = r1.A
            if (r0 != 0) goto Lb
            r0 = 1
            r1.A = r0
            r0 = 0
            r1.O0(r0)
        Lb:
            return
    }

    @Override // defpackage.ak7
    public final void p0() {
            r2 = this;
            android.content.Context r0 = r2.l
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2131034112(0x7f050000, float:1.7678732E38)
            boolean r0 = r0.getBoolean(r1)
            r2.N0(r0)
            return
    }

    @Override // defpackage.ak7
    public final boolean r0(int r4, android.view.KeyEvent r5) {
            r3 = this;
            mt7 r3 = r3.t
            r0 = 0
            if (r3 != 0) goto L6
            goto L23
        L6:
            i44 r3 = r3.R
            if (r3 == 0) goto L23
            int r1 = r5.getDeviceId()
            android.view.KeyCharacterMap r1 = android.view.KeyCharacterMap.load(r1)
            int r1 = r1.getKeyboardType()
            r2 = 1
            if (r1 == r2) goto L1a
            goto L1b
        L1a:
            r2 = r0
        L1b:
            r3.setQwertyMode(r2)
            boolean r3 = r3.performShortcut(r4, r5, r0)
            return r3
        L23:
            return r0
    }
}
