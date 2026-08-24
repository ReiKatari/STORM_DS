package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: a55  reason: default package */
/* loaded from: classes.dex */
public class a55 extends defpackage.f55 implements defpackage.sc1, defpackage.ux0 {
    public final defpackage.o45 L;
    public final defpackage.e55 R;
    public final defpackage.wb6 X;
    public final int[] Y;
    public java.util.HashMap Z;
    public java.util.HashMap d0;
    public boolean e0;
    public final defpackage.ls1 f0;

    public a55(defpackage.o45 r10, defpackage.e55 r11, defpackage.wb6 r12) {
            r9 = this;
            r12.getClass()
            r9.<init>()
            r9.L = r10
            r9.R = r11
            r9.X = r12
            ls1 r10 = new ls1
            h4 r0 = new h4
            r7 = 0
            r8 = 7
            r1 = 2
            java.lang.Class<a55> r3 = defpackage.a55.class
            java.lang.String r4 = "readIfAbsent"
            java.lang.String r5 = "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z"
            r6 = 0
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r10.<init>(r12, r0)
            r2.f0 = r10
            int r9 = r12.f()
            r10 = 32
            if (r9 >= r10) goto L51
            int r10 = r9 + 1
            int[] r11 = new int[r10]
            r0 = 0
            r1 = r0
        L31:
            if (r1 >= r10) goto L39
            r3 = -1
            r11[r1] = r3
            int r1 = r1 + 1
            goto L31
        L39:
            r10 = r0
        L3a:
            if (r10 >= r9) goto L4e
            int r1 = defpackage.mp2.u(r12, r10, r0)
            if (r1 > r9) goto L4a
            r3 = -2
            if (r1 == r3) goto L4a
            r11[r1] = r10
            int r10 = r10 + 1
            goto L3a
        L4a:
            r2.y0(r12, r9)
            return
        L4e:
            r2.Y = r11
            return
        L51:
            r2.y0(r12, r9)
            return
    }

    @Override // defpackage.ux0
    public final java.lang.String A(defpackage.wb6 r1, int r2) {
            r0 = this;
            r1.getClass()
            long r1 = r0.x0(r1, r2)
            java.lang.String r0 = r0.u0(r1)
            return r0
    }

    @Override // defpackage.sc1
    public final int B() {
            r2 = this;
            long r0 = r2.m0()
            int r2 = r2.s0(r0)
            return r2
    }

    @Override // defpackage.ux0
    public final short C(defpackage.t25 r1, int r2) {
            r0 = this;
            r1.getClass()
            long r1 = r0.x0(r1, r2)
            int r0 = r0.s0(r1)
            short r0 = (short) r0
            return r0
    }

    @Override // defpackage.sc1
    public final defpackage.sc1 F(defpackage.wb6 r3) {
            r2 = this;
            r3.getClass()
            long r0 = r2.m0()
            r2.n0(r0)
            return r2
    }

    @Override // defpackage.ux0
    public final java.lang.Object G(defpackage.wb6 r1, int r2, defpackage.gg3 r3, java.lang.Object r4) {
            r0 = this;
            r1.getClass()
            r3.getClass()
            long r1 = r0.x0(r1, r2)
            r0.n0(r1)
            java.lang.Object r0 = r0.o0(r3, r4)
            return r0
    }

    @Override // defpackage.ux0
    public final int H(defpackage.wb6 r1, int r2) {
            r0 = this;
            r1.getClass()
            long r1 = r0.x0(r1, r2)
            int r0 = r0.s0(r1)
            return r0
    }

    @Override // defpackage.sc1
    public final java.lang.String I() {
            r2 = this;
            long r0 = r2.m0()
            java.lang.String r2 = r2.u0(r0)
            return r2
    }

    @Override // defpackage.sc1
    public final int J(defpackage.wb6 r6) {
            r5 = this;
            r6.getClass()
            long r0 = r5.m0()
            int r0 = r5.s0(r0)
            int r1 = r6.f()
            r2 = 1
            if (r0 >= r1) goto L1b
            if (r0 < 0) goto L1b
            int r1 = defpackage.mp2.u(r6, r0, r2)
            if (r1 != r0) goto L1b
            return r0
        L1b:
            int r1 = r6.f()
            r3 = 0
        L20:
            if (r3 >= r1) goto L2c
            int r4 = defpackage.mp2.u(r6, r3, r2)
            if (r4 != r0) goto L29
            return r3
        L29:
            int r3 = r3 + 1
            goto L20
        L2c:
            b55 r6 = new b55
            wb6 r5 = r5.X
            java.lang.String r5 = r5.a()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " is not among valid "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r5 = " enum proto numbers"
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0 = 0
            r6.<init>(r5, r0)
            throw r6
    }

