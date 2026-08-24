package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: um3  reason: default package */
/* loaded from: classes.dex */
public final class um3 implements defpackage.no1 {
    public final defpackage.zj0 A;
    public defpackage.mo1 B;

    public um3() {
            r1 = this;
            zj0 r0 = new zj0
            r0.<init>()
            r1.<init>()
            r1.A = r0
            return
    }

    @Override // defpackage.no1
    public final void C(long r1, long r3, long r5, float r7, int r8) {
            r0 = this;
            zj0 r0 = r0.A
            r0.C(r1, r3, r5, r7, r8)
            return
    }

    @Override // defpackage.no1
    public final void L(long r1, float r3, long r4, defpackage.oo1 r6) {
            r0 = this;
            zj0 r0 = r0.A
            r0.L(r1, r3, r4, r6)
            return
    }

    @Override // defpackage.qh1
    public final long M(float r1) {
            r0 = this;
            zj0 r0 = r0.A
            long r0 = r0.M(r1)
            return r0
    }

    @Override // defpackage.qh1
    public final float Q(int r1) {
            r0 = this;
            zj0 r0 = r0.A
            float r0 = r0.Q(r1)
            return r0
    }

    @Override // defpackage.qh1
    public final float T(float r1) {
            r0 = this;
            zj0 r0 = r0.A
            float r0 = r0.a()
            float r1 = r1 / r0
            return r1
    }

    @Override // defpackage.no1
    public final void W(defpackage.f80 r1, long r2, long r4, float r6, defpackage.oo1 r7, int r8) {
            r0 = this;
            zj0 r0 = r0.A
            r0.W(r1, r2, r4, r6, r7, r8)
            return
    }

    @Override // defpackage.qh1
    public final float Y() {
            r0 = this;
            zj0 r0 = r0.A
            float r0 = r0.Y()
            return r0
    }

    @Override // defpackage.qh1
    public final float a() {
            r0 = this;
            zj0 r0 = r0.A
            float r0 = r0.a()
            return r0
    }

    public final void b() {
            r11 = this;
            zj0 r0 = r11.A
            bt r1 = r0.B
            xj0 r3 = r1.G()
            mo1 r11 = r11.B
            if (r11 == 0) goto Lb8
            r1 = r11
            z64 r1 = (defpackage.z64) r1
            z64 r2 = r1.A
            z64 r2 = r2.Y
            r9 = 0
            r10 = 4
            if (r2 != 0) goto L18
            goto L2f
        L18:
            int r4 = r2.R
            r4 = r4 & r10
            if (r4 != 0) goto L1e
            goto L2f
        L1e:
            if (r2 == 0) goto L2f
            int r4 = r2.L
            r5 = r4 & 2
            if (r5 == 0) goto L27
            goto L2f
        L27:
            r4 = r4 & 4
            if (r4 == 0) goto L2c
            goto L30
        L2c:
            z64 r2 = r2.Y
            goto L1e
        L2f:
            r2 = r9
        L30:
            if (r2 == 0) goto L9d
            r11 = r9
        L33:
            if (r2 == 0) goto L9c
            boolean r1 = r2 instanceof defpackage.mo1
            if (r1 == 0) goto L60
            r7 = r2
            mo1 r7 = (defpackage.mo1) r7
            bt r1 = r0.B
            java.lang.Object r1 = r1.L
            r8 = r1
            ut2 r8 = (defpackage.ut2) r8
            eg4 r6 = defpackage.nc1.d0(r7, r10)
            long r1 = r6.L
            long r4 = defpackage.qo2.S(r1)
            sm3 r1 = r6.k0
            r1.getClass()
            zp4 r1 = defpackage.vm3.a(r1)
            te r1 = (defpackage.te) r1
            um3 r2 = r1.getSharedDrawScope()
            r2.c(r3, r4, r6, r7, r8)
            goto L97
        L60:
            int r1 = r2.L
            r1 = r1 & r10
            if (r1 == 0) goto L97
            boolean r1 = r2 instanceof defpackage.zg1
            if (r1 == 0) goto L97
            r1 = r2
            zg1 r1 = (defpackage.zg1) r1
            z64 r1 = r1.l0
            r4 = 0
        L6f:
            r5 = 1
            if (r1 == 0) goto L94
            int r6 = r1.L
            r6 = r6 & r10
            if (r6 == 0) goto L91
            int r4 = r4 + 1
            if (r4 != r5) goto L7d
            r2 = r1
            goto L91
        L7d:
            if (r11 != 0) goto L88
            ua4 r11 = new ua4
            r5 = 16
            z64[] r5 = new defpackage.z64[r5]
            r11.<init>(r5)
        L88:
            if (r2 == 0) goto L8e
            r11.b(r2)
            r2 = r9
        L8e:
            r11.b(r1)
        L91:
            z64 r1 = r1.Y
            goto L6f
        L94:
            if (r4 != r5) goto L97
            goto L33
        L97:
            z64 r2 = defpackage.nc1.A(r11)
            goto L33
        L9c:
            return
        L9d:
            eg4 r11 = defpackage.nc1.d0(r11, r10)
            z64 r2 = r11.Y0()
            z64 r1 = r1.A
            if (r2 != r1) goto Lae
            eg4 r11 = r11.n0
            r11.getClass()
        Lae:
            bt r0 = r0.B
            java.lang.Object r0 = r0.L
            ut2 r0 = (defpackage.ut2) r0
            r11.n1(r3, r0)
            return
        Lb8:
            java.lang.String r11 = "Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer."
            ug r11 = defpackage.i61.e(r11)
            throw r11
    }

