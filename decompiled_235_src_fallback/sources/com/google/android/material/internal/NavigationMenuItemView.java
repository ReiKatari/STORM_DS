package com.google.android.material.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class NavigationMenuItemView extends defpackage.xj2 implements defpackage.c54 {
    public static final int[] F0 = null;
    public defpackage.o44 A0;
    public android.content.res.ColorStateList B0;
    public boolean C0;
    public android.graphics.drawable.Drawable D0;
    public final defpackage.l60 E0;
    public int u0;
    public boolean v0;
    public boolean w0;
    public final boolean x0;
    public final android.widget.CheckedTextView y0;
    public android.widget.FrameLayout z0;

    static {
            r0 = 16842912(0x10100a0, float:2.3694006E-38)
            int[] r0 = new int[]{r0}
            com.google.android.material.internal.NavigationMenuItemView.F0 = r0
            return
    }

    public NavigationMenuItemView(android.content.Context r4, android.util.AttributeSet r5) {
            r3 = this;
            r3.<init>(r4, r5)
            r5 = 1
            r3.x0 = r5
            l60 r0 = new l60
            r1 = 4
            r0.<init>(r3, r1)
            r3.E0 = r0
            r1 = 0
            r3.setOrientation(r1)
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r4)
            r2 = 2131623981(0x7f0e002d, float:1.8875129E38)
            r1.inflate(r2, r3, r5)
            android.content.res.Resources r4 = r4.getResources()
            r5 = 2131165305(0x7f070079, float:1.7944823E38)
            int r4 = r4.getDimensionPixelSize(r5)
            r3.setIconSize(r4)
            r4 = 2131427537(0x7f0b00d1, float:1.8476693E38)
            android.view.View r4 = r3.findViewById(r4)
            android.widget.CheckedTextView r4 = (android.widget.CheckedTextView) r4
            r3.y0 = r4
            defpackage.ao7.n(r4, r0)
            return
    }

    private void setActionView(android.view.View r2) {
            r1 = this;
            if (r2 == 0) goto L30
            android.widget.FrameLayout r0 = r1.z0
            if (r0 != 0) goto L17
            r0 = 2131427536(0x7f0b00d0, float:1.8476691E38)
            android.view.View r0 = r1.findViewById(r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            android.view.View r0 = r0.inflate()
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r1.z0 = r0
        L17:
            android.view.ViewParent r0 = r2.getParent()
            if (r0 == 0) goto L26
            android.view.ViewParent r0 = r2.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r0.removeView(r2)
        L26:
            android.widget.FrameLayout r0 = r1.z0
            r0.removeAllViews()
            android.widget.FrameLayout r1 = r1.z0
            r1.addView(r2)
        L30:
            return
    }

    @Override // defpackage.c54
    public final void c(defpackage.o44 r7) {
            r6 = this;
            r6.A0 = r7
            int r0 = r7.a
            if (r0 <= 0) goto L9
            r6.setId(r0)
        L9:
            boolean r0 = r7.isVisible()
            r1 = 8
            r2 = 0
            if (r0 == 0) goto L14
            r0 = r2
            goto L15
        L14:
            r0 = r1
        L15:
            r6.setVisibility(r0)
            android.graphics.drawable.Drawable r0 = r6.getBackground()
            if (r0 != 0) goto L55
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.Context r3 = r6.getContext()
            android.content.res.Resources$Theme r3 = r3.getTheme()
            r4 = 2130968848(0x7f040110, float:1.7546361E38)
            r5 = 1
            boolean r3 = r3.resolveAttribute(r4, r0, r5)
            if (r3 == 0) goto L51
            android.graphics.drawable.StateListDrawable r3 = new android.graphics.drawable.StateListDrawable
            r3.<init>()
            android.graphics.drawable.ColorDrawable r4 = new android.graphics.drawable.ColorDrawable
            int r0 = r0.data
            r4.<init>(r0)
            int[] r0 = com.google.android.material.internal.NavigationMenuItemView.F0
            r3.addState(r0, r4)
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r2)
            int[] r4 = android.view.ViewGroup.EMPTY_STATE_SET
            r3.addState(r4, r0)
            goto L52
        L51:
            r3 = 0
        L52:
            r6.setBackground(r3)
        L55:
            boolean r0 = r7.isCheckable()
            r6.setCheckable(r0)
            boolean r0 = r7.isChecked()
            r6.setChecked(r0)
            boolean r0 = r7.isEnabled()
            r6.setEnabled(r0)
            java.lang.CharSequence r0 = r7.e
            r6.setTitle(r0)
            android.graphics.drawable.Drawable r0 = r7.getIcon()
            r6.setIcon(r0)
            android.view.View r0 = r7.getActionView()
            r6.setActionView(r0)
            java.lang.CharSequence r0 = r7.q
            r6.setContentDescription(r0)
            java.lang.CharSequence r7 = r7.r
            defpackage.bl2.R(r6, r7)
            o44 r7 = r6.A0
            java.lang.CharSequence r0 = r7.e
            android.widget.CheckedTextView r3 = r6.y0
            if (r0 != 0) goto Lb3
            android.graphics.drawable.Drawable r7 = r7.getIcon()
            if (r7 != 0) goto Lb3
            o44 r7 = r6.A0
            android.view.View r7 = r7.getActionView()
            if (r7 == 0) goto Lb3
            r3.setVisibility(r1)
            android.widget.FrameLayout r7 = r6.z0
            if (r7 == 0) goto Lc8
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            cv3 r7 = (defpackage.cv3) r7
            r0 = -1
            r7.width = r0
            android.widget.FrameLayout r6 = r6.z0
            r6.setLayoutParams(r7)
            return
        Lb3:
            r3.setVisibility(r2)
            android.widget.FrameLayout r7 = r6.z0
            if (r7 == 0) goto Lc8
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            cv3 r7 = (defpackage.cv3) r7
            r0 = -2
            r7.width = r0
            android.widget.FrameLayout r6 = r6.z0
            r6.setLayoutParams(r7)
        Lc8:
            return
    }

    @Override // defpackage.c54
    public defpackage.o44 getItemData() {
            r0 = this;
            o44 r0 = r0.A0
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int r2) {
            r1 = this;
            int r2 = r2 + 1
            int[] r2 = super.onCreateDrawableState(r2)
            o44 r0 = r1.A0
            if (r0 == 0) goto L1d
            boolean r0 = r0.isCheckable()
            if (r0 == 0) goto L1d
            o44 r1 = r1.A0
            boolean r1 = r1.isChecked()
            if (r1 == 0) goto L1d
            int[] r1 = com.google.android.material.internal.NavigationMenuItemView.F0
            android.view.View.mergeDrawableStates(r2, r1)
        L1d:
            return r2
    }

    public void setCheckable(boolean r2) {
            r1 = this;
            r1.refreshDrawableState()
            boolean r0 = r1.w0
            if (r0 == r2) goto L12
            r1.w0 = r2
            android.widget.CheckedTextView r2 = r1.y0
            r0 = 2048(0x800, float:2.87E-42)
            l60 r1 = r1.E0
            r1.h(r2, r0)
        L12:
            return
    }

    public void setChecked(boolean r3) {
            r2 = this;
            r2.refreshDrawableState()
            android.widget.CheckedTextView r0 = r2.y0
            r0.setChecked(r3)
            android.graphics.Typeface r1 = r0.getTypeface()
            if (r3 == 0) goto L14
            boolean r2 = r2.x0
            if (r2 == 0) goto L14
            r2 = 1
            goto L15
        L14:
            r2 = 0
        L15:
            r0.setTypeface(r1, r2)
            return
    }

    public void setHorizontalPadding(int r3) {
            r2 = this;
            int r0 = r2.getPaddingTop()
            int r1 = r2.getPaddingBottom()
            r2.setPadding(r3, r0, r3, r1)
            return
    }

    public void setIcon(android.graphics.drawable.Drawable r4) {
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L21
            boolean r1 = r3.C0
            if (r1 == 0) goto L1b
            android.graphics.drawable.Drawable$ConstantState r1 = r4.getConstantState()
            if (r1 != 0) goto Le
            goto L12
        Le:
            android.graphics.drawable.Drawable r4 = r1.newDrawable()
        L12:
            android.graphics.drawable.Drawable r4 = r4.mutate()
            android.content.res.ColorStateList r1 = r3.B0
            r4.setTintList(r1)
        L1b:
            int r1 = r3.u0
            r4.setBounds(r0, r0, r1, r1)
            goto L49
        L21:
            boolean r1 = r3.v0
            if (r1 == 0) goto L49
            android.graphics.drawable.Drawable r4 = r3.D0
            if (r4 != 0) goto L47
            android.content.res.Resources r4 = r3.getResources()
            android.content.Context r1 = r3.getContext()
            android.content.res.Resources$Theme r1 = r1.getTheme()
            java.lang.ThreadLocal r2 = defpackage.sl5.a
            r2 = 2131231052(0x7f08014c, float:1.8078174E38)
            android.graphics.drawable.Drawable r4 = r4.getDrawable(r2, r1)
            r3.D0 = r4
            if (r4 == 0) goto L47
            int r1 = r3.u0
            r4.setBounds(r0, r0, r1, r1)
        L47:
            android.graphics.drawable.Drawable r4 = r3.D0
        L49:
            android.widget.CheckedTextView r3 = r3.y0
            r0 = 0
            r3.setCompoundDrawablesRelative(r4, r0, r0, r0)
            return
    }

    public void setIconPadding(int r1) {
            r0 = this;
            android.widget.CheckedTextView r0 = r0.y0
            r0.setCompoundDrawablePadding(r1)
            return
    }

    public void setIconSize(int r1) {
            r0 = this;
            r0.u0 = r1
            return
    }

    public void setIconTintList(android.content.res.ColorStateList r1) {
            r0 = this;
            r0.B0 = r1
            if (r1 == 0) goto L6
            r1 = 1
            goto L7
        L6:
            r1 = 0
        L7:
            r0.C0 = r1
            o44 r1 = r0.A0
            if (r1 == 0) goto L14
            android.graphics.drawable.Drawable r1 = r1.getIcon()
            r0.setIcon(r1)
        L14:
            return
    }

    public void setMaxLines(int r1) {
            r0 = this;
            android.widget.CheckedTextView r0 = r0.y0
            r0.setMaxLines(r1)
            return
    }

    public void setNeedsEmptyIcon(boolean r1) {
            r0 = this;
            r0.v0 = r1
            return
    }

    public void setTextAppearance(int r1) {
            r0 = this;
            android.widget.CheckedTextView r0 = r0.y0
            r0.setTextAppearance(r1)
            return
    }

    public void setTextColor(android.content.res.ColorStateList r1) {
            r0 = this;
            android.widget.CheckedTextView r0 = r0.y0
            r0.setTextColor(r1)
            return
    }

    public void setTitle(java.lang.CharSequence r1) {
            r0 = this;
            android.widget.CheckedTextView r0 = r0.y0
            r0.setText(r1)
            return
    }
}
