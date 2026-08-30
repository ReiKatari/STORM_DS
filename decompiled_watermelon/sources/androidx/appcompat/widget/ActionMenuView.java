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
import androidx.preference.Preference;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public class ActionMenuView extends bo3 implements tw3, ox3 {
    public uw3 n0;
    public Context o0;
    public int p0;
    public boolean q0;
    public f8 r0;
    public i40 s0;
    public sw3 t0;
    public boolean u0;
    public int v0;
    public final int w0;
    public final int x0;
    public i8 y0;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.w0 = (int) (56.0f * f);
        this.x0 = (int) (f * 4.0f);
        this.o0 = context;
        this.p0 = 0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [h8, android.widget.LinearLayout$LayoutParams] */
    public static h8 j() {
        ?? layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.a = false;
        ((LinearLayout.LayoutParams) layoutParams).gravity = 16;
        return layoutParams;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [h8, android.widget.LinearLayout$LayoutParams] */
    public static h8 k(ViewGroup.LayoutParams layoutParams) {
        h8 h8Var;
        if (layoutParams != null) {
            if (layoutParams instanceof h8) {
                h8 h8Var2 = (h8) layoutParams;
                ?? layoutParams2 = new LinearLayout.LayoutParams((ViewGroup.LayoutParams) h8Var2);
                layoutParams2.a = h8Var2.a;
                h8Var = layoutParams2;
            } else {
                h8Var = new LinearLayout.LayoutParams(layoutParams);
            }
            if (((LinearLayout.LayoutParams) h8Var).gravity <= 0) {
                ((LinearLayout.LayoutParams) h8Var).gravity = 16;
            }
            return h8Var;
        }
        return j();
    }

    @Override // defpackage.tw3
    public final boolean a(zw3 zw3Var) {
        return this.n0.q(zw3Var, null, 0);
    }

    @Override // defpackage.ox3
    public final void b(uw3 uw3Var) {
        this.n0 = uw3Var;
    }

    @Override // defpackage.bo3, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof h8;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // defpackage.bo3
    public final /* bridge */ /* synthetic */ ao3 f() {
        return j();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ao3, android.widget.LinearLayout$LayoutParams] */
    @Override // defpackage.bo3
    public final ao3 g(AttributeSet attributeSet) {
        return new LinearLayout.LayoutParams(getContext(), attributeSet);
    }

    @Override // defpackage.bo3, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return j();
    }

    @Override // defpackage.bo3, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LinearLayout.LayoutParams(getContext(), attributeSet);
    }

    public Menu getMenu() {
        if (this.n0 == null) {
            Context context = getContext();
            uw3 uw3Var = new uw3(context);
            this.n0 = uw3Var;
            uw3Var.e = new bq0(6, this);
            f8 f8Var = new f8(context);
            this.r0 = f8Var;
            f8Var.g0 = true;
            f8Var.h0 = true;
            lx3 lx3Var = this.s0;
            if (lx3Var == null) {
                lx3Var = new iq0(20);
            }
            f8Var.X = lx3Var;
            this.n0.b(f8Var, this.o0);
            f8 f8Var2 = this.r0;
            f8Var2.c0 = this;
            this.n0 = f8Var2.L;
        }
        return this.n0;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        f8 f8Var = this.r0;
        e8 e8Var = f8Var.d0;
        if (e8Var != null) {
            return e8Var.getDrawable();
        }
        if (f8Var.f0) {
            return f8Var.e0;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.p0;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // defpackage.bo3
    public final /* bridge */ /* synthetic */ ao3 h(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }

    public final boolean l(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        View childAt = getChildAt(i - 1);
        View childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof g8)) {
            z = ((g8) childAt).a();
        }
        if (i > 0 && (childAt2 instanceof g8)) {
            return ((g8) childAt2).b() | z;
        }
        return z;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        f8 f8Var = this.r0;
        if (f8Var != null) {
            f8Var.g();
            if (this.r0.h()) {
                this.r0.c();
                this.r0.l();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f8 f8Var = this.r0;
        if (f8Var != null) {
            f8Var.c();
            c8 c8Var = f8Var.o0;
            if (c8Var != null && c8Var.b()) {
                c8Var.i.dismiss();
            }
        }
    }

    @Override // defpackage.bo3, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        int i5;
        int width;
        int i6;
        if (!this.u0) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i7 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i8 = i3 - i;
        int paddingRight = (i8 - getPaddingRight()) - getPaddingLeft();
        boolean z3 = dc7.a;
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
                h8 h8Var = (h8) childAt.getLayoutParams();
                if (h8Var.a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (l(i11)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z2) {
                        i6 = getPaddingLeft() + ((LinearLayout.LayoutParams) h8Var).leftMargin;
                        width = i6 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) h8Var).rightMargin;
                        i6 = width - measuredWidth;
                    }
                    int i12 = i7 - (measuredHeight / 2);
                    childAt.layout(i6, i12, width, measuredHeight + i12);
                    paddingRight -= measuredWidth;
                    i9 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) h8Var).leftMargin) + ((LinearLayout.LayoutParams) h8Var).rightMargin;
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
                h8 h8Var2 = (h8) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !h8Var2.a) {
                    int i17 = width2 - ((LinearLayout.LayoutParams) h8Var2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i18 = i7 - (measuredHeight3 / 2);
                    childAt3.layout(i17 - measuredWidth3, i18, i17, measuredHeight3 + i18);
                    width2 = i17 - ((measuredWidth3 + ((LinearLayout.LayoutParams) h8Var2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt4 = getChildAt(i19);
            h8 h8Var3 = (h8) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !h8Var3.a) {
                int i20 = paddingLeft + ((LinearLayout.LayoutParams) h8Var3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i21 = i7 - (measuredHeight4 / 2);
                childAt4.layout(i20, i21, i20 + measuredWidth4, measuredHeight4 + i21);
                paddingLeft = measuredWidth4 + ((LinearLayout.LayoutParams) h8Var3).rightMargin + max + i20;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v41 */
    @Override // defpackage.bo3, android.view.View
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
        uw3 uw3Var;
        boolean z7 = this.u0;
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            z = true;
        } else {
            z = false;
        }
        this.u0 = z;
        if (z7 != z) {
            this.v0 = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.u0 && (uw3Var = this.n0) != null && size != this.v0) {
            this.v0 = size;
            uw3Var.p(true);
        }
        int childCount = getChildCount();
        if (this.u0 && childCount > 0) {
            int mode = View.MeasureSpec.getMode(i2);
            int size2 = View.MeasureSpec.getSize(i);
            int size3 = View.MeasureSpec.getSize(i2);
            int paddingRight = getPaddingRight() + getPaddingLeft();
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingBottom, -2);
            int i10 = size2 - paddingRight;
            int i11 = this.w0;
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
                i3 = this.x0;
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
                    h8 h8Var = (h8) childAt.getLayoutParams();
                    h8Var.f = false;
                    h8Var.c = 0;
                    h8Var.b = 0;
                    h8Var.d = false;
                    ((LinearLayout.LayoutParams) h8Var).leftMargin = 0;
                    ((LinearLayout.LayoutParams) h8Var).rightMargin = 0;
                    if (z9 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText())) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    h8Var.e = z4;
                    if (h8Var.a) {
                        i7 = 1;
                    } else {
                        i7 = i12;
                    }
                    h8 h8Var2 = (h8) childAt.getLayoutParams();
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
                    if (!h8Var2.a && z10) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    h8Var2.d = z6;
                    h8Var2.b = i9;
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i9 * i8, 1073741824), makeMeasureSpec);
                    i17 = Math.max(i17, i9);
                    if (h8Var.d) {
                        i19++;
                    }
                    if (h8Var.a) {
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
                int i27 = Preference.DEFAULT_ORDER;
                long j2 = 0;
                int i28 = 0;
                int i29 = 0;
                while (i29 < childCount2) {
                    int i30 = i15;
                    h8 h8Var3 = (h8) getChildAt(i29).getLayoutParams();
                    boolean z12 = z2;
                    if (h8Var3.d) {
                        int i31 = h8Var3.b;
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
                    h8 h8Var4 = (h8) childAt2.getLayoutParams();
                    boolean z14 = z8;
                    long j3 = 1 << i33;
                    if ((j2 & j3) == 0) {
                        if (h8Var4.b == i32) {
                            j |= j3;
                        }
                    } else {
                        if (z13 && h8Var4.e) {
                            r11 = 1;
                            r11 = 1;
                            if (i26 == 1) {
                                childAt2.setPadding(i3 + i25, 0, i3, 0);
                            }
                        } else {
                            r11 = 1;
                        }
                        h8Var4.b += r11;
                        h8Var4.f = r11;
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
                    if ((j & 1) != 0 && !((h8) getChildAt(0).getLayoutParams()).e) {
                        bitCount -= 0.5f;
                    }
                    int i34 = childCount2 - 1;
                    if ((j & (1 << i34)) != 0 && !((h8) getChildAt(i34).getLayoutParams()).e) {
                        bitCount -= 0.5f;
                    }
                }
                if (bitCount > RecyclerView.A1) {
                    i6 = (int) ((i26 * i25) / bitCount);
                } else {
                    i6 = 0;
                }
                boolean z15 = z11;
                for (int i35 = 0; i35 < childCount2; i35++) {
                    if ((j & (1 << i35)) != 0) {
                        View childAt3 = getChildAt(i35);
                        h8 h8Var5 = (h8) childAt3.getLayoutParams();
                        if (childAt3 instanceof ActionMenuItemView) {
                            h8Var5.c = i6;
                            h8Var5.f = true;
                            if (i35 == 0 && !h8Var5.e) {
                                ((LinearLayout.LayoutParams) h8Var5).leftMargin = (-i6) / 2;
                            }
                            z15 = true;
                        } else if (h8Var5.a) {
                            h8Var5.c = i6;
                            h8Var5.f = true;
                            ((LinearLayout.LayoutParams) h8Var5).rightMargin = (-i6) / 2;
                            z15 = true;
                        } else {
                            if (i35 != 0) {
                                ((LinearLayout.LayoutParams) h8Var5).leftMargin = i6 / 2;
                            }
                            if (i35 != childCount2 - 1) {
                                ((LinearLayout.LayoutParams) h8Var5).rightMargin = i6 / 2;
                            }
                        }
                    }
                }
                z11 = z15;
            }
            if (z11) {
                for (int i36 = 0; i36 < childCount2; i36++) {
                    View childAt4 = getChildAt(i36);
                    h8 h8Var6 = (h8) childAt4.getLayoutParams();
                    if (h8Var6.f) {
                        childAt4.measure(View.MeasureSpec.makeMeasureSpec((h8Var6.b * i25) + h8Var6.c, 1073741824), childMeasureSpec);
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
            h8 h8Var7 = (h8) getChildAt(i37).getLayoutParams();
            ((LinearLayout.LayoutParams) h8Var7).rightMargin = 0;
            ((LinearLayout.LayoutParams) h8Var7).leftMargin = 0;
        }
        super.onMeasure(i, i2);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.r0.l0 = z;
    }

    public void setOnMenuItemClickListener(i8 i8Var) {
        this.y0 = i8Var;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        f8 f8Var = this.r0;
        e8 e8Var = f8Var.d0;
        if (e8Var != null) {
            e8Var.setImageDrawable(drawable);
            return;
        }
        f8Var.f0 = true;
        f8Var.e0 = drawable;
    }

    public void setOverflowReserved(boolean z) {
        this.q0 = z;
    }

    public void setPopupTheme(int i) {
        if (this.p0 != i) {
            this.p0 = i;
            if (i == 0) {
                this.o0 = getContext();
            } else {
                this.o0 = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(f8 f8Var) {
        this.r0 = f8Var;
        f8Var.c0 = this;
        this.n0 = f8Var.L;
    }

    @Override // defpackage.bo3, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }
}
