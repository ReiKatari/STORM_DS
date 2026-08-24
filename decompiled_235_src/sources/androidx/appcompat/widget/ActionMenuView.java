package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class ActionMenuView extends dv3 implements h44, d54 {
    public i44 o0;
    public Context p0;
    public int q0;
    public boolean r0;
    public g8 s0;
    public g60 t0;
    public g44 u0;
    public boolean v0;
    public int w0;
    public final int x0;
    public final int y0;
    public j8 z0;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.x0 = (int) (56.0f * f);
        this.y0 = (int) (f * 4.0f);
        this.p0 = context;
        this.q0 = 0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.widget.LinearLayout$LayoutParams, i8] */
    public static i8 j() {
        ?? layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.a = false;
        ((LinearLayout.LayoutParams) layoutParams).gravity = 16;
        return layoutParams;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.widget.LinearLayout$LayoutParams, i8] */
    public static i8 k(ViewGroup.LayoutParams layoutParams) {
        i8 i8Var;
        if (layoutParams != null) {
            if (layoutParams instanceof i8) {
                i8 i8Var2 = (i8) layoutParams;
                ?? layoutParams2 = new LinearLayout.LayoutParams((ViewGroup.LayoutParams) i8Var2);
                layoutParams2.a = i8Var2.a;
                i8Var = layoutParams2;
            } else {
                i8Var = new LinearLayout.LayoutParams(layoutParams);
            }
            if (((LinearLayout.LayoutParams) i8Var).gravity <= 0) {
                ((LinearLayout.LayoutParams) i8Var).gravity = 16;
            }
            return i8Var;
        }
        return j();
    }

    @Override // defpackage.h44
    public final boolean a(o44 o44Var) {
        return this.o0.q(o44Var, null, 0);
    }

    @Override // defpackage.d54
    public final void b(i44 i44Var) {
        this.o0 = i44Var;
    }

    @Override // defpackage.dv3, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof i8;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // defpackage.dv3
    public final /* bridge */ /* synthetic */ cv3 f() {
        return j();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [cv3, android.widget.LinearLayout$LayoutParams] */
    @Override // defpackage.dv3
    public final cv3 g(AttributeSet attributeSet) {
        return new LinearLayout.LayoutParams(getContext(), attributeSet);
    }

    @Override // defpackage.dv3, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return j();
    }

    @Override // defpackage.dv3, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LinearLayout.LayoutParams(getContext(), attributeSet);
    }

    public Menu getMenu() {
        if (this.o0 == null) {
            Context context = getContext();
            i44 i44Var = new i44(context);
            this.o0 = i44Var;
            i44Var.e = new os0(this, 6);
            g8 g8Var = new g8(context);
            this.s0 = g8Var;
            g8Var.h0 = true;
            g8Var.i0 = true;
            a54 a54Var = this.t0;
            if (a54Var == null) {
                a54Var = new xd5(21);
            }
            g8Var.X = a54Var;
            this.o0.b(g8Var, this.p0);
            g8 g8Var2 = this.s0;
            g8Var2.d0 = this;
            this.o0 = g8Var2.L;
        }
        return this.o0;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        g8 g8Var = this.s0;
        f8 f8Var = g8Var.e0;
        if (f8Var != null) {
            return f8Var.getDrawable();
        }
        if (g8Var.g0) {
            return g8Var.f0;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.q0;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // defpackage.dv3
    public final /* bridge */ /* synthetic */ cv3 h(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }

    public final boolean l(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        View childAt = getChildAt(i - 1);
        View childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof h8)) {
            z = ((h8) childAt).a();
        }
        if (i > 0 && (childAt2 instanceof h8)) {
            return ((h8) childAt2).b() | z;
        }
        return z;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        g8 g8Var = this.s0;
        if (g8Var != null) {
            g8Var.i();
            if (this.s0.j()) {
                this.s0.e();
                this.s0.l();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g8 g8Var = this.s0;
        if (g8Var != null) {
            g8Var.e();
            d8 d8Var = g8Var.p0;
            if (d8Var != null && d8Var.b()) {
                d8Var.i.dismiss();
            }
        }
    }

    @Override // defpackage.dv3, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        int i5;
        int width;
        int i6;
        if (!this.v0) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i7 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i8 = i3 - i;
        int paddingRight = (i8 - getPaddingRight()) - getPaddingLeft();
        boolean z3 = eq7.a;
        if (getLayoutDirection() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                i8 i8Var = (i8) childAt.getLayoutParams();
                if (i8Var.a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (l(i11)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z2) {
                        i6 = getPaddingLeft() + ((LinearLayout.LayoutParams) i8Var).leftMargin;
                        width = i6 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) i8Var).rightMargin;
                        i6 = width - measuredWidth;
                    }
                    int i12 = i7 - (measuredHeight / 2);
                    childAt.layout(i6, i12, width, measuredHeight + i12);
                    paddingRight -= measuredWidth;
                    i9 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) i8Var).leftMargin) + ((LinearLayout.LayoutParams) i8Var).rightMargin;
                    l(i11);
                    i10++;
                }
            }
        }
        if (childCount == 1 && i9 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i13 = (i8 / 2) - (measuredWidth2 / 2);
            int i14 = i7 - (measuredHeight2 / 2);
            childAt2.layout(i13, i14, measuredWidth2 + i13, measuredHeight2 + i14);
            return;
        }
        int i15 = i10 - (i9 ^ 1);
        if (i15 > 0) {
            i5 = paddingRight / i15;
        } else {
            i5 = 0;
        }
        int max = Math.max(0, i5);
        if (z2) {
            int width2 = getWidth() - getPaddingRight();
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt3 = getChildAt(i16);
                i8 i8Var2 = (i8) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !i8Var2.a) {
                    int i17 = width2 - ((LinearLayout.LayoutParams) i8Var2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i18 = i7 - (measuredHeight3 / 2);
                    childAt3.layout(i17 - measuredWidth3, i18, i17, measuredHeight3 + i18);
                    width2 = i17 - ((measuredWidth3 + ((LinearLayout.LayoutParams) i8Var2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt4 = getChildAt(i19);
            i8 i8Var3 = (i8) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !i8Var3.a) {
                int i20 = paddingLeft + ((LinearLayout.LayoutParams) i8Var3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i21 = i7 - (measuredHeight4 / 2);
                childAt4.layout(i20, i21, i20 + measuredWidth4, measuredHeight4 + i21);
                paddingLeft = measuredWidth4 + ((LinearLayout.LayoutParams) i8Var3).rightMargin + max + i20;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v41 */
    @Override // defpackage.dv3, android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        boolean z2;
        int i4;
        boolean z3;
        int i5;
        int i6;
        ?? r11;
        boolean z4;
        int i7;
        int i8;
        ActionMenuItemView actionMenuItemView;
        boolean z5;
        int i9;
        boolean z6;
        i44 i44Var;
        boolean z7 = this.v0;
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            z = true;
        } else {
            z = false;
        }
        this.v0 = z;
        if (z7 != z) {
            this.w0 = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.v0 && (i44Var = this.o0) != null && size != this.w0) {
            this.w0 = size;
            i44Var.p(true);
        }
        int childCount = getChildCount();
        if (this.v0 && childCount > 0) {
            int mode = View.MeasureSpec.getMode(i2);
            int size2 = View.MeasureSpec.getSize(i);
            int size3 = View.MeasureSpec.getSize(i2);
            int paddingRight = getPaddingRight() + getPaddingLeft();
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingBottom, -2);
            int i10 = size2 - paddingRight;
            int i11 = this.x0;
            int i12 = i10 / i11;
            int i13 = i10 % i11;
            if (i12 == 0) {
                setMeasuredDimension(i10, 0);
                return;
            }
            int i14 = (i13 / i12) + i11;
            int childCount2 = getChildCount();
            int i15 = 0;
            int i16 = 0;
            int i17 = 0;
            int i18 = 0;
            boolean z8 = false;
            int i19 = 0;
            long j = 0;
            while (true) {
                i3 = this.y0;
                if (i18 >= childCount2) {
                    break;
                }
                View childAt = getChildAt(i18);
                int i20 = size3;
                int i21 = paddingBottom;
                if (childAt.getVisibility() == 8) {
                    i8 = i14;
                } else {
                    boolean z9 = childAt instanceof ActionMenuItemView;
                    i16++;
                    if (z9) {
                        childAt.setPadding(i3, 0, i3, 0);
                    }
                    i8 i8Var = (i8) childAt.getLayoutParams();
                    i8Var.f = false;
                    i8Var.c = 0;
                    i8Var.b = 0;
                    i8Var.d = false;
                    ((LinearLayout.LayoutParams) i8Var).leftMargin = 0;
                    ((LinearLayout.LayoutParams) i8Var).rightMargin = 0;
                    if (z9 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText())) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    i8Var.e = z4;
                    if (i8Var.a) {
                        i7 = 1;
                    } else {
                        i7 = i12;
                    }
                    i8 i8Var2 = (i8) childAt.getLayoutParams();
                    int i22 = i12;
                    i8 = i14;
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - i21, View.MeasureSpec.getMode(childMeasureSpec));
                    if (z9) {
                        actionMenuItemView = (ActionMenuItemView) childAt;
                    } else {
                        actionMenuItemView = null;
                    }
                    if (actionMenuItemView != null && !TextUtils.isEmpty(actionMenuItemView.getText())) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    boolean z10 = z5;
                    if (i7 > 0 && (!z5 || i7 >= 2)) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i8 * i7, Integer.MIN_VALUE), makeMeasureSpec);
                        int measuredWidth = childAt.getMeasuredWidth();
                        i9 = measuredWidth / i8;
                        if (measuredWidth % i8 != 0) {
                            i9++;
                        }
                        if (z10 && i9 < 2) {
                            i9 = 2;
                        }
                    } else {
                        i9 = 0;
                    }
                    if (!i8Var2.a && z10) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    i8Var2.d = z6;
                    i8Var2.b = i9;
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i9 * i8, 1073741824), makeMeasureSpec);
                    i17 = Math.max(i17, i9);
                    if (i8Var.d) {
                        i19++;
                    }
                    if (i8Var.a) {
                        z8 = true;
                    }
                    i12 = i22 - i9;
                    i15 = Math.max(i15, childAt.getMeasuredHeight());
                    if (i9 == 1) {
                        j |= 1 << i18;
                    }
                }
                i18++;
                size3 = i20;
                paddingBottom = i21;
                i14 = i8;
            }
            int i23 = size3;
            int i24 = i12;
            int i25 = i14;
            if (z8 && i16 == 2) {
                z2 = true;
            } else {
                z2 = false;
            }
            int i26 = i24;
            boolean z11 = false;
            while (i19 > 0 && i26 > 0) {
                int i27 = Integer.MAX_VALUE;
                long j2 = 0;
                int i28 = 0;
                int i29 = 0;
                while (i29 < childCount2) {
                    int i30 = i15;
                    i8 i8Var3 = (i8) getChildAt(i29).getLayoutParams();
                    boolean z12 = z2;
                    if (i8Var3.d) {
                        int i31 = i8Var3.b;
                        if (i31 < i27) {
                            j2 = 1 << i29;
                            i27 = i31;
                            i28 = 1;
                        } else if (i31 == i27) {
                            j2 |= 1 << i29;
                            i28++;
                        }
                    }
                    i29++;
                    z2 = z12;
                    i15 = i30;
                }
                i4 = i15;
                boolean z13 = z2;
                j |= j2;
                if (i28 > i26) {
                    break;
                }
                int i32 = i27 + 1;
                int i33 = 0;
                while (i33 < childCount2) {
                    View childAt2 = getChildAt(i33);
                    i8 i8Var4 = (i8) childAt2.getLayoutParams();
                    boolean z14 = z8;
                    long j3 = 1 << i33;
                    if ((j2 & j3) == 0) {
                        if (i8Var4.b == i32) {
                            j |= j3;
                        }
                    } else {
                        if (z13 && i8Var4.e) {
                            r11 = 1;
                            r11 = 1;
                            if (i26 == 1) {
                                childAt2.setPadding(i3 + i25, 0, i3, 0);
                            }
                        } else {
                            r11 = 1;
                        }
                        i8Var4.b += r11;
                        i8Var4.f = r11;
                        i26--;
                    }
                    i33++;
                    z8 = z14;
                }
                z2 = z13;
                i15 = i4;
                z11 = true;
            }
            i4 = i15;
            if (!z8 && i16 == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (i26 > 0 && j != 0 && (i26 < i16 - 1 || z3 || i17 > 1)) {
                float bitCount = Long.bitCount(j);
                if (!z3) {
                    if ((j & 1) != 0 && !((i8) getChildAt(0).getLayoutParams()).e) {
                        bitCount -= 0.5f;
                    }
                    int i34 = childCount2 - 1;
                    if ((j & (1 << i34)) != 0 && !((i8) getChildAt(i34).getLayoutParams()).e) {
                        bitCount -= 0.5f;
                    }
                }
                if (bitCount > RecyclerView.B1) {
                    i6 = (int) ((i26 * i25) / bitCount);
                } else {
                    i6 = 0;
                }
                boolean z15 = z11;
                for (int i35 = 0; i35 < childCount2; i35++) {
                    if ((j & (1 << i35)) != 0) {
                        View childAt3 = getChildAt(i35);
                        i8 i8Var5 = (i8) childAt3.getLayoutParams();
                        if (childAt3 instanceof ActionMenuItemView) {
                            i8Var5.c = i6;
                            i8Var5.f = true;
                            if (i35 == 0 && !i8Var5.e) {
                                ((LinearLayout.LayoutParams) i8Var5).leftMargin = (-i6) / 2;
                            }
                            z15 = true;
                        } else if (i8Var5.a) {
                            i8Var5.c = i6;
                            i8Var5.f = true;
                            ((LinearLayout.LayoutParams) i8Var5).rightMargin = (-i6) / 2;
                            z15 = true;
                        } else {
                            if (i35 != 0) {
                                ((LinearLayout.LayoutParams) i8Var5).leftMargin = i6 / 2;
                            }
                            if (i35 != childCount2 - 1) {
                                ((LinearLayout.LayoutParams) i8Var5).rightMargin = i6 / 2;
                            }
                        }
                    }
                }
                z11 = z15;
            }
            if (z11) {
                for (int i36 = 0; i36 < childCount2; i36++) {
                    View childAt4 = getChildAt(i36);
                    i8 i8Var6 = (i8) childAt4.getLayoutParams();
                    if (i8Var6.f) {
                        childAt4.measure(View.MeasureSpec.makeMeasureSpec((i8Var6.b * i25) + i8Var6.c, 1073741824), childMeasureSpec);
                    }
                }
            }
            if (mode != 1073741824) {
                i5 = i4;
            } else {
                i5 = i23;
            }
            setMeasuredDimension(i10, i5);
            return;
        }
        for (int i37 = 0; i37 < childCount; i37++) {
            i8 i8Var7 = (i8) getChildAt(i37).getLayoutParams();
            ((LinearLayout.LayoutParams) i8Var7).rightMargin = 0;
            ((LinearLayout.LayoutParams) i8Var7).leftMargin = 0;
        }
        super.onMeasure(i, i2);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.s0.m0 = z;
    }

    public void setOnMenuItemClickListener(j8 j8Var) {
        this.z0 = j8Var;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        g8 g8Var = this.s0;
        f8 f8Var = g8Var.e0;
        if (f8Var != null) {
            f8Var.setImageDrawable(drawable);
            return;
        }
        g8Var.g0 = true;
        g8Var.f0 = drawable;
    }

    public void setOverflowReserved(boolean z) {
        this.r0 = z;
    }

    public void setPopupTheme(int i) {
        if (this.q0 != i) {
            this.q0 = i;
            if (i == 0) {
                this.p0 = getContext();
            } else {
                this.p0 = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(g8 g8Var) {
        this.s0 = g8Var;
        g8Var.d0 = this;
        this.o0 = g8Var.L;
    }

    @Override // defpackage.dv3, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }
}
