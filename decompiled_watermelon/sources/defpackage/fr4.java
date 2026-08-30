package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: fr4  reason: default package */
/* loaded from: classes.dex */
public final class fr4 {
    public static final int c = 0;
    @r06("a")
    private final x55 a;
    @r06("b")
    private final String b;

    public fr4(x55 x55Var, String str) {
        x55Var.getClass();
        str.getClass();
        this.a = x55Var;
        this.b = str;
    }

    public static /* synthetic */ fr4 d(fr4 fr4Var, x55 x55Var, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            x55Var = fr4Var.a;
        }
        if ((i & 2) != 0) {
            str = fr4Var.b;
        }
        return fr4Var.c(x55Var, str);
    }

    public final x55 a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final fr4 c(x55 x55Var, String str) {
        x55Var.getClass();
        str.getClass();
        return new fr4(x55Var, str);
    }

    public final String e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fr4)) {
            return false;
        }
        fr4 fr4Var = (fr4) obj;
        if (b53.x(this.a, fr4Var.a) && b53.x(this.b, fr4Var.b)) {
            return true;
        }
        return false;
    }

    public final x55 f() {
        return this.a;
    }

    public int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public String toString() {
        x55 x55Var = this.a;
        String str = this.b;
        return "PositionedLayoutComponent25(rect=" + x55Var + ", component=" + str + ")";
    }
}
