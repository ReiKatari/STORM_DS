package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import com.stormds.emulator.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class Toolbar extends ViewGroup implements l44 {
    public ActionMenuView A;
    public boolean A0;
    public qs B;
    public boolean B0;
    public final ArrayList C0;
    public final ArrayList D0;
    public final int[] E0;
    public final m44 F0;
    public ArrayList G0;
    public f87 H0;
    public final r9 I0;
    public l87 J0;
    public g8 K0;
    public qs L;
    public d87 L0;
    public g60 M0;
    public h87 N0;
    public boolean O0;
    public OnBackInvokedCallback P0;
    public OnBackInvokedDispatcher Q0;
    public mr R;
    public boolean R0;
    public final g15 S0;
    public nr d0;
    public final Drawable e0;
    public final CharSequence f0;
    public mr g0;
    public View h0;
    public Context i0;
    public int j0;
    public int k0;
    public int l0;
    public final int m0;
    public final int n0;
    public int o0;
    public int p0;
    public int q0;
    public int r0;
    public o26 s0;
    public int t0;
    public int u0;
    public final int v0;
    public CharSequence w0;
    public CharSequence x0;
    public ColorStateList y0;
    public ColorStateList z0;

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.v0 = 8388627;
        this.C0 = new ArrayList();
        this.D0 = new ArrayList();
        this.E0 = new int[2];
        this.F0 = new m44(new b87(this, 1));
        this.G0 = new ArrayList();
        this.I0 = new r9(this);
        this.S0 = new g15(this, 24);
        Context context2 = getContext();
        int[] iArr = m75.y;
        m44 A = m44.A(context2, attributeSet, iArr, R.attr.toolbarStyle);
        ao7.m(this, context, iArr, attributeSet, (TypedArray) A.L, R.attr.toolbarStyle);
        TypedArray typedArray = (TypedArray) A.L;
        this.k0 = typedArray.getResourceId(28, 0);
        this.l0 = typedArray.getResourceId(19, 0);
        this.v0 = typedArray.getInteger(0, 8388627);
        this.m0 = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.r0 = dimensionPixelOffset;
        this.q0 = dimensionPixelOffset;
        this.p0 = dimensionPixelOffset;
        this.o0 = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.o0 = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.p0 = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.q0 = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.r0 = dimensionPixelOffset5;
        }
        this.n0 = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        d();
        o26 o26Var = this.s0;
        o26Var.h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            o26Var.e = dimensionPixelSize;
            o26Var.a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            o26Var.f = dimensionPixelSize2;
            o26Var.b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            o26Var.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.t0 = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.u0 = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.e0 = A.k(4);
        this.f0 = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.i0 = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable k = A.k(16);
        if (k != null) {
            setNavigationIcon(k);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable k2 = A.k(11);
        if (k2 != null) {
            setLogo(k2);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(A.g(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(A.g(20));
        }
        if (typedArray.hasValue(14)) {
            getMenuInflater().inflate(typedArray.getResourceId(14, 0), getMenu());
        }
        A.D();
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i = 0; i < menu.size(); i++) {
            arrayList.add(menu.getItem(i));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new ku6(getContext());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [e87, android.view.ViewGroup$MarginLayoutParams] */
    public static e87 h() {
        ?? marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.b = 0;
        marginLayoutParams.a = 8388627;
        return marginLayoutParams;
    }

    public static e87 j(ViewGroup.LayoutParams layoutParams) {
        boolean z = layoutParams instanceof e87;
        if (z) {
            e87 e87Var = (e87) layoutParams;
            e87 e87Var2 = new e87(e87Var);
            e87Var2.b = 0;
            e87Var2.b = e87Var.b;
            return e87Var2;
        } else if (z) {
            e87 e87Var3 = new e87((e87) layoutParams);
            e87Var3.b = 0;
            return e87Var3;
        } else if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            e87 e87Var4 = new e87(marginLayoutParams);
            e87Var4.b = 0;
            ((ViewGroup.MarginLayoutParams) e87Var4).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) e87Var4).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) e87Var4).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) e87Var4).bottomMargin = marginLayoutParams.bottomMargin;
            return e87Var4;
        } else {
            e87 e87Var5 = new e87(layoutParams);
            e87Var5.b = 0;
            return e87Var5;
        }
    }

    public static int l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int n(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(int i, ArrayList arrayList) {
        boolean z;
        if (getLayoutDirection() == 1) {
            z = true;
        } else {
            z = false;
        }
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection());
        arrayList.clear();
        if (z) {
            for (int i2 = childCount - 1; i2 >= 0; i2--) {
                View childAt = getChildAt(i2);
                e87 e87Var = (e87) childAt.getLayoutParams();
                if (e87Var.b == 0 && v(childAt)) {
                    int i3 = e87Var.a;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i3, layoutDirection) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = layoutDirection == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt2 = getChildAt(i4);
            e87 e87Var2 = (e87) childAt2.getLayoutParams();
            if (e87Var2.b == 0 && v(childAt2)) {
                int i5 = e87Var2.a;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i5, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    public final void b(View view, boolean z) {
        e87 e87Var;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            e87Var = h();
        } else if (!checkLayoutParams(layoutParams)) {
            e87Var = j(layoutParams);
        } else {
            e87Var = (e87) layoutParams;
        }
        e87Var.b = 1;
        if (z && this.h0 != null) {
            view.setLayoutParams(e87Var);
            this.D0.add(view);
            return;
        }
        addView(view, e87Var);
    }

    public final void c() {
        if (this.g0 == null) {
            mr mrVar = new mr(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.g0 = mrVar;
            mrVar.setImageDrawable(this.e0);
            this.g0.setContentDescription(this.f0);
            e87 h = h();
            h.a = (this.m0 & 112) | 8388611;
            h.b = 2;
            this.g0.setLayoutParams(h);
            this.g0.setOnClickListener(new r7(this, 5));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (super.checkLayoutParams(layoutParams) && (layoutParams instanceof e87)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [o26, java.lang.Object] */
    public final void d() {
        if (this.s0 == null) {
            ?? obj = new Object();
            obj.a = 0;
            obj.b = 0;
            obj.c = Integer.MIN_VALUE;
            obj.d = Integer.MIN_VALUE;
            obj.e = 0;
            obj.f = 0;
            obj.g = false;
            obj.h = false;
            this.s0 = obj;
        }
    }

    public final void e() {
        f();
        ActionMenuView actionMenuView = this.A;
        if (actionMenuView.o0 == null) {
            i44 i44Var = (i44) actionMenuView.getMenu();
            if (this.L0 == null) {
                this.L0 = new d87(this);
            }
            this.A.setExpandedActionViewsExclusive(true);
            i44Var.b(this.L0, this.i0);
            x();
        }
    }

    public final void f() {
        if (this.A == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.A = actionMenuView;
            actionMenuView.setPopupTheme(this.j0);
            this.A.setOnMenuItemClickListener(this.I0);
            ActionMenuView actionMenuView2 = this.A;
            g60 g60Var = this.M0;
            r9 r9Var = new r9(this);
            actionMenuView2.t0 = g60Var;
            actionMenuView2.u0 = r9Var;
            e87 h = h();
            h.a = (this.m0 & 112) | 8388613;
            this.A.setLayoutParams(h);
            b(this.A, false);
        }
    }

    public final void g() {
        if (this.R == null) {
            this.R = new mr(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            e87 h = h();
            h.a = (this.m0 & 112) | 8388611;
            this.R.setLayoutParams(h);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return h();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [e87, android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams] */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        ?? marginLayoutParams = new ViewGroup.MarginLayoutParams(context, attributeSet);
        marginLayoutParams.a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m75.b);
        marginLayoutParams.a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        marginLayoutParams.b = 0;
        return marginLayoutParams;
    }

    public CharSequence getCollapseContentDescription() {
        mr mrVar = this.g0;
        if (mrVar != null) {
            return mrVar.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        mr mrVar = this.g0;
        if (mrVar != null) {
            return mrVar.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        o26 o26Var = this.s0;
        if (o26Var != null) {
            if (o26Var.g) {
                return o26Var.a;
            }
            return o26Var.b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.u0;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        return getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        o26 o26Var = this.s0;
        if (o26Var != null) {
            return o26Var.a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        o26 o26Var = this.s0;
        if (o26Var != null) {
            return o26Var.b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        o26 o26Var = this.s0;
        if (o26Var != null) {
            if (o26Var.g) {
                return o26Var.b;
            }
            return o26Var.a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.t0;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        return getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        i44 i44Var;
        ActionMenuView actionMenuView = this.A;
        if (actionMenuView != null && (i44Var = actionMenuView.o0) != null && i44Var.hasVisibleItems()) {
            return Math.max(getContentInsetEnd(), Math.max(this.u0, 0));
        }
        return getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        if (getLayoutDirection() == 1) {
            return getCurrentContentInsetEnd();
        }
        return getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        if (getLayoutDirection() == 1) {
            return getCurrentContentInsetStart();
        }
        return getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        if (getNavigationIcon() != null) {
            return Math.max(getContentInsetStart(), Math.max(this.t0, 0));
        }
        return getContentInsetStart();
    }

    public Drawable getLogo() {
        nr nrVar = this.d0;
        if (nrVar != null) {
            return nrVar.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        nr nrVar = this.d0;
        if (nrVar != null) {
            return nrVar.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.A.getMenu();
    }

    public View getNavButtonView() {
        return this.R;
    }

    public CharSequence getNavigationContentDescription() {
        mr mrVar = this.R;
        if (mrVar != null) {
            return mrVar.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        mr mrVar = this.R;
        if (mrVar != null) {
            return mrVar.getDrawable();
        }
        return null;
    }

    public g8 getOuterActionMenuPresenter() {
        return this.K0;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.A.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.i0;
    }

    public int getPopupTheme() {
        return this.j0;
    }

    public CharSequence getSubtitle() {
        return this.x0;
    }

    public final TextView getSubtitleTextView() {
        return this.L;
    }

    public CharSequence getTitle() {
        return this.w0;
    }

    public int getTitleMarginBottom() {
        return this.r0;
    }

    public int getTitleMarginEnd() {
        return this.p0;
    }

    public int getTitleMarginStart() {
        return this.o0;
    }

    public int getTitleMarginTop() {
        return this.q0;
    }

    public final TextView getTitleTextView() {
        return this.B;
    }

    public tc1 getWrapper() {
        if (this.J0 == null) {
            this.J0 = new l87(this, true);
        }
        return this.J0;
    }

    @Override // defpackage.l44
    public final void i(fl2 fl2Var) {
        m44 m44Var = this.F0;
        ((CopyOnWriteArrayList) m44Var.L).remove(fl2Var);
        if (((HashMap) m44Var.R).remove(fl2Var) == null) {
            ((Runnable) m44Var.B).run();
        } else {
            u34.a();
        }
    }

    public final int k(View view, int i) {
        int i2;
        e87 e87Var = (e87) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        if (i > 0) {
            i2 = (measuredHeight - i) / 2;
        } else {
            i2 = 0;
        }
        int i3 = e87Var.a & 112;
        if (i3 != 16 && i3 != 48 && i3 != 80) {
            i3 = this.v0 & 112;
        }
        if (i3 != 48) {
            if (i3 != 80) {
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int height = getHeight();
                int i4 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
                int i5 = ((ViewGroup.MarginLayoutParams) e87Var).topMargin;
                if (i4 < i5) {
                    i4 = i5;
                } else {
                    int i6 = (((height - paddingBottom) - measuredHeight) - i4) - paddingTop;
                    int i7 = ((ViewGroup.MarginLayoutParams) e87Var).bottomMargin;
                    if (i6 < i7) {
                        i4 = Math.max(0, i4 - (i7 - i6));
                    }
                }
                return paddingTop + i4;
            }
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) e87Var).bottomMargin) - i2;
        }
        return getPaddingTop() - i2;
    }

    @Override // defpackage.l44
    public final void m(fl2 fl2Var) {
        m44 m44Var = this.F0;
        ((CopyOnWriteArrayList) m44Var.L).add(fl2Var);
        ((Runnable) m44Var.B).run();
    }

    public final void o() {
        ArrayList arrayList = this.G0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            getMenu().removeItem(((MenuItem) obj).getItemId());
        }
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        MenuInflater menuInflater = getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.F0.L).iterator();
        while (it.hasNext()) {
            ((fl2) it.next()).a.k(menu, menuInflater);
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.G0 = currentMenuItems2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        x();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.S0);
        x();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.B0 = false;
        }
        if (!this.B0) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.B0 = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.B0 = false;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0285 A[LOOP:0: B:107:0x0283->B:108:0x0285, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x029d A[LOOP:1: B:110:0x029b->B:111:0x029d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02bd A[LOOP:2: B:113:0x02bb->B:114:0x02bd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0310 A[LOOP:3: B:122:0x030e->B:123:0x0310, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x020e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        int i5;
        int i6;
        int i7;
        int max;
        boolean v;
        boolean v2;
        boolean z3;
        int i8;
        qs qsVar;
        qs qsVar2;
        boolean z4;
        int i9;
        int paddingTop;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int size;
        int i16;
        int i17;
        int size2;
        int i18;
        int size3;
        int i19;
        int i20;
        int i21;
        int size4;
        if (getLayoutDirection() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i22 = width - paddingRight;
        int[] iArr = this.E0;
        iArr[1] = 0;
        iArr[0] = 0;
        WeakHashMap weakHashMap = ao7.a;
        int minimumHeight = getMinimumHeight();
        if (minimumHeight >= 0) {
            i5 = Math.min(minimumHeight, i4 - i2);
        } else {
            i5 = 0;
        }
        if (v(this.R)) {
            mr mrVar = this.R;
            if (z2) {
                i7 = s(mrVar, i22, i5, iArr);
                i6 = paddingLeft;
                if (v(this.g0)) {
                    mr mrVar2 = this.g0;
                    if (z2) {
                        i7 = s(mrVar2, i7, i5, iArr);
                    } else {
                        i6 = r(mrVar2, i6, i5, iArr);
                    }
                }
                if (v(this.A)) {
                    ActionMenuView actionMenuView = this.A;
                    if (z2) {
                        i6 = r(actionMenuView, i6, i5, iArr);
                    } else {
                        i7 = s(actionMenuView, i7, i5, iArr);
                    }
                }
                int currentContentInsetLeft = getCurrentContentInsetLeft();
                int currentContentInsetRight = getCurrentContentInsetRight();
                iArr[0] = Math.max(0, currentContentInsetLeft - i6);
                iArr[1] = Math.max(0, currentContentInsetRight - (i22 - i7));
                max = Math.max(i6, currentContentInsetLeft);
                int min = Math.min(i7, i22 - currentContentInsetRight);
                if (v(this.h0)) {
                    View view = this.h0;
                    if (z2) {
                        min = s(view, min, i5, iArr);
                    } else {
                        max = r(view, max, i5, iArr);
                    }
                }
                if (v(this.d0)) {
                    nr nrVar = this.d0;
                    if (z2) {
                        min = s(nrVar, min, i5, iArr);
                    } else {
                        max = r(nrVar, max, i5, iArr);
                    }
                }
                v = v(this.B);
                v2 = v(this.L);
                if (!v) {
                    e87 e87Var = (e87) this.B.getLayoutParams();
                    z3 = z2;
                    i8 = this.B.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) e87Var).topMargin + ((ViewGroup.MarginLayoutParams) e87Var).bottomMargin;
                } else {
                    z3 = z2;
                    i8 = 0;
                }
                if (!v2) {
                    e87 e87Var2 = (e87) this.L.getLayoutParams();
                    i8 = this.L.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) e87Var2).topMargin + ((ViewGroup.MarginLayoutParams) e87Var2).bottomMargin + i8;
                }
                if (!v || v2) {
                    if (!v) {
                        qsVar = this.B;
                    } else {
                        qsVar = this.L;
                    }
                    if (!v2) {
                        qsVar2 = this.L;
                    } else {
                        qsVar2 = this.B;
                    }
                    e87 e87Var3 = (e87) qsVar.getLayoutParams();
                    e87 e87Var4 = (e87) qsVar2.getLayoutParams();
                    int i23 = i8;
                    if ((!v && this.B.getMeasuredWidth() > 0) || (v2 && this.L.getMeasuredWidth() > 0)) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    i9 = this.v0 & 112;
                    int i24 = max;
                    if (i9 == 48) {
                        if (i9 != 80) {
                            int i25 = (((height - paddingTop2) - paddingBottom) - i23) / 2;
                            int i26 = ((ViewGroup.MarginLayoutParams) e87Var3).topMargin + this.q0;
                            if (i25 < i26) {
                                i25 = i26;
                            } else {
                                int i27 = (((height - paddingBottom) - i23) - i25) - paddingTop2;
                                int i28 = ((ViewGroup.MarginLayoutParams) e87Var3).bottomMargin;
                                int i29 = this.r0;
                                if (i27 < i28 + i29) {
                                    i25 = Math.max(0, i25 - ((((ViewGroup.MarginLayoutParams) e87Var4).bottomMargin + i29) - i27));
                                }
                            }
                            paddingTop = paddingTop2 + i25;
                        } else {
                            paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) e87Var4).bottomMargin) - this.r0) - i23;
                        }
                    } else {
                        paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) e87Var3).topMargin + this.q0;
                    }
                    if (!z3) {
                        if (z4) {
                            i13 = this.o0;
                        } else {
                            i13 = 0;
                        }
                        int i30 = i13 - iArr[1];
                        min -= Math.max(0, i30);
                        iArr[1] = Math.max(0, -i30);
                        if (v) {
                            int measuredWidth = min - this.B.getMeasuredWidth();
                            int measuredHeight = this.B.getMeasuredHeight() + paddingTop;
                            this.B.layout(measuredWidth, paddingTop, min, measuredHeight);
                            i14 = measuredWidth - this.p0;
                            paddingTop = measuredHeight + ((ViewGroup.MarginLayoutParams) ((e87) this.B.getLayoutParams())).bottomMargin;
                        } else {
                            i14 = min;
                        }
                        if (v2) {
                            int i31 = paddingTop + ((ViewGroup.MarginLayoutParams) ((e87) this.L.getLayoutParams())).topMargin;
                            this.L.layout(min - this.L.getMeasuredWidth(), i31, min, this.L.getMeasuredHeight() + i31);
                            i15 = min - this.p0;
                        } else {
                            i15 = min;
                        }
                        if (z4) {
                            min = Math.min(i14, i15);
                        }
                        max = i24;
                    } else {
                        if (z4) {
                            i10 = this.o0;
                        } else {
                            i10 = 0;
                        }
                        int i32 = i10 - iArr[0];
                        max = Math.max(0, i32) + i24;
                        iArr[0] = Math.max(0, -i32);
                        if (v) {
                            int measuredWidth2 = this.B.getMeasuredWidth() + max;
                            int measuredHeight2 = this.B.getMeasuredHeight() + paddingTop;
                            this.B.layout(max, paddingTop, measuredWidth2, measuredHeight2);
                            i11 = measuredWidth2 + this.p0;
                            paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) ((e87) this.B.getLayoutParams())).bottomMargin;
                        } else {
                            i11 = max;
                        }
                        if (v2) {
                            int i33 = paddingTop + ((ViewGroup.MarginLayoutParams) ((e87) this.L.getLayoutParams())).topMargin;
                            int measuredWidth3 = this.L.getMeasuredWidth() + max;
                            this.L.layout(max, i33, measuredWidth3, this.L.getMeasuredHeight() + i33);
                            i12 = measuredWidth3 + this.p0;
                        } else {
                            i12 = max;
                        }
                        if (z4) {
                            max = Math.max(i11, i12);
                        }
                    }
                }
                ArrayList arrayList = this.C0;
                a(3, arrayList);
                size = arrayList.size();
                i16 = max;
                for (i17 = 0; i17 < size; i17++) {
                    i16 = r((View) arrayList.get(i17), i16, i5, iArr);
                }
                a(5, arrayList);
                size2 = arrayList.size();
                for (i18 = 0; i18 < size2; i18++) {
                    min = s((View) arrayList.get(i18), min, i5, iArr);
                }
                a(1, arrayList);
                int i34 = iArr[0];
                int i35 = iArr[1];
                size3 = arrayList.size();
                int i36 = i34;
                i19 = 0;
                int i37 = 0;
                while (i19 < size3) {
                    View view2 = (View) arrayList.get(i19);
                    e87 e87Var5 = (e87) view2.getLayoutParams();
                    int i38 = i35;
                    int i39 = ((ViewGroup.MarginLayoutParams) e87Var5).leftMargin - i36;
                    int i40 = ((ViewGroup.MarginLayoutParams) e87Var5).rightMargin - i38;
                    int max2 = Math.max(0, i39);
                    int max3 = Math.max(0, i40);
                    int max4 = Math.max(0, -i39);
                    int max5 = Math.max(0, -i40);
                    i37 += view2.getMeasuredWidth() + max2 + max3;
                    i19++;
                    i36 = max4;
                    i35 = max5;
                }
                i21 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (i37 / 2);
                int i41 = i37 + i21;
                if (i21 >= i16) {
                    if (i41 > min) {
                        i16 = i21 - (i41 - min);
                    } else {
                        i16 = i21;
                    }
                }
                size4 = arrayList.size();
                for (i20 = 0; i20 < size4; i20++) {
                    i16 = r((View) arrayList.get(i20), i16, i5, iArr);
                }
                arrayList.clear();
            }
            i6 = r(mrVar, paddingLeft, i5, iArr);
        } else {
            i6 = paddingLeft;
        }
        i7 = i22;
        if (v(this.g0)) {
        }
        if (v(this.A)) {
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - i6);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i22 - i7));
        max = Math.max(i6, currentContentInsetLeft2);
        int min2 = Math.min(i7, i22 - currentContentInsetRight2);
        if (v(this.h0)) {
        }
        if (v(this.d0)) {
        }
        v = v(this.B);
        v2 = v(this.L);
        if (!v) {
        }
        if (!v2) {
        }
        if (!v) {
        }
        if (!v) {
        }
        if (!v2) {
        }
        e87 e87Var32 = (e87) qsVar.getLayoutParams();
        e87 e87Var42 = (e87) qsVar2.getLayoutParams();
        int i232 = i8;
        if (!v) {
        }
        z4 = false;
        i9 = this.v0 & 112;
        int i242 = max;
        if (i9 == 48) {
        }
        if (!z3) {
        }
        ArrayList arrayList2 = this.C0;
        a(3, arrayList2);
        size = arrayList2.size();
        i16 = max;
        while (i17 < size) {
        }
        a(5, arrayList2);
        size2 = arrayList2.size();
        while (i18 < size2) {
        }
        a(1, arrayList2);
        int i342 = iArr[0];
        int i352 = iArr[1];
        size3 = arrayList2.size();
        int i362 = i342;
        i19 = 0;
        int i372 = 0;
        while (i19 < size3) {
        }
        i21 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (i372 / 2);
        int i412 = i372 + i21;
        if (i21 >= i16) {
        }
        size4 = arrayList2.size();
        while (i20 < size4) {
        }
        arrayList2.clear();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        char c;
        Object[] objArr;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z = eq7.a;
        int i10 = 0;
        if (getLayoutDirection() == 1) {
            objArr = 1;
            c = 0;
        } else {
            c = 1;
            objArr = null;
        }
        if (v(this.R)) {
            u(this.R, i, 0, i2, this.n0);
            i3 = l(this.R) + this.R.getMeasuredWidth();
            i4 = Math.max(0, n(this.R) + this.R.getMeasuredHeight());
            i5 = View.combineMeasuredStates(0, this.R.getMeasuredState());
        } else {
            i3 = 0;
            i4 = 0;
            i5 = 0;
        }
        if (v(this.g0)) {
            u(this.g0, i, 0, i2, this.n0);
            i3 = l(this.g0) + this.g0.getMeasuredWidth();
            i4 = Math.max(i4, n(this.g0) + this.g0.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.g0.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i3);
        int max2 = Math.max(0, currentContentInsetStart - i3);
        Object[] objArr2 = objArr;
        int[] iArr = this.E0;
        iArr[objArr2 == 1 ? 1 : 0] = max2;
        if (v(this.A)) {
            u(this.A, i, max, i2, this.n0);
            i6 = l(this.A) + this.A.getMeasuredWidth();
            i4 = Math.max(i4, n(this.A) + this.A.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.A.getMeasuredState());
        } else {
            i6 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max3 = max + Math.max(currentContentInsetEnd, i6);
        iArr[c] = Math.max(0, currentContentInsetEnd - i6);
        if (v(this.h0)) {
            max3 += t(this.h0, i, max3, i2, 0, iArr);
            i4 = Math.max(i4, n(this.h0) + this.h0.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.h0.getMeasuredState());
        }
        if (v(this.d0)) {
            max3 += t(this.d0, i, max3, i2, 0, iArr);
            i4 = Math.max(i4, n(this.d0) + this.d0.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.d0.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (((e87) childAt.getLayoutParams()).b == 0 && v(childAt)) {
                max3 += t(childAt, i, max3, i2, 0, iArr);
                int max4 = Math.max(i4, n(childAt) + childAt.getMeasuredHeight());
                i5 = View.combineMeasuredStates(i5, childAt.getMeasuredState());
                i4 = max4;
            } else {
                max3 = max3;
            }
        }
        int i12 = max3;
        int i13 = this.q0 + this.r0;
        int i14 = this.o0 + this.p0;
        if (v(this.B)) {
            t(this.B, i, i12 + i14, i2, i13, iArr);
            int l = l(this.B) + this.B.getMeasuredWidth();
            i7 = n(this.B) + this.B.getMeasuredHeight();
            i8 = View.combineMeasuredStates(i5, this.B.getMeasuredState());
            i9 = l;
        } else {
            i7 = 0;
            i8 = i5;
            i9 = 0;
        }
        if (v(this.L)) {
            i9 = Math.max(i9, t(this.L, i, i12 + i14, i2, i13 + i7, iArr));
            i7 += n(this.L) + this.L.getMeasuredHeight();
            i8 = View.combineMeasuredStates(i8, this.L.getMeasuredState());
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop() + Math.max(i4, i7);
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + i12 + i9, getSuggestedMinimumWidth()), i, (-16777216) & i8);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, i8 << 16);
        if (this.O0) {
            int childCount2 = getChildCount();
            for (int i15 = 0; i15 < childCount2; i15++) {
                View childAt2 = getChildAt(i15);
                if (!v(childAt2) || childAt2.getMeasuredWidth() <= 0 || childAt2.getMeasuredHeight() <= 0) {
                }
            }
            setMeasuredDimension(resolveSizeAndState, i10);
        }
        i10 = resolveSizeAndState2;
        setMeasuredDimension(resolveSizeAndState, i10);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        i44 i44Var;
        MenuItem findItem;
        if (!(parcelable instanceof g87)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g87 g87Var = (g87) parcelable;
        super.onRestoreInstanceState(g87Var.A);
        ActionMenuView actionMenuView = this.A;
        if (actionMenuView != null) {
            i44Var = actionMenuView.o0;
        } else {
            i44Var = null;
        }
        int i = g87Var.L;
        if (i != 0 && this.L0 != null && i44Var != null && (findItem = i44Var.findItem(i)) != null) {
            findItem.expandActionView();
        }
        if (g87Var.R) {
            g15 g15Var = this.S0;
            removeCallbacks(g15Var);
            post(g15Var);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        d();
        o26 o26Var = this.s0;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        if (z == o26Var.g) {
            return;
        }
        o26Var.g = z;
        if (o26Var.h) {
            if (z) {
                int i2 = o26Var.d;
                if (i2 == Integer.MIN_VALUE) {
                    i2 = o26Var.e;
                }
                o26Var.a = i2;
                int i3 = o26Var.c;
                if (i3 == Integer.MIN_VALUE) {
                    i3 = o26Var.f;
                }
                o26Var.b = i3;
                return;
            }
            int i4 = o26Var.c;
            if (i4 == Integer.MIN_VALUE) {
                i4 = o26Var.e;
            }
            o26Var.a = i4;
            int i5 = o26Var.d;
            if (i5 == Integer.MIN_VALUE) {
                i5 = o26Var.f;
            }
            o26Var.b = i5;
            return;
        }
        o26Var.a = o26Var.e;
        o26Var.b = o26Var.f;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [s, android.os.Parcelable, g87] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        o44 o44Var;
        ?? sVar = new s(super.onSaveInstanceState());
        d87 d87Var = this.L0;
        if (d87Var != null && (o44Var = d87Var.B) != null) {
            sVar.L = o44Var.a;
        }
        sVar.R = q();
        return sVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.A0 = false;
        }
        if (!this.A0) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.A0 = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.A0 = false;
        return true;
    }

    public final boolean p(View view) {
        if (view.getParent() != this && !this.D0.contains(view)) {
            return false;
        }
        return true;
    }

    public final boolean q() {
        g8 g8Var;
        ActionMenuView actionMenuView = this.A;
        if (actionMenuView != null && (g8Var = actionMenuView.s0) != null && g8Var.j()) {
            return true;
        }
        return false;
    }

    public final int r(View view, int i, int i2, int[] iArr) {
        e87 e87Var = (e87) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) e87Var).leftMargin - iArr[0];
        int max = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int k = k(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, k, max + measuredWidth, view.getMeasuredHeight() + k);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) e87Var).rightMargin + max;
    }

    public final int s(View view, int i, int i2, int[] iArr) {
        e87 e87Var = (e87) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) e87Var).rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int k = k(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, k, max, view.getMeasuredHeight() + k);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) e87Var).leftMargin);
    }

    public void setBackInvokedCallbackEnabled(boolean z) {
        if (this.R0 != z) {
            this.R0 = z;
            x();
        }
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        mr mrVar = this.g0;
        if (mrVar != null) {
            mrVar.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.g0.setImageDrawable(drawable);
            return;
        }
        mr mrVar = this.g0;
        if (mrVar != null) {
            mrVar.setImageDrawable(this.e0);
        }
    }

    public void setCollapsible(boolean z) {
        this.O0 = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.u0) {
            this.u0 = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.t0) {
            this.t0 = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(Drawable drawable) {
        nr nrVar = this.d0;
        if (drawable != null) {
            if (nrVar == null) {
                this.d0 = new nr(getContext(), null, 0);
            }
            if (!p(this.d0)) {
                b(this.d0, true);
            }
        } else if (nrVar != null && p(nrVar)) {
            removeView(this.d0);
            this.D0.remove(this.d0);
        }
        nr nrVar2 = this.d0;
        if (nrVar2 != null) {
            nrVar2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.d0 == null) {
            this.d0 = new nr(getContext(), null, 0);
        }
        nr nrVar = this.d0;
        if (nrVar != null) {
            nrVar.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        mr mrVar = this.R;
        if (mrVar != null) {
            mrVar.setContentDescription(charSequence);
            bl2.R(this.R, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            if (!p(this.R)) {
                b(this.R, true);
            }
        } else {
            mr mrVar = this.R;
            if (mrVar != null && p(mrVar)) {
                removeView(this.R);
                this.D0.remove(this.R);
            }
        }
        mr mrVar2 = this.R;
        if (mrVar2 != null) {
            mrVar2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        g();
        this.R.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(f87 f87Var) {
        this.H0 = f87Var;
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.A.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.j0 != i) {
            this.j0 = i;
            if (i == 0) {
                this.i0 = getContext();
            } else {
                this.i0 = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        qs qsVar = this.L;
        if (!isEmpty) {
            if (qsVar == null) {
                Context context = getContext();
                qs qsVar2 = new qs(context, null);
                this.L = qsVar2;
                qsVar2.setSingleLine();
                this.L.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.l0;
                if (i != 0) {
                    this.L.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.z0;
                if (colorStateList != null) {
                    this.L.setTextColor(colorStateList);
                }
            }
            if (!p(this.L)) {
                b(this.L, true);
            }
        } else if (qsVar != null && p(qsVar)) {
            removeView(this.L);
            this.D0.remove(this.L);
        }
        qs qsVar3 = this.L;
        if (qsVar3 != null) {
            qsVar3.setText(charSequence);
        }
        this.x0 = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.z0 = colorStateList;
        qs qsVar = this.L;
        if (qsVar != null) {
            qsVar.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        qs qsVar = this.B;
        if (!isEmpty) {
            if (qsVar == null) {
                Context context = getContext();
                qs qsVar2 = new qs(context, null);
                this.B = qsVar2;
                qsVar2.setSingleLine();
                this.B.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.k0;
                if (i != 0) {
                    this.B.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.y0;
                if (colorStateList != null) {
                    this.B.setTextColor(colorStateList);
                }
            }
            if (!p(this.B)) {
                b(this.B, true);
            }
        } else if (qsVar != null && p(qsVar)) {
            removeView(this.B);
            this.D0.remove(this.B);
        }
        qs qsVar3 = this.B;
        if (qsVar3 != null) {
            qsVar3.setText(charSequence);
        }
        this.w0 = charSequence;
    }

    public void setTitleMarginBottom(int i) {
        this.r0 = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.p0 = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.o0 = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.q0 = i;
        requestLayout();
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.y0 = colorStateList;
        qs qsVar = this.B;
        if (qsVar != null) {
            qsVar.setTextColor(colorStateList);
        }
    }

    public final int t(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i6) + Math.max(0, i5);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + max + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public final void u(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i4 >= 0) {
            if (mode != 0) {
                i4 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i4);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final boolean v(View view) {
        if (view != null && view.getParent() == this && view.getVisibility() != 8) {
            return true;
        }
        return false;
    }

    public final boolean w() {
        g8 g8Var;
        ActionMenuView actionMenuView = this.A;
        if (actionMenuView != null && (g8Var = actionMenuView.s0) != null && g8Var.l()) {
            return true;
        }
        return false;
    }

    public final void x() {
        boolean z;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher a = c87.a(this);
            d87 d87Var = this.L0;
            if (d87Var != null && d87Var.B != null && a != null && isAttachedToWindow() && this.R0) {
                z = true;
            } else {
                z = false;
            }
            if (z && this.Q0 == null) {
                if (this.P0 == null) {
                    this.P0 = c87.b(new b87(this, 0));
                }
                c87.c(a, this.P0);
                this.Q0 = a;
            } else if (!z && (onBackInvokedDispatcher = this.Q0) != null) {
                c87.d(onBackInvokedDispatcher, this.P0);
                this.Q0 = null;
            }
        }
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(hf.S(getContext(), i));
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return j(layoutParams);
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(hf.S(getContext(), i));
    }

    public void setLogo(int i) {
        setLogo(hf.S(getContext(), i));
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
