package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: yi5  reason: default package */
/* loaded from: classes.dex */
public final class yi5 {
    public static final int g = 0;
    @r06("runtimeConsoleType")
    private final cs5 a;
    @r06("runtimeMicSource")
    private final is5 b;
    @r06("layoutId")
    private final String c;
    @r06("loadGbaCart")
    private final boolean d;
    @r06("gbaCartPath")
    private final String e;
    @r06("gbaSavePath")
    private final String f;

    public yi5(cs5 cs5Var, is5 is5Var, String str, boolean z, String str2, String str3) {
        cs5Var.getClass();
        is5Var.getClass();
        this.a = cs5Var;
        this.b = is5Var;
        this.c = str;
        this.d = z;
        this.e = str2;
        this.f = str3;
    }

    public static /* synthetic */ yi5 h(yi5 yi5Var, cs5 cs5Var, is5 is5Var, String str, boolean z, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            cs5Var = yi5Var.a;
        }
        if ((i & 2) != 0) {
            is5Var = yi5Var.b;
        }
        if ((i & 4) != 0) {
            str = yi5Var.c;
        }
        if ((i & 8) != 0) {
            z = yi5Var.d;
        }
        if ((i & 16) != 0) {
            str2 = yi5Var.e;
        }
        if ((i & 32) != 0) {
            str3 = yi5Var.f;
        }
        String str4 = str2;
        String str5 = str3;
        return yi5Var.g(cs5Var, is5Var, str, z, str4, str5);
    }

    public final cs5 a() {
        return this.a;
    }

    public final is5 b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final boolean d() {
        return this.d;
    }

    public final String e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yi5)) {
            return false;
        }
        yi5 yi5Var = (yi5) obj;
        if (this.a == yi5Var.a && this.b == yi5Var.b && b53.x(this.c, yi5Var.c) && this.d == yi5Var.d && b53.x(this.e, yi5Var.e) && b53.x(this.f, yi5Var.f)) {
            return true;
        }
        return false;
    }

    public final String f() {
        return this.f;
    }

    public final yi5 g(cs5 cs5Var, is5 is5Var, String str, boolean z, String str2, String str3) {
        cs5Var.getClass();
        is5Var.getClass();
        return new yi5(cs5Var, is5Var, str, z, str2, str3);
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int c = ej6.c((hashCode3 + hashCode) * 31, this.d, 31);
        String str2 = this.e;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i2 = (c + hashCode2) * 31;
        String str3 = this.f;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return i2 + i;
    }

    public final String i() {
        return this.e;
    }

    public final String j() {
        return this.f;
    }

    public final String k() {
        return this.c;
    }

    public final boolean l() {
        return this.d;
    }

    public final cs5 m() {
        return this.a;
    }

    public final is5 n() {
        return this.b;
    }

    public String toString() {
        cs5 cs5Var = this.a;
        is5 is5Var = this.b;
        String str = this.c;
        boolean z = this.d;
        String str2 = this.e;
        String str3 = this.f;
        return "RomConfigDto25(runtimeConsoleType=" + cs5Var + ", runtimeMicSource=" + is5Var + ", layoutId=" + str + ", loadGbaCart=" + z + ", gbaCartPath=" + str2 + ", gbaSavePath=" + str3 + ")";
    }
}
