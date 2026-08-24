package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: i41  reason: default package */
/* loaded from: classes.dex */
public final class i41 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    public i41(long r1, long r3, long r5, long r7, long r9) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r3
            r0.c = r5
            r0.d = r7
            r0.e = r9
            return
    }

    public final boolean equals(java.lang.Object r7) {
            r6 = this;
            r0 = 1
            if (r6 != r7) goto L4
            return r0
        L4:
            r1 = 0
            if (r7 == 0) goto L46
            boolean r2 = r7 instanceof defpackage.i41
            if (r2 != 0) goto Lc
            goto L46
        Lc:
            i41 r7 = (defpackage.i41) r7
            long r2 = r7.a
            long r4 = r6.a
            boolean r2 = defpackage.kt0.d(r4, r2)
            if (r2 != 0) goto L19
            return r1
        L19:
            long r2 = r6.b
            long r4 = r7.b
            boolean r2 = defpackage.kt0.d(r2, r4)
            if (r2 != 0) goto L24
            return r1
        L24:
            long r2 = r6.c
            long r4 = r7.c
            boolean r2 = defpackage.kt0.d(r2, r4)
            if (r2 != 0) goto L2f
            return r1
        L2f:
            long r2 = r6.d
            long r4 = r7.d
            boolean r2 = defpackage.kt0.d(r2, r4)
            if (r2 != 0) goto L3a
            return r1
        L3a:
            long r2 = r6.e
            long r6 = r7.e
            boolean r6 = defpackage.kt0.d(r2, r6)
            if (r6 != 0) goto L45
            return r1
        L45:
            return r0
        L46:
            return r1
    }

    public final int hashCode() {
            r4 = this;
            int r0 = defpackage.kt0.i
            long r0 = r4.a
            int r0 = java.lang.Long.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            long r2 = r4.b
            int r0 = defpackage.i61.c(r2, r0, r1)
            long r2 = r4.c
            int r0 = defpackage.i61.c(r2, r0, r1)
            long r2 = r4.d
            int r0 = defpackage.i61.c(r2, r0, r1)
            long r1 = r4.e
            int r4 = java.lang.Long.hashCode(r1)
            int r4 = r4 + r0
            return r4
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ContextMenuColors(backgroundColor="
            r0.<init>(r1)
            long r1 = r3.a
            java.lang.String r1 = defpackage.kt0.j(r1)
            r0.append(r1)
            java.lang.String r1 = ", textColor="
            r0.append(r1)
            long r1 = r3.b
            java.lang.String r1 = defpackage.kt0.j(r1)
            r0.append(r1)
            java.lang.String r1 = ", iconColor="
            r0.append(r1)
            long r1 = r3.c
            java.lang.String r1 = defpackage.kt0.j(r1)
            r0.append(r1)
            java.lang.String r1 = ", disabledTextColor="
            r0.append(r1)
            long r1 = r3.d
            java.lang.String r1 = defpackage.kt0.j(r1)
            r0.append(r1)
            java.lang.String r1 = ", disabledIconColor="
            r0.append(r1)
            long r1 = r3.e
            java.lang.String r3 = defpackage.kt0.j(r1)
            r0.append(r3)
            r3 = 41
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
