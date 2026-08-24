package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bt3  reason: default package */
/* loaded from: classes.dex */
public final class bt3 {
    public final boolean a;
    public final long b;
    public final long c;

    public bt3(long r1, long r3, boolean r5) {
            r0 = this;
            r0.<init>()
            r0.a = r5
            r0.b = r1
            r0.c = r3
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L24
        L3:
            boolean r0 = r5 instanceof defpackage.bt3
            if (r0 != 0) goto L8
            goto L22
        L8:
            bt3 r5 = (defpackage.bt3) r5
            boolean r0 = r4.a
            boolean r1 = r5.a
            if (r0 == r1) goto L11
            goto L22
        L11:
            long r0 = r4.b
            long r2 = r5.b
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L1a
            goto L22
        L1a:
            long r0 = r4.c
            long r4 = r5.c
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 == 0) goto L24
        L22:
            r4 = 0
            return r4
        L24:
            r4 = 1
            return r4
    }

    public final int hashCode() {
            r4 = this;
            boolean r0 = r4.a
            int r0 = java.lang.Boolean.hashCode(r0)
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
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Decision(shouldLog="
            r0.<init>(r1)
            boolean r1 = r5.a
            r0.append(r1)
            java.lang.String r1 = ", updateIndex="
            r0.append(r1)
            long r1 = r5.b
            r0.append(r1)
            java.lang.String r1 = ", suppressedUpdates="
            java.lang.String r2 = ")"
            long r3 = r5.c
            java.lang.String r5 = defpackage.lb1.r(r0, r1, r3, r2)
            return r5
    }
}
