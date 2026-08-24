package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kb6  reason: default package */
/* loaded from: classes.dex */
public class kb6 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater L = AtomicReferenceFieldUpdater.newUpdater(kb6.class, Object.class, "head$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater R;
    public static final /* synthetic */ AtomicReferenceFieldUpdater X;
    public static final /* synthetic */ AtomicLongFieldUpdater Y;
    public static final /* synthetic */ AtomicIntegerFieldUpdater Z;
    public static final /* synthetic */ long d0;
    public static final /* synthetic */ long e0;
    public final int A;
    public final ov4 B;
    private volatile /* synthetic */ int _availablePermits$volatile;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    static {
        Unsafe unsafe = v36.a;
        d0 = unsafe.objectFieldOffset(kb6.class.getDeclaredField("head$volatile"));
        R = AtomicLongFieldUpdater.newUpdater(kb6.class, "deqIdx$volatile");
        X = AtomicReferenceFieldUpdater.newUpdater(kb6.class, Object.class, "tail$volatile");
        e0 = unsafe.objectFieldOffset(kb6.class.getDeclaredField("tail$volatile"));
        Y = AtomicLongFieldUpdater.newUpdater(kb6.class, "enqIdx$volatile");
        Z = AtomicIntegerFieldUpdater.newUpdater(kb6.class, "_availablePermits$volatile");
    }

    public kb6(int i) {
        this.A = i;
        if (i > 0) {
            if (i >= 0) {
                nb6 nb6Var = new nb6(0L, null, 2);
                this.head$volatile = nb6Var;
                this.tail$volatile = nb6Var;
                this._availablePermits$volatile = i;
                this.B = new ov4(this, 13);
                return;
            }
            i.f(lb1.g(i, "The number of acquired permits should be in 0.."));
            throw null;
        }
        i.f(lb1.g(i, "Semaphore should have at least 1 permit, but had "));
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
        r5.t(r3, r4.B);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(s41 s41Var) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int andDecrement;
        int i;
        do {
            atomicIntegerFieldUpdater = Z;
            andDecrement = atomicIntegerFieldUpdater.getAndDecrement(this);
            i = this.A;
        } while (andDecrement > i);
        jg7 jg7Var = jg7.a;
        if (andDecrement <= 0) {
            rj0 C = n16.C(np2.V(s41Var));
            try {
                if (!b(C)) {
                    while (true) {
                        int andDecrement2 = atomicIntegerFieldUpdater.getAndDecrement(this);
                        if (andDecrement2 <= i) {
                            if (andDecrement2 > 0) {
                                break;
                            } else if (b(C)) {
                                break;
                            }
                        }
                    }
                }
                Object s = C.s();
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                if (s != x61Var) {
                    s = jg7Var;
                }
                if (s == x61Var) {
                    return s;
                }
            } catch (Throwable th) {
                C.E();
                throw th;
            }
        }
        return jg7Var;
    }

    public final boolean b(zr7 zr7Var) {
        Object a;
        Unsafe unsafe;
        kb6 kb6Var = this;
        X.getClass();
        Unsafe unsafe2 = v36.a;
        long j = e0;
        nb6 nb6Var = (nb6) unsafe2.getObjectVolatile(kb6Var, j);
        long andIncrement = Y.getAndIncrement(kb6Var);
        ib6 ib6Var = ib6.d0;
        long j2 = andIncrement / mb6.f;
        loop0: while (true) {
            a = uy0.a(nb6Var, j2, ib6Var);
            if (oi2.J(a)) {
                break;
            }
            p96 B = oi2.B(a);
            while (true) {
                p96 p96Var = (p96) v36.a.getObjectVolatile(kb6Var, j);
                if (p96Var.X >= B.X) {
                    kb6Var = this;
                    break loop0;
                } else if (!B.o()) {
                    break;
                } else {
                    do {
                        unsafe = v36.a;
                        kb6Var = this;
                        if (unsafe.compareAndSwapObject(kb6Var, e0, p96Var, B)) {
                            if (p96Var.k()) {
                                p96Var.i();
                            }
                        }
                    } while (unsafe.getObjectVolatile(kb6Var, j) == p96Var);
                    if (B.k()) {
                        B.i();
                    }
                }
            }
            kb6Var = this;
        }
        nb6 nb6Var2 = (nb6) oi2.B(a);
        AtomicReferenceArray atomicReferenceArray = nb6Var2.Z;
        int i = (int) (andIncrement % mb6.f);
        while (!atomicReferenceArray.compareAndSet(i, null, zr7Var)) {
            if (atomicReferenceArray.get(i) != null) {
                gr1 gr1Var = mb6.b;
                gr1 gr1Var2 = mb6.c;
                while (!atomicReferenceArray.compareAndSet(i, gr1Var, gr1Var2)) {
                    if (atomicReferenceArray.get(i) != gr1Var) {
                        return false;
                    }
                }
                ((qj0) zr7Var).t(jg7.a, kb6Var.B);
                return true;
            }
        }
        zr7Var.a(nb6Var2, i);
        return true;
    }

    public final void c() {
        int i;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = Z;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            int i2 = this.A;
            if (andIncrement < i2) {
                if (andIncrement >= 0) {
                    return;
                }
            } else {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i <= i2) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i2));
                u34.e(i2, "The number of released permits cannot be greater than ");
                return;
            }
        } while (!d());
    }

    public final boolean d() {
        Object a;
        Unsafe unsafe;
        L.getClass();
        Unsafe unsafe2 = v36.a;
        long j = d0;
        nb6 nb6Var = (nb6) unsafe2.getObjectVolatile(this, j);
        long andIncrement = R.getAndIncrement(this);
        long j2 = andIncrement / mb6.f;
        jb6 jb6Var = jb6.d0;
        loop0: while (true) {
            a = uy0.a(nb6Var, j2, jb6Var);
            if (oi2.J(a)) {
                break;
            }
            p96 B = oi2.B(a);
            while (true) {
                p96 p96Var = (p96) v36.a.getObjectVolatile(this, j);
                if (p96Var.X >= B.X) {
                    break loop0;
                } else if (!B.o()) {
                    break;
                } else {
                    do {
                        unsafe = v36.a;
                        if (unsafe.compareAndSwapObject(this, d0, p96Var, B)) {
                            if (p96Var.k()) {
                                p96Var.i();
                            }
                        }
                    } while (unsafe.getObjectVolatile(this, j) == p96Var);
                    if (B.k()) {
                        B.i();
                    }
                }
            }
        }
        nb6 nb6Var2 = (nb6) oi2.B(a);
        AtomicReferenceArray atomicReferenceArray = nb6Var2.Z;
        nb6Var2.a();
        boolean z = false;
        if (nb6Var2.X <= j2) {
            int i = (int) (andIncrement % mb6.f);
            Object andSet = atomicReferenceArray.getAndSet(i, mb6.b);
            if (andSet == null) {
                int i2 = mb6.a;
                for (int i3 = 0; i3 < i2; i3++) {
                    if (atomicReferenceArray.get(i) == mb6.c) {
                        return true;
                    }
                }
                gr1 gr1Var = mb6.b;
                gr1 gr1Var2 = mb6.d;
                while (true) {
                    if (atomicReferenceArray.compareAndSet(i, gr1Var, gr1Var2)) {
                        z = true;
                        break;
                    } else if (atomicReferenceArray.get(i) != gr1Var) {
                        break;
                    }
                }
                return !z;
            } else if (andSet != mb6.e) {
                boolean z2 = andSet instanceof qj0;
                jg7 jg7Var = jg7.a;
                if (z2) {
                    qj0 qj0Var = (qj0) andSet;
                    gr1 j3 = qj0Var.j(jg7Var, this.B);
                    if (j3 != null) {
                        qj0Var.y(j3);
                        return true;
                    }
                } else if (andSet instanceof v96) {
                    return ((v96) andSet).k(this, jg7Var);
                } else {
                    e41.h(andSet, "unexpected: ");
                    return false;
                }
            }
        }
        return false;
    }
}
