package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: e10  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class e10 implements qr2 {
    public static final e10 a;
    private static final wb6 descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [qr2, e10, java.lang.Object] */
    static {
        ?? obj = new Object();
        a = obj;
        ly4 ly4Var = new ly4("me.magnum.melonds.parcelables.BackgroundParcelable", obj, 3);
        ly4Var.l("uuid", false);
        ly4Var.l("name", false);
        ly4Var.l("uri", false);
        descriptor = ly4Var;
    }

    @Override // defpackage.qr2
    public final gg3[] b() {
        ps6 ps6Var = ps6.a;
        return new gg3[]{ps6Var, ps6Var, ps6Var};
    }

    @Override // defpackage.gg3
    public final Object c(sc1 sc1Var) {
        wb6 wb6Var = descriptor;
        ux0 c = sc1Var.c(wb6Var);
        c.getClass();
        String str = null;
        boolean z = true;
        int i = 0;
        String str2 = null;
        String str3 = null;
        while (z) {
            int q = c.q(wb6Var);
            if (q != -1) {
                if (q != 0) {
                    if (q != 1) {
                        if (q == 2) {
                            str3 = c.A(wb6Var, 2);
                            i |= 4;
                        } else {
                            throw new lg7(q);
                        }
                    } else {
                        str2 = c.A(wb6Var, 1);
                        i |= 2;
                    }
                } else {
                    str = c.A(wb6Var, 0);
                    i |= 1;
                }
            } else {
                z = false;
            }
        }
        c.a(wb6Var);
        return new g10(str, i, str2, str3);
    }

    @Override // defpackage.gg3
    public final void d(x32 x32Var, Object obj) {
        g10 g10Var = (g10) obj;
        g10Var.getClass();
        wb6 wb6Var = descriptor;
        vx0 c = x32Var.c(wb6Var);
        c.Q(wb6Var, 0, g10Var.A);
        c.Q(wb6Var, 1, g10Var.B);
        c.Q(wb6Var, 2, g10Var.L);
        c.a(wb6Var);
    }

    @Override // defpackage.gg3
    public final wb6 e() {
        return descriptor;
    }
}
