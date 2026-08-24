package defpackage;

import java.util.Set;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hm4  reason: default package */
/* loaded from: classes.dex */
public final class hm4 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Set e;
    public final String f;
    public final String g;
    public final double h;
    public final boolean i;

    public hm4(String str, String str2, String str3, String str4, Set set, String str5, String str6, double d, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = set;
        this.f = str5;
        this.g = str6;
        this.h = d;
        this.i = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof hm4) {
                hm4 hm4Var = (hm4) obj;
                if (!this.a.equals(hm4Var.a) || !this.b.equals(hm4Var.b) || !this.c.equals(hm4Var.c) || !this.d.equals(hm4Var.d) || !this.e.equals(hm4Var.e) || !this.f.equals(hm4Var.f) || !this.g.equals(hm4Var.g) || Double.compare(this.h, hm4Var.h) != 0 || this.i != hm4Var.i) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int d = xg6.d(xg6.d((this.e.hashCode() + xg6.d(xg6.d(xg6.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31, 31, this.f), 31, this.g);
        return Boolean.hashCode(this.i) + ((Double.hashCode(this.h) + d) * 31);
    }

    public final String toString() {
        StringBuilder u = i61.u("OnlineVulkanDriver(id=", this.a, ", name=", this.b, ", version=");
        i61.B(u, this.c, ", releaseDate=", this.d, ", supportedGpuSeries=");
        u.append(this.e);
        u.append(", description=");
        u.append(this.f);
        u.append(", downloadUrl=");
        u.append(this.g);
        u.append(", fileSizeMb=");
        u.append(this.h);
        u.append(", isRecommended=");
        u.append(this.i);
        u.append(")");
        return u.toString();
    }
}
