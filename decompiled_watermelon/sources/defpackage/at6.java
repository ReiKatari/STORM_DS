package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: at6  reason: default package */
/* loaded from: classes.dex */
public final class at6 extends f63 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater e0 = AtomicIntegerFieldUpdater.newUpdater(at6.class, "_state$volatile");
    private volatile /* synthetic */ int _state$volatile;
    public final Thread c0 = Thread.currentThread();
    public eh1 d0;

    public static void t(int i) {
        throw new IllegalStateException(("Illegal state " + i).toString());
    }

    @Override // defpackage.f63
    public final boolean q() {
        return true;
    }

    @Override // defpackage.f63
    public final void r(Throwable th) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        do {
            atomicIntegerFieldUpdater = e0;
            i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 1 && i != 2 && i != 3) {
                    t(i);
                    throw null;
                }
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 2));
        this.c0.interrupt();
        atomicIntegerFieldUpdater.set(this, 3);
    }

    public final void s() {
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = e0;
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
                eh1 eh1Var = this.d0;
                if (eh1Var != null) {
                    eh1Var.dispose();
                    return;
                }
                return;
            }
        }
    }
}
