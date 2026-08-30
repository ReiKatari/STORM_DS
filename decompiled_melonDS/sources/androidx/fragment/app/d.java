package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d implements Animation.AnimationListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e2 f1257a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f1258b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f1259c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ e f1260d;

    public d(e2 e2Var, ViewGroup viewGroup, View view, e eVar) {
        this.f1257a = e2Var;
        this.f1258b = viewGroup;
        this.f1259c = view;
        this.f1260d = eVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        animation.getClass();
        ViewGroup viewGroup = this.f1258b;
        viewGroup.post(new a0.i(viewGroup, this.f1259c, this.f1260d, 1));
        if (g1.K(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f1257a + " has ended.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        animation.getClass();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        animation.getClass();
        if (g1.K(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f1257a + " has reached onAnimationStart.");
        }
    }
}
