package defpackage;

import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: wa4  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class wa4 implements kl2 {
    public static final wa4 a;
    private static final h06 descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [kl2, java.lang.Object, wa4] */
    static {
        ?? obj = new Object();
        a = obj;
        hp4 hp4Var = new hp4("me.magnum.melonds.impl.retroachievements.offline.OfflinePrefetchCacheFile", obj, 7);
        hp4Var.l("romHash", true);
        hp4Var.m(new y94(1, 1));
        hp4Var.l("gameId", true);
        hp4Var.m(new y94(2, 1));
        hp4Var.l("achievements", true);
        hp4Var.m(new y94(3, 1));
        hp4Var.l("leaderboards", true);
        hp4Var.m(new y94(4, 1));
        hp4Var.l("richPresencePatch", true);
        hp4Var.m(new y94(5, 1));
        hp4Var.l("iconUrl", true);
        hp4Var.m(new y94(6, 1));
        hp4Var.l("fetchedAtEpochMs", true);
        hp4Var.m(new y94(7, 1));
        descriptor = hp4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.kl2
    public final m93[] a() {
        gh3[] gh3VarArr = ya4.h;
        yg6 yg6Var = yg6.a;
        as3 as3Var = as3.a;
        return new m93[]{yg6Var, as3Var, gh3VarArr[2].getValue(), gh3VarArr[3].getValue(), l07.R(yg6Var), yg6Var, as3Var};
    }

    @Override // defpackage.m93
    public final Object b(b91 b91Var) {
        h06 h06Var = descriptor;
        yu0 c = b91Var.c(h06Var);
        gh3[] gh3VarArr = ya4.h;
        c.getClass();
        List list = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        long j = 0;
        long j2 = 0;
        int i = 0;
        boolean z = true;
        List list2 = null;
        while (z) {
            int v = c.v(h06Var);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = c.K(h06Var, 0);
                    i |= 1;
                    break;
                case 1:
                    j = c.a0(h06Var, 1);
                    i |= 2;
                    break;
                case 2:
                    list = (List) c.U(h06Var, 2, (m93) gh3VarArr[2].getValue(), list);
                    i |= 4;
                    break;
                case 3:
                    list2 = (List) c.U(h06Var, 3, (m93) gh3VarArr[3].getValue(), list2);
                    i |= 8;
                    break;
                case 4:
                    str2 = (String) c.u(h06Var, 4, yg6.a, str2);
                    i |= 16;
                    break;
                case 5:
                    str3 = c.K(h06Var, 5);
                    i |= 32;
                    break;
                case ig7.b /* 6 */:
                    j2 = c.a0(h06Var, 6);
                    i |= 64;
                    break;
                default:
                    throw new q27(v);
            }
        }
        c.a(h06Var);
        return new ya4(i, j, j2, str, str2, str3, list, list2);
    }

    @Override // defpackage.m93
    public final void d(mz1 mz1Var, Object obj) {
        ya4 ya4Var = (ya4) obj;
        ya4Var.getClass();
        long j = ya4Var.g;
        String str = ya4Var.f;
        String str2 = ya4Var.e;
        List list = ya4Var.d;
        List list2 = ya4Var.c;
        long j2 = ya4Var.b;
        String str3 = ya4Var.a;
        h06 h06Var = descriptor;
        zu0 c = mz1Var.c(h06Var);
        gh3[] gh3VarArr = ya4.h;
        if (c.k(h06Var) || !b53.x(str3, "")) {
            c.z(h06Var, 0, str3);
        }
        if (c.k(h06Var) || j2 != 0) {
            c.r(h06Var, 1, j2);
        }
        boolean k = c.k(h06Var);
        pp1 pp1Var = pp1.A;
        if (k || !b53.x(list2, pp1Var)) {
            c.F(h06Var, 2, (m93) gh3VarArr[2].getValue(), list2);
        }
        if (c.k(h06Var) || !b53.x(list, pp1Var)) {
            c.F(h06Var, 3, (m93) gh3VarArr[3].getValue(), list);
        }
        if (c.k(h06Var) || str2 != null) {
            c.N(h06Var, 4, yg6.a, str2);
        }
        if (c.k(h06Var) || !b53.x(str, "")) {
            c.z(h06Var, 5, str);
        }
        if (c.k(h06Var) || j != 0) {
            c.r(h06Var, 6, j);
        }
        c.a(h06Var);
    }

    @Override // defpackage.m93
    public final h06 e() {
        return descriptor;
    }
}
