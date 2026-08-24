package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xu3  reason: default package */
/* loaded from: classes.dex */
public final class xu3 {
    public static final defpackage.xu3 d = null;
    public final float a;
    public final int b;
    public final int c;

    static {
            xu3 r0 = new xu3
            float r1 = defpackage.uu3.c
            r2 = 17
            r3 = 0
            r0.<init>(r1, r2, r3)
            defpackage.xu3.d = r0
            return
    }

    public xu3(float r1, int r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.xu3
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            xu3 r5 = (defpackage.xu3) r5
            float r1 = r5.a
            float r3 = defpackage.uu3.b
            float r3 = r4.a
            int r1 = java.lang.Float.compare(r3, r1)
            if (r1 != 0) goto L25
            int r1 = r4.b
            int r3 = r5.b
            if (r1 != r3) goto L25
            int r4 = r4.c
            int r5 = r5.c
            if (r4 != r5) goto L25
            return r0
        L25:
            return r2
    }

    public final int hashCode() {
            r3 = this;
            float r0 = defpackage.uu3.b
            float r0 = r3.a
            int r0 = java.lang.Float.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            int r2 = r3.b
            int r0 = defpackage.lb1.a(r2, r0, r1)
            int r3 = r3.c
            int r3 = java.lang.Integer.hashCode(r3)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "LineHeightStyle(alignment="
            r0.<init>(r1)
            float r1 = r5.a
            java.lang.String r1 = defpackage.uu3.b(r1)
            r0.append(r1)
            java.lang.String r1 = ", trim="
            r0.append(r1)
            java.lang.String r1 = "Invalid"
            int r2 = r5.b
            r3 = 1
            if (r2 != r3) goto L1f
            java.lang.String r2 = "LineHeightStyle.Trim.FirstLineTop"
            goto L33
        L1f:
            r4 = 16
            if (r2 != r4) goto L26
            java.lang.String r2 = "LineHeightStyle.Trim.LastLineBottom"
            goto L33
        L26:
            r4 = 17
            if (r2 != r4) goto L2d
            java.lang.String r2 = "LineHeightStyle.Trim.Both"
            goto L33
        L2d:
            if (r2 != 0) goto L32
            java.lang.String r2 = "LineHeightStyle.Trim.None"
            goto L33
        L32:
            r2 = r1
        L33:
            r0.append(r2)
            java.lang.String r2 = ",mode="
            r0.append(r2)
            int r5 = r5.c
            if (r5 != 0) goto L42
            java.lang.String r1 = "LineHeightStyle.Mode.Fixed"
            goto L4c
        L42:
            if (r5 != r3) goto L47
            java.lang.String r1 = "LineHeightStyle.Mode.Minimum"
            goto L4c
        L47:
            r2 = 2
            if (r5 != r2) goto L4c
            java.lang.String r1 = "LineHeightStyle.Mode.Tight"
        L4c:
            r0.append(r1)
            r5 = 41
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }
}
