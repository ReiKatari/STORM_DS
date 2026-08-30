package defpackage;

import android.content.DialogInterface;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ms1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ms1 implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int A;
    public final /* synthetic */ r9 B;

    public /* synthetic */ ms1(r9 r9Var, int i) {
        this.A = i;
        this.B = r9Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        int i = this.A;
        r9 r9Var = this.B;
        switch (i) {
            case 0:
                ((os1) r9Var.b).j();
                return;
            case 1:
                ((os1) r9Var.b).j();
                return;
            case 2:
                ((os1) r9Var.b).j();
                return;
            case 3:
                ((os1) r9Var.b).j();
                return;
            default:
                ((os1) r9Var.b).j();
                return;
        }
    }
}
