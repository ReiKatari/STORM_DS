package ci;

import android.net.Uri;
import androidx.preference.Preference;
import androidx.preference.SeekBarPreference;
import androidx.preference.o;
import java.util.Set;
import me.magnum.melonds.R;
import me.magnum.melonds.common.camera.DSiCameraSource;
import me.magnum.melonds.ui.settings.fragments.AudioPreferencesFragment;
import me.magnum.melonds.ui.settings.preferences.StoragePickerPreference;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements o {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2890a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f2891b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Preference f2892c;

    public /* synthetic */ h(Object obj, Preference preference, int i2) {
        this.f2890a = i2;
        this.f2891b = obj;
        this.f2892c = preference;
    }

    @Override // androidx.preference.o
    public final boolean a(Preference preference, Object obj) {
        Set set;
        String str;
        Set set2;
        String str2;
        switch (this.f2890a) {
            case 0:
                k kVar = (k) this.f2891b;
                StoragePickerPreference storagePickerPreference = (StoragePickerPreference) this.f2892c;
                preference.getClass();
                if (obj instanceof Set) {
                    set = (Set) obj;
                } else {
                    set = null;
                }
                if (set != null && (str = (String) zb.l.S(set)) != null) {
                    sd.i iVar = kVar.f2895b;
                    Uri parse = Uri.parse(str);
                    sd.f fVar = storagePickerPreference.B;
                    iVar.getClass();
                    parse.getClass();
                    fVar.getClass();
                    iVar.f12874a.getContentResolver().takePersistableUriPermission(parse, fVar.toFlags());
                    return false;
                }
                return false;
            case DSiCameraSource.FrontCamera /* 1 */:
                k kVar2 = (k) this.f2891b;
                StoragePickerPreference storagePickerPreference2 = (StoragePickerPreference) this.f2892c;
                preference.getClass();
                if (obj instanceof Set) {
                    set2 = (Set) obj;
                } else {
                    set2 = null;
                }
                if (set2 != null && (str2 = (String) zb.l.S(set2)) != null) {
                    kVar2.f2895b.a(Uri.parse(str2), storagePickerPreference2.B);
                    return true;
                }
                return true;
            default:
                SeekBarPreference seekBarPreference = (SeekBarPreference) this.f2892c;
                preference.getClass();
                obj.getClass();
                seekBarPreference.setSummary(((AudioPreferencesFragment) this.f2891b).getString(R.string.volume_percentage, Integer.valueOf((int) ((((Integer) obj).intValue() / seekBarPreference.L) * 100.0f))));
                return true;
        }
    }
}
