package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xo0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class xo0 implements qr2 {
    public static final xo0 a;
    private static final wb6 descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [qr2, xo0, java.lang.Object] */
    static {
        ?? obj = new Object();
        a = obj;
        ly4 ly4Var = new ly4("me.magnum.melonds.ui.cheats.CheatsNavigation.FolderCheats", obj, 1);
        ly4Var.l("folderName", false);
        descriptor = ly4Var;
    }

    @Override // defpackage.qr2
    public final gg3[] b() {
        return new gg3[]{q60.I(ps6.a)};
    }

    @Override // defpackage.gg3
    public final Object c(sc1 sc1Var) {
        wb6 wb6Var = descriptor;
        ux0 c = sc1Var.c(wb6Var);
        c.getClass();
        String str = null;
        boolean z = true;
        int i = 0;
        while (z) {
            int q = c.q(wb6Var);
            if (q != -1) {
                if (q == 0) {
                    str = (String) c.P(wb6Var, 0, ps6.a, str);
                    i = 1;
                } else {
                    throw new lg7(q);
                }
            } else {
                z = false;
            }
        }
        c.a(wb6Var);
        return new zo0(i, str);
    }

    @Override // defpackage.gg3
    public final void d(x32 x32Var, Object obj) {
        zo0 zo0Var = (zo0) obj;
        zo0Var.getClass();
        wb6 wb6Var = descriptor;
        vx0 c = x32Var.c(wb6Var);
        c.V(wb6Var, 0, ps6.a, zo0Var.h0);
        c.a(wb6Var);
    }

    @Override // defpackage.gg3
    public final wb6 e() {
        return descriptor;
    }
}
