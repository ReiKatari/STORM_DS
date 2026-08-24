package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ot5  reason: default package */
/* loaded from: classes.dex */
public final class ot5 {
    public static final int e = 0;
    @gc6("runtimeConsoleType")
    private final u26 a;
    @gc6("runtimeMicSource")
    private final a36 b;
    @gc6("layoutId")
    private final String c;
    @gc6("gbaSlotConfig")
    private final xw5 d;

    public ot5(u26 u26Var, a36 a36Var, String str, xw5 xw5Var) {
        u26Var.getClass();
        a36Var.getClass();
        xw5Var.getClass();
        this.a = u26Var;
        this.b = a36Var;
        this.c = str;
        this.d = xw5Var;
    }

    public static /* synthetic */ ot5 f(ot5 ot5Var, u26 u26Var, a36 a36Var, String str, xw5 xw5Var, int i, Object obj) {
        if ((i & 1) != 0) {
            u26Var = ot5Var.a;
        }
        if ((i & 2) != 0) {
            a36Var = ot5Var.b;
        }
        if ((i & 4) != 0) {
            str = ot5Var.c;
        }
        if ((i & 8) != 0) {
            xw5Var = ot5Var.d;
        }
        return ot5Var.e(u26Var, a36Var, str, xw5Var);
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

    public final xw5 d() {
        return this.d;
    }

    public final ot5 e(u26 u26Var, a36 a36Var, String str, xw5 xw5Var) {
        u26Var.getClass();
        a36Var.getClass();
        xw5Var.getClass();
        return new ot5(u26Var, a36Var, str, xw5Var);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ot5)) {
            return false;
        }
        ot5 ot5Var = (ot5) obj;
        if (this.a == ot5Var.a && this.b == ot5Var.b && nb3.k(this.c, ot5Var.c) && nb3.k(this.d, ot5Var.d)) {
            return true;
        }
        return false;
    }

    public final xw5 g() {
        return this.d;
    }

    public final String h() {
        return this.c;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return this.d.hashCode() + ((hashCode2 + hashCode) * 31);
    }

    public final u26 i() {
        return this.a;
    }

    public final a36 j() {
        return this.b;
    }

    public String toString() {
        u26 u26Var = this.a;
        a36 a36Var = this.b;
        String str = this.c;
        xw5 xw5Var = this.d;
        return "RomConfigDto31(runtimeConsoleType=" + u26Var + ", runtimeMicSource=" + a36Var + ", layoutId=" + str + ", gbaSlotConfig=" + xw5Var + ")";
    }
}
