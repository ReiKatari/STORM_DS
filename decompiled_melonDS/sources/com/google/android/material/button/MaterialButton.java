package com.google.android.material.button;

import android.annotation.SuppressLint;
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
import ha.i;
import java.util.Iterator;
import java.util.LinkedHashSet;
import k7.w;
import l6.f;
import l6.g;
import me.magnum.melonds.R;
import na.b0;
import na.e0;
import na.j;
import na.m;
import na.n;
import na.y;
import q.o;
import rd.k;
import w.d;
import z9.a;
import z9.b;
import z9.c;
import z9.e;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class MaterialButton extends o implements Checkable, y {
    public static final int[] C0 = {16842911};
    public static final int[] D0 = {16842912};
    public static final a E0 = new Object();
    public float A0;
    public f B0;
    public final e R;

    /* renamed from: b0 */
    public final LinkedHashSet f2976b0;

    /* renamed from: c0 */
    public b f2977c0;

    /* renamed from: d0 */
    public PorterDuff.Mode f2978d0;

    /* renamed from: e0 */
    public ColorStateList f2979e0;

    /* renamed from: f0 */
    public Drawable f2980f0;

    /* renamed from: g0 */
    public String f2981g0;

    /* renamed from: h0 */
    public int f2982h0;

    /* renamed from: i0 */
    public int f2983i0;

    /* renamed from: j0 */
    public int f2984j0;

    /* renamed from: k0 */
    public int f2985k0;

    /* renamed from: l0 */
    public boolean f2986l0;

    /* renamed from: m0 */
    public boolean f2987m0;

    /* renamed from: n0 */
    public int f2988n0;

    /* renamed from: o0 */
    public int f2989o0;
    public float p0;

    /* renamed from: q0 */
    public int f2990q0;

    /* renamed from: r0 */
    public int f2991r0;

    /* renamed from: s0 */
    public LinearLayout.LayoutParams f2992s0;

    /* renamed from: t0 */
    public boolean f2993t0;

    /* renamed from: u0 */
    public int f2994u0;

    /* renamed from: v0 */
    public boolean f2995v0;

    /* renamed from: w0 */
    public int f2996w0;

    /* renamed from: x0 */
    public e0 f2997x0;

    /* renamed from: y0 */
    public int f2998y0;

    /* renamed from: z0 */
    public float f2999z0;

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(sa.a.b(context, attributeSet, R.attr.materialButtonStyle, 2131952797, new int[]{R.attr.materialSizeOverlay}), attributeSet, R.attr.materialButtonStyle);
        n a10;
        this.f2976b0 = new LinkedHashSet();
        this.f2986l0 = false;
        this.f2987m0 = false;
        this.f2989o0 = -1;
        this.p0 = -1.0f;
        this.f2990q0 = -1;
        this.f2991r0 = -1;
        this.f2996w0 = -1;
        Context context2 = getContext();
        TypedArray e6 = i.e(context2, attributeSet, t9.a.f13159j, R.attr.materialButtonStyle, 2131952797, new int[0]);
        this.f2985k0 = e6.getDimensionPixelSize(13, 0);
        int i2 = e6.getInt(16, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f2978d0 = i.f(i2, mode);
        this.f2979e0 = w.m(getContext(), e6, 15);
        this.f2980f0 = w.q(getContext(), e6, 11);
        this.f2988n0 = e6.getInteger(12, 1);
        this.f2982h0 = e6.getDimensionPixelSize(14, 0);
        b0 b10 = b0.b(context2, e6, 19);
        if (b10 != null) {
            a10 = b10.c();
        } else {
            a10 = n.b(context2, attributeSet, R.attr.materialButtonStyle, 2131952797).a();
        }
        boolean z10 = e6.getBoolean(17, false);
        e eVar = new e(this, a10);
        this.R = eVar;
        eVar.f14984f = e6.getDimensionPixelOffset(2, 0);
        eVar.f14985g = e6.getDimensionPixelOffset(3, 0);
        eVar.f14986h = e6.getDimensionPixelOffset(4, 0);
        eVar.f14987i = e6.getDimensionPixelOffset(5, 0);
        if (e6.hasValue(9)) {
            int dimensionPixelSize = e6.getDimensionPixelSize(9, -1);
            eVar.f14988j = dimensionPixelSize;
            float f8 = dimensionPixelSize;
            m f10 = eVar.f14980b.f();
            f10.f10190e = new na.a(f8);
            f10.f10191f = new na.a(f8);
            f10.f10192g = new na.a(f8);
            f10.f10193h = new na.a(f8);
            eVar.f14980b = f10.a();
            eVar.f14981c = null;
            eVar.d();
            eVar.f14996s = true;
        }
        eVar.f14989k = e6.getDimensionPixelSize(22, 0);
        eVar.f14990l = i.f(e6.getInt(8, -1), mode);
        eVar.m = w.m(getContext(), e6, 7);
        eVar.f14991n = w.m(getContext(), e6, 21);
        eVar.f14992o = w.m(getContext(), e6, 18);
        eVar.f14997t = e6.getBoolean(6, false);
        eVar.f15000w = e6.getDimensionPixelSize(10, 0);
        eVar.f14998u = e6.getBoolean(23, true);
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (e6.hasValue(0)) {
            eVar.f14995r = true;
            setSupportBackgroundTintList(eVar.m);
            setSupportBackgroundTintMode(eVar.f14990l);
        } else {
            eVar.c();
        }
        setPaddingRelative(paddingStart + eVar.f14984f, paddingTop + eVar.f14986h, paddingEnd + eVar.f14985g, paddingBottom + eVar.f14987i);
        setCheckedInternal(e6.getBoolean(1, false));
        if (b10 != null) {
            eVar.f14982d = d();
            if (eVar.f14981c != null) {
                eVar.d();
            }
            eVar.f14981c = b10;
            eVar.d();
        }
        setOpticalCenterEnabled(z10);
        e6.recycle();
        setCompoundDrawablePadding(this.f2985k0);
        h(this.f2980f0 != null);
    }

    public static /* synthetic */ void a(MaterialButton materialButton) {
        materialButton.f2994u0 = materialButton.getOpticalCenterShift();
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
        return this.f2999z0;
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
        j a10;
        if (!this.f2993t0 || !this.f2995v0 || (a10 = this.R.a(false)) == null) {
            return 0;
        }
        return (int) (a10.h() * 0.11f);
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
        float f8 = 0.0f;
        for (int i2 = 0; i2 < lineCount; i2++) {
            f8 = Math.max(f8, getLayout().getLineWidth(i2));
        }
        return (int) Math.ceil(f8);
    }

    private void setCheckedInternal(boolean z10) {
        e eVar = this.R;
        if (eVar != null && eVar.f14997t && this.f2986l0 != z10) {
            this.f2986l0 = z10;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
                boolean z11 = this.f2986l0;
                if (!materialButtonToggleGroup.f3002i0) {
                    materialButtonToggleGroup.f(getId(), z11);
                }
            }
            if (!this.f2987m0) {
                this.f2987m0 = true;
                Iterator it = this.f2976b0.iterator();
                if (!it.hasNext()) {
                    this.f2987m0 = false;
                    return;
                }
                throw d.k(it);
            }
        }
    }

    public void setDisplayedWidthIncrease(float f8) {
        MaterialButton materialButton;
        MaterialButton materialButton2;
        if (this.f2999z0 != f8) {
            this.f2999z0 = f8;
            j();
            invalidate();
            if (getParent() instanceof z9.d) {
                z9.d dVar = (z9.d) getParent();
                int i2 = (int) this.f2999z0;
                int indexOfChild = dVar.indexOfChild(this);
                if (indexOfChild >= 0) {
                    int i10 = indexOfChild - 1;
                    while (true) {
                        materialButton = null;
                        if (i10 >= 0) {
                            if (dVar.c(i10)) {
                                materialButton2 = (MaterialButton) dVar.getChildAt(i10);
                                break;
                            }
                            i10--;
                        } else {
                            materialButton2 = null;
                            break;
                        }
                    }
                    int childCount = dVar.getChildCount();
                    while (true) {
                        indexOfChild++;
                        if (indexOfChild < childCount) {
                            if (dVar.c(indexOfChild)) {
                                materialButton = (MaterialButton) dVar.getChildAt(indexOfChild);
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (materialButton2 != null || materialButton != null) {
                        if (materialButton2 == null) {
                            materialButton.setDisplayedWidthDecrease(i2);
                        }
                        if (materialButton == null) {
                            materialButton2.setDisplayedWidthDecrease(i2);
                        }
                        if (materialButton2 != null && materialButton != null) {
                            materialButton2.setDisplayedWidthDecrease(i2 / 2);
                            materialButton.setDisplayedWidthDecrease((i2 + 1) / 2);
                        }
                    }
                }
            }
        }
    }

    public final g d() {
        TypedArray obtainStyledAttributes;
        Context context = getContext();
        TypedValue I = k0.d.I(context, R.attr.motionSpringFastSpatial);
        int[] iArr = t9.a.f13167s;
        if (I == null) {
            obtainStyledAttributes = context.obtainStyledAttributes(null, iArr, 0, 2131951951);
        } else {
            obtainStyledAttributes = context.obtainStyledAttributes(I.resourceId, iArr);
        }
        g gVar = new g();
        try {
            float f8 = obtainStyledAttributes.getFloat(1, Float.MIN_VALUE);
            if (f8 != Float.MIN_VALUE) {
                float f10 = obtainStyledAttributes.getFloat(0, Float.MIN_VALUE);
                if (f10 != Float.MIN_VALUE) {
                    gVar.b(f8);
                    gVar.a(f10);
                    return gVar;
                }
                throw new IllegalArgumentException("A MaterialSpring style must have a damping value.");
            }
            throw new IllegalArgumentException("A MaterialSpring style must have stiffness value.");
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public final boolean e() {
        e eVar = this.R;
        if (eVar != null && !eVar.f14995r) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x0073, code lost:
        if (r1 == na.d0.PIXELS) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(boolean r9) {
        /*
            r8 = this;
            na.e0 r0 = r8.f2997x0
            if (r0 != 0) goto L6
            goto L87
        L6:
            l6.f r0 = r8.B0
            if (r0 != 0) goto L19
            l6.f r0 = new l6.f
            z9.a r1 = com.google.android.material.button.MaterialButton.E0
            r0.<init>(r8, r1)
            r8.B0 = r0
            l6.g r1 = r8.d()
            r0.m = r1
        L19:
            boolean r0 = r8.f2995v0
            if (r0 == 0) goto L87
            int r0 = r8.f2998y0
            na.e0 r1 = r8.f2997x0
            int[] r2 = r8.getDrawableState()
            int[][] r3 = r1.f10141c
            r4 = 0
            r5 = r4
        L29:
            int r6 = r1.f10139a
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
            int[][] r3 = r1.f10141c
            r5 = r4
        L42:
            int r6 = r1.f10139a
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
            l.i0 r1 = r1.f10140b
            goto L5d
        L59:
            l.i0[] r1 = r1.f10142d
            r1 = r1[r5]
        L5d:
            java.lang.Object r1 = r1.B
            na.c0 r1 = (na.c0) r1
            int r2 = r8.getWidth()
            float r3 = r1.f10138b
            na.d0 r1 = r1.f10137a
            na.d0 r5 = na.d0.PERCENT
            if (r1 != r5) goto L71
            float r1 = (float) r2
            float r3 = r3 * r1
        L6f:
            int r4 = (int) r3
            goto L76
        L71:
            na.d0 r2 = na.d0.PIXELS
            if (r1 != r2) goto L76
            goto L6f
        L76:
            int r0 = java.lang.Math.min(r0, r4)
            l6.f r1 = r8.B0
            float r0 = (float) r0
            r1.a(r0)
            if (r9 == 0) goto L87
            l6.f r9 = r8.B0
            r9.d()
        L87:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButton.f(boolean):void");
    }

    public final void g() {
        int i2 = this.f2988n0;
        if (i2 != 1 && i2 != 2) {
            if (i2 != 3 && i2 != 4) {
                if (i2 != 16 && i2 != 32) {
                    return;
                }
                setCompoundDrawablesRelative(null, this.f2980f0, null, null);
                return;
            }
            setCompoundDrawablesRelative(null, null, this.f2980f0, null);
            return;
        }
        setCompoundDrawablesRelative(this.f2980f0, null, null, null);
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public String getA11yClassName() {
        Class cls;
        if (!TextUtils.isEmpty(this.f2981g0)) {
            return this.f2981g0;
        }
        e eVar = this.R;
        if (eVar != null && eVar.f14997t) {
            cls = CompoundButton.class;
        } else {
            cls = Button.class;
        }
        return cls.getName();
    }

    public int getAllowedWidthDecrease() {
        return this.f2996w0;
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
            return this.R.f14988j;
        }
        return 0;
    }

    public g getCornerSpringForce() {
        return this.R.f14982d;
    }

    public Drawable getIcon() {
        return this.f2980f0;
    }

    public int getIconGravity() {
        return this.f2988n0;
    }

    public int getIconPadding() {
        return this.f2985k0;
    }

    public int getIconSize() {
        return this.f2982h0;
    }

    public ColorStateList getIconTint() {
        return this.f2979e0;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f2978d0;
    }

    public int getInsetBottom() {
        return this.R.f14987i;
    }

    public int getInsetTop() {
        return this.R.f14986h;
    }

    public ColorStateList getRippleColor() {
        if (e()) {
            return this.R.f14992o;
        }
        return null;
    }

    public n getShapeAppearanceModel() {
        if (e()) {
            return this.R.f14980b;
        }
        a0.j.p("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
        return null;
    }

    public b0 getStateListShapeAppearanceModel() {
        if (e()) {
            return this.R.f14981c;
        }
        a0.j.p("Attempted to get StateListShapeAppearanceModel from a MaterialButton which has an overwritten background.");
        return null;
    }

    public ColorStateList getStrokeColor() {
        if (e()) {
            return this.R.f14991n;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (e()) {
            return this.R.f14989k;
        }
        return 0;
    }

    @Override // q.o
    public ColorStateList getSupportBackgroundTintList() {
        if (e()) {
            return this.R.m;
        }
        return super.getSupportBackgroundTintList();
    }

    @Override // q.o
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (e()) {
            return this.R.f14990l;
        }
        return super.getSupportBackgroundTintMode();
    }

    public final void h(boolean z10) {
        Drawable drawable = this.f2980f0;
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.f2980f0 = mutate;
            mutate.setTintList(this.f2979e0);
            PorterDuff.Mode mode = this.f2978d0;
            if (mode != null) {
                this.f2980f0.setTintMode(mode);
            }
            int i2 = this.f2982h0;
            if (i2 == 0) {
                i2 = this.f2980f0.getIntrinsicWidth();
            }
            int i10 = this.f2982h0;
            if (i10 == 0) {
                i10 = this.f2980f0.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f2980f0;
            int i11 = this.f2983i0;
            int i12 = this.f2984j0;
            drawable2.setBounds(i11, i12, i2 + i11, i10 + i12);
            this.f2980f0.setVisible(true, z10);
        }
        if (z10) {
            g();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        int i13 = this.f2988n0;
        if (((i13 != 1 && i13 != 2) || drawable3 == this.f2980f0) && (((i13 != 3 && i13 != 4) || drawable5 == this.f2980f0) && ((i13 != 16 && i13 != 32) || drawable4 == this.f2980f0))) {
            return;
        }
        g();
    }

    public final void i(int i2, int i10) {
        boolean z10;
        if (this.f2980f0 != null && getLayout() != null) {
            int i11 = this.f2988n0;
            boolean z11 = true;
            if (i11 != 1 && i11 != 2 && i11 != 3 && i11 != 4) {
                if (i11 != 16 && i11 != 32) {
                    return;
                }
                this.f2983i0 = 0;
                if (i11 == 16) {
                    this.f2984j0 = 0;
                    h(false);
                    return;
                }
                int i12 = this.f2982h0;
                if (i12 == 0) {
                    i12 = this.f2980f0.getIntrinsicHeight();
                }
                int max = Math.max(0, (((((i10 - getTextHeight()) - getPaddingTop()) - i12) - this.f2985k0) - getPaddingBottom()) / 2);
                if (this.f2984j0 != max) {
                    this.f2984j0 = max;
                    h(false);
                    return;
                }
                return;
            }
            this.f2984j0 = 0;
            Layout.Alignment actualTextAlignment = getActualTextAlignment();
            int i13 = this.f2988n0;
            if (i13 != 1 && i13 != 3 && ((i13 != 2 || actualTextAlignment != Layout.Alignment.ALIGN_NORMAL) && (i13 != 4 || actualTextAlignment != Layout.Alignment.ALIGN_OPPOSITE))) {
                int i14 = this.f2982h0;
                if (i14 == 0) {
                    i14 = this.f2980f0.getIntrinsicWidth();
                }
                int textLayoutWidth = ((((i2 - getTextLayoutWidth()) - getPaddingEnd()) - i14) - this.f2985k0) - getPaddingStart();
                if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
                    textLayoutWidth /= 2;
                }
                if (getLayoutDirection() == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (this.f2988n0 != 4) {
                    z11 = false;
                }
                if (z10 != z11) {
                    textLayoutWidth = -textLayoutWidth;
                }
                if (this.f2983i0 != textLayoutWidth) {
                    this.f2983i0 = textLayoutWidth;
                    h(false);
                    return;
                }
                return;
            }
            this.f2983i0 = 0;
            h(false);
        }
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f2986l0;
    }

    public final void j() {
        int i2 = (int) (this.f2999z0 - this.A0);
        int i10 = (i2 / 2) + this.f2994u0;
        getLayoutParams().width = (int) (this.p0 + i2);
        setPaddingRelative(this.f2990q0 + i10, getPaddingTop(), (this.f2991r0 + i2) - i10, getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (e()) {
            w.F(this, this.R.a(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 2);
        e eVar = this.R;
        if (eVar != null && eVar.f14997t) {
            View.mergeDrawableStates(onCreateDrawableState, C0);
        }
        if (this.f2986l0) {
            View.mergeDrawableStates(onCreateDrawableState, D0);
        }
        return onCreateDrawableState;
    }

    @Override // q.o, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.f2986l0);
    }

    @Override // q.o, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        e eVar = this.R;
        if (eVar != null && eVar.f14997t) {
            z10 = true;
        } else {
            z10 = false;
        }
        accessibilityNodeInfo.setCheckable(z10);
        accessibilityNodeInfo.setChecked(this.f2986l0);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // q.o, android.widget.TextView, android.view.View
    public final void onLayout(boolean z10, int i2, int i10, int i11, int i12) {
        int i13;
        super.onLayout(z10, i2, i10, i11, i12);
        i(getMeasuredWidth(), getMeasuredHeight());
        int i14 = getResources().getConfiguration().orientation;
        if (this.f2989o0 != i14) {
            this.f2989o0 = i14;
            this.p0 = -1.0f;
        }
        if (this.p0 == -1.0f) {
            this.p0 = getMeasuredWidth();
            if (this.f2992s0 == null && (getParent() instanceof z9.d) && ((z9.d) getParent()).getButtonSizeChange() != null) {
                this.f2992s0 = (LinearLayout.LayoutParams) getLayoutParams();
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f2992s0);
                layoutParams.width = (int) this.p0;
                setLayoutParams(layoutParams);
            }
        }
        boolean z11 = false;
        if (this.f2996w0 == -1) {
            if (this.f2980f0 == null) {
                i13 = 0;
            } else {
                int iconPadding = getIconPadding();
                int i15 = this.f2982h0;
                if (i15 == 0) {
                    i15 = this.f2980f0.getIntrinsicWidth();
                }
                i13 = iconPadding + i15;
            }
            this.f2996w0 = (getMeasuredWidth() - getTextLayoutWidth()) - i13;
        }
        if (this.f2990q0 == -1) {
            this.f2990q0 = getPaddingStart();
        }
        if (this.f2991r0 == -1) {
            this.f2991r0 = getPaddingEnd();
        }
        if ((getParent() instanceof z9.d) && ((z9.d) getParent()).getOrientation() == 0) {
            z11 = true;
        }
        this.f2995v0 = z11;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(cVar.A);
        setChecked(cVar.L);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [i6.b, android.os.Parcelable, z9.c] */
    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? bVar = new i6.b(super.onSaveInstanceState());
        bVar.L = this.f2986l0;
        return bVar;
    }

    @Override // q.o, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i2, int i10, int i11) {
        super.onTextChanged(charSequence, i2, i10, i11);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (isEnabled() && this.R.f14998u) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f2980f0 != null) {
            if (this.f2980f0.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.f2981g0 = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i2) {
        if (e()) {
            e eVar = this.R;
            if (eVar.a(false) != null) {
                eVar.a(false).setTint(i2);
                return;
            }
            return;
        }
        super.setBackgroundColor(i2);
    }

    @Override // q.o, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (e()) {
            if (drawable != getBackground()) {
                Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
                e eVar = this.R;
                eVar.f14995r = true;
                MaterialButton materialButton = eVar.f14979a;
                materialButton.setSupportBackgroundTintList(eVar.m);
                materialButton.setSupportBackgroundTintMode(eVar.f14990l);
                super.setBackgroundDrawable(drawable);
                return;
            }
            getBackground().setState(drawable.getState());
            return;
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // q.o, android.view.View
    public void setBackgroundResource(int i2) {
        Drawable drawable;
        if (i2 != 0) {
            drawable = w.p(getContext(), i2);
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

    public void setCheckable(boolean z10) {
        if (e()) {
            this.R.f14997t = z10;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        setCheckedInternal(z10);
    }

    public void setCornerRadius(int i2) {
        if (e()) {
            e eVar = this.R;
            if (!eVar.f14996s || eVar.f14988j != i2) {
                eVar.f14988j = i2;
                eVar.f14996s = true;
                float f8 = i2;
                m f10 = eVar.f14980b.f();
                f10.f10190e = new na.a(f8);
                f10.f10191f = new na.a(f8);
                f10.f10192g = new na.a(f8);
                f10.f10193h = new na.a(f8);
                eVar.f14980b = f10.a();
                eVar.f14981c = null;
                eVar.d();
            }
        }
    }

    public void setCornerRadiusResource(int i2) {
        if (e()) {
            setCornerRadius(getResources().getDimensionPixelSize(i2));
        }
    }

    public void setCornerSpringForce(g gVar) {
        e eVar = this.R;
        eVar.f14982d = gVar;
        if (eVar.f14981c != null) {
            eVar.d();
        }
    }

    public void setDisplayedWidthDecrease(int i2) {
        this.A0 = Math.min(i2, this.f2996w0);
        j();
        invalidate();
    }

    @Override // android.view.View
    public void setElevation(float f8) {
        super.setElevation(f8);
        if (e()) {
            this.R.a(false).m(f8);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f2980f0 != drawable) {
            this.f2980f0 = drawable;
            h(true);
            i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i2) {
        if (this.f2988n0 != i2) {
            this.f2988n0 = i2;
            i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i2) {
        if (this.f2985k0 != i2) {
            this.f2985k0 = i2;
            setCompoundDrawablePadding(i2);
        }
    }

    public void setIconResource(int i2) {
        Drawable drawable;
        if (i2 != 0) {
            drawable = w.p(getContext(), i2);
        } else {
            drawable = null;
        }
        setIcon(drawable);
    }

    public void setIconSize(int i2) {
        if (i2 >= 0) {
            if (this.f2982h0 != i2) {
                this.f2982h0 = i2;
                h(true);
                return;
            }
            return;
        }
        a0.j.h("iconSize cannot be less than 0");
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f2979e0 != colorStateList) {
            this.f2979e0 = colorStateList;
            h(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f2978d0 != mode) {
            this.f2978d0 = mode;
            h(false);
        }
    }

    public void setIconTintResource(int i2) {
        setIconTint(aj.g.z(getContext(), i2));
    }

    public void setInsetBottom(int i2) {
        e eVar = this.R;
        eVar.b(eVar.f14986h, i2);
    }

    public void setInsetTop(int i2) {
        e eVar = this.R;
        eVar.b(i2, eVar.f14987i);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(b bVar) {
        this.f2977c0 = bVar;
    }

    public void setOpticalCenterEnabled(boolean z10) {
        if (this.f2993t0 != z10) {
            this.f2993t0 = z10;
            e eVar = this.R;
            if (z10) {
                ah.e eVar2 = new ah.e(22, this);
                eVar.f14983e = eVar2;
                j a10 = eVar.a(false);
                if (a10 != null) {
                    a10.f10184x0 = eVar2;
                }
            } else {
                eVar.f14983e = null;
                j a11 = eVar.a(false);
                if (a11 != null) {
                    a11.f10184x0 = null;
                }
            }
            post(new r0.b(13, this));
        }
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        b bVar = this.f2977c0;
        if (bVar != null) {
            ((MaterialButtonToggleGroup) ((k) bVar).B).invalidate();
        }
        super.setPressed(z10);
        f(false);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (e()) {
            e eVar = this.R;
            MaterialButton materialButton = eVar.f14979a;
            if (eVar.f14992o != colorStateList) {
                eVar.f14992o = colorStateList;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(la.a.a(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i2) {
        if (e()) {
            setRippleColor(aj.g.z(getContext(), i2));
        }
    }

    @Override // na.y
    public void setShapeAppearanceModel(n nVar) {
        if (e()) {
            e eVar = this.R;
            eVar.f14980b = nVar;
            eVar.f14981c = null;
            eVar.d();
            return;
        }
        a0.j.p("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    public void setShouldDrawSurfaceColorStroke(boolean z10) {
        if (e()) {
            e eVar = this.R;
            eVar.f14994q = z10;
            eVar.e();
        }
    }

    public void setSizeChange(e0 e0Var) {
        if (this.f2997x0 != e0Var) {
            this.f2997x0 = e0Var;
            f(true);
        }
    }

    public void setStateListShapeAppearanceModel(b0 b0Var) {
        if (e()) {
            e eVar = this.R;
            if (eVar.f14982d == null && b0Var.d()) {
                eVar.f14982d = d();
                if (eVar.f14981c != null) {
                    eVar.d();
                }
            }
            eVar.f14981c = b0Var;
            eVar.d();
            return;
        }
        a0.j.p("Attempted to set StateListShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (e()) {
            e eVar = this.R;
            if (eVar.f14991n != colorStateList) {
                eVar.f14991n = colorStateList;
                eVar.e();
            }
        }
    }

    public void setStrokeColorResource(int i2) {
        if (e()) {
            setStrokeColor(aj.g.z(getContext(), i2));
        }
    }

    public void setStrokeWidth(int i2) {
        if (e()) {
            e eVar = this.R;
            if (eVar.f14989k != i2) {
                eVar.f14989k = i2;
                eVar.e();
            }
        }
    }

    public void setStrokeWidthResource(int i2) {
        if (e()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i2));
        }
    }

    @Override // q.o
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (e()) {
            e eVar = this.R;
            if (eVar.m != colorStateList) {
                eVar.m = colorStateList;
                if (eVar.a(false) != null) {
                    eVar.a(false).setTintList(eVar.m);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintList(colorStateList);
    }

    @Override // q.o
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (e()) {
            e eVar = this.R;
            if (eVar.f14990l != mode) {
                eVar.f14990l = mode;
                if (eVar.a(false) != null && eVar.f14990l != null) {
                    eVar.a(false).setTintMode(eVar.f14990l);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintMode(mode);
    }

    @Override // android.view.View
    public void setTextAlignment(int i2) {
        super.setTextAlignment(i2);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z10) {
        this.R.f14998u = z10;
    }

    @Override // android.widget.TextView
    public void setWidth(int i2) {
        this.p0 = -1.0f;
        super.setWidth(i2);
    }

    public void setWidthChangeMax(int i2) {
        if (this.f2998y0 != i2) {
            this.f2998y0 = i2;
            f(true);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f2986l0);
    }
}
