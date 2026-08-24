package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ll5  reason: default package */
/* loaded from: classes.dex */
public final class ll5 {
    public final int a;
    public final oj2 b;
    public final mj2 c;

    public ll5(int i, oj2 oj2Var, mj2 mj2Var) {
        this.a = i;
        this.b = oj2Var;
        this.c = mj2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ll5) {
            ll5 ll5Var = (ll5) obj;
            if (this.a == ll5Var.a && nb3.k(this.b, ll5Var.b) && this.c.equals(ll5Var.c)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.a.hashCode() + lb1.a(0, lb1.a(0, ((this.a * 31) + this.b.A) * 31, 31), 31);
    }

    public final String toString() {
        return "ResourceFont(resId=" + this.a + ", weight=" + this.b + ", style=" + ((Object) "Normal") + ", loadingStrategy=Blocking)";
    }
}
