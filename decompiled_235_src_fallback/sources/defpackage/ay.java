package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ay  reason: default package */
/* loaded from: classes.dex */
public final class ay {
    public final defpackage.ry a;
    public final defpackage.ry b;

    public ay(defpackage.ry r1, defpackage.ry r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r3 != r2) goto L3
            goto L1d
        L3:
            boolean r0 = r3 instanceof defpackage.ay
            if (r0 == 0) goto L1f
            ay r3 = (defpackage.ay) r3
            ry r0 = r2.a
            ry r1 = r3.a
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1f
            ry r2 = r2.b
            ry r3 = r3.b
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L1f
        L1d:
            r2 = 1
            return r2
        L1f:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r2 = this;
            ry r0 = r2.a
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            ry r2 = r2.b
            int r2 = r2.hashCode()
            r2 = r2 ^ r0
            return r2
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DualOutConfig{primaryOutConfig="
            r0.<init>(r1)
            ry r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", secondaryOutConfig="
            r0.append(r1)
            ry r2 = r2.b
            r0.append(r2)
            java.lang.String r2 = "}"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
