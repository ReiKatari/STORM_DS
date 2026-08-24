package defpackage;

import android.content.SharedPreferences;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gt  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class gt implements SharedPreferences.OnSharedPreferenceChangeListener {
    public final /* synthetic */ int a;

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        switch (this.a) {
            case 0:
                sharedPreferences.getClass();
                if (nb3.k(str, "theme")) {
                    String str2 = "dark";
                    String string = sharedPreferences.getString("theme", "dark");
                    if (string != null) {
                        str2 = string;
                    }
                    vs4 vs4Var = ht.a;
                    g57.Companion.getClass();
                    vs4Var.setValue(e57.a(str2));
                    return;
                }
                return;
            case 1:
                sharedPreferences.getClass();
                if (nb3.k(str, "button_color_theme")) {
                    String str3 = "cyber_cyan";
                    String string2 = sharedPreferences.getString("button_color_theme", "cyber_cyan");
                    if (string2 != null) {
                        str3 = string2;
                    }
                    n90.a = n90.b(str3);
                    return;
                }
                return;
            default:
                sharedPreferences.getClass();
                if (nb3.k(str, "rom_display_name_mode")) {
                    String str4 = "file_name";
                    String string3 = sharedPreferences.getString("rom_display_name_mode", "file_name");
                    if (string3 != null) {
                        str4 = string3;
                    }
                    gi2.c = str4;
                    return;
                }
                return;
        }
    }
}
