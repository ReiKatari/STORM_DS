package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rn  reason: default package */
/* loaded from: classes.dex */
public final class rn implements defpackage.e34 {
    public final defpackage.yn a;

    public rn(defpackage.yn r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // defpackage.e34
    public final int a(defpackage.eb3 r5, java.util.List r6, int r7) {
            r4 = this;
            boolean r4 = r6.isEmpty()
            r5 = 0
            if (r4 == 0) goto L9
            r4 = 0
            goto L39
        L9:
            java.lang.Object r4 = r6.get(r5)
            x24 r4 = (defpackage.x24) r4
            int r4 = r4.u(r7)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            int r0 = r6.size()
            r1 = 1
            int r0 = r0 - r1
            if (r1 > r0) goto L39
        L1f:
            java.lang.Object r2 = r6.get(r1)
            x24 r2 = (defpackage.x24) r2
            int r2 = r2.u(r7)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r3 = r2.compareTo(r4)
            if (r3 <= 0) goto L34
            r4 = r2
        L34:
            if (r1 == r0) goto L39
            int r1 = r1 + 1
            goto L1f
        L39:
            if (r4 == 0) goto L40
            int r4 = r4.intValue()
            return r4
        L40:
            return r5
    }

    @Override // defpackage.e34
    public final defpackage.f34 d(defpackage.g34 r21, java.util.List r22, long r23) {
            r20 = this;
            r0 = r20
            r1 = r22
            r2 = r23
            int r4 = r1.size()
            dx4[] r5 = new defpackage.dx4[r4]
            int r6 = r1.size()
            r7 = 0
            r10 = 0
        L13:
            r13 = 32
            r14 = 0
            r15 = 1
            if (r10 >= r6) goto L57
            java.lang.Object r16 = r1.get(r10)
            r17 = 0
            r9 = r16
            x24 r9 = (defpackage.x24) r9
            r18 = 4294967295(0xffffffff, double:2.1219957905E-314)
            java.lang.Object r11 = r9.B()
            boolean r12 = r11 instanceof defpackage.tn
            if (r12 == 0) goto L33
            r14 = r11
            tn r14 = (defpackage.tn) r14
        L33:
            if (r14 == 0) goto L54
            vs4 r11 = r14.a
            java.lang.Object r11 = r11.getValue()
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 != r15) goto L54
            dx4 r7 = r9.y(r2)
            int r8 = r7.A
            int r9 = r7.B
            long r11 = (long) r8
            long r11 = r11 << r13
            long r8 = (long) r9
            long r8 = r8 & r18
            long r8 = r8 | r11
            r5[r10] = r7
            r7 = r8
        L54:
            int r10 = r10 + 1
            goto L13
        L57:
            r17 = 0
            r18 = 4294967295(0xffffffff, double:2.1219957905E-314)
            int r6 = r1.size()
            r9 = r17
        L64:
            if (r9 >= r6) goto L79
            java.lang.Object r10 = r1.get(r9)
            x24 r10 = (defpackage.x24) r10
            r11 = r5[r9]
            if (r11 != 0) goto L76
            dx4 r10 = r10.y(r2)
            r5[r9] = r10
        L76:
            int r9 = r9 + 1
            goto L64
        L79:
            boolean r1 = r21.a0()
            if (r1 == 0) goto L83
            long r1 = r7 >> r13
            int r1 = (int) r1
            goto Lb1
        L83:
            if (r4 != 0) goto L87
            r1 = r14
            goto Laa
        L87:
            r1 = r5[r17]
            int r2 = r4 + (-1)
            if (r2 != 0) goto L8e
            goto Laa
        L8e:
            if (r1 == 0) goto L93
            int r3 = r1.A
            goto L95
        L93:
            r3 = r17
        L95:
            if (r15 > r2) goto Laa
            r6 = r15
        L98:
            r9 = r5[r6]
            if (r9 == 0) goto L9f
            int r10 = r9.A
            goto La1
        L9f:
            r10 = r17
        La1:
            if (r3 >= r10) goto La5
            r1 = r9
            r3 = r10
        La5:
            if (r6 == r2) goto Laa
            int r6 = r6 + 1
            goto L98
        Laa:
            if (r1 == 0) goto Laf
            int r1 = r1.A
            goto Lb1
        Laf:
            r1 = r17
        Lb1:
            boolean r2 = r21.a0()
            if (r2 == 0) goto Lbb
            long r2 = r7 & r18
            int r9 = (int) r2
            goto Le6
        Lbb:
            if (r4 != 0) goto Lbe
            goto Ldf
        Lbe:
            r14 = r5[r17]
            int r4 = r4 - r15
            if (r4 != 0) goto Lc4
            goto Ldf
        Lc4:
            if (r14 == 0) goto Lc9
            int r2 = r14.B
            goto Lcb
        Lc9:
            r2 = r17
        Lcb:
            if (r15 > r4) goto Ldf
        Lcd:
            r3 = r5[r15]
            if (r3 == 0) goto Ld4
            int r6 = r3.B
            goto Ld6
        Ld4:
            r6 = r17
        Ld6:
            if (r2 >= r6) goto Lda
            r14 = r3
            r2 = r6
        Lda:
            if (r15 == r4) goto Ldf
            int r15 = r15 + 1
            goto Lcd
        Ldf:
            if (r14 == 0) goto Le4
            int r9 = r14.B
            goto Le6
        Le4:
            r9 = r17
        Le6:
            boolean r2 = r21.a0()
            if (r2 != 0) goto Lfe
            long r2 = (long) r1
            long r2 = r2 << r13
            long r6 = (long) r9
            long r6 = r6 & r18
            long r2 = r2 | r6
            yn r4 = r0.a
            vs4 r4 = r4.c
            q93 r6 = new q93
            r6.<init>(r2)
            r4.setValue(r6)
        Lfe:
            qn r2 = new qn
            r2.<init>(r5, r0, r1, r9)
            zt1 r0 = defpackage.zt1.A
            r3 = r21
            f34 r0 = r3.K(r1, r9, r0, r2)
            return r0
    }

