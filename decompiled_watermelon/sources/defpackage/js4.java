package defpackage;

import android.content.Context;
import android.net.Uri;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import com.smp.masterswitchpreference.MasterSwitchPreference;
import java.util.ArrayList;
import java.util.Set;
import me.magnum.melonds.ui.settings.preferences.FirmwareBirthdayPreference;
import me.magnum.melonds.ui.settings.preferences.MacAddressPreference;
import me.magnum.melonds.ui.settings.preferences.StoragePickerPreference;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: js4  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class js4 implements ur4 {
    @Override // defpackage.ur4
    public final boolean a(Preference preference, Object obj) {
        String string;
        Context context;
        int i;
        String str;
        int i2;
        CharSequence string2;
        preference.getClass();
        if (preference instanceof ListPreference) {
            if (obj instanceof String) {
                str = (String) obj;
            } else {
                str = null;
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
            return true;
        } else if (preference instanceof StoragePickerPreference) {
            if (obj != null && (obj instanceof Set) && !((Set) obj).isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : (Iterable) obj) {
                    Context context2 = ((StoragePickerPreference) preference).getContext();
                    context2.getClass();
                    obj2.getClass();
                    String C = f34.C(context2, Uri.parse((String) obj2));
                    if (C != null) {
                        arrayList.add(C);
                    }
                }
                ((StoragePickerPreference) preference).setSummary(tq0.S0(arrayList, "\n", null, null, null, 62));
                return true;
            }
            ((StoragePickerPreference) preference).setSummary(preference.getContext().getString(R.string.not_set));
            return true;
        } else if (preference instanceof FirmwareBirthdayPreference) {
            String str2 = (String) obj;
            if (str2 == null) {
                str2 = "01/01";
            }
            ((FirmwareBirthdayPreference) preference).setSummary(str2);
            return true;
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
            return true;
        } else if (preference instanceof MacAddressPreference) {
            String str3 = (String) obj;
            MacAddressPreference macAddressPreference = (MacAddressPreference) preference;
            if (str3 == null) {
                str3 = macAddressPreference.getContext().getString(R.string.not_set);
                str3.getClass();
            }
            macAddressPreference.setSummary(str3);
            return true;
        } else {
            if (obj == null || (string = obj.toString()) == null) {
                string = preference.getContext().getString(R.string.not_set);
                string.getClass();
            }
            preference.setSummary(string);
            return true;
        }
    }
}
