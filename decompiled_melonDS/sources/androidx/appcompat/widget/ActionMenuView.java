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
import l.i0;
import p.k;
import p.l;
import p.n;
import p.w;
import p.z;
import q.f;
import q.i;
import q.j;
import q.m;
import q.u3;
import q.v1;
import q.w1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class ActionMenuView extends w1 implements k, z {

    /* renamed from: m0  reason: collision with root package name */
    public l f948m0;

    /* renamed from: n0  reason: collision with root package name */
    public Context f949n0;

    /* renamed from: o0  reason: collision with root package name */
    public int f950o0;
    public boolean p0;

    /* renamed from: q0  reason: collision with root package name */
    public j f951q0;

    /* renamed from: r0  reason: collision with root package name */
    public a0.l f952r0;

    /* renamed from: s0  reason: collision with root package name */
    public p.j f953s0;

    /* renamed from: t0  reason: collision with root package name */
    public boolean f954t0;

    /* renamed from: u0  reason: collision with root package name */
    public int f955u0;

    /* renamed from: v0  reason: collision with root package name */
    public final int f956v0;

    /* renamed from: w0  reason: collision with root package name */
    public final int f957w0;

    /* renamed from: x0  reason: collision with root package name */
    public m f958x0;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setBaselineAligned(false);
        float f8 = context.getResources().getDisplayMetrics().density;
        this.f956v0 = (int) (56.0f * f8);
        this.f957w0 = (int) (f8 * 4.0f);
        this.f949n0 = context;
        this.f950o0 = 0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.widget.LinearLayout$LayoutParams, q.l] */
    public static q.l j() {
        ?? layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.f11942a = false;
        ((LinearLayout.LayoutParams) layoutParams).gravity = 16;
        return layoutParams;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.widget.LinearLayout$LayoutParams, q.l] */
    public static q.l k(ViewGroup.LayoutParams layoutParams) {
        q.l lVar;
        if (layoutParams != null) {
            if (layoutParams instanceof q.l) {
                q.l lVar2 = (q.l) layoutParams;
                ?? layoutParams2 = new LinearLayout.LayoutParams((ViewGroup.LayoutParams) lVar2);
                layoutParams2.f11942a = lVar2.f11942a;
                lVar = layoutParams2;
            } else {
                lVar = new LinearLayout.LayoutParams(layoutParams);
            }
            if (((LinearLayout.LayoutParams) lVar).gravity <= 0) {
                ((LinearLayout.LayoutParams) lVar).gravity = 16;
            }
            return lVar;
        }
        return j();
    }

    @Override // p.z
    public final void a(l lVar) {
        this.f948m0 = lVar;
    }

    @Override // p.k
    public final boolean c(n nVar) {
        return this.f948m0.q(nVar, null, 0);
    }

    @Override // q.w1, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof q.l;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // q.w1
    public final /* bridge */ /* synthetic */ v1 f() {
        return j();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.widget.LinearLayout$LayoutParams, q.v1] */
    @Override // q.w1
    public final v1 g(AttributeSet attributeSet) {
        return new LinearLayout.LayoutParams(getContext(), attributeSet);
    }

    @Override // q.w1, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return j();
    }

    @Override // q.w1, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LinearLayout.LayoutParams(getContext(), attributeSet);
    }

    public Menu getMenu() {
        if (this.f948m0 == null) {
            Context context = getContext();
            l lVar = new l(context);
            this.f948m0 = lVar;
            lVar.f11114e = new i0(25, this);
            j jVar = new j(context);
            this.f951q0 = jVar;
            jVar.f11917f0 = true;
            jVar.f11918g0 = true;
            w wVar = this.f952r0;
            if (wVar == null) {
                wVar = new l7.a(11);
            }
            jVar.X = wVar;
            this.f948m0.b(jVar, this.f949n0);
            j jVar2 = this.f951q0;
            jVar2.f11913b0 = this;
            this.f948m0 = jVar2.L;
        }
        return this.f948m0;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        j jVar = this.f951q0;
        i iVar = jVar.f11914c0;
        if (iVar != null) {
            return iVar.getDrawable();
        }
        if (jVar.f11916e0) {
            return jVar.f11915d0;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f950o0;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // q.w1
    public final /* bridge */ /* synthetic */ v1 h(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }

    public final boolean l(int i2) {
        boolean z10 = false;
        if (i2 == 0) {
            return false;
        }
        View childAt = getChildAt(i2 - 1);
        View childAt2 = getChildAt(i2);
        if (i2 < getChildCount() && (childAt instanceof q.k)) {
            z10 = ((q.k) childAt).a();
        }
        if (i2 > 0 && (childAt2 instanceof q.k)) {
            return ((q.k) childAt2).c() | z10;
        }
        return z10;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        j jVar = this.f951q0;
        if (jVar != null) {
            jVar.d();
            if (this.f951q0.e()) {
                this.f951q0.c();
                this.f951q0.l();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        j jVar = this.f951q0;
        if (jVar != null) {
            jVar.c();
            f fVar = jVar.f11925n0;
            if (fVar != null && fVar.b()) {
                fVar.f11172i.dismiss();
            }
        }
    }

    @Override // q.w1, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i2, int i10, int i11, int i12) {
        boolean z11;
        int i13;
        int width;
        int i14;
        if (!this.f954t0) {
            super.onLayout(z10, i2, i10, i11, i12);
            return;
        }
        int childCount = getChildCount();
        int i15 = (i12 - i10) / 2;
        int dividerWidth = getDividerWidth();
        int i16 = i11 - i2;
        int paddingRight = (i16 - getPaddingRight()) - getPaddingLeft();
        boolean z12 = u3.f12027a;
        if (getLayoutDirection() == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        int i17 = 0;
        int i18 = 0;
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt = getChildAt(i19);
            if (childAt.getVisibility() != 8) {
                q.l lVar = (q.l) childAt.getLayoutParams();
                if (lVar.f11942a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (l(i19)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z11) {
                        i14 = getPaddingLeft() + ((LinearLayout.LayoutParams) lVar).leftMargin;
                        width = i14 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) lVar).rightMargin;
                        i14 = width - measuredWidth;
                    }
                    int i20 = i15 - (measuredHeight / 2);
                    childAt.layout(i14, i20, width, measuredHeight + i20);
                    paddingRight -= measuredWidth;
                    i17 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) lVar).leftMargin) + ((LinearLayout.LayoutParams) lVar).rightMargin;
                    l(i19);
                    i18++;
                }
            }
        }
        if (childCount == 1 && i17 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i21 = (i16 / 2) - (measuredWidth2 / 2);
            int i22 = i15 - (measuredHeight2 / 2);
            childAt2.layout(i21, i22, measuredWidth2 + i21, measuredHeight2 + i22);
            return;
        }
        int i23 = i18 - (i17 ^ 1);
        if (i23 > 0) {
            i13 = paddingRight / i23;
        } else {
            i13 = 0;
        }
        int max = Math.max(0, i13);
        if (z11) {
            int width2 = getWidth() - getPaddingRight();
            for (int i24 = 0; i24 < childCount; i24++) {
                View childAt3 = getChildAt(i24);
                q.l lVar2 = (q.l) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !lVar2.f11942a) {
                    int i25 = width2 - ((LinearLayout.LayoutParams) lVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i26 = i15 - (measuredHeight3 / 2);
                    childAt3.layout(i25 - measuredWidth3, i26, i25, measuredHeight3 + i26);
                    width2 = i25 - ((measuredWidth3 + ((LinearLayout.LayoutParams) lVar2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i27 = 0; i27 < childCount; i27++) {
            View childAt4 = getChildAt(i27);
            q.l lVar3 = (q.l) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !lVar3.f11942a) {
                int i28 = paddingLeft + ((LinearLayout.LayoutParams) lVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i29 = i15 - (measuredHeight4 / 2);
                childAt4.layout(i28, i29, i28 + measuredWidth4, measuredHeight4 + i29);
                paddingLeft = measuredWidth4 + ((LinearLayout.LayoutParams) lVar3).rightMargin + max + i28;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v41 */
    @Override // q.w1, android.view.View
    public final void onMeasure(int i2, int i10) {
        boolean z10;
        int i11;
        boolean z11;
        int i12;
        boolean z12;
        int i13;
        int i14;
        ?? r11;
        boolean z13;
        int i15;
        int i16;
        ActionMenuItemView actionMenuItemView;
        boolean z14;
        int i17;
        boolean z15;
        l lVar;
        boolean z16 = this.f954t0;
        if (View.MeasureSpec.getMode(i2) == 1073741824) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f954t0 = z10;
        if (z16 != z10) {
            this.f955u0 = 0;
        }
        int size = View.MeasureSpec.getSize(i2);
        if (this.f954t0 && (lVar = this.f948m0) != null && size != this.f955u0) {
            this.f955u0 = size;
            lVar.p(true);
        }
        int childCount = getChildCount();
        if (this.f954t0 && childCount > 0) {
            int mode = View.MeasureSpec.getMode(i10);
            int size2 = View.MeasureSpec.getSize(i2);
            int size3 = View.MeasureSpec.getSize(i10);
            int paddingRight = getPaddingRight() + getPaddingLeft();
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, paddingBottom, -2);
            int i18 = size2 - paddingRight;
            int i19 = this.f956v0;
            int i20 = i18 / i19;
            int i21 = i18 % i19;
            if (i20 == 0) {
                setMeasuredDimension(i18, 0);
                return;
            }
            int i22 = (i21 / i20) + i19;
            int childCount2 = getChildCount();
            int i23 = 0;
            int i24 = 0;
            int i25 = 0;
            int i26 = 0;
            boolean z17 = false;
            int i27 = 0;
            long j2 = 0;
            while (true) {
                i11 = this.f957w0;
                if (i26 >= childCount2) {
                    break;
                }
                View childAt = getChildAt(i26);
                int i28 = size3;
                int i29 = paddingBottom;
                if (childAt.getVisibility() == 8) {
                    i16 = i22;
                } else {
                    boolean z18 = childAt instanceof ActionMenuItemView;
                    i24++;
                    if (z18) {
                        childAt.setPadding(i11, 0, i11, 0);
                    }
                    q.l lVar2 = (q.l) childAt.getLayoutParams();
                    lVar2.f11947f = false;
                    lVar2.f11944c = 0;
                    lVar2.f11943b = 0;
                    lVar2.f11945d = false;
                    ((LinearLayout.LayoutParams) lVar2).leftMargin = 0;
                    ((LinearLayout.LayoutParams) lVar2).rightMargin = 0;
                    if (z18 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText())) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    lVar2.f11946e = z13;
                    if (lVar2.f11942a) {
                        i15 = 1;
                    } else {
                        i15 = i20;
                    }
                    q.l lVar3 = (q.l) childAt.getLayoutParams();
                    int i30 = i20;
                    i16 = i22;
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - i29, View.MeasureSpec.getMode(childMeasureSpec));
                    if (z18) {
                        actionMenuItemView = (ActionMenuItemView) childAt;
                    } else {
                        actionMenuItemView = null;
                    }
                    if (actionMenuItemView != null && !TextUtils.isEmpty(actionMenuItemView.getText())) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    boolean z19 = z14;
                    if (i15 > 0 && (!z14 || i15 >= 2)) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i16 * i15, Integer.MIN_VALUE), makeMeasureSpec);
                        int measuredWidth = childAt.getMeasuredWidth();
                        i17 = measuredWidth / i16;
                        if (measuredWidth % i16 != 0) {
                            i17++;
                        }
                        if (z19 && i17 < 2) {
                            i17 = 2;
                        }
                    } else {
                        i17 = 0;
                    }
                    if (!lVar3.f11942a && z19) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    lVar3.f11945d = z15;
                    lVar3.f11943b = i17;
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i17 * i16, 1073741824), makeMeasureSpec);
                    i25 = Math.max(i25, i17);
                    if (lVar2.f11945d) {
                        i27++;
                    }
                    if (lVar2.f11942a) {
                        z17 = true;
                    }
                    i20 = i30 - i17;
                    i23 = Math.max(i23, childAt.getMeasuredHeight());
                    if (i17 == 1) {
                        j2 |= 1 << i26;
                    }
                }
                i26++;
                size3 = i28;
                paddingBottom = i29;
                i22 = i16;
            }
            int i31 = size3;
            int i32 = i20;
            int i33 = i22;
            if (z17 && i24 == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            int i34 = i32;
            boolean z20 = false;
            while (i27 > 0 && i34 > 0) {
                int i35 = Preference.DEFAULT_ORDER;
                long j10 = 0;
                int i36 = 0;
                int i37 = 0;
                while (i37 < childCount2) {
                    int i38 = i23;
                    q.l lVar4 = (q.l) getChildAt(i37).getLayoutParams();
                    boolean z21 = z11;
                    if (lVar4.f11945d) {
                        int i39 = lVar4.f11943b;
                        if (i39 < i35) {
                            j10 = 1 << i37;
                            i35 = i39;
                            i36 = 1;
                        } else if (i39 == i35) {
                            j10 |= 1 << i37;
                            i36++;
                        }
                    }
                    i37++;
                    z11 = z21;
                    i23 = i38;
                }
                i12 = i23;
                boolean z22 = z11;
                j2 |= j10;
                if (i36 > i34) {
                    break;
                }
                int i40 = i35 + 1;
                int i41 = 0;
                while (i41 < childCount2) {
                    View childAt2 = getChildAt(i41);
                    q.l lVar5 = (q.l) childAt2.getLayoutParams();
                    boolean z23 = z17;
                    long j11 = 1 << i41;
                    if ((j10 & j11) == 0) {
                        if (lVar5.f11943b == i40) {
                            j2 |= j11;
                        }
                    } else {
                        if (z22 && lVar5.f11946e) {
                            r11 = 1;
                            r11 = 1;
                            if (i34 == 1) {
                                childAt2.setPadding(i11 + i33, 0, i11, 0);
                            }
                        } else {
                            r11 = 1;
                        }
                        lVar5.f11943b += r11;
                        lVar5.f11947f = r11;
                        i34--;
                    }
                    i41++;
                    z17 = z23;
                }
                z11 = z22;
                i23 = i12;
                z20 = true;
            }
            i12 = i23;
            if (!z17 && i24 == 1) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (i34 > 0 && j2 != 0 && (i34 < i24 - 1 || z12 || i25 > 1)) {
                float bitCount = Long.bitCount(j2);
                if (!z12) {
                    if ((j2 & 1) != 0 && !((q.l) getChildAt(0).getLayoutParams()).f11946e) {
                        bitCount -= 0.5f;
                    }
                    int i42 = childCount2 - 1;
                    if ((j2 & (1 << i42)) != 0 && !((q.l) getChildAt(i42).getLayoutParams()).f11946e) {
                        bitCount -= 0.5f;
                    }
                }
                if (bitCount > 0.0f) {
                    i14 = (int) ((i34 * i33) / bitCount);
                } else {
                    i14 = 0;
                }
                boolean z24 = z20;
                for (int i43 = 0; i43 < childCount2; i43++) {
                    if ((j2 & (1 << i43)) != 0) {
                        View childAt3 = getChildAt(i43);
                        q.l lVar6 = (q.l) childAt3.getLayoutParams();
                        if (childAt3 instanceof ActionMenuItemView) {
                            lVar6.f11944c = i14;
                            lVar6.f11947f = true;
                            if (i43 == 0 && !lVar6.f11946e) {
                                ((LinearLayout.LayoutParams) lVar6).leftMargin = (-i14) / 2;
                            }
                            z24 = true;
                        } else if (lVar6.f11942a) {
                            lVar6.f11944c = i14;
                            lVar6.f11947f = true;
                            ((LinearLayout.LayoutParams) lVar6).rightMargin = (-i14) / 2;
                            z24 = true;
                        } else {
                            if (i43 != 0) {
                                ((LinearLayout.LayoutParams) lVar6).leftMargin = i14 / 2;
                            }
                            if (i43 != childCount2 - 1) {
                                ((LinearLayout.LayoutParams) lVar6).rightMargin = i14 / 2;
                            }
                        }
                    }
                }
                z20 = z24;
            }
            if (z20) {
                for (int i44 = 0; i44 < childCount2; i44++) {
                    View childAt4 = getChildAt(i44);
                    q.l lVar7 = (q.l) childAt4.getLayoutParams();
                    if (lVar7.f11947f) {
                        childAt4.measure(View.MeasureSpec.makeMeasureSpec((lVar7.f11943b * i33) + lVar7.f11944c, 1073741824), childMeasureSpec);
                    }
                }
            }
            if (mode != 1073741824) {
                i13 = i12;
            } else {
                i13 = i31;
            }
            setMeasuredDimension(i18, i13);
            return;
        }
        for (int i45 = 0; i45 < childCount; i45++) {
            q.l lVar8 = (q.l) getChildAt(i45).getLayoutParams();
            ((LinearLayout.LayoutParams) lVar8).rightMargin = 0;
            ((LinearLayout.LayoutParams) lVar8).leftMargin = 0;
        }
        super.onMeasure(i2, i10);
    }

    public void setExpandedActionViewsExclusive(boolean z10) {
        this.f951q0.f11922k0 = z10;
    }

    public void setOnMenuItemClickListener(m mVar) {
        this.f958x0 = mVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        j jVar = this.f951q0;
        i iVar = jVar.f11914c0;
        if (iVar != null) {
            iVar.setImageDrawable(drawable);
            return;
        }
        jVar.f11916e0 = true;
        jVar.f11915d0 = drawable;
    }

    public void setOverflowReserved(boolean z10) {
        this.p0 = z10;
    }

    public void setPopupTheme(int i2) {
        if (this.f950o0 != i2) {
            this.f950o0 = i2;
            if (i2 == 0) {
                this.f949n0 = getContext();
            } else {
                this.f949n0 = new ContextThemeWrapper(getContext(), i2);
            }
        }
    }

    public void setPresenter(j jVar) {
        this.f951q0 = jVar;
        jVar.f11913b0 = this;
        this.f948m0 = jVar.L;
    }

    @Override // q.w1, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }
}
