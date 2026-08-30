package zc;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class a1 extends f1 {
    public final boolean L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(y0 y0Var) {
        super(true);
        l lVar;
        l lVar2;
        boolean z10 = true;
        S(y0Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1.B;
        k kVar = (k) atomicReferenceFieldUpdater.get(this);
        if (kVar instanceof l) {
            lVar = (l) kVar;
        } else {
            lVar = null;
        }
        if (lVar != null) {
            f1 i2 = lVar.i();
            while (!i2.N()) {
                k kVar2 = (k) atomicReferenceFieldUpdater.get(i2);
                if (kVar2 instanceof l) {
                    lVar2 = (l) kVar2;
                } else {
                    lVar2 = null;
                }
                if (lVar2 != null) {
                    i2 = lVar2.i();
                }
            }
            this.L = z10;
        }
        z10 = false;
        this.L = z10;
    }

    @Override // zc.f1
    public final boolean N() {
        return this.L;
    }

    @Override // zc.f1
    public final boolean O() {
        return true;
    }
}
