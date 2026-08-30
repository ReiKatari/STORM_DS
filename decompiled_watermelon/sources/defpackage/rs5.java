package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: rs5  reason: default package */
/* loaded from: classes.dex */
public final class rs5 implements j11, q31 {
    public static final AtomicReferenceFieldUpdater B = AtomicReferenceFieldUpdater.newUpdater(rs5.class, Object.class, "result");
    public static final /* synthetic */ long L = ys5.a.objectFieldOffset(rs5.class.getDeclaredField("result"));
    public final j11 A;
    private volatile Object result;

    public rs5(j11 j11Var, p31 p31Var) {
        this.A = j11Var;
        this.result = p31Var;
    }

    @Override // defpackage.j11
    public final e31 a() {
        return this.A.a();
    }

    public final Object b() {
        Object obj = this.result;
        p31 p31Var = p31.UNDECIDED;
        if (obj == p31Var) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = B;
            p31 p31Var2 = p31.COROUTINE_SUSPENDED;
            while (true) {
                atomicReferenceFieldUpdater.getClass();
                Unsafe unsafe = ys5.a;
                long j = L;
                rs5 rs5Var = this;
                if (unsafe.compareAndSwapObject(rs5Var, j, p31Var, p31Var2)) {
                    return p31.COROUTINE_SUSPENDED;
                }
                if (unsafe.getObjectVolatile(rs5Var, j) != p31Var) {
                    obj = rs5Var.result;
                    break;
                }
                this = rs5Var;
            }
        }
        if (obj == p31.RESUMED) {
            return p31.COROUTINE_SUSPENDED;
        }
        if (!(obj instanceof kc5)) {
            return obj;
        }
        throw ((kc5) obj).A;
    }

    @Override // defpackage.q31
    public final q31 g() {
        j11 j11Var = this.A;
        if (j11Var instanceof q31) {
            return (q31) j11Var;
        }
        return null;
    }

    @Override // defpackage.j11
    public final void k(Object obj) {
        rs5 rs5Var;
        Object obj2;
        Unsafe unsafe;
        long j;
        while (true) {
            Object obj3 = this.result;
            p31 p31Var = p31.UNDECIDED;
            if (obj3 == p31Var) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = B;
                while (true) {
                    atomicReferenceFieldUpdater.getClass();
                    Unsafe unsafe2 = ys5.a;
                    long j2 = L;
                    rs5Var = this;
                    obj2 = obj;
                    if (unsafe2.compareAndSwapObject(rs5Var, j2, p31Var, obj2)) {
                        return;
                    }
                    if (unsafe2.getObjectVolatile(rs5Var, j2) != p31Var) {
                        break;
                    }
                    this = rs5Var;
                    obj = obj2;
                }
            } else {
                rs5Var = this;
                obj2 = obj;
                p31 p31Var2 = p31.COROUTINE_SUSPENDED;
                if (obj3 == p31Var2) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = B;
                    p31 p31Var3 = p31.RESUMED;
                    do {
                        atomicReferenceFieldUpdater2.getClass();
                        unsafe = ys5.a;
                        j = L;
                        if (unsafe.compareAndSwapObject(rs5Var, j, p31Var2, p31Var3)) {
                            rs5Var.A.k(obj2);
                            return;
                        }
                    } while (unsafe.getObjectVolatile(rs5Var, j) == p31Var2);
                } else {
                    i.n("Already resumed");
                    return;
                }
            }
            this = rs5Var;
            obj = obj2;
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.A;
    }
}
