package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: rr5  reason: default package */
/* loaded from: classes.dex */
public abstract class rr5 {
    public static final sr5 a = new sr5(rt.a, y60.g0);

    public static final sr5 a(nt ntVar, i20 i20Var, tu0 tu0Var, int i) {
        boolean z;
        if (ntVar.equals(rt.a) && b53.x(i20Var, y60.g0)) {
            sk2 sk2Var = (sk2) tu0Var;
            sk2Var.X(-1073830487);
            sk2Var.p(false);
            return a;
        }
        sk2 sk2Var2 = (sk2) tu0Var;
        sk2Var2.X(-1073779616);
        boolean z2 = true;
        if ((((i & 14) ^ 6) > 4 && sk2Var2.f(ntVar)) || (i & 6) == 4) {
            z = true;
        } else {
            z = false;
        }
        if ((((i & 112) ^ 48) <= 32 || !sk2Var2.f(i20Var)) && (i & 48) != 32) {
            z2 = false;
        }
        boolean z3 = z | z2;
        Object L = sk2Var2.L();
        if (z3 || L == su0.a) {
            L = new sr5(ntVar, i20Var);
            sk2Var2.h0(L);
        }
        sr5 sr5Var = (sr5) L;
        sk2Var2.p(false);
        return sr5Var;
    }
}
