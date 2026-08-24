package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: r10  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class r10 implements qr2 {
    public static final r10 a;
    private static final wb6 descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [r10, qr2, java.lang.Object] */
    static {
        ?? obj = new Object();
        a = obj;
        ly4 ly4Var = new ly4("me.magnum.melonds.ui.backgrounds.BackgroundsNavigation.BackgroundPreview", obj, 1);
        ly4Var.l("backgroundParcelable", false);
        descriptor = ly4Var;
    }

    @Override // defpackage.qr2
    public final gg3[] b() {
        return new gg3[]{e10.a};
    }

    @Override // defpackage.gg3
    public final Object c(sc1 sc1Var) {
        wb6 wb6Var = descriptor;
        ux0 c = sc1Var.c(wb6Var);
        c.getClass();
        g10 g10Var = null;
        boolean z = true;
        int i = 0;
        while (z) {
            int q = c.q(wb6Var);
            if (q != -1) {
                if (q == 0) {
                    g10Var = (g10) c.G(wb6Var, 0, e10.a, g10Var);
                    i = 1;
                } else {
                    throw new lg7(q);
                }
            } else {
                z = false;
            }
        }
        c.a(wb6Var);
        return new t10(i, g10Var);
    }

    @Override // defpackage.gg3
    public final void d(x32 x32Var, Object obj) {
        t10 t10Var = (t10) obj;
        t10Var.getClass();
        wb6 wb6Var = descriptor;
        vx0 c = x32Var.c(wb6Var);
        c.w(wb6Var, 0, e10.a, t10Var.l);
        c.a(wb6Var);
    }

    @Override // defpackage.gg3
    public final wb6 e() {
        return descriptor;
    }
}
