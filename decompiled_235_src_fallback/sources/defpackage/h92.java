package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: h92  reason: default package */
/* loaded from: classes.dex */
public final class h92 extends defpackage.ea7 {
    public static final java.lang.String[] B0 = null;
    public final int A0;

    static {
            java.lang.String r0 = "android:visibility:visibility"
            java.lang.String r1 = "android:visibility:parent"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            defpackage.h92.B0 = r0
            return
    }

    public h92() {
            r1 = this;
            r1.<init>()
            r0 = 3
            r1.A0 = r0
            return
    }

    public h92(int r1) {
            r0 = this;
            r0.<init>()
            r0.A0 = r1
            return
    }

    public static void Q(defpackage.sa7 r3) {
            android.view.View r0 = r3.b
            int r1 = r0.getVisibility()
            java.util.HashMap r3 = r3.a
            java.lang.String r2 = "android:visibility:visibility"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3.put(r2, r1)
            java.lang.String r1 = "android:visibility:parent"
            android.view.ViewParent r2 = r0.getParent()
            r3.put(r1, r2)
            r1 = 2
            int[] r1 = new int[r1]
            r0.getLocationOnScreen(r1)
            java.lang.String r0 = "android:visibility:screenLocation"
            r3.put(r0, r1)
            return
    }

    public static float S(defpackage.sa7 r1, float r2) {
            if (r1 == 0) goto L13
            java.util.HashMap r1 = r1.a
            java.lang.String r0 = "android:fade:transitionAlpha"
            java.lang.Object r1 = r1.get(r0)
            java.lang.Float r1 = (java.lang.Float) r1
            if (r1 == 0) goto L13
            float r1 = r1.floatValue()
            return r1
        L13:
            return r2
    }

    public static defpackage.uq7 T(defpackage.sa7 r8, defpackage.sa7 r9) {
            uq7 r0 = new uq7
            r0.<init>()
            r1 = 0
            r0.a = r1
            r0.b = r1
            r2 = 0
            r3 = -1
            java.lang.String r4 = "android:visibility:parent"
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L2f
            java.util.HashMap r6 = r8.a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L2f
            java.lang.Object r7 = r6.get(r5)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r0.c = r7
            java.lang.Object r6 = r6.get(r4)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.e = r6
            goto L33
        L2f:
            r0.c = r3
            r0.e = r2
        L33:
            if (r9 == 0) goto L52
            java.util.HashMap r6 = r9.a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L52
            java.lang.Object r2 = r6.get(r5)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.d = r2
            java.lang.Object r2 = r6.get(r4)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f = r2
            goto L56
        L52:
            r0.d = r3
            r0.f = r2
        L56:
            r2 = 1
            if (r8 == 0) goto L8a
            if (r9 == 0) goto L8a
            int r8 = r0.c
            int r9 = r0.d
            if (r8 != r9) goto L68
            android.view.ViewGroup r3 = r0.e
            android.view.ViewGroup r4 = r0.f
            if (r3 != r4) goto L68
            goto L9f
        L68:
            if (r8 == r9) goto L78
            if (r8 != 0) goto L71
            r0.b = r1
            r0.a = r2
            return r0
        L71:
            if (r9 != 0) goto L9f
            r0.b = r2
            r0.a = r2
            return r0
        L78:
            android.view.ViewGroup r8 = r0.f
            if (r8 != 0) goto L81
            r0.b = r1
            r0.a = r2
            return r0
        L81:
            android.view.ViewGroup r8 = r0.e
            if (r8 != 0) goto L9f
            r0.b = r2
            r0.a = r2
            return r0
        L8a:
            if (r8 != 0) goto L95
            int r8 = r0.d
            if (r8 != 0) goto L95
            r0.b = r2
            r0.a = r2
            return r0
        L95:
            if (r9 != 0) goto L9f
            int r8 = r0.c
            if (r8 != 0) goto L9f
            r0.b = r1
            r0.a = r2
        L9f:
            return r0
    }

    public final android.animation.ObjectAnimator R(android.view.View r3, float r4, float r5) {
            r2 = this;
            int r0 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            gq7 r0 = defpackage.dq7.a
            r0.Y(r3, r4)
            ml0 r4 = defpackage.dq7.b
            r0 = 1
            float[] r0 = new float[r0]
            r1 = 0
            r0[r1] = r5
            android.animation.ObjectAnimator r4 = android.animation.ObjectAnimator.ofFloat(r3, r4, r0)
            g92 r5 = new g92
            r5.<init>(r3)
            r4.addListener(r5)
            ea7 r2 = r2.p()
            r2.a(r5)
            return r4
    }

