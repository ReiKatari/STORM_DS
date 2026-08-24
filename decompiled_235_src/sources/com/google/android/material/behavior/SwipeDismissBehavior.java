package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends e51 {
    public ho7 a;
    public boolean b;
    public boolean c;
    public int d = 2;
    public float e = RecyclerView.B1;
    public float f = 0.5f;
    public final pw6 g = new pw6(this);

    @Override // defpackage.e51
    public boolean j(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
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
                this.a = new ho7(coordinatorLayout.getContext(), coordinatorLayout, this.g);
            }
            if (!this.c && this.a.p(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.e51
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            ao7.k(view, 1048576);
            ao7.i(view, 0);
            if (v(view)) {
                ao7.l(view, p2.l, new s35(this));
            }
        }
        return false;
    }

    @Override // defpackage.e51
    public final boolean u(View view, MotionEvent motionEvent) {
        if (this.a != null) {
            if (!this.c || motionEvent.getActionMasked() != 3) {
                this.a.j(motionEvent);
                return true;
            }
            return true;
        }
        return false;
    }

    public boolean v(View view) {
        return true;
    }
}
