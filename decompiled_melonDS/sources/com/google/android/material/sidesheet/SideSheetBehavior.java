package com.google.android.material.sidesheet;

import a6.p0;
import a6.x0;
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
import b4.a2;
import b6.q;
import com.google.android.material.sidesheet.SideSheetBehavior;
import j6.d;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import k5.a;
import k7.w;
import m9.o;
import me.magnum.melonds.R;
import na.j;
import na.m;
import na.n;
import oa.c;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends a {

    /* renamed from: a  reason: collision with root package name */
    public ij.a f3079a;

    /* renamed from: b  reason: collision with root package name */
    public final j f3080b;

    /* renamed from: c  reason: collision with root package name */
    public final ColorStateList f3081c;

    /* renamed from: d  reason: collision with root package name */
    public final n f3082d;

    /* renamed from: e  reason: collision with root package name */
    public final a2 f3083e;

    /* renamed from: f  reason: collision with root package name */
    public final float f3084f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f3085g;

    /* renamed from: h  reason: collision with root package name */
    public int f3086h;

    /* renamed from: i  reason: collision with root package name */
    public d f3087i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f3088j;

    /* renamed from: k  reason: collision with root package name */
    public final float f3089k;

    /* renamed from: l  reason: collision with root package name */
    public int f3090l;
    public int m;

    /* renamed from: n  reason: collision with root package name */
    public int f3091n;

    /* renamed from: o  reason: collision with root package name */
    public int f3092o;

    /* renamed from: p  reason: collision with root package name */
    public WeakReference f3093p;

    /* renamed from: q  reason: collision with root package name */
    public WeakReference f3094q;

    /* renamed from: r  reason: collision with root package name */
    public final int f3095r;

    /* renamed from: s  reason: collision with root package name */
    public VelocityTracker f3096s;

    /* renamed from: t  reason: collision with root package name */
    public int f3097t;

    /* renamed from: u  reason: collision with root package name */
    public final LinkedHashSet f3098u;

    /* renamed from: v  reason: collision with root package name */
    public final c f3099v;

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        this.f3083e = new a2(this);
        this.f3085g = true;
        this.f3086h = 5;
        this.f3089k = 0.1f;
        this.f3095r = -1;
        this.f3098u = new LinkedHashSet();
        this.f3099v = new c(this, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t9.a.f13174z);
        if (obtainStyledAttributes.hasValue(3)) {
            this.f3081c = w.m(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(6)) {
            this.f3082d = n.b(context, attributeSet, 0, 2131952742).a();
        }
        if (obtainStyledAttributes.hasValue(5)) {
            int resourceId = obtainStyledAttributes.getResourceId(5, -1);
            this.f3095r = resourceId;
            WeakReference weakReference = this.f3094q;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f3094q = null;
            WeakReference weakReference2 = this.f3093p;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1 && view.isLaidOut()) {
                    view.requestLayout();
                }
            }
        }
        n nVar = this.f3082d;
        if (nVar != null) {
            j jVar = new j(nVar);
            this.f3080b = jVar;
            jVar.k(context);
            ColorStateList colorStateList = this.f3081c;
            if (colorStateList != null) {
                this.f3080b.n(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(16842801, typedValue, true);
                this.f3080b.setTint(typedValue.data);
            }
        }
        this.f3084f = obtainStyledAttributes.getDimension(2, -1.0f);
        this.f3085g = obtainStyledAttributes.getBoolean(4, true);
        obtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    @Override // k5.a
    public final void c(k5.d dVar) {
        this.f3093p = null;
        this.f3087i = null;
    }

    @Override // k5.a
    public final void e() {
        this.f3093p = null;
        this.f3087i = null;
    }

    @Override // k5.a
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        d dVar;
        VelocityTracker velocityTracker;
        if ((view.isShown() || x0.f(view) != null) && this.f3085g) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0 && (velocityTracker = this.f3096s) != null) {
                velocityTracker.recycle();
                this.f3096s = null;
            }
            if (this.f3096s == null) {
                this.f3096s = VelocityTracker.obtain();
            }
            this.f3096s.addMovement(motionEvent);
            if (actionMasked != 0) {
                if ((actionMasked == 1 || actionMasked == 3) && this.f3088j) {
                    this.f3088j = false;
                    return false;
                }
            } else {
                this.f3097t = (int) motionEvent.getX();
            }
            if (!this.f3088j && (dVar = this.f3087i) != null && dVar.p(motionEvent)) {
                return true;
            }
            return false;
        }
        this.f3088j = true;
        return false;
    }

    @Override // k5.a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i2) {
        int i10;
        View view2;
        View view3;
        int i11;
        int W;
        int i12;
        View findViewById;
        int i13;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        WeakReference weakReference = this.f3093p;
        j jVar = this.f3080b;
        if (weakReference == null) {
            this.f3093p = new WeakReference(view);
            new PathInterpolator(0.1f, 0.1f, 0.0f, 1.0f);
            Context context = view.getContext();
            a.a.T(context, R.attr.motionDurationMedium2, 300);
            a.a.T(context, R.attr.motionDurationShort3, 150);
            a.a.T(context, R.attr.motionDurationShort2, 100);
            Resources resources = view.getResources();
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_shrink);
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_grow);
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_y_distance);
            if (jVar != null) {
                view.setBackground(jVar);
                float f8 = this.f3084f;
                if (f8 == -1.0f) {
                    f8 = view.getElevation();
                }
                jVar.m(f8);
            } else {
                ColorStateList colorStateList = this.f3081c;
                if (colorStateList != null) {
                    WeakHashMap weakHashMap = x0.f533a;
                    p0.h(view, colorStateList);
                }
            }
            if (this.f3086h == 5) {
                i13 = 4;
            } else {
                i13 = 0;
            }
            if (view.getVisibility() != i13) {
                view.setVisibility(i13);
            }
            u();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            if (x0.f(view) == null) {
                x0.p(view, view.getResources().getString(R.string.side_sheet_accessibility_pane_title));
            }
        }
        if (Gravity.getAbsoluteGravity(((k5.d) view.getLayoutParams()).f7970c, i2) == 3) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        ij.a aVar = this.f3079a;
        if (aVar == null || aVar.d0() != i10) {
            k5.d dVar = null;
            n nVar = this.f3082d;
            if (i10 == 0) {
                this.f3079a = new oa.a(this, 1);
                if (nVar != null) {
                    WeakReference weakReference2 = this.f3093p;
                    if (weakReference2 != null && (view3 = (View) weakReference2.get()) != null && (view3.getLayoutParams() instanceof k5.d)) {
                        dVar = (k5.d) view3.getLayoutParams();
                    }
                    if (dVar == null || ((ViewGroup.MarginLayoutParams) dVar).rightMargin <= 0) {
                        m f10 = nVar.f();
                        f10.f10191f = new na.a(0.0f);
                        f10.f10192g = new na.a(0.0f);
                        n a10 = f10.a();
                        if (jVar != null) {
                            jVar.setShapeAppearanceModel(a10);
                        }
                    }
                }
            } else if (i10 == 1) {
                this.f3079a = new oa.a(this, 0);
                if (nVar != null) {
                    WeakReference weakReference3 = this.f3093p;
                    if (weakReference3 != null && (view2 = (View) weakReference3.get()) != null && (view2.getLayoutParams() instanceof k5.d)) {
                        dVar = (k5.d) view2.getLayoutParams();
                    }
                    if (dVar == null || ((ViewGroup.MarginLayoutParams) dVar).leftMargin <= 0) {
                        m f11 = nVar.f();
                        f11.f10190e = new na.a(0.0f);
                        f11.f10193h = new na.a(0.0f);
                        n a11 = f11.a();
                        if (jVar != null) {
                            jVar.setShapeAppearanceModel(a11);
                        }
                    }
                }
            } else {
                a0.j.h(w.d.m("Invalid sheet edge position value: ", i10, ". Must be 0 or 1."));
                return false;
            }
        }
        if (this.f3087i == null) {
            this.f3087i = new d(coordinatorLayout.getContext(), coordinatorLayout, this.f3099v);
        }
        int W2 = this.f3079a.W(view);
        coordinatorLayout.q(view, i2);
        this.m = coordinatorLayout.getWidth();
        this.f3091n = this.f3079a.X(coordinatorLayout);
        this.f3090l = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (marginLayoutParams != null) {
            i11 = this.f3079a.y(marginLayoutParams);
        } else {
            i11 = 0;
        }
        this.f3092o = i11;
        int i14 = this.f3086h;
        if (i14 != 1 && i14 != 2) {
            if (i14 != 3) {
                if (i14 == 5) {
                    W = this.f3079a.S();
                } else {
                    throw new IllegalStateException("Unexpected value: " + this.f3086h);
                }
            } else {
                W = 0;
            }
        } else {
            W = W2 - this.f3079a.W(view);
        }
        WeakHashMap weakHashMap2 = x0.f533a;
        view.offsetLeftAndRight(W);
        if (this.f3094q == null && (i12 = this.f3095r) != -1 && (findViewById = coordinatorLayout.findViewById(i12)) != null) {
            this.f3094q = new WeakReference(findViewById);
        }
        for (Object obj : this.f3098u) {
            if (obj != null) {
                o.b();
                return false;
            }
        }
        return true;
    }

    @Override // k5.a
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i2, int i10, int i11) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i2, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i10, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i11, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override // k5.a
    public final void m(View view, Parcelable parcelable) {
        int i2 = ((oa.d) parcelable).L;
        this.f3086h = (i2 == 1 || i2 == 2) ? 5 : 5;
    }

    @Override // k5.a
    public final Parcelable n(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new oa.d(this);
    }

    @Override // k5.a
    public final boolean q(View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f3086h == 1 && actionMasked == 0) {
            return true;
        }
        if (s()) {
            this.f3087i.j(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.f3096s) != null) {
            velocityTracker.recycle();
            this.f3096s = null;
        }
        if (this.f3096s == null) {
            this.f3096s = VelocityTracker.obtain();
        }
        this.f3096s.addMovement(motionEvent);
        if (s() && actionMasked == 2 && !this.f3088j && s()) {
            float abs = Math.abs(this.f3097t - motionEvent.getX());
            d dVar = this.f3087i;
            if (abs > dVar.f7467b) {
                dVar.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f3088j;
    }

    public final void r(int i2) {
        View view;
        int i10;
        if (this.f3086h != i2) {
            this.f3086h = i2;
            WeakReference weakReference = this.f3093p;
            if (weakReference == null || (view = (View) weakReference.get()) == null) {
                return;
            }
            if (this.f3086h == 5) {
                i10 = 4;
            } else {
                i10 = 0;
            }
            if (view.getVisibility() != i10) {
                view.setVisibility(i10);
            }
            Iterator it = this.f3098u.iterator();
            if (!it.hasNext()) {
                u();
                return;
            }
            throw w.d.k(it);
        }
    }

    public final boolean s() {
        if (this.f3087i != null) {
            if (this.f3085g || this.f3086h == 1) {
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
        r2.f3083e.a(r4);
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
            ij.a r0 = r2.f3079a
            int r0 = r0.S()
            goto L1d
        Ld:
            java.lang.String r3 = "Invalid state to get outer edge offset: "
            java.lang.String r3 = w.d.l(r4, r3)
            a0.j.h(r3)
            return
        L17:
            ij.a r0 = r2.f3079a
            int r0 = r0.R()
        L1d:
            j6.d r1 = r2.f3087i
            if (r1 == 0) goto L55
            if (r5 == 0) goto L2e
            int r3 = r3.getTop()
            boolean r3 = r1.o(r0, r3)
            if (r3 == 0) goto L55
            goto L4b
        L2e:
            int r5 = r3.getTop()
            r1.f7482r = r3
            r3 = -1
            r1.f7468c = r3
            r3 = 0
            boolean r3 = r1.h(r0, r5, r3, r3)
            if (r3 != 0) goto L49
            int r5 = r1.f7466a
            if (r5 != 0) goto L49
            android.view.View r5 = r1.f7482r
            if (r5 == 0) goto L49
            r5 = 0
            r1.f7482r = r5
        L49:
            if (r3 == 0) goto L55
        L4b:
            r3 = 2
            r2.r(r3)
            b4.a2 r3 = r2.f3083e
            r3.a(r4)
            return
        L55:
            r2.r(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.sidesheet.SideSheetBehavior.t(android.view.View, int, boolean):void");
    }

    public final void u() {
        View view;
        WeakReference weakReference = this.f3093p;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            x0.l(view, 262144);
            x0.i(view, 0);
            x0.l(view, 1048576);
            x0.i(view, 0);
            if (this.f3086h != 5) {
                x0.m(view, b6.d.f2063l, new q() { // from class: oa.b
                    @Override // b6.q
                    public final boolean c(View view2) {
                        String str;
                        int i2 = r2;
                        if (i2 != 1 && i2 != 2) {
                            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                            WeakReference weakReference2 = sideSheetBehavior.f3093p;
                            if (weakReference2 != null && weakReference2.get() != null) {
                                View view3 = (View) sideSheetBehavior.f3093p.get();
                                d2.d dVar = new d2.d(i2, 2, sideSheetBehavior);
                                ViewParent parent = view3.getParent();
                                if (parent != null && parent.isLayoutRequested() && view3.isAttachedToWindow()) {
                                    view3.post(dVar);
                                    return true;
                                }
                                dVar.run();
                                return true;
                            }
                            sideSheetBehavior.r(i2);
                            return true;
                        }
                        StringBuilder sb2 = new StringBuilder("STATE_");
                        if (i2 == 1) {
                            str = "DRAGGING";
                        } else {
                            str = "SETTLING";
                        }
                        throw new IllegalArgumentException(w.d.s(sb2, str, " should not be set externally."));
                    }
                });
            }
            if (this.f3086h != 3) {
                x0.m(view, b6.d.f2061j, new q() { // from class: oa.b
                    @Override // b6.q
                    public final boolean c(View view2) {
                        String str;
                        int i2 = r2;
                        if (i2 != 1 && i2 != 2) {
                            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                            WeakReference weakReference2 = sideSheetBehavior.f3093p;
                            if (weakReference2 != null && weakReference2.get() != null) {
                                View view3 = (View) sideSheetBehavior.f3093p.get();
                                d2.d dVar = new d2.d(i2, 2, sideSheetBehavior);
                                ViewParent parent = view3.getParent();
                                if (parent != null && parent.isLayoutRequested() && view3.isAttachedToWindow()) {
                                    view3.post(dVar);
                                    return true;
                                }
                                dVar.run();
                                return true;
                            }
                            sideSheetBehavior.r(i2);
                            return true;
                        }
                        StringBuilder sb2 = new StringBuilder("STATE_");
                        if (i2 == 1) {
                            str = "DRAGGING";
                        } else {
                            str = "SETTLING";
                        }
                        throw new IllegalArgumentException(w.d.s(sb2, str, " should not be set externally."));
                    }
                });
            }
        }
    }

    public SideSheetBehavior() {
        this.f3083e = new a2(this);
        this.f3085g = true;
        this.f3086h = 5;
        this.f3089k = 0.1f;
        this.f3095r = -1;
        this.f3098u = new LinkedHashSet();
        this.f3099v = new c(this, 0);
    }
}
