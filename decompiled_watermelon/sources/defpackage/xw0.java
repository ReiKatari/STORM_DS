package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xw0  reason: default package */
/* loaded from: classes.dex */
public final class xw0 implements tw0 {
    public final eq4 A;
    public final eq4 B;
    public final iq0 L;
    public final ThreadLocal R;
    public volatile boolean X;
    public final long Y;
    public final int Z;

    public xw0(final q03 q03Var, final String str, int i) {
        str.getClass();
        this.L = new iq0(27);
        this.R = new ThreadLocal();
        hm1 hm1Var = im1.B;
        this.Y = b53.k0(30, om1.SECONDS);
        this.Z = 2;
        if (i > 0) {
            this.A = new eq4(i, new ki2() { // from class: uw0
                @Override // defpackage.ki2
                public final Object c() {
                    int i2 = r3;
                    String str2 = str;
                    q03 q03Var2 = q03Var;
                    switch (i2) {
                        case 0:
                            ls5 b = q03Var2.b(str2);
                            yf2.o(b, "PRAGMA query_only = 1");
                            return b;
                        default:
                            return q03Var2.b(str2);
                    }
                }
            });
            this.B = new eq4(1, new ki2() { // from class: uw0
                @Override // defpackage.ki2
                public final Object c() {
                    int i2 = r3;
                    String str2 = str;
                    q03 q03Var2 = q03Var;
                    switch (i2) {
                        case 0:
                            ls5 b = q03Var2.b(str2);
                            yf2.o(b, "PRAGMA query_only = 1");
                            return b;
                        default:
                            return q03Var2.b(str2);
                    }
                }
            });
            return;
        }
        i.i("Maximum number of readers must be greater than 0");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x014b A[Catch: all -> 0x01a6, TRY_LEAVE, TryCatch #1 {all -> 0x01a6, blocks: (B:64:0x0124, B:69:0x0140, B:71:0x014b, B:86:0x01aa, B:87:0x01b1), top: B:109:0x0124 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01aa A[Catch: all -> 0x01a6, TRY_ENTER, TryCatch #1 {all -> 0x01a6, blocks: (B:64:0x0124, B:69:0x0140, B:71:0x014b, B:86:0x01aa, B:87:0x01b1), top: B:109:0x0124 }] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, n75] */
    @Override // defpackage.tw0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object E(boolean r18, defpackage.aj2 r19, defpackage.k11 r20) {
        /*
            Method dump skipped, instructions count: 491
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xw0.E(boolean, aj2, k11):java.lang.Object");
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (!this.X) {
            this.X = true;
            this.A.c();
            this.B.c();
        }
    }

    public xw0(q03 q03Var) {
        this.L = new iq0(27);
        this.R = new ThreadLocal();
        hm1 hm1Var = im1.B;
        this.Y = b53.k0(30, om1.SECONDS);
        this.Z = 2;
        eq4 eq4Var = new eq4(1, new b5(18, q03Var));
        this.A = eq4Var;
        this.B = eq4Var;
    }
}
