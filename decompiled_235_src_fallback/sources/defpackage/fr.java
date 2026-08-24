package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fr  reason: default package */
/* loaded from: classes.dex */
public final class fr extends defpackage.tq implements defpackage.g44, android.view.LayoutInflater.Factory2 {
    public static final defpackage.ci6 c1 = null;
    public static final int[] d1 = null;
    public static final boolean e1 = false;
    public boolean A0;
    public boolean B0;
    public boolean C0;
    public boolean D0;
    public boolean E0;
    public boolean F0;
    public defpackage.er[] G0;
    public defpackage.er H0;
    public boolean I0;
    public boolean J0;
    public boolean K0;
    public boolean L0;
    public android.content.res.Configuration M0;
    public final int N0;
    public int O0;
    public int P0;
    public boolean Q0;
    public defpackage.br R0;
    public defpackage.br S0;
    public boolean T0;
    public int U0;
    public final defpackage.uq V0;
    public boolean W0;
    public android.graphics.Rect X0;
    public android.graphics.Rect Y0;
    public defpackage.ys Z0;
    public android.window.OnBackInvokedDispatcher a1;
    public android.window.OnBackInvokedCallback b1;
    public final java.lang.Object f0;
    public final android.content.Context g0;
    public android.view.Window h0;
    public defpackage.ar i0;
    public defpackage.ak7 j0;
    public defpackage.ku6 k0;
    public java.lang.CharSequence l0;
    public androidx.appcompat.widget.ActionBarOverlayLayout m0;
    public defpackage.vq n0;
    public defpackage.vq o0;
    public defpackage.k8 p0;
    public androidx.appcompat.widget.ActionBarContextView q0;
    public android.widget.PopupWindow r0;
    public defpackage.uq s0;
    public defpackage.ip7 t0;
    public boolean u0;
    public android.view.ViewGroup v0;
    public android.widget.TextView w0;
    public android.view.View x0;
    public boolean y0;
    public boolean z0;

    static {
            ci6 r0 = new ci6
            r1 = 0
            r0.<init>(r1)
            defpackage.fr.c1 = r0
            r0 = 16842836(0x1010054, float:2.3693793E-38)
            int[] r0 = new int[]{r0}
            defpackage.fr.d1 = r0
            java.lang.String r0 = "robolectric"
            java.lang.String r1 = android.os.Build.FINGERPRINT
            boolean r0 = r0.equals(r1)
            r0 = r0 ^ 1
            defpackage.fr.e1 = r0
            return
    }

    public fr(android.content.Context r4, android.view.Window r5, defpackage.mq r6, java.lang.Object r7) {
            r3 = this;
            r3.<init>()
            r6 = 0
            r3.t0 = r6
            r0 = -100
            r3.N0 = r0
            uq r1 = new uq
            r2 = 0
            r1.<init>(r3, r2)
            r3.V0 = r1
            r3.g0 = r4
            r3.f0 = r7
            boolean r7 = r7 instanceof android.app.Dialog
            if (r7 == 0) goto L3b
        L1a:
            if (r4 == 0) goto L2f
            boolean r7 = r4 instanceof defpackage.jq
            if (r7 == 0) goto L24
            r6 = r4
            jq r6 = (defpackage.jq) r6
            goto L2f
        L24:
            boolean r7 = r4 instanceof android.content.ContextWrapper
            if (r7 == 0) goto L2f
            android.content.ContextWrapper r4 = (android.content.ContextWrapper) r4
            android.content.Context r4 = r4.getBaseContext()
            goto L1a
        L2f:
            if (r6 == 0) goto L3b
            tq r4 = r6.v()
            fr r4 = (defpackage.fr) r4
            int r4 = r4.N0
            r3.N0 = r4
        L3b:
            int r4 = r3.N0
            if (r4 != r0) goto L66
            java.lang.Object r4 = r3.f0
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getName()
            ci6 r6 = defpackage.fr.c1
            java.lang.Object r4 = r6.get(r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            if (r4 == 0) goto L66
            int r4 = r4.intValue()
            r3.N0 = r4
            java.lang.Object r4 = r3.f0
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getName()
            r6.remove(r4)
        L66:
            if (r5 == 0) goto L6b
            r3.r(r5)
        L6b:
            defpackage.ir.d()
            return
    }

    public static defpackage.hy3 s(android.content.Context r5) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L7
            goto Lb
        L7:
            hy3 r0 = defpackage.tq.L
            if (r0 != 0) goto Ld
        Lb:
            r5 = 0
            return r5
        Ld:
            android.content.Context r5 = r5.getApplicationContext()
            android.content.res.Resources r5 = r5.getResources()
            android.content.res.Configuration r5 = r5.getConfiguration()
            hy3 r5 = defpackage.yq.b(r5)
            iy3 r1 = r0.a
            android.os.LocaleList r1 = r1.a
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L2a
            hy3 r0 = defpackage.hy3.b
            goto L73
        L2a:
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r2 = 0
        L30:
            int r3 = r0.c()
            int r4 = r5.c()
            int r4 = r4 + r3
            if (r2 >= r4) goto L58
            int r3 = r0.c()
            if (r2 >= r3) goto L46
            java.util.Locale r3 = r0.b(r2)
            goto L50
        L46:
            int r3 = r0.c()
            int r3 = r2 - r3
            java.util.Locale r3 = r5.b(r3)
        L50:
            if (r3 == 0) goto L55
            r1.add(r3)
        L55:
            int r2 = r2 + 1
            goto L30
        L58:
            int r0 = r1.size()
            java.util.Locale[] r0 = new java.util.Locale[r0]
            java.lang.Object[] r0 = r1.toArray(r0)
            java.util.Locale[] r0 = (java.util.Locale[]) r0
            android.os.LocaleList r1 = new android.os.LocaleList
            r1.<init>(r0)
            hy3 r0 = new hy3
            iy3 r2 = new iy3
            r2.<init>(r1)
            r0.<init>(r2)
        L73:
            iy3 r1 = r0.a
            android.os.LocaleList r1 = r1.a
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L7e
            return r5
        L7e:
            return r0
    }

    public static android.content.res.Configuration w(android.content.Context r1, int r2, defpackage.hy3 r3, android.content.res.Configuration r4, boolean r5) {
            r0 = 1
            if (r2 == r0) goto L1e
            r0 = 2
            if (r2 == r0) goto L1b
            if (r5 == 0) goto La
            r1 = 0
            goto L20
        La:
            android.content.Context r1 = r1.getApplicationContext()
            android.content.res.Resources r1 = r1.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            int r1 = r1.uiMode
            r1 = r1 & 48
            goto L20
        L1b:
            r1 = 32
            goto L20
        L1e:
            r1 = 16
        L20:
            android.content.res.Configuration r2 = new android.content.res.Configuration
            r2.<init>()
            r5 = 0
            r2.fontScale = r5
            if (r4 == 0) goto L2d
            r2.setTo(r4)
        L2d:
            int r4 = r2.uiMode
            r4 = r4 & (-49)
            r1 = r1 | r4
            r2.uiMode = r1
            if (r3 == 0) goto L39
            defpackage.yq.d(r2, r3)
        L39:
            return r2
    }

    public final void A() {
            r2 = this;
            android.view.Window r0 = r2.h0
            if (r0 != 0) goto L13
            java.lang.Object r0 = r2.f0
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L13
            android.app.Activity r0 = (android.app.Activity) r0
            android.view.Window r0 = r0.getWindow()
            r2.r(r0)
        L13:
            android.view.Window r2 = r2.h0
            if (r2 == 0) goto L18
            return
        L18:
            java.lang.String r2 = "We have not been given a Window"
            defpackage.i.m(r2)
            return
    }

    public final defpackage.d2 B(android.content.Context r4) {
            r3 = this;
            br r0 = r3.R0
            if (r0 != 0) goto L24
            br r0 = new br
            m44 r1 = defpackage.m44.X
            if (r1 != 0) goto L1d
            android.content.Context r4 = r4.getApplicationContext()
            m44 r1 = new m44
            java.lang.String r2 = "location"
            java.lang.Object r2 = r4.getSystemService(r2)
            android.location.LocationManager r2 = (android.location.LocationManager) r2
            r1.<init>(r4, r2)
            defpackage.m44.X = r1
        L1d:
            m44 r4 = defpackage.m44.X
            r0.<init>(r3, r4)
            r3.R0 = r0
        L24:
            br r3 = r3.R0
            return r3
    }

    public final defpackage.er C(int r5) {
            r4 = this;
            er[] r0 = r4.G0
            r1 = 0
            if (r0 == 0) goto L8
            int r2 = r0.length
            if (r2 > r5) goto L15
        L8:
            int r2 = r5 + 1
            er[] r2 = new defpackage.er[r2]
            if (r0 == 0) goto L12
            int r3 = r0.length
            java.lang.System.arraycopy(r0, r1, r2, r1, r3)
        L12:
            r4.G0 = r2
            r0 = r2
        L15:
            r4 = r0[r5]
            if (r4 != 0) goto L24
            er r4 = new er
            r4.<init>()
            r4.a = r5
            r4.n = r1
            r0[r5] = r4
        L24:
            return r4
    }

    public final void D() {
            r3 = this;
            r3.z()
            boolean r0 = r3.A0
            if (r0 == 0) goto L34
            ak7 r0 = r3.j0
            if (r0 == 0) goto Lc
            goto L34
        Lc:
            java.lang.Object r0 = r3.f0
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L1e
            nt7 r1 = new nt7
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r2 = r3.B0
            r1.<init>(r0, r2)
            r3.j0 = r1
            goto L2b
        L1e:
            boolean r1 = r0 instanceof android.app.Dialog
            if (r1 == 0) goto L2b
            nt7 r1 = new nt7
            android.app.Dialog r0 = (android.app.Dialog) r0
            r1.<init>(r0)
            r3.j0 = r1
        L2b:
            ak7 r0 = r3.j0
            if (r0 == 0) goto L34
            boolean r3 = r3.W0
            r0.A0(r3)
        L34:
            return
    }

    public final void E(int r3) {
            r2 = this;
            int r0 = r2.U0
            r1 = 1
            int r3 = r1 << r3
            r3 = r3 | r0
            r2.U0 = r3
            boolean r3 = r2.T0
            if (r3 != 0) goto L1b
            android.view.Window r3 = r2.h0
            android.view.View r3 = r3.getDecorView()
            java.util.WeakHashMap r0 = defpackage.ao7.a
            uq r0 = r2.V0
            r3.postOnAnimation(r0)
            r2.T0 = r1
        L1b:
            return
    }

    public final int F(android.content.Context r3, int r4) {
            r2 = this;
            r0 = -100
            r1 = -1
            if (r4 == r0) goto L48
            if (r4 == r1) goto L47
            if (r4 == 0) goto L2b
            r0 = 1
            if (r4 == r0) goto L47
            r0 = 2
            if (r4 == r0) goto L47
            r0 = 3
            if (r4 != r0) goto L24
            br r4 = r2.S0
            if (r4 != 0) goto L1d
            br r4 = new br
            r4.<init>(r2, r3)
            r2.S0 = r4
        L1d:
            br r2 = r2.S0
            int r2 = r2.g()
            return r2
        L24:
            java.lang.String r2 = "Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate."
            defpackage.i.m(r2)
            r2 = 0
            return r2
        L2b:
            android.content.Context r4 = r3.getApplicationContext()
            java.lang.String r0 = "uimode"
            java.lang.Object r4 = r4.getSystemService(r0)
            android.app.UiModeManager r4 = (android.app.UiModeManager) r4
            int r4 = r4.getNightMode()
            if (r4 != 0) goto L3e
            goto L48
        L3e:
            d2 r2 = r2.B(r3)
            int r2 = r2.g()
            return r2
        L47:
            return r4
        L48:
            return r1
    }

