package defpackage;

import java.util.Locale;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lx5  reason: default package */
/* loaded from: classes.dex */
public final class lx5 {
    public final String a;
    public final int b;
    public final String c;
    public final String d;
    public final boolean e;

    public lx5(String str, int i, String str2, String str3, boolean z) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = str3;
        this.e = z;
    }

    public final String a() {
        boolean z = this.e;
        String str = this.a;
        if (z) {
            return lb1.m(str, "_", b());
        }
        return str;
    }

    public final String b() {
        g04.y(16);
        String upperCase = qs6.B0(8, jx2.R(16, this.b & 4294967295L)).toUpperCase(Locale.ROOT);
        upperCase.getClass();
        return upperCase;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lx5)) {
            return false;
        }
        lx5 lx5Var = (lx5) obj;
        if (nb3.k(this.a, lx5Var.a) && this.b == lx5Var.b && nb3.k(this.c, lx5Var.c) && nb3.k(this.d, lx5Var.d) && this.e == lx5Var.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + xg6.d(xg6.d(lb1.a(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder u = i61.u("RomInfo(gameCode=", this.a, ", headerChecksum=", String.valueOf(this.b & 4294967295L), ", gameTitle=");
        i61.B(u, this.c, ", gameName=", this.d, ", isDsiWareTitle=");
        return i61.o(u, this.e, ")");
    }
}
