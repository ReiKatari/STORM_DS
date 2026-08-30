package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: la2  reason: default package */
/* loaded from: classes.dex */
public final class la2 implements u92 {
    public final /* synthetic */ int A;
    public final /* synthetic */ u92 B;
    public final /* synthetic */ aj2 L;

    public la2(aj2 aj2Var, u92 u92Var) {
        this.A = 0;
        this.L = aj2Var;
        this.B = u92Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.u92
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.w92 r9, defpackage.j11 r10) {
        /*
            r8 = this;
            int r0 = r8.A
            u92 r1 = r8.B
            o27 r2 = defpackage.o27.a
            aj2 r3 = r8.L
            switch(r0) {
                case 0: goto L31;
                case 1: goto L1c;
                default: goto Lb;
            }
        Lb:
            r90 r8 = new r90
            r0 = 10
            r8.<init>(r0, r9, r3)
            java.lang.Object r8 = r1.a(r8, r10)
            p31 r9 = defpackage.p31.COROUTINE_SUSPENDED
            if (r8 != r9) goto L1b
            r2 = r8
        L1b:
            return r2
        L1c:
            j75 r8 = new j75
            r8.<init>()
            hc r0 = new hc
            r4 = 4
            r0.<init>(r8, r9, r3, r4)
            java.lang.Object r8 = r1.a(r0, r10)
            p31 r9 = defpackage.p31.COROUTINE_SUSPENDED
            if (r8 != r9) goto L30
            r2 = r8
        L30:
            return r2
        L31:
            boolean r0 = r10 instanceof defpackage.ka2
            if (r0 == 0) goto L44
            r0 = r10
            ka2 r0 = (defpackage.ka2) r0
            int r1 = r0.X
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r1 & r4
            if (r5 == 0) goto L44
            int r1 = r1 - r4
            r0.X = r1
            goto L49
        L44:
            ka2 r0 = new ka2
            r0.<init>(r8, r10)
        L49:
            java.lang.Object r10 = r0.R
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r4 = r0.X
            r5 = 0
            r6 = 2
            r7 = 1
            if (r4 == 0) goto L6f
            if (r4 == r7) goto L63
            if (r4 != r6) goto L5c
            defpackage.me2.a0(r10)
            goto La1
        L5c:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r8)
            r2 = r5
            goto La1
        L63:
            os5 r8 = r0.d0
            w92 r9 = r0.c0
            la2 r3 = r0.Z
            defpackage.me2.a0(r10)     // Catch: java.lang.Throwable -> L6d
            goto L8d
        L6d:
            r9 = move-exception
            goto La4
        L6f:
            defpackage.me2.a0(r10)
            os5 r10 = new os5
            e31 r4 = r0.B
            r4.getClass()
            r10.<init>(r9, r4)
            r0.Z = r8     // Catch: java.lang.Throwable -> La2
            r0.c0 = r9     // Catch: java.lang.Throwable -> La2
            r0.d0 = r10     // Catch: java.lang.Throwable -> La2
            r0.X = r7     // Catch: java.lang.Throwable -> La2
            java.lang.Object r3 = r3.j(r10, r0)     // Catch: java.lang.Throwable -> La2
            if (r3 != r1) goto L8b
            goto La0
        L8b:
            r3 = r8
            r8 = r10
        L8d:
            r8.w()
            u92 r8 = r3.B
            r0.Z = r5
            r0.c0 = r5
            r0.d0 = r5
            r0.X = r6
            java.lang.Object r8 = r8.a(r9, r0)
            if (r8 != r1) goto La1
        La0:
            r2 = r1
        La1:
            return r2
        La2:
            r9 = move-exception
            r8 = r10
        La4:
            r8.w()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.la2.a(w92, j11):java.lang.Object");
    }

    public /* synthetic */ la2(u92 u92Var, aj2 aj2Var, int i) {
        this.A = i;
        this.B = u92Var;
        this.L = aj2Var;
    }
}
