package qa;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import me.magnum.melonds.R;
import p1.c1;
import q.z0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class u extends LinearLayout {
    public final TextInputLayout A;
    public final z0 B;
    public CharSequence L;
    public final CheckableImageButton R;

    /* renamed from: b0  reason: collision with root package name */
    public ColorStateList f12502b0;

    /* renamed from: c0  reason: collision with root package name */
    public PorterDuff.Mode f12503c0;

    /* renamed from: d0  reason: collision with root package name */
    public int f12504d0;

    /* renamed from: e0  reason: collision with root package name */
    public ImageView.ScaleType f12505e0;

    /* renamed from: f0  reason: collision with root package name */
    public View.OnLongClickListener f12506f0;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f12507g0;

    public u(TextInputLayout textInputLayout, c1 c1Var) {
        super(textInputLayout.getContext());
        CharSequence text;
        this.A = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.R = checkableImageButton;
        z0 z0Var = new z0(getContext(), null);
        this.B = z0Var;
        if (k7.w.w(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        View.OnLongClickListener onLongClickListener = this.f12506f0;
        checkableImageButton.setOnClickListener(null);
        p7.m.E(checkableImageButton, onLongClickListener);
        this.f12506f0 = null;
        checkableImageButton.setOnLongClickListener(null);
        p7.m.E(checkableImageButton, null);
        TypedArray typedArray = (TypedArray) c1Var.B;
        if (typedArray.hasValue(70)) {
            this.f12502b0 = k7.w.n(getContext(), c1Var, 70);
        }
        if (typedArray.hasValue(71)) {
            this.f12503c0 = ha.i.f(typedArray.getInt(71, -1), null);
        }
        if (typedArray.hasValue(67)) {
            b(c1Var.h(67));
            if (typedArray.hasValue(66) && checkableImageButton.getContentDescription() != (text = typedArray.getText(66))) {
                checkableImageButton.setContentDescription(text);
            }
            checkableImageButton.setCheckable(typedArray.getBoolean(65, true));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(68, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize >= 0) {
            if (dimensionPixelSize != this.f12504d0) {
                this.f12504d0 = dimensionPixelSize;
                checkableImageButton.setMinimumWidth(dimensionPixelSize);
                checkableImageButton.setMinimumHeight(dimensionPixelSize);
            }
            if (typedArray.hasValue(69)) {
                ImageView.ScaleType q10 = p7.m.q(typedArray.getInt(69, -1));
                this.f12505e0 = q10;
                checkableImageButton.setScaleType(q10);
            }
            z0Var.setVisibility(8);
            z0Var.setId(R.id.textinput_prefix_text);
            z0Var.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            z0Var.setAccessibilityLiveRegion(1);
            z0Var.setTextAppearance(typedArray.getResourceId(61, 0));
            if (typedArray.hasValue(62)) {
                z0Var.setTextColor(c1Var.e(62));
            }
            CharSequence text2 = typedArray.getText(60);
            this.L = TextUtils.isEmpty(text2) ? null : text2;
            z0Var.setText(text2);
            e();
            addView(checkableImageButton);
            addView(z0Var);
            return;
        }
        a0.j.h("startIconSize cannot be less than 0");
        throw null;
    }

    public final int a() {
        int i2;
        CheckableImageButton checkableImageButton = this.R;
        if (checkableImageButton.getVisibility() == 0) {
            i2 = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginEnd() + checkableImageButton.getMeasuredWidth();
        } else {
            i2 = 0;
        }
        return this.B.getPaddingStart() + getPaddingStart() + i2;
    }

    public final void b(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.R;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.f12502b0;
            PorterDuff.Mode mode = this.f12503c0;
            TextInputLayout textInputLayout = this.A;
            p7.m.e(textInputLayout, checkableImageButton, colorStateList, mode);
            c(true);
            p7.m.C(textInputLayout, checkableImageButton, this.f12502b0);
            return;
        }
        c(false);
        View.OnLongClickListener onLongClickListener = this.f12506f0;
        checkableImageButton.setOnClickListener(null);
        p7.m.E(checkableImageButton, onLongClickListener);
        this.f12506f0 = null;
        checkableImageButton.setOnLongClickListener(null);
        p7.m.E(checkableImageButton, null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription(null);
        }
    }

    public final void c(boolean z10) {
        boolean z11;
        CheckableImageButton checkableImageButton = this.R;
        int i2 = 0;
        if (checkableImageButton.getVisibility() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 != z10) {
            if (!z10) {
                i2 = 8;
            }
            checkableImageButton.setVisibility(i2);
            d();
            e();
        }
    }

    public final void d() {
        int paddingStart;
        EditText editText = this.A.f3105b0;
        if (editText == null) {
            return;
        }
        if (this.R.getVisibility() == 0) {
            paddingStart = 0;
        } else {
            paddingStart = editText.getPaddingStart();
        }
        this.B.setPaddingRelative(paddingStart, editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), editText.getCompoundPaddingBottom());
    }

    public final void e() {
        int i2;
        int i10 = 8;
        if (this.L != null && !this.f12507g0) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        if (this.R.getVisibility() == 0 || i2 == 0) {
            i10 = 0;
        }
        setVisibility(i10);
        this.B.setVisibility(i2);
        this.A.s();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i2, int i10) {
        super.onMeasure(i2, i10);
        d();
    }
}
