package defpackage;

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
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: zp  reason: default package */
/* loaded from: classes.dex */
public class zp extends Button {
    public final y9 A;
    public final zr B;
    public yq L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zp(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        qt6.a(context);
        qs6.a(this, getContext());
        y9 y9Var = new y9(this);
        this.A = y9Var;
        y9Var.k(attributeSet, i);
        zr zrVar = new zr(this);
        this.B = zrVar;
        zrVar.f(attributeSet, i);
        zrVar.b();
        getEmojiTextViewHelper().b(attributeSet, i);
    }

    private yq getEmojiTextViewHelper() {
        if (this.L == null) {
            this.L = new yq(this);
        }
        return this.L;
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

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (dc7.c) {
            return super.getAutoSizeMaxTextSize();
        }
        zr zrVar = this.B;
        if (zrVar != null) {
            return Math.round(zrVar.i.e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (dc7.c) {
            return super.getAutoSizeMinTextSize();
        }
        zr zrVar = this.B;
        if (zrVar != null) {
            return Math.round(zrVar.i.d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (dc7.c) {
            return super.getAutoSizeStepGranularity();
        }
        zr zrVar = this.B;
        if (zrVar != null) {
            return Math.round(zrVar.i.c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (dc7.c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        zr zrVar = this.B;
        if (zrVar != null) {
            return zrVar.i.f;
        }
        return new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (dc7.c) {
            if (super.getAutoSizeTextType() != 1) {
                return 0;
            }
            return 1;
        }
        zr zrVar = this.B;
        if (zrVar == null) {
            return 0;
        }
        return zrVar.i.a;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return mj2.Z(super.getCustomSelectionActionModeCallback());
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
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        zr zrVar = this.B;
        if (zrVar != null && !dc7.c) {
            zrVar.i.a();
        }
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        zr zrVar = this.B;
        if (zrVar != null) {
            is isVar = zrVar.i;
            if (!dc7.c && isVar.f()) {
                isVar.a();
            }
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (dc7.c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        zr zrVar = this.B;
        if (zrVar != null) {
            zrVar.h(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (dc7.c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        zr zrVar = this.B;
        if (zrVar != null) {
            zrVar.i(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (dc7.c) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        zr zrVar = this.B;
        if (zrVar != null) {
            zrVar.j(i);
        }
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
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(mj2.d0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().d(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z) {
        zr zrVar = this.B;
        if (zrVar != null) {
            zrVar.a.setAllCaps(z);
        }
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

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        boolean z = dc7.c;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        zr zrVar = this.B;
        if (zrVar != null) {
            is isVar = zrVar.i;
            if (!z && !isVar.f()) {
                isVar.g(i, f);
            }
        }
    }
}
