package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hw7  reason: default package */
/* loaded from: classes.dex */
public final class hw7 {
    public final long a;
    public final long b;

    public hw7(long r1, long r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r3
            return
    }

    public final boolean equals(java.lang.Object r7) {
            r6 = this;
            r0 = 1
            if (r6 != r7) goto L4
            return r0
        L4:
            r1 = 0
            if (r7 == 0) goto L27
            java.lang.Class<hw7> r2 = defpackage.hw7.class
            java.lang.Class r3 = r7.getClass()
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L14
            goto L27
        L14:
            hw7 r7 = (defpackage.hw7) r7
            long r2 = r7.a
            long r4 = r6.a
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L27
            long r2 = r7.b
            long r6 = r6.b
            int r6 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r6 != 0) goto L27
            return r0
        L27:
            return r1
    }

    public final int hashCode() {
            r3 = this;
            long r0 = r3.a
            int r0 = java.lang.Long.hashCode(r0)
            int r0 = r0 * 31
            long r1 = r3.b
            int r3 = java.lang.Long.hashCode(r1)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "PeriodicityInfo{repeatIntervalMillis="
            r0.<init>(r1)
            long r1 = r3.a
            r0.append(r1)
            java.lang.String r1 = ", flexIntervalMillis="
            r0.append(r1)
            long r1 = r3.b
            r0.append(r1)
            r3 = 125(0x7d, float:1.75E-43)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
