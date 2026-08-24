package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Trace;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.stormds.emulator.R;
import java.lang.ref.WeakReference;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: p0  reason: default package */
/* loaded from: classes.dex */
public abstract class p0 extends ViewGroup {
    public WeakReference A;
    public IBinder B;
    public xx7 L;
    public zx0 R;
    public mx0 d0;
    public on2 e0;
    public boolean f0;
    public boolean g0;
    public boolean h0;

    public p0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setClipChildren(false);
        setClipToPadding(false);
        setImportantForAccessibility(1);
        wh whVar = new wh(this, 7);
        addOnAttachStateChangeListener(whVar);
        do7 do7Var = new do7(this);
        bl2.D(this).a.add(do7Var);
        this.e0 = new mf1(this, whVar, do7Var, 2);
    }

    private final void setParentContext(zx0 zx0Var) {
        if (this.R != zx0Var) {
            this.R = zx0Var;
            if (zx0Var != null) {
                this.A = null;
            }
            xx7 xx7Var = this.L;
            if (xx7Var != null) {
                xx7Var.a();
                this.L = null;
                if (isAttachedToWindow()) {
                    f();
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

    public abstract void a(px0 px0Var, int i);

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        c();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams) {
        c();
        return super.addViewInLayout(view, i, layoutParams);
    }

    public final void b() {
        if (isAttachedToWindow()) {
            setPreviousAttachedWindowToken(getWindowToken());
            if (this.d0 == null) {
                te teVar = null;
                if (getChildCount() != 0) {
                    View childAt = getChildAt(0);
                    if (childAt instanceof te) {
                        teVar = (te) childAt;
                    }
                }
                if (teVar != null) {
                    teVar.setComposeViewContext(k(vy7.i0(this), teVar.getComposeViewContext()));
                }
            }
            if (getShouldCreateCompositionOnAttachedToWindow()) {
                f();
            }
        }
    }

    public final void c() {
        if (this.g0) {
            return;
        }
        String simpleName = getClass().getSimpleName();
        throw new UnsupportedOperationException("Cannot add views to " + simpleName + "; only Compose content is supported");
    }

    public final void d() {
        mx0 mx0Var;
        View view;
        if (this.R == null && !isAttachedToWindow() && ((mx0Var = this.d0) == null || (view = mx0Var.a) == null || !view.isAttachedToWindow())) {
            i.m("createComposition requires a previous call to createComposition(ComposeViewContext), a parent reference, or the View to be attached to a window. Attach the View or call setParentCompositionReference.");
        } else {
            f();
        }
    }

    public final void e() {
        te teVar;
        View childAt = getChildAt(0);
        if (childAt instanceof te) {
            teVar = (te) childAt;
        } else {
            teVar = null;
        }
        if (teVar != null && teVar.E1) {
            teVar.getComposeViewContext().b();
            teVar.E1 = false;
        }
        xx7 xx7Var = this.L;
        if (xx7Var != null) {
            xx7Var.a();
        }
        this.L = null;
        requestLayout();
    }

    public final void f() {
        if (this.L == null) {
            try {
                this.g0 = true;
                Trace.beginSection("Compose:initializeView");
                mx0 mx0Var = this.d0;
                if (mx0Var == null) {
                    mx0Var = i();
                }
                this.L = zx7.a(this, mx0Var, new zv0(1003123809, true, new o0(this, 0)));
                Trace.endSection();
            } finally {
                this.g0 = false;
            }
        }
    }

    public void g(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i3 - i) - getPaddingRight(), (i4 - i2) - getPaddingBottom());
        }
    }

    /* renamed from: getAutoClearFocusBehavior-4UtRPd4  reason: not valid java name */
    public final int m6getAutoClearFocusBehavior4UtRPd4() {
        jx jxVar;
        Object tag = getTag(R.id.auto_clear_focus_behavior_tag);
        if (tag instanceof jx) {
            jxVar = (jx) tag;
        } else {
            jxVar = null;
        }
        if (jxVar != null) {
            return jxVar.a;
        }
        return 1;
    }

    public final mx0 getComposeViewContext$ui() {
        return this.d0;
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
        return this.f0;
    }

    public void h(int i, int i2) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i, i2);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i2)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final mx0 i() {
        te teVar;
        mx0 composeViewContext;
        mx0 l0;
        bp7 bp7Var;
        bp7 bp7Var2 = null;
        if (getChildCount() != 0) {
            View childAt = getChildAt(0);
            if (childAt instanceof te) {
                teVar = (te) childAt;
            } else {
                teVar = null;
            }
            if (teVar != null) {
                composeViewContext = teVar.getComposeViewContext();
                View i0 = vy7.i0(this);
                l0 = vy7.l0(i0);
                if (l0 != null) {
                    zx0 j = j();
                    hu3 B = bl2.B(i0);
                    if (B == null) {
                        if (composeViewContext != null) {
                            B = composeViewContext.c;
                        } else {
                            B = null;
                        }
                        if (B == null) {
                            i.m("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
                            return null;
                        }
                    }
                    hu3 hu3Var = B;
                    g56 C = kn2.C(i0);
                    if (C == null) {
                        if (composeViewContext != null) {
                            C = composeViewContext.d;
                        } else {
                            C = null;
                        }
                        if (C == null) {
                            i.m("Composed into the View which doesn't propagate ViewTreeSavedStateRegistryOwner!");
                            return null;
                        }
                    }
                    g56 g56Var = C;
                    bp7 r = ln2.r(i0);
                    if (r == null) {
                        if (composeViewContext != null) {
                            bp7Var2 = composeViewContext.e;
                        }
                        bp7Var = bp7Var2;
                    } else {
                        bp7Var = r;
                    }
                    mx0 mx0Var = new mx0(vy7.l0(vy7.i0(i0)), i0, j, hu3Var, g56Var, bp7Var);
                    i0.setTag(R.id.androidx_compose_ui_view_compose_view_context, new WeakReference(mx0Var));
                    return mx0Var;
                }
                return k(i0, l0);
            }
        }
        composeViewContext = null;
        View i02 = vy7.i0(this);
        l0 = vy7.l0(i02);
        if (l0 != null) {
        }
    }

    @Override // android.view.ViewGroup
    public final boolean isTransitionGroup() {
        if (this.h0 && !super.isTransitionGroup()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [dh5, java.lang.Object] */
    public final zx0 j() {
        if5 if5Var;
        l61 l61Var;
        um umVar;
        ut3 ut3Var;
        zx0 zx0Var;
        zx0 zx0Var2 = this.R;
        if (zx0Var2 == null) {
            zx0Var2 = uv7.a(this);
            if (zx0Var2 == null) {
                ViewParent parent = getParent();
                while (zx0Var2 == null && (parent instanceof View)) {
                    View view = (View) parent;
                    zx0Var2 = uv7.a(view);
                    parent = xk2.s(view);
                }
            }
            if5 if5Var2 = null;
            if (zx0Var2 != null) {
                if ((zx0Var2 instanceof if5) && ((ff5) ((if5) zx0Var2).u.getValue()).compareTo(ff5.ShuttingDown) <= 0) {
                    zx0Var = null;
                } else {
                    zx0Var = zx0Var2;
                }
                if (zx0Var != null) {
                    this.A = new WeakReference(zx0Var);
                }
            } else {
                zx0Var2 = null;
            }
            if (zx0Var2 == null) {
                WeakReference weakReference = this.A;
                if (weakReference == null || (zx0Var2 = (zx0) weakReference.get()) == null || ((zx0Var2 instanceof if5) && ((ff5) ((if5) zx0Var2).u.getValue()).compareTo(ff5.ShuttingDown) <= 0)) {
                    zx0Var2 = null;
                }
                if (zx0Var2 == null) {
                    if (!isAttachedToWindow()) {
                        p53.c("Cannot locate windowRecomposer; View " + this + " is not attached to a window");
                    }
                    ViewParent s = xk2.s(this);
                    View view2 = this;
                    while (s instanceof View) {
                        View view3 = (View) s;
                        if (view3.getId() == 16908290) {
                            break;
                        }
                        view2 = view3;
                        s = view3.getParent();
                    }
                    zx0 a = uv7.a(view2);
                    if (a == null) {
                        ((qv7) rv7.a.get()).getClass();
                        vt1 vt1Var = vt1.A;
                        ex6 ex6Var = sm.i0;
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            l61Var = (l61) sm.i0.getValue();
                        } else {
                            l61Var = (l61) sm.j0.get();
                            if (l61Var == null) {
                                i.m("no AndroidUiDispatcher for this thread");
                                return null;
                            }
                        }
                        l61 N = l61Var.N(vt1Var);
                        um umVar2 = (um) N.Z(vs0.i0);
                        if (umVar2 != null) {
                            um umVar3 = new um(umVar2);
                            bk1 bk1Var = (bk1) umVar3.L;
                            synchronized (bk1Var.L) {
                                bk1Var.A = false;
                                umVar = umVar3;
                            }
                        } else {
                            umVar = null;
                        }
                        ?? obj = new Object();
                        l61 l61Var2 = (n74) N.Z(cs1.f0);
                        if (l61Var2 == null) {
                            l61Var2 = new o74(view2.getContext().getApplicationContext());
                            obj.A = l61Var2;
                        }
                        if (umVar != null) {
                            vt1Var = umVar;
                        }
                        l61 N2 = N.N(vt1Var).N(l61Var2);
                        if5Var = new if5(N2);
                        synchronized (if5Var.c) {
                            if5Var.t = true;
                        }
                        o41 i = g04.i(N2);
                        hu3 B = bl2.B(view2);
                        if (B != null) {
                            ut3Var = B.getLifecycle();
                        } else {
                            ut3Var = null;
                        }
                        if (ut3Var != null) {
                            view2.addOnAttachStateChangeListener(new wh6(view2, if5Var, 3));
                            ut3Var.a(new tv7(i, umVar, if5Var, obj));
                            view2.setTag(R.id.androidx_compose_ui_view_composition_context, if5Var);
                            ms2 ms2Var = ms2.A;
                            Handler handler = view2.getHandler();
                            int i2 = lv2.a;
                            view2.addOnAttachStateChangeListener(new wh(hv.L(ms2Var, new jv2(handler, "windowRecomposer cleanup", false).Y, null, new bf4(if5Var, view2, null, 29), 2), 8));
                        } else {
                            p53.d("ViewTreeLifecycleOwner not found from " + view2);
                            e41.c();
                            return null;
                        }
                    } else if (a instanceof if5) {
                        if5Var = (if5) a;
                    } else {
                        i.m("root viewTreeParentCompositionContext is not a Recomposer");
                        return null;
                    }
                    if (((ff5) if5Var.u.getValue()).compareTo(ff5.ShuttingDown) > 0) {
                        if5Var2 = if5Var;
                    }
                    if (if5Var2 != null) {
                        this.A = new WeakReference(if5Var2);
                    }
                    return if5Var;
                }
            }
        }
        return zx0Var2;
    }

    public final mx0 k(View view, mx0 mx0Var) {
        g56 g56Var;
        zx0 j = j();
        hu3 B = bl2.B(view);
        bp7 r = ln2.r(view);
        g56 C = kn2.C(view);
        zx0 zx0Var = mx0Var.b;
        g56 g56Var2 = mx0Var.d;
        hu3 hu3Var = mx0Var.c;
        if (j == zx0Var && B == hu3Var && r == mx0Var.e && C == g56Var2) {
            return mx0Var;
        }
        if (j.j() != mx0Var.b.j()) {
            e();
        }
        if (B == null) {
            B = hu3Var;
        }
        if (C == null) {
            g56Var = g56Var2;
        } else {
            g56Var = C;
        }
        mx0 mx0Var2 = new mx0(mx0Var, view, j, B, g56Var, r);
        view.setTag(R.id.androidx_compose_ui_view_compose_view_context, new WeakReference(mx0Var2));
        return mx0Var2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ja4 ja4Var = uv7.a;
        ViewParent s = xk2.s(this);
        View view = this;
        while (s instanceof View) {
            View view2 = (View) s;
            if (view2.getId() == 16908290) {
                break;
            }
            view = view2;
            s = view2.getParent();
        }
        if (view.getParent() == null) {
            getHandler().postAtFrontOfQueue(new n0(this, 0));
        } else {
            b();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        g(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        f();
        h(i, i2);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(i);
        }
    }

    /* renamed from: setAutoClearFocusBehavior-17tfJxM  reason: not valid java name */
    public final void m7setAutoClearFocusBehavior17tfJxM(int i) {
        setTag(R.id.auto_clear_focus_behavior_tag, new jx(i));
    }

    public final void setComposeViewContext$ui(mx0 mx0Var) {
        te teVar;
        if (this.d0 != mx0Var) {
            if (mx0Var == null) {
                e();
            } else if (getChildCount() != 0) {
                View childAt = getChildAt(0);
                if (childAt instanceof te) {
                    teVar = (te) childAt;
                } else {
                    teVar = null;
                }
                if (teVar != null) {
                    if (teVar.getCoroutineContext() != mx0Var.b.j()) {
                        e();
                    }
                    teVar.setComposeViewContext(mx0Var);
                }
            }
            this.d0 = mx0Var;
        }
    }

    public final void setParentCompositionContext(zx0 zx0Var) {
        setParentContext(zx0Var);
    }

    public final void setShowLayoutBounds(boolean z) {
        this.f0 = z;
        View childAt = getChildAt(0);
        if (childAt != null) {
            ((te) ((zp4) childAt)).setShowLayoutBounds(z);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z) {
        super.setTransitionGroup(z);
        this.h0 = true;
    }

    public final void setViewCompositionStrategy(eo7 eo7Var) {
        on2 on2Var = this.e0;
        if (on2Var != null) {
            on2Var.c();
        }
        this.e0 = eo7Var.e(this);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        c();
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        c();
        return super.addViewInLayout(view, i, layoutParams, z);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        c();
        super.addView(view, i, i2);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        c();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        c();
        super.addView(view, i, layoutParams);
    }

    public static /* synthetic */ void getComposeViewContext$ui$annotations() {
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }
}
