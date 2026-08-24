package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hj  reason: default package */
/* loaded from: classes.dex */
public final class hj {
    public final android.graphics.Path a;
    public android.graphics.RectF b;
    public float[] c;
    public android.graphics.Matrix d;

    public hj(android.graphics.Path r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public static void a(defpackage.hj r2, defpackage.hj r3) {
            android.graphics.Path r2 = r2.a
            android.graphics.Path r3 = r3.a
            r0 = 0
            float r1 = java.lang.Float.intBitsToFloat(r0)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            r2.addPath(r3, r1, r0)
            return
    }

    public static void b(defpackage.hj r5, defpackage.of5 r6) {
            kt4 r0 = defpackage.kt4.CounterClockwise
            float r1 = r6.a
            float r2 = r6.d
            float r3 = r6.c
            float r6 = r6.b
            boolean r4 = java.lang.Float.isNaN(r1)
            if (r4 != 0) goto L22
            boolean r4 = java.lang.Float.isNaN(r6)
            if (r4 != 0) goto L22
            boolean r4 = java.lang.Float.isNaN(r3)
            if (r4 != 0) goto L22
            boolean r4 = java.lang.Float.isNaN(r2)
            if (r4 == 0) goto L27
        L22:
            java.lang.String r4 = "Invalid rectangle, make sure no value is NaN"
            defpackage.lj.b(r4)
        L27:
            android.graphics.RectF r4 = r5.b
            if (r4 != 0) goto L32
            android.graphics.RectF r4 = new android.graphics.RectF
            r4.<init>()
            r5.b = r4
        L32:
            android.graphics.RectF r4 = r5.b
            r4.getClass()
            r4.set(r1, r6, r3, r2)
            android.graphics.Path r6 = r5.a
            android.graphics.RectF r5 = r5.b
            r5.getClass()
            int[] r1 = defpackage.kj.a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            if (r0 == r1) goto L56
            r1 = 2
            if (r0 != r1) goto L52
            android.graphics.Path$Direction r0 = android.graphics.Path.Direction.CW
            goto L58
        L52:
            defpackage.i.d()
            return
        L56:
            android.graphics.Path$Direction r0 = android.graphics.Path.Direction.CCW
        L58:
            r6.addRect(r5, r0)
            return
    }

    public static void c(defpackage.hj r15, defpackage.u16 r16) {
            r1 = r16
            kt4 r2 = defpackage.kt4.CounterClockwise
            android.graphics.RectF r3 = r15.b
            if (r3 != 0) goto Lf
            android.graphics.RectF r3 = new android.graphics.RectF
            r3.<init>()
            r15.b = r3
        Lf:
            android.graphics.RectF r3 = r15.b
            r3.getClass()
            float r4 = r1.a
            long r5 = r1.h
            long r7 = r1.g
            long r9 = r1.f
            long r11 = r1.e
            float r13 = r1.b
            float r14 = r1.c
            float r1 = r1.d
            r3.set(r4, r13, r14, r1)
            float[] r1 = r15.c
            if (r1 != 0) goto L31
            r1 = 8
            float[] r1 = new float[r1]
            r15.c = r1
        L31:
            float[] r1 = r15.c
            r1.getClass()
            r3 = 32
            long r13 = r11 >> r3
            int r4 = (int) r13
            float r4 = java.lang.Float.intBitsToFloat(r4)
            r13 = 0
            r1[r13] = r4
            r13 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r11 = r11 & r13
            int r4 = (int) r11
            float r4 = java.lang.Float.intBitsToFloat(r4)
            r11 = 1
            r1[r11] = r4
            r16 = r3
            long r3 = r9 >> r16
            int r3 = (int) r3
            float r3 = java.lang.Float.intBitsToFloat(r3)
            r4 = 2
            r1[r4] = r3
            long r9 = r9 & r13
            int r3 = (int) r9
            float r3 = java.lang.Float.intBitsToFloat(r3)
            r9 = 3
            r1[r9] = r3
            long r9 = r7 >> r16
            int r3 = (int) r9
            float r3 = java.lang.Float.intBitsToFloat(r3)
            r9 = 4
            r1[r9] = r3
            long r7 = r7 & r13
            int r3 = (int) r7
            float r3 = java.lang.Float.intBitsToFloat(r3)
            r7 = 5
            r1[r7] = r3
            long r7 = r5 >> r16
            int r3 = (int) r7
            float r3 = java.lang.Float.intBitsToFloat(r3)
            r7 = 6
            r1[r7] = r3
            long r5 = r5 & r13
            int r3 = (int) r5
            float r3 = java.lang.Float.intBitsToFloat(r3)
            r5 = 7
            r1[r5] = r3
            android.graphics.Path r1 = r15.a
            android.graphics.RectF r3 = r15.b
            r3.getClass()
            float[] r0 = r15.c
            r0.getClass()
            int[] r5 = defpackage.kj.a
            int r2 = r2.ordinal()
            r2 = r5[r2]
            if (r2 == r11) goto Laa
            if (r2 != r4) goto La6
            android.graphics.Path$Direction r2 = android.graphics.Path.Direction.CW
            goto Lac
        La6:
            defpackage.i.d()
            return
        Laa:
            android.graphics.Path$Direction r2 = android.graphics.Path.Direction.CCW
        Lac:
            r1.addRoundRect(r3, r0, r2)
            return
    }

    public final defpackage.of5 d() {
            r4 = this;
            android.graphics.RectF r0 = r4.b
            if (r0 != 0) goto Lb
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r4.b = r0
        Lb:
            android.graphics.RectF r0 = r4.b
            r0.getClass()
            android.graphics.Path r4 = r4.a
            r1 = 1
            r4.computeBounds(r0, r1)
            of5 r4 = new of5
            float r1 = r0.left
            float r2 = r0.top
            float r3 = r0.right
            float r0 = r0.bottom
            r4.<init>(r1, r2, r3, r0)
            return r4
    }

    public final void e(float r1, float r2) {
            r0 = this;
            android.graphics.Path r0 = r0.a
            r0.lineTo(r1, r2)
            return
    }

    public final boolean f(defpackage.hj r4, defpackage.hj r5, int r6) {
            r3 = this;
            if (r6 != 0) goto L5
            android.graphics.Path$Op r6 = android.graphics.Path.Op.DIFFERENCE
            goto L19
        L5:
            r0 = 1
            if (r6 != r0) goto Lb
            android.graphics.Path$Op r6 = android.graphics.Path.Op.INTERSECT
            goto L19
        Lb:
            r0 = 4
            if (r6 != r0) goto L11
            android.graphics.Path$Op r6 = android.graphics.Path.Op.REVERSE_DIFFERENCE
            goto L19
        L11:
            r0 = 2
            if (r6 != r0) goto L17
            android.graphics.Path$Op r6 = android.graphics.Path.Op.UNION
            goto L19
        L17:
            android.graphics.Path$Op r6 = android.graphics.Path.Op.XOR
        L19:
            boolean r0 = r4 instanceof defpackage.hj
            r1 = 0
            java.lang.String r2 = "Unable to obtain android.graphics.Path"
            if (r0 == 0) goto L33
            android.graphics.Path r4 = r4.a
            boolean r0 = r5 instanceof defpackage.hj
            if (r0 == 0) goto L2f
            android.graphics.Path r5 = r5.a
            android.graphics.Path r3 = r3.a
            boolean r3 = r3.op(r4, r5, r6)
            return r3
        L2f:
            defpackage.fa6.h(r2)
            return r1
        L33:
            defpackage.fa6.h(r2)
            return r1
    }

    public final void g() {
            r0 = this;
            android.graphics.Path r0 = r0.a
            r0.reset()
            return
    }

    public final void h(int r2) {
            r1 = this;
            r0 = 1
            if (r2 != r0) goto L6
            android.graphics.Path$FillType r2 = android.graphics.Path.FillType.EVEN_ODD
            goto L8
        L6:
            android.graphics.Path$FillType r2 = android.graphics.Path.FillType.WINDING
        L8:
            android.graphics.Path r1 = r1.a
            r1.setFillType(r2)
            return
    }

    public final void i(long r5) {
            r4 = this;
            android.graphics.Matrix r0 = r4.d
            if (r0 != 0) goto Lc
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r4.d = r0
            goto Lf
        Lc:
            r0.reset()
        Lf:
            android.graphics.Matrix r0 = r4.d
            r0.getClass()
            r1 = 32
            long r1 = r5 >> r1
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r5 = r5 & r2
            int r5 = (int) r5
            float r5 = java.lang.Float.intBitsToFloat(r5)
            r0.setTranslate(r1, r5)
            android.graphics.Matrix r5 = r4.d
            r5.getClass()
            android.graphics.Path r4 = r4.a
            r4.transform(r5)
            return
    }
}
