package com.google.android.material.sidesheet;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.PathInterpolator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends w11 {
    public io2 a;
    public final gv3 b;
    public final ColorStateList c;
    public final a36 d;
    public final l40 e;
    public final float f;
    public final boolean g;
    public int h;
    public ha7 i;
    public boolean j;
    public final float k;
    public int l;
    public int m;
    public int n;
    public int o;
    public WeakReference p;
    public WeakReference q;
    public final int r;
    public VelocityTracker s;
    public int t;
    public final LinkedHashSet u;
    public final j40 v;

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        this.e = new l40(this);
        this.g = true;
        this.h = 5;
        this.k = 0.1f;
        this.r = -1;
        this.u = new LinkedHashSet();
        this.v = new j40(this, 1);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ay4.z);
        if (obtainStyledAttributes.hasValue(3)) {
            this.c = nk2.C(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(6)) {
            this.d = a36.b(context, attributeSet, 0, 2132018297).a();
        }
        if (obtainStyledAttributes.hasValue(5)) {
            int resourceId = obtainStyledAttributes.getResourceId(5, -1);
            this.r = resourceId;
            WeakReference weakReference = this.q;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.q = null;
            WeakReference weakReference2 = this.p;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1 && view.isLaidOut()) {
                    view.requestLayout();
                }
            }
        }
        a36 a36Var = this.d;
        if (a36Var != null) {
            gv3 gv3Var = new gv3(a36Var);
            this.b = gv3Var;
            gv3Var.k(context);
            ColorStateList colorStateList = this.c;
            if (colorStateList != null) {
                this.b.n(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(16842801, typedValue, true);
                this.b.setTint(typedValue.data);
            }
        }
        this.f = obtainStyledAttributes.getDimension(2, -1.0f);
        this.g = obtainStyledAttributes.getBoolean(4, true);
        obtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    @Override // defpackage.w11
    public final void c(z11 z11Var) {
        this.p = null;
        this.i = null;
    }

    @Override // defpackage.w11
    public final void e() {
        this.p = null;
        this.i = null;
    }

    @Override // defpackage.w11
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        ha7 ha7Var;
        VelocityTracker velocityTracker;
        if ((view.isShown() || aa7.f(view) != null) && this.g) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0 && (velocityTracker = this.s) != null) {
                velocityTracker.recycle();
                this.s = null;
            }
            if (this.s == null) {
                this.s = VelocityTracker.obtain();
            }
            this.s.addMovement(motionEvent);
            if (actionMasked != 0) {
                if ((actionMasked == 1 || actionMasked == 3) && this.j) {
                    this.j = false;
                    return false;
                }
            } else {
                this.t = (int) motionEvent.getX();
            }
            if (!this.j && (ha7Var = this.i) != null && ha7Var.p(motionEvent)) {
                return true;
            }
            return false;
        }
        this.j = true;
        return false;
    }

    @Override // defpackage.w11
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        int i2;
        View view2;
        View view3;
        int i3;
        int G;
        int i4;
        View findViewById;
        int i5;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        WeakReference weakReference = this.p;
        gv3 gv3Var = this.b;
        if (weakReference == null) {
            this.p = new WeakReference(view);
            new PathInterpolator(0.1f, 0.1f, RecyclerView.A1, 1.0f);
            Context context = view.getContext();
            me2.M(context, R.attr.motionDurationMedium2, 300);
            me2.M(context, R.attr.motionDurationShort3, 150);
            me2.M(context, R.attr.motionDurationShort2, 100);
            Resources resources = view.getResources();
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_shrink);
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_grow);
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_y_distance);
            if (gv3Var != null) {
                view.setBackground(gv3Var);
                float f = this.f;
                if (f == -1.0f) {
                    f = view.getElevation();
                }
                gv3Var.m(f);
            } else {
                ColorStateList colorStateList = this.c;
                if (colorStateList != null) {
                    WeakHashMap weakHashMap = aa7.a;
                    view.setBackgroundTintList(colorStateList);
                }
            }
            if (this.h == 5) {
                i5 = 4;
            } else {
                i5 = 0;
            }
            if (view.getVisibility() != i5) {
                view.setVisibility(i5);
            }
            u();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            if (aa7.f(view) == null) {
                aa7.o(view, view.getResources().getString(R.string.side_sheet_accessibility_pane_title));
            }
        }
        if (Gravity.getAbsoluteGravity(((z11) view.getLayoutParams()).c, i) == 3) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        io2 io2Var = this.a;
        if (io2Var == null || io2Var.K() != i2) {
            z11 z11Var = null;
            a36 a36Var = this.d;
            if (i2 == 0) {
                this.a = new am3(this, 1);
                if (a36Var != null) {
                    WeakReference weakReference2 = this.p;
                    if (weakReference2 != null && (view3 = (View) weakReference2.get()) != null && (view3.getLayoutParams() instanceof z11)) {
                        z11Var = (z11) view3.getLayoutParams();
                    }
                    if (z11Var == null || ((ViewGroup.MarginLayoutParams) z11Var).rightMargin <= 0) {
                        z26 f2 = a36Var.f();
                        f2.f = new s(RecyclerView.A1);
                        f2.g = new s(RecyclerView.A1);
                        a36 a = f2.a();
                        if (gv3Var != null) {
                            gv3Var.setShapeAppearanceModel(a);
                        }
                    }
                }
            } else if (i2 == 1) {
                this.a = new am3(this, 0);
                if (a36Var != null) {
                    WeakReference weakReference3 = this.p;
                    if (weakReference3 != null && (view2 = (View) weakReference3.get()) != null && (view2.getLayoutParams() instanceof z11)) {
                        z11Var = (z11) view2.getLayoutParams();
                    }
                    if (z11Var == null || ((ViewGroup.MarginLayoutParams) z11Var).leftMargin <= 0) {
                        z26 f3 = a36Var.f();
                        f3.e = new s(RecyclerView.A1);
                        f3.h = new s(RecyclerView.A1);
                        a36 a2 = f3.a();
                        if (gv3Var != null) {
                            gv3Var.setShapeAppearanceModel(a2);
                        }
                    }
                }
            } else {
                i.i(wh1.j("Invalid sheet edge position value: ", i2, ". Must be 0 or 1."));
                return false;
            }
        }
        if (this.i == null) {
            this.i = new ha7(coordinatorLayout.getContext(), coordinatorLayout, this.v);
        }
        int G2 = this.a.G(view);
        coordinatorLayout.q(view, i);
        this.m = coordinatorLayout.getWidth();
        this.n = this.a.H(coordinatorLayout);
        this.l = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (marginLayoutParams != null) {
            i3 = this.a.h(marginLayoutParams);
        } else {
            i3 = 0;
        }
        this.o = i3;
        int i6 = this.h;
        if (i6 != 1 && i6 != 2) {
            if (i6 != 3) {
                if (i6 == 5) {
                    G = this.a.B();
                } else {
                    throw new IllegalStateException("Unexpected value: " + this.h);
                }
            } else {
                G = 0;
            }
        } else {
            G = G2 - this.a.G(view);
        }
        WeakHashMap weakHashMap2 = aa7.a;
        view.offsetLeftAndRight(G);
        if (this.q == null && (i4 = this.r) != -1 && (findViewById = coordinatorLayout.findViewById(i4)) != null) {
            this.q = new WeakReference(findViewById);
        }
        for (Object obj : this.u) {
            if (obj != null) {
                c44.b();
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.w11
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override // defpackage.w11
    public final void m(View view, Parcelable parcelable) {
        int i = ((a66) parcelable).L;
        this.h = (i == 1 || i == 2) ? 5 : 5;
    }

    @Override // defpackage.w11
    public final Parcelable n(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new a66(this);
    }

    @Override // defpackage.w11
    public final boolean q(View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.h == 1 && actionMasked == 0) {
            return true;
        }
        if (s()) {
            this.i.j(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.s) != null) {
            velocityTracker.recycle();
            this.s = null;
        }
        if (this.s == null) {
            this.s = VelocityTracker.obtain();
        }
        this.s.addMovement(motionEvent);
        if (s() && actionMasked == 2 && !this.j && s()) {
            float abs = Math.abs(this.t - motionEvent.getX());
            ha7 ha7Var = this.i;
            if (abs > ha7Var.b) {
                ha7Var.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.j;
    }

    public final void r(int i) {
        View view;
        int i2;
        if (this.h != i) {
            this.h = i;
            WeakReference weakReference = this.p;
            if (weakReference == null || (view = (View) weakReference.get()) == null) {
                return;
            }
            if (this.h == 5) {
                i2 = 4;
            } else {
                i2 = 0;
            }
            if (view.getVisibility() != i2) {
                view.setVisibility(i2);
            }
            Iterator it = this.u.iterator();
            if (!it.hasNext()) {
                u();
                return;
            }
            throw b31.m(it);
        }
    }

    public final boolean s() {
        if (this.i != null) {
            if (this.g || this.h == 1) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
        if (r1.o(r0, r3.getTop()) != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0049, code lost:
        if (r3 != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004b, code lost:
        r(2);
        r2.e.a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0054, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t(android.view.View r3, int r4, boolean r5) {
        /*
            r2 = this;
            r0 = 3
            if (r4 == r0) goto L17
            r0 = 5
            if (r4 != r0) goto Ld
            io2 r0 = r2.a
            int r0 = r0.B()
            goto L1d
        Ld:
            java.lang.String r2 = "Invalid state to get outer edge offset: "
            java.lang.String r2 = defpackage.wh1.g(r4, r2)
            defpackage.i.i(r2)
            return
        L17:
            io2 r0 = r2.a
            int r0 = r0.A()
        L1d:
            ha7 r1 = r2.i
            if (r1 == 0) goto L55
            if (r5 == 0) goto L2e
            int r3 = r3.getTop()
            boolean r3 = r1.o(r0, r3)
            if (r3 == 0) goto L55
            goto L4b
        L2e:
            int r5 = r3.getTop()
            r1.r = r3
            r3 = -1
            r1.c = r3
            r3 = 0
            boolean r3 = r1.h(r0, r5, r3, r3)
            if (r3 != 0) goto L49
            int r5 = r1.a
            if (r5 != 0) goto L49
            android.view.View r5 = r1.r
            if (r5 == 0) goto L49
            r5 = 0
            r1.r = r5
        L49:
            if (r3 == 0) goto L55
        L4b:
            r3 = 2
            r2.r(r3)
            l40 r2 = r2.e
            r2.a(r4)
            return
        L55:
            r2.r(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.sidesheet.SideSheetBehavior.t(android.view.View, int, boolean):void");
    }

    public final void u() {
        View view;
        WeakReference weakReference = this.p;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            aa7.k(view, 262144);
            aa7.i(view, 0);
            aa7.k(view, 1048576);
            aa7.i(view, 0);
            if (this.h != 5) {
                aa7.l(view, n2.l, new d3() { // from class: z56
                    @Override // defpackage.d3
                    public final boolean d(View view2) {
                        String str;
                        int i = r2;
                        if (i != 1 && i != 2) {
                            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                            WeakReference weakReference2 = sideSheetBehavior.p;
                            if (weakReference2 != null && weakReference2.get() != null) {
                                View view3 = (View) sideSheetBehavior.p.get();
                                cm cmVar = new cm(i, 6, sideSheetBehavior);
                                ViewParent parent = view3.getParent();
                                if (parent != null && parent.isLayoutRequested() && view3.isAttachedToWindow()) {
                                    view3.post(cmVar);
                                    return true;
                                }
                                cmVar.run();
                                return true;
                            }
                            sideSheetBehavior.r(i);
                            return true;
                        }
                        StringBuilder sb = new StringBuilder("STATE_");
                        if (i == 1) {
                            str = "DRAGGING";
                        } else {
                            str = "SETTLING";
                        }
                        throw new IllegalArgumentException(b31.q(sb, str, " should not be set externally."));
                    }
                });
            }
            if (this.h != 3) {
                aa7.l(view, n2.j, new d3() { // from class: z56
                    @Override // defpackage.d3
                    public final boolean d(View view2) {
                        String str;
                        int i = r2;
                        if (i != 1 && i != 2) {
                            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                            WeakReference weakReference2 = sideSheetBehavior.p;
                            if (weakReference2 != null && weakReference2.get() != null) {
                                View view3 = (View) sideSheetBehavior.p.get();
                                cm cmVar = new cm(i, 6, sideSheetBehavior);
                                ViewParent parent = view3.getParent();
                                if (parent != null && parent.isLayoutRequested() && view3.isAttachedToWindow()) {
                                    view3.post(cmVar);
                                    return true;
                                }
                                cmVar.run();
                                return true;
                            }
                            sideSheetBehavior.r(i);
                            return true;
                        }
                        StringBuilder sb = new StringBuilder("STATE_");
                        if (i == 1) {
                            str = "DRAGGING";
                        } else {
                            str = "SETTLING";
                        }
                        throw new IllegalArgumentException(b31.q(sb, str, " should not be set externally."));
                    }
                });
            }
        }
    }

    public SideSheetBehavior() {
        this.e = new l40(this);
        this.g = true;
        this.h = 5;
        this.k = 0.1f;
        this.r = -1;
        this.u = new LinkedHashSet();
        this.v = new j40(this, 1);
    }
}
