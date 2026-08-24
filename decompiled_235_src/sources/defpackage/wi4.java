package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wi4  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class wi4 implements qr2 {
    public static final wi4 a;
    private static final wb6 descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [qr2, wi4, java.lang.Object] */
    static {
        ?? obj = new Object();
        a = obj;
        ly4 ly4Var = new ly4("me.magnum.melonds.impl.retroachievements.offline.OfflineLedgerPayload", obj, 17);
        ly4Var.l("recordType", true);
        ly4Var.m(new vi4(1, 0));
        ly4Var.l("seq", true);
        ly4Var.m(new vi4(2, 0));
        ly4Var.l("userId", true);
        ly4Var.m(new vi4(3, 0));
        ly4Var.l("contentId", true);
        ly4Var.m(new vi4(4, 0));
        ly4Var.l("gameId", true);
        ly4Var.m(new vi4(5, 0));
        ly4Var.l("achievementId", true);
        ly4Var.m(new vi4(6, 0));
        ly4Var.l("isHardcore", true);
        ly4Var.m(new vi4(7, 0));
        ly4Var.l("sessionId", true);
        ly4Var.m(new vi4(8, 0));
        ly4Var.l("localTimestampEpochMs", true);
        ly4Var.m(new vi4(9, 0));
        ly4Var.l("offsetFromSessionStartMs", true);
        ly4Var.m(new vi4(10, 0));
        ly4Var.l("orderIndex", true);
        ly4Var.m(new vi4(11, 0));
        ly4Var.l("ackedSeq", true);
        ly4Var.m(new vi4(12, 0));
        ly4Var.l("estimatedPlayDurationMs", true);
        ly4Var.m(new vi4(13, 0));
        ly4Var.l("prevHash", true);
        ly4Var.m(new vi4(14, 0));
        ly4Var.l("unlockMode", true);
        ly4Var.m(new vi4(15, 0));
        ly4Var.l("offlineType", true);
        ly4Var.m(new vi4(16, 0));
        ly4Var.l("pendingSync", true);
        ly4Var.m(new vi4(17, 0));
        descriptor = ly4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.qr2
    public final gg3[] b() {
        go3[] go3VarArr = yi4.r;
        fz3 fz3Var = fz3.a;
        ps6 ps6Var = ps6.a;
        u50 u50Var = u50.a;
        return new gg3[]{go3VarArr[0].getValue(), fz3Var, ps6Var, ps6Var, fz3Var, fz3Var, u50Var, ps6Var, fz3Var, fz3Var, fz3Var, fz3Var, fz3Var, x90.c, go3VarArr[14].getValue(), go3VarArr[15].getValue(), u50Var};
    }

    @Override // defpackage.gg3
    public final Object c(sc1 sc1Var) {
        wb6 wb6Var = descriptor;
        ux0 c = sc1Var.c(wb6Var);
        go3[] go3VarArr = yi4.r;
        c.getClass();
        byte[] bArr = null;
        dj4 dj4Var = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        long j6 = 0;
        long j7 = 0;
        long j8 = 0;
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
        gk4 gk4Var = null;
        ik4 ik4Var = null;
        while (z) {
            int q = c.q(wb6Var);
            switch (q) {
                case -1:
                    z = false;
                    break;
                case 0:
                    dj4Var = (dj4) c.G(wb6Var, 0, (gg3) go3VarArr[0].getValue(), dj4Var);
                    i |= 1;
                    break;
                case 1:
                    j = c.c0(wb6Var, 1);
                    i |= 2;
                    break;
                case 2:
                    str = c.A(wb6Var, 2);
                    i |= 4;
                    break;
                case 3:
                    str2 = c.A(wb6Var, 3);
                    i |= 8;
                    break;
                case 4:
                    j2 = c.c0(wb6Var, 4);
                    i |= 16;
                    break;
                case 5:
                    j3 = c.c0(wb6Var, 5);
                    i |= 32;
                    break;
                case 6:
                    z2 = c.W(wb6Var, 6);
                    i |= 64;
                    break;
                case 7:
                    str3 = c.A(wb6Var, 7);
                    i |= 128;
                    break;
                case 8:
                    j4 = c.c0(wb6Var, 8);
                    i |= 256;
                    break;
                case 9:
                    j5 = c.c0(wb6Var, 9);
                    i |= 512;
                    break;
                case 10:
                    j6 = c.c0(wb6Var, 10);
                    i |= 1024;
                    break;
                case 11:
                    j7 = c.c0(wb6Var, 11);
                    i |= 2048;
                    break;
                case 12:
                    j8 = c.c0(wb6Var, 12);
                    i |= 4096;
                    break;
                case 13:
                    bArr = (byte[]) c.G(wb6Var, 13, x90.c, bArr);
                    i |= 8192;
                    break;
                case 14:
                    gk4Var = (gk4) c.G(wb6Var, 14, (gg3) go3VarArr[14].getValue(), gk4Var);
                    i |= 16384;
                    break;
                case 15:
                    ik4Var = (ik4) c.G(wb6Var, 15, (gg3) go3VarArr[15].getValue(), ik4Var);
                    i |= 32768;
                    break;
                case 16:
                    z3 = c.W(wb6Var, 16);
                    i |= 65536;
                    break;
                default:
                    throw new lg7(q);
            }
        }
        c.a(wb6Var);
        return new yi4(i, dj4Var, j, str, str2, j2, j3, z2, str3, j4, j5, j6, j7, j8, bArr, gk4Var, ik4Var, z3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x0143, code lost:
        if (defpackage.nb3.k(r1, new byte[0]) == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0159, code lost:
        if (r1 != defpackage.gk4.UNKNOWN) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0175, code lost:
        if (r1 != defpackage.ik4.UNKNOWN) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0171  */
    @Override // defpackage.gg3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(x32 x32Var, Object obj) {
        int i;
        long j;
        byte[] bArr;
        gk4 gk4Var;
        ik4 ik4Var;
        yi4 yi4Var = (yi4) obj;
        yi4Var.getClass();
        boolean z = yi4Var.q;
        ik4 ik4Var2 = yi4Var.p;
        gk4 gk4Var2 = yi4Var.o;
        byte[] bArr2 = yi4Var.n;
        long j2 = yi4Var.m;
        long j3 = yi4Var.l;
        long j4 = yi4Var.k;
        long j5 = yi4Var.j;
        long j6 = yi4Var.i;
        String str = yi4Var.h;
        boolean z2 = yi4Var.g;
        long j7 = yi4Var.f;
        long j8 = yi4Var.e;
        String str2 = yi4Var.d;
        String str3 = yi4Var.c;
        long j9 = yi4Var.b;
        dj4 dj4Var = yi4Var.a;
        wb6 wb6Var = descriptor;
        vx0 c = x32Var.c(wb6Var);
        go3[] go3VarArr = yi4.r;
        if (c.i(wb6Var)) {
            i = 0;
        } else {
            i = 0;
            if (dj4Var == dj4.SESSION_START) {
                j = j6;
                if (!c.i(wb6Var) || j9 != 0) {
                    c.n(wb6Var, 1, j9);
                }
                if (!c.i(wb6Var) || !nb3.k(str3, "")) {
                    c.Q(wb6Var, 2, str3);
                }
                if (!c.i(wb6Var) || !nb3.k(str2, "")) {
                    c.Q(wb6Var, 3, str2);
                }
                if (!c.i(wb6Var) || j8 != 0) {
                    c.n(wb6Var, 4, j8);
                }
                if (!c.i(wb6Var) || j7 != 0) {
                    c.n(wb6Var, 5, j7);
                }
                if (!c.i(wb6Var) || z2) {
                    c.u(wb6Var, 6, z2);
                }
                if (!c.i(wb6Var) || !nb3.k(str, "")) {
                    c.Q(wb6Var, 7, str);
                }
                if (!c.i(wb6Var) || j != 0) {
                    c.n(wb6Var, 8, j);
                }
                if (!c.i(wb6Var) || j5 != 0) {
                    c.n(wb6Var, 9, j5);
                }
                if (!c.i(wb6Var) || j4 != 0) {
                    c.n(wb6Var, 10, j4);
                }
                if (!c.i(wb6Var) || j3 != 0) {
                    c.n(wb6Var, 11, j3);
                }
                if (!c.i(wb6Var) || j2 != 0) {
                    c.n(wb6Var, 12, j2);
                }
                if (!c.i(wb6Var)) {
                    bArr = bArr2;
                } else {
                    bArr = bArr2;
                }
                c.w(wb6Var, 13, x90.c, bArr);
                if (!c.i(wb6Var)) {
                    gk4Var = gk4Var2;
                } else {
                    gk4Var = gk4Var2;
                }
                c.w(wb6Var, 14, (gg3) go3VarArr[14].getValue(), gk4Var);
                if (!c.i(wb6Var)) {
                    ik4Var = ik4Var2;
                } else {
                    ik4Var = ik4Var2;
                }
                c.w(wb6Var, 15, (gg3) go3VarArr[15].getValue(), ik4Var);
                if (!c.i(wb6Var) || z) {
                    c.u(wb6Var, 16, z);
                }
                c.a(wb6Var);
            }
        }
        j = j6;
        c.w(wb6Var, i, (gg3) go3VarArr[i].getValue(), dj4Var);
        if (!c.i(wb6Var)) {
        }
        c.n(wb6Var, 1, j9);
        if (!c.i(wb6Var)) {
        }
        c.Q(wb6Var, 2, str3);
        if (!c.i(wb6Var)) {
        }
        c.Q(wb6Var, 3, str2);
        if (!c.i(wb6Var)) {
        }
        c.n(wb6Var, 4, j8);
        if (!c.i(wb6Var)) {
        }
        c.n(wb6Var, 5, j7);
        if (!c.i(wb6Var)) {
        }
        c.u(wb6Var, 6, z2);
        if (!c.i(wb6Var)) {
        }
        c.Q(wb6Var, 7, str);
        if (!c.i(wb6Var)) {
        }
        c.n(wb6Var, 8, j);
        if (!c.i(wb6Var)) {
        }
        c.n(wb6Var, 9, j5);
        if (!c.i(wb6Var)) {
        }
        c.n(wb6Var, 10, j4);
        if (!c.i(wb6Var)) {
        }
        c.n(wb6Var, 11, j3);
        if (!c.i(wb6Var)) {
        }
        c.n(wb6Var, 12, j2);
        if (!c.i(wb6Var)) {
        }
        c.w(wb6Var, 13, x90.c, bArr);
        if (!c.i(wb6Var)) {
        }
        c.w(wb6Var, 14, (gg3) go3VarArr[14].getValue(), gk4Var);
        if (!c.i(wb6Var)) {
        }
        c.w(wb6Var, 15, (gg3) go3VarArr[15].getValue(), ik4Var);
        if (!c.i(wb6Var)) {
        }
        c.u(wb6Var, 16, z);
        c.a(wb6Var);
    }

    @Override // defpackage.gg3
    public final wb6 e() {
        return descriptor;
    }
}
