package j7;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7544a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ g f7545b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f7546c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ View f7547d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ i f7548e;

    public /* synthetic */ f(i iVar, g gVar, ViewPropertyAnimator viewPropertyAnimator, View view, int i2) {
        this.f7544a = i2;
        this.f7548e = iVar;
        this.f7545b = gVar;
        this.f7546c = viewPropertyAnimator;
        this.f7547d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f7544a) {
            case 0:
                this.f7546c.setListener(null);
                View view = this.f7547d;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                g gVar = this.f7545b;
                j1 j1Var = gVar.f7563a;
                i iVar = this.f7548e;
                iVar.c(j1Var);
                iVar.f7589r.remove(gVar.f7563a);
                iVar.i();
                return;
            default:
                this.f7546c.setListener(null);
                View view2 = this.f7547d;
                view2.setAlpha(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                g gVar2 = this.f7545b;
                j1 j1Var2 = gVar2.f7564b;
                i iVar2 = this.f7548e;
                iVar2.c(j1Var2);
                iVar2.f7589r.remove(gVar2.f7564b);
                iVar2.i();
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f7544a) {
            case 0:
                this.f7548e.getClass();
                return;
            default:
                this.f7548e.getClass();
                return;
        }
    }
}
