package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import com.stormds.emulator.R;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qr  reason: default package */
/* loaded from: classes.dex */
public class qr extends RadioButton implements j67 {
    public final pq A;
    public final z9 B;
    public final ms L;
    public lr R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qr(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.radioButtonStyle);
        h67.a(context);
        h57.a(this, getContext());
        pq pqVar = new pq(this);
        this.A = pqVar;
        pqVar.d(attributeSet, R.attr.radioButtonStyle);
        z9 z9Var = new z9(this);
        this.B = z9Var;
        z9Var.k(attributeSet, R.attr.radioButtonStyle);
        ms msVar = new ms(this);
        this.L = msVar;
        msVar.f(attributeSet, R.attr.radioButtonStyle);
        getEmojiTextViewHelper().b(attributeSet, R.attr.radioButtonStyle);
    }

    private lr getEmojiTextViewHelper() {
        if (this.R == null) {
            this.R = new lr(this);
        }
        return this.R;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        z9 z9Var = this.B;
        if (z9Var != null) {
            z9Var.a();
        }
        ms msVar = this.L;
        if (msVar != null) {
            msVar.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        z9 z9Var = this.B;
        if (z9Var != null) {
            return z9Var.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        z9 z9Var = this.B;
        if (z9Var != null) {
            return z9Var.i();
        }
        return null;
    }

    @Override // defpackage.j67
    public ColorStateList getSupportButtonTintList() {
        pq pqVar = this.A;
        if (pqVar != null) {
            return (ColorStateList) pqVar.a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        pq pqVar = this.A;
        if (pqVar != null) {
            return (PorterDuff.Mode) pqVar.b;
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
        z9 z9Var = this.B;
        if (z9Var != null) {
            z9Var.n();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        z9 z9Var = this.B;
        if (z9Var != null) {
            z9Var.o(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        pq pqVar = this.A;
        if (pqVar != null) {
            if (pqVar.e) {
                pqVar.e = false;
                return;
            }
            pqVar.e = true;
            pqVar.a();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        ms msVar = this.L;
        if (msVar != null) {
            msVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        ms msVar = this.L;
        if (msVar != null) {
            msVar.b();
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
        z9 z9Var = this.B;
        if (z9Var != null) {
            z9Var.t(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        z9 z9Var = this.B;
        if (z9Var != null) {
            z9Var.u(mode);
        }
    }

    @Override // defpackage.j67
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        pq pqVar = this.A;
        if (pqVar != null) {
            pqVar.a = colorStateList;
            pqVar.c = true;
            pqVar.a();
        }
    }

    @Override // defpackage.j67
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        pq pqVar = this.A;
        if (pqVar != null) {
            pqVar.b = mode;
            pqVar.d = true;
            pqVar.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        ms msVar = this.L;
        msVar.k(colorStateList);
        msVar.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        ms msVar = this.L;
        msVar.l(mode);
        msVar.b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(hf.S(getContext(), i));
    }
}
