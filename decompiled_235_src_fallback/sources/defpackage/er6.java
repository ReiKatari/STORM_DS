package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: er6  reason: default package */
/* loaded from: classes.dex */
public final class er6 extends defpackage.s35 {
    public static boolean I() {
            java.lang.Class<androidx.camera.camera2.compat.quirk.PixelJpegRSupportedQuirk> r0 = androidx.camera.camera2.compat.quirk.PixelJpegRSupportedQuirk.class
            y65 r1 = defpackage.si1.a()
            u65 r0 = r1.b(r0)
            if (r0 == 0) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }

    @Override // defpackage.s35
    public final java.lang.Integer[] w() {
            r7 = this;
            java.lang.Integer[] r7 = super.w()
            boolean r0 = I()
            if (r0 == 0) goto L30
            if (r7 == 0) goto L2f
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r7.length
            r2 = 0
            r3 = r2
        L14:
            if (r3 >= r1) goto L26
            r4 = r7[r3]
            int r5 = r4.intValue()
            r6 = 4101(0x1005, float:5.747E-42)
            if (r5 == r6) goto L23
            r0.add(r4)
        L23:
            int r3 = r3 + 1
            goto L14
        L26:
            java.lang.Integer[] r7 = new java.lang.Integer[r2]
            java.lang.Object[] r7 = r0.toArray(r7)
            java.lang.Integer[] r7 = (java.lang.Integer[]) r7
            return r7
        L2f:
            r7 = 0
        L30:
            return r7
    }

    @Override // defpackage.s35
    public final long x(int r2, android.util.Size r3) {
            r1 = this;
            r3.getClass()
            r0 = 4101(0x1005, float:5.747E-42)
            if (r2 != r0) goto L10
            boolean r0 = I()
            if (r0 == 0) goto L10
            r1 = 0
            return r1
        L10:
            long r1 = super.x(r2, r3)
            return r1
    }

    @Override // defpackage.s35
    public final android.util.Size[] y(int r2) {
            r1 = this;
            r0 = 4101(0x1005, float:5.747E-42)
            if (r2 != r0) goto Lc
            boolean r0 = I()
            if (r0 == 0) goto Lc
            r1 = 0
            return r1
        Lc:
            android.util.Size[] r1 = super.y(r2)
            return r1
    }
}
