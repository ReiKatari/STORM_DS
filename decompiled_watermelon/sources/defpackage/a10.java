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
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: a10  reason: default package */
/* loaded from: classes.dex */
public abstract class a10 extends FrameLayout {
    public static final z00 g0 = new z00(0);
    public final a36 A;
    public int B;
    public final float L;
    public final float R;
    public final int c0;
    public final int d0;
    public ColorStateList e0;
    public PorterDuff.Mode f0;

    /* JADX WARN: Multi-variable type inference failed */
    public a10(Context context, AttributeSet attributeSet) {
        super(mh7.n0(context, attributeSet, 0, 0), attributeSet);
        GradientDrawable gradientDrawable;
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, ay4.A);
        if (obtainStyledAttributes.hasValue(6)) {
            setElevation(obtainStyledAttributes.getDimensionPixelSize(6, 0));
        }
        this.B = obtainStyledAttributes.getInt(2, 0);
        if (obtainStyledAttributes.hasValue(8) || obtainStyledAttributes.hasValue(9)) {
            this.A = a36.b(context2, attributeSet, 0, 0).a();
        }
        this.L = obtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(nk2.C(context2, obtainStyledAttributes, 4));
        setBackgroundTintMode(ln2.M(obtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.R = obtainStyledAttributes.getFloat(1, 1.0f);
        this.c0 = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.d0 = obtainStyledAttributes.getDimensionPixelSize(7, -1);
        obtainStyledAttributes.recycle();
        setOnTouchListener(g0);
        setFocusable(true);
        if (getBackground() == null) {
            int I = jk2.I(getBackgroundOverlayColorAlpha(), jk2.x(this, R.attr.colorSurface), jk2.x(this, R.attr.colorOnSurface));
            a36 a36Var = this.A;
            if (a36Var != null) {
                int i = b10.a;
                gv3 gv3Var = new gv3(a36Var);
                gv3Var.n(ColorStateList.valueOf(I));
                gradientDrawable = gv3Var;
            } else {
                Resources resources = getResources();
                int i2 = b10.a;
                float dimension = resources.getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setShape(0);
                gradientDrawable2.setCornerRadius(dimension);
                gradientDrawable2.setColor(I);
                gradientDrawable = gradientDrawable2;
            }
            ColorStateList colorStateList = this.e0;
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
        return this.d0;
    }

    public int getMaxWidth() {
        return this.c0;
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
        int i3 = this.c0;
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
        if (drawable != null && this.e0 != null) {
            drawable = drawable.mutate();
            drawable.setTintList(this.e0);
            drawable.setTintMode(this.f0);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.e0 = colorStateList;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            mutate.setTintList(colorStateList);
            mutate.setTintMode(this.f0);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.f0 = mode;
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
        z00 z00Var;
        if (onClickListener != null) {
            z00Var = null;
        } else {
            z00Var = g0;
        }
        setOnTouchListener(z00Var);
        super.setOnClickListener(onClickListener);
    }

    private void setBaseTransientBottomBar(b10 b10Var) {
    }
}
