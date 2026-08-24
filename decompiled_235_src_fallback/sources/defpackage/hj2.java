package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hj2  reason: default package */
/* loaded from: classes.dex */
public final class hj2 implements defpackage.fj2 {
    public final float[] a;
    public final float[] b;

    static {
            return
    }

    public hj2(float[] r3, float[] r4) {
            r2 = this;
            r2.<init>()
            int r0 = r3.length
            int r1 = r4.length
            if (r0 != r1) goto Lf
            int r0 = r3.length
            if (r0 == 0) goto Lf
            r2.a = r3
            r2.b = r4
            return
        Lf:
            java.lang.String r2 = "Array lengths must match and be nonzero"
            defpackage.i.h(r2)
            r2 = 0
            throw r2
    }

    @Override // defpackage.fj2
    public final float a(float r2) {
            r1 = this;
            float[] r0 = r1.b
            float[] r1 = r1.a
            float r1 = defpackage.x31.m(r2, r0, r1)
            return r1
    }

    @Override // defpackage.fj2
    public final float b(float r2) {
            r1 = this;
            float[] r0 = r1.a
            float[] r1 = r1.b
            float r1 = defpackage.x31.m(r2, r0, r1)
            return r1
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L21
        L3:
            if (r3 != 0) goto L6
            goto L23
        L6:
            boolean r0 = r3 instanceof defpackage.hj2
            if (r0 != 0) goto Lb
            goto L23
        Lb:
            hj2 r3 = (defpackage.hj2) r3
            float[] r0 = r3.a
            float[] r1 = r2.a
            boolean r0 = java.util.Arrays.equals(r1, r0)
            if (r0 == 0) goto L23
            float[] r2 = r2.b
            float[] r3 = r3.b
            boolean r2 = java.util.Arrays.equals(r2, r3)
            if (r2 == 0) goto L23
        L21:
            r2 = 1
            return r2
        L23:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r1 = this;
            float[] r0 = r1.a
            int r0 = java.util.Arrays.hashCode(r0)
            int r0 = r0 * 31
            float[] r1 = r1.b
            int r1 = java.util.Arrays.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "FontScaleConverter{fromSpValues="
            r0.<init>(r1)
            float[] r1 = r2.a
            java.lang.String r1 = java.util.Arrays.toString(r1)
            r1.getClass()
            r0.append(r1)
            java.lang.String r1 = ", toDpValues="
            r0.append(r1)
            float[] r2 = r2.b
            java.lang.String r2 = java.util.Arrays.toString(r2)
            r2.getClass()
            r0.append(r2)
            r2 = 125(0x7d, float:1.75E-43)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
