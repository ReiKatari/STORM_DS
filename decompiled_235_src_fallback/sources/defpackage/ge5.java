package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ge5  reason: default package */
/* loaded from: classes.dex */
public final class ge5 implements java.lang.Runnable {
    public final defpackage.nb0 A;
    public volatile java.util.concurrent.atomic.AtomicInteger B;
    public final /* synthetic */ defpackage.je5 L;

    public ge5(defpackage.je5 r1, defpackage.nb0 r2) {
            r0 = this;
            r0.<init>()
            r0.L = r1
            r0.A = r2
            java.util.concurrent.atomic.AtomicInteger r1 = new java.util.concurrent.atomic.AtomicInteger
            r2 = 0
            r1.<init>(r2)
            r0.B = r1
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r10 = this;
            java.lang.String r0 = "Callback failure for "
            java.lang.String r1 = "canceled due to "
            je5 r2 = r10.L
            pa r2 = r2.B
            java.lang.Object r2 = r2.B
            i03 r2 = (defpackage.i03) r2
            java.lang.String r2 = r2.g()
            java.lang.String r3 = "OkHttp "
            java.lang.String r2 = r3.concat(r2)
            je5 r3 = r10.L
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            java.lang.String r5 = r4.getName()
            r4.setName(r2)
            ie5 r2 = r3.X     // Catch: java.lang.Throwable -> L40
            r2.i()     // Catch: java.lang.Throwable -> L40
            r2 = 3
            r6 = 0
            r7 = 0
            wl5 r7 = r3.g()     // Catch: java.lang.Throwable -> L48 java.io.IOException -> L7b
            r8 = 1
            nb0 r9 = r10.A     // Catch: java.lang.Throwable -> L42 java.io.IOException -> L45
            r9.f(r3, r7)     // Catch: java.lang.Throwable -> L42 java.io.IOException -> L45
            xk4 r0 = r3.A     // Catch: java.lang.Throwable -> L40
            eb r0 = r0.a     // Catch: java.lang.Throwable -> L40
        L39:
            r0.getClass()     // Catch: java.lang.Throwable -> L40
            defpackage.eb.L(r0, r6, r6, r10, r2)     // Catch: java.lang.Throwable -> L40
            goto L99
        L40:
            r10 = move-exception
            goto La8
        L42:
            r0 = move-exception
            r7 = r8
            goto L49
        L45:
            r1 = move-exception
            r7 = r8
            goto L7c
        L48:
            r0 = move-exception
        L49:
            r3.cancel()     // Catch: java.lang.Throwable -> L68
            if (r7 != 0) goto L6a
            java.io.IOException r7 = new java.io.IOException     // Catch: java.lang.Throwable -> L68
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L68
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L68
            r8.append(r0)     // Catch: java.lang.Throwable -> L68
            java.lang.String r1 = r8.toString()     // Catch: java.lang.Throwable -> L68
            r7.<init>(r1)     // Catch: java.lang.Throwable -> L68
            r7.initCause(r0)     // Catch: java.lang.Throwable -> L68
            nb0 r1 = r10.A     // Catch: java.lang.Throwable -> L68
            r1.k(r3, r7)     // Catch: java.lang.Throwable -> L68
            goto L6a
        L68:
            r0 = move-exception
            goto L9d
        L6a:
            boolean r1 = r0 instanceof java.lang.InterruptedException     // Catch: java.lang.Throwable -> L68
            if (r1 == 0) goto L7a
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L68
            r0.interrupt()     // Catch: java.lang.Throwable -> L68
            xk4 r0 = r3.A     // Catch: java.lang.Throwable -> L40
            eb r0 = r0.a     // Catch: java.lang.Throwable -> L40
            goto L39
        L7a:
            throw r0     // Catch: java.lang.Throwable -> L68
        L7b:
            r1 = move-exception
        L7c:
            if (r7 == 0) goto L8f
            kx4 r7 = defpackage.kx4.a     // Catch: java.lang.Throwable -> L68
            kx4 r7 = defpackage.kx4.a     // Catch: java.lang.Throwable -> L68
            java.lang.String r8 = defpackage.je5.a(r3)     // Catch: java.lang.Throwable -> L68
            java.lang.String r0 = r0.concat(r8)     // Catch: java.lang.Throwable -> L68
            r8 = 4
            r7.i(r0, r8, r1)     // Catch: java.lang.Throwable -> L68
            goto L94
        L8f:
            nb0 r0 = r10.A     // Catch: java.lang.Throwable -> L68
            r0.k(r3, r1)     // Catch: java.lang.Throwable -> L68
        L94:
            xk4 r0 = r3.A     // Catch: java.lang.Throwable -> L40
            eb r0 = r0.a     // Catch: java.lang.Throwable -> L40
            goto L39
        L99:
            r4.setName(r5)
            return
        L9d:
            xk4 r1 = r3.A     // Catch: java.lang.Throwable -> L40
            eb r1 = r1.a     // Catch: java.lang.Throwable -> L40
            r1.getClass()     // Catch: java.lang.Throwable -> L40
            defpackage.eb.L(r1, r6, r6, r10, r2)     // Catch: java.lang.Throwable -> L40
            throw r0     // Catch: java.lang.Throwable -> L40
        La8:
            r4.setName(r5)
            throw r10
    }
}
