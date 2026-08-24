package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: d11  reason: default package */
/* loaded from: classes.dex */
public final class d11 {
    public final String a;
    public final String b;
    public final String c;
    public final e33 d;

    public d11(String str, String str2, String str3, e33 e33Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = e33Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d11) {
                d11 d11Var = (d11) obj;
                if (!this.a.equals(d11Var.a) || !nb3.k(this.b, d11Var.b) || !nb3.k(this.c, d11Var.c) || !nb3.k(this.d, d11Var.d)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = this.a.hashCode() * 31;
        int i = 0;
        String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode3 + hashCode) * 31;
        String str2 = this.c;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        e33 e33Var = this.d;
        if (e33Var != null) {
            i = e33Var.hashCode();
        }
        return i3 + i;
    }

    public final String toString() {
        StringBuilder u = i61.u("ConsoleSubmenuEntry(title=", this.a, ", value=", this.b, ", description=");
        u.append(this.c);
        u.append(", icon=");
        u.append(this.d);
        u.append(")");
        return u.toString();
    }
}
