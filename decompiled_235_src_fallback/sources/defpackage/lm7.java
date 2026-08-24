package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lm7  reason: default package */
/* loaded from: classes.dex */
public final class lm7 extends defpackage.ct7 {
    public defpackage.ci1 k;
    public defpackage.w20 l;

    @Override // defpackage.xh1
    public final void a(defpackage.xh1 r10) {
            r9 = this;
            int[] r10 = defpackage.km7.a
            bt7 r0 = r9.j
            int r0 = r0.ordinal()
            r10 = r10[r0]
            r0 = 1
            r1 = 3
            if (r10 == r1) goto L14a
            rj1 r10 = r9.e
            boolean r2 = r10.c
            r3 = 1056964608(0x3f000000, float:0.5)
            r4 = 0
            if (r2 == 0) goto L6f
            boolean r2 = r10.j
            if (r2 != 0) goto L6f
            k21 r2 = r9.d
            k21 r5 = defpackage.k21.MATCH_CONSTRAINT
            if (r2 != r5) goto L6f
            l21 r2 = r9.b
            int r5 = r2.s
            r6 = 2
            if (r5 == r6) goto L58
            if (r5 == r1) goto L2b
            goto L6f
        L2b:
            ly2 r1 = r2.d
            rj1 r1 = r1.e
            boolean r5 = r1.j
            if (r5 == 0) goto L6f
            int r5 = r2.Y
            r6 = -1
            if (r5 == r6) goto L4e
            if (r5 == 0) goto L47
            if (r5 == r0) goto L3e
            r1 = r4
            goto L54
        L3e:
            int r1 = r1.g
            float r1 = (float) r1
            float r2 = r2.X
        L43:
            float r1 = r1 / r2
        L44:
            float r1 = r1 + r3
            int r1 = (int) r1
            goto L54
        L47:
            int r1 = r1.g
            float r1 = (float) r1
            float r2 = r2.X
            float r1 = r1 * r2
            goto L44
        L4e:
            int r1 = r1.g
            float r1 = (float) r1
            float r2 = r2.X
            goto L43
        L54:
            r10.d(r1)
            goto L6f
        L58:
            l21 r1 = r2.U
            if (r1 == 0) goto L6f
            lm7 r1 = r1.e
            rj1 r1 = r1.e
            boolean r5 = r1.j
            if (r5 == 0) goto L6f
            float r2 = r2.z
            int r1 = r1.g
            float r1 = (float) r1
            float r1 = r1 * r2
            float r1 = r1 + r3
            int r1 = (int) r1
            r10.d(r1)
        L6f:
            ci1 r1 = r9.h
            boolean r2 = r1.c
            java.util.ArrayList r5 = r1.l
            if (r2 == 0) goto L149
            ci1 r2 = r9.i
            boolean r6 = r2.c
            java.util.ArrayList r7 = r2.l
            if (r6 != 0) goto L81
            goto L149
        L81:
            boolean r6 = r1.j
            if (r6 == 0) goto L8f
            boolean r6 = r2.j
            if (r6 == 0) goto L8f
            boolean r6 = r10.j
            if (r6 == 0) goto L8f
            goto L149
        L8f:
            boolean r6 = r10.j
            if (r6 != 0) goto Lc7
            k21 r6 = r9.d
            k21 r8 = defpackage.k21.MATCH_CONSTRAINT
            if (r6 != r8) goto Lc7
            l21 r6 = r9.b
            int r8 = r6.r
            if (r8 != 0) goto Lc7
            boolean r6 = r6.z()
            if (r6 != 0) goto Lc7
            java.lang.Object r9 = r5.get(r4)
            ci1 r9 = (defpackage.ci1) r9
            java.lang.Object r0 = r7.get(r4)
            ci1 r0 = (defpackage.ci1) r0
            int r9 = r9.g
            int r3 = r1.f
            int r9 = r9 + r3
            int r0 = r0.g
            int r3 = r2.f
            int r0 = r0 + r3
            int r3 = r0 - r9
            r1.d(r9)
            r2.d(r0)
            r10.d(r3)
            return
        Lc7:
            boolean r6 = r10.j
            if (r6 != 0) goto L103
            k21 r6 = r9.d
            k21 r8 = defpackage.k21.MATCH_CONSTRAINT
            if (r6 != r8) goto L103
            int r6 = r9.a
            if (r6 != r0) goto L103
            int r0 = r5.size()
            if (r0 <= 0) goto L103
            int r0 = r7.size()
            if (r0 <= 0) goto L103
            java.lang.Object r0 = r5.get(r4)
            ci1 r0 = (defpackage.ci1) r0
            java.lang.Object r6 = r7.get(r4)
            ci1 r6 = (defpackage.ci1) r6
            int r0 = r0.g
            int r8 = r1.f
            int r0 = r0 + r8
            int r6 = r6.g
            int r8 = r2.f
            int r6 = r6 + r8
            int r6 = r6 - r0
            int r0 = r10.m
            if (r6 >= r0) goto L100
            r10.d(r6)
            goto L103
        L100:
            r10.d(r0)
        L103:
            boolean r0 = r10.j
            if (r0 != 0) goto L108
            goto L149
        L108:
            int r0 = r5.size()
            if (r0 <= 0) goto L149
            int r0 = r7.size()
            if (r0 <= 0) goto L149
            java.lang.Object r0 = r5.get(r4)
            ci1 r0 = (defpackage.ci1) r0
            java.lang.Object r4 = r7.get(r4)
            ci1 r4 = (defpackage.ci1) r4
            int r5 = r0.g
            int r6 = r1.f
            int r6 = r6 + r5
            int r7 = r4.g
            int r8 = r2.f
            int r8 = r8 + r7
            l21 r9 = r9.b
            float r9 = r9.f0
            if (r0 != r4) goto L132
            r9 = r3
            goto L134
        L132:
            r5 = r6
            r7 = r8
        L134:
            int r7 = r7 - r5
            int r0 = r10.g
            int r7 = r7 - r0
            float r0 = (float) r5
            float r0 = r0 + r3
            float r3 = (float) r7
            float r3 = r3 * r9
            float r3 = r3 + r0
            int r9 = (int) r3
            r1.d(r9)
            int r9 = r1.g
            int r10 = r10.g
            int r9 = r9 + r10
            r2.d(r9)
        L149:
            return
        L14a:
            l21 r10 = r9.b
            h11 r1 = r10.J
            h11 r10 = r10.L
            r9.l(r1, r10, r0)
            return
    }

