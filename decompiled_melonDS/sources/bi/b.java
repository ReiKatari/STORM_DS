package bi;

import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.view.View;
import android.widget.TextView;
import java.util.List;
import me.magnum.melonds.common.camera.DSiCameraSource;
import me.magnum.melonds.ui.emulator.rewind.model.RewindSaveState;
import me.magnum.melonds.ui.settings.preferences.FirmwareColourPickerPreference;
import me.magnum.melonds.ui.settings.preferences.MacAddressPreference;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements View.OnClickListener {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;

    public /* synthetic */ b(mc.l lVar, w wVar) {
        this.A = 2;
        this.B = (nc.i) lVar;
        this.L = wVar;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [nc.i, mc.l] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i2 = this.A;
        Object obj = this.L;
        Object obj2 = this.B;
        switch (i2) {
            case 0:
                List list = e.f2279b0;
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(Uri.fromParts("package", ((ApplicationInfo) obj2).packageName, null));
                ((e) obj).startActivity(intent);
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
                a2.g gVar = (a2.g) obj2;
                ze.a aVar = ((t) obj).f2318z;
                if (aVar != null) {
                    gVar.k(aVar);
                    return;
                } else {
                    nc.k.f("rom");
                    throw null;
                }
            case 2:
                ?? r42 = (nc.i) obj2;
                ze.a aVar2 = ((w) obj).f2318z;
                if (aVar2 != null) {
                    r42.k(aVar2);
                    return;
                } else {
                    nc.k.f("rom");
                    throw null;
                }
            case 3:
                FirmwareColourPickerPreference firmwareColourPickerPreference = (FirmwareColourPickerPreference) obj2;
                l.g gVar2 = (l.g) obj;
                Object obj3 = FirmwareColourPickerPreference.B;
                Object tag = view.getTag();
                tag.getClass();
                int parseInt = Integer.parseInt((String) tag);
                firmwareColourPickerPreference.e(parseInt);
                if (firmwareColourPickerPreference.callChangeListener(Integer.valueOf(parseInt))) {
                    firmwareColourPickerPreference.persistInt(parseInt);
                }
                gVar2.dismiss();
                return;
            case 4:
                MacAddressPreference macAddressPreference = (MacAddressPreference) obj2;
                List list2 = oe.z.f10965b;
                oe.z z10 = l0.f.z(macAddressPreference.A);
                macAddressPreference.B = z10;
                ((TextView) ((jb.c) obj).L).setText(z10.toString());
                return;
            default:
                a2.c cVar = ((jh.c) obj2).f7903d;
                RewindSaveState rewindSaveState = ((jh.b) obj).f7902w;
                if (rewindSaveState != null) {
                    cVar.k(rewindSaveState);
                    return;
                } else {
                    nc.k.f("state");
                    throw null;
                }
        }
    }

    public /* synthetic */ b(int i2, Object obj, Object obj2) {
        this.A = i2;
        this.B = obj;
        this.L = obj2;
    }
}
