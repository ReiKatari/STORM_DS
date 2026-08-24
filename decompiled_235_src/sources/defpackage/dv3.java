package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dv3  reason: default package */
/* loaded from: classes.dex */
public abstract class dv3 extends ViewGroup {
    public boolean A;
    public int B;
    public int L;
    public int R;
    public int d0;
    public int e0;
    public float f0;
    public boolean g0;
    public int[] h0;
    public int[] i0;
    public Drawable j0;
    public int k0;
    public int l0;
    public int m0;
    public int n0;

    public dv3(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A = true;
        this.B = -1;
        this.L = 0;
        this.d0 = 8388659;
        int[] iArr = m75.n;
        m44 A = m44.A(context, attributeSet, iArr, i);
        ao7.m(this, context, iArr, attributeSet, (TypedArray) A.L, i);
        TypedArray typedArray = (TypedArray) A.L;
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
        this.f0 = typedArray.getFloat(4, -1.0f);
        this.B = typedArray.getInt(3, -1);
        this.g0 = typedArray.getBoolean(7, false);
        setDividerDrawable(A.k(5));
        this.m0 = typedArray.getInt(8, 0);
        this.n0 = typedArray.getDimensionPixelSize(6, 0);
        A.D();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof cv3;
    }

    public final void d(Canvas canvas, int i) {
        this.j0.setBounds(getPaddingLeft() + this.n0, i, (getWidth() - getPaddingRight()) - this.n0, this.l0 + i);
        this.j0.draw(canvas);
    }

