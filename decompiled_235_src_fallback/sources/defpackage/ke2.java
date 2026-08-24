package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ke2  reason: default package */
/* loaded from: classes.dex */
public final class ke2 {
    public int a;
    public defpackage.l21 b;
    public int c;
    public defpackage.h11 d;
    public defpackage.h11 e;
    public defpackage.h11 f;
    public defpackage.h11 g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public final /* synthetic */ defpackage.me2 r;

    public ke2(defpackage.me2 r2, int r3, defpackage.h11 r4, defpackage.h11 r5, defpackage.h11 r6, defpackage.h11 r7, int r8) {
            r1 = this;
            r1.<init>()
            r1.r = r2
            r0 = 0
            r1.b = r0
            r0 = 0
            r1.c = r0
            r1.l = r0
            r1.m = r0
            r1.n = r0
            r1.o = r0
            r1.p = r0
            r1.a = r3
            r1.d = r4
            r1.e = r5
            r1.f = r6
            r1.g = r7
            int r3 = r2.z0
            r1.h = r3
            int r3 = r2.v0
            r1.i = r3
            int r3 = r2.A0
            r1.j = r3
            int r2 = r2.w0
            r1.k = r2
            r1.q = r8
            return
    }

    public final void a(defpackage.l21 r9) {
            r8 = this;
            int r0 = r8.a
            int r1 = r8.q
            r2 = 8
            r3 = 1
            r4 = 0
            me2 r5 = r8.r
            if (r0 != 0) goto L41
            int r0 = r5.Y(r9, r1)
            k21[] r1 = r9.T
            r1 = r1[r4]
            k21 r6 = defpackage.k21.MATCH_CONSTRAINT
            if (r1 != r6) goto L1e
            int r0 = r8.p
            int r0 = r0 + r3
            r8.p = r0
            r0 = r4
        L1e:
            int r1 = r5.S0
            int r6 = r9.h0
            if (r6 != r2) goto L25
            goto L26
        L25:
            r4 = r1
        L26:
            int r1 = r8.l
            int r0 = r0 + r4
            int r0 = r0 + r1
            r8.l = r0
            int r0 = r8.q
            int r0 = r5.X(r9, r0)
            l21 r1 = r8.b
            if (r1 == 0) goto L3a
            int r1 = r8.c
            if (r1 >= r0) goto L75
        L3a:
            r8.b = r9
            r8.c = r0
            r8.m = r0
            goto L75
        L41:
            int r0 = r5.Y(r9, r1)
            int r1 = r8.q
            int r1 = r5.X(r9, r1)
            k21[] r6 = r9.T
            r6 = r6[r3]
            k21 r7 = defpackage.k21.MATCH_CONSTRAINT
            if (r6 != r7) goto L59
            int r1 = r8.p
            int r1 = r1 + r3
            r8.p = r1
            r1 = r4
        L59:
            int r5 = r5.T0
            int r6 = r9.h0
            if (r6 != r2) goto L60
            goto L61
        L60:
            r4 = r5
        L61:
            int r2 = r8.m
            int r1 = r1 + r4
            int r1 = r1 + r2
            r8.m = r1
            l21 r1 = r8.b
            if (r1 == 0) goto L6f
            int r1 = r8.c
            if (r1 >= r0) goto L75
        L6f:
            r8.b = r9
            r8.c = r0
            r8.l = r0
        L75:
            int r9 = r8.o
            int r9 = r9 + r3
            r8.o = r9
            return
    }

