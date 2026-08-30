package com.google.android.material.behavior;

import a0.j;
import a6.e1;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b4.v2;
import java.util.Iterator;
import java.util.LinkedHashSet;
import k5.a;
import k5.d;
import me.magnum.melonds.R;
import w9.b;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class HideViewOnScrollBehavior<V extends View> extends a {

    /* renamed from: a  reason: collision with root package name */
    public p7.a f2927a;

    /* renamed from: b  reason: collision with root package name */
    public AccessibilityManager f2928b;

    /* renamed from: c  reason: collision with root package name */
    public w9.a f2929c;

    /* renamed from: e  reason: collision with root package name */
    public int f2931e;

    /* renamed from: f  reason: collision with root package name */
    public int f2932f;

    /* renamed from: g  reason: collision with root package name */
    public TimeInterpolator f2933g;

    /* renamed from: h  reason: collision with root package name */
    public TimeInterpolator f2934h;

    /* renamed from: k  reason: collision with root package name */
    public ViewPropertyAnimator f2937k;

    /* renamed from: d  reason: collision with root package name */
    public final LinkedHashSet f2930d = new LinkedHashSet();

    /* renamed from: i  reason: collision with root package name */
    public int f2935i = 0;

    /* renamed from: j  reason: collision with root package name */
    public int f2936j = 2;

    public HideViewOnScrollBehavior() {
    }

    @Override // k5.a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i2) {
        int i10;
        if (this.f2928b == null) {
            this.f2928b = (AccessibilityManager) view.getContext().getSystemService(AccessibilityManager.class);
        }
        AccessibilityManager accessibilityManager = this.f2928b;
        if (accessibilityManager != null && this.f2929c == null) {
            w9.a aVar = new w9.a(this, view, 1);
            this.f2929c = aVar;
            accessibilityManager.addTouchExplorationStateChangeListener(aVar);
            view.addOnAttachStateChangeListener(new v2(7, this));
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i11 = ((d) view.getLayoutParams()).f7970c;
        if (i11 != 80 && i11 != 81) {
            int absoluteGravity = Gravity.getAbsoluteGravity(i11, i2);
            if (absoluteGravity != 3 && absoluteGravity != 19) {
                i10 = 0;
            } else {
                i10 = 2;
            }
            r(i10);
        } else {
            r(1);
        }
        this.f2935i = this.f2927a.n(view, marginLayoutParams);
        this.f2931e = a.a.T(view.getContext(), R.attr.motionDurationLong2, 225);
        this.f2932f = a.a.T(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.f2933g = a.a.U(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, u9.a.f13513d);
        this.f2934h = a.a.U(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, u9.a.f13512c);
        return false;
    }

    @Override // k5.a
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i2, int i10, int i11, int[] iArr) {
        if (i2 > 0) {
            if (this.f2936j != 1) {
                AccessibilityManager accessibilityManager = this.f2928b;
                if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
                    ViewPropertyAnimator viewPropertyAnimator = this.f2937k;
                    if (viewPropertyAnimator != null) {
                        viewPropertyAnimator.cancel();
                        view.clearAnimation();
                    }
                    this.f2936j = 1;
                    Iterator it = this.f2930d.iterator();
                    if (!it.hasNext()) {
                        int i12 = this.f2935i;
                        this.f2937k = this.f2927a.p(view, i12).setInterpolator(this.f2934h).setDuration(this.f2932f).setListener(new e1(6, this));
                        return;
                    }
                    throw w.d.k(it);
                }
            }
        } else if (i2 < 0) {
            s(view);
        }
    }

    @Override // k5.a
    public final boolean o(View view, int i2, int i10) {
        if (i2 == 2) {
            return true;
        }
        return false;
    }

    public final void r(int i2) {
        p7.a aVar = this.f2927a;
        if (aVar != null && aVar.o() == i2) {
            return;
        }
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    this.f2927a = new b(1);
                    return;
                } else {
                    j.h(w.d.m("Invalid view edge position value: ", i2, ". Must be 0, 1 or 2."));
                    return;
                }
            }
            this.f2927a = new b(0);
            return;
        }
        this.f2927a = new b(2);
    }

    public final void s(View view) {
        if (this.f2936j == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f2937k;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.f2936j = 2;
        Iterator it = this.f2930d.iterator();
        if (!it.hasNext()) {
            this.f2927a.getClass();
            this.f2937k = this.f2927a.p(view, 0).setInterpolator(this.f2933g).setDuration(this.f2931e).setListener(new e1(6, this));
            return;
        }
        throw w.d.k(it);
    }

    public HideViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