    public final void c(defpackage.xj0 r10, long r11, defpackage.eg4 r13, defpackage.mo1 r14, defpackage.ut2 r15) {
            r9 = this;
            mo1 r0 = r9.B
            r9.B = r14
            sm3 r1 = r13.k0
            kk3 r1 = r1.v0
            zj0 r2 = r9.A
            bt r3 = r2.B
            qh1 r3 = r3.I()
            bt r2 = r2.B
            kk3 r4 = r2.K()
            xj0 r5 = r2.G()
            long r6 = r2.L()
            java.lang.Object r8 = r2.L
            ut2 r8 = (defpackage.ut2) r8
            r2.W(r13)
            r2.X(r1)
            r2.V(r10)
            r2.Y(r11)
            r2.L = r15
            r10.h()
            r14.m0(r9)     // Catch: java.lang.Throwable -> L4a
            r10.p()
            r2.W(r3)
            r2.X(r4)
            r2.V(r5)
            r2.Y(r6)
            r2.L = r8
            r9.B = r0
            return
        L4a:
            r9 = move-exception
            r10.p()
            r2.W(r3)
            r2.X(r4)
            r2.V(r5)
            r2.Y(r6)
            r2.L = r8
            throw r9
    }

    @Override // defpackage.no1
    public final void c0(defpackage.f80 r1, long r2, long r4, long r6, float r8, defpackage.oo1 r9) {
            r0 = this;
            zj0 r0 = r0.A
            r0.c0(r1, r2, r4, r6, r8, r9)
            return
    }

    public final void d(long r12, long r14, long r16, long r18, defpackage.oo1 r20, float r21) {
            r11 = this;
            zj0 r11 = r11.A
            yj0 r0 = r11.A
            xj0 r0 = r0.c
            r1 = 32
            long r2 = r14 >> r1
            int r2 = (int) r2
            float r3 = java.lang.Float.intBitsToFloat(r2)
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r14 & r4
            int r6 = (int) r6
            float r7 = java.lang.Float.intBitsToFloat(r6)
            float r2 = java.lang.Float.intBitsToFloat(r2)
            long r8 = r16 >> r1
            int r8 = (int) r8
            float r8 = java.lang.Float.intBitsToFloat(r8)
            float r8 = r8 + r2
            float r2 = java.lang.Float.intBitsToFloat(r6)
            long r9 = r16 & r4
            int r6 = (int) r9
            float r6 = java.lang.Float.intBitsToFloat(r6)
            float r6 = r6 + r2
            long r1 = r18 >> r1
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
            long r4 = r18 & r4
            int r2 = (int) r4
            float r2 = java.lang.Float.intBitsToFloat(r2)
            r4 = 3
            r14 = r11
            r15 = r12
            r17 = r20
            r18 = r21
            r19 = r4
            aj r11 = defpackage.zj0.b(r14, r15, r17, r18, r19)
            r19 = r11
            r12 = r0
            r17 = r1
            r18 = r2
            r13 = r3
            r16 = r6
            r14 = r7
            r15 = r8
            r12.g(r13, r14, r15, r16, r17, r18, r19)
            return
    }

