package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fm4  reason: default package */
/* loaded from: classes.dex */
public final class fm4 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public final View A;
    public ViewTreeObserver B;
    public final Runnable L;

    public fm4(View view, Runnable runnable) {
        this.A = view;
        this.B = view.getViewTreeObserver();
        this.L = runnable;
    }

    public static void a(View view, Runnable runnable) {
        if (view != null) {
            fm4 fm4Var = new fm4(view, runnable);
            view.getViewTreeObserver().addOnPreDrawListener(fm4Var);
            view.addOnAttachStateChangeListener(fm4Var);
            return;
        }
        u34.x("view == null");
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
