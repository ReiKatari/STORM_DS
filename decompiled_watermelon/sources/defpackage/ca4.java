package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ca4  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ca4 implements kl2 {
    public static final ca4 a;
    private static final h06 descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [kl2, ca4, java.lang.Object] */
    static {
        ?? obj = new Object();
        a = obj;
        hp4 hp4Var = new hp4("me.magnum.melonds.impl.retroachievements.offline.OfflineLedgerRecord", obj, 3);
        hp4Var.l("payload", true);
        hp4Var.m(new y94(1, 0));
        hp4Var.l("payloadHash", true);
        hp4Var.m(new y94(2, 0));
        hp4Var.l("signature", true);
        hp4Var.m(new y94(3, 0));
        descriptor = hp4Var;
    }

    @Override // defpackage.kl2
    public final m93[] a() {
        q70 q70Var = q70.c;
        return new m93[]{z94.a, q70Var, q70Var};
    }

    @Override // defpackage.m93
    public final Object b(b91 b91Var) {
        h06 h06Var = descriptor;
        yu0 c = b91Var.c(h06Var);
        c.getClass();
        ba4 ba4Var = null;
        boolean z = true;
        int i = 0;
        byte[] bArr = null;
        byte[] bArr2 = null;
        while (z) {
            int v = c.v(h06Var);
            if (v != -1) {
                if (v != 0) {
                    if (v != 1) {
                        if (v == 2) {
                            bArr2 = (byte[]) c.U(h06Var, 2, q70.c, bArr2);
                            i |= 4;
                        } else {
                            throw new q27(v);
                        }
                    } else {
                        bArr = (byte[]) c.U(h06Var, 1, q70.c, bArr);
                        i |= 2;
                    }
                } else {
                    ba4Var = (ba4) c.U(h06Var, 0, z94.a, ba4Var);
                    i |= 1;
                }
            } else {
                z = false;
            }
        }
        c.a(h06Var);
        return new ea4(i, ba4Var, bArr, bArr2);
    }

    @Override // defpackage.m93
    public final void d(mz1 mz1Var, Object obj) {
        ea4 ea4Var = (ea4) obj;
        ea4Var.getClass();
        byte[] bArr = ea4Var.c;
        byte[] bArr2 = ea4Var.b;
        ba4 ba4Var = ea4Var.a;
        h06 h06Var = descriptor;
        zu0 c = mz1Var.c(h06Var);
        if (c.k(h06Var) || !b53.x(ba4Var, new ba4(null, null, null, 0L, 0L, false, null, 0L, 0L, 0L, 0L, 0L, null, null, false, 131071))) {
            c.F(h06Var, 0, z94.a, ba4Var);
        }
        if (c.k(h06Var) || !b53.x(bArr2, new byte[0])) {
            c.F(h06Var, 1, q70.c, bArr2);
        }
        if (c.k(h06Var) || !b53.x(bArr, new byte[0])) {
            c.F(h06Var, 2, q70.c, bArr);
        }
        c.a(h06Var);
    }

    @Override // defpackage.m93
    public final h06 e() {
        return descriptor;
    }
}
