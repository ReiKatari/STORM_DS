package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fs  reason: default package */
/* loaded from: classes.dex */
public final class fs extends android.widget.Spinner {
    public static final int[] h0 = null;
    public final defpackage.z9 A;
    public final android.content.Context B;
    public final defpackage.vr L;
    public android.widget.SpinnerAdapter R;
    public final boolean d0;
    public final defpackage.es e0;
    public int f0;
    public final android.graphics.Rect g0;

    static {
            r0 = 16843505(0x10102f1, float:2.3695668E-38)
            int[] r0 = new int[]{r0}
            defpackage.fs.h0 = r0
            return
    }

    public fs(android.content.Context r13, android.util.AttributeSet r14) {
            r12 = this;
            r0 = 2130969779(0x7f0404b3, float:1.754825E38)
            r12.<init>(r13, r14, r0)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r12.g0 = r1
            android.content.Context r1 = r12.getContext()
            defpackage.h57.a(r12, r1)
            int[] r1 = defpackage.m75.v
            m44 r2 = defpackage.m44.A(r13, r14, r1, r0)
            java.lang.Object r3 = r2.L
            android.content.res.TypedArray r3 = (android.content.res.TypedArray) r3
            z9 r4 = new z9
            r4.<init>(r12)
            r12.A = r4
            r4 = 4
            r5 = 0
            int r4 = r3.getResourceId(r4, r5)
            if (r4 == 0) goto L35
            p41 r6 = new p41
            r6.<init>(r13, r4)
            r12.B = r6
            goto L37
        L35:
            r12.B = r13
        L37:
            r4 = -1
            r6 = 0
            int[] r7 = defpackage.fs.h0     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L57
            android.content.res.TypedArray r7 = r13.obtainStyledAttributes(r14, r7, r0, r5)     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L57
            boolean r8 = r7.hasValue(r5)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4e
            if (r8 == 0) goto L50
            int r4 = r7.getInt(r5, r5)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4e
            goto L50
        L4a:
            r12 = move-exception
            r6 = r7
            goto Ld5
        L4e:
            r8 = move-exception
            goto L59
        L50:
            r7.recycle()
            goto L63
        L54:
            r12 = move-exception
            goto Ld5
        L57:
            r8 = move-exception
            r7 = r6
        L59:
            java.lang.String r9 = "AppCompatSpinner"
            java.lang.String r10 = "Could not read android:spinnerMode"
            android.util.Log.i(r9, r10, r8)     // Catch: java.lang.Throwable -> L4a
            if (r7 == 0) goto L63
            goto L50
        L63:
            r7 = 2
            r8 = 1
            if (r4 == 0) goto L9d
            if (r4 == r8) goto L6a
            goto Laa
        L6a:
            cs r4 = new cs
            android.content.Context r9 = r12.B
            r4.<init>(r12, r9, r14)
            android.content.Context r9 = r12.B
            m44 r1 = defpackage.m44.A(r9, r14, r1, r0)
            java.lang.Object r9 = r1.L
            android.content.res.TypedArray r9 = (android.content.res.TypedArray) r9
            r10 = 3
            r11 = -2
            int r9 = r9.getLayoutDimension(r10, r11)
            r12.f0 = r9
            android.graphics.drawable.Drawable r9 = r1.k(r8)
            r4.h(r9)
            java.lang.String r7 = r3.getString(r7)
            r4.y0 = r7
            r1.D()
            r12.e0 = r4
            vr r1 = new vr
            r1.<init>(r12, r12, r4)
            r12.L = r1
            goto Laa
        L9d:
            yr r1 = new yr
            r1.<init>(r12)
            r12.e0 = r1
            java.lang.String r4 = r3.getString(r7)
            r1.L = r4
        Laa:
            java.lang.CharSequence[] r1 = r3.getTextArray(r5)
            if (r1 == 0) goto Lc1
            android.widget.ArrayAdapter r3 = new android.widget.ArrayAdapter
            r4 = 17367048(0x1090008, float:2.5162948E-38)
            r3.<init>(r13, r4, r1)
            r13 = 2131624095(0x7f0e009f, float:1.887536E38)
            r3.setDropDownViewResource(r13)
            r12.setAdapter2(r3)
        Lc1:
            r2.D()
            r12.d0 = r8
            android.widget.SpinnerAdapter r13 = r12.R
            if (r13 == 0) goto Lcf
            r12.setAdapter2(r13)
            r12.R = r6
        Lcf:
            z9 r12 = r12.A
            r12.k(r14, r0)
            return
        Ld5:
            if (r6 == 0) goto Lda
            r6.recycle()
        Lda:
            throw r12
    }

