package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gq  reason: default package */
/* loaded from: classes.dex */
public abstract class gq {
    public static final defpackage.a74 a = null;
    public static final defpackage.a74 b = null;
    public static final defpackage.gd2 c = null;

    static {
            r0 = 1094713344(0x41400000, float:12.0)
            x64 r1 = defpackage.x64.a
            a74 r0 = defpackage.dj6.l(r1, r0)
            defpackage.gq.a = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            a74 r0 = defpackage.dj6.b(r1, r0)
            r1 = 1116209152(0x42880000, float:68.0)
            a74 r0 = defpackage.dj6.l(r0, r1)
            defpackage.gq.b = r0
            gd2 r0 = new gd2
            r0.<init>()
            defpackage.gq.c = r0
            return
    }

    public static final void a(long r22, long r24, float r26, defpackage.lq4 r27, defpackage.tt7 r28, defpackage.a74 r29, defpackage.zv0 r30, defpackage.px0 r31, int r32) {
            r6 = r27
            r7 = r28
            r9 = r30
            r10 = r32
            jy2 r12 = defpackage.u24.m
            r0 = r31
            xq2 r0 = (defpackage.xq2) r0
            r1 = 1222317265(0x48db14d1, float:448678.53)
            r0.d0(r1)
            r1 = r10 & 6
            r13 = r22
            if (r1 != 0) goto L25
            boolean r1 = r0.e(r13)
            if (r1 == 0) goto L22
            r1 = 4
            goto L23
        L22:
            r1 = 2
        L23:
            r1 = r1 | r10
            goto L26
        L25:
            r1 = r10
        L26:
            r2 = r10 & 48
            r3 = r24
            if (r2 != 0) goto L38
            boolean r2 = r0.e(r3)
            if (r2 == 0) goto L35
            r2 = 32
            goto L37
        L35:
            r2 = 16
        L37:
            r1 = r1 | r2
        L38:
            r2 = r10 & 384(0x180, float:5.38E-43)
            r5 = r26
            if (r2 != 0) goto L4a
            boolean r2 = r0.c(r5)
            if (r2 == 0) goto L47
            r2 = 256(0x100, float:3.59E-43)
            goto L49
        L47:
            r2 = 128(0x80, float:1.8E-43)
        L49:
            r1 = r1 | r2
        L4a:
            r2 = r10 & 3072(0xc00, float:4.305E-42)
            if (r2 != 0) goto L5a
            boolean r2 = r0.f(r6)
            if (r2 == 0) goto L57
            r2 = 2048(0x800, float:2.87E-42)
            goto L59
        L57:
            r2 = 1024(0x400, float:1.435E-42)
        L59:
            r1 = r1 | r2
        L5a:
            r2 = r10 & 24576(0x6000, float:3.4438E-41)
            if (r2 != 0) goto L6a
            boolean r2 = r0.f(r12)
            if (r2 == 0) goto L67
            r2 = 16384(0x4000, float:2.2959E-41)
            goto L69
        L67:
            r2 = 8192(0x2000, float:1.148E-41)
        L69:
            r1 = r1 | r2
        L6a:
            r2 = 196608(0x30000, float:2.75506E-40)
            r2 = r2 & r10
            if (r2 != 0) goto L7b
            boolean r2 = r0.f(r7)
            if (r2 == 0) goto L78
            r2 = 131072(0x20000, float:1.83671E-40)
            goto L7a
        L78:
            r2 = 65536(0x10000, float:9.1835E-41)
        L7a:
            r1 = r1 | r2
        L7b:
            r2 = 1572864(0x180000, float:2.204052E-39)
            r8 = r10 & r2
            if (r8 != 0) goto L90
            r8 = r29
            boolean r11 = r0.f(r8)
            if (r11 == 0) goto L8c
            r11 = 1048576(0x100000, float:1.469368E-39)
            goto L8e
        L8c:
            r11 = 524288(0x80000, float:7.34684E-40)
        L8e:
            r1 = r1 | r11
            goto L92
        L90:
            r8 = r29
        L92:
            r11 = 12582912(0xc00000, float:1.7632415E-38)
            r11 = r11 & r10
            if (r11 != 0) goto La3
            boolean r11 = r0.h(r9)
            if (r11 == 0) goto La0
            r11 = 8388608(0x800000, float:1.1754944E-38)
            goto La2
        La0:
            r11 = 4194304(0x400000, float:5.877472E-39)
        La2:
            r1 = r1 | r11
        La3:
            r11 = 4793491(0x492493, float:6.717112E-39)
            r11 = r11 & r1
            r15 = 4793490(0x492492, float:6.71711E-39)
            r31 = r2
            r2 = 0
            if (r11 == r15) goto Lb1
            r11 = 1
            goto Lb2
        Lb1:
            r11 = r2
        Lb2:
            r15 = r1 & 1
            boolean r11 = r0.S(r15, r11)
            if (r11 == 0) goto Lec
            cq r11 = new cq
            r11.<init>(r7, r6, r9, r2)
            r2 = -1628734195(0xffffffff9eeb7d0d, float:-2.4933313E-20)
            zv0 r18 = defpackage.n16.I(r2, r11, r0)
            int r2 = r1 >> 18
            r2 = r2 & 14
            r2 = r2 | r31
            int r11 = r1 >> 9
            r11 = r11 & 112(0x70, float:1.57E-43)
            r2 = r2 | r11
            int r11 = r1 << 6
            r15 = r11 & 896(0x380, float:1.256E-42)
            r2 = r2 | r15
            r11 = r11 & 7168(0x1c00, float:1.0045E-41)
            r2 = r2 | r11
            r11 = 458752(0x70000, float:6.42848E-40)
            int r1 = r1 << 9
            r1 = r1 & r11
            r20 = r2 | r1
            r21 = 16
            r19 = r0
            r15 = r3
            r17 = r5
            r11 = r8
            defpackage.ej2.c(r11, r12, r13, r15, r17, r18, r19, r20, r21)
            goto Lf1
        Lec:
            r19 = r0
            r19.V()
        Lf1:
            cf5 r11 = r19.t()
            if (r11 == 0) goto L106
            dq r0 = new dq
            r1 = r22
            r3 = r24
            r5 = r26
            r8 = r29
            r0.<init>(r1, r3, r5, r6, r7, r8, r9, r10)
            r11.d = r0
        L106:
            return
    }

