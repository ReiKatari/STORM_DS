package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bv4  reason: default package */
/* loaded from: classes.dex */
public final class bv4 {
    public final defpackage.gd5 a;
    public final java.util.List b;
    public final defpackage.lc5 c;
    public final boolean d;

    public bv4(defpackage.gd5 r1, java.util.List r2, defpackage.lc5 r3, boolean r4) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L33
        L3:
            boolean r0 = r3 instanceof defpackage.bv4
            if (r0 != 0) goto L8
            goto L31
        L8:
            bv4 r3 = (defpackage.bv4) r3
            gd5 r0 = r2.a
            gd5 r1 = r3.a
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L15
            goto L31
        L15:
            java.util.List r0 = r2.b
            java.util.List r1 = r3.b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L31
        L20:
            lc5 r0 = r2.c
            lc5 r1 = r3.c
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2b
            goto L31
        L2b:
            boolean r2 = r2.d
            boolean r3 = r3.d
            if (r2 == r3) goto L33
        L31:
            r2 = 0
            return r2
        L33:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            gd5 r0 = r3.a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.util.List r2 = r3.b
            int r0 = defpackage.i61.b(r0, r2, r1)
            lc5 r2 = r3.c
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            boolean r3 = r3.d
            int r3 = java.lang.Boolean.hashCode(r3)
            int r3 = r3 + r2
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "PendingRaSubmissionSnapshot(context="
            r0.<init>(r1)
            gd5 r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", records="
            r0.append(r1)
            java.util.List r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", counts="
            r0.append(r1)
            lc5 r1 = r2.c
            r0.append(r1)
            java.lang.String r1 = ", closed="
            r0.append(r1)
            boolean r2 = r2.d
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
