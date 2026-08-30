package defpackage;

import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: q60  reason: default package */
/* loaded from: classes.dex */
public class q60 implements lj0 {
    public static final /* synthetic */ AtomicLongFieldUpdater R = AtomicLongFieldUpdater.newUpdater(q60.class, "sendersAndCloseStatus$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater X = AtomicLongFieldUpdater.newUpdater(q60.class, "receivers$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater Y = AtomicLongFieldUpdater.newUpdater(q60.class, "bufferEnd$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater Z = AtomicLongFieldUpdater.newUpdater(q60.class, "completedExpandBuffersAndPauseFlag$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater c0 = AtomicReferenceFieldUpdater.newUpdater(q60.class, Object.class, "sendSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater d0;
    public static final /* synthetic */ AtomicReferenceFieldUpdater e0;
    public static final /* synthetic */ AtomicReferenceFieldUpdater f0;
    public static final /* synthetic */ AtomicReferenceFieldUpdater g0;
    public static final /* synthetic */ long h0;
    public static final /* synthetic */ long i0;
    public static final /* synthetic */ long j0;
    public static final /* synthetic */ long k0;
    public static final /* synthetic */ long l0;
    public final int A;
    public final mi2 B;
    public final km4 L;
    private volatile /* synthetic */ Object _closeCause$volatile;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    static {
        Unsafe unsafe = ys5.a;
        l0 = unsafe.objectFieldOffset(q60.class.getDeclaredField("sendSegment$volatile"));
        d0 = AtomicReferenceFieldUpdater.newUpdater(q60.class, Object.class, "receiveSegment$volatile");
        k0 = unsafe.objectFieldOffset(q60.class.getDeclaredField("receiveSegment$volatile"));
        e0 = AtomicReferenceFieldUpdater.newUpdater(q60.class, Object.class, "bufferEndSegment$volatile");
        i0 = unsafe.objectFieldOffset(q60.class.getDeclaredField("bufferEndSegment$volatile"));
        f0 = AtomicReferenceFieldUpdater.newUpdater(q60.class, Object.class, "_closeCause$volatile");
        h0 = unsafe.objectFieldOffset(q60.class.getDeclaredField("_closeCause$volatile"));
        g0 = AtomicReferenceFieldUpdater.newUpdater(q60.class, Object.class, "closeHandler$volatile");
        j0 = unsafe.objectFieldOffset(q60.class.getDeclaredField("closeHandler$volatile"));
    }

    public q60(int i, mi2 mi2Var) {
        long j;
        this.A = i;
        this.B = mi2Var;
        if (i >= 0) {
            yj0 yj0Var = s60.a;
            if (i != 0) {
                if (i != Integer.MAX_VALUE) {
                    j = i;
                } else {
                    j = Long.MAX_VALUE;
                }
            } else {
                j = 0;
            }
            this.bufferEnd$volatile = j;
            this.completedExpandBuffersAndPauseFlag$volatile = Y.get(this);
            yj0 yj0Var2 = new yj0(0L, null, this, 3);
            this.sendSegment$volatile = yj0Var2;
            this.receiveSegment$volatile = yj0Var2;
            if (I()) {
                yj0Var2 = s60.a;
                yj0Var2.getClass();
            }
            this.bufferEndSegment$volatile = yj0Var2;
            this.L = mi2Var != null ? new km4(3, this) : null;
            this._closeCause$volatile = s60.s;
            return;
        }
        i.g(wh1.j("Invalid channel capacity: ", i, ", should be >=0"));
        throw null;
    }

    public static void B(q60 q60Var) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = Z;
        if ((atomicLongFieldUpdater.addAndGet(q60Var, 1L) & 4611686018427387904L) != 0) {
            do {
            } while ((atomicLongFieldUpdater.get(q60Var) & 4611686018427387904L) != 0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x00f9, code lost:
        if (r13 != null) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00fb, code lost:
        r1 = r4.e();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object L(defpackage.q60 r13, defpackage.k11 r14) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q60.L(q60, k11):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object M(defpackage.q60 r13, defpackage.k11 r14) {
        /*
            boolean r0 = r14 instanceof defpackage.o60
            if (r0 == 0) goto L14
            r0 = r14
            o60 r0 = (defpackage.o60) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.Y = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            o60 r0 = new o60
            r0.<init>(r13, r14)
            goto L12
        L1a:
            java.lang.Object r14 = r6.R
            p31 r0 = defpackage.p31.COROUTINE_SUSPENDED
            int r1 = r6.Y
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L34
            if (r1 != r3) goto L2e
            defpackage.me2.a0(r14)
            xj0 r14 = (defpackage.xj0) r14
            java.lang.Object r13 = r14.a
            return r13
        L2e:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r13)
            return r2
        L34:
            defpackage.me2.a0(r14)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r14 = defpackage.q60.d0
            r14.getClass()
            sun.misc.Unsafe r14 = defpackage.ys5.a
            long r4 = defpackage.q60.k0
            java.lang.Object r14 = r14.getObjectVolatile(r13, r4)
            yj0 r14 = (defpackage.yj0) r14
        L46:
            boolean r1 = r13.F()
            if (r1 == 0) goto L56
            java.lang.Throwable r13 = r13.v()
            vj0 r14 = new vj0
            r14.<init>(r13)
            return r14
        L56:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = defpackage.q60.X
            long r4 = r1.getAndIncrement(r13)
            int r1 = defpackage.s60.b
            long r7 = (long) r1
            long r9 = r4 / r7
            long r7 = r4 % r7
            int r1 = (int) r7
            long r7 = r14.X
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L73
            yj0 r7 = r13.t(r9, r14)
            if (r7 != 0) goto L71
            goto L46
        L71:
            r8 = r7
            goto L74
        L73:
            r8 = r14
        L74:
            r12 = 0
            r7 = r13
            r9 = r1
            r10 = r4
            java.lang.Object r13 = r7.U(r8, r9, r10, r12)
            r1 = r7
            an1 r14 = defpackage.s60.m
            if (r13 == r14) goto La7
            an1 r14 = defpackage.s60.o
            if (r13 != r14) goto L93
            long r13 = r1.z()
            int r13 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r13 >= 0) goto L90
            r8.b()
        L90:
            r13 = r1
            r14 = r8
            goto L46
        L93:
            an1 r14 = defpackage.s60.n
            if (r13 != r14) goto La3
            r6.Y = r3
            r2 = r8
            r3 = r9
            java.lang.Object r13 = r1.N(r2, r3, r4, r6)
            if (r13 != r0) goto La2
            return r0
        La2:
            return r13
        La3:
            r8.b()
            return r13
        La7:
            java.lang.String r13 = "unexpected"
            defpackage.i.n(r13)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q60.M(q60, k11):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x014a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object Q(defpackage.q60 r25, java.lang.Object r26, defpackage.j11 r27) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q60.Q(q60, java.lang.Object, j11):java.lang.Object");
    }

    public static final void a(q60 q60Var, Object obj, ih0 ih0Var) {
        mi2 mi2Var = q60Var.B;
        if (mi2Var != null) {
            oo2.v(mi2Var, obj, ih0Var.X);
        }
        ih0Var.k(new kc5(q60Var.y()));
    }

    public static final int d(q60 q60Var, yj0 yj0Var, int i, Object obj, long j, Object obj2, boolean z) {
        yj0Var.s(i, obj);
        if (z) {
            return q60Var.V(yj0Var, i, obj, j, obj2, z);
        }
        Object q = yj0Var.q(i);
        if (q == null) {
            if (q60Var.g(j)) {
                if (yj0Var.p(i, null, s60.d)) {
                    return 1;
                }
            } else if (obj2 == null) {
                return 3;
            } else {
                if (yj0Var.p(i, null, obj2)) {
                    return 2;
                }
            }
        } else if (q instanceof fd7) {
            yj0Var.s(i, null);
            if (q60Var.R(q, obj)) {
                yj0Var.t(i, s60.i);
                return 0;
            }
            an1 an1Var = s60.k;
            if (yj0Var.c0.getAndSet((i * 2) + 1, an1Var) != an1Var) {
                yj0Var.r(i, true);
                return 5;
            }
            return 5;
        }
        return q60Var.V(yj0Var, i, obj, j, obj2, z);
    }

    public final boolean A() {
        while (true) {
            d0.getClass();
            Unsafe unsafe = ys5.a;
            long j = k0;
            yj0 yj0Var = (yj0) unsafe.getObjectVolatile(this, j);
            AtomicLongFieldUpdater atomicLongFieldUpdater = X;
            long j2 = atomicLongFieldUpdater.get(this);
            if (z() > j2) {
                long j3 = s60.b;
                long j4 = j2 / j3;
                if (yj0Var.X != j4 && (yj0Var = t(j4, yj0Var)) == null) {
                    if (((yj0) unsafe.getObjectVolatile(this, j)).X < j4) {
                        return false;
                    }
                } else {
                    yj0Var.b();
                    int i = (int) (j2 % j3);
                    while (true) {
                        Object q = yj0Var.q(i);
                        if (q != null && q != s60.e) {
                            if (q != s60.d) {
                                if (q != s60.j && q != s60.l && q != s60.i && q != s60.h) {
                                    if (q != s60.g) {
                                        if (q != s60.f && j2 == atomicLongFieldUpdater.get(this)) {
                                            return true;
                                        }
                                    } else {
                                        return true;
                                    }
                                }
                            } else {
                                return true;
                            }
                        } else if (yj0Var.p(i, q, s60.h)) {
                            r();
                            break;
                        }
                    }
                    X.compareAndSet(this, j2, j2 + 1);
                }
            } else {
                return false;
            }
        }
    }

    public final void C() {
        Object objectVolatile;
        an1 an1Var;
        q60 q60Var;
        loop0: while (true) {
            g0.getClass();
            Unsafe unsafe = ys5.a;
            long j = j0;
            objectVolatile = unsafe.getObjectVolatile(this, j);
            if (objectVolatile == null) {
                an1Var = s60.q;
            } else {
                an1Var = s60.r;
            }
            an1 an1Var2 = an1Var;
            while (true) {
                Unsafe unsafe2 = ys5.a;
                q60Var = this;
                if (unsafe2.compareAndSwapObject(q60Var, j0, objectVolatile, an1Var2)) {
                    break loop0;
                } else if (unsafe2.getObjectVolatile(q60Var, j) != objectVolatile) {
                    break;
                } else {
                    this = q60Var;
                }
            }
            this = q60Var;
        }
        if (objectVolatile == null) {
            return;
        }
        l07.q(1, objectVolatile);
        ((mi2) objectVolatile).n(q60Var.v());
    }

    public final void D(z50 z50Var) {
        Unsafe unsafe;
        while (true) {
            g0.getClass();
            Unsafe unsafe2 = ys5.a;
            q60 q60Var = this;
            if (unsafe2.compareAndSwapObject(q60Var, j0, (Object) null, z50Var)) {
                return;
            }
            long j = j0;
            if (unsafe2.getObjectVolatile(q60Var, j) != null) {
                while (true) {
                    Object objectVolatile = ys5.a.getObjectVolatile(q60Var, j);
                    an1 an1Var = s60.q;
                    if (objectVolatile == an1Var) {
                        an1 an1Var2 = s60.r;
                        do {
                            q60 q60Var2 = q60Var;
                            unsafe = ys5.a;
                            boolean compareAndSwapObject = unsafe.compareAndSwapObject(q60Var2, j0, an1Var, an1Var2);
                            q60Var = q60Var2;
                            if (compareAndSwapObject) {
                                z50Var.n(q60Var.v());
                                return;
                            }
                        } while (unsafe.getObjectVolatile(q60Var, j) == an1Var);
                    } else if (objectVolatile == s60.r) {
                        i.n("Another handler was already registered and successfully invoked");
                        return;
                    } else {
                        f81.p(objectVolatile, "Another handler is already registered: ");
                        return;
                    }
                }
            } else {
                this = q60Var;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00c0, code lost:
        r13 = (defpackage.yj0) r13.f();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean E(long r13, boolean r15) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q60.E(long, boolean):boolean");
    }

    public final boolean F() {
        return E(R.get(this), true);
    }

    public final boolean G() {
        return E(R.get(this), false);
    }

    public boolean H() {
        return false;
    }

    public final boolean I() {
        long j = Y.get(this);
        if (j != 0 && j != Long.MAX_VALUE) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0063, code lost:
        if (r5.k() == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0065, code lost:
        r5.i();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void J(long r7, defpackage.yj0 r9) {
        /*
            r6 = this;
        L0:
            long r0 = r9.X
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 >= 0) goto L11
            zv0 r0 = r9.d()
            yj0 r0 = (defpackage.yj0) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r9 = r0
            goto L0
        L11:
            r5 = r9
        L12:
            boolean r7 = r5.g()
            if (r7 == 0) goto L23
            zv0 r7 = r5.d()
            yj0 r7 = (defpackage.yj0) r7
            if (r7 != 0) goto L21
            goto L23
        L21:
            r5 = r7
            goto L12
        L23:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = defpackage.q60.e0
            r7.getClass()
            sun.misc.Unsafe r7 = defpackage.ys5.a
            long r8 = defpackage.q60.i0
            java.lang.Object r7 = r7.getObjectVolatile(r6, r8)
            r4 = r7
            dy5 r4 = (defpackage.dy5) r4
            long r0 = r4.X
            long r2 = r5.X
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 < 0) goto L3c
            goto L58
        L3c:
            boolean r7 = r5.o()
            if (r7 != 0) goto L44
            r9 = r5
            goto L11
        L44:
            sun.misc.Unsafe r0 = defpackage.ys5.a
            long r2 = defpackage.q60.i0
            r1 = r6
            boolean r6 = r0.compareAndSwapObject(r1, r2, r4, r5)
            if (r6 == 0) goto L59
            boolean r6 = r4.k()
            if (r6 == 0) goto L58
            r4.i()
        L58:
            return
        L59:
            java.lang.Object r6 = r0.getObjectVolatile(r1, r8)
            if (r6 == r4) goto L6a
            boolean r6 = r5.k()
            if (r6 == 0) goto L68
            r5.i()
        L68:
            r6 = r1
            goto L23
        L6a:
            r6 = r1
            goto L44
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q60.J(long, yj0):void");
    }

    public final Object K(j11 j11Var, Object obj) {
        hg w;
        ih0 ih0Var = new ih0(1, nk2.J(j11Var));
        ih0Var.x();
        mi2 mi2Var = this.B;
        if (mi2Var != null && (w = oo2.w(mi2Var, obj, null)) != null) {
            pu.k(w, y());
            ih0Var.k(new kc5(w));
        } else {
            ih0Var.k(new kc5(y()));
        }
        Object v = ih0Var.v();
        if (v == p31.COROUTINE_SUSPENDED) {
            return v;
        }
        return o27.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d2, code lost:
        if (r12 != null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d4, code lost:
        r3 = f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ec, code lost:
        if (r12 != null) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object N(defpackage.yj0 r11, int r12, long r13, defpackage.k11 r15) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q60.N(yj0, int, long, k11):java.lang.Object");
    }

    public final void O(jy5 jy5Var) {
        yj0 yj0Var;
        q60 q60Var;
        jy5 jy5Var2;
        int i;
        jy5 jy5Var3;
        d0.getClass();
        yj0 yj0Var2 = (yj0) ys5.a.getObjectVolatile(this, k0);
        while (!this.F()) {
            long andIncrement = X.getAndIncrement(this);
            long j = s60.b;
            long j2 = andIncrement / j;
            int i2 = (int) (andIncrement % j);
            if (yj0Var2.X != j2) {
                yj0 t = this.t(j2, yj0Var2);
                if (t == null) {
                    continue;
                } else {
                    yj0Var = t;
                    jy5Var2 = jy5Var;
                    i = i2;
                    q60Var = this;
                }
            } else {
                yj0Var = yj0Var2;
                q60Var = this;
                jy5Var2 = jy5Var;
                i = i2;
            }
            Object U = q60Var.U(yj0Var, i, andIncrement, jy5Var2);
            yj0Var2 = yj0Var;
            if (U == s60.m) {
                if (jy5Var2 != null) {
                    jy5Var3 = jy5Var2;
                } else {
                    jy5Var3 = null;
                }
                if (jy5Var3 != null) {
                    jy5Var3.L = yj0Var2;
                    jy5Var3.R = i;
                    return;
                }
                return;
            } else if (U == s60.o) {
                if (andIncrement < q60Var.z()) {
                    yj0Var2.b();
                }
                this = q60Var;
                jy5Var = jy5Var2;
            } else if (U != s60.n) {
                yj0Var2.b();
                jy5Var2.X = U;
                return;
            } else {
                i.n("unexpected");
                return;
            }
        }
        jy5Var.X = s60.l;
    }

    public final void P(fd7 fd7Var, boolean z) {
        Throwable y;
        if (fd7Var instanceof hh0) {
            j11 j11Var = (j11) fd7Var;
            if (z) {
                y = x();
            } else {
                y = y();
            }
            j11Var.k(new kc5(y));
        } else if (fd7Var instanceof l55) {
            ((l55) fd7Var).A.k(new xj0(new vj0(v())));
        } else if (fd7Var instanceof i60) {
            i60 i60Var = (i60) fd7Var;
            ih0 ih0Var = i60Var.B;
            ih0Var.getClass();
            i60Var.B = null;
            i60Var.A = s60.l;
            Throwable v = i60Var.L.v();
            if (v == null) {
                ih0Var.k(Boolean.FALSE);
            } else {
                ih0Var.k(new kc5(v));
            }
        } else if (fd7Var instanceof jy5) {
            ((jy5) fd7Var).k(this, s60.l);
        } else {
            f81.p(fd7Var, "Unexpected waiter: ");
        }
    }

    public final boolean R(Object obj, Object obj2) {
        if (obj instanceof jy5) {
            return ((jy5) obj).k(this, obj2);
        }
        boolean z = obj instanceof l55;
        mi2 mi2Var = this.B;
        bj2 bj2Var = null;
        if (z) {
            ih0 ih0Var = ((l55) obj).A;
            xj0 xj0Var = new xj0(obj2);
            if (mi2Var != null) {
                bj2Var = f();
            }
            return s60.a(ih0Var, xj0Var, bj2Var);
        } else if (obj instanceof i60) {
            i60 i60Var = (i60) obj;
            ih0 ih0Var2 = i60Var.B;
            ih0Var2.getClass();
            i60Var.B = null;
            i60Var.A = obj2;
            Boolean bool = Boolean.TRUE;
            mi2 mi2Var2 = i60Var.L.B;
            if (mi2Var2 != null) {
                bj2Var = new l4(2, mi2Var2, obj2);
            }
            return s60.a(ih0Var2, bool, bj2Var);
        } else if (obj instanceof hh0) {
            hh0 hh0Var = (hh0) obj;
            if (mi2Var != null) {
                bj2Var = e();
            }
            return s60.a(hh0Var, obj2, bj2Var);
        } else {
            f81.p(obj, "Unexpected receiver type: ");
            return false;
        }
    }

    public final boolean S(Object obj, yj0 yj0Var, int i) {
        wy6 wy6Var;
        boolean z = obj instanceof hh0;
        o27 o27Var = o27.a;
        if (z) {
            return s60.a((hh0) obj, o27Var, null);
        }
        if (obj instanceof jy5) {
            int l = ((jy5) obj).l(this, o27Var);
            if (l != 0) {
                if (l != 1) {
                    if (l != 2) {
                        if (l == 3) {
                            wy6Var = wy6.ALREADY_SELECTED;
                        } else {
                            c44.d(l, "Unexpected internal result: ");
                            return false;
                        }
                    } else {
                        wy6Var = wy6.CANCELLED;
                    }
                } else {
                    wy6Var = wy6.REREGISTER;
                }
            } else {
                wy6Var = wy6.SUCCESSFUL;
            }
            if (wy6Var == wy6.REREGISTER) {
                yj0Var.s(i, null);
            }
            if (wy6Var != wy6.SUCCESSFUL) {
                return false;
            }
            return true;
        }
        f81.p(obj, "Unexpected waiter: ");
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ae, code lost:
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object T(java.lang.Object r14) {
        /*
            r13 = this;
            an1 r6 = defpackage.s60.d
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.q60.c0
            r0.getClass()
            sun.misc.Unsafe r0 = defpackage.ys5.a
            long r1 = defpackage.q60.l0
            java.lang.Object r0 = r0.getObjectVolatile(r13, r1)
            yj0 r0 = (defpackage.yj0) r0
        L11:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = defpackage.q60.R
            long r1 = r1.getAndIncrement(r13)
            r3 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r4 = r1 & r3
            r3 = 0
            boolean r7 = r13.E(r1, r3)
            int r8 = defpackage.s60.b
            long r9 = (long) r8
            long r1 = r4 / r9
            long r11 = r4 % r9
            int r3 = (int) r11
            long r11 = r0.X
            int r11 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r11 == 0) goto L47
            yj0 r1 = r13.u(r1, r0)
            if (r1 != 0) goto L43
            if (r7 == 0) goto L11
            java.lang.Throwable r13 = r13.y()
            vj0 r14 = new vj0
            r14.<init>(r13)
            return r14
        L43:
            r0 = r13
            r2 = r3
        L45:
            r3 = r14
            goto L4b
        L47:
            r1 = r0
            r2 = r3
            r0 = r13
            goto L45
        L4b:
            int r13 = d(r0, r1, r2, r3, r4, r6, r7)
            r14 = r0
            r0 = r1
            o27 r1 = defpackage.o27.a
            if (r13 == 0) goto Laf
            r11 = 1
            if (r13 == r11) goto Lae
            r11 = 2
            r12 = 0
            if (r13 == r11) goto L89
            r1 = 3
            if (r13 == r1) goto L83
            r1 = 4
            if (r13 == r1) goto L6c
            r1 = 5
            if (r13 == r1) goto L66
            goto L69
        L66:
            r0.b()
        L69:
            r13 = r14
            r14 = r3
            goto L11
        L6c:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r13 = defpackage.q60.X
            long r1 = r13.get(r14)
            int r13 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r13 >= 0) goto L79
            r0.b()
        L79:
            java.lang.Throwable r13 = r14.y()
            vj0 r14 = new vj0
            r14.<init>(r13)
            return r14
        L83:
            java.lang.String r13 = "unexpected"
            defpackage.i.n(r13)
            return r12
        L89:
            if (r7 == 0) goto L98
            r0.n()
            java.lang.Throwable r13 = r14.y()
            vj0 r14 = new vj0
            r14.<init>(r13)
            return r14
        L98:
            boolean r13 = r6 instanceof defpackage.fd7
            if (r13 == 0) goto L9f
            r12 = r6
            fd7 r12 = (defpackage.fd7) r12
        L9f:
            if (r12 == 0) goto La6
            int r3 = r2 + r8
            r12.b(r0, r3)
        La6:
            long r3 = r0.X
            long r3 = r3 * r9
            long r5 = (long) r2
            long r3 = r3 + r5
            r14.p(r3)
        Lae:
            return r1
        Laf:
            r0.b()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q60.T(java.lang.Object):java.lang.Object");
    }

    public final Object U(yj0 yj0Var, int i, long j, Object obj) {
        Object q = yj0Var.q(i);
        AtomicReferenceArray atomicReferenceArray = yj0Var.c0;
        AtomicLongFieldUpdater atomicLongFieldUpdater = R;
        if (q == null) {
            if (j >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return s60.n;
                }
                if (yj0Var.p(i, q, obj)) {
                    r();
                    return s60.m;
                }
            }
        } else if (q == s60.d && yj0Var.p(i, q, s60.i)) {
            r();
            Object obj2 = atomicReferenceArray.get(i * 2);
            yj0Var.s(i, null);
            return obj2;
        }
        while (true) {
            Object q2 = yj0Var.q(i);
            if (q2 != null && q2 != s60.e) {
                if (q2 == s60.d) {
                    if (yj0Var.p(i, q2, s60.i)) {
                        r();
                        Object obj3 = atomicReferenceArray.get(i * 2);
                        yj0Var.s(i, null);
                        return obj3;
                    }
                } else {
                    an1 an1Var = s60.j;
                    if (q2 == an1Var) {
                        return s60.o;
                    }
                    if (q2 == s60.h) {
                        return s60.o;
                    }
                    if (q2 == s60.l) {
                        r();
                        return s60.o;
                    } else if (q2 != s60.g && yj0Var.p(i, q2, s60.f)) {
                        boolean z = q2 instanceof gd7;
                        if (z) {
                            q2 = ((gd7) q2).a;
                        }
                        if (S(q2, yj0Var, i)) {
                            yj0Var.t(i, s60.i);
                            r();
                            Object obj4 = atomicReferenceArray.get(i * 2);
                            yj0Var.s(i, null);
                            return obj4;
                        }
                        yj0Var.t(i, an1Var);
                        yj0Var.n();
                        if (z) {
                            r();
                        }
                        return s60.o;
                    }
                }
            } else if (j < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (yj0Var.p(i, q2, s60.h)) {
                    r();
                    return s60.o;
                }
            } else if (obj == null) {
                return s60.n;
            } else {
                if (yj0Var.p(i, q2, obj)) {
                    r();
                    return s60.m;
                }
            }
        }
    }

    public final int V(yj0 yj0Var, int i, Object obj, long j, Object obj2, boolean z) {
        while (true) {
            Object q = yj0Var.q(i);
            if (q == null) {
                if (g(j) && !z) {
                    if (yj0Var.p(i, null, s60.d)) {
                        break;
                    }
                } else if (z) {
                    if (yj0Var.p(i, null, s60.j)) {
                        yj0Var.n();
                        return 4;
                    }
                } else if (obj2 == null) {
                    return 3;
                } else {
                    if (yj0Var.p(i, null, obj2)) {
                        return 2;
                    }
                }
            } else if (q == s60.e) {
                if (yj0Var.p(i, q, s60.d)) {
                    break;
                }
            } else {
                an1 an1Var = s60.k;
                if (q == an1Var) {
                    yj0Var.s(i, null);
                    return 5;
                } else if (q == s60.h) {
                    yj0Var.s(i, null);
                    return 5;
                } else if (q == s60.l) {
                    yj0Var.s(i, null);
                    G();
                    return 4;
                } else {
                    yj0Var.s(i, null);
                    if (q instanceof gd7) {
                        q = ((gd7) q).a;
                    }
                    if (R(q, obj)) {
                        yj0Var.t(i, s60.i);
                        return 0;
                    }
                    if (yj0Var.c0.getAndSet((i * 2) + 1, an1Var) != an1Var) {
                        yj0Var.r(i, true);
                    }
                    return 5;
                }
            }
        }
        return 1;
    }

    public final void W(long j) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        boolean z;
        q60 q60Var = this;
        if (!q60Var.I()) {
            while (true) {
                atomicLongFieldUpdater = Y;
                if (atomicLongFieldUpdater.get(q60Var) > j) {
                    break;
                }
                q60Var = this;
            }
            int i = s60.c;
            int i2 = 0;
            while (true) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = Z;
                if (i2 < i) {
                    long j2 = atomicLongFieldUpdater.get(q60Var);
                    if (j2 != (4611686018427387903L & atomicLongFieldUpdater2.get(q60Var)) || j2 != atomicLongFieldUpdater.get(q60Var)) {
                        i2++;
                    } else {
                        return;
                    }
                } else {
                    while (true) {
                        long j3 = atomicLongFieldUpdater2.get(q60Var);
                        if (atomicLongFieldUpdater2.compareAndSet(q60Var, j3, (j3 & 4611686018427387903L) + 4611686018427387904L)) {
                            break;
                        }
                        q60Var = this;
                    }
                    while (true) {
                        long j4 = atomicLongFieldUpdater.get(q60Var);
                        long j5 = atomicLongFieldUpdater2.get(q60Var);
                        long j6 = j5 & 4611686018427387903L;
                        if ((j5 & 4611686018427387904L) != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (j4 == j6 && j4 == atomicLongFieldUpdater.get(q60Var)) {
                            break;
                        } else if (!z) {
                            q60Var = this;
                            atomicLongFieldUpdater2.compareAndSet(q60Var, j5, 4611686018427387904L + j6);
                        } else {
                            q60Var = this;
                        }
                    }
                    while (true) {
                        long j7 = atomicLongFieldUpdater2.get(q60Var);
                        if (atomicLongFieldUpdater2.compareAndSet(q60Var, j7, j7 & 4611686018427387903L)) {
                            return;
                        }
                        q60Var = this;
                    }
                }
            }
        }
    }

    @Override // defpackage.zz5
    public Object b(j11 j11Var, Object obj) {
        return Q(this, obj, j11Var);
    }

    @Override // defpackage.zz5
    public Object c(Object obj) {
        boolean z;
        AtomicLongFieldUpdater atomicLongFieldUpdater = R;
        long j = atomicLongFieldUpdater.get(this);
        boolean z2 = false;
        long j2 = 1152921504606846975L;
        if (E(j, false)) {
            z = false;
        } else {
            z = !g(j & 1152921504606846975L);
        }
        wj0 wj0Var = xj0.b;
        if (z) {
            return wj0Var;
        }
        an1 an1Var = s60.j;
        c0.getClass();
        yj0 yj0Var = (yj0) ys5.a.getObjectVolatile(this, l0);
        while (true) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j3 = andIncrement & j2;
            boolean E = E(andIncrement, z2);
            int i = s60.b;
            long j4 = i;
            long j5 = j3 / j4;
            int i2 = (int) (j3 % j4);
            if (yj0Var.X != j5) {
                yj0 u = u(j5, yj0Var);
                if (u == null) {
                    if (E) {
                        return new vj0(y());
                    }
                    z2 = false;
                    j2 = 1152921504606846975L;
                } else {
                    yj0Var = u;
                }
            }
            int d = d(this, yj0Var, i2, obj, j3, an1Var, E);
            o27 o27Var = o27.a;
            if (d != 0) {
                if (d != 1) {
                    fd7 fd7Var = null;
                    if (d != 2) {
                        if (d != 3) {
                            if (d != 4) {
                                if (d == 5) {
                                    yj0Var.b();
                                }
                                z2 = false;
                                j2 = 1152921504606846975L;
                            } else {
                                if (j3 < X.get(this)) {
                                    yj0Var.b();
                                }
                                return new vj0(y());
                            }
                        } else {
                            i.n("unexpected");
                            return null;
                        }
                    } else if (E) {
                        yj0Var.n();
                        return new vj0(y());
                    } else {
                        if (an1Var instanceof fd7) {
                            fd7Var = (fd7) an1Var;
                        }
                        if (fd7Var != null) {
                            fd7Var.b(yj0Var, i2 + i);
                        }
                        yj0Var.n();
                        return wj0Var;
                    }
                } else {
                    return o27Var;
                }
            } else {
                yj0Var.b();
                return o27Var;
            }
        }
    }

    public final j60 e() {
        return new j60(3, this, q60.class, "onCancellationImplDoNotCall", "onCancellationImplDoNotCall(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0, 0, 0);
    }

    public final j60 f() {
        return new j60(3, this, q60.class, "onCancellationChannelResultImplDoNotCall", "onCancellationChannelResultImplDoNotCall-5_sEAP8(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0, 0, 1);
    }

    public final boolean g(long j) {
        if (j >= Y.get(this) && j >= X.get(this) + this.A) {
            return false;
        }
        return true;
    }

    public final boolean h(Throwable th) {
        return l(th, false);
    }

    @Override // defpackage.lj0
    public final void i(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        l(cancellationException, true);
    }

    @Override // defpackage.lj0
    public final i60 iterator() {
        return new i60(this);
    }

    @Override // defpackage.lj0
    public final q9 j() {
        m60 m60Var = m60.c0;
        l07.q(3, m60Var);
        n60 n60Var = n60.c0;
        l07.q(3, n60Var);
        return new q9(this, m60Var, n60Var, this.L, 19);
    }

    public final yj0 k() {
        e0.getClass();
        Unsafe unsafe = ys5.a;
        yj0 objectVolatile = unsafe.getObjectVolatile(this, i0);
        c0.getClass();
        yj0 yj0Var = (yj0) unsafe.getObjectVolatile(this, l0);
        if (yj0Var.X > ((yj0) objectVolatile).X) {
            objectVolatile = yj0Var;
        }
        d0.getClass();
        yj0 yj0Var2 = (yj0) unsafe.getObjectVolatile(this, k0);
        if (yj0Var2.X > ((yj0) objectVolatile).X) {
            objectVolatile = yj0Var2;
        }
        zv0 zv0Var = (zv0) objectVolatile;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = zv0.A;
            Object e = zv0Var.e();
            if (e == yv0.a) {
                break;
            }
            zv0 zv0Var2 = (zv0) e;
            if (zv0Var2 == null) {
                if (zv0Var.h()) {
                    break;
                }
            } else {
                zv0Var = zv0Var2;
            }
        }
        return (yj0) zv0Var;
    }

    public final boolean l(Throwable th, boolean z) {
        q60 q60Var;
        boolean z2;
        long j;
        long j2;
        long j3;
        AtomicLongFieldUpdater atomicLongFieldUpdater = R;
        if (z) {
            while (true) {
                long j4 = atomicLongFieldUpdater.get(this);
                if (((int) (j4 >> 60)) != 0) {
                    break;
                }
                yj0 yj0Var = s60.a;
                q60Var = this;
                if (atomicLongFieldUpdater.compareAndSet(q60Var, j4, (j4 & 1152921504606846975L) + 1152921504606846976L)) {
                    break;
                }
                this = q60Var;
            }
        }
        q60Var = this;
        an1 an1Var = s60.s;
        while (true) {
            f0.getClass();
            q60 q60Var2 = q60Var;
            Unsafe unsafe = ys5.a;
            long j5 = h0;
            Throwable th2 = th;
            boolean compareAndSwapObject = unsafe.compareAndSwapObject(q60Var2, j5, an1Var, th2);
            q60Var = q60Var2;
            if (compareAndSwapObject) {
                z2 = true;
                break;
            } else if (unsafe.getObjectVolatile(q60Var, j5) != an1Var) {
                z2 = false;
                break;
            } else {
                th = th2;
            }
        }
        if (z) {
            do {
                j3 = atomicLongFieldUpdater.get(q60Var);
            } while (!atomicLongFieldUpdater.compareAndSet(q60Var, j3, 3458764513820540928L + (j3 & 1152921504606846975L)));
        } else {
            do {
                j = atomicLongFieldUpdater.get(q60Var);
                int i = (int) (j >> 60);
                if (i != 0) {
                    if (i != 1) {
                        break;
                    }
                    j2 = (j & 1152921504606846975L) + 3458764513820540928L;
                } else {
                    j2 = (j & 1152921504606846975L) + 2305843009213693952L;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(q60Var, j, j2));
        }
        q60Var.G();
        if (z2) {
            q60Var.C();
        }
        return z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0046, code lost:
        r1 = (defpackage.yj0) r1.f();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.yj0 m(long r12) {
        /*
            Method dump skipped, instructions count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q60.m(long):yj0");
    }

    @Override // defpackage.lj0
    public final Object n(nk6 nk6Var) {
        return L(this, nk6Var);
    }

    @Override // defpackage.lj0
    public final Object o() {
        yj0 yj0Var;
        AtomicLongFieldUpdater atomicLongFieldUpdater = X;
        long j = atomicLongFieldUpdater.get(this);
        long j2 = R.get(this);
        if (E(j2, true)) {
            return new vj0(v());
        }
        int i = (j > (j2 & 1152921504606846975L) ? 1 : (j == (j2 & 1152921504606846975L) ? 0 : -1));
        wj0 wj0Var = xj0.b;
        if (i >= 0) {
            return wj0Var;
        }
        an1 an1Var = s60.k;
        d0.getClass();
        yj0 yj0Var2 = (yj0) ys5.a.getObjectVolatile(this, k0);
        while (!this.F()) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j3 = s60.b;
            long j4 = andIncrement / j3;
            int i2 = (int) (andIncrement % j3);
            if (yj0Var2.X != j4) {
                yj0 t = this.t(j4, yj0Var2);
                if (t == null) {
                    continue;
                } else {
                    yj0Var = t;
                }
            } else {
                yj0Var = yj0Var2;
            }
            q60 q60Var = this;
            Object U = q60Var.U(yj0Var, i2, andIncrement, an1Var);
            yj0Var2 = yj0Var;
            fd7 fd7Var = null;
            if (U == s60.m) {
                if (an1Var instanceof fd7) {
                    fd7Var = (fd7) an1Var;
                }
                if (fd7Var != null) {
                    fd7Var.b(yj0Var2, i2);
                }
                q60Var.W(andIncrement);
                yj0Var2.n();
                return wj0Var;
            } else if (U == s60.o) {
                if (andIncrement < q60Var.z()) {
                    yj0Var2.b();
                }
                this = q60Var;
            } else if (U != s60.n) {
                yj0Var2.b();
                return U;
            } else {
                i.n("unexpected");
                return null;
            }
        }
        return new vj0(this.v());
    }

    public final void p(long j) {
        hg w;
        d0.getClass();
        yj0 yj0Var = (yj0) ys5.a.getObjectVolatile(this, k0);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = X;
            long j2 = atomicLongFieldUpdater.get(this);
            if (j < Math.max(this.A + j2, Y.get(this))) {
                return;
            }
            q60 q60Var = this;
            if (atomicLongFieldUpdater.compareAndSet(q60Var, j2, 1 + j2)) {
                long j3 = s60.b;
                long j4 = j2 / j3;
                int i = (int) (j2 % j3);
                if (yj0Var.X != j4) {
                    yj0 t = q60Var.t(j4, yj0Var);
                    if (t != null) {
                        yj0Var = t;
                    }
                }
                yj0 yj0Var2 = yj0Var;
                Object U = q60Var.U(yj0Var2, i, j2, null);
                if (U == s60.o) {
                    if (j2 < q60Var.z()) {
                        yj0Var2.b();
                    }
                } else {
                    yj0Var2.b();
                    mi2 mi2Var = q60Var.B;
                    if (mi2Var != null && (w = oo2.w(mi2Var, U, null)) != null) {
                        throw w;
                    }
                }
                this = q60Var;
                yj0Var = yj0Var2;
            }
            this = q60Var;
        }
    }

    @Override // defpackage.lj0
    public final Object q(pr0 pr0Var) {
        return M(this, pr0Var);
    }

    public final void r() {
        q60 q60Var;
        if (I()) {
            return;
        }
        e0.getClass();
        yj0 yj0Var = (yj0) ys5.a.getObjectVolatile(this, i0);
        loop0: while (true) {
            long andIncrement = Y.getAndIncrement(this);
            long j = s60.b;
            long j2 = andIncrement / j;
            if (this.z() <= andIncrement) {
                if (yj0Var.X < j2 && yj0Var.d() != null) {
                    this.J(j2, yj0Var);
                }
                B(this);
                return;
            }
            q60Var = this;
            if (yj0Var.X != j2) {
                yj0 s = q60Var.s(j2, yj0Var, andIncrement);
                if (s == null) {
                    continue;
                    this = q60Var;
                } else {
                    yj0Var = s;
                }
            }
            int i = (int) (andIncrement % j);
            Object q = yj0Var.q(i);
            boolean z = q instanceof fd7;
            AtomicLongFieldUpdater atomicLongFieldUpdater = X;
            if (z && andIncrement >= atomicLongFieldUpdater.get(q60Var) && yj0Var.p(i, q, s60.g)) {
                if (q60Var.S(q, yj0Var, i)) {
                    yj0Var.t(i, s60.d);
                    break;
                }
                yj0Var.t(i, s60.j);
                yj0Var.n();
                B(q60Var);
            } else {
                while (true) {
                    Object q2 = yj0Var.q(i);
                    if (q2 instanceof fd7) {
                        if (andIncrement < atomicLongFieldUpdater.get(q60Var)) {
                            if (yj0Var.p(i, q2, new gd7((fd7) q2))) {
                                break loop0;
                            }
                        } else if (yj0Var.p(i, q2, s60.g)) {
                            if (q60Var.S(q2, yj0Var, i)) {
                                yj0Var.t(i, s60.d);
                                break;
                            } else {
                                yj0Var.t(i, s60.j);
                                yj0Var.n();
                            }
                        }
                    } else if (q2 != s60.j) {
                        if (q2 == null) {
                            if (yj0Var.p(i, q2, s60.e)) {
                                break loop0;
                            }
                        } else if (q2 == s60.d || q2 == s60.h || q2 == s60.i || q2 == s60.k || q2 == s60.l) {
                            break loop0;
                        } else if (q2 != s60.f) {
                            f81.p(q2, "Unexpected cell state: ");
                            return;
                        }
                    } else {
                        break;
                    }
                }
                B(q60Var);
            }
            this = q60Var;
        }
        B(q60Var);
    }

    public final yj0 s(long j, yj0 yj0Var, long j2) {
        Object a;
        Unsafe unsafe;
        yj0 yj0Var2 = s60.a;
        r60 r60Var = r60.c0;
        loop0: while (true) {
            a = yv0.a(yj0Var, j, r60Var);
            if (!hi2.E(a)) {
                dy5 z = hi2.z(a);
                while (true) {
                    e0.getClass();
                    Unsafe unsafe2 = ys5.a;
                    long j3 = i0;
                    dy5 dy5Var = (dy5) unsafe2.getObjectVolatile(this, j3);
                    if (dy5Var.X >= z.X) {
                        break loop0;
                    } else if (!z.o()) {
                        break;
                    } else {
                        do {
                            unsafe = ys5.a;
                            if (unsafe.compareAndSwapObject(this, i0, dy5Var, z)) {
                                if (dy5Var.k()) {
                                    dy5Var.i();
                                }
                            }
                        } while (unsafe.getObjectVolatile(this, j3) == dy5Var);
                        if (z.k()) {
                            z.i();
                        }
                    }
                }
            } else {
                break;
            }
        }
        if (hi2.E(a)) {
            G();
            J(j, yj0Var);
            B(this);
            return null;
        }
        yj0 yj0Var3 = (yj0) hi2.z(a);
        long j4 = yj0Var3.X;
        if (j4 > j) {
            long j5 = j4 * s60.b;
            if (Y.compareAndSet(this, j2 + 1, j5)) {
                AtomicLongFieldUpdater atomicLongFieldUpdater = Z;
                if ((atomicLongFieldUpdater.addAndGet(this, j5 - j2) & 4611686018427387904L) == 0) {
                    return null;
                }
                do {
                } while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0);
                return null;
            }
            B(this);
            return null;
        }
        return yj0Var3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d0, code lost:
        if (r8.k() == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d2, code lost:
        r8.i();
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0107 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.yj0 t(long r16, defpackage.yj0 r18) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q60.t(long, yj0):yj0");
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x01c1, code lost:
        r15 = r8;
        r3 = (defpackage.yj0) r3.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01c9, code lost:
        if (r3 != null) goto L102;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01c1 A[EDGE_INSN: B:101:0x01c1->B:83:0x01c1 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q60.toString():java.lang.String");
    }

    public final yj0 u(long j, yj0 yj0Var) {
        Object a;
        long j2;
        long j3;
        Unsafe unsafe;
        yj0 yj0Var2 = s60.a;
        r60 r60Var = r60.c0;
        loop0: while (true) {
            a = yv0.a(yj0Var, j, r60Var);
            if (!hi2.E(a)) {
                dy5 z = hi2.z(a);
                while (true) {
                    c0.getClass();
                    Unsafe unsafe2 = ys5.a;
                    long j4 = l0;
                    dy5 dy5Var = (dy5) unsafe2.getObjectVolatile(this, j4);
                    if (dy5Var.X >= z.X) {
                        break loop0;
                    } else if (!z.o()) {
                        break;
                    } else {
                        do {
                            unsafe = ys5.a;
                            if (unsafe.compareAndSwapObject(this, l0, dy5Var, z)) {
                                if (dy5Var.k()) {
                                    dy5Var.i();
                                }
                            }
                        } while (unsafe.getObjectVolatile(this, j4) == dy5Var);
                        if (z.k()) {
                            z.i();
                        }
                    }
                }
            } else {
                break;
            }
        }
        boolean E = hi2.E(a);
        AtomicLongFieldUpdater atomicLongFieldUpdater = X;
        if (E) {
            G();
            if (yj0Var.X * s60.b < atomicLongFieldUpdater.get(this)) {
                yj0Var.b();
                return null;
            }
        } else {
            yj0 yj0Var3 = (yj0) hi2.z(a);
            long j5 = yj0Var3.X;
            if (j5 > j) {
                long j6 = j5 * s60.b;
                do {
                    j2 = R.get(this);
                    j3 = 1152921504606846975L & j2;
                    if (j3 >= j6) {
                        break;
                    }
                } while (!R.compareAndSet(this, j2, j3 + (((int) (j2 >> 60)) << 60)));
                if (j5 * s60.b < atomicLongFieldUpdater.get(this)) {
                    yj0Var3.b();
                }
            } else {
                return yj0Var3;
            }
        }
        return null;
    }

    public final Throwable v() {
        f0.getClass();
        return (Throwable) ys5.a.getObjectVolatile(this, h0);
    }

    public final q9 w() {
        k60 k60Var = k60.c0;
        l07.q(3, k60Var);
        l60 l60Var = l60.c0;
        l07.q(3, l60Var);
        return new q9(this, k60Var, l60Var, this.L, 19);
    }

    public final Throwable x() {
        Throwable v = v();
        if (v == null) {
            return new NoSuchElementException("Channel was closed");
        }
        return v;
    }

    public final Throwable y() {
        Throwable v = v();
        if (v == null) {
            return new IllegalStateException("Channel was closed");
        }
        return v;
    }

    public final long z() {
        return R.get(this) & 1152921504606846975L;
    }
}
