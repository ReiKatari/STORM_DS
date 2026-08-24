package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xi3  reason: default package */
/* loaded from: classes.dex */
public final class xi3 {
    public final int a;
    public final int[] b;
    public final defpackage.ga0 c;
    public final short[][] d;
    public final short[] e;
    public final short[] f;
    public final short[] g;
    public final short[] h;
    public final short[][] i;
    public final short[][] j;
    public final short[][] k;
    public final short[] l;
    public final defpackage.ui3 m;
    public final defpackage.ao4 n;
    public final defpackage.m42 o;
    public final defpackage.s9 p;
    public final defpackage.s9 q;

    public xi3(defpackage.ui3 r17, defpackage.ao4 r18, int r19, int r20, int r21) {
            r16 = this;
            r0 = r16
            r0.<init>()
            r1 = 4
            int[] r2 = new int[r1]
            r0.b = r2
            ga0 r2 = new ga0
            r3 = 8
            r2.<init>(r3)
            r0.c = r2
            r2 = 2
            int[] r3 = new int[r2]
            r4 = 1
            r5 = 16
            r3[r4] = r5
            r6 = 0
            r7 = 12
            r3[r6] = r7
            java.lang.Class r8 = java.lang.Short.TYPE
            java.lang.Object r3 = java.lang.reflect.Array.newInstance(r8, r3)
            short[][] r3 = (short[][]) r3
            r0.d = r3
            short[] r3 = new short[r7]
            r0.e = r3
            short[] r3 = new short[r7]
            r0.f = r3
            short[] r3 = new short[r7]
            r0.g = r3
            short[] r3 = new short[r7]
            r0.h = r3
            int[] r3 = new int[r2]
            r3[r4] = r5
            r3[r6] = r7
            java.lang.Object r3 = java.lang.reflect.Array.newInstance(r8, r3)
            short[][] r3 = (short[][]) r3
            r0.i = r3
            int[] r3 = new int[r2]
            r7 = 64
            r3[r4] = r7
            r3[r6] = r1
            java.lang.Object r3 = java.lang.reflect.Array.newInstance(r8, r3)
            short[][] r3 = (short[][]) r3
            r0.j = r3
            short[] r6 = new short[r2]
            short[] r7 = new short[r2]
            short[] r8 = new short[r1]
            short[] r9 = new short[r1]
            r1 = 8
            short[] r10 = new short[r1]
            short[] r11 = new short[r1]
            short[] r12 = new short[r5]
            short[] r13 = new short[r5]
            r1 = 32
            short[] r14 = new short[r1]
            short[] r15 = new short[r1]
            short[][] r1 = new short[][]{r6, r7, r8, r9, r10, r11, r12, r13, r14, r15}
            r0.k = r1
            short[] r1 = new short[r5]
            r0.l = r1
            int r1 = r4 << r21
            int r1 = r1 - r4
            r0.a = r1
            s9 r1 = new s9
            r1.<init>(r0)
            r0.p = r1
            s9 r1 = new s9
            r1.<init>(r0)
            r0.q = r1
            r1 = r17
            r0.m = r1
            r1 = r18
            r0.n = r1
            m42 r1 = new m42
            r2 = r19
            r3 = r20
            r1.<init>(r0, r2, r3)
            r0.o = r1
            r0.b()
            return
    }

