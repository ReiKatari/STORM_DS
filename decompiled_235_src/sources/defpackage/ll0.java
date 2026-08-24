package defpackage;

import java.lang.reflect.UndeclaredThrowableException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ll0  reason: default package */
/* loaded from: classes.dex */
public final class ll0 extends to2 implements Runnable {
    public aw L;
    public final LinkedBlockingQueue R = new LinkedBlockingQueue(1);
    public final CountDownLatch X = new CountDownLatch(1);
    public gx3 Y;
    public volatile gx3 Z;

    public ll0(aw awVar, gx3 gx3Var) {
        this.L = awVar;
        gx3Var.getClass();
        this.Y = gx3Var;
    }

    public static Object b(LinkedBlockingQueue linkedBlockingQueue) {
        Object take;
        boolean z = false;
        while (true) {
            try {
                take = linkedBlockingQueue.take();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return take;
    }

    @Override // defpackage.to2, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean z2 = false;
        if (!this.A.cancel(z)) {
            return false;
        }
        while (true) {
            try {
                this.R.put(Boolean.valueOf(z));
                break;
            } catch (InterruptedException unused) {
                z2 = true;
            } catch (Throwable th) {
                if (z2) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        gx3 gx3Var = this.Y;
        if (gx3Var != null) {
            gx3Var.cancel(z);
        }
        gx3 gx3Var2 = this.Z;
        if (gx3Var2 != null) {
            gx3Var2.cancel(z);
        }
        return true;
    }

    @Override // defpackage.to2, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        if (!this.A.isDone()) {
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            if (timeUnit != timeUnit2) {
                j = timeUnit2.convert(j, timeUnit);
                timeUnit = timeUnit2;
            }
            gx3 gx3Var = this.Y;
            if (gx3Var != null) {
                long nanoTime = System.nanoTime();
                gx3Var.get(j, timeUnit);
                j -= Math.max(0L, System.nanoTime() - nanoTime);
            }
            long nanoTime2 = System.nanoTime();
            if (this.X.await(j, timeUnit)) {
                j -= Math.max(0L, System.nanoTime() - nanoTime2);
                gx3 gx3Var2 = this.Z;
                if (gx3Var2 != null) {
                    gx3Var2.get(j, timeUnit);
                }
            } else {
                throw new TimeoutException();
            }
        }
        return this.A.get(j, timeUnit);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [gx3, aw] */
    /* JADX WARN: Type inference failed for: r5v0, types: [ll0, to2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [ll0] */
    /* JADX WARN: Type inference failed for: r5v3, types: [to2] */
    /* JADX WARN: Type inference failed for: r5v6, types: [to2] */
    /* JADX WARN: Type inference failed for: r5v7, types: [to2] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.util.concurrent.CountDownLatch] */
    @Override // java.lang.Runnable
    public final void run() {
        ll0 ll0Var;
        try {
            try {
                try {
                    try {
                        try {
                            gx3 apply = this.L.apply(l.w(this.Y));
                            this.Z = apply;
                            if (this.A.isCancelled()) {
                                apply.cancel(((Boolean) b(this.R)).booleanValue());
                                this.Z = null;
                            } else {
                                apply.a(u24.j(), new uo2(6, this, apply, false));
                            }
                        } catch (Error e) {
                            qb0 qb0Var = this.B;
                            ll0Var = this;
                            if (qb0Var != null) {
                                qb0Var.c(e);
                                ll0Var = this;
                            }
                        }
                    } catch (UndeclaredThrowableException e2) {
                        Throwable cause = e2.getCause();
                        qb0 qb0Var2 = this.B;
                        ll0Var = this;
                        if (qb0Var2 != null) {
                            qb0Var2.c(cause);
                            ll0Var = this;
                        }
                    }
                } finally {
                    this.L = null;
                    this.Y = null;
                    this.X.countDown();
                }
            } catch (CancellationException unused) {
                cancel(false);
            } catch (ExecutionException e3) {
                Throwable cause2 = e3.getCause();
                qb0 qb0Var3 = this.B;
                if (qb0Var3 != null) {
                    qb0Var3.c(cause2);
                }
            }
        } catch (Exception e4) {
            qb0 qb0Var4 = this.B;
            ll0Var = this;
            if (qb0Var4 != null) {
                qb0Var4.c(e4);
                ll0Var = this;
            }
        }
    }

    @Override // defpackage.to2, java.util.concurrent.Future
    public final Object get() {
        if (!this.A.isDone()) {
            gx3 gx3Var = this.Y;
            if (gx3Var != null) {
                gx3Var.get();
            }
            this.X.await();
            gx3 gx3Var2 = this.Z;
            if (gx3Var2 != null) {
                gx3Var2.get();
            }
        }
        return this.A.get();
    }
}
