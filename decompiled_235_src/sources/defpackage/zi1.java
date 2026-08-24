package defpackage;

import android.app.Dialog;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.i;
import androidx.fragment.app.u;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zi1  reason: default package */
/* loaded from: classes.dex */
public final class zi1 implements fi4 {
    public final /* synthetic */ i a;

    public zi1(i iVar) {
        this.a = iVar;
    }

    @Override // defpackage.fi4
    public final void a(Object obj) {
        boolean z;
        Dialog dialog;
        Dialog dialog2;
        Dialog dialog3;
        if (((hu3) obj) != null) {
            i iVar = this.a;
            z = iVar.mShowsDialog;
            if (z) {
                View requireView = iVar.requireView();
                if (requireView.getParent() == null) {
                    dialog = iVar.mDialog;
                    if (dialog != null) {
                        if (u.K(3)) {
                            StringBuilder sb = new StringBuilder("DialogFragment ");
                            sb.append(this);
                            sb.append(" setting the content view on ");
                            dialog3 = iVar.mDialog;
                            sb.append(dialog3);
                            Log.d("FragmentManager", sb.toString());
                        }
                        dialog2 = iVar.mDialog;
                        dialog2.setContentView(requireView);
                        return;
                    }
                    return;
                }
                i.m("DialogFragment can not be attached to a container view");
            }
        }
    }
}
