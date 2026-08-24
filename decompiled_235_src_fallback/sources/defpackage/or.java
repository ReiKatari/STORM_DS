package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: or  reason: default package */
/* loaded from: classes.dex */
public final class or extends android.widget.MultiAutoCompleteTextView {
    public static final int[] R = null;
    public final defpackage.z9 A;
    public final defpackage.ms B;
    public final defpackage.u63 L;

    static {
            r0 = 16843126(0x1010176, float:2.3694606E-38)
            int[] r0 = new int[]{r0}
            defpackage.or.R = r0
            return
    }

    public or(android.content.Context r5, android.util.AttributeSet r6) {
            r4 = this;
            defpackage.h67.a(r5)
            r0 = 2130968648(0x7f040048, float:1.7545956E38)
            r4.<init>(r5, r6, r0)
            android.content.Context r5 = r4.getContext()
            defpackage.h57.a(r4, r5)
            android.content.Context r5 = r4.getContext()
            int[] r1 = defpackage.or.R
            m44 r5 = defpackage.m44.A(r5, r6, r1, r0)
            java.lang.Object r1 = r5.L
            android.content.res.TypedArray r1 = (android.content.res.TypedArray) r1
            r2 = 0
            boolean r1 = r1.hasValue(r2)
            if (r1 == 0) goto L2c
            android.graphics.drawable.Drawable r1 = r5.k(r2)
            r4.setDropDownBackgroundDrawable(r1)
        L2c:
            r5.D()
            z9 r5 = new z9
            r5.<init>(r4)
            r4.A = r5
            r5.k(r6, r0)
            ms r5 = new ms
            r5.<init>(r4)
            r4.B = r5
            r5.f(r6, r0)
            r5.b()
            u63 r5 = new u63
            r5.<init>(r4)
            r4.L = r5
            r5.r(r6, r0)
            android.text.method.KeyListener r6 = r4.getKeyListener()
            boolean r0 = r6 instanceof android.text.method.NumberKeyListener
            if (r0 != 0) goto L7e
            boolean r0 = r4.isFocusable()
            boolean r1 = r4.isClickable()
            boolean r2 = r4.isLongClickable()
            int r3 = r4.getInputType()
            android.text.method.KeyListener r5 = r5.o(r6)
            if (r5 != r6) goto L6f
            goto L7e
        L6f:
            super.setKeyListener(r5)
            r4.setRawInputType(r3)
            r4.setFocusable(r0)
            r4.setClickable(r1)
            r4.setLongClickable(r2)
        L7e:
            return
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

    @Override // android.widget.TextView, android.view.View
    public final android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r2) {
            r1 = this;
            android.view.inputmethod.InputConnection r0 = super.onCreateInputConnection(r2)
            defpackage.l.G(r2, r0, r1)
            u63 r1 = r1.L
            ct1 r1 = r1.w(r0, r2)
            return r1
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

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = defpackage.hf.S(r0, r2)
            r1.setDropDownBackgroundDrawable(r2)
            return
    }

    public void setEmojiCompatEnabled(boolean r1) {
            r0 = this;
            u63 r0 = r0.L
            r0.F(r1)
            return
    }

    @Override // android.widget.TextView
    public void setKeyListener(android.text.method.KeyListener r2) {
            r1 = this;
            u63 r0 = r1.L
            android.text.method.KeyListener r2 = r0.o(r2)
            super.setKeyListener(r2)
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
}
