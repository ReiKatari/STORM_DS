package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ix3  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ix3 implements java.lang.Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean B;
    public final /* synthetic */ defpackage.qb0 L;
    public final /* synthetic */ defpackage.on2 R;

    public /* synthetic */ ix3(java.util.concurrent.atomic.AtomicBoolean r1, defpackage.qb0 r2, defpackage.on2 r3, int r4) {
            r0 = this;
            r0.A = r4
            r0.B = r1
            r0.L = r2
            r0.R = r3
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r3 = this;
            int r0 = r3.A
            on2 r1 = r3.R
            qb0 r2 = r3.L
            java.util.concurrent.atomic.AtomicBoolean r3 = r3.B
            switch(r0) {
                case 0: goto L1f;
                default: goto Lb;
            }
        Lb:
            boolean r3 = r3.get()
            if (r3 == 0) goto L12
            goto L1e
        L12:
            java.lang.Object r3 = r1.c()     // Catch: java.lang.Throwable -> L1a
            r2.a(r3)     // Catch: java.lang.Throwable -> L1a
            goto L1e
        L1a:
            r3 = move-exception
            r2.c(r3)
        L1e:
            return
        L1f:
            boolean r3 = r3.get()
            if (r3 == 0) goto L26
            goto L32
        L26:
            java.lang.Object r3 = r1.c()     // Catch: java.lang.Throwable -> L2e
            r2.a(r3)     // Catch: java.lang.Throwable -> L2e
            goto L32
        L2e:
            r3 = move-exception
            r2.c(r3)
        L32:
            return
    }
}
