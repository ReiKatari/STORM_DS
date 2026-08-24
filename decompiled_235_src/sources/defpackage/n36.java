package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: n36  reason: default package */
/* loaded from: classes.dex */
public final class n36 implements r41, y61 {
    public static final AtomicReferenceFieldUpdater B = AtomicReferenceFieldUpdater.newUpdater(n36.class, Object.class, "result");
    public static final /* synthetic */ long L = v36.a.objectFieldOffset(n36.class.getDeclaredField("result"));
    public final r41 A;
    private volatile Object result;

    public n36(r41 r41Var, x61 x61Var) {
        this.A = r41Var;
        this.result = x61Var;
    }

    public final Object a() {
        Object obj = this.result;
        x61 x61Var = x61.UNDECIDED;
        if (obj == x61Var) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = B;
            x61 x61Var2 = x61.COROUTINE_SUSPENDED;
            while (true) {
                atomicReferenceFieldUpdater.getClass();
                Unsafe unsafe = v36.a;
                long j = L;
                n36 n36Var = this;
                if (unsafe.compareAndSwapObject(n36Var, j, x61Var, x61Var2)) {
                    return x61.COROUTINE_SUSPENDED;
                }
                if (unsafe.getObjectVolatile(n36Var, j) != x61Var) {
                    obj = n36Var.result;
                    break;
                }
                this = n36Var;
            }
        }
        if (obj == x61.RESUMED) {
            return x61.COROUTINE_SUSPENDED;
        }
        if (!(obj instanceof em5)) {
            return obj;
        }
        throw ((em5) obj).A;
    }

    @Override // defpackage.r41
    public final l61 b() {
        return this.A.b();
    }

    @Override // defpackage.y61
    public final y61 f() {
        r41 r41Var = this.A;
        if (r41Var instanceof y61) {
            return (y61) r41Var;
        }
        return null;
    }

    @Override // defpackage.r41
    public final void i(Object obj) {
        n36 n36Var;
        Object obj2;
        Unsafe unsafe;
        long j;
        while (true) {
            Object obj3 = this.result;
            x61 x61Var = x61.UNDECIDED;
            if (obj3 == x61Var) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = B;
                while (true) {
                    atomicReferenceFieldUpdater.getClass();
                    Unsafe unsafe2 = v36.a;
                    long j2 = L;
                    n36Var = this;
                    obj2 = obj;
                    if (unsafe2.compareAndSwapObject(n36Var, j2, x61Var, obj2)) {
                        return;
                    }
                    if (unsafe2.getObjectVolatile(n36Var, j2) != x61Var) {
                        break;
                    }
                    this = n36Var;
                    obj = obj2;
                }
            } else {
                n36Var = this;
                obj2 = obj;
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                if (obj3 == x61Var2) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = B;
                    x61 x61Var3 = x61.RESUMED;
                    do {
                        atomicReferenceFieldUpdater2.getClass();
                        unsafe = v36.a;
                        j = L;
                        if (unsafe.compareAndSwapObject(n36Var, j, x61Var2, x61Var3)) {
                            n36Var.A.i(obj2);
                            return;
                        }
                    } while (unsafe.getObjectVolatile(n36Var, j) == x61Var2);
                } else {
                    i.m("Already resumed");
                    return;
                }
            }
            this = n36Var;
            obj = obj2;
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.A;
    }
}
