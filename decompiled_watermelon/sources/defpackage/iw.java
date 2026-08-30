package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import androidx.preference.Preference;
import java.util.List;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
import me.magnum.melonds.ui.settings.fragments.AudioPreferencesFragment;
import me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment;
import me.magnum.melonds.ui.settings.preferences.InGameLockedSwitchPreference;
import me.magnum.melonds.ui.settings.preferences.MacAddressPreference;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: iw  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class iw implements DialogInterface.OnClickListener {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;

    public /* synthetic */ iw(VideoPreferencesFragment videoPreferencesFragment, Preference preference) {
        this.A = 4;
        this.B = preference;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        String str;
        int i2 = this.A;
        Object obj = this.B;
        switch (i2) {
            case 0:
                ((AudioPreferencesFragment) obj).j(true);
                return;
            case 1:
                int i3 = EmulatorActivity.P1;
                ((ja5) ((List) obj).get(i)).b.c();
                return;
            case 2:
                MacAddressPreference macAddressPreference = (MacAddressPreference) obj;
                vs3 vs3Var = macAddressPreference.B;
                if (vs3Var != null) {
                    str = vs3Var.toString();
                } else {
                    str = null;
                }
                if (macAddressPreference.callChangeListener(str)) {
                    macAddressPreference.persistString(str);
                }
                dialogInterface.dismiss();
                return;
            case 3:
                kh7 b = kh7.b((Context) obj);
                b.getClass();
                y60 y60Var = b.b.m;
                String concat = "CancelWorkByName_".concat("retroarch-shader-install");
                k06 k06Var = b.d.a;
                k06Var.getClass();
                yf2.G(y60Var, concat, k06Var, new fh0(b, 0));
                dialogInterface.dismiss();
                return;
            default:
                Preference preference = (Preference) obj;
                preference.getClass();
                ((InGameLockedSwitchPreference) preference).e(true);
                return;
        }
    }

    public /* synthetic */ iw(int i, Object obj) {
        this.A = i;
        this.B = obj;
    }
}
