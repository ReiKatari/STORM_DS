package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ur4  reason: default package */
/* loaded from: classes.dex */
public final class ur4 extends defpackage.z64 implements defpackage.jm3, defpackage.mo1 {
    public defpackage.sr4 k0;
    public boolean l0;
    public defpackage.ic m0;
    public defpackage.z31 n0;
    public float o0;
    public defpackage.z40 p0;

    public static boolean S0(long r2) {
            r0 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            boolean r0 = defpackage.xi6.b(r2, r0)
            if (r0 != 0) goto L24
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r0
            int r2 = (int) r2
            float r2 = java.lang.Float.intBitsToFloat(r2)
            int r2 = java.lang.Float.floatToRawIntBits(r2)
            r3 = 2147483647(0x7fffffff, float:NaN)
            r2 = r2 & r3
            r3 = 2139095040(0x7f800000, float:Infinity)
            if (r2 >= r3) goto L24
            r2 = 1
            return r2
        L24:
            r2 = 0
            return r2
    }

    public static boolean T0(long r2) {
            r0 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            boolean r0 = defpackage.xi6.b(r2, r0)
            if (r0 != 0) goto L21
            r0 = 32
            long r2 = r2 >> r0
            int r2 = (int) r2
            float r2 = java.lang.Float.intBitsToFloat(r2)
            int r2 = java.lang.Float.floatToRawIntBits(r2)
            r3 = 2147483647(0x7fffffff, float:NaN)
            r2 = r2 & r3
            r3 = 2139095040(0x7f800000, float:Infinity)
            if (r2 >= r3) goto L21
            r2 = 1
            return r2
        L21:
            r2 = 0
            return r2
    }

    @Override // defpackage.z64
    public final boolean G0() {
            r0 = this;
            r0 = 0
            return r0
    }

    public final boolean R0() {
            r4 = this;
            boolean r0 = r4.l0
            if (r0 == 0) goto L15
            sr4 r4 = r4.k0
            long r0 = r4.h()
            r2 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L15
            r4 = 1
            return r4
        L15:
            r4 = 0
            return r4
    }

    public final long U0(long r12) {
            r11 = this;
            boolean r0 = defpackage.q21.d(r12)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L10
            boolean r0 = defpackage.q21.c(r12)
            if (r0 == 0) goto L10
            r0 = r2
            goto L11
        L10:
            r0 = r1
        L11:
            boolean r3 = defpackage.q21.f(r12)
            if (r3 == 0) goto L1e
            boolean r3 = defpackage.q21.e(r12)
            if (r3 == 0) goto L1e
            r1 = r2
        L1e:
            boolean r2 = r11.R0()
            if (r2 != 0) goto L26
            if (r0 != 0) goto L28
        L26:
            if (r1 == 0) goto L3a
        L28:
            int r5 = defpackage.q21.h(r12)
            int r7 = defpackage.q21.g(r12)
            r8 = 0
            r9 = 10
            r6 = 0
            r3 = r12
            long r11 = defpackage.q21.a(r3, r5, r6, r7, r8, r9)
            return r11
        L3a:
            r0 = r12
            sr4 r12 = r11.k0
            long r12 = r12.h()
            boolean r2 = T0(r12)
            r3 = 32
            if (r2 == 0) goto L55
            long r4 = r12 >> r3
            int r2 = (int) r4
            float r2 = java.lang.Float.intBitsToFloat(r2)
            int r2 = java.lang.Math.round(r2)
            goto L59
        L55:
            int r2 = defpackage.q21.j(r0)
        L59:
            boolean r4 = S0(r12)
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            if (r4 == 0) goto L6f
            long r12 = r12 & r5
            int r12 = (int) r12
            float r12 = java.lang.Float.intBitsToFloat(r12)
            int r12 = java.lang.Math.round(r12)
            goto L73
        L6f:
            int r12 = defpackage.q21.i(r0)
        L73:
            int r13 = defpackage.s21.g(r2, r0)
            int r12 = defpackage.s21.f(r12, r0)
            float r13 = (float) r13
            float r12 = (float) r12
            int r13 = java.lang.Float.floatToRawIntBits(r13)
            long r7 = (long) r13
            int r12 = java.lang.Float.floatToRawIntBits(r12)
            long r12 = (long) r12
            long r7 = r7 << r3
            long r12 = r12 & r5
            long r12 = r12 | r7
            boolean r2 = r11.R0()
            if (r2 != 0) goto L92
            goto L104
        L92:
            sr4 r2 = r11.k0
            long r7 = r2.h()
            boolean r2 = T0(r7)
            if (r2 != 0) goto La6
            long r7 = r12 >> r3
            int r2 = (int) r7
            float r2 = java.lang.Float.intBitsToFloat(r2)
            goto Lb2
        La6:
            sr4 r2 = r11.k0
            long r7 = r2.h()
            long r7 = r7 >> r3
            int r2 = (int) r7
            float r2 = java.lang.Float.intBitsToFloat(r2)
        Lb2:
            sr4 r4 = r11.k0
            long r7 = r4.h()
            boolean r4 = S0(r7)
            if (r4 != 0) goto Lc6
            long r7 = r12 & r5
            int r4 = (int) r7
            float r4 = java.lang.Float.intBitsToFloat(r4)
            goto Ld2
        Lc6:
            sr4 r4 = r11.k0
            long r7 = r4.h()
            long r7 = r7 & r5
            int r4 = (int) r7
            float r4 = java.lang.Float.intBitsToFloat(r4)
        Ld2:
            int r2 = java.lang.Float.floatToRawIntBits(r2)
            long r7 = (long) r2
            int r2 = java.lang.Float.floatToRawIntBits(r4)
            long r9 = (long) r2
            long r7 = r7 << r3
            long r9 = r9 & r5
            long r7 = r7 | r9
            long r9 = r12 >> r3
            int r2 = (int) r9
            float r2 = java.lang.Float.intBitsToFloat(r2)
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto Lec
            goto Lf7
        Lec:
            long r9 = r12 & r5
            int r2 = (int) r9
            float r2 = java.lang.Float.intBitsToFloat(r2)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto Lfa
        Lf7:
            r12 = 0
            goto L104
        Lfa:
            z31 r11 = r11.n0
            long r11 = r11.c(r7, r12)
            long r12 = defpackage.kn2.c0(r7, r11)
        L104:
            long r2 = r12 >> r3
            int r11 = (int) r2
            float r11 = java.lang.Float.intBitsToFloat(r11)
            int r11 = java.lang.Math.round(r11)
            int r2 = defpackage.s21.g(r11, r0)
            long r11 = r12 & r5
            int r11 = (int) r11
            float r11 = java.lang.Float.intBitsToFloat(r11)
            int r11 = java.lang.Math.round(r11)
            int r4 = defpackage.s21.f(r11, r0)
            r5 = 0
            r6 = 10
            r3 = 0
            long r11 = defpackage.q21.a(r0, r2, r3, r4, r5, r6)
            return r11
    }

