package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lw5  reason: default package */
/* loaded from: classes.dex */
public final class lw5 {
    @defpackage.gc6("directoryUri")
    private final java.lang.String a;
    @defpackage.gc6("hash")
    private final java.lang.String b;
    @defpackage.gc6("lastScanned")
    private final long c;
    @defpackage.gc6("files")
    private final java.util.List<defpackage.iw5> d;

    public lw5(java.lang.String r1, java.lang.String r2, long r3, java.util.ArrayList r5) {
            r0 = this;
            r2.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r5
            return
    }

    public final java.lang.String a() {
            r0 = this;
            java.lang.String r0 = r0.a
            return r0
    }

    public final java.util.List b() {
            r0 = this;
            java.util.List<iw5> r0 = r0.d
            return r0
    }

    public final java.lang.String c() {
            r0 = this;
            java.lang.String r0 = r0.b
            return r0
    }

    public final long d() {
            r2 = this;
            long r0 = r2.c
            return r0
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof defpackage.lw5
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            lw5 r8 = (defpackage.lw5) r8
            java.lang.String r1 = r7.a
            java.lang.String r3 = r8.a
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r7.b
            java.lang.String r3 = r8.b
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            long r3 = r7.c
            long r5 = r8.c
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L2b
            return r2
        L2b:
            java.util.List<iw5> r7 = r7.d
            java.util.List<iw5> r8 = r8.d
            boolean r7 = defpackage.nb3.k(r7, r8)
            if (r7 != 0) goto L36
            return r2
        L36:
            return r0
    }

    public final int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r4.b
            int r0 = defpackage.xg6.d(r0, r1, r2)
            long r2 = r4.c
            int r0 = defpackage.i61.c(r2, r0, r1)
            java.util.List<iw5> r4 = r4.d
            int r4 = r4.hashCode()
            int r4 = r4 + r0
            return r4
    }

    public final java.lang.String toString() {
            r7 = this;
            java.lang.String r0 = r7.a
            java.lang.String r1 = r7.b
            long r2 = r7.c
            java.util.List<iw5> r7 = r7.d
            java.lang.String r4 = ", hash="
            java.lang.String r5 = ", lastScanned="
            java.lang.String r6 = "RomDirectoryStateDto(directoryUri="
            java.lang.StringBuilder r0 = defpackage.i61.u(r6, r0, r4, r1, r5)
            r0.append(r2)
            java.lang.String r1 = ", files="
            r0.append(r1)
            r0.append(r7)
            java.lang.String r7 = ")"
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            return r7
    }
}
