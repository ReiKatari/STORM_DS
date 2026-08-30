package c8;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import me.magnum.melonds.R;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g extends AnimatorListenerAdapter implements r {

    /* renamed from: a  reason: collision with root package name */
    public final View f2644a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f2645b = false;

    public g(View view) {
        this.f2644a = view;
    }

    @Override // c8.r
    public final void b() {
        float f8;
        View view = this.f2644a;
        if (view.getVisibility() == 0) {
            f8 = e0.f2636a.p(view);
        } else {
            f8 = 0.0f;
        }
        view.setTag(R.id.transition_pause_alpha, Float.valueOf(f8));
    }

    @Override // c8.r
    public final void c() {
        this.f2644a.setTag(R.id.transition_pause_alpha, null);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        e0.f2636a.E(this.f2644a, 1.0f);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z10) {
        boolean z11 = this.f2645b;
        View view = this.f2644a;
        if (z11) {
            view.setLayerType(0, null);
        }
        if (!z10) {
            f0 f0Var = e0.f2636a;
            f0Var.E(view, 1.0f);
            f0Var.getClass();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.f2644a;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.f2645b = true;
            view.setLayerType(2, null);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // c8.r
    public final void a(t tVar) {
    }

    @Override // c8.r
    public final void d(t tVar) {
    }

    @Override // c8.r
    public final void e(t tVar) {
    }

    @Override // c8.r
    public final void f(t tVar) {
    }
}
