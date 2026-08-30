package com.google.android.material.chip;

import a0.l;
import a6.x0;
import aj.g;
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
import ca.b;
import ca.c;
import ca.d;
import ca.e;
import ha.i;
import java.lang.ref.WeakReference;
import java.util.Locale;
import k7.w;
import m9.o;
import me.magnum.melonds.R;
import na.n;
import na.y;
import q.p;
import sa.a;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class Chip extends p implements y, Checkable {

    /* renamed from: t0  reason: collision with root package name */
    public static final Rect f3010t0 = new Rect();

    /* renamed from: u0  reason: collision with root package name */
    public static final int[] f3011u0 = {16842913};

    /* renamed from: v0  reason: collision with root package name */
    public static final int[] f3012v0 = {16842911};

    /* renamed from: b0  reason: collision with root package name */
    public e f3013b0;

    /* renamed from: c0  reason: collision with root package name */
    public InsetDrawable f3014c0;

    /* renamed from: d0  reason: collision with root package name */
    public RippleDrawable f3015d0;

    /* renamed from: e0  reason: collision with root package name */
    public View.OnClickListener f3016e0;

    /* renamed from: f0  reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f3017f0;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f3018g0;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f3019h0;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f3020i0;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f3021j0;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f3022k0;

    /* renamed from: l0  reason: collision with root package name */
    public int f3023l0;

    /* renamed from: m0  reason: collision with root package name */
    public int f3024m0;

    /* renamed from: n0  reason: collision with root package name */
    public CharSequence f3025n0;

    /* renamed from: o0  reason: collision with root package name */
    public final d f3026o0;
    public boolean p0;

    /* renamed from: q0  reason: collision with root package name */
    public final Rect f3027q0;

    /* renamed from: r0  reason: collision with root package name */
    public final RectF f3028r0;

    /* renamed from: s0  reason: collision with root package name */
    public final b f3029s0;

    public Chip(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, R.attr.chipStyle, 2131952811), attributeSet, R.attr.chipStyle);
        ka.d dVar;
        u9.b bVar;
        u9.b bVar2;
        float dimension;
        int resourceId;
        int resourceId2;
        int resourceId3;
        this.f3027q0 = new Rect();
        this.f3028r0 = new RectF();
        this.f3029s0 = new b(0, this);
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
                                o.v("Chip does not support multi-line text");
                                throw null;
                            }
                        } else {
                            o.v("Please set end drawable using R.attr#closeIcon.");
                            throw null;
                        }
                    } else {
                        o.v("Please set end drawable using R.attr#closeIcon.");
                        throw null;
                    }
                } else {
                    o.v("Please set start drawable using R.attr#chipIcon.");
                    throw null;
                }
            } else {
                o.v("Please set left drawable using R.attr#chipIcon.");
                throw null;
            }
        }
        e eVar = new e(context2, attributeSet);
        Context context3 = eVar.f2781h1;
        int[] iArr = t9.a.f13152c;
        TypedArray e6 = i.e(context3, attributeSet, iArr, R.attr.chipStyle, 2131952811, new int[0]);
        eVar.H1 = e6.hasValue(37);
        Context context4 = eVar.f2781h1;
        ColorStateList m = w.m(context4, e6, 24);
        if (eVar.A0 != m) {
            eVar.A0 = m;
            eVar.onStateChange(eVar.getState());
        }
        ColorStateList m10 = w.m(context4, e6, 11);
        if (eVar.B0 != m10) {
            eVar.B0 = m10;
            eVar.onStateChange(eVar.getState());
        }
        float dimension2 = e6.getDimension(19, 0.0f);
        if (eVar.C0 != dimension2) {
            eVar.C0 = dimension2;
            eVar.invalidateSelf();
            eVar.A();
        }
        if (e6.hasValue(12)) {
            eVar.G(e6.getDimension(12, 0.0f));
        }
        eVar.L(w.m(context4, e6, 22));
        eVar.M(e6.getDimension(23, 0.0f));
        eVar.W(w.m(context4, e6, 36));
        String text = e6.getText(5);
        text = text == null ? "" : text;
        if (!TextUtils.equals(eVar.H0, text)) {
            eVar.H0 = text;
            eVar.f2787n1.f6434d = true;
            eVar.invalidateSelf();
            eVar.A();
        }
        if (e6.hasValue(0) && (resourceId3 = e6.getResourceId(0, 0)) != 0) {
            dVar = new ka.d(context4, resourceId3);
        } else {
            dVar = null;
        }
        dVar.f8127l = e6.getDimension(1, dVar.f8127l);
        eVar.X(dVar);
        int i2 = e6.getInt(3, 0);
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    eVar.E1 = TextUtils.TruncateAt.END;
                }
            } else {
                eVar.E1 = TextUtils.TruncateAt.MIDDLE;
            }
        } else {
            eVar.E1 = TextUtils.TruncateAt.START;
        }
        eVar.K(e6.getBoolean(18, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            eVar.K(e6.getBoolean(15, false));
        }
        eVar.H(w.q(context4, e6, 14));
        if (e6.hasValue(17)) {
            eVar.J(w.m(context4, e6, 17));
        }
        eVar.I(e6.getDimension(16, -1.0f));
        eVar.T(e6.getBoolean(31, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            eVar.T(e6.getBoolean(26, false));
        }
        eVar.N(w.q(context4, e6, 25));
        eVar.S(w.m(context4, e6, 30));
        eVar.P(e6.getDimension(28, 0.0f));
        eVar.C(e6.getBoolean(6, false));
        eVar.F(e6.getBoolean(10, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            eVar.F(e6.getBoolean(8, false));
        }
        eVar.D(w.q(context4, e6, 7));
        if (e6.hasValue(9)) {
            eVar.E(w.m(context4, e6, 9));
        }
        if (e6.hasValue(39) && (resourceId2 = e6.getResourceId(39, 0)) != 0) {
            bVar = u9.b.a(context4, resourceId2);
        } else {
            bVar = null;
        }
        eVar.X0 = bVar;
        if (e6.hasValue(33) && (resourceId = e6.getResourceId(33, 0)) != 0) {
            bVar2 = u9.b.a(context4, resourceId);
        } else {
            bVar2 = null;
        }
        eVar.Y0 = bVar2;
        float dimension3 = e6.getDimension(21, 0.0f);
        if (eVar.Z0 != dimension3) {
            eVar.Z0 = dimension3;
            eVar.invalidateSelf();
            eVar.A();
        }
        eVar.V(e6.getDimension(35, 0.0f));
        eVar.U(e6.getDimension(34, 0.0f));
        float dimension4 = e6.getDimension(41, 0.0f);
        if (eVar.f2776c1 != dimension4) {
            eVar.f2776c1 = dimension4;
            eVar.invalidateSelf();
            eVar.A();
        }
        float dimension5 = e6.getDimension(40, 0.0f);
        if (eVar.f2777d1 != dimension5) {
            eVar.f2777d1 = dimension5;
            eVar.invalidateSelf();
            eVar.A();
        }
        eVar.Q(e6.getDimension(29, 0.0f));
        eVar.O(e6.getDimension(27, 0.0f));
        float dimension6 = e6.getDimension(13, 0.0f);
        if (eVar.f2780g1 != dimension6) {
            eVar.f2780g1 = dimension6;
            eVar.invalidateSelf();
            eVar.A();
        }
        eVar.G1 = e6.getDimensionPixelSize(4, Preference.DEFAULT_ORDER);
        e6.recycle();
        i.a(context2, attributeSet, R.attr.chipStyle, 2131952811);
        i.b(context2, attributeSet, iArr, R.attr.chipStyle, 2131952811, new int[0]);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, R.attr.chipStyle, 2131952811);
        this.f3022k0 = obtainStyledAttributes.getBoolean(32, false);
        TypedValue I = k0.d.I(context2, R.attr.minTouchTargetSize);
        if (I != null && I.type == 5) {
            dimension = I.getDimension(context2.getResources().getDisplayMetrics());
        } else {
            dimension = context2.getResources().getDimension(R.dimen.mtrl_min_touch_target_size);
        }
        this.f3024m0 = (int) Math.ceil(obtainStyledAttributes.getDimension(20, (int) dimension));
        obtainStyledAttributes.recycle();
        setChipDrawable(eVar);
        eVar.m(getElevation());
        i.a(context2, attributeSet, R.attr.chipStyle, 2131952811);
        i.b(context2, attributeSet, iArr, R.attr.chipStyle, 2131952811, new int[0]);
        TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr, R.attr.chipStyle, 2131952811);
        boolean hasValue = obtainStyledAttributes2.hasValue(37);
        obtainStyledAttributes2.recycle();
        this.f3026o0 = new d(this, this);
        d();
        if (!hasValue) {
            setOutlineProvider(new c(this));
        }
        setChecked(this.f3018g0);
        setText(eVar.H0);
        setEllipsize(eVar.E1);
        g();
        if (!this.f3013b0.F1) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        f();
        if (this.f3022k0) {
            setMinHeight(this.f3024m0);
        }
        this.f3023l0 = getLayoutDirection();
        super.setOnCheckedChangeListener(new ca.a(this, 0));
    }

    private RectF getCloseIconTouchBounds() {
        RectF rectF = this.f3028r0;
        rectF.setEmpty();
        if (c() && this.f3016e0 != null) {
            e eVar = this.f3013b0;
            Rect bounds = eVar.getBounds();
            rectF.setEmpty();
            if (eVar.a0()) {
                float f8 = eVar.f2780g1 + eVar.f2779f1 + eVar.R0 + eVar.f2778e1 + eVar.f2777d1;
                if (eVar.getLayoutDirection() == 0) {
                    float f10 = bounds.right;
                    rectF.right = f10;
                    rectF.left = f10 - f8;
                } else {
                    float f11 = bounds.left;
                    rectF.left = f11;
                    rectF.right = f11 + f8;
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
        Rect rect = this.f3027q0;
        rect.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return rect;
    }

    private ka.d getTextAppearance() {
        e eVar = this.f3013b0;
        if (eVar != null) {
            return eVar.f2787n1.f6436f;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z10) {
        if (this.f3020i0 != z10) {
            this.f3020i0 = z10;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z10) {
        if (this.f3019h0 != z10) {
            this.f3019h0 = z10;
            refreshDrawableState();
        }
    }

    public final void b(int i2) {
        int i10;
        this.f3024m0 = i2;
        int i11 = 0;
        if (!this.f3022k0) {
            InsetDrawable insetDrawable = this.f3014c0;
            if (insetDrawable != null) {
                if (insetDrawable != null) {
                    this.f3014c0 = null;
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
        int max = Math.max(0, i2 - ((int) this.f3013b0.C0));
        int max2 = Math.max(0, i2 - this.f3013b0.getIntrinsicWidth());
        if (max2 <= 0 && max <= 0) {
            InsetDrawable insetDrawable2 = this.f3014c0;
            if (insetDrawable2 != null) {
                if (insetDrawable2 != null) {
                    this.f3014c0 = null;
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
            i10 = max2 / 2;
        } else {
            i10 = 0;
        }
        if (max > 0) {
            i11 = max / 2;
        }
        int i12 = i11;
        if (this.f3014c0 != null) {
            Rect rect = new Rect();
            this.f3014c0.getPadding(rect);
            if (rect.top == i12 && rect.bottom == i12 && rect.left == i10 && rect.right == i10) {
                e();
                return;
            }
        }
        if (getMinHeight() != i2) {
            setMinHeight(i2);
        }
        if (getMinWidth() != i2) {
            setMinWidth(i2);
        }
        this.f3014c0 = new InsetDrawable((Drawable) this.f3013b0, i10, i12, i10, i12);
        e();
    }

    public final boolean c() {
        e eVar = this.f3013b0;
        if (eVar != null) {
            Drawable drawable = eVar.O0;
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
        e eVar;
        if (c() && (eVar = this.f3013b0) != null && eVar.N0 && this.f3016e0 != null) {
            x0.o(this, this.f3026o0);
            this.p0 = true;
            return;
        }
        x0.o(this, null);
        this.p0 = false;
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i2;
        if (!this.p0) {
            return super.dispatchHoverEvent(motionEvent);
        }
        d dVar = this.f3026o0;
        AccessibilityManager accessibilityManager = dVar.f7454b0;
        int i10 = 0;
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action != 7 && action != 9) {
                if (action == 10 && (i2 = dVar.f7459g0) != Integer.MIN_VALUE) {
                    if (i2 != Integer.MIN_VALUE) {
                        dVar.f7459g0 = Integer.MIN_VALUE;
                        dVar.r(Integer.MIN_VALUE, 128);
                        dVar.r(i2, 256);
                        return true;
                    }
                }
            } else {
                float x9 = motionEvent.getX();
                float y10 = motionEvent.getY();
                Chip chip = dVar.f2773k0;
                if (chip.c() && chip.getCloseIconTouchBounds().contains(x9, y10)) {
                    i10 = 1;
                }
                int i11 = dVar.f7459g0;
                if (i11 != i10) {
                    dVar.f7459g0 = i10;
                    dVar.r(i10, 128);
                    dVar.r(i11, 256);
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
        if (!this.p0) {
            return super.dispatchKeyEvent(keyEvent);
        }
        d dVar = this.f3026o0;
        dVar.getClass();
        boolean z10 = false;
        int i2 = 0;
        z10 = false;
        z10 = false;
        z10 = false;
        z10 = false;
        z10 = false;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i10 = 66;
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
                                            i10 = 130;
                                        }
                                    } else {
                                        i10 = 17;
                                    }
                                } else {
                                    i10 = 33;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z11 = false;
                                while (i2 < repeatCount && dVar.m(i10, null)) {
                                    i2++;
                                    z11 = true;
                                }
                                z10 = z11;
                                break;
                            }
                            break;
                    }
                }
                if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                    int i11 = dVar.f7458f0;
                    if (i11 != Integer.MIN_VALUE) {
                        Chip chip = dVar.f2773k0;
                        if (i11 == 0) {
                            chip.performClick();
                        } else if (i11 == 1) {
                            chip.playSoundEffect(0);
                            View.OnClickListener onClickListener = chip.f3016e0;
                            if (onClickListener != null) {
                                onClickListener.onClick(chip);
                            }
                            if (chip.p0) {
                                chip.f3026o0.r(1, 1);
                            }
                        }
                    }
                    z10 = true;
                }
            } else if (keyEvent.hasNoModifiers()) {
                z10 = dVar.m(2, null);
            } else if (keyEvent.hasModifiers(1)) {
                z10 = dVar.m(1, null);
            }
        }
        if (z10 && dVar.f7458f0 != Integer.MIN_VALUE) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [int, boolean] */
    @Override // q.p, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f3013b0;
        boolean z10 = false;
        int i2 = 0;
        z10 = false;
        if (eVar != null && e.z(eVar.O0)) {
            e eVar2 = this.f3013b0;
            ?? isEnabled = isEnabled();
            int i10 = isEnabled;
            if (this.f3021j0) {
                i10 = isEnabled + 1;
            }
            int i11 = i10;
            if (this.f3020i0) {
                i11 = i10 + 1;
            }
            int i12 = i11;
            if (this.f3019h0) {
                i12 = i11 + 1;
            }
            int i13 = i12;
            if (isChecked()) {
                i13 = i12 + 1;
            }
            int[] iArr = new int[i13];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i2 = 1;
            }
            if (this.f3021j0) {
                iArr[i2] = 16842908;
                i2++;
            }
            if (this.f3020i0) {
                iArr[i2] = 16843623;
                i2++;
            }
            if (this.f3019h0) {
                iArr[i2] = 16842919;
                i2++;
            }
            if (isChecked()) {
                iArr[i2] = 16842913;
            }
            z10 = eVar2.R(iArr);
        }
        if (z10) {
            invalidate();
        }
    }

    public final void e() {
        this.f3015d0 = new RippleDrawable(la.a.a(this.f3013b0.G0), getBackgroundDrawable(), null);
        this.f3013b0.getClass();
        setBackground(this.f3015d0);
        f();
    }

    public final void f() {
        e eVar;
        if (!TextUtils.isEmpty(getText()) && (eVar = this.f3013b0) != null) {
            int w10 = (int) (eVar.w() + eVar.f2780g1 + eVar.f2777d1);
            e eVar2 = this.f3013b0;
            int v10 = (int) (eVar2.v() + eVar2.Z0 + eVar2.f2776c1);
            if (this.f3014c0 != null) {
                Rect rect = new Rect();
                this.f3014c0.getPadding(rect);
                v10 += rect.left;
                w10 += rect.right;
            }
            setPaddingRelative(v10, getPaddingTop(), w10, getPaddingBottom());
        }
    }

    public final void g() {
        TextPaint paint = getPaint();
        e eVar = this.f3013b0;
        if (eVar != null) {
            paint.drawableState = eVar.getState();
        }
        ka.d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.d(getContext(), paint, this.f3029s0);
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f3025n0)) {
            return this.f3025n0;
        }
        e eVar = this.f3013b0;
        if (eVar != null && eVar.T0) {
            getParent();
            return "android.widget.Button";
        } else if (isClickable()) {
            return "android.widget.Button";
        } else {
            return "android.view.View";
        }
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f3014c0;
        if (insetDrawable == null) {
            return this.f3013b0;
        }
        return insetDrawable;
    }

    public Drawable getCheckedIcon() {
        e eVar = this.f3013b0;
        if (eVar != null) {
            return eVar.V0;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        e eVar = this.f3013b0;
        if (eVar != null) {
            return eVar.W0;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        e eVar = this.f3013b0;
        if (eVar != null) {
            return eVar.B0;
        }
        return null;
    }

    public float getChipCornerRadius() {
        e eVar = this.f3013b0;
        if (eVar == null) {
            return 0.0f;
        }
        return Math.max(0.0f, eVar.x());
    }

    public Drawable getChipDrawable() {
        return this.f3013b0;
    }

    public float getChipEndPadding() {
        e eVar = this.f3013b0;
        if (eVar != null) {
            return eVar.f2780g1;
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        Drawable drawable;
        e eVar = this.f3013b0;
        if (eVar == null || (drawable = eVar.J0) == null) {
            return null;
        }
        return drawable;
    }

    public float getChipIconSize() {
        e eVar = this.f3013b0;
        if (eVar != null) {
            return eVar.L0;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        e eVar = this.f3013b0;
        if (eVar != null) {
            return eVar.K0;
        }
        return null;
    }

    public float getChipMinHeight() {
        e eVar = this.f3013b0;
        if (eVar != null) {
            return eVar.C0;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        e eVar = this.f3013b0;
        if (eVar != null) {
            return eVar.Z0;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        e eVar = this.f3013b0;
        if (eVar != null) {
            return eVar.E0;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        e eVar = this.f3013b0;
        if (eVar != null) {
            return eVar.F0;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        Drawable drawable;
        e eVar = this.f3013b0;
        if (eVar == null || (drawable = eVar.O0) == null) {
            return null;
        }
        return drawable;
    }

    public CharSequence getCloseIconContentDescription() {
        e eVar = this.f3013b0;
        if (eVar != null) {
            return eVar.S0;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        e eVar = this.f3013b0;
        if (eVar != null) {
            return eVar.f2779f1;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        e eVar = this.f3013b0;
        if (eVar != null) {
            return eVar.R0;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        e eVar = this.f3013b0;
        if (eVar != null) {
            return eVar.f2778e1;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        e eVar = this.f3013b0;
        if (eVar != null) {
            return eVar.Q0;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        e eVar = this.f3013b0;
        if (eVar != null) {
            return eVar.E1;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.p0) {
            d dVar = this.f3026o0;
            if (dVar.f7458f0 == 1 || dVar.f7457e0 == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public u9.b getHideMotionSpec() {
        e eVar = this.f3013b0;
        if (eVar != null) {
            return eVar.Y0;
        }
        return null;
    }

    public float getIconEndPadding() {
        e eVar = this.f3013b0;
        if (eVar != null) {
            return eVar.f2775b1;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        e eVar = this.f3013b0;
        if (eVar != null) {
            return eVar.f2774a1;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        e eVar = this.f3013b0;
        if (eVar != null) {
            return eVar.G0;
        }
        return null;
    }

    public n getShapeAppearanceModel() {
        return this.f3013b0.B.f10144a;
    }

    public u9.b getShowMotionSpec() {
        e eVar = this.f3013b0;
        if (eVar != null) {
            return eVar.X0;
        }
        return null;
    }

    public float getTextEndPadding() {
        e eVar = this.f3013b0;
        if (eVar != null) {
            return eVar.f2777d1;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        e eVar = this.f3013b0;
        if (eVar != null) {
            return eVar.f2776c1;
        }
        return 0.0f;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        w.F(this, this.f3013b0);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f3011u0);
        }
        e eVar = this.f3013b0;
        if (eVar != null && eVar.T0) {
            View.mergeDrawableStates(onCreateDrawableState, f3012v0);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z10, int i2, Rect rect) {
        super.onFocusChanged(z10, i2, rect);
        if (this.p0) {
            d dVar = this.f3026o0;
            int i10 = dVar.f7458f0;
            if (i10 != Integer.MIN_VALUE) {
                dVar.j(i10);
            }
            if (z10) {
                dVar.m(i2, rect);
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
        boolean z10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        e eVar = this.f3013b0;
        if (eVar != null && eVar.T0) {
            z10 = true;
        } else {
            z10 = false;
        }
        accessibilityNodeInfo.setCheckable(z10);
        accessibilityNodeInfo.setClickable(isClickable());
        getParent();
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i2) {
        if (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) {
            return PointerIcon.getSystemIcon(getContext(), 1002);
        }
        return super.onResolvePointerIcon(motionEvent, i2);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i2) {
        super.onRtlPropertiesChanged(i2);
        if (this.f3023l0 != i2) {
            this.f3023l0 = i2;
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
            boolean r0 = r5.f3019h0
            if (r0 == 0) goto L50
            if (r1 != 0) goto L2a
            r5.setCloseIconPressed(r3)
        L2a:
            r0 = r2
            goto L51
        L2c:
            boolean r0 = r5.f3019h0
            if (r0 == 0) goto L45
            r5.playSoundEffect(r3)
            android.view.View$OnClickListener r0 = r5.f3016e0
            if (r0 == 0) goto L3a
            r0.onClick(r5)
        L3a:
            boolean r0 = r5.p0
            if (r0 == 0) goto L43
            ca.d r0 = r5.f3026o0
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
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L5a
            goto L5b
        L5a:
            return r3
        L5b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.f3025n0 = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable != getBackgroundDrawable() && drawable != this.f3015d0) {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        } else {
            super.setBackground(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i2) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // q.p, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != getBackgroundDrawable() && drawable != this.f3015d0) {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        } else {
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // q.p, android.view.View
    public void setBackgroundResource(int i2) {
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

    public void setCheckable(boolean z10) {
        e eVar = this.f3013b0;
        if (eVar != null) {
            eVar.C(z10);
        }
    }

    public void setCheckableResource(int i2) {
        e eVar = this.f3013b0;
        if (eVar != null) {
            eVar.C(eVar.f2781h1.getResources().getBoolean(i2));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        e eVar = this.f3013b0;
        if (eVar == null) {
            this.f3018g0 = z10;
        } else if (eVar.T0) {
            super.setChecked(z10);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        e eVar = this.f3013b0;
        if (eVar != null) {
            eVar.D(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z10) {
        setCheckedIconVisible(z10);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i2) {
        setCheckedIconVisible(i2);
    }

    public void setCheckedIconResource(int i2) {
        e eVar = this.f3013b0;
        if (eVar != null) {
            eVar.D(w.p(eVar.f2781h1, i2));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        e eVar = this.f3013b0;
        if (eVar != null) {
            eVar.E(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i2) {
        e eVar = this.f3013b0;
        if (eVar != null) {
            eVar.E(g.z(eVar.f2781h1, i2));
        }
    }

    public void setCheckedIconVisible(int i2) {
        e eVar = this.f3013b0;
        if (eVar != null) {
            eVar.F(eVar.f2781h1.getResources().getBoolean(i2));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        e eVar = this.f3013b0;
        if (eVar != null && eVar.B0 != colorStateList) {
            eVar.B0 = colorStateList;
            eVar.onStateChange(eVar.getState());
        }
    }

    public void setChipBackgroundColorResource(int i2) {
        ColorStateList z10;
        e eVar = this.f3013b0;
        if (eVar != null && eVar.B0 != (z10 = g.z(eVar.f2781h1, i2))) {
            eVar.B0 = z10;
            eVar.onStateChange(eVar.getState());
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f8) {
        e eVar = this.f3013b0;
        if (eVar != null) {
            eVar.G(f8);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i2) {
        e eVar = this.f3013b0;
        if (eVar != null) {
            eVar.G(eVar.f2781h1.getResources().getDimension(i2));
        }
    }

    public void setChipDrawable(e eVar) {
        e eVar2 = this.f3013b0;
        if (eVar2 != eVar) {
            if (eVar2 != null) {
                eVar2.D1 = new WeakReference(null);
            }
            this.f3013b0 = eVar;
            eVar.F1 = false;
            eVar.D1 = new WeakReference(this);
            b(this.f3024m0);
        }
    }

    public void setChipEndPadding(float f8) {
        e eVar = this.f3013b0;
        if (eVar != null && eVar.f2780g1 != f8) {
            eVar.f2780g1 = f8;
            eVar.invalidateSelf();
            eVar.A();
        }
    }

    public void setChipEndPaddingResource(int i2) {
        e eVar = this.f3013b0;
        if (eVar != null) {
            float dimension = eVar.f2781h1.getResources().getDimension(i2);
            if (eVar.f2780g1 != dimension) {
                eVar.f2780g1 = dimension;
                eVar.invalidateSelf();
                eVar.A();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        e eVar = this.f3013b0;
        if (eVar != null) {
            eVar.H(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z10) {
        setChipIconVisible(z10);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i2) {
        setChipIconVisible(i2);
    }

    public void setChipIconResource(int i2) {
        e eVar = this.f3013b0;
        if (eVar != null) {
            eVar.H(w.p(eVar.f2781h1, i2));
        }
    }

    public void setChipIconSize(float f8) {
        e eVar = this.f3013b0;
        if (eVar != null) {
            eVar.I(f8);
        }
    }

    public void setChipIconSizeResource(int i2) {
        e eVar = this.f3013b0;
        if (eVar != null) {
            eVar.I(eVar.f2781h1.getResources().getDimension(i2));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        e eVar = this.f3013b0;
        if (eVar != null) {
            eVar.J(colorStateList);
        }
    }

    public void setChipIconTintResource(int i2) {
        e eVar = this.f3013b0;
        if (eVar != null) {
            eVar.J(g.z(eVar.f2781h1, i2));
        }
    }

    public void setChipIconVisible(int i2) {
        e eVar = this.f3013b0;
        if (eVar != null) {
            eVar.K(eVar.f2781h1.getResources().getBoolean(i2));
        }
    }

    public void setChipMinHeight(float f8) {
        e eVar = this.f3013b0;
        if (eVar != null && eVar.C0 != f8) {
            eVar.C0 = f8;
            eVar.invalidateSelf();
            eVar.A();
        }
    }

    public void setChipMinHeightResource(int i2) {
        e eVar = this.f3013b0;
        if (eVar != null) {
            float dimension = eVar.f2781h1.getResources().getDimension(i2);
            if (eVar.C0 != dimension) {
                eVar.C0 = dimension;
                eVar.invalidateSelf();
                eVar.A();
            }
        }
    }

    public void setChipStartPadding(float f8) {
        e eVar = this.f3013b0;
        if (eVar != null && eVar.Z0 != f8) {
            eVar.Z0 = f8;
            eVar.invalidateSelf();
            eVar.A();
        }
    }

    public void setChipStartPaddingResource(int i2) {
        e eVar = this.f3013b0;
        if (eVar != null) {
            float dimension = eVar.f2781h1.getResources().getDimension(i2);
            if (eVar.Z0 != dimension) {
                eVar.Z0 = dimension;
                eVar.invalidateSelf();
                eVar.A();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        e eVar = this.f3013b0;
        if (eVar != null) {
            eVar.L(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i2) {
        e eVar = this.f3013b0;
        if (eVar != null) {
            eVar.L(g.z(eVar.f2781h1, i2));
        }
    }

    public void setChipStrokeWidth(float f8) {
        e eVar = this.f3013b0;
        if (eVar != null) {
            eVar.M(f8);
        }
    }

    public void setChipStrokeWidthResource(int i2) {
        e eVar = this.f3013b0;
        if (eVar != null) {
            eVar.M(eVar.f2781h1.getResources().getDimension(i2));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i2) {
        setText(getResources().getString(i2));
    }

    public void setCloseIcon(Drawable drawable) {
        e eVar = this.f3013b0;
        if (eVar != null) {
            eVar.N(drawable);
        }
        d();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        x5.b bVar;
        e eVar = this.f3013b0;
        if (eVar != null && eVar.S0 != charSequence) {
            String str = x5.b.f14358b;
            if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
                bVar = x5.b.f14361e;
            } else {
                bVar = x5.b.f14360d;
            }
            bVar.getClass();
            l lVar = x5.g.f14368a;
            eVar.S0 = bVar.c(charSequence);
            eVar.invalidateSelf();
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z10) {
        setCloseIconVisible(z10);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i2) {
        setCloseIconVisible(i2);
    }

    public void setCloseIconEndPadding(float f8) {
        e eVar = this.f3013b0;
        if (eVar != null) {
            eVar.O(f8);
        }
    }

    public void setCloseIconEndPaddingResource(int i2) {
        e eVar = this.f3013b0;
        if (eVar != null) {
            eVar.O(eVar.f2781h1.getResources().getDimension(i2));
        }
    }

    public void setCloseIconResource(int i2) {
        e eVar = this.f3013b0;
        if (eVar != null) {
            eVar.N(w.p(eVar.f2781h1, i2));
        }
        d();
    }

    public void setCloseIconSize(float f8) {
        e eVar = this.f3013b0;
        if (eVar != null) {
            eVar.P(f8);
        }
    }

    public void setCloseIconSizeResource(int i2) {
        e eVar = this.f3013b0;
        if (eVar != null) {
            eVar.P(eVar.f2781h1.getResources().getDimension(i2));
        }
    }

    public void setCloseIconStartPadding(float f8) {
        e eVar = this.f3013b0;
        if (eVar != null) {
            eVar.Q(f8);
        }
    }

    public void setCloseIconStartPaddingResource(int i2) {
        e eVar = this.f3013b0;
        if (eVar != null) {
            eVar.Q(eVar.f2781h1.getResources().getDimension(i2));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        e eVar = this.f3013b0;
        if (eVar != null) {
            eVar.S(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i2) {
        e eVar = this.f3013b0;
        if (eVar != null) {
            eVar.S(g.z(eVar.f2781h1, i2));
        }
    }

    public void setCloseIconVisible(int i2) {
        setCloseIconVisible(getResources().getBoolean(i2));
    }

    @Override // q.p, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable == null) {
            if (drawable3 == null) {
                super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
                return;
            } else {
                o.v("Please set end drawable using R.attr#closeIcon.");
                return;
            }
        }
        o.v("Please set start drawable using R.attr#chipIcon.");
    }

    @Override // q.p, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable == null) {
            if (drawable3 == null) {
                super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
                return;
            } else {
                o.v("Please set end drawable using R.attr#closeIcon.");
                return;
            }
        }
        o.v("Please set start drawable using R.attr#chipIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i2, int i10, int i11, int i12) {
        if (i2 == 0) {
            if (i11 == 0) {
                super.setCompoundDrawablesRelativeWithIntrinsicBounds(i2, i10, i11, i12);
                return;
            } else {
                o.v("Please set end drawable using R.attr#closeIcon.");
                return;
            }
        }
        o.v("Please set start drawable using R.attr#chipIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i2, int i10, int i11, int i12) {
        if (i2 == 0) {
            if (i11 == 0) {
                super.setCompoundDrawablesWithIntrinsicBounds(i2, i10, i11, i12);
                return;
            } else {
                o.v("Please set end drawable using R.attr#closeIcon.");
                return;
            }
        }
        o.v("Please set start drawable using R.attr#chipIcon.");
    }

    @Override // android.view.View
    public void setElevation(float f8) {
        super.setElevation(f8);
        e eVar = this.f3013b0;
        if (eVar != null) {
            eVar.m(f8);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f3013b0 != null) {
            if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
                super.setEllipsize(truncateAt);
                e eVar = this.f3013b0;
                if (eVar != null) {
                    eVar.E1 = truncateAt;
                    return;
                }
                return;
            }
            o.v("Text within a chip are not allowed to scroll.");
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z10) {
        this.f3022k0 = z10;
        b(this.f3024m0);
    }

    @Override // android.widget.TextView
    public void setGravity(int i2) {
        if (i2 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i2);
        }
    }

    public void setHideMotionSpec(u9.b bVar) {
        e eVar = this.f3013b0;
        if (eVar != null) {
            eVar.Y0 = bVar;
        }
    }

    public void setHideMotionSpecResource(int i2) {
        e eVar = this.f3013b0;
        if (eVar != null) {
            eVar.Y0 = u9.b.a(eVar.f2781h1, i2);
        }
    }

    public void setIconEndPadding(float f8) {
        e eVar = this.f3013b0;
        if (eVar != null) {
            eVar.U(f8);
        }
    }

    public void setIconEndPaddingResource(int i2) {
        e eVar = this.f3013b0;
        if (eVar != null) {
            eVar.U(eVar.f2781h1.getResources().getDimension(i2));
        }
    }

    public void setIconStartPadding(float f8) {
        e eVar = this.f3013b0;
        if (eVar != null) {
            eVar.V(f8);
        }
    }

    public void setIconStartPaddingResource(int i2) {
        e eVar = this.f3013b0;
        if (eVar != null) {
            eVar.V(eVar.f2781h1.getResources().getDimension(i2));
        }
    }

    @Override // android.view.View
    public void setLayoutDirection(int i2) {
        if (this.f3013b0 == null) {
            return;
        }
        super.setLayoutDirection(i2);
    }

    @Override // android.widget.TextView
    public void setLines(int i2) {
        if (i2 <= 1) {
            super.setLines(i2);
        } else {
            o.v("Chip does not support multi-line text");
        }
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i2) {
        if (i2 <= 1) {
            super.setMaxLines(i2);
        } else {
            o.v("Chip does not support multi-line text");
        }
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i2) {
        super.setMaxWidth(i2);
        e eVar = this.f3013b0;
        if (eVar != null) {
            eVar.G1 = i2;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i2) {
        if (i2 <= 1) {
            super.setMinLines(i2);
        } else {
            o.v("Chip does not support multi-line text");
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f3017f0 = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f3016e0 = onClickListener;
        d();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        e eVar = this.f3013b0;
        if (eVar != null) {
            eVar.W(colorStateList);
        }
        this.f3013b0.getClass();
        e();
    }

    public void setRippleColorResource(int i2) {
        e eVar = this.f3013b0;
        if (eVar != null) {
            eVar.W(g.z(eVar.f2781h1, i2));
            this.f3013b0.getClass();
            e();
        }
    }

    @Override // na.y
    public void setShapeAppearanceModel(n nVar) {
        this.f3013b0.setShapeAppearanceModel(nVar);
    }

    public void setShowMotionSpec(u9.b bVar) {
        e eVar = this.f3013b0;
        if (eVar != null) {
            eVar.X0 = bVar;
        }
    }

    public void setShowMotionSpecResource(int i2) {
        e eVar = this.f3013b0;
        if (eVar != null) {
            eVar.X0 = u9.b.a(eVar.f2781h1, i2);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z10) {
        if (z10) {
            super.setSingleLine(z10);
        } else {
            o.v("Chip does not support multi-line text");
        }
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        CharSequence charSequence2;
        e eVar = this.f3013b0;
        if (eVar != null) {
            if (charSequence == null) {
                charSequence = "";
            }
            if (eVar.F1) {
                charSequence2 = null;
            } else {
                charSequence2 = charSequence;
            }
            super.setText(charSequence2, bufferType);
            e eVar2 = this.f3013b0;
            if (eVar2 != null && !TextUtils.equals(eVar2.H0, charSequence)) {
                eVar2.H0 = charSequence;
                eVar2.f2787n1.f6434d = true;
                eVar2.invalidateSelf();
                eVar2.A();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        e eVar = this.f3013b0;
        if (eVar != null) {
            eVar.X(new ka.d(eVar.f2781h1, i2));
        }
        g();
    }

    public void setTextAppearanceResource(int i2) {
        setTextAppearance(getContext(), i2);
    }

    public void setTextEndPadding(float f8) {
        e eVar = this.f3013b0;
        if (eVar != null && eVar.f2777d1 != f8) {
            eVar.f2777d1 = f8;
            eVar.invalidateSelf();
            eVar.A();
        }
    }

    public void setTextEndPaddingResource(int i2) {
        e eVar = this.f3013b0;
        if (eVar != null) {
            float dimension = eVar.f2781h1.getResources().getDimension(i2);
            if (eVar.f2777d1 != dimension) {
                eVar.f2777d1 = dimension;
                eVar.invalidateSelf();
                eVar.A();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i2, float f8) {
        super.setTextSize(i2, f8);
        e eVar = this.f3013b0;
        if (eVar != null) {
            float applyDimension = TypedValue.applyDimension(i2, f8, getResources().getDisplayMetrics());
            ha.g gVar = eVar.f2787n1;
            ka.d dVar = gVar.f6436f;
            if (dVar != null) {
                dVar.f8127l = applyDimension;
                gVar.f6431a.setTextSize(applyDimension);
                eVar.A();
                eVar.invalidateSelf();
            }
        }
        g();
    }

    public void setTextStartPadding(float f8) {
        e eVar = this.f3013b0;
        if (eVar != null && eVar.f2776c1 != f8) {
            eVar.f2776c1 = f8;
            eVar.invalidateSelf();
            eVar.A();
        }
    }

    public void setTextStartPaddingResource(int i2) {
        e eVar = this.f3013b0;
        if (eVar != null) {
            float dimension = eVar.f2781h1.getResources().getDimension(i2);
            if (eVar.f2776c1 != dimension) {
                eVar.f2776c1 = dimension;
                eVar.invalidateSelf();
                eVar.A();
            }
        }
    }

    public void setCloseIconVisible(boolean z10) {
        e eVar = this.f3013b0;
        if (eVar != null) {
            eVar.T(z10);
        }
        d();
    }

    public void setCheckedIconVisible(boolean z10) {
        e eVar = this.f3013b0;
        if (eVar != null) {
            eVar.F(z10);
        }
    }

    public void setChipIconVisible(boolean z10) {
        e eVar = this.f3013b0;
        if (eVar != null) {
            eVar.K(z10);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            o.v("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            o.v("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            o.v("Please set left drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            o.v("Please set right drawable using R.attr#closeIcon.");
        }
    }

    public void setTextAppearance(ka.d dVar) {
        e eVar = this.f3013b0;
        if (eVar != null) {
            eVar.X(dVar);
        }
        g();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i2) {
        super.setTextAppearance(i2);
        e eVar = this.f3013b0;
        if (eVar != null) {
            eVar.X(new ka.d(eVar.f2781h1, i2));
        }
        g();
    }

    public void setInternalOnCheckedChangeListener(ha.e eVar) {
    }
}
