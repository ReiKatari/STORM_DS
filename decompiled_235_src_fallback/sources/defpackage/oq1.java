package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: oq1  reason: default package */
/* loaded from: classes.dex */
public final class oq1 implements java.lang.Comparable {
    public static final defpackage.jd1 B = null;
    public static final long L = 0;
    public static final long R = 0;
    public static final long X = 0;
    public final long A;

    static {
            jd1 r0 = new jd1
            r1 = 1
            r0.<init>(r1)
            defpackage.oq1.B = r0
            r0 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            long r0 = defpackage.n16.u(r0)
            defpackage.oq1.L = r0
            r0 = -4611686018427387903(0xc000000000000001, double:-2.0000000000000004)
            long r0 = defpackage.n16.u(r0)
            defpackage.oq1.R = r0
            r0 = 9223372036854759646(0x7fffffffffffc0de, double:NaN)
            defpackage.oq1.X = r0
            return
    }

    public /* synthetic */ oq1(long r1) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            return
    }

    public static final long a(long r6, long r8) {
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r2 = r8 / r0
            long r6 = defpackage.n16.k(r6, r2)
            r4 = -4611686018426(0xfffffbce4217d286, double:NaN)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 > 0) goto L24
            r4 = 4611686018427(0x431bde82d7b, double:2.278475631111E-311)
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 >= 0) goto L24
            long r2 = r2 * r0
            long r8 = r8 - r2
            long r6 = r6 * r0
            long r6 = r6 + r8
            r8 = 1
            long r6 = r6 << r8
            int r8 = defpackage.qq1.a
            return r6
        L24:
            long r6 = defpackage.n16.u(r6)
            return r6
    }

    public static final void b(java.lang.StringBuilder r3, int r4, int r5, int r6, java.lang.String r7, boolean r8) {
            r3.append(r4)
            if (r5 == 0) goto L3d
            r4 = 46
            r3.append(r4)
            java.lang.String r4 = java.lang.String.valueOf(r5)
            java.lang.String r4 = defpackage.qs6.B0(r6, r4)
            int r5 = r4.length()
            r6 = -1
            int r5 = r5 + r6
            if (r5 < 0) goto L2b
        L1a:
            int r0 = r5 + (-1)
            char r1 = r4.charAt(r5)
            r2 = 48
            if (r1 == r2) goto L26
            r6 = r5
            goto L2b
        L26:
            if (r0 >= 0) goto L29
            goto L2b
        L29:
            r5 = r0
            goto L1a
        L2b:
            int r5 = r6 + 1
            r0 = 0
            r1 = 3
            if (r8 != 0) goto L37
            if (r5 >= r1) goto L37
            r3.append(r4, r0, r5)
            goto L3d
        L37:
            int r6 = r6 + r1
            int r6 = r6 / r1
            int r6 = r6 * r1
            r3.append(r4, r0, r6)
        L3d:
            r3.append(r7)
            return
    }

    public static int c(long r5, long r7) {
            long r0 = r5 ^ r7
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L1c
            int r0 = (int) r0
            r0 = r0 & 1
            if (r0 != 0) goto Le
            goto L1c
        Le:
            int r0 = (int) r5
            r0 = r0 & 1
            int r7 = (int) r7
            r7 = r7 & 1
            int r0 = r0 - r7
            int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r5 >= 0) goto L1b
            int r5 = -r0
            return r5
        L1b:
            return r0
        L1c:
            int r5 = defpackage.nb3.q(r5, r7)
            return r5
    }

    public static final boolean d(long r0, long r2) {
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public static final long e(long r2) {
            int r0 = (int) r2
            r1 = 1
            r0 = r0 & r1
            if (r0 != r1) goto Ld
            boolean r0 = i(r2)
            if (r0 != 0) goto Ld
            long r2 = r2 >> r1
            return r2
        Ld:
            uq1 r0 = defpackage.uq1.MILLISECONDS
            long r2 = k(r2, r0)
            return r2
    }

    public static final int f(long r2) {
            boolean r0 = i(r2)
            if (r0 == 0) goto L8
            r2 = 0
            return r2
        L8:
            uq1 r0 = defpackage.uq1.MINUTES
            long r2 = k(r2, r0)
            r0 = 60
            long r2 = r2 % r0
            int r2 = (int) r2
            return r2
    }

    public static final int g(long r2) {
            boolean r0 = i(r2)
            if (r0 == 0) goto L8
            r2 = 0
            return r2
        L8:
            int r0 = (int) r2
            r1 = 1
            r0 = r0 & r1
            if (r0 != r1) goto L17
            long r2 = r2 >> r1
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 % r0
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r2 = r2 * r0
        L15:
            int r2 = (int) r2
            return r2
        L17:
            long r2 = r2 >> r1
            r0 = 1000000000(0x3b9aca00, double:4.94065646E-315)
            long r2 = r2 % r0
            goto L15
    }

    public static final int h(long r2) {
            boolean r0 = i(r2)
            if (r0 == 0) goto L8
            r2 = 0
            return r2
        L8:
            uq1 r0 = defpackage.uq1.SECONDS
            long r2 = k(r2, r0)
            r0 = 60
            long r2 = r2 % r0
            int r2 = (int) r2
            return r2
    }

    public static final boolean i(long r2) {
            long r0 = defpackage.oq1.L
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto Lf
            long r0 = defpackage.oq1.R
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 != 0) goto Ld
            goto Lf
        Ld:
            r2 = 0
            return r2
        Lf:
            r2 = 1
            return r2
    }

    public static final long j(long r10, long r12) {
            int r0 = (int) r10
            r1 = 1
            r0 = r0 & r1
            int r2 = (int) r12
            r2 = r2 & r1
            if (r0 != r2) goto L85
            r2 = 1000000(0xf4240, double:4.940656E-318)
            if (r0 != 0) goto L2b
            long r10 = r10 >> r1
            long r12 = r12 >> r1
            long r10 = r10 + r12
            r12 = -4611686018426999999(0xc00000000005eb41, double:-2.0000000001722644)
            int r12 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r12 > 0) goto L25
            r12 = 4611686018427000000(0x3ffffffffffa14c0, double:1.999999999913868)
            int r12 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r12 >= 0) goto L25
            long r10 = r10 << r1
            int r12 = defpackage.qq1.a
            return r10
        L25:
            long r10 = r10 / r2
            long r10 = defpackage.n16.u(r10)
            return r10
        L2b:
            long r10 = r10 >> r1
            long r12 = r12 >> r1
            long r4 = defpackage.n16.k(r10, r12)
            r10 = 9223372036854759646(0x7fffffffffffc0de, double:NaN)
            int r10 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r10 == 0) goto L7d
            r10 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            int r10 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r10 == 0) goto L78
            r10 = -4611686018427387903(0xc000000000000001, double:-2.0000000000000004)
            int r10 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r10 != 0) goto L4d
            goto L78
        L4d:
            r10 = -4611686018426(0xfffffbce4217d286, double:NaN)
            int r10 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r10 > 0) goto L65
            r10 = 4611686018427(0x431bde82d7b, double:2.278475631111E-311)
            int r10 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r10 >= 0) goto L65
            long r4 = r4 * r2
            long r10 = r4 << r1
            int r12 = defpackage.qq1.a
            return r10
        L65:
            r6 = -4611686018427387903(0xc000000000000001, double:-2.0000000000000004)
            r8 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            long r10 = defpackage.gi2.s(r4, r6, r8)
            long r10 = defpackage.n16.u(r10)
            return r10
        L78:
            long r10 = defpackage.n16.u(r4)
            return r10
        L7d:
            java.lang.String r10 = "Summing infinite durations of different signs yields an undefined result."
            defpackage.i.h(r10)
            r10 = 0
            return r10
        L85:
            if (r0 != r1) goto L8e
            long r10 = r10 >> r1
            long r12 = r12 >> r1
            long r10 = a(r10, r12)
            return r10
        L8e:
            long r12 = r12 >> r1
            long r10 = r10 >> r1
            long r10 = a(r12, r10)
            return r10
    }

    public static final long k(long r3, defpackage.uq1 r5) {
            r5.getClass()
            long r0 = defpackage.oq1.L
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto Lf
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            return r3
        Lf:
            long r0 = defpackage.oq1.R
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto L18
            r3 = -9223372036854775808
            return r3
        L18:
            r0 = 1
            long r1 = r3 >> r0
            int r3 = (int) r3
            r3 = r3 & r0
            if (r3 != 0) goto L22
            uq1 r3 = defpackage.uq1.NANOSECONDS
            goto L24
        L22:
            uq1 r3 = defpackage.uq1.MILLISECONDS
        L24:
            r3.getClass()
            java.util.concurrent.TimeUnit r4 = r5.getTimeUnit$kotlin_stdlib()
            java.util.concurrent.TimeUnit r3 = r3.getTimeUnit$kotlin_stdlib()
            long r3 = r4.convert(r1, r3)
            return r3
    }

    public static java.lang.String l(long r13) {
            r0 = 0
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 != 0) goto L9
            java.lang.String r13 = "0s"
            return r13
        L9:
            long r3 = defpackage.oq1.L
            int r3 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r3 != 0) goto L12
            java.lang.String r13 = "Infinity"
            return r13
        L12:
            long r3 = defpackage.oq1.R
            int r3 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r3 != 0) goto L1b
            java.lang.String r13 = "-Infinity"
            return r13
        L1b:
            r3 = 0
            r4 = 1
            if (r2 >= 0) goto L21
            r5 = r4
            goto L22
        L21:
            r5 = r3
        L22:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            if (r5 == 0) goto L2e
            r7 = 45
            r6.append(r7)
        L2e:
            if (r2 >= 0) goto L34
            long r13 = m(r13)
        L34:
            uq1 r2 = defpackage.uq1.DAYS
            long r7 = k(r13, r2)
            boolean r2 = i(r13)
            if (r2 == 0) goto L42
            r2 = r3
            goto L4c
        L42:
            uq1 r2 = defpackage.uq1.HOURS
            long r9 = k(r13, r2)
            r11 = 24
            long r9 = r9 % r11
            int r2 = (int) r9
        L4c:
            int r9 = f(r13)
            r10 = r7
            int r7 = h(r13)
            int r8 = g(r13)
            int r13 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r13 == 0) goto L5f
            r13 = r4
            goto L60
        L5f:
            r13 = r3
        L60:
            if (r2 == 0) goto L64
            r14 = r4
            goto L65
        L64:
            r14 = r3
        L65:
            if (r9 == 0) goto L69
            r0 = r4
            goto L6a
        L69:
            r0 = r3
        L6a:
            if (r7 != 0) goto L71
            if (r8 == 0) goto L6f
            goto L71
        L6f:
            r1 = r3
            goto L72
        L71:
            r1 = r4
        L72:
            if (r13 == 0) goto L7d
            r6.append(r10)
            r3 = 100
            r6.append(r3)
            r3 = r4
        L7d:
            r10 = 32
            if (r14 != 0) goto L87
            if (r13 == 0) goto L97
            if (r0 != 0) goto L87
            if (r1 == 0) goto L97
        L87:
            int r11 = r3 + 1
            if (r3 <= 0) goto L8e
            r6.append(r10)
        L8e:
            r6.append(r2)
            r2 = 104(0x68, float:1.46E-43)
            r6.append(r2)
            r3 = r11
        L97:
            if (r0 != 0) goto L9f
            if (r1 == 0) goto Laf
            if (r14 != 0) goto L9f
            if (r13 == 0) goto Laf
        L9f:
            int r2 = r3 + 1
            if (r3 <= 0) goto La6
            r6.append(r10)
        La6:
            r6.append(r9)
            r3 = 109(0x6d, float:1.53E-43)
            r6.append(r3)
            r3 = r2
        Laf:
            if (r1 == 0) goto Lf2
            int r1 = r3 + 1
            if (r3 <= 0) goto Lb8
            r6.append(r10)
        Lb8:
            if (r7 != 0) goto Le9
            if (r13 != 0) goto Le9
            if (r14 != 0) goto Le9
            if (r0 == 0) goto Lc1
            goto Le9
        Lc1:
            r13 = 1000000(0xf4240, float:1.401298E-39)
            if (r8 < r13) goto Ld1
            int r7 = r8 / r13
            int r8 = r8 % r13
            java.lang.String r10 = "ms"
            r11 = 0
            r9 = 6
            b(r6, r7, r8, r9, r10, r11)
            goto Lf1
        Ld1:
            r13 = 1000(0x3e8, float:1.401E-42)
            if (r8 < r13) goto Le0
            int r7 = r8 / 1000
            int r8 = r8 % r13
            java.lang.String r10 = "us"
            r11 = 0
            r9 = 3
            b(r6, r7, r8, r9, r10, r11)
            goto Lf1
        Le0:
            r6.append(r8)
            java.lang.String r13 = "ns"
            r6.append(r13)
            goto Lf1
        Le9:
            java.lang.String r10 = "s"
            r11 = 0
            r9 = 9
            b(r6, r7, r8, r9, r10, r11)
        Lf1:
            r3 = r1
        Lf2:
            if (r5 == 0) goto L101
            if (r3 <= r4) goto L101
            r13 = 40
            java.lang.StringBuilder r13 = r6.insert(r4, r13)
            r14 = 41
            r13.append(r14)
        L101:
            java.lang.String r13 = r6.toString()
            return r13
    }

    public static final long m(long r3) {
            r0 = 1
            long r1 = r3 >> r0
            long r1 = -r1
            int r3 = (int) r3
            r3 = r3 & r0
            long r0 = r1 << r0
            long r3 = (long) r3
            long r0 = r0 + r3
            int r3 = defpackage.qq1.a
            return r0
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object r3) {
            r2 = this;
            oq1 r3 = (defpackage.oq1) r3
            long r0 = r3.A
            long r2 = r2.A
            int r2 = c(r2, r0)
            return r2
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof defpackage.oq1
            if (r0 != 0) goto L5
            goto Lf
        L5:
            oq1 r3 = (defpackage.oq1) r3
            long r0 = r3.A
            long r2 = r2.A
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 == 0) goto L11
        Lf:
            r2 = 0
            return r2
        L11:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r2 = this;
            long r0 = r2.A
            int r2 = java.lang.Long.hashCode(r0)
            return r2
    }

    public final java.lang.String toString() {
            r2 = this;
            long r0 = r2.A
            java.lang.String r2 = l(r0)
            return r2
    }
}
