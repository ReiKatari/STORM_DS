package defpackage;

import java.io.Serializable;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: t9  reason: default package */
/* loaded from: classes.dex */
public class t9 implements kj2, Serializable {
    public final Object A;
    public final Class B;
    public final String L;
    public final String R;
    public final boolean X = false;
    public final int Y;
    public final int Z;

    public t9(int i, int i2, Class cls, Object obj, String str, String str2) {
        this.A = obj;
        this.B = cls;
        this.L = str;
        this.R = str2;
        this.Y = i;
        this.Z = i2 >> 1;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof t9) {
                t9 t9Var = (t9) obj;
                if (this.X == t9Var.X && this.Y == t9Var.Y && this.Z == t9Var.Z && b53.x(this.A, t9Var.A) && this.B.equals(t9Var.B) && this.L.equals(t9Var.L) && this.R.equals(t9Var.R)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.kj2
    public final int f() {
        return this.Y;
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
        int b = ej6.b(ej6.b((this.B.hashCode() + (i * 31)) * 31, 31, this.L), 31, this.R);
        if (this.X) {
            i2 = 1231;
        } else {
            i2 = 1237;
        }
        return ((((b + i2) * 31) + this.Y) * 31) + this.Z;
    }

    public final String toString() {
        q75.a.getClass();
        return v75.a(this);
    }
}
