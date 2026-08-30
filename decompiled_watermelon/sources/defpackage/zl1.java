package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: zl1  reason: default package */
/* loaded from: classes.dex */
public final class zl1 extends nk6 implements aj2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ um Z;
    public final /* synthetic */ k24 c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zl1(um umVar, k24 k24Var, j11 j11Var, int i) {
        super(2, j11Var);
        this.X = i;
        this.Z = umVar;
        this.c0 = k24Var;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.X;
        o27 o27Var = o27.a;
        o31 o31Var = (o31) obj;
        j11 j11Var = (j11) obj2;
        switch (i) {
            case 0:
                return ((zl1) t(j11Var, o31Var)).v(o27Var);
            default:
                return ((zl1) t(j11Var, o31Var)).v(o27Var);
        }
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        switch (this.X) {
            case 0:
                return new zl1(this.Z, this.c0, j11Var, 0);
            default:
                return new zl1(this.Z, this.c0, j11Var, 1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
        if (defpackage.dk7.r(r0, r10) == r8) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:
        if (defpackage.dk7.r(r0, r10) == r8) goto L16;
     */
    @Override // defpackage.m00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.X
            o27 r6 = defpackage.o27.a
            r1 = 0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r3 = 1
            r5 = 2
            k24 r7 = r10.c0
            switch(r0) {
                case 0: goto L75;
                default: goto Le;
            }
        Le:
            p31 r8 = defpackage.p31.COROUTINE_SUSPENDED
            int r0 = r10.Y
            r9 = 3
            if (r0 == 0) goto L2c
            if (r0 == r3) goto L28
            if (r0 == r5) goto L24
            if (r0 != r9) goto L1f
            defpackage.me2.a0(r11)
            goto L74
        L1f:
            defpackage.i.n(r2)
            r6 = r1
            goto L74
        L24:
            defpackage.me2.a0(r11)
            goto L58
        L28:
            defpackage.me2.a0(r11)
            goto L42
        L2c:
            defpackage.me2.a0(r11)
            hm1 r0 = defpackage.im1.B
            r0 = 500(0x1f4, float:7.0E-43)
            om1 r1 = defpackage.om1.MILLISECONDS
            long r0 = defpackage.b53.k0(r0, r1)
            r10.Y = r3
            java.lang.Object r0 = defpackage.dk7.r(r0, r10)
            if (r0 != r8) goto L42
            goto L73
        L42:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r7.setValue(r0)
            hm1 r0 = defpackage.im1.B
            om1 r0 = defpackage.om1.SECONDS
            long r0 = defpackage.b53.k0(r9, r0)
            r10.Y = r5
            java.lang.Object r0 = defpackage.dk7.r(r0, r10)
            if (r0 != r8) goto L58
            goto L73
        L58:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r7.setValue(r0)
            java.lang.Float r1 = new java.lang.Float
            r0 = 1056964608(0x3f000000, float:0.5)
            r1.<init>(r0)
            r10.Y = r9
            um r0 = r10.Z
            r2 = 0
            r3 = 0
            r5 = 14
            r4 = r10
            java.lang.Object r0 = defpackage.um.c(r0, r1, r2, r3, r4, r5)
            if (r0 != r8) goto L74
        L73:
            r6 = r8
        L74:
            return r6
        L75:
            p31 r8 = defpackage.p31.COROUTINE_SUSPENDED
            int r0 = r10.Y
            if (r0 == 0) goto L86
            if (r0 != r3) goto L81
            defpackage.me2.a0(r11)
            goto La9
        L81:
            defpackage.i.n(r2)
            r6 = r1
            goto Lae
        L86:
            defpackage.me2.a0(r11)
            java.lang.Float r1 = new java.lang.Float
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.<init>(r0)
            r0 = 0
            l41 r2 = defpackage.cn1.a
            r9 = 820(0x334, float:1.149E-42)
            xy6 r2 = defpackage.ct3.V0(r9, r0, r2, r5)
            r10.Y = r3
            um r0 = r10.Z
            r3 = 0
            r5 = 12
            r4 = r10
            java.lang.Object r0 = defpackage.um.c(r0, r1, r2, r3, r4, r5)
            if (r0 != r8) goto La9
            r6 = r8
            goto Lae
        La9:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r7.setValue(r0)
        Lae:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zl1.v(java.lang.Object):java.lang.Object");
    }
}
