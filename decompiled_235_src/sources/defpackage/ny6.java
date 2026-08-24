package defpackage;

import java.util.Locale;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ny6  reason: default package */
/* loaded from: classes.dex */
public final class ny6 {
    public final String a;
    public final String b;
    public final boolean c;
    public final int d;
    public final String e;
    public final int f;
    public final int g;

    public ny6(String str, String str2, boolean z, int i, String str3, int i2) {
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
        if (qs6.j0(upperCase, "INT", false)) {
            i3 = 3;
        } else if (!qs6.j0(upperCase, "CHAR", false) && !qs6.j0(upperCase, "CLOB", false) && !qs6.j0(upperCase, "TEXT", false)) {
            if (qs6.j0(upperCase, "BLOB", false)) {
                i3 = 5;
            } else if (!qs6.j0(upperCase, "REAL", false) && !qs6.j0(upperCase, "FLOA", false) && !qs6.j0(upperCase, "DOUB", false)) {
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
            if (obj instanceof ny6) {
                if (this.d > 0) {
                    z = true;
                } else {
                    z = false;
                }
                ny6 ny6Var = (ny6) obj;
                int i = ny6Var.f;
                if (ny6Var.d > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z == z2 && nb3.k(this.a, ny6Var.a) && this.c == ny6Var.c) {
                    String str = ny6Var.e;
                    int i2 = this.f;
                    String str2 = this.e;
                    if ((i2 != 1 || i != 2 || str2 == null || ln2.o(str2, str)) && ((i2 != 2 || i != 1 || str == null || ln2.o(str, str2)) && ((i2 == 0 || i2 != i || (str2 == null ? str == null : ln2.o(str2, str))) && this.g == ny6Var.g))) {
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
        return rs6.Q(rs6.S(sb.toString()));
    }
}
