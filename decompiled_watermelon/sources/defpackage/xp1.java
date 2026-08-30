package defpackage;

import android.content.DialogInterface;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xp1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class xp1 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int A;
    public final /* synthetic */ EmulatorActivity B;

    public /* synthetic */ xp1(EmulatorActivity emulatorActivity, int i) {
        this.A = i;
        this.B = emulatorActivity;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        int i = this.A;
        EmulatorActivity emulatorActivity = this.B;
        switch (i) {
            case 0:
                emulatorActivity.O1.M(ts1.PAUSE_MENU);
                return;
            case 1:
                emulatorActivity.O1.M(ts1.SWITCH_NEW_ROM_DIALOG);
                return;
            case 2:
                emulatorActivity.O1.M(ts1.PAUSE_MENU);
                return;
            default:
                int i2 = EmulatorActivity.P1;
                emulatorActivity.finish();
                return;
        }
    }
}
