package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: n42  reason: default package */
/* loaded from: classes.dex */
public final class n42 extends AnimatorListenerAdapter implements hx6 {
    public final View a;
    public boolean b = false;

    public n42(View view) {
        this.a = view;
    }

    @Override // defpackage.hx6
    public final void b() {
        float f;
        View view = this.a;
        if (view.getVisibility() == 0) {
            f = cc7.a.C(view);
        } else {
            f = RecyclerView.A1;
        }
        view.setTag(R.id.transition_pause_alpha, Float.valueOf(f));
    }

    @Override // defpackage.hx6
    public final void c() {
        this.a.setTag(R.id.transition_pause_alpha, null);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        cc7.a.O(this.a, 1.0f);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        boolean z2 = this.b;
        View view = this.a;
        if (z2) {
            view.setLayerType(0, null);
        }
        if (!z) {
            ec7 ec7Var = cc7.a;
            ec7Var.O(view, 1.0f);
            ec7Var.getClass();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.a;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.b = true;
            view.setLayerType(2, null);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // defpackage.hx6
    public final void a(ix6 ix6Var) {
    }

    @Override // defpackage.hx6
    public final void d(ix6 ix6Var) {
    }

    @Override // defpackage.hx6
    public final void e(ix6 ix6Var) {
    }

    @Override // defpackage.hx6
    public final void f(ix6 ix6Var) {
    }
}
