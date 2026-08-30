package com.google.android.material.behavior;

import a6.e1;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b4.v2;
import java.util.Iterator;
import java.util.LinkedHashSet;
import k5.a;
import me.magnum.melonds.R;
import w.d;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
@Deprecated
/* loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends a {

    /* renamed from: b  reason: collision with root package name */
    public int f2917b;

    /* renamed from: c  reason: collision with root package name */
    public int f2918c;

    /* renamed from: d  reason: collision with root package name */
    public TimeInterpolator f2919d;

    /* renamed from: e  reason: collision with root package name */
    public TimeInterpolator f2920e;

    /* renamed from: g  reason: collision with root package name */
    public AccessibilityManager f2922g;

    /* renamed from: h  reason: collision with root package name */
    public w9.a f2923h;

    /* renamed from: k  reason: collision with root package name */
    public ViewPropertyAnimator f2926k;

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashSet f2916a = new LinkedHashSet();

    /* renamed from: f  reason: collision with root package name */
    public int f2921f = 0;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f2924i = true;

    /* renamed from: j  reason: collision with root package name */
    public int f2925j = 2;

    public HideBottomViewOnScrollBehavior() {
    }

    @Override // k5.a
    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i2) {
        this.f2921f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f2917b = a.a.T(view.getContext(), R.attr.motionDurationLong2, 225);
        this.f2918c = a.a.T(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.f2919d = a.a.U(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, u9.a.f13513d);
        this.f2920e = a.a.U(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, u9.a.f13512c);
        if (this.f2922g == null) {
            this.f2922g = (AccessibilityManager) view.getContext().getSystemService(AccessibilityManager.class);
        }
        AccessibilityManager accessibilityManager = this.f2922g;
        if (accessibilityManager != null && this.f2923h == null) {
            w9.a aVar = new w9.a(this, view, 0);
            this.f2923h = aVar;
            accessibilityManager.addTouchExplorationStateChangeListener(aVar);
            view.addOnAttachStateChangeListener(new v2(6, this));
            return false;
        }
        return false;
    }

    @Override // k5.a
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i2, int i10, int i11, int[] iArr) {
        AccessibilityManager accessibilityManager;
        if (i2 > 0) {
            if (this.f2925j != 1) {
                if (!this.f2924i || (accessibilityManager = this.f2922g) == null || !accessibilityManager.isTouchExplorationEnabled()) {
                    ViewPropertyAnimator viewPropertyAnimator = this.f2926k;
                    if (viewPropertyAnimator != null) {
                        viewPropertyAnimator.cancel();
                        view.clearAnimation();
                    }
                    this.f2925j = 1;
                    Iterator it = this.f2916a.iterator();
                    if (!it.hasNext()) {
                        this.f2926k = view.animate().translationY(this.f2921f).setInterpolator(this.f2920e).setDuration(this.f2918c).setListener(new e1(5, this));
                        return;
                    }
                    throw d.k(it);
                }
            }
        } else if (i2 < 0) {
            r(view);
        }
    }

    @Override // k5.a
    public boolean o(View view, int i2, int i10) {
        if (i2 == 2) {
            return true;
        }
        return false;
    }

    public final void r(View view) {
        if (this.f2925j == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f2926k;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.f2925j = 2;
        Iterator it = this.f2916a.iterator();
        if (!it.hasNext()) {
            this.f2926k = view.animate().translationY(0).setInterpolator(this.f2919d).setDuration(this.f2917b).setListener(new e1(5, this));
            return;
        }
        throw d.k(it);
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
