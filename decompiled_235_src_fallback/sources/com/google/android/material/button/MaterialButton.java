package com.google.android.material.button;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class MaterialButton extends defpackage.lq implements android.widget.Checkable, defpackage.xe6 {
    public static final int[] E0 = null;
    public static final int[] F0 = null;
    public static final defpackage.w14 G0 = null;
    public int A0;
    public float B0;
    public float C0;
    public defpackage.fo6 D0;
    public final defpackage.a24 R;
    public final java.util.LinkedHashSet d0;
    public defpackage.x14 e0;
    public android.graphics.PorterDuff.Mode f0;
    public android.content.res.ColorStateList g0;
    public android.graphics.drawable.Drawable h0;
    public java.lang.String i0;
    public int j0;
    public int k0;
    public int l0;
    public int m0;
    public boolean n0;
    public boolean o0;
    public int p0;
    public int q0;
    public float r0;
    public int s0;
    public int t0;
    public android.widget.LinearLayout.LayoutParams u0;
    public boolean v0;
    public int w0;
    public boolean x0;
    public int y0;
    public defpackage.aq6 z0;

    static {
            r0 = 16842911(0x101009f, float:2.3694004E-38)
            int[] r0 = new int[]{r0}
            com.google.android.material.button.MaterialButton.E0 = r0
            r0 = 16842912(0x10100a0, float:2.3694006E-38)
            int[] r0 = new int[]{r0}
            com.google.android.material.button.MaterialButton.F0 = r0
            w14 r0 = new w14
            r0.<init>()
            com.google.android.material.button.MaterialButton.G0 = r0
            return
    }

    public MaterialButton(android.content.Context r10, android.util.AttributeSet r11) {
            r9 = this;
            r0 = 2130969477(0x7f040385, float:1.7547637E38)
            int[] r0 = new int[]{r0}
            r4 = 2130969441(0x7f040361, float:1.7547564E38)
            r7 = 2132018360(0x7f1404b8, float:1.9675024E38)
            android.content.Context r10 = defpackage.q60.f0(r10, r11, r4, r7, r0)
            r9.<init>(r10, r11, r4)
            java.util.LinkedHashSet r10 = new java.util.LinkedHashSet
            r10.<init>()
            r9.d0 = r10
            r10 = 0
            r9.n0 = r10
            r9.o0 = r10
            r0 = -1
            r9.q0 = r0
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r9.r0 = r1
            r9.s0 = r0
            r9.t0 = r0
            r9.y0 = r0
            android.content.Context r1 = r9.getContext()
            r5 = 2132018360(0x7f1404b8, float:1.9675024E38)
            int[] r6 = new int[r10]
            int[] r3 = defpackage.a75.j
            r2 = r11
            android.content.res.TypedArray r11 = defpackage.f04.K(r1, r2, r3, r4, r5, r6)
            r3 = 13
            int r3 = r11.getDimensionPixelSize(r3, r10)
            r9.m0 = r3
            r3 = 16
            int r3 = r11.getInt(r3, r0)
            android.graphics.PorterDuff$Mode r5 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r3 = defpackage.qo2.E(r3, r5)
            r9.f0 = r3
            android.content.Context r3 = r9.getContext()
            r6 = 15
            android.content.res.ColorStateList r3 = defpackage.np2.S(r3, r11, r6)
            r9.g0 = r3
            android.content.Context r3 = r9.getContext()
            r6 = 11
            android.graphics.drawable.Drawable r3 = defpackage.np2.T(r3, r11, r6)
            r9.h0 = r3
            r3 = 12
            r6 = 1
            int r3 = r11.getInteger(r3, r6)
            r9.p0 = r3
            r3 = 14
            int r3 = r11.getDimensionPixelSize(r3, r10)
            r9.j0 = r3
            r3 = 19
            xp6 r3 = defpackage.xp6.b(r1, r11, r3)
            if (r3 == 0) goto L89
            me6 r1 = r3.c()
            goto L91
        L89:
            le6 r1 = defpackage.me6.b(r1, r2, r4, r7)
            me6 r1 = r1.a()
        L91:
            r2 = 17
            boolean r2 = r11.getBoolean(r2, r10)
            a24 r4 = new a24
            r4.<init>(r9, r1)
            r9.R = r4
            r1 = 2
            int r1 = r11.getDimensionPixelOffset(r1, r10)
            r4.f = r1
            r1 = 3
            int r1 = r11.getDimensionPixelOffset(r1, r10)
            r4.g = r1
            r1 = 4
            int r1 = r11.getDimensionPixelOffset(r1, r10)
            r4.h = r1
            r1 = 5
            int r1 = r11.getDimensionPixelOffset(r1, r10)
            r4.i = r1
            r1 = 9
            boolean r7 = r11.hasValue(r1)
            if (r7 == 0) goto Lf9
            int r1 = r11.getDimensionPixelSize(r1, r0)
            r4.j = r1
            me6 r7 = r4.b
            float r1 = (float) r1
            le6 r7 = r7.f()
            t r8 = new t
            r8.<init>(r1)
            r7.e = r8
            t r8 = new t
            r8.<init>(r1)
            r7.f = r8
            t r8 = new t
            r8.<init>(r1)
            r7.g = r8
            t r8 = new t
            r8.<init>(r1)
            r7.h = r8
            me6 r1 = r7.a()
            r4.b = r1
            r1 = 0
            r4.c = r1
            r4.d()
            r4.s = r6
        Lf9:
            r1 = 22
            int r1 = r11.getDimensionPixelSize(r1, r10)
            r4.k = r1
            r1 = 8
            int r0 = r11.getInt(r1, r0)
            android.graphics.PorterDuff$Mode r0 = defpackage.qo2.E(r0, r5)
            r4.l = r0
            android.content.Context r0 = r9.getContext()
            r1 = 7
            android.content.res.ColorStateList r0 = defpackage.np2.S(r0, r11, r1)
            r4.m = r0
            android.content.Context r0 = r9.getContext()
            r1 = 21
            android.content.res.ColorStateList r0 = defpackage.np2.S(r0, r11, r1)
            r4.n = r0
            android.content.Context r0 = r9.getContext()
            r1 = 18
            android.content.res.ColorStateList r0 = defpackage.np2.S(r0, r11, r1)
            r4.o = r0
            r0 = 6
            boolean r0 = r11.getBoolean(r0, r10)
            r4.t = r0
            r0 = 10
            int r0 = r11.getDimensionPixelSize(r0, r10)
            r4.w = r0
            r0 = 23
            boolean r0 = r11.getBoolean(r0, r6)
            r4.u = r0
            int r0 = r9.getPaddingStart()
            int r1 = r9.getPaddingTop()
            int r5 = r9.getPaddingEnd()
            int r7 = r9.getPaddingBottom()
            boolean r8 = r11.hasValue(r10)
            if (r8 == 0) goto L16a
            r4.r = r6
            android.content.res.ColorStateList r8 = r4.m
            r9.setSupportBackgroundTintList(r8)
            android.graphics.PorterDuff$Mode r8 = r4.l
            r9.setSupportBackgroundTintMode(r8)
            goto L16d
        L16a:
            r4.c()
        L16d:
            int r8 = r4.f
            int r0 = r0 + r8
            int r8 = r4.h
            int r1 = r1 + r8
            int r8 = r4.g
            int r5 = r5 + r8
            int r8 = r4.i
            int r7 = r7 + r8
            r9.setPaddingRelative(r0, r1, r5, r7)
            boolean r0 = r11.getBoolean(r6, r10)
            r9.setCheckedInternal(r0)
            if (r3 == 0) goto L197
            go6 r0 = r9.d()
            r4.d = r0
            xp6 r0 = r4.c
            if (r0 == 0) goto L192
            r4.d()
        L192:
            r4.c = r3
            r4.d()
        L197:
            r9.setOpticalCenterEnabled(r2)
            r11.recycle()
            int r11 = r9.m0
            r9.setCompoundDrawablePadding(r11)
            android.graphics.drawable.Drawable r11 = r9.h0
            if (r11 == 0) goto L1a7
            r10 = r6
        L1a7:
            r9.h(r10)
            return
    }

    public static /* synthetic */ void a(com.google.android.material.button.MaterialButton r1) {
            int r0 = r1.getOpticalCenterShift()
            r1.w0 = r0
            r1.j()
            r1.invalidate()
            return
    }

    public static /* synthetic */ float b(com.google.android.material.button.MaterialButton r0) {
            float r0 = r0.getDisplayedWidthIncrease()
            return r0
    }

    public static /* synthetic */ void c(com.google.android.material.button.MaterialButton r0, float r1) {
            r0.setDisplayedWidthIncrease(r1)
            return
    }

    private android.text.Layout.Alignment getActualTextAlignment() {
            r2 = this;
            int r0 = r2.getTextAlignment()
            r1 = 1
            if (r0 == r1) goto L19
            r2 = 6
            if (r0 == r2) goto L16
            r2 = 3
            if (r0 == r2) goto L16
            r2 = 4
            if (r0 == r2) goto L13
            android.text.Layout$Alignment r2 = android.text.Layout.Alignment.ALIGN_NORMAL
            return r2
        L13:
            android.text.Layout$Alignment r2 = android.text.Layout.Alignment.ALIGN_CENTER
            return r2
        L16:
            android.text.Layout$Alignment r2 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            return r2
        L19:
            android.text.Layout$Alignment r2 = r2.getGravityTextAlignment()
            return r2
    }

    private float getDisplayedWidthIncrease() {
            r0 = this;
            float r0 = r0.B0
            return r0
    }

    private android.text.Layout.Alignment getGravityTextAlignment() {
            r1 = this;
            int r1 = r1.getGravity()
            r0 = 8388615(0x800007, float:1.1754953E-38)
            r1 = r1 & r0
            r0 = 1
            if (r1 == r0) goto L19
            r0 = 5
            if (r1 == r0) goto L16
            r0 = 8388613(0x800005, float:1.175495E-38)
            if (r1 == r0) goto L16
            android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_NORMAL
            return r1
        L16:
            android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            return r1
        L19:
            android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_CENTER
            return r1
    }

    private int getOpticalCenterShift() {
            r2 = this;
            boolean r0 = r2.v0
            r1 = 0
            if (r0 == 0) goto L1b
            boolean r0 = r2.x0
            if (r0 == 0) goto L1b
            a24 r2 = r2.R
            p24 r2 = r2.a(r1)
            if (r2 == 0) goto L1b
            float r2 = r2.h()
            r0 = 1038174126(0x3de147ae, float:0.11)
            float r2 = r2 * r0
            int r2 = (int) r2
            return r2
        L1b:
            return r1
    }

    private int getTextHeight() {
            r5 = this;
            int r0 = r5.getLineCount()
            r1 = 1
            if (r0 <= r1) goto L10
            android.text.Layout r5 = r5.getLayout()
            int r5 = r5.getHeight()
            return r5
        L10:
            android.text.TextPaint r0 = r5.getPaint()
            java.lang.CharSequence r1 = r5.getText()
            java.lang.String r1 = r1.toString()
            android.text.method.TransformationMethod r2 = r5.getTransformationMethod()
            if (r2 == 0) goto L2e
            android.text.method.TransformationMethod r2 = r5.getTransformationMethod()
            java.lang.CharSequence r1 = r2.getTransformation(r1, r5)
            java.lang.String r1 = r1.toString()
        L2e:
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r3 = 0
            int r4 = r1.length()
            r0.getTextBounds(r1, r3, r4, r2)
            int r0 = r2.height()
            android.text.Layout r5 = r5.getLayout()
            int r5 = r5.getHeight()
            int r5 = java.lang.Math.min(r0, r5)
            return r5
    }

    private int getTextLayoutWidth() {
            r4 = this;
            int r0 = r4.getLineCount()
            r1 = 0
            r2 = 0
        L6:
            if (r2 >= r0) goto L17
            android.text.Layout r3 = r4.getLayout()
            float r3 = r3.getLineWidth(r2)
            float r1 = java.lang.Math.max(r1, r3)
            int r2 = r2 + 1
            goto L6
        L17:
            double r0 = (double) r1
            double r0 = java.lang.Math.ceil(r0)
            int r4 = (int) r0
            return r4
    }

    private void setCheckedInternal(boolean r3) {
            r2 = this;
            a24 r0 = r2.R
            if (r0 == 0) goto L4a
            boolean r0 = r0.t
            if (r0 == 0) goto L4a
            boolean r0 = r2.n0
            if (r0 == r3) goto L4a
            r2.n0 = r3
            r2.refreshDrawableState()
            android.view.ViewParent r3 = r2.getParent()
            boolean r3 = r3 instanceof com.google.android.material.button.MaterialButtonToggleGroup
            if (r3 == 0) goto L2d
            android.view.ViewParent r3 = r2.getParent()
            com.google.android.material.button.MaterialButtonToggleGroup r3 = (com.google.android.material.button.MaterialButtonToggleGroup) r3
            boolean r0 = r2.n0
            boolean r1 = r3.k0
            if (r1 == 0) goto L26
            goto L2d
        L26:
            int r1 = r2.getId()
            r3.f(r1, r0)
        L2d:
            boolean r3 = r2.o0
            if (r3 == 0) goto L32
            goto L4a
        L32:
            r3 = 1
            r2.o0 = r3
            java.util.LinkedHashSet r3 = r2.d0
            java.util.Iterator r3 = r3.iterator()
            boolean r0 = r3.hasNext()
            if (r0 != 0) goto L45
            r3 = 0
            r2.o0 = r3
            return
        L45:
            java.lang.ClassCastException r2 = defpackage.i61.j(r3)
            throw r2
        L4a:
            return
    }

    private void setDisplayedWidthIncrease(float r6) {
            r5 = this;
            float r0 = r5.B0
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 == 0) goto L70
            r5.B0 = r6
            r5.j()
            r5.invalidate()
            android.view.ViewParent r6 = r5.getParent()
            boolean r6 = r6 instanceof defpackage.z14
            if (r6 == 0) goto L70
            android.view.ViewParent r6 = r5.getParent()
            z14 r6 = (defpackage.z14) r6
            float r0 = r5.B0
            int r0 = (int) r0
            int r5 = r6.indexOfChild(r5)
            if (r5 >= 0) goto L26
            goto L70
        L26:
            int r1 = r5 + (-1)
        L28:
            r2 = 0
            if (r1 < 0) goto L3b
            boolean r3 = r6.c(r1)
            if (r3 == 0) goto L38
            android.view.View r1 = r6.getChildAt(r1)
            com.google.android.material.button.MaterialButton r1 = (com.google.android.material.button.MaterialButton) r1
            goto L3c
        L38:
            int r1 = r1 + (-1)
            goto L28
        L3b:
            r1 = r2
        L3c:
            int r3 = r6.getChildCount()
        L40:
            int r5 = r5 + 1
            if (r5 >= r3) goto L51
            boolean r4 = r6.c(r5)
            if (r4 == 0) goto L40
            android.view.View r5 = r6.getChildAt(r5)
            r2 = r5
            com.google.android.material.button.MaterialButton r2 = (com.google.android.material.button.MaterialButton) r2
        L51:
            if (r1 != 0) goto L56
            if (r2 != 0) goto L56
            goto L70
        L56:
            if (r1 != 0) goto L5b
            r2.setDisplayedWidthDecrease(r0)
        L5b:
            if (r2 != 0) goto L60
            r1.setDisplayedWidthDecrease(r0)
        L60:
            if (r1 == 0) goto L70
            if (r2 == 0) goto L70
            int r5 = r0 / 2
            r1.setDisplayedWidthDecrease(r5)
            int r0 = r0 + 1
            int r0 = r0 / 2
            r2.setDisplayedWidthDecrease(r0)
        L70:
            return
    }

    public final defpackage.go6 d() {
            r5 = this;
            android.content.Context r5 = r5.getContext()
            r0 = 2130969561(0x7f0403d9, float:1.7547807E38)
            android.util.TypedValue r0 = defpackage.qo2.M(r5, r0)
            r1 = 0
            int[] r2 = defpackage.a75.s
            if (r0 != 0) goto L19
            r0 = 0
            r3 = 2132017498(0x7f14015a, float:1.9673276E38)
            android.content.res.TypedArray r5 = r5.obtainStyledAttributes(r0, r2, r1, r3)
            goto L1f
        L19:
            int r0 = r0.resourceId
            android.content.res.TypedArray r5 = r5.obtainStyledAttributes(r0, r2)
        L1f:
            go6 r0 = new go6
            r0.<init>()
            r2 = 1
            r3 = 1
            float r3 = r5.getFloat(r3, r2)     // Catch: java.lang.Throwable -> L40
            int r4 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r4 == 0) goto L4a
            float r1 = r5.getFloat(r1, r2)     // Catch: java.lang.Throwable -> L40
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 == 0) goto L42
            r0.b(r3)     // Catch: java.lang.Throwable -> L40
            r0.a(r1)     // Catch: java.lang.Throwable -> L40
            r5.recycle()
            return r0
        L40:
            r0 = move-exception
            goto L52
        L42:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L40
            java.lang.String r1 = "A MaterialSpring style must have a damping value."
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L40
            throw r0     // Catch: java.lang.Throwable -> L40
        L4a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L40
            java.lang.String r1 = "A MaterialSpring style must have stiffness value."
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L40
            throw r0     // Catch: java.lang.Throwable -> L40
        L52:
            r5.recycle()
            throw r0
    }

    public final boolean e() {
            r0 = this;
            a24 r0 = r0.R
            if (r0 == 0) goto La
            boolean r0 = r0.r
            if (r0 != 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    public final void f(boolean r9) {
            r8 = this;
            aq6 r0 = r8.z0
            if (r0 != 0) goto L6
            goto L87
        L6:
            fo6 r0 = r8.D0
            if (r0 != 0) goto L19
            fo6 r0 = new fo6
            w14 r1 = com.google.android.material.button.MaterialButton.G0
            r0.<init>(r8, r1)
            r8.D0 = r0
            go6 r1 = r8.d()
            r0.m = r1
        L19:
            boolean r0 = r8.x0
            if (r0 == 0) goto L87
            int r0 = r8.A0
            aq6 r1 = r8.z0
            int[] r2 = r8.getDrawableState()
            int[][] r3 = r1.c
            r4 = 0
            r5 = r4
        L29:
            int r6 = r1.a
            r7 = -1
            if (r5 >= r6) goto L3a
            r6 = r3[r5]
            boolean r6 = android.util.StateSet.stateSetMatches(r6, r2)
            if (r6 == 0) goto L37
            goto L3b
        L37:
            int r5 = r5 + 1
            goto L29
        L3a:
            r5 = r7
        L3b:
            if (r5 >= 0) goto L54
            int[] r2 = android.util.StateSet.WILD_CARD
            int[][] r3 = r1.c
            r5 = r4
        L42:
            int r6 = r1.a
            if (r5 >= r6) goto L53
            r6 = r3[r5]
            boolean r6 = android.util.StateSet.stateSetMatches(r6, r2)
            if (r6 == 0) goto L50
            r7 = r5
            goto L53
        L50:
            int r5 = r5 + 1
            goto L42
        L53:
            r5 = r7
        L54:
            if (r5 >= 0) goto L59
            s35 r1 = r1.b
            goto L5d
        L59:
            s35[] r1 = r1.d
            r1 = r1[r5]
        L5d:
            java.lang.Object r1 = r1.A
            yp6 r1 = (defpackage.yp6) r1
            int r2 = r8.getWidth()
            float r3 = r1.b
            zp6 r1 = r1.a
            zp6 r5 = defpackage.zp6.PERCENT
            if (r1 != r5) goto L71
            float r1 = (float) r2
            float r3 = r3 * r1
        L6f:
            int r4 = (int) r3
            goto L76
        L71:
            zp6 r2 = defpackage.zp6.PIXELS
            if (r1 != r2) goto L76
            goto L6f
        L76:
            int r0 = java.lang.Math.min(r0, r4)
            fo6 r1 = r8.D0
            float r0 = (float) r0
            r1.a(r0)
            if (r9 == 0) goto L87
            fo6 r8 = r8.D0
            r8.d()
        L87:
            return
    }

    public final void g() {
            r3 = this;
            int r0 = r3.p0
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L27
            r1 = 2
            if (r0 != r1) goto La
            goto L27
        La:
            r1 = 3
            if (r0 == r1) goto L21
            r1 = 4
            if (r0 != r1) goto L11
            goto L21
        L11:
            r1 = 16
            if (r0 == r1) goto L1b
            r1 = 32
            if (r0 != r1) goto L1a
            goto L1b
        L1a:
            return
        L1b:
            android.graphics.drawable.Drawable r0 = r3.h0
            r3.setCompoundDrawablesRelative(r2, r0, r2, r2)
            return
        L21:
            android.graphics.drawable.Drawable r0 = r3.h0
            r3.setCompoundDrawablesRelative(r2, r2, r0, r2)
            return
        L27:
            android.graphics.drawable.Drawable r0 = r3.h0
            r3.setCompoundDrawablesRelative(r0, r2, r2, r2)
            return
    }

    public java.lang.String getA11yClassName() {
            r1 = this;
            java.lang.String r0 = r1.i0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lb
            java.lang.String r1 = r1.i0
            return r1
        Lb:
            a24 r1 = r1.R
            if (r1 == 0) goto L16
            boolean r1 = r1.t
            if (r1 == 0) goto L16
            java.lang.Class<android.widget.CompoundButton> r1 = android.widget.CompoundButton.class
            goto L18
        L16:
            java.lang.Class<android.widget.Button> r1 = android.widget.Button.class
        L18:
            java.lang.String r1 = r1.getName()
            return r1
    }

    public int getAllowedWidthDecrease() {
            r0 = this;
            int r0 = r0.y0
            return r0
    }

    @Override // android.view.View
    public android.content.res.ColorStateList getBackgroundTintList() {
            r0 = this;
            android.content.res.ColorStateList r0 = r0.getSupportBackgroundTintList()
            return r0
    }

    @Override // android.view.View
    public android.graphics.PorterDuff.Mode getBackgroundTintMode() {
            r0 = this;
            android.graphics.PorterDuff$Mode r0 = r0.getSupportBackgroundTintMode()
            return r0
    }

    public int getCornerRadius() {
            r1 = this;
            boolean r0 = r1.e()
            if (r0 == 0) goto Lb
            a24 r1 = r1.R
            int r1 = r1.j
            return r1
        Lb:
            r1 = 0
            return r1
    }

    public defpackage.go6 getCornerSpringForce() {
            r0 = this;
            a24 r0 = r0.R
            go6 r0 = r0.d
            return r0
    }

    public android.graphics.drawable.Drawable getIcon() {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.h0
            return r0
    }

    public int getIconGravity() {
            r0 = this;
            int r0 = r0.p0
            return r0
    }

    public int getIconPadding() {
            r0 = this;
            int r0 = r0.m0
            return r0
    }

    public int getIconSize() {
            r0 = this;
            int r0 = r0.j0
            return r0
    }

    public android.content.res.ColorStateList getIconTint() {
            r0 = this;
            android.content.res.ColorStateList r0 = r0.g0
            return r0
    }

    public android.graphics.PorterDuff.Mode getIconTintMode() {
            r0 = this;
            android.graphics.PorterDuff$Mode r0 = r0.f0
            return r0
    }

    public int getInsetBottom() {
            r0 = this;
            a24 r0 = r0.R
            int r0 = r0.i
            return r0
    }

    public int getInsetTop() {
            r0 = this;
            a24 r0 = r0.R
            int r0 = r0.h
            return r0
    }

    public android.content.res.ColorStateList getRippleColor() {
            r1 = this;
            boolean r0 = r1.e()
            if (r0 == 0) goto Lb
            a24 r1 = r1.R
            android.content.res.ColorStateList r1 = r1.o
            return r1
        Lb:
            r1 = 0
            return r1
    }

    public defpackage.me6 getShapeAppearanceModel() {
            r1 = this;
            boolean r0 = r1.e()
            if (r0 == 0) goto Lb
            a24 r1 = r1.R
            me6 r1 = r1.b
            return r1
        Lb:
            java.lang.String r1 = "Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background."
            defpackage.i.m(r1)
            r1 = 0
            return r1
    }

    public defpackage.xp6 getStateListShapeAppearanceModel() {
            r1 = this;
            boolean r0 = r1.e()
            if (r0 == 0) goto Lb
            a24 r1 = r1.R
            xp6 r1 = r1.c
            return r1
        Lb:
            java.lang.String r1 = "Attempted to get StateListShapeAppearanceModel from a MaterialButton which has an overwritten background."
            defpackage.i.m(r1)
            r1 = 0
            return r1
    }

    public android.content.res.ColorStateList getStrokeColor() {
            r1 = this;
            boolean r0 = r1.e()
            if (r0 == 0) goto Lb
            a24 r1 = r1.R
            android.content.res.ColorStateList r1 = r1.n
            return r1
        Lb:
            r1 = 0
            return r1
    }

    public int getStrokeWidth() {
            r1 = this;
            boolean r0 = r1.e()
            if (r0 == 0) goto Lb
            a24 r1 = r1.R
            int r1 = r1.k
            return r1
        Lb:
            r1 = 0
            return r1
    }

    @Override // defpackage.lq
    public android.content.res.ColorStateList getSupportBackgroundTintList() {
            r1 = this;
            boolean r0 = r1.e()
            if (r0 == 0) goto Lb
            a24 r1 = r1.R
            android.content.res.ColorStateList r1 = r1.m
            return r1
        Lb:
            android.content.res.ColorStateList r1 = super.getSupportBackgroundTintList()
            return r1
    }

    @Override // defpackage.lq
    public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode() {
            r1 = this;
            boolean r0 = r1.e()
            if (r0 == 0) goto Lb
            a24 r1 = r1.R
            android.graphics.PorterDuff$Mode r1 = r1.l
            return r1
        Lb:
            android.graphics.PorterDuff$Mode r1 = super.getSupportBackgroundTintMode()
            return r1
    }

    public final void h(boolean r7) {
            r6 = this;
            android.graphics.drawable.Drawable r0 = r6.h0
            r1 = 1
            if (r0 == 0) goto L3f
            android.graphics.drawable.Drawable r0 = r0.mutate()
            r6.h0 = r0
            android.content.res.ColorStateList r2 = r6.g0
            r0.setTintList(r2)
            android.graphics.PorterDuff$Mode r0 = r6.f0
            if (r0 == 0) goto L19
            android.graphics.drawable.Drawable r2 = r6.h0
            r2.setTintMode(r0)
        L19:
            int r0 = r6.j0
            if (r0 == 0) goto L1e
            goto L24
        L1e:
            android.graphics.drawable.Drawable r0 = r6.h0
            int r0 = r0.getIntrinsicWidth()
        L24:
            int r2 = r6.j0
            if (r2 == 0) goto L29
            goto L2f
        L29:
            android.graphics.drawable.Drawable r2 = r6.h0
            int r2 = r2.getIntrinsicHeight()
        L2f:
            android.graphics.drawable.Drawable r3 = r6.h0
            int r4 = r6.k0
            int r5 = r6.l0
            int r0 = r0 + r4
            int r2 = r2 + r5
            r3.setBounds(r4, r5, r0, r2)
            android.graphics.drawable.Drawable r0 = r6.h0
            r0.setVisible(r1, r7)
        L3f:
            if (r7 == 0) goto L45
            r6.g()
            return
        L45:
            android.graphics.drawable.Drawable[] r7 = r6.getCompoundDrawablesRelative()
            r0 = 0
            r0 = r7[r0]
            r2 = r7[r1]
            r3 = 2
            r7 = r7[r3]
            int r4 = r6.p0
            if (r4 == r1) goto L57
            if (r4 != r3) goto L5b
        L57:
            android.graphics.drawable.Drawable r1 = r6.h0
            if (r0 != r1) goto L75
        L5b:
            r0 = 3
            if (r4 == r0) goto L61
            r0 = 4
            if (r4 != r0) goto L65
        L61:
            android.graphics.drawable.Drawable r0 = r6.h0
            if (r7 != r0) goto L75
        L65:
            r7 = 16
            if (r4 == r7) goto L6f
            r7 = 32
            if (r4 != r7) goto L6e
            goto L6f
        L6e:
            return
        L6f:
            android.graphics.drawable.Drawable r7 = r6.h0
            if (r2 == r7) goto L74
            goto L75
        L74:
            return
        L75:
            r6.g()
            return
    }

    public final void i(int r7, int r8) {
            r6 = this;
            android.graphics.drawable.Drawable r0 = r6.h0
            if (r0 == 0) goto Lba
            android.text.Layout r0 = r6.getLayout()
            if (r0 != 0) goto Lc
            goto Lba
        Lc:
            int r0 = r6.p0
            r1 = 3
            r2 = 4
            r3 = 1
            r4 = 2
            r5 = 0
            if (r0 == r3) goto L5d
            if (r0 != r4) goto L18
            goto L5d
        L18:
            if (r0 == r1) goto L5d
            if (r0 != r2) goto L1d
            goto L5d
        L1d:
            r7 = 16
            if (r0 == r7) goto L27
            r1 = 32
            if (r0 != r1) goto L26
            goto L27
        L26:
            return
        L27:
            r6.k0 = r5
            if (r0 != r7) goto L31
            r6.l0 = r5
            r6.h(r5)
            return
        L31:
            int r7 = r6.j0
            if (r7 != 0) goto L3b
            android.graphics.drawable.Drawable r7 = r6.h0
            int r7 = r7.getIntrinsicHeight()
        L3b:
            int r0 = r6.getTextHeight()
            int r8 = r8 - r0
            int r0 = r6.getPaddingTop()
            int r8 = r8 - r0
            int r8 = r8 - r7
            int r7 = r6.m0
            int r8 = r8 - r7
            int r7 = r6.getPaddingBottom()
            int r8 = r8 - r7
            int r8 = r8 / r4
            int r7 = java.lang.Math.max(r5, r8)
            int r8 = r6.l0
            if (r8 == r7) goto Lba
            r6.l0 = r7
            r6.h(r5)
            return
        L5d:
            r6.l0 = r5
            android.text.Layout$Alignment r8 = r6.getActualTextAlignment()
            int r0 = r6.p0
            if (r0 == r3) goto Lb5
            if (r0 == r1) goto Lb5
            if (r0 != r4) goto L6f
            android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_NORMAL
            if (r8 == r1) goto Lb5
        L6f:
            if (r0 != r2) goto L76
            android.text.Layout$Alignment r0 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            if (r8 != r0) goto L76
            goto Lb5
        L76:
            int r0 = r6.j0
            if (r0 != 0) goto L80
            android.graphics.drawable.Drawable r0 = r6.h0
            int r0 = r0.getIntrinsicWidth()
        L80:
            int r1 = r6.getTextLayoutWidth()
            int r7 = r7 - r1
            int r1 = r6.getPaddingEnd()
            int r7 = r7 - r1
            int r7 = r7 - r0
            int r0 = r6.m0
            int r7 = r7 - r0
            int r0 = r6.getPaddingStart()
            int r7 = r7 - r0
            android.text.Layout$Alignment r0 = android.text.Layout.Alignment.ALIGN_CENTER
            if (r8 != r0) goto L99
            int r7 = r7 / 2
        L99:
            int r8 = r6.getLayoutDirection()
            if (r8 != r3) goto La1
            r8 = r3
            goto La2
        La1:
            r8 = r5
        La2:
            int r0 = r6.p0
            if (r0 != r2) goto La7
            goto La8
        La7:
            r3 = r5
        La8:
            if (r8 == r3) goto Lab
            int r7 = -r7
        Lab:
            int r8 = r6.k0
            if (r8 == r7) goto Lba
            r6.k0 = r7
            r6.h(r5)
            return
        Lb5:
            r6.k0 = r5
            r6.h(r5)
        Lba:
            return
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
            r0 = this;
            boolean r0 = r0.n0
            return r0
    }

    public final void j() {
            r5 = this;
            float r0 = r5.B0
            float r1 = r5.C0
            float r0 = r0 - r1
            int r0 = (int) r0
            int r1 = r0 / 2
            int r2 = r5.w0
            int r1 = r1 + r2
            android.view.ViewGroup$LayoutParams r2 = r5.getLayoutParams()
            float r3 = r5.r0
            float r4 = (float) r0
            float r3 = r3 + r4
            int r3 = (int) r3
            r2.width = r3
            int r2 = r5.s0
            int r2 = r2 + r1
            int r3 = r5.getPaddingTop()
            int r4 = r5.t0
            int r4 = r4 + r0
            int r4 = r4 - r1
            int r0 = r5.getPaddingBottom()
            r5.setPaddingRelative(r2, r3, r4, r0)
            return
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
            r2 = this;
            super.onAttachedToWindow()
            boolean r0 = r2.e()
            if (r0 == 0) goto L13
            a24 r0 = r2.R
            r1 = 0
            p24 r0 = r0.a(r1)
            defpackage.jx2.P(r2, r0)
        L13:
            return
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int r2) {
            r1 = this;
            int r2 = r2 + 2
            int[] r2 = super.onCreateDrawableState(r2)
            a24 r0 = r1.R
            if (r0 == 0) goto L13
            boolean r0 = r0.t
            if (r0 == 0) goto L13
            int[] r0 = com.google.android.material.button.MaterialButton.E0
            android.view.View.mergeDrawableStates(r2, r0)
        L13:
            boolean r1 = r1.n0
            if (r1 == 0) goto L1c
            int[] r1 = com.google.android.material.button.MaterialButton.F0
            android.view.View.mergeDrawableStates(r2, r1)
        L1c:
            return r2
    }

    @Override // defpackage.lq, android.view.View
    public final void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent r2) {
            r1 = this;
            super.onInitializeAccessibilityEvent(r2)
            java.lang.String r0 = r1.getA11yClassName()
            r2.setClassName(r0)
            boolean r1 = r1.n0
            r2.setChecked(r1)
            return
    }

    @Override // defpackage.lq, android.view.View
    public final void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r2) {
            r1 = this;
            super.onInitializeAccessibilityNodeInfo(r2)
            java.lang.String r0 = r1.getA11yClassName()
            r2.setClassName(r0)
            a24 r0 = r1.R
            if (r0 == 0) goto L14
            boolean r0 = r0.t
            if (r0 == 0) goto L14
            r0 = 1
            goto L15
        L14:
            r0 = 0
        L15:
            r2.setCheckable(r0)
            boolean r0 = r1.n0
            r2.setChecked(r0)
            boolean r1 = r1.isClickable()
            r2.setClickable(r1)
            return
    }

    @Override // defpackage.lq, android.widget.TextView, android.view.View
    public final void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            super.onLayout(r1, r2, r3, r4, r5)
            int r1 = r0.getMeasuredWidth()
            int r2 = r0.getMeasuredHeight()
            r0.i(r1, r2)
            android.content.res.Resources r1 = r0.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            int r1 = r1.orientation
            int r2 = r0.q0
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r2 == r1) goto L22
            r0.q0 = r1
            r0.r0 = r3
        L22:
            float r1 = r0.r0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L5e
            int r1 = r0.getMeasuredWidth()
            float r1 = (float) r1
            r0.r0 = r1
            android.widget.LinearLayout$LayoutParams r1 = r0.u0
            if (r1 != 0) goto L5e
            android.view.ViewParent r1 = r0.getParent()
            boolean r1 = r1 instanceof defpackage.z14
            if (r1 == 0) goto L5e
            android.view.ViewParent r1 = r0.getParent()
            z14 r1 = (defpackage.z14) r1
            aq6 r1 = r1.getButtonSizeChange()
            if (r1 == 0) goto L5e
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r1 = (android.widget.LinearLayout.LayoutParams) r1
            r0.u0 = r1
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            android.widget.LinearLayout$LayoutParams r2 = r0.u0
            r1.<init>(r2)
            float r2 = r0.r0
            int r2 = (int) r2
            r1.width = r2
            r0.setLayoutParams(r1)
        L5e:
            int r1 = r0.y0
            r2 = 0
            r3 = -1
            if (r1 != r3) goto L85
            android.graphics.drawable.Drawable r1 = r0.h0
            if (r1 != 0) goto L6a
            r1 = r2
            goto L79
        L6a:
            int r1 = r0.getIconPadding()
            int r4 = r0.j0
            if (r4 != 0) goto L78
            android.graphics.drawable.Drawable r4 = r0.h0
            int r4 = r4.getIntrinsicWidth()
        L78:
            int r1 = r1 + r4
        L79:
            int r4 = r0.getMeasuredWidth()
            int r5 = r0.getTextLayoutWidth()
            int r4 = r4 - r5
            int r4 = r4 - r1
            r0.y0 = r4
        L85:
            int r1 = r0.s0
            if (r1 != r3) goto L8f
            int r1 = r0.getPaddingStart()
            r0.s0 = r1
        L8f:
            int r1 = r0.t0
            if (r1 != r3) goto L99
            int r1 = r0.getPaddingEnd()
            r0.t0 = r1
        L99:
            android.view.ViewParent r1 = r0.getParent()
            boolean r1 = r1 instanceof defpackage.z14
            if (r1 == 0) goto Lae
            android.view.ViewParent r1 = r0.getParent()
            z14 r1 = (defpackage.z14) r1
            int r1 = r1.getOrientation()
            if (r1 != 0) goto Lae
            r2 = 1
        Lae:
            r0.x0 = r2
            return
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(android.os.Parcelable r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.y14
            if (r0 != 0) goto L8
            super.onRestoreInstanceState(r2)
            return
        L8:
            y14 r2 = (defpackage.y14) r2
            android.os.Parcelable r0 = r2.A
            super.onRestoreInstanceState(r0)
            boolean r2 = r2.L
            r1.setChecked(r2)
            return
    }

    @Override // android.widget.TextView, android.view.View
    public final android.os.Parcelable onSaveInstanceState() {
            r2 = this;
            android.os.Parcelable r0 = super.onSaveInstanceState()
            y14 r1 = new y14
            r1.<init>(r0)
            boolean r2 = r2.n0
            r1.L = r2
            return r1
    }

    @Override // defpackage.lq, android.widget.TextView
    public final void onTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
            r0 = this;
            super.onTextChanged(r1, r2, r3, r4)
            int r1 = r0.getMeasuredWidth()
            int r2 = r0.getMeasuredHeight()
            r0.i(r1, r2)
            return
    }

    @Override // android.view.View
    public final boolean performClick() {
            r1 = this;
            boolean r0 = r1.isEnabled()
            if (r0 == 0) goto Lf
            a24 r0 = r1.R
            boolean r0 = r0.u
            if (r0 == 0) goto Lf
            r1.toggle()
        Lf:
            boolean r1 = super.performClick()
            return r1
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
            r2 = this;
            super.refreshDrawableState()
            android.graphics.drawable.Drawable r0 = r2.h0
            if (r0 == 0) goto L16
            int[] r0 = r2.getDrawableState()
            android.graphics.drawable.Drawable r1 = r2.h0
            boolean r0 = r1.setState(r0)
            if (r0 == 0) goto L16
            r2.invalidate()
        L16:
            return
    }

    public void setA11yClassName(java.lang.String r1) {
            r0 = this;
            r0.i0 = r1
            return
    }

    @Override // android.view.View
    public void setBackground(android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.setBackgroundDrawable(r1)
            return
    }

    @Override // android.view.View
    public void setBackgroundColor(int r3) {
            r2 = this;
            boolean r0 = r2.e()
            if (r0 == 0) goto L17
            a24 r2 = r2.R
            r0 = 0
            p24 r1 = r2.a(r0)
            if (r1 == 0) goto L16
            p24 r2 = r2.a(r0)
            r2.setTint(r3)
        L16:
            return
        L17:
            super.setBackgroundColor(r3)
            return
    }

    @Override // defpackage.lq, android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable r4) {
            r3 = this;
            boolean r0 = r3.e()
            if (r0 == 0) goto L34
            android.graphics.drawable.Drawable r0 = r3.getBackground()
            if (r4 == r0) goto L28
            java.lang.String r0 = "MaterialButton"
            java.lang.String r1 = "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled"
            android.util.Log.w(r0, r1)
            r0 = 1
            a24 r1 = r3.R
            r1.r = r0
            com.google.android.material.button.MaterialButton r0 = r1.a
            android.content.res.ColorStateList r2 = r1.m
            r0.setSupportBackgroundTintList(r2)
            android.graphics.PorterDuff$Mode r1 = r1.l
            r0.setSupportBackgroundTintMode(r1)
            super.setBackgroundDrawable(r4)
            return
        L28:
            android.graphics.drawable.Drawable r3 = r3.getBackground()
            int[] r4 = r4.getState()
            r3.setState(r4)
            return
        L34:
            super.setBackgroundDrawable(r4)
            return
    }

    @Override // defpackage.lq, android.view.View
    public void setBackgroundResource(int r2) {
            r1 = this;
            if (r2 == 0) goto Lb
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = defpackage.hf.S(r0, r2)
            goto Lc
        Lb:
            r2 = 0
        Lc:
            r1.setBackgroundDrawable(r2)
            return
    }

    @Override // android.view.View
    public void setBackgroundTintList(android.content.res.ColorStateList r1) {
            r0 = this;
            r0.setSupportBackgroundTintList(r1)
            return
    }

    @Override // android.view.View
    public void setBackgroundTintMode(android.graphics.PorterDuff.Mode r1) {
            r0 = this;
            r0.setSupportBackgroundTintMode(r1)
            return
    }

    public void setCheckable(boolean r2) {
            r1 = this;
            boolean r0 = r1.e()
            if (r0 == 0) goto La
            a24 r1 = r1.R
            r1.t = r2
        La:
            return
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean r1) {
            r0 = this;
            r0.setCheckedInternal(r1)
            return
    }

    public void setCornerRadius(int r3) {
            r2 = this;
            boolean r0 = r2.e()
            if (r0 == 0) goto L44
            a24 r2 = r2.R
            boolean r0 = r2.s
            if (r0 == 0) goto L10
            int r0 = r2.j
            if (r0 == r3) goto L44
        L10:
            r2.j = r3
            r0 = 1
            r2.s = r0
            me6 r0 = r2.b
            float r3 = (float) r3
            le6 r0 = r0.f()
            t r1 = new t
            r1.<init>(r3)
            r0.e = r1
            t r1 = new t
            r1.<init>(r3)
            r0.f = r1
            t r1 = new t
            r1.<init>(r3)
            r0.g = r1
            t r1 = new t
            r1.<init>(r3)
            r0.h = r1
            me6 r3 = r0.a()
            r2.b = r3
            r3 = 0
            r2.c = r3
            r2.d()
        L44:
            return
    }

    public void setCornerRadiusResource(int r2) {
            r1 = this;
            boolean r0 = r1.e()
            if (r0 == 0) goto L11
            android.content.res.Resources r0 = r1.getResources()
            int r2 = r0.getDimensionPixelSize(r2)
            r1.setCornerRadius(r2)
        L11:
            return
    }

    public void setCornerSpringForce(defpackage.go6 r1) {
            r0 = this;
            a24 r0 = r0.R
            r0.d = r1
            xp6 r1 = r0.c
            if (r1 == 0) goto Lb
            r0.d()
        Lb:
            return
    }

    public void setDisplayedWidthDecrease(int r2) {
            r1 = this;
            int r0 = r1.y0
            int r2 = java.lang.Math.min(r2, r0)
            float r2 = (float) r2
            r1.C0 = r2
            r1.j()
            r1.invalidate()
            return
    }

    @Override // android.view.View
    public void setElevation(float r2) {
            r1 = this;
            super.setElevation(r2)
            boolean r0 = r1.e()
            if (r0 == 0) goto L13
            a24 r1 = r1.R
            r0 = 0
            p24 r1 = r1.a(r0)
            r1.m(r2)
        L13:
            return
    }

    public void setIcon(android.graphics.drawable.Drawable r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.h0
            if (r0 == r2) goto L15
            r1.h0 = r2
            r2 = 1
            r1.h(r2)
            int r2 = r1.getMeasuredWidth()
            int r0 = r1.getMeasuredHeight()
            r1.i(r2, r0)
        L15:
            return
    }

    public void setIconGravity(int r2) {
            r1 = this;
            int r0 = r1.p0
            if (r0 == r2) goto L11
            r1.p0 = r2
            int r2 = r1.getMeasuredWidth()
            int r0 = r1.getMeasuredHeight()
            r1.i(r2, r0)
        L11:
            return
    }

    public void setIconPadding(int r2) {
            r1 = this;
            int r0 = r1.m0
            if (r0 == r2) goto L9
            r1.m0 = r2
            r1.setCompoundDrawablePadding(r2)
        L9:
            return
    }

    public void setIconResource(int r2) {
            r1 = this;
            if (r2 == 0) goto Lb
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = defpackage.hf.S(r0, r2)
            goto Lc
        Lb:
            r2 = 0
        Lc:
            r1.setIcon(r2)
            return
    }

    public void setIconSize(int r2) {
            r1 = this;
            if (r2 < 0) goto Ld
            int r0 = r1.j0
            if (r0 == r2) goto Lc
            r1.j0 = r2
            r2 = 1
            r1.h(r2)
        Lc:
            return
        Ld:
            java.lang.String r1 = "iconSize cannot be less than 0"
            defpackage.i.h(r1)
            return
    }

    public void setIconTint(android.content.res.ColorStateList r2) {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.g0
            if (r0 == r2) goto La
            r1.g0 = r2
            r2 = 0
            r1.h(r2)
        La:
            return
    }

    public void setIconTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            android.graphics.PorterDuff$Mode r0 = r1.f0
            if (r0 == r2) goto La
            r1.f0 = r2
            r2 = 0
            r1.h(r2)
        La:
            return
    }

    public void setIconTintResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.content.res.ColorStateList r2 = defpackage.ge7.A(r0, r2)
            r1.setIconTint(r2)
            return
    }

    public void setInsetBottom(int r2) {
            r1 = this;
            a24 r1 = r1.R
            int r0 = r1.h
            r1.b(r0, r2)
            return
    }

    public void setInsetTop(int r2) {
            r1 = this;
            a24 r1 = r1.R
            int r0 = r1.i
            r1.b(r2, r0)
            return
    }

    public void setInternalBackground(android.graphics.drawable.Drawable r1) {
            r0 = this;
            super.setBackgroundDrawable(r1)
            return
    }

    public void setOnPressedChangeListenerInternal(defpackage.x14 r1) {
            r0 = this;
            r0.e0 = r1
            return
    }

    public void setOpticalCenterEnabled(boolean r4) {
            r3 = this;
            boolean r0 = r3.v0
            if (r0 == r4) goto L31
            r3.v0 = r4
            r0 = 0
            a24 r1 = r3.R
            if (r4 == 0) goto L1d
            h61 r4 = new h61
            r2 = 14
            r4.<init>(r3, r2)
            r1.e = r4
            p24 r0 = r1.a(r0)
            if (r0 == 0) goto L28
            r0.z0 = r4
            goto L28
        L1d:
            r4 = 0
            r1.e = r4
            p24 r0 = r1.a(r0)
            if (r0 == 0) goto L28
            r0.z0 = r4
        L28:
            rk3 r4 = new rk3
            r0 = 3
            r4.<init>(r3, r0)
            r3.post(r4)
        L31:
            return
    }

    @Override // android.view.View
    public void setPressed(boolean r2) {
            r1 = this;
            x14 r0 = r1.e0
            if (r0 == 0) goto Ld
            s63 r0 = (defpackage.s63) r0
            java.lang.Object r0 = r0.B
            com.google.android.material.button.MaterialButtonToggleGroup r0 = (com.google.android.material.button.MaterialButtonToggleGroup) r0
            r0.invalidate()
        Ld:
            super.setPressed(r2)
            r2 = 0
            r1.f(r2)
            return
    }

    public void setRippleColor(android.content.res.ColorStateList r3) {
            r2 = this;
            boolean r0 = r2.e()
            if (r0 == 0) goto L25
            a24 r2 = r2.R
            com.google.android.material.button.MaterialButton r0 = r2.a
            android.content.res.ColorStateList r1 = r2.o
            if (r1 == r3) goto L25
            r2.o = r3
            android.graphics.drawable.Drawable r2 = r0.getBackground()
            boolean r2 = r2 instanceof android.graphics.drawable.RippleDrawable
            if (r2 == 0) goto L25
            android.graphics.drawable.Drawable r2 = r0.getBackground()
            android.graphics.drawable.RippleDrawable r2 = (android.graphics.drawable.RippleDrawable) r2
            android.content.res.ColorStateList r3 = defpackage.lq5.a(r3)
            r2.setColor(r3)
        L25:
            return
    }

    public void setRippleColorResource(int r2) {
            r1 = this;
            boolean r0 = r1.e()
            if (r0 == 0) goto L11
            android.content.Context r0 = r1.getContext()
            android.content.res.ColorStateList r2 = defpackage.ge7.A(r0, r2)
            r1.setRippleColor(r2)
        L11:
            return
    }

    @Override // defpackage.xe6
    public void setShapeAppearanceModel(defpackage.me6 r2) {
            r1 = this;
            boolean r0 = r1.e()
            if (r0 == 0) goto L11
            a24 r1 = r1.R
            r1.b = r2
            r2 = 0
            r1.c = r2
            r1.d()
            return
        L11:
            java.lang.String r1 = "Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background."
            defpackage.i.m(r1)
            return
    }

    public void setShouldDrawSurfaceColorStroke(boolean r2) {
            r1 = this;
            boolean r0 = r1.e()
            if (r0 == 0) goto Ld
            a24 r1 = r1.R
            r1.q = r2
            r1.e()
        Ld:
            return
    }

    public void setSizeChange(defpackage.aq6 r2) {
            r1 = this;
            aq6 r0 = r1.z0
            if (r0 == r2) goto La
            r1.z0 = r2
            r2 = 1
            r1.f(r2)
        La:
            return
    }

    public void setStateListShapeAppearanceModel(defpackage.xp6 r3) {
            r2 = this;
            boolean r0 = r2.e()
            if (r0 == 0) goto L25
            a24 r0 = r2.R
            go6 r1 = r0.d
            if (r1 != 0) goto L1f
            boolean r1 = r3.d()
            if (r1 == 0) goto L1f
            go6 r2 = r2.d()
            r0.d = r2
            xp6 r2 = r0.c
            if (r2 == 0) goto L1f
            r0.d()
        L1f:
            r0.c = r3
            r0.d()
            return
        L25:
            java.lang.String r2 = "Attempted to set StateListShapeAppearanceModel on a MaterialButton which has an overwritten background."
            defpackage.i.m(r2)
            return
    }

    public void setStrokeColor(android.content.res.ColorStateList r2) {
            r1 = this;
            boolean r0 = r1.e()
            if (r0 == 0) goto L11
            a24 r1 = r1.R
            android.content.res.ColorStateList r0 = r1.n
            if (r0 == r2) goto L11
            r1.n = r2
            r1.e()
        L11:
            return
    }

    public void setStrokeColorResource(int r2) {
            r1 = this;
            boolean r0 = r1.e()
            if (r0 == 0) goto L11
            android.content.Context r0 = r1.getContext()
            android.content.res.ColorStateList r2 = defpackage.ge7.A(r0, r2)
            r1.setStrokeColor(r2)
        L11:
            return
    }

    public void setStrokeWidth(int r2) {
            r1 = this;
            boolean r0 = r1.e()
            if (r0 == 0) goto L11
            a24 r1 = r1.R
            int r0 = r1.k
            if (r0 == r2) goto L11
            r1.k = r2
            r1.e()
        L11:
            return
    }

    public void setStrokeWidthResource(int r2) {
            r1 = this;
            boolean r0 = r1.e()
            if (r0 == 0) goto L11
            android.content.res.Resources r0 = r1.getResources()
            int r2 = r0.getDimensionPixelSize(r2)
            r1.setStrokeWidth(r2)
        L11:
            return
    }

    @Override // defpackage.lq
    public void setSupportBackgroundTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            boolean r0 = r1.e()
            if (r0 == 0) goto L1f
            a24 r1 = r1.R
            android.content.res.ColorStateList r0 = r1.m
            if (r0 == r2) goto L1e
            r1.m = r2
            r2 = 0
            p24 r0 = r1.a(r2)
            if (r0 == 0) goto L1e
            p24 r2 = r1.a(r2)
            android.content.res.ColorStateList r1 = r1.m
            r2.setTintList(r1)
        L1e:
            return
        L1f:
            super.setSupportBackgroundTintList(r2)
            return
    }

    @Override // defpackage.lq
    public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            boolean r0 = r1.e()
            if (r0 == 0) goto L23
            a24 r1 = r1.R
            android.graphics.PorterDuff$Mode r0 = r1.l
            if (r0 == r2) goto L22
            r1.l = r2
            r2 = 0
            p24 r0 = r1.a(r2)
            if (r0 == 0) goto L22
            android.graphics.PorterDuff$Mode r0 = r1.l
            if (r0 == 0) goto L22
            p24 r2 = r1.a(r2)
            android.graphics.PorterDuff$Mode r1 = r1.l
            r2.setTintMode(r1)
        L22:
            return
        L23:
            super.setSupportBackgroundTintMode(r2)
            return
    }

    @Override // android.view.View
    public void setTextAlignment(int r2) {
            r1 = this;
            super.setTextAlignment(r2)
            int r2 = r1.getMeasuredWidth()
            int r0 = r1.getMeasuredHeight()
            r1.i(r2, r0)
            return
    }

    public void setToggleCheckedStateOnClick(boolean r1) {
            r0 = this;
            a24 r0 = r0.R
            r0.u = r1
            return
    }

    @Override // android.widget.TextView
    public void setWidth(int r2) {
            r1 = this;
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1.r0 = r0
            super.setWidth(r2)
            return
    }

    public void setWidthChangeMax(int r2) {
            r1 = this;
            int r0 = r1.A0
            if (r0 == r2) goto La
            r1.A0 = r2
            r2 = 1
            r1.f(r2)
        La:
            return
    }

    @Override // android.widget.Checkable
    public final void toggle() {
            r1 = this;
            boolean r0 = r1.n0
            r0 = r0 ^ 1
            r1.setChecked(r0)
            return
    }
}
