package androidx.appcompat.widget;

import a0.l;
import a4.n;
import a6.p;
import a6.x0;
import ad.g;
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
import androidx.fragment.app.y0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import l.d0;
import m9.o;
import me.magnum.melonds.R;
import o.h;
import p1.c1;
import p7.t;
import q.e3;
import q.f3;
import q.g3;
import q.h1;
import q.h3;
import q.i3;
import q.j;
import q.j3;
import q.k3;
import q.m2;
import q.m3;
import q.u3;
import q.v;
import q.w;
import q.z0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class Toolbar extends ViewGroup implements p {
    public ActionMenuView A;
    public final ArrayList A0;
    public z0 B;
    public final ArrayList B0;
    public final int[] C0;
    public final n D0;
    public ArrayList E0;
    public j3 F0;
    public final f3 G0;
    public m3 H0;
    public j I0;
    public h3 J0;
    public l K0;
    public z0 L;
    public d0 L0;
    public boolean M0;
    public OnBackInvokedCallback N0;
    public OnBackInvokedDispatcher O0;
    public boolean P0;
    public final g Q0;
    public v R;

    /* renamed from: b0  reason: collision with root package name */
    public w f1007b0;

    /* renamed from: c0  reason: collision with root package name */
    public final Drawable f1008c0;

    /* renamed from: d0  reason: collision with root package name */
    public final CharSequence f1009d0;

    /* renamed from: e0  reason: collision with root package name */
    public v f1010e0;

    /* renamed from: f0  reason: collision with root package name */
    public View f1011f0;

    /* renamed from: g0  reason: collision with root package name */
    public Context f1012g0;

    /* renamed from: h0  reason: collision with root package name */
    public int f1013h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f1014i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f1015j0;

    /* renamed from: k0  reason: collision with root package name */
    public final int f1016k0;

    /* renamed from: l0  reason: collision with root package name */
    public final int f1017l0;

    /* renamed from: m0  reason: collision with root package name */
    public int f1018m0;

    /* renamed from: n0  reason: collision with root package name */
    public int f1019n0;

    /* renamed from: o0  reason: collision with root package name */
    public int f1020o0;
    public int p0;

    /* renamed from: q0  reason: collision with root package name */
    public m2 f1021q0;

    /* renamed from: r0  reason: collision with root package name */
    public int f1022r0;

    /* renamed from: s0  reason: collision with root package name */
    public int f1023s0;

    /* renamed from: t0  reason: collision with root package name */
    public final int f1024t0;

    /* renamed from: u0  reason: collision with root package name */
    public CharSequence f1025u0;

    /* renamed from: v0  reason: collision with root package name */
    public CharSequence f1026v0;

    /* renamed from: w0  reason: collision with root package name */
    public ColorStateList f1027w0;

    /* renamed from: x0  reason: collision with root package name */
    public ColorStateList f1028x0;

    /* renamed from: y0  reason: collision with root package name */
    public boolean f1029y0;

    /* renamed from: z0  reason: collision with root package name */
    public boolean f1030z0;

    public Toolbar(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.f1024t0 = 8388627;
        this.A0 = new ArrayList();
        this.B0 = new ArrayList();
        this.C0 = new int[2];
        this.D0 = new n(new e3(this, 1));
        this.E0 = new ArrayList();
        this.G0 = new f3(this);
        this.Q0 = new g(14, this);
        Context context2 = getContext();
        int[] iArr = k.a.f7934y;
        c1 o5 = c1.o(context2, attributeSet, iArr, R.attr.toolbarStyle);
        x0.n(this, context, iArr, attributeSet, (TypedArray) o5.B, R.attr.toolbarStyle);
        TypedArray typedArray = (TypedArray) o5.B;
        this.f1014i0 = typedArray.getResourceId(28, 0);
        this.f1015j0 = typedArray.getResourceId(19, 0);
        this.f1024t0 = typedArray.getInteger(0, 8388627);
        this.f1016k0 = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.p0 = dimensionPixelOffset;
        this.f1020o0 = dimensionPixelOffset;
        this.f1019n0 = dimensionPixelOffset;
        this.f1018m0 = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.f1018m0 = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.f1019n0 = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.f1020o0 = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.p0 = dimensionPixelOffset5;
        }
        this.f1017l0 = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        e();
        m2 m2Var = this.f1021q0;
        m2Var.f11963h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            m2Var.f11960e = dimensionPixelSize;
            m2Var.f11956a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            m2Var.f11961f = dimensionPixelSize2;
            m2Var.f11957b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            m2Var.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.f1022r0 = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.f1023s0 = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.f1008c0 = o5.h(4);
        this.f1009d0 = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.f1012g0 = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable h2 = o5.h(16);
        if (h2 != null) {
            setNavigationIcon(h2);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable h10 = o5.h(11);
        if (h10 != null) {
            setLogo(h10);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(o5.e(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(o5.e(20));
        }
        if (typedArray.hasValue(14)) {
            getMenuInflater().inflate(typedArray.getResourceId(14, 0), getMenu());
        }
        o5.p();
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i2 = 0; i2 < menu.size(); i2++) {
            arrayList.add(menu.getItem(i2));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new h(getContext());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [q.i3, android.view.ViewGroup$MarginLayoutParams] */
    public static i3 i() {
        ?? marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.f11912b = 0;
        marginLayoutParams.f11911a = 8388627;
        return marginLayoutParams;
    }

    public static i3 k(ViewGroup.LayoutParams layoutParams) {
        boolean z10 = layoutParams instanceof i3;
        if (z10) {
            i3 i3Var = (i3) layoutParams;
            i3 i3Var2 = new i3(i3Var);
            i3Var2.f11912b = 0;
            i3Var2.f11912b = i3Var.f11912b;
            return i3Var2;
        } else if (z10) {
            i3 i3Var3 = new i3((i3) layoutParams);
            i3Var3.f11912b = 0;
            return i3Var3;
        } else if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            i3 i3Var4 = new i3(marginLayoutParams);
            i3Var4.f11912b = 0;
            ((ViewGroup.MarginLayoutParams) i3Var4).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) i3Var4).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) i3Var4).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) i3Var4).bottomMargin = marginLayoutParams.bottomMargin;
            return i3Var4;
        } else {
            i3 i3Var5 = new i3(layoutParams);
            i3Var5.f11912b = 0;
            return i3Var5;
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

    public final void a(int i2, ArrayList arrayList) {
        boolean z10;
        if (getLayoutDirection() == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i2, getLayoutDirection());
        arrayList.clear();
        if (z10) {
            for (int i10 = childCount - 1; i10 >= 0; i10--) {
                View childAt = getChildAt(i10);
                i3 i3Var = (i3) childAt.getLayoutParams();
                if (i3Var.f11912b == 0 && v(childAt)) {
                    int i11 = i3Var.f11911a;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i11, layoutDirection) & 7;
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
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt2 = getChildAt(i12);
            i3 i3Var2 = (i3) childAt2.getLayoutParams();
            if (i3Var2.f11912b == 0 && v(childAt2)) {
                int i13 = i3Var2.f11911a;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i13, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    public final void b(View view, boolean z10) {
        i3 i3Var;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            i3Var = i();
        } else if (!checkLayoutParams(layoutParams)) {
            i3Var = k(layoutParams);
        } else {
            i3Var = (i3) layoutParams;
        }
        i3Var.f11912b = 1;
        if (z10 && this.f1011f0 != null) {
            view.setLayoutParams(i3Var);
            this.B0.add(view);
            return;
        }
        addView(view, i3Var);
    }

    @Override // a6.p
    public final void c(y0 y0Var) {
        n nVar = this.D0;
        ((CopyOnWriteArrayList) nVar.L).add(y0Var);
        ((Runnable) nVar.B).run();
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (super.checkLayoutParams(layoutParams) && (layoutParams instanceof i3)) {
            return true;
        }
        return false;
    }

    public final void d() {
        if (this.f1010e0 == null) {
            v vVar = new v(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.f1010e0 = vVar;
            vVar.setImageDrawable(this.f1008c0);
            this.f1010e0.setContentDescription(this.f1009d0);
            i3 i2 = i();
            i2.f11911a = (this.f1016k0 & 112) | 8388611;
            i2.f11912b = 2;
            this.f1010e0.setLayoutParams(i2);
            this.f1010e0.setOnClickListener(new com.google.android.material.datepicker.l(3, this));
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [q.m2, java.lang.Object] */
    public final void e() {
        if (this.f1021q0 == null) {
            ?? obj = new Object();
            obj.f11956a = 0;
            obj.f11957b = 0;
            obj.f11958c = Integer.MIN_VALUE;
            obj.f11959d = Integer.MIN_VALUE;
            obj.f11960e = 0;
            obj.f11961f = 0;
            obj.f11962g = false;
            obj.f11963h = false;
            this.f1021q0 = obj;
        }
    }

    public final void f() {
        g();
        ActionMenuView actionMenuView = this.A;
        if (actionMenuView.f948m0 == null) {
            p.l lVar = (p.l) actionMenuView.getMenu();
            if (this.J0 == null) {
                this.J0 = new h3(this);
            }
            this.A.setExpandedActionViewsExclusive(true);
            lVar.b(this.J0, this.f1012g0);
            x();
        }
    }

    public final void g() {
        if (this.A == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.A = actionMenuView;
            actionMenuView.setPopupTheme(this.f1013h0);
            this.A.setOnMenuItemClickListener(this.G0);
            ActionMenuView actionMenuView2 = this.A;
            l lVar = this.K0;
            f3 f3Var = new f3(this);
            actionMenuView2.f952r0 = lVar;
            actionMenuView2.f953s0 = f3Var;
            i3 i2 = i();
            i2.f11911a = (this.f1016k0 & 112) | 8388613;
            this.A.setLayoutParams(i2);
            b(this.A, false);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return i();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [q.i3, android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams] */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        ?? marginLayoutParams = new ViewGroup.MarginLayoutParams(context, attributeSet);
        marginLayoutParams.f11911a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.a.f7912b);
        marginLayoutParams.f11911a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        marginLayoutParams.f11912b = 0;
        return marginLayoutParams;
    }

    public CharSequence getCollapseContentDescription() {
        v vVar = this.f1010e0;
        if (vVar != null) {
            return vVar.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        v vVar = this.f1010e0;
        if (vVar != null) {
            return vVar.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        m2 m2Var = this.f1021q0;
        if (m2Var != null) {
            if (m2Var.f11962g) {
                return m2Var.f11956a;
            }
            return m2Var.f11957b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i2 = this.f1023s0;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        return getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        m2 m2Var = this.f1021q0;
        if (m2Var != null) {
            return m2Var.f11956a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        m2 m2Var = this.f1021q0;
        if (m2Var != null) {
            return m2Var.f11957b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        m2 m2Var = this.f1021q0;
        if (m2Var != null) {
            if (m2Var.f11962g) {
                return m2Var.f11957b;
            }
            return m2Var.f11956a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i2 = this.f1022r0;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        return getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        p.l lVar;
        ActionMenuView actionMenuView = this.A;
        if (actionMenuView != null && (lVar = actionMenuView.f948m0) != null && lVar.hasVisibleItems()) {
            return Math.max(getContentInsetEnd(), Math.max(this.f1023s0, 0));
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
            return Math.max(getContentInsetStart(), Math.max(this.f1022r0, 0));
        }
        return getContentInsetStart();
    }

    public Drawable getLogo() {
        w wVar = this.f1007b0;
        if (wVar != null) {
            return wVar.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        w wVar = this.f1007b0;
        if (wVar != null) {
            return wVar.getContentDescription();
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
        v vVar = this.R;
        if (vVar != null) {
            return vVar.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        v vVar = this.R;
        if (vVar != null) {
            return vVar.getDrawable();
        }
        return null;
    }

    public j getOuterActionMenuPresenter() {
        return this.I0;
    }

    public Drawable getOverflowIcon() {
        f();
        return this.A.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f1012g0;
    }

    public int getPopupTheme() {
        return this.f1013h0;
    }

    public CharSequence getSubtitle() {
        return this.f1026v0;
    }

    public final TextView getSubtitleTextView() {
        return this.L;
    }

    public CharSequence getTitle() {
        return this.f1025u0;
    }

    public int getTitleMarginBottom() {
        return this.p0;
    }

    public int getTitleMarginEnd() {
        return this.f1019n0;
    }

    public int getTitleMarginStart() {
        return this.f1018m0;
    }

    public int getTitleMarginTop() {
        return this.f1020o0;
    }

    public final TextView getTitleTextView() {
        return this.B;
    }

    public h1 getWrapper() {
        if (this.H0 == null) {
            this.H0 = new m3(this, true);
        }
        return this.H0;
    }

    public final void h() {
        if (this.R == null) {
            this.R = new v(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            i3 i2 = i();
            i2.f11911a = (this.f1016k0 & 112) | 8388611;
            this.R.setLayoutParams(i2);
        }
    }

    @Override // a6.p
    public final void j(y0 y0Var) {
        n nVar = this.D0;
        ((CopyOnWriteArrayList) nVar.L).remove(y0Var);
        if (((HashMap) nVar.R).remove(y0Var) == null) {
            ((Runnable) nVar.B).run();
        } else {
            o.b();
        }
    }

    public final int l(View view, int i2) {
        int i10;
        i3 i3Var = (i3) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        if (i2 > 0) {
            i10 = (measuredHeight - i2) / 2;
        } else {
            i10 = 0;
        }
        int i11 = i3Var.f11911a & 112;
        if (i11 != 16 && i11 != 48 && i11 != 80) {
            i11 = this.f1024t0 & 112;
        }
        if (i11 != 48) {
            if (i11 != 80) {
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int height = getHeight();
                int i12 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
                int i13 = ((ViewGroup.MarginLayoutParams) i3Var).topMargin;
                if (i12 < i13) {
                    i12 = i13;
                } else {
                    int i14 = (((height - paddingBottom) - measuredHeight) - i12) - paddingTop;
                    int i15 = ((ViewGroup.MarginLayoutParams) i3Var).bottomMargin;
                    if (i14 < i15) {
                        i12 = Math.max(0, i12 - (i15 - i14));
                    }
                }
                return paddingTop + i12;
            }
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) i3Var).bottomMargin) - i10;
        }
        return getPaddingTop() - i10;
    }

    public final void o() {
        ArrayList arrayList = this.E0;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            getMenu().removeItem(((MenuItem) obj).getItemId());
        }
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        MenuInflater menuInflater = getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.D0.L).iterator();
        while (it.hasNext()) {
            ((y0) it.next()).f1440a.k(menu, menuInflater);
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.E0 = currentMenuItems2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        x();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.Q0);
        x();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1030z0 = false;
        }
        if (!this.f1030z0) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f1030z0 = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f1030z0 = false;
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
    public final void onMeasure(int i2, int i10) {
        char c4;
        Object[] objArr;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z10 = u3.f12027a;
        int i18 = 0;
        if (getLayoutDirection() == 1) {
            objArr = 1;
            c4 = 0;
        } else {
            c4 = 1;
            objArr = null;
        }
        if (v(this.R)) {
            u(this.R, i2, 0, i10, this.f1017l0);
            i11 = m(this.R) + this.R.getMeasuredWidth();
            i12 = Math.max(0, n(this.R) + this.R.getMeasuredHeight());
            i13 = View.combineMeasuredStates(0, this.R.getMeasuredState());
        } else {
            i11 = 0;
            i12 = 0;
            i13 = 0;
        }
        if (v(this.f1010e0)) {
            u(this.f1010e0, i2, 0, i10, this.f1017l0);
            i11 = m(this.f1010e0) + this.f1010e0.getMeasuredWidth();
            i12 = Math.max(i12, n(this.f1010e0) + this.f1010e0.getMeasuredHeight());
            i13 = View.combineMeasuredStates(i13, this.f1010e0.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i11);
        int max2 = Math.max(0, currentContentInsetStart - i11);
        Object[] objArr2 = objArr;
        int[] iArr = this.C0;
        iArr[objArr2 == 1 ? 1 : 0] = max2;
        if (v(this.A)) {
            u(this.A, i2, max, i10, this.f1017l0);
            i14 = m(this.A) + this.A.getMeasuredWidth();
            i12 = Math.max(i12, n(this.A) + this.A.getMeasuredHeight());
            i13 = View.combineMeasuredStates(i13, this.A.getMeasuredState());
        } else {
            i14 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max3 = max + Math.max(currentContentInsetEnd, i14);
        iArr[c4] = Math.max(0, currentContentInsetEnd - i14);
        if (v(this.f1011f0)) {
            max3 += t(this.f1011f0, i2, max3, i10, 0, iArr);
            i12 = Math.max(i12, n(this.f1011f0) + this.f1011f0.getMeasuredHeight());
            i13 = View.combineMeasuredStates(i13, this.f1011f0.getMeasuredState());
        }
        if (v(this.f1007b0)) {
            max3 += t(this.f1007b0, i2, max3, i10, 0, iArr);
            i12 = Math.max(i12, n(this.f1007b0) + this.f1007b0.getMeasuredHeight());
            i13 = View.combineMeasuredStates(i13, this.f1007b0.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt = getChildAt(i19);
            if (((i3) childAt.getLayoutParams()).f11912b == 0 && v(childAt)) {
                max3 += t(childAt, i2, max3, i10, 0, iArr);
                int max4 = Math.max(i12, n(childAt) + childAt.getMeasuredHeight());
                i13 = View.combineMeasuredStates(i13, childAt.getMeasuredState());
                i12 = max4;
            } else {
                max3 = max3;
            }
        }
        int i20 = max3;
        int i21 = this.f1020o0 + this.p0;
        int i22 = this.f1018m0 + this.f1019n0;
        if (v(this.B)) {
            t(this.B, i2, i20 + i22, i10, i21, iArr);
            int m = m(this.B) + this.B.getMeasuredWidth();
            i15 = n(this.B) + this.B.getMeasuredHeight();
            i16 = View.combineMeasuredStates(i13, this.B.getMeasuredState());
            i17 = m;
        } else {
            i15 = 0;
            i16 = i13;
            i17 = 0;
        }
        if (v(this.L)) {
            i17 = Math.max(i17, t(this.L, i2, i20 + i22, i10, i21 + i15, iArr));
            i15 += n(this.L) + this.L.getMeasuredHeight();
            i16 = View.combineMeasuredStates(i16, this.L.getMeasuredState());
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop() + Math.max(i12, i15);
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + i20 + i17, getSuggestedMinimumWidth()), i2, (-16777216) & i16);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i10, i16 << 16);
        if (this.M0) {
            int childCount2 = getChildCount();
            for (int i23 = 0; i23 < childCount2; i23++) {
                View childAt2 = getChildAt(i23);
                if (!v(childAt2) || childAt2.getMeasuredWidth() <= 0 || childAt2.getMeasuredHeight() <= 0) {
                }
            }
            setMeasuredDimension(resolveSizeAndState, i18);
        }
        i18 = resolveSizeAndState2;
        setMeasuredDimension(resolveSizeAndState, i18);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        p.l lVar;
        MenuItem findItem;
        if (!(parcelable instanceof k3)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        k3 k3Var = (k3) parcelable;
        super.onRestoreInstanceState(k3Var.A);
        ActionMenuView actionMenuView = this.A;
        if (actionMenuView != null) {
            lVar = actionMenuView.f948m0;
        } else {
            lVar = null;
        }
        int i2 = k3Var.L;
        if (i2 != 0 && this.J0 != null && lVar != null && (findItem = lVar.findItem(i2)) != null) {
            findItem.expandActionView();
        }
        if (k3Var.R) {
            g gVar = this.Q0;
            removeCallbacks(gVar);
            post(gVar);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i2) {
        super.onRtlPropertiesChanged(i2);
        e();
        m2 m2Var = this.f1021q0;
        boolean z10 = true;
        if (i2 != 1) {
            z10 = false;
        }
        if (z10 == m2Var.f11962g) {
            return;
        }
        m2Var.f11962g = z10;
        if (m2Var.f11963h) {
            if (z10) {
                int i10 = m2Var.f11959d;
                if (i10 == Integer.MIN_VALUE) {
                    i10 = m2Var.f11960e;
                }
                m2Var.f11956a = i10;
                int i11 = m2Var.f11958c;
                if (i11 == Integer.MIN_VALUE) {
                    i11 = m2Var.f11961f;
                }
                m2Var.f11957b = i11;
                return;
            }
            int i12 = m2Var.f11958c;
            if (i12 == Integer.MIN_VALUE) {
                i12 = m2Var.f11960e;
            }
            m2Var.f11956a = i12;
            int i13 = m2Var.f11959d;
            if (i13 == Integer.MIN_VALUE) {
                i13 = m2Var.f11961f;
            }
            m2Var.f11957b = i13;
            return;
        }
        m2Var.f11956a = m2Var.f11960e;
        m2Var.f11957b = m2Var.f11961f;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [i6.b, q.k3, android.os.Parcelable] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        p.n nVar;
        ?? bVar = new i6.b(super.onSaveInstanceState());
        h3 h3Var = this.J0;
        if (h3Var != null && (nVar = h3Var.B) != null) {
            bVar.L = nVar.f11133a;
        }
        bVar.R = q();
        return bVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1029y0 = false;
        }
        if (!this.f1029y0) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1029y0 = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f1029y0 = false;
        return true;
    }

    public final boolean p(View view) {
        if (view.getParent() != this && !this.B0.contains(view)) {
            return false;
        }
        return true;
    }

    public final boolean q() {
        j jVar;
        ActionMenuView actionMenuView = this.A;
        if (actionMenuView != null && (jVar = actionMenuView.f951q0) != null && jVar.e()) {
            return true;
        }
        return false;
    }

    public final int r(View view, int i2, int i10, int[] iArr) {
        i3 i3Var = (i3) view.getLayoutParams();
        int i11 = ((ViewGroup.MarginLayoutParams) i3Var).leftMargin - iArr[0];
        int max = Math.max(0, i11) + i2;
        iArr[0] = Math.max(0, -i11);
        int l10 = l(view, i10);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, l10, max + measuredWidth, view.getMeasuredHeight() + l10);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) i3Var).rightMargin + max;
    }

    public final int s(View view, int i2, int i10, int[] iArr) {
        i3 i3Var = (i3) view.getLayoutParams();
        int i11 = ((ViewGroup.MarginLayoutParams) i3Var).rightMargin - iArr[1];
        int max = i2 - Math.max(0, i11);
        iArr[1] = Math.max(0, -i11);
        int l10 = l(view, i10);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, l10, max, view.getMeasuredHeight() + l10);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) i3Var).leftMargin);
    }

    public void setBackInvokedCallbackEnabled(boolean z10) {
        if (this.P0 != z10) {
            this.P0 = z10;
            x();
        }
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            d();
        }
        v vVar = this.f1010e0;
        if (vVar != null) {
            vVar.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            d();
            this.f1010e0.setImageDrawable(drawable);
            return;
        }
        v vVar = this.f1010e0;
        if (vVar != null) {
            vVar.setImageDrawable(this.f1008c0);
        }
    }

    public void setCollapsible(boolean z10) {
        this.M0 = z10;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i2) {
        if (i2 < 0) {
            i2 = Integer.MIN_VALUE;
        }
        if (i2 != this.f1023s0) {
            this.f1023s0 = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i2) {
        if (i2 < 0) {
            i2 = Integer.MIN_VALUE;
        }
        if (i2 != this.f1022r0) {
            this.f1022r0 = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(Drawable drawable) {
        w wVar = this.f1007b0;
        if (drawable != null) {
            if (wVar == null) {
                this.f1007b0 = new w(getContext(), null, 0);
            }
            if (!p(this.f1007b0)) {
                b(this.f1007b0, true);
            }
        } else if (wVar != null && p(wVar)) {
            removeView(this.f1007b0);
            this.B0.remove(this.f1007b0);
        }
        w wVar2 = this.f1007b0;
        if (wVar2 != null) {
            wVar2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f1007b0 == null) {
            this.f1007b0 = new w(getContext(), null, 0);
        }
        w wVar = this.f1007b0;
        if (wVar != null) {
            wVar.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            h();
        }
        v vVar = this.R;
        if (vVar != null) {
            vVar.setContentDescription(charSequence);
            t.E(this.R, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            h();
            if (!p(this.R)) {
                b(this.R, true);
            }
        } else {
            v vVar = this.R;
            if (vVar != null && p(vVar)) {
                removeView(this.R);
                this.B0.remove(this.R);
            }
        }
        v vVar2 = this.R;
        if (vVar2 != null) {
            vVar2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        h();
        this.R.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(j3 j3Var) {
        this.F0 = j3Var;
    }

    public void setOverflowIcon(Drawable drawable) {
        f();
        this.A.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i2) {
        if (this.f1013h0 != i2) {
            this.f1013h0 = i2;
            if (i2 == 0) {
                this.f1012g0 = getContext();
            } else {
                this.f1012g0 = new ContextThemeWrapper(getContext(), i2);
            }
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        z0 z0Var = this.L;
        if (!isEmpty) {
            if (z0Var == null) {
                Context context = getContext();
                z0 z0Var2 = new z0(context, null);
                this.L = z0Var2;
                z0Var2.setSingleLine();
                this.L.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.f1015j0;
                if (i2 != 0) {
                    this.L.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.f1028x0;
                if (colorStateList != null) {
                    this.L.setTextColor(colorStateList);
                }
            }
            if (!p(this.L)) {
                b(this.L, true);
            }
        } else if (z0Var != null && p(z0Var)) {
            removeView(this.L);
            this.B0.remove(this.L);
        }
        z0 z0Var3 = this.L;
        if (z0Var3 != null) {
            z0Var3.setText(charSequence);
        }
        this.f1026v0 = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f1028x0 = colorStateList;
        z0 z0Var = this.L;
        if (z0Var != null) {
            z0Var.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        z0 z0Var = this.B;
        if (!isEmpty) {
            if (z0Var == null) {
                Context context = getContext();
                z0 z0Var2 = new z0(context, null);
                this.B = z0Var2;
                z0Var2.setSingleLine();
                this.B.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.f1014i0;
                if (i2 != 0) {
                    this.B.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.f1027w0;
                if (colorStateList != null) {
                    this.B.setTextColor(colorStateList);
                }
            }
            if (!p(this.B)) {
                b(this.B, true);
            }
        } else if (z0Var != null && p(z0Var)) {
            removeView(this.B);
            this.B0.remove(this.B);
        }
        z0 z0Var3 = this.B;
        if (z0Var3 != null) {
            z0Var3.setText(charSequence);
        }
        this.f1025u0 = charSequence;
    }

    public void setTitleMarginBottom(int i2) {
        this.p0 = i2;
        requestLayout();
    }

    public void setTitleMarginEnd(int i2) {
        this.f1019n0 = i2;
        requestLayout();
    }

    public void setTitleMarginStart(int i2) {
        this.f1018m0 = i2;
        requestLayout();
    }

    public void setTitleMarginTop(int i2) {
        this.f1020o0 = i2;
        requestLayout();
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f1027w0 = colorStateList;
        z0 z0Var = this.B;
        if (z0Var != null) {
            z0Var.setTextColor(colorStateList);
        }
    }

    public final int t(View view, int i2, int i10, int i11, int i12, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i13 = marginLayoutParams.leftMargin - iArr[0];
        int i14 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i14) + Math.max(0, i13);
        iArr[0] = Math.max(0, -i13);
        iArr[1] = Math.max(0, -i14);
        view.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + max + i10, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i11, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i12, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public final void u(View view, int i2, int i10, int i11, int i12) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i10, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i11, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i12 >= 0) {
            if (mode != 0) {
                i12 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i12);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
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
        j jVar;
        ActionMenuView actionMenuView = this.A;
        if (actionMenuView != null && (jVar = actionMenuView.f951q0) != null && jVar.l()) {
            return true;
        }
        return false;
    }

    public final void x() {
        boolean z10;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher a10 = g3.a(this);
            h3 h3Var = this.J0;
            if (h3Var != null && h3Var.B != null && a10 != null && isAttachedToWindow() && this.P0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && this.O0 == null) {
                if (this.N0 == null) {
                    this.N0 = g3.b(new e3(this, 0));
                }
                g3.c(a10, this.N0);
                this.O0 = a10;
            } else if (!z10 && (onBackInvokedDispatcher = this.O0) != null) {
                g3.d(onBackInvokedDispatcher, this.N0);
                this.O0 = null;
            }
        }
    }

    public void setSubtitleTextColor(int i2) {
        setSubtitleTextColor(ColorStateList.valueOf(i2));
    }

    public void setTitleTextColor(int i2) {
        setTitleTextColor(ColorStateList.valueOf(i2));
    }

    public void setCollapseContentDescription(int i2) {
        setCollapseContentDescription(i2 != 0 ? getContext().getText(i2) : null);
    }

    public void setCollapseIcon(int i2) {
        setCollapseIcon(k7.w.p(getContext(), i2));
    }

    public void setNavigationContentDescription(int i2) {
        setNavigationContentDescription(i2 != 0 ? getContext().getText(i2) : null);
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }

    public void setLogoDescription(int i2) {
        setLogoDescription(getContext().getText(i2));
    }

    public void setNavigationIcon(int i2) {
        setNavigationIcon(k7.w.p(getContext(), i2));
    }

    public void setLogo(int i2) {
        setLogo(k7.w.p(getContext(), i2));
    }

    public void setSubtitle(int i2) {
        setSubtitle(getContext().getText(i2));
    }

    public void setTitle(int i2) {
        setTitle(getContext().getText(i2));
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
