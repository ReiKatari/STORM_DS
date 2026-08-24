package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ek3  reason: default package */
/* loaded from: classes.dex */
public final class ek3 {
    public static final int i = 8;
    @gc6("a")
    private final String a;
    @gc6("b")
    private final String b;
    @gc6("c")
    private final String c;
    @gc6("d")
    private final String d;
    @gc6("e")
    private final boolean e;
    @gc6("f")
    private final int f;
    @gc6("g")
    private final ef7 g;
    @gc6("h")
    private final ef7 h;

    public ek3(String str, String str2, String str3, String str4, boolean z, int i2, ef7 ef7Var, ef7 ef7Var2) {
        str3.getClass();
        str4.getClass();
        ef7Var.getClass();
        ef7Var2.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = i2;
        this.g = ef7Var;
        this.h = ef7Var2;
    }

    public static /* synthetic */ ek3 j(ek3 ek3Var, String str, String str2, String str3, String str4, boolean z, int i2, ef7 ef7Var, ef7 ef7Var2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = ek3Var.a;
        }
        if ((i3 & 2) != 0) {
            str2 = ek3Var.b;
        }
        if ((i3 & 4) != 0) {
            str3 = ek3Var.c;
        }
        if ((i3 & 8) != 0) {
            str4 = ek3Var.d;
        }
        if ((i3 & 16) != 0) {
            z = ek3Var.e;
        }
        if ((i3 & 32) != 0) {
            i2 = ek3Var.f;
        }
        if ((i3 & 64) != 0) {
            ef7Var = ek3Var.g;
        }
        if ((i3 & 128) != 0) {
            ef7Var2 = ek3Var.h;
        }
        ef7 ef7Var3 = ef7Var;
        ef7 ef7Var4 = ef7Var2;
        boolean z2 = z;
        int i4 = i2;
        return ek3Var.i(str, str2, str3, str4, z2, i4, ef7Var3, ef7Var4);
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final String d() {
        return this.d;
    }

    public final boolean e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ek3)) {
            return false;
        }
        ek3 ek3Var = (ek3) obj;
        if (nb3.k(this.a, ek3Var.a) && nb3.k(this.b, ek3Var.b) && nb3.k(this.c, ek3Var.c) && nb3.k(this.d, ek3Var.d) && this.e == ek3Var.e && this.f == ek3Var.f && nb3.k(this.g, ek3Var.g) && nb3.k(this.h, ek3Var.h)) {
            return true;
        }
        return false;
    }

    public final int f() {
        return this.f;
    }

    public final ef7 g() {
        return this.g;
    }

    public final ef7 h() {
        return this.h;
    }

    public int hashCode() {
        int hashCode;
        String str = this.a;
        int i2 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i3 = hashCode * 31;
        String str2 = this.b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return this.h.hashCode() + ((this.g.hashCode() + lb1.a(this.f, xg6.e(xg6.d(xg6.d((i3 + i2) * 31, 31, this.c), 31, this.d), this.e, 31), 31)) * 31);
    }

    public final ek3 i(String str, String str2, String str3, String str4, boolean z, int i2, ef7 ef7Var, ef7 ef7Var2) {
        str3.getClass();
        str4.getClass();
        ef7Var.getClass();
        ef7Var2.getClass();
        return new ek3(str, str2, str3, str4, z, i2, ef7Var, ef7Var2);
    }

    public final String k() {
        return this.a;
    }

    public final ef7 l() {
        return this.h;
    }

    public final String m() {
        return this.b;
    }

    public final int n() {
        return this.f;
    }

    public final String o() {
        return this.d;
    }

    public final ef7 p() {
        return this.g;
    }

    public final String q() {
        return this.c;
    }

    public final boolean r() {
        return this.e;
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        String str4 = this.d;
        boolean z = this.e;
        int i2 = this.f;
        ef7 ef7Var = this.g;
        ef7 ef7Var2 = this.h;
        StringBuilder u = i61.u("LayoutConfiguration25(id=", str, ", name=", str2, ", type=");
        i61.B(u, str3, ", orientation=", str4, ", useCustomOpacity=");
        u.append(z);
        u.append(", opacity=");
        u.append(i2);
        u.append(", portraitLayout=");
        u.append(ef7Var);
        u.append(", landscapeLayout=");
        u.append(ef7Var2);
        u.append(")");
        return u.toString();
    }
}
