package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: cd3  reason: default package */
/* loaded from: classes.dex */
public final class cd3 {
    public final vc3 a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public cd3(vc3 vc3Var, int i, int i2, int i3, int i4) {
        vc3Var.getClass();
        this.a = vc3Var;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cd3)) {
            return false;
        }
        cd3 cd3Var = (cd3) obj;
        if (this.a == cd3Var.a && this.b == cd3Var.b && this.c == cd3Var.c && this.d == cd3Var.d && this.e == cd3Var.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + wh1.a(this.d, wh1.a(this.c, wh1.a(this.b, this.a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LayoutComponentPositionEditorState(component=");
        sb.append(this.a);
        sb.append(", x=");
        sb.append(this.b);
        sb.append(", y=");
        b31.A(sb, this.c, ", maxX=", this.d, ", maxY=");
        return wh1.m(sb, this.e, ")");
    }
}
