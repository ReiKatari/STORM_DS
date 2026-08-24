package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: r57  reason: default package */
/* loaded from: classes.dex */
public final class r57 extends uc3 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater f0 = AtomicIntegerFieldUpdater.newUpdater(r57.class, "_state$volatile");
    private volatile /* synthetic */ int _state$volatile;
    public final Thread d0 = Thread.currentThread();
    public il1 e0;

    public static void t(int i) {
        throw new IllegalStateException(("Illegal state " + i).toString());
    }

    @Override // defpackage.uc3
    public final boolean q() {
        return true;
    }

    @Override // defpackage.uc3
    public final void r(Throwable th) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        do {
            atomicIntegerFieldUpdater = f0;
            i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 1 && i != 2 && i != 3) {
                    t(i);
                    throw null;
                }
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 2));
        this.d0.interrupt();
        atomicIntegerFieldUpdater.set(this, 3);
    }

    public final void s() {
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f0;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 2) {
                    if (i == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        t(i);
                        throw null;
                    }
                }
            } else if (atomicIntegerFieldUpdater.compareAndSet(this, i, 1)) {
                il1 il1Var = this.e0;
                if (il1Var != null) {
                    il1Var.dispose();
                    return;
                }
                return;
            }
        }
    }
}
