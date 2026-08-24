package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: s96  reason: default package */
/* loaded from: classes.dex */
public final class s96 extends defpackage.da0 {
    public final transient byte[][] X;
    public final transient int[] Y;

    public s96(byte[][] r2, int[] r3) {
            r1 = this;
            da0 r0 = defpackage.da0.R
            byte[] r0 = r0.A
            r1.<init>(r0)
            r1.X = r2
            r1.Y = r3
            return
    }

    @Override // defpackage.da0
    public final java.lang.String a() {
            r0 = this;
            r0 = 0
            throw r0
    }

    @Override // defpackage.da0
    public final defpackage.da0 c(java.lang.String r8) {
            r7 = this;
            java.security.MessageDigest r8 = java.security.MessageDigest.getInstance(r8)
            byte[][] r0 = r7.X
            int r1 = r0.length
            r2 = 0
            r3 = r2
        L9:
            if (r2 >= r1) goto L1e
            int r4 = r1 + r2
            int[] r5 = r7.Y
            r4 = r5[r4]
            r5 = r5[r2]
            r6 = r0[r2]
            int r3 = r5 - r3
            r8.update(r6, r4, r3)
            int r2 = r2 + 1
            r3 = r5
            goto L9
        L1e:
            byte[] r7 = r8.digest()
            da0 r8 = new da0
            r7.getClass()
            r8.<init>(r7)
            return r8
    }

    @Override // defpackage.da0
    public final int d() {
            r1 = this;
            byte[][] r0 = r1.X
            int r0 = r0.length
            int r0 = r0 + (-1)
            int[] r1 = r1.Y
            r1 = r1[r0]
            return r1
    }

    @Override // defpackage.da0
    public final java.lang.String e() {
            r0 = this;
            da0 r0 = r0.u()
            java.lang.String r0 = r0.e()
            return r0
    }

