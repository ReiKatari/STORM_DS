package j7;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7522a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ j1 f7523b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f7524c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f7525d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ i f7526e;

    public d(i iVar, j1 j1Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f7526e = iVar;
        this.f7523b = j1Var;
        this.f7525d = viewPropertyAnimator;
        this.f7524c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f7522a) {
            case DSiCameraSource.FrontCamera /* 1 */:
                this.f7524c.setAlpha(1.0f);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f7522a) {
            case 0:
                this.f7525d.setListener(null);
                this.f7524c.setAlpha(1.0f);
                i iVar = this.f7526e;
                j1 j1Var = this.f7523b;
                iVar.c(j1Var);
                iVar.f7588q.remove(j1Var);
                iVar.i();
                return;
            default:
                this.f7525d.setListener(null);
                i iVar2 = this.f7526e;
                j1 j1Var2 = this.f7523b;
                iVar2.c(j1Var2);
                iVar2.f7586o.remove(j1Var2);
                iVar2.i();
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f7522a) {
            case 0:
                this.f7526e.getClass();
                return;
            default:
                this.f7526e.getClass();
                return;
        }
    }

    public d(i iVar, j1 j1Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f7526e = iVar;
        this.f7523b = j1Var;
        this.f7524c = view;
        this.f7525d = viewPropertyAnimator;
    }
}
