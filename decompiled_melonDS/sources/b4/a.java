package b4;

import android.content.Context;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
import me.magnum.melonds.R;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class a extends ViewGroup {
    public WeakReference A;
    public IBinder B;
    public n3 L;
    public n2.v R;

    /* renamed from: b0  reason: collision with root package name */
    public mc.a f1780b0;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f1781c0;

    /* renamed from: d0  reason: collision with root package name */
    public boolean f1782d0;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f1783e0;

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setClipChildren(false);
        setClipToPadding(false);
        setImportantForAccessibility(1);
        v2 v2Var = new v2(0, this);
        addOnAttachStateChangeListener(v2Var);
        u2 u2Var = new u2(this);
        ij.a.Y(this).f6289a.add(u2Var);
        this.f1780b0 = new androidx.fragment.app.n(this, v2Var, u2Var, 2);
    }

    private final void setParentContext(n2.v vVar) {
        if (this.R != vVar) {
            this.R = vVar;
            if (vVar != null) {
                this.A = null;
            }
            n3 n3Var = this.L;
            if (n3Var != null) {
                n3Var.a();
                this.L = null;
                if (isAttachedToWindow()) {
                    d();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.B != iBinder) {
            this.B = iBinder;
            this.A = null;
        }
    }

    public abstract void a(n2.m mVar, int i2);

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        b();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        b();
        return super.addViewInLayout(view, i2, layoutParams);
    }

    public final void b() {
        if (this.f1782d0) {
            return;
        }
        String simpleName = getClass().getSimpleName();
        throw new UnsupportedOperationException("Cannot add views to " + simpleName + "; only Compose content is supported");
    }

    public final void c() {
        n3 n3Var = this.L;
        if (n3Var != null) {
            n3Var.a();
        }
        this.L = null;
        requestLayout();
    }

    public final void d() {
        if (this.L == null) {
            try {
                this.f1782d0 = true;
                this.L = p3.a(this, g(), new v2.c(-656146368, true, new a5.f(4, this)));
            } finally {
                this.f1782d0 = false;
            }
        }
    }

    public void e(boolean z10, int i2, int i10, int i11, int i12) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i11 - i2) - getPaddingRight(), (i12 - i10) - getPaddingBottom());
        }
    }

    public void f(int i2, int i10) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i2, i10);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i2)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i10) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i10)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [nc.t, java.lang.Object] */
    public final n2.v g() {
        n2.u1 u1Var;
        cc.g gVar;
        a1 a1Var;
        androidx.lifecycle.r rVar;
        n2.v vVar;
        n2.v vVar2 = this.R;
        if (vVar2 == null) {
            vVar2 = k3.b(this);
            if (vVar2 == null) {
                ViewParent parent = getParent();
                while (vVar2 == null && (parent instanceof View)) {
                    View view = (View) parent;
                    vVar2 = k3.b(view);
                    parent = a.a.D(view);
                }
            }
            n2.u1 u1Var2 = null;
            if (vVar2 != null) {
                if ((vVar2 instanceof n2.u1) && ((n2.r1) ((n2.u1) vVar2).f10058u.getValue()).compareTo(n2.r1.ShuttingDown) <= 0) {
                    vVar = null;
                } else {
                    vVar = vVar2;
                }
                if (vVar != null) {
                    this.A = new WeakReference(vVar);
                }
            } else {
                vVar2 = null;
            }
            if (vVar2 == null) {
                WeakReference weakReference = this.A;
                if (weakReference == null || (vVar2 = (n2.v) weakReference.get()) == null || ((vVar2 instanceof n2.u1) && ((n2.r1) ((n2.u1) vVar2).f10058u.getValue()).compareTo(n2.r1.ShuttingDown) <= 0)) {
                    vVar2 = null;
                }
                if (vVar2 == null) {
                    if (!isAttachedToWindow()) {
                        x3.a.c("Cannot locate windowRecomposer; View " + this + " is not attached to a window");
                    }
                    ViewParent parent2 = getParent();
                    View view2 = this;
                    while (parent2 instanceof View) {
                        View view3 = (View) parent2;
                        if (view3.getId() == 16908290) {
                            break;
                        }
                        view2 = view3;
                        parent2 = view3.getParent();
                    }
                    n2.v b10 = k3.b(view2);
                    if (b10 == null) {
                        ((d3) e3.f1842a.get()).getClass();
                        cc.h hVar = cc.h.A;
                        yb.n nVar = y0.f2007g0;
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            gVar = (cc.g) y0.f2007g0.getValue();
                        } else {
                            gVar = (cc.g) y0.f2008h0.get();
                            if (gVar == null) {
                                a0.j.p("no AndroidUiDispatcher for this thread");
                                return null;
                            }
                        }
                        cc.g H = gVar.H(hVar);
                        a1 a1Var2 = (a1) H.t(n2.e.L);
                        if (a1Var2 != null) {
                            a1 a1Var3 = new a1(a1Var2);
                            e9.a aVar = (e9.a) a1Var3.L;
                            synchronized (aVar.f4415b) {
                                aVar.f4414a = false;
                                a1Var = a1Var3;
                            }
                        } else {
                            a1Var = null;
                        }
                        ?? obj = new Object();
                        cc.g gVar2 = (b3.r) H.t(b3.c.f1761j0);
                        if (gVar2 == null) {
                            gVar2 = new i2();
                            obj.A = gVar2;
                        }
                        if (a1Var != null) {
                            hVar = a1Var;
                        }
                        cc.g H2 = H.H(hVar).H(gVar2);
                        u1Var = new n2.u1(H2);
                        synchronized (u1Var.f10041c) {
                            u1Var.f10057t = true;
                        }
                        ah.h0 a10 = zc.x.a(H2);
                        androidx.lifecycle.x d4 = androidx.lifecycle.s0.d(view2);
                        if (d4 != null) {
                            rVar = d4.getLifecycle();
                        } else {
                            rVar = null;
                        }
                        if (rVar != null) {
                            view2.addOnAttachStateChangeListener(new w2(view2, u1Var, 1));
                            rVar.a(new h3(a10, a1Var, u1Var, obj, view2));
                            view2.setTag(R.id.androidx_compose_ui_view_composition_context, u1Var);
                            zc.t0 t0Var = zc.t0.A;
                            Handler handler = view2.getHandler();
                            int i2 = ad.h.f705a;
                            view2.addOnAttachStateChangeListener(new v2(1, zc.x.v(t0Var, new ad.e(handler, "windowRecomposer cleanup", false).Y, null, new a5.o(u1Var, view2, null, 14), 2)));
                        } else {
                            x3.a.d("ViewTreeLifecycleOwner not found from " + view2);
                            wa.b.a();
                            return null;
                        }
                    } else if (b10 instanceof n2.u1) {
                        u1Var = (n2.u1) b10;
                    } else {
                        a0.j.p("root viewTreeParentCompositionContext is not a Recomposer");
                        return null;
                    }
                    if (((n2.r1) u1Var.f10058u.getValue()).compareTo(n2.r1.ShuttingDown) > 0) {
                        u1Var2 = u1Var;
                    }
                    if (u1Var2 != null) {
                        this.A = new WeakReference(u1Var2);
                    }
                    return u1Var;
                }
            }
        }
        return vVar2;
    }

    /* renamed from: getAutoClearFocusBehavior-4UtRPd4  reason: not valid java name */
    public final int m2getAutoClearFocusBehavior4UtRPd4() {
        h1 h1Var;
        Object tag = getTag(R.id.auto_clear_focus_behavior_tag);
        if (tag instanceof h1) {
            h1Var = (h1) tag;
        } else {
            h1Var = null;
        }
        if (h1Var != null) {
            return h1Var.f1854a;
        }
        return 1;
    }

    public final boolean getHasComposition() {
        if (this.L != null) {
            return true;
        }
        return false;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.f1781c0;
    }

    @Override // android.view.ViewGroup
    public final boolean isTransitionGroup() {
        if (this.f1783e0 && !super.isTransitionGroup()) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setPreviousAttachedWindowToken(getWindowToken());
        if (getShouldCreateCompositionOnAttachedToWindow()) {
            d();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i2, int i10, int i11, int i12) {
        e(z10, i2, i10, i11, i12);
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i10) {
        d();
        f(i2, i10);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i2) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(i2);
        }
    }

    /* renamed from: setAutoClearFocusBehavior-17tfJxM  reason: not valid java name */
    public final void m3setAutoClearFocusBehavior17tfJxM(int i2) {
        setTag(R.id.auto_clear_focus_behavior_tag, new h1(i2));
    }

    public final void setParentCompositionContext(n2.v vVar) {
        setParentContext(vVar);
    }

    public final void setShowLayoutBounds(boolean z10) {
        this.f1781c0 = z10;
        View childAt = getChildAt(0);
        if (childAt != null) {
            ((x) ((a4.c2) childAt)).setShowLayoutBounds(z10);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z10) {
        super.setTransitionGroup(z10);
        this.f1783e0 = true;
    }

    public final void setViewCompositionStrategy(x2 x2Var) {
        mc.a aVar = this.f1780b0;
        if (aVar != null) {
            aVar.b();
        }
        this.f1780b0 = x2Var.a(this);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2) {
        b();
        super.addView(view, i2);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i2, ViewGroup.LayoutParams layoutParams, boolean z10) {
        b();
        return super.addViewInLayout(view, i2, layoutParams, z10);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2, int i10) {
        b();
        super.addView(view, i2, i10);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        b();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        b();
        super.addView(view, i2, layoutParams);
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }
}
