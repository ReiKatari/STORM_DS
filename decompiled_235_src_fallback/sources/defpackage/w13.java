package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: w13  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class w13 implements defpackage.fk2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ java.lang.Object B;

    public /* synthetic */ w13(java.lang.Object r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // defpackage.fk2
    public final void c(defpackage.gk2 r4) {
            r3 = this;
            int r0 = r3.A
            java.lang.Object r3 = r3.B
            switch(r0) {
                case 0: goto L2b;
                default: goto L7;
            }
        L7:
            re5 r3 = (defpackage.re5) r3
            java.lang.Object r0 = r3.R
            monitor-enter(r0)
            int r1 = r3.L     // Catch: java.lang.Throwable -> L1c
            int r1 = r1 + (-1)
            r3.L = r1     // Catch: java.lang.Throwable -> L1c
            boolean r2 = r3.A     // Catch: java.lang.Throwable -> L1c
            if (r2 == 0) goto L1e
            if (r1 != 0) goto L1e
            r3.close()     // Catch: java.lang.Throwable -> L1c
            goto L1e
        L1c:
            r3 = move-exception
            goto L29
        L1e:
            java.lang.Object r3 = r3.Y     // Catch: java.lang.Throwable -> L1c
            fk2 r3 = (defpackage.fk2) r3     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            if (r3 == 0) goto L28
            r3.c(r4)
        L28:
            return
        L29:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            throw r3
        L2b:
            x13 r3 = (defpackage.x13) r3
            java.lang.Object r3 = r3.X
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            java.lang.Object r3 = r3.get()
            y13 r3 = (defpackage.y13) r3
            if (r3 == 0) goto L45
            java.util.concurrent.Executor r4 = r3.r0
            n0 r0 = new n0
            r1 = 29
            r0.<init>(r3, r1)
            r4.execute(r0)
        L45:
            return
    }
}
