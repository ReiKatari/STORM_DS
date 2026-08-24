package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qs  reason: default package */
/* loaded from: classes.dex */
public class qs extends android.widget.TextView {
    public final defpackage.z9 A;
    public final defpackage.ms B;
    public final defpackage.u63 L;
    public defpackage.lr R;
    public boolean d0;
    public defpackage.os0 e0;
    public java.util.concurrent.Future f0;

    public qs(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 16842884(0x1010084, float:2.3693928E-38)
            r1.<init>(r2, r3, r0)
            return
    }

    public qs(android.content.Context r2, android.util.AttributeSet r3, int r4) {
            r1 = this;
            defpackage.h67.a(r2)
            r1.<init>(r2, r3, r4)
            r2 = 0
            r1.d0 = r2
            r2 = 0
            r1.e0 = r2
            android.content.Context r2 = r1.getContext()
            defpackage.h57.a(r1, r2)
            z9 r2 = new z9
            r2.<init>(r1)
            r1.A = r2
            r2.k(r3, r4)
            ms r2 = new ms
            r2.<init>(r1)
            r1.B = r2
            r2.f(r3, r4)
            r2.b()
            u63 r2 = new u63
            r0 = 10
            r2.<init>(r0)
            r2.B = r1
            r1.L = r2
            lr r1 = r1.getEmojiTextViewHelper()
            r1.b(r3, r4)
            return
    }

    public static /* synthetic */ void d(defpackage.qs r0, int r1) {
            super.setFirstBaselineToTopHeight(r1)
            return
    }

    public static /* synthetic */ void e(defpackage.qs r0, int r1) {
            super.setLastBaselineToBottomHeight(r1)
            return
    }

    public static /* synthetic */ void f(defpackage.qs r0, int r1, float r2) {
            super.setLineHeight(r1, r2)
            return
    }

    private defpackage.lr getEmojiTextViewHelper() {
            r1 = this;
            lr r0 = r1.R
            if (r0 != 0) goto Lb
            lr r0 = new lr
            r0.<init>(r1)
            r1.R = r0
        Lb:
            lr r1 = r1.R
            return r1
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
            r1 = this;
            super.drawableStateChanged()
            z9 r0 = r1.A
            if (r0 == 0) goto La
            r0.a()
        La:
            ms r1 = r1.B
            if (r1 == 0) goto L11
            r1.b()
        L11:
            return
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
            r1 = this;
            boolean r0 = defpackage.eq7.c
            if (r0 == 0) goto L13
            ns r1 = r1.getSuperCaller()
            os0 r1 = (defpackage.os0) r1
            java.lang.Object r1 = r1.B
            qs r1 = (defpackage.qs) r1
            int r1 = super.getAutoSizeMaxTextSize()
            return r1
        L13:
            ms r1 = r1.B
            if (r1 == 0) goto L20
            vs r1 = r1.i
            float r1 = r1.e
            int r1 = java.lang.Math.round(r1)
            return r1
        L20:
            r1 = -1
            return r1
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
            r1 = this;
            boolean r0 = defpackage.eq7.c
            if (r0 == 0) goto L13
            ns r1 = r1.getSuperCaller()
            os0 r1 = (defpackage.os0) r1
            java.lang.Object r1 = r1.B
            qs r1 = (defpackage.qs) r1
            int r1 = super.getAutoSizeMinTextSize()
            return r1
        L13:
            ms r1 = r1.B
            if (r1 == 0) goto L20
            vs r1 = r1.i
            float r1 = r1.d
            int r1 = java.lang.Math.round(r1)
            return r1
        L20:
            r1 = -1
            return r1
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
            r1 = this;
            boolean r0 = defpackage.eq7.c
            if (r0 == 0) goto L13
            ns r1 = r1.getSuperCaller()
            os0 r1 = (defpackage.os0) r1
            java.lang.Object r1 = r1.B
            qs r1 = (defpackage.qs) r1
            int r1 = super.getAutoSizeStepGranularity()
            return r1
        L13:
            ms r1 = r1.B
            if (r1 == 0) goto L20
            vs r1 = r1.i
            float r1 = r1.c
            int r1 = java.lang.Math.round(r1)
            return r1
        L20:
            r1 = -1
            return r1
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
            r1 = this;
            boolean r0 = defpackage.eq7.c
            if (r0 == 0) goto L13
            ns r1 = r1.getSuperCaller()
            os0 r1 = (defpackage.os0) r1
            java.lang.Object r1 = r1.B
            qs r1 = (defpackage.qs) r1
            int[] r1 = super.getAutoSizeTextAvailableSizes()
            return r1
        L13:
            ms r1 = r1.B
            if (r1 == 0) goto L1c
            vs r1 = r1.i
            int[] r1 = r1.f
            return r1
        L1c:
            r1 = 0
            int[] r1 = new int[r1]
            return r1
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
            r1 = this;
            boolean r0 = defpackage.eq7.c
            if (r0 == 0) goto L16
            ns r1 = r1.getSuperCaller()
            os0 r1 = (defpackage.os0) r1
            java.lang.Object r1 = r1.B
            qs r1 = (defpackage.qs) r1
            int r1 = super.getAutoSizeTextType()
            r0 = 1
            if (r1 != r0) goto L1f
            return r0
        L16:
            ms r1 = r1.B
            if (r1 == 0) goto L1f
            vs r1 = r1.i
            int r1 = r1.a
            return r1
        L1f:
            r1 = 0
            return r1
    }

