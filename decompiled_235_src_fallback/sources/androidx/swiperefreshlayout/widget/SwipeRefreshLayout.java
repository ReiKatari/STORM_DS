package androidx.swiperefreshlayout.widget;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class SwipeRefreshLayout extends android.view.ViewGroup implements defpackage.le4, defpackage.ke4 {
    public static final int[] H0 = null;
    public android.view.View A;
    public defpackage.sw6 A0;
    public boolean B;
    public defpackage.sw6 B0;
    public int C0;
    public boolean D0;
    public final defpackage.qw6 E0;
    public final defpackage.rw6 F0;
    public final defpackage.rw6 G0;
    public final int L;
    public float R;
    public float d0;
    public final defpackage.dy7 e0;
    public final defpackage.je4 f0;
    public final int[] g0;
    public final int[] h0;
    public final int[] i0;
    public boolean j0;
    public final int k0;
    public int l0;
    public float m0;
    public float n0;
    public boolean o0;
    public int p0;
    public final android.view.animation.DecelerateInterpolator q0;
    public final defpackage.sq0 r0;
    public int s0;
    public int t0;
    public final int u0;
    public final int v0;
    public int w0;
    public final defpackage.wq0 x0;
    public defpackage.rw6 y0;
    public defpackage.rw6 z0;

    static {
            r0 = 16842766(0x101000e, float:2.3693597E-38)
            int[] r0 = new int[]{r0}
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout.H0 = r0
            return
    }

    public SwipeRefreshLayout(android.content.Context r7, android.util.AttributeSet r8) {
            r6 = this;
            r6.<init>(r7, r8)
            r0 = 0
            r6.B = r0
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r6.R = r1
            r1 = 2
            int[] r2 = new int[r1]
            r6.g0 = r2
            int[] r2 = new int[r1]
            r6.h0 = r2
            int[] r2 = new int[r1]
            r6.i0 = r2
            r2 = -1
            r6.p0 = r2
            r6.s0 = r2
            qw6 r2 = new qw6
            r2.<init>(r6, r0)
            r6.E0 = r2
            rw6 r2 = new rw6
            r2.<init>(r6, r1)
            r6.F0 = r2
            rw6 r1 = new rw6
            r2 = 3
            r1.<init>(r6, r2)
            r6.G0 = r1
            android.view.ViewConfiguration r1 = android.view.ViewConfiguration.get(r7)
            int r1 = r1.getScaledTouchSlop()
            r6.L = r1
            android.content.res.Resources r1 = r6.getResources()
            r2 = 17694721(0x10e0001, float:2.6081284E-38)
            int r1 = r1.getInteger(r2)
            r6.k0 = r1
            r6.setWillNotDraw(r0)
            android.view.animation.DecelerateInterpolator r1 = new android.view.animation.DecelerateInterpolator
            r2 = 1073741824(0x40000000, float:2.0)
            r1.<init>(r2)
            r6.q0 = r1
            android.content.res.Resources r1 = r6.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            r2 = 1109393408(0x42200000, float:40.0)
            float r3 = r1.density
            float r3 = r3 * r2
            int r2 = (int) r3
            r6.C0 = r2
            sq0 r2 = new sq0
            android.content.Context r3 = r6.getContext()
            r2.<init>(r3)
            android.content.Context r3 = r2.getContext()
            android.content.res.Resources r3 = r3.getResources()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            android.content.Context r4 = r2.getContext()
            int[] r5 = defpackage.k75.a
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5)
            r5 = -328966(0xfffffffffffafafa, float:NaN)
            int r5 = r4.getColor(r0, r5)
            r2.B = r5
            r4.recycle()
            android.graphics.drawable.ShapeDrawable r4 = new android.graphics.drawable.ShapeDrawable
            android.graphics.drawable.shapes.OvalShape r5 = new android.graphics.drawable.shapes.OvalShape
            r5.<init>()
            r4.<init>(r5)
            r5 = 1082130432(0x40800000, float:4.0)
            float r3 = r3 * r5
            java.util.WeakHashMap r5 = defpackage.ao7.a
            r2.setElevation(r3)
            android.graphics.Paint r3 = r4.getPaint()
            int r5 = r2.B
            r3.setColor(r5)
            r2.setBackground(r4)
            r6.r0 = r2
            wq0 r2 = new wq0
            android.content.Context r3 = r6.getContext()
            r2.<init>(r3)
            r6.x0 = r2
            r3 = 1
            r2.c(r3)
            sq0 r2 = r6.r0
            wq0 r4 = r6.x0
            r2.setImageDrawable(r4)
            sq0 r2 = r6.r0
            r4 = 8
            r2.setVisibility(r4)
            sq0 r2 = r6.r0
            r6.addView(r2)
            r6.setChildrenDrawingOrderEnabled(r3)
            r2 = 1115684864(0x42800000, float:64.0)
            float r1 = r1.density
            float r1 = r1 * r2
            int r1 = (int) r1
            r6.v0 = r1
            float r1 = (float) r1
            r6.R = r1
            dy7 r1 = new dy7
            r1.<init>()
            r6.e0 = r1
            je4 r1 = new je4
            r1.<init>(r6)
            r6.f0 = r1
            r6.setNestedScrollingEnabled(r3)
            int r1 = r6.C0
            int r1 = -r1
            r6.l0 = r1
            r6.u0 = r1
            r1 = 1065353216(0x3f800000, float:1.0)
            r6.k(r1)
            int[] r1 = androidx.swiperefreshlayout.widget.SwipeRefreshLayout.H0
            android.content.res.TypedArray r7 = r7.obtainStyledAttributes(r8, r1)
            boolean r8 = r7.getBoolean(r0, r3)
            r6.setEnabled(r8)
            r7.recycle()
            return
    }

    private void setColorViewAlpha(int r2) {
            r1 = this;
            sq0 r0 = r1.r0
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            r0.setAlpha(r2)
            wq0 r1 = r1.x0
            r1.setAlpha(r2)
            return
    }

    @Override // defpackage.le4
    public final void a(android.view.View r10, int r11, int r12, int r13, int r14, int r15, int[] r16) {
            r9 = this;
            if (r15 == 0) goto L3
            goto L3e
        L3:
            r10 = 1
            r0 = r16[r10]
            if (r15 != 0) goto L16
            je4 r1 = r9.f0
            int[] r6 = r9.h0
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r7 = r15
            r8 = r16
            r1.d(r2, r3, r4, r5, r6, r7, r8)
        L16:
            r11 = r16[r10]
            int r11 = r11 - r0
            int r11 = r14 - r11
            if (r11 != 0) goto L23
            int[] r12 = r9.h0
            r12 = r12[r10]
            int r12 = r12 + r14
            goto L24
        L23:
            r12 = r11
        L24:
            if (r12 >= 0) goto L3e
            boolean r13 = r9.g()
            if (r13 != 0) goto L3e
            float r13 = r9.d0
            int r12 = java.lang.Math.abs(r12)
            float r12 = (float) r12
            float r13 = r13 + r12
            r9.d0 = r13
            r9.j(r13)
            r9 = r16[r10]
            int r9 = r9 + r11
            r16[r10] = r9
        L3e:
            return
    }

    @Override // defpackage.ke4
    public final void b(android.view.View r9, int r10, int r11, int r12, int r13, int r14) {
            r8 = this;
            int[] r7 = r8.i0
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r0.a(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    @Override // defpackage.ke4
    public final boolean c(android.view.View r1, android.view.View r2, int r3, int r4) {
            r0 = this;
            if (r4 != 0) goto L7
            boolean r0 = r0.onStartNestedScroll(r1, r2, r3)
            return r0
        L7:
            r0 = 0
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

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(android.view.KeyEvent r4) {
            r3 = this;
            if (r4 == 0) goto L15
            int r0 = r4.getAction()
            r1 = 1
            if (r0 != r1) goto L15
            int r0 = r4.getKeyCode()
            r2 = 285(0x11d, float:4.0E-43)
            if (r0 != r2) goto L15
            r3.n(r1, r1)
            return r1
        L15:
            boolean r3 = super.dispatchKeyEvent(r4)
            return r3
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float r1, float r2, boolean r3) {
            r0 = this;
            je4 r0 = r0.f0
            boolean r0 = r0.a(r1, r2, r3)
            return r0
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float r1, float r2) {
            r0 = this;
            je4 r0 = r0.f0
            boolean r0 = r0.b(r1, r2)
            return r0
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int r7, int r8, int[] r9, int[] r10) {
            r6 = this;
            je4 r0 = r6.f0
            r3 = 0
            r1 = r7
            r2 = r8
            r4 = r9
            r5 = r10
            boolean r6 = r0.c(r1, r2, r3, r4, r5)
            return r6
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int r9, int r10, int r11, int r12, int[] r13) {
            r8 = this;
            r6 = 0
            r7 = 0
            je4 r0 = r8.f0
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            boolean r8 = r0.d(r1, r2, r3, r4, r5, r6, r7)
            return r8
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
            if (r5 != 0) goto L5
            r0.onNestedPreScroll(r1, r2, r3, r4)
        L5:
            return
    }

    public final boolean g() {
            r2 = this;
            android.view.View r2 = r2.A
            boolean r0 = r2 instanceof android.widget.ListView
            r1 = -1
            if (r0 == 0) goto Le
            android.widget.ListView r2 = (android.widget.ListView) r2
            boolean r2 = r2.canScrollList(r1)
            return r2
        Le:
            boolean r2 = r2.canScrollVertically(r1)
            return r2
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int r1, int r2) {
            r0 = this;
            int r0 = r0.s0
            if (r0 >= 0) goto L5
            goto Le
        L5:
            int r1 = r1 + (-1)
            if (r2 != r1) goto La
            return r0
        La:
            if (r2 < r0) goto Le
            int r2 = r2 + 1
        Le:
            return r2
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
            r1 = this;
            dy7 r1 = r1.e0
            int r0 = r1.a
            int r1 = r1.b
            r1 = r1 | r0
            return r1
    }

    public int getProgressCircleDiameter() {
            r0 = this;
            int r0 = r0.C0
            return r0
    }

    public int getProgressViewEndOffset() {
            r0 = this;
            int r0 = r0.v0
            return r0
    }

    public int getProgressViewStartOffset() {
            r0 = this;
            int r0 = r0.u0
            return r0
    }

    public final void h() {
            r3 = this;
            android.view.View r0 = r3.A
            if (r0 != 0) goto L1d
            r0 = 0
        L5:
            int r1 = r3.getChildCount()
            if (r0 >= r1) goto L1d
            android.view.View r1 = r3.getChildAt(r0)
            sq0 r2 = r3.r0
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L1a
            r3.A = r1
            return
        L1a:
            int r0 = r0 + 1
            goto L5
        L1d:
            return
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
            r1 = this;
            je4 r1 = r1.f0
            r0 = 0
            boolean r1 = r1.f(r0)
            return r1
    }

    public final void i(float r6) {
            r5 = this;
            float r0 = r5.R
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            r0 = 1
            if (r6 <= 0) goto Lb
            r5.m(r0, r0)
            return
        Lb:
            r6 = 0
            r5.B = r6
            wq0 r1 = r5.x0
            vq0 r2 = r1.A
            r3 = 0
            r2.e = r3
            r2.f = r3
            r1.invalidateSelf()
            qw6 r2 = new qw6
            r2.<init>(r5, r0)
            int r0 = r5.l0
            r5.t0 = r0
            rw6 r0 = r5.G0
            r0.reset()
            r3 = 200(0xc8, double:9.9E-322)
            r0.setDuration(r3)
            android.view.animation.DecelerateInterpolator r3 = r5.q0
            r0.setInterpolator(r3)
            sq0 r5 = r5.r0
            r5.A = r2
            r5.clearAnimation()
            r5.startAnimation(r0)
            vq0 r5 = r1.A
            boolean r0 = r5.n
            if (r0 == 0) goto L44
            r5.n = r6
        L44:
            r1.invalidateSelf()
            return
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
            r0 = this;
            je4 r0 = r0.f0
            boolean r0 = r0.d
            return r0
    }

    public final void j(float r14) {
            r13 = this;
            wq0 r0 = r13.x0
            vq0 r1 = r0.A
            boolean r2 = r1.n
            r3 = 1
            if (r2 == r3) goto Lb
            r1.n = r3
        Lb:
            r0.invalidateSelf()
            float r1 = r13.R
            float r1 = r14 / r1
            float r1 = java.lang.Math.abs(r1)
            r2 = 1065353216(0x3f800000, float:1.0)
            float r1 = java.lang.Math.min(r2, r1)
            double r3 = (double) r1
            r5 = 4600877379321698714(0x3fd999999999999a, double:0.4)
            double r3 = r3 - r5
            r5 = 0
            double r3 = java.lang.Math.max(r3, r5)
            float r3 = (float) r3
            r4 = 1084227584(0x40a00000, float:5.0)
            float r3 = r3 * r4
            r4 = 1077936128(0x40400000, float:3.0)
            float r3 = r3 / r4
            float r4 = java.lang.Math.abs(r14)
            float r5 = r13.R
            float r4 = r4 - r5
            int r5 = r13.w0
            if (r5 <= 0) goto L3d
        L3b:
            float r5 = (float) r5
            goto L40
        L3d:
            int r5 = r13.v0
            goto L3b
        L40:
            r6 = 1073741824(0x40000000, float:2.0)
            float r7 = r5 * r6
            float r4 = java.lang.Math.min(r4, r7)
            float r4 = r4 / r5
            r7 = 0
            float r4 = java.lang.Math.max(r7, r4)
            r8 = 1082130432(0x40800000, float:4.0)
            float r4 = r4 / r8
            double r8 = (double) r4
            r10 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r10 = java.lang.Math.pow(r8, r10)
            double r8 = r8 - r10
            float r4 = (float) r8
            float r4 = r4 * r6
            float r8 = r5 * r4
            float r8 = r8 * r6
            float r5 = r5 * r1
            float r5 = r5 + r8
            int r1 = (int) r5
            int r5 = r13.u0
            int r5 = r5 + r1
            sq0 r1 = r13.r0
            int r8 = r1.getVisibility()
            if (r8 == 0) goto L70
            r8 = 0
            r1.setVisibility(r8)
        L70:
            r1.setScaleX(r2)
            r1.setScaleY(r2)
            float r8 = r13.R
            int r14 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            r8 = 0
            r9 = 300(0x12c, double:1.48E-321)
            if (r14 >= 0) goto Laf
            vq0 r14 = r0.A
            int r14 = r14.t
            r11 = 76
            if (r14 <= r11) goto Lde
            sw6 r14 = r13.A0
            if (r14 == 0) goto L98
            boolean r12 = r14.hasStarted()
            if (r12 == 0) goto L98
            boolean r14 = r14.hasEnded()
            if (r14 != 0) goto L98
            goto Lde
        L98:
            vq0 r14 = r0.A
            int r14 = r14.t
            sw6 r12 = new sw6
            r12.<init>(r13, r14, r11)
            r12.setDuration(r9)
            r1.A = r8
            r1.clearAnimation()
            r1.startAnimation(r12)
            r13.A0 = r12
            goto Lde
        Laf:
            vq0 r14 = r0.A
            int r14 = r14.t
            r11 = 255(0xff, float:3.57E-43)
            if (r14 >= r11) goto Lde
            sw6 r14 = r13.B0
            if (r14 == 0) goto Lc8
            boolean r12 = r14.hasStarted()
            if (r12 == 0) goto Lc8
            boolean r14 = r14.hasEnded()
            if (r14 != 0) goto Lc8
            goto Lde
        Lc8:
            vq0 r14 = r0.A
            int r14 = r14.t
            sw6 r12 = new sw6
            r12.<init>(r13, r14, r11)
            r12.setDuration(r9)
            r1.A = r8
            r1.clearAnimation()
            r1.startAnimation(r12)
            r13.B0 = r12
        Lde:
            r14 = 1061997773(0x3f4ccccd, float:0.8)
            float r1 = r3 * r14
            float r14 = java.lang.Math.min(r14, r1)
            vq0 r1 = r0.A
            r1.e = r7
            r1.f = r14
            r0.invalidateSelf()
            float r14 = java.lang.Math.min(r2, r3)
            vq0 r1 = r0.A
            float r2 = r1.p
            int r2 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r2 == 0) goto Lfe
            r1.p = r14
        Lfe:
            r0.invalidateSelf()
            r14 = 1053609165(0x3ecccccd, float:0.4)
            float r3 = r3 * r14
            r14 = -1098907648(0xffffffffbe800000, float:-0.25)
            float r3 = r3 + r14
            float r4 = r4 * r6
            float r4 = r4 + r3
            r14 = 1056964608(0x3f000000, float:0.5)
            float r4 = r4 * r14
            vq0 r14 = r0.A
            r14.g = r4
            r0.invalidateSelf()
            int r14 = r13.l0
            int r5 = r5 - r14
            r13.setTargetOffsetTopAndBottom(r5)
            return
    }

    public final void k(float r3) {
            r2 = this;
            int r0 = r2.t0
            int r1 = r2.u0
            int r1 = r1 - r0
            float r1 = (float) r1
            float r1 = r1 * r3
            int r3 = (int) r1
            int r0 = r0 + r3
            sq0 r3 = r2.r0
            int r3 = r3.getTop()
            int r0 = r0 - r3
            r2.setTargetOffsetTopAndBottom(r0)
            return
    }

    public final void l() {
            r2 = this;
            sq0 r0 = r2.r0
            r0.clearAnimation()
            wq0 r0 = r2.x0
            r0.stop()
            sq0 r0 = r2.r0
            r1 = 8
            r0.setVisibility(r1)
            r0 = 255(0xff, float:3.57E-43)
            r2.setColorViewAlpha(r0)
            int r0 = r2.u0
            int r1 = r2.l0
            int r0 = r0 - r1
            r2.setTargetOffsetTopAndBottom(r0)
            sq0 r0 = r2.r0
            int r0 = r0.getTop()
            r2.l0 = r0
            return
    }

    public final void m(boolean r4, boolean r5) {
            r3 = this;
            boolean r5 = r3.B
            if (r5 == r4) goto L44
            r3.h()
            r3.B = r4
            sq0 r5 = r3.r0
            qw6 r0 = r3.E0
            if (r4 == 0) goto L2d
            int r4 = r3.l0
            r3.t0 = r4
            rw6 r4 = r3.F0
            r4.reset()
            r1 = 200(0xc8, double:9.9E-322)
            r4.setDuration(r1)
            android.view.animation.DecelerateInterpolator r3 = r3.q0
            r4.setInterpolator(r3)
            if (r0 == 0) goto L26
            r5.A = r0
        L26:
            r5.clearAnimation()
            r5.startAnimation(r4)
            return
        L2d:
            rw6 r4 = new rw6
            r1 = 1
            r4.<init>(r3, r1)
            r3.z0 = r4
            r1 = 150(0x96, double:7.4E-322)
            r4.setDuration(r1)
            r5.A = r0
            r5.clearAnimation()
            rw6 r3 = r3.z0
            r5.startAnimation(r3)
        L44:
            return
    }

    public final void n(boolean r4, boolean r5) {
            r3 = this;
            r5 = 0
            if (r4 == 0) goto L3c
            boolean r0 = r3.B
            if (r0 == r4) goto L3c
            r3.B = r4
            int r4 = r3.v0
            int r0 = r3.u0
            int r4 = r4 + r0
            int r0 = r3.l0
            int r4 = r4 - r0
            r3.setTargetOffsetTopAndBottom(r4)
            sq0 r4 = r3.r0
            r4.setVisibility(r5)
            wq0 r0 = r3.x0
            r1 = 255(0xff, float:3.57E-43)
            r0.setAlpha(r1)
            rw6 r0 = new rw6
            r0.<init>(r3, r5)
            r3.y0 = r0
            int r5 = r3.k0
            long r1 = (long) r5
            r0.setDuration(r1)
            qw6 r5 = r3.E0
            if (r5 == 0) goto L33
            r4.A = r5
        L33:
            r4.clearAnimation()
            rw6 r3 = r3.y0
            r4.startAnimation(r3)
            return
        L3c:
            r3.m(r4, r5)
            return
    }

    public final void o(float r3) {
            r2 = this;
            float r0 = r2.n0
            float r3 = r3 - r0
            int r1 = r2.L
            float r1 = (float) r1
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 <= 0) goto L1b
            boolean r3 = r2.o0
            if (r3 != 0) goto L1b
            float r0 = r0 + r1
            r2.m0 = r0
            r3 = 1
            r2.o0 = r3
            wq0 r2 = r2.x0
            r3 = 76
            r2.setAlpha(r3)
        L1b:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
            r0 = this;
            super.onDetachedFromWindow()
            r0.l()
            return
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r6) {
            r5 = this;
            r5.h()
            int r0 = r6.getActionMasked()
            boolean r1 = r5.isEnabled()
            r2 = 0
            if (r1 == 0) goto L88
            boolean r1 = r5.g()
            if (r1 != 0) goto L88
            boolean r1 = r5.B
            if (r1 != 0) goto L88
            boolean r1 = r5.j0
            if (r1 == 0) goto L1e
            goto L88
        L1e:
            if (r0 == 0) goto L64
            r1 = 1
            r3 = -1
            if (r0 == r1) goto L5f
            r4 = 2
            if (r0 == r4) goto L44
            r4 = 3
            if (r0 == r4) goto L5f
            r3 = 6
            if (r0 == r3) goto L2e
            goto L85
        L2e:
            int r0 = r6.getActionIndex()
            int r3 = r6.getPointerId(r0)
            int r4 = r5.p0
            if (r3 != r4) goto L85
            if (r0 != 0) goto L3d
            r2 = r1
        L3d:
            int r6 = r6.getPointerId(r2)
            r5.p0 = r6
            goto L85
        L44:
            int r0 = r5.p0
            if (r0 != r3) goto L50
            java.lang.String r5 = "SwipeRefreshLayout"
            java.lang.String r6 = "Got ACTION_MOVE event but don't have an active pointer id."
            android.util.Log.e(r5, r6)
            return r2
        L50:
            int r0 = r6.findPointerIndex(r0)
            if (r0 >= 0) goto L57
            goto L88
        L57:
            float r6 = r6.getY(r0)
            r5.o(r6)
            goto L85
        L5f:
            r5.o0 = r2
            r5.p0 = r3
            goto L85
        L64:
            sq0 r0 = r5.r0
            int r0 = r0.getTop()
            int r1 = r5.u0
            int r1 = r1 - r0
            r5.setTargetOffsetTopAndBottom(r1)
            int r0 = r6.getPointerId(r2)
            r5.p0 = r0
            r5.o0 = r2
            int r0 = r6.findPointerIndex(r0)
            if (r0 >= 0) goto L7f
            goto L88
        L7f:
            float r6 = r6.getY(r0)
            r5.n0 = r6
        L85:
            boolean r5 = r5.o0
            return r5
        L88:
            return r2
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r3, int r4, int r5, int r6, int r7) {
            r2 = this;
            int r3 = r2.getMeasuredWidth()
            int r4 = r2.getMeasuredHeight()
            int r5 = r2.getChildCount()
            if (r5 != 0) goto Lf
            goto L1a
        Lf:
            android.view.View r5 = r2.A
            if (r5 != 0) goto L16
            r2.h()
        L16:
            android.view.View r5 = r2.A
            if (r5 != 0) goto L1b
        L1a:
            return
        L1b:
            int r6 = r2.getPaddingLeft()
            int r7 = r2.getPaddingTop()
            int r0 = r2.getPaddingLeft()
            int r0 = r3 - r0
            int r1 = r2.getPaddingRight()
            int r0 = r0 - r1
            int r1 = r2.getPaddingTop()
            int r4 = r4 - r1
            int r1 = r2.getPaddingBottom()
            int r4 = r4 - r1
            int r0 = r0 + r6
            int r4 = r4 + r7
            r5.layout(r6, r7, r0, r4)
            sq0 r4 = r2.r0
            int r4 = r4.getMeasuredWidth()
            sq0 r5 = r2.r0
            int r5 = r5.getMeasuredHeight()
            int r3 = r3 / 2
            int r4 = r4 / 2
            int r6 = r3 - r4
            int r7 = r2.l0
            int r3 = r3 + r4
            int r5 = r5 + r7
            sq0 r2 = r2.r0
            r2.layout(r6, r7, r3, r5)
            return
    }

    @Override // android.view.View
    public final void onMeasure(int r4, int r5) {
            r3 = this;
            super.onMeasure(r4, r5)
            android.view.View r4 = r3.A
            if (r4 != 0) goto La
            r3.h()
        La:
            android.view.View r4 = r3.A
            if (r4 != 0) goto Lf
            goto L61
        Lf:
            int r5 = r3.getMeasuredWidth()
            int r0 = r3.getPaddingLeft()
            int r5 = r5 - r0
            int r0 = r3.getPaddingRight()
            int r5 = r5 - r0
            r0 = 1073741824(0x40000000, float:2.0)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r0)
            int r1 = r3.getMeasuredHeight()
            int r2 = r3.getPaddingTop()
            int r1 = r1 - r2
            int r2 = r3.getPaddingBottom()
            int r1 = r1 - r2
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            r4.measure(r5, r1)
            int r4 = r3.C0
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r0)
            int r5 = r3.C0
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r0)
            sq0 r0 = r3.r0
            r0.measure(r4, r5)
            r4 = -1
            r3.s0 = r4
            r4 = 0
        L4d:
            int r5 = r3.getChildCount()
            if (r4 >= r5) goto L61
            android.view.View r5 = r3.getChildAt(r4)
            sq0 r0 = r3.r0
            if (r5 != r0) goto L5e
            r3.s0 = r4
            return
        L5e:
            int r4 = r4 + 1
            goto L4d
        L61:
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(android.view.View r1, float r2, float r3, boolean r4) {
            r0 = this;
            je4 r0 = r0.f0
            boolean r0 = r0.a(r2, r3, r4)
            return r0
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(android.view.View r1, float r2, float r3) {
            r0 = this;
            je4 r0 = r0.f0
            boolean r0 = r0.b(r2, r3)
            return r0
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(android.view.View r5, int r6, int r7, int[] r8) {
            r4 = this;
            r5 = 1
            if (r7 <= 0) goto L1f
            float r0 = r4.d0
            r1 = 0
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 <= 0) goto L1f
            float r2 = (float) r7
            int r3 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r3 <= 0) goto L15
            int r0 = (int) r0
            r8[r5] = r0
            r4.d0 = r1
            goto L1a
        L15:
            float r0 = r0 - r2
            r4.d0 = r0
            r8[r5] = r7
        L1a:
            float r0 = r4.d0
            r4.j(r0)
        L1f:
            r0 = 0
            r1 = r8[r0]
            int r6 = r6 - r1
            r1 = r8[r5]
            int r7 = r7 - r1
            r1 = 0
            int[] r2 = r4.g0
            boolean r4 = r4.dispatchNestedPreScroll(r6, r7, r2, r1)
            if (r4 == 0) goto L3d
            r4 = r8[r0]
            r6 = r2[r0]
            int r4 = r4 + r6
            r8[r0] = r4
            r4 = r8[r5]
            r6 = r2[r5]
            int r4 = r4 + r6
            r8[r5] = r4
        L3d:
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(android.view.View r9, int r10, int r11, int r12, int r13) {
            r8 = this;
            r6 = 0
            int[] r7 = r8.i0
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r0.a(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(android.view.View r1, android.view.View r2, int r3) {
            r0 = this;
            dy7 r1 = r0.e0
            r1.a = r3
            r1 = r3 & 2
            r0.startNestedScroll(r1)
            r1 = 0
            r0.d0 = r1
            r1 = 1
            r0.j0 = r1
            return
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(android.os.Parcelable r2) {
            r1 = this;
            vw6 r2 = (defpackage.vw6) r2
            android.os.Parcelable r0 = r2.getSuperState()
            super.onRestoreInstanceState(r0)
            boolean r2 = r2.A
            r1.setRefreshing(r2)
            return
    }

    @Override // android.view.View
    public final android.os.Parcelable onSaveInstanceState() {
            r2 = this;
            android.os.Parcelable r0 = super.onSaveInstanceState()
            vw6 r1 = new vw6
            boolean r2 = r2.B
            r1.<init>(r0, r2)
            return r1
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(android.view.View r1, android.view.View r2, int r3) {
            r0 = this;
            boolean r1 = r0.isEnabled()
            if (r1 == 0) goto L10
            boolean r0 = r0.B
            if (r0 != 0) goto L10
            r0 = r3 & 2
            if (r0 == 0) goto L10
            r0 = 1
            return r0
        L10:
            r0 = 0
            return r0
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(android.view.View r3) {
            r2 = this;
            dy7 r3 = r2.e0
            r0 = 0
            r3.a = r0
            r2.j0 = r0
            float r3 = r2.d0
            r0 = 0
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 <= 0) goto L14
            r2.i(r3)
            r2.d0 = r0
            goto L1e
        L14:
            rk3 r3 = new rk3
            r0 = 13
            r3.<init>(r2, r0)
            r2.post(r3)
        L1e:
            r2.stopNestedScroll()
            return
    }

    @Override // android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent r7) {
            r6 = this;
            int r0 = r7.getActionMasked()
            boolean r1 = r6.isEnabled()
            r2 = 0
            if (r1 == 0) goto Lb3
            boolean r1 = r6.g()
            if (r1 != 0) goto Lb3
            boolean r1 = r6.B
            if (r1 != 0) goto Lb3
            boolean r1 = r6.j0
            if (r1 == 0) goto L1b
            goto Lb3
        L1b:
            r1 = 1
            if (r0 == 0) goto Laa
            r3 = 1056964608(0x3f000000, float:0.5)
            java.lang.String r4 = "SwipeRefreshLayout"
            if (r0 == r1) goto L87
            r5 = 2
            if (r0 == r5) goto L5a
            r3 = 3
            if (r0 == r3) goto Lb3
            r3 = 5
            if (r0 == r3) goto L47
            r3 = 6
            if (r0 == r3) goto L31
            goto L86
        L31:
            int r0 = r7.getActionIndex()
            int r3 = r7.getPointerId(r0)
            int r4 = r6.p0
            if (r3 != r4) goto L86
            if (r0 != 0) goto L40
            r2 = r1
        L40:
            int r7 = r7.getPointerId(r2)
            r6.p0 = r7
            return r1
        L47:
            int r0 = r7.getActionIndex()
            if (r0 >= 0) goto L53
            java.lang.String r6 = "Got ACTION_POINTER_DOWN event but have an invalid action index."
            android.util.Log.e(r4, r6)
            return r2
        L53:
            int r7 = r7.getPointerId(r0)
            r6.p0 = r7
            return r1
        L5a:
            int r0 = r6.p0
            int r0 = r7.findPointerIndex(r0)
            if (r0 >= 0) goto L68
            java.lang.String r6 = "Got ACTION_MOVE event but have an invalid active pointer id."
            android.util.Log.e(r4, r6)
            return r2
        L68:
            float r7 = r7.getY(r0)
            r6.o(r7)
            boolean r0 = r6.o0
            if (r0 == 0) goto L86
            float r0 = r6.m0
            float r7 = r7 - r0
            float r7 = r7 * r3
            r0 = 0
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 <= 0) goto Lb3
            android.view.ViewParent r0 = r6.getParent()
            r0.requestDisallowInterceptTouchEvent(r1)
            r6.j(r7)
        L86:
            return r1
        L87:
            int r0 = r6.p0
            int r0 = r7.findPointerIndex(r0)
            if (r0 >= 0) goto L95
            java.lang.String r6 = "Got ACTION_UP event but don't have an active pointer id."
            android.util.Log.e(r4, r6)
            return r2
        L95:
            boolean r1 = r6.o0
            if (r1 == 0) goto La6
            float r7 = r7.getY(r0)
            float r0 = r6.m0
            float r7 = r7 - r0
            float r7 = r7 * r3
            r6.o0 = r2
            r6.i(r7)
        La6:
            r7 = -1
            r6.p0 = r7
            return r2
        Laa:
            int r7 = r7.getPointerId(r2)
            r6.p0 = r7
            r6.o0 = r2
            return r1
        Lb3:
            return r2
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean r3) {
            r2 = this;
            boolean r0 = r2.D0
            if (r0 == 0) goto L11
            android.view.View r0 = r2.A
            if (r0 == 0) goto L11
            java.util.WeakHashMap r1 = defpackage.ao7.a
            boolean r0 = r0.isNestedScrollingEnabled()
            if (r0 != 0) goto L11
            return
        L11:
            super.requestDisallowInterceptTouchEvent(r3)
            return
    }

    public void setAnimationProgress(float r2) {
            r1 = this;
            sq0 r0 = r1.r0
            r0.setScaleX(r2)
            sq0 r1 = r1.r0
            r1.setScaleY(r2)
            return
    }

    @java.lang.Deprecated
    public void setColorScheme(int... r1) {
            r0 = this;
            r0.setColorSchemeResources(r1)
            return
    }

    public void setColorSchemeColors(int... r2) {
            r1 = this;
            r1.h()
            wq0 r1 = r1.x0
            vq0 r0 = r1.A
            r0.i = r2
            r2 = 0
            r0.a(r2)
            r0.a(r2)
            r1.invalidateSelf()
            return
    }

    public void setColorSchemeResources(int... r5) {
            r4 = this;
            android.content.Context r0 = r4.getContext()
            int r1 = r5.length
            int[] r1 = new int[r1]
            r2 = 0
        L8:
            int r3 = r5.length
            if (r2 >= r3) goto L16
            r3 = r5[r2]
            int r3 = r0.getColor(r3)
            r1[r2] = r3
            int r2 = r2 + 1
            goto L8
        L16:
            r4.setColorSchemeColors(r1)
            return
    }

    public void setDistanceToTriggerSync(int r1) {
            r0 = this;
            float r1 = (float) r1
            r0.R = r1
            return
    }

    @Override // android.view.View
    public void setEnabled(boolean r1) {
            r0 = this;
            super.setEnabled(r1)
            if (r1 != 0) goto L8
            r0.l()
        L8:
            return
    }

    @java.lang.Deprecated
    public void setLegacyRequestDisallowInterceptTouchEventEnabled(boolean r1) {
            r0 = this;
            r0.D0 = r1
            return
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean r3) {
            r2 = this;
            je4 r2 = r2.f0
            boolean r0 = r2.d
            if (r0 == 0) goto Ld
            android.view.ViewGroup r0 = r2.c
            java.util.WeakHashMap r1 = defpackage.ao7.a
            r0.stopNestedScroll()
        Ld:
            r2.d = r3
            return
    }

    public void setOnChildScrollUpCallback(defpackage.tw6 r1) {
            r0 = this;
            return
    }

    public void setOnRefreshListener(defpackage.uw6 r1) {
            r0 = this;
            return
    }

    @java.lang.Deprecated
    public void setProgressBackgroundColor(int r1) {
            r0 = this;
            r0.setProgressBackgroundColorSchemeResource(r1)
            return
    }

    public void setProgressBackgroundColorSchemeColor(int r1) {
            r0 = this;
            sq0 r0 = r0.r0
            r0.setBackgroundColor(r1)
            return
    }

    public void setProgressBackgroundColorSchemeResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            int r2 = r0.getColor(r2)
            r1.setProgressBackgroundColorSchemeColor(r2)
            return
    }

    public void setRefreshing(boolean r2) {
            r1 = this;
            r0 = 0
            r1.n(r2, r0)
            return
    }

    public void setSize(int r3) {
            r2 = this;
            if (r3 == 0) goto L6
            r0 = 1
            if (r3 == r0) goto L6
            return
        L6:
            android.content.res.Resources r0 = r2.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            if (r3 != 0) goto L19
            r1 = 1113587712(0x42600000, float:56.0)
            float r0 = r0.density
            float r0 = r0 * r1
            int r0 = (int) r0
            r2.C0 = r0
            goto L21
        L19:
            r1 = 1109393408(0x42200000, float:40.0)
            float r0 = r0.density
            float r0 = r0 * r1
            int r0 = (int) r0
            r2.C0 = r0
        L21:
            sq0 r0 = r2.r0
            r1 = 0
            r0.setImageDrawable(r1)
            wq0 r0 = r2.x0
            r0.c(r3)
            sq0 r3 = r2.r0
            wq0 r2 = r2.x0
            r3.setImageDrawable(r2)
            return
    }

    public void setSlingshotDistance(int r1) {
            r0 = this;
            r0.w0 = r1
            return
    }

    public void setTargetOffsetTopAndBottom(int r3) {
            r2 = this;
            sq0 r0 = r2.r0
            r0.bringToFront()
            java.util.WeakHashMap r1 = defpackage.ao7.a
            r0.offsetTopAndBottom(r3)
            int r3 = r0.getTop()
            r2.l0 = r3
            return
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int r2) {
            r1 = this;
            je4 r1 = r1.f0
            r0 = 0
            boolean r1 = r1.g(r2, r0)
            return r1
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
            r1 = this;
            je4 r1 = r1.f0
            r0 = 0
            r1.h(r0)
            return
    }
}
