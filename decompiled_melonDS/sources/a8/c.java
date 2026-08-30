package a8;

import android.animation.Animator;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c implements Animator.AnimatorListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f640a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e f641b;

    public c(e eVar, d dVar) {
        this.f641b = eVar;
        this.f640a = dVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        e eVar = this.f641b;
        d dVar = this.f640a;
        eVar.a(1.0f, dVar, true);
        dVar.f652k = dVar.f646e;
        dVar.f653l = dVar.f647f;
        dVar.m = dVar.f648g;
        dVar.a((dVar.f651j + 1) % dVar.f650i.length);
        if (eVar.Y) {
            eVar.Y = false;
            animator.cancel();
            animator.setDuration(1332L);
            animator.start();
            if (dVar.f654n) {
                dVar.f654n = false;
                return;
            }
            return;
        }
        eVar.X += 1.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f641b.X = 0.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }
}
