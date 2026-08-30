package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: pd3  reason: default package */
/* loaded from: classes.dex */
public final class pd3 {
    public static final int i = 8;
    @r06("id")
    private final String a;
    @r06("name")
    private final String b;
    @r06("type")
    private final String c;
    @r06("orientation")
    private final String d;
    @r06("useCustomOpacity")
    private final boolean e;
    @r06("opacity")
    private final int f;
    @r06("portraitLayout")
    private final m17 g;
    @r06("landscapeLayout")
    private final m17 h;

    public pd3(String str, String str2, String str3, String str4, boolean z, int i2, m17 m17Var, m17 m17Var2) {
        str3.getClass();
        str4.getClass();
        m17Var.getClass();
        m17Var2.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = i2;
        this.g = m17Var;
        this.h = m17Var2;
    }

    public static /* synthetic */ pd3 j(pd3 pd3Var, String str, String str2, String str3, String str4, boolean z, int i2, m17 m17Var, m17 m17Var2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = pd3Var.a;
        }
        if ((i3 & 2) != 0) {
            str2 = pd3Var.b;
        }
        if ((i3 & 4) != 0) {
            str3 = pd3Var.c;
        }
        if ((i3 & 8) != 0) {
            str4 = pd3Var.d;
        }
        if ((i3 & 16) != 0) {
            z = pd3Var.e;
        }
        if ((i3 & 32) != 0) {
            i2 = pd3Var.f;
        }
        if ((i3 & 64) != 0) {
            m17Var = pd3Var.g;
        }
        if ((i3 & 128) != 0) {
            m17Var2 = pd3Var.h;
        }
        m17 m17Var3 = m17Var;
        m17 m17Var4 = m17Var2;
        boolean z2 = z;
        int i4 = i2;
        return pd3Var.i(str, str2, str3, str4, z2, i4, m17Var3, m17Var4);
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
        if (!(obj instanceof pd3)) {
            return false;
        }
        pd3 pd3Var = (pd3) obj;
        if (b53.x(this.a, pd3Var.a) && b53.x(this.b, pd3Var.b) && b53.x(this.c, pd3Var.c) && b53.x(this.d, pd3Var.d) && this.e == pd3Var.e && this.f == pd3Var.f && b53.x(this.g, pd3Var.g) && b53.x(this.h, pd3Var.h)) {
            return true;
        }
        return false;
    }

    public final int f() {
        return this.f;
    }

    public final m17 g() {
        return this.g;
    }

    public final m17 h() {
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

    public final pd3 i(String str, String str2, String str3, String str4, boolean z, int i2, m17 m17Var, m17 m17Var2) {
        str3.getClass();
        str4.getClass();
        m17Var.getClass();
        m17Var2.getClass();
        return new pd3(str, str2, str3, str4, z, i2, m17Var, m17Var2);
    }

    public final String k() {
        return this.a;
    }

    public final m17 l() {
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

    public final m17 p() {
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
        m17 m17Var = this.g;
        m17 m17Var2 = this.h;
        StringBuilder v = b31.v("LayoutConfigurationDto31(id=", str, ", name=", str2, ", type=");
        b31.B(v, str3, ", orientation=", str4, ", useCustomOpacity=");
        v.append(z);
        v.append(", opacity=");
        v.append(i2);
        v.append(", portraitLayout=");
        v.append(m17Var);
        v.append(", landscapeLayout=");
        v.append(m17Var2);
        v.append(")");
        return v.toString();
    }
}
