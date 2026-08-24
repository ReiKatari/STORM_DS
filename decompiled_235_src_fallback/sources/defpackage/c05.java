package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: c05  reason: default package */
/* loaded from: classes.dex */
public final class c05 extends defpackage.p0 {
    public boolean A0;
    public final int[] B0;
    public defpackage.on2 i0;
    public defpackage.g05 j0;
    public java.lang.String k0;
    public final android.view.View l0;
    public final boolean m0;
    public final defpackage.q61 n0;
    public final android.view.WindowManager o0;
    public final android.view.WindowManager.LayoutParams p0;
    public defpackage.f05 q0;
    public defpackage.kk3 r0;
    public final defpackage.vs4 s0;
    public final defpackage.vs4 t0;
    public defpackage.m93 u0;
    public final defpackage.ii1 v0;
    public final android.graphics.Rect w0;
    public final defpackage.qm6 x0;
    public defpackage.vp y0;
    public final defpackage.vs4 z0;

    public c05(defpackage.on2 r4, defpackage.g05 r5, java.lang.String r6, android.view.View r7, defpackage.qh1 r8, defpackage.f05 r9, java.util.UUID r10, boolean r11) {
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto Lc
            e05 r0 = new e05
            r0.<init>()
            goto L1b
        Lc:
            r1 = 29
            if (r0 < r1) goto L16
            d05 r0 = new d05
            r0.<init>()
            goto L1b
        L16:
            q61 r0 = new q61
            r0.<init>()
        L1b:
            android.content.Context r1 = r7.getContext()
            r2 = 0
            r3.<init>(r1, r2)
            r3.i0 = r4
            r3.j0 = r5
            r3.k0 = r6
            r3.l0 = r7
            r3.m0 = r11
            r3.n0 = r0
            android.content.Context r4 = r7.getContext()
            java.lang.String r5 = "window"
            java.lang.Object r4 = r4.getSystemService(r5)
            r4.getClass()
            android.view.WindowManager r4 = (android.view.WindowManager) r4
            r3.o0 = r4
            android.view.WindowManager$LayoutParams r4 = new android.view.WindowManager$LayoutParams
            r4.<init>()
            r5 = 8388659(0x800033, float:1.1755015E-38)
            r4.gravity = r5
            g05 r5 = r3.j0
            boolean r6 = defpackage.ak.b(r7)
            boolean r11 = r5.b
            int r5 = r5.a
            if (r11 == 0) goto L5b
            if (r6 == 0) goto L5b
            r5 = r5 | 8192(0x2000, float:1.148E-41)
            goto L61
        L5b:
            if (r11 == 0) goto L61
            if (r6 != 0) goto L61
            r5 = r5 & (-8193(0xffffffffffffdfff, float:NaN))
        L61:
            r4.flags = r5
            g05 r5 = r3.j0
            int r5 = r5.f
            r4.type = r5
            android.os.IBinder r5 = r7.getApplicationWindowToken()
            r4.token = r5
            r5 = -2
            r4.width = r5
            r4.height = r5
            r5 = -3
            r4.format = r5
            android.content.Context r5 = r7.getContext()
            android.content.res.Resources r5 = r5.getResources()
            r6 = 2131951850(0x7f1300ea, float:1.9540126E38)
            java.lang.String r5 = r5.getString(r6)
            r4.setTitle(r5)
            r3.p0 = r4
            r3.q0 = r9
            kk3 r4 = defpackage.kk3.Ltr
            r3.r0 = r4
            vs4 r4 = defpackage.np2.Y(r2)
            r3.s0 = r4
            vs4 r4 = defpackage.np2.Y(r2)
            r3.t0 = r4
            pj r4 = new pj
            r5 = 15
            r4.<init>(r3, r5)
            ii1 r4 = defpackage.np2.I(r4)
            r3.v0 = r4
            android.graphics.Rect r4 = new android.graphics.Rect
            r4.<init>()
            r3.w0 = r4
            qm6 r4 = new qm6
            wj r5 = new wj
            r6 = 2
            r5.<init>(r3, r6)
            r4.<init>(r5)
            r3.x0 = r4
            r4 = 16908290(0x1020002, float:2.3877235E-38)
            r3.setId(r4)
            hu3 r4 = defpackage.bl2.B(r7)
            r5 = 2131428076(0x7f0b02ec, float:1.8477786E38)
            r3.setTag(r5, r4)
            bp7 r4 = defpackage.ln2.r(r7)
            r5 = 2131428080(0x7f0b02f0, float:1.8477794E38)
            r3.setTag(r5, r4)
            g56 r4 = defpackage.kn2.C(r7)
            r5 = 2131428079(0x7f0b02ef, float:1.8477792E38)
            r3.setTag(r5, r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Popup:"
            r4.<init>(r5)
            r4.append(r10)
            java.lang.String r4 = r4.toString()
            r5 = 2131427507(0x7f0b00b3, float:1.8476632E38)
            r3.setTag(r5, r4)
            r4 = 0
            r3.setClipChildren(r4)
            r4 = 1090519040(0x41000000, float:8.0)
            float r4 = r8.e0(r4)
            r3.setElevation(r4)
            kj1 r4 = new kj1
            r5 = 1
            r4.<init>(r5)
            r3.setOutlineProvider(r4)
            zv0 r4 = defpackage.bw0.a
            vs4 r4 = defpackage.np2.Y(r4)
            r3.z0 = r4
            int[] r4 = new int[r6]
            r3.B0 = r4
            return
    }

    private final defpackage.eo2 getContent() {
            r0 = this;
            vs4 r0 = r0.z0
            java.lang.Object r0 = r0.getValue()
            eo2 r0 = (defpackage.eo2) r0
            return r0
    }

    private final defpackage.m93 getDisplayBounds() {
            r4 = this;
            g05 r0 = r4.j0
            int r0 = r0.a
            r0 = r0 & 512(0x200, float:7.17E-43)
            android.view.View r1 = r4.l0
            android.graphics.Rect r2 = r4.w0
            q61 r4 = r4.n0
            if (r0 != 0) goto L15
            r4.getClass()
            r1.getWindowVisibleDisplayFrame(r2)
            goto L18
        L15:
            r4.m(r1, r2)
        L18:
            m93 r4 = new m93
            int r0 = r2.left
            int r1 = r2.top
            int r3 = r2.right
            int r2 = r2.bottom
            r4.<init>(r0, r1, r3, r2)
            return r4
    }

    public static /* synthetic */ void getParams$ui$annotations() {
            return
    }

    private final defpackage.jk3 getParentLayoutCoordinates() {
            r0 = this;
            vs4 r0 = r0.t0
            java.lang.Object r0 = r0.getValue()
            jk3 r0 = (defpackage.jk3) r0
            return r0
    }

    public static final /* synthetic */ defpackage.jk3 l(defpackage.c05 r0) {
            jk3 r0 = r0.getParentLayoutCoordinates()
            return r0
    }

    private final void setContent(defpackage.eo2 r1) {
            r0 = this;
            vs4 r0 = r0.z0
            r0.setValue(r1)
            return
    }

    private final void setParentLayoutCoordinates(defpackage.jk3 r1) {
            r0 = this;
            vs4 r0 = r0.t0
            r0.setValue(r1)
            return
    }

    @Override // defpackage.p0
    public final void a(defpackage.px0 r6, int r7) {
            r5 = this;
            xq2 r6 = (defpackage.xq2) r6
            r0 = -857613600(0xffffffffcce1dae0, float:-1.1841306E8)
            r6.d0(r0)
            boolean r0 = r6.h(r5)
            r1 = 2
            if (r0 == 0) goto L11
            r0 = 4
            goto L12
        L11:
            r0 = r1
        L12:
            r0 = r0 | r7
            r2 = r0 & 3
            r3 = 0
            r4 = 1
            if (r2 == r1) goto L1b
            r1 = r4
            goto L1c
        L1b:
            r1 = r3
        L1c:
            r0 = r0 & r4
            boolean r0 = r6.S(r0, r1)
            if (r0 == 0) goto L2f
            eo2 r0 = r5.getContent()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            r0.o(r6, r1)
            goto L32
        L2f:
            r6.V()
        L32:
            cf5 r6 = r6.t()
            if (r6 == 0) goto L40
            o0 r0 = new o0
            r1 = 7
            r0.<init>(r5, r7, r1)
            r6.d = r0
        L40:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(android.view.KeyEvent r4) {
            r3 = this;
            g05 r0 = r3.j0
            boolean r0 = r0.c
            if (r0 != 0) goto Lb
            boolean r3 = super.dispatchKeyEvent(r4)
            return r3
        Lb:
            int r0 = r4.getKeyCode()
            r1 = 4
            if (r0 == r1) goto L1a
            int r0 = r4.getKeyCode()
            r1 = 111(0x6f, float:1.56E-43)
            if (r0 != r1) goto L50
        L1a:
            android.view.KeyEvent$DispatcherState r0 = r3.getKeyDispatcherState()
            if (r0 != 0) goto L25
            boolean r3 = super.dispatchKeyEvent(r4)
            return r3
        L25:
            int r1 = r4.getAction()
            r2 = 1
            if (r1 != 0) goto L36
            int r1 = r4.getRepeatCount()
            if (r1 != 0) goto L36
            r0.startTracking(r4, r3)
            return r2
        L36:
            int r1 = r4.getAction()
            if (r1 != r2) goto L50
            boolean r0 = r0.isTracking(r4)
            if (r0 == 0) goto L50
            boolean r0 = r4.isCanceled()
            if (r0 != 0) goto L50
            on2 r3 = r3.i0
            if (r3 == 0) goto L4f
            r3.c()
        L4f:
            return r2
        L50:
            boolean r3 = super.dispatchKeyEvent(r4)
            return r3
    }

    @Override // defpackage.p0
    public final void g(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            super.g(r1, r2, r3, r4, r5)
            g05 r1 = r0.j0
            r1.getClass()
            r1 = 0
            android.view.View r1 = r0.getChildAt(r1)
            if (r1 != 0) goto L10
            return
        L10:
            int r2 = r1.getMeasuredWidth()
            android.view.WindowManager$LayoutParams r3 = r0.p0
            r3.width = r2
            int r1 = r1.getMeasuredHeight()
            r3.height = r1
            q61 r1 = r0.n0
            r1.getClass()
            android.view.WindowManager r1 = r0.o0
            r1.updateViewLayout(r0, r3)
            return
    }

    public final boolean getCanCalculatePosition() {
            r0 = this;
            ii1 r0 = r0.v0
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    public final android.view.WindowManager.LayoutParams getParams$ui() {
            r0 = this;
            android.view.WindowManager$LayoutParams r0 = r0.p0
            return r0
    }

    public final defpackage.kk3 getParentLayoutDirection() {
            r0 = this;
            kk3 r0 = r0.r0
            return r0
    }

    /* renamed from: getPopupContentSize-bOM6tXw  reason: not valid java name */
    public final defpackage.q93 m0getPopupContentSizebOM6tXw() {
            r0 = this;
            vs4 r0 = r0.s0
            java.lang.Object r0 = r0.getValue()
            q93 r0 = (defpackage.q93) r0
            return r0
    }

    public final defpackage.f05 getPositionProvider() {
            r0 = this;
            f05 r0 = r0.q0
            return r0
    }

    @Override // defpackage.p0
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
            r0 = this;
            boolean r0 = r0.A0
            return r0
    }

    public defpackage.p0 getSubCompositionView() {
            r0 = this;
            return r0
    }

    public final java.lang.String getTestTag() {
            r0 = this;
            java.lang.String r0 = r0.k0
            return r0
    }

    public /* bridge */ /* synthetic */ android.view.View getViewRoot() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.p0
    public final void h(int r2, int r3) {
            r1 = this;
            g05 r2 = r1.j0
            r2.getClass()
            m93 r2 = r1.getDisplayBounds()
            int r3 = r2.c
            int r0 = r2.a
            int r3 = r3 - r0
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r0)
            int r2 = r2.a()
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            super.h(r3, r2)
            return
    }

    public final void m(defpackage.zx0 r1, defpackage.eo2 r2) {
            r0 = this;
            r0.setParentCompositionContext(r1)
            r0.setContent(r2)
            r1 = 1
            r0.A0 = r1
            return
    }

    public final void n(defpackage.on2 r1, defpackage.g05 r2, java.lang.String r3, defpackage.kk3 r4) {
            r0 = this;
            r0.i0 = r1
            r0.k0 = r3
            g05 r1 = r0.j0
            boolean r1 = defpackage.nb3.k(r1, r2)
            if (r1 == 0) goto Ld
            goto L37
        Ld:
            r2.getClass()
            r0.j0 = r2
            android.view.View r1 = r0.l0
            boolean r1 = defpackage.ak.b(r1)
            boolean r3 = r2.b
            int r2 = r2.a
            if (r3 == 0) goto L23
            if (r1 == 0) goto L23
            r2 = r2 | 8192(0x2000, float:1.148E-41)
            goto L29
        L23:
            if (r3 == 0) goto L29
            if (r1 != 0) goto L29
            r2 = r2 & (-8193(0xffffffffffffdfff, float:NaN))
        L29:
            android.view.WindowManager$LayoutParams r1 = r0.p0
            r1.flags = r2
            q61 r2 = r0.n0
            r2.getClass()
            android.view.WindowManager r2 = r0.o0
            r2.updateViewLayout(r0, r1)
        L37:
            int[] r1 = defpackage.a05.a
            int r2 = r4.ordinal()
            r1 = r1[r2]
            r2 = 1
            if (r1 == r2) goto L4a
            r3 = 2
            if (r1 != r3) goto L46
            goto L4b
        L46:
            defpackage.i.d()
            return
        L4a:
            r2 = 0
        L4b:
            super.setLayoutDirection(r2)
            return
    }

    public final void o() {
            r11 = this;
            jk3 r0 = r11.getParentLayoutCoordinates()
            if (r0 == 0) goto L64
            boolean r1 = r0.t()
            if (r1 == 0) goto Ld
            goto Le
        Ld:
            r0 = 0
        Le:
            if (r0 != 0) goto L11
            goto L64
        L11:
            long r1 = r0.m()
            boolean r3 = r11.m0
            r4 = 0
            if (r3 == 0) goto L20
            long r3 = r0.w(r4)
            goto L24
        L20:
            long r3 = r0.d(r4)
        L24:
            r0 = 32
            long r5 = r3 >> r0
            int r5 = (int) r5
            float r5 = java.lang.Float.intBitsToFloat(r5)
            int r5 = java.lang.Math.round(r5)
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r6
            int r3 = (int) r3
            float r3 = java.lang.Float.intBitsToFloat(r3)
            int r3 = java.lang.Math.round(r3)
            long r4 = (long) r5
            long r4 = r4 << r0
            long r8 = (long) r3
            long r8 = r8 & r6
            long r3 = r4 | r8
            m93 r5 = new m93
            long r8 = r3 >> r0
            int r8 = (int) r8
            long r3 = r3 & r6
            int r3 = (int) r3
            long r9 = r1 >> r0
            int r0 = (int) r9
            int r0 = r0 + r8
            long r1 = r1 & r6
            int r1 = (int) r1
            int r1 = r1 + r3
            r5.<init>(r8, r3, r0, r1)
            m93 r0 = r11.u0
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L64
            r11.u0 = r5
            r11.q()
        L64:
            return
    }

    @Override // defpackage.p0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
            r3 = this;
            super.onAttachedToWindow()
            qm6 r0 = r3.x0
            r0.e()
            g05 r0 = r3.j0
            boolean r0 = r0.c
            if (r0 == 0) goto L28
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 >= r1) goto L15
            goto L28
        L15:
            vp r0 = r3.y0
            if (r0 != 0) goto L23
            on2 r0 = r3.i0
            vp r1 = new vp
            r2 = 0
            r1.<init>(r0, r2)
            r3.y0 = r1
        L23:
            vp r0 = r3.y0
            defpackage.r2.i(r3, r0)
        L28:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
            r2 = this;
            super.onDetachedFromWindow()
            qm6 r0 = r2.x0
            h61 r1 = r0.h
            if (r1 == 0) goto Lc
            r1.d()
        Lc:
            r0.a()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L1a
            vp r0 = r2.y0
            defpackage.r2.j(r2, r0)
        L1a:
            r0 = 0
            r2.y0 = r0
            return
    }

    @Override // android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent r5) {
            r4 = this;
            g05 r0 = r4.j0
            boolean r0 = r0.d
            if (r0 != 0) goto Lb
            boolean r4 = super.onTouchEvent(r5)
            return r4
        Lb:
            r0 = 1
            if (r5 == 0) goto L47
            int r1 = r5.getAction()
            if (r1 != 0) goto L47
            float r1 = r5.getX()
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 < 0) goto L3f
            float r1 = r5.getX()
            int r3 = r4.getWidth()
            float r3 = (float) r3
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto L3f
            float r1 = r5.getY()
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 < 0) goto L3f
            float r1 = r5.getY()
            int r2 = r4.getHeight()
            float r2 = (float) r2
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 < 0) goto L47
        L3f:
            on2 r4 = r4.i0
            if (r4 == 0) goto L57
            r4.c()
            return r0
        L47:
            if (r5 == 0) goto L58
            int r1 = r5.getAction()
            r2 = 4
            if (r1 != r2) goto L58
            on2 r4 = r4.i0
            if (r4 == 0) goto L57
            r4.c()
        L57:
            return r0
        L58:
            boolean r4 = super.onTouchEvent(r5)
            return r4
    }

    public final void p(defpackage.jk3 r1) {
            r0 = this;
            r0.setParentLayoutCoordinates(r1)
            r0.o()
            return
    }

    public final void q() {
            r13 = this;
            m93 r3 = r13.u0
            if (r3 != 0) goto L5
            goto L61
        L5:
            q93 r0 = r13.m0getPopupContentSizebOM6tXw()
            if (r0 == 0) goto L61
            long r6 = r0.a
            m93 r0 = r13.getDisplayBounds()
            int r1 = r0.c
            int r2 = r0.a
            int r1 = r1 - r2
            int r0 = r0.a()
            long r1 = (long) r1
            r8 = 32
            long r1 = r1 << r8
            long r4 = (long) r0
            r9 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r9
            long r4 = r4 | r1
            ch5 r1 = new ch5
            r1.<init>()
            r11 = 0
            r1.A = r11
            hh2 r11 = defpackage.hh2.o0
            b05 r0 = new b05
            r2 = r13
            r0.<init>(r1, r2, r3, r4, r6)
            qm6 r13 = r2.x0
            r13.d(r2, r11, r0)
            long r0 = r1.A
            long r6 = r0 >> r8
            int r13 = (int) r6
            android.view.WindowManager$LayoutParams r3 = r2.p0
            r3.x = r13
            long r0 = r0 & r9
            int r13 = (int) r0
            r3.y = r13
            g05 r13 = r2.j0
            boolean r13 = r13.e
            q61 r0 = r2.n0
            if (r13 == 0) goto L59
            long r6 = r4 >> r8
            int r13 = (int) r6
            long r4 = r4 & r9
            int r1 = (int) r4
            r0.p(r2, r13, r1)
        L59:
            r0.getClass()
            android.view.WindowManager r13 = r2.o0
            r13.updateViewLayout(r2, r3)
        L61:
            return
    }

    @Override // android.view.View
    public void setLayoutDirection(int r1) {
            r0 = this;
            return
    }

    public final void setParentLayoutDirection(defpackage.kk3 r1) {
            r0 = this;
            r0.r0 = r1
            return
    }

    /* renamed from: setPopupContentSize-fhxjrPA  reason: not valid java name */
    public final void m1setPopupContentSizefhxjrPA(defpackage.q93 r1) {
            r0 = this;
            vs4 r0 = r0.s0
            r0.setValue(r1)
            return
    }

    public final void setPositionProvider(defpackage.f05 r1) {
            r0 = this;
            r0.q0 = r1
            return
    }

    public final void setTestTag(java.lang.String r1) {
            r0 = this;
            r0.k0 = r1
            return
    }
}
