package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ls0  reason: default package */
/* loaded from: classes.dex */
public final class ls0 {
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public int d;
    public java.lang.Object e;

    public /* synthetic */ ls0(int r1) {
            r0 = this;
            r0.a = r1
            r0.<init>()
            return
    }

    public ls0(int r2, int r3, int r4, defpackage.a47 r5) {
            r1 = this;
            r0 = 4
            r1.a = r0
            r1.<init>()
            r1.b = r2
            r1.c = r3
            r1.d = r4
            r1.e = r5
            return
    }

    public ls0(defpackage.co4 r2) {
            r1 = this;
            r0 = 3
            r1.a = r0
            r1.<init>()
            r1.e = r2
            return
    }

    public ls0(defpackage.ks0 r2) {
            r1 = this;
            r0 = 0
            r1.a = r0
            r1.<init>()
            r1.d = r0
            java.nio.charset.Charset r0 = defpackage.aa3.a
            r1.e = r2
            r2.b = r1
            return
    }

    public static void W(int r0) {
            r0 = r0 & 3
            if (r0 != 0) goto L5
            return
        L5:
            ub3 r0 = defpackage.ub3.d()
            throw r0
    }

    public static void X(int r0) {
            r0 = r0 & 7
            if (r0 != 0) goto L5
            return
        L5:
            ub3 r0 = defpackage.ub3.d()
            throw r0
    }

    public void A(java.util.List r5) {
            r4 = this;
            java.lang.Object r0 = r4.e
            ks0 r0 = (defpackage.ks0) r0
            boolean r1 = r5 instanceof defpackage.a93
            int r2 = r4.b
            r3 = 2
            if (r1 == 0) goto L4c
            r1 = r5
            a93 r1 = (defpackage.a93) r1
            r5 = r2 & 7
            if (r5 == 0) goto L33
            if (r5 != r3) goto L2e
            int r5 = r0.i()
            int r2 = r0.c()
            int r2 = r2 + r5
        L1d:
            int r5 = r0.i()
            r1.b(r5)
            int r5 = r0.c()
            if (r5 < r2) goto L1d
            r4.U(r2)
            return
        L2e:
            tb3 r4 = defpackage.ub3.b()
            throw r4
        L33:
            int r5 = r0.i()
            r1.b(r5)
            boolean r5 = r0.d()
            if (r5 == 0) goto L41
            goto L86
        L41:
            int r5 = r0.l()
            int r2 = r4.b
            if (r5 == r2) goto L33
            r4.d = r5
            return
        L4c:
            r1 = r2 & 7
            if (r1 == 0) goto L75
            if (r1 != r3) goto L70
            int r1 = r0.i()
            int r2 = r0.c()
            int r2 = r2 + r1
        L5b:
            int r1 = r0.i()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r5.add(r1)
            int r1 = r0.c()
            if (r1 < r2) goto L5b
            r4.U(r2)
            return
        L70:
            tb3 r4 = defpackage.ub3.b()
            throw r4
        L75:
            int r1 = r0.i()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r5.add(r1)
            boolean r1 = r0.d()
            if (r1 == 0) goto L87
        L86:
            return
        L87:
            int r1 = r0.l()
            int r2 = r4.b
            if (r1 == r2) goto L75
            r4.d = r1
            return
    }

    public long B() {
            r2 = this;
            r0 = 0
            r2.V(r0)
            java.lang.Object r2 = r2.e
            ks0 r2 = (defpackage.ks0) r2
            long r0 = r2.j()
            return r0
    }

    public void C(java.util.List r6) {
            r5 = this;
            java.lang.Object r0 = r5.e
            ks0 r0 = (defpackage.ks0) r0
            boolean r1 = r6 instanceof defpackage.uy3
            int r2 = r5.b
            r3 = 2
            if (r1 == 0) goto L4c
            r1 = r6
            uy3 r1 = (defpackage.uy3) r1
            r6 = r2 & 7
            if (r6 == 0) goto L33
            if (r6 != r3) goto L2e
            int r6 = r0.i()
            int r2 = r0.c()
            int r2 = r2 + r6
        L1d:
            long r3 = r0.j()
            r1.b(r3)
            int r6 = r0.c()
            if (r6 < r2) goto L1d
            r5.U(r2)
            return
        L2e:
            tb3 r5 = defpackage.ub3.b()
            throw r5
        L33:
            long r2 = r0.j()
            r1.b(r2)
            boolean r6 = r0.d()
            if (r6 == 0) goto L41
            goto L86
        L41:
            int r6 = r0.l()
            int r2 = r5.b
            if (r6 == r2) goto L33
            r5.d = r6
            return
        L4c:
            r1 = r2 & 7
            if (r1 == 0) goto L75
            if (r1 != r3) goto L70
            int r1 = r0.i()
            int r2 = r0.c()
            int r2 = r2 + r1
        L5b:
            long r3 = r0.j()
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r6.add(r1)
            int r1 = r0.c()
            if (r1 < r2) goto L5b
            r5.U(r2)
            return
        L70:
            tb3 r5 = defpackage.ub3.b()
            throw r5
        L75:
            long r1 = r0.j()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r6.add(r1)
            boolean r1 = r0.d()
            if (r1 == 0) goto L87
        L86:
            return
        L87:
            int r1 = r0.l()
            int r2 = r5.b
            if (r1 == r2) goto L75
            r5.d = r1
            return
    }

