package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b6.f;
import com.google.android.material.behavior.SwipeDismissBehavior;
import k0.g;
import pa.b;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {

    /* renamed from: h  reason: collision with root package name */
    public final g f3100h;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k0.g] */
    public BaseTransientBottomBar$Behavior() {
        ?? obj = new Object();
        this.f2942e = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        this.f2943f = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        this.f2941d = 0;
        this.f3100h = obj;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, k5.a
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        this.f3100h.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                if (f.f2073c == null) {
                    f.f2073c = new f(3);
                }
                synchronized (f.f2073c.f2075b) {
                }
            }
        } else if (coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            if (f.f2073c == null) {
                f.f2073c = new f(3);
            }
            synchronized (f.f2073c.f2075b) {
            }
        }
        return super.f(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public final boolean r(View view) {
        this.f3100h.getClass();
        return view instanceof b;
    }
}
