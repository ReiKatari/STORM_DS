package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: t97  reason: default package */
/* loaded from: classes.dex */
public final class t97 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public t97(au7 au7Var, View view) {
        this.b = au7Var;
        this.c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((wu) obj2).remove(animator);
                ((ea7) obj).j0.remove(animator);
                return;
            default:
                au7 au7Var = (au7) obj2;
                au7Var.a.e(1.0f);
                wt7.f(au7Var, (View) obj);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                ((ea7) this.c).j0.add(animator);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public t97(ea7 ea7Var, wu wuVar) {
        this.c = ea7Var;
        this.b = wuVar;
    }
}
