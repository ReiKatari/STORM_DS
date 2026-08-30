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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: zu3  reason: default package */
/* loaded from: classes.dex */
public final class zu3 extends bq {
    public static final int[] w0 = {R.attr.state_indeterminate};
    public static final int[] x0 = {R.attr.state_error};
    public static final int[][] y0 = {new int[]{16842910, R.attr.state_error}, new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};
    public static final int z0 = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    public final LinkedHashSet c0;
    public final LinkedHashSet d0;
    public ColorStateList e0;
    public boolean f0;
    public boolean g0;
    public boolean h0;
    public CharSequence i0;
    public Drawable j0;
    public Drawable k0;
    public boolean l0;
    public ColorStateList m0;
    public ColorStateList n0;
    public PorterDuff.Mode o0;
    public int p0;
    public int[] q0;
    public boolean r0;
    public CharSequence s0;
    public CompoundButton.OnCheckedChangeListener t0;
    public final rn u0;
    public final xu3 v0;

    public zu3(Context context, AttributeSet attributeSet) {
        super(mh7.n0(context, attributeSet, R.attr.checkboxStyle, 2132018376), attributeSet, R.attr.checkboxStyle);
        this.c0 = new LinkedHashSet();
        this.d0 = new LinkedHashSet();
        Context context2 = getContext();
        rn rnVar = new rn(context2);
        Resources resources = context2.getResources();
        Resources.Theme theme = context2.getTheme();
        ThreadLocal threadLocal = ac5.a;
        Drawable drawable = resources.getDrawable(R.drawable.mtrl_checkbox_button_checked_unchecked, theme);
        rnVar.A = drawable;
        drawable.setCallback(rnVar.Y);
        new qn(rnVar.A.getConstantState());
        this.u0 = rnVar;
        this.v0 = new xu3(this);
        Context context3 = getContext();
        this.j0 = getButtonDrawable();
        this.m0 = getSuperButtonTintList();
        setSupportButtonTintList(null);
        n40.C(context3, attributeSet, R.attr.checkboxStyle, 2132018376);
        int[] iArr = ay4.o;
        n40.E(context3, attributeSet, iArr, R.attr.checkboxStyle, 2132018376, new int[0]);
        TypedArray obtainStyledAttributes = context3.obtainStyledAttributes(attributeSet, iArr, R.attr.checkboxStyle, 2132018376);
        n85 n85Var = new n85(context3, obtainStyledAttributes);
        this.k0 = n85Var.f(2);
        if (this.j0 != null && hk2.P(context3, R.attr.isMaterial3Theme, false)) {
            int resourceId = obtainStyledAttributes.getResourceId(0, 0);
            int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
            if (resourceId == z0 && resourceId2 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.j0 = l07.M(context3, R.drawable.mtrl_checkbox_button);
                this.l0 = true;
                if (this.k0 == null) {
                    this.k0 = l07.M(context3, R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.n0 = nk2.B(context3, n85Var, 3);
        this.o0 = ln2.M(obtainStyledAttributes.getInt(4, -1), PorterDuff.Mode.SRC_IN);
        this.f0 = obtainStyledAttributes.getBoolean(10, false);
        this.g0 = obtainStyledAttributes.getBoolean(6, true);
        this.h0 = obtainStyledAttributes.getBoolean(9, false);
        this.i0 = obtainStyledAttributes.getText(8);
        if (obtainStyledAttributes.hasValue(7)) {
            setCheckedState(obtainStyledAttributes.getInt(7, 0));
        }
        n85Var.t();
        a();
    }

    private String getButtonStateDescription() {
        int i = this.p0;
        if (i == 1) {
            return getResources().getString(R.string.mtrl_checkbox_state_description_checked);
        }
        if (i == 0) {
            return getResources().getString(R.string.mtrl_checkbox_state_description_unchecked);
        }
        return getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.e0 == null) {
            int x = jk2.x(this, R.attr.colorControlActivated);
            int x2 = jk2.x(this, R.attr.colorError);
            int x3 = jk2.x(this, R.attr.colorSurface);
            int x4 = jk2.x(this, R.attr.colorOnSurface);
            this.e0 = new ColorStateList(y0, new int[]{jk2.I(1.0f, x3, x2), jk2.I(1.0f, x3, x), jk2.I(0.54f, x3, x4), jk2.I(0.38f, x3, x4), jk2.I(0.38f, x3, x4)});
        }
        return this.e0;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.m0;
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
        r7 r7Var;
        Drawable drawable = this.j0;
        ColorStateList colorStateList3 = this.m0;
        PorterDuff.Mode buttonTintMode = getButtonTintMode();
        if (drawable == null) {
            drawable = null;
        } else if (colorStateList3 != null) {
            drawable = drawable.mutate();
            if (buttonTintMode != null) {
                drawable.setTintMode(buttonTintMode);
            }
        }
        this.j0 = drawable;
        Drawable drawable2 = this.k0;
        ColorStateList colorStateList4 = this.n0;
        PorterDuff.Mode mode = this.o0;
        if (drawable2 == null) {
            drawable2 = null;
        } else if (colorStateList4 != null) {
            drawable2 = drawable2.mutate();
            if (mode != null) {
                drawable2.setTintMode(mode);
            }
        }
        this.k0 = drawable2;
        if (this.l0) {
            rn rnVar = this.u0;
            if (rnVar != null) {
                pn pnVar = rnVar.B;
                Drawable drawable3 = rnVar.A;
                xu3 xu3Var = this.v0;
                if (drawable3 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable3;
                    if (xu3Var.a == null) {
                        xu3Var.a = new tm(xu3Var);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(xu3Var.a);
                }
                ArrayList arrayList = rnVar.X;
                if (arrayList != null && xu3Var != null) {
                    arrayList.remove(xu3Var);
                    if (rnVar.X.size() == 0 && (r7Var = rnVar.R) != null) {
                        pnVar.b.removeListener(r7Var);
                        rnVar.R = null;
                    }
                }
                Drawable drawable4 = rnVar.A;
                if (drawable4 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable4;
                    if (xu3Var.a == null) {
                        xu3Var.a = new tm(xu3Var);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(xu3Var.a);
                } else if (xu3Var != null) {
                    if (rnVar.X == null) {
                        rnVar.X = new ArrayList();
                    }
                    if (!rnVar.X.contains(xu3Var)) {
                        rnVar.X.add(xu3Var);
                        if (rnVar.R == null) {
                            rnVar.R = new r7(1, rnVar);
                        }
                        pnVar.b.addListener(rnVar.R);
                    }
                }
            }
            Drawable drawable5 = this.j0;
            if ((drawable5 instanceof AnimatedStateListDrawable) && rnVar != null) {
                ((AnimatedStateListDrawable) drawable5).addTransition(R.id.checked, R.id.unchecked, rnVar, false);
                ((AnimatedStateListDrawable) this.j0).addTransition(R.id.indeterminate, R.id.unchecked, rnVar, false);
            }
        }
        Drawable drawable6 = this.j0;
        if (drawable6 != null && (colorStateList2 = this.m0) != null) {
            drawable6.setTintList(colorStateList2);
        }
        Drawable drawable7 = this.k0;
        if (drawable7 != null && (colorStateList = this.n0) != null) {
            drawable7.setTintList(colorStateList);
        }
        Drawable drawable8 = this.j0;
        Drawable drawable9 = this.k0;
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
        return this.j0;
    }

    public Drawable getButtonIconDrawable() {
        return this.k0;
    }

    public ColorStateList getButtonIconTintList() {
        return this.n0;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.o0;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.m0;
    }

    public int getCheckedState() {
        return this.p0;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.i0;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        if (this.p0 == 1) {
            return true;
        }
        return false;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f0 && this.m0 == null && this.n0 == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] copyOf;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(onCreateDrawableState, w0);
        }
        if (this.h0) {
            View.mergeDrawableStates(onCreateDrawableState, x0);
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
        this.q0 = copyOf;
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable buttonDrawable;
        if (this.g0 && TextUtils.isEmpty(getText()) && (buttonDrawable = getButtonDrawable()) != null) {
            int i = 1;
            if (getLayoutDirection() == 1) {
                i = -1;
            }
            int width = ((getWidth() - buttonDrawable.getIntrinsicWidth()) / 2) * i;
            int save = canvas.save();
            canvas.translate(width, RecyclerView.A1);
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
        if (accessibilityNodeInfo != null && this.h0) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.i0));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof yu3)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        yu3 yu3Var = (yu3) parcelable;
        super.onRestoreInstanceState(yu3Var.getSuperState());
        setCheckedState(yu3Var.A);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View$BaseSavedState, android.os.Parcelable, yu3] */
    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        baseSavedState.A = getCheckedState();
        return baseSavedState;
    }

    @Override // defpackage.bq, android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(l07.M(getContext(), i));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.k0 = drawable;
        a();
    }

