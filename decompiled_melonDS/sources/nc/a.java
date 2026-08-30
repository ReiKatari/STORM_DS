package nc;

import java.io.Serializable;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class a implements h, Serializable {
    public final Object A;
    public final Class B;
    public final String L;
    public final String R;
    public final boolean X = false;
    public final int Y;
    public final int Z;

    public a(int i2, int i10, Class cls, Object obj, String str, String str2) {
        this.A = obj;
        this.B = cls;
        this.L = str;
        this.R = str2;
        this.Y = i2;
        this.Z = i10 >> 1;
    }

    @Override // nc.h
    public final int c() {
        return this.Y;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.X == aVar.X && this.Y == aVar.Y && this.Z == aVar.Z && k.a(this.A, aVar.A) && this.B.equals(aVar.B) && this.L.equals(aVar.L) && this.R.equals(aVar.R)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i2;
        int i10;
        Object obj = this.A;
        if (obj != null) {
            i2 = obj.hashCode();
        } else {
            i2 = 0;
        }
        int d4 = w.d.d(w.d.d((this.B.hashCode() + (i2 * 31)) * 31, 31, this.L), 31, this.R);
        if (this.X) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return ((((d4 + i10) * 31) + this.Y) * 31) + this.Z;
    }

    public final String toString() {
        u.f10262a.getClass();
        return v.a(this);
    }
}
