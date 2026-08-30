package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: tb5  reason: default package */
/* loaded from: classes.dex */
public final class tb5 {
    public final int a;
    public final pe2 b;
    public final oe2 c;

    public tb5(int i, pe2 pe2Var, oe2 oe2Var) {
        this.a = i;
        this.b = pe2Var;
        this.c = oe2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof tb5) {
            tb5 tb5Var = (tb5) obj;
            if (this.a == tb5Var.a && b53.x(this.b, tb5Var.b) && this.c.equals(tb5Var.c)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.a.hashCode() + wh1.a(0, wh1.a(0, ((this.a * 31) + this.b.A) * 31, 31), 31);
    }

    public final String toString() {
        return "ResourceFont(resId=" + this.a + ", weight=" + this.b + ", style=" + ((Object) "Normal") + ", loadingStrategy=Blocking)";
    }
}
