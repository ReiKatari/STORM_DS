package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hb4  reason: default package */
/* loaded from: classes.dex */
public final class hb4 extends kb6 implements fb4 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater f0 = AtomicReferenceFieldUpdater.newUpdater(hb4.class, Object.class, "owner$volatile");
    public static final /* synthetic */ long g0 = v36.a.objectFieldOffset(hb4.class.getDeclaredField("owner$volatile"));
    private volatile /* synthetic */ Object owner$volatile;

    public hb4() {
        super(1);
        this.owner$volatile = ib4.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
        r5 = defpackage.hb4.f0;
        r2 = r0.B;
        r5.set(r2, null);
        r0.A.G(r1, new defpackage.bg2(13, r2, r0));
     */
    @Override // defpackage.fb4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(r41 r41Var) {
        boolean g = g();
        jg7 jg7Var = jg7.a;
        if (!g) {
            rj0 C = n16.C(np2.V(r41Var));
            try {
                gb4 gb4Var = new gb4(this, C);
                while (true) {
                    int andDecrement = kb6.Z.getAndDecrement(this);
                    if (andDecrement <= this.A) {
                        if (andDecrement > 0) {
                            break;
                        } else if (b(gb4Var)) {
                            break;
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

    public final boolean f() {
        if (Math.max(kb6.Z.get(this), 0) != 0) {
            return false;
        }
        return true;
    }

    public final boolean g() {
        int i = i();
        if (i == 0) {
            return true;
        }
        if (i != 1) {
            if (i != 2) {
                i.m("unexpected");
                return false;
            }
            u34.f("This mutex is already locked by the specified owner: null");
            return false;
        }
        return false;
    }

    @Override // defpackage.fb4
    public final void h(Object obj) {
        while (this.f()) {
            f0.getClass();
            Unsafe unsafe = v36.a;
            long j = g0;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            gr1 gr1Var = ib4.a;
            if (objectVolatile != gr1Var) {
                if (objectVolatile != obj && obj != null) {
                    u34.m("This mutex is locked by ", objectVolatile, ", but ", obj, " is expected");
                    return;
                }
                while (true) {
                    Unsafe unsafe2 = v36.a;
                    hb4 hb4Var = this;
                    if (unsafe2.compareAndSwapObject(hb4Var, g0, objectVolatile, gr1Var)) {
                        hb4Var.c();
                        return;
                    } else if (unsafe2.getObjectVolatile(hb4Var, j) != objectVolatile) {
                        this = hb4Var;
                        break;
                    } else {
                        this = hb4Var;
                    }
                }
            }
        }
        i.m("This mutex is not locked");
    }

    public final int i() {
        int i;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = kb6.Z;
            int i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = this.A;
            if (i2 > i3) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i > i3) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i3));
            } else if (i2 <= 0) {
                return 1;
            } else {
                if (atomicIntegerFieldUpdater.compareAndSet(this, i2, i2 - 1)) {
                    f0.getClass();
                    v36.a.putObjectVolatile(this, g0, (Object) null);
                    return 0;
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Mutex@");
        sb.append(nc1.P(this));
        sb.append("[isLocked=");
        sb.append(f());
        sb.append(",owner=");
        f0.getClass();
        sb.append(v36.a.getObjectVolatile(this, g0));
        sb.append(']');
        return sb.toString();
    }
}
