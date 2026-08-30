package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: qc7  reason: default package */
/* loaded from: classes.dex */
public final class qc7 extends AnimatorListenerAdapter implements hx6 {
    public final View a;
    public final int b;
    public final ViewGroup c;
    public boolean e;
    public boolean f = false;
    public final boolean d = true;

    public qc7(View view, int i) {
        this.a = view;
        this.b = i;
        this.c = (ViewGroup) view.getParent();
        g(true);
    }

    @Override // defpackage.hx6
    public final void a(ix6 ix6Var) {
        ix6Var.D(this);
    }

    @Override // defpackage.hx6
    public final void b() {
        g(false);
        if (!this.f) {
            cc7.b(this.a, this.b);
        }
    }

    @Override // defpackage.hx6
    public final void c() {
        g(true);
        if (!this.f) {
            cc7.b(this.a, 0);
        }
    }

    public final void g(boolean z) {
        ViewGroup viewGroup;
        if (this.d && this.e != z && (viewGroup = this.c) != null) {
            this.e = z;
            cg2.U(viewGroup, z);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (!z) {
            if (!this.f) {
                cc7.b(this.a, this.b);
                ViewGroup viewGroup = this.c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            g(false);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z) {
        if (z) {
            cc7.b(this.a, 0);
            ViewGroup viewGroup = this.c;
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
        if (!this.f) {
            cc7.b(this.a, this.b);
            ViewGroup viewGroup = this.c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        g(false);
    }

    @Override // defpackage.hx6
    public final void d(ix6 ix6Var) {
    }

    @Override // defpackage.hx6
    public final void e(ix6 ix6Var) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }
}
