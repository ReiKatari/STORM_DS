package defpackage;

import android.content.SharedPreferences;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hk  reason: default package */
/* loaded from: classes.dex */
public final class hk {
    public final SharedPreferences a;
    public final hb4 b = new hb4();

    public hk(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
    }

    public final Object a(s41 s41Var) {
        xe1 xe1Var = xk1.a;
        Object d0 = hv.d0(de1.L, new fk(this, null, 0), s41Var);
        if (d0 == x61.COROUTINE_SUSPENDED) {
            return d0;
        }
        return jg7.a;
    }

    public final Object b(s41 s41Var) {
        xe1 xe1Var = xk1.a;
        return hv.d0(de1.L, new fk(this, null, 1), s41Var);
    }
}
