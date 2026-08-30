package zc;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class j extends b1 {
    public final /* synthetic */ int X;
    public final h Y;

    public /* synthetic */ j(h hVar, int i2) {
        this.X = i2;
        this.Y = hVar;
    }

    @Override // zc.b1
    public final boolean j() {
        switch (this.X) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // zc.b1
    public final void k(Throwable th2) {
        switch (this.X) {
            case 0:
                f1 i2 = i();
                h hVar = this.Y;
                Throwable t5 = hVar.t(i2);
                if (hVar.A()) {
                    ed.f fVar = (ed.f) hVar.R;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ed.f.f4453b0;
                    while (true) {
                        Object obj = atomicReferenceFieldUpdater.get(fVar);
                        a0.c cVar = ed.b.f4447c;
                        if (nc.k.a(obj, cVar)) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(fVar, cVar, t5)) {
                                if (atomicReferenceFieldUpdater.get(fVar) != cVar) {
                                    break;
                                }
                            }
                            return;
                        } else if (!(obj instanceof Throwable)) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(fVar, obj, null)) {
                                if (atomicReferenceFieldUpdater.get(fVar) != obj) {
                                    break;
                                }
                            }
                        } else {
                            return;
                        }
                    }
                }
                hVar.n(t5);
                if (!hVar.A()) {
                    hVar.q();
                    return;
                }
                return;
            default:
                this.Y.h(yb.y.f14813a);
                return;
        }
    }
}
