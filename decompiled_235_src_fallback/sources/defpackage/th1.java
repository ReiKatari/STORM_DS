package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: th1  reason: default package */
/* loaded from: classes.dex */
public final class th1 implements defpackage.qh1 {
    public final float A;
    public final float B;

    public th1(float r1, float r2) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            r0.B = r2
            return
    }

    @Override // defpackage.qh1
    public final float Y() {
            r0 = this;
            float r0 = r0.B
            return r0
    }

    @Override // defpackage.qh1
    public final float a() {
            r0 = this;
            float r0 = r0.A
            return r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.th1
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            th1 r5 = (defpackage.th1) r5
            float r1 = r4.A
            float r3 = r5.A
            int r1 = java.lang.Float.compare(r1, r3)
            if (r1 == 0) goto L17
            return r2
        L17:
            float r4 = r4.B
            float r5 = r5.B
            int r4 = java.lang.Float.compare(r4, r5)
            if (r4 == 0) goto L22
            return r2
        L22:
            return r0
    }

    public final int hashCode() {
            r1 = this;
            float r0 = r1.A
            int r0 = java.lang.Float.hashCode(r0)
            int r0 = r0 * 31
            float r1 = r1.B
            int r1 = java.lang.Float.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DensityImpl(density="
            r0.<init>(r1)
            float r1 = r2.A
            r0.append(r1)
            java.lang.String r1 = ", fontScale="
            r0.append(r1)
            float r2 = r2.B
            r1 = 41
            java.lang.String r2 = defpackage.xg6.p(r0, r2, r1)
            return r2
    }
}
