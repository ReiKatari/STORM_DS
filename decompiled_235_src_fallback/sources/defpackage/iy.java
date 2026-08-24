package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: iy  reason: default package */
/* loaded from: classes.dex */
public final class iy {
    public static final defpackage.iy f = null;
    public final long a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;

    static {
            iy r0 = new iy
            r5 = 604800000(0x240c8400, double:2.988109026E-315)
            r7 = 81920(0x14000, float:1.14794E-40)
            r1 = 10485760(0xa00000, double:5.180654E-317)
            r3 = 200(0xc8, float:2.8E-43)
            r4 = 10000(0x2710, float:1.4013E-41)
            r0.<init>(r1, r3, r4, r5, r7)
            defpackage.iy.f = r0
            return
    }

    public iy(long r1, int r3, int r4, long r5, int r7) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r3
            r0.c = r4
            r0.d = r5
            r0.e = r7
            return
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof defpackage.iy
            r2 = 0
            if (r1 == 0) goto L2e
            iy r8 = (defpackage.iy) r8
            long r3 = r7.a
            long r5 = r8.a
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L2e
            int r1 = r7.b
            int r3 = r8.b
            if (r1 != r3) goto L2e
            int r1 = r7.c
            int r3 = r8.c
            if (r1 != r3) goto L2e
            long r3 = r7.d
            long r5 = r8.d
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L2e
            int r7 = r7.e
            int r8 = r8.e
            if (r7 != r8) goto L2e
            return r0
        L2e:
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
            int r3 = r7.b
            r0 = r0 ^ r3
            int r0 = r0 * r1
            int r3 = r7.c
            r0 = r0 ^ r3
            int r0 = r0 * r1
            long r3 = r7.d
            long r5 = r3 >>> r2
            long r2 = r5 ^ r3
            int r2 = (int) r2
            r0 = r0 ^ r2
            int r0 = r0 * r1
            int r7 = r7.e
            r7 = r7 ^ r0
            return r7
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "EventStoreConfig{maxStorageSizeInBytes="
            r0.<init>(r1)
            long r1 = r3.a
            r0.append(r1)
            java.lang.String r1 = ", loadBatchSize="
            r0.append(r1)
            int r1 = r3.b
            r0.append(r1)
            java.lang.String r1 = ", criticalSectionEnterTimeoutMs="
            r0.append(r1)
            int r1 = r3.c
            r0.append(r1)
            java.lang.String r1 = ", eventCleanUpAge="
            r0.append(r1)
            long r1 = r3.d
            r0.append(r1)
            java.lang.String r1 = ", maxBlobByteSizePerRow="
            r0.append(r1)
            int r3 = r3.e
            java.lang.String r1 = "}"
            java.lang.String r3 = defpackage.lb1.o(r0, r3, r1)
            return r3
    }
}
