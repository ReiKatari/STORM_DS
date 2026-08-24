package defpackage;

import java.io.Serializable;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: u9  reason: default package */
/* loaded from: classes.dex */
public class u9 implements oo2, Serializable {
    public final Object A;
    public final Class B;
    public final String L;
    public final String R;
    public final boolean X = false;
    public final int Y;
    public final int Z;

    public u9(int i, int i2, Class cls, Object obj, String str, String str2) {
        this.A = obj;
        this.B = cls;
        this.L = str;
        this.R = str2;
        this.Y = i;
        this.Z = i2 >> 1;
    }

    @Override // defpackage.oo2
    public final int d() {
        return this.Y;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof u9) {
                u9 u9Var = (u9) obj;
                if (this.X == u9Var.X && this.Y == u9Var.Y && this.Z == u9Var.Z && nb3.k(this.A, u9Var.A) && this.B.equals(u9Var.B) && this.L.equals(u9Var.L) && this.R.equals(u9Var.R)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int i2;
        Object obj = this.A;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        int d = xg6.d(xg6.d((this.B.hashCode() + (i * 31)) * 31, 31, this.L), 31, this.R);
        if (this.X) {
            i2 = 1231;
        } else {
            i2 = 1237;
        }
        return ((((d + i2) * 31) + this.Y) * 31) + this.Z;
    }

    public final String toString() {
        gh5.a.getClass();
        return lh5.a(this);
    }
}
