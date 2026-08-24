package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uw7  reason: default package */
/* loaded from: classes.dex */
public final class uw7 {
    public final AtomicReferenceArray a = new AtomicReferenceArray(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(uw7.class, Object.class, "lastScheduledTask$volatile");
    public static final /* synthetic */ long f = v36.a.objectFieldOffset(uw7.class.getDeclaredField("lastScheduledTask$volatile"));
    public static final /* synthetic */ AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(uw7.class, "producerIndex$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater d = AtomicIntegerFieldUpdater.newUpdater(uw7.class, "consumerIndex$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater e = AtomicIntegerFieldUpdater.newUpdater(uw7.class, "blockingTasksInBuffer$volatile");

    public final mz6 a(mz6 mz6Var, boolean z) {
        if (z) {
            return b(mz6Var);
        }
        b.getClass();
        mz6 mz6Var2 = (mz6) v36.a.getAndSetObject(this, f, mz6Var);
        if (mz6Var2 == null) {
            return null;
        }
        return b(mz6Var2);
    }

    public final mz6 b(mz6 mz6Var) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = c;
        if (atomicIntegerFieldUpdater.get(this) - d.get(this) == 127) {
            return mz6Var;
        }
        if (mz6Var.B) {
            e.incrementAndGet(this);
        }
        int i = atomicIntegerFieldUpdater.get(this) & 127;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.a;
            if (atomicReferenceArray.get(i) != null) {
                Thread.yield();
            } else {
                atomicReferenceArray.lazySet(i, mz6Var);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
        }
    }

    public final int c() {
        b.getClass();
        Object objectVolatile = v36.a.getObjectVolatile(this, f);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = d;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = c;
        if (objectVolatile != null) {
            return (atomicIntegerFieldUpdater2.get(this) - atomicIntegerFieldUpdater.get(this)) + 1;
        }
        return atomicIntegerFieldUpdater2.get(this) - atomicIntegerFieldUpdater.get(this);
    }

    public final void d(ls2 ls2Var) {
        b.getClass();
        mz6 mz6Var = (mz6) v36.a.getAndSetObject(this, f, (Object) null);
        if (mz6Var != null) {
            ls2Var.a(mz6Var);
        }
        while (true) {
            mz6 f2 = f();
            if (f2 == null) {
                return;
            }
            ls2Var.a(f2);
        }
    }

    public final mz6 e() {
        b.getClass();
        mz6 mz6Var = (mz6) v36.a.getAndSetObject(this, f, (Object) null);
        if (mz6Var == null) {
            return f();
        }
        return mz6Var;
    }

    public final mz6 f() {
        mz6 mz6Var;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = d;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i - c.get(this) == 0) {
                return null;
            }
            int i2 = i & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1) && (mz6Var = (mz6) this.a.getAndSet(i2, null)) != null) {
                if (mz6Var.B) {
                    e.decrementAndGet(this);
                }
                return mz6Var;
            }
        }
    }

    public final mz6 g() {
        uw7 uw7Var;
        while (true) {
            b.getClass();
            Unsafe unsafe = v36.a;
            long j = f;
            mz6 mz6Var = (mz6) unsafe.getObjectVolatile(this, j);
            if (mz6Var != null && mz6Var.B) {
                while (true) {
                    Unsafe unsafe2 = v36.a;
                    uw7Var = this;
                    if (unsafe2.compareAndSwapObject(uw7Var, f, mz6Var, (Object) null)) {
                        return mz6Var;
                    }
                    if (unsafe2.getObjectVolatile(uw7Var, j) != mz6Var) {
                        break;
                    }
                    this = uw7Var;
                }
            }
            this = uw7Var;
        }
        uw7 uw7Var2 = this;
        int i = d.get(uw7Var2);
        int i2 = c.get(uw7Var2);
        while (i != i2 && e.get(uw7Var2) != 0) {
            i2--;
            mz6 h = uw7Var2.h(i2, true);
            if (h != null) {
                return h;
            }
        }
        return null;
    }

    public final mz6 h(int i, boolean z) {
        int i2 = i & 127;
        AtomicReferenceArray atomicReferenceArray = this.a;
        mz6 mz6Var = (mz6) atomicReferenceArray.get(i2);
        if (mz6Var == null || mz6Var.B != z) {
            return null;
        }
        while (!atomicReferenceArray.compareAndSet(i2, mz6Var, null)) {
            if (atomicReferenceArray.get(i2) != mz6Var) {
                return null;
            }
        }
        if (z) {
            e.decrementAndGet(this);
        }
        return mz6Var;
    }

    public final long i(int i, dh5 dh5Var) {
        int i2;
        uw7 uw7Var;
        while (true) {
            b.getClass();
            Unsafe unsafe = v36.a;
            long j = f;
            mz6 mz6Var = (mz6) unsafe.getObjectVolatile(this, j);
            if (mz6Var != null) {
                if (mz6Var.B) {
                    i2 = 1;
                } else {
                    i2 = 2;
                }
                if ((i2 & i) == 0) {
                    return -2L;
                }
                sz6.f.getClass();
                long nanoTime = System.nanoTime() - mz6Var.A;
                long j2 = sz6.b;
                if (nanoTime < j2) {
                    return j2 - nanoTime;
                }
                while (true) {
                    Unsafe unsafe2 = v36.a;
                    uw7Var = this;
                    if (unsafe2.compareAndSwapObject(uw7Var, f, mz6Var, (Object) null)) {
                        dh5Var.A = mz6Var;
                        return -1L;
                    } else if (unsafe2.getObjectVolatile(uw7Var, j) != mz6Var) {
                        break;
                    } else {
                        this = uw7Var;
                    }
                }
            } else {
                return -2L;
            }
            this = uw7Var;
        }
    }
}
