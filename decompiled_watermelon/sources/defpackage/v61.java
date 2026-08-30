package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: v61  reason: default package */
/* loaded from: classes.dex */
public final class v61 extends nk6 implements aj2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ w61 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v61(w61 w61Var, j11 j11Var, int i) {
        super(2, j11Var);
        this.X = i;
        this.Z = w61Var;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.X;
        o27 o27Var = o27.a;
        o31 o31Var = (o31) obj;
        j11 j11Var = (j11) obj2;
        switch (i) {
            case 0:
                return ((v61) t(j11Var, o31Var)).v(o27Var);
            default:
                return ((v61) t(j11Var, o31Var)).v(o27Var);
        }
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        int i = this.X;
        w61 w61Var = this.Z;
        switch (i) {
            case 0:
                return new v61(w61Var, j11Var, 0);
            default:
                return new v61(w61Var, j11Var, 1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0061, code lost:
        if (r12 == r6) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0072, code lost:
        if (r12 == r6) goto L29;
     */
    @Override // defpackage.m00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(java.lang.Object r12) {
        /*
            r11 = this;
            int r0 = r11.X
            o27 r1 = defpackage.o27.a
            w61 r2 = r11.Z
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            r4 = 1
            r5 = 0
            switch(r0) {
                case 0: goto L33;
                default: goto Ld;
            }
        Ld:
            p31 r0 = defpackage.p31.COROUTINE_SUSPENDED
            int r6 = r11.Y
            if (r6 == 0) goto L1e
            if (r6 != r4) goto L19
            defpackage.me2.a0(r12)
            goto L32
        L19:
            defpackage.i.n(r3)
            r1 = r5
            goto L32
        L1e:
            defpackage.me2.a0(r12)
            bb1 r12 = defpackage.tg1.a
            v61 r3 = new v61
            r6 = 0
            r3.<init>(r2, r5, r6)
            r11.Y = r4
            java.lang.Object r11 = defpackage.tq5.G(r12, r3, r11)
            if (r11 != r0) goto L32
            r1 = r0
        L32:
            return r1
        L33:
            qf r0 = r2.b
            p31 r6 = defpackage.p31.COROUTINE_SUSPENDED
            int r7 = r11.Y
            r8 = 4
            r9 = 3
            r10 = 2
            if (r7 == 0) goto L58
            if (r7 == r4) goto L54
            if (r7 == r10) goto L50
            if (r7 == r9) goto L4c
            if (r7 != r8) goto L47
            goto L4c
        L47:
            defpackage.i.n(r3)
            r1 = r5
            goto L9e
        L4c:
            defpackage.me2.a0(r12)
            goto L9e
        L50:
            defpackage.me2.a0(r12)
            goto L75
        L54:
            defpackage.me2.a0(r12)
            goto L64
        L58:
            defpackage.me2.a0(r12)
            r11.Y = r4
            java.lang.Enum r12 = r0.m(r11)
            if (r12 != r6) goto L64
            goto L9d
        L64:
            ld4 r12 = (defpackage.ld4) r12
            boolean r12 = r12.isSuccess()
            if (r12 == 0) goto L8b
            r11.Y = r10
            java.io.Serializable r12 = r0.l(r11)
            if (r12 != r6) goto L75
            goto L9d
        L75:
            java.util.List r12 = (java.util.List) r12
            bb1 r0 = defpackage.tg1.a
            ip2 r0 = defpackage.bt3.a
            n5 r3 = new n5
            r4 = 8
            r3.<init>(r2, r12, r5, r4)
            r11.Y = r9
            java.lang.Object r11 = defpackage.tq5.G(r0, r3, r11)
            if (r11 != r6) goto L9e
            goto L9d
        L8b:
            bb1 r12 = defpackage.tg1.a
            ip2 r12 = defpackage.bt3.a
            x3 r0 = new x3
            r3 = 6
            r0.<init>(r2, r5, r3)
            r11.Y = r8
            java.lang.Object r11 = defpackage.tq5.G(r12, r0, r11)
            if (r11 != r6) goto L9e
        L9d:
            r1 = r6
        L9e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v61.v(java.lang.Object):java.lang.Object");
    }
}
