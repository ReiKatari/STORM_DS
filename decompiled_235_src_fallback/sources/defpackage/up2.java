package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: up2  reason: default package */
/* loaded from: classes.dex */
public final class up2 extends defpackage.hw6 implements defpackage.eo2 {
    public android.graphics.Bitmap X;
    public java.util.List Y;
    public java.util.Iterator Z;
    public defpackage.ua7 d0;
    public android.graphics.Bitmap e0;
    public int f0;
    public int g0;
    public int h0;
    public int i0;
    public int j0;
    public final /* synthetic */ defpackage.wp2 k0;
    public final /* synthetic */ android.graphics.Bitmap l0;
    public final /* synthetic */ java.util.List m0;
    public final /* synthetic */ java.lang.String n0;

    public up2(defpackage.wp2 r1, android.graphics.Bitmap r2, java.util.List r3, java.lang.String r4, defpackage.r41 r5) {
            r0 = this;
            r0.k0 = r1
            r0.l0 = r2
            r0.m0 = r3
            r0.n0 = r4
            r1 = 2
            r0.<init>(r1, r5)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            w61 r1 = (defpackage.w61) r1
            r41 r2 = (defpackage.r41) r2
            r41 r0 = r0.q(r2, r1)
            up2 r0 = (defpackage.up2) r0
            jg7 r1 = defpackage.jg7.a
            java.lang.Object r0 = r0.s(r1)
            return r0
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r7, java.lang.Object r8) {
            r6 = this;
            up2 r0 = new up2
            java.util.List r3 = r6.m0
            java.lang.String r4 = r6.n0
            wp2 r1 = r6.k0
            android.graphics.Bitmap r2 = r6.l0
            r5 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r30) {
            r29 = this;
            r1 = r29
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
            int r0 = r1.j0
            java.lang.String r3 = "x"
            r4 = 0
            r5 = 2
            java.lang.String r6 = "Region #"
            java.lang.String r7 = r1.n0
            android.graphics.Bitmap r8 = r1.l0
            java.util.List r9 = r1.m0
            wp2 r11 = r1.k0
            java.lang.String r12 = "GameTextRecognizer"
            r13 = 1
            if (r0 == 0) goto L61
            if (r0 == r13) goto L2d
            if (r0 != r5) goto L27
            android.graphics.Bitmap r0 = r1.X
            defpackage.oi2.Y(r30)
            r1 = r30
            r2 = r11
            goto L2cf
        L27:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            return r4
        L2d:
            int r0 = r1.i0
            int r5 = r1.h0
            int r14 = r1.g0
            int r15 = r1.f0
            android.graphics.Bitmap r13 = r1.e0
            ua7 r10 = r1.d0
            java.util.Iterator r4 = r1.Z
            r18 = r0
            java.util.List r0 = r1.Y
            r19 = r0
            android.graphics.Bitmap r0 = r1.X
            defpackage.oi2.Y(r30)
            r16 = r15
            r15 = r7
            r7 = r19
            r19 = r8
            r8 = r16
            r16 = r3
            r26 = r4
            r4 = r0
            r3 = r2
            r2 = r11
            r0 = r30
            r11 = r5
            r5 = r18
            r18 = r9
            r9 = r14
            r14 = 1
            goto L1ef
        L61:
            defpackage.oi2.Y(r30)
            r4 = 0
            r11.a = r4
            boolean r0 = r8.isRecycled()
            if (r0 == 0) goto L6f
        L6d:
            r0 = r8
            goto Lb3
        L6f:
            int r0 = r8.getWidth()     // Catch: java.lang.Throwable -> La3
            int r4 = r8.getHeight()     // Catch: java.lang.Throwable -> La3
            android.graphics.Bitmap$Config r10 = android.graphics.Bitmap.Config.ARGB_8888     // Catch: java.lang.Throwable -> La3
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r0, r4, r10)     // Catch: java.lang.Throwable -> La3
            r0.getClass()     // Catch: java.lang.Throwable -> La3
            android.graphics.Canvas r4 = new android.graphics.Canvas     // Catch: java.lang.Throwable -> La3
            r4.<init>(r0)     // Catch: java.lang.Throwable -> La3
            android.graphics.ColorMatrix r10 = new android.graphics.ColorMatrix     // Catch: java.lang.Throwable -> La3
            r13 = 20
            float[] r13 = new float[r13]     // Catch: java.lang.Throwable -> La3
            r13 = {x02f6: FILL_ARRAY_DATA  , data: [1065353216, 0, 0, 0, 0, 0, 1065353216, 0, 0, 0, 0, 0, 1065353216, 0, 0, 0, 0, 0, 0, 1132396544} // fill-array     // Catch: java.lang.Throwable -> La3
            r10.<init>(r13)     // Catch: java.lang.Throwable -> La3
            android.graphics.Paint r13 = new android.graphics.Paint     // Catch: java.lang.Throwable -> La3
            r13.<init>()     // Catch: java.lang.Throwable -> La3
            android.graphics.ColorMatrixColorFilter r14 = new android.graphics.ColorMatrixColorFilter     // Catch: java.lang.Throwable -> La3
            r14.<init>(r10)     // Catch: java.lang.Throwable -> La3
            r13.setColorFilter(r14)     // Catch: java.lang.Throwable -> La3
            r10 = 0
            r4.drawBitmap(r8, r10, r10, r13)     // Catch: java.lang.Throwable -> La3
            goto Lb3
        La3:
            android.graphics.Bitmap$Config r0 = r8.getConfig()
            android.graphics.Bitmap$Config r4 = android.graphics.Bitmap.Config.ARGB_8888
            if (r0 == r4) goto L6d
            r10 = 0
            android.graphics.Bitmap r0 = r8.copy(r4, r10)
            if (r0 != 0) goto Lb3
            goto L6d
        Lb3:
            int r4 = r0.getWidth()
            int r10 = r0.getHeight()
            int r13 = r9.size()
            java.lang.String r14 = "OCR start: bitmap="
            java.lang.String r15 = ", regions="
            java.lang.StringBuilder r4 = defpackage.i61.q(r4, r10, r14, r3, r15)
            r4.append(r13)
            java.lang.String r10 = ", lang="
            r4.append(r10)
            r4.append(r7)
            java.lang.String r4 = r4.toString()
            android.util.Log.i(r12, r4)
            boolean r4 = r9.isEmpty()
            if (r4 != 0) goto L2c2
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            int r5 = r0.getWidth()
            int r10 = r0.getHeight()
            java.util.Iterator r13 = r9.iterator()
            r15 = r5
            r14 = r10
            r5 = 0
            r10 = r4
            r4 = r0
        Lf5:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L2a0
            r18 = r9
            int r9 = r5 + 1
            java.lang.Object r0 = r13.next()
            r19 = r8
            r8 = r0
            ua7 r8 = (defpackage.ua7) r8
            android.graphics.RectF r0 = r8.b
            r20 = r2
            float r2 = r0.left
            r30 = r2
            float r2 = (float) r15
            r21 = r2
            float r2 = r30 * r21
            int r2 = (int) r2
            r22 = r7
            int r7 = r15 + (-1)
            r23 = r11
            r11 = 0
            int r2 = defpackage.gi2.q(r2, r11, r7)
            float r7 = r0.top
            float r11 = (float) r14
            float r7 = r7 * r11
            int r7 = (int) r7
            r30 = r11
            int r11 = r14 + (-1)
            r24 = r9
            r9 = 0
            int r7 = defpackage.gi2.q(r7, r9, r11)
            float r11 = r0.right
            float r11 = r11 * r21
            int r11 = (int) r11
            int r9 = r2 + 1
            int r9 = defpackage.gi2.q(r11, r9, r15)
            float r0 = r0.bottom
            float r0 = r0 * r30
            int r0 = (int) r0
            int r11 = r7 + 1
            int r11 = defpackage.gi2.q(r0, r11, r14)
            r21 = r14
            int r14 = r9 - r2
            r30 = r15
            int r15 = r11 - r7
            r0 = 6
            if (r14 < r0) goto L154
            if (r15 >= r0) goto L16a
        L154:
            r8 = r30
            r16 = r3
            r26 = r13
            r3 = r20
            r9 = r21
            r7 = r22
            r2 = r23
            r11 = r24
            r17 = 0
            r21 = 1
            goto L281
        L16a:
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r4, r2, r7, r14, r15)     // Catch: java.lang.Throwable -> L174
            r25 = r8
            r26 = r13
            r13 = r0
            goto L18b
        L174:
            r0 = move-exception
            r25 = r8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r26 = r13
            java.lang.String r13 = "Failed to crop region #"
            r8.<init>(r13)
            r8.append(r5)
            java.lang.String r8 = r8.toString()
            android.util.Log.e(r12, r8, r0)
            r13 = 0
        L18b:
            if (r13 != 0) goto L1a1
            r8 = r30
            r16 = r3
            r3 = r20
            r9 = r21
            r7 = r22
            r2 = r23
            r11 = r24
            r17 = 0
            r21 = 1
            goto L298
        L1a1:
            java.lang.String r0 = ": crop=["
            java.lang.String r8 = ","
            java.lang.StringBuilder r0 = defpackage.i61.q(r5, r2, r6, r0, r8)
            defpackage.lb1.x(r0, r7, r8, r9, r8)
            java.lang.String r2 = "] size="
            defpackage.lb1.x(r0, r11, r2, r14, r3)
            r0.append(r15)
            java.lang.String r0 = r0.toString()
            android.util.Log.i(r12, r0)
            r1.X = r4
            r1.Y = r10
            r2 = r26
            r1.Z = r2
            r7 = r25
            r1.d0 = r7
            r1.e0 = r13
            r8 = r30
            r1.f0 = r8
            r9 = r21
            r1.g0 = r9
            r11 = r24
            r1.h0 = r11
            r1.i0 = r5
            r14 = 1
            r1.j0 = r14
            r15 = r22
            r2 = r23
            java.lang.Object r0 = defpackage.wp2.b(r2, r13, r15, r1)
            r16 = r3
            r3 = r20
            if (r0 != r3) goto L1ea
            goto L2ce
        L1ea:
            r28 = r10
            r10 = r7
            r7 = r28
        L1ef:
            java.util.List r0 = (java.util.List) r0
            r13.recycle()
            android.graphics.RectF r10 = r10.b
            float r13 = r10.width()
            float r20 = r10.height()
            boolean r21 = r0.isEmpty()
            if (r21 != 0) goto L269
            int r14 = r0.size()
            r30 = r0
            java.lang.String r0 = " found "
            r22 = r4
            java.lang.String r4 = " text blocks"
            java.lang.String r0 = defpackage.xg6.m(r5, r14, r6, r0, r4)
            android.util.Log.i(r12, r0)
            java.util.Iterator r0 = r30.iterator()
        L21b:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L263
            java.lang.Object r4 = r0.next()
            ta7 r4 = (defpackage.ta7) r4
            android.graphics.RectF r5 = new android.graphics.RectF
            float r14 = r10.left
            r30 = r0
            android.graphics.RectF r0 = r4.c
            r23 = r8
            float r8 = r0.left
            float r8 = r8 * r13
            float r8 = r8 + r14
            r24 = r9
            float r9 = r10.top
            r25 = r9
            float r9 = r0.top
            float r9 = r9 * r20
            float r9 = r9 + r25
            r27 = r10
            float r10 = r0.right
            float r10 = r10 * r13
            float r10 = r10 + r14
            float r0 = r0.bottom
            float r0 = r0 * r20
            float r0 = r0 + r25
            r5.<init>(r8, r9, r10, r0)
            r0 = 59
            r8 = 0
            ta7 r0 = defpackage.ta7.a(r4, r8, r5, r0)
            r7.add(r0)
            r0 = r30
            r8 = r23
            r9 = r24
            r10 = r27
            goto L21b
        L263:
            r23 = r8
            r24 = r9
            r8 = 0
            goto L26c
        L269:
            r22 = r4
            goto L263
        L26c:
            r10 = r7
            r5 = r11
            r7 = r15
            r9 = r18
            r8 = r19
            r4 = r22
            r15 = r23
            r14 = r24
        L279:
            r13 = r26
            r11 = r2
            r2 = r3
            r3 = r16
            goto Lf5
        L281:
            java.lang.String r0 = " too small ("
            java.lang.String r13 = " x "
            java.lang.StringBuilder r0 = defpackage.i61.q(r5, r14, r6, r0, r13)
            r0.append(r15)
            java.lang.String r5 = "), skipping"
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            android.util.Log.w(r12, r0)
        L298:
            r15 = r8
            r14 = r9
            r5 = r11
            r9 = r18
            r8 = r19
            goto L279
        L2a0:
            r18 = r9
            r2 = r11
            if (r4 == r8) goto L2a8
            r4.recycle()
        L2a8:
            java.util.List r0 = defpackage.wp2.a(r2, r10)
            int r1 = r0.size()
            int r2 = r18.size()
            java.lang.String r3 = " total blocks from "
            java.lang.String r4 = " regions"
            java.lang.String r5 = "OCR finished with "
            java.lang.String r1 = defpackage.xg6.m(r1, r2, r5, r3, r4)
            android.util.Log.i(r12, r1)
            return r0
        L2c2:
            r3 = r2
            r2 = r11
            r1.X = r0
            r1.j0 = r5
            java.lang.Object r1 = defpackage.wp2.b(r2, r0, r7, r1)
            if (r1 != r3) goto L2cf
        L2ce:
            return r3
        L2cf:
            java.util.List r1 = (java.util.List) r1
            if (r0 == r8) goto L2d6
            r0.recycle()
        L2d6:
            java.util.List r0 = defpackage.wp2.a(r2, r1)
            int r1 = r0.size()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "OCR finished fullscreen with "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = " total blocks"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            android.util.Log.i(r12, r1)
            return r0
    }
}
