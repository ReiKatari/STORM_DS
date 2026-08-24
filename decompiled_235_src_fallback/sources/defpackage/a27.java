package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: a27  reason: default package */
/* loaded from: classes.dex */
public final class a27 implements defpackage.e34 {
    public final boolean a;
    public final float b;
    public final defpackage.lq4 c;

    public a27(boolean r1, float r2, defpackage.lq4 r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            return
    }

    public static int c(java.util.List r11, int r12, defpackage.eo2 r13) {
            int r0 = r11.size()
            r1 = 0
            r2 = r1
        L6:
            if (r2 >= r0) goto L10f
            java.lang.Object r3 = r11.get(r2)
            r4 = r3
            x24 r4 = (defpackage.x24) r4
            java.lang.Object r4 = defpackage.nj2.r(r4)
            java.lang.String r5 = "TextField"
            boolean r4 = defpackage.nb3.k(r4, r5)
            if (r4 == 0) goto L10b
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)
            java.lang.Object r0 = r13.o(r3, r0)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r2 = r11.size()
            r3 = r1
        L2e:
            r4 = 0
            if (r3 >= r2) goto L48
            java.lang.Object r5 = r11.get(r3)
            r6 = r5
            x24 r6 = (defpackage.x24) r6
            java.lang.Object r6 = defpackage.nj2.r(r6)
            java.lang.String r7 = "Label"
            boolean r6 = defpackage.nb3.k(r6, r7)
            if (r6 == 0) goto L45
            goto L49
        L45:
            int r3 = r3 + 1
            goto L2e
        L48:
            r5 = r4
        L49:
            x24 r5 = (defpackage.x24) r5
            if (r5 == 0) goto L5c
            java.lang.Integer r2 = java.lang.Integer.valueOf(r12)
            java.lang.Object r2 = r13.o(r5, r2)
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            goto L5d
        L5c:
            r2 = r1
        L5d:
            int r3 = r11.size()
            r5 = r1
        L62:
            if (r5 >= r3) goto L7b
            java.lang.Object r6 = r11.get(r5)
            r7 = r6
            x24 r7 = (defpackage.x24) r7
            java.lang.Object r7 = defpackage.nj2.r(r7)
            java.lang.String r8 = "Trailing"
            boolean r7 = defpackage.nb3.k(r7, r8)
            if (r7 == 0) goto L78
            goto L7c
        L78:
            int r5 = r5 + 1
            goto L62
        L7b:
            r6 = r4
        L7c:
            x24 r6 = (defpackage.x24) r6
            if (r6 == 0) goto L8f
            java.lang.Integer r3 = java.lang.Integer.valueOf(r12)
            java.lang.Object r3 = r13.o(r6, r3)
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            goto L90
        L8f:
            r3 = r1
        L90:
            int r5 = r11.size()
            r6 = r1
        L95:
            if (r6 >= r5) goto Lae
            java.lang.Object r7 = r11.get(r6)
            r8 = r7
            x24 r8 = (defpackage.x24) r8
            java.lang.Object r8 = defpackage.nj2.r(r8)
            java.lang.String r9 = "Leading"
            boolean r8 = defpackage.nb3.k(r8, r9)
            if (r8 == 0) goto Lab
            goto Laf
        Lab:
            int r6 = r6 + 1
            goto L95
        Lae:
            r7 = r4
        Laf:
            x24 r7 = (defpackage.x24) r7
            if (r7 == 0) goto Lc2
            java.lang.Integer r5 = java.lang.Integer.valueOf(r12)
            java.lang.Object r5 = r13.o(r7, r5)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            goto Lc3
        Lc2:
            r5 = r1
        Lc3:
            int r6 = r11.size()
            r7 = r1
        Lc8:
            if (r7 >= r6) goto Le2
            java.lang.Object r8 = r11.get(r7)
            r9 = r8
            x24 r9 = (defpackage.x24) r9
            java.lang.Object r9 = defpackage.nj2.r(r9)
            java.lang.String r10 = "Hint"
            boolean r9 = defpackage.nb3.k(r9, r10)
            if (r9 == 0) goto Ldf
            r4 = r8
            goto Le2
        Ldf:
            int r7 = r7 + 1
            goto Lc8
        Le2:
            x24 r4 = (defpackage.x24) r4
            if (r4 == 0) goto Lf5
            java.lang.Integer r11 = java.lang.Integer.valueOf(r12)
            java.lang.Object r11 = r13.o(r4, r11)
            java.lang.Number r11 = (java.lang.Number) r11
            int r11 = r11.intValue()
            goto Lf6
        Lf5:
            r11 = r1
        Lf6:
            r12 = 15
            long r12 = defpackage.s21.b(r1, r1, r1, r1, r12)
            int r11 = java.lang.Math.max(r2, r11)
            int r11 = java.lang.Math.max(r0, r11)
            int r11 = r11 + r5
            int r11 = r11 + r3
            int r11 = defpackage.s21.g(r11, r12)
            return r11
        L10b:
            int r2 = r2 + 1
            goto L6
        L10f:
            java.lang.String r11 = "Collection contains no element matching the predicate."
            defpackage.ex3.b(r11)
            defpackage.e41.c()
            return r1
    }

    @Override // defpackage.e34
    public final int a(defpackage.eb3 r2, java.util.List r3, int r4) {
            r1 = this;
            l56 r1 = new l56
            r2 = 27
            r0 = 0
            r1.<init>(r2, r0)
            int r1 = c(r3, r4, r1)
            return r1
    }

    public final int b(defpackage.eb3 r18, java.util.List r19, int r20, defpackage.eo2 r21) {
            r17 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            int r3 = r0.size()
            r4 = 0
            r5 = r4
        Lc:
            r6 = 0
            if (r5 >= r3) goto L26
            java.lang.Object r7 = r0.get(r5)
            r8 = r7
            x24 r8 = (defpackage.x24) r8
            java.lang.Object r8 = defpackage.nj2.r(r8)
            java.lang.String r9 = "Leading"
            boolean r8 = defpackage.nb3.k(r8, r9)
            if (r8 == 0) goto L23
            goto L27
        L23:
            int r5 = r5 + 1
            goto Lc
        L26:
            r7 = r6
        L27:
            x24 r7 = (defpackage.x24) r7
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r7 == 0) goto L4b
            int r5 = r7.u(r3)
            if (r1 != r3) goto L36
            r5 = r1
            goto L3b
        L36:
            int r5 = r1 - r5
            if (r5 >= 0) goto L3b
            r5 = r4
        L3b:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r1)
            java.lang.Object r7 = r2.o(r7, r8)
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            r10 = r7
            goto L4d
        L4b:
            r5 = r1
            r10 = r4
        L4d:
            int r7 = r0.size()
            r8 = r4
        L52:
            if (r8 >= r7) goto L6b
            java.lang.Object r9 = r0.get(r8)
            r11 = r9
            x24 r11 = (defpackage.x24) r11
            java.lang.Object r11 = defpackage.nj2.r(r11)
            java.lang.String r12 = "Trailing"
            boolean r11 = defpackage.nb3.k(r11, r12)
            if (r11 == 0) goto L68
            goto L6c
        L68:
            int r8 = r8 + 1
            goto L52
        L6b:
            r9 = r6
        L6c:
            x24 r9 = (defpackage.x24) r9
            if (r9 == 0) goto L8b
            int r7 = r9.u(r3)
            if (r5 != r3) goto L77
            goto L7b
        L77:
            int r5 = r5 - r7
            if (r5 >= 0) goto L7b
            r5 = r4
        L7b:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r1 = r2.o(r9, r1)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r11 = r1
            goto L8c
        L8b:
            r11 = r4
        L8c:
            int r1 = r0.size()
            r3 = r4
        L91:
            if (r3 >= r1) goto Laa
            java.lang.Object r7 = r0.get(r3)
            r8 = r7
            x24 r8 = (defpackage.x24) r8
            java.lang.Object r8 = defpackage.nj2.r(r8)
            java.lang.String r9 = "Label"
            boolean r8 = defpackage.nb3.k(r8, r9)
            if (r8 == 0) goto La7
            goto Lab
        La7:
            int r3 = r3 + 1
            goto L91
        Laa:
            r7 = r6
        Lab:
            x24 r7 = (defpackage.x24) r7
            if (r7 == 0) goto Lbf
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            java.lang.Object r1 = r2.o(r7, r1)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r9 = r1
            goto Lc0
        Lbf:
            r9 = r4
        Lc0:
            int r1 = r0.size()
            r3 = r4
        Lc5:
            if (r3 >= r1) goto L13a
            java.lang.Object r7 = r0.get(r3)
            r8 = r7
            x24 r8 = (defpackage.x24) r8
            java.lang.Object r8 = defpackage.nj2.r(r8)
            java.lang.String r12 = "TextField"
            boolean r8 = defpackage.nb3.k(r8, r12)
            if (r8 == 0) goto L137
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            java.lang.Object r1 = r2.o(r7, r1)
            java.lang.Number r1 = (java.lang.Number) r1
            int r7 = r1.intValue()
            int r1 = r0.size()
            r3 = r4
        Led:
            if (r3 >= r1) goto L107
            java.lang.Object r8 = r0.get(r3)
            r12 = r8
            x24 r12 = (defpackage.x24) r12
            java.lang.Object r12 = defpackage.nj2.r(r12)
            java.lang.String r13 = "Hint"
            boolean r12 = defpackage.nb3.k(r12, r13)
            if (r12 == 0) goto L104
            r6 = r8
            goto L107
        L104:
            int r3 = r3 + 1
            goto Led
        L107:
            x24 r6 = (defpackage.x24) r6
            if (r6 == 0) goto L11b
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            java.lang.Object r0 = r2.o(r6, r0)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r12 = r0
            goto L11c
        L11b:
            r12 = r4
        L11c:
            if (r9 <= 0) goto L121
            r0 = 1
            r8 = r0
            goto L122
        L121:
            r8 = r4
        L122:
            r0 = 15
            long r13 = defpackage.s21.b(r4, r4, r4, r4, r0)
            float r15 = r18.a()
            r0 = r17
            lq4 r0 = r0.c
            r16 = r0
            int r0 = defpackage.uj2.j(r7, r8, r9, r10, r11, r12, r13, r15, r16)
            return r0
        L137:
            int r3 = r3 + 1
            goto Lc5
        L13a:
            java.lang.String r0 = "Collection contains no element matching the predicate."
            defpackage.ex3.b(r0)
            defpackage.e41.c()
            return r4
    }

    @Override // defpackage.e34
    public final defpackage.f34 d(defpackage.g34 r26, java.util.List r27, long r28) {
            r25 = this;
            r10 = r25
            r13 = r26
            r0 = r27
            lq4 r1 = r10.c
            float r2 = r1.d()
            int r2 = r13.r0(r2)
            float r1 = r1.a()
            int r1 = r13.r0(r1)
            r3 = 1073741824(0x40000000, float:2.0)
            int r12 = r13.r0(r3)
            r8 = 0
            r9 = 10
            r5 = 0
            r6 = 0
            r7 = 0
            r3 = r28
            long r5 = defpackage.q21.a(r3, r5, r6, r7, r8, r9)
            int r3 = r0.size()
            r4 = 0
            r7 = r4
        L30:
            if (r7 >= r3) goto L49
            java.lang.Object r9 = r0.get(r7)
            r11 = r9
            x24 r11 = (defpackage.x24) r11
            java.lang.Object r11 = defpackage.lb4.u(r11)
            java.lang.String r14 = "Leading"
            boolean r11 = defpackage.nb3.k(r11, r14)
            if (r11 == 0) goto L46
            goto L4a
        L46:
            int r7 = r7 + 1
            goto L30
        L49:
            r9 = 0
        L4a:
            x24 r9 = (defpackage.x24) r9
            if (r9 == 0) goto L53
            dx4 r3 = r9.y(r5)
            goto L54
        L53:
            r3 = 0
        L54:
            if (r3 == 0) goto L59
            int r7 = r3.A
            goto L5a
        L59:
            r7 = r4
        L5a:
            int r9 = r0.size()
            r11 = r4
        L5f:
            if (r11 >= r9) goto L7a
            java.lang.Object r14 = r0.get(r11)
            r15 = r14
            x24 r15 = (defpackage.x24) r15
            java.lang.Object r15 = defpackage.lb4.u(r15)
            r21 = 0
            java.lang.String r8 = "Trailing"
            boolean r8 = defpackage.nb3.k(r15, r8)
            if (r8 == 0) goto L77
            goto L7e
        L77:
            int r11 = r11 + 1
            goto L5f
        L7a:
            r21 = 0
            r14 = r21
        L7e:
            x24 r14 = (defpackage.x24) r14
            if (r14 == 0) goto L8d
            int r8 = -r7
            long r8 = defpackage.s21.i(r5, r8, r4)
            dx4 r8 = r14.y(r8)
            r9 = r8
            goto L8f
        L8d:
            r9 = r21
        L8f:
            if (r9 == 0) goto L94
            int r8 = r9.A
            goto L95
        L94:
            r8 = r4
        L95:
            int r7 = r7 + r8
            int r8 = -r1
            int r7 = -r7
            long r5 = defpackage.s21.i(r5, r7, r8)
            int r11 = r0.size()
            r14 = r4
        La1:
            if (r14 >= r11) goto Lc0
            java.lang.Object r15 = r0.get(r14)
            r16 = r15
            x24 r16 = (defpackage.x24) r16
            java.lang.Object r4 = defpackage.lb4.u(r16)
            r16 = r1
            java.lang.String r1 = "Label"
            boolean r1 = defpackage.nb3.k(r4, r1)
            if (r1 == 0) goto Lba
            goto Lc4
        Lba:
            int r14 = r14 + 1
            r1 = r16
            r4 = 0
            goto La1
        Lc0:
            r16 = r1
            r15 = r21
        Lc4:
            x24 r15 = (defpackage.x24) r15
            if (r15 == 0) goto Lcd
            dx4 r1 = r15.y(r5)
            goto Lcf
        Lcd:
            r1 = r21
        Lcf:
            if (r1 == 0) goto Ldf
            ey2 r4 = defpackage.lc.b
            int r4 = r1.X(r4)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r4 == r5) goto Ldc
            goto Le0
        Ldc:
            int r4 = r1.B
            goto Le0
        Ldf:
            r4 = 0
        Le0:
            int r11 = java.lang.Math.max(r4, r2)
            if (r1 == 0) goto Le9
            int r8 = r8 - r12
            int r8 = r8 - r11
            goto Lec
        Le9:
            int r5 = -r2
            int r8 = r5 - r16
        Lec:
            r19 = 0
            r20 = 11
            r16 = 0
            r17 = 0
            r18 = 0
            r14 = r28
            long r5 = defpackage.q21.a(r14, r16, r17, r18, r19, r20)
            long r14 = defpackage.s21.i(r5, r7, r8)
            int r5 = r0.size()
            r6 = 0
        L105:
            if (r6 >= r5) goto L1d6
            java.lang.Object r7 = r0.get(r6)
            x24 r7 = (defpackage.x24) r7
            java.lang.Object r8 = defpackage.lb4.u(r7)
            r24 = r2
            java.lang.String r2 = "TextField"
            boolean r2 = defpackage.nb3.k(r8, r2)
            if (r2 == 0) goto L1c9
            dx4 r6 = r7.y(r14)
            r19 = 0
            r20 = 14
            r16 = 0
            r17 = 0
            r18 = 0
            long r7 = defpackage.q21.a(r14, r16, r17, r18, r19, r20)
            int r2 = r0.size()
            r5 = 0
        L132:
            if (r5 >= r2) goto L14d
            java.lang.Object r14 = r0.get(r5)
            r15 = r14
            x24 r15 = (defpackage.x24) r15
            java.lang.Object r15 = defpackage.lb4.u(r15)
            java.lang.String r0 = "Hint"
            boolean r0 = defpackage.nb3.k(r15, r0)
            if (r0 == 0) goto L148
            goto L14f
        L148:
            int r5 = r5 + 1
            r0 = r27
            goto L132
        L14d:
            r14 = r21
        L14f:
            x24 r14 = (defpackage.x24) r14
            if (r14 == 0) goto L159
            dx4 r8 = r14.y(r7)
            r7 = r8
            goto L15b
        L159:
            r7 = r21
        L15b:
            if (r3 == 0) goto L160
            int r0 = r3.A
            goto L161
        L160:
            r0 = 0
        L161:
            if (r9 == 0) goto L166
            int r2 = r9.A
            goto L167
        L166:
            r2 = 0
        L167:
            int r5 = r6.A
            if (r1 == 0) goto L16e
            int r8 = r1.A
            goto L16f
        L16e:
            r8 = 0
        L16f:
            if (r7 == 0) goto L174
            int r14 = r7.A
            goto L175
        L174:
            r14 = 0
        L175:
            int r8 = java.lang.Math.max(r8, r14)
            int r5 = java.lang.Math.max(r5, r8)
            int r5 = r5 + r0
            int r5 = r5 + r2
            r14 = r28
            int r0 = defpackage.s21.g(r5, r14)
            int r14 = r6.B
            if (r1 == 0) goto L18c
            r2 = 1
            r15 = r2
            goto L18d
        L18c:
            r15 = 0
        L18d:
            if (r3 == 0) goto L194
            int r2 = r3.B
            r17 = r2
            goto L196
        L194:
            r17 = 0
        L196:
            if (r9 == 0) goto L19d
            int r2 = r9.B
            r18 = r2
            goto L19f
        L19d:
            r18 = 0
        L19f:
            if (r7 == 0) goto L1a6
            int r2 = r7.B
            r19 = r2
            goto L1a8
        L1a6:
            r19 = 0
        L1a8:
            float r22 = r13.a()
            lq4 r2 = r10.c
            r20 = r28
            r23 = r2
            r16 = r11
            int r5 = defpackage.uj2.j(r14, r15, r16, r17, r18, r19, r20, r22, r23)
            r8 = r3
            r3 = r4
            r4 = r0
            y17 r0 = new y17
            r2 = r24
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            zt1 r1 = defpackage.zt1.A
            f34 r0 = r13.K(r4, r5, r1, r0)
            return r0
        L1c9:
            r8 = r3
            r3 = r4
            r2 = r24
            int r6 = r6 + 1
            r10 = r25
            r0 = r27
            r3 = r8
            goto L105
        L1d6:
            java.lang.String r0 = "Collection contains no element matching the predicate."
            defpackage.ex3.b(r0)
            defpackage.e41.c()
            return r21
    }

    @Override // defpackage.e34
    public final int e(defpackage.eb3 r1, java.util.List r2, int r3) {
            r0 = this;
            z17 r0 = new z17
            r1 = 0
            r0.<init>(r1)
            int r0 = c(r2, r3, r0)
            return r0
    }

    @Override // defpackage.e34
    public final int g(defpackage.eb3 r4, java.util.List r5, int r6) {
            r3 = this;
            l56 r0 = new l56
            r1 = 29
            r2 = 0
            r0.<init>(r1, r2)
            int r3 = r3.b(r4, r5, r6, r0)
            return r3
    }

    @Override // defpackage.e34
    public final int i(defpackage.eb3 r4, java.util.List r5, int r6) {
            r3 = this;
            l56 r0 = new l56
            r1 = 28
            r2 = 0
            r0.<init>(r1, r2)
            int r3 = r3.b(r4, r5, r6, r0)
            return r3
    }
}
