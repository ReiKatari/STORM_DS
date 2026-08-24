package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: np3  reason: default package */
/* loaded from: classes.dex */
public final class np3 {
    public final int a;
    public final int b;

    public np3(int i, int i2) {
        boolean z;
        this.a = i;
        this.b = i2;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            s53.a("negative start index");
        }
        if (!(i2 >= i)) {
            s53.a("end index greater than start");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof np3)) {
            return false;
        }
        np3 np3Var = (np3) obj;
        if (this.a == np3Var.a && this.b == np3Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Interval(start=");
        sb.append(this.a);
        sb.append(", end=");
        return xg6.q(sb, this.b, ')');
    }
}
