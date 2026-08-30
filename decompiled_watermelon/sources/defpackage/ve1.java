package defpackage;

import android.util.Log;
import android.view.View;
import androidx.fragment.app.i;
import androidx.fragment.app.u;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ve1  reason: default package */
/* loaded from: classes.dex */
public final class ve1 implements l94 {
    public final /* synthetic */ i a;

    public ve1(i iVar) {
        this.a = iVar;
    }

    @Override // defpackage.l94
    public final void a(Object obj) {
        if (((fn3) obj) != null) {
            i iVar = this.a;
            if (iVar.c0) {
                View requireView = iVar.requireView();
                if (requireView.getParent() == null) {
                    if (iVar.g0 != null) {
                        if (u.K(3)) {
                            Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + iVar.g0);
                        }
                        iVar.g0.setContentView(requireView);
                        return;
                    }
                    return;
                }
                i.n("DialogFragment can not be attached to a container view");
            }
        }
    }
}
