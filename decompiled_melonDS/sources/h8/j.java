package h8;

import java.math.BigInteger;
import yb.n;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class j implements Comparable {
    public static final j Y;
    public final int A;
    public final int B;
    public final int L;
    public final String R;
    public final n X = new n(new a2.n(22, this));

    static {
        new j("", 0, 0, 0);
        Y = new j("", 0, 1, 0);
        new j("", 1, 0, 0);
    }

    public j(String str, int i2, int i10, int i11) {
        this.A = i2;
        this.B = i10;
        this.L = i11;
        this.R = str;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        j jVar = (j) obj;
        jVar.getClass();
        Object value = this.X.getValue();
        value.getClass();
        Object value2 = jVar.X.getValue();
        value2.getClass();
        return ((BigInteger) value).compareTo((BigInteger) value2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (this.A != jVar.A || this.B != jVar.B || this.L != jVar.L) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((527 + this.A) * 31) + this.B) * 31) + this.L;
    }

    public final String toString() {
        String str;
        String str2 = this.R;
        if (!vc.h.j0(str2)) {
            str = "-".concat(str2);
        } else {
            str = "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.A);
        sb2.append('.');
        sb2.append(this.B);
        sb2.append('.');
        return w.d.q(sb2, this.L, str);
    }
}
