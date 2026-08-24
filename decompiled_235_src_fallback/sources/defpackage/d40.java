package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: d40  reason: default package */
/* loaded from: classes.dex */
public final class d40 {
    public final float a;

    public d40(float r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public final int a(int r1, int r2) {
            r0 = this;
            int r2 = r2 - r1
            float r1 = (float) r2
            r2 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r2
            r2 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0.a
            float r2 = r2 + r0
            float r2 = r2 * r1
            int r0 = java.lang.Math.round(r2)
            return r0
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof defpackage.d40
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            d40 r4 = (defpackage.d40) r4
            float r3 = r3.a
            float r4 = r4.a
            int r3 = java.lang.Float.compare(r3, r4)
            if (r3 == 0) goto L17
            return r2
        L17:
            return r0
    }

    public final int hashCode() {
            r0 = this;
            float r0 = r0.a
            int r0 = java.lang.Float.hashCode(r0)
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Vertical(bias="
            r0.<init>(r1)
            float r2 = r2.a
            r1 = 41
            java.lang.String r2 = defpackage.xg6.p(r0, r2, r1)
            return r2
    }
}
