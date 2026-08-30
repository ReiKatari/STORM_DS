package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xc7  reason: default package */
/* loaded from: classes.dex */
public final class xc7 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public xc7(String str, String str2, String str3, String str4) {
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
            if (obj instanceof xc7) {
                xc7 xc7Var = (xc7) obj;
                if (!this.a.equals(xc7Var.a) || !b53.x(this.b, xc7Var.b) || !b53.x(this.c, xc7Var.c) || !b53.x(this.d, xc7Var.d)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.d.hashCode() + ej6.b(ej6.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder v = b31.v("VulkanDriverInfo(id=", this.a, ", displayName=", this.b, ", driverDir=");
        v.append(this.c);
        v.append(", driverName=");
        v.append(this.d);
        v.append(")");
        return v.toString();
    }
}
