package me.magnum.melonds.ui.settings.fragments;

import android.app.ProgressDialog;
import android.net.Uri;
import androidx.preference.SwitchPreference;
import com.stormds.emulator.R;
import java.io.File;
import me.magnum.melonds.ui.settings.preferences.BiosDirectoryPickerPreference;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@mc1(c = "me.magnum.melonds.ui.settings.fragments.CustomFirmwarePreferencesFragment$onCreatePreferences$2$1", f = "CustomFirmwarePreferencesFragment.kt", l = {103}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class CustomFirmwarePreferencesFragment$onCreatePreferences$2$1 extends hw6 implements eo2 {
    public int X;
    public final /* synthetic */ CustomFirmwarePreferencesFragment Y;
    public final /* synthetic */ ProgressDialog Z;
    public final /* synthetic */ BiosDirectoryPickerPreference d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomFirmwarePreferencesFragment$onCreatePreferences$2$1(CustomFirmwarePreferencesFragment customFirmwarePreferencesFragment, ProgressDialog progressDialog, BiosDirectoryPickerPreference biosDirectoryPickerPreference, r41 r41Var) {
        super(2, r41Var);
        this.Y = customFirmwarePreferencesFragment;
        this.Z = progressDialog;
        this.d0 = biosDirectoryPickerPreference;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        return ((CustomFirmwarePreferencesFragment$onCreatePreferences$2$1) q((r41) obj2, (w61) obj)).s(jg7.a);
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        return new CustomFirmwarePreferencesFragment$onCreatePreferences$2$1(this.Y, this.Z, this.d0, r41Var);
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        Object f;
        String str;
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        int i = this.X;
        ProgressDialog progressDialog = this.Z;
        CustomFirmwarePreferencesFragment customFirmwarePreferencesFragment = this.Y;
        if (i != 0) {
            if (i == 1) {
                oi2.Y(obj);
                f = ((hm5) obj).A;
            } else {
                defpackage.i.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            oi2.Y(obj);
            m40 m40Var = customFirmwarePreferencesFragment.g0;
            if (m40Var != null) {
                i81 i81Var = new i81(customFirmwarePreferencesFragment, progressDialog, 1);
                this.X = 1;
                f = m40Var.f(i81Var, this);
                if (f == x61Var) {
                    return x61Var;
                }
            } else {
                nb3.a0("biosDownloadManager");
                throw null;
            }
        }
        progressDialog.dismiss();
        if (!(f instanceof em5)) {
            oi2.Y(f);
            File file = (File) f;
            Uri fromFile = Uri.fromFile(file);
            SwitchPreference switchPreference = (SwitchPreference) customFirmwarePreferencesFragment.findPreference("use_custom_bios");
            if (switchPreference != null) {
                switchPreference.e(true);
            }
            BiosDirectoryPickerPreference biosDirectoryPickerPreference = this.d0;
            biosDirectoryPickerPreference.f(fromFile);
            biosDirectoryPickerPreference.setSummary(file.getAbsolutePath());
            zb zbVar = new zb(customFirmwarePreferencesFragment.requireContext());
            wb wbVar = (wb) zbVar.L;
            wbVar.d = "Успешно";
            wbVar.f = i61.m("Файлы BIOS DSi (bios7.bin, bios9.bin, firmware.bin, nand.bin) успешно скачаны и настроены!\n\nПапка: ", file.getAbsolutePath());
            zbVar.y(R.string.ok, null);
            zbVar.B();
        } else {
            zb zbVar2 = new zb(customFirmwarePreferencesFragment.requireContext());
            wb wbVar2 = (wb) zbVar2.L;
            wbVar2.d = "Ошибка";
            Throwable a = hm5.a(f);
            if (a != null) {
                str = a.getLocalizedMessage();
            } else {
                str = null;
            }
            wbVar2.f = i61.m("Не удалось скачать файлы BIOS DSi: ", str);
            zbVar2.y(R.string.ok, null);
            zbVar2.B();
        }
        return jg7.a;
    }
}
