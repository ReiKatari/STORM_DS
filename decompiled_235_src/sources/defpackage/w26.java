package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: w26  reason: default package */
/* loaded from: classes.dex */
public final class w26 {
    public final um6 a;
    public final int b;
    public final boolean c;
    public final ck3 d;
    public final ff7 e;

    public w26(um6 um6Var, int i, boolean z, ck3 ck3Var, ff7 ff7Var) {
        um6Var.getClass();
        ck3Var.getClass();
        this.a = um6Var;
        this.b = i;
        this.c = z;
        this.d = ck3Var;
        this.e = ff7Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof w26) {
                w26 w26Var = (w26) obj;
                if (this.a != w26Var.a || this.b != w26Var.b || this.c != w26Var.c || this.d != w26Var.d || !this.e.equals(w26Var.e)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int e = xg6.e(lb1.a(this.b, this.a.hashCode() * 31, 31), this.c, 31);
        return this.e.hashCode() + ((this.d.hashCode() + e) * 31);
    }

    public final String toString() {
        return "RuntimeInputLayoutConfiguration(softInputBehaviour=" + this.a + ", softInputOpacity=" + this.b + ", isHapticFeedbackEnabled=" + this.c + ", layoutOrientation=" + this.d + ", layout=" + this.e + ")";
    }
}
