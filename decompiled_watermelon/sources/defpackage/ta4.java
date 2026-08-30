package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ta4  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ta4 implements kl2 {
    public static final ta4 a;
    private static final h06 descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [kl2, ta4, java.lang.Object] */
    static {
        ?? obj = new Object();
        a = obj;
        hp4 hp4Var = new hp4("me.magnum.melonds.impl.retroachievements.offline.OfflinePrefetchCacheAchievement", obj, 2);
        hp4Var.l("id", true);
        hp4Var.m(new y94(1, 1));
        hp4Var.l("memoryAddress", true);
        hp4Var.m(new y94(2, 1));
        descriptor = hp4Var;
    }

    @Override // defpackage.kl2
    public final m93[] a() {
        return new m93[]{as3.a, yg6.a};
    }

    @Override // defpackage.m93
    public final Object b(b91 b91Var) {
        h06 h06Var = descriptor;
        yu0 c = b91Var.c(h06Var);
        c.getClass();
        long j = 0;
        String str = null;
        boolean z = true;
        int i = 0;
        while (z) {
            int v = c.v(h06Var);
            if (v != -1) {
                if (v != 0) {
                    if (v == 1) {
                        str = c.K(h06Var, 1);
                        i |= 2;
                    } else {
                        throw new q27(v);
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
        return new va4(str, i, j);
    }

    @Override // defpackage.m93
    public final void d(mz1 mz1Var, Object obj) {
        va4 va4Var = (va4) obj;
        va4Var.getClass();
        String str = va4Var.b;
        long j = va4Var.a;
        h06 h06Var = descriptor;
        zu0 c = mz1Var.c(h06Var);
        if (c.k(h06Var) || j != 0) {
            c.r(h06Var, 0, j);
        }
        if (c.k(h06Var) || !b53.x(str, "")) {
            c.z(h06Var, 1, str);
        }
        c.a(h06Var);
    }

    @Override // defpackage.m93
    public final h06 e() {
        return descriptor;
    }
}
