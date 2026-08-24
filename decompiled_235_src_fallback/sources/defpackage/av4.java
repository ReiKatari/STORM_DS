package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: av4  reason: default package */
/* loaded from: classes.dex */
public final class av4 {
    public final defpackage.zu4 a;
    public final defpackage.cv4 b;

    public av4(defpackage.zu4 r1, defpackage.cv4 r2) {
            r0 = this;
            r2.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    public static defpackage.av4 a(defpackage.av4 r1, defpackage.cv4 r2) {
            zu4 r0 = r1.a
            r1.getClass()
            r2.getClass()
            av4 r1 = new av4
            r1.<init>(r0, r2)
            return r1
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L1d
        L3:
            boolean r0 = r3 instanceof defpackage.av4
            if (r0 != 0) goto L8
            goto L1b
        L8:
            av4 r3 = (defpackage.av4) r3
            zu4 r0 = r2.a
            zu4 r1 = r3.a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L1b
        L15:
            cv4 r2 = r2.b
            cv4 r3 = r3.b
            if (r2 == r3) goto L1d
        L1b:
            r2 = 0
            return r2
        L1d:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r1 = this;
            zu4 r0 = r1.a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            cv4 r1 = r1.b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "PendingRaSubmissionRecord(submission="
            r0.<init>(r1)
            zu4 r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", status="
            r0.append(r1)
            cv4 r2 = r2.b
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
