package defpackage;

import android.content.DialogInterface;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yw1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class yw1 implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int A;
    public final /* synthetic */ s9 B;

    public /* synthetic */ yw1(s9 s9Var, int i) {
        this.A = i;
        this.B = s9Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        int i = this.A;
        s9 s9Var = this.B;
        switch (i) {
            case 0:
                ((ax1) s9Var.b).d();
                return;
            case 1:
                ((ax1) s9Var.b).d();
                return;
            case 2:
                ((ax1) s9Var.b).d();
                return;
            case 3:
                ((ax1) s9Var.b).d();
                return;
            default:
                ((ax1) s9Var.b).d();
                return;
        }
    }
}
