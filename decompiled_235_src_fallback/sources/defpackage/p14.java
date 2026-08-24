package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: p14  reason: default package */
/* loaded from: classes.dex */
public final class p14 extends defpackage.kq {
    public final defpackage.ax3 d0;
    public final android.view.accessibility.AccessibilityManager e0;
    public final android.graphics.Rect f0;
    public final int g0;
    public final float h0;
    public android.content.res.ColorStateList i0;
    public int j0;
    public android.content.res.ColorStateList k0;

    public p14(android.content.Context r8, android.util.AttributeSet r9) {
            r7 = this;
            r3 = 2130968648(0x7f040048, float:1.7545956E38)
            r6 = 0
            android.content.Context r8 = defpackage.q60.e0(r8, r9, r3, r6)
            r7.<init>(r8, r9)
            android.graphics.Rect r8 = new android.graphics.Rect
            r8.<init>()
            r7.f0 = r8
            android.content.Context r0 = r7.getContext()
            r4 = 2132018063(0x7f14038f, float:1.9674422E38)
            int[] r5 = new int[r6]
            int[] r2 = defpackage.a75.i
            r1 = r9
            android.content.res.TypedArray r8 = defpackage.f04.K(r0, r1, r2, r3, r4, r5)
            boolean r9 = r8.hasValue(r6)
            r1 = 0
            if (r9 == 0) goto L32
            int r9 = r8.getInt(r6, r6)
            if (r9 != 0) goto L32
            r7.setKeyListener(r1)
        L32:
            r9 = 3
            r2 = 2131624038(0x7f0e0066, float:1.8875244E38)
            int r9 = r8.getResourceId(r9, r2)
            r7.g0 = r9
            r9 = 2131166088(0x7f070388, float:1.7946411E38)
            r2 = 1
            int r9 = r8.getDimensionPixelOffset(r2, r9)
            float r9 = (float) r9
            r7.h0 = r9
            r9 = 2
            boolean r3 = r8.hasValue(r9)
            if (r3 == 0) goto L58
            int r3 = r8.getColor(r9, r6)
            android.content.res.ColorStateList r3 = android.content.res.ColorStateList.valueOf(r3)
            r7.i0 = r3
        L58:
            r3 = 4
            int r3 = r8.getColor(r3, r6)
            r7.j0 = r3
            r3 = 5
            android.content.res.ColorStateList r3 = defpackage.np2.S(r0, r8, r3)
            r7.k0 = r3
            java.lang.String r3 = "accessibility"
            java.lang.Object r3 = r0.getSystemService(r3)
            android.view.accessibility.AccessibilityManager r3 = (android.view.accessibility.AccessibilityManager) r3
            r7.e0 = r3
            ax3 r3 = new ax3
            r4 = 2130969414(0x7f040346, float:1.754751E38)
            r3.<init>(r0, r1, r4, r6)
            r7.d0 = r3
            r3.u0 = r2
            pr r0 = r3.v0
            r0.setFocusable(r2)
            r3.k0 = r7
            r0.setInputMethodMode(r9)
            android.widget.ListAdapter r9 = r7.getAdapter()
            r3.n(r9)
            as r9 = new as
            r9.<init>(r7, r2)
            r3.l0 = r9
            r9 = 6
            boolean r0 = r8.hasValue(r9)
            if (r0 == 0) goto La2
            int r9 = r8.getResourceId(r9, r6)
            r7.setSimpleItems(r9)
        La2:
            r8.recycle()
            return
    }

    public static /* synthetic */ java.lang.CharSequence a(defpackage.p14 r0, java.lang.Object r1) {
            java.lang.CharSequence r0 = r0.convertSelectionToString(r1)
            return r0
    }

    public final com.google.android.material.textfield.TextInputLayout b() {
            r1 = this;
            android.view.ViewParent r1 = r1.getParent()
        L4:
            if (r1 == 0) goto L12
            boolean r0 = r1 instanceof com.google.android.material.textfield.TextInputLayout
            if (r0 == 0) goto Ld
            com.google.android.material.textfield.TextInputLayout r1 = (com.google.android.material.textfield.TextInputLayout) r1
            return r1
        Ld:
            android.view.ViewParent r1 = r1.getParent()
            goto L4
        L12:
            r1 = 0
            return r1
    }

