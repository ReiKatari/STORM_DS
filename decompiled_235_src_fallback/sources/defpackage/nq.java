package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nq  reason: default package */
/* loaded from: classes.dex */
public class nq extends android.widget.CheckBox implements defpackage.j67 {
    public final defpackage.pq A;
    public final defpackage.z9 B;
    public final defpackage.ms L;
    public defpackage.lr R;

    public nq(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            defpackage.h67.a(r1)
            r0.<init>(r1, r2, r3)
            android.content.Context r1 = r0.getContext()
            defpackage.h57.a(r0, r1)
            pq r1 = new pq
            r1.<init>(r0)
            r0.A = r1
            r1.d(r2, r3)
            z9 r1 = new z9
            r1.<init>(r0)
            r0.B = r1
            r1.k(r2, r3)
            ms r1 = new ms
            r1.<init>(r0)
            r0.L = r1
            r1.f(r2, r3)
            lr r0 = r0.getEmojiTextViewHelper()
            r0.b(r2, r3)
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

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
            r1 = this;
            super.drawableStateChanged()
            z9 r0 = r1.B
            if (r0 == 0) goto La
            r0.a()
        La:
            ms r1 = r1.L
            if (r1 == 0) goto L11
            r1.b()
        L11:
            return
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

    @Override // defpackage.j67
    public android.content.res.ColorStateList getSupportButtonTintList() {
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

    public android.graphics.PorterDuff.Mode getSupportButtonTintMode() {
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

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = defpackage.hf.S(r0, r2)
            r1.setButtonDrawable(r2)
            return
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            super.setButtonDrawable(r1)
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
            r0.a()
        L15:
            return
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(android.graphics.drawable.Drawable r1, android.graphics.drawable.Drawable r2, android.graphics.drawable.Drawable r3, android.graphics.drawable.Drawable r4) {
            r0 = this;
            super.setCompoundDrawables(r1, r2, r3, r4)
            ms r0 = r0.L
            if (r0 == 0) goto La
            r0.b()
        La:
            return
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(android.graphics.drawable.Drawable r1, android.graphics.drawable.Drawable r2, android.graphics.drawable.Drawable r3, android.graphics.drawable.Drawable r4) {
            r0 = this;
            super.setCompoundDrawablesRelative(r1, r2, r3, r4)
            ms r0 = r0.L
            if (r0 == 0) goto La
            r0.b()
        La:
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

    @Override // defpackage.j67
    public void setSupportButtonTintList(android.content.res.ColorStateList r1) {
            r0 = this;
            pq r0 = r0.A
            if (r0 == 0) goto Lc
            r0.a = r1
            r1 = 1
            r0.c = r1
            r0.a()
        Lc:
            return
    }

    @Override // defpackage.j67
    public void setSupportButtonTintMode(android.graphics.PorterDuff.Mode r1) {
            r0 = this;
            pq r0 = r0.A
            if (r0 == 0) goto Lc
            r0.b = r1
            r1 = 1
            r0.d = r1
            r0.a()
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
}
