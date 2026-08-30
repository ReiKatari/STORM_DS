package ed;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import zc.k1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class r extends c implements k1 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater R = AtomicIntegerFieldUpdater.newUpdater(r.class, "cleanedAndPointers$volatile");
    public final long L;
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    public r(long j2, r rVar, int i2) {
        super(rVar);
        this.L = j2;
        this.cleanedAndPointers$volatile = i2 << 16;
    }

    @Override // ed.c
    public final boolean d() {
        if (R.get(this) == g() && c() != null) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        if (R.addAndGet(this, -65536) == g() && c() != null) {
            return true;
        }
        return false;
    }

    public abstract int g();

    public abstract void h(int i2, cc.g gVar);

    public final void i() {
        if (R.incrementAndGet(this) == g()) {
            e();
        }
    }

    public final boolean j() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = R;
            i2 = atomicIntegerFieldUpdater.get(this);
            if (i2 == g() && c() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 65536 + i2));
        return true;
    }
}
