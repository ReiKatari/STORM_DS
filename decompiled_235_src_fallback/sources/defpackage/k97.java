package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: k97  reason: default package */
/* loaded from: classes.dex */
public abstract class k97 {
    public static final android.graphics.RectF a = null;

    static {
            android.graphics.RectF r0 = new android.graphics.RectF
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r1, r1, r2, r2)
            defpackage.k97.a = r0
            return
    }

    public static android.graphics.Matrix a(android.graphics.RectF r3, android.graphics.RectF r4, int r5, boolean r6) {
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            android.graphics.Matrix$ScaleToFit r1 = android.graphics.Matrix.ScaleToFit.FILL
            android.graphics.RectF r2 = defpackage.k97.a
            r0.setRectToRect(r3, r2, r1)
            float r3 = (float) r5
            r0.postRotate(r3)
            if (r6 == 0) goto L19
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            r5 = 1065353216(0x3f800000, float:1.0)
            r0.postScale(r3, r5)
        L19:
            android.graphics.Matrix r3 = new android.graphics.Matrix
            r3.<init>()
            r3.setRectToRect(r2, r4, r1)
            r0.postConcat(r3)
            return r0
    }

    public static int b(android.graphics.Matrix r4) {
            r0 = 9
            float[] r0 = new float[r0]
            r4.getValues(r0)
            r4 = 0
            r4 = r0[r4]
            r1 = 3
            r0 = r0[r1]
            double r0 = (double) r0
            double r2 = (double) r4
            double r0 = java.lang.Math.atan2(r0, r2)
            r2 = 4633260481411531256(0x404ca5dc1a63c1f8, double:57.29577951308232)
            double r0 = r0 * r2
            long r0 = java.lang.Math.round(r0)
            int r4 = (int) r0
            int r4 = i(r4)
            return r4
    }

    public static boolean c(int r1) {
            r0 = 90
            if (r1 == r0) goto L1d
            r0 = 270(0x10e, float:3.78E-43)
            if (r1 != r0) goto L9
            goto L1d
        L9:
            if (r1 == 0) goto L1b
            r0 = 180(0xb4, float:2.52E-43)
            if (r1 != r0) goto L10
            goto L1b
        L10:
            java.lang.String r0 = "Invalid rotation degrees: "
            java.lang.String r1 = defpackage.lb1.g(r1, r0)
            defpackage.i.h(r1)
            r1 = 0
            return r1
        L1b:
            r1 = 0
            return r1
        L1d:
            r1 = 1
            return r1
    }

    public static boolean d(android.util.Size r4, android.util.Size r5) {
            int r0 = r4.getWidth()
            float r0 = (float) r0
            r1 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 + r1
            int r2 = r4.getHeight()
            float r2 = (float) r2
            float r2 = r2 - r1
            float r0 = r0 / r2
            int r2 = r4.getWidth()
            float r2 = (float) r2
            float r2 = r2 - r1
            int r4 = r4.getHeight()
            float r4 = (float) r4
            float r4 = r4 + r1
            float r2 = r2 / r4
            int r4 = r5.getWidth()
            float r4 = (float) r4
            float r4 = r4 + r1
            int r3 = r5.getHeight()
            float r3 = (float) r3
            float r3 = r3 - r1
            float r4 = r4 / r3
            int r3 = r5.getWidth()
            float r3 = (float) r3
            float r3 = r3 - r1
            int r5 = r5.getHeight()
            float r5 = (float) r5
            float r5 = r5 + r1
            float r3 = r3 / r5
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 < 0) goto L40
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 < 0) goto L40
            r4 = 1
            return r4
        L40:
            r4 = 0
            return r4
    }

    public static boolean e(android.graphics.Matrix r9) {
            r0 = 4
            float[] r0 = new float[r0]
            r0 = {x0044: FILL_ARRAY_DATA  , data: [0, 1065353216, 1065353216, 0} // fill-array
            r9.mapVectors(r0)
            r9 = 0
            r1 = r0[r9]
            r2 = 1
            r3 = r0[r2]
            r4 = 2
            r4 = r0[r4]
            r5 = 3
            r0 = r0[r5]
            float r5 = r1 * r4
            float r6 = r3 * r0
            float r6 = r6 + r5
            float r5 = r1 * r0
            float r7 = r3 * r4
            float r5 = r5 - r7
            float r1 = r1 * r1
            float r3 = r3 * r3
            float r3 = r3 + r1
            double r7 = (double) r3
            double r7 = java.lang.Math.sqrt(r7)
            float r4 = r4 * r4
            float r0 = r0 * r0
            float r0 = r0 + r4
            double r0 = (double) r0
            double r0 = java.lang.Math.sqrt(r0)
            double r3 = (double) r6
            double r7 = r7 * r0
            double r3 = r3 / r7
            double r0 = (double) r5
            double r0 = r0 / r7
            double r0 = java.lang.Math.atan2(r0, r3)
            double r0 = java.lang.Math.toDegrees(r0)
            float r0 = (float) r0
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L43
            return r2
        L43:
            return r9
    }

    public static android.util.Size f(android.graphics.Rect r2) {
            android.util.Size r0 = new android.util.Size
            int r1 = r2.width()
            int r2 = r2.height()
            r0.<init>(r1, r2)
            return r0
    }

    public static android.util.Size g(int r3, android.util.Size r4) {
            int r0 = r3 % 90
            if (r0 != 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Invalid rotation degrees: "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            defpackage.np2.s(r1, r0)
            int r3 = i(r3)
            boolean r3 = c(r3)
            if (r3 == 0) goto L30
            android.util.Size r3 = new android.util.Size
            int r0 = r4.getHeight()
            int r4 = r4.getWidth()
            r3.<init>(r0, r4)
            return r3
        L30:
            return r4
    }

    public static android.graphics.RectF h(android.util.Size r3) {
            android.graphics.RectF r0 = new android.graphics.RectF
            int r1 = r3.getWidth()
            float r1 = (float) r1
            int r3 = r3.getHeight()
            float r3 = (float) r3
            r2 = 0
            r0.<init>(r2, r2, r1, r3)
            return r0
    }

    public static int i(int r0) {
            int r0 = r0 % 360
            int r0 = r0 + 360
            int r0 = r0 % 360
            return r0
    }
}
