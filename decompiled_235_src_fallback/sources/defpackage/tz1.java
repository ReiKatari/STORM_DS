package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tz1  reason: default package */
/* loaded from: classes.dex */
public final class tz1 {
    public final long a;
    public final long b;

    public tz1(long r1, long r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r3
            return
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof defpackage.tz1
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            tz1 r8 = (defpackage.tz1) r8
            long r3 = r7.a
            long r5 = r8.a
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L15
            return r2
        L15:
            long r3 = r7.b
            long r7 = r8.b
            int r7 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r7 == 0) goto L1e
            return r2
        L1e:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            long r0 = r3.a
            int r0 = java.lang.Long.hashCode(r0)
            int r0 = r0 * 31
            long r1 = r3.b
            int r3 = java.lang.Long.hashCode(r1)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.String r0 = "PendingRaSubmissionBarrier(submissionSessionId="
            java.lang.String r1 = ", barrierId="
            long r2 = r4.a
            java.lang.StringBuilder r0 = defpackage.xg6.s(r2, r0, r1)
            java.lang.String r1 = ")"
            long r2 = r4.b
            java.lang.String r4 = defpackage.lb1.p(r0, r2, r1)
            return r4
    }
}
