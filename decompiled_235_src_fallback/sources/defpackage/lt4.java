package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lt4  reason: default package */
/* loaded from: classes.dex */
public final class lt4 implements java.lang.Comparable {
    public static final java.lang.String B = null;
    public final defpackage.da0 A;

    static {
            java.lang.String r0 = java.io.File.separator
            r0.getClass()
            defpackage.lt4.B = r0
            return
    }

    public lt4(defpackage.da0 r1) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.A = r1
            return
    }

    public final java.util.ArrayList a() {
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = defpackage.f.a(r7)
            r2 = -1
            r3 = 92
            da0 r7 = r7.A
            if (r1 != r2) goto L12
            r1 = 0
            goto L20
        L12:
            int r2 = r7.d()
            if (r1 >= r2) goto L20
            byte r2 = r7.i(r1)
            if (r2 != r3) goto L20
            int r1 = r1 + 1
        L20:
            int r2 = r7.d()
            r4 = r1
        L25:
            if (r1 >= r2) goto L41
            byte r5 = r7.i(r1)
            r6 = 47
            if (r5 == r6) goto L35
            byte r5 = r7.i(r1)
            if (r5 != r3) goto L3e
        L35:
            da0 r4 = r7.o(r4, r1)
            r0.add(r4)
            int r4 = r1 + 1
        L3e:
            int r1 = r1 + 1
            goto L25
        L41:
            int r1 = r7.d()
            if (r4 >= r1) goto L52
            int r1 = r7.d()
            da0 r7 = r7.o(r4, r1)
            r0.add(r7)
        L52:
            return r0
    }

    public final defpackage.lt4 b() {
            r10 = this;
            da0 r0 = defpackage.f.d
            da0 r1 = r10.A
            boolean r2 = defpackage.nb3.k(r1, r0)
            if (r2 != 0) goto Lc3
            da0 r2 = defpackage.f.a
            boolean r3 = defpackage.nb3.k(r1, r2)
            if (r3 != 0) goto Lc3
            da0 r3 = defpackage.f.b
            boolean r4 = defpackage.nb3.k(r1, r3)
            if (r4 != 0) goto Lc3
            da0 r4 = defpackage.f.e
            r1.getClass()
            r4.getClass()
            int r5 = r1.d()
            byte[] r6 = r4.A
            int r7 = r6.length
            int r5 = r5 - r7
            int r6 = r6.length
            boolean r4 = r1.l(r5, r4, r6)
            r5 = 3
            r6 = 2
            r7 = 1
            if (r4 == 0) goto L56
            int r4 = r1.d()
            if (r4 != r6) goto L3c
            goto Lc3
        L3c:
            int r4 = r1.d()
            int r4 = r4 - r5
            boolean r4 = r1.l(r4, r2, r7)
            if (r4 == 0) goto L49
            goto Lc3
        L49:
            int r4 = r1.d()
            int r4 = r4 - r5
            boolean r4 = r1.l(r4, r3, r7)
            if (r4 == 0) goto L56
            goto Lc3
        L56:
            int r2 = defpackage.da0.k(r1, r2)
            r4 = -1
            if (r2 == r4) goto L5e
            goto L62
        L5e:
            int r2 = defpackage.da0.k(r1, r3)
        L62:
            r8 = 0
            if (r2 != r6) goto L7c
            java.lang.Character r9 = r10.e()
            if (r9 == 0) goto L7c
            int r10 = r1.d()
            if (r10 != r5) goto L72
            goto Lc3
        L72:
            lt4 r10 = new lt4
            da0 r0 = defpackage.da0.p(r1, r8, r5, r7)
            r10.<init>(r0)
            return r10
        L7c:
            if (r2 != r7) goto L8c
            r3.getClass()
            int r5 = r3.d()
            boolean r3 = r1.l(r8, r3, r5)
            if (r3 == 0) goto L8c
            goto Lc3
        L8c:
            if (r2 != r4) goto La5
            java.lang.Character r10 = r10.e()
            if (r10 == 0) goto La5
            int r10 = r1.d()
            if (r10 != r6) goto L9b
            goto Lc3
        L9b:
            lt4 r10 = new lt4
            da0 r0 = defpackage.da0.p(r1, r8, r6, r7)
            r10.<init>(r0)
            return r10
        La5:
            if (r2 != r4) goto Lad
            lt4 r10 = new lt4
            r10.<init>(r0)
            return r10
        Lad:
            if (r2 != 0) goto Lb9
            lt4 r10 = new lt4
            da0 r0 = defpackage.da0.p(r1, r8, r7, r7)
            r10.<init>(r0)
            return r10
        Lb9:
            lt4 r10 = new lt4
            da0 r0 = defpackage.da0.p(r1, r8, r2, r7)
            r10.<init>(r0)
            return r10
        Lc3:
            r10 = 0
            return r10
    }

    public final defpackage.lt4 c(defpackage.lt4 r13) {
            r12 = this;
            r13.getClass()
            da0 r0 = r13.A
            int r1 = defpackage.f.a(r12)
            da0 r2 = r12.A
            r3 = 0
            r4 = 0
            r5 = -1
            if (r1 != r5) goto L12
            r6 = r3
            goto L1b
        L12:
            lt4 r6 = new lt4
            da0 r1 = r2.o(r4, r1)
            r6.<init>(r1)
        L1b:
            int r1 = defpackage.f.a(r13)
            if (r1 != r5) goto L23
            r7 = r3
            goto L2c
        L23:
            lt4 r7 = new lt4
            da0 r1 = r0.o(r4, r1)
            r7.<init>(r1)
        L2c:
            boolean r1 = defpackage.nb3.k(r6, r7)
            java.lang.String r6 = " and "
            if (r1 == 0) goto Ld1
            java.util.ArrayList r1 = r12.a()
            java.util.ArrayList r7 = r13.a()
            int r8 = r1.size()
            int r9 = r7.size()
            int r8 = java.lang.Math.min(r8, r9)
            r9 = r4
        L49:
            if (r9 >= r8) goto L5c
            java.lang.Object r10 = r1.get(r9)
            java.lang.Object r11 = r7.get(r9)
            boolean r10 = defpackage.nb3.k(r10, r11)
            if (r10 == 0) goto L5c
            int r9 = r9 + 1
            goto L49
        L5c:
            if (r9 != r8) goto L6f
            int r2 = r2.d()
            int r8 = r0.d()
            if (r2 != r8) goto L6f
            java.lang.String r12 = "."
            lt4 r12 = defpackage.w31.p(r12)
            return r12
        L6f:
            int r2 = r7.size()
            java.util.List r2 = r7.subList(r9, r2)
            da0 r8 = defpackage.f.e
            int r2 = r2.indexOf(r8)
            if (r2 != r5) goto Lcb
            da0 r2 = defpackage.f.d
            boolean r0 = defpackage.nb3.k(r0, r2)
            if (r0 == 0) goto L88
            return r12
        L88:
            k80 r0 = new k80
            r0.<init>()
            da0 r13 = defpackage.f.c(r13)
            if (r13 != 0) goto L9f
            da0 r13 = defpackage.f.c(r12)
            if (r13 != 0) goto L9f
            java.lang.String r12 = defpackage.lt4.B
            da0 r13 = defpackage.f.f(r12)
        L9f:
            int r12 = r7.size()
            r2 = r9
        La4:
            if (r2 >= r12) goto Lb1
            da0 r3 = defpackage.f.e
            r0.k0(r3)
            r0.k0(r13)
            int r2 = r2 + 1
            goto La4
        Lb1:
            int r12 = r1.size()
        Lb5:
            if (r9 >= r12) goto Lc6
            java.lang.Object r2 = r1.get(r9)
            da0 r2 = (defpackage.da0) r2
            r0.k0(r2)
            r0.k0(r13)
            int r9 = r9 + 1
            goto Lb5
        Lc6:
            lt4 r12 = defpackage.f.d(r0, r4)
            return r12
        Lcb:
            java.lang.String r0 = "Impossible relative path to resolve: "
            defpackage.u34.y(r0, r12, r6, r13)
            return r3
        Ld1:
            java.lang.String r0 = "Paths of different roots cannot be relative to each other: "
            defpackage.u34.y(r0, r12, r6, r13)
            return r3
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object r1) {
            r0 = this;
            lt4 r1 = (defpackage.lt4) r1
            r1.getClass()
            da0 r0 = r0.A
            da0 r1 = r1.A
            int r0 = r0.b(r1)
            return r0
    }

    public final defpackage.lt4 d(java.lang.String r2) {
            r1 = this;
            r2.getClass()
            k80 r0 = new k80
            r0.<init>()
            r0.t0(r2)
            r2 = 0
            lt4 r0 = defpackage.f.d(r0, r2)
            lt4 r1 = defpackage.f.b(r1, r0, r2)
            return r1
    }

    public final java.lang.Character e() {
            r2 = this;
            da0 r0 = defpackage.f.a
            da0 r2 = r2.A
            int r0 = defpackage.da0.g(r2, r0)
            r1 = -1
            if (r0 == r1) goto Lc
            goto L3a
        Lc:
            int r0 = r2.d()
            r1 = 2
            if (r0 >= r1) goto L14
            goto L3a
        L14:
            r0 = 1
            byte r0 = r2.i(r0)
            r1 = 58
            if (r0 == r1) goto L1e
            goto L3a
        L1e:
            r0 = 0
            byte r2 = r2.i(r0)
            char r2 = (char) r2
            r0 = 97
            if (r0 > r2) goto L2d
            r0 = 123(0x7b, float:1.72E-43)
            if (r2 >= r0) goto L2d
            goto L35
        L2d:
            r0 = 65
            if (r0 > r2) goto L3a
            r0 = 91
            if (r2 >= r0) goto L3a
        L35:
            java.lang.Character r2 = java.lang.Character.valueOf(r2)
            return r2
        L3a:
            r2 = 0
            return r2
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.lt4
            if (r0 == 0) goto L12
            lt4 r2 = (defpackage.lt4) r2
            da0 r2 = r2.A
            da0 r1 = r1.A
            boolean r1 = defpackage.nb3.k(r2, r1)
            if (r1 == 0) goto L12
            r1 = 1
            return r1
        L12:
            r1 = 0
            return r1
    }

    public final int hashCode() {
            r0 = this;
            da0 r0 = r0.A
            int r0 = r0.hashCode()
            return r0
    }

    public final java.io.File toFile() {
            r1 = this;
            java.io.File r0 = new java.io.File
            da0 r1 = r1.A
            java.lang.String r1 = r1.s()
            r0.<init>(r1)
            return r0
    }

    public final java.lang.String toString() {
            r0 = this;
            da0 r0 = r0.A
            java.lang.String r0 = r0.s()
            return r0
    }
}
