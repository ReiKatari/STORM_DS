package qa;

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
import b4.v2;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
import me.magnum.melonds.R;
import p1.c1;
import q.z0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class m extends LinearLayout {
    public final TextInputLayout A;
    public final FrameLayout B;
    public final CheckableImageButton L;
    public ColorStateList R;

    /* renamed from: b0  reason: collision with root package name */
    public PorterDuff.Mode f12439b0;

    /* renamed from: c0  reason: collision with root package name */
    public View.OnLongClickListener f12440c0;

    /* renamed from: d0  reason: collision with root package name */
    public final CheckableImageButton f12441d0;

    /* renamed from: e0  reason: collision with root package name */
    public final dk.a f12442e0;

    /* renamed from: f0  reason: collision with root package name */
    public int f12443f0;

    /* renamed from: g0  reason: collision with root package name */
    public final LinkedHashSet f12444g0;

    /* renamed from: h0  reason: collision with root package name */
    public ColorStateList f12445h0;

    /* renamed from: i0  reason: collision with root package name */
    public PorterDuff.Mode f12446i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f12447j0;

    /* renamed from: k0  reason: collision with root package name */
    public ImageView.ScaleType f12448k0;

    /* renamed from: l0  reason: collision with root package name */
    public View.OnLongClickListener f12449l0;

    /* renamed from: m0  reason: collision with root package name */
    public CharSequence f12450m0;

    /* renamed from: n0  reason: collision with root package name */
    public final z0 f12451n0;

    /* renamed from: o0  reason: collision with root package name */
    public boolean f12452o0;
    public EditText p0;

    /* renamed from: q0  reason: collision with root package name */
    public final AccessibilityManager f12453q0;

    /* renamed from: r0  reason: collision with root package name */
    public AccessibilityManager.TouchExplorationStateChangeListener f12454r0;

    /* renamed from: s0  reason: collision with root package name */
    public final k f12455s0;

    public m(TextInputLayout textInputLayout, c1 c1Var) {
        super(textInputLayout.getContext());
        CharSequence text;
        this.f12443f0 = 0;
        this.f12444g0 = new LinkedHashSet();
        this.f12455s0 = new k(this);
        l lVar = new l(this);
        this.f12453q0 = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.A = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.B = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater from = LayoutInflater.from(getContext());
        CheckableImageButton a10 = a(this, from, R.id.text_input_error_icon);
        this.L = a10;
        CheckableImageButton a11 = a(frameLayout, from, R.id.text_input_end_icon);
        this.f12441d0 = a11;
        this.f12442e0 = new dk.a(this, c1Var);
        z0 z0Var = new z0(getContext(), null);
        this.f12451n0 = z0Var;
        TypedArray typedArray = (TypedArray) c1Var.B;
        if (typedArray.hasValue(38)) {
            this.R = k7.w.n(getContext(), c1Var, 38);
        }
        if (typedArray.hasValue(39)) {
            this.f12439b0 = ha.i.f(typedArray.getInt(39, -1), null);
        }
        if (typedArray.hasValue(37)) {
            i(c1Var.h(37));
        }
        a10.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        a10.setImportantForAccessibility(2);
        a10.setClickable(false);
        a10.setPressable(false);
        a10.setCheckable(false);
        a10.setFocusable(false);
        if (!typedArray.hasValue(54)) {
            if (typedArray.hasValue(32)) {
                this.f12445h0 = k7.w.n(getContext(), c1Var, 32);
            }
            if (typedArray.hasValue(33)) {
                this.f12446i0 = ha.i.f(typedArray.getInt(33, -1), null);
            }
        }
        if (typedArray.hasValue(30)) {
            g(typedArray.getInt(30, 0));
            if (typedArray.hasValue(27) && a11.getContentDescription() != (text = typedArray.getText(27))) {
                a11.setContentDescription(text);
            }
            a11.setCheckable(typedArray.getBoolean(26, true));
        } else if (typedArray.hasValue(54)) {
            if (typedArray.hasValue(55)) {
                this.f12445h0 = k7.w.n(getContext(), c1Var, 55);
            }
            if (typedArray.hasValue(56)) {
                this.f12446i0 = ha.i.f(typedArray.getInt(56, -1), null);
            }
            g(typedArray.getBoolean(54, false) ? 1 : 0);
            CharSequence text2 = typedArray.getText(52);
            if (a11.getContentDescription() != text2) {
                a11.setContentDescription(text2);
            }
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(29, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize >= 0) {
            if (dimensionPixelSize != this.f12447j0) {
                this.f12447j0 = dimensionPixelSize;
                a11.setMinimumWidth(dimensionPixelSize);
                a11.setMinimumHeight(dimensionPixelSize);
                a10.setMinimumWidth(dimensionPixelSize);
                a10.setMinimumHeight(dimensionPixelSize);
            }
            if (typedArray.hasValue(31)) {
                ImageView.ScaleType q10 = p7.m.q(typedArray.getInt(31, -1));
                this.f12448k0 = q10;
                a11.setScaleType(q10);
                a10.setScaleType(q10);
            }
            z0Var.setVisibility(8);
            z0Var.setId(R.id.textinput_suffix_text);
            z0Var.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
            z0Var.setAccessibilityLiveRegion(1);
            z0Var.setTextAppearance(typedArray.getResourceId(73, 0));
            if (typedArray.hasValue(74)) {
                z0Var.setTextColor(c1Var.e(74));
            }
            CharSequence text3 = typedArray.getText(72);
            this.f12450m0 = TextUtils.isEmpty(text3) ? null : text3;
            z0Var.setText(text3);
            n();
            frameLayout.addView(a11);
            addView(z0Var);
            addView(frameLayout);
            addView(a10);
            textInputLayout.Z0.add(lVar);
            if (textInputLayout.f3105b0 != null) {
                lVar.a(textInputLayout);
            }
            addOnAttachStateChangeListener(new v2(5, this));
            return;
        }
        a0.j.h("endIconSize cannot be less than 0");
        throw null;
    }

    public final CheckableImageButton a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i2) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i2);
        if (k7.w.w(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    public final n b() {
        n dVar;
        int i2 = this.f12443f0;
        dk.a aVar = this.f12442e0;
        SparseArray sparseArray = (SparseArray) aVar.f4113d;
        n nVar = (n) sparseArray.get(i2);
        if (nVar == null) {
            m mVar = (m) aVar.f4114e;
            if (i2 != -1) {
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 == 3) {
                                dVar = new j(mVar);
                            } else {
                                a0.j.h(w.d.l(i2, "Invalid end icon mode: "));
                                return null;
                            }
                        } else {
                            dVar = new c(mVar);
                        }
                    } else {
                        dVar = new t(mVar, aVar.f4112c);
                    }
                } else {
                    dVar = new d(mVar, 1);
                }
            } else {
                dVar = new d(mVar, 0);
            }
            sparseArray.append(i2, dVar);
            return dVar;
        }
        return nVar;
    }

    public final int c() {
        int marginStart;
        if (!d() && !e()) {
            marginStart = 0;
        } else {
            CheckableImageButton checkableImageButton = this.f12441d0;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        }
        return this.f12451n0.getPaddingEnd() + getPaddingEnd() + marginStart;
    }

    public final boolean d() {
        if (this.B.getVisibility() == 0 && this.f12441d0.getVisibility() == 0) {
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

    public final void f(boolean z10) {
        boolean z11;
        boolean isActivated;
        boolean z12;
        n b10 = b();
        boolean j2 = b10.j();
        CheckableImageButton checkableImageButton = this.f12441d0;
        boolean z13 = true;
        if (j2 && (z12 = checkableImageButton.R) != b10.k()) {
            checkableImageButton.setChecked(!z12);
            z11 = true;
        } else {
            z11 = false;
        }
        if ((b10 instanceof j) && (isActivated = checkableImageButton.isActivated()) != ((j) b10).f12432l) {
            checkableImageButton.setActivated(!isActivated);
        } else {
            z13 = z11;
        }
        if (!z10 && !z13) {
            return;
        }
        p7.m.C(this.A, checkableImageButton, this.f12445h0);
    }

    public final void g(int i2) {
        boolean z10;
        Drawable drawable;
        if (this.f12443f0 == i2) {
            return;
        }
        n b10 = b();
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = this.f12454r0;
        AccessibilityManager accessibilityManager = this.f12453q0;
        if (touchExplorationStateChangeListener != null && accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
        }
        CharSequence charSequence = null;
        this.f12454r0 = null;
        b10.r();
        this.f12443f0 = i2;
        Iterator it = this.f12444g0.iterator();
        if (!it.hasNext()) {
            if (i2 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            h(z10);
            n b11 = b();
            int i10 = this.f12442e0.f4111b;
            if (i10 == 0) {
                i10 = b11.d();
            }
            if (i10 != 0) {
                drawable = k7.w.p(getContext(), i10);
            } else {
                drawable = null;
            }
            CheckableImageButton checkableImageButton = this.f12441d0;
            checkableImageButton.setImageDrawable(drawable);
            TextInputLayout textInputLayout = this.A;
            if (drawable != null) {
                p7.m.e(textInputLayout, checkableImageButton, this.f12445h0, this.f12446i0);
                p7.m.C(textInputLayout, checkableImageButton, this.f12445h0);
            }
            int c4 = b11.c();
            if (c4 != 0) {
                charSequence = getResources().getText(c4);
            }
            if (checkableImageButton.getContentDescription() != charSequence) {
                checkableImageButton.setContentDescription(charSequence);
            }
            checkableImageButton.setCheckable(b11.j());
            if (b11.i(textInputLayout.getBoxBackgroundMode())) {
                b11.q();
                AccessibilityManager.TouchExplorationStateChangeListener h2 = b11.h();
                this.f12454r0 = h2;
                if (h2 != null && accessibilityManager != null && isAttachedToWindow()) {
                    accessibilityManager.addTouchExplorationStateChangeListener(this.f12454r0);
                }
                View.OnClickListener f8 = b11.f();
                View.OnLongClickListener onLongClickListener = this.f12449l0;
                checkableImageButton.setOnClickListener(f8);
                p7.m.E(checkableImageButton, onLongClickListener);
                EditText editText = this.p0;
                if (editText != null) {
                    b11.l(editText);
                    j(b11);
                }
                p7.m.e(textInputLayout, checkableImageButton, this.f12445h0, this.f12446i0);
                f(true);
                return;
            }
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i2);
        }
        throw w.d.k(it);
    }

    public final void h(boolean z10) {
        int i2;
        if (d() != z10) {
            if (z10) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            this.f12441d0.setVisibility(i2);
            k();
            m();
            this.A.s();
        }
    }

    public final void i(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.L;
        checkableImageButton.setImageDrawable(drawable);
        l();
        p7.m.e(this.A, checkableImageButton, this.R, this.f12439b0);
    }

    public final void j(n nVar) {
        if (this.p0 != null) {
            if (nVar.e() != null) {
                this.p0.setOnFocusChangeListener(nVar.e());
            }
            if (nVar.g() != null) {
                this.f12441d0.setOnFocusChangeListener(nVar.g());
            }
        }
    }

    public final void k() {
        int i2;
        boolean z10;
        int i10 = 8;
        if (this.f12441d0.getVisibility() == 0 && !e()) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        this.B.setVisibility(i2);
        if (this.f12450m0 != null && !this.f12452o0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (d() || e() || !z10) {
            i10 = 0;
        }
        setVisibility(i10);
    }

    public final void l() {
        int i2;
        CheckableImageButton checkableImageButton = this.L;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.A;
        if (drawable != null && textInputLayout.f3117h0.f12481q && textInputLayout.o()) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        checkableImageButton.setVisibility(i2);
        k();
        m();
        if (this.f12443f0 != 0) {
            return;
        }
        textInputLayout.s();
    }

    public final void m() {
        int i2;
        TextInputLayout textInputLayout = this.A;
        if (textInputLayout.f3105b0 == null) {
            return;
        }
        if (!d() && !e()) {
            i2 = textInputLayout.f3105b0.getPaddingEnd();
        } else {
            i2 = 0;
        }
        this.f12451n0.setPaddingRelative(getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), textInputLayout.f3105b0.getPaddingTop(), i2, textInputLayout.f3105b0.getPaddingBottom());
    }

    public final void n() {
        int i2;
        z0 z0Var = this.f12451n0;
        int visibility = z0Var.getVisibility();
        boolean z10 = false;
        if (this.f12450m0 != null && !this.f12452o0) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        if (visibility != i2) {
            n b10 = b();
            if (i2 == 0) {
                z10 = true;
            }
            b10.o(z10);
        }
        k();
        z0Var.setVisibility(i2);
        this.A.s();
    }
}
