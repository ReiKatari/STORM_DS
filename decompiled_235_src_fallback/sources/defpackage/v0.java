package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: v0  reason: default package */
/* loaded from: classes.dex */
public abstract class v0 implements defpackage.yd3, defpackage.sc1, defpackage.ux0 {
    public final java.util.ArrayList A;
    public boolean B;
    public final defpackage.id3 L;
    public final java.lang.String R;
    public final defpackage.td3 X;

    public v0(defpackage.id3 r2, java.lang.String r3) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.A = r0
            r1.L = r2
            r1.R = r3
            td3 r2 = r2.a
            r1.X = r2
            return
    }

    @Override // defpackage.ux0
    public final java.lang.String A(defpackage.wb6 r1, int r2) {
            r0 = this;
            r1.getClass()
            java.lang.String r1 = r0.D(r1, r2)
            java.lang.String r0 = r0.w(r1)
            return r0
    }

    @Override // defpackage.sc1
    public final int B() {
            r1 = this;
            java.lang.Object r0 = r1.K()
            int r1 = r1.r(r0)
            return r1
    }

    @Override // defpackage.ux0
    public final short C(defpackage.t25 r1, int r2) {
            r0 = this;
            r1.getClass()
            java.lang.String r1 = r0.D(r1, r2)
            short r0 = r0.u(r1)
            return r0
    }

    public final java.lang.String D(defpackage.wb6 r1, int r2) {
            r0 = this;
            r1.getClass()
            java.lang.String r1 = r0.x(r1, r2)
            r1.getClass()
            java.util.ArrayList r0 = r0.A
            java.lang.Object r0 = defpackage.gt0.R0(r0)
            java.lang.String r0 = (java.lang.String) r0
            return r1
    }

    public abstract defpackage.de3 E();

    @Override // defpackage.sc1
    public final defpackage.sc1 F(defpackage.wb6 r4) {
            r3 = this;
            r4.getClass()
            java.util.ArrayList r0 = r3.A
            java.lang.Object r0 = defpackage.gt0.R0(r0)
            if (r0 == 0) goto L14
            java.lang.Object r0 = r3.K()
            sc1 r3 = r3.o(r0, r4)
            return r3
        L14:
            ff3 r0 = new ff3
            de3 r1 = r3.E()
            java.lang.String r2 = r3.R
            id3 r3 = r3.L
            r0.<init>(r3, r1, r2)
            sc1 r3 = r0.F(r4)
            return r3
    }

    @Override // defpackage.ux0
    public final java.lang.Object G(defpackage.wb6 r1, int r2, defpackage.gg3 r3, java.lang.Object r4) {
            r0 = this;
            r1.getClass()
            r3.getClass()
            java.lang.String r1 = r0.D(r1, r2)
            java.util.ArrayList r2 = r0.A
            r2.add(r1)
            r3.getClass()
            java.lang.Object r1 = r0.k(r3)
            boolean r2 = r0.B
            if (r2 != 0) goto L1d
            r0.K()
        L1d:
            r2 = 0
            r0.B = r2
            return r1
    }

    @Override // defpackage.ux0
    public final int H(defpackage.wb6 r1, int r2) {
            r0 = this;
            r1.getClass()
            java.lang.String r1 = r0.D(r1, r2)
            int r0 = r0.r(r1)
            return r0
    }

    @Override // defpackage.sc1
    public final java.lang.String I() {
            r1 = this;
            java.lang.Object r0 = r1.K()
            java.lang.String r1 = r1.w(r0)
            return r1
    }

    @Override // defpackage.sc1
    public final int J(defpackage.wb6 r6) {
            r5 = this;
            r6.getClass()
            java.lang.Object r0 = r5.K()
            java.lang.String r0 = (java.lang.String) r0
            r0.getClass()
            de3 r1 = r5.d(r0)
            java.lang.String r2 = r6.a()
            boolean r3 = r1 instanceof defpackage.df3
            id3 r4 = r5.L
            if (r3 != 0) goto L72
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r3 = "Expected "
            r6.<init>(r3)
            java.lang.Class<df3> r3 = defpackage.df3.class
            ar0 r3 = defpackage.gh5.a(r3)
            java.lang.String r3 = r3.c()
            r6.append(r3)
            java.lang.String r3 = ", but had "
            r6.append(r3)
            java.lang.Class r3 = r1.getClass()
            ar0 r3 = defpackage.gh5.a(r3)
            java.lang.String r3 = r3.c()
            r6.append(r3)
            java.lang.String r3 = " as the serialized body of "
            r6.append(r3)
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            java.lang.String r5 = r5.O(r0)
            td3 r0 = r4.a
            boolean r0 = r0.g
            r2 = -1
            r3 = 0
            if (r0 == 0) goto L67
            java.lang.String r0 = r1.toString()
            java.lang.CharSequence r0 = defpackage.hi2.H(r2, r0)
            java.lang.String r0 = r0.toString()
            goto L68
        L67:
            r0 = r3
        L68:
            ae3 r1 = new ae3
            java.lang.String r5 = defpackage.hi2.x(r6, r5, r2, r3, r0)
            r1.<init>(r5)
            throw r1
        L72:
            df3 r1 = (defpackage.df3) r1
            java.lang.String r5 = r1.a()
            java.lang.String r0 = ""
            int r5 = defpackage.te3.b(r6, r4, r5, r0)
            return r5
    }

    public final java.lang.Object K() {
            r2 = this;
            java.util.ArrayList r0 = r2.A
            int r1 = defpackage.hf.U(r0)
            java.lang.Object r0 = r0.remove(r1)
            r1 = 1
            r2.B = r1
            return r0
    }

    @Override // defpackage.sc1
    public final long L() {
            r2 = this;
            java.lang.Object r0 = r2.K()
            long r0 = r2.s(r0)
            return r0
    }

    @Override // defpackage.sc1
    public boolean M() {
            r0 = this;
            de3 r0 = r0.f()
            boolean r0 = r0 instanceof defpackage.ue3
            r0 = r0 ^ 1
            return r0
    }

    public final java.lang.String N() {
            r6 = this;
            java.util.ArrayList r0 = r6.A
            boolean r6 = r0.isEmpty()
            if (r6 == 0) goto Lb
            java.lang.String r6 = "$"
            return r6
        Lb:
            r4 = 0
            r5 = 60
            java.lang.String r1 = "."
            java.lang.String r2 = "$."
            r3 = 0
            java.lang.String r6 = defpackage.gt0.P0(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public final java.lang.String O(java.lang.String r2) {
            r1 = this;
            r2.getClass()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r1.N()
            r0.append(r1)
            r1 = 46
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = r0.toString()
            return r1
    }

    @Override // defpackage.ux0
    public final java.lang.Object P(defpackage.wb6 r1, int r2, defpackage.gg3 r3, java.lang.Object r4) {
            r0 = this;
            r1.getClass()
            r3.getClass()
            java.lang.String r1 = r0.D(r1, r2)
            java.util.ArrayList r2 = r0.A
            r2.add(r1)
            wb6 r1 = r3.e()
            boolean r1 = r1.c()
            if (r1 != 0) goto L22
            boolean r1 = r0.M()
            if (r1 == 0) goto L20
            goto L22
        L20:
            r1 = 0
            goto L26
        L22:
            java.lang.Object r1 = r0.k(r3)
        L26:
            boolean r2 = r0.B
            if (r2 != 0) goto L2d
            r0.K()
        L2d:
            r2 = 0
            r0.B = r2
            return r1
    }

    public final void Q(defpackage.df3 r3, java.lang.String r4, java.lang.String r5) {
            r2 = this;
            r0 = 0
            java.lang.String r1 = "i"
            boolean r0 = defpackage.xs6.g0(r4, r1, r0)
            if (r0 == 0) goto L10
            java.lang.String r0 = "an "
        Lb:
            java.lang.String r4 = r0.concat(r4)
            goto L13
        L10:
            java.lang.String r0 = "a "
            goto Lb
        L13:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Failed to parse literal '"
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r3 = "' as "
            r0.append(r3)
            r0.append(r4)
            java.lang.String r3 = " value"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r4 = r2.O(r5)
            id3 r5 = r2.L
            td3 r5 = r5.a
            boolean r5 = r5.g
            r0 = -1
            r1 = 0
            if (r5 == 0) goto L4d
            de3 r2 = r2.f()
            java.lang.String r2 = r2.toString()
            java.lang.CharSequence r2 = defpackage.hi2.H(r0, r2)
            java.lang.String r2 = r2.toString()
            goto L4e
        L4d:
            r2 = r1
        L4e:
            ae3 r5 = new ae3
            java.lang.String r2 = defpackage.hi2.x(r3, r4, r0, r1, r2)
            r5.<init>(r2)
            throw r5
    }

    @Override // defpackage.yd3
    public final defpackage.id3 S() {
            r0 = this;
            id3 r0 = r0.L
            return r0
    }

    @Override // defpackage.ux0
    public final boolean W(defpackage.wb6 r1, int r2) {
            r0 = this;
            r1.getClass()
            java.lang.String r1 = r0.D(r1, r2)
            boolean r0 = r0.i(r1)
            return r0
    }

    @Override // defpackage.sc1
    public final byte Y() {
            r1 = this;
            java.lang.Object r0 = r1.K()
            byte r1 = r1.j(r0)
            return r1
    }

    @Override // defpackage.sc1
    public final short Z() {
            r1 = this;
            java.lang.Object r0 = r1.K()
            short r1 = r1.u(r0)
            return r1
    }

    public void a(defpackage.wb6 r1) {
            r0 = this;
            r1.getClass()
            return
    }

    @Override // defpackage.ux0
    public final defpackage.jd1 b() {
            r0 = this;
            id3 r0 = r0.L
            jd1 r0 = r0.b
            return r0
    }

    @Override // defpackage.sc1
    public final float b0() {
            r1 = this;
            java.lang.Object r0 = r1.K()
            float r1 = r1.n(r0)
            return r1
    }

    @Override // defpackage.sc1
    public defpackage.ux0 c(defpackage.wb6 r12) {
            r11 = this;
            r12.getClass()
            de3 r0 = r11.f()
            np2 r1 = r12.e()
            bt6 r2 = defpackage.bt6.f
            boolean r2 = defpackage.nb3.k(r1, r2)
            id3 r3 = r11.L
            r4 = -1
            java.lang.String r5 = " as the serialized body of "
            java.lang.String r6 = ", but had "
            java.lang.String r7 = "Expected "
            r8 = 0
            if (r2 != 0) goto L10e
            boolean r2 = r1 instanceof defpackage.dz4
            if (r2 == 0) goto L23
            goto L10e
        L23:
            bt6 r2 = defpackage.bt6.g
            boolean r1 = defpackage.nb3.k(r1, r2)
            java.lang.Class<ye3> r2 = defpackage.ye3.class
            if (r1 == 0) goto Lac
            r1 = 0
            wb6 r1 = r12.j(r1)
            jd1 r9 = r3.b
            wb6 r1 = defpackage.js7.b(r1, r9)
            np2 r9 = r1.e()
            boolean r10 = r9 instanceof defpackage.v25
            if (r10 != 0) goto L4e
            bc6 r10 = defpackage.bc6.e
            boolean r9 = defpackage.nb3.k(r9, r10)
            if (r9 == 0) goto L49
            goto L4e
        L49:
            le3 r11 = defpackage.hi2.b(r1)
            throw r11
        L4e:
            mf3 r1 = new mf3
            java.lang.String r12 = r12.a()
            boolean r9 = r0 instanceof defpackage.ye3
            if (r9 != 0) goto La6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r7)
            ar0 r2 = defpackage.gh5.a(r2)
            java.lang.String r2 = r2.c()
            r1.append(r2)
            r1.append(r6)
            java.lang.Class r2 = r0.getClass()
            ar0 r2 = defpackage.gh5.a(r2)
            java.lang.String r2 = r2.c()
            r1.append(r2)
            r1.append(r5)
            r1.append(r12)
            java.lang.String r12 = r1.toString()
            java.lang.String r11 = r11.N()
            td3 r1 = r3.a
            boolean r1 = r1.g
            if (r1 == 0) goto L9b
            java.lang.String r0 = r0.toString()
            java.lang.CharSequence r0 = defpackage.hi2.H(r4, r0)
            java.lang.String r0 = r0.toString()
            goto L9c
        L9b:
            r0 = r8
        L9c:
            ae3 r1 = new ae3
            java.lang.String r11 = defpackage.hi2.x(r12, r11, r4, r8, r0)
            r1.<init>(r11)
            throw r1
        La6:
            ye3 r0 = (defpackage.ye3) r0
            r1.<init>(r3, r0)
            return r1
        Lac:
            kf3 r1 = new kf3
            java.lang.String r12 = r12.a()
            boolean r9 = r0 instanceof defpackage.ye3
            if (r9 != 0) goto L104
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r7)
            ar0 r2 = defpackage.gh5.a(r2)
            java.lang.String r2 = r2.c()
            r1.append(r2)
            r1.append(r6)
            java.lang.Class r2 = r0.getClass()
            ar0 r2 = defpackage.gh5.a(r2)
            java.lang.String r2 = r2.c()
            r1.append(r2)
            r1.append(r5)
            r1.append(r12)
            java.lang.String r12 = r1.toString()
            java.lang.String r11 = r11.N()
            td3 r1 = r3.a
            boolean r1 = r1.g
            if (r1 == 0) goto Lf9
            java.lang.String r0 = r0.toString()
            java.lang.CharSequence r0 = defpackage.hi2.H(r4, r0)
            java.lang.String r0 = r0.toString()
            goto Lfa
        Lf9:
            r0 = r8
        Lfa:
            ae3 r1 = new ae3
            java.lang.String r11 = defpackage.hi2.x(r12, r11, r4, r8, r0)
            r1.<init>(r11)
            throw r1
        L104:
            ye3 r0 = (defpackage.ye3) r0
            java.lang.String r11 = r11.R
            r12 = 8
            r1.<init>(r3, r0, r11, r12)
            return r1
        L10e:
            lf3 r1 = new lf3
            java.lang.String r12 = r12.a()
            boolean r2 = r0 instanceof defpackage.nd3
            if (r2 != 0) goto L168
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r7)
            java.lang.Class<nd3> r2 = defpackage.nd3.class
            ar0 r2 = defpackage.gh5.a(r2)
            java.lang.String r2 = r2.c()
            r1.append(r2)
            r1.append(r6)
            java.lang.Class r2 = r0.getClass()
            ar0 r2 = defpackage.gh5.a(r2)
            java.lang.String r2 = r2.c()
            r1.append(r2)
            r1.append(r5)
            r1.append(r12)
            java.lang.String r12 = r1.toString()
            java.lang.String r11 = r11.N()
            td3 r1 = r3.a
            boolean r1 = r1.g
            if (r1 == 0) goto L15d
            java.lang.String r0 = r0.toString()
            java.lang.CharSequence r0 = defpackage.hi2.H(r4, r0)
            java.lang.String r0 = r0.toString()
            goto L15e
        L15d:
            r0 = r8
        L15e:
            ae3 r1 = new ae3
            java.lang.String r11 = defpackage.hi2.x(r12, r11, r4, r8, r0)
            r1.<init>(r11)
            throw r1
        L168:
            nd3 r0 = (defpackage.nd3) r0
            r1.<init>(r3, r0)
            return r1
    }

    @Override // defpackage.ux0
    public final long c0(defpackage.wb6 r1, int r2) {
            r0 = this;
            r1.getClass()
            java.lang.String r1 = r0.D(r1, r2)
            long r0 = r0.s(r1)
            return r0
    }

    public abstract defpackage.de3 d(java.lang.String r1);

    @Override // defpackage.ux0
    public final defpackage.sc1 e(defpackage.t25 r2, int r3) {
            r1 = this;
            r2.getClass()
            java.lang.String r0 = r1.D(r2, r3)
            wb6 r2 = r2.j(r3)
            sc1 r1 = r1.o(r0, r2)
            return r1
    }

    @Override // defpackage.sc1
    public final double e0() {
            r2 = this;
            java.lang.Object r0 = r2.K()
            double r0 = r2.m(r0)
            return r0
    }

    public final defpackage.de3 f() {
            r1 = this;
            java.util.ArrayList r0 = r1.A
            java.lang.Object r0 = defpackage.gt0.R0(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L12
            de3 r0 = r1.d(r0)
            if (r0 != 0) goto L11
            goto L12
        L11:
            return r0
        L12:
            de3 r1 = r1.E()
            return r1
    }

    @Override // defpackage.sc1
    public final boolean g() {
            r1 = this;
            java.lang.Object r0 = r1.K()
            boolean r1 = r1.i(r0)
            return r1
    }

    @Override // defpackage.sc1
    public final char h() {
            r1 = this;
            java.lang.Object r0 = r1.K()
            char r1 = r1.l(r0)
            return r1
    }

    public final boolean i(java.lang.Object r5) {
            r4 = this;
            java.lang.String r5 = (java.lang.String) r5
            r5.getClass()
            java.lang.String r0 = "boolean"
            de3 r1 = r4.d(r5)
            boolean r2 = r1 instanceof defpackage.df3
            r3 = 0
            if (r2 != 0) goto L66
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Expected "
            r0.<init>(r2)
            java.lang.Class<df3> r2 = defpackage.df3.class
            ar0 r2 = defpackage.gh5.a(r2)
            java.lang.String r2 = r2.c()
            r0.append(r2)
            java.lang.String r2 = ", but had "
            r0.append(r2)
            java.lang.Class r2 = r1.getClass()
            ar0 r2 = defpackage.gh5.a(r2)
            java.lang.String r2 = r2.c()
            r0.append(r2)
            java.lang.String r2 = " as the serialized body of boolean"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r5 = r4.O(r5)
            id3 r4 = r4.L
            td3 r4 = r4.a
            boolean r4 = r4.g
            r2 = -1
            if (r4 == 0) goto L5b
            java.lang.String r4 = r1.toString()
            java.lang.CharSequence r4 = defpackage.hi2.H(r2, r4)
            java.lang.String r4 = r4.toString()
            goto L5c
        L5b:
            r4 = r3
        L5c:
            ae3 r1 = new ae3
            java.lang.String r4 = defpackage.hi2.x(r0, r5, r2, r3, r4)
            r1.<init>(r4)
            throw r1
        L66:
            df3 r1 = (defpackage.df3) r1
            java.lang.Boolean r2 = defpackage.fe3.d(r1)     // Catch: java.lang.IllegalArgumentException -> L77
            if (r2 == 0) goto L73
            boolean r4 = r2.booleanValue()
            return r4
        L73:
            r4.Q(r1, r0, r5)     // Catch: java.lang.IllegalArgumentException -> L77
            throw r3     // Catch: java.lang.IllegalArgumentException -> L77
        L77:
            r4.Q(r1, r0, r5)
            throw r3
    }

    public final byte j(java.lang.Object r9) {
            r8 = this;
            java.lang.String r9 = (java.lang.String) r9
            r9.getClass()
            java.lang.String r0 = "byte"
            de3 r1 = r8.d(r9)
            boolean r2 = r1 instanceof defpackage.df3
            r3 = 0
            if (r2 != 0) goto L66
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Expected "
            r0.<init>(r2)
            java.lang.Class<df3> r2 = defpackage.df3.class
            ar0 r2 = defpackage.gh5.a(r2)
            java.lang.String r2 = r2.c()
            r0.append(r2)
            java.lang.String r2 = ", but had "
            r0.append(r2)
            java.lang.Class r2 = r1.getClass()
            ar0 r2 = defpackage.gh5.a(r2)
            java.lang.String r2 = r2.c()
            r0.append(r2)
            java.lang.String r2 = " as the serialized body of byte"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r9 = r8.O(r9)
            id3 r8 = r8.L
            td3 r8 = r8.a
            boolean r8 = r8.g
            r2 = -1
            if (r8 == 0) goto L5b
            java.lang.String r8 = r1.toString()
            java.lang.CharSequence r8 = defpackage.hi2.H(r2, r8)
            java.lang.String r8 = r8.toString()
            goto L5c
        L5b:
            r8 = r3
        L5c:
            ae3 r1 = new ae3
            java.lang.String r8 = defpackage.hi2.x(r0, r9, r2, r3, r8)
            r1.<init>(r8)
            throw r1
        L66:
            df3 r1 = (defpackage.df3) r1
            long r4 = defpackage.fe3.i(r1)     // Catch: java.lang.IllegalArgumentException -> L8b
            r6 = -128(0xffffffffffffff80, double:NaN)
            int r2 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r2 > 0) goto L7f
            r6 = 127(0x7f, double:6.27E-322)
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 > 0) goto L7f
            int r2 = (int) r4     // Catch: java.lang.IllegalArgumentException -> L8b
            byte r2 = (byte) r2     // Catch: java.lang.IllegalArgumentException -> L8b
            java.lang.Byte r2 = java.lang.Byte.valueOf(r2)     // Catch: java.lang.IllegalArgumentException -> L8b
            goto L80
        L7f:
            r2 = r3
        L80:
            if (r2 == 0) goto L87
            byte r8 = r2.byteValue()
            return r8
        L87:
            r8.Q(r1, r0, r9)     // Catch: java.lang.IllegalArgumentException -> L8b
            throw r3     // Catch: java.lang.IllegalArgumentException -> L8b
        L8b:
            r8.Q(r1, r0, r9)
            throw r3
    }

    @Override // defpackage.sc1
    public final java.lang.Object k(defpackage.gg3 r8) {
            r7 = this;
            r8.getClass()
            boolean r0 = r8 instanceof defpackage.fz4
            if (r0 == 0) goto Lc3
            id3 r0 = r7.L
            td3 r1 = r0.a
            r1 = r8
            fz4 r1 = (defpackage.fz4) r1
            wb6 r2 = r1.e()
            java.lang.String r2 = defpackage.uj2.r(r0, r2)
            de3 r3 = r7.f()
            wb6 r1 = r1.e()
            java.lang.String r1 = r1.a()
            boolean r4 = r3 instanceof defpackage.ye3
            r5 = -1
            r6 = 0
            if (r4 != 0) goto L7e
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r2 = "Expected "
            r8.<init>(r2)
            java.lang.Class<ye3> r2 = defpackage.ye3.class
            ar0 r2 = defpackage.gh5.a(r2)
            java.lang.String r2 = r2.c()
            r8.append(r2)
            java.lang.String r2 = ", but had "
            r8.append(r2)
            java.lang.Class r2 = r3.getClass()
            ar0 r2 = defpackage.gh5.a(r2)
            java.lang.String r2 = r2.c()
            r8.append(r2)
            java.lang.String r2 = " as the serialized body of "
            r8.append(r2)
            r8.append(r1)
            java.lang.String r8 = r8.toString()
            java.lang.String r7 = r7.N()
            td3 r0 = r0.a
            boolean r0 = r0.g
            if (r0 == 0) goto L73
            java.lang.String r0 = r3.toString()
            java.lang.CharSequence r0 = defpackage.hi2.H(r5, r0)
            java.lang.String r0 = r0.toString()
            goto L74
        L73:
            r0 = r6
        L74:
            ae3 r1 = new ae3
            java.lang.String r7 = defpackage.hi2.x(r8, r7, r5, r6, r0)
            r1.<init>(r7)
            throw r1
        L7e:
            ye3 r3 = (defpackage.ye3) r3
            java.lang.Object r1 = r3.get(r2)
            de3 r1 = (defpackage.de3) r1
            if (r1 == 0) goto L96
            df3 r1 = defpackage.fe3.h(r1)
            boolean r2 = r1 instanceof defpackage.ue3
            if (r2 == 0) goto L91
            goto L96
        L91:
            java.lang.String r1 = r1.a()
            goto L97
        L96:
            r1 = r6
        L97:
            fz4 r8 = (defpackage.fz4) r8     // Catch: defpackage.fc6 -> L9d
            defpackage.xk2.g(r8, r7, r1)     // Catch: defpackage.fc6 -> L9d
            throw r6     // Catch: defpackage.fc6 -> L9d
        L9d:
            r7 = move-exception
            java.lang.String r7 = r7.getMessage()
            r7.getClass()
            td3 r8 = r0.a
            boolean r8 = r8.g
            if (r8 == 0) goto Lb8
            java.lang.String r8 = r3.toString()
            java.lang.CharSequence r8 = defpackage.hi2.H(r5, r8)
            java.lang.String r8 = r8.toString()
            goto Lb9
        Lb8:
            r8 = r6
        Lb9:
            ae3 r0 = new ae3
            java.lang.String r7 = defpackage.hi2.x(r7, r6, r5, r6, r8)
            r0.<init>(r7)
            throw r0
        Lc3:
            java.lang.Object r7 = r8.c(r7)
            return r7
    }

    public final char l(java.lang.Object r6) {
            r5 = this;
            java.lang.String r6 = (java.lang.String) r6
            r6.getClass()
            de3 r0 = r5.d(r6)
            boolean r1 = r0 instanceof defpackage.df3
            r2 = 0
            if (r1 != 0) goto L64
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Expected "
            r1.<init>(r3)
            java.lang.Class<df3> r3 = defpackage.df3.class
            ar0 r3 = defpackage.gh5.a(r3)
            java.lang.String r3 = r3.c()
            r1.append(r3)
            java.lang.String r3 = ", but had "
            r1.append(r3)
            java.lang.Class r3 = r0.getClass()
            ar0 r3 = defpackage.gh5.a(r3)
            java.lang.String r3 = r3.c()
            r1.append(r3)
            java.lang.String r3 = " as the serialized body of char"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.String r6 = r5.O(r6)
            id3 r5 = r5.L
            td3 r5 = r5.a
            boolean r5 = r5.g
            r3 = -1
            if (r5 == 0) goto L59
            java.lang.String r5 = r0.toString()
            java.lang.CharSequence r5 = defpackage.hi2.H(r3, r5)
            java.lang.String r5 = r5.toString()
            goto L5a
        L59:
            r5 = r2
        L5a:
            ae3 r0 = new ae3
            java.lang.String r5 = defpackage.hi2.x(r1, r6, r3, r2, r5)
            r0.<init>(r5)
            throw r0
        L64:
            df3 r0 = (defpackage.df3) r0
            java.lang.String r1 = r0.a()     // Catch: java.lang.IllegalArgumentException -> L8c
            r1.getClass()     // Catch: java.lang.IllegalArgumentException -> L8c
            int r3 = r1.length()     // Catch: java.lang.IllegalArgumentException -> L8c
            if (r3 == 0) goto L84
            r4 = 1
            if (r3 != r4) goto L7c
            r3 = 0
            char r5 = r1.charAt(r3)     // Catch: java.lang.IllegalArgumentException -> L8c
            return r5
        L7c:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch: java.lang.IllegalArgumentException -> L8c
            java.lang.String r3 = "Char sequence has more than one element."
            r1.<init>(r3)     // Catch: java.lang.IllegalArgumentException -> L8c
            throw r1     // Catch: java.lang.IllegalArgumentException -> L8c
        L84:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException     // Catch: java.lang.IllegalArgumentException -> L8c
            java.lang.String r3 = "Char sequence is empty."
            r1.<init>(r3)     // Catch: java.lang.IllegalArgumentException -> L8c
            throw r1     // Catch: java.lang.IllegalArgumentException -> L8c
        L8c:
            java.lang.String r1 = "char"
            r5.Q(r0, r1, r6)
            throw r2
    }

    public final double m(java.lang.Object r10) {
            r9 = this;
            java.lang.String r10 = (java.lang.String) r10
            r10.getClass()
            de3 r0 = r9.d(r10)
            boolean r1 = r0 instanceof defpackage.df3
            id3 r2 = r9.L
            r3 = -1
            r4 = 0
            if (r1 != 0) goto L64
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r5 = "Expected "
            r1.<init>(r5)
            java.lang.Class<df3> r5 = defpackage.df3.class
            ar0 r5 = defpackage.gh5.a(r5)
            java.lang.String r5 = r5.c()
            r1.append(r5)
            java.lang.String r5 = ", but had "
            r1.append(r5)
            java.lang.Class r5 = r0.getClass()
            ar0 r5 = defpackage.gh5.a(r5)
            java.lang.String r5 = r5.c()
            r1.append(r5)
            java.lang.String r5 = " as the serialized body of double"
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            java.lang.String r9 = r9.O(r10)
            td3 r10 = r2.a
            boolean r10 = r10.g
            if (r10 == 0) goto L59
            java.lang.String r10 = r0.toString()
            java.lang.CharSequence r10 = defpackage.hi2.H(r3, r10)
            java.lang.String r10 = r10.toString()
            goto L5a
        L59:
            r10 = r4
        L5a:
            ae3 r0 = new ae3
            java.lang.String r9 = defpackage.hi2.x(r1, r9, r3, r4, r10)
            r0.<init>(r9)
            throw r0
        L64:
            df3 r0 = (defpackage.df3) r0
            l53 r1 = defpackage.fe3.a     // Catch: java.lang.IllegalArgumentException -> Lac
            java.lang.String r1 = r0.a()     // Catch: java.lang.IllegalArgumentException -> Lac
            double r0 = java.lang.Double.parseDouble(r1)     // Catch: java.lang.IllegalArgumentException -> Lac
            td3 r5 = r2.a
            double r5 = java.lang.Math.abs(r0)
            r7 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 > 0) goto L80
            return r0
        L80:
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            java.lang.String r10 = defpackage.hi2.I(r0, r10)
            td3 r0 = r2.a
            boolean r0 = r0.g
            if (r0 == 0) goto L9f
            de3 r9 = r9.f()
            java.lang.String r9 = r9.toString()
            java.lang.CharSequence r9 = defpackage.hi2.H(r3, r9)
            java.lang.String r9 = r9.toString()
            goto La0
        L9f:
            r9 = r4
        La0:
            ae3 r0 = new ae3
            java.lang.String r1 = "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'"
            java.lang.String r9 = defpackage.hi2.x(r10, r4, r3, r1, r9)
            r0.<init>(r9)
            throw r0
        Lac:
            java.lang.String r1 = "double"
            r9.Q(r0, r1, r10)
            throw r4
    }

    public final float n(java.lang.Object r7) {
            r6 = this;
            java.lang.String r7 = (java.lang.String) r7
            r7.getClass()
            de3 r0 = r6.d(r7)
            boolean r1 = r0 instanceof defpackage.df3
            id3 r2 = r6.L
            r3 = -1
            r4 = 0
            if (r1 != 0) goto L64
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r5 = "Expected "
            r1.<init>(r5)
            java.lang.Class<df3> r5 = defpackage.df3.class
            ar0 r5 = defpackage.gh5.a(r5)
            java.lang.String r5 = r5.c()
            r1.append(r5)
            java.lang.String r5 = ", but had "
            r1.append(r5)
            java.lang.Class r5 = r0.getClass()
            ar0 r5 = defpackage.gh5.a(r5)
            java.lang.String r5 = r5.c()
            r1.append(r5)
            java.lang.String r5 = " as the serialized body of float"
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            java.lang.String r6 = r6.O(r7)
            td3 r7 = r2.a
            boolean r7 = r7.g
            if (r7 == 0) goto L59
            java.lang.String r7 = r0.toString()
            java.lang.CharSequence r7 = defpackage.hi2.H(r3, r7)
            java.lang.String r7 = r7.toString()
            goto L5a
        L59:
            r7 = r4
        L5a:
            ae3 r0 = new ae3
            java.lang.String r6 = defpackage.hi2.x(r1, r6, r3, r4, r7)
            r0.<init>(r6)
            throw r0
        L64:
            df3 r0 = (defpackage.df3) r0
            l53 r1 = defpackage.fe3.a     // Catch: java.lang.IllegalArgumentException -> Laa
            java.lang.String r1 = r0.a()     // Catch: java.lang.IllegalArgumentException -> Laa
            float r0 = java.lang.Float.parseFloat(r1)     // Catch: java.lang.IllegalArgumentException -> Laa
            td3 r1 = r2.a
            float r1 = java.lang.Math.abs(r0)
            r5 = 2139095039(0x7f7fffff, float:3.4028235E38)
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 > 0) goto L7e
            return r0
        L7e:
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.lang.String r7 = defpackage.hi2.I(r0, r7)
            td3 r0 = r2.a
            boolean r0 = r0.g
            if (r0 == 0) goto L9d
            de3 r6 = r6.f()
            java.lang.String r6 = r6.toString()
            java.lang.CharSequence r6 = defpackage.hi2.H(r3, r6)
            java.lang.String r6 = r6.toString()
            goto L9e
        L9d:
            r6 = r4
        L9e:
            ae3 r0 = new ae3
            java.lang.String r1 = "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'"
            java.lang.String r6 = defpackage.hi2.x(r7, r4, r3, r1, r6)
            r0.<init>(r6)
            throw r0
        Laa:
            java.lang.String r1 = "float"
            r6.Q(r0, r1, r7)
            throw r4
    }

    public final defpackage.sc1 o(java.lang.Object r5, defpackage.wb6 r6) {
            r4 = this;
            java.lang.String r5 = (java.lang.String) r5
            r5.getClass()
            r6.getClass()
            boolean r0 = defpackage.is6.a(r6)
            if (r0 == 0) goto L84
            de3 r0 = r4.d(r5)
            java.lang.String r6 = r6.a()
            boolean r1 = r0 instanceof defpackage.df3
            id3 r2 = r4.L
            if (r1 != 0) goto L74
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Expected "
            r1.<init>(r3)
            java.lang.Class<df3> r3 = defpackage.df3.class
            ar0 r3 = defpackage.gh5.a(r3)
            java.lang.String r3 = r3.c()
            r1.append(r3)
            java.lang.String r3 = ", but had "
            r1.append(r3)
            java.lang.Class r3 = r0.getClass()
            ar0 r3 = defpackage.gh5.a(r3)
            java.lang.String r3 = r3.c()
            r1.append(r3)
            java.lang.String r3 = " as the serialized body of "
            r1.append(r3)
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            java.lang.String r4 = r4.O(r5)
            td3 r5 = r2.a
            boolean r5 = r5.g
            r1 = -1
            r2 = 0
            if (r5 == 0) goto L69
            java.lang.String r5 = r0.toString()
            java.lang.CharSequence r5 = defpackage.hi2.H(r1, r5)
            java.lang.String r5 = r5.toString()
            goto L6a
        L69:
            r5 = r2
        L6a:
            ae3 r0 = new ae3
            java.lang.String r4 = defpackage.hi2.x(r6, r4, r1, r2, r5)
            r0.<init>(r4)
            throw r0
        L74:
            df3 r0 = (defpackage.df3) r0
            java.lang.String r4 = r0.a()
            ns6 r4 = defpackage.np2.i(r2, r4)
            zd3 r5 = new zd3
            r5.<init>(r4, r2)
            return r5
        L84:
            java.util.ArrayList r6 = r4.A
            r6.add(r5)
            return r4
    }

    @Override // defpackage.ux0
    public final float p(defpackage.wb6 r1, int r2) {
            r0 = this;
            r1.getClass()
            java.lang.String r1 = r0.D(r1, r2)
            float r0 = r0.n(r1)
            return r0
    }

    public final int r(java.lang.Object r9) {
            r8 = this;
            java.lang.String r9 = (java.lang.String) r9
            r9.getClass()
            java.lang.String r0 = "int"
            de3 r1 = r8.d(r9)
            boolean r2 = r1 instanceof defpackage.df3
            r3 = 0
            if (r2 != 0) goto L66
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Expected "
            r0.<init>(r2)
            java.lang.Class<df3> r2 = defpackage.df3.class
            ar0 r2 = defpackage.gh5.a(r2)
            java.lang.String r2 = r2.c()
            r0.append(r2)
            java.lang.String r2 = ", but had "
            r0.append(r2)
            java.lang.Class r2 = r1.getClass()
            ar0 r2 = defpackage.gh5.a(r2)
            java.lang.String r2 = r2.c()
            r0.append(r2)
            java.lang.String r2 = " as the serialized body of int"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r9 = r8.O(r9)
            id3 r8 = r8.L
            td3 r8 = r8.a
            boolean r8 = r8.g
            r2 = -1
            if (r8 == 0) goto L5b
            java.lang.String r8 = r1.toString()
            java.lang.CharSequence r8 = defpackage.hi2.H(r2, r8)
            java.lang.String r8 = r8.toString()
            goto L5c
        L5b:
            r8 = r3
        L5c:
            ae3 r1 = new ae3
            java.lang.String r8 = defpackage.hi2.x(r0, r9, r2, r3, r8)
            r1.<init>(r8)
            throw r1
        L66:
            df3 r1 = (defpackage.df3) r1
            long r4 = defpackage.fe3.i(r1)     // Catch: java.lang.IllegalArgumentException -> L8c
            r6 = -2147483648(0xffffffff80000000, double:NaN)
            int r2 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r2 > 0) goto L80
            r6 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 > 0) goto L80
            int r2 = (int) r4     // Catch: java.lang.IllegalArgumentException -> L8c
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.IllegalArgumentException -> L8c
            goto L81
        L80:
            r2 = r3
        L81:
            if (r2 == 0) goto L88
            int r8 = r2.intValue()
            return r8
        L88:
            r8.Q(r1, r0, r9)     // Catch: java.lang.IllegalArgumentException -> L8c
            throw r3     // Catch: java.lang.IllegalArgumentException -> L8c
        L8c:
            r8.Q(r1, r0, r9)
            throw r3
    }

    public final long s(java.lang.Object r5) {
            r4 = this;
            java.lang.String r5 = (java.lang.String) r5
            r5.getClass()
            de3 r0 = r4.d(r5)
            boolean r1 = r0 instanceof defpackage.df3
            r2 = 0
            if (r1 != 0) goto L64
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Expected "
            r1.<init>(r3)
            java.lang.Class<df3> r3 = defpackage.df3.class
            ar0 r3 = defpackage.gh5.a(r3)
            java.lang.String r3 = r3.c()
            r1.append(r3)
            java.lang.String r3 = ", but had "
            r1.append(r3)
            java.lang.Class r3 = r0.getClass()
            ar0 r3 = defpackage.gh5.a(r3)
            java.lang.String r3 = r3.c()
            r1.append(r3)
            java.lang.String r3 = " as the serialized body of long"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.String r5 = r4.O(r5)
            id3 r4 = r4.L
            td3 r4 = r4.a
            boolean r4 = r4.g
            r3 = -1
            if (r4 == 0) goto L59
            java.lang.String r4 = r0.toString()
            java.lang.CharSequence r4 = defpackage.hi2.H(r3, r4)
            java.lang.String r4 = r4.toString()
            goto L5a
        L59:
            r4 = r2
        L5a:
            ae3 r0 = new ae3
            java.lang.String r4 = defpackage.hi2.x(r1, r5, r3, r2, r4)
            r0.<init>(r4)
            throw r0
        L64:
            df3 r0 = (defpackage.df3) r0
            long r4 = defpackage.fe3.i(r0)     // Catch: java.lang.IllegalArgumentException -> L6b
            return r4
        L6b:
            java.lang.String r1 = "long"
            r4.Q(r0, r1, r5)
            throw r2
    }

    @Override // defpackage.ux0
    public final double t(defpackage.t25 r1, int r2) {
            r0 = this;
            r1.getClass()
            java.lang.String r1 = r0.D(r1, r2)
            double r0 = r0.m(r1)
            return r0
    }

    public final short u(java.lang.Object r9) {
            r8 = this;
            java.lang.String r9 = (java.lang.String) r9
            r9.getClass()
            java.lang.String r0 = "short"
            de3 r1 = r8.d(r9)
            boolean r2 = r1 instanceof defpackage.df3
            r3 = 0
            if (r2 != 0) goto L66
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Expected "
            r0.<init>(r2)
            java.lang.Class<df3> r2 = defpackage.df3.class
            ar0 r2 = defpackage.gh5.a(r2)
            java.lang.String r2 = r2.c()
            r0.append(r2)
            java.lang.String r2 = ", but had "
            r0.append(r2)
            java.lang.Class r2 = r1.getClass()
            ar0 r2 = defpackage.gh5.a(r2)
            java.lang.String r2 = r2.c()
            r0.append(r2)
            java.lang.String r2 = " as the serialized body of short"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r9 = r8.O(r9)
            id3 r8 = r8.L
            td3 r8 = r8.a
            boolean r8 = r8.g
            r2 = -1
            if (r8 == 0) goto L5b
            java.lang.String r8 = r1.toString()
            java.lang.CharSequence r8 = defpackage.hi2.H(r2, r8)
            java.lang.String r8 = r8.toString()
            goto L5c
        L5b:
            r8 = r3
        L5c:
            ae3 r1 = new ae3
            java.lang.String r8 = defpackage.hi2.x(r0, r9, r2, r3, r8)
            r1.<init>(r8)
            throw r1
        L66:
            df3 r1 = (defpackage.df3) r1
            long r4 = defpackage.fe3.i(r1)     // Catch: java.lang.IllegalArgumentException -> L8b
            r6 = -32768(0xffffffffffff8000, double:NaN)
            int r2 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r2 > 0) goto L7f
            r6 = 32767(0x7fff, double:1.6189E-319)
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 > 0) goto L7f
            int r2 = (int) r4     // Catch: java.lang.IllegalArgumentException -> L8b
            short r2 = (short) r2     // Catch: java.lang.IllegalArgumentException -> L8b
            java.lang.Short r2 = java.lang.Short.valueOf(r2)     // Catch: java.lang.IllegalArgumentException -> L8b
            goto L80
        L7f:
            r2 = r3
        L80:
            if (r2 == 0) goto L87
            short r8 = r2.shortValue()
            return r8
        L87:
            r8.Q(r1, r0, r9)     // Catch: java.lang.IllegalArgumentException -> L8b
            throw r3     // Catch: java.lang.IllegalArgumentException -> L8b
        L8b:
            r8.Q(r1, r0, r9)
            throw r3
    }

    @Override // defpackage.ux0
    public final char v(defpackage.t25 r1, int r2) {
            r0 = this;
            r1.getClass()
            java.lang.String r1 = r0.D(r1, r2)
            char r0 = r0.l(r1)
            return r0
    }

    public final java.lang.String w(java.lang.Object r7) {
            r6 = this;
            java.lang.String r7 = (java.lang.String) r7
            r7.getClass()
            de3 r0 = r6.d(r7)
            boolean r1 = r0 instanceof defpackage.df3
            id3 r2 = r6.L
            r3 = -1
            r4 = 0
            if (r1 != 0) goto L64
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r5 = "Expected "
            r1.<init>(r5)
            java.lang.Class<df3> r5 = defpackage.df3.class
            ar0 r5 = defpackage.gh5.a(r5)
            java.lang.String r5 = r5.c()
            r1.append(r5)
            java.lang.String r5 = ", but had "
            r1.append(r5)
            java.lang.Class r5 = r0.getClass()
            ar0 r5 = defpackage.gh5.a(r5)
            java.lang.String r5 = r5.c()
            r1.append(r5)
            java.lang.String r5 = " as the serialized body of string"
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            java.lang.String r6 = r6.O(r7)
            td3 r7 = r2.a
            boolean r7 = r7.g
            if (r7 == 0) goto L59
            java.lang.String r7 = r0.toString()
            java.lang.CharSequence r7 = defpackage.hi2.H(r3, r7)
            java.lang.String r7 = r7.toString()
            goto L5a
        L59:
            r7 = r4
        L5a:
            ae3 r0 = new ae3
            java.lang.String r6 = defpackage.hi2.x(r1, r6, r3, r4, r7)
            r0.<init>(r6)
            throw r0
        L64:
            df3 r0 = (defpackage.df3) r0
            boolean r1 = r0 instanceof defpackage.qe3
            if (r1 != 0) goto L98
            java.lang.String r0 = "Expected string value for a non-null key '"
            java.lang.String r1 = "', got null literal instead"
            java.lang.String r0 = defpackage.lb1.A(r0, r7, r1)
            java.lang.String r7 = r6.O(r7)
            td3 r1 = r2.a
            boolean r1 = r1.g
            if (r1 == 0) goto L8c
            de3 r6 = r6.f()
            java.lang.String r6 = r6.toString()
            java.lang.CharSequence r6 = defpackage.hi2.H(r3, r6)
            java.lang.String r4 = r6.toString()
        L8c:
            ae3 r6 = new ae3
            java.lang.String r1 = "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value."
            java.lang.String r7 = defpackage.hi2.x(r0, r7, r3, r1, r4)
            r6.<init>(r7)
            throw r6
        L98:
            qe3 r0 = (defpackage.qe3) r0
            boolean r1 = r0.A
            if (r1 != 0) goto Lce
            td3 r0 = r2.a
            java.lang.String r0 = "String literal for value of key '"
            java.lang.String r1 = "' should be quoted"
            java.lang.String r0 = defpackage.lb1.A(r0, r7, r1)
            java.lang.String r7 = r6.O(r7)
            td3 r1 = r2.a
            boolean r1 = r1.g
            if (r1 == 0) goto Lc2
            de3 r6 = r6.f()
            java.lang.String r6 = r6.toString()
            java.lang.CharSequence r6 = defpackage.hi2.H(r3, r6)
            java.lang.String r4 = r6.toString()
        Lc2:
            ae3 r6 = new ae3
            java.lang.String r1 = "Use 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON."
            java.lang.String r7 = defpackage.hi2.x(r0, r7, r3, r1, r4)
            r6.<init>(r7)
            throw r6
        Lce:
            java.lang.String r6 = r0.B
            return r6
    }

    public java.lang.String x(defpackage.wb6 r1, int r2) {
            r0 = this;
            r1.getClass()
            java.lang.String r0 = r1.g(r2)
            return r0
    }

    @Override // defpackage.yd3
    public final defpackage.de3 y() {
            r0 = this;
            de3 r0 = r0.f()
            return r0
    }

    @Override // defpackage.ux0
    public final byte z(defpackage.t25 r1, int r2) {
            r0 = this;
            r1.getClass()
            java.lang.String r1 = r0.D(r1, r2)
            byte r0 = r0.j(r1)
            return r0
    }
}
