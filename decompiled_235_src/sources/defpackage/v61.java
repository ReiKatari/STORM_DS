package defpackage;

import java.io.Closeable;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: v61  reason: default package */
/* loaded from: classes.dex */
public final class v61 implements Executor, Closeable {
    public static final /* synthetic */ AtomicLongFieldUpdater d0 = AtomicLongFieldUpdater.newUpdater(v61.class, "parkedWorkersStack$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater e0 = AtomicLongFieldUpdater.newUpdater(v61.class, "controlState$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater f0 = AtomicIntegerFieldUpdater.newUpdater(v61.class, "_isTerminated$volatile");
    public static final gr1 g0 = new gr1("NOT_IN_STACK", 9);
    public final int A;
    public final int B;
    public final long L;
    public final String R;
    public final ls2 X;
    public final ls2 Y;
    public final dl5 Z;
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    /* JADX WARN: Type inference failed for: r4v3, types: [ly3, ls2] */
    /* JADX WARN: Type inference failed for: r4v4, types: [ly3, ls2] */
    public v61(int i, int i2, long j, String str) {
        this.A = i;
        this.B = i2;
        this.L = j;
        this.R = str;
        if (i >= 1) {
            if (i2 >= i) {
                if (i2 <= 2097150) {
                    if (j > 0) {
                        this.X = new ly3();
                        this.Y = new ly3();
                        this.Z = new dl5((i + 1) * 2);
                        this.controlState$volatile = i << 42;
                        return;
                    }
                    i.f(lb1.i(j, "Idle worker keep alive time ", " must be positive"));
                    throw null;
                }
                i.f(lb1.k("Max pool size ", i2, " should not exceed maximal supported number of threads 2097150"));
                throw null;
            }
            i.f(lb1.j("Max pool size ", i2, i, " should be greater than or equals to core pool size "));
            throw null;
        }
        i.f(lb1.k("Core pool size ", i, " should be at least 1"));
        throw null;
    }

    public static /* synthetic */ void k(v61 v61Var, Runnable runnable, int i) {
        boolean z;
        if ((i & 4) != 0) {
            z = false;
        } else {
            z = true;
        }
        v61Var.h(runnable, false, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x006c, code lost:
        if (r0 == null) goto L42;
     */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void close() {
        t61 t61Var;
        int i;
        mz6 mz6Var;
        if (!f0.compareAndSet(this, 0, 1)) {
            return;
        }
        Thread currentThread = Thread.currentThread();
        t61 t61Var2 = null;
        if (currentThread instanceof t61) {
            t61Var = (t61) currentThread;
        } else {
            t61Var = null;
        }
        if (t61Var != null && t61Var.d0 == this) {
            t61Var2 = t61Var;
        }
        synchronized (this.Z) {
            i = (int) (e0.get(this) & 2097151);
        }
        if (1 <= i) {
            int i2 = 1;
            while (true) {
                Object b = this.Z.b(i2);
                b.getClass();
                t61 t61Var3 = (t61) b;
                if (t61Var3 != t61Var2) {
                    while (t61Var3.getState() != Thread.State.TERMINATED) {
                        LockSupport.unpark(t61Var3);
                        t61Var3.join(10000L);
                    }
                    t61Var3.A.d(this.Y);
                }
                if (i2 == i) {
                    break;
                }
                i2++;
            }
        }
        this.Y.b();
        this.X.b();
        while (true) {
            if (t61Var2 != null) {
                mz6Var = t61Var2.a(true);
            }
            mz6Var = (mz6) this.X.d();
            if (mz6Var == null && (mz6Var = (mz6) this.Y.d()) == null) {
                break;
            }
            try {
                mz6Var.run();
            } catch (Throwable th) {
                Thread currentThread2 = Thread.currentThread();
                currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
            }
        }
        if (t61Var2 != null) {
            t61Var2.h(u61.TERMINATED);
        }
        d0.set(this, 0L);
        e0.set(this, 0L);
    }

    public final int e() {
        boolean z;
        synchronized (this.Z) {
            try {
                if (f0.get(this) == 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = e0;
                long j = atomicLongFieldUpdater.get(this);
                int i = (int) (j & 2097151);
                int i2 = i - ((int) ((j & 4398044413952L) >> 21));
                if (i2 < 0) {
                    i2 = 0;
                }
                if (i2 >= this.A) {
                    return 0;
                }
                if (i >= this.B) {
                    return 0;
                }
                int i3 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i3 > 0 && this.Z.b(i3) == null) {
                    t61 t61Var = new t61(this, i3);
                    this.Z.c(i3, t61Var);
                    if (i3 == ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                        int i4 = i2 + 1;
                        t61Var.start();
                        return i4;
                    }
                    throw new IllegalArgumentException("Failed requirement.");
                }
                throw new IllegalArgumentException("Failed requirement.");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        k(this, runnable, 6);
    }

    public final void h(Runnable runnable, boolean z, boolean z2) {
        mz6 nz6Var;
        long j;
        t61 t61Var;
        boolean a;
        u61 u61Var;
        sz6.f.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof mz6) {
            nz6Var = (mz6) runnable;
            nz6Var.A = nanoTime;
            nz6Var.B = z;
        } else {
            nz6Var = new nz6(runnable, nanoTime, z);
        }
        boolean z3 = nz6Var.B;
        AtomicLongFieldUpdater atomicLongFieldUpdater = e0;
        if (z3) {
            j = atomicLongFieldUpdater.addAndGet(this, 2097152L);
        } else {
            j = 0;
        }
        Thread currentThread = Thread.currentThread();
        t61 t61Var2 = null;
        if (currentThread instanceof t61) {
            t61Var = (t61) currentThread;
        } else {
            t61Var = null;
        }
        if (t61Var != null && t61Var.d0 == this) {
            t61Var2 = t61Var;
        }
        if (t61Var2 != null && (u61Var = t61Var2.L) != u61.TERMINATED && (nz6Var.B || u61Var != u61.BLOCKING)) {
            t61Var2.Z = true;
            nz6Var = t61Var2.A.a(nz6Var, z2);
        }
        if (nz6Var != null) {
            if (nz6Var.B) {
                a = this.Y.a(nz6Var);
            } else {
                a = this.X.a(nz6Var);
            }
            if (!a) {
                throw new RejectedExecutionException(i61.n(new StringBuilder(), this.R, " was terminated"));
            }
        }
        if (z3) {
            if (!u() && !r(j)) {
                u();
            }
        } else if (u() || r(atomicLongFieldUpdater.get(this))) {
        } else {
            u();
        }
    }

    public final void n(t61 t61Var, int i, int i2) {
        while (true) {
            long j = d0.get(this);
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & (-2097152);
            if (i3 == i) {
                if (i2 == 0) {
                    Object c = t61Var.c();
                    while (true) {
                        if (c == g0) {
                            i3 = -1;
                            break;
                        } else if (c == null) {
                            i3 = 0;
                            break;
                        } else {
                            t61 t61Var2 = (t61) c;
                            int b = t61Var2.b();
                            if (b != 0) {
                                i3 = b;
                                break;
                            }
                            c = t61Var2.c();
                        }
                    }
                } else {
                    i3 = i2;
                }
            }
            if (i3 >= 0) {
                v61 v61Var = this;
                if (d0.compareAndSet(v61Var, j, i3 | j2)) {
                    return;
                }
                this = v61Var;
            }
        }
    }

    public final boolean r(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i2 = this.A;
        if (i < i2) {
            int e = e();
            if (e == 1 && i2 > 1) {
                e();
            }
            if (e > 0) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        dl5 dl5Var = this.Z;
        int a = dl5Var.a();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < a; i6++) {
            t61 t61Var = (t61) dl5Var.b(i6);
            if (t61Var != null) {
                int c = t61Var.A.c();
                int i7 = s61.a[t61Var.L.ordinal()];
                if (i7 != 1) {
                    if (i7 != 2) {
                        if (i7 != 3) {
                            if (i7 != 4) {
                                if (i7 == 5) {
                                    i5++;
                                } else {
                                    i.d();
                                    return null;
                                }
                            } else {
                                i4++;
                                if (c > 0) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(c);
                                    sb.append('d');
                                    arrayList.add(sb.toString());
                                }
                            }
                        } else {
                            i++;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(c);
                            sb2.append('c');
                            arrayList.add(sb2.toString());
                        }
                    } else {
                        i2++;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(c);
                        sb3.append('b');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    i3++;
                }
            }
        }
        long j = e0.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.R);
        sb4.append('@');
        sb4.append(nc1.P(this));
        sb4.append("[Pool Size {core = ");
        int i8 = this.A;
        sb4.append(i8);
        sb4.append(", max = ");
        lb1.x(sb4, this.B, "}, Worker States {CPU = ", i, ", blocking = ");
        lb1.x(sb4, i2, ", parked = ", i3, ", dormant = ");
        lb1.x(sb4, i4, ", terminated = ", i5, "}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.X.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.Y.c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i8 - ((int) ((j & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }

    public final boolean u() {
        v61 v61Var;
        gr1 gr1Var;
        int i;
        while (true) {
            long j = d0.get(this);
            t61 t61Var = (t61) this.Z.b((int) (2097151 & j));
            if (t61Var == null) {
                t61Var = null;
                v61Var = this;
            } else {
                long j2 = (2097152 + j) & (-2097152);
                Object c = t61Var.c();
                while (true) {
                    gr1Var = g0;
                    if (c == gr1Var) {
                        i = -1;
                        break;
                    } else if (c == null) {
                        i = 0;
                        break;
                    } else {
                        t61 t61Var2 = (t61) c;
                        i = t61Var2.b();
                        if (i != 0) {
                            break;
                        }
                        c = t61Var2.c();
                        j = j;
                    }
                }
                if (i >= 0) {
                    v61 v61Var2 = this;
                    boolean compareAndSet = d0.compareAndSet(v61Var2, j, i | j2);
                    v61Var = v61Var2;
                    if (compareAndSet) {
                        t61Var.g(gr1Var);
                    }
                    this = v61Var;
                } else {
                    continue;
                }
            }
            if (t61Var == null) {
                return false;
            }
            if (t61.e0.compareAndSet(t61Var, -1, 0)) {
                LockSupport.unpark(t61Var);
                return true;
            }
            this = v61Var;
        }
    }
}
