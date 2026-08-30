package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public class HideViewOnScrollBehavior<V extends View> extends w11 {
    public jk2 a;
    public AccessibilityManager b;
    public hr2 c;
    public int e;
    public int f;
    public TimeInterpolator g;
    public TimeInterpolator h;
    public ViewPropertyAnimator k;
    public final LinkedHashSet d = new LinkedHashSet();
    public int i = 0;
    public int j = 2;

    public HideViewOnScrollBehavior() {
    }

    @Override // defpackage.w11
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        int i2;
        if (this.b == null) {
            this.b = (AccessibilityManager) view.getContext().getSystemService(AccessibilityManager.class);
        }
        AccessibilityManager accessibilityManager = this.b;
        if (accessibilityManager != null && this.c == null) {
            hr2 hr2Var = new hr2(this, view, 1);
            this.c = hr2Var;
            accessibilityManager.addTouchExplorationStateChangeListener(hr2Var);
            view.addOnAttachStateChangeListener(new kh(5, this));
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i3 = ((z11) view.getLayoutParams()).c;
        if (i3 != 80 && i3 != 81) {
            int absoluteGravity = Gravity.getAbsoluteGravity(i3, i);
            if (absoluteGravity != 3 && absoluteGravity != 19) {
                i2 = 0;
            } else {
                i2 = 2;
            }
            r(i2);
        } else {
            r(1);
        }
        this.i = this.a.B(view, marginLayoutParams);
        this.e = me2.M(view.getContext(), R.attr.motionDurationLong2, 225);
        this.f = me2.M(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.g = me2.N(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, jo.d);
        this.h = me2.N(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, jo.c);
        return false;
    }

    @Override // defpackage.w11
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        if (i > 0) {
            if (this.j != 1) {
                AccessibilityManager accessibilityManager = this.b;
                if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
                    ViewPropertyAnimator viewPropertyAnimator = this.k;
                    if (viewPropertyAnimator != null) {
                        viewPropertyAnimator.cancel();
                        view.clearAnimation();
                    }
                    this.j = 1;
                    Iterator it = this.d.iterator();
                    if (!it.hasNext()) {
                        int i4 = this.i;
                        this.k = this.a.F(view, i4).setInterpolator(this.h).setDuration(this.f).setListener(new r7(4, this));
                        return;
                    }
                    throw b31.m(it);
                }
            }
        } else if (i < 0) {
            s(view);
        }
    }

    @Override // defpackage.w11
    public final boolean o(View view, int i, int i2) {
        if (i == 2) {
            return true;
        }
        return false;
    }

    public final void r(int i) {
        jk2 jk2Var = this.a;
        if (jk2Var != null && jk2Var.E() == i) {
            return;
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    this.a = new ir2(1);
                    return;
                } else {
                    i.i(wh1.j("Invalid view edge position value: ", i, ". Must be 0, 1 or 2."));
                    return;
                }
            }
            this.a = new ir2(0);
            return;
        }
        this.a = new ir2(2);
    }

    public final void s(View view) {
        if (this.j == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.k;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.j = 2;
        Iterator it = this.d.iterator();
        if (!it.hasNext()) {
            this.a.getClass();
            this.k = this.a.F(view, 0).setInterpolator(this.g).setDuration(this.e).setListener(new r7(4, this));
            return;
        }
        throw b31.m(it);
    }

    public HideViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
