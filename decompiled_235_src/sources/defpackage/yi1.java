package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import androidx.fragment.app.i;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yi1  reason: default package */
/* loaded from: classes.dex */
public final class yi1 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ i A;

    public yi1(i iVar) {
        this.A = iVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Dialog dialog;
        Dialog dialog2;
        i iVar = this.A;
        dialog = iVar.mDialog;
        if (dialog != null) {
            dialog2 = iVar.mDialog;
            iVar.onDismiss(dialog2);
        }
    }
}
