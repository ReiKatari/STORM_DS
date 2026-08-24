package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ry7  reason: default package */
/* loaded from: classes.dex */
public final class ry7 {
    public final float a;
    public final float b;

    public ry7(float r1, float r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L2a
        L3:
            boolean r0 = r3 instanceof defpackage.ry7
            if (r0 != 0) goto L8
            goto L28
        L8:
            ry7 r3 = (defpackage.ry7) r3
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = java.lang.Float.compare(r0, r0)
            if (r0 == 0) goto L13
            goto L28
        L13:
            float r0 = r2.a
            float r1 = r3.a
            int r0 = java.lang.Float.compare(r0, r1)
            if (r0 == 0) goto L1e
            goto L28
        L1e:
            float r2 = r2.b
            float r3 = r3.b
            int r2 = java.lang.Float.compare(r2, r3)
            if (r2 == 0) goto L2a
        L28:
            r2 = 0
            return r2
        L2a:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = java.lang.Float.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            float r2 = r3.a
            int r0 = defpackage.xg6.a(r2, r0, r1)
            float r3 = r3.b
            int r3 = java.lang.Float.hashCode(r3)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ZoomValue(zoomRatio=1.0, minZoomRatio="
            r0.<init>(r1)
            float r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", maxZoomRatio="
            r0.append(r1)
            float r2 = r2.b
            r1 = 41
            java.lang.String r2 = defpackage.xg6.p(r0, r2, r1)
            return r2
    }
}
