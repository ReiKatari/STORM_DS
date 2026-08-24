package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: at3  reason: default package */
/* loaded from: classes.dex */
public final class at3 {
    public long a;
    public long b;
    public long c;

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof defpackage.at3
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            at3 r8 = (defpackage.at3) r8
            long r3 = r7.a
            long r5 = r8.a
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L15
            return r2
        L15:
            long r3 = r7.b
            long r5 = r8.b
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L1e
            return r2
        L1e:
            long r3 = r7.c
            long r7 = r8.c
            int r7 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r7 == 0) goto L27
            return r2
        L27:
            return r0
    }

    public final int hashCode() {
            r4 = this;
            long r0 = r4.a
            int r0 = java.lang.Long.hashCode(r0)
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
            r7 = this;
            long r0 = r7.a
            long r2 = r7.b
            long r4 = r7.c
            java.lang.String r7 = "AttemptState(lastLoggedAtNanos="
            java.lang.String r6 = ", updateCount="
            java.lang.StringBuilder r7 = defpackage.xg6.s(r0, r7, r6)
            r7.append(r2)
            java.lang.String r0 = ", suppressedUpdates="
            java.lang.String r1 = ")"
            java.lang.String r7 = defpackage.lb1.r(r7, r0, r4, r1)
            return r7
    }
}
