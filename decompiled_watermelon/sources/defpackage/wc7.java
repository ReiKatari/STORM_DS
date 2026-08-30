package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: wc7  reason: default package */
/* loaded from: classes.dex */
public final class wc7 {
    public final yc7 a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public wc7(yc7 yc7Var, String str, String str2, String str3, String str4, String str5) {
        yc7Var.getClass();
        this.a = yc7Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof wc7) {
                wc7 wc7Var = (wc7) obj;
                if (this.a != wc7Var.a || !this.b.equals(wc7Var.b) || !this.c.equals(wc7Var.c) || !b53.x(this.d, wc7Var.d) || !b53.x(this.e, wc7Var.e) || !b53.x(this.f, wc7Var.f)) {
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
        int b = ej6.b(ej6.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        int i = 0;
        String str = this.d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (b + hashCode) * 31;
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
        b31.B(sb, this.c, ", customDriverDir=", this.d, ", customDriverName=");
        sb.append(this.e);
        sb.append(", customDriverDisplayName=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}
