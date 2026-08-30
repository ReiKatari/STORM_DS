package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xi4  reason: default package */
/* loaded from: classes.dex */
public final class xi4 {
    public final ui a;
    public final int b;
    public final int c;

    public xi4(ui uiVar, int i, int i2) {
        this.a = uiVar;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof xi4) {
                xi4 xi4Var = (xi4) obj;
                if (this.a == xi4Var.a && this.b == xi4Var.b && this.c == xi4Var.c) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + wh1.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphIntrinsicInfo(intrinsics=");
        sb.append(this.a);
        sb.append(", startIndex=");
        sb.append(this.b);
        sb.append(", endIndex=");
        return ej6.g(sb, this.c, ')');
    }
}
