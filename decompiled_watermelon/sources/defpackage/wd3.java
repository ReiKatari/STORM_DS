package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: wd3  reason: default package */
/* loaded from: classes.dex */
public final class wd3 {
    public final ud3 a;
    public final ud3 b;

    public wd3(ud3 ud3Var, ud3 ud3Var2) {
        ud3Var.getClass();
        this.a = ud3Var;
        this.b = ud3Var2;
    }

    public static wd3 a(wd3 wd3Var, ud3 ud3Var) {
        ud3 ud3Var2 = wd3Var.a;
        wd3Var.getClass();
        ud3Var2.getClass();
        return new wd3(ud3Var2, ud3Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wd3)) {
            return false;
        }
        wd3 wd3Var = (wd3) obj;
        if (b53.x(this.a, wd3Var.a) && b53.x(this.b, wd3Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        ud3 ud3Var = this.b;
        if (ud3Var == null) {
            hashCode = 0;
        } else {
            hashCode = ud3Var.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "LayoutDisplayPair(mainScreenDisplay=" + this.a + ", secondaryScreenDisplay=" + this.b + ")";
    }
}
