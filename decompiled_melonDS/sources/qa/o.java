package qa;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import q.z0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class o extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f12460a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TextView f12461b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f12462c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ TextView f12463d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ q f12464e;

    public o(q qVar, int i2, TextView textView, int i10, TextView textView2) {
        this.f12464e = qVar;
        this.f12460a = i2;
        this.f12461b = textView;
        this.f12462c = i10;
        this.f12463d = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        z0 z0Var;
        int i2 = this.f12460a;
        q qVar = this.f12464e;
        qVar.f12478n = i2;
        qVar.f12477l = null;
        TextView textView = this.f12461b;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.f12462c == 1 && (z0Var = qVar.f12482r) != null) {
                z0Var.setText((CharSequence) null);
            }
        }
        TextView textView2 = this.f12463d;
        if (textView2 != null) {
            textView2.setTranslationY(0.0f);
            textView2.setAlpha(1.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        TextView textView = this.f12463d;
        if (textView != null) {
            textView.setVisibility(0);
            textView.setAlpha(0.0f);
        }
    }
}