    public final void a() {
            r15 = this;
            ui3 r0 = r15.m
            int r1 = r0.g
            if (r1 <= 0) goto Lb
            int r2 = r0.h
            r0.a(r2, r1)
        Lb:
            int r1 = r0.d
            int r2 = r0.f
            ao4 r3 = r15.n
            if (r1 >= r2) goto L1cf
            int r2 = r15.a
            r1 = r1 & r2
            short[][] r2 = r15.d
            ga0 r4 = r15.c
            int r5 = r4.b
            r2 = r2[r5]
            int r2 = r3.a(r2, r1)
            r5 = 9
            r6 = 3
            r7 = 7
            r8 = 1
            r9 = 0
            if (r2 != 0) goto Lc5
            m42 r1 = r15.o
            java.lang.Object r2 = r1.e
            xi3 r2 = (defpackage.xi3) r2
            ui3 r2 = r2.m
            int r3 = r2.d
            int r4 = r3 + (-1)
            if (r3 > 0) goto L3b
            int r10 = r2.b
            int r4 = r4 + r10
        L3b:
            byte[] r2 = r2.a
            r2 = r2[r4]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r4 = r1.b
            int r10 = 8 - r4
            int r2 = r2 >> r10
            int r10 = r1.c
            r3 = r3 & r10
            int r3 = r3 << r4
            int r2 = r2 + r3
            java.lang.Object r1 = r1.d
            yc1[] r1 = (defpackage.yc1[]) r1
            r1 = r1[r2]
            java.lang.Object r2 = r1.A
            short[] r2 = (short[]) r2
            java.lang.Object r1 = r1.B
            m42 r1 = (defpackage.m42) r1
            java.lang.Object r1 = r1.e
            xi3 r1 = (defpackage.xi3) r1
            ui3 r10 = r1.m
            ao4 r11 = r1.n
            ga0 r12 = r1.c
            int r3 = r12.b
            r13 = 256(0x100, float:3.59E-43)
            if (r3 >= r7) goto L74
        L69:
            int r1 = r8 << 1
            int r3 = r11.a(r2, r8)
            r8 = r1 | r3
            if (r8 < r13) goto L69
            goto L9e
        L74:
            int[] r1 = r1.b
            r1 = r1[r9]
            int r3 = r10.d
            int r4 = r3 - r1
            int r4 = r4 - r8
            if (r1 < r3) goto L82
            int r1 = r10.b
            int r4 = r4 + r1
        L82:
            byte[] r1 = r10.a
            r1 = r1[r4]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r4 = r8
            r3 = r13
        L8a:
            int r1 = r1 << r8
            r7 = r1 & r3
            int r14 = r3 + r7
            int r14 = r14 + r4
            int r14 = r11.a(r2, r14)
            int r4 = r4 << r8
            r4 = r4 | r14
            int r14 = 0 - r14
            int r7 = ~r7
            r7 = r7 ^ r14
            r3 = r3 & r7
            if (r4 < r13) goto L8a
            r8 = r4
        L9e:
            byte r1 = (byte) r8
            byte[] r2 = r10.a
            int r3 = r10.d
            int r4 = r3 + 1
            r10.d = r4
            r2[r3] = r1
            int r1 = r10.e
            if (r1 >= r4) goto Laf
            r10.e = r4
        Laf:
            int r1 = r12.b
            if (r1 > r6) goto Lb7
            r12.b = r9
            goto Lb
        Lb7:
            if (r1 > r5) goto Lbf
            int r1 = r1 + (-3)
            r12.b = r1
            goto Lb
        Lbf:
            int r1 = r1 + (-6)
            r12.b = r1
            goto Lb
        Lc5:
            short[] r2 = r15.e
            int r10 = r4.b
            int r2 = r3.a(r2, r10)
            r10 = 2
            int[] r11 = r15.b
            if (r2 != 0) goto L16e
            int r2 = r4.b
            if (r2 >= r7) goto Ld7
            goto Ld9
        Ld7:
            r7 = 10
        Ld9:
            r4.b = r7
            r2 = r11[r10]
            r11[r6] = r2
            r2 = r11[r8]
            r11[r10] = r2
            r2 = r11[r9]
            r11[r8] = r2
            s9 r2 = r15.p
            int r2 = r2.t(r1)
            r1 = 6
            if (r2 >= r1) goto Lf2
            int r6 = r2 + (-2)
        Lf2:
            short[][] r1 = r15.j
            r1 = r1[r6]
            int r1 = r3.b(r1)
            r4 = 4
            if (r1 >= r4) goto L101
            r11[r9] = r1
            goto L1c8
        L101:
            int r4 = r1 >> 1
            int r5 = r4 + (-1)
            r6 = r1 & 1
            r6 = r6 | r10
            int r12 = r6 << r5
            r11[r9] = r12
            r5 = 14
            if (r1 >= r5) goto L12f
            int r1 = r1 + (-4)
            short[][] r4 = r15.k
            r1 = r4[r1]
            r4 = r8
            r5 = r9
            r6 = r5
        L119:
            int r7 = r3.a(r1, r4)
            int r4 = r4 << r8
            r4 = r4 | r7
            int r10 = r6 + 1
            int r6 = r7 << r6
            r5 = r5 | r6
            int r6 = r1.length
            if (r4 < r6) goto L12d
            r1 = r12 | r5
            r11[r9] = r1
            goto L1c8
        L12d:
            r6 = r10
            goto L119
        L12f:
            int r4 = r4 + (-5)
            r1 = r9
        L132:
            r3.f()
            int r5 = r3.b
            int r5 = r5 >>> r8
            r3.b = r5
            int r6 = r3.c
            int r7 = r6 - r5
            int r7 = r7 >>> 31
            int r10 = r7 + (-1)
            r5 = r5 & r10
            int r6 = r6 - r5
            r3.c = r6
            int r1 = r1 << r8
            int r5 = 1 - r7
            r1 = r1 | r5
            int r4 = r4 + (-1)
            if (r4 != 0) goto L132
            int r1 = r1 << 4
            r5 = r12 | r1
            r11[r9] = r5
            r1 = r8
            r4 = r9
            r6 = r4
        L157:
            short[] r7 = r15.l
            int r10 = r3.a(r7, r1)
            int r1 = r1 << r8
            r1 = r1 | r10
            int r12 = r6 + 1
            int r6 = r10 << r6
            r4 = r4 | r6
            int r6 = r7.length
            if (r1 < r6) goto L16c
            r1 = r5 | r4
            r11[r9] = r1
            goto L1c8
        L16c:
            r6 = r12
            goto L157
        L16e:
            short[] r2 = r15.f
            int r12 = r4.b
            int r2 = r3.a(r2, r12)
            r12 = 11
            if (r2 != 0) goto L18f
            short[][] r2 = r15.i
            int r6 = r4.b
            r2 = r2[r6]
            int r2 = r3.a(r2, r1)
            if (r2 != 0) goto L1b9
            int r1 = r4.b
            if (r1 >= r7) goto L18b
            goto L18c
        L18b:
            r5 = r12
        L18c:
            r4.b = r5
            goto L1c7
        L18f:
            short[] r2 = r15.g
            int r5 = r4.b
            int r2 = r3.a(r2, r5)
            if (r2 != 0) goto L19c
            r2 = r11[r8]
            goto L1b3
        L19c:
            short[] r2 = r15.h
            int r5 = r4.b
            int r2 = r3.a(r2, r5)
            if (r2 != 0) goto L1a9
            r2 = r11[r10]
            goto L1af
        L1a9:
            r2 = r11[r6]
            r3 = r11[r10]
            r11[r6] = r3
        L1af:
            r3 = r11[r8]
            r11[r10] = r3
        L1b3:
            r3 = r11[r9]
            r11[r8] = r3
            r11[r9] = r2
        L1b9:
            int r2 = r4.b
            if (r2 >= r7) goto L1bf
            r12 = 8
        L1bf:
            r4.b = r12
            s9 r2 = r15.q
            int r8 = r2.t(r1)
        L1c7:
            r2 = r8
        L1c8:
            r1 = r11[r9]
            r0.a(r1, r2)
            goto Lb
        L1cf:
            r3.f()
            return
    }

