package yb;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class m implements f, Serializable {
    public static final AtomicReferenceFieldUpdater L = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "B");
    public volatile mc.a A;
    public volatile Object B;

    @Override // yb.f
    public final Object getValue() {
        Object obj = this.B;
        v vVar = v.f14812a;
        if (obj != vVar) {
            return obj;
        }
        mc.a aVar = this.A;
        if (aVar != null) {
            Object b10 = aVar.b();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = L;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, vVar, b10)) {
                if (atomicReferenceFieldUpdater.get(this) != vVar) {
                    return this.B;
                }
            }
            this.A = null;
            return b10;
        }
        return this.B;
    }

    public final String toString() {
        if (this.B != v.f14812a) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }
}
