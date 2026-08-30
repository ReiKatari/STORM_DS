package ci;

import android.content.Context;
import android.net.Uri;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import androidx.preference.o;
import com.smp.masterswitchpreference.MasterSwitchPreference;
import java.util.ArrayList;
import java.util.Set;
import me.magnum.melonds.R;
import me.magnum.melonds.ui.settings.preferences.FirmwareBirthdayPreference;
import me.magnum.melonds.ui.settings.preferences.MacAddressPreference;
import me.magnum.melonds.ui.settings.preferences.StoragePickerPreference;
import q8.r;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements o {
    @Override // androidx.preference.o
    public final boolean a(Preference preference, Object obj) {
        Context context;
        int i2;
        CharSequence string;
        preference.getClass();
        if (preference instanceof ListPreference) {
            ListPreference listPreference = (ListPreference) preference;
            int e6 = listPreference.e(obj.toString());
            if (e6 >= 0) {
                string = listPreference.Z[e6];
            } else {
                string = listPreference.getContext().getString(R.string.not_set);
            }
            listPreference.setSummary(string);
            return true;
        } else if (preference instanceof StoragePickerPreference) {
            if (obj != null && (obj instanceof Set) && !((Set) obj).isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : (Iterable) obj) {
                    Context context2 = ((StoragePickerPreference) preference).getContext();
                    context2.getClass();
                    obj2.getClass();
                    String y10 = r.y(context2, Uri.parse((String) obj2));
                    if (y10 != null) {
                        arrayList.add(y10);
                    }
                }
                ((StoragePickerPreference) preference).setSummary(zb.l.Y(arrayList, "\n", null, null, null, 62));
                return true;
            }
            ((StoragePickerPreference) preference).setSummary(preference.getContext().getString(R.string.not_set));
            return true;
        } else if (preference instanceof FirmwareBirthdayPreference) {
            String str = (String) obj;
            if (str == null) {
                str = "01/01";
            }
            ((FirmwareBirthdayPreference) preference).setSummary(str);
            return true;
        } else if (preference instanceof MasterSwitchPreference) {
            obj.getClass();
            MasterSwitchPreference masterSwitchPreference = (MasterSwitchPreference) preference;
            if (((Boolean) obj).booleanValue()) {
                context = masterSwitchPreference.getContext();
                i2 = R.string.on;
            } else {
                context = masterSwitchPreference.getContext();
                i2 = R.string.off;
            }
            masterSwitchPreference.setSummary(context.getString(i2));
            return true;
        } else if (preference instanceof MacAddressPreference) {
            String str2 = (String) obj;
            MacAddressPreference macAddressPreference = (MacAddressPreference) preference;
            if (str2 == null) {
                str2 = macAddressPreference.getContext().getString(R.string.not_set);
                str2.getClass();
            }
            macAddressPreference.setSummary(str2);
            return true;
        } else {
            preference.setSummary(obj.toString());
            return true;
        }
    }
}
