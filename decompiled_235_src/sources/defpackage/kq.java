package defpackage;

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
import android.widget.EditText;
import com.stormds.emulator.R;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kq  reason: default package */
/* loaded from: classes.dex */
public class kq extends AutoCompleteTextView {
    public static final int[] R = {16843126};
    public final z9 A;
    public final ms B;
    public final u63 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kq(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.autoCompleteTextViewStyle);
        h67.a(context);
        h57.a(this, getContext());
        m44 A = m44.A(getContext(), attributeSet, R, R.attr.autoCompleteTextViewStyle);
        if (((TypedArray) A.L).hasValue(0)) {
            setDropDownBackgroundDrawable(A.k(0));
        }
        A.D();
        z9 z9Var = new z9(this);
        this.A = z9Var;
        z9Var.k(attributeSet, R.attr.autoCompleteTextViewStyle);
        ms msVar = new ms(this);
        this.B = msVar;
        msVar.f(attributeSet, R.attr.autoCompleteTextViewStyle);
        msVar.b();
        u63 u63Var = new u63((EditText) this);
        this.L = u63Var;
        u63Var.r(attributeSet, R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener o = u63Var.o(keyListener);
            if (o != keyListener) {
                super.setKeyListener(o);
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
        z9 z9Var = this.A;
        if (z9Var != null) {
            z9Var.a();
        }
        ms msVar = this.B;
        if (msVar != null) {
            msVar.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return ii2.Z(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        z9 z9Var = this.A;
        if (z9Var != null) {
            return z9Var.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        z9 z9Var = this.A;
        if (z9Var != null) {
            return z9Var.i();
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
        l.G(editorInfo, onCreateInputConnection, this);
        return this.L.w(onCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        z9 z9Var = this.A;
        if (z9Var != null) {
            z9Var.n();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        z9 z9Var = this.A;
        if (z9Var != null) {
            z9Var.o(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        ms msVar = this.B;
        if (msVar != null) {
            msVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        ms msVar = this.B;
        if (msVar != null) {
            msVar.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(ii2.c0(callback, this));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(hf.S(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.L.F(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.L.o(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        z9 z9Var = this.A;
        if (z9Var != null) {
            z9Var.t(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        z9 z9Var = this.A;
        if (z9Var != null) {
            z9Var.u(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        ms msVar = this.B;
        msVar.k(colorStateList);
        msVar.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        ms msVar = this.B;
        msVar.l(mode);
        msVar.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        ms msVar = this.B;
        if (msVar != null) {
            msVar.g(context, i);
        }
    }
}
