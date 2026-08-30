package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: zv0  reason: default package */
/* loaded from: classes.dex */
public abstract class zv0 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater A = AtomicReferenceFieldUpdater.newUpdater(zv0.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater B;
    public static final /* synthetic */ long L;
    public static final /* synthetic */ long R;
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    static {
        Unsafe unsafe = ys5.a;
        L = unsafe.objectFieldOffset(zv0.class.getDeclaredField("_next$volatile"));
        B = AtomicReferenceFieldUpdater.newUpdater(zv0.class, Object.class, "_prev$volatile");
        R = unsafe.objectFieldOffset(zv0.class.getDeclaredField("_prev$volatile"));
    }

    public zv0(dy5 dy5Var) {
        this._prev$volatile = dy5Var;
    }

    public final void b() {
        B.getClass();
        ys5.a.putObjectVolatile(this, R, (Object) null);
    }

    public final zv0 c() {
        zv0 f = f();
        while (f != null && f.g()) {
            B.getClass();
            f = (zv0) ys5.a.getObjectVolatile(f, R);
        }
        return f;
    }

    public final zv0 d() {
        Object e = e();
        if (e == yv0.a) {
            return null;
        }
        return (zv0) e;
    }

    public final Object e() {
        A.getClass();
        return ys5.a.getObjectVolatile(this, L);
    }

    public final zv0 f() {
        B.getClass();
        return (zv0) ys5.a.getObjectVolatile(this, R);
    }

    public abstract boolean g();

    public final boolean h() {
        while (true) {
            A.getClass();
            Unsafe unsafe = ys5.a;
            long j = L;
            zv0 zv0Var = this;
            if (unsafe.compareAndSwapObject(zv0Var, j, (Object) null, yv0.a)) {
                return true;
            }
            if (unsafe.getObjectVolatile(zv0Var, j) != null) {
                return false;
            }
            this = zv0Var;
        }
    }

    public final void i() {
        zv0 zv0Var;
        zv0 zv0Var2;
        Unsafe unsafe;
        if (d() == null) {
            return;
        }
        while (true) {
            zv0 c = c();
            zv0 d = d();
            d.getClass();
            do {
                zv0Var = d;
                if (!zv0Var.g()) {
                    break;
                }
                d = zv0Var.d();
            } while (d != null);
            while (true) {
                B.getClass();
                Unsafe unsafe2 = ys5.a;
                long j = R;
                Object objectVolatile = unsafe2.getObjectVolatile(zv0Var, j);
                if (((zv0) objectVolatile) == null) {
                    zv0Var2 = null;
                } else {
                    zv0Var2 = c;
                }
                do {
                    unsafe = ys5.a;
                    if (unsafe.compareAndSwapObject(zv0Var, R, objectVolatile, zv0Var2)) {
                        break;
                    }
                } while (unsafe.getObjectVolatile(zv0Var, j) == objectVolatile);
            }
            if (c != null) {
                A.getClass();
                unsafe.putObjectVolatile(c, L, zv0Var);
            }
            if (!zv0Var.g() || zv0Var.d() == null) {
                if (c == null || !c.g()) {
                    return;
                }
            }
        }
    }

    public final boolean j(dy5 dy5Var) {
        while (true) {
            A.getClass();
            Unsafe unsafe = ys5.a;
            long j = L;
            zv0 zv0Var = this;
            dy5 dy5Var2 = dy5Var;
            if (unsafe.compareAndSwapObject(zv0Var, j, (Object) null, dy5Var2)) {
                return true;
            }
            if (unsafe.getObjectVolatile(zv0Var, j) != null) {
                return false;
            }
            this = zv0Var;
            dy5Var = dy5Var2;
        }
    }
}