    @Override // defpackage.jm3
    public final int Z(defpackage.kz3 r3, defpackage.x24 r4, int r5) {
            r2 = this;
            boolean r3 = r2.R0()
            if (r3 == 0) goto L1e
            r3 = 13
            r0 = 0
            long r0 = defpackage.s21.b(r0, r5, r0, r0, r3)
            long r2 = r2.U0(r0)
            int r4 = r4.c(r5)
            int r2 = defpackage.q21.i(r2)
            int r2 = java.lang.Math.max(r2, r4)
            return r2
        L1e:
            int r2 = r4.c(r5)
            return r2
    }

    @Override // defpackage.jm3
    public final defpackage.f34 c(defpackage.g34 r2, defpackage.x24 r3, long r4) {
            r1 = this;
            long r4 = r1.U0(r4)
            dx4 r1 = r3.y(r4)
            int r3 = r1.A
            int r4 = r1.B
            he r5 = new he
            r0 = 5
            r5.<init>(r1, r0)
            zt1 r1 = defpackage.zt1.A
            f34 r1 = r2.K(r3, r4, r1, r5)
            return r1
    }

    @Override // defpackage.jm3
    public final int f(defpackage.kz3 r3, defpackage.x24 r4, int r5) {
            r2 = this;
            boolean r3 = r2.R0()
            if (r3 == 0) goto L1d
            r3 = 7
            r0 = 0
            long r0 = defpackage.s21.b(r0, r0, r0, r5, r3)
            long r2 = r2.U0(r0)
            int r4 = r4.u(r5)
            int r2 = defpackage.q21.j(r2)
            int r2 = java.lang.Math.max(r2, r4)
            return r2
        L1d:
            int r2 = r4.u(r5)
            return r2
    }

    @Override // defpackage.jm3
    public final int h0(defpackage.kz3 r3, defpackage.x24 r4, int r5) {
            r2 = this;
            boolean r3 = r2.R0()
            if (r3 == 0) goto L1e
            r3 = 13
            r0 = 0
            long r0 = defpackage.s21.b(r0, r5, r0, r0, r3)
            long r2 = r2.U0(r0)
            int r4 = r4.V(r5)
            int r2 = defpackage.q21.i(r2)
            int r2 = java.lang.Math.max(r2, r4)
            return r2
        L1e:
            int r2 = r4.V(r5)
            return r2
    }

