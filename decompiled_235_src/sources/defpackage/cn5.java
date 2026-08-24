package defpackage;

import android.content.SharedPreferences;
import java.util.Set;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cn5  reason: default package */
/* loaded from: classes.dex */
public final class cn5 implements SharedPreferences.OnSharedPreferenceChangeListener {
    public final SharedPreferences a;
    public final tp6 b;
    public volatile en5 c;
    public final de5 d;

    public cn5(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
        tp6 a = up6.a(fn5.c(sharedPreferences));
        this.b = a;
        this.d = new de5(a);
        if (!sharedPreferences.contains("ra_offline_backend")) {
            sharedPreferences.edit().putString("ra_offline_backend", ln5.BUILT_IN.getPreferenceValue()).commit();
        }
        a.m(null, fn5.c(sharedPreferences));
        sharedPreferences.registerOnSharedPreferenceChangeListener(this);
    }

    public final en5 a() {
        Set set = fn5.a;
        return fn5.c(this.a);
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        sharedPreferences.getClass();
        if (gt0.C0(fn5.a, str)) {
            en5 c = fn5.c(sharedPreferences);
            tp6 tp6Var = this.b;
            tp6Var.getClass();
            tp6Var.m(null, c);
        }
    }
}
