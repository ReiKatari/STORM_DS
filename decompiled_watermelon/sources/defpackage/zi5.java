package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: zi5  reason: default package */
/* loaded from: classes.dex */
public final class zi5 {
    public static final int e = 0;
    @r06("runtimeConsoleType")
    private final cs5 a;
    @r06("runtimeMicSource")
    private final is5 b;
    @r06("layoutId")
    private final String c;
    @r06("gbaSlotConfig")
    private final im5 d;

    public zi5(cs5 cs5Var, is5 is5Var, String str, im5 im5Var) {
        cs5Var.getClass();
        is5Var.getClass();
        im5Var.getClass();
        this.a = cs5Var;
        this.b = is5Var;
        this.c = str;
        this.d = im5Var;
    }

    public static /* synthetic */ zi5 f(zi5 zi5Var, cs5 cs5Var, is5 is5Var, String str, im5 im5Var, int i, Object obj) {
        if ((i & 1) != 0) {
            cs5Var = zi5Var.a;
        }
        if ((i & 2) != 0) {
            is5Var = zi5Var.b;
        }
        if ((i & 4) != 0) {
            str = zi5Var.c;
        }
        if ((i & 8) != 0) {
            im5Var = zi5Var.d;
        }
        return zi5Var.e(cs5Var, is5Var, str, im5Var);
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

    public final im5 d() {
        return this.d;
    }

    public final zi5 e(cs5 cs5Var, is5 is5Var, String str, im5 im5Var) {
        cs5Var.getClass();
        is5Var.getClass();
        im5Var.getClass();
        return new zi5(cs5Var, is5Var, str, im5Var);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zi5)) {
            return false;
        }
        zi5 zi5Var = (zi5) obj;
        if (this.a == zi5Var.a && this.b == zi5Var.b && b53.x(this.c, zi5Var.c) && b53.x(this.d, zi5Var.d)) {
            return true;
        }
        return false;
    }

    public final im5 g() {
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

    public final cs5 i() {
        return this.a;
    }

    public final is5 j() {
        return this.b;
    }

    public String toString() {
        cs5 cs5Var = this.a;
        is5 is5Var = this.b;
        String str = this.c;
        im5 im5Var = this.d;
        return "RomConfigDto31(runtimeConsoleType=" + cs5Var + ", runtimeMicSource=" + is5Var + ", layoutId=" + str + ", gbaSlotConfig=" + im5Var + ")";
    }
}
