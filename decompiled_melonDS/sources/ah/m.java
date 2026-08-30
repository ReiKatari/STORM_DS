package ah;

import android.content.DialogInterface;
import me.magnum.melonds.common.camera.DSiCameraSource;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
import me.magnum.melonds.ui.settings.preferences.FirmwareBirthdayPreference;
import me.magnum.melonds.ui.settings.preferences.FirmwareColourPickerPreference;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class m implements DialogInterface.OnClickListener {
    public final /* synthetic */ int A;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        switch (this.A) {
            case 0:
                int i10 = EmulatorActivity.f9503a1;
                dialogInterface.cancel();
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
                int i11 = EmulatorActivity.f9503a1;
                dialogInterface.cancel();
                return;
            case 2:
                dialogInterface.dismiss();
                return;
            case 3:
                Object obj = FirmwareBirthdayPreference.A;
                dialogInterface.dismiss();
                return;
            case 4:
                Object obj2 = FirmwareColourPickerPreference.B;
                dialogInterface.dismiss();
                return;
            case l1.c.f8511g /* 5 */:
                dialogInterface.dismiss();
                return;
            case l1.c.f8509e /* 6 */:
                dialogInterface.dismiss();
                return;
            case 7:
                dialogInterface.dismiss();
                return;
            default:
                dialogInterface.cancel();
                return;
        }
    }
}
