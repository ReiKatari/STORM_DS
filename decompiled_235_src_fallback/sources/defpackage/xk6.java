package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xk6  reason: default package */
/* loaded from: classes.dex */
public final class xk6 {
    public final int a;
    public final java.util.List b;
    public final int c;

    public xk6(int r1, java.util.List r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L24
        L3:
            boolean r0 = r3 instanceof defpackage.xk6
            if (r0 != 0) goto L8
            goto L22
        L8:
            xk6 r3 = (defpackage.xk6) r3
            int r0 = r2.a
            int r1 = r3.a
            if (r0 == r1) goto L11
            goto L22
        L11:
            java.util.List r0 = r2.b
            java.util.List r1 = r3.b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1c
            goto L22
        L1c:
            int r2 = r2.c
            int r3 = r3.c
            if (r2 == r3) goto L24
        L22:
            r2 = 0
            return r2
        L24:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            int r0 = r3.a
            int r0 = java.lang.Integer.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            java.util.List r2 = r3.b
            int r0 = defpackage.i61.b(r0, r2, r1)
            int r3 = r3.c
            int r3 = java.lang.Integer.hashCode(r3)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "SmartSyncResult(submittedCount="
            r0.<init>(r1)
            int r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", skipped="
            r0.append(r1)
            java.util.List r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", totalCount="
            r0.append(r1)
            java.lang.String r1 = ")"
            int r2 = r2.c
            java.lang.String r2 = defpackage.lb1.o(r0, r2, r1)
            return r2
    }
}
