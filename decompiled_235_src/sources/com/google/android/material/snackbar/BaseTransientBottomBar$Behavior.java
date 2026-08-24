package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.behavior.SwipeDismissBehavior;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {
    public final vs0 h;

    public BaseTransientBottomBar$Behavior() {
        vs0 vs0Var = new vs0(24);
        this.e = Math.min(Math.max((float) RecyclerView.B1, 0.1f), 1.0f);
        this.f = Math.min(Math.max((float) RecyclerView.B1, 0.6f), 1.0f);
        this.d = 0;
        this.h = vs0Var;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, defpackage.e51
    public final boolean j(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        this.h.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                if (u2.c == null) {
                    u2.c = new u2();
                }
                synchronized (u2.c.b) {
                }
            }
        } else if (coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            if (u2.c == null) {
                u2.c = new u2();
            }
            synchronized (u2.c.b) {
            }
        }
        return super.j(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public final boolean v(View view) {
        this.h.getClass();
        return view instanceof u20;
    }
}
