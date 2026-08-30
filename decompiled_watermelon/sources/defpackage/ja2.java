package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ja2  reason: default package */
/* loaded from: classes.dex */
public final class ja2 implements u92 {
    public final /* synthetic */ u92 A;
    public final /* synthetic */ bj2 B;

    public ja2(u92 u92Var, bj2 bj2Var) {
        this.A = u92Var;
        this.B = bj2Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:1|(2:3|(9:5|6|7|(1:(1:(1:(5:12|13|14|15|16)(2:22|23))(2:24|25))(2:26|27))(2:38|39)|28|29|30|(3:32|15|16)|33))|46|6|7|(0)(0)|28|29|30|(0)|33|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004c, code lost:
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004d, code lost:
        r9 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0060, code lost:
        if (r10.a(r9, r0) == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0089, code lost:
        r10 = new defpackage.ft6(r9);
        r9 = r9.B;
        r0.Z = r9;
        r0.c0 = null;
        r0.X = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009a, code lost:
        if (defpackage.bg7.a(r10, r9, r9, r0) == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:?, code lost:
        throw r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007c  */
    @Override // defpackage.u92
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.w92 r9, defpackage.j11 r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.ia2
            if (r0 == 0) goto L13
            r0 = r10
            ia2 r0 = (defpackage.ia2) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.X = r1
            goto L18
        L13:
            ia2 r0 = new ia2
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.R
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.X
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L51
            if (r2 == r5) goto L42
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L34
            java.lang.Object r8 = r0.Z
            os5 r8 = (defpackage.os5) r8
            defpackage.me2.a0(r10)     // Catch: java.lang.Throwable -> L32
            goto L7d
        L32:
            r9 = move-exception
            goto L85
        L34:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r8)
            return r6
        L3a:
            java.lang.Object r8 = r0.Z
            java.lang.Throwable r8 = (java.lang.Throwable) r8
            defpackage.me2.a0(r10)
            goto L9d
        L42:
            w92 r9 = r0.c0
            java.lang.Object r8 = r0.Z
            ja2 r8 = (defpackage.ja2) r8
            defpackage.me2.a0(r10)     // Catch: java.lang.Throwable -> L4c
            goto L63
        L4c:
            r9 = move-exception
            r7 = r9
            r9 = r8
            r8 = r7
            goto L89
        L51:
            defpackage.me2.a0(r10)
            u92 r10 = r8.A     // Catch: java.lang.Throwable -> L4c
            r0.Z = r8     // Catch: java.lang.Throwable -> L4c
            r0.c0 = r9     // Catch: java.lang.Throwable -> L4c
            r0.X = r5     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r10 = r10.a(r9, r0)     // Catch: java.lang.Throwable -> L4c
            if (r10 != r1) goto L63
            goto L9c
        L63:
            os5 r10 = new os5
            e31 r2 = r0.B
            r2.getClass()
            r10.<init>(r9, r2)
            bj2 r8 = r8.B     // Catch: java.lang.Throwable -> L83
            r0.Z = r10     // Catch: java.lang.Throwable -> L83
            r0.c0 = r6     // Catch: java.lang.Throwable -> L83
            r0.X = r3     // Catch: java.lang.Throwable -> L83
            java.lang.Object r8 = r8.i(r10, r6, r0)     // Catch: java.lang.Throwable -> L83
            if (r8 != r1) goto L7c
            goto L9c
        L7c:
            r8 = r10
        L7d:
            r8.w()
            o27 r8 = defpackage.o27.a
            return r8
        L83:
            r9 = move-exception
            r8 = r10
        L85:
            r8.w()
            throw r9
        L89:
            ft6 r10 = new ft6
            r10.<init>(r8)
            bj2 r9 = r9.B
            r0.Z = r8
            r0.c0 = r6
            r0.X = r4
            java.lang.Object r9 = defpackage.bg7.a(r10, r9, r8, r0)
            if (r9 != r1) goto L9d
        L9c:
            return r1
        L9d:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ja2.a(w92, j11):java.lang.Object");
    }
}
