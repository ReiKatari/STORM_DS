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
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.stormds.emulator.R;
import java.lang.ref.WeakReference;
import java.util.Locale;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class Chip extends nq implements xe6, Checkable {
    public static final Rect v0 = new Rect();
    public static final int[] w0 = {16842913};
    public static final int[] x0 = {16842911};
    public nq0 d0;
    public InsetDrawable e0;
    public RippleDrawable f0;
    public View.OnClickListener g0;
    public CompoundButton.OnCheckedChangeListener h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public boolean l0;
    public boolean m0;
    public int n0;
    public int o0;
    public CharSequence p0;
    public final mq0 q0;
    public boolean r0;
    public final Rect s0;
    public final RectF t0;
    public final kq0 u0;

    public Chip(Context context, AttributeSet attributeSet) {
        super(q60.e0(context, attributeSet, R.attr.chipStyle, 2132018374), attributeSet, R.attr.chipStyle);
        g07 g07Var;
        f84 f84Var;
        f84 f84Var2;
        float dimension;
        int resourceId;
        int resourceId2;
        int resourceId3;
        this.s0 = new Rect();
        this.t0 = new RectF();
        this.u0 = new kq0(this, 0);
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
                                fa6.h("Chip does not support multi-line text");
                                throw null;
                            }
                        } else {
                            fa6.h("Please set end drawable using R.attr#closeIcon.");
                            throw null;
                        }
                    } else {
                        fa6.h("Please set end drawable using R.attr#closeIcon.");
                        throw null;
                    }
                } else {
                    fa6.h("Please set start drawable using R.attr#chipIcon.");
                    throw null;
                }
            } else {
                fa6.h("Please set left drawable using R.attr#chipIcon.");
                throw null;
            }
        }
        nq0 nq0Var = new nq0(context2, attributeSet);
        Context context3 = nq0Var.j1;
        int[] iArr = a75.c;
        TypedArray K = f04.K(context3, attributeSet, iArr, R.attr.chipStyle, 2132018374, new int[0]);
        nq0Var.J1 = K.hasValue(37);
        Context context4 = nq0Var.j1;
        ColorStateList S = np2.S(context4, K, 24);
        if (nq0Var.C0 != S) {
            nq0Var.C0 = S;
            nq0Var.onStateChange(nq0Var.getState());
        }
        ColorStateList S2 = np2.S(context4, K, 11);
        if (nq0Var.D0 != S2) {
            nq0Var.D0 = S2;
            nq0Var.onStateChange(nq0Var.getState());
        }
        float dimension2 = K.getDimension(19, RecyclerView.B1);
        if (nq0Var.E0 != dimension2) {
            nq0Var.E0 = dimension2;
            nq0Var.invalidateSelf();
            nq0Var.A();
        }
        if (K.hasValue(12)) {
            nq0Var.G(K.getDimension(12, RecyclerView.B1));
        }
        nq0Var.L(np2.S(context4, K, 22));
        nq0Var.M(K.getDimension(23, RecyclerView.B1));
        nq0Var.W(np2.S(context4, K, 36));
        String text = K.getText(5);
        text = text == null ? "" : text;
        if (!TextUtils.equals(nq0Var.J0, text)) {
            nq0Var.J0 = text;
            nq0Var.p1.d = true;
            nq0Var.invalidateSelf();
            nq0Var.A();
        }
        if (K.hasValue(0) && (resourceId3 = K.getResourceId(0, 0)) != 0) {
            g07Var = new g07(context4, resourceId3);
        } else {
            g07Var = null;
        }
        g07Var.l = K.getDimension(1, g07Var.l);
        nq0Var.X(g07Var);
        int i = K.getInt(3, 0);
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    nq0Var.G1 = TextUtils.TruncateAt.END;
                }
            } else {
                nq0Var.G1 = TextUtils.TruncateAt.MIDDLE;
            }
        } else {
            nq0Var.G1 = TextUtils.TruncateAt.START;
        }
        nq0Var.K(K.getBoolean(18, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            nq0Var.K(K.getBoolean(15, false));
        }
        nq0Var.H(np2.T(context4, K, 14));
        if (K.hasValue(17)) {
            nq0Var.J(np2.S(context4, K, 17));
        }
        nq0Var.I(K.getDimension(16, -1.0f));
        nq0Var.T(K.getBoolean(31, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            nq0Var.T(K.getBoolean(26, false));
        }
        nq0Var.N(np2.T(context4, K, 25));
        nq0Var.S(np2.S(context4, K, 30));
        nq0Var.P(K.getDimension(28, RecyclerView.B1));
        nq0Var.C(K.getBoolean(6, false));
        nq0Var.F(K.getBoolean(10, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            nq0Var.F(K.getBoolean(8, false));
        }
        nq0Var.D(np2.T(context4, K, 7));
        if (K.hasValue(9)) {
            nq0Var.E(np2.S(context4, K, 9));
        }
        if (K.hasValue(39) && (resourceId2 = K.getResourceId(39, 0)) != 0) {
            f84Var = f84.a(context4, resourceId2);
        } else {
            f84Var = null;
        }
        nq0Var.Z0 = f84Var;
        if (K.hasValue(33) && (resourceId = K.getResourceId(33, 0)) != 0) {
            f84Var2 = f84.a(context4, resourceId);
        } else {
            f84Var2 = null;
        }
        nq0Var.a1 = f84Var2;
        float dimension3 = K.getDimension(21, RecyclerView.B1);
        if (nq0Var.b1 != dimension3) {
            nq0Var.b1 = dimension3;
            nq0Var.invalidateSelf();
            nq0Var.A();
        }
        nq0Var.V(K.getDimension(35, RecyclerView.B1));
        nq0Var.U(K.getDimension(34, RecyclerView.B1));
        float dimension4 = K.getDimension(41, RecyclerView.B1);
        if (nq0Var.e1 != dimension4) {
            nq0Var.e1 = dimension4;
            nq0Var.invalidateSelf();
            nq0Var.A();
        }
        float dimension5 = K.getDimension(40, RecyclerView.B1);
        if (nq0Var.f1 != dimension5) {
            nq0Var.f1 = dimension5;
            nq0Var.invalidateSelf();
            nq0Var.A();
        }
        nq0Var.Q(K.getDimension(29, RecyclerView.B1));
        nq0Var.O(K.getDimension(27, RecyclerView.B1));
        float dimension6 = K.getDimension(13, RecyclerView.B1);
        if (nq0Var.i1 != dimension6) {
            nq0Var.i1 = dimension6;
            nq0Var.invalidateSelf();
            nq0Var.A();
        }
        nq0Var.I1 = K.getDimensionPixelSize(4, Integer.MAX_VALUE);
        K.recycle();
        f04.r(context2, attributeSet, R.attr.chipStyle, 2132018374);
        f04.s(context2, attributeSet, iArr, R.attr.chipStyle, 2132018374, new int[0]);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, R.attr.chipStyle, 2132018374);
        this.m0 = obtainStyledAttributes.getBoolean(32, false);
        TypedValue M = qo2.M(context2, R.attr.minTouchTargetSize);
        if (M != null && M.type == 5) {
            dimension = M.getDimension(context2.getResources().getDisplayMetrics());
        } else {
            dimension = context2.getResources().getDimension(R.dimen.mtrl_min_touch_target_size);
        }
        this.o0 = (int) Math.ceil(obtainStyledAttributes.getDimension(20, (int) dimension));
        obtainStyledAttributes.recycle();
        setChipDrawable(nq0Var);
        nq0Var.m(getElevation());
        f04.r(context2, attributeSet, R.attr.chipStyle, 2132018374);
        f04.s(context2, attributeSet, iArr, R.attr.chipStyle, 2132018374, new int[0]);
        TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr, R.attr.chipStyle, 2132018374);
        boolean hasValue = obtainStyledAttributes2.hasValue(37);
        obtainStyledAttributes2.recycle();
        this.q0 = new mq0(this, this);
        d();
        if (!hasValue) {
            setOutlineProvider(new lq0(this));
        }
        setChecked(this.i0);
        setText(nq0Var.J0);
        setEllipsize(nq0Var.G1);
        g();
        if (!this.d0.H1) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        f();
        if (this.m0) {
            setMinHeight(this.o0);
        }
        this.n0 = getLayoutDirection();
        super.setOnCheckedChangeListener(new jq0(this, 0));
    }

    private RectF getCloseIconTouchBounds() {
        RectF rectF = this.t0;
        rectF.setEmpty();
        if (c() && this.g0 != null) {
            nq0 nq0Var = this.d0;
            Rect bounds = nq0Var.getBounds();
            rectF.setEmpty();
            if (nq0Var.a0()) {
                float f = nq0Var.i1 + nq0Var.h1 + nq0Var.T0 + nq0Var.g1 + nq0Var.f1;
                if (nq0Var.getLayoutDirection() == 0) {
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
        Rect rect = this.s0;
        rect.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return rect;
    }

    private g07 getTextAppearance() {
        nq0 nq0Var = this.d0;
        if (nq0Var != null) {
            return nq0Var.p1.f;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z) {
        if (this.k0 != z) {
            this.k0 = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.j0 != z) {
            this.j0 = z;
            refreshDrawableState();
        }
    }

    public final void b(int i) {
        int i2;
        this.o0 = i;
        int i3 = 0;
        if (!this.m0) {
            InsetDrawable insetDrawable = this.e0;
            if (insetDrawable != null) {
                if (insetDrawable != null) {
                    this.e0 = null;
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
        int max = Math.max(0, i - ((int) this.d0.E0));
        int max2 = Math.max(0, i - this.d0.getIntrinsicWidth());
        if (max2 <= 0 && max <= 0) {
            InsetDrawable insetDrawable2 = this.e0;
            if (insetDrawable2 != null) {
                if (insetDrawable2 != null) {
                    this.e0 = null;
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
        if (this.e0 != null) {
            Rect rect = new Rect();
            this.e0.getPadding(rect);
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
        this.e0 = new InsetDrawable((Drawable) this.d0, i2, i4, i2, i4);
        e();
    }

    public final boolean c() {
        nq0 nq0Var = this.d0;
        if (nq0Var != null) {
            Drawable drawable = nq0Var.Q0;
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
        nq0 nq0Var;
        if (c() && (nq0Var = this.d0) != null && nq0Var.P0 && this.g0 != null) {
            ao7.n(this, this.q0);
            this.r0 = true;
            return;
        }
        ao7.n(this, null);
        this.r0 = false;
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i;
        if (!this.r0) {
            return super.dispatchHoverEvent(motionEvent);
        }
        mq0 mq0Var = this.q0;
        AccessibilityManager accessibilityManager = mq0Var.d0;
        int i2 = 0;
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action != 7 && action != 9) {
                if (action == 10 && (i = mq0Var.i0) != Integer.MIN_VALUE) {
                    if (i != Integer.MIN_VALUE) {
                        mq0Var.i0 = Integer.MIN_VALUE;
                        mq0Var.r(Integer.MIN_VALUE, 128);
                        mq0Var.r(i, 256);
                        return true;
                    }
                }
            } else {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                Chip chip = mq0Var.j0;
                if (chip.c() && chip.getCloseIconTouchBounds().contains(x, y)) {
                    i2 = 1;
                }
                int i3 = mq0Var.i0;
                if (i3 != i2) {
                    mq0Var.i0 = i2;
                    mq0Var.r(i2, 128);
                    mq0Var.r(i3, 256);
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
        if (!this.r0) {
            return super.dispatchKeyEvent(keyEvent);
        }
        mq0 mq0Var = this.q0;
        mq0Var.getClass();
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
                        case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
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
                                while (i < repeatCount && mq0Var.m(i2, null)) {
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
                    int i3 = mq0Var.h0;
                    if (i3 != Integer.MIN_VALUE) {
                        Chip chip = mq0Var.j0;
                        if (i3 == 0) {
                            chip.performClick();
                        } else if (i3 == 1) {
                            chip.playSoundEffect(0);
                            View.OnClickListener onClickListener = chip.g0;
                            if (onClickListener != null) {
                                onClickListener.onClick(chip);
                            }
                            if (chip.r0) {
                                chip.q0.r(1, 1);
                            }
                        }
                    }
                    z = true;
                }
            } else if (keyEvent.hasNoModifiers()) {
                z = mq0Var.m(2, null);
            } else if (keyEvent.hasModifiers(1)) {
                z = mq0Var.m(1, null);
            }
        }
        if (z && mq0Var.h0 != Integer.MIN_VALUE) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [int, boolean] */
    @Override // defpackage.nq, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        nq0 nq0Var = this.d0;
        boolean z = false;
        int i = 0;
        z = false;
        if (nq0Var != null && nq0.z(nq0Var.Q0)) {
            nq0 nq0Var2 = this.d0;
            ?? isEnabled = isEnabled();
            int i2 = isEnabled;
            if (this.l0) {
                i2 = isEnabled + 1;
            }
            int i3 = i2;
            if (this.k0) {
                i3 = i2 + 1;
            }
            int i4 = i3;
            if (this.j0) {
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
            if (this.l0) {
                iArr[i] = 16842908;
                i++;
            }
            if (this.k0) {
                iArr[i] = 16843623;
                i++;
            }
            if (this.j0) {
                iArr[i] = 16842919;
                i++;
            }
            if (isChecked()) {
                iArr[i] = 16842913;
            }
            z = nq0Var2.R(iArr);
        }
        if (z) {
            invalidate();
        }
    }

    public final void e() {
        this.f0 = new RippleDrawable(lq5.a(this.d0.I0), getBackgroundDrawable(), null);
        this.d0.getClass();
        setBackground(this.f0);
        f();
    }

    public final void f() {
        nq0 nq0Var;
        if (!TextUtils.isEmpty(getText()) && (nq0Var = this.d0) != null) {
            int w = (int) (nq0Var.w() + nq0Var.i1 + nq0Var.f1);
            nq0 nq0Var2 = this.d0;
            int v = (int) (nq0Var2.v() + nq0Var2.b1 + nq0Var2.e1);
            if (this.e0 != null) {
                Rect rect = new Rect();
                this.e0.getPadding(rect);
                v += rect.left;
                w += rect.right;
            }
            setPaddingRelative(v, getPaddingTop(), w, getPaddingBottom());
        }
    }

    public final void g() {
        TextPaint paint = getPaint();
        nq0 nq0Var = this.d0;
        if (nq0Var != null) {
            paint.drawableState = nq0Var.getState();
        }
        g07 textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.d(getContext(), paint, this.u0);
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.p0)) {
            return this.p0;
        }
        nq0 nq0Var = this.d0;
        if (nq0Var != null && nq0Var.V0) {
            getParent();
            return "android.widget.Button";
        } else if (isClickable()) {
            return "android.widget.Button";
        } else {
            return "android.view.View";
        }
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.e0;
        if (insetDrawable == null) {
            return this.d0;
        }
        return insetDrawable;
    }

    public Drawable getCheckedIcon() {
        nq0 nq0Var = this.d0;
        if (nq0Var != null) {
            return nq0Var.X0;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        nq0 nq0Var = this.d0;
        if (nq0Var != null) {
            return nq0Var.Y0;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        nq0 nq0Var = this.d0;
        if (nq0Var != null) {
            return nq0Var.D0;
        }
        return null;
    }

    public float getChipCornerRadius() {
        nq0 nq0Var = this.d0;
        if (nq0Var == null) {
            return RecyclerView.B1;
        }
        return Math.max((float) RecyclerView.B1, nq0Var.x());
    }

    public Drawable getChipDrawable() {
        return this.d0;
    }

    public float getChipEndPadding() {
        nq0 nq0Var = this.d0;
        if (nq0Var != null) {
            return nq0Var.i1;
        }
        return RecyclerView.B1;
    }

    public Drawable getChipIcon() {
        Drawable drawable;
        nq0 nq0Var = this.d0;
        if (nq0Var == null || (drawable = nq0Var.L0) == null) {
            return null;
        }
        return drawable;
    }

    public float getChipIconSize() {
        nq0 nq0Var = this.d0;
        if (nq0Var != null) {
            return nq0Var.N0;
        }
        return RecyclerView.B1;
    }

    public ColorStateList getChipIconTint() {
        nq0 nq0Var = this.d0;
        if (nq0Var != null) {
            return nq0Var.M0;
        }
        return null;
    }

    public float getChipMinHeight() {
        nq0 nq0Var = this.d0;
        if (nq0Var != null) {
            return nq0Var.E0;
        }
        return RecyclerView.B1;
    }

    public float getChipStartPadding() {
        nq0 nq0Var = this.d0;
        if (nq0Var != null) {
            return nq0Var.b1;
        }
        return RecyclerView.B1;
    }

    public ColorStateList getChipStrokeColor() {
        nq0 nq0Var = this.d0;
        if (nq0Var != null) {
            return nq0Var.G0;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        nq0 nq0Var = this.d0;
        if (nq0Var != null) {
            return nq0Var.H0;
        }
        return RecyclerView.B1;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        Drawable drawable;
        nq0 nq0Var = this.d0;
        if (nq0Var == null || (drawable = nq0Var.Q0) == null) {
            return null;
        }
        return drawable;
    }

    public CharSequence getCloseIconContentDescription() {
        nq0 nq0Var = this.d0;
        if (nq0Var != null) {
            return nq0Var.U0;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        nq0 nq0Var = this.d0;
        if (nq0Var != null) {
            return nq0Var.h1;
        }
        return RecyclerView.B1;
    }

    public float getCloseIconSize() {
        nq0 nq0Var = this.d0;
        if (nq0Var != null) {
            return nq0Var.T0;
        }
        return RecyclerView.B1;
    }

    public float getCloseIconStartPadding() {
        nq0 nq0Var = this.d0;
        if (nq0Var != null) {
            return nq0Var.g1;
        }
        return RecyclerView.B1;
    }

    public ColorStateList getCloseIconTint() {
        nq0 nq0Var = this.d0;
        if (nq0Var != null) {
            return nq0Var.S0;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        nq0 nq0Var = this.d0;
        if (nq0Var != null) {
            return nq0Var.G1;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.r0) {
            mq0 mq0Var = this.q0;
            if (mq0Var.h0 == 1 || mq0Var.g0 == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public f84 getHideMotionSpec() {
        nq0 nq0Var = this.d0;
        if (nq0Var != null) {
            return nq0Var.a1;
        }
        return null;
    }

    public float getIconEndPadding() {
        nq0 nq0Var = this.d0;
        if (nq0Var != null) {
            return nq0Var.d1;
        }
        return RecyclerView.B1;
    }

    public float getIconStartPadding() {
        nq0 nq0Var = this.d0;
        if (nq0Var != null) {
            return nq0Var.c1;
        }
        return RecyclerView.B1;
    }

    public ColorStateList getRippleColor() {
        nq0 nq0Var = this.d0;
        if (nq0Var != null) {
            return nq0Var.I0;
        }
        return null;
    }

    public me6 getShapeAppearanceModel() {
        return this.d0.B.a;
    }

    public f84 getShowMotionSpec() {
        nq0 nq0Var = this.d0;
        if (nq0Var != null) {
            return nq0Var.Z0;
        }
        return null;
    }

    public float getTextEndPadding() {
        nq0 nq0Var = this.d0;
        if (nq0Var != null) {
            return nq0Var.f1;
        }
        return RecyclerView.B1;
    }

    public float getTextStartPadding() {
        nq0 nq0Var = this.d0;
        if (nq0Var != null) {
            return nq0Var.e1;
        }
        return RecyclerView.B1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        jx2.P(this, this.d0);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, w0);
        }
        nq0 nq0Var = this.d0;
        if (nq0Var != null && nq0Var.V0) {
            View.mergeDrawableStates(onCreateDrawableState, x0);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (this.r0) {
            mq0 mq0Var = this.q0;
            int i2 = mq0Var.h0;
            if (i2 != Integer.MIN_VALUE) {
                mq0Var.j(i2);
            }
            if (z) {
                mq0Var.m(i, rect);
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
        nq0 nq0Var = this.d0;
        if (nq0Var != null && nq0Var.V0) {
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
        if (this.n0 != i) {
            this.n0 = i;
            f();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
        if (r0 != 3) goto L16;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        boolean contains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (this.j0) {
                        if (!contains) {
                            setCloseIconPressed(false);
                        }
                        z = true;
                    }
                }
                z = false;
            } else if (this.j0) {
                playSoundEffect(0);
                View.OnClickListener onClickListener = this.g0;
                if (onClickListener != null) {
                    onClickListener.onClick(this);
                }
                if (this.r0) {
                    this.q0.r(1, 1);
                }
                z = true;
                setCloseIconPressed(false);
            }
            z = false;
            setCloseIconPressed(false);
        } else {
            if (contains) {
                setCloseIconPressed(true);
                z = true;
            }
            z = false;
        }
        if (z || super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.p0 = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable != getBackgroundDrawable() && drawable != this.f0) {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        } else {
            super.setBackground(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // defpackage.nq, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != getBackgroundDrawable() && drawable != this.f0) {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        } else {
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // defpackage.nq, android.view.View
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
        nq0 nq0Var = this.d0;
        if (nq0Var != null) {
            nq0Var.C(z);
        }
    }

    public void setCheckableResource(int i) {
        nq0 nq0Var = this.d0;
        if (nq0Var != null) {
            nq0Var.C(nq0Var.j1.getResources().getBoolean(i));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        nq0 nq0Var = this.d0;
        if (nq0Var == null) {
            this.i0 = z;
        } else if (nq0Var.V0) {
            super.setChecked(z);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        nq0 nq0Var = this.d0;
        if (nq0Var != null) {
            nq0Var.D(drawable);
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
        nq0 nq0Var = this.d0;
        if (nq0Var != null) {
            nq0Var.D(hf.S(nq0Var.j1, i));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        nq0 nq0Var = this.d0;
        if (nq0Var != null) {
            nq0Var.E(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        nq0 nq0Var = this.d0;
        if (nq0Var != null) {
            nq0Var.E(ge7.A(nq0Var.j1, i));
        }
    }

    public void setCheckedIconVisible(int i) {
        nq0 nq0Var = this.d0;
        if (nq0Var != null) {
            nq0Var.F(nq0Var.j1.getResources().getBoolean(i));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        nq0 nq0Var = this.d0;
        if (nq0Var != null && nq0Var.D0 != colorStateList) {
            nq0Var.D0 = colorStateList;
            nq0Var.onStateChange(nq0Var.getState());
        }
    }

    public void setChipBackgroundColorResource(int i) {
        ColorStateList A;
        nq0 nq0Var = this.d0;
        if (nq0Var != null && nq0Var.D0 != (A = ge7.A(nq0Var.j1, i))) {
            nq0Var.D0 = A;
            nq0Var.onStateChange(nq0Var.getState());
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        nq0 nq0Var = this.d0;
        if (nq0Var != null) {
            nq0Var.G(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        nq0 nq0Var = this.d0;
        if (nq0Var != null) {
            nq0Var.G(nq0Var.j1.getResources().getDimension(i));
        }
    }

    public void setChipDrawable(nq0 nq0Var) {
        nq0 nq0Var2 = this.d0;
        if (nq0Var2 != nq0Var) {
            if (nq0Var2 != null) {
                nq0Var2.F1 = new WeakReference(null);
            }
            this.d0 = nq0Var;
            nq0Var.H1 = false;
            nq0Var.F1 = new WeakReference(this);
            b(this.o0);
        }
    }

    public void setChipEndPadding(float f) {
        nq0 nq0Var = this.d0;
        if (nq0Var != null && nq0Var.i1 != f) {
            nq0Var.i1 = f;
            nq0Var.invalidateSelf();
            nq0Var.A();
        }
    }

    public void setChipEndPaddingResource(int i) {
        nq0 nq0Var = this.d0;
        if (nq0Var != null) {
            float dimension = nq0Var.j1.getResources().getDimension(i);
            if (nq0Var.i1 != dimension) {
                nq0Var.i1 = dimension;
                nq0Var.invalidateSelf();
                nq0Var.A();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        nq0 nq0Var = this.d0;
        if (nq0Var != null) {
            nq0Var.H(drawable);
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
        nq0 nq0Var = this.d0;
        if (nq0Var != null) {
            nq0Var.H(hf.S(nq0Var.j1, i));
        }
    }

    public void setChipIconSize(float f) {
        nq0 nq0Var = this.d0;
        if (nq0Var != null) {
            nq0Var.I(f);
        }
    }

    public void setChipIconSizeResource(int i) {
        nq0 nq0Var = this.d0;
        if (nq0Var != null) {
            nq0Var.I(nq0Var.j1.getResources().getDimension(i));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        nq0 nq0Var = this.d0;
        if (nq0Var != null) {
            nq0Var.J(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        nq0 nq0Var = this.d0;
        if (nq0Var != null) {
            nq0Var.J(ge7.A(nq0Var.j1, i));
        }
    }

    public void setChipIconVisible(int i) {
        nq0 nq0Var = this.d0;
        if (nq0Var != null) {
            nq0Var.K(nq0Var.j1.getResources().getBoolean(i));
        }
    }

    public void setChipMinHeight(float f) {
        nq0 nq0Var = this.d0;
        if (nq0Var != null && nq0Var.E0 != f) {
            nq0Var.E0 = f;
            nq0Var.invalidateSelf();
            nq0Var.A();
        }
    }

    public void setChipMinHeightResource(int i) {
        nq0 nq0Var = this.d0;
        if (nq0Var != null) {
            float dimension = nq0Var.j1.getResources().getDimension(i);
            if (nq0Var.E0 != dimension) {
                nq0Var.E0 = dimension;
                nq0Var.invalidateSelf();
                nq0Var.A();
            }
        }
    }

    public void setChipStartPadding(float f) {
        nq0 nq0Var = this.d0;
        if (nq0Var != null && nq0Var.b1 != f) {
            nq0Var.b1 = f;
            nq0Var.invalidateSelf();
            nq0Var.A();
        }
    }

    public void setChipStartPaddingResource(int i) {
        nq0 nq0Var = this.d0;
        if (nq0Var != null) {
            float dimension = nq0Var.j1.getResources().getDimension(i);
            if (nq0Var.b1 != dimension) {
                nq0Var.b1 = dimension;
                nq0Var.invalidateSelf();
                nq0Var.A();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        nq0 nq0Var = this.d0;
        if (nq0Var != null) {
            nq0Var.L(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        nq0 nq0Var = this.d0;
        if (nq0Var != null) {
            nq0Var.L(ge7.A(nq0Var.j1, i));
        }
    }

    public void setChipStrokeWidth(float f) {
        nq0 nq0Var = this.d0;
        if (nq0Var != null) {
            nq0Var.M(f);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        nq0 nq0Var = this.d0;
        if (nq0Var != null) {
            nq0Var.M(nq0Var.j1.getResources().getDimension(i));
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
        nq0 nq0Var = this.d0;
        if (nq0Var != null) {
            nq0Var.N(drawable);
        }
        d();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        g40 g40Var;
        nq0 nq0Var = this.d0;
        if (nq0Var != null && nq0Var.U0 != charSequence) {
            String str = g40.b;
            if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
                g40Var = g40.e;
            } else {
                g40Var = g40.d;
            }
            g40Var.getClass();
            g60 g60Var = f17.a;
            nq0Var.U0 = g40Var.c(charSequence);
            nq0Var.invalidateSelf();
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
        nq0 nq0Var = this.d0;
        if (nq0Var != null) {
            nq0Var.O(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        nq0 nq0Var = this.d0;
        if (nq0Var != null) {
            nq0Var.O(nq0Var.j1.getResources().getDimension(i));
        }
    }

    public void setCloseIconResource(int i) {
        nq0 nq0Var = this.d0;
        if (nq0Var != null) {
            nq0Var.N(hf.S(nq0Var.j1, i));
        }
        d();
    }

    public void setCloseIconSize(float f) {
        nq0 nq0Var = this.d0;
        if (nq0Var != null) {
            nq0Var.P(f);
        }
    }

    public void setCloseIconSizeResource(int i) {
        nq0 nq0Var = this.d0;
        if (nq0Var != null) {
            nq0Var.P(nq0Var.j1.getResources().getDimension(i));
        }
    }

    public void setCloseIconStartPadding(float f) {
        nq0 nq0Var = this.d0;
        if (nq0Var != null) {
            nq0Var.Q(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        nq0 nq0Var = this.d0;
        if (nq0Var != null) {
            nq0Var.Q(nq0Var.j1.getResources().getDimension(i));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        nq0 nq0Var = this.d0;
        if (nq0Var != null) {
            nq0Var.S(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        nq0 nq0Var = this.d0;
        if (nq0Var != null) {
            nq0Var.S(ge7.A(nq0Var.j1, i));
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    @Override // defpackage.nq, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable == null) {
            if (drawable3 == null) {
                super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
                return;
            } else {
                fa6.h("Please set end drawable using R.attr#closeIcon.");
                return;
            }
        }
        fa6.h("Please set start drawable using R.attr#chipIcon.");
    }

    @Override // defpackage.nq, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable == null) {
            if (drawable3 == null) {
                super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
                return;
            } else {
                fa6.h("Please set end drawable using R.attr#closeIcon.");
                return;
            }
        }
        fa6.h("Please set start drawable using R.attr#chipIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i == 0) {
            if (i3 == 0) {
                super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
                return;
            } else {
                fa6.h("Please set end drawable using R.attr#closeIcon.");
                return;
            }
        }
        fa6.h("Please set start drawable using R.attr#chipIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i == 0) {
            if (i3 == 0) {
                super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
                return;
            } else {
                fa6.h("Please set end drawable using R.attr#closeIcon.");
                return;
            }
        }
        fa6.h("Please set start drawable using R.attr#chipIcon.");
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        nq0 nq0Var = this.d0;
        if (nq0Var != null) {
            nq0Var.m(f);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.d0 != null) {
            if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
                super.setEllipsize(truncateAt);
                nq0 nq0Var = this.d0;
                if (nq0Var != null) {
                    nq0Var.G1 = truncateAt;
                    return;
                }
                return;
            }
            fa6.h("Text within a chip are not allowed to scroll.");
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.m0 = z;
        b(this.o0);
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        if (i != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i);
        }
    }

    public void setHideMotionSpec(f84 f84Var) {
        nq0 nq0Var = this.d0;
        if (nq0Var != null) {
            nq0Var.a1 = f84Var;
        }
    }

    public void setHideMotionSpecResource(int i) {
        nq0 nq0Var = this.d0;
        if (nq0Var != null) {
            nq0Var.a1 = f84.a(nq0Var.j1, i);
        }
    }

    public void setIconEndPadding(float f) {
        nq0 nq0Var = this.d0;
        if (nq0Var != null) {
            nq0Var.U(f);
        }
    }

    public void setIconEndPaddingResource(int i) {
        nq0 nq0Var = this.d0;
        if (nq0Var != null) {
            nq0Var.U(nq0Var.j1.getResources().getDimension(i));
        }
    }

    public void setIconStartPadding(float f) {
        nq0 nq0Var = this.d0;
        if (nq0Var != null) {
            nq0Var.V(f);
        }
    }

    public void setIconStartPaddingResource(int i) {
        nq0 nq0Var = this.d0;
        if (nq0Var != null) {
            nq0Var.V(nq0Var.j1.getResources().getDimension(i));
        }
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        if (this.d0 == null) {
            return;
        }
        super.setLayoutDirection(i);
    }

    @Override // android.widget.TextView
    public void setLines(int i) {
        if (i <= 1) {
            super.setLines(i);
        } else {
            fa6.h("Chip does not support multi-line text");
        }
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        if (i <= 1) {
            super.setMaxLines(i);
        } else {
            fa6.h("Chip does not support multi-line text");
        }
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        nq0 nq0Var = this.d0;
        if (nq0Var != null) {
            nq0Var.I1 = i;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i) {
        if (i <= 1) {
            super.setMinLines(i);
        } else {
            fa6.h("Chip does not support multi-line text");
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.h0 = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.g0 = onClickListener;
        d();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        nq0 nq0Var = this.d0;
        if (nq0Var != null) {
            nq0Var.W(colorStateList);
        }
        this.d0.getClass();
        e();
    }

    public void setRippleColorResource(int i) {
        nq0 nq0Var = this.d0;
        if (nq0Var != null) {
            nq0Var.W(ge7.A(nq0Var.j1, i));
            this.d0.getClass();
            e();
        }
    }

    @Override // defpackage.xe6
    public void setShapeAppearanceModel(me6 me6Var) {
        this.d0.setShapeAppearanceModel(me6Var);
    }

    public void setShowMotionSpec(f84 f84Var) {
        nq0 nq0Var = this.d0;
        if (nq0Var != null) {
            nq0Var.Z0 = f84Var;
        }
    }

    public void setShowMotionSpecResource(int i) {
        nq0 nq0Var = this.d0;
        if (nq0Var != null) {
            nq0Var.Z0 = f84.a(nq0Var.j1, i);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z) {
        if (z) {
            super.setSingleLine(z);
        } else {
            fa6.h("Chip does not support multi-line text");
        }
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        CharSequence charSequence2;
        nq0 nq0Var = this.d0;
        if (nq0Var != null) {
            if (charSequence == null) {
                charSequence = "";
            }
            if (nq0Var.H1) {
                charSequence2 = null;
            } else {
                charSequence2 = charSequence;
            }
            super.setText(charSequence2, bufferType);
            nq0 nq0Var2 = this.d0;
            if (nq0Var2 != null && !TextUtils.equals(nq0Var2.J0, charSequence)) {
                nq0Var2.J0 = charSequence;
                nq0Var2.p1.d = true;
                nq0Var2.invalidateSelf();
                nq0Var2.A();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        nq0 nq0Var = this.d0;
        if (nq0Var != null) {
            nq0Var.X(new g07(nq0Var.j1, i));
        }
        g();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f) {
        nq0 nq0Var = this.d0;
        if (nq0Var != null && nq0Var.f1 != f) {
            nq0Var.f1 = f;
            nq0Var.invalidateSelf();
            nq0Var.A();
        }
    }

    public void setTextEndPaddingResource(int i) {
        nq0 nq0Var = this.d0;
        if (nq0Var != null) {
            float dimension = nq0Var.j1.getResources().getDimension(i);
            if (nq0Var.f1 != dimension) {
                nq0Var.f1 = dimension;
                nq0Var.invalidateSelf();
                nq0Var.A();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        nq0 nq0Var = this.d0;
        if (nq0Var != null) {
            float applyDimension = TypedValue.applyDimension(i, f, getResources().getDisplayMetrics());
            h17 h17Var = nq0Var.p1;
            g07 g07Var = h17Var.f;
            if (g07Var != null) {
                g07Var.l = applyDimension;
                h17Var.a.setTextSize(applyDimension);
                nq0Var.A();
                nq0Var.invalidateSelf();
            }
        }
        g();
    }

    public void setTextStartPadding(float f) {
        nq0 nq0Var = this.d0;
        if (nq0Var != null && nq0Var.e1 != f) {
            nq0Var.e1 = f;
            nq0Var.invalidateSelf();
            nq0Var.A();
        }
    }

    public void setTextStartPaddingResource(int i) {
        nq0 nq0Var = this.d0;
        if (nq0Var != null) {
            float dimension = nq0Var.j1.getResources().getDimension(i);
            if (nq0Var.e1 != dimension) {
                nq0Var.e1 = dimension;
                nq0Var.invalidateSelf();
                nq0Var.A();
            }
        }
    }

    public void setCloseIconVisible(boolean z) {
        nq0 nq0Var = this.d0;
        if (nq0Var != null) {
            nq0Var.T(z);
        }
        d();
    }

    public void setCheckedIconVisible(boolean z) {
        nq0 nq0Var = this.d0;
        if (nq0Var != null) {
            nq0Var.F(z);
        }
    }

    public void setChipIconVisible(boolean z) {
        nq0 nq0Var = this.d0;
        if (nq0Var != null) {
            nq0Var.K(z);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            fa6.h("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            fa6.h("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            fa6.h("Please set left drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            fa6.h("Please set right drawable using R.attr#closeIcon.");
        }
    }

    public void setTextAppearance(g07 g07Var) {
        nq0 nq0Var = this.d0;
        if (nq0Var != null) {
            nq0Var.X(g07Var);
        }
        g();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        nq0 nq0Var = this.d0;
        if (nq0Var != null) {
            nq0Var.X(new g07(nq0Var.j1, i));
        }
        g();
    }

    public void setInternalOnCheckedChangeListener(j24 j24Var) {
    }
}
