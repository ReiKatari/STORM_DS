package defpackage;

import android.animation.Animator;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ko0  reason: default package */
/* loaded from: classes.dex */
public final class ko0 implements Animator.AnimatorListener {
    public final /* synthetic */ lo0 a;
    public final /* synthetic */ mo0 b;

    public ko0(mo0 mo0Var, lo0 lo0Var) {
        this.b = mo0Var;
        this.a = lo0Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        mo0 mo0Var = this.b;
        lo0 lo0Var = this.a;
        mo0Var.a(1.0f, lo0Var, true);
        lo0Var.k = lo0Var.e;
        lo0Var.l = lo0Var.f;
        lo0Var.m = lo0Var.g;
        lo0Var.a((lo0Var.j + 1) % lo0Var.i.length);
        if (mo0Var.Y) {
            mo0Var.Y = false;
            animator.cancel();
            animator.setDuration(1332L);
            animator.start();
            if (lo0Var.n) {
                lo0Var.n = false;
                return;
            }
            return;
        }
        mo0Var.X += 1.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.b.X = RecyclerView.A1;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }
}
