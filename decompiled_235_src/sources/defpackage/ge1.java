package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ge1  reason: default package */
/* loaded from: classes.dex */
public final class ge1 extends AnimatorListenerAdapter {
    public final /* synthetic */ wg5 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ View c;
    public final /* synthetic */ int d;
    public final /* synthetic */ ViewPropertyAnimator e;
    public final /* synthetic */ ke1 f;

    public ge1(ke1 ke1Var, wg5 wg5Var, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.f = ke1Var;
        this.a = wg5Var;
        this.b = i;
        this.c = view;
        this.d = i2;
        this.e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.b;
        View view = this.c;
        if (i != 0) {
            view.setTranslationX(RecyclerView.B1);
        }
        if (this.d != 0) {
            view.setTranslationY(RecyclerView.B1);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.e.setListener(null);
        ke1 ke1Var = this.f;
        wg5 wg5Var = this.a;
        ke1Var.c(wg5Var);
        ke1Var.p.remove(wg5Var);
        ke1Var.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f.getClass();
    }
}
