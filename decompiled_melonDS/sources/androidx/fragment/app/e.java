package androidx.fragment.app;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e extends d2 {

    /* renamed from: c  reason: collision with root package name */
    public final f f1263c;

    public e(f fVar) {
        this.f1263c = fVar;
    }

    @Override // androidx.fragment.app.d2
    public final void b(ViewGroup viewGroup) {
        viewGroup.getClass();
        e2 e2Var = this.f1263c.f1343a;
        View view = e2Var.f1273c.mView;
        view.clearAnimation();
        viewGroup.endViewTransition(view);
        e2Var.c(this);
        if (g1.K(2)) {
            Log.v("FragmentManager", "Animation from operation " + e2Var + " has been cancelled.");
        }
    }

    @Override // androidx.fragment.app.d2
    public final void c(ViewGroup viewGroup) {
        viewGroup.getClass();
        f fVar = this.f1263c;
        e2 e2Var = fVar.f1343a;
        if (fVar.a()) {
            e2Var.c(this);
            return;
        }
        Context context = viewGroup.getContext();
        View view = e2Var.f1273c.mView;
        context.getClass();
        p0 b10 = fVar.b(context);
        if (b10 != null) {
            Animation animation = (Animation) b10.f1388a;
            if (animation != null) {
                if (e2Var.f1271a != i2.REMOVED) {
                    view.startAnimation(animation);
                    e2Var.c(this);
                    return;
                }
                viewGroup.startViewTransition(view);
                q0 q0Var = new q0(animation, viewGroup, view);
                q0Var.setAnimationListener(new d(e2Var, viewGroup, view, this));
                view.startAnimation(q0Var);
                if (g1.K(2)) {
                    Log.v("FragmentManager", "Animation from operation " + e2Var + " has started.");
                    return;
                }
                return;
            }
            a0.j.p("Required value was null.");
            return;
        }
        a0.j.p("Required value was null.");
    }
}
