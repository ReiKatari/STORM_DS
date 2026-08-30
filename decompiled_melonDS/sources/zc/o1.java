package zc;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class o1 extends b1 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater Z = AtomicIntegerFieldUpdater.newUpdater(o1.class, "_state$volatile");
    public final Thread X = Thread.currentThread();
    public i0 Y;
    private volatile /* synthetic */ int _state$volatile;

    public static void m(int i2) {
        throw new IllegalStateException(("Illegal state " + i2).toString());
    }

    @Override // zc.b1
    public final boolean j() {
        return true;
    }

    @Override // zc.b1
    public final void k(Throwable th2) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = Z;
            i2 = atomicIntegerFieldUpdater.get(this);
            if (i2 != 0) {
                if (i2 != 1 && i2 != 2 && i2 != 3) {
                    m(i2);
                    throw null;
                }
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 2));
        this.X.interrupt();
        atomicIntegerFieldUpdater.set(this, 3);
    }

    public final void l() {
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = Z;
            int i2 = atomicIntegerFieldUpdater.get(this);
            if (i2 != 0) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        m(i2);
                        throw null;
                    }
                }
            } else if (atomicIntegerFieldUpdater.compareAndSet(this, i2, 1)) {
                i0 i0Var = this.Y;
                if (i0Var != null) {
                    i0Var.dispose();
                    return;
                }
                return;
            }
        }
    }
}
