package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@defpackage.cc6
/* renamed from: yj4  reason: default package */
/* loaded from: classes.dex */
public final class yj4 {
    public static final defpackage.xj4 Companion = null;
    public final long a;
    public final java.lang.String b;
    public final java.lang.String c;

    static {
            xj4 r0 = new xj4
            r0.<init>()
            defpackage.yj4.Companion = r0
            return
    }

    public /* synthetic */ yj4(int r2, long r3, java.lang.String r5, java.lang.String r6) {
            r1 = this;
            r1.<init>()
            r0 = r2 & 1
            if (r0 != 0) goto L9
            r3 = 0
        L9:
            r1.a = r3
            r3 = r2 & 2
            java.lang.String r4 = ""
            if (r3 != 0) goto L14
            r1.b = r4
            goto L16
        L14:
            r1.b = r5
        L16:
            r2 = r2 & 4
            if (r2 != 0) goto L1d
            r1.c = r4
            return
        L1d:
            r1.c = r6
            return
    }

    public yj4(long r1, java.lang.String r3, java.lang.String r4) {
            r0 = this;
            r3.getClass()
            r4.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r3
            r0.c = r4
            return
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof defpackage.yj4
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            yj4 r8 = (defpackage.yj4) r8
            long r3 = r7.a
            long r5 = r8.a
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L15
            return r2
        L15:
            java.lang.String r1 = r7.b
            java.lang.String r3 = r8.b
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L20
            return r2
        L20:
            java.lang.String r7 = r7.c
            java.lang.String r8 = r8.c
            boolean r7 = defpackage.nb3.k(r7, r8)
            if (r7 != 0) goto L2b
            return r2
        L2b:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            long r0 = r3.a
            int r0 = java.lang.Long.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.b
            int r0 = defpackage.xg6.d(r0, r1, r2)
            java.lang.String r3 = r3.c
            int r3 = r3.hashCode()
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "OfflinePrefetchCacheLeaderboard(id="
            r0.<init>(r1)
            long r1 = r3.a
            r0.append(r1)
            java.lang.String r1 = ", memoryAddress="
            r0.append(r1)
            java.lang.String r1 = r3.b
            r0.append(r1)
            java.lang.String r1 = ", format="
            r0.append(r1)
            java.lang.String r3 = r3.c
            r0.append(r3)
            java.lang.String r3 = ")"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
