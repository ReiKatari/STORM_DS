package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: za4  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class za4 implements kl2 {
    public static final za4 a;
    private static final h06 descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [kl2, java.lang.Object, za4] */
    static {
        ?? obj = new Object();
        a = obj;
        hp4 hp4Var = new hp4("me.magnum.melonds.impl.retroachievements.offline.OfflinePrefetchCacheLeaderboard", obj, 3);
        hp4Var.l("id", true);
        hp4Var.m(new y94(1, 1));
        hp4Var.l("memoryAddress", true);
        hp4Var.m(new y94(2, 1));
        hp4Var.l("format", true);
        hp4Var.m(new y94(3, 1));
        descriptor = hp4Var;
    }

    @Override // defpackage.kl2
    public final m93[] a() {
        yg6 yg6Var = yg6.a;
        return new m93[]{as3.a, yg6Var, yg6Var};
    }

    @Override // defpackage.m93
    public final Object b(b91 b91Var) {
        h06 h06Var = descriptor;
        yu0 c = b91Var.c(h06Var);
        c.getClass();
        int i = 0;
        long j = 0;
        String str = null;
        String str2 = null;
        boolean z = true;
        while (z) {
            int v = c.v(h06Var);
            if (v != -1) {
                if (v != 0) {
                    if (v != 1) {
                        if (v == 2) {
                            str2 = c.K(h06Var, 2);
                            i |= 4;
                        } else {
                            throw new q27(v);
                        }
                    } else {
                        str = c.K(h06Var, 1);
                        i |= 2;
                    }
                } else {
                    j = c.a0(h06Var, 0);
                    i |= 1;
                }
            } else {
                z = false;
            }
        }
        c.a(h06Var);
        return new bb4(i, j, str, str2);
    }

    @Override // defpackage.m93
    public final void d(mz1 mz1Var, Object obj) {
        bb4 bb4Var = (bb4) obj;
        bb4Var.getClass();
        String str = bb4Var.c;
        String str2 = bb4Var.b;
        long j = bb4Var.a;
        h06 h06Var = descriptor;
        zu0 c = mz1Var.c(h06Var);
        if (c.k(h06Var) || j != 0) {
            c.r(h06Var, 0, j);
        }
        if (c.k(h06Var) || !b53.x(str2, "")) {
            c.z(h06Var, 1, str2);
        }
        if (c.k(h06Var) || !b53.x(str, "")) {
            c.z(h06Var, 2, str);
        }
        c.a(h06Var);
    }

    @Override // defpackage.m93
    public final h06 e() {
        return descriptor;
    }
}
