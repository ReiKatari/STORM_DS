package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jm  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class jm implements defpackage.on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ long B;
    public final /* synthetic */ java.lang.Object L;

    public /* synthetic */ jm(java.lang.Object r1, long r2, int r4) {
            r0 = this;
            r0.A = r4
            r0.L = r1
            r0.B = r2
            r0.<init>()
            return
    }

    @Override // defpackage.on2
    public final java.lang.Object c() {
            r9 = this;
            int r0 = r9.A
            switch(r0) {
                case 0: goto L65;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r9.L
            af5 r0 = (defpackage.af5) r0
            long r1 = r9.B
            monitor-enter(r0)
            boolean r9 = r0.u     // Catch: java.lang.Throwable -> L1f
            if (r9 == 0) goto L12
        L10:
            monitor-exit(r0)
            goto L5e
        L12:
            xs7 r9 = r0.k     // Catch: java.lang.Throwable -> L1f
            if (r9 != 0) goto L17
            goto L10
        L17:
            boolean r3 = r0.w     // Catch: java.lang.Throwable -> L1f
            r4 = -1
            if (r3 == 0) goto L21
            int r3 = r0.v     // Catch: java.lang.Throwable -> L1f
            goto L22
        L1f:
            r9 = move-exception
            goto L63
        L21:
            r3 = r4
        L22:
            int r5 = r0.v     // Catch: java.lang.Throwable -> L1f
            r6 = 1
            int r5 = r5 + r6
            r0.v = r5     // Catch: java.lang.Throwable -> L1f
            r0.w = r6     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r0)
            r5 = 2
            if (r3 == r4) goto L4f
            java.net.SocketTimeoutException r9 = new java.net.SocketTimeoutException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r7 = "sent ping but didn't receive pong within "
            r4.<init>(r7)
            long r7 = r0.c
            r4.append(r7)
            java.lang.String r7 = "ms (after "
            r4.append(r7)
            int r3 = r3 - r6
            java.lang.String r6 = " successful ping/pongs)"
            java.lang.String r3 = defpackage.lb1.o(r4, r3, r6)
            r9.<init>(r3)
            defpackage.af5.c(r0, r9, r5)
            goto L5e
        L4f:
            da0 r3 = defpackage.da0.R     // Catch: java.io.IOException -> L5a
            r3.getClass()     // Catch: java.io.IOException -> L5a
            r4 = 9
            r9.e(r4, r3)     // Catch: java.io.IOException -> L5a
            goto L5e
        L5a:
            r9 = move-exception
            defpackage.af5.c(r0, r9, r5)
        L5e:
            java.lang.Long r9 = java.lang.Long.valueOf(r1)
            return r9
        L63:
            monitor-exit(r0)
            throw r9
        L65:
            java.lang.Object r0 = r9.L
            f80 r0 = (defpackage.f80) r0
            long r1 = r9.B
            xd6 r0 = (defpackage.xd6) r0
            android.graphics.Shader r9 = r0.b(r1)
            return r9
    }
}