    @Override // defpackage.sc1
    public final long L() {
            r2 = this;
            long r0 = r2.m0()
            long r0 = r2.t0(r0)
            return r0
    }

    @Override // defpackage.sc1
    public final boolean M() {
            r0 = this;
            boolean r0 = r0.e0
            r0 = r0 ^ 1
            return r0
    }

    @Override // defpackage.ux0
    public final java.lang.Object P(defpackage.wb6 r1, int r2, defpackage.gg3 r3, java.lang.Object r4) {
            r0 = this;
            r1.getClass()
            r3.getClass()
            long r1 = r0.x0(r1, r2)
            r0.n0(r1)
            boolean r1 = r0.e0
            if (r1 != 0) goto L16
            java.lang.Object r0 = r0.o0(r3, r4)
            return r0
        L16:
            r0 = 0
            return r0
    }

    @Override // defpackage.ux0
    public final boolean W(defpackage.wb6 r1, int r2) {
            r0 = this;
            r1.getClass()
            long r1 = r0.x0(r1, r2)
            boolean r0 = r0.p0(r1)
            return r0
    }

    @Override // defpackage.sc1
    public final byte Y() {
            r2 = this;
            long r0 = r2.m0()
            int r2 = r2.s0(r0)
            byte r2 = (byte) r2
            return r2
    }

    @Override // defpackage.sc1
    public final short Z() {
            r2 = this;
            long r0 = r2.m0()
            int r2 = r2.s0(r0)
            short r2 = (short) r2
            return r2
    }

    @Override // defpackage.ux0
    public final void a(defpackage.wb6 r1) {
            r0 = this;
            r1.getClass()
            return
    }

    @Override // defpackage.ux0
    public final defpackage.jd1 b() {
            r0 = this;
            o45 r0 = r0.L
            jd1 r0 = r0.b
            return r0
    }

    @Override // defpackage.sc1
    public final float b0() {
            r2 = this;
            long r0 = r2.m0()
            float r2 = r2.r0(r0)
            return r2
    }

