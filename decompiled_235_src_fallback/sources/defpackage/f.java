package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: f  reason: default package */
/* loaded from: classes.dex */
public abstract class f {
    public static final defpackage.da0 a = null;
    public static final defpackage.da0 b = null;
    public static final defpackage.da0 c = null;
    public static final defpackage.da0 d = null;
    public static final defpackage.da0 e = null;

    static {
            da0 r0 = defpackage.da0.R
            java.lang.String r0 = "/"
            da0 r0 = defpackage.xd5.o(r0)
            defpackage.f.a = r0
            java.lang.String r0 = "\\"
            da0 r0 = defpackage.xd5.o(r0)
            defpackage.f.b = r0
            java.lang.String r0 = "/\\"
            da0 r0 = defpackage.xd5.o(r0)
            defpackage.f.c = r0
            java.lang.String r0 = "."
            da0 r0 = defpackage.xd5.o(r0)
            defpackage.f.d = r0
            java.lang.String r0 = ".."
            da0 r0 = defpackage.xd5.o(r0)
            defpackage.f.e = r0
            return
    }

    public static final int a(defpackage.lt4 r6) {
            da0 r6 = r6.A
            int r0 = r6.d()
            r1 = -1
            if (r0 != 0) goto La
            goto L6c
        La:
            r0 = 0
            byte r2 = r6.i(r0)
            r3 = 47
            r4 = 1
            if (r2 != r3) goto L15
            goto L3f
        L15:
            byte r2 = r6.i(r0)
            r3 = 92
            r5 = 2
            if (r2 != r3) goto L40
            int r0 = r6.d()
            if (r0 <= r5) goto L3f
            byte r0 = r6.i(r4)
            if (r0 != r3) goto L3f
            da0 r0 = defpackage.f.b
            r0.getClass()
            byte[] r0 = r0.h()
            int r0 = r6.f(r0, r5)
            if (r0 != r1) goto L3e
            int r6 = r6.d()
            return r6
        L3e:
            return r0
        L3f:
            return r4
        L40:
            int r2 = r6.d()
            if (r2 <= r5) goto L6c
            byte r2 = r6.i(r4)
            r4 = 58
            if (r2 != r4) goto L6c
            byte r2 = r6.i(r5)
            if (r2 != r3) goto L6c
            byte r6 = r6.i(r0)
            char r6 = (char) r6
            r0 = 97
            if (r0 > r6) goto L62
            r0 = 123(0x7b, float:1.72E-43)
            if (r6 >= r0) goto L62
            goto L6a
        L62:
            r0 = 65
            if (r0 > r6) goto L6c
            r0 = 91
            if (r6 >= r0) goto L6c
        L6a:
            r6 = 3
            return r6
        L6c:
            return r1
    }

    public static final defpackage.lt4 b(defpackage.lt4 r6, defpackage.lt4 r7, boolean r8) {
            r7.getClass()
            int r0 = a(r7)
            r1 = -1
            if (r0 == r1) goto Lb
            goto L11
        Lb:
            java.lang.Character r0 = r7.e()
            if (r0 == 0) goto L12
        L11:
            return r7
        L12:
            da0 r0 = c(r6)
            if (r0 != 0) goto L24
            da0 r0 = c(r7)
            if (r0 != 0) goto L24
            java.lang.String r0 = defpackage.lt4.B
            da0 r0 = f(r0)
        L24:
            k80 r1 = new k80
            r1.<init>()
            da0 r6 = r6.A
            r1.k0(r6)
            long r2 = r1.B
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L39
            r1.k0(r0)
        L39:
            da0 r6 = r7.A
            r1.k0(r6)
            lt4 r6 = d(r1, r8)
            return r6
    }

    public static final defpackage.da0 c(defpackage.lt4 r3) {
            da0 r0 = r3.A
            da0 r1 = defpackage.f.a
            int r0 = defpackage.da0.g(r0, r1)
            r2 = -1
            if (r0 == r2) goto Lc
            return r1
        Lc:
            da0 r3 = r3.A
            da0 r0 = defpackage.f.b
            int r3 = defpackage.da0.g(r3, r0)
            if (r3 == r2) goto L17
            return r0
        L17:
            r3 = 0
            return r3
    }

