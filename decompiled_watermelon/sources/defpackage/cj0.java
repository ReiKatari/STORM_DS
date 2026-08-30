package defpackage;

import java.lang.reflect.UndeclaredThrowableException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: cj0  reason: default package */
/* loaded from: classes.dex */
public final class cj0 extends pj2 implements Runnable {
    public iv L;
    public final LinkedBlockingQueue R = new LinkedBlockingQueue(1);
    public final CountDownLatch X = new CountDownLatch(1);
    public fq3 Y;
    public volatile fq3 Z;

    public cj0(iv ivVar, fq3 fq3Var) {
        this.L = ivVar;
        fq3Var.getClass();
        this.Y = fq3Var;
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

    @Override // defpackage.pj2, java.util.concurrent.Future
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
        fq3 fq3Var = this.Y;
        if (fq3Var != null) {
            fq3Var.cancel(z);
        }
        fq3 fq3Var2 = this.Z;
        if (fq3Var2 != null) {
            fq3Var2.cancel(z);
        }
        return true;
    }

    @Override // defpackage.pj2, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        if (!this.A.isDone()) {
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            if (timeUnit != timeUnit2) {
                j = timeUnit2.convert(j, timeUnit);
                timeUnit = timeUnit2;
            }
            fq3 fq3Var = this.Y;
            if (fq3Var != null) {
                long nanoTime = System.nanoTime();
                fq3Var.get(j, timeUnit);
                j -= Math.max(0L, System.nanoTime() - nanoTime);
            }
            long nanoTime2 = System.nanoTime();
            if (this.X.await(j, timeUnit)) {
                j -= Math.max(0L, System.nanoTime() - nanoTime2);
                fq3 fq3Var2 = this.Z;
                if (fq3Var2 != null) {
                    fq3Var2.get(j, timeUnit);
                }
            } else {
                throw new TimeoutException();
            }
        }
        return this.A.get(j, timeUnit);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [fq3, iv] */
    /* JADX WARN: Type inference failed for: r5v0, types: [cj0, pj2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [cj0] */
    /* JADX WARN: Type inference failed for: r5v3, types: [pj2] */
    /* JADX WARN: Type inference failed for: r5v6, types: [pj2] */
    /* JADX WARN: Type inference failed for: r5v7, types: [pj2] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.util.concurrent.CountDownLatch] */
    @Override // java.lang.Runnable
    public final void run() {
        cj0 cj0Var;
        try {
            try {
                try {
                    try {
                        try {
                            fq3 apply = this.L.apply(jv3.I(this.Y));
                            this.Z = apply;
                            if (this.A.isCancelled()) {
                                apply.cancel(((Boolean) b(this.R)).booleanValue());
                                this.Z = null;
                            } else {
                                apply.a(new qj2(6, this, apply, false), iq2.l());
                            }
                        } catch (Error e) {
                            i90 i90Var = this.B;
                            cj0Var = this;
                            if (i90Var != null) {
                                i90Var.c(e);
                                cj0Var = this;
                            }
                        }
                    } catch (UndeclaredThrowableException e2) {
                        Throwable cause = e2.getCause();
                        i90 i90Var2 = this.B;
                        cj0Var = this;
                        if (i90Var2 != null) {
                            i90Var2.c(cause);
                            cj0Var = this;
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
                i90 i90Var3 = this.B;
                if (i90Var3 != null) {
                    i90Var3.c(cause2);
                }
            }
        } catch (Exception e4) {
            i90 i90Var4 = this.B;
            cj0Var = this;
            if (i90Var4 != null) {
                i90Var4.c(e4);
                cj0Var = this;
            }
        }
    }

    @Override // defpackage.pj2, java.util.concurrent.Future
    public final Object get() {
        if (!this.A.isDone()) {
            fq3 fq3Var = this.Y;
            if (fq3Var != null) {
                fq3Var.get();
            }
            this.X.await();
            fq3 fq3Var2 = this.Z;
            if (fq3Var2 != null) {
                fq3Var2.get();
            }
        }
        return this.A.get();
    }
}
