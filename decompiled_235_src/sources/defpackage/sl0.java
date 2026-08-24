package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sl0  reason: default package */
/* loaded from: classes.dex */
public final class sl0 {
    public final e40 a;
    public final qn2 b;
    public final rc2 c;
    public final boolean d;

    public sl0(e40 e40Var, qn2 qn2Var, rc2 rc2Var, boolean z) {
        this.a = e40Var;
        this.b = qn2Var;
        this.c = rc2Var;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof sl0) {
                sl0 sl0Var = (sl0) obj;
                if (!this.a.equals(sl0Var.a) || !this.b.equals(sl0Var.b) || !nb3.k(this.c, sl0Var.c) || this.d != sl0Var.d) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        return Boolean.hashCode(this.d) + ((hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChangeSize(alignment=");
        sb.append(this.a);
        sb.append(", size=");
        sb.append(this.b);
        sb.append(", animationSpec=");
        sb.append(this.c);
        sb.append(", clip=");
        return xg6.r(sb, this.d, ')');
    }
}
