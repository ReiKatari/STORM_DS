package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nk1  reason: default package */
/* loaded from: classes.dex */
public final class nk1 extends qk1 implements y61, r41 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater d0 = AtomicReferenceFieldUpdater.newUpdater(nk1.class, Object.class, "_reusableCancellableContinuation$volatile");
    public static final /* synthetic */ long e0 = v36.a.objectFieldOffset(nk1.class.getDeclaredField("_reusableCancellableContinuation$volatile"));
    public final n61 R;
    public final s41 X;
    public Object Y;
    public final Object Z;
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    public nk1(n61 n61Var, s41 s41Var) {
        super(-1);
        this.R = n61Var;
        this.X = s41Var;
        this.Y = ok1.a;
        this.Z = k57.b(s41Var.b());
    }

    @Override // defpackage.r41
    public final l61 b() {
        return this.X.b();
    }

    @Override // defpackage.y61
    public final y61 f() {
        return this.X;
    }

    @Override // defpackage.r41
    public final void i(Object obj) {
        Object av0Var;
        Throwable a = hm5.a(obj);
        if (a == null) {
            av0Var = obj;
        } else {
            av0Var = new av0(a, false);
        }
        s41 s41Var = this.X;
        l61 b = s41Var.b();
        n61 n61Var = this.R;
        if (ok1.c(n61Var, b)) {
            this.Y = av0Var;
            this.L = 0;
            ok1.b(n61Var, s41Var.b(), this);
            return;
        }
        l62 a2 = m57.a();
        if (a2.L >= 4294967296L) {
            this.Y = av0Var;
            this.L = 0;
            a2.o0(this);
            return;
        }
        a2.p0(true);
        try {
            l61 b2 = s41Var.b();
            Object c = k57.c(b2, this.Z);
            s41Var.i(obj);
            k57.a(b2, c);
            do {
            } while (a2.r0());
        } finally {
            try {
            } finally {
            }
        }
    }

    @Override // defpackage.qk1
    public final Object k() {
        Object obj = this.Y;
        this.Y = ok1.a;
        return obj;
    }

    public final void l() {
        do {
            d0.getClass();
        } while (v36.a.getObjectVolatile(this, e0) == ok1.b);
    }

    public final rj0 m() {
        nk1 nk1Var;
        while (true) {
            d0.getClass();
            Unsafe unsafe = v36.a;
            long j = e0;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            gr1 gr1Var = ok1.b;
            if (objectVolatile == null) {
                unsafe.putObjectVolatile(this, j, gr1Var);
                return null;
            }
            if (objectVolatile instanceof rj0) {
                while (true) {
                    Unsafe unsafe2 = v36.a;
                    nk1Var = this;
                    if (unsafe2.compareAndSwapObject(nk1Var, e0, objectVolatile, gr1Var)) {
                        return (rj0) objectVolatile;
                    }
                    if (unsafe2.getObjectVolatile(nk1Var, j) != objectVolatile) {
                        break;
                    }
                    this = nk1Var;
                }
            } else {
                nk1Var = this;
                if (objectVolatile != gr1Var && !(objectVolatile instanceof Throwable)) {
                    e41.h(objectVolatile, "Inconsistent state ");
                    return null;
                }
            }
            this = nk1Var;
        }
    }

    public final rj0 n() {
        d0.getClass();
        Object objectVolatile = v36.a.getObjectVolatile(this, e0);
        if (objectVolatile instanceof rj0) {
            return (rj0) objectVolatile;
        }
        return null;
    }

    public final boolean o() {
        d0.getClass();
        if (v36.a.getObjectVolatile(this, e0) != null) {
            return true;
        }
        return false;
    }

    public final boolean p(Throwable th) {
        nk1 nk1Var;
        Throwable th2;
        Unsafe unsafe;
        while (true) {
            d0.getClass();
            Unsafe unsafe2 = v36.a;
            long j = e0;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            gr1 gr1Var = ok1.b;
            if (nb3.k(objectVolatile, gr1Var)) {
                while (true) {
                    Unsafe unsafe3 = v36.a;
                    nk1 nk1Var2 = this;
                    th2 = th;
                    nk1Var = nk1Var2;
                    if (!unsafe3.compareAndSwapObject(nk1Var2, e0, gr1Var, th2)) {
                        if (unsafe3.getObjectVolatile(nk1Var, j) != gr1Var) {
                            break;
                        }
                        this = nk1Var;
                        th = th2;
                    } else {
                        return true;
                    }
                }
            } else {
                nk1Var = this;
                th2 = th;
                if (objectVolatile instanceof Throwable) {
                    return true;
                }
                do {
                    unsafe = v36.a;
                    if (unsafe.compareAndSwapObject(nk1Var, e0, objectVolatile, (Object) null)) {
                        return false;
                    }
                } while (unsafe.getObjectVolatile(nk1Var, j) == objectVolatile);
            }
            this = nk1Var;
            th = th2;
        }
    }

    public final Throwable q(rj0 rj0Var) {
        Unsafe unsafe;
        nk1 nk1Var;
        rj0 rj0Var2;
        while (true) {
            d0.getClass();
            Unsafe unsafe2 = v36.a;
            long j = e0;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            gr1 gr1Var = ok1.b;
            if (objectVolatile != gr1Var) {
                nk1 nk1Var2 = this;
                if (objectVolatile instanceof Throwable) {
                    do {
                        unsafe = v36.a;
                        if (unsafe.compareAndSwapObject(nk1Var2, e0, objectVolatile, (Object) null)) {
                            return (Throwable) objectVolatile;
                        }
                    } while (unsafe.getObjectVolatile(nk1Var2, j) == objectVolatile);
                    i.h("Failed requirement.");
                    return null;
                }
                e41.h(objectVolatile, "Inconsistent state ");
                return null;
            }
            while (true) {
                Unsafe unsafe3 = v36.a;
                nk1Var = this;
                rj0Var2 = rj0Var;
                if (unsafe3.compareAndSwapObject(nk1Var, e0, gr1Var, rj0Var2)) {
                    return null;
                }
                if (unsafe3.getObjectVolatile(nk1Var, j) != gr1Var) {
                    break;
                }
                this = nk1Var;
                rj0Var = rj0Var2;
            }
            this = nk1Var;
            rj0Var = rj0Var2;
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.R + ", " + nc1.i0(this.X) + ']';
    }

    @Override // defpackage.qk1
    public final r41 d() {
        return this;
    }
}
