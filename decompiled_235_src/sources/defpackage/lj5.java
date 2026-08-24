package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lj5  reason: default package */
/* loaded from: classes.dex */
public final class lj5 {
    public final int a;
    public final String b;
    public final String c;

    public lj5(String str, int i, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof lj5) {
                lj5 lj5Var = (lj5) obj;
                if (this.a != lj5Var.a || !this.b.equals(lj5Var.b) || !this.c.equals(lj5Var.c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.c.hashCode() + xg6.d(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Renderer2DBgLayerItem(bgIndex=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", description=");
        return i61.n(sb, this.c, ")");
    }
}
