package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: a52  reason: default package */
/* loaded from: classes.dex */
public final class a52 extends AnimatorListenerAdapter {
    public boolean a = false;
    public final /* synthetic */ b52 b;

    public a52(b52 b52Var) {
        this.b = b52Var;
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
        b52 b52Var = this.b;
        if (((Float) b52Var.z.getAnimatedValue()).floatValue() == RecyclerView.A1) {
            b52Var.A = 0;
            b52Var.g(0);
            return;
        }
        b52Var.A = 2;
        b52Var.s.invalidate();
    }
}
