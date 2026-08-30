package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: qy1  reason: default package */
/* loaded from: classes.dex */
public final class qy1 extends nk6 implements aj2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ ti4 Z;
    public final /* synthetic */ hv1 c0;
    public final /* synthetic */ String d0;
    public final /* synthetic */ String e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qy1(ti4 ti4Var, hv1 hv1Var, String str, String str2, j11 j11Var, int i) {
        super(2, j11Var);
        this.X = i;
        this.Z = ti4Var;
        this.c0 = hv1Var;
        this.d0 = str;
        this.e0 = str2;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.X;
        o27 o27Var = o27.a;
        o31 o31Var = (o31) obj;
        j11 j11Var = (j11) obj2;
        switch (i) {
            case 0:
                return ((qy1) t(j11Var, o31Var)).v(o27Var);
            default:
                return ((qy1) t(j11Var, o31Var)).v(o27Var);
        }
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        switch (this.X) {
            case 0:
                return new qy1(this.Z, this.c0, this.d0, this.e0, j11Var, 0);
            default:
                return new qy1(this.Z, this.c0, this.d0, this.e0, j11Var, 1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0075, code lost:
        if (r14.h(r13) == r0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0082, code lost:
        if (r14 == r0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:?, code lost:
        return r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v3, types: [gs0, p63] */
    @Override // defpackage.m00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(java.lang.Object r14) {
        /*
            r13 = this;
            int r0 = r13.X
            r1 = 0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r3 = 1
            o27 r4 = defpackage.o27.a
            switch(r0) {
                case 0: goto L4b;
                default: goto Lb;
            }
        Lb:
            ti4 r6 = r13.Z
            java.lang.Object r12 = r6.B
            p31 r0 = defpackage.p31.COROUTINE_SUSPENDED
            int r5 = r13.Y
            if (r5 == 0) goto L22
            if (r5 != r3) goto L1e
            defpackage.me2.a0(r14)     // Catch: java.lang.Throwable -> L1b
            goto L3e
        L1b:
            r0 = move-exception
            r13 = r0
            goto L45
        L1e:
            defpackage.i.n(r2)
            goto L44
        L22:
            defpackage.me2.a0(r14)
            s74 r14 = defpackage.s74.B     // Catch: java.lang.Throwable -> L1b
            qy1 r5 = new qy1     // Catch: java.lang.Throwable -> L1b
            hv1 r7 = r13.c0     // Catch: java.lang.Throwable -> L1b
            java.lang.String r8 = r13.d0     // Catch: java.lang.Throwable -> L1b
            java.lang.String r9 = r13.e0     // Catch: java.lang.Throwable -> L1b
            r10 = 0
            r11 = 0
            r5.<init>(r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L1b
            r13.Y = r3     // Catch: java.lang.Throwable -> L1b
            java.lang.Object r13 = defpackage.tq5.G(r14, r5, r13)     // Catch: java.lang.Throwable -> L1b
            if (r13 != r0) goto L3e
            r1 = r0
            goto L44
        L3e:
            gs0 r12 = (defpackage.gs0) r12
            r12.c0(r4)
            r1 = r4
        L44:
            return r1
        L45:
            gs0 r12 = (defpackage.gs0) r12
            r12.c0(r4)
            throw r13
        L4b:
            p31 r0 = defpackage.p31.COROUTINE_SUSPENDED
            int r5 = r13.Y
            hv1 r6 = r13.c0
            r7 = 2
            if (r5 == 0) goto L64
            if (r5 == r3) goto L60
            if (r5 != r7) goto L5c
            defpackage.me2.a0(r14)
            goto L86
        L5c:
            defpackage.i.n(r2)
            goto Lab
        L60:
            defpackage.me2.a0(r14)
            goto L78
        L64:
            defpackage.me2.a0(r14)
            ti4 r14 = r13.Z
            java.lang.Object r14 = r14.A
            gs0 r14 = (defpackage.gs0) r14
            if (r14 == 0) goto L78
            r13.Y = r3
            java.lang.Object r14 = r14.h(r13)
            if (r14 != r0) goto L78
            goto L84
        L78:
            hq2 r14 = r6.o0
            r13.Y = r7
            java.lang.String r1 = r13.d0
            java.lang.Object r14 = r14.d(r1, r13)
            if (r14 != r0) goto L86
        L84:
            r1 = r0
            goto Lab
        L86:
            java.lang.Number r14 = (java.lang.Number) r14
            int r14 = r14.intValue()
            ti4 r0 = new ti4
            java.lang.String r1 = "reason"
            java.lang.String r13 = r13.e0
            r0.<init>(r1, r13)
            java.lang.Integer r13 = new java.lang.Integer
            r13.<init>(r14)
            ti4 r14 = new ti4
            java.lang.String r1 = "discarded"
            r14.<init>(r1, r13)
            ti4[] r13 = new defpackage.ti4[]{r0, r14}
            java.lang.String r14 = "hardcore_queue_session_closed"
            r6.I0(r14, r13)
            r1 = r4
        Lab:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qy1.v(java.lang.Object):java.lang.Object");
    }
}
