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
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: pd6  reason: default package */
/* loaded from: classes.dex */
public final class pd6 extends LinearLayout {
    public final TextInputLayout A;
    public final ds B;
    public CharSequence L;
    public final CheckableImageButton R;
    public ColorStateList c0;
    public PorterDuff.Mode d0;
    public int e0;
    public ImageView.ScaleType f0;
    public View.OnLongClickListener g0;
    public boolean h0;

    public pd6(TextInputLayout textInputLayout, n85 n85Var) {
        super(textInputLayout.getContext());
        CharSequence text;
        this.A = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.R = checkableImageButton;
        ds dsVar = new ds(getContext(), null);
        this.B = dsVar;
        if (nk2.K(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        View.OnLongClickListener onLongClickListener = this.g0;
        checkableImageButton.setOnClickListener(null);
        ep2.G(checkableImageButton, onLongClickListener);
        this.g0 = null;
        checkableImageButton.setOnLongClickListener(null);
        ep2.G(checkableImageButton, null);
        TypedArray typedArray = (TypedArray) n85Var.L;
        if (typedArray.hasValue(70)) {
            this.c0 = nk2.B(getContext(), n85Var, 70);
        }
        if (typedArray.hasValue(71)) {
            this.d0 = ln2.M(typedArray.getInt(71, -1), null);
        }
        if (typedArray.hasValue(67)) {
            b(n85Var.f(67));
            if (typedArray.hasValue(66) && checkableImageButton.getContentDescription() != (text = typedArray.getText(66))) {
                checkableImageButton.setContentDescription(text);
            }
            checkableImageButton.setCheckable(typedArray.getBoolean(65, true));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(68, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize >= 0) {
            if (dimensionPixelSize != this.e0) {
                this.e0 = dimensionPixelSize;
                checkableImageButton.setMinimumWidth(dimensionPixelSize);
                checkableImageButton.setMinimumHeight(dimensionPixelSize);
            }
            if (typedArray.hasValue(69)) {
                ImageView.ScaleType m = ep2.m(typedArray.getInt(69, -1));
                this.f0 = m;
                checkableImageButton.setScaleType(m);
            }
            dsVar.setVisibility(8);
            dsVar.setId(R.id.textinput_prefix_text);
            dsVar.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            dsVar.setAccessibilityLiveRegion(1);
            dsVar.setTextAppearance(typedArray.getResourceId(61, 0));
            if (typedArray.hasValue(62)) {
                dsVar.setTextColor(n85Var.e(62));
            }
            CharSequence text2 = typedArray.getText(60);
            this.L = TextUtils.isEmpty(text2) ? null : text2;
            dsVar.setText(text2);
            e();
            addView(checkableImageButton);
            addView(dsVar);
            return;
        }
        i.i("startIconSize cannot be less than 0");
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
            ColorStateList colorStateList = this.c0;
            PorterDuff.Mode mode = this.d0;
            TextInputLayout textInputLayout = this.A;
            ep2.i(textInputLayout, checkableImageButton, colorStateList, mode);
            c(true);
            ep2.D(textInputLayout, checkableImageButton, this.c0);
            return;
        }
        c(false);
        View.OnLongClickListener onLongClickListener = this.g0;
        checkableImageButton.setOnClickListener(null);
        ep2.G(checkableImageButton, onLongClickListener);
        this.g0 = null;
        checkableImageButton.setOnLongClickListener(null);
        ep2.G(checkableImageButton, null);
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
        EditText editText = this.A.c0;
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
        if (this.L != null && !this.h0) {
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
