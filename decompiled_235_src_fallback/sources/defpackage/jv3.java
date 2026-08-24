package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jv3  reason: default package */
/* loaded from: classes.dex */
public final class jv3 {
    public static boolean q = false;
    public int a;
    public boolean b;
    public int c;
    public final defpackage.c35 d;
    public int e;
    public int f;
    public defpackage.yu[] g;
    public boolean h;
    public boolean[] i;
    public int j;
    public int k;
    public int l;
    public final defpackage.bt m;
    public defpackage.en6[] n;
    public int o;
    public defpackage.yu p;

    public jv3() {
            r5 = this;
            r5.<init>()
            r0 = 1000(0x3e8, float:1.401E-42)
            r5.a = r0
            r1 = 0
            r5.b = r1
            r5.c = r1
            r2 = 32
            r5.e = r2
            r5.f = r2
            r5.h = r1
            boolean[] r3 = new boolean[r2]
            r5.i = r3
            r3 = 1
            r5.j = r3
            r5.k = r1
            r5.l = r2
            en6[] r0 = new defpackage.en6[r0]
            r5.n = r0
            r5.o = r1
            yu[] r0 = new defpackage.yu[r2]
            r5.g = r0
            r5.s()
            bt r0 = new bt
            r3 = 8
            r4 = 0
            r0.<init>(r3, r4)
            tz4 r3 = new tz4
            r3.<init>()
            r0.B = r3
            tz4 r3 = new tz4
            r3.<init>()
            r0.L = r3
            en6[] r2 = new defpackage.en6[r2]
            r0.R = r2
            r5.m = r0
            c35 r2 = new c35
            r2.<init>(r0)
            r3 = 128(0x80, float:1.8E-43)
            en6[] r4 = new defpackage.en6[r3]
            r2.f = r4
            en6[] r3 = new defpackage.en6[r3]
            r2.g = r3
            r2.h = r1
            ap3 r1 = new ap3
            r1.<init>(r2)
            r2.i = r1
            r5.d = r2
            yu r1 = new yu
            r1.<init>(r0)
            r5.p = r1
            return
    }

    public static int n(java.lang.Object r1) {
            h11 r1 = (defpackage.h11) r1
            en6 r1 = r1.i
            if (r1 == 0) goto Ld
            float r1 = r1.X
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r0
            int r1 = (int) r1
            return r1
        Ld:
            r1 = 0
            return r1
    }

