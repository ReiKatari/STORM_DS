package defpackage;

import android.content.DialogInterface;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: yp1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class yp1 implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int A;
    public final /* synthetic */ EmulatorActivity B;

    public /* synthetic */ yp1(EmulatorActivity emulatorActivity, int i) {
        this.A = i;
        this.B = emulatorActivity;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        int i = this.A;
        EmulatorActivity emulatorActivity = this.B;
        switch (i) {
            case 0:
                int i2 = EmulatorActivity.P1;
                emulatorActivity.L0();
                return;
            case 1:
                int i3 = EmulatorActivity.P1;
                emulatorActivity.U().V0();
                return;
            default:
                int i4 = EmulatorActivity.P1;
                emulatorActivity.L0();
                return;
        }
    }
}
