package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bt0  reason: default package */
/* loaded from: classes.dex */
public final class bt0 {
    public final int a;
    public final int b;

    public bt0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bt0)) {
            return false;
        }
        bt0 bt0Var = (bt0) obj;
        if (this.a == bt0Var.a && this.b == bt0Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CollectionInfo(rowCount=");
        sb.append(this.a);
        sb.append(", columnCount=");
        return xg6.q(sb, this.b, ')');
    }
}
