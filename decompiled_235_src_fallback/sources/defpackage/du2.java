package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: du2  reason: default package */
/* loaded from: classes.dex */
public final class du2 implements defpackage.wt2 {
    public static final defpackage.cu2 A = null;
    public final defpackage.ko1 b;
    public final defpackage.ak0 c;
    public final defpackage.oo7 d;
    public final android.content.res.Resources e;
    public final android.graphics.Rect f;
    public android.graphics.Paint g;
    public int h;
    public int i;
    public long j;
    public boolean k;
    public boolean l;
    public boolean m;
    public int n;
    public int o;
    public float p;
    public boolean q;
    public float r;
    public float s;
    public float t;
    public float u;
    public float v;
    public long w;
    public long x;
    public float y;
    public defpackage.m50 z;

    static {
            cu2 r0 = new cu2
            r0.<init>()
            defpackage.du2.A = r0
            return
    }

    public du2(defpackage.ko1 r4) {
            r3 = this;
            ak0 r0 = new ak0
            r0.<init>()
            zj0 r1 = new zj0
            r1.<init>()
            r3.<init>()
            r3.b = r4
            r3.c = r0
            oo7 r2 = new oo7
            r2.<init>(r4, r0, r1)
            r3.d = r2
            android.content.res.Resources r0 = r4.getResources()
            r3.e = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r3.f = r0
            r4.addView(r2)
            r4 = 0
            r2.setClipBounds(r4)
            r0 = 0
            r3.j = r0
            android.view.View.generateViewId()
            r4 = 3
            r3.n = r4
            r4 = 0
            r3.o = r4
            r4 = 1065353216(0x3f800000, float:1.0)
            r3.p = r4
            r3.r = r4
            r3.s = r4
            long r0 = defpackage.kt0.b
            r3.w = r0
            r3.x = r0
            return
    }

    @Override // defpackage.wt2
    public final float A() {
            r1 = this;
            oo7 r0 = r1.d
            float r0 = r0.getCameraDistance()
            android.content.res.Resources r1 = r1.e
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            int r1 = r1.densityDpi
            float r1 = (float) r1
            float r0 = r0 / r1
            return r0
    }

    @Override // defpackage.wt2
    public final void B(long r6, int r8, int r9) {
            r5 = this;
            long r0 = r5.j
            boolean r0 = defpackage.q93.b(r0, r6)
            oo7 r1 = r5.d
            if (r0 != 0) goto L3d
            boolean r0 = r5.m
            if (r0 != 0) goto L14
            boolean r0 = r1.getClipToOutline()
            if (r0 == 0) goto L17
        L14:
            r0 = 1
            r5.k = r0
        L17:
            r0 = 32
            long r2 = r6 >> r0
            int r0 = (int) r2
            int r2 = r8 + r0
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r6
            int r3 = (int) r3
            int r4 = r9 + r3
            r1.layout(r8, r9, r2, r4)
            r5.j = r6
            boolean r6 = r5.q
            if (r6 == 0) goto L4f
            float r6 = (float) r0
            r7 = 1073741824(0x40000000, float:2.0)
            float r6 = r6 / r7
            r1.setPivotX(r6)
            float r6 = (float) r3
            float r6 = r6 / r7
            r1.setPivotY(r6)
            goto L4f
        L3d:
            int r6 = r5.h
            if (r6 == r8) goto L46
            int r6 = r8 - r6
            r1.offsetLeftAndRight(r6)
        L46:
            int r6 = r5.i
            if (r6 == r9) goto L4f
            int r6 = r9 - r6
            r1.offsetTopAndBottom(r6)
        L4f:
            r5.h = r8
            r5.i = r9
            return
    }

    @Override // defpackage.wt2
    public final float C() {
            r0 = this;
            float r0 = r0.t
            return r0
    }

