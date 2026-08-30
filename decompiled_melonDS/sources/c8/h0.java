package c8;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h0 extends AnimatorListenerAdapter implements r {

    /* renamed from: a  reason: collision with root package name */
    public final View f2648a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2649b;

    /* renamed from: c  reason: collision with root package name */
    public final ViewGroup f2650c;

    /* renamed from: e  reason: collision with root package name */
    public boolean f2652e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f2653f = false;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f2651d = true;

    public h0(View view, int i2) {
        this.f2648a = view;
        this.f2649b = i2;
        this.f2650c = (ViewGroup) view.getParent();
        g(true);
    }

    @Override // c8.r
    public final void a(t tVar) {
        tVar.D(this);
    }

    @Override // c8.r
    public final void b() {
        g(false);
        if (!this.f2653f) {
            e0.b(this.f2648a, this.f2649b);
        }
    }

    @Override // c8.r
    public final void c() {
        g(true);
        if (!this.f2653f) {
            e0.b(this.f2648a, 0);
        }
    }

    public final void g(boolean z10) {
        ViewGroup viewGroup;
        if (this.f2651d && this.f2652e != z10 && (viewGroup = this.f2650c) != null) {
            this.f2652e = z10;
            k7.w.H(viewGroup, z10);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f2653f = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z10) {
        if (!z10) {
            if (!this.f2653f) {
                e0.b(this.f2648a, this.f2649b);
                ViewGroup viewGroup = this.f2650c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            g(false);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z10) {
        if (z10) {
            e0.b(this.f2648a, 0);
            ViewGroup viewGroup = this.f2650c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.f2653f) {
            e0.b(this.f2648a, this.f2649b);
            ViewGroup viewGroup = this.f2650c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        g(false);
    }

    @Override // c8.r
    public final void e(t tVar) {
    }

    @Override // c8.r
    public final void f(t tVar) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }
}
