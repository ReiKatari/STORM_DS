package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: a20  reason: default package */
/* loaded from: classes.dex */
public final class a20 extends defpackage.gx2 {
    public int v0;
    public boolean w0;
    public int x0;
    public boolean y0;

    public a20() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.v0 = r0
            r1 = 1
            r2.w0 = r1
            r2.x0 = r0
            r2.y0 = r0
            return
    }

    @Override // defpackage.l21
    public final boolean B() {
            r0 = this;
            boolean r0 = r0.y0
            return r0
    }

    @Override // defpackage.l21
    public final boolean C() {
            r0 = this;
            boolean r0 = r0.y0
            return r0
    }

    public final boolean V() {
            r8 = this;
            r0 = 1
            r1 = 0
            r3 = r0
            r2 = r1
        L4:
            int r4 = r8.u0
            r5 = 3
            r6 = 2
            if (r2 >= r4) goto L37
            l21[] r4 = r8.t0
            r4 = r4[r2]
            boolean r7 = r8.w0
            if (r7 != 0) goto L19
            boolean r7 = r4.c()
            if (r7 != 0) goto L19
            goto L34
        L19:
            int r7 = r8.v0
            if (r7 == 0) goto L1f
            if (r7 != r0) goto L27
        L1f:
            boolean r7 = r4.B()
            if (r7 != 0) goto L27
        L25:
            r3 = r1
            goto L34
        L27:
            int r7 = r8.v0
            if (r7 == r6) goto L2d
            if (r7 != r5) goto L34
        L2d:
            boolean r4 = r4.C()
            if (r4 != 0) goto L34
            goto L25
        L34:
            int r2 = r2 + 1
            goto L4
        L37:
            if (r3 == 0) goto Le6
            if (r4 <= 0) goto Le6
            r2 = r1
            r3 = r2
        L3d:
            int r4 = r8.u0
            if (r1 >= r4) goto Ld2
            l21[] r4 = r8.t0
            r4 = r4[r1]
            boolean r7 = r8.w0
            if (r7 != 0) goto L51
            boolean r7 = r4.c()
            if (r7 != 0) goto L51
            goto Lce
        L51:
            if (r3 != 0) goto L89
            int r3 = r8.v0
            if (r3 != 0) goto L62
            g11 r2 = defpackage.g11.LEFT
            h11 r2 = r4.j(r2)
            int r2 = r2.d()
            goto L88
        L62:
            if (r3 != r0) goto L6f
            g11 r2 = defpackage.g11.RIGHT
            h11 r2 = r4.j(r2)
            int r2 = r2.d()
            goto L88
        L6f:
            if (r3 != r6) goto L7c
            g11 r2 = defpackage.g11.TOP
            h11 r2 = r4.j(r2)
            int r2 = r2.d()
            goto L88
        L7c:
            if (r3 != r5) goto L88
            g11 r2 = defpackage.g11.BOTTOM
            h11 r2 = r4.j(r2)
            int r2 = r2.d()
        L88:
            r3 = r0
        L89:
            int r7 = r8.v0
            if (r7 != 0) goto L9c
            g11 r7 = defpackage.g11.LEFT
            h11 r4 = r4.j(r7)
            int r4 = r4.d()
            int r2 = java.lang.Math.min(r2, r4)
            goto Lce
        L9c:
            if (r7 != r0) goto Lad
            g11 r7 = defpackage.g11.RIGHT
            h11 r4 = r4.j(r7)
            int r4 = r4.d()
            int r2 = java.lang.Math.max(r2, r4)
            goto Lce
        Lad:
            if (r7 != r6) goto Lbe
            g11 r7 = defpackage.g11.TOP
            h11 r4 = r4.j(r7)
            int r4 = r4.d()
            int r2 = java.lang.Math.min(r2, r4)
            goto Lce
        Lbe:
            if (r7 != r5) goto Lce
            g11 r7 = defpackage.g11.BOTTOM
            h11 r4 = r4.j(r7)
            int r4 = r4.d()
            int r2 = java.lang.Math.max(r2, r4)
        Lce:
            int r1 = r1 + 1
            goto L3d
        Ld2:
            int r1 = r8.x0
            int r2 = r2 + r1
            int r1 = r8.v0
            if (r1 == 0) goto Le0
            if (r1 != r0) goto Ldc
            goto Le0
        Ldc:
            r8.L(r2, r2)
            goto Le3
        Le0:
            r8.K(r2, r2)
        Le3:
            r8.y0 = r0
            return r0
        Le6:
            return r1
    }

    public final int W() {
            r2 = this;
            int r2 = r2.v0
            if (r2 == 0) goto L10
            r0 = 1
            if (r2 == r0) goto L10
            r1 = 2
            if (r2 == r1) goto Lf
            r1 = 3
            if (r2 == r1) goto Lf
            r2 = -1
            return r2
        Lf:
            return r0
        L10:
            r2 = 0
            return r2
    }

    @Override // defpackage.l21
    public final void b(defpackage.jv3 r17, boolean r18) {
            r16 = this;
            r0 = r16
            r1 = r17
            h11[] r2 = r0.Q
            r3 = 0
            h11 r4 = r0.I
            r2[r3] = r4
            r5 = 2
            h11 r6 = r0.J
            r2[r5] = r6
            r7 = 1
            h11 r8 = r0.K
            r2[r7] = r8
            r9 = 3
            h11 r10 = r0.L
            r2[r9] = r10
            r11 = r3
        L1b:
            int r12 = r2.length
            if (r11 >= r12) goto L29
            r12 = r2[r11]
            en6 r13 = r1.k(r12)
            r12.i = r13
            int r11 = r11 + 1
            goto L1b
        L29:
            int r11 = r0.v0
            if (r11 < 0) goto L1ec
            r12 = 4
            if (r11 >= r12) goto L1ec
            r2 = r2[r11]
            boolean r11 = r0.y0
            if (r11 != 0) goto L39
            r0.V()
        L39:
            boolean r11 = r0.y0
            if (r11 == 0) goto L68
            r0.y0 = r3
            int r2 = r0.v0
            if (r2 == 0) goto L59
            if (r2 != r7) goto L46
            goto L59
        L46:
            if (r2 == r5) goto L4a
            if (r2 != r9) goto L1ec
        L4a:
            en6 r2 = r6.i
            int r3 = r0.a0
            r1.d(r2, r3)
            en6 r2 = r10.i
            int r0 = r0.a0
            r1.d(r2, r0)
            return
        L59:
            en6 r2 = r4.i
            int r3 = r0.Z
            r1.d(r2, r3)
            en6 r2 = r8.i
            int r0 = r0.Z
            r1.d(r2, r0)
            return
        L68:
            r11 = r3
        L69:
            int r13 = r0.u0
            if (r11 >= r13) goto Lb5
            l21[] r13 = r0.t0
            r13 = r13[r11]
            boolean r14 = r0.w0
            if (r14 != 0) goto L7c
            boolean r14 = r13.c()
            if (r14 != 0) goto L7c
            goto Lb1
        L7c:
            int r14 = r0.v0
            if (r14 == 0) goto L82
            if (r14 != r7) goto L98
        L82:
            k21[] r15 = r13.T
            r15 = r15[r3]
            k21 r12 = defpackage.k21.MATCH_CONSTRAINT
            if (r15 != r12) goto L98
            h11 r12 = r13.I
            h11 r12 = r12.f
            if (r12 == 0) goto L98
            h11 r12 = r13.K
            h11 r12 = r12.f
            if (r12 == 0) goto L98
        L96:
            r11 = r7
            goto Lb6
        L98:
            if (r14 == r5) goto L9c
            if (r14 != r9) goto Lb1
        L9c:
            k21[] r12 = r13.T
            r12 = r12[r7]
            k21 r14 = defpackage.k21.MATCH_CONSTRAINT
            if (r12 != r14) goto Lb1
            h11 r12 = r13.J
            h11 r12 = r12.f
            if (r12 == 0) goto Lb1
            h11 r12 = r13.L
            h11 r12 = r12.f
            if (r12 == 0) goto Lb1
            goto L96
        Lb1:
            int r11 = r11 + 1
            r12 = 4
            goto L69
        Lb5:
            r11 = r3
        Lb6:
            boolean r12 = r4.g()
            if (r12 != 0) goto Lc5
            boolean r12 = r8.g()
            if (r12 == 0) goto Lc3
            goto Lc5
        Lc3:
            r12 = r3
            goto Lc6
        Lc5:
            r12 = r7
        Lc6:
            boolean r13 = r6.g()
            if (r13 != 0) goto Ld5
            boolean r13 = r10.g()
            if (r13 == 0) goto Ld3
            goto Ld5
        Ld3:
            r13 = r3
            goto Ld6
        Ld5:
            r13 = r7
        Ld6:
            if (r11 != 0) goto Lec
            int r11 = r0.v0
            if (r11 != 0) goto Lde
            if (r12 != 0) goto Lea
        Lde:
            if (r11 != r5) goto Le2
            if (r13 != 0) goto Lea
        Le2:
            if (r11 != r7) goto Le6
            if (r12 != 0) goto Lea
        Le6:
            if (r11 != r9) goto Lec
            if (r13 == 0) goto Lec
        Lea:
            r11 = r7
            goto Led
        Lec:
            r11 = r3
        Led:
            if (r11 != 0) goto Lf1
            r11 = 4
            goto Lf2
        Lf1:
            r11 = 5
        Lf2:
            r12 = r3
        Lf3:
            int r13 = r0.u0
            if (r12 >= r13) goto L162
            l21[] r13 = r0.t0
            r13 = r13[r12]
            boolean r14 = r0.w0
            if (r14 != 0) goto L106
            boolean r14 = r13.c()
            if (r14 != 0) goto L106
            goto L15c
        L106:
            h11[] r14 = r13.Q
            int r15 = r0.v0
            r14 = r14[r15]
            en6 r14 = r1.k(r14)
            h11[] r13 = r13.Q
            int r15 = r0.v0
            r13 = r13[r15]
            r13.i = r14
            h11 r9 = r13.f
            if (r9 == 0) goto L123
            l21 r9 = r9.d
            if (r9 != r0) goto L123
            int r9 = r13.g
            goto L124
        L123:
            r9 = r3
        L124:
            if (r15 == 0) goto L13f
            if (r15 != r5) goto L129
            goto L13f
        L129:
            en6 r13 = r2.i
            int r15 = r0.x0
            int r15 = r15 + r9
            yu r5 = r1.l()
            en6 r7 = r1.m()
            r7.R = r3
            r5.b(r13, r14, r7, r15)
            r1.c(r5)
            goto L154
        L13f:
            en6 r5 = r2.i
            int r7 = r0.x0
            int r7 = r7 - r9
            yu r13 = r1.l()
            en6 r15 = r1.m()
            r15.R = r3
            r13.c(r5, r14, r15, r7)
            r1.c(r13)
        L154:
            en6 r5 = r2.i
            int r7 = r0.x0
            int r7 = r7 + r9
            r1.e(r5, r14, r7, r11)
        L15c:
            int r12 = r12 + 1
            r5 = 2
            r7 = 1
            r9 = 3
            goto Lf3
        L162:
            int r2 = r0.v0
            r5 = 8
            if (r2 != 0) goto L187
            en6 r2 = r8.i
            en6 r6 = r4.i
            r1.e(r2, r6, r3, r5)
            en6 r2 = r4.i
            l21 r5 = r0.U
            h11 r5 = r5.K
            en6 r5 = r5.i
            r6 = 4
            r1.e(r2, r5, r3, r6)
            en6 r2 = r4.i
            l21 r0 = r0.U
            h11 r0 = r0.I
            en6 r0 = r0.i
            r1.e(r2, r0, r3, r3)
            return
        L187:
            r7 = 1
            if (r2 != r7) goto L1a9
            en6 r2 = r4.i
            en6 r6 = r8.i
            r1.e(r2, r6, r3, r5)
            en6 r2 = r4.i
            l21 r5 = r0.U
            h11 r5 = r5.I
            en6 r5 = r5.i
            r6 = 4
            r1.e(r2, r5, r3, r6)
            en6 r2 = r4.i
            l21 r0 = r0.U
            h11 r0 = r0.K
            en6 r0 = r0.i
            r1.e(r2, r0, r3, r3)
            return
        L1a9:
            r4 = 2
            if (r2 != r4) goto L1cb
            en6 r2 = r10.i
            en6 r4 = r6.i
            r1.e(r2, r4, r3, r5)
            en6 r2 = r6.i
            l21 r4 = r0.U
            h11 r4 = r4.L
            en6 r4 = r4.i
            r5 = 4
            r1.e(r2, r4, r3, r5)
            en6 r2 = r6.i
            l21 r0 = r0.U
            h11 r0 = r0.J
            en6 r0 = r0.i
            r1.e(r2, r0, r3, r3)
            return
        L1cb:
            r4 = 3
            if (r2 != r4) goto L1ec
            en6 r2 = r6.i
            en6 r4 = r10.i
            r1.e(r2, r4, r3, r5)
            en6 r2 = r6.i
            l21 r4 = r0.U
            h11 r4 = r4.J
            en6 r4 = r4.i
            r5 = 4
            r1.e(r2, r4, r3, r5)
            en6 r2 = r6.i
            l21 r0 = r0.U
            h11 r0 = r0.L
            en6 r0 = r0.i
            r1.e(r2, r0, r3, r3)
        L1ec:
            return
    }

    @Override // defpackage.l21
    public final boolean c() {
            r0 = this;
            r0 = 1
            return r0
    }

    @Override // defpackage.gx2, defpackage.l21
    public final void g(defpackage.l21 r1, java.util.HashMap r2) {
            r0 = this;
            super.g(r1, r2)
            a20 r1 = (defpackage.a20) r1
            int r2 = r1.v0
            r0.v0 = r2
            boolean r2 = r1.w0
            r0.w0 = r2
            int r1 = r1.x0
            r0.x0 = r1
            return
    }

    @Override // defpackage.l21
    public final java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "[Barrier] "
            r0.<init>(r1)
            java.lang.String r1 = r4.j0
            java.lang.String r2 = " {"
            java.lang.String r0 = defpackage.i61.n(r0, r1, r2)
            r1 = 0
        L10:
            int r2 = r4.u0
            if (r1 >= r2) goto L30
            l21[] r2 = r4.t0
            r2 = r2[r1]
            if (r1 <= 0) goto L20
            java.lang.String r3 = ", "
            java.lang.String r0 = r0.concat(r3)
        L20:
            java.lang.StringBuilder r0 = defpackage.lb1.s(r0)
            java.lang.String r2 = r2.j0
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            int r1 = r1 + 1
            goto L10
        L30:
            java.lang.String r4 = "}"
            java.lang.String r4 = r0.concat(r4)
            return r4
    }
}
