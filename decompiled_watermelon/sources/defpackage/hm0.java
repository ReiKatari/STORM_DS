package defpackage;

import android.content.DialogInterface;
import java.util.Map;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
import me.magnum.melonds.ui.settings.preferences.FirmwareBirthdayPreference;
import me.magnum.melonds.ui.settings.preferences.FirmwareColourPickerPreference;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: hm0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class hm0 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int A;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.A) {
            case 0:
                dialogInterface.dismiss();
                return;
            case 1:
                int i2 = EmulatorActivity.P1;
                dialogInterface.cancel();
                return;
            case 2:
                Map map = FirmwareBirthdayPreference.A;
                dialogInterface.dismiss();
                return;
            case 3:
                Map map2 = FirmwareColourPickerPreference.B;
                dialogInterface.dismiss();
                return;
            case 4:
                dialogInterface.cancel();
                return;
            case 5:
                dialogInterface.dismiss();
                return;
            case ig7.b /* 6 */:
                dialogInterface.dismiss();
                return;
            case 7:
                dialogInterface.dismiss();
                return;
            default:
                dialogInterface.dismiss();
                return;
        }
    }
}
