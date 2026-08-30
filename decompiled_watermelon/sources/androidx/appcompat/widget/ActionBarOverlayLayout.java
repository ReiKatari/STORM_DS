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
import androidx.preference.Preference;
import java.util.WeakHashMap;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements e64, f64 {
    public static final int[] A0 = {R.attr.actionBarSize, 16842841};
    public static final vf7 B0;
    public static final Rect C0;
    public int A;
    public int B;
    public ContentFrameLayout L;
    public ActionBarContainer R;
    public c91 c0;
    public Drawable d0;
    public boolean e0;
    public boolean f0;
    public boolean g0;
    public boolean h0;
    public int i0;
    public int j0;
    public final Rect k0;
    public final Rect l0;
    public final Rect m0;
    public final Rect n0;
    public vf7 o0;
    public vf7 p0;
    public vf7 q0;
    public vf7 r0;
    public t7 s0;
    public OverScroller t0;
    public ViewPropertyAnimator u0;
    public final r7 v0;
    public final s7 w0;
    public final s7 x0;
    public final hj7 y0;
    public final v7 z0;

    static {
        if7 af7Var;
        int i = Build.VERSION.SDK_INT;
        if (i >= 36) {
            af7Var = new hf7();
        } else if (i >= 35) {
            af7Var = new gf7();
        } else if (i >= 34) {
            af7Var = new ff7();
        } else if (i >= 31) {
            af7Var = new ef7();
        } else if (i >= 30) {
            af7Var = new df7();
        } else if (i >= 29) {
            af7Var = new cf7();
        } else {
            af7Var = new af7();
        }
        af7Var.h(x13.c(0, 1, 0, 1));
        B0 = af7Var.b();
        C0 = new Rect();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v14, types: [hj7, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v15, types: [v7, android.view.View] */
    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.B = 0;
        this.k0 = new Rect();
        this.l0 = new Rect();
        this.m0 = new Rect();
        this.n0 = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        vf7 vf7Var = vf7.b;
        this.o0 = vf7Var;
        this.p0 = vf7Var;
        this.q0 = vf7Var;
        this.r0 = vf7Var;
        this.v0 = new r7(0, this);
        this.w0 = new s7(this, 0);
        this.x0 = new s7(this, 1);
        i(context);
        this.y0 = new Object();
        ?? view = new View(context);
        view.setWillNotDraw(true);
        this.z0 = view;
        addView(view);
    }

    public static boolean g(View view, Rect rect, boolean z) {
        boolean z2;
        u7 u7Var = (u7) view.getLayoutParams();
        int i = ((ViewGroup.MarginLayoutParams) u7Var).leftMargin;
        int i2 = rect.left;
        if (i != i2) {
            ((ViewGroup.MarginLayoutParams) u7Var).leftMargin = i2;
            z2 = true;
        } else {
            z2 = false;
        }
        int i3 = ((ViewGroup.MarginLayoutParams) u7Var).topMargin;
        int i4 = rect.top;
        if (i3 != i4) {
            ((ViewGroup.MarginLayoutParams) u7Var).topMargin = i4;
            z2 = true;
        }
        int i5 = ((ViewGroup.MarginLayoutParams) u7Var).rightMargin;
        int i6 = rect.right;
        if (i5 != i6) {
            ((ViewGroup.MarginLayoutParams) u7Var).rightMargin = i6;
            z2 = true;
        }
        if (z) {
            int i7 = ((ViewGroup.MarginLayoutParams) u7Var).bottomMargin;
            int i8 = rect.bottom;
            if (i7 != i8) {
                ((ViewGroup.MarginLayoutParams) u7Var).bottomMargin = i8;
                return true;
            }
        }
        return z2;
    }

    @Override // defpackage.e64
    public final void a(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // defpackage.e64
    public final void b(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof u7;
    }

    @Override // defpackage.f64
    public final void d(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        e(view, i, i2, i3, i4, i5);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.d0 != null) {
            if (this.R.getVisibility() == 0) {
                i = (int) (this.R.getTranslationY() + this.R.getBottom() + 0.5f);
            } else {
                i = 0;
            }
            this.d0.setBounds(0, i, getWidth(), this.d0.getIntrinsicHeight() + i);
            this.d0.draw(canvas);
        }
    }

    @Override // defpackage.e64
    public final void e(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // defpackage.e64
    public final boolean f(View view, View view2, int i, int i2) {
        if (i2 == 0 && onStartNestedScroll(view, view2, i)) {
            return true;
        }
        return false;
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
        hj7 hj7Var = this.y0;
        return hj7Var.b | hj7Var.a;
    }

    public CharSequence getTitle() {
        k();
        return ((yv6) this.c0).a.getTitle();
    }

    public final void h() {
        removeCallbacks(this.w0);
        removeCallbacks(this.x0);
        ViewPropertyAnimator viewPropertyAnimator = this.u0;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void i(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(A0);
        boolean z = false;
        this.A = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.d0 = drawable;
        if (drawable == null) {
            z = true;
        }
        setWillNotDraw(z);
        obtainStyledAttributes.recycle();
        this.t0 = new OverScroller(context);
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
            ((yv6) this.c0).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
            return;
        }
        ((yv6) this.c0).getClass();
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    public final void k() {
        c91 wrapper;
        if (this.L == null) {
            this.L = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.R = (ActionBarContainer) findViewById(R.id.action_bar_container);
            View findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof c91) {
                wrapper = (c91) findViewById;
            } else if (findViewById instanceof Toolbar) {
                wrapper = ((Toolbar) findViewById).getWrapper();
            } else {
                i.n("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
                return;
            }
            this.c0 = wrapper;
        }
    }

    public final void l(Menu menu, lx3 lx3Var) {
        k();
        yv6 yv6Var = (yv6) this.c0;
        Toolbar toolbar = yv6Var.a;
        if (yv6Var.m == null) {
            yv6Var.m = new f8(toolbar.getContext());
        }
        f8 f8Var = yv6Var.m;
        f8Var.X = lx3Var;
        uw3 uw3Var = (uw3) menu;
        if (uw3Var != null || toolbar.A != null) {
            toolbar.g();
            uw3 uw3Var2 = toolbar.A.n0;
            if (uw3Var2 == uw3Var) {
                return;
            }
            if (uw3Var2 != null) {
                uw3Var2.r(toolbar.J0);
                uw3Var2.r(toolbar.K0);
            }
            if (toolbar.K0 == null) {
                toolbar.K0 = new pv6(toolbar);
            }
            f8Var.l0 = true;
            Context context = toolbar.h0;
            if (uw3Var != null) {
                uw3Var.b(f8Var, context);
                uw3Var.b(toolbar.K0, toolbar.h0);
            } else {
                f8Var.i(context, null);
                toolbar.K0.i(toolbar.h0, null);
                f8Var.g();
                toolbar.K0.g();
            }
            toolbar.A.setPopupTheme(toolbar.i0);
            toolbar.A.setPresenter(f8Var);
            toolbar.J0 = f8Var;
            toolbar.x();
        }
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        k();
        vf7 g = vf7.g(this, windowInsets);
        boolean g2 = g(this.R, new Rect(g.b(), g.d(), g.c(), g.a()), false);
        WeakHashMap weakHashMap = aa7.a;
        Rect rect = this.k0;
        s97.b(this, g, rect);
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        rf7 rf7Var = g.a;
        vf7 q = rf7Var.q(i, i2, i3, i4);
        this.o0 = q;
        boolean z = true;
        if (!this.p0.equals(q)) {
            this.p0 = this.o0;
            g2 = true;
        }
        Rect rect2 = this.l0;
        if (!rect2.equals(rect)) {
            rect2.set(rect);
        } else {
            z = g2;
        }
        if (z) {
            requestLayout();
        }
        return rf7Var.a().a.c().a.b().f();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i(getContext());
        WeakHashMap weakHashMap = aa7.a;
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
                u7 u7Var = (u7) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) u7Var).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) u7Var).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0125  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r13, int r14) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (this.g0 && z) {
            this.t0.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Preference.DEFAULT_ORDER);
            if (this.t0.getFinalY() > this.R.getHeight()) {
                h();
                this.x0.run();
            } else {
                h();
                this.w0.run();
            }
            this.h0 = true;
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
        int i5 = this.i0 + i2;
        this.i0 = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        le7 le7Var;
        ib7 ib7Var;
        this.y0.a = i;
        this.i0 = getActionBarHideOffset();
        h();
        t7 t7Var = this.s0;
        if (t7Var != null && (ib7Var = (le7Var = (le7) t7Var).H0) != null) {
            ib7Var.a();
            le7Var.H0 = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) != 0 && this.R.getVisibility() == 0) {
            return this.g0;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (this.g0 && !this.h0) {
            if (this.i0 <= this.R.getHeight()) {
                h();
                postDelayed(this.w0, 600L);
                return;
            }
            h();
            postDelayed(this.x0, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i) {
        boolean z;
        boolean z2;
        super.onWindowSystemUiVisibilityChanged(i);
        k();
        int i2 = this.j0 ^ i;
        this.j0 = i;
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
        t7 t7Var = this.s0;
        if (t7Var != null) {
            le7 le7Var = (le7) t7Var;
            le7Var.C0 = !z2;
            if (!z && z2) {
                if (!le7Var.E0) {
                    le7Var.E0 = true;
                    le7Var.b1(true);
                }
            } else if (le7Var.E0) {
                le7Var.E0 = false;
                le7Var.b1(true);
            }
        }
        if ((i2 & 256) != 0 && this.s0 != null) {
            WeakHashMap weakHashMap = aa7.a;
            requestApplyInsets();
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.B = i;
        t7 t7Var = this.s0;
        if (t7Var != null) {
            ((le7) t7Var).B0 = i;
        }
    }

    public void setActionBarHideOffset(int i) {
        h();
        this.R.setTranslationY(-Math.max(0, Math.min(i, this.R.getHeight())));
    }

    public void setActionBarVisibilityCallback(t7 t7Var) {
        this.s0 = t7Var;
        if (getWindowToken() != null) {
            ((le7) this.s0).B0 = this.B;
            int i = this.j0;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap weakHashMap = aa7.a;
                requestApplyInsets();
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.f0 = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.g0) {
            this.g0 = z;
            if (!z) {
                h();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i) {
        Drawable drawable;
        k();
        yv6 yv6Var = (yv6) this.c0;
        if (i != 0) {
            drawable = l07.M(yv6Var.a.getContext(), i);
        } else {
            drawable = null;
        }
        yv6Var.d = drawable;
        yv6Var.c();
    }

    public void setLogo(int i) {
        Drawable drawable;
        k();
        yv6 yv6Var = (yv6) this.c0;
        if (i != 0) {
            drawable = l07.M(yv6Var.a.getContext(), i);
        } else {
            drawable = null;
        }
        yv6Var.e = drawable;
        yv6Var.c();
    }

    public void setOverlayMode(boolean z) {
        this.e0 = z;
    }

    public void setWindowCallback(Window.Callback callback) {
        k();
        ((yv6) this.c0).k = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        k();
        yv6 yv6Var = (yv6) this.c0;
        if (!yv6Var.g) {
            Toolbar toolbar = yv6Var.a;
            yv6Var.h = charSequence;
            if ((yv6Var.b & 8) != 0) {
                toolbar.setTitle(charSequence);
                if (yv6Var.g) {
                    aa7.o(toolbar.getRootView(), charSequence);
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

    public void setIcon(Drawable drawable) {
        k();
        yv6 yv6Var = (yv6) this.c0;
        yv6Var.d = drawable;
        yv6Var.c();
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // defpackage.e64
    public final void c(View view, int i, int i2, int[] iArr, int i3) {
    }
}
