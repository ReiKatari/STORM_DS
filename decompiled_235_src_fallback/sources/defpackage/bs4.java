package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bs4  reason: default package */
/* loaded from: classes.dex */
public final class bs4 {
    public java.lang.String a;
    public defpackage.s47 b;
    public defpackage.ki2 c;
    public int d;
    public boolean e;
    public int f;
    public int g;
    public long h;
    public defpackage.qh1 i;
    public defpackage.cj j;
    public boolean k;
    public long l;
    public defpackage.k64 m;
    public defpackage.as4 n;
    public defpackage.kk3 o;
    public long p;
    public int q;
    public int r;
    public long s;

    public bs4(java.lang.String r1, defpackage.s47 r2, defpackage.ki2 r3, int r4, boolean r5, int r6, int r7) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            r0.f = r6
            r0.g = r7
            long r1 = defpackage.t53.a
            r0.h = r1
            r1 = 0
            r0.l = r1
            r1 = 0
            long r1 = defpackage.s21.h(r1, r1, r1, r1)
            r0.p = r1
            r1 = -1
            r0.q = r1
            r0.r = r1
            return
    }

    public static long g(defpackage.bs4 r4, long r5, defpackage.kk3 r7) {
            s47 r0 = r4.b
            k64 r1 = r4.m
            qh1 r2 = r4.i
            r2.getClass()
            ki2 r3 = r4.c
            k64 r7 = defpackage.yh2.s(r1, r7, r0, r2, r3)
            r4.m = r7
            int r4 = r4.g
            long r4 = r7.a(r4, r5)
            return r4
    }

    public final int a(int r13, defpackage.kk3 r14) {
            r12 = this;
            int r0 = r12.q
            int r1 = r12.r
            if (r13 != r0) goto La
            r2 = -1
            if (r0 == r2) goto La
            return r1
        La:
            r0 = 2147483647(0x7fffffff, float:NaN)
            r1 = 0
            long r0 = defpackage.s21.a(r1, r13, r1, r0)
            int r2 = r12.g
            r3 = 1
            if (r2 <= r3) goto L1b
            long r0 = g(r12, r0, r14)
        L1b:
            as4 r14 = r12.e(r14)
            boolean r2 = r12.e
            int r4 = r12.d
            float r5 = r14.c()
            long r10 = defpackage.mp2.v(r0, r2, r4, r5)
            boolean r2 = r12.e
            int r9 = r12.d
            int r4 = r12.f
            if (r2 != 0) goto L40
            r2 = 2
            if (r9 != r2) goto L37
            goto L3e
        L37:
            r2 = 4
            if (r9 != r2) goto L3b
            goto L3e
        L3b:
            r2 = 5
            if (r9 != r2) goto L40
        L3e:
            r8 = r3
            goto L44
        L40:
            if (r4 >= r3) goto L43
            goto L3e
        L43:
            r8 = r4
        L44:
            cj r6 = new cj
            r7 = r14
            gj r7 = (defpackage.gj) r7
            r6.<init>(r7, r8, r9, r10)
            float r14 = r6.b()
            int r14 = defpackage.ii2.q(r14)
            int r0 = defpackage.q21.i(r0)
            if (r14 >= r0) goto L5b
            r14 = r0
        L5b:
            r12.q = r13
            r12.r = r14
            return r14
    }

    public final boolean b(long r21, defpackage.kk3 r23) {
            r20 = this;
            r0 = r20
            r1 = r23
            long r2 = r0.s
            r4 = 2
            long r2 = r2 << r4
            r5 = 3
            long r2 = r2 | r5
            r0.s = r2
            int r2 = r0.g
            r3 = 1
            if (r2 <= r3) goto L17
            long r5 = g(r20, r21, r23)
            goto L19
        L17:
            r5 = r21
        L19:
            cj r2 = r0.j
            r7 = 3
            r8 = 0
            r9 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r11 = 32
            if (r2 != 0) goto L28
            goto Lcb
        L28:
            as4 r12 = r0.n
            if (r12 != 0) goto L2e
            goto Lcb
        L2e:
            boolean r12 = r12.a()
            if (r12 == 0) goto L36
            goto Lcb
        L36:
            kk3 r12 = r0.o
            if (r1 == r12) goto L3c
            goto Lcb
        L3c:
            long r12 = r0.p
            boolean r12 = defpackage.q21.b(r5, r12)
            if (r12 == 0) goto L45
            goto L74
        L45:
            int r12 = defpackage.q21.h(r5)
            long r13 = r0.p
            int r13 = defpackage.q21.h(r13)
            if (r12 == r13) goto L53
            goto Lcb
        L53:
            int r12 = defpackage.q21.j(r5)
            long r13 = r0.p
            int r13 = defpackage.q21.j(r13)
            if (r12 == r13) goto L60
            goto Lcb
        L60:
            int r12 = defpackage.q21.g(r5)
            float r12 = (float) r12
            float r13 = r2.b()
            int r12 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r12 < 0) goto Lcb
            y37 r2 = r2.d
            boolean r2 = r2.d
            if (r2 == 0) goto L74
            goto Lcb
        L74:
            long r1 = r0.p
            boolean r1 = defpackage.q21.b(r5, r1)
            if (r1 != 0) goto Lca
            cj r1 = r0.j
            r1.getClass()
            gj r2 = r1.a
            dm3 r2 = r2.i
            float r2 = r2.c()
            float r4 = r1.d()
            float r2 = java.lang.Math.min(r2, r4)
            int r2 = defpackage.ii2.q(r2)
            float r4 = r1.b()
            int r4 = defpackage.ii2.q(r4)
            long r12 = (long) r2
            long r12 = r12 << r11
            long r14 = (long) r4
            long r14 = r14 & r9
            long r12 = r12 | r14
            long r12 = defpackage.s21.d(r5, r12)
            r0.l = r12
            int r2 = r0.d
            if (r2 != r7) goto Lad
            goto Lc5
        Lad:
            long r14 = r12 >> r11
            int r2 = (int) r14
            float r2 = (float) r2
            float r4 = r1.d()
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 < 0) goto Lc6
            long r9 = r9 & r12
            int r2 = (int) r9
            float r2 = (float) r2
            float r1 = r1.b()
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 >= 0) goto Lc5
            goto Lc6
        Lc5:
            r3 = r8
        Lc6:
            r0.k = r3
            r0.p = r5
        Lca:
            return r8
        Lcb:
            as4 r1 = r0.e(r1)
            boolean r2 = r0.e
            int r12 = r0.d
            float r13 = r1.c()
            long r18 = defpackage.mp2.v(r5, r2, r12, r13)
            boolean r2 = r0.e
            int r12 = r0.d
            int r13 = r0.f
            if (r2 != 0) goto Lf0
            if (r12 != r4) goto Le6
            goto Led
        Le6:
            r2 = 4
            if (r12 != r2) goto Lea
            goto Led
        Lea:
            r2 = 5
            if (r12 != r2) goto Lf0
        Led:
            r16 = r3
            goto Lf5
        Lf0:
            if (r13 >= r3) goto Lf3
            goto Led
        Lf3:
            r16 = r13
        Lf5:
            cj r14 = new cj
            r15 = r1
            gj r15 = (defpackage.gj) r15
            r17 = r12
            r14.<init>(r15, r16, r17, r18)
            r0.p = r5
            float r1 = r14.d()
            int r1 = defpackage.ii2.q(r1)
            float r2 = r14.b()
            int r2 = defpackage.ii2.q(r2)
            long r12 = (long) r1
            long r12 = r12 << r11
            long r1 = (long) r2
            long r1 = r1 & r9
            long r1 = r1 | r12
            long r1 = defpackage.s21.d(r5, r1)
            r0.l = r1
            int r4 = r0.d
            if (r4 != r7) goto L121
            goto L139
        L121:
            long r4 = r1 >> r11
            int r4 = (int) r4
            float r4 = (float) r4
            float r5 = r14.d()
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 < 0) goto L138
            long r1 = r1 & r9
            int r1 = (int) r1
            float r1 = (float) r1
            float r2 = r14.b()
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 >= 0) goto L139
        L138:
            r8 = r3
        L139:
            r0.k = r8
            r0.j = r14
            return r3
    }

    public final void c() {
            r3 = this;
            r0 = 0
            r3.j = r0
            r3.n = r0
            r3.o = r0
            r0 = -1
            r3.q = r0
            r3.r = r0
            r0 = 0
            long r1 = defpackage.s21.h(r0, r0, r0, r0)
            r3.p = r1
            r1 = 0
            r3.l = r1
            r3.k = r0
            return
    }

    public final void d(defpackage.qh1 r6) {
            r5 = this;
            qh1 r0 = r5.i
            if (r6 == 0) goto L13
            int r1 = defpackage.t53.b
            float r1 = r6.a()
            float r2 = r6.Y()
            long r1 = defpackage.t53.a(r1, r2)
            goto L15
        L13:
            long r1 = defpackage.t53.a
        L15:
            if (r0 != 0) goto L1c
            r5.i = r6
            r5.h = r1
            return
        L1c:
            if (r6 == 0) goto L25
            long r3 = r5.h
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L25
            return
        L25:
            r5.i = r6
            r5.h = r1
            long r0 = r5.s
            r6 = 2
            long r0 = r0 << r6
            r2 = 1
            long r0 = r0 | r2
            r5.s = r0
            r5.c()
            return
    }

    public final defpackage.as4 e(defpackage.kk3 r10) {
            r9 = this;
            as4 r0 = r9.n
            if (r0 == 0) goto Le
            kk3 r1 = r9.o
            if (r10 != r1) goto Le
            boolean r1 = r0.a()
            if (r1 == 0) goto L28
        Le:
            r9.o = r10
            java.lang.String r3 = r9.a
            s47 r0 = r9.b
            s47 r4 = defpackage.gi2.N(r0, r10)
            qh1 r8 = r9.i
            r8.getClass()
            ki2 r7 = r9.c
            gj r2 = new gj
            yt1 r5 = defpackage.yt1.A
            r6 = r5
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r0 = r2
        L28:
            r9.n = r0
            return r0
    }

    public final void f(java.lang.String r1, defpackage.s47 r2, defpackage.ki2 r3, int r4, boolean r5, int r6, int r7) {
            r0 = this;
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            r0.f = r6
            r0.g = r7
            long r1 = r0.s
            r3 = 2
            long r1 = r1 << r3
            r3 = 2
            long r1 = r1 | r3
            r0.s = r1
            r0.c()
            return
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ParagraphLayoutCache(paragraph="
            r0.<init>(r1)
            cj r1 = r3.j
            if (r1 == 0) goto Le
            java.lang.String r1 = "<paragraph>"
            goto L10
        Le:
            java.lang.String r1 = "null"
        L10:
            r0.append(r1)
            java.lang.String r1 = ", lastDensity="
            r0.append(r1)
            long r1 = r3.h
            java.lang.String r1 = defpackage.t53.b(r1)
            r0.append(r1)
            java.lang.String r1 = ", history="
            r0.append(r1)
            long r1 = r3.s
            java.lang.String r3 = ", constraints=$)"
            java.lang.String r3 = defpackage.lb1.p(r0, r1, r3)
            return r3
    }
}
