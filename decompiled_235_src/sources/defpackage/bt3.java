package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bt3  reason: default package */
/* loaded from: classes.dex */
public final class bt3 {
    public final boolean a;
    public final long b;
    public final long c;

    public bt3(long j, long j2, boolean z) {
        this.a = z;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof bt3) {
                bt3 bt3Var = (bt3) obj;
                if (this.a != bt3Var.a || this.b != bt3Var.b || this.c != bt3Var.c) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + i61.c(this.b, Boolean.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Decision(shouldLog=");
        sb.append(this.a);
        sb.append(", updateIndex=");
        sb.append(this.b);
        return lb1.r(sb, ", suppressedUpdates=", this.c, ")");
    }
}
