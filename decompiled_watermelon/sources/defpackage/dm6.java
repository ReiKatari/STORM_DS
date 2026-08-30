package defpackage;

import java.util.Locale;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: dm6  reason: default package */
/* loaded from: classes.dex */
public final class dm6 {
    public final String a;
    public final String b;
    public final boolean c;
    public final int d;
    public final String e;
    public final int f;
    public final int g;

    public dm6(String str, String str2, boolean z, int i, String str3, int i2) {
        int i3;
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = i;
        this.e = str3;
        this.f = i2;
        String upperCase = str2.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        if (zg6.q0(upperCase, "INT", false)) {
            i3 = 3;
        } else if (!zg6.q0(upperCase, "CHAR", false) && !zg6.q0(upperCase, "CLOB", false) && !zg6.q0(upperCase, "TEXT", false)) {
            if (zg6.q0(upperCase, "BLOB", false)) {
                i3 = 5;
            } else if (!zg6.q0(upperCase, "REAL", false) && !zg6.q0(upperCase, "FLOA", false) && !zg6.q0(upperCase, "DOUB", false)) {
                i3 = 1;
            } else {
                i3 = 4;
            }
        } else {
            i3 = 2;
        }
        this.g = i3;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this != obj) {
            if (obj instanceof dm6) {
                if (this.d > 0) {
                    z = true;
                } else {
                    z = false;
                }
                dm6 dm6Var = (dm6) obj;
                int i = dm6Var.f;
                if (dm6Var.d > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z == z2 && b53.x(this.a, dm6Var.a) && this.c == dm6Var.c) {
                    String str = dm6Var.e;
                    int i2 = this.f;
                    String str2 = this.e;
                    if ((i2 != 1 || i != 2 || str2 == null || sn2.u(str2, str)) && ((i2 != 2 || i != 1 || str == null || sn2.u(str, str2)) && ((i2 == 0 || i2 != i || (str2 == null ? str == null : sn2.u(str2, str))) && this.g == dm6Var.g))) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int hashCode = ((this.a.hashCode() * 31) + this.g) * 31;
        if (this.c) {
            i = 1231;
        } else {
            i = 1237;
        }
        return ((hashCode + i) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |Column {\n            |   name = '");
        sb.append(this.a);
        sb.append("',\n            |   type = '");
        sb.append(this.b);
        sb.append("',\n            |   affinity = '");
        sb.append(this.g);
        sb.append("',\n            |   notNull = '");
        sb.append(this.c);
        sb.append("',\n            |   primaryKeyPosition = '");
        sb.append(this.d);
        sb.append("',\n            |   defaultValue = '");
        String str = this.e;
        if (str == null) {
            str = "undefined";
        }
        sb.append(str);
        sb.append("'\n            |}\n        ");
        return ah6.X(ah6.Z(sb.toString()));
    }
}
