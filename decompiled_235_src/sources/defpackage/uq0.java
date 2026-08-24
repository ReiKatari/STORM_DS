package defpackage;

import android.animation.Animator;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uq0  reason: default package */
/* loaded from: classes.dex */
public final class uq0 implements Animator.AnimatorListener {
    public final /* synthetic */ vq0 a;
    public final /* synthetic */ wq0 b;

    public uq0(wq0 wq0Var, vq0 vq0Var) {
        this.b = wq0Var;
        this.a = vq0Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        wq0 wq0Var = this.b;
        vq0 vq0Var = this.a;
        wq0Var.a(1.0f, vq0Var, true);
        vq0Var.k = vq0Var.e;
        vq0Var.l = vq0Var.f;
        vq0Var.m = vq0Var.g;
        vq0Var.a((vq0Var.j + 1) % vq0Var.i.length);
        if (wq0Var.Y) {
            wq0Var.Y = false;
            animator.cancel();
            animator.setDuration(1332L);
            animator.start();
            if (vq0Var.n) {
                vq0Var.n = false;
                return;
            }
            return;
        }
        wq0Var.X += 1.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.b.X = RecyclerView.B1;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }
}
