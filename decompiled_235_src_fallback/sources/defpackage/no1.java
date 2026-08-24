package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: no1  reason: default package */
/* loaded from: classes.dex */
public interface no1 extends defpackage.qh1 {
    static /* synthetic */ void B0(defpackage.no1 r6, defpackage.hj r7, long r8, float r10, defpackage.ys6 r11, int r12) {
            r0 = r12 & 4
            if (r0 == 0) goto L6
            r10 = 1065353216(0x3f800000, float:1.0)
        L6:
            r4 = r10
            r10 = r12 & 8
            if (r10 == 0) goto Ld
            kc2 r11 = defpackage.kc2.a
        Ld:
            r0 = r6
            r1 = r7
            r2 = r8
            r5 = r11
            r0.h(r1, r2, r4, r5)
            return
    }

    static /* synthetic */ void D0(defpackage.no1 r9, defpackage.f80 r10, long r11, long r13, float r15, defpackage.oo1 r16, int r17) {
            r0 = r17 & 2
            if (r0 == 0) goto L6
            r11 = 0
        L6:
            r2 = r11
            r11 = r17 & 4
            if (r11 == 0) goto L15
            long r11 = r9.e()
            long r11 = U(r11, r2)
            r4 = r11
            goto L16
        L15:
            r4 = r13
        L16:
            r11 = r17 & 8
            if (r11 == 0) goto L1e
            r11 = 1065353216(0x3f800000, float:1.0)
            r6 = r11
            goto L1f
        L1e:
            r6 = r15
        L1f:
            r11 = r17 & 16
            if (r11 == 0) goto L27
            kc2 r11 = defpackage.kc2.a
            r7 = r11
            goto L29
        L27:
            r7 = r16
        L29:
            r11 = r17 & 64
            if (r11 == 0) goto L32
            r11 = 3
        L2e:
            r0 = r9
            r1 = r10
            r8 = r11
            goto L34
        L32:
            r11 = 6
            goto L2e
        L34:
            r0.W(r1, r2, r4, r6, r7, r8)
            return
    }

    static /* synthetic */ void E(defpackage.no1 r12, long r13, float r15, float r16, long r17, long r19, float r21, defpackage.ys6 r22, int r23) {
            r0 = r23 & 64
            if (r0 == 0) goto L13
            r0 = 1065353216(0x3f800000, float:1.0)
            r10 = r0
        L7:
            r1 = r12
            r2 = r13
            r4 = r15
            r5 = r16
            r6 = r17
            r8 = r19
            r11 = r22
            goto L16
        L13:
            r10 = r21
            goto L7
        L16:
            r1.g0(r2, r4, r5, r6, r8, r10, r11)
            return
    }

    static /* synthetic */ void E0(defpackage.no1 r10, defpackage.f80 r11, long r12, long r14, long r16, defpackage.oo1 r18, int r19) {
            r0 = r19 & 2
            if (r0 == 0) goto L6
            r12 = 0
        L6:
            r2 = r12
            r12 = r19 & 4
            if (r12 == 0) goto L15
            long r12 = r10.e()
            long r12 = U(r12, r2)
            r4 = r12
            goto L16
        L15:
            r4 = r14
        L16:
            r12 = r19 & 32
            if (r12 == 0) goto L1e
            kc2 r12 = defpackage.kc2.a
            r9 = r12
            goto L20
        L1e:
            r9 = r18
        L20:
            r8 = 1065353216(0x3f800000, float:1.0)
            r0 = r10
            r1 = r11
            r6 = r16
            r0.c0(r1, r2, r4, r6, r8, r9)
            return
    }

    static /* synthetic */ void F(defpackage.no1 r12, long r13, long r15, long r17, float r19, defpackage.ys6 r20, int r21) {
            r0 = r21 & 2
            if (r0 == 0) goto L8
            r0 = 0
            r5 = r0
            goto L9
        L8:
            r5 = r15
        L9:
            r0 = r21 & 4
            if (r0 == 0) goto L17
            long r0 = r12.e()
            long r0 = U(r0, r5)
            r7 = r0
            goto L19
        L17:
            r7 = r17
        L19:
            r0 = r21 & 8
            if (r0 == 0) goto L21
            r0 = 1065353216(0x3f800000, float:1.0)
            r9 = r0
            goto L23
        L21:
            r9 = r19
        L23:
            r0 = r21 & 16
            if (r0 == 0) goto L2b
            kc2 r0 = defpackage.kc2.a
            r10 = r0
            goto L2d
        L2b:
            r10 = r20
        L2d:
            r0 = r21 & 64
            if (r0 == 0) goto L36
            r0 = 3
        L32:
            r2 = r12
            r3 = r13
            r11 = r0
            goto L38
        L36:
            r0 = 0
            goto L32
        L38:
            r2.s(r3, r5, r7, r9, r10, r11)
            return
    }