    public final int a(android.widget.SpinnerAdapter r11, android.graphics.drawable.Drawable r12) {
            r10 = this;
            r0 = 0
            if (r11 != 0) goto L4
            return r0
        L4:
            int r1 = r10.getMeasuredWidth()
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            int r2 = r10.getMeasuredHeight()
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            int r3 = r10.getSelectedItemPosition()
            int r3 = java.lang.Math.max(r0, r3)
            int r4 = r11.getCount()
            int r5 = r3 + 15
            int r4 = java.lang.Math.min(r4, r5)
            int r5 = r4 - r3
            int r5 = 15 - r5
            int r3 = r3 - r5
            int r3 = java.lang.Math.max(r0, r3)
            r5 = 0
            r6 = r3
            r7 = r5
            r3 = r0
        L33:
            if (r6 >= r4) goto L5e
            int r8 = r11.getItemViewType(r6)
            if (r8 == r0) goto L3d
            r7 = r5
            r0 = r8
        L3d:
            android.view.View r7 = r11.getView(r6, r7, r10)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            if (r8 != 0) goto L50
            android.view.ViewGroup$LayoutParams r8 = new android.view.ViewGroup$LayoutParams
            r9 = -2
            r8.<init>(r9, r9)
            r7.setLayoutParams(r8)
        L50:
            r7.measure(r1, r2)
            int r8 = r7.getMeasuredWidth()
            int r3 = java.lang.Math.max(r3, r8)
            int r6 = r6 + 1
            goto L33
        L5e:
            if (r12 == 0) goto L6c
            android.graphics.Rect r10 = r10.g0
            r12.getPadding(r10)
            int r11 = r10.left
            int r10 = r10.right
            int r11 = r11 + r10
            int r11 = r11 + r3
            return r11
        L6c:
            return r3
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
            r0 = this;
            super.drawableStateChanged()
            z9 r0 = r0.A
            if (r0 == 0) goto La
            r0.a()
        La:
            return
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
            r1 = this;
            es r0 = r1.e0
            if (r0 == 0) goto L9
            int r1 = r0.b()
            return r1
        L9:
            int r1 = super.getDropDownHorizontalOffset()
            return r1
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
            r1 = this;
            es r0 = r1.e0
            if (r0 == 0) goto L9
            int r1 = r0.m()
            return r1
        L9:
            int r1 = super.getDropDownVerticalOffset()
            return r1
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
            r1 = this;
            es r0 = r1.e0
            if (r0 == 0) goto L7
            int r1 = r1.f0
            return r1
        L7:
            int r1 = super.getDropDownWidth()
            return r1
    }

    public final defpackage.es getInternalPopup() {
            r0 = this;
            es r0 = r0.e0
            return r0
    }

    @Override // android.widget.Spinner
    public android.graphics.drawable.Drawable getPopupBackground() {
            r1 = this;
            es r0 = r1.e0
            if (r0 == 0) goto L9
            android.graphics.drawable.Drawable r1 = r0.f()
            return r1
        L9:
            android.graphics.drawable.Drawable r1 = super.getPopupBackground()
            return r1
    }

    @Override // android.widget.Spinner
    public android.content.Context getPopupContext() {
            r0 = this;
            android.content.Context r0 = r0.B
            return r0
    }

    @Override // android.widget.Spinner
    public java.lang.CharSequence getPrompt() {
            r1 = this;
            es r0 = r1.e0
            if (r0 == 0) goto L9
            java.lang.CharSequence r1 = r0.d()
            return r1
        L9:
            java.lang.CharSequence r1 = super.getPrompt()
            return r1
    }

