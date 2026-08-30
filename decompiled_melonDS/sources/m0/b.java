package m0;

import java.lang.reflect.UndeclaredThrowableException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b extends d implements Runnable {
    public a L;
    public final LinkedBlockingQueue R = new LinkedBlockingQueue(1);
    public final CountDownLatch X = new CountDownLatch(1);
    public ta.a Y;
    public volatile ta.a Z;

    public b(a aVar, ta.a aVar2) {
        this.L = aVar;
        aVar2.getClass();
        this.Y = aVar2;
    }

    public static Object c(LinkedBlockingQueue linkedBlockingQueue) {
        Object take;
        boolean z10 = false;
        while (true) {
            try {
                take = linkedBlockingQueue.take();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th2) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return take;
    }

    @Override // m0.d, java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        boolean z11 = false;
        if (!this.A.cancel(z10)) {
            return false;
        }
        while (true) {
            try {
                this.R.put(Boolean.valueOf(z10));
                break;
            } catch (InterruptedException unused) {
                z11 = true;
            } catch (Throwable th2) {
                if (z11) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z11) {
            Thread.currentThread().interrupt();
        }
        ta.a aVar = this.Y;
        if (aVar != null) {
            aVar.cancel(z10);
        }
        ta.a aVar2 = this.Z;
        if (aVar2 != null) {
            aVar2.cancel(z10);
        }
        return true;
    }

    @Override // m0.d, java.util.concurrent.Future
    public final Object get(long j2, TimeUnit timeUnit) {
        if (!this.A.isDone()) {
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            if (timeUnit != timeUnit2) {
                j2 = timeUnit2.convert(j2, timeUnit);
                timeUnit = timeUnit2;
            }
            ta.a aVar = this.Y;
            if (aVar != null) {
                long nanoTime = System.nanoTime();
                aVar.get(j2, timeUnit);
                j2 -= Math.max(0L, System.nanoTime() - nanoTime);
            }
            long nanoTime2 = System.nanoTime();
            if (this.X.await(j2, timeUnit)) {
                j2 -= Math.max(0L, System.nanoTime() - nanoTime2);
                ta.a aVar2 = this.Z;
                if (aVar2 != null) {
                    aVar2.get(j2, timeUnit);
                }
            } else {
                throw new TimeoutException();
            }
        }
        return this.A.get(j2, timeUnit);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [m0.a, ta.a] */
    /* JADX WARN: Type inference failed for: r0v1, types: [m0.a, ta.a] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [m0.a, ta.a] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.concurrent.CountDownLatch] */
    /* JADX WARN: Type inference failed for: r0v9 */
    @Override // java.lang.Runnable
    public final void run() {
        ?? r02;
        ?? r03 = 0;
        r03 = 0;
        r03 = 0;
        r03 = 0;
        r03 = 0;
        try {
            try {
                try {
                    try {
                        try {
                            ta.a apply = this.L.apply(i.b(this.Y));
                            this.Z = apply;
                            if (this.A.isCancelled()) {
                                apply.cancel(((Boolean) c(this.R)).booleanValue());
                                this.Z = null;
                            } else {
                                apply.a(new h(3, this, apply, false), ij.a.D());
                            }
                        } catch (Exception e6) {
                            b5.i iVar = this.B;
                            r02 = r03;
                            if (iVar != null) {
                                iVar.c(e6);
                                r02 = r03;
                            }
                        }
                    } catch (Error e10) {
                        b5.i iVar2 = this.B;
                        r02 = r03;
                        if (iVar2 != null) {
                            iVar2.c(e10);
                            r02 = r03;
                        }
                    }
                } finally {
                    this.L = r03;
                    this.Y = r03;
                    this.X.countDown();
                }
            } catch (CancellationException unused) {
                cancel(false);
            } catch (ExecutionException e11) {
                Throwable cause = e11.getCause();
                b5.i iVar3 = this.B;
                if (iVar3 != null) {
                    iVar3.c(cause);
                }
            }
        } catch (UndeclaredThrowableException e12) {
            Throwable cause2 = e12.getCause();
            b5.i iVar4 = this.B;
            r02 = r03;
            if (iVar4 != null) {
                iVar4.c(cause2);
                r02 = r03;
            }
        }
    }

    @Override // m0.d, java.util.concurrent.Future
    public final Object get() {
        if (!this.A.isDone()) {
            ta.a aVar = this.Y;
            if (aVar != null) {
                aVar.get();
            }
            this.X.await();
            ta.a aVar2 = this.Z;
            if (aVar2 != null) {
                aVar2.get();
            }
        }
        return this.A.get();
    }
}
