package cd;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c extends dd.e {
    public final ec.j R;
    public final ec.j X;

    public c(mc.p pVar, cc.g gVar, int i2, bd.a aVar) {
        super(gVar, i2, aVar);
        ec.j jVar = (ec.j) pVar;
        this.R = jVar;
        this.X = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0051  */
    /* JADX WARN: Type inference failed for: r7v3, types: [ec.j, mc.p] */
    @Override // dd.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(bd.v r6, cc.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof cd.b
            if (r0 == 0) goto L13
            r0 = r7
            cd.b r0 = (cd.b) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L1a
        L13:
            cd.b r0 = new cd.b
            ec.c r7 = (ec.c) r7
            r0.<init>(r5, r7)
        L1a:
            java.lang.Object r7 = r0.X
            dc.a r1 = dc.a.COROUTINE_SUSPENDED
            int r2 = r0.Z
            yb.y r3 = yb.y.f14813a
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2d
            bd.v r6 = r0.R
            p7.j.I(r7)
            goto L48
        L2d:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r6)
        L32:
            r6 = 0
            return r6
        L34:
            p7.j.I(r7)
            r0.R = r6
            r0.Z = r4
            ec.j r7 = r5.R
            java.lang.Object r7 = r7.j(r6, r0)
            if (r7 != r1) goto L44
            goto L45
        L44:
            r7 = r3
        L45:
            if (r7 != r1) goto L48
            return r1
        L48:
            bd.h r6 = r6.R
            boolean r6 = r6.y()
            if (r6 == 0) goto L51
            return r3
        L51:
            java.lang.String r6 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            a0.j.p(r6)
            goto L32
        */
        throw new UnsupportedOperationException("Method not decompiled: cd.c.e(bd.v, cc.c):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ec.j, mc.p] */
    @Override // dd.e
    public final dd.e f(cc.g gVar, int i2, bd.a aVar) {
        return new c(this.X, gVar, i2, aVar);
    }

    @Override // dd.e
    public final String toString() {
        return "block[" + this.R + "] -> " + super.toString();
    }
}
