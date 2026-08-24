package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: u20  reason: default package */
/* loaded from: classes.dex */
public abstract class u20 extends android.widget.FrameLayout {
    public static final defpackage.t20 h0 = null;
    public final defpackage.me6 A;
    public int B;
    public final float L;
    public final float R;
    public final int d0;
    public final int e0;
    public android.content.res.ColorStateList f0;
    public android.graphics.PorterDuff.Mode g0;

    static {
            t20 r0 = new t20
            r1 = 0
            r0.<init>(r1)
            defpackage.u20.h0 = r0
            return
    }

    public u20(android.content.Context r5, android.util.AttributeSet r6) {
            r4 = this;
            r0 = 0
            android.content.Context r5 = defpackage.q60.e0(r5, r6, r0, r0)
            r4.<init>(r5, r6)
            android.content.Context r5 = r4.getContext()
            int[] r1 = defpackage.a75.A
            android.content.res.TypedArray r1 = r5.obtainStyledAttributes(r6, r1)
            r2 = 6
            boolean r3 = r1.hasValue(r2)
            if (r3 == 0) goto L21
            int r2 = r1.getDimensionPixelSize(r2, r0)
            float r2 = (float) r2
            r4.setElevation(r2)
        L21:
            r2 = 2
            int r2 = r1.getInt(r2, r0)
            r4.B = r2
            r2 = 8
            boolean r2 = r1.hasValue(r2)
            if (r2 != 0) goto L38
            r2 = 9
            boolean r2 = r1.hasValue(r2)
            if (r2 == 0) goto L42
        L38:
            le6 r6 = defpackage.me6.b(r5, r6, r0, r0)
            me6 r6 = r6.a()
            r4.A = r6
        L42:
            r6 = 3
            r2 = 1065353216(0x3f800000, float:1.0)
            float r6 = r1.getFloat(r6, r2)
            r4.L = r6
            r6 = 4
            android.content.res.ColorStateList r5 = defpackage.np2.S(r5, r1, r6)
            r4.setBackgroundTintList(r5)
            r5 = 5
            r6 = -1
            int r5 = r1.getInt(r5, r6)
            android.graphics.PorterDuff$Mode r3 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r5 = defpackage.qo2.E(r5, r3)
            r4.setBackgroundTintMode(r5)
            r5 = 1
            float r2 = r1.getFloat(r5, r2)
            r4.R = r2
            int r2 = r1.getDimensionPixelSize(r0, r6)
            r4.d0 = r2
            r2 = 7
            int r6 = r1.getDimensionPixelSize(r2, r6)
            r4.e0 = r6
            r1.recycle()
            t20 r6 = defpackage.u20.h0
            r4.setOnTouchListener(r6)
            r4.setFocusable(r5)
            android.graphics.drawable.Drawable r5 = r4.getBackground()
            if (r5 != 0) goto Ld6
            float r5 = r4.getBackgroundOverlayColorAlpha()
            r6 = 2130968890(0x7f04013a, float:1.7546446E38)
            int r6 = defpackage.mp2.B(r4, r6)
            r1 = 2130968867(0x7f040123, float:1.75464E38)
            int r1 = defpackage.mp2.B(r4, r1)
            int r5 = defpackage.mp2.Q(r5, r6, r1)
            me6 r6 = r4.A
            if (r6 == 0) goto Lb0
            int r0 = defpackage.v20.a
            p24 r0 = new p24
            r0.<init>(r6)
            android.content.res.ColorStateList r5 = android.content.res.ColorStateList.valueOf(r5)
            r0.n(r5)
            goto Lcc
        Lb0:
            android.content.res.Resources r6 = r4.getResources()
            int r1 = defpackage.v20.a
            r1 = 2131166166(0x7f0703d6, float:1.794657E38)
            float r6 = r6.getDimension(r1)
            android.graphics.drawable.GradientDrawable r1 = new android.graphics.drawable.GradientDrawable
            r1.<init>()
            r1.setShape(r0)
            r1.setCornerRadius(r6)
            r1.setColor(r5)
            r0 = r1
        Lcc:
            android.content.res.ColorStateList r5 = r4.f0
            if (r5 == 0) goto Ld3
            r0.setTintList(r5)
        Ld3:
            r4.setBackground(r0)
        Ld6:
            return
    }

