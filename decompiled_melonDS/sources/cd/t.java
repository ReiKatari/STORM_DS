package cd;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class t implements h {
    public final /* synthetic */ h A;
    public final /* synthetic */ ec.j B;

    public t(h hVar, mc.q qVar) {
        this.A = hVar;
        this.B = (ec.j) qVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v4, types: [ec.j, mc.q] */
    /* JADX WARN: Type inference failed for: r9v6, types: [ec.j, mc.q] */
    @Override // cd.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(cd.i r9, cc.c r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof cd.s
            if (r0 == 0) goto L13
            r0 = r10
            cd.s r0 = (cd.s) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.X = r1
            goto L18
        L13:
            cd.s r0 = new cd.s
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.R
            dc.a r1 = dc.a.COROUTINE_SUSPENDED
            int r2 = r0.X
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L4f
            if (r2 == r5) goto L43
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L34
            java.lang.Object r9 = r0.Z
            dd.v r9 = (dd.v) r9
            p7.j.I(r10)     // Catch: java.lang.Throwable -> L32
            goto L7c
        L32:
            r10 = move-exception
            goto L86
        L34:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r9)
            r9 = 0
            return r9
        L3b:
            java.lang.Object r9 = r0.Z
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            p7.j.I(r10)
            goto La0
        L43:
            cd.i r9 = r0.f2860b0
            java.lang.Object r2 = r0.Z
            cd.t r2 = (cd.t) r2
            p7.j.I(r10)     // Catch: java.lang.Throwable -> L4d
            goto L62
        L4d:
            r9 = move-exception
            goto L8c
        L4f:
            p7.j.I(r10)
            cd.h r10 = r8.A     // Catch: java.lang.Throwable -> L8a
            r0.Z = r8     // Catch: java.lang.Throwable -> L8a
            r0.f2860b0 = r9     // Catch: java.lang.Throwable -> L8a
            r0.X = r5     // Catch: java.lang.Throwable -> L8a
            java.lang.Object r10 = r10.c(r9, r0)     // Catch: java.lang.Throwable -> L8a
            if (r10 != r1) goto L61
            goto L9f
        L61:
            r2 = r8
        L62:
            dd.v r10 = new dd.v
            cc.g r4 = r0.B
            r4.getClass()
            r10.<init>(r9, r4)
            ec.j r9 = r2.B     // Catch: java.lang.Throwable -> L82
            r0.Z = r10     // Catch: java.lang.Throwable -> L82
            r0.f2860b0 = r6     // Catch: java.lang.Throwable -> L82
            r0.X = r3     // Catch: java.lang.Throwable -> L82
            java.lang.Object r9 = r9.i(r10, r6, r0)     // Catch: java.lang.Throwable -> L82
            if (r9 != r1) goto L7b
            goto L9f
        L7b:
            r9 = r10
        L7c:
            r9.w()
            yb.y r9 = yb.y.f14813a
            return r9
        L82:
            r9 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
        L86:
            r9.w()
            throw r10
        L8a:
            r9 = move-exception
            r2 = r8
        L8c:
            cd.w1 r10 = new cd.w1
            r10.<init>(r9)
            ec.j r2 = r2.B
            r0.Z = r9
            r0.f2860b0 = r6
            r0.X = r4
            java.lang.Object r10 = cd.q.e(r10, r2, r9, r0)
            if (r10 != r1) goto La0
        L9f:
            return r1
        La0:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: cd.t.c(cd.i, cc.c):java.lang.Object");
    }
}
