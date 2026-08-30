package ba;

import a6.e1;
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
import d8.e;
import d8.f;
import ha.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import k0.d;
import k7.w;
import me.magnum.melonds.R;
import p1.c1;
import p5.k;
import q.p;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c extends p {

    /* renamed from: v0  reason: collision with root package name */
    public static final int[] f2132v0 = {R.attr.state_indeterminate};

    /* renamed from: w0  reason: collision with root package name */
    public static final int[] f2133w0 = {R.attr.state_error};

    /* renamed from: x0  reason: collision with root package name */
    public static final int[][] f2134x0 = {new int[]{16842910, R.attr.state_error}, new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: y0  reason: collision with root package name */
    public static final int f2135y0 = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");

    /* renamed from: b0  reason: collision with root package name */
    public final LinkedHashSet f2136b0;

    /* renamed from: c0  reason: collision with root package name */
    public final LinkedHashSet f2137c0;

    /* renamed from: d0  reason: collision with root package name */
    public ColorStateList f2138d0;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f2139e0;

    /* renamed from: f0  reason: collision with root package name */
    public boolean f2140f0;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f2141g0;

    /* renamed from: h0  reason: collision with root package name */
    public CharSequence f2142h0;

    /* renamed from: i0  reason: collision with root package name */
    public Drawable f2143i0;

    /* renamed from: j0  reason: collision with root package name */
    public Drawable f2144j0;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f2145k0;

    /* renamed from: l0  reason: collision with root package name */
    public ColorStateList f2146l0;

    /* renamed from: m0  reason: collision with root package name */
    public ColorStateList f2147m0;

    /* renamed from: n0  reason: collision with root package name */
    public PorterDuff.Mode f2148n0;

    /* renamed from: o0  reason: collision with root package name */
    public int f2149o0;
    public int[] p0;

    /* renamed from: q0  reason: collision with root package name */
    public boolean f2150q0;

    /* renamed from: r0  reason: collision with root package name */
    public CharSequence f2151r0;

    /* renamed from: s0  reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f2152s0;

    /* renamed from: t0  reason: collision with root package name */
    public final f f2153t0;

    /* renamed from: u0  reason: collision with root package name */
    public final a f2154u0;

    public c(Context context, AttributeSet attributeSet) {
        super(sa.a.a(context, attributeSet, R.attr.checkboxStyle, 2131952821), attributeSet, R.attr.checkboxStyle);
        this.f2136b0 = new LinkedHashSet();
        this.f2137c0 = new LinkedHashSet();
        Context context2 = getContext();
        f fVar = new f(context2);
        Resources resources = context2.getResources();
        Resources.Theme theme = context2.getTheme();
        ThreadLocal threadLocal = k.f11352a;
        Drawable drawable = resources.getDrawable(R.drawable.mtrl_checkbox_button_checked_unchecked, theme);
        fVar.A = drawable;
        drawable.setCallback(fVar.Y);
        new e(fVar.A.getConstantState());
        this.f2153t0 = fVar;
        this.f2154u0 = new a(this);
        Context context3 = getContext();
        this.f2143i0 = getButtonDrawable();
        this.f2146l0 = getSuperButtonTintList();
        setSupportButtonTintList(null);
        i.a(context3, attributeSet, R.attr.checkboxStyle, 2131952821);
        int[] iArr = t9.a.f13163o;
        i.b(context3, attributeSet, iArr, R.attr.checkboxStyle, 2131952821, new int[0]);
        TypedArray obtainStyledAttributes = context3.obtainStyledAttributes(attributeSet, iArr, R.attr.checkboxStyle, 2131952821);
        c1 c1Var = new c1(context3, obtainStyledAttributes);
        this.f2144j0 = c1Var.h(2);
        if (this.f2143i0 != null && d.J(context3, R.attr.isMaterial3Theme, false)) {
            int resourceId = obtainStyledAttributes.getResourceId(0, 0);
            int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
            if (resourceId == f2135y0 && resourceId2 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.f2143i0 = w.p(context3, R.drawable.mtrl_checkbox_button);
                this.f2145k0 = true;
                if (this.f2144j0 == null) {
                    this.f2144j0 = w.p(context3, R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.f2147m0 = w.n(context3, c1Var, 3);
        this.f2148n0 = i.f(obtainStyledAttributes.getInt(4, -1), PorterDuff.Mode.SRC_IN);
        this.f2139e0 = obtainStyledAttributes.getBoolean(10, false);
        this.f2140f0 = obtainStyledAttributes.getBoolean(6, true);
        this.f2141g0 = obtainStyledAttributes.getBoolean(9, false);
        this.f2142h0 = obtainStyledAttributes.getText(8);
        if (obtainStyledAttributes.hasValue(7)) {
            setCheckedState(obtainStyledAttributes.getInt(7, 0));
        }
        c1Var.p();
        a();
    }

    private String getButtonStateDescription() {
        int i2 = this.f2149o0;
        if (i2 == 1) {
            return getResources().getString(R.string.mtrl_checkbox_state_description_checked);
        }
        if (i2 == 0) {
            return getResources().getString(R.string.mtrl_checkbox_state_description_unchecked);
        }
        return getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f2138d0 == null) {
            int m = l0.f.m(this, R.attr.colorControlActivated);
            int m10 = l0.f.m(this, R.attr.colorError);
            int m11 = l0.f.m(this, R.attr.colorSurface);
            int m12 = l0.f.m(this, R.attr.colorOnSurface);
            this.f2138d0 = new ColorStateList(f2134x0, new int[]{l0.f.u(1.0f, m11, m10), l0.f.u(1.0f, m11, m), l0.f.u(0.54f, m11, m12), l0.f.u(0.38f, m11, m12), l0.f.u(0.38f, m11, m12)});
        }
        return this.f2138d0;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f2146l0;
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
        e1 e1Var;
        Drawable drawable = this.f2143i0;
        ColorStateList colorStateList3 = this.f2146l0;
        PorterDuff.Mode buttonTintMode = getButtonTintMode();
        if (drawable == null) {
            drawable = null;
        } else if (colorStateList3 != null) {
            drawable = drawable.mutate();
            if (buttonTintMode != null) {
                drawable.setTintMode(buttonTintMode);
            }
        }
        this.f2143i0 = drawable;
        Drawable drawable2 = this.f2144j0;
        ColorStateList colorStateList4 = this.f2147m0;
        PorterDuff.Mode mode = this.f2148n0;
        if (drawable2 == null) {
            drawable2 = null;
        } else if (colorStateList4 != null) {
            drawable2 = drawable2.mutate();
            if (mode != null) {
                drawable2.setTintMode(mode);
            }
        }
        this.f2144j0 = drawable2;
        if (this.f2145k0) {
            f fVar = this.f2153t0;
            if (fVar != null) {
                d8.d dVar = fVar.B;
                Drawable drawable3 = fVar.A;
                a aVar = this.f2154u0;
                if (drawable3 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable3;
                    if (aVar.f2130a == null) {
                        aVar.f2130a = new d8.b(aVar);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(aVar.f2130a);
                }
                ArrayList arrayList = fVar.X;
                if (arrayList != null && aVar != null) {
                    arrayList.remove(aVar);
                    if (fVar.X.size() == 0 && (e1Var = fVar.R) != null) {
                        dVar.f3954b.removeListener(e1Var);
                        fVar.R = null;
                    }
                }
                Drawable drawable4 = fVar.A;
                if (drawable4 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable4;
                    if (aVar.f2130a == null) {
                        aVar.f2130a = new d8.b(aVar);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(aVar.f2130a);
                } else if (aVar != null) {
                    if (fVar.X == null) {
                        fVar.X = new ArrayList();
                    }
                    if (!fVar.X.contains(aVar)) {
                        fVar.X.add(aVar);
                        if (fVar.R == null) {
                            fVar.R = new e1(2, fVar);
                        }
                        dVar.f3954b.addListener(fVar.R);
                    }
                }
            }
            Drawable drawable5 = this.f2143i0;
            if ((drawable5 instanceof AnimatedStateListDrawable) && fVar != null) {
                ((AnimatedStateListDrawable) drawable5).addTransition(R.id.checked, R.id.unchecked, fVar, false);
                ((AnimatedStateListDrawable) this.f2143i0).addTransition(R.id.indeterminate, R.id.unchecked, fVar, false);
            }
        }
        Drawable drawable6 = this.f2143i0;
        if (drawable6 != null && (colorStateList2 = this.f2146l0) != null) {
            drawable6.setTintList(colorStateList2);
        }
        Drawable drawable7 = this.f2144j0;
        if (drawable7 != null && (colorStateList = this.f2147m0) != null) {
            drawable7.setTintList(colorStateList);
        }
        Drawable drawable8 = this.f2143i0;
        Drawable drawable9 = this.f2144j0;
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
                float f8 = intrinsicWidth / intrinsicHeight;
                if (f8 >= drawable8.getIntrinsicWidth() / drawable8.getIntrinsicHeight()) {
                    int intrinsicWidth2 = drawable8.getIntrinsicWidth();
                    intrinsicHeight = (int) (intrinsicWidth2 / f8);
                    intrinsicWidth = intrinsicWidth2;
                } else {
                    intrinsicHeight = drawable8.getIntrinsicHeight();
                    intrinsicWidth = (int) (f8 * intrinsicHeight);
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
        return this.f2143i0;
    }

    public Drawable getButtonIconDrawable() {
        return this.f2144j0;
    }

    public ColorStateList getButtonIconTintList() {
        return this.f2147m0;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f2148n0;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.f2146l0;
    }

    public int getCheckedState() {
        return this.f2149o0;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.f2142h0;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        if (this.f2149o0 == 1) {
            return true;
        }
        return false;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f2139e0 && this.f2146l0 == null && this.f2147m0 == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i2) {
        int[] copyOf;
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(onCreateDrawableState, f2132v0);
        }
        if (this.f2141g0) {
            View.mergeDrawableStates(onCreateDrawableState, f2133w0);
        }
        int i10 = 0;
        while (true) {
            if (i10 < onCreateDrawableState.length) {
                int i11 = onCreateDrawableState[i10];
                if (i11 == 16842912) {
                    copyOf = onCreateDrawableState;
                    break;
                } else if (i11 == 0) {
                    copyOf = (int[]) onCreateDrawableState.clone();
                    copyOf[i10] = 16842912;
                    break;
                } else {
                    i10++;
                }
            } else {
                copyOf = Arrays.copyOf(onCreateDrawableState, onCreateDrawableState.length + 1);
                copyOf[onCreateDrawableState.length] = 16842912;
                break;
            }
        }
        this.p0 = copyOf;
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable buttonDrawable;
        if (this.f2140f0 && TextUtils.isEmpty(getText()) && (buttonDrawable = getButtonDrawable()) != null) {
            int i2 = 1;
            if (getLayoutDirection() == 1) {
                i2 = -1;
            }
            int width = ((getWidth() - buttonDrawable.getIntrinsicWidth()) / 2) * i2;
            int save = canvas.save();
            canvas.translate(width, 0.0f);
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
        if (accessibilityNodeInfo != null && this.f2141g0) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f2142h0));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.getSuperState());
        setCheckedState(bVar.A);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View$BaseSavedState, android.os.Parcelable, ba.b] */
    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        baseSavedState.A = getCheckedState();
        return baseSavedState;
    }

    @Override // q.p, android.widget.CompoundButton
    public void setButtonDrawable(int i2) {
        setButtonDrawable(w.p(getContext(), i2));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f2144j0 = drawable;
        a();
    }

    public void setButtonIconDrawableResource(int i2) {
        setButtonIconDrawable(w.p(getContext(), i2));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.f2147m0 == colorStateList) {
            return;
        }
        this.f2147m0 = colorStateList;
        a();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.f2148n0 == mode) {
            return;
        }
        this.f2148n0 = mode;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.f2146l0 == colorStateList) {
            return;
        }
        this.f2146l0 = colorStateList;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        a();
    }

    public void setCenterIfNoTextEnabled(boolean z10) {
        this.f2140f0 = z10;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        setCheckedState(z10 ? 1 : 0);
    }

    public void setCheckedState(int i2) {
        boolean z10;
        AutofillManager autofillManager;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f2149o0 != i2) {
            this.f2149o0 = i2;
            if (i2 == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            super.setChecked(z10);
            refreshDrawableState();
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30 && this.f2151r0 == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (!this.f2150q0) {
                this.f2150q0 = true;
                LinkedHashSet linkedHashSet = this.f2137c0;
                if (linkedHashSet != null) {
                    Iterator it = linkedHashSet.iterator();
                    if (it.hasNext()) {
                        throw w.d.k(it);
                    }
                }
                if (this.f2149o0 != 2 && (onCheckedChangeListener = this.f2152s0) != null) {
                    onCheckedChangeListener.onCheckedChanged(this, isChecked());
                }
                if (i10 >= 26 && (autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class)) != null) {
                    autofillManager.notifyValueChanged(this);
                }
                this.f2150q0 = false;
            }
        }
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.f2142h0 = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i2) {
        CharSequence charSequence;
        if (i2 != 0) {
            charSequence = getResources().getText(i2);
        } else {
            charSequence = null;
        }
        setErrorAccessibilityLabel(charSequence);
    }

    public void setErrorShown(boolean z10) {
        if (this.f2141g0 != z10) {
            this.f2141g0 = z10;
            refreshDrawableState();
            Iterator it = this.f2136b0.iterator();
            if (!it.hasNext()) {
                return;
            }
            throw w.d.k(it);
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f2152s0 = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.f2151r0 = charSequence;
        if (charSequence == null) {
            if (Build.VERSION.SDK_INT >= 30 && charSequence == null) {
                super.setStateDescription(getButtonStateDescription());
                return;
            }
            return;
        }
        super.setStateDescription(charSequence);
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.f2139e0 = z10;
        if (z10) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // q.p, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.f2143i0 = drawable;
        this.f2145k0 = false;
        a();
    }
}