    private void setBaseTransientBottomBar(defpackage.v20 r1) {
            r0 = this;
            return
    }

    public float getActionTextColorAlpha() {
            r0 = this;
            float r0 = r0.R
            return r0
    }

    public int getAnimationMode() {
            r0 = this;
            int r0 = r0.B
            return r0
    }

    public float getBackgroundOverlayColorAlpha() {
            r0 = this;
            float r0 = r0.L
            return r0
    }

    public int getMaxInlineActionWidth() {
            r0 = this;
            int r0 = r0.e0
            return r0
    }

    public int getMaxWidth() {
            r0 = this;
            int r0 = r0.d0
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
            r0 = this;
            super.onAttachedToWindow()
            r0.requestApplyInsets()
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
            r0 = this;
            super.onDetachedFromWindow()
            return
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            super.onLayout(r1, r2, r3, r4, r5)
            return
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int r2, int r3) {
            r1 = this;
            super.onMeasure(r2, r3)
            int r2 = r1.d0
            if (r2 <= 0) goto L16
            int r0 = r1.getMeasuredWidth()
            if (r0 <= r2) goto L16
            r0 = 1073741824(0x40000000, float:2.0)
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            super.onMeasure(r2, r3)
        L16:
            return
    }

    public void setAnimationMode(int r1) {
            r0 = this;
            r0.B = r1
            return
    }

    @Override // android.view.View
    public void setBackground(android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.setBackgroundDrawable(r1)
            return
    }

    @Override // android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            if (r2 == 0) goto L14
            android.content.res.ColorStateList r0 = r1.f0
            if (r0 == 0) goto L14
            android.graphics.drawable.Drawable r2 = r2.mutate()
            android.content.res.ColorStateList r0 = r1.f0
            r2.setTintList(r0)
            android.graphics.PorterDuff$Mode r0 = r1.g0
            r2.setTintMode(r0)
        L14:
            super.setBackgroundDrawable(r2)
            return
    }

    @Override // android.view.View
    public void setBackgroundTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            r1.f0 = r2
            android.graphics.drawable.Drawable r0 = r1.getBackground()
            if (r0 == 0) goto L21
            android.graphics.drawable.Drawable r0 = r1.getBackground()
            android.graphics.drawable.Drawable r0 = r0.mutate()
            r0.setTintList(r2)
            android.graphics.PorterDuff$Mode r2 = r1.g0
            r0.setTintMode(r2)
            android.graphics.drawable.Drawable r2 = r1.getBackground()
            if (r0 == r2) goto L21
            super.setBackgroundDrawable(r0)
        L21:
            return
    }

    @Override // android.view.View
    public void setBackgroundTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            r1.g0 = r2
            android.graphics.drawable.Drawable r0 = r1.getBackground()
            if (r0 == 0) goto L1c
            android.graphics.drawable.Drawable r0 = r1.getBackground()
            android.graphics.drawable.Drawable r0 = r0.mutate()
            r0.setTintMode(r2)
            android.graphics.drawable.Drawable r2 = r1.getBackground()
            if (r0 == r2) goto L1c
            super.setBackgroundDrawable(r0)
        L1c:
            return
    }

    @Override // android.view.View
    public void setLayoutParams(android.view.ViewGroup.LayoutParams r4) {
            r3 = this;
            super.setLayoutParams(r4)
            boolean r3 = r4 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r3 == 0) goto L16
            android.view.ViewGroup$MarginLayoutParams r4 = (android.view.ViewGroup.MarginLayoutParams) r4
            android.graphics.Rect r3 = new android.graphics.Rect
            int r0 = r4.leftMargin
            int r1 = r4.topMargin
            int r2 = r4.rightMargin
            int r4 = r4.bottomMargin
            r3.<init>(r0, r1, r2, r4)
        L16:
            return
    }

    @Override // android.view.View
    public void setOnClickListener(android.view.View.OnClickListener r2) {
            r1 = this;
            if (r2 == 0) goto L4
            r0 = 0
            goto L6
        L4:
            t20 r0 = defpackage.u20.h0
        L6:
            r1.setOnTouchListener(r0)
            super.setOnClickListener(r2)
            return
    }
}
