package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zj0  reason: default package */
/* loaded from: classes.dex */
public final class zj0 implements defpackage.no1 {
    public final defpackage.yj0 A;
    public final defpackage.bt B;
    public defpackage.aj L;
    public defpackage.aj R;

    public zj0() {
            r3 = this;
            r3.<init>()
            yj0 r0 = new yj0
            th1 r1 = defpackage.hv.f
            kk3 r2 = defpackage.kk3.Ltr
            r0.<init>()
            r0.a = r1
            r0.b = r2
            ut1 r1 = defpackage.ut1.a
            r0.c = r1
            r1 = 0
            r0.d = r1
            r3.A = r0
            bt r0 = new bt
            r0.<init>(r3)
            r3.B = r0
            return
    }

    public static defpackage.aj b(defpackage.zj0 r2, long r3, defpackage.oo1 r5, float r6, int r7) {
            aj r2 = r2.i(r5)
            java.lang.Object r5 = r2.L
            android.graphics.Paint r5 = (android.graphics.Paint) r5
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 != 0) goto Lf
            goto L18
        Lf:
            float r0 = defpackage.kt0.e(r3)
            float r0 = r0 * r6
            long r3 = defpackage.kt0.c(r0, r3)
        L18:
            int r6 = r5.getColor()
            long r0 = defpackage.hv.b(r6)
            boolean r6 = defpackage.kt0.d(r0, r3)
            if (r6 != 0) goto L29
            r2.l(r3)
        L29:
            java.lang.Object r3 = r2.R
            android.graphics.Shader r3 = (android.graphics.Shader) r3
            r4 = 0
            if (r3 == 0) goto L33
            r2.p(r4)
        L33:
            java.lang.Object r3 = r2.X
            z40 r3 = (defpackage.z40) r3
            boolean r3 = defpackage.nb3.k(r3, r4)
            if (r3 != 0) goto L40
            r2.m(r4)
        L40:
            int r3 = r2.B
            if (r3 != r7) goto L45
            goto L48
        L45:
            r2.k(r7)
        L48:
            boolean r3 = r5.isFilterBitmap()
            r4 = 1
            if (r3 != r4) goto L50
            return r2
        L50:
            r2.n(r4)
            return r2
    }

    public static defpackage.aj d(defpackage.zj0 r4, long r5, float r7, int r8) {
            aj r0 = r4.R
            r1 = 1
            if (r0 != 0) goto Le
            aj r0 = defpackage.nc1.t()
            r0.t(r1)
            r4.R = r0
        Le:
            java.lang.Object r4 = r0.L
            android.graphics.Paint r4 = (android.graphics.Paint) r4
            int r2 = r4.getColor()
            long r2 = defpackage.hv.b(r2)
            boolean r2 = defpackage.kt0.d(r2, r5)
            if (r2 != 0) goto L23
            r0.l(r5)
        L23:
            java.lang.Object r5 = r0.R
            android.graphics.Shader r5 = (android.graphics.Shader) r5
            r6 = 0
            if (r5 == 0) goto L2d
            r0.p(r6)
        L2d:
            java.lang.Object r5 = r0.X
            z40 r5 = (defpackage.z40) r5
            boolean r5 = defpackage.nb3.k(r5, r6)
            if (r5 != 0) goto L3a
            r0.m(r6)
        L3a:
            int r5 = r0.B
            r2 = 3
            if (r5 != r2) goto L40
            goto L43
        L40:
            r0.k(r2)
        L43:
            float r5 = r4.getStrokeWidth()
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 != 0) goto L4c
            goto L4f
        L4c:
            r0.s(r7)
        L4f:
            float r5 = r4.getStrokeMiter()
            r7 = 1082130432(0x40800000, float:4.0)
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 != 0) goto L5a
            goto L5d
        L5a:
            r4.setStrokeMiter(r7)
        L5d:
            int r5 = r0.g()
            if (r5 != r8) goto L64
            goto L67
        L64:
            r0.q(r8)
        L67:
            int r5 = r0.h()
            if (r5 != 0) goto L6e
            goto L72
        L6e:
            r5 = 0
            r0.r(r5)
        L72:
            boolean r5 = defpackage.nb3.k(r6, r6)
            if (r5 != 0) goto L7b
            r0.o(r6)
        L7b:
            boolean r4 = r4.isFilterBitmap()
            if (r4 != r1) goto L82
            return r0
        L82:
            r0.n(r1)
            return r0
    }

    @Override // defpackage.no1
    public final void C(long r2, long r4, long r6, float r8, int r9) {
            r1 = this;
            yj0 r0 = r1.A
            xj0 r0 = r0.c
            aj r1 = d(r1, r2, r8, r9)
            r2 = r4
            r4 = r6
            r6 = r1
            r1 = r0
            r1.i(r2, r4, r6)
            return
    }

    @Override // defpackage.no1
    public final void L(long r8, float r10, long r11, defpackage.oo1 r13) {
            r7 = this;
            yj0 r0 = r7.A
            xj0 r0 = r0.c
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 3
            r1 = r7
            r2 = r8
            r4 = r13
            aj r7 = b(r1, r2, r4, r5, r6)
            r0.d(r10, r11, r7)
            return
    }

    @Override // defpackage.no1
    public final void W(defpackage.f80 r12, long r13, long r15, float r17, defpackage.oo1 r18, int r19) {
            r11 = this;
            yj0 r0 = r11.A
            xj0 r0 = r0.c
            r1 = 32
            long r2 = r13 >> r1
            int r2 = (int) r2
            float r3 = java.lang.Float.intBitsToFloat(r2)
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r13 = r13 & r4
            int r13 = (int) r13
            float r14 = java.lang.Float.intBitsToFloat(r13)
            float r2 = java.lang.Float.intBitsToFloat(r2)
            long r6 = r15 >> r1
            int r1 = (int) r6
            float r1 = java.lang.Float.intBitsToFloat(r1)
            float r1 = r1 + r2
            float r13 = java.lang.Float.intBitsToFloat(r13)
            long r4 = r4 & r15
            int r2 = (int) r4
            float r2 = java.lang.Float.intBitsToFloat(r2)
            float r2 = r2 + r13
            r10 = 1
            r8 = 0
            r4 = r11
            r5 = r12
            r7 = r17
            r6 = r18
            r9 = r19
            aj r11 = r4.c(r5, r6, r7, r8, r9, r10)
            r16 = r11
            r13 = r14
            r11 = r0
            r14 = r1
            r15 = r2
            r12 = r3
            r11.k(r12, r13, r14, r15, r16)
            return
    }

    @Override // defpackage.qh1
    public final float Y() {
            r0 = this;
            yj0 r0 = r0.A
            qh1 r0 = r0.a
            float r0 = r0.Y()
            return r0
    }

    @Override // defpackage.qh1
    public final float a() {
            r0 = this;
            yj0 r0 = r0.A
            qh1 r0 = r0.a
            float r0 = r0.a()
            return r0
    }

    public final defpackage.aj c(defpackage.f80 r4, defpackage.oo1 r5, float r6, defpackage.z40 r7, int r8, int r9) {
            r3 = this;
            aj r5 = r3.i(r5)
            java.lang.Object r0 = r5.L
            android.graphics.Paint r0 = (android.graphics.Paint) r0
            if (r4 == 0) goto L12
            long r1 = r3.e()
            r4.a(r6, r1, r5)
            goto L3f
        L12:
            java.lang.Object r3 = r5.R
            android.graphics.Shader r3 = (android.graphics.Shader) r3
            if (r3 == 0) goto L1c
            r3 = 0
            r5.p(r3)
        L1c:
            int r3 = r0.getColor()
            long r3 = defpackage.hv.b(r3)
            long r1 = defpackage.kt0.b
            boolean r3 = defpackage.kt0.d(r3, r1)
            if (r3 != 0) goto L2f
            r5.l(r1)
        L2f:
            int r3 = r0.getAlpha()
            float r3 = (float) r3
            r4 = 1132396544(0x437f0000, float:255.0)
            float r3 = r3 / r4
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 != 0) goto L3c
            goto L3f
        L3c:
            r5.j(r6)
        L3f:
            java.lang.Object r3 = r5.X
            z40 r3 = (defpackage.z40) r3
            boolean r3 = defpackage.nb3.k(r3, r7)
            if (r3 != 0) goto L4c
            r5.m(r7)
        L4c:
            int r3 = r5.B
            if (r3 != r8) goto L51
            goto L54
        L51:
            r5.k(r8)
        L54:
            boolean r3 = r0.isFilterBitmap()
            if (r3 != r9) goto L5b
            return r5
        L5b:
            r5.n(r9)
            return r5
    }

    @Override // defpackage.no1
    public final void c0(defpackage.f80 r15, long r16, long r18, long r20, float r22, defpackage.oo1 r23) {
            r14 = this;
            yj0 r1 = r14.A
            xj0 r7 = r1.c
            r1 = 32
            long r2 = r16 >> r1
            int r2 = (int) r2
            float r8 = java.lang.Float.intBitsToFloat(r2)
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r5 = r16 & r3
            int r5 = (int) r5
            float r9 = java.lang.Float.intBitsToFloat(r5)
            float r2 = java.lang.Float.intBitsToFloat(r2)
            long r10 = r18 >> r1
            int r6 = (int) r10
            float r6 = java.lang.Float.intBitsToFloat(r6)
            float r10 = r6 + r2
            float r2 = java.lang.Float.intBitsToFloat(r5)
            long r5 = r18 & r3
            int r5 = (int) r5
            float r5 = java.lang.Float.intBitsToFloat(r5)
            float r11 = r5 + r2
            long r1 = r20 >> r1
            int r1 = (int) r1
            float r12 = java.lang.Float.intBitsToFloat(r1)
            long r1 = r20 & r3
            int r1 = (int) r1
            float r13 = java.lang.Float.intBitsToFloat(r1)
            r6 = 1
            r4 = 0
            r5 = 3
            r0 = r14
            r1 = r15
            r3 = r22
            r2 = r23
            aj r0 = r0.c(r1, r2, r3, r4, r5, r6)
            r21 = r0
            r14 = r7
            r15 = r8
            r16 = r9
            r17 = r10
            r18 = r11
            r19 = r12
            r20 = r13
            r14.g(r15, r16, r17, r18, r19, r20, r21)
            return
    }

    public final void f(defpackage.zh r9, defpackage.z40 r10) {
            r8 = this;
            yj0 r0 = r8.A
            xj0 r0 = r0.c
            r2 = 0
            r7 = 1
            kc2 r3 = defpackage.kc2.a
            r4 = 1065353216(0x3f800000, float:1.0)
            r6 = 3
            r1 = r8
            r5 = r10
            aj r8 = r1.c(r2, r3, r4, r5, r6, r7)
            r0.a(r9, r8)
            return
    }

    @Override // defpackage.no1
    public final void g(defpackage.hj r9, defpackage.f80 r10, float r11, defpackage.oo1 r12, int r13) {
            r8 = this;
            yj0 r0 = r8.A
            xj0 r0 = r0.c
            r7 = 1
            r5 = 0
            r1 = r8
            r2 = r10
            r4 = r11
            r3 = r12
            r6 = r13
            aj r8 = r1.c(r2, r3, r4, r5, r6, r7)
            r0.f(r9, r8)
            return
    }

    @Override // defpackage.no1
    public final void g0(long r12, float r14, float r15, long r16, long r18, float r20, defpackage.ys6 r21) {
            r11 = this;
            yj0 r1 = r11.A
            xj0 r6 = r1.c
            r1 = 32
            long r2 = r16 >> r1
            int r2 = (int) r2
            float r7 = java.lang.Float.intBitsToFloat(r2)
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r8 = r16 & r3
            int r5 = (int) r8
            float r8 = java.lang.Float.intBitsToFloat(r5)
            float r2 = java.lang.Float.intBitsToFloat(r2)
            long r9 = r18 >> r1
            int r1 = (int) r9
            float r1 = java.lang.Float.intBitsToFloat(r1)
            float r9 = r1 + r2
            float r1 = java.lang.Float.intBitsToFloat(r5)
            long r2 = r18 & r3
            int r2 = (int) r2
            float r2 = java.lang.Float.intBitsToFloat(r2)
            float r10 = r2 + r1
            r5 = 3
            r0 = r11
            r1 = r12
            r4 = r20
            r3 = r21
            aj r0 = b(r0, r1, r3, r4, r5)
            r2 = r6
            r3 = r7
            r4 = r8
            r5 = r9
            r6 = r10
            r7 = r14
            r8 = r15
            r9 = r0
            r2.u(r3, r4, r5, r6, r7, r8, r9)
            return
    }

    @Override // defpackage.no1
    public final defpackage.kk3 getLayoutDirection() {
            r0 = this;
            yj0 r0 = r0.A
            kk3 r0 = r0.b
            return r0
    }

    @Override // defpackage.no1
    public final void h(defpackage.hj r8, long r9, float r11, defpackage.oo1 r12) {
            r7 = this;
            yj0 r0 = r7.A
            xj0 r0 = r0.c
            r6 = 3
            r1 = r7
            r2 = r9
            r5 = r11
            r4 = r12
            aj r7 = b(r1, r2, r4, r5, r6)
            r0.f(r8, r7)
            return
    }

    public final defpackage.aj i(defpackage.oo1 r5) {
            r4 = this;
            kc2 r0 = defpackage.kc2.a
            boolean r0 = defpackage.nb3.k(r5, r0)
            if (r0 == 0) goto L17
            aj r5 = r4.L
            if (r5 != 0) goto L16
            aj r5 = defpackage.nc1.t()
            r0 = 0
            r5.t(r0)
            r4.L = r5
        L16:
            return r5
        L17:
            boolean r0 = r5 instanceof defpackage.ys6
            r1 = 0
            if (r0 == 0) goto L6e
            aj r0 = r4.R
            if (r0 != 0) goto L2a
            aj r0 = defpackage.nc1.t()
            r2 = 1
            r0.t(r2)
            r4.R = r0
        L2a:
            java.lang.Object r4 = r0.L
            android.graphics.Paint r4 = (android.graphics.Paint) r4
            float r2 = r4.getStrokeWidth()
            ys6 r5 = (defpackage.ys6) r5
            float r3 = r5.a
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L3b
            goto L3e
        L3b:
            r0.s(r3)
        L3e:
            int r2 = r0.g()
            int r3 = r5.c
            if (r2 != r3) goto L47
            goto L4a
        L47:
            r0.q(r3)
        L4a:
            float r2 = r4.getStrokeMiter()
            float r3 = r5.b
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L55
            goto L58
        L55:
            r4.setStrokeMiter(r3)
        L58:
            int r4 = r0.h()
            int r5 = r5.d
            if (r4 != r5) goto L61
            goto L64
        L61:
            r0.r(r5)
        L64:
            boolean r4 = defpackage.nb3.k(r1, r1)
            if (r4 != 0) goto L6d
            r0.o(r1)
        L6d:
            return r0
        L6e:
            defpackage.i.d()
            return r1
    }

    @Override // defpackage.no1
    public final defpackage.bt i0() {
            r0 = this;
            bt r0 = r0.B
            return r0
    }

    @Override // defpackage.no1
    public final void n0(java.util.ArrayList r3, long r4, float r6) {
            r2 = this;
            yj0 r0 = r2.A
            xj0 r0 = r0.c
            r1 = 1
            aj r2 = d(r2, r4, r6, r1)
            r0.r(r3, r2)
            return
    }

    @Override // defpackage.no1
    public final void q0(defpackage.zh r11, long r12, long r14, long r16, float r18, defpackage.z40 r19, int r20) {
            r10 = this;
            yj0 r0 = r10.A
            xj0 r1 = r0.c
            r3 = 0
            kc2 r4 = defpackage.kc2.a
            r7 = 3
            r2 = r10
            r5 = r18
            r6 = r19
            r8 = r20
            aj r9 = r2.c(r3, r4, r5, r6, r7, r8)
            r2 = r11
            r3 = r12
            r5 = r14
            r7 = r16
            r1.e(r2, r3, r5, r7, r9)
            return
    }

    @Override // defpackage.no1
    public final void s(long r11, long r13, long r15, float r17, defpackage.oo1 r18, int r19) {
            r10 = this;
            yj0 r0 = r10.A
            xj0 r0 = r0.c
            r1 = 32
            long r2 = r13 >> r1
            int r2 = (int) r2
            float r3 = java.lang.Float.intBitsToFloat(r2)
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r13 = r13 & r4
            int r13 = (int) r13
            float r14 = java.lang.Float.intBitsToFloat(r13)
            float r2 = java.lang.Float.intBitsToFloat(r2)
            long r6 = r15 >> r1
            int r1 = (int) r6
            float r1 = java.lang.Float.intBitsToFloat(r1)
            float r1 = r1 + r2
            float r13 = java.lang.Float.intBitsToFloat(r13)
            long r4 = r4 & r15
            int r2 = (int) r4
            float r2 = java.lang.Float.intBitsToFloat(r2)
            float r2 = r2 + r13
            r4 = r10
            r5 = r11
            r8 = r17
            r7 = r18
            r9 = r19
            aj r10 = b(r4, r5, r7, r8, r9)
            r15 = r10
            r12 = r14
            r10 = r0
            r13 = r1
            r14 = r2
            r11 = r3
            r10.k(r11, r12, r13, r14, r15)
            return
    }
}
