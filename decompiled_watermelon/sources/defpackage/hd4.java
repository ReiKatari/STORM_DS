package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: hd4  reason: default package */
/* loaded from: classes.dex */
public final class hd4 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public final View A;
    public ViewTreeObserver B;
    public final Runnable L;

    public hd4(View view, Runnable runnable) {
        this.A = view;
        this.B = view.getViewTreeObserver();
        this.L = runnable;
    }

    public static void a(View view, Runnable runnable) {
        if (view != null) {
            hd4 hd4Var = new hd4(view, runnable);
            view.getViewTreeObserver().addOnPreDrawListener(hd4Var);
            view.addOnAttachStateChangeListener(hd4Var);
            return;
        }
        c44.i("view == null");
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean isAlive = this.B.isAlive();
        View view = this.A;
        if (isAlive) {
            this.B.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.L.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.B = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean isAlive = this.B.isAlive();
        View view2 = this.A;
        if (isAlive) {
            this.B.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