    public final boolean G() {
            r5 = this;
            boolean r0 = r5.I0
            r1 = 0
            r5.I0 = r1
            er r2 = r5.C(r1)
            boolean r3 = r2.m
            r4 = 1
            if (r3 == 0) goto L14
            if (r0 != 0) goto L29
            r5.v(r2, r4)
            return r4
        L14:
            k8 r0 = r5.p0
            if (r0 == 0) goto L1c
            r0.a()
            return r4
        L1c:
            r5.D()
            ak7 r5 = r5.j0
            if (r5 == 0) goto L2a
            boolean r5 = r5.M()
            if (r5 == 0) goto L2a
        L29:
            return r4
        L2a:
            return r1
    }

    @Override // defpackage.g44
    public final void H(defpackage.i44 r6) {
            r5 = this;
            androidx.appcompat.widget.ActionBarOverlayLayout r6 = r5.m0
            r0 = 1
            r1 = 0
            if (r6 == 0) goto Lc9
            r6.k()
            tc1 r6 = r6.d0
            l87 r6 = (defpackage.l87) r6
            androidx.appcompat.widget.Toolbar r6 = r6.a
            int r2 = r6.getVisibility()
            if (r2 != 0) goto Lc9
            androidx.appcompat.widget.ActionMenuView r6 = r6.A
            if (r6 == 0) goto Lc9
            boolean r6 = r6.r0
            if (r6 == 0) goto Lc9
            android.content.Context r6 = r5.g0
            android.view.ViewConfiguration r6 = android.view.ViewConfiguration.get(r6)
            boolean r6 = r6.hasPermanentMenuKey()
            if (r6 == 0) goto L46
            androidx.appcompat.widget.ActionBarOverlayLayout r6 = r5.m0
            r6.k()
            tc1 r6 = r6.d0
            l87 r6 = (defpackage.l87) r6
            androidx.appcompat.widget.Toolbar r6 = r6.a
            androidx.appcompat.widget.ActionMenuView r6 = r6.A
            if (r6 == 0) goto Lc9
            g8 r6 = r6.s0
            if (r6 == 0) goto Lc9
            uo2 r2 = r6.q0
            if (r2 != 0) goto L46
            boolean r6 = r6.j()
            if (r6 == 0) goto Lc9
        L46:
            android.view.Window r6 = r5.h0
            android.view.Window$Callback r6 = r6.getCallback()
            androidx.appcompat.widget.ActionBarOverlayLayout r2 = r5.m0
            r2.k()
            tc1 r2 = r2.d0
            l87 r2 = (defpackage.l87) r2
            androidx.appcompat.widget.Toolbar r2 = r2.a
            boolean r2 = r2.q()
            r3 = 108(0x6c, float:1.51E-43)
            if (r2 == 0) goto L84
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = r5.m0
            r0.k()
            tc1 r0 = r0.d0
            l87 r0 = (defpackage.l87) r0
            androidx.appcompat.widget.Toolbar r0 = r0.a
            androidx.appcompat.widget.ActionMenuView r0 = r0.A
            if (r0 == 0) goto L76
            g8 r0 = r0.s0
            if (r0 == 0) goto L76
            boolean r0 = r0.e()
        L76:
            boolean r0 = r5.L0
            if (r0 != 0) goto Lc8
            er r5 = r5.C(r1)
            i44 r5 = r5.h
            r6.onPanelClosed(r3, r5)
            return
        L84:
            if (r6 == 0) goto Lc8
            boolean r2 = r5.L0
            if (r2 != 0) goto Lc8
            boolean r2 = r5.T0
            if (r2 == 0) goto La1
            int r2 = r5.U0
            r0 = r0 & r2
            if (r0 == 0) goto La1
            android.view.Window r0 = r5.h0
            android.view.View r0 = r0.getDecorView()
            uq r2 = r5.V0
            r0.removeCallbacks(r2)
            r2.run()
        La1:
            er r0 = r5.C(r1)
            i44 r2 = r0.h
            if (r2 == 0) goto Lc8
            boolean r4 = r0.o
            if (r4 != 0) goto Lc8
            android.view.View r4 = r0.g
            boolean r1 = r6.onPreparePanel(r1, r4, r2)
            if (r1 == 0) goto Lc8
            i44 r0 = r0.h
            r6.onMenuOpened(r3, r0)
            androidx.appcompat.widget.ActionBarOverlayLayout r5 = r5.m0
            r5.k()
            tc1 r5 = r5.d0
            l87 r5 = (defpackage.l87) r5
            androidx.appcompat.widget.Toolbar r5 = r5.a
            r5.w()
        Lc8:
            return
        Lc9:
            er r6 = r5.C(r1)
            r6.n = r0
            r5.v(r6, r1)
            r0 = 0
            r5.I(r6, r0)
            return
    }

    public final void I(defpackage.er r18, android.view.KeyEvent r19) {
            r17 = this;
            r0 = r17
            r1 = r18
            boolean r2 = r1.m
            int r3 = r1.a
            if (r2 != 0) goto L1d9
            boolean r2 = r0.L0
            if (r2 == 0) goto L10
            goto L1d9
        L10:
            android.content.Context r2 = r0.g0
            if (r3 != 0) goto L25
            android.content.res.Resources r4 = r2.getResources()
            android.content.res.Configuration r4 = r4.getConfiguration()
            int r4 = r4.screenLayout
            r4 = r4 & 15
            r5 = 4
            if (r4 != r5) goto L25
            goto L1d9
        L25:
            android.view.Window r4 = r0.h0
            android.view.Window$Callback r4 = r4.getCallback()
            r5 = 1
            if (r4 == 0) goto L3a
            i44 r6 = r1.h
            boolean r4 = r4.onMenuOpened(r3, r6)
            if (r4 != 0) goto L3a
            r0.v(r1, r5)
            return
        L3a:
            java.lang.String r4 = "window"
            java.lang.Object r4 = r2.getSystemService(r4)
            android.view.WindowManager r4 = (android.view.WindowManager) r4
            if (r4 != 0) goto L46
            goto L1d9
        L46:
            boolean r6 = r17.K(r18, r19)
            if (r6 != 0) goto L4e
            goto L1d9
        L4e:
            dr r6 = r1.e
            r7 = 0
            r8 = -2
            if (r6 == 0) goto L6b
            boolean r9 = r1.n
            if (r9 == 0) goto L59
            goto L6b
        L59:
            android.view.View r2 = r1.g
            if (r2 == 0) goto L1b1
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            if (r2 == 0) goto L1b1
            int r2 = r2.width
            r6 = -1
            if (r2 != r6) goto L1b1
            r10 = r6
            goto L1b2
        L6b:
            if (r6 != 0) goto Le6
            r0.D()
            ak7 r6 = r0.j0
            if (r6 == 0) goto L79
            android.content.Context r6 = r6.f0()
            goto L7a
        L79:
            r6 = 0
        L7a:
            if (r6 != 0) goto L7d
            goto L7e
        L7d:
            r2 = r6
        L7e:
            android.util.TypedValue r6 = new android.util.TypedValue
            r6.<init>()
            android.content.res.Resources r9 = r2.getResources()
            android.content.res.Resources$Theme r9 = r9.newTheme()
            android.content.res.Resources$Theme r10 = r2.getTheme()
            r9.setTo(r10)
            r10 = 2130968581(0x7f040005, float:1.754582E38)
            r9.resolveAttribute(r10, r6, r5)
            int r10 = r6.resourceId
            if (r10 == 0) goto L9f
            r9.applyStyle(r10, r5)
        L9f:
            r10 = 2130969621(0x7f040415, float:1.754793E38)
            r9.resolveAttribute(r10, r6, r5)
            int r6 = r6.resourceId
            if (r6 == 0) goto Lad
            r9.applyStyle(r6, r5)
            goto Lb3
        Lad:
            r6 = 2132017807(0x7f14028f, float:1.9673903E38)
            r9.applyStyle(r6, r5)
        Lb3:
            p41 r6 = new p41
            r6.<init>(r2, r7)
            android.content.res.Resources$Theme r2 = r6.getTheme()
            r2.setTo(r9)
            r1.j = r6
            int[] r2 = defpackage.m75.j
            android.content.res.TypedArray r2 = r6.obtainStyledAttributes(r2)
            r6 = 86
            int r6 = r2.getResourceId(r6, r7)
            r1.b = r6
            int r6 = r2.getResourceId(r5, r7)
            r1.d = r6
            r2.recycle()
            dr r2 = new dr
            p41 r6 = r1.j
            r2.<init>(r0, r6)
            r1.e = r2
            r2 = 81
            r1.c = r2
            goto Lf5
        Le6:
            boolean r2 = r1.n
            if (r2 == 0) goto Lf5
            int r2 = r6.getChildCount()
            if (r2 <= 0) goto Lf5
            dr r2 = r1.e
            r2.removeAllViews()
        Lf5:
            android.view.View r2 = r1.g
            if (r2 == 0) goto Lfc
            r1.f = r2
            goto L158
        Lfc:
            i44 r2 = r1.h
            if (r2 != 0) goto L102
            goto L1d7
        L102:
            vq r2 = r0.o0
            if (r2 != 0) goto L10e
            vq r2 = new vq
            r6 = 3
            r2.<init>(r0, r6)
            r0.o0 = r2
        L10e:
            vq r2 = r0.o0
            uw3 r6 = r1.i
            if (r6 != 0) goto L126
            uw3 r6 = new uw3
            p41 r9 = r1.j
            r6.<init>(r9)
            r1.i = r6
            r6.X = r2
            i44 r2 = r1.h
            android.content.Context r9 = r2.a
            r2.b(r6, r9)
        L126:
            uw3 r2 = r1.i
            dr r6 = r1.e
            androidx.appcompat.view.menu.ExpandedMenuView r9 = r2.R
            if (r9 != 0) goto L152
            android.view.LayoutInflater r9 = r2.B
            r10 = 2131623949(0x7f0e000d, float:1.8875064E38)
            android.view.View r6 = r9.inflate(r10, r6, r7)
            androidx.appcompat.view.menu.ExpandedMenuView r6 = (androidx.appcompat.view.menu.ExpandedMenuView) r6
            r2.R = r6
            tw3 r6 = r2.Y
            if (r6 != 0) goto L146
            tw3 r6 = new tw3
            r6.<init>(r2)
            r2.Y = r6
        L146:
            androidx.appcompat.view.menu.ExpandedMenuView r6 = r2.R
            tw3 r9 = r2.Y
            r6.setAdapter(r9)
            androidx.appcompat.view.menu.ExpandedMenuView r6 = r2.R
            r6.setOnItemClickListener(r2)
        L152:
            androidx.appcompat.view.menu.ExpandedMenuView r2 = r2.R
            r1.f = r2
            if (r2 == 0) goto L1d7
        L158:
            android.view.View r2 = r1.f
            if (r2 != 0) goto L15e
            goto L1d7
        L15e:
            android.view.View r2 = r1.g
            if (r2 == 0) goto L163
            goto L178
        L163:
            uw3 r2 = r1.i
            tw3 r6 = r2.Y
            if (r6 != 0) goto L170
            tw3 r6 = new tw3
            r6.<init>(r2)
            r2.Y = r6
        L170:
            tw3 r2 = r2.Y
            int r2 = r2.getCount()
            if (r2 <= 0) goto L1d7
        L178:
            android.view.View r2 = r1.f
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            if (r2 != 0) goto L185
            android.view.ViewGroup$LayoutParams r2 = new android.view.ViewGroup$LayoutParams
            r2.<init>(r8, r8)
        L185:
            int r6 = r1.b
            dr r9 = r1.e
            r9.setBackgroundResource(r6)
            android.view.View r6 = r1.f
            android.view.ViewParent r6 = r6.getParent()
            boolean r9 = r6 instanceof android.view.ViewGroup
            if (r9 == 0) goto L19d
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            android.view.View r9 = r1.f
            r6.removeView(r9)
        L19d:
            dr r6 = r1.e
            android.view.View r9 = r1.f
            r6.addView(r9, r2)
            android.view.View r2 = r1.f
            boolean r2 = r2.hasFocus()
            if (r2 != 0) goto L1b1
            android.view.View r2 = r1.f
            r2.requestFocus()
        L1b1:
            r10 = r8
        L1b2:
            r1.l = r7
            android.view.WindowManager$LayoutParams r9 = new android.view.WindowManager$LayoutParams
            r15 = 8519680(0x820000, float:1.1938615E-38)
            r16 = -3
            r11 = -2
            r12 = 0
            r13 = 0
            r14 = 1002(0x3ea, float:1.404E-42)
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            int r2 = r1.c
            r9.gravity = r2
            int r2 = r1.d
            r9.windowAnimations = r2
            dr r2 = r1.e
            r4.addView(r2, r9)
            r1.m = r5
            if (r3 != 0) goto L1d9
            r0.M()
            return
        L1d7:
            r1.n = r5
        L1d9:
            return
    }