    @Override // android.widget.TextView
    public android.view.ActionMode.Callback getCustomSelectionActionModeCallback() {
            r0 = this;
            android.view.ActionMode$Callback r0 = super.getCustomSelectionActionModeCallback()
            android.view.ActionMode$Callback r0 = defpackage.ii2.Z(r0)
            return r0
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
            r1 = this;
            int r0 = r1.getPaddingTop()
            android.text.TextPaint r1 = r1.getPaint()
            android.graphics.Paint$FontMetricsInt r1 = r1.getFontMetricsInt()
            int r1 = r1.top
            int r0 = r0 - r1
            return r0
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
            r1 = this;
            int r0 = r1.getPaddingBottom()
            android.text.TextPaint r1 = r1.getPaint()
            android.graphics.Paint$FontMetricsInt r1 = r1.getFontMetricsInt()
            int r1 = r1.bottom
            int r0 = r0 + r1
            return r0
    }

    public defpackage.ns getSuperCaller() {
            r2 = this;
            os0 r0 = r2.e0
            if (r0 != 0) goto L2b
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto L12
            ps r0 = new ps
            r0.<init>(r2)
            r2.e0 = r0
            goto L2b
        L12:
            r1 = 28
            if (r0 < r1) goto L1e
            os r0 = new os
            r0.<init>(r2)
            r2.e0 = r0
            goto L2b
        L1e:
            r1 = 26
            if (r0 < r1) goto L2b
            os0 r0 = new os0
            r1 = 13
            r0.<init>(r2, r1)
            r2.e0 = r0
        L2b:
            os0 r2 = r2.e0
            return r2
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

    public android.content.res.ColorStateList getSupportCompoundDrawablesTintList() {
            r0 = this;
            ms r0 = r0.B
            android.content.res.ColorStateList r0 = r0.d()
            return r0
    }

    public android.graphics.PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
            r0 = this;
            ms r0 = r0.B
            android.graphics.PorterDuff$Mode r0 = r0.e()
            return r0
    }

    @Override // android.widget.TextView
    public java.lang.CharSequence getText() {
            r3 = this;
            java.util.concurrent.Future r0 = r3.f0
            if (r0 != 0) goto L5
            goto L1f
        L5:
            r1 = 0
            r3.f0 = r1     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L1f
            if (r0 != 0) goto L19
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L1f
            r2 = 29
            if (r0 < r2) goto L15
            throw r1     // Catch: java.lang.Throwable -> L1f
        L15:
            defpackage.ii2.A(r3)     // Catch: java.lang.Throwable -> L1f
            throw r1     // Catch: java.lang.Throwable -> L1f
        L19:
            java.lang.ClassCastException r0 = new java.lang.ClassCastException     // Catch: java.lang.Throwable -> L1f
            r0.<init>()     // Catch: java.lang.Throwable -> L1f
            throw r0     // Catch: java.lang.Throwable -> L1f
        L1f:
            java.lang.CharSequence r3 = super.getText()
            return r3
    }

