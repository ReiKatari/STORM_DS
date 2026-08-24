package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vt4  reason: default package */
/* loaded from: classes.dex */
public final class vt4 extends defpackage.hu4 {
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public vt4(float r2, float r3, float r4, float r5) {
            r1 = this;
            r0 = 2
            r1.<init>(r0)
            r1.c = r2
            r1.d = r3
            r1.e = r4
            r1.f = r5
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.vt4
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            vt4 r5 = (defpackage.vt4) r5
            float r1 = r4.c
            float r3 = r5.c
            int r1 = java.lang.Float.compare(r1, r3)
            if (r1 == 0) goto L17
            return r2
        L17:
            float r1 = r4.d
            float r3 = r5.d
            int r1 = java.lang.Float.compare(r1, r3)
            if (r1 == 0) goto L22
            return r2
        L22:
            float r1 = r4.e
            float r3 = r5.e
            int r1 = java.lang.Float.compare(r1, r3)
            if (r1 == 0) goto L2d
            return r2
        L2d:
            float r4 = r4.f
            float r5 = r5.f
            int r4 = java.lang.Float.compare(r4, r5)
            if (r4 == 0) goto L38
            return r2
        L38:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            float r0 = r3.c
            int r0 = java.lang.Float.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            float r2 = r3.d
            int r0 = defpackage.xg6.a(r2, r0, r1)
            float r2 = r3.e
            int r0 = defpackage.xg6.a(r2, r0, r1)
            float r3 = r3.f
            int r3 = java.lang.Float.hashCode(r3)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ReflectiveCurveTo(x1="
            r0.<init>(r1)
            float r1 = r2.c
            r0.append(r1)
            java.lang.String r1 = ", y1="
            r0.append(r1)
            float r1 = r2.d
            r0.append(r1)
            java.lang.String r1 = ", x2="
            r0.append(r1)
            float r1 = r2.e
            r0.append(r1)
            java.lang.String r1 = ", y2="
            r0.append(r1)
            float r2 = r2.f
            r1 = 41
            java.lang.String r2 = defpackage.xg6.p(r0, r2, r1)
            return r2
    }
}
