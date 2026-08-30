package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import androidx.fragment.app.i;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: te1  reason: default package */
/* loaded from: classes.dex */
public final class te1 implements DialogInterface.OnCancelListener {
    public final /* synthetic */ i A;

    public te1(i iVar) {
        this.A = iVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        i iVar = this.A;
        Dialog dialog = iVar.g0;
        if (dialog != null) {
            iVar.onCancel(dialog);
        }
    }
}
