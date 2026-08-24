package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: e97  reason: default package */
/* loaded from: classes.dex */
public final class e97 {
    public final double a;
    public final double b;
    public final double c;
    public final double d;
    public final double e;
    public final double f;
    public final double g;

    public /* synthetic */ e97(double r16, double r18, double r20, double r22, double r24) {
            r15 = this;
            r11 = 0
            r13 = 0
            r0 = r15
            r1 = r16
            r3 = r18
            r5 = r20
            r7 = r22
            r9 = r24
            r0.<init>(r1, r3, r5, r7, r9, r11, r13)
            return
    }

    public e97(double r2, double r4, double r6, double r8, double r10, double r12, double r14) {
            r1 = this;
            r1.<init>()
            r1.a = r2
            r1.b = r4
            r1.c = r6
            r1.d = r8
            r1.e = r10
            r1.f = r12
            r1.g = r14
            boolean r1 = java.lang.Double.isNaN(r4)
            r0 = 0
            if (r1 != 0) goto Lb9
            boolean r1 = java.lang.Double.isNaN(r6)
            if (r1 != 0) goto Lb9
            boolean r1 = java.lang.Double.isNaN(r8)
            if (r1 != 0) goto Lb9
            boolean r1 = java.lang.Double.isNaN(r10)
            if (r1 != 0) goto Lb9
            boolean r1 = java.lang.Double.isNaN(r12)
            if (r1 != 0) goto Lb9
            boolean r1 = java.lang.Double.isNaN(r14)
            if (r1 != 0) goto Lb9
            boolean r1 = java.lang.Double.isNaN(r2)
            if (r1 != 0) goto Lb9
            r6 = -4611686018427387904(0xc000000000000000, double:-2.0)
            int r1 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r1 != 0) goto L43
            goto L49
        L43:
            r6 = -4609434218613702656(0xc008000000000000, double:-3.0)
            int r1 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r1 != 0) goto L4a
        L49:
            return
        L4a:
            r6 = 0
            int r1 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r1 < 0) goto La5
            r12 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r1 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r1 > 0) goto La5
            int r1 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r1 != 0) goto L69
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 == 0) goto L63
            int r1 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r1 == 0) goto L63
            goto L69
        L63:
            java.lang.String r1 = "Parameter a or g is zero, the transfer function is constant"
            defpackage.i.h(r1)
            throw r0
        L69:
            int r1 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r1 < 0) goto L78
            int r1 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r1 == 0) goto L72
            goto L78
        L72:
            java.lang.String r1 = "Parameter c is zero, the transfer function is constant"
            defpackage.i.h(r1)
            throw r0
        L78:
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 != 0) goto L7d
            goto L81
        L7d:
            int r1 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r1 != 0) goto L8c
        L81:
            int r1 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r1 == 0) goto L86
            goto L8c
        L86:
            java.lang.String r1 = "Parameter a or g is zero, and c is zero, the transfer function is constant"
            defpackage.i.h(r1)
            throw r0
        L8c:
            int r1 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r1 < 0) goto L9f
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 < 0) goto L99
            int r1 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r1 < 0) goto L99
            return
        L99:
            java.lang.String r1 = "The transfer function must be positive or increasing"
            defpackage.i.h(r1)
            throw r0
        L9f:
            java.lang.String r1 = "The transfer function must be increasing"
            defpackage.i.h(r1)
            throw r0
        La5:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Parameter d must be in the range [0..1], was "
            r2.<init>(r3)
            r2.append(r10)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        Lb9:
            java.lang.String r1 = "Parameters cannot be NaN"
            defpackage.i.h(r1)
            throw r0
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof defpackage.e97
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            e97 r8 = (defpackage.e97) r8
            double r3 = r7.a
            double r5 = r8.a
            int r1 = java.lang.Double.compare(r3, r5)
            if (r1 == 0) goto L17
            return r2
        L17:
            double r3 = r7.b
            double r5 = r8.b
            int r1 = java.lang.Double.compare(r3, r5)
            if (r1 == 0) goto L22
            return r2
        L22:
            double r3 = r7.c
            double r5 = r8.c
            int r1 = java.lang.Double.compare(r3, r5)
            if (r1 == 0) goto L2d
            return r2
        L2d:
            double r3 = r7.d
            double r5 = r8.d
            int r1 = java.lang.Double.compare(r3, r5)
            if (r1 == 0) goto L38
            return r2
        L38:
            double r3 = r7.e
            double r5 = r8.e
            int r1 = java.lang.Double.compare(r3, r5)
            if (r1 == 0) goto L43
            return r2
        L43:
            double r3 = r7.f
            double r5 = r8.f
            int r1 = java.lang.Double.compare(r3, r5)
            if (r1 == 0) goto L4e
            return r2
        L4e:
            double r3 = r7.g
            double r7 = r8.g
            int r7 = java.lang.Double.compare(r3, r7)
            if (r7 == 0) goto L59
            return r2
        L59:
            return r0
    }

    public final int hashCode() {
            r4 = this;
            double r0 = r4.a
            int r0 = java.lang.Double.hashCode(r0)
            int r0 = r0 * 31
            double r1 = r4.b
            int r1 = java.lang.Double.hashCode(r1)
            int r1 = r1 + r0
            int r1 = r1 * 31
            double r2 = r4.c
            int r0 = java.lang.Double.hashCode(r2)
            int r0 = r0 + r1
            int r0 = r0 * 31
            double r1 = r4.d
            int r1 = java.lang.Double.hashCode(r1)
            int r1 = r1 + r0
            int r1 = r1 * 31
            double r2 = r4.e
            int r0 = java.lang.Double.hashCode(r2)
            int r0 = r0 + r1
            int r0 = r0 * 31
            double r1 = r4.f
            int r1 = java.lang.Double.hashCode(r1)
            int r1 = r1 + r0
            int r1 = r1 * 31
            double r2 = r4.g
            int r4 = java.lang.Double.hashCode(r2)
            int r4 = r4 + r1
            return r4
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "TransferParameters(gamma="
            r0.<init>(r1)
            double r1 = r3.a
            r0.append(r1)
            java.lang.String r1 = ", a="
            r0.append(r1)
            double r1 = r3.b
            r0.append(r1)
            java.lang.String r1 = ", b="
            r0.append(r1)
            double r1 = r3.c
            r0.append(r1)
            java.lang.String r1 = ", c="
            r0.append(r1)
            double r1 = r3.d
            r0.append(r1)
            java.lang.String r1 = ", d="
            r0.append(r1)
            double r1 = r3.e
            r0.append(r1)
            java.lang.String r1 = ", e="
            r0.append(r1)
            double r1 = r3.f
            r0.append(r1)
            java.lang.String r1 = ", f="
            r0.append(r1)
            double r1 = r3.g
            r0.append(r1)
            r3 = 41
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
