package q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import me.magnum.melonds.R;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class a0 extends RadioButton implements f6.j {
    public final n2.o1 A;
    public final a4.k2 B;
    public final v0 L;
    public u R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.radioButtonStyle);
        c3.a(context);
        b3.a(this, getContext());
        n2.o1 o1Var = new n2.o1(this, 3);
        this.A = o1Var;
        o1Var.d(attributeSet, R.attr.radioButtonStyle);
        a4.k2 k2Var = new a4.k2(this);
        this.B = k2Var;
        k2Var.k(attributeSet, R.attr.radioButtonStyle);
        v0 v0Var = new v0(this);
        this.L = v0Var;
        v0Var.f(attributeSet, R.attr.radioButtonStyle);
        getEmojiTextViewHelper().b(attributeSet, R.attr.radioButtonStyle);
    }

    private u getEmojiTextViewHelper() {
        if (this.R == null) {
            this.R = new u(this);
        }
        return this.R;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        a4.k2 k2Var = this.B;
        if (k2Var != null) {
            k2Var.a();
        }
        v0 v0Var = this.L;
        if (v0Var != null) {
            v0Var.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        a4.k2 k2Var = this.B;
        if (k2Var != null) {
            return k2Var.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        a4.k2 k2Var = this.B;
        if (k2Var != null) {
            return k2Var.i();
        }
        return null;
    }

    @Override // f6.j
    public ColorStateList getSupportButtonTintList() {
        n2.o1 o1Var = this.A;
        if (o1Var != null) {
            return (ColorStateList) o1Var.f9969f;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        n2.o1 o1Var = this.A;
        if (o1Var != null) {
            return (PorterDuff.Mode) o1Var.f9970g;
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
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().c(z10);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        a4.k2 k2Var = this.B;
        if (k2Var != null) {
            k2Var.n();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        a4.k2 k2Var = this.B;
        if (k2Var != null) {
            k2Var.o(i2);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        n2.o1 o1Var = this.A;
        if (o1Var != null) {
            if (o1Var.f9967d) {
                o1Var.f9967d = false;
                return;
            }
            o1Var.f9967d = true;
            o1Var.a();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        v0 v0Var = this.L;
        if (v0Var != null) {
            v0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        v0 v0Var = this.L;
        if (v0Var != null) {
            v0Var.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().d(z10);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        a4.k2 k2Var = this.B;
        if (k2Var != null) {
            k2Var.t(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        a4.k2 k2Var = this.B;
        if (k2Var != null) {
            k2Var.u(mode);
        }
    }

    @Override // f6.j
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        n2.o1 o1Var = this.A;
        if (o1Var != null) {
            o1Var.f9969f = colorStateList;
            o1Var.f9965b = true;
            o1Var.a();
        }
    }

    @Override // f6.j
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        n2.o1 o1Var = this.A;
        if (o1Var != null) {
            o1Var.f9970g = mode;
            o1Var.f9966c = true;
            o1Var.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        v0 v0Var = this.L;
        v0Var.k(colorStateList);
        v0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        v0 v0Var = this.L;
        v0Var.l(mode);
        v0Var.b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i2) {
        setButtonDrawable(k7.w.p(getContext(), i2));
    }
}