    @Override // defpackage.wt2
    public final void D(defpackage.m50 r3) {
            r2 = this;
            r2.z = r3
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto L15
            if (r3 == 0) goto Lf
            android.graphics.RenderEffect r3 = r3.a()
            goto L10
        Lf:
            r3 = 0
        L10:
            oo7 r2 = r2.d
            defpackage.ij5.p(r2, r3)
        L15:
            return
    }

    @Override // defpackage.wt2
    public final void E(boolean r4) {
            r3 = this;
            r0 = 0
            r1 = 1
            if (r4 == 0) goto La
            boolean r2 = r3.l
            if (r2 != 0) goto La
            r2 = r1
            goto Lb
        La:
            r2 = r0
        Lb:
            r3.m = r2
            r3.k = r1
            if (r4 == 0) goto L16
            boolean r4 = r3.l
            if (r4 == 0) goto L16
            r0 = r1
        L16:
            oo7 r3 = r3.d
            r3.setClipToOutline(r0)
            return
    }

    @Override // defpackage.wt2
    public final float F() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.wt2
    public final void G(defpackage.qh1 r6, defpackage.kk3 r7, defpackage.ut2 r8, defpackage.mc r9) {
            r5 = this;
            oo7 r0 = r5.d
            android.view.ViewParent r1 = r0.getParent()
            ko1 r2 = r5.b
            if (r1 != 0) goto Ld
            r2.addView(r0)
        Ld:
            r0.f0 = r6
            r0.g0 = r7
            r0.h0 = r9
            r0.i0 = r8
            boolean r6 = r0.isAttachedToWindow()
            if (r6 == 0) goto L38
            r6 = 4
            r0.setVisibility(r6)
            r6 = 0
            r0.setVisibility(r6)
            ak0 r5 = r5.c     // Catch: java.lang.ClassCastException -> L38
            cu2 r6 = defpackage.du2.A     // Catch: java.lang.ClassCastException -> L38
            wd r7 = r5.a     // Catch: java.lang.ClassCastException -> L38
            android.graphics.Canvas r8 = r7.a     // Catch: java.lang.ClassCastException -> L38
            r7.a = r6     // Catch: java.lang.ClassCastException -> L38
            long r3 = r0.getDrawingTime()     // Catch: java.lang.ClassCastException -> L38
            r2.a(r7, r0, r3)     // Catch: java.lang.ClassCastException -> L38
            wd r5 = r5.a     // Catch: java.lang.ClassCastException -> L38
            r5.a = r8     // Catch: java.lang.ClassCastException -> L38
        L38:
            return
    }

    @Override // defpackage.wt2
    public final void H(int r1) {
            r0 = this;
            r0.o = r1
            r0.Q()
            return
    }

    @Override // defpackage.wt2
    public final void I(float r1) {
            r0 = this;
            r0.t = r1
            oo7 r0 = r0.d
            r0.setTranslationX(r1)
            return
    }

    @Override // defpackage.wt2
    public final void J(long r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L11
            r2.x = r3
            oo7 r2 = r2.d
            int r3 = defpackage.hv.b0(r3)
            defpackage.o05.p(r2, r3)
        L11:
            return
    }

    @Override // defpackage.wt2
    public final android.graphics.Matrix K() {
            r0 = this;
            oo7 r0 = r0.d
            android.graphics.Matrix r0 = r0.getMatrix()
            return r0
    }

    @Override // defpackage.wt2
    public final void L(float r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.e
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r0 = r0.densityDpi
            float r0 = (float) r0
            float r2 = r2 * r0
            oo7 r1 = r1.d
            r1.setCameraDistance(r2)
            return
    }

    @Override // defpackage.wt2
    public final float M() {
            r0 = this;
            float r0 = r0.v
            return r0
    }

    @Override // defpackage.wt2
    public final float N() {
            r0 = this;
            float r0 = r0.s
            return r0
    }

    @Override // defpackage.wt2
    public final int O() {
            r0 = this;
            int r0 = r0.n
            return r0
    }

