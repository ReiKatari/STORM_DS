package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sd5  reason: default package */
/* loaded from: classes.dex */
public final class sd5 {
    public final String a;
    public final String b;
    public final String c;

    public sd5(String str, String str2, String str3) {
        str3.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof sd5) {
                sd5 sd5Var = (sd5) obj;
                if (!this.a.equals(sd5Var.a) || !this.b.equals(sd5Var.b) || !nb3.k(this.c, sd5Var.c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.c.hashCode() + xg6.d(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return i61.n(i61.u("RawCheat(name=", this.a, ", description=", this.b, ", code="), this.c, ")");
    }
}
