package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: x95  reason: default package */
/* loaded from: classes.dex */
public final class x95 {
    public final int a;
    public final String b;
    public final String c;

    public x95(String str, int i, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof x95) {
                x95 x95Var = (x95) obj;
                if (this.a != x95Var.a || !this.b.equals(x95Var.b) || !this.c.equals(x95Var.c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.c.hashCode() + ej6.b(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Renderer2DObjectOrderItem(bucket=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", description=");
        return b31.q(sb, this.c, ")");
    }
}
