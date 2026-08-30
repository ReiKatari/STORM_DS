package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import sun.misc.Unsafe;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: z12  reason: default package */
/* loaded from: classes.dex */
public abstract class z12 extends u12 implements sc1 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater Z = AtomicReferenceFieldUpdater.newUpdater(z12.class, Object.class, "_queue$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater c0;
    public static final /* synthetic */ AtomicIntegerFieldUpdater d0;
    public static final /* synthetic */ long e0;
    public static final /* synthetic */ long f0;
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile;
    private volatile /* synthetic */ Object _queue$volatile;

    static {
        Unsafe unsafe = ys5.a;
        f0 = unsafe.objectFieldOffset(z12.class.getDeclaredField("_queue$volatile"));
        c0 = AtomicReferenceFieldUpdater.newUpdater(z12.class, Object.class, "_delayed$volatile");
        e0 = unsafe.objectFieldOffset(z12.class.getDeclaredField("_delayed$volatile"));
        d0 = AtomicIntegerFieldUpdater.newUpdater(z12.class, "_isCompleted$volatile");
    }

    public void A0(long j, x12 x12Var) {
        w91.g0.D0(j, x12Var);
    }

    public final void B0() {
        x12 x12Var;
        long nanoTime = System.nanoTime();
        while (true) {
            c0.getClass();
            y12 y12Var = (y12) ys5.a.getObjectVolatile(this, e0);
            if (y12Var != null) {
                synchronized (y12Var) {
                    if (ys6.b.get(y12Var) > 0) {
                        x12Var = y12Var.b(0);
                    } else {
                        x12Var = null;
                    }
                }
                if (x12Var != null) {
                    A0(nanoTime, x12Var);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final void C0() {
        Z.getClass();
        Unsafe unsafe = ys5.a;
        unsafe.putObjectVolatile(this, f0, (Object) null);
        c0.getClass();
        unsafe.putObjectVolatile(this, e0, (Object) null);
    }

    public final void D0(long j, x12 x12Var) {
        Thread y0;
        int E0 = E0(j, x12Var);
        if (E0 != 0) {
            if (E0 != 1) {
                if (E0 != 2) {
                    i.n("unexpected result");
                    return;
                }
                return;
            }
            A0(j, x12Var);
        } else if (F0(x12Var) && Thread.currentThread() != (y0 = y0())) {
            LockSupport.unpark(y0);
        }
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, y12] */
    public final int E0(long j, x12 x12Var) {
        z12 z12Var;
        Unsafe unsafe;
        if (d0.get(this) == 1) {
            return 1;
        }
        c0.getClass();
        Unsafe unsafe2 = ys5.a;
        long j2 = e0;
        y12 y12Var = (y12) unsafe2.getObjectVolatile(this, j2);
        if (y12Var == null) {
            ?? obj = new Object();
            obj.c = j;
            while (true) {
                unsafe = ys5.a;
                z12Var = this;
                if (!unsafe.compareAndSwapObject(z12Var, e0, (Object) null, (Object) obj) && unsafe.getObjectVolatile(z12Var, j2) == null) {
                    this = z12Var;
                }
            }
            Object objectVolatile = unsafe.getObjectVolatile(z12Var, j2);
            objectVolatile.getClass();
            y12Var = (y12) objectVolatile;
        } else {
            z12Var = this;
        }
        return x12Var.b(j, y12Var, z12Var);
    }

    public final boolean F0(x12 x12Var) {
        c0.getClass();
        y12 y12Var = (y12) ys5.a.getObjectVolatile(this, e0);
        x12 x12Var2 = null;
        if (y12Var != null) {
            synchronized (y12Var) {
                x12[] x12VarArr = y12Var.a;
                if (x12VarArr != null) {
                    x12Var2 = x12VarArr[0];
                }
            }
        }
        if (x12Var2 != x12Var) {
            return false;
        }
        return true;
    }

    public eh1 Q(long j, Runnable runnable, e31 e31Var) {
        return x91.a.Q(j, runnable, e31Var);
    }

    @Override // defpackage.g31
    public final void j0(e31 e31Var, Runnable runnable) {
        u0(runnable);
    }

    @Override // defpackage.u12
    public final long q0() {
        if (r0()) {
            return 0L;
        }
        v0();
        Runnable t0 = t0();
        if (t0 != null) {
            t0.run();
            return 0L;
        }
        return x0();
    }

    public final void s0() {
        z12 z12Var;
        Unsafe unsafe;
        while (true) {
            Z.getClass();
            Unsafe unsafe2 = ys5.a;
            long j = f0;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            an1 an1Var = a22.b;
            if (objectVolatile == null) {
                while (true) {
                    Unsafe unsafe3 = ys5.a;
                    z12 z12Var2 = this;
                    z12Var = z12Var2;
                    if (!unsafe3.compareAndSwapObject(z12Var2, f0, (Object) null, an1Var)) {
                        if (unsafe3.getObjectVolatile(z12Var, j) != null) {
                            break;
                        }
                        this = z12Var;
                    } else {
                        return;
                    }
                }
            } else {
                z12Var = this;
                if (objectVolatile instanceof mr3) {
                    ((mr3) objectVolatile).c();
                    return;
                } else if (objectVolatile != an1Var) {
                    mr3 mr3Var = new mr3(8, true);
                    mr3Var.a((Runnable) objectVolatile);
                    do {
                        unsafe = ys5.a;
                        if (unsafe.compareAndSwapObject(z12Var, f0, objectVolatile, mr3Var)) {
                            return;
                        }
                    } while (unsafe.getObjectVolatile(z12Var, j) == objectVolatile);
                } else {
                    return;
                }
            }
            this = z12Var;
        }
    }

    @Override // defpackage.u12
    public void shutdown() {
        vs6.a.set(null);
        d0.set(this, 1);
        s0();
        do {
        } while (q0() <= 0);
        B0();
    }

    public final Runnable t0() {
        z12 z12Var;
        Unsafe unsafe;
        while (true) {
            Z.getClass();
            Unsafe unsafe2 = ys5.a;
            long j = f0;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            if (objectVolatile != null) {
                if (objectVolatile instanceof mr3) {
                    mr3 mr3Var = (mr3) objectVolatile;
                    Object e = mr3Var.e();
                    if (e != mr3.g) {
                        return (Runnable) e;
                    }
                    mr3 d = mr3Var.d();
                    while (true) {
                        Unsafe unsafe3 = ys5.a;
                        z12Var = this;
                        if (!unsafe3.compareAndSwapObject(z12Var, f0, objectVolatile, d) && unsafe3.getObjectVolatile(z12Var, j) == objectVolatile) {
                            this = z12Var;
                        }
                    }
                } else {
                    z12Var = this;
                    if (objectVolatile == a22.b) {
                        return null;
                    }
                    do {
                        unsafe = ys5.a;
                        if (unsafe.compareAndSwapObject(z12Var, f0, objectVolatile, (Object) null)) {
                            return (Runnable) objectVolatile;
                        }
                    } while (unsafe.getObjectVolatile(z12Var, j) == objectVolatile);
                }
                this = z12Var;
            } else {
                return null;
            }
        }
    }

    public void u0(Runnable runnable) {
        v0();
        if (w0(runnable)) {
            Thread y0 = y0();
            if (Thread.currentThread() != y0) {
                LockSupport.unpark(y0);
                return;
            }
            return;
        }
        w91.g0.u0(runnable);
    }

    public final void v0() {
        x12 x12Var;
        x12 x12Var2;
        boolean z;
        c0.getClass();
        y12 y12Var = (y12) ys5.a.getObjectVolatile(this, e0);
        if (y12Var == null || ys6.b.get(y12Var) == 0) {
            return;
        }
        long nanoTime = System.nanoTime();
        do {
            synchronized (y12Var) {
                try {
                    x12[] x12VarArr = y12Var.a;
                    x12Var = null;
                    if (x12VarArr != null) {
                        x12Var2 = x12VarArr[0];
                    } else {
                        x12Var2 = null;
                    }
                    if (x12Var2 == null) {
                        continue;
                    } else {
                        if (nanoTime - x12Var2.A >= 0) {
                            z = w0(x12Var2);
                        } else {
                            z = false;
                        }
                        if (z) {
                            x12Var = y12Var.b(0);
                        }
                        continue;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (x12Var != null);
    }

    @Override // defpackage.sc1
    public final void w(long j, ih0 ih0Var) {
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
            v12 v12Var = new v12(this, j2 + nanoTime, ih0Var);
            D0(nanoTime, v12Var);
            ih0Var.A(new bh0(2, v12Var));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0079, code lost:
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean w0(java.lang.Runnable r10) {
        /*
            r9 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.z12.Z
            r0.getClass()
            sun.misc.Unsafe r0 = defpackage.ys5.a
            long r6 = defpackage.z12.f0
            java.lang.Object r4 = r0.getObjectVolatile(r9, r6)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = defpackage.z12.d0
            int r0 = r0.get(r9)
            r8 = 1
            if (r0 != r8) goto L17
            goto L5c
        L17:
            if (r4 != 0) goto L2e
        L19:
            sun.misc.Unsafe r0 = defpackage.ys5.a
            long r2 = defpackage.z12.f0
            r4 = 0
            r1 = r9
            r5 = r10
            boolean r2 = r0.compareAndSwapObject(r1, r2, r4, r5)
            if (r2 == 0) goto L27
            goto L79
        L27:
            java.lang.Object r0 = r0.getObjectVolatile(r9, r6)
            if (r0 == 0) goto L19
            goto L0
        L2e:
            boolean r0 = r4 instanceof defpackage.mr3
            if (r0 == 0) goto L58
            r0 = r4
            mr3 r0 = (defpackage.mr3) r0
            int r2 = r0.a(r10)
            if (r2 == 0) goto L79
            if (r2 == r8) goto L41
            r0 = 2
            if (r2 == r0) goto L5c
            goto L0
        L41:
            mr3 r5 = r0.d()
        L45:
            sun.misc.Unsafe r0 = defpackage.ys5.a
            long r2 = defpackage.z12.f0
            r1 = r9
            boolean r2 = r0.compareAndSwapObject(r1, r2, r4, r5)
            if (r2 == 0) goto L51
            goto L0
        L51:
            java.lang.Object r0 = r0.getObjectVolatile(r9, r6)
            if (r0 == r4) goto L45
            goto L0
        L58:
            an1 r0 = defpackage.a22.b
            if (r4 != r0) goto L5e
        L5c:
            r0 = 0
            return r0
        L5e:
            mr3 r5 = new mr3
            r0 = 8
            r5.<init>(r0, r8)
            r0 = r4
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r5.a(r0)
            r5.a(r10)
        L6e:
            sun.misc.Unsafe r0 = defpackage.ys5.a
            long r2 = defpackage.z12.f0
            r1 = r9
            boolean r2 = r0.compareAndSwapObject(r1, r2, r4, r5)
            if (r2 == 0) goto L7a
        L79:
            return r8
        L7a:
            java.lang.Object r0 = r0.getObjectVolatile(r9, r6)
            if (r0 == r4) goto L6e
            goto L0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z12.w0(java.lang.Runnable):boolean");
    }

    public final long x0() {
        long j;
        x12 x12Var;
        xt xtVar = this.X;
        if (xtVar == null || xtVar.isEmpty()) {
            j = Long.MAX_VALUE;
        } else {
            j = 0;
        }
        if (j != 0) {
            Z.getClass();
            Unsafe unsafe = ys5.a;
            Object objectVolatile = unsafe.getObjectVolatile(this, f0);
            if (objectVolatile != null) {
                if (objectVolatile instanceof mr3) {
                    long j2 = mr3.f.get((mr3) objectVolatile);
                    if (((int) (1073741823 & j2)) != ((int) ((j2 & 1152921503533105152L) >> 30))) {
                        return 0L;
                    }
                } else if (objectVolatile == a22.b) {
                    return Long.MAX_VALUE;
                }
            }
            c0.getClass();
            y12 y12Var = (y12) unsafe.getObjectVolatile(this, e0);
            if (y12Var != null) {
                synchronized (y12Var) {
                    x12[] x12VarArr = y12Var.a;
                    if (x12VarArr != null) {
                        x12Var = x12VarArr[0];
                    } else {
                        x12Var = null;
                    }
                }
                if (x12Var != null) {
                    long nanoTime = x12Var.A - System.nanoTime();
                    if (nanoTime >= 0) {
                        return nanoTime;
                    }
                }
            }
            return Long.MAX_VALUE;
        }
        return 0L;
    }

    public abstract Thread y0();

    public final boolean z0() {
        boolean z;
        xt xtVar = this.X;
        if (xtVar != null) {
            z = xtVar.isEmpty();
        } else {
            z = true;
        }
        if (z) {
            c0.getClass();
            Unsafe unsafe = ys5.a;
            y12 y12Var = (y12) unsafe.getObjectVolatile(this, e0);
            if (y12Var != null && ys6.b.get(y12Var) != 0) {
                return false;
            }
            Z.getClass();
            Object objectVolatile = unsafe.getObjectVolatile(this, f0);
            if (objectVolatile != null) {
                if (objectVolatile instanceof mr3) {
                    long j = mr3.f.get((mr3) objectVolatile);
                    if (((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30))) {
                        return true;
                    }
                    return false;
                } else if (objectVolatile == a22.b) {
                }
            }
            return true;
        }
        return false;
    }
}
