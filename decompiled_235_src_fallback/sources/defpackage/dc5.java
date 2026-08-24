package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dc5  reason: default package */
/* loaded from: classes.dex */
public final class dc5 {
    public final long a;
    public final defpackage.ic5 b;
    public final defpackage.gc5 c;
    public final int d;

    public dc5(long r1, defpackage.ic5 r3, defpackage.gc5 r4, int r5) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r3
            r0.c = r4
            r0.d = r5
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L29
        L3:
            boolean r0 = r5 instanceof defpackage.dc5
            if (r0 != 0) goto L8
            goto L27
        L8:
            dc5 r5 = (defpackage.dc5) r5
            long r0 = r4.a
            long r2 = r5.a
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L13
            goto L27
        L13:
            ic5 r0 = r4.b
            ic5 r1 = r5.b
            if (r0 == r1) goto L1a
            goto L27
        L1a:
            gc5 r0 = r4.c
            gc5 r1 = r5.c
            if (r0 == r1) goto L21
            goto L27
        L21:
            int r4 = r4.d
            int r5 = r5.d
            if (r4 == r5) goto L29
        L27:
            r4 = 0
            return r4
        L29:
            r4 = 1
            return r4
    }

    public final int hashCode() {
            r2 = this;
            long r0 = r2.a
            int r0 = java.lang.Long.hashCode(r0)
            int r0 = r0 * 31
            ic5 r1 = r2.b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            gc5 r0 = r2.c
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r2 = r2.d
            int r2 = java.lang.Integer.hashCode(r2)
            int r2 = r2 + r0
            return r2
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "RaNativePendingRetryResolution(nativeSubmissionId="
            r0.<init>(r1)
            long r1 = r3.a
            r0.append(r1)
            java.lang.String r1 = ", submissionType="
            r0.append(r1)
            ic5 r1 = r3.b
            r0.append(r1)
            java.lang.String r1 = ", resolution="
            r0.append(r1)
            gc5 r1 = r3.c
            r0.append(r1)
            java.lang.String r1 = ", resultCode="
            r0.append(r1)
            int r3 = r3.d
            r0.append(r3)
            java.lang.String r3 = ")"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
