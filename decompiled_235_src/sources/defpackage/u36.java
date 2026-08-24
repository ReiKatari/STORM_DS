package defpackage;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: u36  reason: default package */
/* loaded from: classes.dex */
public final class u36 implements go3, Serializable {
    public static final AtomicReferenceFieldUpdater L = AtomicReferenceFieldUpdater.newUpdater(u36.class, Object.class, "B");
    public static final /* synthetic */ long R = v36.a.objectFieldOffset(u36.class.getDeclaredField("B"));
    public volatile on2 A;
    public volatile Object B;

    @Override // defpackage.go3
    public final Object getValue() {
        u36 u36Var;
        Object obj = this.B;
        xd5 xd5Var = xd5.u0;
        if (obj != xd5Var) {
            return obj;
        }
        on2 on2Var = this.A;
        if (on2Var != null) {
            Object c = on2Var.c();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = L;
            while (true) {
                atomicReferenceFieldUpdater.getClass();
                Unsafe unsafe = v36.a;
                long j = R;
                u36Var = this;
                if (unsafe.compareAndSwapObject(u36Var, j, xd5Var, c)) {
                    u36Var.A = null;
                    return c;
                } else if (unsafe.getObjectVolatile(u36Var, j) != xd5Var) {
                    break;
                } else {
                    this = u36Var;
                }
            }
        } else {
            u36Var = this;
        }
        return u36Var.B;
    }

    public final String toString() {
        boolean z;
        if (this.B != xd5.u0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }
}
