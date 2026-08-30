package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: jg1  reason: default package */
/* loaded from: classes.dex */
public final class jg1 extends mg1 implements q31, j11 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater c0 = AtomicReferenceFieldUpdater.newUpdater(jg1.class, Object.class, "_reusableCancellableContinuation$volatile");
    public static final /* synthetic */ long d0 = ys5.a.objectFieldOffset(jg1.class.getDeclaredField("_reusableCancellableContinuation$volatile"));
    public final g31 R;
    public final k11 X;
    public Object Y;
    public final Object Z;
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    public jg1(g31 g31Var, k11 k11Var) {
        super(-1);
        this.R = g31Var;
        this.X = k11Var;
        this.Y = kg1.a;
        this.Z = ts6.b(k11Var.a());
    }

    @Override // defpackage.j11
    public final e31 a() {
        return this.X.a();
    }

    @Override // defpackage.q31
    public final q31 g() {
        return this.X;
    }

    @Override // defpackage.mg1
    public final Object i() {
        Object obj = this.Y;
        this.Y = kg1.a;
        return obj;
    }

    public final void j() {
        do {
            c0.getClass();
        } while (ys5.a.getObjectVolatile(this, d0) == kg1.b);
    }

    @Override // defpackage.j11
    public final void k(Object obj) {
        Object ns0Var;
        Throwable a = nc5.a(obj);
        if (a == null) {
            ns0Var = obj;
        } else {
            ns0Var = new ns0(a, false);
        }
        k11 k11Var = this.X;
        e31 a2 = k11Var.a();
        g31 g31Var = this.R;
        if (kg1.c(g31Var, a2)) {
            this.Y = ns0Var;
            this.L = 0;
            kg1.b(g31Var, k11Var.a(), this);
            return;
        }
        u12 a3 = vs6.a();
        if (a3.L >= 4294967296L) {
            this.Y = ns0Var;
            this.L = 0;
            a3.o0(this);
            return;
        }
        a3.p0(true);
        try {
            e31 a4 = k11Var.a();
            Object c = ts6.c(a4, this.Z);
            k11Var.k(obj);
            ts6.a(a4, c);
            do {
            } while (a3.r0());
        } finally {
            try {
            } finally {
            }
        }
    }

    public final ih0 n() {
        jg1 jg1Var;
        while (true) {
            c0.getClass();
            Unsafe unsafe = ys5.a;
            long j = d0;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            an1 an1Var = kg1.b;
            if (objectVolatile == null) {
                unsafe.putObjectVolatile(this, j, an1Var);
                return null;
            }
            if (objectVolatile instanceof ih0) {
                while (true) {
                    Unsafe unsafe2 = ys5.a;
                    jg1Var = this;
                    if (unsafe2.compareAndSwapObject(jg1Var, d0, objectVolatile, an1Var)) {
                        return (ih0) objectVolatile;
                    }
                    if (unsafe2.getObjectVolatile(jg1Var, j) != objectVolatile) {
                        break;
                    }
                    this = jg1Var;
                }
            } else {
                jg1Var = this;
                if (objectVolatile != an1Var && !(objectVolatile instanceof Throwable)) {
                    f81.p(objectVolatile, "Inconsistent state ");
                    return null;
                }
            }
            this = jg1Var;
        }
    }

    public final ih0 o() {
        c0.getClass();
        Object objectVolatile = ys5.a.getObjectVolatile(this, d0);
        if (objectVolatile instanceof ih0) {
            return (ih0) objectVolatile;
        }
        return null;
    }

    public final boolean p() {
        c0.getClass();
        if (ys5.a.getObjectVolatile(this, d0) != null) {
            return true;
        }
        return false;
    }

    public final boolean q(Throwable th) {
        jg1 jg1Var;
        Throwable th2;
        Unsafe unsafe;
        while (true) {
            c0.getClass();
            Unsafe unsafe2 = ys5.a;
            long j = d0;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            an1 an1Var = kg1.b;
            if (b53.x(objectVolatile, an1Var)) {
                while (true) {
                    Unsafe unsafe3 = ys5.a;
                    jg1 jg1Var2 = this;
                    th2 = th;
                    jg1Var = jg1Var2;
                    if (!unsafe3.compareAndSwapObject(jg1Var2, d0, an1Var, th2)) {
                        if (unsafe3.getObjectVolatile(jg1Var, j) != an1Var) {
                            break;
                        }
                        this = jg1Var;
                        th = th2;
                    } else {
                        return true;
                    }
                }
            } else {
                jg1Var = this;
                th2 = th;
                if (objectVolatile instanceof Throwable) {
                    return true;
                }
                do {
                    unsafe = ys5.a;
                    if (unsafe.compareAndSwapObject(jg1Var, d0, objectVolatile, (Object) null)) {
                        return false;
                    }
                } while (unsafe.getObjectVolatile(jg1Var, j) == objectVolatile);
            }
            this = jg1Var;
            th = th2;
        }
    }

    public final Throwable t(ih0 ih0Var) {
        Unsafe unsafe;
        jg1 jg1Var;
        ih0 ih0Var2;
        while (true) {
            c0.getClass();
            Unsafe unsafe2 = ys5.a;
            long j = d0;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            an1 an1Var = kg1.b;
            if (objectVolatile != an1Var) {
                jg1 jg1Var2 = this;
                if (objectVolatile instanceof Throwable) {
                    do {
                        unsafe = ys5.a;
                        if (unsafe.compareAndSwapObject(jg1Var2, d0, objectVolatile, (Object) null)) {
                            return (Throwable) objectVolatile;
                        }
                    } while (unsafe.getObjectVolatile(jg1Var2, j) == objectVolatile);
                    i.i("Failed requirement.");
                    return null;
                }
                f81.p(objectVolatile, "Inconsistent state ");
                return null;
            }
            while (true) {
                Unsafe unsafe3 = ys5.a;
                jg1Var = this;
                ih0Var2 = ih0Var;
                if (unsafe3.compareAndSwapObject(jg1Var, d0, an1Var, ih0Var2)) {
                    return null;
                }
                if (unsafe3.getObjectVolatile(jg1Var, j) != an1Var) {
                    break;
                }
                this = jg1Var;
                ih0Var = ih0Var2;
            }
            this = jg1Var;
            ih0Var = ih0Var2;
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.R + ", " + w81.G(this.X) + ']';
    }

    @Override // defpackage.mg1
    public final j11 d() {
        return this;
    }
}
