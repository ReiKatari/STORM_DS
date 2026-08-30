package ah;

import me.magnum.melonds.common.camera.DSiCameraSource;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ EmulatorActivity B;

    public /* synthetic */ h(EmulatorActivity emulatorActivity, int i2) {
        this.A = i2;
        this.B = emulatorActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.A;
        EmulatorActivity emulatorActivity = this.B;
        switch (i2) {
            case 0:
                int i10 = EmulatorActivity.f9503a1;
                emulatorActivity.E();
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
                int i11 = EmulatorActivity.f9503a1;
                emulatorActivity.F();
                return;
            case 2:
                int i12 = EmulatorActivity.f9503a1;
                emulatorActivity.E();
                return;
            default:
                int i13 = EmulatorActivity.f9503a1;
                emulatorActivity.E();
                return;
        }
    }
}
