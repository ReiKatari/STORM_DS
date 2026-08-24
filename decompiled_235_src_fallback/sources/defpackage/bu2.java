package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bu2  reason: default package */
/* loaded from: classes.dex */
public final class bu2 implements defpackage.wt2 {
    public final defpackage.ak0 b;
    public final defpackage.zj0 c;
    public final android.graphics.RenderNode d;
    public long e;
    public android.graphics.Paint f;
    public android.graphics.Matrix g;
    public boolean h;
    public float i;
    public int j;
    public float k;
    public float l;
    public float m;
    public float n;
    public float o;
    public long p;
    public long q;
    public float r;
    public float s;
    public boolean t;
    public boolean u;
    public boolean v;
    public defpackage.m50 w;
    public int x;

    public bu2() {
            r4 = this;
            ak0 r0 = new ak0
            r0.<init>()
            zj0 r1 = new zj0
            r1.<init>()
            r4.<init>()
            r4.b = r0
            r4.c = r1
            android.graphics.RenderNode r0 = defpackage.au2.f()
            r4.d = r0
            r1 = 0
            r4.e = r1
            defpackage.au2.B(r0)
            r1 = 0
            r4.Q(r0, r1)
            r0 = 1065353216(0x3f800000, float:1.0)
            r4.i = r0
            r2 = 3
            r4.j = r2
            r4.k = r0
            r4.l = r0
            long r2 = defpackage.kt0.b
            r4.p = r2
            r4.q = r2
            r0 = 1090519040(0x41000000, float:8.0)
            r4.s = r0
            r4.x = r1
            return
    }

    @Override // defpackage.wt2
    public final float A() {
            r0 = this;
            float r0 = r0.s
            return r0
    }

    @Override // defpackage.wt2
    public final void B(long r5, int r7, int r8) {
            r4 = this;
            android.graphics.RenderNode r0 = r4.d
            r1 = 32
            long r1 = r5 >> r1
            int r1 = (int) r1
            int r1 = r1 + r7
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r5
            int r2 = (int) r2
            int r2 = r2 + r8
            defpackage.au2.l(r0, r7, r8, r1, r2)
            long r5 = defpackage.qo2.S(r5)
            r4.e = r5
            return
    }

    @Override // defpackage.wt2
    public final float C() {
            r0 = this;
            float r0 = r0.m
            return r0
    }

    @Override // defpackage.wt2
    public final void D(defpackage.m50 r3) {
            r2 = this;
            r2.w = r3
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto L15
            android.graphics.RenderNode r2 = r2.d
            if (r3 == 0) goto L11
            android.graphics.RenderEffect r3 = r3.a()
            goto L12
        L11:
            r3 = 0
        L12:
            defpackage.ij5.n(r2, r3)
        L15:
            return
    }