    public final void P(int r5) {
            r4 = this;
            r0 = 2
            oo7 r1 = r4.d
            r2 = 1
            if (r5 != r2) goto Lc
            android.graphics.Paint r4 = r4.g
            r1.setLayerType(r0, r4)
            goto L19
        Lc:
            android.graphics.Paint r4 = r4.g
            r3 = 0
            if (r5 != r0) goto L16
            r1.setLayerType(r3, r4)
            r2 = r3
            goto L19
        L16:
            r1.setLayerType(r3, r4)
        L19:
            r1.setCanUseCompositingLayer$ui_graphics(r2)
            return
    }

    public final void Q() {
            r4 = this;
            int r0 = r4.o
            r1 = 1
            if (r0 != r1) goto L6
            goto Lf
        L6:
            int r2 = r4.n
            r3 = 3
            if (r2 != r3) goto Lf
            r4.P(r0)
            return
        Lf:
            r4.P(r1)
            return
    }

    @Override // defpackage.wt2
    public final float a() {
            r0 = this;
            float r0 = r0.p
            return r0
    }

    @Override // defpackage.wt2
    public final float b() {
            r0 = this;
            float r0 = r0.r
            return r0
    }

    @Override // defpackage.wt2
    public final void c(float r1) {
            r0 = this;
            r0.v = r1
            oo7 r0 = r0.d
            r0.setElevation(r1)
            return
    }

    @Override // defpackage.wt2
    public final defpackage.m50 d() {
            r0 = this;
            m50 r0 = r0.z
            return r0
    }

    @Override // defpackage.wt2
    public final void e(float r1) {
            r0 = this;
            r0.y = r1
            oo7 r0 = r0.d
            r0.setRotation(r1)
            return
    }

    @Override // defpackage.wt2
    public final void f(float r1) {
            r0 = this;
            r0.u = r1
            oo7 r0 = r0.d
            r0.setTranslationY(r1)
            return
    }

    @Override // defpackage.wt2
    public final void g(android.graphics.Outline r3, long r4) {
            r2 = this;
            oo7 r4 = r2.d
            r4.d0 = r3
            r4.invalidateOutline()
            boolean r5 = r2.m
            r0 = 0
            r1 = 1
            if (r5 != 0) goto L13
            boolean r5 = r4.getClipToOutline()
            if (r5 == 0) goto L20
        L13:
            if (r3 == 0) goto L20
            r4.setClipToOutline(r1)
            boolean r4 = r2.m
            if (r4 == 0) goto L20
            r2.m = r0
            r2.k = r1
        L20:
            if (r3 == 0) goto L23
            r0 = r1
        L23:
            r2.l = r0
            return
    }

    @Override // defpackage.wt2
    public final void h(int r3) {
            r2 = this;
            r2.n = r3
            android.graphics.Paint r0 = r2.g
            if (r0 != 0) goto Ld
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r2.g = r0
        Ld:
            android.graphics.PorterDuffXfermode r1 = new android.graphics.PorterDuffXfermode
            android.graphics.PorterDuff$Mode r3 = defpackage.f04.T(r3)
            r1.<init>(r3)
            r0.setXfermode(r1)
            r2.Q()
            return
    }

    @Override // defpackage.wt2
    public final void i() {
            r1 = this;
            ko1 r0 = r1.b
            oo7 r1 = r1.d
            r0.removeViewInLayout(r1)
            return
    }

    @Override // defpackage.wt2
    public final void j(defpackage.xj0 r5) {
            r4 = this;
            boolean r0 = r4.k
            oo7 r1 = r4.d
            if (r0 == 0) goto L2c
            boolean r0 = r4.m
            if (r0 != 0) goto L10
            boolean r0 = r1.getClipToOutline()
            if (r0 == 0) goto L28
        L10:
            boolean r0 = r4.l
            if (r0 != 0) goto L28
            android.graphics.Rect r0 = r4.f
            r2 = 0
            r0.left = r2
            r0.top = r2
            int r2 = r1.getWidth()
            r0.right = r2
            int r2 = r1.getHeight()
            r0.bottom = r2
            goto L29
        L28:
            r0 = 0
        L29:
            r1.setClipBounds(r0)
        L2c:
            android.graphics.Canvas r0 = defpackage.xd.a
            r0 = r5
            wd r0 = (defpackage.wd) r0
            android.graphics.Canvas r0 = r0.a
            boolean r0 = r0.isHardwareAccelerated()
            if (r0 == 0) goto L42
            ko1 r4 = r4.b
            long r2 = r1.getDrawingTime()
            r4.a(r5, r1, r2)
        L42:
            return
    }

