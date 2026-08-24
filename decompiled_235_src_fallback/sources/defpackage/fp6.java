package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fp6  reason: default package */
/* loaded from: classes.dex */
public final class fp6 extends android.widget.LinearLayout {
    public final com.google.android.material.textfield.TextInputLayout A;
    public final defpackage.qs B;
    public java.lang.CharSequence L;
    public final com.google.android.material.internal.CheckableImageButton R;
    public android.content.res.ColorStateList d0;
    public android.graphics.PorterDuff.Mode e0;
    public int f0;
    public android.widget.ImageView.ScaleType g0;
    public android.view.View.OnLongClickListener h0;
    public boolean i0;

    public fp6(com.google.android.material.textfield.TextInputLayout r11, defpackage.m44 r12) {
            r10 = this;
            android.content.Context r0 = r11.getContext()
            r10.<init>(r0)
            r10.A = r11
            r11 = 8
            r10.setVisibility(r11)
            r0 = 0
            r10.setOrientation(r0)
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r2 = 8388611(0x800003, float:1.1754948E-38)
            r3 = -2
            r4 = -1
            r1.<init>(r3, r4, r2)
            r10.setLayoutParams(r1)
            android.content.Context r1 = r10.getContext()
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
            r2 = 2131623983(0x7f0e002f, float:1.8875133E38)
            android.view.View r1 = r1.inflate(r2, r10, r0)
            com.google.android.material.internal.CheckableImageButton r1 = (com.google.android.material.internal.CheckableImageButton) r1
            r10.R = r1
            qs r2 = new qs
            android.content.Context r5 = r10.getContext()
            r6 = 0
            r2.<init>(r5, r6)
            r10.B = r2
            android.content.Context r5 = r10.getContext()
            boolean r5 = defpackage.np2.W(r5)
            if (r5 == 0) goto L51
            android.view.ViewGroup$LayoutParams r5 = r1.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r5 = (android.view.ViewGroup.MarginLayoutParams) r5
            r5.setMarginEnd(r0)
        L51:
            android.view.View$OnLongClickListener r5 = r10.h0
            r1.setOnClickListener(r6)
            defpackage.kj2.Y(r1, r5)
            r10.h0 = r6
            r1.setOnLongClickListener(r6)
            defpackage.kj2.Y(r1, r6)
            java.lang.Object r5 = r12.L
            android.content.res.TypedArray r5 = (android.content.res.TypedArray) r5
            r7 = 70
            boolean r8 = r5.hasValue(r7)
            if (r8 == 0) goto L77
            android.content.Context r8 = r10.getContext()
            android.content.res.ColorStateList r7 = defpackage.np2.R(r8, r12, r7)
            r10.d0 = r7
        L77:
            r7 = 71
            boolean r8 = r5.hasValue(r7)
            if (r8 == 0) goto L89
            int r7 = r5.getInt(r7, r4)
            android.graphics.PorterDuff$Mode r7 = defpackage.qo2.E(r7, r6)
            r10.e0 = r7
        L89:
            r7 = 67
            boolean r8 = r5.hasValue(r7)
            r9 = 1
            if (r8 == 0) goto Lb7
            android.graphics.drawable.Drawable r7 = r12.k(r7)
            r10.b(r7)
            r7 = 66
            boolean r8 = r5.hasValue(r7)
            if (r8 == 0) goto Lae
            java.lang.CharSequence r7 = r5.getText(r7)
            java.lang.CharSequence r8 = r1.getContentDescription()
            if (r8 == r7) goto Lae
            r1.setContentDescription(r7)
        Lae:
            r7 = 65
            boolean r7 = r5.getBoolean(r7, r9)
            r1.setCheckable(r7)
        Lb7:
            android.content.res.Resources r7 = r10.getResources()
            r8 = 2131166119(0x7f0703a7, float:1.7946474E38)
            int r7 = r7.getDimensionPixelSize(r8)
            r8 = 68
            int r7 = r5.getDimensionPixelSize(r8, r7)
            if (r7 < 0) goto L134
            int r8 = r10.f0
            if (r7 == r8) goto Ld6
            r10.f0 = r7
            r1.setMinimumWidth(r7)
            r1.setMinimumHeight(r7)
        Ld6:
            r7 = 69
            boolean r8 = r5.hasValue(r7)
            if (r8 == 0) goto Leb
            int r4 = r5.getInt(r7, r4)
            android.widget.ImageView$ScaleType r4 = defpackage.kj2.r(r4)
            r10.g0 = r4
            r1.setScaleType(r4)
        Leb:
            r2.setVisibility(r11)
            r11 = 2131428009(0x7f0b02a9, float:1.847765E38)
            r2.setId(r11)
            android.widget.LinearLayout$LayoutParams r11 = new android.widget.LinearLayout$LayoutParams
            r11.<init>(r3, r3)
            r2.setLayoutParams(r11)
            r2.setAccessibilityLiveRegion(r9)
            r11 = 61
            int r11 = r5.getResourceId(r11, r0)
            r2.setTextAppearance(r11)
            r11 = 62
            boolean r0 = r5.hasValue(r11)
            if (r0 == 0) goto L117
            android.content.res.ColorStateList r11 = r12.g(r11)
            r2.setTextColor(r11)
        L117:
            r11 = 60
            java.lang.CharSequence r11 = r5.getText(r11)
            boolean r12 = android.text.TextUtils.isEmpty(r11)
            if (r12 == 0) goto L124
            goto L125
        L124:
            r6 = r11
        L125:
            r10.L = r6
            r2.setText(r11)
            r10.e()
            r10.addView(r1)
            r10.addView(r2)
            return
        L134:
            java.lang.String r10 = "startIconSize cannot be less than 0"
            defpackage.i.h(r10)
            throw r6
    }

