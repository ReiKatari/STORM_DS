package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vy0  reason: default package */
/* loaded from: classes.dex */
public abstract class vy0 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater A = AtomicReferenceFieldUpdater.newUpdater(vy0.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater B;
    public static final /* synthetic */ long L;
    public static final /* synthetic */ long R;
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    static {
        Unsafe unsafe = v36.a;
        L = unsafe.objectFieldOffset(vy0.class.getDeclaredField("_next$volatile"));
        B = AtomicReferenceFieldUpdater.newUpdater(vy0.class, Object.class, "_prev$volatile");
        R = unsafe.objectFieldOffset(vy0.class.getDeclaredField("_prev$volatile"));
    }

    public vy0(p96 p96Var) {
        this._prev$volatile = p96Var;
    }

    public final void a() {
        B.getClass();
        v36.a.putObjectVolatile(this, R, (Object) null);
    }

    public final vy0 c() {
        vy0 f = f();
        while (f != null && f.g()) {
            B.getClass();
            f = (vy0) v36.a.getObjectVolatile(f, R);
        }
        return f;
    }

    public final vy0 d() {
        Object e = e();
        if (e == uy0.a) {
            return null;
        }
        return (vy0) e;
    }

    public final Object e() {
        A.getClass();
        return v36.a.getObjectVolatile(this, L);
    }

    public final vy0 f() {
        B.getClass();
        return (vy0) v36.a.getObjectVolatile(this, R);
    }

    public abstract boolean g();

    public final boolean h() {
        while (true) {
            A.getClass();
            Unsafe unsafe = v36.a;
            long j = L;
            vy0 vy0Var = this;
            if (unsafe.compareAndSwapObject(vy0Var, j, (Object) null, uy0.a)) {
                return true;
            }
            if (unsafe.getObjectVolatile(vy0Var, j) != null) {
                return false;
            }
            this = vy0Var;
        }
    }

    public final void i() {
        vy0 vy0Var;
        vy0 vy0Var2;
        Unsafe unsafe;
        if (d() == null) {
            return;
        }
        while (true) {
            vy0 c = c();
            vy0 d = d();
            d.getClass();
            do {
                vy0Var = d;
                if (!vy0Var.g()) {
                    break;
                }
                d = vy0Var.d();
            } while (d != null);
            while (true) {
                B.getClass();
                Unsafe unsafe2 = v36.a;
                long j = R;
                Object objectVolatile = unsafe2.getObjectVolatile(vy0Var, j);
                if (((vy0) objectVolatile) == null) {
                    vy0Var2 = null;
                } else {
                    vy0Var2 = c;
                }
                do {
                    unsafe = v36.a;
                    if (unsafe.compareAndSwapObject(vy0Var, R, objectVolatile, vy0Var2)) {
                        break;
                    }
                } while (unsafe.getObjectVolatile(vy0Var, j) == objectVolatile);
            }
            if (c != null) {
                A.getClass();
                unsafe.putObjectVolatile(c, L, vy0Var);
            }
            if (!vy0Var.g() || vy0Var.d() == null) {
                if (c == null || !c.g()) {
                    return;
                }
            }
        }
    }

    public final boolean j(p96 p96Var) {
        while (true) {
            A.getClass();
            Unsafe unsafe = v36.a;
            long j = L;
            vy0 vy0Var = this;
            p96 p96Var2 = p96Var;
            if (unsafe.compareAndSwapObject(vy0Var, j, (Object) null, p96Var2)) {
                return true;
            }
            if (unsafe.getObjectVolatile(vy0Var, j) != null) {
                return false;
            }
            this = vy0Var;
            p96Var = p96Var2;
        }
    }
}
