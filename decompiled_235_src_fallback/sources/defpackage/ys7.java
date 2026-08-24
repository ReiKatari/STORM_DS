package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ys7  reason: default package */
/* loaded from: classes.dex */
public final class ys7 {
    public final float a;
    public final float b;

    public ys7(float r1, float r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    public final float[] a() {
            r4 = this;
            float r0 = r4.a
            float r4 = r4.b
            float r1 = r0 / r4
            r2 = 1065353216(0x3f800000, float:1.0)
            float r0 = r2 - r0
            float r0 = r0 - r4
            float r0 = r0 / r4
            r4 = 3
            float[] r4 = new float[r4]
            r3 = 0
            r4[r3] = r1
            r1 = 1
            r4[r1] = r2
            r1 = 2
            r4[r1] = r0
            return r4
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.ys7
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ys7 r5 = (defpackage.ys7) r5
            float r1 = r4.a
            float r3 = r5.a
            int r1 = java.lang.Float.compare(r1, r3)
            if (r1 == 0) goto L17
            return r2
        L17:
            float r4 = r4.b
            float r5 = r5.b
            int r4 = java.lang.Float.compare(r4, r5)
            if (r4 == 0) goto L22
            return r2
        L22:
            return r0
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
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "WhitePoint(x="
            r0.<init>(r1)
            float r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", y="
            r0.append(r1)
            float r2 = r2.b
            r1 = 41
            java.lang.String r2 = defpackage.xg6.p(r0, r2, r1)
            return r2
    }
}
