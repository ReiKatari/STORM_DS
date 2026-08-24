package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mn6  reason: default package */
/* loaded from: classes.dex */
public final class mn6 extends ja2 {
    public final b33 a;
    public final String b;
    public final zb1 c;

    public mn6(b33 b33Var, String str, zb1 zb1Var) {
        this.a = b33Var;
        this.b = str;
        this.c = zb1Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof mn6) {
                mn6 mn6Var = (mn6) obj;
                if (this.a.equals(mn6Var.a) && nb3.k(this.b, mn6Var.b) && this.c == mn6Var.c) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return this.c.hashCode() + ((hashCode + i) * 31);
    }
}
