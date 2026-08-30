package defpackage;

import android.content.Context;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: g67  reason: default package */
/* loaded from: classes.dex */
public abstract class g67 {
    public static final long a = nz0.h(0, 0, 0, 0);
    public static final i55 b;

    static {
        h76 h76Var = h76.c;
        b = new i55();
    }

    public static final vw2 a(Object obj, tu0 tu0Var) {
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Y(1087186730);
        if (obj instanceof vw2) {
            vw2 vw2Var = (vw2) obj;
            sk2Var.p(false);
            return vw2Var;
        }
        Context context = (Context) sk2Var.j(ue.b);
        sk2Var.Y(-1245195153);
        boolean f = sk2Var.f(context) | sk2Var.f(obj);
        Object L = sk2Var.L();
        if (f || L == su0.a) {
            tw2 tw2Var = new tw2(context);
            tw2Var.c = obj;
            L = tw2Var.a();
            sk2Var.h0(L);
        }
        vw2 vw2Var2 = (vw2) L;
        sk2Var.p(false);
        sk2Var.p(false);
        return vw2Var2;
    }
}
