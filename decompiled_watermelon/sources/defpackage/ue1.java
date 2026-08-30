package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import androidx.fragment.app.i;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ue1  reason: default package */
/* loaded from: classes.dex */
public final class ue1 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ i A;

    public ue1(i iVar) {
        this.A = iVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        i iVar = this.A;
        Dialog dialog = iVar.g0;
        if (dialog != null) {
            iVar.onDismiss(dialog);
        }
    }
}
