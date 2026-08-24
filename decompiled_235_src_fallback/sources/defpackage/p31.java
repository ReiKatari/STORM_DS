package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: p31  reason: default package */
/* loaded from: classes.dex */
public final class p31 extends defpackage.z64 implements defpackage.fy0, defpackage.j34 {
    public defpackage.lo4 k0;
    public final defpackage.m86 l0;
    public boolean m0;
    public defpackage.z70 n0;
    public final defpackage.a86 o0;
    public final defpackage.p70 p0;
    public boolean q0;
    public long r0;
    public boolean s0;

    public p31(defpackage.lo4 r1, defpackage.m86 r2, boolean r3, defpackage.z70 r4, defpackage.a86 r5) {
            r0 = this;
            r0.<init>()
            r0.k0 = r1
            r0.l0 = r2
            r0.m0 = r3
            r0.n0 = r4
            r0.o0 = r5
            p70 r1 = new p70
            r2 = 0
            r1.<init>(r2)
            r0.p0 = r1
            r1 = -1
            r0.r0 = r1
            return
    }

    public static final float R0(defpackage.p31 r22, defpackage.z70 r23, long r24) {
            r0 = r22
            r1 = r23
            long r2 = r0.r0
            p70 r4 = r0.p0
            ua4 r4 = r4.a
            int r5 = r4.L
            r6 = 1
            int r5 = r5 - r6
            java.lang.Object[] r4 = r4.A
            int r7 = r4.length
            r9 = 2
            r13 = 0
            if (r5 >= r7) goto L97
            r7 = r13
        L16:
            if (r5 < 0) goto L8d
            r14 = r4[r5]
            l31 r14 = (defpackage.l31) r14
            u70 r14 = r14.a
            java.lang.Object r14 = r14.c()
            of5 r14 = (defpackage.of5) r14
            if (r14 == 0) goto L81
            long r15 = r14.c()
            long r17 = r0.S0()
            long r17 = defpackage.qo2.S(r17)
            r19 = 0
            lo4 r8 = r0.k0
            int[] r20 = defpackage.m31.a
            int r8 = r8.ordinal()
            r8 = r20[r8]
            if (r8 == r6) goto L60
            if (r8 != r9) goto L5c
            r8 = 32
            r20 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r10 = r15 >> r8
            int r10 = (int) r10
            float r10 = java.lang.Float.intBitsToFloat(r10)
            long r11 = r17 >> r8
            int r11 = (int) r11
            float r11 = java.lang.Float.intBitsToFloat(r11)
            int r10 = java.lang.Float.compare(r10, r11)
            goto L79
        L5c:
            defpackage.i.d()
            return r19
        L60:
            r8 = 32
            r20 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r10 = r15 & r20
            int r10 = (int) r10
            float r10 = java.lang.Float.intBitsToFloat(r10)
            long r11 = r17 & r20
            int r11 = (int) r11
            float r11 = java.lang.Float.intBitsToFloat(r11)
            int r10 = java.lang.Float.compare(r10, r11)
        L79:
            if (r10 > 0) goto L7d
            r7 = r14
            goto L8a
        L7d:
            if (r7 != 0) goto La1
            r7 = r14
            goto La1
        L81:
            r8 = 32
            r19 = 0
            r20 = 4294967295(0xffffffff, double:2.1219957905E-314)
        L8a:
            int r5 = r5 + (-1)
            goto L16
        L8d:
            r8 = 32
            r19 = 0
            r20 = 4294967295(0xffffffff, double:2.1219957905E-314)
            goto La1
        L97:
            r8 = 32
            r19 = 0
            r20 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r7 = r13
        La1:
            if (r7 != 0) goto Lb4
            boolean r4 = r0.q0
            if (r4 == 0) goto Lb0
            a86 r4 = r0.o0
            java.lang.Object r4 = r4.c()
            r13 = r4
            of5 r13 = (defpackage.of5) r13
        Lb0:
            if (r13 != 0) goto Lb3
            return r19
        Lb3:
            r7 = r13
        Lb4:
            long r2 = defpackage.qo2.S(r2)
            lo4 r0 = r0.k0
            int[] r4 = defpackage.m31.a
            int r0 = r0.ordinal()
            r0 = r4[r0]
            if (r0 == r6) goto Le0
            if (r0 != r9) goto Ldc
            float r0 = r7.a
            long r4 = r24 >> r8
            int r4 = (int) r4
            float r4 = (float) r4
            float r4 = r0 - r4
            float r5 = r7.c
            float r5 = r5 - r0
            long r2 = r2 >> r8
            int r0 = (int) r2
            float r0 = java.lang.Float.intBitsToFloat(r0)
            float r0 = r1.a(r4, r5, r0)
            return r0
        Ldc:
            defpackage.i.d()
            return r19
        Le0:
            float r0 = r7.b
            long r4 = r24 & r20
            int r4 = (int) r4
            float r4 = (float) r4
            float r4 = r0 - r4
            float r5 = r7.d
            float r5 = r5 - r0
            long r2 = r2 & r20
            int r0 = (int) r2
            float r0 = java.lang.Float.intBitsToFloat(r0)
            float r0 = r1.a(r4, r5, r0)
            return r0
    }