    static long U(long r6, long r8) {
            r0 = 32
            long r1 = r6 >> r0
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
            long r2 = r8 >> r0
            int r2 = (int) r2
            float r2 = java.lang.Float.intBitsToFloat(r2)
            float r1 = r1 - r2
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r6 & r2
            int r6 = (int) r6
            float r6 = java.lang.Float.intBitsToFloat(r6)
            long r7 = r8 & r2
            int r7 = (int) r7
            float r7 = java.lang.Float.intBitsToFloat(r7)
            float r6 = r6 - r7
            int r7 = java.lang.Float.floatToRawIntBits(r1)
            long r7 = (long) r7
            int r6 = java.lang.Float.floatToRawIntBits(r6)
            long r4 = (long) r6
            long r6 = r7 << r0
            long r8 = r4 & r2
            long r6 = r6 | r8
            return r6
    }

    static /* synthetic */ void b0(defpackage.no1 r6, defpackage.hj r7, defpackage.f80 r8, float r9, defpackage.ys6 r10, int r11) {
            r0 = r11 & 4
            if (r0 == 0) goto L6
            r9 = 1065353216(0x3f800000, float:1.0)
        L6:
            r3 = r9
            r9 = r11 & 8
            if (r9 == 0) goto Ld
            kc2 r10 = defpackage.kc2.a
        Ld:
            r4 = r10
            r9 = r11 & 32
            if (r9 == 0) goto L18
            r9 = 3
        L13:
            r0 = r6
            r1 = r7
            r2 = r8
            r5 = r9
            goto L1a
        L18:
            r9 = 0
            goto L13
        L1a:
            r0.g(r1, r2, r3, r4, r5)
            return
    }

    static /* synthetic */ void j0(defpackage.no1 r7, long r8, float r10, long r11, defpackage.oo1 r13, int r14) {
            r0 = r14 & 4
            if (r0 == 0) goto L8
            long r11 = r7.t0()
        L8:
            r4 = r11
            r11 = r14 & 16
            if (r11 == 0) goto Lf
            kc2 r13 = defpackage.kc2.a
        Lf:
            r0 = r7
            r1 = r8
            r3 = r10
            r6 = r13
            r0.L(r1, r3, r4, r6)
            return
    }

    static /* synthetic */ void p0(defpackage.no1 r10, long r11, long r13, long r15, float r17, int r18, int r19) {
            r0 = r19 & 16
            if (r0 == 0) goto Ld
            r0 = 0
            r9 = r0
        L6:
            r1 = r10
            r2 = r11
            r4 = r13
            r6 = r15
            r8 = r17
            goto L10
        Ld:
            r9 = r18
            goto L6
        L10:
            r1.C(r2, r4, r6, r8, r9)
            return
    }

    static void z(defpackage.no1 r13, defpackage.zh r14, long r15, long r17, float r19, defpackage.z40 r20, int r21, int r22) {
            r0 = r22
            r1 = r0 & 16
            if (r1 == 0) goto L8
            r8 = r15
            goto La
        L8:
            r8 = r17
        La:
            r1 = r0 & 32
            if (r1 == 0) goto L12
            r1 = 1065353216(0x3f800000, float:1.0)
            r10 = r1
            goto L14
        L12:
            r10 = r19
        L14:
            r0 = r0 & 512(0x200, float:7.17E-43)
            if (r0 == 0) goto L1b
            r0 = 1
            r12 = r0
            goto L1d
        L1b:
            r12 = r21
        L1d:
            r4 = 0
            r2 = r13
            r3 = r14
            r6 = r15
            r11 = r20
            r2.q0(r3, r4, r6, r8, r10, r11, r12)
            return
    }

    void C(long r1, long r3, long r5, float r7, int r8);

    void L(long r1, float r3, long r4, defpackage.oo1 r6);

    void W(defpackage.f80 r1, long r2, long r4, float r6, defpackage.oo1 r7, int r8);

    void c0(defpackage.f80 r1, long r2, long r4, long r6, float r8, defpackage.oo1 r9);

    default long e() {
            r2 = this;
            bt r2 = r2.i0()
            long r0 = r2.L()
            return r0
    }

    void g(defpackage.hj r1, defpackage.f80 r2, float r3, defpackage.oo1 r4, int r5);

    void g0(long r1, float r3, float r4, long r5, long r7, float r9, defpackage.ys6 r10);

    defpackage.kk3 getLayoutDirection();

    void h(defpackage.hj r1, long r2, float r4, defpackage.oo1 r5);

    defpackage.bt i0();

    void n0(java.util.ArrayList r1, long r2, float r4);

    void q0(defpackage.zh r1, long r2, long r4, long r6, float r8, defpackage.z40 r9, int r10);

    void s(long r1, long r3, long r5, float r7, defpackage.oo1 r8, int r9);

    default long t0() {
            r2 = this;
            bt r2 = r2.i0()
            long r0 = r2.L()
            long r0 = defpackage.ii2.v(r0)
            return r0
    }
}
