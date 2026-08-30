package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.LinkedHashSet;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
@Deprecated
/* loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends w11 {
    public int b;
    public int c;
    public TimeInterpolator d;
    public TimeInterpolator e;
    public AccessibilityManager g;
    public hr2 h;
    public ViewPropertyAnimator k;
    public final LinkedHashSet a = new LinkedHashSet();
    public int f = 0;
    public final boolean i = true;
    public int j = 2;

    public HideBottomViewOnScrollBehavior() {
    }

    @Override // defpackage.w11
    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.b = me2.M(view.getContext(), R.attr.motionDurationLong2, 225);
        this.c = me2.M(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.d = me2.N(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, jo.d);
        this.e = me2.N(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, jo.c);
        if (this.g == null) {
            this.g = (AccessibilityManager) view.getContext().getSystemService(AccessibilityManager.class);
        }
        AccessibilityManager accessibilityManager = this.g;
        if (accessibilityManager != null && this.h == null) {
            hr2 hr2Var = new hr2(this, view, 0);
            this.h = hr2Var;
            accessibilityManager.addTouchExplorationStateChangeListener(hr2Var);
            view.addOnAttachStateChangeListener(new kh(4, this));
        }
        return false;
    }

    @Override // defpackage.w11
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        AccessibilityManager accessibilityManager;
        if (i > 0) {
            if (this.j != 1) {
                if (!this.i || (accessibilityManager = this.g) == null || !accessibilityManager.isTouchExplorationEnabled()) {
                    ViewPropertyAnimator viewPropertyAnimator = this.k;
                    if (viewPropertyAnimator != null) {
                        viewPropertyAnimator.cancel();
                        view.clearAnimation();
                    }
                    this.j = 1;
                    Iterator it = this.a.iterator();
                    if (!it.hasNext()) {
                        this.k = view.animate().translationY(this.f).setInterpolator(this.e).setDuration(this.c).setListener(new r7(3, this));
                        return;
                    }
                    throw b31.m(it);
                }
            }
        } else if (i < 0) {
            r(view);
        }
    }

    @Override // defpackage.w11
    public boolean o(View view, int i, int i2) {
        if (i == 2) {
            return true;
        }
        return false;
    }

    public final void r(View view) {
        if (this.j == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.k;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.j = 2;
        Iterator it = this.a.iterator();
        if (!it.hasNext()) {
            this.k = view.animate().translationY(RecyclerView.A1).setInterpolator(this.d).setDuration(this.b).setListener(new r7(3, this));
            return;
        }
        throw b31.m(it);
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