    public final void e(Canvas canvas, int i) {
        this.j0.setBounds(i, getPaddingTop() + this.n0, this.k0 + i, (getHeight() - getPaddingBottom()) - this.n0);
        this.j0.draw(canvas);
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [cv3, android.widget.LinearLayout$LayoutParams] */
    /* JADX WARN: Type inference failed for: r2v4, types: [cv3, android.widget.LinearLayout$LayoutParams] */
    @Override // android.view.ViewGroup
    /* renamed from: f */
    public cv3 generateDefaultLayoutParams() {
        int i = this.R;
        if (i == 0) {
            return new LinearLayout.LayoutParams(-2, -2);
        }
        if (i == 1) {
            return new LinearLayout.LayoutParams(-1, -2);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [cv3, android.widget.LinearLayout$LayoutParams] */
    @Override // android.view.ViewGroup
    /* renamed from: g */
    public cv3 generateLayoutParams(AttributeSet attributeSet) {
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
                u34.j("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
                return 0;
            }
            int i3 = this.L;
            if (this.R == 1 && (i = this.d0 & 112) != 48) {
                if (i != 16) {
                    if (i == 80) {
                        i3 = ((getBottom() - getTop()) - getPaddingBottom()) - this.e0;
                    }
                } else {
                    i3 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.e0) / 2;
                }
            }
            return i3 + ((LinearLayout.LayoutParams) ((cv3) childAt.getLayoutParams())).topMargin + baseline;
        }
        u34.j("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        return 0;
    }

    public int getBaselineAlignedChildIndex() {
        return this.B;
    }

    public Drawable getDividerDrawable() {
        return this.j0;
    }

    public int getDividerPadding() {
        return this.n0;
    }

    public int getDividerWidth() {
        return this.k0;
    }

    public int getGravity() {
        return this.d0;
    }

    public int getOrientation() {
        return this.R;
    }

    public int getShowDividers() {
        return this.m0;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f0;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [cv3, android.widget.LinearLayout$LayoutParams] */
    /* JADX WARN: Type inference failed for: r0v4, types: [cv3, android.widget.LinearLayout$LayoutParams] */
    /* JADX WARN: Type inference failed for: r0v5, types: [cv3, android.widget.LinearLayout$LayoutParams] */
    @Override // android.view.ViewGroup
    /* renamed from: h */
    public cv3 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof cv3) {
            return new LinearLayout.LayoutParams((ViewGroup.MarginLayoutParams) ((cv3) layoutParams));
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LinearLayout.LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LinearLayout.LayoutParams(layoutParams);
    }

    public final boolean i(int i) {
        if (i == 0) {
            if ((this.m0 & 1) == 0) {
                return false;
            }
            return true;
        }
        int childCount = getChildCount();
        int i2 = this.m0;
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
        if (this.j0 != null) {
            int i2 = 0;
            if (this.R == 1) {
                int virtualChildCount = getVirtualChildCount();
                while (i2 < virtualChildCount) {
                    View childAt = getChildAt(i2);
                    if (childAt != null && childAt.getVisibility() != 8 && i(i2)) {
                        d(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((cv3) childAt.getLayoutParams())).topMargin) - this.l0);
                    }
                    i2++;
                }
                if (i(virtualChildCount)) {
                    View childAt2 = getChildAt(virtualChildCount - 1);
                    if (childAt2 == null) {
                        bottom = (getHeight() - getPaddingBottom()) - this.l0;
                    } else {
                        bottom = childAt2.getBottom() + ((LinearLayout.LayoutParams) ((cv3) childAt2.getLayoutParams())).bottomMargin;
                    }
                    d(canvas, bottom);
                    return;
                }
                return;
            }
            int virtualChildCount2 = getVirtualChildCount();
            boolean z2 = eq7.a;
            if (getLayoutDirection() == 1) {
                z = true;
            } else {
                z = false;
            }
            while (i2 < virtualChildCount2) {
                View childAt3 = getChildAt(i2);
                if (childAt3 != null && childAt3.getVisibility() != 8 && i(i2)) {
                    cv3 cv3Var = (cv3) childAt3.getLayoutParams();
                    if (z) {
                        left2 = childAt3.getRight() + ((LinearLayout.LayoutParams) cv3Var).rightMargin;
                    } else {
                        left2 = (childAt3.getLeft() - ((LinearLayout.LayoutParams) cv3Var).leftMargin) - this.k0;
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
                        i = this.k0;
                        right = left - i;
                    }
                } else {
                    cv3 cv3Var2 = (cv3) childAt4.getLayoutParams();
                    if (z) {
                        left = childAt4.getLeft() - ((LinearLayout.LayoutParams) cv3Var2).leftMargin;
                        i = this.k0;
                        right = left - i;
                    } else {
                        right = childAt4.getRight() + ((LinearLayout.LayoutParams) cv3Var2).rightMargin;
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
    */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        int paddingLeft;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int paddingTop;
        char c;
        int i15;
        int i16;
        int i17;
        int i18 = 8;
        char c2 = 2;
        if (this.R == 1) {
            int paddingLeft2 = getPaddingLeft();
            int i19 = i3 - i;
            int paddingRight = i19 - getPaddingRight();
            int paddingRight2 = (i19 - paddingLeft2) - getPaddingRight();
            int virtualChildCount = getVirtualChildCount();
            int i20 = this.d0;
            int i21 = i20 & 112;
            int i22 = 8388615 & i20;
            if (i21 != 16) {
                if (i21 != 80) {
                    paddingTop = getPaddingTop();
                } else {
                    paddingTop = ((getPaddingTop() + i4) - i2) - this.e0;
                }
            } else {
                paddingTop = getPaddingTop() + (((i4 - i2) - this.e0) / 2);
            }
            int i23 = 0;
            while (i23 < virtualChildCount) {
                View childAt = getChildAt(i23);
                if (childAt == null || childAt.getVisibility() == i18) {
                    c = c2;
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    cv3 cv3Var = (cv3) childAt.getLayoutParams();
                    c = c2;
                    int i24 = ((LinearLayout.LayoutParams) cv3Var).gravity;
                    if (i24 < 0) {
                        i24 = i22;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i24, getLayoutDirection()) & 7;
                    if (absoluteGravity != 1) {
                        if (absoluteGravity != 5) {
                            i17 = ((LinearLayout.LayoutParams) cv3Var).leftMargin + paddingLeft2;
                            if (i(i23)) {
                                paddingTop += this.l0;
                            }
                            int i25 = paddingTop + ((LinearLayout.LayoutParams) cv3Var).topMargin;
                            childAt.layout(i17, i25, measuredWidth + i17, i25 + measuredHeight);
                            paddingTop = measuredHeight + ((LinearLayout.LayoutParams) cv3Var).bottomMargin + i25;
                        } else {
                            i15 = paddingRight - measuredWidth;
                            i16 = ((LinearLayout.LayoutParams) cv3Var).rightMargin;
                        }
                    } else {
                        i15 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft2 + ((LinearLayout.LayoutParams) cv3Var).leftMargin;
                        i16 = ((LinearLayout.LayoutParams) cv3Var).rightMargin;
                    }
                    i17 = i15 - i16;
                    if (i(i23)) {
                    }
                    int i252 = paddingTop + ((LinearLayout.LayoutParams) cv3Var).topMargin;
                    childAt.layout(i17, i252, measuredWidth + i17, i252 + measuredHeight);
                    paddingTop = measuredHeight + ((LinearLayout.LayoutParams) cv3Var).bottomMargin + i252;
                }
                i23++;
                c2 = c;
                i18 = 8;
            }
            return;
        }
        boolean z3 = eq7.a;
        if (getLayoutDirection() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        int paddingTop2 = getPaddingTop();
        int i26 = i4 - i2;
        int paddingBottom = i26 - getPaddingBottom();
        int paddingBottom2 = (i26 - paddingTop2) - getPaddingBottom();
        int virtualChildCount2 = getVirtualChildCount();
        int i27 = this.d0;
        int i28 = 8388615 & i27;
        int i29 = i27 & 112;
        boolean z4 = this.A;
        int[] iArr = this.h0;
        int[] iArr2 = this.i0;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i28, getLayoutDirection());
        if (absoluteGravity2 != 1) {
            if (absoluteGravity2 != 5) {
                paddingLeft = getPaddingLeft();
            } else {
                paddingLeft = ((getPaddingLeft() + i3) - i) - this.e0;
            }
        } else {
            paddingLeft = getPaddingLeft() + (((i3 - i) - this.e0) / 2);
        }
        if (z2) {
            i6 = virtualChildCount2 - 1;
            i5 = -1;
        } else {
            i5 = 1;
            i6 = 0;
        }
        int i30 = 0;
        while (i30 < virtualChildCount2) {
            int i31 = (i5 * i30) + i6;
            View childAt2 = getChildAt(i31);
            if (childAt2 == null) {
                i7 = i6;
            } else {
                i7 = i6;
                if (childAt2.getVisibility() != 8) {
                    int measuredWidth2 = childAt2.getMeasuredWidth();
                    int measuredHeight2 = childAt2.getMeasuredHeight();
                    cv3 cv3Var2 = (cv3) childAt2.getLayoutParams();
                    int i32 = paddingLeft;
                    if (z4) {
                        i8 = paddingTop2;
                        if (((LinearLayout.LayoutParams) cv3Var2).height != -1) {
                            i9 = childAt2.getBaseline();
                            i10 = ((LinearLayout.LayoutParams) cv3Var2).gravity;
                            if (i10 < 0) {
                                i10 = i29;
                            }
                            i11 = i10 & 112;
                            if (i11 == 16) {
                                if (i11 != 48) {
                                    if (i11 != 80) {
                                        i12 = i8;
                                    } else {
                                        i12 = (paddingBottom - measuredHeight2) - ((LinearLayout.LayoutParams) cv3Var2).bottomMargin;
                                        if (i9 != -1) {
                                            i13 = iArr2[2] - (childAt2.getMeasuredHeight() - i9);
                                        }
                                    }
                                } else {
                                    i12 = i8 + ((LinearLayout.LayoutParams) cv3Var2).topMargin;
                                    if (i9 != -1) {
                                        i12 = (iArr[1] - i9) + i12;
                                    }
                                }
                                if (i(i31)) {
                                    i14 = i32 + this.k0;
                                } else {
                                    i14 = i32;
                                }
                                int i33 = i14 + ((LinearLayout.LayoutParams) cv3Var2).leftMargin;
                                childAt2.layout(i33, i12, i33 + measuredWidth2, i12 + measuredHeight2);
                                paddingLeft = measuredWidth2 + ((LinearLayout.LayoutParams) cv3Var2).rightMargin + i33;
                                i30++;
                                i6 = i7;
                                paddingTop2 = i8;
                            } else {
                                i12 = ((paddingBottom2 - measuredHeight2) / 2) + i8 + ((LinearLayout.LayoutParams) cv3Var2).topMargin;
                                i13 = ((LinearLayout.LayoutParams) cv3Var2).bottomMargin;
                            }
                            i12 -= i13;
                            if (i(i31)) {
                            }
                            int i332 = i14 + ((LinearLayout.LayoutParams) cv3Var2).leftMargin;
                            childAt2.layout(i332, i12, i332 + measuredWidth2, i12 + measuredHeight2);
                            paddingLeft = measuredWidth2 + ((LinearLayout.LayoutParams) cv3Var2).rightMargin + i332;
                            i30++;
                            i6 = i7;
                            paddingTop2 = i8;
                        }
                    } else {
                        i8 = paddingTop2;
                    }
                    i9 = -1;
                    i10 = ((LinearLayout.LayoutParams) cv3Var2).gravity;
                    if (i10 < 0) {
                    }
                    i11 = i10 & 112;
                    if (i11 == 16) {
                    }
                    i12 -= i13;
                    if (i(i31)) {
                    }
                    int i3322 = i14 + ((LinearLayout.LayoutParams) cv3Var2).leftMargin;
                    childAt2.layout(i3322, i12, i3322 + measuredWidth2, i12 + measuredHeight2);
                    paddingLeft = measuredWidth2 + ((LinearLayout.LayoutParams) cv3Var2).rightMargin + i3322;
                    i30++;
                    i6 = i7;
                    paddingTop2 = i8;
                }
            }
            i8 = paddingTop2;
            i30++;
            i6 = i7;
            paddingTop2 = i8;
        }
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
    */
    public void onMeasure(int i, int i2) {
        boolean z;
        int max;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z2;
        int i8;
        boolean z3;
        int baseline;
        int i9;
        int i10;
        int i11;
        int[] iArr;
        int i12;
        int i13;
        boolean z4;
        boolean z5;
        cv3 cv3Var;
        int i14;
        int[] iArr2;
        int i15;
        View view;
        int i16;
        boolean z6;
        boolean z7;
        boolean z8;
        int max2;
        int i17;
        int i18;
        int i19;
        boolean z9;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        boolean z10;
        int i25;
        int i26;
        int i27;
        View view2;
        boolean z11;
        boolean z12;
        dv3 dv3Var = this;
        int i28 = -2;
        int i29 = 0;
        int i30 = 1073741824;
        int i31 = 8;
        if (dv3Var.R == 1) {
            dv3Var.e0 = 0;
            int virtualChildCount = dv3Var.getVirtualChildCount();
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int i32 = dv3Var.B;
            boolean z13 = dv3Var.g0;
            int i33 = 0;
            int i34 = 0;
            int i35 = 0;
            boolean z14 = false;
            int i36 = 0;
            boolean z15 = false;
            boolean z16 = true;
            float f = RecyclerView.B1;
            int i37 = 0;
            while (i33 < virtualChildCount) {
                int i38 = mode;
                View childAt = dv3Var.getChildAt(i33);
                if (childAt == null) {
                    dv3Var.e0 = dv3Var.e0;
                } else if (childAt.getVisibility() != i31) {
                    if (dv3Var.i(i33)) {
                        dv3Var.e0 += dv3Var.l0;
                    }
                    cv3 cv3Var2 = (cv3) childAt.getLayoutParams();
                    float f2 = ((LinearLayout.LayoutParams) cv3Var2).weight;
                    f += f2;
                    if (mode2 == i30 && ((LinearLayout.LayoutParams) cv3Var2).height == 0 && f2 > RecyclerView.B1) {
                        int i39 = dv3Var.e0;
                        dv3Var.e0 = Math.max(i39, ((LinearLayout.LayoutParams) cv3Var2).topMargin + i39 + ((LinearLayout.LayoutParams) cv3Var2).bottomMargin);
                        view2 = childAt;
                        i24 = mode2;
                        i25 = i32;
                        z10 = z13;
                        i26 = i33;
                        z14 = true;
                        i27 = i38;
                    } else {
                        if (((LinearLayout.LayoutParams) cv3Var2).height == 0 && f2 > RecyclerView.B1) {
                            ((LinearLayout.LayoutParams) cv3Var2).height = i28;
                            i21 = 0;
                        } else {
                            i21 = Integer.MIN_VALUE;
                        }
                        if (f == RecyclerView.B1) {
                            i22 = i33;
                            i23 = dv3Var.e0;
                        } else {
                            i22 = i33;
                            i23 = 0;
                        }
                        i24 = mode2;
                        z10 = z13;
                        i25 = i32;
                        i26 = i22;
                        i27 = i38;
                        dv3Var.measureChildWithMargins(childAt, i, 0, i2, i23);
                        if (i21 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) cv3Var2).height = i21;
                        }
                        int measuredHeight = childAt.getMeasuredHeight();
                        int i40 = dv3Var.e0;
                        view2 = childAt;
                        dv3Var.e0 = Math.max(i40, i40 + measuredHeight + ((LinearLayout.LayoutParams) cv3Var2).topMargin + ((LinearLayout.LayoutParams) cv3Var2).bottomMargin);
                        if (z10) {
                            i37 = Math.max(measuredHeight, i37);
                        }
                    }
                    if (i25 >= 0 && i25 == i26 + 1) {
                        dv3Var.L = dv3Var.e0;
                    }
                    if (i26 < i25 && ((LinearLayout.LayoutParams) cv3Var2).weight > RecyclerView.B1) {
                        u34.j("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                        return;
                    }
                    if (i27 != 1073741824 && ((LinearLayout.LayoutParams) cv3Var2).width == -1) {
                        z11 = true;
                        z15 = true;
                    } else {
                        z11 = false;
                    }
                    int i41 = ((LinearLayout.LayoutParams) cv3Var2).leftMargin + ((LinearLayout.LayoutParams) cv3Var2).rightMargin;
                    int measuredWidth = view2.getMeasuredWidth() + i41;
                    i29 = Math.max(i29, measuredWidth);
                    int measuredState = view2.getMeasuredState();
                    boolean z17 = z11;
                    int combineMeasuredStates = View.combineMeasuredStates(i36, measuredState);
                    if (z16) {
                        i36 = combineMeasuredStates;
                        if (((LinearLayout.LayoutParams) cv3Var2).width == -1) {
                            z12 = true;
                            if (((LinearLayout.LayoutParams) cv3Var2).weight <= RecyclerView.B1) {
                                if (!z17) {
                                    i41 = measuredWidth;
                                }
                                i35 = Math.max(i35, i41);
                            } else {
                                if (!z17) {
                                    i41 = measuredWidth;
                                }
                                i34 = Math.max(i34, i41);
                            }
                            z16 = z12;
                            i33 = i26 + 1;
                            i32 = i25;
                            mode = i27;
                            z13 = z10;
                            mode2 = i24;
                            i28 = -2;
                            i30 = 1073741824;
                            i31 = 8;
                        }
                    } else {
                        i36 = combineMeasuredStates;
                    }
                    z12 = false;
                    if (((LinearLayout.LayoutParams) cv3Var2).weight <= RecyclerView.B1) {
                    }
                    z16 = z12;
                    i33 = i26 + 1;
                    i32 = i25;
                    mode = i27;
                    z13 = z10;
                    mode2 = i24;
                    i28 = -2;
                    i30 = 1073741824;
                    i31 = 8;
                }
                i24 = mode2;
                i25 = i32;
                z10 = z13;
                i26 = i33;
                i27 = i38;
                i33 = i26 + 1;
                i32 = i25;
                mode = i27;
                z13 = z10;
                mode2 = i24;
                i28 = -2;
                i30 = 1073741824;
                i31 = 8;
            }
            int i42 = mode;
            int i43 = mode2;
            boolean z18 = z13;
            int i44 = i36;
            int i45 = i2;
            if (dv3Var.e0 > 0 && dv3Var.i(virtualChildCount)) {
                dv3Var.e0 += dv3Var.l0;
            }
            if (z18 && (i43 == Integer.MIN_VALUE || i43 == 0)) {
                dv3Var.e0 = 0;
                for (int i46 = 0; i46 < virtualChildCount; i46++) {
                    View childAt2 = dv3Var.getChildAt(i46);
                    if (childAt2 == null) {
                        dv3Var.e0 = dv3Var.e0;
                    } else if (childAt2.getVisibility() != 8) {
                        cv3 cv3Var3 = (cv3) childAt2.getLayoutParams();
                        int i47 = dv3Var.e0;
                        dv3Var.e0 = Math.max(i47, i47 + i37 + ((LinearLayout.LayoutParams) cv3Var3).topMargin + ((LinearLayout.LayoutParams) cv3Var3).bottomMargin);
                    }
                }
            }
            int paddingBottom = dv3Var.getPaddingBottom() + dv3Var.getPaddingTop() + dv3Var.e0;
            dv3Var.e0 = paddingBottom;
            int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingBottom, dv3Var.getSuggestedMinimumHeight()), i45, 0);
            int i48 = (resolveSizeAndState & 16777215) - dv3Var.e0;
            if (!z14 && (i48 == 0 || f <= RecyclerView.B1)) {
                i34 = Math.max(i34, i35);
                if (z18 && i43 != 1073741824) {
                    for (int i49 = 0; i49 < virtualChildCount; i49++) {
                        View childAt3 = dv3Var.getChildAt(i49);
                        if (childAt3 != null && childAt3.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((cv3) childAt3.getLayoutParams())).weight > RecyclerView.B1) {
                            childAt3.measure(View.MeasureSpec.makeMeasureSpec(childAt3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i37, 1073741824));
                        }
                    }
                }
            } else {
                float f3 = dv3Var.f0;
                if (f3 > RecyclerView.B1) {
                    f = f3;
                }
                dv3Var.e0 = 0;
                int i50 = i44;
                int i51 = 0;
                while (i51 < virtualChildCount) {
                    View childAt4 = dv3Var.getChildAt(i51);
                    if (childAt4.getVisibility() == 8) {
                        i18 = i51;
                    } else {
                        cv3 cv3Var4 = (cv3) childAt4.getLayoutParams();
                        float f4 = ((LinearLayout.LayoutParams) cv3Var4).weight;
                        if (f4 > RecyclerView.B1) {
                            int i52 = (int) ((i48 * f4) / f);
                            f -= f4;
                            i48 -= i52;
                            i18 = i51;
                            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, dv3Var.getPaddingRight() + dv3Var.getPaddingLeft() + ((LinearLayout.LayoutParams) cv3Var4).leftMargin + ((LinearLayout.LayoutParams) cv3Var4).rightMargin, ((LinearLayout.LayoutParams) cv3Var4).width);
                            if (((LinearLayout.LayoutParams) cv3Var4).height == 0) {
                                i20 = 1073741824;
                                if (i43 == 1073741824) {
                                    if (i52 <= 0) {
                                        i52 = 0;
                                    }
                                    childAt4.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i52, 1073741824));
                                    i50 = View.combineMeasuredStates(i50, childAt4.getMeasuredState() & (-256));
                                }
                            } else {
                                i20 = 1073741824;
                            }
                            int measuredHeight2 = childAt4.getMeasuredHeight() + i52;
                            if (measuredHeight2 < 0) {
                                measuredHeight2 = 0;
                            }
                            childAt4.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight2, i20));
                            i50 = View.combineMeasuredStates(i50, childAt4.getMeasuredState() & (-256));
                        } else {
                            i18 = i51;
                        }
                        int i53 = ((LinearLayout.LayoutParams) cv3Var4).leftMargin + ((LinearLayout.LayoutParams) cv3Var4).rightMargin;
                        int measuredWidth2 = childAt4.getMeasuredWidth() + i53;
                        i29 = Math.max(i29, measuredWidth2);
                        if (i42 != 1073741824) {
                            i19 = -1;
                            if (((LinearLayout.LayoutParams) cv3Var4).width == -1) {
                                measuredWidth2 = i53;
                            }
                        } else {
                            i19 = -1;
                        }
                        i34 = Math.max(i34, measuredWidth2);
                        if (z16 && ((LinearLayout.LayoutParams) cv3Var4).width == i19) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        int i54 = dv3Var.e0;
                        dv3Var.e0 = Math.max(i54, childAt4.getMeasuredHeight() + i54 + ((LinearLayout.LayoutParams) cv3Var4).topMargin + ((LinearLayout.LayoutParams) cv3Var4).bottomMargin);
                        z16 = z9;
                    }
                    i51 = i18 + 1;
                }
                dv3Var.e0 = dv3Var.getPaddingBottom() + dv3Var.getPaddingTop() + dv3Var.e0;
                i44 = i50;
            }
            if (z16 || i42 == 1073741824) {
                i34 = i29;
            }
            dv3Var.setMeasuredDimension(View.resolveSizeAndState(Math.max(dv3Var.getPaddingRight() + dv3Var.getPaddingLeft() + i34, dv3Var.getSuggestedMinimumWidth()), i, i44), resolveSizeAndState);
            if (z15) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(dv3Var.getMeasuredWidth(), 1073741824);
                int i55 = 0;
                while (i55 < virtualChildCount) {
                    View childAt5 = dv3Var.getChildAt(i55);
                    if (childAt5.getVisibility() != 8) {
                        cv3 cv3Var5 = (cv3) childAt5.getLayoutParams();
                        if (((LinearLayout.LayoutParams) cv3Var5).width == -1) {
                            int i56 = ((LinearLayout.LayoutParams) cv3Var5).height;
                            ((LinearLayout.LayoutParams) cv3Var5).height = childAt5.getMeasuredHeight();
                            dv3Var.measureChildWithMargins(childAt5, makeMeasureSpec, 0, i45, 0);
                            ((LinearLayout.LayoutParams) cv3Var5).height = i56;
                        }
                    }
                    i55++;
                    i45 = i2;
                }
                return;
            }
            return;
        }
        int i57 = i;
        dv3Var.e0 = 0;
        int virtualChildCount2 = dv3Var.getVirtualChildCount();
        int mode3 = View.MeasureSpec.getMode(i57);
        int mode4 = View.MeasureSpec.getMode(i2);
        if (dv3Var.h0 == null || dv3Var.i0 == null) {
            dv3Var.h0 = new int[4];
            dv3Var.i0 = new int[4];
        }
        int[] iArr3 = dv3Var.h0;
        int[] iArr4 = dv3Var.i0;
        iArr3[3] = -1;
        char c = 2;
        iArr3[2] = -1;
        iArr3[1] = -1;
        iArr3[0] = -1;
        iArr4[3] = -1;
        iArr4[2] = -1;
        iArr4[1] = -1;
        iArr4[0] = -1;
        boolean z19 = dv3Var.A;
        boolean z20 = dv3Var.g0;
        if (mode3 == 1073741824) {
            z = true;
        } else {
            z = false;
        }
        float f5 = 0.0f;
        boolean z21 = true;
        int i58 = 0;
        int i59 = 0;
        int i60 = 0;
        int i61 = 0;
        int i62 = 0;
        int i63 = 0;
        boolean z22 = false;
        boolean z23 = false;
        while (i58 < virtualChildCount2) {
            char c2 = c;
            View childAt6 = dv3Var.getChildAt(i58);
            if (childAt6 == null) {
                dv3Var.e0 = dv3Var.e0;
                i13 = i58;
                i17 = i60;
                iArr2 = iArr3;
                iArr = iArr4;
                z4 = z19;
                z5 = z20;
            } else {
                int i64 = i59;
                if (childAt6.getVisibility() == 8) {
                    i57 = i;
                    i13 = i58;
                    i17 = i60;
                    iArr = iArr4;
                    z4 = z19;
                    z5 = z20;
                    i59 = i64;
                    iArr2 = iArr3;
                } else {
                    if (dv3Var.i(i58)) {
                        dv3Var.e0 += dv3Var.k0;
                    }
                    cv3 cv3Var6 = (cv3) childAt6.getLayoutParams();
                    float f6 = ((LinearLayout.LayoutParams) cv3Var6).weight;
                    f5 += f6;
                    int i65 = i58;
                    if (mode3 == 1073741824 && ((LinearLayout.LayoutParams) cv3Var6).width == 0 && f6 > RecyclerView.B1) {
                        int i66 = dv3Var.e0;
                        int i67 = ((LinearLayout.LayoutParams) cv3Var6).leftMargin;
                        if (z) {
                            dv3Var.e0 = i67 + ((LinearLayout.LayoutParams) cv3Var6).rightMargin + i66;
                        } else {
                            dv3Var.e0 = Math.max(i66, i66 + i67 + ((LinearLayout.LayoutParams) cv3Var6).rightMargin);
                        }
                        if (z19) {
                            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                            childAt6.measure(makeMeasureSpec2, makeMeasureSpec2);
                            view = childAt6;
                            z4 = z19;
                            z5 = z20;
                            i14 = i64;
                            i13 = i65;
                            cv3Var = cv3Var6;
                            iArr2 = iArr3;
                            iArr = iArr4;
                            i57 = i;
                            i15 = i60;
                            i12 = i61;
                        } else {
                            view = childAt6;
                            z4 = z19;
                            z5 = z20;
                            z23 = true;
                            i14 = i64;
                            i13 = i65;
                            i16 = 1073741824;
                            cv3Var = cv3Var6;
                            iArr2 = iArr3;
                            iArr = iArr4;
                            i57 = i;
                            i15 = i60;
                            i12 = i61;
                            if (mode4 == i16 && ((LinearLayout.LayoutParams) cv3Var).height == -1) {
                                z6 = true;
                                z22 = true;
                            } else {
                                z6 = false;
                            }
                            int i68 = ((LinearLayout.LayoutParams) cv3Var).topMargin + ((LinearLayout.LayoutParams) cv3Var).bottomMargin;
                            int measuredHeight3 = view.getMeasuredHeight() + i68;
                            i63 = View.combineMeasuredStates(i63, view.getMeasuredState());
                            if (!z4) {
                                int baseline2 = view.getBaseline();
                                z7 = z6;
                                if (baseline2 != -1) {
                                    int i69 = ((LinearLayout.LayoutParams) cv3Var).gravity;
                                    if (i69 < 0) {
                                        i69 = dv3Var.d0;
                                    }
                                    int i70 = (((i69 & 112) >> 4) & (-2)) >> 1;
                                    iArr2[i70] = Math.max(iArr2[i70], baseline2);
                                    iArr[i70] = Math.max(iArr[i70], measuredHeight3 - baseline2);
                                }
                            } else {
                                z7 = z6;
                            }
                            int max3 = Math.max(i14, measuredHeight3);
                            if (!z21 && ((LinearLayout.LayoutParams) cv3Var).height == -1) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            if (((LinearLayout.LayoutParams) cv3Var).weight <= RecyclerView.B1) {
                                if (!z7) {
                                    i68 = measuredHeight3;
                                }
                                i61 = Math.max(i12, i68);
                                max2 = i15;
                            } else {
                                if (!z7) {
                                    i68 = measuredHeight3;
                                }
                                max2 = Math.max(i15, i68);
                                i61 = i12;
                            }
                            int i71 = max2;
                            i59 = max3;
                            i17 = i71;
                            z21 = z8;
                        }
                    } else {
                        if (((LinearLayout.LayoutParams) cv3Var6).width == 0 && f6 > RecyclerView.B1) {
                            ((LinearLayout.LayoutParams) cv3Var6).width = -2;
                            i10 = 0;
                        } else {
                            i10 = Integer.MIN_VALUE;
                        }
                        if (f5 == RecyclerView.B1) {
                            i11 = dv3Var.e0;
                        } else {
                            i11 = 0;
                        }
                        iArr = iArr4;
                        i12 = i61;
                        i13 = i65;
                        z4 = z19;
                        z5 = z20;
                        int i72 = i10;
                        cv3Var = cv3Var6;
                        i14 = i64;
                        i57 = i;
                        iArr2 = iArr3;
                        i15 = i60;
                        dv3Var.measureChildWithMargins(childAt6, i57, i11, i2, 0);
                        if (i72 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) cv3Var).width = i72;
                        }
                        int measuredWidth3 = childAt6.getMeasuredWidth();
                        int i73 = dv3Var.e0;
                        int i74 = ((LinearLayout.LayoutParams) cv3Var).leftMargin;
                        if (z) {
                            view = childAt6;
                            dv3Var.e0 = i74 + measuredWidth3 + ((LinearLayout.LayoutParams) cv3Var).rightMargin + i73;
                        } else {
                            view = childAt6;
                            dv3Var.e0 = Math.max(i73, i73 + measuredWidth3 + i74 + ((LinearLayout.LayoutParams) cv3Var).rightMargin);
                        }
                        if (z5) {
                            i62 = Math.max(measuredWidth3, i62);
                        }
                    }
                    i16 = 1073741824;
                    if (mode4 == i16) {
                    }
                    z6 = false;
                    int i682 = ((LinearLayout.LayoutParams) cv3Var).topMargin + ((LinearLayout.LayoutParams) cv3Var).bottomMargin;
                    int measuredHeight32 = view.getMeasuredHeight() + i682;
                    i63 = View.combineMeasuredStates(i63, view.getMeasuredState());
                    if (!z4) {
                    }
                    int max32 = Math.max(i14, measuredHeight32);
                    if (!z21) {
                    }
                    z8 = false;
                    if (((LinearLayout.LayoutParams) cv3Var).weight <= RecyclerView.B1) {
                    }
                    int i712 = max2;
                    i59 = max32;
                    i17 = i712;
                    z21 = z8;
                }
            }
            i60 = i17;
            i58 = i13 + 1;
            c = c2;
            iArr3 = iArr2;
            iArr4 = iArr;
            z19 = z4;
            z20 = z5;
        }
        int[] iArr5 = iArr3;
        int[] iArr6 = iArr4;
        char c3 = c;
        boolean z24 = z19;
        boolean z25 = z20;
        int i75 = i59;
        int i76 = i60;
        int i77 = i61;
        if (dv3Var.e0 > 0 && dv3Var.i(virtualChildCount2)) {
            dv3Var.e0 += dv3Var.k0;
        }
        int i78 = iArr5[1];
        if (i78 == -1 && iArr5[0] == -1 && iArr5[c3] == -1 && iArr5[3] == -1) {
            max = i75;
        } else {
            max = Math.max(i75, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[c3]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i78, iArr5[c3]))));
        }
        if (z25 && (mode3 == Integer.MIN_VALUE || mode3 == 0)) {
            dv3Var.e0 = 0;
            for (int i79 = 0; i79 < virtualChildCount2; i79++) {
                View childAt7 = dv3Var.getChildAt(i79);
                if (childAt7 == null) {
                    dv3Var.e0 = dv3Var.e0;
                } else if (childAt7.getVisibility() != 8) {
                    cv3 cv3Var7 = (cv3) childAt7.getLayoutParams();
                    int i80 = dv3Var.e0;
                    if (z) {
                        dv3Var.e0 = ((LinearLayout.LayoutParams) cv3Var7).leftMargin + i62 + ((LinearLayout.LayoutParams) cv3Var7).rightMargin + i80;
                    } else {
                        dv3Var.e0 = Math.max(i80, i80 + i62 + ((LinearLayout.LayoutParams) cv3Var7).leftMargin + ((LinearLayout.LayoutParams) cv3Var7).rightMargin);
                    }
                }
            }
        }
        int paddingRight = dv3Var.getPaddingRight() + dv3Var.getPaddingLeft() + dv3Var.e0;
        dv3Var.e0 = paddingRight;
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingRight, dv3Var.getSuggestedMinimumWidth()), i57, 0);
        int i81 = (resolveSizeAndState2 & 16777215) - dv3Var.e0;
        if (!z23 && (i81 == 0 || f5 <= RecyclerView.B1)) {
            i6 = Math.max(i76, i77);
            if (z25 && mode3 != 1073741824) {
                for (int i82 = 0; i82 < virtualChildCount2; i82++) {
                    View childAt8 = dv3Var.getChildAt(i82);
                    if (childAt8 != null && childAt8.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((cv3) childAt8.getLayoutParams())).weight > RecyclerView.B1) {
                        childAt8.measure(View.MeasureSpec.makeMeasureSpec(i62, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt8.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i3 = resolveSizeAndState2;
            i4 = -16777216;
            i5 = 0;
        } else {
            float f7 = dv3Var.f0;
            if (f7 > RecyclerView.B1) {
                f5 = f7;
            }
            iArr5[3] = -1;
            iArr5[c3] = -1;
            iArr5[1] = -1;
            iArr5[0] = -1;
            iArr6[3] = -1;
            iArr6[c3] = -1;
            iArr6[1] = -1;
            iArr6[0] = -1;
            dv3Var.e0 = 0;
            max = -1;
            int i83 = 0;
            while (i83 < virtualChildCount2) {
                View childAt9 = dv3Var.getChildAt(i83);
                if (childAt9 == null || childAt9.getVisibility() == 8) {
                    i7 = resolveSizeAndState2;
                } else {
                    cv3 cv3Var8 = (cv3) childAt9.getLayoutParams();
                    float f8 = ((LinearLayout.LayoutParams) cv3Var8).weight;
                    if (f8 > RecyclerView.B1) {
                        int i84 = (int) ((i81 * f8) / f5);
                        f5 -= f8;
                        i81 -= i84;
                        i7 = resolveSizeAndState2;
                        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i2, dv3Var.getPaddingBottom() + dv3Var.getPaddingTop() + ((LinearLayout.LayoutParams) cv3Var8).topMargin + ((LinearLayout.LayoutParams) cv3Var8).bottomMargin, ((LinearLayout.LayoutParams) cv3Var8).height);
                        if (((LinearLayout.LayoutParams) cv3Var8).width == 0) {
                            i9 = 1073741824;
                            if (mode3 == 1073741824) {
                                if (i84 <= 0) {
                                    i84 = 0;
                                }
                                childAt9.measure(View.MeasureSpec.makeMeasureSpec(i84, 1073741824), childMeasureSpec2);
                                i63 = View.combineMeasuredStates(i63, childAt9.getMeasuredState() & (-16777216));
                            }
                        } else {
                            i9 = 1073741824;
                        }
                        int measuredWidth4 = childAt9.getMeasuredWidth() + i84;
                        if (measuredWidth4 < 0) {
                            measuredWidth4 = 0;
                        }
                        childAt9.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth4, i9), childMeasureSpec2);
                        i63 = View.combineMeasuredStates(i63, childAt9.getMeasuredState() & (-16777216));
                    } else {
                        i7 = resolveSizeAndState2;
                    }
                    int i85 = dv3Var.e0;
                    if (z) {
                        dv3Var.e0 = childAt9.getMeasuredWidth() + ((LinearLayout.LayoutParams) cv3Var8).leftMargin + ((LinearLayout.LayoutParams) cv3Var8).rightMargin + i85;
                    } else {
                        dv3Var.e0 = Math.max(i85, childAt9.getMeasuredWidth() + i85 + ((LinearLayout.LayoutParams) cv3Var8).leftMargin + ((LinearLayout.LayoutParams) cv3Var8).rightMargin);
                    }
                    if (mode4 != 1073741824 && ((LinearLayout.LayoutParams) cv3Var8).height == -1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    int i86 = ((LinearLayout.LayoutParams) cv3Var8).topMargin + ((LinearLayout.LayoutParams) cv3Var8).bottomMargin;
                    int measuredHeight4 = childAt9.getMeasuredHeight() + i86;
                    max = Math.max(max, measuredHeight4);
                    if (!z2) {
                        i86 = measuredHeight4;
                    }
                    int max4 = Math.max(i76, i86);
                    if (z21) {
                        i8 = -1;
                        if (((LinearLayout.LayoutParams) cv3Var8).height == -1) {
                            z3 = true;
                            if (!z24 && (baseline = childAt9.getBaseline()) != i8) {
                                int i87 = ((LinearLayout.LayoutParams) cv3Var8).gravity;
                                if (i87 < 0) {
                                    i87 = dv3Var.d0;
                                }
                                int i88 = (((i87 & 112) >> 4) & (-2)) >> 1;
                                iArr5[i88] = Math.max(iArr5[i88], baseline);
                                iArr6[i88] = Math.max(iArr6[i88], measuredHeight4 - baseline);
                            }
                            z21 = z3;
                            i76 = max4;
                        }
                    } else {
                        i8 = -1;
                    }
                    z3 = false;
                    if (!z24) {
                    }
                    z21 = z3;
                    i76 = max4;
                }
                i83++;
                resolveSizeAndState2 = i7;
            }
            i3 = resolveSizeAndState2;
            i4 = -16777216;
            dv3Var.e0 = dv3Var.getPaddingRight() + dv3Var.getPaddingLeft() + dv3Var.e0;
            int i89 = iArr5[1];
            if (i89 == -1 && iArr5[0] == -1 && iArr5[c3] == -1 && iArr5[3] == -1) {
                i5 = 0;
            } else {
                i5 = 0;
                max = Math.max(max, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[c3]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i89, iArr5[c3]))));
            }
            i6 = i76;
        }
        if (!z21 && mode4 != 1073741824) {
            max = i6;
        }
        dv3Var.setMeasuredDimension(i3 | (i63 & i4), View.resolveSizeAndState(Math.max(dv3Var.getPaddingBottom() + dv3Var.getPaddingTop() + max, dv3Var.getSuggestedMinimumHeight()), i2, i63 << 16));
        if (z22) {
            int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(dv3Var.getMeasuredHeight(), 1073741824);
            int i90 = i5;
            while (i90 < virtualChildCount2) {
                View childAt10 = dv3Var.getChildAt(i90);
                if (childAt10.getVisibility() != 8) {
                    cv3 cv3Var9 = (cv3) childAt10.getLayoutParams();
                    if (((LinearLayout.LayoutParams) cv3Var9).height == -1) {
                        int i91 = ((LinearLayout.LayoutParams) cv3Var9).width;
                        ((LinearLayout.LayoutParams) cv3Var9).width = childAt10.getMeasuredWidth();
                        dv3Var.measureChildWithMargins(childAt10, i57, 0, makeMeasureSpec3, 0);
                        ((LinearLayout.LayoutParams) cv3Var9).width = i91;
                    }
                }
                i90++;
                dv3Var = this;
                i57 = i;
            }
        }
    }

    public void setBaselineAligned(boolean z) {
        this.A = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i >= 0 && i < getChildCount()) {
            this.B = i;
        } else {
            i.i("base aligned child index out of range (0, ", getChildCount(), ")");
        }
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.j0) {
            return;
        }
        this.j0 = drawable;
        boolean z = false;
        if (drawable != null) {
            this.k0 = drawable.getIntrinsicWidth();
            this.l0 = drawable.getIntrinsicHeight();
        } else {
            this.k0 = 0;
            this.l0 = 0;
        }
        if (drawable == null) {
            z = true;
        }
        setWillNotDraw(z);
        requestLayout();
    }

    public void setDividerPadding(int i) {
        this.n0 = i;
    }

    public void setGravity(int i) {
        if (this.d0 != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.d0 = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.d0;
        if ((8388615 & i3) != i2) {
            this.d0 = i2 | ((-8388616) & i3);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.g0 = z;
    }

    public void setOrientation(int i) {
        if (this.R != i) {
            this.R = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.m0) {
            requestLayout();
        }
        this.m0 = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.d0;
        if ((i3 & 112) != i2) {
            this.d0 = i2 | (i3 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.f0 = Math.max((float) RecyclerView.B1, f);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
