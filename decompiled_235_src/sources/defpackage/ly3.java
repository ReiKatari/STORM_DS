package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ly3  reason: default package */
/* loaded from: classes.dex */
public class ly3 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(ly3.class, Object.class, "_cur$volatile");
    public static final /* synthetic */ long b = v36.a.objectFieldOffset(ly3.class.getDeclaredField("_cur$volatile"));
    private volatile /* synthetic */ Object _cur$volatile = new ny3(8, false);

    public final boolean a(Runnable runnable) {
        ly3 ly3Var;
        while (true) {
            a.getClass();
            Unsafe unsafe = v36.a;
            long j = b;
            ny3 ny3Var = (ny3) unsafe.getObjectVolatile(this, j);
            int a2 = ny3Var.a(runnable);
            if (a2 == 0) {
                return true;
            }
            if (a2 != 1) {
                if (a2 != 2) {
                    ly3Var = this;
                } else {
                    return false;
                }
            } else {
                ny3 d = ny3Var.d();
                while (true) {
                    Unsafe unsafe2 = v36.a;
                    ly3Var = this;
                    if (!unsafe2.compareAndSwapObject(ly3Var, b, ny3Var, d) && unsafe2.getObjectVolatile(ly3Var, j) == ny3Var) {
                        this = ly3Var;
                    }
                }
            }
            this = ly3Var;
        }
    }

    public final void b() {
        ly3 ly3Var;
        while (true) {
            a.getClass();
            Unsafe unsafe = v36.a;
            long j = b;
            ny3 ny3Var = (ny3) unsafe.getObjectVolatile(this, j);
            if (ny3Var.c()) {
                return;
            }
            ny3 d = ny3Var.d();
            while (true) {
                Unsafe unsafe2 = v36.a;
                ly3Var = this;
                if (!unsafe2.compareAndSwapObject(ly3Var, b, ny3Var, d) && unsafe2.getObjectVolatile(ly3Var, j) == ny3Var) {
                    this = ly3Var;
                }
            }
            this = ly3Var;
        }
    }

    public final int c() {
        a.getClass();
        ny3 ny3Var = (ny3) v36.a.getObjectVolatile(this, b);
        ny3Var.getClass();
        long j = ny3.f.get(ny3Var);
        return 1073741823 & (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j)));
    }

    public final Object d() {
        ly3 ly3Var;
        while (true) {
            a.getClass();
            Unsafe unsafe = v36.a;
            long j = b;
            ny3 ny3Var = (ny3) unsafe.getObjectVolatile(this, j);
            Object e = ny3Var.e();
            if (e != ny3.g) {
                return e;
            }
            ny3 d = ny3Var.d();
            while (true) {
                Unsafe unsafe2 = v36.a;
                ly3Var = this;
                if (!unsafe2.compareAndSwapObject(ly3Var, b, ny3Var, d) && unsafe2.getObjectVolatile(ly3Var, j) == ny3Var) {
                    this = ly3Var;
                }
            }
            this = ly3Var;
        }
    }
}
