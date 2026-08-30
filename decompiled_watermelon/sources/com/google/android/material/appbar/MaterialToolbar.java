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
import java.util.ArrayList;
import java.util.Collections;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public class MaterialToolbar extends Toolbar {
    public static final ImageView.ScaleType[] X0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};
    public Integer S0;
    public boolean T0;
    public boolean U0;
    public ImageView.ScaleType V0;
    public Boolean W0;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        super(mh7.n0(context, attributeSet, R.attr.toolbarStyle, 2132018452), attributeSet, 0);
        ColorStateList n;
        Context context2 = getContext();
        TypedArray Y = n40.Y(context2, attributeSet, ay4.v, R.attr.toolbarStyle, 2132018452, new int[0]);
        if (Y.hasValue(2)) {
            setNavigationIconTint(Y.getColor(2, -1));
        }
        this.T0 = Y.getBoolean(4, false);
        this.U0 = Y.getBoolean(3, false);
        int i = Y.getInt(1, -1);
        if (i >= 0) {
            ImageView.ScaleType[] scaleTypeArr = X0;
            if (i < scaleTypeArr.length) {
                this.V0 = scaleTypeArr[i];
            }
        }
        if (Y.hasValue(0)) {
            this.W0 = Boolean.valueOf(Y.getBoolean(0, false));
        }
        Y.recycle();
        Drawable background = getBackground();
        if (background == null) {
            n = ColorStateList.valueOf(0);
        } else {
            n = iq2.n(background);
        }
        if (n != null) {
            gv3 gv3Var = new gv3();
            gv3Var.n(n);
            gv3Var.k(context2);
            gv3Var.m(getElevation());
            setBackground(gv3Var);
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.V0;
    }

    public Integer getNavigationIconTint() {
        return this.S0;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof gv3) {
            nl2.U(this, (gv3) background);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        TextView textView;
        TextView textView2;
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z, i, i2, i3, i4);
        so5 so5Var = iq2.i;
        int i5 = 0;
        ImageView imageView2 = null;
        if (this.T0 || this.U0) {
            ArrayList q = iq2.q(this, getTitle());
            if (q.isEmpty()) {
                textView = null;
            } else {
                textView = (TextView) Collections.min(q, so5Var);
            }
            ArrayList q2 = iq2.q(this, getSubtitle());
            if (q2.isEmpty()) {
                textView2 = null;
            } else {
                textView2 = (TextView) Collections.max(q2, so5Var);
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
                if (this.T0 && textView != null) {
                    y(textView, pair);
                }
                if (this.U0 && textView2 != null) {
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
            Boolean bool = this.W0;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.V0;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof gv3) {
            ((gv3) background).m(f);
        }
    }

    public void setLogoAdjustViewBounds(boolean z) {
        Boolean bool = this.W0;
        if (bool != null && bool.booleanValue() == z) {
            return;
        }
        this.W0 = Boolean.valueOf(z);
        requestLayout();
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.V0 != scaleType) {
            this.V0 = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.S0 != null) {
            drawable = drawable.mutate();
            drawable.setTint(this.S0.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i) {
        this.S0 = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z) {
        if (this.U0 != z) {
            this.U0 = z;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z) {
        if (this.T0 != z) {
            this.T0 = z;
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
