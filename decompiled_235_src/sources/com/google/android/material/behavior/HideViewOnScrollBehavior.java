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
import com.stormds.emulator.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class HideViewOnScrollBehavior<V extends View> extends e51 {
    public jx2 a;
    public AccessibilityManager b;
    public ix2 c;
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

    @Override // defpackage.e51
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, int i) {
        int measuredHeight;
        int i2;
        int i3;
        if (this.b == null) {
            this.b = (AccessibilityManager) view.getContext().getSystemService(AccessibilityManager.class);
        }
        AccessibilityManager accessibilityManager = this.b;
        if (accessibilityManager != null && this.c == null) {
            ix2 ix2Var = new ix2(this, view, 1);
            this.c = ix2Var;
            accessibilityManager.addTouchExplorationStateChangeListener(ix2Var);
            view.addOnAttachStateChangeListener(new wh(this, 5));
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i4 = ((h51) view.getLayoutParams()).c;
        if (i4 != 80 && i4 != 81) {
            int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
            if (absoluteGravity != 3 && absoluteGravity != 19) {
                i3 = 0;
            } else {
                i3 = 2;
            }
            v(i3);
        } else {
            v(1);
        }
        switch (this.a.a) {
            case 0:
                measuredHeight = view.getMeasuredHeight();
                i2 = marginLayoutParams.bottomMargin;
                break;
            case 1:
                measuredHeight = view.getMeasuredWidth();
                i2 = marginLayoutParams.leftMargin;
                break;
            default:
                measuredHeight = view.getMeasuredWidth();
                i2 = marginLayoutParams.rightMargin;
                break;
        }
        this.i = measuredHeight + i2;
        this.e = kj2.W(view.getContext(), R.attr.motionDurationLong2, 225);
        this.f = kj2.W(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.g = kj2.X(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, vo.d);
        this.h = kj2.X(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, vo.c);
        return false;
    }

    @Override // defpackage.e51
    public final void o(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
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
                        this.k = this.a.u(view, i4).setInterpolator(this.h).setDuration(this.f).setListener(new s7(this, 5));
                        return;
                    }
                    throw i61.j(it);
                }
            }
        } else if (i < 0) {
            w(view);
        }
    }

    @Override // defpackage.e51
    public final boolean s(View view, int i, int i2) {
        if (i == 2) {
            return true;
        }
        return false;
    }

    public final void v(int i) {
        int i2;
        jx2 jx2Var = this.a;
        if (jx2Var != null) {
            switch (jx2Var.a) {
                case 0:
                    i2 = 1;
                    break;
                case 1:
                    i2 = 2;
                    break;
                default:
                    i2 = 0;
                    break;
            }
            if (i2 == i) {
                return;
            }
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    this.a = new jx2(1);
                    return;
                } else {
                    i.h(lb1.k("Invalid view edge position value: ", i, ". Must be 0, 1 or 2."));
                    return;
                }
            }
            this.a = new jx2(0);
            return;
        }
        this.a = new jx2(2);
    }

    public final void w(View view) {
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
            this.k = this.a.u(view, 0).setInterpolator(this.g).setDuration(this.e).setListener(new s7(this, 5));
            return;
        }
        throw i61.j(it);
    }

    public HideViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
