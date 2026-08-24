package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: v74  reason: default package */
/* loaded from: classes.dex */
public final class v74 {
    public float[] a;
    public final int[] b;
    public final float[] c;
    public android.graphics.Path d;
    public final android.graphics.Paint e;
    public final android.graphics.Paint f;
    public final android.graphics.Paint g;
    public final android.graphics.Paint h;
    public final android.graphics.Paint i;
    public final float[] j;
    public int k;
    public final android.graphics.Rect l;
    public final int m;
    public final /* synthetic */ androidx.constraintlayout.motion.widget.MotionLayout n;

    public v74(androidx.constraintlayout.motion.widget.MotionLayout r6) {
            r5 = this;
            r5.<init>()
            r5.n = r6
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r5.l = r0
            r0 = 1
            r5.m = r0
            android.graphics.Paint r1 = new android.graphics.Paint
            r1.<init>()
            r5.e = r1
            r1.setAntiAlias(r0)
            r2 = -21965(0xffffffffffffaa33, float:NaN)
            r1.setColor(r2)
            r2 = 1073741824(0x40000000, float:2.0)
            r1.setStrokeWidth(r2)
            android.graphics.Paint$Style r3 = android.graphics.Paint.Style.STROKE
            r1.setStyle(r3)
            android.graphics.Paint r1 = new android.graphics.Paint
            r1.<init>()
            r5.f = r1
            r1.setAntiAlias(r0)
            r4 = -2067046(0xffffffffffe0759a, float:NaN)
            r1.setColor(r4)
            r1.setStrokeWidth(r2)
            r1.setStyle(r3)
            android.graphics.Paint r1 = new android.graphics.Paint
            r1.<init>()
            r5.g = r1
            r1.setAntiAlias(r0)
            r4 = -13391360(0xffffffffff33aa00, float:-2.388145E38)
            r1.setColor(r4)
            r1.setStrokeWidth(r2)
            r1.setStyle(r3)
            android.graphics.Paint r2 = new android.graphics.Paint
            r2.<init>()
            r5.h = r2
            r2.setAntiAlias(r0)
            r2.setColor(r4)
            android.content.Context r6 = r6.getContext()
            android.content.res.Resources r6 = r6.getResources()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            r3 = 1094713344(0x41400000, float:12.0)
            float r6 = r6 * r3
            r2.setTextSize(r6)
            r6 = 8
            float[] r6 = new float[r6]
            r5.j = r6
            android.graphics.Paint r6 = new android.graphics.Paint
            r6.<init>()
            r5.i = r6
            r6.setAntiAlias(r0)
            android.graphics.DashPathEffect r6 = new android.graphics.DashPathEffect
            r0 = 2
            float[] r0 = new float[r0]
            r0 = {x00a2: FILL_ARRAY_DATA  , data: [1082130432, 1090519040} // fill-array
            r2 = 0
            r6.<init>(r0, r2)
            r1.setPathEffect(r6)
            r6 = 100
            float[] r6 = new float[r6]
            r5.c = r6
            r6 = 50
            int[] r6 = new int[r6]
            r5.b = r6
            return
    }

    public final void a(android.graphics.Canvas r19, int r20, int r21, defpackage.m74 r22) {
            r18 = this;
            r0 = r18
            r7 = r20
            r8 = r22
            android.graphics.Paint r6 = r0.g
            r9 = 2
            int[] r10 = r0.b
            r11 = 0
            r12 = 1
            r13 = 4
            if (r7 != r13) goto L3c
            r1 = r11
            r2 = r1
            r14 = r2
        L13:
            int r3 = r0.k
            if (r1 >= r3) goto L22
            r3 = r10[r1]
            if (r3 != r12) goto L1c
            r2 = r12
        L1c:
            if (r3 != 0) goto L1f
            r14 = r12
        L1f:
            int r1 = r1 + 1
            goto L13
        L22:
            if (r2 == 0) goto L37
            float[] r1 = r0.a
            r2 = r1[r11]
            r3 = r1[r12]
            int r4 = r1.length
            int r4 = r4 - r9
            r4 = r1[r4]
            int r5 = r1.length
            int r5 = r5 - r12
            r5 = r1[r5]
            r1 = r19
            r1.drawLine(r2, r3, r4, r5, r6)
        L37:
            if (r14 == 0) goto L3c
            r18.b(r19)
        L3c:
            if (r7 != r9) goto L52
            float[] r1 = r0.a
            r2 = r1[r11]
            r3 = r1[r12]
            int r4 = r1.length
            int r4 = r4 - r9
            r4 = r1[r4]
            int r5 = r1.length
            int r5 = r5 - r12
            r5 = r1[r5]
            r1 = r19
            r1.drawLine(r2, r3, r4, r5, r6)
            goto L54
        L52:
            r1 = r19
        L54:
            r6 = 3
            if (r7 != r6) goto L5a
            r18.b(r19)
        L5a:
            float[] r2 = r0.a
            android.graphics.Paint r3 = r0.e
            r1.drawLines(r2, r3)
            android.view.View r2 = r8.b
            if (r2 == 0) goto L72
            int r2 = r2.getWidth()
            android.view.View r3 = r8.b
            int r3 = r3.getHeight()
            r4 = r2
            r5 = r3
            goto L74
        L72:
            r4 = r11
            r5 = r4
        L74:
            r14 = r12
        L75:
            int r2 = r21 + (-1)
            if (r14 >= r2) goto L119
            if (r7 != r13) goto L85
            int r2 = r14 + (-1)
            r2 = r10[r2]
            if (r2 != 0) goto L85
            r17 = r11
            goto L112
        L85:
            int r2 = r14 * 2
            float[] r3 = r0.c
            r15 = r3[r2]
            int r2 = r2 + r12
            r2 = r3[r2]
            android.graphics.Path r3 = r0.d
            r3.reset()
            android.graphics.Path r3 = r0.d
            r16 = 1092616192(0x41200000, float:10.0)
            r17 = r11
            float r11 = r2 + r16
            r3.moveTo(r15, r11)
            android.graphics.Path r3 = r0.d
            float r11 = r15 + r16
            r3.lineTo(r11, r2)
            android.graphics.Path r3 = r0.d
            float r11 = r2 - r16
            r3.lineTo(r15, r11)
            android.graphics.Path r3 = r0.d
            float r11 = r15 - r16
            r3.lineTo(r11, r2)
            android.graphics.Path r3 = r0.d
            r3.close()
            int r3 = r14 + (-1)
            java.util.ArrayList r11 = r8.u
            java.lang.Object r11 = r11.get(r3)
            y74 r11 = (defpackage.y74) r11
            android.graphics.Paint r11 = r0.i
            r16 = 0
            if (r7 != r13) goto Lf0
            r3 = r10[r3]
            if (r3 != r12) goto Ld5
            float r3 = r15 - r16
            float r13 = r2 - r16
            r0.d(r1, r3, r13)
        Ld3:
            r13 = r2
            goto Lea
        Ld5:
            if (r3 != 0) goto Ldf
            float r3 = r15 - r16
            float r13 = r2 - r16
            r0.c(r1, r3, r13)
            goto Ld3
        Ldf:
            if (r3 != r9) goto Ld3
            r3 = r2
            float r2 = r15 - r16
            r13 = r3
            float r3 = r13 - r16
            r0.e(r1, r2, r3, r4, r5)
        Lea:
            android.graphics.Path r2 = r0.d
            r1.drawPath(r2, r11)
            goto Lf1
        Lf0:
            r13 = r2
        Lf1:
            if (r7 != r9) goto Lfa
            float r2 = r15 - r16
            float r3 = r13 - r16
            r0.d(r1, r2, r3)
        Lfa:
            if (r7 != r6) goto L103
            float r2 = r15 - r16
            float r3 = r13 - r16
            r0.c(r1, r2, r3)
        L103:
            r2 = 6
            if (r7 != r2) goto L10d
            float r2 = r15 - r16
            float r3 = r13 - r16
            r0.e(r1, r2, r3, r4, r5)
        L10d:
            android.graphics.Path r2 = r0.d
            r1.drawPath(r2, r11)
        L112:
            int r14 = r14 + 1
            r11 = r17
            r13 = 4
            goto L75
        L119:
            r17 = r11
            float[] r2 = r0.a
            int r3 = r2.length
            if (r3 <= r12) goto L138
            r3 = r2[r17]
            r2 = r2[r12]
            r4 = 1090519040(0x41000000, float:8.0)
            android.graphics.Paint r5 = r0.f
            r1.drawCircle(r3, r2, r4, r5)
            float[] r0 = r0.a
            int r2 = r0.length
            int r2 = r2 - r9
            r2 = r0[r2]
            int r3 = r0.length
            int r3 = r3 - r12
            r0 = r0[r3]
            r1.drawCircle(r2, r0, r4, r5)
        L138:
            return
    }

    public final void b(android.graphics.Canvas r18) {
            r17 = this;
            r0 = r17
            float[] r1 = r0.a
            r2 = 0
            r2 = r1[r2]
            r3 = 1
            r4 = r1[r3]
            int r5 = r1.length
            int r5 = r5 + (-2)
            r5 = r1[r5]
            int r6 = r1.length
            int r6 = r6 - r3
            r1 = r1[r6]
            float r7 = java.lang.Math.min(r2, r5)
            float r8 = java.lang.Math.max(r4, r1)
            float r9 = java.lang.Math.max(r2, r5)
            float r10 = java.lang.Math.max(r4, r1)
            android.graphics.Paint r11 = r0.g
            r6 = r18
            r6.drawLine(r7, r8, r9, r10, r11)
            r16 = r11
            float r12 = java.lang.Math.min(r2, r5)
            float r13 = java.lang.Math.min(r4, r1)
            float r14 = java.lang.Math.min(r2, r5)
            float r15 = java.lang.Math.max(r4, r1)
            r11 = r18
            r11.drawLine(r12, r13, r14, r15, r16)
            return
    }

    public final void c(android.graphics.Canvas r22, float r23, float r24) {
            r21 = this;
            r0 = r21
            r1 = r22
            float[] r2 = r0.a
            r6 = 0
            r3 = r2[r6]
            r4 = 1
            r7 = r2[r4]
            int r5 = r2.length
            int r5 = r5 + (-2)
            r5 = r2[r5]
            int r8 = r2.length
            int r8 = r8 - r4
            r8 = r2[r8]
            float r2 = java.lang.Math.min(r3, r5)
            float r9 = java.lang.Math.max(r7, r8)
            float r4 = java.lang.Math.min(r3, r5)
            float r4 = r23 - r4
            float r10 = java.lang.Math.max(r7, r8)
            float r10 = r10 - r24
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = ""
            r11.<init>(r12)
            r13 = 1120403456(0x42c80000, float:100.0)
            float r14 = r4 * r13
            float r15 = r5 - r3
            float r15 = java.lang.Math.abs(r15)
            float r14 = r14 / r15
            double r14 = (double) r14
            r16 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r14 = r14 + r16
            int r14 = (int) r14
            float r14 = (float) r14
            float r14 = r14 / r13
            r11.append(r14)
            java.lang.String r11 = r11.toString()
            int r14 = r11.length()
            android.graphics.Paint r15 = r0.h
            r18 = r13
            android.graphics.Rect r13 = r0.l
            r15.getTextBounds(r11, r6, r14, r13)
            r14 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 / r14
            int r19 = r13.width()
            r20 = r14
            int r14 = r19 / 2
            float r14 = (float) r14
            float r4 = r4 - r14
            float r4 = r4 + r2
            r2 = 1101004800(0x41a00000, float:20.0)
            float r2 = r24 - r2
            r1.drawText(r11, r4, r2, r15)
            float r3 = java.lang.Math.min(r3, r5)
            android.graphics.Paint r5 = r0.g
            r4 = r24
            r2 = r24
            r0 = r1
            r1 = r23
            r0.drawLine(r1, r2, r3, r4, r5)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r12)
            float r2 = r10 * r18
            float r3 = r8 - r7
            float r3 = java.lang.Math.abs(r3)
            float r2 = r2 / r3
            double r2 = (double) r2
            double r2 = r2 + r16
            int r2 = (int) r2
            float r2 = (float) r2
            float r2 = r2 / r18
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            int r2 = r1.length()
            r15.getTextBounds(r1, r6, r2, r13)
            float r10 = r10 / r20
            int r2 = r13.height()
            int r2 = r2 / 2
            float r2 = (float) r2
            float r10 = r10 - r2
            r2 = 1084227584(0x40a00000, float:5.0)
            float r2 = r23 + r2
            float r9 = r9 - r10
            r0.drawText(r1, r2, r9, r15)
            float r4 = java.lang.Math.max(r7, r8)
            r3 = r23
            r1 = r23
            r2 = r24
            r0.drawLine(r1, r2, r3, r4, r5)
            return
    }

