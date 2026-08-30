package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: vo5  reason: default package */
/* loaded from: classes.dex */
public final class vo5 extends nk6 implements aj2 {
    public wz5 X;
    public yo5 Y;
    public rg5 Z;
    public int c0;
    public int d0;
    public /* synthetic */ Object e0;
    public final /* synthetic */ yo5 f0;
    public final /* synthetic */ rg5 g0;
    public final /* synthetic */ String h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vo5(yo5 yo5Var, rg5 rg5Var, String str, j11 j11Var) {
        super(2, j11Var);
        this.f0 = yo5Var;
        this.g0 = rg5Var;
        this.h0 = str;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        return ((vo5) t((j11) obj2, (o31) obj)).v(o27.a);
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        vo5 vo5Var = new vo5(this.f0, this.g0, this.h0, j11Var);
        vo5Var.e0 = obj;
        return vo5Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0064, code lost:
        if (r8 == r1) goto L39;
     */
    @Override // defpackage.m00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.e0
            o31 r0 = (defpackage.o31) r0
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r7.d0
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L31
            if (r2 == r4) goto L23
            if (r2 != r3) goto L1d
            yo5 r0 = r7.Y
            o31 r0 = (defpackage.o31) r0
            wz5 r0 = r7.X
            defpackage.me2.a0(r8)     // Catch: java.lang.Throwable -> L1b
            goto L67
        L1b:
            r8 = move-exception
            goto L6a
        L1d:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r7)
            return r5
        L23:
            int r0 = r7.c0
            rg5 r2 = r7.Z
            yo5 r4 = r7.Y
            wz5 r6 = r7.X
            defpackage.me2.a0(r8)
            r8 = r0
            r0 = r6
            goto L52
        L31:
            defpackage.me2.a0(r8)
            yo5 r8 = r7.f0
            wz5 r2 = r8.m
            rg5 r6 = r7.g0
            r7.e0 = r0
            r7.X = r2
            r7.Y = r8
            r7.Z = r6
            r0 = 0
            r7.c0 = r0
            r7.d0 = r4
            java.lang.Object r4 = r2.a(r7)
            if (r4 != r1) goto L4e
            goto L66
        L4e:
            r4 = r8
            r8 = r0
            r0 = r2
            r2 = r6
        L52:
            a50 r4 = r4.h     // Catch: java.lang.Throwable -> L1b
            r7.e0 = r5     // Catch: java.lang.Throwable -> L1b
            r7.X = r0     // Catch: java.lang.Throwable -> L1b
            r7.Y = r5     // Catch: java.lang.Throwable -> L1b
            r7.Z = r5     // Catch: java.lang.Throwable -> L1b
            r7.c0 = r8     // Catch: java.lang.Throwable -> L1b
            r7.d0 = r3     // Catch: java.lang.Throwable -> L1b
            java.lang.Object r8 = r4.d(r2, r7)     // Catch: java.lang.Throwable -> L1b
            if (r8 != r1) goto L67
        L66:
            return r1
        L67:
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Throwable -> L1b
            goto L70
        L6a:
            kc5 r1 = new kc5     // Catch: java.lang.Throwable -> Lb1
            r1.<init>(r8)     // Catch: java.lang.Throwable -> Lb1
            r8 = r1
        L70:
            boolean r1 = r8 instanceof defpackage.kc5     // Catch: java.lang.Throwable -> Lb1
            if (r1 == 0) goto L76
            goto L77
        L76:
            r5 = r8
        L77:
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> Lb1
            r0.c()
            yo5 r8 = r7.f0
            ee6 r8 = r8.j
            java.lang.String r1 = r7.h0
        L82:
            java.lang.Object r0 = r8.getValue()
            r2 = r0
            java.util.Map r2 = (java.util.Map) r2
            if (r5 != 0) goto L8e
            java.lang.String r3 = ""
            goto L8f
        L8e:
            r3 = r5
        L8f:
            ti4 r4 = new ti4
            r4.<init>(r1, r3)
            java.util.Map r2 = defpackage.zt3.o0(r2, r4)
            boolean r0 = r8.j(r0, r2)
            if (r0 == 0) goto L82
            yo5 r8 = r7.f0
            java.util.LinkedHashSet r0 = r8.l
            java.lang.String r7 = r7.h0
            monitor-enter(r0)
            java.util.LinkedHashSet r8 = r8.l     // Catch: java.lang.Throwable -> Lae
            r8.remove(r7)     // Catch: java.lang.Throwable -> Lae
            monitor-exit(r0)
            o27 r7 = defpackage.o27.a
            return r7
        Lae:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
        Lb1:
            r7 = move-exception
            r0.c()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vo5.v(java.lang.Object):java.lang.Object");
    }
}
