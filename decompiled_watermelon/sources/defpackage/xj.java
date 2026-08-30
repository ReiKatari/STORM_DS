package defpackage;

import android.content.SharedPreferences;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xj  reason: default package */
/* loaded from: classes.dex */
public final class xj {
    public final SharedPreferences a;
    public final b34 b = new b34();
    public final ee6 c;

    public xj(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
        String string = sharedPreferences.getString("ra_profile_username", null);
        this.c = fe6.a(string != null ? new b25(string, sharedPreferences.getLong("ra_profile_score", 0L), sharedPreferences.getLong("ra_profile_softcore_score", 0L)) : null);
    }

    public static final void a(xj xjVar, b25 b25Var) {
        SharedPreferences.Editor edit = xjVar.a.edit();
        edit.putString("ra_profile_username", b25Var.a);
        edit.putLong("ra_profile_score", b25Var.b);
        edit.putLong("ra_profile_softcore_score", b25Var.c);
        edit.apply();
        ee6 ee6Var = xjVar.c;
        ee6Var.getClass();
        ee6Var.l(null, b25Var);
    }

    public final Object b(k11 k11Var) {
        bb1 bb1Var = tg1.a;
        Object G = tq5.G(ha1.L, new a0(this, (j11) null, 7), k11Var);
        if (G == p31.COROUTINE_SUSPENDED) {
            return G;
        }
        return o27.a;
    }
}
