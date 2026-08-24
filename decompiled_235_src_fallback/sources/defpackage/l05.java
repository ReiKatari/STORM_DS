package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: l05  reason: default package */
/* loaded from: classes.dex */
public final class l05 {
    public final boolean a;
    public final java.util.ArrayList b;

    public l05(java.util.ArrayList r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.a = r2
            r0.b = r1
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L1d
        L3:
            boolean r0 = r3 instanceof defpackage.l05
            if (r0 != 0) goto L8
            goto L1b
        L8:
            l05 r3 = (defpackage.l05) r3
            boolean r0 = r3.a
            boolean r1 = r2.a
            if (r1 == r0) goto L11
            goto L1b
        L11:
            java.util.ArrayList r2 = r2.b
            java.util.ArrayList r3 = r3.b
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L1d
        L1b:
            r2 = 0
            return r2
        L1d:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r1 = this;
            boolean r0 = r1.a
            int r0 = java.lang.Boolean.hashCode(r0)
            int r0 = r0 * 31
            java.util.ArrayList r1 = r1.b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r8 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Posture(isTabletop="
            r0.<init>(r1)
            boolean r1 = r8.a
            r0.append(r1)
            java.lang.String r1 = ", hinges=["
            r0.append(r1)
            r6 = 0
            r7 = 62
            java.util.ArrayList r2 = r8.b
            java.lang.String r3 = ", "
            r4 = 0
            r5 = 0
            java.lang.String r8 = defpackage.gt0.P0(r2, r3, r4, r5, r6, r7)
            java.lang.String r1 = "])"
            java.lang.String r8 = defpackage.i61.n(r0, r8, r1)
            return r8
    }
}
