package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wv7  reason: default package */
/* loaded from: classes.dex */
public abstract class wv7 {
    public static final void a(defpackage.a74 r17, defpackage.fu r18, defpackage.iu r19, defpackage.d40 r20, int r21, int r22, defpackage.zv0 r23, defpackage.px0 r24, int r25) {
            r5 = r24
            xq2 r5 = (defpackage.xq2) r5
            r0 = -1303174015(0xffffffffb2532481, float:-1.22901165E-8)
            r5.d0(r0)
            r0 = 224256(0x36c00, float:3.1425E-40)
            r0 = r25 | r0
            r1 = 599187(0x92493, float:8.3964E-40)
            r1 = r1 & r0
            r2 = 599186(0x92492, float:8.39638E-40)
            r3 = 1
            if (r1 == r2) goto L1b
            r1 = r3
            goto L1c
        L1b:
            r1 = 0
        L1c:
            r0 = r0 & r3
            boolean r0 = r5.S(r0, r1)
            if (r0 == 0) goto L3c
            d40 r7 = defpackage.d90.h0
            jg2 r3 = defpackage.jg2.b
            r6 = 14380470(0xdb6db6, float:2.015133E-38)
            r0 = r17
            r1 = r18
            r2 = r19
            r4 = r23
            b(r0, r1, r2, r3, r4, r5, r6)
            r0 = 2147483647(0x7fffffff, float:NaN)
            r13 = r0
            r14 = r13
            r12 = r7
            goto L45
        L3c:
            r5.V()
            r12 = r20
            r13 = r21
            r14 = r22
        L45:
            cf5 r0 = r5.t()
            if (r0 == 0) goto L5c
            w3 r8 = new w3
            r9 = r17
            r10 = r18
            r11 = r19
            r15 = r23
            r16 = r25
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            r0.d = r8
        L5c:
            return
    }

