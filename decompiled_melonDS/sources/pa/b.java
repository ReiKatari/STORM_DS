package pa;

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
import h5.a0;
import ha.i;
import k7.w;
import l0.f;
import me.magnum.melonds.R;
import na.j;
import na.n;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class b extends FrameLayout {

    /* renamed from: f0  reason: collision with root package name */
    public static final a0 f11524f0 = new a0(1);
    public final n A;
    public int B;
    public final float L;
    public final float R;

    /* renamed from: b0  reason: collision with root package name */
    public final int f11525b0;

    /* renamed from: c0  reason: collision with root package name */
    public final int f11526c0;

    /* renamed from: d0  reason: collision with root package name */
    public ColorStateList f11527d0;

    /* renamed from: e0  reason: collision with root package name */
    public PorterDuff.Mode f11528e0;

    /* JADX WARN: Multi-variable type inference failed */
    public b(Context context, AttributeSet attributeSet) {
        super(sa.a.a(context, attributeSet, 0, 0), attributeSet);
        GradientDrawable gradientDrawable;
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, t9.a.A);
        if (obtainStyledAttributes.hasValue(6)) {
            setElevation(obtainStyledAttributes.getDimensionPixelSize(6, 0));
        }
        this.B = obtainStyledAttributes.getInt(2, 0);
        if (obtainStyledAttributes.hasValue(8) || obtainStyledAttributes.hasValue(9)) {
            this.A = n.b(context2, attributeSet, 0, 0).a();
        }
        this.L = obtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(w.m(context2, obtainStyledAttributes, 4));
        setBackgroundTintMode(i.f(obtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.R = obtainStyledAttributes.getFloat(1, 1.0f);
        this.f11525b0 = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.f11526c0 = obtainStyledAttributes.getDimensionPixelSize(7, -1);
        obtainStyledAttributes.recycle();
        setOnTouchListener(f11524f0);
        setFocusable(true);
        if (getBackground() == null) {
            int u4 = f.u(getBackgroundOverlayColorAlpha(), f.m(this, R.attr.colorSurface), f.m(this, R.attr.colorOnSurface));
            n nVar = this.A;
            if (nVar != null) {
                int i2 = c.f11529a;
                j jVar = new j(nVar);
                jVar.n(ColorStateList.valueOf(u4));
                gradientDrawable = jVar;
            } else {
                Resources resources = getResources();
                int i10 = c.f11529a;
                float dimension = resources.getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setShape(0);
                gradientDrawable2.setCornerRadius(dimension);
                gradientDrawable2.setColor(u4);
                gradientDrawable = gradientDrawable2;
            }
            ColorStateList colorStateList = this.f11527d0;
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
        return this.f11526c0;
    }

    public int getMaxWidth() {
        return this.f11525b0;
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
    public final void onLayout(boolean z10, int i2, int i10, int i11, int i12) {
        super.onLayout(z10, i2, i10, i11, i12);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i10) {
        super.onMeasure(i2, i10);
        int i11 = this.f11525b0;
        if (i11 > 0 && getMeasuredWidth() > i11) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i11, 1073741824), i10);
        }
    }

    public void setAnimationMode(int i2) {
        this.B = i2;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.f11527d0 != null) {
            drawable = drawable.mutate();
            drawable.setTintList(this.f11527d0);
            drawable.setTintMode(this.f11528e0);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.f11527d0 = colorStateList;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            mutate.setTintList(colorStateList);
            mutate.setTintMode(this.f11528e0);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.f11528e0 = mode;
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
        a0 a0Var;
        if (onClickListener != null) {
            a0Var = null;
        } else {
            a0Var = f11524f0;
        }
        setOnTouchListener(a0Var);
        super.setOnClickListener(onClickListener);
    }

    private void setBaseTransientBottomBar(c cVar) {
    }
}