    public final int a() {
            r2 = this;
            com.google.android.material.internal.CheckableImageButton r0 = r2.R
            int r1 = r0.getVisibility()
            if (r1 != 0) goto L18
            int r1 = r0.getMeasuredWidth()
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            int r0 = r0.getMarginEnd()
            int r0 = r0 + r1
            goto L19
        L18:
            r0 = 0
        L19:
            int r1 = r2.getPaddingStart()
            qs r2 = r2.B
            int r2 = r2.getPaddingStart()
            int r2 = r2 + r1
            int r2 = r2 + r0
            return r2
    }

    public final void b(android.graphics.drawable.Drawable r4) {
            r3 = this;
            com.google.android.material.internal.CheckableImageButton r0 = r3.R
            r0.setImageDrawable(r4)
            if (r4 == 0) goto L1a
            android.content.res.ColorStateList r4 = r3.d0
            android.graphics.PorterDuff$Mode r1 = r3.e0
            com.google.android.material.textfield.TextInputLayout r2 = r3.A
            defpackage.kj2.p(r2, r0, r4, r1)
            r4 = 1
            r3.c(r4)
            android.content.res.ColorStateList r3 = r3.d0
            defpackage.kj2.V(r2, r0, r3)
            return
        L1a:
            r4 = 0
            r3.c(r4)
            android.view.View$OnLongClickListener r4 = r3.h0
            r1 = 0
            r0.setOnClickListener(r1)
            defpackage.kj2.Y(r0, r4)
            r3.h0 = r1
            r0.setOnLongClickListener(r1)
            defpackage.kj2.Y(r0, r1)
            java.lang.CharSequence r3 = r0.getContentDescription()
            if (r3 == 0) goto L38
            r0.setContentDescription(r1)
        L38:
            return
    }

    public final void c(boolean r4) {
            r3 = this;
            com.google.android.material.internal.CheckableImageButton r0 = r3.R
            int r1 = r0.getVisibility()
            r2 = 0
            if (r1 != 0) goto Lb
            r1 = 1
            goto Lc
        Lb:
            r1 = r2
        Lc:
            if (r1 == r4) goto L1c
            if (r4 == 0) goto L11
            goto L13
        L11:
            r2 = 8
        L13:
            r0.setVisibility(r2)
            r3.d()
            r3.e()
        L1c:
            return
    }

    public final void d() {
            r5 = this;
            com.google.android.material.textfield.TextInputLayout r0 = r5.A
            android.widget.EditText r0 = r0.d0
            if (r0 != 0) goto L7
            return
        L7:
            com.google.android.material.internal.CheckableImageButton r1 = r5.R
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L11
            r1 = 0
            goto L15
        L11:
            int r1 = r0.getPaddingStart()
        L15:
            int r2 = r0.getCompoundPaddingTop()
            android.content.Context r3 = r5.getContext()
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131165989(0x7f070325, float:1.794621E38)
            int r3 = r3.getDimensionPixelSize(r4)
            int r0 = r0.getCompoundPaddingBottom()
            qs r5 = r5.B
            r5.setPaddingRelative(r1, r2, r3, r0)
            return
    }

    public final void e() {
            r4 = this;
            java.lang.CharSequence r0 = r4.L
            r1 = 8
            r2 = 0
            if (r0 == 0) goto Ld
            boolean r0 = r4.i0
            if (r0 != 0) goto Ld
            r0 = r2
            goto Le
        Ld:
            r0 = r1
        Le:
            com.google.android.material.internal.CheckableImageButton r3 = r4.R
            int r3 = r3.getVisibility()
            if (r3 == 0) goto L18
            if (r0 != 0) goto L19
        L18:
            r1 = r2
        L19:
            r4.setVisibility(r1)
            qs r1 = r4.B
            r1.setVisibility(r0)
            com.google.android.material.textfield.TextInputLayout r4 = r4.A
            r4.s()
            return
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int r1, int r2) {
            r0 = this;
            super.onMeasure(r1, r2)
            r0.d()
            return
    }
}
