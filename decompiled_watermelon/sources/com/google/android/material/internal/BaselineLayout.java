package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public class BaselineLayout extends ViewGroup {
    public int A;
    public boolean B;

    public BaselineLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.A = -1;
    }

    @Override // android.view.View
    public int getBaseline() {
        return this.A;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingRight = ((i3 - i) - getPaddingRight()) - paddingLeft;
        int paddingTop = getPaddingTop();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i7 = ((paddingRight - measuredWidth) / 2) + paddingLeft;
                if (this.A != -1 && childAt.getBaseline() != -1) {
                    i5 = (this.A + paddingTop) - childAt.getBaseline();
                } else {
                    i5 = paddingTop;
                }
                childAt.layout(i7, i5, measuredWidth + i7, measuredHeight + i5);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int childCount = getChildCount();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = -1;
        int i8 = -1;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i, i2);
                i3 = Math.max(i3, childAt.getMeasuredHeight());
                int baseline = childAt.getBaseline();
                if (baseline != -1) {
                    i7 = Math.max(i7, baseline);
                    i8 = Math.max(i8, childAt.getMeasuredHeight() - baseline);
                }
                i5 = Math.max(i5, childAt.getMeasuredWidth());
                i4 = Math.max(i4, childAt.getMeasuredHeight());
                i6 = View.combineMeasuredStates(i6, childAt.getMeasuredState());
            }
        }
        if (i7 != -1) {
            if (this.B) {
                i4 = Math.max(i4, Math.max(i8, getPaddingBottom()) + i7);
            }
            this.A = i7;
        }
        if (!this.B) {
            i4 = getPaddingBottom() + i3;
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(i5, getSuggestedMinimumWidth()), i, i6), View.resolveSizeAndState(Math.max(i4, getSuggestedMinimumHeight()), i2, i6 << 16));
    }

    public void setMeasurePaddingFromBaseline(boolean z) {
        this.B = z;
    }
}