    public static boolean T0(defpackage.p31 r6, defpackage.of5 r7, long r8, long r10, int r12) {
            r0 = r12 & 1
            if (r0 == 0) goto L8
            long r8 = r6.S0()
        L8:
            r2 = r8
            r8 = r12 & 2
            if (r8 == 0) goto Lf
            r10 = 0
        Lf:
            r0 = r6
            r1 = r7
            r4 = r10
            long r6 = r0.V0(r1, r2, r4)
            r8 = 32
            long r8 = r6 >> r8
            int r8 = (int) r8
            float r8 = java.lang.Float.intBitsToFloat(r8)
            float r8 = java.lang.Math.abs(r8)
            r9 = 1056964608(0x3f000000, float:0.5)
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 > 0) goto L3e
            r10 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r6 & r10
            int r6 = (int) r6
            float r6 = java.lang.Float.intBitsToFloat(r6)
            float r6 = java.lang.Math.abs(r6)
            int r6 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r6 > 0) goto L3e
            r6 = 1
            return r6
        L3e:
            r6 = 0
            return r6
    }

    @Override // defpackage.z64
    public final boolean G0() {
            r0 = this;
            r0 = 0
            return r0
    }

    public final long S0() {
            r4 = this;
            long r0 = r4.r0
            r2 = -1
            boolean r4 = defpackage.q93.b(r0, r2)
            if (r4 == 0) goto Lc
            r0 = 0
        Lc:
            return r0
    }

    public final void U0(long r10) {
            r9 = this;
            z70 r0 = r9.n0
            if (r0 != 0) goto Lc
            py0 r0 = defpackage.b80.a
            java.lang.Object r0 = defpackage.hf.K(r9, r0)
            z70 r0 = (defpackage.z70) r0
        Lc:
            r4 = r0
            boolean r0 = r9.s0
            if (r0 == 0) goto L16
            java.lang.String r0 = "launchAnimation called when previous animation was running"
            defpackage.s53.c(r0)
        L16:
            nh7 r3 = new nh7
            z70 r0 = r9.n0
            if (r0 != 0) goto L24
            py0 r0 = defpackage.b80.a
            java.lang.Object r0 = defpackage.hf.K(r9, r0)
            z70 r0 = (defpackage.z70) r0
        L24:
            r0.getClass()
            y70 r0 = defpackage.z70.a
            r0.getClass()
            io6 r0 = defpackage.y70.b
            r3.<init>(r0)
            w61 r0 = r9.F0()
            a71 r8 = defpackage.a71.UNDISPATCHED
            o31 r1 = new o31
            r7 = 0
            r2 = r9
            r5 = r10
            r1.<init>(r2, r3, r4, r5, r7)
            r9 = 1
            r10 = 0
            defpackage.hv.L(r0, r10, r8, r1, r9)
            return
    }

    public final long V0(defpackage.of5 r7, long r8, long r10) {
            r6 = this;
            long r8 = defpackage.qo2.S(r8)
            lo4 r0 = r6.k0
            int[] r1 = defpackage.m31.a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            r2 = 0
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r5 = 32
            if (r0 == r1) goto L51
            r1 = 2
            if (r0 != r1) goto L4b
            z70 r0 = r6.n0
            if (r0 != 0) goto L29
            py0 r0 = defpackage.b80.a
            java.lang.Object r6 = defpackage.hf.K(r6, r0)
            r0 = r6
            z70 r0 = (defpackage.z70) r0
        L29:
            float r6 = r7.a
            long r10 = r10 >> r5
            int r10 = (int) r10
            float r10 = (float) r10
            float r10 = r6 - r10
            float r7 = r7.c
            float r7 = r7 - r6
            long r8 = r8 >> r5
            int r6 = (int) r8
            float r6 = java.lang.Float.intBitsToFloat(r6)
            float r6 = r0.a(r10, r7, r6)
            int r6 = java.lang.Float.floatToRawIntBits(r6)
            long r6 = (long) r6
            int r8 = java.lang.Float.floatToRawIntBits(r2)
            long r8 = (long) r8
            long r6 = r6 << r5
            long r8 = r8 & r3
            long r6 = r6 | r8
            return r6
        L4b:
            defpackage.i.d()
            r6 = 0
            return r6
        L51:
            z70 r0 = r6.n0
            if (r0 != 0) goto L5e
            py0 r0 = defpackage.b80.a
            java.lang.Object r6 = defpackage.hf.K(r6, r0)
            r0 = r6
            z70 r0 = (defpackage.z70) r0
        L5e:
            float r6 = r7.b
            long r10 = r10 & r3
            int r10 = (int) r10
            float r10 = (float) r10
            float r10 = r6 - r10
            float r7 = r7.d
            float r7 = r7 - r6
            long r8 = r8 & r3
            int r6 = (int) r8
            float r6 = java.lang.Float.intBitsToFloat(r6)
            float r6 = r0.a(r10, r7, r6)
            int r7 = java.lang.Float.floatToRawIntBits(r2)
            long r7 = (long) r7
            int r6 = java.lang.Float.floatToRawIntBits(r6)
            long r9 = (long) r6
            long r6 = r7 << r5
            long r8 = r9 & r3
            long r6 = r6 | r8
            return r6
    }

    @Override // defpackage.j34
    public final void b(long r13) {
            r12 = this;
            long r3 = r12.S0()
            r12.r0 = r13
            lo4 r5 = r12.k0
            int[] r6 = defpackage.m31.a
            int r5 = r5.ordinal()
            r5 = r6[r5]
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r8 = 32
            r9 = 1
            if (r5 == r9) goto L2c
            r10 = 2
            if (r5 != r10) goto L28
            long r10 = r13 >> r8
            int r5 = (int) r10
            long r10 = r3 >> r8
            int r10 = (int) r10
            int r5 = defpackage.nb3.p(r5, r10)
            goto L36
        L28:
            defpackage.i.d()
            return
        L2c:
            long r10 = r13 & r6
            int r5 = (int) r10
            long r10 = r3 & r6
            int r10 = (int) r10
            int r5 = defpackage.nb3.p(r5, r10)
        L36:
            if (r5 < 0) goto L39
            goto L88
        L39:
            boolean r5 = r12.m0
            if (r5 != 0) goto L58
            lo4 r5 = r12.k0
            lo4 r10 = defpackage.lo4.Vertical
            if (r5 != r10) goto L4e
            long r10 = r3 & r6
            int r5 = (int) r10
            long r1 = r13 & r6
            int r1 = (int) r1
            int r5 = r5 - r1
            long r1 = (long) r5
            long r1 = r1 & r6
        L4c:
            r7 = r1
            goto L5b
        L4e:
            long r5 = r3 >> r8
            int r5 = (int) r5
            long r1 = r13 >> r8
            int r1 = (int) r1
            int r5 = r5 - r1
            long r1 = (long) r5
            long r1 = r1 << r8
            goto L4c
        L58:
            r1 = 0
            goto L4c
        L5b:
            a86 r1 = r12.o0
            java.lang.Object r1 = r1.c()
            of5 r1 = (defpackage.of5) r1
            if (r1 == 0) goto L88
            boolean r2 = r12.s0
            if (r2 != 0) goto L88
            boolean r2 = r12.q0
            if (r2 != 0) goto L88
            r2 = r3
            r4 = 0
            r6 = 2
            r0 = r12
            boolean r2 = T0(r0, r1, r2, r4, r6)
            if (r2 == 0) goto L88
            r2 = 0
            r6 = 1
            r0 = r12
            r4 = r7
            boolean r1 = T0(r0, r1, r2, r4, r6)
            if (r1 != 0) goto L88
            r12.q0 = r9
            r12.U0(r4)
        L88:
            return
    }
}
