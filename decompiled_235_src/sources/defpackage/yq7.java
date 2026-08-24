package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yq7  reason: default package */
/* loaded from: classes.dex */
public final class yq7 {
    public final sr7 a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public yq7(sr7 sr7Var, String str, String str2, String str3, String str4, String str5) {
        sr7Var.getClass();
        this.a = sr7Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof yq7) {
                yq7 yq7Var = (yq7) obj;
                if (this.a != yq7Var.a || !this.b.equals(yq7Var.b) || !this.c.equals(yq7Var.c) || !nb3.k(this.d, yq7Var.d) || !nb3.k(this.e, yq7Var.e) || !nb3.k(this.f, yq7Var.f)) {
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
        int d = xg6.d(xg6.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        int i = 0;
        String str = this.d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (d + hashCode) * 31;
        String str2 = this.e;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.f;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return i3 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VulkanDriverConfiguration(mode=");
        sb.append(this.a);
        sb.append(", tmpLibDir=");
        sb.append(this.b);
        sb.append(", hookLibDir=");
        i61.B(sb, this.c, ", customDriverDir=", this.d, ", customDriverName=");
        sb.append(this.e);
        sb.append(", customDriverDisplayName=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}
