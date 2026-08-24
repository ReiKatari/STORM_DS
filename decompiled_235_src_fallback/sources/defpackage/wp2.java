package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wp2  reason: default package */
/* loaded from: classes.dex */
public final class wp2 {
    public java.lang.String a;
    public final defpackage.ex6 b;
    public final defpackage.ex6 c;
    public final defpackage.ex6 d;

    public wp2() {
            r2 = this;
            r2.<init>()
            ns1 r0 = new ns1
            r1 = 6
            r0.<init>(r1)
            ex6 r1 = new ex6
            r1.<init>(r0)
            r2.b = r1
            ns1 r0 = new ns1
            r1 = 7
            r0.<init>(r1)
            ex6 r1 = new ex6
            r1.<init>(r0)
            r2.c = r1
            ns1 r0 = new ns1
            r1 = 8
            r0.<init>(r1)
            ex6 r1 = new ex6
            r1.<init>(r0)
            r2.d = r1
            return
    }

    public static final java.util.List a(defpackage.wp2 r10, java.util.List r11) {
            int r10 = r11.size()
            r0 = 1
            if (r10 > r0) goto L8
            return r11
        L8:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            zh2 r1 = new zh2
            r2 = 16
            r1.<init>(r2)
            java.util.List r11 = defpackage.gt0.d1(r11, r1)
            java.util.Iterator r11 = r11.iterator()
            r1 = 0
        L1d:
            boolean r2 = r11.hasNext()
            if (r2 == 0) goto L99
            java.lang.Object r2 = r11.next()
            ta7 r2 = (defpackage.ta7) r2
            if (r1 != 0) goto L2c
            goto L97
        L2c:
            android.graphics.RectF r3 = r1.c
            android.graphics.RectF r4 = r2.c
            float r5 = r4.top
            float r6 = r3.bottom
            float r5 = r5 - r6
            float r6 = r3.right
            float r7 = r4.right
            float r6 = java.lang.Math.min(r6, r7)
            float r7 = r3.left
            float r8 = r4.left
            float r7 = java.lang.Math.max(r7, r8)
            float r6 = r6 - r7
            r7 = 0
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 <= 0) goto L4d
            r6 = r0
            goto L4e
        L4d:
            r6 = 0
        L4e:
            r7 = -1119040307(0xffffffffbd4ccccd, float:-0.05)
            int r7 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r7 > 0) goto L94
            r7 = 1034147594(0x3da3d70a, float:0.08)
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 > 0) goto L94
            if (r6 == 0) goto L94
            java.lang.String r5 = r1.a
            java.lang.String r2 = r2.a
            java.lang.String r6 = " "
            java.lang.String r2 = defpackage.lb1.m(r5, r6, r2)
            android.graphics.RectF r5 = new android.graphics.RectF
            float r6 = r3.left
            float r7 = r4.left
            float r6 = java.lang.Math.min(r6, r7)
            float r7 = r3.top
            float r8 = r4.top
            float r7 = java.lang.Math.min(r7, r8)
            float r8 = r3.right
            float r9 = r4.right
            float r8 = java.lang.Math.max(r8, r9)
            float r3 = r3.bottom
            float r4 = r4.bottom
            float r3 = java.lang.Math.max(r3, r4)
            r5.<init>(r6, r7, r8, r3)
            r3 = 58
            ta7 r1 = defpackage.ta7.a(r1, r2, r5, r3)
            goto L1d
        L94:
            r10.add(r1)
        L97:
            r1 = r2
            goto L1d
        L99:
            if (r1 == 0) goto L9e
            r10.add(r1)
        L9e:
            return r10
    }

    public static final java.lang.Object b(defpackage.wp2 r40, android.graphics.Bitmap r41, java.lang.String r42, defpackage.s41 r43) {
            r0 = r40
            r1 = r41
            r2 = r42
            r3 = r43
            boolean r4 = r3 instanceof defpackage.vp2
            if (r4 == 0) goto L1b
            r4 = r3
            vp2 r4 = (defpackage.vp2) r4
            int r5 = r4.l0
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L1b
            int r5 = r5 - r6
            r4.l0 = r5
            goto L20
        L1b:
            vp2 r4 = new vp2
            r4.<init>(r0, r3)
        L20:
            java.lang.Object r3 = r4.j0
            x61 r5 = defpackage.x61.COROUTINE_SUSPENDED
            int r6 = r4.l0
            r43 = 1038710997(0x3de978d5, float:0.114)
            r16 = 1058424226(0x3f1645a2, float:0.587)
            r12 = 2
            r17 = 1050220167(0x3e991687, float:0.299)
            r13 = 4
            java.lang.String r14 = " blocks"
            java.lang.String r15 = "GameTextRecognizer"
            r7 = 1
            r18 = 1056964608(0x3f000000, float:0.5)
            r8 = 0
            r9 = 0
            switch(r6) {
                case 0: goto La5;
                case 1: goto L95;
                case 2: goto L84;
                case 3: goto L74;
                case 4: goto L65;
                case 5: goto L51;
                case 6: goto L43;
                default: goto L3d;
            }
        L3d:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            return r9
        L43:
            android.graphics.Bitmap r0 = r4.h0
            java.util.ArrayList r1 = r4.g0
            android.graphics.Bitmap r2 = r4.Y
            android.graphics.Bitmap r4 = r4.R
            defpackage.oi2.Y(r3)
            r7 = r14
            goto L614
        L51:
            int r1 = r4.i0
            android.graphics.Bitmap r2 = r4.f0
            android.graphics.Bitmap r6 = r4.Y
            java.lang.String r7 = r4.X
            android.graphics.Bitmap r10 = r4.R
            defpackage.oi2.Y(r3)
            r8 = r3
            r3 = r2
            r2 = r6
            r6 = r7
            r7 = r14
            goto L59b
        L65:
            android.graphics.Bitmap r1 = r4.e0
            android.graphics.Bitmap r2 = r4.Y
            java.lang.String r6 = r4.X
            android.graphics.Bitmap r7 = r4.R
            defpackage.oi2.Y(r3)
            r10 = r7
            r7 = r14
            goto L537
        L74:
            android.graphics.Bitmap r1 = r4.d0
            android.graphics.Bitmap r2 = r4.Y
            java.lang.String r6 = r4.X
            android.graphics.Bitmap r10 = r4.R
            defpackage.oi2.Y(r3)
            r30 = r7
            r7 = r14
            goto L42d
        L84:
            android.graphics.Bitmap r1 = r4.Z
            android.graphics.Bitmap r2 = r4.Y
            java.lang.String r6 = r4.X
            android.graphics.Bitmap r10 = r4.R
            defpackage.oi2.Y(r3)
            r30 = r7
            r35 = r14
            goto L2d5
        L95:
            android.graphics.Bitmap r1 = r4.Y
            java.lang.String r2 = r4.X
            android.graphics.Bitmap r6 = r4.R
            defpackage.oi2.Y(r3)
            r39 = r3
            r3 = r1
            r1 = r6
            r6 = r39
            goto L104
        La5:
            defpackage.oi2.Y(r3)
            r1.getClass()
            int r3 = r1.getWidth()
            int r6 = r1.getHeight()
            int r3 = java.lang.Math.min(r3, r6)
            r6 = 700(0x2bc, float:9.81E-43)
            if (r3 < r6) goto Lbd
            r3 = r7
            goto Lc1
        Lbd:
            int r3 = defpackage.gi2.q(r13, r12, r13)
        Lc1:
            if (r3 != r7) goto Lc4
            goto Lf3
        Lc4:
            int r6 = r1.getWidth()     // Catch: java.lang.Throwable -> Lf3
            int r6 = r6 * r3
            int r10 = r1.getHeight()     // Catch: java.lang.Throwable -> Lf3
            int r10 = r10 * r3
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ARGB_8888     // Catch: java.lang.Throwable -> Lf3
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r6, r10, r3)     // Catch: java.lang.Throwable -> Lf3
            r3.getClass()     // Catch: java.lang.Throwable -> Lf3
            android.graphics.Canvas r13 = new android.graphics.Canvas     // Catch: java.lang.Throwable -> Lf3
            r13.<init>(r3)     // Catch: java.lang.Throwable -> Lf3
            android.graphics.Paint r12 = new android.graphics.Paint     // Catch: java.lang.Throwable -> Lf3
            r12.<init>()     // Catch: java.lang.Throwable -> Lf3
            r12.setFilterBitmap(r8)     // Catch: java.lang.Throwable -> Lf3
            r12.setAntiAlias(r8)     // Catch: java.lang.Throwable -> Lf3
            r12.setDither(r8)     // Catch: java.lang.Throwable -> Lf3
            android.graphics.Rect r11 = new android.graphics.Rect     // Catch: java.lang.Throwable -> Lf3
            r11.<init>(r8, r8, r6, r10)     // Catch: java.lang.Throwable -> Lf3
            r13.drawBitmap(r1, r9, r11, r12)     // Catch: java.lang.Throwable -> Lf3
            goto Lf4
        Lf3:
            r3 = r1
        Lf4:
            r4.R = r1
            r4.X = r2
            r4.Y = r3
            r4.l0 = r7
            java.io.Serializable r6 = r0.d(r3, r2, r4)
            if (r6 != r5) goto L104
            goto L681
        L104:
            java.util.List r6 = (java.util.List) r6
            boolean r10 = r6.isEmpty()
            if (r10 != 0) goto L12c
            int r0 = r6.size()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "OCR Pass 1 (4x Nearest-Neighbor) matched "
            r2.<init>(r4)
            r2.append(r0)
            r2.append(r14)
            java.lang.String r0 = r2.toString()
            android.util.Log.i(r15, r0)
            if (r3 == r1) goto L129
            r3.recycle()
        L129:
            r5 = r6
            goto L681
        L12c:
            r3.getClass()
            int r25 = r3.getWidth()     // Catch: java.lang.Throwable -> L2ac
            int r29 = r3.getHeight()     // Catch: java.lang.Throwable -> L2ac
            int r10 = r25 * r29
            int[] r11 = new int[r10]     // Catch: java.lang.Throwable -> L2ac
            r26 = 0
            r27 = 0
            r24 = 0
            r28 = r25
            r22 = r3
            r23 = r11
            r22.getPixels(r23, r24, r25, r26, r27, r28, r29)     // Catch: java.lang.Throwable -> L2b2
            r11 = r25
            r12 = r29
            int[] r13 = new int[r10]     // Catch: java.lang.Throwable -> L2ac
            r30 = r7
            r7 = r8
        L153:
            if (r7 >= r10) goto L185
            r9 = r23[r7]     // Catch: java.lang.Throwable -> L182
            int r8 = r9 >> 16
            r41 = r6
            r6 = 255(0xff, float:3.57E-43)
            r8 = r8 & r6
            r22 = r7
            int r7 = r9 >> 8
            r7 = r7 & r6
            r9 = r9 & r6
            float r8 = (float) r8
            float r8 = r8 * r17
            float r7 = (float) r7
            float r7 = r7 * r16
            float r7 = r7 + r8
            float r8 = (float) r9
            float r8 = r8 * r43
            float r8 = r8 + r7
            int r7 = (int) r8
            r8 = 0
            int r7 = defpackage.gi2.q(r7, r8, r6)     // Catch: java.lang.Throwable -> L17e
            r13[r22] = r7     // Catch: java.lang.Throwable -> L17e
            int r7 = r22 + 1
            r6 = r41
            r8 = 0
            r9 = 0
            goto L153
        L17e:
            r35 = r14
            goto L2ba
        L182:
            r41 = r6
            goto L17e
        L185:
            r41 = r6
            int r25 = r11 + 1
            int r29 = r12 + 1
            int r6 = r29 * r25
            long[] r7 = new long[r6]     // Catch: java.lang.Throwable -> L17e
            long[] r6 = new long[r6]     // Catch: java.lang.Throwable -> L17e
            r8 = 0
        L192:
            if (r8 >= r12) goto L1cd
            r22 = 0
            r26 = r22
            r9 = 0
        L199:
            if (r9 >= r11) goto L1c6
            int r24 = r8 * r11
            int r24 = r24 + r9
            r28 = r6
            r6 = r13[r24]     // Catch: java.lang.Throwable -> L17e
            r24 = r7
            long r6 = (long) r6     // Catch: java.lang.Throwable -> L17e
            long r22 = r22 + r6
            long r6 = r6 * r6
            long r26 = r6 + r26
            int r6 = r8 + 1
            int r6 = r6 * r25
            int r9 = r9 + 1
            int r6 = r6 + r9
            int r7 = r8 * r25
            int r7 = r7 + r9
            r31 = r24[r7]     // Catch: java.lang.Throwable -> L17e
            long r31 = r31 + r22
            r24[r6] = r31     // Catch: java.lang.Throwable -> L17e
            r31 = r28[r7]     // Catch: java.lang.Throwable -> L17e
            long r31 = r31 + r26
            r28[r6] = r31     // Catch: java.lang.Throwable -> L17e
            r7 = r24
            r6 = r28
            goto L199
        L1c6:
            r28 = r6
            r24 = r7
            int r8 = r8 + 1
            goto L192
        L1cd:
            r28 = r6
            r24 = r7
            int[] r6 = new int[r10]     // Catch: java.lang.Throwable -> L17e
            r7 = 0
        L1d4:
            if (r7 >= r12) goto L28d
            int r8 = r7 + (-12)
            r9 = 0
            int r8 = java.lang.Math.max(r9, r8)     // Catch: java.lang.Throwable -> L17e
            int r9 = r12 + (-1)
            int r10 = r7 + 12
            int r9 = java.lang.Math.min(r9, r10)     // Catch: java.lang.Throwable -> L17e
            int r10 = r7 * r11
            r23 = r6
            r6 = 0
        L1ea:
            if (r6 >= r11) goto L281
            r22 = r6
            int r6 = r22 + (-12)
            r26 = r7
            r7 = 0
            int r6 = java.lang.Math.max(r7, r6)     // Catch: java.lang.Throwable -> L17e
            int r7 = r11 + (-1)
            r42 = r6
            int r6 = r22 + 12
            int r6 = java.lang.Math.min(r7, r6)     // Catch: java.lang.Throwable -> L17e
            int r7 = r6 - r42
            int r7 = r7 + 1
            int r27 = r9 - r8
            int r27 = r27 + 1
            int r7 = r7 * r27
            int r27 = r8 * r25
            int r29 = r27 + r42
            int r6 = r6 + 1
            int r27 = r27 + r6
            int r31 = r9 + 1
            int r31 = r31 * r25
            int r32 = r31 + r42
            int r31 = r31 + r6
            r33 = r24[r31]     // Catch: java.lang.Throwable -> L17e
            r35 = r24[r27]     // Catch: java.lang.Throwable -> L17e
            long r33 = r33 - r35
            r35 = r24[r32]     // Catch: java.lang.Throwable -> L17e
            long r33 = r33 - r35
            r35 = r24[r29]     // Catch: java.lang.Throwable -> L17e
            r42 = r8
            r6 = r9
            long r8 = r33 + r35
            r33 = r28[r31]     // Catch: java.lang.Throwable -> L17e
            r35 = r28[r27]     // Catch: java.lang.Throwable -> L17e
            long r33 = r33 - r35
            r31 = r28[r32]     // Catch: java.lang.Throwable -> L17e
            long r33 = r33 - r31
            r31 = r28[r29]     // Catch: java.lang.Throwable -> L17e
            r27 = r13
            r35 = r14
            long r13 = r33 + r31
            double r8 = (double) r8
            r29 = r6
            double r6 = (double) r7
            double r8 = r8 / r6
            double r13 = (double) r13
            double r13 = r13 / r6
            double r6 = r8 * r8
            double r13 = r13 - r6
            r6 = 0
            double r13 = java.lang.Math.max(r6, r13)     // Catch: java.lang.Throwable -> L2ba
            double r13 = java.lang.Math.sqrt(r13)     // Catch: java.lang.Throwable -> L2ba
            r19 = 4638707616191610880(0x4060000000000000, double:128.0)
            double r13 = r13 / r19
            r19 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r13 = r13 - r19
            r31 = 4595653204011646976(0x3fc70a3d80000000, double:0.18000000715255737)
            double r13 = r13 * r31
            double r13 = r13 + r19
            double r13 = r13 * r8
            int r8 = r10 + r22
            r9 = r27[r8]     // Catch: java.lang.Throwable -> L2ba
            double r6 = (double) r9     // Catch: java.lang.Throwable -> L2ba
            int r6 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r6 < 0) goto L270
            r6 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            goto L271
        L270:
            r6 = -1
        L271:
            r23[r8] = r6     // Catch: java.lang.Throwable -> L2ba
            int r6 = r22 + 1
            r8 = r42
            r7 = r26
            r13 = r27
            r9 = r29
            r14 = r35
            goto L1ea
        L281:
            r26 = r7
            r27 = r13
            r35 = r14
            int r7 = r26 + 1
            r6 = r23
            goto L1d4
        L28d:
            r23 = r6
            r35 = r14
            android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.ARGB_8888     // Catch: java.lang.Throwable -> L2ba
            android.graphics.Bitmap r22 = android.graphics.Bitmap.createBitmap(r11, r12, r6)     // Catch: java.lang.Throwable -> L2ba
            r22.getClass()     // Catch: java.lang.Throwable -> L2ba
            r26 = 0
            r27 = 0
            r24 = 0
            r28 = r11
            r25 = r11
            r29 = r12
            r22.setPixels(r23, r24, r25, r26, r27, r28, r29)     // Catch: java.lang.Throwable -> L2ba
            r6 = r22
            goto L2bb
        L2ac:
            r41 = r6
            r30 = r7
            goto L17e
        L2b2:
            r41 = r6
            r30 = r7
            r35 = r14
            r3 = r22
        L2ba:
            r6 = 0
        L2bb:
            if (r6 == 0) goto L307
            r4.R = r1
            r4.X = r2
            r4.Y = r3
            r4.Z = r6
            r7 = 2
            r4.l0 = r7
            java.io.Serializable r7 = r0.d(r6, r2, r4)
            if (r7 != r5) goto L2d0
            goto L681
        L2d0:
            r10 = r1
            r1 = r6
            r6 = r2
            r2 = r3
            r3 = r7
        L2d5:
            java.util.List r3 = (java.util.List) r3
            r1.recycle()
            boolean r1 = r3.isEmpty()
            if (r1 != 0) goto L302
            int r0 = r3.size()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "OCR Pass 2 (Sauvola Adaptive Thresholding) matched "
            r1.<init>(r4)
            r1.append(r0)
            r7 = r35
            r1.append(r7)
            java.lang.String r0 = r1.toString()
            android.util.Log.i(r15, r0)
            if (r2 == r10) goto L2ff
            r2.recycle()
        L2ff:
            r5 = r3
            goto L681
        L302:
            r22 = r2
        L304:
            r7 = r35
            goto L30e
        L307:
            r10 = r1
            r6 = r2
            r22 = r3
            r3 = r41
            goto L304
        L30e:
            r22.getClass()
            int r25 = r22.getWidth()     // Catch: java.lang.Throwable -> L410
            int r38 = r22.getHeight()     // Catch: java.lang.Throwable -> L410
            int r1 = r25 * r38
            int[] r2 = new int[r1]     // Catch: java.lang.Throwable -> L410
            r26 = 0
            r27 = 0
            r24 = 0
            r28 = r25
            r23 = r2
            r29 = r38
            r22.getPixels(r23, r24, r25, r26, r27, r28, r29)     // Catch: java.lang.Throwable -> L410
            r2 = r22
            r8 = r25
            r9 = r29
            r11 = 256(0x100, float:3.59E-43)
            int[] r12 = new int[r11]     // Catch: java.lang.Throwable -> L368
            r13 = 0
        L337:
            if (r13 >= r1) goto L36c
            r14 = r23[r13]     // Catch: java.lang.Throwable -> L368
            int r11 = r14 >> 16
            r42 = r3
            r3 = 255(0xff, float:3.57E-43)
            r11 = r11 & r3
            r22 = r12
            int r12 = r14 >> 8
            r12 = r12 & r3
            r14 = r14 & r3
            float r11 = (float) r11
            float r11 = r11 * r17
            float r12 = (float) r12
            float r12 = r12 * r16
            float r12 = r12 + r11
            float r11 = (float) r14
            float r11 = r11 * r43
            float r11 = r11 + r12
            int r11 = (int) r11
            r12 = 0
            int r11 = defpackage.gi2.q(r11, r12, r3)     // Catch: java.lang.Throwable -> L414
            r3 = r22[r11]     // Catch: java.lang.Throwable -> L414
            int r3 = r3 + 1
            r22[r11] = r3     // Catch: java.lang.Throwable -> L414
            int r13 = r13 + 1
            r3 = r42
            r12 = r22
            r11 = 256(0x100, float:3.59E-43)
            goto L337
        L368:
            r42 = r3
            goto L414
        L36c:
            r42 = r3
            r22 = r12
            r13 = r11
            r3 = 0
            r11 = 0
        L374:
            if (r3 >= r13) goto L380
            r13 = r22[r3]     // Catch: java.lang.Throwable -> L414
            int r13 = r13 * r3
            double r13 = (double) r13     // Catch: java.lang.Throwable -> L414
            double r11 = r11 + r13
            int r3 = r3 + 1
            r13 = 256(0x100, float:3.59E-43)
            goto L374
        L380:
            r3 = 128(0x80, float:1.8E-43)
            r24 = r11
            r41 = 0
            r11 = 0
            r13 = 0
            r19 = 0
        L38b:
            r12 = 256(0x100, float:3.59E-43)
            if (r11 >= r12) goto L3c4
            r26 = r22[r11]     // Catch: java.lang.Throwable -> L414
            int r12 = r41 + r26
            r28 = r11
            if (r12 == 0) goto L3bd
            int r11 = r1 - r12
            if (r11 == 0) goto L3c4
            r31 = r13
            int r13 = r28 * r26
            double r13 = (double) r13     // Catch: java.lang.Throwable -> L414
            double r19 = r19 + r13
            double r13 = (double) r12     // Catch: java.lang.Throwable -> L414
            double r33 = r19 / r13
            double r35 = r24 - r19
            r41 = r12
            double r11 = (double) r11     // Catch: java.lang.Throwable -> L414
            double r35 = r35 / r11
            double r13 = r13 * r11
            double r33 = r33 - r35
            double r13 = r13 * r33
            double r13 = r13 * r33
            int r11 = (r13 > r31 ? 1 : (r13 == r31 ? 0 : -1))
            if (r11 <= 0) goto L3ba
            r3 = r28
            goto L3c1
        L3ba:
            r13 = r31
            goto L3c1
        L3bd:
            r41 = r12
            r31 = r13
        L3c1:
            int r11 = r28 + 1
            goto L38b
        L3c4:
            int[] r11 = new int[r1]     // Catch: java.lang.Throwable -> L414
            r12 = 0
        L3c7:
            if (r12 >= r1) goto L3f3
            r13 = r23[r12]     // Catch: java.lang.Throwable -> L414
            int r14 = r13 >> 16
            r41 = r1
            r1 = 255(0xff, float:3.57E-43)
            r14 = r14 & r1
            r32 = r11
            int r11 = r13 >> 8
            r11 = r11 & r1
            r13 = r13 & r1
            float r1 = (float) r14     // Catch: java.lang.Throwable -> L414
            float r1 = r1 * r17
            float r11 = (float) r11     // Catch: java.lang.Throwable -> L414
            float r11 = r11 * r16
            float r11 = r11 + r1
            float r1 = (float) r13     // Catch: java.lang.Throwable -> L414
            float r1 = r1 * r43
            float r1 = r1 + r11
            int r1 = (int) r1     // Catch: java.lang.Throwable -> L414
            if (r1 < r3) goto L3e9
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            goto L3ea
        L3e9:
            r1 = -1
        L3ea:
            r32[r12] = r1     // Catch: java.lang.Throwable -> L414
            int r12 = r12 + 1
            r1 = r41
            r11 = r32
            goto L3c7
        L3f3:
            r32 = r11
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888     // Catch: java.lang.Throwable -> L414
            android.graphics.Bitmap r31 = android.graphics.Bitmap.createBitmap(r8, r9, r1)     // Catch: java.lang.Throwable -> L414
            r31.getClass()     // Catch: java.lang.Throwable -> L414
            r35 = 0
            r36 = 0
            r33 = 0
            r37 = r8
            r34 = r8
            r38 = r9
            r31.setPixels(r32, r33, r34, r35, r36, r37, r38)     // Catch: java.lang.Throwable -> L414
            r1 = r31
            goto L415
        L410:
            r42 = r3
            r2 = r22
        L414:
            r1 = 0
        L415:
            if (r1 == 0) goto L45a
            r4.R = r10
            r4.X = r6
            r4.Y = r2
            r3 = 0
            r4.Z = r3
            r4.d0 = r1
            r3 = 3
            r4.l0 = r3
            java.io.Serializable r3 = r0.d(r1, r6, r4)
            if (r3 != r5) goto L42d
            goto L681
        L42d:
            java.util.List r3 = (java.util.List) r3
            r1.recycle()
            boolean r1 = r3.isEmpty()
            if (r1 != 0) goto L457
            int r0 = r3.size()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "OCR Pass 3 (Otsu Inverted Binarization) matched "
            r1.<init>(r4)
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = r1.toString()
            android.util.Log.i(r15, r0)
            if (r2 == r10) goto L2ff
            r2.recycle()
            goto L2ff
        L457:
            r22 = r2
            goto L45d
        L45a:
            r3 = r42
            goto L457
        L45d:
            r22.getClass()
            int r25 = r22.getWidth()     // Catch: java.lang.Throwable -> L518
            int r38 = r22.getHeight()     // Catch: java.lang.Throwable -> L518
            int r1 = r25 * r38
            int[] r2 = new int[r1]     // Catch: java.lang.Throwable -> L518
            r26 = 0
            r27 = 0
            r24 = 0
            r28 = r25
            r23 = r2
            r29 = r38
            r22.getPixels(r23, r24, r25, r26, r27, r28, r29)     // Catch: java.lang.Throwable -> L518
            r2 = r22
            r8 = r25
            r9 = r29
            int[] r11 = new int[r1]     // Catch: java.lang.Throwable -> L4f6
            r12 = 0
        L484:
            if (r12 >= r1) goto L4f9
            r13 = r23[r12]     // Catch: java.lang.Throwable -> L4f6
            int r14 = r13 >> 16
            r41 = r1
            r1 = 255(0xff, float:3.57E-43)
            r14 = r14 & r1
            r42 = r3
            int r3 = r13 >> 8
            r3 = r3 & r1
            r13 = r13 & r1
            r1 = 180(0xb4, float:2.52E-43)
            if (r14 <= r1) goto L4a0
            if (r3 <= r1) goto L4a0
            if (r13 <= r1) goto L4a0
            r43 = r30
            goto L4a2
        L4a0:
            r43 = 0
        L4a2:
            r1 = 175(0xaf, float:2.45E-43)
            if (r14 <= r1) goto L4bb
            r1 = 155(0x9b, float:2.17E-43)
            if (r3 <= r1) goto L4bb
            r1 = 125(0x7d, float:1.75E-43)
            if (r13 >= r1) goto L4bb
            int r1 = r14 - r13
            r32 = r11
            r11 = 40
            if (r1 <= r11) goto L4bd
            r1 = r30
        L4b8:
            r11 = 125(0x7d, float:1.75E-43)
            goto L4bf
        L4bb:
            r32 = r11
        L4bd:
            r1 = 0
            goto L4b8
        L4bf:
            if (r14 >= r11) goto L4ce
            r11 = 165(0xa5, float:2.31E-43)
            if (r3 <= r11) goto L4ce
            r11 = 195(0xc3, float:2.73E-43)
            if (r13 <= r11) goto L4ce
            r11 = r30
        L4cb:
            r16 = r1
            goto L4d0
        L4ce:
            r11 = 0
            goto L4cb
        L4d0:
            r1 = 130(0x82, float:1.82E-43)
            if (r14 >= r1) goto L4dd
            r14 = 175(0xaf, float:2.45E-43)
            if (r3 <= r14) goto L4dd
            if (r13 >= r1) goto L4dd
            r1 = r30
            goto L4de
        L4dd:
            r1 = 0
        L4de:
            if (r43 != 0) goto L4e9
            if (r16 != 0) goto L4e9
            if (r11 != 0) goto L4e9
            if (r1 == 0) goto L4e7
            goto L4e9
        L4e7:
            r1 = -1
            goto L4eb
        L4e9:
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
        L4eb:
            r32[r12] = r1     // Catch: java.lang.Throwable -> L51c
            int r12 = r12 + 1
            r1 = r41
            r3 = r42
            r11 = r32
            goto L484
        L4f6:
            r42 = r3
            goto L51c
        L4f9:
            r42 = r3
            r32 = r11
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888     // Catch: java.lang.Throwable -> L51c
            android.graphics.Bitmap r31 = android.graphics.Bitmap.createBitmap(r8, r9, r1)     // Catch: java.lang.Throwable -> L51c
            r31.getClass()     // Catch: java.lang.Throwable -> L51c
            r35 = 0
            r36 = 0
            r33 = 0
            r37 = r8
            r34 = r8
            r38 = r9
            r31.setPixels(r32, r33, r34, r35, r36, r37, r38)     // Catch: java.lang.Throwable -> L51c
            r1 = r31
            goto L51d
        L518:
            r42 = r3
            r2 = r22
        L51c:
            r1 = 0
        L51d:
            if (r1 == 0) goto L561
            r4.R = r10
            r4.X = r6
            r4.Y = r2
            r3 = 0
            r4.Z = r3
            r4.d0 = r3
            r4.e0 = r1
            r3 = 4
            r4.l0 = r3
            java.io.Serializable r3 = r0.d(r1, r6, r4)
            if (r3 != r5) goto L537
            goto L681
        L537:
            java.util.List r3 = (java.util.List) r3
            r1.recycle()
            boolean r1 = r3.isEmpty()
            if (r1 != 0) goto L563
            int r0 = r3.size()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "OCR Pass 4 (Chromatic Text Isolation) matched "
            r1.<init>(r4)
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = r1.toString()
            android.util.Log.i(r15, r0)
            if (r2 == r10) goto L2ff
            r2.recycle()
            goto L2ff
        L561:
            r3 = r42
        L563:
            int r1 = r2.getHeight()
            r8 = 120(0x78, float:1.68E-43)
            if (r1 <= r8) goto L67b
            int r1 = r2.getHeight()
            r21 = 2
            int r1 = r1 / 2
            int r3 = r2.getWidth()
            r12 = 0
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r2, r12, r12, r3, r1)
            r3.getClass()
            r4.R = r10
            r4.X = r6
            r4.Y = r2
            r8 = 0
            r4.Z = r8
            r4.d0 = r8
            r4.e0 = r8
            r4.f0 = r3
            r4.i0 = r1
            r8 = 5
            r4.l0 = r8
            java.io.Serializable r8 = r0.d(r3, r6, r4)
            if (r8 != r5) goto L59b
            goto L681
        L59b:
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r9 = new java.util.ArrayList
            r11 = 10
            int r12 = defpackage.ht0.v0(r8, r11)
            r9.<init>(r12)
            java.util.Iterator r8 = r8.iterator()
        L5ac:
            boolean r11 = r8.hasNext()
            if (r11 == 0) goto L5de
            java.lang.Object r11 = r8.next()
            ta7 r11 = (defpackage.ta7) r11
            android.graphics.RectF r12 = new android.graphics.RectF
            android.graphics.RectF r13 = r11.c
            float r14 = r13.left
            r41 = r3
            float r3 = r13.top
            float r3 = r3 * r18
            r42 = r8
            float r8 = r13.right
            float r13 = r13.bottom
            float r13 = r13 * r18
            r12.<init>(r14, r3, r8, r13)
            r3 = 59
            r8 = 0
            ta7 r11 = defpackage.ta7.a(r11, r8, r12, r3)
            r9.add(r11)
            r3 = r41
            r8 = r42
            goto L5ac
        L5de:
            r41 = r3
            r8 = 0
            r41.recycle()
            int r3 = r2.getWidth()
            r12 = 0
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r2, r12, r1, r3, r1)
            r3.getClass()
            r4.R = r10
            r4.X = r8
            r4.Y = r2
            r4.Z = r8
            r4.d0 = r8
            r4.e0 = r8
            r4.f0 = r8
            r4.g0 = r9
            r4.h0 = r3
            r4.i0 = r1
            r1 = 6
            r4.l0 = r1
            java.io.Serializable r0 = r0.d(r3, r6, r4)
            if (r0 != r5) goto L60f
            goto L681
        L60f:
            r1 = r3
            r3 = r0
            r0 = r1
            r1 = r9
            r4 = r10
        L614:
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r5 = new java.util.ArrayList
            r11 = 10
            int r6 = defpackage.ht0.v0(r3, r11)
            r5.<init>(r6)
            java.util.Iterator r3 = r3.iterator()
        L625:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L653
            java.lang.Object r6 = r3.next()
            ta7 r6 = (defpackage.ta7) r6
            android.graphics.RectF r8 = new android.graphics.RectF
            android.graphics.RectF r9 = r6.c
            float r10 = r9.left
            float r11 = r9.top
            float r11 = r11 * r18
            float r11 = r11 + r18
            float r12 = r9.right
            float r9 = r9.bottom
            float r9 = r9 * r18
            float r9 = r9 + r18
            r8.<init>(r10, r11, r12, r9)
            r9 = 59
            r10 = 0
            ta7 r6 = defpackage.ta7.a(r6, r10, r8, r9)
            r5.add(r6)
            goto L625
        L653:
            r0.recycle()
            java.util.ArrayList r0 = defpackage.gt0.V0(r1, r5)
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L678
            int r1 = r0.size()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "OCR Pass 5 (Split Screen Dual-Pass) matched "
            r3.<init>(r5)
            r3.append(r1)
            r3.append(r7)
            java.lang.String r1 = r3.toString()
            android.util.Log.i(r15, r1)
        L678:
            r5 = r0
            r10 = r4
            goto L67c
        L67b:
            r5 = r3
        L67c:
            if (r2 == r10) goto L681
            r2.recycle()
        L681:
            return r5
    }

    public static java.lang.Object c(com.google.mlkit.vision.text.TextRecognizer r3, com.google.mlkit.vision.common.InputImage r4, defpackage.tp2 r5) {
            rj0 r0 = new rj0
            r41 r5 = defpackage.np2.V(r5)
            r1 = 1
            r0.<init>(r1, r5)
            r0.v()
            com.google.android.gms.tasks.Task r3 = r3.process(r4)
            rp2 r4 = new rp2
            r5 = 0
            r4.<init>(r0, r5)
            d51 r1 = new d51
            r2 = 25
            r1.<init>(r4, r2)
            com.google.android.gms.tasks.Task r3 = r3.addOnSuccessListener(r1)
            sp2 r4 = new sp2
            r4.<init>(r0, r5)
            r3.addOnFailureListener(r4)
            java.lang.Object r3 = r0.s()
            x61 r4 = defpackage.x61.COROUTINE_SUSPENDED
            return r3
    }

    public final java.io.Serializable d(android.graphics.Bitmap r20, java.lang.String r21, defpackage.s41 r22) {
            r19 = this;
            r1 = r19
            r0 = r22
            boolean r2 = r0 instanceof defpackage.tp2
            if (r2 == 0) goto L17
            r2 = r0
            tp2 r2 = (defpackage.tp2) r2
            int r3 = r2.g0
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.g0 = r3
            goto L1c
        L17:
            tp2 r2 = new tp2
            r2.<init>(r1, r0)
        L1c:
            java.lang.Object r0 = r2.e0
            x61 r3 = defpackage.x61.COROUTINE_SUSPENDED
            int r4 = r2.g0
            r5 = 10
            java.lang.String r6 = "GameTextRecognizer"
            r7 = 0
            r8 = 0
            r9 = 1
            if (r4 == 0) goto L50
            if (r4 != r9) goto L4a
            com.google.mlkit.vision.text.TextRecognizer r4 = r2.d0
            java.util.Iterator r10 = r2.Z
            com.google.mlkit.vision.text.Text r11 = r2.Y
            com.google.mlkit.vision.common.InputImage r12 = r2.X
            android.graphics.Bitmap r13 = r2.R
            defpackage.oi2.Y(r0)     // Catch: java.lang.Throwable -> L44
            r18 = r10
            r10 = r4
            r4 = r13
        L3e:
            r13 = r12
            r12 = r11
            r11 = r18
            goto L14d
        L44:
            r0 = move-exception
            r22 = r5
            r4 = r13
            goto L1c8
        L4a:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            return r8
        L50:
            defpackage.oi2.Y(r0)
            java.util.Locale r0 = java.util.Locale.ROOT
            r4 = r21
            java.lang.String r0 = r4.toLowerCase(r0)
            r0.getClass()
            int r4 = r0.hashCode()
            r10 = -752730191(0xffffffffd3223fb1, float:-6.9685327E11)
            r11 = 2
            r12 = 3
            ex6 r13 = r1.c
            ex6 r14 = r1.b
            ex6 r15 = r1.d
            if (r4 == r10) goto Lc2
            r10 = 3383(0xd37, float:4.74E-42)
            if (r4 == r10) goto Lb9
            r10 = 3886(0xf2e, float:5.445E-42)
            if (r4 == r10) goto L86
            r10 = 746330349(0x2c7c18ed, float:3.582519E-12)
            if (r4 == r10) goto L7d
            goto Lca
        L7d:
            java.lang.String r4 = "chinese"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L8f
            goto Lca
        L86:
            java.lang.String r4 = "zh"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L8f
            goto Lca
        L8f:
            java.lang.Object r0 = r15.getValue()
            r0.getClass()
            com.google.mlkit.vision.text.TextRecognizer r0 = (com.google.mlkit.vision.text.TextRecognizer) r0
            java.lang.Object r4 = r14.getValue()
            r4.getClass()
            com.google.mlkit.vision.text.TextRecognizer r4 = (com.google.mlkit.vision.text.TextRecognizer) r4
            java.lang.Object r10 = r13.getValue()
            r10.getClass()
            com.google.mlkit.vision.text.TextRecognizer r10 = (com.google.mlkit.vision.text.TextRecognizer) r10
            com.google.mlkit.vision.text.TextRecognizer[] r12 = new com.google.mlkit.vision.text.TextRecognizer[r12]
            r12[r7] = r0
            r12[r9] = r4
            r12[r11] = r10
            java.util.List r0 = defpackage.hf.c0(r12)
        Lb6:
            r4 = r20
            goto L11a
        Lb9:
            java.lang.String r4 = "ja"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto Lf2
            goto Lca
        Lc2:
            java.lang.String r4 = "japanese"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto Lf2
        Lca:
            java.lang.Object r0 = r14.getValue()
            r0.getClass()
            com.google.mlkit.vision.text.TextRecognizer r0 = (com.google.mlkit.vision.text.TextRecognizer) r0
            java.lang.Object r4 = r13.getValue()
            r4.getClass()
            com.google.mlkit.vision.text.TextRecognizer r4 = (com.google.mlkit.vision.text.TextRecognizer) r4
            java.lang.Object r10 = r15.getValue()
            r10.getClass()
            com.google.mlkit.vision.text.TextRecognizer r10 = (com.google.mlkit.vision.text.TextRecognizer) r10
            com.google.mlkit.vision.text.TextRecognizer[] r12 = new com.google.mlkit.vision.text.TextRecognizer[r12]
            r12[r7] = r0
            r12[r9] = r4
            r12[r11] = r10
            java.util.List r0 = defpackage.hf.c0(r12)
            goto Lb6
        Lf2:
            java.lang.Object r0 = r13.getValue()
            r0.getClass()
            com.google.mlkit.vision.text.TextRecognizer r0 = (com.google.mlkit.vision.text.TextRecognizer) r0
            java.lang.Object r4 = r14.getValue()
            r4.getClass()
            com.google.mlkit.vision.text.TextRecognizer r4 = (com.google.mlkit.vision.text.TextRecognizer) r4
            java.lang.Object r10 = r15.getValue()
            r10.getClass()
            com.google.mlkit.vision.text.TextRecognizer r10 = (com.google.mlkit.vision.text.TextRecognizer) r10
            com.google.mlkit.vision.text.TextRecognizer[] r12 = new com.google.mlkit.vision.text.TextRecognizer[r12]
            r12[r7] = r0
            r12[r9] = r4
            r12[r11] = r10
            java.util.List r0 = defpackage.hf.c0(r12)
            goto Lb6
        L11a:
            com.google.mlkit.vision.common.InputImage r10 = com.google.mlkit.vision.common.InputImage.fromBitmap(r4, r7)
            r10.getClass()
            java.util.Iterator r0 = r0.iterator()
            r11 = r8
            r12 = r10
            r10 = r0
        L128:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L1f1
            java.lang.Object r0 = r10.next()
            com.google.mlkit.vision.text.TextRecognizer r0 = (com.google.mlkit.vision.text.TextRecognizer) r0
            r2.R = r4     // Catch: java.lang.Throwable -> L1c5
            r2.X = r12     // Catch: java.lang.Throwable -> L1c5
            r2.Y = r11     // Catch: java.lang.Throwable -> L1c5
            r2.Z = r10     // Catch: java.lang.Throwable -> L1c5
            r2.d0 = r0     // Catch: java.lang.Throwable -> L1c5
            r2.g0 = r9     // Catch: java.lang.Throwable -> L1c5
            java.lang.Object r13 = c(r0, r12, r2)     // Catch: java.lang.Throwable -> L1c5
            if (r13 != r3) goto L147
            return r3
        L147:
            r18 = r10
            r10 = r0
            r0 = r13
            goto L3e
        L14d:
            r14 = r0
            com.google.mlkit.vision.text.Text r14 = (com.google.mlkit.vision.text.Text) r14     // Catch: java.lang.Throwable -> L1be
            java.util.List r0 = r14.getTextBlocks()     // Catch: java.lang.Throwable -> L1be
            r0.getClass()     // Catch: java.lang.Throwable -> L1be
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L1be
            if (r0 != 0) goto L1b9
            java.lang.Class r0 = r10.getClass()     // Catch: java.lang.Throwable -> L1b5
            java.lang.String r0 = r0.getSimpleName()     // Catch: java.lang.Throwable -> L1b5
            java.util.List r10 = r14.getTextBlocks()     // Catch: java.lang.Throwable -> L1b5
            int r10 = r10.size()     // Catch: java.lang.Throwable -> L1b5
            java.lang.String r12 = r14.getText()     // Catch: java.lang.Throwable -> L1b5
            r12.getClass()     // Catch: java.lang.Throwable -> L1b5
            r15 = 80
            java.lang.String r12 = defpackage.qs6.S0(r15, r12)     // Catch: java.lang.Throwable -> L1b5
            r15 = 32
            java.lang.String r12 = r12.replace(r5, r15)     // Catch: java.lang.Throwable -> L1b5
            r12.getClass()     // Catch: java.lang.Throwable -> L1b5
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1b5
            r15.<init>()     // Catch: java.lang.Throwable -> L1b5
            r22 = r5
            java.lang.String r5 = "ML Kit ("
            r15.append(r5)     // Catch: java.lang.Throwable -> L1b0
            r15.append(r0)     // Catch: java.lang.Throwable -> L1b0
            java.lang.String r0 = ") found "
            r15.append(r0)     // Catch: java.lang.Throwable -> L1b0
            r15.append(r10)     // Catch: java.lang.Throwable -> L1b0
            java.lang.String r0 = " blocks: \""
            r15.append(r0)     // Catch: java.lang.Throwable -> L1b0
            r15.append(r12)     // Catch: java.lang.Throwable -> L1b0
            java.lang.String r0 = "\""
            r15.append(r0)     // Catch: java.lang.Throwable -> L1b0
            java.lang.String r0 = r15.toString()     // Catch: java.lang.Throwable -> L1b0
            android.util.Log.i(r6, r0)     // Catch: java.lang.Throwable -> L1b0
            r11 = r14
            goto L1f3
        L1b0:
            r0 = move-exception
        L1b1:
            r10 = r11
            r12 = r13
            r11 = r14
            goto L1c8
        L1b5:
            r0 = move-exception
            r22 = r5
            goto L1b1
        L1b9:
            r10 = r11
            r11 = r12
            r12 = r13
            goto L128
        L1be:
            r0 = move-exception
            r22 = r5
            r10 = r11
            r11 = r12
            r12 = r13
            goto L1c8
        L1c5:
            r0 = move-exception
            r22 = r5
        L1c8:
            java.lang.String r5 = r0.getMessage()
            if (r5 != 0) goto L1d6
            java.lang.Class r5 = r0.getClass()
            java.lang.String r5 = r5.getSimpleName()
        L1d6:
            r1.a = r5
            java.lang.String r5 = r0.getMessage()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r14 = "ML Kit Recognizer failed: "
            r13.<init>(r14)
            r13.append(r5)
            java.lang.String r5 = r13.toString()
            android.util.Log.w(r6, r5, r0)
            r5 = r22
            goto L128
        L1f1:
            r22 = r5
        L1f3:
            if (r11 != 0) goto L1f8
            yt1 r0 = defpackage.yt1.A
            return r0
        L1f8:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r4.getWidth()
            float r1 = (float) r1
            int r2 = r4.getHeight()
            float r2 = (float) r2
            java.util.List r3 = r11.getTextBlocks()
            java.util.Iterator r3 = r3.iterator()
        L20f:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L39a
            java.lang.Object r5 = r3.next()
            com.google.mlkit.vision.text.Text$TextBlock r5 = (com.google.mlkit.vision.text.Text.TextBlock) r5
            android.graphics.Rect r6 = r5.getBoundingBox()
            if (r6 != 0) goto L222
            goto L20f
        L222:
            java.lang.String r5 = r5.getText()
            r5.getClass()
            java.lang.CharSequence r5 = defpackage.qs6.T0(r5)
            java.lang.String r11 = r5.toString()
            boolean r5 = defpackage.qs6.v0(r11)
            if (r5 != 0) goto L20f
            android.graphics.RectF r13 = new android.graphics.RectF
            int r5 = r6.left
            float r5 = (float) r5
            float r5 = r5 / r1
            r10 = 0
            r12 = 1065353216(0x3f800000, float:1.0)
            float r5 = defpackage.gi2.p(r5, r10, r12)
            int r14 = r6.top
            float r14 = (float) r14
            float r14 = r14 / r2
            float r14 = defpackage.gi2.p(r14, r10, r12)
            int r15 = r6.right
            float r15 = (float) r15
            float r15 = r15 / r1
            float r15 = defpackage.gi2.p(r15, r10, r12)
            r16 = r8
            int r8 = r6.bottom
            float r8 = (float) r8
            float r8 = r8 / r2
            float r8 = defpackage.gi2.p(r8, r10, r12)
            r13.<init>(r5, r14, r15, r8)
            int r5 = r4.getWidth()
            int r8 = r4.getHeight()
            int r10 = r6.left
            int r5 = r5 - r9
            int r10 = defpackage.gi2.q(r10, r7, r5)
            int r12 = r6.top
            int r8 = r8 - r9
            int r12 = defpackage.gi2.q(r12, r7, r8)
            int r14 = r6.right
            int r5 = defpackage.gi2.q(r14, r7, r5)
            int r6 = r6.bottom
            int r6 = defpackage.gi2.q(r6, r7, r8)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            int r14 = r5 - r10
            int r14 = r14 / 10
            int r14 = java.lang.Math.max(r9, r14)
            java.lang.String r15 = "."
            java.lang.String r7 = "Step must be positive, was: "
            if (r14 <= 0) goto L392
            int r9 = defpackage.nj2.s(r10, r5, r14)
            r19 = r1
            if (r10 > r9) goto L2bd
            r1 = r10
        L29f:
            int r17 = r4.getPixel(r1, r12)
            r20 = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r17)
            r8.add(r2)
            int r2 = r4.getPixel(r1, r6)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r8.add(r2)
            if (r1 == r9) goto L2bf
            int r1 = r1 + r14
            r2 = r20
            goto L29f
        L2bd:
            r20 = r2
        L2bf:
            int r1 = r6 - r12
            int r1 = r1 / 10
            r2 = 1
            int r1 = java.lang.Math.max(r2, r1)
            if (r1 <= 0) goto L38a
            int r6 = defpackage.nj2.s(r12, r6, r1)
            if (r12 > r6) goto L2ea
        L2d0:
            int r7 = r4.getPixel(r10, r12)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r8.add(r7)
            int r7 = r4.getPixel(r5, r12)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r8.add(r7)
            if (r12 == r6) goto L2ea
            int r12 = r12 + r1
            goto L2d0
        L2ea:
            boolean r1 = r8.isEmpty()
            if (r1 == 0) goto L2f8
            java.lang.String r1 = "#E60F172A"
            int r1 = android.graphics.Color.parseColor(r1)
        L2f6:
            r14 = r1
            goto L337
        L2f8:
            int r1 = r8.size()
            r5 = 0
            r9 = r5
            r14 = r9
            r7 = 0
        L301:
            if (r7 >= r1) goto L327
            java.lang.Object r12 = r8.get(r7)
            int r7 = r7 + 1
            java.lang.Number r12 = (java.lang.Number) r12
            int r12 = r12.intValue()
            int r2 = android.graphics.Color.red(r12)
            r21 = r1
            long r1 = (long) r2
            long r5 = r5 + r1
            int r1 = android.graphics.Color.green(r12)
            long r1 = (long) r1
            long r9 = r9 + r1
            int r1 = android.graphics.Color.blue(r12)
            long r1 = (long) r1
            long r14 = r14 + r1
            r1 = r21
            r2 = 1
            goto L301
        L327:
            int r1 = r8.size()
            long r1 = (long) r1
            long r5 = r5 / r1
            int r5 = (int) r5
            long r9 = r9 / r1
            int r6 = (int) r9
            long r14 = r14 / r1
            int r1 = (int) r14
            int r1 = android.graphics.Color.rgb(r5, r6, r1)
            goto L2f6
        L337:
            int r1 = android.graphics.Color.red(r14)
            double r1 = (double) r1
            r5 = 4643176031446892544(0x406fe00000000000, double:255.0)
            double r1 = r1 / r5
            int r7 = android.graphics.Color.green(r14)
            double r7 = (double) r7
            double r7 = r7 / r5
            int r9 = android.graphics.Color.blue(r14)
            double r9 = (double) r9
            double r9 = r9 / r5
            r5 = 4599057925072241033(0x3fd322d0e5604189, double:0.299)
            double r1 = r1 * r5
            r5 = 4603462445507809378(0x3fe2c8b439581062, double:0.587)
            double r7 = r7 * r5
            double r7 = r7 + r1
            r1 = 4592878986383488713(0x3fbd2f1a9fbe76c9, double:0.114)
            double r9 = r9 * r1
            double r9 = r9 + r7
            r1 = 4603129179135383962(0x3fe199999999999a, double:0.55)
            int r1 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r1 <= 0) goto L373
            java.lang.String r1 = "#0F172A"
        L36d:
            int r1 = android.graphics.Color.parseColor(r1)
            r15 = r1
            goto L376
        L373:
            java.lang.String r1 = "#FFFFFF"
            goto L36d
        L376:
            ta7 r10 = new ta7
            java.lang.String r12 = ""
            r10.<init>(r11, r12, r13, r14, r15)
            r0.add(r10)
            r1 = r19
            r2 = r20
            r8 = r16
            r7 = 0
            r9 = 1
            goto L20f
        L38a:
            java.lang.String r0 = defpackage.lb1.k(r7, r1, r15)
            defpackage.i.h(r0)
            return r16
        L392:
            java.lang.String r0 = defpackage.lb1.k(r7, r14, r15)
            defpackage.i.h(r0)
            return r16
        L39a:
            return r0
    }
}
