package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gw7  reason: default package */
/* loaded from: classes.dex */
public final class gw7 {
    public final String a;
    public final int b;

    public gw7(String str, int i) {
        str.getClass();
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gw7)) {
            return false;
        }
        gw7 gw7Var = (gw7) obj;
        if (nb3.k(this.a, gw7Var.a) && this.b == gw7Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WorkGenerationalId(workSpecId=");
        sb.append(this.a);
        sb.append(", generation=");
        return xg6.q(sb, this.b, ')');
    }
}
