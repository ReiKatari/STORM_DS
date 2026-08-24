package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lq  reason: default package */
/* loaded from: classes.dex */
public class lq extends android.widget.Button {
    public final defpackage.z9 A;
    public final defpackage.ms B;
    public defpackage.lr L;

    public lq(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            defpackage.h67.a(r1)
            r0.<init>(r1, r2, r3)
            android.content.Context r1 = r0.getContext()
            defpackage.h57.a(r0, r1)
            z9 r1 = new z9
            r1.<init>(r0)
            r0.A = r1
            r1.k(r2, r3)
            ms r1 = new ms
            r1.<init>(r0)
            r0.B = r1
            r1.f(r2, r3)
            r1.b()
            lr r0 = r0.getEmojiTextViewHelper()
            r0.b(r2, r3)
            return
    }

    private defpackage.lr getEmojiTextViewHelper() {
            r1 = this;
            lr r0 = r1.L
            if (r0 != 0) goto Lb
            lr r0 = new lr
            r0.<init>(r1)
            r1.L = r0
        Lb:
            lr r1 = r1.L
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
            if (r0 == 0) goto L9
            int r1 = super.getAutoSizeMaxTextSize()
            return r1
        L9:
            ms r1 = r1.B
            if (r1 == 0) goto L16
            vs r1 = r1.i
            float r1 = r1.e
            int r1 = java.lang.Math.round(r1)
            return r1
        L16:
            r1 = -1
            return r1
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
            r1 = this;
            boolean r0 = defpackage.eq7.c
            if (r0 == 0) goto L9
            int r1 = super.getAutoSizeMinTextSize()
            return r1
        L9:
            ms r1 = r1.B
            if (r1 == 0) goto L16
            vs r1 = r1.i
            float r1 = r1.d
            int r1 = java.lang.Math.round(r1)
            return r1
        L16:
            r1 = -1
            return r1
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
            r1 = this;
            boolean r0 = defpackage.eq7.c
            if (r0 == 0) goto L9
            int r1 = super.getAutoSizeStepGranularity()
            return r1
        L9:
            ms r1 = r1.B
            if (r1 == 0) goto L16
            vs r1 = r1.i
            float r1 = r1.c
            int r1 = java.lang.Math.round(r1)
            return r1
        L16:
            r1 = -1
            return r1
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
            r1 = this;
            boolean r0 = defpackage.eq7.c
            if (r0 == 0) goto L9
            int[] r1 = super.getAutoSizeTextAvailableSizes()
            return r1
        L9:
            ms r1 = r1.B
            if (r1 == 0) goto L12
            vs r1 = r1.i
            int[] r1 = r1.f
            return r1
        L12:
            r1 = 0
            int[] r1 = new int[r1]
            return r1
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
            r2 = this;
            boolean r0 = defpackage.eq7.c
            r1 = 0
            if (r0 == 0) goto Le
            int r2 = super.getAutoSizeTextType()
            r0 = 1
            if (r2 != r0) goto Ld
            return r0
        Ld:
            return r1
        Le:
            ms r2 = r2.B
            if (r2 == 0) goto L17
            vs r2 = r2.i
            int r2 = r2.a
            return r2
        L17:
            return r1
    }

    @Override // android.widget.TextView
    public android.view.ActionMode.Callback getCustomSelectionActionModeCallback() {
            r0 = this;
            android.view.ActionMode$Callback r0 = super.getCustomSelectionActionModeCallback()
            android.view.ActionMode$Callback r0 = defpackage.ii2.Z(r0)
            return r0
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

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent r1) {
            r0 = this;
            super.onInitializeAccessibilityEvent(r1)
            java.lang.Class<android.widget.Button> r0 = android.widget.Button.class
            java.lang.String r0 = r0.getName()
            r1.setClassName(r0)
            return
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r1) {
            r0 = this;
            super.onInitializeAccessibilityNodeInfo(r1)
            java.lang.Class<android.widget.Button> r0 = android.widget.Button.class
            java.lang.String r0 = r0.getName()
            r1.setClassName(r0)
            return
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
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

    @Override // android.widget.TextView
    public void onTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
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
            if (r0 == 0) goto L8
            super.setAutoSizeTextTypeUniformWithConfiguration(r2, r3, r4, r5)
            return
        L8:
            ms r1 = r1.B
            if (r1 == 0) goto Lf
            r1.h(r2, r3, r4, r5)
        Lf:
            return
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] r2, int r3) {
            r1 = this;
            boolean r0 = defpackage.eq7.c
            if (r0 == 0) goto L8
            super.setAutoSizeTextTypeUniformWithPresetSizes(r2, r3)
            return
        L8:
            ms r1 = r1.B
            if (r1 == 0) goto Lf
            r1.i(r2, r3)
        Lf:
            return
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int r2) {
            r1 = this;
            boolean r0 = defpackage.eq7.c
            if (r0 == 0) goto L8
            super.setAutoSizeTextTypeWithDefaults(r2)
            return
        L8:
            ms r1 = r1.B
            if (r1 == 0) goto Lf
            r1.j(r2)
        Lf:
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

    public void setSupportAllCaps(boolean r1) {
            r0 = this;
            ms r0 = r0.B
            if (r0 == 0) goto L9
            android.widget.TextView r0 = r0.a
            r0.setAllCaps(r1)
        L9:
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
    public final void setTextAppearance(android.content.Context r1, int r2) {
            r0 = this;
            super.setTextAppearance(r1, r2)
            ms r0 = r0.B
            if (r0 == 0) goto La
            r0.g(r1, r2)
        La:
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
}