    public final void b(int r23, boolean r24, boolean r25) {
            r22 = this;
            r0 = r22
            int r1 = r0.o
            r2 = 0
            r3 = r2
        L6:
            me2 r4 = r0.r
            if (r3 >= r1) goto L1e
            int r5 = r0.n
            int r5 = r5 + r3
            int r6 = r4.e1
            if (r5 < r6) goto L12
            goto L1e
        L12:
            l21[] r4 = r4.d1
            r4 = r4[r5]
            if (r4 == 0) goto L1b
            r4.E()
        L1b:
            int r3 = r3 + 1
            goto L6
        L1e:
            if (r1 == 0) goto L2d3
            l21 r3 = r0.b
            if (r3 != 0) goto L26
            goto L2d3
        L26:
            if (r25 == 0) goto L2c
            if (r23 != 0) goto L2c
            r5 = 1
            goto L2d
        L2c:
            r5 = r2
        L2d:
            r6 = -1
            r7 = r2
            r8 = r6
            r9 = r8
        L31:
            if (r7 >= r1) goto L53
            if (r24 == 0) goto L39
            int r10 = r1 + (-1)
            int r10 = r10 - r7
            goto L3a
        L39:
            r10 = r7
        L3a:
            int r11 = r0.n
            int r11 = r11 + r10
            int r10 = r4.e1
            if (r11 < r10) goto L42
            goto L53
        L42:
            l21[] r10 = r4.d1
            r10 = r10[r11]
            if (r10 == 0) goto L50
            int r10 = r10.h0
            if (r10 != 0) goto L50
            if (r8 != r6) goto L4f
            r8 = r7
        L4f:
            r9 = r7
        L50:
            int r7 = r7 + 1
            goto L31
        L53:
            int r7 = r0.a
            l21 r10 = r0.b
            if (r7 != 0) goto L1ab
            int r7 = r4.H0
            r10.l0 = r7
            h11 r7 = r10.L
            h11 r12 = r10.J
            int r13 = r0.i
            if (r23 <= 0) goto L68
            int r14 = r4.T0
            int r13 = r13 + r14
        L68:
            h11 r14 = r0.e
            r12.a(r14, r13)
            if (r25 == 0) goto L76
            h11 r13 = r0.g
            int r14 = r0.k
            r7.a(r13, r14)
        L76:
            if (r23 <= 0) goto L81
            h11 r13 = r0.e
            l21 r13 = r13.d
            h11 r13 = r13.L
            r13.a(r12, r2)
        L81:
            int r13 = r4.V0
            r14 = 3
            if (r13 != r14) goto La8
            boolean r13 = r10.E
            if (r13 != 0) goto La8
            r13 = r2
        L8b:
            if (r13 >= r1) goto La8
            if (r24 == 0) goto L93
            int r15 = r1 + (-1)
            int r15 = r15 - r13
            goto L94
        L93:
            r15 = r13
        L94:
            int r11 = r0.n
            int r11 = r11 + r15
            int r15 = r4.e1
            if (r11 < r15) goto L9c
            goto La8
        L9c:
            l21[] r15 = r4.d1
            r11 = r15[r11]
            boolean r15 = r11.E
            if (r15 == 0) goto La5
            goto La9
        La5:
            int r13 = r13 + 1
            goto L8b
        La8:
            r11 = r10
        La9:
            r15 = r2
            r13 = 0
        Lab:
            if (r15 >= r1) goto L2d3
            if (r24 == 0) goto Lb6
            int r16 = r1 + (-1)
            int r16 = r16 - r15
        Lb3:
            r17 = 1
            goto Lb9
        Lb6:
            r16 = r15
            goto Lb3
        Lb9:
            int r3 = r0.n
            int r3 = r3 + r16
            int r14 = r4.e1
            if (r3 < r14) goto Lc3
            goto L2d3
        Lc3:
            l21[] r14 = r4.d1
            r3 = r14[r3]
            if (r3 != 0) goto Ld2
            r20 = r1
            r18 = r5
            r19 = r9
            r5 = 3
            goto L19e
        Ld2:
            h11 r14 = r3.J
            h11 r2 = r3.L
            h11 r6 = r3.I
            r18 = r5
            if (r15 != 0) goto Le6
            h11 r5 = r0.d
            r19 = r9
            int r9 = r0.h
            r3.f(r6, r5, r9)
            goto Le8
        Le6:
            r19 = r9
        Le8:
            if (r16 != 0) goto L120
            int r5 = r4.G0
            float r9 = r4.M0
            r16 = 1065353216(0x3f800000, float:1.0)
            if (r24 == 0) goto Lf4
            float r9 = r16 - r9
        Lf4:
            r20 = r5
            int r5 = r0.n
            if (r5 != 0) goto L10a
            int r5 = r4.I0
            r21 = r9
            r9 = -1
            if (r5 == r9) goto L10c
            float r9 = r4.O0
            if (r24 == 0) goto L11c
        L105:
            float r16 = r16 - r9
            r9 = r16
            goto L11c
        L10a:
            r21 = r9
        L10c:
            if (r25 == 0) goto L118
            int r5 = r4.K0
            r9 = -1
            if (r5 == r9) goto L118
            float r9 = r4.Q0
            if (r24 == 0) goto L11c
            goto L105
        L118:
            r5 = r20
            r9 = r21
        L11c:
            r3.k0 = r5
            r3.e0 = r9
        L120:
            int r5 = r1 + (-1)
            if (r15 != r5) goto L130
            h11 r5 = r3.K
            h11 r9 = r0.f
            r20 = r1
            int r1 = r0.j
            r3.f(r5, r9, r1)
            goto L132
        L130:
            r20 = r1
        L132:
            if (r13 == 0) goto L159
            h11 r1 = r13.K
            int r5 = r4.S0
            r6.a(r1, r5)
            if (r15 != r8) goto L147
            int r5 = r0.h
            boolean r9 = r6.h()
            if (r9 == 0) goto L147
            r6.h = r5
        L147:
            r5 = 0
            r1.a(r6, r5)
            int r9 = r19 + 1
            if (r15 != r9) goto L159
            int r5 = r0.j
            boolean r6 = r1.h()
            if (r6 == 0) goto L159
            r1.h = r5
        L159:
            if (r3 == r10) goto L19c
            int r1 = r4.V0
            r5 = 3
            if (r1 != r5) goto L173
            boolean r6 = r11.E
            if (r6 == 0) goto L173
            if (r3 == r11) goto L173
            boolean r6 = r3.E
            if (r6 == 0) goto L173
            h11 r1 = r3.M
            h11 r2 = r11.M
            r6 = 0
            r1.a(r2, r6)
            goto L19d
        L173:
            if (r1 == 0) goto L197
            r6 = r17
            if (r1 == r6) goto L192
            if (r18 == 0) goto L18a
            h11 r1 = r0.e
            int r6 = r0.i
            r14.a(r1, r6)
            h11 r1 = r0.g
            int r6 = r0.k
            r2.a(r1, r6)
            goto L19d
        L18a:
            r6 = 0
            r14.a(r12, r6)
            r2.a(r7, r6)
            goto L19d
        L192:
            r6 = 0
            r2.a(r7, r6)
            goto L19d
        L197:
            r6 = 0
            r14.a(r12, r6)
            goto L19d
        L19c:
            r5 = 3
        L19d:
            r13 = r3
        L19e:
            int r15 = r15 + 1
            r14 = r5
            r5 = r18
            r9 = r19
            r1 = r20
            r2 = 0
            r6 = -1
            goto Lab
        L1ab:
            r20 = r1
            r18 = r5
            r19 = r9
            int r1 = r4.G0
            r10.k0 = r1
            h11 r1 = r10.I
            h11 r2 = r10.K
            int r3 = r0.h
            if (r23 <= 0) goto L1c0
            int r5 = r4.S0
            int r3 = r3 + r5
        L1c0:
            if (r24 == 0) goto L1dd
            h11 r5 = r0.f
            r2.a(r5, r3)
            if (r25 == 0) goto L1d0
            h11 r3 = r0.d
            int r5 = r0.j
            r1.a(r3, r5)
        L1d0:
            if (r23 <= 0) goto L1f7
            h11 r3 = r0.f
            l21 r3 = r3.d
            h11 r3 = r3.I
            r6 = 0
            r3.a(r2, r6)
            goto L1f7
        L1dd:
            h11 r5 = r0.d
            r1.a(r5, r3)
            if (r25 == 0) goto L1eb
            h11 r3 = r0.f
            int r5 = r0.j
            r2.a(r3, r5)
        L1eb:
            if (r23 <= 0) goto L1f7
            h11 r3 = r0.d
            l21 r3 = r3.d
            h11 r3 = r3.K
            r6 = 0
            r3.a(r1, r6)
        L1f7:
            r5 = 0
            r11 = 0
        L1f9:
            r3 = r20
            if (r5 >= r3) goto L2d3
            int r6 = r0.n
            int r6 = r6 + r5
            int r7 = r4.e1
            if (r6 < r7) goto L206
            goto L2d3
        L206:
            l21[] r7 = r4.d1
            r6 = r7[r6]
            if (r6 != 0) goto L213
            r20 = r3
            r3 = -1
            r9 = 0
            r13 = 1
            goto L2cf
        L213:
            h11 r7 = r6.I
            h11 r9 = r6.J
            h11 r12 = r6.K
            if (r5 != 0) goto L246
            h11 r13 = r0.e
            int r14 = r0.i
            r6.f(r9, r13, r14)
            int r13 = r4.H0
            float r14 = r4.N0
            int r15 = r0.n
            if (r15 != 0) goto L235
            int r15 = r4.J0
            r20 = r3
            r3 = -1
            if (r15 == r3) goto L238
            float r14 = r4.P0
        L233:
            r13 = r15
            goto L241
        L235:
            r20 = r3
            r3 = -1
        L238:
            if (r25 == 0) goto L241
            int r15 = r4.L0
            if (r15 == r3) goto L241
            float r14 = r4.R0
            goto L233
        L241:
            r6.l0 = r13
            r6.f0 = r14
            goto L249
        L246:
            r20 = r3
            r3 = -1
        L249:
            int r13 = r20 + (-1)
            if (r5 != r13) goto L256
            h11 r13 = r6.L
            h11 r14 = r0.g
            int r15 = r0.k
            r6.f(r13, r14, r15)
        L256:
            if (r11 == 0) goto L27f
            h11 r11 = r11.L
            int r13 = r4.T0
            r9.a(r11, r13)
            if (r5 != r8) goto L26b
            int r13 = r0.i
            boolean r14 = r9.h()
            if (r14 == 0) goto L26b
            r9.h = r13
        L26b:
            r13 = 0
            r11.a(r9, r13)
            r17 = 1
            int r9 = r19 + 1
            if (r5 != r9) goto L27f
            int r9 = r0.k
            boolean r13 = r11.h()
            if (r13 == 0) goto L27f
            r11.h = r9
        L27f:
            if (r6 == r10) goto L29f
            int r9 = r4.U0
            r11 = 2
            if (r24 == 0) goto L2a2
            if (r9 == 0) goto L29b
            r13 = 1
            if (r9 == r13) goto L296
            if (r9 == r11) goto L28e
            goto L29f
        L28e:
            r13 = 0
            r7.a(r1, r13)
            r12.a(r2, r13)
            goto L29f
        L296:
            r13 = 0
            r7.a(r1, r13)
            goto L29f
        L29b:
            r13 = 0
            r12.a(r2, r13)
        L29f:
            r9 = 0
            r13 = 1
            goto L2ce
        L2a2:
            if (r9 == 0) goto L2c9
            r13 = 1
            if (r9 == r13) goto L2c4
            if (r9 == r11) goto L2ab
        L2a9:
            r9 = 0
            goto L2ce
        L2ab:
            if (r18 == 0) goto L2bc
            h11 r9 = r0.d
            int r11 = r0.h
            r7.a(r9, r11)
            h11 r7 = r0.f
            int r9 = r0.j
            r12.a(r7, r9)
            goto L2a9
        L2bc:
            r9 = 0
            r7.a(r1, r9)
            r12.a(r2, r9)
            goto L2ce
        L2c4:
            r9 = 0
            r12.a(r2, r9)
            goto L2ce
        L2c9:
            r9 = 0
            r13 = 1
            r7.a(r1, r9)
        L2ce:
            r11 = r6
        L2cf:
            int r5 = r5 + 1
            goto L1f9
        L2d3:
            return
    }

