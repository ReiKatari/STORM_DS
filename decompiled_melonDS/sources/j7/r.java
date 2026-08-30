package j7;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class r extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public boolean f7659a = false;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ t f7660b;

    public r(t tVar) {
        this.f7660b = tVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f7659a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f7659a) {
            this.f7659a = false;
            return;
        }
        t tVar = this.f7660b;
        if (((Float) tVar.f7698z.getAnimatedValue()).floatValue() == 0.0f) {
            tVar.A = 0;
            tVar.g(0);
            return;
        }
        tVar.A = 2;
        tVar.f7691s.invalidate();
    }
}
