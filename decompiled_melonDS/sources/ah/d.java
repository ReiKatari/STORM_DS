package ah;

import android.content.DialogInterface;
import me.magnum.melonds.common.camera.DSiCameraSource;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int A;
    public final /* synthetic */ EmulatorActivity B;

    public /* synthetic */ d(EmulatorActivity emulatorActivity, int i2) {
        this.A = i2;
        this.B = emulatorActivity;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        int i2 = this.A;
        EmulatorActivity emulatorActivity = this.B;
        switch (i2) {
            case 0:
                int i10 = EmulatorActivity.f9503a1;
                emulatorActivity.C().s();
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
                int i11 = EmulatorActivity.f9503a1;
                emulatorActivity.C().s();
                return;
            default:
                int i12 = EmulatorActivity.f9503a1;
                emulatorActivity.C().s();
                return;
        }
    }
}
