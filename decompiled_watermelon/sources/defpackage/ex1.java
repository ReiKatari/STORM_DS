package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ex1  reason: default package */
/* loaded from: classes.dex */
public final class ex1 extends nk6 implements aj2 {
    public final /* synthetic */ int X;
    public int Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ hv1 c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ex1(int i, j11 j11Var, hv1 hv1Var) {
        super(2, j11Var);
        this.X = i;
        this.c0 = hv1Var;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.X;
        o27 o27Var = o27.a;
        switch (i) {
            case 0:
                return ((ex1) t((j11) obj2, (x15) obj)).v(o27Var);
            default:
                return ((ex1) t((j11) obj2, (o31) obj)).v(o27Var);
        }
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        int i = this.X;
        hv1 hv1Var = this.c0;
        switch (i) {
            case 0:
                ex1 ex1Var = new ex1(0, j11Var, hv1Var);
                ex1Var.Z = obj;
                return ex1Var;
            default:
                ex1 ex1Var2 = new ex1(1, j11Var, hv1Var);
                ex1Var2.Z = obj;
                return ex1Var2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0095, code lost:
        if (((java.lang.Boolean) r9).booleanValue() != false) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0038 -> B:15:0x003c). Please submit an issue!!! */
    @Override // defpackage.m00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.X
            hv1 r1 = r8.c0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r3 = 1
            r4 = 0
            switch(r0) {
                case 0: goto L5e;
                default: goto Lb;
            }
        Lb:
            java.lang.Object r0 = r8.Z
            o31 r0 = (defpackage.o31) r0
            p31 r5 = defpackage.p31.COROUTINE_SUSPENDED
            int r6 = r8.Y
            if (r6 == 0) goto L1f
            if (r6 != r3) goto L1b
            defpackage.me2.a0(r9)
            goto L3c
        L1b:
            defpackage.i.n(r2)
            goto L5d
        L1f:
            defpackage.me2.a0(r9)
        L22:
            boolean r9 = defpackage.iq2.t(r0)
            if (r9 == 0) goto L5b
            hm1 r9 = defpackage.im1.B
            om1 r9 = defpackage.om1.SECONDS
            long r6 = defpackage.b53.k0(r3, r9)
            r8.Z = r0
            r8.Y = r3
            java.lang.Object r9 = defpackage.dk7.r(r6, r8)
            if (r9 != r5) goto L3c
            r4 = r5
            goto L5d
        L3c:
            ee6 r9 = r1.H0
            rs1 r2 = r1.v
            xg r2 = (defpackage.xg) r2
            r2.getClass()
            me.magnum.melonds.MelonEmulator r2 = me.magnum.melonds.MelonEmulator.a
            float r2 = r2.getFPS()
            int r2 = defpackage.jv3.X(r2)
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r2)
            r9.getClass()
            r9.l(r4, r6)
            goto L22
        L5b:
            o27 r4 = defpackage.o27.a
        L5d:
            return r4
        L5e:
            java.lang.Object r0 = r8.Z
            x15 r0 = (defpackage.x15) r0
            p31 r5 = defpackage.p31.COROUTINE_SUSPENDED
            int r6 = r8.Y
            if (r6 == 0) goto L72
            if (r6 != r3) goto L6e
            defpackage.me2.a0(r9)
            goto L8f
        L6e:
            defpackage.i.n(r2)
            goto L9d
        L72:
            defpackage.me2.a0(r9)
            me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeConfig r9 = r1.N
            x15 r9 = defpackage.hv1.Y0(r9)
            boolean r9 = defpackage.b53.x(r9, r0)
            if (r9 == 0) goto L98
            r8.Z = r4
            r8.Y = r3
            me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeConfig r9 = r1.N
            java.lang.Object r9 = r1.Z(r9, r8)
            if (r9 != r5) goto L8f
            r4 = r5
            goto L9d
        L8f:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r8 = r9.booleanValue()
            if (r8 == 0) goto L98
            goto L99
        L98:
            r3 = 0
        L99:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
        L9d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ex1.v(java.lang.Object):java.lang.Object");
    }
}
