package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ka1  reason: default package */
/* loaded from: classes.dex */
public final class ka1 extends AnimatorListenerAdapter {
    public final /* synthetic */ g75 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ View c;
    public final /* synthetic */ int d;
    public final /* synthetic */ ViewPropertyAnimator e;
    public final /* synthetic */ oa1 f;

    public ka1(oa1 oa1Var, g75 g75Var, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.f = oa1Var;
        this.a = g75Var;
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
            view.setTranslationX(RecyclerView.A1);
        }
        if (this.d != 0) {
            view.setTranslationY(RecyclerView.A1);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.e.setListener(null);
        oa1 oa1Var = this.f;
        g75 g75Var = this.a;
        oa1Var.c(g75Var);
        oa1Var.p.remove(g75Var);
        oa1Var.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f.getClass();
    }
}
