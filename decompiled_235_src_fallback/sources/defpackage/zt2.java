package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zt2  reason: default package */
/* loaded from: classes.dex */
public final class zt2 implements defpackage.wt2 {
    public static final java.util.concurrent.atomic.AtomicBoolean A = null;
    public final defpackage.ak0 b;
    public final defpackage.zj0 c;
    public final android.view.RenderNode d;
    public long e;
    public android.graphics.Paint f;
    public android.graphics.Matrix g;
    public boolean h;
    public long i;
    public int j;
    public int k;
    public float l;
    public boolean m;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public long s;
    public long t;
    public float u;
    public float v;
    public boolean w;
    public boolean x;
    public boolean y;
    public defpackage.m50 z;

    static {
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 1
            r0.<init>(r1)
            defpackage.zt2.A = r0
            return
    }

    public zt2(defpackage.te r2, defpackage.ak0 r3, defpackage.zj0 r4) {
            r1 = this;
            r1.<init>()
            r1.b = r3
            r1.c = r4
            java.lang.String r3 = "Compose"
            android.view.RenderNode r2 = android.view.RenderNode.create(r3, r2)
            r1.d = r2
            r3 = 0
            r1.e = r3
            r1.i = r3
            java.util.concurrent.atomic.AtomicBoolean r3 = defpackage.zt2.A
            r4 = 0
            boolean r3 = r3.getAndSet(r4)
            if (r3 == 0) goto La9
            float r3 = r2.getScaleX()
            r2.setScaleX(r3)
            float r3 = r2.getScaleY()
            r2.setScaleY(r3)
            float r3 = r2.getTranslationX()
            r2.setTranslationX(r3)
            float r3 = r2.getTranslationY()
            r2.setTranslationY(r3)
            float r3 = r2.getElevation()
            r2.setElevation(r3)
            float r3 = r2.getRotation()
            r2.setRotation(r3)
            float r3 = r2.getRotationX()
            r2.setRotationX(r3)
            float r3 = r2.getRotationY()
            r2.setRotationY(r3)
            float r3 = r2.getCameraDistance()
            r2.setCameraDistance(r3)
            float r3 = r2.getPivotX()
            r2.setPivotX(r3)
            float r3 = r2.getPivotY()
            r2.setPivotY(r3)
            boolean r3 = r2.getClipToOutline()
            r2.setClipToOutline(r3)
            r2.setClipToBounds(r4)
            float r3 = r2.getAlpha()
            r2.setAlpha(r3)
            r2.isValid()
            r2.setLeftTopRightBottom(r4, r4, r4, r4)
            r2.offsetLeftAndRight(r4)
            r2.offsetTopAndBottom(r4)
            int r3 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r3 < r0) goto L9c
            int r3 = defpackage.kj5.a(r2)
            defpackage.kj5.c(r2, r3)
            int r3 = defpackage.kj5.b(r2)
            defpackage.kj5.d(r2, r3)
        L9c:
            defpackage.jj5.a(r2)
            r2.setLayerType(r4)
            boolean r3 = r2.hasOverlappingRendering()
            r2.setHasOverlappingRendering(r3)
        La9:
            r2.setClipToBounds(r4)
            r1.Q(r4)
            r1.j = r4
            r2 = 3
            r1.k = r2
            r2 = 1065353216(0x3f800000, float:1.0)
            r1.l = r2
            r1.n = r2
            r1.o = r2
            long r2 = defpackage.kt0.b
            r1.s = r2
            r1.t = r2
            r2 = 1090519040(0x41000000, float:8.0)
            r1.v = r2
            return
    }

    @Override // defpackage.wt2
    public final float A() {
            r0 = this;
            float r0 = r0.v
            return r0
    }

    @Override // defpackage.wt2
    public final void B(long r6, int r8, int r9) {
            r5 = this;
            android.view.RenderNode r0 = r5.d
            r1 = 32
            long r1 = r6 >> r1
            int r1 = (int) r1
            int r2 = r8 + r1
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r6
            int r3 = (int) r3
            int r4 = r9 + r3
            r0.setLeftTopRightBottom(r8, r9, r2, r4)
            long r8 = r5.e
            boolean r8 = defpackage.q93.b(r8, r6)
            if (r8 != 0) goto L33
            boolean r8 = r5.m
            if (r8 == 0) goto L31
            android.view.RenderNode r8 = r5.d
            float r9 = (float) r1
            r0 = 1073741824(0x40000000, float:2.0)
            float r9 = r9 / r0
            r8.setPivotX(r9)
            android.view.RenderNode r8 = r5.d
            float r9 = (float) r3
            float r9 = r9 / r0
            r8.setPivotY(r9)
        L31:
            r5.e = r6
        L33:
            return
    }

    @Override // defpackage.wt2
    public final float C() {
            r0 = this;
            float r0 = r0.p
            return r0
    }

    @Override // defpackage.wt2
    public final void D(defpackage.m50 r1) {
            r0 = this;
            r0.z = r1
            return
    }

    @Override // defpackage.wt2
    public final void E(boolean r1) {
            r0 = this;
            r0.w = r1
            r0.P()
            return
    }

    @Override // defpackage.wt2
    public final float F() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.wt2
    public final void G(defpackage.qh1 r15, defpackage.kk3 r16, defpackage.ut2 r17, defpackage.mc r18) {
            r14 = this;
            android.view.RenderNode r0 = r14.d
            long r1 = r14.e
            r3 = 32
            long r1 = r1 >> r3
            int r1 = (int) r1
            long r4 = r14.i
            long r2 = r4 >> r3
            int r2 = (int) r2
            int r1 = java.lang.Math.max(r1, r2)
            long r2 = r14.e
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r4
            int r2 = (int) r2
            long r6 = r14.i
            long r3 = r6 & r4
            int r3 = (int) r3
            int r2 = java.lang.Math.max(r2, r3)
            android.view.DisplayListCanvas r1 = r0.start(r1, r2)
            ak0 r0 = r14.b     // Catch: java.lang.Throwable -> L83
            wd r2 = r0.a     // Catch: java.lang.Throwable -> L83
            r0 = r1
            android.graphics.Canvas r0 = (android.graphics.Canvas) r0     // Catch: java.lang.Throwable -> L83
            android.graphics.Canvas r3 = r2.a     // Catch: java.lang.Throwable -> L83
            r2.a = r0     // Catch: java.lang.Throwable -> L83
            zj0 r4 = r14.c     // Catch: java.lang.Throwable -> L83
            bt r0 = r4.B     // Catch: java.lang.Throwable -> L83
            long r5 = r14.e     // Catch: java.lang.Throwable -> L83
            long r5 = defpackage.qo2.S(r5)     // Catch: java.lang.Throwable -> L83
            qh1 r7 = r0.I()     // Catch: java.lang.Throwable -> L83
            kk3 r8 = r0.K()     // Catch: java.lang.Throwable -> L83
            xj0 r9 = r0.G()     // Catch: java.lang.Throwable -> L83
            long r10 = r0.L()     // Catch: java.lang.Throwable -> L83
            java.lang.Object r12 = r0.L     // Catch: java.lang.Throwable -> L83
            ut2 r12 = (defpackage.ut2) r12     // Catch: java.lang.Throwable -> L83
            r0.W(r15)     // Catch: java.lang.Throwable -> L83
            r13 = r16
            r0.X(r13)     // Catch: java.lang.Throwable -> L83
            r0.V(r2)     // Catch: java.lang.Throwable -> L83
            r0.Y(r5)     // Catch: java.lang.Throwable -> L83
            r5 = r17
            r0.L = r5     // Catch: java.lang.Throwable -> L83
            r2.h()     // Catch: java.lang.Throwable -> L83
            r5 = r18
            r5.g(r4)     // Catch: java.lang.Throwable -> L85
            r2.p()     // Catch: java.lang.Throwable -> L83
            r0.W(r7)     // Catch: java.lang.Throwable -> L83
            r0.X(r8)     // Catch: java.lang.Throwable -> L83
            r0.V(r9)     // Catch: java.lang.Throwable -> L83
            r0.Y(r10)     // Catch: java.lang.Throwable -> L83
            r0.L = r12     // Catch: java.lang.Throwable -> L83
            r2.a = r3     // Catch: java.lang.Throwable -> L83
            android.view.RenderNode r14 = r14.d
            r14.end(r1)
            return
        L83:
            r0 = move-exception
            goto L9a
        L85:
            r0 = move-exception
            r2.p()     // Catch: java.lang.Throwable -> L83
            bt r2 = r4.B     // Catch: java.lang.Throwable -> L83
            r2.W(r7)     // Catch: java.lang.Throwable -> L83
            r2.X(r8)     // Catch: java.lang.Throwable -> L83
            r2.V(r9)     // Catch: java.lang.Throwable -> L83
            r2.Y(r10)     // Catch: java.lang.Throwable -> L83
            r2.L = r12     // Catch: java.lang.Throwable -> L83
            throw r0     // Catch: java.lang.Throwable -> L83
        L9a:
            android.view.RenderNode r14 = r14.d
            r14.end(r1)
            throw r0
    }

    @Override // defpackage.wt2
    public final void H(int r1) {
            r0 = this;
            r0.j = r1
            r0.R()
            return
    }

    @Override // defpackage.wt2
    public final void I(float r1) {
            r0 = this;
            r0.p = r1
            android.view.RenderNode r0 = r0.d
            r0.setTranslationX(r1)
            return
    }

    @Override // defpackage.wt2
    public final void J(long r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L11
            r2.t = r3
            android.view.RenderNode r2 = r2.d
            int r3 = defpackage.hv.b0(r3)
            defpackage.kj5.d(r2, r3)
        L11:
            return
    }

    @Override // defpackage.wt2
    public final android.graphics.Matrix K() {
            r1 = this;
            android.graphics.Matrix r0 = r1.g
            if (r0 != 0) goto Lb
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r1.g = r0
        Lb:
            android.view.RenderNode r1 = r1.d
            r1.getMatrix(r0)
            return r0
    }

    @Override // defpackage.wt2
    public final void L(float r1) {
            r0 = this;
            r0.v = r1
            android.view.RenderNode r0 = r0.d
            float r1 = -r1
            r0.setCameraDistance(r1)
            return
    }

    @Override // defpackage.wt2
    public final float M() {
            r0 = this;
            float r0 = r0.r
            return r0
    }

    @Override // defpackage.wt2
    public final float N() {
            r0 = this;
            float r0 = r0.o
            return r0
    }

    @Override // defpackage.wt2
    public final int O() {
            r0 = this;
            int r0 = r0.k
            return r0
    }

    public final void P() {
            r4 = this;
            boolean r0 = r4.w
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Lc
            boolean r3 = r4.h
            if (r3 != 0) goto Lc
            r3 = r2
            goto Ld
        Lc:
            r3 = r1
        Ld:
            if (r0 == 0) goto L14
            boolean r0 = r4.h
            if (r0 == 0) goto L14
            r1 = r2
        L14:
            boolean r0 = r4.x
            if (r3 == r0) goto L1f
            r4.x = r3
            android.view.RenderNode r0 = r4.d
            r0.setClipToBounds(r3)
        L1f:
            boolean r0 = r4.y
            if (r1 == r0) goto L2a
            r4.y = r1
            android.view.RenderNode r4 = r4.d
            r4.setClipToOutline(r1)
        L2a:
            return
    }

    public final void Q(int r5) {
            r4 = this;
            android.view.RenderNode r0 = r4.d
            r1 = 2
            r2 = 1
            if (r5 != r2) goto L12
            r0.setLayerType(r1)
            android.graphics.Paint r4 = r4.f
            r0.setLayerPaint(r4)
            r0.setHasOverlappingRendering(r2)
            return
        L12:
            r3 = 0
            if (r5 != r1) goto L21
            r0.setLayerType(r3)
            android.graphics.Paint r4 = r4.f
            r0.setLayerPaint(r4)
            r0.setHasOverlappingRendering(r3)
            return
        L21:
            r0.setLayerType(r3)
            android.graphics.Paint r4 = r4.f
            r0.setLayerPaint(r4)
            r0.setHasOverlappingRendering(r2)
            return
    }

    public final void R() {
            r4 = this;
            int r0 = r4.j
            r1 = 1
            if (r0 != r1) goto L6
            goto Lf
        L6:
            int r2 = r4.k
            r3 = 3
            if (r2 != r3) goto Lf
            r4.Q(r0)
            return
        Lf:
            r4.Q(r1)
            return
    }

    @Override // defpackage.wt2
    public final float a() {
            r0 = this;
            float r0 = r0.l
            return r0
    }

    @Override // defpackage.wt2
    public final float b() {
            r0 = this;
            float r0 = r0.n
            return r0
    }

    @Override // defpackage.wt2
    public final void c(float r1) {
            r0 = this;
            r0.r = r1
            android.view.RenderNode r0 = r0.d
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
            r0.u = r1
            android.view.RenderNode r0 = r0.d
            r0.setRotation(r1)
            return
    }

    @Override // defpackage.wt2
    public final void f(float r1) {
            r0 = this;
            r0.q = r1
            android.view.RenderNode r0 = r0.d
            r0.setTranslationY(r1)
            return
    }

    @Override // defpackage.wt2
    public final void g(android.graphics.Outline r1, long r2) {
            r0 = this;
            r0.i = r2
            android.view.RenderNode r2 = r0.d
            r2.setOutline(r1)
            if (r1 == 0) goto Lb
            r1 = 1
            goto Lc
        Lb:
            r1 = 0
        Lc:
            r0.h = r1
            r0.P()
            return
    }

    @Override // defpackage.wt2
    public final void h(int r3) {
            r2 = this;
            int r0 = r2.k
            if (r0 != r3) goto L5
            return
        L5:
            r2.k = r3
            android.graphics.Paint r0 = r2.f
            if (r0 != 0) goto L12
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r2.f = r0
        L12:
            android.graphics.PorterDuffXfermode r1 = new android.graphics.PorterDuffXfermode
            android.graphics.PorterDuff$Mode r3 = defpackage.f04.T(r3)
            r1.<init>(r3)
            r0.setXfermode(r1)
            r2.R()
            return
    }

    @Override // defpackage.wt2
    public final void i() {
            r0 = this;
            android.view.RenderNode r0 = r0.d
            defpackage.jj5.a(r0)
            return
    }

    @Override // defpackage.wt2
    public final void j(defpackage.xj0 r2) {
            r1 = this;
            android.graphics.Canvas r0 = defpackage.xd.a
            wd r2 = (defpackage.wd) r2
            android.graphics.Canvas r2 = r2.a
            r2.getClass()
            android.view.DisplayListCanvas r2 = (android.view.DisplayListCanvas) r2
            android.view.RenderNode r1 = r1.d
            r2.drawRenderNode(r1)
            return
    }

    @Override // defpackage.wt2
    public final int k() {
            r0 = this;
            int r0 = r0.j
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
            r0.o = r1
            android.view.RenderNode r0 = r0.d
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
    public final boolean o() {
            r0 = this;
            android.view.RenderNode r0 = r0.d
            boolean r0 = r0.isValid()
            return r0
    }

    @Override // defpackage.wt2
    public final float p() {
            r0 = this;
            float r0 = r0.u
            return r0
    }

    @Override // defpackage.wt2
    public final void q(long r7) {
            r6 = this;
            r0 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            long r0 = r0 & r7
            r2 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r3 = 32
            if (r0 != 0) goto L33
            r7 = 1
            r6.m = r7
            android.view.RenderNode r7 = r6.d
            long r4 = r6.e
            long r3 = r4 >> r3
            int r8 = (int) r3
            float r8 = (float) r8
            r0 = 1073741824(0x40000000, float:2.0)
            float r8 = r8 / r0
            r7.setPivotX(r8)
            android.view.RenderNode r7 = r6.d
            long r3 = r6.e
            long r1 = r1 & r3
            int r6 = (int) r1
            float r6 = (float) r6
            float r6 = r6 / r0
            r7.setPivotY(r6)
            return
        L33:
            r0 = 0
            r6.m = r0
            android.view.RenderNode r0 = r6.d
            long r3 = r7 >> r3
            int r3 = (int) r3
            float r3 = java.lang.Float.intBitsToFloat(r3)
            r0.setPivotX(r3)
            android.view.RenderNode r6 = r6.d
            long r7 = r7 & r1
            int r7 = (int) r7
            float r7 = java.lang.Float.intBitsToFloat(r7)
            r6.setPivotY(r7)
            return
    }

    @Override // defpackage.wt2
    public final long r() {
            r2 = this;
            long r0 = r2.s
            return r0
    }

    @Override // defpackage.wt2
    public final void s() {
            r1 = this;
            r0 = 0
            android.view.RenderNode r1 = r1.d
            r1.setRotationX(r0)
            return
    }

    @Override // defpackage.wt2
    public final void t(float r1) {
            r0 = this;
            r0.l = r1
            android.view.RenderNode r0 = r0.d
            r0.setAlpha(r1)
            return
    }

    @Override // defpackage.wt2
    public final float u() {
            r0 = this;
            float r0 = r0.q
            return r0
    }

    @Override // defpackage.wt2
    public final void v() {
            r1 = this;
            r0 = 0
            android.view.RenderNode r1 = r1.d
            r1.setRotationY(r0)
            return
    }

    @Override // defpackage.wt2
    public final long w() {
            r2 = this;
            long r0 = r2.t
            return r0
    }

    @Override // defpackage.wt2
    public final void x(long r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L11
            r2.s = r3
            android.view.RenderNode r2 = r2.d
            int r3 = defpackage.hv.b0(r3)
            defpackage.kj5.c(r2, r3)
        L11:
            return
    }

    @Override // defpackage.wt2
    public final void y() {
            r0 = this;
            r0.R()
            return
    }

    @Override // defpackage.wt2
    public final void z(float r1) {
            r0 = this;
            r0.n = r1
            android.view.RenderNode r0 = r0.d
            r0.setScaleX(r1)
            return
    }
}