    public final boolean c() {
            r2 = this;
            android.view.accessibility.AccessibilityManager r2 = r2.e0
            if (r2 == 0) goto Lb
            boolean r0 = r2.isTouchExplorationEnabled()
            if (r0 == 0) goto Lb
            goto L3e
        Lb:
            if (r2 == 0) goto L40
            boolean r0 = r2.isEnabled()
            if (r0 != 0) goto L14
            goto L40
        L14:
            r0 = 16
            java.util.List r2 = r2.getEnabledAccessibilityServiceList(r0)
            if (r2 == 0) goto L40
            java.util.Iterator r2 = r2.iterator()
        L20:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L40
            java.lang.Object r0 = r2.next()
            android.accessibilityservice.AccessibilityServiceInfo r0 = (android.accessibilityservice.AccessibilityServiceInfo) r0
            java.lang.String r1 = r0.getSettingsActivityName()
            if (r1 == 0) goto L20
            java.lang.String r0 = r0.getSettingsActivityName()
            java.lang.String r1 = "SwitchAccess"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L20
        L3e:
            r2 = 1
            return r2
        L40:
            r2 = 0
            return r2
    }

    @Override // android.widget.AutoCompleteTextView
    public final void dismissDropDown() {
            r1 = this;
            boolean r0 = r1.c()
            if (r0 == 0) goto Lc
            ax3 r1 = r1.d0
            r1.dismiss()
            return
        Lc:
            super.dismissDropDown()
            return
    }

    public android.content.res.ColorStateList getDropDownBackgroundTintList() {
            r0 = this;
            android.content.res.ColorStateList r0 = r0.i0
            return r0
    }

    @Override // android.widget.TextView
    public java.lang.CharSequence getHint() {
            r2 = this;
            com.google.android.material.textfield.TextInputLayout r0 = r2.b()
            if (r0 == 0) goto Lf
            boolean r1 = r0.E0
            if (r1 == 0) goto Lf
            java.lang.CharSequence r2 = r0.getHint()
            return r2
        Lf:
            java.lang.CharSequence r2 = super.getHint()
            return r2
    }

    public float getPopupElevation() {
            r0 = this;
            float r0 = r0.h0
            return r0
    }

    public int getSimpleItemSelectedColor() {
            r0 = this;
            int r0 = r0.j0
            return r0
    }

