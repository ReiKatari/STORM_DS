package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: i63  reason: default package */
/* loaded from: classes.dex */
public final class i63 {
    public final b63 a;
    public final h63 b;
    public final h63 c;

    public i63(b63 b63Var, h63 h63Var, h63 h63Var2) {
        b63Var.getClass();
        h63Var.getClass();
        this.a = b63Var;
        this.b = h63Var;
        this.c = h63Var2;
    }

    public static i63 a(i63 i63Var, h63 h63Var, h63 h63Var2, int i) {
        b63 b63Var = i63Var.a;
        if ((i & 2) != 0) {
            h63Var = i63Var.b;
        }
        if ((i & 4) != 0) {
            h63Var2 = i63Var.c;
        }
        i63Var.getClass();
        b63Var.getClass();
        h63Var.getClass();
        h63Var2.getClass();
        return new i63(b63Var, h63Var, h63Var2);
    }

    public final boolean b() {
        h63 h63Var = this.b;
        g63 g63Var = g63.a;
        if (nb3.k(h63Var, g63Var) && nb3.k(this.c, g63Var)) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i63)) {
            return false;
        }
        i63 i63Var = (i63) obj;
        if (this.a == i63Var.a && nb3.k(this.b, i63Var.b) && nb3.k(this.c, i63Var.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return this.c.hashCode() + ((hashCode + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "InputConfig(input=" + this.a + ", assignment=" + this.b + ", altAssignment=" + this.c + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ i63(b63 b63Var, h63 h63Var, int i) {
        this(b63Var, r4 != 0 ? r0 : h63Var, r0);
        int i2 = i & 2;
        g63 g63Var = g63.a;
    }
}
