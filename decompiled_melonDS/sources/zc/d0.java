package zc;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d0 extends ed.q {
    public static final /* synthetic */ AtomicIntegerFieldUpdater X = AtomicIntegerFieldUpdater.newUpdater(d0.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    @Override // ed.q, zc.f1
    public final void c(Object obj) {
        q(obj);
    }

    @Override // ed.q, zc.f1
    public final void q(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = X;
            int i2 = atomicIntegerFieldUpdater.get(this);
            if (i2 != 0) {
                if (i2 == 1) {
                    ed.b.h(pc.a.A(this.R), x.x(obj));
                    return;
                } else {
                    a0.j.p("Already resumed");
                    return;
                }
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
