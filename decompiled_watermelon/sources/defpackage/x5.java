package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: x5  reason: default package */
/* loaded from: classes.dex */
public final class x5 extends nk6 implements aj2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ k24 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x5(k24 k24Var, j11 j11Var, int i) {
        super(2, j11Var);
        this.X = i;
        this.Z = k24Var;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.X;
        o27 o27Var = o27.a;
        o31 o31Var = (o31) obj;
        j11 j11Var = (j11) obj2;
        switch (i) {
            case 0:
                return ((x5) t(j11Var, o31Var)).v(o27Var);
            case 1:
                return ((x5) t(j11Var, o31Var)).v(o27Var);
            default:
                return ((x5) t(j11Var, o31Var)).v(o27Var);
        }
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        switch (this.X) {
            case 0:
                return new x5(this.Z, j11Var, 0);
            case 1:
                return new x5(this.Z, j11Var, 1);
            default:
                return new x5(this.Z, j11Var, 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x007a, code lost:
        if (defpackage.dk7.q(500, r10) == r0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008a, code lost:
        if (defpackage.dk7.q(2000, r10) == r0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:?, code lost:
        return r0;
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
            r1 = 500(0x1f4, double:2.47E-321)
            o27 r3 = defpackage.o27.a
            k24 r4 = r10.Z
            r5 = 0
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r7 = 1
            switch(r0) {
                case 0: goto L59;
                case 1: goto L33;
                default: goto Lf;
            }
        Lf:
            p31 r0 = defpackage.p31.COROUTINE_SUSPENDED
            int r8 = r10.Y
            if (r8 == 0) goto L20
            if (r8 != r7) goto L1b
            defpackage.me2.a0(r11)
            goto L2d
        L1b:
            defpackage.i.n(r6)
            r3 = r5
            goto L32
        L20:
            defpackage.me2.a0(r11)
            r10.Y = r7
            java.lang.Object r10 = defpackage.dk7.q(r1, r10)
            if (r10 != r0) goto L2d
            r3 = r0
            goto L32
        L2d:
            gu3 r10 = defpackage.gu3.SHOW_FULL
            r4.setValue(r10)
        L32:
            return r3
        L33:
            p31 r0 = defpackage.p31.COROUTINE_SUSPENDED
            int r1 = r10.Y
            if (r1 == 0) goto L44
            if (r1 != r7) goto L3f
            defpackage.me2.a0(r11)
            goto L53
        L3f:
            defpackage.i.n(r6)
            r3 = r5
            goto L58
        L44:
            defpackage.me2.a0(r11)
            r10.Y = r7
            r1 = 650(0x28a, double:3.21E-321)
            java.lang.Object r10 = defpackage.dk7.q(r1, r10)
            if (r10 != r0) goto L53
            r3 = r0
            goto L58
        L53:
            java.lang.Boolean r10 = java.lang.Boolean.TRUE
            r4.setValue(r10)
        L58:
            return r3
        L59:
            p31 r0 = defpackage.p31.COROUTINE_SUSPENDED
            int r8 = r10.Y
            r9 = 2
            if (r8 == 0) goto L71
            if (r8 == r7) goto L6d
            if (r8 != r9) goto L68
            defpackage.me2.a0(r11)
            goto L8e
        L68:
            defpackage.i.n(r6)
            r3 = r5
            goto L93
        L6d:
            defpackage.me2.a0(r11)
            goto L7d
        L71:
            defpackage.me2.a0(r11)
            r10.Y = r7
            java.lang.Object r11 = defpackage.dk7.q(r1, r10)
            if (r11 != r0) goto L7d
            goto L8c
        L7d:
            er4 r11 = defpackage.er4.SHOW_TITLE
            r4.setValue(r11)
            r10.Y = r9
            r1 = 2000(0x7d0, double:9.88E-321)
            java.lang.Object r10 = defpackage.dk7.q(r1, r10)
            if (r10 != r0) goto L8e
        L8c:
            r3 = r0
            goto L93
        L8e:
            er4 r10 = defpackage.er4.SHOW_DESCRIPTION
            r4.setValue(r10)
        L93:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x5.v(java.lang.Object):java.lang.Object");
    }
}
