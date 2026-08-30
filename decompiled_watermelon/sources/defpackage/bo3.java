package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: bo3  reason: default package */
/* loaded from: classes.dex */
public abstract class bo3 extends ViewGroup {
    public boolean A;
    public int B;
    public int L;
    public int R;
    public int c0;
    public int d0;
    public float e0;
    public boolean f0;
    public int[] g0;
    public int[] h0;
    public Drawable i0;
    public int j0;
    public int k0;
    public int l0;
    public int m0;

    public bo3(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A = true;
        this.B = -1;
        this.L = 0;
        this.c0 = 8388659;
        int[] iArr = by4.n;
        n85 q = n85.q(context, attributeSet, iArr, i);
        aa7.m(this, context, iArr, attributeSet, (TypedArray) q.L, i);
        TypedArray typedArray = (TypedArray) q.L;
        int i2 = typedArray.getInt(1, -1);
        if (i2 >= 0) {
            setOrientation(i2);
        }
        int i3 = typedArray.getInt(0, -1);
        if (i3 >= 0) {
            setGravity(i3);
        }
        boolean z = typedArray.getBoolean(2, true);
        if (!z) {
            setBaselineAligned(z);
        }
        this.e0 = typedArray.getFloat(4, -1.0f);
        this.B = typedArray.getInt(3, -1);
        this.f0 = typedArray.getBoolean(7, false);
        setDividerDrawable(q.f(5));
        this.l0 = typedArray.getInt(8, 0);
        this.m0 = typedArray.getDimensionPixelSize(6, 0);
        q.t();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ao3;
    }

    public final void d(Canvas canvas, int i) {
        this.i0.setBounds(getPaddingLeft() + this.m0, i, (getWidth() - getPaddingRight()) - this.m0, this.k0 + i);
        this.i0.draw(canvas);
    }

