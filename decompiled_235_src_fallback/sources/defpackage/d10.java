package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: d10  reason: default package */
/* loaded from: classes.dex */
public final class d10 extends defpackage.z64 implements defpackage.mo1, defpackage.gi4, defpackage.va6 {
    public long k0;
    public defpackage.f80 l0;
    public float m0;
    public defpackage.ke6 n0;
    public long o0;
    public defpackage.kk3 p0;
    public defpackage.mp2 q0;
    public defpackage.ke6 r0;
    public defpackage.mp2 s0;

    @Override // defpackage.va6
    public final void A0(defpackage.gb6 r1) {
            r0 = this;
            ke6 r0 = r0.n0
            defpackage.eb6.e(r1, r0)
            return
    }

    @Override // defpackage.va6
    public final boolean j() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.gi4
    public final void l0() {
            r2 = this;
            r0 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            r2.o0 = r0
            r0 = 0
            r2.p0 = r0
            r2.q0 = r0
            r2.r0 = r0
            defpackage.f04.I(r2)
            return
    }

    @Override // defpackage.mo1
    public final void m0(defpackage.um3 r22) {
            r21 = this;
            r0 = r21
            r1 = r22
            zj0 r2 = r1.A
            ke6 r3 = r0.n0
            jy2 r4 = defpackage.u24.m
            if (r3 != r4) goto L3c
            long r2 = r0.k0
            long r4 = defpackage.kt0.h
            boolean r2 = defpackage.kt0.d(r2, r4)
            if (r2 != 0) goto L23
            long r2 = r0.k0
            r9 = 0
            r10 = 126(0x7e, float:1.77E-43)
            r4 = 0
            r6 = 0
            r8 = 0
            defpackage.no1.F(r1, r2, r4, r6, r8, r9, r10)
        L23:
            f80 r1 = r0.l0
            if (r1 == 0) goto L38
            float r6 = r0.m0
            r7 = 0
            r8 = 118(0x76, float:1.65E-43)
            r2 = 0
            r4 = 0
            r0 = r22
            defpackage.no1.D0(r0, r1, r2, r4, r6, r7, r8)
            r1 = r0
            goto L1f9
        L38:
            r1 = r22
            goto L1f9
        L3c:
            long r3 = r2.e()
            long r5 = r0.o0
            boolean r3 = defpackage.xi6.b(r3, r5)
            if (r3 == 0) goto L61
            kk3 r3 = r1.getLayoutDirection()
            kk3 r4 = r0.p0
            if (r3 != r4) goto L61
            ke6 r3 = r0.r0
            ke6 r4 = r0.n0
            boolean r3 = defpackage.nb3.k(r3, r4)
            if (r3 == 0) goto L61
            mp2 r3 = r0.q0
            r3.getClass()
        L5f:
            r12 = r3
            goto L71
        L61:
            q6 r3 = new q6
            r4 = 9
            r3.<init>(r4, r0, r1)
            defpackage.jx2.B(r0, r3)
            mp2 r3 = r0.s0
            r4 = 0
            r0.s0 = r4
            goto L5f
        L71:
            r0.q0 = r12
            long r2 = r2.e()
            r0.o0 = r2
            kk3 r2 = r1.getLayoutDirection()
            r0.p0 = r2
            ke6 r2 = r0.n0
            r0.r0 = r2
            r12.getClass()
            long r2 = r0.k0
            long r4 = defpackage.kt0.h
            boolean r2 = defpackage.kt0.d(r2, r4)
            r13 = 32
            r14 = 4294967295(0xffffffff, double:2.1219957905E-314)
            kc2 r4 = defpackage.kc2.a
            if (r2 != 0) goto L14e
            long r2 = r0.k0
            boolean r5 = r12 instanceof defpackage.qo4
            r8 = 1065353216(0x3f800000, float:1.0)
            if (r5 == 0) goto Lc7
            r5 = r12
            qo4 r5 = (defpackage.qo4) r5
            of5 r5 = r5.f
            float r6 = r5.a
            float r7 = r5.b
            int r6 = java.lang.Float.floatToRawIntBits(r6)
            long r9 = (long) r6
            int r6 = java.lang.Float.floatToRawIntBits(r7)
            long r6 = (long) r6
            long r9 = r9 << r13
            long r6 = r6 & r14
            long r6 = r6 | r9
            long r9 = defpackage.np2.e0(r5)
            r19 = r9
            r9 = r4
            r4 = r6
            r6 = r19
            r10 = 3
            r1.s(r2, r4, r6, r8, r9, r10)
            goto L14f
        Lc7:
            r9 = r4
            r5 = r8
            boolean r1 = r12 instanceof defpackage.ro4
            if (r1 == 0) goto L134
            r7 = r12
            ro4 r7 = (defpackage.ro4) r7
            r3 = r2
            hj r2 = r7.g
            if (r2 == 0) goto Ldd
            r1 = r22
            r6 = r9
            r1.h(r2, r3, r5, r6)
            goto L14f
        Ldd:
            r2 = r3
            u16 r1 = r7.f
            float r4 = r1.b
            float r6 = r1.a
            long r7 = r1.h
            long r7 = r7 >> r13
            int r7 = (int) r7
            float r7 = java.lang.Float.intBitsToFloat(r7)
            int r8 = java.lang.Float.floatToRawIntBits(r6)
            long r10 = (long) r8
            int r8 = java.lang.Float.floatToRawIntBits(r4)
            r16 = r6
            long r5 = (long) r8
            long r10 = r10 << r13
            long r5 = r5 & r14
            long r5 = r5 | r10
            float r8 = r1.c
            float r8 = r8 - r16
            float r1 = r1.d
            float r1 = r1 - r4
            int r4 = java.lang.Float.floatToRawIntBits(r8)
            long r10 = (long) r4
            int r1 = java.lang.Float.floatToRawIntBits(r1)
            r16 = r13
            r17 = r14
            long r13 = (long) r1
            long r10 = r10 << r16
            long r13 = r13 & r17
            long r10 = r10 | r13
            int r1 = java.lang.Float.floatToRawIntBits(r7)
            long r13 = (long) r1
            int r1 = java.lang.Float.floatToRawIntBits(r7)
            long r7 = (long) r1
            long r13 = r13 << r16
            long r7 = r7 & r17
            long r7 = r7 | r13
            r1 = r22
            r4 = r5
            r19 = r10
            r10 = r9
            r8 = r7
            r6 = r19
            r11 = 1065353216(0x3f800000, float:1.0)
            r1.d(r2, r4, r6, r8, r10, r11)
            r9 = r10
            goto L153
        L134:
            r16 = r13
            r17 = r14
            boolean r1 = r12 instanceof defpackage.po4
            if (r1 == 0) goto L14a
            r1 = r12
            po4 r1 = (defpackage.po4) r1
            hj r1 = r1.f
            r3 = r2
            r6 = r9
            r2 = r1
            r1 = r22
            r1.h(r2, r3, r5, r6)
            goto L153
        L14a:
            defpackage.i.d()
            return
        L14e:
            r9 = r4
        L14f:
            r16 = r13
            r17 = r14
        L153:
            f80 r1 = r0.l0
            if (r1 == 0) goto L1f9
            float r3 = r0.m0
            boolean r0 = r12 instanceof defpackage.qo4
            r5 = 3
            if (r0 == 0) goto L188
            qo4 r12 = (defpackage.qo4) r12
            of5 r0 = r12.f
            float r2 = r0.a
            float r4 = r0.b
            int r2 = java.lang.Float.floatToRawIntBits(r2)
            long r6 = (long) r2
            int r2 = java.lang.Float.floatToRawIntBits(r4)
            long r10 = (long) r2
            long r6 = r6 << r16
            long r10 = r10 & r17
            long r6 = r6 | r10
            long r10 = defpackage.np2.e0(r0)
            r19 = r6
            r6 = r3
            r2 = r19
            r0 = r22
            r8 = r5
            r7 = r9
            r4 = r10
            r0.W(r1, r2, r4, r6, r7, r8)
            goto L1f9
        L188:
            boolean r0 = r12 instanceof defpackage.ro4
            if (r0 == 0) goto L1e7
            ro4 r12 = (defpackage.ro4) r12
            r2 = r1
            hj r1 = r12.g
            if (r1 == 0) goto L19a
            r0 = r22
            r4 = r9
        L196:
            r0.g(r1, r2, r3, r4, r5)
            goto L1f9
        L19a:
            r1 = r2
            u16 r0 = r12.f
            float r2 = r0.b
            float r4 = r0.a
            long r5 = r0.h
            long r5 = r5 >> r16
            int r5 = (int) r5
            float r5 = java.lang.Float.intBitsToFloat(r5)
            int r6 = java.lang.Float.floatToRawIntBits(r4)
            long r6 = (long) r6
            int r8 = java.lang.Float.floatToRawIntBits(r2)
            long r10 = (long) r8
            long r6 = r6 << r16
            long r10 = r10 & r17
            long r6 = r6 | r10
            float r8 = r0.c
            float r8 = r8 - r4
            float r0 = r0.d
            float r0 = r0 - r2
            int r2 = java.lang.Float.floatToRawIntBits(r8)
            long r10 = (long) r2
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            long r12 = (long) r0
            long r10 = r10 << r16
            long r12 = r12 & r17
            long r10 = r10 | r12
            int r0 = java.lang.Float.floatToRawIntBits(r5)
            long r12 = (long) r0
            int r0 = java.lang.Float.floatToRawIntBits(r5)
            long r4 = (long) r0
            long r12 = r12 << r16
            long r4 = r4 & r17
            long r4 = r4 | r12
            r0 = r22
            r8 = r3
            r2 = r6
            r6 = r4
            r4 = r10
            r0.c0(r1, r2, r4, r6, r8, r9)
            goto L1f9
        L1e7:
            boolean r0 = r12 instanceof defpackage.po4
            if (r0 == 0) goto L1f5
            po4 r12 = (defpackage.po4) r12
            hj r0 = r12.f
            r2 = r1
            r4 = r9
            r1 = r0
            r0 = r22
            goto L196
        L1f5:
            defpackage.i.d()
            return
        L1f9:
            r22.b()
            return
    }
}