    @Override // defpackage.no1
    public final long e() {
            r2 = this;
            zj0 r2 = r2.A
            long r0 = r2.e()
            return r0
    }

    @Override // defpackage.qh1
    public final float e0(float r1) {
            r0 = this;
            zj0 r0 = r0.A
            float r0 = r0.a()
            float r0 = r0 * r1
            return r0
    }

    @Override // defpackage.no1
    public final void g(defpackage.hj r1, defpackage.f80 r2, float r3, defpackage.oo1 r4, int r5) {
            r0 = this;
            zj0 r0 = r0.A
            r0.g(r1, r2, r3, r4, r5)
            return
    }

    @Override // defpackage.no1
    public final void g0(long r1, float r3, float r4, long r5, long r7, float r9, defpackage.ys6 r10) {
            r0 = this;
            zj0 r0 = r0.A
            r0.g0(r1, r3, r4, r5, r7, r9, r10)
            return
    }

    @Override // defpackage.no1
    public final defpackage.kk3 getLayoutDirection() {
            r0 = this;
            zj0 r0 = r0.A
            yj0 r0 = r0.A
            kk3 r0 = r0.b
            return r0
    }

    @Override // defpackage.no1
    public final void h(defpackage.hj r1, long r2, float r4, defpackage.oo1 r5) {
            r0 = this;
            zj0 r0 = r0.A
            r0.h(r1, r2, r4, r5)
            return
    }

    @Override // defpackage.no1
    public final defpackage.bt i0() {
            r0 = this;
            zj0 r0 = r0.A
            bt r0 = r0.B
            return r0
    }

    @Override // defpackage.qh1
    public final int k0(long r1) {
            r0 = this;
            zj0 r0 = r0.A
            int r0 = r0.k0(r1)
            return r0
    }

    @Override // defpackage.no1
    public final void n0(java.util.ArrayList r1, long r2, float r4) {
            r0 = this;
            zj0 r0 = r0.A
            r0.n0(r1, r2, r4)
            return
    }

    @Override // defpackage.qh1
    public final long p(float r1) {
            r0 = this;
            zj0 r0 = r0.A
            long r0 = r0.p(r1)
            return r0
    }

    @Override // defpackage.qh1
    public final long q(long r1) {
            r0 = this;
            zj0 r0 = r0.A
            long r0 = r0.q(r1)
            return r0
    }

    @Override // defpackage.no1
    public final void q0(defpackage.zh r1, long r2, long r4, long r6, float r8, defpackage.z40 r9, int r10) {
            r0 = this;
            zj0 r0 = r0.A
            r0.q0(r1, r2, r4, r6, r8, r9, r10)
            return
    }

    @Override // defpackage.qh1
    public final int r0(float r1) {
            r0 = this;
            zj0 r0 = r0.A
            int r0 = r0.r0(r1)
            return r0
    }

    @Override // defpackage.no1
    public final void s(long r1, long r3, long r5, float r7, defpackage.oo1 r8, int r9) {
            r0 = this;
            zj0 r0 = r0.A
            r0.s(r1, r3, r5, r7, r8, r9)
            return
    }

    @Override // defpackage.no1
    public final long t0() {
            r2 = this;
            zj0 r2 = r2.A
            long r0 = r2.t0()
            return r0
    }

    @Override // defpackage.qh1
    public final long v0(long r1) {
            r0 = this;
            zj0 r0 = r0.A
            long r0 = r0.v0(r1)
            return r0
    }

    @Override // defpackage.qh1
    public final float x(long r1) {
            r0 = this;
            zj0 r0 = r0.A
            float r0 = r0.x(r1)
            return r0
    }

    @Override // defpackage.qh1
    public final float y0(long r1) {
            r0 = this;
            zj0 r0 = r0.A
            float r0 = r0.y0(r1)
            return r0
    }
}