    public static final void b(defpackage.a74 r20, defpackage.fu r21, defpackage.iu r22, defpackage.jg2 r23, defpackage.zv0 r24, defpackage.px0 r25, int r26) {
            r1 = r20
            r2 = r21
            r3 = r22
            r0 = r23
            r9 = r24
            r10 = r26
            d40 r4 = defpackage.d90.h0
            r11 = r25
            xq2 r11 = (defpackage.xq2) r11
            r5 = -1956591841(0xffffffff8b60c71f, float:-4.3290633E-32)
            r11.d0(r5)
            r5 = r10 & 6
            r6 = 4
            if (r5 != 0) goto L28
            boolean r5 = r11.f(r1)
            if (r5 == 0) goto L25
            r5 = r6
            goto L26
        L25:
            r5 = 2
        L26:
            r5 = r5 | r10
            goto L29
        L28:
            r5 = r10
        L29:
            r7 = r10 & 48
            r8 = 32
            if (r7 != 0) goto L3a
            boolean r7 = r11.f(r2)
            if (r7 == 0) goto L37
            r7 = r8
            goto L39
        L37:
            r7 = 16
        L39:
            r5 = r5 | r7
        L3a:
            r7 = r10 & 384(0x180, float:5.38E-43)
            r12 = 256(0x100, float:3.59E-43)
            if (r7 != 0) goto L4b
            boolean r7 = r11.f(r3)
            if (r7 == 0) goto L48
            r7 = r12
            goto L4a
        L48:
            r7 = 128(0x80, float:1.8E-43)
        L4a:
            r5 = r5 | r7
        L4b:
            r7 = r10 & 3072(0xc00, float:4.305E-42)
            if (r7 != 0) goto L5b
            boolean r7 = r11.f(r4)
            if (r7 == 0) goto L58
            r7 = 2048(0x800, float:2.87E-42)
            goto L5a
        L58:
            r7 = 1024(0x400, float:1.435E-42)
        L5a:
            r5 = r5 | r7
        L5b:
            r7 = r10 & 24576(0x6000, float:3.4438E-41)
            r14 = 2147483647(0x7fffffff, float:NaN)
            if (r7 != 0) goto L6e
            boolean r7 = r11.d(r14)
            if (r7 == 0) goto L6b
            r7 = 16384(0x4000, float:2.2959E-41)
            goto L6d
        L6b:
            r7 = 8192(0x2000, float:1.148E-41)
        L6d:
            r5 = r5 | r7
        L6e:
            r7 = 196608(0x30000, float:2.75506E-40)
            r7 = r7 & r10
            if (r7 != 0) goto L7f
            boolean r7 = r11.d(r14)
            if (r7 == 0) goto L7c
            r7 = 131072(0x20000, float:1.83671E-40)
            goto L7e
        L7c:
            r7 = 65536(0x10000, float:9.1835E-41)
        L7e:
            r5 = r5 | r7
        L7f:
            r7 = 1572864(0x180000, float:2.204052E-39)
            r7 = r7 & r10
            r15 = 1048576(0x100000, float:1.469368E-39)
            if (r7 != 0) goto L91
            boolean r7 = r11.f(r0)
            if (r7 == 0) goto L8e
            r7 = r15
            goto L90
        L8e:
            r7 = 524288(0x80000, float:7.34684E-40)
        L90:
            r5 = r5 | r7
        L91:
            r7 = 12582912(0xc00000, float:1.7632415E-38)
            r7 = r7 & r10
            if (r7 != 0) goto La2
            boolean r7 = r11.h(r9)
            if (r7 == 0) goto L9f
            r7 = 8388608(0x800000, float:1.1754944E-38)
            goto La1
        L9f:
            r7 = 4194304(0x400000, float:5.877472E-39)
        La1:
            r5 = r5 | r7
        La2:
            r16 = r5
            r5 = 4793491(0x492493, float:6.717112E-39)
            r5 = r16 & r5
            r7 = 4793490(0x492492, float:6.71711E-39)
            r17 = 0
            if (r5 == r7) goto Lb2
            r5 = 1
            goto Lb4
        Lb2:
            r5 = r17
        Lb4:
            r7 = r16 & 1
            boolean r5 = r11.S(r7, r5)
            if (r5 == 0) goto L249
            r5 = 3670016(0x380000, float:5.142788E-39)
            r5 = r16 & r5
            if (r5 != r15) goto Lc4
            r7 = 1
            goto Lc6
        Lc4:
            r7 = r17
        Lc6:
            java.lang.Object r14 = r11.P()
            vs0 r15 = defpackage.ox0.a
            if (r7 != 0) goto Ld0
            if (r14 != r15) goto Lda
        Ld0:
            gg2 r14 = new gg2
            cg2 r7 = r0.a
            r14.<init>(r7)
            r11.l0(r14)
        Lda:
            gg2 r14 = (defpackage.gg2) r14
            int r7 = r16 >> 3
            r18 = r7 & 14
            r19 = 6
            r13 = r18 ^ 6
            if (r13 <= r6) goto Lec
            boolean r13 = r11.f(r2)
            if (r13 != 0) goto Lf0
        Lec:
            r13 = r7 & 6
            if (r13 != r6) goto Lf2
        Lf0:
            r6 = 1
            goto Lf4
        Lf2:
            r6 = r17
        Lf4:
            r13 = r7 & 112(0x70, float:1.57E-43)
            r13 = r13 ^ 48
            if (r13 <= r8) goto L100
            boolean r13 = r11.f(r3)
            if (r13 != 0) goto L104
        L100:
            r13 = r7 & 48
            if (r13 != r8) goto L106
        L104:
            r8 = 1
            goto L108
        L106:
            r8 = r17
        L108:
            r6 = r6 | r8
            r8 = r7 & 896(0x380, float:1.256E-42)
            r8 = r8 ^ 384(0x180, float:5.38E-43)
            if (r8 <= r12) goto L115
            boolean r8 = r11.f(r4)
            if (r8 != 0) goto L119
        L115:
            r8 = r7 & 384(0x180, float:5.38E-43)
            if (r8 != r12) goto L11b
        L119:
            r8 = 1
            goto L11d
        L11b:
            r8 = r17
        L11d:
            r6 = r6 | r8
            r8 = r7 & 7168(0x1c00, float:1.0045E-41)
            r8 = r8 ^ 3072(0xc00, float:4.305E-42)
            r12 = 2048(0x800, float:2.87E-42)
            if (r8 <= r12) goto L12f
            r8 = 2147483647(0x7fffffff, float:NaN)
            boolean r13 = r11.d(r8)
            if (r13 != 0) goto L133
        L12f:
            r8 = r7 & 3072(0xc00, float:4.305E-42)
            if (r8 != r12) goto L135
        L133:
            r8 = 1
            goto L137
        L135:
            r8 = r17
        L137:
            r6 = r6 | r8
            r8 = 57344(0xe000, float:8.0356E-41)
            r8 = r8 & r7
            r8 = r8 ^ 24576(0x6000, float:3.4438E-41)
            r12 = 16384(0x4000, float:2.2959E-41)
            if (r8 <= r12) goto L14b
            r8 = 2147483647(0x7fffffff, float:NaN)
            boolean r8 = r11.d(r8)
            if (r8 != 0) goto L14f
        L14b:
            r7 = r7 & 24576(0x6000, float:3.4438E-41)
            if (r7 != r12) goto L151
        L14f:
            r7 = 1
            goto L153
        L151:
            r7 = r17
        L153:
            r6 = r6 | r7
            boolean r7 = r11.f(r14)
            r6 = r6 | r7
            java.lang.Object r7 = r11.P()
            if (r6 != 0) goto L161
            if (r7 != r15) goto L163
        L161:
            r6 = r5
            goto L165
        L163:
            r12 = r5
            goto L182
        L165:
            float r5 = r2.a()
            r7 = r6
            l71 r6 = new l71
            r6.<init>(r4)
            r4 = r7
            float r7 = r3.a()
            ig2 r2 = new ig2
            r12 = r4
            r8 = r14
            r4 = r3
            r3 = r21
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r11.l0(r2)
            r7 = r2
        L182:
            ig2 r7 = (defpackage.ig2) r7
            r2 = 1048576(0x100000, float:1.469368E-39)
            if (r12 != r2) goto L18a
            r2 = 1
            goto L18c
        L18a:
            r2 = r17
        L18c:
            r3 = 29360128(0x1c00000, float:7.052966E-38)
            r3 = r16 & r3
            r4 = 8388608(0x800000, float:1.1754944E-38)
            if (r3 != r4) goto L196
            r3 = 1
            goto L198
        L196:
            r3 = r17
        L198:
            r2 = r2 | r3
            r3 = 458752(0x70000, float:6.42848E-40)
            r3 = r16 & r3
            r4 = 131072(0x20000, float:1.83671E-40)
            if (r3 != r4) goto L1a3
            r3 = 1
            goto L1a5
        L1a3:
            r3 = r17
        L1a5:
            r2 = r2 | r3
            java.lang.Object r3 = r11.P()
            if (r2 != 0) goto L1ae
            if (r3 != r15) goto L1d5
        L1ae:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            eq r2 = new eq
            r4 = 3
            r2.<init>(r9, r4)
            zv0 r4 = new zv0
            r5 = -1192950673(0xffffffffb8e5046f, float:-1.0920397E-4)
            r6 = 1
            r4.<init>(r5, r6, r2)
            r3.add(r4)
            r0.getClass()
            cg2 r2 = r0.a
            int[] r4 = defpackage.dg2.a
            int r2 = r2.ordinal()
            r2 = r4[r2]
            r11.l0(r3)
        L1d5:
            java.util.List r3 = (java.util.List) r3
            o0 r2 = new o0
            r4 = r19
            r2.<init>(r3, r4)
            zv0 r3 = new zv0
            r4 = 1271844412(0x4bcece3c, float:2.7106424E7)
            r6 = 1
            r3.<init>(r4, r6, r2)
            boolean r2 = r11.f(r7)
            java.lang.Object r4 = r11.P()
            if (r2 != 0) goto L1f3
            if (r4 != r15) goto L1fb
        L1f3:
            r84 r4 = new r84
            r4.<init>(r7)
            r11.l0(r4)
        L1fb:
            e34 r4 = (defpackage.e34) r4
            long r5 = r11.T
            int r2 = java.lang.Long.hashCode(r5)
            xv4 r5 = r11.l()
            a74 r6 = defpackage.l.E(r11, r1)
            ix0 r7 = defpackage.jx0.i
            r7.getClass()
            iy0 r7 = defpackage.ix0.b
            r11.f0()
            boolean r8 = r11.S
            if (r8 == 0) goto L21d
            r11.k(r7)
            goto L220
        L21d:
            r11.o0()
        L220:
            pn r7 = defpackage.ix0.f
            defpackage.yh2.K(r11, r7, r4)
            pn r4 = defpackage.ix0.e
            defpackage.yh2.K(r11, r4, r5)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            pn r4 = defpackage.ix0.g
            defpackage.yh2.K(r11, r4, r2)
            ne r2 = defpackage.ix0.h
            defpackage.yh2.F(r11, r2)
            pn r2 = defpackage.ix0.d
            defpackage.yh2.K(r11, r2, r6)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r17)
            r3.o(r11, r2)
            r6 = 1
            r11.p(r6)
            goto L24c
        L249:
            r11.V()
        L24c:
            cf5 r8 = r11.t()
            if (r8 == 0) goto L262
            r4 r0 = new r4
            r7 = 3
            r2 = r21
            r3 = r22
            r4 = r23
            r5 = r9
            r6 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.d = r0
        L262:
            return
    }

    public static final defpackage.vv7 c(long r5, java.util.Set r7, java.util.Set r8) {
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r7 = r7.iterator()
        Lb:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L28
            java.lang.Object r1 = r7.next()
            r2 = r1
            om1 r2 = (defpackage.om1) r2
            float r2 = r2.A
            float r3 = defpackage.sm1.b(r5)
            int r2 = defpackage.om1.a(r3, r2)
            if (r2 < 0) goto Lb
            r0.add(r1)
            goto Lb
        L28:
            java.util.Iterator r7 = r0.iterator()
            boolean r0 = r7.hasNext()
            r1 = 0
            if (r0 == 0) goto La7
            java.lang.Object r0 = r7.next()
            om1 r0 = (defpackage.om1) r0
            float r0 = r0.A
        L3b:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L4e
            java.lang.Object r2 = r7.next()
            om1 r2 = (defpackage.om1) r2
            float r2 = r2.A
            float r0 = java.lang.Math.max(r0, r2)
            goto L3b
        L4e:
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r8 = r8.iterator()
        L59:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L76
            java.lang.Object r2 = r8.next()
            r3 = r2
            om1 r3 = (defpackage.om1) r3
            float r3 = r3.A
            float r4 = defpackage.sm1.a(r5)
            int r3 = defpackage.om1.a(r4, r3)
            if (r3 < 0) goto L59
            r7.add(r2)
            goto L59
        L76:
            java.util.Iterator r5 = r7.iterator()
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto La3
            java.lang.Object r6 = r5.next()
            om1 r6 = (defpackage.om1) r6
            float r6 = r6.A
        L88:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L9b
            java.lang.Object r7 = r5.next()
            om1 r7 = (defpackage.om1) r7
            float r7 = r7.A
            float r6 = java.lang.Math.max(r6, r7)
            goto L88
        L9b:
            vv7 r5 = new vv7
            int r7 = (int) r0
            int r6 = (int) r6
            r5.<init>(r7, r6)
            return r5
        La3:
            defpackage.fa6.c()
            return r1
        La7:
            defpackage.fa6.c()
            return r1
    }

    public static final void d(defpackage.x24 r2, defpackage.ig2 r3, long r4, defpackage.qn2 r6) {
            j26 r0 = defpackage.jx2.t(r2)
            float r0 = defpackage.jx2.v(r0)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L21
            defpackage.jx2.t(r2)
            dx4 r2 = r2.y(r4)
            r6.g(r2)
            r3.getClass()
            r2.d0()
            r2.Z()
            return
        L21:
            r3.getClass()
            r3 = 2147483647(0x7fffffff, float:NaN)
            int r3 = r2.n(r3)
            r2.V(r3)
            return
    }
}
