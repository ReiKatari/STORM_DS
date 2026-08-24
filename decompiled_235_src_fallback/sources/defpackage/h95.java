package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: h95  reason: default package */
/* loaded from: classes.dex */
public final class h95 extends defpackage.l95 {
    public final long a;
    public final long b;
    public final defpackage.ic5 c;
    public final defpackage.gc5 d;
    public final int e;

    public h95(long r1, long r3, defpackage.ic5 r5, defpackage.gc5 r6, int r7) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r3
            r0.c = r5
            r0.d = r6
            r0.e = r7
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L32
        L3:
            boolean r0 = r5 instanceof defpackage.h95
            if (r0 != 0) goto L8
            goto L30
        L8:
            h95 r5 = (defpackage.h95) r5
            long r0 = r4.a
            long r2 = r5.a
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L13
            goto L30
        L13:
            long r0 = r4.b
            long r2 = r5.b
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L1c
            goto L30
        L1c:
            ic5 r0 = r4.c
            ic5 r1 = r5.c
            if (r0 == r1) goto L23
            goto L30
        L23:
            gc5 r0 = r4.d
            gc5 r1 = r5.d
            if (r0 == r1) goto L2a
            goto L30
        L2a:
            int r4 = r4.e
            int r5 = r5.e
            if (r4 == r5) goto L32
        L30:
            r4 = 0
            return r4
        L32:
            r4 = 1
            return r4
    }

    public final int hashCode() {
            r4 = this;
            long r0 = r4.a
            int r0 = java.lang.Long.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            long r2 = r4.b
            int r0 = defpackage.i61.c(r2, r0, r1)
            ic5 r2 = r4.c
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            gc5 r0 = r4.d
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            int r0 = r0 * r1
            int r4 = r4.e
            int r4 = java.lang.Integer.hashCode(r4)
            int r4 = r4 + r0
            return r4
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.String r0 = "OnPendingSubmissionResolved(submissionSessionId="
            java.lang.String r1 = ", nativeSubmissionId="
            long r2 = r4.a
            java.lang.StringBuilder r0 = defpackage.xg6.s(r2, r0, r1)
            long r1 = r4.b
            r0.append(r1)
            java.lang.String r1 = ", submissionType="
            r0.append(r1)
            ic5 r1 = r4.c
            r0.append(r1)
            java.lang.String r1 = ", resolution="
            r0.append(r1)
            gc5 r1 = r4.d
            r0.append(r1)
            java.lang.String r1 = ", resultCode="
            r0.append(r1)
            int r4 = r4.e
            r0.append(r4)
            java.lang.String r4 = ")"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            return r4
    }
}
