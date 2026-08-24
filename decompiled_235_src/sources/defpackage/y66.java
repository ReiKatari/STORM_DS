package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: y66  reason: default package */
/* loaded from: classes.dex */
public final class y66 {
    public final String a;
    public final String b;
    public final pf5 c;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* renamed from: y66$a */
    /* loaded from: classes.dex */
    public static final class a {
    }

    public y66(String str, String str2, pf5 pf5Var) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = pf5Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof y66) {
                y66 y66Var = (y66) obj;
                if (!nb3.k(this.a, y66Var.a) || !nb3.k(this.b, y66Var.b) || !this.c.equals(y66Var.c)) {
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
        StringBuilder u = i61.u("ScreenFoldDto(orientation=", this.a, ", type=", this.b, ", foldBounds=");
        u.append(this.c);
        u.append(")");
        return u.toString();
    }
}