    public static final void b(defpackage.zv0 r19, defpackage.tt7 r20, defpackage.a74 r21, defpackage.eo2 r22, defpackage.fo2 r23, long r24, long r26, float r28, defpackage.px0 r29, int r30, int r31) {
            r1 = r19
            r4 = r22
            r5 = r24
            r0 = r30
            r2 = r31
            r14 = r29
            xq2 r14 = (defpackage.xq2) r14
            r3 = 138090236(0x83b16fc, float:5.6300284E-34)
            r14.d0(r3)
            r3 = r0 & 6
            if (r3 != 0) goto L23
            boolean r3 = r14.h(r1)
            if (r3 == 0) goto L20
            r3 = 4
            goto L21
        L20:
            r3 = 2
        L21:
            r3 = r3 | r0
            goto L24
        L23:
            r3 = r0
        L24:
            r7 = r0 & 48
            r11 = r20
            if (r7 != 0) goto L36
            boolean r7 = r14.f(r11)
            if (r7 == 0) goto L33
            r7 = 32
            goto L35
        L33:
            r7 = 16
        L35:
            r3 = r3 | r7
        L36:
            r7 = r2 & 4
            if (r7 == 0) goto L3f
            r3 = r3 | 384(0x180, float:5.38E-43)
        L3c:
            r8 = r21
            goto L51
        L3f:
            r8 = r0 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L3c
            r8 = r21
            boolean r9 = r14.f(r8)
            if (r9 == 0) goto L4e
            r9 = 256(0x100, float:3.59E-43)
            goto L50
        L4e:
            r9 = 128(0x80, float:1.8E-43)
        L50:
            r3 = r3 | r9
        L51:
            r9 = r0 & 3072(0xc00, float:4.305E-42)
            if (r9 != 0) goto L61
            boolean r9 = r14.h(r4)
            if (r9 == 0) goto L5e
            r9 = 2048(0x800, float:2.87E-42)
            goto L60
        L5e:
            r9 = 1024(0x400, float:1.435E-42)
        L60:
            r3 = r3 | r9
        L61:
            r9 = r2 & 16
            if (r9 == 0) goto L6a
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
        L67:
            r10 = r23
            goto L7c
        L6a:
            r10 = r0 & 24576(0x6000, float:3.4438E-41)
            if (r10 != 0) goto L67
            r10 = r23
            boolean r12 = r14.h(r10)
            if (r12 == 0) goto L79
            r12 = 16384(0x4000, float:2.2959E-41)
            goto L7b
        L79:
            r12 = 8192(0x2000, float:1.148E-41)
        L7b:
            r3 = r3 | r12
        L7c:
            r12 = 196608(0x30000, float:2.75506E-40)
            r12 = r12 & r0
            if (r12 != 0) goto L8d
            boolean r12 = r14.e(r5)
            if (r12 == 0) goto L8a
            r12 = 131072(0x20000, float:1.83671E-40)
            goto L8c
        L8a:
            r12 = 65536(0x10000, float:9.1835E-41)
        L8c:
            r3 = r3 | r12
        L8d:
            r12 = 1572864(0x180000, float:2.204052E-39)
            r12 = r12 & r0
            if (r12 != 0) goto La7
            r12 = r2 & 64
            if (r12 != 0) goto La1
            r12 = r26
            boolean r15 = r14.e(r12)
            if (r15 == 0) goto La3
            r15 = 1048576(0x100000, float:1.469368E-39)
            goto La5
        La1:
            r12 = r26
        La3:
            r15 = 524288(0x80000, float:7.34684E-40)
        La5:
            r3 = r3 | r15
            goto La9
        La7:
            r12 = r26
        La9:
            r15 = r2 & 128(0x80, float:1.8E-43)
            r16 = 12582912(0xc00000, float:1.7632415E-38)
            if (r15 == 0) goto Lb4
            r3 = r3 | r16
            r0 = r28
            goto Lc7
        Lb4:
            r16 = r0 & r16
            r0 = r28
            if (r16 != 0) goto Lc7
            boolean r16 = r14.c(r0)
            if (r16 == 0) goto Lc3
            r16 = 8388608(0x800000, float:1.1754944E-38)
            goto Lc5
        Lc3:
            r16 = 4194304(0x400000, float:5.877472E-39)
        Lc5:
            r3 = r3 | r16
        Lc7:
            r16 = 4793491(0x492493, float:6.717112E-39)
            r0 = r3 & r16
            r2 = 4793490(0x492492, float:6.71711E-39)
            r29 = r3
            r3 = 1
            if (r0 == r2) goto Ld6
            r0 = r3
            goto Ld7
        Ld6:
            r0 = 0
        Ld7:
            r2 = r29 & 1
            boolean r0 = r14.S(r2, r0)
            if (r0 == 0) goto L165
            r14.X()
            r0 = r30 & 1
            r2 = -3670017(0xffffffffffc7ffff, float:NaN)
            if (r0 == 0) goto L10d
            boolean r0 = r14.B()
            if (r0 == 0) goto Lf0
            goto L10d
        Lf0:
            r14.V()
            r0 = r31 & 64
            if (r0 == 0) goto L103
            r0 = r29 & r2
        Lf9:
            r17 = r12
            r12 = r8
            r7 = r17
            r9 = r28
        L100:
            r2 = r0
        L101:
            r0 = r10
            goto L131
        L103:
            r17 = r12
            r12 = r8
            r7 = r17
            r9 = r28
            r2 = r29
            goto L101
        L10d:
            if (r7 == 0) goto L112
            x64 r0 = defpackage.x64.a
            r8 = r0
        L112:
            if (r9 == 0) goto L117
            zv0 r0 = defpackage.g04.b
            r10 = r0
        L117:
            r0 = r31 & 64
            if (r0 == 0) goto L122
            long r12 = defpackage.vt0.b(r5, r14)
            r0 = r29 & r2
            goto L124
        L122:
            r0 = r29
        L124:
            if (r15 == 0) goto Lf9
            pq4 r2 = defpackage.zp.a
            r2 = 1082130432(0x40800000, float:4.0)
            r17 = r12
            r12 = r8
            r7 = r17
            r9 = r2
            goto L100
        L131:
            r14.q()
            pq4 r10 = defpackage.zp.a
            m4 r13 = new m4
            r13.<init>(r4, r1, r0, r3)
            r3 = -2019867954(0xffffffff879b42ce, float:-2.3361072E-34)
            zv0 r13 = defpackage.n16.I(r3, r13, r14)
            int r3 = r2 >> 15
            r15 = r3 & 14
            r16 = 12610560(0xc06c00, float:1.7671158E-38)
            r15 = r15 | r16
            r16 = r3 & 112(0x70, float:1.57E-43)
            r15 = r15 | r16
            r3 = r3 & 896(0x380, float:1.256E-42)
            r3 = r3 | r15
            int r2 = r2 << 12
            r15 = 458752(0x70000, float:6.42848E-40)
            r15 = r15 & r2
            r3 = r3 | r15
            r15 = 3670016(0x380000, float:5.142788E-39)
            r2 = r2 & r15
            r15 = r3 | r2
            a(r5, r7, r9, r10, r11, r12, r13, r14, r15)
            r5 = r0
            r10 = r9
            r3 = r12
            r8 = r7
            goto L16d
        L165:
            r14.V()
            r3 = r8
            r5 = r10
            r8 = r12
            r10 = r28
        L16d:
            cf5 r13 = r14.t()
            if (r13 == 0) goto L182
            bq r0 = new bq
            r2 = r20
            r6 = r24
            r11 = r30
            r12 = r31
            r0.<init>(r1, r2, r3, r4, r5, r6, r8, r10, r11, r12)
            r13.d = r0
        L182:
            return
    }

