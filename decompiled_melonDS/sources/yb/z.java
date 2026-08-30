package yb;

import java.io.Serializable;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class z implements f, Serializable {
    public mc.a A;
    public Object B;

    @Override // yb.f
    public final Object getValue() {
        if (this.B == v.f14812a) {
            mc.a aVar = this.A;
            aVar.getClass();
            this.B = aVar.b();
            this.A = null;
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
