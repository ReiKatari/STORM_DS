package defpackage;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.b0;
import androidx.fragment.app.c;
import androidx.fragment.app.u;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ib1  reason: default package */
/* loaded from: classes.dex */
public final class ib1 implements Animation.AnimationListener {
    public final /* synthetic */ b0 a;
    public final /* synthetic */ ViewGroup b;
    public final /* synthetic */ View c;
    public final /* synthetic */ c d;

    public ib1(b0 b0Var, ViewGroup viewGroup, View view, c cVar) {
        this.a = b0Var;
        this.b = viewGroup;
        this.c = view;
        this.d = cVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        animation.getClass();
        ViewGroup viewGroup = this.b;
        viewGroup.post(new u(viewGroup, this.c, this.d, 9));
        if (u.K(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.a + " has ended.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        animation.getClass();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        animation.getClass();
        if (u.K(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.a + " has reached onAnimationStart.");
        }
    }
}
