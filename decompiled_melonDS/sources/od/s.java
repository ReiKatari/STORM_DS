package od;

import pd.j0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class s extends d0 {
    public final boolean A;
    public final String B;

    public s(boolean z10, Object obj) {
        obj.getClass();
        this.A = z10;
        this.B = obj.toString();
    }

    @Override // od.d0
    public final String a() {
        return this.B;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && s.class == obj.getClass()) {
                s sVar = (s) obj;
                if (this.A == sVar.A && nc.k.a(this.B, sVar.B)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.B.hashCode() + (Boolean.hashCode(this.A) * 31);
    }

    @Override // od.d0
    public final String toString() {
        boolean z10 = this.A;
        String str = this.B;
        if (z10) {
            StringBuilder sb2 = new StringBuilder();
            j0.a(sb2, str);
            return sb2.toString();
        }
        return str;
    }
}
