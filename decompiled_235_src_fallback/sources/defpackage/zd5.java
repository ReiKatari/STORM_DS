package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zd5  reason: default package */
/* loaded from: classes.dex */
public class zd5 extends defpackage.u0 {
    public final defpackage.s63 Z;
    public final char[] d0;
    public int e0;
    public final defpackage.lu f0;

    public zd5(defpackage.s63 r1, char[] r2, defpackage.td3 r3) {
            r0 = this;
            r0.<init>(r3)
            r0.Z = r1
            r0.d0 = r2
            r1 = 128(0x80, float:1.8E-43)
            r0.e0 = r1
            lu r1 = new lu
            r1.<init>(r2)
            r0.f0 = r1
            r1 = 0
            r0.C(r1)
            return
    }

    public final void C(int r7) {
            r6 = this;
            lu r0 = r6.f0
            char[] r1 = r0.A
            r2 = 0
            if (r7 == 0) goto Lf
            int r3 = r6.B
            int r4 = r3 + r7
            int r4 = r4 - r3
            java.lang.System.arraycopy(r1, r3, r1, r2, r4)
        Lf:
            int r3 = r0.B
        L11:
            if (r7 == r3) goto L33
            int r4 = r3 - r7
            s63 r5 = r6.Z
            r5.getClass()
            java.lang.Object r5 = r5.B
            pm0 r5 = (defpackage.pm0) r5
            int r4 = r5.a(r1, r7, r4)
            r5 = -1
            if (r4 != r5) goto L31
            char[] r1 = r0.A
            int r1 = r1.length
            int r7 = java.lang.Math.min(r1, r7)
            r0.B = r7
            r6.e0 = r5
            goto L33
        L31:
            int r7 = r7 + r4
            goto L11
        L33:
            r6.B = r2
            return
    }

    public final void D() {
            r3 = this;
            km0 r0 = defpackage.km0.c
            r0.getClass()
            char[] r3 = r3.d0
            r3.getClass()
            int r1 = r3.length
            r2 = 16384(0x4000, float:2.2959E-41)
            if (r1 != r2) goto L13
            r0.b(r3)
            return
        L13:
            int r3 = r3.length
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Inconsistent internal invariant: unexpected array size "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
    }

    @Override // defpackage.u0
    public final void c(int r2, int r3) {
            r1 = this;
            java.lang.Object r0 = r1.Y
            java.lang.StringBuilder r0 = (java.lang.StringBuilder) r0
            lu r1 = r1.f0
            char[] r1 = r1.A
            int r3 = r3 - r2
            r0.append(r1, r2, r3)
            return
    }

    @Override // defpackage.u0
    public boolean d() {
            r3 = this;
            r3.n()
            int r0 = r3.B
        L5:
            int r0 = r3.x(r0)
            r1 = -1
            if (r0 == r1) goto L2d
            lu r1 = r3.f0
            char[] r1 = r1.A
            char r1 = r1[r0]
            r2 = 32
            if (r1 == r2) goto L2a
            r2 = 10
            if (r1 == r2) goto L2a
            r2 = 13
            if (r1 == r2) goto L2a
            r2 = 9
            if (r1 != r2) goto L23
            goto L2a
        L23:
            r3.B = r0
            boolean r3 = defpackage.u0.t(r1)
            return r3
        L2a:
            int r0 = r0 + 1
            goto L5
        L2d:
            r3.B = r0
            r3 = 0
            return r3
    }

    @Override // defpackage.u0
    public final java.lang.String f() {
            r8 = this;
            r0 = 34
            r8.i(r0)
            int r1 = r8.B
            lu r2 = r8.f0
            int r3 = r2.B
            char[] r4 = r2.A
            r5 = r1
        Le:
            r6 = -1
            if (r5 >= r3) goto L19
            char r7 = r4[r5]
            if (r7 != r0) goto L16
            goto L1a
        L16:
            int r5 = r5 + 1
            goto Le
        L19:
            r5 = r6
        L1a:
            if (r5 != r6) goto L4f
            int r0 = r8.x(r1)
            int r1 = r8.B
            if (r0 != r6) goto L4a
            if (r1 <= 0) goto L29
            int r0 = r1 + (-1)
            goto L2a
        L29:
            r0 = r1
        L2a:
            int r3 = r2.B
            if (r1 == r3) goto L3a
            if (r0 >= 0) goto L31
            goto L3a
        L31:
            char[] r1 = r2.A
            char r1 = r1[r0]
            java.lang.String r1 = java.lang.String.valueOf(r1)
            goto L3c
        L3a:
            java.lang.String r1 = "EOF"
        L3c:
            java.lang.String r2 = "Expected quotation mark '\"', but had '"
            java.lang.String r3 = "' instead"
            java.lang.String r1 = defpackage.lb1.A(r2, r1, r3)
            r2 = 4
            r3 = 0
            defpackage.u0.q(r8, r1, r0, r3, r2)
            throw r3
        L4a:
            java.lang.String r8 = r8.l(r2, r1, r0)
            return r8
        L4f:
            r0 = r1
        L50:
            if (r0 >= r5) goto L62
            char r3 = r4[r0]
            r6 = 92
            if (r3 != r6) goto L5f
            int r1 = r8.B
            java.lang.String r8 = r8.l(r2, r1, r0)
            return r8
        L5f:
            int r0 = r0 + 1
            goto L50
        L62:
            int r0 = r5 + 1
            r8.B = r0
            int r8 = r2.B
            int r8 = java.lang.Math.min(r5, r8)
            java.lang.String r8 = defpackage.xs6.V(r4, r1, r8)
            return r8
    }

