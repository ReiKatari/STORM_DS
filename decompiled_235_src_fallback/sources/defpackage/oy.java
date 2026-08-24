package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: oy  reason: default package */
/* loaded from: classes.dex */
public final class oy extends defpackage.py3 {
    public final long a;
    public final long b;
    public final defpackage.wx c;
    public final java.lang.Integer d;
    public final java.lang.String e;
    public final java.util.ArrayList f;
    public final defpackage.q65 g;

    public oy(long r1, long r3, defpackage.wx r5, java.lang.Integer r6, java.lang.String r7, java.util.ArrayList r8, defpackage.q65 r9) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r3
            r0.c = r5
            r0.d = r6
            r0.e = r7
            r0.f = r8
            r0.g = r9
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r5 != r4) goto L3
            goto L5c
        L3:
            boolean r0 = r5 instanceof defpackage.py3
            if (r0 == 0) goto L5e
            py3 r5 = (defpackage.py3) r5
            oy r5 = (defpackage.oy) r5
            long r0 = r5.a
            long r2 = r4.a
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto L5e
            long r0 = r4.b
            long r2 = r5.b
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L5e
            wx r0 = r4.c
            wx r1 = r5.c
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L5e
            java.lang.Integer r0 = r5.d
            java.lang.Integer r1 = r4.d
            if (r1 != 0) goto L2e
            if (r0 != 0) goto L5e
            goto L34
        L2e:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L5e
        L34:
            java.lang.String r0 = r5.e
            java.lang.String r1 = r4.e
            if (r1 != 0) goto L3d
            if (r0 != 0) goto L5e
            goto L43
        L3d:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L5e
        L43:
            java.util.ArrayList r0 = r4.f
            java.util.ArrayList r1 = r5.f
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L5e
            q65 r5 = r5.g
            q65 r4 = r4.g
            if (r4 != 0) goto L56
            if (r5 != 0) goto L5e
            goto L5c
        L56:
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L5e
        L5c:
            r4 = 1
            return r4
        L5e:
            r4 = 0
            return r4
    }

    public final int hashCode() {
            r7 = this;
            long r0 = r7.a
            r2 = 32
            long r3 = r0 >>> r2
            long r0 = r0 ^ r3
            int r0 = (int) r0
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            long r3 = r7.b
            long r5 = r3 >>> r2
            long r2 = r5 ^ r3
            int r2 = (int) r2
            r0 = r0 ^ r2
            int r0 = r0 * r1
            wx r2 = r7.c
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            r2 = 0
            java.lang.Integer r3 = r7.d
            if (r3 != 0) goto L25
            r3 = r2
            goto L29
        L25:
            int r3 = r3.hashCode()
        L29:
            r0 = r0 ^ r3
            int r0 = r0 * r1
            java.lang.String r3 = r7.e
            if (r3 != 0) goto L31
            r3 = r2
            goto L35
        L31:
            int r3 = r3.hashCode()
        L35:
            r0 = r0 ^ r3
            int r0 = r0 * r1
            java.util.ArrayList r3 = r7.f
            int r3 = r3.hashCode()
            r0 = r0 ^ r3
            int r0 = r0 * r1
            q65 r7 = r7.g
            if (r7 != 0) goto L44
            goto L48
        L44:
            int r2 = r7.hashCode()
        L48:
            r7 = r0 ^ r2
            return r7
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "LogRequest{requestTimeMs="
            r0.<init>(r1)
            long r1 = r3.a
            r0.append(r1)
            java.lang.String r1 = ", requestUptimeMs="
            r0.append(r1)
            long r1 = r3.b
            r0.append(r1)
            java.lang.String r1 = ", clientInfo="
            r0.append(r1)
            wx r1 = r3.c
            r0.append(r1)
            java.lang.String r1 = ", logSource="
            r0.append(r1)
            java.lang.Integer r1 = r3.d
            r0.append(r1)
            java.lang.String r1 = ", logSourceName="
            r0.append(r1)
            java.lang.String r1 = r3.e
            r0.append(r1)
            java.lang.String r1 = ", logEvents="
            r0.append(r1)
            java.util.ArrayList r1 = r3.f
            r0.append(r1)
            java.lang.String r1 = ", qosTier="
            r0.append(r1)
            q65 r3 = r3.g
            r0.append(r3)
            java.lang.String r3 = "}"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
