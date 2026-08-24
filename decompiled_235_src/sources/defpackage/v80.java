package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: v80  reason: default package */
/* loaded from: classes.dex */
public class v80 implements ul0 {
    public static final /* synthetic */ AtomicLongFieldUpdater R = AtomicLongFieldUpdater.newUpdater(v80.class, "sendersAndCloseStatus$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater X = AtomicLongFieldUpdater.newUpdater(v80.class, "receivers$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater Y = AtomicLongFieldUpdater.newUpdater(v80.class, "bufferEnd$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater Z = AtomicLongFieldUpdater.newUpdater(v80.class, "completedExpandBuffersAndPauseFlag$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater d0 = AtomicReferenceFieldUpdater.newUpdater(v80.class, Object.class, "sendSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater e0;
    public static final /* synthetic */ AtomicReferenceFieldUpdater f0;
    public static final /* synthetic */ AtomicReferenceFieldUpdater g0;
    public static final /* synthetic */ AtomicReferenceFieldUpdater h0;
    public static final /* synthetic */ long i0;
    public static final /* synthetic */ long j0;
    public static final /* synthetic */ long k0;
    public static final /* synthetic */ long l0;
    public static final /* synthetic */ long m0;
    public final int A;
    public final qn2 B;
    public final ov4 L;
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
        Unsafe unsafe = v36.a;
        m0 = unsafe.objectFieldOffset(v80.class.getDeclaredField("sendSegment$volatile"));
        e0 = AtomicReferenceFieldUpdater.newUpdater(v80.class, Object.class, "receiveSegment$volatile");
        l0 = unsafe.objectFieldOffset(v80.class.getDeclaredField("receiveSegment$volatile"));
        f0 = AtomicReferenceFieldUpdater.newUpdater(v80.class, Object.class, "bufferEndSegment$volatile");
        j0 = unsafe.objectFieldOffset(v80.class.getDeclaredField("bufferEndSegment$volatile"));
        g0 = AtomicReferenceFieldUpdater.newUpdater(v80.class, Object.class, "_closeCause$volatile");
        i0 = unsafe.objectFieldOffset(v80.class.getDeclaredField("_closeCause$volatile"));
        h0 = AtomicReferenceFieldUpdater.newUpdater(v80.class, Object.class, "closeHandler$volatile");
        k0 = unsafe.objectFieldOffset(v80.class.getDeclaredField("closeHandler$volatile"));
    }

    public v80(int i, qn2 qn2Var) {
        long j;
        this.A = i;
        this.B = qn2Var;
        if (i >= 0) {
            hm0 hm0Var = x80.a;
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
            hm0 hm0Var2 = new hm0(0L, null, this, 3);
            this.sendSegment$volatile = hm0Var2;
            this.receiveSegment$volatile = hm0Var2;
            if (I()) {
                hm0Var2 = x80.a;
                hm0Var2.getClass();
            }
            this.bufferEndSegment$volatile = hm0Var2;
            this.L = qn2Var != null ? new ov4(this, 3) : null;
            this._closeCause$volatile = x80.s;
            return;
        }
        i.f(lb1.k("Invalid channel capacity: ", i, ", should be >=0"));
        throw null;
    }

    public static void B(v80 v80Var) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = Z;
        if ((atomicLongFieldUpdater.addAndGet(v80Var, 1L) & 4611686018427387904L) != 0) {
            do {
            } while ((atomicLongFieldUpdater.get(v80Var) & 4611686018427387904L) != 0);
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
    */
    public static Object L(v80 v80Var, r41 r41Var) {
        hm0 hm0Var;
        Throwable th;
        hm0 hm0Var2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e0;
        atomicReferenceFieldUpdater.getClass();
        o80 o80Var = null;
        if (v80Var != null) {
            hm0 hm0Var3 = (hm0) v36.a.getObjectVolatile(v80Var, l0);
            while (!v80Var.F()) {
                AtomicLongFieldUpdater atomicLongFieldUpdater = X;
                long andIncrement = atomicLongFieldUpdater.getAndIncrement(v80Var);
                long j = x80.b;
                long j2 = andIncrement / j;
                int i = (int) (andIncrement % j);
                if (hm0Var3.X != j2) {
                    hm0 t = v80Var.t(j2, hm0Var3);
                    if (t == null) {
                        continue;
                    } else {
                        hm0Var = t;
                    }
                } else {
                    hm0Var = hm0Var3;
                }
                v80 v80Var2 = v80Var;
                Object U = v80Var2.U(hm0Var, i, andIncrement, null);
                gr1 gr1Var = x80.m;
                if (U != gr1Var) {
                    gr1 gr1Var2 = x80.o;
                    if (U == gr1Var2) {
                        if (andIncrement < v80Var2.z()) {
                            hm0Var.a();
                        }
                        v80Var = v80Var2;
                        hm0Var3 = hm0Var;
                    } else if (U == x80.n) {
                        qn2 qn2Var = v80Var2.B;
                        rj0 C = n16.C(np2.V(r41Var));
                        try {
                            Object U2 = v80Var2.U(hm0Var, i, andIncrement, C);
                            if (U2 == gr1Var) {
                                C.a(hm0Var, i);
                            } else if (U2 == gr1Var2) {
                                if (andIncrement < v80Var2.z()) {
                                    hm0Var.a();
                                }
                                hm0 hm0Var4 = (hm0) atomicReferenceFieldUpdater.get(v80Var2);
                                while (true) {
                                    if (v80Var2.F()) {
                                        C.i(new em5(v80Var2.x()));
                                        break;
                                    }
                                    rj0 rj0Var = C;
                                    try {
                                        long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(v80Var2);
                                        long j3 = x80.b;
                                        long j4 = andIncrement2 / j3;
                                        int i2 = (int) (andIncrement2 % j3);
                                        if (hm0Var4.X != j4) {
                                            try {
                                                hm0 t2 = v80Var2.t(j4, hm0Var4);
                                                if (t2 == null) {
                                                    C = rj0Var;
                                                } else {
                                                    hm0Var2 = t2;
                                                }
                                            } catch (Throwable th2) {
                                                th = th2;
                                                C = rj0Var;
                                                C.E();
                                                throw th;
                                            }
                                        } else {
                                            hm0Var2 = hm0Var4;
                                        }
                                        v80 v80Var3 = v80Var2;
                                        U2 = v80Var3.U(hm0Var2, i2, andIncrement2, rj0Var);
                                        v80Var2 = v80Var3;
                                        hm0 hm0Var5 = hm0Var2;
                                        C = rj0Var;
                                        if (U2 == x80.m) {
                                            C.a(hm0Var5, i2);
                                            break;
                                        } else if (U2 == x80.o) {
                                            if (andIncrement2 < v80Var2.z()) {
                                                hm0Var5.a();
                                            }
                                            hm0Var4 = hm0Var5;
                                        } else if (U2 != x80.n) {
                                            hm0Var5.a();
                                            if (qn2Var != null) {
                                            }
                                        } else {
                                            throw new IllegalStateException("unexpected");
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        C = rj0Var;
                                        th = th;
                                        C.E();
                                        throw th;
                                    }
                                }
                                C.t(U2, o80Var);
                            } else {
                                hm0Var.a();
                            }
                            Object s = C.s();
                            x61 x61Var = x61.COROUTINE_SUSPENDED;
                            return s;
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    } else {
                        hm0Var.a();
                        return U;
                    }
                } else {
                    i.m("unexpected");
                    return null;
                }
            }
            Throwable x = v80Var.x();
            int i3 = to6.a;
            throw x;
        }
        u34.a();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object M(v80 v80Var, s41 s41Var) {
        t80 t80Var;
        int i;
        hm0 hm0Var;
        if (s41Var instanceof t80) {
            t80Var = (t80) s41Var;
            int i2 = t80Var.Y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                t80Var.Y = i2 - Integer.MIN_VALUE;
                t80 t80Var2 = t80Var;
                Object obj = t80Var2.R;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = t80Var2.Y;
                if (i == 0) {
                    if (i == 1) {
                        oi2.Y(obj);
                        return ((gm0) obj).a;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                e0.getClass();
                hm0 hm0Var2 = (hm0) v36.a.getObjectVolatile(v80Var, l0);
                while (!v80Var.F()) {
                    long andIncrement = X.getAndIncrement(v80Var);
                    long j = x80.b;
                    long j2 = andIncrement / j;
                    int i3 = (int) (andIncrement % j);
                    if (hm0Var2.X != j2) {
                        hm0 t = v80Var.t(j2, hm0Var2);
                        if (t == null) {
                            continue;
                        } else {
                            hm0Var = t;
                        }
                    } else {
                        hm0Var = hm0Var2;
                    }
                    v80 v80Var2 = v80Var;
                    Object U = v80Var2.U(hm0Var, i3, andIncrement, null);
                    if (U != x80.m) {
                        if (U == x80.o) {
                            if (andIncrement < v80Var2.z()) {
                                hm0Var.a();
                            }
                            v80Var = v80Var2;
                            hm0Var2 = hm0Var;
                        } else if (U == x80.n) {
                            t80Var2.Y = 1;
                            Object N = v80Var2.N(hm0Var, i3, andIncrement, t80Var2);
                            if (N == x61Var) {
                                return x61Var;
                            }
                            return N;
                        } else {
                            hm0Var.a();
                            return U;
                        }
                    } else {
                        i.m("unexpected");
                        return null;
                    }
                }
                return new em0(v80Var.v());
            }
        }
        t80Var = new t80(v80Var, s41Var);
        t80 t80Var22 = t80Var;
        Object obj2 = t80Var22.R;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = t80Var22.Y;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x014a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object Q(v80 v80Var, Object obj, r41 r41Var) {
        jg7 jg7Var;
        Object s;
        x61 x61Var;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d0;
        atomicReferenceFieldUpdater.getClass();
        hm0 hm0Var = (hm0) v36.a.getObjectVolatile(v80Var, m0);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = R;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(v80Var);
            long j = andIncrement & 1152921504606846975L;
            boolean E = v80Var.E(andIncrement, false);
            int i = x80.b;
            long j2 = i;
            long j3 = j / j2;
            int i2 = (int) (j % j2);
            int i3 = (hm0Var.X > j3 ? 1 : (hm0Var.X == j3 ? 0 : -1));
            jg7Var = jg7.a;
            if (i3 != 0) {
                hm0 u = v80Var.u(j3, hm0Var);
                if (u == null) {
                    if (E) {
                        Object K = v80Var.K(r41Var, obj);
                        if (K == x61.COROUTINE_SUSPENDED) {
                            return K;
                        }
                    }
                } else {
                    hm0Var = u;
                }
            }
            int d = d(v80Var, hm0Var, i2, obj, j, null, E);
            if (d != 0) {
                if (d == 1) {
                    break;
                } else if (d != 2) {
                    AtomicLongFieldUpdater atomicLongFieldUpdater2 = X;
                    if (d != 3) {
                        if (d != 4) {
                            if (d == 5) {
                                hm0Var.a();
                            }
                        } else {
                            if (j < atomicLongFieldUpdater2.get(v80Var)) {
                                hm0Var.a();
                            }
                            Object K2 = v80Var.K(r41Var, obj);
                            if (K2 == x61.COROUTINE_SUSPENDED) {
                                return K2;
                            }
                        }
                    } else {
                        rj0 C = n16.C(np2.V(r41Var));
                        try {
                            int d2 = d(v80Var, hm0Var, i2, obj, j, C, false);
                            if (d2 != 0) {
                                if (d2 != 1) {
                                    if (d2 != 2) {
                                        if (d2 != 4) {
                                            String str = "unexpected";
                                            if (d2 == 5) {
                                                hm0Var.a();
                                                hm0 hm0Var2 = (hm0) atomicReferenceFieldUpdater.get(v80Var);
                                                while (true) {
                                                    long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(v80Var);
                                                    long j4 = andIncrement2 & 1152921504606846975L;
                                                    boolean E2 = v80Var.E(andIncrement2, false);
                                                    int i4 = x80.b;
                                                    long j5 = i4;
                                                    AtomicLongFieldUpdater atomicLongFieldUpdater3 = atomicLongFieldUpdater;
                                                    long j6 = j4 / j5;
                                                    int i5 = (int) (j4 % j5);
                                                    String str2 = str;
                                                    if (hm0Var2.X != j6) {
                                                        hm0 u2 = v80Var.u(j6, hm0Var2);
                                                        if (u2 == null) {
                                                            if (E2) {
                                                                break;
                                                            }
                                                            str = str2;
                                                            atomicLongFieldUpdater = atomicLongFieldUpdater3;
                                                        } else {
                                                            hm0Var2 = u2;
                                                        }
                                                    }
                                                    int d3 = d(v80Var, hm0Var2, i5, obj, j4, C, E2);
                                                    if (d3 != 0) {
                                                        if (d3 == 1) {
                                                            break;
                                                        } else if (d3 != 2) {
                                                            if (d3 != 3) {
                                                                if (d3 != 4) {
                                                                    if (d3 == 5) {
                                                                        hm0Var2.a();
                                                                    }
                                                                    str = str2;
                                                                    atomicLongFieldUpdater = atomicLongFieldUpdater3;
                                                                } else if (j4 < atomicLongFieldUpdater2.get(v80Var)) {
                                                                    hm0Var2.a();
                                                                }
                                                            } else {
                                                                throw new IllegalStateException(str2);
                                                            }
                                                        } else if (E2) {
                                                            hm0Var2.n();
                                                        } else {
                                                            C.a(hm0Var2, i5 + i4);
                                                        }
                                                    } else {
                                                        hm0Var2.a();
                                                        break;
                                                    }
                                                }
                                            } else {
                                                throw new IllegalStateException("unexpected");
                                            }
                                        } else if (j < atomicLongFieldUpdater2.get(v80Var)) {
                                            hm0Var.a();
                                        }
                                        b(v80Var, obj, C);
                                    } else {
                                        C.a(hm0Var, i2 + i);
                                    }
                                    s = C.s();
                                    x61Var = x61.COROUTINE_SUSPENDED;
                                    if (s != x61Var) {
                                        s = jg7Var;
                                    }
                                    if (s != x61Var) {
                                        return s;
                                    }
                                }
                            } else {
                                hm0Var.a();
                            }
                            C.i(jg7Var);
                            s = C.s();
                            x61Var = x61.COROUTINE_SUSPENDED;
                            if (s != x61Var) {
                            }
                            if (s != x61Var) {
                                break;
                            }
                        } catch (Throwable th) {
                            C.E();
                            throw th;
                        }
                    }
                } else if (E) {
                    hm0Var.n();
                    Object K3 = v80Var.K(r41Var, obj);
                    if (K3 == x61.COROUTINE_SUSPENDED) {
                        return K3;
                    }
                }
            } else {
                hm0Var.a();
                return jg7Var;
            }
        }
        return jg7Var;
    }

    public static final void b(v80 v80Var, Object obj, rj0 rj0Var) {
        qn2 qn2Var = v80Var.B;
        if (qn2Var != null) {
            oi2.k(qn2Var, obj, rj0Var.X);
        }
        rj0Var.i(new em5(v80Var.y()));
    }

    public static final int d(v80 v80Var, hm0 hm0Var, int i, Object obj, long j, Object obj2, boolean z) {
        hm0Var.s(i, obj);
        if (z) {
            return v80Var.V(hm0Var, i, obj, j, obj2, z);
        }
        Object q = hm0Var.q(i);
        if (q == null) {
            if (v80Var.g(j)) {
                if (hm0Var.p(i, null, x80.d)) {
                    return 1;
                }
            } else if (obj2 == null) {
                return 3;
            } else {
                if (hm0Var.p(i, null, obj2)) {
                    return 2;
                }
            }
        } else if (q instanceof zr7) {
            hm0Var.s(i, null);
            if (v80Var.R(q, obj)) {
                hm0Var.t(i, x80.i);
                return 0;
            }
            gr1 gr1Var = x80.k;
            if (hm0Var.d0.getAndSet((i * 2) + 1, gr1Var) != gr1Var) {
                hm0Var.r(i, true);
                return 5;
            }
            return 5;
        }
        return v80Var.V(hm0Var, i, obj, j, obj2, z);
    }

    public final boolean A() {
        while (true) {
            e0.getClass();
            Unsafe unsafe = v36.a;
            long j = l0;
            hm0 hm0Var = (hm0) unsafe.getObjectVolatile(this, j);
            AtomicLongFieldUpdater atomicLongFieldUpdater = X;
            long j2 = atomicLongFieldUpdater.get(this);
            if (z() > j2) {
                long j3 = x80.b;
                long j4 = j2 / j3;
                if (hm0Var.X != j4 && (hm0Var = t(j4, hm0Var)) == null) {
                    if (((hm0) unsafe.getObjectVolatile(this, j)).X < j4) {
                        return false;
                    }
                } else {
                    hm0Var.a();
                    int i = (int) (j2 % j3);
                    while (true) {
                        Object q = hm0Var.q(i);
                        if (q != null && q != x80.e) {
                            if (q != x80.d) {
                                if (q != x80.j && q != x80.l && q != x80.i && q != x80.h) {
                                    if (q != x80.g) {
                                        if (q != x80.f && j2 == atomicLongFieldUpdater.get(this)) {
                                            return true;
                                        }
                                    } else {
                                        return true;
                                    }
                                }
                            } else {
                                return true;
                            }
                        } else if (hm0Var.p(i, q, x80.h)) {
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
        gr1 gr1Var;
        v80 v80Var;
        loop0: while (true) {
            h0.getClass();
            Unsafe unsafe = v36.a;
            long j = k0;
            objectVolatile = unsafe.getObjectVolatile(this, j);
            if (objectVolatile == null) {
                gr1Var = x80.q;
            } else {
                gr1Var = x80.r;
            }
            gr1 gr1Var2 = gr1Var;
            while (true) {
                Unsafe unsafe2 = v36.a;
                v80Var = this;
                if (unsafe2.compareAndSwapObject(v80Var, k0, objectVolatile, gr1Var2)) {
                    break loop0;
                } else if (unsafe2.getObjectVolatile(v80Var, j) != objectVolatile) {
                    break;
                } else {
                    this = v80Var;
                }
            }
            this = v80Var;
        }
        if (objectVolatile == null) {
            return;
        }
        ge7.p(1, objectVolatile);
        ((qn2) objectVolatile).g(v80Var.v());
    }

    public final void D(rp2 rp2Var) {
        Unsafe unsafe;
        while (true) {
            h0.getClass();
            Unsafe unsafe2 = v36.a;
            v80 v80Var = this;
            if (unsafe2.compareAndSwapObject(v80Var, k0, (Object) null, rp2Var)) {
                return;
            }
            long j = k0;
            if (unsafe2.getObjectVolatile(v80Var, j) != null) {
                while (true) {
                    Object objectVolatile = v36.a.getObjectVolatile(v80Var, j);
                    gr1 gr1Var = x80.q;
                    if (objectVolatile == gr1Var) {
                        gr1 gr1Var2 = x80.r;
                        do {
                            v80 v80Var2 = v80Var;
                            unsafe = v36.a;
                            boolean compareAndSwapObject = unsafe.compareAndSwapObject(v80Var2, k0, gr1Var, gr1Var2);
                            v80Var = v80Var2;
                            if (compareAndSwapObject) {
                                rp2Var.g(v80Var.v());
                                return;
                            }
                        } while (unsafe.getObjectVolatile(v80Var, j) == gr1Var);
                    } else if (objectVolatile == x80.r) {
                        i.m("Another handler was already registered and successfully invoked");
                        return;
                    } else {
                        e41.h(objectVolatile, "Another handler is already registered: ");
                        return;
                    }
                }
            } else {
                this = v80Var;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00c0, code lost:
        r13 = (defpackage.hm0) r13.f();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean E(long j, boolean z) {
        zr7 zr7Var;
        int i = (int) (j >> 60);
        if (i != 0 && i != 1) {
            if (i != 2) {
                if (i == 3) {
                    hm0 n = n(j & 1152921504606846975L);
                    ug ugVar = null;
                    Object obj = null;
                    loop0: do {
                        AtomicReferenceArray atomicReferenceArray = n.d0;
                        int i2 = x80.b - 1;
                        while (true) {
                            if (-1 >= i2) {
                                break;
                            }
                            long j2 = (n.X * x80.b) + i2;
                            while (true) {
                                Object q = n.q(i2);
                                if (q == x80.i) {
                                    break loop0;
                                }
                                gr1 gr1Var = x80.d;
                                AtomicLongFieldUpdater atomicLongFieldUpdater = X;
                                qn2 qn2Var = this.B;
                                if (q == gr1Var) {
                                    if (j2 < atomicLongFieldUpdater.get(this)) {
                                        break loop0;
                                    } else if (n.p(i2, q, x80.l)) {
                                        if (qn2Var != null) {
                                            ugVar = oi2.l(qn2Var, atomicReferenceArray.get(i2 * 2), ugVar);
                                        }
                                        n.s(i2, null);
                                        n.n();
                                    }
                                } else if (q != x80.e && q != null) {
                                    if (!(q instanceof zr7) && !(q instanceof as7)) {
                                        gr1 gr1Var2 = x80.g;
                                        if (q == gr1Var2 || q == x80.f) {
                                            break loop0;
                                        } else if (q != gr1Var2) {
                                            break;
                                        }
                                    } else if (j2 < atomicLongFieldUpdater.get(this)) {
                                        break loop0;
                                    } else {
                                        if (q instanceof as7) {
                                            zr7Var = ((as7) q).a;
                                        } else {
                                            zr7Var = (zr7) q;
                                        }
                                        if (n.p(i2, q, x80.l)) {
                                            if (qn2Var != null) {
                                                ugVar = oi2.l(qn2Var, atomicReferenceArray.get(i2 * 2), ugVar);
                                            }
                                            obj = ii2.M(obj, zr7Var);
                                            n.s(i2, null);
                                            n.n();
                                        }
                                    }
                                } else if (n.p(i2, q, x80.l)) {
                                    n.n();
                                    break;
                                }
                            }
                            i2--;
                        }
                    } while (n != null);
                    if (obj != null) {
                        if (!(obj instanceof ArrayList)) {
                            P((zr7) obj, false);
                        } else {
                            ArrayList arrayList = (ArrayList) obj;
                            for (int size = arrayList.size() - 1; -1 < size; size--) {
                                P((zr7) arrayList.get(size), false);
                            }
                        }
                    }
                    if (ugVar != null) {
                        throw ugVar;
                    }
                } else {
                    u34.f(lb1.g(i, "unexpected close status: "));
                    return false;
                }
            } else {
                n(j & 1152921504606846975L);
                if (!z || !A()) {
                }
            }
            return true;
        }
        return false;
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
    */
    public final void J(long j, hm0 hm0Var) {
        v80 v80Var;
        hm0 hm0Var2;
        hm0 hm0Var3;
        while (hm0Var.X < j && (hm0Var3 = (hm0) hm0Var.d()) != null) {
            hm0Var = hm0Var3;
        }
        while (true) {
            hm0 hm0Var4 = hm0Var;
            while (hm0Var4.g() && (hm0Var2 = (hm0) hm0Var4.d()) != null) {
                hm0Var4 = hm0Var2;
            }
            while (true) {
                f0.getClass();
                Unsafe unsafe = v36.a;
                long j2 = j0;
                p96 p96Var = (p96) unsafe.getObjectVolatile(this, j2);
                if (p96Var.X < hm0Var4.X) {
                    if (!hm0Var4.o()) {
                        break;
                    }
                    while (true) {
                        Unsafe unsafe2 = v36.a;
                        v80Var = this;
                        if (unsafe2.compareAndSwapObject(v80Var, j0, p96Var, hm0Var4)) {
                            if (p96Var.k()) {
                                p96Var.i();
                                return;
                            }
                            return;
                        } else if (unsafe2.getObjectVolatile(v80Var, j2) != p96Var) {
                            break;
                        } else {
                            this = v80Var;
                        }
                    }
                } else {
                    return;
                }
                this = v80Var;
            }
            hm0Var = hm0Var4;
        }
    }

    public final Object K(r41 r41Var, Object obj) {
        ug l;
        rj0 rj0Var = new rj0(1, np2.V(r41Var));
        rj0Var.v();
        qn2 qn2Var = this.B;
        if (qn2Var != null && (l = oi2.l(qn2Var, obj, null)) != null) {
            mb3.q(l, y());
            rj0Var.i(new em5(l));
        } else {
            rj0Var.i(new em5(y()));
        }
        Object s = rj0Var.s();
        if (s == x61.COROUTINE_SUSPENDED) {
            return s;
        }
        return jg7.a;
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
    */
    public final Object N(hm0 hm0Var, int i, long j, s41 s41Var) {
        u80 u80Var;
        int i2;
        gm0 gm0Var;
        hm0 hm0Var2;
        if (s41Var instanceof u80) {
            u80Var = (u80) s41Var;
            int i3 = u80Var.Y;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                u80Var.Y = i3 - Integer.MIN_VALUE;
                Object obj = u80Var.R;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i2 = u80Var.Y;
                o80 o80Var = null;
                if (i2 == 0) {
                    if (i2 == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    u80Var.Y = 1;
                    rj0 C = n16.C(np2.V(u80Var));
                    try {
                        bf5 bf5Var = new bf5(C);
                        Object U = U(hm0Var, i, j, bf5Var);
                        if (U == x80.m) {
                            bf5Var.a(hm0Var, i);
                        } else {
                            Object obj2 = x80.o;
                            qn2 qn2Var = this.B;
                            if (U == obj2) {
                                if (j < z()) {
                                    hm0Var.a();
                                }
                                hm0 hm0Var3 = (hm0) e0.get(this);
                                while (true) {
                                    if (F()) {
                                        C.i(new gm0(new em0(v())));
                                        break;
                                    }
                                    long andIncrement = X.getAndIncrement(this);
                                    long j2 = x80.b;
                                    long j3 = andIncrement / j2;
                                    int i4 = (int) (andIncrement % j2);
                                    if (hm0Var3.X != j3) {
                                        hm0 t = t(j3, hm0Var3);
                                        if (t != null) {
                                            hm0Var2 = t;
                                        }
                                    } else {
                                        hm0Var2 = hm0Var3;
                                    }
                                    Object U2 = U(hm0Var2, i4, andIncrement, bf5Var);
                                    hm0 hm0Var4 = hm0Var2;
                                    if (U2 == x80.m) {
                                        bf5Var.a(hm0Var4, i4);
                                        break;
                                    } else if (U2 == x80.o) {
                                        if (andIncrement < z()) {
                                            hm0Var4.a();
                                        }
                                        hm0Var3 = hm0Var4;
                                    } else if (U2 != x80.n) {
                                        hm0Var4.a();
                                        gm0Var = new gm0(U2);
                                    } else {
                                        throw new IllegalStateException("unexpected");
                                    }
                                }
                                C.t(gm0Var, o80Var);
                            } else {
                                hm0Var.a();
                                gm0Var = new gm0(U);
                            }
                        }
                        obj = C.s();
                        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                        if (obj == x61Var) {
                            return x61Var;
                        }
                    } catch (Throwable th) {
                        C.E();
                        throw th;
                    }
                }
                return ((gm0) obj).a;
            }
        }
        u80Var = new u80(this, s41Var);
        Object obj3 = u80Var.R;
        x61 x61Var3 = x61.COROUTINE_SUSPENDED;
        i2 = u80Var.Y;
        o80 o80Var2 = null;
        if (i2 == 0) {
        }
        return ((gm0) obj3).a;
    }

    public final void O(v96 v96Var) {
        hm0 hm0Var;
        v80 v80Var;
        v96 v96Var2;
        int i;
        v96 v96Var3;
        e0.getClass();
        hm0 hm0Var2 = (hm0) v36.a.getObjectVolatile(this, l0);
        while (!this.F()) {
            long andIncrement = X.getAndIncrement(this);
            long j = x80.b;
            long j2 = andIncrement / j;
            int i2 = (int) (andIncrement % j);
            if (hm0Var2.X != j2) {
                hm0 t = this.t(j2, hm0Var2);
                if (t == null) {
                    continue;
                } else {
                    hm0Var = t;
                    v96Var2 = v96Var;
                    i = i2;
                    v80Var = this;
                }
            } else {
                hm0Var = hm0Var2;
                v80Var = this;
                v96Var2 = v96Var;
                i = i2;
            }
            Object U = v80Var.U(hm0Var, i, andIncrement, v96Var2);
            hm0Var2 = hm0Var;
            if (U == x80.m) {
                if (v96Var2 != null) {
                    v96Var3 = v96Var2;
                } else {
                    v96Var3 = null;
                }
                if (v96Var3 != null) {
                    v96Var3.L = hm0Var2;
                    v96Var3.R = i;
                    return;
                }
                return;
            } else if (U == x80.o) {
                if (andIncrement < v80Var.z()) {
                    hm0Var2.a();
                }
                this = v80Var;
                v96Var = v96Var2;
            } else if (U != x80.n) {
                hm0Var2.a();
                v96Var2.X = U;
                return;
            } else {
                i.m("unexpected");
                return;
            }
        }
        v96Var.X = x80.l;
    }

    public final void P(zr7 zr7Var, boolean z) {
        Throwable y;
        if (zr7Var instanceof qj0) {
            r41 r41Var = (r41) zr7Var;
            if (z) {
                y = x();
            } else {
                y = y();
            }
            r41Var.i(new em5(y));
        } else if (zr7Var instanceof bf5) {
            ((bf5) zr7Var).A.i(new gm0(new em0(v())));
        } else if (zr7Var instanceof n80) {
            n80 n80Var = (n80) zr7Var;
            rj0 rj0Var = n80Var.B;
            rj0Var.getClass();
            n80Var.B = null;
            n80Var.A = x80.l;
            Throwable v = n80Var.L.v();
            if (v == null) {
                rj0Var.i(Boolean.FALSE);
            } else {
                rj0Var.i(new em5(v));
            }
        } else if (zr7Var instanceof v96) {
            ((v96) zr7Var).k(this, x80.l);
        } else {
            e41.h(zr7Var, "Unexpected waiter: ");
        }
    }

    public final boolean R(Object obj, Object obj2) {
        if (obj instanceof v96) {
            return ((v96) obj).k(this, obj2);
        }
        boolean z = obj instanceof bf5;
        qn2 qn2Var = this.B;
        fo2 fo2Var = null;
        if (z) {
            rj0 rj0Var = ((bf5) obj).A;
            gm0 gm0Var = new gm0(obj2);
            if (qn2Var != null) {
                fo2Var = f();
            }
            return x80.a(rj0Var, gm0Var, fo2Var);
        } else if (obj instanceof n80) {
            n80 n80Var = (n80) obj;
            rj0 rj0Var2 = n80Var.B;
            rj0Var2.getClass();
            n80Var.B = null;
            n80Var.A = obj2;
            Boolean bool = Boolean.TRUE;
            qn2 qn2Var2 = n80Var.L.B;
            if (qn2Var2 != null) {
                fo2Var = new l4(2, qn2Var2, obj2);
            }
            return x80.a(rj0Var2, bool, fo2Var);
        } else if (obj instanceof qj0) {
            qj0 qj0Var = (qj0) obj;
            if (qn2Var != null) {
                fo2Var = e();
            }
            return x80.a(qj0Var, obj2, fo2Var);
        } else {
            e41.h(obj, "Unexpected receiver type: ");
            return false;
        }
    }

    public final boolean S(Object obj, hm0 hm0Var, int i) {
        rc7 rc7Var;
        boolean z = obj instanceof qj0;
        jg7 jg7Var = jg7.a;
        if (z) {
            return x80.a((qj0) obj, jg7Var, null);
        }
        if (obj instanceof v96) {
            int l = ((v96) obj).l(this, jg7Var);
            if (l != 0) {
                if (l != 1) {
                    if (l != 2) {
                        if (l == 3) {
                            rc7Var = rc7.ALREADY_SELECTED;
                        } else {
                            u34.e(l, "Unexpected internal result: ");
                            return false;
                        }
                    } else {
                        rc7Var = rc7.CANCELLED;
                    }
                } else {
                    rc7Var = rc7.REREGISTER;
                }
            } else {
                rc7Var = rc7.SUCCESSFUL;
            }
            if (rc7Var == rc7.REREGISTER) {
                hm0Var.s(i, null);
            }
            if (rc7Var != rc7.SUCCESSFUL) {
                return false;
            }
            return true;
        }
        e41.h(obj, "Unexpected waiter: ");
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ae, code lost:
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object T(Object obj) {
        hm0 hm0Var;
        int i;
        v80 v80Var;
        gr1 gr1Var = x80.d;
        d0.getClass();
        hm0 hm0Var2 = (hm0) v36.a.getObjectVolatile(this, m0);
        while (true) {
            long andIncrement = R.getAndIncrement(this);
            long j = andIncrement & 1152921504606846975L;
            boolean E = this.E(andIncrement, false);
            int i2 = x80.b;
            long j2 = i2;
            long j3 = j / j2;
            int i3 = (int) (j % j2);
            if (hm0Var2.X != j3) {
                hm0Var = this.u(j3, hm0Var2);
                if (hm0Var == null) {
                    if (E) {
                        return new em0(this.y());
                    }
                } else {
                    v80Var = this;
                    i = i3;
                }
            } else {
                hm0Var = hm0Var2;
                i = i3;
                v80Var = this;
            }
            Object obj2 = obj;
            int d = d(v80Var, hm0Var, i, obj2, j, gr1Var, E);
            v80 v80Var2 = v80Var;
            hm0Var2 = hm0Var;
            jg7 jg7Var = jg7.a;
            if (d != 0) {
                if (d == 1) {
                    break;
                }
                zr7 zr7Var = null;
                if (d != 2) {
                    if (d != 3) {
                        if (d != 4) {
                            if (d == 5) {
                                hm0Var2.a();
                            }
                            this = v80Var2;
                            obj = obj2;
                        } else {
                            if (j < X.get(v80Var2)) {
                                hm0Var2.a();
                            }
                            return new em0(v80Var2.y());
                        }
                    } else {
                        i.m("unexpected");
                        return null;
                    }
                } else if (E) {
                    hm0Var2.n();
                    return new em0(v80Var2.y());
                } else {
                    if (gr1Var instanceof zr7) {
                        zr7Var = (zr7) gr1Var;
                    }
                    if (zr7Var != null) {
                        zr7Var.a(hm0Var2, i + i2);
                    }
                    v80Var2.q((hm0Var2.X * j2) + i);
                }
            } else {
                hm0Var2.a();
                return jg7Var;
            }
        }
    }

    public final Object U(hm0 hm0Var, int i, long j, Object obj) {
        Object q = hm0Var.q(i);
        AtomicReferenceArray atomicReferenceArray = hm0Var.d0;
        AtomicLongFieldUpdater atomicLongFieldUpdater = R;
        if (q == null) {
            if (j >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return x80.n;
                }
                if (hm0Var.p(i, q, obj)) {
                    r();
                    return x80.m;
                }
            }
        } else if (q == x80.d && hm0Var.p(i, q, x80.i)) {
            r();
            Object obj2 = atomicReferenceArray.get(i * 2);
            hm0Var.s(i, null);
            return obj2;
        }
        while (true) {
            Object q2 = hm0Var.q(i);
            if (q2 != null && q2 != x80.e) {
                if (q2 == x80.d) {
                    if (hm0Var.p(i, q2, x80.i)) {
                        r();
                        Object obj3 = atomicReferenceArray.get(i * 2);
                        hm0Var.s(i, null);
                        return obj3;
                    }
                } else {
                    gr1 gr1Var = x80.j;
                    if (q2 == gr1Var) {
                        return x80.o;
                    }
                    if (q2 == x80.h) {
                        return x80.o;
                    }
                    if (q2 == x80.l) {
                        r();
                        return x80.o;
                    } else if (q2 != x80.g && hm0Var.p(i, q2, x80.f)) {
                        boolean z = q2 instanceof as7;
                        if (z) {
                            q2 = ((as7) q2).a;
                        }
                        if (S(q2, hm0Var, i)) {
                            hm0Var.t(i, x80.i);
                            r();
                            Object obj4 = atomicReferenceArray.get(i * 2);
                            hm0Var.s(i, null);
                            return obj4;
                        }
                        hm0Var.t(i, gr1Var);
                        hm0Var.n();
                        if (z) {
                            r();
                        }
                        return x80.o;
                    }
                }
            } else if (j < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (hm0Var.p(i, q2, x80.h)) {
                    r();
                    return x80.o;
                }
            } else if (obj == null) {
                return x80.n;
            } else {
                if (hm0Var.p(i, q2, obj)) {
                    r();
                    return x80.m;
                }
            }
        }
    }

    public final int V(hm0 hm0Var, int i, Object obj, long j, Object obj2, boolean z) {
        while (true) {
            Object q = hm0Var.q(i);
            if (q == null) {
                if (g(j) && !z) {
                    if (hm0Var.p(i, null, x80.d)) {
                        break;
                    }
                } else if (z) {
                    if (hm0Var.p(i, null, x80.j)) {
                        hm0Var.n();
                        return 4;
                    }
                } else if (obj2 == null) {
                    return 3;
                } else {
                    if (hm0Var.p(i, null, obj2)) {
                        return 2;
                    }
                }
            } else if (q == x80.e) {
                if (hm0Var.p(i, q, x80.d)) {
                    break;
                }
            } else {
                gr1 gr1Var = x80.k;
                if (q == gr1Var) {
                    hm0Var.s(i, null);
                    return 5;
                } else if (q == x80.h) {
                    hm0Var.s(i, null);
                    return 5;
                } else if (q == x80.l) {
                    hm0Var.s(i, null);
                    G();
                    return 4;
                } else {
                    hm0Var.s(i, null);
                    if (q instanceof as7) {
                        q = ((as7) q).a;
                    }
                    if (R(q, obj)) {
                        hm0Var.t(i, x80.i);
                        return 0;
                    }
                    if (hm0Var.d0.getAndSet((i * 2) + 1, gr1Var) != gr1Var) {
                        hm0Var.r(i, true);
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
        v80 v80Var = this;
        if (!v80Var.I()) {
            while (true) {
                atomicLongFieldUpdater = Y;
                if (atomicLongFieldUpdater.get(v80Var) > j) {
                    break;
                }
                v80Var = this;
            }
            int i = x80.c;
            int i2 = 0;
            while (true) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = Z;
                if (i2 < i) {
                    long j2 = atomicLongFieldUpdater.get(v80Var);
                    if (j2 != (4611686018427387903L & atomicLongFieldUpdater2.get(v80Var)) || j2 != atomicLongFieldUpdater.get(v80Var)) {
                        i2++;
                    } else {
                        return;
                    }
                } else {
                    while (true) {
                        long j3 = atomicLongFieldUpdater2.get(v80Var);
                        if (atomicLongFieldUpdater2.compareAndSet(v80Var, j3, (j3 & 4611686018427387903L) + 4611686018427387904L)) {
                            break;
                        }
                        v80Var = this;
                    }
                    while (true) {
                        long j4 = atomicLongFieldUpdater.get(v80Var);
                        long j5 = atomicLongFieldUpdater2.get(v80Var);
                        long j6 = j5 & 4611686018427387903L;
                        if ((j5 & 4611686018427387904L) != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (j4 == j6 && j4 == atomicLongFieldUpdater.get(v80Var)) {
                            break;
                        } else if (!z) {
                            v80Var = this;
                            atomicLongFieldUpdater2.compareAndSet(v80Var, j5, 4611686018427387904L + j6);
                        } else {
                            v80Var = this;
                        }
                    }
                    while (true) {
                        long j7 = atomicLongFieldUpdater2.get(v80Var);
                        if (atomicLongFieldUpdater2.compareAndSet(v80Var, j7, j7 & 4611686018427387903L)) {
                            return;
                        }
                        v80Var = this;
                    }
                }
            }
        }
    }

    @Override // defpackage.ob6
    public Object a(r41 r41Var, Object obj) {
        return Q(this, obj, r41Var);
    }

    @Override // defpackage.ob6
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
        fm0 fm0Var = gm0.b;
        if (z) {
            return fm0Var;
        }
        gr1 gr1Var = x80.j;
        d0.getClass();
        hm0 hm0Var = (hm0) v36.a.getObjectVolatile(this, m0);
        while (true) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j3 = andIncrement & j2;
            boolean E = E(andIncrement, z2);
            int i = x80.b;
            long j4 = i;
            long j5 = j3 / j4;
            int i2 = (int) (j3 % j4);
            if (hm0Var.X != j5) {
                hm0 u = u(j5, hm0Var);
                if (u == null) {
                    if (E) {
                        return new em0(y());
                    }
                    z2 = false;
                    j2 = 1152921504606846975L;
                } else {
                    hm0Var = u;
                }
            }
            int d = d(this, hm0Var, i2, obj, j3, gr1Var, E);
            jg7 jg7Var = jg7.a;
            if (d != 0) {
                if (d != 1) {
                    zr7 zr7Var = null;
                    if (d != 2) {
                        if (d != 3) {
                            if (d != 4) {
                                if (d == 5) {
                                    hm0Var.a();
                                }
                                z2 = false;
                                j2 = 1152921504606846975L;
                            } else {
                                if (j3 < X.get(this)) {
                                    hm0Var.a();
                                }
                                return new em0(y());
                            }
                        } else {
                            i.m("unexpected");
                            return null;
                        }
                    } else if (E) {
                        hm0Var.n();
                        return new em0(y());
                    } else {
                        if (gr1Var instanceof zr7) {
                            zr7Var = (zr7) gr1Var;
                        }
                        if (zr7Var != null) {
                            zr7Var.a(hm0Var, i2 + i);
                        }
                        hm0Var.n();
                        return fm0Var;
                    }
                } else {
                    return jg7Var;
                }
            } else {
                hm0Var.a();
                return jg7Var;
            }
        }
    }

    public final o80 e() {
        return new o80(3, this, v80.class, "onCancellationImplDoNotCall", "onCancellationImplDoNotCall(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0, 0, 0);
    }

    public final o80 f() {
        return new o80(3, this, v80.class, "onCancellationChannelResultImplDoNotCall", "onCancellationChannelResultImplDoNotCall-5_sEAP8(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0, 0, 1);
    }

    public final boolean g(long j) {
        if (j >= Y.get(this) && j >= X.get(this) + this.A) {
            return false;
        }
        return true;
    }

    @Override // defpackage.ul0
    public final void h(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        k(cancellationException, true);
    }

    public final boolean i(Throwable th) {
        return k(th, false);
    }

    @Override // defpackage.ul0
    public final n80 iterator() {
        return new n80(this);
    }

    public final hm0 j() {
        f0.getClass();
        Unsafe unsafe = v36.a;
        hm0 objectVolatile = unsafe.getObjectVolatile(this, j0);
        d0.getClass();
        hm0 hm0Var = (hm0) unsafe.getObjectVolatile(this, m0);
        if (hm0Var.X > ((hm0) objectVolatile).X) {
            objectVolatile = hm0Var;
        }
        e0.getClass();
        hm0 hm0Var2 = (hm0) unsafe.getObjectVolatile(this, l0);
        if (hm0Var2.X > ((hm0) objectVolatile).X) {
            objectVolatile = hm0Var2;
        }
        vy0 vy0Var = (vy0) objectVolatile;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = vy0.A;
            Object e = vy0Var.e();
            if (e == uy0.a) {
                break;
            }
            vy0 vy0Var2 = (vy0) e;
            if (vy0Var2 == null) {
                if (vy0Var.h()) {
                    break;
                }
            } else {
                vy0Var = vy0Var2;
            }
        }
        return (hm0) vy0Var;
    }

    public final boolean k(Throwable th, boolean z) {
        v80 v80Var;
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
                hm0 hm0Var = x80.a;
                v80Var = this;
                if (atomicLongFieldUpdater.compareAndSet(v80Var, j4, (j4 & 1152921504606846975L) + 1152921504606846976L)) {
                    break;
                }
                this = v80Var;
            }
        }
        v80Var = this;
        gr1 gr1Var = x80.s;
        while (true) {
            g0.getClass();
            v80 v80Var2 = v80Var;
            Unsafe unsafe = v36.a;
            long j5 = i0;
            Throwable th2 = th;
            boolean compareAndSwapObject = unsafe.compareAndSwapObject(v80Var2, j5, gr1Var, th2);
            v80Var = v80Var2;
            if (compareAndSwapObject) {
                z2 = true;
                break;
            } else if (unsafe.getObjectVolatile(v80Var, j5) != gr1Var) {
                z2 = false;
                break;
            } else {
                th = th2;
            }
        }
        if (z) {
            do {
                j3 = atomicLongFieldUpdater.get(v80Var);
            } while (!atomicLongFieldUpdater.compareAndSet(v80Var, j3, 3458764513820540928L + (j3 & 1152921504606846975L)));
        } else {
            do {
                j = atomicLongFieldUpdater.get(v80Var);
                int i = (int) (j >> 60);
                if (i != 0) {
                    if (i != 1) {
                        break;
                    }
                    j2 = (j & 1152921504606846975L) + 3458764513820540928L;
                } else {
                    j2 = (j & 1152921504606846975L) + 2305843009213693952L;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(v80Var, j, j2));
        }
        v80Var.G();
        if (z2) {
            v80Var.C();
        }
        return z2;
    }

    @Override // defpackage.ul0
    public final eb l() {
        r80 r80Var = r80.d0;
        ge7.p(3, r80Var);
        s80 s80Var = s80.d0;
        ge7.p(3, s80Var);
        return new eb(this, r80Var, s80Var, this.L, 19);
    }

    @Override // defpackage.ul0
    public final Object m() {
        hm0 hm0Var;
        AtomicLongFieldUpdater atomicLongFieldUpdater = X;
        long j = atomicLongFieldUpdater.get(this);
        long j2 = R.get(this);
        if (E(j2, true)) {
            return new em0(v());
        }
        int i = (j > (j2 & 1152921504606846975L) ? 1 : (j == (j2 & 1152921504606846975L) ? 0 : -1));
        fm0 fm0Var = gm0.b;
        if (i >= 0) {
            return fm0Var;
        }
        gr1 gr1Var = x80.k;
        e0.getClass();
        hm0 hm0Var2 = (hm0) v36.a.getObjectVolatile(this, l0);
        while (!this.F()) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j3 = x80.b;
            long j4 = andIncrement / j3;
            int i2 = (int) (andIncrement % j3);
            if (hm0Var2.X != j4) {
                hm0 t = this.t(j4, hm0Var2);
                if (t == null) {
                    continue;
                } else {
                    hm0Var = t;
                }
            } else {
                hm0Var = hm0Var2;
            }
            v80 v80Var = this;
            Object U = v80Var.U(hm0Var, i2, andIncrement, gr1Var);
            hm0Var2 = hm0Var;
            zr7 zr7Var = null;
            if (U == x80.m) {
                if (gr1Var instanceof zr7) {
                    zr7Var = (zr7) gr1Var;
                }
                if (zr7Var != null) {
                    zr7Var.a(hm0Var2, i2);
                }
                v80Var.W(andIncrement);
                hm0Var2.n();
                return fm0Var;
            } else if (U == x80.o) {
                if (andIncrement < v80Var.z()) {
                    hm0Var2.a();
                }
                this = v80Var;
            } else if (U != x80.n) {
                hm0Var2.a();
                return U;
            } else {
                i.m("unexpected");
                return null;
            }
        }
        return new em0(this.v());
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0046, code lost:
        r1 = (defpackage.hm0) r1.f();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final hm0 n(long j) {
        long j2;
        hm0 j3 = j();
        if (H()) {
            hm0 hm0Var = j3;
            loop0: do {
                int i = x80.b - 1;
                while (true) {
                    if (-1 >= i) {
                        break;
                    }
                    j2 = (hm0Var.X * x80.b) + i;
                    if (j2 < X.get(this)) {
                        break loop0;
                    }
                    while (true) {
                        Object q = hm0Var.q(i);
                        if (q != null && q != x80.e) {
                            if (q == x80.d) {
                                break loop0;
                            }
                        } else if (hm0Var.p(i, q, x80.l)) {
                            hm0Var.n();
                            break;
                        }
                    }
                    i--;
                }
            } while (hm0Var != null);
            j2 = -1;
            if (j2 != -1) {
                q(j2);
            }
        }
        Object obj = null;
        hm0 hm0Var2 = j3;
        loop3: while (hm0Var2 != null) {
            int i2 = x80.b - 1;
            obj = obj;
            while (-1 < i2) {
                if ((hm0Var2.X * x80.b) + i2 < j) {
                    break loop3;
                }
                while (true) {
                    Object q2 = hm0Var2.q(i2);
                    if (q2 != null && q2 != x80.e) {
                        if (q2 instanceof as7) {
                            if (hm0Var2.p(i2, q2, x80.l)) {
                                obj = ii2.M(obj, ((as7) q2).a);
                                hm0Var2.r(i2, true);
                                break;
                            }
                        } else if (!(q2 instanceof zr7)) {
                            break;
                        } else if (hm0Var2.p(i2, q2, x80.l)) {
                            obj = ii2.M(obj, q2);
                            hm0Var2.r(i2, true);
                            break;
                        }
                    } else if (hm0Var2.p(i2, q2, x80.l)) {
                        hm0Var2.n();
                        break;
                    }
                }
                i2--;
                obj = obj;
            }
            hm0Var2 = (hm0) hm0Var2.f();
            obj = obj;
        }
        if (obj != null) {
            if (!(obj instanceof ArrayList)) {
                P((zr7) obj, true);
                return j3;
            }
            ArrayList arrayList = (ArrayList) obj;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                P((zr7) arrayList.get(size), true);
            }
        }
        return j3;
    }

    @Override // defpackage.ul0
    public final Object o(hw6 hw6Var) {
        return L(this, hw6Var);
    }

    @Override // defpackage.ul0
    public final Object p(cu0 cu0Var) {
        return M(this, cu0Var);
    }

    public final void q(long j) {
        ug l;
        e0.getClass();
        hm0 hm0Var = (hm0) v36.a.getObjectVolatile(this, l0);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = X;
            long j2 = atomicLongFieldUpdater.get(this);
            if (j < Math.max(this.A + j2, Y.get(this))) {
                return;
            }
            v80 v80Var = this;
            if (atomicLongFieldUpdater.compareAndSet(v80Var, j2, 1 + j2)) {
                long j3 = x80.b;
                long j4 = j2 / j3;
                int i = (int) (j2 % j3);
                if (hm0Var.X != j4) {
                    hm0 t = v80Var.t(j4, hm0Var);
                    if (t != null) {
                        hm0Var = t;
                    }
                }
                hm0 hm0Var2 = hm0Var;
                Object U = v80Var.U(hm0Var2, i, j2, null);
                if (U == x80.o) {
                    if (j2 < v80Var.z()) {
                        hm0Var2.a();
                    }
                } else {
                    hm0Var2.a();
                    qn2 qn2Var = v80Var.B;
                    if (qn2Var != null && (l = oi2.l(qn2Var, U, null)) != null) {
                        throw l;
                    }
                }
                this = v80Var;
                hm0Var = hm0Var2;
            }
            this = v80Var;
        }
    }

    public final void r() {
        v80 v80Var;
        if (I()) {
            return;
        }
        f0.getClass();
        hm0 hm0Var = (hm0) v36.a.getObjectVolatile(this, j0);
        loop0: while (true) {
            long andIncrement = Y.getAndIncrement(this);
            long j = x80.b;
            long j2 = andIncrement / j;
            if (this.z() <= andIncrement) {
                if (hm0Var.X < j2 && hm0Var.d() != null) {
                    this.J(j2, hm0Var);
                }
                B(this);
                return;
            }
            v80Var = this;
            if (hm0Var.X != j2) {
                hm0 s = v80Var.s(j2, hm0Var, andIncrement);
                if (s == null) {
                    continue;
                    this = v80Var;
                } else {
                    hm0Var = s;
                }
            }
            int i = (int) (andIncrement % j);
            Object q = hm0Var.q(i);
            boolean z = q instanceof zr7;
            AtomicLongFieldUpdater atomicLongFieldUpdater = X;
            if (z && andIncrement >= atomicLongFieldUpdater.get(v80Var) && hm0Var.p(i, q, x80.g)) {
                if (v80Var.S(q, hm0Var, i)) {
                    hm0Var.t(i, x80.d);
                    break;
                }
                hm0Var.t(i, x80.j);
                hm0Var.n();
                B(v80Var);
            } else {
                while (true) {
                    Object q2 = hm0Var.q(i);
                    if (q2 instanceof zr7) {
                        if (andIncrement < atomicLongFieldUpdater.get(v80Var)) {
                            if (hm0Var.p(i, q2, new as7((zr7) q2))) {
                                break loop0;
                            }
                        } else if (hm0Var.p(i, q2, x80.g)) {
                            if (v80Var.S(q2, hm0Var, i)) {
                                hm0Var.t(i, x80.d);
                                break;
                            } else {
                                hm0Var.t(i, x80.j);
                                hm0Var.n();
                            }
                        }
                    } else if (q2 != x80.j) {
                        if (q2 == null) {
                            if (hm0Var.p(i, q2, x80.e)) {
                                break loop0;
                            }
                        } else if (q2 == x80.d || q2 == x80.h || q2 == x80.i || q2 == x80.k || q2 == x80.l) {
                            break loop0;
                        } else if (q2 != x80.f) {
                            e41.h(q2, "Unexpected cell state: ");
                            return;
                        }
                    } else {
                        break;
                    }
                }
                B(v80Var);
            }
            this = v80Var;
        }
        B(v80Var);
    }

    public final hm0 s(long j, hm0 hm0Var, long j2) {
        Object a;
        Unsafe unsafe;
        hm0 hm0Var2 = x80.a;
        w80 w80Var = w80.d0;
        loop0: while (true) {
            a = uy0.a(hm0Var, j, w80Var);
            if (!oi2.J(a)) {
                p96 B = oi2.B(a);
                while (true) {
                    f0.getClass();
                    Unsafe unsafe2 = v36.a;
                    long j3 = j0;
                    p96 p96Var = (p96) unsafe2.getObjectVolatile(this, j3);
                    if (p96Var.X >= B.X) {
                        break loop0;
                    } else if (!B.o()) {
                        break;
                    } else {
                        do {
                            unsafe = v36.a;
                            if (unsafe.compareAndSwapObject(this, j0, p96Var, B)) {
                                if (p96Var.k()) {
                                    p96Var.i();
                                }
                            }
                        } while (unsafe.getObjectVolatile(this, j3) == p96Var);
                        if (B.k()) {
                            B.i();
                        }
                    }
                }
            } else {
                break;
            }
        }
        if (oi2.J(a)) {
            G();
            J(j, hm0Var);
            B(this);
            return null;
        }
        hm0 hm0Var3 = (hm0) oi2.B(a);
        long j4 = hm0Var3.X;
        if (j4 > j) {
            long j5 = j4 * x80.b;
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
        return hm0Var3;
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
    */
    public final hm0 t(long j, hm0 hm0Var) {
        Object a;
        hm0 hm0Var2;
        long j2;
        Unsafe unsafe;
        hm0 hm0Var3 = x80.a;
        w80 w80Var = w80.d0;
        loop0: while (true) {
            a = uy0.a(hm0Var, j, w80Var);
            if (!oi2.J(a)) {
                p96 B = oi2.B(a);
                while (true) {
                    e0.getClass();
                    Unsafe unsafe2 = v36.a;
                    long j3 = l0;
                    p96 p96Var = (p96) unsafe2.getObjectVolatile(this, j3);
                    if (p96Var.X >= B.X) {
                        break loop0;
                    } else if (!B.o()) {
                        break;
                    } else {
                        do {
                            unsafe = v36.a;
                            if (unsafe.compareAndSwapObject(this, l0, p96Var, B)) {
                                if (p96Var.k()) {
                                    p96Var.i();
                                }
                            }
                        } while (unsafe.getObjectVolatile(this, j3) == p96Var);
                        if (B.k()) {
                            B.i();
                        }
                    }
                }
            } else {
                break;
            }
        }
        if (oi2.J(a)) {
            G();
            if (hm0Var.X * x80.b < z()) {
                hm0Var.a();
                return null;
            }
        } else {
            hm0 hm0Var4 = (hm0) oi2.B(a);
            long j4 = hm0Var4.X;
            if (!I() && j <= Y.get(this) / x80.b) {
                while (true) {
                    f0.getClass();
                    Unsafe unsafe3 = v36.a;
                    long j5 = j0;
                    p96 p96Var2 = (p96) unsafe3.getObjectVolatile(this, j5);
                    if (p96Var2.X >= j4 || !hm0Var4.o()) {
                        break;
                    }
                    while (true) {
                        Unsafe unsafe4 = v36.a;
                        hm0Var2 = hm0Var4;
                        if (unsafe4.compareAndSwapObject(this, j0, p96Var2, hm0Var4)) {
                            if (p96Var2.k()) {
                                p96Var2.i();
                            }
                        } else if (unsafe4.getObjectVolatile(this, j5) != p96Var2) {
                            break;
                        } else {
                            hm0Var4 = hm0Var2;
                        }
                    }
                    hm0Var4 = hm0Var2;
                }
                if (j4 <= j) {
                    long j6 = j4 * x80.b;
                    do {
                        j2 = X.get(this);
                        if (j2 >= j6) {
                            break;
                        }
                    } while (!X.compareAndSet(this, j2, j6));
                    if (j4 * x80.b < z()) {
                        hm0Var2.a();
                    }
                } else {
                    return hm0Var2;
                }
            }
            hm0Var2 = hm0Var4;
            if (j4 <= j) {
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x01c1, code lost:
        r15 = r8;
        r3 = (defpackage.hm0) r3.d();
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
    */
    public final String toString() {
        int i;
        int i2;
        int i3;
        String str;
        StringBuilder sb = new StringBuilder();
        int i4 = (int) (R.get(this) >> 60);
        if (i4 != 2) {
            if (i4 == 3) {
                sb.append("cancelled,");
            }
        } else {
            sb.append("closed,");
        }
        sb.append("capacity=" + this.A + ',');
        sb.append("data=[");
        e0.getClass();
        Unsafe unsafe = v36.a;
        int i5 = 0;
        d0.getClass();
        Object objectVolatile = unsafe.getObjectVolatile(this, m0);
        int i6 = 1;
        f0.getClass();
        List c0 = hf.c0(unsafe.getObjectVolatile(this, l0), objectVolatile, unsafe.getObjectVolatile(this, j0));
        ArrayList arrayList = new ArrayList();
        for (Object obj : c0) {
            if (((hm0) obj) != x80.a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                long j = ((hm0) next).X;
                do {
                    Object next2 = it.next();
                    long j2 = ((hm0) next2).X;
                    if (j > j2) {
                        next = next2;
                        j = j2;
                    }
                } while (it.hasNext());
                hm0 hm0Var = (hm0) next;
                long j3 = X.get(this);
                long z = z();
                loop2: while (true) {
                    i = x80.b;
                    i2 = i5;
                    while (true) {
                        if (i2 < i) {
                        }
                        i2++;
                        i6 = i3;
                    }
                    i6 = i3;
                    i5 = 0;
                }
                if (qs6.w0(sb) == ',') {
                }
                sb.append("]");
                return sb.toString();
            }
            hm0 hm0Var2 = (hm0) next;
            long j32 = X.get(this);
            long z2 = z();
            loop2: while (true) {
                i = x80.b;
                i2 = i5;
                while (true) {
                    if (i2 < i) {
                        break;
                    }
                    i3 = i6;
                    long j4 = (hm0Var2.X * x80.b) + i2;
                    int i7 = (j4 > z2 ? 1 : (j4 == z2 ? 0 : -1));
                    if (i7 >= 0 && j4 >= j32) {
                        break loop2;
                    }
                    Object q = hm0Var2.q(i2);
                    Object obj2 = hm0Var2.d0.get(i2 * 2);
                    if (q instanceof qj0) {
                        int i8 = (j4 > j32 ? 1 : (j4 == j32 ? 0 : -1));
                        if (i8 < 0 && i7 >= 0) {
                            str = "receive";
                        } else if (i7 < 0 && i8 >= 0) {
                            str = "send";
                        } else {
                            str = "cont";
                        }
                    } else if (q instanceof v96) {
                        int i9 = (j4 > j32 ? 1 : (j4 == j32 ? 0 : -1));
                        if (i9 < 0 && i7 >= 0) {
                            str = "onReceive";
                        } else if (i7 < 0 && i9 >= 0) {
                            str = "onSend";
                        } else {
                            str = "select";
                        }
                    } else if (q instanceof bf5) {
                        str = "receiveCatching";
                    } else if (q instanceof as7) {
                        str = "EB(" + q + ')';
                    } else if (!nb3.k(q, x80.f) && !nb3.k(q, x80.g)) {
                        if (q != null && !q.equals(x80.e) && !q.equals(x80.i) && !q.equals(x80.h) && !q.equals(x80.k) && !q.equals(x80.j) && !q.equals(x80.l)) {
                            str = q.toString();
                        }
                        i2++;
                        i6 = i3;
                    } else {
                        str = "resuming_sender";
                    }
                    if (obj2 != null) {
                        sb.append("(" + str + ',' + obj2 + "),");
                    } else {
                        sb.append(str + ',');
                    }
                    i2++;
                    i6 = i3;
                }
                i6 = i3;
                i5 = 0;
            }
            if (qs6.w0(sb) == ',') {
                sb.deleteCharAt(sb.length() - i3).getClass();
            }
            sb.append("]");
            return sb.toString();
        }
        fa6.c();
        return null;
    }

    public final hm0 u(long j, hm0 hm0Var) {
        Object a;
        long j2;
        long j3;
        Unsafe unsafe;
        hm0 hm0Var2 = x80.a;
        w80 w80Var = w80.d0;
        loop0: while (true) {
            a = uy0.a(hm0Var, j, w80Var);
            if (!oi2.J(a)) {
                p96 B = oi2.B(a);
                while (true) {
                    d0.getClass();
                    Unsafe unsafe2 = v36.a;
                    long j4 = m0;
                    p96 p96Var = (p96) unsafe2.getObjectVolatile(this, j4);
                    if (p96Var.X >= B.X) {
                        break loop0;
                    } else if (!B.o()) {
                        break;
                    } else {
                        do {
                            unsafe = v36.a;
                            if (unsafe.compareAndSwapObject(this, m0, p96Var, B)) {
                                if (p96Var.k()) {
                                    p96Var.i();
                                }
                            }
                        } while (unsafe.getObjectVolatile(this, j4) == p96Var);
                        if (B.k()) {
                            B.i();
                        }
                    }
                }
            } else {
                break;
            }
        }
        boolean J = oi2.J(a);
        AtomicLongFieldUpdater atomicLongFieldUpdater = X;
        if (J) {
            G();
            if (hm0Var.X * x80.b < atomicLongFieldUpdater.get(this)) {
                hm0Var.a();
                return null;
            }
        } else {
            hm0 hm0Var3 = (hm0) oi2.B(a);
            long j5 = hm0Var3.X;
            if (j5 > j) {
                long j6 = j5 * x80.b;
                do {
                    j2 = R.get(this);
                    j3 = 1152921504606846975L & j2;
                    if (j3 >= j6) {
                        break;
                    }
                } while (!R.compareAndSet(this, j2, j3 + (((int) (j2 >> 60)) << 60)));
                if (j5 * x80.b < atomicLongFieldUpdater.get(this)) {
                    hm0Var3.a();
                }
            } else {
                return hm0Var3;
            }
        }
        return null;
    }

    public final Throwable v() {
        g0.getClass();
        return (Throwable) v36.a.getObjectVolatile(this, i0);
    }

    public final eb w() {
        p80 p80Var = p80.d0;
        ge7.p(3, p80Var);
        q80 q80Var = q80.d0;
        ge7.p(3, q80Var);
        return new eb(this, p80Var, q80Var, this.L, 19);
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