    @Override // defpackage.u0
    public byte g() {
            r3 = this;
            r3.n()
            int r0 = r3.B
        L5:
            int r0 = r3.x(r0)
            r1 = -1
            if (r0 == r1) goto L20
            int r1 = r0 + 1
            lu r2 = r3.f0
            char[] r2 = r2.A
            char r0 = r2[r0]
            byte r0 = defpackage.l.n(r0)
            r2 = 3
            if (r0 == r2) goto L1e
            r3.B = r1
            return r0
        L1e:
            r0 = r1
            goto L5
        L20:
            r3.B = r0
            r3 = 10
            return r3
    }

    @Override // defpackage.u0
    public void i(char r5) {
            r4 = this;
            r4.n()
            int r0 = r4.B
        L5:
            int r0 = r4.x(r0)
            r1 = -1
            r2 = 0
            if (r0 == r1) goto L31
            int r1 = r0 + 1
            lu r3 = r4.f0
            char[] r3 = r3.A
            char r0 = r3[r0]
            r3 = 32
            if (r0 == r3) goto L2f
            r3 = 10
            if (r0 == r3) goto L2f
            r3 = 13
            if (r0 == r3) goto L2f
            r3 = 9
            if (r0 != r3) goto L26
            goto L2f
        L26:
            r4.B = r1
            if (r0 != r5) goto L2b
            return
        L2b:
            r4.B(r5)
            throw r2
        L2f:
            r0 = r1
            goto L5
        L31:
            r4.B = r0
            r4.B(r5)
            throw r2
    }

    @Override // defpackage.u0
    public final void n() {
            r2 = this;
            int r0 = r2.B
            lu r1 = r2.f0
            int r1 = r1.B
            int r1 = r1 - r0
            int r0 = r2.e0
            if (r1 <= r0) goto Lc
            return
        Lc:
            r2.C(r1)
            return
    }

    @Override // defpackage.u0
    public final java.lang.CharSequence s() {
            r0 = this;
            lu r0 = r0.f0
            return r0
    }

    @Override // defpackage.u0
    public final java.lang.String u(java.lang.String r1) {
            r0 = this;
            r1.getClass()
            r0 = 0
            return r0
    }

    @Override // defpackage.u0
    public final int x(int r3) {
            r2 = this;
            lu r0 = r2.f0
            int r1 = r0.B
            if (r3 >= r1) goto L7
            return r3
        L7:
            r2.B = r3
            r2.n()
            int r2 = r2.B
            if (r2 != 0) goto L19
            int r2 = r0.length()
            if (r2 != 0) goto L17
            goto L19
        L17:
            r2 = 0
            return r2
        L19:
            r2 = -1
            return r2
    }

    @Override // defpackage.u0
    public int y() {
            r3 = this;
            int r0 = r3.B
        L2:
            int r0 = r3.x(r0)
            r1 = -1
            if (r0 == r1) goto L22
            lu r1 = r3.f0
            char[] r1 = r1.A
            char r1 = r1[r0]
            r2 = 32
            if (r1 == r2) goto L1f
            r2 = 10
            if (r1 == r2) goto L1f
            r2 = 13
            if (r1 == r2) goto L1f
            r2 = 9
            if (r1 != r2) goto L22
        L1f:
            int r0 = r0 + 1
            goto L2
        L22:
            r3.B = r0
            return r0
    }

    @Override // defpackage.u0
    public final java.lang.String z(int r2, int r3) {
            r1 = this;
            lu r1 = r1.f0
            char[] r0 = r1.A
            int r1 = r1.B
            int r1 = java.lang.Math.min(r3, r1)
            java.lang.String r1 = defpackage.xs6.V(r0, r2, r1)
            return r1
    }
}
