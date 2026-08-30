package zc;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class y extends q0 implements Runnable {
    private static volatile Thread _thread;

    /* renamed from: d0  reason: collision with root package name */
    public static final y f15041d0;
    private static volatile int debugStatus;

    /* renamed from: e0  reason: collision with root package name */
    public static final long f15042e0;

    /* JADX WARN: Type inference failed for: r0v0, types: [zc.q, zc.y, zc.l0] */
    static {
        Long l10;
        ?? qVar = new q();
        f15041d0 = qVar;
        qVar.d0(false);
        try {
            l10 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l10 = 1000L;
        }
        f15042e0 = TimeUnit.MILLISECONDS.toNanos(l10.longValue());
    }

    @Override // zc.q0, zc.a0
    public final i0 J(long j2, Runnable runnable, cc.g gVar) {
        long j10 = 0;
        if (j2 > 0) {
            if (j2 >= 9223372036854L) {
                j10 = Long.MAX_VALUE;
            } else {
                j10 = 1000000 * j2;
            }
        }
        if (j10 < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            n0 n0Var = new n0(runnable, j10 + nanoTime);
            m0(nanoTime, n0Var);
            return n0Var;
        }
        return j1.A;
    }

    @Override // zc.q0
    public final void g0(Runnable runnable) {
        if (debugStatus != 4) {
            super.g0(runnable);
            return;
        }
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // zc.q0
    public final Thread j0() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 == null) {
            synchronized (this) {
                thread = _thread;
                if (thread == null) {
                    thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                    _thread = thread;
                    thread.setContextClassLoader(f15041d0.getClass().getClassLoader());
                    thread.setDaemon(true);
                    thread.start();
                }
            }
            return thread;
        }
        return thread2;
    }

    @Override // zc.q0
    public final void l0(long j2, o0 o0Var) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    public final synchronized void n0() {
        boolean z10;
        int i2 = debugStatus;
        if (i2 != 2 && i2 != 3) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            return;
        }
        debugStatus = 3;
        q0.Z.set(this, null);
        q0.f15027b0.set(this, null);
        notifyAll();
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        boolean z11;
        boolean k02;
        n1.f15023a.set(this);
        try {
            synchronized (this) {
                int i2 = debugStatus;
                if (i2 != 2 && i2 != 3) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z10) {
                    if (!k02) {
                        return;
                    }
                    return;
                }
                debugStatus = 1;
                notifyAll();
                long j2 = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long e02 = e0();
                    if (e02 == Long.MAX_VALUE) {
                        long nanoTime = System.nanoTime();
                        if (j2 == Long.MAX_VALUE) {
                            j2 = f15042e0 + nanoTime;
                        }
                        long j10 = j2 - nanoTime;
                        if (j10 <= 0) {
                            _thread = null;
                            n0();
                            if (!k0()) {
                                j0();
                                return;
                            }
                            return;
                        } else if (e02 > j10) {
                            e02 = j10;
                        }
                    } else {
                        j2 = Long.MAX_VALUE;
                    }
                    if (e02 > 0) {
                        int i10 = debugStatus;
                        if (i10 != 2 && i10 != 3) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        if (z11) {
                            _thread = null;
                            n0();
                            if (!k0()) {
                                j0();
                                return;
                            }
                            return;
                        }
                        LockSupport.parkNanos(this, e02);
                    }
                }
            }
        } finally {
            _thread = null;
            n0();
            if (!k0()) {
                j0();
            }
        }
    }

    @Override // zc.q0, zc.l0
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // zc.q
    public final String toString() {
        return "DefaultExecutor";
    }
}
