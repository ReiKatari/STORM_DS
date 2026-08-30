package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.b0;
import androidx.fragment.app.e;
import androidx.fragment.app.u;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: jb1  reason: default package */
/* loaded from: classes.dex */
public final class jb1 extends AnimatorListenerAdapter {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ View b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ b0 d;
    public final /* synthetic */ e e;

    public jb1(ViewGroup viewGroup, View view, boolean z, b0 b0Var, e eVar) {
        this.a = viewGroup;
        this.b = view;
        this.c = z;
        this.d = b0Var;
        this.e = eVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        animator.getClass();
        ViewGroup viewGroup = this.a;
        View view = this.b;
        viewGroup.endViewTransition(view);
        boolean z = this.c;
        b0 b0Var = this.d;
        if (z || b0Var.a == kc6.GONE) {
            kc6 kc6Var = b0Var.a;
            view.getClass();
            kc6Var.applyState(view, viewGroup);
        }
        e eVar = this.e;
        eVar.c.a.c(eVar);
        if (u.K(2)) {
            Log.v("FragmentManager", "Animator from operation " + b0Var + " has ended.");
        }
    }
}
