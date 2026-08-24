package me.magnum.melonds.ui.settings.fragments;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.preference.Preference;
import com.stormds.emulator.R;
import me.magnum.melonds.ui.settings.fragments.AboutPreferencesFragment;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class AboutPreferencesFragment extends Hilt_AboutPreferencesFragment implements q15 {
    @Override // defpackage.q15
    public final String getTitle() {
        String string = getString(R.string.about_app_title);
        string.getClass();
        return string;
    }

    @Override // defpackage.k15
    public final void onCreatePreferences(Bundle bundle, String str) {
        long j;
        setPreferencesFromResource(R.xml.pref_about, str);
        try {
            PackageInfo packageInfo = requireContext().getPackageManager().getPackageInfo(requireContext().getPackageName(), 0);
            String str2 = packageInfo.versionName;
            if (str2 == null) {
                str2 = "1.0.0";
            }
            if (Build.VERSION.SDK_INT >= 28) {
                j = packageInfo.getLongVersionCode();
            } else {
                j = packageInfo.versionCode;
            }
            Preference findPreference = findPreference("about_version");
            if (findPreference != null) {
                findPreference.setSummary("v" + str2 + " (Build " + j + ")");
            }
        } catch (Throwable unused) {
        }
        Preference findPreference2 = findPreference("about_github");
        if (findPreference2 != null) {
            findPreference2.setOnPreferenceClickListener(new y05(this) { // from class: p
                public final /* synthetic */ AboutPreferencesFragment B;

                {
                    this.B = this;
                }

                @Override // defpackage.y05
                public final void i(Preference preference) {
                    int i = r2;
                    AboutPreferencesFragment aboutPreferencesFragment = this.B;
                    switch (i) {
                        case 0:
                            aboutPreferencesFragment.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://github.com/ReiKatari/STORM_DS")));
                            return;
                        case 1:
                            aboutPreferencesFragment.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://4pda.to/forum/index.php?showuser=5768740")));
                            return;
                        case 2:
                            aboutPreferencesFragment.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://github.com/SapphireRhodonite/WatermelonDS")));
                            return;
                        default:
                            aboutPreferencesFragment.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://melonds.kuribo64.net/")));
                            return;
                    }
                }
            });
        }
        Preference findPreference3 = findPreference("credits_jpeacekeeper");
        if (findPreference3 != null) {
            findPreference3.setOnPreferenceClickListener(new y05(this) { // from class: p
                public final /* synthetic */ AboutPreferencesFragment B;

                {
                    this.B = this;
                }

                @Override // defpackage.y05
                public final void i(Preference preference) {
                    int i = r2;
                    AboutPreferencesFragment aboutPreferencesFragment = this.B;
                    switch (i) {
                        case 0:
                            aboutPreferencesFragment.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://github.com/ReiKatari/STORM_DS")));
                            return;
                        case 1:
                            aboutPreferencesFragment.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://4pda.to/forum/index.php?showuser=5768740")));
                            return;
                        case 2:
                            aboutPreferencesFragment.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://github.com/SapphireRhodonite/WatermelonDS")));
                            return;
                        default:
                            aboutPreferencesFragment.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://melonds.kuribo64.net/")));
                            return;
                    }
                }
            });
        }
        Preference findPreference4 = findPreference("credits_watermelonds");
        if (findPreference4 != null) {
            findPreference4.setOnPreferenceClickListener(new y05(this) { // from class: p
                public final /* synthetic */ AboutPreferencesFragment B;

                {
                    this.B = this;
                }

                @Override // defpackage.y05
                public final void i(Preference preference) {
                    int i = r2;
                    AboutPreferencesFragment aboutPreferencesFragment = this.B;
                    switch (i) {
                        case 0:
                            aboutPreferencesFragment.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://github.com/ReiKatari/STORM_DS")));
                            return;
                        case 1:
                            aboutPreferencesFragment.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://4pda.to/forum/index.php?showuser=5768740")));
                            return;
                        case 2:
                            aboutPreferencesFragment.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://github.com/SapphireRhodonite/WatermelonDS")));
                            return;
                        default:
                            aboutPreferencesFragment.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://melonds.kuribo64.net/")));
                            return;
                    }
                }
            });
        }
        Preference findPreference5 = findPreference("credits_melonds");
        if (findPreference5 != null) {
            findPreference5.setOnPreferenceClickListener(new y05(this) { // from class: p
                public final /* synthetic */ AboutPreferencesFragment B;

                {
                    this.B = this;
                }

                @Override // defpackage.y05
                public final void i(Preference preference) {
                    int i = r2;
                    AboutPreferencesFragment aboutPreferencesFragment = this.B;
                    switch (i) {
                        case 0:
                            aboutPreferencesFragment.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://github.com/ReiKatari/STORM_DS")));
                            return;
                        case 1:
                            aboutPreferencesFragment.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://4pda.to/forum/index.php?showuser=5768740")));
                            return;
                        case 2:
                            aboutPreferencesFragment.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://github.com/SapphireRhodonite/WatermelonDS")));
                            return;
                        default:
                            aboutPreferencesFragment.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://melonds.kuribo64.net/")));
                            return;
                    }
                }
            });
        }
    }
}
