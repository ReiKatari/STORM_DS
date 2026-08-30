package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ea2  reason: default package */
/* loaded from: classes.dex */
public final class ea2 extends nk6 implements aj2 {
    public final /* synthetic */ int X;
    public int Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ w92 c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ea2(w92 w92Var, j11 j11Var, int i) {
        super(2, j11Var);
        this.X = i;
        this.c0 = w92Var;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.X;
        o27 o27Var = o27.a;
        switch (i) {
            case 0:
                return ((ea2) t((j11) obj2, new xj0(((xj0) obj).a))).v(o27Var);
            default:
                return ((ea2) t((j11) obj2, obj)).v(o27Var);
        }
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        switch (this.X) {
            case 0:
                ea2 ea2Var = new ea2(this.c0, j11Var, 0);
                ea2Var.Z = obj;
                return ea2Var;
            default:
                ea2 ea2Var2 = new ea2(this.c0, j11Var, 1);
                ea2Var2.Z = obj;
                return ea2Var2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0069  */
    @Override // defpackage.m00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.X
            w92 r1 = r6.c0
            r2 = 0
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            r4 = 1
            switch(r0) {
                case 0: goto L2d;
                default: goto Lb;
            }
        Lb:
            p31 r0 = defpackage.p31.COROUTINE_SUSPENDED
            int r5 = r6.Y
            if (r5 == 0) goto L1b
            if (r5 != r4) goto L17
            defpackage.me2.a0(r7)
            goto L2a
        L17:
            defpackage.i.n(r3)
            goto L2c
        L1b:
            defpackage.me2.a0(r7)
            java.lang.Object r7 = r6.Z
            r6.Y = r4
            java.lang.Object r6 = r1.b(r7, r6)
            if (r6 != r0) goto L2a
            r2 = r0
            goto L2c
        L2a:
            o27 r2 = defpackage.o27.a
        L2c:
            return r2
        L2d:
            p31 r0 = defpackage.p31.COROUTINE_SUSPENDED
            int r5 = r6.Y
            if (r5 == 0) goto L3f
            if (r5 != r4) goto L3b
            java.lang.Object r6 = r6.Z
            defpackage.me2.a0(r7)
            goto L59
        L3b:
            defpackage.i.n(r3)
            goto L6b
        L3f:
            defpackage.me2.a0(r7)
            java.lang.Object r7 = r6.Z
            xj0 r7 = (defpackage.xj0) r7
            java.lang.Object r7 = r7.a
            boolean r2 = r7 instanceof defpackage.wj0
            if (r2 != 0) goto L5a
            r6.Z = r7
            r6.Y = r4
            java.lang.Object r6 = r1.b(r7, r6)
            if (r6 != r0) goto L58
            r2 = r0
            goto L6b
        L58:
            r6 = r7
        L59:
            r7 = r6
        L5a:
            boolean r6 = r7 instanceof defpackage.vj0
            if (r6 == 0) goto L69
            vj0 r7 = (defpackage.vj0) r7
            java.lang.Throwable r6 = r7.a
            if (r6 != 0) goto L68
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            goto L6b
        L68:
            throw r6
        L69:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
        L6b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ea2.v(java.lang.Object):java.lang.Object");
    }
}
