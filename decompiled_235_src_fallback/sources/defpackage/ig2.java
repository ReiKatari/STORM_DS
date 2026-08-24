package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ig2  reason: default package */
/* loaded from: classes.dex */
public final class ig2 implements defpackage.i26 {
    public final defpackage.fu a;
    public final defpackage.iu b;
    public final float c;
    public final defpackage.l71 d;
    public final float e;
    public final defpackage.gg2 f;

    public ig2(defpackage.fu r1, defpackage.iu r2, float r3, defpackage.l71 r4, float r5, defpackage.gg2 r6) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            r0.f = r6
            return
    }

    public static int a(java.util.List r24, int r25, int r26, int r27, defpackage.gg2 r28) {
            r0 = r24
            r1 = r25
            boolean r2 = r0.isEmpty()
            r3 = 0
            if (r2 == 0) goto L11
            long r0 = defpackage.d93.a(r3, r3)
            goto L13e
        L11:
            r2 = 2147483647(0x7fffffff, float:NaN)
            long r6 = defpackage.s21.a(r3, r1, r3, r2)
            ag2 r8 = new ag2
            r9 = r27
            r5 = r28
            r4 = r8
            r8 = r26
            r4.<init>(r5, r6, r8, r9)
            r8 = r4
            java.lang.Object r4 = defpackage.gt0.K0(r3, r0)
            x24 r4 = (defpackage.x24) r4
            if (r4 == 0) goto L32
            int r5 = r4.V(r1)
            goto L33
        L32:
            r5 = r3
        L33:
            if (r4 == 0) goto L3a
            int r6 = r4.n(r5)
            goto L3b
        L3a:
            r6 = r3
        L3b:
            int r7 = r0.size()
            r9 = 1
            if (r7 <= r9) goto L44
            r7 = r9
            goto L46
        L44:
            r7 = r9
            r9 = r3
        L46:
            long r11 = defpackage.d93.a(r1, r2)
            r19 = 0
            if (r4 != 0) goto L51
            r13 = r19
            goto L5b
        L51:
            long r13 = defpackage.d93.a(r6, r5)
            d93 r10 = new d93
            r10.<init>(r13)
            r13 = r10
        L5b:
            r17 = 0
            r18 = 0
            r10 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            zf2 r9 = r8.b(r9, r10, r11, r13, r14, r15, r16, r17, r18)
            boolean r9 = r9.B
            r20 = 4294967295(0xffffffff, double:2.1219957905E-314)
            if (r9 == 0) goto L8c
            if (r4 == 0) goto L77
            r9 = r7
        L74:
            r5 = r28
            goto L79
        L77:
            r9 = r3
            goto L74
        L79:
            d93 r0 = r5.a(r3, r9, r3)
            if (r0 == 0) goto L85
            long r0 = r0.a
            long r0 = r0 & r20
            int r0 = (int) r0
            goto L86
        L85:
            r0 = r3
        L86:
            long r0 = defpackage.d93.a(r0, r3)
            goto L13e
        L8c:
            int r4 = r0.size()
            r12 = r1
            r10 = r3
            r13 = r10
            r22 = r13
            r11 = r14
            r9 = r16
        L98:
            if (r10 >= r4) goto L138
            int r6 = r12 - r6
            int r12 = r10 + 1
            int r16 = java.lang.Math.max(r9, r5)
            java.lang.Object r5 = defpackage.gt0.K0(r12, r0)
            x24 r5 = (defpackage.x24) r5
            if (r5 == 0) goto Laf
            int r9 = r5.V(r1)
            goto Lb0
        Laf:
            r9 = r3
        Lb0:
            if (r5 == 0) goto Lb9
            int r13 = r5.n(r9)
            int r13 = r13 + r26
            goto Lba
        Lb9:
            r13 = r3
        Lba:
            int r10 = r10 + 2
            int r14 = r0.size()
            if (r10 >= r14) goto Lc4
            r10 = r7
            goto Lc5
        Lc4:
            r10 = r3
        Lc5:
            int r14 = r12 - r22
            r18 = r10
            r17 = r12
            r10 = r14
            r14 = r11
            long r11 = defpackage.d93.a(r6, r2)
            if (r5 != 0) goto Ld8
            r7 = r19
        Ld5:
            r2 = r17
            goto Le2
        Ld8:
            long r2 = defpackage.d93.a(r13, r9)
            d93 r7 = new d93
            r7.<init>(r2)
            goto Ld5
        Le2:
            r17 = 0
            r3 = r9
            r9 = r18
            r18 = 0
            r23 = r13
            r13 = r7
            r7 = r23
            zf2 r9 = r8.b(r9, r10, r11, r13, r14, r15, r16, r17, r18)
            boolean r11 = r9.A
            if (r11 == 0) goto L128
            int r16 = r16 + r27
            int r12 = r16 + r15
            r11 = r14
            r14 = r10
            if (r5 == 0) goto L101
            r10 = 1
        Lff:
            r13 = r6
            goto L103
        L101:
            r10 = 0
            goto Lff
        L103:
            yf2 r5 = r8.a(r9, r10, r11, r12, r13, r14)
            r14 = r11
            int r13 = r7 - r26
            int r11 = r14 + 1
            boolean r6 = r9.B
            if (r6 == 0) goto L121
            if (r5 == 0) goto L11e
            long r0 = r5.c
            boolean r3 = r5.d
            if (r3 != 0) goto L11e
            long r0 = r0 & r20
            int r0 = (int) r0
            int r0 = r0 + r27
            int r12 = r12 + r0
        L11e:
            r15 = r12
            r13 = r2
            goto L138
        L121:
            r22 = r2
            r15 = r12
            r6 = r13
            r9 = 0
            r12 = r1
            goto L12e
        L128:
            r13 = r6
            r6 = r7
            r12 = r13
            r11 = r14
            r9 = r16
        L12e:
            r10 = r2
            r13 = r10
            r5 = r3
            r2 = 2147483647(0x7fffffff, float:NaN)
            r3 = 0
            r7 = 1
            goto L98
        L138:
            int r15 = r15 - r27
            long r0 = defpackage.d93.a(r15, r13)
        L13e:
            r2 = 32
            long r0 = r0 >> r2
            int r0 = (int) r0
            return r0
    }

    @Override // defpackage.i26
    public final void b(int r7, int[] r8, int[] r9, defpackage.g34 r10) {
            r6 = this;
            fu r0 = r6.a
            kk3 r4 = r10.getLayoutDirection()
            r2 = r7
            r3 = r8
            r5 = r9
            r1 = r10
            r0.d(r1, r2, r3, r4, r5)
            return
    }

    @Override // defpackage.i26
    public final long c(int r1, int r2, int r3, boolean r4) {
            r0 = this;
            l26 r0 = defpackage.k26.a
            r0 = 0
            if (r4 != 0) goto La
            long r0 = defpackage.s21.a(r1, r2, r0, r3)
            return r0
        La:
            long r0 = defpackage.nb3.t(r1, r2, r0, r3)
            return r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L4d
        L3:
            boolean r0 = r3 instanceof defpackage.ig2
            if (r0 != 0) goto L8
            goto L4b
        L8:
            ig2 r3 = (defpackage.ig2) r3
            fu r0 = r2.a
            fu r1 = r3.a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L4b
        L15:
            iu r0 = r2.b
            iu r1 = r3.b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L4b
        L20:
            float r0 = r2.c
            float r1 = r3.c
            boolean r0 = defpackage.om1.b(r0, r1)
            if (r0 != 0) goto L2b
            goto L4b
        L2b:
            l71 r0 = r2.d
            l71 r1 = r3.d
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L36
            goto L4b
        L36:
            float r0 = r2.e
            float r1 = r3.e
            boolean r0 = defpackage.om1.b(r0, r1)
            if (r0 != 0) goto L41
            goto L4b
        L41:
            gg2 r2 = r2.f
            gg2 r3 = r3.f
            boolean r2 = defpackage.nb3.k(r2, r3)
            if (r2 != 0) goto L4d
        L4b:
            r2 = 0
            return r2
        L4d:
            r2 = 1
            return r2
    }

    @Override // defpackage.i26
    public final defpackage.f34 f(defpackage.dx4[] r11, defpackage.g34 r12, int[] r13, int r14, int r15, int[] r16, int r17, int r18, int r19) {
            r10 = this;
            kk3 r8 = defpackage.kk3.Ltr
            hg2 r0 = new hg2
            r6 = r10
            r5 = r11
            r9 = r13
            r7 = r15
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            zt1 r10 = defpackage.zt1.A
            f34 r10 = r12.K(r14, r15, r10, r0)
            return r10
    }

    @Override // defpackage.i26
    public final int h(defpackage.dx4 r1) {
            r0 = this;
            int r0 = r1.Z()
            return r0
    }

    public final int hashCode() {
            r3 = this;
            r0 = 1
            int r0 = java.lang.Boolean.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            fu r2 = r3.a
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            iu r0 = r3.b
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            int r0 = r0 * r1
            float r2 = r3.c
            int r0 = defpackage.xg6.a(r2, r0, r1)
            l71 r2 = r3.d
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            float r0 = r3.e
            int r0 = defpackage.xg6.a(r0, r2, r1)
            r2 = 2147483647(0x7fffffff, float:NaN)
            int r0 = defpackage.lb1.a(r2, r0, r1)
            int r0 = defpackage.lb1.a(r2, r0, r1)
            gg2 r3 = r3.f
            int r3 = r3.hashCode()
            int r3 = r3 + r0
            return r3
    }

    @Override // defpackage.i26
    public final int j(defpackage.dx4 r1) {
            r0 = this;
            int r0 = r1.d0()
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "FlowMeasurePolicy(isHorizontal=true, horizontalArrangement="
            r0.<init>(r1)
            fu r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", verticalArrangement="
            r0.append(r1)
            iu r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", mainAxisSpacing="
            r0.append(r1)
            float r1 = r2.c
            java.lang.String r1 = defpackage.om1.c(r1)
            r0.append(r1)
            java.lang.String r1 = ", crossAxisAlignment="
            r0.append(r1)
            l71 r1 = r2.d
            r0.append(r1)
            java.lang.String r1 = ", crossAxisArrangementSpacing="
            r0.append(r1)
            float r1 = r2.e
            java.lang.String r1 = defpackage.om1.c(r1)
            r0.append(r1)
            java.lang.String r1 = ", maxItemsInMainAxis=2147483647, maxLines=2147483647, overflow="
            r0.append(r1)
            gg2 r2 = r2.f
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
