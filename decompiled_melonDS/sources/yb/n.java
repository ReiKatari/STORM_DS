package yb;

import java.io.Serializable;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class n implements f, Serializable {
    public mc.a A;
    public volatile Object B;
    public final Object L;

    public n(mc.a aVar) {
        aVar.getClass();
        this.A = aVar;
        this.B = v.f14812a;
        this.L = this;
    }

    @Override // yb.f
    public final Object getValue() {
        Object obj;
        Object obj2 = this.B;
        v vVar = v.f14812a;
        if (obj2 != vVar) {
            return obj2;
        }
        synchronized (this.L) {
            obj = this.B;
            if (obj == vVar) {
                mc.a aVar = this.A;
                aVar.getClass();
                obj = aVar.b();
                this.B = obj;
                this.A = null;
            }
        }
        return obj;
    }

    public final String toString() {
        if (this.B != v.f14812a) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }
}
