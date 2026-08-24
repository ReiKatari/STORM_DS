package defpackage;

import android.view.animation.Animation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qw6  reason: default package */
/* loaded from: classes.dex */
public final class qw6 implements Animation.AnimationListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ SwipeRefreshLayout b;

    public /* synthetic */ qw6(SwipeRefreshLayout swipeRefreshLayout, int i) {
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
                    swipeRefreshLayout.x0.setAlpha(255);
                    swipeRefreshLayout.x0.start();
                    swipeRefreshLayout.l0 = swipeRefreshLayout.r0.getTop();
                    return;
                }
                swipeRefreshLayout.l();
                return;
            default:
                rw6 rw6Var = new rw6(swipeRefreshLayout, 1);
                swipeRefreshLayout.z0 = rw6Var;
                rw6Var.setDuration(150L);
                sq0 sq0Var = swipeRefreshLayout.r0;
                sq0Var.A = null;
                sq0Var.clearAnimation();
                swipeRefreshLayout.r0.startAnimation(swipeRefreshLayout.z0);
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
