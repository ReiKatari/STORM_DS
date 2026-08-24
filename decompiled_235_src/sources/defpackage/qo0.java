package defpackage;

import android.content.DialogInterface;
import java.util.List;
import java.util.Map;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
import me.magnum.melonds.ui.settings.preferences.FirmwareBirthdayPreference;
import me.magnum.melonds.ui.settings.preferences.FirmwareColourPickerPreference;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qo0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class qo0 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int A;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.A) {
            case 0:
                dialogInterface.dismiss();
                return;
            case 1:
                int i2 = EmulatorActivity.Z1;
                dialogInterface.cancel();
                return;
            case 2:
                Map map = FirmwareBirthdayPreference.A;
                dialogInterface.dismiss();
                return;
            case 3:
                List list = FirmwareColourPickerPreference.B;
                dialogInterface.dismiss();
                return;
            case 4:
                dialogInterface.dismiss();
                return;
            case 5:
                dialogInterface.dismiss();
                return;
            default:
                dialogInterface.dismiss();
                return;
        }
    }
}
