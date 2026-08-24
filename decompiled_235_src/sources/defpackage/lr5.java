package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lr5  reason: default package */
/* loaded from: classes.dex */
public final class lr5 extends nr5 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;

    public lr5(String str, String str2, String str3, boolean z) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof lr5) {
                lr5 lr5Var = (lr5) obj;
                if (!nb3.k(this.a, lr5Var.a) || !this.b.equals(lr5Var.b) || !this.c.equals(lr5Var.c) || this.d != lr5Var.d) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + xg6.d(xg6.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder u = i61.u("Folder(docId=", this.a, ", name=", this.b, ", relativePath=");
        u.append(this.c);
        u.append(", isRoot=");
        u.append(this.d);
        u.append(")");
        return u.toString();
    }
}
