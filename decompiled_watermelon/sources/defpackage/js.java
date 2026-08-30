package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: js  reason: default package */
/* loaded from: classes.dex */
public final class js extends ToggleButton {
    public final y9 A;
    public final zr B;
    public yq L;

    public js(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 16842827);
        qs6.a(this, getContext());
        y9 y9Var = new y9(this);
        this.A = y9Var;
        y9Var.k(attributeSet, 16842827);
        zr zrVar = new zr(this);
        this.B = zrVar;
        zrVar.f(attributeSet, 16842827);
        getEmojiTextViewHelper().b(attributeSet, 16842827);
    }

    private yq getEmojiTextViewHelper() {
        if (this.L == null) {
            this.L = new yq(this);
        }
        return this.L;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        y9 y9Var = this.A;
        if (y9Var != null) {
            y9Var.a();
        }
        zr zrVar = this.B;
        if (zrVar != null) {
            zrVar.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        y9 y9Var = this.A;
        if (y9Var != null) {
            return y9Var.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        y9 y9Var = this.A;
        if (y9Var != null) {
            return y9Var.i();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.B.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.B.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        y9 y9Var = this.A;
        if (y9Var != null) {
            y9Var.n();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        y9 y9Var = this.A;
        if (y9Var != null) {
            y9Var.o(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        zr zrVar = this.B;
        if (zrVar != null) {
            zrVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        zr zrVar = this.B;
        if (zrVar != null) {
            zrVar.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().d(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        y9 y9Var = this.A;
        if (y9Var != null) {
            y9Var.t(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        y9 y9Var = this.A;
        if (y9Var != null) {
            y9Var.u(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        zr zrVar = this.B;
        zrVar.k(colorStateList);
        zrVar.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        zr zrVar = this.B;
        zrVar.l(mode);
        zrVar.b();
    }
}
