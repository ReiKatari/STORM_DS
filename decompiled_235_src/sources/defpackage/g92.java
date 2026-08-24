package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.stormds.emulator.R;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: g92  reason: default package */
/* loaded from: classes.dex */
public final class g92 extends AnimatorListenerAdapter implements da7 {
    public final View a;
    public boolean b = false;

    public g92(View view) {
        this.a = view;
    }

    @Override // defpackage.da7
    public final void b() {
        float f;
        View view = this.a;
        if (view.getVisibility() == 0) {
            f = dq7.a.K(view);
        } else {
            f = RecyclerView.B1;
        }
        view.setTag(R.id.transition_pause_alpha, Float.valueOf(f));
    }

    @Override // defpackage.da7
    public final void e() {
        this.a.setTag(R.id.transition_pause_alpha, null);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        dq7.a.Y(this.a, 1.0f);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        boolean z2 = this.b;
        View view = this.a;
        if (z2) {
            view.setLayerType(0, null);
        }
        if (!z) {
            gq7 gq7Var = dq7.a;
            gq7Var.Y(view, 1.0f);
            gq7Var.getClass();
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

    @Override // defpackage.da7
    public final void a(ea7 ea7Var) {
    }

    @Override // defpackage.da7
    public final void c(ea7 ea7Var) {
    }

    @Override // defpackage.da7
    public final void d(ea7 ea7Var) {
    }

    @Override // defpackage.da7
    public final void f(ea7 ea7Var) {
    }
}
