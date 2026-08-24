package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ot4  reason: default package */
/* loaded from: classes.dex */
public final class ot4 extends defpackage.hu4 {
    public final float c;
    public final float d;
    public final float e;
    public final boolean f;
    public final boolean g;
    public final float h;
    public final float i;

    public ot4(float r2, float r3, float r4, boolean r5, boolean r6, float r7, float r8) {
            r1 = this;
            r0 = 3
            r1.<init>(r0)
            r1.c = r2
            r1.d = r3
            r1.e = r4
            r1.f = r5
            r1.g = r6
            r1.h = r7
            r1.i = r8
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.ot4
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ot4 r5 = (defpackage.ot4) r5
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
            boolean r1 = r4.f
            boolean r3 = r5.f
            if (r1 == r3) goto L34
            return r2
        L34:
            boolean r1 = r4.g
            boolean r3 = r5.g
            if (r1 == r3) goto L3b
            return r2
        L3b:
            float r1 = r4.h
            float r3 = r5.h
            int r1 = java.lang.Float.compare(r1, r3)
            if (r1 == 0) goto L46
            return r2
        L46:
            float r4 = r4.i
            float r5 = r5.i
            int r4 = java.lang.Float.compare(r4, r5)
            if (r4 == 0) goto L51
            return r2
        L51:
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
            boolean r2 = r3.f
            int r0 = defpackage.xg6.e(r0, r2, r1)
            boolean r2 = r3.g
            int r0 = defpackage.xg6.e(r0, r2, r1)
            float r2 = r3.h
            int r0 = defpackage.xg6.a(r2, r0, r1)
            float r3 = r3.i
            int r3 = java.lang.Float.hashCode(r3)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ArcTo(horizontalEllipseRadius="
            r0.<init>(r1)
            float r1 = r2.c
            r0.append(r1)
            java.lang.String r1 = ", verticalEllipseRadius="
            r0.append(r1)
            float r1 = r2.d
            r0.append(r1)
            java.lang.String r1 = ", theta="
            r0.append(r1)
            float r1 = r2.e
            r0.append(r1)
            java.lang.String r1 = ", isMoreThanHalf="
            r0.append(r1)
            boolean r1 = r2.f
            r0.append(r1)
            java.lang.String r1 = ", isPositiveArc="
            r0.append(r1)
            boolean r1 = r2.g
            r0.append(r1)
            java.lang.String r1 = ", arcStartX="
            r0.append(r1)
            float r1 = r2.h
            r0.append(r1)
            java.lang.String r1 = ", arcStartY="
            r0.append(r1)
            float r2 = r2.i
            r1 = 41
            java.lang.String r2 = defpackage.xg6.p(r0, r2, r1)
            return r2
    }
}
