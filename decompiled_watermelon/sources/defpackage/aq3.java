package defpackage;

import android.content.DialogInterface;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: aq3  reason: default package */
/* loaded from: classes.dex */
public final class aq3 implements DialogInterface.OnClickListener {
    public final /* synthetic */ bq3 A;

    public aq3(bq3 bq3Var) {
        this.A = bq3Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        bq3 bq3Var = this.A;
        bq3Var.t0 = i;
        bq3Var.s0 = -1;
        dialogInterface.dismiss();
    }
}
