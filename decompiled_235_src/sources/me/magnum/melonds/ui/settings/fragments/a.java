package me.magnum.melonds.ui.settings.fragments;

import android.app.ProgressDialog;
import android.content.Context;
import android.net.Uri;
import androidx.preference.Preference;
import com.stormds.emulator.R;
import java.util.ArrayList;
import java.util.List;
import me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment;
import me.magnum.melonds.ui.settings.preferences.BiosDirectoryPickerPreference;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements y05, VideoPreferencesFragment.ShaderDirectoryLister {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Comparable L;

    public /* synthetic */ a(Object obj, Comparable comparable, int i) {
        this.A = i;
        this.B = obj;
        this.L = comparable;
    }

    @Override // me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment.ShaderDirectoryLister
    public List a(String str) {
        VideoPreferencesFragment.ShaderBrowserEntry shaderBrowserEntry;
        str.getClass();
        zl1 h = zl1.h((Context) this.B, (Uri) this.L);
        if (!qs6.v0(str)) {
            for (String str2 : qs6.J0(str, new char[]{'/'}, 6)) {
                if (qs6.v0(str2)) {
                    break;
                }
                h = h.f(str2);
                if (h == null) {
                    break;
                }
            }
        }
        if (h.k()) {
            zl1[] o = h.o();
            o.getClass();
            ArrayList arrayList = new ArrayList();
            for (zl1 zl1Var : o) {
                String i = zl1Var.i();
                if (i == null) {
                    shaderBrowserEntry = null;
                } else {
                    shaderBrowserEntry = new VideoPreferencesFragment.ShaderBrowserEntry(i, zl1Var.k());
                }
                if (shaderBrowserEntry != null) {
                    arrayList.add(shaderBrowserEntry);
                }
            }
            return arrayList;
        }
        return yt1.A;
    }

    @Override // defpackage.y05
    public void i(Preference preference) {
        int i = this.A;
        Comparable comparable = this.L;
        CustomFirmwarePreferencesFragment customFirmwarePreferencesFragment = (CustomFirmwarePreferencesFragment) this.B;
        BiosDirectoryPickerPreference biosDirectoryPickerPreference = (BiosDirectoryPickerPreference) comparable;
        switch (i) {
            case 0:
                ProgressDialog progressDialog = new ProgressDialog(customFirmwarePreferencesFragment.requireContext());
                progressDialog.setTitle(customFirmwarePreferencesFragment.getString(R.string.auto_download_ds_bios_title));
                progressDialog.setMessage("Загрузка и настройка bios7.bin, bios9.bin, firmware.bin...");
                progressDialog.setProgressStyle(1);
                progressDialog.setMax(100);
                progressDialog.setCancelable(false);
                progressDialog.show();
                hv.L(bl2.C(customFirmwarePreferencesFragment), null, null, new CustomFirmwarePreferencesFragment$onCreatePreferences$1$1(customFirmwarePreferencesFragment, progressDialog, biosDirectoryPickerPreference, null), 3);
                return;
            default:
                ProgressDialog progressDialog2 = new ProgressDialog(customFirmwarePreferencesFragment.requireContext());
                progressDialog2.setTitle(customFirmwarePreferencesFragment.getString(R.string.auto_download_dsi_bios_title));
                progressDialog2.setMessage("Загрузка и настройка bios7.bin, bios9.bin, firmware.bin, nand.bin...");
                progressDialog2.setProgressStyle(1);
                progressDialog2.setMax(100);
                progressDialog2.setCancelable(false);
                progressDialog2.show();
                hv.L(bl2.C(customFirmwarePreferencesFragment), null, null, new CustomFirmwarePreferencesFragment$onCreatePreferences$2$1(customFirmwarePreferencesFragment, progressDialog2, biosDirectoryPickerPreference, null), 3);
                return;
        }
    }
}
