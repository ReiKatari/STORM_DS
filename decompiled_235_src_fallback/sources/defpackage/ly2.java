package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ly2  reason: default package */
/* loaded from: classes.dex */
public final class ly2 extends defpackage.ct7 {
    public static final int[] k = null;

    static {
            r0 = 2
            int[] r0 = new int[r0]
            defpackage.ly2.k = r0
            return
    }

    public static void m(int[] r2, int r3, int r4, int r5, int r6, float r7, int r8) {
            int r4 = r4 - r3
            int r6 = r6 - r5
            r3 = -1
            r5 = 0
            r0 = 1056964608(0x3f000000, float:0.5)
            r1 = 1
            if (r8 == r3) goto L20
            if (r8 == 0) goto L17
            if (r8 == r1) goto Le
            goto L35
        Le:
            float r3 = (float) r4
            float r3 = r3 * r7
            float r3 = r3 + r0
            int r3 = (int) r3
            r2[r5] = r4
            r2[r1] = r3
            return
        L17:
            float r3 = (float) r6
            float r3 = r3 * r7
            float r3 = r3 + r0
            int r3 = (int) r3
            r2[r5] = r3
            r2[r1] = r6
            return
        L20:
            float r3 = (float) r6
            float r3 = r3 * r7
            float r3 = r3 + r0
            int r3 = (int) r3
            float r8 = (float) r4
            float r8 = r8 / r7
            float r8 = r8 + r0
            int r7 = (int) r8
            if (r3 > r4) goto L2f
            r2[r5] = r3
            r2[r1] = r6
            return
        L2f:
            if (r7 > r6) goto L35
            r2[r5] = r4
            r2[r1] = r7
        L35:
            return
    }

