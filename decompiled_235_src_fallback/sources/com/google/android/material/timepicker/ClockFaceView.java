package com.google.android.material.timepicker;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
class ClockFaceView extends defpackage.id5 implements defpackage.yr0 {
    public final int A0;
    public final int B0;
    public final int C0;
    public final int D0;
    public final java.lang.String[] E0;
    public float F0;
    public final android.content.res.ColorStateList G0;
    public final com.google.android.material.timepicker.ClockHandView s0;
    public final android.graphics.Rect t0;
    public final android.graphics.RectF u0;
    public final android.graphics.Rect v0;
    public final android.util.SparseArray w0;
    public final com.google.android.material.timepicker.c x0;
    public final int[] y0;
    public final float[] z0;

    public ClockFaceView(android.content.Context r11, android.util.AttributeSet r12) {
            r10 = this;
            r10.<init>(r11, r12)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r10.t0 = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r10.u0 = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r10.v0 = r0
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r10.w0 = r0
            r1 = 3
            float[] r1 = new float[r1]
            r1 = {x014c: FILL_ARRAY_DATA  , data: [0, 1063675494, 1065353216} // fill-array
            r10.z0 = r1
            int[] r1 = defpackage.a75.d
            r2 = 2132018452(0x7f140514, float:1.9675211E38)
            r3 = 2130969464(0x7f040378, float:1.754761E38)
            android.content.res.TypedArray r12 = r11.obtainStyledAttributes(r12, r1, r3, r2)
            android.content.res.Resources r1 = r10.getResources()
            r2 = 1
            android.content.res.ColorStateList r3 = defpackage.np2.S(r11, r12, r2)
            r10.G0 = r3
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r11)
            r5 = 2131624024(0x7f0e0058, float:1.8875216E38)
            r4.inflate(r5, r10, r2)
            r4 = 2131427699(0x7f0b0173, float:1.8477022E38)
            android.view.View r4 = r10.findViewById(r4)
            com.google.android.material.timepicker.ClockHandView r4 = (com.google.android.material.timepicker.ClockHandView) r4
            r10.s0 = r4
            r5 = 2131165965(0x7f07030d, float:1.7946162E38)
            int r5 = r1.getDimensionPixelSize(r5)
            r10.A0 = r5
            r5 = 16842913(0x10100a1, float:2.369401E-38)
            int[] r5 = new int[]{r5}
            int r6 = r3.getDefaultColor()
            int r5 = r3.getColorForState(r5, r6)
            int r3 = r3.getDefaultColor()
            int[] r3 = new int[]{r5, r5, r3}
            r10.y0 = r3
            java.util.ArrayList r3 = r4.L
            r3.add(r10)
            r3 = 2131100533(0x7f060375, float:1.781345E38)
            android.content.res.ColorStateList r3 = defpackage.ge7.A(r11, r3)
            int r3 = r3.getDefaultColor()
            r4 = 0
            android.content.res.ColorStateList r11 = defpackage.np2.S(r11, r12, r4)
            if (r11 != 0) goto L8d
            goto L91
        L8d:
            int r3 = r11.getDefaultColor()
        L91:
            r10.setBackgroundColor(r3)
            android.view.ViewTreeObserver r11 = r10.getViewTreeObserver()
            com.google.android.material.timepicker.b r3 = new com.google.android.material.timepicker.b
            r3.<init>(r10)
            r11.addOnPreDrawListener(r3)
            r10.setFocusable(r4)
            r12.recycle()
            com.google.android.material.timepicker.c r11 = new com.google.android.material.timepicker.c
            r11.<init>(r10)
            r10.x0 = r11
            r11 = 12
            java.lang.String[] r11 = new java.lang.String[r11]
            java.lang.String r12 = ""
            java.util.Arrays.fill(r11, r12)
            r10.E0 = r11
            android.content.Context r11 = r10.getContext()
            android.view.LayoutInflater r11 = android.view.LayoutInflater.from(r11)
            int r12 = r0.size()
            r3 = r4
            r5 = r3
        Lc6:
            java.lang.String[] r6 = r10.E0
            int r6 = r6.length
            int r6 = java.lang.Math.max(r6, r12)
            if (r3 >= r6) goto L120
            java.lang.Object r6 = r0.get(r3)
            android.widget.TextView r6 = (android.widget.TextView) r6
            java.lang.String[] r7 = r10.E0
            int r7 = r7.length
            if (r3 < r7) goto Le1
            r10.removeView(r6)
            r0.remove(r3)
            goto L11d
        Le1:
            if (r6 != 0) goto Lf2
            r6 = 2131624023(0x7f0e0057, float:1.8875214E38)
            android.view.View r6 = r11.inflate(r6, r10, r4)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r0.put(r3, r6)
            r10.addView(r6)
        Lf2:
            java.lang.String[] r7 = r10.E0
            r7 = r7[r3]
            r6.setText(r7)
            r7 = 2131427715(0x7f0b0183, float:1.8477054E38)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)
            r6.setTag(r7, r8)
            int r7 = r3 / 12
            int r7 = r7 + r2
            r8 = 2131427700(0x7f0b0174, float:1.8477024E38)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)
            r6.setTag(r8, r9)
            if (r7 <= r2) goto L113
            r5 = r2
        L113:
            com.google.android.material.timepicker.c r7 = r10.x0
            defpackage.ao7.n(r6, r7)
            android.content.res.ColorStateList r7 = r10.G0
            r6.setTextColor(r7)
        L11d:
            int r3 = r3 + 1
            goto Lc6
        L120:
            com.google.android.material.timepicker.ClockHandView r11 = r10.s0
            boolean r12 = r11.B
            if (r12 == 0) goto L12a
            if (r5 != 0) goto L12a
            r11.l0 = r2
        L12a:
            r11.B = r5
            r11.invalidate()
            r11 = 2131165994(0x7f07032a, float:1.794622E38)
            int r11 = r1.getDimensionPixelSize(r11)
            r10.B0 = r11
            r11 = 2131165995(0x7f07032b, float:1.7946223E38)
            int r11 = r1.getDimensionPixelSize(r11)
            r10.C0 = r11
            r11 = 2131165972(0x7f070314, float:1.7946176E38)
            int r11 = r1.getDimensionPixelSize(r11)
            r10.D0 = r11
            return
    }

    @Override // defpackage.id5
    public final void o() {
            r10 = this;
            z11 r0 = new z11
            r0.<init>()
            r0.e(r10)
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r2 = 0
            r3 = r2
        Lf:
            int r4 = r10.getChildCount()
            r5 = 2131427498(0x7f0b00aa, float:1.8476614E38)
            if (r3 >= r4) goto L59
            android.view.View r4 = r10.getChildAt(r3)
            int r6 = r4.getId()
            if (r6 == r5) goto L56
            java.lang.String r5 = "skip"
            java.lang.Object r6 = r4.getTag()
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L2f
            goto L56
        L2f:
            r5 = 2131427700(0x7f0b0174, float:1.8477024E38)
            java.lang.Object r5 = r4.getTag(r5)
            java.lang.Integer r5 = (java.lang.Integer) r5
            if (r5 != 0) goto L3f
            r5 = 1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
        L3f:
            boolean r6 = r1.containsKey(r5)
            if (r6 != 0) goto L4d
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r1.put(r5, r6)
        L4d:
            java.lang.Object r5 = r1.get(r5)
            java.util.List r5 = (java.util.List) r5
            r5.add(r4)
        L56:
            int r3 = r3 + 1
            goto Lf
        L59:
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L61:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto Lb6
            java.lang.Object r3 = r1.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getValue()
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r3 = r3.getKey()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            int r6 = r10.q0
            r7 = 2
            if (r3 != r7) goto L8b
            float r3 = (float) r6
            r6 = 1059648963(0x3f28f5c3, float:0.66)
            float r3 = r3 * r6
            int r6 = java.lang.Math.round(r3)
        L8b:
            java.util.Iterator r3 = r4.iterator()
            r7 = 0
        L90:
            boolean r8 = r3.hasNext()
            if (r8 == 0) goto L61
            java.lang.Object r8 = r3.next()
            android.view.View r8 = (android.view.View) r8
            int r8 = r8.getId()
            u11 r8 = r0.h(r8)
            v11 r8 = r8.e
            r8.A = r5
            r8.B = r6
            r8.C = r7
            int r8 = r4.size()
            float r8 = (float) r8
            r9 = 1135869952(0x43b40000, float:360.0)
            float r9 = r9 / r8
            float r7 = r7 + r9
            goto L90
        Lb6:
            r0.b(r10)
            r0 = r2
        Lba:
            android.util.SparseArray r1 = r10.w0
            int r3 = r1.size()
            if (r0 >= r3) goto Lce
            java.lang.Object r1 = r1.get(r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1.setVisibility(r2)
            int r0 = r0 + 1
            goto Lba
        Lce:
            return
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r3) {
            r2 = this;
            super.onInitializeAccessibilityNodeInfo(r3)
            java.lang.String[] r2 = r2.E0
            int r2 = r2.length
            r0 = 0
            r1 = 1
            android.view.accessibility.AccessibilityNodeInfo$CollectionInfo r2 = android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.obtain(r1, r2, r0, r1)
            r3.setCollectionInfo(r2)
            return
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            super.onLayout(r1, r2, r3, r4, r5)
            r0.p()
            return
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int r3, int r4) {
            r2 = this;
            android.content.res.Resources r3 = r2.getResources()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            int r4 = r3.heightPixels
            float r4 = (float) r4
            int r3 = r3.widthPixels
            float r3 = (float) r3
            int r0 = r2.D0
            float r0 = (float) r0
            int r1 = r2.B0
            float r1 = (float) r1
            float r1 = r1 / r4
            int r4 = r2.C0
            float r4 = (float) r4
            float r4 = r4 / r3
            r3 = 1065353216(0x3f800000, float:1.0)
            float r4 = java.lang.Math.max(r1, r4)
            float r3 = java.lang.Math.max(r4, r3)
            float r0 = r0 / r3
            int r3 = (int) r0
            r4 = 1073741824(0x40000000, float:2.0)
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r4)
            r2.setMeasuredDimension(r3, r3)
            super.onMeasure(r4, r4)
            return
    }

    public final void p() {
            r18 = this;
            r0 = r18
            com.google.android.material.timepicker.ClockHandView r1 = r0.s0
            android.graphics.RectF r1 = r1.f0
            r2 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r3 = 0
            r4 = 0
            r6 = r3
            r5 = r4
        Ld:
            android.util.SparseArray r7 = r0.w0
            int r8 = r7.size()
            android.graphics.Rect r9 = r0.t0
            android.graphics.RectF r10 = r0.u0
            if (r5 >= r8) goto L3d
            java.lang.Object r7 = r7.get(r5)
            android.widget.TextView r7 = (android.widget.TextView) r7
            if (r7 != 0) goto L22
            goto L3a
        L22:
            r7.getHitRect(r9)
            r10.set(r9)
            r10.union(r1)
            float r8 = r10.width()
            float r9 = r10.height()
            float r9 = r9 * r8
            int r8 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r8 >= 0) goto L3a
            r6 = r7
            r2 = r9
        L3a:
            int r5 = r5 + 1
            goto Ld
        L3d:
            r2 = r4
        L3e:
            int r5 = r7.size()
            if (r2 >= r5) goto La2
            java.lang.Object r5 = r7.get(r2)
            android.widget.TextView r5 = (android.widget.TextView) r5
            if (r5 != 0) goto L4d
            goto L9f
        L4d:
            if (r5 != r6) goto L51
            r8 = 1
            goto L52
        L51:
            r8 = r4
        L52:
            r5.setSelected(r8)
            r5.getHitRect(r9)
            r10.set(r9)
            android.graphics.Rect r8 = r0.v0
            r5.getLineBounds(r4, r8)
            int r11 = r8.left
            float r11 = (float) r11
            int r8 = r8.top
            float r8 = (float) r8
            r10.inset(r11, r8)
            boolean r8 = android.graphics.RectF.intersects(r1, r10)
            if (r8 != 0) goto L71
            r11 = r3
            goto L95
        L71:
            android.graphics.RadialGradient r11 = new android.graphics.RadialGradient
            float r8 = r1.centerX()
            float r12 = r10.left
            float r12 = r8 - r12
            float r8 = r1.centerY()
            float r13 = r10.top
            float r13 = r8 - r13
            float r8 = r1.width()
            r14 = 1056964608(0x3f000000, float:0.5)
            float r14 = r14 * r8
            float[] r8 = r0.z0
            android.graphics.Shader$TileMode r17 = android.graphics.Shader.TileMode.CLAMP
            int[] r15 = r0.y0
            r16 = r8
            r11.<init>(r12, r13, r14, r15, r16, r17)
        L95:
            android.text.TextPaint r8 = r5.getPaint()
            r8.setShader(r11)
            r5.invalidate()
        L9f:
            int r2 = r2 + 1
            goto L3e
        La2:
            return
    }
}
