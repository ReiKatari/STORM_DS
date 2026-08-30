package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import android.widget.MultiAutoCompleteTextView;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: br  reason: default package */
/* loaded from: classes.dex */
public final class br extends MultiAutoCompleteTextView {
    public static final int[] R = {16843126};
    public final y9 A;
    public final zr B;
    public final q03 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public br(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.autoCompleteTextViewStyle);
        qt6.a(context);
        qs6.a(this, getContext());
        n85 q = n85.q(getContext(), attributeSet, R, R.attr.autoCompleteTextViewStyle);
        if (((TypedArray) q.L).hasValue(0)) {
            setDropDownBackgroundDrawable(q.f(0));
        }
        q.t();
        y9 y9Var = new y9(this);
        this.A = y9Var;
        y9Var.k(attributeSet, R.attr.autoCompleteTextViewStyle);
        zr zrVar = new zr(this);
        this.B = zrVar;
        zrVar.f(attributeSet, R.attr.autoCompleteTextViewStyle);
        zrVar.b();
        q03 q03Var = new q03((EditText) this);
        this.L = q03Var;
        q03Var.o(attributeSet, R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = isFocusable();
            boolean isClickable = isClickable();
            boolean isLongClickable = isLongClickable();
            int inputType = getInputType();
            KeyListener m = q03Var.m(keyListener);
            if (m != keyListener) {
                super.setKeyListener(m);
                setRawInputType(inputType);
                setFocusable(isFocusable);
                setClickable(isClickable);
                setLongClickable(isLongClickable);
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
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

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        tq5.x(editorInfo, onCreateInputConnection, this);
        return this.L.t(onCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
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

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(l07.M(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.L.A(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.L.m(keyListener));
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

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        zr zrVar = this.B;
        if (zrVar != null) {
            zrVar.g(context, i);
        }
    }
}
