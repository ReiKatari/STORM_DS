package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: vz5  reason: default package */
/* loaded from: classes.dex */
public class vz5 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater L = AtomicReferenceFieldUpdater.newUpdater(vz5.class, Object.class, "head$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater R;
    public static final /* synthetic */ AtomicReferenceFieldUpdater X;
    public static final /* synthetic */ AtomicLongFieldUpdater Y;
    public static final /* synthetic */ AtomicIntegerFieldUpdater Z;
    public static final /* synthetic */ long c0;
    public static final /* synthetic */ long d0;
    public final int A;
    public final km4 B;
    private volatile /* synthetic */ int _availablePermits$volatile;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    static {
        Unsafe unsafe = ys5.a;
        c0 = unsafe.objectFieldOffset(vz5.class.getDeclaredField("head$volatile"));
        R = AtomicLongFieldUpdater.newUpdater(vz5.class, "deqIdx$volatile");
        X = AtomicReferenceFieldUpdater.newUpdater(vz5.class, Object.class, "tail$volatile");
        d0 = unsafe.objectFieldOffset(vz5.class.getDeclaredField("tail$volatile"));
        Y = AtomicLongFieldUpdater.newUpdater(vz5.class, "enqIdx$volatile");
        Z = AtomicIntegerFieldUpdater.newUpdater(vz5.class, "_availablePermits$volatile");
    }

    public vz5(int i) {
        this.A = i;
        if (i > 0) {
            if (i >= 0) {
                yz5 yz5Var = new yz5(0L, null, 2);
                this.head$volatile = yz5Var;
                this.tail$volatile = yz5Var;
                this._availablePermits$volatile = i;
                this.B = new km4(12, this);
                return;
            }
            i.g(wh1.g(i, "The number of acquired permits should be in 0.."));
            throw null;
        }
        i.g(wh1.g(i, "Semaphore should have at least 1 permit, but had "));
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
        r5.l(r3, r4.B);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.k11 r5) {
        /*
            r4 = this;
        L0:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = defpackage.vz5.Z
            int r1 = r0.getAndDecrement(r4)
            int r2 = r4.A
            if (r1 > r2) goto L0
            o27 r3 = defpackage.o27.a
            if (r1 <= 0) goto Lf
            goto L3e
        Lf:
            j11 r5 = defpackage.nk2.J(r5)
            ih0 r5 = defpackage.b53.O(r5)
            boolean r1 = r4.b(r5)     // Catch: java.lang.Throwable -> L3f
            if (r1 != 0) goto L31
        L1d:
            int r1 = r0.getAndDecrement(r4)     // Catch: java.lang.Throwable -> L3f
            if (r1 > r2) goto L1d
            if (r1 <= 0) goto L2b
            km4 r4 = r4.B     // Catch: java.lang.Throwable -> L3f
            r5.l(r3, r4)     // Catch: java.lang.Throwable -> L3f
            goto L31
        L2b:
            boolean r1 = r4.b(r5)     // Catch: java.lang.Throwable -> L3f
            if (r1 == 0) goto L1d
        L31:
            java.lang.Object r4 = r5.v()
            p31 r5 = defpackage.p31.COROUTINE_SUSPENDED
            if (r4 != r5) goto L3a
            goto L3b
        L3a:
            r4 = r3
        L3b:
            if (r4 != r5) goto L3e
            return r4
        L3e:
            return r3
        L3f:
            r4 = move-exception
            r5.E()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vz5.a(k11):java.lang.Object");
    }

    public final boolean b(fd7 fd7Var) {
        Object a;
        Unsafe unsafe;
        vz5 vz5Var = this;
        X.getClass();
        Unsafe unsafe2 = ys5.a;
        long j = d0;
        yz5 yz5Var = (yz5) unsafe2.getObjectVolatile(vz5Var, j);
        long andIncrement = Y.getAndIncrement(vz5Var);
        tz5 tz5Var = tz5.c0;
        long j2 = andIncrement / xz5.f;
        loop0: while (true) {
            a = yv0.a(yz5Var, j2, tz5Var);
            if (hi2.E(a)) {
                break;
            }
            dy5 z = hi2.z(a);
            while (true) {
                dy5 dy5Var = (dy5) ys5.a.getObjectVolatile(vz5Var, j);
                if (dy5Var.X >= z.X) {
                    vz5Var = this;
                    break loop0;
                } else if (!z.o()) {
                    break;
                } else {
                    do {
                        unsafe = ys5.a;
                        vz5Var = this;
                        if (unsafe.compareAndSwapObject(vz5Var, d0, dy5Var, z)) {
                            if (dy5Var.k()) {
                                dy5Var.i();
                            }
                        }
                    } while (unsafe.getObjectVolatile(vz5Var, j) == dy5Var);
                    if (z.k()) {
                        z.i();
                    }
                }
            }
            vz5Var = this;
        }
        yz5 yz5Var2 = (yz5) hi2.z(a);
        AtomicReferenceArray atomicReferenceArray = yz5Var2.Z;
        int i = (int) (andIncrement % xz5.f);
        while (!atomicReferenceArray.compareAndSet(i, null, fd7Var)) {
            if (atomicReferenceArray.get(i) != null) {
                an1 an1Var = xz5.b;
                an1 an1Var2 = xz5.c;
                while (!atomicReferenceArray.compareAndSet(i, an1Var, an1Var2)) {
                    if (atomicReferenceArray.get(i) != an1Var) {
                        return false;
                    }
                }
                ((hh0) fd7Var).l(o27.a, vz5Var.B);
                return true;
            }
        }
        fd7Var.b(yz5Var2, i);
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
                c44.d(i2, "The number of released permits cannot be greater than ");
                return;
            }
        } while (!e());
    }

    public final boolean e() {
        Object a;
        Unsafe unsafe;
        L.getClass();
        Unsafe unsafe2 = ys5.a;
        long j = c0;
        yz5 yz5Var = (yz5) unsafe2.getObjectVolatile(this, j);
        long andIncrement = R.getAndIncrement(this);
        long j2 = andIncrement / xz5.f;
        uz5 uz5Var = uz5.c0;
        loop0: while (true) {
            a = yv0.a(yz5Var, j2, uz5Var);
            if (hi2.E(a)) {
                break;
            }
            dy5 z = hi2.z(a);
            while (true) {
                dy5 dy5Var = (dy5) ys5.a.getObjectVolatile(this, j);
                if (dy5Var.X >= z.X) {
                    break loop0;
                } else if (!z.o()) {
                    break;
                } else {
                    do {
                        unsafe = ys5.a;
                        if (unsafe.compareAndSwapObject(this, c0, dy5Var, z)) {
                            if (dy5Var.k()) {
                                dy5Var.i();
                            }
                        }
                    } while (unsafe.getObjectVolatile(this, j) == dy5Var);
                    if (z.k()) {
                        z.i();
                    }
                }
            }
        }
        yz5 yz5Var2 = (yz5) hi2.z(a);
        AtomicReferenceArray atomicReferenceArray = yz5Var2.Z;
        yz5Var2.b();
        boolean z2 = false;
        if (yz5Var2.X <= j2) {
            int i = (int) (andIncrement % xz5.f);
            Object andSet = atomicReferenceArray.getAndSet(i, xz5.b);
            if (andSet == null) {
                int i2 = xz5.a;
                for (int i3 = 0; i3 < i2; i3++) {
                    if (atomicReferenceArray.get(i) == xz5.c) {
                        return true;
                    }
                }
                an1 an1Var = xz5.b;
                an1 an1Var2 = xz5.d;
                while (true) {
                    if (atomicReferenceArray.compareAndSet(i, an1Var, an1Var2)) {
                        z2 = true;
                        break;
                    } else if (atomicReferenceArray.get(i) != an1Var) {
                        break;
                    }
                }
                return !z2;
            } else if (andSet != xz5.e) {
                boolean z3 = andSet instanceof hh0;
                o27 o27Var = o27.a;
                if (z3) {
                    hh0 hh0Var = (hh0) andSet;
                    an1 m = hh0Var.m(o27Var, this.B);
                    if (m != null) {
                        hh0Var.s(m);
                        return true;
                    }
                } else if (andSet instanceof jy5) {
                    return ((jy5) andSet).k(this, o27Var);
                } else {
                    f81.p(andSet, "unexpected: ");
                    return false;
                }
            }
        }
        return false;
    }
}
