package a6;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i1 extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f475a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f476b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f477c;

    public i1(p1 p1Var, View view) {
        this.f476b = p1Var;
        this.f477c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f475a) {
            case 0:
                p1 p1Var = (p1) this.f476b;
                p1Var.f502a.e(1.0f);
                l1.f(p1Var, (View) this.f477c);
                return;
            default:
                ((a1.e) this.f476b).remove(animator);
                ((c8.t) this.f477c).f2703h0.remove(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f475a) {
            case DSiCameraSource.FrontCamera /* 1 */:
                ((c8.t) this.f477c).f2703h0.add(animator);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public i1(c8.t tVar, a1.e eVar) {
        this.f477c = tVar;
        this.f476b = eVar;
    }
}
