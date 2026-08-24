package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sx0  reason: default package */
/* loaded from: classes.dex */
public final class sx0 extends defpackage.g60 {
    public final boolean L;

    public sx0(defpackage.ja3 r1, boolean r2) {
            r0 = this;
            r0.<init>(r1)
            r0.L = r2
            return
    }

    @Override // defpackage.g60
    public final void g(byte r2) {
            r1 = this;
            boolean r0 = r1.L
            if (r0 == 0) goto Le
            r2 = r2 & 255(0xff, float:3.57E-43)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r1.l(r2)
            return
        Le:
            r2 = r2 & 255(0xff, float:3.57E-43)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r2.getClass()
            java.lang.Object r1 = r1.B
            ja3 r1 = (defpackage.ja3) r1
            r1.f(r2)
            return
    }

    @Override // defpackage.g60
    public final void i(int r7) {
            r6 = this;
            boolean r0 = r6.L
            r1 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r3 = 10
            if (r0 == 0) goto L16
            long r4 = (long) r7
            long r0 = r4 & r1
            java.lang.String r7 = java.lang.Long.toString(r0, r3)
            r6.l(r7)
            return
        L16:
            long r4 = (long) r7
            long r0 = r4 & r1
            java.lang.String r7 = java.lang.Long.toString(r0, r3)
            r7.getClass()
            java.lang.Object r6 = r6.B
            ja3 r6 = (defpackage.ja3) r6
            r6.f(r7)
            return
    }

    @Override // defpackage.g60
    public final void j(long r13) {
            r12 = this;
            boolean r0 = r12.L
            r1 = 63
            r2 = 10
            r4 = 5
            r6 = 64
            java.lang.String r7 = "0"
            r8 = 0
            r10 = 1
            r11 = 10
            if (r0 == 0) goto L4a
            int r0 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r0 != 0) goto L18
            goto L46
        L18:
            if (r0 <= 0) goto L1f
            java.lang.String r7 = java.lang.Long.toString(r13, r11)
            goto L46
        L1f:
            char[] r0 = new char[r6]
            long r6 = r13 >>> r10
            long r6 = r6 / r4
            long r4 = r6 * r2
            long r13 = r13 - r4
            int r13 = (int) r13
            char r13 = java.lang.Character.forDigit(r13, r11)
            r0[r1] = r13
        L2e:
            int r13 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r13 <= 0) goto L3f
            int r1 = r1 + (-1)
            long r13 = r6 % r2
            int r13 = (int) r13
            char r13 = java.lang.Character.forDigit(r13, r11)
            r0[r1] = r13
            long r6 = r6 / r2
            goto L2e
        L3f:
            java.lang.String r7 = new java.lang.String
            int r13 = 64 - r1
            r7.<init>(r0, r1, r13)
        L46:
            r12.l(r7)
            return
        L4a:
            int r0 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r0 != 0) goto L4f
            goto L7d
        L4f:
            if (r0 <= 0) goto L56
            java.lang.String r7 = java.lang.Long.toString(r13, r11)
            goto L7d
        L56:
            char[] r0 = new char[r6]
            long r6 = r13 >>> r10
            long r6 = r6 / r4
            long r4 = r6 * r2
            long r13 = r13 - r4
            int r13 = (int) r13
            char r13 = java.lang.Character.forDigit(r13, r11)
            r0[r1] = r13
        L65:
            int r13 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r13 <= 0) goto L76
            int r1 = r1 + (-1)
            long r13 = r6 % r2
            int r13 = (int) r13
            char r13 = java.lang.Character.forDigit(r13, r11)
            r0[r1] = r13
            long r6 = r6 / r2
            goto L65
        L76:
            java.lang.String r7 = new java.lang.String
            int r13 = 64 - r1
            r7.<init>(r0, r1, r13)
        L7d:
            r7.getClass()
            java.lang.Object r12 = r12.B
            ja3 r12 = (defpackage.ja3) r12
            r12.f(r7)
            return
    }

    @Override // defpackage.g60
    public final void k(short r3) {
            r2 = this;
            boolean r0 = r2.L
            r1 = 65535(0xffff, float:9.1834E-41)
            if (r0 == 0) goto L10
            r3 = r3 & r1
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r2.l(r3)
            return
        L10:
            r3 = r3 & r1
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r3.getClass()
            java.lang.Object r2 = r2.B
            ja3 r2 = (defpackage.ja3) r2
            r2.f(r3)
            return
    }
}
