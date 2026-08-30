package androidx.fragment.app;

import android.app.Dialog;
import android.content.DialogInterface;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class t implements DialogInterface.OnDismissListener {
    public final /* synthetic */ w A;

    public t(w wVar) {
        this.A = wVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        w wVar = this.A;
        Dialog dialog = wVar.f1432f0;
        if (dialog != null) {
            wVar.onDismiss(dialog);
        }
    }
}
