package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.behavior.SwipeDismissBehavior;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {
    public final k45 h;

    public BaseTransientBottomBar$Behavior() {
        k45 k45Var = new k45(22);
        this.e = Math.min(Math.max((float) RecyclerView.A1, 0.1f), 1.0f);
        this.f = Math.min(Math.max((float) RecyclerView.A1, 0.6f), 1.0f);
        this.d = 0;
        this.h = k45Var;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, defpackage.w11
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        this.h.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                if (s2.c == null) {
                    s2.c = new s2();
                }
                synchronized (s2.c.b) {
                }
            }
        } else if (coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            if (s2.c == null) {
                s2.c = new s2();
            }
            synchronized (s2.c.b) {
            }
        }
        return super.f(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public final boolean r(View view) {
        this.h.getClass();
        return view instanceof a10;
    }
}
