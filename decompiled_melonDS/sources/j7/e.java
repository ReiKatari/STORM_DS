package j7;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ j1 f7535a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f7536b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f7537c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f7538d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f7539e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ i f7540f;

    public e(i iVar, j1 j1Var, int i2, View view, int i10, ViewPropertyAnimator viewPropertyAnimator) {
        this.f7540f = iVar;
        this.f7535a = j1Var;
        this.f7536b = i2;
        this.f7537c = view;
        this.f7538d = i10;
        this.f7539e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i2 = this.f7536b;
        View view = this.f7537c;
        if (i2 != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.f7538d != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f7539e.setListener(null);
        i iVar = this.f7540f;
        j1 j1Var = this.f7535a;
        iVar.c(j1Var);
        iVar.f7587p.remove(j1Var);
        iVar.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f7540f.getClass();
    }
}
