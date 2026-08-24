package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ul1  reason: default package */
/* loaded from: classes.dex */
public final class ul1 {
    public final defpackage.rl1 a;
    public final long b;
    public final long c;

    public ul1(defpackage.rl1 r1, long r2, long r4) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r4
            return
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof defpackage.ul1
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ul1 r8 = (defpackage.ul1) r8
            rl1 r1 = r7.a
            rl1 r3 = r8.a
            if (r1 == r3) goto L13
            return r2
        L13:
            long r3 = r7.b
            long r5 = r8.b
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L1c
            return r2
        L1c:
            long r3 = r7.c
            long r7 = r8.c
            int r7 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r7 == 0) goto L25
            return r2
        L25:
            return r0
    }

    public final int hashCode() {
            r4 = this;
            rl1 r0 = r4.a
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
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "SyncEntryState(kind="
            r0.<init>(r1)
            rl1 r1 = r5.a
            r0.append(r1)
            java.lang.String r1 = ", lastModified="
            r0.append(r1)
            long r1 = r5.b
            r0.append(r1)
            java.lang.String r1 = ", length="
            java.lang.String r2 = ")"
            long r3 = r5.c
            java.lang.String r5 = defpackage.lb1.r(r0, r1, r3, r2)
            return r5
    }
}
