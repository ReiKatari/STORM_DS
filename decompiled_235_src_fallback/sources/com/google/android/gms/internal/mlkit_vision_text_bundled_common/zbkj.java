package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbkj {
    public static int zba(int r1, int r2, java.lang.String r3) {
            if (r1 < 0) goto L6
            if (r1 < r2) goto L5
            goto L6
        L5:
            return r1
        L6:
            java.lang.IndexOutOfBoundsException r3 = new java.lang.IndexOutOfBoundsException
            java.lang.String r0 = "index"
            if (r1 < 0) goto L2c
            if (r2 >= 0) goto L19
            java.lang.String r1 = "negative size: "
            java.lang.String r1 = defpackage.lb1.g(r2, r1)
            defpackage.i.h(r1)
            r1 = 0
            return r1
        L19:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r1 = new java.lang.Object[]{r0, r1, r2}
            java.lang.String r2 = "%s (%s) must be less than size (%s)"
            java.lang.String r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkp.zba(r2, r1)
            goto L3a
        L2c:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r0, r1}
            java.lang.String r2 = "%s (%s) must not be negative"
            java.lang.String r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkp.zba(r2, r1)
        L3a:
            r3.<init>(r1)
            throw r3
    }

    public static int zbb(int r0, int r1, java.lang.String r2) {
            if (r0 < 0) goto L5
            if (r0 > r1) goto L5
            return r0
        L5:
            java.lang.String r2 = "index"
            java.lang.String r0 = zbe(r0, r1, r2)
            defpackage.e41.q(r0)
            r0 = 0
            return r0
    }

    public static void zbc(boolean r0) {
            if (r0 == 0) goto L3
            return
        L3:
            defpackage.u34.t()
            return
    }

    public static void zbd(int r1, int r2, int r3) {
            if (r1 < 0) goto L8
            if (r2 < r1) goto L8
            if (r2 <= r3) goto L7
            goto L8
        L7:
            return
        L8:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            if (r1 < 0) goto L2d
            if (r1 > r3) goto L2d
            if (r2 < 0) goto L26
            if (r2 <= r3) goto L13
            goto L26
        L13:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r2, r1}
            java.lang.String r2 = "end index (%s) must not be less than start index (%s)"
            java.lang.String r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkp.zba(r2, r1)
            goto L33
        L26:
            java.lang.String r1 = "end index"
            java.lang.String r1 = zbe(r2, r3, r1)
            goto L33
        L2d:
            java.lang.String r2 = "start index"
            java.lang.String r1 = zbe(r1, r3, r2)
        L33:
            r0.<init>(r1)
            throw r0
    }

    private static java.lang.String zbe(int r0, int r1, java.lang.String r2) {
            if (r0 >= 0) goto L11
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r2, r0}
            java.lang.String r1 = "%s (%s) must not be negative"
            java.lang.String r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkp.zba(r1, r0)
            return r0
        L11:
            if (r1 < 0) goto L26
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r0 = new java.lang.Object[]{r2, r0, r1}
            java.lang.String r1 = "%s (%s) must not be greater than size (%s)"
            java.lang.String r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkp.zba(r1, r0)
            return r0
        L26:
            java.lang.String r0 = "negative size: "
            java.lang.String r0 = defpackage.lb1.g(r1, r0)
            defpackage.i.h(r0)
            r0 = 0
            return r0
    }
}
