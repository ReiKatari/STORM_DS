package defpackage;

import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.view.View;
import android.widget.TextView;
import java.util.List;
import java.util.Map;
import me.magnum.melonds.ui.settings.preferences.FirmwareColourPickerPreference;
import me.magnum.melonds.ui.settings.preferences.MacAddressPreference;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: b82  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class b82 implements View.OnClickListener {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;

    public /* synthetic */ b82(int i, Object obj, Object obj2) {
        this.A = i;
        this.B = obj;
        this.L = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.A;
        Object obj = this.L;
        Object obj2 = this.B;
        switch (i) {
            case 0:
                FirmwareColourPickerPreference firmwareColourPickerPreference = (FirmwareColourPickerPreference) obj2;
                tb tbVar = (tb) obj;
                Map map = FirmwareColourPickerPreference.B;
                Object tag = view.getTag();
                tag.getClass();
                int parseInt = Integer.parseInt((String) tag);
                firmwareColourPickerPreference.e(parseInt);
                if (firmwareColourPickerPreference.callChangeListener(Integer.valueOf(parseInt))) {
                    firmwareColourPickerPreference.persistInt(parseInt);
                }
                tbVar.dismiss();
                return;
            case 1:
                MacAddressPreference macAddressPreference = (MacAddressPreference) obj2;
                List list = vs3.b;
                vs3 N = mj2.N(macAddressPreference.A);
                macAddressPreference.B = N;
                ((TextView) ((k91) obj).B).setText(N.toString());
                return;
            default:
                List list2 = f74.c0;
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(Uri.fromParts("package", ((ApplicationInfo) obj2).packageName, null));
                ((f74) obj).startActivity(intent);
                return;
        }
    }
}
