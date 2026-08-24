package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cw6  reason: default package */
/* loaded from: classes.dex */
public final class cw6 {
    public final java.util.LinkedHashMap a;
    public final java.util.LinkedHashMap b;
    public final int c;

    public cw6(java.util.LinkedHashMap r1, java.util.LinkedHashMap r2, int r3) {
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
            goto L28
        L3:
            boolean r0 = r3 instanceof defpackage.cw6
            if (r0 != 0) goto L8
            goto L26
        L8:
            cw6 r3 = (defpackage.cw6) r3
            java.util.LinkedHashMap r0 = r2.a
            java.util.LinkedHashMap r1 = r3.a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L26
        L15:
            java.util.LinkedHashMap r0 = r2.b
            java.util.LinkedHashMap r1 = r3.b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L26
        L20:
            int r2 = r2.c
            int r3 = r3.c
            if (r2 == r3) goto L28
        L26:
            r2 = 0
            return r2
        L28:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r2 = this;
            java.util.LinkedHashMap r0 = r2.a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.util.LinkedHashMap r1 = r2.b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            int r2 = r2.c
            int r2 = java.lang.Integer.hashCode(r2)
            int r2 = r2 + r1
            return r2
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "SurfaceStreamSpecQueryResult(useCaseStreamSpecs="
            r0.<init>(r1)
            java.util.LinkedHashMap r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", attachedSurfaceStreamSpecs="
            r0.append(r1)
            java.util.LinkedHashMap r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", maxSupportedFrameRate="
            r0.append(r1)
            int r2 = r2.c
            r1 = 41
            java.lang.String r2 = defpackage.xg6.q(r0, r2, r1)
            return r2
    }
}
