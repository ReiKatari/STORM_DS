package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: c73  reason: default package */
/* loaded from: classes.dex */
public final class c73 {
    public float a;
    public boolean b;

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L1d
        L3:
            boolean r0 = r3 instanceof defpackage.c73
            if (r0 != 0) goto L8
            goto L1b
        L8:
            c73 r3 = (defpackage.c73) r3
            float r0 = r2.a
            float r1 = r3.a
            int r0 = java.lang.Float.compare(r0, r1)
            if (r0 == 0) goto L15
            goto L1b
        L15:
            boolean r2 = r2.b
            boolean r3 = r3.b
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
            float r0 = r1.a
            int r0 = java.lang.Float.hashCode(r0)
            int r0 = r0 * 31
            boolean r1 = r1.b
            int r1 = java.lang.Boolean.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            float r0 = r3.a
            boolean r3 = r3.b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "AxisState(value="
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = ", active="
            r1.append(r0)
            r1.append(r3)
            java.lang.String r3 = ")"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            return r3
    }
}