    public final void e(Canvas canvas, int i) {
        this.i0.setBounds(i, getPaddingTop() + this.m0, this.j0 + i, (getHeight() - getPaddingBottom()) - this.m0);
        this.i0.draw(canvas);
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [ao3, android.widget.LinearLayout$LayoutParams] */
    /* JADX WARN: Type inference failed for: r2v4, types: [ao3, android.widget.LinearLayout$LayoutParams] */
    @Override // android.view.ViewGroup
    /* renamed from: f */
    public ao3 generateDefaultLayoutParams() {
        int i = this.R;
        if (i == 0) {
            return new LinearLayout.LayoutParams(-2, -2);
        }
        if (i == 1) {
            return new LinearLayout.LayoutParams(-1, -2);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ao3, android.widget.LinearLayout$LayoutParams] */
    @Override // android.view.ViewGroup
    /* renamed from: g */
    public ao3 generateLayoutParams(AttributeSet attributeSet) {
        return new LinearLayout.LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.B < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.B;
        if (childCount > i2) {
            View childAt = getChildAt(i2);
            int baseline = childAt.getBaseline();
            if (baseline == -1) {
                if (this.B == 0) {
                    return -1;
                }
                f81.w("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
                return 0;
            }
            int i3 = this.L;
            if (this.R == 1 && (i = this.c0 & 112) != 48) {
                if (i != 16) {
                    if (i == 80) {
                        i3 = ((getBottom() - getTop()) - getPaddingBottom()) - this.d0;
                    }
                } else {
                    i3 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.d0) / 2;
                }
            }
            return i3 + ((LinearLayout.LayoutParams) ((ao3) childAt.getLayoutParams())).topMargin + baseline;
        }
        f81.w("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        return 0;
    }

    public int getBaselineAlignedChildIndex() {
        return this.B;
    }

    public Drawable getDividerDrawable() {
        return this.i0;
    }

    public int getDividerPadding() {
        return this.m0;
    }

    public int getDividerWidth() {
        return this.j0;
    }

    public int getGravity() {
        return this.c0;
    }

    public int getOrientation() {
        return this.R;
    }

    public int getShowDividers() {
        return this.l0;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.e0;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [ao3, android.widget.LinearLayout$LayoutParams] */
    /* JADX WARN: Type inference failed for: r0v4, types: [ao3, android.widget.LinearLayout$LayoutParams] */
    /* JADX WARN: Type inference failed for: r0v5, types: [ao3, android.widget.LinearLayout$LayoutParams] */
    @Override // android.view.ViewGroup
    /* renamed from: h */
    public ao3 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ao3) {
            return new LinearLayout.LayoutParams((ViewGroup.MarginLayoutParams) ((ao3) layoutParams));
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LinearLayout.LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LinearLayout.LayoutParams(layoutParams);
    }

    public final boolean i(int i) {
        if (i == 0) {
            if ((this.l0 & 1) == 0) {
                return false;
            }
            return true;
        }
        int childCount = getChildCount();
        int i2 = this.l0;
        if (i == childCount) {
            if ((i2 & 4) == 0) {
                return false;
            }
            return true;
        }
        if ((i2 & 2) != 0) {
            for (int i3 = i - 1; i3 >= 0; i3--) {
                if (getChildAt(i3).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z;
        int right;
        int left;
        int i;
        int left2;
        int bottom;
        if (this.i0 != null) {
            int i2 = 0;
            if (this.R == 1) {
                int virtualChildCount = getVirtualChildCount();
                while (i2 < virtualChildCount) {
                    View childAt = getChildAt(i2);
                    if (childAt != null && childAt.getVisibility() != 8 && i(i2)) {
                        d(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((ao3) childAt.getLayoutParams())).topMargin) - this.k0);
                    }
                    i2++;
                }
                if (i(virtualChildCount)) {
                    View childAt2 = getChildAt(virtualChildCount - 1);
                    if (childAt2 == null) {
                        bottom = (getHeight() - getPaddingBottom()) - this.k0;
                    } else {
                        bottom = childAt2.getBottom() + ((LinearLayout.LayoutParams) ((ao3) childAt2.getLayoutParams())).bottomMargin;
                    }
                    d(canvas, bottom);
                    return;
                }
                return;
            }
            int virtualChildCount2 = getVirtualChildCount();
            boolean z2 = dc7.a;
            if (getLayoutDirection() == 1) {
                z = true;
            } else {
                z = false;
            }
            while (i2 < virtualChildCount2) {
                View childAt3 = getChildAt(i2);
                if (childAt3 != null && childAt3.getVisibility() != 8 && i(i2)) {
                    ao3 ao3Var = (ao3) childAt3.getLayoutParams();
                    if (z) {
                        left2 = childAt3.getRight() + ((LinearLayout.LayoutParams) ao3Var).rightMargin;
                    } else {
                        left2 = (childAt3.getLeft() - ((LinearLayout.LayoutParams) ao3Var).leftMargin) - this.j0;
                    }
                    e(canvas, left2);
                }
                i2++;
            }
            if (i(virtualChildCount2)) {
                View childAt4 = getChildAt(virtualChildCount2 - 1);
                if (childAt4 == null) {
                    if (z) {
                        right = getPaddingLeft();
                    } else {
                        left = getWidth() - getPaddingRight();
                        i = this.j0;
                        right = left - i;
                    }
                } else {
                    ao3 ao3Var2 = (ao3) childAt4.getLayoutParams();
                    if (z) {
                        left = childAt4.getLeft() - ((LinearLayout.LayoutParams) ao3Var2).leftMargin;
                        i = this.j0;
                        right = left - i;
                    } else {
                        right = childAt4.getRight() + ((LinearLayout.LayoutParams) ao3Var2).rightMargin;
                    }
                }
                e(canvas, right);
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a9  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r23, int r24, int r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bo3.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:232:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x051f  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0146  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r39, int r40) {
        /*
            Method dump skipped, instructions count: 2139
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bo3.onMeasure(int, int):void");
    }

    public void setBaselineAligned(boolean z) {
        this.A = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i >= 0 && i < getChildCount()) {
            this.B = i;
        } else {
            i.f(getChildCount(), ")", "base aligned child index out of range (0, ");
        }
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.i0) {
            return;
        }
        this.i0 = drawable;
        boolean z = false;
        if (drawable != null) {
            this.j0 = drawable.getIntrinsicWidth();
            this.k0 = drawable.getIntrinsicHeight();
        } else {
            this.j0 = 0;
            this.k0 = 0;
        }
        if (drawable == null) {
            z = true;
        }
        setWillNotDraw(z);
        requestLayout();
    }

    public void setDividerPadding(int i) {
        this.m0 = i;
    }

    public void setGravity(int i) {
        if (this.c0 != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.c0 = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.c0;
        if ((8388615 & i3) != i2) {
            this.c0 = i2 | ((-8388616) & i3);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.f0 = z;
    }

    public void setOrientation(int i) {
        if (this.R != i) {
            this.R = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.l0) {
            requestLayout();
        }
        this.l0 = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.c0;
        if ((i3 & 112) != i2) {
            this.c0 = i2 | (i3 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.e0 = Math.max((float) RecyclerView.A1, f);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
