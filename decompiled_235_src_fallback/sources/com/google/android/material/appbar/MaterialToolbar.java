package com.google.android.material.appbar;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class MaterialToolbar extends androidx.appcompat.widget.Toolbar {
    public static final android.widget.ImageView.ScaleType[] Y0 = null;
    public java.lang.Integer T0;
    public boolean U0;
    public boolean V0;
    public android.widget.ImageView.ScaleType W0;
    public java.lang.Boolean X0;

    static {
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.MATRIX
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY
            android.widget.ImageView$ScaleType r2 = android.widget.ImageView.ScaleType.FIT_START
            android.widget.ImageView$ScaleType r3 = android.widget.ImageView.ScaleType.FIT_CENTER
            android.widget.ImageView$ScaleType r4 = android.widget.ImageView.ScaleType.FIT_END
            android.widget.ImageView$ScaleType r5 = android.widget.ImageView.ScaleType.CENTER
            android.widget.ImageView$ScaleType r6 = android.widget.ImageView.ScaleType.CENTER_CROP
            android.widget.ImageView$ScaleType r7 = android.widget.ImageView.ScaleType.CENTER_INSIDE
            android.widget.ImageView$ScaleType[] r0 = new android.widget.ImageView.ScaleType[]{r0, r1, r2, r3, r4, r5, r6, r7}
            com.google.android.material.appbar.MaterialToolbar.Y0 = r0
            return
    }

    public MaterialToolbar(android.content.Context r8, android.util.AttributeSet r9) {
            r7 = this;
            r0 = 2132018460(0x7f14051c, float:1.9675227E38)
            r4 = 2130970020(0x7f0405a4, float:1.7548738E38)
            android.content.Context r8 = defpackage.q60.e0(r8, r9, r4, r0)
            r0 = 0
            r7.<init>(r8, r9, r0)
            android.content.Context r1 = r7.getContext()
            r5 = 2132018460(0x7f14051c, float:1.9675227E38)
            int[] r6 = new int[r0]
            int[] r3 = defpackage.a75.v
            r2 = r9
            android.content.res.TypedArray r8 = defpackage.f04.K(r1, r2, r3, r4, r5, r6)
            r9 = 2
            boolean r2 = r8.hasValue(r9)
            r3 = -1
            if (r2 == 0) goto L2d
            int r9 = r8.getColor(r9, r3)
            r7.setNavigationIconTint(r9)
        L2d:
            r9 = 4
            boolean r9 = r8.getBoolean(r9, r0)
            r7.U0 = r9
            r9 = 3
            boolean r9 = r8.getBoolean(r9, r0)
            r7.V0 = r9
            r9 = 1
            int r9 = r8.getInt(r9, r3)
            if (r9 < 0) goto L4b
            android.widget.ImageView$ScaleType[] r2 = com.google.android.material.appbar.MaterialToolbar.Y0
            int r3 = r2.length
            if (r9 >= r3) goto L4b
            r9 = r2[r9]
            r7.W0 = r9
        L4b:
            boolean r9 = r8.hasValue(r0)
            if (r9 == 0) goto L5b
            boolean r9 = r8.getBoolean(r0, r0)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            r7.X0 = r9
        L5b:
            r8.recycle()
            android.graphics.drawable.Drawable r8 = r7.getBackground()
            if (r8 != 0) goto L69
            android.content.res.ColorStateList r8 = android.content.res.ColorStateList.valueOf(r0)
            goto L6d
        L69:
            android.content.res.ColorStateList r8 = defpackage.u24.r(r8)
        L6d:
            if (r8 == 0) goto L84
            p24 r9 = new p24
            r9.<init>()
            r9.n(r8)
            r9.k(r1)
            float r8 = r7.getElevation()
            r9.m(r8)
            r7.setBackground(r9)
        L84:
            return
    }

    public android.widget.ImageView.ScaleType getLogoScaleType() {
            r0 = this;
            android.widget.ImageView$ScaleType r0 = r0.W0
            return r0
    }

    public java.lang.Integer getNavigationIconTint() {
            r0 = this;
            java.lang.Integer r0 = r0.T0
            return r0
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
            r2 = this;
            super.onAttachedToWindow()
            android.graphics.drawable.Drawable r0 = r2.getBackground()
            boolean r1 = r0 instanceof defpackage.p24
            if (r1 == 0) goto L10
            p24 r0 = (defpackage.p24) r0
            defpackage.jx2.P(r2, r0)
        L10:
            return
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r7, int r8, int r9, int r10, int r11) {
            r6 = this;
            super.onLayout(r7, r8, r9, r10, r11)
            tp5 r7 = defpackage.u24.o
            boolean r8 = r6.U0
            r9 = 0
            r10 = 0
            if (r8 != 0) goto L11
            boolean r8 = r6.V0
            if (r8 != 0) goto L11
            goto Laa
        L11:
            java.lang.CharSequence r8 = r6.getTitle()
            java.util.ArrayList r8 = defpackage.u24.s(r6, r8)
            boolean r11 = r8.isEmpty()
            if (r11 == 0) goto L21
            r8 = r10
            goto L27
        L21:
            java.lang.Object r8 = java.util.Collections.min(r8, r7)
            android.widget.TextView r8 = (android.widget.TextView) r8
        L27:
            java.lang.CharSequence r11 = r6.getSubtitle()
            java.util.ArrayList r11 = defpackage.u24.s(r6, r11)
            boolean r0 = r11.isEmpty()
            if (r0 == 0) goto L37
            r7 = r10
            goto L3d
        L37:
            java.lang.Object r7 = java.util.Collections.max(r11, r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
        L3d:
            if (r8 != 0) goto L42
            if (r7 != 0) goto L42
            goto Laa
        L42:
            int r11 = r6.getMeasuredWidth()
            int r0 = r11 / 2
            int r1 = r6.getPaddingLeft()
            int r2 = r6.getPaddingRight()
            int r11 = r11 - r2
            r2 = r9
        L52:
            int r3 = r6.getChildCount()
            if (r2 >= r3) goto L8b
            android.view.View r3 = r6.getChildAt(r2)
            int r4 = r3.getVisibility()
            r5 = 8
            if (r4 == r5) goto L88
            if (r3 == r8) goto L88
            if (r3 == r7) goto L88
            int r4 = r3.getRight()
            if (r4 >= r0) goto L78
            int r4 = r3.getRight()
            if (r4 <= r1) goto L78
            int r1 = r3.getRight()
        L78:
            int r4 = r3.getLeft()
            if (r4 <= r0) goto L88
            int r4 = r3.getLeft()
            if (r4 >= r11) goto L88
            int r11 = r3.getLeft()
        L88:
            int r2 = r2 + 1
            goto L52
        L8b:
            android.util.Pair r0 = new android.util.Pair
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r0.<init>(r1, r11)
            boolean r11 = r6.U0
            if (r11 == 0) goto La1
            if (r8 == 0) goto La1
            r6.y(r8, r0)
        La1:
            boolean r8 = r6.V0
            if (r8 == 0) goto Laa
            if (r7 == 0) goto Laa
            r6.y(r7, r0)
        Laa:
            android.graphics.drawable.Drawable r7 = r6.getLogo()
            if (r7 != 0) goto Lb1
            goto Le0
        Lb1:
            int r8 = r6.getChildCount()
            if (r9 >= r8) goto Le0
            android.view.View r8 = r6.getChildAt(r9)
            boolean r11 = r8 instanceof android.widget.ImageView
            if (r11 == 0) goto Ldd
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            android.graphics.drawable.Drawable r11 = r8.getDrawable()
            if (r11 == 0) goto Ldd
            android.graphics.drawable.Drawable$ConstantState r0 = r11.getConstantState()
            if (r0 == 0) goto Ldd
            android.graphics.drawable.Drawable$ConstantState r11 = r11.getConstantState()
            android.graphics.drawable.Drawable$ConstantState r0 = r7.getConstantState()
            boolean r11 = r11.equals(r0)
            if (r11 == 0) goto Ldd
            r10 = r8
            goto Le0
        Ldd:
            int r9 = r9 + 1
            goto Lb1
        Le0:
            if (r10 == 0) goto Lf4
            java.lang.Boolean r7 = r6.X0
            if (r7 == 0) goto Led
            boolean r7 = r7.booleanValue()
            r10.setAdjustViewBounds(r7)
        Led:
            android.widget.ImageView$ScaleType r6 = r6.W0
            if (r6 == 0) goto Lf4
            r10.setScaleType(r6)
        Lf4:
            return
    }

    @Override // android.view.View
    public void setElevation(float r2) {
            r1 = this;
            super.setElevation(r2)
            android.graphics.drawable.Drawable r1 = r1.getBackground()
            boolean r0 = r1 instanceof defpackage.p24
            if (r0 == 0) goto L10
            p24 r1 = (defpackage.p24) r1
            r1.m(r2)
        L10:
            return
    }

    public void setLogoAdjustViewBounds(boolean r2) {
            r1 = this;
            java.lang.Boolean r0 = r1.X0
            if (r0 == 0) goto Lc
            boolean r0 = r0.booleanValue()
            if (r0 == r2) goto Lb
            goto Lc
        Lb:
            return
        Lc:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r1.X0 = r2
            r1.requestLayout()
            return
    }

    public void setLogoScaleType(android.widget.ImageView.ScaleType r2) {
            r1 = this;
            android.widget.ImageView$ScaleType r0 = r1.W0
            if (r0 == r2) goto L9
            r1.W0 = r2
            r1.requestLayout()
        L9:
            return
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(android.graphics.drawable.Drawable r2) {
            r1 = this;
            if (r2 == 0) goto L13
            java.lang.Integer r0 = r1.T0
            if (r0 == 0) goto L13
            android.graphics.drawable.Drawable r2 = r2.mutate()
            java.lang.Integer r0 = r1.T0
            int r0 = r0.intValue()
            r2.setTint(r0)
        L13:
            super.setNavigationIcon(r2)
            return
    }

    public void setNavigationIconTint(int r1) {
            r0 = this;
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.T0 = r1
            android.graphics.drawable.Drawable r1 = r0.getNavigationIcon()
            if (r1 == 0) goto Lf
            r0.setNavigationIcon(r1)
        Lf:
            return
    }

    public void setSubtitleCentered(boolean r2) {
            r1 = this;
            boolean r0 = r1.V0
            if (r0 == r2) goto L9
            r1.V0 = r2
            r1.requestLayout()
        L9:
            return
    }

    public void setTitleCentered(boolean r2) {
            r1 = this;
            boolean r0 = r1.U0
            if (r0 == r2) goto L9
            r1.U0 = r2
            r1.requestLayout()
        L9:
            return
    }

    public final void y(android.widget.TextView r4, android.util.Pair r5) {
            r3 = this;
            int r3 = r3.getMeasuredWidth()
            int r0 = r4.getMeasuredWidth()
            int r3 = r3 / 2
            int r1 = r0 / 2
            int r3 = r3 - r1
            int r0 = r0 + r3
            java.lang.Object r1 = r5.first
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            int r1 = r1 - r3
            r2 = 0
            int r1 = java.lang.Math.max(r1, r2)
            java.lang.Object r5 = r5.second
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            int r5 = r0 - r5
            int r5 = java.lang.Math.max(r5, r2)
            int r5 = java.lang.Math.max(r1, r5)
            if (r5 <= 0) goto L41
            int r3 = r3 + r5
            int r0 = r0 - r5
            int r5 = r0 - r3
            r1 = 1073741824(0x40000000, float:2.0)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r1)
            int r1 = r4.getMeasuredHeightAndState()
            r4.measure(r5, r1)
        L41:
            int r5 = r4.getTop()
            int r1 = r4.getBottom()
            r4.layout(r3, r5, r0, r1)
            return
    }
}
