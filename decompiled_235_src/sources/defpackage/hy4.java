package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hy4  reason: default package */
/* loaded from: classes.dex */
public final class hy4 {
    public final cy4 a;
    public final ux4 b;

    public hy4(cy4 cy4Var, ux4 ux4Var) {
        this.a = cy4Var;
        this.b = ux4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hy4)) {
            return false;
        }
        hy4 hy4Var = (hy4) obj;
        if (nb3.k(this.b, hy4Var.b) && nb3.k(this.a, hy4Var.a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        cy4 cy4Var = this.a;
        if (cy4Var != null) {
            i = cy4Var.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        ux4 ux4Var = this.b;
        if (ux4Var != null) {
            i2 = ux4Var.hashCode();
        }
        return i3 + i2;
    }

    public final String toString() {
        return "PlatformTextStyle(spanStyle=" + this.a + ", paragraphSyle=" + this.b + ')';
    }
}
