package zc;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class x0 extends b1 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater Y = AtomicIntegerFieldUpdater.newUpdater(x0.class, "_invoked$volatile");
    public final a2.g X;
    private volatile /* synthetic */ int _invoked$volatile;

    public x0(a2.g gVar) {
        this.X = gVar;
    }

    @Override // zc.b1
    public final boolean j() {
        return true;
    }

    @Override // zc.b1
    public final void k(Throwable th2) {
        if (Y.compareAndSet(this, 0, 1)) {
            this.X.k(th2);
        }
    }
}
