package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gd5  reason: default package */
/* loaded from: classes.dex */
public final class gd5 {
    public final java.lang.String a;
    public final long b;
    public final java.lang.String c;
    public final java.lang.String d;
    public final long e;

    public gd5(long r1, long r3, java.lang.String r5, java.lang.String r6, java.lang.String r7) {
            r0 = this;
            r0.<init>()
            r0.a = r5
            r0.b = r1
            r0.c = r6
            r0.d = r7
            r0.e = r3
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L3e
        L3:
            boolean r0 = r5 instanceof defpackage.gd5
            if (r0 != 0) goto L8
            goto L3c
        L8:
            gd5 r5 = (defpackage.gd5) r5
            java.lang.String r0 = r4.a
            java.lang.String r1 = r5.a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L3c
        L15:
            long r0 = r4.b
            long r2 = r5.b
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L1e
            goto L3c
        L1e:
            java.lang.String r0 = r4.c
            java.lang.String r1 = r5.c
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L29
            goto L3c
        L29:
            java.lang.String r0 = r4.d
            java.lang.String r1 = r5.d
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L34
            goto L3c
        L34:
            long r0 = r4.e
            long r4 = r5.e
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 == 0) goto L3e
        L3c:
            r4 = 0
            return r4
        L3e:
            r4 = 1
            return r4
    }

    public final int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            long r2 = r4.b
            int r0 = defpackage.i61.c(r2, r0, r1)
            java.lang.String r2 = r4.c
            int r0 = defpackage.xg6.d(r0, r1, r2)
            java.lang.String r2 = r4.d
            int r0 = defpackage.xg6.d(r0, r1, r2)
            long r1 = r4.e
            int r4 = java.lang.Long.hashCode(r1)
            int r4 = r4 + r0
            return r4
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "RaSubmissionContext(userId="
            r0.<init>(r1)
            java.lang.String r1 = r5.a
            r0.append(r1)
            java.lang.String r1 = ", gameId="
            r0.append(r1)
            long r1 = r5.b
            r0.append(r1)
            java.lang.String r1 = ", contentHash="
            java.lang.String r2 = ", sessionId="
            java.lang.String r3 = r5.c
            java.lang.String r4 = r5.d
            defpackage.i61.B(r0, r1, r3, r2, r4)
            java.lang.String r1 = ", nativeSessionId="
            java.lang.String r2 = ")"
            long r3 = r5.e
            java.lang.String r5 = defpackage.lb1.r(r0, r1, r3, r2)
            return r5
    }
}
