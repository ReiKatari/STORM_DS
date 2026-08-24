package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: k70  reason: default package */
/* loaded from: classes.dex */
public final class k70 implements defpackage.e34 {
    public final defpackage.e40 a;
    public final boolean b;

    public k70(defpackage.e40 r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    @Override // defpackage.e34
    public final defpackage.f34 d(defpackage.g34 r17, java.util.List r18, long r19) {
            r16 = this;
            r3 = r17
            r2 = r18
            boolean r0 = r2.isEmpty()
            zt1 r8 = defpackage.zt1.A
            if (r0 == 0) goto L20
            int r0 = defpackage.q21.j(r19)
            int r1 = defpackage.q21.i(r19)
            bz1 r2 = new bz1
            r4 = 22
            r2.<init>(r4)
            f34 r0 = r3.K(r0, r1, r8, r2)
            return r0
        L20:
            r6 = r16
            boolean r0 = r6.b
            if (r0 == 0) goto L29
            r0 = r19
            goto L30
        L29:
            r0 = -8589934589(0xfffffffe00000003, double:NaN)
            long r0 = r19 & r0
        L30:
            int r4 = r2.size()
            r5 = 0
            r7 = 1
            r9 = 0
            if (r4 != r7) goto La2
            java.lang.Object r2 = r2.get(r9)
            x24 r2 = (defpackage.x24) r2
            java.lang.Object r4 = r2.B()
            boolean r10 = r4 instanceof defpackage.g70
            if (r10 == 0) goto L4a
            r5 = r4
            g70 r5 = (defpackage.g70) r5
        L4a:
            if (r5 == 0) goto L4f
            boolean r4 = r5.l0
            goto L50
        L4f:
            r4 = r9
        L50:
            if (r4 != 0) goto L6e
            dx4 r0 = r2.y(r0)
            int r1 = defpackage.q21.j(r19)
            int r4 = r0.A
            int r1 = java.lang.Math.max(r1, r4)
            int r4 = defpackage.q21.i(r19)
            int r5 = r0.B
            int r4 = java.lang.Math.max(r4, r5)
        L6a:
            r5 = r4
            r4 = r1
            r1 = r0
            goto L98
        L6e:
            int r1 = defpackage.q21.j(r19)
            int r4 = defpackage.q21.i(r19)
            int r0 = defpackage.q21.j(r19)
            int r5 = defpackage.q21.i(r19)
            if (r0 < 0) goto L82
            r10 = r7
            goto L83
        L82:
            r10 = r9
        L83:
            if (r5 < 0) goto L86
            goto L87
        L86:
            r7 = r9
        L87:
            r7 = r7 & r10
            if (r7 != 0) goto L8f
            java.lang.String r7 = "width and height must be >= 0"
            defpackage.r53.a(r7)
        L8f:
            long r9 = defpackage.s21.h(r0, r0, r5, r5)
            dx4 r0 = r2.y(r9)
            goto L6a
        L98:
            i70 r0 = new i70
            r0.<init>(r1, r2, r3, r4, r5, r6)
            f34 r0 = r3.K(r4, r5, r8, r0)
            return r0
        La2:
            int r4 = r2.size()
            dx4[] r4 = new defpackage.dx4[r4]
            r6 = r4
            bh5 r4 = new bh5
            r4.<init>()
            int r10 = defpackage.q21.j(r19)
            r4.A = r10
            r10 = r5
            bh5 r5 = new bh5
            r5.<init>()
            int r11 = defpackage.q21.i(r19)
            r5.A = r11
            int r11 = r2.size()
            r12 = r9
            r13 = r12
        Lc6:
            if (r12 >= r11) goto L102
            java.lang.Object r14 = r2.get(r12)
            x24 r14 = (defpackage.x24) r14
            java.lang.Object r15 = r14.B()
            boolean r7 = r15 instanceof defpackage.g70
            if (r7 == 0) goto Ld9
            g70 r15 = (defpackage.g70) r15
            goto Lda
        Ld9:
            r15 = r10
        Lda:
            if (r15 == 0) goto Ldf
            boolean r7 = r15.l0
            goto Le0
        Ldf:
            r7 = r9
        Le0:
            if (r7 != 0) goto Lfd
            dx4 r7 = r14.y(r0)
            r6[r12] = r7
            int r14 = r4.A
            int r15 = r7.A
            int r14 = java.lang.Math.max(r14, r15)
            r4.A = r14
            int r14 = r5.A
            int r7 = r7.B
            int r7 = java.lang.Math.max(r14, r7)
            r5.A = r7
            goto Lfe
        Lfd:
            r13 = 1
        Lfe:
            int r12 = r12 + 1
            r7 = 1
            goto Lc6
        L102:
            if (r13 == 0) goto L143
            int r0 = r4.A
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == r1) goto L10d
            r7 = r0
            goto L10e
        L10d:
            r7 = r9
        L10e:
            int r11 = r5.A
            if (r11 == r1) goto L114
            r1 = r11
            goto L115
        L114:
            r1 = r9
        L115:
            long r0 = defpackage.s21.a(r7, r0, r1, r11)
            int r7 = r2.size()
            r11 = r9
        L11e:
            if (r11 >= r7) goto L143
            java.lang.Object r12 = r2.get(r11)
            x24 r12 = (defpackage.x24) r12
            java.lang.Object r13 = r12.B()
            boolean r14 = r13 instanceof defpackage.g70
            if (r14 == 0) goto L131
            g70 r13 = (defpackage.g70) r13
            goto L132
        L131:
            r13 = r10
        L132:
            if (r13 == 0) goto L137
            boolean r13 = r13.l0
            goto L138
        L137:
            r13 = r9
        L138:
            if (r13 == 0) goto L140
            dx4 r12 = r12.y(r0)
            r6[r11] = r12
        L140:
            int r11 = r11 + 1
            goto L11e
        L143:
            int r9 = r4.A
            int r10 = r5.A
            j70 r0 = new j70
            r7 = 0
            r1 = r6
            r6 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            f34 r0 = r3.K(r9, r10, r8, r0)
            return r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L1d
        L3:
            boolean r0 = r3 instanceof defpackage.k70
            if (r0 != 0) goto L8
            goto L1b
        L8:
            k70 r3 = (defpackage.k70) r3
            e40 r0 = r2.a
            e40 r1 = r3.a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L1b
        L15:
            boolean r2 = r2.b
            boolean r3 = r3.b
            if (r2 == r3) goto L1d
        L1b:
            r2 = 0
            return r2
        L1d:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r1 = this;
            e40 r0 = r1.a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            boolean r1 = r1.b
            int r1 = java.lang.Boolean.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "BoxMeasurePolicy(alignment="
            r0.<init>(r1)
            e40 r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", propagateMinConstraints="
            r0.append(r1)
            boolean r2 = r2.b
            r1 = 41
            java.lang.String r2 = defpackage.xg6.r(r0, r2, r1)
            return r2
    }
}
