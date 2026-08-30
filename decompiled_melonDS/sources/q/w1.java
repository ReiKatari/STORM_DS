package q;

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
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class w1 extends ViewGroup {
    public boolean A;
    public int B;
    public int L;
    public int R;

    /* renamed from: b0  reason: collision with root package name */
    public int f12042b0;

    /* renamed from: c0  reason: collision with root package name */
    public int f12043c0;

    /* renamed from: d0  reason: collision with root package name */
    public float f12044d0;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f12045e0;

    /* renamed from: f0  reason: collision with root package name */
    public int[] f12046f0;

    /* renamed from: g0  reason: collision with root package name */
    public int[] f12047g0;

    /* renamed from: h0  reason: collision with root package name */
    public Drawable f12048h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f12049i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f12050j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f12051k0;

    /* renamed from: l0  reason: collision with root package name */
    public int f12052l0;

    public w1(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.A = true;
        this.B = -1;
        this.L = 0;
        this.f12042b0 = 8388659;
        int[] iArr = k.a.f7923n;
        p1.c1 o5 = p1.c1.o(context, attributeSet, iArr, i2);
        a6.x0.n(this, context, iArr, attributeSet, (TypedArray) o5.B, i2);
        TypedArray typedArray = (TypedArray) o5.B;
        int i10 = typedArray.getInt(1, -1);
        if (i10 >= 0) {
            setOrientation(i10);
        }
        int i11 = typedArray.getInt(0, -1);
        if (i11 >= 0) {
            setGravity(i11);
        }
        boolean z10 = typedArray.getBoolean(2, true);
        if (!z10) {
            setBaselineAligned(z10);
        }
        this.f12044d0 = typedArray.getFloat(4, -1.0f);
        this.B = typedArray.getInt(3, -1);
        this.f12045e0 = typedArray.getBoolean(7, false);
        setDividerDrawable(o5.h(5));
        this.f12051k0 = typedArray.getInt(8, 0);
        this.f12052l0 = typedArray.getDimensionPixelSize(6, 0);
        o5.p();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof v1;
    }

    public final void d(Canvas canvas, int i2) {
        this.f12048h0.setBounds(getPaddingLeft() + this.f12052l0, i2, (getWidth() - getPaddingRight()) - this.f12052l0, this.f12050j0 + i2);
        this.f12048h0.draw(canvas);
    }

    public final void e(Canvas canvas, int i2) {
        this.f12048h0.setBounds(i2, getPaddingTop() + this.f12052l0, this.f12049i0 + i2, (getHeight() - getPaddingBottom()) - this.f12052l0);
        this.f12048h0.draw(canvas);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.widget.LinearLayout$LayoutParams, q.v1] */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.widget.LinearLayout$LayoutParams, q.v1] */
    @Override // android.view.ViewGroup
    /* renamed from: f */
    public v1 generateDefaultLayoutParams() {
        int i2 = this.R;
        if (i2 == 0) {
            return new LinearLayout.LayoutParams(-2, -2);
        }
        if (i2 == 1) {
            return new LinearLayout.LayoutParams(-1, -2);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.widget.LinearLayout$LayoutParams, q.v1] */
    @Override // android.view.ViewGroup
    /* renamed from: g */
    public v1 generateLayoutParams(AttributeSet attributeSet) {
        return new LinearLayout.LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i2;
        if (this.B < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i10 = this.B;
        if (childCount > i10) {
            View childAt = getChildAt(i10);
            int baseline = childAt.getBaseline();
            if (baseline == -1) {
                if (this.B == 0) {
                    return -1;
                }
                m9.o.r("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
                return 0;
            }
            int i11 = this.L;
            if (this.R == 1 && (i2 = this.f12042b0 & 112) != 48) {
                if (i2 != 16) {
                    if (i2 == 80) {
                        i11 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f12043c0;
                    }
                } else {
                    i11 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f12043c0) / 2;
                }
            }
            return i11 + ((LinearLayout.LayoutParams) ((v1) childAt.getLayoutParams())).topMargin + baseline;
        }
        m9.o.r("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        return 0;
    }

    public int getBaselineAlignedChildIndex() {
        return this.B;
    }

    public Drawable getDividerDrawable() {
        return this.f12048h0;
    }

    public int getDividerPadding() {
        return this.f12052l0;
    }

    public int getDividerWidth() {
        return this.f12049i0;
    }

    public int getGravity() {
        return this.f12042b0;
    }

    public int getOrientation() {
        return this.R;
    }

    public int getShowDividers() {
        return this.f12051k0;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f12044d0;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.widget.LinearLayout$LayoutParams, q.v1] */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.widget.LinearLayout$LayoutParams, q.v1] */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.widget.LinearLayout$LayoutParams, q.v1] */
    @Override // android.view.ViewGroup
    /* renamed from: h */
    public v1 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof v1) {
            return new LinearLayout.LayoutParams((ViewGroup.MarginLayoutParams) ((v1) layoutParams));
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LinearLayout.LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LinearLayout.LayoutParams(layoutParams);
    }

    public final boolean i(int i2) {
        if (i2 == 0) {
            if ((this.f12051k0 & 1) == 0) {
                return false;
            }
            return true;
        }
        int childCount = getChildCount();
        int i10 = this.f12051k0;
        if (i2 == childCount) {
            if ((i10 & 4) == 0) {
                return false;
            }
            return true;
        }
        if ((i10 & 2) != 0) {
            for (int i11 = i2 - 1; i11 >= 0; i11--) {
                if (getChildAt(i11).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z10;
        int right;
        int left;
        int i2;
        int left2;
        int bottom;
        if (this.f12048h0 != null) {
            int i10 = 0;
            if (this.R == 1) {
                int virtualChildCount = getVirtualChildCount();
                while (i10 < virtualChildCount) {
                    View childAt = getChildAt(i10);
                    if (childAt != null && childAt.getVisibility() != 8 && i(i10)) {
                        d(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((v1) childAt.getLayoutParams())).topMargin) - this.f12050j0);
                    }
                    i10++;
                }
                if (i(virtualChildCount)) {
                    View childAt2 = getChildAt(virtualChildCount - 1);
                    if (childAt2 == null) {
                        bottom = (getHeight() - getPaddingBottom()) - this.f12050j0;
                    } else {
                        bottom = childAt2.getBottom() + ((LinearLayout.LayoutParams) ((v1) childAt2.getLayoutParams())).bottomMargin;
                    }
                    d(canvas, bottom);
                    return;
                }
                return;
            }
            int virtualChildCount2 = getVirtualChildCount();
            boolean z11 = u3.f12027a;
            if (getLayoutDirection() == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            while (i10 < virtualChildCount2) {
                View childAt3 = getChildAt(i10);
                if (childAt3 != null && childAt3.getVisibility() != 8 && i(i10)) {
                    v1 v1Var = (v1) childAt3.getLayoutParams();
                    if (z10) {
                        left2 = childAt3.getRight() + ((LinearLayout.LayoutParams) v1Var).rightMargin;
                    } else {
                        left2 = (childAt3.getLeft() - ((LinearLayout.LayoutParams) v1Var).leftMargin) - this.f12049i0;
                    }
                    e(canvas, left2);
                }
                i10++;
            }
            if (i(virtualChildCount2)) {
                View childAt4 = getChildAt(virtualChildCount2 - 1);
                if (childAt4 == null) {
                    if (z10) {
                        right = getPaddingLeft();
                    } else {
                        left = getWidth() - getPaddingRight();
                        i2 = this.f12049i0;
                        right = left - i2;
                    }
                } else {
                    v1 v1Var2 = (v1) childAt4.getLayoutParams();
                    if (z10) {
                        left = childAt4.getLeft() - ((LinearLayout.LayoutParams) v1Var2).leftMargin;
                        i2 = this.f12049i0;
                        right = left - i2;
                    } else {
                        right = childAt4.getRight() + ((LinearLayout.LayoutParams) v1Var2).rightMargin;
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
        throw new UnsupportedOperationException("Method not decompiled: q.w1.onLayout(boolean, int, int, int, int):void");
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
        throw new UnsupportedOperationException("Method not decompiled: q.w1.onMeasure(int, int):void");
    }

    public void setBaselineAligned(boolean z10) {
        this.A = z10;
    }

    public void setBaselineAlignedChildIndex(int i2) {
        if (i2 >= 0 && i2 < getChildCount()) {
            this.B = i2;
            return;
        }
        int childCount = getChildCount();
        throw new IllegalArgumentException("base aligned child index out of range (0, " + childCount + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f12048h0) {
            return;
        }
        this.f12048h0 = drawable;
        boolean z10 = false;
        if (drawable != null) {
            this.f12049i0 = drawable.getIntrinsicWidth();
            this.f12050j0 = drawable.getIntrinsicHeight();
        } else {
            this.f12049i0 = 0;
            this.f12050j0 = 0;
        }
        if (drawable == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        requestLayout();
    }

    public void setDividerPadding(int i2) {
        this.f12052l0 = i2;
    }

    public void setGravity(int i2) {
        if (this.f12042b0 != i2) {
            if ((8388615 & i2) == 0) {
                i2 |= 8388611;
            }
            if ((i2 & 112) == 0) {
                i2 |= 48;
            }
            this.f12042b0 = i2;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i2) {
        int i10 = i2 & 8388615;
        int i11 = this.f12042b0;
        if ((8388615 & i11) != i10) {
            this.f12042b0 = i10 | ((-8388616) & i11);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z10) {
        this.f12045e0 = z10;
    }

    public void setOrientation(int i2) {
        if (this.R != i2) {
            this.R = i2;
            requestLayout();
        }
    }

    public void setShowDividers(int i2) {
        if (i2 != this.f12051k0) {
            requestLayout();
        }
        this.f12051k0 = i2;
    }

    public void setVerticalGravity(int i2) {
        int i10 = i2 & 112;
        int i11 = this.f12042b0;
        if ((i11 & 112) != i10) {
            this.f12042b0 = i10 | (i11 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f8) {
        this.f12044d0 = Math.max(0.0f, f8);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
