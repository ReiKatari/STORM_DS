package me.magnum.melonds.ui.settings.fragments;

import android.content.Context;
import androidx.preference.Preference;
import androidx.preference.SeekBarPreference;
import androidx.preference.SwitchPreference;
import androidx.preference.o;
import me.magnum.melonds.R;
import me.magnum.melonds.common.camera.DSiCameraSource;
import me.magnum.melonds.domain.model.ConsoleType;
import me.magnum.melonds.domain.model.MicSource;
import me.magnum.melonds.ui.settings.fragments.CustomFirmwarePreferencesFragment;
import me.magnum.melonds.ui.settings.preferences.StoragePickerPreference;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements o {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9620a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f9621b;

    public /* synthetic */ a(VideoPreferencesFragment videoPreferencesFragment, StoragePickerPreference storagePickerPreference) {
        this.f9620a = 6;
        this.f9621b = storagePickerPreference;
    }

    @Override // androidx.preference.o
    public final boolean a(Preference preference, Object obj) {
        int i2;
        boolean z10;
        switch (this.f9620a) {
            case 0:
                AudioPreferencesFragment audioPreferencesFragment = (AudioPreferencesFragment) this.f9621b;
                preference.getClass();
                obj.getClass();
                if (((MicSource) pc.a.t((String) obj, MicSource.values())) == MicSource.DEVICE) {
                    Context requireContext = audioPreferencesFragment.requireContext();
                    requireContext.getClass();
                    if (aj.g.k(requireContext, "android.permission.RECORD_AUDIO") != 0) {
                        audioPreferencesFragment.h(false);
                        return false;
                    }
                }
                return true;
            case DSiCameraSource.FrontCamera /* 1 */:
                CustomFirmwarePreferencesFragment customFirmwarePreferencesFragment = (CustomFirmwarePreferencesFragment) this.f9621b;
                preference.getClass();
                obj.getClass();
                ConsoleType consoleType = (ConsoleType) pc.a.t((String) obj, ConsoleType.values());
                if (((gi.b) customFirmwarePreferencesFragment.Y.getValue()).f5672b.b(consoleType).f10937b == oe.h.VALID) {
                    return true;
                }
                int i10 = CustomFirmwarePreferencesFragment.WhenMappings.f9587a[consoleType.ordinal()];
                if (i10 != 1) {
                    if (i10 == 2) {
                        i2 = R.string.dsi_incorrect_bios_dir_info;
                    } else {
                        m9.o.o();
                        return false;
                    }
                } else {
                    i2 = R.string.ds_incorrect_bios_dir_info;
                }
                bk.a aVar = new bk.a(customFirmwarePreferencesFragment.requireContext());
                aVar.t(i2);
                aVar.v(R.string.ok, null);
                aVar.y();
                return true;
            case 2:
                preference.getClass();
                obj.getClass();
                int intValue = ((Integer) obj).intValue();
                ce.c cVar = ((InputPreferencesFragment) this.f9621b).Y;
                if (cVar != null) {
                    ce.b bVar = cVar.f2870a;
                    int i11 = 100;
                    if (!bVar.d()) {
                        i11 = (int) (100 * (intValue / 100.0f) * 2.0f);
                    }
                    bVar.e(i11, p7.j.g(intValue, 1, 255));
                    return true;
                }
                nc.k.f("vibrator");
                throw null;
            case 3:
                SwitchPreference switchPreference = (SwitchPreference) this.f9621b;
                preference.getClass();
                obj.getClass();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                switchPreference.setEnabled(!booleanValue);
                if (booleanValue) {
                    switchPreference.e(true);
                }
                return true;
            case 4:
                preference.getClass();
                obj.getClass();
                ((RomsPreferencesFragment) this.f9621b).i((SeekBarPreference) preference, ((Integer) obj).intValue());
                return true;
            case l1.c.f8511g /* 5 */:
                preference.getClass();
                obj.getClass();
                ((VideoPreferencesFragment) this.f9621b).i((String) obj);
                return true;
            default:
                StoragePickerPreference storagePickerPreference = (StoragePickerPreference) this.f9621b;
                preference.getClass();
                obj.getClass();
                if (((qe.a) pc.a.t((String) obj, qe.a.values())) == qe.a.STATIC_IMAGE) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                storagePickerPreference.setEnabled(z10);
                return true;
        }
    }

    public /* synthetic */ a(int i2, Object obj) {
        this.f9620a = i2;
        this.f9621b = obj;
    }
}