    public final void d(android.graphics.Canvas r18, float r19, float r20) {
            r17 = this;
            r0 = r17
            r1 = r19
            r2 = r20
            float[] r3 = r0.a
            r4 = 0
            r5 = r3[r4]
            r6 = 1
            r7 = r3[r6]
            int r8 = r3.length
            int r8 = r8 + (-2)
            r8 = r3[r8]
            int r9 = r3.length
            int r9 = r9 - r6
            r3 = r3[r9]
            float r6 = r5 - r8
            double r9 = (double) r6
            float r6 = r7 - r3
            double r11 = (double) r6
            double r9 = java.lang.Math.hypot(r9, r11)
            float r6 = (float) r9
            float r9 = r1 - r5
            float r8 = r8 - r5
            float r9 = r9 * r8
            float r10 = r2 - r7
            float r3 = r3 - r7
            float r10 = r10 * r3
            float r10 = r10 + r9
            float r9 = r6 * r6
            float r10 = r10 / r9
            float r8 = r8 * r10
            float r8 = r8 + r5
            float r10 = r10 * r3
            float r10 = r10 + r7
            android.graphics.Path r13 = new android.graphics.Path
            r13.<init>()
            r13.moveTo(r1, r2)
            r13.lineTo(r8, r10)
            float r3 = r8 - r1
            double r11 = (double) r3
            float r3 = r10 - r2
            double r14 = (double) r3
            double r11 = java.lang.Math.hypot(r11, r14)
            float r3 = (float) r11
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r7 = ""
            r5.<init>(r7)
            r7 = 1120403456(0x42c80000, float:100.0)
            float r9 = r3 * r7
            float r9 = r9 / r6
            int r6 = (int) r9
            float r6 = (float) r6
            float r6 = r6 / r7
            r5.append(r6)
            java.lang.String r12 = r5.toString()
            int r5 = r12.length()
            android.graphics.Paint r6 = r0.h
            android.graphics.Rect r7 = r0.l
            r6.getTextBounds(r12, r4, r5, r7)
            r4 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r4
            int r4 = r7.width()
            int r4 = r4 / 2
            float r4 = (float) r4
            float r14 = r3 - r4
            r15 = -1046478848(0xffffffffc1a00000, float:-20.0)
            r11 = r18
            r16 = r6
            r11.drawTextOnPath(r12, r13, r14, r15, r16)
            android.graphics.Paint r5 = r0.g
            r0 = r18
            r3 = r8
            r4 = r10
            r0.drawLine(r1, r2, r3, r4, r5)
            return
    }

