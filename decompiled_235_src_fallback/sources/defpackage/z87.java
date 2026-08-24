package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: z87  reason: default package */
/* loaded from: classes.dex */
public final class z87 extends defpackage.ng4 {
    public final defpackage.v80 f;
    public defpackage.ap6 g;

    public z87(defpackage.m86 r1, defpackage.yv0 r2, defpackage.qh1 r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r1 = 0
            r2 = 6
            r3 = 2147483647(0x7fffffff, float:NaN)
            v80 r1 = defpackage.nb3.c(r3, r1, r1, r2)
            r0.f = r1
            return
    }

    public static final java.lang.Object c(defpackage.z87 r16, defpackage.m86 r17, defpackage.x87 r18, defpackage.s41 r19) {
            r1 = r16
            r0 = r18
            r2 = r19
            r1.getClass()
            yc1 r6 = r1.e
            boolean r3 = r2 instanceof defpackage.y87
            if (r3 == 0) goto L1f
            r3 = r2
            y87 r3 = (defpackage.y87) r3
            int r4 = r3.Y
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r4 & r5
            if (r7 == 0) goto L1f
            int r4 = r4 - r5
            r3.Y = r4
        L1d:
            r7 = r3
            goto L25
        L1f:
            y87 r3 = new y87
            r3.<init>(r1, r2)
            goto L1d
        L25:
            java.lang.Object r2 = r7.R
            x61 r8 = defpackage.x61.COROUTINE_SUSPENDED
            int r3 = r7.Y
            r9 = 2
            r10 = 1
            if (r3 == 0) goto L44
            if (r3 == r10) goto L3f
            if (r3 != r9) goto L38
            defpackage.oi2.Y(r2)
            goto Le2
        L38:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            r0 = 0
            return r0
        L3f:
            defpackage.oi2.Y(r2)
            goto Lbb
        L44:
            defpackage.oi2.Y(r2)
            dh5 r3 = new dh5
            r3.<init>()
            r3.A = r0
            long r4 = r0.b
            long r11 = r0.a
            java.lang.Object r0 = r6.A
            rl7 r0 = (defpackage.rl7) r0
            r2 = 32
            long r13 = r11 >> r2
            int r13 = (int) r13
            float r13 = java.lang.Float.intBitsToFloat(r13)
            r0.a(r13, r4)
            java.lang.Object r0 = r6.B
            rl7 r0 = (defpackage.rl7) r0
            r13 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r11 = r11 & r13
            int r11 = (int) r11
            float r11 = java.lang.Float.intBitsToFloat(r11)
            r0.a(r11, r4)
            v80 r0 = r1.f
            x87 r0 = e(r0)
            if (r0 == 0) goto La8
            long r4 = r0.b
            long r11 = r0.a
            java.lang.Object r15 = r6.A
            rl7 r15 = (defpackage.rl7) r15
            r18 = r13
            long r13 = r11 >> r2
            int r2 = (int) r13
            float r2 = java.lang.Float.intBitsToFloat(r2)
            r15.a(r2, r4)
            java.lang.Object r2 = r6.B
            rl7 r2 = (defpackage.rl7) r2
            long r11 = r11 & r18
            int r11 = (int) r11
            float r11 = java.lang.Float.intBitsToFloat(r11)
            r2.a(r11, r4)
            java.lang.Object r2 = r3.A
            x87 r2 = (defpackage.x87) r2
            x87 r0 = r2.a(r0)
            r3.A = r0
        La8:
            ji r0 = new ji
            r4 = 0
            r5 = 16
            r2 = r17
            r0.<init>(r1, r2, r3, r4, r5)
            r7.Y = r10
            java.lang.Object r0 = r1.b(r0, r7)
            if (r0 != r8) goto Lbb
            goto Le1
        Lbb:
            eo2 r0 = r1.b
            java.lang.Object r1 = r6.A
            rl7 r1 = (defpackage.rl7) r1
            r2 = 2139095039(0x7f7fffff, float:3.4028235E38)
            float r1 = r1.b(r2)
            java.lang.Object r3 = r6.B
            rl7 r3 = (defpackage.rl7) r3
            float r2 = r3.b(r2)
            long r1 = defpackage.qo2.k(r1, r2)
            ol7 r3 = new ol7
            r3.<init>(r1)
            r7.Y = r9
            java.lang.Object r0 = r0.o(r3, r7)
            if (r0 != r8) goto Le2
        Le1:
            return r8
        Le2:
            jg7 r0 = defpackage.jg7.a
            return r0
    }

