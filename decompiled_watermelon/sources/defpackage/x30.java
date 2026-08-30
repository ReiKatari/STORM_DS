package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: x30  reason: default package */
/* loaded from: classes.dex */
public final class x30 extends nk6 implements aj2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ boolean Z;
    public final /* synthetic */ um c0;
    public final /* synthetic */ ki2 d0;
    public final /* synthetic */ k24 e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x30(boolean z, um umVar, ki2 ki2Var, k24 k24Var, j11 j11Var, int i) {
        super(2, j11Var);
        this.X = i;
        this.Z = z;
        this.c0 = umVar;
        this.d0 = ki2Var;
        this.e0 = k24Var;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.X;
        o27 o27Var = o27.a;
        o31 o31Var = (o31) obj;
        j11 j11Var = (j11) obj2;
        switch (i) {
            case 0:
                return ((x30) t(j11Var, o31Var)).v(o27Var);
            default:
                return ((x30) t(j11Var, o31Var)).v(o27Var);
        }
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        switch (this.X) {
            case 0:
                return new x30(this.Z, this.c0, this.d0, this.e0, j11Var, 0);
            default:
                return new x30(this.Z, this.c0, this.d0, this.e0, j11Var, 1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0045, code lost:
        if (defpackage.dk7.q(90, r13) == r12) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0062, code lost:
        if (defpackage.um.c(r13.c0, r0, r2, null, r13, 12) == r12) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:?, code lost:
        return r12;
     */
    @Override // defpackage.m00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(java.lang.Object r14) {
        /*
            r13 = this;
            int r0 = r13.X
            o27 r6 = defpackage.o27.a
            ki2 r7 = r13.d0
            r1 = 0
            r2 = 1065353216(0x3f800000, float:1.0)
            k24 r3 = r13.e0
            boolean r5 = r13.Z
            r8 = 0
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r10 = 2
            r11 = 1
            switch(r0) {
                case 0: goto L6a;
                default: goto L15;
            }
        L15:
            p31 r12 = defpackage.p31.COROUTINE_SUSPENDED
            int r0 = r13.Y
            if (r0 == 0) goto L2c
            if (r0 == r11) goto L28
            if (r0 != r10) goto L23
            defpackage.me2.a0(r14)
            goto L66
        L23:
            defpackage.i.n(r9)
            r6 = r8
            goto L69
        L28:
            defpackage.me2.a0(r14)
            goto L48
        L2c:
            defpackage.me2.a0(r14)
            if (r5 == 0) goto L69
            java.lang.Object r0 = r3.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L69
            r13.Y = r11
            r8 = 90
            java.lang.Object r0 = defpackage.dk7.q(r8, r13)
            if (r0 != r12) goto L48
            goto L64
        L48:
            java.lang.Float r0 = new java.lang.Float
            r0.<init>(r2)
            r2 = 420(0x1a4, float:5.89E-43)
            l41 r3 = defpackage.cn1.a
            xy6 r2 = defpackage.ct3.V0(r2, r1, r3, r10)
            r13.Y = r10
            r1 = r0
            um r0 = r13.c0
            r3 = 0
            r5 = 12
            r4 = r13
            java.lang.Object r0 = defpackage.um.c(r0, r1, r2, r3, r4, r5)
            if (r0 != r12) goto L66
        L64:
            r6 = r12
            goto L69
        L66:
            r7.c()
        L69:
            return r6
        L6a:
            p31 r12 = defpackage.p31.COROUTINE_SUSPENDED
            int r0 = r13.Y
            if (r0 == 0) goto L7b
            if (r0 != r11) goto L76
            defpackage.me2.a0(r14)
            goto Laa
        L76:
            defpackage.i.n(r9)
            r6 = r8
            goto Lad
        L7b:
            defpackage.me2.a0(r14)
            if (r5 == 0) goto Lad
            java.lang.Object r0 = r3.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Lad
            java.lang.Float r0 = new java.lang.Float
            r0.<init>(r2)
            r2 = 380(0x17c, float:5.32E-43)
            l41 r3 = defpackage.cn1.a
            xy6 r2 = defpackage.ct3.V0(r2, r1, r3, r10)
            r13.Y = r11
            r1 = r0
            um r0 = r13.c0
            r3 = 0
            r5 = 12
            r4 = r13
            java.lang.Object r0 = defpackage.um.c(r0, r1, r2, r3, r4, r5)
            if (r0 != r12) goto Laa
            r6 = r12
            goto Lad
        Laa:
            r7.c()
        Lad:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x30.v(java.lang.Object):java.lang.Object");
    }
}
