package defpackage;

import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: u94  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class u94 implements kl2 {
    public static final u94 a;
    private static final h06 descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [kl2, u94, java.lang.Object] */
    static {
        ?? obj = new Object();
        a = obj;
        hp4 hp4Var = new hp4("me.magnum.melonds.impl.retroachievements.offline.OfflineLedgerFile", obj, 2);
        hp4Var.l("records", true);
        hp4Var.m(new y94(1, 0));
        hp4Var.l("expirationPolicyVersion", true);
        hp4Var.m(new y94(2, 0));
        descriptor = hp4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.kl2
    public final m93[] a() {
        return new m93[]{w94.c[0].getValue(), g33.a};
    }

    @Override // defpackage.m93
    public final Object b(b91 b91Var) {
        h06 h06Var = descriptor;
        yu0 c = b91Var.c(h06Var);
        gh3[] gh3VarArr = w94.c;
        c.getClass();
        List list = null;
        boolean z = true;
        int i = 0;
        int i2 = 0;
        while (z) {
            int v = c.v(h06Var);
            if (v != -1) {
                if (v != 0) {
                    if (v == 1) {
                        i2 = c.V(h06Var, 1);
                        i |= 2;
                    } else {
                        throw new q27(v);
                    }
                } else {
                    list = (List) c.U(h06Var, 0, (m93) gh3VarArr[0].getValue(), list);
                    i |= 1;
                }
            } else {
                z = false;
            }
        }
        c.a(h06Var);
        return new w94(i, i2, list);
    }

    @Override // defpackage.m93
    public final void d(mz1 mz1Var, Object obj) {
        w94 w94Var = (w94) obj;
        w94Var.getClass();
        int i = w94Var.b;
        List list = w94Var.a;
        h06 h06Var = descriptor;
        zu0 c = mz1Var.c(h06Var);
        gh3[] gh3VarArr = w94.c;
        if (c.k(h06Var) || !b53.x(list, pp1.A)) {
            c.F(h06Var, 0, (m93) gh3VarArr[0].getValue(), list);
        }
        if (c.k(h06Var) || i != 0) {
            c.q(1, i, h06Var);
        }
        c.a(h06Var);
    }

    @Override // defpackage.m93
    public final h06 e() {
        return descriptor;
    }
}
