package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: bq  reason: default package */
/* loaded from: classes.dex */
public class bq extends CheckBox implements st6 {
    public final dq A;
    public final y9 B;
    public final zr L;
    public yq R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bq(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        qt6.a(context);
        qs6.a(this, getContext());
        dq dqVar = new dq(this);
        this.A = dqVar;
        dqVar.d(attributeSet, i);
        y9 y9Var = new y9(this);
        this.B = y9Var;
        y9Var.k(attributeSet, i);
        zr zrVar = new zr(this);
        this.L = zrVar;
        zrVar.f(attributeSet, i);
        getEmojiTextViewHelper().b(attributeSet, i);
    }

    private yq getEmojiTextViewHelper() {
        if (this.R == null) {
            this.R = new yq(this);
        }
        return this.R;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        y9 y9Var = this.B;
        if (y9Var != null) {
            y9Var.a();
        }
        zr zrVar = this.L;
        if (zrVar != null) {
            zrVar.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        y9 y9Var = this.B;
        if (y9Var != null) {
            return y9Var.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        y9 y9Var = this.B;
        if (y9Var != null) {
            return y9Var.i();
        }
        return null;
    }

    @Override // defpackage.st6
    public ColorStateList getSupportButtonTintList() {
        dq dqVar = this.A;
        if (dqVar != null) {
            return (ColorStateList) dqVar.a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        dq dqVar = this.A;
        if (dqVar != null) {
            return (PorterDuff.Mode) dqVar.b;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.L.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.L.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        y9 y9Var = this.B;
        if (y9Var != null) {
            y9Var.n();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        y9 y9Var = this.B;
        if (y9Var != null) {
            y9Var.o(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        dq dqVar = this.A;
        if (dqVar != null) {
            if (dqVar.e) {
                dqVar.e = false;
                return;
            }
            dqVar.e = true;
            dqVar.a();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        zr zrVar = this.L;
        if (zrVar != null) {
            zrVar.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        zr zrVar = this.L;
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
        y9 y9Var = this.B;
        if (y9Var != null) {
            y9Var.t(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        y9 y9Var = this.B;
        if (y9Var != null) {
            y9Var.u(mode);
        }
    }

    @Override // defpackage.st6
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        dq dqVar = this.A;
        if (dqVar != null) {
            dqVar.a = colorStateList;
            dqVar.c = true;
            dqVar.a();
        }
    }

    @Override // defpackage.st6
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        dq dqVar = this.A;
        if (dqVar != null) {
            dqVar.b = mode;
            dqVar.d = true;
            dqVar.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        zr zrVar = this.L;
        zrVar.k(colorStateList);
        zrVar.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        zr zrVar = this.L;
        zrVar.l(mode);
        zrVar.b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(l07.M(getContext(), i));
    }
}