    public static final defpackage.lt4 d(defpackage.k80 r17, boolean r18) {
            r0 = r17
            k80 r1 = new k80
            r1.<init>()
            r2 = 0
            r4 = 0
        L9:
            da0 r5 = defpackage.f.a
            r5.getClass()
            int r6 = r5.d()
            r7 = 0
            boolean r5 = r0.F(r6, r7, r5)
            if (r5 != 0) goto L14b
            da0 r5 = defpackage.f.b
            r5.getClass()
            int r6 = r5.d()
            boolean r6 = r0.F(r6, r7, r5)
            if (r6 == 0) goto L2b
            goto L14b
        L2b:
            r6 = 2
            r9 = 1
            if (r4 < r6) goto L37
            boolean r6 = defpackage.nb3.k(r2, r5)
            if (r6 == 0) goto L37
            r6 = r9
            goto L38
        L37:
            r6 = 0
        L38:
            r10 = -1
            da0 r12 = defpackage.f.c
            if (r6 == 0) goto L48
            r2.getClass()
            r1.k0(r2)
            r1.k0(r2)
            goto L50
        L48:
            if (r4 <= 0) goto L52
            r2.getClass()
            r1.k0(r2)
        L50:
            r15 = r10
            goto Lab
        L52:
            long r13 = r0.D(r12)
            if (r2 != 0) goto L6b
            int r2 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r2 != 0) goto L63
            java.lang.String r2 = defpackage.lt4.B
            da0 r2 = f(r2)
            goto L6b
        L63:
            byte r2 = r0.v(r13)
            da0 r2 = e(r2)
        L6b:
            boolean r4 = defpackage.nb3.k(r2, r5)
            if (r4 != 0) goto L72
            goto L50
        L72:
            long r4 = r0.B
            r15 = r4
            r3 = 2
            int r5 = (r15 > r3 ? 1 : (r15 == r3 ? 0 : -1))
            if (r5 >= 0) goto L7c
            goto L50
        L7c:
            r15 = r10
            r10 = 1
            byte r5 = r0.v(r10)
            r10 = 58
            if (r5 == r10) goto L88
            goto Lab
        L88:
            byte r5 = r0.v(r7)
            char r5 = (char) r5
            r10 = 97
            if (r10 > r5) goto L96
            r10 = 123(0x7b, float:1.72E-43)
            if (r5 >= r10) goto L96
            goto L9e
        L96:
            r10 = 65
            if (r10 > r5) goto Lab
            r10 = 91
            if (r5 >= r10) goto Lab
        L9e:
            int r5 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r5 != 0) goto La8
            r3 = 3
            r1.O(r0, r3)
            goto Lab
        La8:
            r1.O(r0, r3)
        Lab:
            long r3 = r1.B
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r3 <= 0) goto Lb3
            r3 = r9
            goto Lb4
        Lb3:
            r3 = 0
        Lb4:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        Lb9:
            boolean r5 = r0.u()
            da0 r10 = defpackage.f.d
            if (r5 != 0) goto L11e
            long r13 = r0.D(r12)
            int r5 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r5 != 0) goto Ld0
            long r13 = r0.B
            da0 r5 = r0.l(r13)
            goto Ld7
        Ld0:
            da0 r5 = r0.l(r13)
            r0.readByte()
        Ld7:
            da0 r11 = defpackage.f.e
            boolean r13 = defpackage.nb3.k(r5, r11)
            if (r13 == 0) goto L10c
            if (r3 == 0) goto Le7
            boolean r10 = r4.isEmpty()
            if (r10 != 0) goto Lb9
        Le7:
            if (r18 == 0) goto L108
            if (r3 != 0) goto Lfc
            boolean r10 = r4.isEmpty()
            if (r10 != 0) goto L108
            java.lang.Object r10 = defpackage.gt0.Q0(r4)
            boolean r10 = defpackage.nb3.k(r10, r11)
            if (r10 == 0) goto Lfc
            goto L108
        Lfc:
            if (r6 == 0) goto L104
            int r5 = r4.size()
            if (r5 == r9) goto Lb9
        L104:
            defpackage.gt0.Z0(r4)
            goto Lb9
        L108:
            r4.add(r5)
            goto Lb9
        L10c:
            boolean r10 = defpackage.nb3.k(r5, r10)
            if (r10 != 0) goto Lb9
            da0 r10 = defpackage.da0.R
            boolean r10 = defpackage.nb3.k(r5, r10)
            if (r10 != 0) goto Lb9
            r4.add(r5)
            goto Lb9
        L11e:
            int r0 = r4.size()
            r3 = 0
        L123:
            if (r3 >= r0) goto L136
            if (r3 <= 0) goto L12a
            r1.k0(r2)
        L12a:
            java.lang.Object r5 = r4.get(r3)
            da0 r5 = (defpackage.da0) r5
            r1.k0(r5)
            int r3 = r3 + 1
            goto L123
        L136:
            long r2 = r1.B
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 != 0) goto L13f
            r1.k0(r10)
        L13f:
            lt4 r0 = new lt4
            long r2 = r1.B
            da0 r1 = r1.l(r2)
            r0.<init>(r1)
            return r0
        L14b:
            byte r3 = r0.readByte()
            if (r2 != 0) goto L155
            da0 r2 = e(r3)
        L155:
            int r4 = r4 + 1
            goto L9
    }

    public static final defpackage.da0 e(byte r1) {
            r0 = 47
            if (r1 == r0) goto L16
            r0 = 92
            if (r1 != r0) goto Lb
            da0 r1 = defpackage.f.b
            return r1
        Lb:
            java.lang.String r0 = "not a directory separator: "
            java.lang.String r1 = defpackage.lb1.g(r1, r0)
            defpackage.i.h(r1)
            r1 = 0
            return r1
        L16:
            da0 r1 = defpackage.f.a
            return r1
    }

    public static final defpackage.da0 f(java.lang.String r1) {
            java.lang.String r0 = "/"
            boolean r0 = defpackage.nb3.k(r1, r0)
            if (r0 == 0) goto Lb
            da0 r1 = defpackage.f.a
            return r1
        Lb:
            java.lang.String r0 = "\\"
            boolean r0 = defpackage.nb3.k(r1, r0)
            if (r0 == 0) goto L16
            da0 r1 = defpackage.f.b
            return r1
        L16:
            java.lang.String r0 = "not a directory separator: "
            java.lang.String r1 = defpackage.i61.m(r0, r1)
            defpackage.i.h(r1)
            r1 = 0
            return r1
    }
}
