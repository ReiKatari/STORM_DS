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
import com.stormds.emulator.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@Deprecated
/* loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends e51 {
    public int b;
    public int c;
    public TimeInterpolator d;
    public TimeInterpolator e;
    public AccessibilityManager g;
    public ix2 h;
    public ViewPropertyAnimator k;
    public final LinkedHashSet a = new LinkedHashSet();
    public int f = 0;
    public final boolean i = true;
    public int j = 2;

    public HideBottomViewOnScrollBehavior() {
    }

    @Override // defpackage.e51
    public boolean k(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.b = kj2.W(view.getContext(), R.attr.motionDurationLong2, 225);
        this.c = kj2.W(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.d = kj2.X(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, vo.d);
        this.e = kj2.X(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, vo.c);
        if (this.g == null) {
            this.g = (AccessibilityManager) view.getContext().getSystemService(AccessibilityManager.class);
        }
        AccessibilityManager accessibilityManager = this.g;
        if (accessibilityManager != null && this.h == null) {
            ix2 ix2Var = new ix2(this, view, 0);
            this.h = ix2Var;
            accessibilityManager.addTouchExplorationStateChangeListener(ix2Var);
            view.addOnAttachStateChangeListener(new wh(this, 4));
        }
        return false;
    }

    @Override // defpackage.e51
    public final void o(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
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
                        this.k = view.animate().translationY(this.f).setInterpolator(this.e).setDuration(this.c).setListener(new s7(this, 4));
                        return;
                    }
                    throw i61.j(it);
                }
            }
        } else if (i < 0) {
            v(view);
        }
    }

    @Override // defpackage.e51
    public boolean s(View view, int i, int i2) {
        if (i == 2) {
            return true;
        }
        return false;
    }

    public final void v(View view) {
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
            this.k = view.animate().translationY(RecyclerView.B1).setInterpolator(this.d).setDuration(this.b).setListener(new s7(this, 4));
            return;
        }
        throw i61.j(it);
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
