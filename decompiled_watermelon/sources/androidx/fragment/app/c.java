package androidx.fragment.app;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final class c extends gc6 {
    public final d c;

    public c(d dVar) {
        this.c = dVar;
    }

    @Override // defpackage.gc6
    public final void b(ViewGroup viewGroup) {
        viewGroup.getClass();
        b0 b0Var = this.c.a;
        View view = b0Var.c.mView;
        view.clearAnimation();
        viewGroup.endViewTransition(view);
        b0Var.c(this);
        if (u.K(2)) {
            Log.v("FragmentManager", "Animation from operation " + b0Var + " has been cancelled.");
        }
    }

    @Override // defpackage.gc6
    public final void c(ViewGroup viewGroup) {
        viewGroup.getClass();
        d dVar = this.c;
        b0 b0Var = dVar.a;
        if (dVar.a()) {
            b0Var.c(this);
            return;
        }
        Context context = viewGroup.getContext();
        View view = b0Var.c.mView;
        context.getClass();
        k91 b = dVar.b(context);
        if (b != null) {
            Animation animation = (Animation) b.A;
            if (animation != null) {
                if (b0Var.a != kc6.REMOVED) {
                    view.startAnimation(animation);
                    b0Var.c(this);
                    return;
                }
                viewGroup.startViewTransition(view);
                xf2 xf2Var = new xf2(animation, viewGroup, view);
                xf2Var.setAnimationListener(new ib1(b0Var, viewGroup, view, this));
                view.startAnimation(xf2Var);
                if (u.K(2)) {
                    Log.v("FragmentManager", "Animation from operation " + b0Var + " has started.");
                    return;
                }
                return;
            }
            defpackage.i.n("Required value was null.");
            return;
        }
        defpackage.i.n("Required value was null.");
    }
}
