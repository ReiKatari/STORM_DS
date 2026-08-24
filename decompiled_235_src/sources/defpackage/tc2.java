package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.preference.Preference;
import java.util.List;
import me.magnum.melonds.ui.settings.preferences.FirmwareColourPickerPreference;
import me.magnum.melonds.ui.settings.preferences.MacAddressPreference;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tc2  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class tc2 implements View.OnClickListener {
    public final /* synthetic */ int A;
    public final /* synthetic */ Preference B;
    public final /* synthetic */ Object L;

    public /* synthetic */ tc2(Preference preference, Object obj, int i) {
        this.A = i;
        this.B = preference;
        this.L = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.A;
        Object obj = this.L;
        Preference preference = this.B;
        switch (i) {
            case 0:
                FirmwareColourPickerPreference firmwareColourPickerPreference = (FirmwareColourPickerPreference) preference;
                ac acVar = (ac) obj;
                List list = FirmwareColourPickerPreference.B;
                Object tag = view.getTag();
                tag.getClass();
                int parseInt = Integer.parseInt((String) tag);
                firmwareColourPickerPreference.e(parseInt);
                if (firmwareColourPickerPreference.callChangeListener(Integer.valueOf(parseInt))) {
                    firmwareColourPickerPreference.persistInt(parseInt);
                }
                acVar.dismiss();
                return;
            default:
                MacAddressPreference macAddressPreference = (MacAddressPreference) preference;
                List list2 = zz3.b;
                zz3 W = kn2.W(macAddressPreference.A);
                macAddressPreference.B = W;
                ((TextView) ((yc1) obj).B).setText(W.toString());
                return;
        }
    }
}
