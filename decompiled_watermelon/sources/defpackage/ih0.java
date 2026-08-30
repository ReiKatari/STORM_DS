package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ih0  reason: default package */
/* loaded from: classes.dex */
public class ih0 extends mg1 implements hh0, q31, fd7 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater Y = AtomicIntegerFieldUpdater.newUpdater(ih0.class, "_decisionAndIndex$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater Z = AtomicReferenceFieldUpdater.newUpdater(ih0.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater c0;
    public static final /* synthetic */ long d0;
    public static final /* synthetic */ long e0;
    public final j11 R;
    public final e31 X;
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    static {
        Unsafe unsafe = ys5.a;
        e0 = unsafe.objectFieldOffset(ih0.class.getDeclaredField("_state$volatile"));
        c0 = AtomicReferenceFieldUpdater.newUpdater(ih0.class, Object.class, "_parentHandle$volatile");
        d0 = unsafe.objectFieldOffset(ih0.class.getDeclaredField("_parentHandle$volatile"));
    }

    public ih0(int i, j11 j11Var) {
        super(i);
        this.R = j11Var;
        this.X = j11Var.a();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = k8.A;
    }

    public static void C(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    public static Object I(b84 b84Var, Object obj, int i, bj2 bj2Var) {
        ch0 ch0Var;
        if (obj instanceof ns0) {
            return obj;
        }
        if (i != 1 && i != 2) {
            return obj;
        }
        if (bj2Var == null && !(b84Var instanceof ch0)) {
            return obj;
        }
        if (b84Var instanceof ch0) {
            ch0Var = (ch0) b84Var;
        } else {
            ch0Var = null;
        }
        return new ls0(obj, ch0Var, bj2Var, (Throwable) null, 16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00ce, code lost:
        C(r11, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00d1, code lost:
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A(defpackage.b84 r11) {
        /*
            Method dump skipped, instructions count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ih0.A(b84):void");
    }

    public final boolean B() {
        if (this.L == 2 && ((jg1) this.R).p()) {
            return true;
        }
        return false;
    }

    public String D() {
        return "CancellableContinuation";
    }

    public final void E() {
        jg1 jg1Var;
        Throwable t;
        j11 j11Var = this.R;
        if (j11Var instanceof jg1) {
            jg1Var = (jg1) j11Var;
        } else {
            jg1Var = null;
        }
        if (jg1Var != null && (t = jg1Var.t(this)) != null) {
            p();
            r(t);
        }
    }

    public final boolean F() {
        Z.getClass();
        Unsafe unsafe = ys5.a;
        long j = e0;
        Object objectVolatile = unsafe.getObjectVolatile(this, j);
        if ((objectVolatile instanceof ls0) && ((ls0) objectVolatile).d != null) {
            p();
            return false;
        }
        Y.set(this, 536870911);
        unsafe.putObjectVolatile(this, j, k8.A);
        return true;
    }

    public final void G(Object obj, int i, bj2 bj2Var) {
        ih0 ih0Var;
        while (true) {
            Z.getClass();
            Unsafe unsafe = ys5.a;
            long j = e0;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (objectVolatile instanceof b84) {
                Object I = I((b84) objectVolatile, obj, i, bj2Var);
                while (true) {
                    Unsafe unsafe2 = ys5.a;
                    ih0Var = this;
                    if (unsafe2.compareAndSwapObject(ih0Var, e0, objectVolatile, I)) {
                        if (!ih0Var.B()) {
                            ih0Var.p();
                        }
                        ih0Var.q(i);
                        return;
                    } else if (unsafe2.getObjectVolatile(ih0Var, j) != objectVolatile) {
                        break;
                    } else {
                        this = ih0Var;
                    }
                }
            } else {
                ih0 ih0Var2 = this;
                if (objectVolatile instanceof mh0) {
                    mh0 mh0Var = (mh0) objectVolatile;
                    if (mh0.c.compareAndSet(mh0Var, 0, 1)) {
                        if (bj2Var != null) {
                            ih0Var2.n(bj2Var, mh0Var.a, obj);
                            return;
                        }
                        return;
                    }
                }
                f81.p(obj, "Already resumed, but proposed with update ");
                return;
            }
            this = ih0Var;
        }
    }

    public final void H(g31 g31Var, Object obj) {
        jg1 jg1Var;
        g31 g31Var2;
        int i;
        j11 j11Var = this.R;
        if (j11Var instanceof jg1) {
            jg1Var = (jg1) j11Var;
        } else {
            jg1Var = null;
        }
        if (jg1Var != null) {
            g31Var2 = jg1Var.R;
        } else {
            g31Var2 = null;
        }
        if (g31Var2 == g31Var) {
            i = 4;
        } else {
            i = this.L;
        }
        G(obj, i, null);
    }

    public final an1 J(Object obj, bj2 bj2Var) {
        ih0 ih0Var;
        while (true) {
            Z.getClass();
            Unsafe unsafe = ys5.a;
            long j = e0;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (objectVolatile instanceof b84) {
                Object I = I((b84) objectVolatile, obj, this.L, bj2Var);
                while (true) {
                    Unsafe unsafe2 = ys5.a;
                    ih0Var = this;
                    if (unsafe2.compareAndSwapObject(ih0Var, e0, objectVolatile, I)) {
                        boolean B = ih0Var.B();
                        an1 an1Var = jh0.a;
                        if (!B) {
                            ih0Var.p();
                        }
                        return an1Var;
                    } else if (unsafe2.getObjectVolatile(ih0Var, j) != objectVolatile) {
                        break;
                    } else {
                        this = ih0Var;
                    }
                }
            } else {
                return null;
            }
            this = ih0Var;
        }
    }

    @Override // defpackage.j11
    public final e31 a() {
        return this.X;
    }

    @Override // defpackage.fd7
    public final void b(dy5 dy5Var, int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = Y;
            i2 = atomicIntegerFieldUpdater.get(this);
            if ((i2 & 536870911) != 536870911) {
                i.n("invokeOnCancellation should be called at most once");
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, ((i2 >> 29) << 29) + i));
        A(dy5Var);
    }

    @Override // defpackage.mg1
    public final void c(CancellationException cancellationException) {
        CancellationException cancellationException2;
        ih0 ih0Var;
        while (true) {
            Z.getClass();
            Unsafe unsafe = ys5.a;
            long j = e0;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof b84)) {
                if (!(objectVolatile instanceof ns0)) {
                    if (objectVolatile instanceof ls0) {
                        ls0 ls0Var = (ls0) objectVolatile;
                        if (ls0Var.e == null) {
                            ls0 a = ls0.a(ls0Var, null, cancellationException, 15);
                            while (true) {
                                Unsafe unsafe2 = ys5.a;
                                ih0 ih0Var2 = this;
                                if (unsafe2.compareAndSwapObject(ih0Var2, e0, objectVolatile, a)) {
                                    ch0 ch0Var = ls0Var.b;
                                    if (ch0Var != null) {
                                        ih0Var2.j(ch0Var, cancellationException);
                                    }
                                    bj2 bj2Var = ls0Var.c;
                                    if (bj2Var != null) {
                                        ih0Var2.n(bj2Var, cancellationException, ls0Var.a);
                                        return;
                                    }
                                    return;
                                } else if (unsafe2.getObjectVolatile(ih0Var2, j) != objectVolatile) {
                                    cancellationException2 = cancellationException;
                                    ih0Var = ih0Var2;
                                    break;
                                } else {
                                    this = ih0Var2;
                                }
                            }
                        } else {
                            i.n("Must be called at most once");
                            return;
                        }
                    } else {
                        ih0 ih0Var3 = this;
                        CancellationException cancellationException3 = cancellationException;
                        ls0 ls0Var2 = new ls0(objectVolatile, (ch0) null, (bj2) null, cancellationException3, 14);
                        cancellationException2 = cancellationException3;
                        while (true) {
                            ls0 ls0Var3 = ls0Var2;
                            Unsafe unsafe3 = ys5.a;
                            ih0Var = ih0Var3;
                            boolean compareAndSwapObject = unsafe3.compareAndSwapObject(ih0Var, e0, objectVolatile, ls0Var3);
                            ls0Var2 = ls0Var3;
                            if (compareAndSwapObject) {
                                return;
                            }
                            if (unsafe3.getObjectVolatile(ih0Var, j) != objectVolatile) {
                                break;
                            }
                            ih0Var3 = ih0Var;
                        }
                    }
                    cancellationException = cancellationException2;
                    this = ih0Var;
                } else {
                    return;
                }
            } else {
                i.n("Not completed");
                return;
            }
        }
    }

    @Override // defpackage.mg1
    public final j11 d() {
        return this.R;
    }

    @Override // defpackage.mg1
    public final Throwable e(Object obj) {
        Throwable e = super.e(obj);
        if (e != null) {
            return e;
        }
        return null;
    }

    @Override // defpackage.mg1
    public final Object f(Object obj) {
        if (obj instanceof ls0) {
            return ((ls0) obj).a;
        }
        return obj;
    }

    @Override // defpackage.q31
    public final q31 g() {
        j11 j11Var = this.R;
        if (j11Var instanceof q31) {
            return (q31) j11Var;
        }
        return null;
    }

    @Override // defpackage.mg1
    public final Object i() {
        return w();
    }

    public final void j(ch0 ch0Var, Throwable th) {
        try {
            ch0Var.a(th);
        } catch (Throwable th2) {
            w81.t(this.X, new RuntimeException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    @Override // defpackage.j11
    public final void k(Object obj) {
        Throwable a = nc5.a(obj);
        if (a != null) {
            obj = new ns0(a, false);
        }
        G(obj, this.L, null);
    }

    @Override // defpackage.hh0
    public final void l(Object obj, bj2 bj2Var) {
        G(obj, this.L, bj2Var);
    }

    @Override // defpackage.hh0
    public final an1 m(Object obj, bj2 bj2Var) {
        return J(obj, bj2Var);
    }

    public final void n(bj2 bj2Var, Throwable th, Object obj) {
        e31 e31Var = this.X;
        try {
            bj2Var.i(th, obj, e31Var);
        } catch (Throwable th2) {
            w81.t(e31Var, new RuntimeException("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final void o(dy5 dy5Var, Throwable th) {
        e31 e31Var = this.X;
        int i = Y.get(this) & 536870911;
        if (i != 536870911) {
            try {
                dy5Var.m(i, e31Var);
                return;
            } catch (Throwable th2) {
                w81.t(e31Var, new RuntimeException("Exception in invokeOnCancellation handler for " + this, th2));
                return;
            }
        }
        i.n("The index for Segment.onCancellation(..) is broken");
    }

    public final void p() {
        eh1 u = u();
        if (u == null) {
            return;
        }
        u.dispose();
        c0.getClass();
        ys5.a.putObjectVolatile(this, d0, t74.A);
    }

    public final void q(int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        boolean z;
        boolean z2;
        do {
            atomicIntegerFieldUpdater = Y;
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 == 1) {
                    boolean z3 = false;
                    if (i == 4) {
                        z = true;
                    } else {
                        z = false;
                    }
                    j11 j11Var = this.R;
                    if (!z && (j11Var instanceof jg1)) {
                        if (i != 1 && i != 2) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        int i4 = this.L;
                        if (i4 == 1 || i4 == 2) {
                            z3 = true;
                        }
                        if (z2 == z3) {
                            jg1 jg1Var = (jg1) j11Var;
                            g31 g31Var = jg1Var.R;
                            e31 a = jg1Var.X.a();
                            if (kg1.c(g31Var, a)) {
                                kg1.b(g31Var, a, this);
                                return;
                            }
                            u12 a2 = vs6.a();
                            if (a2.L >= 4294967296L) {
                                a2.o0(this);
                                return;
                            }
                            a2.p0(true);
                            try {
                                dt3.o0(this, j11Var, true);
                                do {
                                } while (a2.r0());
                            } finally {
                                try {
                                    return;
                                } finally {
                                }
                            }
                            return;
                        }
                    }
                    dt3.o0(this, j11Var, z);
                    return;
                }
                i.n("Already resumed");
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 1073741824 + (536870911 & i2)));
    }

    @Override // defpackage.hh0
    public final boolean r(Throwable th) {
        Throwable th2;
        ih0 ih0Var;
        while (true) {
            Z.getClass();
            Unsafe unsafe = ys5.a;
            long j = e0;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            boolean z = false;
            if (!(objectVolatile instanceof b84)) {
                return false;
            }
            if ((objectVolatile instanceof ch0) || (objectVolatile instanceof dy5)) {
                z = true;
            }
            if (th == null) {
                th2 = new CancellationException("Continuation " + this + " was cancelled normally");
            } else {
                th2 = th;
            }
            ns0 ns0Var = new ns0(th2, z);
            while (true) {
                Unsafe unsafe2 = ys5.a;
                ih0Var = this;
                if (unsafe2.compareAndSwapObject(ih0Var, e0, objectVolatile, ns0Var)) {
                    b84 b84Var = (b84) objectVolatile;
                    if (b84Var instanceof ch0) {
                        ih0Var.j((ch0) objectVolatile, th);
                    } else if (b84Var instanceof dy5) {
                        ih0Var.o((dy5) objectVolatile, th);
                    }
                    if (!ih0Var.B()) {
                        ih0Var.p();
                    }
                    ih0Var.q(ih0Var.L);
                    return true;
                } else if (unsafe2.getObjectVolatile(ih0Var, j) != objectVolatile) {
                    break;
                } else {
                    this = ih0Var;
                }
            }
            this = ih0Var;
        }
    }

    @Override // defpackage.hh0
    public final void s(Object obj) {
        q(this.L);
    }

    public Throwable t(p63 p63Var) {
        return p63Var.K();
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(D());
        sb.append('(');
        sb.append(w81.G(this.R));
        sb.append("){");
        Object w = w();
        if (w instanceof b84) {
            str = "Active";
        } else if (w instanceof mh0) {
            str = "Cancelled";
        } else {
            str = "Completed";
        }
        sb.append(str);
        sb.append("}@");
        sb.append(w81.s(this));
        return sb.toString();
    }

    public final eh1 u() {
        c0.getClass();
        return (eh1) ys5.a.getObjectVolatile(this, d0);
    }

    public final Object v() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        c63 c63Var;
        boolean B = B();
        do {
            atomicIntegerFieldUpdater = Y;
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 == 2) {
                    if (B) {
                        E();
                    }
                    Object w = w();
                    if (!(w instanceof ns0)) {
                        int i3 = this.L;
                        if ((i3 == 1 || i3 == 2) && (c63Var = (c63) this.X.I(k45.d0)) != null && !c63Var.d()) {
                            CancellationException K = c63Var.K();
                            c(K);
                            throw K;
                        }
                        return f(w);
                    }
                    throw ((ns0) w).a;
                }
                i.n("Already suspended");
                return null;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 536870912 + (536870911 & i)));
        if (u() == null) {
            y();
        }
        if (B) {
            E();
        }
        return p31.COROUTINE_SUSPENDED;
    }

    public final Object w() {
        Z.getClass();
        return ys5.a.getObjectVolatile(this, e0);
    }

    public final void x() {
        eh1 y = y();
        if (y != null && !(w() instanceof b84)) {
            y.dispose();
            c0.getClass();
            ys5.a.putObjectVolatile(this, d0, t74.A);
        }
    }

    public final eh1 y() {
        c63 c63Var = (c63) this.X.I(k45.d0);
        if (c63Var == null) {
            return null;
        }
        eh1 E = ln2.E(c63Var, true, new wn0(this));
        while (true) {
            c0.getClass();
            Unsafe unsafe = ys5.a;
            long j = d0;
            ih0 ih0Var = this;
            if (!unsafe.compareAndSwapObject(ih0Var, j, (Object) null, E) && unsafe.getObjectVolatile(ih0Var, j) == null) {
                this = ih0Var;
            }
        }
        return E;
    }

    public final void z(mi2 mi2Var) {
        A(new bh0(1, mi2Var));
    }
}
