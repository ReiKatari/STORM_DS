package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: vd5  reason: default package */
/* loaded from: classes.dex */
public final class vd5 extends nk6 implements aj2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ xd5 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vd5(xd5 xd5Var, j11 j11Var, int i) {
        super(2, j11Var);
        this.X = i;
        this.Z = xd5Var;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.X;
        o27 o27Var = o27.a;
        o31 o31Var = (o31) obj;
        j11 j11Var = (j11) obj2;
        switch (i) {
            case 0:
                return ((vd5) t(j11Var, o31Var)).v(o27Var);
            case 1:
                return ((vd5) t(j11Var, o31Var)).v(o27Var);
            default:
                return ((vd5) t(j11Var, o31Var)).v(o27Var);
        }
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        int i = this.X;
        xd5 xd5Var = this.Z;
        switch (i) {
            case 0:
                return new vd5(xd5Var, j11Var, 0);
            case 1:
                return new vd5(xd5Var, j11Var, 1);
            default:
                return new vd5(xd5Var, j11Var, 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
        if (r9 == r0) goto L31;
     */
    @Override // defpackage.m00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.X
            o27 r1 = defpackage.o27.a
            xd5 r2 = r8.Z
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            r4 = 1
            r5 = 0
            switch(r0) {
                case 0: goto L74;
                case 1: goto L2f;
                default: goto Ld;
            }
        Ld:
            p31 r0 = defpackage.p31.COROUTINE_SUSPENDED
            int r6 = r8.Y
            if (r6 == 0) goto L1e
            if (r6 != r4) goto L19
            defpackage.me2.a0(r9)
            goto L2e
        L19:
            defpackage.i.n(r3)
            r1 = r5
            goto L2e
        L1e:
            defpackage.me2.a0(r9)
            ud5 r9 = r2.b
            r8.Y = r4
            dl r9 = (defpackage.dl) r9
            java.lang.Object r8 = r9.y(r8)
            if (r8 != r0) goto L2e
            r1 = r0
        L2e:
            return r1
        L2f:
            p31 r0 = defpackage.p31.COROUTINE_SUSPENDED
            int r6 = r8.Y
            r7 = 2
            if (r6 == 0) goto L47
            if (r6 == r4) goto L43
            if (r6 != r7) goto L3e
            defpackage.me2.a0(r9)
            goto L73
        L3e:
            defpackage.i.n(r3)
            r1 = r5
            goto L73
        L43:
            defpackage.me2.a0(r9)
            goto L57
        L47:
            defpackage.me2.a0(r9)
            ud5 r9 = r2.b
            r8.Y = r4
            dl r9 = (defpackage.dl) r9
            java.lang.Object r9 = r9.w(r8)
            if (r9 != r0) goto L57
            goto L72
        L57:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L6a
            ee6 r8 = r2.c
            uc5 r9 = defpackage.uc5.a
            r8.getClass()
            r8.l(r5, r9)
            goto L73
        L6a:
            r8.Y = r7
            java.lang.Object r8 = defpackage.xd5.e(r2, r8)
            if (r8 != r0) goto L73
        L72:
            r1 = r0
        L73:
            return r1
        L74:
            p31 r0 = defpackage.p31.COROUTINE_SUSPENDED
            int r6 = r8.Y
            if (r6 == 0) goto L85
            if (r6 != r4) goto L80
            defpackage.me2.a0(r9)
            goto L91
        L80:
            defpackage.i.n(r3)
            r1 = r5
            goto L91
        L85:
            defpackage.me2.a0(r9)
            r8.Y = r4
            java.lang.Object r8 = defpackage.xd5.e(r2, r8)
            if (r8 != r0) goto L91
            r1 = r0
        L91:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vd5.v(java.lang.Object):java.lang.Object");
    }
}
