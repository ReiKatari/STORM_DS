package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qe4  reason: default package */
/* loaded from: classes.dex */
public final class qe4 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final int f;
    public final int g;

    public qe4(String str, String str2, String str3, String str4, int i, int i2, int i3) {
        str3.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
        this.f = i2;
        this.g = i3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof qe4) {
                qe4 qe4Var = (qe4) obj;
                if (!this.a.equals(qe4Var.a) || !this.b.equals(qe4Var.b) || !nb3.k(this.c, qe4Var.c) || !this.d.equals(qe4Var.d) || this.e != qe4Var.e || this.f != qe4Var.f || this.g != qe4Var.g) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.g) + lb1.a(this.f, lb1.a(this.e, xg6.d(xg6.d(xg6.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31);
    }

    public final String toString() {
        StringBuilder u = i61.u("NetplayRoom(id=", this.a, ", hostName=", this.b, ", gameTitle=");
        i61.B(u, this.c, ", serverType=", this.d, ", currentPlayers=");
        lb1.x(u, this.e, ", maxPlayers=", this.f, ", pingMs=");
        return lb1.o(u, this.g, ")");
    }
}
