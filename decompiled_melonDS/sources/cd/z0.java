package cd;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class z0 implements h {
    public final /* synthetic */ int A = 0;
    public final ec.j B;

    public z0(mc.q qVar) {
        this.B = (ec.j) qVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0058  */
    /* JADX WARN: Type inference failed for: r1v5, types: [ec.j, mc.q] */
    /* JADX WARN: Type inference failed for: r7v3, types: [ec.j, mc.p] */
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
                case 0: goto L24;
                default: goto L5;
            }
        L5:
            a2.o r0 = new a2.o
            ec.j r1 = r6.B
            r2 = 0
            r0.<init>(r1, r7, r2)
            dd.r r7 = new dd.r
            cc.g r1 = r8.g()
            r2 = 0
            r7.<init>(r1, r8, r2)
            r8 = 1
            java.lang.Object r7 = a.a.W(r7, r8, r7, r0)
            dc.a r8 = dc.a.COROUTINE_SUSPENDED
            if (r7 != r8) goto L21
            goto L23
        L21:
            yb.y r7 = yb.y.f14813a
        L23:
            return r7
        L24:
            boolean r0 = r8 instanceof cd.a
            if (r0 == 0) goto L37
            r0 = r8
            cd.a r0 = (cd.a) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L37
            int r1 = r1 - r2
            r0.Z = r1
            goto L3c
        L37:
            cd.a r0 = new cd.a
            r0.<init>(r6, r8)
        L3c:
            java.lang.Object r8 = r0.X
            dc.a r1 = dc.a.COROUTINE_SUSPENDED
            int r2 = r0.Z
            yb.y r3 = yb.y.f14813a
            r4 = 1
            if (r2 == 0) goto L58
            if (r2 != r4) goto L51
            dd.v r7 = r0.R
            p7.j.I(r8)     // Catch: java.lang.Throwable -> L4f
            goto L77
        L4f:
            r8 = move-exception
            goto L82
        L51:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r7)
            r1 = 0
            goto L7b
        L58:
            p7.j.I(r8)
            dd.v r8 = new dd.v
            cc.g r2 = r0.B
            r2.getClass()
            r8.<init>(r7, r2)
            r0.R = r8     // Catch: java.lang.Throwable -> L80
            r0.Z = r4     // Catch: java.lang.Throwable -> L80
            ec.j r7 = r6.B     // Catch: java.lang.Throwable -> L80
            java.lang.Object r7 = r7.j(r8, r0)     // Catch: java.lang.Throwable -> L80
            if (r7 != r1) goto L72
            goto L73
        L72:
            r7 = r3
        L73:
            if (r7 != r1) goto L76
            goto L7b
        L76:
            r7 = r8
        L77:
            r7.w()
            r1 = r3
        L7b:
            return r1
        L7c:
            r5 = r8
            r8 = r7
            r7 = r5
            goto L82
        L80:
            r7 = move-exception
            goto L7c
        L82:
            r7.w()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: cd.z0.c(cd.i, cc.c):java.lang.Object");
    }

    public z0(mc.p pVar) {
        this.B = (ec.j) pVar;
    }
}
