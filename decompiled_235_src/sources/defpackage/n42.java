package defpackage;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.stormds.emulator.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: n42  reason: default package */
/* loaded from: classes.dex */
public final class n42 extends LinearLayout {
    public final TextInputLayout A;
    public final FrameLayout B;
    public final CheckableImageButton L;
    public ColorStateList R;
    public PorterDuff.Mode d0;
    public View.OnLongClickListener e0;
    public final CheckableImageButton f0;
    public final m42 g0;
    public int h0;
    public final LinkedHashSet i0;
    public ColorStateList j0;
    public PorterDuff.Mode k0;
    public int l0;
    public ImageView.ScaleType m0;
    public View.OnLongClickListener n0;
    public CharSequence o0;
    public final qs p0;
    public boolean q0;
    public EditText r0;
    public final AccessibilityManager s0;
    public AccessibilityManager.TouchExplorationStateChangeListener t0;
    public final k42 u0;

    public n42(TextInputLayout textInputLayout, m44 m44Var) {
        super(textInputLayout.getContext());
        CharSequence text;
        this.h0 = 0;
        this.i0 = new LinkedHashSet();
        this.u0 = new k42(this);
        l42 l42Var = new l42(this);
        this.s0 = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.A = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.B = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater from = LayoutInflater.from(getContext());
        CheckableImageButton a = a(this, from, R.id.text_input_error_icon);
        this.L = a;
        CheckableImageButton a2 = a(frameLayout, from, R.id.text_input_end_icon);
        this.f0 = a2;
        this.g0 = new m42(this, m44Var);
        qs qsVar = new qs(getContext(), null);
        this.p0 = qsVar;
        TypedArray typedArray = (TypedArray) m44Var.L;
        if (typedArray.hasValue(38)) {
            this.R = np2.R(getContext(), m44Var, 38);
        }
        if (typedArray.hasValue(39)) {
            this.d0 = qo2.E(typedArray.getInt(39, -1), null);
        }
        if (typedArray.hasValue(37)) {
            i(m44Var.k(37));
        }
        a.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        a.setImportantForAccessibility(2);
        a.setClickable(false);
        a.setPressable(false);
        a.setCheckable(false);
        a.setFocusable(false);
        if (!typedArray.hasValue(54)) {
            if (typedArray.hasValue(32)) {
                this.j0 = np2.R(getContext(), m44Var, 32);
            }
            if (typedArray.hasValue(33)) {
                this.k0 = qo2.E(typedArray.getInt(33, -1), null);
            }
        }
        if (typedArray.hasValue(30)) {
            g(typedArray.getInt(30, 0));
            if (typedArray.hasValue(27) && a2.getContentDescription() != (text = typedArray.getText(27))) {
                a2.setContentDescription(text);
            }
            a2.setCheckable(typedArray.getBoolean(26, true));
        } else if (typedArray.hasValue(54)) {
            if (typedArray.hasValue(55)) {
                this.j0 = np2.R(getContext(), m44Var, 55);
            }
            if (typedArray.hasValue(56)) {
                this.k0 = qo2.E(typedArray.getInt(56, -1), null);
            }
            g(typedArray.getBoolean(54, false) ? 1 : 0);
            CharSequence text2 = typedArray.getText(52);
            if (a2.getContentDescription() != text2) {
                a2.setContentDescription(text2);
            }
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(29, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize >= 0) {
            if (dimensionPixelSize != this.l0) {
                this.l0 = dimensionPixelSize;
                a2.setMinimumWidth(dimensionPixelSize);
                a2.setMinimumHeight(dimensionPixelSize);
                a.setMinimumWidth(dimensionPixelSize);
                a.setMinimumHeight(dimensionPixelSize);
            }
            if (typedArray.hasValue(31)) {
                ImageView.ScaleType r = kj2.r(typedArray.getInt(31, -1));
                this.m0 = r;
                a2.setScaleType(r);
                a.setScaleType(r);
            }
            qsVar.setVisibility(8);
            qsVar.setId(R.id.textinput_suffix_text);
            qsVar.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
            qsVar.setAccessibilityLiveRegion(1);
            qsVar.setTextAppearance(typedArray.getResourceId(73, 0));
            if (typedArray.hasValue(74)) {
                qsVar.setTextColor(m44Var.g(74));
            }
            CharSequence text3 = typedArray.getText(72);
            this.o0 = TextUtils.isEmpty(text3) ? null : text3;
            qsVar.setText(text3);
            n();
            frameLayout.addView(a2);
            addView(qsVar);
            addView(frameLayout);
            addView(a);
            textInputLayout.b1.add(l42Var);
            if (textInputLayout.d0 != null) {
                l42Var.a(textInputLayout);
            }
            addOnAttachStateChangeListener(new wh(this, 2));
            return;
        }
        i.h("endIconSize cannot be less than 0");
        throw null;
    }

    public final CheckableImageButton a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i);
        if (np2.W(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    public final o42 b() {
        o42 h81Var;
        int i = this.h0;
        m42 m42Var = this.g0;
        SparseArray sparseArray = (SparseArray) m42Var.d;
        o42 o42Var = (o42) sparseArray.get(i);
        if (o42Var == null) {
            n42 n42Var = (n42) m42Var.e;
            if (i != -1) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                h81Var = new vp1(n42Var);
                            } else {
                                i.h(lb1.g(i, "Invalid end icon mode: "));
                                return null;
                            }
                        } else {
                            h81Var = new lr0(n42Var);
                        }
                    } else {
                        h81Var = new it4(n42Var, m42Var.c);
                    }
                } else {
                    h81Var = new h81(n42Var, 1);
                }
            } else {
                h81Var = new h81(n42Var, 0);
            }
            sparseArray.append(i, h81Var);
            return h81Var;
        }
        return o42Var;
    }

    public final int c() {
        int marginStart;
        if (!d() && !e()) {
            marginStart = 0;
        } else {
            CheckableImageButton checkableImageButton = this.f0;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        }
        return this.p0.getPaddingEnd() + getPaddingEnd() + marginStart;
    }

    public final boolean d() {
        if (this.B.getVisibility() == 0 && this.f0.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        if (this.L.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final void f(boolean z) {
        boolean z2;
        boolean isActivated;
        boolean z3;
        o42 b = b();
        boolean j = b.j();
        CheckableImageButton checkableImageButton = this.f0;
        boolean z4 = true;
        if (j && (z3 = checkableImageButton.R) != b.k()) {
            checkableImageButton.setChecked(!z3);
            z2 = true;
        } else {
            z2 = false;
        }
        if ((b instanceof vp1) && (isActivated = checkableImageButton.isActivated()) != ((vp1) b).l) {
            checkableImageButton.setActivated(!isActivated);
        } else {
            z4 = z2;
        }
        if (!z && !z4) {
            return;
        }
        kj2.V(this.A, checkableImageButton, this.j0);
    }

    public final void g(int i) {
        boolean z;
        Drawable drawable;
        if (this.h0 == i) {
            return;
        }
        o42 b = b();
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = this.t0;
        AccessibilityManager accessibilityManager = this.s0;
        if (touchExplorationStateChangeListener != null && accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
        }
        CharSequence charSequence = null;
        this.t0 = null;
        b.r();
        this.h0 = i;
        Iterator it = this.i0.iterator();
        if (!it.hasNext()) {
            if (i != 0) {
                z = true;
            } else {
                z = false;
            }
            h(z);
            o42 b2 = b();
            int i2 = this.g0.b;
            if (i2 == 0) {
                i2 = b2.d();
            }
            if (i2 != 0) {
                drawable = hf.S(getContext(), i2);
            } else {
                drawable = null;
            }
            CheckableImageButton checkableImageButton = this.f0;
            checkableImageButton.setImageDrawable(drawable);
            TextInputLayout textInputLayout = this.A;
            if (drawable != null) {
                kj2.p(textInputLayout, checkableImageButton, this.j0, this.k0);
                kj2.V(textInputLayout, checkableImageButton, this.j0);
            }
            int c = b2.c();
            if (c != 0) {
                charSequence = getResources().getText(c);
            }
            if (checkableImageButton.getContentDescription() != charSequence) {
                checkableImageButton.setContentDescription(charSequence);
            }
            checkableImageButton.setCheckable(b2.j());
            if (b2.i(textInputLayout.getBoxBackgroundMode())) {
                b2.q();
                AccessibilityManager.TouchExplorationStateChangeListener h = b2.h();
                this.t0 = h;
                if (h != null && accessibilityManager != null && isAttachedToWindow()) {
                    accessibilityManager.addTouchExplorationStateChangeListener(this.t0);
                }
                View.OnClickListener f = b2.f();
                View.OnLongClickListener onLongClickListener = this.n0;
                checkableImageButton.setOnClickListener(f);
                kj2.Y(checkableImageButton, onLongClickListener);
                EditText editText = this.r0;
                if (editText != null) {
                    b2.l(editText);
                    j(b2);
                }
                kj2.p(textInputLayout, checkableImageButton, this.j0, this.k0);
                f(true);
                return;
            }
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i);
        }
        throw i61.j(it);
    }

    public final void h(boolean z) {
        int i;
        if (d() != z) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            this.f0.setVisibility(i);
            k();
            m();
            this.A.s();
        }
    }

    public final void i(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.L;
        checkableImageButton.setImageDrawable(drawable);
        l();
        kj2.p(this.A, checkableImageButton, this.R, this.d0);
    }

    public final void j(o42 o42Var) {
        if (this.r0 != null) {
            if (o42Var.e() != null) {
                this.r0.setOnFocusChangeListener(o42Var.e());
            }
            if (o42Var.g() != null) {
                this.f0.setOnFocusChangeListener(o42Var.g());
            }
        }
    }

    public final void k() {
        int i;
        boolean z;
        int i2 = 8;
        if (this.f0.getVisibility() == 0 && !e()) {
            i = 0;
        } else {
            i = 8;
        }
        this.B.setVisibility(i);
        if (this.o0 != null && !this.q0) {
            z = false;
        } else {
            z = true;
        }
        if (d() || e() || !z) {
            i2 = 0;
        }
        setVisibility(i2);
    }

    public final void l() {
        int i;
        CheckableImageButton checkableImageButton = this.L;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.A;
        if (drawable != null && textInputLayout.j0.q && textInputLayout.o()) {
            i = 0;
        } else {
            i = 8;
        }
        checkableImageButton.setVisibility(i);
        k();
        m();
        if (this.h0 != 0) {
            return;
        }
        textInputLayout.s();
    }

    public final void m() {
        int i;
        TextInputLayout textInputLayout = this.A;
        if (textInputLayout.d0 == null) {
            return;
        }
        if (!d() && !e()) {
            i = textInputLayout.d0.getPaddingEnd();
        } else {
            i = 0;
        }
        this.p0.setPaddingRelative(getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), textInputLayout.d0.getPaddingTop(), i, textInputLayout.d0.getPaddingBottom());
    }

    public final void n() {
        int i;
        qs qsVar = this.p0;
        int visibility = qsVar.getVisibility();
        boolean z = false;
        if (this.o0 != null && !this.q0) {
            i = 0;
        } else {
            i = 8;
        }
        if (visibility != i) {
            o42 b = b();
            if (i == 0) {
                z = true;
            }
            b.o(z);
        }
        k();
        qsVar.setVisibility(i);
        this.A.s();
    }
}
