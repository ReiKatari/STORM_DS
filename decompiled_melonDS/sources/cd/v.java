package cd;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class v implements h {
    public final /* synthetic */ int A;
    public final /* synthetic */ h B;
    public final /* synthetic */ ec.j L;

    public v(h hVar, mc.p pVar, int i2) {
        this.A = i2;
        switch (i2) {
            case 2:
                this.B = hVar;
                this.L = (ec.j) pVar;
                return;
            default:
                this.B = hVar;
                this.L = (ec.j) pVar;
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v6, types: [nc.p, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [ec.j, mc.p] */
    /* JADX WARN: Type inference failed for: r2v2, types: [ec.j, mc.p] */
    /* JADX WARN: Type inference failed for: r2v8, types: [ec.j, mc.p] */
    @Override // cd.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(cd.i r7, cc.c r8) {
        /*
            r6 = this;
            int r0 = r6.A
            switch(r0) {
                case 0: goto L34;
                case 1: goto L1a;
                default: goto L5;
            }
        L5:
            cd.a0 r0 = new cd.a0
            ec.j r1 = r6.L
            r0.<init>(r7, r1)
            cd.h r7 = r6.B
            java.lang.Object r7 = r7.c(r0, r8)
            dc.a r8 = dc.a.COROUTINE_SUSPENDED
            if (r7 != r8) goto L17
            goto L19
        L17:
            yb.y r7 = yb.y.f14813a
        L19:
            return r7
        L1a:
            nc.p r0 = new nc.p
            r0.<init>()
            b7.y r1 = new b7.y
            ec.j r2 = r6.L
            r1.<init>(r0, r7, r2)
            cd.h r7 = r6.B
            java.lang.Object r7 = r7.c(r1, r8)
            dc.a r8 = dc.a.COROUTINE_SUSPENDED
            if (r7 != r8) goto L31
            goto L33
        L31:
            yb.y r7 = yb.y.f14813a
        L33:
            return r7
        L34:
            boolean r0 = r8 instanceof cd.u
            if (r0 == 0) goto L47
            r0 = r8
            cd.u r0 = (cd.u) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L47
            int r1 = r1 - r2
            r0.X = r1
            goto L4c
        L47:
            cd.u r0 = new cd.u
            r0.<init>(r6, r8)
        L4c:
            java.lang.Object r8 = r0.R
            dc.a r1 = dc.a.COROUTINE_SUSPENDED
            int r2 = r0.X
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L71
            if (r2 == r4) goto L65
            if (r2 != r3) goto L5e
            p7.j.I(r8)
            goto La7
        L5e:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r7)
            r1 = 0
            goto La9
        L65:
            dd.v r7 = r0.f2866c0
            cd.i r2 = r0.f2865b0
            cd.v r4 = r0.Z
            p7.j.I(r8)     // Catch: java.lang.Throwable -> L6f
            goto L92
        L6f:
            r8 = move-exception
            goto Lae
        L71:
            p7.j.I(r8)
            dd.v r8 = new dd.v
            cc.g r2 = r0.B
            r2.getClass()
            r8.<init>(r7, r2)
            ec.j r2 = r6.L     // Catch: java.lang.Throwable -> Laa
            r0.Z = r6     // Catch: java.lang.Throwable -> Laa
            r0.f2865b0 = r7     // Catch: java.lang.Throwable -> Laa
            r0.f2866c0 = r8     // Catch: java.lang.Throwable -> Laa
            r0.X = r4     // Catch: java.lang.Throwable -> Laa
            java.lang.Object r2 = r2.j(r8, r0)     // Catch: java.lang.Throwable -> Laa
            if (r2 != r1) goto L8f
            goto La9
        L8f:
            r4 = r6
            r2 = r7
            r7 = r8
        L92:
            r7.w()
            cd.h r7 = r4.B
            r8 = 0
            r0.Z = r8
            r0.f2865b0 = r8
            r0.f2866c0 = r8
            r0.X = r3
            java.lang.Object r7 = r7.c(r2, r0)
            if (r7 != r1) goto La7
            goto La9
        La7:
            yb.y r1 = yb.y.f14813a
        La9:
            return r1
        Laa:
            r7 = move-exception
            r5 = r8
            r8 = r7
            r7 = r5
        Lae:
            r7.w()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: cd.v.c(cd.i, cc.c):java.lang.Object");
    }

    public v(mc.p pVar, h hVar) {
        this.A = 0;
        this.L = (ec.j) pVar;
        this.B = hVar;
    }
}
