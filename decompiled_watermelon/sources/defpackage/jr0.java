package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: jr0  reason: default package */
/* loaded from: classes.dex */
public abstract class jr0 {
    public static final lr0 a = new lr0(rt.c, y60.j0);

    public static final lr0 a(qt qtVar, h20 h20Var, tu0 tu0Var, int i) {
        boolean z;
        if (qtVar.equals(rt.c) && h20Var.equals(y60.j0)) {
            sk2 sk2Var = (sk2) tu0Var;
            sk2Var.X(-1446604504);
            sk2Var.p(false);
            return a;
        }
        sk2 sk2Var2 = (sk2) tu0Var;
        sk2Var2.X(-1446550657);
        boolean z2 = true;
        if ((((i & 14) ^ 6) > 4 && sk2Var2.f(qtVar)) || (i & 6) == 4) {
            z = true;
        } else {
            z = false;
        }
        if ((((i & 112) ^ 48) <= 32 || !sk2Var2.f(h20Var)) && (i & 48) != 32) {
            z2 = false;
        }
        boolean z3 = z | z2;
        Object L = sk2Var2.L();
        if (z3 || L == su0.a) {
            L = new lr0(qtVar, h20Var);
            sk2Var2.h0(L);
        }
        lr0 lr0Var = (lr0) L;
        sk2Var2.p(false);
        return lr0Var;
    }
}
