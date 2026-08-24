package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ns6  reason: default package */
/* loaded from: classes.dex */
public class ns6 extends defpackage.u0 {
    public final java.lang.String Z;

    public ns6(java.lang.String r1, defpackage.td3 r2) {
            r0 = this;
            r1.getClass()
            r0.<init>(r2)
            r0.Z = r1
            return
    }

    @Override // defpackage.u0
    public boolean d() {
            r4 = this;
            int r0 = r4.B
            r1 = -1
            r2 = 0
            if (r0 != r1) goto L7
            return r2
        L7:
            java.lang.String r1 = r4.Z
            int r3 = r1.length()
            if (r0 >= r3) goto L2e
            char r1 = r1.charAt(r0)
            r3 = 32
            if (r1 == r3) goto L2b
            r3 = 10
            if (r1 == r3) goto L2b
            r3 = 13
            if (r1 == r3) goto L2b
            r3 = 9
            if (r1 != r3) goto L24
            goto L2b
        L24:
            r4.B = r0
            boolean r4 = defpackage.u0.t(r1)
            return r4
        L2b:
            int r0 = r0 + 1
            goto L7
        L2e:
            r4.B = r0
            return r2
    }

    @Override // defpackage.u0
    public final java.lang.String f() {
            r6 = this;
            r0 = 34
            r6.i(r0)
            int r1 = r6.B
            r2 = 4
            java.lang.String r3 = r6.Z
            int r0 = defpackage.qs6.s0(r0, r1, r2, r3)
            r4 = -1
            if (r0 != r4) goto L37
            r6.m()
            int r0 = r6.B
            int r1 = r3.length()
            if (r0 == r1) goto L28
            if (r0 >= 0) goto L1f
            goto L28
        L1f:
            char r1 = r3.charAt(r0)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            goto L2a
        L28:
            java.lang.String r1 = "EOF"
        L2a:
            java.lang.String r3 = "Expected quotation mark '\"', but had '"
            java.lang.String r4 = "' instead"
            java.lang.String r1 = defpackage.lb1.A(r3, r1, r4)
            r3 = 0
            defpackage.u0.q(r6, r1, r0, r3, r2)
            throw r3
        L37:
            r2 = r1
        L38:
            if (r2 >= r0) goto L4c
            char r4 = r3.charAt(r2)
            r5 = 92
            if (r4 != r5) goto L49
            int r0 = r6.B
            java.lang.String r6 = r6.l(r3, r0, r2)
            return r6
        L49:
            int r2 = r2 + 1
            goto L38
        L4c:
            int r2 = r0 + 1
            r6.B = r2
            java.lang.String r6 = r3.substring(r1, r0)
            return r6
    }

    @Override // defpackage.u0
    public byte g() {
            r4 = this;
            int r0 = r4.B
        L2:
            r1 = -1
            r2 = 10
            java.lang.String r3 = r4.Z
            if (r0 == r1) goto L2d
            int r1 = r3.length()
            if (r0 >= r1) goto L2d
            int r1 = r0 + 1
            char r0 = r3.charAt(r0)
            r3 = 32
            if (r0 == r3) goto L2b
            if (r0 == r2) goto L2b
            r2 = 13
            if (r0 == r2) goto L2b
            r2 = 9
            if (r0 != r2) goto L24
            goto L2b
        L24:
            r4.B = r1
            byte r4 = defpackage.l.n(r0)
            return r4
        L2b:
            r0 = r1
            goto L2
        L2d:
            int r0 = r3.length()
            r4.B = r0
            return r2
    }

    @Override // defpackage.u0
    public void i(char r6) {
            r5 = this;
            int r0 = r5.B
            r1 = 0
            r2 = -1
            if (r0 == r2) goto L36
        L6:
            java.lang.String r3 = r5.Z
            int r4 = r3.length()
            if (r0 >= r4) goto L30
            int r4 = r0 + 1
            char r0 = r3.charAt(r0)
            r3 = 32
            if (r0 == r3) goto L2e
            r3 = 10
            if (r0 == r3) goto L2e
            r3 = 13
            if (r0 == r3) goto L2e
            r3 = 9
            if (r0 != r3) goto L25
            goto L2e
        L25:
            r5.B = r4
            if (r0 != r6) goto L2a
            return
        L2a:
            r5.B(r6)
            throw r1
        L2e:
            r0 = r4
            goto L6
        L30:
            r5.B = r2
            r5.B(r6)
            throw r1
        L36:
            r5.B(r6)
            throw r1
    }

    @Override // defpackage.u0
    public final java.lang.CharSequence s() {
            r0 = this;
            java.lang.String r0 = r0.Z
            return r0
    }

    @Override // defpackage.u0
    public final java.lang.String u(java.lang.String r5) {
            r4 = this;
            r5.getClass()
            int r0 = r4.B
            r1 = 0
            byte r2 = r4.g()     // Catch: java.lang.Throwable -> L30
            r3 = 6
            if (r2 == r3) goto L12
        Ld:
            r4.B = r0
            r4.X = r1
            return r1
        L12:
            java.lang.String r2 = r4.w()     // Catch: java.lang.Throwable -> L30
            boolean r5 = defpackage.nb3.k(r2, r5)     // Catch: java.lang.Throwable -> L30
            if (r5 != 0) goto L1d
            goto Ld
        L1d:
            r4.X = r1     // Catch: java.lang.Throwable -> L30
            byte r5 = r4.g()     // Catch: java.lang.Throwable -> L30
            r2 = 5
            if (r5 == r2) goto L27
            goto Ld
        L27:
            java.lang.String r5 = r4.w()     // Catch: java.lang.Throwable -> L30
            r4.B = r0
            r4.X = r1
            return r5
        L30:
            r5 = move-exception
            r4.B = r0
            r4.X = r1
            throw r5
    }

    @Override // defpackage.u0
    public final int x(int r1) {
            r0 = this;
            java.lang.String r0 = r0.Z
            int r0 = r0.length()
            if (r1 >= r0) goto L9
            return r1
        L9:
            r0 = -1
            return r0
    }

    @Override // defpackage.u0
    public int y() {
            r3 = this;
            int r0 = r3.B
            r1 = -1
            if (r0 != r1) goto L6
            return r0
        L6:
            java.lang.String r1 = r3.Z
            int r2 = r1.length()
            if (r0 >= r2) goto L25
            char r1 = r1.charAt(r0)
            r2 = 32
            if (r1 == r2) goto L22
            r2 = 10
            if (r1 == r2) goto L22
            r2 = 13
            if (r1 == r2) goto L22
            r2 = 9
            if (r1 != r2) goto L25
        L22:
            int r0 = r0 + 1
            goto L6
        L25:
            r3.B = r0
            return r0
    }
}
