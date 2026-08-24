package com.google.android.material.textfield;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class TextInputEditText extends defpackage.kr {
    public final android.graphics.Rect f0;
    public boolean g0;

    public TextInputEditText(android.content.Context r8, android.util.AttributeSet r9) {
            r7 = this;
            r3 = 2130969050(0x7f0401da, float:1.754677E38)
            r6 = 0
            android.content.Context r0 = defpackage.q60.e0(r8, r9, r3, r6)
            r7.<init>(r0, r9)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r7.f0 = r0
            int[] r5 = new int[r6]
            r4 = 2132018137(0x7f1403d9, float:1.9674572E38)
            defpackage.f04.r(r8, r9, r3, r4)
            int[] r2 = defpackage.a75.C
            r0 = r8
            r1 = r9
            defpackage.f04.s(r0, r1, r2, r3, r4, r5)
            android.content.res.TypedArray r8 = r0.obtainStyledAttributes(r1, r2, r3, r4)
            boolean r9 = r8.getBoolean(r6, r6)
            r7.setTextInputLayoutFocusedRectEnabled(r9)
            r8.recycle()
            return
    }

    private java.lang.CharSequence getHintFromLayout() {
            r0 = this;
            com.google.android.material.textfield.TextInputLayout r0 = r0.getTextInputLayout()
            if (r0 == 0) goto Lb
            java.lang.CharSequence r0 = r0.getHint()
            return r0
        Lb:
            r0 = 0
            return r0
    }

    private com.google.android.material.textfield.TextInputLayout getTextInputLayout() {
            r1 = this;
            android.view.ViewParent r1 = r1.getParent()
        L4:
            boolean r0 = r1 instanceof android.view.View
            if (r0 == 0) goto L14
            boolean r0 = r1 instanceof com.google.android.material.textfield.TextInputLayout
            if (r0 == 0) goto Lf
            com.google.android.material.textfield.TextInputLayout r1 = (com.google.android.material.textfield.TextInputLayout) r1
            return r1
        Lf:
            android.view.ViewParent r1 = r1.getParent()
            goto L4
        L14:
            r1 = 0
            return r1
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(android.graphics.Rect r3) {
            r2 = this;
            super.getFocusedRect(r3)
            com.google.android.material.textfield.TextInputLayout r0 = r2.getTextInputLayout()
            if (r0 == 0) goto L18
            boolean r1 = r2.g0
            if (r1 == 0) goto L18
            if (r3 == 0) goto L18
            android.graphics.Rect r2 = r2.f0
            r0.getFocusedRect(r2)
            int r2 = r2.bottom
            r3.bottom = r2
        L18:
            return
    }

    @Override // android.view.View
    public final boolean getGlobalVisibleRect(android.graphics.Rect r3, android.graphics.Point r4) {
            r2 = this;
            com.google.android.material.textfield.TextInputLayout r0 = r2.getTextInputLayout()
            if (r0 == 0) goto L20
            boolean r1 = r2.g0
            if (r1 == 0) goto L20
            boolean r3 = r0.getGlobalVisibleRect(r3, r4)
            if (r3 == 0) goto L1f
            if (r4 == 0) goto L1f
            int r0 = r2.getScrollX()
            int r0 = -r0
            int r2 = r2.getScrollY()
            int r2 = -r2
            r4.offset(r0, r2)
        L1f:
            return r3
        L20:
            boolean r2 = super.getGlobalVisibleRect(r3, r4)
            return r2
    }

    @Override // android.widget.TextView
    public java.lang.CharSequence getHint() {
            r2 = this;
            com.google.android.material.textfield.TextInputLayout r0 = r2.getTextInputLayout()
            if (r0 == 0) goto Lf
            boolean r1 = r0.E0
            if (r1 == 0) goto Lf
            java.lang.CharSequence r2 = r0.getHint()
            return r2
        Lf:
            java.lang.CharSequence r2 = super.getHint()
            return r2
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
            r3 = this;
            super.onAttachedToWindow()
            com.google.android.material.textfield.TextInputLayout r0 = r3.getTextInputLayout()
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

    @Override // defpackage.kr, android.widget.TextView, android.view.View
    public final android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r3) {
            r2 = this;
            android.view.inputmethod.InputConnection r0 = super.onCreateInputConnection(r3)
            if (r0 == 0) goto L10
            java.lang.CharSequence r1 = r3.hintText
            if (r1 != 0) goto L10
            java.lang.CharSequence r2 = r2.getHintFromLayout()
            r3.hintText = r2
        L10:
            return r0
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r1) {
            r0 = this;
            super.onInitializeAccessibilityNodeInfo(r1)
            r0.getTextInputLayout()
            return
    }

    @Override // android.view.View
    public final boolean requestRectangleOnScreen(android.graphics.Rect r5) {
            r4 = this;
            com.google.android.material.textfield.TextInputLayout r0 = r4.getTextInputLayout()
            if (r0 == 0) goto L28
            boolean r1 = r4.g0
            if (r1 == 0) goto L28
            if (r5 == 0) goto L28
            int r0 = r0.getHeight()
            int r1 = r4.getHeight()
            int r0 = r0 - r1
            int r1 = r5.left
            int r2 = r5.top
            int r3 = r5.right
            int r5 = r5.bottom
            int r5 = r5 + r0
            android.graphics.Rect r0 = r4.f0
            r0.set(r1, r2, r3, r5)
            boolean r4 = super.requestRectangleOnScreen(r0)
            return r4
        L28:
            boolean r4 = super.requestRectangleOnScreen(r5)
            return r4
    }

    public void setTextInputLayoutFocusedRectEnabled(boolean r1) {
            r0 = this;
            r0.g0 = r1
            return
    }
}
