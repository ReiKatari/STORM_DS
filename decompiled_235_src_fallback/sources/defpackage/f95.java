package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: f95  reason: default package */
/* loaded from: classes.dex */
public final class f95 extends defpackage.l95 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final defpackage.ic5 e;
    public final long f;
    public final long g;
    public final long h;
    public final int i;
    public final boolean j;
    public final java.lang.String k;

    public f95(long r1, long r3, long r5, long r7, defpackage.ic5 r9, long r10, long r12, long r14, int r16, boolean r17, java.lang.String r18) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r3
            r0.c = r5
            r0.d = r7
            r0.e = r9
            r0.f = r10
            r0.g = r12
            r0.h = r14
            r1 = r16
            r0.i = r1
            r1 = r17
            r0.j = r1
            r1 = r18
            r0.k = r1
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L4
            goto L6c
        L4:
            boolean r0 = r5 instanceof defpackage.f95
            if (r0 != 0) goto La
            goto L6a
        La:
            f95 r5 = (defpackage.f95) r5
            long r0 = r4.a
            long r2 = r5.a
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L15
            goto L6a
        L15:
            long r0 = r4.b
            long r2 = r5.b
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L1e
            goto L6a
        L1e:
            long r0 = r4.c
            long r2 = r5.c
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L27
            goto L6a
        L27:
            long r0 = r4.d
            long r2 = r5.d
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L30
            goto L6a
        L30:
            ic5 r0 = r4.e
            ic5 r1 = r5.e
            if (r0 == r1) goto L37
            goto L6a
        L37:
            long r0 = r4.f
            long r2 = r5.f
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L40
            goto L6a
        L40:
            long r0 = r4.g
            long r2 = r5.g
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L49
            goto L6a
        L49:
            long r0 = r4.h
            long r2 = r5.h
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L52
            goto L6a
        L52:
            int r0 = r4.i
            int r1 = r5.i
            if (r0 == r1) goto L59
            goto L6a
        L59:
            boolean r0 = r4.j
            boolean r1 = r5.j
            if (r0 == r1) goto L60
            goto L6a
        L60:
            java.lang.String r4 = r4.k
            java.lang.String r5 = r5.k
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L6c
        L6a:
            r4 = 0
            return r4
        L6c:
            r4 = 1
            return r4
    }

    public final int hashCode() {
            r5 = this;
            long r0 = r5.a
            int r0 = java.lang.Long.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            long r2 = r5.b
            int r0 = defpackage.i61.c(r2, r0, r1)
            long r2 = r5.c
            int r0 = defpackage.i61.c(r2, r0, r1)
            long r2 = r5.d
            int r0 = defpackage.i61.c(r2, r0, r1)
            ic5 r2 = r5.e
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            long r3 = r5.f
            int r0 = defpackage.i61.c(r3, r2, r1)
            long r2 = r5.g
            int r0 = defpackage.i61.c(r2, r0, r1)
            long r2 = r5.h
            int r0 = defpackage.i61.c(r2, r0, r1)
            int r2 = r5.i
            int r0 = defpackage.lb1.a(r2, r0, r1)
            boolean r2 = r5.j
            int r0 = defpackage.xg6.e(r0, r2, r1)
            java.lang.String r5 = r5.k
            int r5 = r5.hashCode()
            int r5 = r5 + r0
            return r5
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = "OnPendingSubmissionAdded(submissionSessionId="
            java.lang.String r1 = ", nativeSubmissionId="
            long r2 = r5.a
            java.lang.StringBuilder r0 = defpackage.xg6.s(r2, r0, r1)
            long r1 = r5.b
            r0.append(r1)
            java.lang.String r1 = ", sequence="
            java.lang.String r2 = ", createdAtEpochMs="
            long r3 = r5.c
            defpackage.xg6.B(r0, r1, r3, r2)
            long r1 = r5.d
            r0.append(r1)
            java.lang.String r1 = ", submissionType="
            r0.append(r1)
            ic5 r1 = r5.e
            r0.append(r1)
            java.lang.String r1 = ", achievementId="
            java.lang.String r2 = ", leaderboardId="
            long r3 = r5.f
            defpackage.xg6.B(r0, r1, r3, r2)
            long r1 = r5.g
            r0.append(r1)
            java.lang.String r1 = ", attemptId="
            java.lang.String r2 = ", rawScore="
            long r3 = r5.h
            defpackage.xg6.B(r0, r1, r3, r2)
            int r1 = r5.i
            r0.append(r1)
            java.lang.String r1 = ", hardcore="
            r0.append(r1)
            boolean r1 = r5.j
            r0.append(r1)
            java.lang.String r1 = ", formattedScore="
            r0.append(r1)
            java.lang.String r1 = ")"
            java.lang.String r5 = r5.k
            java.lang.String r5 = defpackage.i61.n(r0, r5, r1)
            return r5
    }
}
