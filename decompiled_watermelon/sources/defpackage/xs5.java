package defpackage;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xs5  reason: default package */
/* loaded from: classes.dex */
public final class xs5 implements gh3, Serializable {
    public static final AtomicReferenceFieldUpdater L = AtomicReferenceFieldUpdater.newUpdater(xs5.class, Object.class, "B");
    public static final /* synthetic */ long R = ys5.a.objectFieldOffset(xs5.class.getDeclaredField("B"));
    public volatile ki2 A;
    public volatile Object B;

    @Override // defpackage.gh3
    public final Object getValue() {
        xs5 xs5Var;
        Object obj = this.B;
        sn1 sn1Var = sn1.u0;
        if (obj != sn1Var) {
            return obj;
        }
        ki2 ki2Var = this.A;
        if (ki2Var != null) {
            Object c = ki2Var.c();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = L;
            while (true) {
                atomicReferenceFieldUpdater.getClass();
                Unsafe unsafe = ys5.a;
                long j = R;
                xs5Var = this;
                if (unsafe.compareAndSwapObject(xs5Var, j, sn1Var, c)) {
                    xs5Var.A = null;
                    return c;
                } else if (unsafe.getObjectVolatile(xs5Var, j) != sn1Var) {
                    break;
                } else {
                    this = xs5Var;
                }
            }
        } else {
            xs5Var = this;
        }
        return xs5Var.B;
    }

    public final String toString() {
        boolean z;
        if (this.B != sn1.u0) {
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