    public final defpackage.en6 a(defpackage.dn6 r6) {
            r5 = this;
            bt r0 = r5.m
            java.lang.Object r0 = r0.L
            tz4 r0 = (defpackage.tz4) r0
            int r1 = r0.b
            r2 = 0
            if (r1 <= 0) goto L16
            int r1 = r1 + (-1)
            java.lang.Object[] r3 = r0.a
            r4 = r3[r1]
            r3[r1] = r2
            r0.b = r1
            r2 = r4
        L16:
            en6 r2 = (defpackage.en6) r2
            if (r2 != 0) goto L22
            en6 r2 = new en6
            r2.<init>(r6)
            r2.e0 = r6
            goto L27
        L22:
            r2.c()
            r2.e0 = r6
        L27:
            int r6 = r5.o
            int r0 = r5.a
            if (r6 < r0) goto L3b
            int r0 = r0 * 2
            r5.a = r0
            en6[] r6 = r5.n
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r0)
            en6[] r6 = (defpackage.en6[]) r6
            r5.n = r6
        L3b:
            en6[] r6 = r5.n
            int r0 = r5.o
            int r1 = r0 + 1
            r5.o = r1
            r6[r0] = r2
            return r2
    }

    public final void b(defpackage.en6 r7, defpackage.en6 r8, int r9, float r10, defpackage.en6 r11, defpackage.en6 r12, int r13, int r14) {
            r6 = this;
            yu r0 = r6.l()
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r8 != r11) goto L1a
            qu r9 = r0.d
            r9.g(r7, r1)
            qu r7 = r0.d
            r7.g(r12, r1)
            qu r7 = r0.d
            r9 = -1073741824(0xffffffffc0000000, float:-2.0)
            r7.g(r8, r9)
            goto L88
        L1a:
            r2 = 1056964608(0x3f000000, float:0.5)
            int r2 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            qu r3 = r0.d
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r2 != 0) goto L40
            r3.g(r7, r1)
            qu r7 = r0.d
            r7.g(r8, r4)
            qu r7 = r0.d
            r7.g(r11, r4)
            qu r7 = r0.d
            r7.g(r12, r1)
            if (r9 > 0) goto L3a
            if (r13 <= 0) goto L88
        L3a:
            int r7 = -r9
            int r7 = r7 + r13
            float r7 = (float) r7
            r0.b = r7
            goto L88
        L40:
            r2 = 0
            int r2 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r2 > 0) goto L51
            r3.g(r7, r4)
            qu r7 = r0.d
            r7.g(r8, r1)
            float r7 = (float) r9
            r0.b = r7
            goto L88
        L51:
            int r2 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r2 < 0) goto L62
            r3.g(r12, r4)
            qu r7 = r0.d
            r7.g(r11, r1)
            int r7 = -r13
            float r7 = (float) r7
            r0.b = r7
            goto L88
        L62:
            float r2 = r1 - r10
            float r5 = r2 * r1
            r3.g(r7, r5)
            qu r7 = r0.d
            float r3 = r2 * r4
            r7.g(r8, r3)
            qu r7 = r0.d
            float r4 = r4 * r10
            r7.g(r11, r4)
            qu r7 = r0.d
            float r1 = r1 * r10
            r7.g(r12, r1)
            if (r9 > 0) goto L80
            if (r13 <= 0) goto L88
        L80:
            int r7 = -r9
            float r7 = (float) r7
            float r7 = r7 * r2
            float r8 = (float) r13
            float r8 = r8 * r10
            float r8 = r8 + r7
            r0.b = r8
        L88:
            r7 = 8
            if (r14 == r7) goto L8f
            r0.a(r6, r14)
        L8f:
            r6.c(r0)
            return
    }

    public final void c(defpackage.yu r18) {
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r0.k
            r3 = 1
            int r2 = r2 + r3
            int r4 = r0.l
            if (r2 >= r4) goto L13
            int r2 = r0.j
            int r2 = r2 + r3
            int r4 = r0.f
            if (r2 < r4) goto L16
        L13:
            r0.o()
        L16:
            boolean r2 = r1.e
            if (r2 != 0) goto L1c2
            java.util.ArrayList r2 = r1.c
            yu[] r5 = r0.g
            int r5 = r5.length
            r6 = -1
            if (r5 != 0) goto L23
            goto L7d
        L23:
            r5 = 0
        L24:
            if (r5 != 0) goto L6d
            qu r7 = r1.d
            int r7 = r7.d()
            r8 = 0
        L2d:
            if (r8 >= r7) goto L44
            qu r9 = r1.d
            en6 r9 = r9.e(r8)
            int r10 = r9.L
            if (r10 != r6) goto L3e
            boolean r10 = r9.Y
            if (r10 != 0) goto L3e
            goto L41
        L3e:
            r2.add(r9)
        L41:
            int r8 = r8 + 1
            goto L2d
        L44:
            int r7 = r2.size()
            if (r7 <= 0) goto L6b
            r8 = 0
        L4b:
            if (r8 >= r7) goto L67
            java.lang.Object r9 = r2.get(r8)
            en6 r9 = (defpackage.en6) r9
            boolean r10 = r9.Y
            if (r10 == 0) goto L5b
            r1.h(r0, r9, r3)
            goto L64
        L5b:
            yu[] r10 = r0.g
            int r9 = r9.L
            r9 = r10[r9]
            r1.i(r0, r9, r3)
        L64:
            int r8 = r8 + 1
            goto L4b
        L67:
            r2.clear()
            goto L24
        L6b:
            r5 = r3
            goto L24
        L6d:
            en6 r2 = r1.a
            if (r2 == 0) goto L7d
            qu r2 = r1.d
            int r2 = r2.d()
            if (r2 != 0) goto L7d
            r1.e = r3
            r0.b = r3
        L7d:
            boolean r2 = r1.e()
            if (r2 == 0) goto L85
            goto L1c8
        L85:
            float r2 = r1.b
            r5 = 0
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 >= 0) goto Laa
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r2 = r2 * r7
            r1.b = r2
            qu r2 = r1.d
            int r8 = r2.h
            r9 = 0
        L96:
            if (r8 == r6) goto Laa
            int r10 = r2.a
            if (r9 >= r10) goto Laa
            float[] r10 = r2.g
            r11 = r10[r8]
            float r11 = r11 * r7
            r10[r8] = r11
            int[] r10 = r2.f
            r8 = r10[r8]
            int r9 = r9 + 1
            goto L96
        Laa:
            qu r2 = r1.d
            int r2 = r2.d()
            r7 = 0
            r11 = r5
            r13 = r11
            r9 = r7
            r10 = r9
            r8 = 0
            r12 = 0
            r14 = 0
        Lb8:
            if (r8 >= r2) goto L112
            qu r15 = r1.d
            float r15 = r15.f(r8)
            qu r4 = r1.d
            en6 r4 = r4.e(r8)
            r16 = r5
            dn6 r5 = r4.e0
            dn6 r6 = defpackage.dn6.UNRESTRICTED
            if (r5 != r6) goto Lea
            if (r9 != 0) goto Ld9
            int r5 = r4.h0
            if (r5 > r3) goto Ld5
            goto Le8
        Ld5:
            r12 = 0
        Ld6:
            r9 = r4
            r11 = r15
            goto L10c
        Ld9:
            int r5 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r5 <= 0) goto Le2
            int r5 = r4.h0
            if (r5 > r3) goto Ld5
            goto Le8
        Le2:
            if (r12 != 0) goto L10c
            int r5 = r4.h0
            if (r5 > r3) goto L10c
        Le8:
            r12 = r3
            goto Ld6
        Lea:
            if (r9 != 0) goto L10c
            int r5 = (r15 > r16 ? 1 : (r15 == r16 ? 0 : -1))
            if (r5 >= 0) goto L10c
            if (r10 != 0) goto Lfb
            int r5 = r4.h0
            if (r5 > r3) goto Lf7
            goto L10a
        Lf7:
            r14 = 0
        Lf8:
            r10 = r4
            r13 = r15
            goto L10c
        Lfb:
            int r5 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r5 <= 0) goto L104
            int r5 = r4.h0
            if (r5 > r3) goto Lf7
            goto L10a
        L104:
            if (r14 != 0) goto L10c
            int r5 = r4.h0
            if (r5 > r3) goto L10c
        L10a:
            r14 = r3
            goto Lf8
        L10c:
            int r8 = r8 + 1
            r5 = r16
            r6 = -1
            goto Lb8
        L112:
            r16 = r5
            if (r9 == 0) goto L117
            goto L118
        L117:
            r9 = r10
        L118:
            if (r9 != 0) goto L11c
            r2 = r3
            goto L120
        L11c:
            r1.g(r9)
            r2 = 0
        L120:
            qu r4 = r1.d
            int r4 = r4.d()
            if (r4 != 0) goto L12a
            r1.e = r3
        L12a:
            if (r2 == 0) goto L1af
            int r2 = r0.j
            int r2 = r2 + r3
            int r4 = r0.f
            if (r2 < r4) goto L136
            r0.o()
        L136:
            dn6 r2 = defpackage.dn6.SLACK
            en6 r2 = r0.a(r2)
            int r4 = r0.c
            int r4 = r4 + r3
            r0.c = r4
            int r5 = r0.j
            int r5 = r5 + r3
            r0.j = r5
            r2.B = r4
            bt r5 = r0.m
            java.lang.Object r6 = r5.R
            en6[] r6 = (defpackage.en6[]) r6
            r6[r4] = r2
            r1.a = r2
            int r4 = r0.k
            r17.h(r18)
            int r6 = r0.k
            int r4 = r4 + r3
            if (r6 != r4) goto L1af
            yu r4 = r0.p
            r4.a = r7
            qu r6 = r4.d
            r6.b()
            r6 = 0
        L166:
            qu r8 = r1.d
            int r8 = r8.d()
            if (r6 >= r8) goto L182
            qu r8 = r1.d
            en6 r8 = r8.e(r6)
            qu r9 = r1.d
            float r9 = r9.f(r6)
            qu r10 = r4.d
            r10.a(r8, r9, r3)
            int r6 = r6 + 1
            goto L166
        L182:
            yu r4 = r0.p
            r0.r(r4)
            int r4 = r2.L
            r6 = -1
            if (r4 != r6) goto L1b0
            en6 r4 = r1.a
            if (r4 != r2) goto L199
            en6 r2 = r1.f(r7, r2)
            if (r2 == 0) goto L199
            r1.g(r2)
        L199:
            boolean r2 = r1.e
            if (r2 != 0) goto L1a2
            en6 r2 = r1.a
            r2.e(r0, r1)
        L1a2:
            java.lang.Object r2 = r5.B
            tz4 r2 = (defpackage.tz4) r2
            r2.b(r1)
            int r2 = r0.k
            int r2 = r2 - r3
            r0.k = r2
            goto L1b0
        L1af:
            r3 = 0
        L1b0:
            en6 r2 = r1.a
            if (r2 == 0) goto L1c8
            dn6 r2 = r2.e0
            dn6 r4 = defpackage.dn6.UNRESTRICTED
            if (r2 == r4) goto L1c0
            float r2 = r1.b
            int r2 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r2 < 0) goto L1c8
        L1c0:
            r4 = r3
            goto L1c3
        L1c2:
            r4 = 0
        L1c3:
            if (r4 != 0) goto L1c8
            r17.h(r18)
        L1c8:
            return
    }

    public final void d(defpackage.en6 r5, int r6) {
            r4 = this;
            int r0 = r5.L
            r1 = 1
            r2 = -1
            if (r0 != r2) goto L1c
            float r6 = (float) r6
            r5.d(r4, r6)
            r5 = 0
        Lb:
            int r6 = r4.c
            int r6 = r6 + r1
            if (r5 >= r6) goto L1b
            bt r6 = r4.m
            java.lang.Object r6 = r6.R
            en6[] r6 = (defpackage.en6[]) r6
            r6 = r6[r5]
            int r5 = r5 + 1
            goto Lb
        L1b:
            return
        L1c:
            if (r0 == r2) goto L58
            yu[] r3 = r4.g
            r0 = r3[r0]
            boolean r3 = r0.e
            if (r3 == 0) goto L2a
            float r4 = (float) r6
            r0.b = r4
            return
        L2a:
            qu r3 = r0.d
            int r3 = r3.d()
            if (r3 != 0) goto L38
            r0.e = r1
            float r4 = (float) r6
            r0.b = r4
            return
        L38:
            yu r0 = r4.l()
            if (r6 >= 0) goto L4a
            int r6 = r6 * r2
            float r6 = (float) r6
            r0.b = r6
            qu r6 = r0.d
            r1 = 1065353216(0x3f800000, float:1.0)
            r6.g(r5, r1)
            goto L54
        L4a:
            float r6 = (float) r6
            r0.b = r6
            qu r6 = r0.d
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r6.g(r5, r1)
        L54:
            r4.c(r0)
            return
        L58:
            yu r0 = r4.l()
            r0.a = r5
            float r6 = (float) r6
            r5.X = r6
            r0.b = r6
            r0.e = r1
            r4.c(r0)
            return
    }

    public final void e(defpackage.en6 r6, defpackage.en6 r7, int r8, int r9) {
            r5 = this;
            r0 = 8
            if (r9 != r0) goto L15
            boolean r1 = r7.Y
            if (r1 == 0) goto L15
            int r1 = r6.L
            r2 = -1
            if (r1 != r2) goto L15
            float r7 = r7.X
            float r8 = (float) r8
            float r7 = r7 + r8
            r6.d(r5, r7)
            return
        L15:
            yu r1 = r5.l()
            r2 = 0
            if (r8 == 0) goto L24
            if (r8 >= 0) goto L21
            int r8 = r8 * (-1)
            r2 = 1
        L21:
            float r8 = (float) r8
            r1.b = r8
        L24:
            qu r8 = r1.d
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r2 != 0) goto L35
            r8.g(r6, r4)
            qu r6 = r1.d
            r6.g(r7, r3)
            goto L3d
        L35:
            r8.g(r6, r3)
            qu r6 = r1.d
            r6.g(r7, r4)
        L3d:
            if (r9 == r0) goto L42
            r1.a(r5, r9)
        L42:
            r5.c(r1)
            return
    }

    public final void f(defpackage.en6 r4, defpackage.en6 r5, int r6, int r7) {
            r3 = this;
            yu r0 = r3.l()
            en6 r1 = r3.m()
            r2 = 0
            r1.R = r2
            r0.b(r4, r5, r1, r6)
            r4 = 8
            if (r7 == r4) goto L26
            qu r4 = r0.d
            float r4 = r4.c(r1)
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r4 = r4 * r5
            int r4 = (int) r4
            en6 r5 = r3.j(r7)
            qu r6 = r0.d
            float r4 = (float) r4
            r6.g(r5, r4)
        L26:
            r3.c(r0)
            return
    }

    public final void g(defpackage.en6 r4, defpackage.en6 r5, int r6, int r7) {
            r3 = this;
            yu r0 = r3.l()
            en6 r1 = r3.m()
            r2 = 0
            r1.R = r2
            r0.c(r4, r5, r1, r6)
            r4 = 8
            if (r7 == r4) goto L26
            qu r4 = r0.d
            float r4 = r4.c(r1)
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r4 = r4 * r5
            int r4 = (int) r4
            en6 r5 = r3.j(r7)
            qu r6 = r0.d
            float r4 = (float) r4
            r6.g(r5, r4)
        L26:
            r3.c(r0)
            return
    }

    public final void h(defpackage.yu r8) {
            r7 = this;
            boolean r0 = r8.e
            if (r0 == 0) goto Lc
            en6 r0 = r8.a
            float r8 = r8.b
            r0.d(r7, r8)
            goto L1d
        Lc:
            yu[] r0 = r7.g
            int r1 = r7.k
            r0[r1] = r8
            en6 r0 = r8.a
            r0.L = r1
            int r1 = r1 + 1
            r7.k = r1
            r0.e(r7, r8)
        L1d:
            boolean r8 = r7.b
            if (r8 == 0) goto L81
            r8 = 0
            r0 = r8
        L23:
            int r1 = r7.k
            if (r0 >= r1) goto L7f
            yu[] r1 = r7.g
            r1 = r1[r0]
            if (r1 != 0) goto L34
            java.io.PrintStream r1 = java.lang.System.out
            java.lang.String r2 = "WTF"
            r1.println(r2)
        L34:
            yu[] r1 = r7.g
            r1 = r1[r0]
            if (r1 == 0) goto L7c
            boolean r2 = r1.e
            if (r2 == 0) goto L7c
            en6 r2 = r1.a
            float r3 = r1.b
            r2.d(r7, r3)
            bt r2 = r7.m
            java.lang.Object r2 = r2.B
            tz4 r2 = (defpackage.tz4) r2
            r2.b(r1)
            yu[] r1 = r7.g
            r2 = 0
            r1[r0] = r2
            int r1 = r0 + 1
            r3 = r1
        L56:
            int r4 = r7.k
            if (r1 >= r4) goto L70
            yu[] r3 = r7.g
            int r4 = r1 + (-1)
            r5 = r3[r1]
            r3[r4] = r5
            en6 r3 = r5.a
            int r5 = r3.L
            if (r5 != r1) goto L6a
            r3.L = r4
        L6a:
            int r3 = r1 + 1
            r6 = r3
            r3 = r1
            r1 = r6
            goto L56
        L70:
            if (r3 >= r4) goto L76
            yu[] r1 = r7.g
            r1[r3] = r2
        L76:
            int r4 = r4 + (-1)
            r7.k = r4
            int r0 = r0 + (-1)
        L7c:
            int r0 = r0 + 1
            goto L23
        L7f:
            r7.b = r8
        L81:
            return
    }

    public final void i() {
            r3 = this;
            r0 = 0
        L1:
            int r1 = r3.k
            if (r0 >= r1) goto L12
            yu[] r1 = r3.g
            r1 = r1[r0]
            en6 r2 = r1.a
            float r1 = r1.b
            r2.X = r1
            int r0 = r0 + 1
            goto L1
        L12:
            return
    }

    public final defpackage.en6 j(int r5) {
            r4 = this;
            int r0 = r4.j
            int r0 = r0 + 1
            int r1 = r4.f
            if (r0 < r1) goto Lb
            r4.o()
        Lb:
            dn6 r0 = defpackage.dn6.ERROR
            en6 r0 = r4.a(r0)
            float[] r1 = r0.d0
            int r2 = r4.c
            int r2 = r2 + 1
            r4.c = r2
            int r3 = r4.j
            int r3 = r3 + 1
            r4.j = r3
            r0.B = r2
            r0.R = r5
            bt r5 = r4.m
            java.lang.Object r5 = r5.R
            en6[] r5 = (defpackage.en6[]) r5
            r5[r2] = r0
            c35 r4 = r4.d
            ap3 r5 = r4.i
            r5.B = r0
            r5 = 0
            java.util.Arrays.fill(r1, r5)
            int r5 = r0.R
            r2 = 1065353216(0x3f800000, float:1.0)
            r1[r5] = r2
            r4.j(r0)
            return r0
    }

    public final defpackage.en6 k(java.lang.Object r5) {
            r4 = this;
            if (r5 != 0) goto L3
            goto L50
        L3:
            int r0 = r4.j
            int r0 = r0 + 1
            int r1 = r4.f
            if (r0 < r1) goto Le
            r4.o()
        Le:
            boolean r0 = r5 instanceof defpackage.h11
            if (r0 == 0) goto L50
            h11 r5 = (defpackage.h11) r5
            en6 r0 = r5.i
            if (r0 != 0) goto L1d
            r5.k()
            en6 r0 = r5.i
        L1d:
            int r5 = r0.B
            r1 = -1
            bt r2 = r4.m
            if (r5 == r1) goto L32
            int r3 = r4.c
            if (r5 > r3) goto L32
            java.lang.Object r3 = r2.R
            en6[] r3 = (defpackage.en6[]) r3
            r3 = r3[r5]
            if (r3 != 0) goto L31
            goto L32
        L31:
            return r0
        L32:
            if (r5 == r1) goto L37
            r0.c()
        L37:
            int r5 = r4.c
            int r5 = r5 + 1
            r4.c = r5
            int r1 = r4.j
            int r1 = r1 + 1
            r4.j = r1
            r0.B = r5
            dn6 r4 = defpackage.dn6.UNRESTRICTED
            r0.e0 = r4
            java.lang.Object r4 = r2.R
            en6[] r4 = (defpackage.en6[]) r4
            r4[r5] = r0
            return r0
        L50:
            r4 = 0
            return r4
    }

    public final defpackage.yu l() {
            r5 = this;
            bt r5 = r5.m
            java.lang.Object r0 = r5.B
            tz4 r0 = (defpackage.tz4) r0
            int r1 = r0.b
            r2 = 0
            if (r1 <= 0) goto L16
            int r1 = r1 + (-1)
            java.lang.Object[] r3 = r0.a
            r4 = r3[r1]
            r3[r1] = r2
            r0.b = r1
            goto L17
        L16:
            r4 = r2
        L17:
            yu r4 = (defpackage.yu) r4
            if (r4 != 0) goto L21
            yu r4 = new yu
            r4.<init>(r5)
            goto L2e
        L21:
            r4.a = r2
            qu r5 = r4.d
            r5.b()
            r5 = 0
            r4.b = r5
            r5 = 0
            r4.e = r5
        L2e:
            return r4
    }

    public final defpackage.en6 m() {
            r3 = this;
            int r0 = r3.j
            int r0 = r0 + 1
            int r1 = r3.f
            if (r0 < r1) goto Lb
            r3.o()
        Lb:
            dn6 r0 = defpackage.dn6.SLACK
            en6 r0 = r3.a(r0)
            int r1 = r3.c
            int r1 = r1 + 1
            r3.c = r1
            int r2 = r3.j
            int r2 = r2 + 1
            r3.j = r2
            r0.B = r1
            bt r3 = r3.m
            java.lang.Object r3 = r3.R
            en6[] r3 = (defpackage.en6[]) r3
            r3[r1] = r0
            return r0
    }

    public final void o() {
            r3 = this;
            int r0 = r3.e
            int r0 = r0 * 2
            r3.e = r0
            yu[] r1 = r3.g
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
            yu[] r0 = (defpackage.yu[]) r0
            r3.g = r0
            bt r0 = r3.m
            java.lang.Object r1 = r0.R
            en6[] r1 = (defpackage.en6[]) r1
            int r2 = r3.e
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r2)
            en6[] r1 = (defpackage.en6[]) r1
            r0.R = r1
            int r0 = r3.e
            boolean[] r1 = new boolean[r0]
            r3.i = r1
            r3.f = r0
            r3.l = r0
            return
    }

    public final void p() {
            r3 = this;
            c35 r0 = r3.d
            boolean r1 = r0.e()
            if (r1 == 0) goto Lc
            r3.i()
            return
        Lc:
            boolean r1 = r3.h
            if (r1 == 0) goto L28
            r1 = 0
        L11:
            int r2 = r3.k
            if (r1 >= r2) goto L24
            yu[] r2 = r3.g
            r2 = r2[r1]
            boolean r2 = r2.e
            if (r2 != 0) goto L21
            r3.q(r0)
            return
        L21:
            int r1 = r1 + 1
            goto L11
        L24:
            r3.i()
            return
        L28:
            r3.q(r0)
            return
    }

    public final void q(defpackage.c35 r19) {
            r18 = this;
            r0 = r18
            r2 = 0
        L3:
            int r3 = r0.k
            if (r2 >= r3) goto Lb1
            yu[] r3 = r0.g
            r3 = r3[r2]
            en6 r4 = r3.a
            dn6 r4 = r4.e0
            dn6 r5 = defpackage.dn6.UNRESTRICTED
            if (r4 != r5) goto L15
            goto Lad
        L15:
            float r3 = r3.b
            r4 = 0
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 >= 0) goto Lad
            r2 = 0
            r3 = 0
        L1e:
            if (r2 != 0) goto Lb1
            r5 = 1
            int r3 = r3 + r5
            r6 = -1
            r7 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r9 = r6
            r10 = r9
            r8 = 0
            r11 = 0
        L2a:
            int r12 = r0.k
            if (r8 >= r12) goto L85
            yu[] r12 = r0.g
            r12 = r12[r8]
            en6 r13 = r12.a
            dn6 r13 = r13.e0
            dn6 r14 = defpackage.dn6.UNRESTRICTED
            if (r13 != r14) goto L3b
            goto L80
        L3b:
            boolean r13 = r12.e
            if (r13 == 0) goto L40
            goto L80
        L40:
            float r13 = r12.b
            int r13 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r13 >= 0) goto L80
            qu r13 = r12.d
            int r13 = r13.d()
            r14 = 0
        L4d:
            if (r14 >= r13) goto L80
            qu r15 = r12.d
            en6 r15 = r15.e(r14)
            qu r1 = r12.d
            float r1 = r1.c(r15)
            int r16 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r16 > 0) goto L60
            goto L7b
        L60:
            r4 = 0
        L61:
            r5 = 9
            if (r4 >= r5) goto L7b
            float[] r5 = r15.Z
            r5 = r5[r4]
            float r5 = r5 / r1
            int r17 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r17 >= 0) goto L70
            if (r4 == r11) goto L72
        L70:
            if (r4 <= r11) goto L78
        L72:
            int r7 = r15.B
            r11 = r4
            r10 = r7
            r9 = r8
            r7 = r5
        L78:
            int r4 = r4 + 1
            goto L61
        L7b:
            int r14 = r14 + 1
            r4 = 0
            r5 = 1
            goto L4d
        L80:
            int r8 = r8 + 1
            r4 = 0
            r5 = 1
            goto L2a
        L85:
            if (r9 == r6) goto La2
            yu[] r1 = r0.g
            r1 = r1[r9]
            en6 r4 = r1.a
            r4.L = r6
            bt r4 = r0.m
            java.lang.Object r4 = r4.R
            en6[] r4 = (defpackage.en6[]) r4
            r4 = r4[r10]
            r1.g(r4)
            en6 r4 = r1.a
            r4.L = r9
            r4.e(r0, r1)
            goto La3
        La2:
            r2 = 1
        La3:
            int r1 = r0.j
            int r1 = r1 / 2
            if (r3 <= r1) goto Laa
            r2 = 1
        Laa:
            r4 = 0
            goto L1e
        Lad:
            int r2 = r2 + 1
            goto L3
        Lb1:
            r18.r(r19)
            r0.i()
            return
    }

    public final void r(defpackage.yu r17) {
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = 0
            r3 = r2
        L6:
            int r4 = r0.j
            if (r3 >= r4) goto L11
            boolean[] r4 = r0.i
            r4[r3] = r2
            int r3 = r3 + 1
            goto L6
        L11:
            r3 = r2
            r4 = r3
        L13:
            if (r3 != 0) goto Lb0
            r5 = 1
            int r4 = r4 + r5
            int r6 = r0.j
            int r6 = r6 * 2
            if (r4 < r6) goto L1f
            goto Lb0
        L1f:
            en6 r6 = r1.a
            if (r6 == 0) goto L29
            boolean[] r7 = r0.i
            int r6 = r6.B
            r7[r6] = r5
        L29:
            boolean[] r6 = r0.i
            en6 r6 = r1.d(r6)
            if (r6 == 0) goto L3d
            boolean[] r7 = r0.i
            int r8 = r6.B
            boolean r9 = r7[r8]
            if (r9 == 0) goto L3b
            goto Lb0
        L3b:
            r7[r8] = r5
        L3d:
            if (r6 == 0) goto Lac
            r7 = -1
            r8 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r9 = r2
            r10 = r7
        L45:
            int r11 = r0.k
            if (r9 >= r11) goto L97
            yu[] r11 = r0.g
            r11 = r11[r9]
            en6 r12 = r11.a
            dn6 r12 = r12.e0
            dn6 r13 = defpackage.dn6.UNRESTRICTED
            if (r12 != r13) goto L56
            goto L93
        L56:
            boolean r12 = r11.e
            if (r12 == 0) goto L5b
            goto L93
        L5b:
            qu r12 = r11.d
            int r13 = r12.h
            if (r13 != r7) goto L62
            goto L7b
        L62:
            r14 = r2
        L63:
            if (r13 == r7) goto L7b
            int r15 = r12.a
            if (r14 >= r15) goto L7b
            int[] r15 = r12.e
            r15 = r15[r13]
            int r2 = r6.B
            if (r15 != r2) goto L73
            r2 = r5
            goto L7c
        L73:
            int[] r2 = r12.f
            r13 = r2[r13]
            int r14 = r14 + 1
            r2 = 0
            goto L63
        L7b:
            r2 = 0
        L7c:
            if (r2 == 0) goto L93
            qu r2 = r11.d
            float r2 = r2.c(r6)
            r12 = 0
            int r12 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r12 >= 0) goto L93
            float r11 = r11.b
            float r11 = -r11
            float r11 = r11 / r2
            int r2 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r2 >= 0) goto L93
            r10 = r9
            r8 = r11
        L93:
            int r9 = r9 + 1
            r2 = 0
            goto L45
        L97:
            if (r10 <= r7) goto Lad
            yu[] r2 = r0.g
            r2 = r2[r10]
            en6 r5 = r2.a
            r5.L = r7
            r2.g(r6)
            en6 r5 = r2.a
            r5.L = r10
            r5.e(r0, r2)
            goto Lad
        Lac:
            r3 = r5
        Lad:
            r2 = 0
            goto L13
        Lb0:
            return
    }

    public final void s() {
            r3 = this;
            r0 = 0
        L1:
            int r1 = r3.k
            if (r0 >= r1) goto L1c
            yu[] r1 = r3.g
            r1 = r1[r0]
            if (r1 == 0) goto L14
            bt r2 = r3.m
            java.lang.Object r2 = r2.B
            tz4 r2 = (defpackage.tz4) r2
            r2.b(r1)
        L14:
            yu[] r1 = r3.g
            r2 = 0
            r1[r0] = r2
            int r0 = r0 + 1
            goto L1
        L1c:
            return
    }

    public final void t() {
            r10 = this;
            r0 = 0
            r1 = r0
        L2:
            bt r2 = r10.m
            java.lang.Object r3 = r2.R
            en6[] r3 = (defpackage.en6[]) r3
            int r4 = r3.length
            if (r1 >= r4) goto L15
            r2 = r3[r1]
            if (r2 == 0) goto L12
            r2.c()
        L12:
            int r1 = r1 + 1
            goto L2
        L15:
            java.lang.Object r1 = r2.L
            tz4 r1 = (defpackage.tz4) r1
            en6[] r3 = r10.n
            int r4 = r10.o
            r1.getClass()
            int r5 = r3.length
            if (r4 <= r5) goto L24
            int r4 = r3.length
        L24:
            r5 = r0
        L25:
            if (r5 >= r4) goto L39
            r6 = r3[r5]
            int r7 = r1.b
            java.lang.Object[] r8 = r1.a
            int r9 = r8.length
            if (r7 >= r9) goto L36
            r8[r7] = r6
            int r7 = r7 + 1
            r1.b = r7
        L36:
            int r5 = r5 + 1
            goto L25
        L39:
            r10.o = r0
            java.lang.Object r1 = r2.R
            en6[] r1 = (defpackage.en6[]) r1
            r3 = 0
            java.util.Arrays.fill(r1, r3)
            r10.c = r0
            c35 r1 = r10.d
            r1.h = r0
            r3 = 0
            r1.b = r3
            r1 = 1
            r10.j = r1
            r1 = r0
        L50:
            int r3 = r10.k
            if (r1 >= r3) goto L5b
            yu[] r3 = r10.g
            r3 = r3[r1]
            int r1 = r1 + 1
            goto L50
        L5b:
            r10.s()
            r10.k = r0
            yu r0 = new yu
            r0.<init>(r2)
            r10.p = r0
            return
    }
}
