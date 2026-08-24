package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mu2  reason: default package */
/* loaded from: classes.dex */
public final class mu2 extends defpackage.gk7 {
    public float[] b;
    public final java.util.ArrayList c;
    public boolean d;
    public long e;
    public java.util.List f;
    public boolean g;
    public defpackage.hj h;
    public defpackage.qn2 i;
    public final defpackage.mc j;
    public java.lang.String k;
    public float l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public boolean s;

    public mu2() {
            r3 = this;
            r3.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.c = r0
            r0 = 1
            r3.d = r0
            long r1 = defpackage.kt0.h
            r3.e = r1
            int r1 = defpackage.el7.a
            yt1 r1 = defpackage.yt1.A
            r3.f = r1
            r3.g = r0
            mc r1 = new mc
            r2 = 17
            r1.<init>(r3, r2)
            r3.j = r1
            java.lang.String r1 = ""
            r3.k = r1
            r1 = 1065353216(0x3f800000, float:1.0)
            r3.o = r1
            r3.p = r1
            r3.s = r0
            return
    }

    @Override // defpackage.gk7
    public final void a(defpackage.no1 r24) {
            r23 = this;
            r0 = r23
            boolean r1 = r0.s
            r2 = 0
            if (r1 == 0) goto Le5
            float[] r1 = r0.b
            if (r1 != 0) goto L12
            float[] r1 = defpackage.v24.a()
            r0.b = r1
            goto L15
        L12:
            defpackage.v24.d(r1)
        L15:
            float r3 = r0.q
            float r4 = r0.m
            float r3 = r3 + r4
            float r4 = r0.r
            float r5 = r0.n
            float r4 = r4 + r5
            defpackage.v24.f(r1, r3, r4)
            float r3 = r0.l
            int r4 = r1.length
            r5 = 1
            r6 = 7
            r7 = 3
            r8 = 6
            r9 = 2
            r10 = 5
            r11 = 4
            r12 = 16
            if (r4 >= r12) goto L31
            goto L8c
        L31:
            double r3 = (double) r3
            r13 = 4580687790476533049(0x3f91df46a2529d39, double:0.017453292519943295)
            double r3 = r3 * r13
            double r13 = java.lang.Math.sin(r3)
            float r13 = (float) r13
            double r3 = java.lang.Math.cos(r3)
            float r3 = (float) r3
            r4 = r1[r2]
            r14 = r1[r11]
            float r15 = r3 * r4
            float r16 = r13 * r14
            float r16 = r16 + r15
            float r15 = -r13
            float r4 = r4 * r15
            float r14 = r14 * r3
            float r14 = r14 + r4
            r4 = r1[r5]
            r17 = r1[r10]
            float r18 = r3 * r4
            float r19 = r13 * r17
            float r19 = r19 + r18
            float r4 = r4 * r15
            float r17 = r17 * r3
            float r17 = r17 + r4
            r4 = r1[r9]
            r18 = r1[r8]
            float r20 = r3 * r4
            float r21 = r13 * r18
            float r21 = r21 + r20
            float r4 = r4 * r15
            float r18 = r18 * r3
            float r18 = r18 + r4
            r4 = r1[r7]
            r20 = r1[r6]
            float r22 = r3 * r4
            float r13 = r13 * r20
            float r13 = r13 + r22
            float r15 = r15 * r4
            float r3 = r3 * r20
            float r3 = r3 + r15
            r1[r2] = r16
            r1[r5] = r19
            r1[r9] = r21
            r1[r7] = r13
            r1[r11] = r14
            r1[r10] = r17
            r1[r8] = r18
            r1[r6] = r3
        L8c:
            float r3 = r0.o
            float r4 = r0.p
            int r13 = r1.length
            if (r13 >= r12) goto L94
            goto Lda
        L94:
            r12 = r1[r2]
            float r12 = r12 * r3
            r1[r2] = r12
            r12 = r1[r5]
            float r12 = r12 * r3
            r1[r5] = r12
            r5 = r1[r9]
            float r5 = r5 * r3
            r1[r9] = r5
            r5 = r1[r7]
            float r5 = r5 * r3
            r1[r7] = r5
            r3 = r1[r11]
            float r3 = r3 * r4
            r1[r11] = r3
            r3 = r1[r10]
            float r3 = r3 * r4
            r1[r10] = r3
            r3 = r1[r8]
            float r3 = r3 * r4
            r1[r8] = r3
            r3 = r1[r6]
            float r3 = r3 * r4
            r1[r6] = r3
            r3 = 8
            r4 = r1[r3]
            r5 = 1065353216(0x3f800000, float:1.0)
            float r4 = r4 * r5
            r1[r3] = r4
            r3 = 9
            r4 = r1[r3]
            float r4 = r4 * r5
            r1[r3] = r4
            r3 = 10
            r4 = r1[r3]
            float r4 = r4 * r5
            r1[r3] = r4
            r3 = 11
            r4 = r1[r3]
            float r4 = r4 * r5
            r1[r3] = r4
        Lda:
            float r3 = r0.m
            float r3 = -r3
            float r4 = r0.n
            float r4 = -r4
            defpackage.v24.f(r1, r3, r4)
            r0.s = r2
        Le5:
            boolean r1 = r0.g
            if (r1 == 0) goto L102
            java.util.List r1 = r0.f
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L100
            hj r1 = r0.h
            if (r1 != 0) goto Lfb
            hj r1 = defpackage.lj.a()
            r0.h = r1
        Lfb:
            java.util.List r3 = r0.f
            defpackage.ln2.e0(r3, r1)
        L100:
            r0.g = r2
        L102:
            bt r1 = r24.i0()
            long r3 = r1.L()
            xj0 r5 = r1.G()
            r5.h()
            java.lang.Object r5 = r1.B     // Catch: java.lang.Throwable -> L14d
            os0 r5 = (defpackage.os0) r5     // Catch: java.lang.Throwable -> L14d
            java.lang.Object r5 = r5.B     // Catch: java.lang.Throwable -> L14d
            bt r5 = (defpackage.bt) r5     // Catch: java.lang.Throwable -> L14d
            float[] r6 = r0.b     // Catch: java.lang.Throwable -> L14d
            if (r6 == 0) goto L124
            xj0 r7 = r5.G()     // Catch: java.lang.Throwable -> L14d
            r7.l(r6)     // Catch: java.lang.Throwable -> L14d
        L124:
            hj r6 = r0.h     // Catch: java.lang.Throwable -> L14d
            java.util.List r7 = r0.f     // Catch: java.lang.Throwable -> L14d
            boolean r7 = r7.isEmpty()     // Catch: java.lang.Throwable -> L14d
            if (r7 != 0) goto L137
            if (r6 == 0) goto L137
            xj0 r5 = r5.G()     // Catch: java.lang.Throwable -> L14d
            r5.m(r6)     // Catch: java.lang.Throwable -> L14d
        L137:
            java.util.ArrayList r0 = r0.c     // Catch: java.lang.Throwable -> L14d
            int r5 = r0.size()     // Catch: java.lang.Throwable -> L14d
        L13d:
            if (r2 >= r5) goto L14f
            java.lang.Object r6 = r0.get(r2)     // Catch: java.lang.Throwable -> L14d
            gk7 r6 = (defpackage.gk7) r6     // Catch: java.lang.Throwable -> L14d
            r7 = r24
            r6.a(r7)     // Catch: java.lang.Throwable -> L14d
            int r2 = r2 + 1
            goto L13d
        L14d:
            r0 = move-exception
            goto L153
        L14f:
            defpackage.xg6.v(r1, r3)
            return
        L153:
            defpackage.xg6.v(r1, r3)
            throw r0
    }

