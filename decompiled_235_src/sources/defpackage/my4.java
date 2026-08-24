package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: my4  reason: default package */
/* loaded from: classes.dex */
public final class my4 {
    public int a;
    public int b;

    public my4(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof my4)) {
            return false;
        }
        my4 my4Var = (my4) obj;
        if (this.a == my4Var.a && this.b == my4Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return xg6.m(this.a, this.b, "Point(x=", ", y=", ")");
    }
}
