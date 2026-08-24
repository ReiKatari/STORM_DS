package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wj4  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class wj4 implements qr2 {
    public static final wj4 a;
    private static final wb6 descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [wj4, qr2, java.lang.Object] */
    static {
        ?? obj = new Object();
        a = obj;
        ly4 ly4Var = new ly4("me.magnum.melonds.impl.retroachievements.offline.OfflinePrefetchCacheLeaderboard", obj, 3);
        ly4Var.l("id", true);
        ly4Var.m(new vi4(1, 1));
        ly4Var.l("memoryAddress", true);
        ly4Var.m(new vi4(2, 1));
        ly4Var.l("format", true);
        ly4Var.m(new vi4(3, 1));
        descriptor = ly4Var;
    }

    @Override // defpackage.qr2
    public final gg3[] b() {
        ps6 ps6Var = ps6.a;
        return new gg3[]{fz3.a, ps6Var, ps6Var};
    }

    @Override // defpackage.gg3
    public final Object c(sc1 sc1Var) {
        wb6 wb6Var = descriptor;
        ux0 c = sc1Var.c(wb6Var);
        c.getClass();
        int i = 0;
        long j = 0;
        String str = null;
        String str2 = null;
        boolean z = true;
        while (z) {
            int q = c.q(wb6Var);
            if (q != -1) {
                if (q != 0) {
                    if (q != 1) {
                        if (q == 2) {
                            str2 = c.A(wb6Var, 2);
                            i |= 4;
                        } else {
                            throw new lg7(q);
                        }
                    } else {
                        str = c.A(wb6Var, 1);
                        i |= 2;
                    }
                } else {
                    j = c.c0(wb6Var, 0);
                    i |= 1;
                }
            } else {
                z = false;
            }
        }
        c.a(wb6Var);
        return new yj4(i, j, str, str2);
    }

    @Override // defpackage.gg3
    public final void d(x32 x32Var, Object obj) {
        yj4 yj4Var = (yj4) obj;
        yj4Var.getClass();
        String str = yj4Var.c;
        String str2 = yj4Var.b;
        long j = yj4Var.a;
        wb6 wb6Var = descriptor;
        vx0 c = x32Var.c(wb6Var);
        if (c.i(wb6Var) || j != 0) {
            c.n(wb6Var, 0, j);
        }
        if (c.i(wb6Var) || !nb3.k(str2, "")) {
            c.Q(wb6Var, 1, str2);
        }
        if (c.i(wb6Var) || !nb3.k(str, "")) {
            c.Q(wb6Var, 2, str);
        }
        c.a(wb6Var);
    }

    @Override // defpackage.gg3
    public final wb6 e() {
        return descriptor;
    }
}
