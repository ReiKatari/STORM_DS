package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ap0  reason: default package */
/* loaded from: classes.dex */
public final class ap0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ bp0 b;

    public /* synthetic */ ap0(bp0 bp0Var, int i) {
        this.a = i;
        this.b = bp0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 1:
                this.b.b.h(false);
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.b.h(true);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
