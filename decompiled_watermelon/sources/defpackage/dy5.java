package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: dy5  reason: default package */
/* loaded from: classes.dex */
public abstract class dy5 extends zv0 implements b84 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater Y = AtomicIntegerFieldUpdater.newUpdater(dy5.class, "cleanedAndPointers$volatile");
    public final long X;
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    public dy5(long j, dy5 dy5Var, int i) {
        super(dy5Var);
        this.X = j;
        this.cleanedAndPointers$volatile = i << 16;
    }

    @Override // defpackage.zv0
    public final boolean g() {
        if (Y.get(this) == l() && d() != null) {
            return true;
        }
        return false;
    }

    public final boolean k() {
        if (Y.addAndGet(this, -65536) == l() && d() != null) {
            return true;
        }
        return false;
    }

    public abstract int l();

    public abstract void m(int i, e31 e31Var);

    public final void n() {
        if (Y.incrementAndGet(this) == l()) {
            i();
        }
    }

    public final boolean o() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        do {
            atomicIntegerFieldUpdater = Y;
            i = atomicIntegerFieldUpdater.get(this);
            if (i == l() && d() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 65536 + i));
        return true;
    }
}