    public static defpackage.x87 e(defpackage.v80 r3) {
            h84 r0 = new h84
            r1 = 1
            r0.<init>(r3, r1)
            tj2 r3 = new tj2
            r1 = 2
            r2 = 0
            r3.<init>(r0, r2, r1)
            rb6 r3 = defpackage.qo2.C(r3)
        L11:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L26
            java.lang.Object r0 = r3.next()
            x87 r0 = (defpackage.x87) r0
            if (r2 != 0) goto L21
        L1f:
            r2 = r0
            goto L11
        L21:
            x87 r0 = r2.a(r0)
            goto L1f
        L26:
            return r2
    }

    public final boolean d(defpackage.oy4 r24) {
            r23 = this;
            r0 = r23
            r1 = r24
            java.util.List r2 = r1.a
            java.lang.Object r2 = defpackage.gt0.J0(r2)
            vy4 r2 = (defpackage.vy4) r2
            if (r2 == 0) goto La1
            java.util.List r5 = r2.b()
            int r6 = r5.size()
            r7 = 0
            r8 = 0
        L18:
            r9 = 0
            v80 r10 = r0.f
            m86 r11 = r0.a
            r12 = -9223372034707292160(0x8000000080000000, double:-1.0609978955E-314)
            if (r7 >= r6) goto L63
            java.lang.Object r14 = r5.get(r7)
            vx2 r14 = (defpackage.vx2) r14
            r15 = 1
            r16 = 0
            long r3 = r14.d
            long r3 = r3 ^ r12
            long r12 = r11.e(r3)
            float r11 = r11.i(r12)
            int r9 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r9 != 0) goto L3e
            r9 = r15
            goto L40
        L3e:
            r9 = r16
        L40:
            if (r9 != 0) goto L60
            x87 r17 = new x87
            long r11 = r14.a
            r22 = 0
            r18 = r3
            r20 = r11
            r17.<init>(r18, r20, r22)
            r3 = r17
            java.lang.Object r3 = r10.c(r3)
            boolean r3 = r3 instanceof defpackage.fm0
            if (r3 == 0) goto L5f
            if (r8 == 0) goto L5c
            goto L5f
        L5c:
            r8 = r16
            goto L60
        L5f:
            r8 = r15
        L60:
            int r7 = r7 + 1
            goto L18
        L63:
            r15 = 1
            r16 = 0
            long r3 = r2.l
            long r3 = r3 ^ r12
            int r1 = r1.f
            r5 = 12
            if (r1 != r5) goto L72
            r22 = r15
            goto L74
        L72:
            r22 = r16
        L74:
            long r5 = r11.e(r3)
            float r1 = r11.i(r5)
            int r1 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r1 != 0) goto L82
            r1 = r15
            goto L84
        L82:
            r1 = r16
        L84:
            if (r1 == 0) goto L88
            if (r22 == 0) goto La6
        L88:
            x87 r17 = new x87
            long r1 = r2.b
            r20 = r1
            r18 = r3
            r17.<init>(r18, r20, r22)
            r1 = r17
            java.lang.Object r1 = r10.c(r1)
            boolean r1 = r1 instanceof defpackage.fm0
            if (r1 == 0) goto L9f
            if (r8 == 0) goto La4
        L9f:
            r8 = r15
            goto La6
        La1:
            r15 = 1
            r16 = 0
        La4:
            r8 = r16
        La6:
            if (r8 != 0) goto Lae
            boolean r0 = r0.d
            if (r0 == 0) goto Lad
            goto Lae
        Lad:
            return r16
        Lae:
            return r15
    }
}
