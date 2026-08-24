package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: iw5  reason: default package */
/* loaded from: classes.dex */
public final class iw5 {
    @defpackage.gc6("uri")
    private final java.lang.String a;
    @defpackage.gc6("lastModified")
    private final long b;
    @defpackage.gc6("size")
    private final long c;

    public iw5(java.lang.String r1, long r2, long r4) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r4
            return
    }

    public final long a() {
            r2 = this;
            long r0 = r2.b
            return r0
    }

    public final long b() {
            r2 = this;
            long r0 = r2.c
            return r0
    }

    public final java.lang.String c() {
            r0 = this;
            java.lang.String r0 = r0.a
            return r0
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof defpackage.iw5
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            iw5 r8 = (defpackage.iw5) r8
            java.lang.String r1 = r7.a
            java.lang.String r3 = r8.a
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            long r3 = r7.b
            long r5 = r8.b
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L20
            return r2
        L20:
            long r3 = r7.c
            long r7 = r8.c
            int r7 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r7 == 0) goto L29
            return r2
        L29:
            return r0
    }

    public final int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            long r2 = r4.b
            int r0 = defpackage.i61.c(r2, r0, r1)
            long r1 = r4.c
            int r4 = java.lang.Long.hashCode(r1)
            int r4 = r4 + r0
            return r4
    }

    public final java.lang.String toString() {
            r6 = this;
            java.lang.String r0 = r6.a
            long r1 = r6.b
            long r3 = r6.c
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r5 = "RomDirectoryFileDto(uri="
            r6.<init>(r5)
            r6.append(r0)
            java.lang.String r0 = ", lastModified="
            r6.append(r0)
            r6.append(r1)
            java.lang.String r0 = ", size="
            java.lang.String r1 = ")"
            java.lang.String r6 = defpackage.lb1.r(r6, r0, r3, r1)
            return r6
    }
}
