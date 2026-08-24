package androidx.appcompat.widget;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends android.view.ViewGroup implements defpackage.ke4, defpackage.le4 {
    public static final int[] B0 = null;
    public static final defpackage.vu7 C0 = null;
    public static final android.graphics.Rect D0 = null;
    public int A;
    public final defpackage.w7 A0;
    public int B;
    public androidx.appcompat.widget.ContentFrameLayout L;
    public androidx.appcompat.widget.ActionBarContainer R;
    public defpackage.tc1 d0;
    public android.graphics.drawable.Drawable e0;
    public boolean f0;
    public boolean g0;
    public boolean h0;
    public boolean i0;
    public int j0;
    public int k0;
    public final android.graphics.Rect l0;
    public final android.graphics.Rect m0;
    public final android.graphics.Rect n0;
    public final android.graphics.Rect o0;
    public defpackage.vu7 p0;
    public defpackage.vu7 q0;
    public defpackage.vu7 r0;
    public defpackage.vu7 s0;
    public defpackage.u7 t0;
    public android.widget.OverScroller u0;
    public android.view.ViewPropertyAnimator v0;
    public final defpackage.s7 w0;
    public final defpackage.t7 x0;
    public final defpackage.t7 y0;
    public final defpackage.dy7 z0;

    static {
            r0 = 2130968582(0x7f040006, float:1.7545822E38)
            r1 = 16842841(0x1010059, float:2.3693807E-38)
            int[] r0 = new int[]{r0, r1}
            androidx.appcompat.widget.ActionBarOverlayLayout.B0 = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 36
            if (r0 < r1) goto L18
            hu7 r0 = new hu7
            r0.<init>()
            goto L4f
        L18:
            r1 = 35
            if (r0 < r1) goto L22
            gu7 r0 = new gu7
            r0.<init>()
            goto L4f
        L22:
            r1 = 34
            if (r0 < r1) goto L2c
            fu7 r0 = new fu7
            r0.<init>()
            goto L4f
        L2c:
            r1 = 31
            if (r0 < r1) goto L36
            eu7 r0 = new eu7
            r0.<init>()
            goto L4f
        L36:
            r1 = 30
            if (r0 < r1) goto L40
            du7 r0 = new du7
            r0.<init>()
            goto L4f
        L40:
            r1 = 29
            if (r0 < r1) goto L4a
            cu7 r0 = new cu7
            r0.<init>()
            goto L4f
        L4a:
            bu7 r0 = new bu7
            r0.<init>()
        L4f:
            r1 = 0
            r2 = 1
            e83 r1 = defpackage.e83.c(r1, r2, r1, r2)
            r0.h(r1)
            vu7 r0 = r0.b()
            androidx.appcompat.widget.ActionBarOverlayLayout.C0 = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            androidx.appcompat.widget.ActionBarOverlayLayout.D0 = r0
            return
    }

    public ActionBarOverlayLayout(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r1.<init>(r2, r3)
            r3 = 0
            r1.B = r3
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            r1.l0 = r3
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            r1.m0 = r3
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            r1.n0 = r3
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            r1.o0 = r3
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            vu7 r3 = defpackage.vu7.b
            r1.p0 = r3
            r1.q0 = r3
            r1.r0 = r3
            r1.s0 = r3
            s7 r3 = new s7
            r0 = 0
            r3.<init>(r1, r0)
            r1.w0 = r3
            t7 r3 = new t7
            r3.<init>(r1, r0)
            r1.x0 = r3
            t7 r3 = new t7
            r0 = 1
            r3.<init>(r1, r0)
            r1.y0 = r3
            r1.i(r2)
            dy7 r3 = new dy7
            r3.<init>()
            r1.z0 = r3
            w7 r3 = new w7
            r3.<init>(r2)
            r2 = 1
            r3.setWillNotDraw(r2)
            r1.A0 = r3
            r1.addView(r3)
            return
    }

    public static boolean g(android.view.View r4, android.graphics.Rect r5, boolean r6) {
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            v7 r4 = (defpackage.v7) r4
            int r0 = r4.leftMargin
            int r1 = r5.left
            r2 = 1
            if (r0 == r1) goto L11
            r4.leftMargin = r1
            r0 = r2
            goto L12
        L11:
            r0 = 0
        L12:
            int r1 = r4.topMargin
            int r3 = r5.top
            if (r1 == r3) goto L1b
            r4.topMargin = r3
            r0 = r2
        L1b:
            int r1 = r4.rightMargin
            int r3 = r5.right
            if (r1 == r3) goto L24
            r4.rightMargin = r3
            r0 = r2
        L24:
            if (r6 == 0) goto L2f
            int r6 = r4.bottomMargin
            int r5 = r5.bottom
            if (r6 == r5) goto L2f
            r4.bottomMargin = r5
            return r2
        L2f:
            return r0
    }

    @Override // defpackage.le4
    public final void a(android.view.View r1, int r2, int r3, int r4, int r5, int r6, int[] r7) {
            r0 = this;
            r0.b(r1, r2, r3, r4, r5, r6)
            return
    }

    @Override // defpackage.ke4
    public final void b(android.view.View r1, int r2, int r3, int r4, int r5, int r6) {
            r0 = this;
            if (r6 != 0) goto L5
            r0.onNestedScroll(r1, r2, r3, r4, r5)
        L5:
            return
    }

    @Override // defpackage.ke4
    public final boolean c(android.view.View r1, android.view.View r2, int r3, int r4) {
            r0 = this;
            if (r4 != 0) goto La
            boolean r0 = r0.onStartNestedScroll(r1, r2, r3)
            if (r0 == 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            boolean r0 = r1 instanceof defpackage.v7
            return r0
    }

    @Override // defpackage.ke4
    public final void d(android.view.View r1, android.view.View r2, int r3, int r4) {
            r0 = this;
            if (r4 != 0) goto L5
            r0.onNestedScrollAccepted(r1, r2, r3)
        L5:
            return
    }

    @Override // android.view.View
    public final void draw(android.graphics.Canvas r6) {
            r5 = this;
            super.draw(r6)
            android.graphics.drawable.Drawable r0 = r5.e0
            if (r0 == 0) goto L39
            androidx.appcompat.widget.ActionBarContainer r0 = r5.R
            int r0 = r0.getVisibility()
            r1 = 0
            if (r0 != 0) goto L23
            androidx.appcompat.widget.ActionBarContainer r0 = r5.R
            int r0 = r0.getBottom()
            float r0 = (float) r0
            androidx.appcompat.widget.ActionBarContainer r2 = r5.R
            float r2 = r2.getTranslationY()
            float r2 = r2 + r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r0
            int r0 = (int) r2
            goto L24
        L23:
            r0 = r1
        L24:
            android.graphics.drawable.Drawable r2 = r5.e0
            int r3 = r5.getWidth()
            android.graphics.drawable.Drawable r4 = r5.e0
            int r4 = r4.getIntrinsicHeight()
            int r4 = r4 + r0
            r2.setBounds(r1, r0, r3, r4)
            android.graphics.drawable.Drawable r5 = r5.e0
            r5.draw(r6)
        L39:
            return
    }

    @Override // defpackage.ke4
    public final void e(android.view.View r1, int r2) {
            r0 = this;
            if (r2 != 0) goto L5
            r0.onStopNestedScroll(r1)
        L5:
            return
    }

    @Override // defpackage.ke4
    public final void f(android.view.View r1, int r2, int r3, int[] r4, int r5) {
            r0 = this;
            return
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(android.graphics.Rect r1) {
            r0 = this;
            boolean r0 = super.fitSystemWindows(r1)
            return r0
    }

    @Override // android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
            r1 = this;
            v7 r1 = new v7
            r0 = -1
            r1.<init>(r0, r0)
            return r1
    }

    @Override // android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet r2) {
            r1 = this;
            v7 r0 = new v7
            android.content.Context r1 = r1.getContext()
            r0.<init>(r1, r2)
            return r0
    }

    @Override // android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            v7 r0 = new v7
            r0.<init>(r1)
            return r0
    }

    public int getActionBarHideOffset() {
            r0 = this;
            androidx.appcompat.widget.ActionBarContainer r0 = r0.R
            if (r0 == 0) goto Lb
            float r0 = r0.getTranslationY()
            int r0 = (int) r0
            int r0 = -r0
            return r0
        Lb:
            r0 = 0
            return r0
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
            r1 = this;
            dy7 r1 = r1.z0
            int r0 = r1.a
            int r1 = r1.b
            r1 = r1 | r0
            return r1
    }

    public java.lang.CharSequence getTitle() {
            r0 = this;
            r0.k()
            tc1 r0 = r0.d0
            l87 r0 = (defpackage.l87) r0
            androidx.appcompat.widget.Toolbar r0 = r0.a
            java.lang.CharSequence r0 = r0.getTitle()
            return r0
    }

    public final void h() {
            r1 = this;
            t7 r0 = r1.x0
            r1.removeCallbacks(r0)
            t7 r0 = r1.y0
            r1.removeCallbacks(r0)
            android.view.ViewPropertyAnimator r1 = r1.v0
            if (r1 == 0) goto L11
            r1.cancel()
        L11:
            return
    }

    public final void i(android.content.Context r5) {
            r4 = this;
            android.content.Context r0 = r4.getContext()
            android.content.res.Resources$Theme r0 = r0.getTheme()
            int[] r1 = androidx.appcompat.widget.ActionBarOverlayLayout.B0
            android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r1)
            r1 = 0
            int r2 = r0.getDimensionPixelSize(r1, r1)
            r4.A = r2
            r2 = 1
            android.graphics.drawable.Drawable r3 = r0.getDrawable(r2)
            r4.e0 = r3
            if (r3 != 0) goto L1f
            r1 = r2
        L1f:
            r4.setWillNotDraw(r1)
            r0.recycle()
            android.widget.OverScroller r0 = new android.widget.OverScroller
            r0.<init>(r5)
            r4.u0 = r0
            return
    }

    public final void j(int r4) {
            r3 = this;
            r3.k()
            r0 = 2
            java.lang.String r1 = "Progress display unsupported"
            java.lang.String r2 = "ToolbarWidgetWrapper"
            if (r4 == r0) goto L22
            r0 = 5
            if (r4 == r0) goto L17
            r0 = 109(0x6d, float:1.53E-43)
            if (r4 == r0) goto L12
            return
        L12:
            r4 = 1
            r3.setOverlayMode(r4)
            return
        L17:
            tc1 r3 = r3.d0
            l87 r3 = (defpackage.l87) r3
            r3.getClass()
            android.util.Log.i(r2, r1)
            return
        L22:
            tc1 r3 = r3.d0
            l87 r3 = (defpackage.l87) r3
            r3.getClass()
            android.util.Log.i(r2, r1)
            return
    }

    public final void k() {
            r2 = this;
            androidx.appcompat.widget.ContentFrameLayout r0 = r2.L
            if (r0 != 0) goto L46
            r0 = 2131427381(0x7f0b0035, float:1.8476377E38)
            android.view.View r0 = r2.findViewById(r0)
            androidx.appcompat.widget.ContentFrameLayout r0 = (androidx.appcompat.widget.ContentFrameLayout) r0
            r2.L = r0
            r0 = 2131427382(0x7f0b0036, float:1.8476379E38)
            android.view.View r0 = r2.findViewById(r0)
            androidx.appcompat.widget.ActionBarContainer r0 = (androidx.appcompat.widget.ActionBarContainer) r0
            r2.R = r0
            r0 = 2131427380(0x7f0b0034, float:1.8476375E38)
            android.view.View r0 = r2.findViewById(r0)
            boolean r1 = r0 instanceof defpackage.tc1
            if (r1 == 0) goto L28
            tc1 r0 = (defpackage.tc1) r0
            goto L32
        L28:
            boolean r1 = r0 instanceof androidx.appcompat.widget.Toolbar
            if (r1 == 0) goto L35
            androidx.appcompat.widget.Toolbar r0 = (androidx.appcompat.widget.Toolbar) r0
            tc1 r0 = r0.getWrapper()
        L32:
            r2.d0 = r0
            return
        L35:
            java.lang.Class r2 = r0.getClass()
            java.lang.String r2 = r2.getSimpleName()
            java.lang.String r0 = "Can't make a decor toolbar out of "
            java.lang.String r2 = r0.concat(r2)
            defpackage.i.m(r2)
        L46:
            return
    }

    public final void l(android.view.Menu r4, defpackage.a54 r5) {
            r3 = this;
            r3.k()
            tc1 r3 = r3.d0
            l87 r3 = (defpackage.l87) r3
            androidx.appcompat.widget.Toolbar r0 = r3.a
            g8 r1 = r3.m
            if (r1 != 0) goto L18
            g8 r1 = new g8
            android.content.Context r2 = r0.getContext()
            r1.<init>(r2)
            r3.m = r1
        L18:
            g8 r3 = r3.m
            r3.X = r5
            i44 r4 = (defpackage.i44) r4
            if (r4 != 0) goto L25
            androidx.appcompat.widget.ActionMenuView r5 = r0.A
            if (r5 != 0) goto L25
            goto L2e
        L25:
            r0.f()
            androidx.appcompat.widget.ActionMenuView r5 = r0.A
            i44 r5 = r5.o0
            if (r5 != r4) goto L2f
        L2e:
            return
        L2f:
            if (r5 == 0) goto L3b
            g8 r1 = r0.K0
            r5.r(r1)
            d87 r1 = r0.L0
            r5.r(r1)
        L3b:
            d87 r5 = r0.L0
            if (r5 != 0) goto L46
            d87 r5 = new d87
            r5.<init>(r0)
            r0.L0 = r5
        L46:
            r5 = 1
            r3.m0 = r5
            android.content.Context r5 = r0.i0
            if (r4 == 0) goto L58
            r4.b(r3, r5)
            d87 r5 = r0.L0
            android.content.Context r1 = r0.i0
            r4.b(r5, r1)
            goto L6b
        L58:
            r4 = 0
            r3.k(r5, r4)
            d87 r5 = r0.L0
            android.content.Context r1 = r0.i0
            r5.k(r1, r4)
            r3.i()
            d87 r4 = r0.L0
            r4.i()
        L6b:
            androidx.appcompat.widget.ActionMenuView r4 = r0.A
            int r5 = r0.j0
            r4.setPopupTheme(r5)
            androidx.appcompat.widget.ActionMenuView r4 = r0.A
            r4.setPresenter(r3)
            r0.K0 = r3
            r0.x()
            return
    }

    @Override // android.view.View
    public final android.view.WindowInsets onApplyWindowInsets(android.view.WindowInsets r7) {
            r6 = this;
            r6.k()
            vu7 r7 = defpackage.vu7.g(r6, r7)
            android.graphics.Rect r0 = new android.graphics.Rect
            int r1 = r7.b()
            int r2 = r7.d()
            int r3 = r7.c()
            int r4 = r7.a()
            r0.<init>(r1, r2, r3, r4)
            androidx.appcompat.widget.ActionBarContainer r1 = r6.R
            r2 = 0
            boolean r0 = g(r1, r0, r2)
            java.util.WeakHashMap r1 = defpackage.ao7.a
            android.graphics.Rect r1 = r6.l0
            defpackage.sn7.b(r6, r7, r1)
            int r2 = r1.left
            int r3 = r1.top
            int r4 = r1.right
            int r5 = r1.bottom
            ru7 r7 = r7.a
            vu7 r2 = r7.q(r2, r3, r4, r5)
            r6.p0 = r2
            vu7 r3 = r6.q0
            boolean r2 = r3.equals(r2)
            r3 = 1
            if (r2 != 0) goto L48
            vu7 r0 = r6.p0
            r6.q0 = r0
            r0 = r3
        L48:
            android.graphics.Rect r2 = r6.m0
            boolean r4 = r2.equals(r1)
            if (r4 != 0) goto L54
            r2.set(r1)
            goto L55
        L54:
            r3 = r0
        L55:
            if (r3 == 0) goto L5a
            r6.requestLayout()
        L5a:
            vu7 r6 = r7.a()
            ru7 r6 = r6.a
            vu7 r6 = r6.c()
            ru7 r6 = r6.a
            vu7 r6 = r6.b()
            android.view.WindowInsets r6 = r6.f()
            return r6
    }

    @Override // android.view.View
    public final void onConfigurationChanged(android.content.res.Configuration r1) {
            r0 = this;
            super.onConfigurationChanged(r1)
            android.content.Context r1 = r0.getContext()
            r0.i(r1)
            java.util.WeakHashMap r1 = defpackage.ao7.a
            r0.requestApplyInsets()
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
            r0 = this;
            super.onDetachedFromWindow()
            r0.h()
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r5, int r6, int r7, int r8, int r9) {
            r4 = this;
            int r5 = r4.getChildCount()
            int r6 = r4.getPaddingLeft()
            int r7 = r4.getPaddingTop()
            r8 = 0
        Ld:
            if (r8 >= r5) goto L37
            android.view.View r9 = r4.getChildAt(r8)
            int r0 = r9.getVisibility()
            r1 = 8
            if (r0 == r1) goto L34
            android.view.ViewGroup$LayoutParams r0 = r9.getLayoutParams()
            v7 r0 = (defpackage.v7) r0
            int r1 = r9.getMeasuredWidth()
            int r2 = r9.getMeasuredHeight()
            int r3 = r0.leftMargin
            int r3 = r3 + r6
            int r0 = r0.topMargin
            int r0 = r0 + r7
            int r1 = r1 + r3
            int r2 = r2 + r0
            r9.layout(r3, r0, r1, r2)
        L34:
            int r8 = r8 + 1
            goto Ld
        L37:
            return
    }

    @Override // android.view.View
    public final void onMeasure(int r13, int r14) {
            r12 = this;
            r12.k()
            androidx.appcompat.widget.ActionBarContainer r1 = r12.R
            r3 = 0
            r5 = 0
            r0 = r12
            r2 = r13
            r4 = r14
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            androidx.appcompat.widget.ActionBarContainer r12 = r0.R
            android.view.ViewGroup$LayoutParams r12 = r12.getLayoutParams()
            v7 r12 = (defpackage.v7) r12
            androidx.appcompat.widget.ActionBarContainer r13 = r0.R
            int r13 = r13.getMeasuredWidth()
            int r14 = r12.leftMargin
            int r13 = r13 + r14
            int r14 = r12.rightMargin
            int r13 = r13 + r14
            r14 = 0
            int r13 = java.lang.Math.max(r14, r13)
            androidx.appcompat.widget.ActionBarContainer r1 = r0.R
            int r1 = r1.getMeasuredHeight()
            int r3 = r12.topMargin
            int r1 = r1 + r3
            int r12 = r12.bottomMargin
            int r1 = r1 + r12
            int r12 = java.lang.Math.max(r14, r1)
            androidx.appcompat.widget.ActionBarContainer r1 = r0.R
            int r1 = r1.getMeasuredState()
            int r1 = android.view.View.combineMeasuredStates(r14, r1)
            java.util.WeakHashMap r3 = defpackage.ao7.a
            int r3 = r0.getWindowSystemUiVisibility()
            r3 = r3 & 256(0x100, float:3.59E-43)
            r5 = 1
            if (r3 == 0) goto L4d
            r3 = r5
            goto L4e
        L4d:
            r3 = r14
        L4e:
            if (r3 == 0) goto L62
            int r6 = r0.A
            boolean r7 = r0.g0
            if (r7 == 0) goto L74
            androidx.appcompat.widget.ActionBarContainer r7 = r0.R
            android.view.View r7 = r7.getTabContainer()
            if (r7 == 0) goto L74
            int r7 = r0.A
            int r6 = r6 + r7
            goto L74
        L62:
            androidx.appcompat.widget.ActionBarContainer r6 = r0.R
            int r6 = r6.getVisibility()
            r7 = 8
            if (r6 == r7) goto L73
            androidx.appcompat.widget.ActionBarContainer r6 = r0.R
            int r6 = r6.getMeasuredHeight()
            goto L74
        L73:
            r6 = r14
        L74:
            android.graphics.Rect r7 = r0.l0
            android.graphics.Rect r8 = r0.n0
            r8.set(r7)
            vu7 r7 = r0.p0
            r0.r0 = r7
            boolean r7 = r0.f0
            if (r7 != 0) goto Lab
            if (r3 != 0) goto Lab
            w7 r3 = r0.A0
            vu7 r7 = androidx.appcompat.widget.ActionBarOverlayLayout.C0
            android.graphics.Rect r9 = r0.o0
            defpackage.sn7.b(r3, r7, r9)
            android.graphics.Rect r3 = androidx.appcompat.widget.ActionBarOverlayLayout.D0
            boolean r3 = r9.equals(r3)
            if (r3 != 0) goto Lab
            int r3 = r8.top
            int r3 = r3 + r6
            r8.top = r3
            int r3 = r8.bottom
            r8.bottom = r3
            vu7 r3 = r0.r0
            ru7 r3 = r3.a
            vu7 r14 = r3.q(r14, r6, r14, r14)
            r0.r0 = r14
            goto L116
        Lab:
            vu7 r14 = r0.r0
            int r14 = r14.b()
            vu7 r3 = r0.r0
            int r3 = r3.d()
            int r3 = r3 + r6
            vu7 r6 = r0.r0
            int r6 = r6.c()
            vu7 r7 = r0.r0
            int r7 = r7.a()
            e83 r14 = defpackage.e83.c(r14, r3, r6, r7)
            vu7 r3 = r0.r0
            int r6 = android.os.Build.VERSION.SDK_INT
            r7 = 36
            if (r6 < r7) goto Ld6
            hu7 r6 = new hu7
            r6.<init>(r3)
            goto L10d
        Ld6:
            r7 = 35
            if (r6 < r7) goto Le0
            gu7 r6 = new gu7
            r6.<init>(r3)
            goto L10d
        Le0:
            r7 = 34
            if (r6 < r7) goto Lea
            fu7 r6 = new fu7
            r6.<init>(r3)
            goto L10d
        Lea:
            r7 = 31
            if (r6 < r7) goto Lf4
            eu7 r6 = new eu7
            r6.<init>(r3)
            goto L10d
        Lf4:
            r7 = 30
            if (r6 < r7) goto Lfe
            du7 r6 = new du7
            r6.<init>(r3)
            goto L10d
        Lfe:
            r7 = 29
            if (r6 < r7) goto L108
            cu7 r6 = new cu7
            r6.<init>(r3)
            goto L10d
        L108:
            bu7 r6 = new bu7
            r6.<init>(r3)
        L10d:
            r6.h(r14)
            vu7 r14 = r6.b()
            r0.r0 = r14
        L116:
            androidx.appcompat.widget.ContentFrameLayout r14 = r0.L
            g(r14, r8, r5)
            vu7 r14 = r0.s0
            vu7 r3 = r0.r0
            boolean r14 = r14.equals(r3)
            if (r14 != 0) goto L12e
            vu7 r14 = r0.r0
            r0.s0 = r14
            androidx.appcompat.widget.ContentFrameLayout r3 = r0.L
            defpackage.ao7.c(r3, r14)
        L12e:
            androidx.appcompat.widget.ContentFrameLayout r7 = r0.L
            r9 = 0
            r11 = 0
            r6 = r0
            r8 = r2
            r10 = r4
            r6.measureChildWithMargins(r7, r8, r9, r10, r11)
            androidx.appcompat.widget.ContentFrameLayout r14 = r0.L
            android.view.ViewGroup$LayoutParams r14 = r14.getLayoutParams()
            v7 r14 = (defpackage.v7) r14
            androidx.appcompat.widget.ContentFrameLayout r3 = r0.L
            int r3 = r3.getMeasuredWidth()
            int r5 = r14.leftMargin
            int r3 = r3 + r5
            int r5 = r14.rightMargin
            int r3 = r3 + r5
            int r13 = java.lang.Math.max(r13, r3)
            androidx.appcompat.widget.ContentFrameLayout r3 = r0.L
            int r3 = r3.getMeasuredHeight()
            int r5 = r14.topMargin
            int r3 = r3 + r5
            int r14 = r14.bottomMargin
            int r3 = r3 + r14
            int r12 = java.lang.Math.max(r12, r3)
            androidx.appcompat.widget.ContentFrameLayout r14 = r0.L
            int r14 = r14.getMeasuredState()
            int r14 = android.view.View.combineMeasuredStates(r1, r14)
            int r1 = r0.getPaddingLeft()
            int r3 = r0.getPaddingRight()
            int r3 = r3 + r1
            int r3 = r3 + r13
            int r13 = r0.getPaddingTop()
            int r1 = r0.getPaddingBottom()
            int r1 = r1 + r13
            int r1 = r1 + r12
            int r12 = r0.getSuggestedMinimumHeight()
            int r12 = java.lang.Math.max(r1, r12)
            int r13 = r0.getSuggestedMinimumWidth()
            int r13 = java.lang.Math.max(r3, r13)
            int r13 = android.view.View.resolveSizeAndState(r13, r2, r14)
            int r14 = r14 << 16
            int r12 = android.view.View.resolveSizeAndState(r12, r4, r14)
            r0.setMeasuredDimension(r13, r12)
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(android.view.View r10, float r11, float r12, boolean r13) {
            r9 = this;
            boolean r10 = r9.h0
            if (r10 == 0) goto L3a
            if (r13 != 0) goto L7
            goto L3a
        L7:
            android.widget.OverScroller r0 = r9.u0
            int r4 = (int) r12
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = 2147483647(0x7fffffff, float:NaN)
            r1 = 0
            r2 = 0
            r3 = 0
            r5 = 0
            r6 = 0
            r0.fling(r1, r2, r3, r4, r5, r6, r7, r8)
            android.widget.OverScroller r10 = r9.u0
            int r10 = r10.getFinalY()
            androidx.appcompat.widget.ActionBarContainer r11 = r9.R
            int r11 = r11.getHeight()
            if (r10 <= r11) goto L2e
            r9.h()
            t7 r10 = r9.y0
            r10.run()
            goto L36
        L2e:
            r9.h()
            t7 r10 = r9.x0
            r10.run()
        L36:
            r10 = 1
            r9.i0 = r10
            return r10
        L3a:
            r9 = 0
            return r9
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(android.view.View r1, float r2, float r3) {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(android.view.View r1, int r2, int r3, int[] r4) {
            r0 = this;
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(android.view.View r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            int r1 = r0.j0
            int r1 = r1 + r3
            r0.j0 = r1
            r0.setActionBarHideOffset(r1)
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(android.view.View r1, android.view.View r2, int r3) {
            r0 = this;
            dy7 r1 = r0.z0
            r1.a = r3
            int r1 = r0.getActionBarHideOffset()
            r0.j0 = r1
            r0.h()
            u7 r0 = r0.t0
            if (r0 == 0) goto L1d
            nt7 r0 = (defpackage.nt7) r0
            jp7 r1 = r0.E
            if (r1 == 0) goto L1d
            r1.a()
            r1 = 0
            r0.E = r1
        L1d:
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(android.view.View r1, android.view.View r2, int r3) {
            r0 = this;
            r1 = r3 & 2
            if (r1 == 0) goto L10
            androidx.appcompat.widget.ActionBarContainer r1 = r0.R
            int r1 = r1.getVisibility()
            if (r1 == 0) goto Ld
            goto L10
        Ld:
            boolean r0 = r0.h0
            return r0
        L10:
            r0 = 0
            return r0
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(android.view.View r4) {
            r3 = this;
            boolean r4 = r3.h0
            if (r4 == 0) goto L25
            boolean r4 = r3.i0
            if (r4 != 0) goto L25
            int r4 = r3.j0
            androidx.appcompat.widget.ActionBarContainer r0 = r3.R
            int r0 = r0.getHeight()
            r1 = 600(0x258, double:2.964E-321)
            if (r4 > r0) goto L1d
            r3.h()
            t7 r4 = r3.x0
            r3.postDelayed(r4, r1)
            goto L25
        L1d:
            r3.h()
            t7 r4 = r3.y0
            r3.postDelayed(r4, r1)
        L25:
            return
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int r7) {
            r6 = this;
            super.onWindowSystemUiVisibilityChanged(r7)
            r6.k()
            int r0 = r6.k0
            r0 = r0 ^ r7
            r6.k0 = r7
            r1 = r7 & 4
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L13
            r1 = r3
            goto L14
        L13:
            r1 = r2
        L14:
            r7 = r7 & 256(0x100, float:3.59E-43)
            if (r7 == 0) goto L1a
            r7 = r3
            goto L1b
        L1a:
            r7 = r2
        L1b:
            u7 r4 = r6.t0
            if (r4 == 0) goto L3d
            r5 = r7 ^ 1
            nt7 r4 = (defpackage.nt7) r4
            r4.z = r5
            if (r1 != 0) goto L34
            if (r7 != 0) goto L2a
            goto L34
        L2a:
            boolean r7 = r4.B
            if (r7 != 0) goto L3d
            r4.B = r3
            r4.O0(r3)
            goto L3d
        L34:
            boolean r7 = r4.B
            if (r7 == 0) goto L3d
            r4.B = r2
            r4.O0(r3)
        L3d:
            r7 = r0 & 256(0x100, float:3.59E-43)
            if (r7 == 0) goto L4a
            u7 r7 = r6.t0
            if (r7 == 0) goto L4a
            java.util.WeakHashMap r7 = defpackage.ao7.a
            r6.requestApplyInsets()
        L4a:
            return
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int r1) {
            r0 = this;
            super.onWindowVisibilityChanged(r1)
            r0.B = r1
            u7 r0 = r0.t0
            if (r0 == 0) goto Ld
            nt7 r0 = (defpackage.nt7) r0
            r0.y = r1
        Ld:
            return
    }

    public void setActionBarHideOffset(int r3) {
            r2 = this;
            r2.h()
            androidx.appcompat.widget.ActionBarContainer r0 = r2.R
            int r0 = r0.getHeight()
            r1 = 0
            int r3 = java.lang.Math.min(r3, r0)
            int r3 = java.lang.Math.max(r1, r3)
            androidx.appcompat.widget.ActionBarContainer r2 = r2.R
            int r3 = -r3
            float r3 = (float) r3
            r2.setTranslationY(r3)
            return
    }

    public void setActionBarVisibilityCallback(defpackage.u7 r2) {
            r1 = this;
            r1.t0 = r2
            android.os.IBinder r2 = r1.getWindowToken()
            if (r2 == 0) goto L1c
            u7 r2 = r1.t0
            int r0 = r1.B
            nt7 r2 = (defpackage.nt7) r2
            r2.y = r0
            int r2 = r1.k0
            if (r2 == 0) goto L1c
            r1.onWindowSystemUiVisibilityChanged(r2)
            java.util.WeakHashMap r2 = defpackage.ao7.a
            r1.requestApplyInsets()
        L1c:
            return
    }

    public void setHasNonEmbeddedTabs(boolean r1) {
            r0 = this;
            r0.g0 = r1
            return
    }

    public void setHideOnContentScrollEnabled(boolean r2) {
            r1 = this;
            boolean r0 = r1.h0
            if (r2 == r0) goto Lf
            r1.h0 = r2
            if (r2 != 0) goto Lf
            r1.h()
            r2 = 0
            r1.setActionBarHideOffset(r2)
        Lf:
            return
    }

    public void setIcon(int r2) {
            r1 = this;
            r1.k()
            tc1 r1 = r1.d0
            l87 r1 = (defpackage.l87) r1
            if (r2 == 0) goto L14
            androidx.appcompat.widget.Toolbar r0 = r1.a
            android.content.Context r0 = r0.getContext()
            android.graphics.drawable.Drawable r2 = defpackage.hf.S(r0, r2)
            goto L15
        L14:
            r2 = 0
        L15:
            r1.d = r2
            r1.c()
            return
    }

    public void setIcon(android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.k()
            tc1 r0 = r0.d0
            l87 r0 = (defpackage.l87) r0
            r0.d = r1
            r0.c()
            return
    }

    public void setLogo(int r2) {
            r1 = this;
            r1.k()
            tc1 r1 = r1.d0
            l87 r1 = (defpackage.l87) r1
            if (r2 == 0) goto L14
            androidx.appcompat.widget.Toolbar r0 = r1.a
            android.content.Context r0 = r0.getContext()
            android.graphics.drawable.Drawable r2 = defpackage.hf.S(r0, r2)
            goto L15
        L14:
            r2 = 0
        L15:
            r1.e = r2
            r1.c()
            return
    }

    public void setOverlayMode(boolean r1) {
            r0 = this;
            r0.f0 = r1
            return
    }

    public void setShowingForActionMode(boolean r1) {
            r0 = this;
            return
    }

    public void setUiOptions(int r1) {
            r0 = this;
            return
    }

    public void setWindowCallback(android.view.Window.Callback r1) {
            r0 = this;
            r0.k()
            tc1 r0 = r0.d0
            l87 r0 = (defpackage.l87) r0
            r0.k = r1
            return
    }

    public void setWindowTitle(java.lang.CharSequence r3) {
            r2 = this;
            r2.k()
            tc1 r2 = r2.d0
            l87 r2 = (defpackage.l87) r2
            boolean r0 = r2.g
            if (r0 != 0) goto L23
            androidx.appcompat.widget.Toolbar r0 = r2.a
            r2.h = r3
            int r1 = r2.b
            r1 = r1 & 8
            if (r1 == 0) goto L23
            r0.setTitle(r3)
            boolean r2 = r2.g
            if (r2 == 0) goto L23
            android.view.View r2 = r0.getRootView()
            defpackage.ao7.o(r2, r3)
        L23:
            return
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
            r0 = this;
            r0 = 0
            return r0
    }
}
