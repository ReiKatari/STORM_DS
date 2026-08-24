package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import sun.misc.Unsafe;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: q62  reason: default package */
/* loaded from: classes.dex */
public abstract class q62 extends l62 implements ug1 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater Z = AtomicReferenceFieldUpdater.newUpdater(q62.class, Object.class, "_queue$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater d0;
    public static final /* synthetic */ AtomicIntegerFieldUpdater e0;
    public static final /* synthetic */ long f0;
    public static final /* synthetic */ long g0;
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile;
    private volatile /* synthetic */ Object _queue$volatile;

    static {
        Unsafe unsafe = v36.a;
        g0 = unsafe.objectFieldOffset(q62.class.getDeclaredField("_queue$volatile"));
        d0 = AtomicReferenceFieldUpdater.newUpdater(q62.class, Object.class, "_delayed$volatile");
        f0 = unsafe.objectFieldOffset(q62.class.getDeclaredField("_delayed$volatile"));
        e0 = AtomicIntegerFieldUpdater.newUpdater(q62.class, "_isCompleted$volatile");
    }

    @Override // defpackage.ug1
    public il1 A(long j, Runnable runnable, l61 l61Var) {
        return td1.a.A(j, runnable, l61Var);
    }

    public void A0(long j, o62 o62Var) {
        sd1.h0.D0(j, o62Var);
    }

    public final void B0() {
        o62 o62Var;
        long nanoTime = System.nanoTime();
        while (true) {
            d0.getClass();
            p62 p62Var = (p62) v36.a.getObjectVolatile(this, f0);
            if (p62Var != null) {
                synchronized (p62Var) {
                    if (p57.b.get(p62Var) > 0) {
                        o62Var = p62Var.b(0);
                    } else {
                        o62Var = null;
                    }
                }
                if (o62Var != null) {
                    A0(nanoTime, o62Var);
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
        Unsafe unsafe = v36.a;
        unsafe.putObjectVolatile(this, g0, (Object) null);
        d0.getClass();
        unsafe.putObjectVolatile(this, f0, (Object) null);
    }

    public final void D0(long j, o62 o62Var) {
        Thread y0;
        int E0 = E0(j, o62Var);
        if (E0 != 0) {
            if (E0 != 1) {
                if (E0 != 2) {
                    i.m("unexpected result");
                    return;
                }
                return;
            }
            A0(j, o62Var);
        } else if (F0(o62Var) && Thread.currentThread() != (y0 = y0())) {
            LockSupport.unpark(y0);
        }
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, p62] */
    public final int E0(long j, o62 o62Var) {
        q62 q62Var;
        Unsafe unsafe;
        if (e0.get(this) == 1) {
            return 1;
        }
        d0.getClass();
        Unsafe unsafe2 = v36.a;
        long j2 = f0;
        p62 p62Var = (p62) unsafe2.getObjectVolatile(this, j2);
        if (p62Var == null) {
            ?? obj = new Object();
            obj.c = j;
            while (true) {
                unsafe = v36.a;
                q62Var = this;
                if (!unsafe.compareAndSwapObject(q62Var, f0, (Object) null, (Object) obj) && unsafe.getObjectVolatile(q62Var, j2) == null) {
                    this = q62Var;
                }
            }
            Object objectVolatile = unsafe.getObjectVolatile(q62Var, j2);
            objectVolatile.getClass();
            p62Var = (p62) objectVolatile;
        } else {
            q62Var = this;
        }
        return o62Var.b(j, p62Var, q62Var);
    }

    public final boolean F0(o62 o62Var) {
        d0.getClass();
        p62 p62Var = (p62) v36.a.getObjectVolatile(this, f0);
        o62 o62Var2 = null;
        if (p62Var != null) {
            synchronized (p62Var) {
                o62[] o62VarArr = p62Var.a;
                if (o62VarArr != null) {
                    o62Var2 = o62VarArr[0];
                }
            }
        }
        if (o62Var2 != o62Var) {
            return false;
        }
        return true;
    }

    @Override // defpackage.ug1
    public final void J(long j, rj0 rj0Var) {
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
            m62 m62Var = new m62(this, j2 + nanoTime, rj0Var);
            D0(nanoTime, m62Var);
            rj0Var.A(new kj0(m62Var, 2));
        }
    }

    @Override // defpackage.n61
    public final void j0(l61 l61Var, Runnable runnable) {
        u0(runnable);
    }

    @Override // defpackage.l62
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
        q62 q62Var;
        Unsafe unsafe;
        while (true) {
            Z.getClass();
            Unsafe unsafe2 = v36.a;
            long j = g0;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            gr1 gr1Var = r62.b;
            if (objectVolatile == null) {
                while (true) {
                    Unsafe unsafe3 = v36.a;
                    q62 q62Var2 = this;
                    q62Var = q62Var2;
                    if (!unsafe3.compareAndSwapObject(q62Var2, g0, (Object) null, gr1Var)) {
                        if (unsafe3.getObjectVolatile(q62Var, j) != null) {
                            break;
                        }
                        this = q62Var;
                    } else {
                        return;
                    }
                }
            } else {
                q62Var = this;
                if (objectVolatile instanceof ny3) {
                    ((ny3) objectVolatile).c();
                    return;
                } else if (objectVolatile != gr1Var) {
                    ny3 ny3Var = new ny3(8, true);
                    ny3Var.a((Runnable) objectVolatile);
                    do {
                        unsafe = v36.a;
                        if (unsafe.compareAndSwapObject(q62Var, g0, objectVolatile, ny3Var)) {
                            return;
                        }
                    } while (unsafe.getObjectVolatile(q62Var, j) == objectVolatile);
                } else {
                    return;
                }
            }
            this = q62Var;
        }
    }

    @Override // defpackage.l62
    public void shutdown() {
        m57.a.set(null);
        e0.set(this, 1);
        s0();
        do {
        } while (q0() <= 0);
        B0();
    }

    public final Runnable t0() {
        q62 q62Var;
        Unsafe unsafe;
        while (true) {
            Z.getClass();
            Unsafe unsafe2 = v36.a;
            long j = g0;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            if (objectVolatile != null) {
                if (objectVolatile instanceof ny3) {
                    ny3 ny3Var = (ny3) objectVolatile;
                    Object e = ny3Var.e();
                    if (e != ny3.g) {
                        return (Runnable) e;
                    }
                    ny3 d = ny3Var.d();
                    while (true) {
                        Unsafe unsafe3 = v36.a;
                        q62Var = this;
                        if (!unsafe3.compareAndSwapObject(q62Var, g0, objectVolatile, d) && unsafe3.getObjectVolatile(q62Var, j) == objectVolatile) {
                            this = q62Var;
                        }
                    }
                } else {
                    q62Var = this;
                    if (objectVolatile == r62.b) {
                        return null;
                    }
                    do {
                        unsafe = v36.a;
                        if (unsafe.compareAndSwapObject(q62Var, g0, objectVolatile, (Object) null)) {
                            return (Runnable) objectVolatile;
                        }
                    } while (unsafe.getObjectVolatile(q62Var, j) == objectVolatile);
                }
                this = q62Var;
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
        sd1.h0.u0(runnable);
    }

    public final void v0() {
        o62 o62Var;
        o62 o62Var2;
        boolean z;
        d0.getClass();
        p62 p62Var = (p62) v36.a.getObjectVolatile(this, f0);
        if (p62Var == null || p57.b.get(p62Var) == 0) {
            return;
        }
        long nanoTime = System.nanoTime();
        do {
            synchronized (p62Var) {
                try {
                    o62[] o62VarArr = p62Var.a;
                    o62Var = null;
                    if (o62VarArr != null) {
                        o62Var2 = o62VarArr[0];
                    } else {
                        o62Var2 = null;
                    }
                    if (o62Var2 == null) {
                        continue;
                    } else {
                        if (nanoTime - o62Var2.A >= 0) {
                            z = w0(o62Var2);
                        } else {
                            z = false;
                        }
                        if (z) {
                            o62Var = p62Var.b(0);
                        }
                        continue;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (o62Var != null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0079, code lost:
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean w0(Runnable runnable) {
        Unsafe unsafe;
        Unsafe unsafe2;
        Unsafe unsafe3;
        loop0: while (true) {
            Z.getClass();
            Unsafe unsafe4 = v36.a;
            long j = g0;
            Object objectVolatile = unsafe4.getObjectVolatile(this, j);
            if (e0.get(this) != 1) {
                if (objectVolatile == null) {
                    do {
                        unsafe = v36.a;
                        if (unsafe.compareAndSwapObject(this, g0, (Object) null, runnable)) {
                            break loop0;
                        }
                    } while (unsafe.getObjectVolatile(this, j) == null);
                } else if (objectVolatile instanceof ny3) {
                    ny3 ny3Var = (ny3) objectVolatile;
                    int a = ny3Var.a(runnable);
                    if (a == 0) {
                        break;
                    } else if (a != 1) {
                        if (a == 2) {
                            return false;
                        }
                    } else {
                        ny3 d = ny3Var.d();
                        do {
                            unsafe2 = v36.a;
                            if (unsafe2.compareAndSwapObject(this, g0, objectVolatile, d)) {
                                break;
                            }
                        } while (unsafe2.getObjectVolatile(this, j) == objectVolatile);
                    }
                } else if (objectVolatile == r62.b) {
                    return false;
                } else {
                    ny3 ny3Var2 = new ny3(8, true);
                    ny3Var2.a((Runnable) objectVolatile);
                    ny3Var2.a(runnable);
                    do {
                        unsafe3 = v36.a;
                        if (unsafe3.compareAndSwapObject(this, g0, objectVolatile, ny3Var2)) {
                            break loop0;
                        }
                    } while (unsafe3.getObjectVolatile(this, j) == objectVolatile);
                }
            } else {
                return false;
            }
        }
    }

    public final long x0() {
        long j;
        o62 o62Var;
        pu puVar = this.X;
        if (puVar == null || puVar.isEmpty()) {
            j = Long.MAX_VALUE;
        } else {
            j = 0;
        }
        if (j != 0) {
            Z.getClass();
            Unsafe unsafe = v36.a;
            Object objectVolatile = unsafe.getObjectVolatile(this, g0);
            if (objectVolatile != null) {
                if (objectVolatile instanceof ny3) {
                    long j2 = ny3.f.get((ny3) objectVolatile);
                    if (((int) (1073741823 & j2)) != ((int) ((j2 & 1152921503533105152L) >> 30))) {
                        return 0L;
                    }
                } else if (objectVolatile == r62.b) {
                    return Long.MAX_VALUE;
                }
            }
            d0.getClass();
            p62 p62Var = (p62) unsafe.getObjectVolatile(this, f0);
            if (p62Var != null) {
                synchronized (p62Var) {
                    o62[] o62VarArr = p62Var.a;
                    if (o62VarArr != null) {
                        o62Var = o62VarArr[0];
                    } else {
                        o62Var = null;
                    }
                }
                if (o62Var != null) {
                    long nanoTime = o62Var.A - System.nanoTime();
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
        pu puVar = this.X;
        if (puVar != null) {
            z = puVar.isEmpty();
        } else {
            z = true;
        }
        if (z) {
            d0.getClass();
            Unsafe unsafe = v36.a;
            p62 p62Var = (p62) unsafe.getObjectVolatile(this, f0);
            if (p62Var != null && p57.b.get(p62Var) != 0) {
                return false;
            }
            Z.getClass();
            Object objectVolatile = unsafe.getObjectVolatile(this, g0);
            if (objectVolatile != null) {
                if (objectVolatile instanceof ny3) {
                    long j = ny3.f.get((ny3) objectVolatile);
                    if (((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30))) {
                        return true;
                    }
                    return false;
                } else if (objectVolatile == r62.b) {
                }
            }
            return true;
        }
        return false;
    }
}
