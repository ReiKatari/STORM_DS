package ci;

import android.content.Context;
import android.net.Uri;
import androidx.preference.Preference;
import androidx.preference.a0;
import androidx.preference.f0;
import com.smp.masterswitchpreference.MasterSwitchPreference;
import k7.w;
import me.magnum.melonds.R;
import me.magnum.melonds.ui.settings.preferences.StoragePickerPreference;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: d  reason: collision with root package name */
    public static final i f2893d = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final a0 f2894a;

    /* renamed from: b  reason: collision with root package name */
    public final sd.i f2895b;

    /* renamed from: c  reason: collision with root package name */
    public final sd.d f2896c;

    public k(a0 a0Var, sd.i iVar, sd.d dVar) {
        a0Var.getClass();
        iVar.getClass();
        dVar.getClass();
        this.f2894a = a0Var;
        this.f2895b = iVar;
        this.f2896c = dVar;
    }

    public static void a(Preference preference) {
        Object string;
        if (preference == null) {
            return;
        }
        i iVar = f2893d;
        w.f(preference, iVar);
        if (preference instanceof StoragePickerPreference) {
            StoragePickerPreference storagePickerPreference = (StoragePickerPreference) preference;
            Context context = storagePickerPreference.getContext();
            string = context.getSharedPreferences(f0.a(context), 0).getStringSet(storagePickerPreference.getKey(), null);
        } else if (preference instanceof MasterSwitchPreference) {
            MasterSwitchPreference masterSwitchPreference = (MasterSwitchPreference) preference;
            Context context2 = masterSwitchPreference.getContext();
            string = Boolean.valueOf(context2.getSharedPreferences(f0.a(context2), 0).getBoolean(masterSwitchPreference.getKey(), false));
        } else {
            Context context3 = preference.getContext();
            string = context3.getSharedPreferences(f0.a(context3), 0).getString(preference.getKey(), null);
        }
        iVar.a(preference, string);
    }

    public final void b(final StoragePickerPreference storagePickerPreference) {
        StoragePickerPreference.a aVar = storagePickerPreference.A;
        StoragePickerPreference.a aVar2 = StoragePickerPreference.a.FILE;
        a0 a0Var = this.f2894a;
        if (aVar == aVar2) {
            a(storagePickerPreference);
            h.c registerForActivityResult = a0Var.registerForActivityResult(new vd.a(storagePickerPreference.B, 1), new j(storagePickerPreference));
            registerForActivityResult.getClass();
            storagePickerPreference.setOnPreferenceClickListener(new bi.h(2, registerForActivityResult, storagePickerPreference));
            if (storagePickerPreference.L) {
                w.f(storagePickerPreference, new h(this, storagePickerPreference, 1));
                return;
            }
            return;
        }
        a(storagePickerPreference);
        h.c registerForActivityResult2 = a0Var.registerForActivityResult(new vd.a(storagePickerPreference.B, 0), new h.b() { // from class: ci.g
            @Override // h.b
            public final void a(Object obj) {
                Uri uri = (Uri) obj;
                if (uri == null) {
                    return;
                }
                k kVar = k.this;
                sd.d dVar = kVar.f2896c;
                StoragePickerPreference storagePickerPreference2 = storagePickerPreference;
                if (dVar.a(uri, storagePickerPreference2.B) == sd.c.OK) {
                    storagePickerPreference2.f(uri);
                    return;
                }
                bk.a aVar3 = new bk.a(kVar.f2894a.requireContext());
                aVar3.w(R.string.error_invalid_directory);
                aVar3.t(R.string.error_invalid_directory_description);
                aVar3.v(R.string.ok, null);
                ((l.d) aVar3.L).m = true;
                aVar3.y();
            }
        });
        registerForActivityResult2.getClass();
        storagePickerPreference.setOnPreferenceClickListener(new ah.e(3, registerForActivityResult2));
        if (storagePickerPreference.L) {
            w.f(storagePickerPreference, new h(this, storagePickerPreference, 0));
        }
    }
}
