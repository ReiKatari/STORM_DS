package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: oq  reason: default package */
/* loaded from: classes.dex */
public final class oq extends android.widget.CheckedTextView {
    public final defpackage.pq A;
    public final defpackage.z9 B;
    public final defpackage.ms L;
    public defpackage.lr R;

    public oq(android.content.Context r8, android.util.AttributeSet r9) {
            r7 = this;
            defpackage.h67.a(r8)
            r5 = 2130968781(0x7f0400cd, float:1.7546225E38)
            r7.<init>(r8, r9, r5)
            android.content.Context r8 = r7.getContext()
            defpackage.h57.a(r7, r8)
            ms r8 = new ms
            r8.<init>(r7)
            r7.L = r8
            r8.f(r9, r5)
            r8.b()
            z9 r8 = new z9
            r8.<init>(r7)
            r7.B = r8
            r8.k(r9, r5)
            pq r8 = new pq
            r8.<init>(r7)
            r7.A = r8
            android.content.Context r8 = r7.getContext()
            int[] r2 = defpackage.m75.l
            m44 r8 = defpackage.m44.A(r8, r9, r2, r5)
            java.lang.Object r0 = r8.L
            r6 = r0
            android.content.res.TypedArray r6 = (android.content.res.TypedArray) r6
            android.content.Context r1 = r7.getContext()
            java.lang.Object r0 = r8.L
            r4 = r0
            android.content.res.TypedArray r4 = (android.content.res.TypedArray) r4
            r0 = r7
            r3 = r9
            defpackage.ao7.m(r0, r1, r2, r3, r4, r5)
            r7 = 1
            boolean r9 = r6.hasValue(r7)     // Catch: java.lang.Throwable -> L65
            r1 = 0
            if (r9 == 0) goto L68
            int r7 = r6.getResourceId(r7, r1)     // Catch: java.lang.Throwable -> L65
            if (r7 == 0) goto L68
            android.content.Context r9 = r0.getContext()     // Catch: java.lang.Throwable -> L65 android.content.res.Resources.NotFoundException -> L68
            android.graphics.drawable.Drawable r7 = defpackage.hf.S(r9, r7)     // Catch: java.lang.Throwable -> L65 android.content.res.Resources.NotFoundException -> L68
            r0.setCheckMarkDrawable(r7)     // Catch: java.lang.Throwable -> L65 android.content.res.Resources.NotFoundException -> L68
            goto L7f
        L65:
            r0 = move-exception
            r7 = r0
            goto Lac
        L68:
            boolean r7 = r6.hasValue(r1)     // Catch: java.lang.Throwable -> L65
            if (r7 == 0) goto L7f
            int r7 = r6.getResourceId(r1, r1)     // Catch: java.lang.Throwable -> L65
            if (r7 == 0) goto L7f
            android.content.Context r9 = r0.getContext()     // Catch: java.lang.Throwable -> L65
            android.graphics.drawable.Drawable r7 = defpackage.hf.S(r9, r7)     // Catch: java.lang.Throwable -> L65
            r0.setCheckMarkDrawable(r7)     // Catch: java.lang.Throwable -> L65
        L7f:
            r7 = 2
            boolean r9 = r6.hasValue(r7)     // Catch: java.lang.Throwable -> L65
            if (r9 == 0) goto L8d
            android.content.res.ColorStateList r7 = r8.g(r7)     // Catch: java.lang.Throwable -> L65
            r0.setCheckMarkTintList(r7)     // Catch: java.lang.Throwable -> L65
        L8d:
            r7 = 3
            boolean r9 = r6.hasValue(r7)     // Catch: java.lang.Throwable -> L65
            if (r9 == 0) goto La1
            r9 = -1
            int r7 = r6.getInt(r7, r9)     // Catch: java.lang.Throwable -> L65
            r9 = 0
            android.graphics.PorterDuff$Mode r7 = defpackage.bp1.c(r7, r9)     // Catch: java.lang.Throwable -> L65
            r0.setCheckMarkTintMode(r7)     // Catch: java.lang.Throwable -> L65
        La1:
            r8.D()
            lr r7 = r0.getEmojiTextViewHelper()
            r7.b(r3, r5)
            return
        Lac:
            r8.D()
            throw r7
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

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
            r1 = this;
            super.drawableStateChanged()
            ms r0 = r1.L
            if (r0 == 0) goto La
            r0.b()
        La:
            z9 r0 = r1.B
            if (r0 == 0) goto L11
            r0.a()
        L11:
            pq r1 = r1.A
            if (r1 == 0) goto L18
            r1.b()
        L18:
            return
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
            z9 r0 = r0.B
            if (r0 == 0) goto L9
            android.content.res.ColorStateList r0 = r0.h()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode() {
            r0 = this;
            z9 r0 = r0.B
            if (r0 == 0) goto L9
            android.graphics.PorterDuff$Mode r0 = r0.i()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public android.content.res.ColorStateList getSupportCheckMarkTintList() {
            r0 = this;
            pq r0 = r0.A
            if (r0 == 0) goto L9
            java.lang.Object r0 = r0.a
            android.content.res.ColorStateList r0 = (android.content.res.ColorStateList) r0
            return r0
        L9:
            r0 = 0
            return r0
    }

    public android.graphics.PorterDuff.Mode getSupportCheckMarkTintMode() {
            r0 = this;
            pq r0 = r0.A
            if (r0 == 0) goto L9
            java.lang.Object r0 = r0.b
            android.graphics.PorterDuff$Mode r0 = (android.graphics.PorterDuff.Mode) r0
            return r0
        L9:
            r0 = 0
            return r0
    }

    public android.content.res.ColorStateList getSupportCompoundDrawablesTintList() {
            r0 = this;
            ms r0 = r0.L
            android.content.res.ColorStateList r0 = r0.d()
            return r0
    }

    public android.graphics.PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
            r0 = this;
            ms r0 = r0.L
            android.graphics.PorterDuff$Mode r0 = r0.e()
            return r0
    }

    @Override // android.widget.TextView, android.view.View
    public final android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r2) {
            r1 = this;
            android.view.inputmethod.InputConnection r0 = super.onCreateInputConnection(r2)
            defpackage.l.G(r2, r0, r1)
            return r0
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean r1) {
            r0 = this;
            super.setAllCaps(r1)
            lr r0 = r0.getEmojiTextViewHelper()
            r0.c(r1)
            return
    }

