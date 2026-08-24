package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rj0  reason: default package */
/* loaded from: classes.dex */
public class rj0 extends qk1 implements qj0, y61, zr7 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater Y = AtomicIntegerFieldUpdater.newUpdater(rj0.class, "_decisionAndIndex$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater Z = AtomicReferenceFieldUpdater.newUpdater(rj0.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater d0;
    public static final /* synthetic */ long e0;
    public static final /* synthetic */ long f0;
    public final r41 R;
    public final l61 X;
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    static {
        Unsafe unsafe = v36.a;
        f0 = unsafe.objectFieldOffset(rj0.class.getDeclaredField("_state$volatile"));
        d0 = AtomicReferenceFieldUpdater.newUpdater(rj0.class, Object.class, "_parentHandle$volatile");
        e0 = unsafe.objectFieldOffset(rj0.class.getDeclaredField("_parentHandle$volatile"));
    }

    public rj0(int i, r41 r41Var) {
        super(i);
        this.R = r41Var;
        this.X = r41Var.b();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = l8.A;
    }

    public static void C(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    public static Object J(sg4 sg4Var, Object obj, int i, fo2 fo2Var) {
        lj0 lj0Var;
        if (obj instanceof av0) {
            return obj;
        }
        if (i != 1 && i != 2) {
            return obj;
        }
        if (fo2Var == null && !(sg4Var instanceof lj0)) {
            return obj;
        }
        if (sg4Var instanceof lj0) {
            lj0Var = (lj0) sg4Var;
        } else {
            lj0Var = null;
        }
        return new yu0(obj, lj0Var, fo2Var, (Throwable) null, 16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00ce, code lost:
        C(r11, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00d1, code lost:
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A(sg4 sg4Var) {
        rj0 rj0Var;
        Unsafe unsafe;
        rj0 rj0Var2;
        while (true) {
            Z.getClass();
            Unsafe unsafe2 = v36.a;
            long j = f0;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            if (objectVolatile instanceof l8) {
                while (true) {
                    Unsafe unsafe3 = v36.a;
                    rj0Var = this;
                    if (!unsafe3.compareAndSwapObject(rj0Var, f0, objectVolatile, sg4Var)) {
                        if (unsafe3.getObjectVolatile(rj0Var, j) != objectVolatile) {
                            break;
                        }
                        this = rj0Var;
                    } else {
                        return;
                    }
                }
            } else {
                rj0Var = this;
                if ((objectVolatile instanceof lj0) || (objectVolatile instanceof p96)) {
                    break;
                } else if (objectVolatile instanceof av0) {
                    av0 av0Var = (av0) objectVolatile;
                    if (av0.b.compareAndSet(av0Var, 0, 1)) {
                        if (objectVolatile instanceof vj0) {
                            Throwable th = av0Var.a;
                            if (sg4Var instanceof lj0) {
                                rj0Var.l((lj0) sg4Var, th);
                                return;
                            }
                            sg4Var.getClass();
                            rj0Var.n((p96) sg4Var, th);
                            return;
                        }
                        return;
                    }
                    C(sg4Var, objectVolatile);
                    throw null;
                } else if (objectVolatile instanceof yu0) {
                    yu0 yu0Var = (yu0) objectVolatile;
                    if (yu0Var.b == null) {
                        if (sg4Var instanceof p96) {
                            return;
                        }
                        sg4Var.getClass();
                        lj0 lj0Var = (lj0) sg4Var;
                        Throwable th2 = yu0Var.e;
                        if (th2 != null) {
                            rj0Var.l(lj0Var, th2);
                            return;
                        }
                        yu0 a = yu0.a(yu0Var, lj0Var, null, 29);
                        do {
                            unsafe = v36.a;
                            rj0Var2 = rj0Var;
                            if (!unsafe.compareAndSwapObject(rj0Var, f0, objectVolatile, a)) {
                                rj0Var = rj0Var2;
                            } else {
                                return;
                            }
                        } while (unsafe.getObjectVolatile(rj0Var2, j) == objectVolatile);
                    } else {
                        C(sg4Var, objectVolatile);
                        throw null;
                    }
                } else {
                    rj0 rj0Var3 = rj0Var;
                    if (sg4Var instanceof p96) {
                        return;
                    }
                    sg4Var.getClass();
                    yu0 yu0Var2 = new yu0(objectVolatile, (lj0) sg4Var, (fo2) null, (Throwable) null, 28);
                    while (true) {
                        yu0 yu0Var3 = yu0Var2;
                        Unsafe unsafe4 = v36.a;
                        rj0Var = rj0Var3;
                        boolean compareAndSwapObject = unsafe4.compareAndSwapObject(rj0Var, f0, objectVolatile, yu0Var3);
                        yu0Var2 = yu0Var3;
                        if (compareAndSwapObject) {
                            return;
                        }
                        if (unsafe4.getObjectVolatile(rj0Var, j) != objectVolatile) {
                            break;
                        }
                        rj0Var3 = rj0Var;
                    }
                }
            }
            this = rj0Var;
        }
    }

    public final boolean B() {
        if (this.L == 2 && ((nk1) this.R).o()) {
            return true;
        }
        return false;
    }

    public String D() {
        return "CancellableContinuation";
    }

    public final void E() {
        nk1 nk1Var;
        Throwable q;
        r41 r41Var = this.R;
        if (r41Var instanceof nk1) {
            nk1Var = (nk1) r41Var;
        } else {
            nk1Var = null;
        }
        if (nk1Var != null && (q = nk1Var.q(this)) != null) {
            o();
            w(q);
        }
    }

    public final boolean F() {
        Z.getClass();
        Unsafe unsafe = v36.a;
        long j = f0;
        Object objectVolatile = unsafe.getObjectVolatile(this, j);
        if ((objectVolatile instanceof yu0) && ((yu0) objectVolatile).d != null) {
            o();
            return false;
        }
        Y.set(this, 536870911);
        unsafe.putObjectVolatile(this, j, l8.A);
        return true;
    }

    public final void G(Object obj, qn2 qn2Var) {
        ov4 ov4Var;
        int i = this.L;
        if (qn2Var != null) {
            ov4Var = new ov4(qn2Var, 4);
        } else {
            ov4Var = null;
        }
        H(obj, i, ov4Var);
    }

    public final void H(Object obj, int i, fo2 fo2Var) {
        rj0 rj0Var;
        while (true) {
            Z.getClass();
            Unsafe unsafe = v36.a;
            long j = f0;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (objectVolatile instanceof sg4) {
                Object J = J((sg4) objectVolatile, obj, i, fo2Var);
                while (true) {
                    Unsafe unsafe2 = v36.a;
                    rj0Var = this;
                    if (unsafe2.compareAndSwapObject(rj0Var, f0, objectVolatile, J)) {
                        if (!rj0Var.B()) {
                            rj0Var.o();
                        }
                        rj0Var.p(i);
                        return;
                    } else if (unsafe2.getObjectVolatile(rj0Var, j) != objectVolatile) {
                        break;
                    } else {
                        this = rj0Var;
                    }
                }
            } else {
                rj0 rj0Var2 = this;
                if (objectVolatile instanceof vj0) {
                    vj0 vj0Var = (vj0) objectVolatile;
                    if (vj0.c.compareAndSet(vj0Var, 0, 1)) {
                        if (fo2Var != null) {
                            rj0Var2.m(fo2Var, vj0Var.a, obj);
                            return;
                        }
                        return;
                    }
                }
                e41.h(obj, "Already resumed, but proposed with update ");
                return;
            }
            this = rj0Var;
        }
    }

    public final void I(n61 n61Var, Object obj) {
        nk1 nk1Var;
        n61 n61Var2;
        int i;
        r41 r41Var = this.R;
        if (r41Var instanceof nk1) {
            nk1Var = (nk1) r41Var;
        } else {
            nk1Var = null;
        }
        if (nk1Var != null) {
            n61Var2 = nk1Var.R;
        } else {
            n61Var2 = null;
        }
        if (n61Var2 == n61Var) {
            i = 4;
        } else {
            i = this.L;
        }
        H(obj, i, null);
    }

    public final gr1 K(Object obj, fo2 fo2Var) {
        rj0 rj0Var;
        while (true) {
            Z.getClass();
            Unsafe unsafe = v36.a;
            long j = f0;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (objectVolatile instanceof sg4) {
                Object J = J((sg4) objectVolatile, obj, this.L, fo2Var);
                while (true) {
                    Unsafe unsafe2 = v36.a;
                    rj0Var = this;
                    if (unsafe2.compareAndSwapObject(rj0Var, f0, objectVolatile, J)) {
                        boolean B = rj0Var.B();
                        gr1 gr1Var = sj0.a;
                        if (!B) {
                            rj0Var.o();
                        }
                        return gr1Var;
                    } else if (unsafe2.getObjectVolatile(rj0Var, j) != objectVolatile) {
                        break;
                    } else {
                        this = rj0Var;
                    }
                }
            } else {
                return null;
            }
            this = rj0Var;
        }
    }

    @Override // defpackage.zr7
    public final void a(p96 p96Var, int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = Y;
            i2 = atomicIntegerFieldUpdater.get(this);
            if ((i2 & 536870911) != 536870911) {
                i.m("invokeOnCancellation should be called at most once");
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, ((i2 >> 29) << 29) + i));
        A(p96Var);
    }

    @Override // defpackage.r41
    public final l61 b() {
        return this.X;
    }

    @Override // defpackage.qk1
    public final void c(CancellationException cancellationException) {
        CancellationException cancellationException2;
        rj0 rj0Var;
        while (true) {
            Z.getClass();
            Unsafe unsafe = v36.a;
            long j = f0;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof sg4)) {
                if (!(objectVolatile instanceof av0)) {
                    if (objectVolatile instanceof yu0) {
                        yu0 yu0Var = (yu0) objectVolatile;
                        if (yu0Var.e == null) {
                            yu0 a = yu0.a(yu0Var, null, cancellationException, 15);
                            while (true) {
                                Unsafe unsafe2 = v36.a;
                                rj0 rj0Var2 = this;
                                if (unsafe2.compareAndSwapObject(rj0Var2, f0, objectVolatile, a)) {
                                    lj0 lj0Var = yu0Var.b;
                                    if (lj0Var != null) {
                                        rj0Var2.l(lj0Var, cancellationException);
                                    }
                                    fo2 fo2Var = yu0Var.c;
                                    if (fo2Var != null) {
                                        rj0Var2.m(fo2Var, cancellationException, yu0Var.a);
                                        return;
                                    }
                                    return;
                                } else if (unsafe2.getObjectVolatile(rj0Var2, j) != objectVolatile) {
                                    cancellationException2 = cancellationException;
                                    rj0Var = rj0Var2;
                                    break;
                                } else {
                                    this = rj0Var2;
                                }
                            }
                        } else {
                            i.m("Must be called at most once");
                            return;
                        }
                    } else {
                        rj0 rj0Var3 = this;
                        CancellationException cancellationException3 = cancellationException;
                        yu0 yu0Var2 = new yu0(objectVolatile, (lj0) null, (fo2) null, cancellationException3, 14);
                        cancellationException2 = cancellationException3;
                        while (true) {
                            yu0 yu0Var3 = yu0Var2;
                            Unsafe unsafe3 = v36.a;
                            rj0Var = rj0Var3;
                            boolean compareAndSwapObject = unsafe3.compareAndSwapObject(rj0Var, f0, objectVolatile, yu0Var3);
                            yu0Var2 = yu0Var3;
                            if (compareAndSwapObject) {
                                return;
                            }
                            if (unsafe3.getObjectVolatile(rj0Var, j) != objectVolatile) {
                                break;
                            }
                            rj0Var3 = rj0Var;
                        }
                    }
                    cancellationException = cancellationException2;
                    this = rj0Var;
                } else {
                    return;
                }
            } else {
                i.m("Not completed");
                return;
            }
        }
    }

    @Override // defpackage.qk1
    public final r41 d() {
        return this.R;
    }

    @Override // defpackage.qk1
    public final Throwable e(Object obj) {
        Throwable e = super.e(obj);
        if (e != null) {
            return e;
        }
        return null;
    }

    @Override // defpackage.y61
    public final y61 f() {
        r41 r41Var = this.R;
        if (r41Var instanceof y61) {
            return (y61) r41Var;
        }
        return null;
    }

    @Override // defpackage.qk1
    public final Object g(Object obj) {
        if (obj instanceof yu0) {
            return ((yu0) obj).a;
        }
        return obj;
    }

    @Override // defpackage.r41
    public final void i(Object obj) {
        Throwable a = hm5.a(obj);
        if (a != null) {
            obj = new av0(a, false);
        }
        H(obj, this.L, null);
    }

    @Override // defpackage.qj0
    public final gr1 j(Object obj, fo2 fo2Var) {
        return K(obj, fo2Var);
    }

    @Override // defpackage.qk1
    public final Object k() {
        return u();
    }

    public final void l(lj0 lj0Var, Throwable th) {
        try {
            lj0Var.b(th);
        } catch (Throwable th2) {
            f04.H(this.X, new RuntimeException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void m(fo2 fo2Var, Throwable th, Object obj) {
        l61 l61Var = this.X;
        try {
            fo2Var.e(th, obj, l61Var);
        } catch (Throwable th2) {
            f04.H(l61Var, new RuntimeException("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final void n(p96 p96Var, Throwable th) {
        l61 l61Var = this.X;
        int i = Y.get(this) & 536870911;
        if (i != 536870911) {
            try {
                p96Var.m(i, l61Var);
                return;
            } catch (Throwable th2) {
                f04.H(l61Var, new RuntimeException("Exception in invokeOnCancellation handler for " + this, th2));
                return;
            }
        }
        i.m("The index for Segment.onCancellation(..) is broken");
    }

    public final void o() {
        il1 r = r();
        if (r == null) {
            return;
        }
        r.dispose();
        d0.getClass();
        v36.a.putObjectVolatile(this, e0, lg4.A);
    }

    public final void p(int i) {
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
                    r41 r41Var = this.R;
                    if (!z && (r41Var instanceof nk1)) {
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
                            nk1 nk1Var = (nk1) r41Var;
                            n61 n61Var = nk1Var.R;
                            l61 b = nk1Var.X.b();
                            if (ok1.c(n61Var, b)) {
                                ok1.b(n61Var, b, this);
                                return;
                            }
                            l62 a = m57.a();
                            if (a.L >= 4294967296L) {
                                a.o0(this);
                                return;
                            }
                            a.p0(true);
                            try {
                                ak7.z0(this, r41Var, true);
                                do {
                                } while (a.r0());
                            } finally {
                                try {
                                    return;
                                } finally {
                                }
                            }
                            return;
                        }
                    }
                    ak7.z0(this, r41Var, z);
                    return;
                }
                i.m("Already resumed");
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 1073741824 + (536870911 & i2)));
    }

    public Throwable q(ed3 ed3Var) {
        return ed3Var.v();
    }

    public final il1 r() {
        d0.getClass();
        return (il1) v36.a.getObjectVolatile(this, e0);
    }

    public final Object s() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        rc3 rc3Var;
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
                    Object u = u();
                    if (!(u instanceof av0)) {
                        int i3 = this.L;
                        if ((i3 == 1 || i3 == 2) && (rc3Var = (rc3) this.X.Z(vs0.h0)) != null && !rc3Var.e()) {
                            CancellationException v = rc3Var.v();
                            c(v);
                            throw v;
                        }
                        return g(u);
                    }
                    throw ((av0) u).a;
                }
                i.m("Already suspended");
                return null;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 536870912 + (536870911 & i)));
        if (r() == null) {
            x();
        }
        if (B) {
            E();
        }
        return x61.COROUTINE_SUSPENDED;
    }

    @Override // defpackage.qj0
    public final void t(Object obj, fo2 fo2Var) {
        H(obj, this.L, fo2Var);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(D());
        sb.append('(');
        sb.append(nc1.i0(this.R));
        sb.append("){");
        Object u = u();
        if (u instanceof sg4) {
            str = "Active";
        } else if (u instanceof vj0) {
            str = "Cancelled";
        } else {
            str = "Completed";
        }
        sb.append(str);
        sb.append("}@");
        sb.append(nc1.P(this));
        return sb.toString();
    }

    public final Object u() {
        Z.getClass();
        return v36.a.getObjectVolatile(this, f0);
    }

    public final void v() {
        il1 x = x();
        if (x != null && !(u() instanceof sg4)) {
            x.dispose();
            d0.getClass();
            v36.a.putObjectVolatile(this, e0, lg4.A);
        }
    }

    @Override // defpackage.qj0
    public final boolean w(Throwable th) {
        Throwable th2;
        rj0 rj0Var;
        while (true) {
            Z.getClass();
            Unsafe unsafe = v36.a;
            long j = f0;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            boolean z = false;
            if (!(objectVolatile instanceof sg4)) {
                return false;
            }
            if ((objectVolatile instanceof lj0) || (objectVolatile instanceof p96)) {
                z = true;
            }
            if (th == null) {
                th2 = new CancellationException("Continuation " + this + " was cancelled normally");
            } else {
                th2 = th;
            }
            av0 av0Var = new av0(th2, z);
            while (true) {
                Unsafe unsafe2 = v36.a;
                rj0Var = this;
                if (unsafe2.compareAndSwapObject(rj0Var, f0, objectVolatile, av0Var)) {
                    sg4 sg4Var = (sg4) objectVolatile;
                    if (sg4Var instanceof lj0) {
                        rj0Var.l((lj0) objectVolatile, th);
                    } else if (sg4Var instanceof p96) {
                        rj0Var.n((p96) objectVolatile, th);
                    }
                    if (!rj0Var.B()) {
                        rj0Var.o();
                    }
                    rj0Var.p(rj0Var.L);
                    return true;
                } else if (unsafe2.getObjectVolatile(rj0Var, j) != objectVolatile) {
                    break;
                } else {
                    this = rj0Var;
                }
            }
            this = rj0Var;
        }
    }

    public final il1 x() {
        rc3 rc3Var = (rc3) this.X.Z(vs0.h0);
        if (rc3Var == null) {
            return null;
        }
        il1 y = yh2.y(rc3Var, true, new gq0(this));
        while (true) {
            d0.getClass();
            Unsafe unsafe = v36.a;
            long j = e0;
            rj0 rj0Var = this;
            if (!unsafe.compareAndSwapObject(rj0Var, j, (Object) null, y) && unsafe.getObjectVolatile(rj0Var, j) == null) {
                this = rj0Var;
            }
        }
        return y;
    }

    @Override // defpackage.qj0
    public final void y(Object obj) {
        p(this.L);
    }

    public final void z(qn2 qn2Var) {
        A(new kj0(qn2Var, 1));
    }
}
