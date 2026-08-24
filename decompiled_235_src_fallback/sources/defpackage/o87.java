package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: o87  reason: default package */
/* loaded from: classes.dex */
public final class o87 implements android.view.View.OnLongClickListener, android.view.View.OnHoverListener, android.view.View.OnAttachStateChangeListener {
    public static defpackage.o87 g0;
    public static defpackage.o87 h0;
    public final android.view.View A;
    public final java.lang.CharSequence B;
    public final int L;
    public final defpackage.n87 R;
    public final defpackage.n87 X;
    public int Y;
    public int Z;
    public defpackage.p87 d0;
    public boolean e0;
    public boolean f0;

    public o87(android.view.View r4, java.lang.CharSequence r5) {
            r3 = this;
            r3.<init>()
            n87 r0 = new n87
            r1 = 0
            r0.<init>(r3, r1)
            r3.R = r0
            n87 r0 = new n87
            r1 = 1
            r0.<init>(r3, r1)
            r3.X = r0
            r3.A = r4
            r3.B = r5
            android.content.Context r5 = r4.getContext()
            android.view.ViewConfiguration r5 = android.view.ViewConfiguration.get(r5)
            java.lang.reflect.Method r0 = defpackage.go7.a
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r0 < r2) goto L2c
            int r5 = defpackage.pp.p(r5)
            goto L32
        L2c:
            int r5 = r5.getScaledTouchSlop()
            int r5 = r5 / 2
        L32:
            r3.L = r5
            r3.f0 = r1
            r4.setOnLongClickListener(r3)
            r4.setOnHoverListener(r3)
            return
    }

    public static void b(defpackage.o87 r3) {
            o87 r0 = defpackage.o87.g0
            if (r0 == 0) goto Lb
            android.view.View r1 = r0.A
            n87 r0 = r0.R
            r1.removeCallbacks(r0)
        Lb:
            defpackage.o87.g0 = r3
            if (r3 == 0) goto L1b
            android.view.View r0 = r3.A
            n87 r3 = r3.R
            int r1 = android.view.ViewConfiguration.getLongPressTimeout()
            long r1 = (long) r1
            r0.postDelayed(r3, r1)
        L1b:
            return
    }

    public final void a() {
            r5 = this;
            o87 r0 = defpackage.o87.h0
            android.view.View r1 = r5.A
            r2 = 0
            if (r0 != r5) goto L36
            defpackage.o87.h0 = r2
            p87 r0 = r5.d0
            if (r0 == 0) goto L2f
            java.lang.Object r3 = r0.b
            android.view.View r3 = (android.view.View) r3
            android.view.ViewParent r4 = r3.getParent()
            if (r4 == 0) goto L26
            java.lang.Object r0 = r0.a
            android.content.Context r0 = (android.content.Context) r0
            java.lang.String r4 = "window"
            java.lang.Object r0 = r0.getSystemService(r4)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            r0.removeView(r3)
        L26:
            r5.d0 = r2
            r0 = 1
            r5.f0 = r0
            r1.removeOnAttachStateChangeListener(r5)
            goto L36
        L2f:
            java.lang.String r0 = "TooltipCompatHandler"
            java.lang.String r3 = "sActiveHandler.mPopup == null"
            android.util.Log.e(r0, r3)
        L36:
            o87 r0 = defpackage.o87.g0
            if (r0 != r5) goto L3d
            b(r2)
        L3d:
            n87 r5 = r5.X
            r1.removeCallbacks(r5)
            return
    }

    public final void c(boolean r22) {
            r21 = this;
            r0 = r21
            android.view.View r1 = r0.A
            boolean r2 = r1.isAttachedToWindow()
            if (r2 != 0) goto Lb
            return
        Lb:
            r2 = 0
            b(r2)
            o87 r3 = defpackage.o87.h0
            if (r3 == 0) goto L16
            r3.a()
        L16:
            defpackage.o87.h0 = r0
            r3 = r22
            r0.e0 = r3
            p87 r3 = new p87
            android.content.Context r4 = r1.getContext()
            r3.<init>()
            android.view.WindowManager$LayoutParams r5 = new android.view.WindowManager$LayoutParams
            r5.<init>()
            r3.d = r5
            android.graphics.Rect r6 = new android.graphics.Rect
            r6.<init>()
            r3.e = r6
            r6 = 2
            int[] r7 = new int[r6]
            r3.f = r7
            int[] r7 = new int[r6]
            r3.g = r7
            r3.a = r4
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r4)
            r8 = 2131623963(0x7f0e001b, float:1.8875092E38)
            android.view.View r2 = r7.inflate(r8, r2)
            r3.b = r2
            r7 = 2131427717(0x7f0b0185, float:1.8477058E38)
            android.view.View r2 = r2.findViewById(r7)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r3.c = r2
            java.lang.Class<p87> r2 = defpackage.p87.class
            java.lang.String r2 = r2.getSimpleName()
            r5.setTitle(r2)
            java.lang.String r2 = r4.getPackageName()
            r5.packageName = r2
            r2 = 1002(0x3ea, float:1.404E-42)
            r5.type = r2
            r2 = -2
            r5.width = r2
            r5.height = r2
            r2 = -3
            r5.format = r2
            r2 = 2132017156(0x7f140004, float:1.9672582E38)
            r5.windowAnimations = r2
            r2 = 24
            r5.flags = r2
            java.lang.Object r2 = r3.b
            android.view.View r2 = (android.view.View) r2
            java.lang.Object r4 = r3.a
            android.content.Context r4 = (android.content.Context) r4
            r0.d0 = r3
            int r5 = r0.Y
            int r7 = r0.Z
            boolean r8 = r0.e0
            java.lang.Object r9 = r3.d
            android.view.WindowManager$LayoutParams r9 = (android.view.WindowManager.LayoutParams) r9
            android.view.ViewParent r10 = r2.getParent()
            java.lang.String r11 = "window"
            if (r10 == 0) goto La5
            android.view.ViewParent r10 = r2.getParent()
            if (r10 == 0) goto La5
            java.lang.Object r10 = r4.getSystemService(r11)
            android.view.WindowManager r10 = (android.view.WindowManager) r10
            r10.removeView(r2)
        La5:
            java.lang.Object r10 = r3.c
            android.widget.TextView r10 = (android.widget.TextView) r10
            java.lang.CharSequence r12 = r0.B
            r10.setText(r12)
            java.lang.Object r10 = r3.g
            int[] r10 = (int[]) r10
            java.lang.Object r12 = r3.f
            int[] r12 = (int[]) r12
            java.lang.Object r3 = r3.e
            android.graphics.Rect r3 = (android.graphics.Rect) r3
            android.os.IBinder r13 = r1.getApplicationWindowToken()
            r9.token = r13
            android.content.res.Resources r13 = r4.getResources()
            r14 = 2131166226(0x7f070412, float:1.7946691E38)
            int r13 = r13.getDimensionPixelOffset(r14)
            int r14 = r1.getWidth()
            if (r14 < r13) goto Ld2
            goto Ld7
        Ld2:
            int r5 = r1.getWidth()
            int r5 = r5 / r6
        Ld7:
            int r14 = r1.getHeight()
            if (r14 < r13) goto Lec
            android.content.res.Resources r13 = r4.getResources()
            r14 = 2131166225(0x7f070411, float:1.794669E38)
            int r13 = r13.getDimensionPixelOffset(r14)
            int r14 = r7 + r13
            int r7 = r7 - r13
            goto Lf1
        Lec:
            int r14 = r1.getHeight()
            r7 = 0
        Lf1:
            r13 = 49
            r9.gravity = r13
            android.content.res.Resources r13 = r4.getResources()
            if (r8 == 0) goto L101
            r16 = 2131166229(0x7f070415, float:1.7946697E38)
        Lfe:
            r15 = r16
            goto L105
        L101:
            r16 = 2131166228(0x7f070414, float:1.7946695E38)
            goto Lfe
        L105:
            int r13 = r13.getDimensionPixelOffset(r15)
            android.view.View r15 = r1.getRootView()
            android.view.ViewGroup$LayoutParams r6 = r15.getLayoutParams()
            r17 = r5
            boolean r5 = r6 instanceof android.view.WindowManager.LayoutParams
            if (r5 == 0) goto L11f
            android.view.WindowManager$LayoutParams r6 = (android.view.WindowManager.LayoutParams) r6
            int r5 = r6.type
            r6 = 2
            if (r5 != r6) goto L11f
            goto L13d
        L11f:
            android.content.Context r5 = r1.getContext()
        L123:
            boolean r6 = r5 instanceof android.content.ContextWrapper
            if (r6 == 0) goto L13d
            boolean r6 = r5 instanceof android.app.Activity
            if (r6 == 0) goto L136
            android.app.Activity r5 = (android.app.Activity) r5
            android.view.Window r5 = r5.getWindow()
            android.view.View r15 = r5.getDecorView()
            goto L13d
        L136:
            android.content.ContextWrapper r5 = (android.content.ContextWrapper) r5
            android.content.Context r5 = r5.getBaseContext()
            goto L123
        L13d:
            if (r15 != 0) goto L14a
            java.lang.String r3 = "TooltipPopup"
            java.lang.String r6 = "Cannot find app view"
            android.util.Log.e(r3, r6)
            r18 = 1
            goto L1cf
        L14a:
            r15.getWindowVisibleDisplayFrame(r3)
            int r6 = r3.left
            if (r6 >= 0) goto L17e
            int r6 = r3.top
            if (r6 >= 0) goto L17e
            android.content.res.Resources r6 = r4.getResources()
            r18 = 1
            java.lang.String r5 = "dimen"
            r19 = r7
            java.lang.String r7 = "android"
            r20 = r8
            java.lang.String r8 = "status_bar_height"
            int r5 = r6.getIdentifier(r8, r5, r7)
            if (r5 == 0) goto L170
            int r5 = r6.getDimensionPixelSize(r5)
            goto L171
        L170:
            r5 = 0
        L171:
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            int r7 = r6.widthPixels
            int r6 = r6.heightPixels
            r8 = 0
            r3.set(r8, r5, r7, r6)
            goto L185
        L17e:
            r19 = r7
            r20 = r8
            r8 = 0
            r18 = 1
        L185:
            r15.getLocationOnScreen(r10)
            r1.getLocationOnScreen(r12)
            r5 = r12[r8]
            r6 = r10[r8]
            int r5 = r5 - r6
            r12[r8] = r5
            r6 = r12[r18]
            r7 = r10[r18]
            int r6 = r6 - r7
            r12[r18] = r6
            int r5 = r5 + r17
            int r6 = r15.getWidth()
            r16 = 2
            int r6 = r6 / 2
            int r5 = r5 - r6
            r9.x = r5
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r8)
            r2.measure(r5, r5)
            int r5 = r2.getMeasuredHeight()
            r6 = r12[r18]
            int r7 = r6 + r19
            int r7 = r7 - r13
            int r7 = r7 - r5
            int r6 = r6 + r14
            int r6 = r6 + r13
            if (r20 == 0) goto L1c3
            if (r7 < 0) goto L1c0
            r9.y = r7
            goto L1cf
        L1c0:
            r9.y = r6
            goto L1cf
        L1c3:
            int r5 = r5 + r6
            int r3 = r3.height()
            if (r5 > r3) goto L1cd
            r9.y = r6
            goto L1cf
        L1cd:
            r9.y = r7
        L1cf:
            java.lang.Object r3 = r4.getSystemService(r11)
            android.view.WindowManager r3 = (android.view.WindowManager) r3
            r3.addView(r2, r9)
            r1.addOnAttachStateChangeListener(r0)
            boolean r2 = r0.e0
            if (r2 == 0) goto L1e2
            r2 = 2500(0x9c4, double:1.235E-320)
            goto L200
        L1e2:
            java.util.WeakHashMap r2 = defpackage.ao7.a
            int r2 = r1.getWindowSystemUiVisibility()
            r2 = r2 & 1
            r3 = r18
            if (r2 != r3) goto L1f8
            int r2 = android.view.ViewConfiguration.getLongPressTimeout()
            long r2 = (long) r2
            r4 = 3000(0xbb8, double:1.482E-320)
        L1f5:
            long r2 = r4 - r2
            goto L200
        L1f8:
            int r2 = android.view.ViewConfiguration.getLongPressTimeout()
            long r2 = (long) r2
            r4 = 15000(0x3a98, double:7.411E-320)
            goto L1f5
        L200:
            n87 r0 = r0.X
            r1.removeCallbacks(r0)
            r1.postDelayed(r0, r2)
            return
    }

    @Override // android.view.View.OnHoverListener
    public final boolean onHover(android.view.View r4, android.view.MotionEvent r5) {
            r3 = this;
            p87 r4 = r3.d0
            r0 = 0
            if (r4 == 0) goto La
            boolean r4 = r3.e0
            if (r4 == 0) goto La
            goto L6f
        La:
            android.view.View r4 = r3.A
            android.content.Context r1 = r4.getContext()
            java.lang.String r2 = "accessibility"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.view.accessibility.AccessibilityManager r1 = (android.view.accessibility.AccessibilityManager) r1
            boolean r2 = r1.isEnabled()
            if (r2 == 0) goto L25
            boolean r1 = r1.isTouchExplorationEnabled()
            if (r1 == 0) goto L25
            goto L6f
        L25:
            int r1 = r5.getAction()
            r2 = 7
            if (r1 == r2) goto L38
            r4 = 10
            if (r1 == r4) goto L31
            goto L6f
        L31:
            r4 = 1
            r3.f0 = r4
            r3.a()
            return r0
        L38:
            boolean r4 = r4.isEnabled()
            if (r4 == 0) goto L6f
            p87 r4 = r3.d0
            if (r4 != 0) goto L6f
            float r4 = r5.getX()
            int r4 = (int) r4
            float r5 = r5.getY()
            int r5 = (int) r5
            boolean r1 = r3.f0
            if (r1 != 0) goto L66
            int r1 = r3.Y
            int r1 = r4 - r1
            int r1 = java.lang.Math.abs(r1)
            int r2 = r3.L
            if (r1 > r2) goto L66
            int r1 = r3.Z
            int r1 = r5 - r1
            int r1 = java.lang.Math.abs(r1)
            if (r1 <= r2) goto L6f
        L66:
            r3.Y = r4
            r3.Z = r5
            r3.f0 = r0
            b(r3)
        L6f:
            return r0
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View r2) {
            r1 = this;
            int r0 = r2.getWidth()
            int r0 = r0 / 2
            r1.Y = r0
            int r2 = r2.getHeight()
            int r2 = r2 / 2
            r1.Z = r2
            r2 = 1
            r1.c(r2)
            return r2
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View r1) {
            r0 = this;
            return
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View r1) {
            r0 = this;
            r0.a()
            return
    }
}
