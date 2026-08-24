package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: p0  reason: default package */
/* loaded from: classes.dex */
public abstract class p0 extends android.view.ViewGroup {
    public java.lang.ref.WeakReference A;
    public android.os.IBinder B;
    public defpackage.xx7 L;
    public defpackage.zx0 R;
    public defpackage.mx0 d0;
    public defpackage.on2 e0;
    public boolean f0;
    public boolean g0;
    public boolean h0;

    public p0(android.content.Context r3, android.util.AttributeSet r4) {
            r2 = this;
            r0 = 0
            r2.<init>(r3, r4, r0)
            r2.setClipChildren(r0)
            r2.setClipToPadding(r0)
            r3 = 1
            r2.setImportantForAccessibility(r3)
            wh r3 = new wh
            r4 = 7
            r3.<init>(r2, r4)
            r2.addOnAttachStateChangeListener(r3)
            do7 r4 = new do7
            r4.<init>(r2)
            sz4 r0 = defpackage.bl2.D(r2)
            java.util.ArrayList r0 = r0.a
            r0.add(r4)
            mf1 r0 = new mf1
            r1 = 2
            r0.<init>(r2, r3, r4, r1)
            r2.e0 = r0
            return
    }

    public static /* synthetic */ void getComposeViewContext$ui$annotations() {
            return
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
            return
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
            return
    }

    private final void setParentContext(defpackage.zx0 r2) {
            r1 = this;
            zx0 r0 = r1.R
            if (r0 == r2) goto L1d
            r1.R = r2
            r0 = 0
            if (r2 == 0) goto Lb
            r1.A = r0
        Lb:
            xx7 r2 = r1.L
            if (r2 == 0) goto L1d
            r2.a()
            r1.L = r0
            boolean r2 = r1.isAttachedToWindow()
            if (r2 == 0) goto L1d
            r1.f()
        L1d:
            return
    }

    private final void setPreviousAttachedWindowToken(android.os.IBinder r2) {
            r1 = this;
            android.os.IBinder r0 = r1.B
            if (r0 == r2) goto L9
            r1.B = r2
            r2 = 0
            r1.A = r2
        L9:
            return
    }

    public abstract void a(defpackage.px0 r1, int r2);

    @Override // android.view.ViewGroup
    public final void addView(android.view.View r1) {
            r0 = this;
            r0.c()
            super.addView(r1)
            return
    }

    @Override // android.view.ViewGroup
    public final void addView(android.view.View r1, int r2) {
            r0 = this;
            r0.c()
            super.addView(r1, r2)
            return
    }

    @Override // android.view.ViewGroup
    public final void addView(android.view.View r1, int r2, int r3) {
            r0 = this;
            r0.c()
            super.addView(r1, r2, r3)
            return
    }