    @Override // defpackage.ea7
    public final void d(defpackage.sa7 r1) {
            r0 = this;
            Q(r1)
            return
    }

    @Override // defpackage.ea7
    public final void g(defpackage.sa7 r2) {
            r1 = this;
            Q(r2)
            android.view.View r1 = r2.b
            r0 = 2131428028(0x7f0b02bc, float:1.8477689E38)
            java.lang.Object r0 = r1.getTag(r0)
            java.lang.Float r0 = (java.lang.Float) r0
            if (r0 != 0) goto L26
            int r0 = r1.getVisibility()
            if (r0 != 0) goto L21
            gq7 r0 = defpackage.dq7.a
            float r1 = r0.K(r1)
            java.lang.Float r0 = java.lang.Float.valueOf(r1)
            goto L26
        L21:
            r1 = 0
            java.lang.Float r0 = java.lang.Float.valueOf(r1)
        L26:
            java.util.HashMap r1 = r2.a
            java.lang.String r2 = "android:fade:transitionAlpha"
            r1.put(r2, r0)
            return
    }

    @Override // defpackage.ea7
    public final android.animation.Animator l(android.view.ViewGroup r25, defpackage.sa7 r26, defpackage.sa7 r27) {
            r24 = this;
            r0 = r24
            r1 = r25
            r2 = r26
            r3 = r27
            uq7 r4 = T(r26, r27)
            boolean r5 = r4.a
            if (r5 == 0) goto L19
            android.view.ViewGroup r5 = r4.e
            if (r5 != 0) goto L1d
            android.view.ViewGroup r5 = r4.f
            if (r5 == 0) goto L19
            goto L1d
        L19:
            r16 = 0
            goto L2d0
        L1d:
            boolean r5 = r4.b
            int r7 = r0.A0
            r8 = 1065353216(0x3f800000, float:1.0)
            r9 = 0
            r10 = 1
            r11 = 0
            if (r5 == 0) goto L58
            r1 = r7 & 1
            if (r1 != r10) goto L19
            if (r3 != 0) goto L2f
            goto L19
        L2f:
            android.view.View r1 = r3.b
            if (r2 != 0) goto L4a
            android.view.ViewParent r3 = r1.getParent()
            android.view.View r3 = (android.view.View) r3
            sa7 r4 = r0.o(r3, r11)
            sa7 r3 = r0.t(r3, r11)
            uq7 r3 = T(r4, r3)
            boolean r3 = r3.a
            if (r3 == 0) goto L4a
            goto L19
        L4a:
            gq7 r3 = defpackage.dq7.a
            r3.getClass()
            float r2 = S(r2, r9)
            android.animation.ObjectAnimator r0 = r0.R(r1, r2, r8)
            return r0
        L58:
            int r4 = r4.d
            r5 = 2
            r7 = r7 & r5
            if (r7 == r5) goto L5f
            goto L19
        L5f:
            if (r2 != 0) goto L62
            goto L19
        L62:
            android.view.View r7 = r2.b
            if (r3 == 0) goto L69
            android.view.View r12 = r3.b
            goto L6a
        L69:
            r12 = 0
        L6a:
            r13 = 2131427852(0x7f0b020c, float:1.8477332E38)
            java.lang.Object r14 = r7.getTag(r13)
            android.view.View r14 = (android.view.View) r14
            if (r14 == 0) goto L80
            r22 = r4
            r18 = r10
            r17 = r11
            r6 = 0
            r16 = 0
            goto L21d
        L80:
            if (r12 == 0) goto L97
            android.view.ViewParent r14 = r12.getParent()
            if (r14 != 0) goto L89
            goto L97
        L89:
            r14 = 4
            if (r4 != r14) goto L8d
            goto L8f
        L8d:
            if (r7 != r12) goto L93
        L8f:
            r15 = r11
            r14 = r12
            r12 = 0
            goto L9b
        L93:
            r15 = r10
            r12 = 0
        L95:
            r14 = 0
            goto L9b
        L97:
            if (r12 == 0) goto L93
            r15 = r11
            goto L95
        L9b:
            if (r15 == 0) goto L211
            android.view.ViewParent r15 = r7.getParent()
            if (r15 != 0) goto Lb0
            r22 = r4
            r18 = r10
            r10 = r11
            r17 = r10
            r6 = r14
            r16 = 0
            r14 = r7
            goto L21d
        Lb0:
            android.view.ViewParent r15 = r7.getParent()
            boolean r15 = r15 instanceof android.view.View
            if (r15 == 0) goto L211
            android.view.ViewParent r15 = r7.getParent()
            android.view.View r15 = (android.view.View) r15
            r16 = 0
            sa7 r6 = r0.t(r15, r10)
            r17 = r11
            sa7 r11 = r0.o(r15, r10)
            uq7 r6 = T(r6, r11)
            boolean r6 = r6.a
            if (r6 != 0) goto L1fa
            boolean r6 = defpackage.ra7.a
            android.graphics.Matrix r6 = new android.graphics.Matrix
            r6.<init>()
            int r11 = r15.getScrollX()
            int r11 = -r11
            float r11 = (float) r11
            int r12 = r15.getScrollY()
            int r12 = -r12
            float r12 = (float) r12
            r6.setTranslate(r11, r12)
            gq7 r11 = defpackage.dq7.a
            r11.d0(r7, r6)
            r11.e0(r1, r6)
            android.graphics.RectF r11 = new android.graphics.RectF
            int r12 = r7.getWidth()
            float r12 = (float) r12
            int r15 = r7.getHeight()
            float r15 = (float) r15
            r11.<init>(r9, r9, r12, r15)
            r6.mapRect(r11)
            float r12 = r11.left
            int r12 = java.lang.Math.round(r12)
            float r15 = r11.top
            int r15 = java.lang.Math.round(r15)
            r18 = r10
            float r10 = r11.right
            int r10 = java.lang.Math.round(r10)
            float r13 = r11.bottom
            int r13 = java.lang.Math.round(r13)
            android.widget.ImageView r9 = new android.widget.ImageView
            android.content.Context r5 = r7.getContext()
            r9.<init>(r5)
            android.widget.ImageView$ScaleType r5 = android.widget.ImageView.ScaleType.CENTER_CROP
            r9.setScaleType(r5)
            boolean r5 = r7.isAttachedToWindow()
            if (r1 == 0) goto L139
            boolean r19 = r1.isAttachedToWindow()
            if (r19 == 0) goto L139
            r19 = r18
            goto L13b
        L139:
            r19 = r17
        L13b:
            if (r5 != 0) goto L15d
            if (r19 != 0) goto L147
            r22 = r4
            r21 = r14
            r0 = r16
            goto L1db
        L147:
            android.view.ViewParent r19 = r7.getParent()
            r8 = r19
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            int r19 = r8.indexOfChild(r7)
            defpackage.ao7.a(r7, r1)
            r23 = r19
            r19 = r5
            r5 = r23
            goto L163
        L15d:
            r19 = r5
            r8 = r16
            r5 = r17
        L163:
            float r20 = r11.width()
            r21 = r14
            int r14 = java.lang.Math.round(r20)
            float r20 = r11.height()
            r22 = r4
            int r4 = java.lang.Math.round(r20)
            if (r14 <= 0) goto L1cd
            if (r4 <= 0) goto L1cd
            int r3 = r14 * r4
            float r3 = (float) r3
            r20 = 1233125376(0x49800000, float:1048576.0)
            float r3 = r20 / r3
            r0 = 1065353216(0x3f800000, float:1.0)
            float r3 = java.lang.Math.min(r0, r3)
            float r0 = (float) r14
            float r0 = r0 * r3
            int r0 = java.lang.Math.round(r0)
            float r4 = (float) r4
            float r4 = r4 * r3
            int r4 = java.lang.Math.round(r4)
            float r14 = r11.left
            float r14 = -r14
            float r11 = r11.top
            float r11 = -r11
            r6.postTranslate(r14, r11)
            r6.postScale(r3, r3)
            boolean r3 = defpackage.ra7.a
            if (r3 == 0) goto L1bb
            android.graphics.Picture r3 = new android.graphics.Picture
            r3.<init>()
            android.graphics.Canvas r0 = r3.beginRecording(r0, r4)
            r0.concat(r6)
            r7.draw(r0)
            r3.endRecording()
            android.graphics.Bitmap r0 = defpackage.pp.c(r3)
            goto L1cf
        L1bb:
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r0, r4, r3)
            android.graphics.Canvas r3 = new android.graphics.Canvas
            r3.<init>(r0)
            r3.concat(r6)
            r7.draw(r3)
            goto L1cf
        L1cd:
            r0 = r16
        L1cf:
            if (r19 != 0) goto L1db
            android.view.ViewGroupOverlay r3 = r1.getOverlay()
            r3.remove(r7)
            r8.addView(r7, r5)
        L1db:
            if (r0 == 0) goto L1e0
            r9.setImageBitmap(r0)
        L1e0:
            int r0 = r10 - r12
            r3 = 1073741824(0x40000000, float:2.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            int r4 = r13 - r15
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r3)
            r9.measure(r0, r3)
            r9.layout(r12, r15, r10, r13)
            r14 = r9
        L1f5:
            r10 = r17
            r6 = r21
            goto L21d
        L1fa:
            r22 = r4
            r18 = r10
            r21 = r14
            int r0 = r15.getId()
            android.view.ViewParent r3 = r15.getParent()
            if (r3 != 0) goto L21b
            r3 = -1
            if (r0 == r3) goto L21b
            r1.findViewById(r0)
            goto L21b
        L211:
            r22 = r4
            r18 = r10
            r17 = r11
            r21 = r14
            r16 = 0
        L21b:
            r14 = r12
            goto L1f5
        L21d:
            if (r14 == 0) goto L290
            if (r10 != 0) goto L24e
            java.util.HashMap r0 = r2.a
            java.lang.String r3 = "android:visibility:screenLocation"
            java.lang.Object r0 = r0.get(r3)
            int[] r0 = (int[]) r0
            r3 = r0[r17]
            r0 = r0[r18]
            r4 = 2
            int[] r4 = new int[r4]
            r1.getLocationOnScreen(r4)
            r5 = r4[r17]
            int r3 = r3 - r5
            int r5 = r14.getLeft()
            int r3 = r3 - r5
            r14.offsetLeftAndRight(r3)
            r3 = r4[r18]
            int r0 = r0 - r3
            int r3 = r14.getTop()
            int r0 = r0 - r3
            r14.offsetTopAndBottom(r0)
            defpackage.ao7.a(r14, r1)
        L24e:
            gq7 r0 = defpackage.dq7.a
            r0.getClass()
            r3 = 1065353216(0x3f800000, float:1.0)
            float r2 = S(r2, r3)
            r5 = 0
            r4 = r24
            android.animation.ObjectAnimator r2 = r4.R(r14, r2, r5)
            if (r2 != 0) goto L26b
            r5 = r27
            float r3 = S(r5, r3)
            r0.Y(r14, r3)
        L26b:
            if (r10 != 0) goto L28f
            if (r2 != 0) goto L277
            android.view.ViewGroupOverlay r0 = r1.getOverlay()
            r0.remove(r14)
            return r2
        L277:
            r0 = 2131427852(0x7f0b020c, float:1.8477332E38)
            r7.setTag(r0, r14)
            tq7 r0 = new tq7
            r0.<init>(r4, r1, r14, r7)
            r2.addListener(r0)
            r2.addPauseListener(r0)
            ea7 r1 = r4.p()
            r1.a(r0)
        L28f:
            return r2
        L290:
            r4 = r24
            r5 = r27
            if (r6 == 0) goto L2d0
            int r0 = r6.getVisibility()
            r1 = r17
            defpackage.dq7.b(r6, r1)
            gq7 r1 = defpackage.dq7.a
            r1.getClass()
            r3 = 1065353216(0x3f800000, float:1.0)
            float r2 = S(r2, r3)
            r7 = 0
            android.animation.ObjectAnimator r2 = r4.R(r6, r2, r7)
            if (r2 != 0) goto L2b8
            float r3 = S(r5, r3)
            r1.Y(r6, r3)
        L2b8:
            if (r2 == 0) goto L2cc
            sq7 r0 = new sq7
            r1 = r22
            r0.<init>(r6, r1)
            r2.addListener(r0)
            ea7 r1 = r4.p()
            r1.a(r0)
            return r2
        L2cc:
            defpackage.dq7.b(r6, r0)
            return r2
        L2d0:
            return r16
    }

    @Override // defpackage.ea7
    public final java.lang.String[] s() {
            r0 = this;
            java.lang.String[] r0 = defpackage.h92.B0
            return r0
    }

    @Override // defpackage.ea7
    public final boolean v() {
            r0 = this;
            r0 = 1
            return r0
    }

    @Override // defpackage.ea7
    public final boolean w(defpackage.sa7 r3, defpackage.sa7 r4) {
            r2 = this;
            if (r3 != 0) goto L5
            if (r4 != 0) goto L5
            goto L2c
        L5:
            if (r3 == 0) goto L1a
            if (r4 == 0) goto L1a
            java.util.HashMap r2 = r4.a
            java.lang.String r0 = "android:visibility:visibility"
            boolean r2 = r2.containsKey(r0)
            java.util.HashMap r1 = r3.a
            boolean r0 = r1.containsKey(r0)
            if (r2 == r0) goto L1a
            goto L2c
        L1a:
            uq7 r2 = T(r3, r4)
            boolean r3 = r2.a
            if (r3 == 0) goto L2c
            int r3 = r2.c
            if (r3 == 0) goto L2a
            int r2 = r2.d
            if (r2 != 0) goto L2c
        L2a:
            r2 = 1
            return r2
        L2c:
            r2 = 0
            return r2
    }
}
