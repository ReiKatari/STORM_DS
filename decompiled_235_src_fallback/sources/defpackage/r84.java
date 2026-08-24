package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: r84  reason: default package */
/* loaded from: classes.dex */
public final class r84 implements defpackage.e34 {
    public final defpackage.ig2 a;

    public r84(defpackage.ig2 r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // defpackage.e34
    public final int a(defpackage.eb3 r10, java.util.List r11, int r12) {
            r9 = this;
            java.util.ArrayList r11 = defpackage.uj2.G(r10)
            ig2 r9 = r9.a
            gg2 r0 = r9.f
            r1 = 1
            java.lang.Object r1 = defpackage.gt0.K0(r1, r11)
            java.util.List r1 = (java.util.List) r1
            r2 = 0
            if (r1 == 0) goto L19
            java.lang.Object r1 = defpackage.gt0.J0(r1)
            x24 r1 = (defpackage.x24) r1
            goto L1a
        L19:
            r1 = r2
        L1a:
            r3 = 2
            java.lang.Object r3 = defpackage.gt0.K0(r3, r11)
            java.util.List r3 = (java.util.List) r3
            if (r3 == 0) goto L29
            java.lang.Object r2 = defpackage.gt0.J0(r3)
            x24 r2 = (defpackage.x24) r2
        L29:
            r3 = 7
            r4 = 0
            long r5 = defpackage.s21.b(r4, r4, r4, r12, r3)
            r0.b(r1, r2, r5)
            java.lang.Object r11 = defpackage.gt0.J0(r11)
            java.util.List r11 = (java.util.List) r11
            if (r11 != 0) goto L3c
            yt1 r11 = defpackage.yt1.A
        L3c:
            float r9 = r9.c
            int r9 = r10.r0(r9)
            int r10 = r11.size()
            r0 = r4
            r1 = r0
            r2 = r1
            r3 = r2
        L4a:
            if (r0 >= r10) goto L73
            java.lang.Object r5 = r11.get(r0)
            x24 r5 = (defpackage.x24) r5
            int r5 = r5.u(r12)
            int r5 = r5 + r9
            int r6 = r0 + 1
            int r7 = r6 - r2
            r8 = 2147483647(0x7fffffff, float:NaN)
            if (r7 == r8) goto L69
            int r7 = r11.size()
            if (r6 != r7) goto L67
            goto L69
        L67:
            int r3 = r3 + r5
            goto L71
        L69:
            int r3 = r3 + r5
            int r3 = r3 - r9
            int r1 = java.lang.Math.max(r1, r3)
            r2 = r0
            r3 = r4
        L71:
            r0 = r6
            goto L4a
        L73:
            return r1
    }

    @Override // defpackage.e34
    public final defpackage.f34 d(defpackage.g34 r61, java.util.List r62, long r63) {
            r60 = this;
            r6 = r61
            r0 = r63
            java.util.ArrayList r2 = defpackage.uj2.G(r6)
            r3 = r60
            ig2 r3 = r3.a
            gg2 r4 = r3.f
            boolean r5 = r2.isEmpty()
            r7 = 22
            zt1 r13 = defpackage.zt1.A
            r14 = 0
            if (r5 != 0) goto L25
            int r5 = defpackage.q21.g(r0)
            if (r5 != 0) goto L28
            cg2 r5 = r4.a
            cg2 r8 = defpackage.cg2.Visible
            if (r5 == r8) goto L28
        L25:
            r2 = r13
            goto L42d
        L28:
            java.lang.Object r5 = defpackage.gt0.H0(r2)
            java.util.List r5 = (java.util.List) r5
            boolean r8 = r5.isEmpty()
            if (r8 == 0) goto L3e
            bz1 r0 = new bz1
            r0.<init>(r7)
            f34 r0 = r6.K(r14, r14, r13, r0)
            return r0
        L3e:
            r15 = 1
            java.lang.Object r7 = defpackage.gt0.K0(r15, r2)
            java.util.List r7 = (java.util.List) r7
            if (r7 == 0) goto L4e
            java.lang.Object r7 = defpackage.gt0.J0(r7)
            x24 r7 = (defpackage.x24) r7
            goto L4f
        L4e:
            r7 = 0
        L4f:
            r9 = 2
            java.lang.Object r2 = defpackage.gt0.K0(r9, r2)
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L5f
            java.lang.Object r2 = defpackage.gt0.J0(r2)
            x24 r2 = (defpackage.x24) r2
            goto L60
        L5f:
            r2 = 0
        L60:
            r5.size()
            r4.getClass()
            hn3 r9 = defpackage.hn3.Horizontal
            long r10 = defpackage.qo2.q(r0, r9)
            r12 = 10
            long r10 = defpackage.qo2.r(r12, r10)
            long r10 = defpackage.qo2.R(r10, r9)
            if (r7 == 0) goto L82
            eg2 r12 = new eg2
            r12.<init>(r4, r3, r14)
            defpackage.wv7.d(r7, r3, r10, r12)
            r4.b = r7
        L82:
            if (r2 == 0) goto L8e
            eg2 r7 = new eg2
            r7.<init>(r4, r3, r15)
            defpackage.wv7.d(r2, r3, r10, r7)
            r4.d = r2
        L8e:
            java.util.Iterator r2 = r5.iterator()
            float r4 = r3.c
            float r5 = r3.e
            long r18 = defpackage.qo2.q(r0, r9)
            gg2 r0 = r3.f
            ua4 r1 = new ua4
            r7 = 16
            f34[] r7 = new defpackage.f34[r7]
            r1.<init>(r7)
            int r7 = defpackage.q21.h(r18)
            int r10 = defpackage.q21.j(r18)
            int r11 = defpackage.q21.g(r18)
            p94 r12 = defpackage.h93.a
            p94 r12 = new p94
            r12.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            float r4 = r6.e0(r4)
            r27 = r15
            double r14 = (double) r4
            double r14 = java.lang.Math.ceil(r14)
            float r4 = (float) r14
            int r4 = (int) r4
            float r5 = r6.e0(r5)
            double r14 = (double) r5
            double r14 = java.lang.Math.ceil(r14)
            float r5 = (float) r14
            int r5 = (int) r5
            r17 = r0
            r63 = r1
            r14 = 0
            long r0 = defpackage.s21.a(r14, r7, r14, r11)
            r14 = 14
            long r14 = defpackage.qo2.r(r14, r0)
            long r14 = defpackage.qo2.R(r14, r9)
            boolean r9 = r2.hasNext()
            if (r9 != 0) goto Lf0
        Lee:
            r9 = 0
            goto Lf6
        Lf0:
            java.lang.Object r9 = r2.next()     // Catch: java.lang.IndexOutOfBoundsException -> Lee
            x24 r9 = (defpackage.x24) r9     // Catch: java.lang.IndexOutOfBoundsException -> Lee
        Lf6:
            r28 = 0
            r29 = r13
            if (r9 == 0) goto L139
            j26 r16 = defpackage.jx2.t(r9)
            float r16 = defpackage.jx2.v(r16)
            int r16 = (r16 > r28 ? 1 : (r16 == r28 ? 0 : -1))
            if (r16 != 0) goto L11e
            defpackage.jx2.t(r9)
            dx4 r16 = r9.y(r14)
            int r13 = r16.d0()
            r30 = r0
            int r0 = r16.Z()
            long r0 = defpackage.d93.a(r13, r0)
            goto L131
        L11e:
            r30 = r0
            r0 = 2147483647(0x7fffffff, float:NaN)
            int r1 = r9.n(r0)
            int r0 = r9.V(r1)
            long r0 = defpackage.d93.a(r1, r0)
            r16 = 0
        L131:
            d93 r13 = new d93
            r13.<init>(r0)
            r0 = r16
            goto L13d
        L139:
            r30 = r0
            r0 = 0
            r13 = 0
        L13d:
            r43 = r2
            r44 = 32
            if (r13 == 0) goto L14d
            long r1 = r13.a
            long r1 = r1 >> r44
            int r1 = (int) r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L14e
        L14d:
            r1 = 0
        L14e:
            r45 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r2 = r0
            r47 = r1
            if (r13 == 0) goto L162
            long r0 = r13.a
            long r0 = r0 & r45
            int r0 = (int) r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L163
        L162:
            r0 = 0
        L163:
            o94 r1 = new o94
            r1.<init>()
            r37 = r13
            o94 r13 = new o94
            r13.<init>()
            r48 = r0
            q94 r0 = new q94
            r0.<init>()
            ag2 r20 = new ag2
            r21 = r5
            r16 = r20
            r20 = r4
            r16.<init>(r17, r18, r20, r21)
            r5 = r20
            r4 = r21
            r20 = r16
            boolean r33 = r43.hasNext()
            long r35 = defpackage.d93.a(r7, r11)
            r41 = 0
            r42 = 0
            r34 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r16 = r2
            r32 = r20
            zf2 r2 = r32.b(r33, r34, r35, r37, r38, r39, r40, r41, r42)
            r32 = r3
            boolean r3 = r2.B
            if (r3 == 0) goto L1bf
            if (r37 == 0) goto L1ae
            r22 = r27
            goto L1b0
        L1ae:
            r22 = 0
        L1b0:
            r24 = 0
            r26 = 0
            r23 = -1
            r21 = r2
            r25 = r7
            yf2 r2 = r20.a(r21, r22, r23, r24, r25, r26)
            goto L1c2
        L1bf:
            r21 = r2
            r2 = 0
        L1c2:
            r3 = r9
            r9 = r2
            r2 = r16
            r16 = r4
            r4 = r3
            r33 = r5
            r22 = r7
            r5 = r10
            r34 = r11
            r3 = r21
            r6 = 0
            r10 = 0
            r21 = 0
            r23 = 0
            r55 = 0
            r56 = 0
        L1dc:
            boolean r3 = r3.B
            if (r3 != 0) goto L31c
            if (r4 == 0) goto L31c
            r47.getClass()
            int r3 = r47.intValue()
            r48.getClass()
            r24 = r3
            int r3 = r48.intValue()
            r35 = r0
            int r0 = r21 + r24
            int r57 = java.lang.Math.max(r6, r3)
            int r3 = r22 - r24
            int r6 = r10 + 1
            r17.getClass()
            r8.add(r4)
            r12.i(r10, r2)
            r4.B()
            int r51 = r6 - r23
            boolean r2 = r43.hasNext()
            if (r2 != 0) goto L214
            r4 = 0
            goto L21d
        L214:
            java.lang.Object r2 = r43.next()     // Catch: java.lang.IndexOutOfBoundsException -> L21b
            x24 r2 = (defpackage.x24) r2     // Catch: java.lang.IndexOutOfBoundsException -> L21b
            goto L21c
        L21b:
            r2 = 0
        L21c:
            r4 = r2
        L21d:
            if (r4 == 0) goto L25e
            j26 r2 = defpackage.jx2.t(r4)
            float r2 = defpackage.jx2.v(r2)
            int r2 = (r2 > r28 ? 1 : (r2 == r28 ? 0 : -1))
            if (r2 != 0) goto L247
            defpackage.jx2.t(r4)
            dx4 r2 = r4.y(r14)
            int r10 = r2.d0()
            r21 = r2
            int r2 = r21.Z()
            long r24 = defpackage.d93.a(r10, r2)
            r2 = r21
        L242:
            r36 = r14
            r14 = r24
            goto L258
        L247:
            r2 = 2147483647(0x7fffffff, float:NaN)
            int r10 = r4.n(r2)
            int r2 = r4.V(r10)
            long r24 = defpackage.d93.a(r10, r2)
            r2 = 0
            goto L242
        L258:
            d93 r10 = new d93
            r10.<init>(r14)
            goto L262
        L25e:
            r36 = r14
            r2 = 0
            r10 = 0
        L262:
            if (r10 == 0) goto L270
            long r14 = r10.a
            long r14 = r14 >> r44
            int r14 = (int) r14
            int r14 = r14 + r33
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            goto L271
        L270:
            r14 = 0
        L271:
            r38 = r14
            if (r10 == 0) goto L281
            long r14 = r10.a
            long r14 = r14 & r45
            int r14 = (int) r14
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r48 = r14
            goto L283
        L281:
            r48 = 0
        L283:
            boolean r50 = r43.hasNext()
            long r52 = defpackage.d93.a(r3, r11)
            if (r10 != 0) goto L292
            r39 = r2
            r54 = 0
            goto L2ad
        L292:
            r38.getClass()
            int r14 = r38.intValue()
            r48.getClass()
            int r15 = r48.intValue()
            long r14 = defpackage.d93.a(r14, r15)
            r39 = r2
            d93 r2 = new d93
            r2.<init>(r14)
            r54 = r2
        L2ad:
            r58 = 0
            r59 = 0
            r49 = r20
            zf2 r2 = r49.b(r50, r51, r52, r54, r55, r56, r57, r58, r59)
            r14 = r57
            boolean r15 = r2.A
            if (r15 == 0) goto L306
            int r0 = java.lang.Math.max(r5, r0)
            int r0 = java.lang.Math.min(r0, r7)
            int r24 = r56 + r14
            if (r10 == 0) goto L2d4
            r22 = r27
        L2cb:
            r21 = r2
            r25 = r3
            r26 = r51
            r23 = r55
            goto L2d7
        L2d4:
            r22 = 0
            goto L2cb
        L2d7:
            yf2 r2 = r20.a(r21, r22, r23, r24, r25, r26)
            r55 = r23
            r13.a(r14)
            int r11 = r34 - r24
            int r11 = r11 - r16
            r1.a(r6)
            if (r38 == 0) goto L2f4
            int r3 = r38.intValue()
            int r3 = r3 - r33
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L2f5
        L2f4:
            r3 = 0
        L2f5:
            int r55 = r55 + 1
            int r24 = r24 + r16
            r5 = r0
            r9 = r2
            r47 = r3
            r23 = r6
            r22 = r7
            r56 = r24
            r0 = 0
            r14 = 0
            goto L30e
        L306:
            r21 = r2
            r25 = r3
            r22 = r25
            r47 = r38
        L30e:
            r10 = r6
            r6 = r14
            r3 = r21
            r14 = r36
            r2 = r39
            r21 = r0
            r0 = r35
            goto L1dc
        L31c:
            r35 = r0
            if (r9 == 0) goto L361
            long r2 = r9.c
            x24 r0 = r9.a
            r8.add(r0)
            int r0 = r8.size()
            int r0 = r0 + (-1)
            dx4 r4 = r9.b
            r12.i(r0, r4)
            int r0 = r1.b
            int r0 = r0 + (-1)
            boolean r4 = r9.d
            if (r4 == 0) goto L352
            int r4 = r13.c(r0)
            long r2 = r2 & r45
            int r2 = (int) r2
            int r2 = java.lang.Math.max(r4, r2)
            r13.f(r0, r2)
            int r2 = r1.d()
            int r2 = r2 + 1
            r1.f(r0, r2)
            goto L361
        L352:
            long r2 = r2 & r45
            int r0 = (int) r2
            r13.a(r0)
            int r0 = r1.d()
            int r0 = r0 + 1
            r1.a(r0)
        L361:
            int r0 = r8.size()
            r7 = r8
            dx4[] r8 = new defpackage.dx4[r0]
            r14 = 0
        L369:
            if (r14 >= r0) goto L374
            java.lang.Object r2 = r12.b(r14)
            r8[r14] = r2
            int r14 = r14 + 1
            goto L369
        L374:
            int r14 = r1.b
            int[] r11 = new int[r14]
            int[] r15 = new int[r14]
            int[] r0 = r1.a
            r1 = r5
            r9 = 0
            r12 = 0
            r16 = 0
        L381:
            if (r12 >= r14) goto L3df
            r10 = r0[r12]
            int r2 = r13.c(r12)
            r3 = r35
            boolean r4 = r3.c(r12)
            if (r4 == 0) goto L395
            r4 = 2147483647(0x7fffffff, float:NaN)
            goto L3a6
        L395:
            int r2 = defpackage.q21.g(r30)
            r4 = 2147483647(0x7fffffff, float:NaN)
            if (r2 != r4) goto L3a0
            r2 = r4
            goto L3a6
        L3a0:
            int r2 = defpackage.q21.g(r30)
            int r2 = r2 - r16
        L3a6:
            int r5 = defpackage.q21.i(r30)
            r35 = r3
            int r3 = defpackage.q21.h(r30)
            r6 = r61
            r17 = r0
            r20 = r4
            r60 = r13
            r0 = r32
            r13 = r63
            r4 = r2
            r2 = r5
            r5 = r33
            f34 r2 = defpackage.yh2.C(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            int r3 = r2.getWidth()
            int r4 = r2.getHeight()
            r15[r12] = r4
            int r16 = r16 + r4
            int r1 = java.lang.Math.max(r1, r3)
            r13.b(r2)
            int r12 = r12 + 1
            r9 = r10
            r0 = r17
            r13 = r60
            goto L381
        L3df:
            r6 = r61
            r13 = r63
            r0 = r32
            int r2 = r13.L
            if (r2 != 0) goto L3ed
            r14 = 0
            r16 = 0
            goto L3ee
        L3ed:
            r14 = r1
        L3ee:
            iu r0 = r0.b
            float r1 = r0.a()
            int r1 = r6.r0(r1)
            int r2 = r13.L
            int r2 = r2 + (-1)
            int r2 = r2 * r1
            int r2 = r2 + r16
            int r1 = defpackage.q21.i(r18)
            int r3 = defpackage.q21.g(r18)
            if (r2 >= r1) goto L40a
            r2 = r1
        L40a:
            if (r2 <= r3) goto L40d
            goto L40e
        L40d:
            r3 = r2
        L40e:
            r0.g(r6, r3, r15, r11)
            int r0 = defpackage.q21.j(r18)
            int r1 = defpackage.q21.h(r18)
            if (r14 >= r0) goto L41c
            r14 = r0
        L41c:
            if (r14 <= r1) goto L41f
            goto L420
        L41f:
            r1 = r14
        L420:
            bg2 r0 = new bg2
            r14 = 0
            r0.<init>(r13, r14)
            r2 = r29
            f34 r0 = r6.K(r1, r3, r2, r0)
            return r0
        L42d:
            bz1 r0 = new bz1
            r0.<init>(r7)
            f34 r0 = r6.K(r14, r14, r2, r0)
            return r0
    }

    @Override // defpackage.e34
    public final int e(defpackage.eb3 r35, java.util.List r36, int r37) {
            r34 = this;
            r0 = r35
            r1 = r37
            java.util.ArrayList r2 = defpackage.uj2.G(r0)
            r3 = r34
            ig2 r3 = r3.a
            gg2 r4 = r3.f
            r5 = 1
            java.lang.Object r6 = defpackage.gt0.K0(r5, r2)
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto L1e
            java.lang.Object r6 = defpackage.gt0.J0(r6)
            x24 r6 = (defpackage.x24) r6
            goto L1f
        L1e:
            r6 = 0
        L1f:
            r8 = 2
            java.lang.Object r9 = defpackage.gt0.K0(r8, r2)
            java.util.List r9 = (java.util.List) r9
            if (r9 == 0) goto L2f
            java.lang.Object r9 = defpackage.gt0.J0(r9)
            x24 r9 = (defpackage.x24) r9
            goto L30
        L2f:
            r9 = 0
        L30:
            r10 = 7
            r11 = 0
            long r12 = defpackage.s21.b(r11, r11, r11, r1, r10)
            r4.b(r6, r9, r12)
            java.lang.Object r2 = defpackage.gt0.J0(r2)
            java.util.List r2 = (java.util.List) r2
            if (r2 != 0) goto L43
            yt1 r2 = defpackage.yt1.A
        L43:
            float r4 = r3.c
            int r16 = r0.r0(r4)
            float r4 = r3.e
            int r17 = r0.r0(r4)
            gg2 r13 = r3.f
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L58
            return r11
        L58:
            int r0 = r2.size()
            int[] r3 = new int[r0]
            int r4 = r2.size()
            int[] r6 = new int[r4]
            int r9 = r2.size()
            r10 = r11
        L69:
            if (r10 >= r9) goto L80
            java.lang.Object r12 = r2.get(r10)
            x24 r12 = (defpackage.x24) r12
            int r14 = r12.n(r1)
            r3[r10] = r14
            int r12 = r12.V(r14)
            r6[r10] = r12
            int r10 = r10 + 1
            goto L69
        L80:
            int r9 = r2.size()
            r10 = 2147483647(0x7fffffff, float:NaN)
            if (r10 >= r9) goto L95
            cg2 r9 = r13.a
            cg2 r12 = defpackage.cg2.ExpandIndicator
            if (r9 == r12) goto L93
            cg2 r12 = defpackage.cg2.ExpandOrCollapseIndicator
            if (r9 != r12) goto L95
        L93:
            r9 = r5
            goto La6
        L95:
            int r9 = r2.size()
            if (r10 < r9) goto La5
            r13.getClass()
            cg2 r9 = r13.a
            cg2 r12 = defpackage.cg2.ExpandOrCollapseIndicator
            if (r9 != r12) goto La5
            goto L93
        La5:
            r9 = r11
        La6:
            int r9 = r10 - r9
            int r12 = r2.size()
            int r9 = java.lang.Math.min(r9, r12)
            r12 = r11
            r14 = r12
        Lb2:
            if (r12 >= r0) goto Lba
            r15 = r3[r12]
            int r14 = r14 + r15
            int r12 = r12 + 1
            goto Lb2
        Lba:
            int r12 = r2.size()
            int r12 = r12 - r5
            int r12 = r12 * r16
            int r12 = r12 + r14
            if (r4 == 0) goto L26a
            r14 = r6[r11]
            int r4 = r4 - r5
            if (r5 > r4) goto Ld4
            r15 = r5
        Lca:
            r7 = r6[r15]
            if (r14 >= r7) goto Lcf
            r14 = r7
        Lcf:
            if (r15 == r4) goto Ld4
            int r15 = r15 + 1
            goto Lca
        Ld4:
            if (r0 == 0) goto L264
            r4 = r3[r11]
            int r0 = r0 - r5
            if (r5 > r0) goto Le6
            r7 = r5
        Ldc:
            r15 = r3[r7]
            if (r4 >= r15) goto Le1
            r4 = r15
        Le1:
            if (r7 == r0) goto Le6
            int r7 = r7 + 1
            goto Ldc
        Le6:
            r0 = r12
        Le7:
            if (r4 > r0) goto L263
            if (r14 != r1) goto Led
            goto L263
        Led:
            int r7 = r4 + r0
            int r7 = r7 / r8
            boolean r12 = r2.isEmpty()
            r18 = 4294967295(0xffffffff, double:2.1219957905E-314)
            if (r12 == 0) goto L108
            long r14 = defpackage.d93.a(r11, r11)
            r33 = r2
            r35 = r6
        L103:
            r10 = r9
            r32 = r11
            goto L23c
        L108:
            long r14 = defpackage.s21.a(r11, r7, r11, r10)
            ag2 r20 = new ag2
            r12 = r20
            r12.<init>(r13, r14, r16, r17)
            java.lang.Object r12 = defpackage.gt0.K0(r11, r2)
            x24 r12 = (defpackage.x24) r12
            if (r12 == 0) goto L11e
            r14 = r6[r11]
            goto L11f
        L11e:
            r14 = r11
        L11f:
            if (r12 == 0) goto L124
            r15 = r3[r11]
            goto L125
        L124:
            r15 = r11
        L125:
            int r8 = r2.size()
            if (r8 <= r5) goto L12e
            r21 = r5
            goto L130
        L12e:
            r21 = r11
        L130:
            long r23 = defpackage.d93.a(r7, r10)
            r35 = r6
            if (r12 != 0) goto L13b
            r25 = 0
            goto L146
        L13b:
            long r5 = defpackage.d93.a(r15, r14)
            d93 r8 = new d93
            r8.<init>(r5)
            r25 = r8
        L146:
            r29 = 0
            r30 = 0
            r22 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            zf2 r5 = r20.b(r21, r22, r23, r25, r26, r27, r28, r29, r30)
            boolean r5 = r5.B
            if (r5 == 0) goto L173
            if (r12 == 0) goto L15e
            r5 = 1
            goto L15f
        L15e:
            r5 = r11
        L15f:
            d93 r5 = r13.a(r11, r5, r11)
            if (r5 == 0) goto L16b
            long r5 = r5.a
            long r5 = r5 & r18
            int r5 = (int) r5
            goto L16c
        L16b:
            r5 = r11
        L16c:
            long r14 = defpackage.d93.a(r5, r11)
            r33 = r2
            goto L103
        L173:
            int r5 = r2.size()
            r12 = r7
            r8 = r11
            r21 = r8
            r31 = r21
            r23 = r26
            r6 = r28
        L181:
            if (r8 >= r5) goto L22f
            int r12 = r12 - r15
            int r15 = r8 + 1
            int r28 = java.lang.Math.max(r6, r14)
            java.lang.Object r6 = defpackage.gt0.K0(r15, r2)
            x24 r6 = (defpackage.x24) r6
            if (r6 == 0) goto L195
            r14 = r35[r15]
            goto L196
        L195:
            r14 = r11
        L196:
            if (r6 == 0) goto L1a1
            r21 = r3[r15]
            int r21 = r21 + r16
            r32 = r11
            r11 = r21
            goto L1a3
        L1a1:
            r32 = r11
        L1a3:
            int r8 = r8 + 2
            int r10 = r2.size()
            if (r8 >= r10) goto L1ae
            r21 = 1
            goto L1b0
        L1ae:
            r21 = r32
        L1b0:
            int r22 = r15 - r31
            r26 = r23
            r8 = 2147483647(0x7fffffff, float:NaN)
            long r23 = defpackage.d93.a(r12, r8)
            if (r6 != 0) goto L1c3
            r33 = r2
            r10 = r9
            r25 = 0
            goto L1d1
        L1c3:
            r10 = r9
            long r8 = defpackage.d93.a(r11, r14)
            r33 = r2
            d93 r2 = new d93
            r2.<init>(r8)
            r25 = r2
        L1d1:
            r29 = 0
            r30 = 0
            zf2 r2 = r20.b(r21, r22, r23, r25, r26, r27, r28, r29, r30)
            boolean r8 = r2.A
            if (r8 == 0) goto L21b
            int r28 = r28 + r17
            int r24 = r28 + r27
            r23 = r26
            r26 = r22
            if (r6 == 0) goto L1ee
            r22 = 1
        L1e9:
            r21 = r2
            r25 = r12
            goto L1f1
        L1ee:
            r22 = r32
            goto L1e9
        L1f1:
            yf2 r2 = r20.a(r21, r22, r23, r24, r25, r26)
            r6 = r21
            r26 = r23
            int r11 = r11 - r16
            int r23 = r26 + 1
            boolean r6 = r6.B
            if (r6 == 0) goto L213
            if (r2 == 0) goto L210
            long r5 = r2.c
            boolean r2 = r2.d
            if (r2 != 0) goto L210
            long r5 = r5 & r18
            int r2 = (int) r5
            int r2 = r2 + r17
            int r24 = r2 + r24
        L210:
            r27 = r24
            goto L236
        L213:
            r12 = r7
            r31 = r15
            r27 = r24
            r6 = r32
            goto L221
        L21b:
            r25 = r12
            r23 = r26
            r6 = r28
        L221:
            r9 = r10
            r8 = r15
            r21 = r8
            r2 = r33
            r10 = 2147483647(0x7fffffff, float:NaN)
            r15 = r11
            r11 = r32
            goto L181
        L22f:
            r33 = r2
            r10 = r9
            r32 = r11
            r15 = r21
        L236:
            int r2 = r27 - r17
            long r14 = defpackage.d93.a(r2, r15)
        L23c:
            r2 = 32
            long r5 = r14 >> r2
            int r2 = (int) r5
            long r5 = r14 & r18
            int r5 = (int) r5
            if (r2 > r1) goto L25e
            if (r5 >= r10) goto L249
            goto L25e
        L249:
            if (r2 >= r1) goto L25d
            int r0 = r7 + (-1)
        L24d:
            r6 = r35
            r14 = r2
            r12 = r7
            r9 = r10
            r11 = r32
            r2 = r33
            r5 = 1
            r8 = 2
            r10 = 2147483647(0x7fffffff, float:NaN)
            goto Le7
        L25d:
            return r7
        L25e:
            int r4 = r7 + 1
            if (r4 <= r0) goto L24d
            return r4
        L263:
            return r12
        L264:
            r32 = r11
            defpackage.fa6.c()
            return r32
        L26a:
            r32 = r11
            defpackage.fa6.c()
            return r32
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof defpackage.r84
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            r84 r4 = (defpackage.r84) r4
            ig2 r3 = r3.a
            ig2 r4 = r4.a
            boolean r3 = defpackage.nb3.k(r3, r4)
            if (r3 != 0) goto L17
            return r2
        L17:
            return r0
    }

    @Override // defpackage.e34
    public final int g(defpackage.eb3 r6, java.util.List r7, int r8) {
            r5 = this;
            java.util.ArrayList r7 = defpackage.uj2.G(r6)
            ig2 r5 = r5.a
            gg2 r0 = r5.f
            r1 = 1
            java.lang.Object r1 = defpackage.gt0.K0(r1, r7)
            java.util.List r1 = (java.util.List) r1
            r2 = 0
            if (r1 == 0) goto L19
            java.lang.Object r1 = defpackage.gt0.J0(r1)
            x24 r1 = (defpackage.x24) r1
            goto L1a
        L19:
            r1 = r2
        L1a:
            r3 = 2
            java.lang.Object r3 = defpackage.gt0.K0(r3, r7)
            java.util.List r3 = (java.util.List) r3
            if (r3 == 0) goto L29
            java.lang.Object r2 = defpackage.gt0.J0(r3)
            x24 r2 = (defpackage.x24) r2
        L29:
            r3 = 13
            r4 = 0
            long r3 = defpackage.s21.b(r4, r8, r4, r4, r3)
            r0.b(r1, r2, r3)
            java.lang.Object r7 = defpackage.gt0.J0(r7)
            java.util.List r7 = (java.util.List) r7
            if (r7 != 0) goto L3d
            yt1 r7 = defpackage.yt1.A
        L3d:
            float r0 = r5.c
            int r0 = r6.r0(r0)
            float r1 = r5.e
            int r6 = r6.r0(r1)
            gg2 r5 = r5.f
            int r5 = defpackage.ig2.a(r7, r8, r0, r6, r5)
            return r5
    }

    public final int hashCode() {
            r0 = this;
            ig2 r0 = r0.a
            int r0 = r0.hashCode()
            return r0
    }

    @Override // defpackage.e34
    public final int i(defpackage.eb3 r6, java.util.List r7, int r8) {
            r5 = this;
            java.util.ArrayList r7 = defpackage.uj2.G(r6)
            ig2 r5 = r5.a
            gg2 r0 = r5.f
            r1 = 1
            java.lang.Object r1 = defpackage.gt0.K0(r1, r7)
            java.util.List r1 = (java.util.List) r1
            r2 = 0
            if (r1 == 0) goto L19
            java.lang.Object r1 = defpackage.gt0.J0(r1)
            x24 r1 = (defpackage.x24) r1
            goto L1a
        L19:
            r1 = r2
        L1a:
            r3 = 2
            java.lang.Object r3 = defpackage.gt0.K0(r3, r7)
            java.util.List r3 = (java.util.List) r3
            if (r3 == 0) goto L29
            java.lang.Object r2 = defpackage.gt0.J0(r3)
            x24 r2 = (defpackage.x24) r2
        L29:
            r3 = 13
            r4 = 0
            long r3 = defpackage.s21.b(r4, r8, r4, r4, r3)
            r0.b(r1, r2, r3)
            java.lang.Object r7 = defpackage.gt0.J0(r7)
            java.util.List r7 = (java.util.List) r7
            if (r7 != 0) goto L3d
            yt1 r7 = defpackage.yt1.A
        L3d:
            float r0 = r5.c
            int r0 = r6.r0(r0)
            float r1 = r5.e
            int r6 = r6.r0(r1)
            gg2 r5 = r5.f
            int r5 = defpackage.ig2.a(r7, r8, r0, r6, r5)
            return r5
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "MultiContentMeasurePolicyImpl(measurePolicy="
            r0.<init>(r1)
            ig2 r2 = r2.a
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