    public final boolean J(defpackage.er r3, int r4, android.view.KeyEvent r5) {
            r2 = this;
            boolean r0 = r5.isSystem()
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            boolean r0 = r3.k
            if (r0 != 0) goto L12
            boolean r2 = r2.K(r3, r5)
            if (r2 == 0) goto L1b
        L12:
            i44 r2 = r3.h
            if (r2 == 0) goto L1b
            r3 = 1
            boolean r1 = r2.performShortcut(r4, r5, r3)
        L1b:
            return r1
    }

    public final boolean K(defpackage.er r13, android.view.KeyEvent r14) {
            r12 = this;
            boolean r0 = r12.L0
            r1 = 0
            if (r0 == 0) goto L7
            goto L115
        L7:
            boolean r0 = r13.k
            int r2 = r13.a
            r3 = 1
            if (r0 == 0) goto Lf
            return r3
        Lf:
            er r0 = r12.H0
            if (r0 == 0) goto L18
            if (r0 == r13) goto L18
            r12.v(r0, r1)
        L18:
            android.view.Window r0 = r12.h0
            android.view.Window$Callback r0 = r0.getCallback()
            if (r0 == 0) goto L26
            android.view.View r4 = r0.onCreatePanelView(r2)
            r13.g = r4
        L26:
            r4 = 108(0x6c, float:1.51E-43)
            if (r2 == 0) goto L2f
            if (r2 != r4) goto L2d
            goto L2f
        L2d:
            r5 = r1
            goto L30
        L2f:
            r5 = r3
        L30:
            if (r5 == 0) goto L3f
            androidx.appcompat.widget.ActionBarOverlayLayout r6 = r12.m0
            if (r6 == 0) goto L3f
            r6.k()
            tc1 r6 = r6.d0
            l87 r6 = (defpackage.l87) r6
            r6.l = r3
        L3f:
            android.view.View r6 = r13.g
            if (r6 != 0) goto L162
            if (r5 == 0) goto L4b
            ak7 r6 = r12.j0
            boolean r6 = r6 instanceof defpackage.i87
            if (r6 != 0) goto L162
        L4b:
            i44 r6 = r13.h
            r7 = 0
            if (r6 == 0) goto L54
            boolean r8 = r13.o
            if (r8 == 0) goto L118
        L54:
            if (r6 != 0) goto Ld6
            android.content.Context r6 = r12.g0
            if (r2 == 0) goto L5c
            if (r2 != r4) goto Lb3
        L5c:
            androidx.appcompat.widget.ActionBarOverlayLayout r4 = r12.m0
            if (r4 == 0) goto Lb3
            android.util.TypedValue r4 = new android.util.TypedValue
            r4.<init>()
            android.content.res.Resources$Theme r8 = r6.getTheme()
            r9 = 2130968588(0x7f04000c, float:1.7545834E38)
            r8.resolveAttribute(r9, r4, r3)
            int r9 = r4.resourceId
            r10 = 2130968589(0x7f04000d, float:1.7545836E38)
            if (r9 == 0) goto L8a
            android.content.res.Resources r9 = r6.getResources()
            android.content.res.Resources$Theme r9 = r9.newTheme()
            r9.setTo(r8)
            int r11 = r4.resourceId
            r9.applyStyle(r11, r3)
            r9.resolveAttribute(r10, r4, r3)
            goto L8e
        L8a:
            r8.resolveAttribute(r10, r4, r3)
            r9 = r7
        L8e:
            int r10 = r4.resourceId
            if (r10 == 0) goto La4
            if (r9 != 0) goto L9f
            android.content.res.Resources r9 = r6.getResources()
            android.content.res.Resources$Theme r9 = r9.newTheme()
            r9.setTo(r8)
        L9f:
            int r4 = r4.resourceId
            r9.applyStyle(r4, r3)
        La4:
            if (r9 == 0) goto Lb3
            p41 r4 = new p41
            r4.<init>(r6, r1)
            android.content.res.Resources$Theme r6 = r4.getTheme()
            r6.setTo(r9)
            r6 = r4
        Lb3:
            i44 r4 = new i44
            r4.<init>(r6)
            r4.e = r12
            i44 r6 = r13.h
            if (r4 != r6) goto Lbf
            goto Ld1
        Lbf:
            if (r6 == 0) goto Lc6
            uw3 r8 = r13.i
            r6.r(r8)
        Lc6:
            r13.h = r4
            uw3 r6 = r13.i
            if (r6 == 0) goto Ld1
            android.content.Context r8 = r4.a
            r4.b(r6, r8)
        Ld1:
            i44 r4 = r13.h
            if (r4 != 0) goto Ld6
            goto L115
        Ld6:
            if (r5 == 0) goto Lef
            androidx.appcompat.widget.ActionBarOverlayLayout r4 = r12.m0
            if (r4 == 0) goto Lef
            vq r6 = r12.n0
            if (r6 != 0) goto Le8
            vq r6 = new vq
            r8 = 2
            r6.<init>(r12, r8)
            r12.n0 = r6
        Le8:
            i44 r6 = r13.h
            vq r8 = r12.n0
            r4.l(r6, r8)
        Lef:
            i44 r4 = r13.h
            r4.w()
            i44 r4 = r13.h
            boolean r2 = r0.onCreatePanelMenu(r2, r4)
            if (r2 != 0) goto L116
            i44 r14 = r13.h
            if (r14 != 0) goto L101
            goto L10a
        L101:
            if (r14 == 0) goto L108
            uw3 r0 = r13.i
            r14.r(r0)
        L108:
            r13.h = r7
        L10a:
            if (r5 == 0) goto L115
            androidx.appcompat.widget.ActionBarOverlayLayout r13 = r12.m0
            if (r13 == 0) goto L115
            vq r12 = r12.n0
            r13.l(r7, r12)
        L115:
            return r1
        L116:
            r13.o = r1
        L118:
            i44 r2 = r13.h
            r2.w()
            android.os.Bundle r2 = r13.p
            if (r2 == 0) goto L128
            i44 r4 = r13.h
            r4.s(r2)
            r13.p = r7
        L128:
            android.view.View r2 = r13.g
            i44 r4 = r13.h
            boolean r0 = r0.onPreparePanel(r1, r2, r4)
            if (r0 != 0) goto L143
            if (r5 == 0) goto L13d
            androidx.appcompat.widget.ActionBarOverlayLayout r14 = r12.m0
            if (r14 == 0) goto L13d
            vq r12 = r12.n0
            r14.l(r7, r12)
        L13d:
            i44 r12 = r13.h
            r12.v()
            return r1
        L143:
            if (r14 == 0) goto L14a
            int r14 = r14.getDeviceId()
            goto L14b
        L14a:
            r14 = -1
        L14b:
            android.view.KeyCharacterMap r14 = android.view.KeyCharacterMap.load(r14)
            int r14 = r14.getKeyboardType()
            if (r14 == r3) goto L157
            r14 = r3
            goto L158
        L157:
            r14 = r1
        L158:
            i44 r0 = r13.h
            r0.setQwertyMode(r14)
            i44 r14 = r13.h
            r14.v()
        L162:
            r13.k = r3
            r13.l = r1
            r12.H0 = r13
            return r3
    }

    public final void L() {
            r1 = this;
            boolean r1 = r1.u0
            if (r1 != 0) goto L5
            return
        L5:
            android.util.AndroidRuntimeException r1 = new android.util.AndroidRuntimeException
            java.lang.String r0 = "Window feature must be requested before adding content"
            r1.<init>(r0)
            throw r1
    }

    public final void M() {
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L39
            android.window.OnBackInvokedDispatcher r0 = r3.a1
            r1 = 0
            if (r0 != 0) goto Lc
            goto L1c
        Lc:
            er r0 = r3.C(r1)
            boolean r0 = r0.m
            r2 = 1
            if (r0 == 0) goto L17
        L15:
            r1 = r2
            goto L1c
        L17:
            k8 r0 = r3.p0
            if (r0 == 0) goto L1c
            goto L15
        L1c:
            if (r1 == 0) goto L2b
            android.window.OnBackInvokedCallback r0 = r3.b1
            if (r0 != 0) goto L2b
            android.window.OnBackInvokedDispatcher r0 = r3.a1
            android.window.OnBackInvokedCallback r0 = defpackage.zq.b(r0, r3)
            r3.b1 = r0
            return
        L2b:
            if (r1 != 0) goto L39
            android.window.OnBackInvokedCallback r0 = r3.b1
            if (r0 == 0) goto L39
            android.window.OnBackInvokedDispatcher r1 = r3.a1
            defpackage.zq.c(r1, r0)
            r0 = 0
            r3.b1 = r0
        L39:
            return
    }

    @Override // defpackage.tq
    public final void c() {
            r2 = this;
            android.content.Context r0 = r2.g0
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            android.view.LayoutInflater$Factory r1 = r0.getFactory()
            if (r1 != 0) goto L10
            r0.setFactory2(r2)
            return
        L10:
            android.view.LayoutInflater$Factory2 r2 = r0.getFactory2()
            boolean r2 = r2 instanceof defpackage.fr
            if (r2 != 0) goto L1f
            java.lang.String r2 = "AppCompatDelegate"
            java.lang.String r0 = "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's"
            android.util.Log.i(r2, r0)
        L1f:
            return
    }

    @Override // defpackage.tq
    public final void d() {
            r1 = this;
            ak7 r0 = r1.j0
            if (r0 == 0) goto L14
            r1.D()
            ak7 r0 = r1.j0
            boolean r0 = r0.k0()
            if (r0 == 0) goto L10
            goto L14
        L10:
            r0 = 0
            r1.E(r0)
        L14:
            return
    }

