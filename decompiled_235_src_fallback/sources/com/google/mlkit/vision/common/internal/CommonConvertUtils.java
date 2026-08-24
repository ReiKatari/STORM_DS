package com.google.mlkit.vision.common.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class CommonConvertUtils {
    public CommonConvertUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.mlkit.vision.common.InputImage convertMlImagetoInputImage(defpackage.p64 r0) {
            r0 = 0
            throw r0
    }

    public static int convertToAndroidImageFormat(int r1) {
            r0 = 17
            if (r1 == r0) goto Lf
            r0 = 35
            if (r1 == r0) goto Lf
            r0 = 842094169(0x32315659, float:1.0322389E-8)
            if (r1 == r0) goto Lf
            r1 = 0
            return r1
        Lf:
            return r0
    }

    public static int convertToMVRotation(int r1) {
            if (r1 == 0) goto L1f
            r0 = 90
            if (r1 == r0) goto L1d
            r0 = 180(0xb4, float:2.52E-43)
            if (r1 == r0) goto L1b
            r0 = 270(0x10e, float:3.78E-43)
            if (r1 != r0) goto L10
            r1 = 3
            return r1
        L10:
            java.lang.String r0 = "Invalid rotation: "
            java.lang.String r1 = defpackage.lb1.g(r1, r0)
            defpackage.i.h(r1)
            r1 = 0
            return r1
        L1b:
            r1 = 2
            return r1
        L1d:
            r1 = 1
            return r1
        L1f:
            r1 = 0
            return r1
    }

    public static void transformPointArray(android.graphics.Point[] r6, android.graphics.Matrix r7) {
            int r0 = r6.length
            int r0 = r0 + r0
            float[] r0 = new float[r0]
            r1 = 0
            r2 = r1
        L6:
            int r3 = r6.length
            if (r2 >= r3) goto L1c
            r3 = r6[r2]
            int r4 = r3.x
            float r4 = (float) r4
            int r5 = r2 + r2
            r0[r5] = r4
            int r5 = r5 + 1
            int r3 = r3.y
            float r3 = (float) r3
            r0[r5] = r3
            int r2 = r2 + 1
            goto L6
        L1c:
            r7.mapPoints(r0)
        L1f:
            int r7 = r6.length
            if (r1 >= r7) goto L34
            r7 = r6[r1]
            int r2 = r1 + r1
            r3 = r0[r2]
            int r3 = (int) r3
            int r2 = r2 + 1
            r2 = r0[r2]
            int r2 = (int) r2
            r7.set(r3, r2)
            int r1 = r1 + 1
            goto L1f
        L34:
            return
    }

    public static void transformPointF(android.graphics.PointF r4, android.graphics.Matrix r5) {
            float r0 = r4.x
            float r1 = r4.y
            r2 = 2
            float[] r2 = new float[r2]
            r3 = 0
            r2[r3] = r0
            r0 = 1
            r2[r0] = r1
            r5.mapPoints(r2)
            r5 = r2[r3]
            r0 = r2[r0]
            r4.set(r5, r0)
            return
    }

    public static void transformPointList(java.util.List<android.graphics.PointF> r5, android.graphics.Matrix r6) {
            int r0 = r5.size()
            int r0 = r0 + r0
            float[] r0 = new float[r0]
            r1 = 0
            r2 = r1
        L9:
            int r3 = r5.size()
            if (r2 >= r3) goto L2a
            java.lang.Object r3 = r5.get(r2)
            android.graphics.PointF r3 = (android.graphics.PointF) r3
            float r3 = r3.x
            int r4 = r2 + r2
            r0[r4] = r3
            int r4 = r4 + 1
            java.lang.Object r3 = r5.get(r2)
            android.graphics.PointF r3 = (android.graphics.PointF) r3
            float r3 = r3.y
            r0[r4] = r3
            int r2 = r2 + 1
            goto L9
        L2a:
            r6.mapPoints(r0)
        L2d:
            int r6 = r5.size()
            if (r1 >= r6) goto L47
            java.lang.Object r6 = r5.get(r1)
            android.graphics.PointF r6 = (android.graphics.PointF) r6
            int r2 = r1 + r1
            r3 = r0[r2]
            int r2 = r2 + 1
            r2 = r0[r2]
            r6.set(r3, r2)
            int r1 = r1 + 1
            goto L2d
        L47:
            return
    }

    public static void transformRect(android.graphics.Rect r3, android.graphics.Matrix r4) {
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>(r3)
            r4.mapRect(r0)
            float r4 = r0.left
            int r4 = (int) r4
            float r1 = r0.top
            int r1 = (int) r1
            float r2 = r0.right
            int r2 = (int) r2
            float r0 = r0.bottom
            int r0 = (int) r0
            r3.set(r4, r1, r2, r0)
            return
    }

    private static void zza(int r10, int r11, long r12, int r14, int r15, int r16, int r17) {
            java.lang.String r0 = "vision-common"
            com.google.android.gms.internal.mlkit_vision_common.zzmj r1 = com.google.android.gms.internal.mlkit_vision_common.zzms.zzb(r0)
            r2 = r10
            r3 = r11
            r4 = r12
            r6 = r14
            r7 = r15
            r8 = r16
            r9 = r17
            com.google.android.gms.internal.mlkit_vision_common.zzmu.zzb(r1, r2, r3, r4, r6, r7, r8, r9)
            return
    }
}
