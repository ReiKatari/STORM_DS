package androidx.fragment.app;

import android.transition.Transition;
import java.util.ArrayList;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class v1 implements Transition.TransitionListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Object f1423a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ArrayList f1424b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f1425c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ ArrayList f1426d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ x1 f1427e;

    public v1(x1 x1Var, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.f1427e = x1Var;
        this.f1423a = obj;
        this.f1424b = arrayList;
        this.f1425c = obj2;
        this.f1426d = arrayList2;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        x1 x1Var = this.f1427e;
        Object obj = this.f1423a;
        if (obj != null) {
            x1Var.A(obj, this.f1424b, null);
        }
        Object obj2 = this.f1425c;
        if (obj2 != null) {
            x1Var.A(obj2, this.f1426d, null);
        }
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
