package com.google.android.material.appbar;

import ah.b0;
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
import ha.i;
import java.util.ArrayList;
import java.util.Collections;
import k7.w;
import l0.f;
import me.magnum.melonds.R;
import na.j;
import sa.a;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class MaterialToolbar extends Toolbar {
    public static final ImageView.ScaleType[] W0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};
    public Integer R0;
    public boolean S0;
    public boolean T0;
    public ImageView.ScaleType U0;
    public Boolean V0;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, R.attr.toolbarStyle, 2131952897), attributeSet, 0);
        ColorStateList n10;
        Context context2 = getContext();
        TypedArray e6 = i.e(context2, attributeSet, t9.a.f13170v, R.attr.toolbarStyle, 2131952897, new int[0]);
        if (e6.hasValue(2)) {
            setNavigationIconTint(e6.getColor(2, -1));
        }
        this.S0 = e6.getBoolean(4, false);
        this.T0 = e6.getBoolean(3, false);
        int i2 = e6.getInt(1, -1);
        if (i2 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = W0;
            if (i2 < scaleTypeArr.length) {
                this.U0 = scaleTypeArr[i2];
            }
        }
        if (e6.hasValue(0)) {
            this.V0 = Boolean.valueOf(e6.getBoolean(0, false));
        }
        e6.recycle();
        Drawable background = getBackground();
        if (background == null) {
            n10 = ColorStateList.valueOf(0);
        } else {
            n10 = f.n(background);
        }
        if (n10 != null) {
            j jVar = new j();
            jVar.n(n10);
            jVar.k(context2);
            jVar.m(getElevation());
            setBackground(jVar);
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.U0;
    }

    public Integer getNavigationIconTint() {
        return this.R0;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof j) {
            w.F(this, (j) background);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i2, int i10, int i11, int i12) {
        TextView textView;
        TextView textView2;
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z10, i2, i10, i11, i12);
        b0 b0Var = i.f6439c;
        int i13 = 0;
        ImageView imageView2 = null;
        if (this.S0 || this.T0) {
            ArrayList d4 = i.d(this, getTitle());
            if (d4.isEmpty()) {
                textView = null;
            } else {
                textView = (TextView) Collections.min(d4, b0Var);
            }
            ArrayList d10 = i.d(this, getSubtitle());
            if (d10.isEmpty()) {
                textView2 = null;
            } else {
                textView2 = (TextView) Collections.max(d10, b0Var);
            }
            if (textView != null || textView2 != null) {
                int measuredWidth = getMeasuredWidth();
                int i14 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i15 = 0; i15 < getChildCount(); i15++) {
                    View childAt = getChildAt(i15);
                    if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                        if (childAt.getRight() < i14 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i14 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.S0 && textView != null) {
                    y(textView, pair);
                }
                if (this.T0 && textView2 != null) {
                    y(textView2, pair);
                }
            }
        }
        Drawable logo = getLogo();
        if (logo != null) {
            while (true) {
                if (i13 >= getChildCount()) {
                    break;
                }
                View childAt2 = getChildAt(i13);
                if ((childAt2 instanceof ImageView) && (drawable = (imageView = (ImageView) childAt2).getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(logo.getConstantState())) {
                    imageView2 = imageView;
                    break;
                }
                i13++;
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.V0;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.U0;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f8) {
        super.setElevation(f8);
        Drawable background = getBackground();
        if (background instanceof j) {
            ((j) background).m(f8);
        }
    }

    public void setLogoAdjustViewBounds(boolean z10) {
        Boolean bool = this.V0;
        if (bool != null && bool.booleanValue() == z10) {
            return;
        }
        this.V0 = Boolean.valueOf(z10);
        requestLayout();
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.U0 != scaleType) {
            this.U0 = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.R0 != null) {
            drawable = drawable.mutate();
            drawable.setTint(this.R0.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i2) {
        this.R0 = Integer.valueOf(i2);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z10) {
        if (this.T0 != z10) {
            this.T0 = z10;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z10) {
        if (this.S0 != z10) {
            this.S0 = z10;
            requestLayout();
        }
    }

    public final void y(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i2 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i10 = measuredWidth2 + i2;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i2, 0), Math.max(i10 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i2 += max;
            i10 -= max;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i10 - i2, 1073741824), textView.getMeasuredHeightAndState());
        }
        textView.layout(i2, textView.getTop(), i10, textView.getBottom());
    }
}
