package com.google.android.material.chip;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.preference.Preference;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.Locale;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public class Chip extends bq implements l36, Checkable {
    public static final Rect u0 = new Rect();
    public static final int[] v0 = {16842913};
    public static final int[] w0 = {16842911};
    public do0 c0;
    public InsetDrawable d0;
    public RippleDrawable e0;
    public View.OnClickListener f0;
    public CompoundButton.OnCheckedChangeListener g0;
    public boolean h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public boolean l0;
    public int m0;
    public int n0;
    public CharSequence o0;
    public final co0 p0;
    public boolean q0;
    public final Rect r0;
    public final RectF s0;
    public final ao0 t0;

    public Chip(Context context, AttributeSet attributeSet) {
        super(mh7.n0(context, attributeSet, R.attr.chipStyle, 2132018366), attributeSet, R.attr.chipStyle);
        un6 un6Var;
        a04 a04Var;
        a04 a04Var2;
        float dimension;
        int resourceId;
        int resourceId2;
        int resourceId3;
        this.r0 = new Rect();
        this.s0 = new RectF();
        this.t0 = new ao0(0, this);
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") == null) {
                if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") == null) {
                    if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") == null) {
                        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") == null) {
                            if (attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) == 1 && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) == 1 && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) == 1) {
                                if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                                    Log.w("Chip", "Chip text must be vertically center and start aligned");
                                }
                            } else {
                                vd6.i("Chip does not support multi-line text");
                                throw null;
                            }
                        } else {
                            vd6.i("Please set end drawable using R.attr#closeIcon.");
                            throw null;
                        }
                    } else {
                        vd6.i("Please set end drawable using R.attr#closeIcon.");
                        throw null;
                    }
                } else {
                    vd6.i("Please set start drawable using R.attr#chipIcon.");
                    throw null;
                }
            } else {
                vd6.i("Please set left drawable using R.attr#chipIcon.");
                throw null;
            }
        }
        do0 do0Var = new do0(context2, attributeSet);
        Context context3 = do0Var.i1;
        int[] iArr = ay4.c;
        TypedArray Y = n40.Y(context3, attributeSet, iArr, R.attr.chipStyle, 2132018366, new int[0]);
        do0Var.I1 = Y.hasValue(37);
        Context context4 = do0Var.i1;
        ColorStateList C = nk2.C(context4, Y, 24);
        if (do0Var.B0 != C) {
            do0Var.B0 = C;
            do0Var.onStateChange(do0Var.getState());
        }
        ColorStateList C2 = nk2.C(context4, Y, 11);
        if (do0Var.C0 != C2) {
            do0Var.C0 = C2;
            do0Var.onStateChange(do0Var.getState());
        }
        float dimension2 = Y.getDimension(19, RecyclerView.A1);
        if (do0Var.D0 != dimension2) {
            do0Var.D0 = dimension2;
            do0Var.invalidateSelf();
            do0Var.A();
        }
        if (Y.hasValue(12)) {
            do0Var.G(Y.getDimension(12, RecyclerView.A1));
        }
        do0Var.L(nk2.C(context4, Y, 22));
        do0Var.M(Y.getDimension(23, RecyclerView.A1));
        do0Var.W(nk2.C(context4, Y, 36));
        String text = Y.getText(5);
        text = text == null ? "" : text;
        if (!TextUtils.equals(do0Var.I0, text)) {
            do0Var.I0 = text;
            do0Var.o1.d = true;
            do0Var.invalidateSelf();
            do0Var.A();
        }
        if (Y.hasValue(0) && (resourceId3 = Y.getResourceId(0, 0)) != 0) {
            un6Var = new un6(context4, resourceId3);
        } else {
            un6Var = null;
        }
        un6Var.l = Y.getDimension(1, un6Var.l);
        do0Var.X(un6Var);
        int i = Y.getInt(3, 0);
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    do0Var.F1 = TextUtils.TruncateAt.END;
                }
            } else {
                do0Var.F1 = TextUtils.TruncateAt.MIDDLE;
            }
        } else {
            do0Var.F1 = TextUtils.TruncateAt.START;
        }
        do0Var.K(Y.getBoolean(18, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            do0Var.K(Y.getBoolean(15, false));
        }
        do0Var.H(nk2.D(context4, Y, 14));
        if (Y.hasValue(17)) {
            do0Var.J(nk2.C(context4, Y, 17));
        }
        do0Var.I(Y.getDimension(16, -1.0f));
        do0Var.T(Y.getBoolean(31, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            do0Var.T(Y.getBoolean(26, false));
        }
        do0Var.N(nk2.D(context4, Y, 25));
        do0Var.S(nk2.C(context4, Y, 30));
        do0Var.P(Y.getDimension(28, RecyclerView.A1));
        do0Var.C(Y.getBoolean(6, false));
        do0Var.F(Y.getBoolean(10, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            do0Var.F(Y.getBoolean(8, false));
        }
        do0Var.D(nk2.D(context4, Y, 7));
        if (Y.hasValue(9)) {
            do0Var.E(nk2.C(context4, Y, 9));
        }
        if (Y.hasValue(39) && (resourceId2 = Y.getResourceId(39, 0)) != 0) {
            a04Var = a04.a(context4, resourceId2);
        } else {
            a04Var = null;
        }
        do0Var.Y0 = a04Var;
        if (Y.hasValue(33) && (resourceId = Y.getResourceId(33, 0)) != 0) {
            a04Var2 = a04.a(context4, resourceId);
        } else {
            a04Var2 = null;
        }
        do0Var.Z0 = a04Var2;
        float dimension3 = Y.getDimension(21, RecyclerView.A1);
        if (do0Var.a1 != dimension3) {
            do0Var.a1 = dimension3;
            do0Var.invalidateSelf();
            do0Var.A();
        }
        do0Var.V(Y.getDimension(35, RecyclerView.A1));
        do0Var.U(Y.getDimension(34, RecyclerView.A1));
        float dimension4 = Y.getDimension(41, RecyclerView.A1);
        if (do0Var.d1 != dimension4) {
            do0Var.d1 = dimension4;
            do0Var.invalidateSelf();
            do0Var.A();
        }
        float dimension5 = Y.getDimension(40, RecyclerView.A1);
        if (do0Var.e1 != dimension5) {
            do0Var.e1 = dimension5;
            do0Var.invalidateSelf();
            do0Var.A();
        }
        do0Var.Q(Y.getDimension(29, RecyclerView.A1));
        do0Var.O(Y.getDimension(27, RecyclerView.A1));
        float dimension6 = Y.getDimension(13, RecyclerView.A1);
        if (do0Var.h1 != dimension6) {
            do0Var.h1 = dimension6;
            do0Var.invalidateSelf();
            do0Var.A();
        }
        do0Var.H1 = Y.getDimensionPixelSize(4, Preference.DEFAULT_ORDER);
        Y.recycle();
        n40.C(context2, attributeSet, R.attr.chipStyle, 2132018366);
        n40.E(context2, attributeSet, iArr, R.attr.chipStyle, 2132018366, new int[0]);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, R.attr.chipStyle, 2132018366);
        this.l0 = obtainStyledAttributes.getBoolean(32, false);
        TypedValue O = hk2.O(context2, R.attr.minTouchTargetSize);
        if (O != null && O.type == 5) {
            dimension = O.getDimension(context2.getResources().getDisplayMetrics());
        } else {
            dimension = context2.getResources().getDimension(R.dimen.mtrl_min_touch_target_size);
        }
        this.n0 = (int) Math.ceil(obtainStyledAttributes.getDimension(20, (int) dimension));
        obtainStyledAttributes.recycle();
        setChipDrawable(do0Var);
        do0Var.m(getElevation());
        n40.C(context2, attributeSet, R.attr.chipStyle, 2132018366);
        n40.E(context2, attributeSet, iArr, R.attr.chipStyle, 2132018366, new int[0]);
        TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr, R.attr.chipStyle, 2132018366);
        boolean hasValue = obtainStyledAttributes2.hasValue(37);
        obtainStyledAttributes2.recycle();
        this.p0 = new co0(this, this);
        d();
        if (!hasValue) {
            setOutlineProvider(new bo0(this));
        }
        setChecked(this.h0);
        setText(do0Var.I0);
        setEllipsize(do0Var.F1);
        g();
        if (!this.c0.G1) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        f();
        if (this.l0) {
            setMinHeight(this.n0);
        }
        this.m0 = getLayoutDirection();
        super.setOnCheckedChangeListener(new zn0(0, this));
    }

    private RectF getCloseIconTouchBounds() {
        RectF rectF = this.s0;
        rectF.setEmpty();
        if (c() && this.f0 != null) {
            do0 do0Var = this.c0;
            Rect bounds = do0Var.getBounds();
            rectF.setEmpty();
            if (do0Var.a0()) {
                float f = do0Var.h1 + do0Var.g1 + do0Var.S0 + do0Var.f1 + do0Var.e1;
                if (do0Var.getLayoutDirection() == 0) {
                    float f2 = bounds.right;
                    rectF.right = f2;
                    rectF.left = f2 - f;
                } else {
                    float f3 = bounds.left;
                    rectF.left = f3;
                    rectF.right = f3 + f;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
        }
        return rectF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        Rect rect = this.r0;
        rect.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return rect;
    }

    private un6 getTextAppearance() {
        do0 do0Var = this.c0;
        if (do0Var != null) {
            return do0Var.o1.f;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z) {
        if (this.j0 != z) {
            this.j0 = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.i0 != z) {
            this.i0 = z;
            refreshDrawableState();
        }
    }

    public final void b(int i) {
        int i2;
        this.n0 = i;
        int i3 = 0;
        if (!this.l0) {
            InsetDrawable insetDrawable = this.d0;
            if (insetDrawable != null) {
                if (insetDrawable != null) {
                    this.d0 = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    e();
                    return;
                }
                return;
            }
            e();
            return;
        }
        int max = Math.max(0, i - ((int) this.c0.D0));
        int max2 = Math.max(0, i - this.c0.getIntrinsicWidth());
        if (max2 <= 0 && max <= 0) {
            InsetDrawable insetDrawable2 = this.d0;
            if (insetDrawable2 != null) {
                if (insetDrawable2 != null) {
                    this.d0 = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    e();
                    return;
                }
                return;
            }
            e();
            return;
        }
        if (max2 > 0) {
            i2 = max2 / 2;
        } else {
            i2 = 0;
        }
        if (max > 0) {
            i3 = max / 2;
        }
        int i4 = i3;
        if (this.d0 != null) {
            Rect rect = new Rect();
            this.d0.getPadding(rect);
            if (rect.top == i4 && rect.bottom == i4 && rect.left == i2 && rect.right == i2) {
                e();
                return;
            }
        }
        if (getMinHeight() != i) {
            setMinHeight(i);
        }
        if (getMinWidth() != i) {
            setMinWidth(i);
        }
        this.d0 = new InsetDrawable((Drawable) this.c0, i2, i4, i2, i4);
        e();
    }

    public final boolean c() {
        do0 do0Var = this.c0;
        if (do0Var != null) {
            Drawable drawable = do0Var.P0;
            if (drawable == null) {
                drawable = null;
            }
            if (drawable != null) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void d() {
        do0 do0Var;
        if (c() && (do0Var = this.c0) != null && do0Var.O0 && this.f0 != null) {
            aa7.n(this, this.p0);
            this.q0 = true;
            return;
        }
        aa7.n(this, null);
        this.q0 = false;
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i;
        if (!this.q0) {
            return super.dispatchHoverEvent(motionEvent);
        }
        co0 co0Var = this.p0;
        AccessibilityManager accessibilityManager = co0Var.c0;
        int i2 = 0;
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action != 7 && action != 9) {
                if (action == 10 && (i = co0Var.h0) != Integer.MIN_VALUE) {
                    if (i != Integer.MIN_VALUE) {
                        co0Var.h0 = Integer.MIN_VALUE;
                        co0Var.r(Integer.MIN_VALUE, 128);
                        co0Var.r(i, 256);
                        return true;
                    }
                }
            } else {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                Chip chip = co0Var.i0;
                if (chip.c() && chip.getCloseIconTouchBounds().contains(x, y)) {
                    i2 = 1;
                }
                int i3 = co0Var.h0;
                if (i3 != i2) {
                    co0Var.h0 = i2;
                    co0Var.r(i2, 128);
                    co0Var.r(i3, 256);
                    return true;
                }
            }
            return true;
        }
        if (!super.dispatchHoverEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.q0) {
            return super.dispatchKeyEvent(keyEvent);
        }
        co0 co0Var = this.p0;
        co0Var.getClass();
        boolean z = false;
        int i = 0;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i2 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode != 19) {
                                    if (keyCode != 21) {
                                        if (keyCode != 22) {
                                            i2 = 130;
                                        }
                                    } else {
                                        i2 = 17;
                                    }
                                } else {
                                    i2 = 33;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z2 = false;
                                while (i < repeatCount && co0Var.m(i2, null)) {
                                    i++;
                                    z2 = true;
                                }
                                z = z2;
                                break;
                            }
                            break;
                    }
                }
                if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                    int i3 = co0Var.g0;
                    if (i3 != Integer.MIN_VALUE) {
                        Chip chip = co0Var.i0;
                        if (i3 == 0) {
                            chip.performClick();
                        } else if (i3 == 1) {
                            chip.playSoundEffect(0);
                            View.OnClickListener onClickListener = chip.f0;
                            if (onClickListener != null) {
                                onClickListener.onClick(chip);
                            }
                            if (chip.q0) {
                                chip.p0.r(1, 1);
                            }
                        }
                    }
                    z = true;
                }
            } else if (keyEvent.hasNoModifiers()) {
                z = co0Var.m(2, null);
            } else if (keyEvent.hasModifiers(1)) {
                z = co0Var.m(1, null);
            }
        }
        if (z && co0Var.g0 != Integer.MIN_VALUE) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // defpackage.bq, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        do0 do0Var = this.c0;
        boolean z = false;
        int i = 0;
        z = false;
        if (do0Var != null && do0.z(do0Var.P0)) {
            do0 do0Var2 = this.c0;
            ?? isEnabled = isEnabled();
            int i2 = isEnabled;
            if (this.k0) {
                i2 = isEnabled + 1;
            }
            int i3 = i2;
            if (this.j0) {
                i3 = i2 + 1;
            }
            int i4 = i3;
            if (this.i0) {
                i4 = i3 + 1;
            }
            int i5 = i4;
            if (isChecked()) {
                i5 = i4 + 1;
            }
            int[] iArr = new int[i5];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i = 1;
            }
            if (this.k0) {
                iArr[i] = 16842908;
                i++;
            }
            if (this.j0) {
                iArr[i] = 16843623;
                i++;
            }
            if (this.i0) {
                iArr[i] = 16842919;
                i++;
            }
            if (isChecked()) {
                iArr[i] = 16842913;
            }
            z = do0Var2.R(iArr);
        }
        if (z) {
            invalidate();
        }
    }

    public final void e() {
        this.e0 = new RippleDrawable(ng5.a(this.c0.H0), getBackgroundDrawable(), null);
        this.c0.getClass();
        setBackground(this.e0);
        f();
    }

    public final void f() {
        do0 do0Var;
        if (!TextUtils.isEmpty(getText()) && (do0Var = this.c0) != null) {
            int w = (int) (do0Var.w() + do0Var.h1 + do0Var.e1);
            do0 do0Var2 = this.c0;
            int v = (int) (do0Var2.v() + do0Var2.a1 + do0Var2.d1);
            if (this.d0 != null) {
                Rect rect = new Rect();
                this.d0.getPadding(rect);
                v += rect.left;
                w += rect.right;
            }
            setPaddingRelative(v, getPaddingTop(), w, getPaddingBottom());
        }
    }

    public final void g() {
        TextPaint paint = getPaint();
        do0 do0Var = this.c0;
        if (do0Var != null) {
            paint.drawableState = do0Var.getState();
        }
        un6 textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.d(getContext(), paint, this.t0);
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.o0)) {
            return this.o0;
        }
        do0 do0Var = this.c0;
        if (do0Var != null && do0Var.U0) {
            getParent();
            return "android.widget.Button";
        } else if (isClickable()) {
            return "android.widget.Button";
        } else {
            return "android.view.View";
        }
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.d0;
        if (insetDrawable == null) {
            return this.c0;
        }
        return insetDrawable;
    }

    public Drawable getCheckedIcon() {
        do0 do0Var = this.c0;
        if (do0Var != null) {
            return do0Var.W0;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        do0 do0Var = this.c0;
        if (do0Var != null) {
            return do0Var.X0;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        do0 do0Var = this.c0;
        if (do0Var != null) {
            return do0Var.C0;
        }
        return null;
    }

    public float getChipCornerRadius() {
        do0 do0Var = this.c0;
        if (do0Var == null) {
            return RecyclerView.A1;
        }
        return Math.max((float) RecyclerView.A1, do0Var.x());
    }

    public Drawable getChipDrawable() {
        return this.c0;
    }

    public float getChipEndPadding() {
        do0 do0Var = this.c0;
        if (do0Var != null) {
            return do0Var.h1;
        }
        return RecyclerView.A1;
    }

    public Drawable getChipIcon() {
        Drawable drawable;
        do0 do0Var = this.c0;
        if (do0Var == null || (drawable = do0Var.K0) == null) {
            return null;
        }
        return drawable;
    }

    public float getChipIconSize() {
        do0 do0Var = this.c0;
        if (do0Var != null) {
            return do0Var.M0;
        }
        return RecyclerView.A1;
    }

    public ColorStateList getChipIconTint() {
        do0 do0Var = this.c0;
        if (do0Var != null) {
            return do0Var.L0;
        }
        return null;
    }

    public float getChipMinHeight() {
        do0 do0Var = this.c0;
        if (do0Var != null) {
            return do0Var.D0;
        }
        return RecyclerView.A1;
    }

    public float getChipStartPadding() {
        do0 do0Var = this.c0;
        if (do0Var != null) {
            return do0Var.a1;
        }
        return RecyclerView.A1;
    }

    public ColorStateList getChipStrokeColor() {
        do0 do0Var = this.c0;
        if (do0Var != null) {
            return do0Var.F0;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        do0 do0Var = this.c0;
        if (do0Var != null) {
            return do0Var.G0;
        }
        return RecyclerView.A1;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        Drawable drawable;
        do0 do0Var = this.c0;
        if (do0Var == null || (drawable = do0Var.P0) == null) {
            return null;
        }
        return drawable;
    }

    public CharSequence getCloseIconContentDescription() {
        do0 do0Var = this.c0;
        if (do0Var != null) {
            return do0Var.T0;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        do0 do0Var = this.c0;
        if (do0Var != null) {
            return do0Var.g1;
        }
        return RecyclerView.A1;
    }

    public float getCloseIconSize() {
        do0 do0Var = this.c0;
        if (do0Var != null) {
            return do0Var.S0;
        }
        return RecyclerView.A1;
    }

    public float getCloseIconStartPadding() {
        do0 do0Var = this.c0;
        if (do0Var != null) {
            return do0Var.f1;
        }
        return RecyclerView.A1;
    }

    public ColorStateList getCloseIconTint() {
        do0 do0Var = this.c0;
        if (do0Var != null) {
            return do0Var.R0;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        do0 do0Var = this.c0;
        if (do0Var != null) {
            return do0Var.F1;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.q0) {
            co0 co0Var = this.p0;
            if (co0Var.g0 == 1 || co0Var.f0 == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public a04 getHideMotionSpec() {
        do0 do0Var = this.c0;
        if (do0Var != null) {
            return do0Var.Z0;
        }
        return null;
    }

    public float getIconEndPadding() {
        do0 do0Var = this.c0;
        if (do0Var != null) {
            return do0Var.c1;
        }
        return RecyclerView.A1;
    }

    public float getIconStartPadding() {
        do0 do0Var = this.c0;
        if (do0Var != null) {
            return do0Var.b1;
        }
        return RecyclerView.A1;
    }

    public ColorStateList getRippleColor() {
        do0 do0Var = this.c0;
        if (do0Var != null) {
            return do0Var.H0;
        }
        return null;
    }

    public a36 getShapeAppearanceModel() {
        return this.c0.B.a;
    }

    public a04 getShowMotionSpec() {
        do0 do0Var = this.c0;
        if (do0Var != null) {
            return do0Var.Y0;
        }
        return null;
    }

    public float getTextEndPadding() {
        do0 do0Var = this.c0;
        if (do0Var != null) {
            return do0Var.e1;
        }
        return RecyclerView.A1;
    }

    public float getTextStartPadding() {
        do0 do0Var = this.c0;
        if (do0Var != null) {
            return do0Var.d1;
        }
        return RecyclerView.A1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        nl2.U(this, this.c0);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, v0);
        }
        do0 do0Var = this.c0;
        if (do0Var != null && do0Var.U0) {
            View.mergeDrawableStates(onCreateDrawableState, w0);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (this.q0) {
            co0 co0Var = this.p0;
            int i2 = co0Var.g0;
            if (i2 != Integer.MIN_VALUE) {
                co0Var.j(i2);
            }
            if (z) {
                co0Var.m(i, rect);
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10) {
                setCloseIconHovered(false);
            }
        } else {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        do0 do0Var = this.c0;
        if (do0Var != null && do0Var.U0) {
            z = true;
        } else {
            z = false;
        }
        accessibilityNodeInfo.setCheckable(z);
        accessibilityNodeInfo.setClickable(isClickable());
        getParent();
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        if (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) {
            return PointerIcon.getSystemIcon(getContext(), 1002);
        }
        return super.onResolvePointerIcon(motionEvent, i);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.m0 != i) {
            this.m0 = i;
            f();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
        if (r0 != 3) goto L16;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L4a
            if (r0 == r2) goto L2c
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L45
            goto L50
        L21:
            boolean r0 = r5.i0
            if (r0 == 0) goto L50
            if (r1 != 0) goto L2a
            r5.setCloseIconPressed(r3)
        L2a:
            r0 = r2
            goto L51
        L2c:
            boolean r0 = r5.i0
            if (r0 == 0) goto L45
            r5.playSoundEffect(r3)
            android.view.View$OnClickListener r0 = r5.f0
            if (r0 == 0) goto L3a
            r0.onClick(r5)
        L3a:
            boolean r0 = r5.q0
            if (r0 == 0) goto L43
            co0 r0 = r5.p0
            r0.r(r2, r2)
        L43:
            r0 = r2
            goto L46
        L45:
            r0 = r3
        L46:
            r5.setCloseIconPressed(r3)
            goto L51
        L4a:
            if (r1 == 0) goto L50
            r5.setCloseIconPressed(r2)
            goto L2a
        L50:
            r0 = r3
        L51:
            if (r0 != 0) goto L5b
            boolean r5 = super.onTouchEvent(r6)
            if (r5 == 0) goto L5a
            goto L5b
        L5a:
            return r3
        L5b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.o0 = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable != getBackgroundDrawable() && drawable != this.e0) {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        } else {
            super.setBackground(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // defpackage.bq, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != getBackgroundDrawable() && drawable != this.e0) {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        } else {
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // defpackage.bq, android.view.View
    public void setBackgroundResource(int i) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z) {
        do0 do0Var = this.c0;
        if (do0Var != null) {
            do0Var.C(z);
        }
    }

    public void setCheckableResource(int i) {
        do0 do0Var = this.c0;
        if (do0Var != null) {
            do0Var.C(do0Var.i1.getResources().getBoolean(i));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        do0 do0Var = this.c0;
        if (do0Var == null) {
            this.h0 = z;
        } else if (do0Var.U0) {
            super.setChecked(z);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        do0 do0Var = this.c0;
        if (do0Var != null) {
            do0Var.D(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(int i) {
        do0 do0Var = this.c0;
        if (do0Var != null) {
            do0Var.D(l07.M(do0Var.i1, i));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        do0 do0Var = this.c0;
        if (do0Var != null) {
            do0Var.E(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        do0 do0Var = this.c0;
        if (do0Var != null) {
            do0Var.E(jv3.x(do0Var.i1, i));
        }
    }

    public void setCheckedIconVisible(int i) {
        do0 do0Var = this.c0;
        if (do0Var != null) {
            do0Var.F(do0Var.i1.getResources().getBoolean(i));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        do0 do0Var = this.c0;
        if (do0Var != null && do0Var.C0 != colorStateList) {
            do0Var.C0 = colorStateList;
            do0Var.onStateChange(do0Var.getState());
        }
    }

    public void setChipBackgroundColorResource(int i) {
        ColorStateList x;
        do0 do0Var = this.c0;
        if (do0Var != null && do0Var.C0 != (x = jv3.x(do0Var.i1, i))) {
            do0Var.C0 = x;
            do0Var.onStateChange(do0Var.getState());
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        do0 do0Var = this.c0;
        if (do0Var != null) {
            do0Var.G(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        do0 do0Var = this.c0;
        if (do0Var != null) {
            do0Var.G(do0Var.i1.getResources().getDimension(i));
        }
    }

    public void setChipDrawable(do0 do0Var) {
        do0 do0Var2 = this.c0;
        if (do0Var2 != do0Var) {
            if (do0Var2 != null) {
                do0Var2.E1 = new WeakReference(null);
            }
            this.c0 = do0Var;
            do0Var.G1 = false;
            do0Var.E1 = new WeakReference(this);
            b(this.n0);
        }
    }

    public void setChipEndPadding(float f) {
        do0 do0Var = this.c0;
        if (do0Var != null && do0Var.h1 != f) {
            do0Var.h1 = f;
            do0Var.invalidateSelf();
            do0Var.A();
        }
    }

    public void setChipEndPaddingResource(int i) {
        do0 do0Var = this.c0;
        if (do0Var != null) {
            float dimension = do0Var.i1.getResources().getDimension(i);
            if (do0Var.h1 != dimension) {
                do0Var.h1 = dimension;
                do0Var.invalidateSelf();
                do0Var.A();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        do0 do0Var = this.c0;
        if (do0Var != null) {
            do0Var.H(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(int i) {
        do0 do0Var = this.c0;
        if (do0Var != null) {
            do0Var.H(l07.M(do0Var.i1, i));
        }
    }

    public void setChipIconSize(float f) {
        do0 do0Var = this.c0;
        if (do0Var != null) {
            do0Var.I(f);
        }
    }

    public void setChipIconSizeResource(int i) {
        do0 do0Var = this.c0;
        if (do0Var != null) {
            do0Var.I(do0Var.i1.getResources().getDimension(i));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        do0 do0Var = this.c0;
        if (do0Var != null) {
            do0Var.J(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        do0 do0Var = this.c0;
        if (do0Var != null) {
            do0Var.J(jv3.x(do0Var.i1, i));
        }
    }

    public void setChipIconVisible(int i) {
        do0 do0Var = this.c0;
        if (do0Var != null) {
            do0Var.K(do0Var.i1.getResources().getBoolean(i));
        }
    }

    public void setChipMinHeight(float f) {
        do0 do0Var = this.c0;
        if (do0Var != null && do0Var.D0 != f) {
            do0Var.D0 = f;
            do0Var.invalidateSelf();
            do0Var.A();
        }
    }

    public void setChipMinHeightResource(int i) {
        do0 do0Var = this.c0;
        if (do0Var != null) {
            float dimension = do0Var.i1.getResources().getDimension(i);
            if (do0Var.D0 != dimension) {
                do0Var.D0 = dimension;
                do0Var.invalidateSelf();
                do0Var.A();
            }
        }
    }

    public void setChipStartPadding(float f) {
        do0 do0Var = this.c0;
        if (do0Var != null && do0Var.a1 != f) {
            do0Var.a1 = f;
            do0Var.invalidateSelf();
            do0Var.A();
        }
    }

    public void setChipStartPaddingResource(int i) {
        do0 do0Var = this.c0;
        if (do0Var != null) {
            float dimension = do0Var.i1.getResources().getDimension(i);
            if (do0Var.a1 != dimension) {
                do0Var.a1 = dimension;
                do0Var.invalidateSelf();
                do0Var.A();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        do0 do0Var = this.c0;
        if (do0Var != null) {
            do0Var.L(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        do0 do0Var = this.c0;
        if (do0Var != null) {
            do0Var.L(jv3.x(do0Var.i1, i));
        }
    }

    public void setChipStrokeWidth(float f) {
        do0 do0Var = this.c0;
        if (do0Var != null) {
            do0Var.M(f);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        do0 do0Var = this.c0;
        if (do0Var != null) {
            do0Var.M(do0Var.i1.getResources().getDimension(i));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(Drawable drawable) {
        do0 do0Var = this.c0;
        if (do0Var != null) {
            do0Var.N(drawable);
        }
        d();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        l20 l20Var;
        do0 do0Var = this.c0;
        if (do0Var != null && do0Var.T0 != charSequence) {
            String str = l20.b;
            if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
                l20Var = l20.e;
            } else {
                l20Var = l20.d;
            }
            l20Var.getClass();
            i40 i40Var = uo6.a;
            do0Var.T0 = l20Var.c(charSequence);
            do0Var.invalidateSelf();
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f) {
        do0 do0Var = this.c0;
        if (do0Var != null) {
            do0Var.O(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        do0 do0Var = this.c0;
        if (do0Var != null) {
            do0Var.O(do0Var.i1.getResources().getDimension(i));
        }
    }

    public void setCloseIconResource(int i) {
        do0 do0Var = this.c0;
        if (do0Var != null) {
            do0Var.N(l07.M(do0Var.i1, i));
        }
        d();
    }

    public void setCloseIconSize(float f) {
        do0 do0Var = this.c0;
        if (do0Var != null) {
            do0Var.P(f);
        }
    }

    public void setCloseIconSizeResource(int i) {
        do0 do0Var = this.c0;
        if (do0Var != null) {
            do0Var.P(do0Var.i1.getResources().getDimension(i));
        }
    }

    public void setCloseIconStartPadding(float f) {
        do0 do0Var = this.c0;
        if (do0Var != null) {
            do0Var.Q(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        do0 do0Var = this.c0;
        if (do0Var != null) {
            do0Var.Q(do0Var.i1.getResources().getDimension(i));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        do0 do0Var = this.c0;
        if (do0Var != null) {
            do0Var.S(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        do0 do0Var = this.c0;
        if (do0Var != null) {
            do0Var.S(jv3.x(do0Var.i1, i));
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    @Override // defpackage.bq, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable == null) {
            if (drawable3 == null) {
                super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
                return;
            } else {
                vd6.i("Please set end drawable using R.attr#closeIcon.");
                return;
            }
        }
        vd6.i("Please set start drawable using R.attr#chipIcon.");
    }

    @Override // defpackage.bq, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable == null) {
            if (drawable3 == null) {
                super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
                return;
            } else {
                vd6.i("Please set end drawable using R.attr#closeIcon.");
                return;
            }
        }
        vd6.i("Please set start drawable using R.attr#chipIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i == 0) {
            if (i3 == 0) {
                super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
                return;
            } else {
                vd6.i("Please set end drawable using R.attr#closeIcon.");
                return;
            }
        }
        vd6.i("Please set start drawable using R.attr#chipIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i == 0) {
            if (i3 == 0) {
                super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
                return;
            } else {
                vd6.i("Please set end drawable using R.attr#closeIcon.");
                return;
            }
        }
        vd6.i("Please set start drawable using R.attr#chipIcon.");
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        do0 do0Var = this.c0;
        if (do0Var != null) {
            do0Var.m(f);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.c0 != null) {
            if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
                super.setEllipsize(truncateAt);
                do0 do0Var = this.c0;
                if (do0Var != null) {
                    do0Var.F1 = truncateAt;
                    return;
                }
                return;
            }
            vd6.i("Text within a chip are not allowed to scroll.");
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.l0 = z;
        b(this.n0);
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        if (i != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i);
        }
    }

    public void setHideMotionSpec(a04 a04Var) {
        do0 do0Var = this.c0;
        if (do0Var != null) {
            do0Var.Z0 = a04Var;
        }
    }

    public void setHideMotionSpecResource(int i) {
        do0 do0Var = this.c0;
        if (do0Var != null) {
            do0Var.Z0 = a04.a(do0Var.i1, i);
        }
    }

    public void setIconEndPadding(float f) {
        do0 do0Var = this.c0;
        if (do0Var != null) {
            do0Var.U(f);
        }
    }

    public void setIconEndPaddingResource(int i) {
        do0 do0Var = this.c0;
        if (do0Var != null) {
            do0Var.U(do0Var.i1.getResources().getDimension(i));
        }
    }

    public void setIconStartPadding(float f) {
        do0 do0Var = this.c0;
        if (do0Var != null) {
            do0Var.V(f);
        }
    }

    public void setIconStartPaddingResource(int i) {
        do0 do0Var = this.c0;
        if (do0Var != null) {
            do0Var.V(do0Var.i1.getResources().getDimension(i));
        }
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        if (this.c0 == null) {
            return;
        }
        super.setLayoutDirection(i);
    }

    @Override // android.widget.TextView
    public void setLines(int i) {
        if (i <= 1) {
            super.setLines(i);
        } else {
            vd6.i("Chip does not support multi-line text");
        }
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        if (i <= 1) {
            super.setMaxLines(i);
        } else {
            vd6.i("Chip does not support multi-line text");
        }
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        do0 do0Var = this.c0;
        if (do0Var != null) {
            do0Var.H1 = i;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i) {
        if (i <= 1) {
            super.setMinLines(i);
        } else {
            vd6.i("Chip does not support multi-line text");
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.g0 = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f0 = onClickListener;
        d();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        do0 do0Var = this.c0;
        if (do0Var != null) {
            do0Var.W(colorStateList);
        }
        this.c0.getClass();
        e();
    }

    public void setRippleColorResource(int i) {
        do0 do0Var = this.c0;
        if (do0Var != null) {
            do0Var.W(jv3.x(do0Var.i1, i));
            this.c0.getClass();
            e();
        }
    }

    @Override // defpackage.l36
    public void setShapeAppearanceModel(a36 a36Var) {
        this.c0.setShapeAppearanceModel(a36Var);
    }

    public void setShowMotionSpec(a04 a04Var) {
        do0 do0Var = this.c0;
        if (do0Var != null) {
            do0Var.Y0 = a04Var;
        }
    }

    public void setShowMotionSpecResource(int i) {
        do0 do0Var = this.c0;
        if (do0Var != null) {
            do0Var.Y0 = a04.a(do0Var.i1, i);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z) {
        if (z) {
            super.setSingleLine(z);
        } else {
            vd6.i("Chip does not support multi-line text");
        }
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        CharSequence charSequence2;
        do0 do0Var = this.c0;
        if (do0Var != null) {
            if (charSequence == null) {
                charSequence = "";
            }
            if (do0Var.G1) {
                charSequence2 = null;
            } else {
                charSequence2 = charSequence;
            }
            super.setText(charSequence2, bufferType);
            do0 do0Var2 = this.c0;
            if (do0Var2 != null && !TextUtils.equals(do0Var2.I0, charSequence)) {
                do0Var2.I0 = charSequence;
                do0Var2.o1.d = true;
                do0Var2.invalidateSelf();
                do0Var2.A();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        do0 do0Var = this.c0;
        if (do0Var != null) {
            do0Var.X(new un6(do0Var.i1, i));
        }
        g();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f) {
        do0 do0Var = this.c0;
        if (do0Var != null && do0Var.e1 != f) {
            do0Var.e1 = f;
            do0Var.invalidateSelf();
            do0Var.A();
        }
    }

    public void setTextEndPaddingResource(int i) {
        do0 do0Var = this.c0;
        if (do0Var != null) {
            float dimension = do0Var.i1.getResources().getDimension(i);
            if (do0Var.e1 != dimension) {
                do0Var.e1 = dimension;
                do0Var.invalidateSelf();
                do0Var.A();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        do0 do0Var = this.c0;
        if (do0Var != null) {
            float applyDimension = TypedValue.applyDimension(i, f, getResources().getDisplayMetrics());
            wo6 wo6Var = do0Var.o1;
            un6 un6Var = wo6Var.f;
            if (un6Var != null) {
                un6Var.l = applyDimension;
                wo6Var.a.setTextSize(applyDimension);
                do0Var.A();
                do0Var.invalidateSelf();
            }
        }
        g();
    }

    public void setTextStartPadding(float f) {
        do0 do0Var = this.c0;
        if (do0Var != null && do0Var.d1 != f) {
            do0Var.d1 = f;
            do0Var.invalidateSelf();
            do0Var.A();
        }
    }

    public void setTextStartPaddingResource(int i) {
        do0 do0Var = this.c0;
        if (do0Var != null) {
            float dimension = do0Var.i1.getResources().getDimension(i);
            if (do0Var.d1 != dimension) {
                do0Var.d1 = dimension;
                do0Var.invalidateSelf();
                do0Var.A();
            }
        }
    }

    public void setCloseIconVisible(boolean z) {
        do0 do0Var = this.c0;
        if (do0Var != null) {
            do0Var.T(z);
        }
        d();
    }

    public void setCheckedIconVisible(boolean z) {
        do0 do0Var = this.c0;
        if (do0Var != null) {
            do0Var.F(z);
        }
    }

    public void setChipIconVisible(boolean z) {
        do0 do0Var = this.c0;
        if (do0Var != null) {
            do0Var.K(z);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            vd6.i("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            vd6.i("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            vd6.i("Please set left drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            vd6.i("Please set right drawable using R.attr#closeIcon.");
        }
    }

    public void setTextAppearance(un6 un6Var) {
        do0 do0Var = this.c0;
        if (do0Var != null) {
            do0Var.X(un6Var);
        }
        g();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        do0 do0Var = this.c0;
        if (do0Var != null) {
            do0Var.X(new un6(do0Var.i1, i));
        }
        g();
    }

    public void setInternalOnCheckedChangeListener(av3 av3Var) {
    }
}
