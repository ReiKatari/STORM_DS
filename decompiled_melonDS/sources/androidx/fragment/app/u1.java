package androidx.fragment.app;

import android.transition.Transition;
import android.view.View;
import java.util.ArrayList;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class u1 implements Transition.TransitionListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f1419a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ArrayList f1420b;

    public u1(View view, ArrayList arrayList) {
        this.f1419a = view;
        this.f1420b = arrayList;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
        this.f1419a.setVisibility(8);
        ArrayList arrayList = this.f1420b;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((View) arrayList.get(i2)).setVisibility(0);
        }
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        transition.removeListener(this);
        transition.addListener(this);
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }
}
