package l0;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h implements Executor {
    public final Executor B;
    public final ArrayDeque A = new ArrayDeque();
    public final ad.g L = new ad.g(10, this);
    public g R = g.IDLE;
    public long X = 0;

    public h(Executor executor) {
        executor.getClass();
        this.B = executor;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0068 A[ADDED_TO_REGION] */
    @Override // java.util.concurrent.Executor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void execute(java.lang.Runnable r8) {
        /*
            r7 = this;
            r8.getClass()
            java.util.ArrayDeque r0 = r7.A
            monitor-enter(r0)
            l0.g r1 = r7.R     // Catch: java.lang.Throwable -> L6f
            l0.g r2 = l0.g.RUNNING     // Catch: java.lang.Throwable -> L6f
            if (r1 == r2) goto L71
            l0.g r2 = l0.g.QUEUED     // Catch: java.lang.Throwable -> L6f
            if (r1 != r2) goto L11
            goto L71
        L11:
            long r3 = r7.X     // Catch: java.lang.Throwable -> L6f
            ad.g r1 = new ad.g     // Catch: java.lang.Throwable -> L6f
            r5 = 9
            r1.<init>(r5, r8)     // Catch: java.lang.Throwable -> L6f
            java.util.ArrayDeque r8 = r7.A     // Catch: java.lang.Throwable -> L6f
            r8.add(r1)     // Catch: java.lang.Throwable -> L6f
            l0.g r8 = l0.g.QUEUING     // Catch: java.lang.Throwable -> L6f
            r7.R = r8     // Catch: java.lang.Throwable -> L6f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6f
            java.util.concurrent.Executor r0 = r7.B     // Catch: java.lang.Error -> L46 java.lang.RuntimeException -> L48
            ad.g r5 = r7.L     // Catch: java.lang.Error -> L46 java.lang.RuntimeException -> L48
            r0.execute(r5)     // Catch: java.lang.Error -> L46 java.lang.RuntimeException -> L48
            l0.g r0 = r7.R
            if (r0 == r8) goto L30
            goto L6b
        L30:
            java.util.ArrayDeque r0 = r7.A
            monitor-enter(r0)
            long r5 = r7.X     // Catch: java.lang.Throwable -> L40
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 != 0) goto L42
            l0.g r1 = r7.R     // Catch: java.lang.Throwable -> L40
            if (r1 != r8) goto L42
            r7.R = r2     // Catch: java.lang.Throwable -> L40
            goto L42
        L40:
            r8 = move-exception
            goto L44
        L42:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L40
            return
        L44:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L40
            throw r8
        L46:
            r8 = move-exception
            goto L49
        L48:
            r8 = move-exception
        L49:
            java.util.ArrayDeque r2 = r7.A
            monitor-enter(r2)
            l0.g r0 = r7.R     // Catch: java.lang.Throwable -> L57
            l0.g r3 = l0.g.IDLE     // Catch: java.lang.Throwable -> L57
            if (r0 == r3) goto L59
            l0.g r3 = l0.g.QUEUING     // Catch: java.lang.Throwable -> L57
            if (r0 != r3) goto L63
            goto L59
        L57:
            r8 = move-exception
            goto L6d
        L59:
            java.util.ArrayDeque r0 = r7.A     // Catch: java.lang.Throwable -> L57
            boolean r0 = r0.removeLastOccurrence(r1)     // Catch: java.lang.Throwable -> L57
            if (r0 == 0) goto L63
            r0 = 1
            goto L64
        L63:
            r0 = 0
        L64:
            boolean r1 = r8 instanceof java.util.concurrent.RejectedExecutionException     // Catch: java.lang.Throwable -> L57
            if (r1 == 0) goto L6c
            if (r0 != 0) goto L6c
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L57
        L6b:
            return
        L6c:
            throw r8     // Catch: java.lang.Throwable -> L57
        L6d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L57
            throw r8
        L6f:
            r8 = move-exception
            goto L78
        L71:
            java.util.ArrayDeque r1 = r7.A     // Catch: java.lang.Throwable -> L6f
            r1.add(r8)     // Catch: java.lang.Throwable -> L6f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6f
            return
        L78:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6f
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.h.execute(java.lang.Runnable):void");
    }
}
