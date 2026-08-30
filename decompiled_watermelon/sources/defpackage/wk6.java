package defpackage;

import android.view.animation.Animation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: wk6  reason: default package */
/* loaded from: classes.dex */
public final class wk6 implements Animation.AnimationListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ SwipeRefreshLayout b;

    public /* synthetic */ wk6(SwipeRefreshLayout swipeRefreshLayout, int i) {
        this.a = i;
        this.b = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        int i = this.a;
        SwipeRefreshLayout swipeRefreshLayout = this.b;
        switch (i) {
            case 0:
                if (swipeRefreshLayout.B) {
                    swipeRefreshLayout.w0.setAlpha(255);
                    swipeRefreshLayout.w0.start();
                    swipeRefreshLayout.k0 = swipeRefreshLayout.q0.getTop();
                    return;
                }
                swipeRefreshLayout.l();
                return;
            default:
                xk6 xk6Var = new xk6(swipeRefreshLayout, 1);
                swipeRefreshLayout.y0 = xk6Var;
                xk6Var.setDuration(150L);
                io0 io0Var = swipeRefreshLayout.q0;
                io0Var.A = null;
                io0Var.clearAnimation();
                swipeRefreshLayout.q0.startAnimation(swipeRefreshLayout.y0);
                return;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        int i = this.a;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        int i = this.a;
    }

    private final void a(Animation animation) {
    }

    private final void b(Animation animation) {
    }

    private final void c(Animation animation) {
    }

    private final void d(Animation animation) {
    }
}
