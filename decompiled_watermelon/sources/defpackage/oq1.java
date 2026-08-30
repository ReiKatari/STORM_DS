package defpackage;

import android.content.DialogInterface;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: oq1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class oq1 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int A;
    public final /* synthetic */ EmulatorActivity B;

    public /* synthetic */ oq1(EmulatorActivity emulatorActivity, int i) {
        this.A = i;
        this.B = emulatorActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.A;
        EmulatorActivity emulatorActivity = this.B;
        switch (i2) {
            case 0:
                int i3 = EmulatorActivity.P1;
                emulatorActivity.finish();
                return;
            case 1:
                int i4 = EmulatorActivity.P1;
                dialogInterface.dismiss();
                emulatorActivity.finish();
                return;
            case 2:
                int i5 = EmulatorActivity.P1;
                dialogInterface.dismiss();
                emulatorActivity.finish();
                return;
            case 3:
                int i6 = EmulatorActivity.P1;
                hv1 U = emulatorActivity.U();
                p94 p94Var = p94.SYNC_NOW;
                U.getClass();
                p94Var.getClass();
                gs0 gs0Var = U.m0;
                if (gs0Var != null) {
                    gs0Var.c0(p94Var);
                    return;
                }
                return;
            default:
                int i7 = EmulatorActivity.P1;
                hv1 U2 = emulatorActivity.U();
                p94 p94Var2 = p94.CONTINUE_OFFLINE;
                U2.getClass();
                p94Var2.getClass();
                gs0 gs0Var2 = U2.m0;
                if (gs0Var2 != null) {
                    gs0Var2.c0(p94Var2);
                    return;
                }
                return;
        }
    }
}