    @Override // android.view.ViewGroup
    public final void addView(android.view.View r1, int r2, android.view.ViewGroup.LayoutParams r3) {
            r0 = this;
            r0.c()
            super.addView(r1, r2, r3)
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(android.view.View r1, android.view.ViewGroup.LayoutParams r2) {
            r0 = this;
            r0.c()
            super.addView(r1, r2)
            return
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(android.view.View r1, int r2, android.view.ViewGroup.LayoutParams r3) {
            r0 = this;
            r0.c()
            boolean r0 = super.addViewInLayout(r1, r2, r3)
            return r0
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(android.view.View r1, int r2, android.view.ViewGroup.LayoutParams r3, boolean r4) {
            r0 = this;
            r0.c()
            boolean r0 = super.addViewInLayout(r1, r2, r3, r4)
            return r0
    }

    public final void b() {
            r3 = this;
            boolean r0 = r3.isAttachedToWindow()
            if (r0 != 0) goto L7
            goto L40
        L7:
            android.os.IBinder r0 = r3.getWindowToken()
            r3.setPreviousAttachedWindowToken(r0)
            mx0 r0 = r3.d0
            if (r0 != 0) goto L37
            int r0 = r3.getChildCount()
            r1 = 0
            if (r0 != 0) goto L1a
            goto L26
        L1a:
            r0 = 0
            android.view.View r0 = r3.getChildAt(r0)
            boolean r2 = r0 instanceof defpackage.te
            if (r2 == 0) goto L26
            r1 = r0
            te r1 = (defpackage.te) r1
        L26:
            if (r1 == 0) goto L37
            mx0 r0 = r1.getComposeViewContext()
            android.view.View r2 = defpackage.vy7.i0(r3)
            mx0 r0 = r3.k(r2, r0)
            r1.setComposeViewContext(r0)
        L37:
            boolean r0 = r3.getShouldCreateCompositionOnAttachedToWindow()
            if (r0 == 0) goto L40
            r3.f()
        L40:
            return
    }

    public final void c() {
            r3 = this;
            boolean r0 = r3.g0
            if (r0 == 0) goto L5
            return
        L5:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getSimpleName()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Cannot add views to "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r3 = "; only Compose content is supported"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    public final void d() {
            r2 = this;
            zx0 r0 = r2.R
            if (r0 != 0) goto L20
            boolean r0 = r2.isAttachedToWindow()
            if (r0 != 0) goto L20
            mx0 r0 = r2.d0
            if (r0 == 0) goto L1a
            android.view.View r0 = r0.a
            if (r0 == 0) goto L1a
            boolean r0 = r0.isAttachedToWindow()
            r1 = 1
            if (r0 != r1) goto L1a
            goto L20
        L1a:
            java.lang.String r2 = "createComposition requires a previous call to createComposition(ComposeViewContext), a parent reference, or the View to be attached to a window. Attach the View or call setParentCompositionReference."
            defpackage.i.m(r2)
            return
        L20:
            r2.f()
            return
    }

    public final void e() {
            r4 = this;
            r0 = 0
            android.view.View r1 = r4.getChildAt(r0)
            boolean r2 = r1 instanceof defpackage.te
            r3 = 0
            if (r2 == 0) goto Ld
            te r1 = (defpackage.te) r1
            goto Le
        Ld:
            r1 = r3
        Le:
            if (r1 == 0) goto L1d
            boolean r2 = r1.E1
            if (r2 == 0) goto L1d
            mx0 r2 = r1.getComposeViewContext()
            r2.b()
            r1.E1 = r0
        L1d:
            xx7 r0 = r4.L
            if (r0 == 0) goto L24
            r0.a()
        L24:
            r4.L = r3
            r4.requestLayout()
            return
    }

    public final void f() {
            r6 = this;
            xx7 r0 = r6.L
            if (r0 != 0) goto L3a
            r0 = 0
            r1 = 1
            r6.g0 = r1     // Catch: java.lang.Throwable -> L31
            java.lang.String r2 = "Compose:initializeView"
            android.os.Trace.beginSection(r2)     // Catch: java.lang.Throwable -> L31
            mx0 r2 = r6.d0     // Catch: java.lang.Throwable -> L16
            if (r2 != 0) goto L18
            mx0 r2 = r6.i()     // Catch: java.lang.Throwable -> L16
            goto L18
        L16:
            r1 = move-exception
            goto L33
        L18:
            o0 r3 = new o0     // Catch: java.lang.Throwable -> L16
            r3.<init>(r6, r0)     // Catch: java.lang.Throwable -> L16
            zv0 r4 = new zv0     // Catch: java.lang.Throwable -> L16
            r5 = 1003123809(0x3bca7461, float:0.006178424)
            r4.<init>(r5, r1, r3)     // Catch: java.lang.Throwable -> L16
            xx7 r1 = defpackage.zx7.a(r6, r2, r4)     // Catch: java.lang.Throwable -> L16
            r6.L = r1     // Catch: java.lang.Throwable -> L16
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L31
            r6.g0 = r0
            return
        L31:
            r1 = move-exception
            goto L37
        L33:
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L31
            throw r1     // Catch: java.lang.Throwable -> L31
        L37:
            r6.g0 = r0
            throw r1
        L3a:
            return
    }

    public void g(boolean r3, int r4, int r5, int r6, int r7) {
            r2 = this;
            r3 = 0
            android.view.View r3 = r2.getChildAt(r3)
            if (r3 == 0) goto L1e
            int r0 = r2.getPaddingLeft()
            int r1 = r2.getPaddingTop()
            int r6 = r6 - r4
            int r4 = r2.getPaddingRight()
            int r6 = r6 - r4
            int r7 = r7 - r5
            int r2 = r2.getPaddingBottom()
            int r7 = r7 - r2
            r3.layout(r0, r1, r6, r7)
        L1e:
            return
    }

    /* renamed from: getAutoClearFocusBehavior-4UtRPd4  reason: not valid java name */
    public final int m6getAutoClearFocusBehavior4UtRPd4() {
            r1 = this;
            r0 = 2131427439(0x7f0b006f, float:1.8476494E38)
            java.lang.Object r1 = r1.getTag(r0)
            boolean r0 = r1 instanceof defpackage.jx
            if (r0 == 0) goto Le
            jx r1 = (defpackage.jx) r1
            goto Lf
        Le:
            r1 = 0
        Lf:
            if (r1 == 0) goto L14
            int r1 = r1.a
            return r1
        L14:
            r1 = 1
            return r1
    }

    public final defpackage.mx0 getComposeViewContext$ui() {
            r0 = this;
            mx0 r0 = r0.d0
            return r0
    }

    public final boolean getHasComposition() {
            r0 = this;
            xx7 r0 = r0.L
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
            r0 = this;
            r0 = 1
            return r0
    }

    public final boolean getShowLayoutBounds() {
            r0 = this;
            boolean r0 = r0.f0
            return r0
    }

    public void h(int r6, int r7) {
            r5 = this;
            r0 = 0
            android.view.View r1 = r5.getChildAt(r0)
            if (r1 != 0) goto Lb
            super.onMeasure(r6, r7)
            return
        Lb:
            int r2 = android.view.View.MeasureSpec.getSize(r6)
            int r3 = r5.getPaddingLeft()
            int r2 = r2 - r3
            int r3 = r5.getPaddingRight()
            int r2 = r2 - r3
            int r2 = java.lang.Math.max(r0, r2)
            int r3 = android.view.View.MeasureSpec.getSize(r7)
            int r4 = r5.getPaddingTop()
            int r3 = r3 - r4
            int r4 = r5.getPaddingBottom()
            int r3 = r3 - r4
            int r0 = java.lang.Math.max(r0, r3)
            int r6 = android.view.View.MeasureSpec.getMode(r6)
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r6)
            int r7 = android.view.View.MeasureSpec.getMode(r7)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r7)
            r1.measure(r6, r7)
            int r6 = r1.getMeasuredWidth()
            int r7 = r5.getPaddingLeft()
            int r7 = r7 + r6
            int r6 = r5.getPaddingRight()
            int r6 = r6 + r7
            int r7 = r1.getMeasuredHeight()
            int r0 = r5.getPaddingTop()
            int r0 = r0 + r7
            int r7 = r5.getPaddingBottom()
            int r7 = r7 + r0
            r5.setMeasuredDimension(r6, r7)
            return
    }

    public final defpackage.mx0 i() {
            r9 = this;
            int r0 = r9.getChildCount()
            r1 = 0
            if (r0 != 0) goto L9
        L7:
            r0 = r1
            goto L1c
        L9:
            r0 = 0
            android.view.View r0 = r9.getChildAt(r0)
            boolean r2 = r0 instanceof defpackage.te
            if (r2 == 0) goto L15
            te r0 = (defpackage.te) r0
            goto L16
        L15:
            r0 = r1
        L16:
            if (r0 == 0) goto L7
            mx0 r0 = r0.getComposeViewContext()
        L1c:
            android.view.View r4 = defpackage.vy7.i0(r9)
            mx0 r2 = defpackage.vy7.l0(r4)
            if (r2 != 0) goto L7c
            zx0 r5 = r9.j()
            hu3 r9 = defpackage.bl2.B(r4)
            if (r9 != 0) goto L38
            if (r0 == 0) goto L35
            hu3 r9 = r0.c
            goto L36
        L35:
            r9 = r1
        L36:
            if (r9 == 0) goto L3a
        L38:
            r6 = r9
            goto L40
        L3a:
            java.lang.String r9 = "Composed into the View which doesn't propagate ViewTreeLifecycleOwner!"
            defpackage.i.m(r9)
            return r1
        L40:
            g56 r9 = defpackage.kn2.C(r4)
            if (r9 != 0) goto L4e
            if (r0 == 0) goto L4b
            g56 r9 = r0.d
            goto L4c
        L4b:
            r9 = r1
        L4c:
            if (r9 == 0) goto L50
        L4e:
            r7 = r9
            goto L56
        L50:
            java.lang.String r9 = "Composed into the View which doesn't propagate ViewTreeSavedStateRegistryOwner!"
            defpackage.i.m(r9)
            return r1
        L56:
            bp7 r9 = defpackage.ln2.r(r4)
            if (r9 != 0) goto L62
            if (r0 == 0) goto L60
            bp7 r1 = r0.e
        L60:
            r8 = r1
            goto L63
        L62:
            r8 = r9
        L63:
            mx0 r2 = new mx0
            android.view.View r9 = defpackage.vy7.i0(r4)
            mx0 r3 = defpackage.vy7.l0(r9)
            r2.<init>(r3, r4, r5, r6, r7, r8)
            java.lang.ref.WeakReference r9 = new java.lang.ref.WeakReference
            r9.<init>(r2)
            r0 = 2131427423(0x7f0b005f, float:1.8476462E38)
            r4.setTag(r0, r9)
            return r2
        L7c:
            mx0 r9 = r9.k(r4, r2)
            return r9
    }

    @Override // android.view.ViewGroup
    public final boolean isTransitionGroup() {
            r1 = this;
            boolean r0 = r1.h0
            if (r0 == 0) goto Ld
            boolean r1 = super.isTransitionGroup()
            if (r1 == 0) goto Lb
            goto Ld
        Lb:
            r1 = 0
            return r1
        Ld:
            r1 = 1
            return r1
    }

    public final defpackage.zx0 j() {
            r11 = this;
            zx0 r0 = r11.R
            if (r0 != 0) goto L1cc
            zx0 r0 = defpackage.uv7.a(r11)
            if (r0 == 0) goto Lb
            goto L20
        Lb:
            android.view.ViewParent r1 = r11.getParent()
        Lf:
            if (r0 != 0) goto L20
            boolean r2 = r1 instanceof android.view.View
            if (r2 == 0) goto L20
            android.view.View r1 = (android.view.View) r1
            zx0 r0 = defpackage.uv7.a(r1)
            android.view.ViewParent r1 = defpackage.xk2.s(r1)
            goto Lf
        L20:
            r1 = 0
            if (r0 == 0) goto L48
            boolean r2 = r0 instanceof defpackage.if5
            if (r2 == 0) goto L3d
            r2 = r0
            if5 r2 = (defpackage.if5) r2
            tp6 r2 = r2.u
            java.lang.Object r2 = r2.getValue()
            ff5 r2 = (defpackage.ff5) r2
            ff5 r3 = defpackage.ff5.ShuttingDown
            int r2 = r2.compareTo(r3)
            if (r2 <= 0) goto L3b
            goto L3d
        L3b:
            r2 = r1
            goto L3e
        L3d:
            r2 = r0
        L3e:
            if (r2 == 0) goto L49
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r3.<init>(r2)
            r11.A = r3
            goto L49
        L48:
            r0 = r1
        L49:
            if (r0 != 0) goto L1cc
            java.lang.ref.WeakReference r0 = r11.A
            if (r0 == 0) goto L6f
            java.lang.Object r0 = r0.get()
            zx0 r0 = (defpackage.zx0) r0
            if (r0 == 0) goto L6f
            boolean r2 = r0 instanceof defpackage.if5
            if (r2 == 0) goto L70
            r2 = r0
            if5 r2 = (defpackage.if5) r2
            tp6 r2 = r2.u
            java.lang.Object r2 = r2.getValue()
            ff5 r2 = (defpackage.ff5) r2
            ff5 r3 = defpackage.ff5.ShuttingDown
            int r2 = r2.compareTo(r3)
            if (r2 <= 0) goto L6f
            goto L70
        L6f:
            r0 = r1
        L70:
            if (r0 != 0) goto L1cc
            boolean r0 = r11.isAttachedToWindow()
            if (r0 != 0) goto L8e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Cannot locate windowRecomposer; View "
            r0.<init>(r2)
            r0.append(r11)
            java.lang.String r2 = " is not attached to a window"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            defpackage.p53.c(r0)
        L8e:
            android.view.ViewParent r0 = defpackage.xk2.s(r11)
            r2 = r11
        L93:
            boolean r3 = r0 instanceof android.view.View
            if (r3 == 0) goto Lab
            android.view.View r0 = (android.view.View) r0
            int r3 = r0.getId()
            r4 = 16908290(0x1020002, float:2.3877235E-38)
            if (r3 != r4) goto La3
            goto Lab
        La3:
            android.view.ViewParent r2 = r0.getParent()
            r10 = r2
            r2 = r0
            r0 = r10
            goto L93
        Lab:
            zx0 r0 = defpackage.uv7.a(r2)
            if (r0 != 0) goto L1a4
            java.util.concurrent.atomic.AtomicReference r0 = defpackage.rv7.a
            java.lang.Object r0 = r0.get()
            qv7 r0 = (defpackage.qv7) r0
            r0.getClass()
            vt1 r0 = defpackage.vt1.A
            ex6 r3 = defpackage.sm.i0
            android.os.Looper r3 = android.os.Looper.myLooper()
            android.os.Looper r4 = android.os.Looper.getMainLooper()
            if (r3 != r4) goto Ld3
            ex6 r3 = defpackage.sm.i0
            java.lang.Object r3 = r3.getValue()
            l61 r3 = (defpackage.l61) r3
            goto Ldd
        Ld3:
            qm r3 = defpackage.sm.j0
            java.lang.Object r3 = r3.get()
            l61 r3 = (defpackage.l61) r3
            if (r3 == 0) goto L19e
        Ldd:
            l61 r3 = r3.N(r0)
            vs0 r4 = defpackage.vs0.i0
            j61 r4 = r3.Z(r4)
            um r4 = (defpackage.um) r4
            r5 = 0
            if (r4 == 0) goto Lff
            um r6 = new um
            r6.<init>(r4)
            java.lang.Object r4 = r6.L
            bk1 r4 = (defpackage.bk1) r4
            java.lang.Object r7 = r4.L
            monitor-enter(r7)
            r4.A = r5     // Catch: java.lang.Throwable -> Lfc
            monitor-exit(r7)
            goto L100
        Lfc:
            r11 = move-exception
            monitor-exit(r7)
            throw r11
        Lff:
            r6 = r1
        L100:
            dh5 r4 = new dh5
            r4.<init>()
            cs1 r7 = defpackage.cs1.f0
            j61 r7 = r3.Z(r7)
            n74 r7 = (defpackage.n74) r7
            if (r7 != 0) goto L11e
            o74 r7 = new o74
            android.content.Context r8 = r2.getContext()
            android.content.Context r8 = r8.getApplicationContext()
            r7.<init>(r8)
            r4.A = r7
        L11e:
            if (r6 == 0) goto L121
            r0 = r6
        L121:
            l61 r0 = r3.N(r0)
            l61 r0 = r0.N(r7)
            if5 r3 = new if5
            r3.<init>(r0)
            java.lang.Object r7 = r3.c
            monitor-enter(r7)
            r8 = 1
            r3.t = r8     // Catch: java.lang.Throwable -> L19b
            monitor-exit(r7)
            o41 r0 = defpackage.g04.i(r0)
            hu3 r7 = defpackage.bl2.B(r2)
            if (r7 == 0) goto L144
            ut3 r7 = r7.getLifecycle()
            goto L145
        L144:
            r7 = r1
        L145:
            if (r7 == 0) goto L186
            wh6 r8 = new wh6
            r9 = 3
            r8.<init>(r2, r3, r9)
            r2.addOnAttachStateChangeListener(r8)
            tv7 r8 = new tv7
            r8.<init>(r0, r6, r3, r4)
            r7.a(r8)
            r0 = 2131427424(0x7f0b0060, float:1.8476464E38)
            r2.setTag(r0, r3)
            ms2 r0 = defpackage.ms2.A
            android.os.Handler r4 = r2.getHandler()
            java.lang.String r6 = "windowRecomposer cleanup"
            int r7 = defpackage.lv2.a
            jv2 r7 = new jv2
            r7.<init>(r4, r6, r5)
            jv2 r4 = r7.Y
            bf4 r5 = new bf4
            r6 = 29
            r5.<init>(r3, r2, r1, r6)
            r6 = 2
            ap6 r0 = defpackage.hv.L(r0, r4, r1, r5, r6)
            wh r4 = new wh
            r5 = 8
            r4.<init>(r0, r5)
            r2.addOnAttachStateChangeListener(r4)
            goto L1ab
        L186:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r0 = "ViewTreeLifecycleOwner not found from "
            r11.<init>(r0)
            r11.append(r2)
            java.lang.String r11 = r11.toString()
            defpackage.p53.d(r11)
            defpackage.e41.c()
            return r1
        L19b:
            r11 = move-exception
            monitor-exit(r7)
            throw r11
        L19e:
            java.lang.String r11 = "no AndroidUiDispatcher for this thread"
            defpackage.i.m(r11)
            return r1
        L1a4:
            boolean r2 = r0 instanceof defpackage.if5
            if (r2 == 0) goto L1c6
            r3 = r0
            if5 r3 = (defpackage.if5) r3
        L1ab:
            tp6 r0 = r3.u
            java.lang.Object r0 = r0.getValue()
            ff5 r0 = (defpackage.ff5) r0
            ff5 r2 = defpackage.ff5.ShuttingDown
            int r0 = r0.compareTo(r2)
            if (r0 <= 0) goto L1bc
            r1 = r3
        L1bc:
            if (r1 == 0) goto L1c5
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r1)
            r11.A = r0
        L1c5:
            return r3
        L1c6:
            java.lang.String r11 = "root viewTreeParentCompositionContext is not a Recomposer"
            defpackage.i.m(r11)
            return r1
        L1cc:
            return r0
    }