    public final int c() {
            r3 = this;
            int r0 = r3.a
            int r1 = r3.m
            r2 = 1
            if (r0 != r2) goto Lc
            me2 r3 = r3.r
            int r3 = r3.T0
            int r1 = r1 - r3
        Lc:
            return r1
    }

    public final int d() {
            r2 = this;
            int r0 = r2.a
            int r1 = r2.l
            if (r0 != 0) goto Lb
            me2 r2 = r2.r
            int r2 = r2.S0
            int r1 = r1 - r2
        Lb:
            return r1
    }

    public final void e(int r10) {
            r9 = this;
            int r0 = r9.p
            if (r0 != 0) goto L6
            goto Lca
        L6:
            int r1 = r9.o
            int r5 = r10 / r0
            r10 = 0
            r0 = r10
        Lc:
            me2 r2 = r9.r
            if (r0 >= r1) goto L5a
            int r3 = r9.n
            int r3 = r3 + r0
            int r4 = r2.e1
            if (r3 < r4) goto L18
            goto L5a
        L18:
            l21[] r4 = r2.d1
            r3 = r4[r3]
            int r4 = r9.a
            r6 = 1
            if (r4 != 0) goto L3c
            if (r3 == 0) goto L57
            k21[] r4 = r3.T
            r7 = r4[r10]
            k21 r8 = defpackage.k21.MATCH_CONSTRAINT
            if (r7 != r8) goto L57
            int r7 = r3.r
            if (r7 != 0) goto L57
            r7 = r4
            k21 r4 = defpackage.k21.FIXED
            r6 = r7[r6]
            int r7 = r3.l()
            r2.W(r3, r4, r5, r6, r7)
            goto L57
        L3c:
            if (r3 == 0) goto L57
            k21[] r4 = r3.T
            r6 = r4[r6]
            k21 r7 = defpackage.k21.MATCH_CONSTRAINT
            if (r6 != r7) goto L57
            int r6 = r3.s
            if (r6 != 0) goto L57
            r4 = r4[r10]
            r7 = r5
            int r5 = r3.r()
            k21 r6 = defpackage.k21.FIXED
            r2.W(r3, r4, r5, r6, r7)
            r5 = r7
        L57:
            int r0 = r0 + 1
            goto Lc
        L5a:
            r9.l = r10
            r9.m = r10
            r0 = 0
            r9.b = r0
            r9.c = r10
            int r0 = r9.o
            r1 = r10
        L66:
            if (r1 >= r0) goto Lca
            int r3 = r9.n
            int r3 = r3 + r1
            int r4 = r2.e1
            if (r3 < r4) goto L70
            goto Lca
        L70:
            l21[] r4 = r2.d1
            r3 = r4[r3]
            int r4 = r9.a
            r5 = 8
            if (r4 != 0) goto La0
            int r4 = r3.r()
            int r6 = r2.S0
            int r7 = r3.h0
            if (r7 != r5) goto L85
            r6 = r10
        L85:
            int r5 = r9.l
            int r4 = r4 + r6
            int r4 = r4 + r5
            r9.l = r4
            int r4 = r9.q
            int r4 = r2.X(r3, r4)
            l21 r5 = r9.b
            if (r5 == 0) goto L99
            int r5 = r9.c
            if (r5 >= r4) goto Lc7
        L99:
            r9.b = r3
            r9.c = r4
            r9.m = r4
            goto Lc7
        La0:
            int r4 = r9.q
            int r4 = r2.Y(r3, r4)
            int r6 = r9.q
            int r6 = r2.X(r3, r6)
            int r7 = r2.T0
            int r8 = r3.h0
            if (r8 != r5) goto Lb3
            r7 = r10
        Lb3:
            int r5 = r9.m
            int r6 = r6 + r7
            int r6 = r6 + r5
            r9.m = r6
            l21 r5 = r9.b
            if (r5 == 0) goto Lc1
            int r5 = r9.c
            if (r5 >= r4) goto Lc7
        Lc1:
            r9.b = r3
            r9.c = r4
            r9.l = r4
        Lc7:
            int r1 = r1 + 1
            goto L66
        Lca:
            return
    }

    public final void f(int r1, defpackage.h11 r2, defpackage.h11 r3, defpackage.h11 r4, defpackage.h11 r5, int r6, int r7, int r8, int r9, int r10) {
            r0 = this;
            r0.a = r1
            r0.d = r2
            r0.e = r3
            r0.f = r4
            r0.g = r5
            r0.h = r6
            r0.i = r7
            r0.j = r8
            r0.k = r9
            r0.q = r10
            return
    }
}
