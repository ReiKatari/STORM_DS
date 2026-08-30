package c8;

import a6.x0;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import me.magnum.melonds.R;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i0 extends AnimatorListenerAdapter implements r {

    /* renamed from: a  reason: collision with root package name */
    public final ViewGroup f2654a;

    /* renamed from: b  reason: collision with root package name */
    public final View f2655b;

    /* renamed from: c  reason: collision with root package name */
    public final View f2656c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f2657d = true;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ h f2658e;

    public i0(h hVar, ViewGroup viewGroup, View view, View view2) {
        this.f2658e = hVar;
        this.f2654a = viewGroup;
        this.f2655b = view;
        this.f2656c = view2;
    }

    @Override // c8.r
    public final void a(t tVar) {
        tVar.D(this);
    }

    @Override // c8.r
    public final void e(t tVar) {
        if (this.f2657d) {
            g();
        }
    }

    public final void g() {
        this.f2656c.setTag(R.id.save_overlay_view, null);
        this.f2654a.getOverlay().remove(this.f2655b);
        this.f2657d = false;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z10) {
        if (!z10) {
            g();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        this.f2654a.getOverlay().remove(this.f2655b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        View view = this.f2655b;
        if (view.getParent() == null) {
            x0.a(view, this.f2654a);
        } else {
            this.f2658e.cancel();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z10) {
        if (z10) {
            View view = this.f2656c;
            View view2 = this.f2655b;
            view.setTag(R.id.save_overlay_view, view2);
            x0.a(view2, this.f2654a);
            this.f2657d = true;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        g();
    }

    @Override // c8.r
    public final void b() {
    }

    @Override // c8.r
    public final void c() {
    }

    @Override // c8.r
    public final void f(t tVar) {
    }
}
