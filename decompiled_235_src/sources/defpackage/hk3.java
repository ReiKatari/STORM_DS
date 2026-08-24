package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hk3  reason: default package */
/* loaded from: classes.dex */
public final class hk3 {
    public static final int i = 8;
    @gc6("id")
    private final String a;
    @gc6("name")
    private final String b;
    @gc6("type")
    private final String c;
    @gc6("orientation")
    private final String d;
    @gc6("useCustomOpacity")
    private final boolean e;
    @gc6("opacity")
    private final int f;
    @gc6("portraitLayout")
    private final hf7 g;
    @gc6("landscapeLayout")
    private final hf7 h;

    public hk3(String str, String str2, String str3, String str4, boolean z, int i2, hf7 hf7Var, hf7 hf7Var2) {
        str3.getClass();
        str4.getClass();
        hf7Var.getClass();
        hf7Var2.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = i2;
        this.g = hf7Var;
        this.h = hf7Var2;
    }

    public static /* synthetic */ hk3 j(hk3 hk3Var, String str, String str2, String str3, String str4, boolean z, int i2, hf7 hf7Var, hf7 hf7Var2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = hk3Var.a;
        }
        if ((i3 & 2) != 0) {
            str2 = hk3Var.b;
        }
        if ((i3 & 4) != 0) {
            str3 = hk3Var.c;
        }
        if ((i3 & 8) != 0) {
            str4 = hk3Var.d;
        }
        if ((i3 & 16) != 0) {
            z = hk3Var.e;
        }
        if ((i3 & 32) != 0) {
            i2 = hk3Var.f;
        }
        if ((i3 & 64) != 0) {
            hf7Var = hk3Var.g;
        }
        if ((i3 & 128) != 0) {
            hf7Var2 = hk3Var.h;
        }
        hf7 hf7Var3 = hf7Var;
        hf7 hf7Var4 = hf7Var2;
        boolean z2 = z;
        int i4 = i2;
        return hk3Var.i(str, str2, str3, str4, z2, i4, hf7Var3, hf7Var4);
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
        if (!(obj instanceof hk3)) {
            return false;
        }
        hk3 hk3Var = (hk3) obj;
        if (nb3.k(this.a, hk3Var.a) && nb3.k(this.b, hk3Var.b) && nb3.k(this.c, hk3Var.c) && nb3.k(this.d, hk3Var.d) && this.e == hk3Var.e && this.f == hk3Var.f && nb3.k(this.g, hk3Var.g) && nb3.k(this.h, hk3Var.h)) {
            return true;
        }
        return false;
    }

    public final int f() {
        return this.f;
    }

    public final hf7 g() {
        return this.g;
    }

    public final hf7 h() {
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

    public final hk3 i(String str, String str2, String str3, String str4, boolean z, int i2, hf7 hf7Var, hf7 hf7Var2) {
        str3.getClass();
        str4.getClass();
        hf7Var.getClass();
        hf7Var2.getClass();
        return new hk3(str, str2, str3, str4, z, i2, hf7Var, hf7Var2);
    }

    public final String k() {
        return this.a;
    }

    public final hf7 l() {
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

    public final hf7 p() {
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
        hf7 hf7Var = this.g;
        hf7 hf7Var2 = this.h;
        StringBuilder u = i61.u("LayoutConfigurationDto31(id=", str, ", name=", str2, ", type=");
        i61.B(u, str3, ", orientation=", str4, ", useCustomOpacity=");
        u.append(z);
        u.append(", opacity=");
        u.append(i2);
        u.append(", portraitLayout=");
        u.append(hf7Var);
        u.append(", landscapeLayout=");
        u.append(hf7Var2);
        u.append(")");
        return u.toString();
    }
}
