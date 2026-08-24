package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: y84  reason: default package */
/* loaded from: classes.dex */
public final class y84 {
    public defpackage.fp a;
    public defpackage.ki2 b;
    public int c;
    public boolean d;
    public int e;
    public int f;
    public java.util.List g;
    public defpackage.k64 h;
    public long i;
    public defpackage.qh1 j;
    public defpackage.s47 k;
    public defpackage.s9 l;
    public defpackage.kk3 m;
    public defpackage.a47 n;
    public int o;
    public int p;
    public long q;

    public y84(defpackage.fp r1, defpackage.s47 r2, defpackage.ki2 r3, int r4, boolean r5, int r6, int r7, java.util.List r8) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r3
            r0.c = r4
            r0.d = r5
            r0.e = r6
            r0.f = r7
            r0.g = r8
            long r3 = defpackage.t53.a
            r0.i = r3
            r0.k = r2
            r1 = -1
            r0.o = r1
            r0.p = r1
            return
    }

    public final int a(int r7, defpackage.kk3 r8) {
            r6 = this;
            int r0 = r6.o
            int r1 = r6.p
            if (r7 != r0) goto La
            r2 = -1
            if (r0 == r2) goto La
            return r1
        La:
            r0 = 2147483647(0x7fffffff, float:NaN)
            r1 = 0
            long r0 = defpackage.s21.a(r1, r7, r1, r0)
            int r2 = r6.f
            r3 = 1
            if (r2 <= r3) goto L2e
            k64 r2 = r6.h
            s47 r3 = r6.k
            qh1 r4 = r6.j
            r4.getClass()
            ki2 r5 = r6.b
            k64 r2 = defpackage.yh2.s(r2, r8, r3, r4, r5)
            r6.h = r2
            int r3 = r6.f
            long r0 = r2.a(r3, r0)
        L2e:
            v84 r8 = r6.b(r0, r8)
            float r8 = r8.e
            int r8 = defpackage.ii2.q(r8)
            int r0 = defpackage.q21.i(r0)
            if (r8 >= r0) goto L3f
            r8 = r0
        L3f:
            r6.o = r7
            r6.p = r8
            return r8
    }

    public final defpackage.v84 b(long r7, defpackage.kk3 r9) {
            r6 = this;
            s9 r1 = r6.e(r9)
            v84 r0 = new v84
            boolean r9 = r6.d
            int r2 = r6.c
            float r3 = r1.c()
            long r2 = defpackage.mp2.v(r7, r9, r2, r3)
            boolean r7 = r6.d
            int r5 = r6.c
            int r6 = r6.e
            r8 = 1
            if (r7 != 0) goto L28
            r7 = 2
            if (r5 != r7) goto L1f
            goto L26
        L1f:
            r7 = 4
            if (r5 != r7) goto L23
            goto L26
        L23:
            r7 = 5
            if (r5 != r7) goto L28
        L26:
            r4 = r8
            goto L2c
        L28:
            if (r6 >= r8) goto L2b
            goto L26
        L2b:
            r4 = r6
        L2c:
            r0.<init>(r1, r2, r4, r5)
            return r0
    }

    public final boolean c(long r7, defpackage.kk3 r9) {
            r6 = this;
            long r0 = r6.q
            r2 = 2
            long r0 = r0 << r2
            r2 = 3
            long r0 = r0 | r2
            r6.q = r0
            int r0 = r6.f
            r1 = 1
            if (r0 <= r1) goto L25
            k64 r0 = r6.h
            s47 r2 = r6.k
            qh1 r3 = r6.j
            r3.getClass()
            ki2 r4 = r6.b
            k64 r0 = defpackage.yh2.s(r0, r9, r2, r3, r4)
            r6.h = r0
            int r2 = r6.f
            long r7 = r0.a(r2, r7)
        L25:
            a47 r0 = r6.n
            if (r0 != 0) goto L2a
            goto L8a
        L2a:
            v84 r2 = r0.b
            z37 r0 = r0.a
            s9 r3 = r2.a
            boolean r3 = r3.a()
            if (r3 == 0) goto L37
            goto L8a
        L37:
            kk3 r3 = r0.h
            long r4 = r0.j
            if (r9 == r3) goto L3e
            goto L8a
        L3e:
            boolean r0 = defpackage.q21.b(r7, r4)
            if (r0 == 0) goto L45
            goto L6b
        L45:
            int r0 = defpackage.q21.h(r7)
            int r3 = defpackage.q21.h(r4)
            if (r0 == r3) goto L50
            goto L8a
        L50:
            int r0 = defpackage.q21.j(r7)
            int r3 = defpackage.q21.j(r4)
            if (r0 == r3) goto L5b
            goto L8a
        L5b:
            int r0 = defpackage.q21.g(r7)
            float r0 = (float) r0
            float r3 = r2.e
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 < 0) goto L8a
            boolean r0 = r2.c
            if (r0 == 0) goto L6b
            goto L8a
        L6b:
            a47 r0 = r6.n
            r0.getClass()
            z37 r0 = r0.a
            long r2 = r0.j
            boolean r0 = defpackage.q21.b(r7, r2)
            if (r0 == 0) goto L7c
            r6 = 0
            return r6
        L7c:
            a47 r0 = r6.n
            r0.getClass()
            v84 r0 = r0.b
            a47 r7 = r6.f(r9, r7, r0)
            r6.n = r7
            return r1
        L8a:
            v84 r0 = r6.b(r7, r9)
            a47 r7 = r6.f(r9, r7, r0)
            r6.n = r7
            return r1
    }

    public final void d(defpackage.qh1 r6) {
            r5 = this;
            qh1 r0 = r5.j
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
            r5.j = r6
            r5.i = r1
            return
        L1c:
            if (r6 == 0) goto L25
            long r3 = r5.i
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L25
            return
        L25:
            r5.j = r6
            r5.i = r1
            long r0 = r5.q
            r6 = 2
            long r0 = r0 << r6
            r2 = 1
            long r0 = r0 | r2
            r5.q = r0
            r6 = 0
            r5.l = r6
            r5.n = r6
            r6 = -1
            r5.p = r6
            r5.o = r6
            return
    }

    public final defpackage.s9 e(defpackage.kk3 r9) {
            r8 = this;
            s9 r0 = r8.l
            if (r0 == 0) goto Le
            kk3 r1 = r8.m
            if (r9 != r1) goto Le
            boolean r1 = r0.a()
            if (r1 == 0) goto L2c
        Le:
            r8.m = r9
            fp r3 = r8.a
            s47 r0 = r8.k
            s47 r4 = defpackage.gi2.N(r0, r9)
            qh1 r6 = r8.j
            r6.getClass()
            ki2 r7 = r8.b
            java.util.List r9 = r8.g
            if (r9 != 0) goto L25
            yt1 r9 = defpackage.yt1.A
        L25:
            r5 = r9
            s9 r2 = new s9
            r2.<init>(r3, r4, r5, r6, r7)
            r0 = r2
        L2c:
            r8.l = r0
            return r0
    }

    public final defpackage.a47 f(defpackage.kk3 r17, long r18, defpackage.v84 r20) {
            r16 = this;
            r0 = r16
            r1 = r20
            s9 r2 = r1.a
            float r2 = r2.c()
            float r3 = r1.d
            float r2 = java.lang.Math.min(r2, r3)
            a47 r3 = new a47
            z37 r4 = new z37
            fp r5 = r0.a
            s47 r6 = r0.k
            java.util.List r7 = r0.g
            if (r7 != 0) goto L1e
            yt1 r7 = defpackage.yt1.A
        L1e:
            int r8 = r0.e
            boolean r9 = r0.d
            int r10 = r0.c
            qh1 r11 = r0.j
            r11.getClass()
            ki2 r13 = r0.b
            r12 = r17
            r14 = r18
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            int r0 = defpackage.ii2.q(r2)
            float r2 = r1.e
            int r2 = defpackage.ii2.q(r2)
            long r5 = (long) r0
            r0 = 32
            long r5 = r5 << r0
            long r7 = (long) r2
            r9 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r7 = r7 & r9
            long r5 = r5 | r7
            long r5 = defpackage.s21.d(r14, r5)
            r3.<init>(r4, r1, r5)
            return r3
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "MultiParagraphLayoutCache(textLayoutResult="
            r0.<init>(r1)
            a47 r1 = r5.n
            java.lang.String r2 = "null"
            if (r1 == 0) goto L10
            java.lang.String r1 = "<TextLayoutResult>"
            goto L11
        L10:
            r1 = r2
        L11:
            r0.append(r1)
            java.lang.String r1 = ", lastDensity="
            r0.append(r1)
            long r3 = r5.i
            java.lang.String r1 = defpackage.t53.b(r3)
            r0.append(r1)
            java.lang.String r1 = ", history="
            r0.append(r1)
            long r3 = r5.q
            r0.append(r3)
            java.lang.String r1 = ", constraints="
            r0.append(r1)
            a47 r5 = r5.n
            if (r5 == 0) goto L41
            z37 r5 = r5.a
            if (r5 == 0) goto L41
            long r1 = r5.j
            q21 r5 = new q21
            r5.<init>(r1)
            r2 = r5
        L41:
            r0.append(r2)
            r5 = 41
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }
}