    @Override // defpackage.da0
    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            if (r4 != r3) goto L3
            goto L1e
        L3:
            boolean r0 = r4 instanceof defpackage.da0
            r1 = 0
            if (r0 == 0) goto L20
            da0 r4 = (defpackage.da0) r4
            int r0 = r4.d()
            int r2 = r3.d()
            if (r0 != r2) goto L20
            int r0 = r3.d()
            boolean r3 = r3.l(r1, r4, r0)
            if (r3 == 0) goto L20
        L1e:
            r3 = 1
            return r3
        L20:
            return r1
    }

    @Override // defpackage.da0
    public final int f(byte[] r1, int r2) {
            r0 = this;
            r1.getClass()
            da0 r0 = r0.u()
            int r0 = r0.f(r1, r2)
            return r0
    }

    @Override // defpackage.da0
    public final byte[] h() {
            r0 = this;
            byte[] r0 = r0.r()
            return r0
    }

    @Override // defpackage.da0
    public final int hashCode() {
            r9 = this;
            int r0 = r9.B
            if (r0 == 0) goto L5
            return r0
        L5:
            byte[][] r0 = r9.X
            int r1 = r0.length
            r2 = 0
            r3 = 1
            r4 = r3
            r3 = r2
        Lc:
            if (r2 >= r1) goto L29
            int r5 = r1 + r2
            int[] r6 = r9.Y
            r5 = r6[r5]
            r6 = r6[r2]
            r7 = r0[r2]
            int r3 = r6 - r3
            int r3 = r3 + r5
        L1b:
            if (r5 >= r3) goto L25
            int r4 = r4 * 31
            r8 = r7[r5]
            int r4 = r4 + r8
            int r5 = r5 + 1
            goto L1b
        L25:
            int r2 = r2 + 1
            r3 = r6
            goto Lc
        L29:
            r9.B = r4
            return r4
    }

    @Override // defpackage.da0
    public final byte i(int r10) {
            r9 = this;
            byte[][] r0 = r9.X
            int r1 = r0.length
            int r1 = r1 + (-1)
            int[] r2 = r9.Y
            r1 = r2[r1]
            long r3 = (long) r1
            long r5 = (long) r10
            r7 = 1
            defpackage.hf.D(r3, r5, r7)
            int r9 = defpackage.n16.K(r9, r10)
            if (r9 != 0) goto L18
            r1 = 0
            goto L1c
        L18:
            int r1 = r9 + (-1)
            r1 = r2[r1]
        L1c:
            int r3 = r0.length
            int r3 = r3 + r9
            r2 = r2[r3]
            r9 = r0[r9]
            int r10 = r10 - r1
            int r10 = r10 + r2
            r9 = r9[r10]
            return r9
    }

    @Override // defpackage.da0
    public final int j(byte[] r1) {
            r0 = this;
            r1.getClass()
            da0 r0 = r0.u()
            int r0 = r0.j(r1)
            return r0
    }

    @Override // defpackage.da0
    public final boolean l(int r9, defpackage.da0 r10, int r11) {
            r8 = this;
            r10.getClass()
            r0 = 0
            if (r9 < 0) goto L42
            int r1 = r8.d()
            int r1 = r1 - r11
            if (r9 <= r1) goto Le
            goto L42
        Le:
            int r11 = r11 + r9
            int r1 = defpackage.n16.K(r8, r9)
            r2 = r0
        L14:
            if (r9 >= r11) goto L40
            int[] r3 = r8.Y
            if (r1 != 0) goto L1c
            r4 = r0
            goto L20
        L1c:
            int r4 = r1 + (-1)
            r4 = r3[r4]
        L20:
            r5 = r3[r1]
            int r5 = r5 - r4
            byte[][] r6 = r8.X
            int r7 = r6.length
            int r7 = r7 + r1
            r3 = r3[r7]
            int r5 = r5 + r4
            int r5 = java.lang.Math.min(r11, r5)
            int r5 = r5 - r9
            int r4 = r9 - r4
            int r4 = r4 + r3
            r3 = r6[r1]
            boolean r3 = r10.m(r2, r3, r4, r5)
            if (r3 != 0) goto L3b
            goto L42
        L3b:
            int r2 = r2 + r5
            int r9 = r9 + r5
            int r1 = r1 + 1
            goto L14
        L40:
            r8 = 1
            return r8
        L42:
            return r0
    }

    @Override // defpackage.da0
    public final boolean m(int r8, byte[] r9, int r10, int r11) {
            r7 = this;
            r9.getClass()
            r0 = 0
            if (r8 < 0) goto L47
            int r1 = r7.d()
            int r1 = r1 - r11
            if (r8 > r1) goto L47
            if (r10 < 0) goto L47
            int r1 = r9.length
            int r1 = r1 - r11
            if (r10 <= r1) goto L14
            goto L47
        L14:
            int r11 = r11 + r8
            int r1 = defpackage.n16.K(r7, r8)
        L19:
            if (r8 >= r11) goto L45
            int[] r2 = r7.Y
            if (r1 != 0) goto L21
            r3 = r0
            goto L25
        L21:
            int r3 = r1 + (-1)
            r3 = r2[r3]
        L25:
            r4 = r2[r1]
            int r4 = r4 - r3
            byte[][] r5 = r7.X
            int r6 = r5.length
            int r6 = r6 + r1
            r2 = r2[r6]
            int r4 = r4 + r3
            int r4 = java.lang.Math.min(r11, r4)
            int r4 = r4 - r8
            int r3 = r8 - r3
            int r3 = r3 + r2
            r2 = r5[r1]
            boolean r2 = defpackage.hf.x(r3, r10, r4, r2, r9)
            if (r2 != 0) goto L40
            return r0
        L40:
            int r10 = r10 + r4
            int r8 = r8 + r4
            int r1 = r1 + 1
            goto L19
        L45:
            r7 = 1
            return r7
        L47:
            return r0
    }

    @Override // defpackage.da0
    public final java.lang.String n(java.nio.charset.Charset r1) {
            r0 = this;
            r1.getClass()
            da0 r0 = r0.u()
            java.lang.String r0 = r0.n(r1)
            return r0
    }

    @Override // defpackage.da0
    public final defpackage.da0 o(int r11, int r12) {
            r10 = this;
            r0 = -1234567890(0xffffffffb669fd2e, float:-3.4867076E-6)
            if (r12 != r0) goto L9
            int r12 = r10.d()
        L9:
            r0 = 0
            if (r11 < 0) goto L9d
            int r1 = r10.d()
            java.lang.String r2 = "endIndex="
            if (r12 > r1) goto L7d
            int r1 = r12 - r11
            if (r1 < 0) goto L73
            if (r11 != 0) goto L21
            int r0 = r10.d()
            if (r12 != r0) goto L21
            return r10
        L21:
            if (r11 != r12) goto L26
            da0 r10 = defpackage.da0.R
            return r10
        L26:
            int r0 = defpackage.n16.K(r10, r11)
            int r12 = r12 + (-1)
            int r12 = defpackage.n16.K(r10, r12)
            int r2 = r12 + 1
            byte[][] r3 = r10.X
            java.lang.Object[] r2 = defpackage.fv.y0(r3, r0, r2)
            byte[][] r2 = (byte[][]) r2
            int r4 = r2.length
            int r4 = r4 * 2
            int[] r4 = new int[r4]
            r5 = 0
            int[] r10 = r10.Y
            if (r0 > r12) goto L5f
            r7 = r0
            r6 = r5
        L46:
            r8 = r10[r7]
            int r8 = r8 - r11
            int r8 = java.lang.Math.min(r8, r1)
            r4[r6] = r8
            int r8 = r6 + 1
            int r9 = r2.length
            int r6 = r6 + r9
            int r9 = r3.length
            int r9 = r9 + r7
            r9 = r10[r9]
            r4[r6] = r9
            if (r7 == r12) goto L5f
            int r7 = r7 + 1
            r6 = r8
            goto L46
        L5f:
            if (r0 != 0) goto L62
            goto L66
        L62:
            int r0 = r0 + (-1)
            r5 = r10[r0]
        L66:
            int r10 = r2.length
            r12 = r4[r10]
            int r11 = r11 - r5
            int r11 = r11 + r12
            r4[r10] = r11
            s96 r10 = new s96
            r10.<init>(r2, r4)
            return r10
        L73:
            java.lang.String r10 = " < beginIndex="
            java.lang.String r10 = defpackage.lb1.j(r2, r12, r11, r10)
            defpackage.i.f(r10)
            return r0
        L7d:
            java.lang.String r11 = " > length("
            java.lang.StringBuilder r11 = defpackage.xg6.t(r2, r12, r11)
            int r10 = r10.d()
            r11.append(r10)
            r10 = 41
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r10 = r10.toString()
            r11.<init>(r10)
            throw r11
        L9d:
            java.lang.String r10 = "beginIndex="
            java.lang.String r12 = " < 0"
            java.lang.String r10 = defpackage.lb1.k(r10, r11, r12)
            defpackage.i.f(r10)
            return r0
    }

    @Override // defpackage.da0
    public final defpackage.da0 q() {
            r0 = this;
            da0 r0 = r0.u()
            da0 r0 = r0.q()
            return r0
    }

    @Override // defpackage.da0
    public final byte[] r() {
            r10 = this;
            int r0 = r10.d()
            byte[] r0 = new byte[r0]
            byte[][] r1 = r10.X
            int r2 = r1.length
            r3 = 0
            r4 = r3
            r5 = r4
        Lc:
            if (r3 >= r2) goto L24
            int r6 = r2 + r3
            int[] r7 = r10.Y
            r6 = r7[r6]
            r7 = r7[r3]
            r8 = r1[r3]
            int r4 = r7 - r4
            int r9 = r6 + r4
            defpackage.fv.q0(r5, r6, r9, r8, r0)
            int r5 = r5 + r4
            int r3 = r3 + 1
            r4 = r7
            goto Lc
        L24:
            return r0
    }

    @Override // defpackage.da0
    public final void t(defpackage.k80 r14, int r15) {
            r13 = this;
            r0 = 0
            int r1 = defpackage.n16.K(r13, r0)
            r2 = r0
        L6:
            if (r2 >= r15) goto L47
            int[] r3 = r13.Y
            if (r1 != 0) goto Le
            r4 = r0
            goto L12
        Le:
            int r4 = r1 + (-1)
            r4 = r3[r4]
        L12:
            r5 = r3[r1]
            int r5 = r5 - r4
            byte[][] r6 = r13.X
            int r7 = r6.length
            int r7 = r7 + r1
            r3 = r3[r7]
            int r5 = r5 + r4
            int r5 = java.lang.Math.min(r15, r5)
            int r5 = r5 - r2
            int r4 = r2 - r4
            int r9 = r4 + r3
            r8 = r6[r1]
            o96 r7 = new o96
            int r10 = r9 + r5
            r11 = 1
            r12 = 0
            r7.<init>(r8, r9, r10, r11, r12)
            o96 r3 = r14.A
            if (r3 != 0) goto L3b
            r7.g = r7
            r7.f = r7
            r14.A = r7
            goto L43
        L3b:
            o96 r3 = r3.g
            r3.getClass()
            r3.b(r7)
        L43:
            int r2 = r2 + r5
            int r1 = r1 + 1
            goto L6
        L47:
            long r0 = r14.B
            long r2 = (long) r15
            long r0 = r0 + r2
            r14.B = r0
            return
    }

    @Override // defpackage.da0
    public final java.lang.String toString() {
            r0 = this;
            da0 r0 = r0.u()
            java.lang.String r0 = r0.toString()
            return r0
    }

    public final defpackage.da0 u() {
            r1 = this;
            da0 r0 = new da0
            byte[] r1 = r1.r()
            r0.<init>(r1)
            return r0
    }
}
