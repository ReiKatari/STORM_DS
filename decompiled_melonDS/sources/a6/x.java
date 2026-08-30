package a6;

import android.view.View;
import android.view.ViewTreeObserver;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class x implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public final View A;
    public ViewTreeObserver B;
    public final Runnable L;

    public x(View view, Runnable runnable) {
        this.A = view;
        this.B = view.getViewTreeObserver();
        this.L = runnable;
    }

    public static void a(View view, Runnable runnable) {
        if (view != null) {
            x xVar = new x(view, runnable);
            view.getViewTreeObserver().addOnPreDrawListener(xVar);
            view.addOnAttachStateChangeListener(xVar);
            return;
        }
        m9.o.i("view == null");
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
