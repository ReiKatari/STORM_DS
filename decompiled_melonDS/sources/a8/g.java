package a8;

import android.view.animation.Animation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import kf.e0;
import kf.l0;
import zc.x;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g implements Animation.AnimationListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f664a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ SwipeRefreshLayout f665b;

    public /* synthetic */ g(SwipeRefreshLayout swipeRefreshLayout, int i2) {
        this.f664a = i2;
        this.f665b = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        k kVar;
        switch (this.f664a) {
            case 0:
                SwipeRefreshLayout swipeRefreshLayout = this.f665b;
                if (swipeRefreshLayout.L) {
                    swipeRefreshLayout.f1697w0.setAlpha(255);
                    swipeRefreshLayout.f1697w0.start();
                    if (swipeRefreshLayout.B0 && (kVar = swipeRefreshLayout.B) != null) {
                        l0 l0Var = (l0) ((me.magnum.melonds.ui.romlist.a) ((ah.e) kVar).B).j().f2285b;
                        x.v(l0Var.f8248e, null, null, new e0(l0Var, null, 3), 3);
                    }
                    swipeRefreshLayout.f1686k0 = swipeRefreshLayout.f1691q0.getTop();
                    return;
                }
                swipeRefreshLayout.l();
                return;
            default:
                SwipeRefreshLayout swipeRefreshLayout2 = this.f665b;
                h hVar = new h(swipeRefreshLayout2, 1);
                swipeRefreshLayout2.f1699y0 = hVar;
                hVar.setDuration(150L);
                a aVar = swipeRefreshLayout2.f1691q0;
                aVar.A = null;
                aVar.clearAnimation();
                swipeRefreshLayout2.f1691q0.startAnimation(swipeRefreshLayout2.f1699y0);
                return;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        int i2 = this.f664a;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        int i2 = this.f664a;
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
