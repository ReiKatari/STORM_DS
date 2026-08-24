package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bp4  reason: default package */
/* loaded from: classes.dex */
public final class bp4 implements defpackage.e34 {
    public final defpackage.qn2 a;
    public final boolean b;
    public final float c;
    public final defpackage.lq4 d;

    public bp4(defpackage.qn2 r1, boolean r2, float r3, defpackage.lq4 r4) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            return
    }

    @Override // defpackage.e34
    public final int a(defpackage.eb3 r4, java.util.List r5, int r6) {
            r3 = this;
            ep3 r0 = new ep3
            r1 = 5
            r2 = 0
            r0.<init>(r1, r2)
            int r3 = r3.c(r4, r5, r6, r0)
            return r3
    }

    public final int b(defpackage.eb3 r19, java.util.List r20, int r21, defpackage.eo2 r22) {
            r18 = this;
            r0 = r18
            r1 = r20
            r2 = r21
            r3 = r22
            int r4 = r1.size()
            r5 = 0
            r6 = r5
        Le:
            r7 = 0
            if (r6 >= r4) goto L28
            java.lang.Object r8 = r1.get(r6)
            r9 = r8
            x24 r9 = (defpackage.x24) r9
            java.lang.Object r9 = defpackage.nj2.r(r9)
            java.lang.String r10 = "Leading"
            boolean r9 = defpackage.nb3.k(r9, r10)
            if (r9 == 0) goto L25
            goto L29
        L25:
            int r6 = r6 + 1
            goto Le
        L28:
            r8 = r7
        L29:
            x24 r8 = (defpackage.x24) r8
            r4 = 2147483647(0x7fffffff, float:NaN)
            if (r8 == 0) goto L4c
            int r6 = r8.u(r4)
            if (r2 != r4) goto L38
            r6 = r2
            goto L3d
        L38:
            int r6 = r2 - r6
            if (r6 >= 0) goto L3d
            r6 = r5
        L3d:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r2)
            java.lang.Object r8 = r3.o(r8, r9)
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            goto L4e
        L4c:
            r6 = r2
            r8 = r5
        L4e:
            int r9 = r1.size()
            r10 = r5
        L53:
            if (r10 >= r9) goto L6c
            java.lang.Object r11 = r1.get(r10)
            r12 = r11
            x24 r12 = (defpackage.x24) r12
            java.lang.Object r12 = defpackage.nj2.r(r12)
            java.lang.String r13 = "Trailing"
            boolean r12 = defpackage.nb3.k(r12, r13)
            if (r12 == 0) goto L69
            goto L6d
        L69:
            int r10 = r10 + 1
            goto L53
        L6c:
            r11 = r7
        L6d:
            x24 r11 = (defpackage.x24) r11
            if (r11 == 0) goto L8c
            int r9 = r11.u(r4)
            if (r6 != r4) goto L78
            goto L7c
        L78:
            int r6 = r6 - r9
            if (r6 >= 0) goto L7c
            r6 = r5
        L7c:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            java.lang.Object r4 = r3.o(r11, r4)
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            r9 = r4
            goto L8d
        L8c:
            r9 = r5
        L8d:
            int r4 = r1.size()
            r10 = r5
        L92:
            if (r10 >= r4) goto Lab
            java.lang.Object r11 = r1.get(r10)
            r12 = r11
            x24 r12 = (defpackage.x24) r12
            java.lang.Object r12 = defpackage.nj2.r(r12)
            java.lang.String r13 = "Label"
            boolean r12 = defpackage.nb3.k(r12, r13)
            if (r12 == 0) goto La8
            goto Lac
        La8:
            int r10 = r10 + 1
            goto L92
        Lab:
            r11 = r7
        Lac:
            x24 r11 = (defpackage.x24) r11
            if (r11 == 0) goto Lc6
            float r4 = r0.c
            int r2 = defpackage.oi2.M(r4, r6, r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r3.o(r11, r2)
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r11 = r2
            goto Lc7
        Lc6:
            r11 = r5
        Lc7:
            int r2 = r1.size()
            r4 = r5
        Lcc:
            if (r4 >= r2) goto L13b
            java.lang.Object r10 = r1.get(r4)
            r12 = r10
            x24 r12 = (defpackage.x24) r12
            java.lang.Object r12 = defpackage.nj2.r(r12)
            java.lang.String r13 = "TextField"
            boolean r12 = defpackage.nb3.k(r12, r13)
            if (r12 == 0) goto L138
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            java.lang.Object r2 = r3.o(r10, r2)
            java.lang.Number r2 = (java.lang.Number) r2
            int r10 = r2.intValue()
            int r2 = r1.size()
            r4 = r5
        Lf4:
            if (r4 >= r2) goto L10e
            java.lang.Object r12 = r1.get(r4)
            r13 = r12
            x24 r13 = (defpackage.x24) r13
            java.lang.Object r13 = defpackage.nj2.r(r13)
            java.lang.String r14 = "Hint"
            boolean r13 = defpackage.nb3.k(r13, r14)
            if (r13 == 0) goto L10b
            r7 = r12
            goto L10e
        L10b:
            int r4 = r4 + 1
            goto Lf4
        L10e:
            x24 r7 = (defpackage.x24) r7
            if (r7 == 0) goto L122
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            java.lang.Object r1 = r3.o(r7, r1)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r12 = r1
            goto L123
        L122:
            r12 = r5
        L123:
            r1 = 15
            long r14 = defpackage.s21.b(r5, r5, r5, r5, r1)
            float r16 = r19.a()
            lq4 r1 = r0.d
            float r13 = r0.c
            r17 = r1
            int r0 = defpackage.zo4.d(r8, r9, r10, r11, r12, r13, r14, r16, r17)
            return r0
        L138:
            int r4 = r4 + 1
            goto Lcc
        L13b:
            java.lang.String r0 = "Collection contains no element matching the predicate."
            defpackage.ex3.b(r0)
            defpackage.e41.c()
            return r5
    }

    public final int c(defpackage.eb3 r15, java.util.List r16, int r17, defpackage.eo2 r18) {
            r14 = this;
            r0 = r16
            r1 = r18
            int r2 = r0.size()
            r3 = 0
            r4 = r3
        La:
            if (r4 >= r2) goto L114
            java.lang.Object r5 = r0.get(r4)
            r6 = r5
            x24 r6 = (defpackage.x24) r6
            java.lang.Object r6 = defpackage.nj2.r(r6)
            java.lang.String r7 = "TextField"
            boolean r6 = defpackage.nb3.k(r6, r7)
            if (r6 == 0) goto L110
            java.lang.Integer r2 = java.lang.Integer.valueOf(r17)
            java.lang.Object r2 = r1.o(r5, r2)
            java.lang.Number r2 = (java.lang.Number) r2
            int r6 = r2.intValue()
            int r2 = r0.size()
            r4 = r3
        L32:
            r5 = 0
            if (r4 >= r2) goto L4c
            java.lang.Object r7 = r0.get(r4)
            r8 = r7
            x24 r8 = (defpackage.x24) r8
            java.lang.Object r8 = defpackage.nj2.r(r8)
            java.lang.String r9 = "Label"
            boolean r8 = defpackage.nb3.k(r8, r9)
            if (r8 == 0) goto L49
            goto L4d
        L49:
            int r4 = r4 + 1
            goto L32
        L4c:
            r7 = r5
        L4d:
            x24 r7 = (defpackage.x24) r7
            if (r7 == 0) goto L61
            java.lang.Integer r2 = java.lang.Integer.valueOf(r17)
            java.lang.Object r2 = r1.o(r7, r2)
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r7 = r2
            goto L62
        L61:
            r7 = r3
        L62:
            int r2 = r0.size()
            r4 = r3
        L67:
            if (r4 >= r2) goto L80
            java.lang.Object r8 = r0.get(r4)
            r9 = r8
            x24 r9 = (defpackage.x24) r9
            java.lang.Object r9 = defpackage.nj2.r(r9)
            java.lang.String r10 = "Trailing"
            boolean r9 = defpackage.nb3.k(r9, r10)
            if (r9 == 0) goto L7d
            goto L81
        L7d:
            int r4 = r4 + 1
            goto L67
        L80:
            r8 = r5
        L81:
            x24 r8 = (defpackage.x24) r8
            if (r8 == 0) goto L94
            java.lang.Integer r2 = java.lang.Integer.valueOf(r17)
            java.lang.Object r2 = r1.o(r8, r2)
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            goto L95
        L94:
            r2 = r3
        L95:
            int r4 = r0.size()
            r8 = r3
        L9a:
            if (r8 >= r4) goto Lb3
            java.lang.Object r9 = r0.get(r8)
            r10 = r9
            x24 r10 = (defpackage.x24) r10
            java.lang.Object r10 = defpackage.nj2.r(r10)
            java.lang.String r11 = "Leading"
            boolean r10 = defpackage.nb3.k(r10, r11)
            if (r10 == 0) goto Lb0
            goto Lb4
        Lb0:
            int r8 = r8 + 1
            goto L9a
        Lb3:
            r9 = r5
        Lb4:
            x24 r9 = (defpackage.x24) r9
            if (r9 == 0) goto Lc7
            java.lang.Integer r4 = java.lang.Integer.valueOf(r17)
            java.lang.Object r4 = r1.o(r9, r4)
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            goto Lc8
        Lc7:
            r4 = r3
        Lc8:
            int r8 = r0.size()
            r9 = r3
        Lcd:
            if (r9 >= r8) goto Le7
            java.lang.Object r10 = r0.get(r9)
            r11 = r10
            x24 r11 = (defpackage.x24) r11
            java.lang.Object r11 = defpackage.nj2.r(r11)
            java.lang.String r12 = "Hint"
            boolean r11 = defpackage.nb3.k(r11, r12)
            if (r11 == 0) goto Le4
            r5 = r10
            goto Le7
        Le4:
            int r9 = r9 + 1
            goto Lcd
        Le7:
            x24 r5 = (defpackage.x24) r5
            if (r5 == 0) goto Lfb
            java.lang.Integer r0 = java.lang.Integer.valueOf(r17)
            java.lang.Object r0 = r1.o(r5, r0)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r8 = r0
            goto Lfc
        Lfb:
            r8 = r3
        Lfc:
            r0 = 15
            long r10 = defpackage.s21.b(r3, r3, r3, r3, r0)
            float r12 = r15.a()
            lq4 r13 = r14.d
            float r9 = r14.c
            r5 = r2
            int r14 = defpackage.zo4.e(r4, r5, r6, r7, r8, r9, r10, r12, r13)
            return r14
        L110:
            int r4 = r4 + 1
            goto La
        L114:
            java.lang.String r14 = "Collection contains no element matching the predicate."
            defpackage.ex3.b(r14)
            defpackage.e41.c()
            return r3
    }

    @Override // defpackage.e34
    public final defpackage.f34 d(defpackage.g34 r31, java.util.List r32, long r33) {
            r30 = this;
            r9 = r30
            r10 = r31
            r0 = r32
            lq4 r1 = r9.d
            float r2 = r1.a()
            int r2 = r10.r0(r2)
            r16 = 0
            r17 = 10
            r13 = 0
            r14 = 0
            r15 = 0
            r11 = r33
            long r3 = defpackage.q21.a(r11, r13, r14, r15, r16, r17)
            int r5 = r0.size()
            r6 = 0
            r7 = r6
        L23:
            if (r7 >= r5) goto L3c
            java.lang.Object r11 = r0.get(r7)
            r12 = r11
            x24 r12 = (defpackage.x24) r12
            java.lang.Object r12 = defpackage.lb4.u(r12)
            java.lang.String r13 = "Leading"
            boolean r12 = defpackage.nb3.k(r12, r13)
            if (r12 == 0) goto L39
            goto L3d
        L39:
            int r7 = r7 + 1
            goto L23
        L3c:
            r11 = 0
        L3d:
            x24 r11 = (defpackage.x24) r11
            if (r11 == 0) goto L46
            dx4 r5 = r11.y(r3)
            goto L47
        L46:
            r5 = 0
        L47:
            if (r5 == 0) goto L4c
            int r7 = r5.A
            goto L4d
        L4c:
            r7 = r6
        L4d:
            int r11 = r0.size()
            r12 = r6
        L52:
            if (r12 >= r11) goto L6b
            java.lang.Object r13 = r0.get(r12)
            r14 = r13
            x24 r14 = (defpackage.x24) r14
            java.lang.Object r14 = defpackage.lb4.u(r14)
            java.lang.String r15 = "Trailing"
            boolean r14 = defpackage.nb3.k(r14, r15)
            if (r14 == 0) goto L68
            goto L6c
        L68:
            int r12 = r12 + 1
            goto L52
        L6b:
            r13 = 0
        L6c:
            x24 r13 = (defpackage.x24) r13
            if (r13 == 0) goto L7a
            int r11 = -r7
            long r11 = defpackage.s21.i(r3, r11, r6)
            dx4 r11 = r13.y(r11)
            goto L7b
        L7a:
            r11 = 0
        L7b:
            if (r11 == 0) goto L80
            int r12 = r11.A
            goto L81
        L80:
            r12 = r6
        L81:
            int r7 = r7 + r12
            kk3 r12 = r10.getLayoutDirection()
            float r12 = r1.b(r12)
            int r12 = r10.r0(r12)
            kk3 r13 = r10.getLayoutDirection()
            float r13 = r1.c(r13)
            int r13 = r10.r0(r13)
            int r13 = r13 + r12
            int r7 = -r7
            int r12 = r7 - r13
            int r13 = -r13
            float r14 = r9.c
            int r12 = defpackage.oi2.M(r14, r12, r13)
            int r2 = -r2
            long r3 = defpackage.s21.i(r3, r12, r2)
            int r12 = r0.size()
            r13 = r6
        Laf:
            if (r13 >= r12) goto Lc9
            java.lang.Object r14 = r0.get(r13)
            r15 = r14
            x24 r15 = (defpackage.x24) r15
            java.lang.Object r15 = defpackage.lb4.u(r15)
            java.lang.String r6 = "Label"
            boolean r6 = defpackage.nb3.k(r15, r6)
            if (r6 == 0) goto Lc5
            goto Lca
        Lc5:
            int r13 = r13 + 1
            r6 = 0
            goto Laf
        Lc9:
            r14 = 0
        Lca:
            x24 r14 = (defpackage.x24) r14
            if (r14 == 0) goto Ld4
            dx4 r3 = r14.y(r3)
            r6 = r3
            goto Ld5
        Ld4:
            r6 = 0
        Ld5:
            if (r6 == 0) goto Lf2
            int r3 = r6.A
            float r3 = (float) r3
            int r4 = r6.B
            float r4 = (float) r4
            int r3 = java.lang.Float.floatToRawIntBits(r3)
            long r12 = (long) r3
            int r3 = java.lang.Float.floatToRawIntBits(r4)
            long r3 = (long) r3
            r14 = 32
            long r12 = r12 << r14
            r14 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r14
            long r3 = r3 | r12
            goto Lf4
        Lf2:
            r3 = 0
        Lf4:
            xi6 r12 = new xi6
            r12.<init>(r3)
            qn2 r3 = r9.a
            r3.g(r12)
            if (r6 == 0) goto L103
            int r3 = r6.B
            goto L104
        L103:
            r3 = 0
        L104:
            int r3 = r3 / 2
            float r1 = r1.d()
            int r1 = r10.r0(r1)
            int r1 = java.lang.Math.max(r3, r1)
            int r2 = r2 - r1
            r3 = r33
            long r12 = defpackage.s21.i(r3, r7, r2)
            r17 = 0
            r18 = 11
            r14 = 0
            r15 = 0
            r16 = 0
            long r1 = defpackage.q21.a(r12, r14, r15, r16, r17, r18)
            int r7 = r0.size()
            r12 = 0
        L12a:
            java.lang.String r28 = "Collection contains no element matching the predicate."
            if (r12 >= r7) goto L24c
            java.lang.Object r13 = r0.get(r12)
            x24 r13 = (defpackage.x24) r13
            java.lang.Object r14 = defpackage.lb4.u(r13)
            java.lang.String r15 = "TextField"
            boolean r14 = defpackage.nb3.k(r14, r15)
            if (r14 == 0) goto L240
            dx4 r7 = r13.y(r1)
            r26 = 0
            r27 = 14
            r23 = 0
            r24 = 0
            r25 = 0
            r21 = r1
            long r1 = defpackage.q21.a(r21, r23, r24, r25, r26, r27)
            int r12 = r0.size()
            r13 = 0
        L159:
            if (r13 >= r12) goto L174
            java.lang.Object r14 = r0.get(r13)
            r15 = r14
            x24 r15 = (defpackage.x24) r15
            java.lang.Object r15 = defpackage.lb4.u(r15)
            r21 = 0
            java.lang.String r8 = "Hint"
            boolean r8 = defpackage.nb3.k(r15, r8)
            if (r8 == 0) goto L171
            goto L178
        L171:
            int r13 = r13 + 1
            goto L159
        L174:
            r21 = 0
            r14 = r21
        L178:
            x24 r14 = (defpackage.x24) r14
            if (r14 == 0) goto L181
            dx4 r1 = r14.y(r1)
            goto L183
        L181:
            r1 = r21
        L183:
            if (r5 == 0) goto L188
            int r2 = r5.A
            goto L189
        L188:
            r2 = 0
        L189:
            if (r11 == 0) goto L18f
            int r8 = r11.A
            r12 = r8
            goto L190
        L18f:
            r12 = 0
        L190:
            int r13 = r7.A
            if (r6 == 0) goto L198
            int r8 = r6.A
            r14 = r8
            goto L199
        L198:
            r14 = 0
        L199:
            if (r1 == 0) goto L19f
            int r8 = r1.A
            r15 = r8
            goto L1a0
        L19f:
            r15 = 0
        L1a0:
            float r19 = r10.a()
            lq4 r8 = r9.d
            r16 = r2
            float r2 = r9.c
            r17 = r3
            r20 = r8
            r4 = r11
            r11 = r16
            r16 = r2
            int r2 = defpackage.zo4.e(r11, r12, r13, r14, r15, r16, r17, r19, r20)
            if (r5 == 0) goto L1bd
            int r3 = r5.B
            r11 = r3
            goto L1be
        L1bd:
            r11 = 0
        L1be:
            if (r4 == 0) goto L1c4
            int r3 = r4.B
            r12 = r3
            goto L1c5
        L1c4:
            r12 = 0
        L1c5:
            int r13 = r7.B
            if (r6 == 0) goto L1cd
            int r3 = r6.B
            r14 = r3
            goto L1ce
        L1cd:
            r14 = 0
        L1ce:
            if (r1 == 0) goto L1d4
            int r3 = r1.B
            r15 = r3
            goto L1d5
        L1d4:
            r15 = 0
        L1d5:
            float r19 = r10.a()
            lq4 r3 = r9.d
            float r8 = r9.c
            r17 = r33
            r20 = r3
            r16 = r8
            int r3 = defpackage.zo4.d(r11, r12, r13, r14, r15, r16, r17, r19, r20)
            int r8 = r0.size()
            r11 = 0
        L1ec:
            if (r11 >= r8) goto L239
            java.lang.Object r12 = r0.get(r11)
            x24 r12 = (defpackage.x24) r12
            java.lang.Object r13 = defpackage.lb4.u(r12)
            java.lang.String r14 = "border"
            boolean r13 = defpackage.nb3.k(r13, r14)
            if (r13 == 0) goto L228
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r2 == r0) goto L207
            r8 = r2
            goto L208
        L207:
            r8 = 0
        L208:
            if (r3 == r0) goto L20c
            r0 = r3
            goto L20d
        L20c:
            r0 = 0
        L20d:
            long r13 = defpackage.s21.a(r8, r2, r0, r3)
            dx4 r8 = r12.y(r13)
            ap4 r0 = new ap4
            r29 = r7
            r7 = r1
            r1 = r3
            r3 = r5
            r5 = r29
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            zt1 r3 = defpackage.zt1.A
            f34 r0 = r10.K(r2, r1, r3, r0)
            return r0
        L228:
            r29 = r7
            r7 = r1
            r1 = r3
            r3 = r5
            r5 = r29
            int r11 = r11 + 1
            r9 = r3
            r3 = r1
            r1 = r7
            r7 = r5
            r5 = r9
            r9 = r30
            goto L1ec
        L239:
            defpackage.ex3.b(r28)
            defpackage.e41.c()
            return r21
        L240:
            r3 = r5
            r4 = r11
            r21 = 0
            int r12 = r12 + 1
            r9 = r30
            r3 = r33
            goto L12a
        L24c:
            r21 = 0
            defpackage.ex3.b(r28)
            defpackage.e41.c()
            return r21
    }

    @Override // defpackage.e34
    public final int e(defpackage.eb3 r4, java.util.List r5, int r6) {
            r3 = this;
            ep3 r0 = new ep3
            r1 = 6
            r2 = 0
            r0.<init>(r1, r2)
            int r3 = r3.c(r4, r5, r6, r0)
            return r3
    }

    @Override // defpackage.e34
    public final int g(defpackage.eb3 r4, java.util.List r5, int r6) {
            r3 = this;
            ep3 r0 = new ep3
            r1 = 7
            r2 = 0
            r0.<init>(r1, r2)
            int r3 = r3.b(r4, r5, r6, r0)
            return r3
    }

    @Override // defpackage.e34
    public final int i(defpackage.eb3 r4, java.util.List r5, int r6) {
            r3 = this;
            ep3 r0 = new ep3
            r1 = 4
            r2 = 0
            r0.<init>(r1, r2)
            int r3 = r3.b(r4, r5, r6, r0)
            return r3
    }
}
