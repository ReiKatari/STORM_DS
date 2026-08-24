package defpackage;

import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ri4  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ri4 implements qr2 {
    public static final ri4 a;
    private static final wb6 descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [qr2, java.lang.Object, ri4] */
    static {
        ?? obj = new Object();
        a = obj;
        ly4 ly4Var = new ly4("me.magnum.melonds.impl.retroachievements.offline.OfflineLedgerFile", obj, 2);
        ly4Var.l("records", true);
        ly4Var.m(new vi4(1, 0));
        ly4Var.l("expirationPolicyVersion", true);
        ly4Var.m(new vi4(2, 0));
        descriptor = ly4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.qr2
    public final gg3[] b() {
        return new gg3[]{ti4.c[0].getValue(), o93.a};
    }

    @Override // defpackage.gg3
    public final Object c(sc1 sc1Var) {
        wb6 wb6Var = descriptor;
        ux0 c = sc1Var.c(wb6Var);
        go3[] go3VarArr = ti4.c;
        c.getClass();
        List list = null;
        boolean z = true;
        int i = 0;
        int i2 = 0;
        while (z) {
            int q = c.q(wb6Var);
            if (q != -1) {
                if (q != 0) {
                    if (q == 1) {
                        i2 = c.H(wb6Var, 1);
                        i |= 2;
                    } else {
                        throw new lg7(q);
                    }
                } else {
                    list = (List) c.G(wb6Var, 0, (gg3) go3VarArr[0].getValue(), list);
                    i |= 1;
                }
            } else {
                z = false;
            }
        }
        c.a(wb6Var);
        return new ti4(i, list, i2);
    }

    @Override // defpackage.gg3
    public final void d(x32 x32Var, Object obj) {
        ti4 ti4Var = (ti4) obj;
        ti4Var.getClass();
        int i = ti4Var.b;
        List list = ti4Var.a;
        wb6 wb6Var = descriptor;
        vx0 c = x32Var.c(wb6Var);
        go3[] go3VarArr = ti4.c;
        if (c.i(wb6Var) || !nb3.k(list, yt1.A)) {
            c.w(wb6Var, 0, (gg3) go3VarArr[0].getValue(), list);
        }
        if (c.i(wb6Var) || i != 0) {
            c.O(1, i, wb6Var);
        }
        c.a(wb6Var);
    }

    @Override // defpackage.gg3
    public final wb6 e() {
        return descriptor;
    }
}
