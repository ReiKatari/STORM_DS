package ad;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;

    public /* synthetic */ g(int i2, Object obj) {
        this.A = i2;
        this.B = obj;
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
        aj.g.t("SequentialExecutor", "Exception while executing runnable " + r3, r2);
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
    public void a() {
        /*
            r9 = this;
            r0 = 0
            r1 = r0
        L2:
            java.lang.Object r2 = r9.B     // Catch: java.lang.Throwable -> L51
            l0.h r2 = (l0.h) r2     // Catch: java.lang.Throwable -> L51
            java.util.ArrayDeque r2 = r2.A     // Catch: java.lang.Throwable -> L51
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L51
            if (r0 != 0) goto L2c
            java.lang.Object r0 = r9.B     // Catch: java.lang.Throwable -> L20
            l0.h r0 = (l0.h) r0     // Catch: java.lang.Throwable -> L20
            l0.g r3 = r0.R     // Catch: java.lang.Throwable -> L20
            l0.g r4 = l0.g.RUNNING     // Catch: java.lang.Throwable -> L20
            if (r3 != r4) goto L22
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L46
        L18:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            goto L46
        L20:
            r0 = move-exception
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
            l0.h r3 = (l0.h) r3     // Catch: java.lang.Throwable -> L20
            java.util.ArrayDeque r3 = r3.A     // Catch: java.lang.Throwable -> L20
            java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L20
            java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L20
            if (r3 != 0) goto L47
            java.lang.Object r0 = r9.B     // Catch: java.lang.Throwable -> L20
            l0.h r0 = (l0.h) r0     // Catch: java.lang.Throwable -> L20
            l0.g r3 = l0.g.IDLE     // Catch: java.lang.Throwable -> L20
            r0.R = r3     // Catch: java.lang.Throwable -> L20
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
            r0 = move-exception
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
            aj.g.t(r4, r3, r2)     // Catch: java.lang.Throwable -> L51
            goto L2
        L6b:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            throw r0     // Catch: java.lang.Throwable -> L51
        L6d:
            if (r1 == 0) goto L76
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
        L76:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ad.g.a():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:183:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 722
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ad.g.run():void");
    }
}
