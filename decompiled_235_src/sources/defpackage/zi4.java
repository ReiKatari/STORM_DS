package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zi4  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class zi4 implements qr2 {
    public static final zi4 a;
    private static final wb6 descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [qr2, zi4, java.lang.Object] */
    static {
        ?? obj = new Object();
        a = obj;
        ly4 ly4Var = new ly4("me.magnum.melonds.impl.retroachievements.offline.OfflineLedgerRecord", obj, 3);
        ly4Var.l("payload", true);
        ly4Var.m(new vi4(1, 0));
        ly4Var.l("payloadHash", true);
        ly4Var.m(new vi4(2, 0));
        ly4Var.l("signature", true);
        ly4Var.m(new vi4(3, 0));
        descriptor = ly4Var;
    }

    @Override // defpackage.qr2
    public final gg3[] b() {
        x90 x90Var = x90.c;
        return new gg3[]{wi4.a, x90Var, x90Var};
    }

    @Override // defpackage.gg3
    public final Object c(sc1 sc1Var) {
        wb6 wb6Var = descriptor;
        ux0 c = sc1Var.c(wb6Var);
        c.getClass();
        yi4 yi4Var = null;
        boolean z = true;
        int i = 0;
        byte[] bArr = null;
        byte[] bArr2 = null;
        while (z) {
            int q = c.q(wb6Var);
            if (q != -1) {
                if (q != 0) {
                    if (q != 1) {
                        if (q == 2) {
                            bArr2 = (byte[]) c.G(wb6Var, 2, x90.c, bArr2);
                            i |= 4;
                        } else {
                            throw new lg7(q);
                        }
                    } else {
                        bArr = (byte[]) c.G(wb6Var, 1, x90.c, bArr);
                        i |= 2;
                    }
                } else {
                    yi4Var = (yi4) c.G(wb6Var, 0, wi4.a, yi4Var);
                    i |= 1;
                }
            } else {
                z = false;
            }
        }
        c.a(wb6Var);
        return new bj4(i, yi4Var, bArr, bArr2);
    }

    @Override // defpackage.gg3
    public final void d(x32 x32Var, Object obj) {
        bj4 bj4Var = (bj4) obj;
        bj4Var.getClass();
        byte[] bArr = bj4Var.c;
        byte[] bArr2 = bj4Var.b;
        yi4 yi4Var = bj4Var.a;
        wb6 wb6Var = descriptor;
        vx0 c = x32Var.c(wb6Var);
        if (c.i(wb6Var) || !nb3.k(yi4Var, new yi4(null, null, null, 0L, 0L, false, null, 0L, 0L, 0L, 0L, 0L, null, null, false, 131071))) {
            c.w(wb6Var, 0, wi4.a, yi4Var);
        }
        if (c.i(wb6Var) || !nb3.k(bArr2, new byte[0])) {
            c.w(wb6Var, 1, x90.c, bArr2);
        }
        if (c.i(wb6Var) || !nb3.k(bArr, new byte[0])) {
            c.w(wb6Var, 2, x90.c, bArr);
        }
        c.a(wb6Var);
    }

    @Override // defpackage.gg3
    public final wb6 e() {
        return descriptor;
    }
}
