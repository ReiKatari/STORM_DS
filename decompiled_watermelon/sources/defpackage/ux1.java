package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ux1  reason: default package */
/* loaded from: classes.dex */
public final class ux1 extends nk6 implements aj2 {
    public final /* synthetic */ int X;
    public Object Y;
    public int Z;
    public final /* synthetic */ hv1 c0;
    public final /* synthetic */ long d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ux1(hv1 hv1Var, long j, j11 j11Var, int i) {
        super(2, j11Var);
        this.X = i;
        this.c0 = hv1Var;
        this.d0 = j;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.X;
        o27 o27Var = o27.a;
        o31 o31Var = (o31) obj;
        j11 j11Var = (j11) obj2;
        switch (i) {
            case 0:
                return ((ux1) t(j11Var, o31Var)).v(o27Var);
            default:
                return ((ux1) t(j11Var, o31Var)).v(o27Var);
        }
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        switch (this.X) {
            case 0:
                return new ux1(this.c0, this.d0, j11Var, 0);
            default:
                return new ux1(this.c0, this.d0, j11Var, 1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
        if (r11 == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007f, code lost:
        if (r11 == r0) goto L41;
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
            o27 r1 = defpackage.o27.a
            long r2 = r10.d0
            r4 = 0
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r6 = 1
            r7 = 2
            hv1 r8 = r10.c0
            switch(r0) {
                case 0: goto L57;
                default: goto L10;
            }
        L10:
            p31 r0 = defpackage.p31.COROUTINE_SUSPENDED
            int r9 = r10.Z
            if (r9 == 0) goto L2b
            if (r9 == r6) goto L23
            if (r9 != r7) goto L1e
            defpackage.me2.a0(r11)
            goto L56
        L1e:
            defpackage.i.n(r5)
            r1 = r4
            goto L56
        L23:
            defpackage.me2.a0(r11)
            nc5 r11 = (defpackage.nc5) r11
            java.lang.Object r11 = r11.A
            goto L3b
        L2b:
            defpackage.me2.a0(r11)
            ud5 r11 = r8.g
            r10.Z = r6
            dl r11 = (defpackage.dl) r11
            java.lang.Object r11 = r11.h(r2, r10)
            if (r11 != r0) goto L3b
            goto L55
        L3b:
            boolean r2 = r11 instanceof defpackage.kc5
            if (r2 != 0) goto L56
            r2 = r11
            dy4 r2 = (defpackage.dy4) r2
            if (r2 == 0) goto L56
            c46 r3 = r8.F0
            h05 r4 = new h05
            r4.<init>(r2)
            r10.Y = r11
            r10.Z = r7
            java.lang.Object r10 = r3.b(r4, r10)
            if (r10 != r0) goto L56
        L55:
            r1 = r0
        L56:
            return r1
        L57:
            p31 r0 = defpackage.p31.COROUTINE_SUSPENDED
            int r9 = r10.Z
            if (r9 == 0) goto L72
            if (r9 == r6) goto L6a
            if (r9 != r7) goto L65
            defpackage.me2.a0(r11)
            goto L9d
        L65:
            defpackage.i.n(r5)
            r1 = r4
            goto L9d
        L6a:
            defpackage.me2.a0(r11)
            nc5 r11 = (defpackage.nc5) r11
            java.lang.Object r11 = r11.A
            goto L82
        L72:
            defpackage.me2.a0(r11)
            ud5 r11 = r8.g
            r10.Z = r6
            dl r11 = (defpackage.dl) r11
            java.lang.Object r11 = r11.h(r2, r10)
            if (r11 != r0) goto L82
            goto L9c
        L82:
            boolean r2 = r11 instanceof defpackage.kc5
            if (r2 != 0) goto L9d
            r2 = r11
            dy4 r2 = (defpackage.dy4) r2
            if (r2 == 0) goto L9d
            c46 r3 = r8.F0
            c05 r4 = new c05
            r4.<init>(r2)
            r10.Y = r11
            r10.Z = r7
            java.lang.Object r10 = r3.b(r4, r10)
            if (r10 != r0) goto L9d
        L9c:
            r1 = r0
        L9d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ux1.v(java.lang.Object):java.lang.Object");
    }
}
