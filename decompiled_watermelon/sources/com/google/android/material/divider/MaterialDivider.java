package com.google.android.material.divider;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public class MaterialDivider extends View {
    public final gv3 A;
    public int B;
    public int L;
    public int R;
    public int c0;

    public MaterialDivider(Context context, AttributeSet attributeSet) {
        super(mh7.n0(context, attributeSet, R.attr.materialDividerStyle, 2132018409), attributeSet, R.attr.materialDividerStyle);
        Context context2 = getContext();
        this.A = new gv3();
        TypedArray Y = n40.Y(context2, attributeSet, ay4.p, R.attr.materialDividerStyle, 2132018409, new int[0]);
        this.B = Y.getDimensionPixelSize(3, getResources().getDimensionPixelSize(R.dimen.material_divider_thickness));
        this.R = Y.getDimensionPixelOffset(2, 0);
        this.c0 = Y.getDimensionPixelOffset(1, 0);
        setDividerColor(nk2.C(context2, Y, 0).getDefaultColor());
        Y.recycle();
    }

    public int getDividerColor() {
        return this.L;
    }

    public int getDividerInsetEnd() {
        return this.c0;
    }

    public int getDividerInsetStart() {
        return this.R;
    }

    public int getDividerThickness() {
        return this.B;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        int width;
        int i2;
        super.onDraw(canvas);
        boolean z = true;
        if (getLayoutDirection() != 1) {
            z = false;
        }
        if (z) {
            i = this.c0;
        } else {
            i = this.R;
        }
        if (z) {
            width = getWidth();
            i2 = this.R;
        } else {
            width = getWidth();
            i2 = this.c0;
        }
        int i3 = width - i2;
        gv3 gv3Var = this.A;
        gv3Var.setBounds(i, 0, i3, getBottom() - getTop());
        gv3Var.draw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        int measuredHeight = getMeasuredHeight();
        if (mode != Integer.MIN_VALUE && mode != 0) {
            return;
        }
        int i3 = this.B;
        if (i3 > 0 && measuredHeight != i3) {
            measuredHeight = i3;
        }
        setMeasuredDimension(getMeasuredWidth(), measuredHeight);
    }

    public void setDividerColor(int i) {
        if (this.L != i) {
            this.L = i;
            this.A.n(ColorStateList.valueOf(i));
            invalidate();
        }
    }

    public void setDividerColorResource(int i) {
        setDividerColor(getContext().getColor(i));
    }

    public void setDividerInsetEnd(int i) {
        this.c0 = i;
    }

    public void setDividerInsetEndResource(int i) {
        setDividerInsetEnd(getContext().getResources().getDimensionPixelOffset(i));
    }

    public void setDividerInsetStart(int i) {
        this.R = i;
    }

    public void setDividerInsetStartResource(int i) {
        setDividerInsetStart(getContext().getResources().getDimensionPixelOffset(i));
    }

    public void setDividerThickness(int i) {
        if (this.B != i) {
            this.B = i;
            requestLayout();
        }
    }

    public void setDividerThicknessResource(int i) {
        setDividerThickness(getContext().getResources().getDimensionPixelSize(i));
    }
}