    public android.content.res.ColorStateList getSimpleItemSelectedRippleColor() {
            r0 = this;
            android.content.res.ColorStateList r0 = r0.k0
            return r0
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
            r3 = this;
            super.onAttachedToWindow()
            com.google.android.material.textfield.TextInputLayout r0 = r3.b()
            if (r0 == 0) goto L2c
            boolean r0 = r0.E0
            if (r0 == 0) goto L2c
            java.lang.CharSequence r0 = super.getHint()
            if (r0 != 0) goto L2c
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.String r1 = ""
            if (r0 == 0) goto L20
            java.util.Locale r2 = java.util.Locale.ENGLISH
            java.lang.String r0 = r0.toLowerCase(r2)
            goto L21
        L20:
            r0 = r1
        L21:
            java.lang.String r2 = "meizu"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L2c
            r3.setHint(r1)
        L2c:
            return
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public final void onDetachedFromWindow() {
            r0 = this;
            super.onDetachedFromWindow()
            ax3 r0 = r0.d0
            r0.dismiss()
            return
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int r14, int r15) {
            r13 = this;
            super.onMeasure(r14, r15)
            int r15 = android.view.View.MeasureSpec.getMode(r14)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r15 != r0) goto Lb3
            int r15 = r13.getMeasuredWidth()
            android.widget.ListAdapter r0 = r13.getAdapter()
            com.google.android.material.textfield.TextInputLayout r1 = r13.b()
            r2 = 0
            if (r0 == 0) goto La0
            if (r1 != 0) goto L1e
            goto La0
        L1e:
            int r3 = r13.getMeasuredWidth()
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r2)
            int r4 = r13.getMeasuredHeight()
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r2)
            ax3 r5 = r13.d0
            pr r6 = r5.v0
            boolean r6 = r6.isShowing()
            if (r6 != 0) goto L3a
            r6 = -1
            goto L40
        L3a:
            mp1 r6 = r5.L
            int r6 = r6.getSelectedItemPosition()
        L40:
            int r6 = java.lang.Math.max(r2, r6)
            int r7 = r0.getCount()
            int r6 = r6 + 15
            int r6 = java.lang.Math.min(r7, r6)
            int r7 = r6 + (-15)
            int r7 = java.lang.Math.max(r2, r7)
            r8 = 0
            r9 = r7
            r10 = r8
            r7 = r2
        L58:
            if (r9 >= r6) goto L83
            int r11 = r0.getItemViewType(r9)
            if (r11 == r2) goto L62
            r10 = r8
            r2 = r11
        L62:
            android.view.View r10 = r0.getView(r9, r10, r1)
            android.view.ViewGroup$LayoutParams r11 = r10.getLayoutParams()
            if (r11 != 0) goto L75
            android.view.ViewGroup$LayoutParams r11 = new android.view.ViewGroup$LayoutParams
            r12 = -2
            r11.<init>(r12, r12)
            r10.setLayoutParams(r11)
        L75:
            r10.measure(r3, r4)
            int r11 = r10.getMeasuredWidth()
            int r7 = java.lang.Math.max(r7, r11)
            int r9 = r9 + 1
            goto L58
        L83:
            pr r0 = r5.v0
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            if (r0 == 0) goto L96
            android.graphics.Rect r2 = r13.f0
            r0.getPadding(r2)
            int r0 = r2.left
            int r2 = r2.right
            int r0 = r0 + r2
            int r7 = r7 + r0
        L96:
            com.google.android.material.internal.CheckableImageButton r0 = r1.getEndIconView()
            int r0 = r0.getMeasuredWidth()
            int r2 = r0 + r7
        La0:
            int r15 = java.lang.Math.max(r15, r2)
            int r14 = android.view.View.MeasureSpec.getSize(r14)
            int r14 = java.lang.Math.min(r15, r14)
            int r15 = r13.getMeasuredHeight()
            r13.setMeasuredDimension(r14, r15)
        Lb3:
            return
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean r2) {
            r1 = this;
            boolean r0 = r1.c()
            if (r0 == 0) goto L7
            return
        L7:
            super.onWindowFocusChanged(r2)
            return
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends android.widget.ListAdapter & android.widget.Filterable> void setAdapter(T r1) {
            r0 = this;
            super.setAdapter(r1)
            ax3 r1 = r0.d0
            android.widget.ListAdapter r0 = r0.getAdapter()
            r1.n(r0)
            return
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            super.setDropDownBackgroundDrawable(r1)
            ax3 r0 = r0.d0
            if (r0 == 0) goto La
            r0.h(r1)
        La:
            return
    }

    public void setDropDownBackgroundTint(int r1) {
            r0 = this;
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r0.setDropDownBackgroundTintList(r1)
            return
    }

    public void setDropDownBackgroundTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            r1.i0 = r2
            android.graphics.drawable.Drawable r2 = r1.getDropDownBackground()
            boolean r0 = r2 instanceof defpackage.p24
            if (r0 == 0) goto L11
            p24 r2 = (defpackage.p24) r2
            android.content.res.ColorStateList r1 = r1.i0
            r2.n(r1)
        L11:
            return
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(android.widget.AdapterView.OnItemSelectedListener r1) {
            r0 = this;
            super.setOnItemSelectedListener(r1)
            ax3 r1 = r0.d0
            android.widget.AdapterView$OnItemSelectedListener r0 = r0.getOnItemSelectedListener()
            r1.m0 = r0
            return
    }

    @Override // android.widget.TextView
    public void setRawInputType(int r1) {
            r0 = this;
            super.setRawInputType(r1)
            com.google.android.material.textfield.TextInputLayout r0 = r0.b()
            if (r0 == 0) goto Lc
            r0.u()
        Lc:
            return
    }

    public void setSimpleItemSelectedColor(int r1) {
            r0 = this;
            r0.j0 = r1
            android.widget.ListAdapter r1 = r0.getAdapter()
            boolean r1 = r1 instanceof defpackage.o14
            if (r1 == 0) goto L13
            android.widget.ListAdapter r0 = r0.getAdapter()
            o14 r0 = (defpackage.o14) r0
            r0.a()
        L13:
            return
    }

    public void setSimpleItemSelectedRippleColor(android.content.res.ColorStateList r1) {
            r0 = this;
            r0.k0 = r1
            android.widget.ListAdapter r1 = r0.getAdapter()
            boolean r1 = r1 instanceof defpackage.o14
            if (r1 == 0) goto L13
            android.widget.ListAdapter r0 = r0.getAdapter()
            o14 r0 = (defpackage.o14) r0
            r0.a()
        L13:
            return
    }

    public void setSimpleItems(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            java.lang.String[] r2 = r0.getStringArray(r2)
            r1.setSimpleItems(r2)
            return
    }

    public void setSimpleItems(java.lang.String[] r4) {
            r3 = this;
            o14 r0 = new o14
            android.content.Context r1 = r3.getContext()
            int r2 = r3.g0
            r0.<init>(r3, r1, r2, r4)
            r3.setAdapter(r0)
            return
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
            r1 = this;
            boolean r0 = r1.c()
            if (r0 == 0) goto Lc
            ax3 r1 = r1.d0
            r1.e()
            return
        Lc:
            super.showDropDown()
            return
    }
}
