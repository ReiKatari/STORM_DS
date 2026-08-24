package defpackage;

import android.content.DialogInterface;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fu1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class fu1 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int A;
    public final /* synthetic */ EmulatorActivity B;

    public /* synthetic */ fu1(EmulatorActivity emulatorActivity, int i) {
        this.A = i;
        this.B = emulatorActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.A;
        EmulatorActivity emulatorActivity = this.B;
        switch (i2) {
            case 0:
                int i3 = EmulatorActivity.Z1;
                sz1 W = emulatorActivity.W();
                mi4 mi4Var = mi4.SYNC_NOW;
                W.getClass();
                mi4Var.getClass();
                tu0 tu0Var = W.m0;
                if (tu0Var != null) {
                    tu0Var.b0(mi4Var);
                    return;
                }
                return;
            case 1:
                int i4 = EmulatorActivity.Z1;
                sz1 W2 = emulatorActivity.W();
                mi4 mi4Var2 = mi4.CONTINUE_OFFLINE;
                W2.getClass();
                mi4Var2.getClass();
                tu0 tu0Var2 = W2.m0;
                if (tu0Var2 != null) {
                    tu0Var2.b0(mi4Var2);
                    return;
                }
                return;
            case 2:
                int i5 = EmulatorActivity.Z1;
                emulatorActivity.finish();
                return;
            case 3:
                int i6 = EmulatorActivity.Z1;
                dialogInterface.dismiss();
                emulatorActivity.finish();
                return;
            default:
                int i7 = EmulatorActivity.Z1;
                dialogInterface.dismiss();
                emulatorActivity.finish();
                return;
        }
    }
}