    @Override // defpackage.xh1
    public final void a(defpackage.xh1 r23) {
            r22 = this;
            r0 = r22
            int[] r1 = defpackage.ky2.a
            bt7 r2 = r0.j
            int r2 = r2.ordinal()
            r1 = r1[r2]
            r2 = 0
            r3 = 3
            if (r1 == r3) goto L372
            rj1 r1 = r0.e
            boolean r4 = r1.j
            r5 = 1056964608(0x3f000000, float:0.5)
            r6 = 1
            ci1 r7 = r0.h
            ci1 r8 = r0.i
            if (r4 != 0) goto L299
            k21 r4 = r0.d
            k21 r9 = defpackage.k21.MATCH_CONSTRAINT
            if (r4 != r9) goto L299
            l21 r4 = r0.b
            int r9 = r4.r
            r10 = 2
            if (r9 == r10) goto L282
            if (r9 == r3) goto L2e
            goto L299
        L2e:
            int r9 = r4.s
            r10 = -1
            if (r9 == 0) goto L67
            if (r9 != r3) goto L36
            goto L67
        L36:
            int r3 = r4.Y
            if (r3 == r10) goto L58
            if (r3 == 0) goto L4d
            if (r3 == r6) goto L40
            r3 = r2
            goto L62
        L40:
            lm7 r3 = r4.e
            rj1 r3 = r3.e
            int r3 = r3.g
            float r3 = (float) r3
            float r4 = r4.X
        L49:
            float r3 = r3 * r4
        L4a:
            float r3 = r3 + r5
            int r3 = (int) r3
            goto L62
        L4d:
            lm7 r3 = r4.e
            rj1 r3 = r3.e
            int r3 = r3.g
            float r3 = (float) r3
            float r4 = r4.X
            float r3 = r3 / r4
            goto L4a
        L58:
            lm7 r3 = r4.e
            rj1 r3 = r3.e
            int r3 = r3.g
            float r3 = (float) r3
            float r4 = r4.X
            goto L49
        L62:
            r1.d(r3)
            goto L299
        L67:
            lm7 r3 = r4.e
            ci1 r9 = r3.h
            ci1 r3 = r3.i
            h11 r11 = r4.I
            h11 r11 = r11.f
            if (r11 == 0) goto L75
            r11 = r6
            goto L76
        L75:
            r11 = r2
        L76:
            h11 r12 = r4.J
            h11 r12 = r12.f
            if (r12 == 0) goto L7e
            r12 = r6
            goto L7f
        L7e:
            r12 = r2
        L7f:
            h11 r13 = r4.K
            h11 r13 = r13.f
            if (r13 == 0) goto L87
            r13 = r6
            goto L88
        L87:
            r13 = r2
        L88:
            h11 r14 = r4.L
            h11 r14 = r14.f
            if (r14 == 0) goto L90
            r14 = r6
            goto L91
        L90:
            r14 = r2
        L91:
            int r15 = r4.Y
            if (r11 == 0) goto L19d
            if (r12 == 0) goto L19d
            if (r13 == 0) goto L19d
            if (r14 == 0) goto L19d
            float r4 = r4.X
            boolean r10 = r9.j
            java.util.ArrayList r11 = r9.l
            r21 = r15
            int[] r15 = defpackage.ly2.k
            if (r10 == 0) goto Lf3
            boolean r10 = r3.j
            if (r10 == 0) goto Lf3
            boolean r5 = r7.c
            if (r5 == 0) goto L371
            boolean r5 = r8.c
            if (r5 != 0) goto Lb5
            goto L371
        Lb5:
            java.util.ArrayList r5 = r7.l
            java.lang.Object r5 = r5.get(r2)
            ci1 r5 = (defpackage.ci1) r5
            int r5 = r5.g
            int r7 = r7.f
            int r16 = r5 + r7
            java.util.ArrayList r5 = r8.l
            java.lang.Object r5 = r5.get(r2)
            ci1 r5 = (defpackage.ci1) r5
            int r5 = r5.g
            int r7 = r8.f
            int r17 = r5 - r7
            int r5 = r9.g
            int r7 = r9.f
            int r18 = r5 + r7
            int r5 = r3.g
            int r3 = r3.f
            int r19 = r5 - r3
            r20 = r4
            m(r15, r16, r17, r18, r19, r20, r21)
            r2 = r15[r2]
            r1.d(r2)
            l21 r0 = r0.b
            lm7 r0 = r0.e
            rj1 r0 = r0.e
            r1 = r15[r6]
            r0.d(r1)
            return
        Lf3:
            r20 = r4
            boolean r4 = r7.j
            if (r4 == 0) goto L140
            boolean r4 = r8.j
            if (r4 == 0) goto L140
            boolean r4 = r9.c
            if (r4 == 0) goto L371
            boolean r4 = r3.c
            if (r4 != 0) goto L107
            goto L371
        L107:
            int r4 = r7.g
            int r10 = r7.f
            int r16 = r4 + r10
            int r4 = r8.g
            int r10 = r8.f
            int r17 = r4 - r10
            java.lang.Object r4 = r11.get(r2)
            ci1 r4 = (defpackage.ci1) r4
            int r4 = r4.g
            int r10 = r9.f
            int r18 = r4 + r10
            java.util.ArrayList r4 = r3.l
            java.lang.Object r4 = r4.get(r2)
            ci1 r4 = (defpackage.ci1) r4
            int r4 = r4.g
            int r10 = r3.f
            int r19 = r4 - r10
            m(r15, r16, r17, r18, r19, r20, r21)
            r4 = r15[r2]
            r1.d(r4)
            l21 r4 = r0.b
            lm7 r4 = r4.e
            rj1 r4 = r4.e
            r10 = r15[r6]
            r4.d(r10)
        L140:
            boolean r4 = r7.c
            if (r4 == 0) goto L371
            boolean r4 = r8.c
            if (r4 == 0) goto L371
            boolean r4 = r9.c
            if (r4 == 0) goto L371
            boolean r4 = r3.c
            if (r4 != 0) goto L152
            goto L371
        L152:
            java.util.ArrayList r4 = r7.l
            java.lang.Object r4 = r4.get(r2)
            ci1 r4 = (defpackage.ci1) r4
            int r4 = r4.g
            int r10 = r7.f
            int r16 = r4 + r10
            java.util.ArrayList r4 = r8.l
            java.lang.Object r4 = r4.get(r2)
            ci1 r4 = (defpackage.ci1) r4
            int r4 = r4.g
            int r10 = r8.f
            int r17 = r4 - r10
            java.lang.Object r4 = r11.get(r2)
            ci1 r4 = (defpackage.ci1) r4
            int r4 = r4.g
            int r9 = r9.f
            int r18 = r4 + r9
            java.util.ArrayList r4 = r3.l
            java.lang.Object r4 = r4.get(r2)
            ci1 r4 = (defpackage.ci1) r4
            int r4 = r4.g
            int r3 = r3.f
            int r19 = r4 - r3
            m(r15, r16, r17, r18, r19, r20, r21)
            r3 = r15[r2]
            r1.d(r3)
            l21 r3 = r0.b
            lm7 r3 = r3.e
            rj1 r3 = r3.e
            r4 = r15[r6]
            r3.d(r4)
            goto L299
        L19d:
            if (r11 == 0) goto L211
            if (r13 == 0) goto L211
            boolean r3 = r7.c
            if (r3 == 0) goto L371
            boolean r3 = r8.c
            if (r3 != 0) goto L1ab
            goto L371
        L1ab:
            float r3 = r4.X
            java.util.ArrayList r4 = r7.l
            java.lang.Object r4 = r4.get(r2)
            ci1 r4 = (defpackage.ci1) r4
            int r4 = r4.g
            int r9 = r7.f
            int r4 = r4 + r9
            java.util.ArrayList r9 = r8.l
            java.lang.Object r9 = r9.get(r2)
            ci1 r9 = (defpackage.ci1) r9
            int r9 = r9.g
            int r11 = r8.f
            int r9 = r9 - r11
            if (r15 == r10) goto L1f0
            if (r15 == 0) goto L1f0
            if (r15 == r6) goto L1cf
            goto L299
        L1cf:
            int r9 = r9 - r4
            int r4 = r0.g(r9, r2)
            float r9 = (float) r4
            float r9 = r9 / r3
            float r9 = r9 + r5
            int r9 = (int) r9
            int r10 = r0.g(r9, r6)
            if (r9 == r10) goto L1e2
            float r4 = (float) r10
            float r4 = r4 * r3
            float r4 = r4 + r5
            int r4 = (int) r4
        L1e2:
            r1.d(r4)
            l21 r3 = r0.b
            lm7 r3 = r3.e
            rj1 r3 = r3.e
            r3.d(r10)
            goto L299
        L1f0:
            int r9 = r9 - r4
            int r4 = r0.g(r9, r2)
            float r9 = (float) r4
            float r9 = r9 * r3
            float r9 = r9 + r5
            int r9 = (int) r9
            int r10 = r0.g(r9, r6)
            if (r9 == r10) goto L203
            float r4 = (float) r10
            float r4 = r4 / r3
            float r4 = r4 + r5
            int r4 = (int) r4
        L203:
            r1.d(r4)
            l21 r3 = r0.b
            lm7 r3 = r3.e
            rj1 r3 = r3.e
            r3.d(r10)
            goto L299
        L211:
            if (r12 == 0) goto L299
            if (r14 == 0) goto L299
            boolean r11 = r9.c
            if (r11 == 0) goto L371
            boolean r11 = r3.c
            if (r11 != 0) goto L21f
            goto L371
        L21f:
            float r4 = r4.X
            java.util.ArrayList r11 = r9.l
            java.lang.Object r11 = r11.get(r2)
            ci1 r11 = (defpackage.ci1) r11
            int r11 = r11.g
            int r9 = r9.f
            int r11 = r11 + r9
            java.util.ArrayList r9 = r3.l
            java.lang.Object r9 = r9.get(r2)
            ci1 r9 = (defpackage.ci1) r9
            int r9 = r9.g
            int r3 = r3.f
            int r9 = r9 - r3
            if (r15 == r10) goto L262
            if (r15 == 0) goto L242
            if (r15 == r6) goto L262
            goto L299
        L242:
            int r9 = r9 - r11
            int r3 = r0.g(r9, r6)
            float r9 = (float) r3
            float r9 = r9 * r4
            float r9 = r9 + r5
            int r9 = (int) r9
            int r10 = r0.g(r9, r2)
            if (r9 == r10) goto L255
            float r3 = (float) r10
            float r3 = r3 / r4
            float r3 = r3 + r5
            int r3 = (int) r3
        L255:
            r1.d(r10)
            l21 r4 = r0.b
            lm7 r4 = r4.e
            rj1 r4 = r4.e
            r4.d(r3)
            goto L299
        L262:
            int r9 = r9 - r11
            int r3 = r0.g(r9, r6)
            float r9 = (float) r3
            float r9 = r9 / r4
            float r9 = r9 + r5
            int r9 = (int) r9
            int r10 = r0.g(r9, r2)
            if (r9 == r10) goto L275
            float r3 = (float) r10
            float r3 = r3 * r4
            float r3 = r3 + r5
            int r3 = (int) r3
        L275:
            r1.d(r10)
            l21 r4 = r0.b
            lm7 r4 = r4.e
            rj1 r4 = r4.e
            r4.d(r3)
            goto L299
        L282:
            l21 r3 = r4.U
            if (r3 == 0) goto L299
            ly2 r3 = r3.d
            rj1 r3 = r3.e
            boolean r9 = r3.j
            if (r9 == 0) goto L299
            float r4 = r4.w
            int r3 = r3.g
            float r3 = (float) r3
            float r3 = r3 * r4
            float r3 = r3 + r5
            int r3 = (int) r3
            r1.d(r3)
        L299:
            boolean r3 = r7.c
            java.util.ArrayList r4 = r7.l
            if (r3 == 0) goto L371
            boolean r3 = r8.c
            java.util.ArrayList r9 = r8.l
            if (r3 != 0) goto L2a7
            goto L371
        L2a7:
            boolean r3 = r7.j
            if (r3 == 0) goto L2b5
            boolean r3 = r8.j
            if (r3 == 0) goto L2b5
            boolean r3 = r1.j
            if (r3 == 0) goto L2b5
            goto L371
        L2b5:
            boolean r3 = r1.j
            if (r3 != 0) goto L2ed
            k21 r3 = r0.d
            k21 r10 = defpackage.k21.MATCH_CONSTRAINT
            if (r3 != r10) goto L2ed
            l21 r3 = r0.b
            int r10 = r3.r
            if (r10 != 0) goto L2ed
            boolean r3 = r3.y()
            if (r3 != 0) goto L2ed
            java.lang.Object r0 = r4.get(r2)
            ci1 r0 = (defpackage.ci1) r0
            java.lang.Object r2 = r9.get(r2)
            ci1 r2 = (defpackage.ci1) r2
            int r0 = r0.g
            int r3 = r7.f
            int r0 = r0 + r3
            int r2 = r2.g
            int r3 = r8.f
            int r2 = r2 + r3
            int r3 = r2 - r0
            r7.d(r0)
            r8.d(r2)
            r1.d(r3)
            return
        L2ed:
            boolean r3 = r1.j
            if (r3 != 0) goto L337
            k21 r3 = r0.d
            k21 r10 = defpackage.k21.MATCH_CONSTRAINT
            if (r3 != r10) goto L337
            int r3 = r0.a
            if (r3 != r6) goto L337
            int r3 = r4.size()
            if (r3 <= 0) goto L337
            int r3 = r9.size()
            if (r3 <= 0) goto L337
            java.lang.Object r3 = r4.get(r2)
            ci1 r3 = (defpackage.ci1) r3
            java.lang.Object r6 = r9.get(r2)
            ci1 r6 = (defpackage.ci1) r6
            int r3 = r3.g
            int r10 = r7.f
            int r3 = r3 + r10
            int r6 = r6.g
            int r10 = r8.f
            int r6 = r6 + r10
            int r6 = r6 - r3
            int r3 = r1.m
            int r3 = java.lang.Math.min(r6, r3)
            l21 r6 = r0.b
            int r10 = r6.v
            int r6 = r6.u
            int r3 = java.lang.Math.max(r6, r3)
            if (r10 <= 0) goto L334
            int r3 = java.lang.Math.min(r10, r3)
        L334:
            r1.d(r3)
        L337:
            boolean r3 = r1.j
            if (r3 != 0) goto L33c
            goto L371
        L33c:
            java.lang.Object r3 = r4.get(r2)
            ci1 r3 = (defpackage.ci1) r3
            java.lang.Object r2 = r9.get(r2)
            ci1 r2 = (defpackage.ci1) r2
            int r4 = r3.g
            int r6 = r7.f
            int r6 = r6 + r4
            int r9 = r2.g
            int r10 = r8.f
            int r10 = r10 + r9
            l21 r0 = r0.b
            float r0 = r0.e0
            if (r3 != r2) goto L35a
            r0 = r5
            goto L35c
        L35a:
            r4 = r6
            r9 = r10
        L35c:
            int r9 = r9 - r4
            int r2 = r1.g
            int r9 = r9 - r2
            float r2 = (float) r4
            float r2 = r2 + r5
            float r3 = (float) r9
            float r3 = r3 * r0
            float r3 = r3 + r2
            int r0 = (int) r3
            r7.d(r0)
            int r0 = r7.g
            int r1 = r1.g
            int r0 = r0 + r1
            r8.d(r0)
        L371:
            return
        L372:
            l21 r1 = r0.b
            h11 r3 = r1.I
            h11 r1 = r1.K
            r0.l(r3, r1, r2)
            return
    }

