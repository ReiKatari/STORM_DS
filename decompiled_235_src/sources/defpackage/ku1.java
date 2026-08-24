package defpackage;

import android.content.DialogInterface;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ku1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ku1 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int A;
    public final /* synthetic */ EmulatorActivity B;

    public /* synthetic */ ku1(EmulatorActivity emulatorActivity, int i) {
        this.A = i;
        this.B = emulatorActivity;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        int i = this.A;
        EmulatorActivity emulatorActivity = this.B;
        switch (i) {
            case 0:
                emulatorActivity.V1.T(ex1.PAUSE_MENU);
                return;
            case 1:
                emulatorActivity.V1.T(ex1.SWITCH_NEW_ROM_DIALOG);
                return;
            case 2:
                emulatorActivity.V1.T(ex1.PAUSE_MENU);
                return;
            default:
                int i2 = EmulatorActivity.Z1;
                emulatorActivity.finish();
                return;
        }
    }
}
