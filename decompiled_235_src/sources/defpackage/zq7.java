package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zq7  reason: default package */
/* loaded from: classes.dex */
public final class zq7 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public zq7(String str, String str2, String str3, String str4) {
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof zq7) {
                zq7 zq7Var = (zq7) obj;
                if (!this.a.equals(zq7Var.a) || !nb3.k(this.b, zq7Var.b) || !nb3.k(this.c, zq7Var.c) || !nb3.k(this.d, zq7Var.d)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.d.hashCode() + xg6.d(xg6.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder u = i61.u("VulkanDriverInfo(id=", this.a, ", displayName=", this.b, ", driverDir=");
        u.append(this.c);
        u.append(", driverName=");
        u.append(this.d);
        u.append(")");
        return u.toString();
    }
}
