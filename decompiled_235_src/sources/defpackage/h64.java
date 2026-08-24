package defpackage;

import android.content.SharedPreferences;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: h64  reason: default package */
/* loaded from: classes.dex */
public final class h64 implements y54 {
    public final /* synthetic */ int a;
    public final SharedPreferences b;

    public /* synthetic */ h64(SharedPreferences sharedPreferences, int i) {
        this.a = i;
        this.b = sharedPreferences;
    }

    @Override // defpackage.y54
    public final int a() {
        switch (this.a) {
            case 0:
                return 40;
            default:
                return 6;
        }
    }

    @Override // defpackage.y54
    public final void b() {
        int i = this.a;
        SharedPreferences sharedPreferences = this.b;
        switch (i) {
            case 0:
                String string = sharedPreferences.getString("ra_username", null);
                if (string != null && !nb3.k(qs6.T0(string).toString(), string)) {
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.putString("ra_username", qs6.T0(string).toString());
                    edit.apply();
                    return;
                }
                return;
            default:
                SharedPreferences.Editor edit2 = sharedPreferences.edit();
                du1 du1Var = du1.A;
                edit2.putStringSet("bios_dir", du1Var);
                edit2.putStringSet("rom_search_dirs", du1Var);
                edit2.putStringSet("sram_dir", du1Var);
                edit2.apply();
                return;
        }
    }

    @Override // defpackage.y54
    public final int c() {
        switch (this.a) {
            case 0:
                return 41;
            default:
                return 7;
        }
    }
}
