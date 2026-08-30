package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f1305a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f1306b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ boolean f1307c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ e2 f1308d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ h f1309e;

    public g(ViewGroup viewGroup, View view, boolean z10, e2 e2Var, h hVar) {
        this.f1305a = viewGroup;
        this.f1306b = view;
        this.f1307c = z10;
        this.f1308d = e2Var;
        this.f1309e = hVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        animator.getClass();
        ViewGroup viewGroup = this.f1305a;
        View view = this.f1306b;
        viewGroup.endViewTransition(view);
        boolean z10 = this.f1307c;
        e2 e2Var = this.f1308d;
        if (z10 || e2Var.f1271a == i2.GONE) {
            i2 i2Var = e2Var.f1271a;
            view.getClass();
            i2Var.applyState(view, viewGroup);
        }
        h hVar = this.f1309e;
        hVar.f1335c.f1343a.c(hVar);
        if (g1.K(2)) {
            Log.v("FragmentManager", "Animator from operation " + e2Var + " has ended.");
        }
    }
}
