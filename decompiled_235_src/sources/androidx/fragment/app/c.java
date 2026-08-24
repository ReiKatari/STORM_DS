package androidx.fragment.app;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class c extends wn6 {
    public final d c;

    public c(d dVar) {
        this.c = dVar;
    }

    @Override // defpackage.wn6
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

    @Override // defpackage.wn6
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
        yc1 b = dVar.b(context);
        if (b != null) {
            Animation animation = (Animation) b.A;
            if (animation != null) {
                if (b0Var.a != ao6.REMOVED) {
                    view.startAnimation(animation);
                    b0Var.c(this);
                    return;
                }
                viewGroup.startViewTransition(view);
                wk2 wk2Var = new wk2(animation, viewGroup, view);
                wk2Var.setAnimationListener(new gf1(b0Var, viewGroup, view, this));
                view.startAnimation(wk2Var);
                if (u.K(2)) {
                    Log.v("FragmentManager", "Animation from operation " + b0Var + " has started.");
                    return;
                }
                return;
            }
            defpackage.i.m("Required value was null.");
            return;
        }
        defpackage.i.m("Required value was null.");
    }
}