    public java.lang.Object D(defpackage.j66 r5, defpackage.g82 r6) {
            r4 = this;
            java.lang.Object r0 = r4.e
            ks0 r0 = (defpackage.ks0) r0
            int r1 = r0.i()
            int r2 = r0.a
            r3 = 100
            if (r2 >= r3) goto L3a
            int r1 = r0.e(r1)
            java.lang.Object r2 = r5.j()
            int r3 = r0.a
            int r3 = r3 + 1
            r0.a = r3
            r5.d(r2, r4, r6)
            r5.a(r2)
            int r4 = r0.h
            if (r4 != 0) goto L32
            int r4 = r0.a
            int r4 = r4 + (-1)
            r0.a = r4
            r0.i = r1
            r0.m()
            return r2
        L32:
            ub3 r4 = new ub3
            java.lang.String r5 = "Protocol message end-group tag did not match expected tag."
            r4.<init>(r5)
            throw r4
        L3a:
            ub3 r4 = new ub3
            java.lang.String r5 = "Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit."
            r4.<init>(r5)
            throw r4
    }

    public java.lang.Object E(defpackage.j66 r2, defpackage.g82 r3) {
            r1 = this;
            r0 = 2
            r1.V(r0)
            java.lang.Object r1 = r1.D(r2, r3)
            return r1
    }

    public int F() {
            r1 = this;
            r0 = 5
            r1.V(r0)
            java.lang.Object r1 = r1.e
            ks0 r1 = (defpackage.ks0) r1
            int r1 = r1.g()
            return r1
    }

    public void G(java.util.List r7) {
            r6 = this;
            java.lang.Object r0 = r6.e
            ks0 r0 = (defpackage.ks0) r0
            boolean r1 = r7 instanceof defpackage.a93
            int r2 = r6.b
            r3 = 5
            r4 = 2
            if (r1 == 0) goto L4e
            r1 = r7
            a93 r1 = (defpackage.a93) r1
            r7 = r2 & 7
            if (r7 == r4) goto L33
            if (r7 != r3) goto L2e
        L15:
            int r7 = r0.g()
            r1.b(r7)
            boolean r7 = r0.d()
            if (r7 == 0) goto L23
            goto L93
        L23:
            int r7 = r0.l()
            int r2 = r6.b
            if (r7 == r2) goto L15
            r6.d = r7
            return
        L2e:
            tb3 r6 = defpackage.ub3.b()
            throw r6
        L33:
            int r6 = r0.i()
            W(r6)
            int r7 = r0.c()
            int r5 = r7 + r6
        L40:
            int r6 = r0.g()
            r1.b(r6)
            int r6 = r0.c()
            if (r6 < r5) goto L40
            goto L93
        L4e:
            r1 = r2 & 7
            if (r1 == r4) goto L76
            if (r1 != r3) goto L71
        L54:
            int r1 = r0.g()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r7.add(r1)
            boolean r1 = r0.d()
            if (r1 == 0) goto L66
            goto L93
        L66:
            int r1 = r0.l()
            int r2 = r6.b
            if (r1 == r2) goto L54
            r6.d = r1
            return
        L71:
            tb3 r6 = defpackage.ub3.b()
            throw r6
        L76:
            int r6 = r0.i()
            W(r6)
            int r1 = r0.c()
            int r1 = r1 + r6
        L82:
            int r6 = r0.g()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7.add(r6)
            int r6 = r0.c()
            if (r6 < r1) goto L82
        L93:
            return
    }

    public long H() {
            r2 = this;
            r0 = 1
            r2.V(r0)
            java.lang.Object r2 = r2.e
            ks0 r2 = (defpackage.ks0) r2
            long r0 = r2.h()
            return r0
    }

    public void I(java.util.List r6) {
            r5 = this;
            java.lang.Object r0 = r5.e
            ks0 r0 = (defpackage.ks0) r0
            boolean r1 = r6 instanceof defpackage.uy3
            int r2 = r5.b
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L4d
            r1 = r6
            uy3 r1 = (defpackage.uy3) r1
            r6 = r2 & 7
            if (r6 == r4) goto L34
            if (r6 != r3) goto L2f
            int r5 = r0.i()
            X(r5)
            int r6 = r0.c()
            int r6 = r6 + r5
        L21:
            long r2 = r0.h()
            r1.b(r2)
            int r5 = r0.c()
            if (r5 < r6) goto L21
            goto L87
        L2f:
            tb3 r5 = defpackage.ub3.b()
            throw r5
        L34:
            long r2 = r0.h()
            r1.b(r2)
            boolean r6 = r0.d()
            if (r6 == 0) goto L42
            goto L87
        L42:
            int r6 = r0.l()
            int r2 = r5.b
            if (r6 == r2) goto L34
            r5.d = r6
            return
        L4d:
            r1 = r2 & 7
            if (r1 == r4) goto L76
            if (r1 != r3) goto L71
            int r5 = r0.i()
            X(r5)
            int r1 = r0.c()
            int r1 = r1 + r5
        L5f:
            long r2 = r0.h()
            java.lang.Long r5 = java.lang.Long.valueOf(r2)
            r6.add(r5)
            int r5 = r0.c()
            if (r5 < r1) goto L5f
            goto L87
        L71:
            tb3 r5 = defpackage.ub3.b()
            throw r5
        L76:
            long r1 = r0.h()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r6.add(r1)
            boolean r1 = r0.d()
            if (r1 == 0) goto L88
        L87:
            return
        L88:
            int r1 = r0.l()
            int r2 = r5.b
            if (r1 == r2) goto L76
            r5.d = r1
            return
    }

    public int J() {
            r1 = this;
            r0 = 0
            r1.V(r0)
            java.lang.Object r1 = r1.e
            ks0 r1 = (defpackage.ks0) r1
            int r1 = r1.i()
            int r1 = defpackage.ks0.a(r1)
            return r1
    }

