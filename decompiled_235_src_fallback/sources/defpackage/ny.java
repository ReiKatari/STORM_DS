package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ny  reason: default package */
/* loaded from: classes.dex */
public final class ny extends defpackage.oy3 {
    public final long a;
    public final java.lang.Integer b;
    public final long c;
    public final byte[] d;
    public final java.lang.String e;
    public final long f;
    public final defpackage.te4 g;

    public ny(long r1, java.lang.Integer r3, long r4, byte[] r6, java.lang.String r7, long r8, defpackage.te4 r10) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r3
            r0.c = r4
            r0.d = r6
            r0.e = r7
            r0.f = r8
            r0.g = r10
            return
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof defpackage.oy3
            r2 = 0
            if (r1 == 0) goto L67
            oy3 r8 = (defpackage.oy3) r8
            r1 = r8
            ny r1 = (defpackage.ny) r1
            long r3 = r1.a
            long r5 = r7.a
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 != 0) goto L67
            java.lang.Integer r3 = r1.b
            java.lang.Integer r4 = r7.b
            if (r4 != 0) goto L1f
            if (r3 != 0) goto L67
            goto L25
        L1f:
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L67
        L25:
            long r3 = r7.c
            long r5 = r1.c
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L67
            boolean r3 = r8 instanceof defpackage.ny
            if (r3 == 0) goto L36
            ny r8 = (defpackage.ny) r8
            byte[] r8 = r8.d
            goto L38
        L36:
            byte[] r8 = r1.d
        L38:
            byte[] r3 = r7.d
            boolean r8 = java.util.Arrays.equals(r3, r8)
            if (r8 == 0) goto L67
            java.lang.String r8 = r1.e
            java.lang.String r3 = r7.e
            if (r3 != 0) goto L49
            if (r8 != 0) goto L67
            goto L4f
        L49:
            boolean r8 = r3.equals(r8)
            if (r8 == 0) goto L67
        L4f:
            long r3 = r7.f
            long r5 = r1.f
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 != 0) goto L67
            te4 r8 = r1.g
            te4 r7 = r7.g
            if (r7 != 0) goto L60
            if (r8 != 0) goto L67
            goto L66
        L60:
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L67
        L66:
            return r0
        L67:
            return r2
    }

    public final int hashCode() {
            r8 = this;
            long r0 = r8.a
            r2 = 32
            long r3 = r0 >>> r2
            long r0 = r0 ^ r3
            int r0 = (int) r0
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            r3 = 0
            java.lang.Integer r4 = r8.b
            if (r4 != 0) goto L14
            r4 = r3
            goto L18
        L14:
            int r4 = r4.hashCode()
        L18:
            r0 = r0 ^ r4
            int r0 = r0 * r1
            long r4 = r8.c
            long r6 = r4 >>> r2
            long r4 = r4 ^ r6
            int r4 = (int) r4
            r0 = r0 ^ r4
            int r0 = r0 * r1
            byte[] r4 = r8.d
            int r4 = java.util.Arrays.hashCode(r4)
            r0 = r0 ^ r4
            int r0 = r0 * r1
            java.lang.String r4 = r8.e
            if (r4 != 0) goto L30
            r4 = r3
            goto L34
        L30:
            int r4 = r4.hashCode()
        L34:
            r0 = r0 ^ r4
            int r0 = r0 * r1
            long r4 = r8.f
            long r6 = r4 >>> r2
            long r4 = r4 ^ r6
            int r2 = (int) r4
            r0 = r0 ^ r2
            int r0 = r0 * r1
            te4 r8 = r8.g
            if (r8 != 0) goto L43
            goto L47
        L43:
            int r3 = r8.hashCode()
        L47:
            r8 = r0 ^ r3
            return r8
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "LogEvent{eventTimeMs="
            r0.<init>(r1)
            long r1 = r3.a
            r0.append(r1)
            java.lang.String r1 = ", eventCode="
            r0.append(r1)
            java.lang.Integer r1 = r3.b
            r0.append(r1)
            java.lang.String r1 = ", eventUptimeMs="
            r0.append(r1)
            long r1 = r3.c
            r0.append(r1)
            java.lang.String r1 = ", sourceExtension="
            r0.append(r1)
            byte[] r1 = r3.d
            java.lang.String r1 = java.util.Arrays.toString(r1)
            r0.append(r1)
            java.lang.String r1 = ", sourceExtensionJsonProto3="
            r0.append(r1)
            java.lang.String r1 = r3.e
            r0.append(r1)
            java.lang.String r1 = ", timezoneOffsetSeconds="
            r0.append(r1)
            long r1 = r3.f
            r0.append(r1)
            java.lang.String r1 = ", networkConnectionInfo="
            r0.append(r1)
            te4 r3 = r3.g
            r0.append(r3)
            java.lang.String r3 = "}"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
