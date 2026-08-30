package q;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class o extends Button {
    public final a4.k2 A;
    public final v0 B;
    public u L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        c3.a(context);
        b3.a(this, getContext());
        a4.k2 k2Var = new a4.k2(this);
        this.A = k2Var;
        k2Var.k(attributeSet, i2);
        v0 v0Var = new v0(this);
        this.B = v0Var;
        v0Var.f(attributeSet, i2);
        v0Var.b();
        getEmojiTextViewHelper().b(attributeSet, i2);
    }

    private u getEmojiTextViewHelper() {
        if (this.L == null) {
            this.L = new u(this);
        }
        return this.L;
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
    public int getAutoSizeMaxTextSize() {
        if (u3.f12029c) {
            return super.getAutoSizeMaxTextSize();
        }
        v0 v0Var = this.B;
        if (v0Var != null) {
            return Math.round(v0Var.f12038i.f11894e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (u3.f12029c) {
            return super.getAutoSizeMinTextSize();
        }
        v0 v0Var = this.B;
        if (v0Var != null) {
            return Math.round(v0Var.f12038i.f11893d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (u3.f12029c) {
            return super.getAutoSizeStepGranularity();
        }
        v0 v0Var = this.B;
        if (v0Var != null) {
            return Math.round(v0Var.f12038i.f11892c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (u3.f12029c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        v0 v0Var = this.B;
        if (v0Var != null) {
            return v0Var.f12038i.f11895f;
        }
        return new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (u3.f12029c) {
            if (super.getAutoSizeTextType() != 1) {
                return 0;
            }
            return 1;
        }
        v0 v0Var = this.B;
        if (v0Var == null) {
            return 0;
        }
        return v0Var.f12038i.f11890a;
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

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z10, int i2, int i10, int i11, int i12) {
        super.onLayout(z10, i2, i10, i11, i12);
        v0 v0Var = this.B;
        if (v0Var != null && !u3.f12029c) {
            v0Var.f12038i.a();
        }
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i2, int i10, int i11) {
        super.onTextChanged(charSequence, i2, i10, i11);
        v0 v0Var = this.B;
        if (v0Var != null) {
            e1 e1Var = v0Var.f12038i;
            if (!u3.f12029c && e1Var.f()) {
                e1Var.a();
            }
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().c(z10);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i2, int i10, int i11, int i12) {
        if (u3.f12029c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i2, i10, i11, i12);
            return;
        }
        v0 v0Var = this.B;
        if (v0Var != null) {
            v0Var.h(i2, i10, i11, i12);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i2) {
        if (u3.f12029c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i2);
            return;
        }
        v0 v0Var = this.B;
        if (v0Var != null) {
            v0Var.i(iArr, i2);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i2) {
        if (u3.f12029c) {
            super.setAutoSizeTextTypeWithDefaults(i2);
            return;
        }
        v0 v0Var = this.B;
        if (v0Var != null) {
            v0Var.j(i2);
        }
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
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(aj.g.A0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().d(z10);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z10) {
        v0 v0Var = this.B;
        if (v0Var != null) {
            v0Var.f12030a.setAllCaps(z10);
        }
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

    @Override // android.widget.TextView
    public final void setTextSize(int i2, float f8) {
        boolean z10 = u3.f12029c;
        if (z10) {
            super.setTextSize(i2, f8);
            return;
        }
        v0 v0Var = this.B;
        if (v0Var != null) {
            e1 e1Var = v0Var.f12038i;
            if (!z10 && !e1Var.f()) {
                e1Var.g(i2, f8);
            }
        }
    }
}