    @Override // defpackage.tq
    public final void f() {
            r4 = this;
            r0 = 1
            r4.J0 = r0
            r1 = 0
            r4.q(r1, r0)
            r4.A()
            java.lang.Object r1 = r4.f0
            boolean r2 = r1 instanceof android.app.Activity
            if (r2 == 0) goto L44
            android.app.Activity r1 = (android.app.Activity) r1     // Catch: java.lang.IllegalArgumentException -> L22
            android.content.ComponentName r2 = r1.getComponentName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1b java.lang.IllegalArgumentException -> L22
            java.lang.String r1 = defpackage.ej2.F(r1, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1b java.lang.IllegalArgumentException -> L22
            goto L23
        L1b:
            r1 = move-exception
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch: java.lang.IllegalArgumentException -> L22
            r2.<init>(r1)     // Catch: java.lang.IllegalArgumentException -> L22
            throw r2     // Catch: java.lang.IllegalArgumentException -> L22
        L22:
            r1 = 0
        L23:
            if (r1 == 0) goto L2f
            ak7 r1 = r4.j0
            if (r1 != 0) goto L2c
            r4.W0 = r0
            goto L2f
        L2c:
            r1.A0(r0)
        L2f:
            java.lang.Object r1 = defpackage.tq.d0
            monitor-enter(r1)
            defpackage.tq.h(r4)     // Catch: java.lang.Throwable -> L41
            zu r2 = defpackage.tq.Z     // Catch: java.lang.Throwable -> L41
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> L41
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L41
            r2.add(r3)     // Catch: java.lang.Throwable -> L41
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L41
            goto L44
        L41:
            r4 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L41
            throw r4
        L44:
            android.content.res.Configuration r1 = new android.content.res.Configuration
            android.content.Context r2 = r4.g0
            android.content.res.Resources r2 = r2.getResources()
            android.content.res.Configuration r2 = r2.getConfiguration()
            r1.<init>(r2)
            r4.M0 = r1
            r4.K0 = r0
            return
    }

    @Override // defpackage.tq
    public final void g() {
            r3 = this;
            java.lang.Object r0 = r3.f0
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L11
            java.lang.Object r0 = defpackage.tq.d0
            monitor-enter(r0)
            defpackage.tq.h(r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            goto L11
        Le:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r3
        L11:
            boolean r0 = r3.T0
            if (r0 == 0) goto L20
            android.view.Window r0 = r3.h0
            android.view.View r0 = r0.getDecorView()
            uq r1 = r3.V0
            r0.removeCallbacks(r1)
        L20:
            r0 = 1
            r3.L0 = r0
            int r0 = r3.N0
            r1 = -100
            if (r0 == r1) goto L4d
            java.lang.Object r0 = r3.f0
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L4d
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L4d
            ci6 r0 = defpackage.fr.c1
            java.lang.Object r1 = r3.f0
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.N0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L5c
        L4d:
            ci6 r0 = defpackage.fr.c1
            java.lang.Object r1 = r3.f0
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L5c:
            ak7 r0 = r3.j0
            if (r0 == 0) goto L63
            r0.q0()
        L63:
            br r0 = r3.R0
            if (r0 == 0) goto L6a
            r0.d()
        L6a:
            br r3 = r3.S0
            if (r3 == 0) goto L71
            r3.d()
        L71:
            return
    }

    @Override // defpackage.tq
    public final boolean i(int r6) {
            r5 = this;
            r0 = 8
            r1 = 109(0x6d, float:1.53E-43)
            r2 = 108(0x6c, float:1.51E-43)
            java.lang.String r3 = "AppCompatDelegate"
            if (r6 != r0) goto L11
            java.lang.String r6 = "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature."
            android.util.Log.i(r3, r6)
            r6 = r2
            goto L1b
        L11:
            r0 = 9
            if (r6 != r0) goto L1b
            java.lang.String r6 = "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature."
            android.util.Log.i(r3, r6)
            r6 = r1
        L1b:
            boolean r0 = r5.E0
            r3 = 0
            if (r0 == 0) goto L23
            if (r6 != r2) goto L23
            return r3
        L23:
            boolean r0 = r5.A0
            r4 = 1
            if (r0 == 0) goto L2c
            if (r6 != r4) goto L2c
            r5.A0 = r3
        L2c:
            if (r6 == r4) goto L61
            r0 = 2
            if (r6 == r0) goto L5b
            r0 = 5
            if (r6 == r0) goto L55
            r0 = 10
            if (r6 == r0) goto L4f
            if (r6 == r2) goto L49
            if (r6 == r1) goto L43
            android.view.Window r5 = r5.h0
            boolean r5 = r5.requestFeature(r6)
            return r5
        L43:
            r5.L()
            r5.B0 = r4
            return r4
        L49:
            r5.L()
            r5.A0 = r4
            return r4
        L4f:
            r5.L()
            r5.C0 = r4
            return r4
        L55:
            r5.L()
            r5.z0 = r4
            return r4
        L5b:
            r5.L()
            r5.y0 = r4
            return r4
        L61:
            r5.L()
            r5.E0 = r4
            return r4
    }

    @Override // defpackage.tq
    public final void k(int r3) {
            r2 = this;
            r2.z()
            android.view.ViewGroup r0 = r2.v0
            r1 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r0.findViewById(r1)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r0.removeAllViews()
            android.content.Context r1 = r2.g0
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
            r1.inflate(r3, r0)
            ar r3 = r2.i0
            android.view.Window r2 = r2.h0
            android.view.Window$Callback r2 = r2.getCallback()
            r3.a(r2)
            return
    }

    @Override // defpackage.tq
    public final void l(android.view.View r3) {
            r2 = this;
            r2.z()
            android.view.ViewGroup r0 = r2.v0
            r1 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r0.findViewById(r1)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r0.removeAllViews()
            r0.addView(r3)
            ar r3 = r2.i0
            android.view.Window r2 = r2.h0
            android.view.Window$Callback r2 = r2.getCallback()
            r3.a(r2)
            return
    }

    @Override // defpackage.tq
    public final void m(android.view.View r3, android.view.ViewGroup.LayoutParams r4) {
            r2 = this;
            r2.z()
            android.view.ViewGroup r0 = r2.v0
            r1 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r0.findViewById(r1)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r0.removeAllViews()
            r0.addView(r3, r4)
            ar r3 = r2.i0
            android.view.Window r2 = r2.h0
            android.view.Window$Callback r2 = r2.getCallback()
            r3.a(r2)
            return
    }

    @Override // defpackage.g44
    public final boolean n(defpackage.i44 r7, android.view.MenuItem r8) {
            r6 = this;
            android.view.Window r0 = r6.h0
            android.view.Window$Callback r0 = r0.getCallback()
            r1 = 0
            if (r0 == 0) goto L31
            boolean r2 = r6.L0
            if (r2 != 0) goto L31
            i44 r7 = r7.k()
            er[] r6 = r6.G0
            if (r6 == 0) goto L17
            int r2 = r6.length
            goto L18
        L17:
            r2 = r1
        L18:
            r3 = r1
        L19:
            if (r3 >= r2) goto L27
            r4 = r6[r3]
            if (r4 == 0) goto L24
            i44 r5 = r4.h
            if (r5 != r7) goto L24
            goto L28
        L24:
            int r3 = r3 + 1
            goto L19
        L27:
            r4 = 0
        L28:
            if (r4 == 0) goto L31
            int r6 = r4.a
            boolean r6 = r0.onMenuItemSelected(r6, r8)
            return r6
        L31:
            return r1
    }

    @Override // defpackage.tq
    public final void o(java.lang.CharSequence r2) {
            r1 = this;
            r1.l0 = r2
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = r1.m0
            if (r0 == 0) goto La
            r0.setWindowTitle(r2)
            return
        La:
            ak7 r0 = r1.j0
            if (r0 == 0) goto L12
            r0.E0(r2)
            return
        L12:
            android.widget.TextView r1 = r1.w0
            if (r1 == 0) goto L19
            r1.setText(r2)
        L19:
            return
    }

    @Override // android.view.LayoutInflater.Factory2
    public final android.view.View onCreateView(android.view.View r9, java.lang.String r10, android.content.Context r11, android.util.AttributeSet r12) {
            r8 = this;
            ys r9 = r8.Z0
            r1 = 0
            if (r9 != 0) goto L56
            int[] r9 = defpackage.m75.j
            android.content.Context r0 = r8.g0
            android.content.res.TypedArray r9 = r0.obtainStyledAttributes(r9)
            r2 = 116(0x74, float:1.63E-43)
            java.lang.String r2 = r9.getString(r2)
            r9.recycle()
            if (r2 != 0) goto L20
            ys r9 = new ys
            r9.<init>()
            r8.Z0 = r9
            goto L56
        L20:
            java.lang.ClassLoader r9 = r0.getClassLoader()     // Catch: java.lang.Throwable -> L35
            java.lang.Class r9 = r9.loadClass(r2)     // Catch: java.lang.Throwable -> L35
            java.lang.reflect.Constructor r9 = r9.getDeclaredConstructor(r1)     // Catch: java.lang.Throwable -> L35
            java.lang.Object r9 = r9.newInstance(r1)     // Catch: java.lang.Throwable -> L35
            ys r9 = (defpackage.ys) r9     // Catch: java.lang.Throwable -> L35
            r8.Z0 = r9     // Catch: java.lang.Throwable -> L35
            goto L56
        L35:
            r0 = move-exception
            r9 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "Failed to instantiate custom view inflater "
            r0.<init>(r3)
            r0.append(r2)
            java.lang.String r2 = ". Falling back to default."
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "AppCompatDelegate"
            android.util.Log.i(r2, r0, r9)
            ys r9 = new ys
            r9.<init>()
            r8.Z0 = r9
        L56:
            ys r8 = r8.Z0
            int r9 = defpackage.cl7.a
            r8.getClass()
            int[] r9 = defpackage.m75.z
            r5 = 0
            android.content.res.TypedArray r9 = r11.obtainStyledAttributes(r12, r9, r5, r5)
            r0 = 4
            int r2 = r9.getResourceId(r0, r5)
            if (r2 == 0) goto L72
            java.lang.String r3 = "AppCompatViewInflater"
            java.lang.String r4 = "app:theme is now deprecated. Please move to using android:theme instead."
            android.util.Log.i(r3, r4)
        L72:
            r9.recycle()
            if (r2 == 0) goto L88
            boolean r9 = r11 instanceof defpackage.p41
            if (r9 == 0) goto L82
            r9 = r11
            p41 r9 = (defpackage.p41) r9
            int r9 = r9.A
            if (r9 == r2) goto L88
        L82:
            p41 r9 = new p41
            r9.<init>(r11, r2)
            goto L89
        L88:
            r9 = r11
        L89:
            r10.getClass()
            int r2 = r10.hashCode()
            r3 = 3
            r4 = 1
            r6 = -1
            switch(r2) {
                case -1946472170: goto L135;
                case -1455429095: goto L129;
                case -1346021293: goto L11d;
                case -938935918: goto L111;
                case -937446323: goto L108;
                case -658531749: goto Lfd;
                case -339785223: goto Lf2;
                case 776382189: goto Le7;
                case 799298502: goto Lda;
                case 1125864064: goto Lcd;
                case 1413872058: goto Lc0;
                case 1601505219: goto Lb3;
                case 1666676343: goto La6;
                case 2001146706: goto L99;
                default: goto L96;
            }
        L96:
            r0 = r6
            goto L140
        L99:
            java.lang.String r0 = "Button"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto La2
            goto L96
        La2:
            r0 = 13
            goto L140
        La6:
            java.lang.String r0 = "EditText"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto Laf
            goto L96
        Laf:
            r0 = 12
            goto L140
        Lb3:
            java.lang.String r0 = "CheckBox"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto Lbc
            goto L96
        Lbc:
            r0 = 11
            goto L140
        Lc0:
            java.lang.String r0 = "AutoCompleteTextView"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto Lc9
            goto L96
        Lc9:
            r0 = 10
            goto L140
        Lcd:
            java.lang.String r0 = "ImageView"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto Ld6
            goto L96
        Ld6:
            r0 = 9
            goto L140
        Lda:
            java.lang.String r0 = "ToggleButton"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto Le3
            goto L96
        Le3:
            r0 = 8
            goto L140
        Le7:
            java.lang.String r0 = "RadioButton"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto Lf0
            goto L96
        Lf0:
            r0 = 7
            goto L140
        Lf2:
            java.lang.String r0 = "Spinner"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto Lfb
            goto L96
        Lfb:
            r0 = 6
            goto L140
        Lfd:
            java.lang.String r0 = "SeekBar"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L106
            goto L96
        L106:
            r0 = 5
            goto L140
        L108:
            java.lang.String r2 = "ImageButton"
            boolean r2 = r10.equals(r2)
            if (r2 != 0) goto L140
            goto L96
        L111:
            java.lang.String r0 = "TextView"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L11b
            goto L96
        L11b:
            r0 = r3
            goto L140
        L11d:
            java.lang.String r0 = "MultiAutoCompleteTextView"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L127
            goto L96
        L127:
            r0 = 2
            goto L140
        L129:
            java.lang.String r0 = "CheckedTextView"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L133
            goto L96
        L133:
            r0 = r4
            goto L140
        L135:
            java.lang.String r0 = "RatingBar"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L13f
            goto L96
        L13f:
            r0 = 0
        L140:
            switch(r0) {
                case 0: goto L191;
                case 1: goto L18b;
                case 2: goto L185;
                case 3: goto L180;
                case 4: goto L177;
                case 5: goto L171;
                case 6: goto L16b;
                case 7: goto L166;
                case 8: goto L160;
                case 9: goto L15a;
                case 10: goto L155;
                case 11: goto L150;
                case 12: goto L14a;
                case 13: goto L145;
                default: goto L143;
            }
        L143:
            r0 = r1
            goto L196
        L145:
            lq r0 = r8.b(r9, r12)
            goto L196
        L14a:
            kr r0 = new kr
            r0.<init>(r9, r12)
            goto L196
        L150:
            nq r0 = r8.c(r9, r12)
            goto L196
        L155:
            kq r0 = r8.a(r9, r12)
            goto L196
        L15a:
            nr r0 = new nr
            r0.<init>(r9, r12, r5)
            goto L196
        L160:
            ws r0 = new ws
            r0.<init>(r9, r12)
            goto L196
        L166:
            qr r0 = r8.d(r9, r12)
            goto L196
        L16b:
            fs r0 = new fs
            r0.<init>(r9, r12)
            goto L196
        L171:
            tr r0 = new tr
            r0.<init>(r9, r12)
            goto L196
        L177:
            mr r0 = new mr
            r2 = 2130969254(0x7f0402a6, float:1.7547185E38)
            r0.<init>(r9, r12, r2)
            goto L196
        L180:
            qs r0 = r8.e(r9, r12)
            goto L196
        L185:
            or r0 = new or
            r0.<init>(r9, r12)
            goto L196
        L18b:
            oq r0 = new oq
            r0.<init>(r9, r12)
            goto L196
        L191:
            rr r0 = new rr
            r0.<init>(r9, r12)
        L196:
            if (r0 != 0) goto L1e8
            if (r11 == r9) goto L1e8
            java.lang.Object[] r11 = r8.a
            java.lang.String r0 = "view"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L1aa
            java.lang.String r10 = "class"
            java.lang.String r10 = r12.getAttributeValue(r1, r10)
        L1aa:
            r11[r5] = r9     // Catch: java.lang.Throwable -> L1cc java.lang.Exception -> L1e3
            r11[r4] = r12     // Catch: java.lang.Throwable -> L1cc java.lang.Exception -> L1e3
            r0 = 46
            int r0 = r10.indexOf(r0)     // Catch: java.lang.Throwable -> L1cc java.lang.Exception -> L1e3
            if (r6 != r0) goto L1d4
            r0 = r5
        L1b7:
            java.lang.String[] r2 = defpackage.ys.g     // Catch: java.lang.Throwable -> L1cc java.lang.Exception -> L1e3
            if (r0 >= r3) goto L1cf
            r2 = r2[r0]     // Catch: java.lang.Throwable -> L1cc java.lang.Exception -> L1e3
            android.view.View r2 = r8.f(r9, r10, r2)     // Catch: java.lang.Throwable -> L1cc java.lang.Exception -> L1e3
            if (r2 == 0) goto L1c9
            r11[r5] = r1
            r11[r4] = r1
            r1 = r2
            goto L1e7
        L1c9:
            int r0 = r0 + 1
            goto L1b7
        L1cc:
            r0 = move-exception
            r8 = r0
            goto L1de
        L1cf:
            r11[r5] = r1
            r11[r4] = r1
            goto L1e7
        L1d4:
            android.view.View r8 = r8.f(r9, r10, r1)     // Catch: java.lang.Throwable -> L1cc java.lang.Exception -> L1e3
            r11[r5] = r1
            r11[r4] = r1
            r1 = r8
            goto L1e7
        L1de:
            r11[r5] = r1
            r11[r4] = r1
            throw r8
        L1e3:
            r11[r5] = r1
            r11[r4] = r1
        L1e7:
            r0 = r1
        L1e8:
            if (r0 == 0) goto L279
            android.content.Context r8 = r0.getContext()
            boolean r10 = r8 instanceof android.content.ContextWrapper
            if (r10 == 0) goto L210
            boolean r10 = r0.hasOnClickListeners()
            if (r10 != 0) goto L1f9
            goto L210
        L1f9:
            int[] r10 = defpackage.ys.c
            android.content.res.TypedArray r8 = r8.obtainStyledAttributes(r12, r10)
            java.lang.String r10 = r8.getString(r5)
            if (r10 == 0) goto L20d
            xs r11 = new xs
            r11.<init>(r0, r10)
            r0.setOnClickListener(r11)
        L20d:
            r8.recycle()
        L210:
            int r8 = android.os.Build.VERSION.SDK_INT
            r6 = 28
            if (r8 <= r6) goto L217
            goto L279
        L217:
            int[] r8 = defpackage.ys.d
            android.content.res.TypedArray r8 = r9.obtainStyledAttributes(r12, r8)
            boolean r10 = r8.hasValue(r5)
            java.lang.Class<java.lang.Boolean> r4 = java.lang.Boolean.class
            if (r10 == 0) goto L23b
            boolean r10 = r8.getBoolean(r5, r5)
            java.util.WeakHashMap r11 = defpackage.ao7.a
            on7 r2 = new on7
            r3 = 2131427944(0x7f0b0268, float:1.8477519E38)
            r7 = 3
            r2.<init>(r3, r4, r5, r6, r7)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r2.f(r0, r10)
        L23b:
            r8.recycle()
            int[] r8 = defpackage.ys.e
            android.content.res.TypedArray r8 = r9.obtainStyledAttributes(r12, r8)
            boolean r10 = r8.hasValue(r5)
            if (r10 == 0) goto L251
            java.lang.String r10 = r8.getString(r5)
            defpackage.ao7.o(r0, r10)
        L251:
            r8.recycle()
            int[] r8 = defpackage.ys.f
            android.content.res.TypedArray r8 = r9.obtainStyledAttributes(r12, r8)
            boolean r9 = r8.hasValue(r5)
            if (r9 == 0) goto L276
            boolean r9 = r8.getBoolean(r5, r5)
            java.util.WeakHashMap r10 = defpackage.ao7.a
            on7 r2 = new on7
            r3 = 2131427950(0x7f0b026e, float:1.847753E38)
            r7 = 0
            r2.<init>(r3, r4, r5, r6, r7)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            r2.f(r0, r9)
        L276:
            r8.recycle()
        L279:
            return r0
    }

    @Override // android.view.LayoutInflater.Factory
    public final android.view.View onCreateView(java.lang.String r2, android.content.Context r3, android.util.AttributeSet r4) {
            r1 = this;
            r0 = 0
            android.view.View r1 = r1.onCreateView(r0, r2, r3, r4)
            return r1
    }

    public final boolean q(boolean r14, boolean r15) {
            r13 = this;
            boolean r0 = r13.L0
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            r0 = -100
            int r2 = r13.N0
            if (r2 == r0) goto Ld
            goto Lf
        Ld:
            int r2 = defpackage.tq.B
        Lf:
            android.content.Context r0 = r13.g0
            int r3 = r13.F(r0, r2)
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 33
            r6 = 0
            if (r4 >= r5) goto L21
            hy3 r5 = s(r0)
            goto L22
        L21:
            r5 = r6
        L22:
            if (r15 != 0) goto L32
            if (r5 == 0) goto L32
            android.content.res.Resources r15 = r0.getResources()
            android.content.res.Configuration r15 = r15.getConfiguration()
            hy3 r5 = defpackage.yq.b(r15)
        L32:
            android.content.res.Configuration r15 = w(r0, r3, r5, r6, r1)
            boolean r3 = r13.Q0
            r7 = 1
            java.lang.Object r8 = r13.f0
            if (r3 != 0) goto L70
            boolean r3 = r8 instanceof android.app.Activity
            if (r3 == 0) goto L70
            android.content.pm.PackageManager r3 = r0.getPackageManager()
            if (r3 != 0) goto L49
            r3 = r1
            goto L74
        L49:
            r9 = 29
            if (r4 < r9) goto L50
            r4 = 269221888(0x100c0000, float:2.7610132E-29)
            goto L52
        L50:
            r4 = 786432(0xc0000, float:1.102026E-39)
        L52:
            android.content.ComponentName r9 = new android.content.ComponentName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L66
            java.lang.Class r10 = r8.getClass()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L66
            r9.<init>(r0, r10)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L66
            android.content.pm.ActivityInfo r3 = r3.getActivityInfo(r9, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L66
            if (r3 == 0) goto L70
            int r3 = r3.configChanges     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L66
            r13.P0 = r3     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L66
            goto L70
        L66:
            r3 = move-exception
            java.lang.String r4 = "AppCompatDelegate"
            java.lang.String r9 = "Exception while getting ActivityInfo"
            android.util.Log.d(r4, r9, r3)
            r13.P0 = r1
        L70:
            r13.Q0 = r7
            int r3 = r13.P0
        L74:
            android.content.res.Configuration r4 = r13.M0
            if (r4 != 0) goto L80
            android.content.res.Resources r4 = r0.getResources()
            android.content.res.Configuration r4 = r4.getConfiguration()
        L80:
            int r9 = r4.uiMode
            r9 = r9 & 48
            int r10 = r15.uiMode
            r10 = r10 & 48
            hy3 r4 = defpackage.yq.b(r4)
            if (r5 != 0) goto L90
            r5 = r6
            goto L94
        L90:
            hy3 r5 = defpackage.yq.b(r15)
        L94:
            if (r9 == r10) goto L99
            r9 = 512(0x200, float:7.17E-43)
            goto L9a
        L99:
            r9 = r1
        L9a:
            if (r5 == 0) goto La4
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto La4
            r9 = r9 | 8196(0x2004, float:1.1485E-41)
        La4:
            int r4 = ~r3
            r4 = r4 & r9
            r11 = 28
            if (r4 == 0) goto Lf7
            if (r14 == 0) goto Lf7
            boolean r14 = r13.J0
            if (r14 == 0) goto Lf7
            boolean r14 = defpackage.fr.e1
            if (r14 != 0) goto Lb8
            boolean r14 = r13.K0
            if (r14 == 0) goto Lf7
        Lb8:
            boolean r14 = r8 instanceof android.app.Activity
            if (r14 == 0) goto Lf7
            r14 = r8
            android.app.Activity r14 = (android.app.Activity) r14
            boolean r4 = r14.isChild()
            if (r4 != 0) goto Lf7
            int r4 = android.os.Build.VERSION.SDK_INT
            r12 = 31
            if (r4 < r12) goto Lde
            r12 = r9 & 8192(0x2000, float:1.148E-41)
            if (r12 == 0) goto Lde
            android.view.Window r12 = r14.getWindow()
            android.view.View r12 = r12.getDecorView()
            int r15 = r15.getLayoutDirection()
            r12.setLayoutDirection(r15)
        Lde:
            if (r4 < r11) goto Le4
            r14.recreate()
            goto Lf5
        Le4:
            android.os.Handler r15 = new android.os.Handler
            android.os.Looper r4 = r14.getMainLooper()
            r15.<init>(r4)
            n0 r4 = new n0
            r4.<init>(r14, r7)
            r15.post(r4)
        Lf5:
            r14 = r7
            goto Lf8
        Lf7:
            r14 = r1
        Lf8:
            if (r14 != 0) goto L214
            if (r9 == 0) goto L214
            r14 = r9 & r3
            if (r14 != r9) goto L101
            r1 = r7
        L101:
            android.content.res.Resources r14 = r0.getResources()
            android.content.res.Configuration r15 = new android.content.res.Configuration
            android.content.res.Configuration r3 = r14.getConfiguration()
            r15.<init>(r3)
            android.content.res.Configuration r3 = r14.getConfiguration()
            int r3 = r3.uiMode
            r3 = r3 & (-49)
            r3 = r3 | r10
            r15.uiMode = r3
            if (r5 == 0) goto L11e
            defpackage.yq.d(r15, r5)
        L11e:
            r14.updateConfiguration(r15, r6)
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 26
            if (r3 >= r4) goto L1d5
            if (r3 < r11) goto L12b
            goto L1d5
        L12b:
            boolean r3 = defpackage.hi2.l
            java.lang.String r4 = "ResourcesFlusher"
            if (r3 != 0) goto L147
            java.lang.Class<android.content.res.Resources> r3 = android.content.res.Resources.class
            java.lang.String r9 = "mResourcesImpl"
            java.lang.reflect.Field r3 = r3.getDeclaredField(r9)     // Catch: java.lang.NoSuchFieldException -> L13f
            defpackage.hi2.k = r3     // Catch: java.lang.NoSuchFieldException -> L13f
            r3.setAccessible(r7)     // Catch: java.lang.NoSuchFieldException -> L13f
            goto L145
        L13f:
            r3 = move-exception
            java.lang.String r9 = "Could not retrieve Resources#mResourcesImpl field"
            android.util.Log.e(r4, r9, r3)
        L145:
            defpackage.hi2.l = r7
        L147:
            java.lang.reflect.Field r3 = defpackage.hi2.k
            if (r3 != 0) goto L14d
            goto L1d5
        L14d:
            java.lang.Object r14 = r3.get(r14)     // Catch: java.lang.IllegalAccessException -> L152
            goto L159
        L152:
            r14 = move-exception
            java.lang.String r3 = "Could not retrieve value from Resources#mResourcesImpl"
            android.util.Log.e(r4, r3, r14)
            r14 = r6
        L159:
            if (r14 != 0) goto L15d
            goto L1d5
        L15d:
            boolean r3 = defpackage.hi2.f
            if (r3 != 0) goto L179
            java.lang.Class r3 = r14.getClass()     // Catch: java.lang.NoSuchFieldException -> L171
            java.lang.String r9 = "mDrawableCache"
            java.lang.reflect.Field r3 = r3.getDeclaredField(r9)     // Catch: java.lang.NoSuchFieldException -> L171
            defpackage.hi2.e = r3     // Catch: java.lang.NoSuchFieldException -> L171
            r3.setAccessible(r7)     // Catch: java.lang.NoSuchFieldException -> L171
            goto L177
        L171:
            r3 = move-exception
            java.lang.String r9 = "Could not retrieve ResourcesImpl#mDrawableCache field"
            android.util.Log.e(r4, r9, r3)
        L177:
            defpackage.hi2.f = r7
        L179:
            java.lang.reflect.Field r3 = defpackage.hi2.e
            if (r3 == 0) goto L188
            java.lang.Object r14 = r3.get(r14)     // Catch: java.lang.IllegalAccessException -> L182
            goto L189
        L182:
            r14 = move-exception
            java.lang.String r3 = "Could not retrieve value from ResourcesImpl#mDrawableCache"
            android.util.Log.e(r4, r3, r14)
        L188:
            r14 = r6
        L189:
            if (r14 == 0) goto L1d5
            boolean r3 = defpackage.hi2.h
            if (r3 != 0) goto L1a0
            java.lang.String r3 = "android.content.res.ThemedResourceCache"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.ClassNotFoundException -> L198
            defpackage.hi2.g = r3     // Catch: java.lang.ClassNotFoundException -> L198
            goto L19e
        L198:
            r3 = move-exception
            java.lang.String r9 = "Could not find ThemedResourceCache class"
            android.util.Log.e(r4, r9, r3)
        L19e:
            defpackage.hi2.h = r7
        L1a0:
            java.lang.Class r3 = defpackage.hi2.g
            if (r3 != 0) goto L1a5
            goto L1d5
        L1a5:
            boolean r9 = defpackage.hi2.j
            if (r9 != 0) goto L1bd
            java.lang.String r9 = "mUnthemedEntries"
            java.lang.reflect.Field r3 = r3.getDeclaredField(r9)     // Catch: java.lang.NoSuchFieldException -> L1b5
            defpackage.hi2.i = r3     // Catch: java.lang.NoSuchFieldException -> L1b5
            r3.setAccessible(r7)     // Catch: java.lang.NoSuchFieldException -> L1b5
            goto L1bb
        L1b5:
            r3 = move-exception
            java.lang.String r9 = "Could not retrieve ThemedResourceCache#mUnthemedEntries field"
            android.util.Log.e(r4, r9, r3)
        L1bb:
            defpackage.hi2.j = r7
        L1bd:
            java.lang.reflect.Field r3 = defpackage.hi2.i
            if (r3 != 0) goto L1c2
            goto L1d5
        L1c2:
            java.lang.Object r14 = r3.get(r14)     // Catch: java.lang.IllegalAccessException -> L1ca
            android.util.LongSparseArray r14 = (android.util.LongSparseArray) r14     // Catch: java.lang.IllegalAccessException -> L1ca
            r6 = r14
            goto L1d0
        L1ca:
            r14 = move-exception
            java.lang.String r3 = "Could not retrieve value from ThemedResourceCache#mUnthemedEntries"
            android.util.Log.e(r4, r3, r14)
        L1d0:
            if (r6 == 0) goto L1d5
            r6.clear()
        L1d5:
            int r14 = r13.O0
            if (r14 == 0) goto L1e5
            r0.setTheme(r14)
            android.content.res.Resources$Theme r14 = r0.getTheme()
            int r3 = r13.O0
            r14.applyStyle(r3, r7)
        L1e5:
            if (r1 == 0) goto L215
            boolean r14 = r8 instanceof android.app.Activity
            if (r14 == 0) goto L215
            android.app.Activity r8 = (android.app.Activity) r8
            boolean r14 = r8 instanceof defpackage.hu3
            if (r14 == 0) goto L208
            r14 = r8
            hu3 r14 = (defpackage.hu3) r14
            ut3 r14 = r14.getLifecycle()
            tt3 r14 = r14.b()
            tt3 r1 = defpackage.tt3.CREATED
            boolean r14 = r14.isAtLeast(r1)
            if (r14 == 0) goto L215
            r8.onConfigurationChanged(r15)
            goto L215
        L208:
            boolean r14 = r13.K0
            if (r14 == 0) goto L215
            boolean r14 = r13.L0
            if (r14 != 0) goto L215
            r8.onConfigurationChanged(r15)
            goto L215
        L214:
            r7 = r14
        L215:
            if (r5 == 0) goto L226
            android.content.res.Resources r14 = r0.getResources()
            android.content.res.Configuration r14 = r14.getConfiguration()
            hy3 r14 = defpackage.yq.b(r14)
            defpackage.yq.c(r14)
        L226:
            if (r2 != 0) goto L230
            d2 r14 = r13.B(r0)
            r14.r()
            goto L237
        L230:
            br r14 = r13.R0
            if (r14 == 0) goto L237
            r14.d()
        L237:
            br r14 = r13.S0
            r15 = 3
            if (r2 != r15) goto L24b
            if (r14 != 0) goto L245
            br r14 = new br
            r14.<init>(r13, r0)
            r13.S0 = r14
        L245:
            br r13 = r13.S0
            r13.r()
            goto L250
        L24b:
            if (r14 == 0) goto L250
            r14.d()
        L250:
            return r7
    }

    public final void r(android.view.Window r8) {
            r7 = this;
            java.lang.String r0 = "AppCompat has already installed itself into the Window"
            android.view.Window r1 = r7.h0
            if (r1 != 0) goto L7e
            android.view.Window$Callback r1 = r8.getCallback()
            boolean r2 = r1 instanceof defpackage.ar
            if (r2 != 0) goto L7a
            ar r0 = new ar
            r0.<init>(r7, r1)
            r7.i0 = r0
            r8.setCallback(r0)
            android.content.Context r0 = r7.g0
            int[] r1 = defpackage.fr.d1
            r2 = 0
            android.content.res.TypedArray r1 = r0.obtainStyledAttributes(r2, r1)
            r3 = 0
            boolean r4 = r1.hasValue(r3)
            if (r4 == 0) goto L3f
            int r3 = r1.getResourceId(r3, r3)
            if (r3 == 0) goto L3f
            ir r4 = defpackage.ir.a()
            monitor-enter(r4)
            ol5 r5 = r4.a     // Catch: java.lang.Throwable -> L3c
            r6 = 1
            android.graphics.drawable.Drawable r0 = r5.d(r0, r3, r6)     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r4)
            goto L40
        L3c:
            r7 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L3c
            throw r7
        L3f:
            r0 = r2
        L40:
            if (r0 == 0) goto L45
            r8.setBackgroundDrawable(r0)
        L45:
            r1.recycle()
            r7.h0 = r8
            int r8 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            if (r8 < r0) goto L79
            android.window.OnBackInvokedDispatcher r8 = r7.a1
            if (r8 != 0) goto L79
            java.lang.Object r0 = r7.f0
            if (r8 == 0) goto L61
            android.window.OnBackInvokedCallback r1 = r7.b1
            if (r1 == 0) goto L61
            defpackage.zq.c(r8, r1)
            r7.b1 = r2
        L61:
            boolean r8 = r0 instanceof android.app.Activity
            if (r8 == 0) goto L74
            android.app.Activity r0 = (android.app.Activity) r0
            android.view.Window r8 = r0.getWindow()
            if (r8 == 0) goto L74
            android.window.OnBackInvokedDispatcher r8 = defpackage.zq.a(r0)
            r7.a1 = r8
            goto L76
        L74:
            r7.a1 = r2
        L76:
            r7.M()
        L79:
            return
        L7a:
            defpackage.i.m(r0)
            return
        L7e:
            defpackage.i.m(r0)
            return
    }

    public final void t(int r3, defpackage.er r4, defpackage.i44 r5) {
            r2 = this;
            if (r5 != 0) goto L11
            if (r4 != 0) goto Ld
            if (r3 < 0) goto Ld
            er[] r0 = r2.G0
            int r1 = r0.length
            if (r3 >= r1) goto Ld
            r4 = r0[r3]
        Ld:
            if (r4 == 0) goto L11
            i44 r5 = r4.h
        L11:
            if (r4 == 0) goto L18
            boolean r4 = r4.m
            if (r4 != 0) goto L18
            goto L35
        L18:
            boolean r4 = r2.L0
            if (r4 != 0) goto L35
            ar r4 = r2.i0
            android.view.Window r2 = r2.h0
            android.view.Window$Callback r2 = r2.getCallback()
            r4.getClass()
            r0 = 1
            r1 = 0
            r4.X = r0     // Catch: java.lang.Throwable -> L31
            r2.onPanelClosed(r3, r5)     // Catch: java.lang.Throwable -> L31
            r4.X = r1
            return
        L31:
            r2 = move-exception
            r4.X = r1
            throw r2
        L35:
            return
    }

    public final void u(defpackage.i44 r3) {
            r2 = this;
            boolean r0 = r2.F0
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r2.F0 = r0
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = r2.m0
            r0.k()
            tc1 r0 = r0.d0
            l87 r0 = (defpackage.l87) r0
            androidx.appcompat.widget.Toolbar r0 = r0.a
            androidx.appcompat.widget.ActionMenuView r0 = r0.A
            if (r0 == 0) goto L2d
            g8 r0 = r0.s0
            if (r0 == 0) goto L2d
            r0.e()
            d8 r0 = r0.p0
            if (r0 == 0) goto L2d
            boolean r1 = r0.b()
            if (r1 == 0) goto L2d
            t44 r0 = r0.i
            r0.dismiss()
        L2d:
            android.view.Window r0 = r2.h0
            android.view.Window$Callback r0 = r0.getCallback()
            if (r0 == 0) goto L3e
            boolean r1 = r2.L0
            if (r1 != 0) goto L3e
            r1 = 108(0x6c, float:1.51E-43)
            r0.onPanelClosed(r1, r3)
        L3e:
            r3 = 0
            r2.F0 = r3
            return
    }

    public final void v(defpackage.er r4, boolean r5) {
            r3 = this;
            if (r5 == 0) goto L1f
            int r0 = r4.a
            if (r0 != 0) goto L1f
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = r3.m0
            if (r0 == 0) goto L1f
            r0.k()
            tc1 r0 = r0.d0
            l87 r0 = (defpackage.l87) r0
            androidx.appcompat.widget.Toolbar r0 = r0.a
            boolean r0 = r0.q()
            if (r0 == 0) goto L1f
            i44 r4 = r4.h
            r3.u(r4)
            return
        L1f:
            android.content.Context r0 = r3.g0
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            r1 = 0
            if (r0 == 0) goto L3e
            boolean r2 = r4.m
            if (r2 == 0) goto L3e
            dr r2 = r4.e
            if (r2 == 0) goto L3e
            r0.removeView(r2)
            if (r5 == 0) goto L3e
            int r5 = r4.a
            r3.t(r5, r4, r1)
        L3e:
            r5 = 0
            r4.k = r5
            r4.l = r5
            r4.m = r5
            r4.f = r1
            r5 = 1
            r4.n = r5
            er r5 = r3.H0
            if (r5 != r4) goto L50
            r3.H0 = r1
        L50:
            int r4 = r4.a
            if (r4 != 0) goto L57
            r3.M()
        L57:
            return
    }

    public final boolean x(android.view.KeyEvent r7) {
            r6 = this;
            java.lang.Object r0 = r6.f0
            boolean r1 = r0 instanceof defpackage.xg3
            r2 = 1
            if (r1 != 0) goto Lb
            boolean r0 = r0 instanceof defpackage.hr
            if (r0 == 0) goto L1b
        Lb:
            android.view.Window r0 = r6.h0
            android.view.View r0 = r0.getDecorView()
            if (r0 == 0) goto L1b
            boolean r0 = defpackage.uj2.v(r0, r7)
            if (r0 == 0) goto L1b
            goto L133
        L1b:
            int r0 = r7.getKeyCode()
            r1 = 0
            r3 = 82
            if (r0 != r3) goto L3f
            ar r0 = r6.i0
            android.view.Window r4 = r6.h0
            android.view.Window$Callback r4 = r4.getCallback()
            r0.getClass()
            r0.R = r2     // Catch: java.lang.Throwable -> L3b
            boolean r4 = r4.dispatchKeyEvent(r7)     // Catch: java.lang.Throwable -> L3b
            r0.R = r1
            if (r4 == 0) goto L3f
            goto L133
        L3b:
            r6 = move-exception
            r0.R = r1
            throw r6
        L3f:
            int r0 = r7.getKeyCode()
            int r4 = r7.getAction()
            r5 = 4
            if (r4 != 0) goto L6f
            if (r0 == r5) goto L62
            if (r0 == r3) goto L50
            goto L134
        L50:
            int r0 = r7.getRepeatCount()
            if (r0 != 0) goto L133
            er r0 = r6.C(r1)
            boolean r1 = r0.m
            if (r1 != 0) goto L133
            r6.K(r0, r7)
            return r2
        L62:
            int r7 = r7.getFlags()
            r7 = r7 & 128(0x80, float:1.8E-43)
            if (r7 == 0) goto L6b
            goto L6c
        L6b:
            r2 = r1
        L6c:
            r6.I0 = r2
            return r1
        L6f:
            if (r0 == r5) goto L12d
            if (r0 == r3) goto L75
            goto L134
        L75:
            k8 r0 = r6.p0
            if (r0 == 0) goto L7b
            goto L133
        L7b:
            er r0 = r6.C(r1)
            androidx.appcompat.widget.ActionBarOverlayLayout r3 = r6.m0
            android.content.Context r4 = r6.g0
            if (r3 == 0) goto Leb
            r3.k()
            tc1 r3 = r3.d0
            l87 r3 = (defpackage.l87) r3
            androidx.appcompat.widget.Toolbar r3 = r3.a
            int r5 = r3.getVisibility()
            if (r5 != 0) goto Leb
            androidx.appcompat.widget.ActionMenuView r3 = r3.A
            if (r3 == 0) goto Leb
            boolean r3 = r3.r0
            if (r3 == 0) goto Leb
            android.view.ViewConfiguration r3 = android.view.ViewConfiguration.get(r4)
            boolean r3 = r3.hasPermanentMenuKey()
            if (r3 != 0) goto Leb
            androidx.appcompat.widget.ActionBarOverlayLayout r3 = r6.m0
            r3.k()
            tc1 r3 = r3.d0
            l87 r3 = (defpackage.l87) r3
            androidx.appcompat.widget.Toolbar r3 = r3.a
            boolean r3 = r3.q()
            if (r3 != 0) goto Ld1
            boolean r3 = r6.L0
            if (r3 != 0) goto L10b
            boolean r7 = r6.K(r0, r7)
            if (r7 == 0) goto L10b
            androidx.appcompat.widget.ActionBarOverlayLayout r6 = r6.m0
            r6.k()
            tc1 r6 = r6.d0
            l87 r6 = (defpackage.l87) r6
            androidx.appcompat.widget.Toolbar r6 = r6.a
            boolean r6 = r6.w()
            goto L111
        Ld1:
            androidx.appcompat.widget.ActionBarOverlayLayout r6 = r6.m0
            r6.k()
            tc1 r6 = r6.d0
            l87 r6 = (defpackage.l87) r6
            androidx.appcompat.widget.Toolbar r6 = r6.a
            androidx.appcompat.widget.ActionMenuView r6 = r6.A
            if (r6 == 0) goto L10b
            g8 r6 = r6.s0
            if (r6 == 0) goto L10b
            boolean r6 = r6.e()
            if (r6 == 0) goto L10b
            goto L109
        Leb:
            boolean r3 = r0.m
            if (r3 != 0) goto L10d
            boolean r5 = r0.l
            if (r5 == 0) goto Lf4
            goto L10d
        Lf4:
            boolean r3 = r0.k
            if (r3 == 0) goto L10b
            boolean r3 = r0.o
            if (r3 == 0) goto L103
            r0.k = r1
            boolean r3 = r6.K(r0, r7)
            goto L104
        L103:
            r3 = r2
        L104:
            if (r3 == 0) goto L10b
            r6.I(r0, r7)
        L109:
            r6 = r2
            goto L111
        L10b:
            r6 = r1
            goto L111
        L10d:
            r6.v(r0, r2)
            r6 = r3
        L111:
            if (r6 == 0) goto L133
            android.content.Context r6 = r4.getApplicationContext()
            java.lang.String r7 = "audio"
            java.lang.Object r6 = r6.getSystemService(r7)
            android.media.AudioManager r6 = (android.media.AudioManager) r6
            if (r6 == 0) goto L125
            r6.playSoundEffect(r1)
            return r2
        L125:
            java.lang.String r6 = "AppCompatDelegate"
            java.lang.String r7 = "Couldn't get audio manager"
            android.util.Log.w(r6, r7)
            return r2
        L12d:
            boolean r6 = r6.G()
            if (r6 == 0) goto L134
        L133:
            return r2
        L134:
            return r1
    }

    public final void y(int r4) {
            r3 = this;
            er r0 = r3.C(r4)
            i44 r1 = r0.h
            if (r1 == 0) goto L24
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            i44 r2 = r0.h
            r2.t(r1)
            int r2 = r1.size()
            if (r2 <= 0) goto L1a
            r0.p = r1
        L1a:
            i44 r1 = r0.h
            r1.w()
            i44 r1 = r0.h
            r1.clear()
        L24:
            r1 = 1
            r0.o = r1
            r0.n = r1
            r0 = 108(0x6c, float:1.51E-43)
            if (r4 == r0) goto L2f
            if (r4 != 0) goto L3e
        L2f:
            androidx.appcompat.widget.ActionBarOverlayLayout r4 = r3.m0
            if (r4 == 0) goto L3e
            r4 = 0
            er r0 = r3.C(r4)
            r0.k = r4
            r4 = 0
            r3.K(r0, r4)
        L3e:
            return
    }

    public final void z() {
            r11 = this;
            boolean r0 = r11.u0
            if (r0 != 0) goto L281
            android.content.Context r0 = r11.g0
            int[] r1 = defpackage.m75.j
            android.content.res.TypedArray r2 = r0.obtainStyledAttributes(r1)
            r3 = 117(0x75, float:1.64E-43)
            boolean r4 = r2.hasValue(r3)
            if (r4 == 0) goto L279
            r4 = 126(0x7e, float:1.77E-43)
            r5 = 0
            boolean r4 = r2.getBoolean(r4, r5)
            r6 = 108(0x6c, float:1.51E-43)
            r7 = 1
            if (r4 == 0) goto L24
            r11.i(r7)
            goto L2d
        L24:
            boolean r3 = r2.getBoolean(r3, r5)
            if (r3 == 0) goto L2d
            r11.i(r6)
        L2d:
            r3 = 118(0x76, float:1.65E-43)
            boolean r3 = r2.getBoolean(r3, r5)
            r4 = 109(0x6d, float:1.53E-43)
            if (r3 == 0) goto L3a
            r11.i(r4)
        L3a:
            r3 = 119(0x77, float:1.67E-43)
            boolean r3 = r2.getBoolean(r3, r5)
            if (r3 == 0) goto L47
            r3 = 10
            r11.i(r3)
        L47:
            boolean r3 = r2.getBoolean(r5, r5)
            r11.D0 = r3
            r2.recycle()
            r11.A()
            android.view.Window r2 = r11.h0
            r2.getDecorView()
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r0)
            boolean r3 = r11.E0
            r8 = 0
            if (r3 != 0) goto Ld5
            boolean r3 = r11.D0
            if (r3 == 0) goto L74
            r3 = 2131623948(0x7f0e000c, float:1.8875062E38)
            android.view.View r2 = r2.inflate(r3, r8)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r11.B0 = r5
            r11.A0 = r5
            goto Lec
        L74:
            boolean r2 = r11.A0
            if (r2 == 0) goto Ld3
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            android.content.res.Resources$Theme r3 = r0.getTheme()
            r9 = 2130968588(0x7f04000c, float:1.7545834E38)
            r3.resolveAttribute(r9, r2, r7)
            int r3 = r2.resourceId
            if (r3 == 0) goto L93
            p41 r3 = new p41
            int r2 = r2.resourceId
            r3.<init>(r0, r2)
            goto L94
        L93:
            r3 = r0
        L94:
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r3)
            r3 = 2131623959(0x7f0e0017, float:1.8875084E38)
            android.view.View r2 = r2.inflate(r3, r8)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r3 = 2131427530(0x7f0b00ca, float:1.8476679E38)
            android.view.View r3 = r2.findViewById(r3)
            androidx.appcompat.widget.ActionBarOverlayLayout r3 = (androidx.appcompat.widget.ActionBarOverlayLayout) r3
            r11.m0 = r3
            android.view.Window r9 = r11.h0
            android.view.Window$Callback r9 = r9.getCallback()
            r3.setWindowCallback(r9)
            boolean r3 = r11.B0
            if (r3 == 0) goto Lbe
            androidx.appcompat.widget.ActionBarOverlayLayout r3 = r11.m0
            r3.j(r4)
        Lbe:
            boolean r3 = r11.y0
            if (r3 == 0) goto Lc8
            androidx.appcompat.widget.ActionBarOverlayLayout r3 = r11.m0
            r4 = 2
            r3.j(r4)
        Lc8:
            boolean r3 = r11.z0
            if (r3 == 0) goto Lec
            androidx.appcompat.widget.ActionBarOverlayLayout r3 = r11.m0
            r4 = 5
            r3.j(r4)
            goto Lec
        Ld3:
            r2 = r8
            goto Lec
        Ld5:
            boolean r3 = r11.C0
            if (r3 == 0) goto Le3
            r3 = 2131623958(0x7f0e0016, float:1.8875082E38)
            android.view.View r2 = r2.inflate(r3, r8)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            goto Lec
        Le3:
            r3 = 2131623957(0x7f0e0015, float:1.887508E38)
            android.view.View r2 = r2.inflate(r3, r8)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
        Lec:
            if (r2 == 0) goto L23e
            vq r3 = new vq
            r3.<init>(r11, r5)
            java.util.WeakHashMap r4 = defpackage.ao7.a
            defpackage.sn7.c(r2, r3)
            androidx.appcompat.widget.ActionBarOverlayLayout r3 = r11.m0
            if (r3 != 0) goto L107
            r3 = 2131428012(0x7f0b02ac, float:1.8477656E38)
            android.view.View r3 = r2.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r11.w0 = r3
        L107:
            boolean r3 = defpackage.eq7.a
            java.lang.String r3 = "Could not invoke makeOptionalFitsSystemWindows"
            java.lang.String r4 = "ViewUtils"
            java.lang.Class r9 = r2.getClass()     // Catch: java.lang.IllegalAccessException -> L121 java.lang.reflect.InvocationTargetException -> L123 java.lang.NoSuchMethodException -> L131
            java.lang.String r10 = "makeOptionalFitsSystemWindows"
            java.lang.reflect.Method r9 = r9.getMethod(r10, r8)     // Catch: java.lang.IllegalAccessException -> L121 java.lang.reflect.InvocationTargetException -> L123 java.lang.NoSuchMethodException -> L131
            boolean r10 = r9.isAccessible()     // Catch: java.lang.IllegalAccessException -> L121 java.lang.reflect.InvocationTargetException -> L123 java.lang.NoSuchMethodException -> L131
            if (r10 != 0) goto L125
            r9.setAccessible(r7)     // Catch: java.lang.IllegalAccessException -> L121 java.lang.reflect.InvocationTargetException -> L123 java.lang.NoSuchMethodException -> L131
            goto L125
        L121:
            r9 = move-exception
            goto L129
        L123:
            r9 = move-exception
            goto L12d
        L125:
            r9.invoke(r2, r8)     // Catch: java.lang.IllegalAccessException -> L121 java.lang.reflect.InvocationTargetException -> L123 java.lang.NoSuchMethodException -> L131
            goto L136
        L129:
            android.util.Log.d(r4, r3, r9)
            goto L136
        L12d:
            android.util.Log.d(r4, r3, r9)
            goto L136
        L131:
            java.lang.String r3 = "Could not find method makeOptionalFitsSystemWindows. Oh well..."
            android.util.Log.d(r4, r3)
        L136:
            r3 = 2131427381(0x7f0b0035, float:1.8476377E38)
            android.view.View r3 = r2.findViewById(r3)
            androidx.appcompat.widget.ContentFrameLayout r3 = (androidx.appcompat.widget.ContentFrameLayout) r3
            android.view.Window r4 = r11.h0
            r9 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r4 = r4.findViewById(r9)
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            if (r4 == 0) goto L16d
        L14c:
            int r10 = r4.getChildCount()
            if (r10 <= 0) goto L15d
            android.view.View r10 = r4.getChildAt(r5)
            r4.removeViewAt(r5)
            r3.addView(r10)
            goto L14c
        L15d:
            r10 = -1
            r4.setId(r10)
            r3.setId(r9)
            boolean r10 = r4 instanceof android.widget.FrameLayout
            if (r10 == 0) goto L16d
            android.widget.FrameLayout r4 = (android.widget.FrameLayout) r4
            r4.setForeground(r8)
        L16d:
            android.view.Window r4 = r11.h0
            r4.setContentView(r2)
            vq r4 = new vq
            r4.<init>(r11, r7)
            r3.setAttachListener(r4)
            r11.v0 = r2
            java.lang.Object r2 = r11.f0
            boolean r3 = r2 instanceof android.app.Activity
            if (r3 == 0) goto L189
            android.app.Activity r2 = (android.app.Activity) r2
            java.lang.CharSequence r2 = r2.getTitle()
            goto L18b
        L189:
            java.lang.CharSequence r2 = r11.l0
        L18b:
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L1a8
            androidx.appcompat.widget.ActionBarOverlayLayout r3 = r11.m0
            if (r3 == 0) goto L199
            r3.setWindowTitle(r2)
            goto L1a8
        L199:
            ak7 r3 = r11.j0
            if (r3 == 0) goto L1a1
            r3.E0(r2)
            goto L1a8
        L1a1:
            android.widget.TextView r3 = r11.w0
            if (r3 == 0) goto L1a8
            r3.setText(r2)
        L1a8:
            android.view.ViewGroup r2 = r11.v0
            android.view.View r2 = r2.findViewById(r9)
            androidx.appcompat.widget.ContentFrameLayout r2 = (androidx.appcompat.widget.ContentFrameLayout) r2
            android.view.Window r3 = r11.h0
            android.view.View r3 = r3.getDecorView()
            int r4 = r3.getPaddingLeft()
            int r8 = r3.getPaddingTop()
            int r9 = r3.getPaddingRight()
            int r3 = r3.getPaddingBottom()
            android.graphics.Rect r10 = r2.f0
            r10.set(r4, r8, r9, r3)
            boolean r3 = r2.isLaidOut()
            if (r3 == 0) goto L1d4
            r2.requestLayout()
        L1d4:
            android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r1)
            r1 = 124(0x7c, float:1.74E-43)
            android.util.TypedValue r3 = r2.getMinWidthMajor()
            r0.getValue(r1, r3)
            r1 = 125(0x7d, float:1.75E-43)
            android.util.TypedValue r3 = r2.getMinWidthMinor()
            r0.getValue(r1, r3)
            r1 = 122(0x7a, float:1.71E-43)
            boolean r3 = r0.hasValue(r1)
            if (r3 == 0) goto L1f9
            android.util.TypedValue r3 = r2.getFixedWidthMajor()
            r0.getValue(r1, r3)
        L1f9:
            r1 = 123(0x7b, float:1.72E-43)
            boolean r3 = r0.hasValue(r1)
            if (r3 == 0) goto L208
            android.util.TypedValue r3 = r2.getFixedWidthMinor()
            r0.getValue(r1, r3)
        L208:
            r1 = 120(0x78, float:1.68E-43)
            boolean r3 = r0.hasValue(r1)
            if (r3 == 0) goto L217
            android.util.TypedValue r3 = r2.getFixedHeightMajor()
            r0.getValue(r1, r3)
        L217:
            r1 = 121(0x79, float:1.7E-43)
            boolean r3 = r0.hasValue(r1)
            if (r3 == 0) goto L226
            android.util.TypedValue r3 = r2.getFixedHeightMinor()
            r0.getValue(r1, r3)
        L226:
            r0.recycle()
            r2.requestLayout()
            r11.u0 = r7
            er r0 = r11.C(r5)
            boolean r1 = r11.L0
            if (r1 != 0) goto L281
            i44 r0 = r0.h
            if (r0 != 0) goto L281
            r11.E(r6)
            goto L281
        L23e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "AppCompat does not support the current theme features: { windowActionBar: "
            r0.<init>(r1)
            boolean r1 = r11.A0
            r0.append(r1)
            java.lang.String r1 = ", windowActionBarOverlay: "
            r0.append(r1)
            boolean r1 = r11.B0
            r0.append(r1)
            java.lang.String r1 = ", android:windowIsFloating: "
            r0.append(r1)
            boolean r1 = r11.D0
            r0.append(r1)
            java.lang.String r1 = ", windowActionModeOverlay: "
            r0.append(r1)
            boolean r1 = r11.C0
            r0.append(r1)
            java.lang.String r1 = ", windowNoTitle: "
            r0.append(r1)
            boolean r11 = r11.E0
            java.lang.String r1 = " }"
            java.lang.String r11 = defpackage.i61.o(r0, r11, r1)
            defpackage.i.h(r11)
            return
        L279:
            r2.recycle()
            java.lang.String r11 = "You need to use a Theme.AppCompat theme (or descendant) with this activity."
            defpackage.i.m(r11)
        L281:
            return
    }
}
