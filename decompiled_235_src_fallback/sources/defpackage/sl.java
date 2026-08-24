package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sl  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class sl implements defpackage.qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ java.lang.Object L;
    public final /* synthetic */ java.lang.Object R;
    public final /* synthetic */ java.lang.Object X;

    public /* synthetic */ sl(int r1, java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, boolean r5) {
            r0 = this;
            r0.A = r1
            r0.L = r2
            r0.B = r5
            r0.R = r3
            r0.X = r4
            r0.<init>()
            return
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r11) {
            r10 = this;
            int r0 = r10.A
            jg7 r1 = defpackage.jg7.a
            java.lang.Object r2 = r10.X
            java.lang.Object r3 = r10.R
            boolean r4 = r10.B
            java.lang.Object r10 = r10.L
            switch(r0) {
                case 0: goto L87;
                default: goto Lf;
            }
        Lf:
            nx3 r10 = (defpackage.nx3) r10
            java.lang.String r3 = (java.lang.String) r3
            rx7 r2 = (defpackage.rx7) r2
            java.lang.Throwable r11 = (java.lang.Throwable) r11
            boolean r0 = r11 instanceof defpackage.ix7
            if (r0 == 0) goto L26
            ix7 r11 = (defpackage.ix7) r11
            int r11 = r11.A
            java.util.concurrent.atomic.AtomicInteger r10 = r10.c
            r0 = -256(0xffffffffffffff00, float:NaN)
            r10.compareAndSet(r0, r11)
        L26:
            if (r4 == 0) goto L86
            if (r3 == 0) goto L86
            az0 r10 = r2.e
            xd5 r10 = r10.m
            yw7 r11 = r2.a
            int r11 = r11.hashCode()
            r10.getClass()
            int r10 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r10 < r0) goto L45
            java.lang.String r10 = defpackage.ln2.f0(r3)
            defpackage.rp.b(r11, r10)
            goto L86
        L45:
            java.lang.String r10 = defpackage.ln2.f0(r3)
            java.lang.String r0 = "asyncTraceEnd"
            java.lang.reflect.Method r2 = defpackage.ln2.e     // Catch: java.lang.Exception -> L62
            if (r2 != 0) goto L64
            java.lang.Class<android.os.Trace> r2 = android.os.Trace.class
            java.lang.Class r3 = java.lang.Long.TYPE     // Catch: java.lang.Exception -> L62
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L62
            java.lang.Class[] r3 = new java.lang.Class[]{r3, r4, r5}     // Catch: java.lang.Exception -> L62
            java.lang.reflect.Method r2 = r2.getMethod(r0, r3)     // Catch: java.lang.Exception -> L62
            defpackage.ln2.e = r2     // Catch: java.lang.Exception -> L62
            goto L64
        L62:
            r10 = move-exception
            goto L83
        L64:
            java.lang.reflect.Method r2 = defpackage.ln2.e     // Catch: java.lang.Exception -> L62
            if (r2 == 0) goto L7b
            long r3 = defpackage.ln2.b     // Catch: java.lang.Exception -> L62
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Exception -> L62
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch: java.lang.Exception -> L62
            java.lang.Object[] r10 = new java.lang.Object[]{r3, r10, r11}     // Catch: java.lang.Exception -> L62
            r11 = 0
            r2.invoke(r11, r10)     // Catch: java.lang.Exception -> L62
            goto L86
        L7b:
            java.lang.String r10 = "Required value was null."
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException     // Catch: java.lang.Exception -> L62
            r11.<init>(r10)     // Catch: java.lang.Exception -> L62
            throw r11     // Catch: java.lang.Exception -> L62
        L83:
            defpackage.ln2.F(r0, r10)
        L86:
            return r1
        L87:
            on2 r10 = (defpackage.on2) r10
            zh r3 = (defpackage.zh) r3
            z40 r2 = (defpackage.z40) r2
            um3 r11 = (defpackage.um3) r11
            r11.b()
            zj0 r11 = r11.A
            java.lang.Object r10 = r10.c()
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 != 0) goto La1
            goto Lce
        La1:
            if (r4 == 0) goto Lcb
            long r4 = r11.t0()
            bt r10 = r11.B
            long r6 = r10.L()
            xj0 r0 = r10.G()
            r0.h()
            java.lang.Object r0 = r10.B     // Catch: java.lang.Throwable -> Lc6
            os0 r0 = (defpackage.os0) r0     // Catch: java.lang.Throwable -> Lc6
            r8 = -1082130432(0xffffffffbf800000, float:-1.0)
            r9 = 1065353216(0x3f800000, float:1.0)
            r0.f0(r8, r9, r4)     // Catch: java.lang.Throwable -> Lc6
            r11.f(r3, r2)     // Catch: java.lang.Throwable -> Lc6
            defpackage.xg6.v(r10, r6)
            goto Lce
        Lc6:
            r11 = move-exception
            defpackage.xg6.v(r10, r6)
            throw r11
        Lcb:
            r11.f(r3, r2)
        Lce:
            return r1
    }
}
