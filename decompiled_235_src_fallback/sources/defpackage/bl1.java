package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bl1  reason: default package */
/* loaded from: classes.dex */
public final class bl1 {
    public final java.lang.String a;
    public final int b;
    public final int c;

    public bl1(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof defpackage.bl1
            if (r1 != 0) goto L9
            goto L22
        L9:
            bl1 r4 = (defpackage.bl1) r4
            java.lang.String r1 = r3.a
            java.lang.String r2 = r4.a
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L22
            int r1 = r3.b
            int r2 = r4.b
            if (r1 != r2) goto L22
            int r3 = r3.c
            int r4 = r4.c
            if (r3 != r4) goto L22
            return r0
        L22:
            r3 = 0
            return r3
    }

    public final int hashCode() {
            r9 = this;
            int r0 = r9.b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            int r0 = r9.c
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r4 = java.lang.Float.valueOf(r0)
            r0 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = r9.a
            r6 = r5
            r7 = r5
            r8 = r4
            java.lang.Object[] r9 = new java.lang.Object[]{r1, r2, r3, r4, r5, r6, r7, r8}
            int r9 = java.util.Objects.hash(r9)
            return r9
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DisplayShapeCompat{ spec="
            r0.<init>(r1)
            java.lang.String r1 = r2.a
            int r1 = r1.hashCode()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.append(r1)
            java.lang.String r1 = " displayWidth="
            r0.append(r1)
            int r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = " displayHeight="
            r0.append(r1)
            int r2 = r2.c
            java.lang.String r1 = " physicalPixelDisplaySizeRatio=1.0 rotation=0 offsetX=0 offsetY=0 scale=1.0}"
            java.lang.String r2 = defpackage.lb1.o(r0, r2, r1)
            return r2
    }
}
