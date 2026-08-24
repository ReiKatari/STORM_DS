package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.stormds.emulator.R;
import java.util.ArrayList;
import java.util.Collections;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class MaterialToolbar extends Toolbar {
    public static final ImageView.ScaleType[] Y0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};
    public Integer T0;
    public boolean U0;
    public boolean V0;
    public ImageView.ScaleType W0;
    public Boolean X0;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        super(q60.e0(context, attributeSet, R.attr.toolbarStyle, 2132018460), attributeSet, 0);
        ColorStateList r;
        Context context2 = getContext();
        TypedArray K = f04.K(context2, attributeSet, a75.v, R.attr.toolbarStyle, 2132018460, new int[0]);
        if (K.hasValue(2)) {
            setNavigationIconTint(K.getColor(2, -1));
        }
        this.U0 = K.getBoolean(4, false);
        this.V0 = K.getBoolean(3, false);
        int i = K.getInt(1, -1);
        if (i >= 0) {
            ImageView.ScaleType[] scaleTypeArr = Y0;
            if (i < scaleTypeArr.length) {
                this.W0 = scaleTypeArr[i];
            }
        }
        if (K.hasValue(0)) {
            this.X0 = Boolean.valueOf(K.getBoolean(0, false));
        }
        K.recycle();
        Drawable background = getBackground();
        if (background == null) {
            r = ColorStateList.valueOf(0);
        } else {
            r = u24.r(background);
        }
        if (r != null) {
            p24 p24Var = new p24();
            p24Var.n(r);
            p24Var.k(context2);
            p24Var.m(getElevation());
            setBackground(p24Var);
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.W0;
    }

    public Integer getNavigationIconTint() {
        return this.T0;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof p24) {
            jx2.P(this, (p24) background);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        TextView textView;
        TextView textView2;
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z, i, i2, i3, i4);
        tp5 tp5Var = u24.o;
        int i5 = 0;
        ImageView imageView2 = null;
        if (this.U0 || this.V0) {
            ArrayList s = u24.s(this, getTitle());
            if (s.isEmpty()) {
                textView = null;
            } else {
                textView = (TextView) Collections.min(s, tp5Var);
            }
            ArrayList s2 = u24.s(this, getSubtitle());
            if (s2.isEmpty()) {
                textView2 = null;
            } else {
                textView2 = (TextView) Collections.max(s2, tp5Var);
            }
            if (textView != null || textView2 != null) {
                int measuredWidth = getMeasuredWidth();
                int i6 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i7 = 0; i7 < getChildCount(); i7++) {
                    View childAt = getChildAt(i7);
                    if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                        if (childAt.getRight() < i6 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i6 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.U0 && textView != null) {
                    y(textView, pair);
                }
                if (this.V0 && textView2 != null) {
                    y(textView2, pair);
                }
            }
        }
        Drawable logo = getLogo();
        if (logo != null) {
            while (true) {
                if (i5 >= getChildCount()) {
                    break;
                }
                View childAt2 = getChildAt(i5);
                if ((childAt2 instanceof ImageView) && (drawable = (imageView = (ImageView) childAt2).getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(logo.getConstantState())) {
                    imageView2 = imageView;
                    break;
                }
                i5++;
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.X0;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.W0;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof p24) {
            ((p24) background).m(f);
        }
    }

    public void setLogoAdjustViewBounds(boolean z) {
        Boolean bool = this.X0;
        if (bool != null && bool.booleanValue() == z) {
            return;
        }
        this.X0 = Boolean.valueOf(z);
        requestLayout();
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.W0 != scaleType) {
            this.W0 = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.T0 != null) {
            drawable = drawable.mutate();
            drawable.setTint(this.T0.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i) {
        this.T0 = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z) {
        if (this.V0 != z) {
            this.V0 = z;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z) {
        if (this.U0 != z) {
            this.U0 = z;
            requestLayout();
        }
    }

    public final void y(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i2 = measuredWidth2 + i;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i, 0), Math.max(i2 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i += max;
            i2 -= max;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i2 - i, 1073741824), textView.getMeasuredHeightAndState());
        }
        textView.layout(i, textView.getTop(), i2, textView.getBottom());
    }
}