    @Override // defpackage.ct7
    public final void d() {
            r12 = this;
            l21 r0 = r12.b
            boolean r1 = r0.a
            rj1 r2 = r12.e
            if (r1 == 0) goto Lf
            int r0 = r0.r()
            r2.d(r0)
        Lf:
            boolean r0 = r2.j
            java.util.ArrayList r1 = r2.k
            java.util.ArrayList r3 = r2.l
            r4 = 0
            ci1 r5 = r12.i
            ci1 r6 = r12.h
            if (r0 != 0) goto L7f
            l21 r0 = r12.b
            k21[] r7 = r0.T
            r7 = r7[r4]
            r12.d = r7
            k21 r8 = defpackage.k21.MATCH_CONSTRAINT
            if (r7 == r8) goto Lb3
            k21 r8 = defpackage.k21.MATCH_PARENT
            if (r7 != r8) goto L73
            l21 r9 = r0.U
            if (r9 == 0) goto L73
            k21[] r10 = r9.T
            r10 = r10[r4]
            k21 r11 = defpackage.k21.FIXED
            if (r10 == r11) goto L3a
            if (r10 != r8) goto L73
        L3a:
            int r0 = r9.r()
            l21 r1 = r12.b
            h11 r1 = r1.I
            int r1 = r1.e()
            int r0 = r0 - r1
            l21 r1 = r12.b
            h11 r1 = r1.K
            int r1 = r1.e()
            int r0 = r0 - r1
            ly2 r1 = r9.d
            ci1 r1 = r1.h
            l21 r3 = r12.b
            h11 r3 = r3.I
            int r3 = r3.e()
            defpackage.ct7.b(r6, r1, r3)
            ly2 r1 = r9.d
            ci1 r1 = r1.i
            l21 r12 = r12.b
            h11 r12 = r12.K
            int r12 = r12.e()
            int r12 = -r12
            defpackage.ct7.b(r5, r1, r12)
            r2.d(r0)
            return
        L73:
            k21 r8 = defpackage.k21.FIXED
            if (r7 != r8) goto Lb3
            int r0 = r0.r()
            r2.d(r0)
            goto Lb3
        L7f:
            k21 r0 = r12.d
            k21 r7 = defpackage.k21.MATCH_PARENT
            if (r0 != r7) goto Lb3
            l21 r0 = r12.b
            l21 r8 = r0.U
            if (r8 == 0) goto Lb3
            k21[] r9 = r8.T
            r9 = r9[r4]
            k21 r10 = defpackage.k21.FIXED
            if (r9 == r10) goto L95
            if (r9 != r7) goto Lb3
        L95:
            ly2 r1 = r8.d
            ci1 r1 = r1.h
            h11 r0 = r0.I
            int r0 = r0.e()
            defpackage.ct7.b(r6, r1, r0)
            ly2 r0 = r8.d
            ci1 r0 = r0.i
            l21 r12 = r12.b
            h11 r12 = r12.K
            int r12 = r12.e()
            int r12 = -r12
            defpackage.ct7.b(r5, r0, r12)
            return
        Lb3:
            boolean r0 = r2.j
            r7 = 1
            if (r0 == 0) goto L185
            l21 r0 = r12.b
            boolean r8 = r0.a
            if (r8 == 0) goto L185
            h11[] r1 = r0.Q
            r3 = r1[r4]
            h11 r8 = r3.f
            if (r8 == 0) goto L122
            r9 = r1[r7]
            h11 r9 = r9.f
            if (r9 == 0) goto L122
            boolean r0 = r0.y()
            l21 r1 = r12.b
            if (r0 == 0) goto Lec
            h11[] r0 = r1.Q
            r0 = r0[r4]
            int r0 = r0.e()
            r6.f = r0
            l21 r12 = r12.b
            h11[] r12 = r12.Q
            r12 = r12[r7]
            int r12 = r12.e()
            int r12 = -r12
            r5.f = r12
            return
        Lec:
            h11[] r0 = r1.Q
            r0 = r0[r4]
            ci1 r0 = defpackage.ct7.h(r0)
            if (r0 == 0) goto L103
            l21 r1 = r12.b
            h11[] r1 = r1.Q
            r1 = r1[r4]
            int r1 = r1.e()
            defpackage.ct7.b(r6, r0, r1)
        L103:
            l21 r0 = r12.b
            h11[] r0 = r0.Q
            r0 = r0[r7]
            ci1 r0 = defpackage.ct7.h(r0)
            if (r0 == 0) goto L11d
            l21 r12 = r12.b
            h11[] r12 = r12.Q
            r12 = r12[r7]
            int r12 = r12.e()
            int r12 = -r12
            defpackage.ct7.b(r5, r0, r12)
        L11d:
            r6.b = r7
            r5.b = r7
            return
        L122:
            if (r8 == 0) goto L13d
            ci1 r0 = defpackage.ct7.h(r3)
            if (r0 == 0) goto L307
            l21 r12 = r12.b
            h11[] r12 = r12.Q
            r12 = r12[r4]
            int r12 = r12.e()
            defpackage.ct7.b(r6, r0, r12)
            int r12 = r2.g
            defpackage.ct7.b(r5, r6, r12)
            return
        L13d:
            r1 = r1[r7]
            h11 r3 = r1.f
            if (r3 == 0) goto L15e
            ci1 r0 = defpackage.ct7.h(r1)
            if (r0 == 0) goto L307
            l21 r12 = r12.b
            h11[] r12 = r12.Q
            r12 = r12[r7]
            int r12 = r12.e()
            int r12 = -r12
            defpackage.ct7.b(r5, r0, r12)
            int r12 = r2.g
            int r12 = -r12
            defpackage.ct7.b(r6, r5, r12)
            return
        L15e:
            boolean r1 = r0 instanceof defpackage.gx2
            if (r1 != 0) goto L307
            l21 r1 = r0.U
            if (r1 == 0) goto L307
            g11 r1 = defpackage.g11.CENTER
            h11 r0 = r0.j(r1)
            h11 r0 = r0.f
            if (r0 != 0) goto L307
            l21 r12 = r12.b
            l21 r0 = r12.U
            ly2 r0 = r0.d
            ci1 r0 = r0.h
            int r12 = r12.s()
            defpackage.ct7.b(r6, r0, r12)
            int r12 = r2.g
            defpackage.ct7.b(r5, r6, r12)
            return
        L185:
            k21 r0 = r12.d
            k21 r8 = defpackage.k21.MATCH_CONSTRAINT
            if (r0 != r8) goto L268
            l21 r0 = r12.b
            int r8 = r0.r
            r9 = 2
            if (r8 == r9) goto L24f
            r9 = 3
            if (r8 == r9) goto L197
            goto L268
        L197:
            int r8 = r0.s
            if (r8 != r9) goto L21a
            r6.a = r12
            r5.a = r12
            lm7 r8 = r0.e
            ci1 r9 = r8.h
            r9.a = r12
            ci1 r8 = r8.i
            r8.a = r12
            r2.a = r12
            boolean r0 = r0.z()
            if (r0 == 0) goto L1f3
            l21 r0 = r12.b
            lm7 r0 = r0.e
            rj1 r0 = r0.e
            r3.add(r0)
            l21 r0 = r12.b
            lm7 r0 = r0.e
            rj1 r0 = r0.e
            java.util.ArrayList r0 = r0.k
            r0.add(r2)
            l21 r0 = r12.b
            lm7 r0 = r0.e
            rj1 r1 = r0.e
            r1.a = r12
            ci1 r0 = r0.h
            r3.add(r0)
            l21 r0 = r12.b
            lm7 r0 = r0.e
            ci1 r0 = r0.i
            r3.add(r0)
            l21 r0 = r12.b
            lm7 r0 = r0.e
            ci1 r0 = r0.h
            java.util.ArrayList r0 = r0.k
            r0.add(r2)
            l21 r0 = r12.b
            lm7 r0 = r0.e
            ci1 r0 = r0.i
            java.util.ArrayList r0 = r0.k
            r0.add(r2)
            goto L268
        L1f3:
            l21 r0 = r12.b
            boolean r0 = r0.y()
            l21 r3 = r12.b
            if (r0 == 0) goto L210
            lm7 r0 = r3.e
            rj1 r0 = r0.e
            java.util.ArrayList r0 = r0.l
            r0.add(r2)
            l21 r0 = r12.b
            lm7 r0 = r0.e
            rj1 r0 = r0.e
            r1.add(r0)
            goto L268
        L210:
            lm7 r0 = r3.e
            rj1 r0 = r0.e
            java.util.ArrayList r0 = r0.l
            r0.add(r2)
            goto L268
        L21a:
            lm7 r0 = r0.e
            rj1 r0 = r0.e
            r3.add(r0)
            java.util.ArrayList r0 = r0.k
            r0.add(r2)
            l21 r0 = r12.b
            lm7 r0 = r0.e
            ci1 r0 = r0.h
            java.util.ArrayList r0 = r0.k
            r0.add(r2)
            l21 r0 = r12.b
            lm7 r0 = r0.e
            ci1 r0 = r0.i
            java.util.ArrayList r0 = r0.k
            r0.add(r2)
            r2.b = r7
            r1.add(r6)
            r1.add(r5)
            java.util.ArrayList r0 = r6.l
            r0.add(r2)
            java.util.ArrayList r0 = r5.l
            r0.add(r2)
            goto L268
        L24f:
            l21 r0 = r0.U
            if (r0 != 0) goto L254
            goto L268
        L254:
            lm7 r0 = r0.e
            rj1 r0 = r0.e
            r3.add(r0)
            java.util.ArrayList r0 = r0.k
            r0.add(r2)
            r2.b = r7
            r1.add(r6)
            r1.add(r5)
        L268:
            l21 r0 = r12.b
            h11[] r1 = r0.Q
            r3 = r1[r4]
            h11 r8 = r3.f
            if (r8 == 0) goto L2b9
            r9 = r1[r7]
            h11 r9 = r9.f
            if (r9 == 0) goto L2b9
            boolean r0 = r0.y()
            l21 r1 = r12.b
            if (r0 == 0) goto L298
            h11[] r0 = r1.Q
            r0 = r0[r4]
            int r0 = r0.e()
            r6.f = r0
            l21 r12 = r12.b
            h11[] r12 = r12.Q
            r12 = r12[r7]
            int r12 = r12.e()
            int r12 = -r12
            r5.f = r12
            return
        L298:
            h11[] r0 = r1.Q
            r0 = r0[r4]
            ci1 r0 = defpackage.ct7.h(r0)
            l21 r1 = r12.b
            h11[] r1 = r1.Q
            r1 = r1[r7]
            ci1 r1 = defpackage.ct7.h(r1)
            if (r0 == 0) goto L2af
            r0.b(r12)
        L2af:
            if (r1 == 0) goto L2b4
            r1.b(r12)
        L2b4:
            bt7 r0 = defpackage.bt7.CENTER
            r12.j = r0
            return
        L2b9:
            if (r8 == 0) goto L2d2
            ci1 r0 = defpackage.ct7.h(r3)
            if (r0 == 0) goto L307
            l21 r1 = r12.b
            h11[] r1 = r1.Q
            r1 = r1[r4]
            int r1 = r1.e()
            defpackage.ct7.b(r6, r0, r1)
            r12.c(r5, r6, r7, r2)
            return
        L2d2:
            r1 = r1[r7]
            h11 r3 = r1.f
            if (r3 == 0) goto L2f1
            ci1 r0 = defpackage.ct7.h(r1)
            if (r0 == 0) goto L307
            l21 r1 = r12.b
            h11[] r1 = r1.Q
            r1 = r1[r7]
            int r1 = r1.e()
            int r1 = -r1
            defpackage.ct7.b(r5, r0, r1)
            r0 = -1
            r12.c(r6, r5, r0, r2)
            return
        L2f1:
            boolean r1 = r0 instanceof defpackage.gx2
            if (r1 != 0) goto L307
            l21 r1 = r0.U
            if (r1 == 0) goto L307
            ly2 r1 = r1.d
            ci1 r1 = r1.h
            int r0 = r0.s()
            defpackage.ct7.b(r6, r1, r0)
            r12.c(r5, r6, r7, r2)
        L307:
            return
    }