    public void K(java.util.List r5) {
            r4 = this;
            java.lang.Object r0 = r4.e
            ks0 r0 = (defpackage.ks0) r0
            boolean r1 = r5 instanceof defpackage.a93
            int r2 = r4.b
            r3 = 2
            if (r1 == 0) goto L54
            r1 = r5
            a93 r1 = (defpackage.a93) r1
            r5 = r2 & 7
            if (r5 == 0) goto L37
            if (r5 != r3) goto L32
            int r5 = r0.i()
            int r2 = r0.c()
            int r2 = r2 + r5
        L1d:
            int r5 = r0.i()
            int r5 = defpackage.ks0.a(r5)
            r1.b(r5)
            int r5 = r0.c()
            if (r5 < r2) goto L1d
            r4.U(r2)
            return
        L32:
            tb3 r4 = defpackage.ub3.b()
            throw r4
        L37:
            int r5 = r0.i()
            int r5 = defpackage.ks0.a(r5)
            r1.b(r5)
            boolean r5 = r0.d()
            if (r5 == 0) goto L49
            goto L96
        L49:
            int r5 = r0.l()
            int r2 = r4.b
            if (r5 == r2) goto L37
            r4.d = r5
            return
        L54:
            r1 = r2 & 7
            if (r1 == 0) goto L81
            if (r1 != r3) goto L7c
            int r1 = r0.i()
            int r2 = r0.c()
            int r2 = r2 + r1
        L63:
            int r1 = r0.i()
            int r1 = defpackage.ks0.a(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r5.add(r1)
            int r1 = r0.c()
            if (r1 < r2) goto L63
            r4.U(r2)
            return
        L7c:
            tb3 r4 = defpackage.ub3.b()
            throw r4
        L81:
            int r1 = r0.i()
            int r1 = defpackage.ks0.a(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r5.add(r1)
            boolean r1 = r0.d()
            if (r1 == 0) goto L97
        L96:
            return
        L97:
            int r1 = r0.l()
            int r2 = r4.b
            if (r1 == r2) goto L81
            r4.d = r1
            return
    }

    public long L() {
            r2 = this;
            r0 = 0
            r2.V(r0)
            java.lang.Object r2 = r2.e
            ks0 r2 = (defpackage.ks0) r2
            long r0 = r2.j()
            long r0 = defpackage.ks0.b(r0)
            return r0
    }

    public void M(java.util.List r6) {
            r5 = this;
            java.lang.Object r0 = r5.e
            ks0 r0 = (defpackage.ks0) r0
            boolean r1 = r6 instanceof defpackage.uy3
            int r2 = r5.b
            r3 = 2
            if (r1 == 0) goto L54
            r1 = r6
            uy3 r1 = (defpackage.uy3) r1
            r6 = r2 & 7
            if (r6 == 0) goto L37
            if (r6 != r3) goto L32
            int r6 = r0.i()
            int r2 = r0.c()
            int r2 = r2 + r6
        L1d:
            long r3 = r0.j()
            long r3 = defpackage.ks0.b(r3)
            r1.b(r3)
            int r6 = r0.c()
            if (r6 < r2) goto L1d
            r5.U(r2)
            return
        L32:
            tb3 r5 = defpackage.ub3.b()
            throw r5
        L37:
            long r2 = r0.j()
            long r2 = defpackage.ks0.b(r2)
            r1.b(r2)
            boolean r6 = r0.d()
            if (r6 == 0) goto L49
            goto L96
        L49:
            int r6 = r0.l()
            int r2 = r5.b
            if (r6 == r2) goto L37
            r5.d = r6
            return
        L54:
            r1 = r2 & 7
            if (r1 == 0) goto L81
            if (r1 != r3) goto L7c
            int r1 = r0.i()
            int r2 = r0.c()
            int r2 = r2 + r1
        L63:
            long r3 = r0.j()
            long r3 = defpackage.ks0.b(r3)
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r6.add(r1)
            int r1 = r0.c()
            if (r1 < r2) goto L63
            r5.U(r2)
            return
        L7c:
            tb3 r5 = defpackage.ub3.b()
            throw r5
        L81:
            long r1 = r0.j()
            long r1 = defpackage.ks0.b(r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r6.add(r1)
            boolean r1 = r0.d()
            if (r1 == 0) goto L97
        L96:
            return
        L97:
            int r1 = r0.l()
            int r2 = r5.b
            if (r1 == r2) goto L81
            r5.d = r1
            return
    }

    public java.lang.String N() {
            r5 = this;
            r0 = 2
            r5.V(r0)
            java.lang.Object r5 = r5.e
            ks0 r5 = (defpackage.ks0) r5
            int r0 = r5.i()
            if (r0 <= 0) goto L24
            int r1 = r5.d
            int r2 = r5.f
            int r1 = r1 - r2
            if (r0 > r1) goto L24
            java.lang.String r1 = new java.lang.String
            byte[] r3 = r5.c
            java.nio.charset.Charset r4 = defpackage.aa3.a
            r1.<init>(r3, r2, r0, r4)
            int r2 = r5.f
            int r2 = r2 + r0
            r5.f = r2
            return r1
        L24:
            if (r0 != 0) goto L29
            java.lang.String r5 = ""
            return r5
        L29:
            if (r0 >= 0) goto L30
            ub3 r5 = defpackage.ub3.c()
            throw r5
        L30:
            ub3 r5 = defpackage.ub3.e()
            throw r5
    }

    public void O(java.util.List r4, boolean r5) {
            r3 = this;
            java.lang.Object r0 = r3.e
            ks0 r0 = (defpackage.ks0) r0
            int r1 = r3.b
            r1 = r1 & 7
            r2 = 2
            if (r1 != r2) goto L4d
            boolean r1 = r4 instanceof defpackage.wr3
            if (r1 == 0) goto L2d
            if (r5 != 0) goto L2d
            r1 = r4
            wr3 r1 = (defpackage.wr3) r1
        L14:
            ca0 r4 = r3.k()
            r1.e(r4)
            boolean r4 = r0.d()
            if (r4 == 0) goto L22
            goto L41
        L22:
            int r4 = r0.l()
            int r5 = r3.b
            if (r4 == r5) goto L14
            r3.d = r4
            return
        L2d:
            if (r5 == 0) goto L34
            java.lang.String r1 = r3.P()
            goto L38
        L34:
            java.lang.String r1 = r3.N()
        L38:
            r4.add(r1)
            boolean r1 = r0.d()
            if (r1 == 0) goto L42
        L41:
            return
        L42:
            int r1 = r0.l()
            int r2 = r3.b
            if (r1 == r2) goto L2d
            r3.d = r1
            return
        L4d:
            tb3 r3 = defpackage.ub3.b()
            throw r3
    }

    public java.lang.String P() {
            r4 = this;
            r0 = 2
            r4.V(r0)
            java.lang.Object r4 = r4.e
            ks0 r4 = (defpackage.ks0) r4
            int r0 = r4.i()
            if (r0 <= 0) goto L23
            int r1 = r4.d
            int r2 = r4.f
            int r1 = r1 - r2
            if (r0 > r1) goto L23
            byte[] r1 = r4.c
            nj2 r3 = defpackage.xj7.a
            java.lang.String r1 = r3.m(r1, r2, r0)
            int r2 = r4.f
            int r2 = r2 + r0
            r4.f = r2
            return r1
        L23:
            if (r0 != 0) goto L28
            java.lang.String r4 = ""
            return r4
        L28:
            if (r0 > 0) goto L2f
            ub3 r4 = defpackage.ub3.c()
            throw r4
        L2f:
            ub3 r4 = defpackage.ub3.e()
            throw r4
    }

    public int Q() {
            r1 = this;
            r0 = 0
            r1.V(r0)
            java.lang.Object r1 = r1.e
            ks0 r1 = (defpackage.ks0) r1
            int r1 = r1.i()
            return r1
    }

    public void R(java.util.List r5) {
            r4 = this;
            java.lang.Object r0 = r4.e
            ks0 r0 = (defpackage.ks0) r0
            boolean r1 = r5 instanceof defpackage.a93
            int r2 = r4.b
            r3 = 2
            if (r1 == 0) goto L4c
            r1 = r5
            a93 r1 = (defpackage.a93) r1
            r5 = r2 & 7
            if (r5 == 0) goto L33
            if (r5 != r3) goto L2e
            int r5 = r0.i()
            int r2 = r0.c()
            int r2 = r2 + r5
        L1d:
            int r5 = r0.i()
            r1.b(r5)
            int r5 = r0.c()
            if (r5 < r2) goto L1d
            r4.U(r2)
            return
        L2e:
            tb3 r4 = defpackage.ub3.b()
            throw r4
        L33:
            int r5 = r0.i()
            r1.b(r5)
            boolean r5 = r0.d()
            if (r5 == 0) goto L41
            goto L86
        L41:
            int r5 = r0.l()
            int r2 = r4.b
            if (r5 == r2) goto L33
            r4.d = r5
            return
        L4c:
            r1 = r2 & 7
            if (r1 == 0) goto L75
            if (r1 != r3) goto L70
            int r1 = r0.i()
            int r2 = r0.c()
            int r2 = r2 + r1
        L5b:
            int r1 = r0.i()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r5.add(r1)
            int r1 = r0.c()
            if (r1 < r2) goto L5b
            r4.U(r2)
            return
        L70:
            tb3 r4 = defpackage.ub3.b()
            throw r4
        L75:
            int r1 = r0.i()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r5.add(r1)
            boolean r1 = r0.d()
            if (r1 == 0) goto L87
        L86:
            return
        L87:
            int r1 = r0.l()
            int r2 = r4.b
            if (r1 == r2) goto L75
            r4.d = r1
            return
    }

    public long S() {
            r2 = this;
            r0 = 0
            r2.V(r0)
            java.lang.Object r2 = r2.e
            ks0 r2 = (defpackage.ks0) r2
            long r0 = r2.j()
            return r0
    }

    public void T(java.util.List r6) {
            r5 = this;
            java.lang.Object r0 = r5.e
            ks0 r0 = (defpackage.ks0) r0
            boolean r1 = r6 instanceof defpackage.uy3
            int r2 = r5.b
            r3 = 2
            if (r1 == 0) goto L4c
            r1 = r6
            uy3 r1 = (defpackage.uy3) r1
            r6 = r2 & 7
            if (r6 == 0) goto L33
            if (r6 != r3) goto L2e
            int r6 = r0.i()
            int r2 = r0.c()
            int r2 = r2 + r6
        L1d:
            long r3 = r0.j()
            r1.b(r3)
            int r6 = r0.c()
            if (r6 < r2) goto L1d
            r5.U(r2)
            return
        L2e:
            tb3 r5 = defpackage.ub3.b()
            throw r5
        L33:
            long r2 = r0.j()
            r1.b(r2)
            boolean r6 = r0.d()
            if (r6 == 0) goto L41
            goto L86
        L41:
            int r6 = r0.l()
            int r2 = r5.b
            if (r6 == r2) goto L33
            r5.d = r6
            return
        L4c:
            r1 = r2 & 7
            if (r1 == 0) goto L75
            if (r1 != r3) goto L70
            int r1 = r0.i()
            int r2 = r0.c()
            int r2 = r2 + r1
        L5b:
            long r3 = r0.j()
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r6.add(r1)
            int r1 = r0.c()
            if (r1 < r2) goto L5b
            r5.U(r2)
            return
        L70:
            tb3 r5 = defpackage.ub3.b()
            throw r5
        L75:
            long r1 = r0.j()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r6.add(r1)
            boolean r1 = r0.d()
            if (r1 == 0) goto L87
        L86:
            return
        L87:
            int r1 = r0.l()
            int r2 = r5.b
            if (r1 == r2) goto L75
            r5.d = r1
            return
    }

    public void U(int r1) {
            r0 = this;
            java.lang.Object r0 = r0.e
            ks0 r0 = (defpackage.ks0) r0
            int r0 = r0.c()
            if (r0 != r1) goto Lb
            return
        Lb:
            ub3 r0 = defpackage.ub3.e()
            throw r0
    }

    public void V(int r1) {
            r0 = this;
            int r0 = r0.b
            r0 = r0 & 7
            if (r0 != r1) goto L7
            return
        L7:
            tb3 r0 = defpackage.ub3.b()
            throw r0
    }

    public void a(int r6, int r7) {
            r5 = this;
            if (r6 < 0) goto L3c
            if (r7 < 0) goto L36
            int r0 = r5.d
            int r1 = r0 * 2
            java.lang.Object r2 = r5.e
            int[] r2 = (int[]) r2
            r3 = 4
            if (r2 != 0) goto L18
            int[] r0 = new int[r3]
            r5.e = r0
            r2 = -1
            java.util.Arrays.fill(r0, r2)
            goto L25
        L18:
            int r4 = r2.length
            if (r1 < r4) goto L25
            int r0 = r0 * r3
            int[] r0 = new int[r0]
            r5.e = r0
            int r3 = r2.length
            r4 = 0
            java.lang.System.arraycopy(r2, r4, r0, r4, r3)
        L25:
            java.lang.Object r0 = r5.e
            int[] r0 = (int[]) r0
            r0[r1] = r6
            int r1 = r1 + 1
            r0[r1] = r7
            int r6 = r5.d
            int r6 = r6 + 1
            r5.d = r6
            return
        L36:
            java.lang.String r5 = "Pixel distance must be non-negative"
            defpackage.i.h(r5)
            return
        L3c:
            java.lang.String r5 = "Layout positions must be non-negative"
            defpackage.i.h(r5)
            return
    }

    public defpackage.da6 b(int r4) {
            r3 = this;
            da6 r0 = new da6
            java.lang.Object r3 = r3.e
            a47 r3 = (defpackage.a47) r3
            jl5 r3 = defpackage.nj2.u(r3, r4)
            r1 = 1
            r0.<init>(r3, r4, r1)
            return r0
    }

    public void c(androidx.recyclerview.widget.RecyclerView r5, boolean r6) {
            r4 = this;
            r0 = 0
            r4.d = r0
            java.lang.Object r0 = r4.e
            int[] r0 = (int[]) r0
            if (r0 == 0) goto Ld
            r1 = -1
            java.util.Arrays.fill(r0, r1)
        Ld:
            gg5 r0 = r5.m0
            wf5 r1 = r5.l0
            if (r1 == 0) goto L4b
            if (r0 == 0) goto L4b
            boolean r1 = r0.i
            if (r1 == 0) goto L4b
            if (r6 == 0) goto L2d
            z9 r1 = r5.d0
            boolean r1 = r1.j()
            if (r1 != 0) goto L3c
            wf5 r1 = r5.l0
            int r1 = r1.a()
            r0.i(r1, r4)
            goto L3c
        L2d:
            boolean r1 = r5.P()
            if (r1 != 0) goto L3c
            int r1 = r4.b
            int r2 = r4.c
            sg5 r3 = r5.d1
            r0.h(r1, r2, r3, r4)
        L3c:
            int r4 = r4.d
            int r1 = r0.j
            if (r4 <= r1) goto L4b
            r0.j = r4
            r0.k = r6
            mg5 r4 = r5.L
            r4.q()
        L4b:
            return
    }

    public int d() {
            r1 = this;
            int r0 = r1.d
            int r1 = r1.c
            int r0 = r0 - r1
            return r0
    }

    public int e() {
            r1 = this;
            int r0 = r1.d
            if (r0 == 0) goto La
            r1.b = r0
            r0 = 0
            r1.d = r0
            goto L14
        La:
            java.lang.Object r0 = r1.e
            ks0 r0 = (defpackage.ks0) r0
            int r0 = r0.l()
            r1.b = r0
        L14:
            int r0 = r1.b
            if (r0 == 0) goto L20
            int r1 = r1.c
            if (r0 != r1) goto L1d
            goto L20
        L1d:
            int r1 = r0 >>> 3
            return r1
        L20:
            r1 = 2147483647(0x7fffffff, float:NaN)
            return r1
    }

    public int f(int r2) {
            r1 = this;
            java.lang.Object r0 = r1.e
            co4 r0 = (defpackage.co4) r0
            int[] r0 = r0.e
            int r1 = r1.c
            int r1 = r1 + r2
            r1 = r0[r1]
            return r1
    }

    public java.lang.Object g(int r2) {
            r1 = this;
            java.lang.Object r0 = r1.e
            co4 r0 = (defpackage.co4) r0
            java.lang.Object[] r0 = r0.g
            int r1 = r1.d
            int r1 = r1 + r2
            r1 = r0[r1]
            return r1
    }

    public int h() {
            r0 = this;
            int r0 = r0.b
            return r0
    }

    public boolean i() {
            r1 = this;
            r0 = 0
            r1.V(r0)
            java.lang.Object r1 = r1.e
            ks0 r1 = (defpackage.ks0) r1
            boolean r1 = r1.f()
            return r1
    }

    public void j(java.util.List r5) {
            r4 = this;
            java.lang.Object r0 = r4.e
            ks0 r0 = (defpackage.ks0) r0
            boolean r1 = r5 instanceof defpackage.s50
            int r2 = r4.b
            r3 = 2
            if (r1 == 0) goto L4c
            r1 = r5
            s50 r1 = (defpackage.s50) r1
            r5 = r2 & 7
            if (r5 == 0) goto L33
            if (r5 != r3) goto L2e
            int r5 = r0.i()
            int r2 = r0.c()
            int r2 = r2 + r5
        L1d:
            boolean r5 = r0.f()
            r1.b(r5)
            int r5 = r0.c()
            if (r5 < r2) goto L1d
            r4.U(r2)
            return
        L2e:
            tb3 r4 = defpackage.ub3.b()
            throw r4
        L33:
            boolean r5 = r0.f()
            r1.b(r5)
            boolean r5 = r0.d()
            if (r5 == 0) goto L41
            goto L86
        L41:
            int r5 = r0.l()
            int r2 = r4.b
            if (r5 == r2) goto L33
            r4.d = r5
            return
        L4c:
            r1 = r2 & 7
            if (r1 == 0) goto L75
            if (r1 != r3) goto L70
            int r1 = r0.i()
            int r2 = r0.c()
            int r2 = r2 + r1
        L5b:
            boolean r1 = r0.f()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r5.add(r1)
            int r1 = r0.c()
            if (r1 < r2) goto L5b
            r4.U(r2)
            return
        L70:
            tb3 r4 = defpackage.ub3.b()
            throw r4
        L75:
            boolean r1 = r0.f()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r5.add(r1)
            boolean r1 = r0.d()
            if (r1 == 0) goto L87
        L86:
            return
        L87:
            int r1 = r0.l()
            int r2 = r4.b
            if (r1 == r2) goto L75
            r4.d = r1
            return
    }

    public defpackage.ca0 k() {
            r4 = this;
            r0 = 2
            r4.V(r0)
            java.lang.Object r4 = r4.e
            ks0 r4 = (defpackage.ks0) r4
            byte[] r0 = r4.c
            int r1 = r4.i()
            if (r1 <= 0) goto L21
            int r2 = r4.d
            int r3 = r4.f
            int r2 = r2 - r3
            if (r1 > r2) goto L21
            ca0 r0 = defpackage.ea0.c(r0, r3, r1)
            int r2 = r4.f
            int r2 = r2 + r1
            r4.f = r2
            return r0
        L21:
            if (r1 != 0) goto L26
            ca0 r4 = defpackage.ea0.B
            return r4
        L26:
            if (r1 <= 0) goto L37
            int r2 = r4.d
            int r3 = r4.f
            int r2 = r2 - r3
            if (r1 > r2) goto L37
            int r1 = r1 + r3
            r4.f = r1
            byte[] r4 = java.util.Arrays.copyOfRange(r0, r3, r1)
            goto L3d
        L37:
            if (r1 > 0) goto L4a
            if (r1 != 0) goto L45
            byte[] r4 = defpackage.aa3.b
        L3d:
            ca0 r0 = defpackage.ea0.B
            ca0 r0 = new ca0
            r0.<init>(r4)
            return r0
        L45:
            ub3 r4 = defpackage.ub3.c()
            throw r4
        L4a:
            ub3 r4 = defpackage.ub3.e()
            throw r4
    }

    public void l(java.util.List r4) {
            r3 = this;
            java.lang.Object r0 = r3.e
            ks0 r0 = (defpackage.ks0) r0
            int r1 = r3.b
            r1 = r1 & 7
            r2 = 2
            if (r1 != r2) goto L24
        Lb:
            ca0 r1 = r3.k()
            r4.add(r1)
            boolean r1 = r0.d()
            if (r1 == 0) goto L19
            return
        L19:
            int r1 = r0.l()
            int r2 = r3.b
            if (r1 == r2) goto Lb
            r3.d = r1
            return
        L24:
            tb3 r3 = defpackage.ub3.b()
            throw r3
    }

    public double m() {
            r2 = this;
            r0 = 1
            r2.V(r0)
            java.lang.Object r2 = r2.e
            ks0 r2 = (defpackage.ks0) r2
            long r0 = r2.h()
            double r0 = java.lang.Double.longBitsToDouble(r0)
            return r0
    }

    public void n(java.util.List r6) {
            r5 = this;
            java.lang.Object r0 = r5.e
            ks0 r0 = (defpackage.ks0) r0
            boolean r1 = r6 instanceof defpackage.cm1
            int r2 = r5.b
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L55
            r1 = r6
            cm1 r1 = (defpackage.cm1) r1
            r6 = r2 & 7
            if (r6 == r4) goto L38
            if (r6 != r3) goto L33
            int r5 = r0.i()
            X(r5)
            int r6 = r0.c()
            int r6 = r6 + r5
        L21:
            long r2 = r0.h()
            double r2 = java.lang.Double.longBitsToDouble(r2)
            r1.b(r2)
            int r5 = r0.c()
            if (r5 < r6) goto L21
            goto L97
        L33:
            tb3 r5 = defpackage.ub3.b()
            throw r5
        L38:
            long r2 = r0.h()
            double r2 = java.lang.Double.longBitsToDouble(r2)
            r1.b(r2)
            boolean r6 = r0.d()
            if (r6 == 0) goto L4a
            goto L97
        L4a:
            int r6 = r0.l()
            int r2 = r5.b
            if (r6 == r2) goto L38
            r5.d = r6
            return
        L55:
            r1 = r2 & 7
            if (r1 == r4) goto L82
            if (r1 != r3) goto L7d
            int r5 = r0.i()
            X(r5)
            int r1 = r0.c()
            int r1 = r1 + r5
        L67:
            long r2 = r0.h()
            double r2 = java.lang.Double.longBitsToDouble(r2)
            java.lang.Double r5 = java.lang.Double.valueOf(r2)
            r6.add(r5)
            int r5 = r0.c()
            if (r5 < r1) goto L67
            goto L97
        L7d:
            tb3 r5 = defpackage.ub3.b()
            throw r5
        L82:
            long r1 = r0.h()
            double r1 = java.lang.Double.longBitsToDouble(r1)
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            r6.add(r1)
            boolean r1 = r0.d()
            if (r1 == 0) goto L98
        L97:
            return
        L98:
            int r1 = r0.l()
            int r2 = r5.b
            if (r1 == r2) goto L82
            r5.d = r1
            return
    }

    public int o() {
            r1 = this;
            r0 = 0
            r1.V(r0)
            java.lang.Object r1 = r1.e
            ks0 r1 = (defpackage.ks0) r1
            int r1 = r1.i()
            return r1
    }

    public void p(java.util.List r5) {
            r4 = this;
            java.lang.Object r0 = r4.e
            ks0 r0 = (defpackage.ks0) r0
            boolean r1 = r5 instanceof defpackage.a93
            int r2 = r4.b
            r3 = 2
            if (r1 == 0) goto L4c
            r1 = r5
            a93 r1 = (defpackage.a93) r1
            r5 = r2 & 7
            if (r5 == 0) goto L33
            if (r5 != r3) goto L2e
            int r5 = r0.i()
            int r2 = r0.c()
            int r2 = r2 + r5
        L1d:
            int r5 = r0.i()
            r1.b(r5)
            int r5 = r0.c()
            if (r5 < r2) goto L1d
            r4.U(r2)
            return
        L2e:
            tb3 r4 = defpackage.ub3.b()
            throw r4
        L33:
            int r5 = r0.i()
            r1.b(r5)
            boolean r5 = r0.d()
            if (r5 == 0) goto L41
            goto L86
        L41:
            int r5 = r0.l()
            int r2 = r4.b
            if (r5 == r2) goto L33
            r4.d = r5
            return
        L4c:
            r1 = r2 & 7
            if (r1 == 0) goto L75
            if (r1 != r3) goto L70
            int r1 = r0.i()
            int r2 = r0.c()
            int r2 = r2 + r1
        L5b:
            int r1 = r0.i()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r5.add(r1)
            int r1 = r0.c()
            if (r1 < r2) goto L5b
            r4.U(r2)
            return
        L70:
            tb3 r4 = defpackage.ub3.b()
            throw r4
        L75:
            int r1 = r0.i()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r5.add(r1)
            boolean r1 = r0.d()
            if (r1 == 0) goto L87
        L86:
            return
        L87:
            int r1 = r0.l()
            int r2 = r4.b
            if (r1 == r2) goto L75
            r4.d = r1
            return
    }

    public int q() {
            r1 = this;
            r0 = 5
            r1.V(r0)
            java.lang.Object r1 = r1.e
            ks0 r1 = (defpackage.ks0) r1
            int r1 = r1.g()
            return r1
    }

    public void r(java.util.List r7) {
            r6 = this;
            java.lang.Object r0 = r6.e
            ks0 r0 = (defpackage.ks0) r0
            boolean r1 = r7 instanceof defpackage.a93
            int r2 = r6.b
            r3 = 5
            r4 = 2
            if (r1 == 0) goto L4e
            r1 = r7
            a93 r1 = (defpackage.a93) r1
            r7 = r2 & 7
            if (r7 == r4) goto L33
            if (r7 != r3) goto L2e
        L15:
            int r7 = r0.g()
            r1.b(r7)
            boolean r7 = r0.d()
            if (r7 == 0) goto L23
            goto L93
        L23:
            int r7 = r0.l()
            int r2 = r6.b
            if (r7 == r2) goto L15
            r6.d = r7
            return
        L2e:
            tb3 r6 = defpackage.ub3.b()
            throw r6
        L33:
            int r6 = r0.i()
            W(r6)
            int r7 = r0.c()
            int r5 = r7 + r6
        L40:
            int r6 = r0.g()
            r1.b(r6)
            int r6 = r0.c()
            if (r6 < r5) goto L40
            goto L93
        L4e:
            r1 = r2 & 7
            if (r1 == r4) goto L76
            if (r1 != r3) goto L71
        L54:
            int r1 = r0.g()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r7.add(r1)
            boolean r1 = r0.d()
            if (r1 == 0) goto L66
            goto L93
        L66:
            int r1 = r0.l()
            int r2 = r6.b
            if (r1 == r2) goto L54
            r6.d = r1
            return
        L71:
            tb3 r6 = defpackage.ub3.b()
            throw r6
        L76:
            int r6 = r0.i()
            W(r6)
            int r1 = r0.c()
            int r1 = r1 + r6
        L82:
            int r6 = r0.g()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7.add(r6)
            int r6 = r0.c()
            if (r6 < r1) goto L82
        L93:
            return
    }

    public long s() {
            r2 = this;
            r0 = 1
            r2.V(r0)
            java.lang.Object r2 = r2.e
            ks0 r2 = (defpackage.ks0) r2
            long r0 = r2.h()
            return r0
    }

    public void t(java.util.List r6) {
            r5 = this;
            java.lang.Object r0 = r5.e
            ks0 r0 = (defpackage.ks0) r0
            boolean r1 = r6 instanceof defpackage.uy3
            int r2 = r5.b
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L4d
            r1 = r6
            uy3 r1 = (defpackage.uy3) r1
            r6 = r2 & 7
            if (r6 == r4) goto L34
            if (r6 != r3) goto L2f
            int r5 = r0.i()
            X(r5)
            int r6 = r0.c()
            int r6 = r6 + r5
        L21:
            long r2 = r0.h()
            r1.b(r2)
            int r5 = r0.c()
            if (r5 < r6) goto L21
            goto L87
        L2f:
            tb3 r5 = defpackage.ub3.b()
            throw r5
        L34:
            long r2 = r0.h()
            r1.b(r2)
            boolean r6 = r0.d()
            if (r6 == 0) goto L42
            goto L87
        L42:
            int r6 = r0.l()
            int r2 = r5.b
            if (r6 == r2) goto L34
            r5.d = r6
            return
        L4d:
            r1 = r2 & 7
            if (r1 == r4) goto L76
            if (r1 != r3) goto L71
            int r5 = r0.i()
            X(r5)
            int r1 = r0.c()
            int r1 = r1 + r5
        L5f:
            long r2 = r0.h()
            java.lang.Long r5 = java.lang.Long.valueOf(r2)
            r6.add(r5)
            int r5 = r0.c()
            if (r5 < r1) goto L5f
            goto L87
        L71:
            tb3 r5 = defpackage.ub3.b()
            throw r5
        L76:
            long r1 = r0.h()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r6.add(r1)
            boolean r1 = r0.d()
            if (r1 == 0) goto L88
        L87:
            return
        L88:
            int r1 = r0.l()
            int r2 = r5.b
            if (r1 == r2) goto L76
            r5.d = r1
            return
    }

    public java.lang.String toString() {
            r4 = this;
            int r0 = r4.a
            switch(r0) {
                case 1: goto L48;
                case 4: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r4 = super.toString()
            return r4
        La:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "SelectionInfo(id=1, range=("
            r0.<init>(r1)
            int r1 = r4.b
            r0.append(r1)
            r2 = 45
            r0.append(r2)
            java.lang.Object r3 = r4.e
            a47 r3 = (defpackage.a47) r3
            jl5 r1 = defpackage.nj2.u(r3, r1)
            r0.append(r1)
            r1 = 44
            r0.append(r1)
            int r1 = r4.c
            r0.append(r1)
            r0.append(r2)
            jl5 r1 = defpackage.nj2.u(r3, r1)
            r0.append(r1)
            java.lang.String r1 = "), prevOffset="
            r0.append(r1)
            int r4 = r4.d
            r1 = 41
            java.lang.String r4 = defpackage.xg6.q(r0, r4, r1)
            return r4
        L48:
            java.lang.String r4 = ""
            return r4
    }

    public float u() {
            r1 = this;
            r0 = 5
            r1.V(r0)
            java.lang.Object r1 = r1.e
            ks0 r1 = (defpackage.ks0) r1
            int r1 = r1.g()
            float r1 = java.lang.Float.intBitsToFloat(r1)
            return r1
    }

    public void v(java.util.List r7) {
            r6 = this;
            java.lang.Object r0 = r6.e
            ks0 r0 = (defpackage.ks0) r0
            boolean r1 = r7 instanceof defpackage.zd2
            int r2 = r6.b
            r3 = 5
            r4 = 2
            if (r1 == 0) goto L57
            r1 = r7
            zd2 r1 = (defpackage.zd2) r1
            r7 = r2 & 7
            if (r7 == r4) goto L38
            if (r7 != r3) goto L33
        L15:
            int r7 = r0.g()
            float r7 = java.lang.Float.intBitsToFloat(r7)
            r1.b(r7)
            boolean r7 = r0.d()
            if (r7 == 0) goto L28
            goto La4
        L28:
            int r7 = r0.l()
            int r2 = r6.b
            if (r7 == r2) goto L15
            r6.d = r7
            return
        L33:
            tb3 r6 = defpackage.ub3.b()
            throw r6
        L38:
            int r6 = r0.i()
            W(r6)
            int r7 = r0.c()
            int r5 = r7 + r6
        L45:
            int r6 = r0.g()
            float r6 = java.lang.Float.intBitsToFloat(r6)
            r1.b(r6)
            int r6 = r0.c()
            if (r6 < r5) goto L45
            goto La4
        L57:
            r1 = r2 & 7
            if (r1 == r4) goto L83
            if (r1 != r3) goto L7e
        L5d:
            int r1 = r0.g()
            float r1 = java.lang.Float.intBitsToFloat(r1)
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r7.add(r1)
            boolean r1 = r0.d()
            if (r1 == 0) goto L73
            goto La4
        L73:
            int r1 = r0.l()
            int r2 = r6.b
            if (r1 == r2) goto L5d
            r6.d = r1
            return
        L7e:
            tb3 r6 = defpackage.ub3.b()
            throw r6
        L83:
            int r6 = r0.i()
            W(r6)
            int r1 = r0.c()
            int r1 = r1 + r6
        L8f:
            int r6 = r0.g()
            float r6 = java.lang.Float.intBitsToFloat(r6)
            java.lang.Float r6 = java.lang.Float.valueOf(r6)
            r7.add(r6)
            int r6 = r0.c()
            if (r6 < r1) goto L8f
        La4:
            return
    }

    public java.lang.Object w(defpackage.j66 r3, defpackage.g82 r4) {
            r2 = this;
            int r0 = r2.c
            int r1 = r2.b
            int r1 = r1 >>> 3
            int r1 = r1 << 3
            r1 = r1 | 4
            r2.c = r1
            java.lang.Object r1 = r3.j()     // Catch: java.lang.Throwable -> L24
            r3.d(r1, r2, r4)     // Catch: java.lang.Throwable -> L24
            r3.a(r1)     // Catch: java.lang.Throwable -> L24
            int r3 = r2.b     // Catch: java.lang.Throwable -> L24
            int r4 = r2.c     // Catch: java.lang.Throwable -> L24
            if (r3 != r4) goto L1f
            r2.c = r0
            return r1
        L1f:
            ub3 r3 = defpackage.ub3.d()     // Catch: java.lang.Throwable -> L24
            throw r3     // Catch: java.lang.Throwable -> L24
        L24:
            r3 = move-exception
            r2.c = r0
            throw r3
    }

    public java.lang.Object x(defpackage.j66 r2, defpackage.g82 r3) {
            r1 = this;
            r0 = 3
            r1.V(r0)
            java.lang.Object r1 = r1.w(r2, r3)
            return r1
    }

    public void y(java.util.List r5, defpackage.j66 r6, defpackage.g82 r7) {
            r4 = this;
            java.lang.Object r0 = r4.e
            ks0 r0 = (defpackage.ks0) r0
            int r1 = r4.b
            r2 = r1 & 7
            r3 = 3
            if (r2 != r3) goto L26
        Lb:
            java.lang.Object r2 = r4.w(r6, r7)
            r5.add(r2)
            boolean r2 = r0.d()
            if (r2 != 0) goto L25
            int r2 = r4.d
            if (r2 == 0) goto L1d
            goto L25
        L1d:
            int r2 = r0.l()
            if (r2 == r1) goto Lb
            r4.d = r2
        L25:
            return
        L26:
            tb3 r4 = defpackage.ub3.b()
            throw r4
    }

    public int z() {
            r1 = this;
            r0 = 0
            r1.V(r0)
            java.lang.Object r1 = r1.e
            ks0 r1 = (defpackage.ks0) r1
            int r1 = r1.i()
            return r1
    }
}
