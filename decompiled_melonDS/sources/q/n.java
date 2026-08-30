package q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import me.magnum.melonds.R;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class n extends AutoCompleteTextView {
    public static final int[] R = {16843126};
    public final a4.k2 A;
    public final v0 B;
    public final z L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.autoCompleteTextViewStyle);
        c3.a(context);
        b3.a(this, getContext());
        p1.c1 o5 = p1.c1.o(getContext(), attributeSet, R, R.attr.autoCompleteTextViewStyle);
        if (((TypedArray) o5.B).hasValue(0)) {
            setDropDownBackgroundDrawable(o5.h(0));
        }
        o5.p();
        a4.k2 k2Var = new a4.k2(this);
        this.A = k2Var;
        k2Var.k(attributeSet, R.attr.autoCompleteTextViewStyle);
        v0 v0Var = new v0(this);
        this.B = v0Var;
        v0Var.f(attributeSet, R.attr.autoCompleteTextViewStyle);
        v0Var.b();
        z zVar = new z(this);
        this.L = zVar;
        zVar.b(attributeSet, R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener a10 = zVar.a(keyListener);
            if (a10 != keyListener) {
                super.setKeyListener(a10);
                super.setRawInputType(inputType);
                super.setFocusable(isFocusable);
                super.setClickable(isClickable);
                super.setLongClickable(isLongClickable);
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        a4.k2 k2Var = this.A;
        if (k2Var != null) {
            k2Var.a();
        }
        v0 v0Var = this.B;
        if (v0Var != null) {
            v0Var.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return aj.g.w0(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        a4.k2 k2Var = this.A;
        if (k2Var != null) {
            return k2Var.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        a4.k2 k2Var = this.A;
        if (k2Var != null) {
            return k2Var.i();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.B.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.B.e();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        zb.k.E(editorInfo, onCreateInputConnection, this);
        return this.L.c(onCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        a4.k2 k2Var = this.A;
        if (k2Var != null) {
            k2Var.n();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        a4.k2 k2Var = this.A;
        if (k2Var != null) {
            k2Var.o(i2);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        v0 v0Var = this.B;
        if (v0Var != null) {
            v0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        v0 v0Var = this.B;
        if (v0Var != null) {
            v0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(aj.g.A0(callback, this));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i2) {
        setDropDownBackgroundDrawable(k7.w.p(getContext(), i2));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        this.L.d(z10);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.L.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        a4.k2 k2Var = this.A;
        if (k2Var != null) {
            k2Var.t(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        a4.k2 k2Var = this.A;
        if (k2Var != null) {
            k2Var.u(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        v0 v0Var = this.B;
        v0Var.k(colorStateList);
        v0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        v0 v0Var = this.B;
        v0Var.l(mode);
        v0Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        v0 v0Var = this.B;
        if (v0Var != null) {
            v0Var.g(context, i2);
        }
    }
}
