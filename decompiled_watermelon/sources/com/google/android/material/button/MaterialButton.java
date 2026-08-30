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
import android.util.TypedValue;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.LinkedHashSet;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public class MaterialButton extends zp implements Checkable, l36 {
    public static final int[] D0 = {16842911};
    public static final int[] E0 = {16842912};
    public static final nu3 F0 = new Object();
    public float A0;
    public float B0;
    public pc6 C0;
    public final ru3 R;
    public final LinkedHashSet c0;
    public ou3 d0;
    public PorterDuff.Mode e0;
    public ColorStateList f0;
    public Drawable g0;
    public String h0;
    public int i0;
    public int j0;
    public int k0;
    public int l0;
    public boolean m0;
    public boolean n0;
    public int o0;
    public int p0;
    public float q0;
    public int r0;
    public int s0;
    public LinearLayout.LayoutParams t0;
    public boolean u0;
    public int v0;
    public boolean w0;
    public int x0;
    public le6 y0;
    public int z0;

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(mh7.o0(context, attributeSet, R.attr.materialButtonStyle, 2132018352, new int[]{R.attr.materialSizeOverlay}), attributeSet, R.attr.materialButtonStyle);
        a36 a;
        this.c0 = new LinkedHashSet();
        this.m0 = false;
        this.n0 = false;
        this.p0 = -1;
        this.q0 = -1.0f;
        this.r0 = -1;
        this.s0 = -1;
        this.x0 = -1;
        Context context2 = getContext();
        TypedArray Y = n40.Y(context2, attributeSet, ay4.j, R.attr.materialButtonStyle, 2132018352, new int[0]);
        this.l0 = Y.getDimensionPixelSize(13, 0);
        int i = Y.getInt(16, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.e0 = ln2.M(i, mode);
        this.f0 = nk2.C(getContext(), Y, 15);
        this.g0 = nk2.D(getContext(), Y, 11);
        this.o0 = Y.getInteger(12, 1);
        this.i0 = Y.getDimensionPixelSize(14, 0);
        ie6 b = ie6.b(context2, Y, 19);
        if (b != null) {
            a = b.c();
        } else {
            a = a36.b(context2, attributeSet, R.attr.materialButtonStyle, 2132018352).a();
        }
        boolean z = Y.getBoolean(17, false);
        ru3 ru3Var = new ru3(this, a);
        this.R = ru3Var;
        ru3Var.f = Y.getDimensionPixelOffset(2, 0);
        ru3Var.g = Y.getDimensionPixelOffset(3, 0);
        ru3Var.h = Y.getDimensionPixelOffset(4, 0);
        ru3Var.i = Y.getDimensionPixelOffset(5, 0);
        if (Y.hasValue(9)) {
            int dimensionPixelSize = Y.getDimensionPixelSize(9, -1);
            ru3Var.j = dimensionPixelSize;
            float f = dimensionPixelSize;
            z26 f2 = ru3Var.b.f();
            f2.e = new s(f);
            f2.f = new s(f);
            f2.g = new s(f);
            f2.h = new s(f);
            ru3Var.b = f2.a();
            ru3Var.c = null;
            ru3Var.d();
            ru3Var.s = true;
        }
        ru3Var.k = Y.getDimensionPixelSize(22, 0);
        ru3Var.l = ln2.M(Y.getInt(8, -1), mode);
        ru3Var.m = nk2.C(getContext(), Y, 7);
        ru3Var.n = nk2.C(getContext(), Y, 21);
        ru3Var.o = nk2.C(getContext(), Y, 18);
        ru3Var.t = Y.getBoolean(6, false);
        ru3Var.w = Y.getDimensionPixelSize(10, 0);
        ru3Var.u = Y.getBoolean(23, true);
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (Y.hasValue(0)) {
            ru3Var.r = true;
            setSupportBackgroundTintList(ru3Var.m);
            setSupportBackgroundTintMode(ru3Var.l);
        } else {
            ru3Var.c();
        }
        setPaddingRelative(paddingStart + ru3Var.f, paddingTop + ru3Var.h, paddingEnd + ru3Var.g, paddingBottom + ru3Var.i);
        setCheckedInternal(Y.getBoolean(1, false));
        if (b != null) {
            ru3Var.d = d();
            if (ru3Var.c != null) {
                ru3Var.d();
            }
            ru3Var.c = b;
            ru3Var.d();
        }
        setOpticalCenterEnabled(z);
        Y.recycle();
        setCompoundDrawablePadding(this.l0);
        h(this.g0 != null);
    }

    public static /* synthetic */ void a(MaterialButton materialButton) {
        materialButton.v0 = materialButton.getOpticalCenterShift();
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
        return this.A0;
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
        gv3 a;
        if (!this.u0 || !this.w0 || (a = this.R.a(false)) == null) {
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
        float f = RecyclerView.A1;
        for (int i = 0; i < lineCount; i++) {
            f = Math.max(f, getLayout().getLineWidth(i));
        }
        return (int) Math.ceil(f);
    }

    private void setCheckedInternal(boolean z) {
        ru3 ru3Var = this.R;
        if (ru3Var != null && ru3Var.t && this.m0 != z) {
            this.m0 = z;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
                boolean z2 = this.m0;
                if (!materialButtonToggleGroup.j0) {
                    materialButtonToggleGroup.f(getId(), z2);
                }
            }
            if (!this.n0) {
                this.n0 = true;
                Iterator it = this.c0.iterator();
                if (!it.hasNext()) {
                    this.n0 = false;
                    return;
                }
                throw b31.m(it);
            }
        }
    }

    public void setDisplayedWidthIncrease(float f) {
        MaterialButton materialButton;
        MaterialButton materialButton2;
        if (this.A0 != f) {
            this.A0 = f;
            j();
            invalidate();
            if (getParent() instanceof qu3) {
                qu3 qu3Var = (qu3) getParent();
                int i = (int) this.A0;
                int indexOfChild = qu3Var.indexOfChild(this);
                if (indexOfChild >= 0) {
                    int i2 = indexOfChild - 1;
                    while (true) {
                        materialButton = null;
                        if (i2 >= 0) {
                            if (qu3Var.c(i2)) {
                                materialButton2 = (MaterialButton) qu3Var.getChildAt(i2);
                                break;
                            }
                            i2--;
                        } else {
                            materialButton2 = null;
                            break;
                        }
                    }
                    int childCount = qu3Var.getChildCount();
                    while (true) {
                        indexOfChild++;
                        if (indexOfChild < childCount) {
                            if (qu3Var.c(indexOfChild)) {
                                materialButton = (MaterialButton) qu3Var.getChildAt(indexOfChild);
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

    public final qc6 d() {
        TypedArray obtainStyledAttributes;
        Context context = getContext();
        TypedValue O = hk2.O(context, R.attr.motionSpringFastSpatial);
        int[] iArr = ay4.s;
        if (O == null) {
            obtainStyledAttributes = context.obtainStyledAttributes(null, iArr, 0, 2132017490);
        } else {
            obtainStyledAttributes = context.obtainStyledAttributes(O.resourceId, iArr);
        }
        qc6 qc6Var = new qc6();
        try {
            float f = obtainStyledAttributes.getFloat(1, Float.MIN_VALUE);
            if (f != Float.MIN_VALUE) {
                float f2 = obtainStyledAttributes.getFloat(0, Float.MIN_VALUE);
                if (f2 != Float.MIN_VALUE) {
                    qc6Var.b(f);
                    qc6Var.a(f2);
                    return qc6Var;
                }
                throw new IllegalArgumentException("A MaterialSpring style must have a damping value.");
            }
            throw new IllegalArgumentException("A MaterialSpring style must have stiffness value.");
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public final boolean e() {
        ru3 ru3Var = this.R;
        if (ru3Var != null && !ru3Var.r) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x0073, code lost:
        if (r1 == defpackage.ke6.PIXELS) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(boolean r9) {
        /*
            r8 = this;
            le6 r0 = r8.y0
            if (r0 != 0) goto L6
            goto L87
        L6:
            pc6 r0 = r8.C0
            if (r0 != 0) goto L19
            pc6 r0 = new pc6
            nu3 r1 = com.google.android.material.button.MaterialButton.F0
            r0.<init>(r8, r1)
            r8.C0 = r0
            qc6 r1 = r8.d()
            r0.m = r1
        L19:
            boolean r0 = r8.w0
            if (r0 == 0) goto L87
            int r0 = r8.z0
            le6 r1 = r8.y0
            int[] r2 = r8.getDrawableState()
            int[][] r3 = r1.c
            r4 = 0
            r5 = r4
        L29:
            int r6 = r1.a
            r7 = -1
            if (r5 >= r6) goto L3a
            r6 = r3[r5]
            boolean r6 = android.util.StateSet.stateSetMatches(r6, r2)
            if (r6 == 0) goto L37
            goto L3b
        L37:
            int r5 = r5 + 1
            goto L29
        L3a:
            r5 = r7
        L3b:
            if (r5 >= 0) goto L54
            int[] r2 = android.util.StateSet.WILD_CARD
            int[][] r3 = r1.c
            r5 = r4
        L42:
            int r6 = r1.a
            if (r5 >= r6) goto L53
            r6 = r3[r5]
            boolean r6 = android.util.StateSet.stateSetMatches(r6, r2)
            if (r6 == 0) goto L50
            r7 = r5
            goto L53
        L50:
            int r5 = r5 + 1
            goto L42
        L53:
            r5 = r7
        L54:
            if (r5 >= 0) goto L59
            dz4 r1 = r1.b
            goto L5d
        L59:
            dz4[] r1 = r1.d
            r1 = r1[r5]
        L5d:
            java.lang.Object r1 = r1.A
            je6 r1 = (defpackage.je6) r1
            int r2 = r8.getWidth()
            float r3 = r1.b
            ke6 r1 = r1.a
            ke6 r5 = defpackage.ke6.PERCENT
            if (r1 != r5) goto L71
            float r1 = (float) r2
            float r3 = r3 * r1
        L6f:
            int r4 = (int) r3
            goto L76
        L71:
            ke6 r2 = defpackage.ke6.PIXELS
            if (r1 != r2) goto L76
            goto L6f
        L76:
            int r0 = java.lang.Math.min(r0, r4)
            pc6 r1 = r8.C0
            float r0 = (float) r0
            r1.a(r0)
            if (r9 == 0) goto L87
            pc6 r8 = r8.C0
            r8.d()
        L87:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButton.f(boolean):void");
    }

    public final void g() {
        int i = this.o0;
        if (i != 1 && i != 2) {
            if (i != 3 && i != 4) {
                if (i != 16 && i != 32) {
                    return;
                }
                setCompoundDrawablesRelative(null, this.g0, null, null);
                return;
            }
            setCompoundDrawablesRelative(null, null, this.g0, null);
            return;
        }
        setCompoundDrawablesRelative(this.g0, null, null, null);
    }

    public String getA11yClassName() {
        Class cls;
        if (!TextUtils.isEmpty(this.h0)) {
            return this.h0;
        }
        ru3 ru3Var = this.R;
        if (ru3Var != null && ru3Var.t) {
            cls = CompoundButton.class;
        } else {
            cls = Button.class;
        }
        return cls.getName();
    }

    public int getAllowedWidthDecrease() {
        return this.x0;
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

    public qc6 getCornerSpringForce() {
        return this.R.d;
    }

    public Drawable getIcon() {
        return this.g0;
    }

    public int getIconGravity() {
        return this.o0;
    }

    public int getIconPadding() {
        return this.l0;
    }

    public int getIconSize() {
        return this.i0;
    }

    public ColorStateList getIconTint() {
        return this.f0;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.e0;
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

    public a36 getShapeAppearanceModel() {
        if (e()) {
            return this.R.b;
        }
        i.n("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
        return null;
    }

    public ie6 getStateListShapeAppearanceModel() {
        if (e()) {
            return this.R.c;
        }
        i.n("Attempted to get StateListShapeAppearanceModel from a MaterialButton which has an overwritten background.");
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

    @Override // defpackage.zp
    public ColorStateList getSupportBackgroundTintList() {
        if (e()) {
            return this.R.m;
        }
        return super.getSupportBackgroundTintList();
    }

    @Override // defpackage.zp
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (e()) {
            return this.R.l;
        }
        return super.getSupportBackgroundTintMode();
    }

    public final void h(boolean z) {
        Drawable drawable = this.g0;
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.g0 = mutate;
            mutate.setTintList(this.f0);
            PorterDuff.Mode mode = this.e0;
            if (mode != null) {
                this.g0.setTintMode(mode);
            }
            int i = this.i0;
            if (i == 0) {
                i = this.g0.getIntrinsicWidth();
            }
            int i2 = this.i0;
            if (i2 == 0) {
                i2 = this.g0.getIntrinsicHeight();
            }
            Drawable drawable2 = this.g0;
            int i3 = this.j0;
            int i4 = this.k0;
            drawable2.setBounds(i3, i4, i + i3, i2 + i4);
            this.g0.setVisible(true, z);
        }
        if (z) {
            g();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        int i5 = this.o0;
        if (((i5 != 1 && i5 != 2) || drawable3 == this.g0) && (((i5 != 3 && i5 != 4) || drawable5 == this.g0) && ((i5 != 16 && i5 != 32) || drawable4 == this.g0))) {
            return;
        }
        g();
    }

    public final void i(int i, int i2) {
        boolean z;
        if (this.g0 != null && getLayout() != null) {
            int i3 = this.o0;
            boolean z2 = true;
            if (i3 != 1 && i3 != 2 && i3 != 3 && i3 != 4) {
                if (i3 != 16 && i3 != 32) {
                    return;
                }
                this.j0 = 0;
                if (i3 == 16) {
                    this.k0 = 0;
                    h(false);
                    return;
                }
                int i4 = this.i0;
                if (i4 == 0) {
                    i4 = this.g0.getIntrinsicHeight();
                }
                int max = Math.max(0, (((((i2 - getTextHeight()) - getPaddingTop()) - i4) - this.l0) - getPaddingBottom()) / 2);
                if (this.k0 != max) {
                    this.k0 = max;
                    h(false);
                    return;
                }
                return;
            }
            this.k0 = 0;
            Layout.Alignment actualTextAlignment = getActualTextAlignment();
            int i5 = this.o0;
            if (i5 != 1 && i5 != 3 && ((i5 != 2 || actualTextAlignment != Layout.Alignment.ALIGN_NORMAL) && (i5 != 4 || actualTextAlignment != Layout.Alignment.ALIGN_OPPOSITE))) {
                int i6 = this.i0;
                if (i6 == 0) {
                    i6 = this.g0.getIntrinsicWidth();
                }
                int textLayoutWidth = ((((i - getTextLayoutWidth()) - getPaddingEnd()) - i6) - this.l0) - getPaddingStart();
                if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
                    textLayoutWidth /= 2;
                }
                if (getLayoutDirection() == 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (this.o0 != 4) {
                    z2 = false;
                }
                if (z != z2) {
                    textLayoutWidth = -textLayoutWidth;
                }
                if (this.j0 != textLayoutWidth) {
                    this.j0 = textLayoutWidth;
                    h(false);
                    return;
                }
                return;
            }
            this.j0 = 0;
            h(false);
        }
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.m0;
    }

    public final void j() {
        int i = (int) (this.A0 - this.B0);
        int i2 = (i / 2) + this.v0;
        getLayoutParams().width = (int) (this.q0 + i);
        setPaddingRelative(this.r0 + i2, getPaddingTop(), (this.s0 + i) - i2, getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (e()) {
            nl2.U(this, this.R.a(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        ru3 ru3Var = this.R;
        if (ru3Var != null && ru3Var.t) {
            View.mergeDrawableStates(onCreateDrawableState, D0);
        }
        if (this.m0) {
            View.mergeDrawableStates(onCreateDrawableState, E0);
        }
        return onCreateDrawableState;
    }

    @Override // defpackage.zp, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.m0);
    }

    @Override // defpackage.zp, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        ru3 ru3Var = this.R;
        if (ru3Var != null && ru3Var.t) {
            z = true;
        } else {
            z = false;
        }
        accessibilityNodeInfo.setCheckable(z);
        accessibilityNodeInfo.setChecked(this.m0);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // defpackage.zp, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        i(getMeasuredWidth(), getMeasuredHeight());
        int i6 = getResources().getConfiguration().orientation;
        if (this.p0 != i6) {
            this.p0 = i6;
            this.q0 = -1.0f;
        }
        if (this.q0 == -1.0f) {
            this.q0 = getMeasuredWidth();
            if (this.t0 == null && (getParent() instanceof qu3) && ((qu3) getParent()).getButtonSizeChange() != null) {
                this.t0 = (LinearLayout.LayoutParams) getLayoutParams();
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.t0);
                layoutParams.width = (int) this.q0;
                setLayoutParams(layoutParams);
            }
        }
        boolean z2 = false;
        if (this.x0 == -1) {
            if (this.g0 == null) {
                i5 = 0;
            } else {
                int iconPadding = getIconPadding();
                int i7 = this.i0;
                if (i7 == 0) {
                    i7 = this.g0.getIntrinsicWidth();
                }
                i5 = iconPadding + i7;
            }
            this.x0 = (getMeasuredWidth() - getTextLayoutWidth()) - i5;
        }
        if (this.r0 == -1) {
            this.r0 = getPaddingStart();
        }
        if (this.s0 == -1) {
            this.s0 = getPaddingEnd();
        }
        if ((getParent() instanceof qu3) && ((qu3) getParent()).getOrientation() == 0) {
            z2 = true;
        }
        this.w0 = z2;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof pu3)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        pu3 pu3Var = (pu3) parcelable;
        super.onRestoreInstanceState(pu3Var.A);
        setChecked(pu3Var.L);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [r, android.os.Parcelable, pu3] */
    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? rVar = new r(super.onSaveInstanceState());
        rVar.L = this.m0;
        return rVar;
    }

    @Override // defpackage.zp, android.widget.TextView
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
        if (this.g0 != null) {
            if (this.g0.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.h0 = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (e()) {
            ru3 ru3Var = this.R;
            if (ru3Var.a(false) != null) {
                ru3Var.a(false).setTint(i);
                return;
            }
            return;
        }
        super.setBackgroundColor(i);
    }

    @Override // defpackage.zp, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (e()) {
            if (drawable != getBackground()) {
                Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
                ru3 ru3Var = this.R;
                ru3Var.r = true;
                MaterialButton materialButton = ru3Var.a;
                materialButton.setSupportBackgroundTintList(ru3Var.m);
                materialButton.setSupportBackgroundTintMode(ru3Var.l);
                super.setBackgroundDrawable(drawable);
                return;
            }
            getBackground().setState(drawable.getState());
            return;
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // defpackage.zp, android.view.View
    public void setBackgroundResource(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = l07.M(getContext(), i);
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
            ru3 ru3Var = this.R;
            if (!ru3Var.s || ru3Var.j != i) {
                ru3Var.j = i;
                ru3Var.s = true;
                float f = i;
                z26 f2 = ru3Var.b.f();
                f2.e = new s(f);
                f2.f = new s(f);
                f2.g = new s(f);
                f2.h = new s(f);
                ru3Var.b = f2.a();
                ru3Var.c = null;
                ru3Var.d();
            }
        }
    }

    public void setCornerRadiusResource(int i) {
        if (e()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    public void setCornerSpringForce(qc6 qc6Var) {
        ru3 ru3Var = this.R;
        ru3Var.d = qc6Var;
        if (ru3Var.c != null) {
            ru3Var.d();
        }
    }

    public void setDisplayedWidthDecrease(int i) {
        this.B0 = Math.min(i, this.x0);
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
        if (this.g0 != drawable) {
            this.g0 = drawable;
            h(true);
            i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.o0 != i) {
            this.o0 = i;
            i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i) {
        if (this.l0 != i) {
            this.l0 = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = l07.M(getContext(), i);
        } else {
            drawable = null;
        }
        setIcon(drawable);
    }

    public void setIconSize(int i) {
        if (i >= 0) {
            if (this.i0 != i) {
                this.i0 = i;
                h(true);
                return;
            }
            return;
        }
        i.i("iconSize cannot be less than 0");
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f0 != colorStateList) {
            this.f0 = colorStateList;
            h(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.e0 != mode) {
            this.e0 = mode;
            h(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(jv3.x(getContext(), i));
    }

    public void setInsetBottom(int i) {
        ru3 ru3Var = this.R;
        ru3Var.b(ru3Var.h, i);
    }

    public void setInsetTop(int i) {
        ru3 ru3Var = this.R;
        ru3Var.b(i, ru3Var.i);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(ou3 ou3Var) {
        this.d0 = ou3Var;
    }

    public void setOpticalCenterEnabled(boolean z) {
        if (this.u0 != z) {
            this.u0 = z;
            ru3 ru3Var = this.R;
            if (z) {
                a31 a31Var = new a31(15, this);
                ru3Var.e = a31Var;
                gv3 a = ru3Var.a(false);
                if (a != null) {
                    a.y0 = a31Var;
                }
            } else {
                ru3Var.e = null;
                gv3 a2 = ru3Var.a(false);
                if (a2 != null) {
                    a2.y0 = null;
                }
            }
            post(new tm3(2, this));
        }
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        ou3 ou3Var = this.d0;
        if (ou3Var != null) {
            ((MaterialButtonToggleGroup) ((ka3) ou3Var).B).invalidate();
        }
        super.setPressed(z);
        f(false);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (e()) {
            ru3 ru3Var = this.R;
            MaterialButton materialButton = ru3Var.a;
            if (ru3Var.o != colorStateList) {
                ru3Var.o = colorStateList;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(ng5.a(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        if (e()) {
            setRippleColor(jv3.x(getContext(), i));
        }
    }

    @Override // defpackage.l36
    public void setShapeAppearanceModel(a36 a36Var) {
        if (e()) {
            ru3 ru3Var = this.R;
            ru3Var.b = a36Var;
            ru3Var.c = null;
            ru3Var.d();
            return;
        }
        i.n("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (e()) {
            ru3 ru3Var = this.R;
            ru3Var.q = z;
            ru3Var.e();
        }
    }

    public void setSizeChange(le6 le6Var) {
        if (this.y0 != le6Var) {
            this.y0 = le6Var;
            f(true);
        }
    }

    public void setStateListShapeAppearanceModel(ie6 ie6Var) {
        if (e()) {
            ru3 ru3Var = this.R;
            if (ru3Var.d == null && ie6Var.d()) {
                ru3Var.d = d();
                if (ru3Var.c != null) {
                    ru3Var.d();
                }
            }
            ru3Var.c = ie6Var;
            ru3Var.d();
            return;
        }
        i.n("Attempted to set StateListShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (e()) {
            ru3 ru3Var = this.R;
            if (ru3Var.n != colorStateList) {
                ru3Var.n = colorStateList;
                ru3Var.e();
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (e()) {
            setStrokeColor(jv3.x(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (e()) {
            ru3 ru3Var = this.R;
            if (ru3Var.k != i) {
                ru3Var.k = i;
                ru3Var.e();
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (e()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // defpackage.zp
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (e()) {
            ru3 ru3Var = this.R;
            if (ru3Var.m != colorStateList) {
                ru3Var.m = colorStateList;
                if (ru3Var.a(false) != null) {
                    ru3Var.a(false).setTintList(ru3Var.m);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintList(colorStateList);
    }

    @Override // defpackage.zp
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (e()) {
            ru3 ru3Var = this.R;
            if (ru3Var.l != mode) {
                ru3Var.l = mode;
                if (ru3Var.a(false) != null && ru3Var.l != null) {
                    ru3Var.a(false).setTintMode(ru3Var.l);
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
        this.q0 = -1.0f;
        super.setWidth(i);
    }

    public void setWidthChangeMax(int i) {
        if (this.z0 != i) {
            this.z0 = i;
            f(true);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.m0);
    }
}
