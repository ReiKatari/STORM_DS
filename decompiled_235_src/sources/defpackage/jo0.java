package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jo0  reason: default package */
/* loaded from: classes.dex */
public final class jo0 {
    public final String a;
    public final String b;
    public final String c;

    public jo0(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof jo0) {
                jo0 jo0Var = (jo0) obj;
                if (!nb3.k(this.a, jo0Var.a) || !nb3.k(this.b, jo0Var.b) || !this.c.equals(jo0Var.c)) {
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
        return i61.n(i61.u("CheatSubmissionForm(name=", this.a, ", description=", this.b, ", code="), this.c, ")");
    }
}
