package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import com.stormds.emulator.R;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements ke4, le4 {
    public static final int[] B0 = {R.attr.actionBarSize, 16842841};
    public static final vu7 C0;
    public static final Rect D0;
    public int A;
    public final w7 A0;
    public int B;
    public ContentFrameLayout L;
    public ActionBarContainer R;
    public tc1 d0;
    public Drawable e0;
    public boolean f0;
    public boolean g0;
    public boolean h0;
    public boolean i0;
    public int j0;
    public int k0;
    public final Rect l0;
    public final Rect m0;
    public final Rect n0;
    public final Rect o0;
    public vu7 p0;
    public vu7 q0;
    public vu7 r0;
    public vu7 s0;
    public u7 t0;
    public OverScroller u0;
    public ViewPropertyAnimator v0;
    public final s7 w0;
    public final t7 x0;
    public final t7 y0;
    public final dy7 z0;

    static {
        iu7 bu7Var;
        int i = Build.VERSION.SDK_INT;
        if (i >= 36) {
            bu7Var = new hu7();
        } else if (i >= 35) {
            bu7Var = new gu7();
        } else if (i >= 34) {
            bu7Var = new fu7();
        } else if (i >= 31) {
            bu7Var = new eu7();
        } else if (i >= 30) {
            bu7Var = new du7();
        } else if (i >= 29) {
            bu7Var = new cu7();
        } else {
            bu7Var = new bu7();
        }
        bu7Var.h(e83.c(0, 1, 0, 1));
        C0 = bu7Var.b();
        D0 = new Rect();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v14, types: [dy7, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v15, types: [w7, android.view.View] */
    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.B = 0;
        this.l0 = new Rect();
        this.m0 = new Rect();
        this.n0 = new Rect();
        this.o0 = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        vu7 vu7Var = vu7.b;
        this.p0 = vu7Var;
        this.q0 = vu7Var;
        this.r0 = vu7Var;
        this.s0 = vu7Var;
        this.w0 = new s7(this, 0);
        this.x0 = new t7(this, 0);
        this.y0 = new t7(this, 1);
        i(context);
        this.z0 = new Object();
        ?? view = new View(context);
        view.setWillNotDraw(true);
        this.A0 = view;
        addView(view);
    }

    public static boolean g(View view, Rect rect, boolean z) {
        boolean z2;
        v7 v7Var = (v7) view.getLayoutParams();
        int i = ((ViewGroup.MarginLayoutParams) v7Var).leftMargin;
        int i2 = rect.left;
        if (i != i2) {
            ((ViewGroup.MarginLayoutParams) v7Var).leftMargin = i2;
            z2 = true;
        } else {
            z2 = false;
        }
        int i3 = ((ViewGroup.MarginLayoutParams) v7Var).topMargin;
        int i4 = rect.top;
        if (i3 != i4) {
            ((ViewGroup.MarginLayoutParams) v7Var).topMargin = i4;
            z2 = true;
        }
        int i5 = ((ViewGroup.MarginLayoutParams) v7Var).rightMargin;
        int i6 = rect.right;
        if (i5 != i6) {
            ((ViewGroup.MarginLayoutParams) v7Var).rightMargin = i6;
            z2 = true;
        }
        if (z) {
            int i7 = ((ViewGroup.MarginLayoutParams) v7Var).bottomMargin;
            int i8 = rect.bottom;
            if (i7 != i8) {
                ((ViewGroup.MarginLayoutParams) v7Var).bottomMargin = i8;
                return true;
            }
        }
        return z2;
    }

    @Override // defpackage.le4
    public final void a(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        b(view, i, i2, i3, i4, i5);
    }

    @Override // defpackage.ke4
    public final void b(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // defpackage.ke4
    public final boolean c(View view, View view2, int i, int i2) {
        if (i2 == 0 && onStartNestedScroll(view, view2, i)) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof v7;
    }

    @Override // defpackage.ke4
    public final void d(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.e0 != null) {
            if (this.R.getVisibility() == 0) {
                i = (int) (this.R.getTranslationY() + this.R.getBottom() + 0.5f);
            } else {
                i = 0;
            }
            this.e0.setBounds(0, i, getWidth(), this.e0.getIntrinsicHeight() + i);
            this.e0.draw(canvas);
        }
    }

    @Override // defpackage.ke4
    public final void e(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.R;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        dy7 dy7Var = this.z0;
        return dy7Var.b | dy7Var.a;
    }

    public CharSequence getTitle() {
        k();
        return ((l87) this.d0).a.getTitle();
    }

    public final void h() {
        removeCallbacks(this.x0);
        removeCallbacks(this.y0);
        ViewPropertyAnimator viewPropertyAnimator = this.v0;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void i(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(B0);
        boolean z = false;
        this.A = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.e0 = drawable;
        if (drawable == null) {
            z = true;
        }
        setWillNotDraw(z);
        obtainStyledAttributes.recycle();
        this.u0 = new OverScroller(context);
    }

    public final void j(int i) {
        k();
        if (i != 2) {
            if (i != 5) {
                if (i != 109) {
                    return;
                }
                setOverlayMode(true);
                return;
            }
            ((l87) this.d0).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
            return;
        }
        ((l87) this.d0).getClass();
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    public final void k() {
        tc1 wrapper;
        if (this.L == null) {
            this.L = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.R = (ActionBarContainer) findViewById(R.id.action_bar_container);
            View findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof tc1) {
                wrapper = (tc1) findViewById;
            } else if (findViewById instanceof Toolbar) {
                wrapper = ((Toolbar) findViewById).getWrapper();
            } else {
                i.m("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
                return;
            }
            this.d0 = wrapper;
        }
    }

    public final void l(Menu menu, a54 a54Var) {
        k();
        l87 l87Var = (l87) this.d0;
        Toolbar toolbar = l87Var.a;
        if (l87Var.m == null) {
            l87Var.m = new g8(toolbar.getContext());
        }
        g8 g8Var = l87Var.m;
        g8Var.X = a54Var;
        i44 i44Var = (i44) menu;
        if (i44Var != null || toolbar.A != null) {
            toolbar.f();
            i44 i44Var2 = toolbar.A.o0;
            if (i44Var2 == i44Var) {
                return;
            }
            if (i44Var2 != null) {
                i44Var2.r(toolbar.K0);
                i44Var2.r(toolbar.L0);
            }
            if (toolbar.L0 == null) {
                toolbar.L0 = new d87(toolbar);
            }
            g8Var.m0 = true;
            Context context = toolbar.i0;
            if (i44Var != null) {
                i44Var.b(g8Var, context);
                i44Var.b(toolbar.L0, toolbar.i0);
            } else {
                g8Var.k(context, null);
                toolbar.L0.k(toolbar.i0, null);
                g8Var.i();
                toolbar.L0.i();
            }
            toolbar.A.setPopupTheme(toolbar.j0);
            toolbar.A.setPresenter(g8Var);
            toolbar.K0 = g8Var;
            toolbar.x();
        }
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        k();
        vu7 g = vu7.g(this, windowInsets);
        boolean g2 = g(this.R, new Rect(g.b(), g.d(), g.c(), g.a()), false);
        WeakHashMap weakHashMap = ao7.a;
        Rect rect = this.l0;
        sn7.b(this, g, rect);
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        ru7 ru7Var = g.a;
        vu7 q = ru7Var.q(i, i2, i3, i4);
        this.p0 = q;
        boolean z = true;
        if (!this.q0.equals(q)) {
            this.q0 = this.p0;
            g2 = true;
        }
        Rect rect2 = this.m0;
        if (!rect2.equals(rect)) {
            rect2.set(rect);
        } else {
            z = g2;
        }
        if (z) {
            requestLayout();
        }
        return ru7Var.a().a.c().a.b().f();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i(getContext());
        WeakHashMap weakHashMap = ao7.a;
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                v7 v7Var = (v7) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) v7Var).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) v7Var).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0125  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        boolean z;
        int measuredHeight;
        iu7 bu7Var;
        k();
        measureChildWithMargins(this.R, i, 0, i2, 0);
        v7 v7Var = (v7) this.R.getLayoutParams();
        int max = Math.max(0, this.R.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) v7Var).leftMargin + ((ViewGroup.MarginLayoutParams) v7Var).rightMargin);
        int max2 = Math.max(0, this.R.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v7Var).topMargin + ((ViewGroup.MarginLayoutParams) v7Var).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.R.getMeasuredState());
        WeakHashMap weakHashMap = ao7.a;
        if ((getWindowSystemUiVisibility() & 256) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            measuredHeight = this.A;
            if (this.g0 && this.R.getTabContainer() != null) {
                measuredHeight += this.A;
            }
        } else {
            measuredHeight = this.R.getVisibility() != 8 ? this.R.getMeasuredHeight() : 0;
        }
        Rect rect = this.l0;
        Rect rect2 = this.n0;
        rect2.set(rect);
        this.r0 = this.p0;
        if (!this.f0 && !z) {
            w7 w7Var = this.A0;
            vu7 vu7Var = C0;
            Rect rect3 = this.o0;
            sn7.b(w7Var, vu7Var, rect3);
            if (!rect3.equals(D0)) {
                rect2.top += measuredHeight;
                rect2.bottom = rect2.bottom;
                this.r0 = this.r0.a.q(0, measuredHeight, 0, 0);
                g(this.L, rect2, true);
                if (!this.s0.equals(this.r0)) {
                    vu7 vu7Var2 = this.r0;
                    this.s0 = vu7Var2;
                    ao7.c(this.L, vu7Var2);
                }
                measureChildWithMargins(this.L, i, 0, i2, 0);
                v7 v7Var2 = (v7) this.L.getLayoutParams();
                int max3 = Math.max(max, this.L.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) v7Var2).leftMargin + ((ViewGroup.MarginLayoutParams) v7Var2).rightMargin);
                int max4 = Math.max(max2, this.L.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v7Var2).topMargin + ((ViewGroup.MarginLayoutParams) v7Var2).bottomMargin);
                int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.L.getMeasuredState());
                setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
            }
        }
        e83 c = e83.c(this.r0.b(), this.r0.d() + measuredHeight, this.r0.c(), this.r0.a());
        vu7 vu7Var3 = this.r0;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 36) {
            bu7Var = new hu7(vu7Var3);
        } else if (i3 >= 35) {
            bu7Var = new gu7(vu7Var3);
        } else if (i3 >= 34) {
            bu7Var = new fu7(vu7Var3);
        } else if (i3 >= 31) {
            bu7Var = new eu7(vu7Var3);
        } else if (i3 >= 30) {
            bu7Var = new du7(vu7Var3);
        } else if (i3 >= 29) {
            bu7Var = new cu7(vu7Var3);
        } else {
            bu7Var = new bu7(vu7Var3);
        }
        bu7Var.h(c);
        this.r0 = bu7Var.b();
        g(this.L, rect2, true);
        if (!this.s0.equals(this.r0)) {
        }
        measureChildWithMargins(this.L, i, 0, i2, 0);
        v7 v7Var22 = (v7) this.L.getLayoutParams();
        int max32 = Math.max(max, this.L.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) v7Var22).leftMargin + ((ViewGroup.MarginLayoutParams) v7Var22).rightMargin);
        int max42 = Math.max(max2, this.L.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v7Var22).topMargin + ((ViewGroup.MarginLayoutParams) v7Var22).bottomMargin);
        int combineMeasuredStates22 = View.combineMeasuredStates(combineMeasuredStates, this.L.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max32, getSuggestedMinimumWidth()), i, combineMeasuredStates22), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max42, getSuggestedMinimumHeight()), i2, combineMeasuredStates22 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (this.h0 && z) {
            this.u0.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
            if (this.u0.getFinalY() > this.R.getHeight()) {
                h();
                this.y0.run();
            } else {
                h();
                this.x0.run();
            }
            this.i0 = true;
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.j0 + i2;
        this.j0 = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        nt7 nt7Var;
        jp7 jp7Var;
        this.z0.a = i;
        this.j0 = getActionBarHideOffset();
        h();
        u7 u7Var = this.t0;
        if (u7Var != null && (jp7Var = (nt7Var = (nt7) u7Var).E) != null) {
            jp7Var.a();
            nt7Var.E = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) != 0 && this.R.getVisibility() == 0) {
            return this.h0;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (this.h0 && !this.i0) {
            if (this.j0 <= this.R.getHeight()) {
                h();
                postDelayed(this.x0, 600L);
                return;
            }
            h();
            postDelayed(this.y0, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i) {
        boolean z;
        boolean z2;
        super.onWindowSystemUiVisibilityChanged(i);
        k();
        int i2 = this.k0 ^ i;
        this.k0 = i;
        if ((i & 4) == 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 256) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        u7 u7Var = this.t0;
        if (u7Var != null) {
            nt7 nt7Var = (nt7) u7Var;
            nt7Var.z = !z2;
            if (!z && z2) {
                if (!nt7Var.B) {
                    nt7Var.B = true;
                    nt7Var.O0(true);
                }
            } else if (nt7Var.B) {
                nt7Var.B = false;
                nt7Var.O0(true);
            }
        }
        if ((i2 & 256) != 0 && this.t0 != null) {
            WeakHashMap weakHashMap = ao7.a;
            requestApplyInsets();
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.B = i;
        u7 u7Var = this.t0;
        if (u7Var != null) {
            ((nt7) u7Var).y = i;
        }
    }

    public void setActionBarHideOffset(int i) {
        h();
        this.R.setTranslationY(-Math.max(0, Math.min(i, this.R.getHeight())));
    }

    public void setActionBarVisibilityCallback(u7 u7Var) {
        this.t0 = u7Var;
        if (getWindowToken() != null) {
            ((nt7) this.t0).y = this.B;
            int i = this.k0;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap weakHashMap = ao7.a;
                requestApplyInsets();
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.g0 = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.h0) {
            this.h0 = z;
            if (!z) {
                h();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i) {
        Drawable drawable;
        k();
        l87 l87Var = (l87) this.d0;
        if (i != 0) {
            drawable = hf.S(l87Var.a.getContext(), i);
        } else {
            drawable = null;
        }
        l87Var.d = drawable;
        l87Var.c();
    }

    public void setLogo(int i) {
        Drawable drawable;
        k();
        l87 l87Var = (l87) this.d0;
        if (i != 0) {
            drawable = hf.S(l87Var.a.getContext(), i);
        } else {
            drawable = null;
        }
        l87Var.e = drawable;
        l87Var.c();
    }

    public void setOverlayMode(boolean z) {
        this.f0 = z;
    }

    public void setWindowCallback(Window.Callback callback) {
        k();
        ((l87) this.d0).k = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        k();
        l87 l87Var = (l87) this.d0;
        if (!l87Var.g) {
            Toolbar toolbar = l87Var.a;
            l87Var.h = charSequence;
            if ((l87Var.b & 8) != 0) {
                toolbar.setTitle(charSequence);
                if (l87Var.g) {
                    ao7.o(toolbar.getRootView(), charSequence);
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    public void setIcon(Drawable drawable) {
        k();
        l87 l87Var = (l87) this.d0;
        l87Var.d = drawable;
        l87Var.c();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // defpackage.ke4
    public final void f(View view, int i, int i2, int[] iArr, int i3) {
    }
}
