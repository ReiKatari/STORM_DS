package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uj3  reason: default package */
/* loaded from: classes.dex */
public final class uj3 {
    public final nj3 a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public uj3(nj3 nj3Var, int i, int i2, int i3, int i4) {
        nj3Var.getClass();
        this.a = nj3Var;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uj3)) {
            return false;
        }
        uj3 uj3Var = (uj3) obj;
        if (this.a == uj3Var.a && this.b == uj3Var.b && this.c == uj3Var.c && this.d == uj3Var.d && this.e == uj3Var.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + lb1.a(this.d, lb1.a(this.c, lb1.a(this.b, this.a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LayoutComponentPositionEditorState(component=");
        sb.append(this.a);
        sb.append(", x=");
        sb.append(this.b);
        sb.append(", y=");
        lb1.x(sb, this.c, ", maxX=", this.d, ", maxY=");
        return lb1.o(sb, this.e, ")");
    }
}
