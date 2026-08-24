package defpackage;

import android.content.Context;
import android.net.Uri;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import com.smp.masterswitchpreference.MasterSwitchPreference;
import com.stormds.emulator.R;
import java.util.ArrayList;
import java.util.Set;
import me.magnum.melonds.ui.settings.preferences.FirmwareBirthdayPreference;
import me.magnum.melonds.ui.settings.preferences.MacAddressPreference;
import me.magnum.melonds.ui.settings.preferences.StoragePickerPreference;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: l15  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class l15 implements x05 {
    public final /* synthetic */ int a;

    public /* synthetic */ l15(int i) {
        this.a = i;
    }

    @Override // defpackage.x05
    public final boolean a(Preference preference, Object obj) {
        String string;
        Context context;
        int i;
        int i2;
        CharSequence string2;
        String str = null;
        switch (this.a) {
            case 0:
                preference.getClass();
                if (preference instanceof ListPreference) {
                    if (obj instanceof String) {
                        str = (String) obj;
                    }
                    if (str != null) {
                        i2 = ((ListPreference) preference).e(str);
                    } else {
                        i2 = -1;
                    }
                    if (i2 >= 0) {
                        string2 = ((ListPreference) preference).Z[i2];
                    } else {
                        string2 = ((ListPreference) preference).getContext().getString(R.string.not_set);
                    }
                    ((ListPreference) preference).setSummary(string2);
                } else if (preference instanceof StoragePickerPreference) {
                    if (obj != null && (obj instanceof Set) && !((Set) obj).isEmpty()) {
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : (Iterable) obj) {
                            Context context2 = ((StoragePickerPreference) preference).getContext();
                            context2.getClass();
                            obj2.getClass();
                            String s = l.s(context2, Uri.parse((String) obj2));
                            if (s != null) {
                                arrayList.add(s);
                            }
                        }
                        ((StoragePickerPreference) preference).setSummary(gt0.P0(arrayList, "\n", null, null, null, 62));
                    } else {
                        ((StoragePickerPreference) preference).setSummary(preference.getContext().getString(R.string.not_set));
                    }
                } else if (preference instanceof FirmwareBirthdayPreference) {
                    String str2 = (String) obj;
                    if (str2 == null) {
                        str2 = "01/01";
                    }
                    ((FirmwareBirthdayPreference) preference).setSummary(str2);
                } else if (preference instanceof MasterSwitchPreference) {
                    obj.getClass();
                    MasterSwitchPreference masterSwitchPreference = (MasterSwitchPreference) preference;
                    if (((Boolean) obj).booleanValue()) {
                        context = masterSwitchPreference.getContext();
                        i = R.string.on;
                    } else {
                        context = masterSwitchPreference.getContext();
                        i = R.string.off;
                    }
                    masterSwitchPreference.setSummary(context.getString(i));
                } else if (preference instanceof MacAddressPreference) {
                    String str3 = (String) obj;
                    MacAddressPreference macAddressPreference = (MacAddressPreference) preference;
                    if (str3 == null) {
                        str3 = macAddressPreference.getContext().getString(R.string.not_set);
                        str3.getClass();
                    }
                    macAddressPreference.setSummary(str3);
                } else {
                    if (obj == null || (string = obj.toString()) == null) {
                        string = preference.getContext().getString(R.string.not_set);
                        string.getClass();
                    }
                    preference.setSummary(string);
                }
                return true;
            default:
                preference.getClass();
                if (obj instanceof String) {
                    str = (String) obj;
                }
                if (str == null) {
                    str = "default";
                }
                if (str.equals("default")) {
                    tq.j(hy3.b);
                } else {
                    tq.j(hy3.a(str));
                }
                return true;
        }
    }
}
