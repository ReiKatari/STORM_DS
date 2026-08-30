package androidx.fragment.app;

import android.animation.AnimatorSet;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h extends d2 {

    /* renamed from: c  reason: collision with root package name */
    public final f f1335c;

    /* renamed from: d  reason: collision with root package name */
    public AnimatorSet f1336d;

    public h(f fVar) {
        this.f1335c = fVar;
    }

    @Override // androidx.fragment.app.d2
    public final void b(ViewGroup viewGroup) {
        String str;
        viewGroup.getClass();
        AnimatorSet animatorSet = this.f1336d;
        e2 e2Var = this.f1335c.f1343a;
        if (animatorSet == null) {
            e2Var.c(this);
            return;
        }
        if (e2Var.f1277g) {
            if (Build.VERSION.SDK_INT >= 26) {
                j.f1340a.a(animatorSet);
            }
        } else {
            animatorSet.end();
        }
        if (g1.K(2)) {
            StringBuilder sb2 = new StringBuilder("Animator from operation ");
            sb2.append(e2Var);
            sb2.append(" has been canceled");
            if (e2Var.f1277g) {
                str = " with seeking.";
            } else {
                str = ".";
            }
            sb2.append(str);
            sb2.append(' ');
            Log.v("FragmentManager", sb2.toString());
        }
    }

    @Override // androidx.fragment.app.d2
    public final void c(ViewGroup viewGroup) {
        viewGroup.getClass();
        e2 e2Var = this.f1335c.f1343a;
        AnimatorSet animatorSet = this.f1336d;
        if (animatorSet == null) {
            e2Var.c(this);
            return;
        }
        animatorSet.start();
        if (g1.K(2)) {
            Log.v("FragmentManager", "Animator from operation " + e2Var + " has started.");
        }
    }

    @Override // androidx.fragment.app.d2
    public final void d(d.a aVar, ViewGroup viewGroup) {
        viewGroup.getClass();
        e2 e2Var = this.f1335c.f1343a;
        AnimatorSet animatorSet = this.f1336d;
        if (animatorSet == null) {
            e2Var.c(this);
        } else if (Build.VERSION.SDK_INT >= 34 && e2Var.f1273c.mTransitioning) {
            if (g1.K(2)) {
                Log.v("FragmentManager", "Adding BackProgressCallbacks for Animators to operation " + e2Var);
            }
            long a10 = i.f1338a.a(animatorSet);
            long j2 = aVar.f3282c * ((float) a10);
            if (j2 == 0) {
                j2 = 1;
            }
            if (j2 == a10) {
                j2 = a10 - 1;
            }
            if (g1.K(2)) {
                Log.v("FragmentManager", "Setting currentPlayTime to " + j2 + " for Animator " + animatorSet + " on operation " + e2Var);
            }
            j.f1340a.b(animatorSet, j2);
        }
    }

    @Override // androidx.fragment.app.d2
    public final void e(ViewGroup viewGroup) {
        AnimatorSet animatorSet;
        boolean z10;
        h hVar;
        viewGroup.getClass();
        f fVar = this.f1335c;
        if (!fVar.a()) {
            Context context = viewGroup.getContext();
            context.getClass();
            p0 b10 = fVar.b(context);
            if (b10 != null) {
                animatorSet = (AnimatorSet) b10.f1389b;
            } else {
                animatorSet = null;
            }
            this.f1336d = animatorSet;
            e2 e2Var = fVar.f1343a;
            j0 j0Var = e2Var.f1273c;
            if (e2Var.f1271a == i2.GONE) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z11 = z10;
            View view = j0Var.mView;
            viewGroup.startViewTransition(view);
            AnimatorSet animatorSet2 = this.f1336d;
            if (animatorSet2 != null) {
                hVar = this;
                animatorSet2.addListener(new g(viewGroup, view, z11, e2Var, hVar));
            } else {
                hVar = this;
            }
            AnimatorSet animatorSet3 = hVar.f1336d;
            if (animatorSet3 != null) {
                animatorSet3.setTarget(view);
            }
        }
    }
}