    public final defpackage.mx0 k(android.view.View r9, defpackage.mx0 r10) {
            r8 = this;
            zx0 r3 = r8.j()
            hu3 r0 = defpackage.bl2.B(r9)
            bp7 r6 = defpackage.ln2.r(r9)
            g56 r1 = defpackage.kn2.C(r9)
            zx0 r2 = r10.b
            g56 r4 = r10.d
            hu3 r5 = r10.c
            if (r3 != r2) goto L21
            if (r0 != r5) goto L21
            bp7 r2 = r10.e
            if (r6 != r2) goto L21
            if (r1 != r4) goto L21
            return r10
        L21:
            l61 r2 = r3.j()
            zx0 r7 = r10.b
            l61 r7 = r7.j()
            if (r2 == r7) goto L30
            r8.e()
        L30:
            if (r0 != 0) goto L33
            r0 = r5
        L33:
            if (r1 != 0) goto L38
            r5 = r4
        L36:
            r4 = r0
            goto L3a
        L38:
            r5 = r1
            goto L36
        L3a:
            mx0 r0 = new mx0
            r2 = r9
            r1 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            java.lang.ref.WeakReference r8 = new java.lang.ref.WeakReference
            r8.<init>(r0)
            r9 = 2131427423(0x7f0b005f, float:1.8476462E38)
            r2.setTag(r9, r8)
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
            r5 = this;
            super.onAttachedToWindow()
            ja4 r0 = defpackage.uv7.a
            android.view.ViewParent r0 = defpackage.xk2.s(r5)
            r1 = r5
        La:
            boolean r2 = r0 instanceof android.view.View
            if (r2 == 0) goto L22
            android.view.View r0 = (android.view.View) r0
            int r2 = r0.getId()
            r3 = 16908290(0x1020002, float:2.3877235E-38)
            if (r2 != r3) goto L1a
            goto L22
        L1a:
            android.view.ViewParent r1 = r0.getParent()
            r4 = r1
            r1 = r0
            r0 = r4
            goto La
        L22:
            android.view.ViewParent r0 = r1.getParent()
            if (r0 != 0) goto L36
            android.os.Handler r0 = r5.getHandler()
            n0 r1 = new n0
            r2 = 0
            r1.<init>(r5, r2)
            r0.postAtFrontOfQueue(r1)
            return
        L36:
            r5.b()
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            r0.g(r1, r2, r3, r4, r5)
            return
    }

