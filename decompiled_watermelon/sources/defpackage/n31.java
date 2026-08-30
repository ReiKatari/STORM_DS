package defpackage;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: n31  reason: default package */
/* loaded from: classes.dex */
public final class n31 implements Executor, Closeable {
    public static final /* synthetic */ AtomicLongFieldUpdater c0 = AtomicLongFieldUpdater.newUpdater(n31.class, "parkedWorkersStack$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater d0 = AtomicLongFieldUpdater.newUpdater(n31.class, "controlState$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater e0 = AtomicIntegerFieldUpdater.newUpdater(n31.class, "_isTerminated$volatile");
    public static final an1 f0 = new an1("NOT_IN_STACK", 9);
    public final int A;
    public final int B;
    public final long L;
    public final String R;
    public final gm2 X;
    public final gm2 Y;
    public final lb5 Z;
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    /* JADX WARN: Type inference failed for: r4v3, types: [kr3, gm2] */
    /* JADX WARN: Type inference failed for: r4v4, types: [kr3, gm2] */
    public n31(int i, int i2, long j, String str) {
        this.A = i;
        this.B = i2;
        this.L = j;
        this.R = str;
        if (i >= 1) {
            if (i2 >= i) {
                if (i2 <= 2097150) {
                    if (j > 0) {
                        this.X = new kr3();
                        this.Y = new kr3();
                        this.Z = new lb5((i + 1) * 2);
                        this.controlState$volatile = i << 42;
                        return;
                    }
                    vd6.f("Idle worker keep alive time ", j, " must be positive");
                    throw null;
                }
                i.g(wh1.j("Max pool size ", i2, " should not exceed maximal supported number of threads 2097150"));
                throw null;
            }
            i.g(wh1.f(i2, i, "Max pool size ", " should be greater than or equals to core pool size "));
            throw null;
        }
        i.g(wh1.j("Core pool size ", i, " should be at least 1"));
        throw null;
    }

    public static /* synthetic */ void p(n31 n31Var, Runnable runnable, int i) {
        boolean z;
        if ((i & 4) != 0) {
            z = false;
        } else {
            z = true;
        }
        n31Var.i(runnable, false, z);
    }

    public final boolean B() {
        n31 n31Var;
        an1 an1Var;
        int i;
        while (true) {
            long j = c0.get(this);
            l31 l31Var = (l31) this.Z.b((int) (2097151 & j));
            if (l31Var == null) {
                l31Var = null;
                n31Var = this;
            } else {
                long j2 = (2097152 + j) & (-2097152);
                Object c = l31Var.c();
                while (true) {
                    an1Var = f0;
                    if (c == an1Var) {
                        i = -1;
                        break;
                    } else if (c == null) {
                        i = 0;
                        break;
                    } else {
                        l31 l31Var2 = (l31) c;
                        i = l31Var2.b();
                        if (i != 0) {
                            break;
                        }
                        c = l31Var2.c();
                        j = j;
                    }
                }
                if (i >= 0) {
                    n31 n31Var2 = this;
                    boolean compareAndSet = c0.compareAndSet(n31Var2, j, i | j2);
                    n31Var = n31Var2;
                    if (compareAndSet) {
                        l31Var.g(an1Var);
                    }
                    this = n31Var;
                } else {
                    continue;
                }
            }
            if (l31Var == null) {
                return false;
            }
            if (l31.d0.compareAndSet(l31Var, -1, 0)) {
                LockSupport.unpark(l31Var);
                return true;
            }
            this = n31Var;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x006c, code lost:
        if (r0 == null) goto L42;
     */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void close() {
        /*
            r8 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = defpackage.n31.e0
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r8, r1, r2)
            if (r0 != 0) goto Lb
            return
        Lb:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r1 = r0 instanceof defpackage.l31
            r3 = 0
            if (r1 == 0) goto L17
            l31 r0 = (defpackage.l31) r0
            goto L18
        L17:
            r0 = r3
        L18:
            if (r0 == 0) goto L20
            n31 r1 = r0.c0
            if (r1 == r8) goto L1f
            goto L20
        L1f:
            r3 = r0
        L20:
            lb5 r0 = r8.Z
            monitor-enter(r0)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = defpackage.n31.d0     // Catch: java.lang.Throwable -> La7
            long r4 = r1.get(r8)     // Catch: java.lang.Throwable -> La7
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r1 = (int) r4
            monitor-exit(r0)
            if (r2 > r1) goto L5c
            r0 = r2
        L32:
            lb5 r4 = r8.Z
            java.lang.Object r4 = r4.b(r0)
            r4.getClass()
            l31 r4 = (defpackage.l31) r4
            if (r4 == r3) goto L57
        L3f:
            java.lang.Thread$State r5 = r4.getState()
            java.lang.Thread$State r6 = java.lang.Thread.State.TERMINATED
            if (r5 == r6) goto L50
            java.util.concurrent.locks.LockSupport.unpark(r4)
            r5 = 10000(0x2710, double:4.9407E-320)
            r4.join(r5)
            goto L3f
        L50:
            th7 r4 = r4.A
            gm2 r5 = r8.Y
            r4.d(r5)
        L57:
            if (r0 == r1) goto L5c
            int r0 = r0 + 1
            goto L32
        L5c:
            gm2 r0 = r8.Y
            r0.b()
            gm2 r0 = r8.X
            r0.b()
        L66:
            if (r3 == 0) goto L6e
            cn6 r0 = r3.a(r2)
            if (r0 != 0) goto L96
        L6e:
            gm2 r0 = r8.X
            java.lang.Object r0 = r0.d()
            cn6 r0 = (defpackage.cn6) r0
            if (r0 != 0) goto L96
            gm2 r0 = r8.Y
            java.lang.Object r0 = r0.d()
            cn6 r0 = (defpackage.cn6) r0
            if (r0 != 0) goto L96
            if (r3 == 0) goto L89
            m31 r0 = defpackage.m31.TERMINATED
            r3.h(r0)
        L89:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.n31.c0
            r1 = 0
            r0.set(r8, r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.n31.d0
            r0.set(r8, r1)
            return
        L96:
            r0.run()     // Catch: java.lang.Throwable -> L9a
            goto L66
        L9a:
            r0 = move-exception
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            java.lang.Thread$UncaughtExceptionHandler r4 = r1.getUncaughtExceptionHandler()
            r4.uncaughtException(r1, r0)
            goto L66
        La7:
            r8 = move-exception
            monitor-exit(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n31.close():void");
    }

    public final int d() {
        boolean z;
        synchronized (this.Z) {
            try {
                if (e0.get(this) == 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = d0;
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
                    l31 l31Var = new l31(this, i3);
                    this.Z.c(i3, l31Var);
                    if (i3 == ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                        int i4 = i2 + 1;
                        l31Var.start();
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
        p(this, runnable, 6);
    }

    public final void i(Runnable runnable, boolean z, boolean z2) {
        cn6 dn6Var;
        long j;
        l31 l31Var;
        boolean a;
        m31 m31Var;
        hn6.f.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof cn6) {
            dn6Var = (cn6) runnable;
            dn6Var.A = nanoTime;
            dn6Var.B = z;
        } else {
            dn6Var = new dn6(runnable, nanoTime, z);
        }
        boolean z3 = dn6Var.B;
        AtomicLongFieldUpdater atomicLongFieldUpdater = d0;
        if (z3) {
            j = atomicLongFieldUpdater.addAndGet(this, 2097152L);
        } else {
            j = 0;
        }
        Thread currentThread = Thread.currentThread();
        l31 l31Var2 = null;
        if (currentThread instanceof l31) {
            l31Var = (l31) currentThread;
        } else {
            l31Var = null;
        }
        if (l31Var != null && l31Var.c0 == this) {
            l31Var2 = l31Var;
        }
        if (l31Var2 != null && (m31Var = l31Var2.L) != m31.TERMINATED && (dn6Var.B || m31Var != m31.BLOCKING)) {
            l31Var2.Z = true;
            dn6Var = l31Var2.A.a(dn6Var, z2);
        }
        if (dn6Var != null) {
            if (dn6Var.B) {
                a = this.Y.a(dn6Var);
            } else {
                a = this.X.a(dn6Var);
            }
            if (!a) {
                throw new RejectedExecutionException(b31.q(new StringBuilder(), this.R, " was terminated"));
            }
        }
        if (z3) {
            if (!B() && !x(j)) {
                B();
            }
        } else if (B() || x(atomicLongFieldUpdater.get(this))) {
        } else {
            B();
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        lb5 lb5Var = this.Z;
        int a = lb5Var.a();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < a; i6++) {
            l31 l31Var = (l31) lb5Var.b(i6);
            if (l31Var != null) {
                int c = l31Var.A.c();
                int i7 = k31.a[l31Var.L.ordinal()];
                if (i7 != 1) {
                    if (i7 != 2) {
                        if (i7 != 3) {
                            if (i7 != 4) {
                                if (i7 == 5) {
                                    i5++;
                                } else {
                                    i.c();
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
        long j = d0.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.R);
        sb4.append('@');
        sb4.append(w81.s(this));
        sb4.append("[Pool Size {core = ");
        int i8 = this.A;
        sb4.append(i8);
        sb4.append(", max = ");
        b31.A(sb4, this.B, "}, Worker States {CPU = ", i, ", blocking = ");
        b31.A(sb4, i2, ", parked = ", i3, ", dormant = ");
        b31.A(sb4, i4, ", terminated = ", i5, "}, running workers queues = ");
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

    public final void w(l31 l31Var, int i, int i2) {
        while (true) {
            long j = c0.get(this);
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & (-2097152);
            if (i3 == i) {
                if (i2 == 0) {
                    Object c = l31Var.c();
                    while (true) {
                        if (c == f0) {
                            i3 = -1;
                            break;
                        } else if (c == null) {
                            i3 = 0;
                            break;
                        } else {
                            l31 l31Var2 = (l31) c;
                            int b = l31Var2.b();
                            if (b != 0) {
                                i3 = b;
                                break;
                            }
                            c = l31Var2.c();
                        }
                    }
                } else {
                    i3 = i2;
                }
            }
            if (i3 >= 0) {
                n31 n31Var = this;
                if (c0.compareAndSet(n31Var, j, i3 | j2)) {
                    return;
                }
                this = n31Var;
            }
        }
    }

    public final boolean x(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i2 = this.A;
        if (i < i2) {
            int d = d();
            if (d == 1 && i2 > 1) {
                d();
            }
            if (d > 0) {
                return true;
            }
        }
        return false;
    }
}
