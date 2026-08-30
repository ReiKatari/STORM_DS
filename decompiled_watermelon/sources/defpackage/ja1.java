package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ja1  reason: default package */
/* loaded from: classes.dex */
public final class ja1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ g75 b;
    public final /* synthetic */ View c;
    public final /* synthetic */ ViewPropertyAnimator d;
    public final /* synthetic */ oa1 e;

    public ja1(oa1 oa1Var, g75 g75Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.e = oa1Var;
        this.b = g75Var;
        this.d = viewPropertyAnimator;
        this.c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                this.c.setAlpha(1.0f);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.a;
        g75 g75Var = this.b;
        oa1 oa1Var = this.e;
        ViewPropertyAnimator viewPropertyAnimator = this.d;
        switch (i) {
            case 0:
                viewPropertyAnimator.setListener(null);
                this.c.setAlpha(1.0f);
                oa1Var.c(g75Var);
                oa1Var.q.remove(g75Var);
                oa1Var.i();
                return;
            default:
                viewPropertyAnimator.setListener(null);
                oa1Var.c(g75Var);
                oa1Var.o.remove(g75Var);
                oa1Var.i();
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                this.e.getClass();
                return;
            default:
                this.e.getClass();
                return;
        }
    }

    public ja1(oa1 oa1Var, g75 g75Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.e = oa1Var;
        this.b = g75Var;
        this.c = view;
        this.d = viewPropertyAnimator;
    }
}
