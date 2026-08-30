package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: kr3  reason: default package */
/* loaded from: classes.dex */
public class kr3 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(kr3.class, Object.class, "_cur$volatile");
    public static final /* synthetic */ long b = ys5.a.objectFieldOffset(kr3.class.getDeclaredField("_cur$volatile"));
    private volatile /* synthetic */ Object _cur$volatile = new mr3(8, false);

    public final boolean a(Runnable runnable) {
        kr3 kr3Var;
        while (true) {
            a.getClass();
            Unsafe unsafe = ys5.a;
            long j = b;
            mr3 mr3Var = (mr3) unsafe.getObjectVolatile(this, j);
            int a2 = mr3Var.a(runnable);
            if (a2 == 0) {
                return true;
            }
            if (a2 != 1) {
                if (a2 != 2) {
                    kr3Var = this;
                } else {
                    return false;
                }
            } else {
                mr3 d = mr3Var.d();
                while (true) {
                    Unsafe unsafe2 = ys5.a;
                    kr3Var = this;
                    if (!unsafe2.compareAndSwapObject(kr3Var, b, mr3Var, d) && unsafe2.getObjectVolatile(kr3Var, j) == mr3Var) {
                        this = kr3Var;
                    }
                }
            }
            this = kr3Var;
        }
    }

    public final void b() {
        kr3 kr3Var;
        while (true) {
            a.getClass();
            Unsafe unsafe = ys5.a;
            long j = b;
            mr3 mr3Var = (mr3) unsafe.getObjectVolatile(this, j);
            if (mr3Var.c()) {
                return;
            }
            mr3 d = mr3Var.d();
            while (true) {
                Unsafe unsafe2 = ys5.a;
                kr3Var = this;
                if (!unsafe2.compareAndSwapObject(kr3Var, b, mr3Var, d) && unsafe2.getObjectVolatile(kr3Var, j) == mr3Var) {
                    this = kr3Var;
                }
            }
            this = kr3Var;
        }
    }

    public final int c() {
        a.getClass();
        mr3 mr3Var = (mr3) ys5.a.getObjectVolatile(this, b);
        mr3Var.getClass();
        long j = mr3.f.get(mr3Var);
        return 1073741823 & (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j)));
    }

    public final Object d() {
        kr3 kr3Var;
        while (true) {
            a.getClass();
            Unsafe unsafe = ys5.a;
            long j = b;
            mr3 mr3Var = (mr3) unsafe.getObjectVolatile(this, j);
            Object e = mr3Var.e();
            if (e != mr3.g) {
                return e;
            }
            mr3 d = mr3Var.d();
            while (true) {
                Unsafe unsafe2 = ys5.a;
                kr3Var = this;
                if (!unsafe2.compareAndSwapObject(kr3Var, b, mr3Var, d) && unsafe2.getObjectVolatile(kr3Var, j) == mr3Var) {
                    this = kr3Var;
                }
            }
            this = kr3Var;
        }
    }
}
