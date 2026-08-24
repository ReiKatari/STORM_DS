package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: s83  reason: default package */
/* loaded from: classes.dex */
public final class s83 implements java.lang.Comparable, java.io.Serializable {
    public static final defpackage.s83 L = null;
    public static final defpackage.s83 R = null;
    public final long A;
    public final int B;

    static {
            s83 r0 = new s83
            r1 = -31557014167219200(0xff8fe31014641400, double:-2.7989734602046733E306)
            r3 = 0
            r0.<init>(r3, r1)
            defpackage.s83.L = r0
            s83 r0 = new s83
            r1 = 31556889864403199(0x701cd2fa9578ff, double:1.434068493154717E-306)
            r3 = 999999999(0x3b9ac9ff, float:0.004723787)
            r0.<init>(r3, r1)
            defpackage.s83.R = r0
            return
    }

    public s83(int r1, long r2) {
            r0 = this;
            r0.<init>()
            r0.A = r2
            r0.B = r1
            r0 = -31557014167219200(0xff8fe31014641400, double:-2.7989734602046733E306)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L1a
            r0 = 31556889864403200(0x701cd2fa957900, double:1.4340684931547173E-306)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 >= 0) goto L1a
            return
        L1a:
            java.lang.String r0 = "Instant exceeds minimum or maximum instant"
            defpackage.i.h(r0)
            r0 = 0
            throw r0
    }

    public final long a(defpackage.s83 r5) {
            r4 = this;
            r5.getClass()
            jd1 r0 = defpackage.oq1.B
            long r0 = r4.A
            long r2 = r5.A
            long r0 = r0 - r2
            uq1 r2 = defpackage.uq1.SECONDS
            long r0 = defpackage.n16.M(r0, r2)
            int r4 = r4.B
            int r5 = r5.B
            int r4 = r4 - r5
            uq1 r5 = defpackage.uq1.NANOSECONDS
            long r4 = defpackage.n16.L(r4, r5)
            long r4 = defpackage.oq1.j(r0, r4)
            return r4
    }

    public final long b() {
            r12 = this;
            long r0 = r12.A
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r5 = 1000000(0xf4240, float:1.401298E-39)
            int r12 = r12.B
            r6 = 1000(0x3e8, double:4.94E-321)
            r8 = 1
            if (r4 < 0) goto L3c
            int r4 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r4 != 0) goto L1b
            goto L2b
        L1b:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L2a
            long r10 = r0 * r6
            long r6 = r10 / r6
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 != 0) goto L29
            r6 = r10
            goto L2b
        L29:
            return r8
        L2a:
            r6 = r2
        L2b:
            int r12 = r12 / r5
            long r0 = (long) r12
            long r4 = r6 + r0
            long r10 = r6 ^ r4
            int r12 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r12 >= 0) goto L3b
            long r0 = r0 ^ r6
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 < 0) goto L3b
            return r8
        L3b:
            return r4
        L3c:
            long r0 = r0 + r8
            int r4 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            r8 = -9223372036854775808
            if (r4 != 0) goto L44
            goto L54
        L44:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L53
            long r10 = r0 * r6
            long r6 = r10 / r6
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 != 0) goto L52
            r6 = r10
            goto L54
        L52:
            return r8
        L53:
            r6 = r2
        L54:
            int r12 = r12 / r5
            int r12 = r12 + (-1000)
            long r0 = (long) r12
            long r4 = r6 + r0
            long r10 = r6 ^ r4
            int r12 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r12 >= 0) goto L66
            long r0 = r0 ^ r6
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 < 0) goto L66
            return r8
        L66:
            return r4
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object r5) {
            r4 = this;
            s83 r5 = (defpackage.s83) r5
            r5.getClass()
            long r0 = r4.A
            long r2 = r5.A
            int r0 = defpackage.nb3.q(r0, r2)
            if (r0 == 0) goto L10
            return r0
        L10:
            int r4 = r4.B
            int r5 = r5.B
            int r4 = defpackage.nb3.p(r4, r5)
            return r4
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 == r5) goto L19
            boolean r0 = r5 instanceof defpackage.s83
            if (r0 == 0) goto L17
            s83 r5 = (defpackage.s83) r5
            long r0 = r5.A
            long r2 = r4.A
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto L17
            int r4 = r4.B
            int r5 = r5.B
            if (r4 != r5) goto L17
            goto L19
        L17:
            r4 = 0
            return r4
        L19:
            r4 = 1
            return r4
    }

    public final int hashCode() {
            r2 = this;
            long r0 = r2.A
            int r0 = java.lang.Long.hashCode(r0)
            int r2 = r2.B
            int r2 = r2 * 51
            int r2 = r2 + r0
            return r2
    }

    public final java.lang.String toString() {
            r26 = this;
            r0 = r26
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            long r2 = r0.A
            r4 = 86400(0x15180, double:4.26873E-319)
            long r6 = r2 / r4
            long r8 = r2 ^ r4
            r10 = 0
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            r12 = -1
            if (r8 >= 0) goto L1f
            long r8 = r6 * r4
            int r8 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r8 == 0) goto L1f
            long r6 = r6 + r12
        L1f:
            long r2 = r2 % r4
            long r8 = r2 ^ r4
            long r14 = -r2
            long r14 = r14 | r2
            long r8 = r8 & r14
            r14 = 63
            long r8 = r8 >> r14
            long r4 = r4 & r8
            long r2 = r2 + r4
            int r2 = (int) r2
            r3 = 719468(0xafa6c, double:3.554644E-318)
            long r3 = r3 + r6
            int r5 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            r8 = 400(0x190, double:1.976E-321)
            r14 = 146097(0x23ab1, double:7.21815E-319)
            if (r5 >= 0) goto L48
            r16 = 719469(0xafa6d, double:3.55465E-318)
            long r6 = r6 + r16
            long r6 = r6 / r14
            r16 = 1
            long r6 = r6 - r16
            long r16 = r6 * r8
            long r5 = -r6
            long r5 = r5 * r14
            long r3 = r3 + r5
            goto L4a
        L48:
            r16 = r10
        L4a:
            long r5 = r8 * r3
            r18 = 591(0x24f, double:2.92E-321)
            long r5 = r5 + r18
            long r5 = r5 / r14
            r14 = 365(0x16d, double:1.803E-321)
            long r18 = r14 * r5
            r20 = 4
            long r22 = r5 / r20
            long r22 = r22 + r18
            r18 = 100
            long r24 = r5 / r18
            long r22 = r22 - r24
            long r24 = r5 / r8
            long r24 = r24 + r22
            long r22 = r3 - r24
            int r7 = (r22 > r10 ? 1 : (r22 == r10 ? 0 : -1))
            if (r7 >= 0) goto L78
            long r5 = r5 + r12
            long r14 = r14 * r5
            long r10 = r5 / r20
            long r10 = r10 + r14
            long r12 = r5 / r18
            long r10 = r10 - r12
            long r7 = r5 / r8
            long r7 = r7 + r10
            long r22 = r3 - r7
        L78:
            r3 = r22
            long r5 = r5 + r16
            int r3 = (int) r3
            int r4 = r3 * 5
            int r4 = r4 + 2
            int r4 = r4 / 153
            int r7 = r4 + 2
            int r7 = r7 % 12
            r8 = 1
            int r7 = r7 + r8
            int r9 = r4 * 306
            int r9 = r9 + 5
            int r9 = r9 / 10
            int r3 = r3 - r9
            int r3 = r3 + r8
            int r4 = r4 / 10
            long r9 = (long) r4
            long r5 = r5 + r9
            int r4 = (int) r5
            int r5 = r2 / 3600
            int r6 = r5 * 3600
            int r2 = r2 - r6
            int r6 = r2 / 60
            int r9 = r6 * 60
            int r2 = r2 - r9
            int r9 = java.lang.Math.abs(r4)
            r10 = 1000(0x3e8, float:1.401E-42)
            r11 = 0
            r12 = 10000(0x2710, float:1.4013E-41)
            if (r9 >= r10) goto Lcd
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            if (r4 < 0) goto Lbe
            int r4 = r4 + r12
            r9.append(r4)
            java.lang.StringBuilder r4 = r9.deleteCharAt(r11)
            r4.getClass()
            goto Lc9
        Lbe:
            int r4 = r4 - r12
            r9.append(r4)
            java.lang.StringBuilder r4 = r9.deleteCharAt(r8)
            r4.getClass()
        Lc9:
            r1.append(r9)
            goto Ld7
        Lcd:
            if (r4 < r12) goto Ld4
            r9 = 43
            r1.append(r9)
        Ld4:
            r1.append(r4)
        Ld7:
            r4 = 45
            r1.append(r4)
            defpackage.nb3.u(r1, r1, r7)
            r1.append(r4)
            defpackage.nb3.u(r1, r1, r3)
            r3 = 84
            r1.append(r3)
            defpackage.nb3.u(r1, r1, r5)
            r3 = 58
            r1.append(r3)
            defpackage.nb3.u(r1, r1, r6)
            r1.append(r3)
            defpackage.nb3.u(r1, r1, r2)
            int r0 = r0.B
            if (r0 == 0) goto L129
            r2 = 46
            r1.append(r2)
        L104:
            int[] r2 = defpackage.nb3.m
            int r3 = r11 + 1
            r4 = r2[r3]
            int r4 = r0 % r4
            if (r4 != 0) goto L110
            r11 = r3
            goto L104
        L110:
            int r3 = r11 % 3
            int r11 = r11 - r3
            r3 = r2[r11]
            int r0 = r0 / r3
            int r3 = 9 - r11
            r2 = r2[r3]
            int r0 = r0 + r2
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r0.getClass()
            java.lang.String r0 = r0.substring(r8)
            r1.append(r0)
        L129:
            r0 = 90
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }
}