    @Override // defpackage.wt2
    public final void E(boolean r1) {
            r0 = this;
            r0.t = r1
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
    public final void G(defpackage.qh1 r6, defpackage.kk3 r7, defpackage.ut2 r8, defpackage.mc r9) {
            r5 = this;
            zj0 r0 = r5.c
            android.graphics.RenderNode r1 = r5.d
            android.graphics.RecordingCanvas r1 = defpackage.au2.e(r1)
            ak0 r2 = r5.b     // Catch: java.lang.Throwable -> L2f
            wd r3 = r2.a     // Catch: java.lang.Throwable -> L2f
            android.graphics.Canvas r4 = r3.a     // Catch: java.lang.Throwable -> L2f
            r3.a = r1     // Catch: java.lang.Throwable -> L2f
            bt r1 = r0.B     // Catch: java.lang.Throwable -> L2f
            r1.W(r6)     // Catch: java.lang.Throwable -> L2f
            r1.X(r7)     // Catch: java.lang.Throwable -> L2f
            r1.L = r8     // Catch: java.lang.Throwable -> L2f
            long r6 = r5.e     // Catch: java.lang.Throwable -> L2f
            r1.Y(r6)     // Catch: java.lang.Throwable -> L2f
            r1.V(r3)     // Catch: java.lang.Throwable -> L2f
            r9.g(r0)     // Catch: java.lang.Throwable -> L2f
            wd r6 = r2.a     // Catch: java.lang.Throwable -> L2f
            r6.a = r4     // Catch: java.lang.Throwable -> L2f
            android.graphics.RenderNode r5 = r5.d
            defpackage.au2.z(r5)
            return
        L2f:
            r6 = move-exception
            android.graphics.RenderNode r5 = r5.d
            defpackage.au2.z(r5)
            throw r6
    }

    @Override // defpackage.wt2
    public final void H(int r1) {
            r0 = this;
            r0.x = r1
            r0.R()
            return
    }

    @Override // defpackage.wt2
    public final void I(float r1) {
            r0 = this;
            r0.m = r1
            android.graphics.RenderNode r0 = r0.d
            defpackage.au2.A(r0, r1)
            return
    }

    @Override // defpackage.wt2
    public final void J(long r1) {
            r0 = this;
            r0.q = r1
            android.graphics.RenderNode r0 = r0.d
            int r1 = defpackage.hv.b0(r1)
            defpackage.au2.s(r0, r1)
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
            android.graphics.RenderNode r1 = r1.d
            defpackage.yz0.j(r1, r0)
            return r0
    }

    @Override // defpackage.wt2
    public final void L(float r1) {
            r0 = this;
            r0.s = r1
            android.graphics.RenderNode r0 = r0.d
            defpackage.au2.w(r0, r1)
            return
    }

    @Override // defpackage.wt2
    public final float M() {
            r0 = this;
            float r0 = r0.o
            return r0
    }

    @Override // defpackage.wt2
    public final float N() {
            r0 = this;
            float r0 = r0.l
            return r0
    }

    @Override // defpackage.wt2
    public final int O() {
            r0 = this;
            int r0 = r0.j
            return r0
    }

    public final void P() {
            r4 = this;
            boolean r0 = r4.t
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
            boolean r0 = r4.u
            if (r3 == r0) goto L1f
            r4.u = r3
            android.graphics.RenderNode r0 = r4.d
            defpackage.yz0.l(r0, r3)
        L1f:
            boolean r0 = r4.v
            if (r1 == r0) goto L2a
            r4.v = r1
            android.graphics.RenderNode r4 = r4.d
            defpackage.yz0.y(r4, r1)
        L2a:
            return
    }

    public final void Q(android.graphics.RenderNode r2, int r3) {
            r1 = this;
            android.graphics.Paint r1 = r1.f
            r0 = 1
            if (r3 != r0) goto Lc
            defpackage.au2.m(r2, r1)
            defpackage.au2.i(r2)
            return
        Lc:
            r0 = 2
            if (r3 != r0) goto L16
            defpackage.au2.t(r2, r1)
            defpackage.au2.q(r2)
            return
        L16:
            defpackage.au2.t(r2, r1)
            defpackage.au2.i(r2)
            return
    }

    public final void R() {
            r4 = this;
            int r0 = r4.x
            r1 = 1
            if (r0 != r1) goto L6
            goto L16
        L6:
            int r2 = r4.j
            r3 = 3
            if (r2 != r3) goto L16
            m50 r2 = r4.w
            if (r2 == 0) goto L10
            goto L16
        L10:
            android.graphics.RenderNode r1 = r4.d
            r4.Q(r1, r0)
            return
        L16:
            android.graphics.RenderNode r0 = r4.d
            r4.Q(r0, r1)
            return
    }

    @Override // defpackage.wt2
    public final float a() {
            r0 = this;
            float r0 = r0.i
            return r0
    }

    @Override // defpackage.wt2
    public final float b() {
            r0 = this;
            float r0 = r0.k
            return r0
    }

    @Override // defpackage.wt2
    public final void c(float r1) {
            r0 = this;
            r0.o = r1
            android.graphics.RenderNode r0 = r0.d
            defpackage.au2.y(r0, r1)
            return
    }

    @Override // defpackage.wt2
    public final defpackage.m50 d() {
            r0 = this;
            m50 r0 = r0.w
            return r0
    }

    @Override // defpackage.wt2
    public final void e(float r1) {
            r0 = this;
            r0.r = r1
            android.graphics.RenderNode r0 = r0.d
            defpackage.au2.C(r0, r1)
            return
    }

    @Override // defpackage.wt2
    public final void f(float r1) {
            r0 = this;
            r0.n = r1
            android.graphics.RenderNode r0 = r0.d
            defpackage.yz0.x(r0, r1)
            return
    }

    @Override // defpackage.wt2
    public final void g(android.graphics.Outline r1, long r2) {
            r0 = this;
            android.graphics.RenderNode r2 = r0.d
            defpackage.yz0.k(r2, r1)
            if (r1 == 0) goto L9
            r1 = 1
            goto La
        L9:
            r1 = 0
        La:
            r0.h = r1
            r0.P()
            return
    }

    @Override // defpackage.wt2
    public final void h(int r2) {
            r1 = this;
            r1.j = r2
            android.graphics.Paint r0 = r1.f
            if (r0 != 0) goto Ld
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r1.f = r0
        Ld:
            android.graphics.BlendMode r2 = defpackage.f04.S(r2)
            defpackage.au2.h(r0, r2)
            r1.R()
            return
    }

    @Override // defpackage.wt2
    public final void i() {
            r0 = this;
            android.graphics.RenderNode r0 = r0.d
            defpackage.yz0.h(r0)
            return
    }

    @Override // defpackage.wt2
    public final void j(defpackage.xj0 r2) {
            r1 = this;
            android.graphics.Canvas r0 = defpackage.xd.a
            wd r2 = (defpackage.wd) r2
            android.graphics.Canvas r2 = r2.a
            android.graphics.RenderNode r1 = r1.d
            defpackage.au2.g(r2, r1)
            return
    }

    @Override // defpackage.wt2
    public final int k() {
            r0 = this;
            int r0 = r0.x
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
            r0.l = r1
            android.graphics.RenderNode r0 = r0.d
            defpackage.yz0.i(r0, r1)
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
            android.graphics.RenderNode r0 = r0.d
            boolean r0 = defpackage.yz0.t(r0)
            return r0
    }

    @Override // defpackage.wt2
    public final float p() {
            r0 = this;
            float r0 = r0.r
            return r0
    }

    @Override // defpackage.wt2
    public final void q(long r5) {
            r4 = this;
            r0 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            long r0 = r0 & r5
            r2 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            android.graphics.RenderNode r1 = r4.d
            if (r0 != 0) goto L15
            defpackage.au2.x(r1)
            return
        L15:
            r0 = 32
            long r2 = r5 >> r0
            int r0 = (int) r2
            float r0 = java.lang.Float.intBitsToFloat(r0)
            defpackage.au2.j(r1, r0)
            android.graphics.RenderNode r4 = r4.d
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r5 = r5 & r0
            int r5 = (int) r5
            float r5 = java.lang.Float.intBitsToFloat(r5)
            defpackage.au2.r(r4, r5)
            return
    }

    @Override // defpackage.wt2
    public final long r() {
            r2 = this;
            long r0 = r2.p
            return r0
    }

    @Override // defpackage.wt2
    public final void s() {
            r0 = this;
            android.graphics.RenderNode r0 = r0.d
            defpackage.au2.v(r0)
            return
    }

    @Override // defpackage.wt2
    public final void t(float r1) {
            r0 = this;
            r0.i = r1
            android.graphics.RenderNode r0 = r0.d
            defpackage.yz0.A(r0, r1)
            return
    }

    @Override // defpackage.wt2
    public final float u() {
            r0 = this;
            float r0 = r0.n
            return r0
    }

    @Override // defpackage.wt2
    public final void v() {
            r0 = this;
            android.graphics.RenderNode r0 = r0.d
            defpackage.au2.D(r0)
            return
    }

    @Override // defpackage.wt2
    public final long w() {
            r2 = this;
            long r0 = r2.q
            return r0
    }

    @Override // defpackage.wt2
    public final void x(long r1) {
            r0 = this;
            r0.p = r1
            android.graphics.RenderNode r0 = r0.d
            int r1 = defpackage.hv.b0(r1)
            defpackage.au2.k(r0, r1)
            return
    }

    @Override // defpackage.wt2
    public final void y() {
            r2 = this;
            android.graphics.Paint r0 = r2.f
            if (r0 != 0) goto Lb
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r2.f = r0
        Lb:
            r1 = 0
            r0.setColorFilter(r1)
            r2.R()
            return
    }

    @Override // defpackage.wt2
    public final void z(float r1) {
            r0 = this;
            r0.k = r1
            android.graphics.RenderNode r0 = r0.d
            defpackage.yz0.C(r0, r1)
            return
    }
}
