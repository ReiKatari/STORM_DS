package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: p96  reason: default package */
/* loaded from: classes.dex */
public abstract class p96 extends vy0 implements sg4 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater Y = AtomicIntegerFieldUpdater.newUpdater(p96.class, "cleanedAndPointers$volatile");
    public final long X;
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    public p96(long j, p96 p96Var, int i) {
        super(p96Var);
        this.X = j;
        this.cleanedAndPointers$volatile = i << 16;
    }

    @Override // defpackage.vy0
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

    public abstract void m(int i, l61 l61Var);

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
