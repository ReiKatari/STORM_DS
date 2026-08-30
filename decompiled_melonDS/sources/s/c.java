package s;

import java.util.Map;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c implements Map.Entry {
    public final Object A;
    public final Object B;
    public c L;
    public c R;

    public c(Object obj, Object obj2) {
        this.A = obj;
        this.B = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (this.A.equals(cVar.A) && this.B.equals(cVar.B)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.A;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.B;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.A.hashCode() ^ this.B.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.A + "=" + this.B;
    }
}
