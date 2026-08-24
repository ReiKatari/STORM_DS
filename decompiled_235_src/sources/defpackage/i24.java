package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import androidx.recyclerview.widget.RecyclerView;
import com.stormds.emulator.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: i24  reason: default package */
/* loaded from: classes.dex */
public final class i24 extends nq {
    public final LinkedHashSet d0;
    public final LinkedHashSet e0;
    public ColorStateList f0;
    public boolean g0;
    public boolean h0;
    public boolean i0;
    public CharSequence j0;
    public Drawable k0;
    public Drawable l0;
    public boolean m0;
    public ColorStateList n0;
    public ColorStateList o0;
    public PorterDuff.Mode p0;
    public int q0;
    public int[] r0;
    public boolean s0;
    public CharSequence t0;
    public CompoundButton.OnCheckedChangeListener u0;
    public final eo v0;
    public final g24 w0;
    public static final int[] x0 = {R.attr.state_indeterminate};
    public static final int[] y0 = {R.attr.state_error};
    public static final int[][] z0 = {new int[]{16842910, R.attr.state_error}, new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};
    public static final int A0 = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");

    public i24(Context context, AttributeSet attributeSet) {
        super(q60.e0(context, attributeSet, R.attr.checkboxStyle, 2132018384), attributeSet, R.attr.checkboxStyle);
        this.d0 = new LinkedHashSet();
        this.e0 = new LinkedHashSet();
        Context context2 = getContext();
        eo eoVar = new eo(context2);
        Resources resources = context2.getResources();
        Resources.Theme theme = context2.getTheme();
        ThreadLocal threadLocal = sl5.a;
        Drawable drawable = resources.getDrawable(R.drawable.mtrl_checkbox_button_checked_unchecked, theme);
        eoVar.A = drawable;
        drawable.setCallback(eoVar.Y);
        new co(eoVar.A.getConstantState());
        this.v0 = eoVar;
        this.w0 = new g24(this);
        Context context3 = getContext();
        this.k0 = getButtonDrawable();
        this.n0 = getSuperButtonTintList();
        setSupportButtonTintList(null);
        f04.r(context3, attributeSet, R.attr.checkboxStyle, 2132018384);
        int[] iArr = a75.o;
        f04.s(context3, attributeSet, iArr, R.attr.checkboxStyle, 2132018384, new int[0]);
        TypedArray obtainStyledAttributes = context3.obtainStyledAttributes(attributeSet, iArr, R.attr.checkboxStyle, 2132018384);
        m44 m44Var = new m44(context3, obtainStyledAttributes);
        this.l0 = m44Var.k(2);
        if (this.k0 != null && qo2.N(context3, R.attr.isMaterial3Theme, false)) {
            int resourceId = obtainStyledAttributes.getResourceId(0, 0);
            int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
            if (resourceId == A0 && resourceId2 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.k0 = hf.S(context3, R.drawable.mtrl_checkbox_button);
                this.m0 = true;
                if (this.l0 == null) {
                    this.l0 = hf.S(context3, R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.o0 = np2.R(context3, m44Var, 3);
        this.p0 = qo2.E(obtainStyledAttributes.getInt(4, -1), PorterDuff.Mode.SRC_IN);
        this.g0 = obtainStyledAttributes.getBoolean(10, false);
        this.h0 = obtainStyledAttributes.getBoolean(6, true);
        this.i0 = obtainStyledAttributes.getBoolean(9, false);
        this.j0 = obtainStyledAttributes.getText(8);
        if (obtainStyledAttributes.hasValue(7)) {
            setCheckedState(obtainStyledAttributes.getInt(7, 0));
        }
        m44Var.D();
        a();
    }

    private String getButtonStateDescription() {
        int i = this.q0;
        if (i == 1) {
            return getResources().getString(R.string.mtrl_checkbox_state_description_checked);
        }
        if (i == 0) {
            return getResources().getString(R.string.mtrl_checkbox_state_description_unchecked);
        }
        return getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f0 == null) {
            int B = mp2.B(this, R.attr.colorControlActivated);
            int B2 = mp2.B(this, R.attr.colorError);
            int B3 = mp2.B(this, R.attr.colorSurface);
            int B4 = mp2.B(this, R.attr.colorOnSurface);
            this.f0 = new ColorStateList(z0, new int[]{mp2.Q(1.0f, B3, B2), mp2.Q(1.0f, B3, B), mp2.Q(0.54f, B3, B4), mp2.Q(0.38f, B3, B4), mp2.Q(0.38f, B3, B4)});
        }
        return this.f0;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.n0;
        if (colorStateList != null) {
            return colorStateList;
        }
        if (super.getButtonTintList() != null) {
            return super.getButtonTintList();
        }
        return getSupportButtonTintList();
    }

    public final void a() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        s7 s7Var;
        Drawable drawable = this.k0;
        ColorStateList colorStateList3 = this.n0;
        PorterDuff.Mode buttonTintMode = getButtonTintMode();
        if (drawable == null) {
            drawable = null;
        } else if (colorStateList3 != null) {
            drawable = drawable.mutate();
            if (buttonTintMode != null) {
                drawable.setTintMode(buttonTintMode);
            }
        }
        this.k0 = drawable;
        Drawable drawable2 = this.l0;
        ColorStateList colorStateList4 = this.o0;
        PorterDuff.Mode mode = this.p0;
        if (drawable2 == null) {
            drawable2 = null;
        } else if (colorStateList4 != null) {
            drawable2 = drawable2.mutate();
            if (mode != null) {
                drawable2.setTintMode(mode);
            }
        }
        this.l0 = drawable2;
        if (this.m0) {
            eo eoVar = this.v0;
            if (eoVar != null) {
                bo boVar = eoVar.B;
                Drawable drawable3 = eoVar.A;
                g24 g24Var = this.w0;
                if (drawable3 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable3;
                    if (g24Var.a == null) {
                        g24Var.a = new fn(g24Var);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(g24Var.a);
                }
                ArrayList arrayList = eoVar.X;
                if (arrayList != null && g24Var != null) {
                    arrayList.remove(g24Var);
                    if (eoVar.X.size() == 0 && (s7Var = eoVar.R) != null) {
                        boVar.b.removeListener(s7Var);
                        eoVar.R = null;
                    }
                }
                Drawable drawable4 = eoVar.A;
                if (drawable4 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable4;
                    if (g24Var.a == null) {
                        g24Var.a = new fn(g24Var);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(g24Var.a);
                } else if (g24Var != null) {
                    if (eoVar.X == null) {
                        eoVar.X = new ArrayList();
                    }
                    if (!eoVar.X.contains(g24Var)) {
                        eoVar.X.add(g24Var);
                        if (eoVar.R == null) {
                            eoVar.R = new s7(eoVar, 1);
                        }
                        boVar.b.addListener(eoVar.R);
                    }
                }
            }
            Drawable drawable5 = this.k0;
            if ((drawable5 instanceof AnimatedStateListDrawable) && eoVar != null) {
                ((AnimatedStateListDrawable) drawable5).addTransition(R.id.checked, R.id.unchecked, eoVar, false);
                ((AnimatedStateListDrawable) this.k0).addTransition(R.id.indeterminate, R.id.unchecked, eoVar, false);
            }
        }
        Drawable drawable6 = this.k0;
        if (drawable6 != null && (colorStateList2 = this.n0) != null) {
            drawable6.setTintList(colorStateList2);
        }
        Drawable drawable7 = this.l0;
        if (drawable7 != null && (colorStateList = this.o0) != null) {
            drawable7.setTintList(colorStateList);
        }
        Drawable drawable8 = this.k0;
        Drawable drawable9 = this.l0;
        if (drawable8 == null) {
            drawable8 = drawable9;
        } else if (drawable9 != null) {
            int intrinsicWidth = drawable9.getIntrinsicWidth();
            if (intrinsicWidth == -1) {
                intrinsicWidth = drawable8.getIntrinsicWidth();
            }
            int intrinsicHeight = drawable9.getIntrinsicHeight();
            if (intrinsicHeight == -1) {
                intrinsicHeight = drawable8.getIntrinsicHeight();
            }
            if (intrinsicWidth > drawable8.getIntrinsicWidth() || intrinsicHeight > drawable8.getIntrinsicHeight()) {
                float f = intrinsicWidth / intrinsicHeight;
                if (f >= drawable8.getIntrinsicWidth() / drawable8.getIntrinsicHeight()) {
                    int intrinsicWidth2 = drawable8.getIntrinsicWidth();
                    intrinsicHeight = (int) (intrinsicWidth2 / f);
                    intrinsicWidth = intrinsicWidth2;
                } else {
                    intrinsicHeight = drawable8.getIntrinsicHeight();
                    intrinsicWidth = (int) (f * intrinsicHeight);
                }
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable8, drawable9});
            layerDrawable.setLayerSize(1, intrinsicWidth, intrinsicHeight);
            layerDrawable.setLayerGravity(1, 17);
            drawable8 = layerDrawable;
        }
        super.setButtonDrawable(drawable8);
        refreshDrawableState();
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.k0;
    }

    public Drawable getButtonIconDrawable() {
        return this.l0;
    }

    public ColorStateList getButtonIconTintList() {
        return this.o0;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.p0;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.n0;
    }

    public int getCheckedState() {
        return this.q0;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.j0;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        if (this.q0 == 1) {
            return true;
        }
        return false;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.g0 && this.n0 == null && this.o0 == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] copyOf;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(onCreateDrawableState, x0);
        }
        if (this.i0) {
            View.mergeDrawableStates(onCreateDrawableState, y0);
        }
        int i2 = 0;
        while (true) {
            if (i2 < onCreateDrawableState.length) {
                int i3 = onCreateDrawableState[i2];
                if (i3 == 16842912) {
                    copyOf = onCreateDrawableState;
                    break;
                } else if (i3 == 0) {
                    copyOf = (int[]) onCreateDrawableState.clone();
                    copyOf[i2] = 16842912;
                    break;
                } else {
                    i2++;
                }
            } else {
                copyOf = Arrays.copyOf(onCreateDrawableState, onCreateDrawableState.length + 1);
                copyOf[onCreateDrawableState.length] = 16842912;
                break;
            }
        }
        this.r0 = copyOf;
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable buttonDrawable;
        if (this.h0 && TextUtils.isEmpty(getText()) && (buttonDrawable = getButtonDrawable()) != null) {
            int i = 1;
            if (getLayoutDirection() == 1) {
                i = -1;
            }
            int width = ((getWidth() - buttonDrawable.getIntrinsicWidth()) / 2) * i;
            int save = canvas.save();
            canvas.translate(width, RecyclerView.B1);
            super.onDraw(canvas);
            canvas.restoreToCount(save);
            if (getBackground() != null) {
                Rect bounds = buttonDrawable.getBounds();
                getBackground().setHotspotBounds(bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
                return;
            }
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.i0) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.j0));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof h24)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h24 h24Var = (h24) parcelable;
        super.onRestoreInstanceState(h24Var.getSuperState());
        setCheckedState(h24Var.A);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View$BaseSavedState, android.os.Parcelable, h24] */
    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        baseSavedState.A = getCheckedState();
        return baseSavedState;
    }

    @Override // defpackage.nq, android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(hf.S(getContext(), i));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.l0 = drawable;
        a();
    }

    public void setButtonIconDrawableResource(int i) {
        setButtonIconDrawable(hf.S(getContext(), i));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.o0 == colorStateList) {
            return;
        }
        this.o0 = colorStateList;
        a();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.p0 == mode) {
            return;
        }
        this.p0 = mode;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.n0 == colorStateList) {
            return;
        }
        this.n0 = colorStateList;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        a();
    }

    public void setCenterIfNoTextEnabled(boolean z) {
        this.h0 = z;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        setCheckedState(z ? 1 : 0);
    }

    public void setCheckedState(int i) {
        boolean z;
        AutofillManager autofillManager;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.q0 != i) {
            this.q0 = i;
            if (i == 1) {
                z = true;
            } else {
                z = false;
            }
            super.setChecked(z);
            refreshDrawableState();
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 30 && this.t0 == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (!this.s0) {
                this.s0 = true;
                LinkedHashSet linkedHashSet = this.e0;
                if (linkedHashSet != null) {
                    Iterator it = linkedHashSet.iterator();
                    if (it.hasNext()) {
                        throw i61.j(it);
                    }
                }
                if (this.q0 != 2 && (onCheckedChangeListener = this.u0) != null) {
                    onCheckedChangeListener.onCheckedChanged(this, isChecked());
                }
                if (i2 >= 26 && (autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class)) != null) {
                    autofillManager.notifyValueChanged(this);
                }
                this.s0 = false;
            }
        }
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.j0 = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i) {
        CharSequence charSequence;
        if (i != 0) {
            charSequence = getResources().getText(i);
        } else {
            charSequence = null;
        }
        setErrorAccessibilityLabel(charSequence);
    }

    public void setErrorShown(boolean z) {
        if (this.i0 != z) {
            this.i0 = z;
            refreshDrawableState();
            Iterator it = this.d0.iterator();
            if (!it.hasNext()) {
                return;
            }
            throw i61.j(it);
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.u0 = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.t0 = charSequence;
        if (charSequence == null) {
            if (Build.VERSION.SDK_INT >= 30 && charSequence == null) {
                super.setStateDescription(getButtonStateDescription());
                return;
            }
            return;
        }
        super.setStateDescription(charSequence);
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.g0 = z;
        if (z) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // defpackage.nq, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.k0 = drawable;
        this.m0 = false;
        a();
    }
}
