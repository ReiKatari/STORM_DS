package com.google.android.material.behavior;

import a6.x0;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import j6.d;
import k5.a;
import rd.k;
import w9.c;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends a {

    /* renamed from: a  reason: collision with root package name */
    public d f2938a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f2939b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f2940c;

    /* renamed from: d  reason: collision with root package name */
    public int f2941d = 2;

    /* renamed from: e  reason: collision with root package name */
    public float f2942e = 0.0f;

    /* renamed from: f  reason: collision with root package name */
    public float f2943f = 0.5f;

    /* renamed from: g  reason: collision with root package name */
    public final c f2944g = new c(this);

    @Override // k5.a
    public boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z10 = this.f2939b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.f2939b = false;
            }
        } else {
            z10 = coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f2939b = z10;
        }
        if (z10) {
            if (this.f2938a == null) {
                this.f2938a = new d(coordinatorLayout.getContext(), coordinatorLayout, this.f2944g);
            }
            if (!this.f2940c && this.f2938a.p(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // k5.a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i2) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            x0.l(view, 1048576);
            x0.i(view, 0);
            if (r(view)) {
                x0.m(view, b6.d.f2063l, new k(18, this));
            }
        }
        return false;
    }

    @Override // k5.a
    public final boolean q(View view, MotionEvent motionEvent) {
        if (this.f2938a != null) {
            if (!this.f2940c || motionEvent.getActionMasked() != 3) {
                this.f2938a.j(motionEvent);
                return true;
            }
            return true;
        }
        return false;
    }

    public boolean r(View view) {
        return true;
    }
}
