package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: t61  reason: default package */
/* loaded from: classes.dex */
public final class t61 extends Thread {
    public static final /* synthetic */ AtomicIntegerFieldUpdater e0 = AtomicIntegerFieldUpdater.newUpdater(t61.class, "workerCtl$volatile");
    public final uw7 A;
    public final dh5 B;
    public u61 L;
    public long R;
    public long X;
    public int Y;
    public boolean Z;
    public final /* synthetic */ v61 d0;
    private volatile int indexInArray;
    private volatile Object nextParkedWorker;
    private volatile /* synthetic */ int workerCtl$volatile;

    /* JADX WARN: Type inference failed for: r3v5, types: [dh5, java.lang.Object] */
    public t61(v61 v61Var, int i) {
        this.d0 = v61Var;
        setDaemon(true);
        setContextClassLoader(v61.class.getClassLoader());
        this.A = new uw7();
        this.B = new Object();
        this.L = u61.DORMANT;
        this.nextParkedWorker = v61.g0;
        int nanoTime = (int) System.nanoTime();
        this.Y = nanoTime == 0 ? 42 : nanoTime;
        f(i);
    }

    public final mz6 a(boolean z) {
        mz6 e;
        mz6 e2;
        long j;
        u61 u61Var = this.L;
        u61 u61Var2 = u61.CPU_ACQUIRED;
        v61 v61Var = this.d0;
        boolean z2 = true;
        uw7 uw7Var = this.A;
        if (u61Var != u61Var2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = v61.e0;
            do {
                j = atomicLongFieldUpdater.get(v61Var);
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    mz6 g = uw7Var.g();
                    if (g == null && (g = (mz6) v61Var.Y.d()) == null) {
                        return i(1);
                    }
                    return g;
                }
            } while (!v61.e0.compareAndSet(v61Var, j, j - 4398046511104L));
            this.L = u61.CPU_ACQUIRED;
        }
        if (z) {
            if (d(v61Var.A * 2) != 0) {
                z2 = false;
            }
            if (z2 && (e2 = e()) != null) {
                return e2;
            }
            mz6 e3 = uw7Var.e();
            if (e3 != null) {
                return e3;
            }
            if (!z2 && (e = e()) != null) {
                return e;
            }
        } else {
            mz6 e4 = e();
            if (e4 != null) {
                return e4;
            }
        }
        return i(3);
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i) {
        int i2 = this.Y;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.Y = i5;
        int i6 = i - 1;
        if ((i6 & i) == 0) {
            return i6 & i5;
        }
        return (Integer.MAX_VALUE & i5) % i;
    }

    public final mz6 e() {
        int d = d(2);
        v61 v61Var = this.d0;
        ls2 ls2Var = v61Var.Y;
        ls2 ls2Var2 = v61Var.X;
        if (d == 0) {
            mz6 mz6Var = (mz6) ls2Var2.d();
            if (mz6Var != null) {
                return mz6Var;
            }
            return (mz6) ls2Var.d();
        }
        mz6 mz6Var2 = (mz6) ls2Var.d();
        if (mz6Var2 != null) {
            return mz6Var2;
        }
        return (mz6) ls2Var2.d();
    }

    public final void f(int i) {
        String valueOf;
        StringBuilder sb = new StringBuilder();
        sb.append(this.d0.R);
        sb.append("-worker-");
        if (i == 0) {
            valueOf = "TERMINATED";
        } else {
            valueOf = String.valueOf(i);
        }
        sb.append(valueOf);
        setName(sb.toString());
        this.indexInArray = i;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(u61 u61Var) {
        boolean z;
        u61 u61Var2 = this.L;
        if (u61Var2 == u61.CPU_ACQUIRED) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            v61.e0.addAndGet(this.d0, 4398046511104L);
        }
        if (u61Var2 != u61Var) {
            this.L = u61Var;
        }
        return z;
    }

    public final mz6 i(int i) {
        mz6 mz6Var;
        long i2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = v61.e0;
        v61 v61Var = this.d0;
        int i3 = (int) (atomicLongFieldUpdater.get(v61Var) & 2097151);
        if (i3 < 2) {
            return null;
        }
        int d = d(i3);
        long j = Long.MAX_VALUE;
        for (int i4 = 0; i4 < i3; i4++) {
            boolean z = true;
            d++;
            if (d > i3) {
                d = 1;
            }
            t61 t61Var = (t61) v61Var.Z.b(d);
            if (t61Var != null && t61Var != this) {
                uw7 uw7Var = t61Var.A;
                if (i == 3) {
                    mz6Var = uw7Var.f();
                } else {
                    uw7Var.getClass();
                    int i5 = uw7.d.get(uw7Var);
                    int i6 = uw7.c.get(uw7Var);
                    if (i != 1) {
                        z = false;
                    }
                    while (i5 != i6 && (!z || uw7.e.get(uw7Var) != 0)) {
                        int i7 = i5 + 1;
                        mz6Var = uw7Var.h(i5, z);
                        if (mz6Var != null) {
                            break;
                        }
                        i5 = i7;
                    }
                    mz6Var = null;
                }
                dh5 dh5Var = this.B;
                if (mz6Var != null) {
                    dh5Var.A = mz6Var;
                    i2 = -1;
                } else {
                    i2 = uw7Var.i(i, dh5Var);
                }
                if (i2 == -1) {
                    mz6 mz6Var2 = (mz6) dh5Var.A;
                    dh5Var.A = null;
                    return mz6Var2;
                } else if (i2 > 0) {
                    j = Math.min(j, i2);
                }
            }
        }
        if (j == Long.MAX_VALUE) {
            j = 0;
        }
        this.X = j;
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x0004, code lost:
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0004, code lost:
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0004, code lost:
        continue;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        long j;
        boolean z;
        loop0: while (true) {
            boolean z2 = false;
            while (v61.f0.get(this.d0) != 1) {
                u61 u61Var = this.L;
                u61 u61Var2 = u61.TERMINATED;
                if (u61Var == u61Var2) {
                    break loop0;
                }
                mz6 a = a(this.Z);
                if (a != null) {
                    this.X = 0L;
                    v61 v61Var = this.d0;
                    this.R = 0L;
                    if (this.L == u61.PARKING) {
                        this.L = u61.BLOCKING;
                    }
                    if (a.B) {
                        if (h(u61.BLOCKING) && !v61Var.u() && !v61Var.r(v61.e0.get(v61Var))) {
                            v61Var.u();
                        }
                        try {
                            a.run();
                        } catch (Throwable th) {
                            Thread currentThread = Thread.currentThread();
                            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
                        }
                        v61.e0.addAndGet(v61Var, -2097152L);
                        if (this.L != u61Var2) {
                            this.L = u61.DORMANT;
                        }
                    } else {
                        try {
                            a.run();
                        } catch (Throwable th2) {
                            Thread currentThread2 = Thread.currentThread();
                            currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th2);
                        }
                    }
                } else {
                    this.Z = false;
                    if (this.X != 0) {
                        if (!z2) {
                            z2 = true;
                        } else {
                            h(u61.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.X);
                            this.X = 0L;
                        }
                    } else {
                        Object obj = this.nextParkedWorker;
                        gr1 gr1Var = v61.g0;
                        if (obj != gr1Var) {
                            e0.set(this, -1);
                            while (this.nextParkedWorker != v61.g0) {
                                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = e0;
                                if (atomicIntegerFieldUpdater.get(this) == -1) {
                                    v61 v61Var2 = this.d0;
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = v61.f0;
                                    if (atomicIntegerFieldUpdater2.get(v61Var2) == 1) {
                                        break;
                                    }
                                    u61 u61Var3 = this.L;
                                    u61 u61Var4 = u61.TERMINATED;
                                    if (u61Var3 == u61Var4) {
                                        break;
                                    }
                                    h(u61.PARKING);
                                    Thread.interrupted();
                                    if (this.R == 0) {
                                        j = 2097151;
                                        this.R = System.nanoTime() + this.d0.L;
                                    } else {
                                        j = 2097151;
                                    }
                                    LockSupport.parkNanos(this.d0.L);
                                    if (System.nanoTime() - this.R >= 0) {
                                        this.R = 0L;
                                        v61 v61Var3 = this.d0;
                                        synchronized (v61Var3.Z) {
                                            try {
                                                if (atomicIntegerFieldUpdater2.get(v61Var3) == 1) {
                                                    z = true;
                                                } else {
                                                    z = false;
                                                }
                                                if (!z) {
                                                    AtomicLongFieldUpdater atomicLongFieldUpdater = v61.e0;
                                                    if (((int) (atomicLongFieldUpdater.get(v61Var3) & j)) > v61Var3.A) {
                                                        if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                            int i = this.indexInArray;
                                                            f(0);
                                                            v61Var3.n(this, i, 0);
                                                            int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(v61Var3) & j);
                                                            if (andDecrement != i) {
                                                                Object b = v61Var3.Z.b(andDecrement);
                                                                b.getClass();
                                                                t61 t61Var = (t61) b;
                                                                v61Var3.Z.c(i, t61Var);
                                                                t61Var.f(i);
                                                                v61Var3.n(t61Var, andDecrement, i);
                                                            }
                                                            v61Var3.Z.c(andDecrement, null);
                                                            this.L = u61Var4;
                                                        }
                                                    }
                                                }
                                            } catch (Throwable th3) {
                                                throw th3;
                                            }
                                        }
                                    }
                                }
                            }
                            continue;
                        } else {
                            v61 v61Var4 = this.d0;
                            if (this.nextParkedWorker == gr1Var) {
                                AtomicLongFieldUpdater atomicLongFieldUpdater2 = v61.d0;
                                while (true) {
                                    long j2 = atomicLongFieldUpdater2.get(v61Var4);
                                    int i2 = this.indexInArray;
                                    this.nextParkedWorker = v61Var4.Z.b((int) (j2 & 2097151));
                                    v61 v61Var5 = v61Var4;
                                    if (v61.d0.compareAndSet(v61Var5, j2, ((j2 + 2097152) & (-2097152)) | i2)) {
                                        break;
                                    }
                                    v61Var4 = v61Var5;
                                }
                            }
                        }
                    }
                }
            }
            break loop0;
        }
        h(u61.TERMINATED);
    }
}
