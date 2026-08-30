package com.google.android.material.divider;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import ha.i;
import k7.w;
import me.magnum.melonds.R;
import na.j;
import sa.a;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class MaterialDivider extends View {
    public final j A;
    public int B;
    public int L;
    public int R;

    /* renamed from: b0  reason: collision with root package name */
    public int f3067b0;

    public MaterialDivider(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, R.attr.materialDividerStyle, 2131952854), attributeSet, R.attr.materialDividerStyle);
        Context context2 = getContext();
        this.A = new j();
        TypedArray e6 = i.e(context2, attributeSet, t9.a.f13164p, R.attr.materialDividerStyle, 2131952854, new int[0]);
        this.B = e6.getDimensionPixelSize(3, getResources().getDimensionPixelSize(R.dimen.material_divider_thickness));
        this.R = e6.getDimensionPixelOffset(2, 0);
        this.f3067b0 = e6.getDimensionPixelOffset(1, 0);
        setDividerColor(w.m(context2, e6, 0).getDefaultColor());
        e6.recycle();
    }

    public int getDividerColor() {
        return this.L;
    }

    public int getDividerInsetEnd() {
        return this.f3067b0;
    }

    public int getDividerInsetStart() {
        return this.R;
    }

    public int getDividerThickness() {
        return this.B;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i2;
        int width;
        int i10;
        super.onDraw(canvas);
        boolean z10 = true;
        if (getLayoutDirection() != 1) {
            z10 = false;
        }
        if (z10) {
            i2 = this.f3067b0;
        } else {
            i2 = this.R;
        }
        if (z10) {
            width = getWidth();
            i10 = this.R;
        } else {
            width = getWidth();
            i10 = this.f3067b0;
        }
        int i11 = width - i10;
        int bottom = getBottom() - getTop();
        j jVar = this.A;
        jVar.setBounds(i2, 0, i11, bottom);
        jVar.draw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i10) {
        super.onMeasure(i2, i10);
        int mode = View.MeasureSpec.getMode(i10);
        int measuredHeight = getMeasuredHeight();
        if (mode != Integer.MIN_VALUE && mode != 0) {
            return;
        }
        int i11 = this.B;
        if (i11 > 0 && measuredHeight != i11) {
            measuredHeight = i11;
        }
        setMeasuredDimension(getMeasuredWidth(), measuredHeight);
    }

    public void setDividerColor(int i2) {
        if (this.L != i2) {
            this.L = i2;
            this.A.n(ColorStateList.valueOf(i2));
            invalidate();
        }
    }

    public void setDividerColorResource(int i2) {
        setDividerColor(getContext().getColor(i2));
    }

    public void setDividerInsetEnd(int i2) {
        this.f3067b0 = i2;
    }

    public void setDividerInsetEndResource(int i2) {
        setDividerInsetEnd(getContext().getResources().getDimensionPixelOffset(i2));
    }

    public void setDividerInsetStart(int i2) {
        this.R = i2;
    }

    public void setDividerInsetStartResource(int i2) {
        setDividerInsetStart(getContext().getResources().getDimensionPixelOffset(i2));
    }

    public void setDividerThickness(int i2) {
        if (this.B != i2) {
            this.B = i2;
            requestLayout();
        }
    }

    public void setDividerThicknessResource(int i2) {
        setDividerThickness(getContext().getResources().getDimensionPixelSize(i2));
    }
}
