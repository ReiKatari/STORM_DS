package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dk4  reason: default package */
/* loaded from: classes.dex */
public final class dk4 {
    public final long a;
    public final java.lang.String b;
    public final java.lang.Long c;
    public final java.lang.Long d;
    public final java.lang.Long e;

    public dk4(long r1, java.lang.String r3, java.lang.Long r4, java.lang.Long r5, java.lang.Long r6) {
            r0 = this;
            r3.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r3
            r0.c = r4
            r0.d = r5
            r0.e = r6
            return
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof defpackage.dk4
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            dk4 r8 = (defpackage.dk4) r8
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
            java.lang.Long r1 = r7.c
            java.lang.Long r3 = r8.c
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L2b
            return r2
        L2b:
            java.lang.Long r1 = r7.d
            java.lang.Long r3 = r8.d
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L36
            return r2
        L36:
            java.lang.Long r7 = r7.e
            java.lang.Long r8 = r8.e
            boolean r7 = defpackage.nb3.k(r7, r8)
            if (r7 != 0) goto L41
            return r2
        L41:
            return r0
    }

    public final int hashCode() {
            r4 = this;
            long r0 = r4.a
            int r0 = java.lang.Long.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r4.b
            int r0 = defpackage.xg6.d(r0, r1, r2)
            r2 = 0
            java.lang.Long r3 = r4.c
            if (r3 != 0) goto L16
            r3 = r2
            goto L1a
        L16:
            int r3 = r3.hashCode()
        L1a:
            int r0 = r0 + r3
            int r0 = r0 * r1
            java.lang.Long r3 = r4.d
            if (r3 != 0) goto L22
            r3 = r2
            goto L26
        L22:
            int r3 = r3.hashCode()
        L26:
            int r0 = r0 + r3
            int r0 = r0 * r1
            java.lang.Long r4 = r4.e
            if (r4 != 0) goto L2d
            goto L31
        L2d:
            int r2 = r4.hashCode()
        L31:
            int r0 = r0 + r2
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "OfflineSessionEvent(seq="
            r0.<init>(r1)
            long r1 = r3.a
            r0.append(r1)
            java.lang.String r1 = ", sessionId="
            r0.append(r1)
            java.lang.String r1 = r3.b
            r0.append(r1)
            java.lang.String r1 = ", startedAtEpochMs="
            r0.append(r1)
            java.lang.Long r1 = r3.c
            r0.append(r1)
            java.lang.String r1 = ", endedAtEpochMs="
            r0.append(r1)
            java.lang.Long r1 = r3.d
            r0.append(r1)
            java.lang.String r1 = ", estimatedPlayDurationMs="
            r0.append(r1)
            java.lang.Long r3 = r3.e
            r0.append(r3)
            java.lang.String r3 = ")"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