    public final void b() {
            r4 = this;
            int[] r0 = r4.b
            r1 = 0
            r0[r1] = r1
            r2 = 1
            r0[r2] = r1
            r2 = 2
            r0[r2] = r1
            r2 = 3
            r0[r2] = r1
            ga0 r0 = r4.c
            r0.b = r1
            r0 = r1
        L13:
            short[][] r2 = r4.d
            int r3 = r2.length
            if (r0 >= r3) goto L20
            r2 = r2[r0]
            defpackage.ao4.e(r2)
            int r0 = r0 + 1
            goto L13
        L20:
            short[] r0 = r4.e
            defpackage.ao4.e(r0)
            short[] r0 = r4.f
            defpackage.ao4.e(r0)
            short[] r0 = r4.g
            defpackage.ao4.e(r0)
            short[] r0 = r4.h
            defpackage.ao4.e(r0)
            r0 = r1
        L35:
            short[][] r2 = r4.i
            int r3 = r2.length
            if (r0 >= r3) goto L42
            r2 = r2[r0]
            defpackage.ao4.e(r2)
            int r0 = r0 + 1
            goto L35
        L42:
            r0 = r1
        L43:
            short[][] r2 = r4.j
            int r3 = r2.length
            if (r0 >= r3) goto L50
            r2 = r2[r0]
            defpackage.ao4.e(r2)
            int r0 = r0 + 1
            goto L43
        L50:
            r0 = r1
        L51:
            short[][] r2 = r4.k
            int r3 = r2.length
            if (r0 >= r3) goto L5e
            r2 = r2[r0]
            defpackage.ao4.e(r2)
            int r0 = r0 + 1
            goto L51
        L5e:
            short[] r0 = r4.l
            defpackage.ao4.e(r0)
        L63:
            m42 r0 = r4.o
            java.lang.Object r0 = r0.d
            yc1[] r0 = (defpackage.yc1[]) r0
            int r2 = r0.length
            if (r1 >= r2) goto L78
            r0 = r0[r1]
            java.lang.Object r0 = r0.A
            short[] r0 = (short[]) r0
            defpackage.ao4.e(r0)
            int r1 = r1 + 1
            goto L63
        L78:
            s9 r0 = r4.p
            r0.F()
            s9 r4 = r4.q
            r4.F()
            return
    }
}
