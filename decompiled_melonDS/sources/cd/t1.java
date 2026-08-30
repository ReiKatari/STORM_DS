package cd;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class t1 implements i {
    public final i A;
    public final mh.m B;

    public t1(i iVar, mh.m mVar) {
        this.A = iVar;
        this.B = mVar;
    }

    @Override // cd.i
    public final Object a(Object obj, cc.c cVar) {
        return this.A.a(obj, cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0065  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [ec.c] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(ec.c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof cd.s1
            if (r0 == 0) goto L13
            r0 = r8
            cd.s1 r0 = (cd.s1) r0
            int r1 = r0.f2862b0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2862b0 = r1
            goto L18
        L13:
            cd.s1 r0 = new cd.s1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.Y
            dc.a r1 = dc.a.COROUTINE_SUSPENDED
            int r2 = r0.f2862b0
            yb.y r3 = yb.y.f14813a
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3d
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2c
            p7.j.I(r8)
            return r3
        L2c:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r8)
            r8 = 0
            return r8
        L33:
            dd.v r2 = r0.X
            cd.t1 r5 = r0.R
            p7.j.I(r8)     // Catch: java.lang.Throwable -> L3b
            goto L5c
        L3b:
            r8 = move-exception
            goto L76
        L3d:
            p7.j.I(r8)
            dd.v r2 = new dd.v
            cc.g r8 = r0.B
            r8.getClass()
            cd.i r6 = r7.A
            r2.<init>(r6, r8)
            mh.m r8 = r7.B     // Catch: java.lang.Throwable -> L3b
            r0.R = r7     // Catch: java.lang.Throwable -> L3b
            r0.X = r2     // Catch: java.lang.Throwable -> L3b
            r0.f2862b0 = r5     // Catch: java.lang.Throwable -> L3b
            java.lang.Object r8 = r8.j(r2, r0)     // Catch: java.lang.Throwable -> L3b
            if (r8 != r1) goto L5b
            goto L74
        L5b:
            r5 = r7
        L5c:
            r2.w()
            cd.i r8 = r5.A
            boolean r2 = r8 instanceof cd.t1
            if (r2 == 0) goto L75
            cd.t1 r8 = (cd.t1) r8
            r2 = 0
            r0.R = r2
            r0.X = r2
            r0.f2862b0 = r4
            java.lang.Object r8 = r8.b(r0)
            if (r8 != r1) goto L75
        L74:
            return r1
        L75:
            return r3
        L76:
            r2.w()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: cd.t1.b(ec.c):java.lang.Object");
    }
}
