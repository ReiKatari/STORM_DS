package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: v31  reason: default package */
/* loaded from: classes.dex */
public final class v31 extends defpackage.z64 implements defpackage.mo1, defpackage.jm3 {
    public defpackage.lw k0;
    public defpackage.ic l0;
    public defpackage.z31 m0;
    public float n0;

    @Override // defpackage.z64
    public final boolean G0() {
            r0 = this;
            r0 = 0
            return r0
    }

    public final long R0(long r7) {
            r6 = this;
            boolean r0 = defpackage.xi6.f(r7)
            if (r0 == 0) goto L9
            r6 = 0
            return r6
        L9:
            lw r0 = r6.k0
            long r0 = r0.h()
            r2 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 != 0) goto L19
            goto L80
        L19:
            float r2 = defpackage.xi6.e(r0)
            boolean r3 = java.lang.Float.isInfinite(r2)
            if (r3 != 0) goto L2a
            boolean r3 = java.lang.Float.isNaN(r2)
            if (r3 != 0) goto L2a
            goto L2e
        L2a:
            float r2 = defpackage.xi6.e(r7)
        L2e:
            float r0 = defpackage.xi6.c(r0)
            boolean r1 = java.lang.Float.isInfinite(r0)
            if (r1 != 0) goto L3f
            boolean r1 = java.lang.Float.isNaN(r0)
            if (r1 != 0) goto L3f
            goto L43
        L3f:
            float r0 = defpackage.xi6.c(r7)
        L43:
            long r0 = defpackage.ii2.n(r2, r0)
            z31 r6 = r6.m0
            long r2 = r6.c(r0, r7)
            int r6 = defpackage.a66.a
            r6 = 32
            long r4 = r2 >> r6
            int r6 = (int) r4
            float r6 = java.lang.Float.intBitsToFloat(r6)
            boolean r4 = java.lang.Float.isInfinite(r6)
            if (r4 != 0) goto L80
            boolean r6 = java.lang.Float.isNaN(r6)
            if (r6 != 0) goto L80
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r2
            int r6 = (int) r4
            float r6 = java.lang.Float.intBitsToFloat(r6)
            boolean r4 = java.lang.Float.isInfinite(r6)
            if (r4 != 0) goto L80
            boolean r6 = java.lang.Float.isNaN(r6)
            if (r6 != 0) goto L80
            long r6 = defpackage.kn2.c0(r0, r2)
            return r6
        L80:
            return r7
    }

    public final long S0(long r14) {
            r13 = this;
            boolean r0 = defpackage.q21.f(r14)
            boolean r1 = defpackage.q21.e(r14)
            if (r0 == 0) goto Le
            if (r1 == 0) goto Le
        Lc:
            r6 = r14
            goto L40
        Le:
            boolean r2 = defpackage.q21.d(r14)
            if (r2 == 0) goto L1c
            boolean r2 = defpackage.q21.c(r14)
            if (r2 == 0) goto L1c
            r2 = 1
            goto L1d
        L1c:
            r2 = 0
        L1d:
            lw r3 = r13.k0
            long r3 = r3.h()
            r5 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 != 0) goto L41
            if (r2 == 0) goto Lc
            int r8 = defpackage.q21.h(r14)
            int r10 = defpackage.q21.g(r14)
            r11 = 0
            r12 = 10
            r9 = 0
            r6 = r14
            long r13 = defpackage.q21.a(r6, r8, r9, r10, r11, r12)
            return r13
        L40:
            return r6
        L41:
            r6 = r14
            if (r2 == 0) goto L53
            if (r0 != 0) goto L48
            if (r1 == 0) goto L53
        L48:
            int r14 = defpackage.q21.h(r6)
            float r14 = (float) r14
            int r15 = defpackage.q21.g(r6)
        L51:
            float r15 = (float) r15
            goto L9f
        L53:
            float r14 = defpackage.xi6.e(r3)
            float r15 = defpackage.xi6.c(r3)
            boolean r0 = java.lang.Float.isInfinite(r14)
            if (r0 != 0) goto L78
            boolean r0 = java.lang.Float.isNaN(r14)
            if (r0 != 0) goto L78
            ve5 r0 = defpackage.dk7.b
            int r0 = defpackage.q21.j(r6)
            float r0 = (float) r0
            int r1 = defpackage.q21.h(r6)
            float r1 = (float) r1
            float r14 = defpackage.gi2.p(r14, r0, r1)
            goto L7d
        L78:
            int r14 = defpackage.q21.j(r6)
            float r14 = (float) r14
        L7d:
            boolean r0 = java.lang.Float.isInfinite(r15)
            if (r0 != 0) goto L9a
            boolean r0 = java.lang.Float.isNaN(r15)
            if (r0 != 0) goto L9a
            ve5 r0 = defpackage.dk7.b
            int r0 = defpackage.q21.i(r6)
            float r0 = (float) r0
            int r1 = defpackage.q21.g(r6)
            float r1 = (float) r1
            float r15 = defpackage.gi2.p(r15, r0, r1)
            goto L9f
        L9a:
            int r15 = defpackage.q21.i(r6)
            goto L51
        L9f:
            long r14 = defpackage.ii2.n(r14, r15)
            long r13 = r13.R0(r14)
            float r15 = defpackage.xi6.e(r13)
            float r13 = defpackage.xi6.c(r13)
            int r14 = defpackage.u24.E(r15)
            int r2 = defpackage.s21.g(r14, r6)
            int r13 = defpackage.u24.E(r13)
            int r4 = defpackage.s21.f(r13, r6)
            r5 = 0
            r0 = r6
            r6 = 10
            r3 = 0
            long r13 = defpackage.q21.a(r0, r2, r3, r4, r5, r6)
            return r13
    }

    @Override // defpackage.jm3
    public final int Z(defpackage.kz3 r5, defpackage.x24 r6, int r7) {
            r4 = this;
            lw r5 = r4.k0
            long r0 = r5.h()
            r2 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L39
            r5 = 13
            r0 = 0
            long r0 = defpackage.s21.b(r0, r7, r0, r0, r5)
            long r0 = r4.S0(r0)
            int r5 = defpackage.q21.h(r0)
            int r5 = r6.c(r5)
            float r6 = (float) r7
            float r7 = (float) r5
            long r6 = defpackage.ii2.n(r6, r7)
            long r6 = r4.R0(r6)
            float r4 = defpackage.xi6.c(r6)
            int r4 = defpackage.u24.E(r4)
            int r4 = java.lang.Math.max(r4, r5)
            return r4
        L39:
            int r4 = r6.c(r7)
            return r4
    }

    @Override // defpackage.jm3
    public final defpackage.f34 c(defpackage.g34 r2, defpackage.x24 r3, long r4) {
            r1 = this;
            long r4 = r1.S0(r4)
            dx4 r1 = r3.y(r4)
            int r3 = r1.A
            int r4 = r1.B
            jv r5 = new jv
            r0 = 2
            r5.<init>(r1, r0)
            zt1 r1 = defpackage.zt1.A
            f34 r1 = r2.K(r3, r4, r1, r5)
            return r1
    }

    @Override // defpackage.jm3
    public final int f(defpackage.kz3 r5, defpackage.x24 r6, int r7) {
            r4 = this;
            lw r5 = r4.k0
            long r0 = r5.h()
            r2 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L38
            r5 = 7
            r0 = 0
            long r0 = defpackage.s21.b(r0, r0, r0, r7, r5)
            long r0 = r4.S0(r0)
            int r5 = defpackage.q21.g(r0)
            int r5 = r6.u(r5)
            float r6 = (float) r5
            float r7 = (float) r7
            long r6 = defpackage.ii2.n(r6, r7)
            long r6 = r4.R0(r6)
            float r4 = defpackage.xi6.e(r6)
            int r4 = defpackage.u24.E(r4)
            int r4 = java.lang.Math.max(r4, r5)
            return r4
        L38:
            int r4 = r6.u(r7)
            return r4
    }

    @Override // defpackage.jm3
    public final int h0(defpackage.kz3 r5, defpackage.x24 r6, int r7) {
            r4 = this;
            lw r5 = r4.k0
            long r0 = r5.h()
            r2 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L39
            r5 = 13
            r0 = 0
            long r0 = defpackage.s21.b(r0, r7, r0, r0, r5)
            long r0 = r4.S0(r0)
            int r5 = defpackage.q21.h(r0)
            int r5 = r6.V(r5)
            float r6 = (float) r7
            float r7 = (float) r5
            long r6 = defpackage.ii2.n(r6, r7)
            long r6 = r4.R0(r6)
            float r4 = defpackage.xi6.c(r6)
            int r4 = defpackage.u24.E(r4)
            int r4 = java.lang.Math.max(r4, r5)
            return r4
        L39:
            int r4 = r6.V(r7)
            return r4
    }

    @Override // defpackage.mo1
    public final void m0(defpackage.um3 r18) {
            r17 = this;
            r0 = r17
            r1 = r18
            zj0 r6 = r1.A
            long r2 = r6.e()
            long r2 = r0.R0(r2)
            ic r7 = r0.l0
            ve5 r4 = defpackage.dk7.b
            float r4 = defpackage.xi6.e(r2)
            int r4 = defpackage.u24.E(r4)
            float r5 = defpackage.xi6.c(r2)
            int r5 = defpackage.u24.E(r5)
            long r8 = (long) r4
            r4 = 32
            long r8 = r8 << r4
            long r10 = (long) r5
            r13 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r10 = r10 & r13
            long r8 = r8 | r10
            long r10 = r6.e()
            float r5 = defpackage.xi6.e(r10)
            int r5 = defpackage.u24.E(r5)
            float r10 = defpackage.xi6.c(r10)
            int r10 = defpackage.u24.E(r10)
            long r11 = (long) r5
            long r11 = r11 << r4
            r15 = r4
            long r4 = (long) r10
            long r4 = r4 & r13
            long r10 = r11 | r4
            kk3 r12 = r1.getLayoutDirection()
            long r4 = r7.a(r8, r10, r12)
            long r7 = r4 >> r15
            int r7 = (int) r7
            long r4 = r4 & r13
            int r4 = (int) r4
            float r7 = (float) r7
            float r8 = (float) r4
            bt r4 = r6.B
            java.lang.Object r4 = r4.B
            os0 r4 = (defpackage.os0) r4
            r4.g0(r7, r8)
            lw r4 = r0.k0
            float r0 = r0.n0
            r5 = 0
            r16 = r4
            r4 = r0
            r0 = r16
            r0.g(r1, r2, r4, r5)
            bt r0 = r6.B
            java.lang.Object r0 = r0.B
            os0 r0 = (defpackage.os0) r0
            float r1 = -r7
            float r2 = -r8
            r0.g0(r1, r2)
            r18.b()
            return
    }

    @Override // defpackage.jm3
    public final int s0(defpackage.kz3 r5, defpackage.x24 r6, int r7) {
            r4 = this;
            lw r5 = r4.k0
            long r0 = r5.h()
            r2 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L38
            r5 = 7
            r0 = 0
            long r0 = defpackage.s21.b(r0, r0, r0, r7, r5)
            long r0 = r4.S0(r0)
            int r5 = defpackage.q21.g(r0)
            int r5 = r6.n(r5)
            float r6 = (float) r5
            float r7 = (float) r7
            long r6 = defpackage.ii2.n(r6, r7)
            long r6 = r4.R0(r6)
            float r4 = defpackage.xi6.e(r6)
            int r4 = defpackage.u24.E(r4)
            int r4 = java.lang.Math.max(r4, r5)
            return r4
        L38:
            int r4 = r6.n(r7)
            return r4
    }
}
