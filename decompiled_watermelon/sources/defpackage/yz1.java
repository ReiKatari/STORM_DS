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
import java.util.Iterator;
import java.util.LinkedHashSet;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: yz1  reason: default package */
/* loaded from: classes.dex */
public final class yz1 extends LinearLayout {
    public final TextInputLayout A;
    public final FrameLayout B;
    public final CheckableImageButton L;
    public ColorStateList R;
    public PorterDuff.Mode c0;
    public View.OnLongClickListener d0;
    public final CheckableImageButton e0;
    public final xz1 f0;
    public int g0;
    public final LinkedHashSet h0;
    public ColorStateList i0;
    public PorterDuff.Mode j0;
    public int k0;
    public ImageView.ScaleType l0;
    public View.OnLongClickListener m0;
    public CharSequence n0;
    public final ds o0;
    public boolean p0;
    public EditText q0;
    public final AccessibilityManager r0;
    public AccessibilityManager.TouchExplorationStateChangeListener s0;
    public final vz1 t0;

    public yz1(TextInputLayout textInputLayout, n85 n85Var) {
        super(textInputLayout.getContext());
        CharSequence text;
        this.g0 = 0;
        this.h0 = new LinkedHashSet();
        this.t0 = new vz1(this);
        wz1 wz1Var = new wz1(this);
        this.r0 = (AccessibilityManager) getContext().getSystemService("accessibility");
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
        this.e0 = a2;
        this.f0 = new xz1(this, n85Var);
        ds dsVar = new ds(getContext(), null);
        this.o0 = dsVar;
        TypedArray typedArray = (TypedArray) n85Var.L;
        if (typedArray.hasValue(38)) {
            this.R = nk2.B(getContext(), n85Var, 38);
        }
        if (typedArray.hasValue(39)) {
            this.c0 = ln2.M(typedArray.getInt(39, -1), null);
        }
        if (typedArray.hasValue(37)) {
            i(n85Var.f(37));
        }
        a.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        a.setImportantForAccessibility(2);
        a.setClickable(false);
        a.setPressable(false);
        a.setCheckable(false);
        a.setFocusable(false);
        if (!typedArray.hasValue(54)) {
            if (typedArray.hasValue(32)) {
                this.i0 = nk2.B(getContext(), n85Var, 32);
            }
            if (typedArray.hasValue(33)) {
                this.j0 = ln2.M(typedArray.getInt(33, -1), null);
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
                this.i0 = nk2.B(getContext(), n85Var, 55);
            }
            if (typedArray.hasValue(56)) {
                this.j0 = ln2.M(typedArray.getInt(56, -1), null);
            }
            g(typedArray.getBoolean(54, false) ? 1 : 0);
            CharSequence text2 = typedArray.getText(52);
            if (a2.getContentDescription() != text2) {
                a2.setContentDescription(text2);
            }
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(29, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize >= 0) {
            if (dimensionPixelSize != this.k0) {
                this.k0 = dimensionPixelSize;
                a2.setMinimumWidth(dimensionPixelSize);
                a2.setMinimumHeight(dimensionPixelSize);
                a.setMinimumWidth(dimensionPixelSize);
                a.setMinimumHeight(dimensionPixelSize);
            }
            if (typedArray.hasValue(31)) {
                ImageView.ScaleType m = ep2.m(typedArray.getInt(31, -1));
                this.l0 = m;
                a2.setScaleType(m);
                a.setScaleType(m);
            }
            dsVar.setVisibility(8);
            dsVar.setId(R.id.textinput_suffix_text);
            dsVar.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
            dsVar.setAccessibilityLiveRegion(1);
            dsVar.setTextAppearance(typedArray.getResourceId(73, 0));
            if (typedArray.hasValue(74)) {
                dsVar.setTextColor(n85Var.e(74));
            }
            CharSequence text3 = typedArray.getText(72);
            this.n0 = TextUtils.isEmpty(text3) ? null : text3;
            dsVar.setText(text3);
            n();
            frameLayout.addView(a2);
            addView(dsVar);
            addView(frameLayout);
            addView(a);
            textInputLayout.a1.add(wz1Var);
            if (textInputLayout.c0 != null) {
                wz1Var.a(textInputLayout);
            }
            addOnAttachStateChangeListener(new kh(2, this));
            return;
        }
        i.i("endIconSize cannot be less than 0");
        throw null;
    }

    public final CheckableImageButton a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i);
        if (nk2.K(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    public final zz1 b() {
        zz1 x41Var;
        int i = this.g0;
        xz1 xz1Var = this.f0;
        SparseArray sparseArray = (SparseArray) xz1Var.d;
        zz1 zz1Var = (zz1) sparseArray.get(i);
        if (zz1Var == null) {
            yz1 yz1Var = (yz1) xz1Var.e;
            if (i != -1) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                x41Var = new ol1(yz1Var);
                            } else {
                                i.i(wh1.g(i, "Invalid end icon mode: "));
                                return null;
                            }
                        } else {
                            x41Var = new bp0(yz1Var);
                        }
                    } else {
                        x41Var = new gk4(yz1Var, xz1Var.c);
                    }
                } else {
                    x41Var = new x41(yz1Var, 1);
                }
            } else {
                x41Var = new x41(yz1Var, 0);
            }
            sparseArray.append(i, x41Var);
            return x41Var;
        }
        return zz1Var;
    }

    public final int c() {
        int marginStart;
        if (!d() && !e()) {
            marginStart = 0;
        } else {
            CheckableImageButton checkableImageButton = this.e0;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        }
        return this.o0.getPaddingEnd() + getPaddingEnd() + marginStart;
    }

    public final boolean d() {
        if (this.B.getVisibility() == 0 && this.e0.getVisibility() == 0) {
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
        zz1 b = b();
        boolean j = b.j();
        CheckableImageButton checkableImageButton = this.e0;
        boolean z4 = true;
        if (j && (z3 = checkableImageButton.R) != b.k()) {
            checkableImageButton.setChecked(!z3);
            z2 = true;
        } else {
            z2 = false;
        }
        if ((b instanceof ol1) && (isActivated = checkableImageButton.isActivated()) != ((ol1) b).l) {
            checkableImageButton.setActivated(!isActivated);
        } else {
            z4 = z2;
        }
        if (!z && !z4) {
            return;
        }
        ep2.D(this.A, checkableImageButton, this.i0);
    }

    public final void g(int i) {
        boolean z;
        Drawable drawable;
        if (this.g0 == i) {
            return;
        }
        zz1 b = b();
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = this.s0;
        AccessibilityManager accessibilityManager = this.r0;
        if (touchExplorationStateChangeListener != null && accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
        }
        CharSequence charSequence = null;
        this.s0 = null;
        b.r();
        this.g0 = i;
        Iterator it = this.h0.iterator();
        if (!it.hasNext()) {
            if (i != 0) {
                z = true;
            } else {
                z = false;
            }
            h(z);
            zz1 b2 = b();
            int i2 = this.f0.b;
            if (i2 == 0) {
                i2 = b2.d();
            }
            if (i2 != 0) {
                drawable = l07.M(getContext(), i2);
            } else {
                drawable = null;
            }
            CheckableImageButton checkableImageButton = this.e0;
            checkableImageButton.setImageDrawable(drawable);
            TextInputLayout textInputLayout = this.A;
            if (drawable != null) {
                ep2.i(textInputLayout, checkableImageButton, this.i0, this.j0);
                ep2.D(textInputLayout, checkableImageButton, this.i0);
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
                this.s0 = h;
                if (h != null && accessibilityManager != null && isAttachedToWindow()) {
                    accessibilityManager.addTouchExplorationStateChangeListener(this.s0);
                }
                View.OnClickListener f = b2.f();
                View.OnLongClickListener onLongClickListener = this.m0;
                checkableImageButton.setOnClickListener(f);
                ep2.G(checkableImageButton, onLongClickListener);
                EditText editText = this.q0;
                if (editText != null) {
                    b2.l(editText);
                    j(b2);
                }
                ep2.i(textInputLayout, checkableImageButton, this.i0, this.j0);
                f(true);
                return;
            }
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i);
        }
        throw b31.m(it);
    }

    public final void h(boolean z) {
        int i;
        if (d() != z) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            this.e0.setVisibility(i);
            k();
            m();
            this.A.s();
        }
    }

    public final void i(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.L;
        checkableImageButton.setImageDrawable(drawable);
        l();
        ep2.i(this.A, checkableImageButton, this.R, this.c0);
    }

    public final void j(zz1 zz1Var) {
        if (this.q0 != null) {
            if (zz1Var.e() != null) {
                this.q0.setOnFocusChangeListener(zz1Var.e());
            }
            if (zz1Var.g() != null) {
                this.e0.setOnFocusChangeListener(zz1Var.g());
            }
        }
    }

    public final void k() {
        int i;
        boolean z;
        int i2 = 8;
        if (this.e0.getVisibility() == 0 && !e()) {
            i = 0;
        } else {
            i = 8;
        }
        this.B.setVisibility(i);
        if (this.n0 != null && !this.p0) {
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
        if (drawable != null && textInputLayout.i0.q && textInputLayout.o()) {
            i = 0;
        } else {
            i = 8;
        }
        checkableImageButton.setVisibility(i);
        k();
        m();
        if (this.g0 != 0) {
            return;
        }
        textInputLayout.s();
    }

    public final void m() {
        int i;
        TextInputLayout textInputLayout = this.A;
        if (textInputLayout.c0 == null) {
            return;
        }
        if (!d() && !e()) {
            i = textInputLayout.c0.getPaddingEnd();
        } else {
            i = 0;
        }
        this.o0.setPaddingRelative(getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), textInputLayout.c0.getPaddingTop(), i, textInputLayout.c0.getPaddingBottom());
    }

    public final void n() {
        int i;
        ds dsVar = this.o0;
        int visibility = dsVar.getVisibility();
        boolean z = false;
        if (this.n0 != null && !this.p0) {
            i = 0;
        } else {
            i = 8;
        }
        if (visibility != i) {
            zz1 b = b();
            if (i == 0) {
                z = true;
            }
            b.o(z);
        }
        k();
        dsVar.setVisibility(i);
        this.A.s();
    }
}
