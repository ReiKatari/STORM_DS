package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: f33  reason: default package */
/* loaded from: classes.dex */
public final class f33 {
    public final e33 a;
    public final int b;

    public f33(e33 e33Var, int i) {
        this.a = e33Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof f33) {
                f33 f33Var = (f33) obj;
                if (!this.a.equals(f33Var.a) || this.b != f33Var.b) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImageVectorEntry(imageVector=");
        sb.append(this.a);
        sb.append(", configFlags=");
        return xg6.q(sb, this.b, ')');
    }
}
