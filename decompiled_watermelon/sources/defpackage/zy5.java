package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: zy5  reason: default package */
/* loaded from: classes.dex */
public final class zy5 {
    public final dp2 a;
    public final long b;
    public final yy5 c;
    public final boolean d;

    public zy5(dp2 dp2Var, long j, yy5 yy5Var, boolean z) {
        this.a = dp2Var;
        this.b = j;
        this.c = yy5Var;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof zy5) {
                zy5 zy5Var = (zy5) obj;
                if (this.a != zy5Var.a || !mb4.b(this.b, zy5Var.b) || this.c != zy5Var.c || this.d != zy5Var.d) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int c = b31.c(this.b, this.a.hashCode() * 31, 31);
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionHandleInfo(handle=");
        sb.append(this.a);
        sb.append(", position=");
        sb.append((Object) mb4.g(this.b));
        sb.append(", anchor=");
        sb.append(this.c);
        sb.append(", visible=");
        return ej6.h(sb, this.d, ')');
    }
}
