package com.google.android.material.textfield;

import a6.x0;
import aj.g;
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
import c8.h;
import com.google.android.material.internal.CheckableImageButton;
import d2.t;
import ha.b;
import ha.c;
import ha.i;
import j7.s;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import k0.d;
import k7.w;
import l0.f;
import m9.o;
import me.magnum.melonds.R;
import na.j;
import na.n;
import p1.c1;
import q.l1;
import q.r;
import q.z0;
import qa.e;
import qa.l;
import qa.m;
import qa.p;
import qa.q;
import qa.u;
import qa.v;
import qa.x;
import qa.y;
import sa.a;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: x1  reason: collision with root package name */
    public static final int[][] f3103x1 = {new int[]{16842919}, new int[0]};
    public final FrameLayout A;
    public boolean A0;
    public final u B;
    public CharSequence B0;
    public boolean C0;
    public j D0;
    public j E0;
    public StateListDrawable F0;
    public boolean G0;
    public j H0;
    public j I0;
    public n J0;
    public boolean K0;
    public final m L;
    public final int L0;
    public int M0;
    public int N0;
    public int O0;
    public int P0;
    public int Q0;
    public final int R;
    public int R0;
    public int S0;
    public final Rect T0;
    public final Rect U0;
    public final RectF V0;
    public Typeface W0;
    public ColorDrawable X0;
    public int Y0;
    public final LinkedHashSet Z0;

    /* renamed from: a1  reason: collision with root package name */
    public ColorDrawable f3104a1;

    /* renamed from: b0  reason: collision with root package name */
    public EditText f3105b0;

    /* renamed from: b1  reason: collision with root package name */
    public int f3106b1;

    /* renamed from: c0  reason: collision with root package name */
    public CharSequence f3107c0;

    /* renamed from: c1  reason: collision with root package name */
    public Drawable f3108c1;

    /* renamed from: d0  reason: collision with root package name */
    public int f3109d0;

    /* renamed from: d1  reason: collision with root package name */
    public ColorStateList f3110d1;

    /* renamed from: e0  reason: collision with root package name */
    public int f3111e0;

    /* renamed from: e1  reason: collision with root package name */
    public ColorStateList f3112e1;

    /* renamed from: f0  reason: collision with root package name */
    public int f3113f0;

    /* renamed from: f1  reason: collision with root package name */
    public int f3114f1;

    /* renamed from: g0  reason: collision with root package name */
    public int f3115g0;

    /* renamed from: g1  reason: collision with root package name */
    public int f3116g1;

    /* renamed from: h0  reason: collision with root package name */
    public final q f3117h0;

    /* renamed from: h1  reason: collision with root package name */
    public int f3118h1;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f3119i0;

    /* renamed from: i1  reason: collision with root package name */
    public ColorStateList f3120i1;

    /* renamed from: j0  reason: collision with root package name */
    public int f3121j0;

    /* renamed from: j1  reason: collision with root package name */
    public int f3122j1;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f3123k0;

    /* renamed from: k1  reason: collision with root package name */
    public int f3124k1;

    /* renamed from: l0  reason: collision with root package name */
    public x f3125l0;

    /* renamed from: l1  reason: collision with root package name */
    public int f3126l1;

    /* renamed from: m0  reason: collision with root package name */
    public z0 f3127m0;

    /* renamed from: m1  reason: collision with root package name */
    public int f3128m1;

    /* renamed from: n0  reason: collision with root package name */
    public int f3129n0;

    /* renamed from: n1  reason: collision with root package name */
    public int f3130n1;

    /* renamed from: o0  reason: collision with root package name */
    public int f3131o0;

    /* renamed from: o1  reason: collision with root package name */
    public int f3132o1;
    public CharSequence p0;

    /* renamed from: p1  reason: collision with root package name */
    public boolean f3133p1;

    /* renamed from: q0  reason: collision with root package name */
    public boolean f3134q0;

    /* renamed from: q1  reason: collision with root package name */
    public final b f3135q1;

    /* renamed from: r0  reason: collision with root package name */
    public z0 f3136r0;

    /* renamed from: r1  reason: collision with root package name */
    public boolean f3137r1;

    /* renamed from: s0  reason: collision with root package name */
    public ColorStateList f3138s0;

    /* renamed from: s1  reason: collision with root package name */
    public boolean f3139s1;

    /* renamed from: t0  reason: collision with root package name */
    public int f3140t0;

    /* renamed from: t1  reason: collision with root package name */
    public ValueAnimator f3141t1;

    /* renamed from: u0  reason: collision with root package name */
    public h f3142u0;

    /* renamed from: u1  reason: collision with root package name */
    public boolean f3143u1;

    /* renamed from: v0  reason: collision with root package name */
    public h f3144v0;

    /* renamed from: v1  reason: collision with root package name */
    public boolean f3145v1;

    /* renamed from: w0  reason: collision with root package name */
    public ColorStateList f3146w0;

    /* renamed from: w1  reason: collision with root package name */
    public boolean f3147w1;

    /* renamed from: x0  reason: collision with root package name */
    public ColorStateList f3148x0;

    /* renamed from: y0  reason: collision with root package name */
    public ColorStateList f3149y0;

    /* renamed from: z0  reason: collision with root package name */
    public ColorStateList f3150z0;

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, qa.x] */
    public TextInputLayout(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, R.attr.textInputStyle, 2131952575), attributeSet, R.attr.textInputStyle);
        this.f3109d0 = -1;
        this.f3111e0 = -1;
        this.f3113f0 = -1;
        this.f3115g0 = -1;
        this.f3117h0 = new q(this);
        this.f3125l0 = new Object();
        this.T0 = new Rect();
        this.U0 = new Rect();
        this.V0 = new RectF();
        this.Z0 = new LinkedHashSet();
        b bVar = new b(this);
        this.f3135q1 = bVar;
        this.f3147w1 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.A = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = u9.a.f13510a;
        bVar.R = linearInterpolator;
        bVar.j(false);
        bVar.Q = linearInterpolator;
        bVar.j(false);
        if (bVar.f6388g != 8388659) {
            bVar.f6388g = 8388659;
            bVar.j(false);
        }
        i.a(context2, attributeSet, R.attr.textInputStyle, 2131952575);
        int[] iArr = t9.a.D;
        i.b(context2, attributeSet, iArr, R.attr.textInputStyle, 2131952575, 22, 20, 40, 45, 50);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, R.attr.textInputStyle, 2131952575);
        c1 c1Var = new c1(context2, obtainStyledAttributes);
        u uVar = new u(this, c1Var);
        this.B = uVar;
        this.A0 = obtainStyledAttributes.getBoolean(48, true);
        setHint(obtainStyledAttributes.getText(4));
        this.f3139s1 = obtainStyledAttributes.getBoolean(47, true);
        this.f3137r1 = obtainStyledAttributes.getBoolean(42, true);
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
        this.J0 = n.b(context2, attributeSet, R.attr.textInputStyle, 2131952575).a();
        this.L0 = context2.getResources().getDimensionPixelOffset(R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.N0 = obtainStyledAttributes.getDimensionPixelOffset(9, 0);
        this.R = getResources().getDimensionPixelSize(R.dimen.m3_multiline_hint_filled_text_extra_space);
        this.P0 = obtainStyledAttributes.getDimensionPixelSize(16, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_textinput_box_stroke_width_default));
        this.Q0 = obtainStyledAttributes.getDimensionPixelSize(17, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.O0 = this.P0;
        float dimension = obtainStyledAttributes.getDimension(13, -1.0f);
        float dimension2 = obtainStyledAttributes.getDimension(12, -1.0f);
        float dimension3 = obtainStyledAttributes.getDimension(10, -1.0f);
        float dimension4 = obtainStyledAttributes.getDimension(11, -1.0f);
        na.m f8 = this.J0.f();
        if (dimension >= 0.0f) {
            f8.f10190e = new na.a(dimension);
        }
        if (dimension2 >= 0.0f) {
            f8.f10191f = new na.a(dimension2);
        }
        if (dimension3 >= 0.0f) {
            f8.f10192g = new na.a(dimension3);
        }
        if (dimension4 >= 0.0f) {
            f8.f10193h = new na.a(dimension4);
        }
        this.J0 = f8.a();
        ColorStateList n10 = w.n(context2, c1Var, 7);
        if (n10 != null) {
            int defaultColor = n10.getDefaultColor();
            this.f3122j1 = defaultColor;
            this.S0 = defaultColor;
            if (n10.isStateful()) {
                this.f3124k1 = n10.getColorForState(new int[]{-16842910}, -1);
                this.f3126l1 = n10.getColorForState(new int[]{16842908, 16842910}, -1);
                this.f3128m1 = n10.getColorForState(new int[]{16843623, 16842910}, -1);
            } else {
                this.f3126l1 = this.f3122j1;
                ColorStateList z10 = g.z(context2, R.color.mtrl_filled_background_color);
                this.f3124k1 = z10.getColorForState(new int[]{-16842910}, -1);
                this.f3128m1 = z10.getColorForState(new int[]{16843623}, -1);
            }
        } else {
            this.S0 = 0;
            this.f3122j1 = 0;
            this.f3124k1 = 0;
            this.f3126l1 = 0;
            this.f3128m1 = 0;
        }
        if (obtainStyledAttributes.hasValue(1)) {
            ColorStateList e6 = c1Var.e(1);
            this.f3112e1 = e6;
            this.f3110d1 = e6;
        }
        ColorStateList n11 = w.n(context2, c1Var, 14);
        this.f3118h1 = obtainStyledAttributes.getColor(14, 0);
        this.f3114f1 = context2.getColor(R.color.mtrl_textinput_default_box_stroke_color);
        this.f3130n1 = context2.getColor(R.color.mtrl_textinput_disabled_color);
        this.f3116g1 = context2.getColor(R.color.mtrl_textinput_hovered_box_stroke_color);
        if (n11 != null) {
            setBoxStrokeColorStateList(n11);
        }
        if (obtainStyledAttributes.hasValue(15)) {
            setBoxStrokeErrorColor(w.n(context2, c1Var, 15));
        }
        if (obtainStyledAttributes.getResourceId(50, -1) != -1) {
            setHintTextAppearance(obtainStyledAttributes.getResourceId(50, 0));
        }
        this.f3149y0 = c1Var.e(24);
        this.f3150z0 = c1Var.e(25);
        int resourceId = obtainStyledAttributes.getResourceId(40, 0);
        CharSequence text = obtainStyledAttributes.getText(35);
        int i2 = obtainStyledAttributes.getInt(34, 1);
        boolean z11 = obtainStyledAttributes.getBoolean(36, false);
        int resourceId2 = obtainStyledAttributes.getResourceId(45, 0);
        boolean z12 = obtainStyledAttributes.getBoolean(44, false);
        CharSequence text2 = obtainStyledAttributes.getText(43);
        int resourceId3 = obtainStyledAttributes.getResourceId(58, 0);
        CharSequence text3 = obtainStyledAttributes.getText(57);
        boolean z13 = obtainStyledAttributes.getBoolean(18, false);
        setCounterMaxLength(obtainStyledAttributes.getInt(19, -1));
        this.f3131o0 = obtainStyledAttributes.getResourceId(22, 0);
        this.f3129n0 = obtainStyledAttributes.getResourceId(20, 0);
        setBoxBackgroundMode(obtainStyledAttributes.getInt(8, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i2);
        setCounterOverflowTextAppearance(this.f3129n0);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.f3131o0);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (obtainStyledAttributes.hasValue(41)) {
            setErrorTextColor(c1Var.e(41));
        }
        if (obtainStyledAttributes.hasValue(46)) {
            setHelperTextColor(c1Var.e(46));
        }
        if (obtainStyledAttributes.hasValue(51)) {
            setHintTextColor(c1Var.e(51));
        }
        if (obtainStyledAttributes.hasValue(23)) {
            setCounterTextColor(c1Var.e(23));
        }
        if (obtainStyledAttributes.hasValue(21)) {
            setCounterOverflowTextColor(c1Var.e(21));
        }
        if (obtainStyledAttributes.hasValue(59)) {
            setPlaceholderTextColor(c1Var.e(59));
        }
        m mVar = new m(this, c1Var);
        this.L = mVar;
        boolean z14 = obtainStyledAttributes.getBoolean(0, true);
        setHintMaxLines(obtainStyledAttributes.getInt(49, 1));
        c1Var.p();
        setImportantForAccessibility(2);
        if (Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(1);
        }
        frameLayout.addView(uVar);
        frameLayout.addView(mVar);
        addView(frameLayout);
        setEnabled(z14);
        setHelperTextEnabled(z12);
        setErrorEnabled(z11);
        setCounterEnabled(z13);
        setHelperText(text2);
    }

    private Drawable getEditTextBoxBackground() {
        int i2;
        EditText editText = this.f3105b0;
        if ((editText instanceof AutoCompleteTextView) && editText.getInputType() == 0) {
            int m = f.m(this.f3105b0, R.attr.colorControlHighlight);
            int i10 = this.M0;
            int[][] iArr = f3103x1;
            if (i10 == 2) {
                Context context = getContext();
                j jVar = this.D0;
                TypedValue K = d.K(context, R.attr.colorSurface, "TextInputLayout");
                int i11 = K.resourceId;
                if (i11 != 0) {
                    i2 = context.getColor(i11);
                } else {
                    i2 = K.data;
                }
                j jVar2 = new j(jVar.B.f10144a);
                int u4 = f.u(0.1f, m, i2);
                jVar2.n(new ColorStateList(iArr, new int[]{u4, 0}));
                jVar2.setTint(i2);
                ColorStateList colorStateList = new ColorStateList(iArr, new int[]{u4, i2});
                j jVar3 = new j(jVar.B.f10144a);
                jVar3.setTint(-1);
                return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, jVar2, jVar3), jVar});
            } else if (i10 == 1) {
                j jVar4 = this.D0;
                int i12 = this.S0;
                return new RippleDrawable(new ColorStateList(iArr, new int[]{f.u(0.1f, m, i12), i12}), jVar4, jVar4);
            } else {
                return null;
            }
        }
        return this.D0;
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.F0 == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.F0 = stateListDrawable;
            stateListDrawable.addState(new int[]{16842922}, getOrCreateOutlinedDropDownMenuBackground());
            this.F0.addState(new int[0], h(false));
        }
        return this.F0;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.E0 == null) {
            this.E0 = h(true);
        }
        return this.E0;
    }

    public static void m(ViewGroup viewGroup, boolean z10) {
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            childAt.setEnabled(z10);
            if (childAt instanceof ViewGroup) {
                m((ViewGroup) childAt, z10);
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.f3105b0 == null) {
            if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
                Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
            }
            this.f3105b0 = editText;
            int i2 = this.f3109d0;
            if (i2 != -1) {
                setMinEms(i2);
            } else {
                setMinWidth(this.f3113f0);
            }
            int i10 = this.f3111e0;
            if (i10 != -1) {
                setMaxEms(i10);
            } else {
                setMaxWidth(this.f3115g0);
            }
            this.G0 = false;
            k();
            setTextInputAccessibilityDelegate(new qa.w(this));
            Typeface typeface = this.f3105b0.getTypeface();
            b bVar = this.f3135q1;
            bVar.n(typeface);
            float textSize = this.f3105b0.getTextSize();
            if (bVar.f6390h != textSize) {
                bVar.f6390h = textSize;
                bVar.j(false);
            }
            float letterSpacing = this.f3105b0.getLetterSpacing();
            if (bVar.X != letterSpacing) {
                bVar.X = letterSpacing;
                bVar.j(false);
            }
            int gravity = this.f3105b0.getGravity();
            int i11 = (gravity & (-113)) | 48;
            if (bVar.f6388g != i11) {
                bVar.f6388g = i11;
                bVar.j(false);
            }
            if (bVar.f6386f != gravity) {
                bVar.f6386f = gravity;
                bVar.j(false);
            }
            this.f3132o1 = editText.getMinimumHeight();
            this.f3105b0.addTextChangedListener(new v(this, editText));
            if (this.f3110d1 == null) {
                this.f3110d1 = this.f3105b0.getHintTextColors();
            }
            if (this.A0) {
                if (TextUtils.isEmpty(this.B0)) {
                    CharSequence hint = this.f3105b0.getHint();
                    this.f3107c0 = hint;
                    setHint(hint);
                    this.f3105b0.setHint((CharSequence) null);
                }
                this.C0 = true;
            }
            if (Build.VERSION.SDK_INT >= 29) {
                r();
            }
            if (this.f3127m0 != null) {
                p(this.f3105b0.getText());
            }
            t();
            this.f3117h0.b();
            this.B.bringToFront();
            m mVar = this.L;
            mVar.bringToFront();
            Iterator it = this.Z0.iterator();
            while (it.hasNext()) {
                ((l) it.next()).a(this);
            }
            mVar.m();
            if (!isEnabled()) {
                editText.setEnabled(false);
            }
            w(false, true);
            return;
        }
        a0.j.h("We already have an EditText, can only have one");
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.B0)) {
            this.B0 = charSequence;
            b bVar = this.f3135q1;
            if (charSequence == null || !TextUtils.equals(bVar.B, charSequence)) {
                bVar.B = charSequence;
                bVar.C = null;
                bVar.j(false);
            }
            if (!this.f3133p1) {
                l();
            }
        }
    }

    private void setPlaceholderTextEnabled(boolean z10) {
        if (this.f3134q0 == z10) {
            return;
        }
        z0 z0Var = this.f3136r0;
        if (z10) {
            if (z0Var != null) {
                this.A.addView(z0Var);
                this.f3136r0.setVisibility(0);
            }
        } else {
            if (z0Var != null) {
                z0Var.setVisibility(8);
            }
            this.f3136r0 = null;
        }
        this.f3134q0 = z10;
    }

    public final void a() {
        if (this.f3105b0 != null && this.M0 == 1) {
            if (getHintMaxLines() == 1) {
                if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                    EditText editText = this.f3105b0;
                    editText.setPaddingRelative(editText.getPaddingStart(), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_2_0_padding_top), this.f3105b0.getPaddingEnd(), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_2_0_padding_bottom));
                    return;
                } else if (w.w(getContext())) {
                    EditText editText2 = this.f3105b0;
                    editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_1_3_padding_top), this.f3105b0.getPaddingEnd(), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_1_3_padding_bottom));
                    return;
                } else {
                    return;
                }
            }
            EditText editText3 = this.f3105b0;
            editText3.setPaddingRelative(editText3.getPaddingStart(), (int) (this.f3135q1.f() + this.R), this.f3105b0.getPaddingEnd(), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_1_3_padding_bottom));
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
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
        super.addView(view, i2, layoutParams);
    }

    public final void b(float f8) {
        b bVar = this.f3135q1;
        if (bVar.f6378b == f8) {
            return;
        }
        if (this.f3141t1 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f3141t1 = valueAnimator;
            valueAnimator.setInterpolator(a.a.U(getContext(), R.attr.motionEasingEmphasizedInterpolator, u9.a.f13511b));
            this.f3141t1.setDuration(a.a.T(getContext(), R.attr.motionDurationMedium4, 167));
            this.f3141t1.addUpdateListener(new s(1, this));
        }
        this.f3141t1.setFloatValues(bVar.f6378b, f8);
        this.f3141t1.start();
    }

    public final void c() {
        ColorStateList valueOf;
        int i2;
        int i10;
        j jVar = this.D0;
        if (jVar == null) {
            return;
        }
        n nVar = jVar.B.f10144a;
        n nVar2 = this.J0;
        if (nVar != nVar2) {
            jVar.setShapeAppearanceModel(nVar2);
        }
        if (this.M0 == 2 && (i2 = this.O0) > -1 && (i10 = this.R0) != 0) {
            j jVar2 = this.D0;
            jVar2.B.f10154k = i2;
            jVar2.invalidateSelf();
            ColorStateList valueOf2 = ColorStateList.valueOf(i10);
            na.h hVar = jVar2.B;
            if (hVar.f10148e != valueOf2) {
                hVar.f10148e = valueOf2;
                jVar2.onStateChange(jVar2.getState());
            }
        }
        int i11 = this.S0;
        if (this.M0 == 1) {
            i11 = q5.a.b(this.S0, f.l(getContext(), R.attr.colorSurface, 0));
        }
        this.S0 = i11;
        this.D0.n(ColorStateList.valueOf(i11));
        j jVar3 = this.H0;
        if (jVar3 != null && this.I0 != null) {
            if (this.O0 > -1 && this.R0 != 0) {
                if (this.f3105b0.isFocused()) {
                    valueOf = ColorStateList.valueOf(this.f3114f1);
                } else {
                    valueOf = ColorStateList.valueOf(this.R0);
                }
                jVar3.n(valueOf);
                this.I0.n(ColorStateList.valueOf(this.R0));
            }
            invalidate();
        }
        u();
    }

    public final Rect d(Rect rect) {
        boolean z10;
        if (this.f3105b0 != null) {
            if (getLayoutDirection() == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i2 = rect.bottom;
            Rect rect2 = this.U0;
            rect2.bottom = i2;
            int i10 = this.M0;
            if (i10 != 1) {
                int i11 = rect.left;
                if (i10 != 2) {
                    rect2.left = i(i11, z10);
                    rect2.top = getPaddingTop();
                    rect2.right = j(rect.right, z10);
                    return rect2;
                }
                rect2.left = this.f3105b0.getPaddingLeft() + i11;
                rect2.top = rect.top - e();
                rect2.right = rect.right - this.f3105b0.getPaddingRight();
                return rect2;
            }
            rect2.left = i(rect.left, z10);
            rect2.top = rect.top + this.N0;
            rect2.right = j(rect.right, z10);
            return rect2;
        }
        throw new IllegalStateException();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i2) {
        EditText editText = this.f3105b0;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i2);
            return;
        }
        if (this.f3107c0 != null) {
            boolean z10 = this.C0;
            this.C0 = false;
            CharSequence hint = editText.getHint();
            this.f3105b0.setHint(this.f3107c0);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i2);
                return;
            } finally {
                this.f3105b0.setHint(hint);
                this.C0 = z10;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i2);
        onProvideAutofillVirtualStructure(viewStructure, i2);
        FrameLayout frameLayout = this.A;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i10 = 0; i10 < frameLayout.getChildCount(); i10++) {
            View childAt = frameLayout.getChildAt(i10);
            ViewStructure newChild = viewStructure.newChild(i10);
            childAt.dispatchProvideAutofillStructure(newChild, i2);
            if (childAt == this.f3105b0) {
                newChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.f3145v1 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f3145v1 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        j jVar;
        Canvas canvas2 = canvas;
        super.draw(canvas);
        boolean z10 = this.A0;
        b bVar = this.f3135q1;
        if (z10) {
            TextPaint textPaint = bVar.O;
            RectF rectF = bVar.f6384e;
            int save = canvas2.save();
            if (bVar.C != null && rectF.width() > 0.0f && rectF.height() > 0.0f) {
                textPaint.setTextSize(bVar.G);
                float f8 = bVar.f6402q;
                float f10 = bVar.f6403r;
                float f11 = bVar.F;
                if (f11 != 1.0f) {
                    canvas2.scale(f11, f11, f8, f10);
                }
                if ((bVar.f6385e0 > 1 || bVar.f6387f0 > 1) && !bVar.D && bVar.o()) {
                    int alpha = textPaint.getAlpha();
                    canvas2.translate(bVar.f6402q - bVar.Z.getLineStart(0), f10);
                    float f12 = alpha;
                    textPaint.setAlpha((int) (bVar.f6381c0 * f12));
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 31) {
                        float f13 = bVar.H;
                        float f14 = bVar.I;
                        float f15 = bVar.J;
                        int i10 = bVar.K;
                        textPaint.setShadowLayer(f13, f14, f15, q5.a.d(i10, (textPaint.getAlpha() * Color.alpha(i10)) / 255));
                    }
                    bVar.Z.draw(canvas2);
                    textPaint.setAlpha((int) (bVar.f6379b0 * f12));
                    if (i2 >= 31) {
                        float f16 = bVar.H;
                        float f17 = bVar.I;
                        float f18 = bVar.J;
                        int i11 = bVar.K;
                        textPaint.setShadowLayer(f16, f17, f18, q5.a.d(i11, (Color.alpha(i11) * textPaint.getAlpha()) / 255));
                    }
                    int lineBaseline = bVar.Z.getLineBaseline(0);
                    CharSequence charSequence = bVar.f6383d0;
                    float f19 = lineBaseline;
                    canvas2.drawText(charSequence, 0, charSequence.length(), 0.0f, f19, textPaint);
                    if (i2 >= 31) {
                        textPaint.setShadowLayer(bVar.H, bVar.I, bVar.J, bVar.K);
                    }
                    String trim = bVar.f6383d0.toString().trim();
                    if (trim.endsWith("…")) {
                        trim = trim.substring(0, trim.length() - 1);
                    }
                    String str = trim;
                    textPaint.setAlpha(alpha);
                    canvas2 = canvas;
                    canvas2.drawText(str, 0, Math.min(bVar.Z.getLineEnd(0), str.length()), 0.0f, f19, (Paint) textPaint);
                } else {
                    canvas2.translate(f8, f10);
                    bVar.Z.draw(canvas2);
                }
                canvas2.restoreToCount(save);
            }
        }
        if (this.I0 != null && (jVar = this.H0) != null) {
            jVar.draw(canvas2);
            if (this.f3105b0.isFocused()) {
                Rect bounds = this.I0.getBounds();
                Rect bounds2 = this.H0.getBounds();
                float f20 = bVar.f6378b;
                int centerX = bounds2.centerX();
                bounds.left = u9.a.c(f20, centerX, bounds2.left);
                bounds.right = u9.a.c(f20, centerX, bounds2.right);
                this.I0.draw(canvas2);
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
            boolean r0 = r4.f3143u1
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r4.f3143u1 = r0
            super.drawableStateChanged()
            int[] r1 = r4.getDrawableState()
            r2 = 0
            ha.b r3 = r4.f3135q1
            if (r3 == 0) goto L2f
            r3.M = r1
            android.content.res.ColorStateList r1 = r3.f6396k
            if (r1 == 0) goto L20
            boolean r1 = r1.isStateful()
            if (r1 != 0) goto L2a
        L20:
            android.content.res.ColorStateList r1 = r3.f6394j
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
            android.widget.EditText r3 = r4.f3105b0
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
            r4.f3143u1 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.drawableStateChanged():void");
    }

    public final int e() {
        if (this.A0) {
            int i2 = this.M0;
            b bVar = this.f3135q1;
            if (i2 != 0) {
                if (i2 == 2) {
                    if (getHintMaxLines() == 1) {
                        return (int) (bVar.f() / 2.0f);
                    }
                    float f8 = bVar.f();
                    TextPaint textPaint = bVar.P;
                    textPaint.setTextSize(bVar.f6392i);
                    textPaint.setTypeface(bVar.f6404s);
                    textPaint.setLetterSpacing(bVar.W);
                    return Math.max(0, (int) (f8 - ((-textPaint.ascent()) / 2.0f)));
                }
            } else {
                return (int) bVar.f();
            }
        }
        return 0;
    }

    public final h f() {
        h hVar = new h();
        hVar.L = a.a.T(getContext(), R.attr.motionDurationShort2, 87);
        hVar.R = a.a.U(getContext(), R.attr.motionEasingLinearInterpolator, u9.a.f13510a);
        return hVar;
    }

    public final boolean g() {
        if (this.A0 && !TextUtils.isEmpty(this.B0) && (this.D0 instanceof qa.f)) {
            return true;
        }
        return false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f3105b0;
        if (editText != null) {
            return e() + getPaddingTop() + editText.getBaseline();
        }
        return super.getBaseline();
    }

    public j getBoxBackground() {
        int i2 = this.M0;
        if (i2 != 1 && i2 != 2) {
            throw new IllegalStateException();
        }
        return this.D0;
    }

    public int getBoxBackgroundColor() {
        return this.S0;
    }

    public int getBoxBackgroundMode() {
        return this.M0;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.N0;
    }

    public float getBoxCornerRadiusBottomEnd() {
        int layoutDirection = getLayoutDirection();
        n nVar = this.J0;
        RectF rectF = this.V0;
        if (layoutDirection == 1) {
            return nVar.f10205h.a(rectF);
        }
        return nVar.f10204g.a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        int layoutDirection = getLayoutDirection();
        n nVar = this.J0;
        RectF rectF = this.V0;
        if (layoutDirection == 1) {
            return nVar.f10204g.a(rectF);
        }
        return nVar.f10205h.a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        int layoutDirection = getLayoutDirection();
        n nVar = this.J0;
        RectF rectF = this.V0;
        if (layoutDirection == 1) {
            return nVar.f10202e.a(rectF);
        }
        return nVar.f10203f.a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        int layoutDirection = getLayoutDirection();
        n nVar = this.J0;
        RectF rectF = this.V0;
        if (layoutDirection == 1) {
            return nVar.f10203f.a(rectF);
        }
        return nVar.f10202e.a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.f3118h1;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f3120i1;
    }

    public int getBoxStrokeWidth() {
        return this.P0;
    }

    public int getBoxStrokeWidthFocused() {
        return this.Q0;
    }

    public int getCounterMaxLength() {
        return this.f3121j0;
    }

    public CharSequence getCounterOverflowDescription() {
        z0 z0Var;
        if (this.f3119i0 && this.f3123k0 && (z0Var = this.f3127m0) != null) {
            return z0Var.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f3148x0;
    }

    public ColorStateList getCounterTextColor() {
        return this.f3146w0;
    }

    public ColorStateList getCursorColor() {
        return this.f3149y0;
    }

    public ColorStateList getCursorErrorColor() {
        return this.f3150z0;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f3110d1;
    }

    public EditText getEditText() {
        return this.f3105b0;
    }

    public CharSequence getEndIconContentDescription() {
        return this.L.f12441d0.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.L.f12441d0.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.L.f12447j0;
    }

    public int getEndIconMode() {
        return this.L.f12443f0;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.L.f12448k0;
    }

    public CheckableImageButton getEndIconView() {
        return this.L.f12441d0;
    }

    public CharSequence getError() {
        q qVar = this.f3117h0;
        if (qVar.f12481q) {
            return qVar.f12480p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f3117h0.f12484t;
    }

    public CharSequence getErrorContentDescription() {
        return this.f3117h0.f12483s;
    }

    public int getErrorCurrentTextColors() {
        z0 z0Var = this.f3117h0.f12482r;
        if (z0Var != null) {
            return z0Var.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.L.L.getDrawable();
    }

    public CharSequence getHelperText() {
        q qVar = this.f3117h0;
        if (qVar.f12488x) {
            return qVar.f12487w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        z0 z0Var = this.f3117h0.f12489y;
        if (z0Var != null) {
            return z0Var.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.A0) {
            return this.B0;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.f3135q1.f();
    }

    public final int getHintCurrentCollapsedTextColor() {
        b bVar = this.f3135q1;
        return bVar.g(bVar.f6396k);
    }

    public int getHintMaxLines() {
        return this.f3135q1.f6385e0;
    }

    public ColorStateList getHintTextColor() {
        return this.f3112e1;
    }

    public x getLengthCounter() {
        return this.f3125l0;
    }

    public int getMaxEms() {
        return this.f3111e0;
    }

    public int getMaxWidth() {
        return this.f3115g0;
    }

    public int getMinEms() {
        return this.f3109d0;
    }

    public int getMinWidth() {
        return this.f3113f0;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.L.f12441d0.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.L.f12441d0.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f3134q0) {
            return this.p0;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f3140t0;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f3138s0;
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

    public n getShapeAppearanceModel() {
        return this.J0;
    }

    public CharSequence getStartIconContentDescription() {
        return this.B.R.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.B.R.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.B.f12504d0;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.B.f12505e0;
    }

    public CharSequence getSuffixText() {
        return this.L.f12450m0;
    }

    public ColorStateList getSuffixTextColor() {
        return this.L.f12451n0.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.L.f12451n0;
    }

    public Typeface getTypeface() {
        return this.W0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [na.n, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v0, types: [na.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, k0.d] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, k0.d] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, k0.d] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, k0.d] */
    /* JADX WARN: Type inference failed for: r7v0, types: [na.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [na.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [na.f, java.lang.Object] */
    public final j h(boolean z10) {
        float f8;
        float dimensionPixelOffset;
        ColorStateList colorStateList;
        int i2;
        float dimensionPixelOffset2 = getResources().getDimensionPixelOffset(R.dimen.mtrl_shape_corner_size_small_component);
        if (z10) {
            f8 = dimensionPixelOffset2;
        } else {
            f8 = 0.0f;
        }
        EditText editText = this.f3105b0;
        if (editText instanceof qa.s) {
            dimensionPixelOffset = ((qa.s) editText).getPopupElevation();
        } else {
            dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        }
        int dimensionPixelOffset3 = getResources().getDimensionPixelOffset(R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        ?? obj = new Object();
        ?? obj2 = new Object();
        ?? obj3 = new Object();
        ?? obj4 = new Object();
        ?? obj5 = new Object();
        ?? obj6 = new Object();
        ?? obj7 = new Object();
        ?? obj8 = new Object();
        na.a aVar = new na.a(f8);
        na.a aVar2 = new na.a(f8);
        na.a aVar3 = new na.a(dimensionPixelOffset2);
        na.a aVar4 = new na.a(dimensionPixelOffset2);
        ?? obj9 = new Object();
        obj9.f10198a = obj;
        obj9.f10199b = obj2;
        obj9.f10200c = obj3;
        obj9.f10201d = obj4;
        obj9.f10202e = aVar;
        obj9.f10203f = aVar2;
        obj9.f10204g = aVar4;
        obj9.f10205h = aVar3;
        obj9.f10206i = obj5;
        obj9.f10207j = obj6;
        obj9.f10208k = obj7;
        obj9.f10209l = obj8;
        EditText editText2 = this.f3105b0;
        if (editText2 instanceof qa.s) {
            colorStateList = ((qa.s) editText2).getDropDownBackgroundTintList();
        } else {
            colorStateList = null;
        }
        Context context = getContext();
        if (colorStateList == null) {
            Paint paint = j.f10161y0;
            TypedValue K = d.K(context, R.attr.colorSurface, j.class.getSimpleName());
            int i10 = K.resourceId;
            if (i10 != 0) {
                i2 = context.getColor(i10);
            } else {
                i2 = K.data;
            }
            colorStateList = ColorStateList.valueOf(i2);
        }
        j jVar = new j();
        jVar.k(context);
        jVar.n(colorStateList);
        jVar.m(dimensionPixelOffset);
        jVar.setShapeAppearanceModel(obj9);
        na.h hVar = jVar.B;
        if (hVar.f10151h == null) {
            hVar.f10151h = new Rect();
        }
        jVar.B.f10151h.set(0, dimensionPixelOffset3, 0, dimensionPixelOffset3);
        jVar.invalidateSelf();
        return jVar;
    }

    public final int i(int i2, boolean z10) {
        int compoundPaddingLeft;
        if (!z10 && getPrefixText() != null) {
            compoundPaddingLeft = this.B.a();
        } else if (z10 && getSuffixText() != null) {
            compoundPaddingLeft = this.L.c();
        } else {
            compoundPaddingLeft = this.f3105b0.getCompoundPaddingLeft();
        }
        return compoundPaddingLeft + i2;
    }

    public final int j(int i2, boolean z10) {
        int compoundPaddingRight;
        if (!z10 && getSuffixText() != null) {
            compoundPaddingRight = this.L.c();
        } else if (z10 && getPrefixText() != null) {
            compoundPaddingRight = this.B.a();
        } else {
            compoundPaddingRight = this.f3105b0.getCompoundPaddingRight();
        }
        return i2 - compoundPaddingRight;
    }

    /* JADX WARN: Type inference failed for: r0v27, types: [na.j, qa.f] */
    public final void k() {
        int i2 = this.M0;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    if (this.A0 && !(this.D0 instanceof qa.f)) {
                        n nVar = this.J0;
                        int i10 = qa.f.B0;
                        if (nVar == null) {
                            nVar = new n();
                        }
                        e eVar = new e(nVar, new RectF());
                        ?? jVar = new j(eVar);
                        jVar.A0 = eVar;
                        this.D0 = jVar;
                    } else {
                        this.D0 = new j(this.J0);
                    }
                    this.H0 = null;
                    this.I0 = null;
                } else {
                    a0.j.h(w.d.q(new StringBuilder(), this.M0, " is illegal; only @BoxBackgroundMode constants are supported."));
                    return;
                }
            } else {
                this.D0 = new j(this.J0);
                this.H0 = new j();
                this.I0 = new j();
            }
        } else {
            this.D0 = null;
            this.H0 = null;
            this.I0 = null;
        }
        u();
        z();
        if (this.M0 == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.N0 = getResources().getDimensionPixelSize(R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (w.w(getContext())) {
                this.N0 = getResources().getDimensionPixelSize(R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        a();
        if (this.M0 != 0) {
            v();
        }
        EditText editText = this.f3105b0;
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i11 = this.M0;
                if (i11 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i11 == 1) {
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

    public final void n(z0 z0Var, int i2) {
        try {
            z0Var.setTextAppearance(i2);
            if (z0Var.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        z0Var.setTextAppearance(2131952113);
        z0Var.setTextColor(getContext().getColor(R.color.design_error));
    }

    public final boolean o() {
        q qVar = this.f3117h0;
        if (qVar.f12479o == 1 && qVar.f12482r != null && !TextUtils.isEmpty(qVar.f12480p)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f3135q1.i(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int max;
        m mVar = this.L;
        mVar.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z10 = false;
        this.f3147w1 = false;
        if (this.f3105b0 != null && this.f3105b0.getMeasuredHeight() < (max = Math.max(mVar.getMeasuredHeight(), this.B.getMeasuredHeight()))) {
            this.f3105b0.setMinimumHeight(max);
            z10 = true;
        }
        boolean s10 = s();
        if (!z10 && !s10) {
            return;
        }
        this.f3105b0.post(new a8.f(29, this));
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i2, int i10, int i11, int i12) {
        float descent;
        int i13;
        int compoundPaddingTop;
        int compoundPaddingBottom;
        super.onLayout(z10, i2, i10, i11, i12);
        EditText editText = this.f3105b0;
        if (editText != null) {
            Rect rect = this.T0;
            c.a(this, editText, rect);
            j jVar = this.H0;
            if (jVar != null) {
                int i14 = rect.bottom;
                jVar.setBounds(rect.left, i14 - this.P0, rect.right, i14);
            }
            j jVar2 = this.I0;
            if (jVar2 != null) {
                int i15 = rect.bottom;
                jVar2.setBounds(rect.left, i15 - this.Q0, rect.right, i15);
            }
            if (this.A0) {
                float textSize = this.f3105b0.getTextSize();
                b bVar = this.f3135q1;
                float f8 = bVar.f6390h;
                TextPaint textPaint = bVar.P;
                if (f8 != textSize) {
                    bVar.f6390h = textSize;
                    bVar.j(false);
                }
                int gravity = this.f3105b0.getGravity();
                int i16 = (gravity & (-113)) | 48;
                if (bVar.f6388g != i16) {
                    bVar.f6388g = i16;
                    bVar.j(false);
                }
                if (bVar.f6386f != gravity) {
                    bVar.f6386f = gravity;
                    bVar.j(false);
                }
                Rect d4 = d(rect);
                int i17 = d4.left;
                int i18 = d4.top;
                int i19 = d4.right;
                int i20 = d4.bottom;
                Rect rect2 = bVar.f6382d;
                if (rect2.left != i17 || rect2.top != i18 || rect2.right != i19 || rect2.bottom != i20) {
                    rect2.set(i17, i18, i19, i20);
                    bVar.N = true;
                }
                if (this.f3105b0 != null) {
                    if (getHintMaxLines() == 1) {
                        textPaint.setTextSize(bVar.f6390h);
                        textPaint.setTypeface(bVar.f6407v);
                        textPaint.setLetterSpacing(bVar.X);
                        descent = -textPaint.ascent();
                    } else {
                        textPaint.setTextSize(bVar.f6390h);
                        textPaint.setTypeface(bVar.f6407v);
                        textPaint.setLetterSpacing(bVar.X);
                        descent = bVar.f6398l * (textPaint.descent() + (-textPaint.ascent()));
                    }
                    int compoundPaddingLeft = this.f3105b0.getCompoundPaddingLeft() + rect.left;
                    Rect rect3 = this.U0;
                    rect3.left = compoundPaddingLeft;
                    if (this.M0 == 1 && this.f3105b0.getMinLines() <= 1) {
                        compoundPaddingTop = (int) (rect.centerY() - (descent / 2.0f));
                    } else {
                        if (this.M0 == 0 && getHintMaxLines() != 1) {
                            textPaint.setTextSize(bVar.f6390h);
                            textPaint.setTypeface(bVar.f6407v);
                            textPaint.setLetterSpacing(bVar.X);
                            i13 = (int) ((-textPaint.ascent()) / 2.0f);
                        } else {
                            i13 = 0;
                        }
                        compoundPaddingTop = (this.f3105b0.getCompoundPaddingTop() + rect.top) - i13;
                    }
                    rect3.top = compoundPaddingTop;
                    rect3.right = rect.right - this.f3105b0.getCompoundPaddingRight();
                    if (this.M0 == 1 && this.f3105b0.getMinLines() <= 1) {
                        compoundPaddingBottom = (int) (rect3.top + descent);
                    } else {
                        compoundPaddingBottom = rect.bottom - this.f3105b0.getCompoundPaddingBottom();
                    }
                    rect3.bottom = compoundPaddingBottom;
                    int i21 = rect3.left;
                    int i22 = rect3.top;
                    int i23 = rect3.right;
                    Rect rect4 = bVar.f6380c;
                    if (rect4.left != i21 || rect4.top != i22 || rect4.right != i23 || rect4.bottom != compoundPaddingBottom || true != bVar.f6397k0) {
                        rect4.set(i21, i22, i23, compoundPaddingBottom);
                        bVar.N = true;
                        bVar.f6397k0 = true;
                    }
                    bVar.j(false);
                    if (g() && !this.f3133p1) {
                        l();
                        return;
                    }
                    return;
                }
                throw new IllegalStateException();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i2, int i10) {
        float f8;
        boolean z10;
        EditText editText;
        super.onMeasure(i2, i10);
        boolean z11 = this.f3147w1;
        m mVar = this.L;
        if (!z11) {
            mVar.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.f3147w1 = true;
        }
        if (this.f3136r0 != null && (editText = this.f3105b0) != null) {
            this.f3136r0.setGravity(editText.getGravity());
            this.f3136r0.setPadding(this.f3105b0.getCompoundPaddingLeft(), this.f3105b0.getCompoundPaddingTop(), this.f3105b0.getCompoundPaddingRight(), this.f3105b0.getCompoundPaddingBottom());
        }
        mVar.m();
        if (getHintMaxLines() != 1) {
            int measuredWidth = (this.f3105b0.getMeasuredWidth() - this.f3105b0.getCompoundPaddingLeft()) - this.f3105b0.getCompoundPaddingRight();
            b bVar = this.f3135q1;
            TextPaint textPaint = bVar.P;
            textPaint.setTextSize(bVar.f6392i);
            textPaint.setTypeface(bVar.f6404s);
            textPaint.setLetterSpacing(bVar.W);
            float f10 = measuredWidth;
            bVar.f6393i0 = bVar.e(bVar.f6387f0, textPaint, bVar.B, (bVar.f6392i / bVar.f6390h) * f10, bVar.D).getHeight();
            textPaint.setTextSize(bVar.f6390h);
            textPaint.setTypeface(bVar.f6407v);
            textPaint.setLetterSpacing(bVar.X);
            bVar.f6395j0 = bVar.e(bVar.f6385e0, textPaint, bVar.B, f10, bVar.D).getHeight();
            EditText editText2 = this.f3105b0;
            Rect rect = this.T0;
            c.a(this, editText2, rect);
            Rect d4 = d(rect);
            int i11 = d4.left;
            int i12 = d4.top;
            int i13 = d4.right;
            int i14 = d4.bottom;
            Rect rect2 = bVar.f6382d;
            if (rect2.left != i11 || rect2.top != i12 || rect2.right != i13 || rect2.bottom != i14) {
                rect2.set(i11, i12, i13, i14);
                bVar.N = true;
            }
            v();
            a();
            if (this.f3105b0 != null) {
                int i15 = bVar.f6395j0;
                if (i15 != -1) {
                    f8 = i15;
                } else {
                    TextPaint textPaint2 = bVar.P;
                    textPaint2.setTextSize(bVar.f6390h);
                    textPaint2.setTypeface(bVar.f6407v);
                    textPaint2.setLetterSpacing(bVar.X);
                    f8 = -textPaint2.ascent();
                }
                float f11 = 0.0f;
                if (this.p0 != null) {
                    TextPaint textPaint3 = new TextPaint(129);
                    textPaint3.set(this.f3136r0.getPaint());
                    textPaint3.setTextSize(this.f3136r0.getTextSize());
                    textPaint3.setTypeface(this.f3136r0.getTypeface());
                    textPaint3.setLetterSpacing(this.f3136r0.getLetterSpacing());
                    ha.f fVar = new ha.f(this.p0, textPaint3, measuredWidth);
                    if (getLayoutDirection() == 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    fVar.f6429k = z10;
                    fVar.f6428j = true;
                    float lineSpacingExtra = this.f3136r0.getLineSpacingExtra();
                    float lineSpacingMultiplier = this.f3136r0.getLineSpacingMultiplier();
                    fVar.f6425g = lineSpacingExtra;
                    fVar.f6426h = lineSpacingMultiplier;
                    fVar.m = new ah.e(12, this);
                    StaticLayout a10 = fVar.a();
                    if (this.M0 == 1) {
                        f11 = bVar.f() + this.N0 + this.R;
                    }
                    f11 += a10.getHeight();
                }
                float max = Math.max(f8, f11);
                if (this.f3105b0.getMeasuredHeight() < max) {
                    this.f3105b0.setMinimumHeight(Math.round(max));
                }
            }
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof y)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        y yVar = (y) parcelable;
        super.onRestoreInstanceState(yVar.A);
        setError(yVar.L);
        if (yVar.R) {
            post(new ad.g(15, this));
        }
        requestLayout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [na.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v0, types: [na.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [na.n, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [na.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [na.f, java.lang.Object] */
    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i2) {
        super.onRtlPropertiesChanged(i2);
        boolean z10 = true;
        if (i2 != 1) {
            z10 = false;
        }
        if (z10 != this.K0) {
            na.d dVar = this.J0.f10202e;
            RectF rectF = this.V0;
            float a10 = dVar.a(rectF);
            float a11 = this.J0.f10203f.a(rectF);
            float a12 = this.J0.f10205h.a(rectF);
            float a13 = this.J0.f10204g.a(rectF);
            n nVar = this.J0;
            d dVar2 = nVar.f10198a;
            d dVar3 = nVar.f10199b;
            d dVar4 = nVar.f10201d;
            d dVar5 = nVar.f10200c;
            ?? obj = new Object();
            ?? obj2 = new Object();
            ?? obj3 = new Object();
            ?? obj4 = new Object();
            na.a aVar = new na.a(a11);
            na.a aVar2 = new na.a(a10);
            na.a aVar3 = new na.a(a13);
            na.a aVar4 = new na.a(a12);
            ?? obj5 = new Object();
            obj5.f10198a = dVar3;
            obj5.f10199b = dVar2;
            obj5.f10200c = dVar4;
            obj5.f10201d = dVar5;
            obj5.f10202e = aVar;
            obj5.f10203f = aVar2;
            obj5.f10204g = aVar4;
            obj5.f10205h = aVar3;
            obj5.f10206i = obj;
            obj5.f10207j = obj2;
            obj5.f10208k = obj3;
            obj5.f10209l = obj4;
            this.K0 = z10;
            setShapeAppearanceModel(obj5);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [i6.b, android.os.Parcelable, qa.y] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z10;
        ?? bVar = new i6.b(super.onSaveInstanceState());
        if (o()) {
            bVar.L = getError();
        }
        m mVar = this.L;
        if (mVar.f12443f0 != 0 && mVar.f12441d0.R) {
            z10 = true;
        } else {
            z10 = false;
        }
        bVar.R = z10;
        return bVar;
    }

    public final void p(Editable editable) {
        int i2;
        boolean z10;
        int i10;
        x5.b bVar;
        ((o) this.f3125l0).getClass();
        if (editable != null) {
            i2 = editable.length();
        } else {
            i2 = 0;
        }
        boolean z11 = this.f3123k0;
        int i11 = this.f3121j0;
        String str = null;
        if (i11 == -1) {
            this.f3127m0.setText(String.valueOf(i2));
            this.f3127m0.setContentDescription(null);
            this.f3123k0 = false;
        } else {
            if (i2 > i11) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f3123k0 = z10;
            Context context = getContext();
            z0 z0Var = this.f3127m0;
            int i12 = this.f3121j0;
            if (this.f3123k0) {
                i10 = R.string.character_counter_overflowed_content_description;
            } else {
                i10 = R.string.character_counter_content_description;
            }
            z0Var.setContentDescription(context.getString(i10, Integer.valueOf(i2), Integer.valueOf(i12)));
            if (z11 != this.f3123k0) {
                q();
            }
            String str2 = x5.b.f14358b;
            if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
                bVar = x5.b.f14361e;
            } else {
                bVar = x5.b.f14360d;
            }
            z0 z0Var2 = this.f3127m0;
            String string = getContext().getString(R.string.character_counter_pattern, Integer.valueOf(i2), Integer.valueOf(this.f3121j0));
            bVar.getClass();
            a0.l lVar = x5.g.f14368a;
            if (string != null) {
                str = bVar.c(string).toString();
            }
            z0Var2.setText(str);
        }
        if (this.f3105b0 != null && z11 != this.f3123k0) {
            w(false, false);
            z();
            t();
        }
    }

    public final void q() {
        int i2;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        z0 z0Var = this.f3127m0;
        if (z0Var != null) {
            if (this.f3123k0) {
                i2 = this.f3129n0;
            } else {
                i2 = this.f3131o0;
            }
            n(z0Var, i2);
            if (!this.f3123k0 && (colorStateList2 = this.f3146w0) != null) {
                this.f3127m0.setTextColor(colorStateList2);
            }
            if (this.f3123k0 && (colorStateList = this.f3148x0) != null) {
                this.f3127m0.setTextColor(colorStateList);
            }
        }
    }

    public final void r() {
        Drawable textCursorDrawable;
        Drawable textCursorDrawable2;
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f3149y0;
        if (colorStateList2 == null) {
            Context context = getContext();
            TypedValue I = d.I(context, R.attr.colorControlActivated);
            if (I != null) {
                int i2 = I.resourceId;
                if (i2 != 0) {
                    colorStateList2 = g.z(context, i2);
                } else {
                    int i10 = I.data;
                    if (i10 != 0) {
                        colorStateList2 = ColorStateList.valueOf(i10);
                    }
                }
            }
            colorStateList2 = null;
        }
        EditText editText = this.f3105b0;
        if (editText != null) {
            textCursorDrawable = editText.getTextCursorDrawable();
            if (textCursorDrawable != null) {
                textCursorDrawable2 = this.f3105b0.getTextCursorDrawable();
                Drawable mutate = textCursorDrawable2.mutate();
                if ((o() || (this.f3127m0 != null && this.f3123k0)) && (colorStateList = this.f3150z0) != null) {
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

    public void setBoxBackgroundColor(int i2) {
        if (this.S0 != i2) {
            this.S0 = i2;
            this.f3122j1 = i2;
            this.f3126l1 = i2;
            this.f3128m1 = i2;
            c();
        }
    }

    public void setBoxBackgroundColorResource(int i2) {
        setBoxBackgroundColor(getContext().getColor(i2));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f3122j1 = defaultColor;
        this.S0 = defaultColor;
        this.f3124k1 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f3126l1 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        this.f3128m1 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
        c();
    }

    public void setBoxBackgroundMode(int i2) {
        if (i2 != this.M0) {
            this.M0 = i2;
            if (this.f3105b0 != null) {
                k();
            }
        }
    }

    public void setBoxCollapsedPaddingTop(int i2) {
        this.N0 = i2;
    }

    public void setBoxCornerFamily(int i2) {
        na.m f8 = this.J0.f();
        na.d dVar = this.J0.f10202e;
        f8.f10186a = w.h(i2);
        f8.f10190e = dVar;
        na.d dVar2 = this.J0.f10203f;
        f8.f10187b = w.h(i2);
        f8.f10191f = dVar2;
        na.d dVar3 = this.J0.f10205h;
        f8.f10189d = w.h(i2);
        f8.f10193h = dVar3;
        na.d dVar4 = this.J0.f10204g;
        f8.f10188c = w.h(i2);
        f8.f10192g = dVar4;
        this.J0 = f8.a();
        c();
    }

    public void setBoxStrokeColor(int i2) {
        if (this.f3118h1 != i2) {
            this.f3118h1 = i2;
            z();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f3114f1 = colorStateList.getDefaultColor();
            this.f3130n1 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f3116g1 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
            this.f3118h1 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        } else if (this.f3118h1 != colorStateList.getDefaultColor()) {
            this.f3118h1 = colorStateList.getDefaultColor();
        }
        z();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f3120i1 != colorStateList) {
            this.f3120i1 = colorStateList;
            z();
        }
    }

    public void setBoxStrokeWidth(int i2) {
        this.P0 = i2;
        z();
    }

    public void setBoxStrokeWidthFocused(int i2) {
        this.Q0 = i2;
        z();
    }

    public void setBoxStrokeWidthFocusedResource(int i2) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i2));
    }

    public void setBoxStrokeWidthResource(int i2) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i2));
    }

    public void setCounterEnabled(boolean z10) {
        if (this.f3119i0 != z10) {
            q qVar = this.f3117h0;
            Editable editable = null;
            if (z10) {
                z0 z0Var = new z0(getContext(), null);
                this.f3127m0 = z0Var;
                z0Var.setId(R.id.textinput_counter);
                Typeface typeface = this.W0;
                if (typeface != null) {
                    this.f3127m0.setTypeface(typeface);
                }
                this.f3127m0.setMaxLines(1);
                qVar.a(this.f3127m0, 2);
                ((ViewGroup.MarginLayoutParams) this.f3127m0.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(R.dimen.mtrl_textinput_counter_margin_start));
                q();
                if (this.f3127m0 != null) {
                    EditText editText = this.f3105b0;
                    if (editText != null) {
                        editable = editText.getText();
                    }
                    p(editable);
                }
            } else {
                qVar.g(this.f3127m0, 2);
                this.f3127m0 = null;
            }
            this.f3119i0 = z10;
        }
    }

    public void setCounterMaxLength(int i2) {
        Editable text;
        if (this.f3121j0 != i2) {
            if (i2 > 0) {
                this.f3121j0 = i2;
            } else {
                this.f3121j0 = -1;
            }
            if (this.f3119i0 && this.f3127m0 != null) {
                EditText editText = this.f3105b0;
                if (editText == null) {
                    text = null;
                } else {
                    text = editText.getText();
                }
                p(text);
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i2) {
        if (this.f3129n0 != i2) {
            this.f3129n0 = i2;
            q();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f3148x0 != colorStateList) {
            this.f3148x0 = colorStateList;
            q();
        }
    }

    public void setCounterTextAppearance(int i2) {
        if (this.f3131o0 != i2) {
            this.f3131o0 = i2;
            q();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f3146w0 != colorStateList) {
            this.f3146w0 = colorStateList;
            q();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.f3149y0 != colorStateList) {
            this.f3149y0 = colorStateList;
            r();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.f3150z0 != colorStateList) {
            this.f3150z0 = colorStateList;
            if (!o() && (this.f3127m0 == null || !this.f3123k0)) {
                return;
            }
            r();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f3110d1 = colorStateList;
        this.f3112e1 = colorStateList;
        if (this.f3105b0 != null) {
            w(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        m(this, z10);
        super.setEnabled(z10);
    }

    public void setEndIconActivated(boolean z10) {
        this.L.f12441d0.setActivated(z10);
    }

    public void setEndIconCheckable(boolean z10) {
        this.L.f12441d0.setCheckable(z10);
    }

    public void setEndIconContentDescription(int i2) {
        CharSequence charSequence;
        m mVar = this.L;
        if (i2 != 0) {
            charSequence = mVar.getResources().getText(i2);
        } else {
            charSequence = null;
        }
        CheckableImageButton checkableImageButton = mVar.f12441d0;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(int i2) {
        Drawable drawable;
        m mVar = this.L;
        if (i2 != 0) {
            drawable = w.p(mVar.getContext(), i2);
        } else {
            drawable = null;
        }
        TextInputLayout textInputLayout = mVar.A;
        CheckableImageButton checkableImageButton = mVar.f12441d0;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            p7.m.e(textInputLayout, checkableImageButton, mVar.f12445h0, mVar.f12446i0);
            p7.m.C(textInputLayout, checkableImageButton, mVar.f12445h0);
        }
    }

    public void setEndIconMinSize(int i2) {
        m mVar = this.L;
        if (i2 >= 0) {
            if (i2 != mVar.f12447j0) {
                mVar.f12447j0 = i2;
                CheckableImageButton checkableImageButton = mVar.f12441d0;
                checkableImageButton.setMinimumWidth(i2);
                checkableImageButton.setMinimumHeight(i2);
                CheckableImageButton checkableImageButton2 = mVar.L;
                checkableImageButton2.setMinimumWidth(i2);
                checkableImageButton2.setMinimumHeight(i2);
                return;
            }
            return;
        }
        mVar.getClass();
        a0.j.h("endIconSize cannot be less than 0");
    }

    public void setEndIconMode(int i2) {
        this.L.g(i2);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        m mVar = this.L;
        CheckableImageButton checkableImageButton = mVar.f12441d0;
        View.OnLongClickListener onLongClickListener = mVar.f12449l0;
        checkableImageButton.setOnClickListener(onClickListener);
        p7.m.E(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        m mVar = this.L;
        mVar.f12449l0 = onLongClickListener;
        CheckableImageButton checkableImageButton = mVar.f12441d0;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        p7.m.E(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        m mVar = this.L;
        mVar.f12448k0 = scaleType;
        mVar.f12441d0.setScaleType(scaleType);
        mVar.L.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        m mVar = this.L;
        if (mVar.f12445h0 != colorStateList) {
            mVar.f12445h0 = colorStateList;
            p7.m.e(mVar.A, mVar.f12441d0, colorStateList, mVar.f12446i0);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        m mVar = this.L;
        if (mVar.f12446i0 != mode) {
            mVar.f12446i0 = mode;
            p7.m.e(mVar.A, mVar.f12441d0, mVar.f12445h0, mode);
        }
    }

    public void setEndIconVisible(boolean z10) {
        this.L.h(z10);
    }

    public void setError(CharSequence charSequence) {
        q qVar = this.f3117h0;
        if (!qVar.f12481q) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            setErrorEnabled(true);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            qVar.c();
            qVar.f12480p = charSequence;
            qVar.f12482r.setText(charSequence);
            int i2 = qVar.f12478n;
            if (i2 != 1) {
                qVar.f12479o = 1;
            }
            qVar.i(i2, qVar.h(qVar.f12482r, charSequence), qVar.f12479o);
            return;
        }
        qVar.f();
    }

    public void setErrorAccessibilityLiveRegion(int i2) {
        q qVar = this.f3117h0;
        qVar.f12484t = i2;
        z0 z0Var = qVar.f12482r;
        if (z0Var != null) {
            z0Var.setAccessibilityLiveRegion(i2);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        q qVar = this.f3117h0;
        qVar.f12483s = charSequence;
        z0 z0Var = qVar.f12482r;
        if (z0Var != null) {
            z0Var.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z10) {
        q qVar = this.f3117h0;
        TextInputLayout textInputLayout = qVar.f12473h;
        if (qVar.f12481q == z10) {
            return;
        }
        qVar.c();
        if (z10) {
            z0 z0Var = new z0(qVar.f12472g, null);
            qVar.f12482r = z0Var;
            z0Var.setId(R.id.textinput_error);
            qVar.f12482r.setTextAlignment(5);
            Typeface typeface = qVar.B;
            if (typeface != null) {
                qVar.f12482r.setTypeface(typeface);
            }
            int i2 = qVar.f12485u;
            qVar.f12485u = i2;
            z0 z0Var2 = qVar.f12482r;
            if (z0Var2 != null) {
                qVar.f12473h.n(z0Var2, i2);
            }
            ColorStateList colorStateList = qVar.f12486v;
            qVar.f12486v = colorStateList;
            z0 z0Var3 = qVar.f12482r;
            if (z0Var3 != null && colorStateList != null) {
                z0Var3.setTextColor(colorStateList);
            }
            CharSequence charSequence = qVar.f12483s;
            qVar.f12483s = charSequence;
            z0 z0Var4 = qVar.f12482r;
            if (z0Var4 != null) {
                z0Var4.setContentDescription(charSequence);
            }
            int i10 = qVar.f12484t;
            qVar.f12484t = i10;
            z0 z0Var5 = qVar.f12482r;
            if (z0Var5 != null) {
                z0Var5.setAccessibilityLiveRegion(i10);
            }
            qVar.f12482r.setVisibility(4);
            qVar.a(qVar.f12482r, 0);
        } else {
            qVar.f();
            qVar.g(qVar.f12482r, 0);
            qVar.f12482r = null;
            textInputLayout.t();
            textInputLayout.z();
        }
        qVar.f12481q = z10;
    }

    public void setErrorIconDrawable(int i2) {
        Drawable drawable;
        m mVar = this.L;
        if (i2 != 0) {
            drawable = w.p(mVar.getContext(), i2);
        } else {
            drawable = null;
        }
        mVar.i(drawable);
        p7.m.C(mVar.A, mVar.L, mVar.R);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        m mVar = this.L;
        CheckableImageButton checkableImageButton = mVar.L;
        View.OnLongClickListener onLongClickListener = mVar.f12440c0;
        checkableImageButton.setOnClickListener(onClickListener);
        p7.m.E(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        m mVar = this.L;
        mVar.f12440c0 = onLongClickListener;
        CheckableImageButton checkableImageButton = mVar.L;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        p7.m.E(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        m mVar = this.L;
        if (mVar.R != colorStateList) {
            mVar.R = colorStateList;
            p7.m.e(mVar.A, mVar.L, colorStateList, mVar.f12439b0);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        m mVar = this.L;
        if (mVar.f12439b0 != mode) {
            mVar.f12439b0 = mode;
            p7.m.e(mVar.A, mVar.L, mVar.R, mode);
        }
    }

    public void setErrorTextAppearance(int i2) {
        q qVar = this.f3117h0;
        qVar.f12485u = i2;
        z0 z0Var = qVar.f12482r;
        if (z0Var != null) {
            qVar.f12473h.n(z0Var, i2);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        q qVar = this.f3117h0;
        qVar.f12486v = colorStateList;
        z0 z0Var = qVar.f12482r;
        if (z0Var != null && colorStateList != null) {
            z0Var.setTextColor(colorStateList);
        }
    }

    public void setExpandedHintEnabled(boolean z10) {
        if (this.f3137r1 != z10) {
            this.f3137r1 = z10;
            w(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        q qVar = this.f3117h0;
        if (isEmpty) {
            if (qVar.f12488x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!qVar.f12488x) {
            setHelperTextEnabled(true);
        }
        qVar.c();
        qVar.f12487w = charSequence;
        qVar.f12489y.setText(charSequence);
        int i2 = qVar.f12478n;
        if (i2 != 2) {
            qVar.f12479o = 2;
        }
        qVar.i(i2, qVar.h(qVar.f12489y, charSequence), qVar.f12479o);
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        q qVar = this.f3117h0;
        qVar.A = colorStateList;
        z0 z0Var = qVar.f12489y;
        if (z0Var != null && colorStateList != null) {
            z0Var.setTextColor(colorStateList);
        }
    }

    public void setHelperTextEnabled(boolean z10) {
        q qVar = this.f3117h0;
        TextInputLayout textInputLayout = qVar.f12473h;
        if (qVar.f12488x == z10) {
            return;
        }
        qVar.c();
        if (z10) {
            z0 z0Var = new z0(qVar.f12472g, null);
            qVar.f12489y = z0Var;
            z0Var.setId(R.id.textinput_helper_text);
            qVar.f12489y.setTextAlignment(5);
            Typeface typeface = qVar.B;
            if (typeface != null) {
                qVar.f12489y.setTypeface(typeface);
            }
            qVar.f12489y.setVisibility(4);
            qVar.f12489y.setAccessibilityLiveRegion(1);
            int i2 = qVar.f12490z;
            qVar.f12490z = i2;
            z0 z0Var2 = qVar.f12489y;
            if (z0Var2 != null) {
                z0Var2.setTextAppearance(i2);
            }
            ColorStateList colorStateList = qVar.A;
            qVar.A = colorStateList;
            z0 z0Var3 = qVar.f12489y;
            if (z0Var3 != null && colorStateList != null) {
                z0Var3.setTextColor(colorStateList);
            }
            qVar.a(qVar.f12489y, 1);
            qVar.f12489y.setAccessibilityDelegate(new p(qVar));
        } else {
            qVar.c();
            int i10 = qVar.f12478n;
            if (i10 == 2) {
                qVar.f12479o = 0;
            }
            qVar.i(i10, qVar.h(qVar.f12489y, ""), qVar.f12479o);
            qVar.g(qVar.f12489y, 1);
            qVar.f12489y = null;
            textInputLayout.t();
            textInputLayout.z();
        }
        qVar.f12488x = z10;
    }

    public void setHelperTextTextAppearance(int i2) {
        q qVar = this.f3117h0;
        qVar.f12490z = i2;
        z0 z0Var = qVar.f12489y;
        if (z0Var != null) {
            z0Var.setTextAppearance(i2);
        }
    }

    public void setHint(int i2) {
        CharSequence charSequence;
        if (i2 != 0) {
            charSequence = getResources().getText(i2);
        } else {
            charSequence = null;
        }
        setHint(charSequence);
    }

    public void setHintAnimationEnabled(boolean z10) {
        this.f3139s1 = z10;
    }

    public void setHintEnabled(boolean z10) {
        if (z10 != this.A0) {
            this.A0 = z10;
            if (!z10) {
                this.C0 = false;
                if (!TextUtils.isEmpty(this.B0) && TextUtils.isEmpty(this.f3105b0.getHint())) {
                    this.f3105b0.setHint(this.B0);
                }
                setHintInternal(null);
            } else {
                CharSequence hint = this.f3105b0.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.B0)) {
                        setHint(hint);
                    }
                    this.f3105b0.setHint((CharSequence) null);
                }
                this.C0 = true;
            }
            if (this.f3105b0 != null) {
                v();
            }
        }
    }

    public void setHintMaxLines(int i2) {
        b bVar = this.f3135q1;
        if (i2 != bVar.f6387f0) {
            bVar.f6387f0 = i2;
            bVar.j(false);
        }
        if (i2 != bVar.f6385e0) {
            bVar.f6385e0 = i2;
            bVar.j(false);
        }
        requestLayout();
    }

    public void setHintTextAppearance(int i2) {
        b bVar = this.f3135q1;
        TextInputLayout textInputLayout = bVar.f6376a;
        ka.d dVar = new ka.d(textInputLayout.getContext(), i2);
        ColorStateList colorStateList = dVar.f8126k;
        if (colorStateList != null) {
            bVar.f6396k = colorStateList;
        }
        float f8 = dVar.f8127l;
        if (f8 != 0.0f) {
            bVar.f6392i = f8;
        }
        ColorStateList colorStateList2 = dVar.f8116a;
        if (colorStateList2 != null) {
            bVar.V = colorStateList2;
        }
        bVar.T = dVar.f8121f;
        bVar.U = dVar.f8122g;
        bVar.S = dVar.f8123h;
        bVar.W = dVar.f8125j;
        ka.a aVar = bVar.f6411z;
        if (aVar != null) {
            aVar.f8109e0 = true;
        }
        t tVar = new t(12, bVar);
        dVar.a();
        bVar.f6411z = new ka.a(tVar, dVar.f8130p);
        dVar.b(textInputLayout.getContext(), bVar.f6411z);
        bVar.j(false);
        this.f3112e1 = bVar.f6396k;
        if (this.f3105b0 != null) {
            w(false, false);
            v();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f3112e1 != colorStateList) {
            if (this.f3110d1 == null) {
                b bVar = this.f3135q1;
                if (bVar.f6396k != colorStateList) {
                    bVar.f6396k = colorStateList;
                    bVar.j(false);
                }
            }
            this.f3112e1 = colorStateList;
            if (this.f3105b0 != null) {
                w(false, false);
            }
        }
    }

    public void setLengthCounter(x xVar) {
        this.f3125l0 = xVar;
    }

    public void setMaxEms(int i2) {
        this.f3111e0 = i2;
        EditText editText = this.f3105b0;
        if (editText != null && i2 != -1) {
            editText.setMaxEms(i2);
        }
    }

    public void setMaxWidth(int i2) {
        this.f3115g0 = i2;
        EditText editText = this.f3105b0;
        if (editText != null && i2 != -1) {
            editText.setMaxWidth(i2);
        }
    }

    public void setMaxWidthResource(int i2) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i2));
    }

    public void setMinEms(int i2) {
        this.f3109d0 = i2;
        EditText editText = this.f3105b0;
        if (editText != null && i2 != -1) {
            editText.setMinEms(i2);
        }
    }

    public void setMinWidth(int i2) {
        this.f3113f0 = i2;
        EditText editText = this.f3105b0;
        if (editText != null && i2 != -1) {
            editText.setMinWidth(i2);
        }
    }

    public void setMinWidthResource(int i2) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i2));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i2) {
        CharSequence charSequence;
        m mVar = this.L;
        if (i2 != 0) {
            charSequence = mVar.getResources().getText(i2);
        } else {
            charSequence = null;
        }
        mVar.f12441d0.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i2) {
        Drawable drawable;
        m mVar = this.L;
        if (i2 != 0) {
            drawable = w.p(mVar.getContext(), i2);
        } else {
            drawable = null;
        }
        mVar.f12441d0.setImageDrawable(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z10) {
        m mVar = this.L;
        if (z10 && mVar.f12443f0 != 1) {
            mVar.g(1);
        } else if (!z10) {
            mVar.g(0);
        } else {
            mVar.getClass();
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        m mVar = this.L;
        mVar.f12445h0 = colorStateList;
        p7.m.e(mVar.A, mVar.f12441d0, colorStateList, mVar.f12446i0);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        m mVar = this.L;
        mVar.f12446i0 = mode;
        p7.m.e(mVar.A, mVar.f12441d0, mVar.f12445h0, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        Editable editable = null;
        if (this.f3136r0 == null) {
            z0 z0Var = new z0(getContext(), null);
            this.f3136r0 = z0Var;
            z0Var.setId(R.id.textinput_placeholder);
            this.f3136r0.setImportantForAccessibility(1);
            this.f3136r0.setAccessibilityLiveRegion(1);
            h f8 = f();
            this.f3142u0 = f8;
            f8.B = 67L;
            this.f3144v0 = f();
            setPlaceholderTextAppearance(this.f3140t0);
            setPlaceholderTextColor(this.f3138s0);
            x0.o(this.f3136r0, new com.google.android.material.datepicker.h(4));
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f3134q0) {
                setPlaceholderTextEnabled(true);
            }
            this.p0 = charSequence;
        }
        EditText editText = this.f3105b0;
        if (editText != null) {
            editable = editText.getText();
        }
        x(editable);
    }

    public void setPlaceholderTextAppearance(int i2) {
        this.f3140t0 = i2;
        z0 z0Var = this.f3136r0;
        if (z0Var != null) {
            z0Var.setTextAppearance(i2);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f3138s0 != colorStateList) {
            this.f3138s0 = colorStateList;
            z0 z0Var = this.f3136r0;
            if (z0Var != null && colorStateList != null) {
                z0Var.setTextColor(colorStateList);
            }
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        CharSequence charSequence2;
        u uVar = this.B;
        uVar.getClass();
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        uVar.L = charSequence2;
        uVar.B.setText(charSequence);
        uVar.e();
    }

    public void setPrefixTextAppearance(int i2) {
        this.B.B.setTextAppearance(i2);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.B.B.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(n nVar) {
        j jVar = this.D0;
        if (jVar != null && jVar.B.f10144a != nVar) {
            this.J0 = nVar;
            c();
        }
    }

    public void setStartIconCheckable(boolean z10) {
        this.B.R.setCheckable(z10);
    }

    public void setStartIconContentDescription(int i2) {
        CharSequence charSequence;
        if (i2 != 0) {
            charSequence = getResources().getText(i2);
        } else {
            charSequence = null;
        }
        setStartIconContentDescription(charSequence);
    }

    public void setStartIconDrawable(int i2) {
        Drawable drawable;
        if (i2 != 0) {
            drawable = w.p(getContext(), i2);
        } else {
            drawable = null;
        }
        setStartIconDrawable(drawable);
    }

    public void setStartIconMinSize(int i2) {
        u uVar = this.B;
        if (i2 >= 0) {
            if (i2 != uVar.f12504d0) {
                uVar.f12504d0 = i2;
                CheckableImageButton checkableImageButton = uVar.R;
                checkableImageButton.setMinimumWidth(i2);
                checkableImageButton.setMinimumHeight(i2);
                return;
            }
            return;
        }
        uVar.getClass();
        a0.j.h("startIconSize cannot be less than 0");
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        u uVar = this.B;
        CheckableImageButton checkableImageButton = uVar.R;
        View.OnLongClickListener onLongClickListener = uVar.f12506f0;
        checkableImageButton.setOnClickListener(onClickListener);
        p7.m.E(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        u uVar = this.B;
        uVar.f12506f0 = onLongClickListener;
        CheckableImageButton checkableImageButton = uVar.R;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        p7.m.E(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        u uVar = this.B;
        uVar.f12505e0 = scaleType;
        uVar.R.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        u uVar = this.B;
        if (uVar.f12502b0 != colorStateList) {
            uVar.f12502b0 = colorStateList;
            p7.m.e(uVar.A, uVar.R, colorStateList, uVar.f12503c0);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        u uVar = this.B;
        if (uVar.f12503c0 != mode) {
            uVar.f12503c0 = mode;
            p7.m.e(uVar.A, uVar.R, uVar.f12502b0, mode);
        }
    }

    public void setStartIconVisible(boolean z10) {
        this.B.c(z10);
    }

    public void setSuffixText(CharSequence charSequence) {
        CharSequence charSequence2;
        m mVar = this.L;
        mVar.getClass();
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        mVar.f12450m0 = charSequence2;
        mVar.f12451n0.setText(charSequence);
        mVar.n();
    }

    public void setSuffixTextAppearance(int i2) {
        this.L.f12451n0.setTextAppearance(i2);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.L.f12451n0.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(qa.w wVar) {
        EditText editText = this.f3105b0;
        if (editText != null) {
            x0.o(editText, wVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.W0) {
            this.W0 = typeface;
            this.f3135q1.n(typeface);
            q qVar = this.f3117h0;
            if (typeface != qVar.B) {
                qVar.B = typeface;
                z0 z0Var = qVar.f12482r;
                if (z0Var != null) {
                    z0Var.setTypeface(typeface);
                }
                z0 z0Var2 = qVar.f12489y;
                if (z0Var2 != null) {
                    z0Var2.setTypeface(typeface);
                }
            }
            z0 z0Var3 = this.f3127m0;
            if (z0Var3 != null) {
                z0Var3.setTypeface(typeface);
            }
        }
    }

    public final void t() {
        Drawable background;
        z0 z0Var;
        EditText editText = this.f3105b0;
        if (editText != null && this.M0 == 0 && (background = editText.getBackground()) != null) {
            int[] iArr = l1.f11952a;
            Drawable mutate = background.mutate();
            if (o()) {
                mutate.setColorFilter(r.c(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
            } else if (this.f3123k0 && (z0Var = this.f3127m0) != null) {
                mutate.setColorFilter(r.c(z0Var.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
            } else {
                mutate.clearColorFilter();
                this.f3105b0.refreshDrawableState();
            }
        }
    }

    public final void u() {
        EditText editText = this.f3105b0;
        if (editText != null && this.D0 != null) {
            if ((this.G0 || editText.getBackground() == null) && this.M0 != 0) {
                this.f3105b0.setBackground(getEditTextBoxBackground());
                this.G0 = true;
            }
        }
    }

    public final void v() {
        if (this.M0 != 1) {
            FrameLayout frameLayout = this.A;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int e6 = e();
            if (e6 != layoutParams.topMargin) {
                layoutParams.topMargin = e6;
                frameLayout.requestLayout();
            }
        }
    }

    public final void w(boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        ColorStateList colorStateList;
        z0 z0Var;
        ColorStateList colorStateList2;
        boolean isEnabled = isEnabled();
        EditText editText = this.f3105b0;
        if (editText != null && !TextUtils.isEmpty(editText.getText())) {
            z12 = true;
        } else {
            z12 = false;
        }
        EditText editText2 = this.f3105b0;
        if (editText2 != null && editText2.hasFocus()) {
            z13 = true;
        } else {
            z13 = false;
        }
        ColorStateList colorStateList3 = this.f3110d1;
        b bVar = this.f3135q1;
        if (colorStateList3 != null) {
            bVar.k(colorStateList3);
        }
        Editable editable = null;
        if (!isEnabled) {
            ColorStateList colorStateList4 = this.f3110d1;
            int i2 = this.f3130n1;
            if (colorStateList4 != null) {
                i2 = colorStateList4.getColorForState(new int[]{-16842910}, i2);
            }
            bVar.k(ColorStateList.valueOf(i2));
        } else if (o()) {
            z0 z0Var2 = this.f3117h0.f12482r;
            if (z0Var2 != null) {
                colorStateList2 = z0Var2.getTextColors();
            } else {
                colorStateList2 = null;
            }
            bVar.k(colorStateList2);
        } else if (this.f3123k0 && (z0Var = this.f3127m0) != null) {
            bVar.k(z0Var.getTextColors());
        } else if (z13 && (colorStateList = this.f3112e1) != null && bVar.f6396k != colorStateList) {
            bVar.f6396k = colorStateList;
            bVar.j(false);
        }
        m mVar = this.L;
        u uVar = this.B;
        if (!z12 && this.f3137r1 && (!isEnabled() || !z13)) {
            if (z11 || !this.f3133p1) {
                ValueAnimator valueAnimator = this.f3141t1;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f3141t1.cancel();
                }
                if (z10 && this.f3139s1) {
                    b(0.0f);
                } else {
                    bVar.m(0.0f);
                }
                if (g() && !((qa.f) this.D0).A0.f12423r.isEmpty() && g()) {
                    ((qa.f) this.D0).t(0.0f, 0.0f, 0.0f, 0.0f);
                }
                this.f3133p1 = true;
                z0 z0Var3 = this.f3136r0;
                if (z0Var3 != null && this.f3134q0) {
                    z0Var3.setText((CharSequence) null);
                    c8.x.a(this.A, this.f3144v0);
                    this.f3136r0.setVisibility(4);
                }
                uVar.f12507g0 = true;
                uVar.e();
                mVar.f12452o0 = true;
                mVar.n();
            }
        } else if (!z11 && !this.f3133p1) {
        } else {
            ValueAnimator valueAnimator2 = this.f3141t1;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f3141t1.cancel();
            }
            if (z10 && this.f3139s1) {
                b(1.0f);
            } else {
                bVar.m(1.0f);
            }
            this.f3133p1 = false;
            if (g()) {
                l();
            }
            EditText editText3 = this.f3105b0;
            if (editText3 != null) {
                editable = editText3.getText();
            }
            x(editable);
            uVar.f12507g0 = false;
            uVar.e();
            mVar.f12452o0 = false;
            mVar.n();
        }
    }

    public final void x(Editable editable) {
        int i2;
        ((o) this.f3125l0).getClass();
        if (editable != null) {
            i2 = editable.length();
        } else {
            i2 = 0;
        }
        FrameLayout frameLayout = this.A;
        if (i2 == 0 && !this.f3133p1) {
            if (this.f3136r0 != null && this.f3134q0 && !TextUtils.isEmpty(this.p0)) {
                this.f3136r0.setText(this.p0);
                c8.x.a(frameLayout, this.f3142u0);
                this.f3136r0.setVisibility(0);
                this.f3136r0.bringToFront();
                return;
            }
            return;
        }
        z0 z0Var = this.f3136r0;
        if (z0Var != null && this.f3134q0) {
            z0Var.setText((CharSequence) null);
            c8.x.a(frameLayout, this.f3144v0);
            this.f3136r0.setVisibility(4);
        }
    }

    public final void y(boolean z10, boolean z11) {
        int defaultColor = this.f3120i1.getDefaultColor();
        int colorForState = this.f3120i1.getColorForState(new int[]{16843623, 16842910}, defaultColor);
        int colorForState2 = this.f3120i1.getColorForState(new int[]{16843518, 16842910}, defaultColor);
        if (z10) {
            this.R0 = colorForState2;
        } else if (z11) {
            this.R0 = colorForState;
        } else {
            this.R0 = defaultColor;
        }
    }

    public final void z() {
        boolean z10;
        z0 z0Var;
        EditText editText;
        EditText editText2;
        if (this.D0 != null && this.M0 != 0) {
            boolean z11 = false;
            if (!isFocused() && ((editText2 = this.f3105b0) == null || !editText2.hasFocus())) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (isHovered() || ((editText = this.f3105b0) != null && editText.isHovered())) {
                z11 = true;
            }
            if (!isEnabled()) {
                this.R0 = this.f3130n1;
            } else if (o()) {
                if (this.f3120i1 != null) {
                    y(z10, z11);
                } else {
                    this.R0 = getErrorCurrentTextColors();
                }
            } else if (this.f3123k0 && (z0Var = this.f3127m0) != null) {
                if (this.f3120i1 != null) {
                    y(z10, z11);
                } else {
                    this.R0 = z0Var.getCurrentTextColor();
                }
            } else if (z10) {
                this.R0 = this.f3118h1;
            } else if (z11) {
                this.R0 = this.f3116g1;
            } else {
                this.R0 = this.f3114f1;
            }
            if (Build.VERSION.SDK_INT >= 29) {
                r();
            }
            m mVar = this.L;
            TextInputLayout textInputLayout = mVar.A;
            CheckableImageButton checkableImageButton = mVar.f12441d0;
            TextInputLayout textInputLayout2 = mVar.A;
            mVar.l();
            p7.m.C(textInputLayout2, mVar.L, mVar.R);
            p7.m.C(textInputLayout2, checkableImageButton, mVar.f12445h0);
            if (mVar.b() instanceof qa.j) {
                if (textInputLayout.o() && checkableImageButton.getDrawable() != null) {
                    Drawable mutate = checkableImageButton.getDrawable().mutate();
                    mutate.setTint(textInputLayout.getErrorCurrentTextColors());
                    checkableImageButton.setImageDrawable(mutate);
                } else {
                    p7.m.e(textInputLayout, checkableImageButton, mVar.f12445h0, mVar.f12446i0);
                }
            }
            u uVar = this.B;
            p7.m.C(uVar.A, uVar.R, uVar.f12502b0);
            if (this.M0 == 2) {
                int i2 = this.O0;
                if (z10 && isEnabled()) {
                    this.O0 = this.Q0;
                } else {
                    this.O0 = this.P0;
                }
                if (this.O0 != i2 && g() && !this.f3133p1) {
                    if (g()) {
                        ((qa.f) this.D0).t(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    l();
                }
            }
            if (this.M0 == 1) {
                if (!isEnabled()) {
                    this.S0 = this.f3124k1;
                } else if (z11 && !z10) {
                    this.S0 = this.f3128m1;
                } else if (z10) {
                    this.S0 = this.f3126l1;
                } else {
                    this.S0 = this.f3122j1;
                }
            }
            c();
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.A0) {
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
        this.L.f12441d0.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.L.f12441d0.setImageDrawable(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.L.f12441d0;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.L.i(drawable);
    }

    public void setEndIconDrawable(Drawable drawable) {
        m mVar = this.L;
        TextInputLayout textInputLayout = mVar.A;
        CheckableImageButton checkableImageButton = mVar.f12441d0;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            p7.m.e(textInputLayout, checkableImageButton, mVar.f12445h0, mVar.f12446i0);
            p7.m.C(textInputLayout, checkableImageButton, mVar.f12445h0);
        }
    }
}