    @Override // defpackage.wt2
    public final int k() {
            r0 = this;
            int r0 = r0.o
            return r0
    }

    @Override // defpackage.wt2
    public final defpackage.z40 l() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.wt2
    public final void m(float r1) {
            r0 = this;
            r0.s = r1
            oo7 r0 = r0.d
            r0.setScaleY(r1)
            return
    }

    @Override // defpackage.wt2
    public final float n() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.wt2
    public final float p() {
            r0 = this;
            float r0 = r0.y
            return r0
    }

    @Override // defpackage.wt2
    public final void q(long r8) {
            r7 = this;
            r0 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            long r0 = r0 & r8
            r2 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r3 = 32
            oo7 r4 = r7.d
            if (r0 != 0) goto L3a
            int r8 = android.os.Build.VERSION.SDK_INT
            r9 = 28
            if (r8 < r9) goto L22
            defpackage.o05.t(r4)
            return
        L22:
            r8 = 1
            r7.q = r8
            long r8 = r7.j
            long r8 = r8 >> r3
            int r8 = (int) r8
            float r8 = (float) r8
            r9 = 1073741824(0x40000000, float:2.0)
            float r8 = r8 / r9
            r4.setPivotX(r8)
            long r7 = r7.j
            long r7 = r7 & r1
            int r7 = (int) r7
            float r7 = (float) r7
            float r7 = r7 / r9
            r4.setPivotY(r7)
            return
        L3a:
            r0 = 0
            r7.q = r0
            long r5 = r8 >> r3
            int r7 = (int) r5
            float r7 = java.lang.Float.intBitsToFloat(r7)
            r4.setPivotX(r7)
            long r7 = r8 & r1
            int r7 = (int) r7
            float r7 = java.lang.Float.intBitsToFloat(r7)
            r4.setPivotY(r7)
            return
    }

    @Override // defpackage.wt2
    public final long r() {
            r2 = this;
            long r0 = r2.w
            return r0
    }

    @Override // defpackage.wt2
    public final void s() {
            r1 = this;
            r0 = 0
            oo7 r1 = r1.d
            r1.setRotationX(r0)
            return
    }

    @Override // defpackage.wt2
    public final void t(float r1) {
            r0 = this;
            r0.p = r1
            oo7 r0 = r0.d
            r0.setAlpha(r1)
            return
    }

    @Override // defpackage.wt2
    public final float u() {
            r0 = this;
            float r0 = r0.u
            return r0
    }

    @Override // defpackage.wt2
    public final void v() {
            r1 = this;
            r0 = 0
            oo7 r1 = r1.d
            r1.setRotationY(r0)
            return
    }

    @Override // defpackage.wt2
    public final long w() {
            r2 = this;
            long r0 = r2.x
            return r0
    }

    @Override // defpackage.wt2
    public final void x(long r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L11
            r2.w = r3
            oo7 r2 = r2.d
            int r3 = defpackage.hv.b0(r3)
            defpackage.o05.u(r2, r3)
        L11:
            return
    }

    @Override // defpackage.wt2
    public final void y() {
            r2 = this;
            android.graphics.Paint r0 = r2.g
            if (r0 != 0) goto Lb
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r2.g = r0
        Lb:
            r1 = 0
            r0.setColorFilter(r1)
            r2.Q()
            return
    }

    @Override // defpackage.wt2
    public final void z(float r1) {
            r0 = this;
            r0.r = r1
            oo7 r0 = r0.d
            r0.setScaleX(r1)
            return
    }
}
