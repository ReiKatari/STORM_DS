package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xw6  reason: default package */
/* loaded from: classes.dex */
public final class xw6 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public xw6(ze7 ze7Var, View view) {
        this.b = ze7Var;
        this.c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((eu) obj2).remove(animator);
                ((ix6) obj).i0.remove(animator);
                return;
            default:
                ze7 ze7Var = (ze7) obj2;
                ze7Var.a.e(1.0f);
                ue7.f(ze7Var, (View) obj);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                ((ix6) this.c).i0.add(animator);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public xw6(ix6 ix6Var, eu euVar) {
        this.c = ix6Var;
        this.b = euVar;
    }
}
