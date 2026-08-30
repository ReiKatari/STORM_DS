package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: t95  reason: default package */
/* loaded from: classes.dex */
public final class t95 {
    public final int a;
    public final String b;
    public final String c;

    public t95(String str, int i, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof t95) {
                t95 t95Var = (t95) obj;
                if (this.a != t95Var.a || !this.b.equals(t95Var.b) || !this.c.equals(t95Var.c)) {
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
        StringBuilder sb = new StringBuilder("Renderer2DBgLayerItem(bgIndex=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", description=");
        return b31.q(sb, this.c, ")");
    }
}
