package com.google.android.material.sidesheet;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Property;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.stormds.emulator.R;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends e51 implements r14 {
    public ln2 a;
    public final p24 b;
    public final ColorStateList c;
    public final me6 d;
    public final k60 e;
    public final float f;
    public final boolean g;
    public int h;
    public ho7 i;
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
    public r24 t;
    public int u;
    public final LinkedHashSet v;
    public final h60 w;

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        this.e = new k60(this);
        this.g = true;
        this.h = 5;
        this.k = 0.1f;
        this.r = -1;
        this.v = new LinkedHashSet();
        this.w = new h60(this, 1);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a75.z);
        if (obtainStyledAttributes.hasValue(3)) {
            this.c = np2.S(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(6)) {
            this.d = me6.b(context, attributeSet, 0, 2132018305).a();
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
        me6 me6Var = this.d;
        if (me6Var != null) {
            p24 p24Var = new p24(me6Var);
            this.b = p24Var;
            p24Var.k(context);
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

    @Override // defpackage.r14
    public final void a() {
        final View view;
        boolean z;
        boolean z2;
        int i;
        final ViewGroup.MarginLayoutParams marginLayoutParams;
        r24 r24Var = this.t;
        if (r24Var == null) {
            return;
        }
        b00 b00Var = r24Var.f;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = null;
        r24Var.f = null;
        int i2 = 5;
        if (b00Var != null && Build.VERSION.SDK_INT >= 34) {
            ln2 ln2Var = this.a;
            if (ln2Var != null && ln2Var.B() != 0) {
                i2 = 3;
            }
            s7 s7Var = new s7(this, 7);
            WeakReference weakReference = this.q;
            if (weakReference != null) {
                view = (View) weakReference.get();
            } else {
                view = null;
            }
            if (view != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams()) != null) {
                final int s = this.a.s(marginLayoutParams);
                animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: nh6
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        SideSheetBehavior.this.a.g0(marginLayoutParams, vo.c(valueAnimator.getAnimatedFraction(), s, 0));
                        view.requestLayout();
                    }
                };
            }
            View view2 = r24Var.b;
            if (b00Var.d == 0) {
                z = true;
            } else {
                z = false;
            }
            if ((Gravity.getAbsoluteGravity(i2, view2.getLayoutDirection()) & 3) == 3) {
                z2 = true;
            } else {
                z2 = false;
            }
            float scaleX = view2.getScaleX() * view2.getWidth();
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
                if (z2) {
                    i = marginLayoutParams2.leftMargin;
                } else {
                    i = marginLayoutParams2.rightMargin;
                }
            } else {
                i = 0;
            }
            float f = scaleX + i;
            Property property = View.TRANSLATION_X;
            if (z2) {
                f = -f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, property, f);
            if (animatorUpdateListener != null) {
                ofFloat.addUpdateListener(animatorUpdateListener);
            }
            ofFloat.setInterpolator(new q92(1));
            ofFloat.setDuration(vo.c(b00Var.c, r24Var.c, r24Var.d));
            ofFloat.addListener(new q24(r24Var, z, i2));
            ofFloat.addListener(s7Var);
            ofFloat.start();
            return;
        }
        v(5);
    }

    @Override // defpackage.r14
    public final void b(b00 b00Var) {
        int i;
        View view;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        boolean z;
        r24 r24Var = this.t;
        if (r24Var != null) {
            ln2 ln2Var = this.a;
            if (ln2Var != null && ln2Var.B() != 0) {
                i = 3;
            } else {
                i = 5;
            }
            if (r24Var.f == null) {
                Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
            }
            b00 b00Var2 = r24Var.f;
            r24Var.f = b00Var;
            if (b00Var2 != null) {
                if (b00Var.d == 0) {
                    z = true;
                } else {
                    z = false;
                }
                r24Var.a(b00Var.c, i, z);
            }
            WeakReference weakReference = this.p;
            if (weakReference != null && weakReference.get() != null) {
                View view2 = (View) this.p.get();
                WeakReference weakReference2 = this.q;
                if (weakReference2 != null) {
                    view = (View) weakReference2.get();
                } else {
                    view = null;
                }
                if (view != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams()) != null) {
                    this.a.g0(marginLayoutParams, (int) ((view2.getScaleX() * this.l) + this.o));
                    view.requestLayout();
                }
            }
        }
    }

    @Override // defpackage.r14
    public final void c(b00 b00Var) {
        r24 r24Var = this.t;
        if (r24Var == null) {
            return;
        }
        r24Var.f = b00Var;
    }

    @Override // defpackage.r14
    public final void d() {
        r24 r24Var = this.t;
        if (r24Var != null) {
            View view = r24Var.b;
            if (r24Var.f == null) {
                Log.w("MaterialBackHelper", "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
            }
            b00 b00Var = r24Var.f;
            r24Var.f = null;
            if (b00Var == null) {
                return;
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ObjectAnimator.ofFloat(view, View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(view, View.SCALE_Y, 1.0f));
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i), View.SCALE_Y, 1.0f));
                }
            }
            animatorSet.setDuration(r24Var.e);
            animatorSet.start();
        }
    }

    @Override // defpackage.e51
    public final void g(h51 h51Var) {
        this.p = null;
        this.i = null;
        this.t = null;
    }

    @Override // defpackage.e51
    public final void i() {
        this.p = null;
        this.i = null;
        this.t = null;
    }

    @Override // defpackage.e51
    public final boolean j(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        ho7 ho7Var;
        VelocityTracker velocityTracker;
        if ((view.isShown() || ao7.f(view) != null) && this.g) {
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
                this.u = (int) motionEvent.getX();
            }
            if (!this.j && (ho7Var = this.i) != null && ho7Var.p(motionEvent)) {
                return true;
            }
            return false;
        }
        this.j = true;
        return false;
    }

    @Override // defpackage.e51
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, int i) {
        int i2;
        View view2;
        View view3;
        int i3;
        int y;
        int i4;
        View findViewById;
        int i5;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        WeakReference weakReference = this.p;
        p24 p24Var = this.b;
        if (weakReference == null) {
            this.p = new WeakReference(view);
            this.t = new r24(view);
            if (p24Var != null) {
                view.setBackground(p24Var);
                float f = this.f;
                if (f == -1.0f) {
                    f = view.getElevation();
                }
                p24Var.m(f);
            } else {
                ColorStateList colorStateList = this.c;
                if (colorStateList != null) {
                    WeakHashMap weakHashMap = ao7.a;
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
            z();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            if (ao7.f(view) == null) {
                ao7.o(view, view.getResources().getString(R.string.side_sheet_accessibility_pane_title));
            }
        }
        if (Gravity.getAbsoluteGravity(((h51) view.getLayoutParams()).c, i) == 3) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        ln2 ln2Var = this.a;
        if (ln2Var == null || ln2Var.B() != i2) {
            h51 h51Var = null;
            me6 me6Var = this.d;
            if (i2 == 0) {
                this.a = new ct3(this, 1);
                if (me6Var != null) {
                    WeakReference weakReference2 = this.p;
                    if (weakReference2 != null && (view3 = (View) weakReference2.get()) != null && (view3.getLayoutParams() instanceof h51)) {
                        h51Var = (h51) view3.getLayoutParams();
                    }
                    if (h51Var == null || ((ViewGroup.MarginLayoutParams) h51Var).rightMargin <= 0) {
                        le6 f2 = me6Var.f();
                        f2.f = new t(RecyclerView.B1);
                        f2.g = new t(RecyclerView.B1);
                        me6 a = f2.a();
                        if (p24Var != null) {
                            p24Var.setShapeAppearanceModel(a);
                        }
                    }
                }
            } else if (i2 == 1) {
                this.a = new ct3(this, 0);
                if (me6Var != null) {
                    WeakReference weakReference3 = this.p;
                    if (weakReference3 != null && (view2 = (View) weakReference3.get()) != null && (view2.getLayoutParams() instanceof h51)) {
                        h51Var = (h51) view2.getLayoutParams();
                    }
                    if (h51Var == null || ((ViewGroup.MarginLayoutParams) h51Var).leftMargin <= 0) {
                        le6 f3 = me6Var.f();
                        f3.e = new t(RecyclerView.B1);
                        f3.h = new t(RecyclerView.B1);
                        me6 a2 = f3.a();
                        if (p24Var != null) {
                            p24Var.setShapeAppearanceModel(a2);
                        }
                    }
                }
            } else {
                i.h(lb1.k("Invalid sheet edge position value: ", i2, ". Must be 0 or 1."));
                return false;
            }
        }
        if (this.i == null) {
            this.i = new ho7(coordinatorLayout.getContext(), coordinatorLayout, this.w);
        }
        int y2 = this.a.y(view);
        coordinatorLayout.q(view, i);
        this.m = coordinatorLayout.getWidth();
        this.n = this.a.z(coordinatorLayout);
        this.l = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (marginLayoutParams != null) {
            i3 = this.a.i(marginLayoutParams);
        } else {
            i3 = 0;
        }
        this.o = i3;
        int i6 = this.h;
        if (i6 != 1 && i6 != 2) {
            if (i6 != 3) {
                if (i6 == 5) {
                    y = this.a.v();
                } else {
                    throw new IllegalStateException("Unexpected value: " + this.h);
                }
            } else {
                y = 0;
            }
        } else {
            y = y2 - this.a.y(view);
        }
        WeakHashMap weakHashMap2 = ao7.a;
        view.offsetLeftAndRight(y);
        if (this.q == null && (i4 = this.r) != -1 && (findViewById = coordinatorLayout.findViewById(i4)) != null) {
            this.q = new WeakReference(findViewById);
        }
        for (Object obj : this.v) {
            if (obj != null) {
                u34.a();
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.e51
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override // defpackage.e51
    public final void q(View view, Parcelable parcelable) {
        int i = ((oh6) parcelable).L;
        this.h = (i == 1 || i == 2) ? 5 : 5;
    }

    @Override // defpackage.e51
    public final Parcelable r(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new oh6(this);
    }

    @Override // defpackage.e51
    public final boolean u(View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.h == 1 && actionMasked == 0) {
            return true;
        }
        if (x()) {
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
        if (x() && actionMasked == 2 && !this.j && x()) {
            float abs = Math.abs(this.u - motionEvent.getX());
            ho7 ho7Var = this.i;
            if (abs > ho7Var.b) {
                ho7Var.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.j;
    }

    public final void v(int i) {
        String str;
        if (i != 1 && i != 2) {
            WeakReference weakReference = this.p;
            if (weakReference != null && weakReference.get() != null) {
                View view = (View) this.p.get();
                om omVar = new om(this, i, 6);
                ViewParent parent = view.getParent();
                if (parent != null && parent.isLayoutRequested() && view.isAttachedToWindow()) {
                    view.post(omVar);
                    return;
                } else {
                    omVar.run();
                    return;
                }
            }
            w(i);
            return;
        }
        StringBuilder sb = new StringBuilder("STATE_");
        if (i == 1) {
            str = "DRAGGING";
        } else {
            str = "SETTLING";
        }
        throw new IllegalArgumentException(i61.n(sb, str, " should not be set externally."));
    }

    public final void w(int i) {
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
            Iterator it = this.v.iterator();
            if (!it.hasNext()) {
                z();
                return;
            }
            throw i61.j(it);
        }
    }

    public final boolean x() {
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
        w(2);
        r2.e.a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0054, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(View view, int i, boolean z) {
        int u;
        if (i != 3) {
            if (i == 5) {
                u = this.a.v();
            } else {
                i.h(lb1.g(i, "Invalid state to get outer edge offset: "));
                return;
            }
        } else {
            u = this.a.u();
        }
        ho7 ho7Var = this.i;
        if (ho7Var != null) {
            if (!z) {
                int top = view.getTop();
                ho7Var.r = view;
                ho7Var.c = -1;
                boolean h = ho7Var.h(u, top, 0, 0);
                if (!h && ho7Var.a == 0 && ho7Var.r != null) {
                    ho7Var.r = null;
                }
            }
        }
        w(i);
    }

    public final void z() {
        View view;
        WeakReference weakReference = this.p;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            ao7.k(view, 262144);
            ao7.i(view, 0);
            ao7.k(view, 1048576);
            ao7.i(view, 0);
            if (this.h != 5) {
                ao7.l(view, p2.l, new f3() { // from class: mh6
                    @Override // defpackage.f3
                    public final boolean c(View view2) {
                        SideSheetBehavior.this.v(r2);
                        return true;
                    }
                });
            }
            if (this.h != 3) {
                ao7.l(view, p2.j, new f3() { // from class: mh6
                    @Override // defpackage.f3
                    public final boolean c(View view2) {
                        SideSheetBehavior.this.v(r2);
                        return true;
                    }
                });
            }
        }
    }

    public SideSheetBehavior() {
        this.e = new k60(this);
        this.g = true;
        this.h = 5;
        this.k = 0.1f;
        this.r = -1;
        this.v = new LinkedHashSet();
        this.w = new h60(this, 1);
    }
}
