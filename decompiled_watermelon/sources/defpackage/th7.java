package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: th7  reason: default package */
/* loaded from: classes.dex */
public final class th7 {
    public final AtomicReferenceArray a = new AtomicReferenceArray(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(th7.class, Object.class, "lastScheduledTask$volatile");
    public static final /* synthetic */ long f = ys5.a.objectFieldOffset(th7.class.getDeclaredField("lastScheduledTask$volatile"));
    public static final /* synthetic */ AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(th7.class, "producerIndex$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater d = AtomicIntegerFieldUpdater.newUpdater(th7.class, "consumerIndex$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater e = AtomicIntegerFieldUpdater.newUpdater(th7.class, "blockingTasksInBuffer$volatile");

    public final cn6 a(cn6 cn6Var, boolean z) {
        if (z) {
            return b(cn6Var);
        }
        b.getClass();
        cn6 cn6Var2 = (cn6) ys5.a.getAndSetObject(this, f, cn6Var);
        if (cn6Var2 == null) {
            return null;
        }
        return b(cn6Var2);
    }

    public final cn6 b(cn6 cn6Var) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = c;
        if (atomicIntegerFieldUpdater.get(this) - d.get(this) == 127) {
            return cn6Var;
        }
        if (cn6Var.B) {
            e.incrementAndGet(this);
        }
        int i = atomicIntegerFieldUpdater.get(this) & 127;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.a;
            if (atomicReferenceArray.get(i) != null) {
                Thread.yield();
            } else {
                atomicReferenceArray.lazySet(i, cn6Var);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
        }
    }

    public final int c() {
        b.getClass();
        Object objectVolatile = ys5.a.getObjectVolatile(this, f);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = d;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = c;
        if (objectVolatile != null) {
            return (atomicIntegerFieldUpdater2.get(this) - atomicIntegerFieldUpdater.get(this)) + 1;
        }
        return atomicIntegerFieldUpdater2.get(this) - atomicIntegerFieldUpdater.get(this);
    }

    public final void d(gm2 gm2Var) {
        b.getClass();
        cn6 cn6Var = (cn6) ys5.a.getAndSetObject(this, f, (Object) null);
        if (cn6Var != null) {
            gm2Var.a(cn6Var);
        }
        while (true) {
            cn6 f2 = f();
            if (f2 == null) {
                return;
            }
            gm2Var.a(f2);
        }
    }

    public final cn6 e() {
        b.getClass();
        cn6 cn6Var = (cn6) ys5.a.getAndSetObject(this, f, (Object) null);
        if (cn6Var == null) {
            return f();
        }
        return cn6Var;
    }

    public final cn6 f() {
        cn6 cn6Var;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = d;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i - c.get(this) == 0) {
                return null;
            }
            int i2 = i & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1) && (cn6Var = (cn6) this.a.getAndSet(i2, null)) != null) {
                if (cn6Var.B) {
                    e.decrementAndGet(this);
                }
                return cn6Var;
            }
        }
    }

    public final cn6 g() {
        th7 th7Var;
        while (true) {
            b.getClass();
            Unsafe unsafe = ys5.a;
            long j = f;
            cn6 cn6Var = (cn6) unsafe.getObjectVolatile(this, j);
            if (cn6Var != null && cn6Var.B) {
                while (true) {
                    Unsafe unsafe2 = ys5.a;
                    th7Var = this;
                    if (unsafe2.compareAndSwapObject(th7Var, f, cn6Var, (Object) null)) {
                        return cn6Var;
                    }
                    if (unsafe2.getObjectVolatile(th7Var, j) != cn6Var) {
                        break;
                    }
                    this = th7Var;
                }
            }
            this = th7Var;
        }
        th7 th7Var2 = this;
        int i = d.get(th7Var2);
        int i2 = c.get(th7Var2);
        while (i != i2 && e.get(th7Var2) != 0) {
            i2--;
            cn6 h = th7Var2.h(i2, true);
            if (h != null) {
                return h;
            }
        }
        return null;
    }

    public final cn6 h(int i, boolean z) {
        int i2 = i & 127;
        AtomicReferenceArray atomicReferenceArray = this.a;
        cn6 cn6Var = (cn6) atomicReferenceArray.get(i2);
        if (cn6Var == null || cn6Var.B != z) {
            return null;
        }
        while (!atomicReferenceArray.compareAndSet(i2, cn6Var, null)) {
            if (atomicReferenceArray.get(i2) != cn6Var) {
                return null;
            }
        }
        if (z) {
            e.decrementAndGet(this);
        }
        return cn6Var;
    }

    public final long i(int i, n75 n75Var) {
        int i2;
        th7 th7Var;
        while (true) {
            b.getClass();
            Unsafe unsafe = ys5.a;
            long j = f;
            cn6 cn6Var = (cn6) unsafe.getObjectVolatile(this, j);
            if (cn6Var != null) {
                if (cn6Var.B) {
                    i2 = 1;
                } else {
                    i2 = 2;
                }
                if ((i2 & i) == 0) {
                    return -2L;
                }
                hn6.f.getClass();
                long nanoTime = System.nanoTime() - cn6Var.A;
                long j2 = hn6.b;
                if (nanoTime < j2) {
                    return j2 - nanoTime;
                }
                while (true) {
                    Unsafe unsafe2 = ys5.a;
                    th7Var = this;
                    if (unsafe2.compareAndSwapObject(th7Var, f, cn6Var, (Object) null)) {
                        n75Var.A = cn6Var;
                        return -1L;
                    } else if (unsafe2.getObjectVolatile(th7Var, j) != cn6Var) {
                        break;
                    } else {
                        this = th7Var;
                    }
                }
            } else {
                return -2L;
            }
            this = th7Var;
        }
    }
}
