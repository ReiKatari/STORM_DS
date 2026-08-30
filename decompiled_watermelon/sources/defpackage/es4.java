package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: es4  reason: default package */
/* loaded from: classes.dex */
public final class es4 implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;

    public /* synthetic */ es4(int i, Object obj) {
        this.A = i;
        this.B = obj;
    }

    private final void a() {
        bn6 b;
        long j;
        bn6 b2;
        fn6 fn6Var = (fn6) this.B;
        synchronized (fn6Var) {
            fn6Var.g++;
            b = fn6Var.b();
        }
        if (b == null) {
            return;
        }
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        while (true) {
            try {
                currentThread.setName(b.a);
                Logger logger = ((fn6) this.B).b;
                en6 en6Var = b.c;
                en6Var.getClass();
                boolean isLoggable = logger.isLoggable(Level.FINE);
                if (isLoggable) {
                    j = System.nanoTime();
                    me2.c(logger, b, en6Var, "starting");
                } else {
                    j = -1;
                }
                long a = b.a();
                if (isLoggable) {
                    me2.c(logger, b, en6Var, "finished run in " + me2.t(System.nanoTime() - j));
                }
                fn6 fn6Var2 = (fn6) this.B;
                synchronized (fn6Var2) {
                    fn6.a(fn6Var2, b, a, true);
                    b2 = fn6Var2.b();
                }
                if (b2 == null) {
                    return;
                }
                b = b2;
            } catch (Throwable th) {
                try {
                    fn6 fn6Var3 = (fn6) this.B;
                    synchronized (fn6Var3) {
                        fn6.a(fn6Var3, b, -1L, false);
                        if (th instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                            return;
                        }
                        throw th;
                    }
                } finally {
                    currentThread.setName(name);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0043, code lost:
        if (r1 == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004c, code lost:
        r1 = r1 | java.lang.Thread.interrupted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004d, code lost:
        r3.run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0053, code lost:
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0054, code lost:
        defpackage.ve2.x("SequentialExecutor", "Exception while executing runnable " + r3, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:?, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b() {
        /*
            r9 = this;
            r0 = 0
            r1 = r0
        L2:
            java.lang.Object r2 = r9.B     // Catch: java.lang.Throwable -> L51
            g06 r2 = (defpackage.g06) r2     // Catch: java.lang.Throwable -> L51
            java.util.ArrayDeque r2 = r2.A     // Catch: java.lang.Throwable -> L51
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L51
            if (r0 != 0) goto L2c
            java.lang.Object r0 = r9.B     // Catch: java.lang.Throwable -> L20
            g06 r0 = (defpackage.g06) r0     // Catch: java.lang.Throwable -> L20
            f06 r3 = r0.R     // Catch: java.lang.Throwable -> L20
            f06 r4 = defpackage.f06.RUNNING     // Catch: java.lang.Throwable -> L20
            if (r3 != r4) goto L22
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L46
        L18:
            java.lang.Thread r9 = java.lang.Thread.currentThread()
            r9.interrupt()
            goto L46
        L20:
            r9 = move-exception
            goto L6b
        L22:
            long r5 = r0.X     // Catch: java.lang.Throwable -> L20
            r7 = 1
            long r5 = r5 + r7
            r0.X = r5     // Catch: java.lang.Throwable -> L20
            r0.R = r4     // Catch: java.lang.Throwable -> L20
            r0 = 1
        L2c:
            java.lang.Object r3 = r9.B     // Catch: java.lang.Throwable -> L20
            g06 r3 = (defpackage.g06) r3     // Catch: java.lang.Throwable -> L20
            java.util.ArrayDeque r3 = r3.A     // Catch: java.lang.Throwable -> L20
            java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L20
            java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L20
            if (r3 != 0) goto L47
            java.lang.Object r9 = r9.B     // Catch: java.lang.Throwable -> L20
            g06 r9 = (defpackage.g06) r9     // Catch: java.lang.Throwable -> L20
            f06 r0 = defpackage.f06.IDLE     // Catch: java.lang.Throwable -> L20
            r9.R = r0     // Catch: java.lang.Throwable -> L20
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L46
            goto L18
        L46:
            return
        L47:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L51
            r1 = r1 | r2
            r3.run()     // Catch: java.lang.Throwable -> L51 java.lang.RuntimeException -> L53
            goto L2
        L51:
            r9 = move-exception
            goto L6d
        L53:
            r2 = move-exception
            java.lang.String r4 = "SequentialExecutor"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L51
            r5.<init>()     // Catch: java.lang.Throwable -> L51
            java.lang.String r6 = "Exception while executing runnable "
            r5.append(r6)     // Catch: java.lang.Throwable -> L51
            r5.append(r3)     // Catch: java.lang.Throwable -> L51
            java.lang.String r3 = r5.toString()     // Catch: java.lang.Throwable -> L51
            defpackage.ve2.x(r4, r3, r2)     // Catch: java.lang.Throwable -> L51
            goto L2
        L6b:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            throw r9     // Catch: java.lang.Throwable -> L51
        L6d:
            if (r1 == 0) goto L76
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L76:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.es4.b():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:153:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0042  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 678
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.es4.run():void");
    }
}
