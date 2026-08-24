package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mk3  reason: default package */
/* loaded from: classes.dex */
public final class mk3 {
    public final int a;
    public final lk3 b;
    public final int c;
    public final int d;

    public mk3(int i, lk3 lk3Var, int i2, int i3) {
        lk3Var.getClass();
        this.a = i;
        this.b = lk3Var;
        this.c = i2;
        this.d = i3;
    }

    public static mk3 a(mk3 mk3Var) {
        lk3 lk3Var = mk3Var.b;
        int i = mk3Var.c;
        int i2 = mk3Var.d;
        mk3Var.getClass();
        lk3Var.getClass();
        return new mk3(-1, lk3Var, i, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mk3)) {
            return false;
        }
        mk3 mk3Var = (mk3) obj;
        if (this.a == mk3Var.a && this.b == mk3Var.b && this.c == mk3Var.c && this.d == mk3Var.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return Integer.hashCode(this.d) + lb1.a(this.c, (hashCode + (Integer.hashCode(this.a) * 31)) * 31, 31);
    }

    public final String toString() {
        return "LayoutDisplay(id=" + this.a + ", type=" + this.b + ", width=" + this.c + ", height=" + this.d + ")";
    }
}
