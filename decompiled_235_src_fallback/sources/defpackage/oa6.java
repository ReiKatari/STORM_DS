package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: oa6  reason: default package */
/* loaded from: classes.dex */
public final class oa6 {
    public final defpackage.fv2 a;
    public final long b;
    public final defpackage.na6 c;
    public final boolean d;

    public oa6(defpackage.fv2 r1, long r2, defpackage.na6 r4, boolean r5) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r4
            r0.d = r5
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L2b
        L3:
            boolean r0 = r5 instanceof defpackage.oa6
            if (r0 != 0) goto L8
            goto L29
        L8:
            oa6 r5 = (defpackage.oa6) r5
            fv2 r0 = r4.a
            fv2 r1 = r5.a
            if (r0 == r1) goto L11
            goto L29
        L11:
            long r0 = r4.b
            long r2 = r5.b
            boolean r0 = defpackage.jk4.c(r0, r2)
            if (r0 != 0) goto L1c
            goto L29
        L1c:
            na6 r0 = r4.c
            na6 r1 = r5.c
            if (r0 == r1) goto L23
            goto L29
        L23:
            boolean r4 = r4.d
            boolean r5 = r5.d
            if (r4 == r5) goto L2b
        L29:
            r4 = 0
            return r4
        L2b:
            r4 = 1
            return r4
    }

    public final int hashCode() {
            r4 = this;
            fv2 r0 = r4.a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            long r2 = r4.b
            int r0 = defpackage.i61.c(r2, r0, r1)
            na6 r2 = r4.c
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            boolean r4 = r4.d
            int r4 = java.lang.Boolean.hashCode(r4)
            int r4 = r4 + r2
            return r4
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "SelectionHandleInfo(handle="
            r0.<init>(r1)
            fv2 r1 = r3.a
            r0.append(r1)
            java.lang.String r1 = ", position="
            r0.append(r1)
            long r1 = r3.b
            java.lang.String r1 = defpackage.jk4.h(r1)
            r0.append(r1)
            java.lang.String r1 = ", anchor="
            r0.append(r1)
            na6 r1 = r3.c
            r0.append(r1)
            java.lang.String r1 = ", visible="
            r0.append(r1)
            boolean r3 = r3.d
            r1 = 41
            java.lang.String r3 = defpackage.xg6.r(r0, r3, r1)
            return r3
    }
}
