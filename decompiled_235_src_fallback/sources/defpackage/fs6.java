package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fs6  reason: default package */
/* loaded from: classes.dex */
public final class fs6 extends defpackage.nw7 implements defpackage.yd3 {
    public final defpackage.id3 t0;
    public final defpackage.by7 u0;
    public final defpackage.u0 v0;
    public final defpackage.jd1 w0;
    public int x0;
    public final defpackage.ge3 y0;

    public fs6(defpackage.id3 r1, defpackage.by7 r2, defpackage.u0 r3, defpackage.wb6 r4) {
            r0 = this;
            r2.getClass()
            r4.getClass()
            r0.<init>()
            r0.t0 = r1
            r0.u0 = r2
            r0.v0 = r3
            jd1 r2 = r1.b
            r0.w0 = r2
            r2 = -1
            r0.x0 = r2
            td3 r1 = r1.a
            boolean r1 = r1.b
            if (r1 == 0) goto L1e
            r1 = 0
            goto L23
        L1e:
            ge3 r1 = new ge3
            r1.<init>(r4)
        L23:
            r0.y0 = r1
            return
    }

    @Override // defpackage.nw7, defpackage.sc1
    public final int B() {
            r5 = this;
            u0 r5 = r5.v0
            long r0 = r5.j()
            int r2 = (int) r0
            long r3 = (long) r2
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 != 0) goto Ld
            return r2
        Ld:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Failed to parse int for input '"
            r2.<init>(r3)
            r2.append(r0)
            r0 = 39
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1 = 0
            r2 = 6
            r3 = 0
            defpackage.u0.q(r5, r0, r1, r3, r2)
            throw r3
    }

    @Override // defpackage.nw7, defpackage.sc1
    public final defpackage.sc1 F(defpackage.wb6 r2) {
            r1 = this;
            r2.getClass()
            boolean r2 = defpackage.is6.a(r2)
            if (r2 == 0) goto L13
            zd3 r2 = new zd3
            u0 r0 = r1.v0
            id3 r1 = r1.t0
            r2.<init>(r0, r1)
            return r2
        L13:
            return r1
    }

    @Override // defpackage.nw7, defpackage.ux0
    public final java.lang.Object G(defpackage.wb6 r5, int r6, defpackage.gg3 r7, java.lang.Object r8) {
            r4 = this;
            u0 r8 = r4.v0
            java.lang.Object r8 = r8.R
            aj r8 = (defpackage.aj) r8
            r5.getClass()
            r7.getClass()
            by7 r5 = r4.u0
            by7 r0 = defpackage.by7.MAP
            r1 = 1
            if (r5 != r0) goto L19
            r5 = r6 & 1
            if (r5 != 0) goto L19
            r5 = r1
            goto L1a
        L19:
            r5 = 0
        L1a:
            r6 = -2
            if (r5 == 0) goto L2f
            java.lang.Object r0 = r8.X
            int[] r0 = (int[]) r0
            int r2 = r8.B
            r0 = r0[r2]
            if (r0 != r6) goto L2f
            java.lang.Object r0 = r8.R
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            xd5 r3 = defpackage.xd5.g0
            r0[r2] = r3
        L2f:
            java.lang.Object r4 = r4.k(r7)
            if (r5 == 0) goto L66
            java.lang.Object r5 = r8.X
            int[] r5 = (int[]) r5
            int r7 = r8.B
            r5 = r5[r7]
            if (r5 == r6) goto L4c
            int r7 = r7 + r1
            r8.B = r7
            java.lang.Object r5 = r8.R
            java.lang.Object[] r5 = (java.lang.Object[]) r5
            int r5 = r5.length
            if (r7 != r5) goto L4c
            r8.i()
        L4c:
            java.lang.Object r5 = r8.R
            java.lang.Object[] r5 = (java.lang.Object[]) r5
            int r7 = r8.B
            java.lang.Object r0 = r8.L
            td3 r0 = (defpackage.td3) r0
            boolean r0 = r0.g
            if (r0 == 0) goto L5c
            r0 = r4
            goto L5e
        L5c:
            cs1 r0 = defpackage.cs1.e0
        L5e:
            r5[r7] = r0
            java.lang.Object r5 = r8.X
            int[] r5 = (int[]) r5
            r5[r7] = r6
        L66:
            return r4
    }

    @Override // defpackage.nw7, defpackage.sc1
    public final java.lang.String I() {
            r0 = this;
            u0 r0 = r0.v0
            java.lang.String r0 = r0.k()
            return r0
    }

    @Override // defpackage.nw7, defpackage.sc1
    public final int J(defpackage.wb6 r4) {
            r3 = this;
            r4.getClass()
            u0 r0 = r3.v0
            java.lang.String r1 = r0.k()
            java.lang.Object r0 = r0.R
            aj r0 = (defpackage.aj) r0
            java.lang.String r0 = r0.c()
            java.lang.String r2 = " at path "
            java.lang.String r0 = r2.concat(r0)
            id3 r3 = r3.t0
            int r3 = defpackage.te3.b(r4, r3, r1, r0)
            return r3
    }

    @Override // defpackage.nw7, defpackage.sc1
    public final long L() {
            r2 = this;
            u0 r2 = r2.v0
            long r0 = r2.j()
            return r0
    }

    @Override // defpackage.nw7, defpackage.sc1
    public final boolean M() {
            r9 = this;
            r0 = 0
            ge3 r1 = r9.y0
            if (r1 == 0) goto L8
            boolean r1 = r1.b
            goto L9
        L8:
            r1 = r0
        L9:
            if (r1 != 0) goto L5b
            u0 r9 = r9.v0
            int r1 = r9.y()
            int r1 = r9.x(r1)
            java.lang.CharSequence r2 = r9.s()
            int r2 = r2.length()
            int r2 = r2 - r1
            r3 = 1
            r4 = 4
            if (r2 < r4) goto L57
            r5 = -1
            if (r1 != r5) goto L26
            goto L57
        L26:
            r5 = r0
        L27:
            if (r5 >= r4) goto L3f
            java.lang.String r6 = "null"
            char r6 = r6.charAt(r5)
            java.lang.CharSequence r7 = r9.s()
            int r8 = r1 + r5
            char r7 = r7.charAt(r8)
            if (r6 == r7) goto L3c
            goto L57
        L3c:
            int r5 = r5 + 1
            goto L27
        L3f:
            if (r2 <= r4) goto L52
            java.lang.CharSequence r2 = r9.s()
            int r5 = r1 + 4
            char r2 = r2.charAt(r5)
            byte r2 = defpackage.l.n(r2)
            if (r2 != 0) goto L52
            goto L57
        L52:
            int r1 = r1 + r4
            r9.B = r1
            r9 = r3
            goto L58
        L57:
            r9 = r0
        L58:
            if (r9 != 0) goto L5b
            return r3
        L5b:
            return r0
    }

    @Override // defpackage.yd3
    public final defpackage.id3 S() {
            r0 = this;
            id3 r0 = r0.t0
            return r0
    }

    @Override // defpackage.nw7, defpackage.sc1
    public final byte Y() {
            r5 = this;
            u0 r5 = r5.v0
            long r0 = r5.j()
            int r2 = (int) r0
            byte r2 = (byte) r2
            long r3 = (long) r2
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 != 0) goto Le
            return r2
        Le:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Failed to parse byte for input '"
            r2.<init>(r3)
            r2.append(r0)
            r0 = 39
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1 = 0
            r2 = 6
            r3 = 0
            defpackage.u0.q(r5, r0, r1, r3, r2)
            throw r3
    }

    @Override // defpackage.nw7, defpackage.sc1
    public final short Z() {
            r5 = this;
            u0 r5 = r5.v0
            long r0 = r5.j()
            int r2 = (int) r0
            short r2 = (short) r2
            long r3 = (long) r2
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 != 0) goto Le
            return r2
        Le:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Failed to parse short for input '"
            r2.<init>(r3)
            r2.append(r0)
            r0 = 39
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1 = 0
            r2 = 6
            r3 = 0
            defpackage.u0.q(r5, r0, r1, r3, r2)
            throw r3
    }

    @Override // defpackage.nw7, defpackage.ux0
    public final void a(defpackage.wb6 r5) {
            r4 = this;
            r5.getClass()
            int r0 = r5.f()
            r1 = -1
            if (r0 != 0) goto L18
            id3 r0 = r4.t0
            boolean r0 = defpackage.te3.c(r0, r5)
            if (r0 == 0) goto L18
        L12:
            int r0 = r4.q(r5)
            if (r0 != r1) goto L12
        L18:
            u0 r5 = r4.v0
            boolean r0 = r5.A()
            if (r0 != 0) goto L43
            by7 r4 = r4.u0
            char r4 = r4.end
            r5.i(r4)
            java.lang.Object r4 = r5.R
            aj r4 = (defpackage.aj) r4
            int r5 = r4.B
            java.lang.Object r0 = r4.X
            int[] r0 = (int[]) r0
            r2 = r0[r5]
            r3 = -2
            if (r2 != r3) goto L3b
            r0[r5] = r1
            int r5 = r5 + r1
            r4.B = r5
        L3b:
            int r5 = r4.B
            if (r5 == r1) goto L42
            int r5 = r5 + r1
            r4.B = r5
        L42:
            return
        L43:
            java.lang.String r4 = ""
            defpackage.hi2.F(r5, r4)
            r4 = 0
            throw r4
    }

    @Override // defpackage.ux0
    public final defpackage.jd1 b() {
            r0 = this;
            jd1 r0 = r0.w0
            return r0
    }

    @Override // defpackage.nw7, defpackage.sc1
    public final float b0() {
            r5 = this;
            u0 r5 = r5.v0
            java.lang.String r0 = r5.m()
            r1 = 0
            r2 = 0
            float r0 = java.lang.Float.parseFloat(r0)     // Catch: java.lang.IllegalArgumentException -> L27
            float r3 = java.lang.Math.abs(r0)
            r4 = 2139095039(0x7f7fffff, float:3.4028235E38)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 > 0) goto L18
            return r0
        L18:
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.lang.String r0 = defpackage.hi2.I(r0, r2)
            java.lang.String r3 = "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'"
            r4 = 2
            defpackage.u0.q(r5, r0, r1, r3, r4)
            throw r2
        L27:
            java.lang.String r3 = "Failed to parse type 'float' for input '"
            r4 = 39
            java.lang.String r0 = defpackage.i61.k(r4, r3, r0)
            r3 = 6
            defpackage.u0.q(r5, r0, r1, r2, r3)
            throw r2
    }

    @Override // defpackage.nw7, defpackage.sc1
    public final defpackage.ux0 c(defpackage.wb6 r8) {
            r7 = this;
            r8.getClass()
            id3 r0 = r7.t0
            by7 r1 = defpackage.js7.c(r0, r8)
            u0 r2 = r7.v0
            java.lang.Object r3 = r2.R
            aj r3 = (defpackage.aj) r3
            r3.getClass()
            int r4 = r3.B
            r5 = 1
            int r4 = r4 + r5
            r3.B = r4
            java.lang.Object r6 = r3.R
            java.lang.Object[] r6 = (java.lang.Object[]) r6
            int r6 = r6.length
            if (r4 != r6) goto L22
            r3.i()
        L22:
            java.lang.Object r3 = r3.R
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            r3[r4] = r8
            char r3 = r1.begin
            r2.i(r3)
            byte r3 = r2.v()
            r4 = 4
            if (r3 == r4) goto L5b
            int[] r3 = defpackage.es6.a
            int r4 = r1.ordinal()
            r3 = r3[r4]
            if (r3 == r5) goto L55
            r4 = 2
            if (r3 == r4) goto L55
            r4 = 3
            if (r3 == r4) goto L55
            by7 r3 = r7.u0
            if (r3 != r1) goto L4f
            td3 r3 = r0.a
            boolean r3 = r3.b
            if (r3 == 0) goto L4f
            return r7
        L4f:
            fs6 r7 = new fs6
            r7.<init>(r0, r1, r2, r8)
            return r7
        L55:
            fs6 r7 = new fs6
            r7.<init>(r0, r1, r2, r8)
            return r7
        L5b:
            r7 = 0
            r8 = 6
            java.lang.String r0 = "Unexpected leading comma"
            r1 = 0
            defpackage.u0.q(r2, r0, r7, r1, r8)
            throw r1
    }

    @Override // defpackage.nw7, defpackage.sc1
    public final double e0() {
            r9 = this;
            u0 r9 = r9.v0
            java.lang.String r0 = r9.m()
            r1 = 0
            r2 = 0
            double r3 = java.lang.Double.parseDouble(r0)     // Catch: java.lang.IllegalArgumentException -> L29
            double r5 = java.lang.Math.abs(r3)
            r7 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 > 0) goto L1a
            return r3
        L1a:
            java.lang.Double r0 = java.lang.Double.valueOf(r3)
            java.lang.String r0 = defpackage.hi2.I(r0, r2)
            java.lang.String r3 = "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'"
            r4 = 2
            defpackage.u0.q(r9, r0, r1, r3, r4)
            throw r2
        L29:
            java.lang.String r3 = "Failed to parse type 'double' for input '"
            r4 = 39
            java.lang.String r0 = defpackage.i61.k(r4, r3, r0)
            r3 = 6
            defpackage.u0.q(r9, r0, r1, r2, r3)
            throw r2
    }

    @Override // defpackage.nw7, defpackage.sc1
    public final boolean g() {
            r10 = this;
            u0 r10 = r10.v0
            int r0 = r10.y()
            java.lang.CharSequence r1 = r10.s()
            int r1 = r1.length()
            java.lang.String r2 = "EOF"
            r3 = 6
            r4 = 0
            r5 = 0
            if (r0 == r1) goto La3
            java.lang.CharSequence r1 = r10.s()
            char r1 = r1.charAt(r0)
            r6 = 34
            r7 = 1
            if (r1 != r6) goto L26
            int r0 = r0 + 1
            r1 = r7
            goto L27
        L26:
            r1 = r5
        L27:
            int r0 = r10.x(r0)
            java.lang.CharSequence r8 = r10.s()
            int r8 = r8.length()
            if (r0 >= r8) goto L9f
            r8 = -1
            if (r0 == r8) goto L9f
            java.lang.CharSequence r8 = r10.s()
            int r9 = r0 + 1
            char r0 = r8.charAt(r0)
            r0 = r0 | 32
            r8 = 102(0x66, float:1.43E-43)
            if (r0 == r8) goto L6e
            r8 = 116(0x74, float:1.63E-43)
            if (r0 != r8) goto L53
            java.lang.String r0 = "rue"
            r10.e(r9, r0)
            r0 = r7
            goto L74
        L53:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Expected valid boolean literal prefix, but had '"
            r0.<init>(r1)
            java.lang.String r1 = r10.m()
            r0.append(r1)
            r1 = 39
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            defpackage.u0.q(r10, r0, r5, r4, r3)
            throw r4
        L6e:
            java.lang.String r0 = "alse"
            r10.e(r9, r0)
            r0 = r5
        L74:
            if (r1 == 0) goto L9e
            int r1 = r10.B
            java.lang.CharSequence r8 = r10.s()
            int r8 = r8.length()
            if (r1 == r8) goto L9a
            java.lang.CharSequence r1 = r10.s()
            int r2 = r10.B
            char r1 = r1.charAt(r2)
            if (r1 != r6) goto L94
            int r1 = r10.B
            int r1 = r1 + r7
            r10.B = r1
            return r0
        L94:
            java.lang.String r0 = "Expected closing quotation mark"
            defpackage.u0.q(r10, r0, r5, r4, r3)
            throw r4
        L9a:
            defpackage.u0.q(r10, r2, r5, r4, r3)
            throw r4
        L9e:
            return r0
        L9f:
            defpackage.u0.q(r10, r2, r5, r4, r3)
            throw r4
        La3:
            defpackage.u0.q(r10, r2, r5, r4, r3)
            throw r4
    }

    @Override // defpackage.nw7, defpackage.sc1
    public final char h() {
            r4 = this;
            u0 r4 = r4.v0
            java.lang.String r0 = r4.m()
            int r1 = r0.length()
            r2 = 1
            r3 = 0
            if (r1 != r2) goto L13
            char r4 = r0.charAt(r3)
            return r4
        L13:
            java.lang.String r1 = "Expected single char, but got '"
            r2 = 39
            java.lang.String r0 = defpackage.i61.k(r2, r1, r0)
            r1 = 6
            r2 = 0
            defpackage.u0.q(r4, r0, r3, r2, r1)
            throw r2
    }

    @Override // defpackage.sc1
    public final java.lang.Object k(defpackage.gg3 r11) {
            r10 = this;
            id3 r0 = r10.t0
            u0 r1 = r10.v0
            java.lang.Object r2 = r1.R
            aj r2 = (defpackage.aj) r2
            java.lang.String r3 = "Expected "
            r11.getClass()
            r4 = 0
            boolean r5 = r11 instanceof defpackage.fz4     // Catch: defpackage.o64 -> L8c
            if (r5 == 0) goto L10b
            r5 = r11
            fz4 r5 = (defpackage.fz4) r5     // Catch: defpackage.o64 -> L8c
            wb6 r5 = r5.e()     // Catch: defpackage.o64 -> L8c
            java.lang.String r5 = defpackage.uj2.r(r0, r5)     // Catch: defpackage.o64 -> L8c
            java.lang.String r5 = r1.u(r5)     // Catch: defpackage.o64 -> L8c
            r6 = 0
            if (r5 != 0) goto Ldf
            r1 = r11
            fz4 r1 = (defpackage.fz4) r1     // Catch: defpackage.o64 -> L8c
            wb6 r1 = r1.e()     // Catch: defpackage.o64 -> L8c
            java.lang.String r1 = defpackage.uj2.r(r0, r1)     // Catch: defpackage.o64 -> L8c
            de3 r5 = r10.y()     // Catch: defpackage.o64 -> L8c
            r7 = r11
            fz4 r7 = (defpackage.fz4) r7     // Catch: defpackage.o64 -> L8c
            wb6 r7 = r7.e()     // Catch: defpackage.o64 -> L8c
            java.lang.String r7 = r7.a()     // Catch: defpackage.o64 -> L8c
            boolean r8 = r5 instanceof defpackage.ye3     // Catch: defpackage.o64 -> L8c
            r9 = -1
            if (r8 != 0) goto L9a
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: defpackage.o64 -> L8c
            r10.<init>(r3)     // Catch: defpackage.o64 -> L8c
            java.lang.Class<ye3> r11 = defpackage.ye3.class
            ar0 r11 = defpackage.gh5.a(r11)     // Catch: defpackage.o64 -> L8c
            java.lang.String r11 = r11.c()     // Catch: defpackage.o64 -> L8c
            r10.append(r11)     // Catch: defpackage.o64 -> L8c
            java.lang.String r11 = ", but had "
            r10.append(r11)     // Catch: defpackage.o64 -> L8c
            java.lang.Class r11 = r5.getClass()     // Catch: defpackage.o64 -> L8c
            ar0 r11 = defpackage.gh5.a(r11)     // Catch: defpackage.o64 -> L8c
            java.lang.String r11 = r11.c()     // Catch: defpackage.o64 -> L8c
            r10.append(r11)     // Catch: defpackage.o64 -> L8c
            java.lang.String r11 = " as the serialized body of "
            r10.append(r11)     // Catch: defpackage.o64 -> L8c
            r10.append(r7)     // Catch: defpackage.o64 -> L8c
            java.lang.String r10 = r10.toString()     // Catch: defpackage.o64 -> L8c
            java.lang.String r11 = r2.c()     // Catch: defpackage.o64 -> L8c
            td3 r0 = r0.a     // Catch: defpackage.o64 -> L8c
            boolean r0 = r0.g     // Catch: defpackage.o64 -> L8c
            if (r0 == 0) goto L8f
            java.lang.String r0 = r5.toString()     // Catch: defpackage.o64 -> L8c
            java.lang.CharSequence r0 = defpackage.hi2.H(r9, r0)     // Catch: defpackage.o64 -> L8c
            java.lang.String r0 = r0.toString()     // Catch: defpackage.o64 -> L8c
            goto L90
        L8c:
            r10 = move-exception
            goto L110
        L8f:
            r0 = r6
        L90:
            ae3 r1 = new ae3     // Catch: defpackage.o64 -> L8c
            java.lang.String r10 = defpackage.hi2.x(r10, r11, r9, r6, r0)     // Catch: defpackage.o64 -> L8c
            r1.<init>(r10)     // Catch: defpackage.o64 -> L8c
            throw r1     // Catch: defpackage.o64 -> L8c
        L9a:
            ye3 r5 = (defpackage.ye3) r5     // Catch: defpackage.o64 -> L8c
            java.lang.Object r1 = r5.get(r1)     // Catch: defpackage.o64 -> L8c
            de3 r1 = (defpackage.de3) r1     // Catch: defpackage.o64 -> L8c
            if (r1 == 0) goto Lb2
            df3 r1 = defpackage.fe3.h(r1)     // Catch: defpackage.o64 -> L8c
            boolean r3 = r1 instanceof defpackage.ue3     // Catch: defpackage.o64 -> L8c
            if (r3 == 0) goto Lad
            goto Lb2
        Lad:
            java.lang.String r1 = r1.a()     // Catch: defpackage.o64 -> L8c
            goto Lb3
        Lb2:
            r1 = r6
        Lb3:
            fz4 r11 = (defpackage.fz4) r11     // Catch: defpackage.fc6 -> Lb9
            defpackage.xk2.g(r11, r10, r1)     // Catch: defpackage.fc6 -> Lb9
            throw r6     // Catch: defpackage.fc6 -> Lb9
        Lb9:
            r10 = move-exception
            java.lang.String r10 = r10.getMessage()     // Catch: defpackage.o64 -> L8c
            r10.getClass()     // Catch: defpackage.o64 -> L8c
            td3 r11 = r0.a     // Catch: defpackage.o64 -> L8c
            boolean r11 = r11.g     // Catch: defpackage.o64 -> L8c
            if (r11 == 0) goto Ld4
            java.lang.String r11 = r5.toString()     // Catch: defpackage.o64 -> L8c
            java.lang.CharSequence r11 = defpackage.hi2.H(r9, r11)     // Catch: defpackage.o64 -> L8c
            java.lang.String r11 = r11.toString()     // Catch: defpackage.o64 -> L8c
            goto Ld5
        Ld4:
            r11 = r6
        Ld5:
            ae3 r0 = new ae3     // Catch: defpackage.o64 -> L8c
            java.lang.String r10 = defpackage.hi2.x(r10, r6, r9, r6, r11)     // Catch: defpackage.o64 -> L8c
            r0.<init>(r10)     // Catch: defpackage.o64 -> L8c
            throw r0     // Catch: defpackage.o64 -> L8c
        Ldf:
            fz4 r11 = (defpackage.fz4) r11     // Catch: defpackage.fc6 -> Le5
            defpackage.xk2.g(r11, r10, r5)     // Catch: defpackage.fc6 -> Le5
            throw r6     // Catch: defpackage.fc6 -> Le5
        Le5:
            r10 = move-exception
            java.lang.String r11 = r10.getMessage()     // Catch: defpackage.o64 -> L8c
            r11.getClass()     // Catch: defpackage.o64 -> L8c
            r0 = 10
            java.lang.String r11 = defpackage.qs6.P0(r11, r0)     // Catch: defpackage.o64 -> L8c
            java.lang.String r3 = "."
            java.lang.String r11 = defpackage.qs6.E0(r11, r3)     // Catch: defpackage.o64 -> L8c
            java.lang.String r10 = r10.getMessage()     // Catch: defpackage.o64 -> L8c
            r10.getClass()     // Catch: defpackage.o64 -> L8c
            java.lang.String r3 = ""
            java.lang.String r10 = defpackage.qs6.M0(r0, r10, r3)     // Catch: defpackage.o64 -> L8c
            r0 = 2
            defpackage.u0.q(r1, r11, r4, r10, r0)     // Catch: defpackage.o64 -> L8c
            throw r6     // Catch: defpackage.o64 -> L8c
        L10b:
            java.lang.Object r10 = r11.c(r10)     // Catch: defpackage.o64 -> L8c
            return r10
        L110:
            java.lang.String r11 = r10.getMessage()
            r11.getClass()
            java.lang.String r0 = "at path"
            boolean r11 = defpackage.qs6.j0(r11, r0, r4)
            if (r11 == 0) goto L120
            throw r10
        L120:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r0 = r10.getMessage()
            r11.append(r0)
            java.lang.String r0 = " at path: "
            r11.append(r0)
            java.lang.String r0 = r2.c()
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            o64 r0 = new o64
            java.util.List r1 = r10.A
            java.lang.String r2 = r10.B
            r0.<init>(r11, r10, r1, r2)
            throw r0
    }

    @Override // defpackage.ux0
    public final int q(defpackage.wb6 r17) {
            r16 = this;
            r0 = r16
            r1 = r17
            u0 r2 = r0.v0
            java.lang.Object r3 = r2.R
            aj r3 = (defpackage.aj) r3
            r1.getClass()
            int[] r4 = defpackage.es6.a
            by7 r5 = r0.u0
            int r6 = r5.ordinal()
            r4 = r4[r6]
            r6 = 2
            java.lang.String r7 = "object"
            r8 = 4
            r9 = 0
            r10 = 58
            r11 = 0
            r12 = 1
            r13 = -1
            if (r4 == r6) goto L12f
            r6 = 6
            if (r4 == r8) goto L4d
            boolean r1 = r2.A()
            boolean r4 = r2.d()
            if (r4 == 0) goto L43
            int r4 = r0.x0
            if (r4 == r13) goto L3d
            if (r1 == 0) goto L37
            goto L3d
        L37:
            java.lang.String r0 = "Expected end of the array or comma"
            defpackage.u0.q(r2, r0, r11, r9, r6)
            throw r9
        L3d:
            int r13 = r4 + 1
            r0.x0 = r13
            goto L16f
        L43:
            if (r1 != 0) goto L47
            goto L16f
        L47:
            java.lang.String r0 = "array"
            defpackage.hi2.F(r2, r0)
            throw r9
        L4d:
            boolean r4 = r2.A()
        L51:
            boolean r8 = r2.d()
            ge3 r14 = r0.y0
            if (r8 == 0) goto L120
            java.lang.String r4 = r2.f()
            r2.i(r10)
            id3 r8 = r0.t0
            int r15 = defpackage.te3.a(r1, r8, r4)
            r10 = -3
            if (r15 == r10) goto L73
            if (r14 == 0) goto L70
            ls1 r0 = r14.a
            r0.a(r15)
        L70:
            r13 = r15
            goto L16f
        L73:
            boolean r8 = defpackage.te3.c(r8, r1)
            if (r8 != 0) goto La8
            int r0 = r3.B
            java.lang.Object r1 = r3.X
            int[] r1 = (int[]) r1
            r5 = r1[r0]
            r7 = -2
            if (r5 != r7) goto L89
            r1[r0] = r13
            int r0 = r0 + r13
            r3.B = r0
        L89:
            int r0 = r3.B
            if (r0 == r13) goto L90
            int r0 = r0 + r13
            r3.B = r0
        L90:
            int r0 = r2.B
            java.lang.String r0 = r2.z(r11, r0)
            int r0 = defpackage.qs6.y0(r0, r4, r11, r6)
            java.lang.String r1 = "Encountered an unknown key '"
            r3 = 39
            java.lang.String r1 = defpackage.i61.k(r3, r1, r4)
            java.lang.String r3 = "Use 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys."
            r2.p(r1, r0, r3)
            throw r9
        La8:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            byte r4 = r2.v()
            r10 = 8
            if (r4 == r10) goto Lbb
            if (r4 == r6) goto Lbb
            r2.m()
            goto L118
        Lbb:
            byte r4 = r2.v()
            if (r4 != r12) goto Lc5
            r2.f()
            goto Lbb
        Lc5:
            if (r4 == r10) goto L108
            if (r4 != r6) goto Lca
            goto L108
        Lca:
            r14 = 9
            if (r4 != r14) goto Le4
            java.lang.Object r4 = defpackage.gt0.Q0(r8)
            java.lang.Number r4 = (java.lang.Number) r4
            byte r4 = r4.byteValue()
            if (r4 != r10) goto Lde
            defpackage.gt0.Y0(r8)
            goto L10f
        Lde:
            java.lang.String r0 = "found ] instead of }"
            defpackage.u0.q(r2, r0, r11, r9, r6)
            throw r9
        Le4:
            r14 = 7
            if (r4 != r14) goto Lfd
            java.lang.Object r4 = defpackage.gt0.Q0(r8)
            java.lang.Number r4 = (java.lang.Number) r4
            byte r4 = r4.byteValue()
            if (r4 != r6) goto Lf7
            defpackage.gt0.Y0(r8)
            goto L10f
        Lf7:
            java.lang.String r0 = "found } instead of ]"
            defpackage.u0.q(r2, r0, r11, r9, r6)
            throw r9
        Lfd:
            r14 = 10
            if (r4 == r14) goto L102
            goto L10f
        L102:
            java.lang.String r0 = "Unexpected end of input due to malformed JSON during ignoring unknown keys"
            defpackage.u0.q(r2, r0, r11, r9, r6)
            throw r9
        L108:
            java.lang.Byte r4 = java.lang.Byte.valueOf(r4)
            r8.add(r4)
        L10f:
            r2.g()
            int r4 = r8.size()
            if (r4 != 0) goto Lbb
        L118:
            boolean r4 = r2.A()
            r10 = 58
            goto L51
        L120:
            if (r4 != 0) goto L12b
            if (r14 == 0) goto L16f
            ls1 r0 = r14.a
            int r13 = r0.b()
            goto L16f
        L12b:
            defpackage.hi2.F(r2, r7)
            throw r9
        L12f:
            int r1 = r0.x0
            int r4 = r1 % 2
            if (r4 == 0) goto L137
            r4 = r12
            goto L138
        L137:
            r4 = r11
        L138:
            if (r4 == 0) goto L141
            if (r1 == r13) goto L146
            boolean r11 = r2.A()
            goto L146
        L141:
            r1 = 58
            r2.i(r1)
        L146:
            boolean r1 = r2.d()
            if (r1 == 0) goto L16d
            if (r4 == 0) goto L166
            int r1 = r0.x0
            int r4 = r2.B
            if (r1 != r13) goto L15d
            if (r11 != 0) goto L157
            goto L166
        L157:
            java.lang.String r0 = "Unexpected leading comma"
            defpackage.u0.q(r2, r0, r4, r9, r8)
            throw r9
        L15d:
            if (r11 == 0) goto L160
            goto L166
        L160:
            java.lang.String r0 = "Expected comma after the key-value pair"
            defpackage.u0.q(r2, r0, r4, r9, r8)
            throw r9
        L166:
            int r1 = r0.x0
            int r13 = r1 + 1
            r0.x0 = r13
            goto L16f
        L16d:
            if (r11 != 0) goto L17c
        L16f:
            by7 r0 = defpackage.by7.MAP
            if (r5 == r0) goto L17b
            java.lang.Object r0 = r3.X
            int[] r0 = (int[]) r0
            int r1 = r3.B
            r0[r1] = r13
        L17b:
            return r13
        L17c:
            defpackage.hi2.F(r2, r7)
            throw r9
    }

    @Override // defpackage.yd3
    public final defpackage.de3 y() {
            r2 = this;
            zb r0 = new zb
            id3 r1 = r2.t0
            td3 r1 = r1.a
            u0 r2 = r2.v0
            r0.<init>(r1, r2)
            de3 r2 = r0.q()
            return r2
    }
}
