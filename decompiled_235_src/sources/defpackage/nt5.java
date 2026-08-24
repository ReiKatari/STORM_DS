package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nt5  reason: default package */
/* loaded from: classes.dex */
public final class nt5 {
    public static final int g = 0;
    @gc6("runtimeConsoleType")
    private final u26 a;
    @gc6("runtimeMicSource")
    private final a36 b;
    @gc6("layoutId")
    private final String c;
    @gc6("loadGbaCart")
    private final boolean d;
    @gc6("gbaCartPath")
    private final String e;
    @gc6("gbaSavePath")
    private final String f;

    public nt5(u26 u26Var, a36 a36Var, String str, boolean z, String str2, String str3) {
        u26Var.getClass();
        a36Var.getClass();
        this.a = u26Var;
        this.b = a36Var;
        this.c = str;
        this.d = z;
        this.e = str2;
        this.f = str3;
    }

    public static /* synthetic */ nt5 h(nt5 nt5Var, u26 u26Var, a36 a36Var, String str, boolean z, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            u26Var = nt5Var.a;
        }
        if ((i & 2) != 0) {
            a36Var = nt5Var.b;
        }
        if ((i & 4) != 0) {
            str = nt5Var.c;
        }
        if ((i & 8) != 0) {
            z = nt5Var.d;
        }
        if ((i & 16) != 0) {
            str2 = nt5Var.e;
        }
        if ((i & 32) != 0) {
            str3 = nt5Var.f;
        }
        String str4 = str2;
        String str5 = str3;
        return nt5Var.g(u26Var, a36Var, str, z, str4, str5);
    }

    public final u26 a() {
        return this.a;
    }

    public final a36 b() {
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
        if (!(obj instanceof nt5)) {
            return false;
        }
        nt5 nt5Var = (nt5) obj;
        if (this.a == nt5Var.a && this.b == nt5Var.b && nb3.k(this.c, nt5Var.c) && this.d == nt5Var.d && nb3.k(this.e, nt5Var.e) && nb3.k(this.f, nt5Var.f)) {
            return true;
        }
        return false;
    }

    public final String f() {
        return this.f;
    }

    public final nt5 g(u26 u26Var, a36 a36Var, String str, boolean z, String str2, String str3) {
        u26Var.getClass();
        a36Var.getClass();
        return new nt5(u26Var, a36Var, str, z, str2, str3);
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
        int e = xg6.e((hashCode3 + hashCode) * 31, this.d, 31);
        String str2 = this.e;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i2 = (e + hashCode2) * 31;
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

    public final u26 m() {
        return this.a;
    }

    public final a36 n() {
        return this.b;
    }

    public String toString() {
        u26 u26Var = this.a;
        a36 a36Var = this.b;
        String str = this.c;
        boolean z = this.d;
        String str2 = this.e;
        String str3 = this.f;
        return "RomConfigDto25(runtimeConsoleType=" + u26Var + ", runtimeMicSource=" + a36Var + ", layoutId=" + str + ", loadGbaCart=" + z + ", gbaCartPath=" + str2 + ", gbaSavePath=" + str3 + ")";
    }
}
