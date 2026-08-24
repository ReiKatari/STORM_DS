package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: i05  reason: default package */
/* loaded from: classes.dex */
public final class i05 {
    public static final int c = 0;
    @gc6("a")
    private final nf5 a;
    @gc6("b")
    private final String b;

    public i05(nf5 nf5Var, String str) {
        nf5Var.getClass();
        str.getClass();
        this.a = nf5Var;
        this.b = str;
    }

    public static /* synthetic */ i05 d(i05 i05Var, nf5 nf5Var, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            nf5Var = i05Var.a;
        }
        if ((i & 2) != 0) {
            str = i05Var.b;
        }
        return i05Var.c(nf5Var, str);
    }

    public final nf5 a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final i05 c(nf5 nf5Var, String str) {
        nf5Var.getClass();
        str.getClass();
        return new i05(nf5Var, str);
    }

    public final String e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i05)) {
            return false;
        }
        i05 i05Var = (i05) obj;
        if (nb3.k(this.a, i05Var.a) && nb3.k(this.b, i05Var.b)) {
            return true;
        }
        return false;
    }

    public final nf5 f() {
        return this.a;
    }

    public int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public String toString() {
        nf5 nf5Var = this.a;
        String str = this.b;
        return "PositionedLayoutComponent25(rect=" + nf5Var + ", component=" + str + ")";
    }
}
