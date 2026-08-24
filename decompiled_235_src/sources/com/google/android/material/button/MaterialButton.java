package com.google.android.material.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.StateSet;
import android.util.TypedValue;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.stormds.emulator.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class MaterialButton extends lq implements Checkable, xe6 {
    public static final int[] E0 = {16842911};
    public static final int[] F0 = {16842912};
    public static final w14 G0 = new Object();
    public int A0;
    public float B0;
    public float C0;
    public fo6 D0;
    public final a24 R;
    public final LinkedHashSet d0;
    public x14 e0;
    public PorterDuff.Mode f0;
    public ColorStateList g0;
    public Drawable h0;
    public String i0;
    public int j0;
    public int k0;
    public int l0;
    public int m0;
    public boolean n0;
    public boolean o0;
    public int p0;
    public int q0;
    public float r0;
    public int s0;
    public int t0;
    public LinearLayout.LayoutParams u0;
    public boolean v0;
    public int w0;
    public boolean x0;
    public int y0;
    public aq6 z0;

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(q60.f0(context, attributeSet, R.attr.materialButtonStyle, 2132018360, new int[]{R.attr.materialSizeOverlay}), attributeSet, R.attr.materialButtonStyle);
        me6 a;
        this.d0 = new LinkedHashSet();
        this.n0 = false;
        this.o0 = false;
        this.q0 = -1;
        this.r0 = -1.0f;
        this.s0 = -1;
        this.t0 = -1;
        this.y0 = -1;
        Context context2 = getContext();
        TypedArray K = f04.K(context2, attributeSet, a75.j, R.attr.materialButtonStyle, 2132018360, new int[0]);
        this.m0 = K.getDimensionPixelSize(13, 0);
        int i = K.getInt(16, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f0 = qo2.E(i, mode);
        this.g0 = np2.S(getContext(), K, 15);
        this.h0 = np2.T(getContext(), K, 11);
        this.p0 = K.getInteger(12, 1);
        this.j0 = K.getDimensionPixelSize(14, 0);
        xp6 b = xp6.b(context2, K, 19);
        if (b != null) {
            a = b.c();
        } else {
            a = me6.b(context2, attributeSet, R.attr.materialButtonStyle, 2132018360).a();
        }
        boolean z = K.getBoolean(17, false);
        a24 a24Var = new a24(this, a);
        this.R = a24Var;
        a24Var.f = K.getDimensionPixelOffset(2, 0);
        a24Var.g = K.getDimensionPixelOffset(3, 0);
        a24Var.h = K.getDimensionPixelOffset(4, 0);
        a24Var.i = K.getDimensionPixelOffset(5, 0);
        if (K.hasValue(9)) {
            int dimensionPixelSize = K.getDimensionPixelSize(9, -1);
            a24Var.j = dimensionPixelSize;
            float f = dimensionPixelSize;
            le6 f2 = a24Var.b.f();
            f2.e = new t(f);
            f2.f = new t(f);
            f2.g = new t(f);
            f2.h = new t(f);
            a24Var.b = f2.a();
            a24Var.c = null;
            a24Var.d();
            a24Var.s = true;
        }
        a24Var.k = K.getDimensionPixelSize(22, 0);
        a24Var.l = qo2.E(K.getInt(8, -1), mode);
        a24Var.m = np2.S(getContext(), K, 7);
        a24Var.n = np2.S(getContext(), K, 21);
        a24Var.o = np2.S(getContext(), K, 18);
        a24Var.t = K.getBoolean(6, false);
        a24Var.w = K.getDimensionPixelSize(10, 0);
        a24Var.u = K.getBoolean(23, true);
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (K.hasValue(0)) {
            a24Var.r = true;
            setSupportBackgroundTintList(a24Var.m);
            setSupportBackgroundTintMode(a24Var.l);
        } else {
            a24Var.c();
        }
        setPaddingRelative(paddingStart + a24Var.f, paddingTop + a24Var.h, paddingEnd + a24Var.g, paddingBottom + a24Var.i);
        setCheckedInternal(K.getBoolean(1, false));
        if (b != null) {
            a24Var.d = d();
            if (a24Var.c != null) {
                a24Var.d();
            }
            a24Var.c = b;
            a24Var.d();
        }
        setOpticalCenterEnabled(z);
        K.recycle();
        setCompoundDrawablePadding(this.m0);
        h(this.h0 != null);
    }

    public static /* synthetic */ void a(MaterialButton materialButton) {
        materialButton.w0 = materialButton.getOpticalCenterShift();
        materialButton.j();
        materialButton.invalidate();
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        if (textAlignment != 1) {
            if (textAlignment != 6 && textAlignment != 3) {
                if (textAlignment != 4) {
                    return Layout.Alignment.ALIGN_NORMAL;
                }
                return Layout.Alignment.ALIGN_CENTER;
            }
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return getGravityTextAlignment();
    }

    public float getDisplayedWidthIncrease() {
        return this.B0;
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        if (gravity != 1) {
            if (gravity != 5 && gravity != 8388613) {
                return Layout.Alignment.ALIGN_NORMAL;
            }
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    private int getOpticalCenterShift() {
        p24 a;
        if (!this.v0 || !this.x0 || (a = this.R.a(false)) == null) {
            return 0;
        }
        return (int) (a.h() * 0.11f);
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float f = RecyclerView.B1;
        for (int i = 0; i < lineCount; i++) {
            f = Math.max(f, getLayout().getLineWidth(i));
        }
        return (int) Math.ceil(f);
    }

    private void setCheckedInternal(boolean z) {
        a24 a24Var = this.R;
        if (a24Var != null && a24Var.t && this.n0 != z) {
            this.n0 = z;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
                boolean z2 = this.n0;
                if (!materialButtonToggleGroup.k0) {
                    materialButtonToggleGroup.f(getId(), z2);
                }
            }
            if (!this.o0) {
                this.o0 = true;
                Iterator it = this.d0.iterator();
                if (!it.hasNext()) {
                    this.o0 = false;
                    return;
                }
                throw i61.j(it);
            }
        }
    }

    public void setDisplayedWidthIncrease(float f) {
        MaterialButton materialButton;
        MaterialButton materialButton2;
        if (this.B0 != f) {
            this.B0 = f;
            j();
            invalidate();
            if (getParent() instanceof z14) {
                z14 z14Var = (z14) getParent();
                int i = (int) this.B0;
                int indexOfChild = z14Var.indexOfChild(this);
                if (indexOfChild >= 0) {
                    int i2 = indexOfChild - 1;
                    while (true) {
                        materialButton = null;
                        if (i2 >= 0) {
                            if (z14Var.c(i2)) {
                                materialButton2 = (MaterialButton) z14Var.getChildAt(i2);
                                break;
                            }
                            i2--;
                        } else {
                            materialButton2 = null;
                            break;
                        }
                    }
                    int childCount = z14Var.getChildCount();
                    while (true) {
                        indexOfChild++;
                        if (indexOfChild < childCount) {
                            if (z14Var.c(indexOfChild)) {
                                materialButton = (MaterialButton) z14Var.getChildAt(indexOfChild);
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (materialButton2 != null || materialButton != null) {
                        if (materialButton2 == null) {
                            materialButton.setDisplayedWidthDecrease(i);
                        }
                        if (materialButton == null) {
                            materialButton2.setDisplayedWidthDecrease(i);
                        }
                        if (materialButton2 != null && materialButton != null) {
                            materialButton2.setDisplayedWidthDecrease(i / 2);
                            materialButton.setDisplayedWidthDecrease((i + 1) / 2);
                        }
                    }
                }
            }
        }
    }

    public final go6 d() {
        TypedArray obtainStyledAttributes;
        Context context = getContext();
        TypedValue M = qo2.M(context, R.attr.motionSpringFastSpatial);
        int[] iArr = a75.s;
        if (M == null) {
            obtainStyledAttributes = context.obtainStyledAttributes(null, iArr, 0, 2132017498);
        } else {
            obtainStyledAttributes = context.obtainStyledAttributes(M.resourceId, iArr);
        }
        go6 go6Var = new go6();
        try {
            float f = obtainStyledAttributes.getFloat(1, Float.MIN_VALUE);
            if (f != Float.MIN_VALUE) {
                float f2 = obtainStyledAttributes.getFloat(0, Float.MIN_VALUE);
                if (f2 != Float.MIN_VALUE) {
                    go6Var.b(f);
                    go6Var.a(f2);
                    return go6Var;
                }
                throw new IllegalArgumentException("A MaterialSpring style must have a damping value.");
            }
            throw new IllegalArgumentException("A MaterialSpring style must have stiffness value.");
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public final boolean e() {
        a24 a24Var = this.R;
        if (a24Var != null && !a24Var.r) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x0073, code lost:
        if (r1 == defpackage.zp6.PIXELS) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(boolean z) {
        int i;
        s35 s35Var;
        if (this.z0 != null) {
            if (this.D0 == null) {
                fo6 fo6Var = new fo6(this, G0);
                this.D0 = fo6Var;
                fo6Var.m = d();
            }
            if (this.x0) {
                int i2 = this.A0;
                aq6 aq6Var = this.z0;
                int[] drawableState = getDrawableState();
                int[][] iArr = aq6Var.c;
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    i = -1;
                    if (i4 < aq6Var.a) {
                        if (StateSet.stateSetMatches(iArr[i4], drawableState)) {
                            break;
                        }
                        i4++;
                    } else {
                        i4 = -1;
                        break;
                    }
                }
                if (i4 < 0) {
                    int[] iArr2 = StateSet.WILD_CARD;
                    int[][] iArr3 = aq6Var.c;
                    int i5 = 0;
                    while (true) {
                        if (i5 >= aq6Var.a) {
                            break;
                        } else if (StateSet.stateSetMatches(iArr3[i5], iArr2)) {
                            i = i5;
                            break;
                        } else {
                            i5++;
                        }
                    }
                    i4 = i;
                }
                if (i4 < 0) {
                    s35Var = aq6Var.b;
                } else {
                    s35Var = aq6Var.d[i4];
                }
                yp6 yp6Var = (yp6) s35Var.A;
                int width = getWidth();
                float f = yp6Var.b;
                zp6 zp6Var = yp6Var.a;
                if (zp6Var == zp6.PERCENT) {
                    f *= width;
                }
                i3 = (int) f;
                this.D0.a(Math.min(i2, i3));
                if (z) {
                    this.D0.d();
                }
            }
        }
    }

    public final void g() {
        int i = this.p0;
        if (i != 1 && i != 2) {
            if (i != 3 && i != 4) {
                if (i != 16 && i != 32) {
                    return;
                }
                setCompoundDrawablesRelative(null, this.h0, null, null);
                return;
            }
            setCompoundDrawablesRelative(null, null, this.h0, null);
            return;
        }
        setCompoundDrawablesRelative(this.h0, null, null, null);
    }

    public String getA11yClassName() {
        Class cls;
        if (!TextUtils.isEmpty(this.i0)) {
            return this.i0;
        }
        a24 a24Var = this.R;
        if (a24Var != null && a24Var.t) {
            cls = CompoundButton.class;
        } else {
            cls = Button.class;
        }
        return cls.getName();
    }

    public int getAllowedWidthDecrease() {
        return this.y0;
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (e()) {
            return this.R.j;
        }
        return 0;
    }

    public go6 getCornerSpringForce() {
        return this.R.d;
    }

    public Drawable getIcon() {
        return this.h0;
    }

    public int getIconGravity() {
        return this.p0;
    }

    public int getIconPadding() {
        return this.m0;
    }

    public int getIconSize() {
        return this.j0;
    }

    public ColorStateList getIconTint() {
        return this.g0;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f0;
    }

    public int getInsetBottom() {
        return this.R.i;
    }

    public int getInsetTop() {
        return this.R.h;
    }

    public ColorStateList getRippleColor() {
        if (e()) {
            return this.R.o;
        }
        return null;
    }

    public me6 getShapeAppearanceModel() {
        if (e()) {
            return this.R.b;
        }
        i.m("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
        return null;
    }

    public xp6 getStateListShapeAppearanceModel() {
        if (e()) {
            return this.R.c;
        }
        i.m("Attempted to get StateListShapeAppearanceModel from a MaterialButton which has an overwritten background.");
        return null;
    }

    public ColorStateList getStrokeColor() {
        if (e()) {
            return this.R.n;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (e()) {
            return this.R.k;
        }
        return 0;
    }

    @Override // defpackage.lq
    public ColorStateList getSupportBackgroundTintList() {
        if (e()) {
            return this.R.m;
        }
        return super.getSupportBackgroundTintList();
    }

    @Override // defpackage.lq
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (e()) {
            return this.R.l;
        }
        return super.getSupportBackgroundTintMode();
    }

    public final void h(boolean z) {
        Drawable drawable = this.h0;
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.h0 = mutate;
            mutate.setTintList(this.g0);
            PorterDuff.Mode mode = this.f0;
            if (mode != null) {
                this.h0.setTintMode(mode);
            }
            int i = this.j0;
            if (i == 0) {
                i = this.h0.getIntrinsicWidth();
            }
            int i2 = this.j0;
            if (i2 == 0) {
                i2 = this.h0.getIntrinsicHeight();
            }
            Drawable drawable2 = this.h0;
            int i3 = this.k0;
            int i4 = this.l0;
            drawable2.setBounds(i3, i4, i + i3, i2 + i4);
            this.h0.setVisible(true, z);
        }
        if (z) {
            g();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        int i5 = this.p0;
        if (((i5 != 1 && i5 != 2) || drawable3 == this.h0) && (((i5 != 3 && i5 != 4) || drawable5 == this.h0) && ((i5 != 16 && i5 != 32) || drawable4 == this.h0))) {
            return;
        }
        g();
    }

    public final void i(int i, int i2) {
        boolean z;
        if (this.h0 != null && getLayout() != null) {
            int i3 = this.p0;
            boolean z2 = true;
            if (i3 != 1 && i3 != 2 && i3 != 3 && i3 != 4) {
                if (i3 != 16 && i3 != 32) {
                    return;
                }
                this.k0 = 0;
                if (i3 == 16) {
                    this.l0 = 0;
                    h(false);
                    return;
                }
                int i4 = this.j0;
                if (i4 == 0) {
                    i4 = this.h0.getIntrinsicHeight();
                }
                int max = Math.max(0, (((((i2 - getTextHeight()) - getPaddingTop()) - i4) - this.m0) - getPaddingBottom()) / 2);
                if (this.l0 != max) {
                    this.l0 = max;
                    h(false);
                    return;
                }
                return;
            }
            this.l0 = 0;
            Layout.Alignment actualTextAlignment = getActualTextAlignment();
            int i5 = this.p0;
            if (i5 != 1 && i5 != 3 && ((i5 != 2 || actualTextAlignment != Layout.Alignment.ALIGN_NORMAL) && (i5 != 4 || actualTextAlignment != Layout.Alignment.ALIGN_OPPOSITE))) {
                int i6 = this.j0;
                if (i6 == 0) {
                    i6 = this.h0.getIntrinsicWidth();
                }
                int textLayoutWidth = ((((i - getTextLayoutWidth()) - getPaddingEnd()) - i6) - this.m0) - getPaddingStart();
                if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
                    textLayoutWidth /= 2;
                }
                if (getLayoutDirection() == 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (this.p0 != 4) {
                    z2 = false;
                }
                if (z != z2) {
                    textLayoutWidth = -textLayoutWidth;
                }
                if (this.k0 != textLayoutWidth) {
                    this.k0 = textLayoutWidth;
                    h(false);
                    return;
                }
                return;
            }
            this.k0 = 0;
            h(false);
        }
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.n0;
    }

    public final void j() {
        int i = (int) (this.B0 - this.C0);
        int i2 = (i / 2) + this.w0;
        getLayoutParams().width = (int) (this.r0 + i);
        setPaddingRelative(this.s0 + i2, getPaddingTop(), (this.t0 + i) - i2, getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (e()) {
            jx2.P(this, this.R.a(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        a24 a24Var = this.R;
        if (a24Var != null && a24Var.t) {
            View.mergeDrawableStates(onCreateDrawableState, E0);
        }
        if (this.n0) {
            View.mergeDrawableStates(onCreateDrawableState, F0);
        }
        return onCreateDrawableState;
    }

    @Override // defpackage.lq, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.n0);
    }

    @Override // defpackage.lq, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        a24 a24Var = this.R;
        if (a24Var != null && a24Var.t) {
            z = true;
        } else {
            z = false;
        }
        accessibilityNodeInfo.setCheckable(z);
        accessibilityNodeInfo.setChecked(this.n0);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // defpackage.lq, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        i(getMeasuredWidth(), getMeasuredHeight());
        int i6 = getResources().getConfiguration().orientation;
        if (this.q0 != i6) {
            this.q0 = i6;
            this.r0 = -1.0f;
        }
        if (this.r0 == -1.0f) {
            this.r0 = getMeasuredWidth();
            if (this.u0 == null && (getParent() instanceof z14) && ((z14) getParent()).getButtonSizeChange() != null) {
                this.u0 = (LinearLayout.LayoutParams) getLayoutParams();
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.u0);
                layoutParams.width = (int) this.r0;
                setLayoutParams(layoutParams);
            }
        }
        boolean z2 = false;
        if (this.y0 == -1) {
            if (this.h0 == null) {
                i5 = 0;
            } else {
                int iconPadding = getIconPadding();
                int i7 = this.j0;
                if (i7 == 0) {
                    i7 = this.h0.getIntrinsicWidth();
                }
                i5 = iconPadding + i7;
            }
            this.y0 = (getMeasuredWidth() - getTextLayoutWidth()) - i5;
        }
        if (this.s0 == -1) {
            this.s0 = getPaddingStart();
        }
        if (this.t0 == -1) {
            this.t0 = getPaddingEnd();
        }
        if ((getParent() instanceof z14) && ((z14) getParent()).getOrientation() == 0) {
            z2 = true;
        }
        this.x0 = z2;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof y14)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        y14 y14Var = (y14) parcelable;
        super.onRestoreInstanceState(y14Var.A);
        setChecked(y14Var.L);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [s, android.os.Parcelable, y14] */
    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? sVar = new s(super.onSaveInstanceState());
        sVar.L = this.n0;
        return sVar;
    }

    @Override // defpackage.lq, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (isEnabled() && this.R.u) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.h0 != null) {
            if (this.h0.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.i0 = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (e()) {
            a24 a24Var = this.R;
            if (a24Var.a(false) != null) {
                a24Var.a(false).setTint(i);
                return;
            }
            return;
        }
        super.setBackgroundColor(i);
    }

    @Override // defpackage.lq, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (e()) {
            if (drawable != getBackground()) {
                Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
                a24 a24Var = this.R;
                a24Var.r = true;
                MaterialButton materialButton = a24Var.a;
                materialButton.setSupportBackgroundTintList(a24Var.m);
                materialButton.setSupportBackgroundTintMode(a24Var.l);
                super.setBackgroundDrawable(drawable);
                return;
            }
            getBackground().setState(drawable.getState());
            return;
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // defpackage.lq, android.view.View
    public void setBackgroundResource(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = hf.S(getContext(), i);
        } else {
            drawable = null;
        }
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (e()) {
            this.R.t = z;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        setCheckedInternal(z);
    }

    public void setCornerRadius(int i) {
        if (e()) {
            a24 a24Var = this.R;
            if (!a24Var.s || a24Var.j != i) {
                a24Var.j = i;
                a24Var.s = true;
                float f = i;
                le6 f2 = a24Var.b.f();
                f2.e = new t(f);
                f2.f = new t(f);
                f2.g = new t(f);
                f2.h = new t(f);
                a24Var.b = f2.a();
                a24Var.c = null;
                a24Var.d();
            }
        }
    }

    public void setCornerRadiusResource(int i) {
        if (e()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    public void setCornerSpringForce(go6 go6Var) {
        a24 a24Var = this.R;
        a24Var.d = go6Var;
        if (a24Var.c != null) {
            a24Var.d();
        }
    }

    public void setDisplayedWidthDecrease(int i) {
        this.C0 = Math.min(i, this.y0);
        j();
        invalidate();
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        if (e()) {
            this.R.a(false).m(f);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.h0 != drawable) {
            this.h0 = drawable;
            h(true);
            i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.p0 != i) {
            this.p0 = i;
            i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i) {
        if (this.m0 != i) {
            this.m0 = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = hf.S(getContext(), i);
        } else {
            drawable = null;
        }
        setIcon(drawable);
    }

    public void setIconSize(int i) {
        if (i >= 0) {
            if (this.j0 != i) {
                this.j0 = i;
                h(true);
                return;
            }
            return;
        }
        i.h("iconSize cannot be less than 0");
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.g0 != colorStateList) {
            this.g0 = colorStateList;
            h(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f0 != mode) {
            this.f0 = mode;
            h(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(ge7.A(getContext(), i));
    }

    public void setInsetBottom(int i) {
        a24 a24Var = this.R;
        a24Var.b(a24Var.h, i);
    }

    public void setInsetTop(int i) {
        a24 a24Var = this.R;
        a24Var.b(i, a24Var.i);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(x14 x14Var) {
        this.e0 = x14Var;
    }

    public void setOpticalCenterEnabled(boolean z) {
        if (this.v0 != z) {
            this.v0 = z;
            a24 a24Var = this.R;
            if (z) {
                h61 h61Var = new h61(this, 14);
                a24Var.e = h61Var;
                p24 a = a24Var.a(false);
                if (a != null) {
                    a.z0 = h61Var;
                }
            } else {
                a24Var.e = null;
                p24 a2 = a24Var.a(false);
                if (a2 != null) {
                    a2.z0 = null;
                }
            }
            post(new rk3(this, 3));
        }
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        x14 x14Var = this.e0;
        if (x14Var != null) {
            ((MaterialButtonToggleGroup) ((s63) x14Var).B).invalidate();
        }
        super.setPressed(z);
        f(false);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (e()) {
            a24 a24Var = this.R;
            MaterialButton materialButton = a24Var.a;
            if (a24Var.o != colorStateList) {
                a24Var.o = colorStateList;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(lq5.a(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        if (e()) {
            setRippleColor(ge7.A(getContext(), i));
        }
    }

    @Override // defpackage.xe6
    public void setShapeAppearanceModel(me6 me6Var) {
        if (e()) {
            a24 a24Var = this.R;
            a24Var.b = me6Var;
            a24Var.c = null;
            a24Var.d();
            return;
        }
        i.m("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (e()) {
            a24 a24Var = this.R;
            a24Var.q = z;
            a24Var.e();
        }
    }

    public void setSizeChange(aq6 aq6Var) {
        if (this.z0 != aq6Var) {
            this.z0 = aq6Var;
            f(true);
        }
    }

    public void setStateListShapeAppearanceModel(xp6 xp6Var) {
        if (e()) {
            a24 a24Var = this.R;
            if (a24Var.d == null && xp6Var.d()) {
                a24Var.d = d();
                if (a24Var.c != null) {
                    a24Var.d();
                }
            }
            a24Var.c = xp6Var;
            a24Var.d();
            return;
        }
        i.m("Attempted to set StateListShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (e()) {
            a24 a24Var = this.R;
            if (a24Var.n != colorStateList) {
                a24Var.n = colorStateList;
                a24Var.e();
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (e()) {
            setStrokeColor(ge7.A(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (e()) {
            a24 a24Var = this.R;
            if (a24Var.k != i) {
                a24Var.k = i;
                a24Var.e();
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (e()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // defpackage.lq
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (e()) {
            a24 a24Var = this.R;
            if (a24Var.m != colorStateList) {
                a24Var.m = colorStateList;
                if (a24Var.a(false) != null) {
                    a24Var.a(false).setTintList(a24Var.m);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintList(colorStateList);
    }

    @Override // defpackage.lq
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (e()) {
            a24 a24Var = this.R;
            if (a24Var.l != mode) {
                a24Var.l = mode;
                if (a24Var.a(false) != null && a24Var.l != null) {
                    a24Var.a(false).setTintMode(a24Var.l);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintMode(mode);
    }

    @Override // android.view.View
    public void setTextAlignment(int i) {
        super.setTextAlignment(i);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z) {
        this.R.u = z;
    }

    @Override // android.widget.TextView
    public void setWidth(int i) {
        this.r0 = -1.0f;
        super.setWidth(i);
    }

    public void setWidthChangeMax(int i) {
        if (this.A0 != i) {
            this.A0 = i;
            f(true);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.n0);
    }
}
