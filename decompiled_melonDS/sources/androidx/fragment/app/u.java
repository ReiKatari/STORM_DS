package androidx.fragment.app;

import android.util.Log;
import android.view.View;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class u implements androidx.lifecycle.g0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ w f1418a;

    public u(w wVar) {
        this.f1418a = wVar;
    }

    @Override // androidx.lifecycle.g0
    public final void a(Object obj) {
        if (((androidx.lifecycle.x) obj) != null) {
            w wVar = this.f1418a;
            if (wVar.f1428b0) {
                View requireView = wVar.requireView();
                if (requireView.getParent() == null) {
                    if (wVar.f1432f0 != null) {
                        if (g1.K(3)) {
                            Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + wVar.f1432f0);
                        }
                        wVar.f1432f0.setContentView(requireView);
                        return;
                    }
                    return;
                }
                a0.j.p("DialogFragment can not be attached to a container view");
            }
        }
    }
}