    @Override // defpackage.ct7
    public final void e() {
            r2 = this;
            ci1 r0 = r2.h
            boolean r1 = r0.j
            if (r1 == 0) goto Lc
            l21 r2 = r2.b
            int r0 = r0.g
            r2.Z = r0
        Lc:
            return
    }

    @Override // defpackage.ct7
    public final void f() {
            r1 = this;
            r0 = 0
            r1.c = r0
            ci1 r0 = r1.h
            r0.c()
            ci1 r0 = r1.i
            r0.c()
            rj1 r0 = r1.e
            r0.c()
            r0 = 0
            r1.g = r0
            return
    }

    @Override // defpackage.ct7
    public final boolean k() {
            r3 = this;
            k21 r0 = r3.d
            k21 r1 = defpackage.k21.MATCH_CONSTRAINT
            r2 = 1
            if (r0 != r1) goto L10
            l21 r3 = r3.b
            int r3 = r3.r
            if (r3 != 0) goto Le
            return r2
        Le:
            r3 = 0
            return r3
        L10:
            return r2
    }

    public final void n() {
            r2 = this;
            r0 = 0
            r2.g = r0
            ci1 r1 = r2.h
            r1.c()
            r1.j = r0
            ci1 r1 = r2.i
            r1.c()
            r1.j = r0
            rj1 r2 = r2.e
            r2.j = r0
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "HorizontalRun "
            r0.<init>(r1)
            l21 r2 = r2.b
            java.lang.String r2 = r2.j0
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
