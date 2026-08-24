package defpackage;

import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tj4  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class tj4 implements qr2 {
    public static final tj4 a;
    private static final wb6 descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [qr2, java.lang.Object, tj4] */
    static {
        ?? obj = new Object();
        a = obj;
        ly4 ly4Var = new ly4("me.magnum.melonds.impl.retroachievements.offline.OfflinePrefetchCacheFile", obj, 7);
        ly4Var.l("romHash", true);
        ly4Var.m(new vi4(1, 1));
        ly4Var.l("gameId", true);
        ly4Var.m(new vi4(2, 1));
        ly4Var.l("achievements", true);
        ly4Var.m(new vi4(3, 1));
        ly4Var.l("leaderboards", true);
        ly4Var.m(new vi4(4, 1));
        ly4Var.l("richPresencePatch", true);
        ly4Var.m(new vi4(5, 1));
        ly4Var.l("iconUrl", true);
        ly4Var.m(new vi4(6, 1));
        ly4Var.l("fetchedAtEpochMs", true);
        ly4Var.m(new vi4(7, 1));
        descriptor = ly4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.qr2
    public final gg3[] b() {
        go3[] go3VarArr = vj4.h;
        ps6 ps6Var = ps6.a;
        fz3 fz3Var = fz3.a;
        return new gg3[]{ps6Var, fz3Var, go3VarArr[2].getValue(), go3VarArr[3].getValue(), q60.I(ps6Var), ps6Var, fz3Var};
    }

    @Override // defpackage.gg3
    public final Object c(sc1 sc1Var) {
        wb6 wb6Var = descriptor;
        ux0 c = sc1Var.c(wb6Var);
        go3[] go3VarArr = vj4.h;
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
            int q = c.q(wb6Var);
            switch (q) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = c.A(wb6Var, 0);
                    i |= 1;
                    break;
                case 1:
                    j = c.c0(wb6Var, 1);
                    i |= 2;
                    break;
                case 2:
                    list = (List) c.G(wb6Var, 2, (gg3) go3VarArr[2].getValue(), list);
                    i |= 4;
                    break;
                case 3:
                    list2 = (List) c.G(wb6Var, 3, (gg3) go3VarArr[3].getValue(), list2);
                    i |= 8;
                    break;
                case 4:
                    str2 = (String) c.P(wb6Var, 4, ps6.a, str2);
                    i |= 16;
                    break;
                case 5:
                    str3 = c.A(wb6Var, 5);
                    i |= 32;
                    break;
                case 6:
                    j2 = c.c0(wb6Var, 6);
                    i |= 64;
                    break;
                default:
                    throw new lg7(q);
            }
        }
        c.a(wb6Var);
        return new vj4(i, j, j2, str, str2, str3, list, list2);
    }

    @Override // defpackage.gg3
    public final void d(x32 x32Var, Object obj) {
        vj4 vj4Var = (vj4) obj;
        vj4Var.getClass();
        long j = vj4Var.g;
        String str = vj4Var.f;
        String str2 = vj4Var.e;
        List list = vj4Var.d;
        List list2 = vj4Var.c;
        long j2 = vj4Var.b;
        String str3 = vj4Var.a;
        wb6 wb6Var = descriptor;
        vx0 c = x32Var.c(wb6Var);
        go3[] go3VarArr = vj4.h;
        if (c.i(wb6Var) || !nb3.k(str3, "")) {
            c.Q(wb6Var, 0, str3);
        }
        if (c.i(wb6Var) || j2 != 0) {
            c.n(wb6Var, 1, j2);
        }
        boolean i = c.i(wb6Var);
        yt1 yt1Var = yt1.A;
        if (i || !nb3.k(list2, yt1Var)) {
            c.w(wb6Var, 2, (gg3) go3VarArr[2].getValue(), list2);
        }
        if (c.i(wb6Var) || !nb3.k(list, yt1Var)) {
            c.w(wb6Var, 3, (gg3) go3VarArr[3].getValue(), list);
        }
        if (c.i(wb6Var) || str2 != null) {
            c.V(wb6Var, 4, ps6.a, str2);
        }
        if (c.i(wb6Var) || !nb3.k(str, "")) {
            c.Q(wb6Var, 5, str);
        }
        if (c.i(wb6Var) || j != 0) {
            c.n(wb6Var, 6, j);
        }
        c.a(wb6Var);
    }

    @Override // defpackage.gg3
    public final wb6 e() {
        return descriptor;
    }
}
