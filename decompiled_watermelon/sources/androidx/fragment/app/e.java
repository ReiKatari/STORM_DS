package androidx.fragment.app;

import android.animation.AnimatorSet;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final class e extends gc6 {
    public final d c;
    public AnimatorSet d;

    public e(d dVar) {
        this.c = dVar;
    }

    @Override // defpackage.gc6
    public final void b(ViewGroup viewGroup) {
        String str;
        viewGroup.getClass();
        AnimatorSet animatorSet = this.d;
        b0 b0Var = this.c.a;
        if (animatorSet == null) {
            b0Var.c(this);
            return;
        }
        if (b0Var.g) {
            if (Build.VERSION.SDK_INT >= 26) {
                lb1.a.a(animatorSet);
            }
        } else {
            animatorSet.end();
        }
        if (u.K(2)) {
            StringBuilder sb = new StringBuilder("Animator from operation ");
            sb.append(b0Var);
            sb.append(" has been canceled");
            if (b0Var.g) {
                str = " with seeking.";
            } else {
                str = ".";
            }
            sb.append(str);
            sb.append(' ');
            Log.v("FragmentManager", sb.toString());
        }
    }

    @Override // defpackage.gc6
    public final void c(ViewGroup viewGroup) {
        viewGroup.getClass();
        b0 b0Var = this.c.a;
        AnimatorSet animatorSet = this.d;
        if (animatorSet == null) {
            b0Var.c(this);
            return;
        }
        animatorSet.start();
        if (u.K(2)) {
            Log.v("FragmentManager", "Animator from operation " + b0Var + " has started.");
        }
    }

    @Override // defpackage.gc6
    public final void d(ky kyVar, ViewGroup viewGroup) {
        viewGroup.getClass();
        b0 b0Var = this.c.a;
        AnimatorSet animatorSet = this.d;
        if (animatorSet == null) {
            b0Var.c(this);
        } else if (Build.VERSION.SDK_INT >= 34 && b0Var.c.mTransitioning) {
            if (u.K(2)) {
                Log.v("FragmentManager", "Adding BackProgressCallbacks for Animators to operation " + b0Var);
            }
            long a = kb1.a.a(animatorSet);
            long j = kyVar.c * ((float) a);
            if (j == 0) {
                j = 1;
            }
            if (j == a) {
                j = a - 1;
            }
            if (u.K(2)) {
                Log.v("FragmentManager", "Setting currentPlayTime to " + j + " for Animator " + animatorSet + " on operation " + b0Var);
            }
            lb1.a.b(animatorSet, j);
        }
    }

    @Override // defpackage.gc6
    public final void e(ViewGroup viewGroup) {
        AnimatorSet animatorSet;
        boolean z;
        e eVar;
        viewGroup.getClass();
        d dVar = this.c;
        if (!dVar.a()) {
            Context context = viewGroup.getContext();
            context.getClass();
            k91 b = dVar.b(context);
            if (b != null) {
                animatorSet = (AnimatorSet) b.B;
            } else {
                animatorSet = null;
            }
            this.d = animatorSet;
            b0 b0Var = dVar.a;
            o oVar = b0Var.c;
            if (b0Var.a == kc6.GONE) {
                z = true;
            } else {
                z = false;
            }
            boolean z2 = z;
            View view = oVar.mView;
            viewGroup.startViewTransition(view);
            AnimatorSet animatorSet2 = this.d;
            if (animatorSet2 != null) {
                eVar = this;
                animatorSet2.addListener(new jb1(viewGroup, view, z2, b0Var, eVar));
            } else {
                eVar = this;
            }
            AnimatorSet animatorSet3 = eVar.d;
            if (animatorSet3 != null) {
                animatorSet3.setTarget(view);
            }
        }
    }
}
