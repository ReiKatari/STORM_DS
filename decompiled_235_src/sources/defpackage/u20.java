package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.stormds.emulator.R;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: u20  reason: default package */
/* loaded from: classes.dex */
public abstract class u20 extends FrameLayout {
    public static final t20 h0 = new t20(0);
    public final me6 A;
    public int B;
    public final float L;
    public final float R;
    public final int d0;
    public final int e0;
    public ColorStateList f0;
    public PorterDuff.Mode g0;

    /* JADX WARN: Multi-variable type inference failed */
    public u20(Context context, AttributeSet attributeSet) {
        super(q60.e0(context, attributeSet, 0, 0), attributeSet);
        GradientDrawable gradientDrawable;
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, a75.A);
        if (obtainStyledAttributes.hasValue(6)) {
            setElevation(obtainStyledAttributes.getDimensionPixelSize(6, 0));
        }
        this.B = obtainStyledAttributes.getInt(2, 0);
        if (obtainStyledAttributes.hasValue(8) || obtainStyledAttributes.hasValue(9)) {
            this.A = me6.b(context2, attributeSet, 0, 0).a();
        }
        this.L = obtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(np2.S(context2, obtainStyledAttributes, 4));
        setBackgroundTintMode(qo2.E(obtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.R = obtainStyledAttributes.getFloat(1, 1.0f);
        this.d0 = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.e0 = obtainStyledAttributes.getDimensionPixelSize(7, -1);
        obtainStyledAttributes.recycle();
        setOnTouchListener(h0);
        setFocusable(true);
        if (getBackground() == null) {
            int Q = mp2.Q(getBackgroundOverlayColorAlpha(), mp2.B(this, R.attr.colorSurface), mp2.B(this, R.attr.colorOnSurface));
            me6 me6Var = this.A;
            if (me6Var != null) {
                int i = v20.a;
                p24 p24Var = new p24(me6Var);
                p24Var.n(ColorStateList.valueOf(Q));
                gradientDrawable = p24Var;
            } else {
                Resources resources = getResources();
                int i2 = v20.a;
                float dimension = resources.getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setShape(0);
                gradientDrawable2.setCornerRadius(dimension);
                gradientDrawable2.setColor(Q);
                gradientDrawable = gradientDrawable2;
            }
            ColorStateList colorStateList = this.f0;
            if (colorStateList != null) {
                gradientDrawable.setTintList(colorStateList);
            }
            setBackground(gradientDrawable);
        }
    }

    public float getActionTextColorAlpha() {
        return this.R;
    }

    public int getAnimationMode() {
        return this.B;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.L;
    }

    public int getMaxInlineActionWidth() {
        return this.e0;
    }

    public int getMaxWidth() {
        return this.d0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = this.d0;
        if (i3 > 0 && getMeasuredWidth() > i3) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
        }
    }

    public void setAnimationMode(int i) {
        this.B = i;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.f0 != null) {
            drawable = drawable.mutate();
            drawable.setTintList(this.f0);
            drawable.setTintMode(this.g0);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.f0 = colorStateList;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            mutate.setTintList(colorStateList);
            mutate.setTintMode(this.g0);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.g0 = mode;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            mutate.setTintMode(mode);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        t20 t20Var;
        if (onClickListener != null) {
            t20Var = null;
        } else {
            t20Var = h0;
        }
        setOnTouchListener(t20Var);
        super.setOnClickListener(onClickListener);
    }

    private void setBaseTransientBottomBar(v20 v20Var) {
    }
}
