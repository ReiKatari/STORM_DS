package defpackage;

import android.content.SharedPreferences;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: oy3  reason: default package */
/* loaded from: classes.dex */
public final class oy3 implements fy3 {
    public final /* synthetic */ int a;
    public final SharedPreferences b;

    public /* synthetic */ oy3(SharedPreferences sharedPreferences, int i) {
        this.a = i;
        this.b = sharedPreferences;
    }

    @Override // defpackage.fy3
    public final int a() {
        switch (this.a) {
            case 0:
                return 40;
            default:
                return 6;
        }
    }

    @Override // defpackage.fy3
    public final int b() {
        switch (this.a) {
            case 0:
                return 41;
            default:
                return 7;
        }
    }

    @Override // defpackage.fy3
    public final void c() {
        int i = this.a;
        SharedPreferences sharedPreferences = this.b;
        switch (i) {
            case 0:
                String string = sharedPreferences.getString("ra_username", null);
                if (string != null && !b53.x(zg6.Z0(string).toString(), string)) {
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.putString("ra_username", zg6.Z0(string).toString());
                    edit.apply();
                    return;
                }
                return;
            default:
                SharedPreferences.Editor edit2 = sharedPreferences.edit();
                up1 up1Var = up1.A;
                edit2.putStringSet("bios_dir", up1Var);
                edit2.putStringSet("rom_search_dirs", up1Var);
                edit2.putStringSet("sram_dir", up1Var);
                edit2.apply();
                return;
        }
    }
}
