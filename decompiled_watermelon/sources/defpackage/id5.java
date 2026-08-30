package defpackage;

import android.content.SharedPreferences;
import java.util.Set;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: id5  reason: default package */
/* loaded from: classes.dex */
public final class id5 implements SharedPreferences.OnSharedPreferenceChangeListener {
    public final SharedPreferences a;
    public final ee6 b;
    public volatile kd5 c;
    public final q45 d;

    public id5(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
        ee6 a = fe6.a(ld5.c(sharedPreferences));
        this.b = a;
        this.d = new q45(a);
        if (!sharedPreferences.contains("ra_offline_backend")) {
            sharedPreferences.edit().putString("ra_offline_backend", qd5.BUILT_IN.getPreferenceValue()).commit();
        }
        a.l(null, ld5.c(sharedPreferences));
        sharedPreferences.registerOnSharedPreferenceChangeListener(this);
    }

    public final kd5 a() {
        Set set = ld5.a;
        return ld5.c(this.a);
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        sharedPreferences.getClass();
        if (tq0.F0(ld5.a, str)) {
            kd5 c = ld5.c(sharedPreferences);
            ee6 ee6Var = this.b;
            ee6Var.getClass();
            ee6Var.l(null, c);
        }
    }
}
