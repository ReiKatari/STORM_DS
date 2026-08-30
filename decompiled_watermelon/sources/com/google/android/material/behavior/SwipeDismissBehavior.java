package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends w11 {
    public ha7 a;
    public boolean b;
    public boolean c;
    public int d = 2;
    public float e = RecyclerView.A1;
    public float f = 0.5f;
    public final vk6 g = new vk6(this);

    @Override // defpackage.w11
    public boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z = this.b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.b = false;
            }
        } else {
            z = coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.b = z;
        }
        if (z) {
            if (this.a == null) {
                this.a = new ha7(coordinatorLayout.getContext(), coordinatorLayout, this.g);
            }
            if (!this.c && this.a.p(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.w11
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            aa7.k(view, 1048576);
            aa7.i(view, 0);
            if (r(view)) {
                aa7.l(view, n2.l, new dz4(this));
            }
        }
        return false;
    }

    @Override // defpackage.w11
    public final boolean q(View view, MotionEvent motionEvent) {
        if (this.a != null) {
            if (!this.c || motionEvent.getActionMasked() != 3) {
                this.a.j(motionEvent);
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
