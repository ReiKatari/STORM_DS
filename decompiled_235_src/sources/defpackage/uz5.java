package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uz5  reason: default package */
/* loaded from: classes.dex */
public final class uz5 {
    public final String a;
    public final String b;
    public final boolean c;
    public final String d;

    public uz5(String str, String str2, String str3, boolean z) {
        str3.getClass();
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof uz5) {
                uz5 uz5Var = (uz5) obj;
                if (!this.a.equals(uz5Var.a) || !this.b.equals(uz5Var.b) || this.c != uz5Var.c || !nb3.k(this.d, uz5Var.d)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.d.hashCode() + xg6.e(xg6.d(this.a.hashCode() * 31, 31, this.b), this.c, 31);
    }

    public final String toString() {
        StringBuilder u = i61.u("RomMetadata(romTitle=", this.a, ", developerName=", this.b, ", isDSiWareTitle=");
        u.append(this.c);
        u.append(", retroAchievementsHash=");
        u.append(this.d);
        u.append(")");
        return u.toString();
    }
}
