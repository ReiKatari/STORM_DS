package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bb5  reason: default package */
/* loaded from: classes.dex */
public final class bb5 {
    public final eb5 a;
    public final int b;
    public final int c;

    public bb5(eb5 eb5Var, int i, int i2) {
        eb5Var.getClass();
        this.a = eb5Var;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bb5)) {
            return false;
        }
        bb5 bb5Var = (bb5) obj;
        if (nb3.k(this.a, bb5Var.a) && this.b == bb5Var.b && this.c == bb5Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + lb1.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RARuntimeUserAchievement(userAchievement=");
        sb.append(this.a);
        sb.append(", progress=");
        sb.append(this.b);
        sb.append(", target=");
        return lb1.o(sb, this.c, ")");
    }
}
