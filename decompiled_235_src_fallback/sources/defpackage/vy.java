package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vy  reason: default package */
/* loaded from: classes.dex */
public final class vy {
    public final long a;
    public final long b;
    public final java.util.Set c;

    public vy(long r1, long r3, java.util.Set r5) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r3
            r0.c = r5
            return
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof defpackage.vy
            r2 = 0
            if (r1 == 0) goto L26
            vy r8 = (defpackage.vy) r8
            long r3 = r7.a
            long r5 = r8.a
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L26
            long r3 = r7.b
            long r5 = r8.b
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L26
            java.util.Set r7 = r7.c
            java.util.Set r8 = r8.c
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L26
            return r0
        L26:
            return r2
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
            java.util.Set r7 = r7.c
            int r7 = r7.hashCode()
            r7 = r7 ^ r0
            return r7
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ConfigValue{delta="
            r0.<init>(r1)
            long r1 = r3.a
            r0.append(r1)
            java.lang.String r1 = ", maxAllowedDelay="
            r0.append(r1)
            long r1 = r3.b
            r0.append(r1)
            java.lang.String r1 = ", flags="
            r0.append(r1)
            java.util.Set r3 = r3.c
            r0.append(r3)
            java.lang.String r3 = "}"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
