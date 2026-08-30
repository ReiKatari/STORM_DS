package me.magnum.melonds.ui.settings.fragments;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.PowerManager;
import androidx.fragment.app.b1;
import androidx.preference.Preference;
import androidx.preference.SwitchPreference;
import androidx.preference.o;
import androidx.preference.p;
import com.smp.masterswitchpreference.MasterSwitchPreference;
import kf.x1;
import me.magnum.melonds.R;
import yb.n;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class GeneralPreferencesFragment extends Hilt_GeneralPreferencesFragment implements ci.l {
    public final n Y = new n(new e(this, 2));
    public sd.i Z;

    /* renamed from: b0  reason: collision with root package name */
    public sd.d f9590b0;

    /* renamed from: c0  reason: collision with root package name */
    public x1 f9591c0;

    /* renamed from: d0  reason: collision with root package name */
    public MasterSwitchPreference f9592d0;

    /* renamed from: e0  reason: collision with root package name */
    public final h.c f9593e0;

    /* renamed from: f0  reason: collision with root package name */
    public final h.c f9594f0;

    public GeneralPreferencesFragment() {
        h.c registerForActivityResult = registerForActivityResult(new b1(1), new f(this, 0));
        registerForActivityResult.getClass();
        this.f9593e0 = registerForActivityResult;
        h.c registerForActivityResult2 = registerForActivityResult(new b1(1), new f(this, 1));
        registerForActivityResult2.getClass();
        this.f9594f0 = registerForActivityResult2;
    }

    @Override // ci.l
    public final String getTitle() {
        String string = getString(R.string.category_general);
        string.getClass();
        return string;
    }

    @Override // androidx.preference.a0
    public final void onCreatePreferences(Bundle bundle, String str) {
        setPreferencesFromResource(R.xml.pref_general, str);
        addPreferencesFromResource(R.xml.pref_general_updates);
        Preference findPreference = findPreference("enable_rewind");
        findPreference.getClass();
        this.f9592d0 = (MasterSwitchPreference) findPreference;
        Preference findPreference2 = findPreference("enable_sustained_performance");
        findPreference2.getClass();
        SwitchPreference switchPreference = (SwitchPreference) findPreference2;
        ci.k kVar = (ci.k) this.Y.getValue();
        MasterSwitchPreference masterSwitchPreference = this.f9592d0;
        if (masterSwitchPreference != null) {
            kVar.getClass();
            ci.k.a(masterSwitchPreference);
            Context requireContext = requireContext();
            requireContext.getClass();
            Object systemService = requireContext.getSystemService("power");
            systemService.getClass();
            switchPreference.setVisible(((PowerManager) systemService).isSustainedPerformanceModeSupported());
            Preference findPreference3 = findPreference("backup_settings");
            if (findPreference3 != null) {
                findPreference3.setOnPreferenceClickListener(new p(this) { // from class: me.magnum.melonds.ui.settings.fragments.g
                    public final /* synthetic */ GeneralPreferencesFragment B;

                    {
                        this.B = this;
                    }

                    @Override // androidx.preference.p
                    public final void a(Preference preference) {
                        switch (r2) {
                            case 0:
                                this.B.f9593e0.a(null);
                                return;
                            default:
                                this.B.f9594f0.a(null);
                                return;
                        }
                    }
                });
            }
            Preference findPreference4 = findPreference("restore_settings");
            if (findPreference4 != null) {
                findPreference4.setOnPreferenceClickListener(new p(this) { // from class: me.magnum.melonds.ui.settings.fragments.g
                    public final /* synthetic */ GeneralPreferencesFragment B;

                    {
                        this.B = this;
                    }

                    @Override // androidx.preference.p
                    public final void a(Preference preference) {
                        switch (r2) {
                            case 0:
                                this.B.f9593e0.a(null);
                                return;
                            default:
                                this.B.f9594f0.a(null);
                                return;
                        }
                    }
                });
                return;
            }
            return;
        }
        nc.k.f("rewindPreference");
        throw null;
    }

    @Override // androidx.fragment.app.j0
    public final void onResume() {
        super.onResume();
        MasterSwitchPreference masterSwitchPreference = this.f9592d0;
        Boolean bool = null;
        if (masterSwitchPreference != null) {
            o onPreferenceChangeListener = masterSwitchPreference.getOnPreferenceChangeListener();
            if (onPreferenceChangeListener != null) {
                MasterSwitchPreference masterSwitchPreference2 = this.f9592d0;
                if (masterSwitchPreference2 != null) {
                    if (masterSwitchPreference2 != null) {
                        SharedPreferences sharedPreferences = masterSwitchPreference2.getSharedPreferences();
                        if (sharedPreferences != null) {
                            MasterSwitchPreference masterSwitchPreference3 = this.f9592d0;
                            if (masterSwitchPreference3 != null) {
                                bool = Boolean.valueOf(sharedPreferences.getBoolean(masterSwitchPreference3.getKey(), false));
                            } else {
                                nc.k.f("rewindPreference");
                                throw null;
                            }
                        }
                        onPreferenceChangeListener.a(masterSwitchPreference2, bool);
                        return;
                    }
                    nc.k.f("rewindPreference");
                    throw null;
                }
                nc.k.f("rewindPreference");
                throw null;
            }
            return;
        }
        nc.k.f("rewindPreference");
        throw null;
    }
}