    public android.content.res.ColorStateList getSupportBackgroundTintList() {
            r0 = this;
            z9 r0 = r0.A
            if (r0 == 0) goto L9
            android.content.res.ColorStateList r0 = r0.h()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode() {
            r0 = this;
            z9 r0 = r0.A
            if (r0 == 0) goto L9
            android.graphics.PorterDuff$Mode r0 = r0.i()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
            r1 = this;
            super.onDetachedFromWindow()
            es r1 = r1.e0
            if (r1 == 0) goto L10
            boolean r0 = r1.a()
            if (r0 == 0) goto L10
            r1.dismiss()
        L10:
            return
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int r3, int r4) {
            r2 = this;
            super.onMeasure(r3, r4)
            es r4 = r2.e0
            if (r4 == 0) goto L32
            int r4 = android.view.View.MeasureSpec.getMode(r3)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r4 != r0) goto L32
            int r4 = r2.getMeasuredWidth()
            android.widget.SpinnerAdapter r0 = r2.getAdapter()
            android.graphics.drawable.Drawable r1 = r2.getBackground()
            int r0 = r2.a(r0, r1)
            int r4 = java.lang.Math.max(r4, r0)
            int r3 = android.view.View.MeasureSpec.getSize(r3)
            int r3 = java.lang.Math.min(r4, r3)
            int r4 = r2.getMeasuredHeight()
            r2.setMeasuredDimension(r3, r4)
        L32:
            return
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(android.os.Parcelable r3) {
            r2 = this;
            ds r3 = (defpackage.ds) r3
            android.os.Parcelable r0 = r3.getSuperState()
            super.onRestoreInstanceState(r0)
            boolean r3 = r3.A
            if (r3 == 0) goto L1c
            android.view.ViewTreeObserver r3 = r2.getViewTreeObserver()
            if (r3 == 0) goto L1c
            wr r0 = new wr
            r1 = 0
            r0.<init>(r2, r1)
            r3.addOnGlobalLayoutListener(r0)
        L1c:
            return
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final android.os.Parcelable onSaveInstanceState() {
            r2 = this;
            ds r0 = new ds
            android.os.Parcelable r1 = super.onSaveInstanceState()
            r0.<init>(r1)
            es r2 = r2.e0
            if (r2 == 0) goto L15
            boolean r2 = r2.a()
            if (r2 == 0) goto L15
            r2 = 1
            goto L16
        L15:
            r2 = 0
        L16:
            r0.A = r2
            return r0
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent r2) {
            r1 = this;
            vr r0 = r1.L
            if (r0 == 0) goto Lc
            boolean r0 = r0.onTouch(r1, r2)
            if (r0 == 0) goto Lc
            r1 = 1
            return r1
        Lc:
            boolean r1 = super.onTouchEvent(r2)
            return r1
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
            r2 = this;
            es r0 = r2.e0
            if (r0 == 0) goto L17
            boolean r1 = r0.a()
            if (r1 != 0) goto L15
            int r1 = r2.getTextDirection()
            int r2 = r2.getTextAlignment()
            r0.l(r1, r2)
        L15:
            r2 = 1
            return r2
        L17:
            boolean r2 = super.performClick()
            return r2
    }

    @Override // android.widget.AdapterView
    public /* bridge */ /* synthetic */ void setAdapter(android.widget.SpinnerAdapter r1) {
            r0 = this;
            android.widget.SpinnerAdapter r1 = (android.widget.SpinnerAdapter) r1
            r0.setAdapter2(r1)
            return
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner
    /* renamed from: setAdapter  reason: avoid collision after fix types in other method */
    public void setAdapter2(android.widget.SpinnerAdapter r4) {
            r3 = this;
            boolean r0 = r3.d0
            if (r0 != 0) goto L7
            r3.R = r4
            return
        L7:
            super.setAdapter(r4)
            es r0 = r3.e0
            if (r0 == 0) goto L38
            android.content.Context r1 = r3.B
            if (r1 != 0) goto L16
            android.content.Context r1 = r3.getContext()
        L16:
            zr r3 = new zr
            android.content.res.Resources$Theme r1 = r1.getTheme()
            r3.<init>()
            r3.A = r4
            boolean r2 = r4 instanceof android.widget.ListAdapter
            if (r2 == 0) goto L2a
            r2 = r4
            android.widget.ListAdapter r2 = (android.widget.ListAdapter) r2
            r3.B = r2
        L2a:
            if (r1 == 0) goto L35
            boolean r2 = r4 instanceof android.widget.ThemedSpinnerAdapter
            if (r2 == 0) goto L35
            android.widget.ThemedSpinnerAdapter r4 = (android.widget.ThemedSpinnerAdapter) r4
            defpackage.xr.a(r4, r1)
        L35:
            r0.n(r3)
        L38:
            return
    }

    @Override // android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            super.setBackgroundDrawable(r1)
            z9 r0 = r0.A
            if (r0 == 0) goto La
            r0.n()
        La:
            return
    }

    @Override // android.view.View
    public void setBackgroundResource(int r1) {
            r0 = this;
            super.setBackgroundResource(r1)
            z9 r0 = r0.A
            if (r0 == 0) goto La
            r0.o(r1)
        La:
            return
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int r2) {
            r1 = this;
            es r0 = r1.e0
            if (r0 == 0) goto Lb
            r0.k(r2)
            r0.c(r2)
            return
        Lb:
            super.setDropDownHorizontalOffset(r2)
            return
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int r2) {
            r1 = this;
            es r0 = r1.e0
            if (r0 == 0) goto L8
            r0.i(r2)
            return
        L8:
            super.setDropDownVerticalOffset(r2)
            return
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int r2) {
            r1 = this;
            es r0 = r1.e0
            if (r0 == 0) goto L7
            r1.f0 = r2
            return
        L7:
            super.setDropDownWidth(r2)
            return
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            es r0 = r1.e0
            if (r0 == 0) goto L8
            r0.h(r2)
            return
        L8:
            super.setPopupBackgroundDrawable(r2)
            return
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getPopupContext()
            android.graphics.drawable.Drawable r2 = defpackage.hf.S(r0, r2)
            r1.setPopupBackgroundDrawable(r2)
            return
    }

    @Override // android.widget.Spinner
    public void setPrompt(java.lang.CharSequence r2) {
            r1 = this;
            es r0 = r1.e0
            if (r0 == 0) goto L8
            r0.g(r2)
            return
        L8:
            super.setPrompt(r2)
            return
    }

    public void setSupportBackgroundTintList(android.content.res.ColorStateList r1) {
            r0 = this;
            z9 r0 = r0.A
            if (r0 == 0) goto L7
            r0.t(r1)
        L7:
            return
    }

    public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode r1) {
            r0 = this;
            z9 r0 = r0.A
            if (r0 == 0) goto L7
            r0.u(r1)
        L7:
            return
    }
}
