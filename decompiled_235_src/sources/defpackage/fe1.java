package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fe1  reason: default package */
/* loaded from: classes.dex */
public final class fe1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ wg5 b;
    public final /* synthetic */ View c;
    public final /* synthetic */ ViewPropertyAnimator d;
    public final /* synthetic */ ke1 e;

    public fe1(ke1 ke1Var, wg5 wg5Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.e = ke1Var;
        this.b = wg5Var;
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
        wg5 wg5Var = this.b;
        ke1 ke1Var = this.e;
        ViewPropertyAnimator viewPropertyAnimator = this.d;
        switch (i) {
            case 0:
                viewPropertyAnimator.setListener(null);
                this.c.setAlpha(1.0f);
                ke1Var.c(wg5Var);
                ke1Var.q.remove(wg5Var);
                ke1Var.i();
                return;
            default:
                viewPropertyAnimator.setListener(null);
                ke1Var.c(wg5Var);
                ke1Var.o.remove(wg5Var);
                ke1Var.i();
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

    public fe1(ke1 ke1Var, wg5 wg5Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.e = ke1Var;
        this.b = wg5Var;
        this.c = view;
        this.d = viewPropertyAnimator;
    }
}
