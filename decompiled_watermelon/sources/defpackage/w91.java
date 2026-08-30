package defpackage;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: w91  reason: default package */
/* loaded from: classes.dex */
public final class w91 extends z12 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;
    public static final w91 g0;
    public static final long h0;

    /* JADX WARN: Type inference failed for: r0v0, types: [g31, u12, w91] */
    static {
        Long l;
        ?? g31Var = new g31();
        g0 = g31Var;
        g31Var.p0(false);
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        h0 = TimeUnit.MILLISECONDS.toNanos(l.longValue());
    }

    @Override // defpackage.z12
    public final void A0(long j, x12 x12Var) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    public final synchronized void G0() {
        boolean z;
        int i = debugStatus;
        if (i != 2 && i != 3) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            return;
        }
        debugStatus = 3;
        C0();
        notifyAll();
    }

    @Override // defpackage.z12, defpackage.sc1
    public final eh1 Q(long j, Runnable runnable, e31 e31Var) {
        long j2 = 0;
        if (j > 0) {
            if (j >= 9223372036854L) {
                j2 = Long.MAX_VALUE;
            } else {
                j2 = 1000000 * j;
            }
        }
        if (j2 < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            w12 w12Var = new w12(runnable, j2 + nanoTime);
            D0(nanoTime, w12Var);
            return w12Var;
        }
        return t74.A;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        boolean z2;
        boolean z0;
        vs6.a.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i != 2 && i != 3) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    if (!z0) {
                        return;
                    }
                    return;
                }
                debugStatus = 1;
                notifyAll();
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long q0 = q0();
                    if (q0 == Long.MAX_VALUE) {
                        long nanoTime = System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = h0 + nanoTime;
                        }
                        long j2 = j - nanoTime;
                        if (j2 <= 0) {
                            _thread = null;
                            G0();
                            if (!z0()) {
                                y0();
                                return;
                            }
                            return;
                        } else if (q0 > j2) {
                            q0 = j2;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (q0 > 0) {
                        int i2 = debugStatus;
                        if (i2 != 2 && i2 != 3) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (z2) {
                            _thread = null;
                            G0();
                            if (!z0()) {
                                y0();
                                return;
                            }
                            return;
                        }
                        LockSupport.parkNanos(this, q0);
                    }
                }
            }
        } finally {
            _thread = null;
            G0();
            if (!z0()) {
                y0();
            }
        }
    }

    @Override // defpackage.z12, defpackage.u12
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // defpackage.g31
    public final String toString() {
        return "DefaultExecutor";
    }

    @Override // defpackage.z12
    public final void u0(Runnable runnable) {
        if (debugStatus != 4) {
            super.u0(runnable);
            return;
        }
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // defpackage.z12
    public final Thread y0() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 == null) {
            synchronized (this) {
                thread = _thread;
                if (thread == null) {
                    thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                    _thread = thread;
                    thread.setContextClassLoader(g0.getClass().getClassLoader());
                    thread.setDaemon(true);
                    thread.start();
                }
            }
            return thread;
        }
        return thread2;
    }
}