    @Override // defpackage.gk7
    public final defpackage.qn2 b() {
            r0 = this;
            qn2 r0 = r0.i
            return r0
    }

    @Override // defpackage.gk7
    public final void d(defpackage.mc r1) {
            r0 = this;
            r0.i = r1
            return
    }

    public final void e(int r3, defpackage.gk7 r4) {
            r2 = this;
            java.util.ArrayList r0 = r2.c
            int r1 = r0.size()
            if (r3 >= r1) goto Lc
            r0.set(r3, r4)
            goto Lf
        Lc:
            r0.add(r4)
        Lf:
            r2.g(r4)
            mc r3 = r2.j
            r4.d(r3)
            r2.c()
            return
    }

    public final void f(long r5) {
            r4 = this;
            boolean r0 = r4.d
            if (r0 != 0) goto L5
            goto L42
        L5:
            r0 = 16
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 == 0) goto L42
            long r2 = r4.e
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto L14
            r4.e = r5
            return
        L14:
            int r0 = defpackage.el7.a
            float r0 = defpackage.kt0.i(r2)
            float r1 = defpackage.kt0.i(r5)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L3b
            float r0 = defpackage.kt0.h(r2)
            float r1 = defpackage.kt0.h(r5)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L3b
            float r0 = defpackage.kt0.f(r2)
            float r5 = defpackage.kt0.f(r5)
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 != 0) goto L3b
            goto L42
        L3b:
            r5 = 0
            r4.d = r5
            long r5 = defpackage.kt0.h
            r4.e = r5
        L42:
            return
    }

    public final void g(defpackage.gk7 r5) {
            r4 = this;
            boolean r0 = r5 instanceof defpackage.nt4
            r1 = 0
            if (r0 == 0) goto L3e
            nt4 r5 = (defpackage.nt4) r5
            f80 r0 = r5.b
            boolean r2 = r4.d
            if (r2 != 0) goto Le
            goto L22
        Le:
            if (r0 == 0) goto L22
            boolean r2 = r0 instanceof defpackage.cn6
            if (r2 == 0) goto L1c
            cn6 r0 = (defpackage.cn6) r0
            long r2 = r0.a
            r4.f(r2)
            goto L22
        L1c:
            r4.d = r1
            long r2 = defpackage.kt0.h
            r4.e = r2
        L22:
            f80 r5 = r5.g
            boolean r0 = r4.d
            if (r0 != 0) goto L29
            goto L58
        L29:
            if (r5 == 0) goto L58
            boolean r0 = r5 instanceof defpackage.cn6
            if (r0 == 0) goto L37
            cn6 r5 = (defpackage.cn6) r5
            long r0 = r5.a
            r4.f(r0)
            return
        L37:
            r4.d = r1
            long r0 = defpackage.kt0.h
            r4.e = r0
            return
        L3e:
            boolean r0 = r5 instanceof defpackage.mu2
            if (r0 == 0) goto L58
            mu2 r5 = (defpackage.mu2) r5
            boolean r0 = r5.d
            if (r0 == 0) goto L52
            boolean r0 = r4.d
            if (r0 == 0) goto L52
            long r0 = r5.e
            r4.f(r0)
            return
        L52:
            r4.d = r1
            long r0 = defpackage.kt0.h
            r4.e = r0
        L58:
            return
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "VGroup: "
            r0.<init>(r1)
            java.lang.String r1 = r5.k
            r0.append(r1)
            java.util.ArrayList r5 = r5.c
            int r1 = r5.size()
            r2 = 0
        L13:
            if (r2 >= r1) goto L2f
            java.lang.Object r3 = r5.get(r2)
            gk7 r3 = (defpackage.gk7) r3
            java.lang.String r4 = "\t"
            r0.append(r4)
            java.lang.String r3 = r3.toString()
            r0.append(r3)
            java.lang.String r3 = "\n"
            r0.append(r3)
            int r2 = r2 + 1
            goto L13
        L2f:
            java.lang.String r5 = r0.toString()
            return r5
    }
}
