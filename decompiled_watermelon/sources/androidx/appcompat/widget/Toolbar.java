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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public class Toolbar extends ViewGroup implements xw3 {
    public ActionMenuView A;
    public boolean A0;
    public ds B;
    public final ArrayList B0;
    public final ArrayList C0;
    public final int[] D0;
    public final os E0;
    public ArrayList F0;
    public rv6 G0;
    public final nv6 H0;
    public yv6 I0;
    public f8 J0;
    public pv6 K0;
    public ds L;
    public i40 L0;
    public tv6 M0;
    public boolean N0;
    public OnBackInvokedCallback O0;
    public OnBackInvokedDispatcher P0;
    public boolean Q0;
    public zq R;
    public final es4 R0;
    public ar c0;
    public final Drawable d0;
    public final CharSequence e0;
    public zq f0;
    public View g0;
    public Context h0;
    public int i0;
    public int j0;
    public int k0;
    public final int l0;
    public final int m0;
    public int n0;
    public int o0;
    public int p0;
    public int q0;
    public vr5 r0;
    public int s0;
    public int t0;
    public final int u0;
    public CharSequence v0;
    public CharSequence w0;
    public ColorStateList x0;
    public ColorStateList y0;
    public boolean z0;

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.u0 = 8388627;
        this.B0 = new ArrayList();
        this.C0 = new ArrayList();
        this.D0 = new int[2];
        this.E0 = new os(new mv6(this, 1));
        this.F0 = new ArrayList();
        this.H0 = new nv6(this);
        this.R0 = new es4(25, this);
        Context context2 = getContext();
        int[] iArr = by4.y;
        n85 q = n85.q(context2, attributeSet, iArr, R.attr.toolbarStyle);
        aa7.m(this, context, iArr, attributeSet, (TypedArray) q.L, R.attr.toolbarStyle);
        TypedArray typedArray = (TypedArray) q.L;
        this.j0 = typedArray.getResourceId(28, 0);
        this.k0 = typedArray.getResourceId(19, 0);
        this.u0 = typedArray.getInteger(0, 8388627);
        this.l0 = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.q0 = dimensionPixelOffset;
        this.p0 = dimensionPixelOffset;
        this.o0 = dimensionPixelOffset;
        this.n0 = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.n0 = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.o0 = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.p0 = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.q0 = dimensionPixelOffset5;
        }
        this.m0 = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        e();
        vr5 vr5Var = this.r0;
        vr5Var.h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            vr5Var.e = dimensionPixelSize;
            vr5Var.a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            vr5Var.f = dimensionPixelSize2;
            vr5Var.b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            vr5Var.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.s0 = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.t0 = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.d0 = q.f(4);
        this.e0 = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.h0 = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable f = q.f(16);
        if (f != null) {
            setNavigationIcon(f);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable f2 = q.f(11);
        if (f2 != null) {
            setLogo(f2);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(q.e(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(q.e(20));
        }
        if (typedArray.hasValue(14)) {
            getMenuInflater().inflate(typedArray.getResourceId(14, 0), getMenu());
        }
        q.t();
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
        return new qi6(getContext());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [qv6, android.view.ViewGroup$MarginLayoutParams] */
    public static qv6 i() {
        ?? marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.b = 0;
        marginLayoutParams.a = 8388627;
        return marginLayoutParams;
    }

    public static qv6 k(ViewGroup.LayoutParams layoutParams) {
        boolean z = layoutParams instanceof qv6;
        if (z) {
            qv6 qv6Var = (qv6) layoutParams;
            qv6 qv6Var2 = new qv6(qv6Var);
            qv6Var2.b = 0;
            qv6Var2.b = qv6Var.b;
            return qv6Var2;
        } else if (z) {
            qv6 qv6Var3 = new qv6((qv6) layoutParams);
            qv6Var3.b = 0;
            return qv6Var3;
        } else if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            qv6 qv6Var4 = new qv6(marginLayoutParams);
            qv6Var4.b = 0;
            ((ViewGroup.MarginLayoutParams) qv6Var4).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) qv6Var4).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) qv6Var4).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) qv6Var4).bottomMargin = marginLayoutParams.bottomMargin;
            return qv6Var4;
        } else {
            qv6 qv6Var5 = new qv6(layoutParams);
            qv6Var5.b = 0;
            return qv6Var5;
        }
    }

    public static int m(View view) {
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
                qv6 qv6Var = (qv6) childAt.getLayoutParams();
                if (qv6Var.b == 0 && v(childAt)) {
                    int i3 = qv6Var.a;
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
            qv6 qv6Var2 = (qv6) childAt2.getLayoutParams();
            if (qv6Var2.b == 0 && v(childAt2)) {
                int i5 = qv6Var2.a;
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
        qv6 qv6Var;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            qv6Var = i();
        } else if (!checkLayoutParams(layoutParams)) {
            qv6Var = k(layoutParams);
        } else {
            qv6Var = (qv6) layoutParams;
        }
        qv6Var.b = 1;
        if (z && this.g0 != null) {
            view.setLayoutParams(qv6Var);
            this.C0.add(view);
            return;
        }
        addView(view, qv6Var);
    }

    @Override // defpackage.xw3
    public final void c(gg2 gg2Var) {
        os osVar = this.E0;
        ((CopyOnWriteArrayList) osVar.R).remove(gg2Var);
        if (((HashMap) osVar.B).remove(gg2Var) == null) {
            ((Runnable) osVar.L).run();
        } else {
            c44.b();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (super.checkLayoutParams(layoutParams) && (layoutParams instanceof qv6)) {
            return true;
        }
        return false;
    }

    public final void d() {
        if (this.f0 == null) {
            zq zqVar = new zq(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.f0 = zqVar;
            zqVar.setImageDrawable(this.d0);
            this.f0.setContentDescription(this.e0);
            qv6 i = i();
            i.a = (this.l0 & 112) | 8388611;
            i.b = 2;
            this.f0.setLayoutParams(i);
            this.f0.setOnClickListener(new q7(4, this));
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [vr5, java.lang.Object] */
    public final void e() {
        if (this.r0 == null) {
            ?? obj = new Object();
            obj.a = 0;
            obj.b = 0;
            obj.c = Integer.MIN_VALUE;
            obj.d = Integer.MIN_VALUE;
            obj.e = 0;
            obj.f = 0;
            obj.g = false;
            obj.h = false;
            this.r0 = obj;
        }
    }

    public final void f() {
        g();
        ActionMenuView actionMenuView = this.A;
        if (actionMenuView.n0 == null) {
            uw3 uw3Var = (uw3) actionMenuView.getMenu();
            if (this.K0 == null) {
                this.K0 = new pv6(this);
            }
            this.A.setExpandedActionViewsExclusive(true);
            uw3Var.b(this.K0, this.h0);
            x();
        }
    }

    public final void g() {
        if (this.A == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.A = actionMenuView;
            actionMenuView.setPopupTheme(this.i0);
            this.A.setOnMenuItemClickListener(this.H0);
            ActionMenuView actionMenuView2 = this.A;
            i40 i40Var = this.L0;
            nv6 nv6Var = new nv6(this);
            actionMenuView2.s0 = i40Var;
            actionMenuView2.t0 = nv6Var;
            qv6 i = i();
            i.a = (this.l0 & 112) | 8388613;
            this.A.setLayoutParams(i);
            b(this.A, false);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return i();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [qv6, android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams] */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        ?? marginLayoutParams = new ViewGroup.MarginLayoutParams(context, attributeSet);
        marginLayoutParams.a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, by4.b);
        marginLayoutParams.a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        marginLayoutParams.b = 0;
        return marginLayoutParams;
    }

    public CharSequence getCollapseContentDescription() {
        zq zqVar = this.f0;
        if (zqVar != null) {
            return zqVar.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        zq zqVar = this.f0;
        if (zqVar != null) {
            return zqVar.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        vr5 vr5Var = this.r0;
        if (vr5Var != null) {
            if (vr5Var.g) {
                return vr5Var.a;
            }
            return vr5Var.b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.t0;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        return getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        vr5 vr5Var = this.r0;
        if (vr5Var != null) {
            return vr5Var.a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        vr5 vr5Var = this.r0;
        if (vr5Var != null) {
            return vr5Var.b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        vr5 vr5Var = this.r0;
        if (vr5Var != null) {
            if (vr5Var.g) {
                return vr5Var.b;
            }
            return vr5Var.a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.s0;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        return getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        uw3 uw3Var;
        ActionMenuView actionMenuView = this.A;
        if (actionMenuView != null && (uw3Var = actionMenuView.n0) != null && uw3Var.hasVisibleItems()) {
            return Math.max(getContentInsetEnd(), Math.max(this.t0, 0));
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
            return Math.max(getContentInsetStart(), Math.max(this.s0, 0));
        }
        return getContentInsetStart();
    }

    public Drawable getLogo() {
        ar arVar = this.c0;
        if (arVar != null) {
            return arVar.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ar arVar = this.c0;
        if (arVar != null) {
            return arVar.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        f();
        return this.A.getMenu();
    }

    public View getNavButtonView() {
        return this.R;
    }

    public CharSequence getNavigationContentDescription() {
        zq zqVar = this.R;
        if (zqVar != null) {
            return zqVar.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        zq zqVar = this.R;
        if (zqVar != null) {
            return zqVar.getDrawable();
        }
        return null;
    }

    public f8 getOuterActionMenuPresenter() {
        return this.J0;
    }

    public Drawable getOverflowIcon() {
        f();
        return this.A.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.h0;
    }

    public int getPopupTheme() {
        return this.i0;
    }

    public CharSequence getSubtitle() {
        return this.w0;
    }

    public final TextView getSubtitleTextView() {
        return this.L;
    }

    public CharSequence getTitle() {
        return this.v0;
    }

    public int getTitleMarginBottom() {
        return this.q0;
    }

    public int getTitleMarginEnd() {
        return this.o0;
    }

    public int getTitleMarginStart() {
        return this.n0;
    }

    public int getTitleMarginTop() {
        return this.p0;
    }

    public final TextView getTitleTextView() {
        return this.B;
    }

    public c91 getWrapper() {
        if (this.I0 == null) {
            this.I0 = new yv6(this, true);
        }
        return this.I0;
    }

    public final void h() {
        if (this.R == null) {
            this.R = new zq(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            qv6 i = i();
            i.a = (this.l0 & 112) | 8388611;
            this.R.setLayoutParams(i);
        }
    }

    @Override // defpackage.xw3
    public final void j(gg2 gg2Var) {
        os osVar = this.E0;
        ((CopyOnWriteArrayList) osVar.R).add(gg2Var);
        ((Runnable) osVar.L).run();
    }

    public final int l(View view, int i) {
        int i2;
        qv6 qv6Var = (qv6) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        if (i > 0) {
            i2 = (measuredHeight - i) / 2;
        } else {
            i2 = 0;
        }
        int i3 = qv6Var.a & 112;
        if (i3 != 16 && i3 != 48 && i3 != 80) {
            i3 = this.u0 & 112;
        }
        if (i3 != 48) {
            if (i3 != 80) {
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int height = getHeight();
                int i4 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
                int i5 = ((ViewGroup.MarginLayoutParams) qv6Var).topMargin;
                if (i4 < i5) {
                    i4 = i5;
                } else {
                    int i6 = (((height - paddingBottom) - measuredHeight) - i4) - paddingTop;
                    int i7 = ((ViewGroup.MarginLayoutParams) qv6Var).bottomMargin;
                    if (i6 < i7) {
                        i4 = Math.max(0, i4 - (i7 - i6));
                    }
                }
                return paddingTop + i4;
            }
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) qv6Var).bottomMargin) - i2;
        }
        return getPaddingTop() - i2;
    }

    public final void o() {
        ArrayList arrayList = this.F0;
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
        Iterator it = ((CopyOnWriteArrayList) this.E0.R).iterator();
        while (it.hasNext()) {
            ((gg2) it.next()).a.k(menu, menuInflater);
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.F0 = currentMenuItems2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        x();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.R0);
        x();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.A0 = false;
        }
        if (!this.A0) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.A0 = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.A0 = false;
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
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 801
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
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
        boolean z = dc7.a;
        int i10 = 0;
        if (getLayoutDirection() == 1) {
            objArr = 1;
            c = 0;
        } else {
            c = 1;
            objArr = null;
        }
        if (v(this.R)) {
            u(this.R, i, 0, i2, this.m0);
            i3 = m(this.R) + this.R.getMeasuredWidth();
            i4 = Math.max(0, n(this.R) + this.R.getMeasuredHeight());
            i5 = View.combineMeasuredStates(0, this.R.getMeasuredState());
        } else {
            i3 = 0;
            i4 = 0;
            i5 = 0;
        }
        if (v(this.f0)) {
            u(this.f0, i, 0, i2, this.m0);
            i3 = m(this.f0) + this.f0.getMeasuredWidth();
            i4 = Math.max(i4, n(this.f0) + this.f0.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.f0.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i3);
        int max2 = Math.max(0, currentContentInsetStart - i3);
        Object[] objArr2 = objArr;
        int[] iArr = this.D0;
        iArr[objArr2 == 1 ? 1 : 0] = max2;
        if (v(this.A)) {
            u(this.A, i, max, i2, this.m0);
            i6 = m(this.A) + this.A.getMeasuredWidth();
            i4 = Math.max(i4, n(this.A) + this.A.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.A.getMeasuredState());
        } else {
            i6 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max3 = max + Math.max(currentContentInsetEnd, i6);
        iArr[c] = Math.max(0, currentContentInsetEnd - i6);
        if (v(this.g0)) {
            max3 += t(this.g0, i, max3, i2, 0, iArr);
            i4 = Math.max(i4, n(this.g0) + this.g0.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.g0.getMeasuredState());
        }
        if (v(this.c0)) {
            max3 += t(this.c0, i, max3, i2, 0, iArr);
            i4 = Math.max(i4, n(this.c0) + this.c0.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.c0.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (((qv6) childAt.getLayoutParams()).b == 0 && v(childAt)) {
                max3 += t(childAt, i, max3, i2, 0, iArr);
                int max4 = Math.max(i4, n(childAt) + childAt.getMeasuredHeight());
                i5 = View.combineMeasuredStates(i5, childAt.getMeasuredState());
                i4 = max4;
            } else {
                max3 = max3;
            }
        }
        int i12 = max3;
        int i13 = this.p0 + this.q0;
        int i14 = this.n0 + this.o0;
        if (v(this.B)) {
            t(this.B, i, i12 + i14, i2, i13, iArr);
            int m = m(this.B) + this.B.getMeasuredWidth();
            i7 = n(this.B) + this.B.getMeasuredHeight();
            i8 = View.combineMeasuredStates(i5, this.B.getMeasuredState());
            i9 = m;
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
        if (this.N0) {
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
        uw3 uw3Var;
        MenuItem findItem;
        if (!(parcelable instanceof sv6)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        sv6 sv6Var = (sv6) parcelable;
        super.onRestoreInstanceState(sv6Var.A);
        ActionMenuView actionMenuView = this.A;
        if (actionMenuView != null) {
            uw3Var = actionMenuView.n0;
        } else {
            uw3Var = null;
        }
        int i = sv6Var.L;
        if (i != 0 && this.K0 != null && uw3Var != null && (findItem = uw3Var.findItem(i)) != null) {
            findItem.expandActionView();
        }
        if (sv6Var.R) {
            es4 es4Var = this.R0;
            removeCallbacks(es4Var);
            post(es4Var);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        e();
        vr5 vr5Var = this.r0;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        if (z == vr5Var.g) {
            return;
        }
        vr5Var.g = z;
        if (vr5Var.h) {
            if (z) {
                int i2 = vr5Var.d;
                if (i2 == Integer.MIN_VALUE) {
                    i2 = vr5Var.e;
                }
                vr5Var.a = i2;
                int i3 = vr5Var.c;
                if (i3 == Integer.MIN_VALUE) {
                    i3 = vr5Var.f;
                }
                vr5Var.b = i3;
                return;
            }
            int i4 = vr5Var.c;
            if (i4 == Integer.MIN_VALUE) {
                i4 = vr5Var.e;
            }
            vr5Var.a = i4;
            int i5 = vr5Var.d;
            if (i5 == Integer.MIN_VALUE) {
                i5 = vr5Var.f;
            }
            vr5Var.b = i5;
            return;
        }
        vr5Var.a = vr5Var.e;
        vr5Var.b = vr5Var.f;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [r, sv6, android.os.Parcelable] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        zw3 zw3Var;
        ?? rVar = new r(super.onSaveInstanceState());
        pv6 pv6Var = this.K0;
        if (pv6Var != null && (zw3Var = pv6Var.B) != null) {
            rVar.L = zw3Var.a;
        }
        rVar.R = q();
        return rVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.z0 = false;
        }
        if (!this.z0) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.z0 = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.z0 = false;
        return true;
    }

    public final boolean p(View view) {
        if (view.getParent() != this && !this.C0.contains(view)) {
            return false;
        }
        return true;
    }

    public final boolean q() {
        f8 f8Var;
        ActionMenuView actionMenuView = this.A;
        if (actionMenuView != null && (f8Var = actionMenuView.r0) != null && f8Var.h()) {
            return true;
        }
        return false;
    }

    public final int r(View view, int i, int i2, int[] iArr) {
        qv6 qv6Var = (qv6) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) qv6Var).leftMargin - iArr[0];
        int max = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int l = l(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, l, max + measuredWidth, view.getMeasuredHeight() + l);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) qv6Var).rightMargin + max;
    }

    public final int s(View view, int i, int i2, int[] iArr) {
        qv6 qv6Var = (qv6) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) qv6Var).rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int l = l(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, l, max, view.getMeasuredHeight() + l);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) qv6Var).leftMargin);
    }

    public void setBackInvokedCallbackEnabled(boolean z) {
        if (this.Q0 != z) {
            this.Q0 = z;
            x();
        }
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            d();
        }
        zq zqVar = this.f0;
        if (zqVar != null) {
            zqVar.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            d();
            this.f0.setImageDrawable(drawable);
            return;
        }
        zq zqVar = this.f0;
        if (zqVar != null) {
            zqVar.setImageDrawable(this.d0);
        }
    }

    public void setCollapsible(boolean z) {
        this.N0 = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
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

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.s0) {
            this.s0 = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(Drawable drawable) {
        ar arVar = this.c0;
        if (drawable != null) {
            if (arVar == null) {
                this.c0 = new ar(getContext(), null, 0);
            }
            if (!p(this.c0)) {
                b(this.c0, true);
            }
        } else if (arVar != null && p(arVar)) {
            removeView(this.c0);
            this.C0.remove(this.c0);
        }
        ar arVar2 = this.c0;
        if (arVar2 != null) {
            arVar2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.c0 == null) {
            this.c0 = new ar(getContext(), null, 0);
        }
        ar arVar = this.c0;
        if (arVar != null) {
            arVar.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            h();
        }
        zq zqVar = this.R;
        if (zqVar != null) {
            zqVar.setContentDescription(charSequence);
            sn2.N(this.R, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            h();
            if (!p(this.R)) {
                b(this.R, true);
            }
        } else {
            zq zqVar = this.R;
            if (zqVar != null && p(zqVar)) {
                removeView(this.R);
                this.C0.remove(this.R);
            }
        }
        zq zqVar2 = this.R;
        if (zqVar2 != null) {
            zqVar2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        h();
        this.R.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(rv6 rv6Var) {
        this.G0 = rv6Var;
    }

    public void setOverflowIcon(Drawable drawable) {
        f();
        this.A.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.i0 != i) {
            this.i0 = i;
            if (i == 0) {
                this.h0 = getContext();
            } else {
                this.h0 = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        ds dsVar = this.L;
        if (!isEmpty) {
            if (dsVar == null) {
                Context context = getContext();
                ds dsVar2 = new ds(context, null);
                this.L = dsVar2;
                dsVar2.setSingleLine();
                this.L.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.k0;
                if (i != 0) {
                    this.L.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.y0;
                if (colorStateList != null) {
                    this.L.setTextColor(colorStateList);
                }
            }
            if (!p(this.L)) {
                b(this.L, true);
            }
        } else if (dsVar != null && p(dsVar)) {
            removeView(this.L);
            this.C0.remove(this.L);
        }
        ds dsVar3 = this.L;
        if (dsVar3 != null) {
            dsVar3.setText(charSequence);
        }
        this.w0 = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.y0 = colorStateList;
        ds dsVar = this.L;
        if (dsVar != null) {
            dsVar.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        ds dsVar = this.B;
        if (!isEmpty) {
            if (dsVar == null) {
                Context context = getContext();
                ds dsVar2 = new ds(context, null);
                this.B = dsVar2;
                dsVar2.setSingleLine();
                this.B.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.j0;
                if (i != 0) {
                    this.B.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.x0;
                if (colorStateList != null) {
                    this.B.setTextColor(colorStateList);
                }
            }
            if (!p(this.B)) {
                b(this.B, true);
            }
        } else if (dsVar != null && p(dsVar)) {
            removeView(this.B);
            this.C0.remove(this.B);
        }
        ds dsVar3 = this.B;
        if (dsVar3 != null) {
            dsVar3.setText(charSequence);
        }
        this.v0 = charSequence;
    }

    public void setTitleMarginBottom(int i) {
        this.q0 = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.o0 = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.n0 = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.p0 = i;
        requestLayout();
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.x0 = colorStateList;
        ds dsVar = this.B;
        if (dsVar != null) {
            dsVar.setTextColor(colorStateList);
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
        f8 f8Var;
        ActionMenuView actionMenuView = this.A;
        if (actionMenuView != null && (f8Var = actionMenuView.r0) != null && f8Var.l()) {
            return true;
        }
        return false;
    }

    public final void x() {
        boolean z;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher a = ov6.a(this);
            pv6 pv6Var = this.K0;
            if (pv6Var != null && pv6Var.B != null && a != null && isAttachedToWindow() && this.Q0) {
                z = true;
            } else {
                z = false;
            }
            if (z && this.P0 == null) {
                if (this.O0 == null) {
                    this.O0 = ov6.b(new mv6(this, 0));
                }
                ov6.c(a, this.O0);
                this.P0 = a;
            } else if (!z && (onBackInvokedDispatcher = this.P0) != null) {
                ov6.d(onBackInvokedDispatcher, this.O0);
                this.P0 = null;
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
        setCollapseIcon(l07.M(getContext(), i));
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(l07.M(getContext(), i));
    }

    public void setLogo(int i) {
        setLogo(l07.M(getContext(), i));
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
