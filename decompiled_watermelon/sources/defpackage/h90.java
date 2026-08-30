package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: h90  reason: default package */
/* loaded from: classes.dex */
public final class h90 extends nj0 {
    public final aj2 R;
    public final aj2 X;

    public h90(aj2 aj2Var, e31 e31Var, int i, h60 h60Var) {
        super(e31Var, i, h60Var);
        this.R = aj2Var;
        this.X = aj2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0051  */
    @Override // defpackage.nj0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.nu4 r7, defpackage.j11 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.g90
            if (r0 == 0) goto L13
            r0 = r8
            g90 r0 = (defpackage.g90) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L1a
        L13:
            g90 r0 = new g90
            k11 r8 = (defpackage.k11) r8
            r0.<init>(r6, r8)
        L1a:
            java.lang.Object r8 = r0.X
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.Z
            r3 = 0
            o27 r4 = defpackage.o27.a
            r5 = 1
            if (r2 == 0) goto L34
            if (r2 != r5) goto L2e
            nu4 r7 = r0.R
            defpackage.me2.a0(r8)
            goto L48
        L2e:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r6)
            return r3
        L34:
            defpackage.me2.a0(r8)
            r0.R = r7
            r0.Z = r5
            aj2 r6 = r6.R
            java.lang.Object r6 = r6.j(r7, r0)
            if (r6 != r1) goto L44
            goto L45
        L44:
            r6 = r4
        L45:
            if (r6 != r1) goto L48
            return r1
        L48:
            q60 r6 = r7.Y
            boolean r6 = r6.G()
            if (r6 == 0) goto L51
            return r4
        L51:
            java.lang.String r6 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            defpackage.i.n(r6)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h90.f(nu4, j11):java.lang.Object");
    }

    @Override // defpackage.nj0
    public final nj0 g(e31 e31Var, int i, h60 h60Var) {
        return new h90(this.X, e31Var, i, h60Var);
    }

    @Override // defpackage.nj0
    public final String toString() {
        return "block[" + this.R + "] -> " + super.toString();
    }
}
