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
import java.lang.ref.WeakReference;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: o0  reason: default package */
/* loaded from: classes.dex */
public abstract class o0 extends ViewGroup {
    public WeakReference A;
    public IBinder B;
    public aj7 L;
    public dv0 R;
    public qu0 c0;
    public ki2 d0;
    public boolean e0;
    public boolean f0;
    public boolean g0;

    public o0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setClipChildren(false);
        setClipToPadding(false);
        setImportantForAccessibility(1);
        kh khVar = new kh(7, this);
        addOnAttachStateChangeListener(khVar);
        da7 da7Var = new da7(this);
        gk2.T(this).a.add(da7Var);
        this.d0 = new ob1(this, khVar, da7Var, 2);
    }

    private final void setParentContext(dv0 dv0Var) {
        if (this.R != dv0Var) {
            this.R = dv0Var;
            if (dv0Var != null) {
                this.A = null;
            }
            aj7 aj7Var = this.L;
            if (aj7Var != null) {
                aj7Var.a();
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

    public abstract void a(tu0 tu0Var, int i);

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
            if (this.c0 == null) {
                ee eeVar = null;
                if (getChildCount() != 0) {
                    View childAt = getChildAt(0);
                    if (childAt instanceof ee) {
                        eeVar = (ee) childAt;
                    }
                }
                if (eeVar != null) {
                    eeVar.setComposeViewContext(k(tq5.m(this), eeVar.getComposeViewContext()));
                }
            }
            if (getShouldCreateCompositionOnAttachedToWindow()) {
                f();
            }
        }
    }

    public final void c() {
        if (this.f0) {
            return;
        }
        String simpleName = getClass().getSimpleName();
        throw new UnsupportedOperationException("Cannot add views to " + simpleName + "; only Compose content is supported");
    }

    public final void d() {
        qu0 qu0Var;
        View view;
        if (this.R == null && !isAttachedToWindow() && ((qu0Var = this.c0) == null || (view = qu0Var.a) == null || !view.isAttachedToWindow())) {
            i.n("createComposition requires a previous call to createComposition(ComposeViewContext), a parent reference, or the View to be attached to a window. Attach the View or call setParentCompositionReference.");
        } else {
            f();
        }
    }

    public final void e() {
        ee eeVar;
        View childAt = getChildAt(0);
        if (childAt instanceof ee) {
            eeVar = (ee) childAt;
        } else {
            eeVar = null;
        }
        if (eeVar != null && eeVar.D1) {
            eeVar.getComposeViewContext().b();
            eeVar.D1 = false;
        }
        aj7 aj7Var = this.L;
        if (aj7Var != null) {
            aj7Var.a();
        }
        this.L = null;
        requestLayout();
    }

    public final void f() {
        if (this.L == null) {
            try {
                this.f0 = true;
                Trace.beginSection("Compose:initializeView");
                qu0 qu0Var = this.c0;
                if (qu0Var == null) {
                    qu0Var = i();
                }
                this.L = cj7.a(this, qu0Var, new et0(1003123809, true, new n0(0, this)));
                Trace.endSection();
            } finally {
                this.f0 = false;
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
    public final int m13getAutoClearFocusBehavior4UtRPd4() {
        lw lwVar;
        Object tag = getTag(R.id.auto_clear_focus_behavior_tag);
        if (tag instanceof lw) {
            lwVar = (lw) tag;
        } else {
            lwVar = null;
        }
        if (lwVar != null) {
            return lwVar.a;
        }
        return 1;
    }

    public final qu0 getComposeViewContext$ui() {
        return this.c0;
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
        return this.e0;
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.qu0 i() {
        /*
            r9 = this;
            int r0 = r9.getChildCount()
            r1 = 0
            if (r0 != 0) goto L9
        L7:
            r0 = r1
            goto L1c
        L9:
            r0 = 0
            android.view.View r0 = r9.getChildAt(r0)
            boolean r2 = r0 instanceof defpackage.ee
            if (r2 == 0) goto L15
            ee r0 = (defpackage.ee) r0
            goto L16
        L15:
            r0 = r1
        L16:
            if (r0 == 0) goto L7
            qu0 r0 = r0.getComposeViewContext()
        L1c:
            android.view.View r4 = defpackage.tq5.m(r9)
            qu0 r2 = defpackage.tq5.o(r4)
            if (r2 != 0) goto L7c
            dv0 r5 = r9.j()
            fn3 r9 = defpackage.jk2.u(r4)
            if (r9 != 0) goto L38
            if (r0 == 0) goto L35
            fn3 r9 = r0.c
            goto L36
        L35:
            r9 = r1
        L36:
            if (r9 == 0) goto L3a
        L38:
            r6 = r9
            goto L40
        L3a:
            java.lang.String r9 = "Composed into the View which doesn't propagate ViewTreeLifecycleOwner!"
            defpackage.i.n(r9)
            return r1
        L40:
            au5 r9 = defpackage.nk2.y(r4)
            if (r9 != 0) goto L4e
            if (r0 == 0) goto L4b
            au5 r9 = r0.d
            goto L4c
        L4b:
            r9 = r1
        L4c:
            if (r9 == 0) goto L50
        L4e:
            r7 = r9
            goto L56
        L50:
            java.lang.String r9 = "Composed into the View which doesn't propagate ViewTreeSavedStateRegistryOwner!"
            defpackage.i.n(r9)
            return r1
        L56:
            ab7 r9 = defpackage.nl2.L(r4)
            if (r9 != 0) goto L62
            if (r0 == 0) goto L60
            ab7 r1 = r0.e
        L60:
            r8 = r1
            goto L63
        L62:
            r8 = r9
        L63:
            qu0 r2 = new qu0
            android.view.View r9 = defpackage.tq5.m(r4)
            qu0 r3 = defpackage.tq5.o(r9)
            r2.<init>(r3, r4, r5, r6, r7, r8)
            java.lang.ref.WeakReference r9 = new java.lang.ref.WeakReference
            r9.<init>(r2)
            r0 = 2131427421(0x7f0b005d, float:1.8476458E38)
            r4.setTag(r0, r9)
            return r2
        L7c:
            qu0 r9 = r9.k(r4, r2)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o0.i():qu0");
    }

    @Override // android.view.ViewGroup
    public final boolean isTransitionGroup() {
        if (this.g0 && !super.isTransitionGroup()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, n75] */
    public final dv0 j() {
        s55 s55Var;
        e31 e31Var;
        im imVar;
        rm3 rm3Var;
        dv0 dv0Var;
        dv0 dv0Var2 = this.R;
        if (dv0Var2 == null) {
            dv0Var2 = ug7.a(this);
            if (dv0Var2 == null) {
                ViewParent parent = getParent();
                while (dv0Var2 == null && (parent instanceof View)) {
                    View view = (View) parent;
                    dv0Var2 = ug7.a(view);
                    parent = hk2.z(view);
                }
            }
            s55 s55Var2 = null;
            if (dv0Var2 != null) {
                if ((dv0Var2 instanceof s55) && ((p55) ((s55) dv0Var2).u.getValue()).compareTo(p55.ShuttingDown) <= 0) {
                    dv0Var = null;
                } else {
                    dv0Var = dv0Var2;
                }
                if (dv0Var != null) {
                    this.A = new WeakReference(dv0Var);
                }
            } else {
                dv0Var2 = null;
            }
            if (dv0Var2 == null) {
                WeakReference weakReference = this.A;
                if (weakReference == null || (dv0Var2 = (dv0) weakReference.get()) == null || ((dv0Var2 instanceof s55) && ((p55) ((s55) dv0Var2).u.getValue()).compareTo(p55.ShuttingDown) <= 0)) {
                    dv0Var2 = null;
                }
                if (dv0Var2 == null) {
                    if (!isAttachedToWindow()) {
                        mz2.c("Cannot locate windowRecomposer; View " + this + " is not attached to a window");
                    }
                    ViewParent z = hk2.z(this);
                    View view2 = this;
                    while (z instanceof View) {
                        View view3 = (View) z;
                        if (view3.getId() == 16908290) {
                            break;
                        }
                        view2 = view3;
                        z = view3.getParent();
                    }
                    dv0 a = ug7.a(view2);
                    if (a == null) {
                        ((qg7) rg7.a.get()).getClass();
                        mp1 mp1Var = mp1.A;
                        il6 il6Var = gm.h0;
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            e31Var = (e31) gm.h0.getValue();
                        } else {
                            e31Var = (e31) gm.i0.get();
                            if (e31Var == null) {
                                i.n("no AndroidUiDispatcher for this thread");
                                return null;
                            }
                        }
                        e31 C = e31Var.C(mp1Var);
                        im imVar2 = (im) C.I(k45.e0);
                        if (imVar2 != null) {
                            im imVar3 = new im(imVar2);
                            xf1 xf1Var = (xf1) imVar3.L;
                            synchronized (xf1Var.L) {
                                xf1Var.A = false;
                                imVar = imVar3;
                            }
                        } else {
                            imVar = null;
                        }
                        ?? obj = new Object();
                        e31 e31Var2 = (mz3) C.I(y60.u0);
                        if (e31Var2 == null) {
                            e31Var2 = new nz3(view2.getContext().getApplicationContext());
                            obj.A = e31Var2;
                        }
                        if (imVar != null) {
                            mp1Var = imVar;
                        }
                        e31 C2 = C.C(mp1Var).C(e31Var2);
                        s55Var = new s55(C2);
                        synchronized (s55Var.c) {
                            s55Var.t = true;
                        }
                        g11 c = iq2.c(C2);
                        fn3 u = jk2.u(view2);
                        if (u != null) {
                            rm3Var = u.getLifecycle();
                        } else {
                            rm3Var = null;
                        }
                        if (rm3Var != null) {
                            view2.addOnAttachStateChangeListener(new i66(view2, s55Var, 3));
                            rm3Var.a(new tg7(c, imVar, s55Var, obj));
                            view2.setTag(R.id.androidx_compose_ui_view_composition_context, s55Var);
                            hm2 hm2Var = hm2.A;
                            Handler handler = view2.getHandler();
                            int i = kp2.a;
                            view2.addOnAttachStateChangeListener(new kh(8, tq5.w(hm2Var, new ip2(handler, "windowRecomposer cleanup", false).Y, null, new v74(s55Var, view2, null, 28), 2)));
                        } else {
                            mz2.d("ViewTreeLifecycleOwner not found from " + view2);
                            f81.c();
                            return null;
                        }
                    } else if (a instanceof s55) {
                        s55Var = (s55) a;
                    } else {
                        i.n("root viewTreeParentCompositionContext is not a Recomposer");
                        return null;
                    }
                    if (((p55) s55Var.u.getValue()).compareTo(p55.ShuttingDown) > 0) {
                        s55Var2 = s55Var;
                    }
                    if (s55Var2 != null) {
                        this.A = new WeakReference(s55Var2);
                    }
                    return s55Var;
                }
            }
        }
        return dv0Var2;
    }

    public final qu0 k(View view, qu0 qu0Var) {
        au5 au5Var;
        dv0 j = j();
        fn3 u = jk2.u(view);
        ab7 L = nl2.L(view);
        au5 y = nk2.y(view);
        dv0 dv0Var = qu0Var.b;
        au5 au5Var2 = qu0Var.d;
        fn3 fn3Var = qu0Var.c;
        if (j == dv0Var && u == fn3Var && L == qu0Var.e && y == au5Var2) {
            return qu0Var;
        }
        if (j.j() != qu0Var.b.j()) {
            e();
        }
        if (u == null) {
            u = fn3Var;
        }
        if (y == null) {
            au5Var = au5Var2;
        } else {
            au5Var = y;
        }
        qu0 qu0Var2 = new qu0(qu0Var, view, j, u, au5Var, L);
        view.setTag(R.id.androidx_compose_ui_view_compose_view_context, new WeakReference(qu0Var2));
        return qu0Var2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        d24 d24Var = ug7.a;
        ViewParent z = hk2.z(this);
        View view = this;
        while (z instanceof View) {
            View view2 = (View) z;
            if (view2.getId() == 16908290) {
                break;
            }
            view = view2;
            z = view2.getParent();
        }
        if (view.getParent() == null) {
            getHandler().postAtFrontOfQueue(new m0(0, this));
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
    public final void m14setAutoClearFocusBehavior17tfJxM(int i) {
        setTag(R.id.auto_clear_focus_behavior_tag, new lw(i));
    }

    public final void setComposeViewContext$ui(qu0 qu0Var) {
        ee eeVar;
        if (this.c0 != qu0Var) {
            if (qu0Var == null) {
                e();
            } else if (getChildCount() != 0) {
                View childAt = getChildAt(0);
                if (childAt instanceof ee) {
                    eeVar = (ee) childAt;
                } else {
                    eeVar = null;
                }
                if (eeVar != null) {
                    if (eeVar.getCoroutineContext() != qu0Var.b.j()) {
                        e();
                    }
                    eeVar.setComposeViewContext(qu0Var);
                }
            }
            this.c0 = qu0Var;
        }
    }

    public final void setParentCompositionContext(dv0 dv0Var) {
        setParentContext(dv0Var);
    }

    public final void setShowLayoutBounds(boolean z) {
        this.e0 = z;
        View childAt = getChildAt(0);
        if (childAt != null) {
            ((ee) ((wg4) childAt)).setShowLayoutBounds(z);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z) {
        super.setTransitionGroup(z);
        this.g0 = true;
    }

    public final void setViewCompositionStrategy(ea7 ea7Var) {
        ki2 ki2Var = this.d0;
        if (ki2Var != null) {
            ki2Var.c();
        }
        this.d0 = ea7Var.a(this);
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
