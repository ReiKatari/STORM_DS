package defpackage;

import android.content.DialogInterface;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lu1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class lu1 implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int A;
    public final /* synthetic */ EmulatorActivity B;

    public /* synthetic */ lu1(EmulatorActivity emulatorActivity, int i) {
        this.A = i;
        this.B = emulatorActivity;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        int i = this.A;
        EmulatorActivity emulatorActivity = this.B;
        switch (i) {
            case 0:
                int i2 = EmulatorActivity.Z1;
                emulatorActivity.P0();
                return;
            case 1:
                int i3 = EmulatorActivity.Z1;
                emulatorActivity.W().T0();
                return;
            default:
                int i4 = EmulatorActivity.Z1;
                emulatorActivity.P0();
                return;
        }
    }
}
