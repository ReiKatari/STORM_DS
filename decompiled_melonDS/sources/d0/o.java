package d0;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class o implements Executor {
    public static final n L = new n(0);
    public final Object A = new Object();
    public ThreadPoolExecutor B;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.concurrent.RejectedExecutionHandler, java.lang.Object] */
    public o() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), L);
        threadPoolExecutor.setRejectedExecutionHandler(new Object());
        this.B = threadPoolExecutor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.concurrent.RejectedExecutionHandler, java.lang.Object] */
    public final void a(w.j jVar) {
        ThreadPoolExecutor threadPoolExecutor;
        jVar.getClass();
        synchronized (this.A) {
            try {
                if (this.B.isShutdown()) {
                    ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), L);
                    threadPoolExecutor2.setRejectedExecutionHandler(new Object());
                    this.B = threadPoolExecutor2;
                }
                threadPoolExecutor = this.B;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        int max = Math.max(1, jVar.a().size());
        threadPoolExecutor.setMaximumPoolSize(max);
        threadPoolExecutor.setCorePoolSize(max);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        synchronized (this.A) {
            this.B.execute(runnable);
        }
    }
}