    @Override // defpackage.e34
    public final int e(defpackage.eb3 r5, java.util.List r6, int r7) {
            r4 = this;
            boolean r4 = r6.isEmpty()
            r5 = 0
            if (r4 == 0) goto L9
            r4 = 0
            goto L39
        L9:
            java.lang.Object r4 = r6.get(r5)
            x24 r4 = (defpackage.x24) r4
            int r4 = r4.n(r7)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            int r0 = r6.size()
            r1 = 1
            int r0 = r0 - r1
            if (r1 > r0) goto L39
        L1f:
            java.lang.Object r2 = r6.get(r1)
            x24 r2 = (defpackage.x24) r2
            int r2 = r2.n(r7)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r3 = r2.compareTo(r4)
            if (r3 <= 0) goto L34
            r4 = r2
        L34:
            if (r1 == r0) goto L39
            int r1 = r1 + 1
            goto L1f
        L39:
            if (r4 == 0) goto L40
            int r4 = r4.intValue()
            return r4
        L40:
            return r5
    }

    @Override // defpackage.e34
    public final int g(defpackage.eb3 r5, java.util.List r6, int r7) {
            r4 = this;
            boolean r4 = r6.isEmpty()
            r5 = 0
            if (r4 == 0) goto L9
            r4 = 0
            goto L39
        L9:
            java.lang.Object r4 = r6.get(r5)
            x24 r4 = (defpackage.x24) r4
            int r4 = r4.c(r7)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            int r0 = r6.size()
            r1 = 1
            int r0 = r0 - r1
            if (r1 > r0) goto L39
        L1f:
            java.lang.Object r2 = r6.get(r1)
            x24 r2 = (defpackage.x24) r2
            int r2 = r2.c(r7)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r3 = r2.compareTo(r4)
            if (r3 <= 0) goto L34
            r4 = r2
        L34:
            if (r1 == r0) goto L39
            int r1 = r1 + 1
            goto L1f
        L39:
            if (r4 == 0) goto L40
            int r4 = r4.intValue()
            return r4
        L40:
            return r5
    }

    @Override // defpackage.e34
    public final int i(defpackage.eb3 r5, java.util.List r6, int r7) {
            r4 = this;
            boolean r4 = r6.isEmpty()
            r5 = 0
            if (r4 == 0) goto L9
            r4 = 0
            goto L39
        L9:
            java.lang.Object r4 = r6.get(r5)
            x24 r4 = (defpackage.x24) r4
            int r4 = r4.V(r7)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            int r0 = r6.size()
            r1 = 1
            int r0 = r0 - r1
            if (r1 > r0) goto L39
        L1f:
            java.lang.Object r2 = r6.get(r1)
            x24 r2 = (defpackage.x24) r2
            int r2 = r2.V(r7)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r3 = r2.compareTo(r4)
            if (r3 <= 0) goto L34
            r4 = r2
        L34:
            if (r1 == r0) goto L39
            int r1 = r1 + 1
            goto L1f
        L39:
            if (r4 == 0) goto L40
            int r4 = r4.intValue()
            return r4
        L40:
            return r5
    }
}
