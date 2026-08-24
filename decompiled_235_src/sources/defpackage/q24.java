package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: q24  reason: default package */
/* loaded from: classes.dex */
public final class q24 extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ r24 c;

    public q24(r24 r24Var, boolean z, int i) {
        this.c = r24Var;
        this.a = z;
        this.b = i;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        r24 r24Var = this.c;
        r24Var.b.setTranslationX(RecyclerView.B1);
        r24Var.a(RecyclerView.B1, this.b, this.a);
    }
}
