package com.google.mlkit.vision.text.pipeline;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zbf {
    public static android.graphics.Rect zba(java.util.List r6, android.graphics.Matrix r7) {
            java.util.Iterator r6 = r6.iterator()
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = 2147483647(0x7fffffff, float:NaN)
            r2 = r1
            r3 = r2
            r1 = r0
        Lc:
            boolean r4 = r6.hasNext()
            if (r4 == 0) goto L31
            java.lang.Object r4 = r6.next()
            android.graphics.Point r4 = (android.graphics.Point) r4
            int r5 = r4.x
            int r2 = java.lang.Math.min(r2, r5)
            int r5 = r4.x
            int r0 = java.lang.Math.max(r0, r5)
            int r5 = r4.y
            int r3 = java.lang.Math.min(r3, r5)
            int r4 = r4.y
            int r1 = java.lang.Math.max(r1, r4)
            goto Lc
        L31:
            float r6 = (float) r2
            float r2 = (float) r3
            float r0 = (float) r0
            float r1 = (float) r1
            android.graphics.RectF r3 = new android.graphics.RectF
            r3.<init>(r6, r2, r0, r1)
            if (r7 == 0) goto L3f
            r7.mapRect(r3)
        L3f:
            android.graphics.Rect r6 = new android.graphics.Rect
            r6.<init>()
            r3.round(r6)
            return r6
    }

    public static com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbpb zbb(com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbaaj r1) {
            boolean r0 = r1.zbi()
            if (r0 == 0) goto Lf
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbow r1 = r1.zbc()
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbpb r1 = r1.zbd()
            return r1
        Lf:
            boolean r0 = r1.zbH()
            if (r0 == 0) goto L1e
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbaai r1 = r1.zbf()
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbpb r1 = r1.zbc()
            return r1
        L1e:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbpb r1 = r1.zbe()
            return r1
    }

    public static java.util.List zbc(com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbpb r15) {
            r0 = 4
            android.graphics.Point[] r0 = new android.graphics.Point[r0]
            float r1 = r15.zba()
            double r1 = (double) r1
            double r1 = java.lang.Math.toRadians(r1)
            double r1 = java.lang.Math.sin(r1)
            float r3 = r15.zba()
            double r3 = (double) r3
            double r3 = java.lang.Math.toRadians(r3)
            double r3 = java.lang.Math.cos(r3)
            android.graphics.Point r5 = new android.graphics.Point
            int r6 = r15.zbd()
            int r7 = r15.zbe()
            r5.<init>(r6, r7)
            r6 = 0
            r0[r6] = r5
            android.graphics.Point r5 = new android.graphics.Point
            int r7 = r15.zbd()
            double r7 = (double) r7
            int r9 = r15.zbf()
            double r9 = (double) r9
            double r9 = r9 * r3
            int r11 = r15.zbe()
            double r11 = (double) r11
            int r13 = r15.zbf()
            double r13 = (double) r13
            double r13 = r13 * r1
            double r13 = r13 + r11
            double r7 = r7 + r9
            int r7 = (int) r7
            int r8 = (int) r13
            r5.<init>(r7, r8)
            r7 = 1
            r0[r7] = r5
            android.graphics.Point r8 = new android.graphics.Point
            int r5 = r5.x
            double r9 = (double) r5
            int r5 = r15.zbc()
            double r11 = (double) r5
            double r11 = r11 * r1
            r1 = r0[r7]
            int r1 = r1.y
            double r1 = (double) r1
            int r15 = r15.zbc()
            double r13 = (double) r15
            double r13 = r13 * r3
            double r13 = r13 + r1
            double r9 = r9 - r11
            int r15 = (int) r9
            int r1 = (int) r13
            r8.<init>(r15, r1)
            r15 = 2
            r0[r15] = r8
            android.graphics.Point r1 = new android.graphics.Point
            r2 = r0[r6]
            int r3 = r2.x
            r15 = r0[r15]
            int r4 = r15.x
            r5 = r0[r7]
            int r6 = r5.x
            int r4 = r4 - r6
            int r4 = r4 + r3
            int r2 = r2.y
            int r15 = r15.y
            int r3 = r5.y
            int r15 = r15 - r3
            int r15 = r15 + r2
            r1.<init>(r4, r15)
            r15 = 3
            r0[r15] = r1
            java.util.List r15 = java.util.Arrays.asList(r0)
            return r15
    }
}