    public final void e(android.graphics.Canvas r18, float r19, float r20, int r21, int r22) {
            r17 = this;
            r0 = r17
            r1 = r18
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r6 = ""
            r2.<init>(r6)
            int r3 = r21 / 2
            float r3 = (float) r3
            float r3 = r19 - r3
            r7 = 1120403456(0x42c80000, float:100.0)
            float r3 = r3 * r7
            androidx.constraintlayout.motion.widget.MotionLayout r8 = r0.n
            int r4 = r8.getWidth()
            int r4 = r4 - r21
            float r4 = (float) r4
            float r3 = r3 / r4
            double r3 = (double) r3
            r9 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r3 = r3 + r9
            int r3 = (int) r3
            float r3 = (float) r3
            float r3 = r3 / r7
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            int r3 = r2.length()
            android.graphics.Paint r11 = r0.h
            r12 = 0
            android.graphics.Rect r13 = r0.l
            r11.getTextBounds(r2, r12, r3, r13)
            r14 = 1073741824(0x40000000, float:2.0)
            float r3 = r19 / r14
            int r4 = r13.width()
            int r4 = r4 / 2
            float r4 = (float) r4
            float r3 = r3 - r4
            r15 = 0
            float r3 = r3 + r15
            r4 = 1101004800(0x41a00000, float:20.0)
            float r4 = r20 - r4
            r1.drawText(r2, r3, r4, r11)
            r2 = 1065353216(0x3f800000, float:1.0)
            float r3 = java.lang.Math.min(r15, r2)
            android.graphics.Paint r5 = r0.g
            r4 = r20
            r0 = r1
            r16 = r7
            r1 = r19
            r7 = r2
            r2 = r20
            r0.drawLine(r1, r2, r3, r4, r5)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r6)
            int r2 = r22 / 2
            float r2 = (float) r2
            float r2 = r20 - r2
            float r2 = r2 * r16
            int r3 = r8.getHeight()
            int r3 = r3 - r22
            float r3 = (float) r3
            float r2 = r2 / r3
            double r2 = (double) r2
            double r2 = r2 + r9
            int r2 = (int) r2
            float r2 = (float) r2
            float r2 = r2 / r16
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            int r2 = r1.length()
            r11.getTextBounds(r1, r12, r2, r13)
            float r2 = r20 / r14
            int r3 = r13.height()
            int r3 = r3 / 2
            float r3 = (float) r3
            float r2 = r2 - r3
            r3 = 1084227584(0x40a00000, float:5.0)
            float r3 = r19 + r3
            float r2 = r15 - r2
            r0.drawText(r1, r3, r2, r11)
            float r4 = java.lang.Math.max(r15, r7)
            r3 = r19
            r1 = r19
            r2 = r20
            r0.drawLine(r1, r2, r3, r4, r5)
            return
    }
}
