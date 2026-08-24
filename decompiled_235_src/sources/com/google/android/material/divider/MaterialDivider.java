package com.google.android.material.divider;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import com.stormds.emulator.R;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class MaterialDivider extends View {
    public final p24 A;
    public int B;
    public int L;
    public int R;
    public int d0;

    public MaterialDivider(Context context, AttributeSet attributeSet) {
        super(q60.e0(context, attributeSet, R.attr.materialDividerStyle, 2132018417), attributeSet, R.attr.materialDividerStyle);
        Context context2 = getContext();
        this.A = new p24();
        TypedArray K = f04.K(context2, attributeSet, a75.p, R.attr.materialDividerStyle, 2132018417, new int[0]);
        this.B = K.getDimensionPixelSize(3, getResources().getDimensionPixelSize(R.dimen.material_divider_thickness));
        this.R = K.getDimensionPixelOffset(2, 0);
        this.d0 = K.getDimensionPixelOffset(1, 0);
        setDividerColor(np2.S(context2, K, 0).getDefaultColor());
        K.recycle();
    }

    public int getDividerColor() {
        return this.L;
    }

    public int getDividerInsetEnd() {
        return this.d0;
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
            i = this.d0;
        } else {
            i = this.R;
        }
        if (z) {
            width = getWidth();
            i2 = this.R;
        } else {
            width = getWidth();
            i2 = this.d0;
        }
        int i3 = width - i2;
        p24 p24Var = this.A;
        p24Var.setBounds(i, 0, i3, getBottom() - getTop());
        p24Var.draw(canvas);
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
        this.d0 = i;
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
