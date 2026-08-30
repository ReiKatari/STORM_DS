package ah;

import android.net.Uri;
import android.os.Bundle;
import java.util.LinkedHashMap;
import me.magnum.melonds.common.camera.DSiCameraSource;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements mc.a {
    public final /* synthetic */ int A;
    public final /* synthetic */ EmulatorActivity B;

    public /* synthetic */ c(EmulatorActivity emulatorActivity, int i2) {
        this.A = i2;
        this.B = emulatorActivity;
    }

    @Override // mc.a
    public final Object b() {
        Bundle bundle;
        int i2 = this.A;
        yb.y yVar = yb.y.f14813a;
        EmulatorActivity emulatorActivity = this.B;
        switch (i2) {
            case 0:
                int i10 = EmulatorActivity.f9503a1;
                w6.d dVar = new w6.d(emulatorActivity.getDefaultViewModelCreationExtras());
                Uri data = emulatorActivity.getIntent().getData();
                if (data != null) {
                    x8.e eVar = androidx.lifecycle.s0.f1484c;
                    LinkedHashMap linkedHashMap = dVar.f14161a;
                    Bundle bundle2 = (Bundle) linkedHashMap.get(eVar);
                    if (bundle2 != null) {
                        bundle = new Bundle(bundle2);
                    } else {
                        bundle = new Bundle();
                    }
                    bundle.putString("uri", data.toString());
                    linkedHashMap.put(eVar, bundle);
                }
                return dVar;
            case DSiCameraSource.FrontCamera /* 1 */:
                emulatorActivity.Z0.F(hh.d.ACHIEVEMENTS_DIALOG);
                emulatorActivity.C().s();
                emulatorActivity.X0.setValue(Boolean.FALSE);
                return yVar;
            case 2:
                int i11 = EmulatorActivity.f9503a1;
                emulatorActivity.C().m(true);
                return yVar;
            case 3:
                emulatorActivity.Z0.F(hh.d.PENDING_SUBMISSION_CONFIRM_EXIT);
                emulatorActivity.C().s();
                emulatorActivity.Y0.setValue(Boolean.FALSE);
                return yVar;
            case 4:
                int i12 = EmulatorActivity.f9503a1;
                emulatorActivity.getWindow().addFlags(128);
                ih.f fVar = emulatorActivity.G0;
                if (fVar != null) {
                    fVar.L.setVisibility(8);
                }
                return yVar;
            default:
                int i13 = EmulatorActivity.f9503a1;
                emulatorActivity.getWindow().clearFlags(128);
                ih.f fVar2 = emulatorActivity.G0;
                if (fVar2 != null) {
                    fVar2.L.setVisibility(0);
                }
                return yVar;
        }
    }
}
