package defpackage;

import android.content.SharedPreferences;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jk  reason: default package */
/* loaded from: classes.dex */
public final class jk {
    public final SharedPreferences a;
    public final hb4 b = new hb4();
    public final tp6 c;

    public jk(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
        String string = sharedPreferences.getString("ra_profile_username", null);
        this.c = up6.a(string != null ? new lb5(string, sharedPreferences.getLong("ra_profile_score", 0L), sharedPreferences.getLong("ra_profile_softcore_score", 0L)) : null);
    }

    public static final void a(jk jkVar, lb5 lb5Var) {
        SharedPreferences.Editor edit = jkVar.a.edit();
        edit.putString("ra_profile_username", lb5Var.a);
        edit.putLong("ra_profile_score", lb5Var.b);
        edit.putLong("ra_profile_softcore_score", lb5Var.c);
        edit.apply();
        tp6 tp6Var = jkVar.c;
        tp6Var.getClass();
        tp6Var.m(null, lb5Var);
    }

    public final Object b(s41 s41Var) {
        xe1 xe1Var = xk1.a;
        Object d0 = hv.d0(de1.L, new b0(this, (r41) null, 6), s41Var);
        if (d0 == x61.COROUTINE_SUSPENDED) {
            return d0;
        }
        return jg7.a;
    }
}
