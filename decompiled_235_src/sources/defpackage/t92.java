package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: t92  reason: default package */
/* loaded from: classes.dex */
public final class t92 extends AnimatorListenerAdapter {
    public boolean a = false;
    public final /* synthetic */ u92 b;

    public t92(u92 u92Var) {
        this.b = u92Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.a) {
            this.a = false;
            return;
        }
        u92 u92Var = this.b;
        if (((Float) u92Var.z.getAnimatedValue()).floatValue() == RecyclerView.B1) {
            u92Var.A = 0;
            u92Var.g(0);
            return;
        }
        u92Var.A = 2;
        u92Var.s.invalidate();
    }
}
