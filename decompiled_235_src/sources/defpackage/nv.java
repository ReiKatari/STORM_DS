package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nv  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class nv implements qr2 {
    public static final nv a;
    private static final wb6 descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [qr2, nv, java.lang.Object] */
    static {
        ?? obj = new Object();
        a = obj;
        ly4 ly4Var = new ly4("me.magnum.melonds.github.dtos.AssetDto", obj, 5);
        ly4Var.l("id", true);
        ly4Var.l("browser_download_url", true);
        ly4Var.l("name", true);
        ly4Var.l("size", true);
        ly4Var.l("content_type", true);
        descriptor = ly4Var;
    }

    @Override // defpackage.qr2
    public final gg3[] b() {
        fz3 fz3Var = fz3.a;
        ps6 ps6Var = ps6.a;
        return new gg3[]{fz3Var, ps6Var, ps6Var, fz3Var, ps6Var};
    }

    @Override // defpackage.gg3
    public final Object c(sc1 sc1Var) {
        wb6 wb6Var = descriptor;
        ux0 c = sc1Var.c(wb6Var);
        c.getClass();
        int i = 0;
        long j = 0;
        long j2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        boolean z = true;
        while (z) {
            int q = c.q(wb6Var);
            if (q != -1) {
                if (q != 0) {
                    if (q != 1) {
                        if (q != 2) {
                            if (q != 3) {
                                if (q == 4) {
                                    str3 = c.A(wb6Var, 4);
                                    i |= 16;
                                } else {
                                    throw new lg7(q);
                                }
                            } else {
                                j2 = c.c0(wb6Var, 3);
                                i |= 8;
                            }
                        } else {
                            str2 = c.A(wb6Var, 2);
                            i |= 4;
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
        return new pv(i, j, str, str2, j2, str3);
    }

    @Override // defpackage.gg3
    public final void d(x32 x32Var, Object obj) {
        pv pvVar = (pv) obj;
        pvVar.getClass();
        String str = pvVar.e;
        long j = pvVar.d;
        String str2 = pvVar.c;
        String str3 = pvVar.b;
        long j2 = pvVar.a;
        wb6 wb6Var = descriptor;
        vx0 c = x32Var.c(wb6Var);
        if (c.i(wb6Var) || j2 != 0) {
            c.n(wb6Var, 0, j2);
        }
        if (c.i(wb6Var) || !nb3.k(str3, "")) {
            c.Q(wb6Var, 1, str3);
        }
        if (c.i(wb6Var) || !nb3.k(str2, "")) {
            c.Q(wb6Var, 2, str2);
        }
        if (c.i(wb6Var) || j != 0) {
            c.n(wb6Var, 3, j);
        }
        if (c.i(wb6Var) || !nb3.k(str, "")) {
            c.Q(wb6Var, 4, str);
        }
        c.a(wb6Var);
    }

    @Override // defpackage.gg3
    public final wb6 e() {
        return descriptor;
    }
}
