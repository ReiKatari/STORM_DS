package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.Editable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final int[][] y1 = {new int[]{16842919}, new int[0]};
    public final FrameLayout A;
    public ColorStateList A0;
    public final pd6 B;
    public boolean B0;
    public CharSequence C0;
    public boolean D0;
    public gv3 E0;
    public gv3 F0;
    public StateListDrawable G0;
    public boolean H0;
    public gv3 I0;
    public gv3 J0;
    public a36 K0;
    public final yz1 L;
    public boolean L0;
    public final int M0;
    public int N0;
    public int O0;
    public int P0;
    public int Q0;
    public final int R;
    public int R0;
    public int S0;
    public int T0;
    public final Rect U0;
    public final Rect V0;
    public final RectF W0;
    public Typeface X0;
    public ColorDrawable Y0;
    public int Z0;
    public final LinkedHashSet a1;
    public ColorDrawable b1;
    public EditText c0;
    public int c1;
    public CharSequence d0;
    public Drawable d1;
    public int e0;
    public ColorStateList e1;
    public int f0;
    public ColorStateList f1;
    public int g0;
    public int g1;
    public int h0;
    public int h1;
    public final my2 i0;
    public int i1;
    public boolean j0;
    public ColorStateList j1;
    public int k0;
    public int k1;
    public boolean l0;
    public int l1;
    public xq6 m0;
    public int m1;
    public ds n0;
    public int n1;
    public int o0;
    public int o1;
    public int p0;
    public int p1;
    public CharSequence q0;
    public boolean q1;
    public boolean r0;
    public final nq0 r1;
    public ds s0;
    public boolean s1;
    public ColorStateList t0;
    public boolean t1;
    public int u0;
    public ValueAnimator u1;
    public o42 v0;
    public boolean v1;
    public o42 w0;
    public boolean w1;
    public ColorStateList x0;
    public boolean x1;
    public ColorStateList y0;
    public ColorStateList z0;

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        super(mh7.n0(context, attributeSet, R.attr.textInputStyle, 2132018130), attributeSet, R.attr.textInputStyle);
        this.e0 = -1;
        this.f0 = -1;
        this.g0 = -1;
        this.h0 = -1;
        this.i0 = new my2(this);
        this.m0 = new vd6(6);
        this.U0 = new Rect();
        this.V0 = new Rect();
        this.W0 = new RectF();
        this.a1 = new LinkedHashSet();
        nq0 nq0Var = new nq0(this);
        this.r1 = nq0Var;
        this.x1 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.A = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = jo.a;
        nq0Var.R = linearInterpolator;
        nq0Var.j(false);
        nq0Var.Q = linearInterpolator;
        nq0Var.j(false);
        if (nq0Var.g != 8388659) {
            nq0Var.g = 8388659;
            nq0Var.j(false);
        }
        n40.C(context2, attributeSet, R.attr.textInputStyle, 2132018130);
        int[] iArr = ay4.D;
        n40.E(context2, attributeSet, iArr, R.attr.textInputStyle, 2132018130, 22, 20, 40, 45, 50);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, R.attr.textInputStyle, 2132018130);
        n85 n85Var = new n85(context2, obtainStyledAttributes);
        pd6 pd6Var = new pd6(this, n85Var);
        this.B = pd6Var;
        this.B0 = obtainStyledAttributes.getBoolean(48, true);
        setHint(obtainStyledAttributes.getText(4));
        this.t1 = obtainStyledAttributes.getBoolean(47, true);
        this.s1 = obtainStyledAttributes.getBoolean(42, true);
        if (obtainStyledAttributes.hasValue(6)) {
            setMinEms(obtainStyledAttributes.getInt(6, -1));
        } else if (obtainStyledAttributes.hasValue(3)) {
            setMinWidth(obtainStyledAttributes.getDimensionPixelSize(3, -1));
        }
        if (obtainStyledAttributes.hasValue(5)) {
            setMaxEms(obtainStyledAttributes.getInt(5, -1));
        } else if (obtainStyledAttributes.hasValue(2)) {
            setMaxWidth(obtainStyledAttributes.getDimensionPixelSize(2, -1));
        }
        this.K0 = a36.b(context2, attributeSet, R.attr.textInputStyle, 2132018130).a();
        this.M0 = context2.getResources().getDimensionPixelOffset(R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.O0 = obtainStyledAttributes.getDimensionPixelOffset(9, 0);
        this.R = getResources().getDimensionPixelSize(R.dimen.m3_multiline_hint_filled_text_extra_space);
        this.Q0 = obtainStyledAttributes.getDimensionPixelSize(16, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_textinput_box_stroke_width_default));
        this.R0 = obtainStyledAttributes.getDimensionPixelSize(17, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.P0 = this.Q0;
        float dimension = obtainStyledAttributes.getDimension(13, -1.0f);
        float dimension2 = obtainStyledAttributes.getDimension(12, -1.0f);
        float dimension3 = obtainStyledAttributes.getDimension(10, -1.0f);
        float dimension4 = obtainStyledAttributes.getDimension(11, -1.0f);
        z26 f = this.K0.f();
        if (dimension >= RecyclerView.A1) {
            f.e = new s(dimension);
        }
        if (dimension2 >= RecyclerView.A1) {
            f.f = new s(dimension2);
        }
        if (dimension3 >= RecyclerView.A1) {
            f.g = new s(dimension3);
        }
        if (dimension4 >= RecyclerView.A1) {
            f.h = new s(dimension4);
        }
        this.K0 = f.a();
        ColorStateList B = nk2.B(context2, n85Var, 7);
        if (B != null) {
            int defaultColor = B.getDefaultColor();
            this.k1 = defaultColor;
            this.T0 = defaultColor;
            if (B.isStateful()) {
                this.l1 = B.getColorForState(new int[]{-16842910}, -1);
                this.m1 = B.getColorForState(new int[]{16842908, 16842910}, -1);
                this.n1 = B.getColorForState(new int[]{16843623, 16842910}, -1);
            } else {
                this.m1 = this.k1;
                ColorStateList x = jv3.x(context2, R.color.mtrl_filled_background_color);
                this.l1 = x.getColorForState(new int[]{-16842910}, -1);
                this.n1 = x.getColorForState(new int[]{16843623}, -1);
            }
        } else {
            this.T0 = 0;
            this.k1 = 0;
            this.l1 = 0;
            this.m1 = 0;
            this.n1 = 0;
        }
        if (obtainStyledAttributes.hasValue(1)) {
            ColorStateList e = n85Var.e(1);
            this.f1 = e;
            this.e1 = e;
        }
        ColorStateList B2 = nk2.B(context2, n85Var, 14);
        this.i1 = obtainStyledAttributes.getColor(14, 0);
        this.g1 = context2.getColor(R.color.mtrl_textinput_default_box_stroke_color);
        this.o1 = context2.getColor(R.color.mtrl_textinput_disabled_color);
        this.h1 = context2.getColor(R.color.mtrl_textinput_hovered_box_stroke_color);
        if (B2 != null) {
            setBoxStrokeColorStateList(B2);
        }
        if (obtainStyledAttributes.hasValue(15)) {
            setBoxStrokeErrorColor(nk2.B(context2, n85Var, 15));
        }
        if (obtainStyledAttributes.getResourceId(50, -1) != -1) {
            setHintTextAppearance(obtainStyledAttributes.getResourceId(50, 0));
        }
        this.z0 = n85Var.e(24);
        this.A0 = n85Var.e(25);
        int resourceId = obtainStyledAttributes.getResourceId(40, 0);
        CharSequence text = obtainStyledAttributes.getText(35);
        int i = obtainStyledAttributes.getInt(34, 1);
        boolean z = obtainStyledAttributes.getBoolean(36, false);
        int resourceId2 = obtainStyledAttributes.getResourceId(45, 0);
        boolean z2 = obtainStyledAttributes.getBoolean(44, false);
        CharSequence text2 = obtainStyledAttributes.getText(43);
        int resourceId3 = obtainStyledAttributes.getResourceId(58, 0);
        CharSequence text3 = obtainStyledAttributes.getText(57);
        boolean z3 = obtainStyledAttributes.getBoolean(18, false);
        setCounterMaxLength(obtainStyledAttributes.getInt(19, -1));
        this.p0 = obtainStyledAttributes.getResourceId(22, 0);
        this.o0 = obtainStyledAttributes.getResourceId(20, 0);
        setBoxBackgroundMode(obtainStyledAttributes.getInt(8, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i);
        setCounterOverflowTextAppearance(this.o0);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.p0);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (obtainStyledAttributes.hasValue(41)) {
            setErrorTextColor(n85Var.e(41));
        }
        if (obtainStyledAttributes.hasValue(46)) {
            setHelperTextColor(n85Var.e(46));
        }
        if (obtainStyledAttributes.hasValue(51)) {
            setHintTextColor(n85Var.e(51));
        }
        if (obtainStyledAttributes.hasValue(23)) {
            setCounterTextColor(n85Var.e(23));
        }
        if (obtainStyledAttributes.hasValue(21)) {
            setCounterOverflowTextColor(n85Var.e(21));
        }
        if (obtainStyledAttributes.hasValue(59)) {
            setPlaceholderTextColor(n85Var.e(59));
        }
        yz1 yz1Var = new yz1(this, n85Var);
        this.L = yz1Var;
        boolean z4 = obtainStyledAttributes.getBoolean(0, true);
        setHintMaxLines(obtainStyledAttributes.getInt(49, 1));
        n85Var.t();
        setImportantForAccessibility(2);
        if (Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(1);
        }
        frameLayout.addView(pd6Var);
        frameLayout.addView(yz1Var);
        addView(frameLayout);
        setEnabled(z4);
        setHelperTextEnabled(z2);
        setErrorEnabled(z);
        setCounterEnabled(z3);
        setHelperText(text2);
    }

    private Drawable getEditTextBoxBackground() {
        int i;
        EditText editText = this.c0;
        if ((editText instanceof AutoCompleteTextView) && editText.getInputType() == 0) {
            int x = jk2.x(this.c0, R.attr.colorControlHighlight);
            int i2 = this.N0;
            int[][] iArr = y1;
            if (i2 == 2) {
                Context context = getContext();
                gv3 gv3Var = this.E0;
                TypedValue Q = hk2.Q(context, R.attr.colorSurface, "TextInputLayout");
                int i3 = Q.resourceId;
                if (i3 != 0) {
                    i = context.getColor(i3);
                } else {
                    i = Q.data;
                }
                gv3 gv3Var2 = new gv3(gv3Var.B.a);
                int I = jk2.I(0.1f, x, i);
                gv3Var2.n(new ColorStateList(iArr, new int[]{I, 0}));
                gv3Var2.setTint(i);
                ColorStateList colorStateList = new ColorStateList(iArr, new int[]{I, i});
                gv3 gv3Var3 = new gv3(gv3Var.B.a);
                gv3Var3.setTint(-1);
                return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, gv3Var2, gv3Var3), gv3Var});
            } else if (i2 == 1) {
                gv3 gv3Var4 = this.E0;
                int i4 = this.T0;
                return new RippleDrawable(new ColorStateList(iArr, new int[]{jk2.I(0.1f, x, i4), i4}), gv3Var4, gv3Var4);
            } else {
                return null;
            }
        }
        return this.E0;
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.G0 == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.G0 = stateListDrawable;
            stateListDrawable.addState(new int[]{16842922}, getOrCreateOutlinedDropDownMenuBackground());
            this.G0.addState(new int[0], h(false));
        }
        return this.G0;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.F0 == null) {
            this.F0 = h(true);
        }
        return this.F0;
    }

    public static void m(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                m((ViewGroup) childAt, z);
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.c0 == null) {
            if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
                Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
            }
            this.c0 = editText;
            int i = this.e0;
            if (i != -1) {
                setMinEms(i);
            } else {
                setMinWidth(this.g0);
            }
            int i2 = this.f0;
            if (i2 != -1) {
                setMaxEms(i2);
            } else {
                setMaxWidth(this.h0);
            }
            this.H0 = false;
            k();
            setTextInputAccessibilityDelegate(new wq6(this));
            Typeface typeface = this.c0.getTypeface();
            nq0 nq0Var = this.r1;
            nq0Var.n(typeface);
            float textSize = this.c0.getTextSize();
            if (nq0Var.h != textSize) {
                nq0Var.h = textSize;
                nq0Var.j(false);
            }
            float letterSpacing = this.c0.getLetterSpacing();
            if (nq0Var.X != letterSpacing) {
                nq0Var.X = letterSpacing;
                nq0Var.j(false);
            }
            int gravity = this.c0.getGravity();
            int i3 = (gravity & (-113)) | 48;
            if (nq0Var.g != i3) {
                nq0Var.g = i3;
                nq0Var.j(false);
            }
            if (nq0Var.f != gravity) {
                nq0Var.f = gravity;
                nq0Var.j(false);
            }
            this.p1 = editText.getMinimumHeight();
            this.c0.addTextChangedListener(new vq6(this, editText));
            if (this.e1 == null) {
                this.e1 = this.c0.getHintTextColors();
            }
            if (this.B0) {
                if (TextUtils.isEmpty(this.C0)) {
                    CharSequence hint = this.c0.getHint();
                    this.d0 = hint;
                    setHint(hint);
                    this.c0.setHint((CharSequence) null);
                }
                this.D0 = true;
            }
            if (Build.VERSION.SDK_INT >= 29) {
                r();
            }
            if (this.n0 != null) {
                p(this.c0.getText());
            }
            t();
            this.i0.b();
            this.B.bringToFront();
            yz1 yz1Var = this.L;
            yz1Var.bringToFront();
            Iterator it = this.a1.iterator();
            while (it.hasNext()) {
                ((wz1) it.next()).a(this);
            }
            yz1Var.m();
            if (!isEnabled()) {
                editText.setEnabled(false);
            }
            w(false, true);
            return;
        }
        i.i("We already have an EditText, can only have one");
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.C0)) {
            this.C0 = charSequence;
            nq0 nq0Var = this.r1;
            if (charSequence == null || !TextUtils.equals(nq0Var.B, charSequence)) {
                nq0Var.B = charSequence;
                nq0Var.C = null;
                nq0Var.j(false);
            }
            if (!this.q1) {
                l();
            }
        }
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.r0 == z) {
            return;
        }
        ds dsVar = this.s0;
        if (z) {
            if (dsVar != null) {
                this.A.addView(dsVar);
                this.s0.setVisibility(0);
            }
        } else {
            if (dsVar != null) {
                dsVar.setVisibility(8);
            }
            this.s0 = null;
        }
        this.r0 = z;
    }

    public final void a() {
        if (this.c0 != null && this.N0 == 1) {
            if (getHintMaxLines() == 1) {
                if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                    EditText editText = this.c0;
                    editText.setPaddingRelative(editText.getPaddingStart(), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_2_0_padding_top), this.c0.getPaddingEnd(), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_2_0_padding_bottom));
                    return;
                } else if (nk2.K(getContext())) {
                    EditText editText2 = this.c0;
                    editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_1_3_padding_top), this.c0.getPaddingEnd(), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_1_3_padding_bottom));
                    return;
                } else {
                    return;
                }
            }
            EditText editText3 = this.c0;
            editText3.setPaddingRelative(editText3.getPaddingStart(), (int) (this.r1.f() + this.R), this.c0.getPaddingEnd(), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_1_3_padding_bottom));
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
            FrameLayout frameLayout = this.A;
            frameLayout.addView(view, layoutParams2);
            frameLayout.setLayoutParams(layoutParams);
            v();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i, layoutParams);
    }

    public final void b(float f) {
        nq0 nq0Var = this.r1;
        if (nq0Var.b == f) {
            return;
        }
        if (this.u1 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.u1 = valueAnimator;
            valueAnimator.setInterpolator(me2.N(getContext(), R.attr.motionEasingEmphasizedInterpolator, jo.b));
            this.u1.setDuration(me2.M(getContext(), R.attr.motionDurationMedium4, 167));
            this.u1.addUpdateListener(new h40(2, this));
        }
        this.u1.setFloatValues(nq0Var.b, f);
        this.u1.start();
    }

    public final void c() {
        ColorStateList valueOf;
        int i;
        int i2;
        gv3 gv3Var = this.E0;
        if (gv3Var == null) {
            return;
        }
        a36 a36Var = gv3Var.B.a;
        a36 a36Var2 = this.K0;
        if (a36Var != a36Var2) {
            gv3Var.setShapeAppearanceModel(a36Var2);
        }
        if (this.N0 == 2 && (i = this.P0) > -1 && (i2 = this.S0) != 0) {
            gv3 gv3Var2 = this.E0;
            gv3Var2.B.k = i;
            gv3Var2.invalidateSelf();
            ColorStateList valueOf2 = ColorStateList.valueOf(i2);
            ev3 ev3Var = gv3Var2.B;
            if (ev3Var.e != valueOf2) {
                ev3Var.e = valueOf2;
                gv3Var2.onStateChange(gv3Var2.getState());
            }
        }
        int i3 = this.T0;
        if (this.N0 == 1) {
            i3 = gr0.b(this.T0, jk2.w(getContext(), R.attr.colorSurface, 0));
        }
        this.T0 = i3;
        this.E0.n(ColorStateList.valueOf(i3));
        gv3 gv3Var3 = this.I0;
        if (gv3Var3 != null && this.J0 != null) {
            if (this.P0 > -1 && this.S0 != 0) {
                if (this.c0.isFocused()) {
                    valueOf = ColorStateList.valueOf(this.g1);
                } else {
                    valueOf = ColorStateList.valueOf(this.S0);
                }
                gv3Var3.n(valueOf);
                this.J0.n(ColorStateList.valueOf(this.S0));
            }
            invalidate();
        }
        u();
    }

    public final Rect d(Rect rect) {
        boolean z;
        if (this.c0 != null) {
            if (getLayoutDirection() == 1) {
                z = true;
            } else {
                z = false;
            }
            int i = rect.bottom;
            Rect rect2 = this.V0;
            rect2.bottom = i;
            int i2 = this.N0;
            if (i2 != 1) {
                int i3 = rect.left;
                if (i2 != 2) {
                    rect2.left = i(i3, z);
                    rect2.top = getPaddingTop();
                    rect2.right = j(rect.right, z);
                    return rect2;
                }
                rect2.left = this.c0.getPaddingLeft() + i3;
                rect2.top = rect.top - e();
                rect2.right = rect.right - this.c0.getPaddingRight();
                return rect2;
            }
            rect2.left = i(rect.left, z);
            rect2.top = rect.top + this.O0;
            rect2.right = j(rect.right, z);
            return rect2;
        }
        f81.o();
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.c0;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.d0 != null) {
            boolean z = this.D0;
            this.D0 = false;
            CharSequence hint = editText.getHint();
            this.c0.setHint(this.d0);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.c0.setHint(hint);
                this.D0 = z;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        FrameLayout frameLayout = this.A;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i2 = 0; i2 < frameLayout.getChildCount(); i2++) {
            View childAt = frameLayout.getChildAt(i2);
            ViewStructure newChild = viewStructure.newChild(i2);
            childAt.dispatchProvideAutofillStructure(newChild, i);
            if (childAt == this.c0) {
                newChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.w1 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.w1 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        gv3 gv3Var;
        Canvas canvas2 = canvas;
        super.draw(canvas);
        boolean z = this.B0;
        nq0 nq0Var = this.r1;
        if (z) {
            TextPaint textPaint = nq0Var.O;
            RectF rectF = nq0Var.e;
            int save = canvas2.save();
            if (nq0Var.C != null && rectF.width() > RecyclerView.A1 && rectF.height() > RecyclerView.A1) {
                textPaint.setTextSize(nq0Var.G);
                float f = nq0Var.q;
                float f2 = nq0Var.r;
                float f3 = nq0Var.F;
                if (f3 != 1.0f) {
                    canvas2.scale(f3, f3, f, f2);
                }
                if ((nq0Var.e0 > 1 || nq0Var.f0 > 1) && !nq0Var.D && nq0Var.o()) {
                    int alpha = textPaint.getAlpha();
                    canvas2.translate(nq0Var.q - nq0Var.Z.getLineStart(0), f2);
                    float f4 = alpha;
                    textPaint.setAlpha((int) (nq0Var.c0 * f4));
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 31) {
                        float f5 = nq0Var.H;
                        float f6 = nq0Var.I;
                        float f7 = nq0Var.J;
                        int i2 = nq0Var.K;
                        textPaint.setShadowLayer(f5, f6, f7, gr0.d(i2, (textPaint.getAlpha() * Color.alpha(i2)) / 255));
                    }
                    nq0Var.Z.draw(canvas2);
                    textPaint.setAlpha((int) (nq0Var.b0 * f4));
                    if (i >= 31) {
                        float f8 = nq0Var.H;
                        float f9 = nq0Var.I;
                        float f10 = nq0Var.J;
                        int i3 = nq0Var.K;
                        textPaint.setShadowLayer(f8, f9, f10, gr0.d(i3, (Color.alpha(i3) * textPaint.getAlpha()) / 255));
                    }
                    int lineBaseline = nq0Var.Z.getLineBaseline(0);
                    CharSequence charSequence = nq0Var.d0;
                    float f11 = lineBaseline;
                    canvas2.drawText(charSequence, 0, charSequence.length(), RecyclerView.A1, f11, textPaint);
                    if (i >= 31) {
                        textPaint.setShadowLayer(nq0Var.H, nq0Var.I, nq0Var.J, nq0Var.K);
                    }
                    String trim = nq0Var.d0.toString().trim();
                    if (trim.endsWith("…")) {
                        trim = trim.substring(0, trim.length() - 1);
                    }
                    String str = trim;
                    textPaint.setAlpha(alpha);
                    canvas2 = canvas;
                    canvas2.drawText(str, 0, Math.min(nq0Var.Z.getLineEnd(0), str.length()), RecyclerView.A1, f11, (Paint) textPaint);
                } else {
                    canvas2.translate(f, f2);
                    nq0Var.Z.draw(canvas2);
                }
                canvas2.restoreToCount(save);
            }
        }
        if (this.J0 != null && (gv3Var = this.I0) != null) {
            gv3Var.draw(canvas2);
            if (this.c0.isFocused()) {
                Rect bounds = this.J0.getBounds();
                Rect bounds2 = this.I0.getBounds();
                float f12 = nq0Var.b;
                int centerX = bounds2.centerX();
                bounds.left = jo.c(f12, centerX, bounds2.left);
                bounds.right = jo.c(f12, centerX, bounds2.right);
                this.J0.draw(canvas2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void drawableStateChanged() {
        /*
            r4 = this;
            boolean r0 = r4.v1
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r4.v1 = r0
            super.drawableStateChanged()
            int[] r1 = r4.getDrawableState()
            r2 = 0
            nq0 r3 = r4.r1
            if (r3 == 0) goto L2f
            r3.M = r1
            android.content.res.ColorStateList r1 = r3.k
            if (r1 == 0) goto L20
            boolean r1 = r1.isStateful()
            if (r1 != 0) goto L2a
        L20:
            android.content.res.ColorStateList r1 = r3.j
            if (r1 == 0) goto L2f
            boolean r1 = r1.isStateful()
            if (r1 == 0) goto L2f
        L2a:
            r3.j(r2)
            r1 = r0
            goto L30
        L2f:
            r1 = r2
        L30:
            android.widget.EditText r3 = r4.c0
            if (r3 == 0) goto L45
            boolean r3 = r4.isLaidOut()
            if (r3 == 0) goto L41
            boolean r3 = r4.isEnabled()
            if (r3 == 0) goto L41
            goto L42
        L41:
            r0 = r2
        L42:
            r4.w(r0, r2)
        L45:
            r4.t()
            r4.z()
            if (r1 == 0) goto L50
            r4.invalidate()
        L50:
            r4.v1 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.drawableStateChanged():void");
    }

    public final int e() {
        if (this.B0) {
            int i = this.N0;
            nq0 nq0Var = this.r1;
            if (i != 0) {
                if (i == 2) {
                    if (getHintMaxLines() == 1) {
                        return (int) (nq0Var.f() / 2.0f);
                    }
                    float f = nq0Var.f();
                    TextPaint textPaint = nq0Var.P;
                    textPaint.setTextSize(nq0Var.i);
                    textPaint.setTypeface(nq0Var.s);
                    textPaint.setLetterSpacing(nq0Var.W);
                    return Math.max(0, (int) (f - ((-textPaint.ascent()) / 2.0f)));
                }
            } else {
                return (int) nq0Var.f();
            }
        }
        return 0;
    }

    public final o42 f() {
        o42 o42Var = new o42();
        o42Var.L = me2.M(getContext(), R.attr.motionDurationShort2, 87);
        o42Var.R = me2.N(getContext(), R.attr.motionEasingLinearInterpolator, jo.a);
        return o42Var;
    }

    public final boolean g() {
        if (this.B0 && !TextUtils.isEmpty(this.C0) && (this.E0 instanceof c51)) {
            return true;
        }
        return false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.c0;
        if (editText != null) {
            int baseline = editText.getBaseline();
            return e() + getPaddingTop() + baseline;
        }
        return super.getBaseline();
    }

    public gv3 getBoxBackground() {
        int i = this.N0;
        if (i != 1 && i != 2) {
            f81.o();
            return null;
        }
        return this.E0;
    }

    public int getBoxBackgroundColor() {
        return this.T0;
    }

    public int getBoxBackgroundMode() {
        return this.N0;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.O0;
    }

    public float getBoxCornerRadiusBottomEnd() {
        int layoutDirection = getLayoutDirection();
        a36 a36Var = this.K0;
        RectF rectF = this.W0;
        if (layoutDirection == 1) {
            return a36Var.h.a(rectF);
        }
        return a36Var.g.a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        int layoutDirection = getLayoutDirection();
        a36 a36Var = this.K0;
        RectF rectF = this.W0;
        if (layoutDirection == 1) {
            return a36Var.g.a(rectF);
        }
        return a36Var.h.a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        int layoutDirection = getLayoutDirection();
        a36 a36Var = this.K0;
        RectF rectF = this.W0;
        if (layoutDirection == 1) {
            return a36Var.e.a(rectF);
        }
        return a36Var.f.a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        int layoutDirection = getLayoutDirection();
        a36 a36Var = this.K0;
        RectF rectF = this.W0;
        if (layoutDirection == 1) {
            return a36Var.f.a(rectF);
        }
        return a36Var.e.a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.i1;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.j1;
    }

    public int getBoxStrokeWidth() {
        return this.Q0;
    }

    public int getBoxStrokeWidthFocused() {
        return this.R0;
    }

    public int getCounterMaxLength() {
        return this.k0;
    }

    public CharSequence getCounterOverflowDescription() {
        ds dsVar;
        if (this.j0 && this.l0 && (dsVar = this.n0) != null) {
            return dsVar.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.y0;
    }

    public ColorStateList getCounterTextColor() {
        return this.x0;
    }

    public ColorStateList getCursorColor() {
        return this.z0;
    }

    public ColorStateList getCursorErrorColor() {
        return this.A0;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.e1;
    }

    public EditText getEditText() {
        return this.c0;
    }

    public CharSequence getEndIconContentDescription() {
        return this.L.e0.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.L.e0.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.L.k0;
    }

    public int getEndIconMode() {
        return this.L.g0;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.L.l0;
    }

    public CheckableImageButton getEndIconView() {
        return this.L.e0;
    }

    public CharSequence getError() {
        my2 my2Var = this.i0;
        if (my2Var.q) {
            return my2Var.p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.i0.t;
    }

    public CharSequence getErrorContentDescription() {
        return this.i0.s;
    }

    public int getErrorCurrentTextColors() {
        ds dsVar = this.i0.r;
        if (dsVar != null) {
            return dsVar.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.L.L.getDrawable();
    }

    public CharSequence getHelperText() {
        my2 my2Var = this.i0;
        if (my2Var.x) {
            return my2Var.w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        ds dsVar = this.i0.y;
        if (dsVar != null) {
            return dsVar.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.B0) {
            return this.C0;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.r1.f();
    }

    public final int getHintCurrentCollapsedTextColor() {
        nq0 nq0Var = this.r1;
        return nq0Var.g(nq0Var.k);
    }

    public int getHintMaxLines() {
        return this.r1.e0;
    }

    public ColorStateList getHintTextColor() {
        return this.f1;
    }

    public xq6 getLengthCounter() {
        return this.m0;
    }

    public int getMaxEms() {
        return this.f0;
    }

    public int getMaxWidth() {
        return this.h0;
    }

    public int getMinEms() {
        return this.e0;
    }

    public int getMinWidth() {
        return this.g0;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.L.e0.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.L.e0.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.r0) {
            return this.q0;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.u0;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.t0;
    }

    public CharSequence getPrefixText() {
        return this.B.L;
    }

    public ColorStateList getPrefixTextColor() {
        return this.B.B.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.B.B;
    }

    public a36 getShapeAppearanceModel() {
        return this.K0;
    }

    public CharSequence getStartIconContentDescription() {
        return this.B.R.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.B.R.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.B.e0;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.B.f0;
    }

    public CharSequence getSuffixText() {
        return this.L.n0;
    }

    public ColorStateList getSuffixTextColor() {
        return this.L.o0.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.L.o0;
    }

    public Typeface getTypeface() {
        return this.X0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [a36, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [dk7, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [dk7, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [dk7, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [dk7, java.lang.Object] */
    public final gv3 h(boolean z) {
        float f;
        float dimensionPixelOffset;
        ColorStateList colorStateList;
        int i;
        float dimensionPixelOffset2 = getResources().getDimensionPixelOffset(R.dimen.mtrl_shape_corner_size_small_component);
        if (z) {
            f = dimensionPixelOffset2;
        } else {
            f = RecyclerView.A1;
        }
        EditText editText = this.c0;
        if (editText instanceof mu3) {
            dimensionPixelOffset = ((mu3) editText).getPopupElevation();
        } else {
            dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        }
        int dimensionPixelOffset3 = getResources().getDimensionPixelOffset(R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        ?? obj = new Object();
        ?? obj2 = new Object();
        ?? obj3 = new Object();
        ?? obj4 = new Object();
        sn1 sn1Var = new sn1(0);
        sn1 sn1Var2 = new sn1(0);
        sn1 sn1Var3 = new sn1(0);
        sn1 sn1Var4 = new sn1(0);
        s sVar = new s(f);
        s sVar2 = new s(f);
        s sVar3 = new s(dimensionPixelOffset2);
        s sVar4 = new s(dimensionPixelOffset2);
        ?? obj5 = new Object();
        obj5.a = obj;
        obj5.b = obj2;
        obj5.c = obj3;
        obj5.d = obj4;
        obj5.e = sVar;
        obj5.f = sVar2;
        obj5.g = sVar4;
        obj5.h = sVar3;
        obj5.i = sn1Var;
        obj5.j = sn1Var2;
        obj5.k = sn1Var3;
        obj5.l = sn1Var4;
        EditText editText2 = this.c0;
        if (editText2 instanceof mu3) {
            colorStateList = ((mu3) editText2).getDropDownBackgroundTintList();
        } else {
            colorStateList = null;
        }
        Context context = getContext();
        if (colorStateList == null) {
            Paint paint = gv3.z0;
            TypedValue Q = hk2.Q(context, R.attr.colorSurface, gv3.class.getSimpleName());
            int i2 = Q.resourceId;
            if (i2 != 0) {
                i = context.getColor(i2);
            } else {
                i = Q.data;
            }
            colorStateList = ColorStateList.valueOf(i);
        }
        gv3 gv3Var = new gv3();
        gv3Var.k(context);
        gv3Var.n(colorStateList);
        gv3Var.m(dimensionPixelOffset);
        gv3Var.setShapeAppearanceModel(obj5);
        ev3 ev3Var = gv3Var.B;
        if (ev3Var.h == null) {
            ev3Var.h = new Rect();
        }
        gv3Var.B.h.set(0, dimensionPixelOffset3, 0, dimensionPixelOffset3);
        gv3Var.invalidateSelf();
        return gv3Var;
    }

    public final int i(int i, boolean z) {
        int compoundPaddingLeft;
        if (!z && getPrefixText() != null) {
            compoundPaddingLeft = this.B.a();
        } else if (z && getSuffixText() != null) {
            compoundPaddingLeft = this.L.c();
        } else {
            compoundPaddingLeft = this.c0.getCompoundPaddingLeft();
        }
        return compoundPaddingLeft + i;
    }

    public final int j(int i, boolean z) {
        int compoundPaddingRight;
        if (!z && getSuffixText() != null) {
            compoundPaddingRight = this.L.c();
        } else if (z && getPrefixText() != null) {
            compoundPaddingRight = this.B.a();
        } else {
            compoundPaddingRight = this.c0.getCompoundPaddingRight();
        }
        return i - compoundPaddingRight;
    }

    /* JADX WARN: Type inference failed for: r0v26, types: [gv3, c51] */
    public final void k() {
        int i = this.N0;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    if (this.B0 && !(this.E0 instanceof c51)) {
                        a36 a36Var = this.K0;
                        int i2 = c51.C0;
                        if (a36Var == null) {
                            a36Var = new a36();
                        }
                        b51 b51Var = new b51(a36Var, new RectF());
                        ?? gv3Var = new gv3(b51Var);
                        gv3Var.B0 = b51Var;
                        this.E0 = gv3Var;
                    } else {
                        this.E0 = new gv3(this.K0);
                    }
                    this.I0 = null;
                    this.J0 = null;
                } else {
                    i.i(wh1.m(new StringBuilder(), this.N0, " is illegal; only @BoxBackgroundMode constants are supported."));
                    return;
                }
            } else {
                this.E0 = new gv3(this.K0);
                this.I0 = new gv3();
                this.J0 = new gv3();
            }
        } else {
            this.E0 = null;
            this.I0 = null;
            this.J0 = null;
        }
        u();
        z();
        if (this.N0 == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.O0 = getResources().getDimensionPixelSize(R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (nk2.K(getContext())) {
                this.O0 = getResources().getDimensionPixelSize(R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        a();
        if (this.N0 != 0) {
            v();
        }
        EditText editText = this.c0;
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i3 = this.N0;
                if (i3 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i3 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l() {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.l():void");
    }

    public final void n(ds dsVar, int i) {
        try {
            dsVar.setTextAppearance(i);
            if (dsVar.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        dsVar.setTextAppearance(2132017652);
        dsVar.setTextColor(getContext().getColor(R.color.design_error));
    }

    public final boolean o() {
        my2 my2Var = this.i0;
        if (my2Var.o == 1 && my2Var.r != null && !TextUtils.isEmpty(my2Var.p)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.r1.i(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int max;
        yz1 yz1Var = this.L;
        yz1Var.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z = false;
        this.x1 = false;
        if (this.c0 != null && this.c0.getMeasuredHeight() < (max = Math.max(yz1Var.getMeasuredHeight(), this.B.getMeasuredHeight()))) {
            this.c0.setMinimumHeight(max);
            z = true;
        }
        boolean s = s();
        if (!z && !s) {
            return;
        }
        this.c0.post(new tm3(14, this));
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float descent;
        int i5;
        int compoundPaddingTop;
        int compoundPaddingBottom;
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.c0;
        if (editText != null) {
            Rect rect = this.U0;
            fe1.a(this, editText, rect);
            gv3 gv3Var = this.I0;
            if (gv3Var != null) {
                int i6 = rect.bottom;
                gv3Var.setBounds(rect.left, i6 - this.Q0, rect.right, i6);
            }
            gv3 gv3Var2 = this.J0;
            if (gv3Var2 != null) {
                int i7 = rect.bottom;
                gv3Var2.setBounds(rect.left, i7 - this.R0, rect.right, i7);
            }
            if (this.B0) {
                float textSize = this.c0.getTextSize();
                nq0 nq0Var = this.r1;
                float f = nq0Var.h;
                TextPaint textPaint = nq0Var.P;
                if (f != textSize) {
                    nq0Var.h = textSize;
                    nq0Var.j(false);
                }
                int gravity = this.c0.getGravity();
                int i8 = (gravity & (-113)) | 48;
                if (nq0Var.g != i8) {
                    nq0Var.g = i8;
                    nq0Var.j(false);
                }
                if (nq0Var.f != gravity) {
                    nq0Var.f = gravity;
                    nq0Var.j(false);
                }
                Rect d = d(rect);
                int i9 = d.left;
                int i10 = d.top;
                int i11 = d.right;
                int i12 = d.bottom;
                Rect rect2 = nq0Var.d;
                if (rect2.left != i9 || rect2.top != i10 || rect2.right != i11 || rect2.bottom != i12) {
                    rect2.set(i9, i10, i11, i12);
                    nq0Var.N = true;
                }
                if (this.c0 != null) {
                    if (getHintMaxLines() == 1) {
                        textPaint.setTextSize(nq0Var.h);
                        textPaint.setTypeface(nq0Var.v);
                        textPaint.setLetterSpacing(nq0Var.X);
                        descent = -textPaint.ascent();
                    } else {
                        textPaint.setTextSize(nq0Var.h);
                        textPaint.setTypeface(nq0Var.v);
                        textPaint.setLetterSpacing(nq0Var.X);
                        descent = nq0Var.l * (textPaint.descent() + (-textPaint.ascent()));
                    }
                    int compoundPaddingLeft = this.c0.getCompoundPaddingLeft() + rect.left;
                    Rect rect3 = this.V0;
                    rect3.left = compoundPaddingLeft;
                    if (this.N0 == 1 && this.c0.getMinLines() <= 1) {
                        compoundPaddingTop = (int) (rect.centerY() - (descent / 2.0f));
                    } else {
                        if (this.N0 == 0 && getHintMaxLines() != 1) {
                            textPaint.setTextSize(nq0Var.h);
                            textPaint.setTypeface(nq0Var.v);
                            textPaint.setLetterSpacing(nq0Var.X);
                            i5 = (int) ((-textPaint.ascent()) / 2.0f);
                        } else {
                            i5 = 0;
                        }
                        compoundPaddingTop = (this.c0.getCompoundPaddingTop() + rect.top) - i5;
                    }
                    rect3.top = compoundPaddingTop;
                    rect3.right = rect.right - this.c0.getCompoundPaddingRight();
                    if (this.N0 == 1 && this.c0.getMinLines() <= 1) {
                        compoundPaddingBottom = (int) (rect3.top + descent);
                    } else {
                        compoundPaddingBottom = rect.bottom - this.c0.getCompoundPaddingBottom();
                    }
                    rect3.bottom = compoundPaddingBottom;
                    int i13 = rect3.left;
                    int i14 = rect3.top;
                    int i15 = rect3.right;
                    Rect rect4 = nq0Var.c;
                    if (rect4.left != i13 || rect4.top != i14 || rect4.right != i15 || rect4.bottom != compoundPaddingBottom || true != nq0Var.k0) {
                        rect4.set(i13, i14, i15, compoundPaddingBottom);
                        nq0Var.N = true;
                        nq0Var.k0 = true;
                    }
                    nq0Var.j(false);
                    if (g() && !this.q1) {
                        l();
                        return;
                    }
                    return;
                }
                f81.o();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        float f;
        boolean z;
        EditText editText;
        super.onMeasure(i, i2);
        boolean z2 = this.x1;
        yz1 yz1Var = this.L;
        if (!z2) {
            yz1Var.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.x1 = true;
        }
        if (this.s0 != null && (editText = this.c0) != null) {
            this.s0.setGravity(editText.getGravity());
            this.s0.setPadding(this.c0.getCompoundPaddingLeft(), this.c0.getCompoundPaddingTop(), this.c0.getCompoundPaddingRight(), this.c0.getCompoundPaddingBottom());
        }
        yz1Var.m();
        if (getHintMaxLines() != 1) {
            int measuredWidth = (this.c0.getMeasuredWidth() - this.c0.getCompoundPaddingLeft()) - this.c0.getCompoundPaddingRight();
            nq0 nq0Var = this.r1;
            TextPaint textPaint = nq0Var.P;
            textPaint.setTextSize(nq0Var.i);
            textPaint.setTypeface(nq0Var.s);
            textPaint.setLetterSpacing(nq0Var.W);
            float f2 = measuredWidth;
            nq0Var.i0 = nq0Var.e(nq0Var.f0, textPaint, nq0Var.B, (nq0Var.i / nq0Var.h) * f2, nq0Var.D).getHeight();
            textPaint.setTextSize(nq0Var.h);
            textPaint.setTypeface(nq0Var.v);
            textPaint.setLetterSpacing(nq0Var.X);
            nq0Var.j0 = nq0Var.e(nq0Var.e0, textPaint, nq0Var.B, f2, nq0Var.D).getHeight();
            EditText editText2 = this.c0;
            Rect rect = this.U0;
            fe1.a(this, editText2, rect);
            Rect d = d(rect);
            int i3 = d.left;
            int i4 = d.top;
            int i5 = d.right;
            int i6 = d.bottom;
            Rect rect2 = nq0Var.d;
            if (rect2.left != i3 || rect2.top != i4 || rect2.right != i5 || rect2.bottom != i6) {
                rect2.set(i3, i4, i5, i6);
                nq0Var.N = true;
            }
            v();
            a();
            if (this.c0 != null) {
                int i7 = nq0Var.j0;
                if (i7 != -1) {
                    f = i7;
                } else {
                    TextPaint textPaint2 = nq0Var.P;
                    textPaint2.setTextSize(nq0Var.h);
                    textPaint2.setTypeface(nq0Var.v);
                    textPaint2.setLetterSpacing(nq0Var.X);
                    f = -textPaint2.ascent();
                }
                CharSequence charSequence = this.q0;
                float f3 = RecyclerView.A1;
                if (charSequence != null) {
                    TextPaint textPaint3 = new TextPaint(129);
                    textPaint3.set(this.s0.getPaint());
                    textPaint3.setTextSize(this.s0.getTextSize());
                    textPaint3.setTypeface(this.s0.getTypeface());
                    textPaint3.setLetterSpacing(this.s0.getLetterSpacing());
                    xe6 xe6Var = new xe6(this.q0, textPaint3, measuredWidth);
                    if (getLayoutDirection() == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    xe6Var.k = z;
                    xe6Var.j = true;
                    float lineSpacingExtra = this.s0.getLineSpacingExtra();
                    float lineSpacingMultiplier = this.s0.getLineSpacingMultiplier();
                    xe6Var.g = lineSpacingExtra;
                    xe6Var.h = lineSpacingMultiplier;
                    xe6Var.m = new a31(23, this);
                    StaticLayout a = xe6Var.a();
                    if (this.N0 == 1) {
                        f3 = nq0Var.f() + this.O0 + this.R;
                    }
                    f3 += a.getHeight();
                }
                float max = Math.max(f, f3);
                if (this.c0.getMeasuredHeight() < max) {
                    this.c0.setMinimumHeight(Math.round(max));
                }
            }
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof yq6)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        yq6 yq6Var = (yq6) parcelable;
        super.onRestoreInstanceState(yq6Var.A);
        setError(yq6Var.L);
        if (yq6Var.R) {
            post(new es4(24, this));
        }
        requestLayout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [a36, java.lang.Object] */
    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        if (z != this.L0) {
            y21 y21Var = this.K0.e;
            RectF rectF = this.W0;
            float a = y21Var.a(rectF);
            float a2 = this.K0.f.a(rectF);
            float a3 = this.K0.h.a(rectF);
            float a4 = this.K0.g.a(rectF);
            a36 a36Var = this.K0;
            dk7 dk7Var = a36Var.a;
            dk7 dk7Var2 = a36Var.b;
            dk7 dk7Var3 = a36Var.d;
            dk7 dk7Var4 = a36Var.c;
            sn1 sn1Var = new sn1(0);
            sn1 sn1Var2 = new sn1(0);
            sn1 sn1Var3 = new sn1(0);
            sn1 sn1Var4 = new sn1(0);
            s sVar = new s(a2);
            s sVar2 = new s(a);
            s sVar3 = new s(a4);
            s sVar4 = new s(a3);
            ?? obj = new Object();
            obj.a = dk7Var2;
            obj.b = dk7Var;
            obj.c = dk7Var3;
            obj.d = dk7Var4;
            obj.e = sVar;
            obj.f = sVar2;
            obj.g = sVar4;
            obj.h = sVar3;
            obj.i = sn1Var;
            obj.j = sn1Var2;
            obj.k = sn1Var3;
            obj.l = sn1Var4;
            this.L0 = z;
            setShapeAppearanceModel(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [r, android.os.Parcelable, yq6] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z;
        ?? rVar = new r(super.onSaveInstanceState());
        if (o()) {
            rVar.L = getError();
        }
        yz1 yz1Var = this.L;
        if (yz1Var.g0 != 0 && yz1Var.e0.R) {
            z = true;
        } else {
            z = false;
        }
        rVar.R = z;
        return rVar;
    }

    public final void p(Editable editable) {
        int i;
        boolean z;
        int i2;
        l20 l20Var;
        ((vd6) this.m0).getClass();
        if (editable != null) {
            i = editable.length();
        } else {
            i = 0;
        }
        boolean z2 = this.l0;
        int i3 = this.k0;
        String str = null;
        if (i3 == -1) {
            this.n0.setText(String.valueOf(i));
            this.n0.setContentDescription(null);
            this.l0 = false;
        } else {
            if (i > i3) {
                z = true;
            } else {
                z = false;
            }
            this.l0 = z;
            Context context = getContext();
            ds dsVar = this.n0;
            int i4 = this.k0;
            if (this.l0) {
                i2 = R.string.character_counter_overflowed_content_description;
            } else {
                i2 = R.string.character_counter_content_description;
            }
            dsVar.setContentDescription(context.getString(i2, Integer.valueOf(i), Integer.valueOf(i4)));
            if (z2 != this.l0) {
                q();
            }
            String str2 = l20.b;
            if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
                l20Var = l20.e;
            } else {
                l20Var = l20.d;
            }
            ds dsVar2 = this.n0;
            String string = getContext().getString(R.string.character_counter_pattern, Integer.valueOf(i), Integer.valueOf(this.k0));
            l20Var.getClass();
            i40 i40Var = uo6.a;
            if (string != null) {
                str = l20Var.c(string).toString();
            }
            dsVar2.setText(str);
        }
        if (this.c0 != null && z2 != this.l0) {
            w(false, false);
            z();
            t();
        }
    }

    public final void q() {
        int i;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ds dsVar = this.n0;
        if (dsVar != null) {
            if (this.l0) {
                i = this.o0;
            } else {
                i = this.p0;
            }
            n(dsVar, i);
            if (!this.l0 && (colorStateList2 = this.x0) != null) {
                this.n0.setTextColor(colorStateList2);
            }
            if (this.l0 && (colorStateList = this.y0) != null) {
                this.n0.setTextColor(colorStateList);
            }
        }
    }

    public final void r() {
        Drawable textCursorDrawable;
        Drawable textCursorDrawable2;
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.z0;
        if (colorStateList2 == null) {
            Context context = getContext();
            TypedValue O = hk2.O(context, R.attr.colorControlActivated);
            if (O != null) {
                int i = O.resourceId;
                if (i != 0) {
                    colorStateList2 = jv3.x(context, i);
                } else {
                    int i2 = O.data;
                    if (i2 != 0) {
                        colorStateList2 = ColorStateList.valueOf(i2);
                    }
                }
            }
            colorStateList2 = null;
        }
        EditText editText = this.c0;
        if (editText != null) {
            textCursorDrawable = editText.getTextCursorDrawable();
            if (textCursorDrawable != null) {
                textCursorDrawable2 = this.c0.getTextCursorDrawable();
                Drawable mutate = textCursorDrawable2.mutate();
                if ((o() || (this.n0 != null && this.l0)) && (colorStateList = this.A0) != null) {
                    colorStateList2 = colorStateList;
                }
                mutate.setTintList(colorStateList2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean s() {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.s():boolean");
    }

    public void setBoxBackgroundColor(int i) {
        if (this.T0 != i) {
            this.T0 = i;
            this.k1 = i;
            this.m1 = i;
            this.n1 = i;
            c();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(getContext().getColor(i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.k1 = defaultColor;
        this.T0 = defaultColor;
        this.l1 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.m1 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        this.n1 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
        c();
    }

    public void setBoxBackgroundMode(int i) {
        if (i != this.N0) {
            this.N0 = i;
            if (this.c0 != null) {
                k();
            }
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.O0 = i;
    }

    public void setBoxCornerFamily(int i) {
        z26 f = this.K0.f();
        y21 y21Var = this.K0.e;
        f.a = nl2.H(i);
        f.e = y21Var;
        y21 y21Var2 = this.K0.f;
        f.b = nl2.H(i);
        f.f = y21Var2;
        y21 y21Var3 = this.K0.h;
        f.d = nl2.H(i);
        f.h = y21Var3;
        y21 y21Var4 = this.K0.g;
        f.c = nl2.H(i);
        f.g = y21Var4;
        this.K0 = f.a();
        c();
    }

    public void setBoxStrokeColor(int i) {
        if (this.i1 != i) {
            this.i1 = i;
            z();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.g1 = colorStateList.getDefaultColor();
            this.o1 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.h1 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
            this.i1 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        } else if (this.i1 != colorStateList.getDefaultColor()) {
            this.i1 = colorStateList.getDefaultColor();
        }
        z();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.j1 != colorStateList) {
            this.j1 = colorStateList;
            z();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.Q0 = i;
        z();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.R0 = i;
        z();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z) {
        if (this.j0 != z) {
            my2 my2Var = this.i0;
            Editable editable = null;
            if (z) {
                ds dsVar = new ds(getContext(), null);
                this.n0 = dsVar;
                dsVar.setId(R.id.textinput_counter);
                Typeface typeface = this.X0;
                if (typeface != null) {
                    this.n0.setTypeface(typeface);
                }
                this.n0.setMaxLines(1);
                my2Var.a(this.n0, 2);
                ((ViewGroup.MarginLayoutParams) this.n0.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(R.dimen.mtrl_textinput_counter_margin_start));
                q();
                if (this.n0 != null) {
                    EditText editText = this.c0;
                    if (editText != null) {
                        editable = editText.getText();
                    }
                    p(editable);
                }
            } else {
                my2Var.g(this.n0, 2);
                this.n0 = null;
            }
            this.j0 = z;
        }
    }

    public void setCounterMaxLength(int i) {
        Editable text;
        if (this.k0 != i) {
            if (i > 0) {
                this.k0 = i;
            } else {
                this.k0 = -1;
            }
            if (this.j0 && this.n0 != null) {
                EditText editText = this.c0;
                if (editText == null) {
                    text = null;
                } else {
                    text = editText.getText();
                }
                p(text);
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.o0 != i) {
            this.o0 = i;
            q();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.y0 != colorStateList) {
            this.y0 = colorStateList;
            q();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.p0 != i) {
            this.p0 = i;
            q();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.x0 != colorStateList) {
            this.x0 = colorStateList;
            q();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.z0 != colorStateList) {
            this.z0 = colorStateList;
            r();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.A0 != colorStateList) {
            this.A0 = colorStateList;
            if (!o() && (this.n0 == null || !this.l0)) {
                return;
            }
            r();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.e1 = colorStateList;
        this.f1 = colorStateList;
        if (this.c0 != null) {
            w(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        m(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.L.e0.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.L.e0.setCheckable(z);
    }

    public void setEndIconContentDescription(int i) {
        CharSequence charSequence;
        yz1 yz1Var = this.L;
        if (i != 0) {
            charSequence = yz1Var.getResources().getText(i);
        } else {
            charSequence = null;
        }
        CheckableImageButton checkableImageButton = yz1Var.e0;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(int i) {
        Drawable drawable;
        yz1 yz1Var = this.L;
        if (i != 0) {
            drawable = l07.M(yz1Var.getContext(), i);
        } else {
            drawable = null;
        }
        TextInputLayout textInputLayout = yz1Var.A;
        CheckableImageButton checkableImageButton = yz1Var.e0;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ep2.i(textInputLayout, checkableImageButton, yz1Var.i0, yz1Var.j0);
            ep2.D(textInputLayout, checkableImageButton, yz1Var.i0);
        }
    }

    public void setEndIconMinSize(int i) {
        yz1 yz1Var = this.L;
        if (i >= 0) {
            if (i != yz1Var.k0) {
                yz1Var.k0 = i;
                CheckableImageButton checkableImageButton = yz1Var.e0;
                checkableImageButton.setMinimumWidth(i);
                checkableImageButton.setMinimumHeight(i);
                CheckableImageButton checkableImageButton2 = yz1Var.L;
                checkableImageButton2.setMinimumWidth(i);
                checkableImageButton2.setMinimumHeight(i);
                return;
            }
            return;
        }
        yz1Var.getClass();
        i.i("endIconSize cannot be less than 0");
    }

    public void setEndIconMode(int i) {
        this.L.g(i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        yz1 yz1Var = this.L;
        CheckableImageButton checkableImageButton = yz1Var.e0;
        View.OnLongClickListener onLongClickListener = yz1Var.m0;
        checkableImageButton.setOnClickListener(onClickListener);
        ep2.G(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        yz1 yz1Var = this.L;
        yz1Var.m0 = onLongClickListener;
        CheckableImageButton checkableImageButton = yz1Var.e0;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        ep2.G(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        yz1 yz1Var = this.L;
        yz1Var.l0 = scaleType;
        yz1Var.e0.setScaleType(scaleType);
        yz1Var.L.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        yz1 yz1Var = this.L;
        if (yz1Var.i0 != colorStateList) {
            yz1Var.i0 = colorStateList;
            ep2.i(yz1Var.A, yz1Var.e0, colorStateList, yz1Var.j0);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        yz1 yz1Var = this.L;
        if (yz1Var.j0 != mode) {
            yz1Var.j0 = mode;
            ep2.i(yz1Var.A, yz1Var.e0, yz1Var.i0, mode);
        }
    }

    public void setEndIconVisible(boolean z) {
        this.L.h(z);
    }

    public void setError(CharSequence charSequence) {
        my2 my2Var = this.i0;
        if (!my2Var.q) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            setErrorEnabled(true);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            my2Var.c();
            my2Var.p = charSequence;
            my2Var.r.setText(charSequence);
            int i = my2Var.n;
            if (i != 1) {
                my2Var.o = 1;
            }
            my2Var.i(i, my2Var.h(my2Var.r, charSequence), my2Var.o);
            return;
        }
        my2Var.f();
    }

    public void setErrorAccessibilityLiveRegion(int i) {
        my2 my2Var = this.i0;
        my2Var.t = i;
        ds dsVar = my2Var.r;
        if (dsVar != null) {
            dsVar.setAccessibilityLiveRegion(i);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        my2 my2Var = this.i0;
        my2Var.s = charSequence;
        ds dsVar = my2Var.r;
        if (dsVar != null) {
            dsVar.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z) {
        my2 my2Var = this.i0;
        TextInputLayout textInputLayout = my2Var.h;
        if (my2Var.q == z) {
            return;
        }
        my2Var.c();
        if (z) {
            ds dsVar = new ds(my2Var.g, null);
            my2Var.r = dsVar;
            dsVar.setId(R.id.textinput_error);
            my2Var.r.setTextAlignment(5);
            Typeface typeface = my2Var.B;
            if (typeface != null) {
                my2Var.r.setTypeface(typeface);
            }
            int i = my2Var.u;
            my2Var.u = i;
            ds dsVar2 = my2Var.r;
            if (dsVar2 != null) {
                my2Var.h.n(dsVar2, i);
            }
            ColorStateList colorStateList = my2Var.v;
            my2Var.v = colorStateList;
            ds dsVar3 = my2Var.r;
            if (dsVar3 != null && colorStateList != null) {
                dsVar3.setTextColor(colorStateList);
            }
            CharSequence charSequence = my2Var.s;
            my2Var.s = charSequence;
            ds dsVar4 = my2Var.r;
            if (dsVar4 != null) {
                dsVar4.setContentDescription(charSequence);
            }
            int i2 = my2Var.t;
            my2Var.t = i2;
            ds dsVar5 = my2Var.r;
            if (dsVar5 != null) {
                dsVar5.setAccessibilityLiveRegion(i2);
            }
            my2Var.r.setVisibility(4);
            my2Var.a(my2Var.r, 0);
        } else {
            my2Var.f();
            my2Var.g(my2Var.r, 0);
            my2Var.r = null;
            textInputLayout.t();
            textInputLayout.z();
        }
        my2Var.q = z;
    }

    public void setErrorIconDrawable(int i) {
        Drawable drawable;
        yz1 yz1Var = this.L;
        if (i != 0) {
            drawable = l07.M(yz1Var.getContext(), i);
        } else {
            drawable = null;
        }
        yz1Var.i(drawable);
        ep2.D(yz1Var.A, yz1Var.L, yz1Var.R);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        yz1 yz1Var = this.L;
        CheckableImageButton checkableImageButton = yz1Var.L;
        View.OnLongClickListener onLongClickListener = yz1Var.d0;
        checkableImageButton.setOnClickListener(onClickListener);
        ep2.G(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        yz1 yz1Var = this.L;
        yz1Var.d0 = onLongClickListener;
        CheckableImageButton checkableImageButton = yz1Var.L;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        ep2.G(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        yz1 yz1Var = this.L;
        if (yz1Var.R != colorStateList) {
            yz1Var.R = colorStateList;
            ep2.i(yz1Var.A, yz1Var.L, colorStateList, yz1Var.c0);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        yz1 yz1Var = this.L;
        if (yz1Var.c0 != mode) {
            yz1Var.c0 = mode;
            ep2.i(yz1Var.A, yz1Var.L, yz1Var.R, mode);
        }
    }

    public void setErrorTextAppearance(int i) {
        my2 my2Var = this.i0;
        my2Var.u = i;
        ds dsVar = my2Var.r;
        if (dsVar != null) {
            my2Var.h.n(dsVar, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        my2 my2Var = this.i0;
        my2Var.v = colorStateList;
        ds dsVar = my2Var.r;
        if (dsVar != null && colorStateList != null) {
            dsVar.setTextColor(colorStateList);
        }
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.s1 != z) {
            this.s1 = z;
            w(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        my2 my2Var = this.i0;
        if (isEmpty) {
            if (my2Var.x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!my2Var.x) {
            setHelperTextEnabled(true);
        }
        my2Var.c();
        my2Var.w = charSequence;
        my2Var.y.setText(charSequence);
        int i = my2Var.n;
        if (i != 2) {
            my2Var.o = 2;
        }
        my2Var.i(i, my2Var.h(my2Var.y, charSequence), my2Var.o);
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        my2 my2Var = this.i0;
        my2Var.A = colorStateList;
        ds dsVar = my2Var.y;
        if (dsVar != null && colorStateList != null) {
            dsVar.setTextColor(colorStateList);
        }
    }

    public void setHelperTextEnabled(boolean z) {
        my2 my2Var = this.i0;
        TextInputLayout textInputLayout = my2Var.h;
        if (my2Var.x == z) {
            return;
        }
        my2Var.c();
        if (z) {
            ds dsVar = new ds(my2Var.g, null);
            my2Var.y = dsVar;
            dsVar.setId(R.id.textinput_helper_text);
            my2Var.y.setTextAlignment(5);
            Typeface typeface = my2Var.B;
            if (typeface != null) {
                my2Var.y.setTypeface(typeface);
            }
            my2Var.y.setVisibility(4);
            my2Var.y.setAccessibilityLiveRegion(1);
            int i = my2Var.z;
            my2Var.z = i;
            ds dsVar2 = my2Var.y;
            if (dsVar2 != null) {
                dsVar2.setTextAppearance(i);
            }
            ColorStateList colorStateList = my2Var.A;
            my2Var.A = colorStateList;
            ds dsVar3 = my2Var.y;
            if (dsVar3 != null && colorStateList != null) {
                dsVar3.setTextColor(colorStateList);
            }
            my2Var.a(my2Var.y, 1);
            my2Var.y.setAccessibilityDelegate(new ly2(my2Var));
        } else {
            my2Var.c();
            int i2 = my2Var.n;
            if (i2 == 2) {
                my2Var.o = 0;
            }
            my2Var.i(i2, my2Var.h(my2Var.y, ""), my2Var.o);
            my2Var.g(my2Var.y, 1);
            my2Var.y = null;
            textInputLayout.t();
            textInputLayout.z();
        }
        my2Var.x = z;
    }

    public void setHelperTextTextAppearance(int i) {
        my2 my2Var = this.i0;
        my2Var.z = i;
        ds dsVar = my2Var.y;
        if (dsVar != null) {
            dsVar.setTextAppearance(i);
        }
    }

    public void setHint(int i) {
        CharSequence charSequence;
        if (i != 0) {
            charSequence = getResources().getText(i);
        } else {
            charSequence = null;
        }
        setHint(charSequence);
    }

    public void setHintAnimationEnabled(boolean z) {
        this.t1 = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.B0) {
            this.B0 = z;
            if (!z) {
                this.D0 = false;
                if (!TextUtils.isEmpty(this.C0) && TextUtils.isEmpty(this.c0.getHint())) {
                    this.c0.setHint(this.C0);
                }
                setHintInternal(null);
            } else {
                CharSequence hint = this.c0.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.C0)) {
                        setHint(hint);
                    }
                    this.c0.setHint((CharSequence) null);
                }
                this.D0 = true;
            }
            if (this.c0 != null) {
                v();
            }
        }
    }

    public void setHintMaxLines(int i) {
        nq0 nq0Var = this.r1;
        if (i != nq0Var.f0) {
            nq0Var.f0 = i;
            nq0Var.j(false);
        }
        if (i != nq0Var.e0) {
            nq0Var.e0 = i;
            nq0Var.j(false);
        }
        requestLayout();
    }

    public void setHintTextAppearance(int i) {
        nq0 nq0Var = this.r1;
        TextInputLayout textInputLayout = nq0Var.a;
        un6 un6Var = new un6(textInputLayout.getContext(), i);
        ColorStateList colorStateList = un6Var.k;
        if (colorStateList != null) {
            nq0Var.k = colorStateList;
        }
        float f = un6Var.l;
        if (f != RecyclerView.A1) {
            nq0Var.i = f;
        }
        ColorStateList colorStateList2 = un6Var.a;
        if (colorStateList2 != null) {
            nq0Var.V = colorStateList2;
        }
        nq0Var.T = un6Var.f;
        nq0Var.U = un6Var.g;
        nq0Var.S = un6Var.h;
        nq0Var.W = un6Var.j;
        gh0 gh0Var = nq0Var.z;
        if (gh0Var != null) {
            gh0Var.g = true;
        }
        bq0 bq0Var = new bq0(22, nq0Var);
        un6Var.a();
        nq0Var.z = new gh0(bq0Var, un6Var.p);
        un6Var.b(textInputLayout.getContext(), nq0Var.z);
        nq0Var.j(false);
        this.f1 = nq0Var.k;
        if (this.c0 != null) {
            w(false, false);
            v();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f1 != colorStateList) {
            if (this.e1 == null) {
                nq0 nq0Var = this.r1;
                if (nq0Var.k != colorStateList) {
                    nq0Var.k = colorStateList;
                    nq0Var.j(false);
                }
            }
            this.f1 = colorStateList;
            if (this.c0 != null) {
                w(false, false);
            }
        }
    }

    public void setLengthCounter(xq6 xq6Var) {
        this.m0 = xq6Var;
    }

    public void setMaxEms(int i) {
        this.f0 = i;
        EditText editText = this.c0;
        if (editText != null && i != -1) {
            editText.setMaxEms(i);
        }
    }

    public void setMaxWidth(int i) {
        this.h0 = i;
        EditText editText = this.c0;
        if (editText != null && i != -1) {
            editText.setMaxWidth(i);
        }
    }

    public void setMaxWidthResource(int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinEms(int i) {
        this.e0 = i;
        EditText editText = this.c0;
        if (editText != null && i != -1) {
            editText.setMinEms(i);
        }
    }

    public void setMinWidth(int i) {
        this.g0 = i;
        EditText editText = this.c0;
        if (editText != null && i != -1) {
            editText.setMinWidth(i);
        }
    }

    public void setMinWidthResource(int i) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        CharSequence charSequence;
        yz1 yz1Var = this.L;
        if (i != 0) {
            charSequence = yz1Var.getResources().getText(i);
        } else {
            charSequence = null;
        }
        yz1Var.e0.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        Drawable drawable;
        yz1 yz1Var = this.L;
        if (i != 0) {
            drawable = l07.M(yz1Var.getContext(), i);
        } else {
            drawable = null;
        }
        yz1Var.e0.setImageDrawable(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        yz1 yz1Var = this.L;
        if (z && yz1Var.g0 != 1) {
            yz1Var.g(1);
        } else if (!z) {
            yz1Var.g(0);
        } else {
            yz1Var.getClass();
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        yz1 yz1Var = this.L;
        yz1Var.i0 = colorStateList;
        ep2.i(yz1Var.A, yz1Var.e0, colorStateList, yz1Var.j0);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        yz1 yz1Var = this.L;
        yz1Var.j0 = mode;
        ep2.i(yz1Var.A, yz1Var.e0, yz1Var.i0, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        Editable editable = null;
        if (this.s0 == null) {
            ds dsVar = new ds(getContext(), null);
            this.s0 = dsVar;
            dsVar.setId(R.id.textinput_placeholder);
            this.s0.setImportantForAccessibility(1);
            this.s0.setAccessibilityLiveRegion(1);
            o42 f = f();
            this.v0 = f;
            f.B = 67L;
            this.w0 = f();
            setPlaceholderTextAppearance(this.u0);
            setPlaceholderTextColor(this.t0);
            aa7.n(this.s0, new tu3(4));
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.r0) {
                setPlaceholderTextEnabled(true);
            }
            this.q0 = charSequence;
        }
        EditText editText = this.c0;
        if (editText != null) {
            editable = editText.getText();
        }
        x(editable);
    }

    public void setPlaceholderTextAppearance(int i) {
        this.u0 = i;
        ds dsVar = this.s0;
        if (dsVar != null) {
            dsVar.setTextAppearance(i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.t0 != colorStateList) {
            this.t0 = colorStateList;
            ds dsVar = this.s0;
            if (dsVar != null && colorStateList != null) {
                dsVar.setTextColor(colorStateList);
            }
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        CharSequence charSequence2;
        pd6 pd6Var = this.B;
        pd6Var.getClass();
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        pd6Var.L = charSequence2;
        pd6Var.B.setText(charSequence);
        pd6Var.e();
    }

    public void setPrefixTextAppearance(int i) {
        this.B.B.setTextAppearance(i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.B.B.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(a36 a36Var) {
        gv3 gv3Var = this.E0;
        if (gv3Var != null && gv3Var.B.a != a36Var) {
            this.K0 = a36Var;
            c();
        }
    }

    public void setStartIconCheckable(boolean z) {
        this.B.R.setCheckable(z);
    }

    public void setStartIconContentDescription(int i) {
        CharSequence charSequence;
        if (i != 0) {
            charSequence = getResources().getText(i);
        } else {
            charSequence = null;
        }
        setStartIconContentDescription(charSequence);
    }

    public void setStartIconDrawable(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = l07.M(getContext(), i);
        } else {
            drawable = null;
        }
        setStartIconDrawable(drawable);
    }

    public void setStartIconMinSize(int i) {
        pd6 pd6Var = this.B;
        if (i >= 0) {
            if (i != pd6Var.e0) {
                pd6Var.e0 = i;
                CheckableImageButton checkableImageButton = pd6Var.R;
                checkableImageButton.setMinimumWidth(i);
                checkableImageButton.setMinimumHeight(i);
                return;
            }
            return;
        }
        pd6Var.getClass();
        i.i("startIconSize cannot be less than 0");
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        pd6 pd6Var = this.B;
        CheckableImageButton checkableImageButton = pd6Var.R;
        View.OnLongClickListener onLongClickListener = pd6Var.g0;
        checkableImageButton.setOnClickListener(onClickListener);
        ep2.G(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        pd6 pd6Var = this.B;
        pd6Var.g0 = onLongClickListener;
        CheckableImageButton checkableImageButton = pd6Var.R;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        ep2.G(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        pd6 pd6Var = this.B;
        pd6Var.f0 = scaleType;
        pd6Var.R.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        pd6 pd6Var = this.B;
        if (pd6Var.c0 != colorStateList) {
            pd6Var.c0 = colorStateList;
            ep2.i(pd6Var.A, pd6Var.R, colorStateList, pd6Var.d0);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        pd6 pd6Var = this.B;
        if (pd6Var.d0 != mode) {
            pd6Var.d0 = mode;
            ep2.i(pd6Var.A, pd6Var.R, pd6Var.c0, mode);
        }
    }

    public void setStartIconVisible(boolean z) {
        this.B.c(z);
    }

    public void setSuffixText(CharSequence charSequence) {
        CharSequence charSequence2;
        yz1 yz1Var = this.L;
        yz1Var.getClass();
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        yz1Var.n0 = charSequence2;
        yz1Var.o0.setText(charSequence);
        yz1Var.n();
    }

    public void setSuffixTextAppearance(int i) {
        this.L.o0.setTextAppearance(i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.L.o0.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(wq6 wq6Var) {
        EditText editText = this.c0;
        if (editText != null) {
            aa7.n(editText, wq6Var);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.X0) {
            this.X0 = typeface;
            this.r1.n(typeface);
            my2 my2Var = this.i0;
            if (typeface != my2Var.B) {
                my2Var.B = typeface;
                ds dsVar = my2Var.r;
                if (dsVar != null) {
                    dsVar.setTypeface(typeface);
                }
                ds dsVar2 = my2Var.y;
                if (dsVar2 != null) {
                    dsVar2.setTypeface(typeface);
                }
            }
            ds dsVar3 = this.n0;
            if (dsVar3 != null) {
                dsVar3.setTypeface(typeface);
            }
        }
    }

    public final void t() {
        Drawable background;
        ds dsVar;
        EditText editText = this.c0;
        if (editText != null && this.N0 == 0 && (background = editText.getBackground()) != null) {
            int[] iArr = vk1.a;
            Drawable mutate = background.mutate();
            if (o()) {
                mutate.setColorFilter(vq.c(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
            } else if (this.l0 && (dsVar = this.n0) != null) {
                mutate.setColorFilter(vq.c(dsVar.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
            } else {
                mutate.clearColorFilter();
                this.c0.refreshDrawableState();
            }
        }
    }

    public final void u() {
        EditText editText = this.c0;
        if (editText != null && this.E0 != null) {
            if ((this.H0 || editText.getBackground() == null) && this.N0 != 0) {
                this.c0.setBackground(getEditTextBoxBackground());
                this.H0 = true;
            }
        }
    }

    public final void v() {
        if (this.N0 != 1) {
            FrameLayout frameLayout = this.A;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int e = e();
            if (e != layoutParams.topMargin) {
                layoutParams.topMargin = e;
                frameLayout.requestLayout();
            }
        }
    }

    public final void w(boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        ColorStateList colorStateList;
        ds dsVar;
        ColorStateList colorStateList2;
        boolean isEnabled = isEnabled();
        EditText editText = this.c0;
        if (editText != null && !TextUtils.isEmpty(editText.getText())) {
            z3 = true;
        } else {
            z3 = false;
        }
        EditText editText2 = this.c0;
        if (editText2 != null && editText2.hasFocus()) {
            z4 = true;
        } else {
            z4 = false;
        }
        ColorStateList colorStateList3 = this.e1;
        nq0 nq0Var = this.r1;
        if (colorStateList3 != null) {
            nq0Var.k(colorStateList3);
        }
        Editable editable = null;
        if (!isEnabled) {
            ColorStateList colorStateList4 = this.e1;
            int i = this.o1;
            if (colorStateList4 != null) {
                i = colorStateList4.getColorForState(new int[]{-16842910}, i);
            }
            nq0Var.k(ColorStateList.valueOf(i));
        } else if (o()) {
            ds dsVar2 = this.i0.r;
            if (dsVar2 != null) {
                colorStateList2 = dsVar2.getTextColors();
            } else {
                colorStateList2 = null;
            }
            nq0Var.k(colorStateList2);
        } else if (this.l0 && (dsVar = this.n0) != null) {
            nq0Var.k(dsVar.getTextColors());
        } else if (z4 && (colorStateList = this.f1) != null && nq0Var.k != colorStateList) {
            nq0Var.k = colorStateList;
            nq0Var.j(false);
        }
        yz1 yz1Var = this.L;
        pd6 pd6Var = this.B;
        if (!z3 && this.s1 && (!isEnabled() || !z4)) {
            if (z2 || !this.q1) {
                ValueAnimator valueAnimator = this.u1;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.u1.cancel();
                }
                if (z && this.t1) {
                    b(RecyclerView.A1);
                } else {
                    nq0Var.m(RecyclerView.A1);
                }
                if (g() && !((c51) this.E0).B0.r.isEmpty() && g()) {
                    ((c51) this.E0).t(RecyclerView.A1, RecyclerView.A1, RecyclerView.A1, RecyclerView.A1);
                }
                this.q1 = true;
                ds dsVar3 = this.s0;
                if (dsVar3 != null && this.r0) {
                    dsVar3.setText((CharSequence) null);
                    rx6.a(this.A, this.w0);
                    this.s0.setVisibility(4);
                }
                pd6Var.h0 = true;
                pd6Var.e();
                yz1Var.p0 = true;
                yz1Var.n();
            }
        } else if (!z2 && !this.q1) {
        } else {
            ValueAnimator valueAnimator2 = this.u1;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.u1.cancel();
            }
            if (z && this.t1) {
                b(1.0f);
            } else {
                nq0Var.m(1.0f);
            }
            this.q1 = false;
            if (g()) {
                l();
            }
            EditText editText3 = this.c0;
            if (editText3 != null) {
                editable = editText3.getText();
            }
            x(editable);
            pd6Var.h0 = false;
            pd6Var.e();
            yz1Var.p0 = false;
            yz1Var.n();
        }
    }

    public final void x(Editable editable) {
        int i;
        ((vd6) this.m0).getClass();
        if (editable != null) {
            i = editable.length();
        } else {
            i = 0;
        }
        FrameLayout frameLayout = this.A;
        if (i == 0 && !this.q1) {
            if (this.s0 != null && this.r0 && !TextUtils.isEmpty(this.q0)) {
                this.s0.setText(this.q0);
                rx6.a(frameLayout, this.v0);
                this.s0.setVisibility(0);
                this.s0.bringToFront();
                return;
            }
            return;
        }
        ds dsVar = this.s0;
        if (dsVar != null && this.r0) {
            dsVar.setText((CharSequence) null);
            rx6.a(frameLayout, this.w0);
            this.s0.setVisibility(4);
        }
    }

    public final void y(boolean z, boolean z2) {
        int defaultColor = this.j1.getDefaultColor();
        int colorForState = this.j1.getColorForState(new int[]{16843623, 16842910}, defaultColor);
        int colorForState2 = this.j1.getColorForState(new int[]{16843518, 16842910}, defaultColor);
        if (z) {
            this.S0 = colorForState2;
        } else if (z2) {
            this.S0 = colorForState;
        } else {
            this.S0 = defaultColor;
        }
    }

    public final void z() {
        boolean z;
        ds dsVar;
        EditText editText;
        EditText editText2;
        if (this.E0 != null && this.N0 != 0) {
            boolean z2 = false;
            if (!isFocused() && ((editText2 = this.c0) == null || !editText2.hasFocus())) {
                z = false;
            } else {
                z = true;
            }
            if (isHovered() || ((editText = this.c0) != null && editText.isHovered())) {
                z2 = true;
            }
            if (!isEnabled()) {
                this.S0 = this.o1;
            } else if (o()) {
                if (this.j1 != null) {
                    y(z, z2);
                } else {
                    this.S0 = getErrorCurrentTextColors();
                }
            } else if (this.l0 && (dsVar = this.n0) != null) {
                if (this.j1 != null) {
                    y(z, z2);
                } else {
                    this.S0 = dsVar.getCurrentTextColor();
                }
            } else if (z) {
                this.S0 = this.i1;
            } else if (z2) {
                this.S0 = this.h1;
            } else {
                this.S0 = this.g1;
            }
            if (Build.VERSION.SDK_INT >= 29) {
                r();
            }
            yz1 yz1Var = this.L;
            TextInputLayout textInputLayout = yz1Var.A;
            CheckableImageButton checkableImageButton = yz1Var.e0;
            TextInputLayout textInputLayout2 = yz1Var.A;
            yz1Var.l();
            ep2.D(textInputLayout2, yz1Var.L, yz1Var.R);
            ep2.D(textInputLayout2, checkableImageButton, yz1Var.i0);
            if (yz1Var.b() instanceof ol1) {
                if (textInputLayout.o() && checkableImageButton.getDrawable() != null) {
                    Drawable mutate = checkableImageButton.getDrawable().mutate();
                    mutate.setTint(textInputLayout.getErrorCurrentTextColors());
                    checkableImageButton.setImageDrawable(mutate);
                } else {
                    ep2.i(textInputLayout, checkableImageButton, yz1Var.i0, yz1Var.j0);
                }
            }
            pd6 pd6Var = this.B;
            ep2.D(pd6Var.A, pd6Var.R, pd6Var.c0);
            if (this.N0 == 2) {
                int i = this.P0;
                if (z && isEnabled()) {
                    this.P0 = this.R0;
                } else {
                    this.P0 = this.Q0;
                }
                if (this.P0 != i && g() && !this.q1) {
                    if (g()) {
                        ((c51) this.E0).t(RecyclerView.A1, RecyclerView.A1, RecyclerView.A1, RecyclerView.A1);
                    }
                    l();
                }
            }
            if (this.N0 == 1) {
                if (!isEnabled()) {
                    this.T0 = this.l1;
                } else if (z2 && !z) {
                    this.T0 = this.n1;
                } else if (z) {
                    this.T0 = this.m1;
                } else {
                    this.T0 = this.k1;
                }
            }
            c();
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.B0) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.B.R;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.B.b(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.L.e0.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.L.e0.setImageDrawable(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.L.e0;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.L.i(drawable);
    }

    public void setEndIconDrawable(Drawable drawable) {
        yz1 yz1Var = this.L;
        TextInputLayout textInputLayout = yz1Var.A;
        CheckableImageButton checkableImageButton = yz1Var.e0;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ep2.i(textInputLayout, checkableImageButton, yz1Var.i0, yz1Var.j0);
            ep2.D(textInputLayout, checkableImageButton, yz1Var.i0);
        }
    }
}