    @Override // android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            super.setBackgroundDrawable(r1)
            z9 r0 = r0.B
            if (r0 == 0) goto La
            r0.n()
        La:
            return
    }

    @Override // android.view.View
    public void setBackgroundResource(int r1) {
            r0 = this;
            super.setBackgroundResource(r1)
            z9 r0 = r0.B
            if (r0 == 0) goto La
            r0.o(r1)
        La:
            return
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = defpackage.hf.S(r0, r2)
            r1.setCheckMarkDrawable(r2)
            return
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            super.setCheckMarkDrawable(r1)
            pq r0 = r0.A
            if (r0 == 0) goto L15
            boolean r1 = r0.e
            if (r1 == 0) goto Lf
            r1 = 0
            r0.e = r1
            return
        Lf:
            r1 = 1
            r0.e = r1
            r0.b()
        L15:
            return
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(android.graphics.drawable.Drawable r1, android.graphics.drawable.Drawable r2, android.graphics.drawable.Drawable r3, android.graphics.drawable.Drawable r4) {
            r0 = this;
            super.setCompoundDrawables(r1, r2, r3, r4)
            ms r0 = r0.L
            if (r0 == 0) goto La
            r0.b()
        La:
            return
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(android.graphics.drawable.Drawable r1, android.graphics.drawable.Drawable r2, android.graphics.drawable.Drawable r3, android.graphics.drawable.Drawable r4) {
            r0 = this;
            super.setCompoundDrawablesRelative(r1, r2, r3, r4)
            ms r0 = r0.L
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

    public void setSupportBackgroundTintList(android.content.res.ColorStateList r1) {
            r0 = this;
            z9 r0 = r0.B
            if (r0 == 0) goto L7
            r0.t(r1)
        L7:
            return
    }

    public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode r1) {
            r0 = this;
            z9 r0 = r0.B
            if (r0 == 0) goto L7
            r0.u(r1)
        L7:
            return
    }

    public void setSupportCheckMarkTintList(android.content.res.ColorStateList r1) {
            r0 = this;
            pq r0 = r0.A
            if (r0 == 0) goto Lc
            r0.a = r1
            r1 = 1
            r0.c = r1
            r0.b()
        Lc:
            return
    }

    public void setSupportCheckMarkTintMode(android.graphics.PorterDuff.Mode r1) {
            r0 = this;
            pq r0 = r0.A
            if (r0 == 0) goto Lc
            r0.b = r1
            r1 = 1
            r0.d = r1
            r0.b()
        Lc:
            return
    }

    public void setSupportCompoundDrawablesTintList(android.content.res.ColorStateList r1) {
            r0 = this;
            ms r0 = r0.L
            r0.k(r1)
            r0.b()
            return
    }

    public void setSupportCompoundDrawablesTintMode(android.graphics.PorterDuff.Mode r1) {
            r0 = this;
            ms r0 = r0.L
            r0.l(r1)
            r0.b()
            return
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(android.content.Context r1, int r2) {
            r0 = this;
            super.setTextAppearance(r1, r2)
            ms r0 = r0.L
            if (r0 == 0) goto La
            r0.g(r1, r2)
        La:
            return
    }
}
