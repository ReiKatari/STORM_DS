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
import com.stormds.emulator.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final int[][] z1 = {new int[]{16842919}, new int[0]};
    public final FrameLayout A;
    public ColorStateList A0;
    public final fp6 B;
    public ColorStateList B0;
    public boolean C0;
    public CharSequence D0;
    public boolean E0;
    public p24 F0;
    public p24 G0;
    public StateListDrawable H0;
    public boolean I0;
    public p24 J0;
    public p24 K0;
    public final n42 L;
    public me6 L0;
    public boolean M0;
    public final int N0;
    public int O0;
    public int P0;
    public int Q0;
    public final int R;
    public int R0;
    public int S0;
    public int T0;
    public int U0;
    public final Rect V0;
    public final Rect W0;
    public final RectF X0;
    public Typeface Y0;
    public ColorDrawable Z0;
    public int a1;
    public final LinkedHashSet b1;
    public ColorDrawable c1;
    public EditText d0;
    public int d1;
    public CharSequence e0;
    public Drawable e1;
    public int f0;
    public ColorStateList f1;
    public int g0;
    public ColorStateList g1;
    public int h0;
    public int h1;
    public int i0;
    public int i1;
    public final q43 j0;
    public int j1;
    public boolean k0;
    public ColorStateList k1;
    public int l0;
    public int l1;
    public boolean m0;
    public int m1;
    public m37 n0;
    public int n1;
    public qs o0;
    public int o1;
    public int p0;
    public int p1;
    public int q0;
    public int q1;
    public CharSequence r0;
    public boolean r1;
    public boolean s0;
    public final at0 s1;
    public qs t0;
    public boolean t1;
    public ColorStateList u0;
    public boolean u1;
    public int v0;
    public ValueAnimator v1;
    public h92 w0;
    public boolean w1;
    public h92 x0;
    public boolean x1;
    public ColorStateList y0;
    public boolean y1;
    public ColorStateList z0;

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        super(q60.e0(context, attributeSet, R.attr.textInputStyle, 2132018138), attributeSet, R.attr.textInputStyle);
        this.f0 = -1;
        this.g0 = -1;
        this.h0 = -1;
        this.i0 = -1;
        this.j0 = new q43(this);
        this.n0 = new fa6(7);
        this.V0 = new Rect();
        this.W0 = new Rect();
        this.X0 = new RectF();
        this.b1 = new LinkedHashSet();
        at0 at0Var = new at0(this);
        this.s1 = at0Var;
        this.y1 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.A = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = vo.a;
        at0Var.R = linearInterpolator;
        at0Var.j(false);
        at0Var.Q = linearInterpolator;
        at0Var.j(false);
        if (at0Var.g != 8388659) {
            at0Var.g = 8388659;
            at0Var.j(false);
        }
        f04.r(context2, attributeSet, R.attr.textInputStyle, 2132018138);
        int[] iArr = a75.D;
        f04.s(context2, attributeSet, iArr, R.attr.textInputStyle, 2132018138, 22, 20, 40, 45, 50);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, R.attr.textInputStyle, 2132018138);
        m44 m44Var = new m44(context2, obtainStyledAttributes);
        fp6 fp6Var = new fp6(this, m44Var);
        this.B = fp6Var;
        this.C0 = obtainStyledAttributes.getBoolean(48, true);
        setHint(obtainStyledAttributes.getText(4));
        this.u1 = obtainStyledAttributes.getBoolean(47, true);
        this.t1 = obtainStyledAttributes.getBoolean(42, true);
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
        this.L0 = me6.b(context2, attributeSet, R.attr.textInputStyle, 2132018138).a();
        this.N0 = context2.getResources().getDimensionPixelOffset(R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.P0 = obtainStyledAttributes.getDimensionPixelOffset(9, 0);
        this.R = getResources().getDimensionPixelSize(R.dimen.m3_multiline_hint_filled_text_extra_space);
        this.R0 = obtainStyledAttributes.getDimensionPixelSize(16, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_textinput_box_stroke_width_default));
        this.S0 = obtainStyledAttributes.getDimensionPixelSize(17, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.Q0 = this.R0;
        float dimension = obtainStyledAttributes.getDimension(13, -1.0f);
        float dimension2 = obtainStyledAttributes.getDimension(12, -1.0f);
        float dimension3 = obtainStyledAttributes.getDimension(10, -1.0f);
        float dimension4 = obtainStyledAttributes.getDimension(11, -1.0f);
        le6 f = this.L0.f();
        if (dimension >= RecyclerView.B1) {
            f.e = new t(dimension);
        }
        if (dimension2 >= RecyclerView.B1) {
            f.f = new t(dimension2);
        }
        if (dimension3 >= RecyclerView.B1) {
            f.g = new t(dimension3);
        }
        if (dimension4 >= RecyclerView.B1) {
            f.h = new t(dimension4);
        }
        this.L0 = f.a();
        ColorStateList R = np2.R(context2, m44Var, 7);
        if (R != null) {
            int defaultColor = R.getDefaultColor();
            this.l1 = defaultColor;
            this.U0 = defaultColor;
            if (R.isStateful()) {
                this.m1 = R.getColorForState(new int[]{-16842910}, -1);
                this.n1 = R.getColorForState(new int[]{16842908, 16842910}, -1);
                this.o1 = R.getColorForState(new int[]{16843623, 16842910}, -1);
            } else {
                this.n1 = this.l1;
                ColorStateList A = ge7.A(context2, R.color.mtrl_filled_background_color);
                this.m1 = A.getColorForState(new int[]{-16842910}, -1);
                this.o1 = A.getColorForState(new int[]{16843623}, -1);
            }
        } else {
            this.U0 = 0;
            this.l1 = 0;
            this.m1 = 0;
            this.n1 = 0;
            this.o1 = 0;
        }
        if (obtainStyledAttributes.hasValue(1)) {
            ColorStateList g = m44Var.g(1);
            this.g1 = g;
            this.f1 = g;
        }
        ColorStateList R2 = np2.R(context2, m44Var, 14);
        this.j1 = obtainStyledAttributes.getColor(14, 0);
        this.h1 = context2.getColor(R.color.mtrl_textinput_default_box_stroke_color);
        this.p1 = context2.getColor(R.color.mtrl_textinput_disabled_color);
        this.i1 = context2.getColor(R.color.mtrl_textinput_hovered_box_stroke_color);
        if (R2 != null) {
            setBoxStrokeColorStateList(R2);
        }
        if (obtainStyledAttributes.hasValue(15)) {
            setBoxStrokeErrorColor(np2.R(context2, m44Var, 15));
        }
        if (obtainStyledAttributes.getResourceId(50, -1) != -1) {
            setHintTextAppearance(obtainStyledAttributes.getResourceId(50, 0));
        }
        this.A0 = m44Var.g(24);
        this.B0 = m44Var.g(25);
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
        this.q0 = obtainStyledAttributes.getResourceId(22, 0);
        this.p0 = obtainStyledAttributes.getResourceId(20, 0);
        setBoxBackgroundMode(obtainStyledAttributes.getInt(8, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i);
        setCounterOverflowTextAppearance(this.p0);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.q0);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (obtainStyledAttributes.hasValue(41)) {
            setErrorTextColor(m44Var.g(41));
        }
        if (obtainStyledAttributes.hasValue(46)) {
            setHelperTextColor(m44Var.g(46));
        }
        if (obtainStyledAttributes.hasValue(51)) {
            setHintTextColor(m44Var.g(51));
        }
        if (obtainStyledAttributes.hasValue(23)) {
            setCounterTextColor(m44Var.g(23));
        }
        if (obtainStyledAttributes.hasValue(21)) {
            setCounterOverflowTextColor(m44Var.g(21));
        }
        if (obtainStyledAttributes.hasValue(59)) {
            setPlaceholderTextColor(m44Var.g(59));
        }
        n42 n42Var = new n42(this, m44Var);
        this.L = n42Var;
        boolean z4 = obtainStyledAttributes.getBoolean(0, true);
        setHintMaxLines(obtainStyledAttributes.getInt(49, 1));
        m44Var.D();
        setImportantForAccessibility(2);
        if (Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(1);
        }
        frameLayout.addView(fp6Var);
        frameLayout.addView(n42Var);
        addView(frameLayout);
        setEnabled(z4);
        setHelperTextEnabled(z2);
        setErrorEnabled(z);
        setCounterEnabled(z3);
        setHelperText(text2);
    }

    private Drawable getEditTextBoxBackground() {
        int i;
        EditText editText = this.d0;
        if ((editText instanceof AutoCompleteTextView) && editText.getInputType() == 0) {
            int B = mp2.B(this.d0, R.attr.colorControlHighlight);
            int i2 = this.O0;
            int[][] iArr = z1;
            if (i2 == 2) {
                Context context = getContext();
                p24 p24Var = this.F0;
                TypedValue O = qo2.O(context, R.attr.colorSurface, "TextInputLayout");
                int i3 = O.resourceId;
                if (i3 != 0) {
                    i = context.getColor(i3);
                } else {
                    i = O.data;
                }
                p24 p24Var2 = new p24(p24Var.B.a);
                int Q = mp2.Q(0.1f, B, i);
                p24Var2.n(new ColorStateList(iArr, new int[]{Q, 0}));
                p24Var2.setTint(i);
                ColorStateList colorStateList = new ColorStateList(iArr, new int[]{Q, i});
                p24 p24Var3 = new p24(p24Var.B.a);
                p24Var3.setTint(-1);
                return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, p24Var2, p24Var3), p24Var});
            } else if (i2 == 1) {
                p24 p24Var4 = this.F0;
                int i4 = this.U0;
                return new RippleDrawable(new ColorStateList(iArr, new int[]{mp2.Q(0.1f, B, i4), i4}), p24Var4, p24Var4);
            } else {
                return null;
            }
        }
        return this.F0;
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.H0 == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.H0 = stateListDrawable;
            stateListDrawable.addState(new int[]{16842922}, getOrCreateOutlinedDropDownMenuBackground());
            this.H0.addState(new int[0], h(false));
        }
        return this.H0;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.G0 == null) {
            this.G0 = h(true);
        }
        return this.G0;
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
        if (this.d0 == null) {
            if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
                Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
            }
            this.d0 = editText;
            int i = this.f0;
            if (i != -1) {
                setMinEms(i);
            } else {
                setMinWidth(this.h0);
            }
            int i2 = this.g0;
            if (i2 != -1) {
                setMaxEms(i2);
            } else {
                setMaxWidth(this.i0);
            }
            this.I0 = false;
            k();
            setTextInputAccessibilityDelegate(new l37(this));
            Typeface typeface = this.d0.getTypeface();
            at0 at0Var = this.s1;
            at0Var.n(typeface);
            float textSize = this.d0.getTextSize();
            if (at0Var.h != textSize) {
                at0Var.h = textSize;
                at0Var.j(false);
            }
            float letterSpacing = this.d0.getLetterSpacing();
            if (at0Var.X != letterSpacing) {
                at0Var.X = letterSpacing;
                at0Var.j(false);
            }
            int gravity = this.d0.getGravity();
            int i3 = (gravity & (-113)) | 48;
            if (at0Var.g != i3) {
                at0Var.g = i3;
                at0Var.j(false);
            }
            if (at0Var.f != gravity) {
                at0Var.f = gravity;
                at0Var.j(false);
            }
            this.q1 = editText.getMinimumHeight();
            this.d0.addTextChangedListener(new k37(this, editText));
            if (this.f1 == null) {
                this.f1 = this.d0.getHintTextColors();
            }
            if (this.C0) {
                if (TextUtils.isEmpty(this.D0)) {
                    CharSequence hint = this.d0.getHint();
                    this.e0 = hint;
                    setHint(hint);
                    this.d0.setHint((CharSequence) null);
                }
                this.E0 = true;
            }
            if (Build.VERSION.SDK_INT >= 29) {
                r();
            }
            if (this.o0 != null) {
                p(this.d0.getText());
            }
            t();
            this.j0.b();
            this.B.bringToFront();
            n42 n42Var = this.L;
            n42Var.bringToFront();
            Iterator it = this.b1.iterator();
            while (it.hasNext()) {
                ((l42) it.next()).a(this);
            }
            n42Var.m();
            if (!isEnabled()) {
                editText.setEnabled(false);
            }
            w(false, true);
            return;
        }
        i.h("We already have an EditText, can only have one");
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.D0)) {
            this.D0 = charSequence;
            at0 at0Var = this.s1;
            if (charSequence == null || !TextUtils.equals(at0Var.B, charSequence)) {
                at0Var.B = charSequence;
                at0Var.C = null;
                at0Var.j(false);
            }
            if (!this.r1) {
                l();
            }
        }
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.s0 == z) {
            return;
        }
        qs qsVar = this.t0;
        if (z) {
            if (qsVar != null) {
                this.A.addView(qsVar);
                this.t0.setVisibility(0);
            }
        } else {
            if (qsVar != null) {
                qsVar.setVisibility(8);
            }
            this.t0 = null;
        }
        this.s0 = z;
    }

    public final void a() {
        if (this.d0 != null && this.O0 == 1) {
            if (getHintMaxLines() == 1) {
                if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                    EditText editText = this.d0;
                    editText.setPaddingRelative(editText.getPaddingStart(), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_2_0_padding_top), this.d0.getPaddingEnd(), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_2_0_padding_bottom));
                    return;
                } else if (np2.W(getContext())) {
                    EditText editText2 = this.d0;
                    editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_1_3_padding_top), this.d0.getPaddingEnd(), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_1_3_padding_bottom));
                    return;
                } else {
                    return;
                }
            }
            EditText editText3 = this.d0;
            editText3.setPaddingRelative(editText3.getPaddingStart(), (int) (this.s1.f() + this.R), this.d0.getPaddingEnd(), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_1_3_padding_bottom));
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
        at0 at0Var = this.s1;
        if (at0Var.b == f) {
            return;
        }
        if (this.v1 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.v1 = valueAnimator;
            valueAnimator.setInterpolator(kj2.X(getContext(), R.attr.motionEasingEmphasizedInterpolator, vo.b));
            this.v1.setDuration(kj2.W(getContext(), R.attr.motionDurationMedium4, 167));
            this.v1.addUpdateListener(new f60(this, 2));
        }
        this.v1.setFloatValues(at0Var.b, f);
        this.v1.start();
    }

    public final void c() {
        ColorStateList valueOf;
        int i;
        int i2;
        p24 p24Var = this.F0;
        if (p24Var == null) {
            return;
        }
        me6 me6Var = p24Var.B.a;
        me6 me6Var2 = this.L0;
        if (me6Var != me6Var2) {
            p24Var.setShapeAppearanceModel(me6Var2);
        }
        if (this.O0 == 2 && (i = this.Q0) > -1 && (i2 = this.T0) != 0) {
            p24 p24Var2 = this.F0;
            p24Var2.B.k = i;
            p24Var2.invalidateSelf();
            ColorStateList valueOf2 = ColorStateList.valueOf(i2);
            n24 n24Var = p24Var2.B;
            if (n24Var.e != valueOf2) {
                n24Var.e = valueOf2;
                p24Var2.onStateChange(p24Var2.getState());
            }
        }
        int i3 = this.U0;
        if (this.O0 == 1) {
            i3 = tt0.b(this.U0, mp2.A(getContext(), R.attr.colorSurface, 0));
        }
        this.U0 = i3;
        this.F0.n(ColorStateList.valueOf(i3));
        p24 p24Var3 = this.J0;
        if (p24Var3 != null && this.K0 != null) {
            if (this.Q0 > -1 && this.T0 != 0) {
                if (this.d0.isFocused()) {
                    valueOf = ColorStateList.valueOf(this.h1);
                } else {
                    valueOf = ColorStateList.valueOf(this.T0);
                }
                p24Var3.n(valueOf);
                this.K0.n(ColorStateList.valueOf(this.T0));
            }
            invalidate();
        }
        u();
    }

    public final Rect d(Rect rect) {
        boolean z;
        if (this.d0 != null) {
            if (getLayoutDirection() == 1) {
                z = true;
            } else {
                z = false;
            }
            int i = rect.bottom;
            Rect rect2 = this.W0;
            rect2.bottom = i;
            int i2 = this.O0;
            if (i2 != 1) {
                int i3 = rect.left;
                if (i2 != 2) {
                    rect2.left = i(i3, z);
                    rect2.top = getPaddingTop();
                    rect2.right = j(rect.right, z);
                    return rect2;
                }
                rect2.left = this.d0.getPaddingLeft() + i3;
                rect2.top = rect.top - e();
                rect2.right = rect.right - this.d0.getPaddingRight();
                return rect2;
            }
            rect2.left = i(rect.left, z);
            rect2.top = rect.top + this.P0;
            rect2.right = j(rect.right, z);
            return rect2;
        }
        e41.m();
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.d0;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.e0 != null) {
            boolean z = this.E0;
            this.E0 = false;
            CharSequence hint = editText.getHint();
            this.d0.setHint(this.e0);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.d0.setHint(hint);
                this.E0 = z;
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
            if (childAt == this.d0) {
                newChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.x1 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.x1 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        p24 p24Var;
        Canvas canvas2 = canvas;
        super.draw(canvas);
        boolean z = this.C0;
        at0 at0Var = this.s1;
        if (z) {
            TextPaint textPaint = at0Var.O;
            RectF rectF = at0Var.e;
            int save = canvas2.save();
            if (at0Var.C != null && rectF.width() > RecyclerView.B1 && rectF.height() > RecyclerView.B1) {
                textPaint.setTextSize(at0Var.G);
                float f = at0Var.q;
                float f2 = at0Var.r;
                float f3 = at0Var.F;
                if (f3 != 1.0f) {
                    canvas2.scale(f3, f3, f, f2);
                }
                if ((at0Var.e0 > 1 || at0Var.f0 > 1) && !at0Var.D && at0Var.o()) {
                    int alpha = textPaint.getAlpha();
                    canvas2.translate(at0Var.q - at0Var.Z.getLineStart(0), f2);
                    float f4 = alpha;
                    textPaint.setAlpha((int) (at0Var.c0 * f4));
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 31) {
                        float f5 = at0Var.H;
                        float f6 = at0Var.I;
                        float f7 = at0Var.J;
                        int i2 = at0Var.K;
                        textPaint.setShadowLayer(f5, f6, f7, tt0.d(i2, (textPaint.getAlpha() * Color.alpha(i2)) / 255));
                    }
                    at0Var.Z.draw(canvas2);
                    textPaint.setAlpha((int) (at0Var.b0 * f4));
                    if (i >= 31) {
                        float f8 = at0Var.H;
                        float f9 = at0Var.I;
                        float f10 = at0Var.J;
                        int i3 = at0Var.K;
                        textPaint.setShadowLayer(f8, f9, f10, tt0.d(i3, (Color.alpha(i3) * textPaint.getAlpha()) / 255));
                    }
                    int lineBaseline = at0Var.Z.getLineBaseline(0);
                    CharSequence charSequence = at0Var.d0;
                    float f11 = lineBaseline;
                    canvas2.drawText(charSequence, 0, charSequence.length(), RecyclerView.B1, f11, textPaint);
                    if (i >= 31) {
                        textPaint.setShadowLayer(at0Var.H, at0Var.I, at0Var.J, at0Var.K);
                    }
                    String trim = at0Var.d0.toString().trim();
                    if (trim.endsWith("…")) {
                        trim = trim.substring(0, trim.length() - 1);
                    }
                    String str = trim;
                    textPaint.setAlpha(alpha);
                    canvas2 = canvas;
                    canvas2.drawText(str, 0, Math.min(at0Var.Z.getLineEnd(0), str.length()), RecyclerView.B1, f11, (Paint) textPaint);
                } else {
                    canvas2.translate(f, f2);
                    at0Var.Z.draw(canvas2);
                }
                canvas2.restoreToCount(save);
            }
        }
        if (this.K0 != null && (p24Var = this.J0) != null) {
            p24Var.draw(canvas2);
            if (this.d0.isFocused()) {
                Rect bounds = this.K0.getBounds();
                Rect bounds2 = this.J0.getBounds();
                float f12 = at0Var.b;
                int centerX = bounds2.centerX();
                bounds.left = vo.c(f12, centerX, bounds2.left);
                bounds.right = vo.c(f12, centerX, bounds2.right);
                this.K0.draw(canvas2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void drawableStateChanged() {
        boolean z;
        ColorStateList colorStateList;
        if (this.w1) {
            return;
        }
        boolean z2 = true;
        this.w1 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        at0 at0Var = this.s1;
        if (at0Var != null) {
            at0Var.M = drawableState;
            ColorStateList colorStateList2 = at0Var.k;
            if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = at0Var.j) != null && colorStateList.isStateful())) {
                at0Var.j(false);
                z = true;
                if (this.d0 != null) {
                    if (!isLaidOut() || !isEnabled()) {
                        z2 = false;
                    }
                    w(z2, false);
                }
                t();
                z();
                if (z) {
                    invalidate();
                }
                this.w1 = false;
            }
        }
        z = false;
        if (this.d0 != null) {
        }
        t();
        z();
        if (z) {
        }
        this.w1 = false;
    }

    public final int e() {
        if (this.C0) {
            int i = this.O0;
            at0 at0Var = this.s1;
            if (i != 0) {
                if (i == 2) {
                    if (getHintMaxLines() == 1) {
                        return (int) (at0Var.f() / 2.0f);
                    }
                    float f = at0Var.f();
                    TextPaint textPaint = at0Var.P;
                    textPaint.setTextSize(at0Var.i);
                    textPaint.setTypeface(at0Var.s);
                    textPaint.setLetterSpacing(at0Var.W);
                    return Math.max(0, (int) (f - ((-textPaint.ascent()) / 2.0f)));
                }
            } else {
                return (int) at0Var.f();
            }
        }
        return 0;
    }

    public final h92 f() {
        h92 h92Var = new h92();
        h92Var.L = kj2.W(getContext(), R.attr.motionDurationShort2, 87);
        h92Var.R = kj2.X(getContext(), R.attr.motionEasingLinearInterpolator, vo.a);
        return h92Var;
    }

    public final boolean g() {
        if (this.C0 && !TextUtils.isEmpty(this.D0) && (this.F0 instanceof o81)) {
            return true;
        }
        return false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.d0;
        if (editText != null) {
            int baseline = editText.getBaseline();
            return e() + getPaddingTop() + baseline;
        }
        return super.getBaseline();
    }

    public p24 getBoxBackground() {
        int i = this.O0;
        if (i != 1 && i != 2) {
            e41.m();
            return null;
        }
        return this.F0;
    }

    public int getBoxBackgroundColor() {
        return this.U0;
    }

    public int getBoxBackgroundMode() {
        return this.O0;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.P0;
    }

    public float getBoxCornerRadiusBottomEnd() {
        int layoutDirection = getLayoutDirection();
        me6 me6Var = this.L0;
        RectF rectF = this.X0;
        if (layoutDirection == 1) {
            return me6Var.h.a(rectF);
        }
        return me6Var.g.a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        int layoutDirection = getLayoutDirection();
        me6 me6Var = this.L0;
        RectF rectF = this.X0;
        if (layoutDirection == 1) {
            return me6Var.g.a(rectF);
        }
        return me6Var.h.a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        int layoutDirection = getLayoutDirection();
        me6 me6Var = this.L0;
        RectF rectF = this.X0;
        if (layoutDirection == 1) {
            return me6Var.e.a(rectF);
        }
        return me6Var.f.a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        int layoutDirection = getLayoutDirection();
        me6 me6Var = this.L0;
        RectF rectF = this.X0;
        if (layoutDirection == 1) {
            return me6Var.f.a(rectF);
        }
        return me6Var.e.a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.j1;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.k1;
    }

    public int getBoxStrokeWidth() {
        return this.R0;
    }

    public int getBoxStrokeWidthFocused() {
        return this.S0;
    }

    public int getCounterMaxLength() {
        return this.l0;
    }

    public CharSequence getCounterOverflowDescription() {
        qs qsVar;
        if (this.k0 && this.m0 && (qsVar = this.o0) != null) {
            return qsVar.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.z0;
    }

    public ColorStateList getCounterTextColor() {
        return this.y0;
    }

    public ColorStateList getCursorColor() {
        return this.A0;
    }

    public ColorStateList getCursorErrorColor() {
        return this.B0;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f1;
    }

    public EditText getEditText() {
        return this.d0;
    }

    public CharSequence getEndIconContentDescription() {
        return this.L.f0.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.L.f0.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.L.l0;
    }

    public int getEndIconMode() {
        return this.L.h0;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.L.m0;
    }

    public CheckableImageButton getEndIconView() {
        return this.L.f0;
    }

    public CharSequence getError() {
        q43 q43Var = this.j0;
        if (q43Var.q) {
            return q43Var.p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.j0.t;
    }

    public CharSequence getErrorContentDescription() {
        return this.j0.s;
    }

    public int getErrorCurrentTextColors() {
        qs qsVar = this.j0.r;
        if (qsVar != null) {
            return qsVar.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.L.L.getDrawable();
    }

    public CharSequence getHelperText() {
        q43 q43Var = this.j0;
        if (q43Var.x) {
            return q43Var.w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        qs qsVar = this.j0.y;
        if (qsVar != null) {
            return qsVar.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.C0) {
            return this.D0;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.s1.f();
    }

    public final int getHintCurrentCollapsedTextColor() {
        at0 at0Var = this.s1;
        return at0Var.g(at0Var.k);
    }

    public int getHintMaxLines() {
        return this.s1.e0;
    }

    public ColorStateList getHintTextColor() {
        return this.g1;
    }

    public m37 getLengthCounter() {
        return this.n0;
    }

    public int getMaxEms() {
        return this.g0;
    }

    public int getMaxWidth() {
        return this.i0;
    }

    public int getMinEms() {
        return this.f0;
    }

    public int getMinWidth() {
        return this.h0;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.L.f0.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.L.f0.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.s0) {
            return this.r0;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.v0;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.u0;
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

    public me6 getShapeAppearanceModel() {
        return this.L0;
    }

    public CharSequence getStartIconContentDescription() {
        return this.B.R.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.B.R.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.B.f0;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.B.g0;
    }

    public CharSequence getSuffixText() {
        return this.L.o0;
    }

    public ColorStateList getSuffixTextColor() {
        return this.L.p0.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.L.p0;
    }

    public Typeface getTypeface() {
        return this.Y0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, me6] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, q60] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, q60] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, q60] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, q60] */
    public final p24 h(boolean z) {
        float f;
        float dimensionPixelOffset;
        ColorStateList colorStateList;
        int i;
        float dimensionPixelOffset2 = getResources().getDimensionPixelOffset(R.dimen.mtrl_shape_corner_size_small_component);
        if (z) {
            f = dimensionPixelOffset2;
        } else {
            f = RecyclerView.B1;
        }
        EditText editText = this.d0;
        if (editText instanceof p14) {
            dimensionPixelOffset = ((p14) editText).getPopupElevation();
        } else {
            dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        }
        int dimensionPixelOffset3 = getResources().getDimensionPixelOffset(R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        ?? obj = new Object();
        ?? obj2 = new Object();
        ?? obj3 = new Object();
        ?? obj4 = new Object();
        cs1 cs1Var = new cs1(0);
        cs1 cs1Var2 = new cs1(0);
        cs1 cs1Var3 = new cs1(0);
        cs1 cs1Var4 = new cs1(0);
        t tVar = new t(f);
        t tVar2 = new t(f);
        t tVar3 = new t(dimensionPixelOffset2);
        t tVar4 = new t(dimensionPixelOffset2);
        ?? obj5 = new Object();
        obj5.a = obj;
        obj5.b = obj2;
        obj5.c = obj3;
        obj5.d = obj4;
        obj5.e = tVar;
        obj5.f = tVar2;
        obj5.g = tVar4;
        obj5.h = tVar3;
        obj5.i = cs1Var;
        obj5.j = cs1Var2;
        obj5.k = cs1Var3;
        obj5.l = cs1Var4;
        EditText editText2 = this.d0;
        if (editText2 instanceof p14) {
            colorStateList = ((p14) editText2).getDropDownBackgroundTintList();
        } else {
            colorStateList = null;
        }
        Context context = getContext();
        if (colorStateList == null) {
            Paint paint = p24.A0;
            TypedValue O = qo2.O(context, R.attr.colorSurface, p24.class.getSimpleName());
            int i2 = O.resourceId;
            if (i2 != 0) {
                i = context.getColor(i2);
            } else {
                i = O.data;
            }
            colorStateList = ColorStateList.valueOf(i);
        }
        p24 p24Var = new p24();
        p24Var.k(context);
        p24Var.n(colorStateList);
        p24Var.m(dimensionPixelOffset);
        p24Var.setShapeAppearanceModel(obj5);
        n24 n24Var = p24Var.B;
        if (n24Var.h == null) {
            n24Var.h = new Rect();
        }
        p24Var.B.h.set(0, dimensionPixelOffset3, 0, dimensionPixelOffset3);
        p24Var.invalidateSelf();
        return p24Var;
    }

    public final int i(int i, boolean z) {
        int compoundPaddingLeft;
        if (!z && getPrefixText() != null) {
            compoundPaddingLeft = this.B.a();
        } else if (z && getSuffixText() != null) {
            compoundPaddingLeft = this.L.c();
        } else {
            compoundPaddingLeft = this.d0.getCompoundPaddingLeft();
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
            compoundPaddingRight = this.d0.getCompoundPaddingRight();
        }
        return i - compoundPaddingRight;
    }

    /* JADX WARN: Type inference failed for: r0v26, types: [p24, o81] */
    public final void k() {
        int i = this.O0;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    if (this.C0 && !(this.F0 instanceof o81)) {
                        me6 me6Var = this.L0;
                        int i2 = o81.D0;
                        if (me6Var == null) {
                            me6Var = new me6();
                        }
                        n81 n81Var = new n81(me6Var, new RectF());
                        ?? p24Var = new p24(n81Var);
                        p24Var.C0 = n81Var;
                        this.F0 = p24Var;
                    } else {
                        this.F0 = new p24(this.L0);
                    }
                    this.J0 = null;
                    this.K0 = null;
                } else {
                    i.h(lb1.o(new StringBuilder(), this.O0, " is illegal; only @BoxBackgroundMode constants are supported."));
                    return;
                }
            } else {
                this.F0 = new p24(this.L0);
                this.J0 = new p24();
                this.K0 = new p24();
            }
        } else {
            this.F0 = null;
            this.J0 = null;
            this.K0 = null;
        }
        u();
        z();
        if (this.O0 == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.P0 = getResources().getDimensionPixelSize(R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (np2.W(getContext())) {
                this.P0 = getResources().getDimensionPixelSize(R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        a();
        if (this.O0 != 0) {
            v();
        }
        EditText editText = this.d0;
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i3 = this.O0;
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
    */
    public final void l() {
        float f;
        float f2;
        float f3;
        RectF rectF;
        float f4;
        int i;
        float f5;
        int i2;
        if (g()) {
            int width = this.d0.getWidth();
            int gravity = this.d0.getGravity();
            at0 at0Var = this.s1;
            boolean c = at0Var.c(at0Var.B);
            at0Var.D = c;
            Rect rect = at0Var.d;
            if (gravity != 17 && (gravity & 7) != 1) {
                if ((gravity & 8388613) != 8388613 && (gravity & 5) != 5) {
                    if (c) {
                        f = rect.right;
                        f2 = at0Var.a0;
                    } else {
                        i2 = rect.left;
                        f3 = i2;
                    }
                } else if (c) {
                    i2 = rect.left;
                    f3 = i2;
                } else {
                    f = rect.right;
                    f2 = at0Var.a0;
                }
                float max = Math.max(f3, rect.left);
                rectF = this.X0;
                rectF.left = max;
                rectF.top = rect.top;
                if (gravity == 17 && (gravity & 7) != 1) {
                    if ((gravity & 8388613) != 8388613 && (gravity & 5) != 5) {
                        if (at0Var.D) {
                            i = rect.right;
                            f4 = i;
                        } else {
                            f5 = at0Var.a0;
                            f4 = f5 + max;
                        }
                    } else if (at0Var.D) {
                        f5 = at0Var.a0;
                        f4 = f5 + max;
                    } else {
                        i = rect.right;
                        f4 = i;
                    }
                } else {
                    f4 = (width / 2.0f) + (at0Var.a0 / 2.0f);
                }
                rectF.right = Math.min(f4, rect.right);
                rectF.bottom = at0Var.f() + rect.top;
                if (at0Var.Z != null && !at0Var.o()) {
                    StaticLayout staticLayout = at0Var.Z;
                    float lineWidth = (at0Var.i / at0Var.h) * staticLayout.getLineWidth(staticLayout.getLineCount() - 1);
                    if (!at0Var.D) {
                        rectF.left = rectF.right - lineWidth;
                    } else {
                        rectF.right = rectF.left + lineWidth;
                    }
                }
                if (rectF.width() <= RecyclerView.B1 && rectF.height() > RecyclerView.B1) {
                    float f6 = rectF.left;
                    float f7 = this.N0;
                    rectF.left = f6 - f7;
                    rectF.right += f7;
                    rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.Q0);
                    rectF.top = RecyclerView.B1;
                    o81 o81Var = (o81) this.F0;
                    o81Var.getClass();
                    o81Var.t(rectF.left, rectF.top, rectF.right, rectF.bottom);
                    return;
                }
            }
            f = width / 2.0f;
            f2 = at0Var.a0 / 2.0f;
            f3 = f - f2;
            float max2 = Math.max(f3, rect.left);
            rectF = this.X0;
            rectF.left = max2;
            rectF.top = rect.top;
            if (gravity == 17) {
            }
            f4 = (width / 2.0f) + (at0Var.a0 / 2.0f);
            rectF.right = Math.min(f4, rect.right);
            rectF.bottom = at0Var.f() + rect.top;
            if (at0Var.Z != null) {
                StaticLayout staticLayout2 = at0Var.Z;
                float lineWidth2 = (at0Var.i / at0Var.h) * staticLayout2.getLineWidth(staticLayout2.getLineCount() - 1);
                if (!at0Var.D) {
                }
            }
            if (rectF.width() <= RecyclerView.B1) {
            }
        }
    }

    public final void n(qs qsVar, int i) {
        try {
            qsVar.setTextAppearance(i);
            if (qsVar.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        qsVar.setTextAppearance(2132017660);
        qsVar.setTextColor(getContext().getColor(R.color.design_error));
    }

    public final boolean o() {
        q43 q43Var = this.j0;
        if (q43Var.o == 1 && q43Var.r != null && !TextUtils.isEmpty(q43Var.p)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.s1.i(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int max;
        n42 n42Var = this.L;
        n42Var.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z = false;
        this.y1 = false;
        if (this.d0 != null && this.d0.getMeasuredHeight() < (max = Math.max(n42Var.getMeasuredHeight(), this.B.getMeasuredHeight()))) {
            this.d0.setMinimumHeight(max);
            z = true;
        }
        boolean s = s();
        if (!z && !s) {
            return;
        }
        this.d0.post(new rk3(this, 16));
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float descent;
        int i5;
        int compoundPaddingTop;
        int compoundPaddingBottom;
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.d0;
        if (editText != null) {
            Rect rect = this.V0;
            ji1.a(this, editText, rect);
            p24 p24Var = this.J0;
            if (p24Var != null) {
                int i6 = rect.bottom;
                p24Var.setBounds(rect.left, i6 - this.R0, rect.right, i6);
            }
            p24 p24Var2 = this.K0;
            if (p24Var2 != null) {
                int i7 = rect.bottom;
                p24Var2.setBounds(rect.left, i7 - this.S0, rect.right, i7);
            }
            if (this.C0) {
                float textSize = this.d0.getTextSize();
                at0 at0Var = this.s1;
                float f = at0Var.h;
                TextPaint textPaint = at0Var.P;
                if (f != textSize) {
                    at0Var.h = textSize;
                    at0Var.j(false);
                }
                int gravity = this.d0.getGravity();
                int i8 = (gravity & (-113)) | 48;
                if (at0Var.g != i8) {
                    at0Var.g = i8;
                    at0Var.j(false);
                }
                if (at0Var.f != gravity) {
                    at0Var.f = gravity;
                    at0Var.j(false);
                }
                Rect d = d(rect);
                int i9 = d.left;
                int i10 = d.top;
                int i11 = d.right;
                int i12 = d.bottom;
                Rect rect2 = at0Var.d;
                if (rect2.left != i9 || rect2.top != i10 || rect2.right != i11 || rect2.bottom != i12) {
                    rect2.set(i9, i10, i11, i12);
                    at0Var.N = true;
                }
                if (this.d0 != null) {
                    if (getHintMaxLines() == 1) {
                        textPaint.setTextSize(at0Var.h);
                        textPaint.setTypeface(at0Var.v);
                        textPaint.setLetterSpacing(at0Var.X);
                        descent = -textPaint.ascent();
                    } else {
                        textPaint.setTextSize(at0Var.h);
                        textPaint.setTypeface(at0Var.v);
                        textPaint.setLetterSpacing(at0Var.X);
                        descent = at0Var.l * (textPaint.descent() + (-textPaint.ascent()));
                    }
                    int compoundPaddingLeft = this.d0.getCompoundPaddingLeft() + rect.left;
                    Rect rect3 = this.W0;
                    rect3.left = compoundPaddingLeft;
                    if (this.O0 == 1 && this.d0.getMinLines() <= 1) {
                        compoundPaddingTop = (int) (rect.centerY() - (descent / 2.0f));
                    } else {
                        if (this.O0 == 0 && getHintMaxLines() != 1) {
                            textPaint.setTextSize(at0Var.h);
                            textPaint.setTypeface(at0Var.v);
                            textPaint.setLetterSpacing(at0Var.X);
                            i5 = (int) ((-textPaint.ascent()) / 2.0f);
                        } else {
                            i5 = 0;
                        }
                        compoundPaddingTop = (this.d0.getCompoundPaddingTop() + rect.top) - i5;
                    }
                    rect3.top = compoundPaddingTop;
                    rect3.right = rect.right - this.d0.getCompoundPaddingRight();
                    if (this.O0 == 1 && this.d0.getMinLines() <= 1) {
                        compoundPaddingBottom = (int) (rect3.top + descent);
                    } else {
                        compoundPaddingBottom = rect.bottom - this.d0.getCompoundPaddingBottom();
                    }
                    rect3.bottom = compoundPaddingBottom;
                    int i13 = rect3.left;
                    int i14 = rect3.top;
                    int i15 = rect3.right;
                    Rect rect4 = at0Var.c;
                    if (rect4.left != i13 || rect4.top != i14 || rect4.right != i15 || rect4.bottom != compoundPaddingBottom || true != at0Var.k0) {
                        rect4.set(i13, i14, i15, compoundPaddingBottom);
                        at0Var.N = true;
                        at0Var.k0 = true;
                    }
                    at0Var.j(false);
                    if (g() && !this.r1) {
                        l();
                        return;
                    }
                    return;
                }
                e41.m();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        float f;
        boolean z;
        EditText editText;
        super.onMeasure(i, i2);
        boolean z2 = this.y1;
        n42 n42Var = this.L;
        if (!z2) {
            n42Var.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.y1 = true;
        }
        if (this.t0 != null && (editText = this.d0) != null) {
            this.t0.setGravity(editText.getGravity());
            this.t0.setPadding(this.d0.getCompoundPaddingLeft(), this.d0.getCompoundPaddingTop(), this.d0.getCompoundPaddingRight(), this.d0.getCompoundPaddingBottom());
        }
        n42Var.m();
        if (getHintMaxLines() != 1) {
            int measuredWidth = (this.d0.getMeasuredWidth() - this.d0.getCompoundPaddingLeft()) - this.d0.getCompoundPaddingRight();
            at0 at0Var = this.s1;
            TextPaint textPaint = at0Var.P;
            textPaint.setTextSize(at0Var.i);
            textPaint.setTypeface(at0Var.s);
            textPaint.setLetterSpacing(at0Var.W);
            float f2 = measuredWidth;
            at0Var.i0 = at0Var.e(at0Var.f0, textPaint, at0Var.B, (at0Var.i / at0Var.h) * f2, at0Var.D).getHeight();
            textPaint.setTextSize(at0Var.h);
            textPaint.setTypeface(at0Var.v);
            textPaint.setLetterSpacing(at0Var.X);
            at0Var.j0 = at0Var.e(at0Var.e0, textPaint, at0Var.B, f2, at0Var.D).getHeight();
            EditText editText2 = this.d0;
            Rect rect = this.V0;
            ji1.a(this, editText2, rect);
            Rect d = d(rect);
            int i3 = d.left;
            int i4 = d.top;
            int i5 = d.right;
            int i6 = d.bottom;
            Rect rect2 = at0Var.d;
            if (rect2.left != i3 || rect2.top != i4 || rect2.right != i5 || rect2.bottom != i6) {
                rect2.set(i3, i4, i5, i6);
                at0Var.N = true;
            }
            v();
            a();
            if (this.d0 != null) {
                int i7 = at0Var.j0;
                if (i7 != -1) {
                    f = i7;
                } else {
                    TextPaint textPaint2 = at0Var.P;
                    textPaint2.setTextSize(at0Var.h);
                    textPaint2.setTypeface(at0Var.v);
                    textPaint2.setLetterSpacing(at0Var.X);
                    f = -textPaint2.ascent();
                }
                CharSequence charSequence = this.r0;
                float f3 = RecyclerView.B1;
                if (charSequence != null) {
                    TextPaint textPaint3 = new TextPaint(129);
                    textPaint3.set(this.t0.getPaint());
                    textPaint3.setTextSize(this.t0.getTextSize());
                    textPaint3.setTypeface(this.t0.getTypeface());
                    textPaint3.setLetterSpacing(this.t0.getLetterSpacing());
                    mq6 mq6Var = new mq6(this.r0, textPaint3, measuredWidth);
                    if (getLayoutDirection() == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    mq6Var.k = z;
                    mq6Var.j = true;
                    float lineSpacingExtra = this.t0.getLineSpacingExtra();
                    float lineSpacingMultiplier = this.t0.getLineSpacingMultiplier();
                    mq6Var.g = lineSpacingExtra;
                    mq6Var.h = lineSpacingMultiplier;
                    mq6Var.m = new h61(this, 22);
                    StaticLayout a = mq6Var.a();
                    if (this.O0 == 1) {
                        f3 = at0Var.f() + this.P0 + this.R;
                    }
                    f3 += a.getHeight();
                }
                float max = Math.max(f, f3);
                if (this.d0.getMeasuredHeight() < max) {
                    this.d0.setMinimumHeight(Math.round(max));
                }
            }
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof n37)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        n37 n37Var = (n37) parcelable;
        super.onRestoreInstanceState(n37Var.A);
        setError(n37Var.L);
        if (n37Var.R) {
            post(new g15(this, 23));
        }
        requestLayout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, me6] */
    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        if (z != this.M0) {
            f61 f61Var = this.L0.e;
            RectF rectF = this.X0;
            float a = f61Var.a(rectF);
            float a2 = this.L0.f.a(rectF);
            float a3 = this.L0.h.a(rectF);
            float a4 = this.L0.g.a(rectF);
            me6 me6Var = this.L0;
            q60 q60Var = me6Var.a;
            q60 q60Var2 = me6Var.b;
            q60 q60Var3 = me6Var.d;
            q60 q60Var4 = me6Var.c;
            cs1 cs1Var = new cs1(0);
            cs1 cs1Var2 = new cs1(0);
            cs1 cs1Var3 = new cs1(0);
            cs1 cs1Var4 = new cs1(0);
            t tVar = new t(a2);
            t tVar2 = new t(a);
            t tVar3 = new t(a4);
            t tVar4 = new t(a3);
            ?? obj = new Object();
            obj.a = q60Var2;
            obj.b = q60Var;
            obj.c = q60Var3;
            obj.d = q60Var4;
            obj.e = tVar;
            obj.f = tVar2;
            obj.g = tVar4;
            obj.h = tVar3;
            obj.i = cs1Var;
            obj.j = cs1Var2;
            obj.k = cs1Var3;
            obj.l = cs1Var4;
            this.M0 = z;
            setShapeAppearanceModel(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [s, n37, android.os.Parcelable] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z;
        ?? sVar = new s(super.onSaveInstanceState());
        if (o()) {
            sVar.L = getError();
        }
        n42 n42Var = this.L;
        if (n42Var.h0 != 0 && n42Var.f0.R) {
            z = true;
        } else {
            z = false;
        }
        sVar.R = z;
        return sVar;
    }

    public final void p(Editable editable) {
        int i;
        boolean z;
        int i2;
        g40 g40Var;
        ((fa6) this.n0).getClass();
        if (editable != null) {
            i = editable.length();
        } else {
            i = 0;
        }
        boolean z2 = this.m0;
        int i3 = this.l0;
        String str = null;
        if (i3 == -1) {
            this.o0.setText(String.valueOf(i));
            this.o0.setContentDescription(null);
            this.m0 = false;
        } else {
            if (i > i3) {
                z = true;
            } else {
                z = false;
            }
            this.m0 = z;
            Context context = getContext();
            qs qsVar = this.o0;
            int i4 = this.l0;
            if (this.m0) {
                i2 = R.string.character_counter_overflowed_content_description;
            } else {
                i2 = R.string.character_counter_content_description;
            }
            qsVar.setContentDescription(context.getString(i2, Integer.valueOf(i), Integer.valueOf(i4)));
            if (z2 != this.m0) {
                q();
            }
            String str2 = g40.b;
            if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
                g40Var = g40.e;
            } else {
                g40Var = g40.d;
            }
            qs qsVar2 = this.o0;
            String string = getContext().getString(R.string.character_counter_pattern, Integer.valueOf(i), Integer.valueOf(this.l0));
            g40Var.getClass();
            g60 g60Var = f17.a;
            if (string != null) {
                str = g40Var.c(string).toString();
            }
            qsVar2.setText(str);
        }
        if (this.d0 != null && z2 != this.m0) {
            w(false, false);
            z();
            t();
        }
    }

    public final void q() {
        int i;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        qs qsVar = this.o0;
        if (qsVar != null) {
            if (this.m0) {
                i = this.p0;
            } else {
                i = this.q0;
            }
            n(qsVar, i);
            if (!this.m0 && (colorStateList2 = this.y0) != null) {
                this.o0.setTextColor(colorStateList2);
            }
            if (this.m0 && (colorStateList = this.z0) != null) {
                this.o0.setTextColor(colorStateList);
            }
        }
    }

    public final void r() {
        Drawable textCursorDrawable;
        Drawable textCursorDrawable2;
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.A0;
        if (colorStateList2 == null) {
            Context context = getContext();
            TypedValue M = qo2.M(context, R.attr.colorControlActivated);
            if (M != null) {
                int i = M.resourceId;
                if (i != 0) {
                    colorStateList2 = ge7.A(context, i);
                } else {
                    int i2 = M.data;
                    if (i2 != 0) {
                        colorStateList2 = ColorStateList.valueOf(i2);
                    }
                }
            }
            colorStateList2 = null;
        }
        EditText editText = this.d0;
        if (editText != null) {
            textCursorDrawable = editText.getTextCursorDrawable();
            if (textCursorDrawable != null) {
                textCursorDrawable2 = this.d0.getTextCursorDrawable();
                Drawable mutate = textCursorDrawable2.mutate();
                if ((o() || (this.o0 != null && this.m0)) && (colorStateList = this.B0) != null) {
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
    */
    public final boolean s() {
        boolean z;
        n42 n42Var;
        Drawable[] compoundDrawablesRelative;
        ColorDrawable colorDrawable;
        Drawable drawable;
        ColorDrawable colorDrawable2;
        if (this.d0 == null) {
            return false;
        }
        CheckableImageButton checkableImageButton = null;
        boolean z2 = true;
        if (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) {
            fp6 fp6Var = this.B;
            if (fp6Var.getMeasuredWidth() > 0) {
                int measuredWidth = fp6Var.getMeasuredWidth() - this.d0.getPaddingLeft();
                if (this.Z0 == null || this.a1 != measuredWidth) {
                    ColorDrawable colorDrawable3 = new ColorDrawable();
                    this.Z0 = colorDrawable3;
                    this.a1 = measuredWidth;
                    colorDrawable3.setBounds(0, 0, measuredWidth, 1);
                }
                Drawable[] compoundDrawablesRelative2 = this.d0.getCompoundDrawablesRelative();
                Drawable drawable2 = compoundDrawablesRelative2[0];
                ColorDrawable colorDrawable4 = this.Z0;
                if (drawable2 != colorDrawable4) {
                    this.d0.setCompoundDrawablesRelative(colorDrawable4, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
                    z = true;
                    n42Var = this.L;
                    if ((!n42Var.e() || ((n42Var.h0 != 0 && n42Var.d()) || n42Var.o0 != null)) && n42Var.getMeasuredWidth() > 0) {
                        int measuredWidth2 = n42Var.p0.getMeasuredWidth() - this.d0.getPaddingRight();
                        if (!n42Var.e()) {
                            checkableImageButton = n42Var.L;
                        } else if (n42Var.h0 != 0 && n42Var.d()) {
                            checkableImageButton = n42Var.f0;
                        }
                        if (checkableImageButton != null) {
                            measuredWidth2 = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth() + measuredWidth2;
                        }
                        compoundDrawablesRelative = this.d0.getCompoundDrawablesRelative();
                        colorDrawable = this.c1;
                        if (colorDrawable == null && this.d1 != measuredWidth2) {
                            this.d1 = measuredWidth2;
                            colorDrawable.setBounds(0, 0, measuredWidth2, 1);
                            this.d0.setCompoundDrawablesRelative(compoundDrawablesRelative[0], compoundDrawablesRelative[1], this.c1, compoundDrawablesRelative[3]);
                            return true;
                        }
                        if (colorDrawable == null) {
                            ColorDrawable colorDrawable5 = new ColorDrawable();
                            this.c1 = colorDrawable5;
                            this.d1 = measuredWidth2;
                            colorDrawable5.setBounds(0, 0, measuredWidth2, 1);
                        }
                        drawable = compoundDrawablesRelative[2];
                        colorDrawable2 = this.c1;
                        if (drawable != colorDrawable2) {
                            this.e1 = drawable;
                            this.d0.setCompoundDrawablesRelative(compoundDrawablesRelative[0], compoundDrawablesRelative[1], colorDrawable2, compoundDrawablesRelative[3]);
                            return true;
                        }
                    } else if (this.c1 != null) {
                        Drawable[] compoundDrawablesRelative3 = this.d0.getCompoundDrawablesRelative();
                        if (compoundDrawablesRelative3[2] == this.c1) {
                            this.d0.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], this.e1, compoundDrawablesRelative3[3]);
                        } else {
                            z2 = z;
                        }
                        this.c1 = null;
                        return z2;
                    }
                    return z;
                }
                z = false;
                n42Var = this.L;
                if (!n42Var.e()) {
                }
                int measuredWidth22 = n42Var.p0.getMeasuredWidth() - this.d0.getPaddingRight();
                if (!n42Var.e()) {
                }
                if (checkableImageButton != null) {
                }
                compoundDrawablesRelative = this.d0.getCompoundDrawablesRelative();
                colorDrawable = this.c1;
                if (colorDrawable == null) {
                }
                if (colorDrawable == null) {
                }
                drawable = compoundDrawablesRelative[2];
                colorDrawable2 = this.c1;
                if (drawable != colorDrawable2) {
                }
                return z;
            }
        }
        if (this.Z0 != null) {
            Drawable[] compoundDrawablesRelative4 = this.d0.getCompoundDrawablesRelative();
            this.d0.setCompoundDrawablesRelative(null, compoundDrawablesRelative4[1], compoundDrawablesRelative4[2], compoundDrawablesRelative4[3]);
            this.Z0 = null;
            z = true;
            n42Var = this.L;
            if (!n42Var.e()) {
            }
            int measuredWidth222 = n42Var.p0.getMeasuredWidth() - this.d0.getPaddingRight();
            if (!n42Var.e()) {
            }
            if (checkableImageButton != null) {
            }
            compoundDrawablesRelative = this.d0.getCompoundDrawablesRelative();
            colorDrawable = this.c1;
            if (colorDrawable == null) {
            }
            if (colorDrawable == null) {
            }
            drawable = compoundDrawablesRelative[2];
            colorDrawable2 = this.c1;
            if (drawable != colorDrawable2) {
            }
            return z;
        }
        z = false;
        n42Var = this.L;
        if (!n42Var.e()) {
        }
        int measuredWidth2222 = n42Var.p0.getMeasuredWidth() - this.d0.getPaddingRight();
        if (!n42Var.e()) {
        }
        if (checkableImageButton != null) {
        }
        compoundDrawablesRelative = this.d0.getCompoundDrawablesRelative();
        colorDrawable = this.c1;
        if (colorDrawable == null) {
        }
        if (colorDrawable == null) {
        }
        drawable = compoundDrawablesRelative[2];
        colorDrawable2 = this.c1;
        if (drawable != colorDrawable2) {
        }
        return z;
    }

    public void setBoxBackgroundColor(int i) {
        if (this.U0 != i) {
            this.U0 = i;
            this.l1 = i;
            this.n1 = i;
            this.o1 = i;
            c();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(getContext().getColor(i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.l1 = defaultColor;
        this.U0 = defaultColor;
        this.m1 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.n1 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        this.o1 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
        c();
    }

    public void setBoxBackgroundMode(int i) {
        if (i != this.O0) {
            this.O0 = i;
            if (this.d0 != null) {
                k();
            }
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.P0 = i;
    }

    public void setBoxCornerFamily(int i) {
        le6 f = this.L0.f();
        f61 f61Var = this.L0.e;
        f.a = jx2.r(i);
        f.e = f61Var;
        f61 f61Var2 = this.L0.f;
        f.b = jx2.r(i);
        f.f = f61Var2;
        f61 f61Var3 = this.L0.h;
        f.d = jx2.r(i);
        f.h = f61Var3;
        f61 f61Var4 = this.L0.g;
        f.c = jx2.r(i);
        f.g = f61Var4;
        this.L0 = f.a();
        c();
    }

    public void setBoxStrokeColor(int i) {
        if (this.j1 != i) {
            this.j1 = i;
            z();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.h1 = colorStateList.getDefaultColor();
            this.p1 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.i1 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
            this.j1 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        } else if (this.j1 != colorStateList.getDefaultColor()) {
            this.j1 = colorStateList.getDefaultColor();
        }
        z();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.k1 != colorStateList) {
            this.k1 = colorStateList;
            z();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.R0 = i;
        z();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.S0 = i;
        z();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z) {
        if (this.k0 != z) {
            q43 q43Var = this.j0;
            Editable editable = null;
            if (z) {
                qs qsVar = new qs(getContext(), null);
                this.o0 = qsVar;
                qsVar.setId(R.id.textinput_counter);
                Typeface typeface = this.Y0;
                if (typeface != null) {
                    this.o0.setTypeface(typeface);
                }
                this.o0.setMaxLines(1);
                q43Var.a(this.o0, 2);
                ((ViewGroup.MarginLayoutParams) this.o0.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(R.dimen.mtrl_textinput_counter_margin_start));
                q();
                if (this.o0 != null) {
                    EditText editText = this.d0;
                    if (editText != null) {
                        editable = editText.getText();
                    }
                    p(editable);
                }
            } else {
                q43Var.g(this.o0, 2);
                this.o0 = null;
            }
            this.k0 = z;
        }
    }

    public void setCounterMaxLength(int i) {
        Editable text;
        if (this.l0 != i) {
            if (i > 0) {
                this.l0 = i;
            } else {
                this.l0 = -1;
            }
            if (this.k0 && this.o0 != null) {
                EditText editText = this.d0;
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
        if (this.p0 != i) {
            this.p0 = i;
            q();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.z0 != colorStateList) {
            this.z0 = colorStateList;
            q();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.q0 != i) {
            this.q0 = i;
            q();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.y0 != colorStateList) {
            this.y0 = colorStateList;
            q();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.A0 != colorStateList) {
            this.A0 = colorStateList;
            r();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.B0 != colorStateList) {
            this.B0 = colorStateList;
            if (!o() && (this.o0 == null || !this.m0)) {
                return;
            }
            r();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f1 = colorStateList;
        this.g1 = colorStateList;
        if (this.d0 != null) {
            w(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        m(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.L.f0.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.L.f0.setCheckable(z);
    }

    public void setEndIconContentDescription(int i) {
        CharSequence charSequence;
        n42 n42Var = this.L;
        if (i != 0) {
            charSequence = n42Var.getResources().getText(i);
        } else {
            charSequence = null;
        }
        CheckableImageButton checkableImageButton = n42Var.f0;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(int i) {
        Drawable drawable;
        n42 n42Var = this.L;
        if (i != 0) {
            drawable = hf.S(n42Var.getContext(), i);
        } else {
            drawable = null;
        }
        TextInputLayout textInputLayout = n42Var.A;
        CheckableImageButton checkableImageButton = n42Var.f0;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            kj2.p(textInputLayout, checkableImageButton, n42Var.j0, n42Var.k0);
            kj2.V(textInputLayout, checkableImageButton, n42Var.j0);
        }
    }

    public void setEndIconMinSize(int i) {
        n42 n42Var = this.L;
        if (i >= 0) {
            if (i != n42Var.l0) {
                n42Var.l0 = i;
                CheckableImageButton checkableImageButton = n42Var.f0;
                checkableImageButton.setMinimumWidth(i);
                checkableImageButton.setMinimumHeight(i);
                CheckableImageButton checkableImageButton2 = n42Var.L;
                checkableImageButton2.setMinimumWidth(i);
                checkableImageButton2.setMinimumHeight(i);
                return;
            }
            return;
        }
        n42Var.getClass();
        i.h("endIconSize cannot be less than 0");
    }

    public void setEndIconMode(int i) {
        this.L.g(i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        n42 n42Var = this.L;
        CheckableImageButton checkableImageButton = n42Var.f0;
        View.OnLongClickListener onLongClickListener = n42Var.n0;
        checkableImageButton.setOnClickListener(onClickListener);
        kj2.Y(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        n42 n42Var = this.L;
        n42Var.n0 = onLongClickListener;
        CheckableImageButton checkableImageButton = n42Var.f0;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        kj2.Y(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        n42 n42Var = this.L;
        n42Var.m0 = scaleType;
        n42Var.f0.setScaleType(scaleType);
        n42Var.L.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        n42 n42Var = this.L;
        if (n42Var.j0 != colorStateList) {
            n42Var.j0 = colorStateList;
            kj2.p(n42Var.A, n42Var.f0, colorStateList, n42Var.k0);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        n42 n42Var = this.L;
        if (n42Var.k0 != mode) {
            n42Var.k0 = mode;
            kj2.p(n42Var.A, n42Var.f0, n42Var.j0, mode);
        }
    }

    public void setEndIconVisible(boolean z) {
        this.L.h(z);
    }

    public void setError(CharSequence charSequence) {
        q43 q43Var = this.j0;
        if (!q43Var.q) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            setErrorEnabled(true);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            q43Var.c();
            q43Var.p = charSequence;
            q43Var.r.setText(charSequence);
            int i = q43Var.n;
            if (i != 1) {
                q43Var.o = 1;
            }
            q43Var.i(i, q43Var.h(q43Var.r, charSequence), q43Var.o);
            return;
        }
        q43Var.f();
    }

    public void setErrorAccessibilityLiveRegion(int i) {
        q43 q43Var = this.j0;
        q43Var.t = i;
        qs qsVar = q43Var.r;
        if (qsVar != null) {
            qsVar.setAccessibilityLiveRegion(i);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        q43 q43Var = this.j0;
        q43Var.s = charSequence;
        qs qsVar = q43Var.r;
        if (qsVar != null) {
            qsVar.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z) {
        q43 q43Var = this.j0;
        TextInputLayout textInputLayout = q43Var.h;
        if (q43Var.q == z) {
            return;
        }
        q43Var.c();
        if (z) {
            qs qsVar = new qs(q43Var.g, null);
            q43Var.r = qsVar;
            qsVar.setId(R.id.textinput_error);
            q43Var.r.setTextAlignment(5);
            Typeface typeface = q43Var.B;
            if (typeface != null) {
                q43Var.r.setTypeface(typeface);
            }
            int i = q43Var.u;
            q43Var.u = i;
            qs qsVar2 = q43Var.r;
            if (qsVar2 != null) {
                q43Var.h.n(qsVar2, i);
            }
            ColorStateList colorStateList = q43Var.v;
            q43Var.v = colorStateList;
            qs qsVar3 = q43Var.r;
            if (qsVar3 != null && colorStateList != null) {
                qsVar3.setTextColor(colorStateList);
            }
            CharSequence charSequence = q43Var.s;
            q43Var.s = charSequence;
            qs qsVar4 = q43Var.r;
            if (qsVar4 != null) {
                qsVar4.setContentDescription(charSequence);
            }
            int i2 = q43Var.t;
            q43Var.t = i2;
            qs qsVar5 = q43Var.r;
            if (qsVar5 != null) {
                qsVar5.setAccessibilityLiveRegion(i2);
            }
            q43Var.r.setVisibility(4);
            q43Var.a(q43Var.r, 0);
        } else {
            q43Var.f();
            q43Var.g(q43Var.r, 0);
            q43Var.r = null;
            textInputLayout.t();
            textInputLayout.z();
        }
        q43Var.q = z;
    }

    public void setErrorIconDrawable(int i) {
        Drawable drawable;
        n42 n42Var = this.L;
        if (i != 0) {
            drawable = hf.S(n42Var.getContext(), i);
        } else {
            drawable = null;
        }
        n42Var.i(drawable);
        kj2.V(n42Var.A, n42Var.L, n42Var.R);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        n42 n42Var = this.L;
        CheckableImageButton checkableImageButton = n42Var.L;
        View.OnLongClickListener onLongClickListener = n42Var.e0;
        checkableImageButton.setOnClickListener(onClickListener);
        kj2.Y(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        n42 n42Var = this.L;
        n42Var.e0 = onLongClickListener;
        CheckableImageButton checkableImageButton = n42Var.L;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        kj2.Y(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        n42 n42Var = this.L;
        if (n42Var.R != colorStateList) {
            n42Var.R = colorStateList;
            kj2.p(n42Var.A, n42Var.L, colorStateList, n42Var.d0);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        n42 n42Var = this.L;
        if (n42Var.d0 != mode) {
            n42Var.d0 = mode;
            kj2.p(n42Var.A, n42Var.L, n42Var.R, mode);
        }
    }

    public void setErrorTextAppearance(int i) {
        q43 q43Var = this.j0;
        q43Var.u = i;
        qs qsVar = q43Var.r;
        if (qsVar != null) {
            q43Var.h.n(qsVar, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        q43 q43Var = this.j0;
        q43Var.v = colorStateList;
        qs qsVar = q43Var.r;
        if (qsVar != null && colorStateList != null) {
            qsVar.setTextColor(colorStateList);
        }
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.t1 != z) {
            this.t1 = z;
            w(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        q43 q43Var = this.j0;
        if (isEmpty) {
            if (q43Var.x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!q43Var.x) {
            setHelperTextEnabled(true);
        }
        q43Var.c();
        q43Var.w = charSequence;
        q43Var.y.setText(charSequence);
        int i = q43Var.n;
        if (i != 2) {
            q43Var.o = 2;
        }
        q43Var.i(i, q43Var.h(q43Var.y, charSequence), q43Var.o);
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        q43 q43Var = this.j0;
        q43Var.A = colorStateList;
        qs qsVar = q43Var.y;
        if (qsVar != null && colorStateList != null) {
            qsVar.setTextColor(colorStateList);
        }
    }

    public void setHelperTextEnabled(boolean z) {
        q43 q43Var = this.j0;
        TextInputLayout textInputLayout = q43Var.h;
        if (q43Var.x == z) {
            return;
        }
        q43Var.c();
        if (z) {
            qs qsVar = new qs(q43Var.g, null);
            q43Var.y = qsVar;
            qsVar.setId(R.id.textinput_helper_text);
            q43Var.y.setTextAlignment(5);
            Typeface typeface = q43Var.B;
            if (typeface != null) {
                q43Var.y.setTypeface(typeface);
            }
            q43Var.y.setVisibility(4);
            q43Var.y.setAccessibilityLiveRegion(1);
            int i = q43Var.z;
            q43Var.z = i;
            qs qsVar2 = q43Var.y;
            if (qsVar2 != null) {
                qsVar2.setTextAppearance(i);
            }
            ColorStateList colorStateList = q43Var.A;
            q43Var.A = colorStateList;
            qs qsVar3 = q43Var.y;
            if (qsVar3 != null && colorStateList != null) {
                qsVar3.setTextColor(colorStateList);
            }
            q43Var.a(q43Var.y, 1);
            q43Var.y.setAccessibilityDelegate(new p43(q43Var));
        } else {
            q43Var.c();
            int i2 = q43Var.n;
            if (i2 == 2) {
                q43Var.o = 0;
            }
            q43Var.i(i2, q43Var.h(q43Var.y, ""), q43Var.o);
            q43Var.g(q43Var.y, 1);
            q43Var.y = null;
            textInputLayout.t();
            textInputLayout.z();
        }
        q43Var.x = z;
    }

    public void setHelperTextTextAppearance(int i) {
        q43 q43Var = this.j0;
        q43Var.z = i;
        qs qsVar = q43Var.y;
        if (qsVar != null) {
            qsVar.setTextAppearance(i);
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
        this.u1 = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.C0) {
            this.C0 = z;
            if (!z) {
                this.E0 = false;
                if (!TextUtils.isEmpty(this.D0) && TextUtils.isEmpty(this.d0.getHint())) {
                    this.d0.setHint(this.D0);
                }
                setHintInternal(null);
            } else {
                CharSequence hint = this.d0.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.D0)) {
                        setHint(hint);
                    }
                    this.d0.setHint((CharSequence) null);
                }
                this.E0 = true;
            }
            if (this.d0 != null) {
                v();
            }
        }
    }

    public void setHintMaxLines(int i) {
        at0 at0Var = this.s1;
        if (i != at0Var.f0) {
            at0Var.f0 = i;
            at0Var.j(false);
        }
        if (i != at0Var.e0) {
            at0Var.e0 = i;
            at0Var.j(false);
        }
        requestLayout();
    }

    public void setHintTextAppearance(int i) {
        at0 at0Var = this.s1;
        TextInputLayout textInputLayout = at0Var.a;
        g07 g07Var = new g07(textInputLayout.getContext(), i);
        ColorStateList colorStateList = g07Var.k;
        if (colorStateList != null) {
            at0Var.k = colorStateList;
        }
        float f = g07Var.l;
        if (f != RecyclerView.B1) {
            at0Var.i = f;
        }
        ColorStateList colorStateList2 = g07Var.a;
        if (colorStateList2 != null) {
            at0Var.V = colorStateList2;
        }
        at0Var.T = g07Var.f;
        at0Var.U = g07Var.g;
        at0Var.S = g07Var.h;
        at0Var.W = g07Var.j;
        pj0 pj0Var = at0Var.z;
        if (pj0Var != null) {
            pj0Var.g = true;
        }
        os0 os0Var = new os0(at0Var, 24);
        g07Var.a();
        at0Var.z = new pj0(os0Var, g07Var.p);
        g07Var.b(textInputLayout.getContext(), at0Var.z);
        at0Var.j(false);
        this.g1 = at0Var.k;
        if (this.d0 != null) {
            w(false, false);
            v();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.g1 != colorStateList) {
            if (this.f1 == null) {
                at0 at0Var = this.s1;
                if (at0Var.k != colorStateList) {
                    at0Var.k = colorStateList;
                    at0Var.j(false);
                }
            }
            this.g1 = colorStateList;
            if (this.d0 != null) {
                w(false, false);
            }
        }
    }

    public void setLengthCounter(m37 m37Var) {
        this.n0 = m37Var;
    }

    public void setMaxEms(int i) {
        this.g0 = i;
        EditText editText = this.d0;
        if (editText != null && i != -1) {
            editText.setMaxEms(i);
        }
    }

    public void setMaxWidth(int i) {
        this.i0 = i;
        EditText editText = this.d0;
        if (editText != null && i != -1) {
            editText.setMaxWidth(i);
        }
    }

    public void setMaxWidthResource(int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinEms(int i) {
        this.f0 = i;
        EditText editText = this.d0;
        if (editText != null && i != -1) {
            editText.setMinEms(i);
        }
    }

    public void setMinWidth(int i) {
        this.h0 = i;
        EditText editText = this.d0;
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
        n42 n42Var = this.L;
        if (i != 0) {
            charSequence = n42Var.getResources().getText(i);
        } else {
            charSequence = null;
        }
        n42Var.f0.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        Drawable drawable;
        n42 n42Var = this.L;
        if (i != 0) {
            drawable = hf.S(n42Var.getContext(), i);
        } else {
            drawable = null;
        }
        n42Var.f0.setImageDrawable(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        n42 n42Var = this.L;
        if (z && n42Var.h0 != 1) {
            n42Var.g(1);
        } else if (!z) {
            n42Var.g(0);
        } else {
            n42Var.getClass();
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        n42 n42Var = this.L;
        n42Var.j0 = colorStateList;
        kj2.p(n42Var.A, n42Var.f0, colorStateList, n42Var.k0);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        n42 n42Var = this.L;
        n42Var.k0 = mode;
        kj2.p(n42Var.A, n42Var.f0, n42Var.j0, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        Editable editable = null;
        if (this.t0 == null) {
            qs qsVar = new qs(getContext(), null);
            this.t0 = qsVar;
            qsVar.setId(R.id.textinput_placeholder);
            this.t0.setImportantForAccessibility(1);
            this.t0.setAccessibilityLiveRegion(1);
            h92 f = f();
            this.w0 = f;
            f.B = 67L;
            this.x0 = f();
            setPlaceholderTextAppearance(this.v0);
            setPlaceholderTextColor(this.u0);
            ao7.n(this.t0, new c24(4));
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.s0) {
                setPlaceholderTextEnabled(true);
            }
            this.r0 = charSequence;
        }
        EditText editText = this.d0;
        if (editText != null) {
            editable = editText.getText();
        }
        x(editable);
    }

    public void setPlaceholderTextAppearance(int i) {
        this.v0 = i;
        qs qsVar = this.t0;
        if (qsVar != null) {
            qsVar.setTextAppearance(i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.u0 != colorStateList) {
            this.u0 = colorStateList;
            qs qsVar = this.t0;
            if (qsVar != null && colorStateList != null) {
                qsVar.setTextColor(colorStateList);
            }
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        CharSequence charSequence2;
        fp6 fp6Var = this.B;
        fp6Var.getClass();
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        fp6Var.L = charSequence2;
        fp6Var.B.setText(charSequence);
        fp6Var.e();
    }

    public void setPrefixTextAppearance(int i) {
        this.B.B.setTextAppearance(i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.B.B.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(me6 me6Var) {
        p24 p24Var = this.F0;
        if (p24Var != null && p24Var.B.a != me6Var) {
            this.L0 = me6Var;
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
            drawable = hf.S(getContext(), i);
        } else {
            drawable = null;
        }
        setStartIconDrawable(drawable);
    }

    public void setStartIconMinSize(int i) {
        fp6 fp6Var = this.B;
        if (i >= 0) {
            if (i != fp6Var.f0) {
                fp6Var.f0 = i;
                CheckableImageButton checkableImageButton = fp6Var.R;
                checkableImageButton.setMinimumWidth(i);
                checkableImageButton.setMinimumHeight(i);
                return;
            }
            return;
        }
        fp6Var.getClass();
        i.h("startIconSize cannot be less than 0");
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        fp6 fp6Var = this.B;
        CheckableImageButton checkableImageButton = fp6Var.R;
        View.OnLongClickListener onLongClickListener = fp6Var.h0;
        checkableImageButton.setOnClickListener(onClickListener);
        kj2.Y(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        fp6 fp6Var = this.B;
        fp6Var.h0 = onLongClickListener;
        CheckableImageButton checkableImageButton = fp6Var.R;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        kj2.Y(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        fp6 fp6Var = this.B;
        fp6Var.g0 = scaleType;
        fp6Var.R.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        fp6 fp6Var = this.B;
        if (fp6Var.d0 != colorStateList) {
            fp6Var.d0 = colorStateList;
            kj2.p(fp6Var.A, fp6Var.R, colorStateList, fp6Var.e0);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        fp6 fp6Var = this.B;
        if (fp6Var.e0 != mode) {
            fp6Var.e0 = mode;
            kj2.p(fp6Var.A, fp6Var.R, fp6Var.d0, mode);
        }
    }

    public void setStartIconVisible(boolean z) {
        this.B.c(z);
    }

    public void setSuffixText(CharSequence charSequence) {
        CharSequence charSequence2;
        n42 n42Var = this.L;
        n42Var.getClass();
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        n42Var.o0 = charSequence2;
        n42Var.p0.setText(charSequence);
        n42Var.n();
    }

    public void setSuffixTextAppearance(int i) {
        this.L.p0.setTextAppearance(i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.L.p0.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(l37 l37Var) {
        EditText editText = this.d0;
        if (editText != null) {
            ao7.n(editText, l37Var);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.Y0) {
            this.Y0 = typeface;
            this.s1.n(typeface);
            q43 q43Var = this.j0;
            if (typeface != q43Var.B) {
                q43Var.B = typeface;
                qs qsVar = q43Var.r;
                if (qsVar != null) {
                    qsVar.setTypeface(typeface);
                }
                qs qsVar2 = q43Var.y;
                if (qsVar2 != null) {
                    qsVar2.setTypeface(typeface);
                }
            }
            qs qsVar3 = this.o0;
            if (qsVar3 != null) {
                qsVar3.setTypeface(typeface);
            }
        }
    }

    public final void t() {
        Drawable background;
        qs qsVar;
        EditText editText = this.d0;
        if (editText != null && this.O0 == 0 && (background = editText.getBackground()) != null) {
            int[] iArr = bp1.a;
            Drawable mutate = background.mutate();
            if (o()) {
                mutate.setColorFilter(ir.c(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
            } else if (this.m0 && (qsVar = this.o0) != null) {
                mutate.setColorFilter(ir.c(qsVar.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
            } else {
                mutate.clearColorFilter();
                this.d0.refreshDrawableState();
            }
        }
    }

    public final void u() {
        EditText editText = this.d0;
        if (editText != null && this.F0 != null) {
            if ((this.I0 || editText.getBackground() == null) && this.O0 != 0) {
                this.d0.setBackground(getEditTextBoxBackground());
                this.I0 = true;
            }
        }
    }

    public final void v() {
        if (this.O0 != 1) {
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
        qs qsVar;
        ColorStateList colorStateList2;
        boolean isEnabled = isEnabled();
        EditText editText = this.d0;
        if (editText != null && !TextUtils.isEmpty(editText.getText())) {
            z3 = true;
        } else {
            z3 = false;
        }
        EditText editText2 = this.d0;
        if (editText2 != null && editText2.hasFocus()) {
            z4 = true;
        } else {
            z4 = false;
        }
        ColorStateList colorStateList3 = this.f1;
        at0 at0Var = this.s1;
        if (colorStateList3 != null) {
            at0Var.k(colorStateList3);
        }
        Editable editable = null;
        if (!isEnabled) {
            ColorStateList colorStateList4 = this.f1;
            int i = this.p1;
            if (colorStateList4 != null) {
                i = colorStateList4.getColorForState(new int[]{-16842910}, i);
            }
            at0Var.k(ColorStateList.valueOf(i));
        } else if (o()) {
            qs qsVar2 = this.j0.r;
            if (qsVar2 != null) {
                colorStateList2 = qsVar2.getTextColors();
            } else {
                colorStateList2 = null;
            }
            at0Var.k(colorStateList2);
        } else if (this.m0 && (qsVar = this.o0) != null) {
            at0Var.k(qsVar.getTextColors());
        } else if (z4 && (colorStateList = this.g1) != null && at0Var.k != colorStateList) {
            at0Var.k = colorStateList;
            at0Var.j(false);
        }
        n42 n42Var = this.L;
        fp6 fp6Var = this.B;
        if (!z3 && this.t1 && (!isEnabled() || !z4)) {
            if (z2 || !this.r1) {
                ValueAnimator valueAnimator = this.v1;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.v1.cancel();
                }
                if (z && this.u1) {
                    b(RecyclerView.B1);
                } else {
                    at0Var.m(RecyclerView.B1);
                }
                if (g() && !((o81) this.F0).C0.r.isEmpty() && g()) {
                    ((o81) this.F0).t(RecyclerView.B1, RecyclerView.B1, RecyclerView.B1, RecyclerView.B1);
                }
                this.r1 = true;
                qs qsVar3 = this.t0;
                if (qsVar3 != null && this.s0) {
                    qsVar3.setText((CharSequence) null);
                    oa7.a(this.A, this.x0);
                    this.t0.setVisibility(4);
                }
                fp6Var.i0 = true;
                fp6Var.e();
                n42Var.q0 = true;
                n42Var.n();
            }
        } else if (!z2 && !this.r1) {
        } else {
            ValueAnimator valueAnimator2 = this.v1;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.v1.cancel();
            }
            if (z && this.u1) {
                b(1.0f);
            } else {
                at0Var.m(1.0f);
            }
            this.r1 = false;
            if (g()) {
                l();
            }
            EditText editText3 = this.d0;
            if (editText3 != null) {
                editable = editText3.getText();
            }
            x(editable);
            fp6Var.i0 = false;
            fp6Var.e();
            n42Var.q0 = false;
            n42Var.n();
        }
    }

    public final void x(Editable editable) {
        int i;
        ((fa6) this.n0).getClass();
        if (editable != null) {
            i = editable.length();
        } else {
            i = 0;
        }
        FrameLayout frameLayout = this.A;
        if (i == 0 && !this.r1) {
            if (this.t0 != null && this.s0 && !TextUtils.isEmpty(this.r0)) {
                this.t0.setText(this.r0);
                oa7.a(frameLayout, this.w0);
                this.t0.setVisibility(0);
                this.t0.bringToFront();
                return;
            }
            return;
        }
        qs qsVar = this.t0;
        if (qsVar != null && this.s0) {
            qsVar.setText((CharSequence) null);
            oa7.a(frameLayout, this.x0);
            this.t0.setVisibility(4);
        }
    }

    public final void y(boolean z, boolean z2) {
        int defaultColor = this.k1.getDefaultColor();
        int colorForState = this.k1.getColorForState(new int[]{16843623, 16842910}, defaultColor);
        int colorForState2 = this.k1.getColorForState(new int[]{16843518, 16842910}, defaultColor);
        if (z) {
            this.T0 = colorForState2;
        } else if (z2) {
            this.T0 = colorForState;
        } else {
            this.T0 = defaultColor;
        }
    }

    public final void z() {
        boolean z;
        qs qsVar;
        EditText editText;
        EditText editText2;
        if (this.F0 != null && this.O0 != 0) {
            boolean z2 = false;
            if (!isFocused() && ((editText2 = this.d0) == null || !editText2.hasFocus())) {
                z = false;
            } else {
                z = true;
            }
            if (isHovered() || ((editText = this.d0) != null && editText.isHovered())) {
                z2 = true;
            }
            if (!isEnabled()) {
                this.T0 = this.p1;
            } else if (o()) {
                if (this.k1 != null) {
                    y(z, z2);
                } else {
                    this.T0 = getErrorCurrentTextColors();
                }
            } else if (this.m0 && (qsVar = this.o0) != null) {
                if (this.k1 != null) {
                    y(z, z2);
                } else {
                    this.T0 = qsVar.getCurrentTextColor();
                }
            } else if (z) {
                this.T0 = this.j1;
            } else if (z2) {
                this.T0 = this.i1;
            } else {
                this.T0 = this.h1;
            }
            if (Build.VERSION.SDK_INT >= 29) {
                r();
            }
            n42 n42Var = this.L;
            TextInputLayout textInputLayout = n42Var.A;
            CheckableImageButton checkableImageButton = n42Var.f0;
            TextInputLayout textInputLayout2 = n42Var.A;
            n42Var.l();
            kj2.V(textInputLayout2, n42Var.L, n42Var.R);
            kj2.V(textInputLayout2, checkableImageButton, n42Var.j0);
            if (n42Var.b() instanceof vp1) {
                if (textInputLayout.o() && checkableImageButton.getDrawable() != null) {
                    Drawable mutate = checkableImageButton.getDrawable().mutate();
                    mutate.setTint(textInputLayout.getErrorCurrentTextColors());
                    checkableImageButton.setImageDrawable(mutate);
                } else {
                    kj2.p(textInputLayout, checkableImageButton, n42Var.j0, n42Var.k0);
                }
            }
            fp6 fp6Var = this.B;
            kj2.V(fp6Var.A, fp6Var.R, fp6Var.d0);
            if (this.O0 == 2) {
                int i = this.Q0;
                if (z && isEnabled()) {
                    this.Q0 = this.S0;
                } else {
                    this.Q0 = this.R0;
                }
                if (this.Q0 != i && g() && !this.r1) {
                    if (g()) {
                        ((o81) this.F0).t(RecyclerView.B1, RecyclerView.B1, RecyclerView.B1, RecyclerView.B1);
                    }
                    l();
                }
            }
            if (this.O0 == 1) {
                if (!isEnabled()) {
                    this.U0 = this.m1;
                } else if (z2 && !z) {
                    this.U0 = this.o1;
                } else if (z) {
                    this.U0 = this.n1;
                } else {
                    this.U0 = this.l1;
                }
            }
            c();
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.C0) {
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
        this.L.f0.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.L.f0.setImageDrawable(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.L.f0;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.L.i(drawable);
    }

    public void setEndIconDrawable(Drawable drawable) {
        n42 n42Var = this.L;
        TextInputLayout textInputLayout = n42Var.A;
        CheckableImageButton checkableImageButton = n42Var.f0;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            kj2.p(textInputLayout, checkableImageButton, n42Var.j0, n42Var.k0);
            kj2.V(textInputLayout, checkableImageButton, n42Var.j0);
        }
    }
}
