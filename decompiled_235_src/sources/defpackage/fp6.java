package defpackage;

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
import com.stormds.emulator.R;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fp6  reason: default package */
/* loaded from: classes.dex */
public final class fp6 extends LinearLayout {
    public final TextInputLayout A;
    public final qs B;
    public CharSequence L;
    public final CheckableImageButton R;
    public ColorStateList d0;
    public PorterDuff.Mode e0;
    public int f0;
    public ImageView.ScaleType g0;
    public View.OnLongClickListener h0;
    public boolean i0;

    public fp6(TextInputLayout textInputLayout, m44 m44Var) {
        super(textInputLayout.getContext());
        CharSequence text;
        this.A = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.R = checkableImageButton;
        qs qsVar = new qs(getContext(), null);
        this.B = qsVar;
        if (np2.W(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        View.OnLongClickListener onLongClickListener = this.h0;
        checkableImageButton.setOnClickListener(null);
        kj2.Y(checkableImageButton, onLongClickListener);
        this.h0 = null;
        checkableImageButton.setOnLongClickListener(null);
        kj2.Y(checkableImageButton, null);
        TypedArray typedArray = (TypedArray) m44Var.L;
        if (typedArray.hasValue(70)) {
            this.d0 = np2.R(getContext(), m44Var, 70);
        }
        if (typedArray.hasValue(71)) {
            this.e0 = qo2.E(typedArray.getInt(71, -1), null);
        }
        if (typedArray.hasValue(67)) {
            b(m44Var.k(67));
            if (typedArray.hasValue(66) && checkableImageButton.getContentDescription() != (text = typedArray.getText(66))) {
                checkableImageButton.setContentDescription(text);
            }
            checkableImageButton.setCheckable(typedArray.getBoolean(65, true));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(68, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize >= 0) {
            if (dimensionPixelSize != this.f0) {
                this.f0 = dimensionPixelSize;
                checkableImageButton.setMinimumWidth(dimensionPixelSize);
                checkableImageButton.setMinimumHeight(dimensionPixelSize);
            }
            if (typedArray.hasValue(69)) {
                ImageView.ScaleType r = kj2.r(typedArray.getInt(69, -1));
                this.g0 = r;
                checkableImageButton.setScaleType(r);
            }
            qsVar.setVisibility(8);
            qsVar.setId(R.id.textinput_prefix_text);
            qsVar.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            qsVar.setAccessibilityLiveRegion(1);
            qsVar.setTextAppearance(typedArray.getResourceId(61, 0));
            if (typedArray.hasValue(62)) {
                qsVar.setTextColor(m44Var.g(62));
            }
            CharSequence text2 = typedArray.getText(60);
            this.L = TextUtils.isEmpty(text2) ? null : text2;
            qsVar.setText(text2);
            e();
            addView(checkableImageButton);
            addView(qsVar);
            return;
        }
        i.h("startIconSize cannot be less than 0");
        throw null;
    }

    public final int a() {
        int i;
        CheckableImageButton checkableImageButton = this.R;
        if (checkableImageButton.getVisibility() == 0) {
            i = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginEnd() + checkableImageButton.getMeasuredWidth();
        } else {
            i = 0;
        }
        return this.B.getPaddingStart() + getPaddingStart() + i;
    }

    public final void b(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.R;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.d0;
            PorterDuff.Mode mode = this.e0;
            TextInputLayout textInputLayout = this.A;
            kj2.p(textInputLayout, checkableImageButton, colorStateList, mode);
            c(true);
            kj2.V(textInputLayout, checkableImageButton, this.d0);
            return;
        }
        c(false);
        View.OnLongClickListener onLongClickListener = this.h0;
        checkableImageButton.setOnClickListener(null);
        kj2.Y(checkableImageButton, onLongClickListener);
        this.h0 = null;
        checkableImageButton.setOnLongClickListener(null);
        kj2.Y(checkableImageButton, null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription(null);
        }
    }

    public final void c(boolean z) {
        boolean z2;
        CheckableImageButton checkableImageButton = this.R;
        int i = 0;
        if (checkableImageButton.getVisibility() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 != z) {
            if (!z) {
                i = 8;
            }
            checkableImageButton.setVisibility(i);
            d();
            e();
        }
    }

    public final void d() {
        int paddingStart;
        EditText editText = this.A.d0;
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
        int i;
        int i2 = 8;
        if (this.L != null && !this.i0) {
            i = 0;
        } else {
            i = 8;
        }
        if (this.R.getVisibility() == 0 || i == 0) {
            i2 = 0;
        }
        setVisibility(i2);
        this.B.setVisibility(i);
        this.A.s();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        d();
    }
}