    @Override // defpackage.ct7
    public final void d() {
            r15 = this;
            ci1 r0 = r15.k
            l21 r1 = r15.b
            boolean r2 = r1.a
            rj1 r3 = r15.e
            if (r2 == 0) goto L11
            int r1 = r1.l()
            r3.d(r1)
        L11:
            boolean r1 = r3.j
            java.util.ArrayList r2 = r3.k
            java.util.ArrayList r4 = r3.l
            r5 = 1
            ci1 r6 = r15.i
            ci1 r7 = r15.h
            if (r1 != 0) goto L90
            l21 r1 = r15.b
            k21[] r8 = r1.T
            r8 = r8[r5]
            r15.d = r8
            boolean r1 = r1.E
            if (r1 == 0) goto L31
            w20 r1 = new w20
            r1.<init>(r15)
            r15.l = r1
        L31:
            k21 r1 = r15.d
            k21 r8 = defpackage.k21.MATCH_CONSTRAINT
            if (r1 == r8) goto Lc2
            k21 r8 = defpackage.k21.MATCH_PARENT
            if (r1 != r8) goto L82
            l21 r8 = r15.b
            l21 r8 = r8.U
            if (r8 == 0) goto L82
            k21[] r9 = r8.T
            r9 = r9[r5]
            k21 r10 = defpackage.k21.FIXED
            if (r9 != r10) goto L82
            int r0 = r8.l()
            l21 r1 = r15.b
            h11 r1 = r1.J
            int r1 = r1.e()
            int r0 = r0 - r1
            l21 r1 = r15.b
            h11 r1 = r1.L
            int r1 = r1.e()
            int r0 = r0 - r1
            lm7 r1 = r8.e
            ci1 r1 = r1.h
            l21 r2 = r15.b
            h11 r2 = r2.J
            int r2 = r2.e()
            defpackage.ct7.b(r7, r1, r2)
            lm7 r1 = r8.e
            ci1 r1 = r1.i
            l21 r15 = r15.b
            h11 r15 = r15.L
            int r15 = r15.e()
            int r15 = -r15
            defpackage.ct7.b(r6, r1, r15)
            r3.d(r0)
            return
        L82:
            k21 r8 = defpackage.k21.FIXED
            if (r1 != r8) goto Lc2
            l21 r1 = r15.b
            int r1 = r1.l()
            r3.d(r1)
            goto Lc2
        L90:
            k21 r1 = r15.d
            k21 r8 = defpackage.k21.MATCH_PARENT
            if (r1 != r8) goto Lc2
            l21 r1 = r15.b
            l21 r8 = r1.U
            if (r8 == 0) goto Lc2
            k21[] r9 = r8.T
            r9 = r9[r5]
            k21 r10 = defpackage.k21.FIXED
            if (r9 != r10) goto Lc2
            lm7 r0 = r8.e
            ci1 r0 = r0.h
            h11 r1 = r1.J
            int r1 = r1.e()
            defpackage.ct7.b(r7, r0, r1)
            lm7 r0 = r8.e
            ci1 r0 = r0.i
            l21 r15 = r15.b
            h11 r15 = r15.L
            int r15 = r15.e()
            int r15 = -r15
            defpackage.ct7.b(r6, r0, r15)
            return
        Lc2:
            boolean r1 = r3.j
            r8 = 0
            r9 = 4
            r10 = 2
            r11 = 3
            if (r1 == 0) goto L1e0
            l21 r12 = r15.b
            boolean r13 = r12.a
            if (r13 == 0) goto L1e0
            h11[] r1 = r12.Q
            r2 = r1[r10]
            h11 r4 = r2.f
            if (r4 == 0) goto L13f
            r13 = r1[r11]
            h11 r13 = r13.f
            if (r13 == 0) goto L13f
            boolean r1 = r12.z()
            l21 r2 = r15.b
            if (r1 == 0) goto Lfe
            h11[] r1 = r2.Q
            r1 = r1[r10]
            int r1 = r1.e()
            r7.f = r1
            l21 r1 = r15.b
            h11[] r1 = r1.Q
            r1 = r1[r11]
            int r1 = r1.e()
            int r1 = -r1
            r6.f = r1
            goto L133
        Lfe:
            h11[] r1 = r2.Q
            r1 = r1[r10]
            ci1 r1 = defpackage.ct7.h(r1)
            if (r1 == 0) goto L115
            l21 r2 = r15.b
            h11[] r2 = r2.Q
            r2 = r2[r10]
            int r2 = r2.e()
            defpackage.ct7.b(r7, r1, r2)
        L115:
            l21 r1 = r15.b
            h11[] r1 = r1.Q
            r1 = r1[r11]
            ci1 r1 = defpackage.ct7.h(r1)
            if (r1 == 0) goto L12f
            l21 r2 = r15.b
            h11[] r2 = r2.Q
            r2 = r2[r11]
            int r2 = r2.e()
            int r2 = -r2
            defpackage.ct7.b(r6, r1, r2)
        L12f:
            r7.b = r5
            r6.b = r5
        L133:
            l21 r15 = r15.b
            boolean r1 = r15.E
            if (r1 == 0) goto L36a
            int r15 = r15.b0
            defpackage.ct7.b(r0, r7, r15)
            return
        L13f:
            if (r4 == 0) goto L165
            ci1 r1 = defpackage.ct7.h(r2)
            if (r1 == 0) goto L36a
            l21 r2 = r15.b
            h11[] r2 = r2.Q
            r2 = r2[r10]
            int r2 = r2.e()
            defpackage.ct7.b(r7, r1, r2)
            int r1 = r3.g
            defpackage.ct7.b(r6, r7, r1)
            l21 r15 = r15.b
            boolean r1 = r15.E
            if (r1 == 0) goto L36a
            int r15 = r15.b0
            defpackage.ct7.b(r0, r7, r15)
            return
        L165:
            r2 = r1[r11]
            h11 r4 = r2.f
            if (r4 == 0) goto L191
            ci1 r1 = defpackage.ct7.h(r2)
            if (r1 == 0) goto L185
            l21 r2 = r15.b
            h11[] r2 = r2.Q
            r2 = r2[r11]
            int r2 = r2.e()
            int r2 = -r2
            defpackage.ct7.b(r6, r1, r2)
            int r1 = r3.g
            int r1 = -r1
            defpackage.ct7.b(r7, r6, r1)
        L185:
            l21 r15 = r15.b
            boolean r1 = r15.E
            if (r1 == 0) goto L36a
            int r15 = r15.b0
            defpackage.ct7.b(r0, r7, r15)
            return
        L191:
            r1 = r1[r9]
            h11 r2 = r1.f
            if (r2 == 0) goto L1ae
            ci1 r1 = defpackage.ct7.h(r1)
            if (r1 == 0) goto L36a
            defpackage.ct7.b(r0, r1, r8)
            l21 r15 = r15.b
            int r15 = r15.b0
            int r15 = -r15
            defpackage.ct7.b(r7, r0, r15)
            int r15 = r3.g
            defpackage.ct7.b(r6, r7, r15)
            return
        L1ae:
            boolean r1 = r12 instanceof defpackage.gx2
            if (r1 != 0) goto L36a
            l21 r1 = r12.U
            if (r1 == 0) goto L36a
            g11 r1 = defpackage.g11.CENTER
            h11 r1 = r12.j(r1)
            h11 r1 = r1.f
            if (r1 != 0) goto L36a
            l21 r1 = r15.b
            l21 r2 = r1.U
            lm7 r2 = r2.e
            ci1 r2 = r2.h
            int r1 = r1.t()
            defpackage.ct7.b(r7, r2, r1)
            int r1 = r3.g
            defpackage.ct7.b(r6, r7, r1)
            l21 r15 = r15.b
            boolean r1 = r15.E
            if (r1 == 0) goto L36a
            int r15 = r15.b0
            defpackage.ct7.b(r0, r7, r15)
            return
        L1e0:
            if (r1 != 0) goto L22d
            k21 r1 = r15.d
            k21 r12 = defpackage.k21.MATCH_CONSTRAINT
            if (r1 != r12) goto L22d
            l21 r1 = r15.b
            int r12 = r1.s
            if (r12 == r10) goto L213
            if (r12 == r11) goto L1f1
            goto L230
        L1f1:
            boolean r1 = r1.z()
            if (r1 != 0) goto L230
            l21 r1 = r15.b
            int r12 = r1.r
            if (r12 != r11) goto L1fe
            goto L230
        L1fe:
            ly2 r1 = r1.d
            rj1 r1 = r1.e
            r4.add(r1)
            java.util.ArrayList r1 = r1.k
            r1.add(r3)
            r3.b = r5
            r2.add(r7)
            r2.add(r6)
            goto L230
        L213:
            l21 r1 = r1.U
            if (r1 != 0) goto L218
            goto L230
        L218:
            lm7 r1 = r1.e
            rj1 r1 = r1.e
            r4.add(r1)
            java.util.ArrayList r1 = r1.k
            r1.add(r3)
            r3.b = r5
            r2.add(r7)
            r2.add(r6)
            goto L230
        L22d:
            r3.b(r15)
        L230:
            l21 r1 = r15.b
            h11[] r2 = r1.Q
            r12 = r2[r10]
            h11 r13 = r12.f
            if (r13 == 0) goto L28d
            r14 = r2[r11]
            h11 r14 = r14.f
            if (r14 == 0) goto L28d
            boolean r1 = r1.z()
            l21 r2 = r15.b
            if (r1 == 0) goto L260
            h11[] r1 = r2.Q
            r1 = r1[r10]
            int r1 = r1.e()
            r7.f = r1
            l21 r1 = r15.b
            h11[] r1 = r1.Q
            r1 = r1[r11]
            int r1 = r1.e()
            int r1 = -r1
            r6.f = r1
            goto L280
        L260:
            h11[] r1 = r2.Q
            r1 = r1[r10]
            ci1 r1 = defpackage.ct7.h(r1)
            l21 r2 = r15.b
            h11[] r2 = r2.Q
            r2 = r2[r11]
            ci1 r2 = defpackage.ct7.h(r2)
            if (r1 == 0) goto L277
            r1.b(r15)
        L277:
            if (r2 == 0) goto L27c
            r2.b(r15)
        L27c:
            bt7 r1 = defpackage.bt7.CENTER
            r15.j = r1
        L280:
            l21 r1 = r15.b
            boolean r1 = r1.E
            if (r1 == 0) goto L362
            w20 r1 = r15.l
            r15.c(r0, r7, r5, r1)
            goto L362
        L28d:
            r14 = 0
            if (r13 == 0) goto L2d9
            ci1 r1 = defpackage.ct7.h(r12)
            if (r1 == 0) goto L362
            l21 r2 = r15.b
            h11[] r2 = r2.Q
            r2 = r2[r10]
            int r2 = r2.e()
            defpackage.ct7.b(r7, r1, r2)
            r15.c(r6, r7, r5, r3)
            l21 r1 = r15.b
            boolean r1 = r1.E
            if (r1 == 0) goto L2b1
            w20 r1 = r15.l
            r15.c(r0, r7, r5, r1)
        L2b1:
            k21 r0 = r15.d
            k21 r1 = defpackage.k21.MATCH_CONSTRAINT
            if (r0 != r1) goto L362
            l21 r0 = r15.b
            float r2 = r0.X
            int r2 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r2 <= 0) goto L362
            ly2 r0 = r0.d
            k21 r2 = r0.d
            if (r2 != r1) goto L362
            rj1 r0 = r0.e
            java.util.ArrayList r0 = r0.k
            r0.add(r3)
            l21 r0 = r15.b
            ly2 r0 = r0.d
            rj1 r0 = r0.e
            r4.add(r0)
            r3.a = r15
            goto L362
        L2d9:
            r10 = r2[r11]
            h11 r12 = r10.f
            r13 = -1
            if (r12 == 0) goto L303
            ci1 r1 = defpackage.ct7.h(r10)
            if (r1 == 0) goto L362
            l21 r2 = r15.b
            h11[] r2 = r2.Q
            r2 = r2[r11]
            int r2 = r2.e()
            int r2 = -r2
            defpackage.ct7.b(r6, r1, r2)
            r15.c(r7, r6, r13, r3)
            l21 r1 = r15.b
            boolean r1 = r1.E
            if (r1 == 0) goto L362
            w20 r1 = r15.l
            r15.c(r0, r7, r5, r1)
            goto L362
        L303:
            r2 = r2[r9]
            h11 r9 = r2.f
            if (r9 == 0) goto L31b
            ci1 r1 = defpackage.ct7.h(r2)
            if (r1 == 0) goto L362
            defpackage.ct7.b(r0, r1, r8)
            w20 r1 = r15.l
            r15.c(r7, r0, r13, r1)
            r15.c(r6, r7, r5, r3)
            goto L362
        L31b:
            boolean r2 = r1 instanceof defpackage.gx2
            if (r2 != 0) goto L362
            l21 r2 = r1.U
            if (r2 == 0) goto L362
            lm7 r2 = r2.e
            ci1 r2 = r2.h
            int r1 = r1.t()
            defpackage.ct7.b(r7, r2, r1)
            r15.c(r6, r7, r5, r3)
            l21 r1 = r15.b
            boolean r1 = r1.E
            if (r1 == 0) goto L33c
            w20 r1 = r15.l
            r15.c(r0, r7, r5, r1)
        L33c:
            k21 r0 = r15.d
            k21 r1 = defpackage.k21.MATCH_CONSTRAINT
            if (r0 != r1) goto L362
            l21 r0 = r15.b
            float r2 = r0.X
            int r2 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r2 <= 0) goto L362
            ly2 r0 = r0.d
            k21 r2 = r0.d
            if (r2 != r1) goto L362
            rj1 r0 = r0.e
            java.util.ArrayList r0 = r0.k
            r0.add(r3)
            l21 r0 = r15.b
            ly2 r0 = r0.d
            rj1 r0 = r0.e
            r4.add(r0)
            r3.a = r15
        L362:
            int r15 = r4.size()
            if (r15 != 0) goto L36a
            r3.c = r5
        L36a:
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
            r2.a0 = r0
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
            ci1 r0 = r1.k
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
            int r3 = r3.s
            if (r3 != 0) goto Le
            return r2
        Le:
            r3 = 0
            return r3
        L10:
            return r2
    }

    public final void m() {
            r2 = this;
            r0 = 0
            r2.g = r0
            ci1 r1 = r2.h
            r1.c()
            r1.j = r0
            ci1 r1 = r2.i
            r1.c()
            r1.j = r0
            ci1 r1 = r2.k
            r1.c()
            r1.j = r0
            rj1 r2 = r2.e
            r2.j = r0
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "VerticalRun "
            r0.<init>(r1)
            l21 r2 = r2.b
            java.lang.String r2 = r2.j0
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
