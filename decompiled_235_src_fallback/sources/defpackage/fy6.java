package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fy6  reason: default package */
/* loaded from: classes.dex */
public final class fy6 {
    public final float a;
    public final float b;

    public fy6(float r1, float r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L21
        L3:
            boolean r0 = r3 instanceof defpackage.fy6
            if (r0 != 0) goto L8
            goto L1f
        L8:
            fy6 r3 = (defpackage.fy6) r3
            float r0 = r3.a
            float r1 = r2.a
            boolean r0 = defpackage.om1.b(r1, r0)
            if (r0 != 0) goto L15
            goto L1f
        L15:
            float r2 = r2.b
            float r3 = r3.b
            boolean r2 = defpackage.om1.b(r2, r3)
            if (r2 != 0) goto L21
        L1f:
            r2 = 0
            return r2
        L21:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r1 = this;
            float r0 = r1.a
            int r0 = java.lang.Float.hashCode(r0)
            int r0 = r0 * 31
            float r1 = r1.b
            int r1 = java.lang.Float.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "TabPosition(left="
            r0.<init>(r1)
            float r1 = r3.a
            java.lang.String r2 = defpackage.om1.c(r1)
            r0.append(r2)
            java.lang.String r2 = ", right="
            r0.append(r2)
            float r3 = r3.b
            float r1 = r1 + r3
            java.lang.String r1 = defpackage.om1.c(r1)
            r0.append(r1)
            java.lang.String r1 = ", width="
            r0.append(r1)
            java.lang.String r3 = defpackage.om1.c(r3)
            r0.append(r3)
            r3 = 41
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
