package androidx.appcompat.widget;

import a0.j;
import a6.d2;
import a6.e1;
import a6.i2;
import a6.n0;
import a6.p0;
import a6.q1;
import a6.r1;
import a6.s;
import a6.s1;
import a6.t;
import a6.t1;
import a6.u;
import a6.u1;
import a6.v1;
import a6.x0;
import android.annotation.SuppressLint;
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
import l.k0;
import me.magnum.melonds.R;
import p.l;
import p.w;
import q.e;
import q.h1;
import q.h3;
import q.m3;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements s, t {
    public static final i2 A0;
    public static final Rect B0;

    /* renamed from: z0  reason: collision with root package name */
    public static final int[] f924z0 = {R.attr.actionBarSize, 16842841};
    public int A;
    public int B;
    public ContentFrameLayout L;
    public ActionBarContainer R;

    /* renamed from: b0  reason: collision with root package name */
    public h1 f925b0;

    /* renamed from: c0  reason: collision with root package name */
    public Drawable f926c0;

    /* renamed from: d0  reason: collision with root package name */
    public boolean f927d0;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f928e0;

    /* renamed from: f0  reason: collision with root package name */
    public boolean f929f0;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f930g0;

    /* renamed from: h0  reason: collision with root package name */
    public int f931h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f932i0;

    /* renamed from: j0  reason: collision with root package name */
    public final Rect f933j0;

    /* renamed from: k0  reason: collision with root package name */
    public final Rect f934k0;

    /* renamed from: l0  reason: collision with root package name */
    public final Rect f935l0;

    /* renamed from: m0  reason: collision with root package name */
    public final Rect f936m0;

    /* renamed from: n0  reason: collision with root package name */
    public i2 f937n0;

    /* renamed from: o0  reason: collision with root package name */
    public i2 f938o0;
    public i2 p0;

    /* renamed from: q0  reason: collision with root package name */
    public i2 f939q0;

    /* renamed from: r0  reason: collision with root package name */
    public q.c f940r0;

    /* renamed from: s0  reason: collision with root package name */
    public OverScroller f941s0;

    /* renamed from: t0  reason: collision with root package name */
    public ViewPropertyAnimator f942t0;

    /* renamed from: u0  reason: collision with root package name */
    public final e1 f943u0;

    /* renamed from: v0  reason: collision with root package name */
    public final q.b f944v0;

    /* renamed from: w0  reason: collision with root package name */
    public final q.b f945w0;

    /* renamed from: x0  reason: collision with root package name */
    public final u f946x0;

    /* renamed from: y0  reason: collision with root package name */
    public final e f947y0;

    static {
        v1 q1Var;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            q1Var = new u1();
        } else if (i2 >= 31) {
            q1Var = new t1();
        } else if (i2 >= 30) {
            q1Var = new s1();
        } else if (i2 >= 29) {
            q1Var = new r1();
        } else {
            q1Var = new q1();
        }
        q1Var.g(q5.b.c(0, 1, 0, 1));
        A0 = q1Var.b();
        B0 = new Rect();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v14, types: [a6.u, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v15, types: [android.view.View, q.e] */
    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.B = 0;
        this.f933j0 = new Rect();
        this.f934k0 = new Rect();
        this.f935l0 = new Rect();
        this.f936m0 = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        i2 i2Var = i2.f478b;
        this.f937n0 = i2Var;
        this.f938o0 = i2Var;
        this.p0 = i2Var;
        this.f939q0 = i2Var;
        this.f943u0 = new e1(3, this);
        this.f944v0 = new q.b(this, 0);
        this.f945w0 = new q.b(this, 1);
        i(context);
        this.f946x0 = new Object();
        ?? view = new View(context);
        view.setWillNotDraw(true);
        this.f947y0 = view;
        addView(view);
    }

    public static boolean g(View view, Rect rect, boolean z10) {
        boolean z11;
        q.d dVar = (q.d) view.getLayoutParams();
        int i2 = ((ViewGroup.MarginLayoutParams) dVar).leftMargin;
        int i10 = rect.left;
        if (i2 != i10) {
            ((ViewGroup.MarginLayoutParams) dVar).leftMargin = i10;
            z11 = true;
        } else {
            z11 = false;
        }
        int i11 = ((ViewGroup.MarginLayoutParams) dVar).topMargin;
        int i12 = rect.top;
        if (i11 != i12) {
            ((ViewGroup.MarginLayoutParams) dVar).topMargin = i12;
            z11 = true;
        }
        int i13 = ((ViewGroup.MarginLayoutParams) dVar).rightMargin;
        int i14 = rect.right;
        if (i13 != i14) {
            ((ViewGroup.MarginLayoutParams) dVar).rightMargin = i14;
            z11 = true;
        }
        if (z10) {
            int i15 = ((ViewGroup.MarginLayoutParams) dVar).bottomMargin;
            int i16 = rect.bottom;
            if (i15 != i16) {
                ((ViewGroup.MarginLayoutParams) dVar).bottomMargin = i16;
                return true;
            }
        }
        return z11;
    }

    @Override // a6.s
    public final void a(View view, View view2, int i2, int i10) {
        if (i10 == 0) {
            onNestedScrollAccepted(view, view2, i2);
        }
    }

    @Override // a6.s
    public final void b(View view, int i2) {
        if (i2 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof q.d;
    }

    @Override // a6.t
    public final void d(View view, int i2, int i10, int i11, int i12, int i13, int[] iArr) {
        e(view, i2, i10, i11, i12, i13);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i2;
        super.draw(canvas);
        if (this.f926c0 != null) {
            if (this.R.getVisibility() == 0) {
                i2 = (int) (this.R.getTranslationY() + this.R.getBottom() + 0.5f);
            } else {
                i2 = 0;
            }
            this.f926c0.setBounds(0, i2, getWidth(), this.f926c0.getIntrinsicHeight() + i2);
            this.f926c0.draw(canvas);
        }
    }

    @Override // a6.s
    public final void e(View view, int i2, int i10, int i11, int i12, int i13) {
        if (i13 == 0) {
            onNestedScroll(view, i2, i10, i11, i12);
        }
    }

    @Override // a6.s
    public final boolean f(View view, View view2, int i2, int i10) {
        if (i10 == 0 && onStartNestedScroll(view, view2, i2)) {
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
        u uVar = this.f946x0;
        return uVar.f516b | uVar.f515a;
    }

    public CharSequence getTitle() {
        k();
        return ((m3) this.f925b0).f11964a.getTitle();
    }

    public final void h() {
        removeCallbacks(this.f944v0);
        removeCallbacks(this.f945w0);
        ViewPropertyAnimator viewPropertyAnimator = this.f942t0;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void i(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f924z0);
        boolean z10 = false;
        this.A = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f926c0 = drawable;
        if (drawable == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        obtainStyledAttributes.recycle();
        this.f941s0 = new OverScroller(context);
    }

    public final void j(int i2) {
        k();
        if (i2 != 2) {
            if (i2 != 5) {
                if (i2 != 109) {
                    return;
                }
                setOverlayMode(true);
                return;
            }
            ((m3) this.f925b0).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
            return;
        }
        ((m3) this.f925b0).getClass();
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    public final void k() {
        h1 wrapper;
        if (this.L == null) {
            this.L = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.R = (ActionBarContainer) findViewById(R.id.action_bar_container);
            View findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof h1) {
                wrapper = (h1) findViewById;
            } else if (findViewById instanceof Toolbar) {
                wrapper = ((Toolbar) findViewById).getWrapper();
            } else {
                j.p("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
                return;
            }
            this.f925b0 = wrapper;
        }
    }

    public final void l(Menu menu, w wVar) {
        k();
        m3 m3Var = (m3) this.f925b0;
        Toolbar toolbar = m3Var.f11964a;
        if (m3Var.m == null) {
            m3Var.m = new q.j(toolbar.getContext());
        }
        q.j jVar = m3Var.m;
        jVar.X = wVar;
        l lVar = (l) menu;
        if (lVar != null || toolbar.A != null) {
            toolbar.g();
            l lVar2 = toolbar.A.f948m0;
            if (lVar2 == lVar) {
                return;
            }
            if (lVar2 != null) {
                lVar2.r(toolbar.I0);
                lVar2.r(toolbar.J0);
            }
            if (toolbar.J0 == null) {
                toolbar.J0 = new h3(toolbar);
            }
            jVar.f11922k0 = true;
            Context context = toolbar.f1012g0;
            if (lVar != null) {
                lVar.b(jVar, context);
                lVar.b(toolbar.J0, toolbar.f1012g0);
            } else {
                jVar.g(context, null);
                toolbar.J0.g(toolbar.f1012g0, null);
                jVar.d();
                toolbar.J0.d();
            }
            toolbar.A.setPopupTheme(toolbar.f1013h0);
            toolbar.A.setPresenter(jVar);
            toolbar.I0 = jVar;
            toolbar.x();
        }
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        k();
        i2 g10 = i2.g(this, windowInsets);
        boolean g11 = g(this.R, new Rect(g10.b(), g10.d(), g10.c(), g10.a()), false);
        WeakHashMap weakHashMap = x0.f533a;
        Rect rect = this.f933j0;
        p0.b(this, g10, rect);
        int i2 = rect.left;
        int i10 = rect.top;
        int i11 = rect.right;
        int i12 = rect.bottom;
        d2 d2Var = g10.f479a;
        i2 m = d2Var.m(i2, i10, i11, i12);
        this.f937n0 = m;
        boolean z10 = true;
        if (!this.f938o0.equals(m)) {
            this.f938o0 = this.f937n0;
            g11 = true;
        }
        Rect rect2 = this.f934k0;
        if (!rect2.equals(rect)) {
            rect2.set(rect);
        } else {
            z10 = g11;
        }
        if (z10) {
            requestLayout();
        }
        return d2Var.a().f479a.c().f479a.b().f();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i(getContext());
        WeakHashMap weakHashMap = x0.f533a;
        n0.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i2, int i10, int i11, int i12) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                q.d dVar = (q.d) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i14 = ((ViewGroup.MarginLayoutParams) dVar).leftMargin + paddingLeft;
                int i15 = ((ViewGroup.MarginLayoutParams) dVar).topMargin + paddingTop;
                childAt.layout(i14, i15, measuredWidth + i14, measuredHeight + i15);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0110  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r13, int r14) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f8, float f10, boolean z10) {
        if (this.f929f0 && z10) {
            this.f941s0.fling(0, 0, 0, (int) f10, 0, 0, Integer.MIN_VALUE, Preference.DEFAULT_ORDER);
            if (this.f941s0.getFinalY() > this.R.getHeight()) {
                h();
                this.f945w0.run();
            } else {
                h();
                this.f944v0.run();
            }
            this.f930g0 = true;
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f8, float f10) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i2, int i10, int i11, int i12) {
        int i13 = this.f931h0 + i10;
        this.f931h0 = i13;
        setActionBarHideOffset(i13);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i2) {
        k0 k0Var;
        o.j jVar;
        this.f946x0.f515a = i2;
        this.f931h0 = getActionBarHideOffset();
        h();
        q.c cVar = this.f940r0;
        if (cVar != null && (jVar = (k0Var = (k0) cVar).D) != null) {
            jVar.a();
            k0Var.D = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i2) {
        if ((i2 & 2) != 0 && this.R.getVisibility() == 0) {
            return this.f929f0;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (this.f929f0 && !this.f930g0) {
            if (this.f931h0 <= this.R.getHeight()) {
                h();
                postDelayed(this.f944v0, 600L);
                return;
            }
            h();
            postDelayed(this.f945w0, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i2) {
        boolean z10;
        boolean z11;
        super.onWindowSystemUiVisibilityChanged(i2);
        k();
        int i10 = this.f932i0 ^ i2;
        this.f932i0 = i2;
        if ((i2 & 4) == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((i2 & 256) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        q.c cVar = this.f940r0;
        if (cVar != null) {
            k0 k0Var = (k0) cVar;
            k0Var.f8438z = !z11;
            if (!z10 && z11) {
                if (!k0Var.A) {
                    k0Var.A = true;
                    k0Var.F0(true);
                }
            } else if (k0Var.A) {
                k0Var.A = false;
                k0Var.F0(true);
            }
        }
        if ((i10 & 256) != 0 && this.f940r0 != null) {
            WeakHashMap weakHashMap = x0.f533a;
            n0.c(this);
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i2) {
        super.onWindowVisibilityChanged(i2);
        this.B = i2;
        q.c cVar = this.f940r0;
        if (cVar != null) {
            ((k0) cVar).f8437y = i2;
        }
    }

    public void setActionBarHideOffset(int i2) {
        h();
        this.R.setTranslationY(-Math.max(0, Math.min(i2, this.R.getHeight())));
    }

    public void setActionBarVisibilityCallback(q.c cVar) {
        this.f940r0 = cVar;
        if (getWindowToken() != null) {
            ((k0) this.f940r0).f8437y = this.B;
            int i2 = this.f932i0;
            if (i2 != 0) {
                onWindowSystemUiVisibilityChanged(i2);
                WeakHashMap weakHashMap = x0.f533a;
                n0.c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z10) {
        this.f928e0 = z10;
    }

    public void setHideOnContentScrollEnabled(boolean z10) {
        if (z10 != this.f929f0) {
            this.f929f0 = z10;
            if (!z10) {
                h();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i2) {
        Drawable drawable;
        k();
        m3 m3Var = (m3) this.f925b0;
        if (i2 != 0) {
            drawable = k7.w.p(m3Var.f11964a.getContext(), i2);
        } else {
            drawable = null;
        }
        m3Var.f11967d = drawable;
        m3Var.c();
    }

    public void setLogo(int i2) {
        Drawable drawable;
        k();
        m3 m3Var = (m3) this.f925b0;
        if (i2 != 0) {
            drawable = k7.w.p(m3Var.f11964a.getContext(), i2);
        } else {
            drawable = null;
        }
        m3Var.f11968e = drawable;
        m3Var.c();
    }

    public void setOverlayMode(boolean z10) {
        this.f927d0 = z10;
    }

    public void setWindowCallback(Window.Callback callback) {
        k();
        ((m3) this.f925b0).f11974k = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        k();
        m3 m3Var = (m3) this.f925b0;
        if (!m3Var.f11970g) {
            Toolbar toolbar = m3Var.f11964a;
            m3Var.f11971h = charSequence;
            if ((m3Var.f11965b & 8) != 0) {
                toolbar.setTitle(charSequence);
                if (m3Var.f11970g) {
                    x0.p(toolbar.getRootView(), charSequence);
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
        m3 m3Var = (m3) this.f925b0;
        m3Var.f11967d = drawable;
        m3Var.c();
    }

    public void setShowingForActionMode(boolean z10) {
    }

    public void setUiOptions(int i2) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i2, int i10, int[] iArr) {
    }

    @Override // a6.s
    public final void c(View view, int i2, int i10, int[] iArr, int i11) {
    }
}
