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
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ax  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ax implements DialogInterface.OnClickListener {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;

    public /* synthetic */ ax(VideoPreferencesFragment videoPreferencesFragment, Preference preference) {
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
                ((AudioPreferencesFragment) obj).k(true);
                return;
            case 1:
                int i3 = EmulatorActivity.Z1;
                ((bk5) ((List) obj).get(i)).b.c();
                return;
            case 2:
                MacAddressPreference macAddressPreference = (MacAddressPreference) obj;
                zz3 zz3Var = macAddressPreference.B;
                if (zz3Var != null) {
                    str = zz3Var.toString();
                } else {
                    str = null;
                }
                if (macAddressPreference.callChangeListener(str)) {
                    macAddressPreference.persistString(str);
                }
                dialogInterface.dismiss();
                return;
            case 3:
                lw7 b = lw7.b((Context) obj);
                b.getClass();
                xd5 xd5Var = b.b.m;
                String concat = "CancelWorkByName_".concat("retroarch-shader-install");
                zb6 zb6Var = b.d.a;
                zb6Var.getClass();
                uj2.a0(xd5Var, concat, zb6Var, new oj0(b, 0));
                dialogInterface.dismiss();
                return;
            default:
                Preference preference = (Preference) obj;
                preference.getClass();
                ((InGameLockedSwitchPreference) preference).e(true);
                return;
        }
    }

    public /* synthetic */ ax(Object obj, int i) {
        this.A = i;
        this.B = obj;
    }
}
