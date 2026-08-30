package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: la1  reason: default package */
/* loaded from: classes.dex */
public final class la1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ma1 b;
    public final /* synthetic */ ViewPropertyAnimator c;
    public final /* synthetic */ View d;
    public final /* synthetic */ oa1 e;

    public /* synthetic */ la1(oa1 oa1Var, ma1 ma1Var, ViewPropertyAnimator viewPropertyAnimator, View view, int i) {
        this.a = i;
        this.e = oa1Var;
        this.b = ma1Var;
        this.c = viewPropertyAnimator;
        this.d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.a;
        ma1 ma1Var = this.b;
        oa1 oa1Var = this.e;
        View view = this.d;
        ViewPropertyAnimator viewPropertyAnimator = this.c;
        switch (i) {
            case 0:
                viewPropertyAnimator.setListener(null);
                view.setAlpha(1.0f);
                view.setTranslationX(RecyclerView.A1);
                view.setTranslationY(RecyclerView.A1);
                oa1Var.c(ma1Var.a);
                oa1Var.r.remove(ma1Var.a);
                oa1Var.i();
                return;
            default:
                viewPropertyAnimator.setListener(null);
                view.setAlpha(1.0f);
                view.setTranslationX(RecyclerView.A1);
                view.setTranslationY(RecyclerView.A1);
                oa1Var.c(ma1Var.b);
                oa1Var.r.remove(ma1Var.b);
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
}
