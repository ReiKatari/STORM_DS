package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: md3  reason: default package */
/* loaded from: classes.dex */
public final class md3 {
    public static final int i = 8;
    @r06("a")
    private final String a;
    @r06("b")
    private final String b;
    @r06("c")
    private final String c;
    @r06("d")
    private final String d;
    @r06("e")
    private final boolean e;
    @r06("f")
    private final int f;
    @r06("g")
    private final j17 g;
    @r06("h")
    private final j17 h;

    public md3(String str, String str2, String str3, String str4, boolean z, int i2, j17 j17Var, j17 j17Var2) {
        str3.getClass();
        str4.getClass();
        j17Var.getClass();
        j17Var2.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = i2;
        this.g = j17Var;
        this.h = j17Var2;
    }

    public static /* synthetic */ md3 j(md3 md3Var, String str, String str2, String str3, String str4, boolean z, int i2, j17 j17Var, j17 j17Var2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = md3Var.a;
        }
        if ((i3 & 2) != 0) {
            str2 = md3Var.b;
        }
        if ((i3 & 4) != 0) {
            str3 = md3Var.c;
        }
        if ((i3 & 8) != 0) {
            str4 = md3Var.d;
        }
        if ((i3 & 16) != 0) {
            z = md3Var.e;
        }
        if ((i3 & 32) != 0) {
            i2 = md3Var.f;
        }
        if ((i3 & 64) != 0) {
            j17Var = md3Var.g;
        }
        if ((i3 & 128) != 0) {
            j17Var2 = md3Var.h;
        }
        j17 j17Var3 = j17Var;
        j17 j17Var4 = j17Var2;
        boolean z2 = z;
        int i4 = i2;
        return md3Var.i(str, str2, str3, str4, z2, i4, j17Var3, j17Var4);
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
        if (!(obj instanceof md3)) {
            return false;
        }
        md3 md3Var = (md3) obj;
        if (b53.x(this.a, md3Var.a) && b53.x(this.b, md3Var.b) && b53.x(this.c, md3Var.c) && b53.x(this.d, md3Var.d) && this.e == md3Var.e && this.f == md3Var.f && b53.x(this.g, md3Var.g) && b53.x(this.h, md3Var.h)) {
            return true;
        }
        return false;
    }

    public final int f() {
        return this.f;
    }

    public final j17 g() {
        return this.g;
    }

    public final j17 h() {
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
        return this.h.hashCode() + ((this.g.hashCode() + wh1.a(this.f, ej6.c(ej6.b(ej6.b((i3 + i2) * 31, 31, this.c), 31, this.d), this.e, 31), 31)) * 31);
    }

    public final md3 i(String str, String str2, String str3, String str4, boolean z, int i2, j17 j17Var, j17 j17Var2) {
        str3.getClass();
        str4.getClass();
        j17Var.getClass();
        j17Var2.getClass();
        return new md3(str, str2, str3, str4, z, i2, j17Var, j17Var2);
    }

    public final String k() {
        return this.a;
    }

    public final j17 l() {
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

    public final j17 p() {
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
        j17 j17Var = this.g;
        j17 j17Var2 = this.h;
        StringBuilder v = b31.v("LayoutConfiguration25(id=", str, ", name=", str2, ", type=");
        b31.B(v, str3, ", orientation=", str4, ", useCustomOpacity=");
        v.append(z);
        v.append(", opacity=");
        v.append(i2);
        v.append(", portraitLayout=");
        v.append(j17Var);
        v.append(", landscapeLayout=");
        v.append(j17Var2);
        v.append(")");
        return v.toString();
    }
}