    @Override // android.view.View
    public final void onMeasure(int r1, int r2) {
            r0 = this;
            r0.f()
            r0.h(r1, r2)
            return
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int r2) {
            r1 = this;
            r0 = 0
            android.view.View r1 = r1.getChildAt(r0)
            if (r1 == 0) goto La
            r1.setLayoutDirection(r2)
        La:
            return
    }

    /* renamed from: setAutoClearFocusBehavior-17tfJxM  reason: not valid java name */
    public final void m7setAutoClearFocusBehavior17tfJxM(int r2) {
            r1 = this;
            jx r0 = new jx
            r0.<init>(r2)
            r2 = 2131427439(0x7f0b006f, float:1.8476494E38)
            r1.setTag(r2, r0)
            return
    }

    public final void setComposeViewContext$ui(defpackage.mx0 r4) {
            r3 = this;
            mx0 r0 = r3.d0
            if (r0 == r4) goto L33
            if (r4 != 0) goto La
            r3.e()
            goto L31
        La:
            int r0 = r3.getChildCount()
            if (r0 == 0) goto L31
            r0 = 0
            android.view.View r0 = r3.getChildAt(r0)
            boolean r1 = r0 instanceof defpackage.te
            if (r1 == 0) goto L1c
            te r0 = (defpackage.te) r0
            goto L1d
        L1c:
            r0 = 0
        L1d:
            if (r0 == 0) goto L31
            l61 r1 = r0.getCoroutineContext()
            zx0 r2 = r4.b
            l61 r2 = r2.j()
            if (r1 == r2) goto L2e
            r3.e()
        L2e:
            r0.setComposeViewContext(r4)
        L31:
            r3.d0 = r4
        L33:
            return
    }

    public final void setParentCompositionContext(defpackage.zx0 r1) {
            r0 = this;
            r0.setParentContext(r1)
            return
    }

    public final void setShowLayoutBounds(boolean r2) {
            r1 = this;
            r1.f0 = r2
            r0 = 0
            android.view.View r1 = r1.getChildAt(r0)
            if (r1 == 0) goto L10
            zp4 r1 = (defpackage.zp4) r1
            te r1 = (defpackage.te) r1
            r1.setShowLayoutBounds(r2)
        L10:
            return
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean r1) {
            r0 = this;
            super.setTransitionGroup(r1)
            r1 = 1
            r0.h0 = r1
            return
    }

    public final void setViewCompositionStrategy(defpackage.eo7 r2) {
            r1 = this;
            on2 r0 = r1.e0
            if (r0 == 0) goto L7
            r0.c()
        L7:
            on2 r2 = r2.e(r1)
            r1.e0 = r2
            return
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
            r0 = this;
            r0 = 0
            return r0
    }
}
