package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: iu4  reason: default package */
/* loaded from: classes.dex */
public final class iu4 {
    public char a;
    public final float[] b;

    public iu4(char r1, float[] r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    public iu4(defpackage.iu4 r2) {
            r1 = this;
            r1.<init>()
            char r0 = r2.a
            r1.a = r0
            float[] r2 = r2.b
            int r0 = r2.length
            float[] r2 = defpackage.kn2.w(r2, r0)
            r1.b = r2
            return
    }

    public static void a(android.graphics.Path r54, float r55, float r56, float r57, float r58, float r59, float r60, float r61, boolean r62, boolean r63) {
            r1 = r55
            r3 = r57
            r0 = r59
            r2 = r60
            r7 = r61
            double r4 = (double) r7
            double r4 = java.lang.Math.toRadians(r4)
            double r8 = java.lang.Math.cos(r4)
            double r10 = java.lang.Math.sin(r4)
            double r12 = (double) r1
            double r14 = r12 * r8
            r6 = r56
            r16 = r4
            double r4 = (double) r6
            double r18 = r4 * r10
            double r18 = r18 + r14
            double r14 = (double) r0
            double r18 = r18 / r14
            float r0 = -r1
            double r0 = (double) r0
            double r0 = r0 * r10
            double r20 = r4 * r8
            double r20 = r20 + r0
            double r0 = (double) r2
            double r20 = r20 / r0
            r22 = r0
            double r0 = (double) r3
            double r0 = r0 * r8
            r24 = r0
            r0 = r58
            double r1 = (double) r0
            double r26 = r1 * r10
            double r26 = r26 + r24
            double r26 = r26 / r14
            float r0 = -r3
            r24 = r1
            double r0 = (double) r0
            double r0 = r0 * r10
            double r24 = r24 * r8
            double r24 = r24 + r0
            double r24 = r24 / r22
            double r0 = r18 - r26
            double r28 = r20 - r24
            double r30 = r18 + r26
            r32 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r30 = r30 / r32
            double r34 = r20 + r24
            double r34 = r34 / r32
            double r36 = r0 * r0
            double r38 = r28 * r28
            r40 = r0
            double r0 = r38 + r36
            r36 = 0
            int r2 = (r0 > r36 ? 1 : (r0 == r36 ? 0 : -1))
            r38 = r2
            java.lang.String r2 = "PathParser"
            if (r38 != 0) goto L70
            java.lang.String r0 = " Points are coincident"
            android.util.Log.w(r2, r0)
            return
        L70:
            r38 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r42 = r38 / r0
            r44 = 4598175219545276416(0x3fd0000000000000, double:0.25)
            double r42 = r42 - r44
            int r44 = (r42 > r36 ? 1 : (r42 == r36 ? 0 : -1))
            if (r44 >= 0) goto Lac
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Points are too far apart "
            r4.<init>(r5)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            android.util.Log.w(r2, r4)
            double r0 = java.lang.Math.sqrt(r0)
            r4 = 4611685973391391630(0x3ffffff583a53b8e, double:1.99999)
            double r0 = r0 / r4
            float r0 = (float) r0
            float r5 = r59 * r0
            float r0 = r0 * r60
            r1 = r55
            r4 = r58
            r8 = r62
            r9 = r63
            r2 = r6
            r6 = r0
            r0 = r54
            a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
        Lac:
            r0 = r63
            double r1 = java.lang.Math.sqrt(r42)
            double r6 = r1 * r40
            double r1 = r1 * r28
            r3 = r62
            if (r3 != r0) goto Lbf
            double r30 = r30 - r1
            double r34 = r34 + r6
            goto Lc3
        Lbf:
            double r30 = r30 + r1
            double r34 = r34 - r6
        Lc3:
            double r1 = r20 - r34
            double r6 = r18 - r30
            double r1 = java.lang.Math.atan2(r1, r6)
            double r6 = r24 - r34
            r55 = r1
            double r1 = r26 - r30
            double r1 = java.lang.Math.atan2(r6, r1)
            double r1 = r1 - r55
            int r3 = (r1 > r36 ? 1 : (r1 == r36 ? 0 : -1))
            if (r3 < 0) goto Ldd
            r7 = 1
            goto Lde
        Ldd:
            r7 = 0
        Lde:
            if (r0 == r7) goto Lec
            r18 = 4618760256179416344(0x401921fb54442d18, double:6.283185307179586)
            if (r3 <= 0) goto Lea
            double r1 = r1 - r18
            goto Lec
        Lea:
            double r1 = r1 + r18
        Lec:
            double r30 = r30 * r14
            double r34 = r34 * r22
            double r18 = r30 * r8
            double r20 = r34 * r10
            double r18 = r18 - r20
            double r30 = r30 * r10
            double r34 = r34 * r8
            double r34 = r34 + r30
            r7 = 4616189618054758400(0x4010000000000000, double:4.0)
            double r9 = r1 * r7
            r20 = 4614256656552045848(0x400921fb54442d18, double:3.141592653589793)
            double r9 = r9 / r20
            double r9 = java.lang.Math.abs(r9)
            double r9 = java.lang.Math.ceil(r9)
            int r0 = (int) r9
            double r9 = java.lang.Math.cos(r16)
            double r16 = java.lang.Math.sin(r16)
            double r20 = java.lang.Math.cos(r55)
            double r24 = java.lang.Math.sin(r55)
            r62 = r7
            double r6 = -r14
            double r26 = r6 * r9
            double r28 = r26 * r24
            double r30 = r22 * r16
            double r36 = r30 * r20
            double r28 = r28 - r36
            double r6 = r6 * r16
            double r24 = r24 * r6
            double r22 = r22 * r9
            double r20 = r20 * r22
            double r20 = r20 + r24
            r58 = r1
            double r1 = (double) r0
            double r1 = r58 / r1
            r24 = r20
            r20 = r12
            r11 = r4
            r5 = 0
            r3 = r55
        L144:
            if (r5 >= r0) goto L1df
            double r36 = r3 + r1
            double r40 = java.lang.Math.sin(r36)
            double r42 = java.lang.Math.cos(r36)
            double r44 = r14 * r9
            double r44 = r44 * r42
            double r44 = r44 + r18
            double r46 = r30 * r40
            r8 = r0
            r48 = r1
            double r0 = r44 - r46
            double r44 = r14 * r16
            double r44 = r44 * r42
            double r44 = r44 + r34
            double r46 = r22 * r40
            r55 = r3
            double r2 = r46 + r44
            double r44 = r26 * r40
            double r46 = r30 * r42
            double r44 = r44 - r46
            double r40 = r40 * r6
            double r42 = r42 * r22
            double r40 = r42 + r40
            double r42 = r36 - r55
            double r46 = r42 / r32
            double r46 = java.lang.Math.tan(r46)
            double r42 = java.lang.Math.sin(r42)
            r50 = 4613937818241073152(0x4008000000000000, double:3.0)
            double r52 = r46 * r50
            double r52 = r52 * r46
            double r52 = r52 + r62
            double r46 = java.lang.Math.sqrt(r52)
            double r46 = r46 - r38
            double r46 = r46 * r42
            double r46 = r46 / r50
            double r28 = r28 * r46
            r13 = r5
            double r4 = r28 + r20
            double r24 = r24 * r46
            double r11 = r24 + r11
            double r20 = r46 * r44
            r24 = r6
            double r6 = r0 - r20
            double r46 = r46 * r40
            r20 = r9
            r10 = r8
            double r8 = r2 - r46
            r28 = r10
            r10 = 0
            r29 = r13
            r13 = r54
            r13.rLineTo(r10, r10)
            float r4 = (float) r4
            float r5 = (float) r11
            float r6 = (float) r6
            float r7 = (float) r8
            float r8 = (float) r0
            float r9 = (float) r2
            r56 = r4
            r57 = r5
            r58 = r6
            r59 = r7
            r60 = r8
            r61 = r9
            r55 = r13
            r55.cubicTo(r56, r57, r58, r59, r60, r61)
            int r5 = r29 + 1
            r11 = r2
            r9 = r20
            r6 = r24
            r3 = r36
            r24 = r40
            r20 = r0
            r0 = r28
            r28 = r44
            r1 = r48
            goto L144
        L1df:
            return
    }

    public static void b(defpackage.iu4[] r33, android.graphics.Path r34) {
            r0 = r33
            r1 = r34
            r11 = 6
            float[] r12 = new float[r11]
            int r13 = r0.length
            r15 = 0
            r8 = r15
            r2 = 109(0x6d, float:1.53E-43)
        Lc:
            if (r8 >= r13) goto L3ac
            r9 = r0[r8]
            char r10 = r9.a
            float[] r3 = r9.b
            r4 = r12[r15]
            r16 = 1
            r5 = r12[r16]
            r17 = 2
            r6 = r12[r17]
            r18 = 3
            r7 = r12[r18]
            r19 = 4
            r11 = r12[r19]
            r20 = 5
            r21 = r15
            r15 = r12[r20]
            switch(r10) {
                case 65: goto L46;
                case 67: goto L43;
                case 72: goto L40;
                case 81: goto L3d;
                case 83: goto L3d;
                case 86: goto L40;
                case 90: goto L32;
                case 97: goto L46;
                case 99: goto L43;
                case 104: goto L40;
                case 113: goto L3d;
                case 115: goto L3d;
                case 118: goto L40;
                case 122: goto L32;
                default: goto L2f;
            }
        L2f:
            r22 = r17
            goto L48
        L32:
            r1.close()
            r1.moveTo(r11, r15)
            r4 = r11
            r6 = r4
            r5 = r15
            r7 = r5
            goto L2f
        L3d:
            r22 = r19
            goto L48
        L40:
            r22 = r16
            goto L48
        L43:
            r22 = 6
            goto L48
        L46:
            r22 = 7
        L48:
            r23 = r11
            r24 = r15
            r11 = r4
            r15 = r5
            r4 = r21
        L50:
            int r5 = r3.length
            if (r4 >= r5) goto L38d
            r5 = 65
            if (r10 == r5) goto L336
            r5 = 67
            if (r10 == r5) goto L307
            r14 = 72
            if (r10 == r14) goto L2f4
            r14 = 81
            if (r10 == r14) goto L2cc
            r5 = 86
            if (r10 == r5) goto L2b9
            r5 = 97
            if (r10 == r5) goto L269
            r5 = 99
            if (r10 == r5) goto L23a
            r5 = 104(0x68, float:1.46E-43)
            if (r10 == r5) goto L229
            r5 = 113(0x71, float:1.58E-43)
            if (r10 == r5) goto L205
            r14 = 118(0x76, float:1.65E-43)
            if (r10 == r14) goto L1f5
            r14 = 76
            if (r10 == r14) goto L1e1
            r14 = 77
            if (r10 == r14) goto L1c7
            r14 = 115(0x73, float:1.61E-43)
            r5 = 83
            r31 = 1073741824(0x40000000, float:2.0)
            if (r10 == r5) goto L187
            r5 = 84
            if (r10 == r5) goto L159
            r5 = 108(0x6c, float:1.51E-43)
            if (r10 == r5) goto L143
            r5 = 109(0x6d, float:1.53E-43)
            if (r10 == r5) goto L123
            if (r10 == r14) goto Lda
            r5 = 116(0x74, float:1.63E-43)
            if (r10 == r5) goto Laa
            r25 = r3
            r30 = r4
            r0 = r9
            r2 = r11
        La3:
            r3 = r15
            r32 = 109(0x6d, float:1.53E-43)
        La6:
            r15 = r8
        La7:
            r11 = r10
            goto L37d
        Laa:
            r14 = 113(0x71, float:1.58E-43)
            if (r2 == r14) goto Lbc
            if (r2 == r5) goto Lbc
            r5 = 81
            if (r2 == r5) goto Lbc
            r5 = 84
            if (r2 != r5) goto Lb9
            goto Lbc
        Lb9:
            r2 = 0
            r14 = 0
            goto Lc0
        Lbc:
            float r14 = r11 - r6
            float r2 = r15 - r7
        Lc0:
            r5 = r3[r4]
            int r6 = r4 + 1
            r7 = r3[r6]
            r1.rQuadTo(r14, r2, r5, r7)
            float r14 = r14 + r11
            float r2 = r2 + r15
            r5 = r3[r4]
            float r11 = r11 + r5
            r5 = r3[r6]
            float r15 = r15 + r5
            r7 = r2
            r25 = r3
            r30 = r4
            r0 = r9
            r2 = r11
            r6 = r14
            goto La3
        Lda:
            r5 = 99
            if (r2 == r5) goto Led
            if (r2 == r14) goto Led
            r5 = 67
            if (r2 == r5) goto Led
            r5 = 83
            if (r2 != r5) goto Le9
            goto Led
        Le9:
            r2 = 0
            r14 = 0
        Leb:
            r5 = r4
            goto Lf5
        Led:
            float r14 = r11 - r6
            float r2 = r15 - r7
            r5 = r14
            r14 = r2
            r2 = r5
            goto Leb
        Lf5:
            r4 = r3[r5]
            int r26 = r5 + 1
            r6 = r5
            r5 = r3[r26]
            int r27 = r6 + 2
            r7 = r6
            r6 = r3[r27]
            int r28 = r7 + 3
            r29 = r7
            r7 = r3[r28]
            r25 = r3
            r3 = r14
            r30 = r29
            r32 = 109(0x6d, float:1.53E-43)
            r1.rCubicTo(r2, r3, r4, r5, r6, r7)
            r2 = r25[r30]
            float r2 = r2 + r11
            r3 = r25[r26]
            float r3 = r3 + r15
            r4 = r25[r27]
            float r11 = r11 + r4
            r4 = r25[r28]
        L11c:
            float r15 = r15 + r4
            r6 = r2
            r7 = r3
        L11f:
            r0 = r9
            r2 = r11
            r3 = r15
            goto La6
        L123:
            r25 = r3
            r30 = r4
            r32 = r5
            r2 = r25[r30]
            float r11 = r11 + r2
            int r4 = r30 + 1
            r3 = r25[r4]
            float r15 = r15 + r3
            if (r30 <= 0) goto L137
            r1.rLineTo(r2, r3)
            goto L11f
        L137:
            r1.rMoveTo(r2, r3)
            r0 = r9
            r2 = r11
            r23 = r2
            r3 = r15
            r24 = r3
            goto La6
        L143:
            r25 = r3
            r30 = r4
            r32 = 109(0x6d, float:1.53E-43)
            r2 = r25[r30]
            int r4 = r30 + 1
            r3 = r25[r4]
            r1.rLineTo(r2, r3)
            r2 = r25[r30]
            float r11 = r11 + r2
            r2 = r25[r4]
        L157:
            float r15 = r15 + r2
            goto L11f
        L159:
            r25 = r3
            r30 = r4
            r14 = 113(0x71, float:1.58E-43)
            r32 = 109(0x6d, float:1.53E-43)
            if (r2 == r14) goto L16f
            r5 = 116(0x74, float:1.63E-43)
            if (r2 == r5) goto L16f
            r5 = 81
            if (r2 == r5) goto L16f
            r5 = 84
            if (r2 != r5) goto L175
        L16f:
            float r11 = r11 * r31
            float r11 = r11 - r6
            float r15 = r15 * r31
            float r15 = r15 - r7
        L175:
            r2 = r25[r30]
            int r4 = r30 + 1
            r3 = r25[r4]
            r1.quadTo(r11, r15, r2, r3)
            r2 = r25[r30]
            r3 = r25[r4]
            r0 = r9
            r6 = r11
            r7 = r15
            goto La6
        L187:
            r25 = r3
            r30 = r4
            r5 = 99
            r32 = 109(0x6d, float:1.53E-43)
            if (r2 == r5) goto L19f
            if (r2 == r14) goto L19f
            r5 = 67
            if (r2 == r5) goto L19f
            r5 = 83
            if (r2 != r5) goto L19c
            goto L19f
        L19c:
            r2 = r11
            r3 = r15
            goto L1a6
        L19f:
            float r11 = r11 * r31
            float r11 = r11 - r6
            float r15 = r15 * r31
            float r15 = r15 - r7
            goto L19c
        L1a6:
            r4 = r25[r30]
            int r11 = r30 + 1
            r5 = r25[r11]
            int r14 = r30 + 2
            r6 = r25[r14]
            int r15 = r30 + 3
            r7 = r25[r15]
            r1.cubicTo(r2, r3, r4, r5, r6, r7)
            r2 = r25[r30]
            r3 = r25[r11]
            r4 = r25[r14]
            r5 = r25[r15]
            r6 = r2
            r7 = r3
            r2 = r4
            r3 = r5
        L1c3:
            r15 = r8
            r0 = r9
            goto La7
        L1c7:
            r25 = r3
            r30 = r4
            r32 = 109(0x6d, float:1.53E-43)
            r2 = r25[r30]
            int r4 = r30 + 1
            r3 = r25[r4]
            if (r30 <= 0) goto L1d9
            r1.lineTo(r2, r3)
            goto L1c3
        L1d9:
            r1.moveTo(r2, r3)
            r23 = r2
            r24 = r3
            goto L1c3
        L1e1:
            r25 = r3
            r30 = r4
            r32 = 109(0x6d, float:1.53E-43)
            r2 = r25[r30]
            int r4 = r30 + 1
            r3 = r25[r4]
            r1.lineTo(r2, r3)
            r2 = r25[r30]
            r3 = r25[r4]
            goto L1c3
        L1f5:
            r25 = r3
            r30 = r4
            r32 = 109(0x6d, float:1.53E-43)
            r2 = r25[r30]
            r3 = 0
            r1.rLineTo(r3, r2)
            r2 = r25[r30]
            goto L157
        L205:
            r25 = r3
            r30 = r4
            r32 = 109(0x6d, float:1.53E-43)
            r2 = r25[r30]
            int r4 = r30 + 1
            r3 = r25[r4]
            int r5 = r30 + 2
            r6 = r25[r5]
            int r7 = r30 + 3
            r14 = r25[r7]
            r1.rQuadTo(r2, r3, r6, r14)
            r2 = r25[r30]
            float r2 = r2 + r11
            r3 = r25[r4]
            float r3 = r3 + r15
            r4 = r25[r5]
            float r11 = r11 + r4
            r4 = r25[r7]
            goto L11c
        L229:
            r25 = r3
            r30 = r4
            r32 = 109(0x6d, float:1.53E-43)
            r2 = r25[r30]
            r3 = 0
            r1.rLineTo(r2, r3)
            r2 = r25[r30]
            float r11 = r11 + r2
            goto L11f
        L23a:
            r25 = r3
            r30 = r4
            r32 = 109(0x6d, float:1.53E-43)
            r2 = r25[r30]
            int r4 = r30 + 1
            r3 = r25[r4]
            int r14 = r30 + 2
            r4 = r25[r14]
            int r26 = r30 + 3
            r5 = r25[r26]
            int r27 = r30 + 4
            r6 = r25[r27]
            int r28 = r30 + 5
            r7 = r25[r28]
            r1.rCubicTo(r2, r3, r4, r5, r6, r7)
            r1 = r25[r14]
            float r1 = r1 + r11
            r2 = r25[r26]
            float r2 = r2 + r15
            r3 = r25[r27]
            float r11 = r11 + r3
            r3 = r25[r28]
            float r15 = r15 + r3
            r6 = r1
            r7 = r2
            goto L11f
        L269:
            r25 = r3
            r30 = r4
            r32 = 109(0x6d, float:1.53E-43)
            int r14 = r30 + 5
            r1 = r25[r14]
            float r4 = r1 + r11
            int r27 = r30 + 6
            r1 = r25[r27]
            float r5 = r1 + r15
            r6 = r25[r30]
            int r1 = r30 + 1
            r7 = r25[r1]
            int r1 = r30 + 2
            r1 = r25[r1]
            int r2 = r30 + 3
            r2 = r25[r2]
            r26 = 0
            int r2 = (r2 > r26 ? 1 : (r2 == r26 ? 0 : -1))
            if (r2 == 0) goto L293
            r2 = r9
            r9 = r16
            goto L296
        L293:
            r2 = r9
            r9 = r21
        L296:
            int r3 = r30 + 4
            r3 = r25[r3]
            int r3 = (r3 > r26 ? 1 : (r3 == r26 ? 0 : -1))
            r0 = r2
            r2 = r11
            r11 = r10
            if (r3 == 0) goto L2a9
            r10 = r16
        L2a3:
            r3 = r15
            r15 = r8
            r8 = r1
            r1 = r34
            goto L2ac
        L2a9:
            r10 = r21
            goto L2a3
        L2ac:
            a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r4 = r25[r14]
            float r2 = r2 + r4
            r4 = r25[r27]
            float r3 = r3 + r4
            r6 = r2
            r7 = r3
            goto L37d
        L2b9:
            r25 = r3
            r30 = r4
            r15 = r8
            r0 = r9
            r2 = r11
            r32 = 109(0x6d, float:1.53E-43)
            r11 = r10
            r3 = r25[r30]
            r1.lineTo(r2, r3)
            r3 = r25[r30]
            goto L37d
        L2cc:
            r25 = r3
            r30 = r4
            r15 = r8
            r0 = r9
            r11 = r10
            r32 = 109(0x6d, float:1.53E-43)
            r2 = r25[r30]
            int r4 = r30 + 1
            r3 = r25[r4]
            int r5 = r30 + 2
            r6 = r25[r5]
            int r7 = r30 + 3
            r8 = r25[r7]
            r1.quadTo(r2, r3, r6, r8)
            r2 = r25[r30]
            r3 = r25[r4]
            r4 = r25[r5]
            r5 = r25[r7]
            r6 = r2
            r7 = r3
            r2 = r4
            r3 = r5
            goto L37d
        L2f4:
            r25 = r3
            r30 = r4
            r0 = r9
            r11 = r10
            r3 = r15
            r32 = 109(0x6d, float:1.53E-43)
            r15 = r8
            r2 = r25[r30]
            r1.lineTo(r2, r3)
            r2 = r25[r30]
            goto L37d
        L307:
            r25 = r3
            r30 = r4
            r15 = r8
            r0 = r9
            r11 = r10
            r32 = 109(0x6d, float:1.53E-43)
            r2 = r25[r30]
            int r4 = r30 + 1
            r3 = r25[r4]
            int r8 = r30 + 2
            r4 = r25[r8]
            int r9 = r30 + 3
            r5 = r25[r9]
            int r10 = r30 + 4
            r6 = r25[r10]
            int r14 = r30 + 5
            r7 = r25[r14]
            r1.cubicTo(r2, r3, r4, r5, r6, r7)
            r1 = r25[r10]
            r2 = r25[r14]
            r3 = r25[r8]
            r4 = r25[r9]
            r6 = r3
            r7 = r4
            r3 = r2
            r2 = r1
            goto L37d
        L336:
            r25 = r3
            r30 = r4
            r0 = r9
            r2 = r11
            r3 = r15
            r32 = 109(0x6d, float:1.53E-43)
            r15 = r8
            r11 = r10
            int r14 = r30 + 5
            r4 = r25[r14]
            int r27 = r30 + 6
            r5 = r25[r27]
            r6 = r25[r30]
            int r1 = r30 + 1
            r7 = r25[r1]
            int r1 = r30 + 2
            r8 = r25[r1]
            int r1 = r30 + 3
            r1 = r25[r1]
            r26 = 0
            int r1 = (r1 > r26 ? 1 : (r1 == r26 ? 0 : -1))
            if (r1 == 0) goto L360
            r9 = r16
            goto L362
        L360:
            r9 = r21
        L362:
            int r1 = r30 + 4
            r1 = r25[r1]
            int r1 = (r1 > r26 ? 1 : (r1 == r26 ? 0 : -1))
            if (r1 == 0) goto L36f
            r10 = r16
        L36c:
            r1 = r34
            goto L372
        L36f:
            r10 = r21
            goto L36c
        L372:
            a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r1 = r25[r14]
            r2 = r25[r27]
            r6 = r1
            r3 = r2
            r7 = r3
            r2 = r6
        L37d:
            int r4 = r30 + r22
            r1 = r34
            r9 = r0
            r10 = r11
            r8 = r15
            r0 = r33
            r11 = r2
            r15 = r3
            r2 = r10
            r3 = r25
            goto L50
        L38d:
            r0 = r9
            r2 = r11
            r3 = r15
            r32 = 109(0x6d, float:1.53E-43)
            r15 = r8
            r12[r21] = r2
            r12[r16] = r3
            r12[r17] = r6
            r12[r18] = r7
            r12[r19] = r23
            r12[r20] = r24
            char r2 = r0.a
            int r8 = r15 + 1
            r0 = r33
            r1 = r34
            r15 = r21
            r11 = 6
            goto Lc
        L3ac:
            return
    }
}
