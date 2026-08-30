package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: z94  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class z94 implements kl2 {
    public static final z94 a;
    private static final h06 descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [kl2, z94, java.lang.Object] */
    static {
        ?? obj = new Object();
        a = obj;
        hp4 hp4Var = new hp4("me.magnum.melonds.impl.retroachievements.offline.OfflineLedgerPayload", obj, 17);
        hp4Var.l("recordType", true);
        hp4Var.m(new y94(1, 0));
        hp4Var.l("seq", true);
        hp4Var.m(new y94(2, 0));
        hp4Var.l("userId", true);
        hp4Var.m(new y94(3, 0));
        hp4Var.l("contentId", true);
        hp4Var.m(new y94(4, 0));
        hp4Var.l("gameId", true);
        hp4Var.m(new y94(5, 0));
        hp4Var.l("achievementId", true);
        hp4Var.m(new y94(6, 0));
        hp4Var.l("isHardcore", true);
        hp4Var.m(new y94(7, 0));
        hp4Var.l("sessionId", true);
        hp4Var.m(new y94(8, 0));
        hp4Var.l("localTimestampEpochMs", true);
        hp4Var.m(new y94(9, 0));
        hp4Var.l("offsetFromSessionStartMs", true);
        hp4Var.m(new y94(10, 0));
        hp4Var.l("orderIndex", true);
        hp4Var.m(new y94(11, 0));
        hp4Var.l("ackedSeq", true);
        hp4Var.m(new y94(12, 0));
        hp4Var.l("estimatedPlayDurationMs", true);
        hp4Var.m(new y94(13, 0));
        hp4Var.l("prevHash", true);
        hp4Var.m(new y94(14, 0));
        hp4Var.l("unlockMode", true);
        hp4Var.m(new y94(15, 0));
        hp4Var.l("offlineType", true);
        hp4Var.m(new y94(16, 0));
        hp4Var.l("pendingSync", true);
        hp4Var.m(new y94(17, 0));
        descriptor = hp4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.kl2
    public final m93[] a() {
        gh3[] gh3VarArr = ba4.r;
        as3 as3Var = as3.a;
        yg6 yg6Var = yg6.a;
        w30 w30Var = w30.a;
        return new m93[]{gh3VarArr[0].getValue(), as3Var, yg6Var, yg6Var, as3Var, as3Var, w30Var, yg6Var, as3Var, as3Var, as3Var, as3Var, as3Var, q70.c, gh3VarArr[14].getValue(), gh3VarArr[15].getValue(), w30Var};
    }

    @Override // defpackage.m93
    public final Object b(b91 b91Var) {
        h06 h06Var = descriptor;
        yu0 c = b91Var.c(h06Var);
        gh3[] gh3VarArr = ba4.r;
        c.getClass();
        byte[] bArr = null;
        ga4 ga4Var = null;
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
        jb4 jb4Var = null;
        lb4 lb4Var = null;
        while (z) {
            int v = c.v(h06Var);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    ga4Var = (ga4) c.U(h06Var, 0, (m93) gh3VarArr[0].getValue(), ga4Var);
                    i |= 1;
                    break;
                case 1:
                    j = c.a0(h06Var, 1);
                    i |= 2;
                    break;
                case 2:
                    str = c.K(h06Var, 2);
                    i |= 4;
                    break;
                case 3:
                    str2 = c.K(h06Var, 3);
                    i |= 8;
                    break;
                case 4:
                    j2 = c.a0(h06Var, 4);
                    i |= 16;
                    break;
                case 5:
                    j3 = c.a0(h06Var, 5);
                    i |= 32;
                    break;
                case ig7.b /* 6 */:
                    z2 = c.O(h06Var, 6);
                    i |= 64;
                    break;
                case 7:
                    str3 = c.K(h06Var, 7);
                    i |= 128;
                    break;
                case 8:
                    j4 = c.a0(h06Var, 8);
                    i |= 256;
                    break;
                case 9:
                    j5 = c.a0(h06Var, 9);
                    i |= 512;
                    break;
                case 10:
                    j6 = c.a0(h06Var, 10);
                    i |= 1024;
                    break;
                case 11:
                    j7 = c.a0(h06Var, 11);
                    i |= 2048;
                    break;
                case mj2.L /* 12 */:
                    j8 = c.a0(h06Var, 12);
                    i |= 4096;
                    break;
                case 13:
                    bArr = (byte[]) c.U(h06Var, 13, q70.c, bArr);
                    i |= 8192;
                    break;
                case 14:
                    jb4Var = (jb4) c.U(h06Var, 14, (m93) gh3VarArr[14].getValue(), jb4Var);
                    i |= 16384;
                    break;
                case ig7.e /* 15 */:
                    lb4Var = (lb4) c.U(h06Var, 15, (m93) gh3VarArr[15].getValue(), lb4Var);
                    i |= 32768;
                    break;
                case 16:
                    z3 = c.O(h06Var, 16);
                    i |= 65536;
                    break;
                default:
                    throw new q27(v);
            }
        }
        c.a(h06Var);
        return new ba4(i, ga4Var, j, str, str2, j2, j3, z2, str3, j4, j5, j6, j7, j8, bArr, jb4Var, lb4Var, z3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x0143, code lost:
        if (defpackage.b53.x(r1, new byte[0]) == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0159, code lost:
        if (r1 != defpackage.jb4.UNKNOWN) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0175, code lost:
        if (r1 != defpackage.lb4.UNKNOWN) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0171  */
    @Override // defpackage.m93
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.mz1 r30, java.lang.Object r31) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z94.d(mz1, java.lang.Object):void");
    }

    @Override // defpackage.m93
    public final h06 e() {
        return descriptor;
    }
}