    @Override // android.widget.TextView
    public android.view.textclassifier.TextClassifier getTextClassifier() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 >= r1) goto L1a
            u63 r0 = r2.L
            if (r0 != 0) goto Lb
            goto L1a
        Lb:
            java.lang.Object r2 = r0.L
            android.view.textclassifier.TextClassifier r2 = (android.view.textclassifier.TextClassifier) r2
            if (r2 != 0) goto L19
            java.lang.Object r2 = r0.B
            android.widget.TextView r2 = (android.widget.TextView) r2
            android.view.textclassifier.TextClassifier r2 = defpackage.gs.a(r2)
        L19:
            return r2
        L1a:
            ns r2 = r2.getSuperCaller()
            os0 r2 = (defpackage.os0) r2
            java.lang.Object r2 = r2.B
            qs r2 = (defpackage.qs) r2
            android.view.textclassifier.TextClassifier r2 = super.getTextClassifier()
            return r2
    }

    public defpackage.p05 getTextMetricsParamsCompat() {
            r0 = this;
            p05 r0 = defpackage.ii2.A(r0)
            return r0
    }

    @Override // android.widget.TextView, android.view.View
    public final android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r4) {
            r3 = this;
            android.view.inputmethod.InputConnection r0 = super.onCreateInputConnection(r4)
            ms r1 = r3.B
            r1.getClass()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r1 >= r2) goto L18
            if (r0 == 0) goto L18
            java.lang.CharSequence r1 = r3.getText()
            defpackage.jw2.C(r4, r1)
        L18:
            defpackage.l.G(r4, r0, r3)
            return r0
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
            r2 = this;
            super.onDetachedFromWindow()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L22
            r1 = 33
            if (r0 >= r1) goto L22
            boolean r0 = r2.onCheckIsTextEditor()
            if (r0 == 0) goto L22
            android.content.Context r0 = r2.getContext()
            java.lang.String r1 = "input_method"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.inputmethod.InputMethodManager r0 = (android.view.inputmethod.InputMethodManager) r0
            r0.isActive(r2)
        L22:
            return
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            super.onLayout(r1, r2, r3, r4, r5)
            ms r0 = r0.B
            if (r0 == 0) goto L10
            boolean r1 = defpackage.eq7.c
            if (r1 != 0) goto L10
            vs r0 = r0.i
            r0.a()
        L10:
            return
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int r4, int r5) {
            r3 = this;
            java.util.concurrent.Future r0 = r3.f0
            if (r0 != 0) goto L5
            goto L1f
        L5:
            r1 = 0
            r3.f0 = r1     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L1f
            if (r0 != 0) goto L19
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L1f
            r2 = 29
            if (r0 < r2) goto L15
            throw r1     // Catch: java.lang.Throwable -> L1f
        L15:
            defpackage.ii2.A(r3)     // Catch: java.lang.Throwable -> L1f
            throw r1     // Catch: java.lang.Throwable -> L1f
        L19:
            java.lang.ClassCastException r0 = new java.lang.ClassCastException     // Catch: java.lang.Throwable -> L1f
            r0.<init>()     // Catch: java.lang.Throwable -> L1f
            throw r0     // Catch: java.lang.Throwable -> L1f
        L1f:
            super.onMeasure(r4, r5)
            return
    }

    @Override // android.widget.TextView
    public final void onTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
            r0 = this;
            super.onTextChanged(r1, r2, r3, r4)
            ms r0 = r0.B
            if (r0 == 0) goto L16
            vs r0 = r0.i
            boolean r1 = defpackage.eq7.c
            if (r1 != 0) goto L16
            boolean r1 = r0.f()
            if (r1 == 0) goto L16
            r0.a()
        L16:
            return
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean r1) {
            r0 = this;
            super.setAllCaps(r1)
            lr r0 = r0.getEmojiTextViewHelper()
            r0.c(r1)
            return
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int r2, int r3, int r4, int r5) {
            r1 = this;
            boolean r0 = defpackage.eq7.c
            if (r0 == 0) goto L12
            ns r1 = r1.getSuperCaller()
            os0 r1 = (defpackage.os0) r1
            java.lang.Object r1 = r1.B
            qs r1 = (defpackage.qs) r1
            super.setAutoSizeTextTypeUniformWithConfiguration(r2, r3, r4, r5)
            return
        L12:
            ms r1 = r1.B
            if (r1 == 0) goto L19
            r1.h(r2, r3, r4, r5)
        L19:
            return
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] r2, int r3) {
            r1 = this;
            boolean r0 = defpackage.eq7.c
            if (r0 == 0) goto L12
            ns r1 = r1.getSuperCaller()
            os0 r1 = (defpackage.os0) r1
            java.lang.Object r1 = r1.B
            qs r1 = (defpackage.qs) r1
            super.setAutoSizeTextTypeUniformWithPresetSizes(r2, r3)
            return
        L12:
            ms r1 = r1.B
            if (r1 == 0) goto L19
            r1.i(r2, r3)
        L19:
            return
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int r2) {
            r1 = this;
            boolean r0 = defpackage.eq7.c
            if (r0 == 0) goto L12
            ns r1 = r1.getSuperCaller()
            os0 r1 = (defpackage.os0) r1
            java.lang.Object r1 = r1.B
            qs r1 = (defpackage.qs) r1
            super.setAutoSizeTextTypeWithDefaults(r2)
            return
        L12:
            ms r1 = r1.B
            if (r1 == 0) goto L19
            r1.j(r2)
        L19:
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

    @Override // android.widget.TextView
    public final void setCompoundDrawables(android.graphics.drawable.Drawable r1, android.graphics.drawable.Drawable r2, android.graphics.drawable.Drawable r3, android.graphics.drawable.Drawable r4) {
            r0 = this;
            super.setCompoundDrawables(r1, r2, r3, r4)
            ms r0 = r0.B
            if (r0 == 0) goto La
            r0.b()
        La:
            return
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(android.graphics.drawable.Drawable r1, android.graphics.drawable.Drawable r2, android.graphics.drawable.Drawable r3, android.graphics.drawable.Drawable r4) {
            r0 = this;
            super.setCompoundDrawablesRelative(r1, r2, r3, r4)
            ms r0 = r0.B
            if (r0 == 0) goto La
            r0.b()
        La:
            return
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int r3, int r4, int r5, int r6) {
            r2 = this;
            android.content.Context r0 = r2.getContext()
            r1 = 0
            if (r3 == 0) goto Lc
            android.graphics.drawable.Drawable r3 = defpackage.hf.S(r0, r3)
            goto Ld
        Lc:
            r3 = r1
        Ld:
            if (r4 == 0) goto L14
            android.graphics.drawable.Drawable r4 = defpackage.hf.S(r0, r4)
            goto L15
        L14:
            r4 = r1
        L15:
            if (r5 == 0) goto L1c
            android.graphics.drawable.Drawable r5 = defpackage.hf.S(r0, r5)
            goto L1d
        L1c:
            r5 = r1
        L1d:
            if (r6 == 0) goto L23
            android.graphics.drawable.Drawable r1 = defpackage.hf.S(r0, r6)
        L23:
            r2.setCompoundDrawablesRelativeWithIntrinsicBounds(r3, r4, r5, r1)
            ms r2 = r2.B
            if (r2 == 0) goto L2d
            r2.b()
        L2d:
            return
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(android.graphics.drawable.Drawable r1, android.graphics.drawable.Drawable r2, android.graphics.drawable.Drawable r3, android.graphics.drawable.Drawable r4) {
            r0 = this;
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(r1, r2, r3, r4)
            ms r0 = r0.B
            if (r0 == 0) goto La
            r0.b()
        La:
            return
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int r3, int r4, int r5, int r6) {
            r2 = this;
            android.content.Context r0 = r2.getContext()
            r1 = 0
            if (r3 == 0) goto Lc
            android.graphics.drawable.Drawable r3 = defpackage.hf.S(r0, r3)
            goto Ld
        Lc:
            r3 = r1
        Ld:
            if (r4 == 0) goto L14
            android.graphics.drawable.Drawable r4 = defpackage.hf.S(r0, r4)
            goto L15
        L14:
            r4 = r1
        L15:
            if (r5 == 0) goto L1c
            android.graphics.drawable.Drawable r5 = defpackage.hf.S(r0, r5)
            goto L1d
        L1c:
            r5 = r1
        L1d:
            if (r6 == 0) goto L23
            android.graphics.drawable.Drawable r1 = defpackage.hf.S(r0, r6)
        L23:
            r2.setCompoundDrawablesWithIntrinsicBounds(r3, r4, r5, r1)
            ms r2 = r2.B
            if (r2 == 0) goto L2d
            r2.b()
        L2d:
            return
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(android.graphics.drawable.Drawable r1, android.graphics.drawable.Drawable r2, android.graphics.drawable.Drawable r3, android.graphics.drawable.Drawable r4) {
            r0 = this;
            super.setCompoundDrawablesWithIntrinsicBounds(r1, r2, r3, r4)
            ms r0 = r0.B
            if (r0 == 0) goto La
            r0.b()
        La:
            return
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(android.view.ActionMode.Callback r1) {
            r0 = this;
            android.view.ActionMode$Callback r1 = defpackage.ii2.c0(r1, r0)
            super.setCustomSelectionActionModeCallback(r1)
            return
    }

    public void setEmojiCompatEnabled(boolean r1) {
            r0 = this;
            lr r0 = r0.getEmojiTextViewHelper()
            r0.d(r1)
            return
    }

    @Override // android.widget.TextView
    public void setFilters(android.text.InputFilter[] r2) {
            r1 = this;
            lr r0 = r1.getEmojiTextViewHelper()
            android.text.InputFilter[] r2 = r0.a(r2)
            super.setFilters(r2)
            return
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Le
            ns r2 = r2.getSuperCaller()
            r2.I(r3)
            return
        Le:
            defpackage.ii2.O(r2, r3)
            return
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Le
            ns r2 = r2.getSuperCaller()
            r2.B(r3)
            return
        Le:
            defpackage.ii2.P(r2, r3)
            return
    }

    @Override // android.widget.TextView
    public void setLineHeight(int r1) {
            r0 = this;
            defpackage.ii2.Q(r0, r1)
            return
    }

    public final void setLineHeight(int r3, float r4) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Le
            ns r2 = r2.getSuperCaller()
            r2.L(r3, r4)
            return
        Le:
            if (r0 < r1) goto L14
            defpackage.c2.m(r2, r3, r4)
            return
        L14:
            android.content.res.Resources r0 = r2.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r3 = android.util.TypedValue.applyDimension(r3, r4, r0)
            int r3 = java.lang.Math.round(r3)
            defpackage.ii2.Q(r2, r3)
            return
    }

    public void setPrecomputedText(defpackage.q05 r3) {
            r2 = this;
            int r3 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            r1 = 0
            if (r3 < r0) goto L8
            throw r1
        L8:
            defpackage.ii2.A(r2)
            throw r1
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

    public void setSupportCompoundDrawablesTintList(android.content.res.ColorStateList r1) {
            r0 = this;
            ms r0 = r0.B
            r0.k(r1)
            r0.b()
            return
    }

    public void setSupportCompoundDrawablesTintMode(android.graphics.PorterDuff.Mode r1) {
            r0 = this;
            ms r0 = r0.B
            r0.l(r1)
            r0.b()
            return
    }

    @Override // android.widget.TextView
    public void setTextAppearance(android.content.Context r1, int r2) {
            r0 = this;
            super.setTextAppearance(r1, r2)
            ms r0 = r0.B
            if (r0 == 0) goto La
            r0.g(r1, r2)
        La:
            return
    }

    @Override // android.widget.TextView
    public void setTextClassifier(android.view.textclassifier.TextClassifier r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 >= r1) goto Le
            u63 r0 = r2.L
            if (r0 != 0) goto Lb
            goto Le
        Lb:
            r0.L = r3
            return
        Le:
            ns r2 = r2.getSuperCaller()
            os0 r2 = (defpackage.os0) r2
            java.lang.Object r2 = r2.B
            qs r2 = (defpackage.qs) r2
            super.setTextClassifier(r3)
            return
    }

    public void setTextFuture(java.util.concurrent.Future<defpackage.q05> r1) {
            r0 = this;
            r0.f0 = r1
            if (r1 == 0) goto L7
            r0.requestLayout()
        L7:
            return
    }

    public void setTextMetricsParamsCompat(defpackage.p05 r6) {
            r5 = this;
            android.text.TextDirectionHeuristic r0 = r6.b
            android.text.TextDirectionHeuristic r1 = android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL
            r2 = 1
            if (r0 != r1) goto L8
            goto L2c
        L8:
            android.text.TextDirectionHeuristic r3 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
            if (r0 != r3) goto Ld
            goto L2c
        Ld:
            android.text.TextDirectionHeuristic r4 = android.text.TextDirectionHeuristics.ANYRTL_LTR
            if (r0 != r4) goto L13
            r2 = 2
            goto L2c
        L13:
            android.text.TextDirectionHeuristic r4 = android.text.TextDirectionHeuristics.LTR
            if (r0 != r4) goto L19
            r2 = 3
            goto L2c
        L19:
            android.text.TextDirectionHeuristic r4 = android.text.TextDirectionHeuristics.RTL
            if (r0 != r4) goto L1f
            r2 = 4
            goto L2c
        L1f:
            android.text.TextDirectionHeuristic r4 = android.text.TextDirectionHeuristics.LOCALE
            if (r0 != r4) goto L25
            r2 = 5
            goto L2c
        L25:
            if (r0 != r3) goto L29
            r2 = 6
            goto L2c
        L29:
            if (r0 != r1) goto L2c
            r2 = 7
        L2c:
            r5.setTextDirection(r2)
            android.text.TextPaint r0 = r5.getPaint()
            android.text.TextPaint r1 = r6.a
            r0.set(r1)
            int r0 = r6.c
            r5.setBreakStrategy(r0)
            int r6 = r6.d
            r5.setHyphenationFrequency(r6)
            return
    }

    @Override // android.widget.TextView
    public final void setTextSize(int r2, float r3) {
            r1 = this;
            boolean r0 = defpackage.eq7.c
            if (r0 == 0) goto L8
            super.setTextSize(r2, r3)
            return
        L8:
            ms r1 = r1.B
            if (r1 == 0) goto L19
            vs r1 = r1.i
            if (r0 != 0) goto L19
            boolean r0 = r1.f()
            if (r0 != 0) goto L19
            r1.g(r2, r3)
        L19:
            return
    }

    @Override // android.widget.TextView
    public final void setTypeface(android.graphics.Typeface r3, int r4) {
            r2 = this;
            boolean r0 = r2.d0
            if (r0 == 0) goto L5
            return
        L5:
            if (r3 == 0) goto L1c
            if (r4 <= 0) goto L1c
            android.content.Context r0 = r2.getContext()
            bl2 r1 = defpackage.je7.a
            if (r0 == 0) goto L16
            android.graphics.Typeface r0 = android.graphics.Typeface.create(r3, r4)
            goto L1d
        L16:
            java.lang.String r2 = "Context cannot be null"
            defpackage.i.h(r2)
            return
        L1c:
            r0 = 0
        L1d:
            r1 = 1
            r2.d0 = r1
            if (r0 == 0) goto L23
            r3 = r0
        L23:
            r0 = 0
            super.setTypeface(r3, r4)     // Catch: java.lang.Throwable -> L2a
            r2.d0 = r0
            return
        L2a:
            r3 = move-exception
            r2.d0 = r0
            throw r3
    }
}