    @Override // defpackage.mo1
    public final void m0(defpackage.um3 r20) {
            r19 = this;
            r0 = r19
            r1 = r20
            zj0 r6 = r1.A
            sr4 r2 = r0.k0
            long r2 = r2.h()
            boolean r4 = T0(r2)
            r5 = 32
            if (r4 == 0) goto L1c
            long r7 = r2 >> r5
            int r4 = (int) r7
            float r4 = java.lang.Float.intBitsToFloat(r4)
            goto L26
        L1c:
            long r7 = r6.e()
            long r7 = r7 >> r5
            int r4 = (int) r7
            float r4 = java.lang.Float.intBitsToFloat(r4)
        L26:
            boolean r7 = S0(r2)
            r8 = 4294967295(0xffffffff, double:2.1219957905E-314)
            if (r7 == 0) goto L38
            long r2 = r2 & r8
            int r2 = (int) r2
            float r2 = java.lang.Float.intBitsToFloat(r2)
            goto L42
        L38:
            long r2 = r6.e()
            long r2 = r2 & r8
            int r2 = (int) r2
            float r2 = java.lang.Float.intBitsToFloat(r2)
        L42:
            int r3 = java.lang.Float.floatToRawIntBits(r4)
            long r3 = (long) r3
            int r2 = java.lang.Float.floatToRawIntBits(r2)
            long r10 = (long) r2
            long r2 = r3 << r5
            long r10 = r10 & r8
            long r2 = r2 | r10
            long r10 = r6.e()
            long r10 = r10 >> r5
            int r4 = (int) r10
            float r4 = java.lang.Float.intBitsToFloat(r4)
            r7 = 0
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r4 != 0) goto L60
            goto L6e
        L60:
            long r10 = r6.e()
            long r10 = r10 & r8
            int r4 = (int) r10
            float r4 = java.lang.Float.intBitsToFloat(r4)
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r4 != 0) goto L71
        L6e:
            r2 = 0
            goto L7f
        L71:
            z31 r4 = r0.n0
            long r10 = r6.e()
            long r10 = r4.c(r2, r10)
            long r2 = defpackage.kn2.c0(r2, r10)
        L7f:
            ic r10 = r0.m0
            long r11 = r2 >> r5
            int r4 = (int) r11
            float r4 = java.lang.Float.intBitsToFloat(r4)
            int r4 = java.lang.Math.round(r4)
            long r11 = r2 & r8
            int r7 = (int) r11
            float r7 = java.lang.Float.intBitsToFloat(r7)
            int r7 = java.lang.Math.round(r7)
            long r11 = (long) r4
            long r11 = r11 << r5
            long r13 = (long) r7
            long r13 = r13 & r8
            long r11 = r11 | r13
            long r13 = r6.e()
            long r13 = r13 >> r5
            int r4 = (int) r13
            float r4 = java.lang.Float.intBitsToFloat(r4)
            int r4 = java.lang.Math.round(r4)
            long r13 = r6.e()
            long r13 = r13 & r8
            int r7 = (int) r13
            float r7 = java.lang.Float.intBitsToFloat(r7)
            int r7 = java.lang.Math.round(r7)
            long r13 = (long) r4
            long r13 = r13 << r5
            r16 = r8
            long r8 = (long) r7
            long r7 = r8 & r16
            long r13 = r13 | r7
            kk3 r15 = r1.getLayoutDirection()
            long r7 = r10.a(r11, r13, r15)
            long r4 = r7 >> r5
            int r4 = (int) r4
            float r9 = (float) r4
            long r4 = r7 & r16
            int r4 = (int) r4
            float r7 = (float) r4
            bt r4 = r6.B
            java.lang.Object r4 = r4.B
            os0 r4 = (defpackage.os0) r4
            r4.g0(r9, r7)
            sr4 r4 = r0.k0     // Catch: java.lang.Throwable -> Lf7
            r5 = r4
            float r4 = r0.o0     // Catch: java.lang.Throwable -> Lf7
            z40 r0 = r0.p0     // Catch: java.lang.Throwable -> Lf7
            r18 = r5
            r5 = r0
            r0 = r18
            r0.g(r1, r2, r4, r5)     // Catch: java.lang.Throwable -> Lf7
            bt r0 = r6.B
            java.lang.Object r0 = r0.B
            os0 r0 = (defpackage.os0) r0
            float r1 = -r9
            float r2 = -r7
            r0.g0(r1, r2)
            r20.b()
            return
        Lf7:
            r0 = move-exception
            bt r1 = r6.B
            java.lang.Object r1 = r1.B
            os0 r1 = (defpackage.os0) r1
            float r2 = -r9
            float r3 = -r7
            r1.g0(r2, r3)
            throw r0
    }

    @Override // defpackage.jm3
    public final int s0(defpackage.kz3 r3, defpackage.x24 r4, int r5) {
            r2 = this;
            boolean r3 = r2.R0()
            if (r3 == 0) goto L1d
            r3 = 7
            r0 = 0
            long r0 = defpackage.s21.b(r0, r0, r0, r5, r3)
            long r2 = r2.U0(r0)
            int r4 = r4.n(r5)
            int r2 = defpackage.q21.j(r2)
            int r2 = java.lang.Math.max(r2, r4)
            return r2
        L1d:
            int r2 = r4.n(r5)
            return r2
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "PainterModifier(painter="
            r0.<init>(r1)
            sr4 r1 = r2.k0
            r0.append(r1)
            java.lang.String r1 = ", sizeToIntrinsics="
            r0.append(r1)
            boolean r1 = r2.l0
            r0.append(r1)
            java.lang.String r1 = ", alignment="
            r0.append(r1)
            ic r1 = r2.m0
            r0.append(r1)
            java.lang.String r1 = ", alpha="
            r0.append(r1)
            float r1 = r2.o0
            r0.append(r1)
            java.lang.String r1 = ", colorFilter="
            r0.append(r1)
            z40 r2 = r2.p0
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
