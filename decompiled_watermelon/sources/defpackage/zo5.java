package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: zo5  reason: default package */
/* loaded from: classes.dex */
public final class zo5 {
    public final String a;
    public final String b;
    public final boolean c;
    public final String d;

    public zo5(String str, String str2, String str3, boolean z) {
        str3.getClass();
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof zo5) {
                zo5 zo5Var = (zo5) obj;
                if (!this.a.equals(zo5Var.a) || !this.b.equals(zo5Var.b) || this.c != zo5Var.c || !b53.x(this.d, zo5Var.d)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.d.hashCode() + ej6.c(ej6.b(this.a.hashCode() * 31, 31, this.b), this.c, 31);
    }

    public final String toString() {
        StringBuilder v = b31.v("RomMetadata(romTitle=", this.a, ", developerName=", this.b, ", isDSiWareTitle=");
        v.append(this.c);
        v.append(", retroAchievementsHash=");
        v.append(this.d);
        v.append(")");
        return v.toString();
    }
}
