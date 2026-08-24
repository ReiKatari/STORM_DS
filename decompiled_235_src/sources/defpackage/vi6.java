package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vi6  reason: default package */
/* loaded from: classes.dex */
public final class vi6 {
    public final kt0 a;
    public final kt0 b;
    public final kt0 c;
    public final kt0 d;
    public final kt0 e;
    public final String f;

    public vi6(kt0 kt0Var, kt0 kt0Var2, kt0 kt0Var3, kt0 kt0Var4, kt0 kt0Var5, String str) {
        this.a = kt0Var;
        this.b = kt0Var2;
        this.c = kt0Var3;
        this.d = kt0Var4;
        this.e = kt0Var5;
        this.f = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof vi6) {
                vi6 vi6Var = (vi6) obj;
                if (!this.a.equals(vi6Var.a) || !this.b.equals(vi6Var.b) || !this.c.equals(vi6Var.c) || !this.d.equals(vi6Var.d) || !this.e.equals(vi6Var.e) || !this.f.equals(vi6Var.f)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f.hashCode() + i61.c(this.e.a, i61.c(this.d.a, i61.c(this.c.a, i61.c(this.b.a, Long.hashCode(this.a.a) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        return "SixTuple(first=" + this.a + ", second=" + this.b + ", third=" + this.c + ", fourth=" + this.d + ", fifth=" + this.e + ", sixth=" + ((Object) this.f) + ")";
    }
}