    public void setButtonIconDrawableResource(int i) {
        setButtonIconDrawable(l07.M(getContext(), i));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.n0 == colorStateList) {
            return;
        }
        this.n0 = colorStateList;
        a();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.o0 == mode) {
            return;
        }
        this.o0 = mode;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.m0 == colorStateList) {
            return;
        }
        this.m0 = colorStateList;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        a();
    }

    public void setCenterIfNoTextEnabled(boolean z) {
        this.g0 = z;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        setCheckedState(z ? 1 : 0);
    }

    public void setCheckedState(int i) {
        boolean z;
        AutofillManager autofillManager;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.p0 != i) {
            this.p0 = i;
            if (i == 1) {
                z = true;
            } else {
                z = false;
            }
            super.setChecked(z);
            refreshDrawableState();
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 30 && this.s0 == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (!this.r0) {
                this.r0 = true;
                LinkedHashSet linkedHashSet = this.d0;
                if (linkedHashSet != null) {
                    Iterator it = linkedHashSet.iterator();
                    if (it.hasNext()) {
                        throw b31.m(it);
                    }
                }
                if (this.p0 != 2 && (onCheckedChangeListener = this.t0) != null) {
                    onCheckedChangeListener.onCheckedChanged(this, isChecked());
                }
                if (i2 >= 26 && (autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class)) != null) {
                    autofillManager.notifyValueChanged(this);
                }
                this.r0 = false;
            }
        }
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.i0 = charSequence;
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
        if (this.h0 != z) {
            this.h0 = z;
            refreshDrawableState();
            Iterator it = this.c0.iterator();
            if (!it.hasNext()) {
                return;
            }
            throw b31.m(it);
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.t0 = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.s0 = charSequence;
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
        this.f0 = z;
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

    @Override // defpackage.bq, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.j0 = drawable;
        this.l0 = false;
        a();
    }
}