    @Override // defpackage.sc1
    public defpackage.ux0 c(defpackage.wb6 r13) {
            r12 = this;
            wb6 r1 = r12.X
            r13.getClass()
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            np2 r0 = r13.e()     // Catch: defpackage.b55 -> L4f
            bt6 r4 = defpackage.bt6.f     // Catch: defpackage.b55 -> L4f
            boolean r5 = defpackage.nb3.k(r0, r4)     // Catch: defpackage.b55 -> L4f
            o45 r7 = r12.L
            r8 = 19500(0x4c2c, double:9.6343E-320)
            r9 = r8
            e55 r8 = r12.R
            if (r5 == 0) goto L79
            r5 = r9
            long r9 = r12.h0()     // Catch: defpackage.b55 -> L4f
            np2 r0 = r1.e()     // Catch: defpackage.b55 -> L4f
            boolean r0 = defpackage.nb3.k(r0, r4)     // Catch: defpackage.b55 -> L4f
            if (r0 == 0) goto L52
            int r0 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r0 == 0) goto L52
            boolean r0 = r1.equals(r13)     // Catch: defpackage.b55 -> L4f
            if (r0 != 0) goto L52
            e55 r8 = defpackage.uj2.k(r8, r9)     // Catch: defpackage.b55 -> L4f
            r8.l()     // Catch: defpackage.b55 -> L4f
            ek5 r6 = new ek5     // Catch: defpackage.b55 -> L4f
            q45 r0 = defpackage.q45.DEFAULT     // Catch: defpackage.b55 -> L4f
            long r4 = r0.getSignature$kotlinx_serialization_protobuf()     // Catch: defpackage.b55 -> L4f
            r9 = 1
            long r9 = r9 | r4
            r11 = r13
            r6.<init>(r7, r8, r9, r11)     // Catch: defpackage.b55 -> L4b
            return r6
        L4b:
            r0 = move-exception
        L4c:
            r13 = r0
            goto L109
        L4f:
            r0 = move-exception
            r11 = r13
            goto L4c
        L52:
            r11 = r13
            x45 r13 = r8.c     // Catch: defpackage.b55 -> L4b
            x45 r0 = defpackage.x45.SIZE_DELIMITED     // Catch: defpackage.b55 -> L4b
            if (r13 != r0) goto L73
            r13 = 0
            wb6 r13 = r11.j(r13)     // Catch: defpackage.b55 -> L4b
            boolean r13 = defpackage.mp2.O(r13)     // Catch: defpackage.b55 -> L4b
            if (r13 == 0) goto L73
            e55 r13 = new e55     // Catch: defpackage.b55 -> L4b
            r90 r0 = r8.d()     // Catch: defpackage.b55 -> L4b
            r13.<init>(r0)     // Catch: defpackage.b55 -> L4b
            hq4 r0 = new hq4     // Catch: defpackage.b55 -> L4b
            r0.<init>(r7, r13, r11)     // Catch: defpackage.b55 -> L4b
            return r0
        L73:
            ek5 r6 = new ek5     // Catch: defpackage.b55 -> L4b
            r6.<init>(r7, r8, r9, r11)     // Catch: defpackage.b55 -> L4b
            return r6
        L79:
            r11 = r13
            r5 = r9
            bt6 r13 = defpackage.bt6.e     // Catch: defpackage.b55 -> L4b
            boolean r13 = defpackage.nb3.k(r0, r13)     // Catch: defpackage.b55 -> L4b
            if (r13 != 0) goto L8f
            bt6 r13 = defpackage.bt6.h     // Catch: defpackage.b55 -> L4b
            boolean r13 = defpackage.nb3.k(r0, r13)     // Catch: defpackage.b55 -> L4b
            if (r13 != 0) goto L8f
            boolean r13 = r0 instanceof defpackage.dz4     // Catch: defpackage.b55 -> L4b
            if (r13 == 0) goto L91
        L8f:
            r9 = r5
            goto Lc2
        L91:
            bt6 r13 = defpackage.bt6.g     // Catch: defpackage.b55 -> L4b
            boolean r13 = defpackage.nb3.k(r0, r13)     // Catch: defpackage.b55 -> L4b
            if (r13 == 0) goto Lba
            r9 = r5
            u04 r6 = new u04     // Catch: defpackage.b55 -> L4b
            long r4 = r12.h0()     // Catch: defpackage.b55 -> L4b
            int r13 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r13 != 0) goto La9
            r90 r13 = r8.e()     // Catch: defpackage.b55 -> L4b
            goto Lad
        La9:
            r90 r13 = r8.d()     // Catch: defpackage.b55 -> L4b
        Lad:
            e55 r8 = new e55     // Catch: defpackage.b55 -> L4b
            r8.<init>(r13)     // Catch: defpackage.b55 -> L4b
            long r9 = r12.h0()     // Catch: defpackage.b55 -> L4b
            r6.<init>(r7, r8, r9, r11)     // Catch: defpackage.b55 -> L4b
            return r6
        Lba:
            fc6 r13 = new fc6     // Catch: defpackage.b55 -> L4b
            java.lang.String r0 = "Primitives are not supported at top-level"
            r13.<init>(r0)     // Catch: defpackage.b55 -> L4b
            throw r13     // Catch: defpackage.b55 -> L4b
        Lc2:
            long r4 = r12.h0()     // Catch: defpackage.b55 -> L4b
            int r13 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r13 != 0) goto Ld1
            boolean r13 = defpackage.nb3.k(r1, r11)     // Catch: defpackage.b55 -> L4b
            if (r13 == 0) goto Ld1
            return r12
        Ld1:
            boolean r13 = defpackage.mp2.N(r4)     // Catch: defpackage.b55 -> L4b
            if (r13 == 0) goto Lff
            long r9 = r4 & r2
            int r13 = (int) r9     // Catch: defpackage.b55 -> L4b
            int r13 = r13 + (-1)
            java.util.HashMap r0 = r12.d0     // Catch: defpackage.b55 -> L4b
            if (r0 == 0) goto Lf8
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch: defpackage.b55 -> L4b
            java.lang.Object r13 = r0.get(r13)     // Catch: defpackage.b55 -> L4b
            java.lang.Integer r13 = (java.lang.Integer) r13     // Catch: defpackage.b55 -> L4b
            if (r13 == 0) goto Lf8
            int r13 = r13.intValue()     // Catch: defpackage.b55 -> L4b
            r9 = 1152921500311879680(0xfffffff00000000, double:1.2882291396436117E-231)
            long r4 = r4 & r9
            long r9 = (long) r13     // Catch: defpackage.b55 -> L4b
            long r4 = r4 | r9
        Lf8:
            r9 = r4
            em4 r6 = new em4     // Catch: defpackage.b55 -> L4b
            r6.<init>(r7, r8, r9, r11)     // Catch: defpackage.b55 -> L4b
            return r6
        Lff:
            a55 r13 = new a55     // Catch: defpackage.b55 -> L4b
            e55 r0 = defpackage.uj2.k(r8, r4)     // Catch: defpackage.b55 -> L4b
            r13.<init>(r7, r0, r11)     // Catch: defpackage.b55 -> L4b
            return r13
        L109:
            b55 r0 = new b55
            java.lang.String r4 = r11.a()
            java.lang.String r1 = r1.a()
            long r5 = r12.h0()
            long r2 = r2 & r5
            int r12 = (int) r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Fail to begin structure for "
            r2.<init>(r3)
            r2.append(r4)
            java.lang.String r3 = " in "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = " at proto number "
            r2.append(r1)
            r2.append(r12)
            java.lang.String r12 = r2.toString()
            r0.<init>(r12, r13)
            throw r0
    }

    @Override // defpackage.ux0
    public final long c0(defpackage.wb6 r1, int r2) {
            r0 = this;
            r1.getClass()
            long r1 = r0.x0(r1, r2)
            long r0 = r0.t0(r1)
            return r0
    }

    @Override // defpackage.ux0
    public final defpackage.sc1 e(defpackage.t25 r3, int r4) {
            r2 = this;
            r3.getClass()
            long r0 = r2.x0(r3, r4)
            wb6 r3 = r3.j(r4)
            r3.getClass()
            r2.n0(r0)
            return r2
    }

    @Override // defpackage.sc1
    public final double e0() {
            r2 = this;
            long r0 = r2.m0()
            double r0 = r2.q0(r0)
            return r0
    }

    @Override // defpackage.sc1
    public final boolean g() {
            r2 = this;
            long r0 = r2.m0()
            boolean r2 = r2.p0(r0)
            return r2
    }

    @Override // defpackage.sc1
    public final char h() {
            r2 = this;
            long r0 = r2.m0()
            int r2 = r2.s0(r0)
            char r2 = (char) r2
            return r2
    }

    @Override // defpackage.sc1
    public final java.lang.Object k(defpackage.gg3 r2) {
            r1 = this;
            r2.getClass()
            r0 = 0
            java.lang.Object r1 = r1.o0(r2, r0)
            return r1
    }

    public final java.lang.Object o0(defpackage.gg3 r8, java.lang.Object r9) {
            r7 = this;
            bt6 r0 = defpackage.bt6.g
            r8.getClass()
            boolean r1 = r8 instanceof defpackage.qw2     // Catch: defpackage.b55 -> Le
            if (r1 == 0) goto L10
            java.util.LinkedHashMap r7 = r7.w0(r8, r9)     // Catch: defpackage.b55 -> Le
            return r7
        Le:
            r9 = move-exception
            goto L5a
        L10:
            wb6 r1 = r8.e()     // Catch: defpackage.b55 -> Le
            x90 r2 = defpackage.x90.c     // Catch: defpackage.b55 -> Le
            t25 r2 = r2.b     // Catch: defpackage.b55 -> Le
            boolean r1 = defpackage.nb3.k(r1, r2)     // Catch: defpackage.b55 -> Le
            if (r1 == 0) goto L25
            byte[] r9 = (byte[]) r9     // Catch: defpackage.b55 -> Le
            byte[] r7 = r7.v0(r9)     // Catch: defpackage.b55 -> Le
            return r7
        L25:
            wb6 r1 = r8.e()     // Catch: defpackage.b55 -> Le
            cf7 r2 = defpackage.cf7.c     // Catch: defpackage.b55 -> Le
            t25 r2 = r2.b     // Catch: defpackage.b55 -> Le
            boolean r1 = defpackage.nb3.k(r1, r2)     // Catch: defpackage.b55 -> Le
            if (r1 == 0) goto L49
            af7 r9 = (defpackage.af7) r9     // Catch: defpackage.b55 -> Le
            r1 = 0
            if (r9 == 0) goto L3b
            byte[] r9 = r9.A     // Catch: defpackage.b55 -> Le
            goto L3c
        L3b:
            r9 = r1
        L3c:
            if (r9 == 0) goto L3f
            r1 = r9
        L3f:
            byte[] r9 = r7.v0(r1)     // Catch: defpackage.b55 -> Le
            af7 r1 = new af7     // Catch: defpackage.b55 -> Le
            r1.<init>(r9)     // Catch: defpackage.b55 -> Le
            return r1
        L49:
            boolean r1 = r8 instanceof defpackage.m0     // Catch: defpackage.b55 -> Le
            if (r1 == 0) goto L55
            r1 = r8
            m0 r1 = (defpackage.m0) r1     // Catch: defpackage.b55 -> Le
            java.lang.Object r7 = r1.j(r7, r9)     // Catch: defpackage.b55 -> Le
            return r7
        L55:
            java.lang.Object r7 = r8.c(r7)     // Catch: defpackage.b55 -> Le
            return r7
        L5a:
            long r1 = r7.h0()
            wb6 r3 = r8.e()
            wb6 r7 = r7.X
            boolean r3 = defpackage.nb3.k(r7, r3)
            java.lang.String r4 = "Error while decoding "
            if (r3 != 0) goto L119
            np2 r3 = r7.e()
            bt6 r5 = defpackage.bt6.f
            boolean r3 = defpackage.nb3.k(r3, r5)
            r5 = 2147483647(0x7fffffff, double:1.060997895E-314)
            if (r3 == 0) goto Laf
            wb6 r3 = r8.e()
            np2 r3 = r3.e()
            boolean r3 = defpackage.nb3.k(r3, r0)
            if (r3 == 0) goto L8a
            goto Laf
        L8a:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "Error while decoding index "
            r7.<init>(r0)
            long r0 = r1 & r5
            int r0 = (int) r0
            int r0 = r0 + (-1)
            r7.append(r0)
            java.lang.String r0 = " in repeated field of "
            r7.append(r0)
            wb6 r8 = r8.e()
            java.lang.String r8 = r8.a()
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            goto L129
        Laf:
            np2 r3 = r7.e()
            boolean r0 = defpackage.nb3.k(r3, r0)
            if (r0 == 0) goto Lee
            long r0 = r1 & r5
            int r7 = (int) r0
            int r7 = r7 + (-1)
            int r0 = r7 / 2
            int r7 = r7 % 2
            if (r7 != 0) goto Lc7
            java.lang.String r7 = "key"
            goto Lc9
        Lc7:
            java.lang.String r7 = "value"
        Lc9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r4)
            r1.append(r7)
            java.lang.String r7 = " of index "
            r1.append(r7)
            r1.append(r0)
            java.lang.String r7 = " in map field of "
            r1.append(r7)
            wb6 r7 = r8.e()
            java.lang.String r7 = r7.a()
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            goto L129
        Lee:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r4)
            wb6 r8 = r8.e()
            java.lang.String r8 = r8.a()
            r0.append(r8)
            java.lang.String r8 = " at proto number "
            r0.append(r8)
            long r1 = r1 & r5
            int r8 = (int) r1
            r0.append(r8)
            java.lang.String r8 = " of "
            r0.append(r8)
            java.lang.String r7 = r7.a()
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            goto L129
        L119:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r4)
            java.lang.String r7 = r7.a()
            r8.append(r7)
            java.lang.String r7 = r8.toString()
        L129:
            b55 r8 = new b55
            r8.<init>(r7, r9)
            throw r8
    }

    @Override // defpackage.ux0
    public final float p(defpackage.wb6 r1, int r2) {
            r0 = this;
            r1.getClass()
            long r1 = r0.x0(r1, r2)
            float r0 = r0.r0(r1)
            return r0
    }

    public final boolean p0(long r1) {
            r0 = this;
            int r0 = r0.s0(r1)
            if (r0 == 0) goto L16
            r1 = 1
            if (r0 != r1) goto La
            return r1
        La:
            fc6 r1 = new fc6
            java.lang.String r2 = "Unexpected boolean value: "
            java.lang.String r0 = defpackage.lb1.g(r0, r2)
            r1.<init>(r0)
            throw r1
        L16:
            r0 = 0
            return r0
    }

    @Override // defpackage.ux0
    public int q(defpackage.wb6 r8) {
            r7 = this;
            e55 r0 = r7.R
            r8.getClass()
        L5:
            int r1 = r0.l()     // Catch: defpackage.b55 -> L13
            ls1 r2 = r7.f0
            r3 = -1
            if (r1 != r3) goto L16
            int r7 = r2.b()     // Catch: defpackage.b55 -> L13
            return r7
        L13:
            r0 = move-exception
            goto L85
        L16:
            if (r1 == 0) goto L65
            int[] r4 = r7.Y     // Catch: defpackage.b55 -> L13
            if (r4 == 0) goto L26
            if (r1 < 0) goto L24
            int r5 = r4.length     // Catch: defpackage.b55 -> L13
            if (r1 >= r5) goto L24
            r4 = r4[r1]     // Catch: defpackage.b55 -> L13
            goto L3f
        L24:
            r4 = r3
            goto L3f
        L26:
            java.util.HashMap r4 = r7.Z     // Catch: defpackage.b55 -> L13
            r4.getClass()     // Catch: defpackage.b55 -> L13
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)     // Catch: defpackage.b55 -> L13
            java.lang.Object r4 = r4.get(r5)     // Catch: defpackage.b55 -> L13
            if (r4 != 0) goto L39
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)     // Catch: defpackage.b55 -> L13
        L39:
            java.lang.Number r4 = (java.lang.Number) r4     // Catch: defpackage.b55 -> L13
            int r4 = r4.intValue()     // Catch: defpackage.b55 -> L13
        L3f:
            if (r4 != r3) goto L45
            r0.m()     // Catch: defpackage.b55 -> L13
            goto L5
        L45:
            long r5 = defpackage.mp2.t(r8, r4)     // Catch: defpackage.b55 -> L13
            boolean r0 = defpackage.mp2.N(r5)     // Catch: defpackage.b55 -> L13
            if (r0 == 0) goto L61
            java.util.HashMap r0 = r7.d0     // Catch: defpackage.b55 -> L13
            if (r0 == 0) goto L61
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)     // Catch: defpackage.b55 -> L13
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: defpackage.b55 -> L13
            java.lang.Object r0 = r0.put(r3, r1)     // Catch: defpackage.b55 -> L13
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: defpackage.b55 -> L13
        L61:
            r2.a(r4)     // Catch: defpackage.b55 -> L13
            return r4
        L65:
            fc6 r0 = new fc6     // Catch: defpackage.b55 -> L13
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: defpackage.b55 -> L13
            r1.<init>()     // Catch: defpackage.b55 -> L13
            java.lang.String r2 = "0 is not allowed as the protobuf field number in "
            r1.append(r2)     // Catch: defpackage.b55 -> L13
            java.lang.String r2 = r8.a()     // Catch: defpackage.b55 -> L13
            r1.append(r2)     // Catch: defpackage.b55 -> L13
            java.lang.String r2 = ", the input bytes may have been corrupted"
            r1.append(r2)     // Catch: defpackage.b55 -> L13
            java.lang.String r1 = r1.toString()     // Catch: defpackage.b55 -> L13
            r0.<init>(r1)     // Catch: defpackage.b55 -> L13
            throw r0     // Catch: defpackage.b55 -> L13
        L85:
            b55 r1 = new b55
            java.lang.String r8 = r8.a()
            wb6 r7 = r7.X
            java.lang.String r7 = r7.a()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Fail to get element index for "
            r2.<init>(r3)
            r2.append(r8)
            java.lang.String r8 = " in "
            r2.append(r8)
            r2.append(r7)
            java.lang.String r7 = r2.toString()
            r1.<init>(r7, r0)
            throw r1
    }

    public final double q0(long r7) {
            r6 = this;
            r0 = 19500(0x4c2c, double:9.6343E-320)
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            r1 = 0
            e55 r3 = r6.R
            if (r0 != 0) goto L15
            long r3 = r3.j()     // Catch: defpackage.b55 -> L13
            double r6 = java.lang.Double.longBitsToDouble(r3)     // Catch: defpackage.b55 -> L13
            return r6
        L13:
            r0 = move-exception
            goto L34
        L15:
            x45 r0 = defpackage.x45.i64     // Catch: defpackage.b55 -> L13
            x45 r4 = r3.c     // Catch: defpackage.b55 -> L13
            if (r4 != r0) goto L24
            long r3 = r3.j()     // Catch: defpackage.b55 -> L13
            double r1 = java.lang.Double.longBitsToDouble(r3)     // Catch: defpackage.b55 -> L13
            goto L33
        L24:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: defpackage.b55 -> L13
            java.lang.String r5 = "Expected wire type "
            r4.<init>(r5)     // Catch: defpackage.b55 -> L13
            r4.append(r0)     // Catch: defpackage.b55 -> L13
            x45 r0 = r3.c     // Catch: defpackage.b55 -> L13
            defpackage.u34.z(r4, r0)     // Catch: defpackage.b55 -> L13
        L33:
            return r1
        L34:
            r3 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r7 = r7 & r3
            int r7 = (int) r7
            wb6 r6 = r6.X
            java.lang.String r6 = r6.a()
            defpackage.u34.d(r7, r6, r0)
            return r1
    }

    public final float r0(long r6) {
            r5 = this;
            r0 = 19500(0x4c2c, double:9.6343E-320)
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            r1 = 0
            e55 r2 = r5.R
            if (r0 != 0) goto L14
            int r0 = r2.h()     // Catch: defpackage.b55 -> L12
            float r5 = java.lang.Float.intBitsToFloat(r0)     // Catch: defpackage.b55 -> L12
            return r5
        L12:
            r0 = move-exception
            goto L33
        L14:
            x45 r0 = defpackage.x45.i32     // Catch: defpackage.b55 -> L12
            x45 r3 = r2.c     // Catch: defpackage.b55 -> L12
            if (r3 != r0) goto L23
            int r0 = r2.h()     // Catch: defpackage.b55 -> L12
            float r1 = java.lang.Float.intBitsToFloat(r0)     // Catch: defpackage.b55 -> L12
            goto L32
        L23:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: defpackage.b55 -> L12
            java.lang.String r4 = "Expected wire type "
            r3.<init>(r4)     // Catch: defpackage.b55 -> L12
            r3.append(r0)     // Catch: defpackage.b55 -> L12
            x45 r0 = r2.c     // Catch: defpackage.b55 -> L12
            defpackage.u34.z(r3, r0)     // Catch: defpackage.b55 -> L12
        L32:
            return r1
        L33:
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r6 = r6 & r2
            int r6 = (int) r6
            wb6 r5 = r5.X
            java.lang.String r5 = r5.a()
            defpackage.u34.d(r6, r5, r0)
            return r1
    }

    public final int s0(long r4) {
            r3 = this;
            r0 = 19500(0x4c2c, double:9.6343E-320)
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            e55 r1 = r3.R
            if (r0 != 0) goto Lf
            q45 r0 = defpackage.q45.DEFAULT     // Catch: defpackage.b55 -> L18
            int r3 = r1.b(r0)     // Catch: defpackage.b55 -> L18
            return r3
        Lf:
            q45 r0 = defpackage.mp2.I(r4)     // Catch: defpackage.b55 -> L18
            int r3 = r1.g(r0)     // Catch: defpackage.b55 -> L18
            return r3
        L18:
            r0 = move-exception
            r1 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r4 = r4 & r1
            int r4 = (int) r4
            wb6 r3 = r3.X
            java.lang.String r3 = r3.a()
            defpackage.u34.d(r4, r3, r0)
            r3 = 0
            return r3
    }

    @Override // defpackage.ux0
    public final double t(defpackage.t25 r1, int r2) {
            r0 = this;
            r1.getClass()
            long r1 = r0.x0(r1, r2)
            double r0 = r0.q0(r1)
            return r0
    }

    public final long t0(long r4) {
            r3 = this;
            r0 = 19500(0x4c2c, double:9.6343E-320)
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            e55 r1 = r3.R
            if (r0 != 0) goto Lf
            q45 r0 = defpackage.q45.DEFAULT     // Catch: defpackage.b55 -> L18
            long r3 = r1.c(r0)     // Catch: defpackage.b55 -> L18
            return r3
        Lf:
            q45 r0 = defpackage.mp2.I(r4)     // Catch: defpackage.b55 -> L18
            long r3 = r1.i(r0)     // Catch: defpackage.b55 -> L18
            return r3
        L18:
            r0 = move-exception
            r1 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r4 = r4 & r1
            int r4 = (int) r4
            wb6 r3 = r3.X
            java.lang.String r3 = r3.a()
            defpackage.u34.d(r4, r3, r0)
            r3 = 0
            return r3
    }

    public java.lang.String u0(long r7) {
            r6 = this;
            r0 = 19500(0x4c2c, double:9.6343E-320)
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            e55 r1 = r6.R
            if (r0 != 0) goto L26
            q45 r0 = defpackage.q45.DEFAULT     // Catch: defpackage.b55 -> L2b
            int r0 = r1.b(r0)     // Catch: defpackage.b55 -> L2b
            defpackage.e55.a(r0)     // Catch: defpackage.b55 -> L2b
            r90 r1 = r1.a     // Catch: defpackage.b55 -> L2b
            java.lang.Object r2 = r1.L     // Catch: defpackage.b55 -> L2b
            byte[] r2 = (byte[]) r2     // Catch: defpackage.b55 -> L2b
            int r3 = r1.B     // Catch: defpackage.b55 -> L2b
            int r4 = r3 + r0
            r5 = 4
            java.lang.String r2 = defpackage.xs6.W(r3, r2, r4, r5)     // Catch: defpackage.b55 -> L2b
            int r3 = r1.B     // Catch: defpackage.b55 -> L2b
            int r3 = r3 + r0
            r1.B = r3     // Catch: defpackage.b55 -> L2b
            return r2
        L26:
            java.lang.String r6 = r1.k()     // Catch: defpackage.b55 -> L2b
            return r6
        L2b:
            r0 = move-exception
            r1 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r7 = r7 & r1
            int r7 = (int) r7
            wb6 r6 = r6.X
            java.lang.String r6 = r6.a()
            defpackage.u34.d(r7, r6, r0)
            r6 = 0
            return r6
    }

    @Override // defpackage.ux0
    public final char v(defpackage.t25 r1, int r2) {
            r0 = this;
            r1.getClass()
            long r1 = r0.x0(r1, r2)
            int r0 = r0.s0(r1)
            char r0 = (char) r0
            return r0
    }

    public final byte[] v0(byte[] r8) {
            r7 = this;
            long r0 = r7.h0()
            r2 = 19500(0x4c2c, double:9.6343E-320)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r3 = 0
            e55 r4 = r7.R
            if (r2 != 0) goto L14
            byte[] r7 = r4.f()     // Catch: defpackage.b55 -> L12
            goto L2f
        L12:
            r8 = move-exception
            goto L3f
        L14:
            x45 r2 = defpackage.x45.SIZE_DELIMITED     // Catch: defpackage.b55 -> L12
            x45 r5 = r4.c     // Catch: defpackage.b55 -> L12
            if (r5 != r2) goto L1f
            byte[] r3 = r4.f()     // Catch: defpackage.b55 -> L12
            goto L2e
        L1f:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: defpackage.b55 -> L12
            java.lang.String r6 = "Expected wire type "
            r5.<init>(r6)     // Catch: defpackage.b55 -> L12
            r5.append(r2)     // Catch: defpackage.b55 -> L12
            x45 r2 = r4.c     // Catch: defpackage.b55 -> L12
            defpackage.u34.z(r5, r2)     // Catch: defpackage.b55 -> L12
        L2e:
            r7 = r3
        L2f:
            if (r8 != 0) goto L32
            return r7
        L32:
            int r0 = r8.length
            int r1 = r7.length
            int r2 = r0 + r1
            byte[] r8 = java.util.Arrays.copyOf(r8, r2)
            r2 = 0
            java.lang.System.arraycopy(r7, r2, r8, r0, r1)
            return r8
        L3f:
            r4 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r0 = r0 & r4
            int r0 = (int) r0
            wb6 r7 = r7.X
            java.lang.String r7 = r7.a()
            defpackage.u34.d(r0, r7, r8)
            return r3
    }

    public final java.util.LinkedHashMap w0(defpackage.gg3 r4, java.lang.Object r5) {
            r3 = this;
            r4.getClass()
            qw2 r4 = (defpackage.qw2) r4
            gg3 r0 = r4.a
            gg3 r4 = r4.b
            r0.getClass()
            r4.getClass()
            w04 r1 = new w04
            r2 = 0
            r1.<init>(r0, r4, r2)
            boolean r4 = r5 instanceof java.util.Map
            r0 = 0
            if (r4 == 0) goto L1d
            java.util.Map r5 = (java.util.Map) r5
            goto L1e
        L1d:
            r5 = r0
        L1e:
            if (r5 == 0) goto L24
            java.util.Set r0 = r5.entrySet()
        L24:
            ru r4 = new ru
            r5 = 2
            r4.<init>(r1, r5)
            java.lang.Object r3 = r4.j(r3, r0)
            java.util.Set r3 = (java.util.Set) r3
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            r4 = 10
            int r4 = defpackage.ht0.v0(r3, r4)
            int r4 = defpackage.c14.k0(r4)
            r5 = 16
            if (r4 >= r5) goto L41
            r4 = r5
        L41:
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>(r4)
            java.util.Iterator r3 = r3.iterator()
        L4a:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L62
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r0 = r4.getKey()
            java.lang.Object r4 = r4.getValue()
            r5.put(r0, r4)
            goto L4a
        L62:
            return r5
    }

    public long x0(defpackage.wb6 r1, int r2) {
            r0 = this;
            r1.getClass()
            long r0 = defpackage.mp2.t(r1, r2)
            return r0
    }

    public final void y0(defpackage.wb6 r12, int r13) {
            r11 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r13, r1)
            r2 = 0
            r3 = r2
            r4 = r3
        La:
            if (r3 >= r13) goto L7f
            int r5 = defpackage.mp2.u(r12, r3, r2)
            r6 = -2
            if (r5 != r6) goto L6d
            wb6 r5 = r12.j(r3)
            o45 r6 = r11.L
            jd1 r6 = r6.b
            java.util.List r5 = defpackage.mp2.y(r5, r6)
            java.util.ArrayList r6 = new java.util.ArrayList
            r7 = 10
            int r7 = defpackage.ht0.v0(r5, r7)
            r6.<init>(r7)
            java.util.Iterator r5 = r5.iterator()
        L2e:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L4b
            java.lang.Object r7 = r5.next()
            wb6 r7 = (defpackage.wb6) r7
            long r7 = defpackage.mp2.t(r7, r2)
            r9 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r7 = r7 & r9
            int r7 = (int) r7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r6.add(r7)
            goto L2e
        L4b:
            int r5 = r6.size()
            r7 = r2
        L50:
            if (r7 >= r5) goto L6a
            java.lang.Object r8 = r6.get(r7)
            int r7 = r7 + 1
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r3)
            r0.put(r8, r9)
            goto L50
        L6a:
            int r4 = r4 + 1
            goto L7c
        L6d:
            int r5 = defpackage.mp2.u(r12, r3, r2)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)
            r0.put(r5, r6)
        L7c:
            int r3 = r3 + 1
            goto La
        L7f:
            if (r4 <= 0) goto L88
            java.util.HashMap r12 = new java.util.HashMap
            r12.<init>(r4, r1)
            r11.d0 = r12
        L88:
            r11.Z = r0
            return
    }

    @Override // defpackage.ux0
    public final byte z(defpackage.t25 r1, int r2) {
            r0 = this;
            r1.getClass()
            long r1 = r0.x0(r1, r2)
            int r0 = r0.s0(r1)
            byte r0 = (byte) r0
            return r0
    }
}