    public static final void c(defpackage.zv0 r15, defpackage.a74 r16, defpackage.eo2 r17, defpackage.fo2 r18, long r19, long r21, float r23, defpackage.px0 r24, int r25, int r26) {
            r5 = r19
            r13 = r25
            r10 = r24
            xq2 r10 = (defpackage.xq2) r10
            r0 = -350082398(0xffffffffeb222aa2, float:-1.9604731E26)
            r10.d0(r0)
            r0 = r26 & 2
            if (r0 == 0) goto L18
            r1 = r13 | 48
            r2 = r1
            r1 = r16
            goto L2e
        L18:
            r1 = r13 & 48
            if (r1 != 0) goto L2b
            r1 = r16
            boolean r2 = r10.f(r1)
            if (r2 == 0) goto L27
            r2 = 32
            goto L29
        L27:
            r2 = 16
        L29:
            r2 = r2 | r13
            goto L2e
        L2b:
            r1 = r16
            r2 = r13
        L2e:
            r3 = r26 & 8
            if (r3 == 0) goto L37
            r2 = r2 | 3072(0xc00, float:4.305E-42)
        L34:
            r4 = r18
            goto L49
        L37:
            r4 = r13 & 3072(0xc00, float:4.305E-42)
            if (r4 != 0) goto L34
            r4 = r18
            boolean r7 = r10.h(r4)
            if (r7 == 0) goto L46
            r7 = 2048(0x800, float:2.87E-42)
            goto L48
        L46:
            r7 = 1024(0x400, float:1.435E-42)
        L48:
            r2 = r2 | r7
        L49:
            r7 = r13 & 24576(0x6000, float:3.4438E-41)
            if (r7 != 0) goto L59
            boolean r7 = r10.e(r5)
            if (r7 == 0) goto L56
            r7 = 16384(0x4000, float:2.2959E-41)
            goto L58
        L56:
            r7 = 8192(0x2000, float:1.148E-41)
        L58:
            r2 = r2 | r7
        L59:
            r7 = 196608(0x30000, float:2.75506E-40)
            r7 = r7 & r13
            if (r7 != 0) goto L73
            r7 = r26 & 32
            if (r7 != 0) goto L6d
            r7 = r21
            boolean r9 = r10.e(r7)
            if (r9 == 0) goto L6f
            r9 = 131072(0x20000, float:1.83671E-40)
            goto L71
        L6d:
            r7 = r21
        L6f:
            r9 = 65536(0x10000, float:9.1835E-41)
        L71:
            r2 = r2 | r9
            goto L75
        L73:
            r7 = r21
        L75:
            r9 = 599187(0x92493, float:8.3964E-40)
            r9 = r9 & r2
            r11 = 599186(0x92492, float:8.39638E-40)
            if (r9 == r11) goto L80
            r9 = 1
            goto L81
        L80:
            r9 = 0
        L81:
            r11 = r2 & 1
            boolean r9 = r10.S(r11, r9)
            if (r9 == 0) goto Le2
            r10.X()
            r9 = r13 & 1
            r11 = -458753(0xfffffffffff8ffff, float:NaN)
            if (r9 == 0) goto La5
            boolean r9 = r10.B()
            if (r9 == 0) goto L9a
            goto La5
        L9a:
            r10.V()
            r0 = r26 & 32
            if (r0 == 0) goto La2
            r2 = r2 & r11
        La2:
            r0 = r2
            r2 = r1
            goto Lbc
        La5:
            if (r0 == 0) goto Laa
            x64 r0 = defpackage.x64.a
            goto Lab
        Laa:
            r0 = r1
        Lab:
            if (r3 == 0) goto Lb0
            zv0 r1 = defpackage.g04.c
            r4 = r1
        Lb0:
            r1 = r26 & 32
            if (r1 == 0) goto Lb9
            long r7 = defpackage.vt0.b(r5, r10)
            r2 = r2 & r11
        Lb9:
            r14 = r2
            r2 = r0
            r0 = r14
        Lbc:
            r10.q()
            int r0 = r0 << 3
            r1 = r0 & 896(0x380, float:1.256E-42)
            r1 = r1 | 3126(0xc36, float:4.38E-42)
            r3 = 57344(0xe000, float:8.0356E-41)
            r3 = r3 & r0
            r1 = r1 | r3
            r3 = 458752(0x70000, float:6.42848E-40)
            r3 = r3 & r0
            r1 = r1 | r3
            r3 = 3670016(0x380000, float:5.142788E-39)
            r0 = r0 & r3
            r0 = r0 | r1
            r1 = 12582912(0xc00000, float:1.7632415E-38)
            r11 = r0 | r1
            r12 = 0
            gd2 r1 = defpackage.gq.c
            r0 = r15
            r3 = r17
            r9 = r23
            b(r0, r1, r2, r3, r4, r5, r7, r9, r10, r11, r12)
            goto Le6
        Le2:
            r10.V()
            r2 = r1
        Le6:
            cf5 r12 = r10.t()
            if (r12 == 0) goto Lfd
            aq r0 = new aq
            r1 = r15
            r3 = r17
            r5 = r19
            r9 = r23
            r11 = r26
            r10 = r13
            r0.<init>(r1, r2, r3, r4, r5, r7, r9, r10, r11)
            r12.d = r0
        Lfd:
            return
    }
}
