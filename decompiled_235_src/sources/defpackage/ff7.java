package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ff7 */
/* loaded from: classes.dex */
public final class ff7 {
    public final z66 a;
    public final z66 b;

    public ff7(z66 z66Var, z66 z66Var2) {
        z66Var.getClass();
        z66Var2.getClass();
        this.a = z66Var;
        this.b = z66Var2;
    }

    public static ff7 a(z66 z66Var, z66 z66Var2) {
        z66Var.getClass();
        z66Var2.getClass();
        return new ff7(z66Var, z66Var2);
    }

    public static /* synthetic */ ff7 b(ff7 ff7Var, z66 z66Var, z66 z66Var2, int i) {
        if ((i & 1) != 0) {
            z66Var = ff7Var.a;
        }
        if ((i & 2) != 0) {
            z66Var2 = ff7Var.b;
        }
        return a(z66Var, z66Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ff7)) {
            return false;
        }
        ff7 ff7Var = (ff7) obj;
        if (nb3.k(this.a, ff7Var.a) && nb3.k(this.b, ff7Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "UILayout(mainScreenLayout=" + this.a + ", secondaryScreenLayout=" + this.b + ")";
    }
}
