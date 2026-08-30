package defpackage;

import android.content.SharedPreferences;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: vj  reason: default package */
/* loaded from: classes.dex */
public final class vj {
    public final SharedPreferences a;
    public final b34 b = new b34();

    public vj(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
    }

    public final Object a(k11 k11Var) {
        bb1 bb1Var = tg1.a;
        Object G = tq5.G(ha1.L, new tj(this, null, 0), k11Var);
        if (G == p31.COROUTINE_SUSPENDED) {
            return G;
        }
        return o27.a;
    }

    public final Object b(k11 k11Var) {
        bb1 bb1Var = tg1.a;
        return tq5.G(ha1.L, new tj(this, null, 1), k11Var);
    }
}
